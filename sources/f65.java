// default package

import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.Vector;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public final /* synthetic */ class f65 implements RequestDelegate {
    public final /* synthetic */ byte a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;

    public /* synthetic */ f65(ob6 ob6Var, boolean z, int i) {
        this.a = (byte) 1;
        this.d = ob6Var;
        this.b = z;
        this.c = i;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        byte b = this.a;
        Object obj = this.d;
        switch (b) {
            case 0:
                hl.c3(new ps1(obj, (Object) tLObject, this.c, this.b, (byte) 4));
                break;
            case 1:
                ob6 ob6Var = (ob6) obj;
                if (tLObject instanceof Vector) {
                    hl.c3(new ps1((Object) ob6Var, tLObject, this.b, this.c, (byte) 6));
                    break;
                }
                break;
            default:
                ((VoIPService) obj).lambda$startGroupCall$32(this.c, this.b, tLObject, tL_error);
                break;
        }
    }

    public /* synthetic */ f65(fn7 fn7Var, int i, boolean z, byte b) {
        this.a = b;
        this.d = fn7Var;
        this.c = i;
        this.b = z;
    }
}
