// default package

import java.util.ArrayList;
import org.telegram.tgnet.tl.TL_update;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final /* synthetic */ class m3a implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ a6a b;
    public final /* synthetic */ TL_update.TL_updateNewChannelMessage c;
    public final /* synthetic */ long d;

    public /* synthetic */ m3a(a6a a6aVar, TL_update.TL_updateNewChannelMessage tL_updateNewChannelMessage, long j, byte b) {
        this.a = b;
        this.b = a6aVar;
        this.c = tL_updateNewChannelMessage;
        this.d = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        long j = this.d;
        TL_update.TL_updateNewChannelMessage tL_updateNewChannelMessage = this.c;
        a6a a6aVar = this.b;
        switch (b) {
            case 0:
                ArrayList arrayList = new ArrayList();
                arrayList.add(Integer.valueOf(tL_updateNewChannelMessage.message.id));
                a6aVar.getMessagesStorage().Z1(-j, arrayList, true, -1, 0, false, null);
                break;
            default:
                ArrayList arrayList2 = new ArrayList();
                arrayList2.add(Integer.valueOf(tL_updateNewChannelMessage.message.id));
                a6aVar.getMessagesStorage().Z1(-j, arrayList2, true, -1, 0, false, null);
                break;
        }
    }
}
