package li;

import android.view.KeyEvent;
import android.view.View;
import org.telegram.ui.Cells.h9;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes4.dex */
public final /* synthetic */ class m2 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ t3 b;
    public final /* synthetic */ a c;

    public /* synthetic */ m2(t3 t3Var, a aVar, int i7) {
        this.a = i7;
        this.b = t3Var;
        this.c = aVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.g3(this.c);
                break;
            case 1:
                View C1 = this.b.C1(this.c);
                if (C1 instanceof a6) {
                    a6 a6Var = (a6) C1;
                    a6Var.B();
                    a6Var.getEditText().setSelection(0);
                    break;
                }
                break;
            case 2:
                this.b.g3(this.c);
                break;
            case 3:
                this.b.f3(this.c, true);
                break;
            case 4:
                this.b.f3(this.c, false);
                break;
            case 5:
                this.b.f3(this.c, true);
                break;
            case 6:
                this.b.g3(this.c);
                break;
            case 7:
                this.b.e3(this.c, false);
                break;
            case 8:
                this.b.e3(this.c, true);
                break;
            case 9:
                this.b.g3(this.c);
                break;
            case 10:
                this.b.e3(this.c, true);
                break;
            case 11:
                this.b.g3(this.c);
                break;
            case 12:
                this.b.f3(this.c, false);
                break;
            case 13:
                this.b.e3(this.c, true);
                break;
            case 14:
                t3 t3Var = this.b;
                KeyEvent.Callback C12 = t3Var.C1(this.c);
                if (C12 instanceof h9) {
                    t3Var.u3.b0(0, 0, (h9) C12);
                    break;
                }
                break;
            case 15:
                t3 t3Var2 = this.b;
                KeyEvent.Callback C13 = t3Var2.C1(this.c);
                if (C13 instanceof h9) {
                    t3Var2.u3.b0(0, C13 instanceof a6 ? ((a6) C13).getEditText().length() : 0, (h9) C13);
                    break;
                }
                break;
            case 16:
                this.b.i3(this.c);
                break;
            case 17:
                View C14 = this.b.C1(this.c);
                if (C14 instanceof a6) {
                    a6 a6Var2 = (a6) C14;
                    a6Var2.B();
                    a6Var2.getEditText().setSelection(0);
                    break;
                }
                break;
            case 18:
                View C15 = this.b.C1(this.c);
                if (!(C15 instanceof a6)) {
                    if (C15 instanceof m5) {
                        m5 m5Var = (m5) C15;
                        if (m5Var.getGrid().getChildCount() > 0) {
                            View childAt = m5Var.getGrid().getChildAt(0);
                            if (childAt instanceof p5) {
                                ((p5) childAt).a.N();
                                break;
                            }
                        }
                    }
                } else {
                    a6 a6Var3 = (a6) C15;
                    a6Var3.B();
                    a6Var3.getEditText().setSelection(a6Var3.getEditText().length());
                    break;
                }
                break;
            case 19:
                this.b.h3(this.c);
                break;
            case 20:
                View C16 = this.b.C1(this.c);
                if (C16 instanceof r0) {
                    ((r0) C16).d.N();
                    break;
                }
                break;
            case 21:
                this.b.h3(this.c);
                break;
            case 22:
                this.b.h3(this.c);
                break;
            case 23:
                View C17 = this.b.C1(this.c);
                if (C17 instanceof a6) {
                    a6 a6Var4 = (a6) C17;
                    a6Var4.B();
                    a6Var4.getEditText().setSelection(0);
                    break;
                }
                break;
            case 24:
                this.b.g3(this.c);
                break;
            case 25:
                this.b.d5("", this.c);
                break;
            case 26:
                this.b.g3(this.c);
                break;
            case 27:
                this.b.g3(this.c);
                break;
            case 28:
                this.b.g3(this.c);
                break;
            default:
                this.b.g3(this.c);
                break;
        }
    }
}
