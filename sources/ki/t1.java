package ki;

import android.app.Activity;
import android.content.Context;
import android.graphics.Paint;
import c8.l9;
import java.util.ArrayList;
import org.telegram.messenger.gd;
import org.telegram.messenger.mp;
import org.telegram.messenger.ri;
import org.telegram.messenger.zy;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.cb;
import org.telegram.ui.Components.lc;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.bn;
import org.telegram.ui.qy0;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes4.dex */
public final /* synthetic */ class t1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ t2 b;

    public /* synthetic */ t1(t2 t2Var, int i7) {
        this.a = i7;
        this.b = t2Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i7 = this.a;
        int i10 = 0;
        t2 t2Var = this.b;
        switch (i7) {
            case 0:
                t2.f(t2Var);
                break;
            case 1:
                if (!t2Var.e0 && t2Var.L != 0) {
                    TLRPC.TL_messages_prolongWebView tL_messages_prolongWebView = new TLRPC.TL_messages_prolongWebView();
                    tL_messages_prolongWebView.bot = mp.u1(t2Var.I).q1(t2Var.J);
                    tL_messages_prolongWebView.peer = mp.u1(t2Var.I).l1(t2Var.K);
                    tL_messages_prolongWebView.query_id = t2Var.L;
                    tL_messages_prolongWebView.silent = false;
                    if (t2Var.M != 0) {
                        zy.C(t2Var.I);
                        int i11 = t2Var.M;
                        TLRPC.TL_inputReplyToMessage tL_inputReplyToMessage = new TLRPC.TL_inputReplyToMessage();
                        tL_inputReplyToMessage.reply_to_msg_id = i11;
                        tL_messages_prolongWebView.reply_to = tL_inputReplyToMessage;
                        if (t2Var.N != 0) {
                            tL_inputReplyToMessage.monoforum_peer_id = mp.u1(t2Var.I).l1(t2Var.N);
                            tL_messages_prolongWebView.reply_to.flags |= 32;
                        }
                        tL_messages_prolongWebView.flags |= 1;
                    } else if (t2Var.N != 0) {
                        TLRPC.TL_inputReplyToMonoForum tL_inputReplyToMonoForum = new TLRPC.TL_inputReplyToMonoForum();
                        tL_messages_prolongWebView.reply_to = tL_inputReplyToMonoForum;
                        tL_inputReplyToMonoForum.monoforum_peer_id = mp.u1(t2Var.I).l1(t2Var.N);
                        tL_messages_prolongWebView.flags |= 1;
                    }
                    ConnectionsManager.getInstance(t2Var.I).sendRequest(tL_messages_prolongWebView, new d2(t2Var, i10));
                    break;
                }
                break;
            case 2:
                t2Var.I();
                break;
            case 3:
                t2Var.x.requestLayout();
                break;
            case 4:
                if (!t2Var.E.D()) {
                    t2Var.v();
                    break;
                }
                break;
            case 5:
                t2Var.z0 = true;
                t2Var.o(true);
                break;
            case 6:
                t2Var.w();
                break;
            case 7:
                Paint paint = t2Var.Q;
                k2 k2Var = t2Var.x;
                if (k2Var.getSwipeOffsetY() > 0.0f) {
                    paint.setAlpha((int) ((1.0f - l9.a(k2Var.getSwipeOffsetY() / k2Var.getHeight(), 0.0f, 1.0f)) * 64.0f));
                } else {
                    paint.setAlpha(64);
                }
                t2Var.f.invalidate();
                t2Var.E.n(false, false);
                if (t2Var.d != null) {
                    float f10 = (1.0f - (Math.min(k2Var.getTopActionBarOffsetY(), k2Var.getTranslationY() - k2Var.getTopActionBarOffsetY()) / k2Var.getTopActionBarOffsetY()) <= 0.5f ? 0 : 1) * 100.0f;
                    r1.g gVar = t2Var.d;
                    r1.h hVar = gVar.m;
                    if (((float) hVar.i) != f10) {
                        hVar.i = f10;
                        gVar.h();
                    }
                }
                if (t2Var.f0) {
                    int i12 = t2Var.n.bottom;
                } else {
                    Math.max(0.0f, k2Var.getSwipeOffsetY());
                }
                System.currentTimeMillis();
                break;
            case 8:
                t2Var.E.n(true, false);
                break;
            case 9:
                Activity activity = t2Var.m0;
                if (activity instanceof LaunchActivity) {
                    ((LaunchActivity) activity).t0(bn.ua(t2Var.J));
                }
                t2Var.o(true);
                break;
            case 10:
                l2 l2Var = t2Var.E;
                l2Var.getClass();
                l2Var.Q = System.currentTimeMillis();
                l2Var.y("settings_button_pressed", null);
                break;
            case 11:
                ri.d0(t2Var.I).A0(t2Var.J, ri.f2, null);
                break;
            case 12:
                vf.c.t(t2Var.getContext(), gd.M0(2131752882, null));
                break;
            case 13:
                int i13 = t2Var.I;
                Context context = t2Var.getContext();
                lc lcVar = new lc(cb.a(t2Var.getContext()), t2Var.G);
                long j3 = t2Var.J;
                int i14 = qy0.w1;
                qy0.K0(i13, context, j3, false, false, new ArrayList(), lcVar, null, new byte[0], null, null);
                break;
            case 14:
                t2.n(t2Var.I, t2Var.J, new t1(t2Var, 15));
                break;
            case 15:
                t2Var.o(false);
                break;
            default:
                t2Var.o(false);
                break;
        }
    }
}
