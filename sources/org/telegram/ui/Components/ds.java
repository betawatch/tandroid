package org.telegram.ui.Components;

import android.content.Context;
import java.util.ArrayList;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public abstract class ds extends p41 {
    public final int Q;
    public final int R;
    public final ArrayList S;
    public final ArrayList T;
    public final ArrayList U;
    public final ArrayList V;
    public boolean W;
    public boolean X;
    public final ArrayList Y;
    public boolean Z;
    public boolean a0;
    public boolean b0;
    public int c0;
    public int d0;
    public String e0;
    public final fo f0;

    public ds(uj0 uj0Var, Context context, int i7, int i10) {
        super(uj0Var, context, i7, 0, false, null, null);
        this.S = new ArrayList();
        this.T = new ArrayList();
        this.U = new ArrayList();
        this.V = new ArrayList();
        this.Y = new ArrayList();
        em0 em0Var = (em0) this;
        this.f0 = new fo(em0Var, 8);
        this.w = new d(em0Var, 9);
        this.Q = i7;
        this.R = i10;
        O(false);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:19:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x007c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void W(boolean z10) {
        this.Z = true;
        int i7 = this.d0 + 1;
        this.d0 = i7;
        TLRPC.TL_messages_searchGlobal tL_messages_searchGlobal = new TLRPC.TL_messages_searchGlobal();
        tL_messages_searchGlobal.broadcasts_only = true;
        int i10 = this.R;
        if (i10 != 0) {
            tL_messages_searchGlobal.flags |= 1;
            tL_messages_searchGlobal.folder_id = i10;
        }
        tL_messages_searchGlobal.q = this.e0;
        tL_messages_searchGlobal.limit = 25;
        tL_messages_searchGlobal.filter = new TLRPC.TL_inputMessagesFilterEmpty();
        int i11 = this.Q;
        if (z10) {
            ArrayList arrayList = this.S;
            if (!arrayList.isEmpty()) {
                org.telegram.messenger.gj gjVar = (org.telegram.messenger.gj) i5.c.h(1, arrayList);
                tL_messages_searchGlobal.offset_rate = this.c0;
                tL_messages_searchGlobal.offset_id = gjVar.e1();
                if (gjVar.k.peer_id == null) {
                    tL_messages_searchGlobal.offset_peer = new TLRPC.TL_inputPeerEmpty();
                } else {
                    tL_messages_searchGlobal.offset_peer = org.telegram.messenger.np.s1(i11).m1(gjVar.k.peer_id);
                }
                org.telegram.messenger.g0.i3(new org.telegram.messenger.voip.l0(this, i7, tL_messages_searchGlobal, z10, 4), !z10 ? 800L : 0L);
                if (z10) {
                    this.a0 = true;
                    TLRPC.TL_contacts_search tL_contacts_search = new TLRPC.TL_contacts_search();
                    tL_contacts_search.limit = 20;
                    tL_contacts_search.broadcasts = true;
                    tL_contacts_search.q = this.e0;
                    ConnectionsManager.getInstance(i11).sendRequestTyped(tL_contacts_search, new d3.b(1), new bi.e4(16, this, tL_contacts_search));
                    return;
                }
                return;
            }
        }
        tL_messages_searchGlobal.offset_rate = 0;
        tL_messages_searchGlobal.offset_id = 0;
        tL_messages_searchGlobal.offset_peer = new TLRPC.TL_inputPeerEmpty();
        org.telegram.messenger.g0.i3(new org.telegram.messenger.voip.l0(this, i7, tL_messages_searchGlobal, z10, 4), !z10 ? 800L : 0L);
        if (z10) {
        }
    }

    public final void X() {
        ArrayList arrayList = new ArrayList();
        int i7 = this.Q;
        ArrayList arrayList2 = org.telegram.messenger.np.s1(i7).y;
        int size = arrayList2.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList2.get(i10);
            i10++;
            TLRPC.Chat M0 = org.telegram.messenger.np.s1(i7).M0(Long.valueOf(-((TLRPC.Dialog) obj).id));
            if (M0 != null && org.telegram.messenger.t3.V(M0) && org.telegram.messenger.t3.t0(M0) && !org.telegram.messenger.t3.r0(M0)) {
                arrayList.add(M0);
                if (arrayList.size() >= 100) {
                    break;
                }
            }
        }
        ArrayList arrayList3 = this.Y;
        arrayList3.clear();
        arrayList3.addAll(arrayList);
    }
}
