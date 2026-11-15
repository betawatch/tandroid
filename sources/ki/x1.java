package ki;

import android.app.Activity;
import android.content.Context;
import android.graphics.Paint;
import c8.i9;
import java.util.ArrayList;
import org.telegram.messenger.ez;
import org.telegram.messenger.hd;
import org.telegram.messenger.np;
import org.telegram.messenger.si;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.cc;
import org.telegram.ui.Components.ta;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.an;
import org.telegram.ui.my0;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes4.dex */
public final /* synthetic */ class x1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ x2 b;

    public /* synthetic */ x1(x2 x2Var, int i7) {
        this.a = i7;
        this.b = x2Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i7 = this.a;
        int i10 = 0;
        x2 x2Var = this.b;
        switch (i7) {
            case 0:
                x2.f(x2Var);
                break;
            case 1:
                if (!x2Var.e0 && x2Var.L != 0) {
                    TLRPC.TL_messages_prolongWebView tL_messages_prolongWebView = new TLRPC.TL_messages_prolongWebView();
                    tL_messages_prolongWebView.bot = np.s1(x2Var.I).o1(x2Var.J);
                    tL_messages_prolongWebView.peer = np.s1(x2Var.I).j1(x2Var.K);
                    tL_messages_prolongWebView.query_id = x2Var.L;
                    tL_messages_prolongWebView.silent = false;
                    if (x2Var.M != 0) {
                        ez.C(x2Var.I);
                        int i11 = x2Var.M;
                        TLRPC.TL_inputReplyToMessage tL_inputReplyToMessage = new TLRPC.TL_inputReplyToMessage();
                        tL_inputReplyToMessage.reply_to_msg_id = i11;
                        tL_messages_prolongWebView.reply_to = tL_inputReplyToMessage;
                        if (x2Var.N != 0) {
                            tL_inputReplyToMessage.monoforum_peer_id = np.s1(x2Var.I).j1(x2Var.N);
                            tL_messages_prolongWebView.reply_to.flags |= 32;
                        }
                        tL_messages_prolongWebView.flags |= 1;
                    } else if (x2Var.N != 0) {
                        TLRPC.TL_inputReplyToMonoForum tL_inputReplyToMonoForum = new TLRPC.TL_inputReplyToMonoForum();
                        tL_messages_prolongWebView.reply_to = tL_inputReplyToMonoForum;
                        tL_inputReplyToMonoForum.monoforum_peer_id = np.s1(x2Var.I).j1(x2Var.N);
                        tL_messages_prolongWebView.flags |= 1;
                    }
                    ConnectionsManager.getInstance(x2Var.I).sendRequest(tL_messages_prolongWebView, new h2(x2Var, i10));
                    break;
                }
                break;
            case 2:
                x2Var.I();
                break;
            case 3:
                x2Var.x.requestLayout();
                break;
            case 4:
                if (!x2Var.E.D()) {
                    x2Var.v();
                    break;
                }
                break;
            case 5:
                x2Var.z0 = true;
                x2Var.o(true);
                break;
            case 6:
                x2Var.w();
                break;
            case 7:
                Paint paint = x2Var.Q;
                o2 o2Var = x2Var.x;
                if (o2Var.getSwipeOffsetY() > 0.0f) {
                    paint.setAlpha((int) ((1.0f - i9.a(o2Var.getSwipeOffsetY() / o2Var.getHeight(), 0.0f, 1.0f)) * 64.0f));
                } else {
                    paint.setAlpha(64);
                }
                x2Var.f.invalidate();
                x2Var.E.n(false, false);
                if (x2Var.d != null) {
                    float f10 = (1.0f - (Math.min(o2Var.getTopActionBarOffsetY(), o2Var.getTranslationY() - o2Var.getTopActionBarOffsetY()) / o2Var.getTopActionBarOffsetY()) <= 0.5f ? 0 : 1) * 100.0f;
                    r1.g gVar = x2Var.d;
                    r1.h hVar = gVar.m;
                    if (((float) hVar.i) != f10) {
                        hVar.i = f10;
                        gVar.h();
                    }
                }
                if (x2Var.f0) {
                    int i12 = x2Var.n.bottom;
                } else {
                    Math.max(0.0f, o2Var.getSwipeOffsetY());
                }
                System.currentTimeMillis();
                break;
            case 8:
                x2Var.E.n(true, false);
                break;
            case 9:
                Activity activity = x2Var.m0;
                if (activity instanceof LaunchActivity) {
                    ((LaunchActivity) activity).t0(an.ua(x2Var.J));
                }
                x2Var.o(true);
                break;
            case 10:
                p2 p2Var = x2Var.E;
                p2Var.getClass();
                p2Var.Q = System.currentTimeMillis();
                p2Var.y("settings_button_pressed", null);
                break;
            case 11:
                si.b0(x2Var.I).y0(x2Var.J, si.d2, null);
                break;
            case 12:
                vf.c.t(x2Var.getContext(), hd.M0(2131752893, null));
                break;
            case 13:
                int i13 = x2Var.I;
                Context context = x2Var.getContext();
                cc ccVar = new cc(ta.a(x2Var.getContext()), x2Var.G);
                long j3 = x2Var.J;
                int i14 = my0.w1;
                my0.J0(i13, context, j3, false, false, new ArrayList(), ccVar, null, new byte[0], null, null);
                break;
            case 14:
                x2.n(x2Var.I, x2Var.J, new x1(x2Var, 15));
                break;
            case 15:
                x2Var.o(false);
                break;
            default:
                x2Var.o(false);
                break;
        }
    }
}
