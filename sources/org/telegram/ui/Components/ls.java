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

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public class ls extends k51 {
    public final int J;
    public final int K;
    public final boolean L;
    public final ks M;
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
    public final hs b0;
    public boolean c0;
    public final y2 d0;

    public ls(jl0 jl0Var, Context context, int i10, int i11, boolean z10, org.telegram.ui.ActionBar.c6 c6Var) {
        super(jl0Var, context, i10, 0, true, null, c6Var);
        this.N = new ArrayList();
        this.O = new ArrayList();
        this.P = new ArrayList();
        this.b0 = new hs(this, 0);
        this.c0 = true;
        this.d0 = new y2(this, 3);
        this.s = new d(this, 8);
        this.J = i10;
        this.K = i11;
        this.L = z10;
        this.M = new ks(i10, new hs(this, 1));
        this.S = AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.AppsTabInfo), new jh.a(this, c6Var, context)), true);
        N(false);
        MediaDataController.getInstance(i10).loadHints(true);
    }

    public final void V() {
        boolean isEmpty = TextUtils.isEmpty(this.a0);
        jl0 jl0Var = this.d;
        if (isEmpty) {
            if (!this.c0) {
                if (jl0Var != null) {
                    for (int i10 = 0; i10 < jl0Var.getChildCount(); i10++) {
                        if (!(jl0Var.getChildAt(i10) instanceof p00)) {
                        }
                    }
                }
            }
            this.M.a();
            break;
        }
        if (this.X && !this.V && jl0Var != null) {
            int i11 = 0;
            while (true) {
                if (i11 >= jl0Var.getChildCount()) {
                    break;
                }
                if (!(jl0Var.getChildAt(i11) instanceof p00)) {
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
                MessageObject messageObject = (MessageObject) j7.l1.i(1, arrayList);
                tL_messages_searchGlobal.offset_rate = this.Y;
                tL_messages_searchGlobal.offset_id = messageObject.getId();
                if (messageObject.messageOwner.peer_id == null) {
                    tL_messages_searchGlobal.offset_peer = new TLRPC.TL_inputPeerEmpty();
                } else {
                    tL_messages_searchGlobal.offset_peer = MessagesController.getInstance(i12).getInputPeer(messageObject.messageOwner.peer_id);
                }
                AndroidUtilities.runOnUIThread(new org.telegram.messenger.voip.k0(this, i10, tL_messages_searchGlobal, z10, 3), !z10 ? 800L : 0L);
                if (z10) {
                    this.W = true;
                    TLRPC.TL_contacts_search tL_contacts_search = new TLRPC.TL_contacts_search();
                    tL_contacts_search.limit = 30;
                    tL_contacts_search.bots = true;
                    tL_contacts_search.q = this.a0;
                    ConnectionsManager.getInstance(i12).sendRequestTyped(tL_contacts_search, new org.telegram.messenger.a(), new bh.v(17, this, tL_contacts_search));
                    return;
                }
                return;
            }
        }
        tL_messages_searchGlobal.offset_rate = 0;
        tL_messages_searchGlobal.offset_id = 0;
        tL_messages_searchGlobal.offset_peer = new TLRPC.TL_inputPeerEmpty();
        AndroidUtilities.runOnUIThread(new org.telegram.messenger.voip.k0(this, i10, tL_messages_searchGlobal, z10, 3), !z10 ? 800L : 0L);
        if (z10) {
        }
    }
}
