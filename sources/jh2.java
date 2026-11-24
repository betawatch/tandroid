// default package

import android.view.View;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.ProfileActivity;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class jh2 implements eec {
    public final /* synthetic */ byte a;
    public int b;
    public final /* synthetic */ View c;

    public /* synthetic */ jh2(View view, byte b) {
        this.a = b;
        this.c = view;
    }

    @Override // eec
    public final void a(int i) {
        switch (this.a) {
            case 0:
                break;
            default:
                mo8 mo8Var = (mo8) this.c;
                ProfileActivity profileActivity = mo8Var.n;
                int k = profileActivity.o0.E0.k(i);
                mo8Var.a(this.b != k);
                this.b = k;
                if (profileActivity.r0 != null) {
                    if (!profileActivity.T0.y()) {
                        mo8Var.c();
                        break;
                    } else {
                        gl.e3(new w88(mo8Var, (byte) 24), 500L);
                        break;
                    }
                }
                break;
        }
    }

    @Override // eec
    public final void b(float f, int i, int i2) {
        qw4 qw4Var;
        byte b = this.a;
        View view = this.c;
        switch (b) {
            case 0:
                if (i == ((sp8) view).getCurrentItem() && f == 0.0f && this.b == 1) {
                    d();
                    break;
                }
                break;
            default:
                qw4Var = ((d) ((mo8) view).n).glassEngine;
                qw4Var.g();
                break;
        }
    }

    @Override // eec
    public final void c(int i) {
        switch (this.a) {
            case 0:
                if (i == 0) {
                    d();
                }
                this.b = i;
                break;
        }
    }

    public final void d() {
        sp8 sp8Var = (sp8) this.c;
        if (sp8Var.x0 != null) {
            int currentItem = sp8Var.getCurrentItem();
            int k = sp8Var.x0.k(currentItem) + sp8Var.x0.j();
            if (currentItem != k) {
                sp8Var.x(k, false);
            }
        }
    }

    private final void e(int i) {
    }

    private final void f(int i) {
    }
}
