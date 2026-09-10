package hi;

import android.view.KeyEvent;
import android.view.View;
import org.telegram.ui.Cells.r9;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes4.dex */
public final /* synthetic */ class r2 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ z3 b;
    public final /* synthetic */ a c;

    public /* synthetic */ r2(z3 z3Var, a aVar, int i10) {
        this.a = i10;
        this.b = z3Var;
        this.c = aVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.c3(this.c);
                break;
            case 1:
                View y12 = this.b.y1(this.c);
                if (y12 instanceof g6) {
                    g6 g6Var = (g6) y12;
                    g6Var.B();
                    g6Var.getEditText().setSelection(0);
                    break;
                }
                break;
            case 2:
                this.b.c3(this.c);
                break;
            case 3:
                this.b.b3(this.c, true);
                break;
            case 4:
                this.b.b3(this.c, false);
                break;
            case 5:
                this.b.b3(this.c, true);
                break;
            case 6:
                this.b.c3(this.c);
                break;
            case 7:
                this.b.a3(this.c, false);
                break;
            case 8:
                this.b.a3(this.c, true);
                break;
            case 9:
                this.b.c3(this.c);
                break;
            case 10:
                this.b.a3(this.c, true);
                break;
            case 11:
                this.b.c3(this.c);
                break;
            case 12:
                this.b.b3(this.c, false);
                break;
            case 13:
                this.b.a3(this.c, true);
                break;
            case 14:
                z3 z3Var = this.b;
                KeyEvent.Callback y13 = z3Var.y1(this.c);
                if (y13 instanceof r9) {
                    z3Var.n3.c0(0, 0, (r9) y13);
                    break;
                }
                break;
            case 15:
                z3 z3Var2 = this.b;
                KeyEvent.Callback y14 = z3Var2.y1(this.c);
                if (y14 instanceof r9) {
                    z3Var2.n3.c0(0, y14 instanceof g6 ? ((g6) y14).getEditText().length() : 0, (r9) y14);
                    break;
                }
                break;
            case 16:
                this.b.e3(this.c);
                break;
            case 17:
                View y15 = this.b.y1(this.c);
                if (y15 instanceof g6) {
                    g6 g6Var2 = (g6) y15;
                    g6Var2.B();
                    g6Var2.getEditText().setSelection(0);
                    break;
                }
                break;
            case 18:
                View y16 = this.b.y1(this.c);
                if (!(y16 instanceof g6)) {
                    if (y16 instanceof r5) {
                        r5 r5Var = (r5) y16;
                        if (r5Var.getGrid().getChildCount() > 0) {
                            View childAt = r5Var.getGrid().getChildAt(0);
                            if (childAt instanceof u5) {
                                ((u5) childAt).a.r();
                                break;
                            }
                        }
                    }
                } else {
                    g6 g6Var3 = (g6) y16;
                    g6Var3.B();
                    g6Var3.getEditText().setSelection(g6Var3.getEditText().length());
                    break;
                }
                break;
            case 19:
                this.b.d3(this.c);
                break;
            case 20:
                View y17 = this.b.y1(this.c);
                if (y17 instanceof w0) {
                    ((w0) y17).d.r();
                    break;
                }
                break;
            case 21:
                this.b.d3(this.c);
                break;
            case 22:
                this.b.d3(this.c);
                break;
            case 23:
                View y18 = this.b.y1(this.c);
                if (y18 instanceof g6) {
                    g6 g6Var4 = (g6) y18;
                    g6Var4.B();
                    g6Var4.getEditText().setSelection(0);
                    break;
                }
                break;
            case 24:
                this.b.c3(this.c);
                break;
            case 25:
                this.b.Y4(this.c, "");
                break;
            case 26:
                this.b.c3(this.c);
                break;
            case 27:
                this.b.c3(this.c);
                break;
            case 28:
                this.b.c3(this.c);
                break;
            default:
                this.b.c3(this.c);
                break;
        }
    }
}
