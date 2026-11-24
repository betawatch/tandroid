// default package

import org.telegram.tgnet.tl.TL_update;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final /* synthetic */ class d5a implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ a6a b;
    public final /* synthetic */ TL_update.TL_updateNewMessage c;

    public /* synthetic */ d5a(a6a a6aVar, TL_update.TL_updateNewMessage tL_updateNewMessage, byte b) {
        this.a = b;
        this.b = a6aVar;
        this.c = tL_updateNewMessage;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        TL_update.TL_updateNewMessage tL_updateNewMessage = this.c;
        a6a a6aVar = this.b;
        switch (b) {
            case 0:
                a6aVar.getMessagesController().R3(tL_updateNewMessage.pts, -1, tL_updateNewMessage.pts_count);
                break;
            case 1:
                a6aVar.getMessagesController().R3(tL_updateNewMessage.pts, -1, tL_updateNewMessage.pts_count);
                break;
            default:
                a6aVar.getMessagesController().R3(tL_updateNewMessage.pts, -1, tL_updateNewMessage.pts_count);
                break;
        }
    }
}
