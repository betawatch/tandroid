package org.telegram.ui;

import org.telegram.tgnet.tl.TL_stories;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final /* synthetic */ class i61 implements org.telegram.messenger.z10 {
    public final /* synthetic */ int a;
    public final /* synthetic */ t71 b;

    public /* synthetic */ i61(t71 t71Var, int i7) {
        this.a = i7;
        this.b = t71Var;
    }

    @Override // org.telegram.messenger.z10
    public final void a(Object obj) {
        switch (this.a) {
            case 0:
                t71 t71Var = this.b;
                t71Var.getClass();
                t71Var.p1 = ((Float) obj).floatValue();
                t71Var.z0.invalidate();
                t71Var.a1();
                break;
            case 1:
                t71 t71Var2 = this.b;
                t71Var2.X1 = (TL_stories.TL_premium_boostsStatus) obj;
                t71Var2.W1 = true;
                t71Var2.m1(true);
                t71Var2.V1 = false;
                break;
            default:
                t71.Z(this.b, (org.telegram.messenger.e3) obj);
                break;
        }
    }
}
