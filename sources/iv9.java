// default package

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
import org.telegram.messenger.beta.R;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
public abstract class iv9 extends IntentService {
    public final boolean a;
    public final short b;
    public final Intent c;
    public final Intent d;
    public hv9 e;
    public hv9 f;

    public iv9() {
        super("SearchActionVerificationClientService");
        this.c = new Intent("com.google.android.googlequicksearchbox.SEARCH_ACTION_VERIFICATION_SERVICE").setPackage("com.google.android.googlequicksearchbox");
        this.d = new Intent("com.google.android.apps.assistant.go.verification.VERIFICATION_SERVICE").setPackage("com.google.android.apps.assistant");
        this.a = !"user".equals(Build.TYPE);
        this.b = (short) 1000;
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

    /* JADX WARN: Removed duplicated region for block: B:36:0x0190  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean b(String str, Intent intent, hv9 hv9Var) {
        String message;
        boolean b;
        boolean equals = str.equals("com.google.android.googlequicksearchbox");
        boolean z = this.a;
        if (equals || str.equals("com.google.android.apps.assistant")) {
            if (!"user".equals(Build.TYPE) || jye.a(this, str)) {
                if (intent.hasExtra("SearchActionVerificationClientExtraIntent")) {
                    Intent intent2 = (Intent) intent.getParcelableExtra("SearchActionVerificationClientExtraIntent");
                    if (z) {
                        Log.d("SAVerificationClientU", "Intent:");
                        String valueOf = String.valueOf(intent2);
                        StringBuilder sb = new StringBuilder(valueOf.length() + 1);
                        sb.append("\t");
                        sb.append(valueOf);
                        Log.d("SAVerificationClientU", sb.toString());
                        Bundle extras = intent2.getExtras();
                        if (extras != null) {
                            Log.d("SAVerificationClientU", "Extras:");
                            for (String str2 : extras.keySet()) {
                                Log.d("SAVerificationClientU", String.format("\t%s: %s", str2, extras.get(str2)));
                            }
                        }
                    }
                    if (hv9Var.a()) {
                        try {
                            dl5 dl5Var = (dl5) hv9Var.a;
                            dl5Var.getClass();
                            Parcel obtain = Parcel.obtain();
                            obtain.writeInterfaceToken("com.google.android.search.verification.api.ISearchActionVerificationService");
                            Parcel a = dl5Var.a(obtain, 2);
                            int readInt = a.readInt();
                            a.recycle();
                            Log.i("SAVerificationClientS", str + " Service API version: " + readInt);
                            b = hv9Var.b(intent2, new Bundle());
                            Typeface typeface = hl.a;
                            if (b) {
                                hl.c3(new hk(intent2, r2));
                            }
                            message = "";
                        } catch (RemoteException e) {
                            String valueOf2 = String.valueOf(e.getMessage());
                            Log.e("SAVerificationClientS", valueOf2.length() != 0 ? "Remote exception: ".concat(valueOf2) : new String("Remote exception: "));
                            message = e.getMessage();
                        } catch (Exception e2) {
                            String valueOf3 = String.valueOf(e2.getMessage());
                            Log.e("SAVerificationClientS", valueOf3.length() != 0 ? "Exception: ".concat(valueOf3) : new String("Exception: "));
                            message = e2.getMessage();
                        }
                        if (intent2.hasExtra("com.google.android.voicesearch.extra.SEND_MESSAGE_RESULT_RECEIVER")) {
                            ResultReceiver resultReceiver = (ResultReceiver) intent2.getExtras().getParcelable("com.google.android.voicesearch.extra.SEND_MESSAGE_RESULT_RECEIVER");
                            Bundle bundle = new Bundle();
                            bundle.putString("com.google.android.voicesearch.extra.ERROR_MESSAGE", message);
                            resultReceiver.send(b ? (byte) 0 : (byte) -1, bundle);
                        }
                        return b;
                    }
                    Object[] objArr = {str, intent};
                    message = "VerificationService is not connected to %s, unable to check intent: %s";
                    Log.e("SAVerificationClientS", String.format("VerificationService is not connected to %s, unable to check intent: %s", objArr));
                    b = false;
                    if (intent2.hasExtra("com.google.android.voicesearch.extra.SEND_MESSAGE_RESULT_RECEIVER")) {
                    }
                    return b;
                }
                if (z) {
                    String valueOf4 = String.valueOf(intent);
                    StringBuilder sb2 = new StringBuilder(valueOf4.length() + 28);
                    sb2.append("No extra, nothing to check: ");
                    sb2.append(valueOf4);
                    Log.d("SAVerificationClientS", sb2.toString());
                }
            } else if (z) {
                Log.d("SAVerificationClientS", "Cannot verify the intent with package " + str + " in unsafe mode.");
                return false;
            }
        } else if (z) {
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
        this.e = new hv9(this);
        if (a("com.google.android.googlequicksearchbox") && (!"user".equals(Build.TYPE) || jye.a(this, "com.google.android.googlequicksearchbox"))) {
            bindService(this.c, this.e, 1);
        }
        this.f = new hv9(this);
        if (a("com.google.android.apps.assistant") && (!"user".equals(Build.TYPE) || jye.a(this, "com.google.android.apps.assistant"))) {
            bindService(this.d, this.f, 1);
        }
        if (Build.VERSION.SDK_INT >= 26) {
            gk.g();
            NotificationChannel notificationChannel = new NotificationChannel("Assistant_verifier", getApplicationContext().getResources().getString(R.drawable.$avd_flip__0), 2);
            notificationChannel.enableVibration(false);
            notificationChannel.enableLights(false);
            notificationChannel.setShowBadge(false);
            ((NotificationManager) getApplicationContext().getSystemService(NotificationManager.class)).createNotificationChannel(notificationChannel);
            wn7 wn7Var = new wn7(getApplicationContext(), "Assistant_verifier");
            wn7Var.q = "Assistant_verifier";
            wn7Var.e = wn7.c(getApplicationContext().getResources().getString(R.drawable.$avd_flip__1));
            wn7Var.F.icon = android.R.drawable.ic_dialog_email;
            wn7Var.j = -2;
            wn7Var.x = 1;
            startForeground(10000, wn7Var.b());
        }
    }

    @Override // android.app.IntentService, android.app.Service
    public final void onDestroy() {
        if (this.a) {
            Log.d("SAVerificationClientS", "onDestroy");
        }
        super.onDestroy();
        if (this.e.a()) {
            unbindService(this.e);
        }
        if (this.f.a()) {
            unbindService(this.f);
        }
        if (Build.VERSION.SDK_INT >= 26) {
            stopForeground(true);
        }
    }

    @Override // android.app.IntentService
    public final void onHandleIntent(Intent intent) {
        boolean z = this.a;
        if (intent == null) {
            if (z) {
                Log.d("SAVerificationClientS", "Unable to verify null intent");
                return;
            }
            return;
        }
        long nanoTime = System.nanoTime();
        while (true) {
            boolean a = a("com.google.android.googlequicksearchbox");
            boolean z2 = true;
            boolean z3 = !a || this.e.a();
            if (z) {
                Log.d("SAVerificationClientS", "GSA app com.google.android.googlequicksearchbox installed: " + a + " connected " + this.e.a());
            }
            boolean a2 = a("com.google.android.apps.assistant");
            if (a2 && !this.f.a()) {
                z2 = false;
            }
            if (z) {
                Log.d("SAVerificationClientS", "AssistantGo app com.google.android.apps.assistant installed: " + a2 + " connected " + this.f.a());
            }
            if ((!z3 || !z2) && System.nanoTime() - nanoTime < this.b * 1000000) {
                try {
                    Thread.sleep(50L);
                } catch (InterruptedException e) {
                    if (z) {
                        String valueOf = String.valueOf(e);
                        StringBuilder sb = new StringBuilder(valueOf.length() + 33);
                        sb.append("Unexpected InterruptedException: ");
                        sb.append(valueOf);
                        Log.d("SAVerificationClientS", sb.toString());
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
