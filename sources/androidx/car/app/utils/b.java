package androidx.car.app.utils;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import android.text.style.ClickableSpan;
import android.util.Log;
import android.util.Pair;
import androidx.car.app.IOnDoneCallback;
import androidx.emoji2.text.l;
import androidx.emoji2.text.p;
import androidx.emoji2.text.q;
import androidx.lifecycle.n;
import androidx.lifecycle.o;
import androidx.lifecycle.v;
import bg.g3;
import bg.m2;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import d5.f0;
import dh.u;
import e9.m;
import e9.y;
import f7.w;
import fh.f2;
import fh.l3;
import fh.p5;
import fh.y3;
import gh.k5;
import gh.r;
import gh.v7;
import h3.h0;
import h3.k0;
import h3.k1;
import h3.p2;
import h3.t0;
import j4.d0;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.Executor;
import java.util.concurrent.ThreadPoolExecutor;
import o8.l0;
import o8.z;
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
import org.telegram.ui.ActionBar.c2;
import org.telegram.ui.ActionBar.f3;
import org.telegram.ui.ActionBar.o2;
import org.telegram.ui.Cells.j2;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.k80;
import org.telegram.ui.Components.m80;
import org.telegram.ui.Components.oc;
import org.telegram.ui.Components.vq0;
import org.telegram.ui.Components.x60;
import org.telegram.ui.TwoStepVerificationActivity;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
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
                u5.h hVar = (u5.h) this.d;
                w wVar = (w) this.c;
                ThreadPoolExecutor threadPoolExecutor = (ThreadPoolExecutor) this.b;
                try {
                    q a2 = f7.v.a(hVar.a);
                    if (a2 == null) {
                        throw new RuntimeException("EmojiCompat font provider not available on this device.");
                    }
                    p pVar = (p) ((androidx.emoji2.text.j) a2.b);
                    synchronized (pVar.d) {
                        pVar.f = threadPoolExecutor;
                    }
                    ((androidx.emoji2.text.j) a2.b).a(new l(wVar, threadPoolExecutor));
                    return;
                } catch (Throwable th) {
                    wVar.a(th);
                    threadPoolExecutor.shutdown();
                    return;
                }
            case 3:
                bf.e eVar = (bf.e) this.d;
                TLObject tLObject = (TLObject) this.c;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.b;
                String str3 = eVar.b;
                int i9 = eVar.a;
                if (tLObject != null) {
                    MediaDataController.getInstance(i9).onRingtoneUploaded(str3, (TLRPC.Document) tLObject, false);
                } else {
                    eVar.a();
                    MediaDataController.getInstance(i9).onRingtoneUploaded(str3, null, true);
                    if (tL_error != null) {
                        NotificationCenter.getInstance(i9).doOnIdle(new a1.e(9, eVar, tL_error));
                    }
                }
                eVar.a();
                return;
            case 4:
                ((m2) this.d).run(new Pair((HashMap) this.c, (ArrayList) this.b));
                return;
            case 5:
                TLObject tLObject2 = (TLObject) this.d;
                MessagesController messagesController = (MessagesController) this.c;
                m2 m2Var = (m2) this.b;
                if (tLObject2 instanceof TLRPC.TL_channels_channelParticipants) {
                    TLRPC.TL_channels_channelParticipants tL_channels_channelParticipants = (TLRPC.TL_channels_channelParticipants) tLObject2;
                    messagesController.putUsers(tL_channels_channelParticipants.users, false);
                    messagesController.putChats(tL_channels_channelParticipants.chats, false);
                    long clientUserId = UserConfig.getInstance(UserConfig.selectedAccount).getClientUserId();
                    ArrayList arrayList = new ArrayList();
                    for (int i10 = 0; i10 < tL_channels_channelParticipants.participants.size(); i10++) {
                        TLRPC.Peer peer = tL_channels_channelParticipants.participants.get(i10).peer;
                        if (peer != null && MessageObject.getPeerId(peer) != clientUserId && (user = messagesController.getUser(Long.valueOf(peer.user_id))) != null && !UserObject.isDeleted(user) && !user.bot) {
                            arrayList.add(messagesController.getInputPeer(peer));
                        }
                    }
                    m2Var.run(arrayList);
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
                ((bg.i) this.d).run(new Pair((HashMap) this.c, (ArrayList) this.b));
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
                u uVar = (u) this.d;
                m80 m80Var = (m80) this.c;
                ClickableSpan clickableSpan = (ClickableSpan) this.b;
                k80 k80Var = uVar.y;
                if (k80Var == null || uVar.A != m80Var) {
                    return;
                }
                k80Var.a(clickableSpan);
                uVar.A = null;
                uVar.s.d(true);
                return;
            case 10:
                we.b bVar = (we.b) this.d;
                t0 t0Var = (t0) this.c;
                k3.l lVar = (k3.l) this.b;
                h0 h0Var = (h0) bVar.c;
                int i11 = f0.a;
                k0 k0Var = h0Var.a;
                k0Var.P = t0Var;
                i3.f fVar = k0Var.r;
                i3.a k10 = fVar.k();
                fVar.l(k10, 1017, new h9.a(k10, t0Var, lVar, 29));
                return;
            case 11:
                m mVar = (m) this.d;
                Executor executor = (Executor) this.c;
                TaskCompletionSource taskCompletionSource2 = (TaskCompletionSource) this.b;
                try {
                    ((Task) mVar.call()).continueWith(executor, new y(2, taskCompletionSource2));
                    return;
                } catch (Exception e13) {
                    taskCompletionSource2.setException(e13);
                    return;
                }
            case 12:
                vq0 vq0Var = (vq0) this.d;
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) this.c;
                o2 o2Var = (o2) this.b;
                vq0Var.D = -1;
                if (tL_error3 != null) {
                    oc.a0(o2Var).d0(tL_error3, false);
                    return;
                }
                return;
            case 13:
                y3 y3Var = (y3) this.d;
                TL_stars.SavedStarGift savedStarGift = (TL_stars.SavedStarGift) this.c;
                x60 x60Var = (x60) this.b;
                vq0 vq0Var2 = y3Var.a;
                vq0Var2.e.k(y3Var.e.d, savedStarGift);
                x60Var.u();
                vq0Var2.n();
                TL_stars.TL_starGiftCollection c10 = vq0Var2.e.c(y3Var.e.d);
                if (c10 != null) {
                    oc.a0(vq0Var2.a).R(savedStarGift.gift.getDocument(), AndroidUtilities.replaceTags(LocaleController.formatString(R.string.Gift2RemovedFromCollection, k5.D1(savedStarGift.gift), c10.title))).j();
                    return;
                }
                return;
            case 14:
                y3 y3Var2 = (y3) this.d;
                TL_stars.SavedStarGift savedStarGift2 = (TL_stars.SavedStarGift) this.c;
                f2 f2Var = (f2) this.b;
                if (y3Var2.d || !savedStarGift2.pinned_to_top || savedStarGift2.unsaved) {
                    z10 = true;
                } else {
                    z10 = true;
                    f2Var.c(false, true);
                    y3Var2.e.m(savedStarGift2, false, false);
                }
                savedStarGift2.unsaved ^= z10;
                f2Var.h(savedStarGift2, z10, y3Var2.d);
                y3Var2.a.e.m(savedStarGift2, savedStarGift2.unsaved);
                TL_stars.saveStarGift savestargift = new TL_stars.saveStarGift();
                savestargift.stargift = y3Var2.e.g(savedStarGift2);
                savestargift.unsave = savedStarGift2.unsaved;
                ConnectionsManager.getInstance(y3Var2.b).sendRequest(savestargift, null);
                return;
            case 15:
                p5 p5Var = (p5) this.d;
                TLObject tLObject3 = (TLObject) this.c;
                TL_stars.getResaleStarGifts getresalestargifts = (TL_stars.getResaleStarGifts) this.b;
                HashMap hashMap = p5Var.m;
                HashMap hashMap2 = p5Var.o;
                HashMap hashMap3 = p5Var.n;
                ArrayList arrayList2 = p5Var.h;
                ArrayList arrayList3 = p5Var.g;
                ArrayList arrayList4 = p5Var.f;
                int i12 = p5Var.a;
                ArrayList arrayList5 = p5Var.d;
                p5Var.v = -1;
                if (tLObject3 instanceof TL_stars.resaleStarGifts) {
                    TL_stars.resaleStarGifts resalestargifts = (TL_stars.resaleStarGifts) tLObject3;
                    MessagesController.getInstance(i12).putUsers(resalestargifts.users, false);
                    MessagesController.getInstance(i12).putChats(resalestargifts.chats, false);
                    p5Var.e = resalestargifts.count;
                    if (TextUtils.isEmpty(getresalestargifts.offset)) {
                        arrayList5.clear();
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    ArrayList<TL_stars.StarGift> arrayList6 = resalestargifts.gifts;
                    int size = arrayList6.size();
                    int i13 = 0;
                    while (i13 < size) {
                        TL_stars.StarGift starGift = arrayList6.get(i13);
                        i13++;
                        TL_stars.StarGift starGift2 = starGift;
                        if (starGift2 instanceof TL_stars.TL_starGiftUnique) {
                            arrayList5.add((TL_stars.TL_starGiftUnique) starGift2);
                        }
                    }
                    p5Var.u = arrayList5.size() >= p5Var.e || TextUtils.isEmpty(resalestargifts.next_offset);
                    p5Var.q = resalestargifts.next_offset;
                    p5Var.t = false;
                    ArrayList<TL_stars.StarGiftAttribute> arrayList7 = resalestargifts.attributes;
                    if (arrayList7 != null && !arrayList7.isEmpty()) {
                        arrayList4.clear();
                        arrayList3.clear();
                        arrayList2.clear();
                        arrayList4.addAll(v7.m(resalestargifts.attributes, TL_stars.starGiftAttributeModel.class));
                        arrayList3.addAll(v7.m(resalestargifts.attributes, TL_stars.starGiftAttributeBackdrop.class));
                        arrayList2.addAll(v7.m(resalestargifts.attributes, TL_stars.starGiftAttributePattern.class));
                        p5Var.i = resalestargifts.attributes_hash;
                    }
                    if (!resalestargifts.counters.isEmpty()) {
                        hashMap3.clear();
                        hashMap2.clear();
                        hashMap.clear();
                        ArrayList<TL_stars.starGiftAttributeCounter> arrayList8 = resalestargifts.counters;
                        int size2 = arrayList8.size();
                        int i14 = 0;
                        while (i14 < size2) {
                            TL_stars.starGiftAttributeCounter stargiftattributecounter = arrayList8.get(i14);
                            i14++;
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
                    Utilities.Callback callback3 = p5Var.c;
                    if (callback3 != null) {
                        callback3.run(Boolean.valueOf(z11));
                        return;
                    }
                    return;
                }
                return;
            case 16:
                r rVar = (r) this.d;
                TLObject tLObject4 = (TLObject) this.c;
                Context context = (Context) this.b;
                if (tLObject4 instanceof TLRPC.TL_payments_starsRevenueAdsAccountUrl) {
                    ve.e.s(context, ((TLRPC.TL_payments_starsRevenueAdsAccountUrl) tLObject4).url);
                }
                AndroidUtilities.runOnUIThread(new gh.c(rVar, 5), 1000L);
                return;
            case 17:
                r.Z((r) this.d, (TLObject) this.c, (TLRPC.TL_error) this.b);
                return;
            case 18:
                k5 k5Var = (k5) this.d;
                Long l10 = (Long) this.c;
                k5Var.Z1(l10.longValue(), new fh.i(k5Var, l10, (g3[]) this.b, 2));
                return;
            case 19:
                k5.i0((k5) this.d, (TLObject) this.c, (MessageObject) this.b);
                return;
            case 20:
                k5 k5Var2 = (k5) this.d;
                ve.d dVar2 = (ve.d) this.c;
                TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) this.b;
                k5Var2.getClass();
                dVar2.c(false);
                tL_starGiftUnique.flags &= -17;
                tL_starGiftUnique.resale_ton_only = false;
                tL_starGiftUnique.resell_amount = null;
                k5Var2.a0.setResellPrice(gf.a.i(0L, gf.b.a));
                l3 l3Var = k5Var2.Z0;
                if (l3Var != null) {
                    l3Var.run();
                }
                j2.q(R.string.Gift2ResaleDisable, new Object[]{k5Var2.C1()}, k5Var2.getBulletinFactory(), R.raw.contact_check, 36);
                return;
            case 21:
                k5 k5Var3 = (k5) this.d;
                ve.d dVar3 = (ve.d) this.c;
                TLRPC.TL_error tL_error4 = (TLRPC.TL_error) this.b;
                k5Var3.getClass();
                dVar3.c(false);
                k5Var3.getBulletinFactory().d0(tL_error4, false);
                return;
            case 22:
                g3[] g3VarArr = (g3[]) this.d;
                ve.d dVar4 = (ve.d) this.c;
                TwoStepVerificationActivity twoStepVerificationActivity = (TwoStepVerificationActivity) this.b;
                g3VarArr[0].dismiss();
                dVar4.c(false);
                k5.d2(twoStepVerificationActivity);
                return;
            case 23:
                k5.S((k5) this.d, (c2) this.c, (MessageObject) this.b);
                return;
            case 24:
                k5.U((k5) this.d, (TL_stars.TL_starGiftUnique) this.c, (String) this.b);
                return;
            case 25:
                TLObject tLObject5 = (TLObject) this.d;
                TLRPC.TL_error tL_error5 = (TLRPC.TL_error) this.c;
                Utilities.Callback callback4 = (Utilities.Callback) this.b;
                if (tLObject5 instanceof TLRPC.TL_payments_paymentFormStarGift) {
                    callback4.run((TLRPC.TL_payments_paymentFormStarGift) tLObject5);
                    return;
                } else {
                    v7.e(tL_error5 != null ? tL_error5.text : "NO_PAYMENT_FORM");
                    callback4.run(null);
                    return;
                }
            case 26:
                v7 v7Var = (v7) this.d;
                TLObject tLObject6 = (TLObject) this.c;
                Runnable runnable = (Runnable) this.b;
                ArrayList arrayList9 = v7Var.v;
                boolean[] zArr = v7Var.r;
                ArrayList[] arrayListArr = v7Var.q;
                int i15 = v7Var.a;
                boolean z15 = !v7Var.e;
                v7Var.c = System.currentTimeMillis();
                if (tLObject6 instanceof TL_stars.StarsStatus) {
                    TL_stars.StarsStatus starsStatus = (TL_stars.StarsStatus) tLObject6;
                    MessagesController.getInstance(i15).putUsers(starsStatus.users, false);
                    MessagesController.getInstance(i15).putChats(starsStatus.chats, false);
                    if (arrayListArr[0].isEmpty()) {
                        ArrayList<TL_stars.StarsTransaction> arrayList10 = starsStatus.history;
                        int size3 = arrayList10.size();
                        int i16 = 0;
                        while (i16 < size3) {
                            TL_stars.StarsTransaction starsTransaction = arrayList10.get(i16);
                            i16++;
                            TL_stars.StarsTransaction starsTransaction2 = starsTransaction;
                            arrayListArr[0].add(starsTransaction2);
                            arrayListArr[starsTransaction2.amount.amount > 0 ? (char) 1 : (char) 2].add(starsTransaction2);
                        }
                        j10 = 0;
                        for (int i17 = 0; i17 < 3; i17++) {
                            zArr[i17] = !arrayListArr[i17].isEmpty() || zArr[i17];
                            boolean[] zArr2 = v7Var.u;
                            boolean z16 = (starsStatus.flags & 1) == 0;
                            zArr2[i17] = z16;
                            if (z16) {
                                v7Var.t[i17] = false;
                            }
                            v7Var.s[i17] = zArr2[i17] ? null : starsStatus.next_offset;
                        }
                        z12 = true;
                    } else {
                        j10 = 0;
                        z12 = false;
                    }
                    if (arrayList9.isEmpty()) {
                        arrayList9.addAll(starsStatus.subscriptions);
                        v7Var.x = false;
                        v7Var.w = starsStatus.subscriptions_next_offset;
                        v7Var.y = (starsStatus.flags & 4) == 0;
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    long j11 = v7Var.f.amount;
                    TL_stars.StarsAmount starsAmount = starsStatus.balance;
                    if (j11 != starsAmount.amount) {
                        z15 = true;
                    }
                    v7Var.f = starsAmount;
                    v7Var.g = j10;
                } else {
                    z12 = false;
                    z13 = false;
                }
                v7Var.d = false;
                v7Var.e = true;
                if (z15) {
                    NotificationCenter.getInstance(i15).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starBalanceUpdated, new Object[0]);
                }
                if (z12) {
                    NotificationCenter.getInstance(i15).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starTransactionsLoaded, new Object[0]);
                }
                if (z13) {
                    NotificationCenter.getInstance(i15).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starSubscriptionsLoaded, new Object[0]);
                }
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            case 27:
                v7 v7Var2 = (v7) this.d;
                HashSet hashSet = (HashSet) this.c;
                Runnable runnable2 = (Runnable) this.b;
                v7Var2.getClass();
                Iterator it = hashSet.iterator();
                while (it.hasNext()) {
                    Integer num = (Integer) it.next();
                    num.intValue();
                    v7Var2.Q.remove(num);
                    v7Var2.R.remove(num);
                }
                runnable2.run();
                return;
            case 28:
                boolean[] zArr3 = (boolean[]) this.d;
                EditTextBoldCursor editTextBoldCursor = (EditTextBoldCursor) this.c;
                f3[] f3VarArr = (f3[]) this.b;
                zArr3[0] = false;
                AndroidUtilities.hideKeyboard(editTextBoldCursor);
                f3VarArr[0].dismiss();
                return;
            default:
                k1 k1Var = (k1) this.d;
                o8.w wVar2 = (o8.w) this.c;
                d0 d0Var = (d0) this.b;
                i3.f fVar2 = k1Var.c;
                l0 c11 = wVar2.c();
                com.google.firebase.messaging.m mVar2 = fVar2.d;
                h3.c2 c2Var = fVar2.h;
                c2Var.getClass();
                mVar2.getClass();
                mVar2.b = z.u(c11);
                if (!c11.isEmpty()) {
                    mVar2.e = (d0) c11.get(0);
                    d0Var.getClass();
                    mVar2.f = d0Var;
                }
                if (((d0) mVar2.d) == null) {
                    mVar2.d = com.google.firebase.messaging.m.n(c2Var, (z) mVar2.b, (d0) mVar2.e, (p2) mVar2.a);
                }
                mVar2.D(c2Var.A());
                return;
        }
    }

    public /* synthetic */ b(Object obj, Object obj2, Object obj3, int i9) {
        this.a = i9;
        this.d = obj;
        this.c = obj2;
        this.b = obj3;
    }

    public /* synthetic */ b(Object obj, Object obj2, Object obj3, Object obj4, int i9) {
        this.a = i9;
        this.d = obj2;
        this.c = obj3;
        this.b = obj4;
    }
}
