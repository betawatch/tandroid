// default package

import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.Vector;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public final /* synthetic */ class c45 implements RequestDelegate {
    public final /* synthetic */ byte a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;

    public /* synthetic */ c45(k96 k96Var, boolean z, int i) {
        this.a = (byte) 1;
        this.d = k96Var;
        this.b = z;
        this.c = i;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        byte b = this.a;
        Object obj = this.d;
        switch (b) {
            case 0:
                gl.d3(new bs1(obj, (Object) tLObject, this.c, this.b, (byte) 4));
                break;
            case 1:
                k96 k96Var = (k96) obj;
                if (tLObject instanceof Vector) {
                    gl.d3(new bs1((Object) k96Var, tLObject, this.b, this.c, (byte) 6));
                    break;
                }
                break;
            default:
                ((VoIPService) obj).lambda$startGroupCall$32(this.c, this.b, tLObject, tL_error);
                break;
        }
    }

    public /* synthetic */ c45(gk7 gk7Var, int i, boolean z, byte b) {
        this.a = b;
        this.d = gk7Var;
        this.c = i;
        this.b = z;
    }
}
