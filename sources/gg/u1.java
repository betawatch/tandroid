package gg;

import android.animation.ValueAnimator;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.LongSparseArray;
import android.widget.TextView;
import bi.ya;
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
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.p2;
import org.telegram.ui.Components.ChatActivityEnterView;
import org.telegram.ui.Components.d5;
import org.telegram.ui.Components.eg;
import org.telegram.ui.Components.iv0;
import org.telegram.ui.Components.ll;
import org.telegram.ui.Components.p5;
import org.telegram.ui.Components.ry;
import org.telegram.ui.Components.w70;
import org.telegram.ui.Components.wc;
import org.telegram.ui.Components.wr;
import org.telegram.ui.Components.zn;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.cd;
import org.telegram.ui.eo;
import org.telegram.ui.fl0;
import org.telegram.ui.l71;
import org.telegram.ui.nd;
import org.telegram.ui.wy;
import org.telegram.ui.zq;
import zh.a3;
import zh.b5;
import zh.i5;
import zh.v2;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final /* synthetic */ class u1 implements Utilities.Callback {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ u1(Object obj, Object obj2, Object obj3, Object obj4, int i10) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
        this.e = obj4;
    }

    /* JADX WARN: Code restructure failed: missing block: B:87:0x027b, code lost:
    
        if (r11.charAt(r12) <= 57343) goto L90;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x0295, code lost:
    
        if (r11.charAt(r4) != 9794) goto L92;
     */
    @Override // org.telegram.messenger.Utilities.Callback
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run(Object obj) {
        String formatString;
        int i10 = this.a;
        String str = "";
        int i11 = 0;
        int i12 = 1;
        Object obj2 = this.e;
        Object obj3 = this.d;
        Object obj4 = this.c;
        Object obj5 = this.b;
        switch (i10) {
            case 0:
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
                ofFloat.addUpdateListener(new t1(i11, textView, textView2));
                valueAnimatorArr[0].setDuration(320L);
                valueAnimatorArr[0].setInterpolator(wr.h);
                valueAnimatorArr[0].start();
                if (bool.booleanValue()) {
                    AndroidUtilities.runOnUIThread(runnableArr[0], 5320L);
                    break;
                }
                break;
            case 1:
                AndroidUtilities.runOnUIThread(new ya((cd) obj5, (boolean[]) obj4, (int[]) obj3, (int[]) obj2, (TLRPC.TL_error) obj, 11));
                break;
            case 2:
                ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) obj5;
                MessageObject messageObject = (MessageObject) obj4;
                TL_keyboard.TL_buttonTypeRequestPeer tL_buttonTypeRequestPeer = (TL_keyboard.TL_buttonTypeRequestPeer) obj3;
                TLRPC.User user = (TLRPC.User) obj2;
                TLRPC.User user2 = (TLRPC.User) obj;
                int i13 = ChatActivityEnterView.m5;
                if (user2 != null) {
                    TLRPC.TL_messages_sendBotRequestedPeer tL_messages_sendBotRequestedPeer = new TLRPC.TL_messages_sendBotRequestedPeer();
                    tL_messages_sendBotRequestedPeer.peer = MessagesController.getInstance(chatActivityEnterView.Q).getInputPeer(messageObject.messageOwner.peer_id);
                    tL_messages_sendBotRequestedPeer.flags |= 1;
                    tL_messages_sendBotRequestedPeer.msg_id = messageObject.getId();
                    tL_messages_sendBotRequestedPeer.button_id = tL_buttonTypeRequestPeer.button_id;
                    tL_messages_sendBotRequestedPeer.requested_peers.add(MessagesController.getInputPeer(user2));
                    ConnectionsManager.getInstance(chatActivityEnterView.Q).sendRequest(tL_messages_sendBotRequestedPeer, null);
                    long j3 = user.id;
                    Bundle bundle = new Bundle();
                    bundle.putLong("user_id", user2.id);
                    eg egVar = new eg(bundle, user2, user, j3);
                    eo eoVar = chatActivityEnterView.O2;
                    if (eoVar != null) {
                        eoVar.presentFragment(egVar);
                        break;
                    }
                }
                break;
            case 3:
                ll.L((ll) obj5, (eo) obj4, (TLRPC.TL_messageMediaGeo) obj3, (f6) obj2, (Long) obj);
                break;
            case 4:
                ll.P((ll) obj5, (eo) obj4, (TLRPC.TL_messageMediaVenue) obj3, (f6) obj2);
                break;
            case 5:
                zn znVar = (zn) obj5;
                eo eoVar2 = (eo) obj4;
                TLRPC.TL_messageMediaPoll tL_messageMediaPoll = (TLRPC.TL_messageMediaPoll) obj3;
                ArrayList arrayList = (ArrayList) obj2;
                Long l4 = (Long) obj;
                if (eoVar2.c()) {
                    d5.L(eoVar2.getParentActivity(), eoVar2.a(), new a1.d(znVar, tL_messageMediaPoll, arrayList, l4, 8));
                    break;
                } else {
                    znVar.j0.c(tL_messageMediaPoll, znVar.O, znVar.l1, arrayList, true, 0, l4.longValue());
                    znVar.b.dismiss(true);
                    break;
                }
            case 6:
                ry ryVar = (ry) obj5;
                ArrayList arrayList2 = (ArrayList) obj3;
                Runnable runnable = (Runnable) obj2;
                ArrayList arrayList3 = (ArrayList) obj;
                if (((String) obj4).equals(ryVar.v)) {
                    p5.h(ryVar.F.c1).f(arrayList3);
                    int size = arrayList3.size();
                    while (i11 < size) {
                        Object obj6 = arrayList3.get(i11);
                        i11++;
                        MediaDataController.KeywordResult keywordResult = new MediaDataController.KeywordResult();
                        keywordResult.emoji = "animated_" + ((TLRPC.Document) obj6).id;
                        keywordResult.keyword = null;
                        arrayList2.add(keywordResult);
                    }
                    runnable.run();
                    break;
                }
                break;
            case 7:
                iv0.m((iv0) obj5, (HashSet) obj4, (TL_stories.StoryItem) obj3, (w70) obj2, (b5) obj);
                break;
            case 8:
                wy wyVar = (wy) obj5;
                wyVar.Q4(wyVar.getMessagesController().getChat((Long) obj4), (Runnable) obj, new zq(wyVar, (nd) obj3, (p2) obj2, i12));
                break;
            case 9:
                l71 l71Var = (l71) obj5;
                String[] strArr = (String[]) obj4;
                String str2 = (String) obj3;
                LinkedHashSet linkedHashSet = (LinkedHashSet) obj2;
                Runnable runnable2 = (Runnable) obj;
                int i14 = l71Var.V;
                if (ConnectionsManager.getInstance(i14).getConnectionState() != 3) {
                    runnable2.run();
                    break;
                } else {
                    if (strArr != null && strArr.length != 0) {
                        str = strArr[0];
                    }
                    MediaDataController.getInstance(i14).searchStickers(true, str, str2, new org.telegram.ui.z(l71Var, linkedHashSet, runnable2, 9));
                    break;
                }
            case 10:
                l71 l71Var2 = (l71) obj5;
                String str3 = (String) obj4;
                ArrayList arrayList4 = (ArrayList) obj3;
                HashMap hashMap = (HashMap) obj2;
                Runnable runnable3 = (Runnable) obj;
                int i15 = l71Var2.V;
                if (l71Var2.W != 4) {
                    runnable3.run();
                    break;
                } else {
                    ArrayList arrayList5 = new ArrayList(0);
                    LongSparseArray longSparseArray = new LongSparseArray(0);
                    HashMap<String, ArrayList<TLRPC.Document>> allStickers = MediaDataController.getInstance(i15).getAllStickers();
                    if (str3.length() <= 14) {
                        int length = str3.length();
                        CharSequence charSequence = str3;
                        int i16 = 0;
                        while (i16 < length) {
                            if (i16 < length - 1) {
                                if (charSequence.charAt(i16) == 55356) {
                                    int i17 = i16 + 1;
                                    if (charSequence.charAt(i17) >= 57339) {
                                        break;
                                    }
                                }
                                if (charSequence.charAt(i16) == 8205) {
                                    int i18 = i16 + 1;
                                    if (charSequence.charAt(i18) != 9792) {
                                        break;
                                    }
                                    charSequence = TextUtils.concat(charSequence.subSequence(0, i16), charSequence.subSequence(i16 + 2, charSequence.length()));
                                    length -= 2;
                                    i16--;
                                    i16++;
                                }
                            }
                            if (charSequence.charAt(i16) == 65039) {
                                charSequence = TextUtils.concat(charSequence.subSequence(0, i16), charSequence.subSequence(i16 + 1, charSequence.length()));
                                length--;
                                i16--;
                                i16++;
                            } else {
                                i16++;
                            }
                        }
                        ArrayList<TLRPC.Document> arrayList6 = allStickers != null ? allStickers.get(charSequence.toString()) : null;
                        if (arrayList6 != null && !arrayList6.isEmpty()) {
                            arrayList5.addAll(arrayList6);
                            int size2 = arrayList6.size();
                            for (int i19 = 0; i19 < size2; i19++) {
                                TLRPC.Document document = arrayList6.get(i19);
                                longSparseArray.put(document.id, document);
                            }
                            arrayList4.add(arrayList5);
                        }
                    }
                    if (allStickers != null && !allStickers.isEmpty() && str3.length() > 1) {
                        MediaDataController.getInstance(i15).getEmojiSuggestions(l71.a2, str3, false, new a1.d(allStickers, hashMap, arrayList4, runnable3, 16), false);
                        break;
                    }
                }
                break;
            case 11:
                org.telegram.ui.web.c1 c1Var = (org.telegram.ui.web.c1) obj5;
                org.telegram.ui.web.a1 a1Var = (org.telegram.ui.web.a1) obj4;
                String str4 = (String) obj3;
                TL_keyboard.TL_buttonTypeRequestPeer tL_buttonTypeRequestPeer2 = (TL_keyboard.TL_buttonTypeRequestPeer) obj2;
                TLRPC.User user3 = (TLRPC.User) obj;
                if (user3 == null) {
                    c1Var.z(a1Var, "requested_chat_failed", org.telegram.ui.web.c1.B(str4, "req_id"));
                    break;
                } else {
                    TLRPC.TL_messages_sendBotRequestedPeer tL_messages_sendBotRequestedPeer2 = new TLRPC.TL_messages_sendBotRequestedPeer();
                    tL_messages_sendBotRequestedPeer2.peer = MessagesController.getInputPeer(c1Var.U);
                    tL_messages_sendBotRequestedPeer2.webapp_req_id = str4;
                    tL_messages_sendBotRequestedPeer2.button_id = tL_buttonTypeRequestPeer2.button_id;
                    tL_messages_sendBotRequestedPeer2.requested_peers.add(MessagesController.getInputPeer(user3));
                    ConnectionsManager.getInstance(c1Var.M).sendRequestTyped(tL_messages_sendBotRequestedPeer2, new org.telegram.messenger.a(), new fl0(c1Var, a1Var, str4, user3, 1));
                    c1Var.z(a1Var, "requested_chat_sent", org.telegram.ui.web.c1.B(str4, "req_id"));
                    break;
                }
            case 12:
                org.telegram.ui.web.c1 c1Var2 = (org.telegram.ui.web.c1) obj5;
                org.telegram.ui.web.a1 a1Var2 = (org.telegram.ui.web.a1) obj4;
                String str5 = (String) obj3;
                String str6 = (String) obj2;
                if (((Boolean) obj).booleanValue()) {
                    c1Var2.l0.b(str5, str6);
                    c1Var2.z(a1Var2, "file_download_requested", org.telegram.ui.web.c1.B("downloading", "status"));
                    break;
                } else {
                    c1Var2.z(a1Var2, "file_download_requested", org.telegram.ui.web.c1.B("cancelled", "status"));
                    break;
                }
            case 13:
                p2 p2Var = (p2) obj4;
                String str7 = (String) obj3;
                nf.e eVar = (nf.e) obj2;
                TLRPC.TL_payments_checkedGiftCode tL_payments_checkedGiftCode = (TLRPC.TL_payments_checkedGiftCode) obj;
                if (!((AtomicBoolean) obj5).get() && p2Var.getParentActivity() != null) {
                    if (tL_payments_checkedGiftCode.from_id == null) {
                        TLRPC.TL_premiumGiftOption tL_premiumGiftOption = new TLRPC.TL_premiumGiftOption();
                        tL_premiumGiftOption.months = tL_payments_checkedGiftCode.months;
                        TLRPC.User i20 = p2Var instanceof eo ? ((eo) p2Var).i() : null;
                        if (i20 == null || i20.self) {
                            i20 = new TLRPC.TL_user();
                        }
                        TLRPC.User user4 = i20;
                        boolean z10 = tL_payments_checkedGiftCode.used_date != 0;
                        p2 R = LaunchActivity.R();
                        if (R != null && sg.h0.S0 == null) {
                            sg.h0 h0Var = new sg.h0(R, UserConfig.selectedAccount, user4, new qg.k(tL_premiumGiftOption), str7, z10, R.getResourceProvider());
                            h0Var.show();
                            sg.h0.S0 = h0Var;
                        }
                    } else {
                        p2Var.showDialog(new sg.c0(p2Var, tL_payments_checkedGiftCode, str7));
                    }
                    if (eVar != null) {
                        eVar.b();
                        break;
                    }
                }
                break;
            case 14:
                MessagesController.getInstance(r10.currentAccount).getBoostsController().getBoostsStats(-((TLRPC.Chat) obj4).id, new sg.l0((sg.u0) obj5, (TL_stories.TL_premium_myBoosts) obj, (ArrayList) obj3, (HashSet) obj2, 0));
                break;
            case 15:
                wh.p1 p1Var = (wh.p1) obj5;
                Utilities.Callback callback = (Utilities.Callback) obj3;
                wh.b1 b1Var = (wh.b1) obj2;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj;
                ((nf.e) obj4).b();
                if (callback != null) {
                    callback.run(Boolean.FALSE);
                }
                p1Var.dismiss();
                if (tL_error != null) {
                    AndroidUtilities.runOnUIThread(new u2.k0(5, b1Var, tL_error));
                    break;
                } else {
                    p1Var.dismiss();
                    break;
                }
            case 16:
                TLRPC.TL_document tL_document = (TLRPC.TL_document) obj4;
                Long l10 = (Long) obj;
                a3 a3Var = ((zh.w1) obj5).a;
                SendMessagesHelper.getInstance(a3Var.C2).sendSticker(tL_document, (String) obj3, a3Var.B1, null, null, a3Var.O1.a, null, null, true, 0, 0, false, this.e, null, l10.longValue(), a3Var.b2.getSendMonoForumPeerId(), a3Var.b2.getSendMessageSuggestionParams());
                a3Var.b2.o(tL_document);
                a3Var.b2.setFieldText("");
                a3Var.k0(l10.longValue() <= 0);
                break;
            default:
                TL_stories.StoryItem storyItem = (TL_stories.StoryItem) obj3;
                f6 f6Var = (f6) obj2;
                b5 b5Var = (b5) obj;
                a3 a3Var2 = ((v2) obj5).l;
                if (((HashSet) obj4).contains(Integer.valueOf(b5Var.a))) {
                    a3Var2.S1.c(b5Var.a, a3Var2.B1, storyItem);
                    formatString = LocaleController.formatString(R.string.StoryAddedToAlbumX, b5Var.b);
                } else {
                    i5 i5Var = a3Var2.S1;
                    long j10 = a3Var2.B1;
                    int i21 = b5Var.a;
                    i5Var.getClass();
                    ArrayList arrayList7 = new ArrayList(1);
                    arrayList7.add(storyItem);
                    i5Var.c0(i21, j10, arrayList7);
                    formatString = LocaleController.formatString(R.string.StoryRemovedFromAlbumX, b5Var.b);
                }
                new wc(a3Var2.c1, f6Var).Q(R.raw.contact_check, 36, AndroidUtilities.replaceTags(formatString)).j();
                v2 v2Var = a3Var2.t1;
                if (v2Var != null) {
                    v2Var.a();
                    break;
                }
                break;
        }
    }
}
