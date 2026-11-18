package org.telegram.ui.Components;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import java.util.ArrayList;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public class is extends z41 {
    public final int Q;
    public final int R;
    public final boolean S;
    public final hs T;
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
    public final es i0;
    public boolean j0;
    public final y2 k0;

    public is(ck0 ck0Var, Context context, int i7, int i10, boolean z10, org.telegram.ui.ActionBar.i6 i6Var) {
        super(ck0Var, context, i7, 0, true, null, i6Var);
        this.U = new ArrayList();
        this.V = new ArrayList();
        this.W = new ArrayList();
        this.i0 = new es(this, 0);
        this.j0 = true;
        this.k0 = new y2(this, 5);
        this.w = new d(this, 9);
        this.Q = i7;
        this.R = i10;
        this.S = z10;
        this.T = new hs(i7, new es(this, 1));
        this.Z = org.telegram.messenger.g0.H2(org.telegram.messenger.g0.T2(org.telegram.messenger.gd.M0(2131754175, null), new di.a(this, i6Var, context)), true);
        O(false);
        org.telegram.messenger.ri.d0(i7).P0(true);
    }

    public final void W() {
        boolean isEmpty = TextUtils.isEmpty(this.h0);
        ck0 ck0Var = this.d;
        if (isEmpty) {
            if (!this.j0) {
                if (ck0Var != null) {
                    for (int i7 = 0; i7 < ck0Var.getChildCount(); i7++) {
                        if (!(ck0Var.getChildAt(i7) instanceof wz)) {
                        }
                    }
                }
            }
            this.T.a();
            break;
        }
        if (this.e0 && !this.c0 && ck0Var != null) {
            int i10 = 0;
            while (true) {
                if (i10 >= ck0Var.getChildCount()) {
                    break;
                }
                if (!(ck0Var.getChildAt(i10) instanceof wz)) {
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
                org.telegram.messenger.fj fjVar = (org.telegram.messenger.fj) i5.c.h(1, arrayList);
                tL_messages_searchGlobal.offset_rate = this.f0;
                tL_messages_searchGlobal.offset_id = fjVar.e1();
                if (fjVar.k.peer_id == null) {
                    tL_messages_searchGlobal.offset_peer = new TLRPC.TL_inputPeerEmpty();
                } else {
                    tL_messages_searchGlobal.offset_peer = org.telegram.messenger.mp.u1(i11).o1(fjVar.k.peer_id);
                }
                org.telegram.messenger.g0.h3(new org.telegram.messenger.voip.l0(this, i7, tL_messages_searchGlobal, z10, 3), !z10 ? 800L : 0L);
                if (z10) {
                    this.d0 = true;
                    TLRPC.TL_contacts_search tL_contacts_search = new TLRPC.TL_contacts_search();
                    tL_contacts_search.limit = 30;
                    tL_contacts_search.bots = true;
                    tL_contacts_search.q = this.h0;
                    ConnectionsManager.getInstance(i11).sendRequestTyped(tL_contacts_search, new d3.b(1), new bi.l6(19, this, tL_contacts_search));
                    return;
                }
                return;
            }
        }
        tL_messages_searchGlobal.offset_rate = 0;
        tL_messages_searchGlobal.offset_id = 0;
        tL_messages_searchGlobal.offset_peer = new TLRPC.TL_inputPeerEmpty();
        org.telegram.messenger.g0.h3(new org.telegram.messenger.voip.l0(this, i7, tL_messages_searchGlobal, z10, 3), !z10 ? 800L : 0L);
        if (z10) {
        }
    }
}
