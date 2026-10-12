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

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public final /* synthetic */ class gj implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ gj(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10;
        int i11;
        int i12;
        int i13;
        int i14 = this.a;
        int i15 = 0;
        Object obj = this.b;
        switch (i14) {
            case 0:
                di.w5 w5Var = (di.w5) obj;
                i10 = ((org.telegram.ui.ActionBar.m2) ((fo) w5Var.e)).currentAccount;
                NotificationCenter.getInstance(i10).onAnimationFinish(w5Var.b);
                break;
            case 1:
                ij ijVar = (ij) obj;
                i11 = ((org.telegram.ui.ActionBar.m2) ((fo) ijVar.e)).currentAccount;
                NotificationCenter.getInstance(i11).onAnimationFinish(ijVar.c);
                break;
            case 2:
                fo.X1(((ak) obj).x3);
                break;
            case 3:
                ((dk) obj).T.A0.O(false);
                break;
            case 4:
                bj bjVar = (bj) obj;
                fo foVar = bjVar.b;
                if (foVar.e2 != null) {
                    AnimatorSet animatorSet = new AnimatorSet();
                    animatorSet.playTogether(ObjectAnimator.ofFloat(foVar.e2, (Property<org.telegram.ui.Components.v40, Float>) View.ALPHA, 0.0f));
                    animatorSet.addListener(new u0(bjVar, 23));
                    animatorSet.setDuration(300L);
                    animatorSet.start();
                    break;
                }
                break;
            case 5:
                ((MessageObject) obj).settingAvatar = false;
                break;
            case 6:
                Bundle bundle = new Bundle();
                rm rmVar = ((hm) obj).c.a;
                i12 = ((org.telegram.ui.ActionBar.m2) rmVar.Q).currentAccount;
                bundle.putLong("user_id", UserConfig.getInstance(i12).clientUserId);
                rmVar.Q.presentFragment(new ProfileActivity(bundle, null));
                break;
            case 7:
                ((vm) obj).c.j9(true);
                break;
            case 8:
                ((ej) obj).c(false);
                break;
            case 9:
                fo foVar2 = ((rn) obj).h;
                foVar2.getNotificationCenter().onAnimationFinish(foVar2.I9);
                break;
            case 10:
                fo foVar3 = ((wn) obj).h;
                foVar3.j0.getSearchField().requestFocus();
                AndroidUtilities.showKeyboard(foVar3.j0.getSearchField());
                if (foVar3.pa > 0) {
                    wf wfVar = new wf(foVar3, 7);
                    foVar3.qa = wfVar;
                    AndroidUtilities.runOnUIThread(wfVar, 200L);
                    break;
                }
                break;
            case 11:
                zo zoVar = ((wo) obj).a;
                zoVar.e.setImageDrawable(zoVar.r);
                zoVar.b0.m(R.drawable.msg_addphoto, LocaleController.getString("ChatSetPhotoOrVideo", R.string.ChatSetPhotoOrVideo), true);
                TLRPC.User user = zoVar.D0;
                if (user != null) {
                    user.photo = null;
                    zoVar.getMessagesController().putUser(zoVar.D0, true);
                }
                zoVar.O0 = true;
                if (zoVar.R0 == null) {
                    zoVar.R0 = new org.telegram.ui.Components.yj0(R.raw.camera_outline, AndroidUtilities.dp(50.0f), AndroidUtilities.dp(50.0f), false, null);
                }
                zoVar.b0.e.setTranslationX(-AndroidUtilities.dp(8.0f));
                zoVar.b0.e.setAnimation(zoVar.R0);
                break;
            case 12:
                ((dr) obj).run(0);
                break;
            case 13:
                ((cs) obj).invalidateSelf();
                break;
            case 14:
                ls lsVar = (ls) obj;
                ArrayList arrayList = lsVar.c;
                int size = arrayList.size();
                while (i15 < size) {
                    Object obj2 = arrayList.get(i15);
                    i15++;
                    ((View) obj2).invalidate();
                }
                lsVar.invalidateSelf();
                break;
            case 15:
                ContactsActivity contactsActivity = ((ct) obj).a;
                contactsActivity.Z.r.requestFocus();
                AndroidUtilities.showKeyboard(contactsActivity.Z.r);
                break;
            case 16:
                ((ActionBarPopupWindow$ActionBarPopupWindowLayout) obj).getSwipeBack().b(true);
                break;
            case 17:
                ((tt) obj).a.p();
                break;
            case 18:
                org.telegram.ui.ActionBar.e3[] e3VarArr = (org.telegram.ui.ActionBar.e3[]) obj;
                org.telegram.ui.ActionBar.e3 e3Var = e3VarArr[0];
                if (e3Var != null) {
                    e3Var.dismiss();
                    e3VarArr[0] = null;
                    break;
                }
                break;
            case 19:
                ((AccountInstance) obj).getDownloadController().loadDownloadingFiles();
                break;
            case 20:
                ((org.telegram.ui.Cells.a3) obj).d();
                break;
            case 21:
                ((org.telegram.ui.Cells.ua) obj).b();
                break;
            case 22:
                ((org.telegram.ui.Cells.m) obj).a();
                break;
            case 23:
                yy yyVar = ((ww) obj).B0;
                yyVar.showDialog(new sg.y0((org.telegram.ui.ActionBar.m2) yyVar, 9, true));
                yyVar.z0.setIsEditing(false);
                yyVar.F4(false);
                break;
            case 24:
                yy yyVar2 = ((xw) obj).b;
                yyVar2.z0.setIsEditing(true);
                yyVar2.F4(true);
                break;
            case 25:
                ((yw) obj).a.f0.setAlpha(1.0f);
                break;
            case 26:
                Bundle bundle2 = new Bundle();
                yy yyVar3 = ((my) obj).a;
                i13 = ((org.telegram.ui.ActionBar.m2) yyVar3).currentAccount;
                bundle2.putLong("user_id", UserConfig.getInstance(i13).getClientUserId());
                bundle2.putBoolean("my_profile", true);
                yyVar3.presentFragment(new ProfileActivity(bundle2, null));
                break;
            case 27:
                ((hz) obj).removeSelfFromStack();
                break;
            case 28:
                kz kzVar = (kz) obj;
                ArrayList arrayList2 = kzVar.x;
                ArrayList arrayList3 = kzVar.w;
                if (kzVar.r != 0) {
                    TLRPC.TL_sendMessageEmojiInteraction tL_sendMessageEmojiInteraction = new TLRPC.TL_sendMessageEmojiInteraction();
                    tL_sendMessageEmojiInteraction.msg_id = kzVar.r;
                    tL_sendMessageEmojiInteraction.emoticon = kzVar.v;
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
                            } catch (JSONException e) {
                                e = e;
                                kzVar.r = 0;
                                kzVar.v = null;
                                kzVar.s = 0L;
                                arrayList3.clear();
                                arrayList2.clear();
                                FileLog.e(e);
                                kzVar.y = null;
                                return;
                            }
                        }
                        jSONObject.put("a", jSONArray);
                        tL_sendMessageEmojiInteraction.interaction.data = jSONObject.toString();
                        TLRPC.TL_messages_setTyping tL_messages_setTyping = new TLRPC.TL_messages_setTyping();
                        long j10 = kzVar.J;
                        if (j10 != 0) {
                            tL_messages_setTyping.top_msg_id = (int) j10;
                            tL_messages_setTyping.flags = 1 | tL_messages_setTyping.flags;
                        }
                        tL_messages_setTyping.action = tL_sendMessageEmojiInteraction;
                        tL_messages_setTyping.peer = MessagesController.getInstance(kzVar.b).getInputPeer(kzVar.I);
                        ConnectionsManager.getInstance(kzVar.b).sendRequest(tL_messages_setTyping, null);
                        kzVar.r = 0;
                        kzVar.v = null;
                        kzVar.s = 0L;
                        arrayList3.clear();
                        arrayList2.clear();
                    } catch (JSONException e7) {
                        e = e7;
                    }
                }
                kzVar.y = null;
            default:
                ((h00) obj).e0(true);
                break;
        }
    }
}
