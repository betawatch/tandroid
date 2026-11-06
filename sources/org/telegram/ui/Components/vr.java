package org.telegram.ui.Components;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import java.util.ArrayList;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes3.dex */
public class vr extends l41 {
    public final int P;
    public final int Q;
    public final boolean R;
    public final ur S;
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
    public final rr h0;
    public boolean i0;
    public final s2 j0;

    public vr(pj0 pj0Var, Context context, int i7, int i10, boolean z9, org.telegram.ui.ActionBar.f6 f6Var) {
        super(pj0Var, context, i7, 0, true, null, f6Var);
        this.T = new ArrayList();
        this.U = new ArrayList();
        this.V = new ArrayList();
        this.h0 = new rr(this, 0);
        this.i0 = true;
        this.j0 = new s2(this, 3);
        this.w = new d(this, 8);
        this.P = i7;
        this.Q = i10;
        this.R = z9;
        this.S = new ur(i7, new rr(this, 1));
        this.Y = org.telegram.messenger.g0.H2(org.telegram.messenger.g0.U2(org.telegram.messenger.hd.M0(2131754177, null), new bi.b(this, f6Var, context)), true);
        O(false);
        org.telegram.messenger.ui.b0(i7).M0(true);
    }

    public final void W() {
        boolean isEmpty = TextUtils.isEmpty(this.g0);
        pj0 pj0Var = this.d;
        if (isEmpty) {
            if (!this.i0) {
                if (pj0Var != null) {
                    for (int i7 = 0; i7 < pj0Var.getChildCount(); i7++) {
                        if (!(pj0Var.getChildAt(i7) instanceof lz)) {
                        }
                    }
                }
            }
            this.S.a();
            break;
        }
        if (this.d0 && !this.b0 && pj0Var != null) {
            int i10 = 0;
            while (true) {
                if (i10 >= pj0Var.getChildCount()) {
                    break;
                }
                if (!(pj0Var.getChildAt(i10) instanceof lz)) {
                    i10++;
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
    public final void X(boolean z9) {
        this.b0 = true;
        int i7 = this.f0 + 1;
        this.f0 = i7;
        TLRPC.TL_messages_searchGlobal tL_messages_searchGlobal = new TLRPC.TL_messages_searchGlobal();
        tL_messages_searchGlobal.broadcasts_only = false;
        int i10 = this.Q;
        if (i10 != 0) {
            tL_messages_searchGlobal.flags |= 1;
            tL_messages_searchGlobal.folder_id = i10;
        }
        tL_messages_searchGlobal.q = this.g0;
        tL_messages_searchGlobal.limit = 25;
        tL_messages_searchGlobal.filter = new TLRPC.TL_inputMessagesFilterEmpty();
        int i11 = this.P;
        if (z9) {
            ArrayList arrayList = this.V;
            if (!arrayList.isEmpty()) {
                org.telegram.messenger.ij ijVar = (org.telegram.messenger.ij) jg.g.i(1, arrayList);
                tL_messages_searchGlobal.offset_rate = this.e0;
                tL_messages_searchGlobal.offset_id = ijVar.f1();
                if (ijVar.k.peer_id == null) {
                    tL_messages_searchGlobal.offset_peer = new TLRPC.TL_inputPeerEmpty();
                } else {
                    tL_messages_searchGlobal.offset_peer = org.telegram.messenger.qp.s1(i11).m1(ijVar.k.peer_id);
                }
                org.telegram.messenger.g0.i3(new org.telegram.messenger.voip.k0(this, i7, tL_messages_searchGlobal, z9, 3), !z9 ? 800L : 0L);
                if (z9) {
                    this.c0 = true;
                    TLRPC.TL_contacts_search tL_contacts_search = new TLRPC.TL_contacts_search();
                    tL_contacts_search.limit = 30;
                    tL_contacts_search.bots = true;
                    tL_contacts_search.q = this.g0;
                    ConnectionsManager.getInstance(i11).sendRequestTyped(tL_contacts_search, new d3.b(1), new bi.p5(14, this, tL_contacts_search));
                    return;
                }
                return;
            }
        }
        tL_messages_searchGlobal.offset_rate = 0;
        tL_messages_searchGlobal.offset_id = 0;
        tL_messages_searchGlobal.offset_peer = new TLRPC.TL_inputPeerEmpty();
        org.telegram.messenger.g0.i3(new org.telegram.messenger.voip.k0(this, i7, tL_messages_searchGlobal, z9, 3), !z9 ? 800L : 0L);
        if (z9) {
        }
    }
}
