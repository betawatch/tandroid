package di;

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
import java.lang.reflect.Method;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.ArrayList;
import java.util.Date;
import java.util.Locale;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.hd;
import org.telegram.messenger.i20;
import org.telegram.messenger.is;
import org.telegram.messenger.k20;
import org.telegram.messenger.m10;
import org.telegram.messenger.np;
import org.telegram.messenger.ns;
import org.telegram.messenger.q10;
import org.telegram.messenger.s10;
import org.telegram.messenger.z10;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.b41;
import org.telegram.ui.Components.ch0;
import org.telegram.ui.Components.e80;
import org.telegram.ui.Components.eq;
import org.telegram.ui.Components.er;
import org.telegram.ui.Components.it0;
import org.telegram.ui.Components.mb0;
import org.telegram.ui.Components.nz;
import org.telegram.ui.Components.p41;
import org.telegram.ui.Components.sx0;
import org.telegram.ui.Components.uj0;
import org.telegram.ui.Components.vx0;
import org.telegram.ui.Components.z70;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.an;
import org.telegram.ui.o00;
import org.telegram.ui.p00;
import org.telegram.ui.p50;
import org.telegram.ui.qn;
import org.telegram.ui.rv;
import org.telegram.ui.z51;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final class mb extends p00 implements is {
    public static DecimalFormat w0;
    public static DecimalFormat x0;
    public FrameLayout S;
    public vg.m T;
    public lb U;
    public it0 V;
    public bi.o2 W;
    public View X;
    public te.a Y;
    public te.a Z;
    public te.a a0;
    public int c0;
    public int d0;
    public boolean e0;
    public boolean f0;
    public bi.o2 h0;
    public nz i0;
    public LinearLayout j0;
    public SpannableStringBuilder k0;
    public org.telegram.ui.Components.h6 l0;
    public TextView m0;
    public hi.d n0;
    public bi.g2 o0;
    public hi.d p0;
    public z51 q0;
    public hi.d r0;
    public hi.d s0;
    public boolean t0;
    public boolean u0;
    public bi.x5 v0;
    public int b0 = -1;
    public final ch.w g0 = new ch.w(this, 20);

    public mb() {
        this.N = true;
    }

    public static /* synthetic */ void A0(mb mbVar, Context context) {
        if (np.s1(mbVar.currentAccount).v2()) {
            org.telegram.ui.b.b(mbVar.currentAccount);
        } else {
            new db(context, mbVar.resourceProvider).show();
        }
    }

    public static void B0(mb mbVar) {
        v8.y(mbVar.currentAccount, false).u();
        wg.c1.l1(1, org.telegram.messenger.v1.a(mbVar.currentAccount).b());
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
    /* JADX WARN: Type inference failed for: r2v13, types: [android.view.View, org.telegram.ui.Components.vx0] */
    /* JADX WARN: Type inference failed for: r3v19 */
    /* JADX WARN: Type inference failed for: r3v20, types: [boolean] */
    /* JADX WARN: Type inference failed for: r3v21 */
    /* JADX WARN: Type inference failed for: r6v44, types: [org.telegram.tgnet.TLRPC$User] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void C0(mb mbVar, int i7) {
        b41 G;
        boolean z10;
        String str;
        boolean z11;
        final boolean z12;
        TLRPC.Chat chat;
        TLRPC.Chat chat2;
        int i10;
        org.telegram.ui.ActionBar.u2[] u2VarArr;
        int i11;
        int i12;
        boolean z13;
        String str2;
        org.telegram.ui.f5 f5Var;
        boolean z14;
        String str3;
        long currentTime;
        final int i13;
        ?? r32;
        org.telegram.ui.ActionBar.e2 T;
        bi.x5 x5Var = mbVar.v0;
        if (x5Var == null || (G = x5Var.G(i7)) == null) {
            return;
        }
        int i14 = G.d;
        if (i14 == -1) {
            mbVar.v0.O(true);
            return;
        }
        if (i14 == -2) {
            v8.y(mbVar.currentAccount, false).u();
            wg.c1.l1(1, org.telegram.messenger.v1.a(mbVar.currentAccount).b());
            return;
        }
        if (i14 == -3) {
            v8.y(mbVar.currentAccount, false).V();
            mbVar.v0.O(true);
            return;
        }
        if (i14 == -4) {
            if (np.s1(mbVar.currentAccount).v2()) {
                org.telegram.ui.b.b(mbVar.currentAccount);
                return;
            } else {
                mbVar.presentFragment(new ki.n3(mbVar.getUserConfig().e()));
                return;
            }
        }
        int i15 = 2;
        if (G.H(ya.class)) {
            if (G.G instanceof TL_stars.TL_starsTopupOption) {
                v8.y(mbVar.currentAccount, false).f(mbVar.getParentActivity(), (TL_stars.TL_starsTopupOption) G.G, new bi.e4(i15, mbVar, G), null);
                return;
            }
            return;
        }
        if (G.H(eb.class) && (G.G instanceof TL_stars.StarsSubscription)) {
            final Activity parentActivity = mbVar.getParentActivity();
            int i16 = mbVar.currentAccount;
            final TL_stars.StarsSubscription starsSubscription = (TL_stars.StarsSubscription) G.G;
            org.telegram.ui.ActionBar.e6 resourceProvider = mbVar.getResourceProvider();
            if (starsSubscription == null || parentActivity == null) {
                return;
            }
            org.telegram.ui.ActionBar.u2 i17 = i20.i(parentActivity, false, 1, resourceProvider);
            org.telegram.ui.ActionBar.u2[] u2VarArr2 = new org.telegram.ui.ActionBar.u2[1];
            ?? e10 = org.telegram.messenger.k5.e(parentActivity, 1);
            e10.setPadding(org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(20.0f), org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(4.0f));
            e10.setClipChildren(false);
            e10.setClipToPadding(false);
            ?? frameLayout = new FrameLayout(parentActivity);
            e10.addView(frameLayout, c8.ja.t(-1, -2, 7, 0, 0, 0, 10));
            boolean[] zArr = new boolean[1];
            la laVar = new la(zArr, u2VarArr2);
            ns.f(i16).b(laVar, ns.A3);
            long o4 = org.telegram.messenger.m5.o(starsSubscription.peer);
            org.telegram.ui.Components.i9 i9Var = new org.telegram.ui.Components.i9(parentActivity);
            if (o4 >= 0) {
                z10 = 0;
                ?? a22 = np.s1(i16).a2(Long.valueOf(o4));
                str = q10.p(a22);
                boolean t6 = q10.t(a22);
                z11 = !t6;
                z12 = t6;
                chat = a22;
            } else {
                z10 = 0;
                TLRPC.Chat M0 = np.s1(i16).M0(Long.valueOf(-o4));
                str = M0 == null ? "" : M0.title;
                z11 = false;
                z12 = false;
                chat = M0;
            }
            String str4 = str;
            if (starsSubscription.photo != null) {
                i9Var.setRoundRadius(org.telegram.messenger.g0.L(21.0f));
                chat2 = chat;
                i9Var.p(org.telegram.messenger.gc.p(k20.c(starsSubscription.photo)), "100_100", null, null);
            } else {
                chat2 = chat;
                i9Var.setRoundRadius(org.telegram.messenger.g0.L(50.0f));
                org.telegram.ui.Components.t8 t8Var = new org.telegram.ui.Components.t8((org.telegram.ui.ActionBar.e6) null);
                if (o4 < 0) {
                    i10 = i16;
                    u2VarArr = u2VarArr2;
                    TLRPC.Chat M02 = np.s1(i16).M0(Long.valueOf(-o4));
                    t8Var.q(M02);
                    i9Var.f(M02, t8Var);
                    frameLayout.addView(i9Var, c8.ja.e(100, 100, 17));
                    Drawable drawable = parentActivity.getResources().getDrawable(R.drawable.star_small_outline);
                    org.telegram.ui.ActionBar.q6.x(frameLayout, drawable, org.telegram.ui.ActionBar.j6.h5, resourceProvider, PorterDuff.Mode.SRC_IN);
                    Drawable drawable2 = parentActivity.getResources().getDrawable(R.drawable.star_small_inner);
                    if (starsSubscription.photo == null) {
                        ImageView imageView = new ImageView(parentActivity);
                        imageView.setImageDrawable(drawable);
                        frameLayout.addView(imageView, c8.ja.e(28, 28, 17));
                        imageView.setTranslationX(org.telegram.messenger.g0.L(34.0f));
                        imageView.setTranslationY(org.telegram.messenger.g0.L(35.0f));
                        imageView.setScaleX(1.1f);
                        imageView.setScaleY(1.1f);
                        ImageView imageView2 = new ImageView(parentActivity);
                        imageView2.setImageDrawable(drawable2);
                        frameLayout.addView(imageView2, c8.ja.e(28, 28, 17));
                        imageView2.setTranslationX(org.telegram.messenger.g0.L(34.0f));
                        imageView2.setTranslationY(org.telegram.messenger.g0.L(35.0f));
                    }
                    TextView textView = new TextView(parentActivity);
                    org.telegram.messenger.k5.m(textView, org.telegram.ui.ActionBar.j6.j5, resourceProvider, 1, 20.0f);
                    textView.setGravity(17);
                    if (TextUtils.isEmpty(starsSubscription.title)) {
                        textView.setText(starsSubscription.title);
                    } else {
                        textView.setText(hd.M0(2131744971, null));
                    }
                    e10.addView(textView, c8.ja.t(-1, -2, 17, 20, 0, 20, 4));
                    TextView textView2 = new TextView(parentActivity);
                    textView2.setTextSize(1, 14.0f);
                    textView2.setGravity(17);
                    org.telegram.ui.ActionBar.q6.U(textView2, org.telegram.ui.ActionBar.j6.B6, resourceProvider);
                    TL_stars.TL_starsSubscriptionPricing tL_starsSubscriptionPricing = starsSubscription.pricing;
                    i11 = tL_starsSubscriptionPricing.period;
                    if (i11 != 2592000) {
                        Object[] objArr = new Object[1];
                        objArr[z10] = Long.valueOf(tL_starsSubscriptionPricing.amount);
                        textView2.setText(a1(z10, hd.a0(null, null, 2131744983, objArr), 0.8f, null));
                        i12 = i10;
                    } else {
                        String str5 = i11 == 300 ? "5min" : "min";
                        i12 = i10;
                        textView2.setText(a1(false, hd.a0(null, null, 2131744983, Long.valueOf(tL_starsSubscriptionPricing.amount), str5), 0.8f, null));
                    }
                    e10.addView(textView2, c8.ja.t(-1, -2, 17, 20, 0, 20, 4));
                    ?? vx0Var = new vx0(parentActivity, resourceProvider);
                    z70 z70Var = new z70(parentActivity, resourceProvider);
                    z70Var.setPadding(org.telegram.messenger.g0.L(12.66f), org.telegram.messenger.g0.L(9.33f), org.telegram.messenger.g0.L(12.66f), org.telegram.messenger.g0.L(9.33f));
                    z70Var.setEllipsize(TextUtils.TruncateAt.END);
                    int i18 = org.telegram.ui.ActionBar.j6.Xc;
                    org.telegram.ui.ActionBar.q6.U(z70Var, i18, resourceProvider);
                    org.telegram.ui.ActionBar.q6.G(z70Var, i18, resourceProvider);
                    z70Var.setTextSize(1, 14.0f);
                    z70Var.setSingleLine(true);
                    z70Var.setDisablePaddingsOffsetY(true);
                    org.telegram.ui.f5 f5Var2 = new org.telegram.ui.f5(24.0f, i12, z70Var);
                    if (o4 < 0) {
                        TLRPC.User a23 = np.s1(i12).a2(Long.valueOf(o4));
                        boolean z15 = a23 == null || q10.x(a23);
                        String p10 = q10.p(a23);
                        f5Var2.e(a23);
                        boolean z16 = z15;
                        f5Var = f5Var2;
                        z13 = z16;
                        str2 = p10;
                    } else {
                        TLRPC.Chat M03 = np.s1(i12).M0(Long.valueOf(-o4));
                        z13 = M03 == null;
                        str2 = M03 != null ? M03.title : "";
                        f5Var = f5Var2;
                        f5Var.b(M03);
                    }
                    z14 = z13;
                    int i19 = i12;
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("x  " + ((Object) str2));
                    spannableStringBuilder.setSpan(f5Var, 0, 1, 33);
                    final org.telegram.ui.ActionBar.u2[] u2VarArr3 = u2VarArr;
                    spannableStringBuilder.setSpan(new ma(u2VarArr3, o4), 3, spannableStringBuilder.length(), 33);
                    z70Var.setText(spannableStringBuilder);
                    if (!z14) {
                        vx0Var.l(z70Var, hd.M0(o4 < 0 ? 2131744995 : z11 ? 2131745005 : 2131745010, null));
                    }
                    if (o4 >= 0 || TextUtils.isEmpty(starsSubscription.title)) {
                        str3 = null;
                    } else {
                        str3 = null;
                        vx0Var.c(hd.M0(z11 ? 2131745003 : 2131745008, null), starsSubscription.title, null, null);
                    }
                    vx0Var.c(hd.M0(2131744976, str3), hd.a0(null, null, 2131742783, hd.E0().s0().format(new Date((starsSubscription.until_date - starsSubscription.pricing.period) * 1000)), hd.E0().p0().format(new Date((starsSubscription.until_date - starsSubscription.pricing.period) * 1000))), null, null);
                    currentTime = ConnectionsManager.getInstance(i19).getCurrentTime();
                    vx0Var.c(hd.M0((!starsSubscription.canceled || starsSubscription.bot_canceled) ? 2131744969 : currentTime > ((long) starsSubscription.until_date) ? 2131744970 : 2131744968, null), hd.a0(null, null, 2131742783, hd.E0().s0().format(new Date(starsSubscription.until_date * 1000)), hd.E0().p0().format(new Date(starsSubscription.until_date * 1000))), null, null);
                    e10.addView(vx0Var, c8.ja.k(0.0f, 17.0f, 0.0f, 0.0f, -1, -2));
                    z70 z70Var2 = new z70(parentActivity, resourceProvider);
                    int i20 = org.telegram.ui.ActionBar.j6.z6;
                    org.telegram.ui.ActionBar.q6.U(z70Var2, i20, resourceProvider);
                    org.telegram.ui.ActionBar.q6.G(z70Var2, i18, resourceProvider);
                    z70Var2.setTextSize(1, 14.0f);
                    final int i21 = 0;
                    z70Var2.setText(org.telegram.messenger.g0.U2(hd.M0(2131744926, null), new Runnable() { // from class: di.u9
                        @Override // java.lang.Runnable
                        public final void run() {
                            Object obj;
                            int i22 = i21;
                            Activity activity = parentActivity;
                            switch (i22) {
                                case 0:
                                    vf.c.t(activity, hd.M0(2131744966, null));
                                    break;
                                default:
                                    if (!activity.isFinishing()) {
                                        Handler handler = e0.d.g;
                                        Method method = e0.d.f;
                                        int i23 = Build.VERSION.SDK_INT;
                                        if (i23 < 28) {
                                            if (((i23 != 26 && i23 != 27) || method != null) && (e0.d.e != null || e0.d.d != null)) {
                                                try {
                                                    Object obj2 = e0.d.c.get(activity);
                                                    if (obj2 != null && (obj = e0.d.b.get(activity)) != null) {
                                                        Application application = activity.getApplication();
                                                        e0.c cVar = new e0.c(activity);
                                                        application.registerActivityLifecycleCallbacks(cVar);
                                                        handler.post(new m9.u(9, cVar, obj2));
                                                        try {
                                                            if (i23 == 26 || i23 == 27) {
                                                                Boolean bool = Boolean.FALSE;
                                                                method.invoke(obj, obj2, null, null, 0, bool, null, null, bool, bool);
                                                            } else {
                                                                activity.recreate();
                                                            }
                                                            handler.post(new m9.u(10, application, cVar));
                                                            break;
                                                        } catch (Throwable th2) {
                                                            handler.post(new m9.u(10, application, cVar));
                                                            throw th2;
                                                        }
                                                    }
                                                } catch (Throwable unused) {
                                                }
                                            }
                                            activity.recreate();
                                            break;
                                        } else {
                                            activity.recreate();
                                            break;
                                        }
                                    }
                                    break;
                            }
                        }
                    }));
                    z70Var2.setGravity(17);
                    e10.addView(z70Var2, c8.ja.k(14.0f, 15.0f, 14.0f, 7.0f, -1, -2));
                    if (currentTime < starsSubscription.until_date) {
                        i13 = i19;
                        z70 z70Var3 = new z70(parentActivity, resourceProvider);
                        org.telegram.ui.ActionBar.q6.U(z70Var3, i20, resourceProvider);
                        org.telegram.ui.ActionBar.q6.G(z70Var3, i18, resourceProvider);
                        z70Var3.setTextSize(1, 14.0f);
                        z70Var3.setText(hd.a0(null, null, 2131744985, hd.u(starsSubscription.until_date, false)));
                        z70Var3.setSingleLine(false);
                        z70Var3.setMaxLines(4);
                        z70Var3.setGravity(17);
                        e10.addView(z70Var3, c8.ja.k(26.0f, 7.0f, 26.0f, 15.0f, -1, -2));
                        if (starsSubscription.chat_invite_hash != null || starsSubscription.invoice_slug != null) {
                            hi.d dVar = new hi.d(parentActivity, resourceProvider, true);
                            dVar.setRoundRadius(24);
                            r32 = 0;
                            dVar.i(hd.M0(2131745011, null), false, true);
                            e10.addView(dVar, c8.ja.o(-1, 48));
                            dVar.setOnClickListener(new y9(dVar, starsSubscription, i13, u2VarArr3, resourceProvider, zArr, parentActivity));
                            i17.O = e10;
                            u2VarArr3[r32] = i17;
                            i17.U0 = r32;
                            i17.setOnDismissListener(new z9(i13, laVar));
                            u2VarArr3[r32].O();
                            T = LaunchActivity.T();
                            if (!org.telegram.messenger.g0.Q1() && !org.telegram.messenger.g0.u1(T)) {
                                u2VarArr3[r32].a0(T);
                            }
                            u2VarArr3[r32].show();
                        }
                    } else if (starsSubscription.can_refulfill) {
                        z70 z70Var4 = new z70(parentActivity, resourceProvider);
                        org.telegram.ui.ActionBar.q6.U(z70Var4, i20, resourceProvider);
                        org.telegram.ui.ActionBar.q6.G(z70Var4, i18, resourceProvider);
                        z70Var4.setTextSize(1, 14.0f);
                        z70Var4.setText(hd.a0(null, null, z12 ? 2131745006 : 2131744981, hd.u(starsSubscription.until_date, false)));
                        z70Var4.setSingleLine(false);
                        z70Var4.setMaxLines(4);
                        z70Var4.setGravity(17);
                        e10.addView(z70Var4, c8.ja.k(26.0f, 7.0f, 26.0f, 15.0f, -1, -2));
                        hi.d dVar2 = new hi.d(parentActivity, resourceProvider, true);
                        dVar2.i(hd.M0(z12 ? 2131745007 : 2131744982, null), false, true);
                        e10.addView(dVar2, c8.ja.o(-1, 48));
                        i13 = i19;
                        dVar2.setOnClickListener(new v9(dVar2, i19, starsSubscription, u2VarArr3, o4, parentActivity, resourceProvider, z11, str4));
                    } else {
                        final boolean z17 = z11;
                        i13 = i19;
                        if (starsSubscription.bot_canceled) {
                            z70 z70Var5 = new z70(parentActivity, resourceProvider);
                            org.telegram.ui.ActionBar.q6.U(z70Var5, org.telegram.ui.ActionBar.j6.nk, resourceProvider);
                            org.telegram.ui.ActionBar.q6.G(z70Var5, i18, resourceProvider);
                            z70Var5.setTextSize(1, 14.0f);
                            z70Var5.setText(hd.M0(z17 ? 2131745004 : 2131745009, null));
                            z70Var5.setSingleLine(false);
                            z70Var5.setMaxLines(4);
                            z70Var5.setGravity(17);
                            e10.addView(z70Var5, c8.ja.k(26.0f, 7.0f, 26.0f, 15.0f, -1, -2));
                        } else if (starsSubscription.canceled) {
                            z70 z70Var6 = new z70(parentActivity, resourceProvider);
                            org.telegram.ui.ActionBar.q6.U(z70Var6, org.telegram.ui.ActionBar.j6.nk, resourceProvider);
                            org.telegram.ui.ActionBar.q6.G(z70Var6, i18, resourceProvider);
                            z70Var6.setTextSize(1, 14.0f);
                            z70Var6.setText(hd.M0(2131744998, null));
                            z70Var6.setSingleLine(false);
                            z70Var6.setMaxLines(4);
                            z70Var6.setGravity(17);
                            e10.addView(z70Var6, c8.ja.k(26.0f, 7.0f, 26.0f, 15.0f, -1, -2));
                            if (starsSubscription.chat_invite_hash != null || starsSubscription.invoice_slug != null) {
                                hi.d dVar3 = new hi.d(parentActivity, resourceProvider, true);
                                dVar3.i(hd.M0(2131744980, null), false, true);
                                e10.addView(dVar3, c8.ja.o(-1, 48));
                                dVar3.setOnClickListener(new w9(dVar3, starsSubscription, i13, u2VarArr3, chat2, str4));
                            }
                        } else {
                            final TLRPC.Chat chat3 = chat2;
                            z70 z70Var7 = new z70(parentActivity, resourceProvider);
                            org.telegram.ui.ActionBar.q6.U(z70Var7, i20, resourceProvider);
                            org.telegram.ui.ActionBar.q6.G(z70Var7, i18, resourceProvider);
                            z70Var7.setTextSize(1, 14.0f);
                            z70Var7.setText(hd.a0(null, null, 2131745001, hd.u(starsSubscription.until_date, false)));
                            z70Var7.setSingleLine(false);
                            z70Var7.setMaxLines(4);
                            z70Var7.setGravity(17);
                            e10.addView(z70Var7, c8.ja.k(26.0f, 7.0f, 26.0f, 15.0f, -1, -2));
                            final hi.d dVar4 = new hi.d(parentActivity, resourceProvider, false);
                            dVar4.i(hd.M0(2131745002, null), false, true);
                            dVar4.setTextColorKey(org.telegram.ui.ActionBar.j6.nk);
                            e10.addView(dVar4, c8.ja.o(-1, 48));
                            dVar4.setOnClickListener(new View.OnClickListener() { // from class: di.x9
                                @Override // android.view.View.OnClickListener
                                public final void onClick(View view) {
                                    final hi.d dVar5 = dVar4;
                                    if (dVar5.R) {
                                        return;
                                    }
                                    dVar5.setLoading(true);
                                    TL_stars.TL_changeStarsSubscription tL_changeStarsSubscription = new TL_stars.TL_changeStarsSubscription();
                                    tL_changeStarsSubscription.canceled = Boolean.TRUE;
                                    tL_changeStarsSubscription.peer = new TLRPC.TL_inputPeerSelf();
                                    final TL_stars.StarsSubscription starsSubscription2 = starsSubscription;
                                    tL_changeStarsSubscription.subscription_id = starsSubscription2.id;
                                    final int i22 = i13;
                                    ConnectionsManager connectionsManager = ConnectionsManager.getInstance(i22);
                                    final TLObject tLObject = chat3;
                                    final boolean z18 = z17;
                                    final boolean z19 = z12;
                                    final org.telegram.ui.ActionBar.u2[] u2VarArr4 = u2VarArr3;
                                    connectionsManager.sendRequest(tL_changeStarsSubscription, new RequestDelegate() { // from class: di.ea
                                        @Override // org.telegram.tgnet.RequestDelegate
                                        public final void run(TLObject tLObject2, TLRPC.TL_error tL_error) {
                                            org.telegram.messenger.g0.h3(new fa(i22, dVar5, tLObject, starsSubscription2, z18, z19, u2VarArr4));
                                        }
                                    });
                                }
                            });
                        }
                    }
                    r32 = 0;
                    i17.O = e10;
                    u2VarArr3[r32] = i17;
                    i17.U0 = r32;
                    i17.setOnDismissListener(new z9(i13, laVar));
                    u2VarArr3[r32].O();
                    T = LaunchActivity.T();
                    if (!org.telegram.messenger.g0.Q1()) {
                        u2VarArr3[r32].a0(T);
                    }
                    u2VarArr3[r32].show();
                }
                TLRPC.User a24 = np.s1(i16).a2(Long.valueOf(o4));
                t8Var.r(a24);
                i9Var.f(a24, t8Var);
            }
            i10 = i16;
            u2VarArr = u2VarArr2;
            frameLayout.addView(i9Var, c8.ja.e(100, 100, 17));
            Drawable drawable3 = parentActivity.getResources().getDrawable(R.drawable.star_small_outline);
            org.telegram.ui.ActionBar.q6.x(frameLayout, drawable3, org.telegram.ui.ActionBar.j6.h5, resourceProvider, PorterDuff.Mode.SRC_IN);
            Drawable drawable22 = parentActivity.getResources().getDrawable(R.drawable.star_small_inner);
            if (starsSubscription.photo == null) {
            }
            TextView textView3 = new TextView(parentActivity);
            org.telegram.messenger.k5.m(textView3, org.telegram.ui.ActionBar.j6.j5, resourceProvider, 1, 20.0f);
            textView3.setGravity(17);
            if (TextUtils.isEmpty(starsSubscription.title)) {
            }
            e10.addView(textView3, c8.ja.t(-1, -2, 17, 20, 0, 20, 4));
            TextView textView22 = new TextView(parentActivity);
            textView22.setTextSize(1, 14.0f);
            textView22.setGravity(17);
            org.telegram.ui.ActionBar.q6.U(textView22, org.telegram.ui.ActionBar.j6.B6, resourceProvider);
            TL_stars.TL_starsSubscriptionPricing tL_starsSubscriptionPricing2 = starsSubscription.pricing;
            i11 = tL_starsSubscriptionPricing2.period;
            if (i11 != 2592000) {
            }
            e10.addView(textView22, c8.ja.t(-1, -2, 17, 20, 0, 20, 4));
            ?? vx0Var2 = new vx0(parentActivity, resourceProvider);
            z70 z70Var8 = new z70(parentActivity, resourceProvider);
            z70Var8.setPadding(org.telegram.messenger.g0.L(12.66f), org.telegram.messenger.g0.L(9.33f), org.telegram.messenger.g0.L(12.66f), org.telegram.messenger.g0.L(9.33f));
            z70Var8.setEllipsize(TextUtils.TruncateAt.END);
            int i182 = org.telegram.ui.ActionBar.j6.Xc;
            org.telegram.ui.ActionBar.q6.U(z70Var8, i182, resourceProvider);
            org.telegram.ui.ActionBar.q6.G(z70Var8, i182, resourceProvider);
            z70Var8.setTextSize(1, 14.0f);
            z70Var8.setSingleLine(true);
            z70Var8.setDisablePaddingsOffsetY(true);
            org.telegram.ui.f5 f5Var22 = new org.telegram.ui.f5(24.0f, i12, z70Var8);
            if (o4 < 0) {
            }
            z14 = z13;
            int i192 = i12;
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder("x  " + ((Object) str2));
            spannableStringBuilder2.setSpan(f5Var, 0, 1, 33);
            final org.telegram.ui.ActionBar.u2[] u2VarArr32 = u2VarArr;
            spannableStringBuilder2.setSpan(new ma(u2VarArr32, o4), 3, spannableStringBuilder2.length(), 33);
            z70Var8.setText(spannableStringBuilder2);
            if (!z14) {
            }
            if (o4 >= 0) {
            }
            str3 = null;
            vx0Var2.c(hd.M0(2131744976, str3), hd.a0(null, null, 2131742783, hd.E0().s0().format(new Date((starsSubscription.until_date - starsSubscription.pricing.period) * 1000)), hd.E0().p0().format(new Date((starsSubscription.until_date - starsSubscription.pricing.period) * 1000))), null, null);
            currentTime = ConnectionsManager.getInstance(i192).getCurrentTime();
            vx0Var2.c(hd.M0((!starsSubscription.canceled || starsSubscription.bot_canceled) ? 2131744969 : currentTime > ((long) starsSubscription.until_date) ? 2131744970 : 2131744968, null), hd.a0(null, null, 2131742783, hd.E0().s0().format(new Date(starsSubscription.until_date * 1000)), hd.E0().p0().format(new Date(starsSubscription.until_date * 1000))), null, null);
            e10.addView(vx0Var2, c8.ja.k(0.0f, 17.0f, 0.0f, 0.0f, -1, -2));
            z70 z70Var22 = new z70(parentActivity, resourceProvider);
            int i202 = org.telegram.ui.ActionBar.j6.z6;
            org.telegram.ui.ActionBar.q6.U(z70Var22, i202, resourceProvider);
            org.telegram.ui.ActionBar.q6.G(z70Var22, i182, resourceProvider);
            z70Var22.setTextSize(1, 14.0f);
            final int i212 = 0;
            z70Var22.setText(org.telegram.messenger.g0.U2(hd.M0(2131744926, null), new Runnable() { // from class: di.u9
                @Override // java.lang.Runnable
                public final void run() {
                    Object obj;
                    int i22 = i212;
                    Activity activity = parentActivity;
                    switch (i22) {
                        case 0:
                            vf.c.t(activity, hd.M0(2131744966, null));
                            break;
                        default:
                            if (!activity.isFinishing()) {
                                Handler handler = e0.d.g;
                                Method method = e0.d.f;
                                int i23 = Build.VERSION.SDK_INT;
                                if (i23 < 28) {
                                    if (((i23 != 26 && i23 != 27) || method != null) && (e0.d.e != null || e0.d.d != null)) {
                                        try {
                                            Object obj2 = e0.d.c.get(activity);
                                            if (obj2 != null && (obj = e0.d.b.get(activity)) != null) {
                                                Application application = activity.getApplication();
                                                e0.c cVar = new e0.c(activity);
                                                application.registerActivityLifecycleCallbacks(cVar);
                                                handler.post(new m9.u(9, cVar, obj2));
                                                try {
                                                    if (i23 == 26 || i23 == 27) {
                                                        Boolean bool = Boolean.FALSE;
                                                        method.invoke(obj, obj2, null, null, 0, bool, null, null, bool, bool);
                                                    } else {
                                                        activity.recreate();
                                                    }
                                                    handler.post(new m9.u(10, application, cVar));
                                                    break;
                                                } catch (Throwable th2) {
                                                    handler.post(new m9.u(10, application, cVar));
                                                    throw th2;
                                                }
                                            }
                                        } catch (Throwable unused) {
                                        }
                                    }
                                    activity.recreate();
                                    break;
                                } else {
                                    activity.recreate();
                                    break;
                                }
                            }
                            break;
                    }
                }
            }));
            z70Var22.setGravity(17);
            e10.addView(z70Var22, c8.ja.k(14.0f, 15.0f, 14.0f, 7.0f, -1, -2));
            if (currentTime < starsSubscription.until_date) {
            }
            r32 = 0;
            i17.O = e10;
            u2VarArr32[r32] = i17;
            i17.U0 = r32;
            i17.setOnDismissListener(new z9(i13, laVar));
            u2VarArr32[r32].O();
            T = LaunchActivity.T();
            if (!org.telegram.messenger.g0.Q1()) {
            }
            u2VarArr32[r32].show();
        }
    }

    public static void D0(mb mbVar, b41 b41Var, Boolean bool, String str) {
        if (mbVar.getParentActivity() == null) {
            return;
        }
        if (bool.booleanValue()) {
            org.telegram.ui.Components.cc.a0(mbVar).I(R.raw.stars_topup, hd.M0(2131745159, null), org.telegram.messenger.g0.X2(hd.G((int) b41Var.B, "StarsAcquiredInfo", new Object[0]))).j();
            mbVar.i0.c(true);
            v8.y(mbVar.currentAccount, false).S(true);
        } else if (str != null) {
            org.telegram.ui.Components.cc.a0(mbVar).Q(R.raw.error, 36, hd.a0(null, null, 2131743878, str)).j();
        }
    }

    public static void H0(vx0 vx0Var, int i7, TL_stars.StarGift starGift, org.telegram.ui.ActionBar.e6 e6Var) {
        CharSequence charSequence;
        TextView textView = (TextView) ((sx0) vx0Var.c(hd.M0(2131750300, null), "", null, null).getChildAt(1)).getChildAt(0);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("x ");
        e80 e80Var = new e80(textView, org.telegram.messenger.g0.L(90.0f), 0, e6Var);
        e80Var.a(org.telegram.ui.ActionBar.j6.r1(0.21f, textView.getPaint().getColor()), org.telegram.ui.ActionBar.j6.r1(0.08f, textView.getPaint().getColor()));
        spannableStringBuilder.setSpan(e80Var, 0, 1, 33);
        textView.setText(spannableStringBuilder, TextView.BufferType.SPANNABLE);
        if (starGift.sold_out) {
            if (!(starGift instanceof TL_stars.TL_starGiftUnique)) {
                int i10 = starGift.availability_remains;
                textView.setText(i10 <= 0 ? hd.H(',', "Gift2Availability2ValueNone", starGift.availability_total) : hd.K("Gift2Availability4Value", i10, ',', hd.E(starGift.availability_total, ',')));
                return;
            }
            if (starGift.availability_remains <= 0) {
                charSequence = hd.H(',', "Gift2QuantityIssuedNone", starGift.availability_total);
            } else {
                charSequence = hd.H(',', "Gift2QuantityIssued1", starGift.availability_issued) + hd.H(',', "Gift2QuantityIssued2", starGift.availability_total);
            }
            textView.setText(charSequence);
            return;
        }
        final v8 y10 = v8.y(i7, false);
        final long j3 = starGift.id;
        final ai.f0 f0Var = new ai.f0(textView, 13);
        final boolean[] zArr = {false};
        final is[] isVarArr = new is[1];
        isVarArr[0] = new is() { // from class: di.e8
            @Override // org.telegram.messenger.is
            public final void didReceivedNotification(int i11, int i12, Object[] objArr) {
                int i13;
                v8 v8Var;
                TL_stars.StarGift J;
                boolean[] zArr2 = zArr;
                if (zArr2[0] || i11 != (i13 = ns.F3) || (J = (v8Var = v8.this).J(j3)) == null) {
                    return;
                }
                zArr2[0] = true;
                ns.f(v8Var.a).n(isVarArr[0], i13);
                f0Var.a(J);
            }
        };
        int i11 = y10.a;
        ns f10 = ns.f(i11);
        is isVar = isVarArr[0];
        int i12 = ns.F3;
        f10.b(isVar, i12);
        TL_stars.StarGift J = y10.J(j3);
        if (J != null) {
            zArr[0] = true;
            ns.f(i11).n(isVarArr[0], i12);
            f0Var.a(J);
        }
    }

    public static void I0(SpannableStringBuilder spannableStringBuilder, TextView textView, String str) {
        spannableStringBuilder.append(" ");
        SpannableString spannableString = new SpannableString(str);
        spannableString.setSpan(new oa(textView.getCurrentTextColor(), str), 0, spannableString.length(), 33);
        spannableStringBuilder.append((CharSequence) spannableString);
    }

    public static SpannableStringBuilder L0(TL_stars.StarsAmount starsAmount) {
        return M0(starsAmount, 0.777f, ',');
    }

    public static SpannableStringBuilder M0(TL_stars.StarsAmount starsAmount, float f10, char c10) {
        double d;
        int i7;
        if (x0 == null) {
            x0 = new DecimalFormat("0.###", new DecimalFormatSymbols(Locale.US));
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        if (starsAmount instanceof TL_stars.TL_starsTonAmount) {
            long j3 = starsAmount.amount;
            if (j3 % 1000000000 == 0) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(starsAmount.negative() ? "-" : "");
                sb2.append(hd.E(Math.abs(starsAmount.amount / 1000000000), c10));
                spannableStringBuilder.append((CharSequence) sb2.toString());
                return spannableStringBuilder;
            }
            String format = x0.format(j3 / 1.0E9d);
            spannableStringBuilder.append((CharSequence) format);
            int indexOf = format.indexOf(".");
            if (indexOf >= 0) {
                spannableStringBuilder.setSpan(new RelativeSizeSpan(f10), indexOf, spannableStringBuilder.length(), 33);
                return spannableStringBuilder;
            }
        } else {
            long j10 = starsAmount.amount;
            int i10 = starsAmount.nanos;
            boolean z10 = false;
            if (i10 < 0 && j10 > 0) {
                i7 = -1;
                d = 1.0E9d;
            } else if (i10 <= 0 || j10 >= 0) {
                d = 1.0E9d;
                i7 = 0;
            } else {
                d = 1.0E9d;
                i7 = 1;
            }
            long j11 = i7 + j10;
            if (j10 != 0 ? j10 < 0 : i10 < 0) {
                z10 = true;
            }
            if (i10 == 0) {
                StringBuilder sb3 = new StringBuilder();
                sb3.append(z10 ? "-" : "");
                sb3.append(hd.E(Math.abs(j11), c10));
                spannableStringBuilder.append((CharSequence) sb3.toString());
                return spannableStringBuilder;
            }
            StringBuilder sb4 = new StringBuilder();
            sb4.append(z10 ? "-" : "");
            sb4.append(hd.E(Math.abs(j11), c10));
            spannableStringBuilder.append((CharSequence) sb4.toString());
            DecimalFormat decimalFormat = x0;
            int i11 = starsAmount.nanos;
            double d2 = i11;
            if (i11 < 0) {
                d2 += d;
            }
            String format2 = decimalFormat.format(d2 / d);
            int indexOf2 = format2.indexOf(".");
            if (indexOf2 >= 0) {
                int length = spannableStringBuilder.length();
                spannableStringBuilder.append((CharSequence) format2.substring(indexOf2));
                spannableStringBuilder.setSpan(new RelativeSizeSpan(f10), length + 1, spannableStringBuilder.length(), 33);
            }
        }
        return spannableStringBuilder;
    }

    public static SpannableStringBuilder N0(TL_stars.StarsAmount starsAmount, float f10, char c10) {
        double d;
        int i7;
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
            long j3 = starsAmount.amount;
            int i10 = starsAmount.nanos;
            if (i10 < 0 && j3 > 0) {
                i7 = -1;
                d = 1.0E9d;
            } else if (i10 <= 0 || j3 >= 0) {
                d = 1.0E9d;
                i7 = 0;
            } else {
                d = 1.0E9d;
                i7 = 1;
            }
            long j10 = i7 + j3;
            boolean z10 = j3 != 0 ? j3 < 0 : i10 < 0;
            if (Math.abs(j10) > 1000 || starsAmount.nanos == 0) {
                if (starsAmount.amount <= 1000) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(z10 ? "-" : "");
                    sb2.append(hd.E(Math.abs(j10), c10));
                    spannableStringBuilder.append((CharSequence) sb2.toString());
                    return spannableStringBuilder;
                }
                StringBuilder sb3 = new StringBuilder();
                sb3.append(z10 ? "-" : "");
                sb3.append(org.telegram.messenger.g0.o0((int) Math.abs(j10), 0));
                spannableStringBuilder.append((CharSequence) sb3.toString());
                return spannableStringBuilder;
            }
            StringBuilder sb4 = new StringBuilder();
            sb4.append(z10 ? "-" : "");
            sb4.append(hd.E(Math.abs(j10), c10));
            spannableStringBuilder.append((CharSequence) sb4.toString());
            DecimalFormat decimalFormat = x0;
            int i11 = starsAmount.nanos;
            double d2 = i11;
            if (i11 < 0) {
                d2 += d;
            }
            String format2 = decimalFormat.format(d2 / d);
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
        int i7;
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
        long j3 = starsAmount.amount;
        int i10 = starsAmount.nanos;
        boolean z10 = false;
        if (i10 < 0 && j3 > 0) {
            i7 = -1;
            d = 1.0E9d;
        } else if (i10 <= 0 || j3 >= 0) {
            d = 1.0E9d;
            i7 = 0;
        } else {
            d = 1.0E9d;
            i7 = 1;
        }
        long j10 = i7 + j3;
        if (j3 != 0 ? j3 < 0 : i10 < 0) {
            z10 = true;
        }
        if (i10 == 0) {
            spannableStringBuilder.append((CharSequence) hd.H(',', "Stars", (int) j3));
            return spannableStringBuilder;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(z10 ? "-" : "");
        sb2.append(hd.E(Math.abs(j10), ','));
        spannableStringBuilder.append((CharSequence) sb2.toString());
        if (x0 == null) {
            x0 = new DecimalFormat("0.################", new DecimalFormatSymbols(Locale.US));
        }
        DecimalFormat decimalFormat = x0;
        int i11 = starsAmount.nanos;
        double d2 = i11;
        if (i11 < 0) {
            d2 += d;
        }
        String format2 = decimalFormat.format(d2 / d);
        int indexOf2 = format2.indexOf(".");
        if (indexOf2 >= 0) {
            int length = spannableStringBuilder.length();
            spannableStringBuilder.append((CharSequence) format2.substring(indexOf2));
            spannableStringBuilder.setSpan(new RelativeSizeSpan(0.777f), length + 1, spannableStringBuilder.length(), 33);
        }
        spannableStringBuilder.append((CharSequence) " ").append((CharSequence) hd.M0(2131745084, null));
        return spannableStringBuilder;
    }

    public static String P0(long j3) {
        if (w0 == null) {
            w0 = new DecimalFormat("0.####", new DecimalFormatSymbols(Locale.US));
        }
        if (j3 % 1000000000 != 0) {
            return w0.format(j3 / 1.0E9d);
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(j3 < 0 ? "-" : "");
        sb2.append(hd.E(Math.abs(j3 / 1000000000), ','));
        return sb2.toString();
    }

    /* JADX WARN: Code restructure failed: missing block: B:119:0x0199, code lost:
    
        r6 = 2131744951;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static String Q0(int i7, boolean z10, TL_stars.StarsTransaction starsTransaction) {
        if (starsTransaction.stargift_drop_original_details) {
            return hd.M0(2131744932, null);
        }
        if (starsTransaction.posts_search) {
            return hd.M0(2131744936, null);
        }
        if (starsTransaction.premium_gift) {
            return hd.M0(2131744935, null);
        }
        if (starsTransaction.phonegroup_message) {
            return hd.M0(starsTransaction.reaction ? 2131744944 : 2131744945, null);
        }
        if (starsTransaction.paid_message) {
            return hd.H(',', "StarsTransactionMessageFee", starsTransaction.paid_messages);
        }
        if (starsTransaction.floodskip) {
            return hd.M0(2131744959, null);
        }
        if (!starsTransaction.extended_media.isEmpty()) {
            return hd.M0(2131745204, null);
        }
        TL_stars.StarsAmount starsAmount = starsTransaction.amount;
        int i10 = starsTransaction.flags;
        if ((131072 & i10) == 0 && (65536 & i10) != 0) {
            return hd.a0(null, null, 2131745161, ki.k.J0(starsTransaction.starref_commission_permille));
        }
        if (starsTransaction.stargift != null) {
            if (starsTransaction.stargift_prepaid_upgrade) {
                return hd.M0(2131749930, null);
            }
            if (starsTransaction.refund) {
                return hd.M0(starsTransaction.stargift_auction_bid ? 2131749929 : starsAmount.amount > 0 ? starsTransaction.stargift_upgrade ? 2131749926 : 2131749927 : 2131749928, null);
            }
            return hd.M0(starsTransaction.stargift_auction_bid ? 2131749932 : starsAmount.amount > 0 ? 2131749931 : starsTransaction.stargift_upgrade ? 2131749923 : 2131749924, null);
        }
        if (starsTransaction.subscription) {
            int i11 = starsTransaction.subscription_period;
            if (i11 == 2592000) {
                return hd.M0(2131745163, null);
            }
            if (i11 == 300) {
                return "5-minute subscription fee";
            }
            if (i11 == 60) {
                return "Minute subscription fee";
            }
        }
        if ((i10 & TLObject.FLAG_13) != 0) {
            return hd.M0(2131745093, null);
        }
        if (starsTransaction.gift) {
            if (starsTransaction.sent_by != null) {
                return hd.M0(q10.B(np.s1(i7).a2(Long.valueOf(org.telegram.messenger.m5.o(starsTransaction.sent_by)))) ? 2131745101 : 2131745102, null);
            }
            return hd.M0(2131745102, null);
        }
        String str = starsTransaction.title;
        if (str != null) {
            return str;
        }
        long o4 = org.telegram.messenger.m5.o(starsTransaction.peer.peer);
        if (o4 != 0) {
            if (o4 >= 0) {
                return q10.p(np.s1(m10.t0).a2(Long.valueOf(o4)));
            }
            TLRPC.Chat M0 = np.s1(m10.t0).M0(Long.valueOf(-o4));
            return M0 == null ? "" : M0.title;
        }
        TL_stars.StarsTransactionPeer starsTransactionPeer = starsTransaction.peer;
        if (!(starsTransactionPeer instanceof TL_stars.TL_starsTransactionPeerFragment)) {
            return starsTransactionPeer instanceof TL_stars.TL_starsTransactionPeerPremiumBot ? hd.M0(2131744961, null) : starsTransactionPeer instanceof TL_stars.TL_starsTransactionPeerAds ? hd.M0(2131744962, null) : hd.M0(2131744923, null);
        }
        if (!z10) {
            if (starsTransaction.refund) {
            }
            return hd.M0(r6, null);
        }
        int i12 = 2131744921;
        return hd.M0(i12, null);
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
        eq eqVar = new eq(R.drawable.diamond, 0);
        eqVar.d = false;
        eqVar.r = 0.0f;
        eqVar.s = f11;
        eqVar.H = f12;
        eqVar.I = f10;
        eqVar.J = f10;
        spannableString.setSpan(eqVar, 0, spannableString.length() - 1, 33);
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

    public static SpannableStringBuilder U0(CharSequence charSequence, float f10, eq[] eqVarArr) {
        return X0(false, charSequence, f10, eqVarArr, 0.0f, 1.0f);
    }

    public static SpannableStringBuilder V0(CharSequence charSequence, boolean z10) {
        return X0(z10, charSequence, 1.13f, null, 0.0f, 1.0f);
    }

    public static SpannableStringBuilder W0(TL_stars.StarsAmount starsAmount, CharSequence charSequence) {
        return X0(starsAmount instanceof TL_stars.TL_starsTonAmount, charSequence, 1.25f, null, 0.0f, 1.0f);
    }

    public static SpannableStringBuilder X0(boolean z10, CharSequence charSequence, float f10, eq[] eqVarArr, float f11, float f12) {
        eq eqVar;
        if (charSequence == null) {
            return null;
        }
        SpannableStringBuilder spannableStringBuilder = !(charSequence instanceof SpannableStringBuilder) ? new SpannableStringBuilder(charSequence) : (SpannableStringBuilder) charSequence;
        SpannableString spannableString = new SpannableString((z10 ? "TON" : "⭐").concat(" "));
        if (eqVarArr == null || (eqVar = eqVarArr[0]) == null) {
            eqVar = new eq(z10 ? R.drawable.mini_gram_72 : R.drawable.msg_premium_liststar, 0);
            if (eqVarArr != null) {
                eqVarArr[0] = eqVar;
            }
        }
        eqVar.r = 0.0f;
        eqVar.s = f11;
        eqVar.H = f12;
        if (z10) {
            eqVar.d = false;
            float f13 = f10 * 0.2f;
            eqVar.I = f13;
            eqVar.J = f13;
        } else {
            eqVar.I = f10;
            eqVar.J = f10;
        }
        spannableString.setSpan(eqVar, 0, spannableString.length() - 1, 33);
        org.telegram.messenger.g0.M2(spannableStringBuilder, "⭐", "⭐️");
        org.telegram.messenger.g0.M2(spannableStringBuilder, "⭐", "⭐ ");
        org.telegram.messenger.g0.M2(spannableStringBuilder, spannableString, "⭐");
        org.telegram.messenger.g0.M2(spannableStringBuilder, "XTR", "XTR ");
        org.telegram.messenger.g0.M2(spannableStringBuilder, spannableString, "XTR");
        return spannableStringBuilder;
    }

    public static SpannableStringBuilder Y0(boolean z10, String str, eq[] eqVarArr) {
        eq eqVar;
        if (str == null) {
            return null;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str);
        if (eqVarArr == null || (eqVar = eqVarArr[0]) == null) {
            eqVar = new eq(z10 ? R.drawable.mini_gram_72 : R.drawable.msg_premium_liststar, 0);
            float f10 = z10 ? 0.222f : 1.13f;
            float f11 = z10 ? 0.222f : 1.13f;
            eqVar.I = f10;
            eqVar.J = f11;
        }
        if (z10) {
            eqVar.d = false;
        }
        if (eqVarArr != null) {
            eqVarArr[0] = eqVar;
        }
        SpannableString spannableString = new SpannableString("⭐ ");
        spannableString.setSpan(eqVar, 0, spannableString.length() - 1, 33);
        org.telegram.messenger.g0.M2(spannableStringBuilder, "⭐", "⭐️");
        org.telegram.messenger.g0.M2(spannableStringBuilder, "⭐", "⭐ ");
        org.telegram.messenger.g0.M2(spannableStringBuilder, spannableString, "⭐");
        org.telegram.messenger.g0.M2(spannableStringBuilder, "XTR", "XTR ");
        org.telegram.messenger.g0.M2(spannableStringBuilder, spannableString, "XTR");
        return spannableStringBuilder;
    }

    public static SpannableStringBuilder Z0(TL_stars.StarsAmount starsAmount, String str, eq[] eqVarArr) {
        return a1(starsAmount instanceof TL_stars.TL_starsTonAmount, str, 0.8f, eqVarArr);
    }

    public static SpannableStringBuilder a1(boolean z10, CharSequence charSequence, float f10, eq[] eqVarArr) {
        eq eqVar;
        if (charSequence == null) {
            return null;
        }
        SpannableStringBuilder spannableStringBuilder = !(charSequence instanceof SpannableStringBuilder) ? new SpannableStringBuilder(charSequence) : (SpannableStringBuilder) charSequence;
        String str = z10 ? "TON" : "⭐";
        int i7 = z10 ? R.drawable.mini_gram_72 : R.drawable.star_small_inner;
        SpannableString spannableString = new SpannableString(str.concat(" "));
        if (eqVarArr == null || (eqVar = eqVarArr[0]) == null) {
            if (eqVarArr == null || eqVarArr.length <= 0) {
                eqVar = new eq(i7, 0);
            } else {
                eqVar = new eq(i7, 0);
                eqVarArr[0] = eqVar;
            }
        }
        eqVar.d = false;
        if (z10) {
            f10 *= 0.33f;
        }
        eqVar.I = f10;
        eqVar.J = f10;
        spannableString.setSpan(eqVar, 0, spannableString.length() - 1, 33);
        org.telegram.messenger.g0.M2(spannableStringBuilder, "⭐", "⭐️");
        org.telegram.messenger.g0.M2(spannableStringBuilder, "⭐", "⭐ ");
        org.telegram.messenger.g0.M2(spannableStringBuilder, spannableString, "⭐");
        org.telegram.messenger.g0.M2(spannableStringBuilder, "XTR", "XTR ");
        org.telegram.messenger.g0.M2(spannableStringBuilder, spannableString, "XTR");
        return spannableStringBuilder;
    }

    public static ca b1(View view, ImageReceiver imageReceiver, String str, boolean z10) {
        int i7 = imageReceiver.d;
        final aa aaVar = new aa(z10, i7, str, imageReceiver, new boolean[1]);
        aaVar.run();
        final int i10 = 0;
        Runnable h = ns.f(i7).h(view, z10 ? ns.X2 : ns.W2, new z10() { // from class: di.ba
            @Override // org.telegram.messenger.z10
            public final void a(Object obj) {
                switch (i10) {
                    case 0:
                        aaVar.run();
                        break;
                    default:
                        aaVar.run();
                        break;
                }
            }
        });
        final int i11 = 1;
        return new ca(h, ns.f(i7).h(view, ns.y0, new z10() { // from class: di.ba
            @Override // org.telegram.messenger.z10
            public final void a(Object obj) {
                switch (i11) {
                    case 0:
                        aaVar.run();
                        break;
                    default:
                        aaVar.run();
                        break;
                }
            }
        }), 0);
    }

    public static void c1(ImageReceiver imageReceiver, TLRPC.Document document, int i7) {
        if (document == null) {
            imageReceiver.f();
            return;
        }
        TLRPC.PhotoSize w10 = org.telegram.messenger.w7.w(document.thumbs, i7, false, null, false);
        imageReceiver.r0(org.telegram.messenger.gc.b(document), com.google.android.gms.internal.vision.e2.j(i7, "_", i7), org.telegram.messenger.gc.c(w10, document), com.google.android.gms.internal.vision.e2.j(i7, "_", i7), org.telegram.messenger.t5.d(document.thumbs, org.telegram.ui.ActionBar.j6.a7, 0.35f, false), 0L, null, null, 0);
    }

    public static void d1(ImageReceiver imageReceiver, TL_stars.StarGift starGift, int i7) {
        c1(imageReceiver, starGift == null ? null : starGift.getDocument(), i7);
    }

    public static void e1(org.telegram.ui.Components.i9 i9Var, ImageReceiver imageReceiver, long j3) {
        b1(i9Var, imageReceiver, j3 <= 1000 ? "2⃣" : j3 < 2500 ? "3⃣" : "4⃣", false);
    }

    public static ca f1(org.telegram.ui.Components.i9 i9Var, ImageReceiver imageReceiver, int i7) {
        return b1(i9Var, imageReceiver, i7 != 3 ? i7 != 6 ? i7 != 12 ? i7 != 24 ? "1⃣" : "5⃣" : "4⃣" : "3⃣" : "2⃣", false);
    }

    public static void g1(org.telegram.ui.Components.i9 i9Var, ImageReceiver imageReceiver, long j3) {
        b1(i9Var, imageReceiver, j3 <= 10000000000L ? "2⃣" : j3 <= 50000000000L ? "1⃣" : "3⃣", true);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v0, types: [android.view.View, android.view.ViewGroup, android.widget.LinearLayout] */
    /* JADX WARN: Type inference failed for: r18v5 */
    /* JADX WARN: Type inference failed for: r18v6 */
    /* JADX WARN: Type inference failed for: r18v7 */
    /* JADX WARN: Type inference failed for: r1v5, types: [android.view.View, android.widget.TextView] */
    public static void h1(Context context, int i7, long j3, TL_stories.Boost boost, org.telegram.ui.ActionBar.e6 e6Var) {
        boolean z10;
        if (context == null) {
            return;
        }
        org.telegram.ui.ActionBar.u2 k10 = org.telegram.messenger.k5.k(1, context, e6Var, false);
        ?? f10 = org.telegram.messenger.k5.f(context, 1);
        f10.setPadding(0, org.telegram.messenger.g0.L(20.0f), 0, org.telegram.messenger.g0.L(4.0f));
        f10.setClipChildren(false);
        f10.setClipToPadding(false);
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setClipChildren(false);
        frameLayout.setClipToPadding(false);
        f10.addView(frameLayout, c8.ja.t(-1, ns.g2, 7, 0, 0, 0, 10));
        ra raVar = new ra(context, 70, 0, 0);
        frameLayout.addView(raVar, c8.ja.c(-1.0f, -1));
        vg.m mVar = new vg.m(context, 1, 2);
        vg.f fVar = mVar.b;
        fVar.z = org.telegram.ui.ActionBar.j6.Wk;
        fVar.A = org.telegram.ui.ActionBar.j6.Xk;
        fVar.b();
        mVar.setStarParticlesView(raVar);
        frameLayout.addView(mVar, c8.ja.d(ns.A2, 170.0f, 17, 0.0f, 32.0f, 0.0f, 24.0f));
        mVar.setPaused(false);
        TextView textView = new TextView(context);
        org.telegram.messenger.k5.m(textView, org.telegram.ui.ActionBar.j6.j5, e6Var, 1, 20.0f);
        textView.setGravity(17);
        org.telegram.ui.ActionBar.u2[] u2VarArr = new org.telegram.ui.ActionBar.u2[1];
        textView.setText(hd.H(' ', "BoostStars", (int) boost.stars));
        ?? f11 = i20.f(f10, textView, c8.ja.t(-1, -2, 17, 20, 0, 20, 4), context);
        f11.setBackground(org.telegram.ui.ActionBar.j6.d0(org.telegram.messenger.g0.L(20.0f), -6915073));
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
        sb2.append(hd.H(' ', "BoostingBoostsCount", i10));
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(sb2.toString());
        eq eqVar = new eq(R.drawable.mini_boost_badge, 2);
        float L = org.telegram.messenger.g0.L(0.66f);
        eqVar.r = 0.0f;
        eqVar.s = L;
        spannableStringBuilder.setSpan(eqVar, 0, 1, 33);
        f11.setText(spannableStringBuilder);
        f10.addView(f11, c8.ja.t(-2, 20, 17, 20, 4, 20, 4));
        vx0 vx0Var = new vx0(context, e6Var);
        vx0Var.n(hd.M0(2131753627, null), i7, j3, new f9(u2VarArr, j3, 6));
        vx0Var.c(hd.M0(2131753626, null), hd.G((int) boost.stars, "BoostStars", new Object[0]), null, null);
        if (boost.giveaway_msg_id != 0) {
            String M0 = hd.M0(2131753615, null);
            String M02 = hd.M0(2131753614, null);
            z10 = 0;
            bi.m1 m1Var = new bi.m1(u2VarArr, j3, boost, 4);
            u2VarArr = u2VarArr;
            vx0Var.i(M0, M02, m1Var);
        } else {
            z10 = 0;
        }
        String M03 = hd.M0(2131753662, null);
        String format = hd.E0().s0().format(new Date(boost.date * 1000));
        String format2 = hd.E0().p0().format(new Date(boost.date * 1000));
        Object[] objArr = new Object[2];
        objArr[z10] = format;
        objArr[1] = format2;
        vx0Var.c(M03, hd.a0(null, null, 2131742783, objArr), null, null);
        String M04 = hd.M0(2131753607, null);
        String format3 = hd.E0().s0().format(new Date(boost.expires * 1000));
        String format4 = hd.E0().p0().format(new Date(boost.expires * 1000));
        Object[] objArr2 = new Object[2];
        objArr2[z10] = format3;
        objArr2[1] = format4;
        vx0Var.c(M04, hd.a0(null, null, 2131742783, objArr2), null, null);
        f10.addView(vx0Var, c8.ja.k(16.0f, 17.0f, 16.0f, 0.0f, -1, -2));
        z70 z70Var = new z70(context, e6Var);
        org.telegram.ui.ActionBar.q6.U(z70Var, org.telegram.ui.ActionBar.j6.z6, e6Var);
        org.telegram.ui.ActionBar.q6.G(z70Var, org.telegram.ui.ActionBar.j6.Xc, e6Var);
        z70Var.setTextSize(1, 14.0f);
        z70Var.setText(org.telegram.messenger.g0.U2(hd.M0(2131744926, null), new ai.a(context, 4)));
        z70Var.setGravity(17);
        f10.addView(z70Var, c8.ja.k(14.0f, 15.0f, 14.0f, 7.0f, -1, -2));
        hi.d dVar = new hi.d(context, e6Var, true);
        dVar.i(hd.M0(2131747831, null), z10, true);
        dVar.setOnClickListener(new ai.p2(u2VarArr, 2));
        f10.addView(dVar, c8.ja.k(16.0f, 8.0f, 16.0f, 0.0f, -1, 48));
        k10.O = f10;
        u2VarArr[0] = k10;
        k10.U0 = false;
        k10.O();
        org.telegram.ui.ActionBar.e2 T = LaunchActivity.T();
        if (!org.telegram.messenger.g0.Q1() && !org.telegram.messenger.g0.u1(T)) {
            u2VarArr[0].a0(T);
        }
        mVar.setPaused(false);
        u2VarArr[0].show();
        u2VarArr[0].n(new ch.w(mVar, 21));
    }

    public static v0 i1(Context context, int i7, TL_stars.TL_starGiftUnique tL_starGiftUnique, s10 s10Var, org.telegram.ui.ActionBar.e6 e6Var) {
        cg.b bVar = cg.b.a;
        v0 v0Var = new v0(context, e6Var, i7, tL_starGiftUnique == null ? cg.a.g(((org.telegram.messenger.j0) np.s1(i7).y7.p.b).c, bVar) : tL_starGiftUnique.resale_ton_only ? tL_starGiftUnique.getResellAmount(cg.b.b) : tL_starGiftUnique.getResellAmount(bVar), new ai.u1(11, s10Var, r8));
        v0[] v0VarArr = {v0Var};
        v0Var.show();
        return v0VarArr[0];
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void j1(Context context, long j3, boolean z10, final s10 s10Var, org.telegram.ui.ActionBar.e6 e6Var) {
        org.telegram.ui.ActionBar.u2[] u2VarArr;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        org.telegram.ui.ActionBar.u2 k10 = org.telegram.messenger.k5.k(1, context, e6Var, false);
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        linearLayout.setClipChildren(false);
        linearLayout.setClipToPadding(false);
        linearLayout.setPadding(org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(8.0f));
        TextView textView = new TextView(context);
        textView.setTypeface(org.telegram.messenger.g0.o());
        hi.d dVar = null;
        textView.setText(hd.M0(2131747732, null));
        textView.setTextSize(1, 20.0f);
        int i7 = org.telegram.ui.ActionBar.j6.G6;
        org.telegram.ui.ActionBar.q6.U(textView, i7, e6Var);
        linearLayout.addView(textView, c8.ja.k(4.0f, 0.0f, 4.0f, 18.0f, -1, -2));
        final EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(context);
        mb0 mb0Var = new mb0(context, e6Var);
        mb0Var.setForceForceUseCenter(true);
        mb0Var.setText(hd.M0(2131747733, null));
        mb0Var.setLeftPadding(org.telegram.messenger.g0.L(36.0f));
        org.telegram.ui.ActionBar.q6.U(editTextBoldCursor, i7, e6Var);
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
        org.telegram.ui.ActionBar.q6.C(editTextBoldCursor, org.telegram.ui.ActionBar.j6.lg, e6Var);
        org.telegram.ui.ActionBar.q6.l(editTextBoldCursor, 36, org.telegram.ui.ActionBar.j6.mg, e6Var);
        int i10 = 5;
        editTextBoldCursor.setGravity(hd.a0 ? 5 : 3);
        editTextBoldCursor.setOnFocusChangeListener(new o9(mb0Var, editTextBoldCursor, objArr2 == true ? 1 : 0));
        LinearLayout linearLayout2 = new LinearLayout(context);
        linearLayout2.setOrientation(0);
        ImageView imageView = new ImageView(context);
        imageView.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        imageView.setImageResource(R.drawable.star_small_inner);
        linearLayout2.addView(imageView, c8.ja.q(-2, -2, 0.0f, 19, 14, 0, 0, 0));
        linearLayout2.addView(editTextBoldCursor, c8.ja.p(-1, -2, 1.0f, ns.E1));
        mb0Var.e(editTextBoldCursor);
        mb0Var.addView(linearLayout2, c8.ja.e(-1, -2, 48));
        linearLayout.addView(mb0Var, c8.ja.o(-1, -2));
        TextView textView2 = new TextView(context);
        textView2.setTextSize(1, 16.0f);
        org.telegram.ui.ActionBar.q6.U(textView2, org.telegram.ui.ActionBar.j6.A6, null);
        mb0Var.addView(textView2, c8.ja.d(-2, -2.0f, 21, 0.0f, 0.0f, 14.0f, 0.0f));
        z70 z70Var = new z70(context, null);
        z70Var.setText(org.telegram.messenger.g0.H2(org.telegram.messenger.g0.U2(hd.M0(2131747735, null), new ai.a(context, i10)), true));
        z70Var.setTextSize(1, 12.0f);
        org.telegram.ui.ActionBar.q6.U(z70Var, org.telegram.ui.ActionBar.j6.z6, e6Var);
        org.telegram.ui.ActionBar.q6.G(z70Var, org.telegram.ui.ActionBar.j6.Xc, e6Var);
        linearLayout.addView(z70Var, c8.ja.k(14.0f, 3.0f, 14.0f, 24.0f, -1, -2));
        final hi.d g10 = i20.g(24, context, e6Var, true);
        g10.i(hd.M0(j3 > 0 ? 2131747731 : 2131747737, null), false, true);
        linearLayout.addView(g10, c8.ja.o(-1, 48));
        if (j3 > 0 && z10) {
            hi.d g11 = i20.g(24, context, e6Var, false);
            g11.i(hd.M0(2131747736, null), false, false);
            linearLayout.addView(g11, c8.ja.k(0.0f, 4.0f, 0.0f, 0.0f, -1, 48));
            dVar = g11;
        }
        k10.O = linearLayout;
        final org.telegram.ui.ActionBar.u2[] u2VarArr2 = {k10};
        editTextBoldCursor.setText(j3 <= 0 ? "" : Long.toString(j3));
        editTextBoldCursor.addTextChangedListener(new pa(editTextBoldCursor, mb0Var, j3, z10, g10, textView2));
        final boolean[] zArr = {false};
        editTextBoldCursor.setOnEditorActionListener(new TextView.OnEditorActionListener() { // from class: di.p9
            @Override // android.widget.TextView.OnEditorActionListener
            public final boolean onEditorAction(TextView textView3, int i11, KeyEvent keyEvent) {
                if (i11 != 5) {
                    return false;
                }
                boolean[] zArr2 = zArr;
                if (zArr2[0]) {
                    return true;
                }
                zArr2[0] = true;
                g10.setLoading(true);
                EditTextBoldCursor editTextBoldCursor2 = editTextBoldCursor;
                s10Var.a(Long.valueOf(Long.parseLong(editTextBoldCursor2.getText().toString())), new t9(editTextBoldCursor2, u2VarArr2, 1));
                return true;
            }
        });
        q9 q9Var = new q9(zArr, s10Var, editTextBoldCursor, g10, u2VarArr2);
        EditTextBoldCursor editTextBoldCursor2 = editTextBoldCursor;
        g10.setOnClickListener(q9Var);
        if (dVar != null) {
            hi.d dVar2 = dVar;
            q9 q9Var2 = new q9(zArr, s10Var, dVar2, editTextBoldCursor2, u2VarArr2);
            editTextBoldCursor2 = editTextBoldCursor2;
            u2VarArr = u2VarArr2;
            dVar2.setOnClickListener(q9Var2);
        } else {
            u2VarArr = u2VarArr2;
        }
        u2VarArr[0].O();
        u2VarArr[0].setOnDismissListener(new r9(editTextBoldCursor2, objArr == true ? 1 : 0));
        u2VarArr[0].show();
        org.telegram.ui.ActionBar.e2 Q = LaunchActivity.Q();
        org.telegram.messenger.g0.i3(new t9(u2VarArr, editTextBoldCursor2), Q instanceof an ? ((an) Q).sa() : false ? 200L : 80L);
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type update terminated with stack overflow, arg: (r11v17 ??), method size: 4332
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:77)
        */
    public static org.telegram.ui.ActionBar.u2 k1(android.content.Context r60, boolean r61, long r62, int r64, org.telegram.tgnet.tl.TL_stars.StarsTransaction r65, org.telegram.ui.ActionBar.e6 r66) {
        /*
            Method dump skipped, instructions count: 4332
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: di.mb.k1(android.content.Context, boolean, long, int, org.telegram.tgnet.tl.TL_stars$StarsTransaction, org.telegram.ui.ActionBar.e6):org.telegram.ui.ActionBar.u2");
    }

    public static void l1(Activity activity, int i7, int i10, TLRPC.TL_messageActionPaymentRefunded tL_messageActionPaymentRefunded, org.telegram.ui.ActionBar.e6 e6Var) {
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
        k1(activity, false, 0L, i7, starsTransaction, e6Var);
    }

    public static void m1(Context context, int i7, TLRPC.TL_payments_paymentReceiptStars tL_payments_paymentReceiptStars, org.telegram.ui.ActionBar.e6 e6Var) {
        TL_stars.StarsTransaction starsTransaction = new TL_stars.StarsTransaction();
        starsTransaction.title = tL_payments_paymentReceiptStars.title;
        starsTransaction.description = tL_payments_paymentReceiptStars.description;
        starsTransaction.photo = tL_payments_paymentReceiptStars.photo;
        TL_stars.TL_starsTransactionPeer tL_starsTransactionPeer = new TL_stars.TL_starsTransactionPeer();
        starsTransaction.peer = tL_starsTransactionPeer;
        tL_starsTransactionPeer.peer = np.s1(i7).z1(tL_payments_paymentReceiptStars.bot_id);
        starsTransaction.date = tL_payments_paymentReceiptStars.date;
        starsTransaction.amount = TL_stars.StarsAmount.ofStars(-tL_payments_paymentReceiptStars.total_amount);
        starsTransaction.id = tL_payments_paymentReceiptStars.transaction_id;
        k1(context, false, 0L, i7, starsTransaction, e6Var);
    }

    public static CharSequence s1(SpannableStringBuilder spannableStringBuilder, boolean z10) {
        a5.q c10;
        if (z10 && com.google.android.gms.internal.vision.e2.s(spannableStringBuilder)) {
            for (eq eqVar : (eq[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), eq.class)) {
                Drawable drawable = eqVar.c;
                if (drawable != null && !(drawable instanceof a5.q) && (c10 = a5.q.c(org.telegram.messenger.t0.b.getResources(), R.drawable.mini_gram_72_white, null)) != null) {
                    c10.setBounds(eqVar.c.getBounds());
                    eqVar.c = c10;
                    eqVar.d = false;
                }
            }
        }
        return spannableStringBuilder;
    }

    public final void J0() {
        q1();
        uj0 uj0Var = this.c;
        if (uj0Var == null || this.V == null || uj0Var.getLayoutParams() == null) {
            return;
        }
        int C = i20.C(48.0f, this.c0, -org.telegram.messenger.g0.L(8.0f));
        int C2 = i20.C(48.0f, this.d0, -org.telegram.messenger.g0.L(8.0f));
        org.telegram.messenger.g0.A3(this.c, 0, C, 0, C2);
        uj0 uj0Var2 = this.c;
        int i7 = -C;
        uj0Var2.setPadding(uj0Var2.getPaddingLeft(), i7, this.c.getPaddingRight(), this.d0 - C2);
        this.V.z(i7, -C2);
    }

    public final void K0(ArrayList arrayList, p41 p41Var) {
        uj0 uj0Var;
        n1("FILL_BEFORE");
        it0 it0Var = this.V;
        boolean z10 = it0Var != null && it0Var.f0;
        this.b0 = -1;
        if (getParentActivity() == null) {
            return;
        }
        v8 y10 = v8.y(this.currentAccount, false);
        ArrayList arrayList2 = y10.v;
        rv rvVar = (rv) super.o0(getParentActivity());
        b41 b41Var = new b41(-2);
        b41Var.c = rvVar;
        arrayList.add(b41Var);
        arrayList.add(b41.k(this.j0));
        hi.d dVar = this.s0;
        if (dVar != null) {
            dVar.setVisibility(getMessagesController().Y5 ? 0 : 8);
        }
        arrayList.add(b41.C(null));
        if (getMessagesController().h6) {
            arrayList.add(ki.g.i(-4, getThemedColor(org.telegram.ui.ActionBar.j6.lk), qn.i0(hd.M0(2131743766, null)), hd.M0(2131743767, null)));
            arrayList.add(b41.C(null));
        }
        if (y10.e && !arrayList2.isEmpty()) {
            arrayList.add(b41.u(hd.M0(2131745203, null)));
            for (int i7 = 0; i7 < arrayList2.size(); i7++) {
                TL_stars.StarsSubscription starsSubscription = (TL_stars.StarsSubscription) arrayList2.get(i7);
                int i10 = eb.b;
                b41 K = b41.K(eb.class);
                K.G = starsSubscription;
                arrayList.add(K);
            }
            if (y10.x) {
                arrayList.add(b41.q(arrayList.size(), 33));
            } else if (!y10.y) {
                b41 c10 = b41.c(-3, R.drawable.arrow_more, hd.M0(2131745202, null));
                c10.q = true;
                arrayList.add(c10);
            }
            arrayList.add(b41.C(null));
        }
        boolean N = y10.N(0);
        this.t0 = N;
        if (N) {
            this.b0 = arrayList.size();
            arrayList.add(b41.n(this.W, -2));
            if (z10 && (uj0Var = this.c) != null) {
                ch.w wVar = this.g0;
                uj0Var.removeCallbacks(wVar);
                this.c.post(wVar);
            }
        } else {
            arrayList.add(b41.m(this.h0));
        }
        n1("FILL_AFTER");
    }

    @Override // org.telegram.ui.p00, org.telegram.ui.ActionBar.e2
    public final View createView(final Context context) {
        TLRPC.TL_starsRevenueStatus tL_starsRevenueStatus;
        final int i7 = 0;
        this.H = false;
        this.F = org.telegram.messenger.g0.L(238.0f);
        it0 it0Var = new it0(context);
        this.V = it0Var;
        char c10 = 1;
        char c11 = 1;
        char c12 = 1;
        char c13 = 1;
        char c14 = 1;
        char c15 = 1;
        it0Var.setDebugLoggingEnabled(true);
        this.V.setCommonInsetsManagedExternally(true);
        if (!this.e0) {
            org.telegram.ui.ActionBar.o4 o4Var = this.parentLayout;
            this.c0 = (o4Var == null || !((ActionBarLayout) o4Var).T0) ? org.telegram.messenger.g0.m : 0;
            this.d0 = org.telegram.messenger.g0.n;
        }
        this.V.setGeometry(new ob.c(this, 15));
        this.V.z(-i20.C(48.0f, this.c0, -org.telegram.messenger.g0.L(8.0f)), -i20.C(48.0f, this.d0, -org.telegram.messenger.g0.L(8.0f)));
        it0 it0Var2 = this.V;
        it0Var2.getClass();
        this.W = new bi.o2(26, context, it0Var2);
        this.U = new lb(context, this.currentAccount, false, 0L, getClassGuid(), getResourceProvider(), this.V);
        this.h0 = new bi.o2(c15 == true ? 1 : 0, context, this);
        super.createView(context);
        o00 o00Var = this.s;
        getBaseSimpleGlass().f(o00Var, this.c, this.simpleActionBar, this.resourceProvider);
        this.simpleActionBar.setBackground(null);
        this.E.bringToFront();
        this.simpleActionBar.bringToFront();
        getBaseSimpleGlass().n = this.V;
        this.c.setCaptureSectionsDecoratorAllowed(true);
        this.U.setGlassEngine(this.glassEngine);
        getBaseSimpleGlass().o = new f(c13 == true ? 1 : 0, this, new e(c14 == true ? 1 : 0, o00Var));
        View view = this.U.d;
        View view2 = new View(getParentActivity());
        this.X = view2;
        view2.setAlpha(0.0f);
        it0 it0Var3 = this.V;
        it0Var3.addView(this.X, it0Var3.indexOfChild(view), c8.ja.e(-1, 0, 48));
        this.X.setBackground(getBaseSimpleGlass().a(this.X));
        b9 b9Var = new b9(this, i7);
        er erVar = er.h;
        te.a aVar = new te.a(0, b9Var, erVar, 380L, false);
        this.Y = aVar;
        this.Z = new te.a(1, new b9(this, c12 == true ? 1 : 0), erVar, 380L, false);
        int i10 = 2;
        this.a0 = new te.a(2, new b9(this, i10), erVar, 380L, false);
        aVar.a(this.c.canScrollVertically(-1) || this.simpleActionBar.v(), false);
        this.Z.a(this.V.f0, false);
        this.c.j(new bi.z4(this, 9));
        q1();
        fh.g c16 = getBaseSimpleGlass().c.c(view, null, false);
        c16.p(c8.g0.l(this.resourceProvider));
        c16.q(org.telegram.messenger.g0.L(9.66f));
        c16.r(org.telegram.messenger.g0.L(18.0f));
        view.setBackground(c16);
        org.telegram.ui.ActionBar.o4 o4Var2 = this.parentLayout;
        if (o4Var2 != null && ((ActionBarLayout) o4Var2).U0) {
            this.simpleActionBar.setBackButtonImage(R.drawable.ic_ab_close);
        }
        FrameLayout frameLayout = new FrameLayout(context);
        this.S = frameLayout;
        frameLayout.setClickable(true);
        vg.m mVar = new vg.m(context, 1, 2);
        this.T = mVar;
        vg.f fVar = mVar.b;
        fVar.z = org.telegram.ui.ActionBar.j6.Wk;
        fVar.A = org.telegram.ui.ActionBar.j6.Xk;
        fVar.b();
        this.T.setStarParticlesView(this.e);
        this.S.addView(this.T, c8.ja.d(ns.U2, 190.0f, 17, 0.0f, 12.0f, 0.0f, 24.0f));
        j0(hd.M0(2131744215, null), org.telegram.messenger.g0.H2(org.telegram.messenger.g0.U2(hd.M0(2131744212, null), new ai.a(context, i10)), true), this.S, null);
        this.c.setOverScrollMode(2);
        v4.k kVar = new v4.k();
        kVar.m = false;
        kVar.C = false;
        kVar.o(erVar);
        kVar.n(350L);
        this.c.setItemAnimator(kVar);
        this.c.setOnItemClickListener(new bi.b6(this, i10));
        nz nzVar = new nz(getParentActivity());
        this.i0 = nzVar;
        this.s.addView(nzVar, c8.ja.c(-1.0f, -1));
        v8 y10 = v8.y(this.currentAccount, false);
        LinearLayout linearLayout = new LinearLayout(getParentActivity());
        this.j0 = linearLayout;
        linearLayout.setOrientation(1);
        this.j0.setPadding(0, org.telegram.messenger.g0.L(24.0f), 0, org.telegram.messenger.g0.L(10.0f));
        org.telegram.ui.Components.h6 h6Var = new org.telegram.ui.Components.h6(getParentActivity(), false, true, false);
        this.l0 = h6Var;
        h6Var.setTypeface(org.telegram.messenger.g0.o());
        this.l0.setTextSize(org.telegram.messenger.g0.L(32.0f));
        this.l0.setGravity(17);
        org.telegram.ui.ActionBar.q6.Y(this.l0, org.telegram.ui.ActionBar.j6.G6, this.resourceProvider);
        this.k0 = new SpannableStringBuilder("S");
        p50 p50Var = new p50(42.0f, this.currentAccount, this.l0);
        ch0 ch0Var = new ch0(R.raw.star_reaction, org.telegram.messenger.g0.L(42.0f), org.telegram.messenger.g0.L(42.0f));
        ImageReceiver imageReceiver = p50Var.b;
        imageReceiver.w0(ch0Var);
        imageReceiver.W(2);
        p50Var.f = false;
        p50Var.h = -org.telegram.messenger.g0.L(3.0f);
        this.k0.setSpan(p50Var, 0, 1, 33);
        this.j0.addView(this.l0, c8.ja.d(-1, 40.0f, 17, 24.0f, 0.0f, 24.0f, 0.0f));
        TextView textView = new TextView(getParentActivity());
        this.m0 = textView;
        textView.setTextSize(1, 14.0f);
        this.m0.setGravity(17);
        this.m0.setText(hd.M0(2131742790, null));
        org.telegram.ui.ActionBar.q6.U(this.m0, org.telegram.ui.ActionBar.j6.z6, this.resourceProvider);
        this.j0.addView(this.m0, c8.ja.d(-1, -2.0f, 17, 24.0f, 0.0f, 24.0f, 0.0f));
        FrameLayout frameLayout2 = new FrameLayout(getParentActivity());
        bi.g2 g2Var = new bi.g2(3, getParentActivity(), this);
        this.o0 = g2Var;
        frameLayout2.addView(g2Var);
        hi.d dVar = new hi.d(getParentActivity(), this.resourceProvider, true);
        this.p0 = dVar;
        dVar.f();
        this.p0.i("", false, true);
        this.p0.setOnClickListener(new View.OnClickListener(this) { // from class: di.k9
            public final /* synthetic */ mb b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view3) {
                switch (i7) {
                    case 0:
                        mb.A0(this.b, context);
                        break;
                    default:
                        new db(context, this.b.resourceProvider).show();
                        break;
                }
            }
        });
        this.o0.addView(this.p0, c8.ja.e(-1, 48, ns.E1));
        z51 z51Var = new z51(4, getParentActivity(), this);
        this.q0 = z51Var;
        frameLayout2.addView(z51Var);
        hi.d dVar2 = new hi.d(getParentActivity(), this.resourceProvider, true);
        this.r0 = dVar2;
        dVar2.f();
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("x  ");
        spannableStringBuilder.setSpan(new eq(R.drawable.mini_topup, 2), 0, 1, 33);
        spannableStringBuilder.append((CharSequence) hd.M0(2131744965, null));
        this.r0.i(spannableStringBuilder, false, true);
        hi.d dVar3 = this.r0;
        final char c17 = c11 == true ? 1 : 0;
        dVar3.setOnClickListener(new View.OnClickListener(this) { // from class: di.k9
            public final /* synthetic */ mb b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view3) {
                switch (c17) {
                    case 0:
                        mb.A0(this.b, context);
                        break;
                    default:
                        new db(context, this.b.resourceProvider).show();
                        break;
                }
            }
        });
        this.q0.addView(this.r0, c8.ja.q(-1, 48, 17.0f, 1, 0, 0, 8, 0));
        hi.d dVar4 = new hi.d(getParentActivity(), this.resourceProvider, true);
        this.n0 = dVar4;
        dVar4.f();
        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder("x  ");
        spannableStringBuilder2.setSpan(new eq(R.drawable.mini_stats, 2), 0, 1, 33);
        spannableStringBuilder2.append((CharSequence) hd.M0(2131745022, null));
        this.n0.i(spannableStringBuilder2, false, true);
        this.n0.setOnClickListener(new View.OnClickListener(this) { // from class: di.s9
            public final /* synthetic */ mb b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view3) {
                switch (i7) {
                    case 0:
                        mb mbVar = this.b;
                        mbVar.presentFragment(new t(0, mbVar.getUserConfig().e()));
                        break;
                    default:
                        mb.B0(this.b);
                        break;
                }
            }
        });
        this.q0.addView(this.n0, c8.ja.q(-1, 48, 17.0f, 1, 0, 0, 0, 0));
        this.j0.addView(frameLayout2, c8.ja.d(-1, 48.0f, 17, 20.0f, 17.0f, 20.0f, 0.0f));
        hi.d dVar5 = new hi.d(getParentActivity(), this.resourceProvider, false);
        this.s0 = dVar5;
        dVar5.f();
        SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder();
        spannableStringBuilder3.append((CharSequence) "G  ");
        spannableStringBuilder3.setSpan(new eq(R.drawable.menu_stars_gift, 0), 0, 1, 33);
        spannableStringBuilder3.append((CharSequence) hd.M0(2131744213, null));
        this.s0.i(spannableStringBuilder3, false, true);
        hi.d dVar6 = this.s0;
        final char c18 = c10 == true ? 1 : 0;
        dVar6.setOnClickListener(new View.OnClickListener(this) { // from class: di.s9
            public final /* synthetic */ mb b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view3) {
                switch (c18) {
                    case 0:
                        mb mbVar = this.b;
                        mbVar.presentFragment(new t(0, mbVar.getUserConfig().e()));
                        break;
                    default:
                        mb.B0(this.b);
                        break;
                }
            }
        });
        this.j0.addView(this.s0, c8.ja.d(-1, 48.0f, 17, 20.0f, 8.0f, 20.0f, 0.0f));
        o1();
        bi.x5 x5Var = this.v0;
        if (x5Var != null) {
            x5Var.O(false);
        }
        e0.g(this.currentAccount).r(getUserConfig().e());
        TLRPC.TL_payments_starsRevenueStats h = e0.g(this.currentAccount).h(getUserConfig().e(), false);
        p1(y10.p().amount > 0 && h != null && (tL_starsRevenueStatus = h.status) != null && tL_starsRevenueStatus.overall_revenue.positive(), false);
        return this.fragmentView;
    }

    @Override // org.telegram.messenger.is
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        int i11 = ns.v3;
        int i12 = ns.A3;
        int i13 = ns.z3;
        if (i7 == i13 || i7 == i12 || i7 == i11) {
            n1("NOTIFICATION_" + i7);
        }
        if (i7 == i11) {
            u0();
            bi.x5 x5Var = this.v0;
            if (x5Var != null) {
                x5Var.O(true);
            }
            h0();
            return;
        }
        if (i7 == i13) {
            v8 y10 = v8.y(this.currentAccount, false);
            if (this.t0 != y10.N(0)) {
                this.t0 = y10.N(0);
                u0();
                bi.x5 x5Var2 = this.v0;
                if (x5Var2 != null) {
                    x5Var2.O(false);
                }
                h0();
                return;
            }
            return;
        }
        if (i7 == i12) {
            bi.x5 x5Var3 = this.v0;
            if (x5Var3 != null) {
                x5Var3.O(true);
                return;
            }
            return;
        }
        if (i7 == ns.y3) {
            o1();
        } else if (i7 == ns.C3 && getUserConfig().e() == ((Long) objArr[0]).longValue()) {
            o1();
        }
    }

    @Override // org.telegram.ui.p00
    public final void h0() {
        it0 it0Var;
        n1("RESTORE_BEFORE");
        super.h0();
        if (this.f0 && (it0Var = this.V) != null && this.b0 != -1) {
            it0Var.a();
        }
        this.f0 = false;
        n1("RESTORE_AFTER");
    }

    @Override // org.telegram.ui.p00
    public final void i0() {
        this.s.addView(this.V, c8.ja.c(-1.0f, -1));
        this.V.u(this.c, new b9(this, 3));
        it0 it0Var = this.V;
        lb lbVar = this.U;
        it0Var.x(lbVar, lbVar.b, new o(5));
        this.V.y(this.U.d);
        this.U.d.setLayoutParams(c8.ja.d(-1, -2.0f, 48, -4.0f, 0.0f, -4.0f, 0.0f));
        J0();
    }

    @Override // org.telegram.ui.p00, org.telegram.ui.ActionBar.e2
    public final boolean isSwipeBackEnabled(MotionEvent motionEvent) {
        it0 it0Var = this.V;
        return it0Var == null || motionEvent == null || it0Var.j(motionEvent.getX(), motionEvent.getY()) || !this.V.c() || this.U.b.b == 0;
    }

    @Override // org.telegram.ui.p00
    public final v4.h0 k0() {
        bi.x5 x5Var = new bi.x5(this, this.c, getParentActivity(), this.currentAccount, this.classGuid, new bi.b(this, 19), getResourceProvider(), 1);
        this.v0 = x5Var;
        x5Var.r = false;
        return x5Var;
    }

    @Override // org.telegram.ui.p00
    public final v4.b0 l0(Context context) {
        it0 it0Var = this.V;
        it0Var.getClass();
        return new jg.i0(5, it0Var, false);
    }

    @Override // org.telegram.ui.p00
    public final ug.s1 m0() {
        return new ra(getParentActivity(), 75, 1, 0);
    }

    public final void n1(String str) {
        if (this.V == null) {
            return;
        }
        StringBuilder u10 = a8.p0.u("Stars event=", str, " row=");
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
        bi.o2 o2Var = this.W;
        u10.append((o2Var == null || o2Var.getParent() == null) ? false : true);
        u10.append(" boundaryTop=");
        bi.o2 o2Var2 = this.W;
        u10.append(o2Var2 == null ? 0 : o2Var2.getTop());
        u10.append(" boundaryHeight=");
        bi.o2 o2Var3 = this.W;
        u10.append(o2Var3 == null ? 0 : o2Var3.getHeight());
        Log.d("SiblingScroll", u10.toString());
        it0 it0Var = this.V;
        if (it0Var.a) {
            it0Var.b = Math.max(it0Var.b, Math.min(60, Math.max(0, 30)));
            it0Var.f(str, null, 0, 0, true);
        }
    }

    @Override // org.telegram.ui.p00
    public final View o0(Context context) {
        throw null;
    }

    public final void o1() {
        TLRPC.TL_starsRevenueStatus tL_starsRevenueStatus;
        boolean z10 = false;
        v8 y10 = v8.y(this.currentAccount, false);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) this.k0);
        spannableStringBuilder.append((CharSequence) M0(y10.p(), 0.66f, ' '));
        this.l0.setText(spannableStringBuilder);
        this.p0.i(hd.M0(y10.p().amount > 0 ? 2131745150 : 2131745151, null), true, true);
        TLRPC.TL_payments_starsRevenueStats h = e0.g(this.currentAccount).h(getUserConfig().e(), false);
        if (h != null && (tL_starsRevenueStatus = h.status) != null && tL_starsRevenueStatus.overall_revenue.positive()) {
            z10 = true;
        }
        p1(z10, true);
    }

    @Override // org.telegram.ui.ActionBar.e2
    public final boolean onFragmentCreate() {
        ns.f(this.currentAccount).c(this, ns.v3);
        ns.f(this.currentAccount).c(this, ns.y3);
        ns.f(this.currentAccount).c(this, ns.z3);
        ns.f(this.currentAccount).c(this, ns.A3);
        ns.f(this.currentAccount).c(this, ns.C3);
        v8.y(this.currentAccount, false).S(true);
        v8.y(this.currentAccount, false).R();
        v8.y(this.currentAccount, false).z();
        return super.onFragmentCreate();
    }

    @Override // org.telegram.ui.ActionBar.e2
    public final void onFragmentDestroy() {
        uj0 uj0Var = this.c;
        if (uj0Var != null) {
            uj0Var.removeCallbacks(this.g0);
        }
        super.onFragmentDestroy();
        ns.f(this.currentAccount).n(this, ns.v3);
        ns.f(this.currentAccount).n(this, ns.y3);
        ns.f(this.currentAccount).n(this, ns.z3);
        ns.f(this.currentAccount).n(this, ns.A3);
        ns.f(this.currentAccount).n(this, ns.C3);
    }

    @Override // org.telegram.ui.p00, org.telegram.ui.ActionBar.e2
    public final void onInsets(int i7, int i10, int i11, int i12) {
        this.e0 = true;
        this.c0 = i10;
        this.d0 = i12;
        J0();
    }

    @Override // org.telegram.ui.p00, org.telegram.ui.ActionBar.e2
    public final void onPause() {
        super.onPause();
        vg.m mVar = this.T;
        if (mVar != null) {
            mVar.setPaused(true);
            this.T.setDialogVisible(true);
        }
    }

    @Override // org.telegram.ui.p00, org.telegram.ui.ActionBar.e2
    public final void onResume() {
        super.onResume();
        vg.m mVar = this.T;
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
            final int i7 = 0;
            this.o0.animate().alpha(z10 ? 0.0f : 1.0f).withEndAction(new Runnable(this) { // from class: di.da
                public final /* synthetic */ mb b;

                {
                    this.b = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    switch (i7) {
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
            this.q0.animate().alpha(z10 ? 1.0f : 0.0f).withEndAction(new Runnable(this) { // from class: di.da
                public final /* synthetic */ mb b;

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

    @Override // org.telegram.ui.p00
    public final float q0() {
        uj0 uj0Var = this.c;
        if (uj0Var == null) {
            return 0.0f;
        }
        return uj0Var.getY();
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

    @Override // org.telegram.ui.p00
    public final View r0() {
        return this.V;
    }

    public final void r1() {
        View view = this.X;
        if (view == null) {
            return;
        }
        te.a aVar = this.Y;
        float f10 = aVar == null ? 0.0f : aVar.e;
        te.a aVar2 = this.Z;
        view.setTranslationY(((-(1.0f - f10)) * org.telegram.ui.ActionBar.k.getCurrentActionBarHeight()) - ((1.0f - (aVar2 != null ? aVar2.e : 0.0f)) * org.telegram.messenger.g0.L(44.0f)));
    }

    @Override // org.telegram.ui.p00
    public final void s0(boolean z10) {
        te.a aVar = this.a0;
        if (aVar == null || aVar.f == z10) {
            return;
        }
        aVar.a(z10, true);
    }

    @Override // org.telegram.ui.p00
    public final void u0() {
        n1("SAVE_BEFORE");
        super.u0();
        it0 it0Var = this.V;
        this.f0 = it0Var != null && it0Var.f0;
        uj0 uj0Var = this.c;
        if (uj0Var != null && this.Q >= 0) {
            this.R -= uj0Var.getPaddingTop();
        }
        n1("SAVE_AFTER");
    }

    @Override // org.telegram.ui.ActionBar.e2
    public final boolean useSimpleActionBar() {
        return true;
    }
}
