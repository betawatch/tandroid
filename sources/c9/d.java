package c9;

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
import android.support.v4.app.NotificationCompat;
import android.util.Log;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.i0;
import org.telegram.messenger.t;
import v7.f5;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public abstract class d extends IntentService {
    public final boolean a;
    public final long b;
    public final Intent c;
    public final Intent d;
    public c e;
    public c f;

    public d() {
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
        } catch (PackageManager.NameNotFoundException e) {
            Log.w("SAVerificationClientS", "Couldn't find package name ".concat(str), e);
            return false;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x0194  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean b(String str, Intent intent, c cVar) {
        String message;
        boolean b10;
        boolean equals = str.equals("com.google.android.googlequicksearchbox");
        boolean z10 = this.a;
        if (equals || str.equals("com.google.android.apps.assistant")) {
            if (!"user".equals(Build.TYPE) || f5.a(this, str)) {
                if (intent.hasExtra("SearchActionVerificationClientExtraIntent")) {
                    Intent intent2 = (Intent) intent.getParcelableExtra("SearchActionVerificationClientExtraIntent");
                    if (z10) {
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
                    if (c.a(cVar)) {
                        try {
                            b9.a aVar = (b9.a) cVar.a;
                            aVar.getClass();
                            Parcel obtain = Parcel.obtain();
                            obtain.writeInterfaceToken("com.google.android.search.verification.api.ISearchActionVerificationService");
                            Parcel H0 = aVar.H0(obtain, 2);
                            int readInt = H0.readInt();
                            H0.recycle();
                            Log.i("SAVerificationClientS", str + " Service API version: " + readInt);
                            b10 = cVar.b(intent2, new Bundle());
                            Typeface typeface = i0.a;
                            if (b10) {
                                i0.g3(new t(intent2, r2));
                            }
                            message = "";
                        } catch (RemoteException e) {
                            String valueOf2 = String.valueOf(e.getMessage());
                            Log.e("SAVerificationClientS", valueOf2.length() != 0 ? "Remote exception: ".concat(valueOf2) : new String("Remote exception: "));
                            message = e.getMessage();
                        } catch (Exception e7) {
                            String valueOf3 = String.valueOf(e7.getMessage());
                            Log.e("SAVerificationClientS", valueOf3.length() != 0 ? "Exception: ".concat(valueOf3) : new String("Exception: "));
                            message = e7.getMessage();
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
                if (z10) {
                    String valueOf4 = String.valueOf(intent);
                    StringBuilder sb3 = new StringBuilder(valueOf4.length() + 28);
                    sb3.append("No extra, nothing to check: ");
                    sb3.append(valueOf4);
                    Log.d("SAVerificationClientS", sb3.toString());
                }
            } else if (z10) {
                Log.d("SAVerificationClientS", "Cannot verify the intent with package " + str + " in unsafe mode.");
                return false;
            }
        } else if (z10) {
            Log.d("SAVerificationClientS", "Unsupported package " + str + " for verification.");
            return false;
        }
        return false;
    }

    public final void c() {
        b.e();
        NotificationChannel c10 = b.c(getApplicationContext().getResources().getString(R.drawable.$avd_flip__0));
        c10.enableVibration(false);
        c10.enableLights(false);
        c10.setShowBadge(false);
        ((NotificationManager) getApplicationContext().getSystemService(NotificationManager.class)).createNotificationChannel(c10);
        startForeground(10000, new NotificationCompat.Builder(getApplicationContext(), "Assistant_verifier").setGroup("Assistant_verifier").setContentTitle(getApplicationContext().getResources().getString(R.drawable.$avd_flip__1)).setSmallIcon(android.R.drawable.ic_dialog_email).setPriority(-2).setVisibility(1).build());
    }

    @Override // android.app.IntentService, android.app.Service
    public final void onCreate() {
        if (this.a) {
            Log.d("SAVerificationClientS", "onCreate");
        }
        super.onCreate();
        this.e = new c(this);
        if (a("com.google.android.googlequicksearchbox") && (!"user".equals(Build.TYPE) || f5.a(this, "com.google.android.googlequicksearchbox"))) {
            bindService(this.c, this.e, 1);
        }
        this.f = new c(this);
        if (a("com.google.android.apps.assistant") && (!"user".equals(Build.TYPE) || f5.a(this, "com.google.android.apps.assistant"))) {
            bindService(this.d, this.f, 1);
        }
        if (Build.VERSION.SDK_INT >= 26) {
            c();
        }
    }

    @Override // android.app.IntentService, android.app.Service
    public final void onDestroy() {
        if (this.a) {
            Log.d("SAVerificationClientS", "onDestroy");
        }
        super.onDestroy();
        if (c.a(this.e)) {
            unbindService(this.e);
        }
        if (c.a(this.f)) {
            unbindService(this.f);
        }
        if (Build.VERSION.SDK_INT >= 26) {
            stopForeground(true);
        }
    }

    @Override // android.app.IntentService
    public final void onHandleIntent(Intent intent) {
        boolean z10 = this.a;
        if (intent == null) {
            if (z10) {
                Log.d("SAVerificationClientS", "Unable to verify null intent");
                return;
            }
            return;
        }
        long nanoTime = System.nanoTime();
        while (true) {
            boolean a2 = a("com.google.android.googlequicksearchbox");
            boolean z11 = true;
            boolean z12 = !a2 || c.a(this.e);
            if (z10) {
                Log.d("SAVerificationClientS", "GSA app com.google.android.googlequicksearchbox installed: " + a2 + " connected " + c.a(this.e));
            }
            boolean a10 = a("com.google.android.apps.assistant");
            if (a10 && !c.a(this.f)) {
                z11 = false;
            }
            if (z10) {
                Log.d("SAVerificationClientS", "AssistantGo app com.google.android.apps.assistant installed: " + a10 + " connected " + c.a(this.f));
            }
            if ((!z12 || !z11) && System.nanoTime() - nanoTime < this.b * 1000000) {
                try {
                    Thread.sleep(50L);
                } catch (InterruptedException e) {
                    if (z10) {
                        String valueOf = String.valueOf(e);
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
