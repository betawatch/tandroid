package oi;

import android.view.KeyEvent;
import android.view.View;
import org.telegram.ui.Cells.g9;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes4.dex */
public final /* synthetic */ class k2 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ q3 b;
    public final /* synthetic */ a c;

    public /* synthetic */ k2(q3 q3Var, a aVar, int i7) {
        this.a = i7;
        this.b = q3Var;
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
                if (C1 instanceof y5) {
                    y5 y5Var = (y5) C1;
                    y5Var.B();
                    y5Var.getEditText().setSelection(0);
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
                q3 q3Var = this.b;
                KeyEvent.Callback C12 = q3Var.C1(this.c);
                if (C12 instanceof g9) {
                    q3Var.v3.b0(0, 0, (g9) C12);
                    break;
                }
                break;
            case 15:
                q3 q3Var2 = this.b;
                KeyEvent.Callback C13 = q3Var2.C1(this.c);
                if (C13 instanceof g9) {
                    q3Var2.v3.b0(0, C13 instanceof y5 ? ((y5) C13).getEditText().length() : 0, (g9) C13);
                    break;
                }
                break;
            case 16:
                this.b.i3(this.c);
                break;
            case 17:
                View C14 = this.b.C1(this.c);
                if (C14 instanceof y5) {
                    y5 y5Var2 = (y5) C14;
                    y5Var2.B();
                    y5Var2.getEditText().setSelection(0);
                    break;
                }
                break;
            case 18:
                View C15 = this.b.C1(this.c);
                if (!(C15 instanceof y5)) {
                    if (C15 instanceof k5) {
                        k5 k5Var = (k5) C15;
                        if (k5Var.getGrid().getChildCount() > 0) {
                            View childAt = k5Var.getGrid().getChildAt(0);
                            if (childAt instanceof n5) {
                                ((n5) childAt).a.O();
                                break;
                            }
                        }
                    }
                } else {
                    y5 y5Var3 = (y5) C15;
                    y5Var3.B();
                    y5Var3.getEditText().setSelection(y5Var3.getEditText().length());
                    break;
                }
                break;
            case 19:
                this.b.h3(this.c);
                break;
            case 20:
                View C16 = this.b.C1(this.c);
                if (C16 instanceof p0) {
                    ((p0) C16).d.O();
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
                if (C17 instanceof y5) {
                    y5 y5Var4 = (y5) C17;
                    y5Var4.B();
                    y5Var4.getEditText().setSelection(0);
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
