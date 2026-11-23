package org.telegram.ui;

import org.telegram.tgnet.tl.TL_stories;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes3.dex */
public final /* synthetic */ class m61 implements org.telegram.messenger.y10 {
    public final /* synthetic */ int a;
    public final /* synthetic */ x71 b;

    public /* synthetic */ m61(x71 x71Var, int i7) {
        this.a = i7;
        this.b = x71Var;
    }

    @Override // org.telegram.messenger.y10
    public final void a(Object obj) {
        switch (this.a) {
            case 0:
                x71 x71Var = this.b;
                x71Var.getClass();
                x71Var.p1 = ((Float) obj).floatValue();
                x71Var.z0.invalidate();
                x71Var.a1();
                break;
            case 1:
                x71 x71Var2 = this.b;
                x71Var2.X1 = (TL_stories.TL_premium_boostsStatus) obj;
                x71Var2.W1 = true;
                x71Var2.m1(true);
                x71Var2.V1 = false;
                break;
            default:
                x71.Z(this.b, (org.telegram.messenger.g3) obj);
                break;
        }
    }
}
