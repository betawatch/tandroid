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

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
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
                ((n6) obj).a(Boolean.FALSE, null);
                break;
            case 1:
                fi.b5 b5Var = (fi.b5) obj;
                i7 = ((org.telegram.ui.ActionBar.f2) ((an) b5Var.e)).currentAccount;
                org.telegram.messenger.qs.f(i7).j(b5Var.b);
                break;
            case 2:
                ji jiVar = (ji) obj;
                i10 = ((org.telegram.ui.ActionBar.f2) ((an) jiVar.e)).currentAccount;
                org.telegram.messenger.qs.f(i10).j(jiVar.c);
                break;
            case 3:
                an.e2(((aj) obj).F3);
                break;
            case 4:
                ((dj) obj).T.C0.O(false);
                break;
            case 5:
                ((org.telegram.messenger.ij) obj).q = false;
                break;
            case 6:
                Bundle bundle = new Bundle();
                jl jlVar = ((dl) obj).c.a;
                i11 = ((org.telegram.ui.ActionBar.f2) jlVar.Q).currentAccount;
                bundle.putLong("user_id", org.telegram.messenger.p10.i(i11).n);
                jlVar.Q.presentFragment(new ProfileActivity(bundle, null));
                break;
            case 7:
                ((ll) obj).b.B9(true);
                break;
            case 8:
                ((hi) obj).c(false);
                break;
            case 9:
                an anVar = ((mm) obj).h;
                anVar.getNotificationCenter().j(anVar.ba);
                break;
            case 10:
                an anVar2 = ((sm) obj).b;
                anVar2.j0.getSearchField().requestFocus();
                org.telegram.messenger.g0.K3(anVar2.j0.getSearchField());
                if (anVar2.Ia > 0) {
                    af afVar = new af(anVar2, i14);
                    anVar2.Ja = afVar;
                    org.telegram.messenger.g0.i3(afVar, 200L);
                    break;
                }
                break;
            case 11:
                pn pnVar = ((nn) obj).a;
                pnVar.e.setImageDrawable(pnVar.r);
                pnVar.b0.o(R.drawable.msg_addphoto, org.telegram.messenger.id.M0(2131752212, "ChatSetPhotoOrVideo"), true);
                TLRPC.User user = pnVar.C0;
                if (user != null) {
                    user.photo = null;
                    pnVar.getMessagesController().X3(pnVar.C0, true, false);
                }
                pnVar.O0 = true;
                if (pnVar.R0 == null) {
                    pnVar.R0 = new org.telegram.ui.Components.zg0(R.raw.camera_outline, org.telegram.messenger.g0.L(50.0f), org.telegram.messenger.g0.L(50.0f), false, null);
                }
                pnVar.b0.e.setTranslationX(-org.telegram.messenger.g0.L(8.0f));
                pnVar.b0.e.setAnimation(pnVar.R0);
                break;
            case 12:
                ((tp) obj).a(0);
                break;
            case 13:
                ((uq) obj).invalidateSelf();
                break;
            case 14:
                cr crVar = (cr) obj;
                ArrayList arrayList = crVar.c;
                int size = arrayList.size();
                while (i15 < size) {
                    Object obj2 = arrayList.get(i15);
                    i15++;
                    ((View) obj2).invalidate();
                }
                crVar.invalidateSelf();
                break;
            case 15:
                ((ActionBarPopupWindow$ActionBarPopupWindowLayout) obj).getSwipeBack().b(true);
                break;
            case 16:
                ((gs) obj).a.o();
                break;
            case 17:
                org.telegram.ui.ActionBar.v2[] v2VarArr = (org.telegram.ui.ActionBar.v2[]) obj;
                org.telegram.ui.ActionBar.v2 v2Var = v2VarArr[0];
                if (v2Var != null) {
                    v2Var.dismiss();
                    v2VarArr[0] = null;
                    break;
                }
                break;
            case 18:
                org.telegram.messenger.z5 q10 = org.telegram.messenger.z5.q(((org.telegram.messenger.c) obj).a);
                q10.getMessagesStorage().a.c(new org.telegram.messenger.w5(q10, i15));
                break;
            case 19:
                ((org.telegram.ui.Cells.b3) obj).updateColors();
                break;
            case 20:
                ((org.telegram.ui.Cells.ma) obj).updateColors();
                break;
            case 21:
                ((org.telegram.ui.Cells.m) obj).updateColors();
                break;
            case 22:
                ((ww) ((w9) obj).b).f0.setAlpha(1.0f);
                break;
            case 23:
                Bundle bundle2 = new Bundle();
                ww wwVar = ((jw) obj).a;
                i12 = ((org.telegram.ui.ActionBar.f2) wwVar).currentAccount;
                bundle2.putLong("user_id", org.telegram.messenger.p10.i(i12).e());
                bundle2.putBoolean("my_profile", true);
                wwVar.presentFragment(new ProfileActivity(bundle2, null));
                break;
            case 24:
                ww wwVar2 = ((mw) obj).B0;
                wwVar2.showDialog(new ug.w0((org.telegram.ui.ActionBar.f2) wwVar2, 9, true));
                wwVar2.z0.setIsEditing(false);
                wwVar2.U4(false);
                break;
            case 25:
                ww wwVar3 = ((nw) obj).b;
                wwVar3.z0.setIsEditing(true);
                wwVar3.U4(true);
                break;
            case 26:
                ((ex) obj).removeSelfFromStack();
                break;
            case 27:
                ix ixVar = (ix) obj;
                ArrayList arrayList2 = ixVar.y;
                ArrayList arrayList3 = ixVar.x;
                if (ixVar.r != 0) {
                    TLRPC.TL_sendMessageEmojiInteraction tL_sendMessageEmojiInteraction = new TLRPC.TL_sendMessageEmojiInteraction();
                    tL_sendMessageEmojiInteraction.msg_id = ixVar.r;
                    tL_sendMessageEmojiInteraction.emoticon = ixVar.w;
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
                                ixVar.r = 0;
                                ixVar.w = null;
                                ixVar.s = 0L;
                                arrayList3.clear();
                                arrayList2.clear();
                                org.telegram.messenger.a8.g(e, true);
                                ixVar.D = null;
                                return;
                            }
                        }
                        jSONObject.put("a", jSONArray);
                        tL_sendMessageEmojiInteraction.interaction.data = jSONObject.toString();
                        TLRPC.TL_messages_setTyping tL_messages_setTyping = new TLRPC.TL_messages_setTyping();
                        long j3 = ixVar.J;
                        if (j3 != 0) {
                            tL_messages_setTyping.top_msg_id = (int) j3;
                            tL_messages_setTyping.flags = 1 | tL_messages_setTyping.flags;
                        }
                        tL_messages_setTyping.action = tL_sendMessageEmojiInteraction;
                        tL_messages_setTyping.peer = org.telegram.messenger.qp.s1(ixVar.b).j1(ixVar.I);
                        ConnectionsManager.getInstance(ixVar.b).sendRequest(tL_messages_setTyping, null);
                        ixVar.r = 0;
                        ixVar.w = null;
                        ixVar.s = 0L;
                        arrayList3.clear();
                        arrayList2.clear();
                    } catch (JSONException e11) {
                        e = e11;
                    }
                }
                ixVar.D = null;
            case 28:
                ((gy) obj).j0(true);
                break;
            default:
                ((ey) obj).a.getBackground().setState(new int[0]);
                break;
        }
    }
}
