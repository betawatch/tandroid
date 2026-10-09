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

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final /* synthetic */ class cj implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ cj(Object obj, int i10) {
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
                ci.x5 x5Var = (ci.x5) obj;
                i10 = ((org.telegram.ui.ActionBar.n2) ((zn) x5Var.e)).currentAccount;
                NotificationCenter.getInstance(i10).onAnimationFinish(x5Var.b);
                break;
            case 1:
                ej ejVar = (ej) obj;
                i11 = ((org.telegram.ui.ActionBar.n2) ((zn) ejVar.e)).currentAccount;
                NotificationCenter.getInstance(i11).onAnimationFinish(ejVar.c);
                break;
            case 2:
                zn.X1(((wj) obj).x3);
                break;
            case 3:
                ((zj) obj).T.A0.O(false);
                break;
            case 4:
                xi xiVar = (xi) obj;
                zn znVar = xiVar.b;
                if (znVar.e2 != null) {
                    AnimatorSet animatorSet = new AnimatorSet();
                    animatorSet.playTogether(ObjectAnimator.ofFloat(znVar.e2, (Property<org.telegram.ui.Components.z40, Float>) View.ALPHA, 0.0f));
                    animatorSet.addListener(new t4(xiVar, 20));
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
                mm mmVar = ((cm) obj).c.a;
                i12 = ((org.telegram.ui.ActionBar.n2) mmVar.Q).currentAccount;
                bundle.putLong("user_id", UserConfig.getInstance(i12).clientUserId);
                mmVar.Q.presentFragment(new ProfileActivity(bundle, null));
                break;
            case 7:
                ((qm) obj).c.j9(true);
                break;
            case 8:
                ((aj) obj).c(false);
                break;
            case 9:
                zn znVar2 = ((mn) obj).h;
                znVar2.getNotificationCenter().onAnimationFinish(znVar2.I9);
                break;
            case 10:
                zn znVar3 = ((rn) obj).h;
                znVar3.j0.getSearchField().requestFocus();
                AndroidUtilities.showKeyboard(znVar3.j0.getSearchField());
                if (znVar3.pa > 0) {
                    rf rfVar = new rf(znVar3, 7);
                    znVar3.qa = rfVar;
                    AndroidUtilities.runOnUIThread(rfVar, 200L);
                    break;
                }
                break;
            case 11:
                uo uoVar = ((qo) obj).a;
                uoVar.e.setImageDrawable(uoVar.r);
                uoVar.b0.m(R.drawable.msg_addphoto, LocaleController.getString("ChatSetPhotoOrVideo", R.string.ChatSetPhotoOrVideo), true);
                TLRPC.User user = uoVar.D0;
                if (user != null) {
                    user.photo = null;
                    uoVar.getMessagesController().putUser(uoVar.D0, true);
                }
                uoVar.O0 = true;
                if (uoVar.R0 == null) {
                    uoVar.R0 = new org.telegram.ui.Components.ck0(R.raw.camera_outline, AndroidUtilities.dp(50.0f), AndroidUtilities.dp(50.0f), false, null);
                }
                uoVar.b0.e.setTranslationX(-AndroidUtilities.dp(8.0f));
                uoVar.b0.e.setAnimation(uoVar.R0);
                break;
            case 12:
                ((xq) obj).run(0);
                break;
            case 13:
                ((xr) obj).invalidateSelf();
                break;
            case 14:
                fs fsVar = (fs) obj;
                ArrayList arrayList = fsVar.c;
                int size = arrayList.size();
                while (i15 < size) {
                    Object obj2 = arrayList.get(i15);
                    i15++;
                    ((View) obj2).invalidate();
                }
                fsVar.invalidateSelf();
                break;
            case 15:
                ContactsActivity contactsActivity = ((ws) obj).a;
                contactsActivity.Z.r.requestFocus();
                AndroidUtilities.showKeyboard(contactsActivity.Z.r);
                break;
            case 16:
                ((ActionBarPopupWindow$ActionBarPopupWindowLayout) obj).getSwipeBack().b(true);
                break;
            case 17:
                ((nt) obj).a.p();
                break;
            case 18:
                org.telegram.ui.ActionBar.f3[] f3VarArr = (org.telegram.ui.ActionBar.f3[]) obj;
                org.telegram.ui.ActionBar.f3 f3Var = f3VarArr[0];
                if (f3Var != null) {
                    f3Var.dismiss();
                    f3VarArr[0] = null;
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
                ty tyVar = ((qw) obj).B0;
                tyVar.showDialog(new rg.y0((org.telegram.ui.ActionBar.n2) tyVar, 9, true));
                tyVar.z0.setIsEditing(false);
                tyVar.F4(false);
                break;
            case 24:
                ty tyVar2 = ((sw) obj).b;
                tyVar2.z0.setIsEditing(true);
                tyVar2.F4(true);
                break;
            case 25:
                ((tw) obj).a.f0.setAlpha(1.0f);
                break;
            case 26:
                Bundle bundle2 = new Bundle();
                ty tyVar3 = ((hy) obj).a;
                i13 = ((org.telegram.ui.ActionBar.n2) tyVar3).currentAccount;
                bundle2.putLong("user_id", UserConfig.getInstance(i13).getClientUserId());
                bundle2.putBoolean("my_profile", true);
                tyVar3.presentFragment(new ProfileActivity(bundle2, null));
                break;
            case 27:
                ((cz) obj).removeSelfFromStack();
                break;
            case 28:
                fz fzVar = (fz) obj;
                ArrayList arrayList2 = fzVar.x;
                ArrayList arrayList3 = fzVar.w;
                if (fzVar.r != 0) {
                    TLRPC.TL_sendMessageEmojiInteraction tL_sendMessageEmojiInteraction = new TLRPC.TL_sendMessageEmojiInteraction();
                    tL_sendMessageEmojiInteraction.msg_id = fzVar.r;
                    tL_sendMessageEmojiInteraction.emoticon = fzVar.v;
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
                                fzVar.r = 0;
                                fzVar.v = null;
                                fzVar.s = 0L;
                                arrayList3.clear();
                                arrayList2.clear();
                                FileLog.e(e);
                                fzVar.y = null;
                                return;
                            }
                        }
                        jSONObject.put("a", jSONArray);
                        tL_sendMessageEmojiInteraction.interaction.data = jSONObject.toString();
                        TLRPC.TL_messages_setTyping tL_messages_setTyping = new TLRPC.TL_messages_setTyping();
                        long j3 = fzVar.J;
                        if (j3 != 0) {
                            tL_messages_setTyping.top_msg_id = (int) j3;
                            tL_messages_setTyping.flags = 1 | tL_messages_setTyping.flags;
                        }
                        tL_messages_setTyping.action = tL_sendMessageEmojiInteraction;
                        tL_messages_setTyping.peer = MessagesController.getInstance(fzVar.b).getInputPeer(fzVar.I);
                        ConnectionsManager.getInstance(fzVar.b).sendRequest(tL_messages_setTyping, null);
                        fzVar.r = 0;
                        fzVar.v = null;
                        fzVar.s = 0L;
                        arrayList3.clear();
                        arrayList2.clear();
                    } catch (JSONException e10) {
                        e = e10;
                    }
                }
                fzVar.y = null;
            default:
                ((c00) obj).e0(true);
                break;
        }
    }
}
