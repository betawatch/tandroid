package org.telegram.ui.Components;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final class ad0 implements org.telegram.messenger.fs {
    public final /* synthetic */ int a;
    public final /* synthetic */ org.telegram.messenger.x10 b;
    public final /* synthetic */ org.telegram.messenger.fs[] c;

    public ad0(int i7, org.telegram.messenger.x10 x10Var, org.telegram.messenger.fs[] fsVarArr) {
        this.a = i7;
        this.b = x10Var;
        this.c = fsVarArr;
    }

    @Override // org.telegram.messenger.fs
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        int i11 = org.telegram.messenger.ks.r5;
        if (i7 == i11) {
            int intValue = ((Integer) objArr[0]).intValue();
            int[] iArr = (int[]) objArr[2];
            if (intValue == this.a) {
                org.telegram.messenger.x10 x10Var = this.b;
                if (x10Var != null) {
                    x10Var.a(iArr);
                }
                org.telegram.messenger.ks.e().n(this.c[0], i11);
            }
        }
    }
}
