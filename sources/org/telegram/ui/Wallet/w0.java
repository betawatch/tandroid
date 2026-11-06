package org.telegram.ui.Wallet;

import android.app.AlertDialog;
import android.app.KeyguardManager;
import android.content.DialogInterface;
import android.content.Intent;
import android.hardware.biometrics.BiometricPrompt;
import android.hardware.fingerprint.FingerprintManager;
import android.os.CancellationSignal;
import android.os.Handler;
import android.os.Looper;
import c8.va;
import java.util.concurrent.CountDownLatch;
import org.telegram.messenger.hd;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes4.dex */
public final class w0 {
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
            Intent intent = null;
            if (keyguardManager != null) {
                intent = keyguardManager.createConfirmDeviceCredentialIntent(hd.M0(2131742971, null), null);
            }
            if (intent == null) {
                c("AUTH_UNAVAILABLE");
                return;
            }
            int i7 = va.a;
            int i10 = i7 + 1;
            va.a = i10;
            this.g = i7;
            if (i10 > 22399) {
                va.a = 22336;
            }
            this.e.startActivityForResult(intent, i7);
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
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
        final int i7 = 0;
        final int i10 = 1;
        this.i = new AlertDialog.Builder(this.e).setTitle(hd.M0(2131742971, null)).setMessage(hd.M0(2131742990, null)).setNegativeButton(hd.M0(2131752589, null), new DialogInterface.OnClickListener(this) { // from class: org.telegram.ui.Wallet.t0
            public final /* synthetic */ w0 b;

            {
                this.b = this;
            }

            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i11) {
                switch (i7) {
                    case 0:
                        this.b.c("AUTH_CANCELED");
                        break;
                    default:
                        this.b.a();
                        break;
                }
            }
        }).setPositiveButton(hd.M0(2131742966, null), new DialogInterface.OnClickListener(this) { // from class: org.telegram.ui.Wallet.t0
            public final /* synthetic */ w0 b;

            {
                this.b = this;
            }

            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i11) {
                switch (i10) {
                    case 0:
                        this.b.c("AUTH_CANCELED");
                        break;
                    default:
                        this.b.a();
                        break;
                }
            }
        }).setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: org.telegram.ui.Wallet.u0
            @Override // android.content.DialogInterface.OnCancelListener
            public final void onCancel(DialogInterface dialogInterface) {
                w0.this.c("AUTH_CANCELED");
            }
        }).show();
        fingerprintManager.authenticate(null, this.h, 0, new k0.a(this, i10), new Handler(Looper.getMainLooper()));
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
        new BiometricPrompt.Builder(this.e).setTitle(hd.M0(2131742971, null)).setAllowedAuthenticators(32783).build().authenticate(this.h, this.e.getMainExecutor(), new v0(this));
    }

    public final void e() {
        try {
            CancellationSignal cancellationSignal = this.h;
            if (cancellationSignal != null) {
                cancellationSignal.cancel();
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
        try {
            AlertDialog alertDialog = this.i;
            if (alertDialog != null) {
                alertDialog.dismiss();
            }
        } catch (Exception e11) {
            org.telegram.messenger.a8.g(e11, true);
        }
        this.i = null;
    }

    public final boolean f() {
        return (this.b || this.a.getCount() == 0) ? false : true;
    }
}
