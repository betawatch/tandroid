package org.telegram.ui.Components;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class kc0 implements org.telegram.messenger.cs {
    public final /* synthetic */ int a;
    public final /* synthetic */ org.telegram.messenger.u10 b;
    public final /* synthetic */ org.telegram.messenger.cs[] c;

    public kc0(int i3, org.telegram.messenger.u10 u10Var, org.telegram.messenger.cs[] csVarArr) {
        this.a = i3;
        this.b = u10Var;
        this.c = csVarArr;
    }

    @Override // org.telegram.messenger.cs
    public final void didReceivedNotification(int i3, int i10, Object... objArr) {
        int i11 = org.telegram.messenger.hs.p5;
        if (i3 == i11) {
            int intValue = ((Integer) objArr[0]).intValue();
            int[] iArr = (int[]) objArr[2];
            if (intValue == this.a) {
                org.telegram.messenger.u10 u10Var = this.b;
                if (u10Var != null) {
                    u10Var.a(iArr);
                }
                org.telegram.messenger.hs.e().n(this.c[0], i11);
            }
        }
    }
}
