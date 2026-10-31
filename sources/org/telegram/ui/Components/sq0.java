package org.telegram.ui.Components;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class sq0 implements org.telegram.messenger.q20 {
    public final /* synthetic */ int a;
    public final /* synthetic */ zt0 b;

    public /* synthetic */ sq0(zt0 zt0Var, int i10) {
        this.a = i10;
        this.b = zt0Var;
    }

    @Override // org.telegram.messenger.q20
    public final void a(Object obj) {
        int i10 = this.a;
        int i11 = 7;
        zt0 zt0Var = this.b;
        th.y4 y4Var = (th.y4) obj;
        switch (i10) {
            case 0:
                org.telegram.messenger.i0.h3(new gi0(i11, zt0Var, y4Var), 100L);
                break;
            default:
                int[] iArr = zt0.s2;
                org.telegram.messenger.i0.h3(new gi0(i11, zt0Var, y4Var), 100L);
                break;
        }
    }
}
