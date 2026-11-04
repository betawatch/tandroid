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
import b8.vf;
import java.util.concurrent.CountDownLatch;
import org.telegram.messenger.bd;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class t0 {
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
                intent = keyguardManager.createConfirmDeviceCredentialIntent(bd.M0(2131742980, null), null);
            }
            if (intent == null) {
                c("AUTH_UNAVAILABLE");
                return;
            }
            int i3 = vf.a;
            int i10 = i3 + 1;
            vf.a = i10;
            this.g = i3;
            if (i10 > 22399) {
                vf.a = 22336;
            }
            this.e.startActivityForResult(intent, i3);
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
        final int i3 = 0;
        final int i10 = 1;
        this.i = new AlertDialog.Builder(this.e).setTitle(bd.M0(2131742980, null)).setMessage(bd.M0(2131742999, null)).setNegativeButton(bd.M0(2131752589, null), new DialogInterface.OnClickListener(this) { // from class: org.telegram.ui.Wallet.q0
            public final /* synthetic */ t0 b;

            {
                this.b = this;
            }

            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i11) {
                switch (i3) {
                    case 0:
                        this.b.c("AUTH_CANCELED");
                        break;
                    default:
                        this.b.a();
                        break;
                }
            }
        }).setPositiveButton(bd.M0(2131742975, null), new DialogInterface.OnClickListener(this) { // from class: org.telegram.ui.Wallet.q0
            public final /* synthetic */ t0 b;

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
        }).setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: org.telegram.ui.Wallet.r0
            @Override // android.content.DialogInterface.OnCancelListener
            public final void onCancel(DialogInterface dialogInterface) {
                t0.this.c("AUTH_CANCELED");
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
        new BiometricPrompt.Builder(this.e).setTitle(bd.M0(2131742980, null)).setAllowedAuthenticators(32783).build().authenticate(this.h, this.e.getMainExecutor(), new s0(this));
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
