package bi;

import android.animation.ValueAnimator;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.LongSparseArray;
import android.widget.TextView;
import fi.i7;
import fi.i9;
import fi.v7;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.concurrent.atomic.AtomicBoolean;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.ez;
import org.telegram.messenger.gj;
import org.telegram.messenger.hd;
import org.telegram.messenger.i20;
import org.telegram.messenger.m10;
import org.telegram.messenger.np;
import org.telegram.messenger.ns;
import org.telegram.messenger.oi;
import org.telegram.messenger.si;
import org.telegram.messenger.z10;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.ChatActivityEnterView;
import org.telegram.ui.Components.cc;
import org.telegram.ui.Components.dl;
import org.telegram.ui.Components.er;
import org.telegram.ui.Components.jn;
import org.telegram.ui.Components.lx;
import org.telegram.ui.Components.m60;
import org.telegram.ui.Components.rf;
import org.telegram.ui.Components.xb;
import org.telegram.ui.Components.ys0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ad;
import org.telegram.ui.an;
import org.telegram.ui.n11;
import org.telegram.ui.qc;
import org.telegram.ui.tp;
import org.telegram.ui.yw;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final /* synthetic */ class o1 implements z10 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ o1(Object obj, Object obj2, Object obj3, Object obj4, int i7) {
        this.a = i7;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
        this.e = obj4;
    }

    /* JADX WARN: Code restructure failed: missing block: B:65:0x01d5, code lost:
    
        if (r12.charAt(r13) <= 57343) goto L70;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x01ef, code lost:
    
        if (r12.charAt(r13) != 9794) goto L72;
     */
    @Override // org.telegram.messenger.z10
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
                s2 s2Var = (s2) obj5;
                z10 z10Var = (z10) obj3;
                b2 b2Var = (b2) obj2;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj;
                ((vf.b) obj4).b();
                if (z10Var != null) {
                    z10Var.a(Boolean.FALSE);
                }
                s2Var.dismiss();
                if (tL_error != null) {
                    org.telegram.messenger.g0.h3(new a1.e(25, b2Var, tL_error));
                    break;
                } else {
                    s2Var.dismiss();
                    break;
                }
            case 1:
                TLRPC.TL_document tL_document = (TLRPC.TL_document) obj4;
                Long l10 = (Long) obj;
                fi.b4 b4Var = ((fi.o2) obj5).a;
                ez.C(b4Var.m2).v0(tL_document, (String) obj3, b4Var.l1, null, null, b4Var.y1.a, null, null, true, 0, 0, false, this.e, null, l10.longValue(), b4Var.L1.getSendMonoForumPeerId(), b4Var.L1.getSendMessageSuggestionParams());
                b4Var.L1.m(tL_document);
                b4Var.L1.setFieldText("");
                b4Var.i0(l10.longValue() <= 0);
                break;
            case 2:
                fi.i3 i3Var = (fi.i3) obj5;
                v7 v7Var = (v7) obj4;
                i9 i9Var = (i9) obj3;
                org.telegram.ui.ActionBar.e6 e6Var = (org.telegram.ui.ActionBar.e6) obj2;
                TL_stories.StoryItem storyItem = (TL_stories.StoryItem) obj;
                if (storyItem == null) {
                    xb Q = new cc(i3Var.A0.M0, e6Var).Q(R.raw.story_bomb2, 36, hd.M0(2131744606, null));
                    Q.a = 3;
                    Q.k(true);
                    break;
                } else {
                    org.telegram.ui.ActionBar.e2 Q2 = LaunchActivity.Q();
                    if (Q2 != null) {
                        storyItem.dialogId = v7Var.b.longValue();
                        i9 createOverlayStoryViewer = Q2.createOverlayStoryViewer();
                        createOverlayStoryViewer.L(i3Var.getContext(), storyItem, null);
                        createOverlayStoryViewer.o1 = new fi.g3(i9Var, 0);
                        i9Var.V();
                        break;
                    }
                }
                break;
            case 3:
                TL_stories.StoryItem storyItem2 = (TL_stories.StoryItem) obj3;
                org.telegram.ui.ActionBar.e6 e6Var2 = (org.telegram.ui.ActionBar.e6) obj2;
                fi.l6 l6Var = (fi.l6) obj;
                fi.b4 b4Var2 = ((fi.t3) obj5).x;
                if (((HashSet) obj4).contains(Integer.valueOf(l6Var.a))) {
                    b4Var2.C1.c(l6Var.a, b4Var2.l1, storyItem2);
                    a02 = hd.a0(null, null, 2131744731, l6Var.b);
                } else {
                    fi.s6 s6Var = b4Var2.C1;
                    long j3 = b4Var2.l1;
                    int i13 = l6Var.a;
                    s6Var.getClass();
                    ArrayList arrayList = new ArrayList(1);
                    arrayList.add(storyItem2);
                    s6Var.f0(i13, j3, arrayList);
                    a02 = hd.a0(null, null, 2131744494, l6Var.b);
                }
                i20.t(a02, new cc(b4Var2.M0, e6Var2), R.raw.contact_check, 36);
                fi.t3 t3Var = b4Var2.d1;
                if (t3Var != null) {
                    t3Var.a();
                    break;
                }
                break;
            case 4:
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
                ofFloat.addUpdateListener(new ch.v(i10, textView, textView2));
                valueAnimatorArr[0].setDuration(320L);
                valueAnimatorArr[0].setInterpolator(er.h);
                valueAnimatorArr[0].start();
                if (bool.booleanValue()) {
                    org.telegram.messenger.g0.i3(runnableArr[0], 5320L);
                    break;
                }
                break;
            case 5:
                org.telegram.messenger.g0.h3(new ai.b((qc) obj5, (boolean[]) obj4, (int[]) obj3, (int[]) obj2, (TLRPC.TL_error) obj));
                break;
            case 6:
                ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) obj5;
                gj gjVar = (gj) obj4;
                TL_keyboard.TL_buttonTypeRequestPeer tL_buttonTypeRequestPeer = (TL_keyboard.TL_buttonTypeRequestPeer) obj3;
                TLRPC.User user = (TLRPC.User) obj2;
                TLRPC.User user2 = (TLRPC.User) obj;
                int i14 = ChatActivityEnterView.N6;
                if (user2 != null) {
                    TLRPC.TL_messages_sendBotRequestedPeer tL_messages_sendBotRequestedPeer = new TLRPC.TL_messages_sendBotRequestedPeer();
                    tL_messages_sendBotRequestedPeer.peer = np.s1(chatActivityEnterView.R).m1(gjVar.k.peer_id);
                    tL_messages_sendBotRequestedPeer.flags |= 1;
                    tL_messages_sendBotRequestedPeer.msg_id = gjVar.e1();
                    tL_messages_sendBotRequestedPeer.button_id = tL_buttonTypeRequestPeer.button_id;
                    tL_messages_sendBotRequestedPeer.requested_peers.add(np.n1(user2));
                    ConnectionsManager.getInstance(chatActivityEnterView.R).sendRequest(tL_messages_sendBotRequestedPeer, null);
                    long j10 = user.id;
                    Bundle bundle = new Bundle();
                    bundle.putLong("user_id", user2.id);
                    rf rfVar = new rf(bundle, user2, user, j10);
                    an anVar = chatActivityEnterView.x3;
                    if (anVar != null) {
                        anVar.presentFragment(rfVar);
                        break;
                    }
                }
                break;
            case 7:
                dl.Y((dl) obj5, (an) obj4, (TLRPC.TL_messageMediaGeo) obj3, (org.telegram.ui.ActionBar.e6) obj2, (Long) obj);
                break;
            case 8:
                dl.Q((dl) obj5, (an) obj4, (TLRPC.TL_messageMediaVenue) obj3, (org.telegram.ui.ActionBar.e6) obj2);
                break;
            case 9:
                jn jnVar = (jn) obj5;
                an anVar2 = (an) obj4;
                TLRPC.TL_messageMediaPoll tL_messageMediaPoll = (TLRPC.TL_messageMediaPoll) obj3;
                ArrayList arrayList2 = (ArrayList) obj2;
                Long l11 = (Long) obj;
                if (anVar2.c()) {
                    org.telegram.ui.Components.t4.I(anVar2.getParentActivity(), anVar2.a(), new a1.d(jnVar, tL_messageMediaPoll, arrayList2, l11, 11));
                    break;
                } else {
                    jnVar.k0.c(tL_messageMediaPoll, jnVar.P, jnVar.n1, arrayList2, true, 0, l11.longValue());
                    jnVar.b.a(true);
                    break;
                }
            case 10:
                lx lxVar = (lx) obj5;
                ArrayList arrayList3 = (ArrayList) obj3;
                Runnable runnable = (Runnable) obj2;
                ArrayList arrayList4 = (ArrayList) obj;
                if (((String) obj4).equals(lxVar.w)) {
                    org.telegram.ui.Components.g5.g(lxVar.G.d1).f(arrayList4);
                    int size = arrayList4.size();
                    while (i11 < size) {
                        Object obj6 = arrayList4.get(i11);
                        i11++;
                        oi oiVar = new oi();
                        oiVar.a = "animated_" + ((TLRPC.Document) obj6).id;
                        oiVar.b = null;
                        arrayList3.add(oiVar);
                    }
                    runnable.run();
                    break;
                }
                break;
            case 11:
                ys0.j((ys0) obj5, (HashSet) obj4, (TL_stories.StoryItem) obj3, (m60) obj2, (fi.l6) obj);
                break;
            case 12:
                yw ywVar = (yw) obj5;
                ywVar.c5(ywVar.getMessagesController().M0((Long) obj4), (Runnable) obj, new tp(ywVar, (ad) obj3, (org.telegram.ui.ActionBar.e2) obj2, i12));
                break;
            case 13:
                n11 n11Var = (n11) obj5;
                String[] strArr = (String[]) obj4;
                String str = (String) obj3;
                LinkedHashSet linkedHashSet = (LinkedHashSet) obj2;
                Runnable runnable2 = (Runnable) obj;
                int i15 = n11Var.W;
                if (ConnectionsManager.getInstance(i15).getConnectionState() != 3) {
                    runnable2.run();
                    break;
                } else {
                    si.b0(i15).Z1(true, strArr.length != 0 ? strArr[0] : "", str, new org.telegram.ui.x(n11Var, linkedHashSet, runnable2, 13), false);
                    break;
                }
            case 14:
                n11 n11Var2 = (n11) obj5;
                String str2 = (String) obj4;
                ArrayList arrayList5 = (ArrayList) obj3;
                HashMap hashMap = (HashMap) obj2;
                Runnable runnable3 = (Runnable) obj;
                int i16 = n11Var2.W;
                if (n11Var2.a0 != 4) {
                    runnable3.run();
                    break;
                } else {
                    ArrayList arrayList6 = new ArrayList(0);
                    LongSparseArray longSparseArray = new LongSparseArray(0);
                    HashMap hashMap2 = si.b0(i16).e0;
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
                        si.b0(i16).U(n11.c2, str2, false, new a1.d(hashMap2, hashMap, arrayList5, runnable3, 19), false);
                        break;
                    }
                }
                break;
            case 15:
                org.telegram.ui.web.v0 v0Var = (org.telegram.ui.web.v0) obj5;
                i7 i7Var = (i7) obj4;
                String str3 = (String) obj3;
                TL_keyboard.TL_buttonTypeRequestPeer tL_buttonTypeRequestPeer2 = (TL_keyboard.TL_buttonTypeRequestPeer) obj2;
                TLRPC.User user3 = (TLRPC.User) obj;
                if (user3 == null) {
                    v0Var.x(i7Var, "requested_chat_failed", org.telegram.ui.web.v0.A(str3, "req_id"));
                    break;
                } else {
                    TLRPC.TL_messages_sendBotRequestedPeer tL_messages_sendBotRequestedPeer2 = new TLRPC.TL_messages_sendBotRequestedPeer();
                    tL_messages_sendBotRequestedPeer2.peer = np.n1(v0Var.V);
                    tL_messages_sendBotRequestedPeer2.webapp_req_id = str3;
                    tL_messages_sendBotRequestedPeer2.button_id = tL_buttonTypeRequestPeer2.button_id;
                    tL_messages_sendBotRequestedPeer2.requested_peers.add(np.n1(user3));
                    ConnectionsManager.getInstance(v0Var.N).sendRequestTyped(tL_messages_sendBotRequestedPeer2, new d3.b(1), new di.b2(v0Var, i7Var, str3, user3, 3));
                    v0Var.x(i7Var, "requested_chat_sent", org.telegram.ui.web.v0.A(str3, "req_id"));
                    break;
                }
            case 16:
                org.telegram.ui.web.v0 v0Var2 = (org.telegram.ui.web.v0) obj5;
                i7 i7Var2 = (i7) obj4;
                String str4 = (String) obj3;
                String str5 = (String) obj2;
                if (((Boolean) obj).booleanValue()) {
                    v0Var2.m0.b(str4, str5);
                    v0Var2.x(i7Var2, "file_download_requested", org.telegram.ui.web.v0.A("downloading", "status"));
                    break;
                } else {
                    v0Var2.x(i7Var2, "file_download_requested", org.telegram.ui.web.v0.A("cancelled", "status"));
                    break;
                }
            case 17:
                org.telegram.ui.ActionBar.e2 e2Var = (org.telegram.ui.ActionBar.e2) obj3;
                String str6 = (String) obj2;
                vf.b bVar = (vf.b) obj4;
                TLRPC.TL_payments_checkedGiftCode tL_payments_checkedGiftCode = (TLRPC.TL_payments_checkedGiftCode) obj;
                if (!((AtomicBoolean) obj5).get() && e2Var.getParentActivity() != null) {
                    if (tL_payments_checkedGiftCode.from_id == null) {
                        TLRPC.TL_premiumGiftOption tL_premiumGiftOption = new TLRPC.TL_premiumGiftOption();
                        tL_premiumGiftOption.months = tL_payments_checkedGiftCode.months;
                        TLRPC.User j11 = e2Var instanceof an ? ((an) e2Var).j() : null;
                        if (j11 == null || j11.self) {
                            j11 = new TLRPC.TL_user();
                        }
                        TLRPC.User user4 = j11;
                        boolean z10 = tL_payments_checkedGiftCode.used_date != 0;
                        org.telegram.ui.ActionBar.e2 Q3 = LaunchActivity.Q();
                        if (Q3 != null && wg.e0.O2 == null) {
                            wg.e0 e0Var = new wg.e0(Q3, m10.t0, user4, new ug.j(tL_premiumGiftOption), str6, z10, Q3.getResourceProvider());
                            e0Var.show();
                            wg.e0.O2 = e0Var;
                        }
                    } else {
                        e2Var.showDialog(new wg.a0(e2Var, tL_payments_checkedGiftCode, str6));
                    }
                    if (bVar != null) {
                        bVar.b();
                        break;
                    }
                }
                break;
            case 18:
                wg.o0 o0Var = (wg.o0) obj5;
                np.s1(o0Var.a).G0().a(-((TLRPC.Chat) obj4).id, new o1(o0Var, (TL_stories.TL_premium_myBoosts) obj, (ArrayList) obj3, (HashSet) obj2, 19));
                break;
            default:
                ((wg.o0) obj5).dismiss();
                ns.f(m10.t0).k(ns.U2, (TL_stories.TL_premium_myBoosts) obj4, Integer.valueOf(((ArrayList) obj3).size()), Integer.valueOf(((HashSet) obj2).size()), (TL_stories.TL_premium_boostsStatus) obj);
                break;
        }
    }

    public /* synthetic */ o1(AtomicBoolean atomicBoolean, org.telegram.ui.ActionBar.e2 e2Var, String str, vf.b bVar) {
        this.a = 17;
        this.b = atomicBoolean;
        this.d = e2Var;
        this.e = str;
        this.c = bVar;
    }
}
