package org.telegram.ui.Components;

import android.content.Context;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public abstract class rs extends w51 {
    public final int K;
    public final int L;
    public final ArrayList M;
    public final ArrayList N;
    public final ArrayList O;
    public final ArrayList P;
    public boolean Q;
    public boolean R;
    public final ArrayList S;
    public boolean T;
    public boolean U;
    public boolean V;
    public int W;
    public int X;
    public String Y;
    public final vp Z;

    public rs(sl0 sl0Var, Context context, int i10, int i11) {
        super(sl0Var, context, i10, 0, false, null, null);
        this.M = new ArrayList();
        this.N = new ArrayList();
        this.O = new ArrayList();
        this.P = new ArrayList();
        this.S = new ArrayList();
        yn0 yn0Var = (yn0) this;
        this.Z = new vp(yn0Var, 6);
        this.s = new d(yn0Var, 9);
        this.K = i10;
        this.L = i11;
        N(false);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:19:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x007c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void V(boolean z4) {
        this.T = true;
        int i10 = this.X + 1;
        this.X = i10;
        TLRPC.TL_messages_searchGlobal tL_messages_searchGlobal = new TLRPC.TL_messages_searchGlobal();
        tL_messages_searchGlobal.broadcasts_only = true;
        int i11 = this.L;
        if (i11 != 0) {
            tL_messages_searchGlobal.flags |= 1;
            tL_messages_searchGlobal.folder_id = i11;
        }
        tL_messages_searchGlobal.q = this.Y;
        tL_messages_searchGlobal.limit = 25;
        tL_messages_searchGlobal.filter = new TLRPC.TL_inputMessagesFilterEmpty();
        int i12 = this.K;
        if (z4) {
            ArrayList arrayList = this.M;
            if (!arrayList.isEmpty()) {
                MessageObject messageObject = (MessageObject) kh.a2.i(1, arrayList);
                tL_messages_searchGlobal.offset_rate = this.W;
                tL_messages_searchGlobal.offset_id = messageObject.getId();
                if (messageObject.messageOwner.peer_id == null) {
                    tL_messages_searchGlobal.offset_peer = new TLRPC.TL_inputPeerEmpty();
                } else {
                    tL_messages_searchGlobal.offset_peer = MessagesController.getInstance(i12).getInputPeer(messageObject.messageOwner.peer_id);
                }
                AndroidUtilities.runOnUIThread(new org.telegram.messenger.voip.l0(this, i10, tL_messages_searchGlobal, z4, 4), !z4 ? 800L : 0L);
                if (z4) {
                    this.U = true;
                    TLRPC.TL_contacts_search tL_contacts_search = new TLRPC.TL_contacts_search();
                    tL_contacts_search.limit = 20;
                    tL_contacts_search.broadcasts = true;
                    tL_contacts_search.q = this.Y;
                    ConnectionsManager.getInstance(i12).sendRequestTyped(tL_contacts_search, new org.telegram.messenger.a(), new dh.v(17, this, tL_contacts_search));
                    return;
                }
                return;
            }
        }
        tL_messages_searchGlobal.offset_rate = 0;
        tL_messages_searchGlobal.offset_id = 0;
        tL_messages_searchGlobal.offset_peer = new TLRPC.TL_inputPeerEmpty();
        AndroidUtilities.runOnUIThread(new org.telegram.messenger.voip.l0(this, i10, tL_messages_searchGlobal, z4, 4), !z4 ? 800L : 0L);
        if (z4) {
        }
    }

    public final void W() {
        ArrayList arrayList = new ArrayList();
        int i10 = this.K;
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
        ArrayList arrayList2 = this.S;
        arrayList2.clear();
        arrayList2.addAll(arrayList);
    }
}
