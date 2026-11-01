package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes.dex */
public final /* synthetic */ class g10 implements k20 {
    public final /* synthetic */ int a;
    public final /* synthetic */ u10 b;
    public final /* synthetic */ o20 c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ int e;
    public final /* synthetic */ String f;
    public final /* synthetic */ long g;

    public /* synthetic */ g10(u10 u10Var, o20 o20Var, boolean z10, int i10, String str, long j10, int i11) {
        this.a = i11;
        this.b = u10Var;
        this.c = o20Var;
        this.d = z10;
        this.e = i10;
        this.f = str;
        this.g = j10;
    }

    @Override // org.telegram.messenger.k20
    public final void a(Object obj, Object obj2) {
        int i10 = this.a;
        long j10 = this.g;
        String str = this.f;
        int i11 = this.e;
        boolean z10 = this.d;
        o20 o20Var = this.c;
        u10 u10Var = this.b;
        switch (i10) {
            case 0:
                String str2 = (String) obj;
                Boolean bool = (Boolean) obj2;
                if (str2 == null) {
                    u10Var.K(j10, false);
                    at.e().k(at.P4, 1, dd.L0(bool.booleanValue() ? 2131743972 : 2131743971, null));
                    break;
                } else {
                    TLRPC.TL_textWithEntities tL_textWithEntities = new TLRPC.TL_textWithEntities();
                    tL_textWithEntities.text = str2;
                    o20Var.a(Boolean.valueOf(z10), Integer.valueOf(i11), tL_textWithEntities, str);
                    break;
                }
            default:
                String str3 = (String) obj;
                Boolean bool2 = (Boolean) obj2;
                if (str3 == null) {
                    u10Var.K(j10, false);
                    at.e().k(at.P4, 1, dd.L0(bool2.booleanValue() ? 2131743972 : 2131743971, null));
                    break;
                } else {
                    TLRPC.TL_textWithEntities tL_textWithEntities2 = new TLRPC.TL_textWithEntities();
                    tL_textWithEntities2.text = str3;
                    o20Var.a(Boolean.valueOf(z10), Integer.valueOf(i11), tL_textWithEntities2, str);
                    break;
                }
        }
    }
}
