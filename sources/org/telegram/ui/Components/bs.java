package org.telegram.ui.Components;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import java.util.ArrayList;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public class bs extends p41 {
    public final int Q;
    public final int R;
    public final boolean S;
    public final as T;
    public final ArrayList U;
    public final ArrayList V;
    public final ArrayList W;
    public boolean X;
    public boolean Y;
    public final SpannableStringBuilder Z;
    public int a0;
    public int b0;
    public boolean c0;
    public boolean d0;
    public boolean e0;
    public int f0;
    public int g0;
    public String h0;
    public final xr i0;
    public boolean j0;
    public final q2 k0;

    public bs(uj0 uj0Var, Context context, int i7, int i10, boolean z10, org.telegram.ui.ActionBar.e6 e6Var) {
        super(uj0Var, context, i7, 0, true, null, e6Var);
        this.U = new ArrayList();
        this.V = new ArrayList();
        this.W = new ArrayList();
        this.i0 = new xr(this, 0);
        this.j0 = true;
        this.k0 = new q2(this, 5);
        this.w = new d(this, 8);
        this.Q = i7;
        this.R = i10;
        this.S = z10;
        this.T = new as(i7, new xr(this, 1));
        this.Z = org.telegram.messenger.g0.H2(org.telegram.messenger.g0.U2(org.telegram.messenger.hd.M0(2131754177, null), new di.a(this, e6Var, context)), true);
        O(false);
        org.telegram.messenger.si.b0(i7).M0(true);
    }

    public final void W() {
        boolean isEmpty = TextUtils.isEmpty(this.h0);
        uj0 uj0Var = this.d;
        if (isEmpty) {
            if (!this.j0) {
                if (uj0Var != null) {
                    for (int i7 = 0; i7 < uj0Var.getChildCount(); i7++) {
                        if (!(uj0Var.getChildAt(i7) instanceof pz)) {
                        }
                    }
                }
            }
            this.T.a();
            break;
        }
        if (this.e0 && !this.c0 && uj0Var != null) {
            int i10 = 0;
            while (true) {
                if (i10 >= uj0Var.getChildCount()) {
                    break;
                }
                if (!(uj0Var.getChildAt(i10) instanceof pz)) {
                    i10++;
                } else if (this.e0 && !this.c0 && !TextUtils.isEmpty(this.h0)) {
                    X(true);
                }
            }
        }
        this.j0 = false;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:19:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x007c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void X(boolean z10) {
        this.c0 = true;
        int i7 = this.g0 + 1;
        this.g0 = i7;
        TLRPC.TL_messages_searchGlobal tL_messages_searchGlobal = new TLRPC.TL_messages_searchGlobal();
        tL_messages_searchGlobal.broadcasts_only = false;
        int i10 = this.R;
        if (i10 != 0) {
            tL_messages_searchGlobal.flags |= 1;
            tL_messages_searchGlobal.folder_id = i10;
        }
        tL_messages_searchGlobal.q = this.h0;
        tL_messages_searchGlobal.limit = 25;
        tL_messages_searchGlobal.filter = new TLRPC.TL_inputMessagesFilterEmpty();
        int i11 = this.Q;
        if (z10) {
            ArrayList arrayList = this.W;
            if (!arrayList.isEmpty()) {
                org.telegram.messenger.gj gjVar = (org.telegram.messenger.gj) i5.c.h(1, arrayList);
                tL_messages_searchGlobal.offset_rate = this.f0;
                tL_messages_searchGlobal.offset_id = gjVar.e1();
                if (gjVar.k.peer_id == null) {
                    tL_messages_searchGlobal.offset_peer = new TLRPC.TL_inputPeerEmpty();
                } else {
                    tL_messages_searchGlobal.offset_peer = org.telegram.messenger.np.s1(i11).m1(gjVar.k.peer_id);
                }
                org.telegram.messenger.g0.i3(new org.telegram.messenger.voip.l0(this, i7, tL_messages_searchGlobal, z10, 3), !z10 ? 800L : 0L);
                if (z10) {
                    this.d0 = true;
                    TLRPC.TL_contacts_search tL_contacts_search = new TLRPC.TL_contacts_search();
                    tL_contacts_search.limit = 30;
                    tL_contacts_search.bots = true;
                    tL_contacts_search.q = this.h0;
                    ConnectionsManager.getInstance(i11).sendRequestTyped(tL_contacts_search, new d3.b(1), new bi.e4(15, this, tL_contacts_search));
                    return;
                }
                return;
            }
        }
        tL_messages_searchGlobal.offset_rate = 0;
        tL_messages_searchGlobal.offset_id = 0;
        tL_messages_searchGlobal.offset_peer = new TLRPC.TL_inputPeerEmpty();
        org.telegram.messenger.g0.i3(new org.telegram.messenger.voip.l0(this, i7, tL_messages_searchGlobal, z10, 3), !z10 ? 800L : 0L);
        if (z10) {
        }
    }
}
