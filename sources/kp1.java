// default package

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class kp1 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ yv1 b;
    public final /* synthetic */ int c;
    public final /* synthetic */ TLObject d;
    public final /* synthetic */ TLRPC.TL_error e;
    public final /* synthetic */ int f;
    public final /* synthetic */ k47 h;
    public final /* synthetic */ TLRPC.TL_messages_getDiscussionMessage n;
    public final /* synthetic */ TLRPC.Chat r;
    public final /* synthetic */ int s;
    public final /* synthetic */ k47 w;

    public /* synthetic */ kp1(yv1 yv1Var, int i, TLObject tLObject, TLRPC.TL_error tL_error, int i2, k47 k47Var, TLRPC.TL_messages_getDiscussionMessage tL_messages_getDiscussionMessage, TLRPC.Chat chat, int i3, k47 k47Var2, byte b) {
        this.a = b;
        this.b = yv1Var;
        this.c = i;
        this.d = tLObject;
        this.e = tL_error;
        this.f = i2;
        this.h = k47Var;
        this.n = tL_messages_getDiscussionMessage;
        this.r = chat;
        this.s = i3;
        this.w = k47Var2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                yv1 yv1Var = this.b;
                yv1Var.z6(new kp1(yv1Var, this.c, this.d, this.e, this.f, this.h, this.n, this.r, this.s, this.w, (byte) 1));
                break;
            default:
                yv1 yv1Var2 = this.b;
                if (this.c == yv1Var2.Xc) {
                    yv1Var2.Zc = -1;
                    TLObject tLObject = this.d;
                    if (tLObject == null) {
                        if ("CHANNEL_PRIVATE".equals(this.e.text)) {
                            oc7.Z4(jb6.M0(2131752391, null), yv1Var2);
                            yv1Var2.ad = 0;
                            yv1Var2.bd = false;
                            yv1Var2.A0.h1();
                            break;
                        }
                    } else {
                        yv1Var2.ed = (TLRPC.messages_Messages) tLObject;
                    }
                    yv1Var2.Pa(yv1Var2.dd, yv1Var2.ed, this.f, this.h, this.n, this.r, this.s, this.w);
                    break;
                }
                break;
        }
    }
}
