package org.telegram.ui.Components;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class qc0 implements org.telegram.messenger.is {
    public final /* synthetic */ int a;
    public final /* synthetic */ org.telegram.messenger.z10 b;
    public final /* synthetic */ org.telegram.messenger.is[] c;

    public qc0(int i7, org.telegram.messenger.z10 z10Var, org.telegram.messenger.is[] isVarArr) {
        this.a = i7;
        this.b = z10Var;
        this.c = isVarArr;
    }

    @Override // org.telegram.messenger.is
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        int i11 = org.telegram.messenger.ns.p5;
        if (i7 == i11) {
            int intValue = ((Integer) objArr[0]).intValue();
            int[] iArr = (int[]) objArr[2];
            if (intValue == this.a) {
                org.telegram.messenger.z10 z10Var = this.b;
                if (z10Var != null) {
                    z10Var.a(iArr);
                }
                org.telegram.messenger.ns.e().n(this.c[0], i11);
            }
        }
    }
}
