package ki;

import android.view.KeyEvent;
import android.view.View;
import org.telegram.ui.Cells.m9;

/* compiled from: r8-map-id-189a3a12219b7c214453a48fa9697387dfb8b2ca31ce3a2eba70ff5e2610a248 */
/* loaded from: classes4.dex */
public final /* synthetic */ class o2 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ w3 b;
    public final /* synthetic */ a c;

    public /* synthetic */ o2(w3 w3Var, a aVar, int i10) {
        this.a = i10;
        this.b = w3Var;
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
                if (A1 instanceof c6) {
                    c6 c6Var = (c6) A1;
                    c6Var.B();
                    c6Var.getEditText().setSelection(0);
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
                w3 w3Var = this.b;
                KeyEvent.Callback A12 = w3Var.A1(this.c);
                if (A12 instanceof m9) {
                    w3Var.l3.b0(0, 0, (m9) A12);
                    break;
                }
                break;
            case 15:
                w3 w3Var2 = this.b;
                KeyEvent.Callback A13 = w3Var2.A1(this.c);
                if (A13 instanceof m9) {
                    w3Var2.l3.b0(0, A13 instanceof c6 ? ((c6) A13).getEditText().length() : 0, (m9) A13);
                    break;
                }
                break;
            case 16:
                this.b.g3(this.c);
                break;
            case 17:
                View A14 = this.b.A1(this.c);
                if (A14 instanceof c6) {
                    c6 c6Var2 = (c6) A14;
                    c6Var2.B();
                    c6Var2.getEditText().setSelection(0);
                    break;
                }
                break;
            case 18:
                View A15 = this.b.A1(this.c);
                if (!(A15 instanceof c6)) {
                    if (A15 instanceof o5) {
                        o5 o5Var = (o5) A15;
                        if (o5Var.getGrid().getChildCount() > 0) {
                            View childAt = o5Var.getGrid().getChildAt(0);
                            if (childAt instanceof r5) {
                                ((r5) childAt).a.r();
                                break;
                            }
                        }
                    }
                } else {
                    c6 c6Var3 = (c6) A15;
                    c6Var3.B();
                    c6Var3.getEditText().setSelection(c6Var3.getEditText().length());
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
                if (A17 instanceof c6) {
                    c6 c6Var4 = (c6) A17;
                    c6Var4.B();
                    c6Var4.getEditText().setSelection(0);
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
