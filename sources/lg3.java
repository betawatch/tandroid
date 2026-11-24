// default package

import java.util.Collections;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final /* synthetic */ class lg3 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ cj3 b;
    public final /* synthetic */ long c;
    public final /* synthetic */ boolean d;

    public /* synthetic */ lg3(cj3 cj3Var, long j, boolean z, byte b) {
        this.a = b;
        this.b = cj3Var;
        this.c = j;
        this.d = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        String str;
        TLRPC.Chat chat;
        byte b = this.a;
        boolean z = this.d;
        long j = this.c;
        cj3 cj3Var = this.b;
        switch (b) {
            case 0:
                cj3 cj3Var2 = this.b;
                g2b M1 = cj3Var2.getMessagesController().M1();
                long j2 = this.c;
                boolean z2 = this.d;
                M1.l0(j2, z2, false);
                lv6 lv6Var = new lv6((byte) 10, false);
                lv6Var.b = new lg3(cj3Var2, j2, z2, (byte) 1);
                lv6Var.c = new lg3(cj3Var2, j2, z2, (byte) 2);
                if (j2 >= 0) {
                    TLRPC.User V1 = cj3Var2.getMessagesController().V1(Long.valueOf(j2));
                    str = qu2.m(15, V1.first_name, null);
                    chat = V1;
                } else {
                    TLRPC.Chat K0 = cj3Var2.getMessagesController().K0(Long.valueOf(-j2));
                    str = K0.title;
                    chat = K0;
                }
                cj3Var2.T = u21.Y().V(Collections.singletonList(chat), cj3Var2.D3() ? gl.T2(k96.a0("StoriesMovedToDialogs", null, 2131744521, str)) : gl.T2(k96.a0("StoriesMovedToContacts", null, 2131744522, qu2.m(15, str, null))), null, lv6Var).j();
                break;
            case 1:
                cj3Var.getMessagesController().M1().l0(j, !z, false);
                break;
            default:
                cj3Var.getMessagesController().M1().l0(j, z, true);
                break;
        }
    }
}
