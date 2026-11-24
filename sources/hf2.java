// default package

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final /* synthetic */ class hf2 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ jf2 b;
    public final /* synthetic */ String c;

    public /* synthetic */ hf2(jf2 jf2Var, String str, byte b) {
        this.a = b;
        this.b = jf2Var;
        this.c = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        hn1 hn1Var;
        byte b = 1;
        switch (this.a) {
            case 0:
                jf2 jf2Var = this.b;
                jf2Var.getClass();
                gl.d3(new hf2(jf2Var, this.c, b));
                break;
            default:
                jf2 jf2Var2 = this.b;
                jf2Var2.n = null;
                kf2 kf2Var = jf2Var2.E;
                TLRPC.Chat chat = kf2Var.n;
                int i = kf2Var.e1;
                ArrayList arrayList = (hc2.T(chat) || kf2Var.r == null) ? null : new ArrayList(kf2Var.r.participants.participants);
                ArrayList arrayList2 = i == 1 ? new ArrayList(kf2Var.getContactsController().f0) : null;
                String str = this.c;
                if (arrayList == null && arrayList2 == null) {
                    jf2Var2.s = false;
                    hn1Var = null;
                } else {
                    hn1Var = new hn1(jf2Var2, str, arrayList, arrayList2, (byte) 11);
                }
                jf2Var2.h.h(str, i != 0, false, true, false, false, hc2.T(kf2Var.n) ? kf2Var.N : 0L, false, kf2Var.O, 1, 0L, hn1Var);
                break;
        }
    }
}
