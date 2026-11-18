package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes.dex */
public final /* synthetic */ class l00 implements q10 {
    public final /* synthetic */ int a;
    public final /* synthetic */ z00 b;
    public final /* synthetic */ u10 c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ int e;
    public final /* synthetic */ String f;
    public final /* synthetic */ long g;

    public /* synthetic */ l00(z00 z00Var, u10 u10Var, boolean z10, int i7, String str, long j3, int i10) {
        this.a = i10;
        this.b = z00Var;
        this.c = u10Var;
        this.d = z10;
        this.e = i7;
        this.f = str;
        this.g = j3;
    }

    @Override // org.telegram.messenger.q10
    public final void a(Object obj, Object obj2) {
        int i7 = this.a;
        long j3 = this.g;
        String str = this.f;
        int i10 = this.e;
        boolean z10 = this.d;
        u10 u10Var = this.c;
        z00 z00Var = this.b;
        switch (i7) {
            case 0:
                String str2 = (String) obj;
                Boolean bool = (Boolean) obj2;
                if (str2 == null) {
                    z00Var.K(j3, false);
                    ks.e().k(ks.S4, 1, gd.M0(bool.booleanValue() ? 2131743710 : 2131743709, null));
                    break;
                } else {
                    TLRPC.TL_textWithEntities tL_textWithEntities = new TLRPC.TL_textWithEntities();
                    tL_textWithEntities.text = str2;
                    u10Var.a(Boolean.valueOf(z10), Integer.valueOf(i10), tL_textWithEntities, str);
                    break;
                }
            default:
                String str3 = (String) obj;
                Boolean bool2 = (Boolean) obj2;
                if (str3 == null) {
                    z00Var.K(j3, false);
                    ks.e().k(ks.S4, 1, gd.M0(bool2.booleanValue() ? 2131743710 : 2131743709, null));
                    break;
                } else {
                    TLRPC.TL_textWithEntities tL_textWithEntities2 = new TLRPC.TL_textWithEntities();
                    tL_textWithEntities2.text = str3;
                    u10Var.a(Boolean.valueOf(z10), Integer.valueOf(i10), tL_textWithEntities2, str);
                    break;
                }
        }
    }
}
