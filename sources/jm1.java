// default package

import android.os.SystemClock;
import org.telegram.messenger.MediaController;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class jm1 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ yv1 b;
    public final /* synthetic */ k47 c;

    public /* synthetic */ jm1(yv1 yv1Var, k47 k47Var, byte b) {
        this.a = b;
        this.b = yv1Var;
        this.c = k47Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        TLRPC.WebPage webPage;
        int i;
        boolean z;
        byte b = this.a;
        yv1 yv1Var = this.b;
        k47 k47Var = this.c;
        switch (b) {
            case 0:
                k47 k47Var2 = this.c;
                TLRPC.MessageMedia messageMedia = k47Var2.k.media;
                if (messageMedia != null && (webPage = messageMedia.webpage) != null && webPage.cached_page != null) {
                    n02 n02Var = yv1Var.c4;
                    if (n02Var != null) {
                        String str = webPage.url;
                        vh2 vh2Var = n02Var.n;
                        long uptimeMillis = SystemClock.uptimeMillis();
                        if (str == null || !str.equals((String) vh2Var.c) || uptimeMillis - vh2Var.b >= 1000) {
                            vh2Var.c = str;
                            vh2Var.b = uptimeMillis;
                            n02Var.a(k47Var2, "open_iv", null, null, false);
                        }
                    }
                    LaunchActivity launchActivity = LaunchActivity.H1;
                    if (launchActivity == null || launchActivity.O() == null || LaunchActivity.H1.O().k(k47Var2) == null) {
                        yv1Var.createArticleViewer(false).L(k47Var2, null, null, null);
                        break;
                    }
                }
                break;
            case 1:
                TLRPC.Message message = k47Var.k;
                int i2 = message.ttl;
                if (i2 != Integer.MAX_VALUE) {
                    z = true;
                    i = i2;
                } else {
                    i = 0;
                    z = false;
                }
                message.destroyTime = yv1Var.getConnectionsManager().getCurrentTime() + i;
                k47Var.k.destroyTimeMillis = yv1Var.getConnectionsManager().getCurrentTimeMillis() + (i * 1000);
                if (yv1Var.h == null) {
                    yv1Var.getMessagesController().u3(yv1Var.l6, k47Var.e1(), null, i, 0L, z);
                    break;
                } else {
                    yv1Var.getMessagesController().t3(yv1Var.l6, i, k47Var.k.random_id);
                    break;
                }
            case 2:
                yv1 yv1Var2 = this.b;
                yv1Var2.getClass();
                yv1Var2.sb(k47Var.e1(), 0, true, 0, true, 0, null, null, new ho1(yv1Var2, (byte) 18));
                if (yv1Var2.z6.isEmpty()) {
                    yv1Var2.nc(false);
                    break;
                }
                break;
            case 3:
                int N1 = k47Var.N1();
                TLRPC.Message message2 = k47Var.k;
                int i3 = message2.id;
                long B0 = k47.B0(message2);
                yv1 yv1Var3 = this.b;
                yv1Var3.sb(N1, i3, true, B0 == yv1Var3.d7 ? 1 : 0, false, 0, null, ((TLRPC.TL_messageActionPollAppendAnswer) k47Var.k.action).answer.option, null);
                break;
            case 4:
                int N12 = k47Var.N1();
                TLRPC.Message message3 = k47Var.k;
                int i4 = message3.id;
                long B02 = k47.B0(message3);
                yv1 yv1Var4 = this.b;
                yv1Var4.sb(N12, i4, true, B02 == yv1Var4.d7 ? 1 : 0, false, 0, null, null, null);
                break;
            case 5:
                int N13 = k47Var.N1();
                TLRPC.Message message4 = k47Var.k;
                int i5 = message4.id;
                long B03 = k47.B0(message4);
                yv1 yv1Var5 = this.b;
                yv1Var5.J(N13, i5, B03 == yv1Var5.d7 ? 1 : 0, 0, true, false);
                break;
            case 6:
                yv1Var.getMessagesController().G3(yv1Var.e, yv1Var.f, k47Var.e1(), true, false, false);
                yv1Var.P3 = null;
                break;
            case 7:
                if (!k47.K4(k47Var.k)) {
                    MediaController.w().R(k47Var);
                    break;
                } else {
                    yv1Var.wa(null, k47Var);
                    break;
                }
            default:
                c41.b0(yv1Var).c(jb6.M0(2131754485, null)).j();
                yv1Var.Za(k47Var);
                yv1Var.bb(k47Var);
                break;
        }
    }
}
