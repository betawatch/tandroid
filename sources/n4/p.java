package n4;

import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.ResultReceiver;
import android.view.KeyEvent;
import android.view.ViewConfiguration;
import java.lang.ref.WeakReference;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes.dex */
public abstract class p {
    public boolean c;
    public androidx.mediarouter.app.c e;
    public final Object a = new Object();
    public final o b = new o(this);
    public WeakReference d = new WeakReference(null);

    public final void C(r rVar, Handler handler) {
        synchronized (this.a) {
            try {
                this.d = new WeakReference(rVar);
                androidx.mediarouter.app.c cVar = this.e;
                if (cVar != null) {
                    cVar.removeCallbacksAndMessages(null);
                }
                this.e = new androidx.mediarouter.app.c(this, handler.getLooper(), 6);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void a(r rVar, Handler handler) {
        if (this.c) {
            this.c = false;
            handler.removeMessages(1);
            h0 h0Var = rVar.g;
            long j3 = h0Var == null ? 0L : h0Var.e;
            boolean z10 = h0Var != null && h0Var.a == 3;
            boolean z11 = (516 & j3) != 0;
            boolean z12 = (j3 & 514) != 0;
            if (z10 && z12) {
                h();
            } else {
                if (z10 || !z11) {
                    return;
                }
                i();
            }
        }
    }

    public boolean g(Intent intent) {
        r rVar;
        androidx.mediarouter.app.c cVar;
        KeyEvent keyEvent;
        if (Build.VERSION.SDK_INT < 27) {
            synchronized (this.a) {
                rVar = (r) this.d.get();
                cVar = this.e;
            }
            if (rVar != null && cVar != null && (keyEvent = (KeyEvent) intent.getParcelableExtra("android.intent.extra.KEY_EVENT")) != null && keyEvent.getAction() == 0) {
                a0 c10 = rVar.c();
                int keyCode = keyEvent.getKeyCode();
                if (keyCode != 79 && keyCode != 85) {
                    a(rVar, cVar);
                    return false;
                }
                if (keyEvent.getRepeatCount() != 0) {
                    a(rVar, cVar);
                    return true;
                }
                if (!this.c) {
                    this.c = true;
                    cVar.sendMessageDelayed(cVar.obtainMessage(1, c10), ViewConfiguration.getDoubleTapTimeout());
                    return true;
                }
                cVar.removeMessages(1);
                this.c = false;
                h0 h0Var = rVar.g;
                if (((h0Var == null ? 0L : h0Var.e) & 32) != 0) {
                    y();
                }
                return true;
            }
        }
        return false;
    }

    public void B() {
    }

    public void f() {
    }

    public void h() {
    }

    public void i() {
    }

    public void m() {
    }

    public void r() {
    }

    public void y() {
    }

    public void z() {
    }

    public void A(long j3) {
    }

    public void b(l lVar) {
    }

    public void q(l lVar) {
    }

    public void s(long j3) {
    }

    public void t(float f7) {
    }

    public void u(i0 i0Var) {
    }

    public void v(i0 i0Var) {
    }

    public void w(int i10) {
    }

    public void x(int i10) {
    }

    public void c(l lVar, int i10) {
    }

    public void e(String str, Bundle bundle) {
    }

    public void j(String str, Bundle bundle) {
    }

    public void k(String str, Bundle bundle) {
    }

    public void l(Uri uri, Bundle bundle) {
    }

    public void n(String str, Bundle bundle) {
    }

    public void o(String str, Bundle bundle) {
    }

    public void p(Uri uri, Bundle bundle) {
    }

    public void d(String str, Bundle bundle, ResultReceiver resultReceiver) {
    }
}
