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

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes3.dex */
public final /* synthetic */ class aj implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ aj(Object obj, int i10) {
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
                bj bjVar = (bj) obj;
                i10 = ((org.telegram.ui.ActionBar.n2) ((xn) bjVar.e)).currentAccount;
                NotificationCenter.getInstance(i10).onAnimationFinish(bjVar.c);
                break;
            case 1:
                xn.X1(((rj) obj).z3);
                break;
            case 2:
                ((uj) obj).T.A0.O(false);
                break;
            case 3:
                ui uiVar = (ui) obj;
                xn xnVar = uiVar.b;
                if (xnVar.e2 != null) {
                    AnimatorSet animatorSet = new AnimatorSet();
                    animatorSet.playTogether(ObjectAnimator.ofFloat(xnVar.e2, (Property<org.telegram.ui.Components.j40, Float>) View.ALPHA, 0.0f));
                    animatorSet.addListener(new u4(uiVar, 19));
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
                km kmVar = ((am) obj).c.a;
                i11 = ((org.telegram.ui.ActionBar.n2) kmVar.Q).currentAccount;
                bundle.putLong("user_id", UserConfig.getInstance(i11).clientUserId);
                kmVar.Q.presentFragment(new ProfileActivity(bundle, null));
                break;
            case 6:
                ((om) obj).c.e9(true);
                break;
            case 7:
                ((xi) obj).c(false);
                break;
            case 8:
                xn xnVar2 = ((kn) obj).h;
                xnVar2.getNotificationCenter().onAnimationFinish(xnVar2.I9);
                break;
            case 9:
                xn xnVar3 = ((pn) obj).h;
                xnVar3.j0.getSearchField().requestFocus();
                AndroidUtilities.showKeyboard(xnVar3.j0.getSearchField());
                if (xnVar3.pa > 0) {
                    pf pfVar = new pf(xnVar3, i14);
                    xnVar3.qa = pfVar;
                    AndroidUtilities.runOnUIThread(pfVar, 200L);
                    break;
                }
                break;
            case 10:
                so soVar = ((oo) obj).a;
                soVar.e.setImageDrawable(soVar.r);
                soVar.b0.m(R.drawable.msg_addphoto, LocaleController.getString("ChatSetPhotoOrVideo", R.string.ChatSetPhotoOrVideo), true);
                TLRPC.User user = soVar.D0;
                if (user != null) {
                    user.photo = null;
                    soVar.getMessagesController().putUser(soVar.D0, true);
                }
                soVar.O0 = true;
                if (soVar.R0 == null) {
                    soVar.R0 = new org.telegram.ui.Components.yi0(R.raw.camera_outline, AndroidUtilities.dp(50.0f), AndroidUtilities.dp(50.0f), false, null);
                }
                soVar.b0.e.setTranslationX(-AndroidUtilities.dp(8.0f));
                soVar.b0.e.setAnimation(soVar.R0);
                break;
            case 11:
                ((vq) obj).run(0);
                break;
            case 12:
                ((ur) obj).invalidateSelf();
                break;
            case 13:
                cs csVar = (cs) obj;
                ArrayList arrayList = csVar.c;
                int size = arrayList.size();
                while (i15 < size) {
                    Object obj2 = arrayList.get(i15);
                    i15++;
                    ((View) obj2).invalidate();
                }
                csVar.invalidateSelf();
                break;
            case 14:
                ContactsActivity contactsActivity = ((us) obj).a;
                contactsActivity.Z.r.requestFocus();
                AndroidUtilities.showKeyboard(contactsActivity.Z.r);
                break;
            case 15:
                ((ActionBarPopupWindow$ActionBarPopupWindowLayout) obj).getSwipeBack().b(true);
                break;
            case 16:
                ((lt) obj).a.p();
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
                ((org.telegram.ui.Cells.ya) obj).b();
                break;
            case 21:
                ((org.telegram.ui.Cells.m) obj).a();
                break;
            case 22:
                ry ryVar = ((pw) obj).B0;
                ryVar.showDialog(new rg.x0((org.telegram.ui.ActionBar.n2) ryVar, 9, true));
                ryVar.z0.setIsEditing(false);
                ryVar.I4(false);
                break;
            case 23:
                ry ryVar2 = ((qw) obj).b;
                ryVar2.z0.setIsEditing(true);
                ryVar2.I4(true);
                break;
            case 24:
                ((rw) obj).a.f0.setAlpha(1.0f);
                break;
            case 25:
                Bundle bundle2 = new Bundle();
                ry ryVar3 = ((fy) obj).a;
                i12 = ((org.telegram.ui.ActionBar.n2) ryVar3).currentAccount;
                bundle2.putLong("user_id", UserConfig.getInstance(i12).getClientUserId());
                bundle2.putBoolean("my_profile", true);
                ryVar3.presentFragment(new ProfileActivity(bundle2, null));
                break;
            case 26:
                ((az) obj).removeSelfFromStack();
                break;
            case 27:
                dz dzVar = (dz) obj;
                ArrayList arrayList2 = dzVar.x;
                ArrayList arrayList3 = dzVar.w;
                if (dzVar.r != 0) {
                    TLRPC.TL_sendMessageEmojiInteraction tL_sendMessageEmojiInteraction = new TLRPC.TL_sendMessageEmojiInteraction();
                    tL_sendMessageEmojiInteraction.msg_id = dzVar.r;
                    tL_sendMessageEmojiInteraction.emoticon = dzVar.v;
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
                                dzVar.r = 0;
                                dzVar.v = null;
                                dzVar.s = 0L;
                                arrayList3.clear();
                                arrayList2.clear();
                                FileLog.e(e);
                                dzVar.y = null;
                                return;
                            }
                        }
                        jSONObject.put("a", jSONArray);
                        tL_sendMessageEmojiInteraction.interaction.data = jSONObject.toString();
                        TLRPC.TL_messages_setTyping tL_messages_setTyping = new TLRPC.TL_messages_setTyping();
                        long j3 = dzVar.J;
                        if (j3 != 0) {
                            tL_messages_setTyping.top_msg_id = (int) j3;
                            tL_messages_setTyping.flags = 1 | tL_messages_setTyping.flags;
                        }
                        tL_messages_setTyping.action = tL_sendMessageEmojiInteraction;
                        tL_messages_setTyping.peer = MessagesController.getInstance(dzVar.b).getInputPeer(dzVar.I);
                        ConnectionsManager.getInstance(dzVar.b).sendRequest(tL_messages_setTyping, null);
                        dzVar.r = 0;
                        dzVar.v = null;
                        dzVar.s = 0L;
                        arrayList3.clear();
                        arrayList2.clear();
                    } catch (JSONException e7) {
                        e = e7;
                    }
                }
                dzVar.y = null;
            case 28:
                ((zz) obj).e0(true);
                break;
            default:
                ((xz) obj).a.getBackground().setState(new int[0]);
                break;
        }
    }
}
