package ci;

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
import org.telegram.ui.Components.bs;
import org.telegram.ui.Components.cg;
import org.telegram.ui.Components.fo;
import org.telegram.ui.Components.i80;
import org.telegram.ui.Components.qc;
import org.telegram.ui.Components.rl;
import org.telegram.ui.Components.tv0;
import org.telegram.ui.Components.ty;
import org.telegram.ui.Components.xc;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.bd;
import org.telegram.ui.cy;
import org.telegram.ui.jq;
import org.telegram.ui.md;
import org.telegram.ui.qn;
import org.telegram.ui.x51;

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
/* loaded from: classes4.dex */
public final /* synthetic */ class z2 implements Utilities.Callback {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ z2(Object obj, Object obj2, Object obj3, Object obj4, int i10) {
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
                q4 q4Var = ((a3) obj5).a;
                SendMessagesHelper.getInstance(q4Var.C2).sendSticker(tL_document, (String) obj3, q4Var.B1, null, null, q4Var.O1.a, null, null, true, 0, 0, false, this.e, null, l4.longValue(), q4Var.b2.getSendMonoForumPeerId(), q4Var.b2.getSendMessageSuggestionParams());
                q4Var.b2.m(tL_document);
                q4Var.b2.setFieldText("");
                q4Var.k0(l4.longValue() <= 0);
                break;
            case 1:
                v3 v3Var = (v3) obj5;
                n8 n8Var = (n8) obj4;
                aa aaVar = (aa) obj3;
                org.telegram.ui.ActionBar.d6 d6Var = (org.telegram.ui.ActionBar.d6) obj2;
                TL_stories.StoryItem storyItem = (TL_stories.StoryItem) obj;
                if (storyItem == null) {
                    qc Q = new xc(v3Var.z0.c1, d6Var).Q(R.raw.story_bomb2, 36, LocaleController.getString(R.string.StoryNotFound));
                    Q.a = 3;
                    Q.k(true);
                    break;
                } else {
                    org.telegram.ui.ActionBar.n2 R = LaunchActivity.R();
                    if (R != null) {
                        storyItem.dialogId = n8Var.b.longValue();
                        aa createOverlayStoryViewer = R.createOverlayStoryViewer();
                        createOverlayStoryViewer.F(v3Var.getContext(), storyItem, null);
                        createOverlayStoryViewer.o1 = new t3(aaVar, 0);
                        aaVar.P();
                        break;
                    }
                }
                break;
            case 2:
                TL_stories.StoryItem storyItem2 = (TL_stories.StoryItem) obj3;
                org.telegram.ui.ActionBar.d6 d6Var2 = (org.telegram.ui.ActionBar.d6) obj2;
                b7 b7Var = (b7) obj;
                q4 q4Var2 = ((h4) obj5).l;
                if (((HashSet) obj4).contains(Integer.valueOf(b7Var.a))) {
                    q4Var2.S1.c(b7Var.a, q4Var2.B1, storyItem2);
                    formatString = LocaleController.formatString(R.string.StoryAddedToAlbumX, b7Var.b);
                } else {
                    i7 i7Var = q4Var2.S1;
                    long j10 = q4Var2.B1;
                    int i14 = b7Var.a;
                    i7Var.getClass();
                    ArrayList arrayList = new ArrayList(1);
                    arrayList.add(storyItem2);
                    i7Var.c0(i14, j10, arrayList);
                    formatString = LocaleController.formatString(R.string.StoryRemovedFromAlbumX, b7Var.b);
                }
                new xc(q4Var2.c1, d6Var2).Q(R.raw.contact_check, 36, AndroidUtilities.replaceTags(formatString)).j();
                h4 h4Var = q4Var2.t1;
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
                ofFloat.addUpdateListener(new ah.l0(i11, textView, textView2));
                valueAnimatorArr[0].setDuration(320L);
                valueAnimatorArr[0].setInterpolator(bs.h);
                valueAnimatorArr[0].start();
                if (bool.booleanValue()) {
                    AndroidUtilities.runOnUIThread(runnableArr[0], 5320L);
                    break;
                }
                break;
            case 4:
                AndroidUtilities.runOnUIThread(new ai.t0((bd) obj5, (boolean[]) obj4, (int[]) obj3, (int[]) obj2, (TLRPC.TL_error) obj, 23));
                break;
            case 5:
                ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) obj5;
                MessageObject messageObject = (MessageObject) obj4;
                TL_keyboard.TL_buttonTypeRequestPeer tL_buttonTypeRequestPeer = (TL_keyboard.TL_buttonTypeRequestPeer) obj3;
                TLRPC.User user = (TLRPC.User) obj2;
                TLRPC.User user2 = (TLRPC.User) obj;
                int i15 = ChatActivityEnterView.n5;
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
                    qn qnVar = chatActivityEnterView.P2;
                    if (qnVar != null) {
                        qnVar.presentFragment(cgVar);
                        break;
                    }
                }
                break;
            case 6:
                rl.O((rl) obj5, (qn) obj4, (TLRPC.TL_messageMediaGeo) obj3, (org.telegram.ui.ActionBar.d6) obj2, (Long) obj);
                break;
            case 7:
                rl.S((rl) obj5, (qn) obj4, (TLRPC.TL_messageMediaVenue) obj3, (org.telegram.ui.ActionBar.d6) obj2);
                break;
            case 8:
                fo foVar = (fo) obj5;
                qn qnVar2 = (qn) obj4;
                TLRPC.TL_messageMediaPoll tL_messageMediaPoll = (TLRPC.TL_messageMediaPoll) obj3;
                ArrayList arrayList2 = (ArrayList) obj2;
                Long l10 = (Long) obj;
                if (qnVar2.c()) {
                    org.telegram.ui.Components.f5.K(qnVar2.getParentActivity(), qnVar2.a(), new a1.d(foVar, tL_messageMediaPoll, arrayList2, l10, 10));
                    break;
                } else {
                    foVar.j0.d(tL_messageMediaPoll, foVar.O, foVar.l1, arrayList2, true, 0, l10.longValue());
                    foVar.b.dismiss(true);
                    break;
                }
            case 9:
                ty tyVar = (ty) obj5;
                ArrayList arrayList3 = (ArrayList) obj4;
                Runnable runnable = (Runnable) obj2;
                ArrayList arrayList4 = (ArrayList) obj;
                if (((String) obj3).equals(tyVar.v)) {
                    org.telegram.ui.Components.r5.h(tyVar.F.c1).f(arrayList4);
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
                tv0.m((tv0) obj5, (HashSet) obj4, (TL_stories.StoryItem) obj3, (i80) obj2, (b7) obj);
                break;
            case 11:
                cy cyVar = (cy) obj5;
                cyVar.O4(cyVar.getMessagesController().getChat((Long) obj4), (Runnable) obj, new jq(cyVar, (md) obj3, (org.telegram.ui.ActionBar.n2) obj2, i13));
                break;
            case 12:
                x51 x51Var = (x51) obj5;
                String[] strArr = (String[]) obj4;
                String str2 = (String) obj3;
                LinkedHashSet linkedHashSet = (LinkedHashSet) obj2;
                Runnable runnable2 = (Runnable) obj;
                int i16 = x51Var.V;
                if (ConnectionsManager.getInstance(i16).getConnectionState() != 3) {
                    runnable2.run();
                    break;
                } else {
                    if (strArr != null && strArr.length != 0) {
                        str = strArr[0];
                    }
                    MediaDataController.getInstance(i16).searchStickers(true, str, str2, new org.telegram.ui.z(x51Var, linkedHashSet, runnable2, 13));
                    break;
                }
            case 13:
                x51 x51Var2 = (x51) obj5;
                String str3 = (String) obj3;
                ArrayList arrayList5 = (ArrayList) obj4;
                HashMap hashMap = (HashMap) obj2;
                Runnable runnable3 = (Runnable) obj;
                int i17 = x51Var2.V;
                if (x51Var2.W != 4) {
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
                        MediaDataController.getInstance(i17).getEmojiSuggestions(x51.a2, str3, false, new a1.d(allStickers, hashMap, arrayList5, runnable3, 18), false);
                        break;
                    }
                }
                break;
            case 14:
                org.telegram.ui.web.a1 a1Var = (org.telegram.ui.web.a1) obj5;
                z7 z7Var = (z7) obj4;
                String str4 = (String) obj3;
                TL_keyboard.TL_buttonTypeRequestPeer tL_buttonTypeRequestPeer2 = (TL_keyboard.TL_buttonTypeRequestPeer) obj2;
                TLRPC.User user3 = (TLRPC.User) obj;
                if (user3 == null) {
                    a1Var.x(z7Var, "requested_chat_failed", org.telegram.ui.web.a1.A(str4, "req_id"));
                    break;
                } else {
                    TLRPC.TL_messages_sendBotRequestedPeer tL_messages_sendBotRequestedPeer2 = new TLRPC.TL_messages_sendBotRequestedPeer();
                    tL_messages_sendBotRequestedPeer2.peer = MessagesController.getInputPeer(a1Var.U);
                    tL_messages_sendBotRequestedPeer2.webapp_req_id = str4;
                    tL_messages_sendBotRequestedPeer2.button_id = tL_buttonTypeRequestPeer2.button_id;
                    tL_messages_sendBotRequestedPeer2.requested_peers.add(MessagesController.getInputPeer(user3));
                    ConnectionsManager.getInstance(a1Var.M).sendRequestTyped(tL_messages_sendBotRequestedPeer2, new org.telegram.messenger.a(), new ai.w2(a1Var, z7Var, str4, user3, 3));
                    a1Var.x(z7Var, "requested_chat_sent", org.telegram.ui.web.a1.A(str4, "req_id"));
                    break;
                }
            case 15:
                org.telegram.ui.web.a1 a1Var2 = (org.telegram.ui.web.a1) obj5;
                z7 z7Var2 = (z7) obj4;
                String str5 = (String) obj3;
                String str6 = (String) obj2;
                if (((Boolean) obj).booleanValue()) {
                    a1Var2.l0.b(str5, str6);
                    a1Var2.x(z7Var2, "file_download_requested", org.telegram.ui.web.a1.A("downloading", "status"));
                    break;
                } else {
                    a1Var2.x(z7Var2, "file_download_requested", org.telegram.ui.web.a1.A("cancelled", "status"));
                    break;
                }
            case 16:
                org.telegram.ui.ActionBar.n2 n2Var = (org.telegram.ui.ActionBar.n2) obj4;
                String str7 = (String) obj3;
                pf.c cVar = (pf.c) obj2;
                TLRPC.TL_payments_checkedGiftCode tL_payments_checkedGiftCode = (TLRPC.TL_payments_checkedGiftCode) obj;
                if (!((AtomicBoolean) obj5).get() && n2Var.getParentActivity() != null) {
                    if (tL_payments_checkedGiftCode.from_id == null) {
                        TLRPC.TL_premiumGiftOption tL_premiumGiftOption = new TLRPC.TL_premiumGiftOption();
                        tL_premiumGiftOption.months = tL_payments_checkedGiftCode.months;
                        TLRPC.User i22 = n2Var instanceof qn ? ((qn) n2Var).i() : null;
                        if (i22 == null || i22.self) {
                            i22 = new TLRPC.TL_user();
                        }
                        TLRPC.User user4 = i22;
                        boolean z10 = tL_payments_checkedGiftCode.used_date != 0;
                        org.telegram.ui.ActionBar.n2 R2 = LaunchActivity.R();
                        if (R2 != null && ug.f0.S0 == null) {
                            ug.f0 f0Var = new ug.f0(R2, UserConfig.selectedAccount, user4, new sg.k(tL_premiumGiftOption), str7, z10, R2.getResourceProvider());
                            f0Var.show();
                            ug.f0.S0 = f0Var;
                        }
                    } else {
                        n2Var.showDialog(new ug.b0(n2Var, tL_payments_checkedGiftCode, str7));
                    }
                    if (cVar != null) {
                        cVar.b();
                        break;
                    }
                }
                break;
            case 17:
                MessagesController.getInstance(r13.currentAccount).getBoostsController().getBoostsStats(-((TLRPC.Chat) obj4).id, new z2((ug.r0) obj5, (TL_stories.TL_premium_myBoosts) obj, (ArrayList) obj3, (HashSet) obj2, 18));
                break;
            case 18:
                ((ug.r0) obj5).dismiss();
                NotificationCenter.getInstance(UserConfig.selectedAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.boostedChannelByUser, (TL_stories.TL_premium_myBoosts) obj4, Integer.valueOf(((ArrayList) obj3).size()), Integer.valueOf(((HashSet) obj2).size()), (TL_stories.TL_premium_boostsStatus) obj);
                break;
            default:
                yh.o1 o1Var = (yh.o1) obj5;
                Utilities.Callback callback = (Utilities.Callback) obj3;
                yh.a1 a1Var3 = (yh.a1) obj2;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj;
                ((pf.c) obj4).b();
                if (callback != null) {
                    callback.run(Boolean.FALSE);
                }
                o1Var.dismiss();
                if (tL_error != null) {
                    AndroidUtilities.runOnUIThread(new uf.c(16, a1Var3, tL_error));
                    break;
                } else {
                    o1Var.dismiss();
                    break;
                }
        }
    }

    public /* synthetic */ z2(Object obj, String str, ArrayList arrayList, Object obj2, int i10) {
        this.a = i10;
        this.b = obj;
        this.d = str;
        this.c = arrayList;
        this.e = obj2;
    }
}
