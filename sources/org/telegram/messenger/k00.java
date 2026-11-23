package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes.dex */
public final /* synthetic */ class k00 implements p10 {
    public final /* synthetic */ int a;
    public final /* synthetic */ y00 b;
    public final /* synthetic */ t10 c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ int e;
    public final /* synthetic */ String f;
    public final /* synthetic */ long g;

    public /* synthetic */ k00(y00 y00Var, t10 t10Var, boolean z10, int i7, String str, long j3, int i10) {
        this.a = i10;
        this.b = y00Var;
        this.c = t10Var;
        this.d = z10;
        this.e = i7;
        this.f = str;
        this.g = j3;
    }

    @Override // org.telegram.messenger.p10
    public final void a(Object obj, Object obj2) {
        int i7 = this.a;
        long j3 = this.g;
        String str = this.f;
        int i10 = this.e;
        boolean z10 = this.d;
        t10 t10Var = this.c;
        y00 y00Var = this.b;
        switch (i7) {
            case 0:
                String str2 = (String) obj;
                Boolean bool = (Boolean) obj2;
                if (str2 == null) {
                    y00Var.K(j3, false);
                    ks.e().k(ks.S4, 1, gd.N0(bool.booleanValue() ? 2131743700 : 2131743699, null));
                    break;
                } else {
                    TLRPC.TL_textWithEntities tL_textWithEntities = new TLRPC.TL_textWithEntities();
                    tL_textWithEntities.text = str2;
                    t10Var.a(Boolean.valueOf(z10), Integer.valueOf(i10), tL_textWithEntities, str);
                    break;
                }
            default:
                String str3 = (String) obj;
                Boolean bool2 = (Boolean) obj2;
                if (str3 == null) {
                    y00Var.K(j3, false);
                    ks.e().k(ks.S4, 1, gd.N0(bool2.booleanValue() ? 2131743700 : 2131743699, null));
                    break;
                } else {
                    TLRPC.TL_textWithEntities tL_textWithEntities2 = new TLRPC.TL_textWithEntities();
                    tL_textWithEntities2.text = str3;
                    t10Var.a(Boolean.valueOf(z10), Integer.valueOf(i10), tL_textWithEntities2, str);
                    break;
                }
        }
    }
}
