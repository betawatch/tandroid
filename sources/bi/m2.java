package bi;

import android.animation.ValueAnimator;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.LongSparseArray;
import android.widget.TextView;
import fi.f9;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.concurrent.atomic.AtomicBoolean;
import org.telegram.messenger.az;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.gj;
import org.telegram.messenger.hd;
import org.telegram.messenger.k10;
import org.telegram.messenger.ls;
import org.telegram.messenger.np;
import org.telegram.messenger.o10;
import org.telegram.messenger.oi;
import org.telegram.messenger.si;
import org.telegram.messenger.y10;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.ChatActivityEnterView;
import org.telegram.ui.Components.a70;
import org.telegram.ui.Components.eg;
import org.telegram.ui.Components.gc;
import org.telegram.ui.Components.jt0;
import org.telegram.ui.Components.lc;
import org.telegram.ui.Components.ml;
import org.telegram.ui.Components.nr;
import org.telegram.ui.Components.sx;
import org.telegram.ui.Components.tn;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ad;
import org.telegram.ui.bn;
import org.telegram.ui.cx;
import org.telegram.ui.qc;
import org.telegram.ui.s11;
import org.telegram.ui.up;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes3.dex */
public final /* synthetic */ class m2 implements y10 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ m2(Object obj, Object obj2, Object obj3, Object obj4, int i7) {
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
    @Override // org.telegram.messenger.y10
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
                n3 n3Var = (n3) obj5;
                y10 y10Var = (y10) obj3;
                z2 z2Var = (z2) obj2;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj;
                ((vf.b) obj4).b();
                if (y10Var != null) {
                    y10Var.a(Boolean.FALSE);
                }
                n3Var.dismiss();
                if (tL_error != null) {
                    org.telegram.messenger.g0.g3(new a1.e(25, z2Var, tL_error));
                    break;
                } else {
                    n3Var.dismiss();
                    break;
                }
            case 1:
                TLRPC.TL_document tL_document = (TLRPC.TL_document) obj4;
                Long l10 = (Long) obj;
                fi.z3 z3Var = ((fi.m2) obj5).a;
                az.C(z3Var.m2).v0(tL_document, (String) obj3, z3Var.l1, null, null, z3Var.y1.a, null, null, true, 0, 0, false, this.e, null, l10.longValue(), z3Var.L1.getSendMonoForumPeerId(), z3Var.L1.getSendMessageSuggestionParams());
                z3Var.L1.n(tL_document);
                z3Var.L1.setFieldText("");
                z3Var.i0(l10.longValue() <= 0);
                break;
            case 2:
                fi.g3 g3Var = (fi.g3) obj5;
                fi.s7 s7Var = (fi.s7) obj4;
                f9 f9Var = (f9) obj3;
                org.telegram.ui.ActionBar.h6 h6Var = (org.telegram.ui.ActionBar.h6) obj2;
                TL_stories.StoryItem storyItem = (TL_stories.StoryItem) obj;
                if (storyItem == null) {
                    gc Q = new lc(g3Var.A0.M0, h6Var).Q(R.raw.story_bomb2, 36, hd.N0(2131744363, null));
                    Q.a = 3;
                    Q.k(true);
                    break;
                } else {
                    org.telegram.ui.ActionBar.g2 Q2 = LaunchActivity.Q();
                    if (Q2 != null) {
                        storyItem.dialogId = s7Var.b.longValue();
                        f9 createOverlayStoryViewer = Q2.createOverlayStoryViewer();
                        createOverlayStoryViewer.L(g3Var.getContext(), storyItem, null);
                        createOverlayStoryViewer.o1 = new fi.e3(f9Var, 0);
                        f9Var.V();
                        break;
                    }
                }
                break;
            case 3:
                TL_stories.StoryItem storyItem2 = (TL_stories.StoryItem) obj3;
                org.telegram.ui.ActionBar.h6 h6Var2 = (org.telegram.ui.ActionBar.h6) obj2;
                fi.i6 i6Var = (fi.i6) obj;
                fi.z3 z3Var2 = ((fi.r3) obj5).x;
                if (((HashSet) obj4).contains(Integer.valueOf(i6Var.a))) {
                    z3Var2.C1.c(i6Var.a, z3Var2.l1, storyItem2);
                    a02 = hd.a0(null, null, 2131744488, i6Var.b);
                } else {
                    fi.p6 p6Var = z3Var2.C1;
                    long j3 = z3Var2.l1;
                    int i13 = i6Var.a;
                    p6Var.getClass();
                    ArrayList arrayList = new ArrayList(1);
                    arrayList.add(storyItem2);
                    p6Var.f0(i13, j3, arrayList);
                    a02 = hd.a0(null, null, 2131744251, i6Var.b);
                }
                o10.u(a02, new lc(z3Var2.M0, h6Var2), R.raw.contact_check, 36);
                fi.r3 r3Var = z3Var2.d1;
                if (r3Var != null) {
                    r3Var.a();
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
                ofFloat.addUpdateListener(new ch.w(i10, textView, textView2));
                valueAnimatorArr[0].setDuration(320L);
                valueAnimatorArr[0].setInterpolator(nr.h);
                valueAnimatorArr[0].start();
                if (bool.booleanValue()) {
                    org.telegram.messenger.g0.h3(runnableArr[0], 5320L);
                    break;
                }
                break;
            case 5:
                org.telegram.messenger.g0.g3(new ai.b((qc) obj5, (boolean[]) obj4, (int[]) obj3, (int[]) obj2, (TLRPC.TL_error) obj));
                break;
            case 6:
                ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) obj5;
                gj gjVar = (gj) obj4;
                TL_keyboard.TL_buttonTypeRequestPeer tL_buttonTypeRequestPeer = (TL_keyboard.TL_buttonTypeRequestPeer) obj3;
                TLRPC.User user = (TLRPC.User) obj2;
                TLRPC.User user2 = (TLRPC.User) obj;
                int i14 = ChatActivityEnterView.s7;
                if (user2 != null) {
                    TLRPC.TL_messages_sendBotRequestedPeer tL_messages_sendBotRequestedPeer = new TLRPC.TL_messages_sendBotRequestedPeer();
                    tL_messages_sendBotRequestedPeer.peer = np.u1(chatActivityEnterView.R).o1(gjVar.k.peer_id);
                    tL_messages_sendBotRequestedPeer.flags |= 1;
                    tL_messages_sendBotRequestedPeer.msg_id = gjVar.e1();
                    tL_messages_sendBotRequestedPeer.button_id = tL_buttonTypeRequestPeer.button_id;
                    tL_messages_sendBotRequestedPeer.requested_peers.add(np.p1(user2));
                    ConnectionsManager.getInstance(chatActivityEnterView.R).sendRequest(tL_messages_sendBotRequestedPeer, null);
                    long j10 = user.id;
                    Bundle bundle = new Bundle();
                    bundle.putLong("user_id", user2.id);
                    eg egVar = new eg(bundle, user2, user, j10);
                    bn bnVar = chatActivityEnterView.F3;
                    if (bnVar != null) {
                        bnVar.presentFragment(egVar);
                        break;
                    }
                }
                break;
            case 7:
                ml.Y((ml) obj5, (bn) obj4, (TLRPC.TL_messageMediaGeo) obj3, (org.telegram.ui.ActionBar.h6) obj2, (Long) obj);
                break;
            case 8:
                ml.Q((ml) obj5, (bn) obj4, (TLRPC.TL_messageMediaVenue) obj3, (org.telegram.ui.ActionBar.h6) obj2);
                break;
            case 9:
                tn tnVar = (tn) obj5;
                bn bnVar2 = (bn) obj4;
                TLRPC.TL_messageMediaPoll tL_messageMediaPoll = (TLRPC.TL_messageMediaPoll) obj3;
                ArrayList arrayList2 = (ArrayList) obj2;
                Long l11 = (Long) obj;
                if (bnVar2.c()) {
                    org.telegram.ui.Components.c5.I(bnVar2.getParentActivity(), bnVar2.a(), new a1.d(tnVar, tL_messageMediaPoll, arrayList2, l11, 11));
                    break;
                } else {
                    tnVar.k0.d(tL_messageMediaPoll, tnVar.P, tnVar.n1, arrayList2, true, 0, l11.longValue());
                    tnVar.b.a(true);
                    break;
                }
            case 10:
                sx sxVar = (sx) obj5;
                ArrayList arrayList3 = (ArrayList) obj3;
                Runnable runnable = (Runnable) obj2;
                ArrayList arrayList4 = (ArrayList) obj;
                if (((String) obj4).equals(sxVar.w)) {
                    org.telegram.ui.Components.p5.g(sxVar.G.d1).f(arrayList4);
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
                jt0.j((jt0) obj5, (HashSet) obj4, (TL_stories.StoryItem) obj3, (a70) obj2, (fi.i6) obj);
                break;
            case 12:
                cx cxVar = (cx) obj5;
                cxVar.k5(cxVar.getMessagesController().O0((Long) obj4), (Runnable) obj, new up(cxVar, (ad) obj3, (org.telegram.ui.ActionBar.g2) obj2, i12));
                break;
            case 13:
                s11 s11Var = (s11) obj5;
                String[] strArr = (String[]) obj4;
                String str = (String) obj3;
                LinkedHashSet linkedHashSet = (LinkedHashSet) obj2;
                Runnable runnable2 = (Runnable) obj;
                int i15 = s11Var.W;
                if (ConnectionsManager.getInstance(i15).getConnectionState() != 3) {
                    runnable2.run();
                    break;
                } else {
                    si.d0(i15).e2(true, strArr.length != 0 ? strArr[0] : "", str, new org.telegram.ui.x(s11Var, linkedHashSet, runnable2, 13), false);
                    break;
                }
            case 14:
                s11 s11Var2 = (s11) obj5;
                String str2 = (String) obj4;
                ArrayList arrayList5 = (ArrayList) obj3;
                HashMap hashMap = (HashMap) obj2;
                Runnable runnable3 = (Runnable) obj;
                int i16 = s11Var2.W;
                if (s11Var2.a0 != 4) {
                    runnable3.run();
                    break;
                } else {
                    ArrayList arrayList6 = new ArrayList(0);
                    LongSparseArray longSparseArray = new LongSparseArray(0);
                    HashMap hashMap2 = si.d0(i16).e0;
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
                        si.d0(i16).W(s11.c2, str2, false, new a1.d(hashMap2, hashMap, arrayList5, runnable3, 19), false);
                        break;
                    }
                }
                break;
            case 15:
                org.telegram.ui.web.v0 v0Var = (org.telegram.ui.web.v0) obj5;
                fi.f7 f7Var = (fi.f7) obj4;
                String str3 = (String) obj3;
                TL_keyboard.TL_buttonTypeRequestPeer tL_buttonTypeRequestPeer2 = (TL_keyboard.TL_buttonTypeRequestPeer) obj2;
                TLRPC.User user3 = (TLRPC.User) obj;
                if (user3 == null) {
                    v0Var.x(f7Var, "requested_chat_failed", org.telegram.ui.web.v0.A(str3, "req_id"));
                    break;
                } else {
                    TLRPC.TL_messages_sendBotRequestedPeer tL_messages_sendBotRequestedPeer2 = new TLRPC.TL_messages_sendBotRequestedPeer();
                    tL_messages_sendBotRequestedPeer2.peer = np.p1(v0Var.V);
                    tL_messages_sendBotRequestedPeer2.webapp_req_id = str3;
                    tL_messages_sendBotRequestedPeer2.button_id = tL_buttonTypeRequestPeer2.button_id;
                    tL_messages_sendBotRequestedPeer2.requested_peers.add(np.p1(user3));
                    ConnectionsManager.getInstance(v0Var.N).sendRequestTyped(tL_messages_sendBotRequestedPeer2, new d3.b(1), new di.e2(v0Var, f7Var, str3, user3, 3));
                    v0Var.x(f7Var, "requested_chat_sent", org.telegram.ui.web.v0.A(str3, "req_id"));
                    break;
                }
            case 16:
                org.telegram.ui.web.v0 v0Var2 = (org.telegram.ui.web.v0) obj5;
                fi.f7 f7Var2 = (fi.f7) obj4;
                String str4 = (String) obj3;
                String str5 = (String) obj2;
                if (((Boolean) obj).booleanValue()) {
                    v0Var2.m0.b(str4, str5);
                    v0Var2.x(f7Var2, "file_download_requested", org.telegram.ui.web.v0.A("downloading", "status"));
                    break;
                } else {
                    v0Var2.x(f7Var2, "file_download_requested", org.telegram.ui.web.v0.A("cancelled", "status"));
                    break;
                }
            case 17:
                org.telegram.ui.ActionBar.g2 g2Var = (org.telegram.ui.ActionBar.g2) obj3;
                String str6 = (String) obj2;
                vf.b bVar = (vf.b) obj4;
                TLRPC.TL_payments_checkedGiftCode tL_payments_checkedGiftCode = (TLRPC.TL_payments_checkedGiftCode) obj;
                if (!((AtomicBoolean) obj5).get() && g2Var.getParentActivity() != null) {
                    if (tL_payments_checkedGiftCode.from_id == null) {
                        TLRPC.TL_premiumGiftOption tL_premiumGiftOption = new TLRPC.TL_premiumGiftOption();
                        tL_premiumGiftOption.months = tL_payments_checkedGiftCode.months;
                        TLRPC.User j11 = g2Var instanceof bn ? ((bn) g2Var).j() : null;
                        if (j11 == null || j11.self) {
                            j11 = new TLRPC.TL_user();
                        }
                        TLRPC.User user4 = j11;
                        boolean z10 = tL_payments_checkedGiftCode.used_date != 0;
                        org.telegram.ui.ActionBar.g2 Q3 = LaunchActivity.Q();
                        if (Q3 != null && wg.g0.O2 == null) {
                            wg.g0 g0Var = new wg.g0(Q3, k10.t0, user4, new ug.j(tL_premiumGiftOption), str6, z10, Q3.getResourceProvider());
                            g0Var.show();
                            wg.g0.O2 = g0Var;
                        }
                    } else {
                        g2Var.showDialog(new wg.c0(g2Var, tL_payments_checkedGiftCode, str6));
                    }
                    if (bVar != null) {
                        bVar.b();
                        break;
                    }
                }
                break;
            case 18:
                wg.q0 q0Var = (wg.q0) obj5;
                np.u1(q0Var.a).I0().a(-((TLRPC.Chat) obj4).id, new m2(q0Var, (TL_stories.TL_premium_myBoosts) obj, (ArrayList) obj3, (HashSet) obj2, 19));
                break;
            default:
                ((wg.q0) obj5).dismiss();
                ls.f(k10.t0).k(ls.W2, (TL_stories.TL_premium_myBoosts) obj4, Integer.valueOf(((ArrayList) obj3).size()), Integer.valueOf(((HashSet) obj2).size()), (TL_stories.TL_premium_boostsStatus) obj);
                break;
        }
    }

    public /* synthetic */ m2(AtomicBoolean atomicBoolean, org.telegram.ui.ActionBar.g2 g2Var, String str, vf.b bVar) {
        this.a = 17;
        this.b = atomicBoolean;
        this.d = g2Var;
        this.e = str;
        this.c = bVar;
    }
}
