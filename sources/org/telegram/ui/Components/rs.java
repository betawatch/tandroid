package org.telegram.ui.Components;

import android.content.Context;
import android.text.TextUtils;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public class rs extends x51 {
    public final int K;
    public final int L;
    public final boolean M;
    public final qs N;
    public final ArrayList O;
    public final ArrayList P;
    public final ArrayList Q;
    public boolean R;
    public boolean S;
    public final CharSequence T;
    public int U;
    public int V;
    public boolean W;
    public boolean X;
    public boolean Y;
    public int Z;
    public int a0;
    public String b0;
    public final ns c0;
    public boolean d0;
    public final v2 e0;

    public rs(tl0 tl0Var, Context context, int i10, int i11, boolean z4, org.telegram.ui.ActionBar.g6 g6Var) {
        super(tl0Var, context, i10, 0, true, null, g6Var);
        this.O = new ArrayList();
        this.P = new ArrayList();
        this.Q = new ArrayList();
        this.c0 = new ns(this, 0);
        this.d0 = true;
        this.e0 = new v2(this, 3);
        this.s = new d(this, 8);
        this.K = i10;
        this.L = i11;
        this.M = z4;
        this.N = new qs(i10, new ns(this, 1));
        this.T = AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.AppsTabInfo), new mh.a(this, g6Var, context)), true);
        N(false);
        MediaDataController.getInstance(i10).loadHints(true);
    }

    public final void V() {
        boolean isEmpty = TextUtils.isEmpty(this.b0);
        tl0 tl0Var = this.d;
        if (isEmpty) {
            if (!this.d0) {
                if (tl0Var != null) {
                    for (int i10 = 0; i10 < tl0Var.getChildCount(); i10++) {
                        if (!(tl0Var.getChildAt(i10) instanceof u00)) {
                        }
                    }
                }
            }
            this.N.a();
            break;
        }
        if (this.Y && !this.W && tl0Var != null) {
            int i11 = 0;
            while (true) {
                if (i11 >= tl0Var.getChildCount()) {
                    break;
                }
                if (!(tl0Var.getChildAt(i11) instanceof u00)) {
                    i11++;
                } else if (this.Y && !this.W && !TextUtils.isEmpty(this.b0)) {
                    W(true);
                }
            }
        }
        this.d0 = false;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:19:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x007c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void W(boolean z4) {
        this.W = true;
        int i10 = this.a0 + 1;
        this.a0 = i10;
        TLRPC.TL_messages_searchGlobal tL_messages_searchGlobal = new TLRPC.TL_messages_searchGlobal();
        tL_messages_searchGlobal.broadcasts_only = false;
        int i11 = this.L;
        if (i11 != 0) {
            tL_messages_searchGlobal.flags |= 1;
            tL_messages_searchGlobal.folder_id = i11;
        }
        tL_messages_searchGlobal.q = this.b0;
        tL_messages_searchGlobal.limit = 25;
        tL_messages_searchGlobal.filter = new TLRPC.TL_inputMessagesFilterEmpty();
        int i12 = this.K;
        if (z4) {
            ArrayList arrayList = this.Q;
            if (!arrayList.isEmpty()) {
                MessageObject messageObject = (MessageObject) l.d.i(1, arrayList);
                tL_messages_searchGlobal.offset_rate = this.Z;
                tL_messages_searchGlobal.offset_id = messageObject.getId();
                if (messageObject.messageOwner.peer_id == null) {
                    tL_messages_searchGlobal.offset_peer = new TLRPC.TL_inputPeerEmpty();
                } else {
                    tL_messages_searchGlobal.offset_peer = MessagesController.getInstance(i12).getInputPeer(messageObject.messageOwner.peer_id);
                }
                AndroidUtilities.runOnUIThread(new org.telegram.messenger.voip.l0(this, i10, tL_messages_searchGlobal, z4, 3), !z4 ? 800L : 0L);
                if (z4) {
                    this.X = true;
                    TLRPC.TL_contacts_search tL_contacts_search = new TLRPC.TL_contacts_search();
                    tL_contacts_search.limit = 30;
                    tL_contacts_search.bots = true;
                    tL_contacts_search.q = this.b0;
                    ConnectionsManager.getInstance(i12).sendRequestTyped(tL_contacts_search, new org.telegram.messenger.a(), new eh.w(16, this, tL_contacts_search));
                    return;
                }
                return;
            }
        }
        tL_messages_searchGlobal.offset_rate = 0;
        tL_messages_searchGlobal.offset_id = 0;
        tL_messages_searchGlobal.offset_peer = new TLRPC.TL_inputPeerEmpty();
        AndroidUtilities.runOnUIThread(new org.telegram.messenger.voip.l0(this, i10, tL_messages_searchGlobal, z4, 3), !z4 ? 800L : 0L);
        if (z4) {
        }
    }
}
