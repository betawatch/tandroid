package dh;

import java.util.ArrayList;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.i51;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final /* synthetic */ class m implements Utilities.Callback2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ t b;

    public /* synthetic */ m(t tVar, int i10) {
        this.a = i10;
        this.b = tVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // org.telegram.messenger.Utilities.Callback2
    public final void run(Object obj, Object obj2) {
        int i10 = this.a;
        t tVar = this.b;
        Object[] objArr = 0;
        switch (i10) {
            case 0:
                ArrayList arrayList = (ArrayList) obj;
                arrayList.clear();
                ArrayList arrayList2 = tVar.j;
                int size = arrayList2.size();
                int i11 = 0;
                while (i11 < size) {
                    Object obj3 = arrayList2.get(i11);
                    i11++;
                    TLRPC.MessagePeerVote messagePeerVote = (TLRPC.MessagePeerVote) obj3;
                    long peerDialogId = DialogObject.getPeerDialogId(messagePeerVote.peer);
                    TLObject userOrChat = MessagesController.getInstance(tVar.a).getUserOrChat(peerDialogId);
                    int i12 = messagePeerVote.date;
                    s sVar = new s(tVar, peerDialogId, objArr == true ? 1 : 0);
                    int i13 = p.a;
                    i51 J = i51.J(p.class);
                    J.G = userOrChat;
                    J.B = peerDialogId;
                    J.z = i12;
                    J.D = sVar;
                    arrayList.add(J);
                }
                if (!tVar.h) {
                    if (!arrayList2.isEmpty()) {
                        int i14 = r.a;
                        arrayList.add(i51.J(r.class));
                        break;
                    } else {
                        int i15 = q.a;
                        arrayList.add(i51.J(q.class));
                        arrayList.add(i51.J(q.class));
                        arrayList.add(i51.J(q.class));
                        arrayList.add(i51.J(q.class));
                        arrayList.add(i51.J(q.class));
                        break;
                    }
                }
                break;
            default:
                TLRPC.TL_messages_votesList tL_messages_votesList = (TLRPC.TL_messages_votesList) obj;
                int i16 = tVar.a;
                tVar.i = false;
                if (tL_messages_votesList == null) {
                    tVar.g = null;
                    tVar.h = true;
                    break;
                } else {
                    MessagesController.getInstance(i16).putUsers(tL_messages_votesList.users, false);
                    MessagesController.getInstance(i16).putChats(tL_messages_votesList.chats, false);
                    String str = tL_messages_votesList.next_offset;
                    tVar.g = str;
                    tVar.h = str == null;
                    tVar.j.addAll(tL_messages_votesList.votes);
                    ag.d dVar = tVar.e;
                    if (dVar != null) {
                        dVar.run();
                        break;
                    }
                }
                break;
        }
    }
}
