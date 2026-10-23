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

/* compiled from: r8-map-id-6bb23a39fe2d1bb2dc6cc69f606436ba751c240cf93e0ff97ff041cb9f09a305 */
/* loaded from: classes3.dex */
public class at extends b71 {
    public final int P;
    public final int Q;
    public final boolean R;
    public final zs S;
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
    public final ws h0;
    public boolean i0;
    public final y2 j0;

    public at(mm0 mm0Var, Context context, int i10, int i11, boolean z10, org.telegram.ui.ActionBar.g6 g6Var) {
        super(mm0Var, context, i10, 0, true, null, g6Var);
        this.T = new ArrayList();
        this.U = new ArrayList();
        this.V = new ArrayList();
        this.h0 = new ws(this, 0);
        this.i0 = true;
        this.j0 = new y2(this, 3);
        this.v = new d(this, 8);
        this.P = i10;
        this.Q = i11;
        this.R = z10;
        this.S = new zs(i10, new ws(this, 1));
        this.Y = AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.AppsTabInfo), new ai.b(this, g6Var, context)), true);
        N(false);
        MediaDataController.getInstance(i10).loadHints(true);
    }

    public final void V() {
        boolean isEmpty = TextUtils.isEmpty(this.g0);
        mm0 mm0Var = this.d;
        if (isEmpty) {
            if (!this.i0) {
                if (mm0Var != null) {
                    for (int i10 = 0; i10 < mm0Var.getChildCount(); i10++) {
                        if (!(mm0Var.getChildAt(i10) instanceof b10)) {
                        }
                    }
                }
            }
            this.S.a();
            break;
        }
        if (this.d0 && !this.b0 && mm0Var != null) {
            int i11 = 0;
            while (true) {
                if (i11 >= mm0Var.getChildCount()) {
                    break;
                }
                if (!(mm0Var.getChildAt(i11) instanceof b10)) {
                    i11++;
                } else if (this.d0 && !this.b0 && !TextUtils.isEmpty(this.g0)) {
                    W(true);
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
    public final void W(boolean z10) {
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
                MessageObject messageObject = (MessageObject) i2.o1.i(1, arrayList);
                tL_messages_searchGlobal.offset_rate = this.e0;
                tL_messages_searchGlobal.offset_id = messageObject.getId();
                if (messageObject.messageOwner.peer_id == null) {
                    tL_messages_searchGlobal.offset_peer = new TLRPC.TL_inputPeerEmpty();
                } else {
                    tL_messages_searchGlobal.offset_peer = MessagesController.getInstance(i12).getInputPeer(messageObject.messageOwner.peer_id);
                }
                AndroidUtilities.runOnUIThread(new org.telegram.messenger.voip.k0(this, i10, tL_messages_searchGlobal, z10, 3), !z10 ? 800L : 0L);
                if (z10) {
                    this.c0 = true;
                    TLRPC.TL_contacts_search tL_contacts_search = new TLRPC.TL_contacts_search();
                    tL_contacts_search.limit = 30;
                    tL_contacts_search.bots = true;
                    tL_contacts_search.q = this.g0;
                    ConnectionsManager.getInstance(i12).sendRequestTyped(tL_contacts_search, new org.telegram.messenger.a(), new ai.r5(15, this, tL_contacts_search));
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
