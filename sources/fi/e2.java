package fi;

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
import org.telegram.ui.Components.lb;
import org.telegram.ui.Components.yc;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.co;
import org.telegram.ui.e41;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes4.dex */
public final /* synthetic */ class e2 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ k3 b;

    public /* synthetic */ e2(k3 k3Var, int i10) {
        this.a = i10;
        this.b = k3Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.a;
        int i11 = 0;
        k3 k3Var = this.b;
        switch (i10) {
            case 0:
                k3.d(k3Var);
                break;
            case 1:
                if (!k3Var.c0 && k3Var.J != 0) {
                    TLRPC.TL_messages_prolongWebView tL_messages_prolongWebView = new TLRPC.TL_messages_prolongWebView();
                    tL_messages_prolongWebView.bot = MessagesController.getInstance(k3Var.G).getInputUser(k3Var.H);
                    tL_messages_prolongWebView.peer = MessagesController.getInstance(k3Var.G).getInputPeer(k3Var.I);
                    tL_messages_prolongWebView.query_id = k3Var.J;
                    tL_messages_prolongWebView.silent = false;
                    if (k3Var.K != 0) {
                        TLRPC.InputReplyTo createReplyInput = SendMessagesHelper.getInstance(k3Var.G).createReplyInput(k3Var.K);
                        tL_messages_prolongWebView.reply_to = createReplyInput;
                        if (k3Var.L != 0) {
                            createReplyInput.monoforum_peer_id = MessagesController.getInstance(k3Var.G).getInputPeer(k3Var.L);
                            tL_messages_prolongWebView.reply_to.flags |= 32;
                        }
                        tL_messages_prolongWebView.flags |= 1;
                    } else if (k3Var.L != 0) {
                        TLRPC.TL_inputReplyToMonoForum tL_inputReplyToMonoForum = new TLRPC.TL_inputReplyToMonoForum();
                        tL_messages_prolongWebView.reply_to = tL_inputReplyToMonoForum;
                        tL_inputReplyToMonoForum.monoforum_peer_id = MessagesController.getInstance(k3Var.G).getInputPeer(k3Var.L);
                        tL_messages_prolongWebView.flags |= 1;
                    }
                    ConnectionsManager.getInstance(k3Var.G).sendRequest(tL_messages_prolongWebView, new p2(k3Var, i11));
                    break;
                }
                break;
            case 2:
                k3Var.D();
                break;
            case 3:
                k3Var.v.requestLayout();
                break;
            case 4:
                if (!k3Var.x.D()) {
                    k3Var.q();
                    break;
                }
                break;
            case 5:
                k3Var.x0 = true;
                k3Var.k(true);
                break;
            case 6:
                k3Var.r();
                break;
            case 7:
                Paint paint = k3Var.O;
                a3 a3Var = k3Var.v;
                if (a3Var.getSwipeOffsetY() > 0.0f) {
                    paint.setAlpha((int) ((1.0f - w7.p.a(a3Var.getSwipeOffsetY() / a3Var.getHeight(), 0.0f, 1.0f)) * 64.0f));
                } else {
                    paint.setAlpha(64);
                }
                k3Var.e.invalidate();
                k3Var.x.o(false, false);
                if (k3Var.c != null) {
                    float f7 = (1.0f - (Math.min(a3Var.getTopActionBarOffsetY(), a3Var.getTranslationY() - a3Var.getTopActionBarOffsetY()) / a3Var.getTopActionBarOffsetY()) <= 0.5f ? 0 : 1) * 100.0f;
                    o1.k kVar = k3Var.c;
                    o1.l lVar = kVar.u;
                    if (((float) lVar.i) != f7) {
                        lVar.i = f7;
                        kVar.f();
                    }
                }
                if (k3Var.d0) {
                    int i12 = k3Var.h.bottom;
                } else {
                    Math.max(0.0f, a3Var.getSwipeOffsetY());
                }
                System.currentTimeMillis();
                break;
            case 8:
                k3Var.x.o(true, false);
                break;
            case 9:
                Activity activity = k3Var.k0;
                if (activity instanceof LaunchActivity) {
                    ((LaunchActivity) activity).p0(co.R9(k3Var.H));
                }
                k3Var.k(true);
                break;
            case 10:
                b3 b3Var = k3Var.x;
                b3Var.getClass();
                b3Var.P = System.currentTimeMillis();
                b3Var.z("settings_button_pressed", null);
                break;
            case 11:
                i3 i3Var = k3Var.y;
                b3 b3Var2 = k3Var.x;
                if (b3Var2.getWebView() != null) {
                    b3Var2.getWebView().animate().cancel();
                    b3Var2.getWebView().animate().alpha(0.0f).start();
                }
                i3Var.setLoadProgress(0.0f);
                i3Var.setAlpha(1.0f);
                i3Var.setVisibility(0);
                b3Var2.setBotUser(MessagesController.getInstance(k3Var.G).getUser(Long.valueOf(k3Var.H)));
                b3Var2.t(k3Var.G, k3Var.H);
                NotificationCenter.getInstance(b3Var2.M).doOnIdle(new org.telegram.ui.web.u(b3Var2, 2));
                break;
            case 12:
                MediaDataController.getInstance(k3Var.G).installShortcut(k3Var.H, MediaDataController.SHORTCUT_TYPE_ATTACHED_BOT);
                break;
            case 13:
                of.f.s(k3Var.getContext(), LocaleController.getString(R.string.BotWebViewToSLink));
                break;
            case 14:
                int i13 = k3Var.G;
                Context context = k3Var.getContext();
                yc ycVar = new yc(lb.a(k3Var.getContext()), k3Var.E);
                long j3 = k3Var.H;
                int i14 = e41.v;
                e41.K(i13, context, j3, false, false, new ArrayList(), ycVar, null, new byte[0], null, null);
                break;
            case 15:
                k3.j(k3Var.G, k3Var.H, new e2(k3Var, 16));
                break;
            case 16:
                k3Var.k(false);
                break;
            default:
                k3Var.k(false);
                break;
        }
    }
}
