// default package

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final /* synthetic */ class ll implements sl {
    public final /* synthetic */ byte a;
    public final /* synthetic */ vl b;

    public /* synthetic */ ll(vl vlVar, byte b) {
        this.a = b;
        this.b = vlVar;
    }

    @Override // sl
    public final void a(TLRPC.Document document) {
        byte b = this.a;
        vl vlVar = this.b;
        switch (b) {
            case 0:
                vlVar.e = document;
                vlVar.i(false);
                break;
            default:
                vlVar.e = document;
                vlVar.i(false);
                break;
        }
    }
}
