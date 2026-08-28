package bg;

import android.animation.ValueAnimator;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.LongSparseArray;
import android.widget.TextView;
import ih.b4;
import ih.i4;
import ih.o6;
import ih.v6;
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
import org.telegram.ui.ActionBar.b6;
import org.telegram.ui.Components.ChatActivityEnterView;
import org.telegram.ui.Components.eu0;
import org.telegram.ui.Components.gr;
import org.telegram.ui.Components.jn;
import org.telegram.ui.Components.k5;
import org.telegram.ui.Components.oc;
import org.telegram.ui.Components.tf;
import org.telegram.ui.Components.vx;
import org.telegram.ui.Components.x60;
import org.telegram.ui.Components.xk;
import org.telegram.ui.Components.y4;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.b61;
import org.telegram.ui.dy;
import org.telegram.ui.id;
import org.telegram.ui.jq;
import org.telegram.ui.qn;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class j1 implements Utilities.Callback {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ j1(fh.p2 p2Var, ve.d dVar, Utilities.Callback callback, fh.y1 y1Var) {
        this.a = 2;
        this.b = p2Var;
        this.e = dVar;
        this.c = callback;
        this.d = y1Var;
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
        int i9 = this.a;
        String str = "";
        int i10 = 0;
        int i11 = 1;
        Object obj2 = this.e;
        Object obj3 = this.d;
        Object obj4 = this.c;
        Object obj5 = this.b;
        switch (i9) {
            case 0:
                org.telegram.ui.ActionBar.o2 o2Var = (org.telegram.ui.ActionBar.o2) obj4;
                String str2 = (String) obj3;
                ve.d dVar = (ve.d) obj2;
                TLRPC.TL_payments_checkedGiftCode tL_payments_checkedGiftCode = (TLRPC.TL_payments_checkedGiftCode) obj;
                if (!((AtomicBoolean) obj5).get() && o2Var.getParentActivity() != null) {
                    if (tL_payments_checkedGiftCode.from_id == null) {
                        TLRPC.TL_premiumGiftOption tL_premiumGiftOption = new TLRPC.TL_premiumGiftOption();
                        tL_premiumGiftOption.months = tL_payments_checkedGiftCode.months;
                        TLRPC.User i12 = o2Var instanceof qn ? ((qn) o2Var).i() : null;
                        if (i12 == null || i12.self) {
                            i12 = new TLRPC.TL_user();
                        }
                        TLRPC.User user = i12;
                        boolean z10 = tL_payments_checkedGiftCode.used_date != 0;
                        org.telegram.ui.ActionBar.o2 R = LaunchActivity.R();
                        if (R != null && p1.O0 == null) {
                            p1 p1Var = new p1(R, UserConfig.selectedAccount, user, new zf.k(tL_premiumGiftOption), str2, z10, R.getResourceProvider());
                            p1Var.show();
                            p1.O0 = p1Var;
                        }
                    } else {
                        o2Var.showDialog(new l1(o2Var, tL_payments_checkedGiftCode, str2));
                    }
                    if (dVar != null) {
                        dVar.b();
                        break;
                    }
                }
                break;
            case 1:
                MessagesController.getInstance(r10.currentAccount).getBoostsController().getBoostsStats(-((TLRPC.Chat) obj4).id, new v1((g2) obj5, (TL_stories.TL_premium_myBoosts) obj, (ArrayList) obj3, (HashSet) obj2, 0));
                break;
            case 2:
                fh.p2 p2Var = (fh.p2) obj5;
                Utilities.Callback callback = (Utilities.Callback) obj4;
                fh.y1 y1Var = (fh.y1) obj3;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj;
                ((ve.d) obj2).b();
                if (callback != null) {
                    callback.run(Boolean.FALSE);
                }
                p2Var.dismiss();
                if (tL_error != null) {
                    AndroidUtilities.runOnUIThread(new e5.u(5, y1Var, tL_error));
                    break;
                } else {
                    p2Var.dismiss();
                    break;
                }
            case 3:
                TLRPC.TL_document tL_document = (TLRPC.TL_document) obj4;
                Long l10 = (Long) obj;
                i4 i4Var = ((ih.t2) obj5).a;
                SendMessagesHelper.getInstance(i4Var.y2).sendSticker(tL_document, (String) obj3, i4Var.x1, null, null, i4Var.K1.a, null, null, true, 0, 0, false, this.e, null, l10.longValue(), i4Var.X1.getSendMonoForumPeerId(), i4Var.X1.getSendMessageSuggestionParams());
                i4Var.X1.o(tL_document);
                i4Var.X1.setFieldText("");
                i4Var.k0(l10.longValue() <= 0);
                break;
            case 4:
                TL_stories.StoryItem storyItem = (TL_stories.StoryItem) obj3;
                b6 b6Var = (b6) obj2;
                o6 o6Var = (o6) obj;
                i4 i4Var2 = ((b4) obj5).l;
                if (((HashSet) obj4).contains(Integer.valueOf(o6Var.a))) {
                    i4Var2.O1.c(o6Var.a, i4Var2.x1, storyItem);
                    formatString = LocaleController.formatString(R.string.StoryAddedToAlbumX, o6Var.b);
                } else {
                    v6 v6Var = i4Var2.O1;
                    long j10 = i4Var2.x1;
                    int i13 = o6Var.a;
                    v6Var.getClass();
                    ArrayList arrayList = new ArrayList(1);
                    arrayList.add(storyItem);
                    v6Var.c0(i13, j10, arrayList);
                    formatString = LocaleController.formatString(R.string.StoryRemovedFromAlbumX, o6Var.b);
                }
                new oc(i4Var2.Y0, b6Var).Q(R.raw.contact_check, 36, AndroidUtilities.replaceTags(formatString)).j();
                b4 b4Var = i4Var2.p1;
                if (b4Var != null) {
                    b4Var.a();
                    break;
                }
                break;
            case 5:
                AndroidUtilities.runOnUIThread(new o0(obj5, obj4, obj3, obj2, (TLRPC.TL_error) obj, 24));
                break;
            case 6:
                ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) obj5;
                MessageObject messageObject = (MessageObject) obj4;
                TL_keyboard.TL_buttonTypeRequestPeer tL_buttonTypeRequestPeer = (TL_keyboard.TL_buttonTypeRequestPeer) obj3;
                TLRPC.User user2 = (TLRPC.User) obj2;
                TLRPC.User user3 = (TLRPC.User) obj;
                int i14 = ChatActivityEnterView.i5;
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
                    tf tfVar = new tf(bundle, user3, user2, j11);
                    qn qnVar = chatActivityEnterView.K2;
                    if (qnVar != null) {
                        qnVar.presentFragment(tfVar);
                        break;
                    }
                }
                break;
            case 7:
                xk.K((xk) obj5, (qn) obj4, (TLRPC.TL_messageMediaGeo) obj3, (b6) obj2, (Long) obj);
                break;
            case 8:
                xk.O((xk) obj5, (qn) obj4, (TLRPC.TL_messageMediaVenue) obj3, (b6) obj2);
                break;
            case 9:
                jn jnVar = (jn) obj5;
                qn qnVar2 = (qn) obj4;
                TLRPC.TL_messageMediaPoll tL_messageMediaPoll = (TLRPC.TL_messageMediaPoll) obj3;
                ArrayList arrayList2 = (ArrayList) obj2;
                Long l11 = (Long) obj;
                if (qnVar2.c()) {
                    y4.L(qnVar2.getParentActivity(), qnVar2.a(), new a1.d(jnVar, tL_messageMediaPoll, arrayList2, l11, 10));
                    break;
                } else {
                    jnVar.f0.e(tL_messageMediaPoll, jnVar.K, jnVar.h1, arrayList2, true, 0, l11.longValue());
                    jnVar.b.dismiss(true);
                    break;
                }
            case 10:
                vx vxVar = (vx) obj5;
                ArrayList arrayList3 = (ArrayList) obj4;
                Runnable runnable = (Runnable) obj2;
                ArrayList arrayList4 = (ArrayList) obj;
                if (((String) obj3).equals(vxVar.v)) {
                    k5.h(vxVar.B.Y0).f(arrayList4);
                    int size = arrayList4.size();
                    while (i10 < size) {
                        Object obj6 = arrayList4.get(i10);
                        i10++;
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
                eu0.m((eu0) obj5, (HashSet) obj4, (TL_stories.StoryItem) obj3, (x60) obj2, (o6) obj);
                break;
            case 12:
                dy dyVar = (dy) obj5;
                dyVar.Q4(dyVar.getMessagesController().getChat((Long) obj3), (Runnable) obj, new jq(dyVar, (id) obj2, (org.telegram.ui.ActionBar.o2) obj4, i11));
                break;
            case 13:
                b61 b61Var = (b61) obj5;
                String[] strArr = (String[]) obj4;
                String str3 = (String) obj3;
                LinkedHashSet linkedHashSet = (LinkedHashSet) obj2;
                Runnable runnable2 = (Runnable) obj;
                int i15 = b61Var.R;
                if (ConnectionsManager.getInstance(i15).getConnectionState() != 3) {
                    runnable2.run();
                    break;
                } else {
                    if (strArr != null && strArr.length != 0) {
                        str = strArr[0];
                    }
                    MediaDataController.getInstance(i15).searchStickers(true, str, str3, new org.telegram.ui.a0(b61Var, linkedHashSet, runnable2, 9));
                    break;
                }
                break;
            case 14:
                b61 b61Var2 = (b61) obj5;
                String str4 = (String) obj3;
                ArrayList arrayList5 = (ArrayList) obj4;
                HashMap hashMap = (HashMap) obj2;
                Runnable runnable3 = (Runnable) obj;
                int i16 = b61Var2.R;
                if (b61Var2.S != 4) {
                    runnable3.run();
                    break;
                } else {
                    ArrayList arrayList6 = new ArrayList(0);
                    LongSparseArray longSparseArray = new LongSparseArray(0);
                    HashMap<String, ArrayList<TLRPC.Document>> allStickers = MediaDataController.getInstance(i16).getAllStickers();
                    if (str4.length() <= 14) {
                        int length = str4.length();
                        CharSequence charSequence = str4;
                        int i17 = 0;
                        while (i17 < length) {
                            if (i17 < length - 1) {
                                if (charSequence.charAt(i17) == 55356) {
                                    int i18 = i17 + 1;
                                    if (charSequence.charAt(i18) >= 57339) {
                                        break;
                                    }
                                }
                                if (charSequence.charAt(i17) == 8205) {
                                    int i19 = i17 + 1;
                                    if (charSequence.charAt(i19) != 9792) {
                                        break;
                                    }
                                    charSequence = TextUtils.concat(charSequence.subSequence(0, i17), charSequence.subSequence(i17 + 2, charSequence.length()));
                                    length -= 2;
                                    i17--;
                                    i17++;
                                }
                            }
                            if (charSequence.charAt(i17) == 65039) {
                                charSequence = TextUtils.concat(charSequence.subSequence(0, i17), charSequence.subSequence(i17 + 1, charSequence.length()));
                                length--;
                                i17--;
                                i17++;
                            } else {
                                i17++;
                            }
                        }
                        ArrayList<TLRPC.Document> arrayList7 = allStickers != null ? allStickers.get(charSequence.toString()) : null;
                        if (arrayList7 != null && !arrayList7.isEmpty()) {
                            arrayList6.addAll(arrayList7);
                            int size2 = arrayList7.size();
                            for (int i20 = 0; i20 < size2; i20++) {
                                TLRPC.Document document = arrayList7.get(i20);
                                longSparseArray.put(document.id, document);
                            }
                            arrayList5.add(arrayList6);
                        }
                    }
                    if (allStickers != null && !allStickers.isEmpty() && str4.length() > 1) {
                        MediaDataController.getInstance(i16).getEmojiSuggestions(b61.W1, str4, false, new a1.d(allStickers, hashMap, arrayList5, runnable3, 18), false);
                        break;
                    }
                }
                break;
            case 15:
                org.telegram.ui.web.y0 y0Var = (org.telegram.ui.web.y0) obj5;
                String str5 = (String) obj3;
                mh.p1 p1Var2 = (mh.p1) obj4;
                String str6 = (String) obj2;
                String str7 = (String) obj;
                if (str7 == null) {
                    y0Var.v("secure_storage_failed", org.telegram.ui.web.y0.y("req_id", str5, "error", "RESTORE_CANCELLED"));
                    break;
                } else {
                    try {
                        p1Var2.j(str7);
                        y0Var.v("secure_storage_key_restored", org.telegram.ui.web.y0.y("req_id", str5, "value", (String) p1Var2.f(str6).first));
                        break;
                    } catch (Exception e10) {
                        y0Var.v("secure_storage_failed", org.telegram.ui.web.y0.y("req_id", str5, "error", e10.getMessage()));
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
                ofFloat.addUpdateListener(new f2.g(22, textView, textView2));
                valueAnimatorArr[0].setDuration(320L);
                valueAnimatorArr[0].setInterpolator(gr.h);
                valueAnimatorArr[0].start();
                if (bool.booleanValue()) {
                    AndroidUtilities.runOnUIThread(runnableArr[0], 5320L);
                    break;
                }
                break;
        }
    }

    public /* synthetic */ j1(Object obj, Object obj2, Object obj3, Object obj4, int i9) {
        this.a = i9;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
        this.e = obj4;
    }

    public /* synthetic */ j1(Object obj, String str, Object obj2, Object obj3, int i9) {
        this.a = i9;
        this.b = obj;
        this.d = str;
        this.c = obj2;
        this.e = obj3;
    }

    public /* synthetic */ j1(dy dyVar, Long l10, id idVar, org.telegram.ui.ActionBar.o2 o2Var) {
        this.a = 12;
        this.b = dyVar;
        this.d = l10;
        this.e = idVar;
        this.c = o2Var;
    }
}
