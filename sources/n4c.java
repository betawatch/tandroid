// default package

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final /* synthetic */ class n4c implements icc {
    public final /* synthetic */ byte a;
    public final /* synthetic */ a5c b;
    public final /* synthetic */ mcc c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ int e;
    public final /* synthetic */ String f;
    public final /* synthetic */ long g;

    public /* synthetic */ n4c(a5c a5cVar, mcc mccVar, boolean z, int i, String str, long j, byte b) {
        this.a = b;
        this.b = a5cVar;
        this.c = mccVar;
        this.d = z;
        this.e = i;
        this.f = str;
        this.g = j;
    }

    @Override // icc
    public final void a(Object obj, Object obj2) {
        byte b = this.a;
        long j = this.g;
        String str = this.f;
        int i = this.e;
        boolean z = this.d;
        mcc mccVar = this.c;
        a5c a5cVar = this.b;
        switch (b) {
            case 0:
                String str2 = (String) obj;
                Boolean bool = (Boolean) obj2;
                if (str2 == null) {
                    a5cVar.K(j, false);
                    jn7.e().k(jn7.S4, 1, ob6.M0(bool.booleanValue() ? 2131743602 : 2131743601, null));
                    break;
                } else {
                    TLRPC.TL_textWithEntities tL_textWithEntities = new TLRPC.TL_textWithEntities();
                    tL_textWithEntities.text = str2;
                    mccVar.a(Boolean.valueOf(z), Integer.valueOf(i), tL_textWithEntities, str);
                    break;
                }
            default:
                String str3 = (String) obj;
                Boolean bool2 = (Boolean) obj2;
                if (str3 == null) {
                    a5cVar.K(j, false);
                    jn7.e().k(jn7.S4, 1, ob6.M0(bool2.booleanValue() ? 2131743602 : 2131743601, null));
                    break;
                } else {
                    TLRPC.TL_textWithEntities tL_textWithEntities2 = new TLRPC.TL_textWithEntities();
                    tL_textWithEntities2.text = str3;
                    mccVar.a(Boolean.valueOf(z), Integer.valueOf(i), tL_textWithEntities2, str);
                    break;
                }
        }
    }
}
