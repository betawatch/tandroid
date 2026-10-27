package hi;

import a8.ee;
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
import org.telegram.ui.Components.wc;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.wn;
import org.telegram.ui.x21;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes4.dex */
public final /* synthetic */ class g2 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ m3 b;

    public /* synthetic */ g2(m3 m3Var, int i10) {
        this.a = i10;
        this.b = m3Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.a;
        int i11 = 0;
        m3 m3Var = this.b;
        switch (i10) {
            case 0:
                m3.d(m3Var);
                break;
            case 1:
                if (!m3Var.d0 && m3Var.K != 0) {
                    TLRPC.TL_messages_prolongWebView tL_messages_prolongWebView = new TLRPC.TL_messages_prolongWebView();
                    tL_messages_prolongWebView.bot = MessagesController.getInstance(m3Var.H).getInputUser(m3Var.I);
                    tL_messages_prolongWebView.peer = MessagesController.getInstance(m3Var.H).getInputPeer(m3Var.J);
                    tL_messages_prolongWebView.query_id = m3Var.K;
                    tL_messages_prolongWebView.silent = false;
                    if (m3Var.L != 0) {
                        TLRPC.InputReplyTo createReplyInput = SendMessagesHelper.getInstance(m3Var.H).createReplyInput(m3Var.L);
                        tL_messages_prolongWebView.reply_to = createReplyInput;
                        if (m3Var.M != 0) {
                            createReplyInput.monoforum_peer_id = MessagesController.getInstance(m3Var.H).getInputPeer(m3Var.M);
                            tL_messages_prolongWebView.reply_to.flags |= 32;
                        }
                        tL_messages_prolongWebView.flags = 1 | tL_messages_prolongWebView.flags;
                    } else if (m3Var.M != 0) {
                        TLRPC.TL_inputReplyToMonoForum tL_inputReplyToMonoForum = new TLRPC.TL_inputReplyToMonoForum();
                        tL_messages_prolongWebView.reply_to = tL_inputReplyToMonoForum;
                        tL_inputReplyToMonoForum.monoforum_peer_id = MessagesController.getInstance(m3Var.H).getInputPeer(m3Var.M);
                        tL_messages_prolongWebView.flags = 1 | tL_messages_prolongWebView.flags;
                    }
                    ConnectionsManager.getInstance(m3Var.H).sendRequest(tL_messages_prolongWebView, new r2(m3Var, i11));
                    break;
                }
                break;
            case 2:
                m3Var.E();
                break;
            case 3:
                m3Var.w.requestLayout();
                break;
            case 4:
                if (!m3Var.y.C()) {
                    m3Var.r();
                    break;
                }
                break;
            case 5:
                m3Var.y0 = true;
                m3Var.k(true);
                break;
            case 6:
                m3Var.s();
                break;
            case 7:
                Paint paint = m3Var.P;
                d3 d3Var = m3Var.w;
                if (d3Var.getSwipeOffsetY() > 0.0f) {
                    paint.setAlpha((int) ((1.0f - ee.a(d3Var.getSwipeOffsetY() / d3Var.getHeight(), 0.0f, 1.0f)) * 64.0f));
                } else {
                    paint.setAlpha(64);
                }
                m3Var.f.invalidate();
                m3Var.y.n(false, false);
                if (m3Var.d != null) {
                    float f7 = (1.0f - (Math.min(d3Var.getTopActionBarOffsetY(), d3Var.getTranslationY() - d3Var.getTopActionBarOffsetY()) / d3Var.getTopActionBarOffsetY()) <= 0.5f ? 0 : 1) * 100.0f;
                    o1.j jVar = m3Var.d;
                    o1.k kVar = jVar.u;
                    if (((float) kVar.i) != f7) {
                        kVar.i = f7;
                        jVar.h();
                    }
                }
                if (m3Var.e0) {
                    int i12 = m3Var.n.bottom;
                } else {
                    Math.max(0.0f, d3Var.getSwipeOffsetY());
                }
                System.currentTimeMillis();
                break;
            case 8:
                m3Var.y.n(true, false);
                break;
            case 9:
                Activity activity = m3Var.l0;
                if (activity instanceof LaunchActivity) {
                    ((LaunchActivity) activity).u0(wn.ea(m3Var.I));
                }
                m3Var.k(true);
                break;
            case 10:
                e3 e3Var = m3Var.y;
                e3Var.getClass();
                e3Var.P = System.currentTimeMillis();
                e3Var.y("settings_button_pressed", null);
                break;
            case 11:
                MediaDataController.getInstance(m3Var.H).installShortcut(m3Var.I, MediaDataController.SHORTCUT_TYPE_ATTACHED_BOT);
                break;
            case 12:
                qf.d.r(m3Var.getContext(), LocaleController.getString(R.string.BotWebViewToSLink));
                break;
            case 13:
                int i13 = m3Var.H;
                Context context = m3Var.getContext();
                wc wcVar = new wc(lb.a(m3Var.getContext()), m3Var.F);
                long j10 = m3Var.I;
                int i14 = x21.w;
                x21.N(i13, context, j10, false, false, new ArrayList(), wcVar, null, new byte[0], null, null);
                break;
            case 14:
                m3.j(m3Var.H, m3Var.I, new g2(m3Var, 15));
                break;
            case 15:
                m3Var.k(false);
                break;
            default:
                m3Var.k(false);
                break;
        }
    }
}
