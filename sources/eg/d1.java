package eg;

import android.animation.ValueAnimator;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.LongSparseArray;
import android.widget.TextView;
import bg.b3;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.concurrent.atomic.AtomicBoolean;
import lh.d4;
import lh.l6;
import lh.s6;
import lh.w3;
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
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.Components.ChatActivityEnterView;
import org.telegram.ui.Components.bl;
import org.telegram.ui.Components.c5;
import org.telegram.ui.Components.ey;
import org.telegram.ui.Components.j70;
import org.telegram.ui.Components.jr;
import org.telegram.ui.Components.on;
import org.telegram.ui.Components.p5;
import org.telegram.ui.Components.qu0;
import org.telegram.ui.Components.tc;
import org.telegram.ui.Components.wf;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.d61;
import org.telegram.ui.fy;
import org.telegram.ui.hd;
import org.telegram.ui.lq;
import org.telegram.ui.tn;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final /* synthetic */ class d1 implements Utilities.Callback {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ d1(ih.h2 h2Var, ye.c cVar, Utilities.Callback callback, ih.s1 s1Var) {
        this.a = 2;
        this.b = h2Var;
        this.e = cVar;
        this.c = callback;
        this.d = s1Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:43:0x010f, code lost:
    
        if (r11.charAt(r12) <= 57343) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0129, code lost:
    
        if (r11.charAt(r3) != 9794) goto L46;
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
                org.telegram.ui.ActionBar.o2 o2Var = (org.telegram.ui.ActionBar.o2) obj4;
                String str2 = (String) obj3;
                ye.c cVar = (ye.c) obj2;
                TLRPC.TL_payments_checkedGiftCode tL_payments_checkedGiftCode = (TLRPC.TL_payments_checkedGiftCode) obj;
                if (!((AtomicBoolean) obj5).get() && o2Var.getParentActivity() != null) {
                    if (tL_payments_checkedGiftCode.from_id == null) {
                        TLRPC.TL_premiumGiftOption tL_premiumGiftOption = new TLRPC.TL_premiumGiftOption();
                        tL_premiumGiftOption.months = tL_payments_checkedGiftCode.months;
                        TLRPC.User i13 = o2Var instanceof tn ? ((tn) o2Var).i() : null;
                        if (i13 == null || i13.self) {
                            i13 = new TLRPC.TL_user();
                        }
                        TLRPC.User user = i13;
                        boolean z10 = tL_payments_checkedGiftCode.used_date != 0;
                        org.telegram.ui.ActionBar.o2 R = LaunchActivity.R();
                        if (R != null && j1.O0 == null) {
                            j1 j1Var = new j1(R, UserConfig.selectedAccount, user, new cg.n(tL_premiumGiftOption), str2, z10, R.getResourceProvider());
                            j1Var.show();
                            j1.O0 = j1Var;
                        }
                    } else {
                        o2Var.showDialog(new f1(o2Var, tL_payments_checkedGiftCode, str2));
                    }
                    if (cVar != null) {
                        cVar.b();
                        break;
                    }
                }
                break;
            case 1:
                MessagesController.getInstance(r10.currentAccount).getBoostsController().getBoostsStats(-((TLRPC.Chat) obj4).id, new o1((x1) obj5, (TL_stories.TL_premium_myBoosts) obj, (ArrayList) obj3, (HashSet) obj2, 0));
                break;
            case 2:
                ih.h2 h2Var = (ih.h2) obj5;
                Utilities.Callback callback = (Utilities.Callback) obj4;
                ih.s1 s1Var = (ih.s1) obj3;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj;
                ((ye.c) obj2).b();
                if (callback != null) {
                    callback.run(Boolean.FALSE);
                }
                h2Var.dismiss();
                if (tL_error != null) {
                    AndroidUtilities.runOnUIThread(new ef.c(19, s1Var, tL_error));
                    break;
                } else {
                    h2Var.dismiss();
                    break;
                }
            case 3:
                TLRPC.TL_document tL_document = (TLRPC.TL_document) obj4;
                Long l10 = (Long) obj;
                d4 d4Var = ((lh.r2) obj5).a;
                SendMessagesHelper.getInstance(d4Var.y2).sendSticker(tL_document, (String) obj3, d4Var.x1, null, null, d4Var.K1.a, null, null, true, 0, 0, false, this.e, null, l10.longValue(), d4Var.X1.getSendMonoForumPeerId(), d4Var.X1.getSendMessageSuggestionParams());
                d4Var.X1.o(tL_document);
                d4Var.X1.setFieldText("");
                d4Var.k0(l10.longValue() <= 0);
                break;
            case 4:
                TL_stories.StoryItem storyItem = (TL_stories.StoryItem) obj3;
                c6 c6Var = (c6) obj2;
                l6 l6Var = (l6) obj;
                d4 d4Var2 = ((w3) obj5).l;
                if (((HashSet) obj4).contains(Integer.valueOf(l6Var.a))) {
                    d4Var2.O1.c(l6Var.a, d4Var2.x1, storyItem);
                    formatString = LocaleController.formatString(R.string.StoryAddedToAlbumX, l6Var.b);
                } else {
                    s6 s6Var = d4Var2.O1;
                    long j10 = d4Var2.x1;
                    int i14 = l6Var.a;
                    s6Var.getClass();
                    ArrayList arrayList = new ArrayList(1);
                    arrayList.add(storyItem);
                    s6Var.c0(i14, j10, arrayList);
                    formatString = LocaleController.formatString(R.string.StoryRemovedFromAlbumX, l6Var.b);
                }
                new tc(d4Var2.Y0, c6Var).Q(R.raw.contact_check, 36, AndroidUtilities.replaceTags(formatString)).j();
                w3 w3Var = d4Var2.p1;
                if (w3Var != null) {
                    w3Var.a();
                    break;
                }
                break;
            case 5:
                AndroidUtilities.runOnUIThread(new k0(obj5, obj4, obj3, obj2, (TLRPC.TL_error) obj, 23));
                break;
            case 6:
                ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) obj5;
                MessageObject messageObject = (MessageObject) obj4;
                TL_keyboard.TL_buttonTypeRequestPeer tL_buttonTypeRequestPeer = (TL_keyboard.TL_buttonTypeRequestPeer) obj3;
                TLRPC.User user2 = (TLRPC.User) obj2;
                TLRPC.User user3 = (TLRPC.User) obj;
                int i15 = ChatActivityEnterView.i5;
                if (user3 != null) {
                    TLRPC.TL_messages_sendBotRequestedPeer tL_messages_sendBotRequestedPeer = new TLRPC.TL_messages_sendBotRequestedPeer();
                    tL_messages_sendBotRequestedPeer.peer = MessagesController.getInstance(chatActivityEnterView.M).getInputPeer(messageObject.messageOwner.peer_id);
                    tL_messages_sendBotRequestedPeer.flags |= 1;
                    tL_messages_sendBotRequestedPeer.msg_id = messageObject.getId();
                    tL_messages_sendBotRequestedPeer.button_id = tL_buttonTypeRequestPeer.button_id;
                    tL_messages_sendBotRequestedPeer.requested_peers.add(MessagesController.getInputPeer(user3));
                    ConnectionsManager.getInstance(chatActivityEnterView.M).sendRequest(tL_messages_sendBotRequestedPeer, null);
                    long j11 = user2.id;
                    Bundle bundle = new Bundle();
                    bundle.putLong("user_id", user3.id);
                    wf wfVar = new wf(bundle, user3, user2, j11);
                    tn tnVar = chatActivityEnterView.K2;
                    if (tnVar != null) {
                        tnVar.presentFragment(wfVar);
                        break;
                    }
                }
                break;
            case 7:
                bl.K((bl) obj5, (tn) obj4, (TLRPC.TL_messageMediaGeo) obj3, (c6) obj2, (Long) obj);
                break;
            case 8:
                bl.P((bl) obj5, (tn) obj4, (TLRPC.TL_messageMediaVenue) obj3, (c6) obj2);
                break;
            case 9:
                on onVar = (on) obj5;
                tn tnVar2 = (tn) obj4;
                TLRPC.TL_messageMediaPoll tL_messageMediaPoll = (TLRPC.TL_messageMediaPoll) obj3;
                ArrayList arrayList2 = (ArrayList) obj2;
                Long l11 = (Long) obj;
                if (tnVar2.c()) {
                    c5.L(tnVar2.getParentActivity(), tnVar2.a(), new a1.d(onVar, tL_messageMediaPoll, arrayList2, l11, 9));
                    break;
                } else {
                    onVar.f0.e(tL_messageMediaPoll, onVar.K, onVar.h1, arrayList2, true, 0, l11.longValue());
                    onVar.b.dismiss(true);
                    break;
                }
            case 10:
                ey eyVar = (ey) obj5;
                ArrayList arrayList3 = (ArrayList) obj4;
                Runnable runnable = (Runnable) obj2;
                ArrayList arrayList4 = (ArrayList) obj;
                if (((String) obj3).equals(eyVar.v)) {
                    p5.h(eyVar.B.Y0).f(arrayList4);
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
                qu0.m((qu0) obj5, (HashSet) obj4, (TL_stories.StoryItem) obj3, (j70) obj2, (l6) obj);
                break;
            case 12:
                fy fyVar = (fy) obj5;
                fyVar.Q4(fyVar.getMessagesController().getChat((Long) obj3), (Runnable) obj, new lq(fyVar, (hd) obj2, (org.telegram.ui.ActionBar.o2) obj4, i12));
                break;
            case 13:
                d61 d61Var = (d61) obj5;
                String[] strArr = (String[]) obj4;
                String str3 = (String) obj3;
                LinkedHashSet linkedHashSet = (LinkedHashSet) obj2;
                Runnable runnable2 = (Runnable) obj;
                int i16 = d61Var.R;
                if (ConnectionsManager.getInstance(i16).getConnectionState() != 3) {
                    runnable2.run();
                    break;
                } else {
                    if (strArr != null && strArr.length != 0) {
                        str = strArr[0];
                    }
                    MediaDataController.getInstance(i16).searchStickers(true, str, str3, new org.telegram.ui.b0(d61Var, linkedHashSet, runnable2, 9));
                    break;
                }
                break;
            case 14:
                d61 d61Var2 = (d61) obj5;
                String str4 = (String) obj3;
                ArrayList arrayList5 = (ArrayList) obj4;
                HashMap hashMap = (HashMap) obj2;
                Runnable runnable3 = (Runnable) obj;
                int i17 = d61Var2.R;
                if (d61Var2.S != 4) {
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
                        MediaDataController.getInstance(i17).getEmojiSuggestions(d61.W1, str4, false, new a1.d(allStickers, hashMap, arrayList5, runnable3, 17), false);
                        break;
                    }
                }
                break;
            case 15:
                org.telegram.ui.web.z0 z0Var = (org.telegram.ui.web.z0) obj5;
                String str5 = (String) obj3;
                ph.i1 i1Var = (ph.i1) obj4;
                String str6 = (String) obj2;
                String str7 = (String) obj;
                if (str7 == null) {
                    z0Var.v("secure_storage_failed", org.telegram.ui.web.z0.y("req_id", str5, "error", "RESTORE_CANCELLED"));
                    break;
                } else {
                    try {
                        i1Var.j(str7);
                        z0Var.v("secure_storage_key_restored", org.telegram.ui.web.z0.y("req_id", str5, "value", (String) i1Var.f(str6).first));
                        break;
                    } catch (Exception e10) {
                        z0Var.v("secure_storage_failed", org.telegram.ui.web.z0.y("req_id", str5, "error", e10.getMessage()));
                        return;
                    }
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
                ofFloat.addUpdateListener(new b3(24, textView, textView2));
                valueAnimatorArr[0].setDuration(320L);
                valueAnimatorArr[0].setInterpolator(jr.h);
                valueAnimatorArr[0].start();
                if (bool.booleanValue()) {
                    AndroidUtilities.runOnUIThread(runnableArr[0], 5320L);
                    break;
                }
                break;
        }
    }

    public /* synthetic */ d1(Object obj, Object obj2, Object obj3, Object obj4, int i10) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
        this.e = obj4;
    }

    public /* synthetic */ d1(Object obj, String str, Object obj2, Object obj3, int i10) {
        this.a = i10;
        this.b = obj;
        this.d = str;
        this.c = obj2;
        this.e = obj3;
    }

    public /* synthetic */ d1(fy fyVar, Long l10, hd hdVar, org.telegram.ui.ActionBar.o2 o2Var) {
        this.a = 12;
        this.b = fyVar;
        this.d = l10;
        this.e = hdVar;
        this.c = o2Var;
    }
}
