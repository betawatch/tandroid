// default package

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
public final /* synthetic */ class ad6 implements RequestDelegate {
    public final /* synthetic */ byte a;
    public final /* synthetic */ id6 b;

    public /* synthetic */ ad6(id6 id6Var, byte b) {
        this.a = b;
        this.b = id6Var;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        byte b = this.a;
        id6 id6Var = this.b;
        switch (b) {
            case 0:
                if (tL_error == null) {
                    id6Var.getMessagesController().Y3((TLRPC.Updates) tLObject, false);
                    break;
                }
                break;
            case 1:
                if (tL_error == null) {
                    id6Var.getMessagesController().Y3((TLRPC.Updates) tLObject, false);
                    break;
                }
                break;
            default:
                if (!(tLObject instanceof TLRPC.TL_messages_affectedMessages)) {
                    id6Var.getClass();
                    break;
                } else {
                    TLRPC.TL_messages_affectedMessages tL_messages_affectedMessages = (TLRPC.TL_messages_affectedMessages) tLObject;
                    id6Var.getMessagesController().W3(tL_messages_affectedMessages.pts, -1, tL_messages_affectedMessages.pts_count);
                    break;
                }
        }
    }
}
