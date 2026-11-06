package bg;

import j$.util.concurrent.ConcurrentHashMap;
import java.util.AbstractMap;
import org.telegram.messenger.ij;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_ephemeral;
import org.telegram.tgnet.tl.TL_update;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes.dex */
public final class v {
    public final t a = new t();
    public final t b = new t();
    public final u c = new u();
    public final u d = new u();
    public final u e = new u();

    public final void a(TL_update.TL_updateEditEphemeralMessage tL_updateEditEphemeralMessage, int i7, ConcurrentHashMap concurrentHashMap, ConcurrentHashMap concurrentHashMap2) {
        TL_ephemeral.EphemeralMessage ephemeralMessage = tL_updateEditEphemeralMessage.message;
        if (ephemeralMessage.anchor_msg_id != 0) {
            this.e.a.add(ephemeralMessage);
            return;
        }
        if (!ephemeralMessage.welcome) {
            this.d.a.add(ephemeralMessage);
            return;
        }
        TLRPC.TL_message b10 = w.b(ephemeralMessage);
        ij ijVar = new ij(i7, (TLRPC.Message) b10, (AbstractMap) concurrentHashMap, (AbstractMap) concurrentHashMap2, true, true);
        b10.edit_date = ConnectionsManager.getInstance(i7).getCurrentTime();
        b10.flags |= 32768;
        t.a(this.b, ephemeralMessage, b10, ijVar);
    }

    public final void b(TL_update.TL_updateNewEphemeralMessage tL_updateNewEphemeralMessage, int i7, ConcurrentHashMap concurrentHashMap, ConcurrentHashMap concurrentHashMap2) {
        TL_ephemeral.EphemeralMessage ephemeralMessage = tL_updateNewEphemeralMessage.message;
        if (ephemeralMessage.anchor_msg_id != 0) {
            this.e.a.add(ephemeralMessage);
        } else {
            if (!ephemeralMessage.welcome) {
                this.c.a.add(ephemeralMessage);
                return;
            }
            TLRPC.TL_message b10 = w.b(ephemeralMessage);
            t.a(this.a, ephemeralMessage, b10, new ij(i7, (TLRPC.Message) b10, (AbstractMap) concurrentHashMap, (AbstractMap) concurrentHashMap2, true, true));
        }
    }
}
