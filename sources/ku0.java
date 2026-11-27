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
import org.telegram.ui.ActionBar.e;
import org.telegram.ui.Components.ChatActivityEnterView;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.Wallet.c;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final /* synthetic */ class ku0 implements pcc {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ ku0(ChatActivityEnterView chatActivityEnterView, r47 r47Var, TL_keyboard.TL_buttonTypeRequestPeer tL_buttonTypeRequestPeer, TLRPC.User user) {
        this.a = (byte) 3;
        this.b = chatActivityEnterView;
        this.c = r47Var;
        this.e = tL_buttonTypeRequestPeer;
        this.d = user;
    }

    /* JADX WARN: Code restructure failed: missing block: B:46:0x0104, code lost:
    
        if (r10.charAt(r11) <= 57343) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x011e, code lost:
    
        if (r10.charAt(r11) != 9794) goto L51;
     */
    @Override // pcc
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(Object obj) {
        String a0;
        byte b = this.a;
        byte b2 = 4;
        int i = 0;
        Object obj2 = this.e;
        Object obj3 = this.d;
        Object obj4 = this.c;
        Object obj5 = this.b;
        switch (b) {
            case 0:
                rv0 rv0Var = (rv0) obj5;
                pv0 pv0Var = (pv0) obj4;
                String str = (String) obj3;
                TL_keyboard.TL_buttonTypeRequestPeer tL_buttonTypeRequestPeer = (TL_keyboard.TL_buttonTypeRequestPeer) obj2;
                TLRPC.User user = (TLRPC.User) obj;
                if (user != null) {
                    TLRPC.TL_messages_sendBotRequestedPeer tL_messages_sendBotRequestedPeer = new TLRPC.TL_messages_sendBotRequestedPeer();
                    tL_messages_sendBotRequestedPeer.peer = uc7.n1(rv0Var.V);
                    tL_messages_sendBotRequestedPeer.webapp_req_id = str;
                    tL_messages_sendBotRequestedPeer.button_id = tL_buttonTypeRequestPeer.button_id;
                    tL_messages_sendBotRequestedPeer.requested_peers.add(uc7.n1(user));
                    ConnectionsManager.getInstance(rv0Var.N).sendRequestTyped(tL_messages_sendBotRequestedPeer, new ic((byte) 0), new nu0((Object) rv0Var, (Object) pv0Var, (Object) str, (Object) user, (byte) 0));
                    rv0Var.u(pv0Var, "requested_chat_sent", rv0.x(str, "req_id"));
                    break;
                } else {
                    rv0Var.u(pv0Var, "requested_chat_failed", rv0.x(str, "req_id"));
                    break;
                }
            case 1:
                rv0 rv0Var2 = (rv0) obj5;
                pv0 pv0Var2 = (pv0) obj4;
                String str2 = (String) obj3;
                String str3 = (String) obj2;
                if (!((Boolean) obj).booleanValue()) {
                    rv0Var2.u(pv0Var2, "file_download_requested", rv0.x("cancelled", "status"));
                    break;
                } else {
                    rv0Var2.m0.b(str2, str3);
                    rv0Var2.u(pv0Var2, "file_download_requested", rv0.x("downloading", "status"));
                    break;
                }
            case 2:
                wh1 wh1Var = (wh1) obj5;
                wh1Var.getClass();
                hl.c3(new la7((Object) wh1Var, obj4, obj3, obj2, obj, (byte) 15));
                break;
            case 3:
                ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) obj5;
                r47 r47Var = (r47) obj4;
                TL_keyboard.TL_buttonTypeRequestPeer tL_buttonTypeRequestPeer2 = (TL_keyboard.TL_buttonTypeRequestPeer) obj2;
                TLRPC.User user2 = (TLRPC.User) obj3;
                TLRPC.User user3 = (TLRPC.User) obj;
                int i2 = ChatActivityEnterView.X7;
                if (user3 != null) {
                    TLRPC.TL_messages_sendBotRequestedPeer tL_messages_sendBotRequestedPeer2 = new TLRPC.TL_messages_sendBotRequestedPeer();
                    tL_messages_sendBotRequestedPeer2.peer = uc7.s1(chatActivityEnterView.R).m1(r47Var.k.peer_id);
                    tL_messages_sendBotRequestedPeer2.flags |= 1;
                    tL_messages_sendBotRequestedPeer2.msg_id = r47Var.e1();
                    tL_messages_sendBotRequestedPeer2.button_id = tL_buttonTypeRequestPeer2.button_id;
                    tL_messages_sendBotRequestedPeer2.requested_peers.add(uc7.n1(user3));
                    ConnectionsManager.getInstance(chatActivityEnterView.R).sendRequest(tL_messages_sendBotRequestedPeer2, null);
                    long j = user2.id;
                    Bundle bundle = new Bundle();
                    bundle.putLong("user_id", user3.id);
                    ly1 ly1Var = new ly1(bundle, user3, user2, j);
                    zu1 zu1Var = chatActivityEnterView.E3;
                    if (zu1Var != null) {
                        zu1Var.presentFragment(ly1Var);
                        break;
                    }
                }
                break;
            case 4:
                ((s42) obj5).W((zu1) obj4, (TLRPC.TL_messageMediaGeo) obj3, (vnb) obj2, (Long) obj);
                break;
            case 5:
                ((s42) obj5).X((zu1) obj4, (TLRPC.TL_messageMediaVenue) obj3, (vnb) obj2);
                break;
            case 6:
                a72 a72Var = (a72) obj5;
                zu1 zu1Var2 = (zu1) obj4;
                TLRPC.TL_messageMediaPoll tL_messageMediaPoll = (TLRPC.TL_messageMediaPoll) obj3;
                ArrayList arrayList = (ArrayList) obj2;
                Long l = (Long) obj;
                if (!zu1Var2.X7()) {
                    a72Var.k0.a(tL_messageMediaPoll, a72Var.P, a72Var.n1, arrayList, true, 0, l.longValue());
                    a72Var.b.a(true);
                    break;
                } else {
                    jj.I(zu1Var2.getParentActivity(), zu1Var2.a(), new pt((Object) a72Var, (Object) tL_messageMediaPoll, (Object) arrayList, (Object) l, (byte) 6));
                    break;
                }
            case 7:
                uj3 uj3Var = (uj3) obj5;
                uj3Var.m5(uj3Var.getMessagesController().M0((Long) obj4), (Runnable) obj, new cv2(uj3Var, (gi1) obj3, (e) obj2, b2));
                break;
            case 8:
                o14 o14Var = (o14) obj5;
                ArrayList arrayList2 = (ArrayList) obj4;
                Runnable runnable = (Runnable) obj2;
                ArrayList arrayList3 = (ArrayList) obj;
                if (((String) obj3).equals(o14Var.w)) {
                    wl.g(o14Var.G.d1).f(arrayList3);
                    int size = arrayList3.size();
                    while (i < size) {
                        Object obj6 = arrayList3.get(i);
                        i++;
                        hs6 hs6Var = new hs6();
                        hs6Var.a = "animated_" + ((TLRPC.Document) obj6).id;
                        hs6Var.b = null;
                        arrayList2.add(hs6Var);
                    }
                    runnable.run();
                    break;
                }
                break;
            case 9:
                ov4 ov4Var = (ov4) obj5;
                TL_payments.TL_StarGiftAuctionState tL_StarGiftAuctionState = (TL_payments.TL_StarGiftAuctionState) obj4;
                ov4Var.d(tL_StarGiftAuctionState.gift.id).c = (ArrayList) obj;
                ov4Var.f(tL_StarGiftAuctionState.gift.id, tL_StarGiftAuctionState);
                ((icc) obj3).a(tL_StarGiftAuctionState, (TLRPC.TL_error) obj2);
                break;
            case 10:
                e eVar = (e) obj4;
                String str4 = (String) obj3;
                l01 l01Var = (l01) obj2;
                TLRPC.TL_payments_checkedGiftCode tL_payments_checkedGiftCode = (TLRPC.TL_payments_checkedGiftCode) obj;
                if (!((AtomicBoolean) obj5).get() && eVar.getParentActivity() != null) {
                    if (tL_payments_checkedGiftCode.from_id == null) {
                        TLRPC.TL_premiumGiftOption tL_premiumGiftOption = new TLRPC.TL_premiumGiftOption();
                        tL_premiumGiftOption.months = tL_payments_checkedGiftCode.months;
                        TLRPC.User h = eVar instanceof zu1 ? ((zu1) eVar).h() : null;
                        if (h == null || h.self) {
                            h = new TLRPC.TL_user();
                        }
                        TLRPC.User user4 = h;
                        boolean z = tL_payments_checkedGiftCode.used_date != 0;
                        e Q = LaunchActivity.Q();
                        if (Q != null && wl8.N2 == null) {
                            wl8 wl8Var = new wl8(Q, yac.t0, user4, new pw4(tL_premiumGiftOption), str4, z, Q.getResourceProvider());
                            wl8Var.show();
                            wl8.N2 = wl8Var;
                        }
                    } else {
                        eVar.showDialog(new tv4(eVar, tL_payments_checkedGiftCode, str4));
                    }
                    if (l01Var != null) {
                        l01Var.b();
                        break;
                    }
                }
                break;
            case 11:
                yx4 yx4Var = (yx4) obj5;
                pcc pccVar = (pcc) obj3;
                mx4 mx4Var = (mx4) obj2;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj;
                ((l01) obj4).b();
                if (pccVar != null) {
                    pccVar.a(Boolean.FALSE);
                }
                yx4Var.dismiss();
                if (tL_error == null) {
                    yx4Var.dismiss();
                    break;
                } else {
                    hl.c3(new se4(mx4Var, tL_error, (byte) 11));
                    break;
                }
            case 12:
                c cVar = (c) obj5;
                v25 v25Var = (v25) obj4;
                Runnable runnable2 = (Runnable) obj2;
                v25Var.c = (byte[]) obj;
                if (cVar.Q.get((String) obj3) == v25Var) {
                    cVar.y0(v25Var);
                    cVar.T();
                }
                runnable2.run();
                break;
            case 13:
                TLRPC.TL_document tL_document = (TLRPC.TL_document) obj4;
                Long l2 = (Long) obj;
                o68 o68Var = ((k58) obj5).a;
                r7a.B(o68Var.m2).t0(tL_document, (String) obj3, o68Var.l1, null, null, o68Var.y1.a, null, null, true, 0, 0, false, this.e, null, l2.longValue(), o68Var.L1.getSendMonoForumPeerId(), o68Var.L1.getSendMessageSuggestionParams());
                o68Var.L1.j(tL_document);
                o68Var.L1.setFieldText("");
                o68Var.a0(l2.longValue() <= 0);
                break;
            case 14:
                z58 z58Var = (z58) obj5;
                b7b b7bVar = (b7b) obj4;
                lcb lcbVar = (lcb) obj3;
                x53 x53Var = (x53) obj2;
                TL_stories.StoryItem storyItem = (TL_stories.StoryItem) obj;
                if (storyItem == null) {
                    v21 Q2 = new d31(z58Var.z0.M0, x53Var).Q(R.raw.story_bomb2, 36, ob6.M0(2131744260, null));
                    Q2.a = 3;
                    Q2.k(true);
                    break;
                } else {
                    e Q3 = LaunchActivity.Q();
                    if (Q3 != null) {
                        storyItem.dialogId = b7bVar.b.longValue();
                        lcb createOverlayStoryViewer = Q3.createOverlayStoryViewer();
                        createOverlayStoryViewer.J(z58Var.getContext(), storyItem, null);
                        createOverlayStoryViewer.o1 = new y58(lcbVar, (byte) 0);
                        lcbVar.U();
                        break;
                    }
                }
                break;
            case 15:
                TL_stories.StoryItem storyItem2 = (TL_stories.StoryItem) obj3;
                x53 x53Var2 = (x53) obj2;
                w5b w5bVar = (w5b) obj;
                boolean contains = ((HashSet) obj4).contains(Integer.valueOf(w5bVar.a));
                o68 o68Var2 = ((j68) obj5).x;
                c6b c6bVar = o68Var2.C1;
                if (contains) {
                    c6bVar.b(w5bVar.a, o68Var2.l1, storyItem2);
                    a0 = ob6.a0(null, null, 2131744388, w5bVar.b);
                } else {
                    long j2 = o68Var2.l1;
                    int i3 = w5bVar.a;
                    c6bVar.getClass();
                    ArrayList arrayList4 = new ArrayList(1);
                    arrayList4.add(storyItem2);
                    c6bVar.e0(i3, j2, arrayList4);
                    a0 = ob6.a0(null, null, 2131744148, w5bVar.b);
                }
                c00.v(a0, new d31(o68Var2.M0, x53Var2), R.raw.contact_check, 36);
                j68 j68Var = o68Var2.d1;
                if (j68Var != null) {
                    j68Var.a();
                    break;
                }
                break;
            case 16:
                Runnable[] runnableArr = (Runnable[]) obj5;
                ValueAnimator[] valueAnimatorArr = (ValueAnimator[]) obj4;
                TextView textView = (TextView) obj3;
                TextView textView2 = (TextView) obj2;
                Boolean bool = (Boolean) obj;
                hl.r(runnableArr[0]);
                ValueAnimator valueAnimator = valueAnimatorArr[0];
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                }
                ValueAnimator ofFloat = ValueAnimator.ofFloat(textView.getAlpha(), bool.booleanValue() ? 1.0f : 0.0f);
                valueAnimatorArr[0] = ofFloat;
                ofFloat.addUpdateListener(new lk(textView, textView2, (byte) 22));
                valueAnimatorArr[0].setDuration(320L);
                valueAnimatorArr[0].setInterpolator(k43.h);
                valueAnimatorArr[0].start();
                if (bool.booleanValue()) {
                    hl.d3(runnableArr[0], 5320L);
                    break;
                }
                break;
            case 17:
                j59 j59Var = (j59) obj5;
                uc7.s1(j59Var.a).G0().a(-((TLRPC.Chat) obj4).id, new ku0((Object) j59Var, obj, obj3, obj2, (byte) 18));
                break;
            case 18:
                ((j59) obj5).dismiss();
                jn7.f(yac.t0).k(jn7.W2, (TL_stories.TL_premium_myBoosts) obj4, Integer.valueOf(((ArrayList) obj3).size()), Integer.valueOf(((HashSet) obj2).size()), (TL_stories.TL_premium_boostsStatus) obj);
                break;
            case 19:
                n1a n1aVar = (n1a) obj5;
                String[] strArr = (String[]) obj4;
                String str5 = (String) obj3;
                LinkedHashSet linkedHashSet = (LinkedHashSet) obj2;
                Runnable runnable3 = (Runnable) obj;
                int i4 = n1aVar.W;
                if (ConnectionsManager.getInstance(i4).getConnectionState() == 3) {
                    ls6.d0(i4).b2(true, strArr.length != 0 ? strArr[0] : "", str5, new w58((Object) n1aVar, (Object) linkedHashSet, (Object) runnable3, (byte) 6), false);
                    break;
                } else {
                    runnable3.run();
                    break;
                }
            case 20:
                n1a n1aVar2 = (n1a) obj5;
                String str6 = (String) obj3;
                ArrayList arrayList5 = (ArrayList) obj4;
                HashMap hashMap = (HashMap) obj2;
                Runnable runnable4 = (Runnable) obj;
                int i5 = n1aVar2.W;
                if (n1aVar2.a0 == 4) {
                    ArrayList arrayList6 = new ArrayList(0);
                    LongSparseArray longSparseArray = new LongSparseArray(0);
                    HashMap hashMap2 = ls6.d0(i5).e0;
                    if (str6.length() <= 14) {
                        int length = str6.length();
                        int i6 = 0;
                        CharSequence charSequence = str6;
                        while (i6 < length) {
                            if (i6 < length - 1) {
                                if (charSequence.charAt(i6) == 55356) {
                                    int i7 = i6 + 1;
                                    if (charSequence.charAt(i7) >= 57339) {
                                        break;
                                    }
                                }
                                if (charSequence.charAt(i6) == 8205) {
                                    int i8 = i6 + 1;
                                    if (charSequence.charAt(i8) != 9792) {
                                        break;
                                    }
                                    charSequence = TextUtils.concat(charSequence.subSequence(0, i6), charSequence.subSequence(i6 + 2, charSequence.length()));
                                    length -= 2;
                                    i6--;
                                    i6++;
                                }
                            }
                            if (charSequence.charAt(i6) == 65039) {
                                charSequence = TextUtils.concat(charSequence.subSequence(0, i6), charSequence.subSequence(i6 + 1, charSequence.length()));
                                length--;
                                i6--;
                                i6++;
                            } else {
                                i6++;
                            }
                        }
                        ArrayList arrayList7 = hashMap2 != null ? (ArrayList) hashMap2.get(charSequence.toString()) : null;
                        if (arrayList7 != null && !arrayList7.isEmpty()) {
                            arrayList6.addAll(arrayList7);
                            int size2 = arrayList7.size();
                            while (i < size2) {
                                TLRPC.Document document = (TLRPC.Document) arrayList7.get(i);
                                longSparseArray.put(document.id, document);
                                i++;
                            }
                            arrayList5.add(arrayList6);
                        }
                    }
                    if (hashMap2 != null && !hashMap2.isEmpty() && str6.length() > 1) {
                        ls6.d0(i5).W(n1a.c2, str6, false, new pt((Object) hashMap2, (Object) hashMap, (Object) arrayList5, (Object) runnable4, (byte) 20), false);
                        break;
                    }
                } else {
                    runnable4.run();
                    break;
                }
                break;
            case 21:
                ((eja) obj5).z0((HashSet) obj4, (TL_stories.StoryItem) obj3, (fu5) obj2, (w5b) obj);
                break;
            case 22:
                ((atc) obj5).a0((String) obj3, (c) obj4, (e) obj2, (String) obj);
                break;
            case 23:
                c cVar2 = (c) obj4;
                cVar2.y((String) obj3, new ku0(obj5, obj, obj2, (Object) cVar2, (byte) 24));
                break;
            default:
                gtc gtcVar = (gtc) obj5;
                pcc pccVar2 = (pcc) obj4;
                k35 k35Var = (k35) obj3;
                c cVar3 = (c) obj2;
                v25 v25Var2 = (v25) obj;
                if (v25Var2 != null) {
                    byte[] bArr = v25Var2.c;
                    boolean z2 = false;
                    if (bArr == null) {
                        byte[][] n = k35Var.n();
                        if (n.length <= 0) {
                            pccVar2.a("STORAGE_NO_PUBLIC_KEY");
                            break;
                        } else {
                            bArr = n[0];
                        }
                    }
                    if (!k35Var.f(bArr)) {
                        pccVar2.a("STORAGE_OLD_PUBLIC_KEY");
                        break;
                    } else {
                        k35.i.execute(new re2(k35Var, k35Var.l(), bArr != null ? k35.p(bArr) : "", z2, new w58(gtcVar, pccVar2, cVar3, k35Var)));
                        break;
                    }
                } else {
                    pccVar2.a("ADDRESS_NO_INFO");
                    break;
                }
        }
    }

    public /* synthetic */ ku0(Object obj, String str, Object obj2, Object obj3, byte b) {
        this.a = b;
        this.b = obj;
        this.d = str;
        this.c = obj2;
        this.e = obj3;
    }

    public /* synthetic */ ku0(Object obj, Object obj2, Object obj3, Object obj4, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
        this.e = obj4;
    }
}
