package org.telegram.ui.Components;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final /* synthetic */ class um implements org.telegram.messenger.z10 {
    public final /* synthetic */ int a;
    public final /* synthetic */ org.telegram.messenger.z10 b;

    public /* synthetic */ um(org.telegram.messenger.z10 z10Var, int i7) {
        this.a = i7;
        this.b = z10Var;
    }

    @Override // org.telegram.messenger.z10
    public final void a(Object obj) {
        switch (this.a) {
            case 0:
                this.b.a(new th.e((String) obj));
                break;
            default:
                int[] iArr = (int[]) obj;
                boolean z10 = false;
                if (iArr.length >= 1 && iArr[0] == 0) {
                    z10 = true;
                }
                this.b.a(Boolean.valueOf(z10));
                break;
        }
    }
}
