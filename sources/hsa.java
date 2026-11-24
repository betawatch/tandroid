// default package

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final /* synthetic */ class hsa implements RequestDelegate {
    public final /* synthetic */ byte a;
    public final /* synthetic */ gta b;

    public /* synthetic */ hsa(gta gtaVar, byte b) {
        this.a = b;
        this.b = gtaVar;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        byte b = this.a;
        gta gtaVar = this.b;
        switch (b) {
            case 0:
                gl.d3(new lsa(gtaVar, tLObject, (byte) 0));
                break;
            case 1:
                gl.d3(new lsa(gtaVar, tLObject, (byte) 1));
                break;
            case 2:
                gl.d3(new lsa(gtaVar, tLObject, (byte) 2));
                break;
            case 3:
                gl.d3(new lsa(gtaVar, tLObject, (byte) 3));
                break;
            default:
                gl.d3(new lsa(gtaVar, tLObject, (byte) 4));
                break;
        }
    }
}
