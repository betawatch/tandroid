// default package

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final /* synthetic */ class n0c implements i8c {
    public final /* synthetic */ byte a;
    public final /* synthetic */ b1c b;
    public final /* synthetic */ m8c c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ int e;
    public final /* synthetic */ String f;
    public final /* synthetic */ long g;

    public /* synthetic */ n0c(b1c b1cVar, m8c m8cVar, boolean z, int i, String str, long j, byte b) {
        this.a = b;
        this.b = b1cVar;
        this.c = m8cVar;
        this.d = z;
        this.e = i;
        this.f = str;
        this.g = j;
    }

    @Override // i8c
    public final void a(Object obj, Object obj2) {
        byte b = this.a;
        long j = this.g;
        String str = this.f;
        int i = this.e;
        boolean z = this.d;
        m8c m8cVar = this.c;
        b1c b1cVar = this.b;
        switch (b) {
            case 0:
                String str2 = (String) obj;
                Boolean bool = (Boolean) obj2;
                if (str2 == null) {
                    b1cVar.K(j, false);
                    kk7.e().k(kk7.R4, 1, k96.M0(bool.booleanValue() ? 2131743708 : 2131743707, null));
                    break;
                } else {
                    TLRPC.TL_textWithEntities tL_textWithEntities = new TLRPC.TL_textWithEntities();
                    tL_textWithEntities.text = str2;
                    m8cVar.a(Boolean.valueOf(z), Integer.valueOf(i), tL_textWithEntities, str);
                    break;
                }
            default:
                String str3 = (String) obj;
                Boolean bool2 = (Boolean) obj2;
                if (str3 == null) {
                    b1cVar.K(j, false);
                    kk7.e().k(kk7.R4, 1, k96.M0(bool2.booleanValue() ? 2131743708 : 2131743707, null));
                    break;
                } else {
                    TLRPC.TL_textWithEntities tL_textWithEntities2 = new TLRPC.TL_textWithEntities();
                    tL_textWithEntities2.text = str3;
                    m8cVar.a(Boolean.valueOf(z), Integer.valueOf(i), tL_textWithEntities2, str);
                    break;
                }
        }
    }
}
