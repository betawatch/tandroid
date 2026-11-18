package di;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.RadialGradient;
import android.graphics.Shader;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
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
import j$.util.Objects;
import java.lang.reflect.Method;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.ArrayList;
import java.util.Date;
import java.util.Locale;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.fj;
import org.telegram.messenger.fs;
import org.telegram.messenger.gd;
import org.telegram.messenger.h20;
import org.telegram.messenger.j10;
import org.telegram.messenger.ks;
import org.telegram.messenger.mp;
import org.telegram.messenger.n10;
import org.telegram.messenger.o10;
import org.telegram.messenger.q10;
import org.telegram.messenger.x10;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.ck0;
import org.telegram.ui.Components.cy0;
import org.telegram.ui.Components.k80;
import org.telegram.ui.Components.l41;
import org.telegram.ui.Components.lq;
import org.telegram.ui.Components.lr;
import org.telegram.ui.Components.mh0;
import org.telegram.ui.Components.mq;
import org.telegram.ui.Components.p80;
import org.telegram.ui.Components.qt0;
import org.telegram.ui.Components.uz;
import org.telegram.ui.Components.xb0;
import org.telegram.ui.Components.z41;
import org.telegram.ui.Components.zx0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.bn;
import org.telegram.ui.d61;
import org.telegram.ui.r00;
import org.telegram.ui.r50;
import org.telegram.ui.rn;
import org.telegram.ui.s00;
import org.telegram.ui.uv;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final class pb extends s00 implements fs {
    public static DecimalFormat w0;
    public static DecimalFormat x0;
    public FrameLayout S;
    public vg.m T;
    public ob U;
    public qt0 V;
    public bi.i3 W;
    public View X;
    public te.a Y;
    public te.a Z;
    public te.a a0;
    public int c0;
    public int d0;
    public boolean e0;
    public boolean f0;
    public bi.i3 h0;
    public uz i0;
    public LinearLayout j0;
    public SpannableStringBuilder k0;
    public org.telegram.ui.Components.n6 l0;
    public TextView m0;
    public hi.d n0;
    public bi.a3 o0;
    public hi.d p0;
    public d61 q0;
    public hi.d r0;
    public hi.d s0;
    public boolean t0;
    public boolean u0;
    public bi.e8 v0;
    public int b0 = -1;
    public final ca.r g0 = new ca.r(this, 24);

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
        x8.y(pbVar.currentAccount, false).u();
        bi.a2.l1(true, org.telegram.messenger.v1.a(pbVar.currentAccount).b());
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
    /* JADX WARN: Type inference failed for: r2v13, types: [android.view.View, org.telegram.ui.Components.cy0] */
    /* JADX WARN: Type inference failed for: r5v38 */
    /* JADX WARN: Type inference failed for: r5v39, types: [boolean] */
    /* JADX WARN: Type inference failed for: r5v40 */
    /* JADX WARN: Type inference failed for: r6v34, types: [org.telegram.tgnet.TLRPC$User] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void C0(pb pbVar, int i7) {
        l41 G;
        boolean z10;
        String str;
        boolean z11;
        final boolean z12;
        TLRPC.Chat chat;
        TLRPC.Chat chat2;
        int i10;
        org.telegram.ui.ActionBar.x2[] x2VarArr;
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
        org.telegram.ui.ActionBar.h2 T;
        bi.e8 e8Var = pbVar.v0;
        if (e8Var == null || (G = e8Var.G(i7)) == null) {
            return;
        }
        int i14 = G.d;
        if (i14 == -1) {
            pbVar.v0.O(true);
            return;
        }
        if (i14 == -2) {
            x8.y(pbVar.currentAccount, false).u();
            bi.a2.l1(true, org.telegram.messenger.v1.a(pbVar.currentAccount).b());
            return;
        }
        if (i14 == -3) {
            x8.y(pbVar.currentAccount, false).U();
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
                x8.y(pbVar.currentAccount, false).f(pbVar.getParentActivity(), (TL_stars.TL_starsTopupOption) G.H, new bi.m6(i15, pbVar, G), null);
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
            org.telegram.ui.ActionBar.x2 j3 = n10.j(parentActivity, false, 1, resourceProvider);
            org.telegram.ui.ActionBar.x2[] x2VarArr2 = new org.telegram.ui.ActionBar.x2[1];
            ?? f10 = org.telegram.messenger.f3.f(parentActivity, 1);
            f10.setPadding(org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(20.0f), org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(4.0f));
            f10.setClipChildren(false);
            f10.setClipToPadding(false);
            ?? frameLayout = new FrameLayout(parentActivity);
            f10.addView(frameLayout, c8.ma.t(-1, -2, 7, 0, 0, 0, 10));
            boolean[] zArr = new boolean[1];
            oa oaVar = new oa(zArr, x2VarArr2);
            ks.f(i16).b(oaVar, ks.C3);
            long o4 = org.telegram.messenger.n5.o(starsSubscription.peer);
            org.telegram.ui.Components.q9 q9Var = new org.telegram.ui.Components.q9(parentActivity);
            if (o4 >= 0) {
                z10 = 0;
                ?? c22 = mp.u1(i16).c2(Long.valueOf(o4));
                str = o10.q(c22);
                boolean u10 = o10.u(c22);
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
                q9Var.setRoundRadius(org.telegram.messenger.g0.L(21.0f));
                chat2 = chat;
                q9Var.p(org.telegram.messenger.fc.p(h20.c(starsSubscription.photo)), "100_100", null, null);
            } else {
                chat2 = chat;
                q9Var.setRoundRadius(org.telegram.messenger.g0.L(50.0f));
                org.telegram.ui.Components.b9 b9Var = new org.telegram.ui.Components.b9((org.telegram.ui.ActionBar.i6) null);
                if (o4 < 0) {
                    i10 = i16;
                    x2VarArr = x2VarArr2;
                    TLRPC.Chat O02 = mp.u1(i16).O0(Long.valueOf(-o4));
                    b9Var.q(O02);
                    q9Var.f(O02, b9Var);
                    frameLayout.addView(q9Var, c8.ma.e(100, 100, 17));
                    Drawable drawable = parentActivity.getResources().getDrawable(R.drawable.star_small_outline);
                    org.telegram.ui.ActionBar.u6.x(frameLayout, drawable, org.telegram.ui.ActionBar.n6.h5, resourceProvider, PorterDuff.Mode.SRC_IN);
                    Drawable drawable2 = parentActivity.getResources().getDrawable(R.drawable.star_small_inner);
                    if (starsSubscription.photo == null) {
                        ImageView imageView = new ImageView(parentActivity);
                        imageView.setImageDrawable(drawable);
                        frameLayout.addView(imageView, c8.ma.e(28, 28, 17));
                        imageView.setTranslationX(org.telegram.messenger.g0.L(34.0f));
                        imageView.setTranslationY(org.telegram.messenger.g0.L(35.0f));
                        imageView.setScaleX(1.1f);
                        imageView.setScaleY(1.1f);
                        ImageView imageView2 = new ImageView(parentActivity);
                        imageView2.setImageDrawable(drawable2);
                        frameLayout.addView(imageView2, c8.ma.e(28, 28, 17));
                        imageView2.setTranslationX(org.telegram.messenger.g0.L(34.0f));
                        imageView2.setTranslationY(org.telegram.messenger.g0.L(35.0f));
                    }
                    TextView textView = new TextView(parentActivity);
                    org.telegram.messenger.f3.l(textView, org.telegram.ui.ActionBar.n6.j5, resourceProvider, 1, 20.0f);
                    textView.setGravity(17);
                    if (TextUtils.isEmpty(starsSubscription.title)) {
                        textView.setText(starsSubscription.title);
                    } else {
                        textView.setText(gd.M0(2131744736, null));
                    }
                    f10.addView(textView, c8.ma.t(-1, -2, 17, 20, 0, 20, 4));
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
                        textView2.setText(b1(z10, gd.a0(null, null, 2131744748, objArr), 0.8f, null));
                        i12 = i10;
                    } else {
                        String str5 = i11 == 300 ? "5min" : "min";
                        i12 = i10;
                        textView2.setText(b1(false, gd.a0(null, null, 2131744748, Long.valueOf(tL_starsSubscriptionPricing.amount), str5), 0.8f, null));
                    }
                    f10.addView(textView2, c8.ma.t(-1, -2, 17, 20, 0, 20, 4));
                    ?? cy0Var = new cy0(parentActivity, resourceProvider);
                    k80 k80Var = new k80(parentActivity, resourceProvider);
                    k80Var.setPadding(org.telegram.messenger.g0.L(12.66f), org.telegram.messenger.g0.L(9.33f), org.telegram.messenger.g0.L(12.66f), org.telegram.messenger.g0.L(9.33f));
                    k80Var.setEllipsize(TextUtils.TruncateAt.END);
                    int i17 = org.telegram.ui.ActionBar.n6.Xc;
                    org.telegram.ui.ActionBar.u6.U(k80Var, i17, resourceProvider);
                    org.telegram.ui.ActionBar.u6.G(k80Var, i17, resourceProvider);
                    k80Var.setTextSize(1, 14.0f);
                    k80Var.setSingleLine(true);
                    k80Var.setDisablePaddingsOffsetY(true);
                    org.telegram.ui.f5 f5Var2 = new org.telegram.ui.f5(24.0f, i12, k80Var);
                    if (o4 < 0) {
                        TLRPC.User c23 = mp.u1(i12).c2(Long.valueOf(o4));
                        boolean z15 = c23 == null || o10.y(c23);
                        String q10 = o10.q(c23);
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
                    final org.telegram.ui.ActionBar.x2[] x2VarArr3 = x2VarArr;
                    spannableStringBuilder.setSpan(new pa(x2VarArr3, o4), 3, spannableStringBuilder.length(), 33);
                    k80Var.setText(spannableStringBuilder);
                    if (!z14) {
                        cy0Var.l(k80Var, gd.M0(o4 < 0 ? 2131744760 : z11 ? 2131744770 : 2131744775, null));
                    }
                    if (o4 >= 0 || TextUtils.isEmpty(starsSubscription.title)) {
                        str3 = null;
                    } else {
                        str3 = null;
                        cy0Var.e(gd.M0(z11 ? 2131744768 : 2131744773, null), starsSubscription.title, null, null);
                    }
                    cy0Var.e(gd.M0(2131744741, str3), gd.a0(null, null, 2131742525, gd.E0().s0().format(new Date((starsSubscription.until_date - starsSubscription.pricing.period) * 1000)), gd.E0().p0().format(new Date((starsSubscription.until_date - starsSubscription.pricing.period) * 1000))), null, null);
                    currentTime = ConnectionsManager.getInstance(i18).getCurrentTime();
                    cy0Var.e(gd.M0((!starsSubscription.canceled || starsSubscription.bot_canceled) ? 2131744734 : currentTime > ((long) starsSubscription.until_date) ? 2131744735 : 2131744733, null), gd.a0(null, null, 2131742525, gd.E0().s0().format(new Date(starsSubscription.until_date * 1000)), gd.E0().p0().format(new Date(starsSubscription.until_date * 1000))), null, null);
                    f10.addView(cy0Var, c8.ma.k(0.0f, 17.0f, 0.0f, 0.0f, -1, -2));
                    k80 k80Var2 = new k80(parentActivity, resourceProvider);
                    int i19 = org.telegram.ui.ActionBar.n6.z6;
                    org.telegram.ui.ActionBar.u6.U(k80Var2, i19, resourceProvider);
                    org.telegram.ui.ActionBar.u6.G(k80Var2, i17, resourceProvider);
                    k80Var2.setTextSize(1, 14.0f);
                    final int i20 = 0;
                    k80Var2.setText(org.telegram.messenger.g0.T2(gd.M0(2131744691, null), new Runnable() { // from class: di.w9
                        @Override // java.lang.Runnable
                        public final void run() {
                            Object obj;
                            int i21 = i20;
                            Activity activity = parentActivity;
                            switch (i21) {
                                case 0:
                                    vf.c.t(activity, gd.M0(2131744731, null));
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
                    k80Var2.setGravity(17);
                    f10.addView(k80Var2, c8.ma.k(14.0f, 15.0f, 14.0f, 7.0f, -1, -2));
                    if (currentTime < starsSubscription.until_date) {
                        i13 = i18;
                        k80 k80Var3 = new k80(parentActivity, resourceProvider);
                        org.telegram.ui.ActionBar.u6.U(k80Var3, i19, resourceProvider);
                        org.telegram.ui.ActionBar.u6.G(k80Var3, i17, resourceProvider);
                        k80Var3.setTextSize(1, 14.0f);
                        k80Var3.setText(gd.a0(null, null, 2131744750, gd.u(starsSubscription.until_date, false)));
                        k80Var3.setSingleLine(false);
                        k80Var3.setMaxLines(4);
                        k80Var3.setGravity(17);
                        f10.addView(k80Var3, c8.ma.k(26.0f, 7.0f, 26.0f, 15.0f, -1, -2));
                        if (starsSubscription.chat_invite_hash != null || starsSubscription.invoice_slug != null) {
                            hi.d dVar = new hi.d(parentActivity, resourceProvider, true);
                            dVar.setRoundRadius(24);
                            r52 = 0;
                            dVar.i(gd.M0(2131744776, null), false, true);
                            f10.addView(dVar, c8.ma.o(-1, 48));
                            dVar.setOnClickListener(new aa(dVar, starsSubscription, i13, x2VarArr3, resourceProvider, zArr, parentActivity));
                            j3.O = f10;
                            x2VarArr3[r52] = j3;
                            j3.U0 = r52;
                            j3.setOnDismissListener(new ba(i13, oaVar));
                            x2VarArr3[r52].O();
                            T = LaunchActivity.T();
                            if (!org.telegram.messenger.g0.Q1() && !org.telegram.messenger.g0.u1(T)) {
                                x2VarArr3[r52].a0(T);
                            }
                            x2VarArr3[r52].show();
                        }
                    } else if (starsSubscription.can_refulfill) {
                        k80 k80Var4 = new k80(parentActivity, resourceProvider);
                        org.telegram.ui.ActionBar.u6.U(k80Var4, i19, resourceProvider);
                        org.telegram.ui.ActionBar.u6.G(k80Var4, i17, resourceProvider);
                        k80Var4.setTextSize(1, 14.0f);
                        k80Var4.setText(gd.a0(null, null, z12 ? 2131744771 : 2131744746, gd.u(starsSubscription.until_date, false)));
                        k80Var4.setSingleLine(false);
                        k80Var4.setMaxLines(4);
                        k80Var4.setGravity(17);
                        f10.addView(k80Var4, c8.ma.k(26.0f, 7.0f, 26.0f, 15.0f, -1, -2));
                        hi.d dVar2 = new hi.d(parentActivity, resourceProvider, true);
                        dVar2.i(gd.M0(z12 ? 2131744772 : 2131744747, null), false, true);
                        f10.addView(dVar2, c8.ma.o(-1, 48));
                        i13 = i18;
                        dVar2.setOnClickListener(new x9(dVar2, i18, starsSubscription, x2VarArr3, o4, parentActivity, resourceProvider, z11, str4));
                    } else {
                        final boolean z17 = z11;
                        i13 = i18;
                        if (starsSubscription.bot_canceled) {
                            k80 k80Var5 = new k80(parentActivity, resourceProvider);
                            org.telegram.ui.ActionBar.u6.U(k80Var5, org.telegram.ui.ActionBar.n6.nk, resourceProvider);
                            org.telegram.ui.ActionBar.u6.G(k80Var5, i17, resourceProvider);
                            k80Var5.setTextSize(1, 14.0f);
                            k80Var5.setText(gd.M0(z17 ? 2131744769 : 2131744774, null));
                            k80Var5.setSingleLine(false);
                            k80Var5.setMaxLines(4);
                            k80Var5.setGravity(17);
                            f10.addView(k80Var5, c8.ma.k(26.0f, 7.0f, 26.0f, 15.0f, -1, -2));
                        } else if (starsSubscription.canceled) {
                            k80 k80Var6 = new k80(parentActivity, resourceProvider);
                            org.telegram.ui.ActionBar.u6.U(k80Var6, org.telegram.ui.ActionBar.n6.nk, resourceProvider);
                            org.telegram.ui.ActionBar.u6.G(k80Var6, i17, resourceProvider);
                            k80Var6.setTextSize(1, 14.0f);
                            k80Var6.setText(gd.M0(2131744763, null));
                            k80Var6.setSingleLine(false);
                            k80Var6.setMaxLines(4);
                            k80Var6.setGravity(17);
                            f10.addView(k80Var6, c8.ma.k(26.0f, 7.0f, 26.0f, 15.0f, -1, -2));
                            if (starsSubscription.chat_invite_hash != null || starsSubscription.invoice_slug != null) {
                                hi.d dVar3 = new hi.d(parentActivity, resourceProvider, true);
                                dVar3.i(gd.M0(2131744745, null), false, true);
                                f10.addView(dVar3, c8.ma.o(-1, 48));
                                dVar3.setOnClickListener(new y9(dVar3, starsSubscription, i13, x2VarArr3, chat2, str4));
                            }
                        } else {
                            final TLRPC.Chat chat3 = chat2;
                            k80 k80Var7 = new k80(parentActivity, resourceProvider);
                            org.telegram.ui.ActionBar.u6.U(k80Var7, i19, resourceProvider);
                            org.telegram.ui.ActionBar.u6.G(k80Var7, i17, resourceProvider);
                            k80Var7.setTextSize(1, 14.0f);
                            k80Var7.setText(gd.a0(null, null, 2131744766, gd.u(starsSubscription.until_date, false)));
                            k80Var7.setSingleLine(false);
                            k80Var7.setMaxLines(4);
                            k80Var7.setGravity(17);
                            f10.addView(k80Var7, c8.ma.k(26.0f, 7.0f, 26.0f, 15.0f, -1, -2));
                            final hi.d dVar4 = new hi.d(parentActivity, resourceProvider, false);
                            dVar4.i(gd.M0(2131744767, null), false, true);
                            dVar4.setTextColorKey(org.telegram.ui.ActionBar.n6.nk);
                            f10.addView(dVar4, c8.ma.o(-1, 48));
                            dVar4.setOnClickListener(new View.OnClickListener() { // from class: di.z9
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
                                    final int i21 = i13;
                                    ConnectionsManager connectionsManager = ConnectionsManager.getInstance(i21);
                                    final TLObject tLObject = chat3;
                                    final boolean z18 = z17;
                                    final boolean z19 = z12;
                                    final org.telegram.ui.ActionBar.x2[] x2VarArr4 = x2VarArr3;
                                    connectionsManager.sendRequest(tL_changeStarsSubscription, new RequestDelegate() { // from class: di.ha
                                        @Override // org.telegram.tgnet.RequestDelegate
                                        public final void run(TLObject tLObject2, TLRPC.TL_error tL_error) {
                                            org.telegram.messenger.g0.g3(new ia(i21, dVar5, tLObject, starsSubscription2, z18, z19, x2VarArr4));
                                        }
                                    });
                                }
                            });
                        }
                    }
                    r52 = 0;
                    j3.O = f10;
                    x2VarArr3[r52] = j3;
                    j3.U0 = r52;
                    j3.setOnDismissListener(new ba(i13, oaVar));
                    x2VarArr3[r52].O();
                    T = LaunchActivity.T();
                    if (!org.telegram.messenger.g0.Q1()) {
                        x2VarArr3[r52].a0(T);
                    }
                    x2VarArr3[r52].show();
                }
                TLRPC.User c24 = mp.u1(i16).c2(Long.valueOf(o4));
                b9Var.r(c24);
                q9Var.f(c24, b9Var);
            }
            i10 = i16;
            x2VarArr = x2VarArr2;
            frameLayout.addView(q9Var, c8.ma.e(100, 100, 17));
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
            f10.addView(textView3, c8.ma.t(-1, -2, 17, 20, 0, 20, 4));
            TextView textView22 = new TextView(parentActivity);
            textView22.setTextSize(1, 14.0f);
            textView22.setGravity(17);
            org.telegram.ui.ActionBar.u6.U(textView22, org.telegram.ui.ActionBar.n6.B6, resourceProvider);
            TL_stars.TL_starsSubscriptionPricing tL_starsSubscriptionPricing2 = starsSubscription.pricing;
            i11 = tL_starsSubscriptionPricing2.period;
            if (i11 != 2592000) {
            }
            f10.addView(textView22, c8.ma.t(-1, -2, 17, 20, 0, 20, 4));
            ?? cy0Var2 = new cy0(parentActivity, resourceProvider);
            k80 k80Var8 = new k80(parentActivity, resourceProvider);
            k80Var8.setPadding(org.telegram.messenger.g0.L(12.66f), org.telegram.messenger.g0.L(9.33f), org.telegram.messenger.g0.L(12.66f), org.telegram.messenger.g0.L(9.33f));
            k80Var8.setEllipsize(TextUtils.TruncateAt.END);
            int i172 = org.telegram.ui.ActionBar.n6.Xc;
            org.telegram.ui.ActionBar.u6.U(k80Var8, i172, resourceProvider);
            org.telegram.ui.ActionBar.u6.G(k80Var8, i172, resourceProvider);
            k80Var8.setTextSize(1, 14.0f);
            k80Var8.setSingleLine(true);
            k80Var8.setDisablePaddingsOffsetY(true);
            org.telegram.ui.f5 f5Var22 = new org.telegram.ui.f5(24.0f, i12, k80Var8);
            if (o4 < 0) {
            }
            z14 = z13;
            int i182 = i12;
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder("x  " + ((Object) str2));
            spannableStringBuilder2.setSpan(f5Var, 0, 1, 33);
            final org.telegram.ui.ActionBar.x2[] x2VarArr32 = x2VarArr;
            spannableStringBuilder2.setSpan(new pa(x2VarArr32, o4), 3, spannableStringBuilder2.length(), 33);
            k80Var8.setText(spannableStringBuilder2);
            if (!z14) {
            }
            if (o4 >= 0) {
            }
            str3 = null;
            cy0Var2.e(gd.M0(2131744741, str3), gd.a0(null, null, 2131742525, gd.E0().s0().format(new Date((starsSubscription.until_date - starsSubscription.pricing.period) * 1000)), gd.E0().p0().format(new Date((starsSubscription.until_date - starsSubscription.pricing.period) * 1000))), null, null);
            currentTime = ConnectionsManager.getInstance(i182).getCurrentTime();
            cy0Var2.e(gd.M0((!starsSubscription.canceled || starsSubscription.bot_canceled) ? 2131744734 : currentTime > ((long) starsSubscription.until_date) ? 2131744735 : 2131744733, null), gd.a0(null, null, 2131742525, gd.E0().s0().format(new Date(starsSubscription.until_date * 1000)), gd.E0().p0().format(new Date(starsSubscription.until_date * 1000))), null, null);
            f10.addView(cy0Var2, c8.ma.k(0.0f, 17.0f, 0.0f, 0.0f, -1, -2));
            k80 k80Var22 = new k80(parentActivity, resourceProvider);
            int i192 = org.telegram.ui.ActionBar.n6.z6;
            org.telegram.ui.ActionBar.u6.U(k80Var22, i192, resourceProvider);
            org.telegram.ui.ActionBar.u6.G(k80Var22, i172, resourceProvider);
            k80Var22.setTextSize(1, 14.0f);
            final int i202 = 0;
            k80Var22.setText(org.telegram.messenger.g0.T2(gd.M0(2131744691, null), new Runnable() { // from class: di.w9
                @Override // java.lang.Runnable
                public final void run() {
                    Object obj;
                    int i21 = i202;
                    Activity activity = parentActivity;
                    switch (i21) {
                        case 0:
                            vf.c.t(activity, gd.M0(2131744731, null));
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
            k80Var22.setGravity(17);
            f10.addView(k80Var22, c8.ma.k(14.0f, 15.0f, 14.0f, 7.0f, -1, -2));
            if (currentTime < starsSubscription.until_date) {
            }
            r52 = 0;
            j3.O = f10;
            x2VarArr32[r52] = j3;
            j3.U0 = r52;
            j3.setOnDismissListener(new ba(i13, oaVar));
            x2VarArr32[r52].O();
            T = LaunchActivity.T();
            if (!org.telegram.messenger.g0.Q1()) {
            }
            x2VarArr32[r52].show();
        }
    }

    public static void D0(pb pbVar, l41 l41Var, Boolean bool, String str) {
        if (pbVar.getParentActivity() == null) {
            return;
        }
        if (bool.booleanValue()) {
            org.telegram.ui.Components.lc.b0(pbVar).I(R.raw.stars_topup, gd.M0(2131744924, null), org.telegram.messenger.g0.W2(gd.G((int) l41Var.C, "StarsAcquiredInfo", new Object[0]))).j();
            pbVar.i0.c(true);
            x8.y(pbVar.currentAccount, false).R(true);
        } else if (str != null) {
            org.telegram.ui.Components.lc.b0(pbVar).Q(R.raw.error, 36, gd.a0(null, null, 2131743641, str)).j();
        }
    }

    public static void H0(cy0 cy0Var, int i7, TL_stars.StarGift starGift, org.telegram.ui.ActionBar.i6 i6Var) {
        CharSequence charSequence;
        TextView textView = (TextView) ((zx0) cy0Var.e(gd.M0(2131750284, null), "", null, null).getChildAt(1)).getChildAt(0);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("x ");
        p80 p80Var = new p80(textView, org.telegram.messenger.g0.L(90.0f), 0, i6Var);
        p80Var.a(org.telegram.ui.ActionBar.n6.r1(0.21f, textView.getPaint().getColor()), org.telegram.ui.ActionBar.n6.r1(0.08f, textView.getPaint().getColor()));
        spannableStringBuilder.setSpan(p80Var, 0, 1, 33);
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
        final x8 y10 = x8.y(i7, false);
        final long j3 = starGift.id;
        final ai.g0 g0Var = new ai.g0(textView, 14);
        final boolean[] zArr = {false};
        final fs[] fsVarArr = new fs[1];
        fsVarArr[0] = new fs() { // from class: di.g8
            @Override // org.telegram.messenger.fs
            public final void didReceivedNotification(int i11, int i12, Object[] objArr) {
                int i13;
                x8 x8Var;
                TL_stars.StarGift J;
                boolean[] zArr2 = zArr;
                if (zArr2[0] || i11 != (i13 = ks.H3) || (J = (x8Var = x8.this).J(j3)) == null) {
                    return;
                }
                zArr2[0] = true;
                ks.f(x8Var.a).n(fsVarArr[0], i13);
                g0Var.a(J);
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
            g0Var.a(J);
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
        spannableStringBuilder.append((CharSequence) " ").append((CharSequence) gd.M0(2131744849, null));
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
    
        r6 = 2131744716;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static String Q0(int i7, boolean z10, TL_stars.StarsTransaction starsTransaction) {
        if (starsTransaction.stargift_drop_original_details) {
            return gd.M0(2131744697, null);
        }
        if (starsTransaction.posts_search) {
            return gd.M0(2131744701, null);
        }
        if (starsTransaction.premium_gift) {
            return gd.M0(2131744700, null);
        }
        if (starsTransaction.phonegroup_message) {
            return gd.M0(starsTransaction.reaction ? 2131744709 : 2131744710, null);
        }
        if (starsTransaction.paid_message) {
            return gd.H(',', "StarsTransactionMessageFee", starsTransaction.paid_messages);
        }
        if (starsTransaction.floodskip) {
            return gd.M0(2131744724, null);
        }
        if (!starsTransaction.extended_media.isEmpty()) {
            return gd.M0(2131744969, null);
        }
        TL_stars.StarsAmount starsAmount = starsTransaction.amount;
        int i10 = starsTransaction.flags;
        if ((131072 & i10) == 0 && (65536 & i10) != 0) {
            return gd.a0(null, null, 2131744926, ki.k.J0(starsTransaction.starref_commission_permille));
        }
        if (starsTransaction.stargift != null) {
            if (starsTransaction.stargift_prepaid_upgrade) {
                return gd.M0(2131749914, null);
            }
            if (starsTransaction.refund) {
                return gd.M0(starsTransaction.stargift_auction_bid ? 2131749913 : starsAmount.amount > 0 ? starsTransaction.stargift_upgrade ? 2131749910 : 2131749911 : 2131749912, null);
            }
            return gd.M0(starsTransaction.stargift_auction_bid ? 2131749916 : starsAmount.amount > 0 ? 2131749915 : starsTransaction.stargift_upgrade ? 2131749907 : 2131749908, null);
        }
        if (starsTransaction.subscription) {
            int i11 = starsTransaction.subscription_period;
            if (i11 == 2592000) {
                return gd.M0(2131744928, null);
            }
            if (i11 == 300) {
                return "5-minute subscription fee";
            }
            if (i11 == 60) {
                return "Minute subscription fee";
            }
        }
        if ((i10 & TLObject.FLAG_13) != 0) {
            return gd.M0(2131744858, null);
        }
        if (starsTransaction.gift) {
            if (starsTransaction.sent_by != null) {
                return gd.M0(o10.C(mp.u1(i7).c2(Long.valueOf(org.telegram.messenger.n5.o(starsTransaction.sent_by)))) ? 2131744866 : 2131744867, null);
            }
            return gd.M0(2131744867, null);
        }
        String str = starsTransaction.title;
        if (str != null) {
            return str;
        }
        long o4 = org.telegram.messenger.n5.o(starsTransaction.peer.peer);
        if (o4 != 0) {
            if (o4 >= 0) {
                return o10.q(mp.u1(j10.t0).c2(Long.valueOf(o4)));
            }
            TLRPC.Chat O0 = mp.u1(j10.t0).O0(Long.valueOf(-o4));
            return O0 == null ? "" : O0.title;
        }
        TL_stars.StarsTransactionPeer starsTransactionPeer = starsTransaction.peer;
        if (!(starsTransactionPeer instanceof TL_stars.TL_starsTransactionPeerFragment)) {
            return starsTransactionPeer instanceof TL_stars.TL_starsTransactionPeerPremiumBot ? gd.M0(2131744726, null) : starsTransactionPeer instanceof TL_stars.TL_starsTransactionPeerAds ? gd.M0(2131744727, null) : gd.M0(2131744688, null);
        }
        if (!z10) {
            if (starsTransaction.refund) {
            }
            return gd.M0(r6, null);
        }
        int i12 = 2131744686;
        return gd.M0(i12, null);
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
        lq lqVar = new lq(R.drawable.diamond, 0);
        lqVar.d = false;
        lqVar.r = 0.0f;
        lqVar.s = f11;
        lqVar.H = f12;
        lqVar.I = f10;
        lqVar.J = f10;
        spannableString.setSpan(lqVar, 0, spannableString.length() - 1, 33);
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

    public static SpannableStringBuilder U0(CharSequence charSequence, float f10, lq[] lqVarArr) {
        return Y0(false, charSequence, f10, lqVarArr, 0.0f, 1.0f);
    }

    public static SpannableStringBuilder V0(CharSequence charSequence, boolean z10) {
        return X0(z10, charSequence, 1.13f, null);
    }

    public static SpannableStringBuilder W0(TL_stars.StarsAmount starsAmount, CharSequence charSequence) {
        return X0(starsAmount instanceof TL_stars.TL_starsTonAmount, charSequence, 1.25f, null);
    }

    public static SpannableStringBuilder X0(boolean z10, CharSequence charSequence, float f10, lq[] lqVarArr) {
        return Y0(z10, charSequence, f10, lqVarArr, 0.0f, 1.0f);
    }

    public static SpannableStringBuilder Y0(boolean z10, CharSequence charSequence, float f10, lq[] lqVarArr, float f11, float f12) {
        lq lqVar;
        if (charSequence == null) {
            return null;
        }
        SpannableStringBuilder spannableStringBuilder = !(charSequence instanceof SpannableStringBuilder) ? new SpannableStringBuilder(charSequence) : (SpannableStringBuilder) charSequence;
        SpannableString spannableString = new SpannableString((z10 ? "TON" : "⭐").concat(" "));
        if (lqVarArr == null || (lqVar = lqVarArr[0]) == null) {
            lqVar = new lq(z10 ? R.drawable.mini_gram_72 : R.drawable.msg_premium_liststar, 0);
            if (lqVarArr != null) {
                lqVarArr[0] = lqVar;
            }
        }
        lqVar.r = 0.0f;
        lqVar.s = f11;
        lqVar.H = f12;
        if (z10) {
            lqVar.d = false;
            float f13 = f10 * 0.2f;
            lqVar.I = f13;
            lqVar.J = f13;
        } else {
            lqVar.I = f10;
            lqVar.J = f10;
        }
        spannableString.setSpan(lqVar, 0, spannableString.length() - 1, 33);
        org.telegram.messenger.g0.M2(spannableStringBuilder, "⭐", "⭐️");
        org.telegram.messenger.g0.M2(spannableStringBuilder, "⭐", "⭐ ");
        org.telegram.messenger.g0.M2(spannableStringBuilder, spannableString, "⭐");
        org.telegram.messenger.g0.M2(spannableStringBuilder, "XTR", "XTR ");
        org.telegram.messenger.g0.M2(spannableStringBuilder, spannableString, "XTR");
        return spannableStringBuilder;
    }

    public static SpannableStringBuilder Z0(boolean z10, String str, lq[] lqVarArr) {
        lq lqVar;
        if (str == null) {
            return null;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str);
        if (lqVarArr == null || (lqVar = lqVarArr[0]) == null) {
            lqVar = new lq(z10 ? R.drawable.mini_gram_72 : R.drawable.msg_premium_liststar, 0);
            float f10 = z10 ? 0.222f : 1.13f;
            float f11 = z10 ? 0.222f : 1.13f;
            lqVar.I = f10;
            lqVar.J = f11;
        }
        if (z10) {
            lqVar.d = false;
        }
        if (lqVarArr != null) {
            lqVarArr[0] = lqVar;
        }
        SpannableString spannableString = new SpannableString("⭐ ");
        spannableString.setSpan(lqVar, 0, spannableString.length() - 1, 33);
        org.telegram.messenger.g0.M2(spannableStringBuilder, "⭐", "⭐️");
        org.telegram.messenger.g0.M2(spannableStringBuilder, "⭐", "⭐ ");
        org.telegram.messenger.g0.M2(spannableStringBuilder, spannableString, "⭐");
        org.telegram.messenger.g0.M2(spannableStringBuilder, "XTR", "XTR ");
        org.telegram.messenger.g0.M2(spannableStringBuilder, spannableString, "XTR");
        return spannableStringBuilder;
    }

    public static SpannableStringBuilder a1(TL_stars.StarsAmount starsAmount, String str, lq[] lqVarArr) {
        return b1(starsAmount instanceof TL_stars.TL_starsTonAmount, str, 0.8f, lqVarArr);
    }

    public static SpannableStringBuilder b1(boolean z10, CharSequence charSequence, float f10, lq[] lqVarArr) {
        lq lqVar;
        if (charSequence == null) {
            return null;
        }
        SpannableStringBuilder spannableStringBuilder = !(charSequence instanceof SpannableStringBuilder) ? new SpannableStringBuilder(charSequence) : (SpannableStringBuilder) charSequence;
        String str = z10 ? "TON" : "⭐";
        int i7 = z10 ? R.drawable.mini_gram_72 : R.drawable.star_small_inner;
        SpannableString spannableString = new SpannableString(str.concat(" "));
        if (lqVarArr == null || (lqVar = lqVarArr[0]) == null) {
            if (lqVarArr == null || lqVarArr.length <= 0) {
                lqVar = new lq(i7, 0);
            } else {
                lqVar = new lq(i7, 0);
                lqVarArr[0] = lqVar;
            }
        }
        lqVar.d = false;
        if (z10) {
            f10 *= 0.33f;
        }
        lqVar.I = f10;
        lqVar.J = f10;
        spannableString.setSpan(lqVar, 0, spannableString.length() - 1, 33);
        org.telegram.messenger.g0.M2(spannableStringBuilder, "⭐", "⭐️");
        org.telegram.messenger.g0.M2(spannableStringBuilder, "⭐", "⭐ ");
        org.telegram.messenger.g0.M2(spannableStringBuilder, spannableString, "⭐");
        org.telegram.messenger.g0.M2(spannableStringBuilder, "XTR", "XTR ");
        org.telegram.messenger.g0.M2(spannableStringBuilder, spannableString, "XTR");
        return spannableStringBuilder;
    }

    public static ea c1(View view, ImageReceiver imageReceiver, String str, boolean z10) {
        int i7 = imageReceiver.d;
        final ca caVar = new ca(z10, i7, str, imageReceiver, new boolean[1]);
        caVar.run();
        final int i10 = 0;
        Runnable h = ks.f(i7).h(view, z10 ? ks.Z2 : ks.Y2, new x10() { // from class: di.da
            @Override // org.telegram.messenger.x10
            public final void a(Object obj) {
                switch (i10) {
                    case 0:
                        caVar.run();
                        break;
                    default:
                        caVar.run();
                        break;
                }
            }
        });
        final int i11 = 1;
        return new ea(h, ks.f(i7).h(view, ks.y0, new x10() { // from class: di.da
            @Override // org.telegram.messenger.x10
            public final void a(Object obj) {
                switch (i11) {
                    case 0:
                        caVar.run();
                        break;
                    default:
                        caVar.run();
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
        imageReceiver.r0(org.telegram.messenger.fc.b(document), com.google.android.gms.internal.vision.e2.j(i7, "_", i7), org.telegram.messenger.fc.c(w10, document), com.google.android.gms.internal.vision.e2.j(i7, "_", i7), org.telegram.messenger.u5.d(document.thumbs, org.telegram.ui.ActionBar.n6.a7, 0.35f, false), 0L, null, null, 0);
    }

    public static void e1(ImageReceiver imageReceiver, TL_stars.StarGift starGift, int i7) {
        d1(imageReceiver, starGift == null ? null : starGift.getDocument(), i7);
    }

    public static void f1(org.telegram.ui.Components.q9 q9Var, ImageReceiver imageReceiver, long j3) {
        c1(q9Var, imageReceiver, j3 <= 1000 ? "2⃣" : j3 < 2500 ? "3⃣" : "4⃣", false);
    }

    public static ea g1(org.telegram.ui.Components.q9 q9Var, ImageReceiver imageReceiver, int i7) {
        return c1(q9Var, imageReceiver, i7 != 3 ? i7 != 6 ? i7 != 12 ? i7 != 24 ? "1⃣" : "5⃣" : "4⃣" : "3⃣" : "2⃣", false);
    }

    public static void h1(org.telegram.ui.Components.q9 q9Var, ImageReceiver imageReceiver, long j3) {
        c1(q9Var, imageReceiver, j3 <= 10000000000L ? "2⃣" : j3 <= 50000000000L ? "1⃣" : "3⃣", true);
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
        org.telegram.ui.ActionBar.x2 j10 = org.telegram.messenger.f3.j(1, context, i6Var, false);
        ?? g10 = org.telegram.messenger.f3.g(context, 1);
        g10.setPadding(0, org.telegram.messenger.g0.L(20.0f), 0, org.telegram.messenger.g0.L(4.0f));
        g10.setClipChildren(false);
        g10.setClipToPadding(false);
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setClipChildren(false);
        frameLayout.setClipToPadding(false);
        g10.addView(frameLayout, c8.ma.t(-1, ks.g2, 7, 0, 0, 0, 10));
        ua uaVar = new ua(context, 70, 0, 0);
        frameLayout.addView(uaVar, c8.ma.c(-1.0f, -1));
        vg.m mVar = new vg.m(context, 1, 2);
        vg.f fVar = mVar.b;
        fVar.z = org.telegram.ui.ActionBar.n6.Wk;
        fVar.A = org.telegram.ui.ActionBar.n6.Xk;
        fVar.b();
        mVar.setStarParticlesView(uaVar);
        frameLayout.addView(mVar, c8.ma.d(ks.A2, 170.0f, 17, 0.0f, 32.0f, 0.0f, 24.0f));
        mVar.setPaused(false);
        TextView textView = new TextView(context);
        org.telegram.messenger.f3.l(textView, org.telegram.ui.ActionBar.n6.j5, i6Var, 1, 20.0f);
        textView.setGravity(17);
        org.telegram.ui.ActionBar.x2[] x2VarArr = new org.telegram.ui.ActionBar.x2[1];
        textView.setText(gd.H(' ', "BoostStars", (int) boost.stars));
        ?? f10 = n10.f(g10, textView, c8.ma.t(-1, -2, 17, 20, 0, 20, 4), context);
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
        lq lqVar = new lq(R.drawable.mini_boost_badge, 2);
        float L = org.telegram.messenger.g0.L(0.66f);
        lqVar.r = 0.0f;
        lqVar.s = L;
        spannableStringBuilder.setSpan(lqVar, 0, 1, 33);
        f10.setText(spannableStringBuilder);
        g10.addView(f10, c8.ma.t(-2, 20, 17, 20, 4, 20, 4));
        cy0 cy0Var = new cy0(context, i6Var);
        cy0Var.n(gd.M0(2131753625, null), i7, j3, new h9(x2VarArr, j3, 6));
        cy0Var.e(gd.M0(2131753624, null), gd.G((int) boost.stars, "BoostStars", new Object[0]), null, null);
        if (boost.giveaway_msg_id != 0) {
            String M0 = gd.M0(2131753613, null);
            String M02 = gd.M0(2131753612, null);
            z10 = 0;
            bi.m2 m2Var = new bi.m2(x2VarArr, j3, boost, 4);
            x2VarArr = x2VarArr;
            cy0Var.i(M0, M02, m2Var);
        } else {
            z10 = 0;
        }
        String M03 = gd.M0(2131753660, null);
        String format = gd.E0().s0().format(new Date(boost.date * 1000));
        String format2 = gd.E0().p0().format(new Date(boost.date * 1000));
        Object[] objArr = new Object[2];
        objArr[z10] = format;
        objArr[1] = format2;
        cy0Var.e(M03, gd.a0(null, null, 2131742525, objArr), null, null);
        String M04 = gd.M0(2131753605, null);
        String format3 = gd.E0().s0().format(new Date(boost.expires * 1000));
        String format4 = gd.E0().p0().format(new Date(boost.expires * 1000));
        Object[] objArr2 = new Object[2];
        objArr2[z10] = format3;
        objArr2[1] = format4;
        cy0Var.e(M04, gd.a0(null, null, 2131742525, objArr2), null, null);
        g10.addView(cy0Var, c8.ma.k(16.0f, 17.0f, 16.0f, 0.0f, -1, -2));
        k80 k80Var = new k80(context, i6Var);
        org.telegram.ui.ActionBar.u6.U(k80Var, org.telegram.ui.ActionBar.n6.z6, i6Var);
        org.telegram.ui.ActionBar.u6.G(k80Var, org.telegram.ui.ActionBar.n6.Xc, i6Var);
        k80Var.setTextSize(1, 14.0f);
        k80Var.setText(org.telegram.messenger.g0.T2(gd.M0(2131744691, null), new ai.a(context, 4)));
        k80Var.setGravity(17);
        g10.addView(k80Var, c8.ma.k(14.0f, 15.0f, 14.0f, 7.0f, -1, -2));
        hi.d dVar = new hi.d(context, i6Var, true);
        dVar.i(gd.M0(2131747638, null), z10, true);
        dVar.setOnClickListener(new ai.q2(x2VarArr, 2));
        g10.addView(dVar, c8.ma.k(16.0f, 8.0f, 16.0f, 0.0f, -1, 48));
        j10.O = g10;
        x2VarArr[0] = j10;
        j10.U0 = false;
        j10.O();
        org.telegram.ui.ActionBar.h2 T = LaunchActivity.T();
        if (!org.telegram.messenger.g0.Q1() && !org.telegram.messenger.g0.u1(T)) {
            x2VarArr[0].a0(T);
        }
        mVar.setPaused(false);
        x2VarArr[0].show();
        x2VarArr[0].n(new ca.r(mVar, 25));
    }

    public static u0 j1(Context context, int i7, TL_stars.TL_starGiftUnique tL_starGiftUnique, q10 q10Var, org.telegram.ui.ActionBar.i6 i6Var) {
        cg.b bVar = cg.b.a;
        u0 u0Var = new u0(context, i6Var, i7, tL_starGiftUnique == null ? cg.a.h(((org.telegram.messenger.j0) mp.u1(i7).A7.p.b).c, bVar) : tL_starGiftUnique.resale_ton_only ? tL_starGiftUnique.getResellAmount(cg.b.b) : tL_starGiftUnique.getResellAmount(bVar), new ai.v1(13, q10Var, r8));
        u0[] u0VarArr = {u0Var};
        u0Var.show();
        return u0VarArr[0];
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void k1(Context context, long j3, boolean z10, final q10 q10Var, org.telegram.ui.ActionBar.i6 i6Var) {
        org.telegram.ui.ActionBar.x2[] x2VarArr;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        org.telegram.ui.ActionBar.x2 j10 = org.telegram.messenger.f3.j(1, context, i6Var, false);
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        linearLayout.setClipChildren(false);
        linearLayout.setClipToPadding(false);
        linearLayout.setPadding(org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(8.0f));
        TextView textView = new TextView(context);
        textView.setTypeface(org.telegram.messenger.g0.o());
        hi.d dVar = null;
        textView.setText(gd.M0(2131747539, null));
        textView.setTextSize(1, 20.0f);
        int i7 = org.telegram.ui.ActionBar.n6.G6;
        org.telegram.ui.ActionBar.u6.U(textView, i7, i6Var);
        linearLayout.addView(textView, c8.ma.k(4.0f, 0.0f, 4.0f, 18.0f, -1, -2));
        final EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(context);
        xb0 xb0Var = new xb0(context, i6Var);
        xb0Var.setForceForceUseCenter(true);
        xb0Var.setText(gd.M0(2131747540, null));
        xb0Var.setLeftPadding(org.telegram.messenger.g0.L(36.0f));
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
        int i10 = 5;
        editTextBoldCursor.setGravity(gd.a0 ? 5 : 3);
        editTextBoldCursor.setOnFocusChangeListener(new q9(xb0Var, editTextBoldCursor, objArr2 == true ? 1 : 0));
        LinearLayout linearLayout2 = new LinearLayout(context);
        linearLayout2.setOrientation(0);
        ImageView imageView = new ImageView(context);
        imageView.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        imageView.setImageResource(R.drawable.star_small_inner);
        linearLayout2.addView(imageView, c8.ma.q(-2, -2, 0.0f, 19, 14, 0, 0, 0));
        linearLayout2.addView(editTextBoldCursor, c8.ma.p(-1, -2, 1.0f, ks.E1));
        xb0Var.e(editTextBoldCursor);
        xb0Var.addView(linearLayout2, c8.ma.e(-1, -2, 48));
        linearLayout.addView(xb0Var, c8.ma.o(-1, -2));
        TextView textView2 = new TextView(context);
        textView2.setTextSize(1, 16.0f);
        org.telegram.ui.ActionBar.u6.U(textView2, org.telegram.ui.ActionBar.n6.A6, null);
        xb0Var.addView(textView2, c8.ma.d(-2, -2.0f, 21, 0.0f, 0.0f, 14.0f, 0.0f));
        k80 k80Var = new k80(context, null);
        k80Var.setText(org.telegram.messenger.g0.H2(org.telegram.messenger.g0.T2(gd.M0(2131747542, null), new ai.a(context, i10)), true));
        k80Var.setTextSize(1, 12.0f);
        org.telegram.ui.ActionBar.u6.U(k80Var, org.telegram.ui.ActionBar.n6.z6, i6Var);
        org.telegram.ui.ActionBar.u6.G(k80Var, org.telegram.ui.ActionBar.n6.Xc, i6Var);
        linearLayout.addView(k80Var, c8.ma.k(14.0f, 3.0f, 14.0f, 24.0f, -1, -2));
        final hi.d g10 = n10.g(24, context, i6Var, true);
        g10.i(gd.M0(j3 > 0 ? 2131747538 : 2131747544, null), false, true);
        linearLayout.addView(g10, c8.ma.o(-1, 48));
        if (j3 > 0 && z10) {
            hi.d g11 = n10.g(24, context, i6Var, false);
            g11.i(gd.M0(2131747543, null), false, false);
            linearLayout.addView(g11, c8.ma.k(0.0f, 4.0f, 0.0f, 0.0f, -1, 48));
            dVar = g11;
        }
        j10.O = linearLayout;
        final org.telegram.ui.ActionBar.x2[] x2VarArr2 = {j10};
        editTextBoldCursor.setText(j3 <= 0 ? "" : Long.toString(j3));
        editTextBoldCursor.addTextChangedListener(new sa(editTextBoldCursor, xb0Var, j3, z10, g10, textView2));
        final boolean[] zArr = {false};
        editTextBoldCursor.setOnEditorActionListener(new TextView.OnEditorActionListener() { // from class: di.r9
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
                q10Var.a(Long.valueOf(Long.parseLong(editTextBoldCursor2.getText().toString())), new v9(editTextBoldCursor2, x2VarArr2, 1));
                return true;
            }
        });
        s9 s9Var = new s9(zArr, q10Var, editTextBoldCursor, g10, x2VarArr2);
        EditTextBoldCursor editTextBoldCursor2 = editTextBoldCursor;
        g10.setOnClickListener(s9Var);
        if (dVar != null) {
            hi.d dVar2 = dVar;
            s9 s9Var2 = new s9(zArr, q10Var, dVar2, editTextBoldCursor2, x2VarArr2);
            editTextBoldCursor2 = editTextBoldCursor2;
            x2VarArr = x2VarArr2;
            dVar2.setOnClickListener(s9Var2);
        } else {
            x2VarArr = x2VarArr2;
        }
        x2VarArr[0].O();
        x2VarArr[0].setOnDismissListener(new t9(editTextBoldCursor2, objArr == true ? 1 : 0));
        x2VarArr[0].show();
        org.telegram.ui.ActionBar.h2 Q = LaunchActivity.Q();
        org.telegram.messenger.g0.h3(new v9(x2VarArr, editTextBoldCursor2), Q instanceof bn ? ((bn) Q).sa() : false ? 200L : 80L);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0fec  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x1031  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x1087  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x10c1  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x10e7  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x10ce  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x1093  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x1075  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0e9c  */
    /* JADX WARN: Removed duplicated region for block: B:238:0x0ac2  */
    /* JADX WARN: Removed duplicated region for block: B:308:0x050b  */
    /* JADX WARN: Removed duplicated region for block: B:311:0x0518  */
    /* JADX WARN: Removed duplicated region for block: B:314:0x054b  */
    /* JADX WARN: Removed duplicated region for block: B:354:0x0553  */
    /* JADX WARN: Removed duplicated region for block: B:360:0x050e  */
    /* JADX WARN: Removed duplicated region for block: B:396:0x0412  */
    /* JADX WARN: Removed duplicated region for block: B:397:0x0425  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x077b  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0daf  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0dbd  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0dce  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0e6b  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0ea2 A[LOOP:0: B:66:0x0e16->B:75:0x0ea2, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0eb2 A[EDGE_INSN: B:76:0x0eb2->B:77:0x0eb2 BREAK  A[LOOP:0: B:66:0x0e16->B:75:0x0ea2], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0f2e A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0f41  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0f44  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0f54  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0fb6  */
    /* JADX WARN: Type inference failed for: r13v21 */
    /* JADX WARN: Type inference failed for: r13v22, types: [boolean] */
    /* JADX WARN: Type inference failed for: r13v23 */
    /* JADX WARN: Type inference failed for: r2v35 */
    /* JADX WARN: Type inference failed for: r2v46 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static org.telegram.ui.ActionBar.x2 l1(final Context context, final boolean z10, final long j3, final int i7, final TL_stars.StarsTransaction starsTransaction, final org.telegram.ui.ActionBar.i6 i6Var) {
        org.telegram.ui.ActionBar.x2 x2Var;
        boolean z11;
        Context context2;
        int i10;
        TL_stars.StarsTransaction starsTransaction2;
        LinearLayout linearLayout;
        String str;
        boolean z12;
        boolean z13;
        long j10;
        org.telegram.ui.ActionBar.i6 i6Var2;
        boolean z14;
        TLRPC.Peer peer;
        long j11;
        org.telegram.messenger.fc fcVar;
        org.telegram.messenger.fc c10;
        int i11;
        final org.telegram.ui.ActionBar.x2[] x2VarArr;
        int i12;
        String L0;
        TL_stars.StarGift starGift;
        org.telegram.ui.ActionBar.i6 i6Var3;
        ViewGroup viewGroup;
        int i13;
        TL_stars.StarsTransaction starsTransaction3;
        Context context3;
        boolean z15;
        cy0 cy0Var;
        cy0 cy0Var2;
        cy0 cy0Var3;
        cy0 cy0Var4;
        cy0 cy0Var5;
        TL_stars.StarsTransactionPeer starsTransactionPeer;
        boolean z16;
        ViewGroup viewGroup2;
        TL_stars.StarGift starGift2;
        Context context4;
        ?? r13;
        org.telegram.ui.ActionBar.h2 T;
        TLRPC.Chat O0;
        org.telegram.messenger.fc fcVar2;
        org.telegram.messenger.fc c11;
        int i14;
        final org.telegram.ui.ActionBar.x2[] x2VarArr2;
        boolean z17;
        cy0 cy0Var6;
        cy0 cy0Var7;
        org.telegram.ui.ActionBar.x2[] x2VarArr3;
        final int i15;
        final org.telegram.ui.ActionBar.x2[] x2VarArr4;
        int i16;
        long j12;
        cy0 cy0Var8;
        long j13;
        TL_stars.StarsAmount starsAmount;
        ViewGroup viewGroup3;
        cy0 cy0Var9;
        if (starsTransaction == null || context == null) {
            return null;
        }
        TL_stars.StarsAmount starsAmount2 = starsTransaction.amount;
        boolean z18 = starsAmount2 instanceof TL_stars.TL_starsTonAmount;
        int i17 = starsTransaction.flags;
        boolean z19 = (i17 & TLObject.FLAG_13) != 0;
        boolean z20 = ((131072 & i17) == 0 || starsTransaction.paid_message) ? false : true;
        boolean z21 = (z20 || (i17 & 65536) == 0 || starsTransaction.paid_message) ? false : true;
        boolean positive = starsAmount2.positive();
        boolean negative = starsTransaction.amount.negative();
        org.telegram.ui.ActionBar.x2 x2Var2 = new org.telegram.ui.ActionBar.x2(context, i6Var, false, false);
        x2Var2.O();
        org.telegram.ui.ActionBar.x2[] x2VarArr5 = new org.telegram.ui.ActionBar.x2[1];
        final LinearLayout g10 = org.telegram.messenger.f3.g(context, 1);
        g10.setPadding(0, org.telegram.messenger.g0.L((z19 || starsTransaction.gift || (starsTransaction.stargift_resale && (starsTransaction.stargift instanceof TL_stars.TL_starGiftUnique))) ? 0.0f : 20.0f), 0, org.telegram.messenger.g0.L(8.0f));
        g10.setClipChildren(false);
        g10.setClipToPadding(false);
        boolean z22 = z19;
        if (starsTransaction.stargift_resale) {
            TL_stars.StarGift starGift3 = starsTransaction.stargift;
            if (starGift3 instanceof TL_stars.TL_starGiftUnique) {
                TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) starGift3;
                TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop = (TL_stars.starGiftAttributeBackdrop) x8.l(tL_starGiftUnique.attributes, TL_stars.starGiftAttributeBackdrop.class);
                TL_stars.starGiftAttributePattern stargiftattributepattern = (TL_stars.starGiftAttributePattern) x8.l(tL_starGiftUnique.attributes, TL_stars.starGiftAttributePattern.class);
                org.telegram.ui.Components.m5 m5Var = new org.telegram.ui.Components.m5(org.telegram.messenger.g0.L(20.0f), null);
                RadialGradient radialGradient = new RadialGradient(0.0f, 0.0f, org.telegram.messenger.g0.L(200.0f), new int[]{stargiftattributebackdrop.center_color | (-16777216), stargiftattributebackdrop.edge_color | (-16777216)}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
                z11 = z20;
                Paint paint = new Paint(1);
                Matrix matrix = new Matrix();
                paint.setShader(radialGradient);
                x2Var = x2Var2;
                ka kaVar = new ka(context, matrix, radialGradient, paint, m5Var);
                m5Var.l(kaVar);
                m5Var.i(stargiftattributepattern.document, false);
                kaVar.setOrientation(1);
                org.telegram.ui.Components.q9 q9Var = new org.telegram.ui.Components.q9(context);
                e1(q9Var.getImageReceiver(), starsTransaction.stargift, ks.q2);
                kaVar.addView(q9Var, c8.ma.t(ks.q2, ks.q2, 17, 0, 20, 0, 0));
                if (!TextUtils.isEmpty(tL_starGiftUnique.slug)) {
                    c8.ra.a(q9Var);
                    q9Var.setOnClickListener(new bi.f5(context, i7, tL_starGiftUnique, 2));
                }
                TextView b10 = c8.va.b(context, 20.0f, 0, true, null);
                b10.setTextColor(-1);
                b10.setText(tL_starGiftUnique.title);
                kaVar.addView(b10, c8.ma.t(-2, -2, 17, 0, 1, 0, 0));
                TextView b11 = c8.va.b(context, 13.0f, 0, false, null);
                b11.setTextColor(stargiftattributebackdrop.text_color | (-16777216));
                b11.setText(gd.I(tL_starGiftUnique.num, "Gift2CollectionNumber"));
                kaVar.addView(b11, c8.ma.t(-2, -2, 17, 0, 5, 0, 0));
                TextView b12 = c8.va.b(context, 18.0f, 0, true, null);
                b12.setTextColor(-1);
                TL_stars.StarsAmount starsAmount3 = starsTransaction.amount;
                b12.setText(W0(starsAmount3, TextUtils.concat(positive ? "+" : "", L0(starsAmount3), " ⭐️")));
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(b12.getText());
                if (starsTransaction.refund) {
                    I0(spannableStringBuilder, b12, gd.L0(2131744795));
                } else if (starsTransaction.failed) {
                    I0(spannableStringBuilder, b12, gd.L0(2131744875));
                } else if (starsTransaction.pending) {
                    I0(spannableStringBuilder, b12, gd.L0(2131744818));
                }
                b12.setText(spannableStringBuilder);
                kaVar.addView(b12, c8.ma.t(-2, -2, 17, 0, 11, 0, 17));
                g10.addView(kaVar, c8.ma.o(-1, -2));
                i6Var2 = i6Var;
                context2 = context;
                starsTransaction2 = starsTransaction;
                linearLayout = g10;
                str = "";
                z12 = z21;
                x2VarArr = x2VarArr5;
                z14 = z18;
                cy0 cy0Var10 = new cy0(context2, i6Var2);
                starGift = starsTransaction2.stargift;
                int i18 = 9;
                if (starGift == null) {
                    TL_stars.StarsTransaction starsTransaction4 = starsTransaction2;
                    i6Var3 = i6Var2;
                    org.telegram.ui.ActionBar.x2[] x2VarArr6 = x2VarArr;
                    boolean z23 = z14;
                    viewGroup = linearLayout;
                    TL_stars.StarsTransactionPeer starsTransactionPeer2 = starsTransaction4.peer;
                    if (starsTransactionPeer2 instanceof TL_stars.TL_starsTransactionPeer) {
                        final long o4 = org.telegram.messenger.n5.o(starsTransactionPeer2.peer);
                        if (starsTransaction4.paid_message) {
                            cy0Var10.n(gd.L0(positive ? 2131750177 : 2131749920), i7, o4, new h9(x2VarArr6, o4, 0));
                            if (starsTransaction4.starref_amount != null && starsTransaction4.starref_commission_permille > 0) {
                                cy0Var10.f(b1(starsTransaction4.amount instanceof TL_stars.TL_starsTonAmount, i5.c.l(Math.abs(Math.round(starsTransaction4.starref_amount.toDouble() + starsTransaction4.amount.toDouble())), ',', new StringBuilder("⭐️ ")), 0.8f, null), gd.L0(2131744715));
                            }
                            cy0Var4 = cy0Var10;
                            x2VarArr = x2VarArr6;
                            i13 = i7;
                        } else if (z11) {
                            long o10 = org.telegram.messenger.n5.o(starsTransaction4.starref_peer);
                            cy0Var10.i(gd.L0(2131744995), gd.L0(2131744994), new h9(x2VarArr6, j3, 1));
                            cy0Var10.n(gd.L0(2131744998), i7, o10, new h9(x2VarArr6, o10, 2));
                            cy0Var10.n(gd.L0(2131744993), i7, o4, new h9(x2VarArr6, o4, 3));
                            cy0Var10.f(ki.k.J0(starsTransaction4.starref_commission_permille), gd.L0(2131744997));
                            i13 = i7;
                            cy0Var4 = cy0Var10;
                            x2VarArr = x2VarArr6;
                        } else {
                            if (z12) {
                                x2VarArr = x2VarArr6;
                                cy0Var10.i(gd.L0(2131744995), gd.L0(2131744994), new i9(i7, context, j3, o4, x2VarArr, i6Var3));
                                cy0Var10.n(gd.L0(2131744996), i7, o4, new h9(x2VarArr, o4, 4));
                                context3 = context;
                                starsTransaction3 = starsTransaction;
                                cy0Var2 = cy0Var10;
                            } else {
                                x2VarArr = x2VarArr6;
                                if (z22) {
                                    cy0Var10.n(gd.L0(2131744973), i7, o4, new g9(x2VarArr, starsTransaction, o4, 1));
                                    final int i19 = 2;
                                    cy0Var10.n(gd.L0(2131744972), i7, j10.i(i7).e(), new Runnable() { // from class: di.f9
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            switch (i19) {
                                                case 0:
                                                    x2VarArr[0].dismiss();
                                                    org.telegram.ui.ActionBar.h2 T2 = LaunchActivity.T();
                                                    if (T2 != null) {
                                                        Bundle bundle = new Bundle();
                                                        bundle.putLong("user_id", j10.i(i7).e());
                                                        bundle.putBoolean("my_profile", true);
                                                        bundle.putBoolean("open_gifts", true);
                                                        T2.presentFragment(new ProfileActivity(bundle, null));
                                                        break;
                                                    }
                                                    break;
                                                case 1:
                                                    x2VarArr[0].dismiss();
                                                    org.telegram.ui.ActionBar.h2 T3 = LaunchActivity.T();
                                                    if (T3 != null) {
                                                        Bundle bundle2 = new Bundle();
                                                        bundle2.putLong("user_id", j10.i(i7).e());
                                                        bundle2.putBoolean("my_profile", true);
                                                        bundle2.putBoolean("open_gifts", true);
                                                        T3.presentFragment(new ProfileActivity(bundle2, null));
                                                        break;
                                                    }
                                                    break;
                                                default:
                                                    x2VarArr[0].dismiss();
                                                    org.telegram.ui.ActionBar.h2 T4 = LaunchActivity.T();
                                                    if (T4 != null) {
                                                        Bundle bundle3 = new Bundle();
                                                        bundle3.putLong("user_id", j10.i(i7).e());
                                                        bundle3.putBoolean("my_profile", true);
                                                        T4.presentFragment(new ProfileActivity(bundle3, null));
                                                        break;
                                                    }
                                                    break;
                                            }
                                        }
                                    });
                                    starsTransaction3 = starsTransaction;
                                    cy0Var10.i(gd.L0(2131744971), gd.L0(2131744970), new g9(x2VarArr, starsTransaction, o4, 2));
                                    cy0Var10.f(O0(starsTransaction3.amount), gd.L0(2131744974));
                                    i13 = i7;
                                    cy0Var3 = cy0Var10;
                                    context3 = context;
                                    cy0Var = cy0Var3;
                                    z15 = z23;
                                    cy0Var5 = cy0Var;
                                } else {
                                    starsTransaction3 = starsTransaction;
                                    if (!starsTransaction3.subscription || z10) {
                                        if (starsTransaction3.premium_gift) {
                                            final int i20 = 1;
                                            cy0Var10.n(gd.L0(2131749920), i7, o4, new Runnable() { // from class: di.k9
                                                @Override // java.lang.Runnable
                                                public final void run() {
                                                    int i21 = i20;
                                                    Context context5 = context;
                                                    long j14 = o4;
                                                    org.telegram.ui.ActionBar.x2[] x2VarArr7 = x2VarArr;
                                                    switch (i21) {
                                                        case 0:
                                                            x2VarArr7[0].dismiss();
                                                            if (!o10.B(j14)) {
                                                                org.telegram.ui.ActionBar.h2 T2 = LaunchActivity.T();
                                                                if (T2 != null) {
                                                                    T2.presentFragment(bn.ua(j14));
                                                                    break;
                                                                }
                                                            } else {
                                                                vf.c.t(context5, gd.M0(2131744689, null));
                                                                break;
                                                            }
                                                            break;
                                                        case 1:
                                                            x2VarArr7[0].dismiss();
                                                            if (!o10.B(j14)) {
                                                                org.telegram.ui.ActionBar.h2 T3 = LaunchActivity.T();
                                                                if (T3 != null) {
                                                                    T3.presentFragment(bn.ua(j14));
                                                                    break;
                                                                }
                                                            } else {
                                                                vf.c.t(context5, gd.M0(2131744689, null));
                                                                break;
                                                            }
                                                            break;
                                                        default:
                                                            x2VarArr7[0].dismiss();
                                                            if (!o10.B(j14)) {
                                                                org.telegram.ui.ActionBar.h2 T4 = LaunchActivity.T();
                                                                if (T4 != null) {
                                                                    T4.presentFragment(bn.ua(j14));
                                                                    break;
                                                                }
                                                            } else {
                                                                vf.c.t(context5, gd.M0(2131744689, null));
                                                                break;
                                                            }
                                                            break;
                                                    }
                                                }
                                            });
                                            cy0Var10.f(gd.I(starsTransaction3.premium_gift_months, "Months"), gd.L0(2131744699));
                                        } else if (!starsTransaction3.posts_search) {
                                            String L02 = gd.L0(2131744698);
                                            final int i21 = 2;
                                            Runnable runnable = new Runnable() { // from class: di.k9
                                                @Override // java.lang.Runnable
                                                public final void run() {
                                                    int i212 = i21;
                                                    Context context5 = context;
                                                    long j14 = o4;
                                                    org.telegram.ui.ActionBar.x2[] x2VarArr7 = x2VarArr;
                                                    switch (i212) {
                                                        case 0:
                                                            x2VarArr7[0].dismiss();
                                                            if (!o10.B(j14)) {
                                                                org.telegram.ui.ActionBar.h2 T2 = LaunchActivity.T();
                                                                if (T2 != null) {
                                                                    T2.presentFragment(bn.ua(j14));
                                                                    break;
                                                                }
                                                            } else {
                                                                vf.c.t(context5, gd.M0(2131744689, null));
                                                                break;
                                                            }
                                                            break;
                                                        case 1:
                                                            x2VarArr7[0].dismiss();
                                                            if (!o10.B(j14)) {
                                                                org.telegram.ui.ActionBar.h2 T3 = LaunchActivity.T();
                                                                if (T3 != null) {
                                                                    T3.presentFragment(bn.ua(j14));
                                                                    break;
                                                                }
                                                            } else {
                                                                vf.c.t(context5, gd.M0(2131744689, null));
                                                                break;
                                                            }
                                                            break;
                                                        default:
                                                            x2VarArr7[0].dismiss();
                                                            if (!o10.B(j14)) {
                                                                org.telegram.ui.ActionBar.h2 T4 = LaunchActivity.T();
                                                                if (T4 != null) {
                                                                    T4.presentFragment(bn.ua(j14));
                                                                    break;
                                                                }
                                                            } else {
                                                                vf.c.t(context5, gd.M0(2131744689, null));
                                                                break;
                                                            }
                                                            break;
                                                    }
                                                }
                                            };
                                            x2VarArr = x2VarArr;
                                            context3 = context;
                                            cy0Var10.n(L02, i7, o4, runnable);
                                            cy0Var = cy0Var10;
                                            i13 = i7;
                                            z15 = z23;
                                            cy0Var5 = cy0Var;
                                        }
                                        context3 = context;
                                        i13 = i7;
                                        cy0Var = cy0Var10;
                                        x2VarArr = x2VarArr;
                                        z15 = z23;
                                        cy0Var5 = cy0Var;
                                    } else {
                                        final int i22 = 0;
                                        cy0Var10.n(gd.L0(2131744927), i7, o4, new Runnable() { // from class: di.k9
                                            @Override // java.lang.Runnable
                                            public final void run() {
                                                int i212 = i22;
                                                Context context5 = context;
                                                long j14 = o4;
                                                org.telegram.ui.ActionBar.x2[] x2VarArr7 = x2VarArr;
                                                switch (i212) {
                                                    case 0:
                                                        x2VarArr7[0].dismiss();
                                                        if (!o10.B(j14)) {
                                                            org.telegram.ui.ActionBar.h2 T2 = LaunchActivity.T();
                                                            if (T2 != null) {
                                                                T2.presentFragment(bn.ua(j14));
                                                                break;
                                                            }
                                                        } else {
                                                            vf.c.t(context5, gd.M0(2131744689, null));
                                                            break;
                                                        }
                                                        break;
                                                    case 1:
                                                        x2VarArr7[0].dismiss();
                                                        if (!o10.B(j14)) {
                                                            org.telegram.ui.ActionBar.h2 T3 = LaunchActivity.T();
                                                            if (T3 != null) {
                                                                T3.presentFragment(bn.ua(j14));
                                                                break;
                                                            }
                                                        } else {
                                                            vf.c.t(context5, gd.M0(2131744689, null));
                                                            break;
                                                        }
                                                        break;
                                                    default:
                                                        x2VarArr7[0].dismiss();
                                                        if (!o10.B(j14)) {
                                                            org.telegram.ui.ActionBar.h2 T4 = LaunchActivity.T();
                                                            if (T4 != null) {
                                                                T4.presentFragment(bn.ua(j14));
                                                                break;
                                                            }
                                                        } else {
                                                            vf.c.t(context5, gd.M0(2131744689, null));
                                                            break;
                                                        }
                                                        break;
                                                }
                                            }
                                        });
                                        context3 = context;
                                        cy0Var2 = cy0Var10;
                                        x2VarArr = x2VarArr;
                                    }
                                }
                            }
                            i13 = i7;
                            cy0Var = cy0Var2;
                            z15 = z23;
                            cy0Var5 = cy0Var;
                        }
                        starsTransaction3 = starsTransaction4;
                        cy0Var3 = cy0Var4;
                        context3 = context;
                        cy0Var = cy0Var3;
                        z15 = z23;
                        cy0Var5 = cy0Var;
                    } else {
                        cy0 cy0Var11 = cy0Var10;
                        x2VarArr = x2VarArr6;
                        i13 = i7;
                        starsTransaction3 = starsTransaction4;
                        context3 = context;
                        if (!(starsTransactionPeer2 instanceof TL_stars.TL_starsTransactionPeerFragment)) {
                            z15 = z23;
                            if (starsTransactionPeer2 instanceof TL_stars.TL_starsTransactionPeerAppStore) {
                                cy0Var11.f(gd.L0(2131754229), gd.L0(2131744696));
                                cy0Var5 = cy0Var11;
                            } else if (starsTransactionPeer2 instanceof TL_stars.TL_starsTransactionPeerPlayMarket) {
                                cy0Var11.f(gd.L0(2131747026), gd.L0(2131744696));
                                cy0Var5 = cy0Var11;
                            } else {
                                cy0Var5 = cy0Var11;
                                if (starsTransactionPeer2 instanceof TL_stars.TL_starsTransactionPeerPremiumBot) {
                                    cy0Var11.f(gd.L0(2131744726), gd.L0(2131744696));
                                    cy0Var5 = cy0Var11;
                                }
                            }
                        } else if (starsTransaction3.gift) {
                            k80 k80Var = new k80(context3, i6Var3);
                            k80Var.setPadding(org.telegram.messenger.g0.L(12.66f), org.telegram.messenger.g0.L(9.33f), org.telegram.messenger.g0.L(12.66f), org.telegram.messenger.g0.L(9.33f));
                            k80Var.setEllipsize(TextUtils.TruncateAt.END);
                            int i23 = org.telegram.ui.ActionBar.n6.Xc;
                            org.telegram.ui.ActionBar.u6.U(k80Var, i23, i6Var3);
                            org.telegram.ui.ActionBar.u6.G(k80Var, i23, i6Var3);
                            k80Var.setTextSize(1, 14.0f);
                            k80Var.setSingleLine(true);
                            k80Var.setDisablePaddingsOffsetY(true);
                            org.telegram.ui.f5 f5Var = new org.telegram.ui.f5(24.0f, i13, k80Var);
                            String L03 = gd.L0(z23 ? 2131744693 : 2131744690);
                            mq a10 = kb.a(24, "fragment");
                            int L = org.telegram.messenger.g0.L(16.0f);
                            int L2 = org.telegram.messenger.g0.L(16.0f);
                            a10.e = L;
                            a10.f = L2;
                            f5Var.b.w0(a10);
                            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder("x  " + ((Object) L03));
                            spannableStringBuilder2.setSpan(f5Var, 0, 1, 33);
                            z15 = z23;
                            spannableStringBuilder2.setSpan(new ma(x2VarArr, context3, z15), 3, spannableStringBuilder2.length(), 33);
                            k80Var.setText(spannableStringBuilder2);
                            cy0Var11.l(k80Var, gd.L0(2131744698));
                            cy0Var5 = cy0Var11;
                        } else {
                            z15 = z23;
                            cy0Var11.f(gd.L0(2131750505), gd.L0(2131744696));
                            cy0Var5 = cy0Var11;
                        }
                    }
                } else if (starsTransaction2.stargift_upgrade) {
                    if ((starsTransaction2.flags & 256) == 0 || starsTransaction2.msg_id <= 0) {
                        starsTransaction3 = starsTransaction2;
                        viewGroup3 = linearLayout;
                    } else {
                        org.telegram.ui.Components.nc ncVar = (org.telegram.ui.Components.nc) ((zx0) cy0Var10.f(gd.L0(2131744985), gd.L0(2131744992)).getChildAt(1)).getChildAt(0);
                        TL_stars.TL_inputSavedStarGiftUser tL_inputSavedStarGiftUser = new TL_stars.TL_inputSavedStarGiftUser();
                        tL_inputSavedStarGiftUser.msg_id = starsTransaction2.msg_id;
                        viewGroup3 = linearLayout;
                        Context context5 = context2;
                        starsTransaction3 = starsTransaction;
                        x8.w(i7).L(tL_inputSavedStarGiftUser, new o9(ncVar, i7, context5, i6Var2, 0));
                    }
                    TL_stars.StarsTransactionPeer starsTransactionPeer3 = starsTransaction3.peer;
                    if (starsTransactionPeer3 instanceof TL_stars.TL_starsTransactionPeer) {
                        long o11 = org.telegram.messenger.n5.o(((TL_stars.TL_starsTransactionPeer) starsTransactionPeer3).peer);
                        cy0Var10.n(gd.L0(2131744975), i7, o11, new h9(x2VarArr, o11, 5));
                        i6Var3 = i6Var;
                        cy0Var9 = cy0Var10;
                        i13 = i7;
                        context3 = context;
                        z15 = z14;
                    } else {
                        i13 = i7;
                        i6Var3 = i6Var;
                        cy0Var9 = cy0Var10;
                        z15 = z14;
                        context3 = context;
                    }
                    viewGroup = viewGroup3;
                    cy0Var5 = cy0Var9;
                } else {
                    final Context context6 = context2;
                    starsTransaction3 = starsTransaction2;
                    if (starGift instanceof TL_stars.TL_starGiftUnique) {
                        String str2 = starGift.slug;
                        if (TextUtils.isEmpty(str2)) {
                            i16 = 2131750177;
                        } else {
                            String L04 = gd.L0(2131750176);
                            StringBuilder sb2 = new StringBuilder();
                            i16 = 2131750177;
                            sb2.append(starsTransaction3.stargift.title);
                            sb2.append(" #");
                            sb2.append(starsTransaction3.stargift.num);
                            cy0Var10.i(L04, sb2.toString(), new ai.a1(context6, i7, str2, i18));
                        }
                        final long e10 = j10.i(i7).e();
                        long o12 = org.telegram.messenger.n5.o(((TL_stars.TL_starsTransactionPeer) starsTransaction3.peer).peer);
                        if (!starsTransaction3.offer) {
                            if (starsTransaction3.stargift_resale) {
                                if (negative) {
                                    cy0Var10.f(gd.L0(starsTransaction3.refund ? 2131744987 : 2131744989), gd.L0(2131744992));
                                } else {
                                    cy0Var10.f(gd.L0(starsTransaction3.refund ? 2131744989 : 2131744987), gd.L0(2131744992));
                                    j12 = e10;
                                }
                            } else if (starsTransaction3.stargift_drop_original_details) {
                                cy0Var10.f(gd.L0(2131744988), gd.L0(2131744992));
                                j12 = e10;
                                o12 = j12;
                            } else {
                                cy0Var10.f(gd.L0(2131744986), gd.L0(2131744992));
                            }
                            j12 = o12;
                            o12 = e10;
                        } else if (negative) {
                            cy0Var10.f(gd.L0(starsTransaction3.refund ? 2131744987 : 2131744991), gd.L0(2131744992));
                            j12 = o12;
                            o12 = e10;
                        } else {
                            cy0Var10.f(gd.L0(starsTransaction3.refund ? 2131744990 : 2131744987), gd.L0(2131744992));
                            j12 = e10;
                        }
                        if (o12 != e10) {
                            x2VarArr2 = x2VarArr;
                            final int i24 = 0;
                            i6Var3 = i6Var;
                            cy0Var8 = cy0Var10;
                            z17 = z14;
                            viewGroup = linearLayout;
                            final long j14 = o12;
                            j13 = e10;
                            cy0Var8.n(gd.L0(i16), i7, j14, new Runnable() { // from class: di.p9
                                @Override // java.lang.Runnable
                                public final void run() {
                                    switch (i24) {
                                        case 0:
                                            x2VarArr2[0].dismiss();
                                            org.telegram.ui.ActionBar.h2 T2 = LaunchActivity.T();
                                            if (T2 != null) {
                                                long j15 = j14;
                                                Bundle j16 = a8.p0.j(j15, "user_id");
                                                if (j15 == e10) {
                                                    j16.putBoolean("my_profile", true);
                                                }
                                                j16.putBoolean("open_gifts", true);
                                                T2.presentFragment(new ProfileActivity(j16, null));
                                                break;
                                            }
                                            break;
                                        default:
                                            x2VarArr2[0].dismiss();
                                            org.telegram.ui.ActionBar.h2 T3 = LaunchActivity.T();
                                            if (T3 != null) {
                                                long j17 = j14;
                                                Bundle j18 = a8.p0.j(j17, "user_id");
                                                if (j17 == e10) {
                                                    j18.putBoolean("my_profile", true);
                                                }
                                                j18.putBoolean("open_gifts", true);
                                                T3.presentFragment(new ProfileActivity(j18, null));
                                                break;
                                            }
                                            break;
                                    }
                                }
                            });
                        } else {
                            i6Var3 = i6Var;
                            cy0Var8 = cy0Var10;
                            x2VarArr2 = x2VarArr;
                            z17 = z14;
                            j13 = e10;
                            viewGroup = linearLayout;
                        }
                        if (j12 != j13) {
                            final long j15 = j13;
                            final int i25 = 1;
                            final long j16 = j12;
                            final org.telegram.ui.ActionBar.x2[] x2VarArr7 = x2VarArr2;
                            cy0Var8.n(gd.L0(2131749920), i7, j16, new Runnable() { // from class: di.p9
                                @Override // java.lang.Runnable
                                public final void run() {
                                    switch (i25) {
                                        case 0:
                                            x2VarArr7[0].dismiss();
                                            org.telegram.ui.ActionBar.h2 T2 = LaunchActivity.T();
                                            if (T2 != null) {
                                                long j152 = j16;
                                                Bundle j162 = a8.p0.j(j152, "user_id");
                                                if (j152 == j15) {
                                                    j162.putBoolean("my_profile", true);
                                                }
                                                j162.putBoolean("open_gifts", true);
                                                T2.presentFragment(new ProfileActivity(j162, null));
                                                break;
                                            }
                                            break;
                                        default:
                                            x2VarArr7[0].dismiss();
                                            org.telegram.ui.ActionBar.h2 T3 = LaunchActivity.T();
                                            if (T3 != null) {
                                                long j17 = j16;
                                                Bundle j18 = a8.p0.j(j17, "user_id");
                                                if (j17 == j15) {
                                                    j18.putBoolean("my_profile", true);
                                                }
                                                j18.putBoolean("open_gifts", true);
                                                T3.presentFragment(new ProfileActivity(j18, null));
                                                break;
                                            }
                                            break;
                                    }
                                }
                            });
                        }
                        cy0 cy0Var12 = cy0Var8;
                        if ((o12 == e10 || starsTransaction3.stargift_resale) && (starsAmount = starsTransaction3.starref_amount) != null && starsTransaction3.starref_commission_permille > 0) {
                            TL_stars.StarsAmount starsAmount4 = starsTransaction3.amount;
                            if ((starsAmount4 instanceof TL_stars.TL_starsTonAmount) && (starsAmount instanceof TL_stars.TL_starsTonAmount)) {
                                TL_stars.TL_starsTonAmount tL_starsTonAmount = new TL_stars.TL_starsTonAmount();
                                tL_starsTonAmount.amount = starsTransaction3.amount.amount + starsTransaction3.starref_amount.amount;
                                lq[] lqVarArr = new lq[1];
                                cy0Var12.f(a1(starsTransaction3.amount, "⭐️ " + ((Object) L0(tL_starsTonAmount)), lqVarArr), gd.L0(2131744715));
                                lq lqVar = lqVarArr[0];
                                if (lqVar != null) {
                                    lqVar.y = org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.Fi, i6Var3);
                                }
                            } else {
                                cy0Var12.f(b1(starsTransaction3.amount instanceof TL_stars.TL_starsTonAmount, i5.c.l(Math.abs(Math.round(starsTransaction3.starref_amount.toDouble() + starsAmount4.toDouble())), ',', new StringBuilder("⭐️ ")), 0.8f, null), gd.L0(2131744715));
                            }
                        }
                        i13 = i7;
                        cy0Var6 = cy0Var12;
                        context3 = context6;
                    } else {
                        i6Var3 = i6Var;
                        x2VarArr2 = x2VarArr;
                        z17 = z14;
                        viewGroup = linearLayout;
                        if (starsTransaction3.refund) {
                            context3 = context;
                            i13 = i7;
                            starsTransaction3 = starsTransaction;
                            cy0Var6 = cy0Var10;
                        } else {
                            long e11 = j3 == 0 ? j10.i(i7).e() : j3;
                            final long o13 = org.telegram.messenger.n5.o(starsTransaction3.peer.peer);
                            TLRPC.User c22 = mp.u1(i7).c2(Long.valueOf(o13));
                            if (positive) {
                                if (o13 != e11) {
                                    CharSequence L05 = gd.L0(2131744973);
                                    Runnable g9Var = new g9(x2VarArr2, starsTransaction3, o13, 4);
                                    String L06 = (c22 == null || o10.y(c22) || o10.b(o13)) ? null : gd.L0(2131750268);
                                    final int i26 = 0;
                                    i15 = i7;
                                    Runnable runnable2 = new Runnable() { // from class: di.e9
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            switch (i26) {
                                                case 0:
                                                    org.telegram.ui.ActionBar.x2 x2Var3 = x2VarArr2[0];
                                                    Objects.requireNonNull(x2Var3);
                                                    new bi.j3(context6, i15, o13, null, new ai.g0(x2Var3, 13)).show();
                                                    break;
                                                default:
                                                    org.telegram.ui.ActionBar.x2 x2Var4 = x2VarArr2[0];
                                                    Objects.requireNonNull(x2Var4);
                                                    new bi.j3(context6, i15, o13, null, new ai.g0(x2Var4, 13)).show();
                                                    break;
                                            }
                                        }
                                    };
                                    cy0Var7 = cy0Var10;
                                    x2VarArr4 = x2VarArr2;
                                    cy0Var7.m(L05, i15, o13, g9Var, L06, runnable2);
                                } else {
                                    i15 = i7;
                                    cy0Var7 = cy0Var10;
                                    x2VarArr4 = x2VarArr2;
                                }
                                final int i27 = 0;
                                cy0Var7.n(gd.L0(2131744972), i15, e11, new Runnable() { // from class: di.f9
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        switch (i27) {
                                            case 0:
                                                x2VarArr4[0].dismiss();
                                                org.telegram.ui.ActionBar.h2 T2 = LaunchActivity.T();
                                                if (T2 != null) {
                                                    Bundle bundle = new Bundle();
                                                    bundle.putLong("user_id", j10.i(i15).e());
                                                    bundle.putBoolean("my_profile", true);
                                                    bundle.putBoolean("open_gifts", true);
                                                    T2.presentFragment(new ProfileActivity(bundle, null));
                                                    break;
                                                }
                                                break;
                                            case 1:
                                                x2VarArr4[0].dismiss();
                                                org.telegram.ui.ActionBar.h2 T3 = LaunchActivity.T();
                                                if (T3 != null) {
                                                    Bundle bundle2 = new Bundle();
                                                    bundle2.putLong("user_id", j10.i(i15).e());
                                                    bundle2.putBoolean("my_profile", true);
                                                    bundle2.putBoolean("open_gifts", true);
                                                    T3.presentFragment(new ProfileActivity(bundle2, null));
                                                    break;
                                                }
                                                break;
                                            default:
                                                x2VarArr4[0].dismiss();
                                                org.telegram.ui.ActionBar.h2 T4 = LaunchActivity.T();
                                                if (T4 != null) {
                                                    Bundle bundle3 = new Bundle();
                                                    bundle3.putLong("user_id", j10.i(i15).e());
                                                    bundle3.putBoolean("my_profile", true);
                                                    T4.presentFragment(new ProfileActivity(bundle3, null));
                                                    break;
                                                }
                                                break;
                                        }
                                    }
                                });
                                x2VarArr3 = x2VarArr4;
                            } else {
                                long j17 = e11;
                                if (o13 != j17) {
                                    final int i28 = 1;
                                    cy0Var10.n(gd.L0(2131744973), i7, j17, new Runnable() { // from class: di.f9
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            switch (i28) {
                                                case 0:
                                                    x2VarArr2[0].dismiss();
                                                    org.telegram.ui.ActionBar.h2 T2 = LaunchActivity.T();
                                                    if (T2 != null) {
                                                        Bundle bundle = new Bundle();
                                                        bundle.putLong("user_id", j10.i(i7).e());
                                                        bundle.putBoolean("my_profile", true);
                                                        bundle.putBoolean("open_gifts", true);
                                                        T2.presentFragment(new ProfileActivity(bundle, null));
                                                        break;
                                                    }
                                                    break;
                                                case 1:
                                                    x2VarArr2[0].dismiss();
                                                    org.telegram.ui.ActionBar.h2 T3 = LaunchActivity.T();
                                                    if (T3 != null) {
                                                        Bundle bundle2 = new Bundle();
                                                        bundle2.putLong("user_id", j10.i(i7).e());
                                                        bundle2.putBoolean("my_profile", true);
                                                        bundle2.putBoolean("open_gifts", true);
                                                        T3.presentFragment(new ProfileActivity(bundle2, null));
                                                        break;
                                                    }
                                                    break;
                                                default:
                                                    x2VarArr2[0].dismiss();
                                                    org.telegram.ui.ActionBar.h2 T4 = LaunchActivity.T();
                                                    if (T4 != null) {
                                                        Bundle bundle3 = new Bundle();
                                                        bundle3.putLong("user_id", j10.i(i7).e());
                                                        bundle3.putBoolean("my_profile", true);
                                                        T4.presentFragment(new ProfileActivity(bundle3, null));
                                                        break;
                                                    }
                                                    break;
                                            }
                                        }
                                    });
                                }
                                CharSequence L07 = gd.L0(2131744972);
                                Runnable g9Var2 = new g9(x2VarArr2, starsTransaction, o13, 0);
                                String L08 = (c22 == null || o10.y(c22) || o10.b(o13)) ? null : gd.L0(2131750268);
                                final int i29 = 1;
                                Runnable runnable3 = new Runnable() { // from class: di.e9
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        switch (i29) {
                                            case 0:
                                                org.telegram.ui.ActionBar.x2 x2Var3 = x2VarArr2[0];
                                                Objects.requireNonNull(x2Var3);
                                                new bi.j3(context, i7, o13, null, new ai.g0(x2Var3, 13)).show();
                                                break;
                                            default:
                                                org.telegram.ui.ActionBar.x2 x2Var4 = x2VarArr2[0];
                                                Objects.requireNonNull(x2Var4);
                                                new bi.j3(context, i7, o13, null, new ai.g0(x2Var4, 13)).show();
                                                break;
                                        }
                                    }
                                };
                                cy0Var7 = cy0Var10;
                                x2VarArr3 = x2VarArr2;
                                cy0Var7.m(L07, i7, o13, g9Var2, L08, runnable3);
                            }
                            context3 = context;
                            cy0Var5 = cy0Var7;
                            x2VarArr = x2VarArr3;
                            z15 = z17;
                            i13 = i7;
                            starsTransaction3 = starsTransaction;
                        }
                    }
                    z15 = z17;
                    x2VarArr = x2VarArr2;
                    cy0Var5 = cy0Var6;
                }
                starsTransactionPeer = starsTransaction3.peer;
                if ((starsTransactionPeer instanceof TL_stars.TL_starsTransactionPeer) && (starsTransaction3.flags & 256) != 0) {
                    long o14 = org.telegram.messenger.n5.o(starsTransactionPeer.peer);
                    if (z10) {
                        o14 = j3;
                    }
                    O0 = mp.u1(i13).O0(Long.valueOf(-o14));
                    if (O0 != null) {
                        k80 k80Var2 = new k80(context3, i6Var3);
                        z16 = z15;
                        k80Var2.setPadding(org.telegram.messenger.g0.L(12.66f), org.telegram.messenger.g0.L(9.33f), org.telegram.messenger.g0.L(12.66f), org.telegram.messenger.g0.L(9.33f));
                        k80Var2.setEllipsize(TextUtils.TruncateAt.END);
                        int i30 = org.telegram.ui.ActionBar.n6.Xc;
                        org.telegram.ui.ActionBar.u6.U(k80Var2, i30, i6Var3);
                        org.telegram.ui.ActionBar.u6.G(k80Var2, i30, i6Var3);
                        k80Var2.setTextSize(1, 14.0f);
                        k80Var2.setDisablePaddingsOffsetY(true);
                        SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder(str);
                        if (!starsTransaction3.extended_media.isEmpty()) {
                            ArrayList<TLRPC.MessageMedia> arrayList = starsTransaction3.extended_media;
                            int size = arrayList.size();
                            int i31 = 0;
                            int i32 = 0;
                            while (i32 < size) {
                                TLRPC.MessageMedia messageMedia = arrayList.get(i32);
                                int i33 = i32 + 1;
                                ArrayList<TLRPC.MessageMedia> arrayList2 = arrayList;
                                TLRPC.MessageMedia messageMedia2 = messageMedia;
                                int i34 = size;
                                r50 r50Var = new r50(24.0f, i13, k80Var2);
                                if (messageMedia2 instanceof TLRPC.TL_messageMediaPhoto) {
                                    viewGroup2 = viewGroup;
                                    c11 = org.telegram.messenger.fc.i(org.telegram.messenger.w7.v(org.telegram.messenger.g0.L(24.0f), messageMedia2.photo.sizes, true), messageMedia2.photo);
                                } else {
                                    viewGroup2 = viewGroup;
                                    if (messageMedia2 instanceof TLRPC.TL_messageMediaDocument) {
                                        c11 = org.telegram.messenger.fc.c(org.telegram.messenger.w7.v(org.telegram.messenger.g0.L(24.0f), messageMedia2.document.thumbs, true), messageMedia2.document);
                                    } else {
                                        fcVar2 = null;
                                        if (fcVar2 == null) {
                                            r50Var.a(6.0f);
                                            r50Var.b.q0(fcVar2, "24_24", null, null, null, 0);
                                            SpannableString spannableString = new SpannableString("x");
                                            spannableString.setSpan(r50Var, 0, spannableString.length(), 33);
                                            spannableStringBuilder3.append((CharSequence) spannableString);
                                            spannableStringBuilder3.append((CharSequence) " ");
                                            i14 = i31 + 1;
                                        } else {
                                            i14 = i31;
                                        }
                                        if (i14 < 3) {
                                            break;
                                        }
                                        size = i34;
                                        i32 = i33;
                                        i31 = i14;
                                        viewGroup = viewGroup2;
                                        arrayList = arrayList2;
                                    }
                                }
                                fcVar2 = c11;
                                if (fcVar2 == null) {
                                }
                                if (i14 < 3) {
                                }
                            }
                        }
                        viewGroup2 = viewGroup;
                        spannableStringBuilder3.append((CharSequence) " ");
                        int length = spannableStringBuilder3.length();
                        String K = org.telegram.messenger.v3.K(O0, false);
                        if (TextUtils.isEmpty(K)) {
                            spannableStringBuilder3.append((CharSequence) O0.title);
                        } else {
                            StringBuilder sb3 = new StringBuilder();
                            com.google.android.gms.internal.vision.e2.r(sb3, mp.u1(i13).X2, "/", K, "/");
                            sb3.append(starsTransaction3.msg_id);
                            spannableStringBuilder3.append((CharSequence) sb3.toString());
                        }
                        g9 g9Var3 = new g9(x2VarArr, o14, starsTransaction3);
                        spannableStringBuilder3.setSpan(new na(g9Var3), length, spannableStringBuilder3.length(), 33);
                        k80Var2.setSingleLine(true);
                        k80Var2.setEllipsize(TextUtils.TruncateAt.END);
                        k80Var2.setText(spannableStringBuilder3);
                        k80Var2.setOnClickListener(new ah.d(g9Var3, 20));
                        cy0Var5.l(k80Var2, gd.L0(starsTransaction3.reaction ? 2131744707 : 2131744708));
                        if (!TextUtils.isEmpty(starsTransaction3.id) && !z22) {
                            String L09 = gd.L0(2131744713);
                            String str3 = starsTransaction3.id;
                            cy0Var5.k(L09, str3, str3.length() <= 25 ? 9 : 10, new w2(14, x2VarArr, i6Var3));
                        }
                        if (starsTransaction3.floodskip && starsTransaction3.floodskip_number > 0) {
                            cy0Var5.f(gd.I(starsTransaction3.floodskip_number, "StarsTransactionFloodskipNumber"), gd.L0(2131744719));
                        }
                        cy0Var5.f(gd.Z(2131742525, gd.E0().s0().format(new Date(starsTransaction3.date * 1000)), gd.E0().p0().format(new Date(starsTransaction3.date * 1000))), gd.L0(2131744725));
                        starGift2 = starsTransaction3.stargift;
                        if (starGift2 != null) {
                            if (starGift2.limited) {
                                H0(cy0Var5, i13, starGift2, i6Var3);
                            }
                            if (!TextUtils.isEmpty(starsTransaction3.description)) {
                                cy0Var5.a(new SpannableStringBuilder(starsTransaction3.description));
                            }
                        }
                        ViewGroup viewGroup4 = viewGroup2;
                        viewGroup4.addView(cy0Var5, c8.ma.k(16.0f, 17.0f, 16.0f, 0.0f, -1, -2));
                        if ((starsTransaction3.flags & 32) != 0) {
                            cy0Var5.f(gd.Z(2131742525, gd.E0().s0().format(new Date(starsTransaction3.transaction_date * 1000)), gd.E0().p0().format(new Date(starsTransaction3.transaction_date * 1000))), gd.L0(2131744694));
                        }
                        if (z16) {
                            context4 = context;
                            k80 k80Var3 = new k80(context4, i6Var3);
                            org.telegram.ui.ActionBar.u6.U(k80Var3, org.telegram.ui.ActionBar.n6.z6, i6Var3);
                            org.telegram.ui.ActionBar.u6.G(k80Var3, org.telegram.ui.ActionBar.n6.Xc, i6Var3);
                            k80Var3.setTextSize(1, 14.0f);
                            k80Var3.setText(org.telegram.messenger.g0.T2(gd.L0(2131744691), new ai.a(context4, 3)));
                            k80Var3.setGravity(17);
                            viewGroup4.addView(k80Var3, c8.ma.k(16.0f, 15.0f, 16.0f, 0.0f, -1, -2));
                        } else {
                            context4 = context;
                        }
                        hi.d dVar = new hi.d(context4, i6Var3);
                        dVar.f();
                        if ((starsTransaction3.flags & 32) == 0) {
                            r13 = 0;
                            dVar.h(gd.L0(2131744687), false);
                        } else {
                            r13 = 0;
                            dVar.h(gd.L0(2131747638), false);
                        }
                        viewGroup4.addView(dVar, c8.ma.k(16.0f, 15.0f, 16.0f, 0.0f, -1, 48));
                        org.telegram.ui.ActionBar.x2 x2Var3 = x2Var;
                        x2Var3.O = viewGroup4;
                        x2VarArr[r13] = x2Var3;
                        x2Var3.U0 = r13;
                        if ((starsTransaction3.flags & 32) == 0) {
                            dVar.setOnClickListener(new ai.v2(18, context4, starsTransaction3));
                        } else {
                            dVar.setOnClickListener(new ai.q2(x2VarArr, 1));
                        }
                        x2VarArr[0].O();
                        T = LaunchActivity.T();
                        if (!org.telegram.messenger.g0.Q1() && !org.telegram.messenger.g0.u1(T)) {
                            x2VarArr[0].a0(T);
                        }
                        x2VarArr[0].show();
                        return x2VarArr[0];
                    }
                }
                z16 = z15;
                viewGroup2 = viewGroup;
                if (!TextUtils.isEmpty(starsTransaction3.id)) {
                    String L092 = gd.L0(2131744713);
                    String str32 = starsTransaction3.id;
                    cy0Var5.k(L092, str32, str32.length() <= 25 ? 9 : 10, new w2(14, x2VarArr, i6Var3));
                }
                if (starsTransaction3.floodskip) {
                    cy0Var5.f(gd.I(starsTransaction3.floodskip_number, "StarsTransactionFloodskipNumber"), gd.L0(2131744719));
                }
                cy0Var5.f(gd.Z(2131742525, gd.E0().s0().format(new Date(starsTransaction3.date * 1000)), gd.E0().p0().format(new Date(starsTransaction3.date * 1000))), gd.L0(2131744725));
                starGift2 = starsTransaction3.stargift;
                if (starGift2 != null) {
                }
                ViewGroup viewGroup42 = viewGroup2;
                viewGroup42.addView(cy0Var5, c8.ma.k(16.0f, 17.0f, 16.0f, 0.0f, -1, -2));
                if ((starsTransaction3.flags & 32) != 0) {
                }
                if (z16) {
                }
                hi.d dVar2 = new hi.d(context4, i6Var3);
                dVar2.f();
                if ((starsTransaction3.flags & 32) == 0) {
                }
                viewGroup42.addView(dVar2, c8.ma.k(16.0f, 15.0f, 16.0f, 0.0f, -1, 48));
                org.telegram.ui.ActionBar.x2 x2Var32 = x2Var;
                x2Var32.O = viewGroup42;
                x2VarArr[r13] = x2Var32;
                x2Var32.U0 = r13;
                if ((starsTransaction3.flags & 32) == 0) {
                }
                x2VarArr[0].O();
                T = LaunchActivity.T();
                if (!org.telegram.messenger.g0.Q1()) {
                    x2VarArr[0].a0(T);
                }
                x2VarArr[0].show();
                return x2VarArr[0];
            }
        }
        x2Var = x2Var2;
        z11 = z20;
        final org.telegram.ui.Components.q9 q9Var2 = new org.telegram.ui.Components.q9(context);
        if (starsTransaction.premium_gift) {
            g1(q9Var2, q9Var2.getImageReceiver(), starsTransaction.premium_gift_months);
            g10.addView(q9Var2, c8.ma.t(ks.q2, ks.q2, 17, 0, -8, 0, 10));
        } else if (starsTransaction.posts_search) {
            mq a11 = org.telegram.ui.Cells.s6.a(100, "search");
            int L3 = org.telegram.messenger.g0.L(40.0f);
            int L4 = org.telegram.messenger.g0.L(40.0f);
            a11.e = L3;
            a11.f = L4;
            q9Var2.setImageDrawable(a11);
        } else {
            TL_stars.StarGift starGift4 = starsTransaction.stargift;
            if (starGift4 == null) {
                if (z22 || starsTransaction.gift) {
                    context2 = context;
                    i10 = i7;
                    starsTransaction2 = starsTransaction;
                    linearLayout = g10;
                    str = "";
                    z12 = z21;
                    z13 = z10;
                    j10 = j3;
                    i6Var2 = i6Var;
                    z14 = z18;
                    if (starsTransaction2.amount instanceof TL_stars.TL_starsTonAmount) {
                        h1(q9Var2, q9Var2.getImageReceiver(), starsTransaction2.amount.amount);
                    } else {
                        f1(q9Var2, q9Var2.getImageReceiver(), starsTransaction2.amount.amount);
                    }
                    linearLayout.addView(q9Var2, c8.ma.t(ks.q2, ks.q2, 17, 0, -8, 0, 10));
                } else if (starsTransaction.extended_media.isEmpty()) {
                    context2 = context;
                    i10 = i7;
                    starsTransaction2 = starsTransaction;
                    linearLayout = g10;
                    z13 = z10;
                    j10 = j3;
                    i6Var2 = i6Var;
                    TL_stars.StarsTransactionPeer starsTransactionPeer4 = starsTransaction2.peer;
                    if (starsTransactionPeer4 instanceof TL_stars.TL_starsTransactionPeer) {
                        if (starsTransaction2.photo != null) {
                            q9Var2.setRoundRadius(org.telegram.messenger.g0.L(50.0f));
                            z12 = z21;
                            q9Var2.p(org.telegram.messenger.fc.p(h20.c(starsTransaction2.photo)), "100_100", null, null);
                            z14 = z18;
                            str = "";
                        } else {
                            z12 = z21;
                            q9Var2.setRoundRadius(org.telegram.messenger.g0.L(50.0f));
                            if (z12) {
                                peer = starsTransaction2.starref_peer;
                            } else if (starsTransaction2.subscription && z13) {
                                z14 = z18;
                                str = "";
                                j11 = j10;
                                org.telegram.ui.Components.b9 b9Var = new org.telegram.ui.Components.b9();
                                if (j11 < 0) {
                                    TLRPC.User c23 = mp.u1(i10).c2(Long.valueOf(j11));
                                    b9Var.o(c23);
                                    q9Var2.f(c23, b9Var);
                                } else {
                                    TLRPC.Chat O02 = mp.u1(i10).O0(Long.valueOf(-j11));
                                    b9Var.m(O02);
                                    q9Var2.f(O02, b9Var);
                                }
                            } else {
                                peer = starsTransaction2.peer.peer;
                            }
                            z14 = z18;
                            str = "";
                            j11 = org.telegram.messenger.n5.o(peer);
                            org.telegram.ui.Components.b9 b9Var2 = new org.telegram.ui.Components.b9();
                            if (j11 < 0) {
                            }
                        }
                        linearLayout.addView(q9Var2, c8.ma.t(100, 100, 17, 0, 0, 0, 10));
                    } else {
                        str = "";
                        z12 = z21;
                        z14 = z18;
                        mq a12 = org.telegram.ui.Cells.s6.a(100, starsTransactionPeer4 instanceof TL_stars.TL_starsTransactionPeerAppStore ? "ios" : starsTransactionPeer4 instanceof TL_stars.TL_starsTransactionPeerPlayMarket ? "android" : starsTransactionPeer4 instanceof TL_stars.TL_starsTransactionPeerPremiumBot ? "premiumbot" : starsTransactionPeer4 instanceof TL_stars.TL_starsTransactionPeerFragment ? "fragment" : starsTransactionPeer4 instanceof TL_stars.TL_starsTransactionPeerAds ? "ads" : starsTransactionPeer4 instanceof TL_stars.TL_starsTransactionPeerAPI ? "api" : "?");
                        int L5 = org.telegram.messenger.g0.L(40.0f);
                        int L6 = org.telegram.messenger.g0.L(40.0f);
                        a12.e = L5;
                        a12.f = L6;
                        q9Var2.setImageDrawable(a12);
                    }
                } else {
                    q9Var2.setRoundRadius(org.telegram.messenger.g0.L(30.0f));
                    TLRPC.MessageMedia messageMedia3 = starsTransaction.extended_media.get(0);
                    if (messageMedia3 instanceof TLRPC.TL_messageMediaPhoto) {
                        c10 = org.telegram.messenger.fc.i(org.telegram.messenger.w7.v(org.telegram.messenger.g0.L(100.0f), messageMedia3.photo.sizes, true), messageMedia3.photo);
                    } else if (messageMedia3 instanceof TLRPC.TL_messageMediaDocument) {
                        c10 = org.telegram.messenger.fc.c(org.telegram.messenger.w7.v(org.telegram.messenger.g0.L(100.0f), messageMedia3.document.thumbs, true), messageMedia3.document);
                    } else {
                        fcVar = null;
                        q9Var2.m(fcVar, "100_100", null, null, null, 0);
                        g10.addView(q9Var2, c8.ma.t(100, 100, 17, 0, 0, 0, 10));
                        context2 = context;
                        View.OnClickListener onClickListener = new View.OnClickListener() { // from class: di.j9
                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view) {
                                boolean z24 = z10;
                                TL_stars.StarsTransaction starsTransaction5 = starsTransaction;
                                long o15 = z24 ? j3 : org.telegram.messenger.n5.o(starsTransaction5.peer.peer);
                                ArrayList arrayList3 = new ArrayList();
                                for (int i35 = 0; i35 < starsTransaction5.extended_media.size(); i35++) {
                                    TLRPC.MessageMedia messageMedia4 = starsTransaction5.extended_media.get(i35);
                                    TLRPC.TL_message tL_message = new TLRPC.TL_message();
                                    tL_message.id = starsTransaction5.msg_id;
                                    tL_message.dialog_id = o15;
                                    TLRPC.TL_peerChannel tL_peerChannel = new TLRPC.TL_peerChannel();
                                    tL_message.from_id = tL_peerChannel;
                                    long j18 = -o15;
                                    tL_peerChannel.channel_id = j18;
                                    TLRPC.TL_peerChannel tL_peerChannel2 = new TLRPC.TL_peerChannel();
                                    tL_message.peer_id = tL_peerChannel2;
                                    tL_peerChannel2.channel_id = j18;
                                    tL_message.date = starsTransaction5.date;
                                    tL_message.flags |= 512;
                                    tL_message.media = messageMedia4;
                                    tL_message.noforwards = true;
                                    arrayList3.add(new fj(i7, tL_message, false, false));
                                }
                                if (arrayList3.isEmpty()) {
                                    return;
                                }
                                PhotoViewer.p1().I2(null, LaunchActivity.Q(), i6Var);
                                PhotoViewer.p1().a2(arrayList3, 0, o15, 0L, 0L, new la(q9Var2, g10, o15));
                            }
                        };
                        starsTransaction2 = starsTransaction;
                        z13 = z10;
                        i6Var2 = i6Var;
                        i10 = i7;
                        linearLayout = g10;
                        j10 = j3;
                        q9Var2.setOnClickListener(onClickListener);
                        str = "";
                        z12 = z21;
                        z14 = z18;
                    }
                    fcVar = c10;
                    q9Var2.m(fcVar, "100_100", null, null, null, 0);
                    g10.addView(q9Var2, c8.ma.t(100, 100, 17, 0, 0, 0, 10));
                    context2 = context;
                    View.OnClickListener onClickListener2 = new View.OnClickListener() { // from class: di.j9
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            boolean z24 = z10;
                            TL_stars.StarsTransaction starsTransaction5 = starsTransaction;
                            long o15 = z24 ? j3 : org.telegram.messenger.n5.o(starsTransaction5.peer.peer);
                            ArrayList arrayList3 = new ArrayList();
                            for (int i35 = 0; i35 < starsTransaction5.extended_media.size(); i35++) {
                                TLRPC.MessageMedia messageMedia4 = starsTransaction5.extended_media.get(i35);
                                TLRPC.TL_message tL_message = new TLRPC.TL_message();
                                tL_message.id = starsTransaction5.msg_id;
                                tL_message.dialog_id = o15;
                                TLRPC.TL_peerChannel tL_peerChannel = new TLRPC.TL_peerChannel();
                                tL_message.from_id = tL_peerChannel;
                                long j18 = -o15;
                                tL_peerChannel.channel_id = j18;
                                TLRPC.TL_peerChannel tL_peerChannel2 = new TLRPC.TL_peerChannel();
                                tL_message.peer_id = tL_peerChannel2;
                                tL_peerChannel2.channel_id = j18;
                                tL_message.date = starsTransaction5.date;
                                tL_message.flags |= 512;
                                tL_message.media = messageMedia4;
                                tL_message.noforwards = true;
                                arrayList3.add(new fj(i7, tL_message, false, false));
                            }
                            if (arrayList3.isEmpty()) {
                                return;
                            }
                            PhotoViewer.p1().I2(null, LaunchActivity.Q(), i6Var);
                            PhotoViewer.p1().a2(arrayList3, 0, o15, 0L, 0L, new la(q9Var2, g10, o15));
                        }
                    };
                    starsTransaction2 = starsTransaction;
                    z13 = z10;
                    i6Var2 = i6Var;
                    i10 = i7;
                    linearLayout = g10;
                    j10 = j3;
                    q9Var2.setOnClickListener(onClickListener2);
                    str = "";
                    z12 = z21;
                    z14 = z18;
                }
                TextView textView = new TextView(context2);
                i11 = org.telegram.ui.ActionBar.n6.j5;
                org.telegram.messenger.f3.l(textView, i11, i6Var2, 1, 20.0f);
                textView.setGravity(17);
                textView.setText(Q0(i10, z13, starsTransaction2));
                TextView f10 = n10.f(linearLayout, textView, c8.ma.t(-1, -2, 17, 36, 0, 36, 4), context2);
                f10.setTextSize(1, 18.0f);
                f10.setTypeface(org.telegram.messenger.g0.o());
                f10.setGravity(17);
                org.telegram.ui.ActionBar.u6.U(f10, !positive ? org.telegram.ui.ActionBar.n6.lk : org.telegram.ui.ActionBar.n6.nk, i6Var2);
                TL_stars.StarsAmount starsAmount5 = starsTransaction2.amount;
                f10.setText(b1(starsAmount5 instanceof TL_stars.TL_starsTonAmount, TextUtils.concat(positive ? "+" : str, L0(starsAmount5), " ⭐️"), 0.8f, null));
                SpannableStringBuilder spannableStringBuilder4 = new SpannableStringBuilder(f10.getText());
                if (!starsTransaction2.refund) {
                    I0(spannableStringBuilder4, f10, gd.L0(2131744795));
                } else if (starsTransaction2.failed) {
                    org.telegram.ui.ActionBar.u6.U(f10, org.telegram.ui.ActionBar.n6.nk, i6Var2);
                    I0(spannableStringBuilder4, f10, gd.L0(2131744875));
                } else if (starsTransaction2.pending) {
                    org.telegram.ui.ActionBar.u6.U(f10, org.telegram.ui.ActionBar.n6.pk, i6Var2);
                    I0(spannableStringBuilder4, f10, gd.L0(2131744818));
                }
                f10.setText(spannableStringBuilder4);
                linearLayout.addView(f10, c8.ma.t(-1, -2, 17, 36, 0, 36, 4));
                if (!starsTransaction2.paid_message && starsTransaction2.starref_commission_permille > 0 && positive) {
                    k80 k80Var4 = new k80(context2);
                    org.telegram.ui.ActionBar.u6.U(k80Var4, i11, i6Var2);
                    k80Var4.setTextSize(1, 14.0f);
                    k80Var4.setGravity(17);
                    org.telegram.ui.ActionBar.u6.G(k80Var4, org.telegram.ui.ActionBar.n6.Xc, i6Var2);
                    k80Var4.setDisablePaddingsOffsetY(true);
                    SpannableStringBuilder spannableStringBuilder5 = new SpannableStringBuilder();
                    spannableStringBuilder5.append((CharSequence) org.telegram.messenger.g0.W2(gd.Z(2131744705, ki.k.J0(1000 - starsTransaction2.starref_commission_permille))));
                    if (j10 == j10.i(i10).e() || org.telegram.messenger.v3.w(2, mp.u1(i10).O0(Long.valueOf(-j10)))) {
                        spannableStringBuilder5.append((CharSequence) " ");
                        spannableStringBuilder5.append((CharSequence) org.telegram.messenger.g0.H2(org.telegram.messenger.g0.T2(gd.L0(2131744704).replace(' ', (char) 160), new l9(j10, i10, 0)), true));
                    }
                    k80Var4.setText(spannableStringBuilder5);
                    linearLayout.addView(k80Var4, c8.ma.t(-1, -2, 17, 36, 0, 36, 4));
                    x2VarArr = x2VarArr5;
                } else if ((starsTransaction2.amount instanceof TL_stars.TL_starsTonAmount) && (z22 || starsTransaction2.gift)) {
                    TLRPC.User c24 = starsTransaction2.sent_by == null ? null : mp.u1(i10).c2(Long.valueOf(org.telegram.messenger.n5.o(starsTransaction2.sent_by)));
                    TLRPC.User c25 = starsTransaction2.sent_by == null ? null : mp.u1(i10).c2(Long.valueOf(org.telegram.messenger.n5.o(starsTransaction2.received_by)));
                    boolean C = o10.C(c24);
                    if (C) {
                        org.telegram.ui.ActionBar.u6.U(f10, org.telegram.ui.ActionBar.n6.G6, i6Var2);
                        TL_stars.StarsAmount starsAmount6 = starsTransaction2.amount;
                        i12 = 1;
                        f10.setText(b1(starsAmount6 instanceof TL_stars.TL_starsTonAmount, TextUtils.concat(L0(starsAmount6), " ⭐️"), 0.8f, null));
                    } else {
                        i12 = 1;
                    }
                    k80 k80Var5 = new k80(context2);
                    org.telegram.ui.ActionBar.u6.U(k80Var5, i11, i6Var2);
                    k80Var5.setTextSize(i12, 16.0f);
                    k80Var5.setGravity(17);
                    org.telegram.ui.ActionBar.u6.G(k80Var5, org.telegram.ui.ActionBar.n6.Xc, i6Var2);
                    k80Var5.setDisablePaddingsOffsetY(i12);
                    if (C) {
                        Object[] objArr = new Object[i12];
                        objArr[0] = o10.l(c25);
                        L0 = gd.Z(2131754629, objArr);
                    } else {
                        L0 = gd.L0(2131754628);
                    }
                    x2VarArr = x2VarArr5;
                    k80Var5.setText(TextUtils.concat(org.telegram.messenger.g0.W2(L0), " ", org.telegram.messenger.g0.H2(org.telegram.messenger.g0.T2(gd.L0(2131749433).replace(' ', (char) 160), new n9(context2, x2VarArr)), true)));
                    linearLayout.addView(k80Var5, c8.ma.t(-1, -2, 17, 36, 0, 36, 4));
                } else {
                    x2VarArr = x2VarArr5;
                    if (starsTransaction2.description != null && starsTransaction2.extended_media.isEmpty()) {
                        TextView textView2 = new TextView(context2);
                        org.telegram.ui.ActionBar.u6.U(textView2, i11, i6Var2);
                        textView2.setTextSize(1, 16.0f);
                        textView2.setGravity(17);
                        textView2.setText(starsTransaction2.description);
                        linearLayout.addView(textView2, c8.ma.t(-1, -2, 17, 36, 0, 36, 4));
                    }
                }
                cy0 cy0Var102 = new cy0(context2, i6Var2);
                starGift = starsTransaction2.stargift;
                int i182 = 9;
                if (starGift == null) {
                }
                starsTransactionPeer = starsTransaction3.peer;
                if (starsTransactionPeer instanceof TL_stars.TL_starsTransactionPeer) {
                    long o142 = org.telegram.messenger.n5.o(starsTransactionPeer.peer);
                    if (z10) {
                    }
                    O0 = mp.u1(i13).O0(Long.valueOf(-o142));
                    if (O0 != null) {
                    }
                }
                z16 = z15;
                viewGroup2 = viewGroup;
                if (!TextUtils.isEmpty(starsTransaction3.id)) {
                }
                if (starsTransaction3.floodskip) {
                }
                cy0Var5.f(gd.Z(2131742525, gd.E0().s0().format(new Date(starsTransaction3.date * 1000)), gd.E0().p0().format(new Date(starsTransaction3.date * 1000))), gd.L0(2131744725));
                starGift2 = starsTransaction3.stargift;
                if (starGift2 != null) {
                }
                ViewGroup viewGroup422 = viewGroup2;
                viewGroup422.addView(cy0Var5, c8.ma.k(16.0f, 17.0f, 16.0f, 0.0f, -1, -2));
                if ((starsTransaction3.flags & 32) != 0) {
                }
                if (z16) {
                }
                hi.d dVar22 = new hi.d(context4, i6Var3);
                dVar22.f();
                if ((starsTransaction3.flags & 32) == 0) {
                }
                viewGroup422.addView(dVar22, c8.ma.k(16.0f, 15.0f, 16.0f, 0.0f, -1, 48));
                org.telegram.ui.ActionBar.x2 x2Var322 = x2Var;
                x2Var322.O = viewGroup422;
                x2VarArr[r13] = x2Var322;
                x2Var322.U0 = r13;
                if ((starsTransaction3.flags & 32) == 0) {
                }
                x2VarArr[0].O();
                T = LaunchActivity.T();
                if (!org.telegram.messenger.g0.Q1()) {
                }
                x2VarArr[0].show();
                return x2VarArr[0];
            }
            if (starGift4 instanceof TL_stars.TL_starGiftUnique) {
                q9Var2.setImageDrawable(new q5(q9Var2, starsTransaction.stargift, 94, 0.44f));
                g10.addView(q9Var2, c8.ma.t(94, 94, 17, 0, 2, 0, 10));
            } else {
                e1(q9Var2.getImageReceiver(), starsTransaction.stargift, ks.q2);
                g10.addView(q9Var2, c8.ma.t(ks.q2, ks.q2, 17, 0, -8, 0, 10));
            }
        }
        i6Var2 = i6Var;
        context2 = context;
        i10 = i7;
        starsTransaction2 = starsTransaction;
        linearLayout = g10;
        str = "";
        z12 = z21;
        z13 = z10;
        j10 = j3;
        z14 = z18;
        TextView textView3 = new TextView(context2);
        i11 = org.telegram.ui.ActionBar.n6.j5;
        org.telegram.messenger.f3.l(textView3, i11, i6Var2, 1, 20.0f);
        textView3.setGravity(17);
        textView3.setText(Q0(i10, z13, starsTransaction2));
        TextView f102 = n10.f(linearLayout, textView3, c8.ma.t(-1, -2, 17, 36, 0, 36, 4), context2);
        f102.setTextSize(1, 18.0f);
        f102.setTypeface(org.telegram.messenger.g0.o());
        f102.setGravity(17);
        org.telegram.ui.ActionBar.u6.U(f102, !positive ? org.telegram.ui.ActionBar.n6.lk : org.telegram.ui.ActionBar.n6.nk, i6Var2);
        TL_stars.StarsAmount starsAmount52 = starsTransaction2.amount;
        f102.setText(b1(starsAmount52 instanceof TL_stars.TL_starsTonAmount, TextUtils.concat(positive ? "+" : str, L0(starsAmount52), " ⭐️"), 0.8f, null));
        SpannableStringBuilder spannableStringBuilder42 = new SpannableStringBuilder(f102.getText());
        if (!starsTransaction2.refund) {
        }
        f102.setText(spannableStringBuilder42);
        linearLayout.addView(f102, c8.ma.t(-1, -2, 17, 36, 0, 36, 4));
        if (!starsTransaction2.paid_message) {
        }
        if (starsTransaction2.amount instanceof TL_stars.TL_starsTonAmount) {
        }
        x2VarArr = x2VarArr5;
        if (starsTransaction2.description != null) {
            TextView textView22 = new TextView(context2);
            org.telegram.ui.ActionBar.u6.U(textView22, i11, i6Var2);
            textView22.setTextSize(1, 16.0f);
            textView22.setGravity(17);
            textView22.setText(starsTransaction2.description);
            linearLayout.addView(textView22, c8.ma.t(-1, -2, 17, 36, 0, 36, 4));
        }
        cy0 cy0Var1022 = new cy0(context2, i6Var2);
        starGift = starsTransaction2.stargift;
        int i1822 = 9;
        if (starGift == null) {
        }
        starsTransactionPeer = starsTransaction3.peer;
        if (starsTransactionPeer instanceof TL_stars.TL_starsTransactionPeer) {
        }
        z16 = z15;
        viewGroup2 = viewGroup;
        if (!TextUtils.isEmpty(starsTransaction3.id)) {
        }
        if (starsTransaction3.floodskip) {
        }
        cy0Var5.f(gd.Z(2131742525, gd.E0().s0().format(new Date(starsTransaction3.date * 1000)), gd.E0().p0().format(new Date(starsTransaction3.date * 1000))), gd.L0(2131744725));
        starGift2 = starsTransaction3.stargift;
        if (starGift2 != null) {
        }
        ViewGroup viewGroup4222 = viewGroup2;
        viewGroup4222.addView(cy0Var5, c8.ma.k(16.0f, 17.0f, 16.0f, 0.0f, -1, -2));
        if ((starsTransaction3.flags & 32) != 0) {
        }
        if (z16) {
        }
        hi.d dVar222 = new hi.d(context4, i6Var3);
        dVar222.f();
        if ((starsTransaction3.flags & 32) == 0) {
        }
        viewGroup4222.addView(dVar222, c8.ma.k(16.0f, 15.0f, 16.0f, 0.0f, -1, 48));
        org.telegram.ui.ActionBar.x2 x2Var3222 = x2Var;
        x2Var3222.O = viewGroup4222;
        x2VarArr[r13] = x2Var3222;
        x2Var3222.U0 = r13;
        if ((starsTransaction3.flags & 32) == 0) {
        }
        x2VarArr[0].O();
        T = LaunchActivity.T();
        if (!org.telegram.messenger.g0.Q1()) {
        }
        x2VarArr[0].show();
        return x2VarArr[0];
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
            for (lq lqVar : (lq[]) ((Spanned) charSequence).getSpans(0, charSequence.length(), lq.class)) {
                Drawable drawable = lqVar.c;
                if (drawable != null && !(drawable instanceof a5.q) && (c10 = a5.q.c(org.telegram.messenger.t0.b.getResources(), R.drawable.mini_gram_72_white, null)) != null) {
                    c10.setBounds(lqVar.c.getBounds());
                    lqVar.c = c10;
                    lqVar.d = false;
                }
            }
        }
        return charSequence;
    }

    public final void J0() {
        r1();
        ck0 ck0Var = this.c;
        if (ck0Var == null || this.V == null || ck0Var.getLayoutParams() == null) {
            return;
        }
        int D = n10.D(48.0f, this.c0, -org.telegram.messenger.g0.L(8.0f));
        int D2 = n10.D(48.0f, this.d0, -org.telegram.messenger.g0.L(8.0f));
        org.telegram.messenger.g0.z3(this.c, 0, D, 0, D2);
        ck0 ck0Var2 = this.c;
        int i7 = -D;
        ck0Var2.setPadding(ck0Var2.getPaddingLeft(), i7, this.c.getPaddingRight(), this.d0 - D2);
        this.V.z(i7, -D2);
    }

    public final void K0(ArrayList arrayList, z41 z41Var) {
        ck0 ck0Var;
        o1("FILL_BEFORE");
        qt0 qt0Var = this.V;
        boolean z10 = qt0Var != null && qt0Var.f0;
        this.b0 = -1;
        if (getParentActivity() == null) {
            return;
        }
        x8 y10 = x8.y(this.currentAccount, false);
        ArrayList arrayList2 = y10.v;
        uv uvVar = (uv) super.o0(getParentActivity());
        l41 l41Var = new l41(-2);
        l41Var.c = uvVar;
        arrayList.add(l41Var);
        arrayList.add(l41.k(this.j0));
        hi.d dVar = this.s0;
        if (dVar != null) {
            dVar.setVisibility(getMessagesController().a6 ? 0 : 8);
        }
        arrayList.add(l41.C(null));
        if (getMessagesController().j6) {
            arrayList.add(ki.g.i(-4, getThemedColor(org.telegram.ui.ActionBar.n6.lk), rn.i0(gd.M0(2131743529, null)), gd.M0(2131743530, null)));
            arrayList.add(l41.C(null));
        }
        if (y10.e && !arrayList2.isEmpty()) {
            i5.c.s(2131744968, null, arrayList);
            for (int i7 = 0; i7 < arrayList2.size(); i7++) {
                TL_stars.StarsSubscription starsSubscription = (TL_stars.StarsSubscription) arrayList2.get(i7);
                int i10 = hb.b;
                l41 K = l41.K(hb.class);
                K.H = starsSubscription;
                arrayList.add(K);
            }
            if (y10.x) {
                arrayList.add(l41.q(arrayList.size(), 33));
            } else if (!y10.y) {
                l41 c10 = l41.c(-3, R.drawable.arrow_more, gd.M0(2131744967, null));
                c10.r = true;
                arrayList.add(c10);
            }
            arrayList.add(l41.C(null));
        }
        boolean M = y10.M(0);
        this.t0 = M;
        if (M) {
            this.b0 = arrayList.size();
            arrayList.add(l41.n(this.W, -2));
            if (z10 && (ck0Var = this.c) != null) {
                ca.r rVar = this.g0;
                ck0Var.removeCallbacks(rVar);
                this.c.post(rVar);
            }
        } else {
            arrayList.add(l41.m(this.h0));
        }
        o1("FILL_AFTER");
    }

    @Override // org.telegram.ui.s00, org.telegram.ui.ActionBar.h2
    public final View createView(final Context context) {
        TLRPC.TL_starsRevenueStatus tL_starsRevenueStatus;
        final int i7 = 0;
        this.H = false;
        this.F = org.telegram.messenger.g0.L(238.0f);
        qt0 qt0Var = new qt0(context);
        this.V = qt0Var;
        char c10 = 1;
        char c11 = 1;
        char c12 = 1;
        char c13 = 1;
        char c14 = 1;
        char c15 = 1;
        qt0Var.setDebugLoggingEnabled(true);
        this.V.setCommonInsetsManagedExternally(true);
        if (!this.e0) {
            org.telegram.ui.ActionBar.s4 s4Var = this.parentLayout;
            this.c0 = (s4Var == null || !((ActionBarLayout) s4Var).T0) ? org.telegram.messenger.g0.m : 0;
            this.d0 = org.telegram.messenger.g0.n;
        }
        this.V.setGeometry(new cb.c(this, 16));
        this.V.z(-n10.D(48.0f, this.c0, -org.telegram.messenger.g0.L(8.0f)), -n10.D(48.0f, this.d0, -org.telegram.messenger.g0.L(8.0f)));
        qt0 qt0Var2 = this.V;
        qt0Var2.getClass();
        this.W = new bi.i3(26, context, qt0Var2);
        this.U = new ob(context, this.currentAccount, false, 0L, getClassGuid(), getResourceProvider(), this.V);
        this.h0 = new bi.i3(c15 == true ? 1 : 0, context, this);
        super.createView(context);
        r00 r00Var = this.s;
        getBaseSimpleGlass().f(r00Var, this.c, this.simpleActionBar, this.resourceProvider);
        this.simpleActionBar.setBackground(null);
        this.E.bringToFront();
        this.simpleActionBar.bringToFront();
        getBaseSimpleGlass().n = this.V;
        this.c.setCaptureSectionsDecoratorAllowed(true);
        this.U.setGlassEngine(this.glassEngine);
        getBaseSimpleGlass().o = new f(c13 == true ? 1 : 0, this, new e(c14 == true ? 1 : 0, r00Var));
        View view = this.U.d;
        View view2 = new View(getParentActivity());
        this.X = view2;
        view2.setAlpha(0.0f);
        qt0 qt0Var3 = this.V;
        qt0Var3.addView(this.X, qt0Var3.indexOfChild(view), c8.ma.e(-1, 0, 48));
        this.X.setBackground(getBaseSimpleGlass().a(this.X));
        d9 d9Var = new d9(this, i7);
        lr lrVar = lr.h;
        te.a aVar = new te.a(0, d9Var, lrVar, 380L, false);
        this.Y = aVar;
        this.Z = new te.a(1, new d9(this, c12 == true ? 1 : 0), lrVar, 380L, false);
        int i10 = 2;
        this.a0 = new te.a(2, new d9(this, i10), lrVar, 380L, false);
        aVar.a(this.c.canScrollVertically(-1) || this.simpleActionBar.x(), false);
        this.Z.a(this.V.f0, false);
        this.c.j(new bi.q1(this, 10));
        r1();
        fh.g c16 = getBaseSimpleGlass().c.c(view, null, false);
        c16.p(c8.i0.m(this.resourceProvider));
        c16.q(org.telegram.messenger.g0.L(9.66f));
        c16.r(org.telegram.messenger.g0.L(18.0f));
        view.setBackground(c16);
        org.telegram.ui.ActionBar.s4 s4Var2 = this.parentLayout;
        if (s4Var2 != null && ((ActionBarLayout) s4Var2).U0) {
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
        this.S.addView(this.T, c8.ma.d(ks.U2, 190.0f, 17, 0.0f, 12.0f, 0.0f, 24.0f));
        j0(gd.M0(2131743980, null), org.telegram.messenger.g0.H2(org.telegram.messenger.g0.T2(gd.M0(2131743977, null), new ai.a(context, i10)), true), this.S, null);
        this.c.setOverScrollMode(2);
        v4.k kVar = new v4.k();
        kVar.m = false;
        kVar.C = false;
        kVar.o(lrVar);
        kVar.n(350L);
        this.c.setItemAnimator(kVar);
        this.c.setOnItemClickListener(new bi.i8(this, i10));
        uz uzVar = new uz(getParentActivity());
        this.i0 = uzVar;
        this.s.addView(uzVar, c8.ma.c(-1.0f, -1));
        x8 y10 = x8.y(this.currentAccount, false);
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
        mh0 mh0Var = new mh0(R.raw.star_reaction, org.telegram.messenger.g0.L(42.0f), org.telegram.messenger.g0.L(42.0f));
        ImageReceiver imageReceiver = r50Var.b;
        imageReceiver.w0(mh0Var);
        imageReceiver.W(2);
        r50Var.f = false;
        r50Var.h = -org.telegram.messenger.g0.L(3.0f);
        this.k0.setSpan(r50Var, 0, 1, 33);
        this.j0.addView(this.l0, c8.ma.d(-1, 40.0f, 17, 24.0f, 0.0f, 24.0f, 0.0f));
        TextView textView = new TextView(getParentActivity());
        this.m0 = textView;
        textView.setTextSize(1, 14.0f);
        this.m0.setGravity(17);
        this.m0.setText(gd.M0(2131742532, null));
        org.telegram.ui.ActionBar.u6.U(this.m0, org.telegram.ui.ActionBar.n6.z6, this.resourceProvider);
        this.j0.addView(this.m0, c8.ma.d(-1, -2.0f, 17, 24.0f, 0.0f, 24.0f, 0.0f));
        FrameLayout frameLayout2 = new FrameLayout(getParentActivity());
        int i11 = 3;
        bi.a3 a3Var = new bi.a3(i11, getParentActivity(), this);
        this.o0 = a3Var;
        frameLayout2.addView(a3Var);
        hi.d dVar = new hi.d(getParentActivity(), this.resourceProvider, true);
        this.p0 = dVar;
        dVar.f();
        this.p0.i("", false, true);
        this.p0.setOnClickListener(new View.OnClickListener(this) { // from class: di.m9
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
        this.o0.addView(this.p0, c8.ma.e(-1, 48, ks.E1));
        d61 d61Var = new d61(i11, getParentActivity(), this);
        this.q0 = d61Var;
        frameLayout2.addView(d61Var);
        hi.d dVar2 = new hi.d(getParentActivity(), this.resourceProvider, true);
        this.r0 = dVar2;
        dVar2.f();
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("x  ");
        spannableStringBuilder.setSpan(new lq(R.drawable.mini_topup, 2), 0, 1, 33);
        spannableStringBuilder.append((CharSequence) gd.M0(2131744730, null));
        this.r0.i(spannableStringBuilder, false, true);
        hi.d dVar3 = this.r0;
        final char c17 = c11 == true ? 1 : 0;
        dVar3.setOnClickListener(new View.OnClickListener(this) { // from class: di.m9
            public final /* synthetic */ pb b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view3) {
                switch (c17) {
                    case 0:
                        pb.A0(this.b, context);
                        break;
                    default:
                        new gb(context, this.b.resourceProvider).show();
                        break;
                }
            }
        });
        this.q0.addView(this.r0, c8.ma.q(-1, 48, 17.0f, 1, 0, 0, 8, 0));
        hi.d dVar4 = new hi.d(getParentActivity(), this.resourceProvider, true);
        this.n0 = dVar4;
        dVar4.f();
        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder("x  ");
        spannableStringBuilder2.setSpan(new lq(R.drawable.mini_stats, 2), 0, 1, 33);
        spannableStringBuilder2.append((CharSequence) gd.M0(2131744787, null));
        this.n0.i(spannableStringBuilder2, false, true);
        this.n0.setOnClickListener(new View.OnClickListener(this) { // from class: di.u9
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
        this.q0.addView(this.n0, c8.ma.q(-1, 48, 17.0f, 1, 0, 0, 0, 0));
        this.j0.addView(frameLayout2, c8.ma.d(-1, 48.0f, 17, 20.0f, 17.0f, 20.0f, 0.0f));
        hi.d dVar5 = new hi.d(getParentActivity(), this.resourceProvider, false);
        this.s0 = dVar5;
        dVar5.f();
        SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder();
        spannableStringBuilder3.append((CharSequence) "G  ");
        spannableStringBuilder3.setSpan(new lq(R.drawable.menu_stars_gift, 0), 0, 1, 33);
        spannableStringBuilder3.append((CharSequence) gd.M0(2131743978, null));
        this.s0.i(spannableStringBuilder3, false, true);
        hi.d dVar6 = this.s0;
        final char c18 = c10 == true ? 1 : 0;
        dVar6.setOnClickListener(new View.OnClickListener(this) { // from class: di.u9
            public final /* synthetic */ pb b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view3) {
                switch (c18) {
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
        this.j0.addView(this.s0, c8.ma.d(-1, 48.0f, 17, 20.0f, 8.0f, 20.0f, 0.0f));
        p1();
        bi.e8 e8Var = this.v0;
        if (e8Var != null) {
            e8Var.O(false);
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
            bi.e8 e8Var = this.v0;
            if (e8Var != null) {
                e8Var.O(true);
            }
            h0();
            return;
        }
        if (i7 == i13) {
            x8 y10 = x8.y(this.currentAccount, false);
            if (this.t0 != y10.M(0)) {
                this.t0 = y10.M(0);
                u0();
                bi.e8 e8Var2 = this.v0;
                if (e8Var2 != null) {
                    e8Var2.O(false);
                }
                h0();
                return;
            }
            return;
        }
        if (i7 == i12) {
            bi.e8 e8Var3 = this.v0;
            if (e8Var3 != null) {
                e8Var3.O(true);
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

    @Override // org.telegram.ui.s00
    public final void h0() {
        qt0 qt0Var;
        o1("RESTORE_BEFORE");
        super.h0();
        if (this.f0 && (qt0Var = this.V) != null && this.b0 != -1) {
            qt0Var.a();
        }
        this.f0 = false;
        o1("RESTORE_AFTER");
    }

    @Override // org.telegram.ui.s00
    public final void i0() {
        this.s.addView(this.V, c8.ma.c(-1.0f, -1));
        this.V.u(this.c, new d9(this, 3));
        qt0 qt0Var = this.V;
        ob obVar = this.U;
        qt0Var.x(obVar, obVar.b, new ci.v(6));
        this.V.y(this.U.d);
        this.U.d.setLayoutParams(c8.ma.d(-1, -2.0f, 48, -4.0f, 0.0f, -4.0f, 0.0f));
        J0();
    }

    @Override // org.telegram.ui.s00, org.telegram.ui.ActionBar.h2
    public final boolean isSwipeBackEnabled(MotionEvent motionEvent) {
        qt0 qt0Var = this.V;
        return qt0Var == null || motionEvent == null || qt0Var.j(motionEvent.getX(), motionEvent.getY()) || !this.V.c() || this.U.b.b == 0;
    }

    @Override // org.telegram.ui.s00
    public final v4.i0 k0() {
        bi.e8 e8Var = new bi.e8(this, this.c, getParentActivity(), this.currentAccount, this.classGuid, new bi.b(this, 18), getResourceProvider(), 1);
        this.v0 = e8Var;
        e8Var.r = false;
        return e8Var;
    }

    @Override // org.telegram.ui.s00
    public final v4.c0 l0(Context context) {
        qt0 qt0Var = this.V;
        qt0Var.getClass();
        return new jg.i0(5, qt0Var, false);
    }

    @Override // org.telegram.ui.s00
    public final ug.u1 m0() {
        return new ua(getParentActivity(), 75, 1, 0);
    }

    @Override // org.telegram.ui.s00
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
        bi.i3 i3Var = this.W;
        u10.append((i3Var == null || i3Var.getParent() == null) ? false : true);
        u10.append(" boundaryTop=");
        bi.i3 i3Var2 = this.W;
        u10.append(i3Var2 == null ? 0 : i3Var2.getTop());
        u10.append(" boundaryHeight=");
        bi.i3 i3Var3 = this.W;
        u10.append(i3Var3 == null ? 0 : i3Var3.getHeight());
        Log.d("SiblingScroll", u10.toString());
        qt0 qt0Var = this.V;
        if (qt0Var.a) {
            qt0Var.b = Math.max(qt0Var.b, Math.min(60, Math.max(0, 30)));
            qt0Var.f(str, null, 0, 0, true);
        }
    }

    @Override // org.telegram.ui.ActionBar.h2
    public final boolean onFragmentCreate() {
        ks.f(this.currentAccount).c(this, ks.x3);
        ks.f(this.currentAccount).c(this, ks.A3);
        ks.f(this.currentAccount).c(this, ks.B3);
        ks.f(this.currentAccount).c(this, ks.C3);
        ks.f(this.currentAccount).c(this, ks.E3);
        x8.y(this.currentAccount, false).R(true);
        x8.y(this.currentAccount, false).Q();
        x8.y(this.currentAccount, false).z();
        return super.onFragmentCreate();
    }

    @Override // org.telegram.ui.ActionBar.h2
    public final void onFragmentDestroy() {
        ck0 ck0Var = this.c;
        if (ck0Var != null) {
            ck0Var.removeCallbacks(this.g0);
        }
        super.onFragmentDestroy();
        ks.f(this.currentAccount).n(this, ks.x3);
        ks.f(this.currentAccount).n(this, ks.A3);
        ks.f(this.currentAccount).n(this, ks.B3);
        ks.f(this.currentAccount).n(this, ks.C3);
        ks.f(this.currentAccount).n(this, ks.E3);
    }

    @Override // org.telegram.ui.s00, org.telegram.ui.ActionBar.h2
    public final void onInsets(int i7, int i10, int i11, int i12) {
        this.e0 = true;
        this.c0 = i10;
        this.d0 = i12;
        J0();
    }

    @Override // org.telegram.ui.s00, org.telegram.ui.ActionBar.h2
    public final void onPause() {
        super.onPause();
        vg.m mVar = this.T;
        if (mVar != null) {
            mVar.setPaused(true);
            this.T.setDialogVisible(true);
        }
    }

    @Override // org.telegram.ui.s00, org.telegram.ui.ActionBar.h2
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
        x8 y10 = x8.y(this.currentAccount, false);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) this.k0);
        spannableStringBuilder.append((CharSequence) M0(y10.p(), 0.66f, ' '));
        this.l0.setText(spannableStringBuilder);
        this.p0.i(gd.M0(y10.p().amount > 0 ? 2131744915 : 2131744916, null), true, true);
        TLRPC.TL_payments_starsRevenueStats h = e0.g(this.currentAccount).h(getUserConfig().e(), false);
        if (h != null && (tL_starsRevenueStatus = h.status) != null && tL_starsRevenueStatus.overall_revenue.positive()) {
            z10 = true;
        }
        q1(z10, true);
    }

    @Override // org.telegram.ui.s00
    public final float q0() {
        ck0 ck0Var = this.c;
        if (ck0Var == null) {
            return 0.0f;
        }
        return ck0Var.getY();
    }

    public final void q1(final boolean z10, boolean z11) {
        this.u0 = z10;
        if (z11) {
            this.o0.setVisibility(0);
            this.q0.setVisibility(0);
            final int i7 = 0;
            this.o0.animate().alpha(z10 ? 0.0f : 1.0f).withEndAction(new Runnable(this) { // from class: di.fa
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
            this.q0.animate().alpha(z10 ? 1.0f : 0.0f).withEndAction(new Runnable(this) { // from class: di.fa
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

    @Override // org.telegram.ui.s00
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

    @Override // org.telegram.ui.s00
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

    @Override // org.telegram.ui.s00
    public final void u0() {
        o1("SAVE_BEFORE");
        super.u0();
        qt0 qt0Var = this.V;
        this.f0 = qt0Var != null && qt0Var.f0;
        ck0 ck0Var = this.c;
        if (ck0Var != null && this.Q >= 0) {
            this.R -= ck0Var.getPaddingTop();
        }
        o1("SAVE_AFTER");
    }

    @Override // org.telegram.ui.ActionBar.h2
    public final boolean useSimpleActionBar() {
        return true;
    }
}
