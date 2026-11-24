// default package

import android.graphics.Point;
import android.text.SpannableStringBuilder;
import java.util.Arrays;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final /* synthetic */ class it0 implements p8c {
    public final /* synthetic */ byte a = 1;
    public final /* synthetic */ int b;
    public final /* synthetic */ long c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ it0(int i, long j, p8c p8cVar, TLRPC.WallPaper wallPaper) {
        this.d = p8cVar;
        this.e = wallPaper;
        this.b = i;
        this.c = j;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p8c
    public final void a(Object obj) {
        String str;
        TLRPC.Chat chat;
        byte b = this.a;
        int i = this.b;
        long j = this.c;
        Object obj2 = this.e;
        Object obj3 = this.d;
        switch (b) {
            case 0:
                qvb qvbVar = (qvb) obj3;
                cj3 cj3Var = (cj3) obj2;
                Boolean bool = (Boolean) obj;
                if (qvbVar != null) {
                    qvbVar.finishFragment();
                    cj3Var.removeSelfFromStack();
                } else {
                    cj3Var.finishFragment();
                }
                d S = LaunchActivity.S();
                if (S != null) {
                    if (j >= 0) {
                        TLRPC.User V1 = na7.q1(i).V1(Long.valueOf(j));
                        str = l7c.l(V1);
                        chat = V1;
                    } else {
                        TLRPC.Chat K0 = na7.q1(i).K0(Long.valueOf(-j));
                        if (K0 == null) {
                            str = "";
                            chat = K0;
                        } else {
                            str = K0.title;
                            chat = K0;
                        }
                    }
                    u21 b0 = u21.b0(S);
                    SpannableStringBuilder T2 = gl.T2(k96.a0(null, null, bool.booleanValue() ? 2131752976 : 2131752975, str));
                    b0.getClass();
                    b0.V(Arrays.asList(chat), T2, null, null).k(false);
                    break;
                }
                break;
            case 1:
                p8c p8cVar = (p8c) obj3;
                TLRPC.WallPaper wallPaper = (TLRPC.WallPaper) obj2;
                mqc mqcVar = (mqc) obj;
                if (mqcVar == null) {
                    gl5 b2 = gl5.b(wallPaper.document);
                    ImageReceiver imageReceiver = new ImageReceiver(null);
                    imageReceiver.A1 = false;
                    Point point = gl.q;
                    imageReceiver.d0(b2, (Math.min(point.x, point.y) / gl.p) + "_" + (Math.max(point.x, point.y) / gl.p) + "_f", null, ".jpg", wallPaper, 1);
                    imageReceiver.h1 = new gf((Object) p8cVar, this.b, this.c, (byte) 3);
                    fl5.z().I(imageReceiver, null);
                    break;
                } else {
                    p8cVar.a(mqcVar);
                    break;
                }
            default:
                String str2 = (String) obj3;
                TLRPC.TL_messageActionStarGiftOnchainOffer tL_messageActionStarGiftOnchainOffer = (TLRPC.TL_messageActionStarGiftOnchainOffer) obj2;
                if (!((Boolean) obj).booleanValue()) {
                    vp7.g(j);
                    vp7.d.remove(vp7.a(i, j));
                    vp7.c();
                    vp7.s(2131749571, tL_messageActionStarGiftOnchainOffer.gift);
                    break;
                } else {
                    m21 G = vp7.h().G(R.raw.contact_check, 3, k96.a0(null, null, 2131749611, str2));
                    G.t = true;
                    G.j();
                    break;
                }
        }
    }

    public /* synthetic */ it0(qvb qvbVar, cj3 cj3Var, long j, int i) {
        this.d = qvbVar;
        this.e = cj3Var;
        this.c = j;
        this.b = i;
    }

    public /* synthetic */ it0(String str, long j, int i, TLRPC.TL_messageActionStarGiftOnchainOffer tL_messageActionStarGiftOnchainOffer) {
        this.d = str;
        this.c = j;
        this.b = i;
        this.e = tL_messageActionStarGiftOnchainOffer;
    }
}
