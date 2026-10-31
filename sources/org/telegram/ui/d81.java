package org.telegram.ui;

import org.telegram.tgnet.tl.TL_stories;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class d81 implements org.telegram.messenger.q20 {
    public final /* synthetic */ int a;
    public final /* synthetic */ m91 b;

    public /* synthetic */ d81(m91 m91Var, int i10) {
        this.a = i10;
        this.b = m91Var;
    }

    @Override // org.telegram.messenger.q20
    public final void a(Object obj) {
        switch (this.a) {
            case 0:
                m91 m91Var = this.b;
                m91Var.getClass();
                m91Var.o1 = ((Float) obj).floatValue();
                m91Var.y0.invalidate();
                m91Var.Z0();
                break;
            case 1:
                m91 m91Var2 = this.b;
                m91Var2.W1 = (TL_stories.TL_premium_boostsStatus) obj;
                m91Var2.V1 = true;
                m91Var2.l1(true);
                m91Var2.U1 = false;
                break;
            default:
                m91.Y(this.b, (org.telegram.messenger.h3) obj);
                break;
        }
    }
}
