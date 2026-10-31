package org.telegram.ui.Components;

import android.content.Context;
import java.util.ArrayList;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public abstract class is extends p51 {
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
    public final ho e0;

    public is(tk0 tk0Var, Context context, int i10, int i11) {
        super(tk0Var, context, i10, 0, false, null, null);
        this.R = new ArrayList();
        this.S = new ArrayList();
        this.T = new ArrayList();
        this.U = new ArrayList();
        this.X = new ArrayList();
        bn0 bn0Var = (bn0) this;
        this.e0 = new ho(bn0Var, 8);
        this.w = new d(bn0Var, 9);
        this.P = i10;
        this.Q = i11;
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
        this.Y = true;
        int i10 = this.c0 + 1;
        this.c0 = i10;
        TLRPC.TL_messages_searchGlobal tL_messages_searchGlobal = new TLRPC.TL_messages_searchGlobal();
        tL_messages_searchGlobal.broadcasts_only = true;
        int i11 = this.Q;
        if (i11 != 0) {
            tL_messages_searchGlobal.flags |= 1;
            tL_messages_searchGlobal.folder_id = i11;
        }
        tL_messages_searchGlobal.q = this.d0;
        tL_messages_searchGlobal.limit = 25;
        tL_messages_searchGlobal.filter = new TLRPC.TL_inputMessagesFilterEmpty();
        int i12 = this.P;
        if (z10) {
            ArrayList arrayList = this.R;
            if (!arrayList.isEmpty()) {
                org.telegram.messenger.jj jjVar = (org.telegram.messenger.jj) i0.a.g(1, arrayList);
                tL_messages_searchGlobal.offset_rate = this.b0;
                tL_messages_searchGlobal.offset_id = jjVar.f1();
                if (jjVar.k.peer_id == null) {
                    tL_messages_searchGlobal.offset_peer = new TLRPC.TL_inputPeerEmpty();
                } else {
                    tL_messages_searchGlobal.offset_peer = org.telegram.messenger.vp.r1(i12).l1(jjVar.k.peer_id);
                }
                org.telegram.messenger.i0.h3(new org.telegram.messenger.voip.p0(this, i10, tL_messages_searchGlobal, z10, 4), !z10 ? 800L : 0L);
                if (z10) {
                    this.Z = true;
                    TLRPC.TL_contacts_search tL_contacts_search = new TLRPC.TL_contacts_search();
                    tL_contacts_search.limit = 20;
                    tL_contacts_search.broadcasts = true;
                    tL_contacts_search.q = this.d0;
                    ConnectionsManager.getInstance(i12).sendRequestTyped(tL_contacts_search, new a3.b(1), new ih.s(9, this, tL_contacts_search));
                    return;
                }
                return;
            }
        }
        tL_messages_searchGlobal.offset_rate = 0;
        tL_messages_searchGlobal.offset_id = 0;
        tL_messages_searchGlobal.offset_peer = new TLRPC.TL_inputPeerEmpty();
        org.telegram.messenger.i0.h3(new org.telegram.messenger.voip.p0(this, i10, tL_messages_searchGlobal, z10, 4), !z10 ? 800L : 0L);
        if (z10) {
        }
    }

    public final void X() {
        ArrayList arrayList = new ArrayList();
        int i10 = this.P;
        ArrayList arrayList2 = org.telegram.messenger.vp.r1(i10).y;
        int size = arrayList2.size();
        int i11 = 0;
        while (i11 < size) {
            Object obj = arrayList2.get(i11);
            i11++;
            TLRPC.Chat L0 = org.telegram.messenger.vp.r1(i10).L0(Long.valueOf(-((TLRPC.Dialog) obj).id));
            if (L0 != null && org.telegram.messenger.w3.V(L0) && org.telegram.messenger.w3.t0(L0) && !org.telegram.messenger.w3.r0(L0)) {
                arrayList.add(L0);
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
