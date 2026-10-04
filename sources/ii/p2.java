package ii;

import android.view.KeyEvent;
import android.view.View;
import org.telegram.ui.Cells.p9;

/* compiled from: r8-map-id-90c74b6d1af88fe423a82a48cb36c0781986d7c98a26085f38aeb2edc71128ad */
/* loaded from: classes4.dex */
public final /* synthetic */ class p2 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ x3 b;
    public final /* synthetic */ a c;

    public /* synthetic */ p2(x3 x3Var, a aVar, int i10) {
        this.a = i10;
        this.b = x3Var;
        this.c = aVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.f3(this.c);
                break;
            case 1:
                View B1 = this.b.B1(this.c);
                if (B1 instanceof f6) {
                    f6 f6Var = (f6) B1;
                    f6Var.B();
                    f6Var.getEditText().setSelection(0);
                    break;
                }
                break;
            case 2:
                this.b.f3(this.c);
                break;
            case 3:
                this.b.e3(this.c, true);
                break;
            case 4:
                this.b.e3(this.c, false);
                break;
            case 5:
                this.b.e3(this.c, true);
                break;
            case 6:
                this.b.f3(this.c);
                break;
            case 7:
                this.b.d3(this.c, false);
                break;
            case 8:
                this.b.d3(this.c, true);
                break;
            case 9:
                this.b.f3(this.c);
                break;
            case 10:
                this.b.d3(this.c, true);
                break;
            case 11:
                this.b.f3(this.c);
                break;
            case 12:
                this.b.e3(this.c, false);
                break;
            case 13:
                this.b.d3(this.c, true);
                break;
            case 14:
                x3 x3Var = this.b;
                KeyEvent.Callback B12 = x3Var.B1(this.c);
                if (B12 instanceof p9) {
                    x3Var.u3.c0(0, 0, (p9) B12);
                    break;
                }
                break;
            case 15:
                x3 x3Var2 = this.b;
                KeyEvent.Callback B13 = x3Var2.B1(this.c);
                if (B13 instanceof p9) {
                    x3Var2.u3.c0(0, B13 instanceof f6 ? ((f6) B13).getEditText().length() : 0, (p9) B13);
                    break;
                }
                break;
            case 16:
                this.b.h3(this.c);
                break;
            case 17:
                View B14 = this.b.B1(this.c);
                if (B14 instanceof f6) {
                    f6 f6Var2 = (f6) B14;
                    f6Var2.B();
                    f6Var2.getEditText().setSelection(0);
                    break;
                }
                break;
            case 18:
                View B15 = this.b.B1(this.c);
                if (!(B15 instanceof f6)) {
                    if (B15 instanceof q5) {
                        q5 q5Var = (q5) B15;
                        if (q5Var.getGrid().getChildCount() > 0) {
                            View childAt = q5Var.getGrid().getChildAt(0);
                            if (childAt instanceof t5) {
                                ((t5) childAt).a.r();
                                break;
                            }
                        }
                    }
                } else {
                    f6 f6Var3 = (f6) B15;
                    f6Var3.B();
                    f6Var3.getEditText().setSelection(f6Var3.getEditText().length());
                    break;
                }
                break;
            case 19:
                this.b.g3(this.c);
                break;
            case 20:
                View B16 = this.b.B1(this.c);
                if (B16 instanceof u0) {
                    ((u0) B16).d.r();
                    break;
                }
                break;
            case 21:
                this.b.g3(this.c);
                break;
            case 22:
                this.b.g3(this.c);
                break;
            case 23:
                View B17 = this.b.B1(this.c);
                if (B17 instanceof f6) {
                    f6 f6Var4 = (f6) B17;
                    f6Var4.B();
                    f6Var4.getEditText().setSelection(0);
                    break;
                }
                break;
            case 24:
                this.b.f3(this.c);
                break;
            case 25:
                this.b.b5(this.c, "");
                break;
            case 26:
                this.b.f3(this.c);
                break;
            case 27:
                this.b.f3(this.c);
                break;
            case 28:
                this.b.f3(this.c);
                break;
            default:
                this.b.f3(this.c);
                break;
        }
    }
}
