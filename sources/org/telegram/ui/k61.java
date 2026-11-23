package org.telegram.ui;

import org.telegram.tgnet.tl.TL_stories;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final /* synthetic */ class k61 implements org.telegram.messenger.w10 {
    public final /* synthetic */ int a;
    public final /* synthetic */ v71 b;

    public /* synthetic */ k61(v71 v71Var, int i7) {
        this.a = i7;
        this.b = v71Var;
    }

    @Override // org.telegram.messenger.w10
    public final void a(Object obj) {
        switch (this.a) {
            case 0:
                v71 v71Var = this.b;
                v71Var.getClass();
                v71Var.p1 = ((Float) obj).floatValue();
                v71Var.z0.invalidate();
                v71Var.a1();
                break;
            case 1:
                v71 v71Var2 = this.b;
                v71Var2.X1 = (TL_stories.TL_premium_boostsStatus) obj;
                v71Var2.W1 = true;
                v71Var2.m1(true);
                v71Var2.V1 = false;
                break;
            default:
                v71.Z(this.b, (org.telegram.messenger.g3) obj);
                break;
        }
    }
}
