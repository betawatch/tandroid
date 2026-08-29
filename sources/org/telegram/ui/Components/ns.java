package org.telegram.ui.Components;

import android.content.Context;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public abstract class ns extends k51 {
    public final int J;
    public final int K;
    public final ArrayList L;
    public final ArrayList M;
    public final ArrayList N;
    public final ArrayList O;
    public boolean P;
    public boolean Q;
    public final ArrayList R;
    public boolean S;
    public boolean T;
    public boolean U;
    public int V;
    public int W;
    public String X;
    public final rp Y;

    public ns(jl0 jl0Var, Context context, int i10, int i11) {
        super(jl0Var, context, i10, 0, false, null, null);
        this.L = new ArrayList();
        this.M = new ArrayList();
        this.N = new ArrayList();
        this.O = new ArrayList();
        this.R = new ArrayList();
        on0 on0Var = (on0) this;
        this.Y = new rp(on0Var, 6);
        this.s = new d(on0Var, 9);
        this.J = i10;
        this.K = i11;
        N(false);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:19:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x007c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void V(boolean z10) {
        this.S = true;
        int i10 = this.W + 1;
        this.W = i10;
        TLRPC.TL_messages_searchGlobal tL_messages_searchGlobal = new TLRPC.TL_messages_searchGlobal();
        tL_messages_searchGlobal.broadcasts_only = true;
        int i11 = this.K;
        if (i11 != 0) {
            tL_messages_searchGlobal.flags |= 1;
            tL_messages_searchGlobal.folder_id = i11;
        }
        tL_messages_searchGlobal.q = this.X;
        tL_messages_searchGlobal.limit = 25;
        tL_messages_searchGlobal.filter = new TLRPC.TL_inputMessagesFilterEmpty();
        int i12 = this.J;
        if (z10) {
            ArrayList arrayList = this.L;
            if (!arrayList.isEmpty()) {
                MessageObject messageObject = (MessageObject) j7.l1.i(1, arrayList);
                tL_messages_searchGlobal.offset_rate = this.V;
                tL_messages_searchGlobal.offset_id = messageObject.getId();
                if (messageObject.messageOwner.peer_id == null) {
                    tL_messages_searchGlobal.offset_peer = new TLRPC.TL_inputPeerEmpty();
                } else {
                    tL_messages_searchGlobal.offset_peer = MessagesController.getInstance(i12).getInputPeer(messageObject.messageOwner.peer_id);
                }
                AndroidUtilities.runOnUIThread(new org.telegram.messenger.voip.k0(this, i10, tL_messages_searchGlobal, z10, 4), !z10 ? 800L : 0L);
                if (z10) {
                    this.T = true;
                    TLRPC.TL_contacts_search tL_contacts_search = new TLRPC.TL_contacts_search();
                    tL_contacts_search.limit = 20;
                    tL_contacts_search.broadcasts = true;
                    tL_contacts_search.q = this.X;
                    ConnectionsManager.getInstance(i12).sendRequestTyped(tL_contacts_search, new org.telegram.messenger.a(), new bh.v(18, this, tL_contacts_search));
                    return;
                }
                return;
            }
        }
        tL_messages_searchGlobal.offset_rate = 0;
        tL_messages_searchGlobal.offset_id = 0;
        tL_messages_searchGlobal.offset_peer = new TLRPC.TL_inputPeerEmpty();
        AndroidUtilities.runOnUIThread(new org.telegram.messenger.voip.k0(this, i10, tL_messages_searchGlobal, z10, 4), !z10 ? 800L : 0L);
        if (z10) {
        }
    }

    public final void W() {
        ArrayList arrayList = new ArrayList();
        int i10 = this.J;
        ArrayList<TLRPC.Dialog> allDialogs = MessagesController.getInstance(i10).getAllDialogs();
        int size = allDialogs.size();
        int i11 = 0;
        while (i11 < size) {
            TLRPC.Dialog dialog = allDialogs.get(i11);
            i11++;
            TLRPC.Chat chat = MessagesController.getInstance(i10).getChat(Long.valueOf(-dialog.id));
            if (chat != null && ChatObject.isChannelAndNotMegaGroup(chat) && ChatObject.isPublic(chat) && !ChatObject.isNotInChat(chat)) {
                arrayList.add(chat);
                if (arrayList.size() >= 100) {
                    break;
                }
            }
        }
        ArrayList arrayList2 = this.R;
        arrayList2.clear();
        arrayList2.addAll(arrayList);
    }
}
