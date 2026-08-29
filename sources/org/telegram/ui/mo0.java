package org.telegram.ui;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_stars;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final /* synthetic */ class mo0 implements Utilities.Callback {
    public final /* synthetic */ int a;
    public final /* synthetic */ no0 b;

    public /* synthetic */ mo0(no0 no0Var, int i10) {
        this.a = i10;
        this.b = no0Var;
    }

    @Override // org.telegram.messenger.Utilities.Callback
    public final void run(Object obj) {
        int i10;
        xo0 xo0Var;
        to0 to0Var;
        switch (this.a) {
            case 0:
                Integer num = (Integer) obj;
                no0 no0Var = this.b;
                to0 to0Var2 = no0Var.e;
                TL_stars.StarGift starGift = num.intValue() == 0 ? null : (TL_stars.StarGift) to0Var2.D.get(num);
                to0Var2.B = starGift;
                yo0 yo0Var = to0Var2.f0;
                if (starGift == null) {
                    ih.b5 b5Var = to0Var2.A;
                    if (b5Var != null) {
                        b5Var.f();
                        to0Var2.A = null;
                    }
                } else {
                    ih.b5 b5Var2 = to0Var2.A;
                    if (b5Var2 == null || b5Var2.b != starGift.id) {
                        i10 = ((org.telegram.ui.ActionBar.o2) yo0Var).currentAccount;
                        ih.b5 b5Var3 = new ih.b5(to0Var2.B.id, i10, new mo0(no0Var, 2));
                        to0Var2.A = b5Var3;
                        b5Var3.g(false);
                    }
                }
                to0Var2.e();
                (yo0Var.y.getCurrentPosition() == 1 ? yo0Var.h : yo0Var.f).e();
                break;
            case 1:
                to0 to0Var3 = this.b.e;
                to0Var3.n = ((Integer) obj).intValue();
                to0Var3.s = null;
                to0Var3.v = null;
                to0Var3.y = null;
                to0Var3.i(true);
                to0Var3.h();
                to0Var3.f();
                so0 so0Var = to0Var3.x;
                if (so0Var != null) {
                    so0Var.invalidate();
                }
                yo0 yo0Var2 = to0Var3.f0;
                to0 to0Var4 = yo0Var2.h;
                if (to0Var4 != null && (xo0Var = to0Var4.a) != null && (to0Var = yo0Var2.f) != null) {
                    xo0Var.a(to0Var.n);
                    break;
                }
                break;
            default:
                this.b.e.e();
                break;
        }
    }
}
