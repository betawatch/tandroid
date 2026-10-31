package org.telegram.ui.Components;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import java.util.ArrayList;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public class gs extends p51 {
    public final int P;
    public final int Q;
    public final boolean R;
    public final fs S;
    public final ArrayList T;
    public final ArrayList U;
    public final ArrayList V;
    public boolean W;
    public boolean X;
    public final SpannableStringBuilder Y;
    public int Z;
    public int a0;
    public boolean b0;
    public boolean c0;
    public boolean d0;
    public int e0;
    public int f0;
    public String g0;
    public final bs h0;
    public boolean i0;
    public final r2 j0;

    public gs(tk0 tk0Var, Context context, int i10, int i11, boolean z10, org.telegram.ui.ActionBar.p6 p6Var) {
        super(tk0Var, context, i10, 0, true, null, p6Var);
        this.T = new ArrayList();
        this.U = new ArrayList();
        this.V = new ArrayList();
        this.h0 = new bs(this, 0);
        this.i0 = true;
        this.j0 = new r2(this, 3);
        this.w = new d(this, 8);
        this.P = i10;
        this.Q = i11;
        this.R = z10;
        this.S = new fs(i10, new bs(this, 1));
        this.Y = org.telegram.messenger.i0.G2(org.telegram.messenger.i0.T2(org.telegram.messenger.cd.L0(2131754177, null), new cs(this, p6Var, context)), true);
        O(false);
        org.telegram.messenger.ui.b0(i10).M0(true);
    }

    public final void W() {
        boolean isEmpty = TextUtils.isEmpty(this.g0);
        tk0 tk0Var = this.d;
        if (isEmpty) {
            if (!this.i0) {
                if (tk0Var != null) {
                    for (int i10 = 0; i10 < tk0Var.getChildCount(); i10++) {
                        if (!(tk0Var.getChildAt(i10) instanceof zz)) {
                        }
                    }
                }
            }
            this.S.a();
            break;
        }
        if (this.d0 && !this.b0 && tk0Var != null) {
            int i11 = 0;
            while (true) {
                if (i11 >= tk0Var.getChildCount()) {
                    break;
                }
                if (!(tk0Var.getChildAt(i11) instanceof zz)) {
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
                org.telegram.messenger.jj jjVar = (org.telegram.messenger.jj) i0.a.g(1, arrayList);
                tL_messages_searchGlobal.offset_rate = this.e0;
                tL_messages_searchGlobal.offset_id = jjVar.f1();
                if (jjVar.k.peer_id == null) {
                    tL_messages_searchGlobal.offset_peer = new TLRPC.TL_inputPeerEmpty();
                } else {
                    tL_messages_searchGlobal.offset_peer = org.telegram.messenger.vp.r1(i12).l1(jjVar.k.peer_id);
                }
                org.telegram.messenger.i0.h3(new org.telegram.messenger.voip.p0(this, i10, tL_messages_searchGlobal, z10, 3), !z10 ? 800L : 0L);
                if (z10) {
                    this.c0 = true;
                    TLRPC.TL_contacts_search tL_contacts_search = new TLRPC.TL_contacts_search();
                    tL_contacts_search.limit = 30;
                    tL_contacts_search.bots = true;
                    tL_contacts_search.q = this.g0;
                    ConnectionsManager.getInstance(i12).sendRequestTyped(tL_contacts_search, new a3.b(1), new ih.s(8, this, tL_contacts_search));
                    return;
                }
                return;
            }
        }
        tL_messages_searchGlobal.offset_rate = 0;
        tL_messages_searchGlobal.offset_id = 0;
        tL_messages_searchGlobal.offset_peer = new TLRPC.TL_inputPeerEmpty();
        org.telegram.messenger.i0.h3(new org.telegram.messenger.voip.p0(this, i10, tL_messages_searchGlobal, z10, 3), !z10 ? 800L : 0L);
        if (z10) {
        }
    }
}
