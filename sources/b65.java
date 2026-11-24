// default package

import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.Vector;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final /* synthetic */ class b65 implements RequestDelegate {
    public final /* synthetic */ byte a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;

    public /* synthetic */ b65(jb6 jb6Var, boolean z, int i) {
        this.a = (byte) 1;
        this.d = jb6Var;
        this.b = z;
        this.c = i;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        byte b = this.a;
        Object obj = this.d;
        switch (b) {
            case 0:
                gm.c3(new ot1(obj, (Object) tLObject, this.c, this.b, (byte) 4));
                break;
            case 1:
                jb6 jb6Var = (jb6) obj;
                if (tLObject instanceof Vector) {
                    gm.c3(new ot1((Object) jb6Var, tLObject, this.b, this.c, (byte) 6));
                    break;
                }
                break;
            default:
                ((VoIPService) obj).lambda$startGroupCall$32(this.c, this.b, tLObject, tL_error);
                break;
        }
    }

    public /* synthetic */ b65(jm7 jm7Var, int i, boolean z, byte b) {
        this.a = b;
        this.d = jm7Var;
        this.c = i;
        this.b = z;
    }
}
