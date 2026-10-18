package gi;

import android.app.Activity;
import android.content.Context;
import android.graphics.Paint;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.lb;
import org.telegram.ui.Components.xc;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.q21;
import org.telegram.ui.sn;

/* compiled from: r8-map-id-bcc7d273da888d5c27994201329e5b838e55754b73312241608ee42846efd426 */
/* loaded from: classes4.dex */
public final /* synthetic */ class y1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ d3 b;

    public /* synthetic */ y1(d3 d3Var, int i10) {
        this.a = i10;
        this.b = d3Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.a;
        int i11 = 0;
        d3 d3Var = this.b;
        switch (i10) {
            case 0:
                d3.d(d3Var);
                break;
            case 1:
                if (!d3Var.c0 && d3Var.J != 0) {
                    TLRPC.TL_messages_prolongWebView tL_messages_prolongWebView = new TLRPC.TL_messages_prolongWebView();
                    tL_messages_prolongWebView.bot = MessagesController.getInstance(d3Var.G).getInputUser(d3Var.H);
                    tL_messages_prolongWebView.peer = MessagesController.getInstance(d3Var.G).getInputPeer(d3Var.I);
                    tL_messages_prolongWebView.query_id = d3Var.J;
                    tL_messages_prolongWebView.silent = false;
                    if (d3Var.K != 0) {
                        TLRPC.InputReplyTo createReplyInput = SendMessagesHelper.getInstance(d3Var.G).createReplyInput(d3Var.K);
                        tL_messages_prolongWebView.reply_to = createReplyInput;
                        if (d3Var.L != 0) {
                            createReplyInput.monoforum_peer_id = MessagesController.getInstance(d3Var.G).getInputPeer(d3Var.L);
                            tL_messages_prolongWebView.reply_to.flags |= 32;
                        }
                        tL_messages_prolongWebView.flags = 1 | tL_messages_prolongWebView.flags;
                    } else if (d3Var.L != 0) {
                        TLRPC.TL_inputReplyToMonoForum tL_inputReplyToMonoForum = new TLRPC.TL_inputReplyToMonoForum();
                        tL_messages_prolongWebView.reply_to = tL_inputReplyToMonoForum;
                        tL_inputReplyToMonoForum.monoforum_peer_id = MessagesController.getInstance(d3Var.G).getInputPeer(d3Var.L);
                        tL_messages_prolongWebView.flags = 1 | tL_messages_prolongWebView.flags;
                    }
                    ConnectionsManager.getInstance(d3Var.G).sendRequest(tL_messages_prolongWebView, new j2(d3Var, i11));
                    break;
                }
                break;
            case 2:
                d3Var.E();
                break;
            case 3:
                d3Var.v.requestLayout();
                break;
            case 4:
                if (!d3Var.x.C()) {
                    d3Var.r();
                    break;
                }
                break;
            case 5:
                d3Var.x0 = true;
                d3Var.k(true);
                break;
            case 6:
                d3Var.s();
                break;
            case 7:
                Paint paint = d3Var.O;
                u2 u2Var = d3Var.v;
                if (u2Var.getSwipeOffsetY() > 0.0f) {
                    paint.setAlpha((int) ((1.0f - w7.r.a(u2Var.getSwipeOffsetY() / u2Var.getHeight(), 0.0f, 1.0f)) * 64.0f));
                } else {
                    paint.setAlpha(64);
                }
                d3Var.e.invalidate();
                d3Var.x.n(false, false);
                if (d3Var.c != null) {
                    float f7 = (1.0f - (Math.min(u2Var.getTopActionBarOffsetY(), u2Var.getTranslationY() - u2Var.getTopActionBarOffsetY()) / u2Var.getTopActionBarOffsetY()) <= 0.5f ? 0 : 1) * 100.0f;
                    o1.k kVar = d3Var.c;
                    o1.l lVar = kVar.u;
                    if (((float) lVar.i) != f7) {
                        lVar.i = f7;
                        kVar.h();
                    }
                }
                if (d3Var.d0) {
                    int i12 = d3Var.h.bottom;
                } else {
                    Math.max(0.0f, u2Var.getSwipeOffsetY());
                }
                System.currentTimeMillis();
                break;
            case 8:
                d3Var.x.n(true, false);
                break;
            case 9:
                Activity activity = d3Var.k0;
                if (activity instanceof LaunchActivity) {
                    ((LaunchActivity) activity).t0(sn.W9(d3Var.H));
                }
                d3Var.k(true);
                break;
            case 10:
                v2 v2Var = d3Var.x;
                v2Var.getClass();
                v2Var.P = System.currentTimeMillis();
                v2Var.y("settings_button_pressed", null);
                break;
            case 11:
                MediaDataController.getInstance(d3Var.G).installShortcut(d3Var.H, MediaDataController.SHORTCUT_TYPE_ATTACHED_BOT);
                break;
            case 12:
                pf.d.r(d3Var.getContext(), LocaleController.getString(R.string.BotWebViewToSLink));
                break;
            case 13:
                int i13 = d3Var.G;
                Context context = d3Var.getContext();
                xc xcVar = new xc(lb.a(d3Var.getContext()), d3Var.E);
                long j10 = d3Var.H;
                int i14 = q21.v;
                q21.L(i13, context, j10, false, false, new ArrayList(), xcVar, null, new byte[0], null, null);
                break;
            case 14:
                d3.j(d3Var.G, d3Var.H, new y1(d3Var, 15));
                break;
            case 15:
                d3Var.k(false);
                break;
            default:
                d3Var.k(false);
                break;
        }
    }
}
