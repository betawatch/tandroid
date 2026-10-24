package a3;

import ah.d1;
import ah.i1;
import ai.h3;
import ai.ha;
import ai.l7;
import ai.u0;
import ai.u2;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.view.View;
import androidx.car.app.IOnDoneCallback;
import ci.b7;
import ci.g4;
import ci.h7;
import ci.ia;
import ci.m7;
import ci.n3;
import ci.n4;
import ci.o3;
import ci.p3;
import ci.p4;
import ci.q9;
import ci.r2;
import ci.r6;
import ci.s6;
import ci.w6;
import ci.z6;
import ci.z9;
import com.google.android.gms.tasks.TaskCompletionSource;
import i2.o1;
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
import org.telegram.messenger.k2;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.Vector;
import org.telegram.tgnet.tl.TL_bots;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.c2;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.o2;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.f5;
import org.telegram.ui.Components.qc;
import org.telegram.ui.Components.r5;
import org.telegram.ui.Components.xc;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.TwoStepVerificationActivity;
import ug.l1;
import v7.q8;
import w7.z5;
import yh.a2;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
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
    /* JADX WARN: Type inference failed for: r10v0 */
    /* JADX WARN: Type inference failed for: r10v1 */
    /* JADX WARN: Type inference failed for: r10v3 */
    /* JADX WARN: Type inference failed for: r3v44 */
    /* JADX WARN: Type inference failed for: r3v45, types: [int] */
    /* JADX WARN: Type inference failed for: r3v91 */
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
        ?? r10 = 0;
        switch (this.a) {
            case 0:
                n4.s sVar = (n4.s) this.b;
                b2.w wVar = (b2.w) this.c;
                i2.f fVar = (i2.f) this.d;
                m0 m0Var = (m0) sVar.c;
                String str = e2.m0.a;
                i2.h0 h0Var = ((i2.b0) m0Var).a;
                h0Var.S = wVar;
                j2.e eVar2 = h0Var.s;
                j2.a p5 = eVar2.p();
                eVar2.q(p5, 1017, new j2.d(p5, wVar, fVar, 4));
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
                l7Var.y2(l4.longValue(), new h3(l7Var, l4, (l1[]) this.d, 0 == true ? 1 : 0));
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
                o1.t(R.string.Gift2ResaleDisable, new Object[]{l7Var2.W1()}, l7Var2.getBulletinFactory(), R.raw.contact_check, 36);
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
                l7.K0((l7) this.b, (TLObject) this.c, (MessageObject) this.d);
                return;
            case 7:
                Runnable runnable = (Runnable) this.b;
                pf.c cVar3 = (pf.c) this.c;
                TwoStepVerificationActivity twoStepVerificationActivity = (TwoStepVerificationActivity) this.d;
                runnable.run();
                cVar3.c(false);
                l7.D2(twoStepVerificationActivity);
                return;
            case 8:
                Runnable runnable2 = (Runnable) this.b;
                TLRPC.Document document3 = (TLRPC.Document) this.c;
                CharSequence charSequence = (CharSequence) this.d;
                o2 U = LaunchActivity.U();
                xc a02 = U != null ? xc.a0(U) : xc.X();
                qc q6 = runnable2 == null ? document3 != null ? a02.q(document3, charSequence) : a02.Q(R.raw.contact_check, 36, charSequence) : document3 != null ? a02.r(document3, charSequence, LocaleController.getString(R.string.Gift2UniqueView), runnable2) : a02.J(R.raw.contact_check, charSequence, LocaleController.getString(R.string.Gift2UniqueView), runnable2);
                q6.t = true;
                q6.j();
                return;
            case 9:
                l7.f1((l7) this.b, (c2) this.c, (MessageObject) this.d);
                return;
            case 10:
                l7.n1((l7) this.b, (TL_stars.TL_starGiftUnique) this.c, (String) this.d);
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
                    ha.e(tL_error2 != null ? tL_error2.text : "NO_PAYMENT_FORM");
                    callback.run(null);
                    return;
                }
            case 13:
                ha haVar = (ha) this.b;
                TLObject tLObject4 = (TLObject) this.c;
                Runnable runnable3 = (Runnable) this.d;
                ArrayList arrayList = haVar.v;
                boolean[] zArr = haVar.r;
                ArrayList[] arrayListArr = haVar.q;
                int i11 = haVar.a;
                boolean z17 = !haVar.e;
                haVar.c = System.currentTimeMillis();
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
                            arrayListArr[r10].add(starsTransaction2);
                            boolean z19 = r10;
                            ArrayList[] arrayListArr2 = arrayListArr;
                            arrayListArr2[starsTransaction2.amount.amount > 0 ? z18 ? 1 : 0 : (char) 2].add(starsTransaction2);
                            z15 = z18 ? 1 : 0;
                            r10 = z19 ? 1 : 0;
                            arrayListArr = arrayListArr2;
                        }
                        z10 = z15;
                        z13 = r10;
                        ArrayList[] arrayListArr3 = arrayListArr;
                        for (?? r32 = z13; r32 < 3; r32++) {
                            zArr[r32] = (!arrayListArr3[r32].isEmpty() || zArr[r32]) ? z10 : z13;
                            boolean[] zArr2 = haVar.u;
                            boolean z20 = (starsStatus.flags & 1) == 0 ? z10 : z13;
                            zArr2[r32] = z20;
                            if (z20) {
                                haVar.t[r32] = z13;
                            }
                            haVar.s[r32] = zArr2[r32] ? null : starsStatus.next_offset;
                        }
                        z14 = z10;
                    } else {
                        z10 = true;
                        z13 = false;
                        z14 = false;
                    }
                    if (arrayList.isEmpty()) {
                        arrayList.addAll(starsStatus.subscriptions);
                        haVar.x = z13;
                        haVar.w = starsStatus.subscriptions_next_offset;
                        haVar.y = (starsStatus.flags & 4) == 0 ? z10 : false;
                        z11 = z10;
                    } else {
                        z11 = false;
                    }
                    long j10 = haVar.f.amount;
                    TL_stars.StarsAmount starsAmount = starsStatus.balance;
                    if (j10 != starsAmount.amount) {
                        z17 = z10;
                    }
                    haVar.f = starsAmount;
                    haVar.g = 0L;
                    z12 = z14;
                } else {
                    z10 = true;
                    z11 = false;
                    z12 = false;
                }
                haVar.d = false;
                haVar.e = z10;
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
                ha haVar2 = (ha) this.b;
                HashSet hashSet = (HashSet) this.c;
                Runnable runnable4 = (Runnable) this.d;
                haVar2.getClass();
                Iterator it = hashSet.iterator();
                while (it.hasNext()) {
                    Integer num = (Integer) it.next();
                    num.intValue();
                    haVar2.Q.remove(num);
                    haVar2.R.remove(num);
                }
                runnable4.run();
                return;
            case 15:
                boolean[] zArr3 = (boolean[]) this.b;
                EditTextBoldCursor editTextBoldCursor = (EditTextBoldCursor) this.c;
                org.telegram.ui.ActionBar.h3[] h3VarArr = (org.telegram.ui.ActionBar.h3[]) this.d;
                zArr3[0] = false;
                AndroidUtilities.hideKeyboard(editTextBoldCursor);
                h3VarArr[0].dismiss();
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
                p3 p3Var = (p3) this.b;
                i1 i1Var = (i1) this.c;
                View view = (View) this.d;
                p4 p4Var = p3Var.a;
                p4Var.u3 = true;
                n4 n4Var = p4Var.O1;
                ImageReceiver imageReceiver = p4Var.l3;
                boolean[] zArr4 = {false};
                m7 m7Var = p4Var.E0;
                m7Var.animate().alpha(0.0f).scaleX(0.8f).scaleY(0.8f).setListener(new r2(true ? 1 : 0, m7Var)).setDuration(150L).start();
                int dp = AndroidUtilities.dp(8.0f);
                m7 m7Var2 = new m7(p4Var.getContext(), p4Var.x1);
                p4Var.E0 = m7Var2;
                m7Var2.setPadding(dp, dp, dp, dp);
                p4Var.D0.addView(p4Var.E0, z5.e(40, 40, 3));
                r5 r5Var2 = p4Var.o3;
                if (r5Var2 != null) {
                    r5Var2.o(p4Var);
                    eVar = null;
                    p4Var.o3 = null;
                } else {
                    eVar = null;
                }
                ah.e eVar3 = p4Var.m3;
                if (eVar3 != null) {
                    eVar3.d(p4Var);
                    p4Var.m3 = eVar;
                }
                p4Var.p3 = false;
                if (i1Var.g != 0) {
                    p4Var.p3 = true;
                    r5 r5Var3 = new r5(2, p4Var.C2, i1Var.g);
                    p4Var.o3 = r5Var3;
                    r5Var3.a(p4Var);
                } else if (i1Var.f != null && (tL_availableReaction = MediaDataController.getInstance(p4Var.C2).getReactionsMap().get(i1Var.f)) != null) {
                    p4Var.n3.setImage(null, null, ImageLocation.getForDocument(tL_availableReaction.select_animation), "60_60", null, null, null, 0L, null, null, 0);
                    imageReceiver.setImage(ImageLocation.getForDocument(tL_availableReaction.around_animation), d1.a(), null, null, null, 0);
                    if (imageReceiver.getLottieAnimation() != null) {
                        imageReceiver.getLottieAnimation().N(0, false, true);
                    }
                }
                p4Var.E0.setReaction(i1Var);
                if (p4Var.D1) {
                    TL_stories.StoryItem storyItem3 = n4Var.a;
                    if (storyItem3.sent_reaction == null) {
                        if (storyItem3.views == null) {
                            storyItem3.views = new TL_stories.TL_storyViews();
                        }
                        TL_stories.StoryItem storyItem4 = n4Var.a;
                        TL_stories.StoryViews storyViews = storyItem4.views;
                        storyViews.reactions_count++;
                        ah.l1.b(null, storyItem4.sent_reaction, storyViews);
                        p4Var.j1(true);
                    }
                }
                if (i1Var.g != 0 && (r5Var = p4Var.E0.f) != null) {
                    ah.e a10 = ah.e.a(r5Var, false, true);
                    p4Var.m3 = a10;
                    a10.f(p4Var);
                }
                p4Var.S1.g0(p4Var.B1, n4Var.a, i1Var);
                int[] iArr = new int[2];
                view.getLocationInWindow(iArr);
                int[] iArr2 = new int[2];
                p4Var.getLocationInWindow(iArr2);
                p4Var.w3 = iArr[0] - iArr2[0];
                p4Var.x3 = iArr[1] - iArr2[1];
                p4Var.y3 = view.getMeasuredHeight();
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                p4Var.v3 = 0.0f;
                p4Var.invalidate();
                m7 m7Var3 = p4Var.E0;
                m7Var3.setAllowDrawReaction(false);
                ImageReceiver imageReceiver2 = m7Var3.e;
                if (i1Var.g == 0 && (tL_availableReaction2 = MediaDataController.getInstance(UserConfig.selectedAccount).getReactionsMap().get(i1Var.f)) != null) {
                    imageReceiver2.setImage(ImageLocation.getForDocument(tL_availableReaction2.center_icon), "40_40_nolimit", null, "tgs", tL_availableReaction2, 1);
                    imageReceiver2.setAutoRepeat(0);
                }
                ofFloat.addUpdateListener(new n3(p3Var, ofFloat, zArr4, 0 == true ? 1 : 0));
                ofFloat.addListener(new o3(p3Var, zArr4, m7Var3, 0 == true ? 1 : 0));
                ofFloat.setDuration(220L);
                ofFloat.start();
                p4Var.a1(false);
                return;
            case 20:
                g4 g4Var = (g4) this.b;
                g6 g6Var = (g6) this.c;
                TL_stories.StoryItem storyItem5 = (TL_stories.StoryItem) this.d;
                p4 p4Var2 = g4Var.l;
                f5.S(p4Var2.getContext(), null, g6Var, new u2(g4Var, storyItem5, g6Var, i10));
                g4 g4Var2 = p4Var2.t1;
                if (g4Var2 != null) {
                    g4Var2.a();
                    return;
                }
                return;
            case 21:
                s6 s6Var = (s6) this.b;
                TL_stories.StoryItem storyItem6 = (TL_stories.StoryItem) this.c;
                Utilities.Callback callback2 = (Utilities.Callback) this.d;
                for (int i13 = 0; i13 < s6Var.i.size(); i13++) {
                    MessageObject messageObject2 = (MessageObject) s6Var.i.get(i13);
                    if (messageObject2 != null && (storyItem = messageObject2.storyItem) != null && (messageMedia = storyItem.media) != null && (document = storyItem6.media.document) != null && (document2 = messageMedia.document) != null && document2.id == document.id) {
                        callback2.run(document2);
                        return;
                    }
                }
                callback2.run(null);
                return;
            case 22:
                h7 h7Var = (h7) this.b;
                TLObject tLObject5 = (TLObject) this.c;
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) this.d;
                int i14 = h7Var.a;
                h7Var.R = true;
                if (tLObject5 instanceof TLRPC.TL_boolTrue) {
                    h7Var.S = null;
                    NotificationCenter.getInstance(i14).lambda$postNotificationNameOnUIThread$1(NotificationCenter.storiesLimitUpdate, new Object[0]);
                    return;
                } else if (!(tLObject5 instanceof TL_stories.canSendStoryCount)) {
                    h7Var.n(tL_error3);
                    return;
                } else {
                    h7Var.S = new b7(1, ((TL_stories.canSendStoryCount) tLObject5).count_remains, -1L);
                    NotificationCenter.getInstance(i14).lambda$postNotificationNameOnUIThread$1(NotificationCenter.storiesLimitUpdate, new Object[0]);
                    return;
                }
            case 23:
                s6 s6Var2 = (s6) this.b;
                r6 r6Var = (r6) this.c;
                k2 k2Var = (k2) this.d;
                ArrayList arrayList3 = s6Var2.i;
                for (int i15 = 0; i15 < arrayList3.size(); i15++) {
                    MessageObject messageObject3 = (MessageObject) arrayList3.get(i15);
                    if (messageObject3 != null && (storyItem2 = messageObject3.storyItem) != null && (messageMedia2 = storyItem2.media) != null) {
                        TLRPC.MessageMedia messageMedia3 = r6Var.media;
                        TLRPC.Document document4 = messageMedia3.document;
                        if (document4 != null) {
                            TLRPC.Document document5 = messageMedia2.document;
                            if (document5 == null) {
                                continue;
                            } else if (document5.id == document4.id) {
                                k2Var.run((r6) storyItem2);
                                return;
                            }
                        }
                        TLRPC.Photo photo2 = messageMedia3.photo;
                        if (photo2 != null && (photo = messageMedia2.photo) != null && photo.id == photo2.id) {
                            k2Var.run((r6) storyItem2);
                            return;
                        }
                    }
                }
                k2Var.run(null);
                return;
            case 24:
                s6 s6Var3 = (s6) this.b;
                TLObject tLObject6 = (TLObject) this.c;
                Runnable runnable5 = (Runnable) this.d;
                w6 w6Var = s6Var3.q;
                ArrayList arrayList4 = s6Var3.G;
                ArrayList arrayList5 = s6Var3.i;
                ArrayList arrayList6 = s6Var3.H;
                s6Var3.F = 0;
                s6Var3.C = false;
                s6Var3.D = true;
                s6Var3.r = true;
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
                    MessageObject messageObject4 = new MessageObject(s6Var3.c, new r6(s6Var3, s6Var3.d, botpreviewmedia));
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
                        id2 = s6Var3.I;
                        s6Var3.I = id2 + 1;
                    } else {
                        id2 = messageObject.getId();
                    }
                    message.id = id2;
                    storyItem7.id = id2;
                    messageObject4.parentStoriesList = s6Var3;
                    messageObject4.generateThumbs(false);
                    if (arrayList6.isEmpty()) {
                        arrayList6.add(new ArrayList());
                    }
                    ((ArrayList) arrayList6.get(0)).add(Integer.valueOf(messageObject4.getId()));
                    arrayList5.add(messageObject4);
                    arrayList7 = arrayList10;
                }
                AndroidUtilities.cancelRunOnUIThread(w6Var);
                AndroidUtilities.runOnUIThread(w6Var);
                if (runnable5 != null) {
                    AndroidUtilities.runOnUIThread(runnable5);
                    return;
                }
                return;
            case 25:
                q9 q9Var = (q9) this.b;
                z6 z6Var = (z6) this.c;
                ArrayList arrayList11 = (ArrayList) this.d;
                z9 z9Var = q9Var.d;
                z9Var.n0.D(z9Var.h, z6Var.d, arrayList11);
                return;
            case 26:
                ia iaVar = (ia) this.b;
                TLObject tLObject7 = (TLObject) this.c;
                TL_stories.TL_stories_getStoriesViews tL_stories_getStoriesViews = (TL_stories.TL_stories_getStoriesViews) this.d;
                androidx.fragment.app.d dVar = iaVar.f;
                int i19 = iaVar.b;
                ia.g = System.currentTimeMillis();
                if (tLObject7 != null) {
                    TL_stories.TL_stories_storyViews tL_stories_storyViews = (TL_stories.TL_stories_storyViews) tLObject7;
                    MessagesController.getInstance(i19).putUsers(tL_stories_storyViews.users, false);
                    if (!iaVar.d(tL_stories_getStoriesViews.id, tL_stories_storyViews)) {
                        iaVar.d = 0;
                        iaVar.e = false;
                        return;
                    }
                    NotificationCenter.getInstance(i19).lambda$postNotificationNameOnUIThread$1(NotificationCenter.storiesUpdated, new Object[0]);
                }
                iaVar.d = 0;
                if (iaVar.e) {
                    AndroidUtilities.cancelRunOnUIThread(dVar);
                    AndroidUtilities.runOnUIThread(dVar, 10000L);
                    return;
                }
                return;
            case 27:
                com.google.firebase.messaging.g gVar = (com.google.firebase.messaging.g) this.b;
                Intent intent = (Intent) this.c;
                TaskCompletionSource taskCompletionSource = (TaskCompletionSource) this.d;
                gVar.getClass();
                try {
                    gVar.handleIntent(intent);
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
