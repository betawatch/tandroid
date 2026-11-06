package org.telegram.ui.Components;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ro0 implements org.telegram.messenger.c20 {
    public final /* synthetic */ int a;
    public final /* synthetic */ xs0 b;

    public /* synthetic */ ro0(xs0 xs0Var, int i7) {
        this.a = i7;
        this.b = xs0Var;
    }

    @Override // org.telegram.messenger.c20
    public final void a(Object obj) {
        int i7 = this.a;
        int i10 = 13;
        xs0 xs0Var = this.b;
        di.r6 r6Var = (di.r6) obj;
        switch (i7) {
            case 0:
                org.telegram.messenger.g0.i3(new v80(i10, xs0Var, r6Var), 100L);
                break;
            default:
                int[] iArr = xs0.s2;
                org.telegram.messenger.g0.i3(new v80(i10, xs0Var, r6Var), 100L);
                break;
        }
    }
}
