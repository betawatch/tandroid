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

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public class fs extends b51 {
    public final int J;
    public final int K;
    public final boolean L;
    public final es M;
    public final ArrayList N;
    public final ArrayList O;
    public final ArrayList P;
    public boolean Q;
    public boolean R;
    public final CharSequence S;
    public int T;
    public int U;
    public boolean V;
    public boolean W;
    public boolean X;
    public int Y;
    public int Z;
    public String a0;
    public final bs b0;
    public boolean c0;
    public final v2 d0;

    public fs(zk0 zk0Var, Context context, int i10, int i11, boolean z10, org.telegram.ui.ActionBar.c6 c6Var) {
        super(zk0Var, context, i10, 0, true, null, c6Var);
        this.N = new ArrayList();
        this.O = new ArrayList();
        this.P = new ArrayList();
        this.b0 = new bs(this, 0);
        this.c0 = true;
        this.d0 = new v2(this, 3);
        this.s = new d(this, 8);
        this.J = i10;
        this.K = i11;
        this.L = z10;
        this.M = new es(i10, new bs(this, 1));
        this.S = AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.AppsTabInfo), new hh.a(this, c6Var, context)), true);
        N(false);
        MediaDataController.getInstance(i10).loadHints(true);
    }

    public final void V() {
        boolean isEmpty = TextUtils.isEmpty(this.a0);
        zk0 zk0Var = this.d;
        if (isEmpty) {
            if (!this.c0) {
                if (zk0Var != null) {
                    for (int i10 = 0; i10 < zk0Var.getChildCount(); i10++) {
                        if (!(zk0Var.getChildAt(i10) instanceof h00)) {
                        }
                    }
                }
            }
            this.M.a();
            break;
        }
        if (this.X && !this.V && zk0Var != null) {
            int i11 = 0;
            while (true) {
                if (i11 >= zk0Var.getChildCount()) {
                    break;
                }
                if (!(zk0Var.getChildAt(i11) instanceof h00)) {
                    i11++;
                } else if (this.X && !this.V && !TextUtils.isEmpty(this.a0)) {
                    W(true);
                }
            }
        }
        this.c0 = false;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:19:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x007c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void W(boolean z10) {
        this.V = true;
        int i10 = this.Z + 1;
        this.Z = i10;
        TLRPC.TL_messages_searchGlobal tL_messages_searchGlobal = new TLRPC.TL_messages_searchGlobal();
        tL_messages_searchGlobal.broadcasts_only = false;
        int i11 = this.K;
        if (i11 != 0) {
            tL_messages_searchGlobal.flags |= 1;
            tL_messages_searchGlobal.folder_id = i11;
        }
        tL_messages_searchGlobal.q = this.a0;
        tL_messages_searchGlobal.limit = 25;
        tL_messages_searchGlobal.filter = new TLRPC.TL_inputMessagesFilterEmpty();
        int i12 = this.J;
        if (z10) {
            ArrayList arrayList = this.P;
            if (!arrayList.isEmpty()) {
                MessageObject messageObject = (MessageObject) i0.a.i(1, arrayList);
                tL_messages_searchGlobal.offset_rate = this.Y;
                tL_messages_searchGlobal.offset_id = messageObject.getId();
                if (messageObject.messageOwner.peer_id == null) {
                    tL_messages_searchGlobal.offset_peer = new TLRPC.TL_inputPeerEmpty();
                } else {
                    tL_messages_searchGlobal.offset_peer = MessagesController.getInstance(i12).getInputPeer(messageObject.messageOwner.peer_id);
                }
                AndroidUtilities.runOnUIThread(new org.telegram.messenger.voip.j0(this, i10, tL_messages_searchGlobal, z10, 3), !z10 ? 800L : 0L);
                if (z10) {
                    this.W = true;
                    TLRPC.TL_contacts_search tL_contacts_search = new TLRPC.TL_contacts_search();
                    tL_contacts_search.limit = 30;
                    tL_contacts_search.bots = true;
                    tL_contacts_search.q = this.a0;
                    ConnectionsManager.getInstance(i12).sendRequestTyped(tL_contacts_search, new org.telegram.messenger.a(), new cg.u0(17, this, tL_contacts_search));
                    return;
                }
                return;
            }
        }
        tL_messages_searchGlobal.offset_rate = 0;
        tL_messages_searchGlobal.offset_id = 0;
        tL_messages_searchGlobal.offset_peer = new TLRPC.TL_inputPeerEmpty();
        AndroidUtilities.runOnUIThread(new org.telegram.messenger.voip.j0(this, i10, tL_messages_searchGlobal, z10, 3), !z10 ? 800L : 0L);
        if (z10) {
        }
    }
}
