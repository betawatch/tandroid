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

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public class ct extends k71 {
    public final int P;
    public final int Q;
    public final boolean R;
    public final bt S;
    public final ArrayList T;
    public final ArrayList U;
    public final ArrayList V;
    public boolean W;
    public boolean X;
    public final CharSequence Y;
    public int Z;
    public int a0;
    public boolean b0;
    public boolean c0;
    public boolean d0;
    public int e0;
    public int f0;
    public String g0;
    public final ys h0;
    public boolean i0;
    public final b3 j0;

    public ct(nm0 nm0Var, Context context, int i10, int i11, boolean z10, org.telegram.ui.ActionBar.u6 u6Var) {
        super(nm0Var, context, i10, 0, true, null, u6Var);
        this.T = new ArrayList();
        this.U = new ArrayList();
        this.V = new ArrayList();
        this.h0 = new ys(this, 0);
        this.i0 = true;
        this.j0 = new b3(this, 3);
        this.v = new d(this, 8);
        this.P = i10;
        this.Q = i11;
        this.R = z10;
        this.S = new bt(i10, new ys(this, 1));
        this.Y = AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.AppsTabInfo), new bi.b(this, u6Var, context)), true);
        O(false);
        MediaDataController.getInstance(i10).loadHints(true);
    }

    public final void W() {
        boolean isEmpty = TextUtils.isEmpty(this.g0);
        nm0 nm0Var = this.d;
        if (isEmpty) {
            if (!this.i0) {
                if (nm0Var != null) {
                    for (int i10 = 0; i10 < nm0Var.getChildCount(); i10++) {
                        if (!(nm0Var.getChildAt(i10) instanceof c10)) {
                        }
                    }
                }
            }
            this.S.a();
            break;
        }
        if (this.d0 && !this.b0 && nm0Var != null) {
            int i11 = 0;
            while (true) {
                if (i11 >= nm0Var.getChildCount()) {
                    break;
                }
                if (!(nm0Var.getChildAt(i11) instanceof c10)) {
                    i11++;
                } else if (this.d0 && !this.b0 && !TextUtils.isEmpty(this.g0)) {
                    X(true);
                }
            }
        }
        this.i0 = false;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:19:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x007c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void X(boolean z10) {
        this.b0 = true;
        int i10 = this.f0 + 1;
        this.f0 = i10;
        TLRPC.TL_messages_searchGlobal tL_messages_searchGlobal = new TLRPC.TL_messages_searchGlobal();
        tL_messages_searchGlobal.broadcasts_only = false;
        int i11 = this.Q;
        if (i11 != 0) {
            tL_messages_searchGlobal.flags |= 1;
            tL_messages_searchGlobal.folder_id = i11;
        }
        tL_messages_searchGlobal.q = this.g0;
        tL_messages_searchGlobal.limit = 25;
        tL_messages_searchGlobal.filter = new TLRPC.TL_inputMessagesFilterEmpty();
        int i12 = this.P;
        if (z10) {
            ArrayList arrayList = this.V;
            if (!arrayList.isEmpty()) {
                MessageObject messageObject = (MessageObject) ic.a.g(1, arrayList);
                tL_messages_searchGlobal.offset_rate = this.e0;
                tL_messages_searchGlobal.offset_id = messageObject.getId();
                if (messageObject.messageOwner.peer_id == null) {
                    tL_messages_searchGlobal.offset_peer = new TLRPC.TL_inputPeerEmpty();
                } else {
                    tL_messages_searchGlobal.offset_peer = MessagesController.getInstance(i12).getInputPeer(messageObject.messageOwner.peer_id);
                }
                AndroidUtilities.runOnUIThread(new org.telegram.messenger.voip.j0(this, i10, tL_messages_searchGlobal, z10, 3), !z10 ? 800L : 0L);
                if (z10) {
                    this.c0 = true;
                    TLRPC.TL_contacts_search tL_contacts_search = new TLRPC.TL_contacts_search();
                    tL_contacts_search.limit = 30;
                    tL_contacts_search.bots = true;
                    tL_contacts_search.q = this.g0;
                    ConnectionsManager.getInstance(i12).sendRequestTyped(tL_contacts_search, new org.telegram.messenger.a(), new bi.m5(15, this, tL_contacts_search));
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
