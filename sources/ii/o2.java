package ii;

import android.view.KeyEvent;
import android.view.View;
import org.telegram.ui.Cells.p9;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
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
                if (A1 instanceof d6) {
                    d6 d6Var = (d6) A1;
                    d6Var.B();
                    d6Var.getEditText().setSelection(0);
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
                if (A12 instanceof p9) {
                    w3Var.n3.c0(0, 0, (p9) A12);
                    break;
                }
                break;
            case 15:
                w3 w3Var2 = this.b;
                KeyEvent.Callback A13 = w3Var2.A1(this.c);
                if (A13 instanceof p9) {
                    w3Var2.n3.c0(0, A13 instanceof d6 ? ((d6) A13).getEditText().length() : 0, (p9) A13);
                    break;
                }
                break;
            case 16:
                this.b.g3(this.c);
                break;
            case 17:
                View A14 = this.b.A1(this.c);
                if (A14 instanceof d6) {
                    d6 d6Var2 = (d6) A14;
                    d6Var2.B();
                    d6Var2.getEditText().setSelection(0);
                    break;
                }
                break;
            case 18:
                View A15 = this.b.A1(this.c);
                if (!(A15 instanceof d6)) {
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
                    d6 d6Var3 = (d6) A15;
                    d6Var3.B();
                    d6Var3.getEditText().setSelection(d6Var3.getEditText().length());
                    break;
                }
                break;
            case 19:
                this.b.f3(this.c);
                break;
            case 20:
                View A16 = this.b.A1(this.c);
                if (A16 instanceof u0) {
                    ((u0) A16).d.r();
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
                if (A17 instanceof d6) {
                    d6 d6Var4 = (d6) A17;
                    d6Var4.B();
                    d6Var4.getEditText().setSelection(0);
                    break;
                }
                break;
            case 24:
                this.b.e3(this.c);
                break;
            case 25:
                this.b.a5(this.c, "");
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
