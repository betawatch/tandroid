package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes.dex */
public final /* synthetic */ class m00 implements r10 {
    public final /* synthetic */ int a;
    public final /* synthetic */ a10 b;
    public final /* synthetic */ v10 c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ int e;
    public final /* synthetic */ String f;
    public final /* synthetic */ long g;

    public /* synthetic */ m00(a10 a10Var, v10 v10Var, boolean z10, int i7, String str, long j3, int i10) {
        this.a = i10;
        this.b = a10Var;
        this.c = v10Var;
        this.d = z10;
        this.e = i7;
        this.f = str;
        this.g = j3;
    }

    @Override // org.telegram.messenger.r10
    public final void a(Object obj, Object obj2) {
        int i7 = this.a;
        long j3 = this.g;
        String str = this.f;
        int i10 = this.e;
        boolean z10 = this.d;
        v10 v10Var = this.c;
        a10 a10Var = this.b;
        switch (i7) {
            case 0:
                String str2 = (String) obj;
                Boolean bool = (Boolean) obj2;
                if (str2 == null) {
                    a10Var.K(j3, false);
                    ls.e().k(ls.S4, 1, hd.N0(bool.booleanValue() ? 2131743702 : 2131743701, null));
                    break;
                } else {
                    TLRPC.TL_textWithEntities tL_textWithEntities = new TLRPC.TL_textWithEntities();
                    tL_textWithEntities.text = str2;
                    v10Var.a(Boolean.valueOf(z10), Integer.valueOf(i10), tL_textWithEntities, str);
                    break;
                }
            default:
                String str3 = (String) obj;
                Boolean bool2 = (Boolean) obj2;
                if (str3 == null) {
                    a10Var.K(j3, false);
                    ls.e().k(ls.S4, 1, hd.N0(bool2.booleanValue() ? 2131743702 : 2131743701, null));
                    break;
                } else {
                    TLRPC.TL_textWithEntities tL_textWithEntities2 = new TLRPC.TL_textWithEntities();
                    tL_textWithEntities2.text = str3;
                    v10Var.a(Boolean.valueOf(z10), Integer.valueOf(i10), tL_textWithEntities2, str);
                    break;
                }
        }
    }
}
