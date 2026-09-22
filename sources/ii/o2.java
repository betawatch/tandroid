package ii;

import android.view.KeyEvent;
import android.view.View;
import org.telegram.ui.Cells.p9;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
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
                this.b.d3(this.c);
                break;
            case 1:
                View z12 = this.b.z1(this.c);
                if (z12 instanceof d6) {
                    d6 d6Var = (d6) z12;
                    d6Var.B();
                    d6Var.getEditText().setSelection(0);
                    break;
                }
                break;
            case 2:
                this.b.d3(this.c);
                break;
            case 3:
                this.b.c3(this.c, true);
                break;
            case 4:
                this.b.c3(this.c, false);
                break;
            case 5:
                this.b.c3(this.c, true);
                break;
            case 6:
                this.b.d3(this.c);
                break;
            case 7:
                this.b.b3(this.c, false);
                break;
            case 8:
                this.b.b3(this.c, true);
                break;
            case 9:
                this.b.d3(this.c);
                break;
            case 10:
                this.b.b3(this.c, true);
                break;
            case 11:
                this.b.d3(this.c);
                break;
            case 12:
                this.b.c3(this.c, false);
                break;
            case 13:
                this.b.b3(this.c, true);
                break;
            case 14:
                w3 w3Var = this.b;
                KeyEvent.Callback z13 = w3Var.z1(this.c);
                if (z13 instanceof p9) {
                    w3Var.n3.c0(0, 0, (p9) z13);
                    break;
                }
                break;
            case 15:
                w3 w3Var2 = this.b;
                KeyEvent.Callback z14 = w3Var2.z1(this.c);
                if (z14 instanceof p9) {
                    w3Var2.n3.c0(0, z14 instanceof d6 ? ((d6) z14).getEditText().length() : 0, (p9) z14);
                    break;
                }
                break;
            case 16:
                this.b.f3(this.c);
                break;
            case 17:
                View z15 = this.b.z1(this.c);
                if (z15 instanceof d6) {
                    d6 d6Var2 = (d6) z15;
                    d6Var2.B();
                    d6Var2.getEditText().setSelection(0);
                    break;
                }
                break;
            case 18:
                View z16 = this.b.z1(this.c);
                if (!(z16 instanceof d6)) {
                    if (z16 instanceof o5) {
                        o5 o5Var = (o5) z16;
                        if (o5Var.getGrid().getChildCount() > 0) {
                            View childAt = o5Var.getGrid().getChildAt(0);
                            if (childAt instanceof r5) {
                                ((r5) childAt).a.r();
                                break;
                            }
                        }
                    }
                } else {
                    d6 d6Var3 = (d6) z16;
                    d6Var3.B();
                    d6Var3.getEditText().setSelection(d6Var3.getEditText().length());
                    break;
                }
                break;
            case 19:
                this.b.e3(this.c);
                break;
            case 20:
                View z17 = this.b.z1(this.c);
                if (z17 instanceof u0) {
                    ((u0) z17).d.r();
                    break;
                }
                break;
            case 21:
                this.b.e3(this.c);
                break;
            case 22:
                this.b.e3(this.c);
                break;
            case 23:
                View z18 = this.b.z1(this.c);
                if (z18 instanceof d6) {
                    d6 d6Var4 = (d6) z18;
                    d6Var4.B();
                    d6Var4.getEditText().setSelection(0);
                    break;
                }
                break;
            case 24:
                this.b.d3(this.c);
                break;
            case 25:
                this.b.Z4(this.c, "");
                break;
            case 26:
                this.b.d3(this.c);
                break;
            case 27:
                this.b.d3(this.c);
                break;
            case 28:
                this.b.d3(this.c);
                break;
            default:
                this.b.d3(this.c);
                break;
        }
    }
}
