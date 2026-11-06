package f9;

import a8.y9;
import android.app.IntentService;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.graphics.Typeface;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;
import android.os.ResultReceiver;
import android.util.Log;
import e0.q;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.g0;
import org.telegram.messenger.s;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes.dex */
public abstract class c extends IntentService {
    public final boolean a;
    public final long b;
    public final Intent c;
    public final Intent d;
    public b e;
    public b f;

    public c() {
        super("SearchActionVerificationClientService");
        this.c = new Intent("com.google.android.googlequicksearchbox.SEARCH_ACTION_VERIFICATION_SERVICE").setPackage("com.google.android.googlequicksearchbox");
        this.d = new Intent("com.google.android.apps.assistant.go.verification.VERIFICATION_SERVICE").setPackage("com.google.android.apps.assistant");
        this.a = !"user".equals(Build.TYPE);
        this.b = 1000L;
    }

    public final boolean a(String str) {
        ApplicationInfo applicationInfo;
        try {
            PackageInfo packageInfo = getPackageManager().getPackageInfo(str, 0);
            if (packageInfo != null && (applicationInfo = packageInfo.applicationInfo) != null) {
                if (applicationInfo.enabled) {
                    return true;
                }
            }
            return false;
        } catch (PackageManager.NameNotFoundException e10) {
            Log.w("SAVerificationClientS", "Couldn't find package name ".concat(str), e10);
            return false;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x0194  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean b(String str, Intent intent, b bVar) {
        String message;
        boolean b10;
        boolean equals = str.equals("com.google.android.googlequicksearchbox");
        boolean z9 = this.a;
        if (equals || str.equals("com.google.android.apps.assistant")) {
            if (!"user".equals(Build.TYPE) || y9.a(this, str)) {
                if (intent.hasExtra("SearchActionVerificationClientExtraIntent")) {
                    Intent intent2 = (Intent) intent.getParcelableExtra("SearchActionVerificationClientExtraIntent");
                    if (z9) {
                        Log.d("SAVerificationClientU", "Intent:");
                        String valueOf = String.valueOf(intent2);
                        StringBuilder sb2 = new StringBuilder(valueOf.length() + 1);
                        sb2.append("\t");
                        sb2.append(valueOf);
                        Log.d("SAVerificationClientU", sb2.toString());
                        Bundle extras = intent2.getExtras();
                        if (extras != null) {
                            Log.d("SAVerificationClientU", "Extras:");
                            for (String str2 : extras.keySet()) {
                                Log.d("SAVerificationClientU", String.format("\t%s: %s", str2, extras.get(str2)));
                            }
                        }
                    }
                    if (b.a(bVar)) {
                        try {
                            e9.a aVar = (e9.a) bVar.a;
                            aVar.getClass();
                            Parcel obtain = Parcel.obtain();
                            obtain.writeInterfaceToken("com.google.android.search.verification.api.ISearchActionVerificationService");
                            Parcel H0 = aVar.H0(obtain, 2);
                            int readInt = H0.readInt();
                            H0.recycle();
                            Log.i("SAVerificationClientS", str + " Service API version: " + readInt);
                            b10 = bVar.b(intent2, new Bundle());
                            Typeface typeface = g0.a;
                            if (b10) {
                                g0.h3(new s(intent2, r2));
                            }
                            message = "";
                        } catch (RemoteException e10) {
                            String valueOf2 = String.valueOf(e10.getMessage());
                            Log.e("SAVerificationClientS", valueOf2.length() != 0 ? "Remote exception: ".concat(valueOf2) : new String("Remote exception: "));
                            message = e10.getMessage();
                        } catch (Exception e11) {
                            String valueOf3 = String.valueOf(e11.getMessage());
                            Log.e("SAVerificationClientS", valueOf3.length() != 0 ? "Exception: ".concat(valueOf3) : new String("Exception: "));
                            message = e11.getMessage();
                        }
                        if (intent2.hasExtra("com.google.android.voicesearch.extra.SEND_MESSAGE_RESULT_RECEIVER")) {
                            ResultReceiver resultReceiver = (ResultReceiver) intent2.getExtras().getParcelable("com.google.android.voicesearch.extra.SEND_MESSAGE_RESULT_RECEIVER");
                            Bundle bundle = new Bundle();
                            bundle.putString("com.google.android.voicesearch.extra.ERROR_MESSAGE", message);
                            resultReceiver.send(b10 ? 0 : -1, bundle);
                        }
                        return b10;
                    }
                    Object[] objArr = {str, intent};
                    message = "VerificationService is not connected to %s, unable to check intent: %s";
                    Log.e("SAVerificationClientS", String.format("VerificationService is not connected to %s, unable to check intent: %s", objArr));
                    b10 = false;
                    if (intent2.hasExtra("com.google.android.voicesearch.extra.SEND_MESSAGE_RESULT_RECEIVER")) {
                    }
                    return b10;
                }
                if (z9) {
                    String valueOf4 = String.valueOf(intent);
                    StringBuilder sb3 = new StringBuilder(valueOf4.length() + 28);
                    sb3.append("No extra, nothing to check: ");
                    sb3.append(valueOf4);
                    Log.d("SAVerificationClientS", sb3.toString());
                }
            } else if (z9) {
                Log.d("SAVerificationClientS", "Cannot verify the intent with package " + str + " in unsafe mode.");
                return false;
            }
        } else if (z9) {
            Log.d("SAVerificationClientS", "Unsupported package " + str + " for verification.");
            return false;
        }
        return false;
    }

    @Override // android.app.IntentService, android.app.Service
    public final void onCreate() {
        if (this.a) {
            Log.d("SAVerificationClientS", "onCreate");
        }
        super.onCreate();
        this.e = new b(this);
        if (a("com.google.android.googlequicksearchbox") && (!"user".equals(Build.TYPE) || y9.a(this, "com.google.android.googlequicksearchbox"))) {
            bindService(this.c, this.e, 1);
        }
        this.f = new b(this);
        if (a("com.google.android.apps.assistant") && (!"user".equals(Build.TYPE) || y9.a(this, "com.google.android.apps.assistant"))) {
            bindService(this.d, this.f, 1);
        }
        if (Build.VERSION.SDK_INT >= 26) {
            NotificationChannel notificationChannel = new NotificationChannel("Assistant_verifier", getApplicationContext().getResources().getString(R.drawable.$avd_flip__0), 2);
            notificationChannel.enableVibration(false);
            notificationChannel.enableLights(false);
            notificationChannel.setShowBadge(false);
            ((NotificationManager) getApplicationContext().getSystemService(NotificationManager.class)).createNotificationChannel(notificationChannel);
            q qVar = new q(getApplicationContext(), "Assistant_verifier");
            qVar.q = "Assistant_verifier";
            qVar.e = q.d(getApplicationContext().getResources().getString(R.drawable.$avd_flip__1));
            qVar.F.icon = android.R.drawable.ic_dialog_email;
            qVar.j = -2;
            qVar.x = 1;
            startForeground(10000, qVar.b());
        }
    }

    @Override // android.app.IntentService, android.app.Service
    public final void onDestroy() {
        if (this.a) {
            Log.d("SAVerificationClientS", "onDestroy");
        }
        super.onDestroy();
        if (b.a(this.e)) {
            unbindService(this.e);
        }
        if (b.a(this.f)) {
            unbindService(this.f);
        }
        if (Build.VERSION.SDK_INT >= 26) {
            stopForeground(true);
        }
    }

    @Override // android.app.IntentService
    public final void onHandleIntent(Intent intent) {
        boolean z9 = this.a;
        if (intent == null) {
            if (z9) {
                Log.d("SAVerificationClientS", "Unable to verify null intent");
                return;
            }
            return;
        }
        long nanoTime = System.nanoTime();
        while (true) {
            boolean a10 = a("com.google.android.googlequicksearchbox");
            boolean z10 = true;
            boolean z11 = !a10 || b.a(this.e);
            if (z9) {
                Log.d("SAVerificationClientS", "GSA app com.google.android.googlequicksearchbox installed: " + a10 + " connected " + b.a(this.e));
            }
            boolean a11 = a("com.google.android.apps.assistant");
            if (a11 && !b.a(this.f)) {
                z10 = false;
            }
            if (z9) {
                Log.d("SAVerificationClientS", "AssistantGo app com.google.android.apps.assistant installed: " + a11 + " connected " + b.a(this.f));
            }
            if ((!z11 || !z10) && System.nanoTime() - nanoTime < this.b * 1000000) {
                try {
                    Thread.sleep(50L);
                } catch (InterruptedException e10) {
                    if (z9) {
                        String valueOf = String.valueOf(e10);
                        StringBuilder sb2 = new StringBuilder(valueOf.length() + 33);
                        sb2.append("Unexpected InterruptedException: ");
                        sb2.append(valueOf);
                        Log.d("SAVerificationClientS", sb2.toString());
                    }
                }
            }
        }
        if (b("com.google.android.googlequicksearchbox", intent, this.e)) {
            Log.i("SAVerificationClientS", "Verified the intent with GSA.");
            return;
        }
        Log.i("SAVerificationClientS", "Unable to verify the intent with GSA.");
        if (b("com.google.android.apps.assistant", intent, this.f)) {
            Log.i("SAVerificationClientS", "Verified the intent with Assistant Go.");
        } else {
            Log.i("SAVerificationClientS", "Unable to verify the intent with Assistant Go.");
        }
    }
}
