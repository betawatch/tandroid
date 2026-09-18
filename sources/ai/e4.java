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
import org.telegram.messenger.R;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.ChatActivityEnterView;
import org.telegram.ui.Components.bg;
import org.telegram.ui.Components.gl;
import org.telegram.ui.Components.jy;
import org.telegram.ui.Components.n70;
import org.telegram.ui.Components.qr;
import org.telegram.ui.Components.un;
import org.telegram.ui.Components.vc;
import org.telegram.ui.Components.zu0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.bo;
import org.telegram.ui.cd;
import org.telegram.ui.fl0;
import org.telegram.ui.i71;
import org.telegram.ui.nd;
import org.telegram.ui.wy;
import org.telegram.ui.xq;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
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

    /* JADX WARN: Code restructure failed: missing block: B:73:0x01b1, code lost:
    
        if (r12.charAt(r13) <= 57343) goto L77;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x01cb, code lost:
    
        if (r12.charAt(r4) != 9794) goto L79;
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
                f6 f6Var = ((f4) obj5).a;
                SendMessagesHelper.getInstance(f6Var.C2).sendSticker(tL_document, (String) obj3, f6Var.B1, null, null, f6Var.O1.a, null, null, true, 0, 0, false, this.e, null, l4.longValue(), f6Var.b2.getSendMonoForumPeerId(), f6Var.b2.getSendMessageSuggestionParams());
                f6Var.b2.p(tL_document);
                f6Var.b2.setFieldText("");
                f6Var.k0(l4.longValue() <= 0);
                break;
            case 1:
                TL_stories.StoryItem storyItem = (TL_stories.StoryItem) obj3;
                org.telegram.ui.ActionBar.f6 f6Var2 = (org.telegram.ui.ActionBar.f6) obj2;
                e9 e9Var = (e9) obj;
                f6 f6Var3 = ((w5) obj5).l;
                if (((HashSet) obj4).contains(Integer.valueOf(e9Var.a))) {
                    f6Var3.S1.c(e9Var.a, f6Var3.B1, storyItem);
                    formatString = LocaleController.formatString(R.string.StoryAddedToAlbumX, e9Var.b);
                } else {
                    l9 l9Var = f6Var3.S1;
                    long j3 = f6Var3.B1;
                    int i15 = e9Var.a;
                    l9Var.getClass();
                    ArrayList arrayList = new ArrayList(1);
                    arrayList.add(storyItem);
                    l9Var.c0(i15, j3, arrayList);
                    formatString = LocaleController.formatString(R.string.StoryRemovedFromAlbumX, e9Var.b);
                }
                new vc(f6Var3.c1, f6Var2).Q(R.raw.contact_check, 36, AndroidUtilities.replaceTags(formatString)).j();
                w5 w5Var = f6Var3.t1;
                if (w5Var != null) {
                    w5Var.a();
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
                ofFloat.addUpdateListener(new x(i12, textView, textView2));
                valueAnimatorArr[0].setDuration(320L);
                valueAnimatorArr[0].setInterpolator(qr.h);
                valueAnimatorArr[0].start();
                if (bool.booleanValue()) {
                    AndroidUtilities.runOnUIThread(runnableArr[0], 5320L);
                    break;
                }
                break;
            case 3:
                AndroidUtilities.runOnUIThread(new m3((cd) obj5, (boolean[]) obj4, (int[]) obj3, (int[]) obj2, (TLRPC.TL_error) obj, 15));
                break;
            case 4:
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
                    bg bgVar = new bg(bundle, user2, user, j10);
                    bo boVar = chatActivityEnterView.O2;
                    if (boVar != null) {
                        boVar.presentFragment(bgVar);
                        break;
                    }
                }
                break;
            case 5:
                gl.L((gl) obj5, (bo) obj4, (TLRPC.TL_messageMediaGeo) obj3, (org.telegram.ui.ActionBar.f6) obj2, (Long) obj);
                break;
            case 6:
                gl.P((gl) obj5, (bo) obj4, (TLRPC.TL_messageMediaVenue) obj3, (org.telegram.ui.ActionBar.f6) obj2);
                break;
            case 7:
                un unVar = (un) obj5;
                bo boVar2 = (bo) obj4;
                TLRPC.TL_messageMediaPoll tL_messageMediaPoll = (TLRPC.TL_messageMediaPoll) obj3;
                ArrayList arrayList2 = (ArrayList) obj2;
                Long l10 = (Long) obj;
                if (boVar2.c()) {
                    org.telegram.ui.Components.c5.L(boVar2.getParentActivity(), boVar2.a(), new a1.d(unVar, tL_messageMediaPoll, arrayList2, l10, 8));
                    break;
                } else {
                    unVar.j0.e(tL_messageMediaPoll, unVar.O, unVar.l1, arrayList2, true, 0, l10.longValue());
                    unVar.b.dismiss(true);
                    break;
                }
            case 8:
                jy jyVar = (jy) obj5;
                ArrayList arrayList3 = (ArrayList) obj4;
                Runnable runnable = (Runnable) obj2;
                ArrayList arrayList4 = (ArrayList) obj;
                if (((String) obj3).equals(jyVar.v)) {
                    org.telegram.ui.Components.o5.h(jyVar.F.c1).f(arrayList4);
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
            case 9:
                zu0.m((zu0) obj5, (HashSet) obj4, (TL_stories.StoryItem) obj3, (n70) obj2, (e9) obj);
                break;
            case 10:
                wy wyVar = (wy) obj5;
                wyVar.Q4(wyVar.getMessagesController().getChat((Long) obj4), (Runnable) obj, new xq(wyVar, (nd) obj3, (org.telegram.ui.ActionBar.o2) obj2, i14));
                break;
            case 11:
                i71 i71Var = (i71) obj5;
                String[] strArr = (String[]) obj4;
                String str2 = (String) obj3;
                LinkedHashSet linkedHashSet = (LinkedHashSet) obj2;
                Runnable runnable2 = (Runnable) obj;
                int i17 = i71Var.V;
                if (ConnectionsManager.getInstance(i17).getConnectionState() != 3) {
                    runnable2.run();
                    break;
                } else {
                    if (strArr != null && strArr.length != 0) {
                        str = strArr[0];
                    }
                    MediaDataController.getInstance(i17).searchStickers(true, str, str2, new org.telegram.ui.y(i71Var, linkedHashSet, runnable2, 9));
                    break;
                }
                break;
            case 12:
                i71 i71Var2 = (i71) obj5;
                String str3 = (String) obj3;
                ArrayList arrayList5 = (ArrayList) obj4;
                HashMap hashMap = (HashMap) obj2;
                Runnable runnable3 = (Runnable) obj;
                int i18 = i71Var2.V;
                if (i71Var2.W != 4) {
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
                        MediaDataController.getInstance(i18).getEmojiSuggestions(i71.a2, str3, false, new a1.d(allStickers, hashMap, arrayList5, runnable3, 16), false);
                        break;
                    }
                }
                break;
            case 13:
                org.telegram.ui.web.d1 d1Var = (org.telegram.ui.web.d1) obj5;
                da daVar = (da) obj4;
                String str4 = (String) obj3;
                TL_keyboard.TL_buttonTypeRequestPeer tL_buttonTypeRequestPeer2 = (TL_keyboard.TL_buttonTypeRequestPeer) obj2;
                TLRPC.User user3 = (TLRPC.User) obj;
                if (user3 == null) {
                    d1Var.y(daVar, "requested_chat_failed", org.telegram.ui.web.d1.B(str4, "req_id"));
                    break;
                } else {
                    TLRPC.TL_messages_sendBotRequestedPeer tL_messages_sendBotRequestedPeer2 = new TLRPC.TL_messages_sendBotRequestedPeer();
                    tL_messages_sendBotRequestedPeer2.peer = MessagesController.getInputPeer(d1Var.U);
                    tL_messages_sendBotRequestedPeer2.webapp_req_id = str4;
                    tL_messages_sendBotRequestedPeer2.button_id = tL_buttonTypeRequestPeer2.button_id;
                    tL_messages_sendBotRequestedPeer2.requested_peers.add(MessagesController.getInputPeer(user3));
                    ConnectionsManager.getInstance(d1Var.M).sendRequestTyped(tL_messages_sendBotRequestedPeer2, new org.telegram.messenger.a(), new fl0(d1Var, daVar, str4, user3, 1));
                    d1Var.y(daVar, "requested_chat_sent", org.telegram.ui.web.d1.B(str4, "req_id"));
                    break;
                }
            case 14:
                org.telegram.ui.web.d1 d1Var2 = (org.telegram.ui.web.d1) obj5;
                da daVar2 = (da) obj4;
                String str5 = (String) obj3;
                String str6 = (String) obj2;
                if (((Boolean) obj).booleanValue()) {
                    d1Var2.l0.b(str5, str6);
                    d1Var2.y(daVar2, "file_download_requested", org.telegram.ui.web.d1.B("downloading", "status"));
                    break;
                } else {
                    d1Var2.y(daVar2, "file_download_requested", org.telegram.ui.web.d1.B("cancelled", "status"));
                    break;
                }
            case 15:
                org.telegram.ui.ActionBar.o2 o2Var = (org.telegram.ui.ActionBar.o2) obj4;
                String str7 = (String) obj3;
                nf.e eVar = (nf.e) obj2;
                TLRPC.TL_payments_checkedGiftCode tL_payments_checkedGiftCode = (TLRPC.TL_payments_checkedGiftCode) obj;
                if (!((AtomicBoolean) obj5).get() && o2Var.getParentActivity() != null) {
                    if (tL_payments_checkedGiftCode.from_id == null) {
                        TLRPC.TL_premiumGiftOption tL_premiumGiftOption = new TLRPC.TL_premiumGiftOption();
                        tL_premiumGiftOption.months = tL_payments_checkedGiftCode.months;
                        TLRPC.User i23 = o2Var instanceof bo ? ((bo) o2Var).i() : null;
                        if (i23 == null || i23.self) {
                            i23 = new TLRPC.TL_user();
                        }
                        TLRPC.User user4 = i23;
                        boolean z10 = tL_payments_checkedGiftCode.used_date != 0;
                        org.telegram.ui.ActionBar.o2 R = LaunchActivity.R();
                        if (R != null && tg.h0.S0 == null) {
                            tg.h0 h0Var = new tg.h0(R, UserConfig.selectedAccount, user4, new rg.k(tL_premiumGiftOption), str7, z10, R.getResourceProvider());
                            h0Var.show();
                            tg.h0.S0 = h0Var;
                        }
                    } else {
                        o2Var.showDialog(new tg.d0(o2Var, tL_payments_checkedGiftCode, str7));
                    }
                    if (eVar != null) {
                        eVar.b();
                        break;
                    }
                }
                break;
            case 16:
                MessagesController.getInstance(r11.currentAccount).getBoostsController().getBoostsStats(-((TLRPC.Chat) obj4).id, new c5((tg.t0) obj5, (TL_stories.TL_premium_myBoosts) obj, (ArrayList) obj3, (HashSet) obj2, 1));
                break;
            default:
                xh.q1 q1Var = (xh.q1) obj5;
                Utilities.Callback callback = (Utilities.Callback) obj3;
                xh.b1 b1Var = (xh.b1) obj2;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj;
                ((nf.e) obj4).b();
                if (callback != null) {
                    callback.run(Boolean.FALSE);
                }
                q1Var.dismiss();
                if (tL_error != null) {
                    AndroidUtilities.runOnUIThread(new uh.i(i11, b1Var, tL_error));
                    break;
                } else {
                    q1Var.dismiss();
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
