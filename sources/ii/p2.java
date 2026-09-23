package ii;

import android.view.KeyEvent;
import android.view.View;
import org.telegram.ui.Cells.q9;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
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
                this.b.d3(this.c);
                break;
            case 1:
                View z12 = this.b.z1(this.c);
                if (z12 instanceof e6) {
                    e6 e6Var = (e6) z12;
                    e6Var.B();
                    e6Var.getEditText().setSelection(0);
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
                x3 x3Var = this.b;
                KeyEvent.Callback z13 = x3Var.z1(this.c);
                if (z13 instanceof q9) {
                    x3Var.n3.c0(0, 0, (q9) z13);
                    break;
                }
                break;
            case 15:
                x3 x3Var2 = this.b;
                KeyEvent.Callback z14 = x3Var2.z1(this.c);
                if (z14 instanceof q9) {
                    x3Var2.n3.c0(0, z14 instanceof e6 ? ((e6) z14).getEditText().length() : 0, (q9) z14);
                    break;
                }
                break;
            case 16:
                this.b.f3(this.c);
                break;
            case 17:
                View z15 = this.b.z1(this.c);
                if (z15 instanceof e6) {
                    e6 e6Var2 = (e6) z15;
                    e6Var2.B();
                    e6Var2.getEditText().setSelection(0);
                    break;
                }
                break;
            case 18:
                View z16 = this.b.z1(this.c);
                if (!(z16 instanceof e6)) {
                    if (z16 instanceof p5) {
                        p5 p5Var = (p5) z16;
                        if (p5Var.getGrid().getChildCount() > 0) {
                            View childAt = p5Var.getGrid().getChildAt(0);
                            if (childAt instanceof s5) {
                                ((s5) childAt).a.r();
                                break;
                            }
                        }
                    }
                } else {
                    e6 e6Var3 = (e6) z16;
                    e6Var3.B();
                    e6Var3.getEditText().setSelection(e6Var3.getEditText().length());
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
                if (z18 instanceof e6) {
                    e6 e6Var4 = (e6) z18;
                    e6Var4.B();
                    e6Var4.getEditText().setSelection(0);
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
