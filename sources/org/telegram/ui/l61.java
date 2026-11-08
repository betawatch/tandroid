package org.telegram.ui;

import org.telegram.tgnet.tl.TL_stories;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class l61 implements org.telegram.messenger.c20 {
    public final /* synthetic */ int a;
    public final /* synthetic */ v71 b;

    public /* synthetic */ l61(v71 v71Var, int i7) {
        this.a = i7;
        this.b = v71Var;
    }

    @Override // org.telegram.messenger.c20
    public final void a(Object obj) {
        switch (this.a) {
            case 0:
                v71 v71Var = this.b;
                v71Var.getClass();
                v71Var.o1 = ((Float) obj).floatValue();
                v71Var.y0.invalidate();
                v71Var.a1();
                break;
            case 1:
                v71 v71Var2 = this.b;
                v71Var2.W1 = (TL_stories.TL_premium_boostsStatus) obj;
                v71Var2.V1 = true;
                v71Var2.m1(true);
                v71Var2.U1 = false;
                break;
            default:
                v71.Z(this.b, (org.telegram.messenger.e3) obj);
                break;
        }
    }
}
