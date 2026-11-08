package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes.dex */
public final /* synthetic */ class r00 implements v10 {
    public final /* synthetic */ int a;
    public final /* synthetic */ f10 b;
    public final /* synthetic */ z10 c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ int e;
    public final /* synthetic */ String f;
    public final /* synthetic */ long g;

    public /* synthetic */ r00(f10 f10Var, z10 z10Var, boolean z9, int i7, String str, long j3, int i10) {
        this.a = i10;
        this.b = f10Var;
        this.c = z10Var;
        this.d = z9;
        this.e = i7;
        this.f = str;
        this.g = j3;
    }

    @Override // org.telegram.messenger.v10
    public final void a(Object obj, Object obj2) {
        int i7 = this.a;
        long j3 = this.g;
        String str = this.f;
        int i10 = this.e;
        boolean z9 = this.d;
        z10 z10Var = this.c;
        f10 f10Var = this.b;
        switch (i7) {
            case 0:
                String str2 = (String) obj;
                Boolean bool = (Boolean) obj2;
                if (str2 == null) {
                    f10Var.K(j3, false);
                    qs.e().k(qs.P4, 1, id.M0(bool.booleanValue() ? 2131743950 : 2131743949, null));
                    break;
                } else {
                    TLRPC.TL_textWithEntities tL_textWithEntities = new TLRPC.TL_textWithEntities();
                    tL_textWithEntities.text = str2;
                    z10Var.a(Boolean.valueOf(z9), Integer.valueOf(i10), tL_textWithEntities, str);
                    break;
                }
            default:
                String str3 = (String) obj;
                Boolean bool2 = (Boolean) obj2;
                if (str3 == null) {
                    f10Var.K(j3, false);
                    qs.e().k(qs.P4, 1, id.M0(bool2.booleanValue() ? 2131743950 : 2131743949, null));
                    break;
                } else {
                    TLRPC.TL_textWithEntities tL_textWithEntities2 = new TLRPC.TL_textWithEntities();
                    tL_textWithEntities2.text = str3;
                    z10Var.a(Boolean.valueOf(z9), Integer.valueOf(i10), tL_textWithEntities2, str);
                    break;
                }
        }
    }
}
