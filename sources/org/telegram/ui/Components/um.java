package org.telegram.ui.Components;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class um implements org.telegram.messenger.q20 {
    public final /* synthetic */ int a;
    public final /* synthetic */ org.telegram.messenger.q20 b;

    public /* synthetic */ um(org.telegram.messenger.q20 q20Var, int i10) {
        this.a = i10;
        this.b = q20Var;
    }

    @Override // org.telegram.messenger.q20
    public final void a(Object obj) {
        switch (this.a) {
            case 0:
                this.b.a(new jh.e((String) obj));
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
