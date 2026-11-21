package org.telegram.ui.Components;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes3.dex */
public final class bd0 implements org.telegram.messenger.fs {
    public final /* synthetic */ int a;
    public final /* synthetic */ org.telegram.messenger.x10 b;
    public final /* synthetic */ org.telegram.messenger.fs[] c;

    public bd0(int i7, org.telegram.messenger.x10 x10Var, org.telegram.messenger.fs[] fsVarArr) {
        this.a = i7;
        this.b = x10Var;
        this.c = fsVarArr;
    }

    @Override // org.telegram.messenger.fs
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        int i11 = org.telegram.messenger.ks.s5;
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
