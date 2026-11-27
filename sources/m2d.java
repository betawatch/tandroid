// default package

import android.view.View;
import android.view.Window;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes.dex */
public class m2d extends c3f {
    public final Window a;
    public final ve9 b;

    public m2d(Window window, ve9 ve9Var) {
        this.a = window;
        this.b = ve9Var;
    }

    @Override // c3f
    public final void a() {
        for (int i = 1; i <= 512; i <<= 1) {
            if ((519 & i) != 0) {
                if (i == 1) {
                    f(4);
                } else if (i == 2) {
                    f(2);
                } else if (i == 8) {
                    ((pq8) this.b.b).q();
                }
            }
        }
    }

    @Override // c3f
    public final void c(boolean z) {
        if (!z) {
            g(TLObject.FLAG_13);
            return;
        }
        Window window = this.a;
        window.clearFlags(67108864);
        window.addFlags(TLObject.FLAG_31);
        f(TLObject.FLAG_13);
    }

    @Override // c3f
    public final void d() {
        this.a.getDecorView().setTag(356039078, 2);
        g(2048);
        f(TLObject.FLAG_12);
    }

    @Override // c3f
    public final void e() {
        for (int i = 1; i <= 512; i <<= 1) {
            if ((519 & i) != 0) {
                if (i == 1) {
                    g(4);
                    this.a.clearFlags(1024);
                } else if (i == 2) {
                    g(2);
                } else if (i == 8) {
                    ((pq8) this.b.b).t();
                }
            }
        }
    }

    public final void f(int i) {
        View decorView = this.a.getDecorView();
        decorView.setSystemUiVisibility(decorView.getSystemUiVisibility() | i);
    }

    public final void g(int i) {
        View decorView = this.a.getDecorView();
        decorView.setSystemUiVisibility(decorView.getSystemUiVisibility() & (~i));
    }
}
