// default package

import android.view.View;
import org.telegram.ui.ActionBar.e;
import org.telegram.ui.ProfileActivity;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final class fi2 implements dic {
    public final /* synthetic */ byte a;
    public int b;
    public final /* synthetic */ View c;

    public /* synthetic */ fi2(View view, byte b) {
        this.a = b;
        this.c = view;
    }

    @Override // dic
    public final void a(int i) {
        switch (this.a) {
            case 0:
                break;
            default:
                yr8 yr8Var = (yr8) this.c;
                ProfileActivity profileActivity = yr8Var.n;
                int k = profileActivity.o0.E0.k(i);
                yr8Var.a(this.b != k);
                this.b = k;
                if (profileActivity.r0 != null) {
                    if (!profileActivity.T0.y()) {
                        yr8Var.c();
                        break;
                    } else {
                        hl.d3(new uk8(yr8Var, (byte) 10), 500L);
                        break;
                    }
                }
                break;
        }
    }

    @Override // dic
    public final void b(float f, int i, int i2) {
        vy4 vy4Var;
        byte b = this.a;
        View view = this.c;
        switch (b) {
            case 0:
                if (i == ((et8) view).getCurrentItem() && f == 0.0f && this.b == 1) {
                    d();
                    break;
                }
                break;
            default:
                vy4Var = ((e) ((yr8) view).n).glassEngine;
                vy4Var.g();
                break;
        }
    }

    @Override // dic
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
        et8 et8Var = (et8) this.c;
        if (et8Var.x0 != null) {
            int currentItem = et8Var.getCurrentItem();
            int k = et8Var.x0.k(currentItem) + et8Var.x0.j();
            if (currentItem != k) {
                et8Var.x(k, false);
            }
        }
    }

    private final void e(int i) {
    }

    private final void f(int i) {
    }
}
