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

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
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
        int i14 = 9;
        int i15 = 0;
        Object obj = this.b;
        switch (i13) {
            case 0:
                cj cjVar = (cj) obj;
                i10 = ((org.telegram.ui.ActionBar.p2) ((zn) cjVar.e)).currentAccount;
                NotificationCenter.getInstance(i10).onAnimationFinish(cjVar.c);
                break;
            case 1:
                zn.X1(((sj) obj).v3);
                break;
            case 2:
                ((vj) obj).T.x0.O(false);
                break;
            case 3:
                vi viVar = (vi) obj;
                zn znVar = viVar.b;
                if (znVar.b2 != null) {
                    AnimatorSet animatorSet = new AnimatorSet();
                    animatorSet.playTogether(ObjectAnimator.ofFloat(znVar.b2, (Property<org.telegram.ui.Components.l40, Float>) View.ALPHA, 0.0f));
                    animatorSet.addListener(new u5(viVar, 18));
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
                lm lmVar = ((cm) obj).c.a;
                i11 = ((org.telegram.ui.ActionBar.p2) lmVar.N).currentAccount;
                bundle.putLong("user_id", UserConfig.getInstance(i11).clientUserId);
                lmVar.N.presentFragment(new ProfileActivity(bundle, null));
                break;
            case 6:
                ((pm) obj).c.e9(true);
                break;
            case 7:
                ((yi) obj).c(false);
                break;
            case 8:
                zn znVar2 = ((mn) obj).h;
                znVar2.getNotificationCenter().onAnimationFinish(znVar2.F9);
                break;
            case 9:
                zn znVar3 = ((rn) obj).h;
                znVar3.g0.getSearchField().requestFocus();
                AndroidUtilities.showKeyboard(znVar3.g0.getSearchField());
                if (znVar3.ma > 0) {
                    nf nfVar = new nf(znVar3, i14);
                    znVar3.na = nfVar;
                    AndroidUtilities.runOnUIThread(nfVar, 200L);
                    break;
                }
                break;
            case 10:
                ro roVar = ((po) obj).a;
                roVar.e.setImageDrawable(roVar.r);
                roVar.Y.m(R.drawable.msg_addphoto, LocaleController.getString("ChatSetPhotoOrVideo", R.string.ChatSetPhotoOrVideo), true);
                TLRPC.User user = roVar.A0;
                if (user != null) {
                    user.photo = null;
                    roVar.getMessagesController().putUser(roVar.A0, true);
                }
                roVar.L0 = true;
                if (roVar.O0 == null) {
                    roVar.O0 = new org.telegram.ui.Components.gj0(R.raw.camera_outline, AndroidUtilities.dp(50.0f), AndroidUtilities.dp(50.0f), false, null);
                }
                roVar.Y.e.setTranslationX(-AndroidUtilities.dp(8.0f));
                roVar.Y.e.setAnimation(roVar.O0);
                break;
            case 11:
                ((vq) obj).run(0);
                break;
            case 12:
                ((vr) obj).invalidateSelf();
                break;
            case 13:
                es esVar = (es) obj;
                ArrayList arrayList = esVar.c;
                int size = arrayList.size();
                while (i15 < size) {
                    Object obj2 = arrayList.get(i15);
                    i15++;
                    ((View) obj2).invalidate();
                }
                esVar.invalidateSelf();
                break;
            case 14:
                ContactsActivity contactsActivity = ((ws) obj).a;
                contactsActivity.W.r.requestFocus();
                AndroidUtilities.showKeyboard(contactsActivity.W.r);
                break;
            case 15:
                ((ActionBarPopupWindow$ActionBarPopupWindowLayout) obj).getSwipeBack().b(true);
                break;
            case 16:
                ((nt) obj).a.p();
                break;
            case 17:
                org.telegram.ui.ActionBar.g3[] g3VarArr = (org.telegram.ui.ActionBar.g3[]) obj;
                org.telegram.ui.ActionBar.g3 g3Var = g3VarArr[0];
                if (g3Var != null) {
                    g3Var.dismiss();
                    g3VarArr[0] = null;
                    break;
                }
                break;
            case 18:
                ((AccountInstance) obj).getDownloadController().loadDownloadingFiles();
                break;
            case 19:
                ((org.telegram.ui.Cells.y2) obj).d();
                break;
            case 20:
                ((org.telegram.ui.Cells.ra) obj).b();
                break;
            case 21:
                ((org.telegram.ui.Cells.m) obj).a();
                break;
            case 22:
                qy qyVar = ((pw) obj).y0;
                qyVar.showDialog(new eg.o1((org.telegram.ui.ActionBar.p2) qyVar, 9, true));
                qyVar.w0.setIsEditing(false);
                qyVar.I4(false);
                break;
            case 23:
                qy qyVar2 = ((qw) obj).b;
                qyVar2.w0.setIsEditing(true);
                qyVar2.I4(true);
                break;
            case 24:
                ((rw) obj).a.c0.setAlpha(1.0f);
                break;
            case 25:
                Bundle bundle2 = new Bundle();
                qy qyVar3 = ((ey) obj).a;
                i12 = ((org.telegram.ui.ActionBar.p2) qyVar3).currentAccount;
                bundle2.putLong("user_id", UserConfig.getInstance(i12).getClientUserId());
                bundle2.putBoolean("my_profile", true);
                qyVar3.presentFragment(new ProfileActivity(bundle2, null));
                break;
            case 26:
                ((zy) obj).removeSelfFromStack();
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
                        long j10 = dzVar.G;
                        if (j10 != 0) {
                            tL_messages_setTyping.top_msg_id = (int) j10;
                            tL_messages_setTyping.flags = 1 | tL_messages_setTyping.flags;
                        }
                        tL_messages_setTyping.action = tL_sendMessageEmojiInteraction;
                        tL_messages_setTyping.peer = MessagesController.getInstance(dzVar.b).getInputPeer(dzVar.F);
                        ConnectionsManager.getInstance(dzVar.b).sendRequest(tL_messages_setTyping, null);
                        dzVar.r = 0;
                        dzVar.v = null;
                        dzVar.s = 0L;
                        arrayList3.clear();
                        arrayList2.clear();
                    } catch (JSONException e6) {
                        e = e6;
                    }
                }
                dzVar.y = null;
            case 28:
                ((a00) obj).e0(true);
                break;
            default:
                ((yz) obj).a.getBackground().setState(new int[0]);
                break;
        }
    }
}
