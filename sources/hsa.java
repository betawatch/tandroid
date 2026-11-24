// default package

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
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
                gl.c3(new lsa(gtaVar, tLObject, (byte) 0));
                break;
            case 1:
                gl.c3(new lsa(gtaVar, tLObject, (byte) 1));
                break;
            case 2:
                gl.c3(new lsa(gtaVar, tLObject, (byte) 2));
                break;
            case 3:
                gl.c3(new lsa(gtaVar, tLObject, (byte) 3));
                break;
            default:
                gl.c3(new lsa(gtaVar, tLObject, (byte) 4));
                break;
        }
    }
}
