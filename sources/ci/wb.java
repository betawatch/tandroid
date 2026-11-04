package ci;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.RelativeSizeSpan;
import android.util.Log;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import b8.cd;
import b8.mf;
import java.lang.reflect.Method;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.ArrayList;
import java.util.Date;
import java.util.Locale;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.bd;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.cs;
import org.telegram.messenger.e20;
import org.telegram.messenger.h10;
import org.telegram.messenger.hp;
import org.telegram.messenger.hs;
import org.telegram.messenger.l10;
import org.telegram.messenger.n10;
import org.telegram.messenger.u10;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.ch0;
import org.telegram.ui.Components.f41;
import org.telegram.ui.Components.gb0;
import org.telegram.ui.Components.gt0;
import org.telegram.ui.Components.gz;
import org.telegram.ui.Components.ox0;
import org.telegram.ui.Components.r31;
import org.telegram.ui.Components.rx0;
import org.telegram.ui.Components.s70;
import org.telegram.ui.Components.tj0;
import org.telegram.ui.Components.wp;
import org.telegram.ui.Components.x70;
import org.telegram.ui.Components.xq;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.k00;
import org.telegram.ui.k50;
import org.telegram.ui.l00;
import org.telegram.ui.ln;
import org.telegram.ui.s51;
import org.telegram.ui.wm;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class wb extends l00 implements cs {
    public static DecimalFormat w0;
    public static DecimalFormat x0;
    public FrameLayout S;
    public wg.m T;
    public vb U;
    public gt0 V;
    public ai.x2 W;
    public View X;
    public qe.a Y;
    public qe.a Z;
    public qe.a a0;
    public int c0;
    public int d0;
    public boolean e0;
    public boolean f0;
    public ai.x2 h0;
    public gz i0;
    public LinearLayout j0;
    public SpannableStringBuilder k0;
    public org.telegram.ui.Components.h6 l0;
    public TextView m0;
    public gi.d n0;
    public ai.o2 o0;
    public gi.d p0;
    public s51 q0;
    public gi.d r0;
    public gi.d s0;
    public boolean t0;
    public boolean u0;
    public ai.f6 v0;
    public int b0 = -1;
    public final d1 g0 = new d1(this, 9);

    public wb() {
        this.N = true;
    }

    public static /* synthetic */ void A0(wb wbVar, Context context) {
        if (hp.s1(wbVar.currentAccount).v2()) {
            org.telegram.ui.b.b(wbVar.currentAccount);
        } else {
            new nb(context, wbVar.resourceProvider).show();
        }
    }

    public static void B0(wb wbVar) {
        e9.y(wbVar.currentAccount, false).u();
        xg.e1.l1(1, org.telegram.messenger.v1.a(wbVar.currentAccount).b());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0759  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x06c3  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x035e  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x02b1  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x0254  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x01e9  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x024e  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0293  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0339  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x03b0  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0504  */
    /* JADX WARN: Type inference failed for: r1v3, types: [android.view.View, android.view.ViewGroup, android.widget.LinearLayout] */
    /* JADX WARN: Type inference failed for: r24v0 */
    /* JADX WARN: Type inference failed for: r24v1 */
    /* JADX WARN: Type inference failed for: r24v5 */
    /* JADX WARN: Type inference failed for: r2v10, types: [android.view.View, android.view.ViewGroup, android.widget.FrameLayout] */
    /* JADX WARN: Type inference failed for: r2v13, types: [android.view.View, org.telegram.ui.Components.rx0] */
    /* JADX WARN: Type inference failed for: r3v19 */
    /* JADX WARN: Type inference failed for: r3v20, types: [boolean] */
    /* JADX WARN: Type inference failed for: r3v21 */
    /* JADX WARN: Type inference failed for: r6v44, types: [org.telegram.tgnet.TLRPC$User] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void C0(wb wbVar, int i3) {
        r31 G;
        boolean z10;
        String str;
        boolean z11;
        final boolean z12;
        TLRPC.Chat chat;
        TLRPC.Chat chat2;
        int i10;
        org.telegram.ui.ActionBar.t2[] t2VarArr;
        int i11;
        int i12;
        boolean z13;
        String str2;
        org.telegram.ui.h5 h5Var;
        boolean z14;
        String str3;
        long currentTime;
        final int i13;
        ?? r32;
        org.telegram.ui.ActionBar.d2 T;
        ai.f6 f6Var = wbVar.v0;
        if (f6Var == null || (G = f6Var.G(i3)) == null) {
            return;
        }
        int i14 = G.d;
        if (i14 == -1) {
            wbVar.v0.O(true);
            return;
        }
        if (i14 == -2) {
            e9.y(wbVar.currentAccount, false).u();
            xg.e1.l1(1, org.telegram.messenger.v1.a(wbVar.currentAccount).b());
            return;
        }
        if (i14 == -3) {
            e9.y(wbVar.currentAccount, false).V();
            wbVar.v0.O(true);
            return;
        }
        if (i14 == -4) {
            if (hp.s1(wbVar.currentAccount).v2()) {
                org.telegram.ui.b.b(wbVar.currentAccount);
                return;
            } else {
                wbVar.presentFragment(new ii.q3(wbVar.getUserConfig().e()));
                return;
            }
        }
        int i15 = 2;
        if (G.H(ib.class)) {
            if (G.G instanceof TL_stars.TL_starsTopupOption) {
                e9.y(wbVar.currentAccount, false).f(wbVar.getParentActivity(), (TL_stars.TL_starsTopupOption) G.G, new ai.q4(i15, wbVar, G), null);
                return;
            }
            return;
        }
        if (G.H(ob.class) && (G.G instanceof TL_stars.StarsSubscription)) {
            final Activity parentActivity = wbVar.getParentActivity();
            int i16 = wbVar.currentAccount;
            final TL_stars.StarsSubscription starsSubscription = (TL_stars.StarsSubscription) G.G;
            org.telegram.ui.ActionBar.e6 resourceProvider = wbVar.getResourceProvider();
            if (starsSubscription == null || parentActivity == null) {
                return;
            }
            org.telegram.ui.ActionBar.t2 h = org.telegram.messenger.camera.q.h(parentActivity, false, 1, resourceProvider);
            org.telegram.ui.ActionBar.t2[] t2VarArr2 = new org.telegram.ui.ActionBar.t2[1];
            ?? e10 = org.telegram.messenger.k5.e(parentActivity, 1);
            e10.setPadding(org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(20.0f), org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(4.0f));
            e10.setClipChildren(false);
            e10.setClipToPadding(false);
            ?? frameLayout = new FrameLayout(parentActivity);
            e10.addView(frameLayout, mf.t(-1, -2, 7, 0, 0, 0, 10));
            boolean[] zArr = new boolean[1];
            va vaVar = new va(zArr, t2VarArr2);
            hs.f(i16).b(vaVar, hs.A3);
            long o10 = org.telegram.messenger.m5.o(starsSubscription.peer);
            org.telegram.ui.Components.k9 k9Var = new org.telegram.ui.Components.k9(parentActivity);
            if (o10 >= 0) {
                z10 = 0;
                ?? a22 = hp.s1(i16).a2(Long.valueOf(o10));
                str = l10.p(a22);
                boolean t10 = l10.t(a22);
                z11 = !t10;
                z12 = t10;
                chat = a22;
            } else {
                z10 = 0;
                TLRPC.Chat M0 = hp.s1(i16).M0(Long.valueOf(-o10));
                str = M0 == null ? "" : M0.title;
                z11 = false;
                z12 = false;
                chat = M0;
            }
            String str4 = str;
            if (starsSubscription.photo != null) {
                k9Var.setRoundRadius(org.telegram.messenger.g0.L(21.0f));
                chat2 = chat;
                k9Var.p(org.telegram.messenger.ac.p(e20.c(starsSubscription.photo)), "100_100", null, null);
            } else {
                chat2 = chat;
                k9Var.setRoundRadius(org.telegram.messenger.g0.L(50.0f));
                org.telegram.ui.Components.u8 u8Var = new org.telegram.ui.Components.u8((org.telegram.ui.ActionBar.e6) null);
                if (o10 < 0) {
                    i10 = i16;
                    t2VarArr = t2VarArr2;
                    TLRPC.Chat M02 = hp.s1(i16).M0(Long.valueOf(-o10));
                    u8Var.q(M02);
                    k9Var.e(M02, u8Var);
                    frameLayout.addView(k9Var, mf.e(100, 100, 17));
                    Drawable drawable = parentActivity.getResources().getDrawable(R.drawable.star_small_outline);
                    org.telegram.ui.ActionBar.r6.y(frameLayout, drawable, org.telegram.ui.ActionBar.k6.h5, resourceProvider, PorterDuff.Mode.SRC_IN);
                    Drawable drawable2 = parentActivity.getResources().getDrawable(R.drawable.star_small_inner);
                    if (starsSubscription.photo == null) {
                        ImageView imageView = new ImageView(parentActivity);
                        imageView.setImageDrawable(drawable);
                        frameLayout.addView(imageView, mf.e(28, 28, 17));
                        imageView.setTranslationX(org.telegram.messenger.g0.L(34.0f));
                        imageView.setTranslationY(org.telegram.messenger.g0.L(35.0f));
                        imageView.setScaleX(1.1f);
                        imageView.setScaleY(1.1f);
                        ImageView imageView2 = new ImageView(parentActivity);
                        imageView2.setImageDrawable(drawable2);
                        frameLayout.addView(imageView2, mf.e(28, 28, 17));
                        imageView2.setTranslationX(org.telegram.messenger.g0.L(34.0f));
                        imageView2.setTranslationY(org.telegram.messenger.g0.L(35.0f));
                    }
                    TextView textView = new TextView(parentActivity);
                    org.telegram.messenger.k5.n(textView, org.telegram.ui.ActionBar.k6.j5, resourceProvider, 1, 20.0f);
                    textView.setGravity(17);
                    if (TextUtils.isEmpty(starsSubscription.title)) {
                        textView.setText(starsSubscription.title);
                    } else {
                        textView.setText(bd.M0(2131744981, null));
                    }
                    e10.addView(textView, mf.t(-1, -2, 17, 20, 0, 20, 4));
                    TextView textView2 = new TextView(parentActivity);
                    textView2.setTextSize(1, 14.0f);
                    textView2.setGravity(17);
                    org.telegram.ui.ActionBar.r6.V(textView2, org.telegram.ui.ActionBar.k6.B6, resourceProvider);
                    TL_stars.TL_starsSubscriptionPricing tL_starsSubscriptionPricing = starsSubscription.pricing;
                    i11 = tL_starsSubscriptionPricing.period;
                    if (i11 != 2592000) {
                        Object[] objArr = new Object[1];
                        objArr[z10] = Long.valueOf(tL_starsSubscriptionPricing.amount);
                        textView2.setText(a1(z10, bd.a0(null, null, 2131744993, objArr), 0.8f, null));
                        i12 = i10;
                    } else {
                        String str5 = i11 == 300 ? "5min" : "min";
                        i12 = i10;
                        textView2.setText(a1(false, bd.a0(null, null, 2131744993, Long.valueOf(tL_starsSubscriptionPricing.amount), str5), 0.8f, null));
                    }
                    e10.addView(textView2, mf.t(-1, -2, 17, 20, 0, 20, 4));
                    ?? rx0Var = new rx0(parentActivity, resourceProvider);
                    s70 s70Var = new s70(parentActivity, resourceProvider);
                    s70Var.setPadding(org.telegram.messenger.g0.L(12.66f), org.telegram.messenger.g0.L(9.33f), org.telegram.messenger.g0.L(12.66f), org.telegram.messenger.g0.L(9.33f));
                    s70Var.setEllipsize(TextUtils.TruncateAt.END);
                    int i17 = org.telegram.ui.ActionBar.k6.Uc;
                    org.telegram.ui.ActionBar.r6.V(s70Var, i17, resourceProvider);
                    org.telegram.ui.ActionBar.r6.H(s70Var, i17, resourceProvider);
                    s70Var.setTextSize(1, 14.0f);
                    s70Var.setSingleLine(true);
                    s70Var.setDisablePaddingsOffsetY(true);
                    org.telegram.ui.h5 h5Var2 = new org.telegram.ui.h5(24.0f, i12, s70Var);
                    if (o10 < 0) {
                        TLRPC.User a23 = hp.s1(i12).a2(Long.valueOf(o10));
                        boolean z15 = a23 == null || l10.x(a23);
                        String p10 = l10.p(a23);
                        h5Var2.e(a23);
                        boolean z16 = z15;
                        h5Var = h5Var2;
                        z13 = z16;
                        str2 = p10;
                    } else {
                        TLRPC.Chat M03 = hp.s1(i12).M0(Long.valueOf(-o10));
                        z13 = M03 == null;
                        str2 = M03 != null ? M03.title : "";
                        h5Var = h5Var2;
                        h5Var.b(M03);
                    }
                    z14 = z13;
                    int i18 = i12;
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("x  " + ((Object) str2));
                    spannableStringBuilder.setSpan(h5Var, 0, 1, 33);
                    final org.telegram.ui.ActionBar.t2[] t2VarArr3 = t2VarArr;
                    spannableStringBuilder.setSpan(new wa(t2VarArr3, o10), 3, spannableStringBuilder.length(), 33);
                    s70Var.setText(spannableStringBuilder);
                    if (!z14) {
                        rx0Var.l(s70Var, bd.M0(o10 < 0 ? 2131745005 : z11 ? 2131745015 : 2131745020, null));
                    }
                    if (o10 >= 0 || TextUtils.isEmpty(starsSubscription.title)) {
                        str3 = null;
                    } else {
                        str3 = null;
                        rx0Var.c(bd.M0(z11 ? 2131745013 : 2131745018, null), starsSubscription.title, null, null);
                    }
                    rx0Var.c(bd.M0(2131744986, str3), bd.a0(null, null, 2131742793, bd.E0().s0().format(new Date((starsSubscription.until_date - starsSubscription.pricing.period) * 1000)), bd.E0().p0().format(new Date((starsSubscription.until_date - starsSubscription.pricing.period) * 1000))), null, null);
                    currentTime = ConnectionsManager.getInstance(i18).getCurrentTime();
                    rx0Var.c(bd.M0((!starsSubscription.canceled || starsSubscription.bot_canceled) ? 2131744979 : currentTime > ((long) starsSubscription.until_date) ? 2131744980 : 2131744978, null), bd.a0(null, null, 2131742793, bd.E0().s0().format(new Date(starsSubscription.until_date * 1000)), bd.E0().p0().format(new Date(starsSubscription.until_date * 1000))), null, null);
                    e10.addView(rx0Var, mf.k(0.0f, 17.0f, 0.0f, 0.0f, -1, -2));
                    s70 s70Var2 = new s70(parentActivity, resourceProvider);
                    int i19 = org.telegram.ui.ActionBar.k6.z6;
                    org.telegram.ui.ActionBar.r6.V(s70Var2, i19, resourceProvider);
                    org.telegram.ui.ActionBar.r6.H(s70Var2, i17, resourceProvider);
                    s70Var2.setTextSize(1, 14.0f);
                    final int i20 = 0;
                    s70Var2.setText(org.telegram.messenger.g0.U2(bd.M0(2131744936, null), new Runnable() { // from class: ci.ea
                        @Override // java.lang.Runnable
                        public final void run() {
                            Object obj;
                            int i21 = i20;
                            Activity activity = parentActivity;
                            switch (i21) {
                                case 0:
                                    sf.c.t(activity, bd.M0(2131744976, null));
                                    return;
                                default:
                                    if (activity.isFinishing()) {
                                        return;
                                    }
                                    Handler handler = e0.d.g;
                                    Method method = e0.d.f;
                                    int i22 = Build.VERSION.SDK_INT;
                                    if (i22 >= 28) {
                                        activity.recreate();
                                        return;
                                    }
                                    if (((i22 != 26 && i22 != 27) || method != null) && (e0.d.e != null || e0.d.d != null)) {
                                        try {
                                            Object obj2 = e0.d.c.get(activity);
                                            if (obj2 != null && (obj = e0.d.b.get(activity)) != null) {
                                                Application application = activity.getApplication();
                                                e0.c cVar = new e0.c(activity);
                                                application.registerActivityLifecycleCallbacks(cVar);
                                                handler.post(new l9.u(4, cVar, obj2));
                                                try {
                                                    if (i22 == 26 || i22 == 27) {
                                                        Boolean bool = Boolean.FALSE;
                                                        method.invoke(obj, obj2, null, null, 0, bool, null, null, bool, bool);
                                                    } else {
                                                        activity.recreate();
                                                    }
                                                    handler.post(new l9.u(5, application, cVar));
                                                    return;
                                                } finally {
                                                    handler.post(new l9.u(5, application, cVar));
                                                }
                                            }
                                        } catch (Throwable unused) {
                                        }
                                    }
                                    activity.recreate();
                                    return;
                            }
                        }
                    }));
                    s70Var2.setGravity(17);
                    e10.addView(s70Var2, mf.k(14.0f, 15.0f, 14.0f, 7.0f, -1, -2));
                    if (currentTime < starsSubscription.until_date) {
                        i13 = i18;
                        s70 s70Var3 = new s70(parentActivity, resourceProvider);
                        org.telegram.ui.ActionBar.r6.V(s70Var3, i19, resourceProvider);
                        org.telegram.ui.ActionBar.r6.H(s70Var3, i17, resourceProvider);
                        s70Var3.setTextSize(1, 14.0f);
                        s70Var3.setText(bd.a0(null, null, 2131744995, bd.u(starsSubscription.until_date, false)));
                        s70Var3.setSingleLine(false);
                        s70Var3.setMaxLines(4);
                        s70Var3.setGravity(17);
                        e10.addView(s70Var3, mf.k(26.0f, 7.0f, 26.0f, 15.0f, -1, -2));
                        if (starsSubscription.chat_invite_hash != null || starsSubscription.invoice_slug != null) {
                            gi.d dVar = new gi.d(parentActivity, resourceProvider, true);
                            dVar.setRoundRadius(24);
                            r32 = 0;
                            dVar.i(bd.M0(2131745021, null), false, true);
                            e10.addView(dVar, mf.o(-1, 48));
                            dVar.setOnClickListener(new ia(dVar, starsSubscription, i13, t2VarArr3, resourceProvider, zArr, parentActivity));
                            h.O = e10;
                            t2VarArr3[r32] = h;
                            h.U0 = r32;
                            h.setOnDismissListener(new ja(i13, vaVar));
                            t2VarArr3[r32].N();
                            T = LaunchActivity.T();
                            if (!org.telegram.messenger.g0.Q1() && !org.telegram.messenger.g0.u1(T)) {
                                t2VarArr3[r32].a0(T);
                            }
                            t2VarArr3[r32].show();
                        }
                    } else if (starsSubscription.can_refulfill) {
                        s70 s70Var4 = new s70(parentActivity, resourceProvider);
                        org.telegram.ui.ActionBar.r6.V(s70Var4, i19, resourceProvider);
                        org.telegram.ui.ActionBar.r6.H(s70Var4, i17, resourceProvider);
                        s70Var4.setTextSize(1, 14.0f);
                        s70Var4.setText(bd.a0(null, null, z12 ? 2131745016 : 2131744991, bd.u(starsSubscription.until_date, false)));
                        s70Var4.setSingleLine(false);
                        s70Var4.setMaxLines(4);
                        s70Var4.setGravity(17);
                        e10.addView(s70Var4, mf.k(26.0f, 7.0f, 26.0f, 15.0f, -1, -2));
                        gi.d dVar2 = new gi.d(parentActivity, resourceProvider, true);
                        dVar2.i(bd.M0(z12 ? 2131745017 : 2131744992, null), false, true);
                        e10.addView(dVar2, mf.o(-1, 48));
                        i13 = i18;
                        dVar2.setOnClickListener(new fa(dVar2, i18, starsSubscription, t2VarArr3, o10, parentActivity, resourceProvider, z11, str4));
                    } else {
                        final boolean z17 = z11;
                        i13 = i18;
                        if (starsSubscription.bot_canceled) {
                            s70 s70Var5 = new s70(parentActivity, resourceProvider);
                            org.telegram.ui.ActionBar.r6.V(s70Var5, org.telegram.ui.ActionBar.k6.kk, resourceProvider);
                            org.telegram.ui.ActionBar.r6.H(s70Var5, i17, resourceProvider);
                            s70Var5.setTextSize(1, 14.0f);
                            s70Var5.setText(bd.M0(z17 ? 2131745014 : 2131745019, null));
                            s70Var5.setSingleLine(false);
                            s70Var5.setMaxLines(4);
                            s70Var5.setGravity(17);
                            e10.addView(s70Var5, mf.k(26.0f, 7.0f, 26.0f, 15.0f, -1, -2));
                        } else if (starsSubscription.canceled) {
                            s70 s70Var6 = new s70(parentActivity, resourceProvider);
                            org.telegram.ui.ActionBar.r6.V(s70Var6, org.telegram.ui.ActionBar.k6.kk, resourceProvider);
                            org.telegram.ui.ActionBar.r6.H(s70Var6, i17, resourceProvider);
                            s70Var6.setTextSize(1, 14.0f);
                            s70Var6.setText(bd.M0(2131745008, null));
                            s70Var6.setSingleLine(false);
                            s70Var6.setMaxLines(4);
                            s70Var6.setGravity(17);
                            e10.addView(s70Var6, mf.k(26.0f, 7.0f, 26.0f, 15.0f, -1, -2));
                            if (starsSubscription.chat_invite_hash != null || starsSubscription.invoice_slug != null) {
                                gi.d dVar3 = new gi.d(parentActivity, resourceProvider, true);
                                dVar3.i(bd.M0(2131744990, null), false, true);
                                e10.addView(dVar3, mf.o(-1, 48));
                                dVar3.setOnClickListener(new ga(dVar3, starsSubscription, i13, t2VarArr3, chat2, str4));
                            }
                        } else {
                            final TLRPC.Chat chat3 = chat2;
                            s70 s70Var7 = new s70(parentActivity, resourceProvider);
                            org.telegram.ui.ActionBar.r6.V(s70Var7, i19, resourceProvider);
                            org.telegram.ui.ActionBar.r6.H(s70Var7, i17, resourceProvider);
                            s70Var7.setTextSize(1, 14.0f);
                            s70Var7.setText(bd.a0(null, null, 2131745011, bd.u(starsSubscription.until_date, false)));
                            s70Var7.setSingleLine(false);
                            s70Var7.setMaxLines(4);
                            s70Var7.setGravity(17);
                            e10.addView(s70Var7, mf.k(26.0f, 7.0f, 26.0f, 15.0f, -1, -2));
                            final gi.d dVar4 = new gi.d(parentActivity, resourceProvider, false);
                            dVar4.i(bd.M0(2131745012, null), false, true);
                            dVar4.setTextColorKey(org.telegram.ui.ActionBar.k6.kk);
                            e10.addView(dVar4, mf.o(-1, 48));
                            dVar4.setOnClickListener(new View.OnClickListener() { // from class: ci.ha
                                @Override // android.view.View.OnClickListener
                                public final void onClick(View view) {
                                    final gi.d dVar5 = dVar4;
                                    if (dVar5.R) {
                                        return;
                                    }
                                    dVar5.setLoading(true);
                                    TL_stars.TL_changeStarsSubscription tL_changeStarsSubscription = new TL_stars.TL_changeStarsSubscription();
                                    tL_changeStarsSubscription.canceled = Boolean.TRUE;
                                    tL_changeStarsSubscription.peer = new TLRPC.TL_inputPeerSelf();
                                    final TL_stars.StarsSubscription starsSubscription2 = starsSubscription;
                                    tL_changeStarsSubscription.subscription_id = starsSubscription2.id;
                                    final int i21 = i13;
                                    ConnectionsManager connectionsManager = ConnectionsManager.getInstance(i21);
                                    final TLObject tLObject = chat3;
                                    final boolean z18 = z17;
                                    final boolean z19 = z12;
                                    final org.telegram.ui.ActionBar.t2[] t2VarArr4 = t2VarArr3;
                                    connectionsManager.sendRequest(tL_changeStarsSubscription, new RequestDelegate() { // from class: ci.oa
                                        @Override // org.telegram.tgnet.RequestDelegate
                                        public final void run(TLObject tLObject2, TLRPC.TL_error tL_error) {
                                            org.telegram.messenger.g0.h3(new pa(i21, dVar5, tLObject, starsSubscription2, z18, z19, t2VarArr4));
                                        }
                                    });
                                }
                            });
                        }
                    }
                    r32 = 0;
                    h.O = e10;
                    t2VarArr3[r32] = h;
                    h.U0 = r32;
                    h.setOnDismissListener(new ja(i13, vaVar));
                    t2VarArr3[r32].N();
                    T = LaunchActivity.T();
                    if (!org.telegram.messenger.g0.Q1()) {
                        t2VarArr3[r32].a0(T);
                    }
                    t2VarArr3[r32].show();
                }
                TLRPC.User a24 = hp.s1(i16).a2(Long.valueOf(o10));
                u8Var.r(a24);
                k9Var.e(a24, u8Var);
            }
            i10 = i16;
            t2VarArr = t2VarArr2;
            frameLayout.addView(k9Var, mf.e(100, 100, 17));
            Drawable drawable3 = parentActivity.getResources().getDrawable(R.drawable.star_small_outline);
            org.telegram.ui.ActionBar.r6.y(frameLayout, drawable3, org.telegram.ui.ActionBar.k6.h5, resourceProvider, PorterDuff.Mode.SRC_IN);
            Drawable drawable22 = parentActivity.getResources().getDrawable(R.drawable.star_small_inner);
            if (starsSubscription.photo == null) {
            }
            TextView textView3 = new TextView(parentActivity);
            org.telegram.messenger.k5.n(textView3, org.telegram.ui.ActionBar.k6.j5, resourceProvider, 1, 20.0f);
            textView3.setGravity(17);
            if (TextUtils.isEmpty(starsSubscription.title)) {
            }
            e10.addView(textView3, mf.t(-1, -2, 17, 20, 0, 20, 4));
            TextView textView22 = new TextView(parentActivity);
            textView22.setTextSize(1, 14.0f);
            textView22.setGravity(17);
            org.telegram.ui.ActionBar.r6.V(textView22, org.telegram.ui.ActionBar.k6.B6, resourceProvider);
            TL_stars.TL_starsSubscriptionPricing tL_starsSubscriptionPricing2 = starsSubscription.pricing;
            i11 = tL_starsSubscriptionPricing2.period;
            if (i11 != 2592000) {
            }
            e10.addView(textView22, mf.t(-1, -2, 17, 20, 0, 20, 4));
            ?? rx0Var2 = new rx0(parentActivity, resourceProvider);
            s70 s70Var8 = new s70(parentActivity, resourceProvider);
            s70Var8.setPadding(org.telegram.messenger.g0.L(12.66f), org.telegram.messenger.g0.L(9.33f), org.telegram.messenger.g0.L(12.66f), org.telegram.messenger.g0.L(9.33f));
            s70Var8.setEllipsize(TextUtils.TruncateAt.END);
            int i172 = org.telegram.ui.ActionBar.k6.Uc;
            org.telegram.ui.ActionBar.r6.V(s70Var8, i172, resourceProvider);
            org.telegram.ui.ActionBar.r6.H(s70Var8, i172, resourceProvider);
            s70Var8.setTextSize(1, 14.0f);
            s70Var8.setSingleLine(true);
            s70Var8.setDisablePaddingsOffsetY(true);
            org.telegram.ui.h5 h5Var22 = new org.telegram.ui.h5(24.0f, i12, s70Var8);
            if (o10 < 0) {
            }
            z14 = z13;
            int i182 = i12;
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder("x  " + ((Object) str2));
            spannableStringBuilder2.setSpan(h5Var, 0, 1, 33);
            final org.telegram.ui.ActionBar.t2[] t2VarArr32 = t2VarArr;
            spannableStringBuilder2.setSpan(new wa(t2VarArr32, o10), 3, spannableStringBuilder2.length(), 33);
            s70Var8.setText(spannableStringBuilder2);
            if (!z14) {
            }
            if (o10 >= 0) {
            }
            str3 = null;
            rx0Var2.c(bd.M0(2131744986, str3), bd.a0(null, null, 2131742793, bd.E0().s0().format(new Date((starsSubscription.until_date - starsSubscription.pricing.period) * 1000)), bd.E0().p0().format(new Date((starsSubscription.until_date - starsSubscription.pricing.period) * 1000))), null, null);
            currentTime = ConnectionsManager.getInstance(i182).getCurrentTime();
            rx0Var2.c(bd.M0((!starsSubscription.canceled || starsSubscription.bot_canceled) ? 2131744979 : currentTime > ((long) starsSubscription.until_date) ? 2131744980 : 2131744978, null), bd.a0(null, null, 2131742793, bd.E0().s0().format(new Date(starsSubscription.until_date * 1000)), bd.E0().p0().format(new Date(starsSubscription.until_date * 1000))), null, null);
            e10.addView(rx0Var2, mf.k(0.0f, 17.0f, 0.0f, 0.0f, -1, -2));
            s70 s70Var22 = new s70(parentActivity, resourceProvider);
            int i192 = org.telegram.ui.ActionBar.k6.z6;
            org.telegram.ui.ActionBar.r6.V(s70Var22, i192, resourceProvider);
            org.telegram.ui.ActionBar.r6.H(s70Var22, i172, resourceProvider);
            s70Var22.setTextSize(1, 14.0f);
            final int i202 = 0;
            s70Var22.setText(org.telegram.messenger.g0.U2(bd.M0(2131744936, null), new Runnable() { // from class: ci.ea
                @Override // java.lang.Runnable
                public final void run() {
                    Object obj;
                    int i21 = i202;
                    Activity activity = parentActivity;
                    switch (i21) {
                        case 0:
                            sf.c.t(activity, bd.M0(2131744976, null));
                            return;
                        default:
                            if (activity.isFinishing()) {
                                return;
                            }
                            Handler handler = e0.d.g;
                            Method method = e0.d.f;
                            int i22 = Build.VERSION.SDK_INT;
                            if (i22 >= 28) {
                                activity.recreate();
                                return;
                            }
                            if (((i22 != 26 && i22 != 27) || method != null) && (e0.d.e != null || e0.d.d != null)) {
                                try {
                                    Object obj2 = e0.d.c.get(activity);
                                    if (obj2 != null && (obj = e0.d.b.get(activity)) != null) {
                                        Application application = activity.getApplication();
                                        e0.c cVar = new e0.c(activity);
                                        application.registerActivityLifecycleCallbacks(cVar);
                                        handler.post(new l9.u(4, cVar, obj2));
                                        try {
                                            if (i22 == 26 || i22 == 27) {
                                                Boolean bool = Boolean.FALSE;
                                                method.invoke(obj, obj2, null, null, 0, bool, null, null, bool, bool);
                                            } else {
                                                activity.recreate();
                                            }
                                            handler.post(new l9.u(5, application, cVar));
                                            return;
                                        } finally {
                                            handler.post(new l9.u(5, application, cVar));
                                        }
                                    }
                                } catch (Throwable unused) {
                                }
                            }
                            activity.recreate();
                            return;
                    }
                }
            }));
            s70Var22.setGravity(17);
            e10.addView(s70Var22, mf.k(14.0f, 15.0f, 14.0f, 7.0f, -1, -2));
            if (currentTime < starsSubscription.until_date) {
            }
            r32 = 0;
            h.O = e10;
            t2VarArr32[r32] = h;
            h.U0 = r32;
            h.setOnDismissListener(new ja(i13, vaVar));
            t2VarArr32[r32].N();
            T = LaunchActivity.T();
            if (!org.telegram.messenger.g0.Q1()) {
            }
            t2VarArr32[r32].show();
        }
    }

    public static void D0(wb wbVar, r31 r31Var, Boolean bool, String str) {
        if (wbVar.getParentActivity() == null) {
            return;
        }
        if (bool.booleanValue()) {
            org.telegram.ui.Components.fc.a0(wbVar).I(R.raw.stars_topup, bd.M0(2131745169, null), org.telegram.messenger.g0.X2(bd.G((int) r31Var.B, "StarsAcquiredInfo", new Object[0]))).j();
            wbVar.i0.c(true);
            e9.y(wbVar.currentAccount, false).S(true);
        } else if (str != null) {
            org.telegram.ui.Components.fc.a0(wbVar).Q(R.raw.error, 36, bd.a0(null, null, 2131743888, str)).j();
        }
    }

    public static void H0(rx0 rx0Var, int i3, TL_stars.StarGift starGift, org.telegram.ui.ActionBar.e6 e6Var) {
        CharSequence charSequence;
        TextView textView = (TextView) ((ox0) rx0Var.c(bd.M0(2131750308, null), "", null, null).getChildAt(1)).getChildAt(0);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("x ");
        x70 x70Var = new x70(textView, org.telegram.messenger.g0.L(90.0f), 0, e6Var);
        x70Var.a(org.telegram.ui.ActionBar.k6.r1(0.21f, textView.getPaint().getColor()), org.telegram.ui.ActionBar.k6.r1(0.08f, textView.getPaint().getColor()));
        spannableStringBuilder.setSpan(x70Var, 0, 1, 33);
        textView.setText(spannableStringBuilder, TextView.BufferType.SPANNABLE);
        if (starGift.sold_out) {
            if (!(starGift instanceof TL_stars.TL_starGiftUnique)) {
                int i10 = starGift.availability_remains;
                textView.setText(i10 <= 0 ? bd.H(',', "Gift2Availability2ValueNone", starGift.availability_total) : bd.K("Gift2Availability4Value", i10, ',', bd.E(starGift.availability_total, ',')));
                return;
            }
            if (starGift.availability_remains <= 0) {
                charSequence = bd.H(',', "Gift2QuantityIssuedNone", starGift.availability_total);
            } else {
                charSequence = bd.H(',', "Gift2QuantityIssued1", starGift.availability_issued) + bd.H(',', "Gift2QuantityIssued2", starGift.availability_total);
            }
            textView.setText(charSequence);
            return;
        }
        final e9 y9 = e9.y(i3, false);
        final long j10 = starGift.id;
        final ai.v2 v2Var = new ai.v2(textView, 13);
        final boolean[] zArr = {false};
        final cs[] csVarArr = new cs[1];
        csVarArr[0] = new cs() { // from class: ci.m8
            @Override // org.telegram.messenger.cs
            public final void didReceivedNotification(int i11, int i12, Object[] objArr) {
                int i13;
                e9 e9Var;
                TL_stars.StarGift J;
                boolean[] zArr2 = zArr;
                if (zArr2[0] || i11 != (i13 = hs.F3) || (J = (e9Var = e9.this).J(j10)) == null) {
                    return;
                }
                zArr2[0] = true;
                hs.f(e9Var.a).n(csVarArr[0], i13);
                v2Var.a(J);
            }
        };
        int i11 = y9.a;
        hs f10 = hs.f(i11);
        cs csVar = csVarArr[0];
        int i12 = hs.F3;
        f10.b(csVar, i12);
        TL_stars.StarGift J = y9.J(j10);
        if (J != null) {
            zArr[0] = true;
            hs.f(i11).n(csVarArr[0], i12);
            v2Var.a(J);
        }
    }

    public static void I0(SpannableStringBuilder spannableStringBuilder, TextView textView, String str) {
        spannableStringBuilder.append(" ");
        SpannableString spannableString = new SpannableString(str);
        spannableString.setSpan(new ya(textView.getCurrentTextColor(), str), 0, spannableString.length(), 33);
        spannableStringBuilder.append((CharSequence) spannableString);
    }

    public static SpannableStringBuilder L0(TL_stars.StarsAmount starsAmount) {
        return M0(starsAmount, 0.777f, ',');
    }

    public static SpannableStringBuilder M0(TL_stars.StarsAmount starsAmount, float f10, char c2) {
        double d;
        int i3;
        if (x0 == null) {
            x0 = new DecimalFormat("0.###", new DecimalFormatSymbols(Locale.US));
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        if (starsAmount instanceof TL_stars.TL_starsTonAmount) {
            long j10 = starsAmount.amount;
            if (j10 % 1000000000 == 0) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(starsAmount.negative() ? "-" : "");
                sb2.append(bd.E(Math.abs(starsAmount.amount / 1000000000), c2));
                spannableStringBuilder.append((CharSequence) sb2.toString());
                return spannableStringBuilder;
            }
            String format = x0.format(j10 / 1.0E9d);
            spannableStringBuilder.append((CharSequence) format);
            int indexOf = format.indexOf(".");
            if (indexOf >= 0) {
                spannableStringBuilder.setSpan(new RelativeSizeSpan(f10), indexOf, spannableStringBuilder.length(), 33);
                return spannableStringBuilder;
            }
        } else {
            long j11 = starsAmount.amount;
            int i10 = starsAmount.nanos;
            boolean z10 = false;
            if (i10 < 0 && j11 > 0) {
                i3 = -1;
                d = 1.0E9d;
            } else if (i10 <= 0 || j11 >= 0) {
                d = 1.0E9d;
                i3 = 0;
            } else {
                d = 1.0E9d;
                i3 = 1;
            }
            long j12 = i3 + j11;
            if (j11 != 0 ? j11 < 0 : i10 < 0) {
                z10 = true;
            }
            if (i10 == 0) {
                StringBuilder sb3 = new StringBuilder();
                sb3.append(z10 ? "-" : "");
                sb3.append(bd.E(Math.abs(j12), c2));
                spannableStringBuilder.append((CharSequence) sb3.toString());
                return spannableStringBuilder;
            }
            StringBuilder sb4 = new StringBuilder();
            sb4.append(z10 ? "-" : "");
            sb4.append(bd.E(Math.abs(j12), c2));
            spannableStringBuilder.append((CharSequence) sb4.toString());
            DecimalFormat decimalFormat = x0;
            int i11 = starsAmount.nanos;
            double d10 = i11;
            if (i11 < 0) {
                d10 += d;
            }
            String format2 = decimalFormat.format(d10 / d);
            int indexOf2 = format2.indexOf(".");
            if (indexOf2 >= 0) {
                int length = spannableStringBuilder.length();
                spannableStringBuilder.append((CharSequence) format2.substring(indexOf2));
                spannableStringBuilder.setSpan(new RelativeSizeSpan(f10), length + 1, spannableStringBuilder.length(), 33);
            }
        }
        return spannableStringBuilder;
    }

    public static SpannableStringBuilder N0(TL_stars.StarsAmount starsAmount, float f10, char c2) {
        double d;
        int i3;
        if (x0 == null) {
            x0 = new DecimalFormat("0.################", new DecimalFormatSymbols(Locale.US));
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        if (starsAmount instanceof TL_stars.TL_starsTonAmount) {
            String format = x0.format(starsAmount.amount / 1.0E9d);
            spannableStringBuilder.append((CharSequence) format);
            int indexOf = format.indexOf(".");
            if (indexOf >= 0) {
                spannableStringBuilder.setSpan(new RelativeSizeSpan(f10), indexOf, spannableStringBuilder.length(), 33);
                return spannableStringBuilder;
            }
        } else {
            long j10 = starsAmount.amount;
            int i10 = starsAmount.nanos;
            if (i10 < 0 && j10 > 0) {
                i3 = -1;
                d = 1.0E9d;
            } else if (i10 <= 0 || j10 >= 0) {
                d = 1.0E9d;
                i3 = 0;
            } else {
                d = 1.0E9d;
                i3 = 1;
            }
            long j11 = i3 + j10;
            boolean z10 = j10 != 0 ? j10 < 0 : i10 < 0;
            if (Math.abs(j11) > 1000 || starsAmount.nanos == 0) {
                if (starsAmount.amount <= 1000) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(z10 ? "-" : "");
                    sb2.append(bd.E(Math.abs(j11), c2));
                    spannableStringBuilder.append((CharSequence) sb2.toString());
                    return spannableStringBuilder;
                }
                StringBuilder sb3 = new StringBuilder();
                sb3.append(z10 ? "-" : "");
                sb3.append(org.telegram.messenger.g0.o0((int) Math.abs(j11), 0));
                spannableStringBuilder.append((CharSequence) sb3.toString());
                return spannableStringBuilder;
            }
            StringBuilder sb4 = new StringBuilder();
            sb4.append(z10 ? "-" : "");
            sb4.append(bd.E(Math.abs(j11), c2));
            spannableStringBuilder.append((CharSequence) sb4.toString());
            DecimalFormat decimalFormat = x0;
            int i11 = starsAmount.nanos;
            double d10 = i11;
            if (i11 < 0) {
                d10 += d;
            }
            String format2 = decimalFormat.format(d10 / d);
            int indexOf2 = format2.indexOf(".");
            if (indexOf2 >= 0) {
                int length = spannableStringBuilder.length();
                String substring = format2.substring(indexOf2);
                if (substring.length() > 1) {
                    spannableStringBuilder.append((CharSequence) substring.substring(0, Math.min(substring.length(), 3)));
                    spannableStringBuilder.setSpan(new RelativeSizeSpan(f10), length + 1, spannableStringBuilder.length(), 33);
                }
            }
        }
        return spannableStringBuilder;
    }

    public static SpannableStringBuilder O0(TL_stars.StarsAmount starsAmount) {
        double d;
        int i3;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        if (starsAmount instanceof TL_stars.TL_starsTonAmount) {
            if (x0 == null) {
                x0 = new DecimalFormat("0.################", new DecimalFormatSymbols(Locale.US));
            }
            String format = x0.format(starsAmount.amount / 1.0E9d);
            spannableStringBuilder.append((CharSequence) format);
            int indexOf = format.indexOf(".");
            if (indexOf >= 0) {
                spannableStringBuilder.setSpan(new RelativeSizeSpan(0.777f), indexOf, spannableStringBuilder.length(), 33);
            }
            return spannableStringBuilder;
        }
        long j10 = starsAmount.amount;
        int i10 = starsAmount.nanos;
        boolean z10 = false;
        if (i10 < 0 && j10 > 0) {
            i3 = -1;
            d = 1.0E9d;
        } else if (i10 <= 0 || j10 >= 0) {
            d = 1.0E9d;
            i3 = 0;
        } else {
            d = 1.0E9d;
            i3 = 1;
        }
        long j11 = i3 + j10;
        if (j10 != 0 ? j10 < 0 : i10 < 0) {
            z10 = true;
        }
        if (i10 == 0) {
            spannableStringBuilder.append((CharSequence) bd.H(',', "Stars", (int) j10));
            return spannableStringBuilder;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(z10 ? "-" : "");
        sb2.append(bd.E(Math.abs(j11), ','));
        spannableStringBuilder.append((CharSequence) sb2.toString());
        if (x0 == null) {
            x0 = new DecimalFormat("0.################", new DecimalFormatSymbols(Locale.US));
        }
        DecimalFormat decimalFormat = x0;
        int i11 = starsAmount.nanos;
        double d10 = i11;
        if (i11 < 0) {
            d10 += d;
        }
        String format2 = decimalFormat.format(d10 / d);
        int indexOf2 = format2.indexOf(".");
        if (indexOf2 >= 0) {
            int length = spannableStringBuilder.length();
            spannableStringBuilder.append((CharSequence) format2.substring(indexOf2));
            spannableStringBuilder.setSpan(new RelativeSizeSpan(0.777f), length + 1, spannableStringBuilder.length(), 33);
        }
        spannableStringBuilder.append((CharSequence) " ").append((CharSequence) bd.M0(2131745094, null));
        return spannableStringBuilder;
    }

    public static String P0(long j10) {
        if (w0 == null) {
            w0 = new DecimalFormat("0.####", new DecimalFormatSymbols(Locale.US));
        }
        if (j10 % 1000000000 != 0) {
            return w0.format(j10 / 1.0E9d);
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(j10 < 0 ? "-" : "");
        sb2.append(bd.E(Math.abs(j10 / 1000000000), ','));
        return sb2.toString();
    }

    /* JADX WARN: Code restructure failed: missing block: B:119:0x0199, code lost:
    
        r6 = 2131744961;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static String Q0(int i3, boolean z10, TL_stars.StarsTransaction starsTransaction) {
        if (starsTransaction.stargift_drop_original_details) {
            return bd.M0(2131744942, null);
        }
        if (starsTransaction.posts_search) {
            return bd.M0(2131744946, null);
        }
        if (starsTransaction.premium_gift) {
            return bd.M0(2131744945, null);
        }
        if (starsTransaction.phonegroup_message) {
            return bd.M0(starsTransaction.reaction ? 2131744954 : 2131744955, null);
        }
        if (starsTransaction.paid_message) {
            return bd.H(',', "StarsTransactionMessageFee", starsTransaction.paid_messages);
        }
        if (starsTransaction.floodskip) {
            return bd.M0(2131744969, null);
        }
        if (!starsTransaction.extended_media.isEmpty()) {
            return bd.M0(2131745214, null);
        }
        TL_stars.StarsAmount starsAmount = starsTransaction.amount;
        int i10 = starsTransaction.flags;
        if ((131072 & i10) == 0 && (65536 & i10) != 0) {
            return bd.a0(null, null, 2131745171, ii.k.J0(starsTransaction.starref_commission_permille));
        }
        if (starsTransaction.stargift != null) {
            if (starsTransaction.stargift_prepaid_upgrade) {
                return bd.M0(2131749938, null);
            }
            if (starsTransaction.refund) {
                return bd.M0(starsTransaction.stargift_auction_bid ? 2131749937 : starsAmount.amount > 0 ? starsTransaction.stargift_upgrade ? 2131749934 : 2131749935 : 2131749936, null);
            }
            return bd.M0(starsTransaction.stargift_auction_bid ? 2131749940 : starsAmount.amount > 0 ? 2131749939 : starsTransaction.stargift_upgrade ? 2131749931 : 2131749932, null);
        }
        if (starsTransaction.subscription) {
            int i11 = starsTransaction.subscription_period;
            if (i11 == 2592000) {
                return bd.M0(2131745173, null);
            }
            if (i11 == 300) {
                return "5-minute subscription fee";
            }
            if (i11 == 60) {
                return "Minute subscription fee";
            }
        }
        if ((i10 & TLObject.FLAG_13) != 0) {
            return bd.M0(2131745103, null);
        }
        if (starsTransaction.gift) {
            if (starsTransaction.sent_by != null) {
                return bd.M0(l10.B(hp.s1(i3).a2(Long.valueOf(org.telegram.messenger.m5.o(starsTransaction.sent_by)))) ? 2131745111 : 2131745112, null);
            }
            return bd.M0(2131745112, null);
        }
        String str = starsTransaction.title;
        if (str != null) {
            return str;
        }
        long o10 = org.telegram.messenger.m5.o(starsTransaction.peer.peer);
        if (o10 != 0) {
            if (o10 >= 0) {
                return l10.p(hp.s1(h10.t0).a2(Long.valueOf(o10)));
            }
            TLRPC.Chat M0 = hp.s1(h10.t0).M0(Long.valueOf(-o10));
            return M0 == null ? "" : M0.title;
        }
        TL_stars.StarsTransactionPeer starsTransactionPeer = starsTransaction.peer;
        if (!(starsTransactionPeer instanceof TL_stars.TL_starsTransactionPeerFragment)) {
            return starsTransactionPeer instanceof TL_stars.TL_starsTransactionPeerPremiumBot ? bd.M0(2131744971, null) : starsTransactionPeer instanceof TL_stars.TL_starsTransactionPeerAds ? bd.M0(2131744972, null) : bd.M0(2131744933, null);
        }
        if (!z10) {
            if (starsTransaction.refund) {
            }
            return bd.M0(r6, null);
        }
        int i12 = 2131744931;
        return bd.M0(i12, null);
    }

    public static SpannableStringBuilder R0(CharSequence charSequence, float f10) {
        return S0(charSequence, f10, 0.0f, 1.0f);
    }

    public static SpannableStringBuilder S0(CharSequence charSequence, float f10, float f11, float f12) {
        if (charSequence == null) {
            return null;
        }
        SpannableStringBuilder spannableStringBuilder = !(charSequence instanceof SpannableStringBuilder) ? new SpannableStringBuilder(charSequence) : (SpannableStringBuilder) charSequence;
        SpannableString spannableString = new SpannableString("💎 ");
        wp wpVar = new wp(R.drawable.diamond, 0);
        wpVar.d = false;
        wpVar.r = 0.0f;
        wpVar.s = f11;
        wpVar.H = f12;
        wpVar.I = f10;
        wpVar.J = f10;
        spannableString.setSpan(wpVar, 0, spannableString.length() - 1, 33);
        org.telegram.messenger.g0.M2(spannableStringBuilder, "💎", "💎️");
        org.telegram.messenger.g0.M2(spannableStringBuilder, "💎", "💎 ");
        org.telegram.messenger.g0.M2(spannableStringBuilder, spannableString, "💎");
        org.telegram.messenger.g0.M2(spannableStringBuilder, "XTR", "XTR ");
        org.telegram.messenger.g0.M2(spannableStringBuilder, spannableString, "XTR");
        return spannableStringBuilder;
    }

    public static SpannableStringBuilder T0(CharSequence charSequence) {
        return U0(charSequence, 1.13f, null);
    }

    public static SpannableStringBuilder U0(CharSequence charSequence, float f10, wp[] wpVarArr) {
        return X0(false, charSequence, f10, wpVarArr, 0.0f, 1.0f);
    }

    public static SpannableStringBuilder V0(CharSequence charSequence, boolean z10) {
        return X0(z10, charSequence, 1.13f, null, 0.0f, 1.0f);
    }

    public static SpannableStringBuilder W0(TL_stars.StarsAmount starsAmount, CharSequence charSequence) {
        return X0(starsAmount instanceof TL_stars.TL_starsTonAmount, charSequence, 1.25f, null, 0.0f, 1.0f);
    }

    public static SpannableStringBuilder X0(boolean z10, CharSequence charSequence, float f10, wp[] wpVarArr, float f11, float f12) {
        wp wpVar;
        if (charSequence == null) {
            return null;
        }
        SpannableStringBuilder spannableStringBuilder = !(charSequence instanceof SpannableStringBuilder) ? new SpannableStringBuilder(charSequence) : (SpannableStringBuilder) charSequence;
        SpannableString spannableString = new SpannableString((z10 ? "TON" : "⭐").concat(" "));
        if (wpVarArr == null || (wpVar = wpVarArr[0]) == null) {
            wpVar = new wp(z10 ? R.drawable.mini_gram_72 : R.drawable.msg_premium_liststar, 0);
            if (wpVarArr != null) {
                wpVarArr[0] = wpVar;
            }
        }
        wpVar.r = 0.0f;
        wpVar.s = f11;
        wpVar.H = f12;
        if (z10) {
            wpVar.d = false;
            float f13 = f10 * 0.2f;
            wpVar.I = f13;
            wpVar.J = f13;
        } else {
            wpVar.I = f10;
            wpVar.J = f10;
        }
        spannableString.setSpan(wpVar, 0, spannableString.length() - 1, 33);
        org.telegram.messenger.g0.M2(spannableStringBuilder, "⭐", "⭐️");
        org.telegram.messenger.g0.M2(spannableStringBuilder, "⭐", "⭐ ");
        org.telegram.messenger.g0.M2(spannableStringBuilder, spannableString, "⭐");
        org.telegram.messenger.g0.M2(spannableStringBuilder, "XTR", "XTR ");
        org.telegram.messenger.g0.M2(spannableStringBuilder, spannableString, "XTR");
        return spannableStringBuilder;
    }

    public static SpannableStringBuilder Y0(boolean z10, String str, wp[] wpVarArr) {
        wp wpVar;
        if (str == null) {
            return null;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str);
        if (wpVarArr == null || (wpVar = wpVarArr[0]) == null) {
            wpVar = new wp(z10 ? R.drawable.mini_gram_72 : R.drawable.msg_premium_liststar, 0);
            float f10 = z10 ? 0.222f : 1.13f;
            float f11 = z10 ? 0.222f : 1.13f;
            wpVar.I = f10;
            wpVar.J = f11;
        }
        if (z10) {
            wpVar.d = false;
        }
        if (wpVarArr != null) {
            wpVarArr[0] = wpVar;
        }
        SpannableString spannableString = new SpannableString("⭐ ");
        spannableString.setSpan(wpVar, 0, spannableString.length() - 1, 33);
        org.telegram.messenger.g0.M2(spannableStringBuilder, "⭐", "⭐️");
        org.telegram.messenger.g0.M2(spannableStringBuilder, "⭐", "⭐ ");
        org.telegram.messenger.g0.M2(spannableStringBuilder, spannableString, "⭐");
        org.telegram.messenger.g0.M2(spannableStringBuilder, "XTR", "XTR ");
        org.telegram.messenger.g0.M2(spannableStringBuilder, spannableString, "XTR");
        return spannableStringBuilder;
    }

    public static SpannableStringBuilder Z0(TL_stars.StarsAmount starsAmount, String str, wp[] wpVarArr) {
        return a1(starsAmount instanceof TL_stars.TL_starsTonAmount, str, 0.8f, wpVarArr);
    }

    public static SpannableStringBuilder a1(boolean z10, CharSequence charSequence, float f10, wp[] wpVarArr) {
        wp wpVar;
        if (charSequence == null) {
            return null;
        }
        SpannableStringBuilder spannableStringBuilder = !(charSequence instanceof SpannableStringBuilder) ? new SpannableStringBuilder(charSequence) : (SpannableStringBuilder) charSequence;
        String str = z10 ? "TON" : "⭐";
        int i3 = z10 ? R.drawable.mini_gram_72 : R.drawable.star_small_inner;
        SpannableString spannableString = new SpannableString(str.concat(" "));
        if (wpVarArr == null || (wpVar = wpVarArr[0]) == null) {
            if (wpVarArr == null || wpVarArr.length <= 0) {
                wpVar = new wp(i3, 0);
            } else {
                wpVar = new wp(i3, 0);
                wpVarArr[0] = wpVar;
            }
        }
        wpVar.d = false;
        if (z10) {
            f10 *= 0.33f;
        }
        wpVar.I = f10;
        wpVar.J = f10;
        spannableString.setSpan(wpVar, 0, spannableString.length() - 1, 33);
        org.telegram.messenger.g0.M2(spannableStringBuilder, "⭐", "⭐️");
        org.telegram.messenger.g0.M2(spannableStringBuilder, "⭐", "⭐ ");
        org.telegram.messenger.g0.M2(spannableStringBuilder, spannableString, "⭐");
        org.telegram.messenger.g0.M2(spannableStringBuilder, "XTR", "XTR ");
        org.telegram.messenger.g0.M2(spannableStringBuilder, spannableString, "XTR");
        return spannableStringBuilder;
    }

    public static ma b1(View view, ImageReceiver imageReceiver, String str, boolean z10) {
        int i3 = imageReceiver.d;
        final ka kaVar = new ka(z10, i3, str, imageReceiver, new boolean[1]);
        kaVar.run();
        final int i10 = 0;
        Runnable h = hs.f(i3).h(view, z10 ? hs.X2 : hs.W2, new u10() { // from class: ci.la
            @Override // org.telegram.messenger.u10
            public final void a(Object obj) {
                switch (i10) {
                    case 0:
                        kaVar.run();
                        break;
                    default:
                        kaVar.run();
                        break;
                }
            }
        });
        final int i11 = 1;
        return new ma(h, hs.f(i3).h(view, hs.y0, new u10() { // from class: ci.la
            @Override // org.telegram.messenger.u10
            public final void a(Object obj) {
                switch (i11) {
                    case 0:
                        kaVar.run();
                        break;
                    default:
                        kaVar.run();
                        break;
                }
            }
        }), 0);
    }

    public static void c1(ImageReceiver imageReceiver, TLRPC.Document document, int i3) {
        if (document == null) {
            imageReceiver.f();
            return;
        }
        TLRPC.PhotoSize w10 = org.telegram.messenger.w7.w(document.thumbs, i3, false, null, false);
        imageReceiver.r0(org.telegram.messenger.ac.b(document), com.google.android.recaptcha.internal.a.i(i3, "_", i3), org.telegram.messenger.ac.c(w10, document), com.google.android.recaptcha.internal.a.i(i3, "_", i3), org.telegram.messenger.t5.d(document.thumbs, org.telegram.ui.ActionBar.k6.a7, 0.35f, false), 0L, null, null, 0);
    }

    public static void d1(ImageReceiver imageReceiver, TL_stars.StarGift starGift, int i3) {
        c1(imageReceiver, starGift == null ? null : starGift.getDocument(), i3);
    }

    public static void e1(org.telegram.ui.Components.k9 k9Var, ImageReceiver imageReceiver, long j10) {
        b1(k9Var, imageReceiver, j10 <= 1000 ? "2⃣" : j10 < 2500 ? "3⃣" : "4⃣", false);
    }

    public static ma f1(org.telegram.ui.Components.k9 k9Var, ImageReceiver imageReceiver, int i3) {
        return b1(k9Var, imageReceiver, i3 != 3 ? i3 != 6 ? i3 != 12 ? i3 != 24 ? "1⃣" : "5⃣" : "4⃣" : "3⃣" : "2⃣", false);
    }

    public static void g1(org.telegram.ui.Components.k9 k9Var, ImageReceiver imageReceiver, long j10) {
        b1(k9Var, imageReceiver, j10 <= 10000000000L ? "2⃣" : j10 <= 50000000000L ? "1⃣" : "3⃣", true);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v0, types: [android.view.View, android.view.ViewGroup, android.widget.LinearLayout] */
    /* JADX WARN: Type inference failed for: r18v5 */
    /* JADX WARN: Type inference failed for: r18v6 */
    /* JADX WARN: Type inference failed for: r18v7 */
    /* JADX WARN: Type inference failed for: r1v5, types: [android.view.View, android.widget.TextView] */
    public static void h1(Context context, int i3, long j10, TL_stories.Boost boost, org.telegram.ui.ActionBar.e6 e6Var) {
        boolean z10;
        if (context == null) {
            return;
        }
        org.telegram.ui.ActionBar.t2 l10 = org.telegram.messenger.k5.l(1, context, e6Var, false);
        ?? f10 = org.telegram.messenger.k5.f(context, 1);
        f10.setPadding(0, org.telegram.messenger.g0.L(20.0f), 0, org.telegram.messenger.g0.L(4.0f));
        f10.setClipChildren(false);
        f10.setClipToPadding(false);
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setClipChildren(false);
        frameLayout.setClipToPadding(false);
        f10.addView(frameLayout, mf.t(-1, hs.g2, 7, 0, 0, 0, 10));
        bb bbVar = new bb(context, 70, 0, 0);
        frameLayout.addView(bbVar, mf.c(-1.0f, -1));
        wg.m mVar = new wg.m(context, 1, 2);
        wg.f fVar = mVar.b;
        fVar.z = org.telegram.ui.ActionBar.k6.Tk;
        fVar.A = org.telegram.ui.ActionBar.k6.Uk;
        fVar.b();
        mVar.setStarParticlesView(bbVar);
        frameLayout.addView(mVar, mf.d(hs.A2, 170.0f, 17, 0.0f, 32.0f, 0.0f, 24.0f));
        mVar.setPaused(false);
        TextView textView = new TextView(context);
        org.telegram.messenger.k5.n(textView, org.telegram.ui.ActionBar.k6.j5, e6Var, 1, 20.0f);
        textView.setGravity(17);
        org.telegram.ui.ActionBar.t2[] t2VarArr = new org.telegram.ui.ActionBar.t2[1];
        textView.setText(bd.H(' ', "BoostStars", (int) boost.stars));
        ?? f11 = org.telegram.messenger.camera.q.f(f10, textView, mf.t(-1, -2, 17, 20, 0, 20, 4), context);
        f11.setBackground(org.telegram.ui.ActionBar.k6.d0(org.telegram.messenger.g0.L(20.0f), -6915073));
        f11.setTextColor(-1);
        f11.setTextSize(1, 11.33f);
        f11.setPadding(org.telegram.messenger.g0.L(4.0f), 0, org.telegram.messenger.g0.L(8.33f), 0);
        f11.setGravity(17);
        f11.setTypeface(org.telegram.messenger.g0.o());
        StringBuilder sb2 = new StringBuilder("x");
        int i10 = boost.multiplier;
        if (i10 == 0) {
            i10 = 1;
        }
        sb2.append(bd.H(' ', "BoostingBoostsCount", i10));
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(sb2.toString());
        wp wpVar = new wp(R.drawable.mini_boost_badge, 2);
        float L = org.telegram.messenger.g0.L(0.66f);
        wpVar.r = 0.0f;
        wpVar.s = L;
        spannableStringBuilder.setSpan(wpVar, 0, 1, 33);
        f11.setText(spannableStringBuilder);
        f10.addView(f11, mf.t(-2, 20, 17, 20, 4, 20, 4));
        rx0 rx0Var = new rx0(context, e6Var);
        rx0Var.n(bd.M0(2131753627, null), i3, j10, new o9(t2VarArr, j10, 6));
        rx0Var.c(bd.M0(2131753626, null), bd.G((int) boost.stars, "BoostStars", new Object[0]), null, null);
        if (boost.giveaway_msg_id != 0) {
            String M0 = bd.M0(2131753615, null);
            String M02 = bd.M0(2131753614, null);
            z10 = 0;
            ai.r1 r1Var = new ai.r1(t2VarArr, j10, boost, 4);
            t2VarArr = t2VarArr;
            rx0Var.i(M0, M02, r1Var);
        } else {
            z10 = 0;
        }
        String M03 = bd.M0(2131753662, null);
        String format = bd.E0().s0().format(new Date(boost.date * 1000));
        String format2 = bd.E0().p0().format(new Date(boost.date * 1000));
        Object[] objArr = new Object[2];
        objArr[z10] = format;
        objArr[1] = format2;
        rx0Var.c(M03, bd.a0(null, null, 2131742793, objArr), null, null);
        String M04 = bd.M0(2131753607, null);
        String format3 = bd.E0().s0().format(new Date(boost.expires * 1000));
        String format4 = bd.E0().p0().format(new Date(boost.expires * 1000));
        Object[] objArr2 = new Object[2];
        objArr2[z10] = format3;
        objArr2[1] = format4;
        rx0Var.c(M04, bd.a0(null, null, 2131742793, objArr2), null, null);
        f10.addView(rx0Var, mf.k(16.0f, 17.0f, 16.0f, 0.0f, -1, -2));
        s70 s70Var = new s70(context, e6Var);
        org.telegram.ui.ActionBar.r6.V(s70Var, org.telegram.ui.ActionBar.k6.z6, e6Var);
        org.telegram.ui.ActionBar.r6.H(s70Var, org.telegram.ui.ActionBar.k6.Uc, e6Var);
        s70Var.setTextSize(1, 14.0f);
        s70Var.setText(org.telegram.messenger.g0.U2(bd.M0(2131744936, null), new ai.s1(context, 3)));
        s70Var.setGravity(17);
        f10.addView(s70Var, mf.k(14.0f, 15.0f, 14.0f, 7.0f, -1, -2));
        gi.d dVar = new gi.d(context, e6Var, true);
        dVar.i(bd.M0(2131747839, null), z10, true);
        dVar.setOnClickListener(new t9(t2VarArr, 1));
        f10.addView(dVar, mf.k(16.0f, 8.0f, 16.0f, 0.0f, -1, 48));
        l10.O = f10;
        t2VarArr[0] = l10;
        l10.U0 = false;
        l10.N();
        org.telegram.ui.ActionBar.d2 T = LaunchActivity.T();
        if (!org.telegram.messenger.g0.Q1() && !org.telegram.messenger.g0.u1(T)) {
            t2VarArr[0].a0(T);
        }
        mVar.setPaused(false);
        t2VarArr[0].show();
        t2VarArr[0].n(new d1(mVar, 10));
    }

    public static a1 i1(Context context, int i3, TL_stars.TL_starGiftUnique tL_starGiftUnique, n10 n10Var, org.telegram.ui.ActionBar.e6 e6Var) {
        dg.b bVar = dg.b.a;
        a1 a1Var = new a1(context, e6Var, i3, tL_starGiftUnique == null ? dg.a.g(((org.telegram.messenger.j0) hp.s1(i3).x7.p.b).c, bVar) : tL_starGiftUnique.resale_ton_only ? tL_starGiftUnique.getResellAmount(dg.b.b) : tL_starGiftUnique.getResellAmount(bVar), new ai.o1(10, n10Var, r8));
        a1[] a1VarArr = {a1Var};
        a1Var.show();
        return a1VarArr[0];
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void j1(Context context, long j10, boolean z10, final n10 n10Var, org.telegram.ui.ActionBar.e6 e6Var) {
        org.telegram.ui.ActionBar.t2[] t2VarArr;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        org.telegram.ui.ActionBar.t2 l10 = org.telegram.messenger.k5.l(1, context, e6Var, false);
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        linearLayout.setClipChildren(false);
        linearLayout.setClipToPadding(false);
        linearLayout.setPadding(org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(8.0f));
        TextView textView = new TextView(context);
        textView.setTypeface(org.telegram.messenger.g0.o());
        gi.d dVar = null;
        textView.setText(bd.M0(2131747740, null));
        textView.setTextSize(1, 20.0f);
        int i3 = org.telegram.ui.ActionBar.k6.G6;
        org.telegram.ui.ActionBar.r6.V(textView, i3, e6Var);
        linearLayout.addView(textView, mf.k(4.0f, 0.0f, 4.0f, 18.0f, -1, -2));
        final EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(context);
        gb0 gb0Var = new gb0(context, e6Var);
        gb0Var.setForceForceUseCenter(true);
        gb0Var.setText(bd.M0(2131747741, null));
        gb0Var.setLeftPadding(org.telegram.messenger.g0.L(36.0f));
        org.telegram.ui.ActionBar.r6.V(editTextBoldCursor, i3, e6Var);
        editTextBoldCursor.setCursorSize(org.telegram.messenger.g0.L(20.0f));
        editTextBoldCursor.setCursorWidth(1.5f);
        editTextBoldCursor.setBackground(null);
        editTextBoldCursor.setTextSize(1, 18.0f);
        editTextBoldCursor.setMaxLines(1);
        int L = org.telegram.messenger.g0.L(16.0f);
        editTextBoldCursor.setPadding(org.telegram.messenger.g0.L(6.0f), L, L, L);
        editTextBoldCursor.setInputType(2);
        editTextBoldCursor.setTypeface(Typeface.DEFAULT);
        editTextBoldCursor.setSelectAllOnFocus(true);
        org.telegram.ui.ActionBar.r6.D(editTextBoldCursor, org.telegram.ui.ActionBar.k6.ig, e6Var);
        org.telegram.ui.ActionBar.r6.m(editTextBoldCursor, 36, org.telegram.ui.ActionBar.k6.jg, e6Var);
        editTextBoldCursor.setGravity(bd.a0 ? 5 : 3);
        editTextBoldCursor.setOnFocusChangeListener(new y9(gb0Var, editTextBoldCursor, objArr2 == true ? 1 : 0));
        LinearLayout linearLayout2 = new LinearLayout(context);
        linearLayout2.setOrientation(0);
        ImageView imageView = new ImageView(context);
        imageView.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        imageView.setImageResource(R.drawable.star_small_inner);
        linearLayout2.addView(imageView, mf.q(-2, -2, 0.0f, 19, 14, 0, 0, 0));
        linearLayout2.addView(editTextBoldCursor, mf.p(-1, -2, 1.0f, hs.E1));
        gb0Var.e(editTextBoldCursor);
        gb0Var.addView(linearLayout2, mf.e(-1, -2, 48));
        linearLayout.addView(gb0Var, mf.o(-1, -2));
        TextView textView2 = new TextView(context);
        textView2.setTextSize(1, 16.0f);
        org.telegram.ui.ActionBar.r6.V(textView2, org.telegram.ui.ActionBar.k6.A6, null);
        gb0Var.addView(textView2, mf.d(-2, -2.0f, 21, 0.0f, 0.0f, 14.0f, 0.0f));
        s70 s70Var = new s70(context, null);
        s70Var.setText(org.telegram.messenger.g0.H2(org.telegram.messenger.g0.U2(bd.M0(2131747743, null), new ai.s1(context, 4)), true));
        s70Var.setTextSize(1, 12.0f);
        org.telegram.ui.ActionBar.r6.V(s70Var, org.telegram.ui.ActionBar.k6.z6, e6Var);
        org.telegram.ui.ActionBar.r6.H(s70Var, org.telegram.ui.ActionBar.k6.Uc, e6Var);
        linearLayout.addView(s70Var, mf.k(14.0f, 3.0f, 14.0f, 24.0f, -1, -2));
        final gi.d h = org.telegram.messenger.k5.h(24, context, e6Var, true);
        h.i(bd.M0(j10 > 0 ? 2131747739 : 2131747745, null), false, true);
        linearLayout.addView(h, mf.o(-1, 48));
        if (j10 > 0 && z10) {
            gi.d h7 = org.telegram.messenger.k5.h(24, context, e6Var, false);
            h7.i(bd.M0(2131747744, null), false, false);
            linearLayout.addView(h7, mf.k(0.0f, 4.0f, 0.0f, 0.0f, -1, 48));
            dVar = h7;
        }
        l10.O = linearLayout;
        final org.telegram.ui.ActionBar.t2[] t2VarArr2 = {l10};
        editTextBoldCursor.setText(j10 <= 0 ? "" : Long.toString(j10));
        editTextBoldCursor.addTextChangedListener(new za(editTextBoldCursor, gb0Var, j10, z10, h, textView2));
        final boolean[] zArr = {false};
        editTextBoldCursor.setOnEditorActionListener(new TextView.OnEditorActionListener() { // from class: ci.z9
            @Override // android.widget.TextView.OnEditorActionListener
            public final boolean onEditorAction(TextView textView3, int i10, KeyEvent keyEvent) {
                if (i10 != 5) {
                    return false;
                }
                boolean[] zArr2 = zArr;
                if (zArr2[0]) {
                    return true;
                }
                zArr2[0] = true;
                h.setLoading(true);
                EditTextBoldCursor editTextBoldCursor2 = editTextBoldCursor;
                n10Var.a(Long.valueOf(Long.parseLong(editTextBoldCursor2.getText().toString())), new da(editTextBoldCursor2, t2VarArr2, 1));
                return true;
            }
        });
        aa aaVar = new aa(zArr, n10Var, editTextBoldCursor, h, t2VarArr2);
        EditTextBoldCursor editTextBoldCursor2 = editTextBoldCursor;
        h.setOnClickListener(aaVar);
        if (dVar != null) {
            gi.d dVar2 = dVar;
            aa aaVar2 = new aa(zArr, n10Var, dVar2, editTextBoldCursor2, t2VarArr2);
            editTextBoldCursor2 = editTextBoldCursor2;
            t2VarArr = t2VarArr2;
            dVar2.setOnClickListener(aaVar2);
        } else {
            t2VarArr = t2VarArr2;
        }
        t2VarArr[0].N();
        t2VarArr[0].setOnDismissListener(new ba(editTextBoldCursor2, objArr == true ? 1 : 0));
        t2VarArr[0].show();
        org.telegram.ui.ActionBar.d2 Q = LaunchActivity.Q();
        org.telegram.messenger.g0.i3(new da(t2VarArr, editTextBoldCursor2), Q instanceof wm ? ((wm) Q).pa() : false ? 200L : 80L);
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type update terminated with stack overflow, arg: (r11v17 ?? I:org.telegram.ui.Components.rx0), method size: 4330
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:77)
        */
    public static org.telegram.ui.ActionBar.t2 k1(android.content.Context r59, boolean r60, long r61, int r63, org.telegram.tgnet.tl.TL_stars.StarsTransaction r64, org.telegram.ui.ActionBar.e6 r65) {
        /*
            Method dump skipped, instructions count: 4330
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ci.wb.k1(android.content.Context, boolean, long, int, org.telegram.tgnet.tl.TL_stars$StarsTransaction, org.telegram.ui.ActionBar.e6):org.telegram.ui.ActionBar.t2");
    }

    public static void l1(Activity activity, int i3, int i10, TLRPC.TL_messageActionPaymentRefunded tL_messageActionPaymentRefunded, org.telegram.ui.ActionBar.e6 e6Var) {
        TL_stars.StarsTransaction starsTransaction = new TL_stars.StarsTransaction();
        starsTransaction.title = null;
        starsTransaction.description = null;
        starsTransaction.photo = null;
        TL_stars.TL_starsTransactionPeer tL_starsTransactionPeer = new TL_stars.TL_starsTransactionPeer();
        starsTransaction.peer = tL_starsTransactionPeer;
        tL_starsTransactionPeer.peer = tL_messageActionPaymentRefunded.peer;
        starsTransaction.date = i10;
        starsTransaction.amount = TL_stars.StarsAmount.ofStars(tL_messageActionPaymentRefunded.total_amount);
        starsTransaction.id = tL_messageActionPaymentRefunded.charge.id;
        starsTransaction.refund = true;
        k1(activity, false, 0L, i3, starsTransaction, e6Var);
    }

    public static void m1(Context context, int i3, TLRPC.TL_payments_paymentReceiptStars tL_payments_paymentReceiptStars, org.telegram.ui.ActionBar.e6 e6Var) {
        TL_stars.StarsTransaction starsTransaction = new TL_stars.StarsTransaction();
        starsTransaction.title = tL_payments_paymentReceiptStars.title;
        starsTransaction.description = tL_payments_paymentReceiptStars.description;
        starsTransaction.photo = tL_payments_paymentReceiptStars.photo;
        TL_stars.TL_starsTransactionPeer tL_starsTransactionPeer = new TL_stars.TL_starsTransactionPeer();
        starsTransaction.peer = tL_starsTransactionPeer;
        tL_starsTransactionPeer.peer = hp.s1(i3).z1(tL_payments_paymentReceiptStars.bot_id);
        starsTransaction.date = tL_payments_paymentReceiptStars.date;
        starsTransaction.amount = TL_stars.StarsAmount.ofStars(-tL_payments_paymentReceiptStars.total_amount);
        starsTransaction.id = tL_payments_paymentReceiptStars.transaction_id;
        k1(context, false, 0L, i3, starsTransaction, e6Var);
    }

    public static CharSequence s1(SpannableStringBuilder spannableStringBuilder, boolean z10) {
        z4.o c2;
        if (z10 && com.google.android.recaptcha.internal.a.u(spannableStringBuilder)) {
            for (wp wpVar : (wp[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), wp.class)) {
                Drawable drawable = wpVar.c;
                if (drawable != null && !(drawable instanceof z4.o) && (c2 = z4.o.c(org.telegram.messenger.t0.b.getResources(), R.drawable.mini_gram_72_white, null)) != null) {
                    c2.setBounds(wpVar.c.getBounds());
                    wpVar.c = c2;
                    wpVar.d = false;
                }
            }
        }
        return spannableStringBuilder;
    }

    public final void J0() {
        q1();
        tj0 tj0Var = this.c;
        if (tj0Var == null || this.V == null || tj0Var.getLayoutParams() == null) {
            return;
        }
        int C = org.telegram.messenger.camera.q.C(48.0f, this.c0, -org.telegram.messenger.g0.L(8.0f));
        int C2 = org.telegram.messenger.camera.q.C(48.0f, this.d0, -org.telegram.messenger.g0.L(8.0f));
        org.telegram.messenger.g0.B3(this.c, 0, C, 0, C2);
        tj0 tj0Var2 = this.c;
        int i3 = -C;
        tj0Var2.setPadding(tj0Var2.getPaddingLeft(), i3, this.c.getPaddingRight(), this.d0 - C2);
        this.V.z(i3, -C2);
    }

    public final void K0(ArrayList arrayList, f41 f41Var) {
        tj0 tj0Var;
        n1("FILL_BEFORE");
        gt0 gt0Var = this.V;
        boolean z10 = gt0Var != null && gt0Var.f0;
        this.b0 = -1;
        if (getParentActivity() == null) {
            return;
        }
        e9 y9 = e9.y(this.currentAccount, false);
        ArrayList arrayList2 = y9.v;
        org.telegram.ui.Components.voip.r0 r0Var = (org.telegram.ui.Components.voip.r0) super.o0(getParentActivity());
        r31 r31Var = new r31(-2);
        r31Var.c = r0Var;
        arrayList.add(r31Var);
        arrayList.add(r31.k(this.j0));
        gi.d dVar = this.s0;
        if (dVar != null) {
            dVar.setVisibility(getMessagesController().X5 ? 0 : 8);
        }
        arrayList.add(r31.C(null));
        if (getMessagesController().g6) {
            arrayList.add(ii.g.i(-4, getThemedColor(org.telegram.ui.ActionBar.k6.ik), ln.i0(bd.M0(2131743776, null)), bd.M0(2131743777, null)));
            arrayList.add(r31.C(null));
        }
        if (y9.e && !arrayList2.isEmpty()) {
            arrayList.add(r31.u(bd.M0(2131745213, null)));
            for (int i3 = 0; i3 < arrayList2.size(); i3++) {
                TL_stars.StarsSubscription starsSubscription = (TL_stars.StarsSubscription) arrayList2.get(i3);
                int i10 = ob.b;
                r31 K = r31.K(ob.class);
                K.G = starsSubscription;
                arrayList.add(K);
            }
            if (y9.x) {
                arrayList.add(r31.q(arrayList.size(), 33));
            } else if (!y9.y) {
                r31 c2 = r31.c(-3, R.drawable.arrow_more, bd.M0(2131745212, null));
                c2.q = true;
                arrayList.add(c2);
            }
            arrayList.add(r31.C(null));
        }
        boolean N = y9.N(0);
        this.t0 = N;
        if (N) {
            this.b0 = arrayList.size();
            arrayList.add(r31.n(this.W, -2));
            if (z10 && (tj0Var = this.c) != null) {
                d1 d1Var = this.g0;
                tj0Var.removeCallbacks(d1Var);
                this.c.post(d1Var);
            }
        } else {
            arrayList.add(r31.m(this.h0));
        }
        n1("FILL_AFTER");
    }

    @Override // org.telegram.ui.l00, org.telegram.ui.ActionBar.d2
    public final View createView(final Context context) {
        TLRPC.TL_starsRevenueStatus tL_starsRevenueStatus;
        final int i3 = 0;
        this.H = false;
        this.F = org.telegram.messenger.g0.L(238.0f);
        gt0 gt0Var = new gt0(context);
        this.V = gt0Var;
        char c2 = 1;
        char c10 = 1;
        char c11 = 1;
        char c12 = 1;
        char c13 = 1;
        char c14 = 1;
        gt0Var.setDebugLoggingEnabled(true);
        this.V.setCommonInsetsManagedExternally(true);
        if (!this.e0) {
            org.telegram.ui.ActionBar.q4 q4Var = this.parentLayout;
            this.c0 = (q4Var == null || !((ActionBarLayout) q4Var).T0) ? org.telegram.messenger.g0.m : 0;
            this.d0 = org.telegram.messenger.g0.n;
        }
        this.V.setGeometry(new android.support.v4.media.c(this, 9));
        this.V.z(-org.telegram.messenger.camera.q.C(48.0f, this.c0, -org.telegram.messenger.g0.L(8.0f)), -org.telegram.messenger.camera.q.C(48.0f, this.d0, -org.telegram.messenger.g0.L(8.0f)));
        gt0 gt0Var2 = this.V;
        gt0Var2.getClass();
        this.W = new ai.x2(26, context, gt0Var2);
        this.U = new vb(context, this.currentAccount, false, 0L, getClassGuid(), getResourceProvider(), this.V);
        this.h0 = new ai.x2(c14 == true ? 1 : 0, context, this);
        super.createView(context);
        k00 k00Var = this.s;
        getBaseSimpleGlass().f(k00Var, this.c, this.simpleActionBar, this.resourceProvider);
        this.simpleActionBar.setBackground(null);
        this.E.bringToFront();
        this.simpleActionBar.bringToFront();
        getBaseSimpleGlass().m = this.V;
        this.c.setCaptureSectionsDecoratorAllowed(true);
        this.U.setGlassEngine(this.glassEngine);
        getBaseSimpleGlass().n = new g(c12 == true ? 1 : 0, this, new f(c13 == true ? 1 : 0, k00Var));
        View view = this.U.d;
        View view2 = new View(getParentActivity());
        this.X = view2;
        view2.setAlpha(0.0f);
        gt0 gt0Var3 = this.V;
        gt0Var3.addView(this.X, gt0Var3.indexOfChild(view), mf.e(-1, 0, 48));
        this.X.setBackground(getBaseSimpleGlass().a(this.X));
        k9 k9Var = new k9(this, 0);
        xq xqVar = xq.h;
        qe.a aVar = new qe.a(0, k9Var, xqVar, 380L, false);
        this.Y = aVar;
        this.Z = new qe.a(1, new k9(this, 1), xqVar, 380L, false);
        int i10 = 2;
        this.a0 = new qe.a(2, new k9(this, 2), xqVar, 380L, false);
        aVar.a(this.c.canScrollVertically(-1) || this.simpleActionBar.s(), false);
        this.Z.a(this.V.f0, false);
        this.c.j(new ai.j5(this, 8));
        q1();
        gh.g c15 = getBaseSimpleGlass().c.c(view, null, false);
        c15.p(cd.m(this.resourceProvider));
        c15.q(org.telegram.messenger.g0.L(9.66f));
        c15.r(org.telegram.messenger.g0.L(18.0f));
        view.setBackground(c15);
        org.telegram.ui.ActionBar.q4 q4Var2 = this.parentLayout;
        if (q4Var2 != null && ((ActionBarLayout) q4Var2).U0) {
            this.simpleActionBar.setBackButtonImage(R.drawable.ic_ab_close);
        }
        FrameLayout frameLayout = new FrameLayout(context);
        this.S = frameLayout;
        frameLayout.setClickable(true);
        wg.m mVar = new wg.m(context, 1, 2);
        this.T = mVar;
        wg.f fVar = mVar.b;
        fVar.z = org.telegram.ui.ActionBar.k6.Tk;
        fVar.A = org.telegram.ui.ActionBar.k6.Uk;
        fVar.b();
        this.T.setStarParticlesView(this.e);
        this.S.addView(this.T, mf.d(hs.U2, 190.0f, 17, 0.0f, 12.0f, 0.0f, 24.0f));
        j0(bd.M0(2131744225, null), org.telegram.messenger.g0.H2(org.telegram.messenger.g0.U2(bd.M0(2131744222, null), new ai.s1(context, c11 == true ? 1 : 0)), true), this.S, null);
        this.c.setOverScrollMode(2);
        u4.k kVar = new u4.k();
        kVar.m = false;
        kVar.C = false;
        kVar.o(xqVar);
        kVar.n(350L);
        this.c.setItemAnimator(kVar);
        this.c.setOnItemClickListener(new ai.j6(this, i10));
        gz gzVar = new gz(getParentActivity());
        this.i0 = gzVar;
        this.s.addView(gzVar, mf.c(-1.0f, -1));
        e9 y9 = e9.y(this.currentAccount, false);
        LinearLayout linearLayout = new LinearLayout(getParentActivity());
        this.j0 = linearLayout;
        linearLayout.setOrientation(1);
        this.j0.setPadding(0, org.telegram.messenger.g0.L(24.0f), 0, org.telegram.messenger.g0.L(10.0f));
        org.telegram.ui.Components.h6 h6Var = new org.telegram.ui.Components.h6(getParentActivity(), false, true, false);
        this.l0 = h6Var;
        h6Var.setTypeface(org.telegram.messenger.g0.o());
        this.l0.setTextSize(org.telegram.messenger.g0.L(32.0f));
        this.l0.setGravity(17);
        org.telegram.ui.ActionBar.r6.Z(this.l0, org.telegram.ui.ActionBar.k6.G6, this.resourceProvider);
        this.k0 = new SpannableStringBuilder("S");
        k50 k50Var = new k50(42.0f, this.currentAccount, this.l0);
        ch0 ch0Var = new ch0(R.raw.star_reaction, org.telegram.messenger.g0.L(42.0f), org.telegram.messenger.g0.L(42.0f));
        ImageReceiver imageReceiver = k50Var.b;
        imageReceiver.w0(ch0Var);
        imageReceiver.W(2);
        k50Var.f = false;
        k50Var.h = -org.telegram.messenger.g0.L(3.0f);
        this.k0.setSpan(k50Var, 0, 1, 33);
        this.j0.addView(this.l0, mf.d(-1, 40.0f, 17, 24.0f, 0.0f, 24.0f, 0.0f));
        TextView textView = new TextView(getParentActivity());
        this.m0 = textView;
        textView.setTextSize(1, 14.0f);
        this.m0.setGravity(17);
        this.m0.setText(bd.M0(2131742800, null));
        org.telegram.ui.ActionBar.r6.V(this.m0, org.telegram.ui.ActionBar.k6.z6, this.resourceProvider);
        this.j0.addView(this.m0, mf.d(-1, -2.0f, 17, 24.0f, 0.0f, 24.0f, 0.0f));
        FrameLayout frameLayout2 = new FrameLayout(getParentActivity());
        ai.o2 o2Var = new ai.o2(i10, getParentActivity(), this);
        this.o0 = o2Var;
        frameLayout2.addView(o2Var);
        gi.d dVar = new gi.d(getParentActivity(), this.resourceProvider, true);
        this.p0 = dVar;
        dVar.f();
        this.p0.i("", false, true);
        this.p0.setOnClickListener(new View.OnClickListener(this) { // from class: ci.u9
            public final /* synthetic */ wb b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view3) {
                switch (i3) {
                    case 0:
                        wb.A0(this.b, context);
                        break;
                    default:
                        new nb(context, this.b.resourceProvider).show();
                        break;
                }
            }
        });
        this.o0.addView(this.p0, mf.e(-1, 48, hs.E1));
        s51 s51Var = new s51(4, getParentActivity(), this);
        this.q0 = s51Var;
        frameLayout2.addView(s51Var);
        gi.d dVar2 = new gi.d(getParentActivity(), this.resourceProvider, true);
        this.r0 = dVar2;
        dVar2.f();
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("x  ");
        spannableStringBuilder.setSpan(new wp(R.drawable.mini_topup, 2), 0, 1, 33);
        spannableStringBuilder.append((CharSequence) bd.M0(2131744975, null));
        this.r0.i(spannableStringBuilder, false, true);
        gi.d dVar3 = this.r0;
        final char c16 = c10 == true ? 1 : 0;
        dVar3.setOnClickListener(new View.OnClickListener(this) { // from class: ci.u9
            public final /* synthetic */ wb b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view3) {
                switch (c16) {
                    case 0:
                        wb.A0(this.b, context);
                        break;
                    default:
                        new nb(context, this.b.resourceProvider).show();
                        break;
                }
            }
        });
        this.q0.addView(this.r0, mf.q(-1, 48, 17.0f, 1, 0, 0, 8, 0));
        gi.d dVar4 = new gi.d(getParentActivity(), this.resourceProvider, true);
        this.n0 = dVar4;
        dVar4.f();
        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder("x  ");
        spannableStringBuilder2.setSpan(new wp(R.drawable.mini_stats, 2), 0, 1, 33);
        spannableStringBuilder2.append((CharSequence) bd.M0(2131745032, null));
        this.n0.i(spannableStringBuilder2, false, true);
        this.n0.setOnClickListener(new View.OnClickListener(this) { // from class: ci.ca
            public final /* synthetic */ wb b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view3) {
                switch (i3) {
                    case 0:
                        wb wbVar = this.b;
                        wbVar.presentFragment(new v(0, wbVar.getUserConfig().e()));
                        break;
                    default:
                        wb.B0(this.b);
                        break;
                }
            }
        });
        this.q0.addView(this.n0, mf.q(-1, 48, 17.0f, 1, 0, 0, 0, 0));
        this.j0.addView(frameLayout2, mf.d(-1, 48.0f, 17, 20.0f, 17.0f, 20.0f, 0.0f));
        gi.d dVar5 = new gi.d(getParentActivity(), this.resourceProvider, false);
        this.s0 = dVar5;
        dVar5.f();
        SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder();
        spannableStringBuilder3.append((CharSequence) "G  ");
        spannableStringBuilder3.setSpan(new wp(R.drawable.menu_stars_gift, 0), 0, 1, 33);
        spannableStringBuilder3.append((CharSequence) bd.M0(2131744223, null));
        this.s0.i(spannableStringBuilder3, false, true);
        gi.d dVar6 = this.s0;
        final char c17 = c2 == true ? 1 : 0;
        dVar6.setOnClickListener(new View.OnClickListener(this) { // from class: ci.ca
            public final /* synthetic */ wb b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view3) {
                switch (c17) {
                    case 0:
                        wb wbVar = this.b;
                        wbVar.presentFragment(new v(0, wbVar.getUserConfig().e()));
                        break;
                    default:
                        wb.B0(this.b);
                        break;
                }
            }
        });
        this.j0.addView(this.s0, mf.d(-1, 48.0f, 17, 20.0f, 8.0f, 20.0f, 0.0f));
        o1();
        ai.f6 f6Var = this.v0;
        if (f6Var != null) {
            f6Var.O(false);
        }
        i0.g(this.currentAccount).r(getUserConfig().e());
        TLRPC.TL_payments_starsRevenueStats h = i0.g(this.currentAccount).h(getUserConfig().e(), false);
        p1(y9.p().amount > 0 && h != null && (tL_starsRevenueStatus = h.status) != null && tL_starsRevenueStatus.overall_revenue.positive(), false);
        return this.fragmentView;
    }

    @Override // org.telegram.messenger.cs
    public final void didReceivedNotification(int i3, int i10, Object... objArr) {
        int i11 = hs.v3;
        int i12 = hs.A3;
        int i13 = hs.z3;
        if (i3 == i13 || i3 == i12 || i3 == i11) {
            n1("NOTIFICATION_" + i3);
        }
        if (i3 == i11) {
            u0();
            ai.f6 f6Var = this.v0;
            if (f6Var != null) {
                f6Var.O(true);
            }
            h0();
            return;
        }
        if (i3 == i13) {
            e9 y9 = e9.y(this.currentAccount, false);
            if (this.t0 != y9.N(0)) {
                this.t0 = y9.N(0);
                u0();
                ai.f6 f6Var2 = this.v0;
                if (f6Var2 != null) {
                    f6Var2.O(false);
                }
                h0();
                return;
            }
            return;
        }
        if (i3 == i12) {
            ai.f6 f6Var3 = this.v0;
            if (f6Var3 != null) {
                f6Var3.O(true);
                return;
            }
            return;
        }
        if (i3 == hs.y3) {
            o1();
        } else if (i3 == hs.C3 && getUserConfig().e() == ((Long) objArr[0]).longValue()) {
            o1();
        }
    }

    @Override // org.telegram.ui.l00
    public final void h0() {
        gt0 gt0Var;
        n1("RESTORE_BEFORE");
        super.h0();
        if (this.f0 && (gt0Var = this.V) != null && this.b0 != -1) {
            gt0Var.a();
        }
        this.f0 = false;
        n1("RESTORE_AFTER");
    }

    @Override // org.telegram.ui.l00
    public final void i0() {
        this.s.addView(this.V, mf.c(-1.0f, -1));
        this.V.u(this.c, new k9(this, 3));
        gt0 gt0Var = this.V;
        vb vbVar = this.U;
        gt0Var.x(vbVar, vbVar.b, new a3.j(22));
        this.V.y(this.U.d);
        this.U.d.setLayoutParams(mf.d(-1, -2.0f, 48, -4.0f, 0.0f, -4.0f, 0.0f));
        J0();
    }

    @Override // org.telegram.ui.l00, org.telegram.ui.ActionBar.d2
    public final boolean isSwipeBackEnabled(MotionEvent motionEvent) {
        gt0 gt0Var = this.V;
        return gt0Var == null || motionEvent == null || gt0Var.j(motionEvent.getX(), motionEvent.getY()) || !this.V.c() || this.U.b.b == 0;
    }

    @Override // org.telegram.ui.l00
    public final u4.h0 k0() {
        ai.f6 f6Var = new ai.f6(this, this.c, getParentActivity(), this.currentAccount, this.classGuid, new ai.c(this, 18), getResourceProvider(), 1);
        this.v0 = f6Var;
        f6Var.r = false;
        return f6Var;
    }

    @Override // org.telegram.ui.l00
    public final u4.b0 l0(Context context) {
        gt0 gt0Var = this.V;
        gt0Var.getClass();
        return new kg.f0(5, gt0Var, false);
    }

    @Override // org.telegram.ui.l00
    public final vg.t1 m0() {
        return new bb(getParentActivity(), 75, 1, 0);
    }

    public final void n1(String str) {
        if (this.V == null) {
            return;
        }
        StringBuilder u10 = a1.g.u("Stars event=", str, " row=");
        u10.append(this.b0);
        u10.append(" hasTransactions=");
        u10.append(this.t0);
        u10.append(" savedPosition=");
        u10.append(this.Q);
        u10.append(" savedOffset=");
        u10.append(this.R);
        u10.append(" savedPinned=");
        u10.append(this.f0);
        u10.append(" boundaryAttached=");
        ai.x2 x2Var = this.W;
        u10.append((x2Var == null || x2Var.getParent() == null) ? false : true);
        u10.append(" boundaryTop=");
        ai.x2 x2Var2 = this.W;
        u10.append(x2Var2 == null ? 0 : x2Var2.getTop());
        u10.append(" boundaryHeight=");
        ai.x2 x2Var3 = this.W;
        u10.append(x2Var3 == null ? 0 : x2Var3.getHeight());
        Log.d("SiblingScroll", u10.toString());
        gt0 gt0Var = this.V;
        if (gt0Var.a) {
            gt0Var.b = Math.max(gt0Var.b, Math.min(60, Math.max(0, 30)));
            gt0Var.f(str, null, 0, 0, true);
        }
    }

    @Override // org.telegram.ui.l00
    public final View o0(Context context) {
        throw null;
    }

    public final void o1() {
        TLRPC.TL_starsRevenueStatus tL_starsRevenueStatus;
        boolean z10 = false;
        e9 y9 = e9.y(this.currentAccount, false);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) this.k0);
        spannableStringBuilder.append((CharSequence) M0(y9.p(), 0.66f, ' '));
        this.l0.setText(spannableStringBuilder);
        this.p0.i(bd.M0(y9.p().amount > 0 ? 2131745160 : 2131745161, null), true, true);
        TLRPC.TL_payments_starsRevenueStats h = i0.g(this.currentAccount).h(getUserConfig().e(), false);
        if (h != null && (tL_starsRevenueStatus = h.status) != null && tL_starsRevenueStatus.overall_revenue.positive()) {
            z10 = true;
        }
        p1(z10, true);
    }

    @Override // org.telegram.ui.ActionBar.d2
    public final boolean onFragmentCreate() {
        hs.f(this.currentAccount).c(this, hs.v3);
        hs.f(this.currentAccount).c(this, hs.y3);
        hs.f(this.currentAccount).c(this, hs.z3);
        hs.f(this.currentAccount).c(this, hs.A3);
        hs.f(this.currentAccount).c(this, hs.C3);
        e9.y(this.currentAccount, false).S(true);
        e9.y(this.currentAccount, false).R();
        e9.y(this.currentAccount, false).z();
        return super.onFragmentCreate();
    }

    @Override // org.telegram.ui.ActionBar.d2
    public final void onFragmentDestroy() {
        tj0 tj0Var = this.c;
        if (tj0Var != null) {
            tj0Var.removeCallbacks(this.g0);
        }
        super.onFragmentDestroy();
        hs.f(this.currentAccount).n(this, hs.v3);
        hs.f(this.currentAccount).n(this, hs.y3);
        hs.f(this.currentAccount).n(this, hs.z3);
        hs.f(this.currentAccount).n(this, hs.A3);
        hs.f(this.currentAccount).n(this, hs.C3);
    }

    @Override // org.telegram.ui.l00, org.telegram.ui.ActionBar.d2
    public final void onInsets(int i3, int i10, int i11, int i12) {
        this.e0 = true;
        this.c0 = i10;
        this.d0 = i12;
        J0();
    }

    @Override // org.telegram.ui.l00, org.telegram.ui.ActionBar.d2
    public final void onPause() {
        super.onPause();
        wg.m mVar = this.T;
        if (mVar != null) {
            mVar.setPaused(true);
            this.T.setDialogVisible(true);
        }
    }

    @Override // org.telegram.ui.l00, org.telegram.ui.ActionBar.d2
    public final void onResume() {
        super.onResume();
        wg.m mVar = this.T;
        if (mVar != null) {
            mVar.setPaused(false);
            this.T.setDialogVisible(false);
        }
    }

    public final void p1(final boolean z10, boolean z11) {
        this.u0 = z10;
        if (z11) {
            this.o0.setVisibility(0);
            this.q0.setVisibility(0);
            final int i3 = 0;
            this.o0.animate().alpha(z10 ? 0.0f : 1.0f).withEndAction(new Runnable(this) { // from class: ci.na
                public final /* synthetic */ wb b;

                {
                    this.b = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    switch (i3) {
                        case 0:
                            if (z10) {
                                this.b.o0.setVisibility(8);
                                break;
                            }
                            break;
                        default:
                            if (!z10) {
                                this.b.q0.setVisibility(8);
                                break;
                            }
                            break;
                    }
                }
            }).start();
            final int i10 = 1;
            this.q0.animate().alpha(z10 ? 1.0f : 0.0f).withEndAction(new Runnable(this) { // from class: ci.na
                public final /* synthetic */ wb b;

                {
                    this.b = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    switch (i10) {
                        case 0:
                            if (z10) {
                                this.b.o0.setVisibility(8);
                                break;
                            }
                            break;
                        default:
                            if (!z10) {
                                this.b.q0.setVisibility(8);
                                break;
                            }
                            break;
                    }
                }
            }).start();
            return;
        }
        this.o0.animate().cancel();
        this.q0.animate().cancel();
        this.q0.setAlpha(z10 ? 1.0f : 0.0f);
        this.o0.setAlpha(z10 ? 0.0f : 1.0f);
        this.q0.setVisibility(z10 ? 0 : 8);
        this.o0.setVisibility(z10 ? 8 : 0);
    }

    @Override // org.telegram.ui.l00
    public final float q0() {
        tj0 tj0Var = this.c;
        if (tj0Var == null) {
            return 0.0f;
        }
        return tj0Var.getY();
    }

    public final void q1() {
        if (this.X == null) {
            return;
        }
        int L = org.telegram.messenger.g0.L(44.0f) + org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + this.c0;
        ViewGroup.LayoutParams layoutParams = this.X.getLayoutParams();
        if (layoutParams.height != L) {
            layoutParams.height = L;
            this.X.setLayoutParams(layoutParams);
        }
        r1();
    }

    @Override // org.telegram.ui.l00
    public final View r0() {
        return this.V;
    }

    public final void r1() {
        View view = this.X;
        if (view == null) {
            return;
        }
        qe.a aVar = this.Y;
        float f10 = aVar == null ? 0.0f : aVar.e;
        qe.a aVar2 = this.Z;
        view.setTranslationY(((-(1.0f - f10)) * org.telegram.ui.ActionBar.k.getCurrentActionBarHeight()) - ((1.0f - (aVar2 != null ? aVar2.e : 0.0f)) * org.telegram.messenger.g0.L(44.0f)));
    }

    @Override // org.telegram.ui.l00
    public final void s0(boolean z10) {
        qe.a aVar = this.a0;
        if (aVar == null || aVar.f == z10) {
            return;
        }
        aVar.a(z10, true);
    }

    @Override // org.telegram.ui.l00
    public final void u0() {
        n1("SAVE_BEFORE");
        super.u0();
        gt0 gt0Var = this.V;
        this.f0 = gt0Var != null && gt0Var.f0;
        tj0 tj0Var = this.c;
        if (tj0Var != null && this.Q >= 0) {
            this.R -= tj0Var.getPaddingTop();
        }
        n1("SAVE_AFTER");
    }

    @Override // org.telegram.ui.ActionBar.d2
    public final boolean useSimpleActionBar() {
        return true;
    }
}
