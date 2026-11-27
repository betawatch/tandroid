// default package

import j$.util.concurrent.ConcurrentHashMap;
import java.util.AbstractMap;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_ephemeral;
import org.telegram.tgnet.tl.TL_update;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public final class n44 {
    public final l44 a = new l44();
    public final l44 b = new l44();
    public final m44 c = new m44();
    public final m44 d = new m44();
    public final m44 e = new m44();

    public final void a(TL_update.TL_updateEditEphemeralMessage tL_updateEditEphemeralMessage, int i, ConcurrentHashMap concurrentHashMap, ConcurrentHashMap concurrentHashMap2) {
        TL_ephemeral.EphemeralMessage ephemeralMessage = tL_updateEditEphemeralMessage.message;
        if (ephemeralMessage.anchor_msg_id != 0) {
            this.e.a.add(ephemeralMessage);
            return;
        }
        if (!ephemeralMessage.welcome) {
            this.d.a.add(ephemeralMessage);
            return;
        }
        TLRPC.TL_message b = o44.b(ephemeralMessage);
        r47 r47Var = new r47(i, (TLRPC.Message) b, (AbstractMap) concurrentHashMap, (AbstractMap) concurrentHashMap2, true, true);
        b.edit_date = ConnectionsManager.getInstance(i).getCurrentTime();
        b.flags |= 32768;
        this.b.a(ephemeralMessage, b, r47Var);
    }

    public final void b(TL_update.TL_updateNewEphemeralMessage tL_updateNewEphemeralMessage, int i, ConcurrentHashMap concurrentHashMap, ConcurrentHashMap concurrentHashMap2) {
        TL_ephemeral.EphemeralMessage ephemeralMessage = tL_updateNewEphemeralMessage.message;
        if (ephemeralMessage.anchor_msg_id != 0) {
            this.e.a.add(ephemeralMessage);
        } else {
            if (!ephemeralMessage.welcome) {
                this.c.a.add(ephemeralMessage);
                return;
            }
            TLRPC.TL_message b = o44.b(ephemeralMessage);
            this.a.a(ephemeralMessage, b, new r47(i, (TLRPC.Message) b, (AbstractMap) concurrentHashMap, (AbstractMap) concurrentHashMap2, true, true));
        }
    }
}
