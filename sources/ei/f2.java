package ei;

import android.app.Activity;
import android.content.Context;
import android.graphics.Paint;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.mb;
import org.telegram.ui.Components.yc;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.t31;
import org.telegram.ui.yn;

/* compiled from: r8-map-id-995671d6bce0aaeb91824b65f2f1988c5410eae59f1d5d7c368a0027313cc0ad */
/* loaded from: classes4.dex */
public final /* synthetic */ class f2 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ l3 b;

    public /* synthetic */ f2(l3 l3Var, int i10) {
        this.a = i10;
        this.b = l3Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.a;
        int i11 = 0;
        l3 l3Var = this.b;
        switch (i10) {
            case 0:
                l3.d(l3Var);
                break;
            case 1:
                if (!l3Var.c0 && l3Var.J != 0) {
                    TLRPC.TL_messages_prolongWebView tL_messages_prolongWebView = new TLRPC.TL_messages_prolongWebView();
                    tL_messages_prolongWebView.bot = MessagesController.getInstance(l3Var.G).getInputUser(l3Var.H);
                    tL_messages_prolongWebView.peer = MessagesController.getInstance(l3Var.G).getInputPeer(l3Var.I);
                    tL_messages_prolongWebView.query_id = l3Var.J;
                    tL_messages_prolongWebView.silent = false;
                    if (l3Var.K != 0) {
                        TLRPC.InputReplyTo createReplyInput = SendMessagesHelper.getInstance(l3Var.G).createReplyInput(l3Var.K);
                        tL_messages_prolongWebView.reply_to = createReplyInput;
                        if (l3Var.L != 0) {
                            createReplyInput.monoforum_peer_id = MessagesController.getInstance(l3Var.G).getInputPeer(l3Var.L);
                            tL_messages_prolongWebView.reply_to.flags |= 32;
                        }
                        tL_messages_prolongWebView.flags |= 1;
                    } else if (l3Var.L != 0) {
                        TLRPC.TL_inputReplyToMonoForum tL_inputReplyToMonoForum = new TLRPC.TL_inputReplyToMonoForum();
                        tL_messages_prolongWebView.reply_to = tL_inputReplyToMonoForum;
                        tL_inputReplyToMonoForum.monoforum_peer_id = MessagesController.getInstance(l3Var.G).getInputPeer(l3Var.L);
                        tL_messages_prolongWebView.flags |= 1;
                    }
                    ConnectionsManager.getInstance(l3Var.G).sendRequest(tL_messages_prolongWebView, new q2(l3Var, i11));
                    break;
                }
                break;
            case 2:
                l3Var.D();
                break;
            case 3:
                l3Var.v.requestLayout();
                break;
            case 4:
                if (!l3Var.x.D()) {
                    l3Var.q();
                    break;
                }
                break;
            case 5:
                l3Var.x0 = true;
                l3Var.k(true);
                break;
            case 6:
                l3Var.r();
                break;
            case 7:
                Paint paint = l3Var.O;
                b3 b3Var = l3Var.v;
                if (b3Var.getSwipeOffsetY() > 0.0f) {
                    paint.setAlpha((int) ((1.0f - w7.q.a(b3Var.getSwipeOffsetY() / b3Var.getHeight(), 0.0f, 1.0f)) * 64.0f));
                } else {
                    paint.setAlpha(64);
                }
                l3Var.e.invalidate();
                l3Var.x.o(false, false);
                if (l3Var.c != null) {
                    float f7 = (1.0f - (Math.min(b3Var.getTopActionBarOffsetY(), b3Var.getTranslationY() - b3Var.getTopActionBarOffsetY()) / b3Var.getTopActionBarOffsetY()) <= 0.5f ? 0 : 1) * 100.0f;
                    o1.k kVar = l3Var.c;
                    o1.l lVar = kVar.u;
                    if (((float) lVar.i) != f7) {
                        lVar.i = f7;
                        kVar.f();
                    }
                }
                if (l3Var.d0) {
                    int i12 = l3Var.h.bottom;
                } else {
                    Math.max(0.0f, b3Var.getSwipeOffsetY());
                }
                System.currentTimeMillis();
                break;
            case 8:
                l3Var.x.o(true, false);
                break;
            case 9:
                Activity activity = l3Var.k0;
                if (activity instanceof LaunchActivity) {
                    ((LaunchActivity) activity).p0(yn.Q9(l3Var.H));
                }
                l3Var.k(true);
                break;
            case 10:
                c3 c3Var = l3Var.x;
                c3Var.getClass();
                c3Var.P = System.currentTimeMillis();
                c3Var.z("settings_button_pressed", null);
                break;
            case 11:
                j3 j3Var = l3Var.y;
                c3 c3Var2 = l3Var.x;
                if (c3Var2.getWebView() != null) {
                    c3Var2.getWebView().animate().cancel();
                    c3Var2.getWebView().animate().alpha(0.0f).start();
                }
                j3Var.setLoadProgress(0.0f);
                j3Var.setAlpha(1.0f);
                j3Var.setVisibility(0);
                c3Var2.setBotUser(MessagesController.getInstance(l3Var.G).getUser(Long.valueOf(l3Var.H)));
                c3Var2.t(l3Var.G, l3Var.H);
                NotificationCenter.getInstance(c3Var2.M).doOnIdle(new org.telegram.ui.web.s(c3Var2, 2));
                break;
            case 12:
                MediaDataController.getInstance(l3Var.G).installShortcut(l3Var.H, MediaDataController.SHORTCUT_TYPE_ATTACHED_BOT);
                break;
            case 13:
                nf.f.s(l3Var.getContext(), LocaleController.getString(R.string.BotWebViewToSLink));
                break;
            case 14:
                int i13 = l3Var.G;
                Context context = l3Var.getContext();
                yc ycVar = new yc(mb.a(l3Var.getContext()), l3Var.E);
                long j3 = l3Var.H;
                int i14 = t31.v;
                t31.I(i13, context, j3, false, false, new ArrayList(), ycVar, null, new byte[0], null, null);
                break;
            case 15:
                l3.j(l3Var.G, l3Var.H, new f2(l3Var, 16));
                break;
            case 16:
                l3Var.k(false);
                break;
            default:
                l3Var.k(false);
                break;
        }
    }
}
