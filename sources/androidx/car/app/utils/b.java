package androidx.car.app.utils;

import ag.i0;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import android.text.style.ClickableSpan;
import android.util.Log;
import android.util.Pair;
import androidx.biometric.t;
import androidx.car.app.IOnDoneCallback;
import androidx.emoji2.text.m;
import androidx.emoji2.text.p;
import androidx.emoji2.text.q;
import androidx.lifecycle.n;
import androidx.lifecycle.o;
import androidx.lifecycle.v;
import bg.c2;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import eg.d2;
import eg.w2;
import g9.z;
import gh.s;
import h7.d0;
import h7.e0;
import ih.a3;
import ih.b5;
import ih.n3;
import ih.y1;
import j3.h0;
import j3.k0;
import j3.k1;
import j3.p2;
import j3.t0;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.Executor;
import java.util.concurrent.ThreadPoolExecutor;
import jh.d3;
import jh.h5;
import jh.s7;
import l4.c0;
import m3.l;
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
import org.telegram.ui.ActionBar.f3;
import org.telegram.ui.ActionBar.o2;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.gr0;
import org.telegram.ui.Components.j70;
import org.telegram.ui.Components.tc;
import org.telegram.ui.Components.x80;
import org.telegram.ui.Components.z80;
import org.telegram.ui.TwoStepVerificationActivity;
import org.telegram.ui.th;
import q8.l0;
import q8.w;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final /* synthetic */ class b implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ b(IOnDoneCallback iOnDoneCallback, String str, d dVar) {
        this.a = 1;
        this.d = iOnDoneCallback;
        this.b = str;
        this.c = dVar;
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
                d dVar = (d) this.c;
                String str = (String) this.b;
                if (oVar != null) {
                    try {
                        if (((v) oVar).c.compareTo(n.c) < 0) {
                            z14 = false;
                        }
                        if (z14) {
                            dVar.a();
                            return;
                        }
                    } catch (w.f e10) {
                        Log.e("CarApp.Dispatch", "Serialization failure in ".concat(str), e10);
                        return;
                    }
                }
                Log.w("CarApp.Dispatch", "Lifecycle is not at least created when dispatching " + dVar);
                return;
            case 1:
                IOnDoneCallback iOnDoneCallback = (IOnDoneCallback) this.d;
                String str2 = (String) this.b;
                try {
                    j.d(str2.concat(" onSuccess"), new a(iOnDoneCallback, ((d) this.c).a(), str2, 0));
                    return;
                } catch (RuntimeException e11) {
                    j.f(iOnDoneCallback, str2, e11);
                    throw new RuntimeException(e11);
                } catch (w.f e12) {
                    j.f(iOnDoneCallback, str2, e12);
                    return;
                }
            case 2:
                t tVar = (t) this.d;
                e0 e0Var = (e0) this.c;
                ThreadPoolExecutor threadPoolExecutor = (ThreadPoolExecutor) this.b;
                try {
                    q a2 = d0.a(tVar.a);
                    if (a2 == null) {
                        throw new RuntimeException("EmojiCompat font provider not available on this device.");
                    }
                    p pVar = (p) ((androidx.emoji2.text.k) a2.b);
                    synchronized (pVar.d) {
                        pVar.f = threadPoolExecutor;
                    }
                    ((androidx.emoji2.text.k) a2.b).a(new m(e0Var, threadPoolExecutor));
                    return;
                } catch (Throwable th2) {
                    e0Var.a(th2);
                    threadPoolExecutor.shutdown();
                    return;
                }
            case 3:
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
            case 4:
                ef.f fVar = (ef.f) this.d;
                TLObject tLObject = (TLObject) this.c;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.b;
                String str3 = fVar.b;
                int i10 = fVar.a;
                if (tLObject != null) {
                    MediaDataController.getInstance(i10).onRingtoneUploaded(str3, (TLRPC.Document) tLObject, false);
                } else {
                    fVar.a();
                    MediaDataController.getInstance(i10).onRingtoneUploaded(str3, null, true);
                    if (tL_error != null) {
                        NotificationCenter.getInstance(i10).doOnIdle(new ef.c(2, fVar, tL_error));
                    }
                }
                fVar.a();
                return;
            case 5:
                ((d2) this.d).run(new Pair((HashMap) this.c, (ArrayList) this.b));
                return;
            case 6:
                TLObject tLObject2 = (TLObject) this.d;
                MessagesController messagesController = (MessagesController) this.c;
                d2 d2Var = (d2) this.b;
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
                    d2Var.run(arrayList);
                    return;
                }
                return;
            case 7:
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
            case 8:
                ((i0) this.d).run(new Pair((HashMap) this.c, (ArrayList) this.b));
                return;
            case 9:
                ze.b bVar = (ze.b) this.d;
                t0 t0Var = (t0) this.c;
                l lVar = (l) this.b;
                h0 h0Var = (h0) bVar.b;
                int i12 = f5.d0.a;
                k0 k0Var = h0Var.a;
                k0Var.P = t0Var;
                k3.f fVar2 = k0Var.r;
                k3.a k9 = fVar2.k();
                fVar2.l(k9, 1017, new d3(k9, t0Var, lVar, 15));
                return;
            case 10:
                g9.n nVar = (g9.n) this.d;
                Executor executor = (Executor) this.c;
                TaskCompletionSource taskCompletionSource2 = (TaskCompletionSource) this.b;
                try {
                    ((Task) nVar.call()).continueWith(executor, new z(2, taskCompletionSource2));
                    return;
                } catch (Exception e13) {
                    taskCompletionSource2.setException(e13);
                    return;
                }
            case 11:
                s sVar = (s) this.d;
                z80 z80Var = (z80) this.c;
                ClickableSpan clickableSpan = (ClickableSpan) this.b;
                x80 x80Var = sVar.y;
                if (x80Var == null || sVar.A != z80Var) {
                    return;
                }
                x80Var.a(clickableSpan);
                sVar.A = null;
                sVar.s.d(true);
                return;
            case 12:
                gr0 gr0Var = (gr0) this.d;
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) this.c;
                o2 o2Var = (o2) this.b;
                gr0Var.D = -1;
                if (tL_error3 != null) {
                    tc.a0(o2Var).d0(tL_error3, false);
                    return;
                }
                return;
            case 13:
                n3 n3Var = (n3) this.d;
                TL_stars.SavedStarGift savedStarGift = (TL_stars.SavedStarGift) this.c;
                j70 j70Var = (j70) this.b;
                gr0 gr0Var2 = n3Var.a;
                gr0Var2.e.k(n3Var.e.d, savedStarGift);
                j70Var.u();
                gr0Var2.n();
                TL_stars.TL_starGiftCollection c3 = gr0Var2.e.c(n3Var.e.d);
                if (c3 != null) {
                    tc.a0(gr0Var2.a).R(savedStarGift.gift.getDocument(), AndroidUtilities.replaceTags(LocaleController.formatString(R.string.Gift2RemovedFromCollection, h5.D1(savedStarGift.gift), c3.title))).j();
                    return;
                }
                return;
            case 14:
                n3 n3Var2 = (n3) this.d;
                TL_stars.SavedStarGift savedStarGift2 = (TL_stars.SavedStarGift) this.c;
                y1 y1Var = (y1) this.b;
                if (n3Var2.d || !savedStarGift2.pinned_to_top || savedStarGift2.unsaved) {
                    z10 = true;
                } else {
                    z10 = true;
                    y1Var.c(false, true);
                    n3Var2.e.m(savedStarGift2, false, false);
                }
                savedStarGift2.unsaved ^= z10;
                y1Var.h(savedStarGift2, z10, n3Var2.d);
                n3Var2.a.e.m(savedStarGift2, savedStarGift2.unsaved);
                TL_stars.saveStarGift savestargift = new TL_stars.saveStarGift();
                savestargift.stargift = n3Var2.e.g(savedStarGift2);
                savestargift.unsave = savedStarGift2.unsaved;
                ConnectionsManager.getInstance(n3Var2.b).sendRequest(savestargift, null);
                return;
            case 15:
                b5 b5Var = (b5) this.d;
                TLObject tLObject3 = (TLObject) this.c;
                TL_stars.getResaleStarGifts getresalestargifts = (TL_stars.getResaleStarGifts) this.b;
                HashMap hashMap = b5Var.m;
                HashMap hashMap2 = b5Var.o;
                HashMap hashMap3 = b5Var.n;
                ArrayList arrayList2 = b5Var.h;
                ArrayList arrayList3 = b5Var.g;
                ArrayList arrayList4 = b5Var.f;
                int i13 = b5Var.a;
                ArrayList arrayList5 = b5Var.d;
                b5Var.v = -1;
                if (tLObject3 instanceof TL_stars.resaleStarGifts) {
                    TL_stars.resaleStarGifts resalestargifts = (TL_stars.resaleStarGifts) tLObject3;
                    MessagesController.getInstance(i13).putUsers(resalestargifts.users, false);
                    MessagesController.getInstance(i13).putChats(resalestargifts.chats, false);
                    b5Var.e = resalestargifts.count;
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
                    b5Var.u = arrayList5.size() >= b5Var.e || TextUtils.isEmpty(resalestargifts.next_offset);
                    b5Var.q = resalestargifts.next_offset;
                    b5Var.t = false;
                    ArrayList<TL_stars.StarGiftAttribute> arrayList7 = resalestargifts.attributes;
                    if (arrayList7 != null && !arrayList7.isEmpty()) {
                        arrayList4.clear();
                        arrayList3.clear();
                        arrayList2.clear();
                        arrayList4.addAll(s7.m(resalestargifts.attributes, TL_stars.starGiftAttributeModel.class));
                        arrayList3.addAll(s7.m(resalestargifts.attributes, TL_stars.starGiftAttributeBackdrop.class));
                        arrayList2.addAll(s7.m(resalestargifts.attributes, TL_stars.starGiftAttributePattern.class));
                        b5Var.i = resalestargifts.attributes_hash;
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
                    Utilities.Callback callback3 = b5Var.c;
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
                k3.f fVar3 = k1Var.c;
                l0 c6 = wVar.c();
                c2 c2Var = fVar3.d;
                j3.c2 c2Var2 = fVar3.h;
                c2Var2.getClass();
                c2Var.getClass();
                c2Var.b = q8.z.u(c6);
                if (!c6.isEmpty()) {
                    c2Var.e = (c0) c6.get(0);
                    c0Var.getClass();
                    c2Var.f = c0Var;
                }
                if (((c0) c2Var.d) == null) {
                    c2Var.d = c2.o(c2Var2, (q8.z) c2Var.b, (c0) c2Var.e, (p2) c2Var.a);
                }
                c2Var.E(c2Var2.A());
                return;
            case 17:
                jh.q qVar = (jh.q) this.d;
                TLObject tLObject4 = (TLObject) this.c;
                Context context = (Context) this.b;
                if (tLObject4 instanceof TLRPC.TL_payments_starsRevenueAdsAccountUrl) {
                    ye.d.s(context, ((TLRPC.TL_payments_starsRevenueAdsAccountUrl) tLObject4).url);
                }
                AndroidUtilities.runOnUIThread(new jh.c(qVar, 5), 1000L);
                return;
            case 18:
                jh.q.a0((jh.q) this.d, (TLObject) this.c, (TLRPC.TL_error) this.b);
                return;
            case 19:
                h5 h5Var = (h5) this.d;
                Long l10 = (Long) this.c;
                h5Var.Z1(l10.longValue(), new ih.i(h5Var, l10, (w2[]) this.b, 2));
                return;
            case 20:
                h5.j0((h5) this.d, (TLObject) this.c, (MessageObject) this.b);
                return;
            case 21:
                h5 h5Var2 = (h5) this.d;
                ye.c cVar = (ye.c) this.c;
                TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) this.b;
                h5Var2.getClass();
                cVar.c(false);
                tL_starGiftUnique.flags &= -17;
                tL_starGiftUnique.resale_ton_only = false;
                tL_starGiftUnique.resell_amount = null;
                h5Var2.a0.setResellPrice(kf.a.i(0L, kf.b.a));
                a3 a3Var = h5Var2.Z0;
                if (a3Var != null) {
                    a3Var.run();
                }
                th.r(R.string.Gift2ResaleDisable, new Object[]{h5Var2.C1()}, h5Var2.getBulletinFactory(), R.raw.contact_check, 36);
                return;
            case 22:
                h5 h5Var3 = (h5) this.d;
                ye.c cVar2 = (ye.c) this.c;
                TLRPC.TL_error tL_error4 = (TLRPC.TL_error) this.b;
                h5Var3.getClass();
                cVar2.c(false);
                h5Var3.getBulletinFactory().d0(tL_error4, false);
                return;
            case 23:
                w2[] w2VarArr = (w2[]) this.d;
                ye.c cVar3 = (ye.c) this.c;
                TwoStepVerificationActivity twoStepVerificationActivity = (TwoStepVerificationActivity) this.b;
                w2VarArr[0].dismiss();
                cVar3.c(false);
                h5.d2(twoStepVerificationActivity);
                return;
            case 24:
                h5.T((h5) this.d, (org.telegram.ui.ActionBar.c2) this.c, (MessageObject) this.b);
                return;
            case 25:
                h5.V((h5) this.d, (TL_stars.TL_starGiftUnique) this.c, (String) this.b);
                return;
            case 26:
                TLObject tLObject5 = (TLObject) this.d;
                TLRPC.TL_error tL_error5 = (TLRPC.TL_error) this.c;
                Utilities.Callback callback4 = (Utilities.Callback) this.b;
                if (tLObject5 instanceof TLRPC.TL_payments_paymentFormStarGift) {
                    callback4.run((TLRPC.TL_payments_paymentFormStarGift) tLObject5);
                    return;
                } else {
                    s7.e(tL_error5 != null ? tL_error5.text : "NO_PAYMENT_FORM");
                    callback4.run(null);
                    return;
                }
            case 27:
                s7 s7Var = (s7) this.d;
                TLObject tLObject6 = (TLObject) this.c;
                Runnable runnable = (Runnable) this.b;
                ArrayList arrayList9 = s7Var.v;
                boolean[] zArr = s7Var.r;
                ArrayList[] arrayListArr = s7Var.q;
                int i16 = s7Var.a;
                boolean z15 = !s7Var.e;
                s7Var.c = System.currentTimeMillis();
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
                            boolean[] zArr2 = s7Var.u;
                            boolean z16 = (starsStatus.flags & 1) == 0;
                            zArr2[i18] = z16;
                            if (z16) {
                                s7Var.t[i18] = false;
                            }
                            s7Var.s[i18] = zArr2[i18] ? null : starsStatus.next_offset;
                        }
                        z12 = true;
                    } else {
                        j10 = 0;
                        z12 = false;
                    }
                    if (arrayList9.isEmpty()) {
                        arrayList9.addAll(starsStatus.subscriptions);
                        s7Var.x = false;
                        s7Var.w = starsStatus.subscriptions_next_offset;
                        s7Var.y = (starsStatus.flags & 4) == 0;
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    long j11 = s7Var.f.amount;
                    TL_stars.StarsAmount starsAmount = starsStatus.balance;
                    if (j11 != starsAmount.amount) {
                        z15 = true;
                    }
                    s7Var.f = starsAmount;
                    s7Var.g = j10;
                } else {
                    z12 = false;
                    z13 = false;
                }
                s7Var.d = false;
                s7Var.e = true;
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
                s7 s7Var2 = (s7) this.d;
                HashSet hashSet = (HashSet) this.c;
                Runnable runnable2 = (Runnable) this.b;
                s7Var2.getClass();
                Iterator it = hashSet.iterator();
                while (it.hasNext()) {
                    Integer num = (Integer) it.next();
                    num.intValue();
                    s7Var2.Q.remove(num);
                    s7Var2.R.remove(num);
                }
                runnable2.run();
                return;
            default:
                boolean[] zArr3 = (boolean[]) this.d;
                EditTextBoldCursor editTextBoldCursor = (EditTextBoldCursor) this.c;
                f3[] f3VarArr = (f3[]) this.b;
                zArr3[0] = false;
                AndroidUtilities.hideKeyboard(editTextBoldCursor);
                f3VarArr[0].dismiss();
                return;
        }
    }

    public /* synthetic */ b(Object obj, Object obj2, Object obj3, int i10) {
        this.a = i10;
        this.d = obj;
        this.c = obj2;
        this.b = obj3;
    }

    public /* synthetic */ b(Object obj, Object obj2, Object obj3, Object obj4, int i10) {
        this.a = i10;
        this.d = obj2;
        this.c = obj3;
        this.b = obj4;
    }
}
