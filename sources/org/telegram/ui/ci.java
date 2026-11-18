package org.telegram.ui;

import android.animation.Animator;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Iterator;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_aicompose;
import org.telegram.ui.Components.ChatActivityEnterView;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final /* synthetic */ class ci implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ ci(int i7, Object obj, Object obj2) {
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
                org.telegram.messenger.fj fjVar = (org.telegram.messenger.fj) obj;
                bn bnVar = ((di) obj2).s;
                org.telegram.messenger.fj fjVar2 = (org.telegram.messenger.fj) bnVar.G6[0].get(fjVar.e1());
                if (fjVar2 != null && fjVar2 != fjVar) {
                    org.telegram.messenger.fj fjVar3 = (org.telegram.messenger.fj) bnVar.G6[0].get(fjVar.e1());
                    fjVar3.k.reactions = fjVar.k.reactions;
                    fjVar = fjVar3;
                }
                bnVar.Yc(fjVar, true);
                ch.l0.f();
                break;
            case 1:
                org.telegram.ui.Cells.u0 u0Var = (org.telegram.ui.Cells.u0) obj;
                bn bnVar2 = ((fl) ((fm) obj2).f).a.R;
                int i11 = bn.md;
                bnVar2.pb();
                u0Var.getMessageObject().r = false;
                u0Var.invalidate();
                break;
            case 2:
                hi.m3 m3Var = (hi.m3) obj;
                bn bnVar3 = ((mm) obj2).a;
                bnVar3.m1.removeView(m3Var);
                if (m3Var == bnVar3.P1) {
                    bnVar3.P1 = null;
                    break;
                }
                break;
            case 3:
                Long l10 = (Long) obj;
                bn bnVar4 = ((gm) obj2).W2.a;
                String str = (l10.longValue() >= 0 || (O0 = bnVar4.getMessagesController().O0(Long.valueOf(-l10.longValue()))) == null) ? "" : O0.title;
                org.telegram.messenger.n10.u(TextUtils.isEmpty(str) ? org.telegram.messenger.gd.M0(2131745987, null) : org.telegram.messenger.gd.a0(null, null, 2131745988, str), org.telegram.ui.Components.lc.b0(bnVar4), R.raw.contact_check, 36);
                break;
            case 4:
                rn rnVar = (rn) obj2;
                rnVar.getClass();
                rnVar.presentFragment(c51.g0((TLRPC.Chat) obj, true));
                break;
            case 5:
                jo joVar = (jo) obj2;
                String str2 = (String) obj;
                TLRPC.TL_channels_checkUsername tL_channels_checkUsername = new TLRPC.TL_channels_checkUsername();
                tL_channels_checkUsername.username = str2;
                tL_channels_checkUsername.channel = joVar.getMessagesController().j1(joVar.a0);
                joVar.i0 = joVar.getConnectionsManager().sendRequest(tL_channels_checkUsername, new z9(joVar, str2, tL_channels_checkUsername, 6), 2);
                break;
            case 6:
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
            case 7:
                vo.Z((vo) obj2, (org.telegram.ui.ActionBar.u1[]) obj);
                break;
            case 8:
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
            case 9:
                ((ro) obj2).y.d.Q = false;
                ((org.telegram.ui.Components.r70) obj).run();
                break;
            case 10:
                ((ro) obj2).y.d.P = false;
                ((org.telegram.ui.Components.s70) obj).run();
                break;
            case 11:
                vo voVar2 = ((ro) obj2).y.d;
                voVar2.P = false;
                voVar2.Q = false;
                ((Runnable) obj).run();
                break;
            case 12:
                ro roVar = (ro) obj2;
                roVar.getClass();
                ((TLRPC.Chat) obj).join_request = true;
                roVar.h = true;
                roVar.c.setChecked(true);
                break;
            case 13:
                rq rqVar = (rq) obj2;
                rqVar.getClass();
                rqVar.getMessagesController().b3(0, ((TLRPC.Updates) obj).chats.get(0).id, true);
                break;
            case 14:
                TLRPC.User user = (TLRPC.User) obj;
                rq rqVar2 = ((gq) obj2).a;
                if (org.telegram.ui.Components.lc.a(rqVar2)) {
                    org.telegram.ui.Components.lc.C(user.first_name, rqVar2).j();
                    break;
                }
                break;
            case 15:
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
            case 16:
                org.telegram.ui.Components.v vVar = (org.telegram.ui.Components.v) obj2;
                TL_aicompose.TL_aiComposeTone tL_aiComposeTone2 = (TL_aicompose.TL_aiComposeTone) obj;
                vVar.getClass();
                org.telegram.ui.ActionBar.h2 T = LaunchActivity.T();
                if (T != null) {
                    T.presentFragment(ProfileActivity.D4(tL_aiComposeTone2.author_id));
                    vVar.dismiss();
                    break;
                }
                break;
            case 17:
                ru0 ru0Var = (ru0) obj;
                if (((boolean[]) obj2)[0]) {
                    ru0Var.run();
                    break;
                }
                break;
            case 18:
                org.telegram.ui.Components.gc gcVar = (org.telegram.ui.Components.gc) obj2;
                CharSequence charSequence = (CharSequence) obj;
                gcVar.n = true;
                org.telegram.ui.ActionBar.c6 c6Var = gcVar.e;
                if (c6Var instanceof org.telegram.ui.Components.mb) {
                    org.telegram.ui.Components.nb nbVar = (org.telegram.ui.Components.nb) ((org.telegram.ui.Components.mb) c6Var);
                    nbVar.b.setText(charSequence);
                    org.telegram.messenger.g0.T3(nbVar.d, false, false);
                    org.telegram.messenger.g0.T3(nbVar.b, true, false);
                }
                gcVar.i(true);
                break;
            case 19:
                boolean[] zArr = (boolean[]) obj2;
                Runnable runnable = (Runnable) obj;
                if (!zArr[0]) {
                    zArr[0] = true;
                    runnable.run();
                    break;
                }
                break;
            case 20:
                ((org.telegram.ui.Components.yc) obj2).removeView((hi.m3) obj);
                break;
            case 21:
                ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) obj2;
                int i12 = ChatActivityEnterView.n7;
                ((org.telegram.ui.Components.dd) obj).run();
                org.telegram.messenger.c6.p(chatActivityEnterView.R, chatActivityEnterView.E3);
                break;
            case 22:
                ChatActivityEnterView chatActivityEnterView2 = (ChatActivityEnterView) obj2;
                org.telegram.ui.Components.b5.J(chatActivityEnterView2.C3, chatActivityEnterView2.D3.a(), new h9.g1((org.telegram.ui.Components.hd) obj, 29), chatActivityEnterView2.K4);
                break;
            case 23:
                int i13 = ChatActivityEnterView.n7;
                ((ChatActivityEnterView) obj2).removeView((hi.m3) obj);
                break;
            case 24:
                ChatActivityEnterView chatActivityEnterView3 = (ChatActivityEnterView) obj2;
                if (chatActivityEnterView3.P3 == ((TLRPC.TL_document) obj) && (deVar = chatActivityEnterView3.f1) != null && deVar.getVisibility() == 0) {
                    chatActivityEnterView3.w5 = true;
                    chatActivityEnterView3.o1();
                    chatActivityEnterView3.w5 = false;
                    break;
                }
                break;
            case 25:
                ChatActivityEnterView chatActivityEnterView4 = (ChatActivityEnterView) obj2;
                if (chatActivityEnterView4.T6 == ((org.telegram.ui.Components.y60) obj)) {
                    chatActivityEnterView4.T6 = null;
                    break;
                }
                break;
            case 26:
                ChatActivityEnterView chatActivityEnterView5 = (ChatActivityEnterView) obj2;
                int i14 = ChatActivityEnterView.n7;
                chatActivityEnterView5.setFieldText((CharSequence) obj);
                chatActivityEnterView5.a0 = null;
                break;
            case 27:
                ((ji.h) obj2).a((ai.g) obj);
                break;
            case 28:
                org.telegram.ui.Components.pf pfVar = (org.telegram.ui.Components.pf) obj2;
                pfVar.getClass();
                org.telegram.messenger.g0.E2((ji.n) obj);
                ChatActivityEnterView chatActivityEnterView6 = pfVar.a;
                chatActivityEnterView6.r1 = false;
                ChatActivityEnterView.RecordCircle recordCircle = chatActivityEnterView6.B2;
                if (recordCircle != null) {
                    recordCircle.invalidate();
                    break;
                }
                break;
            default:
                ((org.telegram.ui.Components.rf) obj2).onAnimationEnd((Animator) obj);
                break;
        }
    }
}
