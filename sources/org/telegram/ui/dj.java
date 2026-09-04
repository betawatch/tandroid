package org.telegram.ui;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.os.Bundle;
import android.util.Property;
import android.view.View;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.telegram.messenger.AccountInstance;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes3.dex */
public final /* synthetic */ class dj implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ dj(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10;
        int i11;
        int i12;
        int i13 = this.a;
        int i14 = 9;
        int i15 = 0;
        Object obj = this.b;
        switch (i13) {
            case 0:
                ej ejVar = (ej) obj;
                i10 = ((org.telegram.ui.ActionBar.n2) ((co) ejVar.e)).currentAccount;
                NotificationCenter.getInstance(i10).onAnimationFinish(ejVar.c);
                break;
            case 1:
                co.X1(((uj) obj).y3);
                break;
            case 2:
                ((xj) obj).T.A0.O(false);
                break;
            case 3:
                xi xiVar = (xi) obj;
                co coVar = xiVar.b;
                if (coVar.e2 != null) {
                    AnimatorSet animatorSet = new AnimatorSet();
                    animatorSet.playTogether(ObjectAnimator.ofFloat(coVar.e2, (Property<org.telegram.ui.Components.i40, Float>) View.ALPHA, 0.0f));
                    animatorSet.addListener(new s0(xiVar, 22));
                    animatorSet.setDuration(300L);
                    animatorSet.start();
                    break;
                }
                break;
            case 4:
                ((MessageObject) obj).settingAvatar = false;
                break;
            case 5:
                Bundle bundle = new Bundle();
                om omVar = ((em) obj).c.a;
                i11 = ((org.telegram.ui.ActionBar.n2) omVar.Q).currentAccount;
                bundle.putLong("user_id", UserConfig.getInstance(i11).clientUserId);
                omVar.Q.presentFragment(new ProfileActivity(bundle, null));
                break;
            case 6:
                ((sm) obj).c.e9(true);
                break;
            case 7:
                ((aj) obj).c(false);
                break;
            case 8:
                co coVar2 = ((pn) obj).h;
                coVar2.getNotificationCenter().onAnimationFinish(coVar2.I9);
                break;
            case 9:
                co coVar3 = ((un) obj).h;
                coVar3.j0.getSearchField().requestFocus();
                AndroidUtilities.showKeyboard(coVar3.j0.getSearchField());
                if (coVar3.pa > 0) {
                    qf qfVar = new qf(coVar3, i14);
                    coVar3.qa = qfVar;
                    AndroidUtilities.runOnUIThread(qfVar, 200L);
                    break;
                }
                break;
            case 10:
                xo xoVar = ((uo) obj).a;
                xoVar.e.setImageDrawable(xoVar.r);
                xoVar.b0.m(R.drawable.msg_addphoto, LocaleController.getString("ChatSetPhotoOrVideo", R.string.ChatSetPhotoOrVideo), true);
                TLRPC.User user = xoVar.D0;
                if (user != null) {
                    user.photo = null;
                    xoVar.getMessagesController().putUser(xoVar.D0, true);
                }
                xoVar.O0 = true;
                if (xoVar.R0 == null) {
                    xoVar.R0 = new org.telegram.ui.Components.xi0(R.raw.camera_outline, AndroidUtilities.dp(50.0f), AndroidUtilities.dp(50.0f), false, null);
                }
                xoVar.b0.e.setTranslationX(-AndroidUtilities.dp(8.0f));
                xoVar.b0.e.setAnimation(xoVar.R0);
                break;
            case 11:
                ((ar) obj).run(0);
                break;
            case 12:
                ((zr) obj).invalidateSelf();
                break;
            case 13:
                hs hsVar = (hs) obj;
                ArrayList arrayList = hsVar.c;
                int size = arrayList.size();
                while (i15 < size) {
                    Object obj2 = arrayList.get(i15);
                    i15++;
                    ((View) obj2).invalidate();
                }
                hsVar.invalidateSelf();
                break;
            case 14:
                ContactsActivity contactsActivity = ((ys) obj).a;
                contactsActivity.Z.r.requestFocus();
                AndroidUtilities.showKeyboard(contactsActivity.Z.r);
                break;
            case 15:
                ((ActionBarPopupWindow$ActionBarPopupWindowLayout) obj).getSwipeBack().b(true);
                break;
            case 16:
                ((ot) obj).a.p();
                break;
            case 17:
                org.telegram.ui.ActionBar.f3[] f3VarArr = (org.telegram.ui.ActionBar.f3[]) obj;
                org.telegram.ui.ActionBar.f3 f3Var = f3VarArr[0];
                if (f3Var != null) {
                    f3Var.dismiss();
                    f3VarArr[0] = null;
                    break;
                }
                break;
            case 18:
                ((AccountInstance) obj).getDownloadController().loadDownloadingFiles();
                break;
            case 19:
                ((org.telegram.ui.Cells.z2) obj).d();
                break;
            case 20:
                ((org.telegram.ui.Cells.wa) obj).b();
                break;
            case 21:
                ((org.telegram.ui.Cells.m) obj).a();
                break;
            case 22:
                uy uyVar = ((sw) obj).B0;
                uyVar.showDialog(new sg.a1((org.telegram.ui.ActionBar.n2) uyVar, 9, true));
                uyVar.z0.setIsEditing(false);
                uyVar.I4(false);
                break;
            case 23:
                uy uyVar2 = ((tw) obj).b;
                uyVar2.z0.setIsEditing(true);
                uyVar2.I4(true);
                break;
            case 24:
                ((uw) obj).a.f0.setAlpha(1.0f);
                break;
            case 25:
                Bundle bundle2 = new Bundle();
                uy uyVar3 = ((iy) obj).a;
                i12 = ((org.telegram.ui.ActionBar.n2) uyVar3).currentAccount;
                bundle2.putLong("user_id", UserConfig.getInstance(i12).getClientUserId());
                bundle2.putBoolean("my_profile", true);
                uyVar3.presentFragment(new ProfileActivity(bundle2, null));
                break;
            case 26:
                ((dz) obj).removeSelfFromStack();
                break;
            case 27:
                gz gzVar = (gz) obj;
                ArrayList arrayList2 = gzVar.x;
                ArrayList arrayList3 = gzVar.w;
                if (gzVar.r != 0) {
                    TLRPC.TL_sendMessageEmojiInteraction tL_sendMessageEmojiInteraction = new TLRPC.TL_sendMessageEmojiInteraction();
                    tL_sendMessageEmojiInteraction.msg_id = gzVar.r;
                    tL_sendMessageEmojiInteraction.emoticon = gzVar.v;
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
                            } catch (JSONException e7) {
                                e = e7;
                                gzVar.r = 0;
                                gzVar.v = null;
                                gzVar.s = 0L;
                                arrayList3.clear();
                                arrayList2.clear();
                                FileLog.e(e);
                                gzVar.y = null;
                                return;
                            }
                        }
                        jSONObject.put("a", jSONArray);
                        tL_sendMessageEmojiInteraction.interaction.data = jSONObject.toString();
                        TLRPC.TL_messages_setTyping tL_messages_setTyping = new TLRPC.TL_messages_setTyping();
                        long j3 = gzVar.J;
                        if (j3 != 0) {
                            tL_messages_setTyping.top_msg_id = (int) j3;
                            tL_messages_setTyping.flags = 1 | tL_messages_setTyping.flags;
                        }
                        tL_messages_setTyping.action = tL_sendMessageEmojiInteraction;
                        tL_messages_setTyping.peer = MessagesController.getInstance(gzVar.b).getInputPeer(gzVar.I);
                        ConnectionsManager.getInstance(gzVar.b).sendRequest(tL_messages_setTyping, null);
                        gzVar.r = 0;
                        gzVar.v = null;
                        gzVar.s = 0L;
                        arrayList3.clear();
                        arrayList2.clear();
                    } catch (JSONException e10) {
                        e = e10;
                    }
                }
                gzVar.y = null;
            case 28:
                ((c00) obj).e0(true);
                break;
            default:
                ((a00) obj).a.getBackground().setState(new int[0]);
                break;
        }
    }
}
