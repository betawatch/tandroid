package bi;

import android.view.KeyEvent;
import android.view.View;
import org.telegram.ui.Cells.j9;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes4.dex */
public final /* synthetic */ class v2 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ d4 b;
    public final /* synthetic */ a c;

    public /* synthetic */ v2(d4 d4Var, a aVar, int i10) {
        this.a = i10;
        this.b = d4Var;
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
                if (C1 instanceof q6) {
                    q6 q6Var = (q6) C1;
                    q6Var.B();
                    q6Var.getEditText().setSelection(0);
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
                d4 d4Var = this.b;
                KeyEvent.Callback C12 = d4Var.C1(this.c);
                if (C12 instanceof j9) {
                    d4Var.u3.b0(0, 0, (j9) C12);
                    break;
                }
                break;
            case 15:
                d4 d4Var2 = this.b;
                KeyEvent.Callback C13 = d4Var2.C1(this.c);
                if (C13 instanceof j9) {
                    d4Var2.u3.b0(0, C13 instanceof q6 ? ((q6) C13).getEditText().length() : 0, (j9) C13);
                    break;
                }
                break;
            case 16:
                this.b.i3(this.c);
                break;
            case 17:
                View C14 = this.b.C1(this.c);
                if (C14 instanceof q6) {
                    q6 q6Var2 = (q6) C14;
                    q6Var2.B();
                    q6Var2.getEditText().setSelection(0);
                    break;
                }
                break;
            case 18:
                View C15 = this.b.C1(this.c);
                if (!(C15 instanceof q6)) {
                    if (C15 instanceof z5) {
                        z5 z5Var = (z5) C15;
                        if (z5Var.getGrid().getChildCount() > 0) {
                            View childAt = z5Var.getGrid().getChildAt(0);
                            if (childAt instanceof c6) {
                                ((c6) childAt).a.N();
                                break;
                            }
                        }
                    }
                } else {
                    q6 q6Var3 = (q6) C15;
                    q6Var3.B();
                    q6Var3.getEditText().setSelection(q6Var3.getEditText().length());
                    break;
                }
                break;
            case 19:
                this.b.h3(this.c);
                break;
            case 20:
                View C16 = this.b.C1(this.c);
                if (C16 instanceof y0) {
                    ((y0) C16).d.N();
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
                if (C17 instanceof q6) {
                    q6 q6Var4 = (q6) C17;
                    q6Var4.B();
                    q6Var4.getEditText().setSelection(0);
                    break;
                }
                break;
            case 24:
                this.b.g3(this.c);
                break;
            case 25:
                this.b.c5(this.c, "");
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
