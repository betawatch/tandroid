package di;

import android.animation.ValueAnimator;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.LongSparseArray;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.concurrent.atomic.AtomicBoolean;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.ChatActivityEnterView;
import org.telegram.ui.Components.aw0;
import org.telegram.ui.Components.cg;
import org.telegram.ui.Components.ds;
import org.telegram.ui.Components.go;
import org.telegram.ui.Components.k80;
import org.telegram.ui.Components.qc;
import org.telegram.ui.Components.sl;
import org.telegram.ui.Components.sy;
import org.telegram.ui.Components.wc;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.bd;
import org.telegram.ui.c61;
import org.telegram.ui.cy;
import org.telegram.ui.nd;
import org.telegram.ui.nq;
import org.telegram.ui.un;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes4.dex */
public final /* synthetic */ class y2 implements Utilities.Callback {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ y2(Object obj, Object obj2, Object obj3, Object obj4, int i10) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
        this.e = obj4;
    }

    /* JADX WARN: Code restructure failed: missing block: B:74:0x01eb, code lost:
    
        if (r11.charAt(r13) <= 57343) goto L78;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x0205, code lost:
    
        if (r11.charAt(r13) != 9794) goto L80;
     */
    @Override // org.telegram.messenger.Utilities.Callback
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run(Object obj) {
        String formatString;
        int i10 = this.a;
        String str = "";
        int i11 = 4;
        int i12 = 0;
        int i13 = 1;
        Object obj2 = this.e;
        Object obj3 = this.d;
        Object obj4 = this.c;
        Object obj5 = this.b;
        switch (i10) {
            case 0:
                TLRPC.TL_document tL_document = (TLRPC.TL_document) obj4;
                Long l4 = (Long) obj;
                q4 q4Var = ((z2) obj5).a;
                SendMessagesHelper.getInstance(q4Var.r2).sendSticker(tL_document, (String) obj3, q4Var.q1, null, null, q4Var.D1.a, null, null, true, 0, 0, false, this.e, null, l4.longValue(), q4Var.Q1.getSendMonoForumPeerId(), q4Var.Q1.getSendMessageSuggestionParams());
                q4Var.Q1.l(tL_document);
                q4Var.Q1.setFieldText("");
                q4Var.i0(l4.longValue() <= 0);
                break;
            case 1:
                u3 u3Var = (u3) obj5;
                k8 k8Var = (k8) obj4;
                y9 y9Var = (y9) obj3;
                org.telegram.ui.ActionBar.u6 u6Var = (org.telegram.ui.ActionBar.u6) obj2;
                TL_stories.StoryItem storyItem = (TL_stories.StoryItem) obj;
                if (storyItem == null) {
                    qc R = new wc(u3Var.z0.R0, u6Var).R(R.raw.story_bomb2, 36, LocaleController.getString(R.string.StoryNotFound));
                    R.a = 3;
                    R.k(true);
                    break;
                } else {
                    org.telegram.ui.ActionBar.r2 R2 = LaunchActivity.R();
                    if (R2 != null) {
                        storyItem.dialogId = k8Var.b.longValue();
                        y9 createOverlayStoryViewer = R2.createOverlayStoryViewer();
                        createOverlayStoryViewer.F(u3Var.getContext(), storyItem, null);
                        createOverlayStoryViewer.o1 = new s3(y9Var, 0);
                        y9Var.P();
                        break;
                    }
                }
                break;
            case 2:
                TL_stories.StoryItem storyItem2 = (TL_stories.StoryItem) obj3;
                org.telegram.ui.ActionBar.u6 u6Var2 = (org.telegram.ui.ActionBar.u6) obj2;
                a7 a7Var = (a7) obj;
                q4 q4Var2 = ((h4) obj5).l;
                if (((HashSet) obj4).contains(Integer.valueOf(a7Var.a))) {
                    q4Var2.H1.c(a7Var.a, q4Var2.q1, storyItem2);
                    formatString = LocaleController.formatString(R.string.StoryAddedToAlbumX, a7Var.b);
                } else {
                    h7 h7Var = q4Var2.H1;
                    long j10 = q4Var2.q1;
                    int i14 = a7Var.a;
                    h7Var.getClass();
                    ArrayList arrayList = new ArrayList(1);
                    arrayList.add(storyItem2);
                    h7Var.c0(i14, j10, arrayList);
                    formatString = LocaleController.formatString(R.string.StoryRemovedFromAlbumX, a7Var.b);
                }
                new wc(q4Var2.R0, u6Var2).R(R.raw.contact_check, 36, AndroidUtilities.replaceTags(formatString)).j();
                h4 h4Var = q4Var2.i1;
                if (h4Var != null) {
                    h4Var.a();
                    break;
                }
                break;
            case 3:
                Runnable[] runnableArr = (Runnable[]) obj5;
                ValueAnimator[] valueAnimatorArr = (ValueAnimator[]) obj4;
                TextView textView = (TextView) obj3;
                TextView textView2 = (TextView) obj2;
                Boolean bool = (Boolean) obj;
                AndroidUtilities.cancelRunOnUIThread(runnableArr[0]);
                ValueAnimator valueAnimator = valueAnimatorArr[0];
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                }
                ValueAnimator ofFloat = ValueAnimator.ofFloat(textView.getAlpha(), bool.booleanValue() ? 1.0f : 0.0f);
                valueAnimatorArr[0] = ofFloat;
                ofFloat.addUpdateListener(new bh.b0(i11, textView, textView2));
                valueAnimatorArr[0].setDuration(320L);
                valueAnimatorArr[0].setInterpolator(ds.h);
                valueAnimatorArr[0].start();
                if (bool.booleanValue()) {
                    AndroidUtilities.runOnUIThread(runnableArr[0], 5320L);
                    break;
                }
                break;
            case 4:
                AndroidUtilities.runOnUIThread(new bi.u0((bd) obj5, (boolean[]) obj4, (int[]) obj3, (int[]) obj2, (TLRPC.TL_error) obj, 23));
                break;
            case 5:
                ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) obj5;
                MessageObject messageObject = (MessageObject) obj4;
                TL_keyboard.TL_buttonTypeRequestPeer tL_buttonTypeRequestPeer = (TL_keyboard.TL_buttonTypeRequestPeer) obj3;
                TLRPC.User user = (TLRPC.User) obj2;
                TLRPC.User user2 = (TLRPC.User) obj;
                int i15 = ChatActivityEnterView.r5;
                if (user2 != null) {
                    TLRPC.TL_messages_sendBotRequestedPeer tL_messages_sendBotRequestedPeer = new TLRPC.TL_messages_sendBotRequestedPeer();
                    tL_messages_sendBotRequestedPeer.peer = MessagesController.getInstance(chatActivityEnterView.Q).getInputPeer(messageObject.messageOwner.peer_id);
                    tL_messages_sendBotRequestedPeer.flags |= 1;
                    tL_messages_sendBotRequestedPeer.msg_id = messageObject.getId();
                    tL_messages_sendBotRequestedPeer.button_id = tL_buttonTypeRequestPeer.button_id;
                    tL_messages_sendBotRequestedPeer.requested_peers.add(MessagesController.getInputPeer(user2));
                    ConnectionsManager.getInstance(chatActivityEnterView.Q).sendRequest(tL_messages_sendBotRequestedPeer, null);
                    long j11 = user.id;
                    Bundle bundle = new Bundle();
                    bundle.putLong("user_id", user2.id);
                    cg cgVar = new cg(bundle, user2, user, j11);
                    un unVar = chatActivityEnterView.P2;
                    if (unVar != null) {
                        unVar.presentFragment(cgVar);
                        break;
                    }
                }
                break;
            case 6:
                sl.O((sl) obj5, (un) obj4, (TLRPC.TL_messageMediaGeo) obj3, (org.telegram.ui.ActionBar.u6) obj2, (Long) obj);
                break;
            case 7:
                sl.S((sl) obj5, (un) obj4, (TLRPC.TL_messageMediaVenue) obj3, (org.telegram.ui.ActionBar.u6) obj2);
                break;
            case 8:
                go goVar = (go) obj5;
                un unVar2 = (un) obj4;
                TLRPC.TL_messageMediaPoll tL_messageMediaPoll = (TLRPC.TL_messageMediaPoll) obj3;
                ArrayList arrayList2 = (ArrayList) obj2;
                Long l10 = (Long) obj;
                if (unVar2.c()) {
                    org.telegram.ui.Components.g5.K(unVar2.getParentActivity(), unVar2.a(), new a1.d(goVar, tL_messageMediaPoll, arrayList2, l10, 10));
                    break;
                } else {
                    goVar.j0.e(tL_messageMediaPoll, goVar.O, goVar.m1, arrayList2, true, 0, l10.longValue());
                    goVar.b.dismiss(true);
                    break;
                }
            case 9:
                sy syVar = (sy) obj5;
                ArrayList arrayList3 = (ArrayList) obj4;
                Runnable runnable = (Runnable) obj2;
                ArrayList arrayList4 = (ArrayList) obj;
                if (((String) obj3).equals(syVar.v)) {
                    org.telegram.ui.Components.t5.h(syVar.F.c1).f(arrayList4);
                    int size = arrayList4.size();
                    while (i12 < size) {
                        Object obj6 = arrayList4.get(i12);
                        i12++;
                        MediaDataController.KeywordResult keywordResult = new MediaDataController.KeywordResult();
                        keywordResult.emoji = "animated_" + ((TLRPC.Document) obj6).id;
                        keywordResult.keyword = null;
                        arrayList3.add(keywordResult);
                    }
                    runnable.run();
                    break;
                }
                break;
            case 10:
                aw0.p((aw0) obj5, (HashSet) obj4, (TL_stories.StoryItem) obj3, (k80) obj2, (a7) obj);
                break;
            case 11:
                cy cyVar = (cy) obj5;
                cyVar.Y4(cyVar.getMessagesController().getChat((Long) obj4), (Runnable) obj, new nq(cyVar, (nd) obj3, (org.telegram.ui.ActionBar.r2) obj2, i13));
                break;
            case 12:
                c61 c61Var = (c61) obj5;
                String[] strArr = (String[]) obj4;
                String str2 = (String) obj3;
                LinkedHashSet linkedHashSet = (LinkedHashSet) obj2;
                Runnable runnable2 = (Runnable) obj;
                int i16 = c61Var.V;
                if (ConnectionsManager.getInstance(i16).getConnectionState() != 3) {
                    runnable2.run();
                    break;
                } else {
                    if (strArr != null && strArr.length != 0) {
                        str = strArr[0];
                    }
                    MediaDataController.getInstance(i16).searchStickers(true, str, str2, new org.telegram.ui.y(c61Var, linkedHashSet, runnable2, 13));
                    break;
                }
            case 13:
                c61 c61Var2 = (c61) obj5;
                String str3 = (String) obj3;
                ArrayList arrayList5 = (ArrayList) obj4;
                HashMap hashMap = (HashMap) obj2;
                Runnable runnable3 = (Runnable) obj;
                int i17 = c61Var2.V;
                if (c61Var2.W != 4) {
                    runnable3.run();
                    break;
                } else {
                    ArrayList arrayList6 = new ArrayList(0);
                    LongSparseArray longSparseArray = new LongSparseArray(0);
                    HashMap<String, ArrayList<TLRPC.Document>> allStickers = MediaDataController.getInstance(i17).getAllStickers();
                    if (str3.length() <= 14) {
                        int length = str3.length();
                        int i18 = 0;
                        CharSequence charSequence = str3;
                        while (i18 < length) {
                            if (i18 < length - 1) {
                                if (charSequence.charAt(i18) == 55356) {
                                    int i19 = i18 + 1;
                                    if (charSequence.charAt(i19) >= 57339) {
                                        break;
                                    }
                                }
                                if (charSequence.charAt(i18) == 8205) {
                                    int i20 = i18 + 1;
                                    if (charSequence.charAt(i20) != 9792) {
                                        break;
                                    }
                                    charSequence = TextUtils.concat(charSequence.subSequence(0, i18), charSequence.subSequence(i18 + 2, charSequence.length()));
                                    length -= 2;
                                    i18--;
                                    i18++;
                                }
                            }
                            if (charSequence.charAt(i18) == 65039) {
                                charSequence = TextUtils.concat(charSequence.subSequence(0, i18), charSequence.subSequence(i18 + 1, charSequence.length()));
                                length--;
                                i18--;
                                i18++;
                            } else {
                                i18++;
                            }
                        }
                        ArrayList<TLRPC.Document> arrayList7 = allStickers != null ? allStickers.get(charSequence.toString()) : null;
                        if (arrayList7 != null && !arrayList7.isEmpty()) {
                            arrayList6.addAll(arrayList7);
                            int size2 = arrayList7.size();
                            for (int i21 = 0; i21 < size2; i21++) {
                                TLRPC.Document document = arrayList7.get(i21);
                                longSparseArray.put(document.id, document);
                            }
                            arrayList5.add(arrayList6);
                        }
                    }
                    if (allStickers != null && !allStickers.isEmpty() && str3.length() > 1) {
                        MediaDataController.getInstance(i17).getEmojiSuggestions(c61.b2, str3, false, new a1.d(allStickers, hashMap, arrayList5, runnable3, 18), false);
                        break;
                    }
                }
                break;
            case 14:
                org.telegram.ui.web.a1 a1Var = (org.telegram.ui.web.a1) obj5;
                x7 x7Var = (x7) obj4;
                String str4 = (String) obj3;
                TL_keyboard.TL_buttonTypeRequestPeer tL_buttonTypeRequestPeer2 = (TL_keyboard.TL_buttonTypeRequestPeer) obj2;
                TLRPC.User user3 = (TLRPC.User) obj;
                if (user3 == null) {
                    a1Var.x(x7Var, "requested_chat_failed", org.telegram.ui.web.a1.A(str4, "req_id"));
                    break;
                } else {
                    TLRPC.TL_messages_sendBotRequestedPeer tL_messages_sendBotRequestedPeer2 = new TLRPC.TL_messages_sendBotRequestedPeer();
                    tL_messages_sendBotRequestedPeer2.peer = MessagesController.getInputPeer(a1Var.U);
                    tL_messages_sendBotRequestedPeer2.webapp_req_id = str4;
                    tL_messages_sendBotRequestedPeer2.button_id = tL_buttonTypeRequestPeer2.button_id;
                    tL_messages_sendBotRequestedPeer2.requested_peers.add(MessagesController.getInputPeer(user3));
                    ConnectionsManager.getInstance(a1Var.M).sendRequestTyped(tL_messages_sendBotRequestedPeer2, new org.telegram.messenger.a(), new bi.s2(a1Var, x7Var, str4, user3, 3));
                    a1Var.x(x7Var, "requested_chat_sent", org.telegram.ui.web.a1.A(str4, "req_id"));
                    break;
                }
            case 15:
                org.telegram.ui.web.a1 a1Var2 = (org.telegram.ui.web.a1) obj5;
                x7 x7Var2 = (x7) obj4;
                String str5 = (String) obj3;
                String str6 = (String) obj2;
                if (((Boolean) obj).booleanValue()) {
                    a1Var2.l0.b(str5, str6);
                    a1Var2.x(x7Var2, "file_download_requested", org.telegram.ui.web.a1.A("downloading", "status"));
                    break;
                } else {
                    a1Var2.x(x7Var2, "file_download_requested", org.telegram.ui.web.a1.A("cancelled", "status"));
                    break;
                }
            case 16:
                org.telegram.ui.ActionBar.r2 r2Var = (org.telegram.ui.ActionBar.r2) obj4;
                String str7 = (String) obj3;
                qf.c cVar = (qf.c) obj2;
                TLRPC.TL_payments_checkedGiftCode tL_payments_checkedGiftCode = (TLRPC.TL_payments_checkedGiftCode) obj;
                if (!((AtomicBoolean) obj5).get() && r2Var.getParentActivity() != null) {
                    if (tL_payments_checkedGiftCode.from_id == null) {
                        TLRPC.TL_premiumGiftOption tL_premiumGiftOption = new TLRPC.TL_premiumGiftOption();
                        tL_premiumGiftOption.months = tL_payments_checkedGiftCode.months;
                        TLRPC.User i22 = r2Var instanceof un ? ((un) r2Var).i() : null;
                        if (i22 == null || i22.self) {
                            i22 = new TLRPC.TL_user();
                        }
                        TLRPC.User user4 = i22;
                        boolean z10 = tL_payments_checkedGiftCode.used_date != 0;
                        org.telegram.ui.ActionBar.r2 R3 = LaunchActivity.R();
                        if (R3 != null && vg.g0.S0 == null) {
                            vg.g0 g0Var = new vg.g0(R3, UserConfig.selectedAccount, user4, new tg.k(tL_premiumGiftOption), str7, z10, R3.getResourceProvider());
                            g0Var.show();
                            vg.g0.S0 = g0Var;
                        }
                    } else {
                        r2Var.showDialog(new vg.c0(r2Var, tL_payments_checkedGiftCode, str7));
                    }
                    if (cVar != null) {
                        cVar.b();
                        break;
                    }
                }
                break;
            case 17:
                MessagesController.getInstance(r13.currentAccount).getBoostsController().getBoostsStats(-((TLRPC.Chat) obj4).id, new y2((vg.s0) obj5, (TL_stories.TL_premium_myBoosts) obj, (ArrayList) obj3, (HashSet) obj2, 18));
                break;
            case 18:
                ((vg.s0) obj5).dismiss();
                NotificationCenter.getInstance(UserConfig.selectedAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.boostedChannelByUser, (TL_stories.TL_premium_myBoosts) obj4, Integer.valueOf(((ArrayList) obj3).size()), Integer.valueOf(((HashSet) obj2).size()), (TL_stories.TL_premium_boostsStatus) obj);
                break;
            default:
                zh.p1 p1Var = (zh.p1) obj5;
                Utilities.Callback callback = (Utilities.Callback) obj3;
                zh.a1 a1Var3 = (zh.a1) obj2;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj;
                ((qf.c) obj4).b();
                if (callback != null) {
                    callback.run(Boolean.FALSE);
                }
                p1Var.dismiss();
                if (tL_error != null) {
                    AndroidUtilities.runOnUIThread(new vi.i0(9, a1Var3, tL_error));
                    break;
                } else {
                    p1Var.dismiss();
                    break;
                }
        }
    }

    public /* synthetic */ y2(Object obj, String str, ArrayList arrayList, Object obj2, int i10) {
        this.a = i10;
        this.b = obj;
        this.d = str;
        this.c = arrayList;
        this.e = obj2;
    }
}
