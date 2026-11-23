package org.telegram.ui;

import android.text.TextUtils;
import android.view.View;
import android.view.ViewParent;
import java.util.ArrayList;
import java.util.Iterator;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_aicompose;
import org.telegram.ui.Components.ChatActivityEnterView;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes3.dex */
public final /* synthetic */ class eh implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ eh(int i7, Object obj, Object obj2) {
        this.a = i7;
        this.b = obj;
        this.c = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        TLRPC.Chat O0;
        org.telegram.ui.Components.de deVar;
        int i7 = this.a;
        int i10 = 1;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (i7) {
            case 0:
                bn bnVar = (bn) obj2;
                View view = (View) obj;
                if (bnVar.getParentActivity() != null) {
                    bnVar.Z0.setPadding(org.telegram.messenger.g0.L(7.33f), 0, org.telegram.messenger.g0.L(7.33f), 0);
                    bnVar.Z0.l(bnVar.L);
                    bnVar.Z0.s(16.0f);
                    bnVar.Z0.r(true);
                    bnVar.Z0.v(org.telegram.messenger.hd.N0(2131753099, null));
                    bnVar.Z0.o(0.0f, 96.0f);
                    bnVar.Z0.setTranslationY(org.telegram.messenger.g0.L(10.0f) + ((view.getTop() - bnVar.Xa) - bnVar.m1.getHeight()));
                    bnVar.m1.addView(bnVar.Z0, c8.ma.e(-1, 100, 87));
                    hi.l3 l3Var = bnVar.Z0;
                    l3Var.r0 = new zd(bnVar, 3);
                    l3Var.x();
                    org.telegram.ui.Components.n30.x.b();
                    break;
                }
                break;
            case 1:
                ((bn) obj2).m1.removeView((org.telegram.ui.Components.xi0) obj);
                break;
            case 2:
                org.telegram.messenger.gj gjVar = (org.telegram.messenger.gj) obj;
                bn bnVar2 = ((di) obj2).s;
                org.telegram.messenger.gj gjVar2 = (org.telegram.messenger.gj) bnVar2.G6[0].get(gjVar.e1());
                if (gjVar2 != null && gjVar2 != gjVar) {
                    org.telegram.messenger.gj gjVar3 = (org.telegram.messenger.gj) bnVar2.G6[0].get(gjVar.e1());
                    gjVar3.k.reactions = gjVar.k.reactions;
                    gjVar = gjVar3;
                }
                bnVar2.Yc(gjVar, true);
                ch.l0.f();
                break;
            case 3:
                org.telegram.ui.Cells.v0 v0Var = (org.telegram.ui.Cells.v0) obj;
                bn bnVar3 = ((fl) ((fm) obj2).f).a.R;
                int i11 = bn.md;
                bnVar3.pb();
                v0Var.getMessageObject().r = false;
                v0Var.invalidate();
                break;
            case 4:
                hi.l3 l3Var2 = (hi.l3) obj;
                bn bnVar4 = ((mm) obj2).a;
                bnVar4.m1.removeView(l3Var2);
                if (l3Var2 == bnVar4.P1) {
                    bnVar4.P1 = null;
                    break;
                }
                break;
            case 5:
                Long l10 = (Long) obj;
                bn bnVar5 = ((gm) obj2).W2.a;
                String str = (l10.longValue() >= 0 || (O0 = bnVar5.getMessagesController().O0(Long.valueOf(-l10.longValue()))) == null) ? "" : O0.title;
                org.telegram.messenger.o10.u(TextUtils.isEmpty(str) ? org.telegram.messenger.hd.N0(2131745986, null) : org.telegram.messenger.hd.a0(null, null, 2131745987, str), org.telegram.ui.Components.lc.b0(bnVar5), R.raw.contact_check, 36);
                break;
            case 6:
                rn rnVar = (rn) obj2;
                rnVar.getClass();
                rnVar.presentFragment(c51.g0((TLRPC.Chat) obj, true));
                break;
            case 7:
                jo joVar = (jo) obj2;
                String str2 = (String) obj;
                TLRPC.TL_channels_checkUsername tL_channels_checkUsername = new TLRPC.TL_channels_checkUsername();
                tL_channels_checkUsername.username = str2;
                tL_channels_checkUsername.channel = joVar.getMessagesController().j1(joVar.a0);
                joVar.i0 = joVar.getConnectionsManager().sendRequest(tL_channels_checkUsername, new z9(joVar, str2, tL_channels_checkUsername, 6), 2);
                break;
            case 8:
                jo joVar2 = (jo) obj2;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj;
                boolean z10 = tL_error == null || !tL_error.text.equals("CHANNELS_ADMIN_PUBLIC_TOO_MUCH");
                joVar2.d0 = z10;
                if (!z10 && joVar2.getUserConfig().q() && !joVar2.e0 && joVar2.y != null) {
                    joVar2.e0 = true;
                    joVar2.h0();
                    joVar2.getConnectionsManager().sendRequest(new TLRPC.TL_channels_getAdminedPublicChannels(), new sn(joVar2, i10));
                    break;
                }
                break;
            case 9:
                vo.Z((vo) obj2, (org.telegram.ui.ActionBar.t1[]) obj);
                break;
            case 10:
                vo voVar = (vo) obj2;
                TLObject tLObject = (TLObject) obj;
                if (tLObject instanceof TLRPC.messages_Chats) {
                    TLRPC.messages_Chats messages_chats = (TLRPC.messages_Chats) tLObject;
                    voVar.getMessagesController().Z3(messages_chats.chats, false);
                    ArrayList<TLRPC.Chat> arrayList = messages_chats.chats;
                    voVar.w = arrayList;
                    Iterator<TLRPC.Chat> it = arrayList.iterator();
                    while (it.hasNext()) {
                        TLRPC.Chat next = it.next();
                        if (org.telegram.messenger.v3.c0(next) || org.telegram.messenger.v3.p0(next)) {
                            it.remove();
                        }
                    }
                }
                voVar.x = false;
                voVar.y = true;
                voVar.g0();
                break;
            case 11:
                ((ro) obj2).y.d.Q = false;
                ((org.telegram.ui.Components.t70) obj).run();
                break;
            case 12:
                ((ro) obj2).y.d.P = false;
                ((org.telegram.ui.Components.u70) obj).run();
                break;
            case 13:
                vo voVar2 = ((ro) obj2).y.d;
                voVar2.P = false;
                voVar2.Q = false;
                ((Runnable) obj).run();
                break;
            case 14:
                ro roVar = (ro) obj2;
                roVar.getClass();
                ((TLRPC.Chat) obj).join_request = true;
                roVar.h = true;
                roVar.c.setChecked(true);
                break;
            case 15:
                rq rqVar = (rq) obj2;
                rqVar.getClass();
                rqVar.getMessagesController().b3(0, ((TLRPC.Updates) obj).chats.get(0).id, true);
                break;
            case 16:
                TLRPC.User user = (TLRPC.User) obj;
                rq rqVar2 = ((gq) obj2).a;
                if (org.telegram.ui.Components.lc.a(rqVar2)) {
                    org.telegram.ui.Components.lc.C(user.first_name, rqVar2).j();
                    break;
                }
                break;
            case 17:
                TL_aicompose.TL_aiComposeTone tL_aiComposeTone = (TL_aicompose.TL_aiComposeTone) obj;
                org.telegram.messenger.e eVar = ((org.telegram.ui.Components.n0) obj2).s2;
                eVar.b.remove(tL_aiComposeTone);
                eVar.d();
                eVar.c();
                TL_aicompose.saveTone savetone = new TL_aicompose.saveTone();
                savetone.tone = TL_aicompose.InputAiComposeTone.from(tL_aiComposeTone);
                savetone.unsave = true;
                ConnectionsManager.getInstance(eVar.a).sendRequest(savetone, null);
                break;
            case 18:
                org.telegram.ui.Components.w wVar = (org.telegram.ui.Components.w) obj2;
                TL_aicompose.TL_aiComposeTone tL_aiComposeTone2 = (TL_aicompose.TL_aiComposeTone) obj;
                wVar.getClass();
                org.telegram.ui.ActionBar.g2 T = LaunchActivity.T();
                if (T != null) {
                    T.presentFragment(ProfileActivity.D4(tL_aiComposeTone2.author_id));
                    wVar.dismiss();
                    break;
                }
                break;
            case 19:
                ru0 ru0Var = (ru0) obj;
                if (((boolean[]) obj2)[0]) {
                    ru0Var.run();
                    break;
                }
                break;
            case 20:
                org.telegram.ui.Components.gc gcVar = (org.telegram.ui.Components.gc) obj2;
                CharSequence charSequence = (CharSequence) obj;
                gcVar.n = true;
                ViewParent viewParent = gcVar.e;
                if (viewParent instanceof org.telegram.ui.Components.mb) {
                    org.telegram.ui.Components.nb nbVar = (org.telegram.ui.Components.nb) ((org.telegram.ui.Components.mb) viewParent);
                    nbVar.b.setText(charSequence);
                    org.telegram.messenger.g0.T3(nbVar.d, false, false);
                    org.telegram.messenger.g0.T3(nbVar.b, true, false);
                }
                gcVar.i(true);
                break;
            case 21:
                boolean[] zArr = (boolean[]) obj2;
                Runnable runnable = (Runnable) obj;
                if (!zArr[0]) {
                    zArr[0] = true;
                    runnable.run();
                    break;
                }
                break;
            case 22:
                ((org.telegram.ui.Components.yc) obj2).removeView((hi.l3) obj);
                break;
            case 23:
                ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) obj2;
                int i12 = ChatActivityEnterView.s7;
                ((org.telegram.ui.Components.dd) obj).run();
                org.telegram.messenger.c6.p(chatActivityEnterView.R, chatActivityEnterView.G3);
                break;
            case 24:
                ChatActivityEnterView chatActivityEnterView2 = (ChatActivityEnterView) obj2;
                org.telegram.ui.Components.c5.J(chatActivityEnterView2.E3, chatActivityEnterView2.F3.a(), new h9.g1((org.telegram.ui.Components.hd) obj, 29), chatActivityEnterView2.M4);
                break;
            case 25:
                int i13 = ChatActivityEnterView.s7;
                ((ChatActivityEnterView) obj2).removeView((hi.l3) obj);
                break;
            case 26:
                ChatActivityEnterView chatActivityEnterView3 = (ChatActivityEnterView) obj2;
                if (chatActivityEnterView3.R3 == ((TLRPC.TL_document) obj) && (deVar = chatActivityEnterView3.f1) != null && deVar.getVisibility() == 0) {
                    chatActivityEnterView3.y5 = true;
                    chatActivityEnterView3.s1();
                    chatActivityEnterView3.y5 = false;
                    break;
                }
                break;
            case 27:
                ChatActivityEnterView chatActivityEnterView4 = (ChatActivityEnterView) obj2;
                if (chatActivityEnterView4.V6 == ((org.telegram.ui.Components.a70) obj)) {
                    chatActivityEnterView4.V6 = null;
                    break;
                }
                break;
            case 28:
                ChatActivityEnterView chatActivityEnterView5 = (ChatActivityEnterView) obj2;
                int i14 = ChatActivityEnterView.s7;
                chatActivityEnterView5.setFieldText((CharSequence) obj);
                chatActivityEnterView5.a0 = null;
                break;
            default:
                ((ji.g) obj2).a((ai.g) obj);
                break;
        }
    }
}
