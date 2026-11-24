// default package

import android.net.Uri;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.VelocityTracker;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_payments;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.Components.ChatActivityEnterView;
import org.telegram.ui.ProfileActivity;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final /* synthetic */ class aj1 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ aj1(Object obj, Object obj2, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ijb ijbVar;
        TLRPC.Message message;
        TLRPC.MessageMedia messageMedia;
        TLRPC.WebPage webPage;
        TLRPC.Chat K0;
        cw1 cw1Var;
        byte b = this.a;
        k27 k27Var = null;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (b) {
            case 0:
                dj1 dj1Var = (dj1) obj2;
                cj1 cj1Var = (cj1) obj;
                gb2 gb2Var = dj1Var.a;
                cj1 cj1Var2 = dj1Var.E;
                if (cj1Var == cj1Var2) {
                    cj1Var2.n.c(false);
                    cj1 cj1Var3 = dj1Var.E;
                    if (!cj1Var3.g) {
                        TLObject tLObject = cj1Var3.o;
                        gb2 gb2Var2 = dj1Var.a;
                        if (gb2Var2.getDelegate() != null) {
                            gb2Var2.getDelegate().W1(gb2Var2, tLObject, true);
                        }
                    } else if (gb2Var.getDelegate() != null) {
                        gb2Var.getDelegate().C2();
                    }
                }
                dj1Var.E = null;
                dj1Var.F = null;
                dj1Var.A = false;
                dj1Var.z = false;
                dj1Var.x.c(false);
                VelocityTracker velocityTracker = dj1Var.C;
                if (velocityTracker != null) {
                    velocityTracker.recycle();
                    dj1Var.C = null;
                    break;
                }
                break;
            case 1:
                uk1 uk1Var = (uk1) obj2;
                uk1Var.g1.n(uk1Var, ((TLRPC.TL_messageActionGiftCode) obj).slug);
                break;
            case 2:
                uk1 uk1Var2 = (uk1) obj2;
                TL_payments.TL_resolveStarGiftOffer tL_resolveStarGiftOffer = new TL_payments.TL_resolveStarGiftOffer();
                tL_resolveStarGiftOffer.offer_msg_id = uk1Var2.getMessageObject().e1();
                tL_resolveStarGiftOffer.decline = true;
                ConnectionsManager.getInstance(uk1Var2.I).sendRequestTyped(tL_resolveStarGiftOffer, new ae2((Object) uk1Var2, obj, (byte) 4));
                break;
            case 3:
                u21.b0((d) obj2).g0((TLRPC.TL_error) obj, false);
                break;
            case 4:
                mu1 mu1Var = (mu1) obj2;
                ijb[] ijbVarArr = (ijb[]) obj;
                if (!mu1Var.Ob && (ijbVar = ijbVarArr[0]) != null) {
                    ijbVarArr[0] = null;
                    if (mu1Var.y0 == ijbVar) {
                        mu1Var.y0 = null;
                    }
                    gl.B2(ijbVar);
                    break;
                }
                break;
            case 5:
                ((mu1) obj2).ta((cs5) obj);
                break;
            case 6:
                mu1 mu1Var2 = (mu1) obj2;
                mu1Var2.getClass();
                mu1Var2.presentFragment(ProfileActivity.P2(((TLRPC.User[]) obj)[0].id));
                break;
            case 7:
                ((yt0) obj2).a((TLRPC.User) obj);
                break;
            case 8:
                mu1 mu1Var3 = (mu1) obj2;
                gb2 gb2Var3 = (gb2) obj;
                gb2Var3.getLocationInWindow(new int[2]);
                mu1Var3.O1.setTranslationY(gb2Var3.getTimeY() + ((r0[1] - r3.getTop()) - gl.L(120.0f)));
                mu1Var3.O1.o(0.0f, ((((-gl.L(16.0f)) + r0[0]) + gb2Var3.O9) + gb2Var3.M9) - (gb2Var3.P9 / 2.0f));
                mu1Var3.O1.v();
                break;
            case 9:
                ((mu1) obj2).g9((TLRPC.TL_inlineBotWebView) obj);
                break;
            case 10:
                mu1 mu1Var4 = (mu1) obj2;
                int[] iArr = (int[]) obj;
                if (iArr[0] != 0) {
                    mu1Var4.getConnectionsManager().cancelRequest(iArr[0], true);
                    iArr[0] = 0;
                    break;
                }
                break;
            case 11:
                ((mu1) obj2).s6((in1) obj);
                break;
            case 12:
                mu1 mu1Var5 = (mu1) obj2;
                d01.q(mu1Var5.getParentActivity(), Uri.parse(((TLRPC.TL_bankCardOpenUrl) obj).url), mu1Var5.x8 == 0, false);
                break;
            case 13:
                ((mu1) obj2).qa((TLRPC.Chat) obj);
                break;
            case 14:
                ((mu1) obj2).l9((TLRPC.TL_messages_sendScheduledMessages) obj);
                break;
            case 15:
                mu1 mu1Var6 = (mu1) obj2;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj;
                mu1Var6.getClass();
                if (tL_error.text.startsWith("SLOWMODE_WAIT_")) {
                    ij.t0(k96.M0(2131745110, null), mu1Var6);
                    break;
                } else if (tL_error.text.equals("CHAT_SEND_MEDIA_FORBIDDEN")) {
                    ij.t0(k96.M0(2131753952, null), mu1Var6);
                    break;
                } else {
                    ij.t0(tL_error.text, mu1Var6);
                    break;
                }
            case 16:
                vf6 vf6Var = (vf6) obj2;
                p pVar = (p) obj;
                if (vf6Var.m() == 1 && vf6Var.n(0) != null && ((ArrayList) vf6Var.n(0)).size() == 1) {
                    k27Var = (k27) ((ArrayList) vf6Var.n(0)).get(0);
                }
                if (k27Var != null && (message = k27Var.k) != null && (messageMedia = message.media) != null && (webPage = messageMedia.webpage) != null && webPage.attributes != null) {
                    for (int i = 0; i < k27Var.k.media.webpage.attributes.size(); i++) {
                        TLRPC.WebPageAttribute webPageAttribute = k27Var.k.media.webpage.attributes.get(i);
                        if ((webPageAttribute instanceof TLRPC.TL_webPageAttributeStory) && ((TLRPC.TL_webPageAttributeStory) webPageAttribute).storyItem != null) {
                            gl.c3(new aj1(pVar, k27Var.k.media.webpage, (byte) 17));
                            break;
                        }
                    }
                }
                gl.c3(new nv0(pVar, (byte) 27));
                break;
            case 17:
                ((p) obj2).a(Boolean.TRUE, (TLRPC.WebPage) obj);
                break;
            case 18:
                mu1 mu1Var7 = (mu1) obj2;
                View view = (View) obj;
                if (mu1Var7.getParentActivity() != null) {
                    mu1Var7.Z0.setPadding(gl.L(7.33f), 0, gl.L(7.33f), 0);
                    mu1Var7.Z0.k(mu1Var7.L);
                    mu1Var7.Z0.q(16.0f);
                    mu1Var7.Z0.p(true);
                    mu1Var7.Z0.t(k96.M0(2131753099, null));
                    mu1Var7.Z0.n(0.0f, 96.0f);
                    mu1Var7.Z0.setTranslationY(gl.L(10.0f) + ((view.getTop() - mu1Var7.Xa) - mu1Var7.m1.getHeight()));
                    mu1Var7.m1.addView(mu1Var7.Z0, nme.e(-1, 100, 87));
                    je5 je5Var = mu1Var7.Z0;
                    je5Var.r0 = new my(mu1Var7, (byte) 5);
                    je5Var.v();
                    le5.x.b();
                    break;
                }
                break;
            case 19:
                ((mu1) obj2).m1.removeView((sr1) obj);
                break;
            case 20:
                k27 k27Var2 = (k27) obj;
                mu1 mu1Var8 = ((kp1) obj2).s;
                SparseArray[] sparseArrayArr = mu1Var8.G6;
                k27 k27Var3 = (k27) sparseArrayArr[0].get(k27Var2.e1());
                if (k27Var3 != null && k27Var3 != k27Var2) {
                    k27 k27Var4 = (k27) sparseArrayArr[0].get(k27Var2.e1());
                    k27Var4.k.reactions = k27Var2.k.reactions;
                    k27Var2 = k27Var4;
                }
                mu1Var8.Mc(k27Var2, true);
                d19.f();
                break;
            case 21:
                uk1 uk1Var3 = (uk1) obj;
                mu1 mu1Var9 = ((qs1) ((pt1) obj2).f).a.R;
                int i2 = mu1.nd;
                mu1Var9.Wa();
                uk1Var3.getMessageObject().r = false;
                uk1Var3.invalidate();
                break;
            case 22:
                je5 je5Var2 = (je5) obj;
                mu1 mu1Var10 = ((wt1) obj2).a;
                mu1Var10.m1.removeView(je5Var2);
                if (je5Var2 == mu1Var10.P1) {
                    mu1Var10.P1 = null;
                    break;
                }
                break;
            case 23:
                Long l = (Long) obj;
                mu1 mu1Var11 = ((qt1) obj2).V2.a;
                String str = (l.longValue() >= 0 || (K0 = mu1Var11.getMessagesController().K0(Long.valueOf(-l.longValue()))) == null) ? "" : K0.title;
                b00.u(TextUtils.isEmpty(str) ? k96.M0(2131745989, null) : k96.a0(null, null, 2131745990, str), u21.b0(mu1Var11), R.raw.contact_check, 36);
                break;
            case 24:
                ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) obj2;
                int i3 = ChatActivityEnterView.r7;
                ((av1) obj).run();
                bue.c(chatActivityEnterView.R, chatActivityEnterView.G3);
                break;
            case 25:
                ChatActivityEnterView chatActivityEnterView2 = (ChatActivityEnterView) obj2;
                int i4 = ChatActivityEnterView.r7;
                ij.J(chatActivityEnterView2.E3, chatActivityEnterView2.F3.a(), new l69((ev1) obj, (byte) 19), chatActivityEnterView2.L4);
                break;
            case 26:
                int i5 = ChatActivityEnterView.r7;
                ((ChatActivityEnterView) obj2).removeView((je5) obj);
                break;
            case 27:
                ChatActivityEnterView chatActivityEnterView3 = (ChatActivityEnterView) obj2;
                TLRPC.TL_document tL_document = (TLRPC.TL_document) obj;
                int i6 = ChatActivityEnterView.r7;
                if (chatActivityEnterView3.R3 == tL_document && (cw1Var = chatActivityEnterView3.f1) != null && cw1Var.getVisibility() == 0) {
                    chatActivityEnterView3.x5 = true;
                    chatActivityEnterView3.r1();
                    chatActivityEnterView3.x5 = false;
                    break;
                }
                break;
            case 28:
                ChatActivityEnterView chatActivityEnterView4 = (ChatActivityEnterView) obj2;
                cs5 cs5Var = (cs5) obj;
                int i7 = ChatActivityEnterView.r7;
                if (chatActivityEnterView4.U6 == cs5Var) {
                    chatActivityEnterView4.U6 = null;
                    break;
                }
                break;
            default:
                ChatActivityEnterView chatActivityEnterView5 = (ChatActivityEnterView) obj2;
                int i8 = ChatActivityEnterView.r7;
                chatActivityEnterView5.setFieldText((CharSequence) obj);
                chatActivityEnterView5.a0 = null;
                break;
        }
    }
}
