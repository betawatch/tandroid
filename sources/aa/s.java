package aa;

import a8.s6;
import a8.t6;
import ai.i1;
import ai.j1;
import ai.l1;
import ai.s0;
import ai.y0;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.drawable.ShapeDrawable;
import android.text.SpannableStringBuilder;
import android.util.Log;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TableRow;
import android.widget.TextView;
import androidx.car.app.IOnDoneCallback;
import bi.b3;
import bi.ea;
import bi.k7;
import bi.v0;
import c8.ha;
import ch.k0;
import ch.o0;
import ch.q0;
import com.google.android.gms.tasks.TaskCompletionSource;
import d3.h0;
import di.d7;
import di.g3;
import di.g4;
import di.g9;
import di.h3;
import di.i3;
import di.i4;
import di.i6;
import di.j6;
import di.l2;
import di.n6;
import di.p9;
import di.q6;
import di.s7;
import di.y6;
import di.y9;
import di.z3;
import h2.m0;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ThreadPoolExecutor;
import l2.i0;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.c20;
import org.telegram.messenger.d3;
import org.telegram.messenger.hd;
import org.telegram.messenger.ij;
import org.telegram.messenger.p10;
import org.telegram.messenger.qp;
import org.telegram.messenger.qs;
import org.telegram.messenger.t0;
import org.telegram.messenger.ui;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.Vector;
import org.telegram.tgnet.tl.TL_bots;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.f2;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.u1;
import org.telegram.ui.ActionBar.v2;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.cc;
import org.telegram.ui.Components.hc;
import org.telegram.ui.Components.i5;
import org.telegram.ui.Components.qx0;
import org.telegram.ui.Components.tx0;
import org.telegram.ui.Components.v4;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.TwoStepVerificationActivity;
import wg.f1;
import zh.q1;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes.dex */
public final /* synthetic */ class s implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ s(Object obj, Object obj2, Object obj3, int i7) {
        this.a = i7;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:394:0x08dc  */
    /* JADX WARN: Removed duplicated region for block: B:399:0x08ec  */
    /* JADX WARN: Removed duplicated region for block: B:409:0x0906  */
    /* JADX WARN: Removed duplicated region for block: B:429:0x093d  */
    /* JADX WARN: Removed duplicated region for block: B:447:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r10v25 */
    /* JADX WARN: Type inference failed for: r10v26, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r10v27 */
    /* JADX WARN: Type inference failed for: r17v8 */
    /* JADX WARN: Type inference failed for: r3v56, types: [org.telegram.messenger.c20] */
    /* JADX WARN: Type inference failed for: r4v64, types: [android.view.View, di.i4] */
    /* JADX WARN: Type inference failed for: r5v34, types: [org.telegram.ui.Components.i5] */
    /* JADX WARN: Type inference failed for: r5v61, types: [ch.d] */
    /* JADX WARN: Type inference failed for: r5v65, types: [org.telegram.ui.Components.i5] */
    /* JADX WARN: Type inference failed for: r6v31, types: [ch.d] */
    /* JADX WARN: Type inference failed for: r6v38, types: [org.telegram.messenger.ImageReceiver] */
    /* JADX WARN: Type inference failed for: r8v10 */
    /* JADX WARN: Type inference failed for: r8v13 */
    /* JADX WARN: Type inference failed for: r8v9 */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        l1 l1Var;
        String str;
        int i7;
        String str2;
        y0 y0Var;
        int i10;
        int i11;
        TLRPC.Message message;
        boolean z9;
        int i12;
        boolean z10;
        boolean z11;
        boolean z12;
        ch.d dVar;
        TLRPC.TL_availableReaction tL_availableReaction;
        ?? r10;
        TLRPC.TL_availableReaction tL_availableReaction2;
        i5 i5Var;
        TL_stories.StoryItem storyItem;
        TLRPC.MessageMedia messageMedia;
        TLRPC.Document document;
        TLRPC.Document document2;
        TL_stories.StoryItem storyItem2;
        TLRPC.MessageMedia messageMedia2;
        TLRPC.Photo photo;
        ij ijVar;
        int f12;
        int i13 = 6;
        boolean z13 = true;
        switch (this.a) {
            case 0:
                u uVar = (u) this.b;
                String str3 = (String) this.c;
                String str4 = (String) this.d;
                q qVar = uVar.f;
                qVar.getClass();
                try {
                    ((ab.q) qVar.d.d).z(str3, str4);
                    return;
                } catch (IllegalArgumentException e10) {
                    Context context = qVar.a;
                    if (context != null && (context.getApplicationInfo().flags & 2) != 0) {
                        throw e10;
                    }
                    Log.e("FirebaseCrashlytics", "Attempting to set custom attribute with null key, ignoring.", null);
                    return;
                }
            case 1:
                ab.h hVar = (ab.h) this.b;
                Intent intent = (Intent) this.c;
                TaskCompletionSource taskCompletionSource = (TaskCompletionSource) this.d;
                try {
                    hVar.b(intent);
                    return;
                } finally {
                    taskCompletionSource.setResult(false);
                }
            case 2:
                s0 s0Var = (s0) this.b;
                ai.f fVar = (ai.f) this.c;
                List list = (List) this.d;
                TLRPC.TL_shareThemeBackdrops tL_shareThemeBackdrops = fVar.b;
                ArrayList<TLRPC.TL_shareThemeBackdropOption> arrayList = tL_shareThemeBackdrops != null ? tL_shareThemeBackdrops.backdrops : null;
                if (arrayList == null || arrayList == list || (l1Var = s0Var.d) == null || s0Var.isFinished) {
                    return;
                }
                j1 j1Var = l1Var.n;
                if (j1Var != null && j1Var.a == 0 && (i11 = j1Var.f) >= 0) {
                    String[] strArr = ai.a.a;
                    if (i11 < strArr.length) {
                        str = strArr[i11];
                        i7 = l1Var.M7;
                        if (i7 >= 0) {
                            String[] strArr2 = ai.a.a;
                            if (i7 < strArr2.length) {
                                str2 = strArr2[i7];
                                if (ai.a.a(arrayList)) {
                                    if (str2 != null) {
                                        i10 = 0;
                                        while (true) {
                                            String[] strArr3 = ai.a.a;
                                            if (i10 < strArr3.length) {
                                                if (!str2.equals(strArr3[i10])) {
                                                    i10++;
                                                }
                                            }
                                        }
                                        l1Var.M7 = i10;
                                        if (str != null) {
                                            if (l1Var.r != null) {
                                                l1Var.r = null;
                                                l1Var.s = 1.0f;
                                            }
                                            int i14 = 0;
                                            while (true) {
                                                String[] strArr4 = ai.a.a;
                                                if (i14 >= strArr4.length) {
                                                    i14 = l1.G9;
                                                } else if (!str.equals(strArr4[i14])) {
                                                    i14++;
                                                }
                                            }
                                            l1Var.n = l1.t(i14);
                                            cb.c cVar = l1Var.c;
                                            if (cVar != null) {
                                                ((s0) cVar.b).b0();
                                            }
                                        }
                                        l1Var.invalidate();
                                    }
                                    i10 = l1.G9;
                                    l1Var.M7 = i10;
                                    if (str != null) {
                                    }
                                    l1Var.invalidate();
                                }
                                y0Var = s0Var.e;
                                if (y0Var == null || y0Var.E) {
                                    return;
                                }
                                if (y0Var.D) {
                                    y0Var.j();
                                    return;
                                }
                                if (y0Var.y) {
                                    return;
                                }
                                TLRPC.ShareTheme shareTheme = y0Var.H;
                                if (!(shareTheme instanceof TLRPC.TL_shareThemeEmojiBackdrop) || (((TLRPC.TL_shareThemeEmojiBackdrop) shareTheme).flags & 1) == 0) {
                                    return;
                                }
                                y0Var.a(shareTheme);
                                return;
                            }
                        }
                        str2 = null;
                        if (ai.a.a(arrayList)) {
                        }
                        y0Var = s0Var.e;
                        if (y0Var == null) {
                            return;
                        } else {
                            return;
                        }
                    }
                }
                str = null;
                i7 = l1Var.M7;
                if (i7 >= 0) {
                }
                str2 = null;
                if (ai.a.a(arrayList)) {
                }
                y0Var = s0Var.e;
                if (y0Var == null) {
                }
                break;
            case 3:
                l1 l1Var2 = (l1) this.b;
                i1 i1Var = (i1) this.c;
                Bitmap bitmap = (Bitmap) this.d;
                if (i1Var.G || bitmap == null) {
                    return;
                }
                i1Var.D = bitmap;
                l1Var2.invalidate();
                return;
            case 4:
                androidx.lifecycle.o oVar = (androidx.lifecycle.o) this.b;
                androidx.car.app.utils.a aVar = (androidx.car.app.utils.a) this.d;
                String str5 = (String) this.c;
                if (oVar != null) {
                    try {
                        if (((androidx.lifecycle.v) oVar).c.compareTo(androidx.lifecycle.n.c) >= 0) {
                            aVar.a();
                            return;
                        }
                    } catch (w.f e11) {
                        Log.e("CarApp.Dispatch", "Serialization failure in ".concat(str5), e11);
                        return;
                    }
                }
                Log.w("CarApp.Dispatch", "Lifecycle is not at least created when dispatching " + aVar);
                return;
            case 5:
                IOnDoneCallback iOnDoneCallback = (IOnDoneCallback) this.b;
                String str6 = (String) this.c;
                try {
                    androidx.car.app.utils.g.d(str6.concat(" onSuccess"), new a3.h((Object) iOnDoneCallback, ((androidx.car.app.utils.a) this.d).a(), str6, 2));
                    return;
                } catch (RuntimeException e12) {
                    androidx.car.app.utils.g.f(iOnDoneCallback, str6, e12);
                    throw new RuntimeException(e12);
                } catch (w.f e13) {
                    androidx.car.app.utils.g.f(iOnDoneCallback, str6, e13);
                    return;
                }
            case 6:
                cb.c cVar2 = (cb.c) this.b;
                t6 t6Var = (t6) this.c;
                ThreadPoolExecutor threadPoolExecutor = (ThreadPoolExecutor) this.d;
                try {
                    androidx.emoji2.text.r a10 = s6.a((Context) cVar2.b);
                    if (a10 == null) {
                        throw new RuntimeException("EmojiCompat font provider not available on this device.");
                    }
                    androidx.emoji2.text.q qVar2 = (androidx.emoji2.text.q) ((androidx.emoji2.text.k) a10.b);
                    synchronized (qVar2.d) {
                        qVar2.f = threadPoolExecutor;
                    }
                    ((androidx.emoji2.text.k) a10.b).b(new androidx.emoji2.text.m(t6Var, threadPoolExecutor));
                    return;
                } catch (Throwable th2) {
                    t6Var.a(th2);
                    threadPoolExecutor.shutdown();
                    return;
                }
            case 7:
                bi.z zVar = (bi.z) this.b;
                TLObject tLObject = (TLObject) this.c;
                Context context2 = (Context) this.d;
                if (tLObject instanceof TLRPC.TL_payments_starsRevenueAdsAccountUrl) {
                    vf.c.t(context2, ((TLRPC.TL_payments_starsRevenueAdsAccountUrl) tLObject).url);
                }
                org.telegram.messenger.g0.i3(new bi.d(zVar, i13), 1000L);
                return;
            case 8:
                k7 k7Var = (k7) this.b;
                Long l10 = (Long) this.c;
                k7Var.Y1(l10.longValue(), new b3(k7Var, l10, (f1[]) this.d, 0));
                return;
            case 9:
                k7 k7Var2 = (k7) this.b;
                vf.b bVar = (vf.b) this.c;
                TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) this.d;
                bVar.c(false);
                tL_starGiftUnique.flags &= -17;
                tL_starGiftUnique.resale_ton_only = false;
                tL_starGiftUnique.resell_amount = null;
                k7Var2.X1.setResellPrice(cg.a.i(0L, cg.b.a));
                q1 q1Var = k7Var2.c3;
                if (q1Var != null) {
                    q1Var.run();
                }
                k7Var2.k().Q(R.raw.contact_check, 36, hd.a0(null, null, 2131750028, k7Var2.z1())).j();
                return;
            case 10:
                k7 k7Var3 = (k7) this.b;
                vf.b bVar2 = (vf.b) this.c;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.d;
                bVar2.c(false);
                k7Var3.k().f0(tL_error, false);
                return;
            case 11:
                k7 k7Var4 = (k7) this.b;
                TLObject tLObject2 = (TLObject) this.c;
                ij ijVar2 = (ij) this.d;
                TLRPC.messages_Messages messages_messages = (TLRPC.messages_Messages) tLObject2;
                qp.s1(k7Var4.a).Y3(messages_messages.users, false);
                qp.s1(k7Var4.a).S3(messages_messages.chats, false);
                k7Var4.E2 = true;
                k7Var4.D2 = false;
                Boolean bool = k7Var4.e3;
                if (bool != null && (message = ijVar2.k) != null) {
                    TLRPC.MessageAction messageAction = message.action;
                    if (messageAction instanceof TLRPC.TL_messageActionStarGift) {
                        ((TLRPC.TL_messageActionStarGift) messageAction).saved = true ^ bool.booleanValue();
                    } else if (messageAction instanceof TLRPC.TL_messageActionStarGiftUnique) {
                        ((TLRPC.TL_messageActionStarGiftUnique) messageAction).saved = true ^ bool.booleanValue();
                    }
                }
                k7Var4.i2(ijVar2, null);
                return;
            case 12:
                Runnable runnable = (Runnable) this.b;
                vf.b bVar3 = (vf.b) this.c;
                TwoStepVerificationActivity twoStepVerificationActivity = (TwoStepVerificationActivity) this.d;
                runnable.run();
                bVar3.c(false);
                k7.c2(twoStepVerificationActivity);
                return;
            case 13:
                Runnable runnable2 = (Runnable) this.b;
                TLRPC.Document document3 = (TLRPC.Document) this.c;
                CharSequence charSequence = (CharSequence) this.d;
                f2 T = LaunchActivity.T();
                hc a02 = T != null ? hc.a0(T) : hc.X();
                cc q10 = runnable2 == null ? document3 != null ? a02.q(document3, charSequence) : a02.Q(R.raw.contact_check, 36, charSequence) : document3 != null ? a02.r(document3, charSequence, hd.M0(2131749887, null), runnable2) : a02.K(R.raw.contact_check, charSequence, hd.M0(2131749887, null), runnable2);
                q10.t = true;
                q10.j();
                return;
            case 14:
                k7.h1((k7) this.b, (u1) this.c, (ij) this.d);
                return;
            case 15:
                final k7 k7Var5 = (k7) this.b;
                TL_stars.TL_starGiftUnique tL_starGiftUnique2 = (TL_stars.TL_starGiftUnique) this.d;
                final String str7 = (String) this.c;
                final long j3 = tL_starGiftUnique2.gift_id;
                final String str8 = tL_starGiftUnique2.title;
                final String z14 = k7Var5.z1();
                final TLRPC.Document document4 = tL_starGiftUnique2.getDocument();
                String str9 = tL_starGiftUnique2.slug;
                final u1 u1Var = new u1(3, t0.b, null);
                u1Var.r(500L);
                TL_stars.getUniqueStarGiftValueInfo getuniquestargiftvalueinfo = new TL_stars.getUniqueStarGiftValueInfo();
                getuniquestargiftvalueinfo.slug = str9;
                ConnectionsManager.getInstance(k7Var5.a).sendRequest(getuniquestargiftvalueinfo, new RequestDelegate() { // from class: bi.p2
                    @Override // org.telegram.tgnet.RequestDelegate
                    public final void run(final TLObject tLObject3, final TLRPC.TL_error tL_error2) {
                        final k7 k7Var6 = k7.this;
                        final org.telegram.ui.ActionBar.u1 u1Var2 = u1Var;
                        final TLRPC.Document document5 = document4;
                        final String str10 = str7;
                        final String str11 = str8;
                        final String str12 = z14;
                        final long j10 = j3;
                        org.telegram.messenger.g0.h3(new Runnable() { // from class: bi.l3
                            /* JADX WARN: Removed duplicated region for block: B:14:0x021c  */
                            /* JADX WARN: Removed duplicated region for block: B:17:0x0271  */
                            /* JADX WARN: Removed duplicated region for block: B:20:0x02d3  */
                            /* JADX WARN: Removed duplicated region for block: B:23:0x0374  */
                            /* JADX WARN: Removed duplicated region for block: B:27:0x0365  */
                            /* JADX WARN: Removed duplicated region for block: B:28:0x0263  */
                            @Override // java.lang.Runnable
                            /*
                                Code decompiled incorrectly, please refer to instructions dump.
                            */
                            public final void run() {
                                tx0 tx0Var;
                                TLRPC.Document document6;
                                String str13;
                                tx0 tx0Var2;
                                t0 t0Var;
                                String str14;
                                CharSequence charSequence2;
                                CharSequence charSequence3;
                                k7 k7Var7;
                                float f10;
                                float f11;
                                boolean z15;
                                u1Var2.dismiss();
                                TLObject tLObject4 = tLObject3;
                                boolean z16 = tLObject4 instanceof TL_stars.UniqueStarGiftValueInfo;
                                k7 k7Var8 = k7.this;
                                if (!z16) {
                                    TLRPC.TL_error tL_error3 = tL_error2;
                                    if (tL_error3 != null) {
                                        k7Var8.k().f0(tL_error3, false);
                                        return;
                                    }
                                    return;
                                }
                                TL_stars.UniqueStarGiftValueInfo uniqueStarGiftValueInfo = (TL_stars.UniqueStarGiftValueInfo) tLObject4;
                                int i15 = 1;
                                org.telegram.ui.ActionBar.v2 l11 = org.telegram.messenger.k5.l(1, k7Var8.getContext(), k7Var8.I0, false);
                                LinearLayout linearLayout = new LinearLayout(k7Var8.getContext());
                                linearLayout.setOrientation(1);
                                linearLayout.setPadding(org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(20.0f), org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(8.0f));
                                linearLayout.setClipChildren(false);
                                linearLayout.setClipToPadding(false);
                                org.telegram.ui.Components.l9 l9Var = new org.telegram.ui.Components.l9(k7Var8.getContext());
                                ImageReceiver imageReceiver = l9Var.getImageReceiver();
                                TLRPC.Document document7 = document5;
                                dd.c1(imageReceiver, document7, qs.q2);
                                linearLayout.addView(l9Var, c8.ha.t(qs.q2, qs.q2, 1, 0, 0, 0, 0));
                                TextView textView = new TextView(k7Var8.getContext());
                                textView.setTextSize(1, 20.0f);
                                org.telegram.ui.ActionBar.r6.V(textView, org.telegram.ui.ActionBar.k6.Gi, k7Var8.I0);
                                textView.setTypeface(org.telegram.messenger.g0.o());
                                textView.setPadding(org.telegram.messenger.g0.L(20.0f), 0, org.telegram.messenger.g0.L(20.0f), 0);
                                int L = org.telegram.messenger.g0.L(21.0f);
                                int i16 = org.telegram.ui.ActionBar.k6.Ci;
                                ShapeDrawable d02 = org.telegram.ui.ActionBar.k6.d0(L, org.telegram.ui.ActionBar.k6.w0(i16, k7Var8.I0));
                                org.telegram.ui.ActionBar.n6 N = org.telegram.ui.ActionBar.r6.N(i16);
                                org.telegram.ui.ActionBar.f6 f6Var = k7Var8.I0;
                                textView.setBackground(d02);
                                org.telegram.ui.ActionBar.r6.k(textView, d02, N, null, f6Var);
                                textView.setGravity(17);
                                linearLayout.addView(textView, c8.ha.t(-2, 42, 1, 0, 12, 0, 15));
                                textView.setText(str10);
                                TextView textView2 = new TextView(k7Var8.getContext());
                                textView2.setTextSize(1, 14.0f);
                                org.telegram.ui.ActionBar.r6.V(textView2, org.telegram.ui.ActionBar.k6.j5, k7Var8.I0);
                                textView2.setGravity(17);
                                linearLayout.addView(textView2, c8.ha.t(-2, -2, 1, 16, 0, 16, 19));
                                boolean z17 = uniqueStarGiftValueInfo.value_is_average;
                                String str15 = str11;
                                if (z17) {
                                    org.telegram.messenger.k5.r(null, null, 2131749588, new Object[]{str15}, textView2);
                                } else {
                                    boolean z18 = uniqueStarGiftValueInfo.last_sale_on_fragment;
                                    String str16 = str12;
                                    if (z18) {
                                        org.telegram.messenger.k5.r(null, null, 2131749583, new Object[]{str16}, textView2);
                                    } else {
                                        org.telegram.messenger.k5.r(null, null, 2131749580, new Object[]{str16}, textView2);
                                    }
                                }
                                FrameLayout frameLayout = new FrameLayout(k7Var8.getContext());
                                frameLayout.setClipChildren(false);
                                frameLayout.setClipToPadding(false);
                                t0 t0Var2 = new t0(k7Var8, new fi.m3[1], frameLayout, i15);
                                tx0 tx0Var3 = new tx0(k7Var8.getContext(), k7Var8.I0);
                                frameLayout.addView(tx0Var3, c8.ha.e(-1, -1, qs.E1));
                                tx0Var3.c(org.telegram.messenger.hd.M0(2131749584, null), org.telegram.messenger.hd.f0(uniqueStarGiftValueInfo.initial_sale_date), null, null);
                                String M0 = org.telegram.messenger.hd.M0(2131749585, null);
                                StringBuilder sb2 = new StringBuilder("⭐️");
                                sb2.append(uniqueStarGiftValueInfo.initial_sale_stars);
                                sb2.append(" (~");
                                tx0Var3.c(M0, dd.a1(false, a8.p0.s(sb2, org.telegram.messenger.r1.i().f(uniqueStarGiftValueInfo.initial_sale_price, uniqueStarGiftValueInfo.currency), ")"), 0.8f, null), null, null);
                                if (TLObject.hasFlag(uniqueStarGiftValueInfo.flags, 1)) {
                                    tx0Var3.c(org.telegram.messenger.hd.M0(2131749581, null), org.telegram.messenger.hd.f0(uniqueStarGiftValueInfo.last_sale_date), null, null);
                                    int round = ((int) (Math.round((uniqueStarGiftValueInfo.last_sale_price / uniqueStarGiftValueInfo.initial_sale_price) * 1000.0d) / 10)) - 100;
                                    if (round <= 0) {
                                        tx0Var = tx0Var3;
                                        tx0Var.c(org.telegram.messenger.hd.M0(2131749582, null), org.telegram.messenger.r1.i().f(uniqueStarGiftValueInfo.last_sale_price, uniqueStarGiftValueInfo.currency), null, null);
                                        if (TLObject.hasFlag(uniqueStarGiftValueInfo.flags, 4)) {
                                            document6 = document7;
                                            str13 = null;
                                            tx0Var2 = tx0Var;
                                            t0Var = t0Var2;
                                        } else {
                                            document6 = document7;
                                            str13 = null;
                                            t0Var = t0Var2;
                                            o3 o3Var = new o3(t0Var, new org.telegram.ui.Components.jc[]{(org.telegram.ui.Components.jc) ((qx0) r3.getChildAt(1)).getChildAt(0)}, uniqueStarGiftValueInfo, str15, 0);
                                            tx0 tx0Var4 = tx0Var;
                                            TableRow e14 = tx0Var4.e(org.telegram.messenger.hd.M0(2131749579, null), org.telegram.messenger.r1.i().f(uniqueStarGiftValueInfo.floor_price, uniqueStarGiftValueInfo.currency), "?", o3Var, null);
                                            tx0Var2 = tx0Var4;
                                            e14.setOnClickListener(new ah.d(o3Var, 7));
                                        }
                                        int i17 = 8;
                                        if (TLObject.hasFlag(uniqueStarGiftValueInfo.flags, 8)) {
                                            o3 o3Var2 = new o3(t0Var, new org.telegram.ui.Components.jc[]{(org.telegram.ui.Components.jc) ((qx0) r3.getChildAt(1)).getChildAt(0)}, uniqueStarGiftValueInfo, str15, 1);
                                            TableRow e15 = tx0Var2.e(org.telegram.messenger.hd.M0(2131749587, str13), org.telegram.messenger.r1.i().f(uniqueStarGiftValueInfo.average_price, uniqueStarGiftValueInfo.currency), "?", o3Var2, null);
                                            e15.setOnClickListener(new ah.d(o3Var2, i17));
                                        }
                                        linearLayout.addView(frameLayout, c8.ha.t(-1, -2, 7, 0, 0, 0, 12));
                                        if (uniqueStarGiftValueInfo.listed_count <= 0) {
                                            f10 = 1.0f;
                                            f11 = 2.0f;
                                            fi.d dVar2 = new fi.d(k7Var8.getContext(), k7Var8.I0, false);
                                            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                                            spannableStringBuilder.append((CharSequence) org.telegram.messenger.hd.E(uniqueStarGiftValueInfo.listed_count, ' '));
                                            spannableStringBuilder.append((CharSequence) " ");
                                            spannableStringBuilder.append((CharSequence) "e");
                                            spannableStringBuilder.setSpan(new org.telegram.ui.Components.r5(document6, 1.5f, dVar2.getTextPaint().getFontMetricsInt()), spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 33);
                                            spannableStringBuilder.append((CharSequence) " ");
                                            spannableStringBuilder.append((CharSequence) org.telegram.messenger.hd.M0(2131749576, null));
                                            dVar2.i(org.telegram.messenger.g0.I2(spannableStringBuilder, false, org.telegram.messenger.g0.L(2.0f), org.telegram.messenger.g0.L(1.0f)), false, true);
                                            z15 = true;
                                            charSequence2 = "e";
                                            str14 = null;
                                            charSequence3 = " ";
                                            k7Var7 = k7Var8;
                                            dVar2.setOnClickListener(new p3(k7Var7, str15, j10, 0));
                                            linearLayout.addView(dVar2, c8.ha.t(-1, 42, 7, 0, 0, 0, 2));
                                        } else {
                                            str14 = str13;
                                            charSequence2 = "e";
                                            charSequence3 = " ";
                                            k7Var7 = k7Var8;
                                            f10 = 1.0f;
                                            f11 = 2.0f;
                                            z15 = true;
                                        }
                                        if (uniqueStarGiftValueInfo.fragment_listed_count > 0) {
                                            fi.d dVar3 = new fi.d(k7Var7.getContext(), k7Var7.I0, false);
                                            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder();
                                            spannableStringBuilder2.append((CharSequence) org.telegram.messenger.hd.E(uniqueStarGiftValueInfo.fragment_listed_count, ' '));
                                            spannableStringBuilder2.append(charSequence2);
                                            spannableStringBuilder2.setSpan(new org.telegram.ui.Components.r5(document6, 1.5f, dVar3.getTextPaint().getFontMetricsInt()), spannableStringBuilder2.length() - 1, spannableStringBuilder2.length(), 33);
                                            spannableStringBuilder2.append(charSequence3);
                                            spannableStringBuilder2.append((CharSequence) org.telegram.messenger.hd.M0(2131749577, str14));
                                            dVar3.i(org.telegram.messenger.g0.I2(spannableStringBuilder2, false, org.telegram.messenger.g0.L(f11), org.telegram.messenger.g0.L(f10)), false, z15);
                                            dVar3.setOnClickListener(new r(6, k7Var7, uniqueStarGiftValueInfo));
                                            linearLayout.addView(dVar3, c8.ha.t(-1, 42, 7, 0, 0, 0, 0));
                                        }
                                        l11.N = linearLayout;
                                        l11.show();
                                    }
                                    tx0Var3.e(org.telegram.messenger.hd.M0(2131749582, null), org.telegram.messenger.r1.i().f(uniqueStarGiftValueInfo.last_sale_price, uniqueStarGiftValueInfo.currency), "+" + org.telegram.messenger.hd.E(round, ' ') + "%", null, null);
                                }
                                tx0Var = tx0Var3;
                                if (TLObject.hasFlag(uniqueStarGiftValueInfo.flags, 4)) {
                                }
                                int i172 = 8;
                                if (TLObject.hasFlag(uniqueStarGiftValueInfo.flags, 8)) {
                                }
                                linearLayout.addView(frameLayout, c8.ha.t(-1, -2, 7, 0, 0, 0, 12));
                                if (uniqueStarGiftValueInfo.listed_count <= 0) {
                                }
                                if (uniqueStarGiftValueInfo.fragment_listed_count > 0) {
                                }
                                l11.N = linearLayout;
                                l11.show();
                            }
                        });
                    }
                });
                return;
            case 16:
                TLObject tLObject3 = (TLObject) this.b;
                v0 v0Var = (v0) this.d;
                String str10 = (String) this.c;
                if (tLObject3 instanceof TL_stars.TL_payments_uniqueStarGift) {
                    TL_stars.StarGift starGift = ((TL_stars.TL_payments_uniqueStarGift) tLObject3).gift;
                    if (starGift instanceof TL_stars.TL_starGiftUnique) {
                        TL_stars.TL_starGiftUnique tL_starGiftUnique3 = (TL_stars.TL_starGiftUnique) starGift;
                        Long valueOf = Long.valueOf(tL_starGiftUnique3.gift_id);
                        String str11 = tL_starGiftUnique3.title;
                        if (str11 != null) {
                            str10 = str11;
                        }
                        v0Var.a(valueOf, str10);
                        return;
                    }
                }
                v0Var.a(0L, str10);
                return;
            case 17:
                TLObject tLObject4 = (TLObject) this.b;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) this.c;
                c20 c20Var = (c20) this.d;
                if (tLObject4 instanceof TLRPC.TL_payments_paymentFormStarGift) {
                    c20Var.a((TLRPC.TL_payments_paymentFormStarGift) tLObject4);
                    return;
                } else {
                    ea.e(tL_error2 != null ? tL_error2.text : "NO_PAYMENT_FORM");
                    c20Var.a(null);
                    return;
                }
            case 18:
                ea eaVar = (ea) this.b;
                TLObject tLObject5 = (TLObject) this.c;
                Runnable runnable3 = (Runnable) this.d;
                ArrayList arrayList2 = eaVar.v;
                boolean[] zArr = eaVar.r;
                ArrayList[] arrayListArr = eaVar.q;
                int i15 = eaVar.a;
                boolean z15 = !eaVar.e;
                eaVar.c = System.currentTimeMillis();
                if (tLObject5 instanceof TL_stars.StarsStatus) {
                    TL_stars.StarsStatus starsStatus = (TL_stars.StarsStatus) tLObject5;
                    boolean z16 = false;
                    qp.s1(i15).Y3(starsStatus.users, false);
                    qp.s1(i15).S3(starsStatus.chats, false);
                    if (arrayListArr[0].isEmpty()) {
                        ArrayList<TL_stars.StarsTransaction> arrayList3 = starsStatus.history;
                        int size = arrayList3.size();
                        int i16 = 0;
                        while (i16 < size) {
                            TL_stars.StarsTransaction starsTransaction = arrayList3.get(i16);
                            i16++;
                            boolean z17 = z16;
                            TL_stars.StarsTransaction starsTransaction2 = starsTransaction;
                            arrayListArr[z17 ? 1 : 0].add(starsTransaction2);
                            boolean z18 = z13;
                            int i17 = i15;
                            arrayListArr[starsTransaction2.amount.amount > 0 ? z18 : 2].add(starsTransaction2);
                            z13 = z18;
                            i15 = i17;
                            z16 = false;
                        }
                        z9 = z13;
                        i12 = i15;
                        for (int i18 = 0; i18 < 3; i18++) {
                            zArr[i18] = (!arrayListArr[i18].isEmpty() || zArr[i18]) ? z9 : false;
                            boolean[] zArr2 = eaVar.u;
                            boolean z19 = (starsStatus.flags & 1) == 0 ? z9 : false;
                            zArr2[i18] = z19;
                            if (z19) {
                                eaVar.t[i18] = false;
                            }
                            eaVar.s[i18] = zArr2[i18] ? null : starsStatus.next_offset;
                        }
                        z12 = z9;
                    } else {
                        z9 = true;
                        i12 = i15;
                        z12 = false;
                    }
                    if (arrayList2.isEmpty()) {
                        arrayList2.addAll(starsStatus.subscriptions);
                        eaVar.x = false;
                        eaVar.w = starsStatus.subscriptions_next_offset;
                        eaVar.y = (starsStatus.flags & 4) == 0 ? z9 : false;
                        z10 = z9;
                    } else {
                        z10 = false;
                    }
                    long j10 = eaVar.f.amount;
                    TL_stars.StarsAmount starsAmount = starsStatus.balance;
                    if (j10 != starsAmount.amount) {
                        z15 = z9;
                    }
                    eaVar.f = starsAmount;
                    eaVar.g = 0L;
                    z11 = z12;
                } else {
                    z9 = true;
                    i12 = i15;
                    z10 = false;
                    z11 = false;
                }
                eaVar.d = false;
                eaVar.e = z9;
                if (z15) {
                    qs.f(i12).k(qs.y3, new Object[0]);
                }
                if (z11) {
                    qs.f(i12).k(qs.z3, new Object[0]);
                }
                if (z10) {
                    qs.f(i12).k(qs.A3, new Object[0]);
                }
                if (runnable3 != null) {
                    runnable3.run();
                    return;
                }
                return;
            case 19:
                ea eaVar2 = (ea) this.b;
                HashSet hashSet = (HashSet) this.c;
                Runnable runnable4 = (Runnable) this.d;
                eaVar2.getClass();
                Iterator it = hashSet.iterator();
                while (it.hasNext()) {
                    Integer num = (Integer) it.next();
                    num.intValue();
                    eaVar2.Q.remove(num);
                    eaVar2.R.remove(num);
                }
                runnable4.run();
                return;
            case 20:
                boolean[] zArr3 = (boolean[]) this.b;
                EditTextBoldCursor editTextBoldCursor = (EditTextBoldCursor) this.c;
                v2[] v2VarArr = (v2[]) this.d;
                zArr3[0] = false;
                org.telegram.messenger.g0.v1(editTextBoldCursor);
                v2VarArr[0].dismiss();
                return;
            case 21:
                wf.b bVar4 = (wf.b) this.b;
                e2.u uVar2 = (e2.u) this.c;
                l2.e eVar = (l2.e) this.d;
                h0 h0Var = (h0) bVar4.c;
                String str12 = m0.a;
                i0 i0Var = ((l2.c0) h0Var).a;
                i0Var.S = uVar2;
                m2.e eVar2 = i0Var.s;
                m2.a U = eVar2.U();
                eVar2.V(U, 1017, new m2.c(U, uVar2, eVar, 26));
                return;
            case 22:
                i3 i3Var = (i3) this.b;
                o0 o0Var = (o0) this.c;
                View view = (View) this.d;
                ?? r42 = i3Var.a;
                r42.d3 = true;
                g4 g4Var = r42.x1;
                ImageReceiver imageReceiver = r42.U2;
                boolean[] zArr4 = {false};
                d7 d7Var = r42.n0;
                d7Var.animate().alpha(0.0f).scaleX(0.8f).scaleY(0.8f).setListener(new l2(1, d7Var)).setDuration(150L).start();
                int L = org.telegram.messenger.g0.L(8.0f);
                d7 d7Var2 = new d7(r42.getContext(), r42.g1);
                r42.n0 = d7Var2;
                d7Var2.setPadding(L, L, L, L);
                r42.m0.addView(r42.n0, ha.e(40, 40, 3));
                ?? r52 = r42.X2;
                if (r52 != 0) {
                    r52.n(r42);
                    dVar = null;
                    r42.X2 = null;
                } else {
                    dVar = null;
                }
                ?? r62 = r42.V2;
                if (r62 != 0) {
                    r62.d(r42);
                    r42.V2 = dVar;
                }
                r42.Y2 = false;
                if (o0Var.g != 0) {
                    r42.Y2 = true;
                    ?? i5Var2 = new i5(2, r42.l2, o0Var.g);
                    r42.X2 = i5Var2;
                    i5Var2.a(r42);
                } else if (o0Var.f != null && (tL_availableReaction = (TLRPC.TL_availableReaction) ui.b0(r42.l2).r.get(o0Var.f)) != null) {
                    r42.W2.u0(null, null, org.telegram.messenger.hc.b(tL_availableReaction.select_animation), "60_60", null, null, null, 0L, null, null, 0);
                    imageReceiver.q0(org.telegram.messenger.hc.b(tL_availableReaction.around_animation), k0.a(), null, null, null, 0);
                    if (imageReceiver.B() != null) {
                        imageReceiver.B().N(0, false, true);
                    }
                }
                r42.n0.setReaction(o0Var);
                if (r42.m1) {
                    TL_stories.StoryItem storyItem3 = g4Var.a;
                    if (storyItem3.sent_reaction == null) {
                        if (storyItem3.views == null) {
                            storyItem3.views = new TL_stories.TL_storyViews();
                        }
                        TL_stories.StoryItem storyItem4 = g4Var.a;
                        TL_stories.StoryViews storyViews = storyItem4.views;
                        storyViews.reactions_count++;
                        q0.b(null, storyItem4.sent_reaction, storyViews);
                        r42.i1(true);
                    }
                }
                if (o0Var.g != 0 && (i5Var = r42.n0.f) != null) {
                    ?? a11 = ch.d.a(i5Var, false, true);
                    r42.V2 = a11;
                    a11.f(r42);
                }
                r42.B1.j0(r42.k1, g4Var.a, o0Var);
                int[] iArr = new int[2];
                view.getLocationInWindow(iArr);
                int[] iArr2 = new int[2];
                r42.getLocationInWindow(iArr2);
                r42.f3 = iArr[0] - iArr2[0];
                r42.g3 = iArr[1] - iArr2[1];
                r42.h3 = view.getMeasuredHeight();
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                r42.e3 = 0.0f;
                r42.invalidate();
                d7 d7Var3 = r42.n0;
                d7Var3.setAllowDrawReaction(false);
                ?? r63 = d7Var3.e;
                if (o0Var.g != 0 || (tL_availableReaction2 = (TLRPC.TL_availableReaction) ui.b0(p10.s0).r.get(o0Var.f)) == null) {
                    r10 = 0;
                } else {
                    r63.q0(org.telegram.messenger.hc.b(tL_availableReaction2.center_icon), "40_40_nolimit", null, "tgs", tL_availableReaction2, 1);
                    r10 = 0;
                    r63.W(0);
                }
                ofFloat.addUpdateListener(new g3(i3Var, ofFloat, zArr4, r10));
                ofFloat.addListener(new h3(i3Var, zArr4, d7Var3, r10));
                ofFloat.setDuration(220L);
                ofFloat.start();
                r42.Z0(r10);
                return;
            case 23:
                z3 z3Var = (z3) this.b;
                f6 f6Var = (f6) this.c;
                TL_stories.StoryItem storyItem5 = (TL_stories.StoryItem) this.d;
                i4 i4Var = z3Var.x;
                v4.P(i4Var.getContext(), null, f6Var, new a3.h(z3Var, storyItem5, f6Var, i13));
                z3 z3Var2 = i4Var.c1;
                if (z3Var2 != null) {
                    z3Var2.a();
                    return;
                }
                return;
            case 24:
                j6 j6Var = (j6) this.b;
                TL_stories.StoryItem storyItem6 = (TL_stories.StoryItem) this.c;
                ?? r32 = (c20) this.d;
                for (int i19 = 0; i19 < j6Var.i.size(); i19++) {
                    ij ijVar3 = (ij) j6Var.i.get(i19);
                    if (ijVar3 != null && (storyItem = ijVar3.l) != null && (messageMedia = storyItem.media) != null && (document = storyItem6.media.document) != null && (document2 = messageMedia.document) != null && document2.id == document.id) {
                        r32.a(document2);
                        return;
                    }
                }
                r32.a(null);
                return;
            case 25:
                y6 y6Var = (y6) this.b;
                TLObject tLObject6 = (TLObject) this.c;
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) this.d;
                int i20 = y6Var.a;
                y6Var.R = true;
                if (tLObject6 instanceof TLRPC.TL_boolTrue) {
                    y6Var.S = null;
                    qs.f(i20).k(qs.b3, new Object[0]);
                    return;
                } else if (!(tLObject6 instanceof TL_stories.canSendStoryCount)) {
                    y6Var.n(tL_error3);
                    return;
                } else {
                    y6Var.S = new di.s6(1, ((TL_stories.canSendStoryCount) tLObject6).count_remains, -1L);
                    qs.f(i20).k(qs.b3, new Object[0]);
                    return;
                }
            case 26:
                j6 j6Var2 = (j6) this.b;
                i6 i6Var = (i6) this.c;
                d3 d3Var = (d3) this.d;
                ArrayList arrayList4 = j6Var2.i;
                for (int i21 = 0; i21 < arrayList4.size(); i21++) {
                    ij ijVar4 = (ij) arrayList4.get(i21);
                    if (ijVar4 != null && (storyItem2 = ijVar4.l) != null && (messageMedia2 = storyItem2.media) != null) {
                        TLRPC.MessageMedia messageMedia3 = i6Var.media;
                        TLRPC.Document document5 = messageMedia3.document;
                        if (document5 != null) {
                            TLRPC.Document document6 = messageMedia2.document;
                            if (document6 == null) {
                                continue;
                            } else if (document6.id == document5.id) {
                                d3Var.a((i6) storyItem2);
                                return;
                            }
                        }
                        TLRPC.Photo photo2 = messageMedia3.photo;
                        if (photo2 != null && (photo = messageMedia2.photo) != null && photo.id == photo2.id) {
                            d3Var.a((i6) storyItem2);
                            return;
                        }
                    }
                }
                d3Var.a(null);
                return;
            case 27:
                j6 j6Var3 = (j6) this.b;
                TLObject tLObject7 = (TLObject) this.c;
                Runnable runnable5 = (Runnable) this.d;
                n6 n6Var = j6Var3.q;
                ArrayList arrayList5 = j6Var3.G;
                ArrayList arrayList6 = j6Var3.i;
                ArrayList arrayList7 = j6Var3.H;
                j6Var3.F = 0;
                j6Var3.C = false;
                j6Var3.D = true;
                j6Var3.r = true;
                ArrayList arrayList8 = new ArrayList();
                if (tLObject7 instanceof Vector) {
                    ArrayList arrayList9 = ((Vector) tLObject7).objects;
                    int size2 = arrayList9.size();
                    int i22 = 0;
                    while (i22 < size2) {
                        Object obj = arrayList9.get(i22);
                        i22++;
                        arrayList8.add((TL_bots.botPreviewMedia) obj);
                    }
                } else {
                    if (!(tLObject7 instanceof TL_bots.previewInfo)) {
                        return;
                    }
                    TL_bots.previewInfo previewinfo = (TL_bots.previewInfo) tLObject7;
                    arrayList5.clear();
                    arrayList5.addAll(previewinfo.lang_codes);
                    arrayList8.addAll(previewinfo.media);
                }
                ArrayList arrayList10 = new ArrayList(arrayList6);
                arrayList6.clear();
                arrayList7.clear();
                int size3 = arrayList8.size();
                int i23 = 0;
                while (i23 < size3) {
                    Object obj2 = arrayList8.get(i23);
                    i23++;
                    TL_bots.botPreviewMedia botpreviewmedia = (TL_bots.botPreviewMedia) obj2;
                    ij ijVar5 = new ij(j6Var3.c, new i6(j6Var3, j6Var3.d, botpreviewmedia));
                    int i24 = 0;
                    while (true) {
                        if (i24 >= arrayList10.size()) {
                            ijVar = null;
                        } else if (qp.t0(((ij) arrayList10.get(i24)).l.media, botpreviewmedia.media)) {
                            ijVar = (ij) arrayList10.get(i24);
                        } else {
                            i24++;
                        }
                    }
                    TL_stories.StoryItem storyItem7 = ijVar5.l;
                    TLRPC.Message message2 = ijVar5.k;
                    if (ijVar == null) {
                        f12 = j6Var3.I;
                        j6Var3.I = f12 + 1;
                    } else {
                        f12 = ijVar.f1();
                    }
                    message2.id = f12;
                    storyItem7.id = f12;
                    ijVar5.j = j6Var3;
                    ijVar5.r0(false);
                    if (arrayList7.isEmpty()) {
                        arrayList7.add(new ArrayList());
                    }
                    ((ArrayList) arrayList7.get(0)).add(Integer.valueOf(ijVar5.f1()));
                    arrayList6.add(ijVar5);
                }
                org.telegram.messenger.g0.r(n6Var);
                org.telegram.messenger.g0.h3(n6Var);
                if (runnable5 != null) {
                    org.telegram.messenger.g0.h3(runnable5);
                    return;
                }
                return;
            case 28:
                g9 g9Var = (g9) this.b;
                q6 q6Var = (q6) this.c;
                ArrayList arrayList11 = (ArrayList) this.d;
                p9 p9Var = g9Var.d;
                p9Var.n0.D(p9Var.h, q6Var.d, arrayList11);
                return;
            default:
                y9 y9Var = (y9) this.b;
                TLObject tLObject8 = (TLObject) this.c;
                TL_stories.TL_stories_getStoriesViews tL_stories_getStoriesViews = (TL_stories.TL_stories_getStoriesViews) this.d;
                s7 s7Var = y9Var.f;
                int i25 = y9Var.b;
                y9.g = System.currentTimeMillis();
                if (tLObject8 != null) {
                    TL_stories.TL_stories_storyViews tL_stories_storyViews = (TL_stories.TL_stories_storyViews) tLObject8;
                    qp.s1(i25).Y3(tL_stories_storyViews.users, false);
                    if (!y9Var.d(tL_stories_getStoriesViews.id, tL_stories_storyViews)) {
                        y9Var.d = 0;
                        y9Var.e = false;
                        return;
                    }
                    qs.f(i25).k(qs.v5, new Object[0]);
                }
                y9Var.d = 0;
                if (y9Var.e) {
                    org.telegram.messenger.g0.r(s7Var);
                    org.telegram.messenger.g0.i3(s7Var, 10000L);
                    return;
                }
                return;
        }
    }

    public /* synthetic */ s(Object obj, Object obj2, Object obj3, Object obj4, int i7) {
        this.a = i7;
        this.b = obj2;
        this.c = obj3;
        this.d = obj4;
    }

    public /* synthetic */ s(Object obj, Object obj2, String str, int i7) {
        this.a = i7;
        this.b = obj;
        this.d = obj2;
        this.c = str;
    }
}
