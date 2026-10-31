package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final /* synthetic */ class f10 implements j20 {
    public final /* synthetic */ int a;
    public final /* synthetic */ t10 b;
    public final /* synthetic */ n20 c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ int e;
    public final /* synthetic */ String f;
    public final /* synthetic */ long g;

    public /* synthetic */ f10(t10 t10Var, n20 n20Var, boolean z10, int i10, String str, long j10, int i11) {
        this.a = i11;
        this.b = t10Var;
        this.c = n20Var;
        this.d = z10;
        this.e = i10;
        this.f = str;
        this.g = j10;
    }

    @Override // org.telegram.messenger.j20
    public final void a(Object obj, Object obj2) {
        int i10 = this.a;
        long j10 = this.g;
        String str = this.f;
        int i11 = this.e;
        boolean z10 = this.d;
        n20 n20Var = this.c;
        t10 t10Var = this.b;
        switch (i10) {
            case 0:
                String str2 = (String) obj;
                Boolean bool = (Boolean) obj2;
                if (str2 == null) {
                    t10Var.K(j10, false);
                    zs.e().k(zs.P4, 1, cd.L0(bool.booleanValue() ? 2131743972 : 2131743971, null));
                    break;
                } else {
                    TLRPC.TL_textWithEntities tL_textWithEntities = new TLRPC.TL_textWithEntities();
                    tL_textWithEntities.text = str2;
                    n20Var.a(Boolean.valueOf(z10), Integer.valueOf(i11), tL_textWithEntities, str);
                    break;
                }
            default:
                String str3 = (String) obj;
                Boolean bool2 = (Boolean) obj2;
                if (str3 == null) {
                    t10Var.K(j10, false);
                    zs.e().k(zs.P4, 1, cd.L0(bool2.booleanValue() ? 2131743972 : 2131743971, null));
                    break;
                } else {
                    TLRPC.TL_textWithEntities tL_textWithEntities2 = new TLRPC.TL_textWithEntities();
                    tL_textWithEntities2.text = str3;
                    n20Var.a(Boolean.valueOf(z10), Integer.valueOf(i11), tL_textWithEntities2, str);
                    break;
                }
        }
    }
}
