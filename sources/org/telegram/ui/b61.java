package org.telegram.ui;

import org.telegram.tgnet.tl.TL_stories;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class b61 implements org.telegram.messenger.u10 {
    public final /* synthetic */ int a;
    public final /* synthetic */ l71 b;

    public /* synthetic */ b61(l71 l71Var, int i3) {
        this.a = i3;
        this.b = l71Var;
    }

    @Override // org.telegram.messenger.u10
    public final void a(Object obj) {
        switch (this.a) {
            case 0:
                l71 l71Var = this.b;
                l71Var.getClass();
                l71Var.p1 = ((Float) obj).floatValue();
                l71Var.z0.invalidate();
                l71Var.a1();
                break;
            case 1:
                l71 l71Var2 = this.b;
                l71Var2.X1 = (TL_stories.TL_premium_boostsStatus) obj;
                l71Var2.W1 = true;
                l71Var2.m1(true);
                l71Var2.V1 = false;
                break;
            default:
                l71.Z(this.b, (org.telegram.messenger.e3) obj);
                break;
        }
    }
}
