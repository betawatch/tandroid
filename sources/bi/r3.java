package bi;

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
import org.telegram.messenger.R;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.ChatActivityEnterView;
import org.telegram.ui.Components.dg;
import org.telegram.ui.Components.gl;
import org.telegram.ui.Components.ky;
import org.telegram.ui.Components.n70;
import org.telegram.ui.Components.pr;
import org.telegram.ui.Components.tn;
import org.telegram.ui.Components.xu0;
import org.telegram.ui.Components.yc;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.bd;
import org.telegram.ui.co;
import org.telegram.ui.gl0;
import org.telegram.ui.j71;
import org.telegram.ui.md;
import org.telegram.ui.uy;
import org.telegram.ui.yq;

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
/* loaded from: classes4.dex */
public final /* synthetic */ class r3 implements Utilities.Callback {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ r3(Object obj, Object obj2, Object obj3, Object obj4, int i10) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
        this.e = obj4;
    }

    /* JADX WARN: Code restructure failed: missing block: B:73:0x01b4, code lost:
    
        if (r12.charAt(r13) <= 57343) goto L77;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x01ce, code lost:
    
        if (r12.charAt(r5) != 9794) goto L79;
     */
    @Override // org.telegram.messenger.Utilities.Callback
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run(Object obj) {
        String formatString;
        int i10 = this.a;
        String str = "";
        int i11 = 3;
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
                o5 o5Var = ((s3) obj5).a;
                SendMessagesHelper.getInstance(o5Var.C2).sendSticker(tL_document, (String) obj3, o5Var.B1, null, null, o5Var.O1.a, null, null, true, 0, 0, false, this.e, null, l4.longValue(), o5Var.b2.getSendMonoForumPeerId(), o5Var.b2.getSendMessageSuggestionParams());
                o5Var.b2.o(tL_document);
                o5Var.b2.setFieldText("");
                o5Var.k0(l4.longValue() <= 0);
                break;
            case 1:
                TL_stories.StoryItem storyItem = (TL_stories.StoryItem) obj3;
                org.telegram.ui.ActionBar.f6 f6Var = (org.telegram.ui.ActionBar.f6) obj2;
                m8 m8Var = (m8) obj;
                o5 o5Var2 = ((f5) obj5).l;
                if (((HashSet) obj4).contains(Integer.valueOf(m8Var.a))) {
                    o5Var2.S1.c(m8Var.a, o5Var2.B1, storyItem);
                    formatString = LocaleController.formatString(R.string.StoryAddedToAlbumX, m8Var.b);
                } else {
                    u8 u8Var = o5Var2.S1;
                    long j3 = o5Var2.B1;
                    int i14 = m8Var.a;
                    u8Var.getClass();
                    ArrayList arrayList = new ArrayList(1);
                    arrayList.add(storyItem);
                    u8Var.c0(i14, j3, arrayList);
                    formatString = LocaleController.formatString(R.string.StoryRemovedFromAlbumX, m8Var.b);
                }
                new yc(o5Var2.c1, f6Var).Q(R.raw.contact_check, 36, AndroidUtilities.replaceTags(formatString)).j();
                f5 f5Var = o5Var2.t1;
                if (f5Var != null) {
                    f5Var.a();
                    break;
                }
                break;
            case 2:
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
                ofFloat.addUpdateListener(new ah.m0(i11, textView, textView2));
                valueAnimatorArr[0].setDuration(320L);
                valueAnimatorArr[0].setInterpolator(pr.h);
                valueAnimatorArr[0].start();
                if (bool.booleanValue()) {
                    AndroidUtilities.runOnUIThread(runnableArr[0], 5320L);
                    break;
                }
                break;
            case 3:
                AndroidUtilities.runOnUIThread(new z2((bd) obj5, (boolean[]) obj4, (int[]) obj3, (int[]) obj2, (TLRPC.TL_error) obj, 15));
                break;
            case 4:
                ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) obj5;
                MessageObject messageObject = (MessageObject) obj4;
                TL_keyboard.TL_buttonTypeRequestPeer tL_buttonTypeRequestPeer = (TL_keyboard.TL_buttonTypeRequestPeer) obj3;
                TLRPC.User user = (TLRPC.User) obj2;
                TLRPC.User user2 = (TLRPC.User) obj;
                int i15 = ChatActivityEnterView.m5;
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
                    dg dgVar = new dg(bundle, user2, user, j10);
                    co coVar = chatActivityEnterView.O2;
                    if (coVar != null) {
                        coVar.presentFragment(dgVar);
                        break;
                    }
                }
                break;
            case 5:
                gl.L((gl) obj5, (co) obj4, (TLRPC.TL_messageMediaGeo) obj3, (org.telegram.ui.ActionBar.f6) obj2, (Long) obj);
                break;
            case 6:
                gl.P((gl) obj5, (co) obj4, (TLRPC.TL_messageMediaVenue) obj3, (org.telegram.ui.ActionBar.f6) obj2);
                break;
            case 7:
                tn tnVar = (tn) obj5;
                co coVar2 = (co) obj4;
                TLRPC.TL_messageMediaPoll tL_messageMediaPoll = (TLRPC.TL_messageMediaPoll) obj3;
                ArrayList arrayList2 = (ArrayList) obj2;
                Long l10 = (Long) obj;
                if (coVar2.c()) {
                    org.telegram.ui.Components.e5.L(coVar2.getParentActivity(), coVar2.a(), new a1.d(tnVar, tL_messageMediaPoll, arrayList2, l10, 8));
                    break;
                } else {
                    tnVar.j0.d(tL_messageMediaPoll, tnVar.O, tnVar.l1, arrayList2, true, 0, l10.longValue());
                    tnVar.b.dismiss(true);
                    break;
                }
            case 8:
                ky kyVar = (ky) obj5;
                ArrayList arrayList3 = (ArrayList) obj4;
                Runnable runnable = (Runnable) obj2;
                ArrayList arrayList4 = (ArrayList) obj;
                if (((String) obj3).equals(kyVar.v)) {
                    org.telegram.ui.Components.q5.h(kyVar.F.c1).f(arrayList4);
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
            case 9:
                xu0.m((xu0) obj5, (HashSet) obj4, (TL_stories.StoryItem) obj3, (n70) obj2, (m8) obj);
                break;
            case 10:
                uy uyVar = (uy) obj5;
                uyVar.Q4(uyVar.getMessagesController().getChat((Long) obj4), (Runnable) obj, new yq(uyVar, (md) obj3, (org.telegram.ui.ActionBar.n2) obj2, i13));
                break;
            case 11:
                j71 j71Var = (j71) obj5;
                String[] strArr = (String[]) obj4;
                String str2 = (String) obj3;
                LinkedHashSet linkedHashSet = (LinkedHashSet) obj2;
                Runnable runnable2 = (Runnable) obj;
                int i16 = j71Var.V;
                if (ConnectionsManager.getInstance(i16).getConnectionState() != 3) {
                    runnable2.run();
                    break;
                } else {
                    if (strArr != null && strArr.length != 0) {
                        str = strArr[0];
                    }
                    MediaDataController.getInstance(i16).searchStickers(true, str, str2, new org.telegram.ui.y(j71Var, linkedHashSet, runnable2, 9));
                    break;
                }
            case 12:
                j71 j71Var2 = (j71) obj5;
                String str3 = (String) obj3;
                ArrayList arrayList5 = (ArrayList) obj4;
                HashMap hashMap = (HashMap) obj2;
                Runnable runnable3 = (Runnable) obj;
                int i17 = j71Var2.V;
                if (j71Var2.W != 4) {
                    runnable3.run();
                    break;
                } else {
                    ArrayList arrayList6 = new ArrayList(0);
                    LongSparseArray longSparseArray = new LongSparseArray(0);
                    HashMap<String, ArrayList<TLRPC.Document>> allStickers = MediaDataController.getInstance(i17).getAllStickers();
                    if (str3.length() <= 14) {
                        int length = str3.length();
                        CharSequence charSequence = str3;
                        int i18 = 0;
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
                        MediaDataController.getInstance(i17).getEmojiSuggestions(j71.a2, str3, false, new a1.d(allStickers, hashMap, arrayList5, runnable3, 16), false);
                        break;
                    }
                }
                break;
            case 13:
                org.telegram.ui.web.d1 d1Var = (org.telegram.ui.web.d1) obj5;
                k9 k9Var = (k9) obj4;
                String str4 = (String) obj3;
                TL_keyboard.TL_buttonTypeRequestPeer tL_buttonTypeRequestPeer2 = (TL_keyboard.TL_buttonTypeRequestPeer) obj2;
                TLRPC.User user3 = (TLRPC.User) obj;
                if (user3 == null) {
                    d1Var.y(k9Var, "requested_chat_failed", org.telegram.ui.web.d1.B(str4, "req_id"));
                    break;
                } else {
                    TLRPC.TL_messages_sendBotRequestedPeer tL_messages_sendBotRequestedPeer2 = new TLRPC.TL_messages_sendBotRequestedPeer();
                    tL_messages_sendBotRequestedPeer2.peer = MessagesController.getInputPeer(d1Var.U);
                    tL_messages_sendBotRequestedPeer2.webapp_req_id = str4;
                    tL_messages_sendBotRequestedPeer2.button_id = tL_buttonTypeRequestPeer2.button_id;
                    tL_messages_sendBotRequestedPeer2.requested_peers.add(MessagesController.getInputPeer(user3));
                    ConnectionsManager.getInstance(d1Var.M).sendRequestTyped(tL_messages_sendBotRequestedPeer2, new org.telegram.messenger.a(), new gl0(d1Var, k9Var, str4, user3, 1));
                    d1Var.y(k9Var, "requested_chat_sent", org.telegram.ui.web.d1.B(str4, "req_id"));
                    break;
                }
            case 14:
                org.telegram.ui.web.d1 d1Var2 = (org.telegram.ui.web.d1) obj5;
                k9 k9Var2 = (k9) obj4;
                String str5 = (String) obj3;
                String str6 = (String) obj2;
                if (((Boolean) obj).booleanValue()) {
                    d1Var2.l0.b(str5, str6);
                    d1Var2.y(k9Var2, "file_download_requested", org.telegram.ui.web.d1.B("downloading", "status"));
                    break;
                } else {
                    d1Var2.y(k9Var2, "file_download_requested", org.telegram.ui.web.d1.B("cancelled", "status"));
                    break;
                }
            case 15:
                org.telegram.ui.ActionBar.n2 n2Var = (org.telegram.ui.ActionBar.n2) obj4;
                String str7 = (String) obj3;
                of.e eVar = (of.e) obj2;
                TLRPC.TL_payments_checkedGiftCode tL_payments_checkedGiftCode = (TLRPC.TL_payments_checkedGiftCode) obj;
                if (!((AtomicBoolean) obj5).get() && n2Var.getParentActivity() != null) {
                    if (tL_payments_checkedGiftCode.from_id == null) {
                        TLRPC.TL_premiumGiftOption tL_premiumGiftOption = new TLRPC.TL_premiumGiftOption();
                        tL_premiumGiftOption.months = tL_payments_checkedGiftCode.months;
                        TLRPC.User i22 = n2Var instanceof co ? ((co) n2Var).i() : null;
                        if (i22 == null || i22.self) {
                            i22 = new TLRPC.TL_user();
                        }
                        TLRPC.User user4 = i22;
                        boolean z10 = tL_payments_checkedGiftCode.used_date != 0;
                        org.telegram.ui.ActionBar.n2 R = LaunchActivity.R();
                        if (R != null && ug.h0.S0 == null) {
                            ug.h0 h0Var = new ug.h0(R, UserConfig.selectedAccount, user4, new sg.k(tL_premiumGiftOption), str7, z10, R.getResourceProvider());
                            h0Var.show();
                            ug.h0.S0 = h0Var;
                        }
                    } else {
                        n2Var.showDialog(new ug.d0(n2Var, tL_payments_checkedGiftCode, str7));
                    }
                    if (eVar != null) {
                        eVar.b();
                        break;
                    }
                }
                break;
            case 16:
                MessagesController.getInstance(r11.currentAccount).getBoostsController().getBoostsStats(-((TLRPC.Chat) obj4).id, new n4((ug.t0) obj5, (TL_stories.TL_premium_myBoosts) obj, (ArrayList) obj3, (HashSet) obj2, 1));
                break;
            default:
                yh.p1 p1Var = (yh.p1) obj5;
                Utilities.Callback callback = (Utilities.Callback) obj3;
                yh.b1 b1Var = (yh.b1) obj2;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj;
                ((of.e) obj4).b();
                if (callback != null) {
                    callback.run(Boolean.FALSE);
                }
                p1Var.dismiss();
                if (tL_error != null) {
                    AndroidUtilities.runOnUIThread(new ug.r(10, b1Var, tL_error));
                    break;
                } else {
                    p1Var.dismiss();
                    break;
                }
        }
    }

    public /* synthetic */ r3(Object obj, String str, ArrayList arrayList, Object obj2, int i10) {
        this.a = i10;
        this.b = obj;
        this.d = str;
        this.c = arrayList;
        this.e = obj2;
    }
}
