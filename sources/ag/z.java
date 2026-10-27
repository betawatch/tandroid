package ag;

import j$.util.concurrent.ConcurrentHashMap;
import java.util.AbstractMap;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_ephemeral;
import org.telegram.tgnet.tl.TL_update;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes.dex */
public final class z {
    public final x a = new x();
    public final x b = new x();
    public final y c = new y();
    public final y d = new y();
    public final y e = new y();

    public static void a(TL_update.TL_updateDeleteEphemeralMessages tL_updateDeleteEphemeralMessages) {
        DialogObject.getPeerDialogId(tL_updateDeleteEphemeralMessages.peer);
    }

    public final void b(TL_update.TL_updateEditEphemeralMessage tL_updateEditEphemeralMessage, int i10, ConcurrentHashMap concurrentHashMap, ConcurrentHashMap concurrentHashMap2) {
        TL_ephemeral.EphemeralMessage ephemeralMessage = tL_updateEditEphemeralMessage.message;
        if (ephemeralMessage.anchor_msg_id != 0) {
            this.e.a.add(ephemeralMessage);
            return;
        }
        if (!ephemeralMessage.welcome) {
            this.d.a.add(ephemeralMessage);
            return;
        }
        TLRPC.TL_message b10 = b0.b(ephemeralMessage);
        MessageObject messageObject = new MessageObject(i10, (TLRPC.Message) b10, (AbstractMap<Long, TLRPC.User>) concurrentHashMap, (AbstractMap<Long, TLRPC.Chat>) concurrentHashMap2, true, true);
        b10.edit_date = ConnectionsManager.getInstance(i10).getCurrentTime();
        b10.flags |= 32768;
        x.a(this.b, ephemeralMessage, b10, messageObject);
    }

    public final void c(TL_update.TL_updateNewEphemeralMessage tL_updateNewEphemeralMessage, int i10, ConcurrentHashMap concurrentHashMap, ConcurrentHashMap concurrentHashMap2) {
        TL_ephemeral.EphemeralMessage ephemeralMessage = tL_updateNewEphemeralMessage.message;
        if (ephemeralMessage.anchor_msg_id != 0) {
            this.e.a.add(ephemeralMessage);
        } else {
            if (!ephemeralMessage.welcome) {
                this.c.a.add(ephemeralMessage);
                return;
            }
            TLRPC.TL_message b10 = b0.b(ephemeralMessage);
            x.a(this.a, ephemeralMessage, b10, new MessageObject(i10, (TLRPC.Message) b10, (AbstractMap<Long, TLRPC.User>) concurrentHashMap, (AbstractMap<Long, TLRPC.Chat>) concurrentHashMap2, true, true));
        }
    }
}
