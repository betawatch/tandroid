package bg;

import java.util.ArrayList;
import org.telegram.messenger.f3;
import org.telegram.messenger.gj;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_ephemeral;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes.dex */
public class u {
    public final ArrayList a = new ArrayList();
    public final a0.h b = new a0.h();
    public final a0.h c = new a0.h();

    public static void a(u uVar, TL_ephemeral.EphemeralMessage ephemeralMessage, TLRPC.TL_message tL_message, gj gjVar) {
        a0.h hVar = uVar.c;
        long B0 = gj.B0(tL_message);
        uVar.a.add(ephemeralMessage);
        a0.h hVar2 = uVar.b;
        TLRPC.TL_messages_messages tL_messages_messages = (TLRPC.TL_messages_messages) hVar2.f(B0);
        if (tL_messages_messages == null) {
            tL_messages_messages = new TLRPC.TL_messages_messages();
            hVar2.k(tL_messages_messages, B0);
        }
        tL_messages_messages.messages.add(tL_message);
        ArrayList arrayList = (ArrayList) hVar.f(B0);
        if (arrayList == null) {
            arrayList = f3.h(hVar, B0);
        }
        arrayList.add(gjVar);
    }
}
