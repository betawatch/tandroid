package org.telegram.ui;

import org.telegram.tgnet.tl.TL_stories;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final /* synthetic */ class n61 implements org.telegram.messenger.c20 {
    public final /* synthetic */ int a;
    public final /* synthetic */ x71 b;

    public /* synthetic */ n61(x71 x71Var, int i7) {
        this.a = i7;
        this.b = x71Var;
    }

    @Override // org.telegram.messenger.c20
    public final void a(Object obj) {
        switch (this.a) {
            case 0:
                x71 x71Var = this.b;
                x71Var.getClass();
                x71Var.o1 = ((Float) obj).floatValue();
                x71Var.y0.invalidate();
                x71Var.a1();
                break;
            case 1:
                x71 x71Var2 = this.b;
                x71Var2.W1 = (TL_stories.TL_premium_boostsStatus) obj;
                x71Var2.V1 = true;
                x71Var2.m1(true);
                x71Var2.U1 = false;
                break;
            default:
                x71.Z(this.b, (org.telegram.messenger.e3) obj);
                break;
        }
    }
}
