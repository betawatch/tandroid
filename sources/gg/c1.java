package gg;

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
import nh.d4;
import nh.j7;
import nh.m6;
import nh.t6;
import nh.w3;
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
import org.telegram.ui.Components.ChatActivityEnterView;
import org.telegram.ui.Components.al;
import org.telegram.ui.Components.jy;
import org.telegram.ui.Components.l5;
import org.telegram.ui.Components.mr;
import org.telegram.ui.Components.p70;
import org.telegram.ui.Components.pn;
import org.telegram.ui.Components.qc;
import org.telegram.ui.Components.tf;
import org.telegram.ui.Components.yu0;
import org.telegram.ui.Components.z4;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.dd;
import org.telegram.ui.pd;
import org.telegram.ui.qy;
import org.telegram.ui.tq;
import org.telegram.ui.x61;
import org.telegram.ui.zn;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final /* synthetic */ class c1 implements Utilities.Callback {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ c1(Object obj, Object obj2, Object obj3, Object obj4, int i10) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
        this.e = obj4;
    }

    /* JADX WARN: Code restructure failed: missing block: B:43:0x0154, code lost:
    
        if (r11.charAt(r12) <= 57343) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x016e, code lost:
    
        if (r11.charAt(r3) != 9794) goto L48;
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
                org.telegram.ui.ActionBar.p2 p2Var = (org.telegram.ui.ActionBar.p2) obj4;
                String str2 = (String) obj3;
                ze.c cVar = (ze.c) obj2;
                TLRPC.TL_payments_checkedGiftCode tL_payments_checkedGiftCode = (TLRPC.TL_payments_checkedGiftCode) obj;
                if (!((AtomicBoolean) obj5).get() && p2Var.getParentActivity() != null) {
                    if (tL_payments_checkedGiftCode.from_id == null) {
                        TLRPC.TL_premiumGiftOption tL_premiumGiftOption = new TLRPC.TL_premiumGiftOption();
                        tL_premiumGiftOption.months = tL_payments_checkedGiftCode.months;
                        TLRPC.User i13 = p2Var instanceof zn ? ((zn) p2Var).i() : null;
                        if (i13 == null || i13.self) {
                            i13 = new TLRPC.TL_user();
                        }
                        TLRPC.User user = i13;
                        boolean z4 = tL_payments_checkedGiftCode.used_date != 0;
                        org.telegram.ui.ActionBar.p2 R = LaunchActivity.R();
                        if (R != null && i1.P0 == null) {
                            i1 i1Var = new i1(R, UserConfig.selectedAccount, user, new eg.n(tL_premiumGiftOption), str2, z4, R.getResourceProvider());
                            i1Var.show();
                            i1.P0 = i1Var;
                        }
                    } else {
                        p2Var.showDialog(new e1(p2Var, tL_payments_checkedGiftCode, str2));
                    }
                    if (cVar != null) {
                        cVar.b();
                        break;
                    }
                }
                break;
            case 1:
                MessagesController.getInstance(r10.currentAccount).getBoostsController().getBoostsStats(-((TLRPC.Chat) obj4).id, new n1((w1) obj5, (TL_stories.TL_premium_myBoosts) obj, (ArrayList) obj3, (HashSet) obj2, 0));
                break;
            case 2:
                kh.g2 g2Var = (kh.g2) obj5;
                Utilities.Callback callback = (Utilities.Callback) obj4;
                kh.r1 r1Var = (kh.r1) obj3;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj;
                ((ze.c) obj2).b();
                if (callback != null) {
                    callback.run(Boolean.FALSE);
                }
                g2Var.dismiss();
                if (tL_error != null) {
                    AndroidUtilities.runOnUIThread(new ff.c(21, r1Var, tL_error));
                    break;
                } else {
                    g2Var.dismiss();
                    break;
                }
            case 3:
                TLRPC.TL_document tL_document = (TLRPC.TL_document) obj4;
                Long l10 = (Long) obj;
                d4 d4Var = ((nh.s2) obj5).a;
                SendMessagesHelper.getInstance(d4Var.z2).sendSticker(tL_document, (String) obj3, d4Var.y1, null, null, d4Var.L1.a, null, null, true, 0, 0, false, this.e, null, l10.longValue(), d4Var.Y1.getSendMonoForumPeerId(), d4Var.Y1.getSendMessageSuggestionParams());
                d4Var.Y1.o(tL_document);
                d4Var.Y1.setFieldText("");
                d4Var.k0(l10.longValue() <= 0);
                break;
            case 4:
                TL_stories.StoryItem storyItem = (TL_stories.StoryItem) obj3;
                f6 f6Var = (f6) obj2;
                m6 m6Var = (m6) obj;
                d4 d4Var2 = ((w3) obj5).l;
                if (((HashSet) obj4).contains(Integer.valueOf(m6Var.a))) {
                    d4Var2.P1.c(m6Var.a, d4Var2.y1, storyItem);
                    formatString = LocaleController.formatString(R.string.StoryAddedToAlbumX, m6Var.b);
                } else {
                    t6 t6Var = d4Var2.P1;
                    long j10 = d4Var2.y1;
                    int i14 = m6Var.a;
                    t6Var.getClass();
                    ArrayList arrayList = new ArrayList(1);
                    arrayList.add(storyItem);
                    t6Var.c0(i14, j10, arrayList);
                    formatString = LocaleController.formatString(R.string.StoryRemovedFromAlbumX, m6Var.b);
                }
                new qc(d4Var2.Z0, f6Var).Q(R.raw.contact_check, 36, AndroidUtilities.replaceTags(formatString)).j();
                w3 w3Var = d4Var2.q1;
                if (w3Var != null) {
                    w3Var.a();
                    break;
                }
                break;
            case 5:
                AndroidUtilities.runOnUIThread(new j0(21, (dd) obj5, (boolean[]) obj4, (int[]) obj3, (int[]) obj2, (TLRPC.TL_error) obj));
                break;
            case 6:
                ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) obj5;
                MessageObject messageObject = (MessageObject) obj4;
                TL_keyboard.TL_buttonTypeRequestPeer tL_buttonTypeRequestPeer = (TL_keyboard.TL_buttonTypeRequestPeer) obj3;
                TLRPC.User user2 = (TLRPC.User) obj2;
                TLRPC.User user3 = (TLRPC.User) obj;
                int i15 = ChatActivityEnterView.j5;
                if (user3 != null) {
                    TLRPC.TL_messages_sendBotRequestedPeer tL_messages_sendBotRequestedPeer = new TLRPC.TL_messages_sendBotRequestedPeer();
                    tL_messages_sendBotRequestedPeer.peer = MessagesController.getInstance(chatActivityEnterView.N).getInputPeer(messageObject.messageOwner.peer_id);
                    tL_messages_sendBotRequestedPeer.flags |= 1;
                    tL_messages_sendBotRequestedPeer.msg_id = messageObject.getId();
                    tL_messages_sendBotRequestedPeer.button_id = tL_buttonTypeRequestPeer.button_id;
                    tL_messages_sendBotRequestedPeer.requested_peers.add(MessagesController.getInputPeer(user3));
                    ConnectionsManager.getInstance(chatActivityEnterView.N).sendRequest(tL_messages_sendBotRequestedPeer, null);
                    long j11 = user2.id;
                    Bundle bundle = new Bundle();
                    bundle.putLong("user_id", user3.id);
                    tf tfVar = new tf(bundle, user3, user2, j11);
                    zn znVar = chatActivityEnterView.L2;
                    if (znVar != null) {
                        znVar.presentFragment(tfVar);
                        break;
                    }
                }
                break;
            case 7:
                al.K((al) obj5, (zn) obj4, (TLRPC.TL_messageMediaGeo) obj3, (f6) obj2, (Long) obj);
                break;
            case 8:
                al.P((al) obj5, (zn) obj4, (TLRPC.TL_messageMediaVenue) obj3, (f6) obj2);
                break;
            case 9:
                pn pnVar = (pn) obj5;
                zn znVar2 = (zn) obj4;
                TLRPC.TL_messageMediaPoll tL_messageMediaPoll = (TLRPC.TL_messageMediaPoll) obj3;
                ArrayList arrayList2 = (ArrayList) obj2;
                Long l11 = (Long) obj;
                if (znVar2.c()) {
                    z4.L(znVar2.getParentActivity(), znVar2.a(), new a1.d(pnVar, tL_messageMediaPoll, arrayList2, l11, 9));
                    break;
                } else {
                    pnVar.g0.c(tL_messageMediaPoll, pnVar.L, pnVar.i1, arrayList2, true, 0, l11.longValue());
                    pnVar.b.dismiss(true);
                    break;
                }
            case 10:
                jy jyVar = (jy) obj5;
                ArrayList arrayList3 = (ArrayList) obj4;
                Runnable runnable = (Runnable) obj2;
                ArrayList arrayList4 = (ArrayList) obj;
                if (((String) obj3).equals(jyVar.v)) {
                    l5.h(jyVar.C.Z0).f(arrayList4);
                    int size = arrayList4.size();
                    while (i11 < size) {
                        Object obj6 = arrayList4.get(i11);
                        i11++;
                        MediaDataController.KeywordResult keywordResult = new MediaDataController.KeywordResult();
                        keywordResult.emoji = "animated_" + ((TLRPC.Document) obj6).id;
                        keywordResult.keyword = null;
                        arrayList3.add(keywordResult);
                    }
                    runnable.run();
                    break;
                }
                break;
            case 11:
                yu0.m((yu0) obj5, (HashSet) obj4, (TL_stories.StoryItem) obj3, (p70) obj2, (m6) obj);
                break;
            case 12:
                qy qyVar = (qy) obj5;
                qyVar.Q4(qyVar.getMessagesController().getChat((Long) obj3), (Runnable) obj, new tq(qyVar, (pd) obj2, (org.telegram.ui.ActionBar.p2) obj4, i12));
                break;
            case 13:
                x61 x61Var = (x61) obj5;
                String[] strArr = (String[]) obj4;
                String str3 = (String) obj3;
                LinkedHashSet linkedHashSet = (LinkedHashSet) obj2;
                Runnable runnable2 = (Runnable) obj;
                int i16 = x61Var.S;
                if (ConnectionsManager.getInstance(i16).getConnectionState() != 3) {
                    runnable2.run();
                    break;
                } else {
                    if (strArr != null && strArr.length != 0) {
                        str = strArr[0];
                    }
                    MediaDataController.getInstance(i16).searchStickers(true, str, str3, new org.telegram.ui.b0(x61Var, linkedHashSet, runnable2, 9));
                    break;
                }
                break;
            case 14:
                x61 x61Var2 = (x61) obj5;
                String str4 = (String) obj3;
                ArrayList arrayList5 = (ArrayList) obj4;
                HashMap hashMap = (HashMap) obj2;
                Runnable runnable3 = (Runnable) obj;
                int i17 = x61Var2.S;
                if (x61Var2.T != 4) {
                    runnable3.run();
                    break;
                } else {
                    ArrayList arrayList6 = new ArrayList(0);
                    LongSparseArray longSparseArray = new LongSparseArray(0);
                    HashMap<String, ArrayList<TLRPC.Document>> allStickers = MediaDataController.getInstance(i17).getAllStickers();
                    if (str4.length() <= 14) {
                        int length = str4.length();
                        CharSequence charSequence = str4;
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
                    if (allStickers != null && !allStickers.isEmpty() && str4.length() > 1) {
                        MediaDataController.getInstance(i17).getEmojiSuggestions(x61.X1, str4, false, new a1.d(allStickers, hashMap, arrayList5, runnable3, 17), false);
                        break;
                    }
                }
                break;
            case 15:
                org.telegram.ui.web.c1 c1Var = (org.telegram.ui.web.c1) obj5;
                j7 j7Var = (j7) obj4;
                String str5 = (String) obj3;
                TL_keyboard.TL_buttonTypeRequestPeer tL_buttonTypeRequestPeer2 = (TL_keyboard.TL_buttonTypeRequestPeer) obj2;
                TLRPC.User user4 = (TLRPC.User) obj;
                if (user4 == null) {
                    c1Var.z(j7Var, "requested_chat_failed", org.telegram.ui.web.c1.B(str5, "req_id"));
                    break;
                } else {
                    TLRPC.TL_messages_sendBotRequestedPeer tL_messages_sendBotRequestedPeer2 = new TLRPC.TL_messages_sendBotRequestedPeer();
                    tL_messages_sendBotRequestedPeer2.peer = MessagesController.getInputPeer(c1Var.R);
                    tL_messages_sendBotRequestedPeer2.webapp_req_id = str5;
                    tL_messages_sendBotRequestedPeer2.button_id = tL_buttonTypeRequestPeer2.button_id;
                    tL_messages_sendBotRequestedPeer2.requested_peers.add(MessagesController.getInputPeer(user4));
                    ConnectionsManager.getInstance(c1Var.J).sendRequestTyped(tL_messages_sendBotRequestedPeer2, new org.telegram.messenger.a(), new lh.z1(c1Var, j7Var, str5, user4, 2));
                    c1Var.z(j7Var, "requested_chat_sent", org.telegram.ui.web.c1.B(str5, "req_id"));
                    break;
                }
            case 16:
                org.telegram.ui.web.c1 c1Var2 = (org.telegram.ui.web.c1) obj5;
                j7 j7Var2 = (j7) obj4;
                String str6 = (String) obj3;
                String str7 = (String) obj2;
                if (((Boolean) obj).booleanValue()) {
                    c1Var2.i0.b(str6, str7);
                    c1Var2.z(j7Var2, "file_download_requested", org.telegram.ui.web.c1.B("downloading", "status"));
                    break;
                } else {
                    c1Var2.z(j7Var2, "file_download_requested", org.telegram.ui.web.c1.B("cancelled", "status"));
                    break;
                }
            default:
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
                ofFloat.addUpdateListener(new ag.a(25, textView, textView2));
                valueAnimatorArr[0].setDuration(320L);
                valueAnimatorArr[0].setInterpolator(mr.h);
                valueAnimatorArr[0].start();
                if (bool.booleanValue()) {
                    AndroidUtilities.runOnUIThread(runnableArr[0], 5320L);
                    break;
                }
                break;
        }
    }

    public /* synthetic */ c1(Object obj, String str, ArrayList arrayList, Object obj2, int i10) {
        this.a = i10;
        this.b = obj;
        this.d = str;
        this.c = arrayList;
        this.e = obj2;
    }

    public /* synthetic */ c1(kh.g2 g2Var, ze.c cVar, Utilities.Callback callback, kh.r1 r1Var) {
        this.a = 2;
        this.b = g2Var;
        this.e = cVar;
        this.c = callback;
        this.d = r1Var;
    }

    public /* synthetic */ c1(qy qyVar, Long l10, pd pdVar, org.telegram.ui.ActionBar.p2 p2Var) {
        this.a = 12;
        this.b = qyVar;
        this.d = l10;
        this.e = pdVar;
        this.c = p2Var;
    }
}
