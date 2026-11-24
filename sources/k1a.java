// default package

import java.util.ArrayList;
import org.telegram.tgnet.tl.TL_update;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final /* synthetic */ class k1a implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ z3a b;
    public final /* synthetic */ TL_update.TL_updateNewChannelMessage c;
    public final /* synthetic */ long d;

    public /* synthetic */ k1a(z3a z3aVar, TL_update.TL_updateNewChannelMessage tL_updateNewChannelMessage, long j, byte b) {
        this.a = b;
        this.b = z3aVar;
        this.c = tL_updateNewChannelMessage;
        this.d = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        long j = this.d;
        TL_update.TL_updateNewChannelMessage tL_updateNewChannelMessage = this.c;
        z3a z3aVar = this.b;
        switch (b) {
            case 0:
                ArrayList arrayList = new ArrayList();
                arrayList.add(Integer.valueOf(tL_updateNewChannelMessage.message.id));
                z3aVar.getMessagesStorage().Z1(-j, arrayList, true, -1, 0, false, null);
                break;
            default:
                ArrayList arrayList2 = new ArrayList();
                arrayList2.add(Integer.valueOf(tL_updateNewChannelMessage.message.id));
                z3aVar.getMessagesStorage().Z1(-j, arrayList2, true, -1, 0, false, null);
                break;
        }
    }
}
