package hi;

import android.app.Activity;
import android.content.Context;
import android.graphics.Paint;
import c8.j9;
import java.util.ArrayList;
import org.telegram.messenger.gz;
import org.telegram.messenger.id;
import org.telegram.messenger.qp;
import org.telegram.messenger.ui;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.hc;
import org.telegram.ui.Components.xa;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.cn;
import org.telegram.ui.ry0;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes4.dex */
public final /* synthetic */ class x1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ a3 b;

    public /* synthetic */ x1(a3 a3Var, int i7) {
        this.a = i7;
        this.b = a3Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i7 = this.a;
        int i10 = 0;
        a3 a3Var = this.b;
        switch (i7) {
            case 0:
                a3.f(a3Var);
                break;
            case 1:
                if (!a3Var.d0 && a3Var.K != 0) {
                    TLRPC.TL_messages_prolongWebView tL_messages_prolongWebView = new TLRPC.TL_messages_prolongWebView();
                    tL_messages_prolongWebView.bot = qp.s1(a3Var.H).o1(a3Var.I);
                    tL_messages_prolongWebView.peer = qp.s1(a3Var.H).j1(a3Var.J);
                    tL_messages_prolongWebView.query_id = a3Var.K;
                    tL_messages_prolongWebView.silent = false;
                    if (a3Var.L != 0) {
                        gz.C(a3Var.H);
                        int i11 = a3Var.L;
                        TLRPC.TL_inputReplyToMessage tL_inputReplyToMessage = new TLRPC.TL_inputReplyToMessage();
                        tL_inputReplyToMessage.reply_to_msg_id = i11;
                        tL_messages_prolongWebView.reply_to = tL_inputReplyToMessage;
                        if (a3Var.M != 0) {
                            tL_inputReplyToMessage.monoforum_peer_id = qp.s1(a3Var.H).j1(a3Var.M);
                            tL_messages_prolongWebView.reply_to.flags |= 32;
                        }
                        tL_messages_prolongWebView.flags |= 1;
                    } else if (a3Var.M != 0) {
                        TLRPC.TL_inputReplyToMonoForum tL_inputReplyToMonoForum = new TLRPC.TL_inputReplyToMonoForum();
                        tL_messages_prolongWebView.reply_to = tL_inputReplyToMonoForum;
                        tL_inputReplyToMonoForum.monoforum_peer_id = qp.s1(a3Var.H).j1(a3Var.M);
                        tL_messages_prolongWebView.flags |= 1;
                    }
                    ConnectionsManager.getInstance(a3Var.H).sendRequest(tL_messages_prolongWebView, new i2(a3Var, i10));
                    break;
                }
                break;
            case 2:
                a3Var.I();
                break;
            case 3:
                a3Var.x.requestLayout();
                break;
            case 4:
                if (!a3Var.D.D()) {
                    a3Var.v();
                    break;
                }
                break;
            case 5:
                a3Var.y0 = true;
                a3Var.o(true);
                break;
            case 6:
                a3Var.w();
                break;
            case 7:
                Paint paint = a3Var.P;
                r2 r2Var = a3Var.x;
                if (r2Var.getSwipeOffsetY() > 0.0f) {
                    paint.setAlpha((int) ((1.0f - j9.a(r2Var.getSwipeOffsetY() / r2Var.getHeight(), 0.0f, 1.0f)) * 64.0f));
                } else {
                    paint.setAlpha(64);
                }
                a3Var.f.invalidate();
                a3Var.D.n(false, false);
                if (a3Var.d != null) {
                    float f10 = (1.0f - (Math.min(r2Var.getTopActionBarOffsetY(), r2Var.getTranslationY() - r2Var.getTopActionBarOffsetY()) / r2Var.getTopActionBarOffsetY()) <= 0.5f ? 0 : 1) * 100.0f;
                    r1.g gVar = a3Var.d;
                    r1.h hVar = gVar.m;
                    if (((float) hVar.i) != f10) {
                        hVar.i = f10;
                        gVar.h();
                    }
                }
                if (a3Var.e0) {
                    int i12 = a3Var.n.bottom;
                } else {
                    Math.max(0.0f, r2Var.getSwipeOffsetY());
                }
                System.currentTimeMillis();
                break;
            case 8:
                a3Var.D.n(true, false);
                break;
            case 9:
                Activity activity = a3Var.l0;
                if (activity instanceof LaunchActivity) {
                    ((LaunchActivity) activity).t0(cn.ta(a3Var.I));
                }
                a3Var.o(true);
                break;
            case 10:
                s2 s2Var = a3Var.D;
                s2Var.getClass();
                s2Var.P = System.currentTimeMillis();
                s2Var.y("settings_button_pressed", null);
                break;
            case 11:
                ui.b0(a3Var.H).y0(a3Var.I, ui.c2, null);
                break;
            case 12:
                vf.c.t(a3Var.getContext(), id.M0(2131752893, null));
                break;
            case 13:
                int i13 = a3Var.H;
                Context context = a3Var.getContext();
                hc hcVar = new hc(xa.a(a3Var.getContext()), a3Var.F);
                long j3 = a3Var.I;
                int i14 = ry0.s1;
                ry0.J0(i13, context, j3, false, false, new ArrayList(), hcVar, null, new byte[0], null, null);
                break;
            case 14:
                a3.n(a3Var.H, a3Var.I, new x1(a3Var, 15));
                break;
            case 15:
                a3Var.o(false);
                break;
            default:
                a3Var.o(false);
                break;
        }
    }
}
