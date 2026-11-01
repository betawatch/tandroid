package org.telegram.ui;

import org.telegram.tgnet.tl.TL_stories;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final /* synthetic */ class b81 implements org.telegram.messenger.r20 {
    public final /* synthetic */ int a;
    public final /* synthetic */ k91 b;

    public /* synthetic */ b81(k91 k91Var, int i10) {
        this.a = i10;
        this.b = k91Var;
    }

    @Override // org.telegram.messenger.r20
    public final void a(Object obj) {
        switch (this.a) {
            case 0:
                k91 k91Var = this.b;
                k91Var.getClass();
                k91Var.o1 = ((Float) obj).floatValue();
                k91Var.y0.invalidate();
                k91Var.a1();
                break;
            case 1:
                k91 k91Var2 = this.b;
                k91Var2.W1 = (TL_stories.TL_premium_boostsStatus) obj;
                k91Var2.V1 = true;
                k91Var2.m1(true);
                k91Var2.U1 = false;
                break;
            default:
                k91.Z(this.b, (org.telegram.messenger.h3) obj);
                break;
        }
    }
}
