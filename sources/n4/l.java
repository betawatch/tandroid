package n4;

import ab.o0;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.ResultReceiver;
import android.view.KeyEvent;
import android.view.ViewConfiguration;
import java.lang.ref.WeakReference;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes.dex */
public abstract class l {
    public boolean c;
    public o0 e;
    public final Object a = new Object();
    public final k b = new k(this);
    public WeakReference d = new WeakReference(null);

    public final void C(n nVar, Handler handler) {
        synchronized (this.a) {
            try {
                this.d = new WeakReference(nVar);
                o0 o0Var = this.e;
                if (o0Var != null) {
                    o0Var.removeCallbacksAndMessages(null);
                }
                this.e = new o0(this, handler.getLooper(), 7);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void a(n nVar, Handler handler) {
        if (this.c) {
            this.c = false;
            handler.removeMessages(1);
            y yVar = nVar.g;
            long j10 = yVar == null ? 0L : yVar.e;
            boolean z10 = yVar != null && yVar.a == 3;
            boolean z11 = (516 & j10) != 0;
            boolean z12 = (j10 & 514) != 0;
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
        n nVar;
        o0 o0Var;
        KeyEvent keyEvent;
        if (Build.VERSION.SDK_INT < 27) {
            synchronized (this.a) {
                nVar = (n) this.d.get();
                o0Var = this.e;
            }
            if (nVar != null && o0Var != null && (keyEvent = (KeyEvent) intent.getParcelableExtra("android.intent.extra.KEY_EVENT")) != null && keyEvent.getAction() == 0) {
                t c10 = nVar.c();
                int keyCode = keyEvent.getKeyCode();
                if (keyCode != 79 && keyCode != 85) {
                    a(nVar, o0Var);
                    return false;
                }
                if (keyEvent.getRepeatCount() != 0) {
                    a(nVar, o0Var);
                    return true;
                }
                if (!this.c) {
                    this.c = true;
                    o0Var.sendMessageDelayed(o0Var.obtainMessage(1, c10), ViewConfiguration.getDoubleTapTimeout());
                    return true;
                }
                o0Var.removeMessages(1);
                this.c = false;
                y yVar = nVar.g;
                if (((yVar == null ? 0L : yVar.e) & 32) != 0) {
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

    public void A(long j10) {
    }

    public void b(h hVar) {
    }

    public void q(h hVar) {
    }

    public void s(long j10) {
    }

    public void t(float f7) {
    }

    public void u(z zVar) {
    }

    public void v(z zVar) {
    }

    public void w(int i10) {
    }

    public void x(int i10) {
    }

    public void c(h hVar, int i10) {
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
