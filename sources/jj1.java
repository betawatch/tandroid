// default package

import android.net.Uri;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.VelocityTracker;
import android.view.View;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_payments;
import org.telegram.ui.ActionBar.e;
import org.telegram.ui.Components.ChatActivityEnterView;
import org.telegram.ui.ProfileActivity;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final /* synthetic */ class jj1 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ jj1(Object obj, Object obj2, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        hnb hnbVar;
        TLRPC.Message message;
        TLRPC.MessageMedia messageMedia;
        TLRPC.WebPage webPage;
        TLRPC.Chat M0;
        rw1 rw1Var;
        byte b = this.a;
        r47 r47Var = null;
        char c = 1;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (b) {
            case 0:
                mj1 mj1Var = (mj1) obj2;
                lj1 lj1Var = (lj1) obj;
                wb2 wb2Var = mj1Var.a;
                lj1 lj1Var2 = mj1Var.E;
                if (lj1Var == lj1Var2) {
                    lj1Var2.n.c(false);
                    lj1 lj1Var3 = mj1Var.E;
                    if (!lj1Var3.g) {
                        TLObject tLObject = lj1Var3.o;
                        wb2 wb2Var2 = mj1Var.a;
                        if (wb2Var2.getDelegate() != null) {
                            wb2Var2.getDelegate().F1(wb2Var2, tLObject, true);
                        }
                    } else if (wb2Var.getDelegate() != null) {
                        wb2Var.getDelegate().k2();
                    }
                }
                mj1Var.E = null;
                mj1Var.F = null;
                mj1Var.A = false;
                mj1Var.z = false;
                mj1Var.x.c(false);
                VelocityTracker velocityTracker = mj1Var.C;
                if (velocityTracker != null) {
                    velocityTracker.recycle();
                    mj1Var.C = null;
                    break;
                }
                break;
            case 1:
                dl1 dl1Var = (dl1) obj2;
                dl1Var.g1.k(dl1Var, ((TLRPC.TL_messageActionGiftCode) obj).slug);
                break;
            case 2:
                dl1 dl1Var2 = (dl1) obj2;
                TL_payments.TL_resolveStarGiftOffer tL_resolveStarGiftOffer = new TL_payments.TL_resolveStarGiftOffer();
                tL_resolveStarGiftOffer.offer_msg_id = dl1Var2.getMessageObject().e1();
                tL_resolveStarGiftOffer.decline = true;
                ConnectionsManager.getInstance(dl1Var2.I).sendRequestTyped(tL_resolveStarGiftOffer, new qe2((Object) dl1Var2, obj, (byte) 4));
                break;
            case 3:
                d31.b0((e) obj2).g0((TLRPC.TL_error) obj, false);
                break;
            case 4:
                zu1 zu1Var = (zu1) obj2;
                hnb[] hnbVarArr = (hnb[]) obj;
                if (!zu1Var.Zb && (hnbVar = hnbVarArr[0]) != null) {
                    hnbVarArr[0] = null;
                    if (zu1Var.y0 == hnbVar) {
                        zu1Var.y0 = null;
                    }
                    hl.B2(hnbVar);
                    break;
                }
                break;
            case 5:
                zu1 zu1Var2 = (zu1) obj2;
                wb2 wb2Var3 = (wb2) obj;
                wb2Var3.getLocationInWindow(new int[2]);
                zu1Var2.O1.setTranslationY(wb2Var3.getTimeY() + ((r0[1] - r3.getTop()) - hl.L(120.0f)));
                zu1Var2.O1.o(0.0f, ((((-hl.L(16.0f)) + r0[0]) + wb2Var3.O9) + wb2Var3.M9) - (wb2Var3.P9 / 2.0f));
                zu1Var2.O1.v();
                break;
            case 6:
                zu1 zu1Var3 = (zu1) obj2;
                zu1Var3.getClass();
                zu1Var3.presentFragment(ProfileActivity.Q2(((TLRPC.User[]) obj)[0].id));
                break;
            case 7:
                ((zu1) obj2).r9((TLRPC.TL_inlineBotWebView) obj);
                break;
            case 8:
                ((hu0) obj2).a((TLRPC.User) obj);
                break;
            case 9:
                zu1 zu1Var4 = (zu1) obj2;
                m01.r(zu1Var4.getParentActivity(), Uri.parse(((TLRPC.TL_bankCardOpenUrl) obj).url), zu1Var4.x8 == 0, false);
                break;
            case 10:
                ((zu1) obj2).Ea((fu5) obj);
                break;
            case 11:
                ((zu1) obj2).w9((TLRPC.TL_messages_sendScheduledMessages) obj);
                break;
            case 12:
                zu1 zu1Var5 = (zu1) obj2;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj;
                zu1Var5.getClass();
                if (tL_error.text.startsWith("SLOWMODE_WAIT_")) {
                    jj.t0(ob6.M0(2131745030, null), zu1Var5);
                    break;
                } else if (tL_error.text.equals("CHAT_SEND_MEDIA_FORBIDDEN")) {
                    jj.t0(ob6.M0(2131753948, null), zu1Var5);
                    break;
                } else {
                    jj.t0(tL_error.text, zu1Var5);
                    break;
                }
            case 13:
                ((zu1) obj2).z6((io1) obj);
                break;
            case 14:
                zu1 zu1Var6 = (zu1) obj2;
                int[] iArr = (int[]) obj;
                if (iArr[0] != 0) {
                    zu1Var6.getConnectionsManager().cancelRequest(iArr[0], true);
                    iArr[0] = 0;
                    break;
                }
                break;
            case 15:
                ((zu1) obj2).Ba((TLRPC.Chat) obj);
                break;
            case 16:
                zh6 zh6Var = (zh6) obj2;
                p pVar = (p) obj;
                if (zh6Var.m() == 1 && zh6Var.n(0) != null && ((ArrayList) zh6Var.n(0)).size() == 1) {
                    r47Var = (r47) ((ArrayList) zh6Var.n(0)).get(0);
                }
                if (r47Var != null && (message = r47Var.k) != null && (messageMedia = message.media) != null && (webPage = messageMedia.webpage) != null && webPage.attributes != null) {
                    for (int i = 0; i < r47Var.k.media.webpage.attributes.size(); i++) {
                        TLRPC.WebPageAttribute webPageAttribute = r47Var.k.media.webpage.attributes.get(i);
                        if ((webPageAttribute instanceof TLRPC.TL_webPageAttributeStory) && ((TLRPC.TL_webPageAttributeStory) webPageAttribute).storyItem != null) {
                            hl.c3(new jj1(pVar, r47Var.k.media.webpage, (byte) 17));
                            break;
                        }
                    }
                }
                hl.c3(new go1(pVar, c == true ? 1 : 0));
                break;
            case 17:
                ((p) obj2).a(Boolean.TRUE, (TLRPC.WebPage) obj);
                break;
            case 18:
                zu1 zu1Var7 = (zu1) obj2;
                View view = (View) obj;
                if (zu1Var7.getParentActivity() != null) {
                    zu1Var7.Z0.setPadding(hl.L(7.33f), 0, hl.L(7.33f), 0);
                    zu1Var7.Z0.k(zu1Var7.L);
                    zu1Var7.Z0.q(16.0f);
                    zu1Var7.Z0.p(true);
                    zu1Var7.Z0.t(ob6.M0(2131753095, null));
                    zu1Var7.Z0.n(0.0f, 96.0f);
                    zu1Var7.Z0.setTranslationY(hl.L(10.0f) + ((view.getTop() - zu1Var7.Xa) - zu1Var7.m1.getHeight()));
                    zu1Var7.m1.addView(zu1Var7.Z0, tre.e(-1, 100, 87));
                    kg5 kg5Var = zu1Var7.Z0;
                    kg5Var.r0 = new ny(zu1Var7, (byte) 28);
                    kg5Var.v();
                    mg5.x.b();
                    break;
                }
                break;
            case 19:
                ((zu1) obj2).m1.removeView((gs1) obj);
                break;
            case 20:
                r47 r47Var2 = (r47) obj;
                zu1 zu1Var8 = ((yp1) obj2).s;
                SparseArray[] sparseArrayArr = zu1Var8.G6;
                r47 r47Var3 = (r47) sparseArrayArr[0].get(r47Var2.e1());
                if (r47Var3 != null && r47Var3 != r47Var2) {
                    r47 r47Var4 = (r47) sparseArrayArr[0].get(r47Var2.e1());
                    r47Var4.k.reactions = r47Var2.k.reactions;
                    r47Var2 = r47Var4;
                }
                zu1Var8.Yc(r47Var2, true);
                s49.f();
                break;
            case 21:
                dl1 dl1Var3 = (dl1) obj;
                zu1 zu1Var9 = ((dt1) ((cu1) obj2).f).a.R;
                int i2 = zu1.Ad;
                zu1Var9.hb();
                dl1Var3.getMessageObject().r = false;
                dl1Var3.invalidate();
                break;
            case 22:
                kg5 kg5Var2 = (kg5) obj;
                zu1 zu1Var10 = ((ju1) obj2).a;
                zu1Var10.m1.removeView(kg5Var2);
                if (kg5Var2 == zu1Var10.P1) {
                    zu1Var10.P1 = null;
                    break;
                }
                break;
            case 23:
                Long l = (Long) obj;
                zu1 zu1Var11 = ((du1) obj2).V2.a;
                String str = (l.longValue() >= 0 || (M0 = zu1Var11.getMessagesController().M0(Long.valueOf(-l.longValue()))) == null) ? "" : M0.title;
                c00.v(TextUtils.isEmpty(str) ? ob6.M0(2131745909, null) : ob6.a0(null, null, 2131745910, str), d31.b0(zu1Var11), R.raw.contact_check, 36);
                break;
            case 24:
                ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) obj2;
                int i3 = ChatActivityEnterView.X7;
                ((mv1) obj).run();
                vye.c(chatActivityEnterView.R, chatActivityEnterView.F3);
                break;
            case 25:
                ChatActivityEnterView chatActivityEnterView2 = (ChatActivityEnterView) obj2;
                TLRPC.TL_document tL_document = (TLRPC.TL_document) obj;
                int i4 = ChatActivityEnterView.X7;
                if (chatActivityEnterView2.Q3 == tL_document && (rw1Var = chatActivityEnterView2.f1) != null && rw1Var.getVisibility() == 0) {
                    chatActivityEnterView2.z5 = true;
                    chatActivityEnterView2.B1();
                    chatActivityEnterView2.z5 = false;
                    break;
                }
                break;
            case 26:
                ChatActivityEnterView chatActivityEnterView3 = (ChatActivityEnterView) obj2;
                int i5 = ChatActivityEnterView.X7;
                jj.J(chatActivityEnterView3.D3, chatActivityEnterView3.E3.a(), new z8d(obj, (byte) 18), chatActivityEnterView3.K4);
                break;
            case 27:
                ChatActivityEnterView chatActivityEnterView4 = (ChatActivityEnterView) obj2;
                fu5 fu5Var = (fu5) obj;
                int i6 = ChatActivityEnterView.X7;
                if (chatActivityEnterView4.x7 == fu5Var) {
                    chatActivityEnterView4.x7 = null;
                    break;
                }
                break;
            case 28:
                ChatActivityEnterView chatActivityEnterView5 = (ChatActivityEnterView) obj2;
                int i7 = ChatActivityEnterView.X7;
                chatActivityEnterView5.setFieldText((CharSequence) obj);
                chatActivityEnterView5.a0 = null;
                break;
            default:
                ((knc) obj2).setPillAlpha(1.0f);
                hl.B2((FrameLayout) obj);
                break;
        }
    }
}
