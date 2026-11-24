// default package

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import java.util.ArrayList;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public class gl3 extends l7c {
    public final int Q;
    public final int R;
    public final boolean S;
    public final fl3 T;
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
    public final bl3 i0;
    public boolean j0;
    public final sk3 k0;

    public gl3(r59 r59Var, Context context, int i, int i2, boolean z, ylb ylbVar) {
        super(r59Var, context, i, 0, true, null, ylbVar);
        this.U = new ArrayList();
        this.V = new ArrayList();
        this.W = new ArrayList();
        this.i0 = new bl3(this, (byte) 0);
        this.j0 = true;
        this.k0 = new sk3(this, (byte) 1);
        this.w = new h92(this, (byte) 19);
        this.Q = i;
        this.R = i2;
        this.S = z;
        this.T = new fl3(i, new bl3(this, (byte) 1));
        this.Z = gm.D2(gm.N2(jb6.M0(2131754142, null), -1, 0, new ff0(this, ylbVar, context), null), true);
        O(false);
        hs6.d0(i).O0(true);
    }

    public final void W() {
        boolean isEmpty = TextUtils.isEmpty(this.h0);
        r59 r59Var = this.d;
        if (isEmpty) {
            if (!this.j0) {
                if (r59Var != null) {
                    for (int i = 0; i < r59Var.getChildCount(); i++) {
                        if (!(r59Var.getChildAt(i) instanceof tk4)) {
                        }
                    }
                }
            }
            this.T.a();
            break;
        }
        if (this.e0 && !this.c0 && r59Var != null) {
            int i2 = 0;
            while (true) {
                if (i2 >= r59Var.getChildCount()) {
                    break;
                }
                if (!(r59Var.getChildAt(i2) instanceof tk4)) {
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
                k47 k47Var = (k47) b10.f(1, arrayList);
                tL_messages_searchGlobal.offset_rate = this.f0;
                tL_messages_searchGlobal.offset_id = k47Var.e1();
                if (k47Var.k.peer_id == null) {
                    tL_messages_searchGlobal.offset_peer = new TLRPC.TL_inputPeerEmpty();
                } else {
                    tL_messages_searchGlobal.offset_peer = oc7.r1(i3).l1(k47Var.k.peer_id);
                }
                gm.d3(new ot1(this, i, tL_messages_searchGlobal, z, (byte) 2), !z ? 800L : 0L);
                if (z) {
                    this.d0 = true;
                    TLRPC.TL_contacts_search tL_contacts_search = new TLRPC.TL_contacts_search();
                    tL_contacts_search.limit = 30;
                    tL_contacts_search.bots = true;
                    tL_contacts_search.q = this.h0;
                    ConnectionsManager.getInstance(i3).sendRequestTyped(tL_contacts_search, new kc((byte) 0), new lf2(this, tL_contacts_search, (byte) 13));
                    return;
                }
                return;
            }
        }
        tL_messages_searchGlobal.offset_rate = 0;
        tL_messages_searchGlobal.offset_id = 0;
        tL_messages_searchGlobal.offset_peer = new TLRPC.TL_inputPeerEmpty();
        gm.d3(new ot1(this, i, tL_messages_searchGlobal, z, (byte) 2), !z ? 800L : 0L);
        if (z) {
        }
    }
}
