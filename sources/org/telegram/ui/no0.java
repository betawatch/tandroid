package org.telegram.ui;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_stars;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class no0 implements Utilities.Callback {
    public final /* synthetic */ int a;
    public final /* synthetic */ oo0 b;

    public /* synthetic */ no0(oo0 oo0Var, int i9) {
        this.a = i9;
        this.b = oo0Var;
    }

    @Override // org.telegram.messenger.Utilities.Callback
    public final void run(Object obj) {
        int i9;
        yo0 yo0Var;
        uo0 uo0Var;
        switch (this.a) {
            case 0:
                Integer num = (Integer) obj;
                oo0 oo0Var = this.b;
                uo0 uo0Var2 = oo0Var.e;
                TL_stars.StarGift starGift = num.intValue() == 0 ? null : (TL_stars.StarGift) uo0Var2.D.get(num);
                uo0Var2.B = starGift;
                zo0 zo0Var = uo0Var2.f0;
                if (starGift == null) {
                    fh.p5 p5Var = uo0Var2.A;
                    if (p5Var != null) {
                        p5Var.f();
                        uo0Var2.A = null;
                    }
                } else {
                    fh.p5 p5Var2 = uo0Var2.A;
                    if (p5Var2 == null || p5Var2.b != starGift.id) {
                        i9 = ((org.telegram.ui.ActionBar.o2) zo0Var).currentAccount;
                        fh.p5 p5Var3 = new fh.p5(uo0Var2.B.id, i9, new no0(oo0Var, 2));
                        uo0Var2.A = p5Var3;
                        p5Var3.g(false);
                    }
                }
                uo0Var2.e();
                (zo0Var.y.getCurrentPosition() == 1 ? zo0Var.h : zo0Var.f).e();
                break;
            case 1:
                uo0 uo0Var3 = this.b.e;
                uo0Var3.n = ((Integer) obj).intValue();
                uo0Var3.s = null;
                uo0Var3.v = null;
                uo0Var3.y = null;
                uo0Var3.i(true);
                uo0Var3.h();
                uo0Var3.f();
                to0 to0Var = uo0Var3.x;
                if (to0Var != null) {
                    to0Var.invalidate();
                }
                zo0 zo0Var2 = uo0Var3.f0;
                uo0 uo0Var4 = zo0Var2.h;
                if (uo0Var4 != null && (yo0Var = uo0Var4.a) != null && (uo0Var = zo0Var2.f) != null) {
                    yo0Var.a(uo0Var.n);
                    break;
                }
                break;
            default:
                this.b.e.e();
                break;
        }
    }
}
