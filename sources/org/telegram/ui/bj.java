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

/* compiled from: r8-map-id-995671d6bce0aaeb91824b65f2f1988c5410eae59f1d5d7c368a0027313cc0ad */
/* loaded from: classes3.dex */
public final /* synthetic */ class bj implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ bj(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10;
        int i11;
        int i12;
        int i13 = this.a;
        int i14 = 0;
        Object obj = this.b;
        switch (i13) {
            case 0:
                cj cjVar = (cj) obj;
                i10 = ((org.telegram.ui.ActionBar.n2) ((yn) cjVar.e)).currentAccount;
                NotificationCenter.getInstance(i10).onAnimationFinish(cjVar.c);
                break;
            case 1:
                yn.X1(((sj) obj).G3);
                break;
            case 2:
                ((vj) obj).T.y0.O(false);
                break;
            case 3:
                vi viVar = (vi) obj;
                yn ynVar = viVar.b;
                if (ynVar.c2 != null) {
                    AnimatorSet animatorSet = new AnimatorSet();
                    animatorSet.playTogether(ObjectAnimator.ofFloat(ynVar.c2, (Property<org.telegram.ui.Components.m40, Float>) View.ALPHA, 0.0f));
                    animatorSet.addListener(new u4(viVar, 19));
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
                jm jmVar = ((zl) obj).c.a;
                i11 = ((org.telegram.ui.ActionBar.n2) jmVar.Q).currentAccount;
                bundle.putLong("user_id", UserConfig.getInstance(i11).clientUserId);
                jmVar.Q.presentFragment(new ProfileActivity(bundle, null));
                break;
            case 6:
                ((nm) obj).c.f9(true);
                break;
            case 7:
                ((yi) obj).c(false);
                break;
            case 8:
                yn ynVar2 = ((ln) obj).h;
                ynVar2.getNotificationCenter().onAnimationFinish(ynVar2.G9);
                break;
            case 9:
                yn ynVar3 = ((qn) obj).h;
                ynVar3.h0.getSearchField().requestFocus();
                AndroidUtilities.showKeyboard(ynVar3.h0.getSearchField());
                if (ynVar3.na > 0) {
                    yf yfVar = new yf(ynVar3, 6);
                    ynVar3.oa = yfVar;
                    AndroidUtilities.runOnUIThread(yfVar, 200L);
                    break;
                }
                break;
            case 10:
                to toVar = ((po) obj).a;
                toVar.e.setImageDrawable(toVar.r);
                toVar.b0.m(R.drawable.msg_addphoto, LocaleController.getString("ChatSetPhotoOrVideo", R.string.ChatSetPhotoOrVideo), true);
                TLRPC.User user = toVar.D0;
                if (user != null) {
                    user.photo = null;
                    toVar.getMessagesController().putUser(toVar.D0, true);
                }
                toVar.O0 = true;
                if (toVar.R0 == null) {
                    toVar.R0 = new org.telegram.ui.Components.kj0(R.raw.camera_outline, AndroidUtilities.dp(50.0f), AndroidUtilities.dp(50.0f), false, null);
                }
                toVar.b0.e.setTranslationX(-AndroidUtilities.dp(8.0f));
                toVar.b0.e.setAnimation(toVar.R0);
                break;
            case 11:
                ((wq) obj).run(0);
                break;
            case 12:
                ((xr) obj).invalidateSelf();
                break;
            case 13:
                fs fsVar = (fs) obj;
                ArrayList arrayList = fsVar.c;
                int size = arrayList.size();
                while (i14 < size) {
                    Object obj2 = arrayList.get(i14);
                    i14++;
                    ((View) obj2).invalidate();
                }
                fsVar.invalidateSelf();
                break;
            case 14:
                ContactsActivity contactsActivity = ((ws) obj).a;
                contactsActivity.Z.r.requestFocus();
                AndroidUtilities.showKeyboard(contactsActivity.Z.r);
                break;
            case 15:
                ((ActionBarPopupWindow$ActionBarPopupWindowLayout) obj).getSwipeBack().b(true);
                break;
            case 16:
                ((nt) obj).a.p();
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
                ((org.telegram.ui.Cells.a3) obj).d();
                break;
            case 20:
                ((org.telegram.ui.Cells.wa) obj).b();
                break;
            case 21:
                ((org.telegram.ui.Cells.m) obj).a();
                break;
            case 22:
                ((sw) obj).a.f0.setAlpha(1.0f);
                break;
            case 23:
                Bundle bundle2 = new Bundle();
                uy uyVar = ((hy) obj).a;
                i12 = ((org.telegram.ui.ActionBar.n2) uyVar).currentAccount;
                bundle2.putLong("user_id", UserConfig.getInstance(i12).getClientUserId());
                bundle2.putBoolean("my_profile", true);
                uyVar.presentFragment(new ProfileActivity(bundle2, null));
                break;
            case 24:
                uy uyVar2 = ((ky) obj).B0;
                uyVar2.showDialog(new rg.y0((org.telegram.ui.ActionBar.n2) uyVar2, 9, true));
                uyVar2.z0.setIsEditing(false);
                uyVar2.R4(false);
                break;
            case 25:
                uy uyVar3 = ((ly) obj).b;
                uyVar3.z0.setIsEditing(true);
                uyVar3.R4(true);
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
                        for (int i15 = 0; i15 < arrayList3.size(); i15++) {
                            try {
                                JSONObject jSONObject2 = new JSONObject();
                                jSONObject2.put("i", ((Integer) arrayList2.get(i15)).intValue() + 1);
                                jSONObject2.put("t", ((Long) arrayList3.get(i15)).longValue() / 1000.0f);
                                jSONArray.put(i15, jSONObject2);
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
