package eh;

import java.util.ArrayList;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.j51;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final /* synthetic */ class n implements Utilities.Callback2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ u b;

    public /* synthetic */ n(u uVar, int i10) {
        this.a = i10;
        this.b = uVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // org.telegram.messenger.Utilities.Callback2
    public final void run(Object obj, Object obj2) {
        int i10 = this.a;
        u uVar = this.b;
        Object[] objArr = 0;
        switch (i10) {
            case 0:
                ArrayList arrayList = (ArrayList) obj;
                arrayList.clear();
                ArrayList arrayList2 = uVar.j;
                int size = arrayList2.size();
                int i11 = 0;
                while (i11 < size) {
                    Object obj3 = arrayList2.get(i11);
                    i11++;
                    TLRPC.MessagePeerVote messagePeerVote = (TLRPC.MessagePeerVote) obj3;
                    long peerDialogId = DialogObject.getPeerDialogId(messagePeerVote.peer);
                    TLObject userOrChat = MessagesController.getInstance(uVar.a).getUserOrChat(peerDialogId);
                    int i12 = messagePeerVote.date;
                    t tVar = new t(uVar, peerDialogId, objArr == true ? 1 : 0);
                    int i13 = q.a;
                    j51 J = j51.J(q.class);
                    J.G = userOrChat;
                    J.B = peerDialogId;
                    J.z = i12;
                    J.D = tVar;
                    arrayList.add(J);
                }
                if (!uVar.h) {
                    if (!arrayList2.isEmpty()) {
                        int i14 = s.a;
                        arrayList.add(j51.J(s.class));
                        break;
                    } else {
                        int i15 = r.a;
                        arrayList.add(j51.J(r.class));
                        arrayList.add(j51.J(r.class));
                        arrayList.add(j51.J(r.class));
                        arrayList.add(j51.J(r.class));
                        arrayList.add(j51.J(r.class));
                        break;
                    }
                }
                break;
            default:
                TLRPC.TL_messages_votesList tL_messages_votesList = (TLRPC.TL_messages_votesList) obj;
                int i16 = uVar.a;
                uVar.i = false;
                if (tL_messages_votesList == null) {
                    uVar.g = null;
                    uVar.h = true;
                    break;
                } else {
                    MessagesController.getInstance(i16).putUsers(tL_messages_votesList.users, false);
                    MessagesController.getInstance(i16).putChats(tL_messages_votesList.chats, false);
                    String str = tL_messages_votesList.next_offset;
                    uVar.g = str;
                    uVar.h = str == null;
                    uVar.j.addAll(tL_messages_votesList.votes);
                    m mVar = uVar.e;
                    if (mVar != null) {
                        mVar.run();
                        break;
                    }
                }
                break;
        }
    }
}
