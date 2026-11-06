package org.telegram.ui;

import org.telegram.tgnet.tl.TL_stories;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes3.dex */
public final /* synthetic */ class l61 implements org.telegram.messenger.c20 {
    public final /* synthetic */ int a;
    public final /* synthetic */ u71 b;

    public /* synthetic */ l61(u71 u71Var, int i7) {
        this.a = i7;
        this.b = u71Var;
    }

    @Override // org.telegram.messenger.c20
    public final void a(Object obj) {
        switch (this.a) {
            case 0:
                u71 u71Var = this.b;
                u71Var.getClass();
                u71Var.o1 = ((Float) obj).floatValue();
                u71Var.y0.invalidate();
                u71Var.a1();
                break;
            case 1:
                u71 u71Var2 = this.b;
                u71Var2.W1 = (TL_stories.TL_premium_boostsStatus) obj;
                u71Var2.V1 = true;
                u71Var2.m1(true);
                u71Var2.U1 = false;
                break;
            default:
                u71.Z(this.b, (org.telegram.messenger.e3) obj);
                break;
        }
    }
}
