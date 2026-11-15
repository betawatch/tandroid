package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes.dex */
public final /* synthetic */ class o00 implements s10 {
    public final /* synthetic */ int a;
    public final /* synthetic */ c10 b;
    public final /* synthetic */ w10 c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ int e;
    public final /* synthetic */ String f;
    public final /* synthetic */ long g;

    public /* synthetic */ o00(c10 c10Var, w10 w10Var, boolean z10, int i7, String str, long j3, int i10) {
        this.a = i10;
        this.b = c10Var;
        this.c = w10Var;
        this.d = z10;
        this.e = i7;
        this.f = str;
        this.g = j3;
    }

    @Override // org.telegram.messenger.s10
    public final void a(Object obj, Object obj2) {
        int i7 = this.a;
        long j3 = this.g;
        String str = this.f;
        int i10 = this.e;
        boolean z10 = this.d;
        w10 w10Var = this.c;
        c10 c10Var = this.b;
        switch (i7) {
            case 0:
                String str2 = (String) obj;
                Boolean bool = (Boolean) obj2;
                if (str2 == null) {
                    c10Var.K(j3, false);
                    ns.e().k(ns.P4, 1, hd.M0(bool.booleanValue() ? 2131743947 : 2131743946, null));
                    break;
                } else {
                    TLRPC.TL_textWithEntities tL_textWithEntities = new TLRPC.TL_textWithEntities();
                    tL_textWithEntities.text = str2;
                    w10Var.a(Boolean.valueOf(z10), Integer.valueOf(i10), tL_textWithEntities, str);
                    break;
                }
            default:
                String str3 = (String) obj;
                Boolean bool2 = (Boolean) obj2;
                if (str3 == null) {
                    c10Var.K(j3, false);
                    ns.e().k(ns.P4, 1, hd.M0(bool2.booleanValue() ? 2131743947 : 2131743946, null));
                    break;
                } else {
                    TLRPC.TL_textWithEntities tL_textWithEntities2 = new TLRPC.TL_textWithEntities();
                    tL_textWithEntities2.text = str3;
                    w10Var.a(Boolean.valueOf(z10), Integer.valueOf(i10), tL_textWithEntities2, str);
                    break;
                }
        }
    }
}
