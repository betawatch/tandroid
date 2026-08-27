package org.telegram.ui;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_stars;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final /* synthetic */ class oo0 implements Utilities.Callback {
    public final /* synthetic */ int a;
    public final /* synthetic */ po0 b;

    public /* synthetic */ oo0(po0 po0Var, int i10) {
        this.a = i10;
        this.b = po0Var;
    }

    @Override // org.telegram.messenger.Utilities.Callback
    public final void run(Object obj) {
        int i10;
        zo0 zo0Var;
        vo0 vo0Var;
        switch (this.a) {
            case 0:
                Integer num = (Integer) obj;
                po0 po0Var = this.b;
                vo0 vo0Var2 = po0Var.e;
                TL_stars.StarGift starGift = num.intValue() == 0 ? null : (TL_stars.StarGift) vo0Var2.D.get(num);
                vo0Var2.B = starGift;
                ap0 ap0Var = vo0Var2.f0;
                if (starGift == null) {
                    gh.i5 i5Var = vo0Var2.A;
                    if (i5Var != null) {
                        i5Var.f();
                        vo0Var2.A = null;
                    }
                } else {
                    gh.i5 i5Var2 = vo0Var2.A;
                    if (i5Var2 == null || i5Var2.b != starGift.id) {
                        i10 = ((org.telegram.ui.ActionBar.n2) ap0Var).currentAccount;
                        gh.i5 i5Var3 = new gh.i5(vo0Var2.B.id, i10, new oo0(po0Var, 2));
                        vo0Var2.A = i5Var3;
                        i5Var3.g(false);
                    }
                }
                vo0Var2.e();
                (ap0Var.y.getCurrentPosition() == 1 ? ap0Var.h : ap0Var.f).e();
                break;
            case 1:
                vo0 vo0Var3 = this.b.e;
                vo0Var3.n = ((Integer) obj).intValue();
                vo0Var3.s = null;
                vo0Var3.v = null;
                vo0Var3.y = null;
                vo0Var3.i(true);
                vo0Var3.h();
                vo0Var3.f();
                uo0 uo0Var = vo0Var3.x;
                if (uo0Var != null) {
                    uo0Var.invalidate();
                }
                ap0 ap0Var2 = vo0Var3.f0;
                vo0 vo0Var4 = ap0Var2.h;
                if (vo0Var4 != null && (zo0Var = vo0Var4.a) != null && (vo0Var = ap0Var2.f) != null) {
                    zo0Var.a(vo0Var.n);
                    break;
                }
                break;
            default:
                this.b.e.e();
                break;
        }
    }
}
