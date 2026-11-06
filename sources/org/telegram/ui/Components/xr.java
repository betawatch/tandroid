package org.telegram.ui.Components;

import android.content.Context;
import java.util.ArrayList;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes3.dex */
public abstract class xr extends l41 {
    public final int P;
    public final int Q;
    public final ArrayList R;
    public final ArrayList S;
    public final ArrayList T;
    public final ArrayList U;
    public boolean V;
    public boolean W;
    public final ArrayList X;
    public boolean Y;
    public boolean Z;
    public boolean a0;
    public int b0;
    public int c0;
    public String d0;
    public final gp e0;

    public xr(pj0 pj0Var, Context context, int i7, int i10) {
        super(pj0Var, context, i7, 0, false, null, null);
        this.R = new ArrayList();
        this.S = new ArrayList();
        this.T = new ArrayList();
        this.U = new ArrayList();
        this.X = new ArrayList();
        am0 am0Var = (am0) this;
        this.e0 = new gp(am0Var, 6);
        this.w = new d(am0Var, 9);
        this.P = i7;
        this.Q = i10;
        O(false);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:19:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x007c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void W(boolean z9) {
        this.Y = true;
        int i7 = this.c0 + 1;
        this.c0 = i7;
        TLRPC.TL_messages_searchGlobal tL_messages_searchGlobal = new TLRPC.TL_messages_searchGlobal();
        tL_messages_searchGlobal.broadcasts_only = true;
        int i10 = this.Q;
        if (i10 != 0) {
            tL_messages_searchGlobal.flags |= 1;
            tL_messages_searchGlobal.folder_id = i10;
        }
        tL_messages_searchGlobal.q = this.d0;
        tL_messages_searchGlobal.limit = 25;
        tL_messages_searchGlobal.filter = new TLRPC.TL_inputMessagesFilterEmpty();
        int i11 = this.P;
        if (z9) {
            ArrayList arrayList = this.R;
            if (!arrayList.isEmpty()) {
                org.telegram.messenger.ij ijVar = (org.telegram.messenger.ij) jg.g.i(1, arrayList);
                tL_messages_searchGlobal.offset_rate = this.b0;
                tL_messages_searchGlobal.offset_id = ijVar.f1();
                if (ijVar.k.peer_id == null) {
                    tL_messages_searchGlobal.offset_peer = new TLRPC.TL_inputPeerEmpty();
                } else {
                    tL_messages_searchGlobal.offset_peer = org.telegram.messenger.qp.s1(i11).m1(ijVar.k.peer_id);
                }
                org.telegram.messenger.g0.i3(new org.telegram.messenger.voip.k0(this, i7, tL_messages_searchGlobal, z9, 4), !z9 ? 800L : 0L);
                if (z9) {
                    this.Z = true;
                    TLRPC.TL_contacts_search tL_contacts_search = new TLRPC.TL_contacts_search();
                    tL_contacts_search.limit = 20;
                    tL_contacts_search.broadcasts = true;
                    tL_contacts_search.q = this.d0;
                    ConnectionsManager.getInstance(i11).sendRequestTyped(tL_contacts_search, new d3.b(1), new bi.p5(15, this, tL_contacts_search));
                    return;
                }
                return;
            }
        }
        tL_messages_searchGlobal.offset_rate = 0;
        tL_messages_searchGlobal.offset_id = 0;
        tL_messages_searchGlobal.offset_peer = new TLRPC.TL_inputPeerEmpty();
        org.telegram.messenger.g0.i3(new org.telegram.messenger.voip.k0(this, i7, tL_messages_searchGlobal, z9, 4), !z9 ? 800L : 0L);
        if (z9) {
        }
    }

    public final void X() {
        ArrayList arrayList = new ArrayList();
        int i7 = this.P;
        ArrayList arrayList2 = org.telegram.messenger.qp.s1(i7).y;
        int size = arrayList2.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList2.get(i10);
            i10++;
            TLRPC.Chat M0 = org.telegram.messenger.qp.s1(i7).M0(Long.valueOf(-((TLRPC.Dialog) obj).id));
            if (M0 != null && org.telegram.messenger.t3.V(M0) && org.telegram.messenger.t3.t0(M0) && !org.telegram.messenger.t3.r0(M0)) {
                arrayList.add(M0);
                if (arrayList.size() >= 100) {
                    break;
                }
            }
        }
        ArrayList arrayList3 = this.X;
        arrayList3.clear();
        arrayList3.addAll(arrayList);
    }
}
