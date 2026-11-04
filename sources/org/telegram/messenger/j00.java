package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final /* synthetic */ class j00 implements n10 {
    public final /* synthetic */ int a;
    public final /* synthetic */ x00 b;
    public final /* synthetic */ r10 c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ int e;
    public final /* synthetic */ String f;
    public final /* synthetic */ long g;

    public /* synthetic */ j00(x00 x00Var, r10 r10Var, boolean z10, int i3, String str, long j10, int i10) {
        this.a = i10;
        this.b = x00Var;
        this.c = r10Var;
        this.d = z10;
        this.e = i3;
        this.f = str;
        this.g = j10;
    }

    @Override // org.telegram.messenger.n10
    public final void a(Object obj, Object obj2) {
        int i3 = this.a;
        long j10 = this.g;
        String str = this.f;
        int i10 = this.e;
        boolean z10 = this.d;
        r10 r10Var = this.c;
        x00 x00Var = this.b;
        switch (i3) {
            case 0:
                String str2 = (String) obj;
                Boolean bool = (Boolean) obj2;
                if (str2 == null) {
                    x00Var.K(j10, false);
                    hs.e().k(hs.P4, 1, bd.M0(bool.booleanValue() ? 2131743957 : 2131743956, null));
                    break;
                } else {
                    TLRPC.TL_textWithEntities tL_textWithEntities = new TLRPC.TL_textWithEntities();
                    tL_textWithEntities.text = str2;
                    r10Var.a(Boolean.valueOf(z10), Integer.valueOf(i10), tL_textWithEntities, str);
                    break;
                }
            default:
                String str3 = (String) obj;
                Boolean bool2 = (Boolean) obj2;
                if (str3 == null) {
                    x00Var.K(j10, false);
                    hs.e().k(hs.P4, 1, bd.M0(bool2.booleanValue() ? 2131743957 : 2131743956, null));
                    break;
                } else {
                    TLRPC.TL_textWithEntities tL_textWithEntities2 = new TLRPC.TL_textWithEntities();
                    tL_textWithEntities2.text = str3;
                    r10Var.a(Boolean.valueOf(z10), Integer.valueOf(i10), tL_textWithEntities2, str);
                    break;
                }
        }
    }
}
