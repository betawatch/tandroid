package org.telegram.ui.Components;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ro0 implements org.telegram.messenger.c20 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ys0 b;

    public /* synthetic */ ro0(ys0 ys0Var, int i7) {
        this.a = i7;
        this.b = ys0Var;
    }

    @Override // org.telegram.messenger.c20
    public final void a(Object obj) {
        int i7 = this.a;
        int i10 = 14;
        ys0 ys0Var = this.b;
        di.s6 s6Var = (di.s6) obj;
        switch (i7) {
            case 0:
                org.telegram.messenger.g0.i3(new r80(i10, ys0Var, s6Var), 100L);
                break;
            default:
                int[] iArr = ys0.s2;
                org.telegram.messenger.g0.i3(new r80(i10, ys0Var, s6Var), 100L);
                break;
        }
    }
}
