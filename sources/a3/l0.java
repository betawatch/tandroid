package a3;

import ah.d1;
import ah.i1;
import ah.l1;
import ai.ga;
import ai.h3;
import ai.l7;
import ai.u0;
import ai.u2;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.view.View;
import androidx.car.app.IOnDoneCallback;
import ci.a7;
import ci.aa;
import ci.c7;
import ci.h4;
import ci.i7;
import ci.ja;
import ci.n7;
import ci.o3;
import ci.o4;
import ci.p3;
import ci.q3;
import ci.q4;
import ci.r9;
import ci.s2;
import ci.s6;
import ci.t6;
import ci.x6;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ThreadPoolExecutor;
import m4.s1;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.j2;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.Vector;
import org.telegram.tgnet.tl.TL_bots;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.b2;
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.ActionBar.f3;
import org.telegram.ui.ActionBar.n2;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.f5;
import org.telegram.ui.Components.qc;
import org.telegram.ui.Components.r5;
import org.telegram.ui.Components.xc;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.TwoStepVerificationActivity;
import ug.m1;
import v7.q8;
import w7.z5;
import yh.a2;

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
/* loaded from: classes.dex */
public final /* synthetic */ class l0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ l0(Object obj, Object obj2, Object obj3, int i10) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v45 */
    /* JADX WARN: Type inference failed for: r3v46, types: [int] */
    /* JADX WARN: Type inference failed for: r3v90 */
    /* JADX WARN: Type inference failed for: r9v0 */
    /* JADX WARN: Type inference failed for: r9v1 */
    /* JADX WARN: Type inference failed for: r9v10 */
    @Override // java.lang.Runnable
    public final void run() {
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        ah.e eVar;
        TLRPC.TL_availableReaction tL_availableReaction;
        TLRPC.TL_availableReaction tL_availableReaction2;
        r5 r5Var;
        TL_stories.StoryItem storyItem;
        TLRPC.MessageMedia messageMedia;
        TLRPC.Document document;
        TLRPC.Document document2;
        TL_stories.StoryItem storyItem2;
        TLRPC.MessageMedia messageMedia2;
        TLRPC.Photo photo;
        MessageObject messageObject;
        int id2;
        int i10 = 3;
        boolean z15 = true;
        boolean z16 = true;
        ?? r92 = 0;
        switch (this.a) {
            case 0:
                n4.s sVar = (n4.s) this.b;
                b2.w wVar = (b2.w) this.c;
                i2.g gVar = (i2.g) this.d;
                m0 m0Var = (m0) sVar.c;
                String str = e2.m0.a;
                i2.i0 i0Var = ((i2.c0) m0Var).a;
                i0Var.S = wVar;
                j2.f fVar = i0Var.s;
                j2.a p5 = fVar.p();
                fVar.q(p5, 1017, new j2.e(p5, wVar, gVar, 0));
                return;
            case 1:
                ai.x xVar = (ai.x) this.b;
                TLObject tLObject = (TLObject) this.c;
                Context context = (Context) this.d;
                if (tLObject instanceof TLRPC.TL_payments_starsRevenueAdsAccountUrl) {
                    pf.d.r(context, ((TLRPC.TL_payments_starsRevenueAdsAccountUrl) tLObject).url);
                }
                AndroidUtilities.runOnUIThread(new ai.d(xVar, 5), 1000L);
                return;
            case 2:
                ai.x.a0((ai.x) this.b, (TLObject) this.c, (TLRPC.TL_error) this.d);
                return;
            case 3:
                l7 l7Var = (l7) this.b;
                Long l4 = (Long) this.c;
                l7Var.z2(l4.longValue(), new h3(l7Var, l4, (m1[]) this.d, 0 == true ? 1 : 0));
                return;
            case 4:
                l7 l7Var2 = (l7) this.b;
                pf.c cVar = (pf.c) this.c;
                TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) this.d;
                l7Var2.getClass();
                cVar.c(false);
                tL_starGiftUnique.flags &= -17;
                tL_starGiftUnique.resale_ton_only = false;
                tL_starGiftUnique.resell_amount = null;
                l7Var2.f0.setResellPrice(ag.a.i(0L, ag.b.a));
                a2 a2Var = l7Var2.k1;
                if (a2Var != null) {
                    a2Var.run();
                }
                i2.e.s(R.string.Gift2ResaleDisable, new Object[]{l7Var2.X1()}, l7Var2.getBulletinFactory(), R.raw.contact_check, 36);
                return;
            case 5:
                l7 l7Var3 = (l7) this.b;
                pf.c cVar2 = (pf.c) this.c;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.d;
                l7Var3.getClass();
                cVar2.c(false);
                l7Var3.getBulletinFactory().f0(tL_error, false);
                return;
            case 6:
                l7.L0((l7) this.b, (TLObject) this.c, (MessageObject) this.d);
                return;
            case 7:
                Runnable runnable = (Runnable) this.b;
                pf.c cVar3 = (pf.c) this.c;
                TwoStepVerificationActivity twoStepVerificationActivity = (TwoStepVerificationActivity) this.d;
                runnable.run();
                cVar3.c(false);
                l7.E2(twoStepVerificationActivity);
                return;
            case 8:
                Runnable runnable2 = (Runnable) this.b;
                TLRPC.Document document3 = (TLRPC.Document) this.c;
                CharSequence charSequence = (CharSequence) this.d;
                n2 U = LaunchActivity.U();
                xc a02 = U != null ? xc.a0(U) : xc.X();
                qc q6 = runnable2 == null ? document3 != null ? a02.q(document3, charSequence) : a02.Q(R.raw.contact_check, 36, charSequence) : document3 != null ? a02.r(document3, charSequence, LocaleController.getString(R.string.Gift2UniqueView), runnable2) : a02.J(R.raw.contact_check, charSequence, LocaleController.getString(R.string.Gift2UniqueView), runnable2);
                q6.t = true;
                q6.j();
                return;
            case 9:
                l7.g1((l7) this.b, (b2) this.c, (MessageObject) this.d);
                return;
            case 10:
                l7.o1((l7) this.b, (TL_stars.TL_starGiftUnique) this.c, (String) this.d);
                return;
            case 11:
                TLObject tLObject2 = (TLObject) this.b;
                u0 u0Var = (u0) this.c;
                String str2 = (String) this.d;
                if (tLObject2 instanceof TL_stars.TL_payments_uniqueStarGift) {
                    TL_stars.StarGift starGift = ((TL_stars.TL_payments_uniqueStarGift) tLObject2).gift;
                    if (starGift instanceof TL_stars.TL_starGiftUnique) {
                        TL_stars.TL_starGiftUnique tL_starGiftUnique2 = (TL_stars.TL_starGiftUnique) starGift;
                        Long valueOf = Long.valueOf(tL_starGiftUnique2.gift_id);
                        String str3 = tL_starGiftUnique2.title;
                        if (str3 != null) {
                            str2 = str3;
                        }
                        u0Var.run(valueOf, str2);
                        return;
                    }
                }
                u0Var.run(0L, str2);
                return;
            case 12:
                TLObject tLObject3 = (TLObject) this.b;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) this.c;
                Utilities.Callback callback = (Utilities.Callback) this.d;
                if (tLObject3 instanceof TLRPC.TL_payments_paymentFormStarGift) {
                    callback.run((TLRPC.TL_payments_paymentFormStarGift) tLObject3);
                    return;
                } else {
                    ga.e(tL_error2 != null ? tL_error2.text : "NO_PAYMENT_FORM");
                    callback.run(null);
                    return;
                }
            case 13:
                ga gaVar = (ga) this.b;
                TLObject tLObject4 = (TLObject) this.c;
                Runnable runnable3 = (Runnable) this.d;
                ArrayList arrayList = gaVar.v;
                boolean[] zArr = gaVar.r;
                ArrayList[] arrayListArr = gaVar.q;
                int i11 = gaVar.a;
                boolean z17 = !gaVar.e;
                gaVar.c = System.currentTimeMillis();
                if (tLObject4 instanceof TL_stars.StarsStatus) {
                    TL_stars.StarsStatus starsStatus = (TL_stars.StarsStatus) tLObject4;
                    MessagesController.getInstance(i11).putUsers(starsStatus.users, false);
                    MessagesController.getInstance(i11).putChats(starsStatus.chats, false);
                    if (arrayListArr[0].isEmpty()) {
                        ArrayList<TL_stars.StarsTransaction> arrayList2 = starsStatus.history;
                        int size = arrayList2.size();
                        int i12 = 0;
                        while (i12 < size) {
                            TL_stars.StarsTransaction starsTransaction = arrayList2.get(i12);
                            i12++;
                            TL_stars.StarsTransaction starsTransaction2 = starsTransaction;
                            boolean z18 = z15;
                            arrayListArr[r92].add(starsTransaction2);
                            boolean z19 = r92;
                            ArrayList[] arrayListArr2 = arrayListArr;
                            arrayListArr2[starsTransaction2.amount.amount > 0 ? z18 ? 1 : 0 : (char) 2].add(starsTransaction2);
                            z15 = z18 ? 1 : 0;
                            r92 = z19 ? 1 : 0;
                            arrayListArr = arrayListArr2;
                        }
                        z10 = z15;
                        z13 = r92;
                        ArrayList[] arrayListArr3 = arrayListArr;
                        for (?? r32 = z13; r32 < 3; r32++) {
                            zArr[r32] = (!arrayListArr3[r32].isEmpty() || zArr[r32]) ? z10 : z13;
                            boolean[] zArr2 = gaVar.u;
                            boolean z20 = (starsStatus.flags & 1) == 0 ? z10 : z13;
                            zArr2[r32] = z20;
                            if (z20) {
                                gaVar.t[r32] = z13;
                            }
                            gaVar.s[r32] = zArr2[r32] ? null : starsStatus.next_offset;
                        }
                        z14 = z10;
                    } else {
                        z10 = true;
                        z13 = false;
                        z14 = false;
                    }
                    if (arrayList.isEmpty()) {
                        arrayList.addAll(starsStatus.subscriptions);
                        gaVar.x = z13;
                        gaVar.w = starsStatus.subscriptions_next_offset;
                        gaVar.y = (starsStatus.flags & 4) == 0 ? z10 : false;
                        z11 = z10;
                    } else {
                        z11 = false;
                    }
                    long j10 = gaVar.f.amount;
                    TL_stars.StarsAmount starsAmount = starsStatus.balance;
                    if (j10 != starsAmount.amount) {
                        z17 = z10;
                    }
                    gaVar.f = starsAmount;
                    gaVar.g = 0L;
                    z12 = z14;
                } else {
                    z10 = true;
                    z11 = false;
                    z12 = false;
                }
                gaVar.d = false;
                gaVar.e = z10;
                if (z17) {
                    NotificationCenter.getInstance(i11).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starBalanceUpdated, new Object[0]);
                }
                if (z12) {
                    NotificationCenter.getInstance(i11).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starTransactionsLoaded, new Object[0]);
                }
                if (z11) {
                    NotificationCenter.getInstance(i11).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starSubscriptionsLoaded, new Object[0]);
                }
                if (runnable3 != null) {
                    runnable3.run();
                    return;
                }
                return;
            case 14:
                ga gaVar2 = (ga) this.b;
                HashSet hashSet = (HashSet) this.c;
                Runnable runnable4 = (Runnable) this.d;
                gaVar2.getClass();
                Iterator it = hashSet.iterator();
                while (it.hasNext()) {
                    Integer num = (Integer) it.next();
                    num.intValue();
                    gaVar2.Q.remove(num);
                    gaVar2.R.remove(num);
                }
                runnable4.run();
                return;
            case 15:
                boolean[] zArr3 = (boolean[]) this.b;
                EditTextBoldCursor editTextBoldCursor = (EditTextBoldCursor) this.c;
                f3[] f3VarArr = (f3[]) this.d;
                zArr3[0] = false;
                AndroidUtilities.hideKeyboard(editTextBoldCursor);
                f3VarArr[0].dismiss();
                return;
            case 16:
                androidx.lifecycle.o oVar = (androidx.lifecycle.o) this.b;
                androidx.car.app.utils.a aVar = (androidx.car.app.utils.a) this.c;
                String str4 = (String) this.d;
                if (oVar != null) {
                    try {
                        if (((androidx.lifecycle.v) oVar).c.compareTo(androidx.lifecycle.n.c) < 0) {
                            z16 = false;
                        }
                        if (z16) {
                            aVar.a();
                            return;
                        }
                    } catch (w.f e) {
                        Log.e("CarApp.Dispatch", "Serialization failure in ".concat(str4), e);
                        return;
                    }
                }
                Log.w("CarApp.Dispatch", "Lifecycle is not at least created when dispatching " + aVar);
                return;
            case 17:
                IOnDoneCallback iOnDoneCallback = (IOnDoneCallback) this.b;
                String str5 = (String) this.c;
                try {
                    androidx.car.app.utils.g.d(str5.concat(" onSuccess"), new u2(iOnDoneCallback, ((androidx.car.app.utils.a) this.d).a(), str5, true ? 1 : 0));
                    return;
                } catch (RuntimeException e7) {
                    androidx.car.app.utils.g.f(iOnDoneCallback, str5, e7);
                    throw new RuntimeException(e7);
                } catch (w.f e10) {
                    androidx.car.app.utils.g.f(iOnDoneCallback, str5, e10);
                    return;
                }
            case 18:
                k6.h hVar = (k6.h) this.b;
                v7.t tVar = (v7.t) this.c;
                ThreadPoolExecutor threadPoolExecutor = (ThreadPoolExecutor) this.d;
                try {
                    androidx.emoji2.text.r a2 = v7.s.a(hVar.a);
                    if (a2 == null) {
                        throw new RuntimeException("EmojiCompat font provider not available on this device.");
                    }
                    androidx.emoji2.text.q qVar = (androidx.emoji2.text.q) ((androidx.emoji2.text.k) a2.b);
                    synchronized (qVar.d) {
                        qVar.f = threadPoolExecutor;
                    }
                    ((androidx.emoji2.text.k) a2.b).a(new androidx.emoji2.text.m(tVar, threadPoolExecutor));
                    return;
                } catch (Throwable th2) {
                    tVar.a(th2);
                    threadPoolExecutor.shutdown();
                    return;
                }
            case 19:
                q3 q3Var = (q3) this.b;
                i1 i1Var = (i1) this.c;
                View view = (View) this.d;
                q4 q4Var = q3Var.a;
                q4Var.u3 = true;
                o4 o4Var = q4Var.O1;
                ImageReceiver imageReceiver = q4Var.l3;
                boolean[] zArr4 = {false};
                n7 n7Var = q4Var.E0;
                n7Var.animate().alpha(0.0f).scaleX(0.8f).scaleY(0.8f).setListener(new s2(true ? 1 : 0, n7Var)).setDuration(150L).start();
                int dp = AndroidUtilities.dp(8.0f);
                n7 n7Var2 = new n7(q4Var.getContext(), q4Var.x1);
                q4Var.E0 = n7Var2;
                n7Var2.setPadding(dp, dp, dp, dp);
                q4Var.D0.addView(q4Var.E0, z5.e(40, 40, 3));
                r5 r5Var2 = q4Var.o3;
                if (r5Var2 != null) {
                    r5Var2.o(q4Var);
                    eVar = null;
                    q4Var.o3 = null;
                } else {
                    eVar = null;
                }
                ah.e eVar2 = q4Var.m3;
                if (eVar2 != null) {
                    eVar2.d(q4Var);
                    q4Var.m3 = eVar;
                }
                q4Var.p3 = false;
                if (i1Var.g != 0) {
                    q4Var.p3 = true;
                    r5 r5Var3 = new r5(2, q4Var.C2, i1Var.g);
                    q4Var.o3 = r5Var3;
                    r5Var3.a(q4Var);
                } else if (i1Var.f != null && (tL_availableReaction = MediaDataController.getInstance(q4Var.C2).getReactionsMap().get(i1Var.f)) != null) {
                    q4Var.n3.setImage(null, null, ImageLocation.getForDocument(tL_availableReaction.select_animation), "60_60", null, null, null, 0L, null, null, 0);
                    imageReceiver.setImage(ImageLocation.getForDocument(tL_availableReaction.around_animation), d1.a(), null, null, null, 0);
                    if (imageReceiver.getLottieAnimation() != null) {
                        imageReceiver.getLottieAnimation().N(0, false, true);
                    }
                }
                q4Var.E0.setReaction(i1Var);
                if (q4Var.D1) {
                    TL_stories.StoryItem storyItem3 = o4Var.a;
                    if (storyItem3.sent_reaction == null) {
                        if (storyItem3.views == null) {
                            storyItem3.views = new TL_stories.TL_storyViews();
                        }
                        TL_stories.StoryItem storyItem4 = o4Var.a;
                        TL_stories.StoryViews storyViews = storyItem4.views;
                        storyViews.reactions_count++;
                        l1.b(null, storyItem4.sent_reaction, storyViews);
                        q4Var.k1(true);
                    }
                }
                if (i1Var.g != 0 && (r5Var = q4Var.E0.f) != null) {
                    ah.e a10 = ah.e.a(r5Var, false, true);
                    q4Var.m3 = a10;
                    a10.f(q4Var);
                }
                q4Var.S1.g0(q4Var.B1, o4Var.a, i1Var);
                int[] iArr = new int[2];
                view.getLocationInWindow(iArr);
                int[] iArr2 = new int[2];
                q4Var.getLocationInWindow(iArr2);
                q4Var.w3 = iArr[0] - iArr2[0];
                q4Var.x3 = iArr[1] - iArr2[1];
                q4Var.y3 = view.getMeasuredHeight();
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                q4Var.v3 = 0.0f;
                q4Var.invalidate();
                n7 n7Var3 = q4Var.E0;
                n7Var3.setAllowDrawReaction(false);
                ImageReceiver imageReceiver2 = n7Var3.e;
                if (i1Var.g == 0 && (tL_availableReaction2 = MediaDataController.getInstance(UserConfig.selectedAccount).getReactionsMap().get(i1Var.f)) != null) {
                    imageReceiver2.setImage(ImageLocation.getForDocument(tL_availableReaction2.center_icon), "40_40_nolimit", null, "tgs", tL_availableReaction2, 1);
                    imageReceiver2.setAutoRepeat(0);
                }
                ofFloat.addUpdateListener(new o3(q3Var, ofFloat, zArr4, 0 == true ? 1 : 0));
                ofFloat.addListener(new p3(q3Var, zArr4, n7Var3, 0 == true ? 1 : 0));
                ofFloat.setDuration(220L);
                ofFloat.start();
                q4Var.b1(false);
                return;
            case 20:
                h4 h4Var = (h4) this.b;
                d6 d6Var = (d6) this.c;
                TL_stories.StoryItem storyItem5 = (TL_stories.StoryItem) this.d;
                q4 q4Var2 = h4Var.l;
                f5.R(q4Var2.getContext(), null, d6Var, new u2(h4Var, storyItem5, d6Var, i10));
                h4 h4Var2 = q4Var2.t1;
                if (h4Var2 != null) {
                    h4Var2.a();
                    return;
                }
                return;
            case 21:
                t6 t6Var = (t6) this.b;
                TL_stories.StoryItem storyItem6 = (TL_stories.StoryItem) this.c;
                Utilities.Callback callback2 = (Utilities.Callback) this.d;
                for (int i13 = 0; i13 < t6Var.i.size(); i13++) {
                    MessageObject messageObject2 = (MessageObject) t6Var.i.get(i13);
                    if (messageObject2 != null && (storyItem = messageObject2.storyItem) != null && (messageMedia = storyItem.media) != null && (document = storyItem6.media.document) != null && (document2 = messageMedia.document) != null && document2.id == document.id) {
                        callback2.run(document2);
                        return;
                    }
                }
                callback2.run(null);
                return;
            case 22:
                i7 i7Var = (i7) this.b;
                TLObject tLObject5 = (TLObject) this.c;
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) this.d;
                int i14 = i7Var.a;
                i7Var.R = true;
                if (tLObject5 instanceof TLRPC.TL_boolTrue) {
                    i7Var.S = null;
                    NotificationCenter.getInstance(i14).lambda$postNotificationNameOnUIThread$1(NotificationCenter.storiesLimitUpdate, new Object[0]);
                    return;
                } else if (!(tLObject5 instanceof TL_stories.canSendStoryCount)) {
                    i7Var.n(tL_error3);
                    return;
                } else {
                    i7Var.S = new c7(1, ((TL_stories.canSendStoryCount) tLObject5).count_remains, -1L);
                    NotificationCenter.getInstance(i14).lambda$postNotificationNameOnUIThread$1(NotificationCenter.storiesLimitUpdate, new Object[0]);
                    return;
                }
            case 23:
                t6 t6Var2 = (t6) this.b;
                s6 s6Var = (s6) this.c;
                j2 j2Var = (j2) this.d;
                ArrayList arrayList3 = t6Var2.i;
                for (int i15 = 0; i15 < arrayList3.size(); i15++) {
                    MessageObject messageObject3 = (MessageObject) arrayList3.get(i15);
                    if (messageObject3 != null && (storyItem2 = messageObject3.storyItem) != null && (messageMedia2 = storyItem2.media) != null) {
                        TLRPC.MessageMedia messageMedia3 = s6Var.media;
                        TLRPC.Document document4 = messageMedia3.document;
                        if (document4 != null) {
                            TLRPC.Document document5 = messageMedia2.document;
                            if (document5 == null) {
                                continue;
                            } else if (document5.id == document4.id) {
                                j2Var.run((s6) storyItem2);
                                return;
                            }
                        }
                        TLRPC.Photo photo2 = messageMedia3.photo;
                        if (photo2 != null && (photo = messageMedia2.photo) != null && photo.id == photo2.id) {
                            j2Var.run((s6) storyItem2);
                            return;
                        }
                    }
                }
                j2Var.run(null);
                return;
            case 24:
                t6 t6Var3 = (t6) this.b;
                TLObject tLObject6 = (TLObject) this.c;
                Runnable runnable5 = (Runnable) this.d;
                x6 x6Var = t6Var3.q;
                ArrayList arrayList4 = t6Var3.G;
                ArrayList arrayList5 = t6Var3.i;
                ArrayList arrayList6 = t6Var3.H;
                t6Var3.F = 0;
                t6Var3.C = false;
                t6Var3.D = true;
                t6Var3.r = true;
                ArrayList arrayList7 = new ArrayList();
                if (tLObject6 instanceof Vector) {
                    ArrayList arrayList8 = ((Vector) tLObject6).objects;
                    int size2 = arrayList8.size();
                    int i16 = 0;
                    while (i16 < size2) {
                        Object obj = arrayList8.get(i16);
                        i16++;
                        arrayList7.add((TL_bots.botPreviewMedia) obj);
                    }
                } else {
                    if (!(tLObject6 instanceof TL_bots.previewInfo)) {
                        return;
                    }
                    TL_bots.previewInfo previewinfo = (TL_bots.previewInfo) tLObject6;
                    arrayList4.clear();
                    arrayList4.addAll(previewinfo.lang_codes);
                    arrayList7.addAll(previewinfo.media);
                }
                ArrayList arrayList9 = new ArrayList(arrayList5);
                arrayList5.clear();
                arrayList6.clear();
                int size3 = arrayList7.size();
                int i17 = 0;
                while (i17 < size3) {
                    Object obj2 = arrayList7.get(i17);
                    i17++;
                    TL_bots.botPreviewMedia botpreviewmedia = (TL_bots.botPreviewMedia) obj2;
                    ArrayList arrayList10 = arrayList7;
                    MessageObject messageObject4 = new MessageObject(t6Var3.c, new s6(t6Var3, t6Var3.d, botpreviewmedia));
                    int i18 = 0;
                    while (true) {
                        if (i18 >= arrayList9.size()) {
                            messageObject = null;
                        } else if (MessagesController.equals(((MessageObject) arrayList9.get(i18)).storyItem.media, botpreviewmedia.media)) {
                            messageObject = (MessageObject) arrayList9.get(i18);
                        } else {
                            i18++;
                        }
                    }
                    TL_stories.StoryItem storyItem7 = messageObject4.storyItem;
                    TLRPC.Message message = messageObject4.messageOwner;
                    if (messageObject == null) {
                        id2 = t6Var3.I;
                        t6Var3.I = id2 + 1;
                    } else {
                        id2 = messageObject.getId();
                    }
                    message.id = id2;
                    storyItem7.id = id2;
                    messageObject4.parentStoriesList = t6Var3;
                    messageObject4.generateThumbs(false);
                    if (arrayList6.isEmpty()) {
                        arrayList6.add(new ArrayList());
                    }
                    ((ArrayList) arrayList6.get(0)).add(Integer.valueOf(messageObject4.getId()));
                    arrayList5.add(messageObject4);
                    arrayList7 = arrayList10;
                }
                AndroidUtilities.cancelRunOnUIThread(x6Var);
                AndroidUtilities.runOnUIThread(x6Var);
                if (runnable5 != null) {
                    AndroidUtilities.runOnUIThread(runnable5);
                    return;
                }
                return;
            case 25:
                r9 r9Var = (r9) this.b;
                a7 a7Var = (a7) this.c;
                ArrayList arrayList11 = (ArrayList) this.d;
                aa aaVar = r9Var.d;
                aaVar.n0.D(aaVar.h, a7Var.d, arrayList11);
                return;
            case 26:
                ja jaVar = (ja) this.b;
                TLObject tLObject7 = (TLObject) this.c;
                TL_stories.TL_stories_getStoriesViews tL_stories_getStoriesViews = (TL_stories.TL_stories_getStoriesViews) this.d;
                androidx.fragment.app.d dVar = jaVar.f;
                int i19 = jaVar.b;
                ja.g = System.currentTimeMillis();
                if (tLObject7 != null) {
                    TL_stories.TL_stories_storyViews tL_stories_storyViews = (TL_stories.TL_stories_storyViews) tLObject7;
                    MessagesController.getInstance(i19).putUsers(tL_stories_storyViews.users, false);
                    if (!jaVar.d(tL_stories_getStoriesViews.id, tL_stories_storyViews)) {
                        jaVar.d = 0;
                        jaVar.e = false;
                        return;
                    }
                    NotificationCenter.getInstance(i19).lambda$postNotificationNameOnUIThread$1(NotificationCenter.storiesUpdated, new Object[0]);
                }
                jaVar.d = 0;
                if (jaVar.e) {
                    AndroidUtilities.cancelRunOnUIThread(dVar);
                    AndroidUtilities.runOnUIThread(dVar, 10000L);
                    return;
                }
                return;
            case 27:
                com.google.firebase.messaging.g gVar2 = (com.google.firebase.messaging.g) this.b;
                Intent intent = (Intent) this.c;
                TaskCompletionSource taskCompletionSource = (TaskCompletionSource) this.d;
                gVar2.getClass();
                try {
                    gVar2.handleIntent(intent);
                    return;
                } finally {
                    taskCompletionSource.setResult(null);
                }
            case 28:
                j9.y yVar = (j9.y) this.b;
                j9.e0 e0Var = (j9.e0) this.c;
                try {
                    try {
                        e0Var.o(((j9.q) this.d).apply(q8.a(yVar)));
                        return;
                    } catch (Throwable th3) {
                        e0Var.n(th3);
                        return;
                    }
                } catch (Error e11) {
                    e = e11;
                    e0Var.n(e);
                    return;
                } catch (CancellationException unused) {
                    e0Var.cancel(false);
                    return;
                } catch (RuntimeException e12) {
                    e = e12;
                    e0Var.n(e);
                    return;
                } catch (ExecutionException e13) {
                    e = e13;
                    Throwable cause = e.getCause();
                    if (cause != null) {
                        e = cause;
                    }
                    e0Var.n(e);
                    return;
                }
            default:
                j9.e0 e0Var2 = (j9.e0) this.b;
                hi.t tVar2 = (hi.t) this.c;
                s1 s1Var = (s1) this.d;
                try {
                    if (e0Var2.a instanceof j9.a) {
                        return;
                    }
                    tVar2.run();
                    e0Var2.m(s1Var);
                    return;
                } catch (Throwable th4) {
                    e0Var2.n(th4);
                    return;
                }
        }
    }

    public /* synthetic */ l0(Object obj, Object obj2, Object obj3, Object obj4, int i10) {
        this.a = i10;
        this.b = obj2;
        this.c = obj3;
        this.d = obj4;
    }
}
