package bg;

import java.util.ArrayList;
import org.telegram.messenger.ij;
import org.telegram.messenger.k5;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_ephemeral;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
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
