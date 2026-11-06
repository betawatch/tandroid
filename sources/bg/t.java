package bg;

import java.util.ArrayList;
import org.telegram.messenger.ij;
import org.telegram.messenger.k5;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_ephemeral;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes.dex */
public class t {
    public final ArrayList a = new ArrayList();
    public final a0.h b = new a0.h();
    public final a0.h c = new a0.h();

    public static void a(t tVar, TL_ephemeral.EphemeralMessage ephemeralMessage, TLRPC.TL_message tL_message, ij ijVar) {
        a0.h hVar = tVar.c;
        long B0 = ij.B0(tL_message);
        tVar.a.add(ephemeralMessage);
        a0.h hVar2 = tVar.b;
        TLRPC.TL_messages_messages tL_messages_messages = (TLRPC.TL_messages_messages) hVar2.f(B0);
        if (tL_messages_messages == null) {
            tL_messages_messages = new TLRPC.TL_messages_messages();
            hVar2.k(tL_messages_messages, B0);
        }
        tL_messages_messages.messages.add(tL_message);
        ArrayList arrayList = (ArrayList) hVar.f(B0);
        if (arrayList == null) {
            arrayList = k5.j(hVar, B0);
        }
        arrayList.add(ijVar);
    }
}
