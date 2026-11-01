package org.telegram.ui.Components;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final /* synthetic */ class tq0 implements org.telegram.messenger.r20 {
    public final /* synthetic */ int a;
    public final /* synthetic */ au0 b;

    public /* synthetic */ tq0(au0 au0Var, int i10) {
        this.a = i10;
        this.b = au0Var;
    }

    @Override // org.telegram.messenger.r20
    public final void a(Object obj) {
        int i10 = this.a;
        int i11 = 7;
        au0 au0Var = this.b;
        th.y4 y4Var = (th.y4) obj;
        switch (i10) {
            case 0:
                org.telegram.messenger.i0.h3(new hi0(i11, au0Var, y4Var), 100L);
                break;
            default:
                int[] iArr = au0.s2;
                org.telegram.messenger.i0.h3(new hi0(i11, au0Var, y4Var), 100L);
                break;
        }
    }
}
