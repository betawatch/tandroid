// default package

import org.telegram.messenger.MediaController;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final /* synthetic */ class bl1 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ mu1 b;
    public final /* synthetic */ k27 c;

    public /* synthetic */ bl1(mu1 mu1Var, k27 k27Var, byte b) {
        this.a = b;
        this.b = mu1Var;
        this.c = k27Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        TLRPC.WebPage webPage;
        int i;
        boolean z;
        byte b = this.a;
        mu1 mu1Var = this.b;
        k27 k27Var = this.c;
        switch (b) {
            case 0:
                TLRPC.MessageMedia messageMedia = k27Var.k.media;
                if (messageMedia != null && (webPage = messageMedia.webpage) != null && webPage.cached_page != null) {
                    LaunchActivity launchActivity = LaunchActivity.H1;
                    if (launchActivity == null || launchActivity.O() == null || LaunchActivity.H1.O().k(k27Var) == null) {
                        mu1Var.createArticleViewer(false).L(k27Var, null, null, null);
                        break;
                    }
                }
                break;
            case 1:
                TLRPC.Message message = k27Var.k;
                int i2 = message.ttl;
                if (i2 != Integer.MAX_VALUE) {
                    z = true;
                    i = i2;
                } else {
                    i = 0;
                    z = false;
                }
                message.destroyTime = mu1Var.getConnectionsManager().getCurrentTime() + i;
                k27Var.k.destroyTimeMillis = mu1Var.getConnectionsManager().getCurrentTimeMillis() + (i * 1000);
                if (mu1Var.h == null) {
                    mu1Var.getMessagesController().s3(mu1Var.l6, k27Var.e1(), null, i, 0L, z);
                    break;
                } else {
                    mu1Var.getMessagesController().r3(mu1Var.l6, i, k27Var.k.random_id);
                    break;
                }
            case 2:
                mu1 mu1Var2 = this.b;
                mu1Var2.getClass();
                mu1Var2.ib(k27Var.e1(), 0, true, 0, true, 0, null, null, new vm1(mu1Var2, (byte) 14));
                if (mu1Var2.z6.isEmpty()) {
                    mu1Var2.bc(false);
                    break;
                }
                break;
            case 3:
                int N1 = k27Var.N1();
                TLRPC.Message message2 = k27Var.k;
                int i3 = message2.id;
                long B0 = k27.B0(message2);
                mu1 mu1Var3 = this.b;
                mu1Var3.ib(N1, i3, true, B0 == mu1Var3.d7 ? 1 : 0, false, 0, null, ((TLRPC.TL_messageActionPollAppendAnswer) k27Var.k.action).answer.option, null);
                break;
            case 4:
                int N12 = k27Var.N1();
                TLRPC.Message message3 = k27Var.k;
                int i4 = message3.id;
                long B02 = k27.B0(message3);
                mu1 mu1Var4 = this.b;
                mu1Var4.ib(N12, i4, true, B02 == mu1Var4.d7 ? 1 : 0, false, 0, null, null, null);
                break;
            case 5:
                int N13 = k27Var.N1();
                TLRPC.Message message4 = k27Var.k;
                int i5 = message4.id;
                long B03 = k27.B0(message4);
                mu1 mu1Var5 = this.b;
                mu1Var5.J(N13, i5, B03 == mu1Var5.d7 ? 1 : 0, 0, true, false);
                break;
            case 6:
                mu1Var.getMessagesController().E3(mu1Var.e, mu1Var.f, k27Var.e1(), true, false, false);
                mu1Var.P3 = null;
                break;
            case 7:
                if (!k27.K4(k27Var.k)) {
                    MediaController.w().R(k27Var);
                    break;
                } else {
                    mu1Var.ma(null, k27Var);
                    break;
                }
            default:
                u21.b0(mu1Var).c(k96.M0(2131754485, null)).j();
                mu1Var.Pa(k27Var);
                mu1Var.Ra(k27Var);
                break;
        }
    }
}
