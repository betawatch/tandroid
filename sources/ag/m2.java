package ag;

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
import org.telegram.messenger.cd;
import org.telegram.messenger.d20;
import org.telegram.messenger.jj;
import org.telegram.messenger.q20;
import org.telegram.messenger.qi;
import org.telegram.messenger.qz;
import org.telegram.messenger.ui;
import org.telegram.messenger.vp;
import org.telegram.messenger.z20;
import org.telegram.messenger.zs;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.p6;
import org.telegram.ui.Components.ChatActivityEnterView;
import org.telegram.ui.Components.bl;
import org.telegram.ui.Components.cc;
import org.telegram.ui.Components.f5;
import org.telegram.ui.Components.ff;
import org.telegram.ui.Components.gr;
import org.telegram.ui.Components.jn;
import org.telegram.ui.Components.s4;
import org.telegram.ui.Components.ux;
import org.telegram.ui.Components.wb;
import org.telegram.ui.Components.z60;
import org.telegram.ui.Components.zt0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ay;
import org.telegram.ui.cj0;
import org.telegram.ui.i31;
import org.telegram.ui.kd;
import org.telegram.ui.qq;
import org.telegram.ui.un;
import org.telegram.ui.zc;
import th.e5;
import th.e6;
import th.o7;
import th.y4;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class m2 implements q20 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ m2(Object obj, Object obj2, Object obj3, Object obj4, int i10) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
        this.e = obj4;
    }

    /* JADX WARN: Code restructure failed: missing block: B:63:0x023c, code lost:
    
        if (r12.charAt(r13) <= 57343) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x0256, code lost:
    
        if (r12.charAt(r13) != 9794) goto L66;
     */
    @Override // org.telegram.messenger.q20
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(Object obj) {
        String a02;
        int i10 = this.a;
        int i11 = 0;
        int i12 = 1;
        Object obj2 = this.e;
        Object obj3 = this.d;
        Object obj4 = this.c;
        Object obj5 = this.b;
        switch (i10) {
            case 0:
                Runnable[] runnableArr = (Runnable[]) obj5;
                ValueAnimator[] valueAnimatorArr = (ValueAnimator[]) obj4;
                TextView textView = (TextView) obj3;
                TextView textView2 = (TextView) obj2;
                Boolean bool = (Boolean) obj;
                org.telegram.messenger.i0.r(runnableArr[0]);
                ValueAnimator valueAnimator = valueAnimatorArr[0];
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                }
                ValueAnimator ofFloat = ValueAnimator.ofFloat(textView.getAlpha(), bool.booleanValue() ? 1.0f : 0.0f);
                valueAnimatorArr[0] = ofFloat;
                ofFloat.addUpdateListener(new p2(i11, textView, textView2));
                valueAnimatorArr[0].setDuration(320L);
                valueAnimatorArr[0].setInterpolator(gr.h);
                valueAnimatorArr[0].start();
                if (bool.booleanValue()) {
                    org.telegram.messenger.i0.h3(runnableArr[0], 5320L);
                    break;
                }
                break;
            case 1:
                org.telegram.ui.ActionBar.k2 k2Var = (org.telegram.ui.ActionBar.k2) obj4;
                String str = (String) obj3;
                gf.e eVar = (gf.e) obj2;
                TLRPC.TL_payments_checkedGiftCode tL_payments_checkedGiftCode = (TLRPC.TL_payments_checkedGiftCode) obj;
                if (!((AtomicBoolean) obj5).get() && k2Var.getParentActivity() != null) {
                    if (tL_payments_checkedGiftCode.from_id == null) {
                        TLRPC.TL_premiumGiftOption tL_premiumGiftOption = new TLRPC.TL_premiumGiftOption();
                        tL_premiumGiftOption.months = tL_payments_checkedGiftCode.months;
                        TLRPC.User j10 = k2Var instanceof un ? ((un) k2Var).j() : null;
                        if (j10 == null || j10.self) {
                            j10 = new TLRPC.TL_user();
                        }
                        TLRPC.User user = j10;
                        boolean z10 = tL_payments_checkedGiftCode.used_date != 0;
                        org.telegram.ui.ActionBar.k2 Q = LaunchActivity.Q();
                        if (Q != null && mg.c1.K2 == null) {
                            mg.c1 c1Var = new mg.c1(Q, d20.s0, user, new kg.m(tL_premiumGiftOption), str, z10, Q.getResourceProvider());
                            c1Var.show();
                            mg.c1.K2 = c1Var;
                        }
                    } else {
                        k2Var.showDialog(new mg.y0(k2Var, tL_payments_checkedGiftCode, str));
                    }
                    if (eVar != null) {
                        eVar.b();
                        break;
                    }
                }
                break;
            case 2:
                mg.o1 o1Var = (mg.o1) obj5;
                vp.r1(o1Var.a).G0().a(-((TLRPC.Chat) obj4).id, new m2(o1Var, (TL_stories.TL_premium_myBoosts) obj, (ArrayList) obj3, (HashSet) obj2, 3));
                break;
            case 3:
                ((mg.o1) obj5).dismiss();
                zs.f(d20.s0).k(zs.U2, (TL_stories.TL_premium_myBoosts) obj4, Integer.valueOf(((ArrayList) obj3).size()), Integer.valueOf(((HashSet) obj2).size()), (TL_stories.TL_premium_boostsStatus) obj);
                break;
            case 4:
                org.telegram.messenger.i0.g3(new e3((zc) obj5, (boolean[]) obj4, (int[]) obj3, (int[]) obj2, (TLRPC.TL_error) obj, 12));
                break;
            case 5:
                ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) obj5;
                jj jjVar = (jj) obj4;
                TL_keyboard.TL_buttonTypeRequestPeer tL_buttonTypeRequestPeer = (TL_keyboard.TL_buttonTypeRequestPeer) obj3;
                TLRPC.User user2 = (TLRPC.User) obj2;
                TLRPC.User user3 = (TLRPC.User) obj;
                int i13 = ChatActivityEnterView.s5;
                if (user3 != null) {
                    TLRPC.TL_messages_sendBotRequestedPeer tL_messages_sendBotRequestedPeer = new TLRPC.TL_messages_sendBotRequestedPeer();
                    tL_messages_sendBotRequestedPeer.peer = vp.r1(chatActivityEnterView.Q).l1(jjVar.k.peer_id);
                    tL_messages_sendBotRequestedPeer.flags |= 1;
                    tL_messages_sendBotRequestedPeer.msg_id = jjVar.f1();
                    tL_messages_sendBotRequestedPeer.button_id = tL_buttonTypeRequestPeer.button_id;
                    tL_messages_sendBotRequestedPeer.requested_peers.add(vp.m1(user3));
                    ConnectionsManager.getInstance(chatActivityEnterView.Q).sendRequest(tL_messages_sendBotRequestedPeer, null);
                    long j11 = user2.id;
                    Bundle bundle = new Bundle();
                    bundle.putLong("user_id", user3.id);
                    ff ffVar = new ff(bundle, user3, user2, j11);
                    un unVar = chatActivityEnterView.P2;
                    if (unVar != null) {
                        unVar.presentFragment(ffVar);
                        break;
                    }
                }
                break;
            case 6:
                bl.O((bl) obj5, (un) obj4, (TLRPC.TL_messageMediaGeo) obj3, (p6) obj2, (Long) obj);
                break;
            case 7:
                bl.S((bl) obj5, (un) obj4, (TLRPC.TL_messageMediaVenue) obj3, (p6) obj2);
                break;
            case 8:
                jn jnVar = (jn) obj5;
                un unVar2 = (un) obj4;
                TLRPC.TL_messageMediaPoll tL_messageMediaPoll = (TLRPC.TL_messageMediaPoll) obj3;
                ArrayList arrayList = (ArrayList) obj2;
                Long l4 = (Long) obj;
                if (unVar2.c()) {
                    s4.K(unVar2.getParentActivity(), unVar2.a(), new a1.d(jnVar, tL_messageMediaPoll, arrayList, l4, 7));
                    break;
                } else {
                    jnVar.j0.e(tL_messageMediaPoll, jnVar.O, jnVar.m1, arrayList, true, 0, l4.longValue());
                    jnVar.b.a(true);
                    break;
                }
            case 9:
                ux uxVar = (ux) obj5;
                ArrayList arrayList2 = (ArrayList) obj3;
                Runnable runnable = (Runnable) obj2;
                ArrayList arrayList3 = (ArrayList) obj;
                if (((String) obj4).equals(uxVar.w)) {
                    f5.g(uxVar.F.c1).f(arrayList3);
                    int size = arrayList3.size();
                    while (i11 < size) {
                        Object obj6 = arrayList3.get(i11);
                        i11++;
                        qi qiVar = new qi();
                        qiVar.a = "animated_" + ((TLRPC.Document) obj6).id;
                        qiVar.b = null;
                        arrayList2.add(qiVar);
                    }
                    runnable.run();
                    break;
                }
                break;
            case 10:
                zt0.j((zt0) obj5, (HashSet) obj4, (TL_stories.StoryItem) obj3, (z60) obj2, (y4) obj);
                break;
            case 11:
                ay ayVar = (ay) obj5;
                ayVar.b5(ayVar.getMessagesController().L0((Long) obj4), (Runnable) obj, new qq(ayVar, (kd) obj3, (org.telegram.ui.ActionBar.k2) obj2, i12));
                break;
            case 12:
                i31 i31Var = (i31) obj5;
                String[] strArr = (String[]) obj4;
                String str2 = (String) obj3;
                LinkedHashSet linkedHashSet = (LinkedHashSet) obj2;
                Runnable runnable2 = (Runnable) obj;
                int i14 = i31Var.V;
                if (ConnectionsManager.getInstance(i14).getConnectionState() != 3) {
                    runnable2.run();
                    break;
                } else {
                    ui.b0(i14).Z1(true, strArr.length != 0 ? strArr[0] : "", str2, new org.telegram.ui.w(i31Var, linkedHashSet, runnable2, 13), false);
                    break;
                }
            case 13:
                i31 i31Var2 = (i31) obj5;
                String str3 = (String) obj4;
                ArrayList arrayList4 = (ArrayList) obj3;
                HashMap hashMap = (HashMap) obj2;
                Runnable runnable3 = (Runnable) obj;
                int i15 = i31Var2.V;
                if (i31Var2.W != 4) {
                    runnable3.run();
                    break;
                } else {
                    ArrayList arrayList5 = new ArrayList(0);
                    LongSparseArray longSparseArray = new LongSparseArray(0);
                    HashMap hashMap2 = ui.b0(i15).d0;
                    if (str3.length() <= 14) {
                        int length = str3.length();
                        int i16 = 0;
                        CharSequence charSequence = str3;
                        while (i16 < length) {
                            if (i16 < length - 1) {
                                if (charSequence.charAt(i16) == 55356) {
                                    int i17 = i16 + 1;
                                    if (charSequence.charAt(i17) >= 57339) {
                                        break;
                                    }
                                }
                                if (charSequence.charAt(i16) == 8205) {
                                    int i18 = i16 + 1;
                                    if (charSequence.charAt(i18) != 9792) {
                                        break;
                                    }
                                    charSequence = TextUtils.concat(charSequence.subSequence(0, i16), charSequence.subSequence(i16 + 2, charSequence.length()));
                                    length -= 2;
                                    i16--;
                                    i16++;
                                }
                            }
                            if (charSequence.charAt(i16) == 65039) {
                                charSequence = TextUtils.concat(charSequence.subSequence(0, i16), charSequence.subSequence(i16 + 1, charSequence.length()));
                                length--;
                                i16--;
                                i16++;
                            } else {
                                i16++;
                            }
                        }
                        ArrayList arrayList6 = hashMap2 != null ? (ArrayList) hashMap2.get(charSequence.toString()) : null;
                        if (arrayList6 != null && !arrayList6.isEmpty()) {
                            arrayList5.addAll(arrayList6);
                            int size2 = arrayList6.size();
                            for (int i19 = 0; i19 < size2; i19++) {
                                TLRPC.Document document = (TLRPC.Document) arrayList6.get(i19);
                                longSparseArray.put(document.id, document);
                            }
                            arrayList4.add(arrayList5);
                        }
                    }
                    if (hashMap2 != null && !hashMap2.isEmpty() && str3.length() > 1) {
                        ui.b0(i15).U(i31.b2, str3, false, new a1.d(hashMap2, hashMap, arrayList4, runnable3, 15), false);
                        break;
                    }
                }
                break;
            case 14:
                org.telegram.ui.web.z0 z0Var = (org.telegram.ui.web.z0) obj5;
                org.telegram.ui.web.x0 x0Var = (org.telegram.ui.web.x0) obj4;
                String str4 = (String) obj3;
                TL_keyboard.TL_buttonTypeRequestPeer tL_buttonTypeRequestPeer2 = (TL_keyboard.TL_buttonTypeRequestPeer) obj2;
                TLRPC.User user4 = (TLRPC.User) obj;
                if (user4 == null) {
                    z0Var.y(x0Var, "requested_chat_failed", org.telegram.ui.web.z0.A(str4, "req_id"));
                    break;
                } else {
                    TLRPC.TL_messages_sendBotRequestedPeer tL_messages_sendBotRequestedPeer2 = new TLRPC.TL_messages_sendBotRequestedPeer();
                    tL_messages_sendBotRequestedPeer2.peer = vp.m1(z0Var.U);
                    tL_messages_sendBotRequestedPeer2.webapp_req_id = str4;
                    tL_messages_sendBotRequestedPeer2.button_id = tL_buttonTypeRequestPeer2.button_id;
                    tL_messages_sendBotRequestedPeer2.requested_peers.add(vp.m1(user4));
                    ConnectionsManager.getInstance(z0Var.M).sendRequestTyped(tL_messages_sendBotRequestedPeer2, new a3.b(1), new cj0(z0Var, x0Var, str4, user4, 1));
                    z0Var.y(x0Var, "requested_chat_sent", org.telegram.ui.web.z0.A(str4, "req_id"));
                    break;
                }
            case 15:
                org.telegram.ui.web.z0 z0Var2 = (org.telegram.ui.web.z0) obj5;
                org.telegram.ui.web.x0 x0Var2 = (org.telegram.ui.web.x0) obj4;
                String str5 = (String) obj3;
                String str6 = (String) obj2;
                if (((Boolean) obj).booleanValue()) {
                    z0Var2.l0.b(str5, str6);
                    z0Var2.y(x0Var2, "file_download_requested", org.telegram.ui.web.z0.A("downloading", "status"));
                    break;
                } else {
                    z0Var2.y(x0Var2, "file_download_requested", org.telegram.ui.web.z0.A("cancelled", "status"));
                    break;
                }
            case 16:
                ph.l1 l1Var = (ph.l1) obj5;
                q20 q20Var = (q20) obj3;
                ph.w0 w0Var = (ph.w0) obj2;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj;
                ((gf.e) obj4).b();
                if (q20Var != null) {
                    q20Var.a(Boolean.FALSE);
                }
                l1Var.dismiss();
                if (tL_error != null) {
                    org.telegram.messenger.i0.g3(new org.telegram.ui.web.v1(8, w0Var, tL_error));
                    break;
                } else {
                    l1Var.dismiss();
                    break;
                }
            case 17:
                TLRPC.TL_document tL_document = (TLRPC.TL_document) obj4;
                Long l10 = (Long) obj;
                th.z2 z2Var = ((th.w1) obj5).a;
                qz.C(z2Var.l2).v0(tL_document, (String) obj3, z2Var.k1, null, null, z2Var.x1.a, null, null, true, 0, 0, false, this.e, null, l10.longValue(), z2Var.K1.getSendMonoForumPeerId(), z2Var.K1.getSendMessageSuggestionParams());
                z2Var.K1.k(tL_document);
                z2Var.K1.setFieldText("");
                z2Var.i0(l10.longValue() <= 0);
                break;
            case 18:
                th.k2 k2Var2 = (th.k2) obj5;
                e6 e6Var = (e6) obj4;
                o7 o7Var = (o7) obj3;
                p6 p6Var = (p6) obj2;
                TL_stories.StoryItem storyItem = (TL_stories.StoryItem) obj;
                if (storyItem == null) {
                    wb Q2 = new cc(k2Var2.z0.L0, p6Var).Q(R.raw.story_bomb2, 36, cd.L0(2131744625, null));
                    Q2.a = 3;
                    Q2.k(true);
                    break;
                } else {
                    org.telegram.ui.ActionBar.k2 Q3 = LaunchActivity.Q();
                    if (Q3 != null) {
                        storyItem.dialogId = e6Var.b.longValue();
                        o7 createOverlayStoryViewer = Q3.createOverlayStoryViewer();
                        createOverlayStoryViewer.U(k2Var2.getContext(), storyItem, null);
                        createOverlayStoryViewer.o1 = new th.i2(o7Var, 0);
                        o7Var.d0();
                        break;
                    }
                }
                break;
            default:
                TL_stories.StoryItem storyItem2 = (TL_stories.StoryItem) obj3;
                p6 p6Var2 = (p6) obj2;
                y4 y4Var = (y4) obj;
                th.z2 z2Var2 = ((th.u2) obj5).x;
                if (((HashSet) obj4).contains(Integer.valueOf(y4Var.a))) {
                    z2Var2.B1.c(y4Var.a, z2Var2.k1, storyItem2);
                    a02 = cd.a0(null, null, 2131744749, y4Var.b);
                } else {
                    e5 e5Var = z2Var2.B1;
                    long j12 = z2Var2.k1;
                    int i20 = y4Var.a;
                    e5Var.getClass();
                    ArrayList arrayList7 = new ArrayList(1);
                    arrayList7.add(storyItem2);
                    e5Var.f0(i20, j12, arrayList7);
                    a02 = cd.a0(null, null, 2131744520, y4Var.b);
                }
                z20.s(a02, new cc(z2Var2.L0, p6Var2), R.raw.contact_check, 36);
                th.u2 u2Var = z2Var2.c1;
                if (u2Var != null) {
                    u2Var.a();
                    break;
                }
                break;
        }
    }
}
