package a3;

import a8.h1;
import a8.i1;
import a8.qd;
import ai.f1;
import ai.q1;
import ai.r1;
import ai.t1;
import ai.z0;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.util.Log;
import android.view.View;
import androidx.car.app.IOnDoneCallback;
import bh.a1;
import bh.s0;
import bh.x0;
import bi.ca;
import bi.d3;
import bi.h7;
import bi.v0;
import com.google.android.gms.tasks.TaskCompletionSource;
import di.b7;
import di.h4;
import di.ha;
import di.m7;
import di.n3;
import di.o3;
import di.o4;
import di.p3;
import di.p9;
import di.q4;
import di.r6;
import di.s6;
import di.s8;
import di.w6;
import di.y9;
import di.z6;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ThreadPoolExecutor;
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
import org.telegram.messenger.l2;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.Vector;
import org.telegram.tgnet.tl.TL_bots;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.e2;
import org.telegram.ui.ActionBar.k3;
import org.telegram.ui.ActionBar.r2;
import org.telegram.ui.ActionBar.u6;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.g5;
import org.telegram.ui.Components.gb1;
import org.telegram.ui.Components.qc;
import org.telegram.ui.Components.t5;
import org.telegram.ui.Components.wc;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.TwoStepVerificationActivity;
import vg.n1;
import zh.b2;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
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
    /* JADX WARN: Removed duplicated region for block: B:411:0x0887  */
    /* JADX WARN: Removed duplicated region for block: B:416:0x0897  */
    /* JADX WARN: Removed duplicated region for block: B:446:0x08e8  */
    /* JADX WARN: Removed duplicated region for block: B:464:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r10v0 */
    /* JADX WARN: Type inference failed for: r10v6 */
    /* JADX WARN: Type inference failed for: r10v8 */
    /* JADX WARN: Type inference failed for: r4v60 */
    /* JADX WARN: Type inference failed for: r4v61, types: [int] */
    /* JADX WARN: Type inference failed for: r4v95 */
    /* JADX WARN: Type inference failed for: r9v15 */
    /* JADX WARN: Type inference failed for: r9v16 */
    /* JADX WARN: Type inference failed for: r9v19 */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        t1 t1Var;
        String str;
        int i10;
        String str2;
        f1 f1Var;
        int i11;
        int i12;
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        bh.e eVar;
        TLRPC.TL_availableReaction tL_availableReaction;
        TLRPC.TL_availableReaction tL_availableReaction2;
        t5 t5Var;
        TL_stories.StoryItem storyItem;
        TLRPC.MessageMedia messageMedia;
        TLRPC.Document document;
        TLRPC.Document document2;
        TL_stories.StoryItem storyItem2;
        TLRPC.MessageMedia messageMedia2;
        TLRPC.Photo photo;
        MessageObject messageObject;
        int id2;
        int i13 = 4;
        boolean z15 = true;
        ?? r10 = 0;
        switch (this.a) {
            case 0:
                n4.s sVar = (n4.s) this.b;
                b2.x xVar = (b2.x) this.c;
                i2.f fVar = (i2.f) this.d;
                m0 m0Var = (m0) sVar.c;
                String str3 = e2.n0.a;
                i2.j0 j0Var = ((i2.d0) m0Var).a;
                j0Var.S = xVar;
                j2.e eVar2 = j0Var.s;
                j2.a p10 = eVar2.p();
                eVar2.q(p10, 1017, new j2.d(p10, xVar, fVar, 2));
                return;
            case 1:
                z0 z0Var = (z0) this.b;
                ai.f fVar2 = (ai.f) this.c;
                List list = (List) this.d;
                TLRPC.TL_shareThemeBackdrops tL_shareThemeBackdrops = fVar2.b;
                ArrayList<TLRPC.TL_shareThemeBackdropOption> arrayList = tL_shareThemeBackdrops != null ? tL_shareThemeBackdrops.backdrops : null;
                if (arrayList == null || arrayList == list || (t1Var = z0Var.d) == null || z0Var.isFinished) {
                    return;
                }
                r1 r1Var = t1Var.n;
                if (r1Var != null && r1Var.a == 0 && (i12 = r1Var.f) >= 0) {
                    String[] strArr = ai.a.a;
                    if (i12 < strArr.length) {
                        str = strArr[i12];
                        i10 = t1Var.N7;
                        if (i10 >= 0) {
                            String[] strArr2 = ai.a.a;
                            if (i10 < strArr2.length) {
                                str2 = strArr2[i10];
                                if (ai.a.a(arrayList)) {
                                    if (str2 != null) {
                                        i11 = 0;
                                        while (true) {
                                            String[] strArr3 = ai.a.a;
                                            if (i11 < strArr3.length) {
                                                if (!str2.equals(strArr3[i11])) {
                                                    i11++;
                                                }
                                            }
                                        }
                                    }
                                    i11 = t1.H9;
                                    t1Var.N7 = i11;
                                    if (str != null) {
                                        if (t1Var.r != null) {
                                            t1Var.r = null;
                                            t1Var.s = 1.0f;
                                        }
                                        int i14 = 0;
                                        while (true) {
                                            String[] strArr4 = ai.a.a;
                                            if (i14 >= strArr4.length) {
                                                i14 = t1.H9;
                                            } else if (!str.equals(strArr4[i14])) {
                                                i14++;
                                            }
                                        }
                                        t1Var.n = t1.t(i14);
                                        rb.c cVar = t1Var.c;
                                        if (cVar != null) {
                                            ((z0) cVar.b).X();
                                        }
                                    }
                                    t1Var.invalidate();
                                }
                                f1Var = z0Var.e;
                                if (f1Var == null || f1Var.E) {
                                    return;
                                }
                                if (f1Var.y) {
                                    f1Var.i();
                                    return;
                                }
                                if (f1Var.x) {
                                    return;
                                }
                                TLRPC.ShareTheme shareTheme = f1Var.H;
                                if (!(shareTheme instanceof TLRPC.TL_shareThemeEmojiBackdrop) || (((TLRPC.TL_shareThemeEmojiBackdrop) shareTheme).flags & 1) == 0) {
                                    return;
                                }
                                f1Var.a(shareTheme);
                                return;
                            }
                        }
                        str2 = null;
                        if (ai.a.a(arrayList)) {
                        }
                        f1Var = z0Var.e;
                        if (f1Var == null) {
                            return;
                        } else {
                            return;
                        }
                    }
                }
                str = null;
                i10 = t1Var.N7;
                if (i10 >= 0) {
                }
                str2 = null;
                if (ai.a.a(arrayList)) {
                }
                f1Var = z0Var.e;
                if (f1Var == null) {
                }
                break;
            case 2:
                t1 t1Var2 = (t1) this.b;
                q1 q1Var = (q1) this.c;
                Bitmap bitmap = (Bitmap) this.d;
                if (q1Var.G || bitmap == null) {
                    return;
                }
                q1Var.D = bitmap;
                t1Var2.invalidate();
                return;
            case 3:
                androidx.lifecycle.o oVar = (androidx.lifecycle.o) this.b;
                androidx.car.app.utils.b bVar = (androidx.car.app.utils.b) this.c;
                String str4 = (String) this.d;
                if (oVar != null) {
                    try {
                        if (((androidx.lifecycle.v) oVar).c.compareTo(androidx.lifecycle.n.c) >= 0) {
                            bVar.a();
                            return;
                        }
                    } catch (w.f e) {
                        Log.e("CarApp.Dispatch", "Serialization failure in ".concat(str4), e);
                        return;
                    }
                }
                Log.w("CarApp.Dispatch", "Lifecycle is not at least created when dispatching " + bVar);
                return;
            case 4:
                IOnDoneCallback iOnDoneCallback = (IOnDoneCallback) this.b;
                String str5 = (String) this.c;
                try {
                    androidx.car.app.utils.h.d(str5.concat(" onSuccess"), new androidx.car.app.utils.a(iOnDoneCallback, ((androidx.car.app.utils.b) this.d).a(), str5, 0));
                    return;
                } catch (RuntimeException e10) {
                    androidx.car.app.utils.h.f(iOnDoneCallback, str5, e10);
                    throw new RuntimeException(e10);
                } catch (w.f e11) {
                    androidx.car.app.utils.h.f(iOnDoneCallback, str5, e11);
                    return;
                }
            case 5:
                l6.h hVar = (l6.h) this.b;
                i1 i1Var = (i1) this.c;
                ThreadPoolExecutor threadPoolExecutor = (ThreadPoolExecutor) this.d;
                try {
                    androidx.emoji2.text.r a2 = h1.a(hVar.a);
                    if (a2 == null) {
                        throw new RuntimeException("EmojiCompat font provider not available on this device.");
                    }
                    androidx.emoji2.text.q qVar = (androidx.emoji2.text.q) ((androidx.emoji2.text.k) a2.b);
                    synchronized (qVar.d) {
                        qVar.f = threadPoolExecutor;
                    }
                    ((androidx.emoji2.text.k) a2.b).a(new androidx.emoji2.text.m(i1Var, threadPoolExecutor));
                    return;
                } catch (Throwable th2) {
                    i1Var.a(th2);
                    threadPoolExecutor.shutdown();
                    return;
                }
            case 6:
                bi.y yVar = (bi.y) this.b;
                TLObject tLObject = (TLObject) this.c;
                Context context = (Context) this.d;
                if (tLObject instanceof TLRPC.TL_payments_starsRevenueAdsAccountUrl) {
                    qf.d.r(context, ((TLRPC.TL_payments_starsRevenueAdsAccountUrl) tLObject).url);
                }
                AndroidUtilities.runOnUIThread(new bi.d(yVar, 5), 1000L);
                return;
            case 7:
                h7 h7Var = (h7) this.b;
                Long l4 = (Long) this.c;
                h7Var.y2(l4.longValue(), new d3(h7Var, l4, (n1[]) this.d, 0 == true ? 1 : 0));
                return;
            case 8:
                h7 h7Var2 = (h7) this.b;
                qf.c cVar2 = (qf.c) this.c;
                TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) this.d;
                h7Var2.getClass();
                cVar2.c(false);
                tL_starGiftUnique.flags &= -17;
                tL_starGiftUnique.resale_ton_only = false;
                tL_starGiftUnique.resell_amount = null;
                h7Var2.f0.setResellPrice(bg.a.i(0L, bg.b.a));
                b2 b2Var = h7Var2.k1;
                if (b2Var != null) {
                    b2Var.run();
                }
                ic.a.s(R.string.Gift2ResaleDisable, new Object[]{h7Var2.W1()}, h7Var2.getBulletinFactory(), R.raw.contact_check, 36);
                return;
            case 9:
                h7 h7Var3 = (h7) this.b;
                qf.c cVar3 = (qf.c) this.c;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.d;
                h7Var3.getClass();
                cVar3.c(false);
                h7Var3.getBulletinFactory().g0(tL_error, false);
                return;
            case 10:
                h7.K0((h7) this.b, (TLObject) this.c, (MessageObject) this.d);
                return;
            case 11:
                Runnable runnable = (Runnable) this.b;
                qf.c cVar4 = (qf.c) this.c;
                TwoStepVerificationActivity twoStepVerificationActivity = (TwoStepVerificationActivity) this.d;
                runnable.run();
                cVar4.c(false);
                h7.D2(twoStepVerificationActivity);
                return;
            case 12:
                Runnable runnable2 = (Runnable) this.b;
                TLRPC.Document document3 = (TLRPC.Document) this.c;
                CharSequence charSequence = (CharSequence) this.d;
                r2 U = LaunchActivity.U();
                wc b02 = U != null ? wc.b0(U) : wc.Y();
                qc q5 = runnable2 == null ? document3 != null ? b02.q(document3, charSequence) : b02.R(R.raw.contact_check, 36, charSequence) : document3 != null ? b02.r(document3, charSequence, LocaleController.getString(R.string.Gift2UniqueView), runnable2) : b02.J(R.raw.contact_check, charSequence, LocaleController.getString(R.string.Gift2UniqueView), runnable2);
                q5.u = true;
                q5.j();
                return;
            case 13:
                h7.f1((h7) this.b, (e2) this.c, (MessageObject) this.d);
                return;
            case 14:
                h7.n1((h7) this.b, (TL_stars.TL_starGiftUnique) this.c, (String) this.d);
                return;
            case 15:
                TLObject tLObject2 = (TLObject) this.b;
                v0 v0Var = (v0) this.c;
                String str6 = (String) this.d;
                if (tLObject2 instanceof TL_stars.TL_payments_uniqueStarGift) {
                    TL_stars.StarGift starGift = ((TL_stars.TL_payments_uniqueStarGift) tLObject2).gift;
                    if (starGift instanceof TL_stars.TL_starGiftUnique) {
                        TL_stars.TL_starGiftUnique tL_starGiftUnique2 = (TL_stars.TL_starGiftUnique) starGift;
                        Long valueOf = Long.valueOf(tL_starGiftUnique2.gift_id);
                        String str7 = tL_starGiftUnique2.title;
                        if (str7 != null) {
                            str6 = str7;
                        }
                        v0Var.run(valueOf, str6);
                        return;
                    }
                }
                v0Var.run(0L, str6);
                return;
            case 16:
                TLObject tLObject3 = (TLObject) this.b;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) this.c;
                Utilities.Callback callback = (Utilities.Callback) this.d;
                if (tLObject3 instanceof TLRPC.TL_payments_paymentFormStarGift) {
                    callback.run((TLRPC.TL_payments_paymentFormStarGift) tLObject3);
                    return;
                } else {
                    ca.e(tL_error2 != null ? tL_error2.text : "NO_PAYMENT_FORM");
                    callback.run(null);
                    return;
                }
            case 17:
                ca caVar = (ca) this.b;
                TLObject tLObject4 = (TLObject) this.c;
                Runnable runnable3 = (Runnable) this.d;
                ArrayList arrayList2 = caVar.v;
                boolean[] zArr = caVar.r;
                ArrayList[] arrayListArr = caVar.q;
                int i15 = caVar.a;
                boolean z16 = !caVar.e;
                caVar.c = System.currentTimeMillis();
                if (tLObject4 instanceof TL_stars.StarsStatus) {
                    TL_stars.StarsStatus starsStatus = (TL_stars.StarsStatus) tLObject4;
                    MessagesController.getInstance(i15).putUsers(starsStatus.users, false);
                    MessagesController.getInstance(i15).putChats(starsStatus.chats, false);
                    if (arrayListArr[0].isEmpty()) {
                        ArrayList<TL_stars.StarsTransaction> arrayList3 = starsStatus.history;
                        int size = arrayList3.size();
                        int i16 = 0;
                        while (i16 < size) {
                            TL_stars.StarsTransaction starsTransaction = arrayList3.get(i16);
                            i16++;
                            TL_stars.StarsTransaction starsTransaction2 = starsTransaction;
                            boolean z17 = z15;
                            arrayListArr[r10].add(starsTransaction2);
                            boolean z18 = r10;
                            ArrayList[] arrayListArr2 = arrayListArr;
                            arrayListArr2[starsTransaction2.amount.amount > 0 ? z17 : 2].add(starsTransaction2);
                            z15 = z17;
                            r10 = z18 ? 1 : 0;
                            arrayListArr = arrayListArr2;
                        }
                        z10 = z15;
                        z13 = r10;
                        ArrayList[] arrayListArr3 = arrayListArr;
                        for (?? r42 = z13; r42 < 3; r42++) {
                            zArr[r42] = (!arrayListArr3[r42].isEmpty() || zArr[r42]) ? z10 : z13;
                            boolean[] zArr2 = caVar.u;
                            boolean z19 = (starsStatus.flags & 1) == 0 ? z10 : z13;
                            zArr2[r42] = z19;
                            if (z19) {
                                caVar.t[r42] = z13;
                            }
                            caVar.s[r42] = zArr2[r42] ? null : starsStatus.next_offset;
                        }
                        z14 = z10;
                    } else {
                        z10 = true;
                        z13 = false;
                        z14 = false;
                    }
                    if (arrayList2.isEmpty()) {
                        arrayList2.addAll(starsStatus.subscriptions);
                        caVar.x = z13;
                        caVar.w = starsStatus.subscriptions_next_offset;
                        caVar.y = (starsStatus.flags & 4) == 0 ? z10 : false;
                        z11 = z10;
                    } else {
                        z11 = false;
                    }
                    long j10 = caVar.f.amount;
                    TL_stars.StarsAmount starsAmount = starsStatus.balance;
                    if (j10 != starsAmount.amount) {
                        z16 = z10;
                    }
                    caVar.f = starsAmount;
                    caVar.g = 0L;
                    z12 = z14;
                } else {
                    z10 = true;
                    z11 = false;
                    z12 = false;
                }
                caVar.d = false;
                caVar.e = z10;
                if (z16) {
                    NotificationCenter.getInstance(i15).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starBalanceUpdated, new Object[0]);
                }
                if (z12) {
                    NotificationCenter.getInstance(i15).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starTransactionsLoaded, new Object[0]);
                }
                if (z11) {
                    NotificationCenter.getInstance(i15).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starSubscriptionsLoaded, new Object[0]);
                }
                if (runnable3 != null) {
                    runnable3.run();
                    return;
                }
                return;
            case 18:
                ca caVar2 = (ca) this.b;
                HashSet hashSet = (HashSet) this.c;
                Runnable runnable4 = (Runnable) this.d;
                caVar2.getClass();
                Iterator it = hashSet.iterator();
                while (it.hasNext()) {
                    Integer num = (Integer) it.next();
                    num.intValue();
                    caVar2.Q.remove(num);
                    caVar2.R.remove(num);
                }
                runnable4.run();
                return;
            case 19:
                boolean[] zArr3 = (boolean[]) this.b;
                EditTextBoldCursor editTextBoldCursor = (EditTextBoldCursor) this.c;
                k3[] k3VarArr = (k3[]) this.d;
                zArr3[0] = false;
                AndroidUtilities.hideKeyboard(editTextBoldCursor);
                k3VarArr[0].dismiss();
                return;
            case 20:
                com.google.firebase.messaging.g gVar = (com.google.firebase.messaging.g) this.b;
                Intent intent = (Intent) this.c;
                TaskCompletionSource taskCompletionSource = (TaskCompletionSource) this.d;
                gVar.getClass();
                try {
                    gVar.handleIntent(intent);
                    return;
                } finally {
                    taskCompletionSource.setResult(false);
                }
            case 21:
                p3 p3Var = (p3) this.b;
                x0 x0Var = (x0) this.c;
                View view = (View) this.d;
                q4 q4Var = p3Var.a;
                q4Var.j3 = true;
                o4 o4Var = q4Var.D1;
                ImageReceiver imageReceiver = q4Var.a3;
                boolean[] zArr4 = {false};
                m7 m7Var = q4Var.t0;
                m7Var.animate().alpha(0.0f).scaleX(0.8f).scaleY(0.8f).setListener(new di.r2(true ? 1 : 0, m7Var)).setDuration(150L).start();
                int dp = AndroidUtilities.dp(8.0f);
                m7 m7Var2 = new m7(q4Var.getContext(), q4Var.m1);
                q4Var.t0 = m7Var2;
                m7Var2.setPadding(dp, dp, dp, dp);
                q4Var.s0.addView(q4Var.t0, gb1.i(40, 40, 3));
                t5 t5Var2 = q4Var.d3;
                if (t5Var2 != null) {
                    t5Var2.o(q4Var);
                    eVar = null;
                    q4Var.d3 = null;
                } else {
                    eVar = null;
                }
                bh.e eVar3 = q4Var.b3;
                if (eVar3 != null) {
                    eVar3.d(q4Var);
                    q4Var.b3 = eVar;
                }
                q4Var.e3 = false;
                if (x0Var.g != 0) {
                    q4Var.e3 = true;
                    t5 t5Var3 = new t5(2, q4Var.r2, x0Var.g);
                    q4Var.d3 = t5Var3;
                    t5Var3.a(q4Var);
                } else if (x0Var.f != null && (tL_availableReaction = MediaDataController.getInstance(q4Var.r2).getReactionsMap().get(x0Var.f)) != null) {
                    q4Var.c3.setImage(null, null, ImageLocation.getForDocument(tL_availableReaction.select_animation), "60_60", null, null, null, 0L, null, null, 0);
                    imageReceiver.setImage(ImageLocation.getForDocument(tL_availableReaction.around_animation), s0.a(), null, null, null, 0);
                    if (imageReceiver.getLottieAnimation() != null) {
                        imageReceiver.getLottieAnimation().N(0, false, true);
                    }
                }
                q4Var.t0.setReaction(x0Var);
                if (q4Var.s1) {
                    TL_stories.StoryItem storyItem3 = o4Var.a;
                    if (storyItem3.sent_reaction == null) {
                        if (storyItem3.views == null) {
                            storyItem3.views = new TL_stories.TL_storyViews();
                        }
                        TL_stories.StoryItem storyItem4 = o4Var.a;
                        TL_stories.StoryViews storyViews = storyItem4.views;
                        storyViews.reactions_count++;
                        a1.b(null, storyItem4.sent_reaction, storyViews);
                        q4Var.i1(true);
                    }
                }
                if (x0Var.g != 0 && (t5Var = q4Var.t0.f) != null) {
                    bh.e a10 = bh.e.a(t5Var, false, true);
                    q4Var.b3 = a10;
                    a10.f(q4Var);
                }
                q4Var.H1.g0(q4Var.q1, o4Var.a, x0Var);
                int[] iArr = new int[2];
                view.getLocationInWindow(iArr);
                int[] iArr2 = new int[2];
                q4Var.getLocationInWindow(iArr2);
                q4Var.l3 = iArr[0] - iArr2[0];
                q4Var.m3 = iArr[1] - iArr2[1];
                q4Var.n3 = view.getMeasuredHeight();
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                q4Var.k3 = 0.0f;
                q4Var.invalidate();
                m7 m7Var3 = q4Var.t0;
                m7Var3.setAllowDrawReaction(false);
                ImageReceiver imageReceiver2 = m7Var3.e;
                if (x0Var.g == 0 && (tL_availableReaction2 = MediaDataController.getInstance(UserConfig.selectedAccount).getReactionsMap().get(x0Var.f)) != null) {
                    imageReceiver2.setImage(ImageLocation.getForDocument(tL_availableReaction2.center_icon), "40_40_nolimit", null, "tgs", tL_availableReaction2, 1);
                    imageReceiver2.setAutoRepeat(0);
                }
                ofFloat.addUpdateListener(new n3(p3Var, ofFloat, zArr4, 0 == true ? 1 : 0));
                ofFloat.addListener(new o3(p3Var, zArr4, m7Var3, 0 == true ? 1 : 0));
                ofFloat.setDuration(220L);
                ofFloat.start();
                q4Var.Z0(false);
                return;
            case 22:
                h4 h4Var = (h4) this.b;
                u6 u6Var = (u6) this.c;
                TL_stories.StoryItem storyItem5 = (TL_stories.StoryItem) this.d;
                q4 q4Var2 = h4Var.l;
                g5.R(q4Var2.getContext(), null, u6Var, new androidx.car.app.utils.a(h4Var, storyItem5, u6Var, i13));
                h4 h4Var2 = q4Var2.i1;
                if (h4Var2 != null) {
                    h4Var2.a();
                    return;
                }
                return;
            case 23:
                s6 s6Var = (s6) this.b;
                TL_stories.StoryItem storyItem6 = (TL_stories.StoryItem) this.c;
                Utilities.Callback callback2 = (Utilities.Callback) this.d;
                for (int i17 = 0; i17 < s6Var.i.size(); i17++) {
                    MessageObject messageObject2 = (MessageObject) s6Var.i.get(i17);
                    if (messageObject2 != null && (storyItem = messageObject2.storyItem) != null && (messageMedia = storyItem.media) != null && (document = storyItem6.media.document) != null && (document2 = messageMedia.document) != null && document2.id == document.id) {
                        callback2.run(document2);
                        return;
                    }
                }
                callback2.run(null);
                return;
            case 24:
                di.h7 h7Var4 = (di.h7) this.b;
                TLObject tLObject5 = (TLObject) this.c;
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) this.d;
                int i18 = h7Var4.a;
                h7Var4.R = true;
                if (tLObject5 instanceof TLRPC.TL_boolTrue) {
                    h7Var4.S = null;
                    NotificationCenter.getInstance(i18).lambda$postNotificationNameOnUIThread$1(NotificationCenter.storiesLimitUpdate, new Object[0]);
                    return;
                } else if (!(tLObject5 instanceof TL_stories.canSendStoryCount)) {
                    h7Var4.n(tL_error3);
                    return;
                } else {
                    h7Var4.S = new b7(1, ((TL_stories.canSendStoryCount) tLObject5).count_remains, -1L);
                    NotificationCenter.getInstance(i18).lambda$postNotificationNameOnUIThread$1(NotificationCenter.storiesLimitUpdate, new Object[0]);
                    return;
                }
            case 25:
                s6 s6Var2 = (s6) this.b;
                r6 r6Var = (r6) this.c;
                l2 l2Var = (l2) this.d;
                ArrayList arrayList4 = s6Var2.i;
                for (int i19 = 0; i19 < arrayList4.size(); i19++) {
                    MessageObject messageObject3 = (MessageObject) arrayList4.get(i19);
                    if (messageObject3 != null && (storyItem2 = messageObject3.storyItem) != null && (messageMedia2 = storyItem2.media) != null) {
                        TLRPC.MessageMedia messageMedia3 = r6Var.media;
                        TLRPC.Document document4 = messageMedia3.document;
                        if (document4 != null) {
                            TLRPC.Document document5 = messageMedia2.document;
                            if (document5 == null) {
                                continue;
                            } else if (document5.id == document4.id) {
                                l2Var.run((r6) storyItem2);
                                return;
                            }
                        }
                        TLRPC.Photo photo2 = messageMedia3.photo;
                        if (photo2 != null && (photo = messageMedia2.photo) != null && photo.id == photo2.id) {
                            l2Var.run((r6) storyItem2);
                            return;
                        }
                    }
                }
                l2Var.run(null);
                return;
            case 26:
                s6 s6Var3 = (s6) this.b;
                TLObject tLObject6 = (TLObject) this.c;
                Runnable runnable5 = (Runnable) this.d;
                w6 w6Var = s6Var3.q;
                ArrayList arrayList5 = s6Var3.G;
                ArrayList arrayList6 = s6Var3.i;
                ArrayList arrayList7 = s6Var3.H;
                s6Var3.F = 0;
                s6Var3.C = false;
                s6Var3.D = true;
                s6Var3.r = true;
                ArrayList arrayList8 = new ArrayList();
                if (tLObject6 instanceof Vector) {
                    ArrayList arrayList9 = ((Vector) tLObject6).objects;
                    int size2 = arrayList9.size();
                    int i20 = 0;
                    while (i20 < size2) {
                        Object obj = arrayList9.get(i20);
                        i20++;
                        arrayList8.add((TL_bots.botPreviewMedia) obj);
                    }
                } else {
                    if (!(tLObject6 instanceof TL_bots.previewInfo)) {
                        return;
                    }
                    TL_bots.previewInfo previewinfo = (TL_bots.previewInfo) tLObject6;
                    arrayList5.clear();
                    arrayList5.addAll(previewinfo.lang_codes);
                    arrayList8.addAll(previewinfo.media);
                }
                ArrayList arrayList10 = new ArrayList(arrayList6);
                arrayList6.clear();
                arrayList7.clear();
                int size3 = arrayList8.size();
                int i21 = 0;
                while (i21 < size3) {
                    Object obj2 = arrayList8.get(i21);
                    i21++;
                    TL_bots.botPreviewMedia botpreviewmedia = (TL_bots.botPreviewMedia) obj2;
                    ArrayList arrayList11 = arrayList8;
                    MessageObject messageObject4 = new MessageObject(s6Var3.c, new r6(s6Var3, s6Var3.d, botpreviewmedia));
                    int i22 = 0;
                    while (true) {
                        if (i22 >= arrayList10.size()) {
                            messageObject = null;
                        } else if (MessagesController.equals(((MessageObject) arrayList10.get(i22)).storyItem.media, botpreviewmedia.media)) {
                            messageObject = (MessageObject) arrayList10.get(i22);
                        } else {
                            i22++;
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
                    if (arrayList7.isEmpty()) {
                        arrayList7.add(new ArrayList());
                    }
                    ((ArrayList) arrayList7.get(0)).add(Integer.valueOf(messageObject4.getId()));
                    arrayList6.add(messageObject4);
                    arrayList8 = arrayList11;
                }
                AndroidUtilities.cancelRunOnUIThread(w6Var);
                AndroidUtilities.runOnUIThread(w6Var);
                if (runnable5 != null) {
                    AndroidUtilities.runOnUIThread(runnable5);
                    return;
                }
                return;
            case 27:
                p9 p9Var = (p9) this.b;
                z6 z6Var = (z6) this.c;
                ArrayList arrayList12 = (ArrayList) this.d;
                y9 y9Var = p9Var.d;
                y9Var.n0.D(y9Var.h, z6Var.d, arrayList12);
                return;
            case 28:
                ha haVar = (ha) this.b;
                TLObject tLObject7 = (TLObject) this.c;
                TL_stories.TL_stories_getStoriesViews tL_stories_getStoriesViews = (TL_stories.TL_stories_getStoriesViews) this.d;
                s8 s8Var = haVar.f;
                int i23 = haVar.b;
                ha.g = System.currentTimeMillis();
                if (tLObject7 != null) {
                    TL_stories.TL_stories_storyViews tL_stories_storyViews = (TL_stories.TL_stories_storyViews) tLObject7;
                    MessagesController.getInstance(i23).putUsers(tL_stories_storyViews.users, false);
                    if (!haVar.d(tL_stories_getStoriesViews.id, tL_stories_storyViews)) {
                        haVar.d = 0;
                        haVar.e = false;
                        return;
                    }
                    NotificationCenter.getInstance(i23).lambda$postNotificationNameOnUIThread$1(NotificationCenter.storiesUpdated, new Object[0]);
                }
                haVar.d = 0;
                if (haVar.e) {
                    AndroidUtilities.cancelRunOnUIThread(s8Var);
                    AndroidUtilities.runOnUIThread(s8Var, 10000L);
                    return;
                }
                return;
            default:
                k9.y yVar2 = (k9.y) this.b;
                k9.e0 e0Var = (k9.e0) this.c;
                try {
                    try {
                        e0Var.o(((k9.q) this.d).apply(qd.a(yVar2)));
                        return;
                    } catch (Throwable th3) {
                        e0Var.n(th3);
                        return;
                    }
                } catch (Error e12) {
                    e = e12;
                    e0Var.n(e);
                    return;
                } catch (CancellationException unused) {
                    e0Var.cancel(false);
                    return;
                } catch (RuntimeException e13) {
                    e = e13;
                    e0Var.n(e);
                    return;
                } catch (ExecutionException e14) {
                    e = e14;
                    Throwable cause = e.getCause();
                    if (cause != null) {
                        e = cause;
                    }
                    e0Var.n(e);
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
