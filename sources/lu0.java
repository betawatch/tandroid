// default package

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_keyboard;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final /* synthetic */ class lu0 implements oi7, oj3 {
    public final /* synthetic */ rv0 a;
    public final /* synthetic */ boolean[] b;
    public final /* synthetic */ String c;
    public final /* synthetic */ TL_keyboard.TL_buttonTypeRequestPeer d;
    public final /* synthetic */ pv0 e;

    public /* synthetic */ lu0(rv0 rv0Var, boolean[] zArr, String str, TL_keyboard.TL_buttonTypeRequestPeer tL_buttonTypeRequestPeer, pv0 pv0Var) {
        this.a = rv0Var;
        this.b = zArr;
        this.c = str;
        this.d = tL_buttonTypeRequestPeer;
        this.e = pv0Var;
    }

    @Override // oj3
    public final boolean E() {
        return false;
    }

    @Override // oi7
    public final void a(ArrayList arrayList) {
        if (arrayList.isEmpty()) {
            return;
        }
        this.b[0] = true;
        TLRPC.TL_messages_sendBotRequestedPeer tL_messages_sendBotRequestedPeer = new TLRPC.TL_messages_sendBotRequestedPeer();
        rv0 rv0Var = this.a;
        uc7.s1(rv0Var.N);
        tL_messages_sendBotRequestedPeer.peer = uc7.n1(rv0Var.V);
        String str = this.c;
        tL_messages_sendBotRequestedPeer.webapp_req_id = str;
        tL_messages_sendBotRequestedPeer.button_id = this.d.button_id;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            tL_messages_sendBotRequestedPeer.requested_peers.add(uc7.s1(rv0Var.N).j1(((Long) obj).longValue()));
        }
        ConnectionsManager.getInstance(rv0Var.N).sendRequestTyped(tL_messages_sendBotRequestedPeer, new ic((byte) 0), new du0(rv0Var, this.e, str, (byte) 2));
    }

    @Override // oj3
    public final boolean q(uj3 uj3Var, ArrayList arrayList, CharSequence charSequence, boolean z, boolean z2, int i, int i2, tzb tzbVar) {
        byte b = 1;
        if (!arrayList.isEmpty()) {
            this.b[0] = true;
            TLRPC.TL_messages_sendBotRequestedPeer tL_messages_sendBotRequestedPeer = new TLRPC.TL_messages_sendBotRequestedPeer();
            rv0 rv0Var = this.a;
            uc7.s1(rv0Var.N);
            tL_messages_sendBotRequestedPeer.peer = uc7.n1(rv0Var.V);
            String str = this.c;
            tL_messages_sendBotRequestedPeer.webapp_req_id = str;
            tL_messages_sendBotRequestedPeer.button_id = this.d.button_id;
            HashSet hashSet = new HashSet();
            int size = arrayList.size();
            int i3 = 0;
            while (i3 < size) {
                Object obj = arrayList.get(i3);
                i3++;
                hashSet.add(Long.valueOf(((if7) obj).a));
            }
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                tL_messages_sendBotRequestedPeer.requested_peers.add(uc7.s1(rv0Var.N).j1(((Long) it.next()).longValue()));
            }
            ConnectionsManager.getInstance(rv0Var.N).sendRequestTyped(tL_messages_sendBotRequestedPeer, new ic((byte) 0), new du0(rv0Var, this.e, str, b));
        }
        uj3Var.finishFragment();
        return true;
    }

    @Override // oj3
    public final boolean s(uj3 uj3Var) {
        return false;
    }
}
