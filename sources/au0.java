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

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final /* synthetic */ class au0 implements p8c {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ au0(ChatActivityEnterView chatActivityEnterView, k27 k27Var, TL_keyboard.TL_buttonTypeRequestPeer tL_buttonTypeRequestPeer, TLRPC.User user) {
        this.a = (byte) 3;
        this.b = chatActivityEnterView;
        this.c = k27Var;
        this.e = tL_buttonTypeRequestPeer;
        this.d = user;
    }

    /* JADX WARN: Code restructure failed: missing block: B:46:0x0105, code lost:
    
        if (r6.charAt(r11) <= 57343) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x011f, code lost:
    
        if (r6.charAt(r11) != 9794) goto L51;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // p8c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(Object obj) {
        String a0;
        byte b = this.a;
        byte b2 = 14;
        byte b3 = 0;
        Object obj2 = this.e;
        Object obj3 = this.d;
        Object obj4 = this.c;
        Object obj5 = this.b;
        switch (b) {
            case 0:
                hv0 hv0Var = (hv0) obj5;
                ev0 ev0Var = (ev0) obj4;
                String str = (String) obj3;
                TL_keyboard.TL_buttonTypeRequestPeer tL_buttonTypeRequestPeer = (TL_keyboard.TL_buttonTypeRequestPeer) obj2;
                TLRPC.User user = (TLRPC.User) obj;
                if (user == null) {
                    hv0Var.u(ev0Var, "requested_chat_failed", hv0.x(str, "req_id"));
                    break;
                } else {
                    TLRPC.TL_messages_sendBotRequestedPeer tL_messages_sendBotRequestedPeer = new TLRPC.TL_messages_sendBotRequestedPeer();
                    tL_messages_sendBotRequestedPeer.peer = na7.l1(hv0Var.V);
                    tL_messages_sendBotRequestedPeer.webapp_req_id = str;
                    tL_messages_sendBotRequestedPeer.button_id = tL_buttonTypeRequestPeer.button_id;
                    tL_messages_sendBotRequestedPeer.requested_peers.add(na7.l1(user));
                    ConnectionsManager.getInstance(hv0Var.N).sendRequestTyped(tL_messages_sendBotRequestedPeer, new hc(b3), new eu0((Object) hv0Var, (Object) ev0Var, (Object) str, (Object) user, (byte) 0));
                    hv0Var.u(ev0Var, "requested_chat_sent", hv0.x(str, "req_id"));
                    break;
                }
            case 1:
                hv0 hv0Var2 = (hv0) obj5;
                ev0 ev0Var2 = (ev0) obj4;
                String str2 = (String) obj3;
                String str3 = (String) obj2;
                if (((Boolean) obj).booleanValue()) {
                    hv0Var2.m0.b(str2, str3);
                    hv0Var2.u(ev0Var2, "file_download_requested", hv0.x("downloading", "status"));
                    break;
                } else {
                    hv0Var2.u(ev0Var2, "file_download_requested", hv0.x("cancelled", "status"));
                    break;
                }
            case 2:
                nh1 nh1Var = (nh1) obj5;
                nh1Var.getClass();
                gl.d3(new b87((Object) nh1Var, obj4, obj3, obj2, obj, (byte) 15));
                break;
            case 3:
                ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) obj5;
                k27 k27Var = (k27) obj4;
                TL_keyboard.TL_buttonTypeRequestPeer tL_buttonTypeRequestPeer2 = (TL_keyboard.TL_buttonTypeRequestPeer) obj2;
                TLRPC.User user2 = (TLRPC.User) obj3;
                TLRPC.User user3 = (TLRPC.User) obj;
                int i = ChatActivityEnterView.r7;
                if (user3 != null) {
                    TLRPC.TL_messages_sendBotRequestedPeer tL_messages_sendBotRequestedPeer2 = new TLRPC.TL_messages_sendBotRequestedPeer();
                    tL_messages_sendBotRequestedPeer2.peer = na7.q1(chatActivityEnterView.R).k1(k27Var.k.peer_id);
                    tL_messages_sendBotRequestedPeer2.flags |= 1;
                    tL_messages_sendBotRequestedPeer2.msg_id = k27Var.e1();
                    tL_messages_sendBotRequestedPeer2.button_id = tL_buttonTypeRequestPeer2.button_id;
                    tL_messages_sendBotRequestedPeer2.requested_peers.add(na7.l1(user3));
                    ConnectionsManager.getInstance(chatActivityEnterView.R).sendRequest(tL_messages_sendBotRequestedPeer2, null);
                    long j = user2.id;
                    Bundle bundle = new Bundle();
                    bundle.putLong("user_id", user3.id);
                    vx1 vx1Var = new vx1(bundle, user3, user2, j);
                    mu1 mu1Var = chatActivityEnterView.F3;
                    if (mu1Var != null) {
                        mu1Var.presentFragment(vx1Var);
                        break;
                    }
                }
                break;
            case 4:
                ((c42) obj5).X((mu1) obj4, (TLRPC.TL_messageMediaGeo) obj3, (wjb) obj2, (Long) obj);
                break;
            case 5:
                ((c42) obj5).Y((mu1) obj4, (TLRPC.TL_messageMediaVenue) obj3, (wjb) obj2);
                break;
            case 6:
                k62 k62Var = (k62) obj5;
                mu1 mu1Var2 = (mu1) obj4;
                TLRPC.TL_messageMediaPoll tL_messageMediaPoll = (TLRPC.TL_messageMediaPoll) obj3;
                ArrayList arrayList = (ArrayList) obj2;
                Long l = (Long) obj;
                if (mu1Var2.N7()) {
                    ij.I(mu1Var2.getParentActivity(), mu1Var2.a(), new lt((Object) k62Var, (Object) tL_messageMediaPoll, (Object) arrayList, (Object) l, (byte) 6));
                    break;
                } else {
                    k62Var.k0.a(tL_messageMediaPoll, k62Var.P, k62Var.n1, arrayList, true, 0, l.longValue());
                    k62Var.b.a(true);
                    break;
                }
            case 7:
                cj3 cj3Var = (cj3) obj5;
                cj3Var.i5(cj3Var.getMessagesController().K0((Long) obj4), (Runnable) obj, new mg3(cj3Var, (yh1) obj3, (d) obj2, b3));
                break;
            case 8:
                t04 t04Var = (t04) obj5;
                ArrayList arrayList2 = (ArrayList) obj4;
                Runnable runnable = (Runnable) obj2;
                ArrayList arrayList3 = (ArrayList) obj;
                if (((String) obj3).equals(t04Var.w)) {
                    vl.g(t04Var.G.d1).f(arrayList3);
                    int size = arrayList3.size();
                    while (b3 < size) {
                        Object obj6 = arrayList3.get(b3);
                        dq6 dq6Var = new dq6();
                        dq6Var.a = "animated_" + ((TLRPC.Document) obj6).id;
                        dq6Var.b = null;
                        arrayList2.add(dq6Var);
                        b3++;
                    }
                    runnable.run();
                    break;
                }
                break;
            case 9:
                kt4 kt4Var = (kt4) obj5;
                TL_payments.TL_StarGiftAuctionState tL_StarGiftAuctionState = (TL_payments.TL_StarGiftAuctionState) obj4;
                kt4Var.d(tL_StarGiftAuctionState.gift.id).c = (ArrayList) obj;
                kt4Var.f(tL_StarGiftAuctionState.gift.id, tL_StarGiftAuctionState);
                ((i8c) obj3).a(tL_StarGiftAuctionState, (TLRPC.TL_error) obj2);
                break;
            case 10:
                d dVar = (d) obj4;
                String str4 = (String) obj3;
                c01 c01Var = (c01) obj2;
                TLRPC.TL_payments_checkedGiftCode tL_payments_checkedGiftCode = (TLRPC.TL_payments_checkedGiftCode) obj;
                if (!((AtomicBoolean) obj5).get() && dVar.getParentActivity() != null) {
                    if (tL_payments_checkedGiftCode.from_id == null) {
                        TLRPC.TL_premiumGiftOption tL_premiumGiftOption = new TLRPC.TL_premiumGiftOption();
                        tL_premiumGiftOption.months = tL_payments_checkedGiftCode.months;
                        TLRPC.User h = dVar instanceof mu1 ? ((mu1) dVar).h() : null;
                        if (h == null || h.self) {
                            h = new TLRPC.TL_user();
                        }
                        TLRPC.User user4 = h;
                        boolean z = tL_payments_checkedGiftCode.used_date != 0;
                        d Q = LaunchActivity.Q();
                        if (Q != null && ji8.N2 == null) {
                            ji8 ji8Var = new ji8(Q, y6c.t0, user4, new mu4(tL_premiumGiftOption), str4, z, Q.getResourceProvider());
                            ji8Var.show();
                            ji8.N2 = ji8Var;
                        }
                    } else {
                        dVar.showDialog(new pt4(dVar, tL_payments_checkedGiftCode, str4));
                    }
                    if (c01Var != null) {
                        c01Var.b();
                        break;
                    }
                }
                break;
            case 11:
                tv4 tv4Var = (tv4) obj5;
                p8c p8cVar = (p8c) obj3;
                hv4 hv4Var = (hv4) obj2;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj;
                ((c01) obj4).b();
                if (p8cVar != null) {
                    p8cVar.a(Boolean.FALSE);
                }
                tv4Var.dismiss();
                if (tL_error != null) {
                    gl.d3(new vc4(hv4Var, tL_error, b2));
                    break;
                } else {
                    tv4Var.dismiss();
                    break;
                }
            case 12:
                c cVar = (c) obj5;
                r05 r05Var = (r05) obj4;
                Runnable runnable2 = (Runnable) obj2;
                r05Var.c = (byte[]) obj;
                if (cVar.Q.get((String) obj3) == r05Var) {
                    cVar.v0(r05Var);
                    cVar.S();
                }
                runnable2.run();
                break;
            case 13:
                TLRPC.TL_document tL_document = (TLRPC.TL_document) obj4;
                Long l2 = (Long) obj;
                y28 y28Var = ((t18) obj5).a;
                z3a.B(y28Var.s2).t0(tL_document, (String) obj3, y28Var.r1, null, null, y28Var.E1.a, null, null, true, 0, 0, false, this.e, null, l2.longValue(), y28Var.R1.getSendMonoForumPeerId(), y28Var.R1.getSendMessageSuggestionParams());
                y28Var.R1.k(tL_document);
                y28Var.R1.setFieldText("");
                y28Var.a0(l2.longValue() <= 0);
                break;
            case 14:
                i28 i28Var = (i28) obj5;
                f3b f3bVar = (f3b) obj4;
                m8b m8bVar = (m8b) obj3;
                f53 f53Var = (f53) obj2;
                TL_stories.StoryItem storyItem = (TL_stories.StoryItem) obj;
                if (storyItem != null) {
                    d Q2 = LaunchActivity.Q();
                    if (Q2 != null) {
                        storyItem.dialogId = f3bVar.b.longValue();
                        m8b createOverlayStoryViewer = Q2.createOverlayStoryViewer();
                        createOverlayStoryViewer.J(i28Var.getContext(), storyItem, null);
                        createOverlayStoryViewer.o1 = new g28(m8bVar, (byte) 0);
                        m8bVar.U();
                        break;
                    }
                } else {
                    m21 Q3 = new u21(i28Var.z0.S0, f53Var).Q(R.raw.story_bomb2, 36, k96.M0(2131744366, null));
                    Q3.a = (byte) 3;
                    Q3.k(true);
                    break;
                }
                break;
            case 15:
                TL_stories.StoryItem storyItem2 = (TL_stories.StoryItem) obj3;
                f53 f53Var2 = (f53) obj2;
                z1b z1bVar = (z1b) obj;
                boolean contains = ((HashSet) obj4).contains(Integer.valueOf(z1bVar.a));
                y28 y28Var2 = ((s28) obj5).x;
                g2b g2bVar = y28Var2.I1;
                if (contains) {
                    g2bVar.b(z1bVar.a, y28Var2.r1, storyItem2);
                    a0 = k96.a0(null, null, 2131744494, z1bVar.b);
                } else {
                    long j2 = y28Var2.r1;
                    int i2 = z1bVar.a;
                    g2bVar.getClass();
                    ArrayList arrayList4 = new ArrayList(1);
                    arrayList4.add(storyItem2);
                    g2bVar.e0(i2, j2, arrayList4);
                    a0 = k96.a0(null, null, 2131744254, z1bVar.b);
                }
                b00.u(a0, new u21(y28Var2.S0, f53Var2), R.raw.contact_check, 36);
                s28 s28Var = y28Var2.j1;
                if (s28Var != null) {
                    s28Var.a();
                    break;
                }
                break;
            case 16:
                Runnable[] runnableArr = (Runnable[]) obj5;
                ValueAnimator[] valueAnimatorArr = (ValueAnimator[]) obj4;
                TextView textView = (TextView) obj3;
                TextView textView2 = (TextView) obj2;
                Boolean bool = (Boolean) obj;
                gl.r(runnableArr[0]);
                ValueAnimator valueAnimator = valueAnimatorArr[0];
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                }
                ValueAnimator ofFloat = ValueAnimator.ofFloat(textView.getAlpha(), bool.booleanValue() ? 1.0f : 0.0f);
                valueAnimatorArr[0] = ofFloat;
                ofFloat.addUpdateListener(new pk(textView, textView2, (byte) 22));
                valueAnimatorArr[0].setDuration(320L);
                valueAnimatorArr[0].setInterpolator(s33.h);
                valueAnimatorArr[0].start();
                if (bool.booleanValue()) {
                    gl.e3(runnableArr[0], 5320L);
                    break;
                }
                break;
            case 17:
                u19 u19Var = (u19) obj5;
                na7.q1(u19Var.a).E0().a(-((TLRPC.Chat) obj4).id, new au0((Object) u19Var, obj, obj3, obj2, (byte) 18));
                break;
            case 18:
                ((u19) obj5).dismiss();
                kk7.f(y6c.t0).k(kk7.V2, (TL_stories.TL_premium_myBoosts) obj4, Integer.valueOf(((ArrayList) obj3).size()), Integer.valueOf(((HashSet) obj2).size()), (TL_stories.TL_premium_boostsStatus) obj);
                break;
            case 19:
                tx9 tx9Var = (tx9) obj5;
                String[] strArr = (String[]) obj4;
                String str5 = (String) obj3;
                LinkedHashSet linkedHashSet = (LinkedHashSet) obj2;
                Runnable runnable3 = (Runnable) obj;
                int i3 = tx9Var.W;
                if (ConnectionsManager.getInstance(i3).getConnectionState() != 3) {
                    runnable3.run();
                    break;
                } else {
                    hq6.d0(i3).b2(true, strArr.length != 0 ? strArr[0] : "", str5, new f28((Object) tx9Var, (Object) linkedHashSet, (Object) runnable3, (byte) 6), false);
                    break;
                }
            case 20:
                tx9 tx9Var2 = (tx9) obj5;
                String str6 = (String) obj3;
                ArrayList arrayList5 = (ArrayList) obj4;
                HashMap hashMap = (HashMap) obj2;
                Runnable runnable4 = (Runnable) obj;
                int i4 = tx9Var2.W;
                if (tx9Var2.a0 != 4) {
                    runnable4.run();
                    break;
                } else {
                    ArrayList arrayList6 = new ArrayList(0);
                    LongSparseArray longSparseArray = new LongSparseArray(0);
                    HashMap hashMap2 = hq6.d0(i4).e0;
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
                        hq6.d0(i4).W(tx9.c2, str6, false, new lt((Object) hashMap2, (Object) hashMap, (Object) arrayList5, (Object) runnable4, (byte) 18), false);
                        break;
                    }
                }
                break;
            case 21:
                ((nfa) obj5).z0((HashSet) obj4, (TL_stories.StoryItem) obj3, (cs5) obj2, (z1b) obj);
                break;
            case 22:
                ((noc) obj5).a0((String) obj3, (c) obj4, (d) obj2, (String) obj);
                break;
            case 23:
                c cVar2 = (c) obj4;
                cVar2.y((String) obj3, new au0(obj5, obj, obj2, (Object) cVar2, (byte) 24));
                break;
            default:
                toc tocVar = (toc) obj5;
                p8c p8cVar2 = (p8c) obj4;
                g15 g15Var = (g15) obj3;
                c cVar3 = (c) obj2;
                r05 r05Var2 = (r05) obj;
                if (r05Var2 == null) {
                    p8cVar2.a("ADDRESS_NO_INFO");
                    break;
                } else {
                    byte[] bArr = r05Var2.c;
                    boolean z2 = false;
                    if (bArr == null) {
                        byte[][] n = g15Var.n();
                        if (n.length <= 0) {
                            p8cVar2.a("STORAGE_NO_PUBLIC_KEY");
                            break;
                        } else {
                            bArr = n[0];
                        }
                    }
                    if (g15Var.f(bArr)) {
                        g15.i.execute(new fe2(g15Var, g15Var.l(), bArr != null ? g15.p(bArr) : "", z2, new f28(tocVar, p8cVar2, cVar3, g15Var)));
                        break;
                    } else {
                        p8cVar2.a("STORAGE_OLD_PUBLIC_KEY");
                        break;
                    }
                }
        }
    }

    public /* synthetic */ au0(Object obj, String str, Object obj2, Object obj3, byte b) {
        this.a = b;
        this.b = obj;
        this.d = str;
        this.c = obj2;
        this.e = obj3;
    }

    public /* synthetic */ au0(Object obj, Object obj2, Object obj3, Object obj4, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
        this.e = obj4;
    }
}
