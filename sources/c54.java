// default package

import j$.util.concurrent.ConcurrentHashMap;
import java.util.AbstractMap;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_ephemeral;
import org.telegram.tgnet.tl.TL_update;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class c54 {
    public final a54 a = new a54();
    public final a54 b = new a54();
    public final b54 c = new b54();
    public final b54 d = new b54();
    public final b54 e = new b54();

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
        TLRPC.TL_message b = d54.b(ephemeralMessage);
        k47 k47Var = new k47(i, (TLRPC.Message) b, (AbstractMap) concurrentHashMap, (AbstractMap) concurrentHashMap2, true, true);
        b.edit_date = ConnectionsManager.getInstance(i).getCurrentTime();
        b.flags |= 32768;
        this.b.a(ephemeralMessage, b, k47Var);
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
            TLRPC.TL_message b = d54.b(ephemeralMessage);
            this.a.a(ephemeralMessage, b, new k47(i, (TLRPC.Message) b, (AbstractMap) concurrentHashMap, (AbstractMap) concurrentHashMap2, true, true));
        }
    }
}
