package kf;

import java.util.ArrayList;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.y3;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_ephemeral;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes.dex */
public class s {
    public final ArrayList a = new ArrayList();
    public final a0.h b = new a0.h();
    public final a0.h c = new a0.h();

    public static void a(s sVar, TL_ephemeral.EphemeralMessage ephemeralMessage, TLRPC.TL_message tL_message, MessageObject messageObject) {
        a0.h hVar = sVar.c;
        long dialogId = MessageObject.getDialogId(tL_message);
        sVar.a.add(ephemeralMessage);
        a0.h hVar2 = sVar.b;
        TLRPC.TL_messages_messages tL_messages_messages = (TLRPC.TL_messages_messages) hVar2.f(dialogId);
        if (tL_messages_messages == null) {
            tL_messages_messages = new TLRPC.TL_messages_messages();
            hVar2.k(tL_messages_messages, dialogId);
        }
        tL_messages_messages.messages.add(tL_message);
        ArrayList arrayList = (ArrayList) hVar.f(dialogId);
        if (arrayList == null) {
            arrayList = y3.l(dialogId, hVar);
        }
        arrayList.add(messageObject);
    }
}
