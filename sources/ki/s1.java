package ki;

import android.app.Activity;
import android.content.Context;
import android.graphics.Paint;
import c8.l9;
import java.util.ArrayList;
import org.telegram.messenger.az;
import org.telegram.messenger.hd;
import org.telegram.messenger.np;
import org.telegram.messenger.si;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.cb;
import org.telegram.ui.Components.lc;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.bn;
import org.telegram.ui.qy0;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes4.dex */
public final /* synthetic */ class s1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ s2 b;

    public /* synthetic */ s1(s2 s2Var, int i7) {
        this.a = i7;
        this.b = s2Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i7 = this.a;
        int i10 = 0;
        s2 s2Var = this.b;
        switch (i7) {
            case 0:
                s2.f(s2Var);
                break;
            case 1:
                if (!s2Var.e0 && s2Var.L != 0) {
                    TLRPC.TL_messages_prolongWebView tL_messages_prolongWebView = new TLRPC.TL_messages_prolongWebView();
                    tL_messages_prolongWebView.bot = np.u1(s2Var.I).q1(s2Var.J);
                    tL_messages_prolongWebView.peer = np.u1(s2Var.I).l1(s2Var.K);
                    tL_messages_prolongWebView.query_id = s2Var.L;
                    tL_messages_prolongWebView.silent = false;
                    if (s2Var.M != 0) {
                        az.C(s2Var.I);
                        int i11 = s2Var.M;
                        TLRPC.TL_inputReplyToMessage tL_inputReplyToMessage = new TLRPC.TL_inputReplyToMessage();
                        tL_inputReplyToMessage.reply_to_msg_id = i11;
                        tL_messages_prolongWebView.reply_to = tL_inputReplyToMessage;
                        if (s2Var.N != 0) {
                            tL_inputReplyToMessage.monoforum_peer_id = np.u1(s2Var.I).l1(s2Var.N);
                            tL_messages_prolongWebView.reply_to.flags |= 32;
                        }
                        tL_messages_prolongWebView.flags |= 1;
                    } else if (s2Var.N != 0) {
                        TLRPC.TL_inputReplyToMonoForum tL_inputReplyToMonoForum = new TLRPC.TL_inputReplyToMonoForum();
                        tL_messages_prolongWebView.reply_to = tL_inputReplyToMonoForum;
                        tL_inputReplyToMonoForum.monoforum_peer_id = np.u1(s2Var.I).l1(s2Var.N);
                        tL_messages_prolongWebView.flags |= 1;
                    }
                    ConnectionsManager.getInstance(s2Var.I).sendRequest(tL_messages_prolongWebView, new c2(s2Var, i10));
                    break;
                }
                break;
            case 2:
                s2Var.I();
                break;
            case 3:
                s2Var.x.requestLayout();
                break;
            case 4:
                if (!s2Var.E.D()) {
                    s2Var.v();
                    break;
                }
                break;
            case 5:
                s2Var.z0 = true;
                s2Var.o(true);
                break;
            case 6:
                s2Var.w();
                break;
            case 7:
                Paint paint = s2Var.Q;
                j2 j2Var = s2Var.x;
                if (j2Var.getSwipeOffsetY() > 0.0f) {
                    paint.setAlpha((int) ((1.0f - l9.a(j2Var.getSwipeOffsetY() / j2Var.getHeight(), 0.0f, 1.0f)) * 64.0f));
                } else {
                    paint.setAlpha(64);
                }
                s2Var.f.invalidate();
                s2Var.E.n(false, false);
                if (s2Var.d != null) {
                    float f10 = (1.0f - (Math.min(j2Var.getTopActionBarOffsetY(), j2Var.getTranslationY() - j2Var.getTopActionBarOffsetY()) / j2Var.getTopActionBarOffsetY()) <= 0.5f ? 0 : 1) * 100.0f;
                    r1.g gVar = s2Var.d;
                    r1.h hVar = gVar.m;
                    if (((float) hVar.i) != f10) {
                        hVar.i = f10;
                        gVar.h();
                    }
                }
                if (s2Var.f0) {
                    int i12 = s2Var.n.bottom;
                } else {
                    Math.max(0.0f, j2Var.getSwipeOffsetY());
                }
                System.currentTimeMillis();
                break;
            case 8:
                s2Var.E.n(true, false);
                break;
            case 9:
                Activity activity = s2Var.m0;
                if (activity instanceof LaunchActivity) {
                    ((LaunchActivity) activity).t0(bn.ua(s2Var.J));
                }
                s2Var.o(true);
                break;
            case 10:
                k2 k2Var = s2Var.E;
                k2Var.getClass();
                k2Var.Q = System.currentTimeMillis();
                k2Var.y("settings_button_pressed", null);
                break;
            case 11:
                si.d0(s2Var.I).A0(s2Var.J, si.f2, null);
                break;
            case 12:
                vf.c.t(s2Var.getContext(), hd.N0(2131752881, null));
                break;
            case 13:
                int i13 = s2Var.I;
                Context context = s2Var.getContext();
                lc lcVar = new lc(cb.a(s2Var.getContext()), s2Var.G);
                long j3 = s2Var.J;
                int i14 = qy0.w1;
                qy0.K0(i13, context, j3, false, false, new ArrayList(), lcVar, null, new byte[0], null, null);
                break;
            case 14:
                s2.n(s2Var.I, s2Var.J, new s1(s2Var, 15));
                break;
            case 15:
                s2Var.o(false);
                break;
            default:
                s2Var.o(false);
                break;
        }
    }
}
