package di;

import android.animation.ValueAnimator;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.LongSparseArray;
import android.widget.TextView;
import bi.de;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.concurrent.atomic.AtomicBoolean;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.c20;
import org.telegram.messenger.gz;
import org.telegram.messenger.hd;
import org.telegram.messenger.ij;
import org.telegram.messenger.p10;
import org.telegram.messenger.qi;
import org.telegram.messenger.qp;
import org.telegram.messenger.qs;
import org.telegram.messenger.ui;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.ChatActivityEnterView;
import org.telegram.ui.Components.bn;
import org.telegram.ui.Components.cc;
import org.telegram.ui.Components.gx;
import org.telegram.ui.Components.hc;
import org.telegram.ui.Components.k60;
import org.telegram.ui.Components.lf;
import org.telegram.ui.Components.wk;
import org.telegram.ui.Components.xq;
import org.telegram.ui.Components.xs0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.an;
import org.telegram.ui.bd;
import org.telegram.ui.q11;
import org.telegram.ui.rc;
import org.telegram.ui.rp;
import org.telegram.ui.ww;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes3.dex */
public final /* synthetic */ class s2 implements c20 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ s2(Object obj, Object obj2, Object obj3, Object obj4, int i7) {
        this.a = i7;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
        this.e = obj4;
    }

    /* JADX WARN: Code restructure failed: missing block: B:74:0x01ff, code lost:
    
        if (r11.charAt(r13) <= 57343) goto L78;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x0219, code lost:
    
        if (r11.charAt(r13) != 9794) goto L80;
     */
    @Override // org.telegram.messenger.c20
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(Object obj) {
        String a02;
        int i7 = this.a;
        int i10 = 4;
        int i11 = 0;
        int i12 = 1;
        Object obj2 = this.e;
        Object obj3 = this.d;
        Object obj4 = this.c;
        Object obj5 = this.b;
        switch (i7) {
            case 0:
                TLRPC.TL_document tL_document = (TLRPC.TL_document) obj4;
                Long l10 = (Long) obj;
                i4 i4Var = ((t2) obj5).a;
                gz.C(i4Var.l2).v0(tL_document, (String) obj3, i4Var.k1, null, null, i4Var.x1.a, null, null, true, 0, 0, false, this.e, null, l10.longValue(), i4Var.K1.getSendMonoForumPeerId(), i4Var.K1.getSendMessageSuggestionParams());
                i4Var.K1.l(tL_document);
                i4Var.K1.setFieldText("");
                i4Var.i0(l10.longValue() <= 0);
                break;
            case 1:
                n3 n3Var = (n3) obj5;
                c8 c8Var = (c8) obj4;
                p9 p9Var = (p9) obj3;
                org.telegram.ui.ActionBar.f6 f6Var = (org.telegram.ui.ActionBar.f6) obj2;
                TL_stories.StoryItem storyItem = (TL_stories.StoryItem) obj;
                if (storyItem == null) {
                    cc Q = new hc(n3Var.z0.L0, f6Var).Q(R.raw.story_bomb2, 36, hd.M0(2131744607, null));
                    Q.a = 3;
                    Q.k(true);
                    break;
                } else {
                    org.telegram.ui.ActionBar.f2 Q2 = LaunchActivity.Q();
                    if (Q2 != null) {
                        storyItem.dialogId = c8Var.b.longValue();
                        p9 createOverlayStoryViewer = Q2.createOverlayStoryViewer();
                        createOverlayStoryViewer.L(n3Var.getContext(), storyItem, null);
                        createOverlayStoryViewer.n1 = new l3(p9Var, 0);
                        p9Var.V();
                        break;
                    }
                }
                break;
            case 2:
                TL_stories.StoryItem storyItem2 = (TL_stories.StoryItem) obj3;
                org.telegram.ui.ActionBar.f6 f6Var2 = (org.telegram.ui.ActionBar.f6) obj2;
                r6 r6Var = (r6) obj;
                i4 i4Var2 = ((z3) obj5).x;
                if (((HashSet) obj4).contains(Integer.valueOf(r6Var.a))) {
                    i4Var2.B1.c(r6Var.a, i4Var2.k1, storyItem2);
                    a02 = hd.a0(null, null, 2131744732, r6Var.b);
                } else {
                    y6 y6Var = i4Var2.B1;
                    long j3 = i4Var2.k1;
                    int i13 = r6Var.a;
                    y6Var.getClass();
                    ArrayList arrayList = new ArrayList(1);
                    arrayList.add(storyItem2);
                    y6Var.f0(i13, j3, arrayList);
                    a02 = hd.a0(null, null, 2131744495, r6Var.b);
                }
                org.telegram.messenger.camera.q.s(a02, new hc(i4Var2.L0, f6Var2), R.raw.contact_check, 36);
                z3 z3Var = i4Var2.c1;
                if (z3Var != null) {
                    z3Var.a();
                    break;
                }
                break;
            case 3:
                Runnable[] runnableArr = (Runnable[]) obj5;
                ValueAnimator[] valueAnimatorArr = (ValueAnimator[]) obj4;
                TextView textView = (TextView) obj3;
                TextView textView2 = (TextView) obj2;
                Boolean bool = (Boolean) obj;
                org.telegram.messenger.g0.r(runnableArr[0]);
                ValueAnimator valueAnimator = valueAnimatorArr[0];
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                }
                ValueAnimator ofFloat = ValueAnimator.ofFloat(textView.getAlpha(), bool.booleanValue() ? 1.0f : 0.0f);
                valueAnimatorArr[0] = ofFloat;
                ofFloat.addUpdateListener(new de(i10, textView, textView2));
                valueAnimatorArr[0].setDuration(320L);
                valueAnimatorArr[0].setInterpolator(xq.h);
                valueAnimatorArr[0].start();
                if (bool.booleanValue()) {
                    org.telegram.messenger.g0.i3(runnableArr[0], 5320L);
                    break;
                }
                break;
            case 4:
                org.telegram.messenger.g0.h3(new bi.u0((rc) obj5, (boolean[]) obj4, (int[]) obj3, (int[]) obj2, (TLRPC.TL_error) obj, 22));
                break;
            case 5:
                ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) obj5;
                ij ijVar = (ij) obj4;
                TL_keyboard.TL_buttonTypeRequestPeer tL_buttonTypeRequestPeer = (TL_keyboard.TL_buttonTypeRequestPeer) obj3;
                TLRPC.User user = (TLRPC.User) obj2;
                TLRPC.User user2 = (TLRPC.User) obj;
                int i14 = ChatActivityEnterView.s5;
                if (user2 != null) {
                    TLRPC.TL_messages_sendBotRequestedPeer tL_messages_sendBotRequestedPeer = new TLRPC.TL_messages_sendBotRequestedPeer();
                    tL_messages_sendBotRequestedPeer.peer = qp.s1(chatActivityEnterView.Q).m1(ijVar.k.peer_id);
                    tL_messages_sendBotRequestedPeer.flags |= 1;
                    tL_messages_sendBotRequestedPeer.msg_id = ijVar.f1();
                    tL_messages_sendBotRequestedPeer.button_id = tL_buttonTypeRequestPeer.button_id;
                    tL_messages_sendBotRequestedPeer.requested_peers.add(qp.n1(user2));
                    ConnectionsManager.getInstance(chatActivityEnterView.Q).sendRequest(tL_messages_sendBotRequestedPeer, null);
                    long j10 = user.id;
                    Bundle bundle = new Bundle();
                    bundle.putLong("user_id", user2.id);
                    lf lfVar = new lf(bundle, user2, user, j10);
                    an anVar = chatActivityEnterView.P2;
                    if (anVar != null) {
                        anVar.presentFragment(lfVar);
                        break;
                    }
                }
                break;
            case 6:
                wk.X((wk) obj5, (an) obj4, (TLRPC.TL_messageMediaGeo) obj3, (org.telegram.ui.ActionBar.f6) obj2, (Long) obj);
                break;
            case 7:
                wk.P((wk) obj5, (an) obj4, (TLRPC.TL_messageMediaVenue) obj3, (org.telegram.ui.ActionBar.f6) obj2);
                break;
            case 8:
                bn bnVar = (bn) obj5;
                an anVar2 = (an) obj4;
                TLRPC.TL_messageMediaPoll tL_messageMediaPoll = (TLRPC.TL_messageMediaPoll) obj3;
                ArrayList arrayList2 = (ArrayList) obj2;
                Long l11 = (Long) obj;
                if (anVar2.c()) {
                    org.telegram.ui.Components.v4.I(anVar2.getParentActivity(), anVar2.a(), new a1.d(bnVar, tL_messageMediaPoll, arrayList2, l11, 11));
                    break;
                } else {
                    bnVar.j0.b(tL_messageMediaPoll, bnVar.O, bnVar.m1, arrayList2, true, 0, l11.longValue());
                    bnVar.b.a(true);
                    break;
                }
            case 9:
                gx gxVar = (gx) obj5;
                ArrayList arrayList3 = (ArrayList) obj4;
                Runnable runnable = (Runnable) obj2;
                ArrayList arrayList4 = (ArrayList) obj;
                if (((String) obj3).equals(gxVar.w)) {
                    org.telegram.ui.Components.i5.g(gxVar.F.c1).f(arrayList4);
                    int size = arrayList4.size();
                    while (i11 < size) {
                        Object obj6 = arrayList4.get(i11);
                        i11++;
                        qi qiVar = new qi();
                        qiVar.a = "animated_" + ((TLRPC.Document) obj6).id;
                        qiVar.b = null;
                        arrayList3.add(qiVar);
                    }
                    runnable.run();
                    break;
                }
                break;
            case 10:
                xs0.j((xs0) obj5, (HashSet) obj4, (TL_stories.StoryItem) obj3, (k60) obj2, (r6) obj);
                break;
            case 11:
                ww wwVar = (ww) obj5;
                wwVar.c5(wwVar.getMessagesController().M0((Long) obj4), (Runnable) obj, new rp(wwVar, (bd) obj3, (org.telegram.ui.ActionBar.f2) obj2, i12));
                break;
            case 12:
                q11 q11Var = (q11) obj5;
                String[] strArr = (String[]) obj4;
                String str = (String) obj3;
                LinkedHashSet linkedHashSet = (LinkedHashSet) obj2;
                Runnable runnable2 = (Runnable) obj;
                int i15 = q11Var.V;
                if (ConnectionsManager.getInstance(i15).getConnectionState() != 3) {
                    runnable2.run();
                    break;
                } else {
                    ui.b0(i15).Z1(true, strArr.length != 0 ? strArr[0] : "", str, new org.telegram.ui.y(q11Var, linkedHashSet, runnable2, 13), false);
                    break;
                }
            case 13:
                q11 q11Var2 = (q11) obj5;
                String str2 = (String) obj3;
                ArrayList arrayList5 = (ArrayList) obj4;
                HashMap hashMap = (HashMap) obj2;
                Runnable runnable3 = (Runnable) obj;
                int i16 = q11Var2.V;
                if (q11Var2.W != 4) {
                    runnable3.run();
                    break;
                } else {
                    ArrayList arrayList6 = new ArrayList(0);
                    LongSparseArray longSparseArray = new LongSparseArray(0);
                    HashMap hashMap2 = ui.b0(i16).d0;
                    if (str2.length() <= 14) {
                        int length = str2.length();
                        int i17 = 0;
                        CharSequence charSequence = str2;
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
                        ArrayList arrayList7 = hashMap2 != null ? (ArrayList) hashMap2.get(charSequence.toString()) : null;
                        if (arrayList7 != null && !arrayList7.isEmpty()) {
                            arrayList6.addAll(arrayList7);
                            int size2 = arrayList7.size();
                            for (int i20 = 0; i20 < size2; i20++) {
                                TLRPC.Document document = (TLRPC.Document) arrayList7.get(i20);
                                longSparseArray.put(document.id, document);
                            }
                            arrayList5.add(arrayList6);
                        }
                    }
                    if (hashMap2 != null && !hashMap2.isEmpty() && str2.length() > 1) {
                        ui.b0(i16).U(q11.b2, str2, false, new a1.d(hashMap2, hashMap, arrayList5, runnable3, 19), false);
                        break;
                    }
                }
                break;
            case 14:
                org.telegram.ui.web.x0 x0Var = (org.telegram.ui.web.x0) obj5;
                o7 o7Var = (o7) obj4;
                String str3 = (String) obj3;
                TL_keyboard.TL_buttonTypeRequestPeer tL_buttonTypeRequestPeer2 = (TL_keyboard.TL_buttonTypeRequestPeer) obj2;
                TLRPC.User user3 = (TLRPC.User) obj;
                if (user3 == null) {
                    x0Var.x(o7Var, "requested_chat_failed", org.telegram.ui.web.x0.A(str3, "req_id"));
                    break;
                } else {
                    TLRPC.TL_messages_sendBotRequestedPeer tL_messages_sendBotRequestedPeer2 = new TLRPC.TL_messages_sendBotRequestedPeer();
                    tL_messages_sendBotRequestedPeer2.peer = qp.n1(x0Var.U);
                    tL_messages_sendBotRequestedPeer2.webapp_req_id = str3;
                    tL_messages_sendBotRequestedPeer2.button_id = tL_buttonTypeRequestPeer2.button_id;
                    tL_messages_sendBotRequestedPeer2.requested_peers.add(qp.n1(user3));
                    ConnectionsManager.getInstance(x0Var.M).sendRequestTyped(tL_messages_sendBotRequestedPeer2, new d3.b(1), new bi.q2(x0Var, o7Var, str3, user3, 3));
                    x0Var.x(o7Var, "requested_chat_sent", org.telegram.ui.web.x0.A(str3, "req_id"));
                    break;
                }
            case 15:
                org.telegram.ui.web.x0 x0Var2 = (org.telegram.ui.web.x0) obj5;
                o7 o7Var2 = (o7) obj4;
                String str4 = (String) obj3;
                String str5 = (String) obj2;
                if (((Boolean) obj).booleanValue()) {
                    x0Var2.l0.b(str4, str5);
                    x0Var2.x(o7Var2, "file_download_requested", org.telegram.ui.web.x0.A("downloading", "status"));
                    break;
                } else {
                    x0Var2.x(o7Var2, "file_download_requested", org.telegram.ui.web.x0.A("cancelled", "status"));
                    break;
                }
            case 16:
                org.telegram.ui.ActionBar.f2 f2Var = (org.telegram.ui.ActionBar.f2) obj4;
                String str6 = (String) obj3;
                vf.b bVar = (vf.b) obj2;
                TLRPC.TL_payments_checkedGiftCode tL_payments_checkedGiftCode = (TLRPC.TL_payments_checkedGiftCode) obj;
                if (!((AtomicBoolean) obj5).get() && f2Var.getParentActivity() != null) {
                    if (tL_payments_checkedGiftCode.from_id == null) {
                        TLRPC.TL_premiumGiftOption tL_premiumGiftOption = new TLRPC.TL_premiumGiftOption();
                        tL_premiumGiftOption.months = tL_payments_checkedGiftCode.months;
                        TLRPC.User j11 = f2Var instanceof an ? ((an) f2Var).j() : null;
                        if (j11 == null || j11.self) {
                            j11 = new TLRPC.TL_user();
                        }
                        TLRPC.User user4 = j11;
                        boolean z9 = tL_payments_checkedGiftCode.used_date != 0;
                        org.telegram.ui.ActionBar.f2 Q3 = LaunchActivity.Q();
                        if (Q3 != null && wg.g0.K2 == null) {
                            wg.g0 g0Var = new wg.g0(Q3, p10.s0, user4, new ug.j(tL_premiumGiftOption), str6, z9, Q3.getResourceProvider());
                            g0Var.show();
                            wg.g0.K2 = g0Var;
                        }
                    } else {
                        f2Var.showDialog(new wg.c0(f2Var, tL_payments_checkedGiftCode, str6));
                    }
                    if (bVar != null) {
                        bVar.b();
                        break;
                    }
                }
                break;
            case 17:
                wg.q0 q0Var = (wg.q0) obj5;
                qp.s1(q0Var.a).G0().a(-((TLRPC.Chat) obj4).id, new s2(q0Var, (TL_stories.TL_premium_myBoosts) obj, (ArrayList) obj3, (HashSet) obj2, 18));
                break;
            case 18:
                ((wg.q0) obj5).dismiss();
                qs.f(p10.s0).k(qs.U2, (TL_stories.TL_premium_myBoosts) obj4, Integer.valueOf(((ArrayList) obj3).size()), Integer.valueOf(((HashSet) obj2).size()), (TL_stories.TL_premium_boostsStatus) obj);
                break;
            default:
                zh.h1 h1Var = (zh.h1) obj5;
                c20 c20Var = (c20) obj3;
                bi.i5 i5Var = (bi.i5) obj2;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj;
                ((vf.b) obj4).b();
                if (c20Var != null) {
                    c20Var.a(Boolean.FALSE);
                }
                h1Var.dismiss();
                if (tL_error != null) {
                    org.telegram.messenger.g0.h3(new wi.q(11, i5Var, tL_error));
                    break;
                } else {
                    h1Var.dismiss();
                    break;
                }
        }
    }

    public /* synthetic */ s2(Object obj, String str, ArrayList arrayList, Object obj2, int i7) {
        this.a = i7;
        this.b = obj;
        this.d = str;
        this.c = arrayList;
        this.e = obj2;
    }
}
