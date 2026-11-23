package org.telegram.ui.Components;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes3.dex */
public final class bd0 implements org.telegram.messenger.gs {
    public final /* synthetic */ int a;
    public final /* synthetic */ org.telegram.messenger.y10 b;
    public final /* synthetic */ org.telegram.messenger.gs[] c;

    public bd0(int i7, org.telegram.messenger.y10 y10Var, org.telegram.messenger.gs[] gsVarArr) {
        this.a = i7;
        this.b = y10Var;
        this.c = gsVarArr;
    }

    @Override // org.telegram.messenger.gs
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        int i11 = org.telegram.messenger.ls.s5;
        if (i7 == i11) {
            int intValue = ((Integer) objArr[0]).intValue();
            int[] iArr = (int[]) objArr[2];
            if (intValue == this.a) {
                org.telegram.messenger.y10 y10Var = this.b;
                if (y10Var != null) {
                    y10Var.a(iArr);
                }
                org.telegram.messenger.ls.e().n(this.c[0], i11);
            }
        }
    }
}
