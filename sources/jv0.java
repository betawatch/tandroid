// default package

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
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.tgnet.tl.TL_payments;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.Components.ChatActivityEnterView;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.Wallet.c;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class jv0 implements qac {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ jv0(ChatActivityEnterView chatActivityEnterView, k47 k47Var, TL_keyboard.TL_buttonTypeRequestPeer tL_buttonTypeRequestPeer, TLRPC.User user) {
        this.a = (byte) 3;
        this.b = chatActivityEnterView;
        this.c = k47Var;
        this.e = tL_buttonTypeRequestPeer;
        this.d = user;
    }

    /* JADX WARN: Code restructure failed: missing block: B:46:0x0104, code lost:
    
        if (r10.charAt(r11) <= 57343) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x011e, code lost:
    
        if (r10.charAt(r11) != 9794) goto L51;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // qac
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(Object obj) {
        String a0;
        byte b = this.a;
        byte b2 = 2;
        byte b3 = 0;
        Object obj2 = this.e;
        Object obj3 = this.d;
        Object obj4 = this.c;
        Object obj5 = this.b;
        switch (b) {
            case 0:
                qw0 qw0Var = (qw0) obj5;
                ow0 ow0Var = (ow0) obj4;
                String str = (String) obj3;
                TL_keyboard.TL_buttonTypeRequestPeer tL_buttonTypeRequestPeer = (TL_keyboard.TL_buttonTypeRequestPeer) obj2;
                TLRPC.User user = (TLRPC.User) obj;
                if (user == null) {
                    qw0Var.u(ow0Var, "requested_chat_failed", qw0.x(str, "req_id"));
                    break;
                } else {
                    TLRPC.TL_messages_sendBotRequestedPeer tL_messages_sendBotRequestedPeer = new TLRPC.TL_messages_sendBotRequestedPeer();
                    tL_messages_sendBotRequestedPeer.peer = oc7.m1(qw0Var.V);
                    tL_messages_sendBotRequestedPeer.webapp_req_id = str;
                    tL_messages_sendBotRequestedPeer.button_id = tL_buttonTypeRequestPeer.button_id;
                    tL_messages_sendBotRequestedPeer.requested_peers.add(oc7.m1(user));
                    ConnectionsManager.getInstance(qw0Var.N).sendRequestTyped(tL_messages_sendBotRequestedPeer, new kc(b3), new nv0((Object) qw0Var, (Object) ow0Var, (Object) str, (Object) user, (byte) 0));
                    qw0Var.u(ow0Var, "requested_chat_sent", qw0.x(str, "req_id"));
                    break;
                }
            case 1:
                qw0 qw0Var2 = (qw0) obj5;
                ow0 ow0Var2 = (ow0) obj4;
                String str2 = (String) obj3;
                String str3 = (String) obj2;
                if (((Boolean) obj).booleanValue()) {
                    qw0Var2.m0.b(str2, str3);
                    qw0Var2.u(ow0Var2, "file_download_requested", qw0.x("downloading", "status"));
                    break;
                } else {
                    qw0Var2.u(ow0Var2, "file_download_requested", qw0.x("cancelled", "status"));
                    break;
                }
            case 2:
                vi1 vi1Var = (vi1) obj5;
                vi1Var.getClass();
                gm.c3(new da7((Object) vi1Var, obj4, obj3, obj2, obj, (byte) 15));
                break;
            case 3:
                ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) obj5;
                k47 k47Var = (k47) obj4;
                TL_keyboard.TL_buttonTypeRequestPeer tL_buttonTypeRequestPeer2 = (TL_keyboard.TL_buttonTypeRequestPeer) obj2;
                TLRPC.User user2 = (TLRPC.User) obj3;
                TLRPC.User user3 = (TLRPC.User) obj;
                int i = ChatActivityEnterView.z7;
                if (user3 != null) {
                    TLRPC.TL_messages_sendBotRequestedPeer tL_messages_sendBotRequestedPeer2 = new TLRPC.TL_messages_sendBotRequestedPeer();
                    tL_messages_sendBotRequestedPeer2.peer = oc7.r1(chatActivityEnterView.R).l1(k47Var.k.peer_id);
                    tL_messages_sendBotRequestedPeer2.flags |= 1;
                    tL_messages_sendBotRequestedPeer2.msg_id = k47Var.e1();
                    tL_messages_sendBotRequestedPeer2.button_id = tL_buttonTypeRequestPeer2.button_id;
                    tL_messages_sendBotRequestedPeer2.requested_peers.add(oc7.m1(user3));
                    ConnectionsManager.getInstance(chatActivityEnterView.R).sendRequest(tL_messages_sendBotRequestedPeer2, null);
                    long j = user2.id;
                    Bundle bundle = new Bundle();
                    bundle.putLong("user_id", user3.id);
                    iz1 iz1Var = new iz1(bundle, user3, user2, j);
                    yv1 yv1Var = chatActivityEnterView.F3;
                    if (yv1Var != null) {
                        yv1Var.presentFragment(iz1Var);
                        break;
                    }
                }
                break;
            case 4:
                ((n52) obj5).X((yv1) obj4, (TLRPC.TL_messageMediaGeo) obj3, (ylb) obj2, (Long) obj);
                break;
            case 5:
                ((n52) obj5).Y((yv1) obj4, (TLRPC.TL_messageMediaVenue) obj3, (ylb) obj2);
                break;
            case 6:
                v72 v72Var = (v72) obj5;
                yv1 yv1Var2 = (yv1) obj4;
                TLRPC.TL_messageMediaPoll tL_messageMediaPoll = (TLRPC.TL_messageMediaPoll) obj3;
                ArrayList arrayList = (ArrayList) obj2;
                Long l = (Long) obj;
                if (yv1Var2.X7()) {
                    ik.I(yv1Var2.getParentActivity(), yv1Var2.a(), new lu((Object) v72Var, (Object) tL_messageMediaPoll, (Object) arrayList, (Object) l, (byte) 6));
                    break;
                } else {
                    v72Var.k0.a(tL_messageMediaPoll, v72Var.P, v72Var.n1, arrayList, true, 0, l.longValue());
                    v72Var.b.a(true);
                    break;
                }
            case 7:
                nk3 nk3Var = (nk3) obj5;
                nk3Var.m5(nk3Var.getMessagesController().L0((Long) obj4), (Runnable) obj, new pz2(nk3Var, (fj1) obj3, (d) obj2, b2));
                break;
            case 8:
                e24 e24Var = (e24) obj5;
                ArrayList arrayList2 = (ArrayList) obj4;
                Runnable runnable = (Runnable) obj2;
                ArrayList arrayList3 = (ArrayList) obj;
                if (((String) obj3).equals(e24Var.w)) {
                    vm.g(e24Var.G.d1).f(arrayList3);
                    int size = arrayList3.size();
                    while (b3 < size) {
                        Object obj6 = arrayList3.get(b3);
                        ds6 ds6Var = new ds6();
                        ds6Var.a = "animated_" + ((TLRPC.Document) obj6).id;
                        ds6Var.b = null;
                        arrayList2.add(ds6Var);
                        b3++;
                    }
                    runnable.run();
                    break;
                }
                break;
            case 9:
                lv4 lv4Var = (lv4) obj5;
                TL_payments.TL_StarGiftAuctionState tL_StarGiftAuctionState = (TL_payments.TL_StarGiftAuctionState) obj4;
                lv4Var.d(tL_StarGiftAuctionState.gift.id).c = (ArrayList) obj;
                lv4Var.f(tL_StarGiftAuctionState.gift.id, tL_StarGiftAuctionState);
                ((jac) obj3).a(tL_StarGiftAuctionState, (TLRPC.TL_error) obj2);
                break;
            case 10:
                d dVar = (d) obj4;
                String str4 = (String) obj3;
                k11 k11Var = (k11) obj2;
                TLRPC.TL_payments_checkedGiftCode tL_payments_checkedGiftCode = (TLRPC.TL_payments_checkedGiftCode) obj;
                if (!((AtomicBoolean) obj5).get() && dVar.getParentActivity() != null) {
                    if (tL_payments_checkedGiftCode.from_id == null) {
                        TLRPC.TL_premiumGiftOption tL_premiumGiftOption = new TLRPC.TL_premiumGiftOption();
                        tL_premiumGiftOption.months = tL_payments_checkedGiftCode.months;
                        TLRPC.User h = dVar instanceof yv1 ? ((yv1) dVar).h() : null;
                        if (h == null || h.self) {
                            h = new TLRPC.TL_user();
                        }
                        TLRPC.User user4 = h;
                        boolean z = tL_payments_checkedGiftCode.used_date != 0;
                        d Q = LaunchActivity.Q();
                        if (Q != null && lk8.N2 == null) {
                            lk8 lk8Var = new lk8(Q, z8c.t0, user4, new nw4(tL_premiumGiftOption), str4, z, Q.getResourceProvider());
                            lk8Var.show();
                            lk8.N2 = lk8Var;
                        }
                    } else {
                        dVar.showDialog(new rv4(dVar, tL_payments_checkedGiftCode, str4));
                    }
                    if (k11Var != null) {
                        k11Var.b();
                        break;
                    }
                }
                break;
            case 11:
                ux4 ux4Var = (ux4) obj5;
                qac qacVar = (qac) obj3;
                ix4 ix4Var = (ix4) obj2;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj;
                ((k11) obj4).b();
                if (qacVar != null) {
                    qacVar.a(Boolean.FALSE);
                }
                ux4Var.dismiss();
                if (tL_error != null) {
                    gm.c3(new ve4(ix4Var, tL_error, (byte) 15));
                    break;
                } else {
                    ux4Var.dismiss();
                    break;
                }
            case 12:
                c cVar = (c) obj5;
                r25 r25Var = (r25) obj4;
                Runnable runnable2 = (Runnable) obj2;
                r25Var.c = (byte[]) obj;
                if (cVar.Q.get((String) obj3) == r25Var) {
                    cVar.v0(r25Var);
                    cVar.S();
                }
                runnable2.run();
                break;
            case 13:
                TLRPC.TL_document tL_document = (TLRPC.TL_document) obj4;
                Long l2 = (Long) obj;
                a58 a58Var = ((w38) obj5).a;
                a6a.B(a58Var.s2).t0(tL_document, (String) obj3, a58Var.r1, null, null, a58Var.E1.a, null, null, true, 0, 0, false, this.e, null, l2.longValue(), a58Var.R1.getSendMonoForumPeerId(), a58Var.R1.getSendMessageSuggestionParams());
                a58Var.R1.k(tL_document);
                a58Var.R1.setFieldText("");
                a58Var.a0(l2.longValue() <= 0);
                break;
            case 14:
                l48 l48Var = (l48) obj5;
                g5b g5bVar = (g5b) obj4;
                oab oabVar = (oab) obj3;
                r63 r63Var = (r63) obj2;
                TL_stories.StoryItem storyItem = (TL_stories.StoryItem) obj;
                if (storyItem != null) {
                    d Q2 = LaunchActivity.Q();
                    if (Q2 != null) {
                        storyItem.dialogId = g5bVar.b.longValue();
                        oab createOverlayStoryViewer = Q2.createOverlayStoryViewer();
                        createOverlayStoryViewer.J(l48Var.getContext(), storyItem, null);
                        createOverlayStoryViewer.o1 = new j48(oabVar, (byte) 0);
                        oabVar.U();
                        break;
                    }
                } else {
                    u31 Q3 = new c41(l48Var.z0.S0, r63Var).Q(R.raw.story_bomb2, 36, jb6.M0(2131744292, null));
                    Q3.a = 3;
                    Q3.k(true);
                    break;
                }
                break;
            case 15:
                TL_stories.StoryItem storyItem2 = (TL_stories.StoryItem) obj3;
                r63 r63Var2 = (r63) obj2;
                a4b a4bVar = (a4b) obj;
                boolean contains = ((HashSet) obj4).contains(Integer.valueOf(a4bVar.a));
                a58 a58Var2 = ((v48) obj5).x;
                h4b h4bVar = a58Var2.I1;
                if (contains) {
                    h4bVar.b(a4bVar.a, a58Var2.r1, storyItem2);
                    a0 = jb6.a0(null, null, 2131744420, a4bVar.b);
                } else {
                    long j2 = a58Var2.r1;
                    int i2 = a4bVar.a;
                    h4bVar.getClass();
                    ArrayList arrayList4 = new ArrayList(1);
                    arrayList4.add(storyItem2);
                    h4bVar.e0(i2, j2, arrayList4);
                    a0 = jb6.a0(null, null, 2131744180, a4bVar.b);
                }
                b10.u(a0, new c41(a58Var2.S0, r63Var2), R.raw.contact_check, 36);
                v48 v48Var = a58Var2.j1;
                if (v48Var != null) {
                    v48Var.a();
                    break;
                }
                break;
            case 16:
                Runnable[] runnableArr = (Runnable[]) obj5;
                ValueAnimator[] valueAnimatorArr = (ValueAnimator[]) obj4;
                TextView textView = (TextView) obj3;
                TextView textView2 = (TextView) obj2;
                Boolean bool = (Boolean) obj;
                gm.r(runnableArr[0]);
                ValueAnimator valueAnimator = valueAnimatorArr[0];
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                }
                ValueAnimator ofFloat = ValueAnimator.ofFloat(textView.getAlpha(), bool.booleanValue() ? 1.0f : 0.0f);
                valueAnimatorArr[0] = ofFloat;
                ofFloat.addUpdateListener(new pl(textView, textView2, (byte) 22));
                valueAnimatorArr[0].setDuration(320L);
                valueAnimatorArr[0].setInterpolator(d53.h);
                valueAnimatorArr[0].start();
                if (bool.booleanValue()) {
                    gm.d3(runnableArr[0], 5320L);
                    break;
                }
                break;
            case 17:
                y39 y39Var = (y39) obj5;
                oc7.r1(y39Var.a).F0().a(-((TLRPC.Chat) obj4).id, new jv0((Object) y39Var, obj, obj3, obj2, (byte) 18));
                break;
            case 18:
                ((y39) obj5).dismiss();
                nm7.f(z8c.t0).k(nm7.W2, (TL_stories.TL_premium_myBoosts) obj4, Integer.valueOf(((ArrayList) obj3).size()), Integer.valueOf(((HashSet) obj2).size()), (TL_stories.TL_premium_boostsStatus) obj);
                break;
            case 19:
                vz9 vz9Var = (vz9) obj5;
                String[] strArr = (String[]) obj4;
                String str5 = (String) obj3;
                LinkedHashSet linkedHashSet = (LinkedHashSet) obj2;
                Runnable runnable3 = (Runnable) obj;
                int i3 = vz9Var.W;
                if (ConnectionsManager.getInstance(i3).getConnectionState() != 3) {
                    runnable3.run();
                    break;
                } else {
                    hs6.d0(i3).b2(true, strArr.length != 0 ? strArr[0] : "", str5, new i48((Object) vz9Var, (Object) linkedHashSet, (Object) runnable3, (byte) 6), false);
                    break;
                }
            case 20:
                vz9 vz9Var2 = (vz9) obj5;
                String str6 = (String) obj3;
                ArrayList arrayList5 = (ArrayList) obj4;
                HashMap hashMap = (HashMap) obj2;
                Runnable runnable4 = (Runnable) obj;
                int i4 = vz9Var2.W;
                if (vz9Var2.a0 != 4) {
                    runnable4.run();
                    break;
                } else {
                    ArrayList arrayList6 = new ArrayList(0);
                    LongSparseArray longSparseArray = new LongSparseArray(0);
                    HashMap hashMap2 = hs6.d0(i4).e0;
                    if (str6.length() <= 14) {
                        int length = str6.length();
                        int i5 = 0;
                        CharSequence charSequence = str6;
                        while (i5 < length) {
                            if (i5 < length - 1) {
                                if (charSequence.charAt(i5) == 55356) {
                                    int i6 = i5 + 1;
                                    if (charSequence.charAt(i6) >= 57339) {
                                        break;
                                    }
                                }
                                if (charSequence.charAt(i5) == 8205) {
                                    int i7 = i5 + 1;
                                    if (charSequence.charAt(i7) != 9792) {
                                        break;
                                    }
                                    charSequence = TextUtils.concat(charSequence.subSequence(0, i5), charSequence.subSequence(i5 + 2, charSequence.length()));
                                    length -= 2;
                                    i5--;
                                    i5++;
                                }
                            }
                            if (charSequence.charAt(i5) == 65039) {
                                charSequence = TextUtils.concat(charSequence.subSequence(0, i5), charSequence.subSequence(i5 + 1, charSequence.length()));
                                length--;
                                i5--;
                                i5++;
                            } else {
                                i5++;
                            }
                        }
                        ArrayList arrayList7 = hashMap2 != null ? (ArrayList) hashMap2.get(charSequence.toString()) : null;
                        if (arrayList7 != null && !arrayList7.isEmpty()) {
                            arrayList6.addAll(arrayList7);
                            int size2 = arrayList7.size();
                            for (int i8 = 0; i8 < size2; i8++) {
                                TLRPC.Document document = (TLRPC.Document) arrayList7.get(i8);
                                longSparseArray.put(document.id, document);
                            }
                            arrayList5.add(arrayList6);
                        }
                    }
                    if (hashMap2 != null && !hashMap2.isEmpty() && str6.length() > 1) {
                        hs6.d0(i4).W(vz9.c2, str6, false, new lu((Object) hashMap2, (Object) hashMap, (Object) arrayList5, (Object) runnable4, (byte) 18), false);
                        break;
                    }
                }
                break;
            case 21:
                ((nha) obj5).z0((HashSet) obj4, (TL_stories.StoryItem) obj3, (bu5) obj2, (a4b) obj);
                break;
            case 22:
                ((pqc) obj5).b0((String) obj3, (c) obj4, (d) obj2, (String) obj);
                break;
            case 23:
                c cVar2 = (c) obj4;
                cVar2.y((String) obj3, new jv0(obj5, obj, obj2, (Object) cVar2, (byte) 24));
                break;
            default:
                vqc vqcVar = (vqc) obj5;
                qac qacVar2 = (qac) obj4;
                g35 g35Var = (g35) obj3;
                c cVar3 = (c) obj2;
                r25 r25Var2 = (r25) obj;
                if (r25Var2 == null) {
                    qacVar2.a("ADDRESS_NO_INFO");
                    break;
                } else {
                    byte[] bArr = r25Var2.c;
                    boolean z2 = false;
                    if (bArr == null) {
                        byte[][] n = g35Var.n();
                        if (n.length <= 0) {
                            qacVar2.a("STORAGE_NO_PUBLIC_KEY");
                            break;
                        } else {
                            bArr = n[0];
                        }
                    }
                    if (g35Var.f(bArr)) {
                        g35.i.execute(new qf2(g35Var, g35Var.l(), bArr != null ? g35.p(bArr) : "", z2, new i48(vqcVar, qacVar2, cVar3, g35Var)));
                        break;
                    } else {
                        qacVar2.a("STORAGE_OLD_PUBLIC_KEY");
                        break;
                    }
                }
        }
    }

    public /* synthetic */ jv0(Object obj, String str, Object obj2, Object obj3, byte b) {
        this.a = b;
        this.b = obj;
        this.d = str;
        this.c = obj2;
        this.e = obj3;
    }

    public /* synthetic */ jv0(Object obj, Object obj2, Object obj3, Object obj4, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
        this.e = obj4;
    }
}
