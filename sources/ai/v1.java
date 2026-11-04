package ai;

import android.animation.ValueAnimator;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.LongSparseArray;
import android.widget.TextView;
import ci.uc;
import ei.c8;
import ei.p7;
import ei.r9;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.concurrent.atomic.AtomicBoolean;
import org.telegram.messenger.bd;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.h10;
import org.telegram.messenger.hi;
import org.telegram.messenger.hp;
import org.telegram.messenger.hs;
import org.telegram.messenger.li;
import org.telegram.messenger.u10;
import org.telegram.messenger.yy;
import org.telegram.messenger.zi;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.ChatActivityEnterView;
import org.telegram.ui.Components.ac;
import org.telegram.ui.Components.an;
import org.telegram.ui.Components.ex;
import org.telegram.ui.Components.f60;
import org.telegram.ui.Components.fc;
import org.telegram.ui.Components.jf;
import org.telegram.ui.Components.uk;
import org.telegram.ui.Components.ws0;
import org.telegram.ui.Components.xq;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ad;
import org.telegram.ui.g11;
import org.telegram.ui.pp;
import org.telegram.ui.uw;
import org.telegram.ui.wm;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class v1 implements u10 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ v1(Object obj, Object obj2, Object obj3, Object obj4, int i3) {
        this.a = i3;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
        this.e = obj4;
    }

    /* JADX WARN: Code restructure failed: missing block: B:65:0x01d6, code lost:
    
        if (r12.charAt(r13) <= 57343) goto L70;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x01f0, code lost:
    
        if (r12.charAt(r13) != 9794) goto L72;
     */
    @Override // org.telegram.messenger.u10
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(Object obj) {
        String a02;
        int i3 = this.a;
        int i10 = 4;
        int i11 = 3;
        int i12 = 0;
        int i13 = 1;
        Object obj2 = this.e;
        Object obj3 = this.d;
        Object obj4 = this.c;
        Object obj5 = this.b;
        switch (i3) {
            case 0:
                b3 b3Var = (b3) obj5;
                u10 u10Var = (u10) obj3;
                j2 j2Var = (j2) obj2;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj;
                ((sf.b) obj4).b();
                if (u10Var != null) {
                    u10Var.a(Boolean.FALSE);
                }
                b3Var.dismiss();
                if (tL_error != null) {
                    org.telegram.messenger.g0.h3(new a1.f(i11, j2Var, tL_error));
                    break;
                } else {
                    b3Var.dismiss();
                    break;
                }
            case 1:
                TLRPC.TL_document tL_document = (TLRPC.TL_document) obj4;
                Long l10 = (Long) obj;
                ei.j4 j4Var = ((ei.w2) obj5).a;
                yy.C(j4Var.m2).v0(tL_document, (String) obj3, j4Var.l1, null, null, j4Var.y1.a, null, null, true, 0, 0, false, this.e, null, l10.longValue(), j4Var.L1.getSendMonoForumPeerId(), j4Var.L1.getSendMessageSuggestionParams());
                j4Var.L1.l(tL_document);
                j4Var.L1.setFieldText("");
                j4Var.i0(l10.longValue() <= 0);
                break;
            case 2:
                ei.q3 q3Var = (ei.q3) obj5;
                c8 c8Var = (c8) obj4;
                r9 r9Var = (r9) obj3;
                org.telegram.ui.ActionBar.e6 e6Var = (org.telegram.ui.ActionBar.e6) obj2;
                TL_stories.StoryItem storyItem = (TL_stories.StoryItem) obj;
                if (storyItem == null) {
                    ac Q = new fc(q3Var.A0.M0, e6Var).Q(R.raw.story_bomb2, 36, bd.M0(2131744616, null));
                    Q.a = 3;
                    Q.k(true);
                    break;
                } else {
                    org.telegram.ui.ActionBar.d2 Q2 = LaunchActivity.Q();
                    if (Q2 != null) {
                        storyItem.dialogId = c8Var.b.longValue();
                        r9 createOverlayStoryViewer = Q2.createOverlayStoryViewer();
                        createOverlayStoryViewer.T(q3Var.getContext(), storyItem, null);
                        createOverlayStoryViewer.p1 = new ei.o3(r9Var, 0);
                        r9Var.d0();
                        break;
                    }
                }
                break;
            case 3:
                TL_stories.StoryItem storyItem2 = (TL_stories.StoryItem) obj3;
                org.telegram.ui.ActionBar.e6 e6Var2 = (org.telegram.ui.ActionBar.e6) obj2;
                ei.s6 s6Var = (ei.s6) obj;
                ei.j4 j4Var2 = ((ei.b4) obj5).x;
                if (((HashSet) obj4).contains(Integer.valueOf(s6Var.a))) {
                    j4Var2.C1.c(s6Var.a, j4Var2.l1, storyItem2);
                    a02 = bd.a0(null, null, 2131744741, s6Var.b);
                } else {
                    ei.z6 z6Var = j4Var2.C1;
                    long j10 = j4Var2.l1;
                    int i14 = s6Var.a;
                    z6Var.getClass();
                    ArrayList arrayList = new ArrayList(1);
                    arrayList.add(storyItem2);
                    z6Var.f0(i14, j10, arrayList);
                    a02 = bd.a0(null, null, 2131744504, s6Var.b);
                }
                org.telegram.messenger.camera.q.s(a02, new fc(j4Var2.M0, e6Var2), R.raw.contact_check, 36);
                ei.b4 b4Var = j4Var2.d1;
                if (b4Var != null) {
                    b4Var.a();
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
                ofFloat.addUpdateListener(new uc(i10, textView, textView2));
                valueAnimatorArr[0].setDuration(320L);
                valueAnimatorArr[0].setInterpolator(xq.h);
                valueAnimatorArr[0].start();
                if (bool.booleanValue()) {
                    org.telegram.messenger.g0.i3(runnableArr[0], 5320L);
                    break;
                }
                break;
            case 5:
                org.telegram.messenger.g0.h3(new t6(obj5, obj4, obj3, obj2, (TLRPC.TL_error) obj, 24));
                break;
            case 6:
                ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) obj5;
                zi ziVar = (zi) obj4;
                TL_keyboard.TL_buttonTypeRequestPeer tL_buttonTypeRequestPeer = (TL_keyboard.TL_buttonTypeRequestPeer) obj3;
                TLRPC.User user = (TLRPC.User) obj2;
                TLRPC.User user2 = (TLRPC.User) obj;
                int i15 = ChatActivityEnterView.t5;
                if (user2 != null) {
                    TLRPC.TL_messages_sendBotRequestedPeer tL_messages_sendBotRequestedPeer = new TLRPC.TL_messages_sendBotRequestedPeer();
                    tL_messages_sendBotRequestedPeer.peer = hp.s1(chatActivityEnterView.R).m1(ziVar.k.peer_id);
                    tL_messages_sendBotRequestedPeer.flags |= 1;
                    tL_messages_sendBotRequestedPeer.msg_id = ziVar.f1();
                    tL_messages_sendBotRequestedPeer.button_id = tL_buttonTypeRequestPeer.button_id;
                    tL_messages_sendBotRequestedPeer.requested_peers.add(hp.n1(user2));
                    ConnectionsManager.getInstance(chatActivityEnterView.R).sendRequest(tL_messages_sendBotRequestedPeer, null);
                    long j11 = user.id;
                    Bundle bundle = new Bundle();
                    bundle.putLong("user_id", user2.id);
                    jf jfVar = new jf(bundle, user2, user, j11);
                    wm wmVar = chatActivityEnterView.Q2;
                    if (wmVar != null) {
                        wmVar.presentFragment(jfVar);
                        break;
                    }
                }
                break;
            case 7:
                uk.X((uk) obj5, (wm) obj4, (TLRPC.TL_messageMediaGeo) obj3, (org.telegram.ui.ActionBar.e6) obj2, (Long) obj);
                break;
            case 8:
                uk.P((uk) obj5, (wm) obj4, (TLRPC.TL_messageMediaVenue) obj3, (org.telegram.ui.ActionBar.e6) obj2);
                break;
            case 9:
                an anVar = (an) obj5;
                wm wmVar2 = (wm) obj4;
                TLRPC.TL_messageMediaPoll tL_messageMediaPoll = (TLRPC.TL_messageMediaPoll) obj3;
                ArrayList arrayList2 = (ArrayList) obj2;
                Long l11 = (Long) obj;
                if (wmVar2.c()) {
                    org.telegram.ui.Components.t4.K(wmVar2.getParentActivity(), wmVar2.a(), new a1.d(anVar, tL_messageMediaPoll, arrayList2, l11, 10));
                    break;
                } else {
                    anVar.k0.c(tL_messageMediaPoll, anVar.P, anVar.n1, arrayList2, true, 0, l11.longValue());
                    anVar.b.a(true);
                    break;
                }
            case 10:
                ex exVar = (ex) obj5;
                ArrayList arrayList3 = (ArrayList) obj3;
                Runnable runnable = (Runnable) obj2;
                ArrayList arrayList4 = (ArrayList) obj;
                if (((String) obj4).equals(exVar.w)) {
                    org.telegram.ui.Components.g5.g(exVar.G.d1).f(arrayList4);
                    int size = arrayList4.size();
                    while (i12 < size) {
                        Object obj6 = arrayList4.get(i12);
                        i12++;
                        hi hiVar = new hi();
                        hiVar.a = "animated_" + ((TLRPC.Document) obj6).id;
                        hiVar.b = null;
                        arrayList3.add(hiVar);
                    }
                    runnable.run();
                    break;
                }
                break;
            case 11:
                ws0.j((ws0) obj5, (HashSet) obj4, (TL_stories.StoryItem) obj3, (f60) obj2, (ei.s6) obj);
                break;
            case 12:
                uw uwVar = (uw) obj5;
                uwVar.c5(uwVar.getMessagesController().M0((Long) obj4), (Runnable) obj, new pp(uwVar, (ad) obj3, (org.telegram.ui.ActionBar.d2) obj2, i13));
                break;
            case 13:
                g11 g11Var = (g11) obj5;
                String[] strArr = (String[]) obj4;
                String str = (String) obj3;
                LinkedHashSet linkedHashSet = (LinkedHashSet) obj2;
                Runnable runnable2 = (Runnable) obj;
                int i16 = g11Var.W;
                if (ConnectionsManager.getInstance(i16).getConnectionState() != 3) {
                    runnable2.run();
                    break;
                } else {
                    li.b0(i16).Z1(true, strArr.length != 0 ? strArr[0] : "", str, new org.telegram.ui.z(g11Var, linkedHashSet, runnable2, 13), false);
                    break;
                }
            case 14:
                g11 g11Var2 = (g11) obj5;
                String str2 = (String) obj4;
                ArrayList arrayList5 = (ArrayList) obj3;
                HashMap hashMap = (HashMap) obj2;
                Runnable runnable3 = (Runnable) obj;
                int i17 = g11Var2.W;
                if (g11Var2.a0 != 4) {
                    runnable3.run();
                    break;
                } else {
                    ArrayList arrayList6 = new ArrayList(0);
                    LongSparseArray longSparseArray = new LongSparseArray(0);
                    HashMap hashMap2 = li.b0(i17).e0;
                    if (str2.length() <= 14) {
                        int length = str2.length();
                        int i18 = 0;
                        CharSequence charSequence = str2;
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
                        ArrayList arrayList7 = hashMap2 != null ? (ArrayList) hashMap2.get(charSequence.toString()) : null;
                        if (arrayList7 != null && !arrayList7.isEmpty()) {
                            arrayList6.addAll(arrayList7);
                            int size2 = arrayList7.size();
                            for (int i21 = 0; i21 < size2; i21++) {
                                TLRPC.Document document = (TLRPC.Document) arrayList7.get(i21);
                                longSparseArray.put(document.id, document);
                            }
                            arrayList5.add(arrayList6);
                        }
                    }
                    if (hashMap2 != null && !hashMap2.isEmpty() && str2.length() > 1) {
                        li.b0(i17).U(g11.c2, str2, false, new a1.d(hashMap2, hashMap, arrayList5, runnable3, 18), false);
                        break;
                    }
                }
                break;
            case 15:
                org.telegram.ui.web.w0 w0Var = (org.telegram.ui.web.w0) obj5;
                p7 p7Var = (p7) obj4;
                String str3 = (String) obj3;
                TL_keyboard.TL_buttonTypeRequestPeer tL_buttonTypeRequestPeer2 = (TL_keyboard.TL_buttonTypeRequestPeer) obj2;
                TLRPC.User user3 = (TLRPC.User) obj;
                if (user3 == null) {
                    w0Var.x(p7Var, "requested_chat_failed", org.telegram.ui.web.w0.A(str3, "req_id"));
                    break;
                } else {
                    TLRPC.TL_messages_sendBotRequestedPeer tL_messages_sendBotRequestedPeer2 = new TLRPC.TL_messages_sendBotRequestedPeer();
                    tL_messages_sendBotRequestedPeer2.peer = hp.n1(w0Var.V);
                    tL_messages_sendBotRequestedPeer2.webapp_req_id = str3;
                    tL_messages_sendBotRequestedPeer2.button_id = tL_buttonTypeRequestPeer2.button_id;
                    tL_messages_sendBotRequestedPeer2.requested_peers.add(hp.n1(user3));
                    ConnectionsManager.getInstance(w0Var.N).sendRequestTyped(tL_messages_sendBotRequestedPeer2, new c3.b(i13), new ci.h2(w0Var, p7Var, str3, user3, 3));
                    w0Var.x(p7Var, "requested_chat_sent", org.telegram.ui.web.w0.A(str3, "req_id"));
                    break;
                }
            case 16:
                org.telegram.ui.web.w0 w0Var2 = (org.telegram.ui.web.w0) obj5;
                p7 p7Var2 = (p7) obj4;
                String str4 = (String) obj3;
                String str5 = (String) obj2;
                if (((Boolean) obj).booleanValue()) {
                    w0Var2.m0.b(str4, str5);
                    w0Var2.x(p7Var2, "file_download_requested", org.telegram.ui.web.w0.A("downloading", "status"));
                    break;
                } else {
                    w0Var2.x(p7Var2, "file_download_requested", org.telegram.ui.web.w0.A("cancelled", "status"));
                    break;
                }
            case 17:
                org.telegram.ui.ActionBar.d2 d2Var = (org.telegram.ui.ActionBar.d2) obj3;
                String str6 = (String) obj2;
                sf.b bVar = (sf.b) obj4;
                TLRPC.TL_payments_checkedGiftCode tL_payments_checkedGiftCode = (TLRPC.TL_payments_checkedGiftCode) obj;
                if (!((AtomicBoolean) obj5).get() && d2Var.getParentActivity() != null) {
                    if (tL_payments_checkedGiftCode.from_id == null) {
                        TLRPC.TL_premiumGiftOption tL_premiumGiftOption = new TLRPC.TL_premiumGiftOption();
                        tL_premiumGiftOption.months = tL_payments_checkedGiftCode.months;
                        TLRPC.User j12 = d2Var instanceof wm ? ((wm) d2Var).j() : null;
                        if (j12 == null || j12.self) {
                            j12 = new TLRPC.TL_user();
                        }
                        TLRPC.User user4 = j12;
                        boolean z10 = tL_payments_checkedGiftCode.used_date != 0;
                        org.telegram.ui.ActionBar.d2 Q3 = LaunchActivity.Q();
                        if (Q3 != null && xg.g0.L2 == null) {
                            xg.g0 g0Var = new xg.g0(Q3, h10.t0, user4, new vg.j(tL_premiumGiftOption), str6, z10, Q3.getResourceProvider());
                            g0Var.show();
                            xg.g0.L2 = g0Var;
                        }
                    } else {
                        d2Var.showDialog(new xg.c0(d2Var, tL_payments_checkedGiftCode, str6));
                    }
                    if (bVar != null) {
                        bVar.b();
                        break;
                    }
                }
                break;
            case 18:
                xg.q0 q0Var = (xg.q0) obj5;
                hp.s1(q0Var.a).G0().a(-((TLRPC.Chat) obj4).id, new v1(q0Var, (TL_stories.TL_premium_myBoosts) obj, (ArrayList) obj3, (HashSet) obj2, 19));
                break;
            default:
                ((xg.q0) obj5).dismiss();
                hs.f(h10.t0).k(hs.U2, (TL_stories.TL_premium_myBoosts) obj4, Integer.valueOf(((ArrayList) obj3).size()), Integer.valueOf(((HashSet) obj2).size()), (TL_stories.TL_premium_boostsStatus) obj);
                break;
        }
    }

    public /* synthetic */ v1(AtomicBoolean atomicBoolean, org.telegram.ui.ActionBar.d2 d2Var, String str, sf.b bVar) {
        this.a = 17;
        this.b = atomicBoolean;
        this.d = d2Var;
        this.e = str;
        this.c = bVar;
    }
}
