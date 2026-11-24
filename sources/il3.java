// default package

import android.app.Activity;
import java.util.ArrayList;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public abstract class il3 extends l7c {
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
    public final bi3 f0;

    public il3(r59 r59Var, Activity activity, int i, int i2) {
        super(r59Var, activity, i, 0, false, null, null);
        this.S = new ArrayList();
        this.T = new ArrayList();
        this.U = new ArrayList();
        this.V = new ArrayList();
        this.Y = new ArrayList();
        qv9 qv9Var = (qv9) this;
        this.f0 = new bi3(qv9Var, (byte) 9);
        this.w = new h92(qv9Var, (byte) 20);
        this.Q = i;
        this.R = i2;
        O(false);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:19:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x007c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void W(boolean z) {
        this.Z = true;
        int i = this.d0 + 1;
        this.d0 = i;
        TLRPC.TL_messages_searchGlobal tL_messages_searchGlobal = new TLRPC.TL_messages_searchGlobal();
        tL_messages_searchGlobal.broadcasts_only = true;
        int i2 = this.R;
        if (i2 != 0) {
            tL_messages_searchGlobal.flags |= 1;
            tL_messages_searchGlobal.folder_id = i2;
        }
        tL_messages_searchGlobal.q = this.e0;
        tL_messages_searchGlobal.limit = 25;
        tL_messages_searchGlobal.filter = new TLRPC.TL_inputMessagesFilterEmpty();
        int i3 = this.Q;
        if (z) {
            ArrayList arrayList = this.S;
            if (!arrayList.isEmpty()) {
                k47 k47Var = (k47) b10.f(1, arrayList);
                tL_messages_searchGlobal.offset_rate = this.c0;
                tL_messages_searchGlobal.offset_id = k47Var.e1();
                if (k47Var.k.peer_id == null) {
                    tL_messages_searchGlobal.offset_peer = new TLRPC.TL_inputPeerEmpty();
                } else {
                    tL_messages_searchGlobal.offset_peer = oc7.r1(i3).l1(k47Var.k.peer_id);
                }
                gm.d3(new ot1(this, i, tL_messages_searchGlobal, z, (byte) 3), !z ? 800L : 0L);
                if (z) {
                    this.a0 = true;
                    TLRPC.TL_contacts_search tL_contacts_search = new TLRPC.TL_contacts_search();
                    tL_contacts_search.limit = 20;
                    tL_contacts_search.broadcasts = true;
                    tL_contacts_search.q = this.e0;
                    ConnectionsManager.getInstance(i3).sendRequestTyped(tL_contacts_search, new kc((byte) 0), new lf2(this, tL_contacts_search, (byte) 14));
                    return;
                }
                return;
            }
        }
        tL_messages_searchGlobal.offset_rate = 0;
        tL_messages_searchGlobal.offset_id = 0;
        tL_messages_searchGlobal.offset_peer = new TLRPC.TL_inputPeerEmpty();
        gm.d3(new ot1(this, i, tL_messages_searchGlobal, z, (byte) 3), !z ? 800L : 0L);
        if (z) {
        }
    }

    public final void X() {
        ArrayList arrayList = new ArrayList();
        int i = this.Q;
        ArrayList arrayList2 = oc7.r1(i).y;
        int size = arrayList2.size();
        int i2 = 0;
        while (i2 < size) {
            Object obj = arrayList2.get(i2);
            i2++;
            TLRPC.Chat L0 = oc7.r1(i).L0(Long.valueOf(-((TLRPC.Dialog) obj).id));
            if (L0 != null && sd2.V(L0) && sd2.t0(L0) && !sd2.r0(L0)) {
                arrayList.add(L0);
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
