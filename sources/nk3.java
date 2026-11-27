// default package

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import java.util.ArrayList;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public class nk3 extends l9c {
    public final int Q;
    public final int R;
    public final boolean S;
    public final mk3 T;
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
    public final ik3 i0;
    public boolean j0;
    public final zj3 k0;

    public nk3(d79 d79Var, Context context, int i, int i2, boolean z, vnb vnbVar) {
        super(d79Var, context, i, 0, true, null, vnbVar);
        this.U = new ArrayList();
        this.V = new ArrayList();
        this.W = new ArrayList();
        this.i0 = new ik3(this, (byte) 0);
        this.j0 = true;
        this.k0 = new zj3(this, (byte) 1);
        this.w = new n82(this, (byte) 19);
        this.Q = i;
        this.R = i2;
        this.S = z;
        this.T = new mk3(i, new ik3(this, (byte) 1));
        this.Z = hl.D2(hl.N2(ob6.M0(2131754170, null), -1, 0, new he0(this, vnbVar, context), null), true);
        O(false);
        ls6.d0(i).O0(true);
    }

    public final void W() {
        boolean isEmpty = TextUtils.isEmpty(this.h0);
        d79 d79Var = this.d;
        if (isEmpty) {
            if (!this.j0) {
                if (d79Var != null) {
                    for (int i = 0; i < d79Var.getChildCount(); i++) {
                        if (!(d79Var.getChildAt(i) instanceof tk4)) {
                        }
                    }
                }
            }
            this.T.a();
            break;
        }
        if (this.e0 && !this.c0 && d79Var != null) {
            int i2 = 0;
            while (true) {
                if (i2 >= d79Var.getChildCount()) {
                    break;
                }
                if (!(d79Var.getChildAt(i2) instanceof tk4)) {
                    i2++;
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
    public final void X(boolean z) {
        this.c0 = true;
        int i = this.g0 + 1;
        this.g0 = i;
        TLRPC.TL_messages_searchGlobal tL_messages_searchGlobal = new TLRPC.TL_messages_searchGlobal();
        tL_messages_searchGlobal.broadcasts_only = false;
        int i2 = this.R;
        if (i2 != 0) {
            tL_messages_searchGlobal.flags |= 1;
            tL_messages_searchGlobal.folder_id = i2;
        }
        tL_messages_searchGlobal.q = this.h0;
        tL_messages_searchGlobal.limit = 25;
        tL_messages_searchGlobal.filter = new TLRPC.TL_inputMessagesFilterEmpty();
        int i3 = this.Q;
        if (z) {
            ArrayList arrayList = this.W;
            if (!arrayList.isEmpty()) {
                r47 r47Var = (r47) c00.g(1, arrayList);
                tL_messages_searchGlobal.offset_rate = this.f0;
                tL_messages_searchGlobal.offset_id = r47Var.e1();
                if (r47Var.k.peer_id == null) {
                    tL_messages_searchGlobal.offset_peer = new TLRPC.TL_inputPeerEmpty();
                } else {
                    tL_messages_searchGlobal.offset_peer = uc7.s1(i3).m1(r47Var.k.peer_id);
                }
                hl.d3(new ps1(this, i, tL_messages_searchGlobal, z, (byte) 2), !z ? 800L : 0L);
                if (z) {
                    this.d0 = true;
                    TLRPC.TL_contacts_search tL_contacts_search = new TLRPC.TL_contacts_search();
                    tL_contacts_search.limit = 30;
                    tL_contacts_search.bots = true;
                    tL_contacts_search.q = this.h0;
                    ConnectionsManager.getInstance(i3).sendRequestTyped(tL_contacts_search, new ic((byte) 0), new qe2(this, tL_contacts_search, (byte) 11));
                    return;
                }
                return;
            }
        }
        tL_messages_searchGlobal.offset_rate = 0;
        tL_messages_searchGlobal.offset_id = 0;
        tL_messages_searchGlobal.offset_peer = new TLRPC.TL_inputPeerEmpty();
        hl.d3(new ps1(this, i, tL_messages_searchGlobal, z, (byte) 2), !z ? 800L : 0L);
        if (z) {
        }
    }
}
