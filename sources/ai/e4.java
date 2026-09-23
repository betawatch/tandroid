package ai;

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
import org.telegram.ui.Components.cg;
import org.telegram.ui.Components.hl;
import org.telegram.ui.Components.ky;
import org.telegram.ui.Components.o70;
import org.telegram.ui.Components.rr;
import org.telegram.ui.Components.vn;
import org.telegram.ui.Components.xc;
import org.telegram.ui.Components.yu0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ad;
import org.telegram.ui.ld;
import org.telegram.ui.ry;
import org.telegram.ui.tq;
import org.telegram.ui.xk0;
import org.telegram.ui.xn;
import org.telegram.ui.z61;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes4.dex */
public final /* synthetic */ class e4 implements Utilities.Callback {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ e4(Object obj, Object obj2, Object obj3, Object obj4, int i10) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
        this.e = obj4;
    }

    /* JADX WARN: Code restructure failed: missing block: B:74:0x01e9, code lost:
    
        if (r11.charAt(r13) <= 57343) goto L78;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x0203, code lost:
    
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
        int i12 = 2;
        int i13 = 0;
        int i14 = 1;
        Object obj2 = this.e;
        Object obj3 = this.d;
        Object obj4 = this.c;
        Object obj5 = this.b;
        switch (i10) {
            case 0:
                TLRPC.TL_document tL_document = (TLRPC.TL_document) obj4;
                Long l4 = (Long) obj;
                e6 e6Var = ((f4) obj5).a;
                SendMessagesHelper.getInstance(e6Var.C2).sendSticker(tL_document, (String) obj3, e6Var.B1, null, null, e6Var.O1.a, null, null, true, 0, 0, false, this.e, null, l4.longValue(), e6Var.b2.getSendMonoForumPeerId(), e6Var.b2.getSendMessageSuggestionParams());
                e6Var.b2.p(tL_document);
                e6Var.b2.setFieldText("");
                e6Var.k0(l4.longValue() <= 0);
                break;
            case 1:
                g5 g5Var = (g5) obj5;
                sa saVar = (sa) obj4;
                jc jcVar = (jc) obj3;
                org.telegram.ui.ActionBar.d6 d6Var = (org.telegram.ui.ActionBar.d6) obj2;
                TL_stories.StoryItem storyItem = (TL_stories.StoryItem) obj;
                if (storyItem == null) {
                    org.telegram.ui.Components.qc Q = new xc(g5Var.z0.c1, d6Var).Q(R.raw.story_bomb2, 36, LocaleController.getString(R.string.StoryNotFound));
                    Q.a = 3;
                    Q.k(true);
                    break;
                } else {
                    org.telegram.ui.ActionBar.n2 R = LaunchActivity.R();
                    if (R != null) {
                        storyItem.dialogId = saVar.b.longValue();
                        jc createOverlayStoryViewer = R.createOverlayStoryViewer();
                        createOverlayStoryViewer.F(g5Var.getContext(), storyItem, null);
                        createOverlayStoryViewer.o1 = new d5(jcVar, 0);
                        jcVar.P();
                        break;
                    }
                }
                break;
            case 2:
                TL_stories.StoryItem storyItem2 = (TL_stories.StoryItem) obj3;
                org.telegram.ui.ActionBar.d6 d6Var2 = (org.telegram.ui.ActionBar.d6) obj2;
                e9 e9Var = (e9) obj;
                e6 e6Var2 = ((v5) obj5).l;
                if (((HashSet) obj4).contains(Integer.valueOf(e9Var.a))) {
                    e6Var2.S1.c(e9Var.a, e6Var2.B1, storyItem2);
                    formatString = LocaleController.formatString(R.string.StoryAddedToAlbumX, e9Var.b);
                } else {
                    l9 l9Var = e6Var2.S1;
                    long j3 = e6Var2.B1;
                    int i15 = e9Var.a;
                    l9Var.getClass();
                    ArrayList arrayList = new ArrayList(1);
                    arrayList.add(storyItem2);
                    l9Var.c0(i15, j3, arrayList);
                    formatString = LocaleController.formatString(R.string.StoryRemovedFromAlbumX, e9Var.b);
                }
                new xc(e6Var2.c1, d6Var2).Q(R.raw.contact_check, 36, AndroidUtilities.replaceTags(formatString)).j();
                v5 v5Var = e6Var2.t1;
                if (v5Var != null) {
                    v5Var.a();
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
                ofFloat.addUpdateListener(new x(i12, textView, textView2));
                valueAnimatorArr[0].setDuration(320L);
                valueAnimatorArr[0].setInterpolator(rr.h);
                valueAnimatorArr[0].start();
                if (bool.booleanValue()) {
                    AndroidUtilities.runOnUIThread(runnableArr[0], 5320L);
                    break;
                }
                break;
            case 4:
                AndroidUtilities.runOnUIThread(new m3((ad) obj5, (boolean[]) obj4, (int[]) obj3, (int[]) obj2, (TLRPC.TL_error) obj, 15));
                break;
            case 5:
                ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) obj5;
                MessageObject messageObject = (MessageObject) obj4;
                TL_keyboard.TL_buttonTypeRequestPeer tL_buttonTypeRequestPeer = (TL_keyboard.TL_buttonTypeRequestPeer) obj3;
                TLRPC.User user = (TLRPC.User) obj2;
                TLRPC.User user2 = (TLRPC.User) obj;
                int i16 = ChatActivityEnterView.n5;
                if (user2 != null) {
                    TLRPC.TL_messages_sendBotRequestedPeer tL_messages_sendBotRequestedPeer = new TLRPC.TL_messages_sendBotRequestedPeer();
                    tL_messages_sendBotRequestedPeer.peer = MessagesController.getInstance(chatActivityEnterView.Q).getInputPeer(messageObject.messageOwner.peer_id);
                    tL_messages_sendBotRequestedPeer.flags |= 1;
                    tL_messages_sendBotRequestedPeer.msg_id = messageObject.getId();
                    tL_messages_sendBotRequestedPeer.button_id = tL_buttonTypeRequestPeer.button_id;
                    tL_messages_sendBotRequestedPeer.requested_peers.add(MessagesController.getInputPeer(user2));
                    ConnectionsManager.getInstance(chatActivityEnterView.Q).sendRequest(tL_messages_sendBotRequestedPeer, null);
                    long j10 = user.id;
                    Bundle bundle = new Bundle();
                    bundle.putLong("user_id", user2.id);
                    cg cgVar = new cg(bundle, user2, user, j10);
                    xn xnVar = chatActivityEnterView.O2;
                    if (xnVar != null) {
                        xnVar.presentFragment(cgVar);
                        break;
                    }
                }
                break;
            case 6:
                hl.L((hl) obj5, (xn) obj4, (TLRPC.TL_messageMediaGeo) obj3, (org.telegram.ui.ActionBar.d6) obj2, (Long) obj);
                break;
            case 7:
                hl.P((hl) obj5, (xn) obj4, (TLRPC.TL_messageMediaVenue) obj3, (org.telegram.ui.ActionBar.d6) obj2);
                break;
            case 8:
                vn vnVar = (vn) obj5;
                xn xnVar2 = (xn) obj4;
                TLRPC.TL_messageMediaPoll tL_messageMediaPoll = (TLRPC.TL_messageMediaPoll) obj3;
                ArrayList arrayList2 = (ArrayList) obj2;
                Long l10 = (Long) obj;
                if (xnVar2.c()) {
                    org.telegram.ui.Components.e5.L(xnVar2.getParentActivity(), xnVar2.a(), new a1.d(vnVar, tL_messageMediaPoll, arrayList2, l10, 8));
                    break;
                } else {
                    vnVar.j0.e(tL_messageMediaPoll, vnVar.O, vnVar.l1, arrayList2, true, 0, l10.longValue());
                    vnVar.b.dismiss(true);
                    break;
                }
            case 9:
                ky kyVar = (ky) obj5;
                ArrayList arrayList3 = (ArrayList) obj4;
                Runnable runnable = (Runnable) obj2;
                ArrayList arrayList4 = (ArrayList) obj;
                if (((String) obj3).equals(kyVar.v)) {
                    org.telegram.ui.Components.q5.h(kyVar.F.c1).f(arrayList4);
                    int size = arrayList4.size();
                    while (i13 < size) {
                        Object obj6 = arrayList4.get(i13);
                        i13++;
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
                yu0.m((yu0) obj5, (HashSet) obj4, (TL_stories.StoryItem) obj3, (o70) obj2, (e9) obj);
                break;
            case 11:
                ry ryVar = (ry) obj5;
                ryVar.Q4(ryVar.getMessagesController().getChat((Long) obj4), (Runnable) obj, new tq(ryVar, (ld) obj3, (org.telegram.ui.ActionBar.n2) obj2, i14));
                break;
            case 12:
                z61 z61Var = (z61) obj5;
                String[] strArr = (String[]) obj4;
                String str2 = (String) obj3;
                LinkedHashSet linkedHashSet = (LinkedHashSet) obj2;
                Runnable runnable2 = (Runnable) obj;
                int i17 = z61Var.V;
                if (ConnectionsManager.getInstance(i17).getConnectionState() != 3) {
                    runnable2.run();
                    break;
                } else {
                    if (strArr != null && strArr.length != 0) {
                        str = strArr[0];
                    }
                    MediaDataController.getInstance(i17).searchStickers(true, str, str2, new org.telegram.ui.z(z61Var, linkedHashSet, runnable2, 13));
                    break;
                }
            case 13:
                z61 z61Var2 = (z61) obj5;
                String str3 = (String) obj3;
                ArrayList arrayList5 = (ArrayList) obj4;
                HashMap hashMap = (HashMap) obj2;
                Runnable runnable3 = (Runnable) obj;
                int i18 = z61Var2.V;
                if (z61Var2.W != 4) {
                    runnable3.run();
                    break;
                } else {
                    ArrayList arrayList6 = new ArrayList(0);
                    LongSparseArray longSparseArray = new LongSparseArray(0);
                    HashMap<String, ArrayList<TLRPC.Document>> allStickers = MediaDataController.getInstance(i18).getAllStickers();
                    if (str3.length() <= 14) {
                        int length = str3.length();
                        CharSequence charSequence = str3;
                        int i19 = 0;
                        while (i19 < length) {
                            if (i19 < length - 1) {
                                if (charSequence.charAt(i19) == 55356) {
                                    int i20 = i19 + 1;
                                    if (charSequence.charAt(i20) >= 57339) {
                                        break;
                                    }
                                }
                                if (charSequence.charAt(i19) == 8205) {
                                    int i21 = i19 + 1;
                                    if (charSequence.charAt(i21) != 9792) {
                                        break;
                                    }
                                    charSequence = TextUtils.concat(charSequence.subSequence(0, i19), charSequence.subSequence(i19 + 2, charSequence.length()));
                                    length -= 2;
                                    i19--;
                                    i19++;
                                }
                            }
                            if (charSequence.charAt(i19) == 65039) {
                                charSequence = TextUtils.concat(charSequence.subSequence(0, i19), charSequence.subSequence(i19 + 1, charSequence.length()));
                                length--;
                                i19--;
                                i19++;
                            } else {
                                i19++;
                            }
                        }
                        ArrayList<TLRPC.Document> arrayList7 = allStickers != null ? allStickers.get(charSequence.toString()) : null;
                        if (arrayList7 != null && !arrayList7.isEmpty()) {
                            arrayList6.addAll(arrayList7);
                            int size2 = arrayList7.size();
                            for (int i22 = 0; i22 < size2; i22++) {
                                TLRPC.Document document = arrayList7.get(i22);
                                longSparseArray.put(document.id, document);
                            }
                            arrayList5.add(arrayList6);
                        }
                    }
                    if (allStickers != null && !allStickers.isEmpty() && str3.length() > 1) {
                        MediaDataController.getInstance(i18).getEmojiSuggestions(z61.a2, str3, false, new a1.d(allStickers, hashMap, arrayList5, runnable3, 16), false);
                        break;
                    }
                }
                break;
            case 14:
                org.telegram.ui.web.b1 b1Var = (org.telegram.ui.web.b1) obj5;
                da daVar = (da) obj4;
                String str4 = (String) obj3;
                TL_keyboard.TL_buttonTypeRequestPeer tL_buttonTypeRequestPeer2 = (TL_keyboard.TL_buttonTypeRequestPeer) obj2;
                TLRPC.User user3 = (TLRPC.User) obj;
                if (user3 == null) {
                    b1Var.y(daVar, "requested_chat_failed", org.telegram.ui.web.b1.B(str4, "req_id"));
                    break;
                } else {
                    TLRPC.TL_messages_sendBotRequestedPeer tL_messages_sendBotRequestedPeer2 = new TLRPC.TL_messages_sendBotRequestedPeer();
                    tL_messages_sendBotRequestedPeer2.peer = MessagesController.getInputPeer(b1Var.U);
                    tL_messages_sendBotRequestedPeer2.webapp_req_id = str4;
                    tL_messages_sendBotRequestedPeer2.button_id = tL_buttonTypeRequestPeer2.button_id;
                    tL_messages_sendBotRequestedPeer2.requested_peers.add(MessagesController.getInputPeer(user3));
                    ConnectionsManager.getInstance(b1Var.M).sendRequestTyped(tL_messages_sendBotRequestedPeer2, new org.telegram.messenger.a(), new xk0(b1Var, daVar, str4, user3, 1));
                    b1Var.y(daVar, "requested_chat_sent", org.telegram.ui.web.b1.B(str4, "req_id"));
                    break;
                }
            case 15:
                org.telegram.ui.web.b1 b1Var2 = (org.telegram.ui.web.b1) obj5;
                da daVar2 = (da) obj4;
                String str5 = (String) obj3;
                String str6 = (String) obj2;
                if (((Boolean) obj).booleanValue()) {
                    b1Var2.l0.b(str5, str6);
                    b1Var2.y(daVar2, "file_download_requested", org.telegram.ui.web.b1.B("downloading", "status"));
                    break;
                } else {
                    b1Var2.y(daVar2, "file_download_requested", org.telegram.ui.web.b1.B("cancelled", "status"));
                    break;
                }
            case 16:
                org.telegram.ui.ActionBar.n2 n2Var = (org.telegram.ui.ActionBar.n2) obj4;
                String str7 = (String) obj3;
                nf.e eVar = (nf.e) obj2;
                TLRPC.TL_payments_checkedGiftCode tL_payments_checkedGiftCode = (TLRPC.TL_payments_checkedGiftCode) obj;
                if (!((AtomicBoolean) obj5).get() && n2Var.getParentActivity() != null) {
                    if (tL_payments_checkedGiftCode.from_id == null) {
                        TLRPC.TL_premiumGiftOption tL_premiumGiftOption = new TLRPC.TL_premiumGiftOption();
                        tL_premiumGiftOption.months = tL_payments_checkedGiftCode.months;
                        TLRPC.User i23 = n2Var instanceof xn ? ((xn) n2Var).i() : null;
                        if (i23 == null || i23.self) {
                            i23 = new TLRPC.TL_user();
                        }
                        TLRPC.User user4 = i23;
                        boolean z10 = tL_payments_checkedGiftCode.used_date != 0;
                        org.telegram.ui.ActionBar.n2 R2 = LaunchActivity.R();
                        if (R2 != null && tg.h0.S0 == null) {
                            tg.h0 h0Var = new tg.h0(R2, UserConfig.selectedAccount, user4, new rg.k(tL_premiumGiftOption), str7, z10, R2.getResourceProvider());
                            h0Var.show();
                            tg.h0.S0 = h0Var;
                        }
                    } else {
                        n2Var.showDialog(new tg.d0(n2Var, tL_payments_checkedGiftCode, str7));
                    }
                    if (eVar != null) {
                        eVar.b();
                        break;
                    }
                }
                break;
            case 17:
                MessagesController.getInstance(r13.currentAccount).getBoostsController().getBoostsStats(-((TLRPC.Chat) obj4).id, new e4((tg.t0) obj5, (TL_stories.TL_premium_myBoosts) obj, (ArrayList) obj3, (HashSet) obj2, 18));
                break;
            case 18:
                ((tg.t0) obj5).dismiss();
                NotificationCenter.getInstance(UserConfig.selectedAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.boostedChannelByUser, (TL_stories.TL_premium_myBoosts) obj4, Integer.valueOf(((ArrayList) obj3).size()), Integer.valueOf(((HashSet) obj2).size()), (TL_stories.TL_premium_boostsStatus) obj);
                break;
            default:
                xh.r1 r1Var = (xh.r1) obj5;
                Utilities.Callback callback = (Utilities.Callback) obj3;
                xh.c1 c1Var = (xh.c1) obj2;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj;
                ((nf.e) obj4).b();
                if (callback != null) {
                    callback.run(Boolean.FALSE);
                }
                r1Var.dismiss();
                if (tL_error != null) {
                    AndroidUtilities.runOnUIThread(new uh.i(i11, c1Var, tL_error));
                    break;
                } else {
                    r1Var.dismiss();
                    break;
                }
        }
    }

    public /* synthetic */ e4(Object obj, String str, ArrayList arrayList, Object obj2, int i10) {
        this.a = i10;
        this.b = obj;
        this.d = str;
        this.c = arrayList;
        this.e = obj2;
    }
}
