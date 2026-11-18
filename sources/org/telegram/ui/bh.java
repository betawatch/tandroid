package org.telegram.ui;

import android.os.Bundle;
import android.view.View;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class bh implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ bh(Object obj, int i7) {
        this.a = i7;
        this.b = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i7;
        int i10;
        int i11;
        int i12;
        int i13 = this.a;
        int i14 = 9;
        int i15 = 0;
        Object obj = this.b;
        switch (i13) {
            case 0:
                ((m6) obj).a(Boolean.FALSE, null);
                break;
            case 1:
                hi.y4 y4Var = (hi.y4) obj;
                i7 = ((org.telegram.ui.ActionBar.h2) ((bn) y4Var.e)).currentAccount;
                org.telegram.messenger.ks.f(i7).j(y4Var.b);
                break;
            case 2:
                ki kiVar = (ki) obj;
                i10 = ((org.telegram.ui.ActionBar.h2) ((bn) kiVar.e)).currentAccount;
                org.telegram.messenger.ks.f(i10).j(kiVar.c);
                break;
            case 3:
                bn.f2(((bj) obj).G3);
                break;
            case 4:
                ((ej) obj).T.D0.O(false);
                break;
            case 5:
                ((org.telegram.messenger.fj) obj).q = false;
                break;
            case 6:
                Bundle bundle = new Bundle();
                kl klVar = ((el) obj).c.a;
                i11 = ((org.telegram.ui.ActionBar.h2) klVar.R).currentAccount;
                bundle.putLong("user_id", org.telegram.messenger.j10.i(i11).n);
                klVar.R.presentFragment(new ProfileActivity(bundle, null));
                break;
            case 7:
                ((ml) obj).b.D9(true);
                break;
            case 8:
                ((hi) obj).c(false);
                break;
            case 9:
                bn bnVar = ((nm) obj).h;
                bnVar.getNotificationCenter().j(bnVar.fa);
                break;
            case 10:
                bn bnVar2 = ((tm) obj).b;
                bnVar2.k0.getSearchField().requestFocus();
                org.telegram.messenger.g0.I3(bnVar2.k0.getSearchField());
                if (bnVar2.Ma > 0) {
                    af afVar = new af(bnVar2, i14);
                    bnVar2.Na = afVar;
                    org.telegram.messenger.g0.h3(afVar, 200L);
                    break;
                }
                break;
            case 11:
                rn rnVar = ((pn) obj).a;
                rnVar.e.setImageDrawable(rnVar.r);
                rnVar.c0.o(R.drawable.msg_addphoto, org.telegram.messenger.gd.M0(2131752201, "ChatSetPhotoOrVideo"), true);
                TLRPC.User user = rnVar.D0;
                if (user != null) {
                    user.photo = null;
                    rnVar.getMessagesController().e4(rnVar.D0, true, false);
                }
                rnVar.P0 = true;
                if (rnVar.S0 == null) {
                    rnVar.S0 = new org.telegram.ui.Components.mh0(R.raw.camera_outline, org.telegram.messenger.g0.L(50.0f), org.telegram.messenger.g0.L(50.0f), false, null);
                }
                rnVar.c0.e.setTranslationX(-org.telegram.messenger.g0.L(8.0f));
                rnVar.c0.e.setAnimation(rnVar.S0);
                break;
            case 12:
                ((wp) obj).a(0);
                break;
            case 13:
                ((xq) obj).invalidateSelf();
                break;
            case 14:
                fr frVar = (fr) obj;
                ArrayList arrayList = frVar.c;
                int size = arrayList.size();
                while (i15 < size) {
                    Object obj2 = arrayList.get(i15);
                    i15++;
                    ((View) obj2).invalidate();
                }
                frVar.invalidateSelf();
                break;
            case 15:
                ((ActionBarPopupWindow$ActionBarPopupWindowLayout) obj).getSwipeBack().b(true);
                break;
            case 16:
                ((js) obj).a.o();
                break;
            case 17:
                org.telegram.ui.ActionBar.x2[] x2VarArr = (org.telegram.ui.ActionBar.x2[]) obj;
                org.telegram.ui.ActionBar.x2 x2Var = x2VarArr[0];
                if (x2Var != null) {
                    x2Var.dismiss();
                    x2VarArr[0] = null;
                    break;
                }
                break;
            case 18:
                org.telegram.messenger.a6 q10 = org.telegram.messenger.a6.q(((org.telegram.messenger.c) obj).a);
                q10.getMessagesStorage().a.c(new org.telegram.messenger.x5(q10, i15));
                break;
            case 19:
                ((org.telegram.ui.Cells.c3) obj).updateColors();
                break;
            case 20:
                ((org.telegram.ui.Cells.oa) obj).updateColors();
                break;
            case 21:
                ((org.telegram.ui.Cells.m) obj).updateColors();
                break;
            case 22:
                ((cx) ((dv) obj).b).g0.setAlpha(1.0f);
                break;
            case 23:
                Bundle bundle2 = new Bundle();
                cx cxVar = ((ow) obj).a;
                i12 = ((org.telegram.ui.ActionBar.h2) cxVar).currentAccount;
                bundle2.putLong("user_id", org.telegram.messenger.j10.i(i12).e());
                bundle2.putBoolean("my_profile", true);
                cxVar.presentFragment(new ProfileActivity(bundle2, null));
                break;
            case 24:
                cx cxVar2 = ((rw) obj).I0;
                cxVar2.showDialog(new ug.z0((org.telegram.ui.ActionBar.h2) cxVar2, 9, true));
                cxVar2.A0.setIsEditing(false);
                cxVar2.c5(false);
                break;
            case 25:
                cx cxVar3 = ((tw) obj).b;
                cxVar3.A0.setIsEditing(true);
                cxVar3.c5(true);
                break;
            case 26:
                ((kx) obj).removeSelfFromStack();
                break;
            case 27:
                nx nxVar = (nx) obj;
                ArrayList arrayList2 = nxVar.y;
                ArrayList arrayList3 = nxVar.x;
                if (nxVar.r != 0) {
                    TLRPC.TL_sendMessageEmojiInteraction tL_sendMessageEmojiInteraction = new TLRPC.TL_sendMessageEmojiInteraction();
                    tL_sendMessageEmojiInteraction.msg_id = nxVar.r;
                    tL_sendMessageEmojiInteraction.emoticon = nxVar.w;
                    tL_sendMessageEmojiInteraction.interaction = new TLRPC.TL_dataJSON();
                    JSONObject jSONObject = new JSONObject();
                    try {
                        jSONObject.put("v", 1);
                        JSONArray jSONArray = new JSONArray();
                        for (int i16 = 0; i16 < arrayList3.size(); i16++) {
                            try {
                                JSONObject jSONObject2 = new JSONObject();
                                jSONObject2.put("i", ((Integer) arrayList2.get(i16)).intValue() + 1);
                                jSONObject2.put("t", ((Long) arrayList3.get(i16)).longValue() / 1000.0f);
                                jSONArray.put(i16, jSONObject2);
                            } catch (JSONException e10) {
                                e = e10;
                                nxVar.r = 0;
                                nxVar.w = null;
                                nxVar.s = 0L;
                                arrayList3.clear();
                                arrayList2.clear();
                                org.telegram.messenger.a8.g(e, true);
                                nxVar.E = null;
                                return;
                            }
                        }
                        jSONObject.put("a", jSONArray);
                        tL_sendMessageEmojiInteraction.interaction.data = jSONObject.toString();
                        TLRPC.TL_messages_setTyping tL_messages_setTyping = new TLRPC.TL_messages_setTyping();
                        long j3 = nxVar.K;
                        if (j3 != 0) {
                            tL_messages_setTyping.top_msg_id = (int) j3;
                            tL_messages_setTyping.flags = 1 | tL_messages_setTyping.flags;
                        }
                        tL_messages_setTyping.action = tL_sendMessageEmojiInteraction;
                        tL_messages_setTyping.peer = org.telegram.messenger.mp.u1(nxVar.b).l1(nxVar.J);
                        ConnectionsManager.getInstance(nxVar.b).sendRequest(tL_messages_setTyping, null);
                        nxVar.r = 0;
                        nxVar.w = null;
                        nxVar.s = 0L;
                        arrayList3.clear();
                        arrayList2.clear();
                    } catch (JSONException e11) {
                        e = e11;
                    }
                }
                nxVar.E = null;
            case 28:
                ((ky) obj).j0(true);
                break;
            default:
                ((iy) obj).a.getBackground().setState(new int[0]);
                break;
        }
    }
}
