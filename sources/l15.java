// default package

import android.app.AlertDialog;
import android.app.KeyguardManager;
import android.content.DialogInterface;
import android.content.Intent;
import android.hardware.biometrics.BiometricPrompt;
import android.hardware.fingerprint.FingerprintManager;
import android.os.CancellationSignal;
import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.CountDownLatch;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public final class l15 {
    public final CountDownLatch a = new CountDownLatch(1);
    public volatile boolean b;
    public String c;
    public String d;
    public LaunchActivity e;
    public boolean f;
    public int g;
    public CancellationSignal h;
    public AlertDialog i;

    public final void a() {
        if (this.f || !f()) {
            return;
        }
        this.f = true;
        e();
        try {
            KeyguardManager keyguardManager = (KeyguardManager) this.e.getSystemService("keyguard");
            Intent createConfirmDeviceCredentialIntent = keyguardManager != null ? keyguardManager.createConfirmDeviceCredentialIntent(k96.M0(2131742707, null), null) : null;
            if (createConfirmDeviceCredentialIntent == null) {
                c("AUTH_UNAVAILABLE");
                return;
            }
            int i = bje.a;
            int i2 = i + 1;
            bje.a = i2;
            this.g = i;
            if (i2 > 22399) {
                bje.a = 22336;
            }
            this.e.startActivityForResult(createConfirmDeviceCredentialIntent, i);
        } catch (Exception e) {
            fa4.g(e, true);
            c("AUTH_UNAVAILABLE");
        }
    }

    public final void b() {
        FingerprintManager fingerprintManager = (FingerprintManager) this.e.getSystemService("fingerprint");
        if (fingerprintManager == null || !fingerprintManager.isHardwareDetected() || !fingerprintManager.hasEnrolledFingerprints()) {
            a();
            return;
        }
        this.h = new CancellationSignal();
        final byte b = 0;
        final byte b2 = 1;
        this.i = new AlertDialog.Builder(this.e).setTitle(k96.M0(2131742707, null)).setMessage(k96.M0(2131742726, null)).setNegativeButton(k96.M0(2131752577, null), new DialogInterface.OnClickListener(this) { // from class: i15
            public final /* synthetic */ l15 b;

            {
                this.b = this;
            }

            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                byte b3 = b;
                l15 l15Var = this.b;
                switch (b3) {
                    case 0:
                        l15Var.c("AUTH_CANCELED");
                        break;
                    default:
                        l15Var.a();
                        break;
                }
            }
        }).setPositiveButton(k96.M0(2131742702, null), new DialogInterface.OnClickListener(this) { // from class: i15
            public final /* synthetic */ l15 b;

            {
                this.b = this;
            }

            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                byte b3 = b2;
                l15 l15Var = this.b;
                switch (b3) {
                    case 0:
                        l15Var.c("AUTH_CANCELED");
                        break;
                    default:
                        l15Var.a();
                        break;
                }
            }
        }).setOnCancelListener(new ur0(this, (byte) 9)).show();
        fingerprintManager.authenticate(null, this.h, 0, new k15(this), new Handler(Looper.getMainLooper()));
    }

    public final void c(String str) {
        CountDownLatch countDownLatch = this.a;
        if (countDownLatch.getCount() == 0) {
            return;
        }
        this.c = str;
        countDownLatch.countDown();
    }

    public final void d() {
        this.h = new CancellationSignal();
        new BiometricPrompt.Builder(this.e).setTitle(k96.M0(2131742707, null)).setAllowedAuthenticators(32783).build().authenticate(this.h, this.e.getMainExecutor(), new j15(this));
    }

    public final void e() {
        try {
            CancellationSignal cancellationSignal = this.h;
            if (cancellationSignal != null) {
                cancellationSignal.cancel();
            }
        } catch (Exception e) {
            fa4.g(e, true);
        }
        try {
            AlertDialog alertDialog = this.i;
            if (alertDialog != null) {
                alertDialog.dismiss();
            }
        } catch (Exception e2) {
            fa4.g(e2, true);
        }
        this.i = null;
    }

    public final boolean f() {
        return (this.b || this.a.getCount() == 0) ? false : true;
    }
}
