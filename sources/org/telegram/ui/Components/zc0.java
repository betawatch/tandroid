package org.telegram.ui.Components;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class zc0 implements org.telegram.messenger.fs {
    public final /* synthetic */ int a;
    public final /* synthetic */ org.telegram.messenger.w10 b;
    public final /* synthetic */ org.telegram.messenger.fs[] c;

    public zc0(int i7, org.telegram.messenger.w10 w10Var, org.telegram.messenger.fs[] fsVarArr) {
        this.a = i7;
        this.b = w10Var;
        this.c = fsVarArr;
    }

    @Override // org.telegram.messenger.fs
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        int i11 = org.telegram.messenger.ks.s5;
        if (i7 == i11) {
            int intValue = ((Integer) objArr[0]).intValue();
            int[] iArr = (int[]) objArr[2];
            if (intValue == this.a) {
                org.telegram.messenger.w10 w10Var = this.b;
                if (w10Var != null) {
                    w10Var.a(iArr);
                }
                org.telegram.messenger.ks.e().n(this.c[0], i11);
            }
        }
    }
}
