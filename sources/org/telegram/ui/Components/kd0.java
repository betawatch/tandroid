package org.telegram.ui.Components;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class kd0 implements org.telegram.messenger.us {
    public final /* synthetic */ int a;
    public final /* synthetic */ org.telegram.messenger.q20 b;
    public final /* synthetic */ org.telegram.messenger.us[] c;

    public kd0(int i10, org.telegram.messenger.q20 q20Var, org.telegram.messenger.us[] usVarArr) {
        this.a = i10;
        this.b = q20Var;
        this.c = usVarArr;
    }

    @Override // org.telegram.messenger.us
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        int i12 = org.telegram.messenger.zs.p5;
        if (i10 == i12) {
            int intValue = ((Integer) objArr[0]).intValue();
            int[] iArr = (int[]) objArr[2];
            if (intValue == this.a) {
                org.telegram.messenger.q20 q20Var = this.b;
                if (q20Var != null) {
                    q20Var.a(iArr);
                }
                org.telegram.messenger.zs.e().n(this.c[0], i12);
            }
        }
    }
}
