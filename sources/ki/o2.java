package ki;

import android.view.KeyEvent;
import android.view.View;
import org.telegram.ui.Cells.n9;

/* compiled from: r8-map-id-6bb23a39fe2d1bb2dc6cc69f606436ba751c240cf93e0ff97ff041cb9f09a305 */
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
                this.b.j3(this.c);
                break;
            case 1:
                View F1 = this.b.F1(this.c);
                if (F1 instanceof c6) {
                    c6 c6Var = (c6) F1;
                    c6Var.A();
                    c6Var.getEditText().setSelection(0);
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
                w3 w3Var = this.b;
                KeyEvent.Callback F12 = w3Var.F1(this.c);
                if (F12 instanceof n9) {
                    w3Var.o3.b0(0, 0, (n9) F12);
                    break;
                }
                break;
            case 15:
                w3 w3Var2 = this.b;
                KeyEvent.Callback F13 = w3Var2.F1(this.c);
                if (F13 instanceof n9) {
                    w3Var2.o3.b0(0, F13 instanceof c6 ? ((c6) F13).getEditText().length() : 0, (n9) F13);
                    break;
                }
                break;
            case 16:
                this.b.l3(this.c);
                break;
            case 17:
                View F14 = this.b.F1(this.c);
                if (F14 instanceof c6) {
                    c6 c6Var2 = (c6) F14;
                    c6Var2.A();
                    c6Var2.getEditText().setSelection(0);
                    break;
                }
                break;
            case 18:
                View F15 = this.b.F1(this.c);
                if (!(F15 instanceof c6)) {
                    if (F15 instanceof o5) {
                        o5 o5Var = (o5) F15;
                        if (o5Var.getGrid().getChildCount() > 0) {
                            View childAt = o5Var.getGrid().getChildAt(0);
                            if (childAt instanceof r5) {
                                ((r5) childAt).a.r();
                                break;
                            }
                        }
                    }
                } else {
                    c6 c6Var3 = (c6) F15;
                    c6Var3.A();
                    c6Var3.getEditText().setSelection(c6Var3.getEditText().length());
                    break;
                }
                break;
            case 19:
                this.b.k3(this.c);
                break;
            case 20:
                View F16 = this.b.F1(this.c);
                if (F16 instanceof t0) {
                    ((t0) F16).d.r();
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
                if (F17 instanceof c6) {
                    c6 c6Var4 = (c6) F17;
                    c6Var4.A();
                    c6Var4.getEditText().setSelection(0);
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
