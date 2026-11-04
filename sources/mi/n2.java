package mi;

import android.view.KeyEvent;
import android.view.View;
import org.telegram.ui.Cells.g9;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes4.dex */
public final /* synthetic */ class n2 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ t3 b;
    public final /* synthetic */ a c;

    public /* synthetic */ n2(t3 t3Var, a aVar, int i3) {
        this.a = i3;
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
                if (C1 instanceof b6) {
                    b6 b6Var = (b6) C1;
                    b6Var.B();
                    b6Var.getEditText().setSelection(0);
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
                if (C12 instanceof g9) {
                    t3Var.v3.b0(0, 0, (g9) C12);
                    break;
                }
                break;
            case 15:
                t3 t3Var2 = this.b;
                KeyEvent.Callback C13 = t3Var2.C1(this.c);
                if (C13 instanceof g9) {
                    t3Var2.v3.b0(0, C13 instanceof b6 ? ((b6) C13).getEditText().length() : 0, (g9) C13);
                    break;
                }
                break;
            case 16:
                this.b.i3(this.c);
                break;
            case 17:
                View C14 = this.b.C1(this.c);
                if (C14 instanceof b6) {
                    b6 b6Var2 = (b6) C14;
                    b6Var2.B();
                    b6Var2.getEditText().setSelection(0);
                    break;
                }
                break;
            case 18:
                View C15 = this.b.C1(this.c);
                if (!(C15 instanceof b6)) {
                    if (C15 instanceof n5) {
                        n5 n5Var = (n5) C15;
                        if (n5Var.getGrid().getChildCount() > 0) {
                            View childAt = n5Var.getGrid().getChildAt(0);
                            if (childAt instanceof q5) {
                                ((q5) childAt).a.N();
                                break;
                            }
                        }
                    }
                } else {
                    b6 b6Var3 = (b6) C15;
                    b6Var3.B();
                    b6Var3.getEditText().setSelection(b6Var3.getEditText().length());
                    break;
                }
                break;
            case 19:
                this.b.h3(this.c);
                break;
            case 20:
                View C16 = this.b.C1(this.c);
                if (C16 instanceof s0) {
                    ((s0) C16).d.N();
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
                if (C17 instanceof b6) {
                    b6 b6Var4 = (b6) C17;
                    b6Var4.B();
                    b6Var4.getEditText().setSelection(0);
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
