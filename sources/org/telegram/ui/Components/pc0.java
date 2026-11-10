package org.telegram.ui.Components;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class pc0 implements org.telegram.messenger.ls {
    public final /* synthetic */ int a;
    public final /* synthetic */ org.telegram.messenger.c20 b;
    public final /* synthetic */ org.telegram.messenger.ls[] c;

    public pc0(int i7, org.telegram.messenger.c20 c20Var, org.telegram.messenger.ls[] lsVarArr) {
        this.a = i7;
        this.b = c20Var;
        this.c = lsVarArr;
    }

    @Override // org.telegram.messenger.ls
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        int i11 = org.telegram.messenger.qs.p5;
        if (i7 == i11) {
            int intValue = ((Integer) objArr[0]).intValue();
            int[] iArr = (int[]) objArr[2];
            if (intValue == this.a) {
                org.telegram.messenger.c20 c20Var = this.b;
                if (c20Var != null) {
                    c20Var.a(iArr);
                }
                org.telegram.messenger.qs.e().n(this.c[0], i11);
            }
        }
    }
}
