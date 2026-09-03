package androidx.car.app.utils;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import android.text.style.ClickableSpan;
import android.util.Log;
import android.util.Pair;
import androidx.biometric.u;
import androidx.car.app.IOnDoneCallback;
import androidx.emoji2.text.m;
import androidx.emoji2.text.q;
import androidx.emoji2.text.r;
import androidx.lifecycle.n;
import androidx.lifecycle.o;
import androidx.lifecycle.v;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import dg.h0;
import h5.d0;
import hg.c2;
import hg.v2;
import i9.x;
import j3.a2;
import j3.c0;
import j3.f0;
import j3.h1;
import j3.m2;
import j3.n0;
import j3.q0;
import j3.q1;
import j7.s;
import j7.t;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.ThreadPoolExecutor;
import lh.b5;
import lh.n3;
import lh.x1;
import lh.z2;
import mh.g5;
import mh.p;
import mh.t7;
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
import org.telegram.ui.ActionBar.d2;
import org.telegram.ui.ActionBar.p2;
import org.telegram.ui.Components.f90;
import org.telegram.ui.Components.h90;
import org.telegram.ui.Components.or0;
import org.telegram.ui.Components.q70;
import org.telegram.ui.Components.qc;
import org.telegram.ui.TwoStepVerificationActivity;
import org.telegram.ui.yh;
import s8.i0;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
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
        boolean z4;
        boolean z10;
        boolean z11;
        boolean z12;
        long j10;
        boolean z13 = true;
        switch (this.a) {
            case 0:
                o oVar = (o) this.d;
                d dVar = (d) this.c;
                String str = (String) this.b;
                if (oVar != null) {
                    try {
                        if (((v) oVar).c.compareTo(n.c) < 0) {
                            z13 = false;
                        }
                        if (z13) {
                            dVar.a();
                            return;
                        }
                    } catch (w.g e6) {
                        Log.e("CarApp.Dispatch", "Serialization failure in ".concat(str), e6);
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
                } catch (RuntimeException e10) {
                    j.f(iOnDoneCallback, str2, e10);
                    throw new RuntimeException(e10);
                } catch (w.g e11) {
                    j.f(iOnDoneCallback, str2, e11);
                    return;
                }
            case 2:
                u uVar = (u) this.d;
                t tVar = (t) this.c;
                ThreadPoolExecutor threadPoolExecutor = (ThreadPoolExecutor) this.b;
                try {
                    r a2 = s.a(uVar.a);
                    if (a2 == null) {
                        throw new RuntimeException("EmojiCompat font provider not available on this device.");
                    }
                    q qVar = (q) ((androidx.emoji2.text.k) a2.b);
                    synchronized (qVar.d) {
                        qVar.f = threadPoolExecutor;
                    }
                    ((androidx.emoji2.text.k) a2.b).a(new m(tVar, threadPoolExecutor));
                    return;
                } catch (Throwable th2) {
                    tVar.a(th2);
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
                gf.f fVar = (gf.f) this.d;
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
                        NotificationCenter.getInstance(i10).doOnIdle(new gf.c(2, fVar, tL_error));
                    }
                }
                fVar.a();
                return;
            case 5:
                ((c2) this.d).run(new Pair((HashMap) this.c, (ArrayList) this.b));
                return;
            case 6:
                TLObject tLObject2 = (TLObject) this.d;
                MessagesController messagesController = (MessagesController) this.c;
                c2 c2Var = (c2) this.b;
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
                    c2Var.run(arrayList);
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
                ((h0) this.d).run(new Pair((HashMap) this.c, (ArrayList) this.b));
                return;
            case 9:
                f7.b bVar = (f7.b) this.d;
                n0 n0Var = (n0) this.c;
                n3.k kVar = (n3.k) this.b;
                c0 c0Var = (c0) bVar.c;
                int i12 = d0.a;
                f0 f0Var = c0Var.a;
                f0Var.N = n0Var;
                k3.f fVar2 = f0Var.q;
                k3.a p10 = fVar2.p();
                fVar2.q(p10, 1017, new k3.c(p10, n0Var, kVar, 1));
                return;
            case 10:
                h2.g gVar2 = (h2.g) this.d;
                Executor executor = (Executor) this.c;
                TaskCompletionSource taskCompletionSource2 = (TaskCompletionSource) this.b;
                try {
                    ((Task) gVar2.call()).continueWith(executor, new x(2, taskCompletionSource2));
                    return;
                } catch (Exception e12) {
                    taskCompletionSource2.setException(e12);
                    return;
                }
            case 11:
                h1 h1Var = (h1) this.d;
                s8.s sVar = (s8.s) this.c;
                o4.v vVar = (o4.v) this.b;
                k3.f fVar3 = h1Var.c;
                i0 i13 = sVar.i();
                a9.a aVar = fVar3.d;
                a2 a2Var = fVar3.h;
                a2Var.getClass();
                aVar.getClass();
                aVar.b = s8.v.t(i13);
                if (!i13.isEmpty()) {
                    aVar.e = (o4.v) i13.get(0);
                    vVar.getClass();
                    aVar.f = vVar;
                }
                if (((o4.v) aVar.d) == null) {
                    aVar.d = a9.a.o(a2Var, (s8.v) aVar.b, (o4.v) aVar.e, (m2) aVar.a);
                }
                aVar.E(a2Var.z());
                return;
            case 12:
                f7.b bVar2 = (f7.b) this.d;
                Pair pair = (Pair) this.c;
                ((q1) bVar2.c).h.e(((Integer) pair.first).intValue(), (o4.v) pair.second, (Exception) this.b);
                return;
            case 13:
                jh.s sVar2 = (jh.s) this.d;
                h90 h90Var = (h90) this.c;
                ClickableSpan clickableSpan = (ClickableSpan) this.b;
                f90 f90Var = sVar2.y;
                if (f90Var == null || sVar2.B != h90Var) {
                    return;
                }
                f90Var.a(clickableSpan);
                sVar2.B = null;
                sVar2.s.d(true);
                return;
            case 14:
                f7.b bVar3 = (f7.b) this.d;
                n0 n0Var2 = (n0) this.c;
                n3.k kVar2 = (n3.k) this.b;
                l3.q qVar2 = (l3.q) bVar3.c;
                int i14 = d0.a;
                qVar2.getClass();
                k3.f fVar4 = ((c0) qVar2).a.q;
                k3.a p11 = fVar4.p();
                fVar4.q(p11, 1009, new q0(p11, n0Var2, kVar2, 20));
                return;
            case 15:
                or0 or0Var = (or0) this.d;
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) this.c;
                p2 p2Var = (p2) this.b;
                or0Var.E = -1;
                if (tL_error3 != null) {
                    qc.a0(p2Var).d0(tL_error3, false);
                    return;
                }
                return;
            case 16:
                n3 n3Var = (n3) this.d;
                TL_stars.SavedStarGift savedStarGift = (TL_stars.SavedStarGift) this.c;
                q70 q70Var = (q70) this.b;
                or0 or0Var2 = n3Var.a;
                or0Var2.e.k(n3Var.e.d, savedStarGift);
                q70Var.u();
                or0Var2.n();
                TL_stars.TL_starGiftCollection c3 = or0Var2.e.c(n3Var.e.d);
                if (c3 != null) {
                    qc.a0(or0Var2.a).R(savedStarGift.gift.getDocument(), AndroidUtilities.replaceTags(LocaleController.formatString(R.string.Gift2RemovedFromCollection, g5.D1(savedStarGift.gift), c3.title))).j();
                    return;
                }
                return;
            case 17:
                n3 n3Var2 = (n3) this.d;
                TL_stars.SavedStarGift savedStarGift2 = (TL_stars.SavedStarGift) this.c;
                x1 x1Var = (x1) this.b;
                if (n3Var2.d || !savedStarGift2.pinned_to_top || savedStarGift2.unsaved) {
                    z4 = true;
                } else {
                    z4 = true;
                    x1Var.c(false, true);
                    n3Var2.e.m(savedStarGift2, false, false);
                }
                savedStarGift2.unsaved ^= z4;
                x1Var.h(savedStarGift2, z4, n3Var2.d);
                n3Var2.a.e.m(savedStarGift2, savedStarGift2.unsaved);
                TL_stars.saveStarGift savestargift = new TL_stars.saveStarGift();
                savestargift.stargift = n3Var2.e.g(savedStarGift2);
                savestargift.unsave = savedStarGift2.unsaved;
                ConnectionsManager.getInstance(n3Var2.b).sendRequest(savestargift, null);
                return;
            case 18:
                b5 b5Var = (b5) this.d;
                TLObject tLObject3 = (TLObject) this.c;
                TL_stars.getResaleStarGifts getresalestargifts = (TL_stars.getResaleStarGifts) this.b;
                HashMap hashMap = b5Var.m;
                HashMap hashMap2 = b5Var.o;
                HashMap hashMap3 = b5Var.n;
                ArrayList arrayList2 = b5Var.h;
                ArrayList arrayList3 = b5Var.g;
                ArrayList arrayList4 = b5Var.f;
                int i15 = b5Var.a;
                ArrayList arrayList5 = b5Var.d;
                b5Var.v = -1;
                if (tLObject3 instanceof TL_stars.resaleStarGifts) {
                    TL_stars.resaleStarGifts resalestargifts = (TL_stars.resaleStarGifts) tLObject3;
                    MessagesController.getInstance(i15).putUsers(resalestargifts.users, false);
                    MessagesController.getInstance(i15).putChats(resalestargifts.chats, false);
                    b5Var.e = resalestargifts.count;
                    if (TextUtils.isEmpty(getresalestargifts.offset)) {
                        arrayList5.clear();
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    ArrayList<TL_stars.StarGift> arrayList6 = resalestargifts.gifts;
                    int size = arrayList6.size();
                    int i16 = 0;
                    while (i16 < size) {
                        TL_stars.StarGift starGift = arrayList6.get(i16);
                        i16++;
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
                        arrayList4.addAll(t7.m(resalestargifts.attributes, TL_stars.starGiftAttributeModel.class));
                        arrayList3.addAll(t7.m(resalestargifts.attributes, TL_stars.starGiftAttributeBackdrop.class));
                        arrayList2.addAll(t7.m(resalestargifts.attributes, TL_stars.starGiftAttributePattern.class));
                        b5Var.i = resalestargifts.attributes_hash;
                    }
                    if (!resalestargifts.counters.isEmpty()) {
                        hashMap3.clear();
                        hashMap2.clear();
                        hashMap.clear();
                        ArrayList<TL_stars.starGiftAttributeCounter> arrayList8 = resalestargifts.counters;
                        int size2 = arrayList8.size();
                        int i17 = 0;
                        while (i17 < size2) {
                            TL_stars.starGiftAttributeCounter stargiftattributecounter = arrayList8.get(i17);
                            i17++;
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
                        callback3.run(Boolean.valueOf(z10));
                        return;
                    }
                    return;
                }
                return;
            case 19:
                p pVar = (p) this.d;
                TLObject tLObject4 = (TLObject) this.c;
                Context context = (Context) this.b;
                if (tLObject4 instanceof TLRPC.TL_payments_starsRevenueAdsAccountUrl) {
                    af.g.s(context, ((TLRPC.TL_payments_starsRevenueAdsAccountUrl) tLObject4).url);
                }
                AndroidUtilities.runOnUIThread(new mh.c(pVar, 5), 1000L);
                return;
            case 20:
                p.a0((p) this.d, (TLObject) this.c, (TLRPC.TL_error) this.b);
                return;
            case 21:
                g5 g5Var = (g5) this.d;
                Long l10 = (Long) this.c;
                g5Var.Z1(l10.longValue(), new lh.h(g5Var, l10, (v2[]) this.b, 2));
                return;
            case 22:
                g5.j0((g5) this.d, (TLObject) this.c, (MessageObject) this.b);
                return;
            case 23:
                g5 g5Var2 = (g5) this.d;
                af.f fVar5 = (af.f) this.c;
                TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) this.b;
                g5Var2.getClass();
                fVar5.c(false);
                tL_starGiftUnique.flags &= -17;
                tL_starGiftUnique.resale_ton_only = false;
                tL_starGiftUnique.resell_amount = null;
                g5Var2.b0.setResellPrice(mf.a.i(0L, mf.b.a));
                z2 z2Var = g5Var2.a1;
                if (z2Var != null) {
                    z2Var.run();
                }
                yh.s(R.string.Gift2ResaleDisable, new Object[]{g5Var2.C1()}, g5Var2.getBulletinFactory(), R.raw.contact_check, 36);
                return;
            case 24:
                g5 g5Var3 = (g5) this.d;
                af.f fVar6 = (af.f) this.c;
                TLRPC.TL_error tL_error4 = (TLRPC.TL_error) this.b;
                g5Var3.getClass();
                fVar6.c(false);
                g5Var3.getBulletinFactory().d0(tL_error4, false);
                return;
            case 25:
                v2[] v2VarArr = (v2[]) this.d;
                af.f fVar7 = (af.f) this.c;
                TwoStepVerificationActivity twoStepVerificationActivity = (TwoStepVerificationActivity) this.b;
                v2VarArr[0].dismiss();
                fVar7.c(false);
                g5.d2(twoStepVerificationActivity);
                return;
            case 26:
                g5.T((g5) this.d, (d2) this.c, (MessageObject) this.b);
                return;
            case 27:
                g5.V((g5) this.d, (TL_stars.TL_starGiftUnique) this.c, (String) this.b);
                return;
            case 28:
                TLObject tLObject5 = (TLObject) this.d;
                TLRPC.TL_error tL_error5 = (TLRPC.TL_error) this.c;
                Utilities.Callback callback4 = (Utilities.Callback) this.b;
                if (tLObject5 instanceof TLRPC.TL_payments_paymentFormStarGift) {
                    callback4.run((TLRPC.TL_payments_paymentFormStarGift) tLObject5);
                    return;
                } else {
                    t7.e(tL_error5 != null ? tL_error5.text : "NO_PAYMENT_FORM");
                    callback4.run(null);
                    return;
                }
            default:
                t7 t7Var = (t7) this.d;
                TLObject tLObject6 = (TLObject) this.c;
                Runnable runnable = (Runnable) this.b;
                ArrayList arrayList9 = t7Var.v;
                boolean[] zArr = t7Var.r;
                ArrayList[] arrayListArr = t7Var.q;
                int i18 = t7Var.a;
                boolean z14 = !t7Var.e;
                t7Var.c = System.currentTimeMillis();
                if (tLObject6 instanceof TL_stars.StarsStatus) {
                    TL_stars.StarsStatus starsStatus = (TL_stars.StarsStatus) tLObject6;
                    MessagesController.getInstance(i18).putUsers(starsStatus.users, false);
                    MessagesController.getInstance(i18).putChats(starsStatus.chats, false);
                    if (arrayListArr[0].isEmpty()) {
                        ArrayList<TL_stars.StarsTransaction> arrayList10 = starsStatus.history;
                        int size3 = arrayList10.size();
                        int i19 = 0;
                        while (i19 < size3) {
                            TL_stars.StarsTransaction starsTransaction = arrayList10.get(i19);
                            i19++;
                            TL_stars.StarsTransaction starsTransaction2 = starsTransaction;
                            arrayListArr[0].add(starsTransaction2);
                            arrayListArr[starsTransaction2.amount.amount > 0 ? (char) 1 : (char) 2].add(starsTransaction2);
                        }
                        j10 = 0;
                        for (int i20 = 0; i20 < 3; i20++) {
                            zArr[i20] = !arrayListArr[i20].isEmpty() || zArr[i20];
                            boolean[] zArr2 = t7Var.u;
                            boolean z15 = (starsStatus.flags & 1) == 0;
                            zArr2[i20] = z15;
                            if (z15) {
                                t7Var.t[i20] = false;
                            }
                            t7Var.s[i20] = zArr2[i20] ? null : starsStatus.next_offset;
                        }
                        z11 = true;
                    } else {
                        j10 = 0;
                        z11 = false;
                    }
                    if (arrayList9.isEmpty()) {
                        arrayList9.addAll(starsStatus.subscriptions);
                        t7Var.x = false;
                        t7Var.w = starsStatus.subscriptions_next_offset;
                        t7Var.y = (starsStatus.flags & 4) == 0;
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    long j11 = t7Var.f.amount;
                    TL_stars.StarsAmount starsAmount = starsStatus.balance;
                    if (j11 != starsAmount.amount) {
                        z14 = true;
                    }
                    t7Var.f = starsAmount;
                    t7Var.g = j10;
                } else {
                    z11 = false;
                    z12 = false;
                }
                t7Var.d = false;
                t7Var.e = true;
                if (z14) {
                    NotificationCenter.getInstance(i18).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starBalanceUpdated, new Object[0]);
                }
                if (z11) {
                    NotificationCenter.getInstance(i18).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starTransactionsLoaded, new Object[0]);
                }
                if (z12) {
                    NotificationCenter.getInstance(i18).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starSubscriptionsLoaded, new Object[0]);
                }
                if (runnable != null) {
                    runnable.run();
                    return;
                }
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
