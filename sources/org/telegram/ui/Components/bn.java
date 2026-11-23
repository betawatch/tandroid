package org.telegram.ui.Components;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final /* synthetic */ class bn implements org.telegram.messenger.w10 {
    public final /* synthetic */ int a;
    public final /* synthetic */ org.telegram.messenger.w10 b;

    public /* synthetic */ bn(org.telegram.messenger.w10 w10Var, int i7) {
        this.a = i7;
        this.b = w10Var;
    }

    @Override // org.telegram.messenger.w10
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
