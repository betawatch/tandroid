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

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public class hs extends z41 {
    public final int J;
    public final int K;
    public final boolean L;
    public final gs M;
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
    public final ds b0;
    public boolean c0;
    public final v2 d0;

    public hs(wk0 wk0Var, Context context, int i9, int i10, boolean z10, org.telegram.ui.ActionBar.b6 b6Var) {
        super(wk0Var, context, i9, 0, true, null, b6Var);
        this.N = new ArrayList();
        this.O = new ArrayList();
        this.P = new ArrayList();
        this.b0 = new ds(this, 0);
        this.c0 = true;
        this.d0 = new v2(this, 3);
        this.s = new d(this, 8);
        this.J = i9;
        this.K = i10;
        this.L = z10;
        this.M = new gs(i9, new ds(this, 1));
        this.S = AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.AppsTabInfo), new gh.a(this, b6Var, context)), true);
        N(false);
        MediaDataController.getInstance(i9).loadHints(true);
    }

    public final void V() {
        boolean isEmpty = TextUtils.isEmpty(this.a0);
        wk0 wk0Var = this.d;
        if (isEmpty) {
            if (!this.c0) {
                if (wk0Var != null) {
                    for (int i9 = 0; i9 < wk0Var.getChildCount(); i9++) {
                        if (!(wk0Var.getChildAt(i9) instanceof e00)) {
                        }
                    }
                }
            }
            this.M.a();
            break;
        }
        if (this.X && !this.V && wk0Var != null) {
            int i10 = 0;
            while (true) {
                if (i10 >= wk0Var.getChildCount()) {
                    break;
                }
                if (!(wk0Var.getChildAt(i10) instanceof e00)) {
                    i10++;
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
        int i9 = this.Z + 1;
        this.Z = i9;
        TLRPC.TL_messages_searchGlobal tL_messages_searchGlobal = new TLRPC.TL_messages_searchGlobal();
        tL_messages_searchGlobal.broadcasts_only = false;
        int i10 = this.K;
        if (i10 != 0) {
            tL_messages_searchGlobal.flags |= 1;
            tL_messages_searchGlobal.folder_id = i10;
        }
        tL_messages_searchGlobal.q = this.a0;
        tL_messages_searchGlobal.limit = 25;
        tL_messages_searchGlobal.filter = new TLRPC.TL_inputMessagesFilterEmpty();
        int i11 = this.J;
        if (z10) {
            ArrayList arrayList = this.P;
            if (!arrayList.isEmpty()) {
                MessageObject messageObject = (MessageObject) j3.r0.j(1, arrayList);
                tL_messages_searchGlobal.offset_rate = this.Y;
                tL_messages_searchGlobal.offset_id = messageObject.getId();
                if (messageObject.messageOwner.peer_id == null) {
                    tL_messages_searchGlobal.offset_peer = new TLRPC.TL_inputPeerEmpty();
                } else {
                    tL_messages_searchGlobal.offset_peer = MessagesController.getInstance(i11).getInputPeer(messageObject.messageOwner.peer_id);
                }
                AndroidUtilities.runOnUIThread(new org.telegram.messenger.voip.j0(this, i9, tL_messages_searchGlobal, z10, 3), !z10 ? 800L : 0L);
                if (z10) {
                    this.W = true;
                    TLRPC.TL_contacts_search tL_contacts_search = new TLRPC.TL_contacts_search();
                    tL_contacts_search.limit = 30;
                    tL_contacts_search.bots = true;
                    tL_contacts_search.q = this.a0;
                    ConnectionsManager.getInstance(i11).sendRequestTyped(tL_contacts_search, new org.telegram.messenger.a(), new bg.y0(17, this, tL_contacts_search));
                    return;
                }
                return;
            }
        }
        tL_messages_searchGlobal.offset_rate = 0;
        tL_messages_searchGlobal.offset_id = 0;
        tL_messages_searchGlobal.offset_peer = new TLRPC.TL_inputPeerEmpty();
        AndroidUtilities.runOnUIThread(new org.telegram.messenger.voip.j0(this, i9, tL_messages_searchGlobal, z10, 3), !z10 ? 800L : 0L);
        if (z10) {
        }
    }
}
