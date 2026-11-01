package org.telegram.ui.Components;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final class kd0 implements org.telegram.messenger.vs {
    public final /* synthetic */ int a;
    public final /* synthetic */ org.telegram.messenger.r20 b;
    public final /* synthetic */ org.telegram.messenger.vs[] c;

    public kd0(int i10, org.telegram.messenger.r20 r20Var, org.telegram.messenger.vs[] vsVarArr) {
        this.a = i10;
        this.b = r20Var;
        this.c = vsVarArr;
    }

    @Override // org.telegram.messenger.vs
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        int i12 = org.telegram.messenger.at.p5;
        if (i10 == i12) {
            int intValue = ((Integer) objArr[0]).intValue();
            int[] iArr = (int[]) objArr[2];
            if (intValue == this.a) {
                org.telegram.messenger.r20 r20Var = this.b;
                if (r20Var != null) {
                    r20Var.a(iArr);
                }
                org.telegram.messenger.at.e().n(this.c[0], i12);
            }
        }
    }
}
