package org.telegram.ui.Components;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class to0 implements org.telegram.messenger.u10 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ws0 b;

    public /* synthetic */ to0(ws0 ws0Var, int i3) {
        this.a = i3;
        this.b = ws0Var;
    }

    @Override // org.telegram.messenger.u10
    public final void a(Object obj) {
        int i3 = this.a;
        int i10 = 18;
        ws0 ws0Var = this.b;
        ei.s6 s6Var = (ei.s6) obj;
        switch (i3) {
            case 0:
                org.telegram.messenger.g0.i3(new j50(i10, ws0Var, s6Var), 100L);
                break;
            default:
                int[] iArr = ws0.t2;
                org.telegram.messenger.g0.i3(new j50(i10, ws0Var, s6Var), 100L);
                break;
        }
    }
}
