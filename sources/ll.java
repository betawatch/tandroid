// default package

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
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
