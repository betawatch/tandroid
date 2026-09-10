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

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final /* synthetic */ class fj implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ fj(Object obj, int i10) {
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
                gj gjVar = (gj) obj;
                i10 = ((org.telegram.ui.ActionBar.p2) ((eo) gjVar.e)).currentAccount;
                NotificationCenter.getInstance(i10).onAnimationFinish(gjVar.c);
                break;
            case 1:
                eo.X1(((wj) obj).y3);
                break;
            case 2:
                ((zj) obj).T.A0.O(false);
                break;
            case 3:
                zi ziVar = (zi) obj;
                eo eoVar = ziVar.b;
                if (eoVar.e2 != null) {
                    AnimatorSet animatorSet = new AnimatorSet();
                    animatorSet.playTogether(ObjectAnimator.ofFloat(eoVar.e2, (Property<org.telegram.ui.Components.s40, Float>) View.ALPHA, 0.0f));
                    animatorSet.addListener(new org.telegram.ui.Cells.v5(ziVar, i14));
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
                pm pmVar = ((fm) obj).c.a;
                i11 = ((org.telegram.ui.ActionBar.p2) pmVar.Q).currentAccount;
                bundle.putLong("user_id", UserConfig.getInstance(i11).clientUserId);
                pmVar.Q.presentFragment(new ProfileActivity(bundle, null));
                break;
            case 6:
                ((tm) obj).c.e9(true);
                break;
            case 7:
                ((cj) obj).c(false);
                break;
            case 8:
                eo eoVar2 = ((qn) obj).h;
                eoVar2.getNotificationCenter().onAnimationFinish(eoVar2.I9);
                break;
            case 9:
                eo eoVar3 = ((vn) obj).h;
                eoVar3.j0.getSearchField().requestFocus();
                AndroidUtilities.showKeyboard(eoVar3.j0.getSearchField());
                if (eoVar3.pa > 0) {
                    sf sfVar = new sf(eoVar3, i14);
                    eoVar3.qa = sfVar;
                    AndroidUtilities.runOnUIThread(sfVar, 200L);
                    break;
                }
                break;
            case 10:
                yo yoVar = ((uo) obj).a;
                yoVar.e.setImageDrawable(yoVar.r);
                yoVar.b0.m(R.drawable.msg_addphoto, LocaleController.getString("ChatSetPhotoOrVideo", R.string.ChatSetPhotoOrVideo), true);
                TLRPC.User user = yoVar.D0;
                if (user != null) {
                    user.photo = null;
                    yoVar.getMessagesController().putUser(yoVar.D0, true);
                }
                yoVar.O0 = true;
                if (yoVar.R0 == null) {
                    yoVar.R0 = new org.telegram.ui.Components.hj0(R.raw.camera_outline, AndroidUtilities.dp(50.0f), AndroidUtilities.dp(50.0f), false, null);
                }
                yoVar.b0.e.setTranslationX(-AndroidUtilities.dp(8.0f));
                yoVar.b0.e.setAnimation(yoVar.R0);
                break;
            case 11:
                ((br) obj).run(0);
                break;
            case 12:
                ((as) obj).invalidateSelf();
                break;
            case 13:
                is isVar = (is) obj;
                ArrayList arrayList = isVar.c;
                int size = arrayList.size();
                while (i15 < size) {
                    Object obj2 = arrayList.get(i15);
                    i15++;
                    ((View) obj2).invalidate();
                }
                isVar.invalidateSelf();
                break;
            case 14:
                ContactsActivity contactsActivity = ((zs) obj).a;
                contactsActivity.Z.r.requestFocus();
                AndroidUtilities.showKeyboard(contactsActivity.Z.r);
                break;
            case 15:
                ((ActionBarPopupWindow$ActionBarPopupWindowLayout) obj).getSwipeBack().b(true);
                break;
            case 16:
                ((pt) obj).a.p();
                break;
            case 17:
                org.telegram.ui.ActionBar.h3[] h3VarArr = (org.telegram.ui.ActionBar.h3[]) obj;
                org.telegram.ui.ActionBar.h3 h3Var = h3VarArr[0];
                if (h3Var != null) {
                    h3Var.dismiss();
                    h3VarArr[0] = null;
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
                wy wyVar = ((uw) obj).B0;
                wyVar.showDialog(new qg.a1((org.telegram.ui.ActionBar.p2) wyVar, 9, true));
                wyVar.z0.setIsEditing(false);
                wyVar.I4(false);
                break;
            case 23:
                wy wyVar2 = ((vw) obj).b;
                wyVar2.z0.setIsEditing(true);
                wyVar2.I4(true);
                break;
            case 24:
                ((ww) obj).a.f0.setAlpha(1.0f);
                break;
            case 25:
                Bundle bundle2 = new Bundle();
                wy wyVar3 = ((ky) obj).a;
                i12 = ((org.telegram.ui.ActionBar.p2) wyVar3).currentAccount;
                bundle2.putLong("user_id", UserConfig.getInstance(i12).getClientUserId());
                bundle2.putBoolean("my_profile", true);
                wyVar3.presentFragment(new ProfileActivity(bundle2, null));
                break;
            case 26:
                ((fz) obj).removeSelfFromStack();
                break;
            case 27:
                iz izVar = (iz) obj;
                ArrayList arrayList2 = izVar.x;
                ArrayList arrayList3 = izVar.w;
                if (izVar.r != 0) {
                    TLRPC.TL_sendMessageEmojiInteraction tL_sendMessageEmojiInteraction = new TLRPC.TL_sendMessageEmojiInteraction();
                    tL_sendMessageEmojiInteraction.msg_id = izVar.r;
                    tL_sendMessageEmojiInteraction.emoticon = izVar.v;
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
                                izVar.r = 0;
                                izVar.v = null;
                                izVar.s = 0L;
                                arrayList3.clear();
                                arrayList2.clear();
                                FileLog.e(e);
                                izVar.y = null;
                                return;
                            }
                        }
                        jSONObject.put("a", jSONArray);
                        tL_sendMessageEmojiInteraction.interaction.data = jSONObject.toString();
                        TLRPC.TL_messages_setTyping tL_messages_setTyping = new TLRPC.TL_messages_setTyping();
                        long j3 = izVar.J;
                        if (j3 != 0) {
                            tL_messages_setTyping.top_msg_id = (int) j3;
                            tL_messages_setTyping.flags = 1 | tL_messages_setTyping.flags;
                        }
                        tL_messages_setTyping.action = tL_sendMessageEmojiInteraction;
                        tL_messages_setTyping.peer = MessagesController.getInstance(izVar.b).getInputPeer(izVar.I);
                        ConnectionsManager.getInstance(izVar.b).sendRequest(tL_messages_setTyping, null);
                        izVar.r = 0;
                        izVar.v = null;
                        izVar.s = 0L;
                        arrayList3.clear();
                        arrayList2.clear();
                    } catch (JSONException e7) {
                        e = e7;
                    }
                }
                izVar.y = null;
            case 28:
                ((e00) obj).e0(true);
                break;
            default:
                ((c00) obj).a.getBackground().setState(new int[0]);
                break;
        }
    }
}
