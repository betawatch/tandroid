package androidx.car.app.utils;

import ag.l0;
import ag.n0;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import android.text.style.ClickableSpan;
import android.util.Log;
import android.util.Pair;
import androidx.biometric.s;
import androidx.car.app.IOnDoneCallback;
import androidx.emoji2.text.k;
import androidx.emoji2.text.m;
import androidx.emoji2.text.p;
import androidx.emoji2.text.q;
import androidx.lifecycle.n;
import androidx.lifecycle.o;
import androidx.lifecycle.v;
import cg.f2;
import cg.y2;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import d5.g0;
import f9.a0;
import g7.t;
import g7.u;
import gh.b2;
import gh.g3;
import gh.t3;
import h3.c2;
import h3.h0;
import h3.k0;
import h3.k1;
import h3.p2;
import h3.q2;
import h3.t0;
import hh.i5;
import hh.r;
import hh.u7;
import j4.c0;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.Executor;
import java.util.concurrent.ThreadPoolExecutor;
import k3.l;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.e3;
import org.telegram.ui.ActionBar.n2;
import org.telegram.ui.Cells.pa;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.b70;
import org.telegram.ui.Components.mc;
import org.telegram.ui.Components.o80;
import org.telegram.ui.Components.q80;
import org.telegram.ui.Components.wq0;
import org.telegram.ui.TwoStepVerificationActivity;
import p8.w;
import p8.z;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final /* synthetic */ class a implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ a(IOnDoneCallback iOnDoneCallback, String str, c cVar) {
        this.a = 1;
        this.d = iOnDoneCallback;
        this.b = str;
        this.c = cVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        TLRPC.User user;
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        long j10;
        boolean z14 = true;
        switch (this.a) {
            case 0:
                o oVar = (o) this.d;
                c cVar = (c) this.c;
                String str = (String) this.b;
                if (oVar != null) {
                    try {
                        if (((v) oVar).c.compareTo(n.c) < 0) {
                            z14 = false;
                        }
                        if (z14) {
                            cVar.b();
                            return;
                        }
                    } catch (w.f e9) {
                        Log.e("CarApp.Dispatch", "Serialization failure in ".concat(str), e9);
                        return;
                    }
                }
                Log.w("CarApp.Dispatch", "Lifecycle is not at least created when dispatching " + cVar);
                return;
            case 1:
                IOnDoneCallback iOnDoneCallback = (IOnDoneCallback) this.d;
                String str2 = (String) this.b;
                try {
                    i.d(str2.concat(" onSuccess"), new l0(iOnDoneCallback, ((c) this.c).b(), str2, 1));
                    return;
                } catch (RuntimeException e10) {
                    i.f(iOnDoneCallback, str2, e10);
                    throw new RuntimeException(e10);
                } catch (w.f e11) {
                    i.f(iOnDoneCallback, str2, e11);
                    return;
                }
            case 2:
                s sVar = (s) this.d;
                u uVar = (u) this.c;
                ThreadPoolExecutor threadPoolExecutor = (ThreadPoolExecutor) this.b;
                try {
                    q a2 = t.a(sVar.a);
                    if (a2 == null) {
                        throw new RuntimeException("EmojiCompat font provider not available on this device.");
                    }
                    p pVar = (p) ((k) a2.b);
                    synchronized (pVar.d) {
                        pVar.f = threadPoolExecutor;
                    }
                    ((k) a2.b).a(new m(uVar, threadPoolExecutor));
                    return;
                } catch (Throwable th) {
                    uVar.a(th);
                    threadPoolExecutor.shutdown();
                    return;
                }
            case 3:
                cf.e eVar = (cf.e) this.d;
                TLObject tLObject = (TLObject) this.c;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.b;
                String str3 = eVar.b;
                int i10 = eVar.a;
                if (tLObject != null) {
                    MediaDataController.getInstance(i10).onRingtoneUploaded(str3, (TLRPC.Document) tLObject, false);
                } else {
                    eVar.a();
                    MediaDataController.getInstance(i10).onRingtoneUploaded(str3, null, true);
                    if (tL_error != null) {
                        NotificationCenter.getInstance(i10).doOnIdle(new a1.e(19, eVar, tL_error));
                    }
                }
                eVar.a();
                return;
            case 4:
                ((f2) this.d).run(new Pair((HashMap) this.c, (ArrayList) this.b));
                return;
            case 5:
                TLObject tLObject2 = (TLObject) this.d;
                MessagesController messagesController = (MessagesController) this.c;
                f2 f2Var = (f2) this.b;
                if (tLObject2 instanceof TLRPC.TL_channels_channelParticipants) {
                    TLRPC.TL_channels_channelParticipants tL_channels_channelParticipants = (TLRPC.TL_channels_channelParticipants) tLObject2;
                    messagesController.putUsers(tL_channels_channelParticipants.users, false);
                    messagesController.putChats(tL_channels_channelParticipants.chats, false);
                    long clientUserId = UserConfig.getInstance(UserConfig.selectedAccount).getClientUserId();
                    ArrayList arrayList = new ArrayList();
                    for (int i11 = 0; i11 < tL_channels_channelParticipants.participants.size(); i11++) {
                        TLRPC.Peer peer = tL_channels_channelParticipants.participants.get(i11).peer;
                        if (peer != null && MessageObject.getPeerId(peer) != clientUserId && (user = messagesController.getUser(Long.valueOf(peer.user_id))) != null && !UserObject.isDeleted(user) && !user.bot) {
                            arrayList.add(messagesController.getInputPeer(peer));
                        }
                    }
                    f2Var.run(arrayList);
                    return;
                }
                return;
            case 6:
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) this.d;
                Utilities.Callback callback = (Utilities.Callback) this.c;
                Utilities.Callback callback2 = (Utilities.Callback) this.b;
                if (tL_error2 != null) {
                    callback.run(tL_error2);
                    return;
                } else {
                    callback2.run(null);
                    return;
                }
            case 7:
                ((n0) this.d).run(new Pair((HashMap) this.c, (ArrayList) this.b));
                return;
            case 8:
                com.google.firebase.messaging.g gVar = (com.google.firebase.messaging.g) this.d;
                Intent intent = (Intent) this.c;
                TaskCompletionSource taskCompletionSource = (TaskCompletionSource) this.b;
                gVar.getClass();
                try {
                    gVar.handleIntent(intent);
                    return;
                } finally {
                    taskCompletionSource.setResult(false);
                }
            case 9:
                xe.b bVar = (xe.b) this.d;
                t0 t0Var = (t0) this.c;
                l lVar = (l) this.b;
                h0 h0Var = (h0) bVar.c;
                int i12 = g0.a;
                k0 k0Var = h0Var.a;
                k0Var.P = t0Var;
                i3.f fVar = k0Var.r;
                i3.a k10 = fVar.k();
                fVar.l(k10, 1017, new q2(k10, t0Var, lVar, 22));
                return;
            case 10:
                eh.s sVar2 = (eh.s) this.d;
                q80 q80Var = (q80) this.c;
                ClickableSpan clickableSpan = (ClickableSpan) this.b;
                o80 o80Var = sVar2.y;
                if (o80Var == null || sVar2.A != q80Var) {
                    return;
                }
                o80Var.a(clickableSpan);
                sVar2.A = null;
                sVar2.s.d(true);
                return;
            case 11:
                f9.m mVar = (f9.m) this.d;
                Executor executor = (Executor) this.c;
                TaskCompletionSource taskCompletionSource2 = (TaskCompletionSource) this.b;
                try {
                    ((Task) mVar.call()).continueWith(executor, new a0(2, taskCompletionSource2));
                    return;
                } catch (Exception e12) {
                    taskCompletionSource2.setException(e12);
                    return;
                }
            case 12:
                wq0 wq0Var = (wq0) this.d;
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) this.c;
                n2 n2Var = (n2) this.b;
                wq0Var.D = -1;
                if (tL_error3 != null) {
                    mc.a0(n2Var).d0(tL_error3, false);
                    return;
                }
                return;
            case 13:
                t3 t3Var = (t3) this.d;
                TL_stars.SavedStarGift savedStarGift = (TL_stars.SavedStarGift) this.c;
                b70 b70Var = (b70) this.b;
                wq0 wq0Var2 = t3Var.a;
                wq0Var2.e.k(t3Var.e.d, savedStarGift);
                b70Var.u();
                wq0Var2.n();
                TL_stars.TL_starGiftCollection c10 = wq0Var2.e.c(t3Var.e.d);
                if (c10 != null) {
                    mc.a0(wq0Var2.a).R(savedStarGift.gift.getDocument(), AndroidUtilities.replaceTags(LocaleController.formatString(R.string.Gift2RemovedFromCollection, i5.D1(savedStarGift.gift), c10.title))).j();
                    return;
                }
                return;
            case 14:
                t3 t3Var2 = (t3) this.d;
                TL_stars.SavedStarGift savedStarGift2 = (TL_stars.SavedStarGift) this.c;
                b2 b2Var = (b2) this.b;
                if (t3Var2.d || !savedStarGift2.pinned_to_top || savedStarGift2.unsaved) {
                    z10 = true;
                } else {
                    z10 = true;
                    b2Var.c(false, true);
                    t3Var2.e.m(savedStarGift2, false, false);
                }
                savedStarGift2.unsaved ^= z10;
                b2Var.h(savedStarGift2, z10, t3Var2.d);
                t3Var2.a.e.m(savedStarGift2, savedStarGift2.unsaved);
                TL_stars.saveStarGift savestargift = new TL_stars.saveStarGift();
                savestargift.stargift = t3Var2.e.g(savedStarGift2);
                savestargift.unsave = savedStarGift2.unsaved;
                ConnectionsManager.getInstance(t3Var2.b).sendRequest(savestargift, null);
                return;
            case 15:
                gh.i5 i5Var = (gh.i5) this.d;
                TLObject tLObject3 = (TLObject) this.c;
                TL_stars.getResaleStarGifts getresalestargifts = (TL_stars.getResaleStarGifts) this.b;
                HashMap hashMap = i5Var.m;
                HashMap hashMap2 = i5Var.o;
                HashMap hashMap3 = i5Var.n;
                ArrayList arrayList2 = i5Var.h;
                ArrayList arrayList3 = i5Var.g;
                ArrayList arrayList4 = i5Var.f;
                int i13 = i5Var.a;
                ArrayList arrayList5 = i5Var.d;
                i5Var.v = -1;
                if (tLObject3 instanceof TL_stars.resaleStarGifts) {
                    TL_stars.resaleStarGifts resalestargifts = (TL_stars.resaleStarGifts) tLObject3;
                    MessagesController.getInstance(i13).putUsers(resalestargifts.users, false);
                    MessagesController.getInstance(i13).putChats(resalestargifts.chats, false);
                    i5Var.e = resalestargifts.count;
                    if (TextUtils.isEmpty(getresalestargifts.offset)) {
                        arrayList5.clear();
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    ArrayList<TL_stars.StarGift> arrayList6 = resalestargifts.gifts;
                    int size = arrayList6.size();
                    int i14 = 0;
                    while (i14 < size) {
                        TL_stars.StarGift starGift = arrayList6.get(i14);
                        i14++;
                        TL_stars.StarGift starGift2 = starGift;
                        if (starGift2 instanceof TL_stars.TL_starGiftUnique) {
                            arrayList5.add((TL_stars.TL_starGiftUnique) starGift2);
                        }
                    }
                    i5Var.u = arrayList5.size() >= i5Var.e || TextUtils.isEmpty(resalestargifts.next_offset);
                    i5Var.q = resalestargifts.next_offset;
                    i5Var.t = false;
                    ArrayList<TL_stars.StarGiftAttribute> arrayList7 = resalestargifts.attributes;
                    if (arrayList7 != null && !arrayList7.isEmpty()) {
                        arrayList4.clear();
                        arrayList3.clear();
                        arrayList2.clear();
                        arrayList4.addAll(u7.m(resalestargifts.attributes, TL_stars.starGiftAttributeModel.class));
                        arrayList3.addAll(u7.m(resalestargifts.attributes, TL_stars.starGiftAttributeBackdrop.class));
                        arrayList2.addAll(u7.m(resalestargifts.attributes, TL_stars.starGiftAttributePattern.class));
                        i5Var.i = resalestargifts.attributes_hash;
                    }
                    if (!resalestargifts.counters.isEmpty()) {
                        hashMap3.clear();
                        hashMap2.clear();
                        hashMap.clear();
                        ArrayList<TL_stars.starGiftAttributeCounter> arrayList8 = resalestargifts.counters;
                        int size2 = arrayList8.size();
                        int i15 = 0;
                        while (i15 < size2) {
                            TL_stars.starGiftAttributeCounter stargiftattributecounter = arrayList8.get(i15);
                            i15++;
                            TL_stars.starGiftAttributeCounter stargiftattributecounter2 = stargiftattributecounter;
                            TL_stars.StarGiftAttributeId starGiftAttributeId = stargiftattributecounter2.attribute;
                            if (starGiftAttributeId instanceof TL_stars.starGiftAttributeIdBackdrop) {
                                hashMap3.put(Integer.valueOf(starGiftAttributeId.backdrop_id), Integer.valueOf(stargiftattributecounter2.count));
                            } else if (starGiftAttributeId instanceof TL_stars.starGiftAttributeIdPattern) {
                                hashMap2.put(Long.valueOf(starGiftAttributeId.document_id), Integer.valueOf(stargiftattributecounter2.count));
                            } else if (starGiftAttributeId instanceof TL_stars.starGiftAttributeIdModel) {
                                hashMap.put(Long.valueOf(starGiftAttributeId.document_id), Integer.valueOf(stargiftattributecounter2.count));
                            }
                        }
                    }
                    Utilities.Callback callback3 = i5Var.c;
                    if (callback3 != null) {
                        callback3.run(Boolean.valueOf(z11));
                        return;
                    }
                    return;
                }
                return;
            case 16:
                k1 k1Var = (k1) this.d;
                w wVar = (w) this.c;
                c0 c0Var = (c0) this.b;
                i3.f fVar2 = k1Var.c;
                p8.l0 c11 = wVar.c();
                com.google.firebase.messaging.m mVar2 = fVar2.d;
                c2 c2Var = fVar2.h;
                c2Var.getClass();
                mVar2.getClass();
                mVar2.b = z.u(c11);
                if (!c11.isEmpty()) {
                    mVar2.e = (c0) c11.get(0);
                    c0Var.getClass();
                    mVar2.f = c0Var;
                }
                if (((c0) mVar2.d) == null) {
                    mVar2.d = com.google.firebase.messaging.m.o(c2Var, (z) mVar2.b, (c0) mVar2.e, (p2) mVar2.a);
                }
                mVar2.D(c2Var.A());
                return;
            case 17:
                r rVar = (r) this.d;
                TLObject tLObject4 = (TLObject) this.c;
                Context context = (Context) this.b;
                if (tLObject4 instanceof TLRPC.TL_payments_starsRevenueAdsAccountUrl) {
                    we.e.s(context, ((TLRPC.TL_payments_starsRevenueAdsAccountUrl) tLObject4).url);
                }
                AndroidUtilities.runOnUIThread(new hh.c(rVar, 5), 1000L);
                return;
            case 18:
                r.a0((r) this.d, (TLObject) this.c, (TLRPC.TL_error) this.b);
                return;
            case 19:
                i5 i5Var2 = (i5) this.d;
                Long l10 = (Long) this.c;
                i5Var2.Z1(l10.longValue(), new gh.i(i5Var2, l10, (y2[]) this.b, 2));
                return;
            case 20:
                i5.j0((i5) this.d, (TLObject) this.c, (MessageObject) this.b);
                return;
            case 21:
                i5 i5Var3 = (i5) this.d;
                we.d dVar = (we.d) this.c;
                TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) this.b;
                i5Var3.getClass();
                dVar.c(false);
                tL_starGiftUnique.flags &= -17;
                tL_starGiftUnique.resale_ton_only = false;
                tL_starGiftUnique.resell_amount = null;
                i5Var3.a0.setResellPrice(hf.a.i(0L, hf.b.a));
                g3 g3Var = i5Var3.Z0;
                if (g3Var != null) {
                    g3Var.run();
                }
                pa.r(R.string.Gift2ResaleDisable, new Object[]{i5Var3.C1()}, i5Var3.getBulletinFactory(), R.raw.contact_check, 36);
                return;
            case 22:
                i5 i5Var4 = (i5) this.d;
                we.d dVar2 = (we.d) this.c;
                TLRPC.TL_error tL_error4 = (TLRPC.TL_error) this.b;
                i5Var4.getClass();
                dVar2.c(false);
                i5Var4.getBulletinFactory().d0(tL_error4, false);
                return;
            case 23:
                y2[] y2VarArr = (y2[]) this.d;
                we.d dVar3 = (we.d) this.c;
                TwoStepVerificationActivity twoStepVerificationActivity = (TwoStepVerificationActivity) this.b;
                y2VarArr[0].dismiss();
                dVar3.c(false);
                i5.d2(twoStepVerificationActivity);
                return;
            case 24:
                i5.T((i5) this.d, (org.telegram.ui.ActionBar.b2) this.c, (MessageObject) this.b);
                return;
            case 25:
                i5.V((i5) this.d, (TL_stars.TL_starGiftUnique) this.c, (String) this.b);
                return;
            case 26:
                TLObject tLObject5 = (TLObject) this.d;
                TLRPC.TL_error tL_error5 = (TLRPC.TL_error) this.c;
                Utilities.Callback callback4 = (Utilities.Callback) this.b;
                if (tLObject5 instanceof TLRPC.TL_payments_paymentFormStarGift) {
                    callback4.run((TLRPC.TL_payments_paymentFormStarGift) tLObject5);
                    return;
                } else {
                    u7.e(tL_error5 != null ? tL_error5.text : "NO_PAYMENT_FORM");
                    callback4.run(null);
                    return;
                }
            case 27:
                u7 u7Var = (u7) this.d;
                TLObject tLObject6 = (TLObject) this.c;
                Runnable runnable = (Runnable) this.b;
                ArrayList arrayList9 = u7Var.v;
                boolean[] zArr = u7Var.r;
                ArrayList[] arrayListArr = u7Var.q;
                int i16 = u7Var.a;
                boolean z15 = !u7Var.e;
                u7Var.c = System.currentTimeMillis();
                if (tLObject6 instanceof TL_stars.StarsStatus) {
                    TL_stars.StarsStatus starsStatus = (TL_stars.StarsStatus) tLObject6;
                    MessagesController.getInstance(i16).putUsers(starsStatus.users, false);
                    MessagesController.getInstance(i16).putChats(starsStatus.chats, false);
                    if (arrayListArr[0].isEmpty()) {
                        ArrayList<TL_stars.StarsTransaction> arrayList10 = starsStatus.history;
                        int size3 = arrayList10.size();
                        int i17 = 0;
                        while (i17 < size3) {
                            TL_stars.StarsTransaction starsTransaction = arrayList10.get(i17);
                            i17++;
                            TL_stars.StarsTransaction starsTransaction2 = starsTransaction;
                            arrayListArr[0].add(starsTransaction2);
                            arrayListArr[starsTransaction2.amount.amount > 0 ? (char) 1 : (char) 2].add(starsTransaction2);
                        }
                        j10 = 0;
                        for (int i18 = 0; i18 < 3; i18++) {
                            zArr[i18] = !arrayListArr[i18].isEmpty() || zArr[i18];
                            boolean[] zArr2 = u7Var.u;
                            boolean z16 = (starsStatus.flags & 1) == 0;
                            zArr2[i18] = z16;
                            if (z16) {
                                u7Var.t[i18] = false;
                            }
                            u7Var.s[i18] = zArr2[i18] ? null : starsStatus.next_offset;
                        }
                        z12 = true;
                    } else {
                        j10 = 0;
                        z12 = false;
                    }
                    if (arrayList9.isEmpty()) {
                        arrayList9.addAll(starsStatus.subscriptions);
                        u7Var.x = false;
                        u7Var.w = starsStatus.subscriptions_next_offset;
                        u7Var.y = (starsStatus.flags & 4) == 0;
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    long j11 = u7Var.f.amount;
                    TL_stars.StarsAmount starsAmount = starsStatus.balance;
                    if (j11 != starsAmount.amount) {
                        z15 = true;
                    }
                    u7Var.f = starsAmount;
                    u7Var.g = j10;
                } else {
                    z12 = false;
                    z13 = false;
                }
                u7Var.d = false;
                u7Var.e = true;
                if (z15) {
                    NotificationCenter.getInstance(i16).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starBalanceUpdated, new Object[0]);
                }
                if (z12) {
                    NotificationCenter.getInstance(i16).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starTransactionsLoaded, new Object[0]);
                }
                if (z13) {
                    NotificationCenter.getInstance(i16).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starSubscriptionsLoaded, new Object[0]);
                }
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            case 28:
                u7 u7Var2 = (u7) this.d;
                HashSet hashSet = (HashSet) this.c;
                Runnable runnable2 = (Runnable) this.b;
                u7Var2.getClass();
                Iterator it = hashSet.iterator();
                while (it.hasNext()) {
                    Integer num = (Integer) it.next();
                    num.intValue();
                    u7Var2.Q.remove(num);
                    u7Var2.R.remove(num);
                }
                runnable2.run();
                return;
            default:
                boolean[] zArr3 = (boolean[]) this.d;
                EditTextBoldCursor editTextBoldCursor = (EditTextBoldCursor) this.c;
                e3[] e3VarArr = (e3[]) this.b;
                zArr3[0] = false;
                AndroidUtilities.hideKeyboard(editTextBoldCursor);
                e3VarArr[0].dismiss();
                return;
        }
    }

    public /* synthetic */ a(Object obj, Object obj2, Object obj3, int i10) {
        this.a = i10;
        this.d = obj;
        this.c = obj2;
        this.b = obj3;
    }

    public /* synthetic */ a(Object obj, Object obj2, Object obj3, Object obj4, int i10) {
        this.a = i10;
        this.d = obj2;
        this.c = obj3;
        this.b = obj4;
    }
}
