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

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final /* synthetic */ class dh implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ dh(Object obj, int i7) {
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
                i7 = ((org.telegram.ui.ActionBar.f2) ((cn) b5Var.e)).currentAccount;
                org.telegram.messenger.qs.f(i7).j(b5Var.b);
                break;
            case 2:
                li liVar = (li) obj;
                i10 = ((org.telegram.ui.ActionBar.f2) ((cn) liVar.e)).currentAccount;
                org.telegram.messenger.qs.f(i10).j(liVar.c);
                break;
            case 3:
                cn.f2(((cj) obj).F3);
                break;
            case 4:
                ((fj) obj).T.C0.O(false);
                break;
            case 5:
                ((org.telegram.messenger.ij) obj).q = false;
                break;
            case 6:
                Bundle bundle = new Bundle();
                ll llVar = ((fl) obj).c.a;
                i11 = ((org.telegram.ui.ActionBar.f2) llVar.Q).currentAccount;
                bundle.putLong("user_id", org.telegram.messenger.p10.i(i11).n);
                llVar.Q.presentFragment(new ProfileActivity(bundle, null));
                break;
            case 7:
                ((nl) obj).b.C9(true);
                break;
            case 8:
                ((ji) obj).c(false);
                break;
            case 9:
                cn cnVar = ((om) obj).h;
                cnVar.getNotificationCenter().j(cnVar.da);
                break;
            case 10:
                cn cnVar2 = ((um) obj).b;
                cnVar2.j0.getSearchField().requestFocus();
                org.telegram.messenger.g0.K3(cnVar2.j0.getSearchField());
                if (cnVar2.Ka > 0) {
                    bf bfVar = new bf(cnVar2, i14);
                    cnVar2.La = bfVar;
                    org.telegram.messenger.g0.i3(bfVar, 200L);
                    break;
                }
                break;
            case 11:
                rn rnVar = ((pn) obj).a;
                rnVar.e.setImageDrawable(rnVar.r);
                rnVar.b0.o(R.drawable.msg_addphoto, org.telegram.messenger.id.M0(2131752212, "ChatSetPhotoOrVideo"), true);
                TLRPC.User user = rnVar.C0;
                if (user != null) {
                    user.photo = null;
                    rnVar.getMessagesController().X3(rnVar.C0, true, false);
                }
                rnVar.O0 = true;
                if (rnVar.R0 == null) {
                    rnVar.R0 = new org.telegram.ui.Components.zg0(R.raw.camera_outline, org.telegram.messenger.g0.L(50.0f), org.telegram.messenger.g0.L(50.0f), false, null);
                }
                rnVar.b0.e.setTranslationX(-org.telegram.messenger.g0.L(8.0f));
                rnVar.b0.e.setAnimation(rnVar.R0);
                break;
            case 12:
                ((vp) obj).a(0);
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
                org.telegram.ui.ActionBar.w2[] w2VarArr = (org.telegram.ui.ActionBar.w2[]) obj;
                org.telegram.ui.ActionBar.w2 w2Var = w2VarArr[0];
                if (w2Var != null) {
                    w2Var.dismiss();
                    w2VarArr[0] = null;
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
                ((zw) ((w9) obj).b).f0.setAlpha(1.0f);
                break;
            case 23:
                Bundle bundle2 = new Bundle();
                zw zwVar = ((mw) obj).a;
                i12 = ((org.telegram.ui.ActionBar.f2) zwVar).currentAccount;
                bundle2.putLong("user_id", org.telegram.messenger.p10.i(i12).e());
                bundle2.putBoolean("my_profile", true);
                zwVar.presentFragment(new ProfileActivity(bundle2, null));
                break;
            case 24:
                zw zwVar2 = ((pw) obj).B0;
                zwVar2.showDialog(new ug.w0((org.telegram.ui.ActionBar.f2) zwVar2, 9, true));
                zwVar2.z0.setIsEditing(false);
                zwVar2.U4(false);
                break;
            case 25:
                zw zwVar3 = ((qw) obj).b;
                zwVar3.z0.setIsEditing(true);
                zwVar3.U4(true);
                break;
            case 26:
                ((hx) obj).removeSelfFromStack();
                break;
            case 27:
                lx lxVar = (lx) obj;
                ArrayList arrayList2 = lxVar.y;
                ArrayList arrayList3 = lxVar.x;
                if (lxVar.r != 0) {
                    TLRPC.TL_sendMessageEmojiInteraction tL_sendMessageEmojiInteraction = new TLRPC.TL_sendMessageEmojiInteraction();
                    tL_sendMessageEmojiInteraction.msg_id = lxVar.r;
                    tL_sendMessageEmojiInteraction.emoticon = lxVar.w;
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
                                lxVar.r = 0;
                                lxVar.w = null;
                                lxVar.s = 0L;
                                arrayList3.clear();
                                arrayList2.clear();
                                org.telegram.messenger.a8.g(e, true);
                                lxVar.D = null;
                                return;
                            }
                        }
                        jSONObject.put("a", jSONArray);
                        tL_sendMessageEmojiInteraction.interaction.data = jSONObject.toString();
                        TLRPC.TL_messages_setTyping tL_messages_setTyping = new TLRPC.TL_messages_setTyping();
                        long j3 = lxVar.J;
                        if (j3 != 0) {
                            tL_messages_setTyping.top_msg_id = (int) j3;
                            tL_messages_setTyping.flags = 1 | tL_messages_setTyping.flags;
                        }
                        tL_messages_setTyping.action = tL_sendMessageEmojiInteraction;
                        tL_messages_setTyping.peer = org.telegram.messenger.qp.s1(lxVar.b).j1(lxVar.I);
                        ConnectionsManager.getInstance(lxVar.b).sendRequest(tL_messages_setTyping, null);
                        lxVar.r = 0;
                        lxVar.w = null;
                        lxVar.s = 0L;
                        arrayList3.clear();
                        arrayList2.clear();
                    } catch (JSONException e11) {
                        e = e11;
                    }
                }
                lxVar.D = null;
            case 28:
                ((jy) obj).j0(true);
                break;
            default:
                ((hy) obj).a.getBackground().setState(new int[0]);
                break;
        }
    }
}
