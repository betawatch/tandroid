// default package

import org.telegram.tgnet.tl.TL_update;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public final /* synthetic */ class h5a implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ r7a b;
    public final /* synthetic */ TL_update.TL_updateNewMessage c;

    public /* synthetic */ h5a(r7a r7aVar, TL_update.TL_updateNewMessage tL_updateNewMessage, byte b) {
        this.a = b;
        this.b = r7aVar;
        this.c = tL_updateNewMessage;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        TL_update.TL_updateNewMessage tL_updateNewMessage = this.c;
        r7a r7aVar = this.b;
        switch (b) {
            case 0:
                r7aVar.getMessagesController().W3(tL_updateNewMessage.pts, -1, tL_updateNewMessage.pts_count);
                break;
            case 1:
                r7aVar.getMessagesController().W3(tL_updateNewMessage.pts, -1, tL_updateNewMessage.pts_count);
                break;
            default:
                r7aVar.getMessagesController().W3(tL_updateNewMessage.pts, -1, tL_updateNewMessage.pts_count);
                break;
        }
    }
}
