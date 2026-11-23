package di;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
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
import org.telegram.messenger.fs;
import org.telegram.messenger.g20;
import org.telegram.messenger.gd;
import org.telegram.messenger.i10;
import org.telegram.messenger.ks;
import org.telegram.messenger.m10;
import org.telegram.messenger.mp;
import org.telegram.messenger.n10;
import org.telegram.messenger.p10;
import org.telegram.messenger.w10;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.ay0;
import org.telegram.ui.Components.b51;
import org.telegram.ui.Components.dy0;
import org.telegram.ui.Components.ek0;
import org.telegram.ui.Components.j80;
import org.telegram.ui.Components.kq;
import org.telegram.ui.Components.kr;
import org.telegram.ui.Components.n41;
import org.telegram.ui.Components.nh0;
import org.telegram.ui.Components.o80;
import org.telegram.ui.Components.st0;
import org.telegram.ui.Components.tz;
import org.telegram.ui.Components.vb0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.b61;
import org.telegram.ui.bn;
import org.telegram.ui.q00;
import org.telegram.ui.r00;
import org.telegram.ui.r50;
import org.telegram.ui.rn;
import org.telegram.ui.tv;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class pb extends r00 implements fs {
    public static DecimalFormat w0;
    public static DecimalFormat x0;
    public FrameLayout S;
    public vg.m T;
    public ob U;
    public st0 V;
    public bi.o3 W;
    public View X;
    public te.a Y;
    public te.a Z;
    public te.a a0;
    public int c0;
    public int d0;
    public boolean e0;
    public boolean f0;
    public bi.o3 h0;
    public tz i0;
    public LinearLayout j0;
    public SpannableStringBuilder k0;
    public org.telegram.ui.Components.n6 l0;
    public TextView m0;
    public hi.e n0;
    public bi.g3 o0;
    public hi.e p0;
    public b61 q0;
    public hi.e r0;
    public hi.e s0;
    public boolean t0;
    public boolean u0;
    public bi.j8 v0;
    public int b0 = -1;
    public final ca.r g0 = new ca.r(this, 23);

    public pb() {
        this.N = true;
    }

    public static /* synthetic */ void A0(pb pbVar, Context context) {
        if (mp.u1(pbVar.currentAccount).A2()) {
            org.telegram.ui.b.b(pbVar.currentAccount);
        } else {
            new gb(context, pbVar.resourceProvider).show();
        }
    }

    public static void B0(pb pbVar) {
        y8.y(pbVar.currentAccount, false).u();
        bi.f2.l1(true, org.telegram.messenger.v1.a(pbVar.currentAccount).b());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:104:0x075d  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x06c6  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x035e  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x02b1  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x0254  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x01e9  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x024e  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0293  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0339  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x03b0  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0503  */
    /* JADX WARN: Type inference failed for: r1v3, types: [android.view.View, android.view.ViewGroup, android.widget.LinearLayout] */
    /* JADX WARN: Type inference failed for: r24v0 */
    /* JADX WARN: Type inference failed for: r24v1 */
    /* JADX WARN: Type inference failed for: r24v5 */
    /* JADX WARN: Type inference failed for: r2v10, types: [android.view.View, android.view.ViewGroup, android.widget.FrameLayout] */
    /* JADX WARN: Type inference failed for: r2v13, types: [android.view.View, org.telegram.ui.Components.dy0] */
    /* JADX WARN: Type inference failed for: r5v38 */
    /* JADX WARN: Type inference failed for: r5v39, types: [boolean] */
    /* JADX WARN: Type inference failed for: r5v40 */
    /* JADX WARN: Type inference failed for: r6v34, types: [org.telegram.tgnet.TLRPC$User] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void C0(pb pbVar, int i7) {
        n41 G;
        boolean z10;
        String str;
        boolean z11;
        final boolean z12;
        TLRPC.Chat chat;
        TLRPC.Chat chat2;
        int i10;
        org.telegram.ui.ActionBar.w2[] w2VarArr;
        int i11;
        int i12;
        boolean z13;
        String str2;
        org.telegram.ui.f5 f5Var;
        boolean z14;
        String str3;
        long currentTime;
        final int i13;
        ?? r52;
        org.telegram.ui.ActionBar.g2 T;
        bi.j8 j8Var = pbVar.v0;
        if (j8Var == null || (G = j8Var.G(i7)) == null) {
            return;
        }
        int i14 = G.d;
        if (i14 == -1) {
            pbVar.v0.O(true);
            return;
        }
        if (i14 == -2) {
            y8.y(pbVar.currentAccount, false).u();
            bi.f2.l1(true, org.telegram.messenger.v1.a(pbVar.currentAccount).b());
            return;
        }
        if (i14 == -3) {
            y8.y(pbVar.currentAccount, false).U();
            pbVar.v0.O(true);
            return;
        }
        if (i14 == -4) {
            if (mp.u1(pbVar.currentAccount).A2()) {
                org.telegram.ui.b.b(pbVar.currentAccount);
                return;
            } else {
                pbVar.presentFragment(new ki.i3(pbVar.getUserConfig().e()));
                return;
            }
        }
        int i15 = 4;
        if (G.H(bb.class)) {
            if (G.H instanceof TL_stars.TL_starsTopupOption) {
                y8.y(pbVar.currentAccount, false).f(pbVar.getParentActivity(), (TL_stars.TL_starsTopupOption) G.H, new bi.r6(i15, pbVar, G), null);
                return;
            }
            return;
        }
        if (G.H(hb.class) && (G.H instanceof TL_stars.StarsSubscription)) {
            final Activity parentActivity = pbVar.getParentActivity();
            int i16 = pbVar.currentAccount;
            final TL_stars.StarsSubscription starsSubscription = (TL_stars.StarsSubscription) G.H;
            org.telegram.ui.ActionBar.i6 resourceProvider = pbVar.getResourceProvider();
            if (starsSubscription == null || parentActivity == null) {
                return;
            }
            org.telegram.ui.ActionBar.w2 j3 = m10.j(parentActivity, false, 1, resourceProvider);
            org.telegram.ui.ActionBar.w2[] w2VarArr2 = new org.telegram.ui.ActionBar.w2[1];
            ?? f10 = org.telegram.messenger.f3.f(parentActivity, 1);
            f10.setPadding(org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(20.0f), org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(4.0f));
            f10.setClipChildren(false);
            f10.setClipToPadding(false);
            ?? frameLayout = new FrameLayout(parentActivity);
            f10.addView(frameLayout, c8.na.t(-1, -2, 7, 0, 0, 0, 10));
            boolean[] zArr = new boolean[1];
            final oa oaVar = new oa(zArr, w2VarArr2);
            ks.f(i16).b(oaVar, ks.C3);
            long o4 = org.telegram.messenger.n5.o(starsSubscription.peer);
            org.telegram.ui.Components.p9 p9Var = new org.telegram.ui.Components.p9(parentActivity);
            if (o4 >= 0) {
                z10 = 0;
                ?? c22 = mp.u1(i16).c2(Long.valueOf(o4));
                str = n10.q(c22);
                boolean u10 = n10.u(c22);
                z11 = !u10;
                z12 = u10;
                chat = c22;
            } else {
                z10 = 0;
                TLRPC.Chat O0 = mp.u1(i16).O0(Long.valueOf(-o4));
                str = O0 == null ? "" : O0.title;
                z11 = false;
                z12 = false;
                chat = O0;
            }
            String str4 = str;
            if (starsSubscription.photo != null) {
                p9Var.setRoundRadius(org.telegram.messenger.g0.L(21.0f));
                chat2 = chat;
                p9Var.p(org.telegram.messenger.fc.p(g20.c(starsSubscription.photo)), "100_100", null, null);
            } else {
                chat2 = chat;
                p9Var.setRoundRadius(org.telegram.messenger.g0.L(50.0f));
                org.telegram.ui.Components.a9 a9Var = new org.telegram.ui.Components.a9((org.telegram.ui.ActionBar.i6) null);
                if (o4 < 0) {
                    i10 = i16;
                    w2VarArr = w2VarArr2;
                    TLRPC.Chat O02 = mp.u1(i16).O0(Long.valueOf(-o4));
                    a9Var.q(O02);
                    p9Var.f(O02, a9Var);
                    frameLayout.addView(p9Var, c8.na.e(100, 100, 17));
                    Drawable drawable = parentActivity.getResources().getDrawable(R.drawable.star_small_outline);
                    org.telegram.ui.ActionBar.u6.x(frameLayout, drawable, org.telegram.ui.ActionBar.n6.h5, resourceProvider, PorterDuff.Mode.SRC_IN);
                    Drawable drawable2 = parentActivity.getResources().getDrawable(R.drawable.star_small_inner);
                    if (starsSubscription.photo == null) {
                        ImageView imageView = new ImageView(parentActivity);
                        imageView.setImageDrawable(drawable);
                        frameLayout.addView(imageView, c8.na.e(28, 28, 17));
                        imageView.setTranslationX(org.telegram.messenger.g0.L(34.0f));
                        imageView.setTranslationY(org.telegram.messenger.g0.L(35.0f));
                        imageView.setScaleX(1.1f);
                        imageView.setScaleY(1.1f);
                        ImageView imageView2 = new ImageView(parentActivity);
                        imageView2.setImageDrawable(drawable2);
                        frameLayout.addView(imageView2, c8.na.e(28, 28, 17));
                        imageView2.setTranslationX(org.telegram.messenger.g0.L(34.0f));
                        imageView2.setTranslationY(org.telegram.messenger.g0.L(35.0f));
                    }
                    TextView textView = new TextView(parentActivity);
                    org.telegram.messenger.f3.l(textView, org.telegram.ui.ActionBar.n6.j5, resourceProvider, 1, 20.0f);
                    textView.setGravity(17);
                    if (TextUtils.isEmpty(starsSubscription.title)) {
                        textView.setText(starsSubscription.title);
                    } else {
                        textView.setText(gd.N0(2131744730, null));
                    }
                    f10.addView(textView, c8.na.t(-1, -2, 17, 20, 0, 20, 4));
                    TextView textView2 = new TextView(parentActivity);
                    textView2.setTextSize(1, 14.0f);
                    textView2.setGravity(17);
                    org.telegram.ui.ActionBar.u6.U(textView2, org.telegram.ui.ActionBar.n6.B6, resourceProvider);
                    TL_stars.TL_starsSubscriptionPricing tL_starsSubscriptionPricing = starsSubscription.pricing;
                    i11 = tL_starsSubscriptionPricing.period;
                    if (i11 != 2592000) {
                        Long valueOf = Long.valueOf(tL_starsSubscriptionPricing.amount);
                        Object[] objArr = new Object[1];
                        objArr[z10] = valueOf;
                        textView2.setText(b1(z10, gd.a0(null, null, 2131744742, objArr), 0.8f, null));
                        i12 = i10;
                    } else {
                        String str5 = i11 == 300 ? "5min" : "min";
                        i12 = i10;
                        textView2.setText(b1(false, gd.a0(null, null, 2131744742, Long.valueOf(tL_starsSubscriptionPricing.amount), str5), 0.8f, null));
                    }
                    f10.addView(textView2, c8.na.t(-1, -2, 17, 20, 0, 20, 4));
                    ?? dy0Var = new dy0(parentActivity, resourceProvider);
                    j80 j80Var = new j80(parentActivity, resourceProvider);
                    j80Var.setPadding(org.telegram.messenger.g0.L(12.66f), org.telegram.messenger.g0.L(9.33f), org.telegram.messenger.g0.L(12.66f), org.telegram.messenger.g0.L(9.33f));
                    j80Var.setEllipsize(TextUtils.TruncateAt.END);
                    int i17 = org.telegram.ui.ActionBar.n6.Xc;
                    org.telegram.ui.ActionBar.u6.U(j80Var, i17, resourceProvider);
                    org.telegram.ui.ActionBar.u6.G(j80Var, i17, resourceProvider);
                    j80Var.setTextSize(1, 14.0f);
                    j80Var.setSingleLine(true);
                    j80Var.setDisablePaddingsOffsetY(true);
                    org.telegram.ui.f5 f5Var2 = new org.telegram.ui.f5(24.0f, i12, j80Var);
                    if (o4 < 0) {
                        TLRPC.User c23 = mp.u1(i12).c2(Long.valueOf(o4));
                        boolean z15 = c23 == null || n10.y(c23);
                        String q10 = n10.q(c23);
                        f5Var2.e(c23);
                        boolean z16 = z15;
                        f5Var = f5Var2;
                        z13 = z16;
                        str2 = q10;
                    } else {
                        TLRPC.Chat O03 = mp.u1(i12).O0(Long.valueOf(-o4));
                        z13 = O03 == null;
                        str2 = O03 != null ? O03.title : "";
                        f5Var = f5Var2;
                        f5Var.b(O03);
                    }
                    z14 = z13;
                    int i18 = i12;
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("x  " + ((Object) str2));
                    spannableStringBuilder.setSpan(f5Var, 0, 1, 33);
                    final org.telegram.ui.ActionBar.w2[] w2VarArr3 = w2VarArr;
                    spannableStringBuilder.setSpan(new pa(w2VarArr3, o4), 3, spannableStringBuilder.length(), 33);
                    j80Var.setText(spannableStringBuilder);
                    if (!z14) {
                        dy0Var.l(j80Var, gd.N0(o4 < 0 ? 2131744754 : z11 ? 2131744764 : 2131744769, null));
                    }
                    if (o4 >= 0 || TextUtils.isEmpty(starsSubscription.title)) {
                        str3 = null;
                    } else {
                        str3 = null;
                        dy0Var.e(gd.N0(z11 ? 2131744762 : 2131744767, null), starsSubscription.title, null, null);
                    }
                    dy0Var.e(gd.N0(2131744735, str3), gd.a0(null, null, 2131742512, gd.E0().s0().format(new Date((starsSubscription.until_date - starsSubscription.pricing.period) * 1000)), gd.E0().p0().format(new Date((starsSubscription.until_date - starsSubscription.pricing.period) * 1000))), null, null);
                    currentTime = ConnectionsManager.getInstance(i18).getCurrentTime();
                    dy0Var.e(gd.N0((!starsSubscription.canceled || starsSubscription.bot_canceled) ? 2131744728 : currentTime > ((long) starsSubscription.until_date) ? 2131744729 : 2131744727, null), gd.a0(null, null, 2131742512, gd.E0().s0().format(new Date(starsSubscription.until_date * 1000)), gd.E0().p0().format(new Date(starsSubscription.until_date * 1000))), null, null);
                    f10.addView(dy0Var, c8.na.k(0.0f, 17.0f, 0.0f, 0.0f, -1, -2));
                    j80 j80Var2 = new j80(parentActivity, resourceProvider);
                    int i19 = org.telegram.ui.ActionBar.n6.z6;
                    org.telegram.ui.ActionBar.u6.U(j80Var2, i19, resourceProvider);
                    org.telegram.ui.ActionBar.u6.G(j80Var2, i17, resourceProvider);
                    j80Var2.setTextSize(1, 14.0f);
                    final int i20 = 0;
                    j80Var2.setText(org.telegram.messenger.g0.T2(gd.N0(2131744685, null), new Runnable() { // from class: di.x9
                        @Override // java.lang.Runnable
                        public final void run() {
                            Object obj;
                            int i21 = i20;
                            Activity activity = parentActivity;
                            switch (i21) {
                                case 0:
                                    vf.c.t(activity, gd.N0(2131744725, null));
                                    break;
                                default:
                                    if (!activity.isFinishing()) {
                                        Handler handler = e0.d.g;
                                        Method method = e0.d.f;
                                        int i22 = Build.VERSION.SDK_INT;
                                        if (i22 < 28) {
                                            if (((i22 != 26 && i22 != 27) || method != null) && (e0.d.e != null || e0.d.d != null)) {
                                                try {
                                                    Object obj2 = e0.d.c.get(activity);
                                                    if (obj2 != null && (obj = e0.d.b.get(activity)) != null) {
                                                        Application application = activity.getApplication();
                                                        e0.c cVar = new e0.c(activity);
                                                        application.registerActivityLifecycleCallbacks(cVar);
                                                        handler.post(new m9.u(9, cVar, obj2));
                                                        try {
                                                            if (i22 == 26 || i22 == 27) {
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
                    j80Var2.setGravity(17);
                    f10.addView(j80Var2, c8.na.k(14.0f, 15.0f, 14.0f, 7.0f, -1, -2));
                    if (currentTime < starsSubscription.until_date) {
                        i13 = i18;
                        j80 j80Var3 = new j80(parentActivity, resourceProvider);
                        org.telegram.ui.ActionBar.u6.U(j80Var3, i19, resourceProvider);
                        org.telegram.ui.ActionBar.u6.G(j80Var3, i17, resourceProvider);
                        j80Var3.setTextSize(1, 14.0f);
                        j80Var3.setText(gd.a0(null, null, 2131744744, gd.u(starsSubscription.until_date, false)));
                        j80Var3.setSingleLine(false);
                        j80Var3.setMaxLines(4);
                        j80Var3.setGravity(17);
                        f10.addView(j80Var3, c8.na.k(26.0f, 7.0f, 26.0f, 15.0f, -1, -2));
                        if (starsSubscription.chat_invite_hash != null || starsSubscription.invoice_slug != null) {
                            hi.e eVar = new hi.e(parentActivity, resourceProvider, true);
                            eVar.setRoundRadius(24);
                            r52 = 0;
                            eVar.i(gd.N0(2131744770, null), false, true);
                            f10.addView(eVar, c8.na.o(-1, 48));
                            eVar.setOnClickListener(new ba(eVar, starsSubscription, i13, w2VarArr3, resourceProvider, zArr, parentActivity));
                            j3.O = f10;
                            w2VarArr3[r52] = j3;
                            j3.U0 = r52;
                            j3.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: di.ca
                                @Override // android.content.DialogInterface.OnDismissListener
                                public final void onDismiss(DialogInterface dialogInterface) {
                                    ks.f(i13).n(oaVar, ks.C3);
                                }
                            });
                            w2VarArr3[r52].O();
                            T = LaunchActivity.T();
                            if (!org.telegram.messenger.g0.Q1() && !org.telegram.messenger.g0.u1(T)) {
                                w2VarArr3[r52].a0(T);
                            }
                            w2VarArr3[r52].show();
                        }
                    } else if (starsSubscription.can_refulfill) {
                        j80 j80Var4 = new j80(parentActivity, resourceProvider);
                        org.telegram.ui.ActionBar.u6.U(j80Var4, i19, resourceProvider);
                        org.telegram.ui.ActionBar.u6.G(j80Var4, i17, resourceProvider);
                        j80Var4.setTextSize(1, 14.0f);
                        j80Var4.setText(gd.a0(null, null, z12 ? 2131744765 : 2131744740, gd.u(starsSubscription.until_date, false)));
                        j80Var4.setSingleLine(false);
                        j80Var4.setMaxLines(4);
                        j80Var4.setGravity(17);
                        f10.addView(j80Var4, c8.na.k(26.0f, 7.0f, 26.0f, 15.0f, -1, -2));
                        hi.e eVar2 = new hi.e(parentActivity, resourceProvider, true);
                        eVar2.i(gd.N0(z12 ? 2131744766 : 2131744741, null), false, true);
                        f10.addView(eVar2, c8.na.o(-1, 48));
                        i13 = i18;
                        eVar2.setOnClickListener(new y9(eVar2, i18, starsSubscription, w2VarArr3, o4, parentActivity, resourceProvider, z11, str4));
                    } else {
                        final boolean z17 = z11;
                        i13 = i18;
                        if (starsSubscription.bot_canceled) {
                            j80 j80Var5 = new j80(parentActivity, resourceProvider);
                            org.telegram.ui.ActionBar.u6.U(j80Var5, org.telegram.ui.ActionBar.n6.nk, resourceProvider);
                            org.telegram.ui.ActionBar.u6.G(j80Var5, i17, resourceProvider);
                            j80Var5.setTextSize(1, 14.0f);
                            j80Var5.setText(gd.N0(z17 ? 2131744763 : 2131744768, null));
                            j80Var5.setSingleLine(false);
                            j80Var5.setMaxLines(4);
                            j80Var5.setGravity(17);
                            f10.addView(j80Var5, c8.na.k(26.0f, 7.0f, 26.0f, 15.0f, -1, -2));
                        } else if (starsSubscription.canceled) {
                            j80 j80Var6 = new j80(parentActivity, resourceProvider);
                            org.telegram.ui.ActionBar.u6.U(j80Var6, org.telegram.ui.ActionBar.n6.nk, resourceProvider);
                            org.telegram.ui.ActionBar.u6.G(j80Var6, i17, resourceProvider);
                            j80Var6.setTextSize(1, 14.0f);
                            j80Var6.setText(gd.N0(2131744757, null));
                            j80Var6.setSingleLine(false);
                            j80Var6.setMaxLines(4);
                            j80Var6.setGravity(17);
                            f10.addView(j80Var6, c8.na.k(26.0f, 7.0f, 26.0f, 15.0f, -1, -2));
                            if (starsSubscription.chat_invite_hash != null || starsSubscription.invoice_slug != null) {
                                hi.e eVar3 = new hi.e(parentActivity, resourceProvider, true);
                                eVar3.i(gd.N0(2131744739, null), false, true);
                                f10.addView(eVar3, c8.na.o(-1, 48));
                                eVar3.setOnClickListener(new z9(eVar3, starsSubscription, i13, w2VarArr3, chat2, str4));
                            }
                        } else {
                            final TLRPC.Chat chat3 = chat2;
                            j80 j80Var7 = new j80(parentActivity, resourceProvider);
                            org.telegram.ui.ActionBar.u6.U(j80Var7, i19, resourceProvider);
                            org.telegram.ui.ActionBar.u6.G(j80Var7, i17, resourceProvider);
                            j80Var7.setTextSize(1, 14.0f);
                            j80Var7.setText(gd.a0(null, null, 2131744760, gd.u(starsSubscription.until_date, false)));
                            j80Var7.setSingleLine(false);
                            j80Var7.setMaxLines(4);
                            j80Var7.setGravity(17);
                            f10.addView(j80Var7, c8.na.k(26.0f, 7.0f, 26.0f, 15.0f, -1, -2));
                            final hi.e eVar4 = new hi.e(parentActivity, resourceProvider, false);
                            eVar4.i(gd.N0(2131744761, null), false, true);
                            eVar4.setTextColorKey(org.telegram.ui.ActionBar.n6.nk);
                            f10.addView(eVar4, c8.na.o(-1, 48));
                            eVar4.setOnClickListener(new View.OnClickListener() { // from class: di.aa
                                @Override // android.view.View.OnClickListener
                                public final void onClick(View view) {
                                    final hi.e eVar5 = eVar4;
                                    if (eVar5.R) {
                                        return;
                                    }
                                    eVar5.setLoading(true);
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
                                    final org.telegram.ui.ActionBar.w2[] w2VarArr4 = w2VarArr3;
                                    connectionsManager.sendRequest(tL_changeStarsSubscription, new RequestDelegate() { // from class: di.ha
                                        @Override // org.telegram.tgnet.RequestDelegate
                                        public final void run(TLObject tLObject2, TLRPC.TL_error tL_error) {
                                            org.telegram.messenger.g0.g3(new ia(i21, eVar5, tLObject, starsSubscription2, z18, z19, w2VarArr4));
                                        }
                                    });
                                }
                            });
                        }
                    }
                    r52 = 0;
                    j3.O = f10;
                    w2VarArr3[r52] = j3;
                    j3.U0 = r52;
                    j3.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: di.ca
                        @Override // android.content.DialogInterface.OnDismissListener
                        public final void onDismiss(DialogInterface dialogInterface) {
                            ks.f(i13).n(oaVar, ks.C3);
                        }
                    });
                    w2VarArr3[r52].O();
                    T = LaunchActivity.T();
                    if (!org.telegram.messenger.g0.Q1()) {
                        w2VarArr3[r52].a0(T);
                    }
                    w2VarArr3[r52].show();
                }
                TLRPC.User c24 = mp.u1(i16).c2(Long.valueOf(o4));
                a9Var.r(c24);
                p9Var.f(c24, a9Var);
            }
            i10 = i16;
            w2VarArr = w2VarArr2;
            frameLayout.addView(p9Var, c8.na.e(100, 100, 17));
            Drawable drawable3 = parentActivity.getResources().getDrawable(R.drawable.star_small_outline);
            org.telegram.ui.ActionBar.u6.x(frameLayout, drawable3, org.telegram.ui.ActionBar.n6.h5, resourceProvider, PorterDuff.Mode.SRC_IN);
            Drawable drawable22 = parentActivity.getResources().getDrawable(R.drawable.star_small_inner);
            if (starsSubscription.photo == null) {
            }
            TextView textView3 = new TextView(parentActivity);
            org.telegram.messenger.f3.l(textView3, org.telegram.ui.ActionBar.n6.j5, resourceProvider, 1, 20.0f);
            textView3.setGravity(17);
            if (TextUtils.isEmpty(starsSubscription.title)) {
            }
            f10.addView(textView3, c8.na.t(-1, -2, 17, 20, 0, 20, 4));
            TextView textView22 = new TextView(parentActivity);
            textView22.setTextSize(1, 14.0f);
            textView22.setGravity(17);
            org.telegram.ui.ActionBar.u6.U(textView22, org.telegram.ui.ActionBar.n6.B6, resourceProvider);
            TL_stars.TL_starsSubscriptionPricing tL_starsSubscriptionPricing2 = starsSubscription.pricing;
            i11 = tL_starsSubscriptionPricing2.period;
            if (i11 != 2592000) {
            }
            f10.addView(textView22, c8.na.t(-1, -2, 17, 20, 0, 20, 4));
            ?? dy0Var2 = new dy0(parentActivity, resourceProvider);
            j80 j80Var8 = new j80(parentActivity, resourceProvider);
            j80Var8.setPadding(org.telegram.messenger.g0.L(12.66f), org.telegram.messenger.g0.L(9.33f), org.telegram.messenger.g0.L(12.66f), org.telegram.messenger.g0.L(9.33f));
            j80Var8.setEllipsize(TextUtils.TruncateAt.END);
            int i172 = org.telegram.ui.ActionBar.n6.Xc;
            org.telegram.ui.ActionBar.u6.U(j80Var8, i172, resourceProvider);
            org.telegram.ui.ActionBar.u6.G(j80Var8, i172, resourceProvider);
            j80Var8.setTextSize(1, 14.0f);
            j80Var8.setSingleLine(true);
            j80Var8.setDisablePaddingsOffsetY(true);
            org.telegram.ui.f5 f5Var22 = new org.telegram.ui.f5(24.0f, i12, j80Var8);
            if (o4 < 0) {
            }
            z14 = z13;
            int i182 = i12;
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder("x  " + ((Object) str2));
            spannableStringBuilder2.setSpan(f5Var, 0, 1, 33);
            final org.telegram.ui.ActionBar.w2[] w2VarArr32 = w2VarArr;
            spannableStringBuilder2.setSpan(new pa(w2VarArr32, o4), 3, spannableStringBuilder2.length(), 33);
            j80Var8.setText(spannableStringBuilder2);
            if (!z14) {
            }
            if (o4 >= 0) {
            }
            str3 = null;
            dy0Var2.e(gd.N0(2131744735, str3), gd.a0(null, null, 2131742512, gd.E0().s0().format(new Date((starsSubscription.until_date - starsSubscription.pricing.period) * 1000)), gd.E0().p0().format(new Date((starsSubscription.until_date - starsSubscription.pricing.period) * 1000))), null, null);
            currentTime = ConnectionsManager.getInstance(i182).getCurrentTime();
            dy0Var2.e(gd.N0((!starsSubscription.canceled || starsSubscription.bot_canceled) ? 2131744728 : currentTime > ((long) starsSubscription.until_date) ? 2131744729 : 2131744727, null), gd.a0(null, null, 2131742512, gd.E0().s0().format(new Date(starsSubscription.until_date * 1000)), gd.E0().p0().format(new Date(starsSubscription.until_date * 1000))), null, null);
            f10.addView(dy0Var2, c8.na.k(0.0f, 17.0f, 0.0f, 0.0f, -1, -2));
            j80 j80Var22 = new j80(parentActivity, resourceProvider);
            int i192 = org.telegram.ui.ActionBar.n6.z6;
            org.telegram.ui.ActionBar.u6.U(j80Var22, i192, resourceProvider);
            org.telegram.ui.ActionBar.u6.G(j80Var22, i172, resourceProvider);
            j80Var22.setTextSize(1, 14.0f);
            final int i202 = 0;
            j80Var22.setText(org.telegram.messenger.g0.T2(gd.N0(2131744685, null), new Runnable() { // from class: di.x9
                @Override // java.lang.Runnable
                public final void run() {
                    Object obj;
                    int i21 = i202;
                    Activity activity = parentActivity;
                    switch (i21) {
                        case 0:
                            vf.c.t(activity, gd.N0(2131744725, null));
                            break;
                        default:
                            if (!activity.isFinishing()) {
                                Handler handler = e0.d.g;
                                Method method = e0.d.f;
                                int i22 = Build.VERSION.SDK_INT;
                                if (i22 < 28) {
                                    if (((i22 != 26 && i22 != 27) || method != null) && (e0.d.e != null || e0.d.d != null)) {
                                        try {
                                            Object obj2 = e0.d.c.get(activity);
                                            if (obj2 != null && (obj = e0.d.b.get(activity)) != null) {
                                                Application application = activity.getApplication();
                                                e0.c cVar = new e0.c(activity);
                                                application.registerActivityLifecycleCallbacks(cVar);
                                                handler.post(new m9.u(9, cVar, obj2));
                                                try {
                                                    if (i22 == 26 || i22 == 27) {
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
            j80Var22.setGravity(17);
            f10.addView(j80Var22, c8.na.k(14.0f, 15.0f, 14.0f, 7.0f, -1, -2));
            if (currentTime < starsSubscription.until_date) {
            }
            r52 = 0;
            j3.O = f10;
            w2VarArr32[r52] = j3;
            j3.U0 = r52;
            j3.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: di.ca
                @Override // android.content.DialogInterface.OnDismissListener
                public final void onDismiss(DialogInterface dialogInterface) {
                    ks.f(i13).n(oaVar, ks.C3);
                }
            });
            w2VarArr32[r52].O();
            T = LaunchActivity.T();
            if (!org.telegram.messenger.g0.Q1()) {
            }
            w2VarArr32[r52].show();
        }
    }

    public static void D0(pb pbVar, n41 n41Var, Boolean bool, String str) {
        if (pbVar.getParentActivity() == null) {
            return;
        }
        if (bool.booleanValue()) {
            org.telegram.ui.Components.kc.b0(pbVar).I(R.raw.stars_topup, gd.N0(2131744918, null), org.telegram.messenger.g0.W2(gd.G((int) n41Var.C, "StarsAcquiredInfo", new Object[0]))).j();
            pbVar.i0.c(true);
            y8.y(pbVar.currentAccount, false).R(true);
        } else if (str != null) {
            org.telegram.ui.Components.kc.b0(pbVar).Q(R.raw.error, 36, gd.a0(null, null, 2131743631, str)).j();
        }
    }

    public static void H0(dy0 dy0Var, int i7, TL_stars.StarGift starGift, org.telegram.ui.ActionBar.i6 i6Var) {
        CharSequence charSequence;
        TextView textView = (TextView) ((ay0) dy0Var.e(gd.N0(2131750283, null), "", null, null).getChildAt(1)).getChildAt(0);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("x ");
        o80 o80Var = new o80(textView, org.telegram.messenger.g0.L(90.0f), 0, i6Var);
        o80Var.a(org.telegram.ui.ActionBar.n6.r1(0.21f, textView.getPaint().getColor()), org.telegram.ui.ActionBar.n6.r1(0.08f, textView.getPaint().getColor()));
        spannableStringBuilder.setSpan(o80Var, 0, 1, 33);
        textView.setText(spannableStringBuilder, TextView.BufferType.SPANNABLE);
        if (starGift.sold_out) {
            if (!(starGift instanceof TL_stars.TL_starGiftUnique)) {
                int i10 = starGift.availability_remains;
                textView.setText(i10 <= 0 ? gd.H(',', "Gift2Availability2ValueNone", starGift.availability_total) : gd.K("Gift2Availability4Value", i10, ',', gd.E(starGift.availability_total, ',')));
                return;
            }
            if (starGift.availability_remains <= 0) {
                charSequence = gd.H(',', "Gift2QuantityIssuedNone", starGift.availability_total);
            } else {
                charSequence = gd.H(',', "Gift2QuantityIssued1", starGift.availability_issued) + gd.H(',', "Gift2QuantityIssued2", starGift.availability_total);
            }
            textView.setText(charSequence);
            return;
        }
        final y8 y10 = y8.y(i7, false);
        final long j3 = starGift.id;
        final ai.d0 d0Var = new ai.d0(textView, 14);
        final boolean[] zArr = {false};
        final fs[] fsVarArr = new fs[1];
        fsVarArr[0] = new fs() { // from class: di.h8
            @Override // org.telegram.messenger.fs
            public final void didReceivedNotification(int i11, int i12, Object[] objArr) {
                int i13;
                y8 y8Var;
                TL_stars.StarGift J;
                boolean[] zArr2 = zArr;
                if (zArr2[0] || i11 != (i13 = ks.H3) || (J = (y8Var = y8.this).J(j3)) == null) {
                    return;
                }
                zArr2[0] = true;
                ks.f(y8Var.a).n(fsVarArr[0], i13);
                d0Var.a(J);
            }
        };
        int i11 = y10.a;
        ks f10 = ks.f(i11);
        fs fsVar = fsVarArr[0];
        int i12 = ks.H3;
        f10.b(fsVar, i12);
        TL_stars.StarGift J = y10.J(j3);
        if (J != null) {
            zArr[0] = true;
            ks.f(i11).n(fsVarArr[0], i12);
            d0Var.a(J);
        }
    }

    public static void I0(SpannableStringBuilder spannableStringBuilder, TextView textView, String str) {
        spannableStringBuilder.append(" ");
        SpannableString spannableString = new SpannableString(str);
        spannableString.setSpan(new ra(textView.getCurrentTextColor(), str), 0, spannableString.length(), 33);
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
                sb2.append(gd.E(Math.abs(starsAmount.amount / 1000000000), c10));
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
                sb3.append(gd.E(Math.abs(j11), c10));
                spannableStringBuilder.append((CharSequence) sb3.toString());
                return spannableStringBuilder;
            }
            StringBuilder sb4 = new StringBuilder();
            sb4.append(z10 ? "-" : "");
            sb4.append(gd.E(Math.abs(j11), c10));
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
                    sb2.append(gd.E(Math.abs(j10), c10));
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
            sb4.append(gd.E(Math.abs(j10), c10));
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
            spannableStringBuilder.append((CharSequence) gd.H(',', "Stars", (int) j3));
            return spannableStringBuilder;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(z10 ? "-" : "");
        sb2.append(gd.E(Math.abs(j10), ','));
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
        spannableStringBuilder.append((CharSequence) " ").append((CharSequence) gd.N0(2131744843, null));
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
        sb2.append(gd.E(Math.abs(j3 / 1000000000), ','));
        return sb2.toString();
    }

    /* JADX WARN: Code restructure failed: missing block: B:119:0x0199, code lost:
    
        r6 = 2131744710;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static String Q0(int i7, boolean z10, TL_stars.StarsTransaction starsTransaction) {
        if (starsTransaction.stargift_drop_original_details) {
            return gd.N0(2131744691, null);
        }
        if (starsTransaction.posts_search) {
            return gd.N0(2131744695, null);
        }
        if (starsTransaction.premium_gift) {
            return gd.N0(2131744694, null);
        }
        if (starsTransaction.phonegroup_message) {
            return gd.N0(starsTransaction.reaction ? 2131744703 : 2131744704, null);
        }
        if (starsTransaction.paid_message) {
            return gd.H(',', "StarsTransactionMessageFee", starsTransaction.paid_messages);
        }
        if (starsTransaction.floodskip) {
            return gd.N0(2131744718, null);
        }
        if (!starsTransaction.extended_media.isEmpty()) {
            return gd.N0(2131744963, null);
        }
        TL_stars.StarsAmount starsAmount = starsTransaction.amount;
        int i10 = starsTransaction.flags;
        if ((131072 & i10) == 0 && (65536 & i10) != 0) {
            return gd.a0(null, null, 2131744920, ki.j.J0(starsTransaction.starref_commission_permille));
        }
        if (starsTransaction.stargift != null) {
            if (starsTransaction.stargift_prepaid_upgrade) {
                return gd.N0(2131749913, null);
            }
            if (starsTransaction.refund) {
                return gd.N0(starsTransaction.stargift_auction_bid ? 2131749912 : starsAmount.amount > 0 ? starsTransaction.stargift_upgrade ? 2131749909 : 2131749910 : 2131749911, null);
            }
            return gd.N0(starsTransaction.stargift_auction_bid ? 2131749915 : starsAmount.amount > 0 ? 2131749914 : starsTransaction.stargift_upgrade ? 2131749906 : 2131749907, null);
        }
        if (starsTransaction.subscription) {
            int i11 = starsTransaction.subscription_period;
            if (i11 == 2592000) {
                return gd.N0(2131744922, null);
            }
            if (i11 == 300) {
                return "5-minute subscription fee";
            }
            if (i11 == 60) {
                return "Minute subscription fee";
            }
        }
        if ((i10 & TLObject.FLAG_13) != 0) {
            return gd.N0(2131744852, null);
        }
        if (starsTransaction.gift) {
            if (starsTransaction.sent_by != null) {
                return gd.N0(n10.C(mp.u1(i7).c2(Long.valueOf(org.telegram.messenger.n5.o(starsTransaction.sent_by)))) ? 2131744860 : 2131744861, null);
            }
            return gd.N0(2131744861, null);
        }
        String str = starsTransaction.title;
        if (str != null) {
            return str;
        }
        long o4 = org.telegram.messenger.n5.o(starsTransaction.peer.peer);
        if (o4 != 0) {
            if (o4 >= 0) {
                return n10.q(mp.u1(i10.t0).c2(Long.valueOf(o4)));
            }
            TLRPC.Chat O0 = mp.u1(i10.t0).O0(Long.valueOf(-o4));
            return O0 == null ? "" : O0.title;
        }
        TL_stars.StarsTransactionPeer starsTransactionPeer = starsTransaction.peer;
        if (!(starsTransactionPeer instanceof TL_stars.TL_starsTransactionPeerFragment)) {
            return starsTransactionPeer instanceof TL_stars.TL_starsTransactionPeerPremiumBot ? gd.N0(2131744720, null) : starsTransactionPeer instanceof TL_stars.TL_starsTransactionPeerAds ? gd.N0(2131744721, null) : gd.N0(2131744682, null);
        }
        if (!z10) {
            if (starsTransaction.refund) {
            }
            return gd.N0(r6, null);
        }
        int i12 = 2131744680;
        return gd.N0(i12, null);
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
        kq kqVar = new kq(R.drawable.diamond, 0);
        kqVar.d = false;
        kqVar.r = 0.0f;
        kqVar.s = f11;
        kqVar.H = f12;
        kqVar.I = f10;
        kqVar.J = f10;
        spannableString.setSpan(kqVar, 0, spannableString.length() - 1, 33);
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

    public static SpannableStringBuilder U0(CharSequence charSequence, float f10, kq[] kqVarArr) {
        return Y0(false, charSequence, f10, kqVarArr, 0.0f, 1.0f);
    }

    public static SpannableStringBuilder V0(CharSequence charSequence, boolean z10) {
        return X0(z10, charSequence, 1.13f, null);
    }

    public static SpannableStringBuilder W0(TL_stars.StarsAmount starsAmount, CharSequence charSequence) {
        return X0(starsAmount instanceof TL_stars.TL_starsTonAmount, charSequence, 1.25f, null);
    }

    public static SpannableStringBuilder X0(boolean z10, CharSequence charSequence, float f10, kq[] kqVarArr) {
        return Y0(z10, charSequence, f10, kqVarArr, 0.0f, 1.0f);
    }

    public static SpannableStringBuilder Y0(boolean z10, CharSequence charSequence, float f10, kq[] kqVarArr, float f11, float f12) {
        kq kqVar;
        if (charSequence == null) {
            return null;
        }
        SpannableStringBuilder spannableStringBuilder = !(charSequence instanceof SpannableStringBuilder) ? new SpannableStringBuilder(charSequence) : (SpannableStringBuilder) charSequence;
        SpannableString spannableString = new SpannableString((z10 ? "TON" : "⭐").concat(" "));
        if (kqVarArr == null || (kqVar = kqVarArr[0]) == null) {
            kqVar = new kq(z10 ? R.drawable.mini_gram_72 : R.drawable.msg_premium_liststar, 0);
            if (kqVarArr != null) {
                kqVarArr[0] = kqVar;
            }
        }
        kqVar.r = 0.0f;
        kqVar.s = f11;
        kqVar.H = f12;
        if (z10) {
            kqVar.d = false;
            float f13 = f10 * 0.2f;
            kqVar.I = f13;
            kqVar.J = f13;
        } else {
            kqVar.I = f10;
            kqVar.J = f10;
        }
        spannableString.setSpan(kqVar, 0, spannableString.length() - 1, 33);
        org.telegram.messenger.g0.M2(spannableStringBuilder, "⭐", "⭐️");
        org.telegram.messenger.g0.M2(spannableStringBuilder, "⭐", "⭐ ");
        org.telegram.messenger.g0.M2(spannableStringBuilder, spannableString, "⭐");
        org.telegram.messenger.g0.M2(spannableStringBuilder, "XTR", "XTR ");
        org.telegram.messenger.g0.M2(spannableStringBuilder, spannableString, "XTR");
        return spannableStringBuilder;
    }

    public static SpannableStringBuilder Z0(boolean z10, String str, kq[] kqVarArr) {
        kq kqVar;
        if (str == null) {
            return null;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str);
        if (kqVarArr == null || (kqVar = kqVarArr[0]) == null) {
            kqVar = new kq(z10 ? R.drawable.mini_gram_72 : R.drawable.msg_premium_liststar, 0);
            float f10 = z10 ? 0.222f : 1.13f;
            float f11 = z10 ? 0.222f : 1.13f;
            kqVar.I = f10;
            kqVar.J = f11;
        }
        if (z10) {
            kqVar.d = false;
        }
        if (kqVarArr != null) {
            kqVarArr[0] = kqVar;
        }
        SpannableString spannableString = new SpannableString("⭐ ");
        spannableString.setSpan(kqVar, 0, spannableString.length() - 1, 33);
        org.telegram.messenger.g0.M2(spannableStringBuilder, "⭐", "⭐️");
        org.telegram.messenger.g0.M2(spannableStringBuilder, "⭐", "⭐ ");
        org.telegram.messenger.g0.M2(spannableStringBuilder, spannableString, "⭐");
        org.telegram.messenger.g0.M2(spannableStringBuilder, "XTR", "XTR ");
        org.telegram.messenger.g0.M2(spannableStringBuilder, spannableString, "XTR");
        return spannableStringBuilder;
    }

    public static SpannableStringBuilder a1(TL_stars.StarsAmount starsAmount, String str, kq[] kqVarArr) {
        return b1(starsAmount instanceof TL_stars.TL_starsTonAmount, str, 0.8f, kqVarArr);
    }

    public static SpannableStringBuilder b1(boolean z10, CharSequence charSequence, float f10, kq[] kqVarArr) {
        kq kqVar;
        if (charSequence == null) {
            return null;
        }
        SpannableStringBuilder spannableStringBuilder = !(charSequence instanceof SpannableStringBuilder) ? new SpannableStringBuilder(charSequence) : (SpannableStringBuilder) charSequence;
        String str = z10 ? "TON" : "⭐";
        int i7 = z10 ? R.drawable.mini_gram_72 : R.drawable.star_small_inner;
        SpannableString spannableString = new SpannableString(str.concat(" "));
        if (kqVarArr == null || (kqVar = kqVarArr[0]) == null) {
            if (kqVarArr == null || kqVarArr.length <= 0) {
                kqVar = new kq(i7, 0);
            } else {
                kqVar = new kq(i7, 0);
                kqVarArr[0] = kqVar;
            }
        }
        kqVar.d = false;
        if (z10) {
            f10 *= 0.33f;
        }
        kqVar.I = f10;
        kqVar.J = f10;
        spannableString.setSpan(kqVar, 0, spannableString.length() - 1, 33);
        org.telegram.messenger.g0.M2(spannableStringBuilder, "⭐", "⭐️");
        org.telegram.messenger.g0.M2(spannableStringBuilder, "⭐", "⭐ ");
        org.telegram.messenger.g0.M2(spannableStringBuilder, spannableString, "⭐");
        org.telegram.messenger.g0.M2(spannableStringBuilder, "XTR", "XTR ");
        org.telegram.messenger.g0.M2(spannableStringBuilder, spannableString, "XTR");
        return spannableStringBuilder;
    }

    public static fa c1(View view, ImageReceiver imageReceiver, String str, boolean z10) {
        int i7 = imageReceiver.d;
        final da daVar = new da(z10, i7, str, imageReceiver, new boolean[1]);
        daVar.run();
        final int i10 = 0;
        Runnable h = ks.f(i7).h(view, z10 ? ks.Z2 : ks.Y2, new w10() { // from class: di.ea
            @Override // org.telegram.messenger.w10
            public final void a(Object obj) {
                switch (i10) {
                    case 0:
                        daVar.run();
                        break;
                    default:
                        daVar.run();
                        break;
                }
            }
        });
        final int i11 = 1;
        return new fa(h, ks.f(i7).h(view, ks.y0, new w10() { // from class: di.ea
            @Override // org.telegram.messenger.w10
            public final void a(Object obj) {
                switch (i11) {
                    case 0:
                        daVar.run();
                        break;
                    default:
                        daVar.run();
                        break;
                }
            }
        }), 0);
    }

    public static void d1(ImageReceiver imageReceiver, TLRPC.Document document, int i7) {
        if (document == null) {
            imageReceiver.f();
            return;
        }
        TLRPC.PhotoSize w10 = org.telegram.messenger.w7.w(document.thumbs, i7, false, null, false);
        imageReceiver.s0(org.telegram.messenger.fc.b(document), com.google.android.gms.internal.vision.e2.j(i7, "_", i7), org.telegram.messenger.fc.c(w10, document), com.google.android.gms.internal.vision.e2.j(i7, "_", i7), org.telegram.messenger.u5.d(document.thumbs, org.telegram.ui.ActionBar.n6.a7, 0.35f, false), 0L, null, null, 0);
    }

    public static void e1(ImageReceiver imageReceiver, TL_stars.StarGift starGift, int i7) {
        d1(imageReceiver, starGift == null ? null : starGift.getDocument(), i7);
    }

    public static void f1(org.telegram.ui.Components.p9 p9Var, ImageReceiver imageReceiver, long j3) {
        c1(p9Var, imageReceiver, j3 <= 1000 ? "2⃣" : j3 < 2500 ? "3⃣" : "4⃣", false);
    }

    public static fa g1(org.telegram.ui.Components.p9 p9Var, ImageReceiver imageReceiver, int i7) {
        return c1(p9Var, imageReceiver, i7 != 3 ? i7 != 6 ? i7 != 12 ? i7 != 24 ? "1⃣" : "5⃣" : "4⃣" : "3⃣" : "2⃣", false);
    }

    public static void h1(org.telegram.ui.Components.p9 p9Var, ImageReceiver imageReceiver, long j3) {
        c1(p9Var, imageReceiver, j3 <= 10000000000L ? "2⃣" : j3 <= 50000000000L ? "1⃣" : "3⃣", true);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v0, types: [android.view.View, android.view.ViewGroup, android.widget.LinearLayout] */
    /* JADX WARN: Type inference failed for: r18v5 */
    /* JADX WARN: Type inference failed for: r18v6 */
    /* JADX WARN: Type inference failed for: r18v7 */
    /* JADX WARN: Type inference failed for: r1v5, types: [android.view.View, android.widget.TextView] */
    public static void i1(Context context, int i7, long j3, TL_stories.Boost boost, org.telegram.ui.ActionBar.i6 i6Var) {
        boolean z10;
        if (context == null) {
            return;
        }
        org.telegram.ui.ActionBar.w2 j10 = org.telegram.messenger.f3.j(1, context, i6Var, false);
        ?? g10 = org.telegram.messenger.f3.g(context, 1);
        g10.setPadding(0, org.telegram.messenger.g0.L(20.0f), 0, org.telegram.messenger.g0.L(4.0f));
        g10.setClipChildren(false);
        g10.setClipToPadding(false);
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setClipChildren(false);
        frameLayout.setClipToPadding(false);
        g10.addView(frameLayout, c8.na.t(-1, ks.g2, 7, 0, 0, 0, 10));
        ua uaVar = new ua(context, 70, 0, 0);
        frameLayout.addView(uaVar, c8.na.c(-1.0f, -1));
        vg.m mVar = new vg.m(context, 1, 2);
        vg.f fVar = mVar.b;
        fVar.z = org.telegram.ui.ActionBar.n6.Wk;
        fVar.A = org.telegram.ui.ActionBar.n6.Xk;
        fVar.b();
        mVar.setStarParticlesView(uaVar);
        frameLayout.addView(mVar, c8.na.d(ks.A2, 170.0f, 17, 0.0f, 32.0f, 0.0f, 24.0f));
        mVar.setPaused(false);
        TextView textView = new TextView(context);
        org.telegram.messenger.f3.l(textView, org.telegram.ui.ActionBar.n6.j5, i6Var, 1, 20.0f);
        textView.setGravity(17);
        org.telegram.ui.ActionBar.w2[] w2VarArr = new org.telegram.ui.ActionBar.w2[1];
        textView.setText(gd.H(' ', "BoostStars", (int) boost.stars));
        ?? f10 = m10.f(g10, textView, c8.na.t(-1, -2, 17, 20, 0, 20, 4), context);
        f10.setBackground(org.telegram.ui.ActionBar.n6.d0(org.telegram.messenger.g0.L(20.0f), -6915073));
        f10.setTextColor(-1);
        f10.setTextSize(1, 11.33f);
        f10.setPadding(org.telegram.messenger.g0.L(4.0f), 0, org.telegram.messenger.g0.L(8.33f), 0);
        f10.setGravity(17);
        f10.setTypeface(org.telegram.messenger.g0.o());
        StringBuilder sb2 = new StringBuilder("x");
        int i10 = boost.multiplier;
        if (i10 == 0) {
            i10 = 1;
        }
        sb2.append(gd.H(' ', "BoostingBoostsCount", i10));
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(sb2.toString());
        kq kqVar = new kq(R.drawable.mini_boost_badge, 2);
        float L = org.telegram.messenger.g0.L(0.66f);
        kqVar.r = 0.0f;
        kqVar.s = L;
        spannableStringBuilder.setSpan(kqVar, 0, 1, 33);
        f10.setText(spannableStringBuilder);
        g10.addView(f10, c8.na.t(-2, 20, 17, 20, 4, 20, 4));
        dy0 dy0Var = new dy0(context, i6Var);
        dy0Var.n(gd.N0(2131753624, null), i7, j3, new i9(w2VarArr, j3, 6));
        dy0Var.e(gd.N0(2131753623, null), gd.G((int) boost.stars, "BoostStars", new Object[0]), null, null);
        if (boost.giveaway_msg_id != 0) {
            String N0 = gd.N0(2131753612, null);
            String N02 = gd.N0(2131753611, null);
            z10 = 0;
            bi.s2 s2Var = new bi.s2(w2VarArr, j3, boost, 4);
            w2VarArr = w2VarArr;
            dy0Var.i(N0, N02, s2Var);
        } else {
            z10 = 0;
        }
        String N03 = gd.N0(2131753659, null);
        String format = gd.E0().s0().format(new Date(boost.date * 1000));
        String format2 = gd.E0().p0().format(new Date(boost.date * 1000));
        Object[] objArr = new Object[2];
        objArr[z10] = format;
        objArr[1] = format2;
        dy0Var.e(N03, gd.a0(null, null, 2131742512, objArr), null, null);
        String N04 = gd.N0(2131753604, null);
        String format3 = gd.E0().s0().format(new Date(boost.expires * 1000));
        String format4 = gd.E0().p0().format(new Date(boost.expires * 1000));
        Object[] objArr2 = new Object[2];
        objArr2[z10] = format3;
        objArr2[1] = format4;
        dy0Var.e(N04, gd.a0(null, null, 2131742512, objArr2), null, null);
        g10.addView(dy0Var, c8.na.k(16.0f, 17.0f, 16.0f, 0.0f, -1, -2));
        j80 j80Var = new j80(context, i6Var);
        org.telegram.ui.ActionBar.u6.U(j80Var, org.telegram.ui.ActionBar.n6.z6, i6Var);
        org.telegram.ui.ActionBar.u6.G(j80Var, org.telegram.ui.ActionBar.n6.Xc, i6Var);
        j80Var.setTextSize(1, 14.0f);
        j80Var.setText(org.telegram.messenger.g0.T2(gd.N0(2131744685, null), new bi.h2(context, 3)));
        j80Var.setGravity(17);
        g10.addView(j80Var, c8.na.k(14.0f, 15.0f, 14.0f, 7.0f, -1, -2));
        hi.e eVar = new hi.e(context, i6Var, true);
        eVar.i(gd.N0(2131747637, null), z10, true);
        eVar.setOnClickListener(new ai.k2(w2VarArr, 2));
        g10.addView(eVar, c8.na.k(16.0f, 8.0f, 16.0f, 0.0f, -1, 48));
        j10.O = g10;
        w2VarArr[0] = j10;
        j10.U0 = false;
        j10.O();
        org.telegram.ui.ActionBar.g2 T = LaunchActivity.T();
        if (!org.telegram.messenger.g0.Q1() && !org.telegram.messenger.g0.u1(T)) {
            w2VarArr[0].a0(T);
        }
        mVar.setPaused(false);
        w2VarArr[0].show();
        w2VarArr[0].n(new ca.r(mVar, 24));
    }

    public static u0 j1(Context context, int i7, TL_stars.TL_starGiftUnique tL_starGiftUnique, p10 p10Var, org.telegram.ui.ActionBar.i6 i6Var) {
        cg.b bVar = cg.b.a;
        u0 u0Var = new u0(context, i6Var, i7, tL_starGiftUnique == null ? cg.a.h(((org.telegram.messenger.j0) mp.u1(i7).A7.p.b).c, bVar) : tL_starGiftUnique.resale_ton_only ? tL_starGiftUnique.getResellAmount(cg.b.b) : tL_starGiftUnique.getResellAmount(bVar), new ai.s1(13, p10Var, r8));
        u0[] u0VarArr = {u0Var};
        u0Var.show();
        return u0VarArr[0];
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void k1(Context context, long j3, boolean z10, final p10 p10Var, org.telegram.ui.ActionBar.i6 i6Var) {
        org.telegram.ui.ActionBar.w2[] w2VarArr;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        org.telegram.ui.ActionBar.w2 j10 = org.telegram.messenger.f3.j(1, context, i6Var, false);
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        linearLayout.setClipChildren(false);
        linearLayout.setClipToPadding(false);
        linearLayout.setPadding(org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(8.0f));
        TextView textView = new TextView(context);
        textView.setTypeface(org.telegram.messenger.g0.o());
        hi.e eVar = null;
        textView.setText(gd.N0(2131747538, null));
        textView.setTextSize(1, 20.0f);
        int i7 = org.telegram.ui.ActionBar.n6.G6;
        org.telegram.ui.ActionBar.u6.U(textView, i7, i6Var);
        linearLayout.addView(textView, c8.na.k(4.0f, 0.0f, 4.0f, 18.0f, -1, -2));
        final EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(context);
        vb0 vb0Var = new vb0(context, i6Var);
        vb0Var.setForceForceUseCenter(true);
        vb0Var.setText(gd.N0(2131747539, null));
        vb0Var.setLeftPadding(org.telegram.messenger.g0.L(36.0f));
        org.telegram.ui.ActionBar.u6.U(editTextBoldCursor, i7, i6Var);
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
        org.telegram.ui.ActionBar.u6.C(editTextBoldCursor, org.telegram.ui.ActionBar.n6.lg, i6Var);
        org.telegram.ui.ActionBar.u6.l(editTextBoldCursor, 36, org.telegram.ui.ActionBar.n6.mg, i6Var);
        editTextBoldCursor.setGravity(gd.a0 ? 5 : 3);
        editTextBoldCursor.setOnFocusChangeListener(new r9(vb0Var, editTextBoldCursor, objArr2 == true ? 1 : 0));
        LinearLayout linearLayout2 = new LinearLayout(context);
        linearLayout2.setOrientation(0);
        ImageView imageView = new ImageView(context);
        imageView.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        imageView.setImageResource(R.drawable.star_small_inner);
        linearLayout2.addView(imageView, c8.na.q(-2, -2, 0.0f, 19, 14, 0, 0, 0));
        linearLayout2.addView(editTextBoldCursor, c8.na.p(-1, -2, 1.0f, ks.E1));
        vb0Var.e(editTextBoldCursor);
        vb0Var.addView(linearLayout2, c8.na.e(-1, -2, 48));
        linearLayout.addView(vb0Var, c8.na.o(-1, -2));
        TextView textView2 = new TextView(context);
        textView2.setTextSize(1, 16.0f);
        org.telegram.ui.ActionBar.u6.U(textView2, org.telegram.ui.ActionBar.n6.A6, null);
        vb0Var.addView(textView2, c8.na.d(-2, -2.0f, 21, 0.0f, 0.0f, 14.0f, 0.0f));
        j80 j80Var = new j80(context, null);
        j80Var.setText(org.telegram.messenger.g0.H2(org.telegram.messenger.g0.T2(gd.N0(2131747541, null), new bi.h2(context, 4)), true));
        j80Var.setTextSize(1, 12.0f);
        org.telegram.ui.ActionBar.u6.U(j80Var, org.telegram.ui.ActionBar.n6.z6, i6Var);
        org.telegram.ui.ActionBar.u6.G(j80Var, org.telegram.ui.ActionBar.n6.Xc, i6Var);
        linearLayout.addView(j80Var, c8.na.k(14.0f, 3.0f, 14.0f, 24.0f, -1, -2));
        final hi.e g10 = m10.g(24, context, i6Var, true);
        g10.i(gd.N0(j3 > 0 ? 2131747537 : 2131747543, null), false, true);
        linearLayout.addView(g10, c8.na.o(-1, 48));
        if (j3 > 0 && z10) {
            hi.e g11 = m10.g(24, context, i6Var, false);
            g11.i(gd.N0(2131747542, null), false, false);
            linearLayout.addView(g11, c8.na.k(0.0f, 4.0f, 0.0f, 0.0f, -1, 48));
            eVar = g11;
        }
        j10.O = linearLayout;
        final org.telegram.ui.ActionBar.w2[] w2VarArr2 = {j10};
        editTextBoldCursor.setText(j3 <= 0 ? "" : Long.toString(j3));
        editTextBoldCursor.addTextChangedListener(new sa(editTextBoldCursor, vb0Var, j3, z10, g10, textView2));
        final boolean[] zArr = {false};
        editTextBoldCursor.setOnEditorActionListener(new TextView.OnEditorActionListener() { // from class: di.s9
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
                g10.setLoading(true);
                EditTextBoldCursor editTextBoldCursor2 = editTextBoldCursor;
                p10Var.a(Long.valueOf(Long.parseLong(editTextBoldCursor2.getText().toString())), new w9(editTextBoldCursor2, w2VarArr2, 1));
                return true;
            }
        });
        t9 t9Var = new t9(zArr, p10Var, editTextBoldCursor, g10, w2VarArr2);
        EditTextBoldCursor editTextBoldCursor2 = editTextBoldCursor;
        g10.setOnClickListener(t9Var);
        if (eVar != null) {
            hi.e eVar2 = eVar;
            t9 t9Var2 = new t9(zArr, p10Var, eVar2, editTextBoldCursor2, w2VarArr2);
            editTextBoldCursor2 = editTextBoldCursor2;
            w2VarArr = w2VarArr2;
            eVar2.setOnClickListener(t9Var2);
        } else {
            w2VarArr = w2VarArr2;
        }
        w2VarArr[0].O();
        w2VarArr[0].setOnDismissListener(new u9(editTextBoldCursor2, objArr == true ? 1 : 0));
        w2VarArr[0].show();
        org.telegram.ui.ActionBar.g2 Q = LaunchActivity.Q();
        org.telegram.messenger.g0.h3(new w9(w2VarArr, editTextBoldCursor2), Q instanceof bn ? ((bn) Q).sa() : false ? 200L : 80L);
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type update terminated with stack overflow, arg: (r11v19 ??), method size: 4312
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:77)
        */
    public static org.telegram.ui.ActionBar.w2 l1(android.content.Context r60, boolean r61, long r62, int r64, org.telegram.tgnet.tl.TL_stars.StarsTransaction r65, org.telegram.ui.ActionBar.i6 r66) {
        /*
            Method dump skipped, instructions count: 4312
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: di.pb.l1(android.content.Context, boolean, long, int, org.telegram.tgnet.tl.TL_stars$StarsTransaction, org.telegram.ui.ActionBar.i6):org.telegram.ui.ActionBar.w2");
    }

    public static void m1(Activity activity, int i7, int i10, TLRPC.TL_messageActionPaymentRefunded tL_messageActionPaymentRefunded, org.telegram.ui.ActionBar.i6 i6Var) {
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
        l1(activity, false, 0L, i7, starsTransaction, i6Var);
    }

    public static void n1(Context context, int i7, TLRPC.TL_payments_paymentReceiptStars tL_payments_paymentReceiptStars, org.telegram.ui.ActionBar.i6 i6Var) {
        TL_stars.StarsTransaction starsTransaction = new TL_stars.StarsTransaction();
        starsTransaction.title = tL_payments_paymentReceiptStars.title;
        starsTransaction.description = tL_payments_paymentReceiptStars.description;
        starsTransaction.photo = tL_payments_paymentReceiptStars.photo;
        TL_stars.TL_starsTransactionPeer tL_starsTransactionPeer = new TL_stars.TL_starsTransactionPeer();
        starsTransaction.peer = tL_starsTransactionPeer;
        tL_starsTransactionPeer.peer = mp.u1(i7).B1(tL_payments_paymentReceiptStars.bot_id);
        starsTransaction.date = tL_payments_paymentReceiptStars.date;
        starsTransaction.amount = TL_stars.StarsAmount.ofStars(-tL_payments_paymentReceiptStars.total_amount);
        starsTransaction.id = tL_payments_paymentReceiptStars.transaction_id;
        l1(context, false, 0L, i7, starsTransaction, i6Var);
    }

    public static CharSequence t1(CharSequence charSequence, boolean z10) {
        a5.q c10;
        if (z10 && (charSequence instanceof Spanned)) {
            for (kq kqVar : (kq[]) ((Spanned) charSequence).getSpans(0, charSequence.length(), kq.class)) {
                Drawable drawable = kqVar.c;
                if (drawable != null && !(drawable instanceof a5.q) && (c10 = a5.q.c(org.telegram.messenger.t0.b.getResources(), R.drawable.mini_gram_72_white, null)) != null) {
                    c10.setBounds(kqVar.c.getBounds());
                    kqVar.c = c10;
                    kqVar.d = false;
                }
            }
        }
        return charSequence;
    }

    public final void J0() {
        r1();
        ek0 ek0Var = this.c;
        if (ek0Var == null || this.V == null || ek0Var.getLayoutParams() == null) {
            return;
        }
        int D = m10.D(48.0f, this.c0, -org.telegram.messenger.g0.L(8.0f));
        int D2 = m10.D(48.0f, this.d0, -org.telegram.messenger.g0.L(8.0f));
        org.telegram.messenger.g0.z3(this.c, 0, D, 0, D2);
        ek0 ek0Var2 = this.c;
        int i7 = -D;
        ek0Var2.setPadding(ek0Var2.getPaddingLeft(), i7, this.c.getPaddingRight(), this.d0 - D2);
        this.V.z(i7, -D2);
    }

    public final void K0(ArrayList arrayList, b51 b51Var) {
        ek0 ek0Var;
        o1("FILL_BEFORE");
        st0 st0Var = this.V;
        boolean z10 = st0Var != null && st0Var.f0;
        this.b0 = -1;
        if (getParentActivity() == null) {
            return;
        }
        y8 y10 = y8.y(this.currentAccount, false);
        ArrayList arrayList2 = y10.v;
        tv tvVar = (tv) super.o0(getParentActivity());
        n41 n41Var = new n41(-2);
        n41Var.c = tvVar;
        arrayList.add(n41Var);
        arrayList.add(n41.k(this.j0));
        hi.e eVar = this.s0;
        if (eVar != null) {
            eVar.setVisibility(getMessagesController().a6 ? 0 : 8);
        }
        arrayList.add(n41.C(null));
        if (getMessagesController().j6) {
            arrayList.add(ki.f.i(-4, getThemedColor(org.telegram.ui.ActionBar.n6.lk), rn.i0(gd.N0(2131743519, null)), gd.N0(2131743520, null)));
            arrayList.add(n41.C(null));
        }
        if (y10.e && !arrayList2.isEmpty()) {
            i5.c.s(2131744962, null, arrayList);
            for (int i7 = 0; i7 < arrayList2.size(); i7++) {
                TL_stars.StarsSubscription starsSubscription = (TL_stars.StarsSubscription) arrayList2.get(i7);
                int i10 = hb.b;
                n41 K = n41.K(hb.class);
                K.H = starsSubscription;
                arrayList.add(K);
            }
            if (y10.x) {
                arrayList.add(n41.q(arrayList.size(), 33));
            } else if (!y10.y) {
                n41 c10 = n41.c(-3, R.drawable.arrow_more, gd.N0(2131744961, null));
                c10.r = true;
                arrayList.add(c10);
            }
            arrayList.add(n41.C(null));
        }
        boolean M = y10.M(0);
        this.t0 = M;
        if (M) {
            this.b0 = arrayList.size();
            arrayList.add(n41.n(this.W, -2));
            if (z10 && (ek0Var = this.c) != null) {
                ca.r rVar = this.g0;
                ek0Var.removeCallbacks(rVar);
                this.c.post(rVar);
            }
        } else {
            arrayList.add(n41.m(this.h0));
        }
        o1("FILL_AFTER");
    }

    @Override // org.telegram.ui.r00, org.telegram.ui.ActionBar.g2
    public final View createView(final Context context) {
        TLRPC.TL_starsRevenueStatus tL_starsRevenueStatus;
        final int i7 = 0;
        this.H = false;
        this.F = org.telegram.messenger.g0.L(238.0f);
        st0 st0Var = new st0(context);
        this.V = st0Var;
        char c10 = 1;
        char c11 = 1;
        char c12 = 1;
        char c13 = 1;
        char c14 = 1;
        char c15 = 1;
        char c16 = 1;
        st0Var.setDebugLoggingEnabled(true);
        this.V.setCommonInsetsManagedExternally(true);
        if (!this.e0) {
            org.telegram.ui.ActionBar.r4 r4Var = this.parentLayout;
            this.c0 = (r4Var == null || !((ActionBarLayout) r4Var).T0) ? org.telegram.messenger.g0.m : 0;
            this.d0 = org.telegram.messenger.g0.n;
        }
        this.V.setGeometry(new cb.c(this, 17));
        this.V.z(-m10.D(48.0f, this.c0, -org.telegram.messenger.g0.L(8.0f)), -m10.D(48.0f, this.d0, -org.telegram.messenger.g0.L(8.0f)));
        st0 st0Var2 = this.V;
        st0Var2.getClass();
        this.W = new bi.o3(26, context, st0Var2);
        this.U = new ob(context, this.currentAccount, false, 0L, getClassGuid(), getResourceProvider(), this.V);
        this.h0 = new bi.o3(c16 == true ? 1 : 0, context, this);
        super.createView(context);
        q00 q00Var = this.s;
        getBaseSimpleGlass().f(q00Var, this.c, this.simpleActionBar, this.resourceProvider);
        this.simpleActionBar.setBackground(null);
        this.E.bringToFront();
        this.simpleActionBar.bringToFront();
        getBaseSimpleGlass().n = this.V;
        this.c.setCaptureSectionsDecoratorAllowed(true);
        this.U.setGlassEngine(this.glassEngine);
        getBaseSimpleGlass().o = new f(c14 == true ? 1 : 0, this, new e(c15 == true ? 1 : 0, q00Var));
        View view = this.U.d;
        View view2 = new View(getParentActivity());
        this.X = view2;
        view2.setAlpha(0.0f);
        st0 st0Var3 = this.V;
        st0Var3.addView(this.X, st0Var3.indexOfChild(view), c8.na.e(-1, 0, 48));
        this.X.setBackground(getBaseSimpleGlass().a(this.X));
        e9 e9Var = new e9(this, i7);
        kr krVar = kr.h;
        te.a aVar = new te.a(0, e9Var, krVar, 380L, false);
        this.Y = aVar;
        this.Z = new te.a(1, new e9(this, c13 == true ? 1 : 0), krVar, 380L, false);
        int i10 = 2;
        this.a0 = new te.a(2, new e9(this, i10), krVar, 380L, false);
        aVar.a(this.c.canScrollVertically(-1) || this.simpleActionBar.x(), false);
        this.Z.a(this.V.f0, false);
        this.c.j(new bi.v1(this, 10));
        r1();
        fh.g c17 = getBaseSimpleGlass().c.c(view, null, false);
        c17.p(c8.j0.m(this.resourceProvider));
        c17.q(org.telegram.messenger.g0.L(9.66f));
        c17.r(org.telegram.messenger.g0.L(18.0f));
        view.setBackground(c17);
        org.telegram.ui.ActionBar.r4 r4Var2 = this.parentLayout;
        if (r4Var2 != null && ((ActionBarLayout) r4Var2).U0) {
            this.simpleActionBar.setBackButtonImage(R.drawable.ic_ab_close);
        }
        FrameLayout frameLayout = new FrameLayout(context);
        this.S = frameLayout;
        frameLayout.setClickable(true);
        vg.m mVar = new vg.m(context, 1, 2);
        this.T = mVar;
        vg.f fVar = mVar.b;
        fVar.z = org.telegram.ui.ActionBar.n6.Wk;
        fVar.A = org.telegram.ui.ActionBar.n6.Xk;
        fVar.b();
        this.T.setStarParticlesView(this.e);
        this.S.addView(this.T, c8.na.d(ks.U2, 190.0f, 17, 0.0f, 12.0f, 0.0f, 24.0f));
        j0(gd.N0(2131743970, null), org.telegram.messenger.g0.H2(org.telegram.messenger.g0.T2(gd.N0(2131743967, null), new bi.h2(context, c12 == true ? 1 : 0)), true), this.S, null);
        this.c.setOverScrollMode(2);
        v4.l lVar = new v4.l();
        lVar.m = false;
        lVar.C = false;
        lVar.o(krVar);
        lVar.n(350L);
        this.c.setItemAnimator(lVar);
        this.c.setOnItemClickListener(new bi.n8(this, i10));
        tz tzVar = new tz(getParentActivity());
        this.i0 = tzVar;
        this.s.addView(tzVar, c8.na.c(-1.0f, -1));
        y8 y10 = y8.y(this.currentAccount, false);
        LinearLayout linearLayout = new LinearLayout(getParentActivity());
        this.j0 = linearLayout;
        linearLayout.setOrientation(1);
        this.j0.setPadding(0, org.telegram.messenger.g0.L(24.0f), 0, org.telegram.messenger.g0.L(10.0f));
        org.telegram.ui.Components.n6 n6Var = new org.telegram.ui.Components.n6(getParentActivity(), false, true, false);
        this.l0 = n6Var;
        n6Var.setTypeface(org.telegram.messenger.g0.o());
        this.l0.setTextSize(org.telegram.messenger.g0.L(32.0f));
        this.l0.setGravity(17);
        org.telegram.ui.ActionBar.u6.Y(this.l0, org.telegram.ui.ActionBar.n6.G6, this.resourceProvider);
        this.k0 = new SpannableStringBuilder("S");
        r50 r50Var = new r50(42.0f, this.currentAccount, this.l0);
        nh0 nh0Var = new nh0(R.raw.star_reaction, org.telegram.messenger.g0.L(42.0f), org.telegram.messenger.g0.L(42.0f));
        ImageReceiver imageReceiver = r50Var.b;
        imageReceiver.x0(nh0Var);
        imageReceiver.X(2);
        r50Var.f = false;
        r50Var.h = -org.telegram.messenger.g0.L(3.0f);
        this.k0.setSpan(r50Var, 0, 1, 33);
        this.j0.addView(this.l0, c8.na.d(-1, 40.0f, 17, 24.0f, 0.0f, 24.0f, 0.0f));
        TextView textView = new TextView(getParentActivity());
        this.m0 = textView;
        textView.setTextSize(1, 14.0f);
        this.m0.setGravity(17);
        this.m0.setText(gd.N0(2131742519, null));
        org.telegram.ui.ActionBar.u6.U(this.m0, org.telegram.ui.ActionBar.n6.z6, this.resourceProvider);
        this.j0.addView(this.m0, c8.na.d(-1, -2.0f, 17, 24.0f, 0.0f, 24.0f, 0.0f));
        FrameLayout frameLayout2 = new FrameLayout(getParentActivity());
        int i11 = 3;
        bi.g3 g3Var = new bi.g3(i11, getParentActivity(), this);
        this.o0 = g3Var;
        frameLayout2.addView(g3Var);
        hi.e eVar = new hi.e(getParentActivity(), this.resourceProvider, true);
        this.p0 = eVar;
        eVar.f();
        this.p0.i("", false, true);
        this.p0.setOnClickListener(new View.OnClickListener(this) { // from class: di.n9
            public final /* synthetic */ pb b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view3) {
                switch (i7) {
                    case 0:
                        pb.A0(this.b, context);
                        break;
                    default:
                        new gb(context, this.b.resourceProvider).show();
                        break;
                }
            }
        });
        this.o0.addView(this.p0, c8.na.e(-1, 48, ks.E1));
        b61 b61Var = new b61(i11, getParentActivity(), this);
        this.q0 = b61Var;
        frameLayout2.addView(b61Var);
        hi.e eVar2 = new hi.e(getParentActivity(), this.resourceProvider, true);
        this.r0 = eVar2;
        eVar2.f();
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("x  ");
        spannableStringBuilder.setSpan(new kq(R.drawable.mini_topup, 2), 0, 1, 33);
        spannableStringBuilder.append((CharSequence) gd.N0(2131744724, null));
        this.r0.i(spannableStringBuilder, false, true);
        hi.e eVar3 = this.r0;
        final char c18 = c11 == true ? 1 : 0;
        eVar3.setOnClickListener(new View.OnClickListener(this) { // from class: di.n9
            public final /* synthetic */ pb b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view3) {
                switch (c18) {
                    case 0:
                        pb.A0(this.b, context);
                        break;
                    default:
                        new gb(context, this.b.resourceProvider).show();
                        break;
                }
            }
        });
        this.q0.addView(this.r0, c8.na.q(-1, 48, 17.0f, 1, 0, 0, 8, 0));
        hi.e eVar4 = new hi.e(getParentActivity(), this.resourceProvider, true);
        this.n0 = eVar4;
        eVar4.f();
        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder("x  ");
        spannableStringBuilder2.setSpan(new kq(R.drawable.mini_stats, 2), 0, 1, 33);
        spannableStringBuilder2.append((CharSequence) gd.N0(2131744781, null));
        this.n0.i(spannableStringBuilder2, false, true);
        this.n0.setOnClickListener(new View.OnClickListener(this) { // from class: di.v9
            public final /* synthetic */ pb b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view3) {
                switch (i7) {
                    case 0:
                        pb pbVar = this.b;
                        pbVar.presentFragment(new t(0, pbVar.getUserConfig().e()));
                        break;
                    default:
                        pb.B0(this.b);
                        break;
                }
            }
        });
        this.q0.addView(this.n0, c8.na.q(-1, 48, 17.0f, 1, 0, 0, 0, 0));
        this.j0.addView(frameLayout2, c8.na.d(-1, 48.0f, 17, 20.0f, 17.0f, 20.0f, 0.0f));
        hi.e eVar5 = new hi.e(getParentActivity(), this.resourceProvider, false);
        this.s0 = eVar5;
        eVar5.f();
        SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder();
        spannableStringBuilder3.append((CharSequence) "G  ");
        spannableStringBuilder3.setSpan(new kq(R.drawable.menu_stars_gift, 0), 0, 1, 33);
        spannableStringBuilder3.append((CharSequence) gd.N0(2131743968, null));
        this.s0.i(spannableStringBuilder3, false, true);
        hi.e eVar6 = this.s0;
        final char c19 = c10 == true ? 1 : 0;
        eVar6.setOnClickListener(new View.OnClickListener(this) { // from class: di.v9
            public final /* synthetic */ pb b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view3) {
                switch (c19) {
                    case 0:
                        pb pbVar = this.b;
                        pbVar.presentFragment(new t(0, pbVar.getUserConfig().e()));
                        break;
                    default:
                        pb.B0(this.b);
                        break;
                }
            }
        });
        this.j0.addView(this.s0, c8.na.d(-1, 48.0f, 17, 20.0f, 8.0f, 20.0f, 0.0f));
        p1();
        bi.j8 j8Var = this.v0;
        if (j8Var != null) {
            j8Var.O(false);
        }
        e0.g(this.currentAccount).r(getUserConfig().e());
        TLRPC.TL_payments_starsRevenueStats h = e0.g(this.currentAccount).h(getUserConfig().e(), false);
        q1(y10.p().amount > 0 && h != null && (tL_starsRevenueStatus = h.status) != null && tL_starsRevenueStatus.overall_revenue.positive(), false);
        return this.fragmentView;
    }

    @Override // org.telegram.messenger.fs
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        int i11 = ks.x3;
        int i12 = ks.C3;
        int i13 = ks.B3;
        if (i7 == i13 || i7 == i12 || i7 == i11) {
            o1("NOTIFICATION_" + i7);
        }
        if (i7 == i11) {
            u0();
            bi.j8 j8Var = this.v0;
            if (j8Var != null) {
                j8Var.O(true);
            }
            h0();
            return;
        }
        if (i7 == i13) {
            y8 y10 = y8.y(this.currentAccount, false);
            if (this.t0 != y10.M(0)) {
                this.t0 = y10.M(0);
                u0();
                bi.j8 j8Var2 = this.v0;
                if (j8Var2 != null) {
                    j8Var2.O(false);
                }
                h0();
                return;
            }
            return;
        }
        if (i7 == i12) {
            bi.j8 j8Var3 = this.v0;
            if (j8Var3 != null) {
                j8Var3.O(true);
                return;
            }
            return;
        }
        if (i7 == ks.A3) {
            p1();
        } else if (i7 == ks.E3 && getUserConfig().e() == ((Long) objArr[0]).longValue()) {
            p1();
        }
    }

    @Override // org.telegram.ui.r00
    public final void h0() {
        st0 st0Var;
        o1("RESTORE_BEFORE");
        super.h0();
        if (this.f0 && (st0Var = this.V) != null && this.b0 != -1) {
            st0Var.a();
        }
        this.f0 = false;
        o1("RESTORE_AFTER");
    }

    @Override // org.telegram.ui.r00
    public final void i0() {
        this.s.addView(this.V, c8.na.c(-1.0f, -1));
        this.V.u(this.c, new e9(this, 3));
        st0 st0Var = this.V;
        ob obVar = this.U;
        st0Var.x(obVar, obVar.b, new ci.v(6));
        this.V.y(this.U.d);
        this.U.d.setLayoutParams(c8.na.d(-1, -2.0f, 48, -4.0f, 0.0f, -4.0f, 0.0f));
        J0();
    }

    @Override // org.telegram.ui.r00, org.telegram.ui.ActionBar.g2
    public final boolean isSwipeBackEnabled(MotionEvent motionEvent) {
        st0 st0Var = this.V;
        return st0Var == null || motionEvent == null || st0Var.j(motionEvent.getX(), motionEvent.getY()) || !this.V.c() || this.U.b.b == 0;
    }

    @Override // org.telegram.ui.r00
    public final v4.i0 k0() {
        bi.j8 j8Var = new bi.j8(this, this.c, getParentActivity(), this.currentAccount, this.classGuid, new bi.b(this, 18), getResourceProvider(), 1);
        this.v0 = j8Var;
        j8Var.r = false;
        return j8Var;
    }

    @Override // org.telegram.ui.r00
    public final v4.c0 l0(Context context) {
        st0 st0Var = this.V;
        st0Var.getClass();
        return new jg.i0(5, st0Var, false);
    }

    @Override // org.telegram.ui.r00
    public final ug.t1 m0() {
        return new ua(getParentActivity(), 75, 1, 0);
    }

    @Override // org.telegram.ui.r00
    public final View o0(Context context) {
        throw null;
    }

    public final void o1(String str) {
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
        bi.o3 o3Var = this.W;
        u10.append((o3Var == null || o3Var.getParent() == null) ? false : true);
        u10.append(" boundaryTop=");
        bi.o3 o3Var2 = this.W;
        u10.append(o3Var2 == null ? 0 : o3Var2.getTop());
        u10.append(" boundaryHeight=");
        bi.o3 o3Var3 = this.W;
        u10.append(o3Var3 == null ? 0 : o3Var3.getHeight());
        Log.d("SiblingScroll", u10.toString());
        st0 st0Var = this.V;
        if (st0Var.a) {
            st0Var.b = Math.max(st0Var.b, Math.min(60, Math.max(0, 30)));
            st0Var.f(str, null, 0, 0, true);
        }
    }

    @Override // org.telegram.ui.ActionBar.g2
    public final boolean onFragmentCreate() {
        ks.f(this.currentAccount).c(this, ks.x3);
        ks.f(this.currentAccount).c(this, ks.A3);
        ks.f(this.currentAccount).c(this, ks.B3);
        ks.f(this.currentAccount).c(this, ks.C3);
        ks.f(this.currentAccount).c(this, ks.E3);
        y8.y(this.currentAccount, false).R(true);
        y8.y(this.currentAccount, false).Q();
        y8.y(this.currentAccount, false).z();
        return super.onFragmentCreate();
    }

    @Override // org.telegram.ui.ActionBar.g2
    public final void onFragmentDestroy() {
        ek0 ek0Var = this.c;
        if (ek0Var != null) {
            ek0Var.removeCallbacks(this.g0);
        }
        super.onFragmentDestroy();
        ks.f(this.currentAccount).n(this, ks.x3);
        ks.f(this.currentAccount).n(this, ks.A3);
        ks.f(this.currentAccount).n(this, ks.B3);
        ks.f(this.currentAccount).n(this, ks.C3);
        ks.f(this.currentAccount).n(this, ks.E3);
    }

    @Override // org.telegram.ui.r00, org.telegram.ui.ActionBar.g2
    public final void onInsets(int i7, int i10, int i11, int i12) {
        this.e0 = true;
        this.c0 = i10;
        this.d0 = i12;
        J0();
    }

    @Override // org.telegram.ui.r00, org.telegram.ui.ActionBar.g2
    public final void onPause() {
        super.onPause();
        vg.m mVar = this.T;
        if (mVar != null) {
            mVar.setPaused(true);
            this.T.setDialogVisible(true);
        }
    }

    @Override // org.telegram.ui.r00, org.telegram.ui.ActionBar.g2
    public final void onResume() {
        super.onResume();
        vg.m mVar = this.T;
        if (mVar != null) {
            mVar.setPaused(false);
            this.T.setDialogVisible(false);
        }
    }

    public final void p1() {
        TLRPC.TL_starsRevenueStatus tL_starsRevenueStatus;
        boolean z10 = false;
        y8 y10 = y8.y(this.currentAccount, false);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) this.k0);
        spannableStringBuilder.append((CharSequence) M0(y10.p(), 0.66f, ' '));
        this.l0.setText(spannableStringBuilder);
        this.p0.i(gd.N0(y10.p().amount > 0 ? 2131744909 : 2131744910, null), true, true);
        TLRPC.TL_payments_starsRevenueStats h = e0.g(this.currentAccount).h(getUserConfig().e(), false);
        if (h != null && (tL_starsRevenueStatus = h.status) != null && tL_starsRevenueStatus.overall_revenue.positive()) {
            z10 = true;
        }
        q1(z10, true);
    }

    @Override // org.telegram.ui.r00
    public final float q0() {
        ek0 ek0Var = this.c;
        if (ek0Var == null) {
            return 0.0f;
        }
        return ek0Var.getY();
    }

    public final void q1(final boolean z10, boolean z11) {
        this.u0 = z10;
        if (z11) {
            this.o0.setVisibility(0);
            this.q0.setVisibility(0);
            final int i7 = 0;
            this.o0.animate().alpha(z10 ? 0.0f : 1.0f).withEndAction(new Runnable(this) { // from class: di.ga
                public final /* synthetic */ pb b;

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
            this.q0.animate().alpha(z10 ? 1.0f : 0.0f).withEndAction(new Runnable(this) { // from class: di.ga
                public final /* synthetic */ pb b;

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

    @Override // org.telegram.ui.r00
    public final View r0() {
        return this.V;
    }

    public final void r1() {
        if (this.X == null) {
            return;
        }
        int L = org.telegram.messenger.g0.L(44.0f) + org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + this.c0;
        ViewGroup.LayoutParams layoutParams = this.X.getLayoutParams();
        if (layoutParams.height != L) {
            layoutParams.height = L;
            this.X.setLayoutParams(layoutParams);
        }
        s1();
    }

    @Override // org.telegram.ui.r00
    public final void s0(boolean z10) {
        te.a aVar = this.a0;
        if (aVar == null || aVar.f == z10) {
            return;
        }
        aVar.a(z10, true);
    }

    public final void s1() {
        View view = this.X;
        if (view == null) {
            return;
        }
        te.a aVar = this.Y;
        float f10 = aVar == null ? 0.0f : aVar.e;
        te.a aVar2 = this.Z;
        view.setTranslationY(((-(1.0f - f10)) * org.telegram.ui.ActionBar.k.getCurrentActionBarHeight()) - ((1.0f - (aVar2 != null ? aVar2.e : 0.0f)) * org.telegram.messenger.g0.L(44.0f)));
    }

    @Override // org.telegram.ui.r00
    public final void u0() {
        o1("SAVE_BEFORE");
        super.u0();
        st0 st0Var = this.V;
        this.f0 = st0Var != null && st0Var.f0;
        ek0 ek0Var = this.c;
        if (ek0Var != null && this.Q >= 0) {
            this.R -= ek0Var.getPaddingTop();
        }
        o1("SAVE_AFTER");
    }

    @Override // org.telegram.ui.ActionBar.g2
    public final boolean useSimpleActionBar() {
        return true;
    }
}
