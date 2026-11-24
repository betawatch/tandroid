// default package

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class n2c implements jac {
    public final /* synthetic */ byte a;
    public final /* synthetic */ b3c b;
    public final /* synthetic */ nac c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ int e;
    public final /* synthetic */ String f;
    public final /* synthetic */ long g;

    public /* synthetic */ n2c(b3c b3cVar, nac nacVar, boolean z, int i, String str, long j, byte b) {
        this.a = b;
        this.b = b3cVar;
        this.c = nacVar;
        this.d = z;
        this.e = i;
        this.f = str;
        this.g = j;
    }

    @Override // jac
    public final void a(Object obj, Object obj2) {
        byte b = this.a;
        long j = this.g;
        String str = this.f;
        int i = this.e;
        boolean z = this.d;
        nac nacVar = this.c;
        b3c b3cVar = this.b;
        switch (b) {
            case 0:
                String str2 = (String) obj;
                Boolean bool = (Boolean) obj2;
                if (str2 == null) {
                    b3cVar.K(j, false);
                    nm7.e().k(nm7.T4, 1, jb6.M0(bool.booleanValue() ? 2131743634 : 2131743633, null));
                    break;
                } else {
                    TLRPC.TL_textWithEntities tL_textWithEntities = new TLRPC.TL_textWithEntities();
                    tL_textWithEntities.text = str2;
                    nacVar.a(Boolean.valueOf(z), Integer.valueOf(i), tL_textWithEntities, str);
                    break;
                }
            default:
                String str3 = (String) obj;
                Boolean bool2 = (Boolean) obj2;
                if (str3 == null) {
                    b3cVar.K(j, false);
                    nm7.e().k(nm7.T4, 1, jb6.M0(bool2.booleanValue() ? 2131743634 : 2131743633, null));
                    break;
                } else {
                    TLRPC.TL_textWithEntities tL_textWithEntities2 = new TLRPC.TL_textWithEntities();
                    tL_textWithEntities2.text = str3;
                    nacVar.a(Boolean.valueOf(z), Integer.valueOf(i), tL_textWithEntities2, str);
                    break;
                }
        }
    }
}
