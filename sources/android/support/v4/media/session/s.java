package android.support.v4.media.session;

import android.content.Intent;
import android.media.session.MediaSession;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.ResultReceiver;
import android.view.KeyEvent;
import android.view.ViewConfiguration;
import java.lang.ref.WeakReference;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public abstract class s {
    public final /* synthetic */ int a;
    public final Object b;
    public boolean c;
    public WeakReference d;
    public final MediaSession.Callback e;
    public Handler f;

    public s(int i10) {
        this.a = i10;
        switch (i10) {
            case 1:
                this.b = new Object();
                this.e = new r(this, 1);
                this.d = new WeakReference(null);
                break;
            default:
                this.b = new Object();
                this.e = new r(this, 0);
                this.d = new WeakReference(null);
                break;
        }
    }

    private boolean j(Intent intent) {
        u uVar;
        q qVar;
        KeyEvent keyEvent;
        if (Build.VERSION.SDK_INT < 27) {
            synchronized (this.b) {
                uVar = (u) this.d.get();
                qVar = (q) this.f;
            }
            if (uVar != null && qVar != null && (keyEvent = (KeyEvent) intent.getParcelableExtra("android.intent.extra.KEY_EVENT")) != null && keyEvent.getAction() == 0) {
                y1.a c10 = uVar.c();
                int keyCode = keyEvent.getKeyCode();
                if (keyCode != 79 && keyCode != 85) {
                    a(uVar, qVar);
                    return false;
                }
                if (keyEvent.getRepeatCount() != 0) {
                    a(uVar, qVar);
                    return true;
                }
                if (!this.c) {
                    this.c = true;
                    qVar.sendMessageDelayed(qVar.obtainMessage(1, c10), ViewConfiguration.getDoubleTapTimeout());
                    return true;
                }
                qVar.removeMessages(1);
                this.c = false;
                PlaybackStateCompat d = uVar.d();
                if (((d == null ? 0L : d.e) & 32) != 0) {
                    S();
                }
                return true;
            }
        }
        return false;
    }

    public void A(String str, Bundle bundle) {
        int i10 = this.a;
    }

    public void G(long j10) {
        int i10 = this.a;
    }

    public void M(int i10) {
        int i11 = this.a;
    }

    public void P(int i10) {
        int i11 = this.a;
    }

    public void S() {
        int i10 = this.a;
    }

    public void V() {
        int i10 = this.a;
    }

    public void Y(long j10) {
        int i10 = this.a;
    }

    public void a(u uVar, Handler handler) {
        if (this.c) {
            this.c = false;
            handler.removeMessages(1);
            PlaybackStateCompat d = uVar.d();
            long j10 = d == null ? 0L : d.e;
            boolean z10 = d != null && d.a == 3;
            boolean z11 = (516 & j10) != 0;
            boolean z12 = (j10 & 514) != 0;
            if (z10 && z12) {
                k();
            } else {
                if (z10 || !z11) {
                    return;
                }
                n();
            }
        }
    }

    public void b(n4.l lVar, Handler handler) {
        if (this.c) {
            this.c = false;
            handler.removeMessages(1);
            n4.w wVar = lVar.g;
            long j10 = wVar == null ? 0L : wVar.e;
            boolean z10 = wVar != null && wVar.a == 3;
            boolean z11 = (516 & j10) != 0;
            boolean z12 = (j10 & 514) != 0;
            if (z10 && z12) {
                k();
            } else {
                if (z10 || !z11) {
                    return;
                }
                n();
            }
        }
    }

    public void c0(u uVar, Handler handler) {
        synchronized (this.b) {
            try {
                this.d = new WeakReference(uVar);
                q qVar = (q) this.f;
                q qVar2 = null;
                if (qVar != null) {
                    qVar.removeCallbacksAndMessages(null);
                }
                if (uVar != null && handler != null) {
                    qVar2 = new q(this, handler.getLooper(), 0);
                }
                this.f = qVar2;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void d0(n4.l lVar, Handler handler) {
        synchronized (this.b) {
            try {
                this.d = new WeakReference(lVar);
                q qVar = (q) this.f;
                if (qVar != null) {
                    qVar.removeCallbacksAndMessages(null);
                }
                this.f = new q(this, handler.getLooper(), 8);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public boolean i(Intent intent) {
        n4.l lVar;
        q qVar;
        KeyEvent keyEvent;
        switch (this.a) {
            case 0:
                return j(intent);
            default:
                if (Build.VERSION.SDK_INT >= 27) {
                    return false;
                }
                synchronized (this.b) {
                    lVar = (n4.l) this.d.get();
                    qVar = (q) this.f;
                }
                if (lVar == null || qVar == null || (keyEvent = (KeyEvent) intent.getParcelableExtra("android.intent.extra.KEY_EVENT")) == null || keyEvent.getAction() != 0) {
                    return false;
                }
                n4.r c10 = lVar.c();
                int keyCode = keyEvent.getKeyCode();
                if (keyCode != 79 && keyCode != 85) {
                    b(lVar, qVar);
                    return false;
                }
                if (keyEvent.getRepeatCount() != 0) {
                    b(lVar, qVar);
                } else if (this.c) {
                    qVar.removeMessages(1);
                    this.c = false;
                    n4.w wVar = lVar.g;
                    if (((wVar == null ? 0L : wVar.e) & 32) != 0) {
                        S();
                    }
                } else {
                    this.c = true;
                    qVar.sendMessageDelayed(qVar.obtainMessage(1, c10), ViewConfiguration.getDoubleTapTimeout());
                }
                return true;
        }
    }

    public void k() {
        int i10 = this.a;
    }

    public void n() {
        int i10 = this.a;
    }

    public void q(String str, Bundle bundle) {
        int i10 = this.a;
    }

    public void x(String str, Bundle bundle) {
        int i10 = this.a;
    }

    private void T() {
    }

    private void U() {
    }

    private void W() {
    }

    private void X() {
    }

    private void l() {
    }

    private void m() {
    }

    private void o() {
    }

    private void p() {
    }

    public void F() {
    }

    public void b0() {
    }

    public void h() {
    }

    public void w() {
    }

    private void H(long j10) {
    }

    private void I(long j10) {
    }

    private void N(int i10) {
    }

    private void O(int i10) {
    }

    private void Q(int i10) {
    }

    private void R(int i10) {
    }

    private void Z(long j10) {
    }

    private void a0(long j10) {
    }

    public void E(n4.h hVar) {
    }

    public void J(float f7) {
    }

    public void K(n4.x xVar) {
    }

    public void L(n4.x xVar) {
    }

    public void c(n4.h hVar) {
    }

    public void f(String str) {
    }

    public void t(String str) {
    }

    private void B(String str, Bundle bundle) {
    }

    private void C(String str, Bundle bundle) {
    }

    private void r(String str, Bundle bundle) {
    }

    private void s(String str, Bundle bundle) {
    }

    private void y(String str, Bundle bundle) {
    }

    private void z(String str, Bundle bundle) {
    }

    public void D(Uri uri, Bundle bundle) {
    }

    public void d(n4.h hVar, int i10) {
    }

    public void g(String str, Bundle bundle) {
    }

    public void u(String str, Bundle bundle) {
    }

    public void v(Uri uri, Bundle bundle) {
    }

    public void e(String str, Bundle bundle, ResultReceiver resultReceiver) {
    }
}
