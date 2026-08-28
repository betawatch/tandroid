package org.telegram.ui.Components;

import android.content.Context;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public abstract class js extends z41 {
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
    public final np Y;

    public js(wk0 wk0Var, Context context, int i9, int i10) {
        super(wk0Var, context, i9, 0, false, null, null);
        this.L = new ArrayList();
        this.M = new ArrayList();
        this.N = new ArrayList();
        this.O = new ArrayList();
        this.R = new ArrayList();
        cn0 cn0Var = (cn0) this;
        this.Y = new np(cn0Var, 6);
        this.s = new d(cn0Var, 9);
        this.J = i9;
        this.K = i10;
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
        int i9 = this.W + 1;
        this.W = i9;
        TLRPC.TL_messages_searchGlobal tL_messages_searchGlobal = new TLRPC.TL_messages_searchGlobal();
        tL_messages_searchGlobal.broadcasts_only = true;
        int i10 = this.K;
        if (i10 != 0) {
            tL_messages_searchGlobal.flags |= 1;
            tL_messages_searchGlobal.folder_id = i10;
        }
        tL_messages_searchGlobal.q = this.X;
        tL_messages_searchGlobal.limit = 25;
        tL_messages_searchGlobal.filter = new TLRPC.TL_inputMessagesFilterEmpty();
        int i11 = this.J;
        if (z10) {
            ArrayList arrayList = this.L;
            if (!arrayList.isEmpty()) {
                MessageObject messageObject = (MessageObject) j3.r0.j(1, arrayList);
                tL_messages_searchGlobal.offset_rate = this.V;
                tL_messages_searchGlobal.offset_id = messageObject.getId();
                if (messageObject.messageOwner.peer_id == null) {
                    tL_messages_searchGlobal.offset_peer = new TLRPC.TL_inputPeerEmpty();
                } else {
                    tL_messages_searchGlobal.offset_peer = MessagesController.getInstance(i11).getInputPeer(messageObject.messageOwner.peer_id);
                }
                AndroidUtilities.runOnUIThread(new org.telegram.messenger.voip.j0(this, i9, tL_messages_searchGlobal, z10, 4), !z10 ? 800L : 0L);
                if (z10) {
                    this.T = true;
                    TLRPC.TL_contacts_search tL_contacts_search = new TLRPC.TL_contacts_search();
                    tL_contacts_search.limit = 20;
                    tL_contacts_search.broadcasts = true;
                    tL_contacts_search.q = this.X;
                    ConnectionsManager.getInstance(i11).sendRequestTyped(tL_contacts_search, new org.telegram.messenger.a(), new bg.y0(18, this, tL_contacts_search));
                    return;
                }
                return;
            }
        }
        tL_messages_searchGlobal.offset_rate = 0;
        tL_messages_searchGlobal.offset_id = 0;
        tL_messages_searchGlobal.offset_peer = new TLRPC.TL_inputPeerEmpty();
        AndroidUtilities.runOnUIThread(new org.telegram.messenger.voip.j0(this, i9, tL_messages_searchGlobal, z10, 4), !z10 ? 800L : 0L);
        if (z10) {
        }
    }

    public final void W() {
        ArrayList arrayList = new ArrayList();
        int i9 = this.J;
        ArrayList<TLRPC.Dialog> allDialogs = MessagesController.getInstance(i9).getAllDialogs();
        int size = allDialogs.size();
        int i10 = 0;
        while (i10 < size) {
            TLRPC.Dialog dialog = allDialogs.get(i10);
            i10++;
            TLRPC.Chat chat = MessagesController.getInstance(i9).getChat(Long.valueOf(-dialog.id));
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
