package org.telegram.ui;

import android.text.TextUtils;
import android.view.View;
import java.util.ArrayList;
import java.util.Iterator;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_aicompose;
import org.telegram.ui.Components.ChatActivityEnterView;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final /* synthetic */ class ah implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ ah(int i7, Object obj, Object obj2) {
        this.a = i7;
        this.c = obj;
        this.b = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.Runnable
    public final void run() {
        TLRPC.Message message;
        TLRPC.MessageMedia messageMedia;
        TLRPC.WebPage webPage;
        TLRPC.Chat O0;
        org.telegram.ui.Components.ee eeVar;
        int i7 = this.a;
        org.telegram.messenger.fj fjVar = null;
        int i10 = 1;
        Object[] objArr = 0;
        Object obj = this.b;
        Object obj2 = this.c;
        switch (i7) {
            case 0:
                a0.h hVar = (a0.h) obj2;
                n6 n6Var = (n6) obj;
                if (hVar.m() == 1 && hVar.n(0) != null && ((ArrayList) hVar.n(0)).size() == 1) {
                    fjVar = (org.telegram.messenger.fj) ((ArrayList) hVar.n(0)).get(0);
                }
                if (fjVar != null && (message = fjVar.k) != null && (messageMedia = message.media) != null && (webPage = messageMedia.webpage) != null && webPage.attributes != null) {
                    for (int i11 = 0; i11 < fjVar.k.media.webpage.attributes.size(); i11++) {
                        TLRPC.WebPageAttribute webPageAttribute = fjVar.k.media.webpage.attributes.get(i11);
                        if ((webPageAttribute instanceof TLRPC.TL_webPageAttributeStory) && ((TLRPC.TL_webPageAttributeStory) webPageAttribute).storyItem != null) {
                            org.telegram.messenger.g0.g3(new ah(n6Var, fjVar.k.media.webpage));
                            break;
                        }
                    }
                }
                org.telegram.messenger.g0.g3(new ch(n6Var, objArr == true ? 1 : 0));
                break;
            case 1:
                ((n6) obj).a(Boolean.TRUE, (TLRPC.WebPage) obj2);
                break;
            case 2:
                bn bnVar = (bn) obj2;
                View view = (View) obj;
                if (bnVar.getParentActivity() != null) {
                    bnVar.Z0.setPadding(org.telegram.messenger.g0.L(7.33f), 0, org.telegram.messenger.g0.L(7.33f), 0);
                    bnVar.Z0.l(bnVar.L);
                    bnVar.Z0.s(16.0f);
                    bnVar.Z0.r(true);
                    bnVar.Z0.v(org.telegram.messenger.gd.N0(2131753099, null));
                    bnVar.Z0.o(0.0f, 96.0f);
                    bnVar.Z0.setTranslationY(org.telegram.messenger.g0.L(10.0f) + ((view.getTop() - bnVar.Xa) - bnVar.m1.getHeight()));
                    bnVar.m1.addView(bnVar.Z0, c8.na.e(-1, 100, 87));
                    hi.u3 u3Var = bnVar.Z0;
                    u3Var.r0 = new zd(bnVar, 3);
                    u3Var.x();
                    org.telegram.ui.Components.k30.x.b();
                    break;
                }
                break;
            case 3:
                ((bn) obj2).m1.removeView((org.telegram.ui.Components.xi0) obj);
                break;
            case 4:
                org.telegram.messenger.fj fjVar2 = (org.telegram.messenger.fj) obj;
                bn bnVar2 = ((di) obj2).s;
                org.telegram.messenger.fj fjVar3 = (org.telegram.messenger.fj) bnVar2.G6[0].get(fjVar2.e1());
                if (fjVar3 != null && fjVar3 != fjVar2) {
                    org.telegram.messenger.fj fjVar4 = (org.telegram.messenger.fj) bnVar2.G6[0].get(fjVar2.e1());
                    fjVar4.k.reactions = fjVar2.k.reactions;
                    fjVar2 = fjVar4;
                }
                bnVar2.Yc(fjVar2, true);
                ch.l0.f();
                break;
            case 5:
                org.telegram.ui.Cells.v0 v0Var = (org.telegram.ui.Cells.v0) obj;
                bn bnVar3 = ((fl) ((fm) obj2).f).a.R;
                int i12 = bn.md;
                bnVar3.pb();
                v0Var.getMessageObject().r = false;
                v0Var.invalidate();
                break;
            case 6:
                hi.u3 u3Var2 = (hi.u3) obj;
                bn bnVar4 = ((mm) obj2).a;
                bnVar4.m1.removeView(u3Var2);
                if (u3Var2 == bnVar4.P1) {
                    bnVar4.P1 = null;
                    break;
                }
                break;
            case 7:
                Long l10 = (Long) obj;
                bn bnVar5 = ((gm) obj2).W2.a;
                String str = (l10.longValue() >= 0 || (O0 = bnVar5.getMessagesController().O0(Long.valueOf(-l10.longValue()))) == null) ? "" : O0.title;
                org.telegram.messenger.m10.u(TextUtils.isEmpty(str) ? org.telegram.messenger.gd.N0(2131745986, null) : org.telegram.messenger.gd.a0(null, null, 2131745987, str), org.telegram.ui.Components.kc.b0(bnVar5), R.raw.contact_check, 36);
                break;
            case 8:
                rn rnVar = (rn) obj2;
                rnVar.getClass();
                rnVar.presentFragment(b51.g0((TLRPC.Chat) obj, true));
                break;
            case 9:
                io ioVar = (io) obj2;
                String str2 = (String) obj;
                TLRPC.TL_channels_checkUsername tL_channels_checkUsername = new TLRPC.TL_channels_checkUsername();
                tL_channels_checkUsername.username = str2;
                tL_channels_checkUsername.channel = ioVar.getMessagesController().j1(ioVar.a0);
                ioVar.i0 = ioVar.getConnectionsManager().sendRequest(tL_channels_checkUsername, new z9(ioVar, str2, tL_channels_checkUsername, 6), 2);
                break;
            case 10:
                io ioVar2 = (io) obj2;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj;
                boolean z10 = tL_error == null || !tL_error.text.equals("CHANNELS_ADMIN_PUBLIC_TOO_MUCH");
                ioVar2.d0 = z10;
                if (!z10 && ioVar2.getUserConfig().q() && !ioVar2.e0 && ioVar2.y != null) {
                    ioVar2.e0 = true;
                    ioVar2.h0();
                    ioVar2.getConnectionsManager().sendRequest(new TLRPC.TL_channels_getAdminedPublicChannels(), new sn(ioVar2, i10));
                    break;
                }
                break;
            case 11:
                uo.Z((uo) obj2, (org.telegram.ui.ActionBar.t1[]) obj);
                break;
            case 12:
                uo uoVar = (uo) obj2;
                TLObject tLObject = (TLObject) obj;
                if (tLObject instanceof TLRPC.messages_Chats) {
                    TLRPC.messages_Chats messages_chats = (TLRPC.messages_Chats) tLObject;
                    uoVar.getMessagesController().Z3(messages_chats.chats, false);
                    ArrayList<TLRPC.Chat> arrayList = messages_chats.chats;
                    uoVar.w = arrayList;
                    Iterator<TLRPC.Chat> it = arrayList.iterator();
                    while (it.hasNext()) {
                        TLRPC.Chat next = it.next();
                        if (org.telegram.messenger.v3.c0(next) || org.telegram.messenger.v3.p0(next)) {
                            it.remove();
                        }
                    }
                }
                uoVar.x = false;
                uoVar.y = true;
                uoVar.g0();
                break;
            case 13:
                ((qo) obj2).y.d.Q = false;
                ((org.telegram.ui.Components.q70) obj).run();
                break;
            case 14:
                ((qo) obj2).y.d.P = false;
                ((org.telegram.ui.Components.r70) obj).run();
                break;
            case 15:
                uo uoVar2 = ((qo) obj2).y.d;
                uoVar2.P = false;
                uoVar2.Q = false;
                ((Runnable) obj).run();
                break;
            case 16:
                qo qoVar = (qo) obj2;
                qoVar.getClass();
                ((TLRPC.Chat) obj).join_request = true;
                qoVar.h = true;
                qoVar.c.setChecked(true);
                break;
            case 17:
                rq rqVar = (rq) obj2;
                rqVar.getClass();
                rqVar.getMessagesController().b3(0, ((TLRPC.Updates) obj).chats.get(0).id, true);
                break;
            case 18:
                TLRPC.User user = (TLRPC.User) obj;
                rq rqVar2 = ((gq) obj2).a;
                if (org.telegram.ui.Components.kc.a(rqVar2)) {
                    org.telegram.ui.Components.kc.C(user.first_name, rqVar2).j();
                    break;
                }
                break;
            case 19:
                TL_aicompose.TL_aiComposeTone tL_aiComposeTone = (TL_aicompose.TL_aiComposeTone) obj;
                org.telegram.messenger.e eVar = ((org.telegram.ui.Components.m0) obj2).s2;
                eVar.b.remove(tL_aiComposeTone);
                eVar.d();
                eVar.c();
                TL_aicompose.saveTone savetone = new TL_aicompose.saveTone();
                savetone.tone = TL_aicompose.InputAiComposeTone.from(tL_aiComposeTone);
                savetone.unsave = true;
                ConnectionsManager.getInstance(eVar.a).sendRequest(savetone, null);
                break;
            case 20:
                org.telegram.ui.Components.v vVar = (org.telegram.ui.Components.v) obj2;
                TL_aicompose.TL_aiComposeTone tL_aiComposeTone2 = (TL_aicompose.TL_aiComposeTone) obj;
                vVar.getClass();
                org.telegram.ui.ActionBar.g2 T = LaunchActivity.T();
                if (T != null) {
                    T.presentFragment(ProfileActivity.D4(tL_aiComposeTone2.author_id));
                    vVar.dismiss();
                    break;
                }
                break;
            case 21:
                qu0 qu0Var = (qu0) obj;
                if (((boolean[]) obj2)[0]) {
                    qu0Var.run();
                    break;
                }
                break;
            case 22:
                org.telegram.ui.Components.fc fcVar = (org.telegram.ui.Components.fc) obj2;
                CharSequence charSequence = (CharSequence) obj;
                fcVar.n = true;
                org.telegram.ui.Components.kb kbVar = fcVar.e;
                if (kbVar instanceof org.telegram.ui.Components.lb) {
                    org.telegram.ui.Components.mb mbVar = (org.telegram.ui.Components.mb) ((org.telegram.ui.Components.lb) kbVar);
                    mbVar.b.setText(charSequence);
                    org.telegram.messenger.g0.T3(mbVar.d, false, false);
                    org.telegram.messenger.g0.T3(mbVar.b, true, false);
                }
                fcVar.i(true);
                break;
            case 23:
                boolean[] zArr = (boolean[]) obj2;
                Runnable runnable = (Runnable) obj;
                if (!zArr[0]) {
                    zArr[0] = true;
                    runnable.run();
                    break;
                }
                break;
            case 24:
                ((org.telegram.ui.Components.yc) obj2).removeView((hi.u3) obj);
                break;
            case 25:
                ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) obj2;
                int i13 = ChatActivityEnterView.s7;
                ((org.telegram.ui.Components.dd) obj).run();
                org.telegram.messenger.c6.p(chatActivityEnterView.R, chatActivityEnterView.G3);
                break;
            case 26:
                ChatActivityEnterView chatActivityEnterView2 = (ChatActivityEnterView) obj2;
                org.telegram.ui.Components.b5.J(chatActivityEnterView2.E3, chatActivityEnterView2.F3.a(), new j6.r((org.telegram.ui.Components.hd) obj, 26), chatActivityEnterView2.M4);
                break;
            case 27:
                int i14 = ChatActivityEnterView.s7;
                ((ChatActivityEnterView) obj2).removeView((hi.u3) obj);
                break;
            case 28:
                ChatActivityEnterView chatActivityEnterView3 = (ChatActivityEnterView) obj2;
                if (chatActivityEnterView3.R3 == ((TLRPC.TL_document) obj) && (eeVar = chatActivityEnterView3.f1) != null && eeVar.getVisibility() == 0) {
                    chatActivityEnterView3.y5 = true;
                    chatActivityEnterView3.t1();
                    chatActivityEnterView3.y5 = false;
                    break;
                }
                break;
            default:
                ChatActivityEnterView chatActivityEnterView4 = (ChatActivityEnterView) obj2;
                if (chatActivityEnterView4.V6 == ((org.telegram.ui.Components.x60) obj)) {
                    chatActivityEnterView4.V6 = null;
                    break;
                }
                break;
        }
    }

    public /* synthetic */ ah(n6 n6Var, TLRPC.WebPage webPage) {
        this.a = 1;
        this.b = n6Var;
        this.c = webPage;
    }
}
