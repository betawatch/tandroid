package li;

import android.view.KeyEvent;
import android.view.View;
import org.telegram.ui.Cells.r9;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes4.dex */
public final /* synthetic */ class m2 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ v3 b;
    public final /* synthetic */ a c;

    public /* synthetic */ m2(v3 v3Var, a aVar, int i10) {
        this.a = i10;
        this.b = v3Var;
        this.c = aVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.j3(this.c);
                break;
            case 1:
                View F1 = this.b.F1(this.c);
                if (F1 instanceof d6) {
                    d6 d6Var = (d6) F1;
                    d6Var.A();
                    d6Var.getEditText().setSelection(0);
                    break;
                }
                break;
            case 2:
                this.b.j3(this.c);
                break;
            case 3:
                this.b.i3(this.c, true);
                break;
            case 4:
                this.b.i3(this.c, false);
                break;
            case 5:
                this.b.i3(this.c, true);
                break;
            case 6:
                this.b.j3(this.c);
                break;
            case 7:
                this.b.h3(this.c, false);
                break;
            case 8:
                this.b.h3(this.c, true);
                break;
            case 9:
                this.b.j3(this.c);
                break;
            case 10:
                this.b.h3(this.c, true);
                break;
            case 11:
                this.b.j3(this.c);
                break;
            case 12:
                this.b.i3(this.c, false);
                break;
            case 13:
                this.b.h3(this.c, true);
                break;
            case 14:
                v3 v3Var = this.b;
                KeyEvent.Callback F12 = v3Var.F1(this.c);
                if (F12 instanceof r9) {
                    v3Var.v3.b0(0, 0, (r9) F12);
                    break;
                }
                break;
            case 15:
                v3 v3Var2 = this.b;
                KeyEvent.Callback F13 = v3Var2.F1(this.c);
                if (F13 instanceof r9) {
                    v3Var2.v3.b0(0, F13 instanceof d6 ? ((d6) F13).getEditText().length() : 0, (r9) F13);
                    break;
                }
                break;
            case 16:
                this.b.l3(this.c);
                break;
            case 17:
                View F14 = this.b.F1(this.c);
                if (F14 instanceof d6) {
                    d6 d6Var2 = (d6) F14;
                    d6Var2.A();
                    d6Var2.getEditText().setSelection(0);
                    break;
                }
                break;
            case 18:
                View F15 = this.b.F1(this.c);
                if (!(F15 instanceof d6)) {
                    if (F15 instanceof p5) {
                        p5 p5Var = (p5) F15;
                        if (p5Var.getGrid().getChildCount() > 0) {
                            View childAt = p5Var.getGrid().getChildAt(0);
                            if (childAt instanceof s5) {
                                ((s5) childAt).a.r();
                                break;
                            }
                        }
                    }
                } else {
                    d6 d6Var3 = (d6) F15;
                    d6Var3.A();
                    d6Var3.getEditText().setSelection(d6Var3.getEditText().length());
                    break;
                }
                break;
            case 19:
                this.b.k3(this.c);
                break;
            case 20:
                View F16 = this.b.F1(this.c);
                if (F16 instanceof s0) {
                    ((s0) F16).d.r();
                    break;
                }
                break;
            case 21:
                this.b.k3(this.c);
                break;
            case 22:
                this.b.k3(this.c);
                break;
            case 23:
                View F17 = this.b.F1(this.c);
                if (F17 instanceof d6) {
                    d6 d6Var4 = (d6) F17;
                    d6Var4.A();
                    d6Var4.getEditText().setSelection(0);
                    break;
                }
                break;
            case 24:
                this.b.j3(this.c);
                break;
            case 25:
                this.b.f5("", this.c);
                break;
            case 26:
                this.b.j3(this.c);
                break;
            case 27:
                this.b.j3(this.c);
                break;
            case 28:
                this.b.j3(this.c);
                break;
            default:
                this.b.j3(this.c);
                break;
        }
    }
}
