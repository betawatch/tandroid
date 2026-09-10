package di;

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
import org.telegram.ui.Components.kb;
import org.telegram.ui.Components.wc;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.eo;
import org.telegram.ui.h41;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes4.dex */
public final /* synthetic */ class h2 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ n3 b;

    public /* synthetic */ h2(n3 n3Var, int i10) {
        this.a = i10;
        this.b = n3Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.a;
        int i11 = 0;
        n3 n3Var = this.b;
        switch (i10) {
            case 0:
                n3.d(n3Var);
                break;
            case 1:
                if (!n3Var.c0 && n3Var.J != 0) {
                    TLRPC.TL_messages_prolongWebView tL_messages_prolongWebView = new TLRPC.TL_messages_prolongWebView();
                    tL_messages_prolongWebView.bot = MessagesController.getInstance(n3Var.G).getInputUser(n3Var.H);
                    tL_messages_prolongWebView.peer = MessagesController.getInstance(n3Var.G).getInputPeer(n3Var.I);
                    tL_messages_prolongWebView.query_id = n3Var.J;
                    tL_messages_prolongWebView.silent = false;
                    if (n3Var.K != 0) {
                        TLRPC.InputReplyTo createReplyInput = SendMessagesHelper.getInstance(n3Var.G).createReplyInput(n3Var.K);
                        tL_messages_prolongWebView.reply_to = createReplyInput;
                        if (n3Var.L != 0) {
                            createReplyInput.monoforum_peer_id = MessagesController.getInstance(n3Var.G).getInputPeer(n3Var.L);
                            tL_messages_prolongWebView.reply_to.flags |= 32;
                        }
                        tL_messages_prolongWebView.flags |= 1;
                    } else if (n3Var.L != 0) {
                        TLRPC.TL_inputReplyToMonoForum tL_inputReplyToMonoForum = new TLRPC.TL_inputReplyToMonoForum();
                        tL_messages_prolongWebView.reply_to = tL_inputReplyToMonoForum;
                        tL_inputReplyToMonoForum.monoforum_peer_id = MessagesController.getInstance(n3Var.G).getInputPeer(n3Var.L);
                        tL_messages_prolongWebView.flags |= 1;
                    }
                    ConnectionsManager.getInstance(n3Var.G).sendRequest(tL_messages_prolongWebView, new s2(n3Var, i11));
                    break;
                }
                break;
            case 2:
                n3Var.D();
                break;
            case 3:
                n3Var.v.requestLayout();
                break;
            case 4:
                if (!n3Var.x.D()) {
                    n3Var.q();
                    break;
                }
                break;
            case 5:
                n3Var.x0 = true;
                n3Var.k(true);
                break;
            case 6:
                n3Var.r();
                break;
            case 7:
                Paint paint = n3Var.O;
                d3 d3Var = n3Var.v;
                if (d3Var.getSwipeOffsetY() > 0.0f) {
                    paint.setAlpha((int) ((1.0f - w7.q.a(d3Var.getSwipeOffsetY() / d3Var.getHeight(), 0.0f, 1.0f)) * 64.0f));
                } else {
                    paint.setAlpha(64);
                }
                n3Var.e.invalidate();
                n3Var.x.o(false, false);
                if (n3Var.c != null) {
                    float f7 = (1.0f - (Math.min(d3Var.getTopActionBarOffsetY(), d3Var.getTranslationY() - d3Var.getTopActionBarOffsetY()) / d3Var.getTopActionBarOffsetY()) <= 0.5f ? 0 : 1) * 100.0f;
                    o1.k kVar = n3Var.c;
                    o1.l lVar = kVar.u;
                    if (((float) lVar.i) != f7) {
                        lVar.i = f7;
                        kVar.f();
                    }
                }
                if (n3Var.d0) {
                    int i12 = n3Var.h.bottom;
                } else {
                    Math.max(0.0f, d3Var.getSwipeOffsetY());
                }
                System.currentTimeMillis();
                break;
            case 8:
                n3Var.x.o(true, false);
                break;
            case 9:
                Activity activity = n3Var.k0;
                if (activity instanceof LaunchActivity) {
                    ((LaunchActivity) activity).p0(eo.R9(n3Var.H));
                }
                n3Var.k(true);
                break;
            case 10:
                e3 e3Var = n3Var.x;
                e3Var.getClass();
                e3Var.P = System.currentTimeMillis();
                e3Var.y("settings_button_pressed", null);
                break;
            case 11:
                l3 l3Var = n3Var.y;
                e3 e3Var2 = n3Var.x;
                if (e3Var2.getWebView() != null) {
                    e3Var2.getWebView().animate().cancel();
                    e3Var2.getWebView().animate().alpha(0.0f).start();
                }
                l3Var.setLoadProgress(0.0f);
                l3Var.setAlpha(1.0f);
                l3Var.setVisibility(0);
                e3Var2.setBotUser(MessagesController.getInstance(n3Var.G).getUser(Long.valueOf(n3Var.H)));
                e3Var2.t(n3Var.G, n3Var.H);
                NotificationCenter.getInstance(e3Var2.M).doOnIdle(new org.telegram.ui.web.t(e3Var2, 2));
                break;
            case 12:
                MediaDataController.getInstance(n3Var.G).installShortcut(n3Var.H, MediaDataController.SHORTCUT_TYPE_ATTACHED_BOT);
                break;
            case 13:
                nf.f.s(n3Var.getContext(), LocaleController.getString(R.string.BotWebViewToSLink));
                break;
            case 14:
                int i13 = n3Var.G;
                Context context = n3Var.getContext();
                wc wcVar = new wc(kb.a(n3Var.getContext()), n3Var.E);
                long j3 = n3Var.H;
                int i14 = h41.v;
                h41.K(i13, context, j3, false, false, new ArrayList(), wcVar, null, new byte[0], null, null);
                break;
            case 15:
                n3.j(n3Var.G, n3Var.H, new h2(n3Var, 16));
                break;
            case 16:
                n3Var.k(false);
                break;
            default:
                n3Var.k(false);
                break;
        }
    }
}
