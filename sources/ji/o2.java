package ji;

import android.view.KeyEvent;
import android.view.View;
import org.telegram.ui.Cells.n9;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes4.dex */
public final /* synthetic */ class o2 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ x3 b;
    public final /* synthetic */ a c;

    public /* synthetic */ o2(x3 x3Var, a aVar, int i10) {
        this.a = i10;
        this.b = x3Var;
        this.c = aVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.e3(this.c);
                break;
            case 1:
                View A1 = this.b.A1(this.c);
                if (A1 instanceof i6) {
                    i6 i6Var = (i6) A1;
                    i6Var.B();
                    i6Var.getEditText().setSelection(0);
                    break;
                }
                break;
            case 2:
                this.b.e3(this.c);
                break;
            case 3:
                this.b.d3(this.c, true);
                break;
            case 4:
                this.b.d3(this.c, false);
                break;
            case 5:
                this.b.d3(this.c, true);
                break;
            case 6:
                this.b.e3(this.c);
                break;
            case 7:
                this.b.c3(this.c, false);
                break;
            case 8:
                this.b.c3(this.c, true);
                break;
            case 9:
                this.b.e3(this.c);
                break;
            case 10:
                this.b.c3(this.c, true);
                break;
            case 11:
                this.b.e3(this.c);
                break;
            case 12:
                this.b.d3(this.c, false);
                break;
            case 13:
                this.b.c3(this.c, true);
                break;
            case 14:
                x3 x3Var = this.b;
                KeyEvent.Callback A12 = x3Var.A1(this.c);
                if (A12 instanceof n9) {
                    x3Var.l3.b0(0, 0, (n9) A12);
                    break;
                }
                break;
            case 15:
                x3 x3Var2 = this.b;
                KeyEvent.Callback A13 = x3Var2.A1(this.c);
                if (A13 instanceof n9) {
                    x3Var2.l3.b0(0, A13 instanceof i6 ? ((i6) A13).getEditText().length() : 0, (n9) A13);
                    break;
                }
                break;
            case 16:
                this.b.g3(this.c);
                break;
            case 17:
                View A14 = this.b.A1(this.c);
                if (A14 instanceof i6) {
                    i6 i6Var2 = (i6) A14;
                    i6Var2.B();
                    i6Var2.getEditText().setSelection(0);
                    break;
                }
                break;
            case 18:
                View A15 = this.b.A1(this.c);
                if (!(A15 instanceof i6)) {
                    if (A15 instanceof u5) {
                        u5 u5Var = (u5) A15;
                        if (u5Var.getGrid().getChildCount() > 0) {
                            View childAt = u5Var.getGrid().getChildAt(0);
                            if (childAt instanceof x5) {
                                ((x5) childAt).a.r();
                                break;
                            }
                        }
                    }
                } else {
                    i6 i6Var3 = (i6) A15;
                    i6Var3.B();
                    i6Var3.getEditText().setSelection(i6Var3.getEditText().length());
                    break;
                }
                break;
            case 19:
                this.b.f3(this.c);
                break;
            case 20:
                View A16 = this.b.A1(this.c);
                if (A16 instanceof t0) {
                    ((t0) A16).d.r();
                    break;
                }
                break;
            case 21:
                this.b.f3(this.c);
                break;
            case 22:
                this.b.f3(this.c);
                break;
            case 23:
                View A17 = this.b.A1(this.c);
                if (A17 instanceof i6) {
                    i6 i6Var4 = (i6) A17;
                    i6Var4.B();
                    i6Var4.getEditText().setSelection(0);
                    break;
                }
                break;
            case 24:
                this.b.e3(this.c);
                break;
            case 25:
                this.b.a5("", this.c);
                break;
            case 26:
                this.b.e3(this.c);
                break;
            case 27:
                this.b.e3(this.c);
                break;
            case 28:
                this.b.e3(this.c);
                break;
            default:
                this.b.e3(this.c);
                break;
        }
    }
}
