package org.telegram.ui;

import org.telegram.tgnet.tl.TL_stories;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final /* synthetic */ class m61 implements org.telegram.messenger.c20 {
    public final /* synthetic */ int a;
    public final /* synthetic */ w71 b;

    public /* synthetic */ m61(w71 w71Var, int i7) {
        this.a = i7;
        this.b = w71Var;
    }

    @Override // org.telegram.messenger.c20
    public final void a(Object obj) {
        switch (this.a) {
            case 0:
                w71 w71Var = this.b;
                w71Var.getClass();
                w71Var.o1 = ((Float) obj).floatValue();
                w71Var.y0.invalidate();
                w71Var.a1();
                break;
            case 1:
                w71 w71Var2 = this.b;
                w71Var2.W1 = (TL_stories.TL_premium_boostsStatus) obj;
                w71Var2.V1 = true;
                w71Var2.m1(true);
                w71Var2.U1 = false;
                break;
            default:
                w71.Z(this.b, (org.telegram.messenger.e3) obj);
                break;
        }
    }
}
