package hg;

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
import oh.f4;
import oh.m6;
import oh.t6;
import oh.y3;
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
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Components.ChatActivityEnterView;
import org.telegram.ui.Components.cl;
import org.telegram.ui.Components.l5;
import org.telegram.ui.Components.ly;
import org.telegram.ui.Components.pr;
import org.telegram.ui.Components.q70;
import org.telegram.ui.Components.qc;
import org.telegram.ui.Components.sn;
import org.telegram.ui.Components.tf;
import org.telegram.ui.Components.z4;
import org.telegram.ui.Components.zu0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.bd;
import org.telegram.ui.nd;
import org.telegram.ui.py;
import org.telegram.ui.r61;
import org.telegram.ui.sq;
import org.telegram.ui.xn;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final /* synthetic */ class c1 implements Utilities.Callback {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ c1(int i10, Object obj, Object obj2, Object obj3, String str) {
        this.a = i10;
        this.b = obj;
        this.d = str;
        this.c = obj2;
        this.e = obj3;
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
                org.telegram.ui.ActionBar.p2 p2Var = (org.telegram.ui.ActionBar.p2) obj4;
                String str2 = (String) obj3;
                af.f fVar = (af.f) obj2;
                TLRPC.TL_payments_checkedGiftCode tL_payments_checkedGiftCode = (TLRPC.TL_payments_checkedGiftCode) obj;
                if (!((AtomicBoolean) obj5).get() && p2Var.getParentActivity() != null) {
                    if (tL_payments_checkedGiftCode.from_id == null) {
                        TLRPC.TL_premiumGiftOption tL_premiumGiftOption = new TLRPC.TL_premiumGiftOption();
                        tL_premiumGiftOption.months = tL_payments_checkedGiftCode.months;
                        TLRPC.User i13 = p2Var instanceof xn ? ((xn) p2Var).i() : null;
                        if (i13 == null || i13.self) {
                            i13 = new TLRPC.TL_user();
                        }
                        TLRPC.User user = i13;
                        boolean z4 = tL_payments_checkedGiftCode.used_date != 0;
                        org.telegram.ui.ActionBar.p2 R = LaunchActivity.R();
                        if (R != null && i1.P0 == null) {
                            i1 i1Var = new i1(R, UserConfig.selectedAccount, user, new fg.n(tL_premiumGiftOption), str2, z4, R.getResourceProvider());
                            i1Var.show();
                            i1.P0 = i1Var;
                        }
                    } else {
                        p2Var.showDialog(new e1(p2Var, tL_payments_checkedGiftCode, str2));
                    }
                    if (fVar != null) {
                        fVar.b();
                        break;
                    }
                }
                break;
            case 1:
                MessagesController.getInstance(r10.currentAccount).getBoostsController().getBoostsStats(-((TLRPC.Chat) obj4).id, new n1((w1) obj5, (TL_stories.TL_premium_myBoosts) obj, (ArrayList) obj3, (HashSet) obj2, 0));
                break;
            case 2:
                lh.g2 g2Var = (lh.g2) obj5;
                Utilities.Callback callback = (Utilities.Callback) obj4;
                lh.r1 r1Var = (lh.r1) obj3;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj;
                ((af.f) obj2).b();
                if (callback != null) {
                    callback.run(Boolean.FALSE);
                }
                g2Var.dismiss();
                if (tL_error != null) {
                    AndroidUtilities.runOnUIThread(new gf.c(23, r1Var, tL_error));
                    break;
                } else {
                    g2Var.dismiss();
                    break;
                }
            case 3:
                TLRPC.TL_document tL_document = (TLRPC.TL_document) obj4;
                Long l10 = (Long) obj;
                f4 f4Var = ((oh.t2) obj5).a;
                SendMessagesHelper.getInstance(f4Var.z2).sendSticker(tL_document, (String) obj3, f4Var.y1, null, null, f4Var.L1.a, null, null, true, 0, 0, false, this.e, null, l10.longValue(), f4Var.Y1.getSendMonoForumPeerId(), f4Var.Y1.getSendMessageSuggestionParams());
                f4Var.Y1.o(tL_document);
                f4Var.Y1.setFieldText("");
                f4Var.k0(l10.longValue() <= 0);
                break;
            case 4:
                TL_stories.StoryItem storyItem = (TL_stories.StoryItem) obj3;
                g6 g6Var = (g6) obj2;
                m6 m6Var = (m6) obj;
                f4 f4Var2 = ((y3) obj5).l;
                if (((HashSet) obj4).contains(Integer.valueOf(m6Var.a))) {
                    f4Var2.P1.c(m6Var.a, f4Var2.y1, storyItem);
                    formatString = LocaleController.formatString(R.string.StoryAddedToAlbumX, m6Var.b);
                } else {
                    t6 t6Var = f4Var2.P1;
                    long j10 = f4Var2.y1;
                    int i14 = m6Var.a;
                    t6Var.getClass();
                    ArrayList arrayList = new ArrayList(1);
                    arrayList.add(storyItem);
                    t6Var.c0(i14, j10, arrayList);
                    formatString = LocaleController.formatString(R.string.StoryRemovedFromAlbumX, m6Var.b);
                }
                new qc(f4Var2.Z0, g6Var).Q(R.raw.contact_check, 36, AndroidUtilities.replaceTags(formatString)).j();
                y3 y3Var = f4Var2.q1;
                if (y3Var != null) {
                    y3Var.a();
                    break;
                }
                break;
            case 5:
                AndroidUtilities.runOnUIThread(new j0(21, (bd) obj5, (boolean[]) obj4, (int[]) obj3, (int[]) obj2, (TLRPC.TL_error) obj));
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
                    xn xnVar = chatActivityEnterView.L2;
                    if (xnVar != null) {
                        xnVar.presentFragment(tfVar);
                        break;
                    }
                }
                break;
            case 7:
                cl.K((cl) obj5, (xn) obj4, (TLRPC.TL_messageMediaGeo) obj3, (g6) obj2, (Long) obj);
                break;
            case 8:
                cl.P((cl) obj5, (xn) obj4, (TLRPC.TL_messageMediaVenue) obj3, (g6) obj2);
                break;
            case 9:
                sn snVar = (sn) obj5;
                xn xnVar2 = (xn) obj4;
                TLRPC.TL_messageMediaPoll tL_messageMediaPoll = (TLRPC.TL_messageMediaPoll) obj3;
                ArrayList arrayList2 = (ArrayList) obj2;
                Long l11 = (Long) obj;
                if (xnVar2.c()) {
                    z4.L(xnVar2.getParentActivity(), xnVar2.a(), new a1.d(snVar, tL_messageMediaPoll, arrayList2, l11, 9));
                    break;
                } else {
                    snVar.g0.b(tL_messageMediaPoll, snVar.L, snVar.i1, arrayList2, true, 0, l11.longValue());
                    snVar.b.dismiss(true);
                    break;
                }
            case 10:
                ly lyVar = (ly) obj5;
                ArrayList arrayList3 = (ArrayList) obj4;
                Runnable runnable = (Runnable) obj2;
                ArrayList arrayList4 = (ArrayList) obj;
                if (((String) obj3).equals(lyVar.v)) {
                    l5.h(lyVar.C.Z0).f(arrayList4);
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
                zu0.m((zu0) obj5, (HashSet) obj4, (TL_stories.StoryItem) obj3, (q70) obj2, (m6) obj);
                break;
            case 12:
                py pyVar = (py) obj5;
                pyVar.Q4(pyVar.getMessagesController().getChat((Long) obj3), (Runnable) obj, new sq(pyVar, (nd) obj2, (org.telegram.ui.ActionBar.p2) obj4, i12));
                break;
            case 13:
                r61 r61Var = (r61) obj5;
                String[] strArr = (String[]) obj4;
                String str3 = (String) obj3;
                LinkedHashSet linkedHashSet = (LinkedHashSet) obj2;
                Runnable runnable2 = (Runnable) obj;
                int i16 = r61Var.S;
                if (ConnectionsManager.getInstance(i16).getConnectionState() != 3) {
                    runnable2.run();
                    break;
                } else {
                    if (strArr != null && strArr.length != 0) {
                        str = strArr[0];
                    }
                    MediaDataController.getInstance(i16).searchStickers(true, str, str3, new org.telegram.ui.a0(r61Var, linkedHashSet, runnable2, 9));
                    break;
                }
                break;
            case 14:
                r61 r61Var2 = (r61) obj5;
                String str4 = (String) obj3;
                ArrayList arrayList5 = (ArrayList) obj4;
                HashMap hashMap = (HashMap) obj2;
                Runnable runnable3 = (Runnable) obj;
                int i17 = r61Var2.S;
                if (r61Var2.T != 4) {
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
                        MediaDataController.getInstance(i17).getEmojiSuggestions(r61.X1, str4, false, new a1.d(allStickers, hashMap, arrayList5, runnable3, 17), false);
                        break;
                    }
                }
                break;
            case 15:
                org.telegram.ui.web.a1 a1Var = (org.telegram.ui.web.a1) obj5;
                String str5 = (String) obj3;
                sh.i1 i1Var2 = (sh.i1) obj4;
                String str6 = (String) obj2;
                String str7 = (String) obj;
                if (str7 == null) {
                    a1Var.v("secure_storage_failed", org.telegram.ui.web.a1.y("req_id", str5, "error", "RESTORE_CANCELLED"));
                    break;
                } else {
                    try {
                        i1Var2.j(str7);
                        a1Var.v("secure_storage_key_restored", org.telegram.ui.web.a1.y("req_id", str5, "value", (String) i1Var2.f(str6).first));
                        break;
                    } catch (Exception e6) {
                        a1Var.v("secure_storage_failed", org.telegram.ui.web.a1.y("req_id", str5, "error", e6.getMessage()));
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
                ofFloat.addUpdateListener(new bg.a(25, textView, textView2));
                valueAnimatorArr[0].setDuration(320L);
                valueAnimatorArr[0].setInterpolator(pr.h);
                valueAnimatorArr[0].start();
                if (bool.booleanValue()) {
                    AndroidUtilities.runOnUIThread(runnableArr[0], 5320L);
                    break;
                }
                break;
        }
    }

    public /* synthetic */ c1(Object obj, Object obj2, Object obj3, Object obj4, int i10) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
        this.e = obj4;
    }

    public /* synthetic */ c1(lh.g2 g2Var, af.f fVar, Utilities.Callback callback, lh.r1 r1Var) {
        this.a = 2;
        this.b = g2Var;
        this.e = fVar;
        this.c = callback;
        this.d = r1Var;
    }

    public /* synthetic */ c1(py pyVar, Long l10, nd ndVar, org.telegram.ui.ActionBar.p2 p2Var) {
        this.a = 12;
        this.b = pyVar;
        this.d = l10;
        this.e = ndVar;
        this.c = p2Var;
    }
}
