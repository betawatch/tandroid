package org.telegram.ui;

import org.telegram.tgnet.tl.TL_stories;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
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
