package bi;

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
import org.telegram.messenger.c20;
import org.telegram.messenger.ij;
import org.telegram.messenger.ls;
import org.telegram.messenger.m20;
import org.telegram.messenger.p10;
import org.telegram.messenger.qp;
import org.telegram.messenger.qs;
import org.telegram.messenger.t10;
import org.telegram.messenger.v10;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.b80;
import org.telegram.ui.Components.ht0;
import org.telegram.ui.Components.kz;
import org.telegram.ui.Components.l41;
import org.telegram.ui.Components.lb0;
import org.telegram.ui.Components.pj0;
import org.telegram.ui.Components.qx0;
import org.telegram.ui.Components.tx0;
import org.telegram.ui.Components.w70;
import org.telegram.ui.Components.wp;
import org.telegram.ui.Components.x31;
import org.telegram.ui.Components.xp;
import org.telegram.ui.Components.xq;
import org.telegram.ui.Components.zg0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.an;
import org.telegram.ui.c61;
import org.telegram.ui.l00;
import org.telegram.ui.n00;
import org.telegram.ui.o00;
import org.telegram.ui.pn;
import org.telegram.ui.q50;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes3.dex */
public final class dd extends o00 implements ls {
    public static DecimalFormat v0;
    public static DecimalFormat w0;
    public FrameLayout R;
    public vg.m S;
    public cd T;
    public ht0 U;
    public ec V;
    public View W;
    public te.a X;
    public te.a Y;
    public te.a Z;
    public int b0;
    public int c0;
    public boolean d0;
    public boolean e0;
    public ec g0;
    public kz h0;
    public LinearLayout i0;
    public SpannableStringBuilder j0;
    public org.telegram.ui.Components.j6 k0;
    public TextView l0;
    public fi.d m0;
    public e5 n0;
    public fi.d o0;
    public c61 p0;
    public fi.d q0;
    public fi.d r0;
    public boolean s0;
    public boolean t0;
    public hc u0;
    public int a0 = -1;
    public final a3.f f0 = new a3.f(this, 29);

    public dd() {
        this.M = true;
    }

    public static /* synthetic */ void A0(dd ddVar, Context context) {
        if (qp.s1(ddVar.currentAccount).v2()) {
            org.telegram.ui.b.b(ddVar.currentAccount);
        } else {
            new uc(context, ddVar.resourceProvider).show();
        }
    }

    public static void B0(dd ddVar) {
        ea.y(ddVar.currentAccount, false).u();
        wg.f1.l1(1, org.telegram.messenger.v1.a(ddVar.currentAccount).b());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:105:0x075d  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x06c2  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x0358  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x02b2  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x0256  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x01eb  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0250  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0298  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0334  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x03a6  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x04ff  */
    /* JADX WARN: Type inference failed for: r5v30 */
    /* JADX WARN: Type inference failed for: r5v31, types: [boolean] */
    /* JADX WARN: Type inference failed for: r5v32 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void C0(dd ddVar, int i7) {
        x31 G;
        int i10;
        boolean[] zArr;
        String str;
        final boolean z9;
        final boolean z10;
        TLRPC.Chat chat;
        boolean[] zArr2;
        TLRPC.Chat chat2;
        String str2;
        int i11;
        Activity activity;
        boolean z11;
        String str3;
        String str4;
        long currentTime;
        long j3;
        int i12;
        zb zbVar;
        final org.telegram.ui.ActionBar.v2[] v2VarArr;
        final int i13;
        ?? r52;
        org.telegram.ui.ActionBar.f2 T;
        hc hcVar = ddVar.u0;
        if (hcVar == null || (G = hcVar.G(i7)) == null) {
            return;
        }
        int i14 = G.d;
        int i15 = 1;
        if (i14 == -1) {
            ddVar.u0.O(true);
            return;
        }
        if (i14 == -2) {
            ea.y(ddVar.currentAccount, false).u();
            wg.f1.l1(1, org.telegram.messenger.v1.a(ddVar.currentAccount).b());
            return;
        }
        if (i14 == -3) {
            ea.y(ddVar.currentAccount, false).V();
            ddVar.u0.O(true);
            return;
        }
        if (i14 == -4) {
            if (qp.s1(ddVar.currentAccount).v2()) {
                org.telegram.ui.b.b(ddVar.currentAccount);
                return;
            } else {
                ddVar.presentFragment(new hi.q3(ddVar.getUserConfig().e()));
                return;
            }
        }
        if (G.H(pc.class)) {
            if (G.G instanceof TL_stars.TL_starsTopupOption) {
                ea.y(ddVar.currentAccount, false).f(ddVar.getParentActivity(), (TL_stars.TL_starsTopupOption) G.G, new p5(i15, ddVar, G), null);
                return;
            }
            return;
        }
        if (G.H(vc.class) && (G.G instanceof TL_stars.StarsSubscription)) {
            Activity parentActivity = ddVar.getParentActivity();
            int i16 = ddVar.currentAccount;
            final TL_stars.StarsSubscription starsSubscription = (TL_stars.StarsSubscription) G.G;
            org.telegram.ui.ActionBar.f6 resourceProvider = ddVar.getResourceProvider();
            if (starsSubscription == null || parentActivity == null) {
                return;
            }
            org.telegram.ui.ActionBar.v2 h = org.telegram.messenger.camera.q.h(parentActivity, false, 1, resourceProvider);
            org.telegram.ui.ActionBar.v2[] v2VarArr2 = new org.telegram.ui.ActionBar.v2[1];
            LinearLayout e10 = org.telegram.messenger.k5.e(parentActivity, 1);
            e10.setPadding(org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(20.0f), org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(4.0f));
            e10.setClipChildren(false);
            e10.setClipToPadding(false);
            FrameLayout frameLayout = new FrameLayout(parentActivity);
            e10.addView(frameLayout, c8.ha.t(-1, -2, 7, 0, 0, 0, 10));
            boolean[] zArr3 = new boolean[1];
            zb zbVar2 = new zb(zArr3, v2VarArr2);
            qs.f(i16).b(zbVar2, qs.A3);
            long o4 = org.telegram.messenger.m5.o(starsSubscription.peer);
            org.telegram.ui.Components.l9 l9Var = new org.telegram.ui.Components.l9(parentActivity);
            int i17 = (o4 > 0L ? 1 : (o4 == 0L ? 0 : -1));
            if (i17 >= 0) {
                TLRPC.User a22 = qp.s1(i16).a2(Long.valueOf(o4));
                String p10 = t10.p(a22);
                boolean t6 = t10.t(a22);
                z9 = !t6;
                str = p10;
                zArr = zArr3;
                z10 = t6;
                i10 = i17;
                chat = a22;
            } else {
                i10 = i17;
                zArr = zArr3;
                TLRPC.Chat M0 = qp.s1(i16).M0(Long.valueOf(-o4));
                str = M0 == null ? "" : M0.title;
                z9 = false;
                z10 = false;
                chat = M0;
            }
            TLRPC.Chat chat3 = chat;
            if (starsSubscription.photo != null) {
                l9Var.setRoundRadius(org.telegram.messenger.g0.L(21.0f));
                zArr2 = zArr;
                l9Var.p(org.telegram.messenger.hc.p(m20.c(starsSubscription.photo)), "100_100", null, null);
            } else {
                zArr2 = zArr;
                l9Var.setRoundRadius(org.telegram.messenger.g0.L(50.0f));
                org.telegram.ui.Components.w8 w8Var = new org.telegram.ui.Components.w8((org.telegram.ui.ActionBar.f6) null);
                if (i10 < 0) {
                    chat2 = chat3;
                    str2 = str;
                    TLRPC.Chat M02 = qp.s1(i16).M0(Long.valueOf(-o4));
                    w8Var.q(M02);
                    l9Var.e(M02, w8Var);
                    frameLayout.addView(l9Var, c8.ha.e(100, 100, 17));
                    Drawable drawable = parentActivity.getResources().getDrawable(R.drawable.star_small_outline);
                    org.telegram.ui.ActionBar.r6.y(frameLayout, drawable, org.telegram.ui.ActionBar.k6.h5, resourceProvider, PorterDuff.Mode.SRC_IN);
                    Drawable drawable2 = parentActivity.getResources().getDrawable(R.drawable.star_small_inner);
                    if (starsSubscription.photo == null) {
                        ImageView imageView = new ImageView(parentActivity);
                        imageView.setImageDrawable(drawable);
                        frameLayout.addView(imageView, c8.ha.e(28, 28, 17));
                        imageView.setTranslationX(org.telegram.messenger.g0.L(34.0f));
                        imageView.setTranslationY(org.telegram.messenger.g0.L(35.0f));
                        imageView.setScaleX(1.1f);
                        imageView.setScaleY(1.1f);
                        ImageView imageView2 = new ImageView(parentActivity);
                        imageView2.setImageDrawable(drawable2);
                        frameLayout.addView(imageView2, c8.ha.e(28, 28, 17));
                        imageView2.setTranslationX(org.telegram.messenger.g0.L(34.0f));
                        imageView2.setTranslationY(org.telegram.messenger.g0.L(35.0f));
                    }
                    TextView textView = new TextView(parentActivity);
                    org.telegram.messenger.k5.n(textView, org.telegram.ui.ActionBar.k6.j5, resourceProvider, 1, 20.0f);
                    textView.setGravity(17);
                    if (TextUtils.isEmpty(starsSubscription.title)) {
                        textView.setText(starsSubscription.title);
                    } else {
                        textView.setText(org.telegram.messenger.id.M0(2131744974, null));
                    }
                    e10.addView(textView, c8.ha.t(-1, -2, 17, 20, 0, 20, 4));
                    TextView textView2 = new TextView(parentActivity);
                    textView2.setTextSize(1, 14.0f);
                    textView2.setGravity(17);
                    org.telegram.ui.ActionBar.r6.V(textView2, org.telegram.ui.ActionBar.k6.B6, resourceProvider);
                    TL_stars.TL_starsSubscriptionPricing tL_starsSubscriptionPricing = starsSubscription.pricing;
                    i11 = tL_starsSubscriptionPricing.period;
                    if (i11 != 2592000) {
                        textView2.setText(a1(false, org.telegram.messenger.id.a0(null, null, 2131744986, Long.valueOf(tL_starsSubscriptionPricing.amount)), 0.8f, null));
                    } else {
                        textView2.setText(a1(false, org.telegram.messenger.id.a0(null, null, 2131744986, Long.valueOf(tL_starsSubscriptionPricing.amount), i11 == 300 ? "5min" : "min"), 0.8f, null));
                    }
                    e10.addView(textView2, c8.ha.t(-1, -2, 17, 20, 0, 20, 4));
                    tx0 tx0Var = new tx0(parentActivity, resourceProvider);
                    w70 w70Var = new w70(parentActivity, resourceProvider);
                    w70Var.setPadding(org.telegram.messenger.g0.L(12.66f), org.telegram.messenger.g0.L(9.33f), org.telegram.messenger.g0.L(12.66f), org.telegram.messenger.g0.L(9.33f));
                    w70Var.setEllipsize(TextUtils.TruncateAt.END);
                    int i18 = org.telegram.ui.ActionBar.k6.Uc;
                    org.telegram.ui.ActionBar.r6.V(w70Var, i18, resourceProvider);
                    org.telegram.ui.ActionBar.r6.H(w70Var, i18, resourceProvider);
                    w70Var.setTextSize(1, 14.0f);
                    w70Var.setSingleLine(true);
                    w70Var.setDisablePaddingsOffsetY(true);
                    org.telegram.ui.f5 f5Var = new org.telegram.ui.f5(24.0f, i16, w70Var);
                    if (i10 < 0) {
                        TLRPC.User a23 = qp.s1(i16).a2(Long.valueOf(o4));
                        z11 = a23 == null || t10.x(a23);
                        str3 = t10.p(a23);
                        f5Var.e(a23);
                        activity = parentActivity;
                    } else {
                        activity = parentActivity;
                        TLRPC.Chat M03 = qp.s1(i16).M0(Long.valueOf(-o4));
                        z11 = M03 == null;
                        str3 = M03 != null ? M03.title : "";
                        f5Var.b(M03);
                    }
                    String str5 = str3;
                    final TLRPC.Chat chat4 = chat2;
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("x  " + ((Object) str5));
                    spannableStringBuilder.setSpan(f5Var, 0, 1, 33);
                    spannableStringBuilder.setSpan(new ac(v2VarArr2, o4), 3, spannableStringBuilder.length(), 33);
                    w70Var.setText(spannableStringBuilder);
                    if (!z11) {
                        tx0Var.l(w70Var, org.telegram.messenger.id.M0(i10 < 0 ? 2131744998 : z9 ? 2131745008 : 2131745013, null));
                    }
                    if (i10 >= 0 || TextUtils.isEmpty(starsSubscription.title)) {
                        str4 = null;
                    } else {
                        str4 = null;
                        tx0Var.c(org.telegram.messenger.id.M0(z9 ? 2131745006 : 2131745011, null), starsSubscription.title, null, null);
                    }
                    tx0Var.c(org.telegram.messenger.id.M0(2131744979, str4), org.telegram.messenger.id.a0(null, null, 2131742786, org.telegram.messenger.id.E0().s0().format(new Date((starsSubscription.until_date - starsSubscription.pricing.period) * 1000)), org.telegram.messenger.id.E0().p0().format(new Date((starsSubscription.until_date - starsSubscription.pricing.period) * 1000))), null, null);
                    currentTime = ConnectionsManager.getInstance(i16).getCurrentTime();
                    if (!starsSubscription.canceled || starsSubscription.bot_canceled) {
                        j3 = o4;
                        i12 = 2131744972;
                    } else {
                        j3 = o4;
                        i12 = currentTime > ((long) starsSubscription.until_date) ? 2131744973 : 2131744971;
                    }
                    tx0Var.c(org.telegram.messenger.id.M0(i12, null), org.telegram.messenger.id.a0(null, null, 2131742786, org.telegram.messenger.id.E0().s0().format(new Date(starsSubscription.until_date * 1000)), org.telegram.messenger.id.E0().p0().format(new Date(starsSubscription.until_date * 1000))), null, null);
                    e10.addView(tx0Var, c8.ha.k(0.0f, 17.0f, 0.0f, 0.0f, -1, -2));
                    final Activity activity2 = activity;
                    w70 w70Var2 = new w70(activity2, resourceProvider);
                    int i19 = org.telegram.ui.ActionBar.k6.z6;
                    org.telegram.ui.ActionBar.r6.V(w70Var2, i19, resourceProvider);
                    org.telegram.ui.ActionBar.r6.H(w70Var2, i18, resourceProvider);
                    w70Var2.setTextSize(1, 14.0f);
                    final int i20 = 0;
                    w70Var2.setText(org.telegram.messenger.g0.U2(org.telegram.messenger.id.M0(2131744929, null), new Runnable() { // from class: bi.hb
                        @Override // java.lang.Runnable
                        public final void run() {
                            Object obj;
                            int i21 = i20;
                            Activity activity3 = activity2;
                            switch (i21) {
                                case 0:
                                    vf.c.t(activity3, org.telegram.messenger.id.M0(2131744969, null));
                                    break;
                                default:
                                    if (!activity3.isFinishing()) {
                                        Handler handler = e0.d.g;
                                        Method method = e0.d.f;
                                        int i22 = Build.VERSION.SDK_INT;
                                        if (i22 < 28) {
                                            if (((i22 != 26 && i22 != 27) || method != null) && (e0.d.e != null || e0.d.d != null)) {
                                                try {
                                                    Object obj2 = e0.d.c.get(activity3);
                                                    if (obj2 != null && (obj = e0.d.b.get(activity3)) != null) {
                                                        Application application = activity3.getApplication();
                                                        e0.c cVar = new e0.c(activity3);
                                                        application.registerActivityLifecycleCallbacks(cVar);
                                                        handler.post(new m9.u(9, cVar, obj2));
                                                        try {
                                                            if (i22 == 26 || i22 == 27) {
                                                                Boolean bool = Boolean.FALSE;
                                                                method.invoke(obj, obj2, null, null, 0, bool, null, null, bool, bool);
                                                            } else {
                                                                activity3.recreate();
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
                                            activity3.recreate();
                                            break;
                                        } else {
                                            activity3.recreate();
                                            break;
                                        }
                                    }
                                    break;
                            }
                        }
                    }));
                    w70Var2.setGravity(17);
                    e10.addView(w70Var2, c8.ha.k(14.0f, 15.0f, 14.0f, 7.0f, -1, -2));
                    if (currentTime < starsSubscription.until_date) {
                        zbVar = zbVar2;
                        v2VarArr = v2VarArr2;
                        i13 = i16;
                        w70 w70Var3 = new w70(activity2, resourceProvider);
                        org.telegram.ui.ActionBar.r6.V(w70Var3, i19, resourceProvider);
                        org.telegram.ui.ActionBar.r6.H(w70Var3, i18, resourceProvider);
                        w70Var3.setTextSize(1, 14.0f);
                        w70Var3.setText(org.telegram.messenger.id.a0(null, null, 2131744988, org.telegram.messenger.id.u(starsSubscription.until_date, false)));
                        w70Var3.setSingleLine(false);
                        w70Var3.setMaxLines(4);
                        w70Var3.setGravity(17);
                        e10.addView(w70Var3, c8.ha.k(26.0f, 7.0f, 26.0f, 15.0f, -1, -2));
                        if (starsSubscription.chat_invite_hash != null || starsSubscription.invoice_slug != null) {
                            fi.d dVar = new fi.d(activity2, resourceProvider, true);
                            dVar.setRoundRadius(24);
                            r52 = 0;
                            dVar.i(org.telegram.messenger.id.M0(2131745014, null), false, true);
                            e10.addView(dVar, c8.ha.o(-1, 48));
                            dVar.setOnClickListener(new lb(dVar, starsSubscription, i13, v2VarArr, resourceProvider, zArr2, activity2));
                            h.N = e10;
                            v2VarArr[r52] = h;
                            h.T0 = r52;
                            h.setOnDismissListener(new mb(i13, zbVar));
                            v2VarArr[r52].N();
                            T = LaunchActivity.T();
                            if (!org.telegram.messenger.g0.Q1() && !org.telegram.messenger.g0.u1(T)) {
                                v2VarArr[r52].a0(T);
                            }
                            v2VarArr[r52].show();
                        }
                    } else if (starsSubscription.can_refulfill) {
                        w70 w70Var4 = new w70(activity2, resourceProvider);
                        org.telegram.ui.ActionBar.r6.V(w70Var4, i19, resourceProvider);
                        org.telegram.ui.ActionBar.r6.H(w70Var4, i18, resourceProvider);
                        w70Var4.setTextSize(1, 14.0f);
                        w70Var4.setText(org.telegram.messenger.id.a0(null, null, z10 ? 2131745009 : 2131744984, org.telegram.messenger.id.u(starsSubscription.until_date, false)));
                        w70Var4.setSingleLine(false);
                        w70Var4.setMaxLines(4);
                        w70Var4.setGravity(17);
                        e10.addView(w70Var4, c8.ha.k(26.0f, 7.0f, 26.0f, 15.0f, -1, -2));
                        fi.d dVar2 = new fi.d(activity2, resourceProvider, true);
                        dVar2.i(org.telegram.messenger.id.M0(z10 ? 2131745010 : 2131744985, null), false, true);
                        e10.addView(dVar2, c8.ha.o(-1, 48));
                        zbVar = zbVar2;
                        v2VarArr = v2VarArr2;
                        ib ibVar = new ib(dVar2, i16, starsSubscription, v2VarArr, j3, activity2, resourceProvider, z9, str2);
                        i13 = i16;
                        dVar2.setOnClickListener(ibVar);
                    } else {
                        zbVar = zbVar2;
                        v2VarArr = v2VarArr2;
                        i13 = i16;
                        if (starsSubscription.bot_canceled) {
                            w70 w70Var5 = new w70(activity2, resourceProvider);
                            org.telegram.ui.ActionBar.r6.V(w70Var5, org.telegram.ui.ActionBar.k6.kk, resourceProvider);
                            org.telegram.ui.ActionBar.r6.H(w70Var5, i18, resourceProvider);
                            w70Var5.setTextSize(1, 14.0f);
                            w70Var5.setText(org.telegram.messenger.id.M0(z9 ? 2131745007 : 2131745012, null));
                            w70Var5.setSingleLine(false);
                            w70Var5.setMaxLines(4);
                            w70Var5.setGravity(17);
                            e10.addView(w70Var5, c8.ha.k(26.0f, 7.0f, 26.0f, 15.0f, -1, -2));
                        } else if (starsSubscription.canceled) {
                            w70 w70Var6 = new w70(activity2, resourceProvider);
                            org.telegram.ui.ActionBar.r6.V(w70Var6, org.telegram.ui.ActionBar.k6.kk, resourceProvider);
                            org.telegram.ui.ActionBar.r6.H(w70Var6, i18, resourceProvider);
                            w70Var6.setTextSize(1, 14.0f);
                            w70Var6.setText(org.telegram.messenger.id.M0(2131745001, null));
                            w70Var6.setSingleLine(false);
                            w70Var6.setMaxLines(4);
                            w70Var6.setGravity(17);
                            e10.addView(w70Var6, c8.ha.k(26.0f, 7.0f, 26.0f, 15.0f, -1, -2));
                            if (starsSubscription.chat_invite_hash != null || starsSubscription.invoice_slug != null) {
                                fi.d dVar3 = new fi.d(activity2, resourceProvider, true);
                                dVar3.i(org.telegram.messenger.id.M0(2131744983, null), false, true);
                                e10.addView(dVar3, c8.ha.o(-1, 48));
                                dVar3.setOnClickListener(new jb(dVar3, starsSubscription, i13, v2VarArr, chat4, str2));
                            }
                        } else {
                            w70 w70Var7 = new w70(activity2, resourceProvider);
                            org.telegram.ui.ActionBar.r6.V(w70Var7, i19, resourceProvider);
                            org.telegram.ui.ActionBar.r6.H(w70Var7, i18, resourceProvider);
                            w70Var7.setTextSize(1, 14.0f);
                            w70Var7.setText(org.telegram.messenger.id.a0(null, null, 2131745004, org.telegram.messenger.id.u(starsSubscription.until_date, false)));
                            w70Var7.setSingleLine(false);
                            w70Var7.setMaxLines(4);
                            w70Var7.setGravity(17);
                            e10.addView(w70Var7, c8.ha.k(26.0f, 7.0f, 26.0f, 15.0f, -1, -2));
                            final fi.d dVar4 = new fi.d(activity2, resourceProvider, false);
                            dVar4.i(org.telegram.messenger.id.M0(2131745005, null), false, true);
                            dVar4.setTextColorKey(org.telegram.ui.ActionBar.k6.kk);
                            e10.addView(dVar4, c8.ha.o(-1, 48));
                            dVar4.setOnClickListener(new View.OnClickListener() { // from class: bi.kb
                                @Override // android.view.View.OnClickListener
                                public final void onClick(View view) {
                                    final fi.d dVar5 = dVar4;
                                    if (dVar5.Q) {
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
                                    final TLObject tLObject = chat4;
                                    final boolean z12 = z9;
                                    final boolean z13 = z10;
                                    final org.telegram.ui.ActionBar.v2[] v2VarArr3 = v2VarArr;
                                    connectionsManager.sendRequest(tL_changeStarsSubscription, new RequestDelegate() { // from class: bi.rb
                                        @Override // org.telegram.tgnet.RequestDelegate
                                        public final void run(TLObject tLObject2, TLRPC.TL_error tL_error) {
                                            org.telegram.messenger.g0.h3(new sb(i21, dVar5, tLObject, starsSubscription2, z12, z13, v2VarArr3));
                                        }
                                    });
                                }
                            });
                        }
                    }
                    r52 = 0;
                    h.N = e10;
                    v2VarArr[r52] = h;
                    h.T0 = r52;
                    h.setOnDismissListener(new mb(i13, zbVar));
                    v2VarArr[r52].N();
                    T = LaunchActivity.T();
                    if (!org.telegram.messenger.g0.Q1()) {
                        v2VarArr[r52].a0(T);
                    }
                    v2VarArr[r52].show();
                }
                TLRPC.User a24 = qp.s1(i16).a2(Long.valueOf(o4));
                w8Var.r(a24);
                l9Var.e(a24, w8Var);
            }
            chat2 = chat3;
            str2 = str;
            frameLayout.addView(l9Var, c8.ha.e(100, 100, 17));
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
            e10.addView(textView3, c8.ha.t(-1, -2, 17, 20, 0, 20, 4));
            TextView textView22 = new TextView(parentActivity);
            textView22.setTextSize(1, 14.0f);
            textView22.setGravity(17);
            org.telegram.ui.ActionBar.r6.V(textView22, org.telegram.ui.ActionBar.k6.B6, resourceProvider);
            TL_stars.TL_starsSubscriptionPricing tL_starsSubscriptionPricing2 = starsSubscription.pricing;
            i11 = tL_starsSubscriptionPricing2.period;
            if (i11 != 2592000) {
            }
            e10.addView(textView22, c8.ha.t(-1, -2, 17, 20, 0, 20, 4));
            tx0 tx0Var2 = new tx0(parentActivity, resourceProvider);
            w70 w70Var8 = new w70(parentActivity, resourceProvider);
            w70Var8.setPadding(org.telegram.messenger.g0.L(12.66f), org.telegram.messenger.g0.L(9.33f), org.telegram.messenger.g0.L(12.66f), org.telegram.messenger.g0.L(9.33f));
            w70Var8.setEllipsize(TextUtils.TruncateAt.END);
            int i182 = org.telegram.ui.ActionBar.k6.Uc;
            org.telegram.ui.ActionBar.r6.V(w70Var8, i182, resourceProvider);
            org.telegram.ui.ActionBar.r6.H(w70Var8, i182, resourceProvider);
            w70Var8.setTextSize(1, 14.0f);
            w70Var8.setSingleLine(true);
            w70Var8.setDisablePaddingsOffsetY(true);
            org.telegram.ui.f5 f5Var2 = new org.telegram.ui.f5(24.0f, i16, w70Var8);
            if (i10 < 0) {
            }
            String str52 = str3;
            final TLObject chat42 = chat2;
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder("x  " + ((Object) str52));
            spannableStringBuilder2.setSpan(f5Var2, 0, 1, 33);
            spannableStringBuilder2.setSpan(new ac(v2VarArr2, o4), 3, spannableStringBuilder2.length(), 33);
            w70Var8.setText(spannableStringBuilder2);
            if (!z11) {
            }
            if (i10 >= 0) {
            }
            str4 = null;
            tx0Var2.c(org.telegram.messenger.id.M0(2131744979, str4), org.telegram.messenger.id.a0(null, null, 2131742786, org.telegram.messenger.id.E0().s0().format(new Date((starsSubscription.until_date - starsSubscription.pricing.period) * 1000)), org.telegram.messenger.id.E0().p0().format(new Date((starsSubscription.until_date - starsSubscription.pricing.period) * 1000))), null, null);
            currentTime = ConnectionsManager.getInstance(i16).getCurrentTime();
            if (starsSubscription.canceled) {
            }
            j3 = o4;
            i12 = 2131744972;
            tx0Var2.c(org.telegram.messenger.id.M0(i12, null), org.telegram.messenger.id.a0(null, null, 2131742786, org.telegram.messenger.id.E0().s0().format(new Date(starsSubscription.until_date * 1000)), org.telegram.messenger.id.E0().p0().format(new Date(starsSubscription.until_date * 1000))), null, null);
            e10.addView(tx0Var2, c8.ha.k(0.0f, 17.0f, 0.0f, 0.0f, -1, -2));
            final Activity activity22 = activity;
            w70 w70Var22 = new w70(activity22, resourceProvider);
            int i192 = org.telegram.ui.ActionBar.k6.z6;
            org.telegram.ui.ActionBar.r6.V(w70Var22, i192, resourceProvider);
            org.telegram.ui.ActionBar.r6.H(w70Var22, i182, resourceProvider);
            w70Var22.setTextSize(1, 14.0f);
            final int i202 = 0;
            w70Var22.setText(org.telegram.messenger.g0.U2(org.telegram.messenger.id.M0(2131744929, null), new Runnable() { // from class: bi.hb
                @Override // java.lang.Runnable
                public final void run() {
                    Object obj;
                    int i21 = i202;
                    Activity activity3 = activity22;
                    switch (i21) {
                        case 0:
                            vf.c.t(activity3, org.telegram.messenger.id.M0(2131744969, null));
                            break;
                        default:
                            if (!activity3.isFinishing()) {
                                Handler handler = e0.d.g;
                                Method method = e0.d.f;
                                int i22 = Build.VERSION.SDK_INT;
                                if (i22 < 28) {
                                    if (((i22 != 26 && i22 != 27) || method != null) && (e0.d.e != null || e0.d.d != null)) {
                                        try {
                                            Object obj2 = e0.d.c.get(activity3);
                                            if (obj2 != null && (obj = e0.d.b.get(activity3)) != null) {
                                                Application application = activity3.getApplication();
                                                e0.c cVar = new e0.c(activity3);
                                                application.registerActivityLifecycleCallbacks(cVar);
                                                handler.post(new m9.u(9, cVar, obj2));
                                                try {
                                                    if (i22 == 26 || i22 == 27) {
                                                        Boolean bool = Boolean.FALSE;
                                                        method.invoke(obj, obj2, null, null, 0, bool, null, null, bool, bool);
                                                    } else {
                                                        activity3.recreate();
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
                                    activity3.recreate();
                                    break;
                                } else {
                                    activity3.recreate();
                                    break;
                                }
                            }
                            break;
                    }
                }
            }));
            w70Var22.setGravity(17);
            e10.addView(w70Var22, c8.ha.k(14.0f, 15.0f, 14.0f, 7.0f, -1, -2));
            if (currentTime < starsSubscription.until_date) {
            }
            r52 = 0;
            h.N = e10;
            v2VarArr[r52] = h;
            h.T0 = r52;
            h.setOnDismissListener(new mb(i13, zbVar));
            v2VarArr[r52].N();
            T = LaunchActivity.T();
            if (!org.telegram.messenger.g0.Q1()) {
            }
            v2VarArr[r52].show();
        }
    }

    public static void D0(dd ddVar, x31 x31Var, Boolean bool, String str) {
        if (ddVar.getParentActivity() == null) {
            return;
        }
        if (bool.booleanValue()) {
            org.telegram.ui.Components.hc.a0(ddVar).I(R.raw.stars_topup, org.telegram.messenger.id.M0(2131745162, null), org.telegram.messenger.g0.X2(org.telegram.messenger.id.G((int) x31Var.B, "StarsAcquiredInfo", new Object[0]))).j();
            ddVar.h0.c(true);
            ea.y(ddVar.currentAccount, false).S(true);
        } else if (str != null) {
            org.telegram.ui.Components.hc.a0(ddVar).Q(R.raw.error, 36, org.telegram.messenger.id.a0(null, null, 2131743881, str)).j();
        }
    }

    public static void H0(tx0 tx0Var, int i7, TL_stars.StarGift starGift, org.telegram.ui.ActionBar.f6 f6Var) {
        CharSequence charSequence;
        TextView textView = (TextView) ((qx0) tx0Var.c(org.telegram.messenger.id.M0(2131750301, null), "", null, null).getChildAt(1)).getChildAt(0);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("x ");
        b80 b80Var = new b80(textView, org.telegram.messenger.g0.L(90.0f), 0, f6Var);
        b80Var.a(org.telegram.ui.ActionBar.k6.r1(0.21f, textView.getPaint().getColor()), org.telegram.ui.ActionBar.k6.r1(0.08f, textView.getPaint().getColor()));
        spannableStringBuilder.setSpan(b80Var, 0, 1, 33);
        textView.setText(spannableStringBuilder, TextView.BufferType.SPANNABLE);
        if (starGift.sold_out) {
            if (!(starGift instanceof TL_stars.TL_starGiftUnique)) {
                int i10 = starGift.availability_remains;
                textView.setText(i10 <= 0 ? org.telegram.messenger.id.H(',', "Gift2Availability2ValueNone", starGift.availability_total) : org.telegram.messenger.id.K("Gift2Availability4Value", i10, ',', org.telegram.messenger.id.E(starGift.availability_total, ',')));
                return;
            }
            if (starGift.availability_remains <= 0) {
                charSequence = org.telegram.messenger.id.H(',', "Gift2QuantityIssuedNone", starGift.availability_total);
            } else {
                charSequence = org.telegram.messenger.id.H(',', "Gift2QuantityIssued1", starGift.availability_issued) + org.telegram.messenger.id.H(',', "Gift2QuantityIssued2", starGift.availability_total);
            }
            textView.setText(charSequence);
            return;
        }
        final ea y10 = ea.y(i7, false);
        final long j3 = starGift.id;
        final ai.i iVar = new ai.i(textView, 9);
        final boolean[] zArr = {false};
        final ls[] lsVarArr = new ls[1];
        lsVarArr[0] = new ls() { // from class: bi.m9
            @Override // org.telegram.messenger.ls
            public final void didReceivedNotification(int i11, int i12, Object[] objArr) {
                int i13;
                ea eaVar;
                TL_stars.StarGift J;
                boolean[] zArr2 = zArr;
                if (zArr2[0] || i11 != (i13 = qs.F3) || (J = (eaVar = ea.this).J(j3)) == null) {
                    return;
                }
                zArr2[0] = true;
                qs.f(eaVar.a).n(lsVarArr[0], i13);
                iVar.a(J);
            }
        };
        int i11 = y10.a;
        qs f10 = qs.f(i11);
        ls lsVar = lsVarArr[0];
        int i12 = qs.F3;
        f10.b(lsVar, i12);
        TL_stars.StarGift J = y10.J(j3);
        if (J != null) {
            zArr[0] = true;
            qs.f(i11).n(lsVarArr[0], i12);
            iVar.a(J);
        }
    }

    public static void I0(SpannableStringBuilder spannableStringBuilder, TextView textView, String str) {
        spannableStringBuilder.append(" ");
        SpannableString spannableString = new SpannableString(str);
        spannableString.setSpan(new cc(textView.getCurrentTextColor(), str), 0, spannableString.length(), 33);
        spannableStringBuilder.append((CharSequence) spannableString);
    }

    public static SpannableStringBuilder L0(TL_stars.StarsAmount starsAmount) {
        return M0(starsAmount, 0.777f, ',');
    }

    public static SpannableStringBuilder M0(TL_stars.StarsAmount starsAmount, float f10, char c10) {
        double d;
        int i7;
        if (w0 == null) {
            w0 = new DecimalFormat("0.###", new DecimalFormatSymbols(Locale.US));
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        if (starsAmount instanceof TL_stars.TL_starsTonAmount) {
            long j3 = starsAmount.amount;
            if (j3 % 1000000000 == 0) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(starsAmount.negative() ? "-" : "");
                sb2.append(org.telegram.messenger.id.E(Math.abs(starsAmount.amount / 1000000000), c10));
                spannableStringBuilder.append((CharSequence) sb2.toString());
                return spannableStringBuilder;
            }
            String format = w0.format(j3 / 1.0E9d);
            spannableStringBuilder.append((CharSequence) format);
            int indexOf = format.indexOf(".");
            if (indexOf >= 0) {
                spannableStringBuilder.setSpan(new RelativeSizeSpan(f10), indexOf, spannableStringBuilder.length(), 33);
                return spannableStringBuilder;
            }
        } else {
            long j10 = starsAmount.amount;
            int i10 = starsAmount.nanos;
            boolean z9 = false;
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
                z9 = true;
            }
            if (i10 == 0) {
                StringBuilder sb3 = new StringBuilder();
                sb3.append(z9 ? "-" : "");
                sb3.append(org.telegram.messenger.id.E(Math.abs(j11), c10));
                spannableStringBuilder.append((CharSequence) sb3.toString());
                return spannableStringBuilder;
            }
            StringBuilder sb4 = new StringBuilder();
            sb4.append(z9 ? "-" : "");
            sb4.append(org.telegram.messenger.id.E(Math.abs(j11), c10));
            spannableStringBuilder.append((CharSequence) sb4.toString());
            DecimalFormat decimalFormat = w0;
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
        if (w0 == null) {
            w0 = new DecimalFormat("0.################", new DecimalFormatSymbols(Locale.US));
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        if (starsAmount instanceof TL_stars.TL_starsTonAmount) {
            String format = w0.format(starsAmount.amount / 1.0E9d);
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
            boolean z9 = j3 != 0 ? j3 < 0 : i10 < 0;
            if (Math.abs(j10) > 1000 || starsAmount.nanos == 0) {
                if (starsAmount.amount <= 1000) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(z9 ? "-" : "");
                    sb2.append(org.telegram.messenger.id.E(Math.abs(j10), c10));
                    spannableStringBuilder.append((CharSequence) sb2.toString());
                    return spannableStringBuilder;
                }
                StringBuilder sb3 = new StringBuilder();
                sb3.append(z9 ? "-" : "");
                sb3.append(org.telegram.messenger.g0.o0((int) Math.abs(j10), 0));
                spannableStringBuilder.append((CharSequence) sb3.toString());
                return spannableStringBuilder;
            }
            StringBuilder sb4 = new StringBuilder();
            sb4.append(z9 ? "-" : "");
            sb4.append(org.telegram.messenger.id.E(Math.abs(j10), c10));
            spannableStringBuilder.append((CharSequence) sb4.toString());
            DecimalFormat decimalFormat = w0;
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
            if (w0 == null) {
                w0 = new DecimalFormat("0.################", new DecimalFormatSymbols(Locale.US));
            }
            String format = w0.format(starsAmount.amount / 1.0E9d);
            spannableStringBuilder.append((CharSequence) format);
            int indexOf = format.indexOf(".");
            if (indexOf >= 0) {
                spannableStringBuilder.setSpan(new RelativeSizeSpan(0.777f), indexOf, spannableStringBuilder.length(), 33);
            }
            return spannableStringBuilder;
        }
        long j3 = starsAmount.amount;
        int i10 = starsAmount.nanos;
        boolean z9 = false;
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
            z9 = true;
        }
        if (i10 == 0) {
            spannableStringBuilder.append((CharSequence) org.telegram.messenger.id.H(',', "Stars", (int) j3));
            return spannableStringBuilder;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(z9 ? "-" : "");
        sb2.append(org.telegram.messenger.id.E(Math.abs(j10), ','));
        spannableStringBuilder.append((CharSequence) sb2.toString());
        if (w0 == null) {
            w0 = new DecimalFormat("0.################", new DecimalFormatSymbols(Locale.US));
        }
        DecimalFormat decimalFormat = w0;
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
        spannableStringBuilder.append((CharSequence) " ").append((CharSequence) org.telegram.messenger.id.M0(2131745087, null));
        return spannableStringBuilder;
    }

    public static String P0(long j3) {
        if (v0 == null) {
            v0 = new DecimalFormat("0.####", new DecimalFormatSymbols(Locale.US));
        }
        if (j3 % 1000000000 != 0) {
            return v0.format(j3 / 1.0E9d);
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(j3 < 0 ? "-" : "");
        sb2.append(org.telegram.messenger.id.E(Math.abs(j3 / 1000000000), ','));
        return sb2.toString();
    }

    /* JADX WARN: Code restructure failed: missing block: B:119:0x0199, code lost:
    
        r6 = 2131744954;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static String Q0(int i7, boolean z9, TL_stars.StarsTransaction starsTransaction) {
        if (starsTransaction.stargift_drop_original_details) {
            return org.telegram.messenger.id.M0(2131744935, null);
        }
        if (starsTransaction.posts_search) {
            return org.telegram.messenger.id.M0(2131744939, null);
        }
        if (starsTransaction.premium_gift) {
            return org.telegram.messenger.id.M0(2131744938, null);
        }
        if (starsTransaction.phonegroup_message) {
            return org.telegram.messenger.id.M0(starsTransaction.reaction ? 2131744947 : 2131744948, null);
        }
        if (starsTransaction.paid_message) {
            return org.telegram.messenger.id.H(',', "StarsTransactionMessageFee", starsTransaction.paid_messages);
        }
        if (starsTransaction.floodskip) {
            return org.telegram.messenger.id.M0(2131744962, null);
        }
        if (!starsTransaction.extended_media.isEmpty()) {
            return org.telegram.messenger.id.M0(2131745207, null);
        }
        TL_stars.StarsAmount starsAmount = starsTransaction.amount;
        int i10 = starsTransaction.flags;
        if ((131072 & i10) == 0 && (65536 & i10) != 0) {
            return org.telegram.messenger.id.a0(null, null, 2131745164, hi.j.J0(starsTransaction.starref_commission_permille));
        }
        if (starsTransaction.stargift != null) {
            if (starsTransaction.stargift_prepaid_upgrade) {
                return org.telegram.messenger.id.M0(2131749931, null);
            }
            if (starsTransaction.refund) {
                return org.telegram.messenger.id.M0(starsTransaction.stargift_auction_bid ? 2131749930 : starsAmount.amount > 0 ? starsTransaction.stargift_upgrade ? 2131749927 : 2131749928 : 2131749929, null);
            }
            return org.telegram.messenger.id.M0(starsTransaction.stargift_auction_bid ? 2131749933 : starsAmount.amount > 0 ? 2131749932 : starsTransaction.stargift_upgrade ? 2131749924 : 2131749925, null);
        }
        if (starsTransaction.subscription) {
            int i11 = starsTransaction.subscription_period;
            if (i11 == 2592000) {
                return org.telegram.messenger.id.M0(2131745166, null);
            }
            if (i11 == 300) {
                return "5-minute subscription fee";
            }
            if (i11 == 60) {
                return "Minute subscription fee";
            }
        }
        if ((i10 & TLObject.FLAG_13) != 0) {
            return org.telegram.messenger.id.M0(2131745096, null);
        }
        if (starsTransaction.gift) {
            if (starsTransaction.sent_by != null) {
                return org.telegram.messenger.id.M0(t10.B(qp.s1(i7).a2(Long.valueOf(org.telegram.messenger.m5.o(starsTransaction.sent_by)))) ? 2131745104 : 2131745105, null);
            }
            return org.telegram.messenger.id.M0(2131745105, null);
        }
        String str = starsTransaction.title;
        if (str != null) {
            return str;
        }
        long o4 = org.telegram.messenger.m5.o(starsTransaction.peer.peer);
        if (o4 != 0) {
            if (o4 >= 0) {
                return t10.p(qp.s1(p10.s0).a2(Long.valueOf(o4)));
            }
            TLRPC.Chat M0 = qp.s1(p10.s0).M0(Long.valueOf(-o4));
            return M0 == null ? "" : M0.title;
        }
        TL_stars.StarsTransactionPeer starsTransactionPeer = starsTransaction.peer;
        if (!(starsTransactionPeer instanceof TL_stars.TL_starsTransactionPeerFragment)) {
            return starsTransactionPeer instanceof TL_stars.TL_starsTransactionPeerPremiumBot ? org.telegram.messenger.id.M0(2131744964, null) : starsTransactionPeer instanceof TL_stars.TL_starsTransactionPeerAds ? org.telegram.messenger.id.M0(2131744965, null) : org.telegram.messenger.id.M0(2131744926, null);
        }
        if (!z9) {
            if (starsTransaction.refund) {
            }
            return org.telegram.messenger.id.M0(r6, null);
        }
        int i12 = 2131744924;
        return org.telegram.messenger.id.M0(i12, null);
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
        wpVar.G = f12;
        wpVar.H = f10;
        wpVar.I = f10;
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

    public static SpannableStringBuilder V0(CharSequence charSequence, boolean z9) {
        return X0(z9, charSequence, 1.13f, null, 0.0f, 1.0f);
    }

    public static SpannableStringBuilder W0(TL_stars.StarsAmount starsAmount, CharSequence charSequence) {
        return X0(starsAmount instanceof TL_stars.TL_starsTonAmount, charSequence, 1.25f, null, 0.0f, 1.0f);
    }

    public static SpannableStringBuilder X0(boolean z9, CharSequence charSequence, float f10, wp[] wpVarArr, float f11, float f12) {
        wp wpVar;
        if (charSequence == null) {
            return null;
        }
        SpannableStringBuilder spannableStringBuilder = !(charSequence instanceof SpannableStringBuilder) ? new SpannableStringBuilder(charSequence) : (SpannableStringBuilder) charSequence;
        SpannableString spannableString = new SpannableString((z9 ? "TON" : "⭐").concat(" "));
        if (wpVarArr == null || (wpVar = wpVarArr[0]) == null) {
            wpVar = new wp(z9 ? R.drawable.mini_gram_72 : R.drawable.msg_premium_liststar, 0);
            if (wpVarArr != null) {
                wpVarArr[0] = wpVar;
            }
        }
        wpVar.r = 0.0f;
        wpVar.s = f11;
        wpVar.G = f12;
        if (z9) {
            wpVar.d = false;
            float f13 = f10 * 0.2f;
            wpVar.H = f13;
            wpVar.I = f13;
        } else {
            wpVar.H = f10;
            wpVar.I = f10;
        }
        spannableString.setSpan(wpVar, 0, spannableString.length() - 1, 33);
        org.telegram.messenger.g0.M2(spannableStringBuilder, "⭐", "⭐️");
        org.telegram.messenger.g0.M2(spannableStringBuilder, "⭐", "⭐ ");
        org.telegram.messenger.g0.M2(spannableStringBuilder, spannableString, "⭐");
        org.telegram.messenger.g0.M2(spannableStringBuilder, "XTR", "XTR ");
        org.telegram.messenger.g0.M2(spannableStringBuilder, spannableString, "XTR");
        return spannableStringBuilder;
    }

    public static SpannableStringBuilder Y0(boolean z9, String str, wp[] wpVarArr) {
        wp wpVar;
        if (str == null) {
            return null;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str);
        if (wpVarArr == null || (wpVar = wpVarArr[0]) == null) {
            wpVar = new wp(z9 ? R.drawable.mini_gram_72 : R.drawable.msg_premium_liststar, 0);
            float f10 = z9 ? 0.222f : 1.13f;
            float f11 = z9 ? 0.222f : 1.13f;
            wpVar.H = f10;
            wpVar.I = f11;
        }
        if (z9) {
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

    public static SpannableStringBuilder a1(boolean z9, CharSequence charSequence, float f10, wp[] wpVarArr) {
        wp wpVar;
        if (charSequence == null) {
            return null;
        }
        SpannableStringBuilder spannableStringBuilder = !(charSequence instanceof SpannableStringBuilder) ? new SpannableStringBuilder(charSequence) : (SpannableStringBuilder) charSequence;
        String str = z9 ? "TON" : "⭐";
        int i7 = z9 ? R.drawable.mini_gram_72 : R.drawable.star_small_inner;
        SpannableString spannableString = new SpannableString(str.concat(" "));
        if (wpVarArr == null || (wpVar = wpVarArr[0]) == null) {
            if (wpVarArr == null || wpVarArr.length <= 0) {
                wpVar = new wp(i7, 0);
            } else {
                wpVar = new wp(i7, 0);
                wpVarArr[0] = wpVar;
            }
        }
        wpVar.d = false;
        if (z9) {
            f10 *= 0.33f;
        }
        wpVar.H = f10;
        wpVar.I = f10;
        spannableString.setSpan(wpVar, 0, spannableString.length() - 1, 33);
        org.telegram.messenger.g0.M2(spannableStringBuilder, "⭐", "⭐️");
        org.telegram.messenger.g0.M2(spannableStringBuilder, "⭐", "⭐ ");
        org.telegram.messenger.g0.M2(spannableStringBuilder, spannableString, "⭐");
        org.telegram.messenger.g0.M2(spannableStringBuilder, "XTR", "XTR ");
        org.telegram.messenger.g0.M2(spannableStringBuilder, spannableString, "XTR");
        return spannableStringBuilder;
    }

    public static pb b1(View view, ImageReceiver imageReceiver, String str, boolean z9) {
        int i7 = imageReceiver.d;
        final nb nbVar = new nb(z9, i7, str, imageReceiver, new boolean[1]);
        nbVar.run();
        final int i10 = 0;
        Runnable h = qs.f(i7).h(view, z9 ? qs.X2 : qs.W2, new c20() { // from class: bi.ob
            @Override // org.telegram.messenger.c20
            public final void a(Object obj) {
                switch (i10) {
                    case 0:
                        nbVar.run();
                        break;
                    default:
                        nbVar.run();
                        break;
                }
            }
        });
        final int i11 = 1;
        return new pb(h, qs.f(i7).h(view, qs.y0, new c20() { // from class: bi.ob
            @Override // org.telegram.messenger.c20
            public final void a(Object obj) {
                switch (i11) {
                    case 0:
                        nbVar.run();
                        break;
                    default:
                        nbVar.run();
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
        imageReceiver.r0(org.telegram.messenger.hc.b(document), com.google.android.recaptcha.internal.a.j(i7, "_", i7), org.telegram.messenger.hc.c(w10, document), com.google.android.recaptcha.internal.a.j(i7, "_", i7), org.telegram.messenger.t5.d(document.thumbs, org.telegram.ui.ActionBar.k6.a7, 0.35f, false), 0L, null, null, 0);
    }

    public static void d1(ImageReceiver imageReceiver, TL_stars.StarGift starGift, int i7) {
        c1(imageReceiver, starGift == null ? null : starGift.getDocument(), i7);
    }

    public static void e1(org.telegram.ui.Components.l9 l9Var, ImageReceiver imageReceiver, long j3) {
        b1(l9Var, imageReceiver, j3 <= 1000 ? "2⃣" : j3 < 2500 ? "3⃣" : "4⃣", false);
    }

    public static pb f1(org.telegram.ui.Components.l9 l9Var, ImageReceiver imageReceiver, int i7) {
        return b1(l9Var, imageReceiver, i7 != 3 ? i7 != 6 ? i7 != 12 ? i7 != 24 ? "1⃣" : "5⃣" : "4⃣" : "3⃣" : "2⃣", false);
    }

    public static void g1(org.telegram.ui.Components.l9 l9Var, ImageReceiver imageReceiver, long j3) {
        b1(l9Var, imageReceiver, j3 <= 10000000000L ? "2⃣" : j3 <= 50000000000L ? "1⃣" : "3⃣", true);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v0, types: [android.view.View, android.view.ViewGroup, android.widget.LinearLayout] */
    /* JADX WARN: Type inference failed for: r18v5 */
    /* JADX WARN: Type inference failed for: r18v6 */
    /* JADX WARN: Type inference failed for: r18v7 */
    /* JADX WARN: Type inference failed for: r1v5, types: [android.view.View, android.widget.TextView] */
    public static void h1(Context context, int i7, long j3, TL_stories.Boost boost, org.telegram.ui.ActionBar.f6 f6Var) {
        boolean z9;
        if (context == null) {
            return;
        }
        org.telegram.ui.ActionBar.v2 l10 = org.telegram.messenger.k5.l(1, context, f6Var, false);
        ?? f10 = org.telegram.messenger.k5.f(context, 1);
        f10.setPadding(0, org.telegram.messenger.g0.L(20.0f), 0, org.telegram.messenger.g0.L(4.0f));
        f10.setClipChildren(false);
        f10.setClipToPadding(false);
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setClipChildren(false);
        frameLayout.setClipToPadding(false);
        f10.addView(frameLayout, c8.ha.t(-1, qs.g2, 7, 0, 0, 0, 10));
        gc gcVar = new gc(context, 70, 0, 0);
        frameLayout.addView(gcVar, c8.ha.c(-1.0f, -1));
        vg.m mVar = new vg.m(context, 1, 2);
        vg.f fVar = mVar.b;
        fVar.z = org.telegram.ui.ActionBar.k6.Tk;
        fVar.A = org.telegram.ui.ActionBar.k6.Uk;
        fVar.b();
        mVar.setStarParticlesView(gcVar);
        frameLayout.addView(mVar, c8.ha.d(qs.A2, 170.0f, 17, 0.0f, 32.0f, 0.0f, 24.0f));
        mVar.setPaused(false);
        TextView textView = new TextView(context);
        org.telegram.messenger.k5.n(textView, org.telegram.ui.ActionBar.k6.j5, f6Var, 1, 20.0f);
        textView.setGravity(17);
        org.telegram.ui.ActionBar.v2[] v2VarArr = new org.telegram.ui.ActionBar.v2[1];
        textView.setText(org.telegram.messenger.id.H(' ', "BoostStars", (int) boost.stars));
        ?? f11 = org.telegram.messenger.camera.q.f(f10, textView, c8.ha.t(-1, -2, 17, 20, 0, 20, 4), context);
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
        sb2.append(org.telegram.messenger.id.H(' ', "BoostingBoostsCount", i10));
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(sb2.toString());
        wp wpVar = new wp(R.drawable.mini_boost_badge, 2);
        float L = org.telegram.messenger.g0.L(0.66f);
        wpVar.r = 0.0f;
        wpVar.s = L;
        spannableStringBuilder.setSpan(wpVar, 0, 1, 33);
        f11.setText(spannableStringBuilder);
        f10.addView(f11, c8.ha.t(-2, 20, 17, 20, 4, 20, 4));
        tx0 tx0Var = new tx0(context, f6Var);
        tx0Var.n(org.telegram.messenger.id.M0(2131753627, null), i7, j3, new qa(v2VarArr, j3, 6));
        tx0Var.c(org.telegram.messenger.id.M0(2131753626, null), org.telegram.messenger.id.G((int) boost.stars, "BoostStars", new Object[0]), null, null);
        if (boost.giveaway_msg_id != 0) {
            String M0 = org.telegram.messenger.id.M0(2131753615, null);
            String M02 = org.telegram.messenger.id.M0(2131753614, null);
            z9 = 0;
            d3 d3Var = new d3(v2VarArr, j3, boost, 2);
            v2VarArr = v2VarArr;
            tx0Var.i(M0, M02, d3Var);
        } else {
            z9 = 0;
        }
        String M03 = org.telegram.messenger.id.M0(2131753662, null);
        String format = org.telegram.messenger.id.E0().s0().format(new Date(boost.date * 1000));
        String format2 = org.telegram.messenger.id.E0().p0().format(new Date(boost.date * 1000));
        Object[] objArr = new Object[2];
        objArr[z9] = format;
        objArr[1] = format2;
        tx0Var.c(M03, org.telegram.messenger.id.a0(null, null, 2131742786, objArr), null, null);
        String M04 = org.telegram.messenger.id.M0(2131753607, null);
        String format3 = org.telegram.messenger.id.E0().s0().format(new Date(boost.expires * 1000));
        String format4 = org.telegram.messenger.id.E0().p0().format(new Date(boost.expires * 1000));
        Object[] objArr2 = new Object[2];
        objArr2[z9] = format3;
        objArr2[1] = format4;
        tx0Var.c(M04, org.telegram.messenger.id.a0(null, null, 2131742786, objArr2), null, null);
        f10.addView(tx0Var, c8.ha.k(16.0f, 17.0f, 16.0f, 0.0f, -1, -2));
        w70 w70Var = new w70(context, f6Var);
        org.telegram.ui.ActionBar.r6.V(w70Var, org.telegram.ui.ActionBar.k6.z6, f6Var);
        org.telegram.ui.ActionBar.r6.H(w70Var, org.telegram.ui.ActionBar.k6.Uc, f6Var);
        w70Var.setTextSize(1, 14.0f);
        w70Var.setText(org.telegram.messenger.g0.U2(org.telegram.messenger.id.M0(2131744929, null), new pa(context, 2)));
        w70Var.setGravity(17);
        f10.addView(w70Var, c8.ha.k(14.0f, 15.0f, 14.0f, 7.0f, -1, -2));
        fi.d dVar = new fi.d(context, f6Var, true);
        dVar.i(org.telegram.messenger.id.M0(2131747832, null), z9, true);
        dVar.setOnClickListener(new va(v2VarArr, 1));
        f10.addView(dVar, c8.ha.k(16.0f, 8.0f, 16.0f, 0.0f, -1, 48));
        l10.N = f10;
        int i11 = 0;
        v2VarArr[0] = l10;
        l10.T0 = false;
        l10.N();
        org.telegram.ui.ActionBar.f2 T = LaunchActivity.T();
        if (!org.telegram.messenger.g0.Q1() && !org.telegram.messenger.g0.u1(T)) {
            v2VarArr[0].a0(T);
        }
        mVar.setPaused(false);
        v2VarArr[0].show();
        v2VarArr[0].n(new ab(mVar, i11));
    }

    public static h1 i1(Context context, int i7, TL_stars.TL_starGiftUnique tL_starGiftUnique, v10 v10Var, org.telegram.ui.ActionBar.f6 f6Var) {
        cg.b bVar = cg.b.a;
        h1 h1Var = new h1(context, f6Var, i7, tL_starGiftUnique == null ? cg.a.g(((org.telegram.messenger.j0) qp.s1(i7).x7.p.b).c, bVar) : tL_starGiftUnique.resale_ton_only ? tL_starGiftUnique.getResellAmount(cg.b.b) : tL_starGiftUnique.getResellAmount(bVar), new ai.f1(6, v10Var, r8));
        h1[] h1VarArr = {h1Var};
        h1Var.show();
        return h1VarArr[0];
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void j1(Context context, long j3, boolean z9, final v10 v10Var, org.telegram.ui.ActionBar.f6 f6Var) {
        org.telegram.ui.ActionBar.v2[] v2VarArr;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        org.telegram.ui.ActionBar.v2 l10 = org.telegram.messenger.k5.l(1, context, f6Var, false);
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        linearLayout.setClipChildren(false);
        linearLayout.setClipToPadding(false);
        linearLayout.setPadding(org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(8.0f));
        TextView textView = new TextView(context);
        textView.setTypeface(org.telegram.messenger.g0.o());
        fi.d dVar = null;
        textView.setText(org.telegram.messenger.id.M0(2131747733, null));
        textView.setTextSize(1, 20.0f);
        int i7 = org.telegram.ui.ActionBar.k6.G6;
        org.telegram.ui.ActionBar.r6.V(textView, i7, f6Var);
        linearLayout.addView(textView, c8.ha.k(4.0f, 0.0f, 4.0f, 18.0f, -1, -2));
        final EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(context);
        lb0 lb0Var = new lb0(context, f6Var);
        lb0Var.setForceForceUseCenter(true);
        lb0Var.setText(org.telegram.messenger.id.M0(2131747734, null));
        lb0Var.setLeftPadding(org.telegram.messenger.g0.L(36.0f));
        org.telegram.ui.ActionBar.r6.V(editTextBoldCursor, i7, f6Var);
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
        org.telegram.ui.ActionBar.r6.D(editTextBoldCursor, org.telegram.ui.ActionBar.k6.ig, f6Var);
        org.telegram.ui.ActionBar.r6.m(editTextBoldCursor, 36, org.telegram.ui.ActionBar.k6.jg, f6Var);
        int i10 = 3;
        editTextBoldCursor.setGravity(org.telegram.messenger.id.a0 ? 5 : 3);
        editTextBoldCursor.setOnFocusChangeListener(new bb(lb0Var, editTextBoldCursor, objArr2 == true ? 1 : 0));
        LinearLayout linearLayout2 = new LinearLayout(context);
        linearLayout2.setOrientation(0);
        ImageView imageView = new ImageView(context);
        imageView.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        imageView.setImageResource(R.drawable.star_small_inner);
        linearLayout2.addView(imageView, c8.ha.q(-2, -2, 0.0f, 19, 14, 0, 0, 0));
        linearLayout2.addView(editTextBoldCursor, c8.ha.p(-1, -2, 1.0f, qs.E1));
        lb0Var.e(editTextBoldCursor);
        lb0Var.addView(linearLayout2, c8.ha.e(-1, -2, 48));
        linearLayout.addView(lb0Var, c8.ha.o(-1, -2));
        TextView textView2 = new TextView(context);
        textView2.setTextSize(1, 16.0f);
        org.telegram.ui.ActionBar.r6.V(textView2, org.telegram.ui.ActionBar.k6.A6, null);
        lb0Var.addView(textView2, c8.ha.d(-2, -2.0f, 21, 0.0f, 0.0f, 14.0f, 0.0f));
        w70 w70Var = new w70(context, null);
        w70Var.setText(org.telegram.messenger.g0.H2(org.telegram.messenger.g0.U2(org.telegram.messenger.id.M0(2131747736, null), new pa(context, i10)), true));
        w70Var.setTextSize(1, 12.0f);
        org.telegram.ui.ActionBar.r6.V(w70Var, org.telegram.ui.ActionBar.k6.z6, f6Var);
        org.telegram.ui.ActionBar.r6.H(w70Var, org.telegram.ui.ActionBar.k6.Uc, f6Var);
        linearLayout.addView(w70Var, c8.ha.k(14.0f, 3.0f, 14.0f, 24.0f, -1, -2));
        final fi.d h = org.telegram.messenger.k5.h(24, context, f6Var, true);
        h.i(org.telegram.messenger.id.M0(j3 > 0 ? 2131747732 : 2131747738, null), false, true);
        linearLayout.addView(h, c8.ha.o(-1, 48));
        if (j3 > 0 && z9) {
            fi.d h7 = org.telegram.messenger.k5.h(24, context, f6Var, false);
            h7.i(org.telegram.messenger.id.M0(2131747737, null), false, false);
            linearLayout.addView(h7, c8.ha.k(0.0f, 4.0f, 0.0f, 0.0f, -1, 48));
            dVar = h7;
        }
        l10.N = linearLayout;
        final org.telegram.ui.ActionBar.v2[] v2VarArr2 = {l10};
        editTextBoldCursor.setText(j3 <= 0 ? "" : Long.toString(j3));
        editTextBoldCursor.addTextChangedListener(new dc(editTextBoldCursor, lb0Var, j3, z9, h, textView2));
        final boolean[] zArr = {false};
        editTextBoldCursor.setOnEditorActionListener(new TextView.OnEditorActionListener() { // from class: bi.cb
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
                h.setLoading(true);
                EditTextBoldCursor editTextBoldCursor2 = editTextBoldCursor;
                v10Var.a(Long.valueOf(Long.parseLong(editTextBoldCursor2.getText().toString())), new gb(editTextBoldCursor2, v2VarArr2, 1));
                return true;
            }
        });
        db dbVar = new db(zArr, v10Var, editTextBoldCursor, h, v2VarArr2);
        EditTextBoldCursor editTextBoldCursor2 = editTextBoldCursor;
        h.setOnClickListener(dbVar);
        if (dVar != null) {
            fi.d dVar2 = dVar;
            db dbVar2 = new db(zArr, v10Var, dVar2, editTextBoldCursor2, v2VarArr2);
            editTextBoldCursor2 = editTextBoldCursor2;
            v2VarArr = v2VarArr2;
            dVar2.setOnClickListener(dbVar2);
        } else {
            v2VarArr = v2VarArr2;
        }
        v2VarArr[0].N();
        v2VarArr[0].setOnDismissListener(new eb(editTextBoldCursor2, objArr == true ? 1 : 0));
        v2VarArr[0].show();
        org.telegram.ui.ActionBar.f2 Q = LaunchActivity.Q();
        org.telegram.messenger.g0.i3(new gb(v2VarArr, editTextBoldCursor2), Q instanceof an ? ((an) Q).pa() : false ? 200L : 80L);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0fef  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x1037  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x108c  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x10c6  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x10e6  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x10cf  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x1098  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x107a  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0ea0  */
    /* JADX WARN: Removed duplicated region for block: B:236:0x0ace  */
    /* JADX WARN: Removed duplicated region for block: B:304:0x050d  */
    /* JADX WARN: Removed duplicated region for block: B:307:0x051a  */
    /* JADX WARN: Removed duplicated region for block: B:310:0x054d  */
    /* JADX WARN: Removed duplicated region for block: B:350:0x0555  */
    /* JADX WARN: Removed duplicated region for block: B:356:0x0510  */
    /* JADX WARN: Removed duplicated region for block: B:392:0x0414  */
    /* JADX WARN: Removed duplicated region for block: B:393:0x0427  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x077c  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0db3  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0dc1  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0dd2  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0e6f  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0ea6 A[LOOP:0: B:66:0x0e1a->B:75:0x0ea6, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0eb6 A[EDGE_INSN: B:76:0x0eb6->B:77:0x0eb6 BREAK  A[LOOP:0: B:66:0x0e1a->B:75:0x0ea6], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0f32 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0f47  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0f4a  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0f57  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0fb9  */
    /* JADX WARN: Type inference failed for: r13v26 */
    /* JADX WARN: Type inference failed for: r13v27, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r13v28 */
    /* JADX WARN: Type inference failed for: r2v35 */
    /* JADX WARN: Type inference failed for: r2v46 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static org.telegram.ui.ActionBar.v2 k1(final Context context, final boolean z9, final long j3, final int i7, final TL_stars.StarsTransaction starsTransaction, final org.telegram.ui.ActionBar.f6 f6Var) {
        org.telegram.ui.ActionBar.v2 v2Var;
        boolean z10;
        Context context2;
        int i10;
        TL_stars.StarsTransaction starsTransaction2;
        LinearLayout linearLayout;
        String str;
        boolean z11;
        boolean z12;
        long j10;
        org.telegram.ui.ActionBar.f6 f6Var2;
        boolean z13;
        TLRPC.Peer peer;
        long j11;
        org.telegram.messenger.hc hcVar;
        org.telegram.messenger.hc c10;
        int i11;
        final org.telegram.ui.ActionBar.v2[] v2VarArr;
        int i12;
        String L0;
        TL_stars.StarGift starGift;
        org.telegram.ui.ActionBar.f6 f6Var3;
        ViewGroup viewGroup;
        int i13;
        org.telegram.ui.ActionBar.v2[] v2VarArr2;
        TL_stars.StarsTransaction starsTransaction3;
        Context context3;
        final org.telegram.ui.ActionBar.v2[] v2VarArr3;
        tx0 tx0Var;
        tx0 tx0Var2;
        tx0 tx0Var3;
        tx0 tx0Var4;
        tx0 tx0Var5;
        tx0 tx0Var6;
        TL_stars.StarsTransactionPeer starsTransactionPeer;
        ViewGroup viewGroup2;
        boolean z14;
        TL_stars.StarGift starGift2;
        Context context4;
        ?? r13;
        org.telegram.ui.ActionBar.f2 T;
        TLRPC.Chat M0;
        org.telegram.messenger.hc hcVar2;
        org.telegram.messenger.hc c11;
        int i14;
        final int i15;
        final org.telegram.ui.ActionBar.v2[] v2VarArr4;
        int i16;
        long j12;
        tx0 tx0Var7;
        int i17;
        long j13;
        TL_stars.StarsAmount starsAmount;
        TL_stars.StarsTransaction starsTransaction4;
        int i18;
        if (starsTransaction == null || context == null) {
            return null;
        }
        TL_stars.StarsAmount starsAmount2 = starsTransaction.amount;
        boolean z15 = starsAmount2 instanceof TL_stars.TL_starsTonAmount;
        int i19 = starsTransaction.flags;
        boolean z16 = (i19 & TLObject.FLAG_13) != 0;
        boolean z17 = ((131072 & i19) == 0 || starsTransaction.paid_message) ? false : true;
        boolean z18 = (z17 || (i19 & 65536) == 0 || starsTransaction.paid_message) ? false : true;
        boolean positive = starsAmount2.positive();
        boolean negative = starsTransaction.amount.negative();
        org.telegram.ui.ActionBar.v2 v2Var2 = new org.telegram.ui.ActionBar.v2(context, f6Var, false, false);
        v2Var2.N();
        org.telegram.ui.ActionBar.v2[] v2VarArr5 = new org.telegram.ui.ActionBar.v2[1];
        final LinearLayout f10 = org.telegram.messenger.k5.f(context, 1);
        f10.setPadding(0, org.telegram.messenger.g0.L((z16 || starsTransaction.gift || (starsTransaction.stargift_resale && (starsTransaction.stargift instanceof TL_stars.TL_starGiftUnique))) ? 0.0f : 20.0f), 0, org.telegram.messenger.g0.L(8.0f));
        f10.setClipChildren(false);
        f10.setClipToPadding(false);
        boolean z19 = z16;
        if (starsTransaction.stargift_resale) {
            TL_stars.StarGift starGift3 = starsTransaction.stargift;
            if (starGift3 instanceof TL_stars.TL_starGiftUnique) {
                TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) starGift3;
                TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop = (TL_stars.starGiftAttributeBackdrop) ea.l(tL_starGiftUnique.attributes, TL_stars.starGiftAttributeBackdrop.class);
                TL_stars.starGiftAttributePattern stargiftattributepattern = (TL_stars.starGiftAttributePattern) ea.l(tL_starGiftUnique.attributes, TL_stars.starGiftAttributePattern.class);
                org.telegram.ui.Components.g5 g5Var = new org.telegram.ui.Components.g5(org.telegram.messenger.g0.L(20.0f), null);
                RadialGradient radialGradient = new RadialGradient(0.0f, 0.0f, org.telegram.messenger.g0.L(200.0f), new int[]{stargiftattributebackdrop.center_color | (-16777216), stargiftattributebackdrop.edge_color | (-16777216)}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
                z10 = z17;
                Paint paint = new Paint(1);
                Matrix matrix = new Matrix();
                paint.setShader(radialGradient);
                v2Var = v2Var2;
                vb vbVar = new vb(context, matrix, radialGradient, paint, g5Var);
                g5Var.l(vbVar);
                g5Var.i(stargiftattributepattern.document, false);
                vbVar.setOrientation(1);
                org.telegram.ui.Components.l9 l9Var = new org.telegram.ui.Components.l9(context);
                d1(l9Var.getImageReceiver(), starsTransaction.stargift, qs.q2);
                vbVar.addView(l9Var, c8.ha.t(qs.q2, qs.q2, 17, 0, 20, 0, 0));
                if (TextUtils.isEmpty(tL_starGiftUnique.slug)) {
                    i18 = 0;
                } else {
                    c8.ka.a(l9Var);
                    i18 = 0;
                    l9Var.setOnClickListener(new la(context, i7, tL_starGiftUnique, i18));
                }
                TextView b10 = c8.qa.b(context, 20.0f, i18, true, null);
                b10.setTextColor(-1);
                b10.setText(tL_starGiftUnique.title);
                vbVar.addView(b10, c8.ha.t(-2, -2, 17, 0, 1, 0, 0));
                TextView b11 = c8.qa.b(context, 13.0f, 0, false, null);
                b11.setTextColor(stargiftattributebackdrop.text_color | (-16777216));
                b11.setText(org.telegram.messenger.id.I(tL_starGiftUnique.num, "Gift2CollectionNumber"));
                vbVar.addView(b11, c8.ha.t(-2, -2, 17, 0, 5, 0, 0));
                TextView b12 = c8.qa.b(context, 18.0f, 0, true, null);
                b12.setTextColor(-1);
                TL_stars.StarsAmount starsAmount3 = starsTransaction.amount;
                b12.setText(W0(starsAmount3, TextUtils.concat(positive ? "+" : "", L0(starsAmount3), " ⭐️")));
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(b12.getText());
                if (starsTransaction.refund) {
                    I0(spannableStringBuilder, b12, org.telegram.messenger.id.L0(2131745033));
                } else if (starsTransaction.failed) {
                    I0(spannableStringBuilder, b12, org.telegram.messenger.id.L0(2131745113));
                } else if (starsTransaction.pending) {
                    I0(spannableStringBuilder, b12, org.telegram.messenger.id.L0(2131745056));
                }
                b12.setText(spannableStringBuilder);
                vbVar.addView(b12, c8.ha.t(-2, -2, 17, 0, 11, 0, 17));
                f10.addView(vbVar, c8.ha.o(-1, -2));
                f6Var2 = f6Var;
                context2 = context;
                starsTransaction2 = starsTransaction;
                linearLayout = f10;
                str = "";
                z11 = z18;
                v2VarArr = v2VarArr5;
                z13 = z15;
                tx0 tx0Var8 = new tx0(context2, f6Var2);
                starGift = starsTransaction2.stargift;
                int i20 = 4;
                if (starGift == null) {
                    TL_stars.StarsTransaction starsTransaction5 = starsTransaction2;
                    f6Var3 = f6Var2;
                    viewGroup = linearLayout;
                    TL_stars.StarsTransactionPeer starsTransactionPeer2 = starsTransaction5.peer;
                    if (starsTransactionPeer2 instanceof TL_stars.TL_starsTransactionPeer) {
                        final long o4 = org.telegram.messenger.m5.o(starsTransactionPeer2.peer);
                        if (starsTransaction5.paid_message) {
                            tx0Var8.n(org.telegram.messenger.id.L0(positive ? 2131750194 : 2131749937), i7, o4, new qa(v2VarArr, o4, 0));
                            if (starsTransaction5.starref_amount != null && starsTransaction5.starref_commission_permille > 0) {
                                tx0Var8.d(a1(starsTransaction5.amount instanceof TL_stars.TL_starsTonAmount, jg.g.m(Math.abs(Math.round(starsTransaction5.starref_amount.toDouble() + starsTransaction5.amount.toDouble())), ',', new StringBuilder("⭐️ ")), 0.8f, null), org.telegram.messenger.id.L0(2131744953));
                            }
                            i13 = i7;
                            tx0Var6 = tx0Var8;
                            v2VarArr2 = v2VarArr;
                        } else if (z10) {
                            long o10 = org.telegram.messenger.m5.o(starsTransaction5.starref_peer);
                            tx0Var8.i(org.telegram.messenger.id.L0(2131745233), org.telegram.messenger.id.L0(2131745232), new qa(v2VarArr, j3, 1));
                            tx0Var8.n(org.telegram.messenger.id.L0(2131745236), i7, o10, new qa(v2VarArr, o10, 2));
                            i13 = i7;
                            tx0Var8.n(org.telegram.messenger.id.L0(2131745231), i13, o4, new qa(v2VarArr, o4, 3));
                            tx0Var8.d(hi.j.J0(starsTransaction5.starref_commission_permille), org.telegram.messenger.id.L0(2131745235));
                            f6Var3 = f6Var;
                            v2VarArr2 = v2VarArr;
                            tx0Var6 = tx0Var8;
                        } else if (z11) {
                            f6Var3 = f6Var;
                            tx0Var8.i(org.telegram.messenger.id.L0(2131745233), org.telegram.messenger.id.L0(2131745232), new ra(i7, context, j3, o4, v2VarArr, f6Var3));
                            i13 = i7;
                            tx0Var8.n(org.telegram.messenger.id.L0(2131745234), i13, o4, new qa(v2VarArr, o4, i20));
                            context3 = context;
                            tx0Var5 = tx0Var8;
                            v2VarArr2 = v2VarArr;
                            starsTransaction3 = starsTransaction;
                            tx0Var = tx0Var5;
                        } else {
                            f6Var3 = f6Var;
                            if (z19) {
                                tx0Var8.n(org.telegram.messenger.id.L0(2131745211), i7, o4, new oa(v2VarArr, starsTransaction, o4, 1));
                                final int i21 = 2;
                                tx0Var8.n(org.telegram.messenger.id.L0(2131745210), i7, p10.i(i7).e(), new Runnable() { // from class: bi.na
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        switch (i21) {
                                            case 0:
                                                v2VarArr[0].dismiss();
                                                org.telegram.ui.ActionBar.f2 T2 = LaunchActivity.T();
                                                if (T2 != null) {
                                                    Bundle bundle = new Bundle();
                                                    bundle.putLong("user_id", p10.i(i7).e());
                                                    bundle.putBoolean("my_profile", true);
                                                    bundle.putBoolean("open_gifts", true);
                                                    T2.presentFragment(new ProfileActivity(bundle, null));
                                                    break;
                                                }
                                                break;
                                            case 1:
                                                v2VarArr[0].dismiss();
                                                org.telegram.ui.ActionBar.f2 T3 = LaunchActivity.T();
                                                if (T3 != null) {
                                                    Bundle bundle2 = new Bundle();
                                                    bundle2.putLong("user_id", p10.i(i7).e());
                                                    bundle2.putBoolean("my_profile", true);
                                                    bundle2.putBoolean("open_gifts", true);
                                                    T3.presentFragment(new ProfileActivity(bundle2, null));
                                                    break;
                                                }
                                                break;
                                            default:
                                                v2VarArr[0].dismiss();
                                                org.telegram.ui.ActionBar.f2 T4 = LaunchActivity.T();
                                                if (T4 != null) {
                                                    Bundle bundle3 = new Bundle();
                                                    bundle3.putLong("user_id", p10.i(i7).e());
                                                    bundle3.putBoolean("my_profile", true);
                                                    T4.presentFragment(new ProfileActivity(bundle3, null));
                                                    break;
                                                }
                                                break;
                                        }
                                    }
                                });
                                org.telegram.ui.ActionBar.v2[] v2VarArr6 = v2VarArr;
                                starsTransaction3 = starsTransaction;
                                tx0Var8.i(org.telegram.messenger.id.L0(2131745209), org.telegram.messenger.id.L0(2131745208), new oa(v2VarArr6, starsTransaction, o4, 2));
                                tx0Var8.d(O0(starsTransaction3.amount), org.telegram.messenger.id.L0(2131745212));
                                i13 = i7;
                                v2VarArr2 = v2VarArr6;
                                tx0Var4 = tx0Var8;
                                context3 = context;
                                tx0Var = tx0Var4;
                            } else {
                                final org.telegram.ui.ActionBar.v2[] v2VarArr7 = v2VarArr;
                                starsTransaction3 = starsTransaction;
                                if (!starsTransaction3.subscription || z9) {
                                    v2VarArr3 = v2VarArr7;
                                    if (starsTransaction3.premium_gift) {
                                        final int i22 = 1;
                                        tx0Var8.n(org.telegram.messenger.id.L0(2131749937), i7, o4, new Runnable() { // from class: bi.ta
                                            @Override // java.lang.Runnable
                                            public final void run() {
                                                int i23 = i22;
                                                Context context5 = context;
                                                long j14 = o4;
                                                org.telegram.ui.ActionBar.v2[] v2VarArr8 = v2VarArr3;
                                                switch (i23) {
                                                    case 0:
                                                        v2VarArr8[0].dismiss();
                                                        if (!t10.A(j14)) {
                                                            org.telegram.ui.ActionBar.f2 T2 = LaunchActivity.T();
                                                            if (T2 != null) {
                                                                T2.presentFragment(an.ra(j14));
                                                                break;
                                                            }
                                                        } else {
                                                            vf.c.t(context5, org.telegram.messenger.id.M0(2131744927, null));
                                                            break;
                                                        }
                                                        break;
                                                    case 1:
                                                        v2VarArr8[0].dismiss();
                                                        if (!t10.A(j14)) {
                                                            org.telegram.ui.ActionBar.f2 T3 = LaunchActivity.T();
                                                            if (T3 != null) {
                                                                T3.presentFragment(an.ra(j14));
                                                                break;
                                                            }
                                                        } else {
                                                            vf.c.t(context5, org.telegram.messenger.id.M0(2131744927, null));
                                                            break;
                                                        }
                                                        break;
                                                    default:
                                                        v2VarArr8[0].dismiss();
                                                        if (!t10.A(j14)) {
                                                            org.telegram.ui.ActionBar.f2 T4 = LaunchActivity.T();
                                                            if (T4 != null) {
                                                                T4.presentFragment(an.ra(j14));
                                                                break;
                                                            }
                                                        } else {
                                                            vf.c.t(context5, org.telegram.messenger.id.M0(2131744927, null));
                                                            break;
                                                        }
                                                        break;
                                                }
                                            }
                                        });
                                        tx0Var8.d(org.telegram.messenger.id.I(starsTransaction3.premium_gift_months, "Months"), org.telegram.messenger.id.L0(2131744937));
                                    } else if (!starsTransaction3.posts_search) {
                                        final int i23 = 2;
                                        v2VarArr2 = v2VarArr3;
                                        context3 = context;
                                        i13 = i7;
                                        tx0Var8.n(org.telegram.messenger.id.L0(2131744936), i13, o4, new Runnable() { // from class: bi.ta
                                            @Override // java.lang.Runnable
                                            public final void run() {
                                                int i232 = i23;
                                                Context context5 = context;
                                                long j14 = o4;
                                                org.telegram.ui.ActionBar.v2[] v2VarArr8 = v2VarArr3;
                                                switch (i232) {
                                                    case 0:
                                                        v2VarArr8[0].dismiss();
                                                        if (!t10.A(j14)) {
                                                            org.telegram.ui.ActionBar.f2 T2 = LaunchActivity.T();
                                                            if (T2 != null) {
                                                                T2.presentFragment(an.ra(j14));
                                                                break;
                                                            }
                                                        } else {
                                                            vf.c.t(context5, org.telegram.messenger.id.M0(2131744927, null));
                                                            break;
                                                        }
                                                        break;
                                                    case 1:
                                                        v2VarArr8[0].dismiss();
                                                        if (!t10.A(j14)) {
                                                            org.telegram.ui.ActionBar.f2 T3 = LaunchActivity.T();
                                                            if (T3 != null) {
                                                                T3.presentFragment(an.ra(j14));
                                                                break;
                                                            }
                                                        } else {
                                                            vf.c.t(context5, org.telegram.messenger.id.M0(2131744927, null));
                                                            break;
                                                        }
                                                        break;
                                                    default:
                                                        v2VarArr8[0].dismiss();
                                                        if (!t10.A(j14)) {
                                                            org.telegram.ui.ActionBar.f2 T4 = LaunchActivity.T();
                                                            if (T4 != null) {
                                                                T4.presentFragment(an.ra(j14));
                                                                break;
                                                            }
                                                        } else {
                                                            vf.c.t(context5, org.telegram.messenger.id.M0(2131744927, null));
                                                            break;
                                                        }
                                                        break;
                                                }
                                            }
                                        });
                                        tx0Var = tx0Var8;
                                    }
                                    context3 = context;
                                    i13 = i7;
                                    tx0Var2 = tx0Var8;
                                    v2VarArr2 = v2VarArr3;
                                    tx0Var = tx0Var2;
                                } else {
                                    final int i24 = 0;
                                    v2VarArr3 = v2VarArr7;
                                    tx0Var3 = tx0Var8;
                                    i13 = i7;
                                    tx0Var3.n(org.telegram.messenger.id.L0(2131745165), i13, o4, new Runnable() { // from class: bi.ta
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            int i232 = i24;
                                            Context context5 = context;
                                            long j14 = o4;
                                            org.telegram.ui.ActionBar.v2[] v2VarArr8 = v2VarArr7;
                                            switch (i232) {
                                                case 0:
                                                    v2VarArr8[0].dismiss();
                                                    if (!t10.A(j14)) {
                                                        org.telegram.ui.ActionBar.f2 T2 = LaunchActivity.T();
                                                        if (T2 != null) {
                                                            T2.presentFragment(an.ra(j14));
                                                            break;
                                                        }
                                                    } else {
                                                        vf.c.t(context5, org.telegram.messenger.id.M0(2131744927, null));
                                                        break;
                                                    }
                                                    break;
                                                case 1:
                                                    v2VarArr8[0].dismiss();
                                                    if (!t10.A(j14)) {
                                                        org.telegram.ui.ActionBar.f2 T3 = LaunchActivity.T();
                                                        if (T3 != null) {
                                                            T3.presentFragment(an.ra(j14));
                                                            break;
                                                        }
                                                    } else {
                                                        vf.c.t(context5, org.telegram.messenger.id.M0(2131744927, null));
                                                        break;
                                                    }
                                                    break;
                                                default:
                                                    v2VarArr8[0].dismiss();
                                                    if (!t10.A(j14)) {
                                                        org.telegram.ui.ActionBar.f2 T4 = LaunchActivity.T();
                                                        if (T4 != null) {
                                                            T4.presentFragment(an.ra(j14));
                                                            break;
                                                        }
                                                    } else {
                                                        vf.c.t(context5, org.telegram.messenger.id.M0(2131744927, null));
                                                        break;
                                                    }
                                                    break;
                                            }
                                        }
                                    });
                                    context3 = context;
                                    tx0Var2 = tx0Var3;
                                    v2VarArr2 = v2VarArr3;
                                    tx0Var = tx0Var2;
                                }
                            }
                        }
                        starsTransaction3 = starsTransaction5;
                        tx0Var4 = tx0Var6;
                        context3 = context;
                        tx0Var = tx0Var4;
                    } else {
                        i13 = i7;
                        tx0 tx0Var9 = tx0Var8;
                        v2VarArr2 = v2VarArr;
                        starsTransaction3 = starsTransaction5;
                        context3 = context;
                        if (starsTransactionPeer2 instanceof TL_stars.TL_starsTransactionPeerFragment) {
                            if (starsTransaction3.gift) {
                                w70 w70Var = new w70(context3, f6Var3);
                                w70Var.setPadding(org.telegram.messenger.g0.L(12.66f), org.telegram.messenger.g0.L(9.33f), org.telegram.messenger.g0.L(12.66f), org.telegram.messenger.g0.L(9.33f));
                                w70Var.setEllipsize(TextUtils.TruncateAt.END);
                                int i25 = org.telegram.ui.ActionBar.k6.Uc;
                                org.telegram.ui.ActionBar.r6.V(w70Var, i25, f6Var3);
                                org.telegram.ui.ActionBar.r6.H(w70Var, i25, f6Var3);
                                w70Var.setTextSize(1, 14.0f);
                                w70Var.setSingleLine(true);
                                w70Var.setDisablePaddingsOffsetY(true);
                                org.telegram.ui.f5 f5Var = new org.telegram.ui.f5(24.0f, i13, w70Var);
                                String L02 = org.telegram.messenger.id.L0(z13 ? 2131744931 : 2131744928);
                                xp a10 = yc.a(24, "fragment");
                                int L = org.telegram.messenger.g0.L(16.0f);
                                int L2 = org.telegram.messenger.g0.L(16.0f);
                                a10.e = L;
                                a10.f = L2;
                                f5Var.b.w0(a10);
                                SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder("x  " + ((Object) L02));
                                spannableStringBuilder2.setSpan(f5Var, 0, 1, 33);
                                spannableStringBuilder2.setSpan(new xb(v2VarArr2, context3, z13), 3, spannableStringBuilder2.length(), 33);
                                w70Var.setText(spannableStringBuilder2);
                                tx0Var9.l(w70Var, org.telegram.messenger.id.L0(2131744936));
                                tx0Var = tx0Var9;
                            } else {
                                tx0Var9.d(org.telegram.messenger.id.L0(2131750522), org.telegram.messenger.id.L0(2131744934));
                                tx0Var = tx0Var9;
                            }
                        } else if (starsTransactionPeer2 instanceof TL_stars.TL_starsTransactionPeerAppStore) {
                            tx0Var9.d(org.telegram.messenger.id.L0(2131754231), org.telegram.messenger.id.L0(2131744934));
                            tx0Var = tx0Var9;
                        } else if (starsTransactionPeer2 instanceof TL_stars.TL_starsTransactionPeerPlayMarket) {
                            tx0Var9.d(org.telegram.messenger.id.L0(2131747220), org.telegram.messenger.id.L0(2131744934));
                            tx0Var = tx0Var9;
                        } else {
                            tx0Var = tx0Var9;
                            if (starsTransactionPeer2 instanceof TL_stars.TL_starsTransactionPeerPremiumBot) {
                                tx0Var9.d(org.telegram.messenger.id.L0(2131744964), org.telegram.messenger.id.L0(2131744934));
                                tx0Var = tx0Var9;
                            }
                        }
                    }
                } else if (starsTransaction2.stargift_upgrade) {
                    if ((starsTransaction2.flags & 256) == 0 || starsTransaction2.msg_id <= 0) {
                        starsTransaction4 = starsTransaction2;
                        viewGroup = linearLayout;
                    } else {
                        org.telegram.ui.Components.jc jcVar = (org.telegram.ui.Components.jc) ((qx0) tx0Var8.d(org.telegram.messenger.id.L0(2131745223), org.telegram.messenger.id.L0(2131745230)).getChildAt(1)).getChildAt(0);
                        TL_stars.TL_inputSavedStarGiftUser tL_inputSavedStarGiftUser = new TL_stars.TL_inputSavedStarGiftUser();
                        tL_inputSavedStarGiftUser.msg_id = starsTransaction2.msg_id;
                        Context context5 = context2;
                        viewGroup = linearLayout;
                        starsTransaction4 = starsTransaction;
                        ea.w(i7).M(tL_inputSavedStarGiftUser, new ya(jcVar, i7, context5, f6Var2, 0));
                    }
                    TL_stars.StarsTransactionPeer starsTransactionPeer3 = starsTransaction4.peer;
                    if (starsTransactionPeer3 instanceof TL_stars.TL_starsTransactionPeer) {
                        long o11 = org.telegram.messenger.m5.o(((TL_stars.TL_starsTransactionPeer) starsTransactionPeer3).peer);
                        i13 = i7;
                        tx0Var8.n(org.telegram.messenger.id.L0(2131745213), i13, o11, new qa(v2VarArr, o11, 5));
                        context3 = context;
                        f6Var3 = f6Var;
                        tx0Var = tx0Var8;
                        v2VarArr2 = v2VarArr;
                        starsTransaction3 = starsTransaction4;
                    } else {
                        i13 = i7;
                        f6Var3 = f6Var;
                        tx0Var4 = tx0Var8;
                        v2VarArr2 = v2VarArr;
                        starsTransaction3 = starsTransaction4;
                        context3 = context;
                        tx0Var = tx0Var4;
                    }
                } else {
                    Context context6 = context2;
                    viewGroup = linearLayout;
                    TL_stars.StarsTransaction starsTransaction6 = starsTransaction2;
                    if (starGift instanceof TL_stars.TL_starGiftUnique) {
                        String str2 = starGift.slug;
                        if (TextUtils.isEmpty(str2)) {
                            i16 = 2131750194;
                        } else {
                            String L03 = org.telegram.messenger.id.L0(2131750193);
                            StringBuilder sb2 = new StringBuilder();
                            i16 = 2131750194;
                            sb2.append(starsTransaction6.stargift.title);
                            sb2.append(" #");
                            sb2.append(starsTransaction6.stargift.num);
                            tx0Var8.i(L03, sb2.toString(), new ai.e0(context6, i7, str2, i20));
                        }
                        final long e10 = p10.i(i7).e();
                        long o12 = org.telegram.messenger.m5.o(((TL_stars.TL_starsTransactionPeer) starsTransaction6.peer).peer);
                        if (!starsTransaction6.offer) {
                            if (starsTransaction6.stargift_resale) {
                                if (negative) {
                                    tx0Var8.d(org.telegram.messenger.id.L0(starsTransaction6.refund ? 2131745225 : 2131745227), org.telegram.messenger.id.L0(2131745230));
                                } else {
                                    tx0Var8.d(org.telegram.messenger.id.L0(starsTransaction6.refund ? 2131745227 : 2131745225), org.telegram.messenger.id.L0(2131745230));
                                    j12 = e10;
                                }
                            } else if (starsTransaction6.stargift_drop_original_details) {
                                tx0Var8.d(org.telegram.messenger.id.L0(2131745226), org.telegram.messenger.id.L0(2131745230));
                                j12 = e10;
                                o12 = j12;
                            } else {
                                tx0Var8.d(org.telegram.messenger.id.L0(2131745224), org.telegram.messenger.id.L0(2131745230));
                            }
                            j12 = o12;
                            o12 = e10;
                        } else if (negative) {
                            tx0Var8.d(org.telegram.messenger.id.L0(starsTransaction6.refund ? 2131745225 : 2131745229), org.telegram.messenger.id.L0(2131745230));
                            j12 = o12;
                            o12 = e10;
                        } else {
                            tx0Var8.d(org.telegram.messenger.id.L0(starsTransaction6.refund ? 2131745228 : 2131745225), org.telegram.messenger.id.L0(2131745230));
                            j12 = e10;
                        }
                        int i26 = (o12 > e10 ? 1 : (o12 == e10 ? 0 : -1));
                        if (i26 != 0) {
                            v2VarArr3 = v2VarArr;
                            final int i27 = 0;
                            f6Var3 = f6Var;
                            tx0Var7 = tx0Var8;
                            final long j14 = o12;
                            i17 = i26;
                            j13 = e10;
                            tx0Var7.n(org.telegram.messenger.id.L0(i16), i7, j14, new Runnable() { // from class: bi.za
                                @Override // java.lang.Runnable
                                public final void run() {
                                    switch (i27) {
                                        case 0:
                                            v2VarArr3[0].dismiss();
                                            org.telegram.ui.ActionBar.f2 T2 = LaunchActivity.T();
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
                                            v2VarArr3[0].dismiss();
                                            org.telegram.ui.ActionBar.f2 T3 = LaunchActivity.T();
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
                            f6Var3 = f6Var;
                            tx0Var7 = tx0Var8;
                            v2VarArr3 = v2VarArr;
                            i17 = i26;
                            j13 = e10;
                        }
                        if (j12 != j13) {
                            final long j15 = j13;
                            final int i28 = 1;
                            final long j16 = j12;
                            final org.telegram.ui.ActionBar.v2[] v2VarArr8 = v2VarArr3;
                            tx0Var7.n(org.telegram.messenger.id.L0(2131749937), i7, j16, new Runnable() { // from class: bi.za
                                @Override // java.lang.Runnable
                                public final void run() {
                                    switch (i28) {
                                        case 0:
                                            v2VarArr8[0].dismiss();
                                            org.telegram.ui.ActionBar.f2 T2 = LaunchActivity.T();
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
                                            v2VarArr8[0].dismiss();
                                            org.telegram.ui.ActionBar.f2 T3 = LaunchActivity.T();
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
                        tx0 tx0Var10 = tx0Var7;
                        if ((i17 == 0 || starsTransaction6.stargift_resale) && (starsAmount = starsTransaction6.starref_amount) != null && starsTransaction6.starref_commission_permille > 0) {
                            TL_stars.StarsAmount starsAmount4 = starsTransaction6.amount;
                            if ((starsAmount4 instanceof TL_stars.TL_starsTonAmount) && (starsAmount instanceof TL_stars.TL_starsTonAmount)) {
                                TL_stars.TL_starsTonAmount tL_starsTonAmount = new TL_stars.TL_starsTonAmount();
                                tL_starsTonAmount.amount = starsTransaction6.amount.amount + starsTransaction6.starref_amount.amount;
                                wp[] wpVarArr = new wp[1];
                                tx0Var10.d(Z0(starsTransaction6.amount, "⭐️ " + ((Object) L0(tL_starsTonAmount)), wpVarArr), org.telegram.messenger.id.L0(2131744953));
                                wp wpVar = wpVarArr[0];
                                if (wpVar != null) {
                                    wpVar.y = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.Ci, f6Var3);
                                }
                            } else {
                                tx0Var10.d(a1(starsTransaction6.amount instanceof TL_stars.TL_starsTonAmount, jg.g.m(Math.abs(Math.round(starsTransaction6.starref_amount.toDouble() + starsAmount4.toDouble())), ',', new StringBuilder("⭐️ ")), 0.8f, null), org.telegram.messenger.id.L0(2131744953));
                            }
                        }
                        context3 = context;
                        i13 = i7;
                        tx0Var2 = tx0Var10;
                        starsTransaction3 = starsTransaction6;
                        v2VarArr2 = v2VarArr3;
                        tx0Var = tx0Var2;
                    } else {
                        f6Var3 = f6Var;
                        final org.telegram.ui.ActionBar.v2[] v2VarArr9 = v2VarArr;
                        if (starsTransaction6.refund) {
                            context3 = context;
                            i13 = i7;
                            tx0Var5 = tx0Var8;
                            v2VarArr2 = v2VarArr9;
                            starsTransaction3 = starsTransaction;
                            tx0Var = tx0Var5;
                        } else {
                            long e11 = j3 == 0 ? p10.i(i7).e() : j3;
                            final long o13 = org.telegram.messenger.m5.o(starsTransaction6.peer.peer);
                            TLRPC.User a22 = qp.s1(i7).a2(Long.valueOf(o13));
                            if (positive) {
                                if (o13 != e11) {
                                    CharSequence L04 = org.telegram.messenger.id.L0(2131745211);
                                    Runnable oaVar = new oa(v2VarArr9, starsTransaction6, o13, 4);
                                    String L05 = (a22 == null || t10.x(a22) || t10.b(qp.s1(p10.s0).b2(o13))) ? null : org.telegram.messenger.id.L0(2131750285);
                                    final int i29 = 0;
                                    i15 = i7;
                                    Runnable runnable = new Runnable() { // from class: bi.ma
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            switch (i29) {
                                                case 0:
                                                    org.telegram.ui.ActionBar.v2 v2Var3 = v2VarArr9[0];
                                                    Objects.requireNonNull(v2Var3);
                                                    new zh.g1(context, i15, o13, null, new ai.i(v2Var3, 8)).show();
                                                    break;
                                                default:
                                                    org.telegram.ui.ActionBar.v2 v2Var4 = v2VarArr9[0];
                                                    Objects.requireNonNull(v2Var4);
                                                    new zh.g1(context, i15, o13, null, new ai.i(v2Var4, 8)).show();
                                                    break;
                                            }
                                        }
                                    };
                                    tx0Var3 = tx0Var8;
                                    v2VarArr4 = v2VarArr9;
                                    tx0Var3.m(L04, i15, o13, oaVar, L05, runnable);
                                } else {
                                    i15 = i7;
                                    tx0Var3 = tx0Var8;
                                    v2VarArr4 = v2VarArr9;
                                }
                                final int i30 = 0;
                                tx0Var3.n(org.telegram.messenger.id.L0(2131745210), i15, e11, new Runnable() { // from class: bi.na
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        switch (i30) {
                                            case 0:
                                                v2VarArr4[0].dismiss();
                                                org.telegram.ui.ActionBar.f2 T2 = LaunchActivity.T();
                                                if (T2 != null) {
                                                    Bundle bundle = new Bundle();
                                                    bundle.putLong("user_id", p10.i(i15).e());
                                                    bundle.putBoolean("my_profile", true);
                                                    bundle.putBoolean("open_gifts", true);
                                                    T2.presentFragment(new ProfileActivity(bundle, null));
                                                    break;
                                                }
                                                break;
                                            case 1:
                                                v2VarArr4[0].dismiss();
                                                org.telegram.ui.ActionBar.f2 T3 = LaunchActivity.T();
                                                if (T3 != null) {
                                                    Bundle bundle2 = new Bundle();
                                                    bundle2.putLong("user_id", p10.i(i15).e());
                                                    bundle2.putBoolean("my_profile", true);
                                                    bundle2.putBoolean("open_gifts", true);
                                                    T3.presentFragment(new ProfileActivity(bundle2, null));
                                                    break;
                                                }
                                                break;
                                            default:
                                                v2VarArr4[0].dismiss();
                                                org.telegram.ui.ActionBar.f2 T4 = LaunchActivity.T();
                                                if (T4 != null) {
                                                    Bundle bundle3 = new Bundle();
                                                    bundle3.putLong("user_id", p10.i(i15).e());
                                                    bundle3.putBoolean("my_profile", true);
                                                    T4.presentFragment(new ProfileActivity(bundle3, null));
                                                    break;
                                                }
                                                break;
                                        }
                                    }
                                });
                                v2VarArr3 = v2VarArr4;
                            } else {
                                long j17 = e11;
                                if (o13 != j17) {
                                    final int i31 = 1;
                                    tx0Var8.n(org.telegram.messenger.id.L0(2131745211), i7, j17, new Runnable() { // from class: bi.na
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            switch (i31) {
                                                case 0:
                                                    v2VarArr9[0].dismiss();
                                                    org.telegram.ui.ActionBar.f2 T2 = LaunchActivity.T();
                                                    if (T2 != null) {
                                                        Bundle bundle = new Bundle();
                                                        bundle.putLong("user_id", p10.i(i7).e());
                                                        bundle.putBoolean("my_profile", true);
                                                        bundle.putBoolean("open_gifts", true);
                                                        T2.presentFragment(new ProfileActivity(bundle, null));
                                                        break;
                                                    }
                                                    break;
                                                case 1:
                                                    v2VarArr9[0].dismiss();
                                                    org.telegram.ui.ActionBar.f2 T3 = LaunchActivity.T();
                                                    if (T3 != null) {
                                                        Bundle bundle2 = new Bundle();
                                                        bundle2.putLong("user_id", p10.i(i7).e());
                                                        bundle2.putBoolean("my_profile", true);
                                                        bundle2.putBoolean("open_gifts", true);
                                                        T3.presentFragment(new ProfileActivity(bundle2, null));
                                                        break;
                                                    }
                                                    break;
                                                default:
                                                    v2VarArr9[0].dismiss();
                                                    org.telegram.ui.ActionBar.f2 T4 = LaunchActivity.T();
                                                    if (T4 != null) {
                                                        Bundle bundle3 = new Bundle();
                                                        bundle3.putLong("user_id", p10.i(i7).e());
                                                        bundle3.putBoolean("my_profile", true);
                                                        T4.presentFragment(new ProfileActivity(bundle3, null));
                                                        break;
                                                    }
                                                    break;
                                            }
                                        }
                                    });
                                }
                                CharSequence L06 = org.telegram.messenger.id.L0(2131745210);
                                Runnable oaVar2 = new oa(v2VarArr9, starsTransaction, o13, 0);
                                String L07 = (a22 == null || t10.x(a22) || t10.b(qp.s1(p10.s0).b2(o13))) ? null : org.telegram.messenger.id.L0(2131750285);
                                final int i32 = 1;
                                Runnable runnable2 = new Runnable() { // from class: bi.ma
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        switch (i32) {
                                            case 0:
                                                org.telegram.ui.ActionBar.v2 v2Var3 = v2VarArr9[0];
                                                Objects.requireNonNull(v2Var3);
                                                new zh.g1(context, i7, o13, null, new ai.i(v2Var3, 8)).show();
                                                break;
                                            default:
                                                org.telegram.ui.ActionBar.v2 v2Var4 = v2VarArr9[0];
                                                Objects.requireNonNull(v2Var4);
                                                new zh.g1(context, i7, o13, null, new ai.i(v2Var4, 8)).show();
                                                break;
                                        }
                                    }
                                };
                                tx0Var3 = tx0Var8;
                                v2VarArr3 = v2VarArr9;
                                tx0Var3.m(L06, i7, o13, oaVar2, L07, runnable2);
                            }
                            context3 = context;
                            i13 = i7;
                            starsTransaction3 = starsTransaction;
                            tx0Var2 = tx0Var3;
                            v2VarArr2 = v2VarArr3;
                            tx0Var = tx0Var2;
                        }
                    }
                }
                starsTransactionPeer = starsTransaction3.peer;
                if ((starsTransactionPeer instanceof TL_stars.TL_starsTransactionPeer) && (starsTransaction3.flags & 256) != 0) {
                    long o14 = org.telegram.messenger.m5.o(starsTransactionPeer.peer);
                    if (z9) {
                        o14 = j3;
                    }
                    M0 = qp.s1(i13).M0(Long.valueOf(-o14));
                    if (M0 != null) {
                        w70 w70Var2 = new w70(context3, f6Var3);
                        z14 = z13;
                        w70Var2.setPadding(org.telegram.messenger.g0.L(12.66f), org.telegram.messenger.g0.L(9.33f), org.telegram.messenger.g0.L(12.66f), org.telegram.messenger.g0.L(9.33f));
                        w70Var2.setEllipsize(TextUtils.TruncateAt.END);
                        int i33 = org.telegram.ui.ActionBar.k6.Uc;
                        org.telegram.ui.ActionBar.r6.V(w70Var2, i33, f6Var3);
                        org.telegram.ui.ActionBar.r6.H(w70Var2, i33, f6Var3);
                        w70Var2.setTextSize(1, 14.0f);
                        w70Var2.setDisablePaddingsOffsetY(true);
                        SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder(str);
                        if (!starsTransaction3.extended_media.isEmpty()) {
                            ArrayList<TLRPC.MessageMedia> arrayList = starsTransaction3.extended_media;
                            int size = arrayList.size();
                            int i34 = 0;
                            int i35 = 0;
                            while (i35 < size) {
                                TLRPC.MessageMedia messageMedia = arrayList.get(i35);
                                int i36 = i35 + 1;
                                ArrayList<TLRPC.MessageMedia> arrayList2 = arrayList;
                                TLRPC.MessageMedia messageMedia2 = messageMedia;
                                int i37 = size;
                                q50 q50Var = new q50(24.0f, i13, w70Var2);
                                if (messageMedia2 instanceof TLRPC.TL_messageMediaPhoto) {
                                    viewGroup2 = viewGroup;
                                    c11 = org.telegram.messenger.hc.i(org.telegram.messenger.w7.v(org.telegram.messenger.g0.L(24.0f), messageMedia2.photo.sizes, true), messageMedia2.photo);
                                } else {
                                    viewGroup2 = viewGroup;
                                    if (messageMedia2 instanceof TLRPC.TL_messageMediaDocument) {
                                        c11 = org.telegram.messenger.hc.c(org.telegram.messenger.w7.v(org.telegram.messenger.g0.L(24.0f), messageMedia2.document.thumbs, true), messageMedia2.document);
                                    } else {
                                        hcVar2 = null;
                                        if (hcVar2 == null) {
                                            q50Var.a(6.0f);
                                            q50Var.b.q0(hcVar2, "24_24", null, null, null, 0);
                                            SpannableString spannableString = new SpannableString("x");
                                            spannableString.setSpan(q50Var, 0, spannableString.length(), 33);
                                            spannableStringBuilder3.append((CharSequence) spannableString);
                                            spannableStringBuilder3.append((CharSequence) " ");
                                            i14 = i34 + 1;
                                        } else {
                                            i14 = i34;
                                        }
                                        if (i14 < 3) {
                                            break;
                                        }
                                        size = i37;
                                        i35 = i36;
                                        i34 = i14;
                                        viewGroup = viewGroup2;
                                        arrayList = arrayList2;
                                    }
                                }
                                hcVar2 = c11;
                                if (hcVar2 == null) {
                                }
                                if (i14 < 3) {
                                }
                            }
                        }
                        viewGroup2 = viewGroup;
                        spannableStringBuilder3.append((CharSequence) " ");
                        int length = spannableStringBuilder3.length();
                        String K = org.telegram.messenger.t3.K(M0, false);
                        if (TextUtils.isEmpty(K)) {
                            spannableStringBuilder3.append((CharSequence) M0.title);
                        } else {
                            StringBuilder sb3 = new StringBuilder();
                            com.google.android.recaptcha.internal.a.s(sb3, qp.s1(i13).U2, "/", K, "/");
                            sb3.append(starsTransaction3.msg_id);
                            spannableStringBuilder3.append((CharSequence) sb3.toString());
                        }
                        oa oaVar3 = new oa(v2VarArr2, o14, starsTransaction3);
                        spannableStringBuilder3.setSpan(new yb(oaVar3), length, spannableStringBuilder3.length(), 33);
                        w70Var2.setSingleLine(true);
                        w70Var2.setEllipsize(TextUtils.TruncateAt.END);
                        w70Var2.setText(spannableStringBuilder3);
                        w70Var2.setOnClickListener(new ah.d(oaVar3, 11));
                        tx0Var.l(w70Var2, org.telegram.messenger.id.L0(starsTransaction3.reaction ? 2131744945 : 2131744946));
                        if (!TextUtils.isEmpty(starsTransaction3.id) && !z19) {
                            String L08 = org.telegram.messenger.id.L0(2131744951);
                            String str3 = starsTransaction3.id;
                            tx0Var.k(L08, str3, str3.length() <= 25 ? 9 : 10, new a4(10, v2VarArr2, f6Var3));
                        }
                        if (starsTransaction3.floodskip && starsTransaction3.floodskip_number > 0) {
                            tx0Var.d(org.telegram.messenger.id.I(starsTransaction3.floodskip_number, "StarsTransactionFloodskipNumber"), org.telegram.messenger.id.L0(2131744957));
                        }
                        tx0Var.d(org.telegram.messenger.id.Z(2131742786, org.telegram.messenger.id.E0().s0().format(new Date(starsTransaction3.date * 1000)), org.telegram.messenger.id.E0().p0().format(new Date(starsTransaction3.date * 1000))), org.telegram.messenger.id.L0(2131744963));
                        starGift2 = starsTransaction3.stargift;
                        if (starGift2 != null) {
                            if (starGift2.limited) {
                                H0(tx0Var, i13, starGift2, f6Var3);
                            }
                            if (!TextUtils.isEmpty(starsTransaction3.description)) {
                                tx0Var.a(new SpannableStringBuilder(starsTransaction3.description));
                            }
                        }
                        ViewGroup viewGroup3 = viewGroup2;
                        viewGroup3.addView(tx0Var, c8.ha.k(16.0f, 17.0f, 16.0f, 0.0f, -1, -2));
                        if ((starsTransaction3.flags & 32) != 0) {
                            tx0Var.d(org.telegram.messenger.id.Z(2131742786, org.telegram.messenger.id.E0().s0().format(new Date(starsTransaction3.transaction_date * 1000)), org.telegram.messenger.id.E0().p0().format(new Date(starsTransaction3.transaction_date * 1000))), org.telegram.messenger.id.L0(2131744932));
                        }
                        if (z14) {
                            context4 = context;
                            w70 w70Var3 = new w70(context4, f6Var3);
                            org.telegram.ui.ActionBar.r6.V(w70Var3, org.telegram.ui.ActionBar.k6.z6, f6Var3);
                            org.telegram.ui.ActionBar.r6.H(w70Var3, org.telegram.ui.ActionBar.k6.Uc, f6Var3);
                            w70Var3.setTextSize(1, 14.0f);
                            w70Var3.setText(org.telegram.messenger.g0.U2(org.telegram.messenger.id.L0(2131744929), new pa(context4, 1)));
                            w70Var3.setGravity(17);
                            viewGroup3.addView(w70Var3, c8.ha.k(16.0f, 15.0f, 16.0f, 0.0f, -1, -2));
                        } else {
                            context4 = context;
                        }
                        fi.d dVar = new fi.d(context4, f6Var3);
                        dVar.f();
                        if ((starsTransaction3.flags & 32) == 0) {
                            r13 = 0;
                            dVar.h(org.telegram.messenger.id.L0(2131744925), false);
                        } else {
                            r13 = 0;
                            dVar.h(org.telegram.messenger.id.L0(2131747832), false);
                        }
                        viewGroup3.addView(dVar, c8.ha.k(16.0f, 15.0f, 16.0f, 0.0f, -1, 48));
                        org.telegram.ui.ActionBar.v2 v2Var3 = v2Var;
                        v2Var3.N = viewGroup3;
                        v2VarArr2[r13] = v2Var3;
                        v2Var3.T0 = r13;
                        if ((starsTransaction3.flags & 32) == 0) {
                            dVar.setOnClickListener(new r(context4, starsTransaction3));
                        } else {
                            dVar.setOnClickListener(new va(v2VarArr2, r13));
                        }
                        v2VarArr2[r13].N();
                        T = LaunchActivity.T();
                        if (!org.telegram.messenger.g0.Q1() && !org.telegram.messenger.g0.u1(T)) {
                            v2VarArr2[r13].a0(T);
                        }
                        v2VarArr2[r13].show();
                        return v2VarArr2[r13];
                    }
                }
                viewGroup2 = viewGroup;
                z14 = z13;
                if (!TextUtils.isEmpty(starsTransaction3.id)) {
                    String L082 = org.telegram.messenger.id.L0(2131744951);
                    String str32 = starsTransaction3.id;
                    tx0Var.k(L082, str32, str32.length() <= 25 ? 9 : 10, new a4(10, v2VarArr2, f6Var3));
                }
                if (starsTransaction3.floodskip) {
                    tx0Var.d(org.telegram.messenger.id.I(starsTransaction3.floodskip_number, "StarsTransactionFloodskipNumber"), org.telegram.messenger.id.L0(2131744957));
                }
                tx0Var.d(org.telegram.messenger.id.Z(2131742786, org.telegram.messenger.id.E0().s0().format(new Date(starsTransaction3.date * 1000)), org.telegram.messenger.id.E0().p0().format(new Date(starsTransaction3.date * 1000))), org.telegram.messenger.id.L0(2131744963));
                starGift2 = starsTransaction3.stargift;
                if (starGift2 != null) {
                }
                ViewGroup viewGroup32 = viewGroup2;
                viewGroup32.addView(tx0Var, c8.ha.k(16.0f, 17.0f, 16.0f, 0.0f, -1, -2));
                if ((starsTransaction3.flags & 32) != 0) {
                }
                if (z14) {
                }
                fi.d dVar2 = new fi.d(context4, f6Var3);
                dVar2.f();
                if ((starsTransaction3.flags & 32) == 0) {
                }
                viewGroup32.addView(dVar2, c8.ha.k(16.0f, 15.0f, 16.0f, 0.0f, -1, 48));
                org.telegram.ui.ActionBar.v2 v2Var32 = v2Var;
                v2Var32.N = viewGroup32;
                v2VarArr2[r13] = v2Var32;
                v2Var32.T0 = r13;
                if ((starsTransaction3.flags & 32) == 0) {
                }
                v2VarArr2[r13].N();
                T = LaunchActivity.T();
                if (!org.telegram.messenger.g0.Q1()) {
                    v2VarArr2[r13].a0(T);
                }
                v2VarArr2[r13].show();
                return v2VarArr2[r13];
            }
        }
        v2Var = v2Var2;
        z10 = z17;
        final org.telegram.ui.Components.l9 l9Var2 = new org.telegram.ui.Components.l9(context);
        if (starsTransaction.premium_gift) {
            f1(l9Var2, l9Var2.getImageReceiver(), starsTransaction.premium_gift_months);
            f10.addView(l9Var2, c8.ha.t(qs.q2, qs.q2, 17, 0, -8, 0, 10));
        } else if (starsTransaction.posts_search) {
            xp a11 = org.telegram.ui.Cells.s6.a(100, "search");
            int L3 = org.telegram.messenger.g0.L(40.0f);
            int L4 = org.telegram.messenger.g0.L(40.0f);
            a11.e = L3;
            a11.f = L4;
            l9Var2.setImageDrawable(a11);
        } else {
            TL_stars.StarGift starGift4 = starsTransaction.stargift;
            if (starGift4 == null) {
                if (z19 || starsTransaction.gift) {
                    context2 = context;
                    i10 = i7;
                    starsTransaction2 = starsTransaction;
                    linearLayout = f10;
                    str = "";
                    z11 = z18;
                    z12 = z9;
                    j10 = j3;
                    f6Var2 = f6Var;
                    z13 = z15;
                    if (starsTransaction2.amount instanceof TL_stars.TL_starsTonAmount) {
                        g1(l9Var2, l9Var2.getImageReceiver(), starsTransaction2.amount.amount);
                    } else {
                        e1(l9Var2, l9Var2.getImageReceiver(), starsTransaction2.amount.amount);
                    }
                    linearLayout.addView(l9Var2, c8.ha.t(qs.q2, qs.q2, 17, 0, -8, 0, 10));
                } else if (starsTransaction.extended_media.isEmpty()) {
                    context2 = context;
                    i10 = i7;
                    starsTransaction2 = starsTransaction;
                    linearLayout = f10;
                    z12 = z9;
                    j10 = j3;
                    f6Var2 = f6Var;
                    TL_stars.StarsTransactionPeer starsTransactionPeer4 = starsTransaction2.peer;
                    if (starsTransactionPeer4 instanceof TL_stars.TL_starsTransactionPeer) {
                        if (starsTransaction2.photo != null) {
                            l9Var2.setRoundRadius(org.telegram.messenger.g0.L(50.0f));
                            z11 = z18;
                            l9Var2.p(org.telegram.messenger.hc.p(m20.c(starsTransaction2.photo)), "100_100", null, null);
                            z13 = z15;
                            str = "";
                        } else {
                            z11 = z18;
                            l9Var2.setRoundRadius(org.telegram.messenger.g0.L(50.0f));
                            if (z11) {
                                peer = starsTransaction2.starref_peer;
                            } else if (starsTransaction2.subscription && z12) {
                                z13 = z15;
                                str = "";
                                j11 = j10;
                                org.telegram.ui.Components.w8 w8Var = new org.telegram.ui.Components.w8();
                                if (j11 < 0) {
                                    TLRPC.User a23 = qp.s1(i10).a2(Long.valueOf(j11));
                                    w8Var.o(a23);
                                    l9Var2.e(a23, w8Var);
                                } else {
                                    TLRPC.Chat M02 = qp.s1(i10).M0(Long.valueOf(-j11));
                                    w8Var.m(M02);
                                    l9Var2.e(M02, w8Var);
                                }
                            } else {
                                peer = starsTransaction2.peer.peer;
                            }
                            z13 = z15;
                            str = "";
                            j11 = org.telegram.messenger.m5.o(peer);
                            org.telegram.ui.Components.w8 w8Var2 = new org.telegram.ui.Components.w8();
                            if (j11 < 0) {
                            }
                        }
                        linearLayout.addView(l9Var2, c8.ha.t(100, 100, 17, 0, 0, 0, 10));
                    } else {
                        str = "";
                        z11 = z18;
                        z13 = z15;
                        xp a12 = org.telegram.ui.Cells.s6.a(100, starsTransactionPeer4 instanceof TL_stars.TL_starsTransactionPeerAppStore ? "ios" : starsTransactionPeer4 instanceof TL_stars.TL_starsTransactionPeerPlayMarket ? "android" : starsTransactionPeer4 instanceof TL_stars.TL_starsTransactionPeerPremiumBot ? "premiumbot" : starsTransactionPeer4 instanceof TL_stars.TL_starsTransactionPeerFragment ? "fragment" : starsTransactionPeer4 instanceof TL_stars.TL_starsTransactionPeerAds ? "ads" : starsTransactionPeer4 instanceof TL_stars.TL_starsTransactionPeerAPI ? "api" : "?");
                        int L5 = org.telegram.messenger.g0.L(40.0f);
                        int L6 = org.telegram.messenger.g0.L(40.0f);
                        a12.e = L5;
                        a12.f = L6;
                        l9Var2.setImageDrawable(a12);
                    }
                } else {
                    l9Var2.setRoundRadius(org.telegram.messenger.g0.L(30.0f));
                    TLRPC.MessageMedia messageMedia3 = starsTransaction.extended_media.get(0);
                    if (messageMedia3 instanceof TLRPC.TL_messageMediaPhoto) {
                        c10 = org.telegram.messenger.hc.i(org.telegram.messenger.w7.v(org.telegram.messenger.g0.L(100.0f), messageMedia3.photo.sizes, true), messageMedia3.photo);
                    } else if (messageMedia3 instanceof TLRPC.TL_messageMediaDocument) {
                        c10 = org.telegram.messenger.hc.c(org.telegram.messenger.w7.v(org.telegram.messenger.g0.L(100.0f), messageMedia3.document.thumbs, true), messageMedia3.document);
                    } else {
                        hcVar = null;
                        l9Var2.m(hcVar, "100_100", null, null, null, 0);
                        f10.addView(l9Var2, c8.ha.t(100, 100, 17, 0, 0, 0, 10));
                        context2 = context;
                        View.OnClickListener onClickListener = new View.OnClickListener() { // from class: bi.sa
                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view) {
                                boolean z20 = z9;
                                TL_stars.StarsTransaction starsTransaction7 = starsTransaction;
                                long o15 = z20 ? j3 : org.telegram.messenger.m5.o(starsTransaction7.peer.peer);
                                ArrayList arrayList3 = new ArrayList();
                                for (int i38 = 0; i38 < starsTransaction7.extended_media.size(); i38++) {
                                    TLRPC.MessageMedia messageMedia4 = starsTransaction7.extended_media.get(i38);
                                    TLRPC.TL_message tL_message = new TLRPC.TL_message();
                                    tL_message.id = starsTransaction7.msg_id;
                                    tL_message.dialog_id = o15;
                                    TLRPC.TL_peerChannel tL_peerChannel = new TLRPC.TL_peerChannel();
                                    tL_message.from_id = tL_peerChannel;
                                    long j18 = -o15;
                                    tL_peerChannel.channel_id = j18;
                                    TLRPC.TL_peerChannel tL_peerChannel2 = new TLRPC.TL_peerChannel();
                                    tL_message.peer_id = tL_peerChannel2;
                                    tL_peerChannel2.channel_id = j18;
                                    tL_message.date = starsTransaction7.date;
                                    tL_message.flags |= 512;
                                    tL_message.media = messageMedia4;
                                    tL_message.noforwards = true;
                                    arrayList3.add(new ij(i7, tL_message, false, false));
                                }
                                if (arrayList3.isEmpty()) {
                                    return;
                                }
                                PhotoViewer.p1().H2(null, LaunchActivity.Q(), f6Var);
                                PhotoViewer.p1().Z1(arrayList3, 0, o15, 0L, 0L, new wb(l9Var2, f10, o15));
                            }
                        };
                        starsTransaction2 = starsTransaction;
                        z12 = z9;
                        f6Var2 = f6Var;
                        i10 = i7;
                        linearLayout = f10;
                        j10 = j3;
                        l9Var2.setOnClickListener(onClickListener);
                        str = "";
                        z11 = z18;
                        z13 = z15;
                    }
                    hcVar = c10;
                    l9Var2.m(hcVar, "100_100", null, null, null, 0);
                    f10.addView(l9Var2, c8.ha.t(100, 100, 17, 0, 0, 0, 10));
                    context2 = context;
                    View.OnClickListener onClickListener2 = new View.OnClickListener() { // from class: bi.sa
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            boolean z20 = z9;
                            TL_stars.StarsTransaction starsTransaction7 = starsTransaction;
                            long o15 = z20 ? j3 : org.telegram.messenger.m5.o(starsTransaction7.peer.peer);
                            ArrayList arrayList3 = new ArrayList();
                            for (int i38 = 0; i38 < starsTransaction7.extended_media.size(); i38++) {
                                TLRPC.MessageMedia messageMedia4 = starsTransaction7.extended_media.get(i38);
                                TLRPC.TL_message tL_message = new TLRPC.TL_message();
                                tL_message.id = starsTransaction7.msg_id;
                                tL_message.dialog_id = o15;
                                TLRPC.TL_peerChannel tL_peerChannel = new TLRPC.TL_peerChannel();
                                tL_message.from_id = tL_peerChannel;
                                long j18 = -o15;
                                tL_peerChannel.channel_id = j18;
                                TLRPC.TL_peerChannel tL_peerChannel2 = new TLRPC.TL_peerChannel();
                                tL_message.peer_id = tL_peerChannel2;
                                tL_peerChannel2.channel_id = j18;
                                tL_message.date = starsTransaction7.date;
                                tL_message.flags |= 512;
                                tL_message.media = messageMedia4;
                                tL_message.noforwards = true;
                                arrayList3.add(new ij(i7, tL_message, false, false));
                            }
                            if (arrayList3.isEmpty()) {
                                return;
                            }
                            PhotoViewer.p1().H2(null, LaunchActivity.Q(), f6Var);
                            PhotoViewer.p1().Z1(arrayList3, 0, o15, 0L, 0L, new wb(l9Var2, f10, o15));
                        }
                    };
                    starsTransaction2 = starsTransaction;
                    z12 = z9;
                    f6Var2 = f6Var;
                    i10 = i7;
                    linearLayout = f10;
                    j10 = j3;
                    l9Var2.setOnClickListener(onClickListener2);
                    str = "";
                    z11 = z18;
                    z13 = z15;
                }
                TextView textView = new TextView(context2);
                i11 = org.telegram.ui.ActionBar.k6.j5;
                org.telegram.messenger.k5.n(textView, i11, f6Var2, 1, 20.0f);
                textView.setGravity(17);
                textView.setText(Q0(i10, z12, starsTransaction2));
                TextView f11 = org.telegram.messenger.camera.q.f(linearLayout, textView, c8.ha.t(-1, -2, 17, 36, 0, 36, 4), context2);
                f11.setTextSize(1, 18.0f);
                f11.setTypeface(org.telegram.messenger.g0.o());
                f11.setGravity(17);
                org.telegram.ui.ActionBar.r6.V(f11, !positive ? org.telegram.ui.ActionBar.k6.ik : org.telegram.ui.ActionBar.k6.kk, f6Var2);
                TL_stars.StarsAmount starsAmount5 = starsTransaction2.amount;
                f11.setText(a1(starsAmount5 instanceof TL_stars.TL_starsTonAmount, TextUtils.concat(positive ? "+" : str, L0(starsAmount5), " ⭐️"), 0.8f, null));
                SpannableStringBuilder spannableStringBuilder4 = new SpannableStringBuilder(f11.getText());
                if (!starsTransaction2.refund) {
                    I0(spannableStringBuilder4, f11, org.telegram.messenger.id.L0(2131745033));
                } else if (starsTransaction2.failed) {
                    org.telegram.ui.ActionBar.r6.V(f11, org.telegram.ui.ActionBar.k6.kk, f6Var2);
                    I0(spannableStringBuilder4, f11, org.telegram.messenger.id.L0(2131745113));
                } else if (starsTransaction2.pending) {
                    org.telegram.ui.ActionBar.r6.V(f11, org.telegram.ui.ActionBar.k6.mk, f6Var2);
                    I0(spannableStringBuilder4, f11, org.telegram.messenger.id.L0(2131745056));
                }
                f11.setText(spannableStringBuilder4);
                linearLayout.addView(f11, c8.ha.t(-1, -2, 17, 36, 0, 36, 4));
                if (!starsTransaction2.paid_message && starsTransaction2.starref_commission_permille > 0 && positive) {
                    w70 w70Var4 = new w70(context2);
                    org.telegram.ui.ActionBar.r6.V(w70Var4, i11, f6Var2);
                    w70Var4.setTextSize(1, 14.0f);
                    w70Var4.setGravity(17);
                    org.telegram.ui.ActionBar.r6.H(w70Var4, org.telegram.ui.ActionBar.k6.Uc, f6Var2);
                    w70Var4.setDisablePaddingsOffsetY(true);
                    SpannableStringBuilder spannableStringBuilder5 = new SpannableStringBuilder();
                    spannableStringBuilder5.append((CharSequence) org.telegram.messenger.g0.X2(org.telegram.messenger.id.Z(2131744943, hi.j.J0(1000 - starsTransaction2.starref_commission_permille))));
                    if (j10 == p10.i(i10).e() || org.telegram.messenger.t3.w(2, qp.s1(i10).M0(Long.valueOf(-j10)))) {
                        spannableStringBuilder5.append((CharSequence) " ");
                        spannableStringBuilder5.append((CharSequence) org.telegram.messenger.g0.H2(org.telegram.messenger.g0.U2(org.telegram.messenger.id.L0(2131744942).replace(' ', (char) 160), new ua(j10, i10, 0)), true));
                    }
                    w70Var4.setText(spannableStringBuilder5);
                    linearLayout.addView(w70Var4, c8.ha.t(-1, -2, 17, 36, 0, 36, 4));
                    v2VarArr = v2VarArr5;
                } else if ((starsTransaction2.amount instanceof TL_stars.TL_starsTonAmount) && (z19 || starsTransaction2.gift)) {
                    TLRPC.User a24 = starsTransaction2.sent_by == null ? null : qp.s1(i10).a2(Long.valueOf(org.telegram.messenger.m5.o(starsTransaction2.sent_by)));
                    TLRPC.User a25 = starsTransaction2.sent_by == null ? null : qp.s1(i10).a2(Long.valueOf(org.telegram.messenger.m5.o(starsTransaction2.received_by)));
                    boolean B = t10.B(a24);
                    if (B) {
                        org.telegram.ui.ActionBar.r6.V(f11, org.telegram.ui.ActionBar.k6.G6, f6Var2);
                        TL_stars.StarsAmount starsAmount6 = starsTransaction2.amount;
                        i12 = 1;
                        f11.setText(a1(starsAmount6 instanceof TL_stars.TL_starsTonAmount, TextUtils.concat(L0(starsAmount6), " ⭐️"), 0.8f, null));
                    } else {
                        i12 = 1;
                    }
                    w70 w70Var5 = new w70(context2);
                    org.telegram.ui.ActionBar.r6.V(w70Var5, i11, f6Var2);
                    w70Var5.setTextSize(i12, 16.0f);
                    w70Var5.setGravity(17);
                    org.telegram.ui.ActionBar.r6.H(w70Var5, org.telegram.ui.ActionBar.k6.Uc, f6Var2);
                    w70Var5.setDisablePaddingsOffsetY(i12);
                    if (B) {
                        Object[] objArr = new Object[i12];
                        objArr[0] = t10.k(a25);
                        L0 = org.telegram.messenger.id.Z(2131754631, objArr);
                    } else {
                        L0 = org.telegram.messenger.id.L0(2131754630);
                    }
                    v2VarArr = v2VarArr5;
                    w70Var5.setText(TextUtils.concat(org.telegram.messenger.g0.X2(L0), " ", org.telegram.messenger.g0.H2(org.telegram.messenger.g0.U2(org.telegram.messenger.id.L0(2131749609).replace(' ', (char) 160), new xa(context2, v2VarArr)), true)));
                    linearLayout.addView(w70Var5, c8.ha.t(-1, -2, 17, 36, 0, 36, 4));
                } else {
                    v2VarArr = v2VarArr5;
                    if (starsTransaction2.description != null && starsTransaction2.extended_media.isEmpty()) {
                        TextView textView2 = new TextView(context2);
                        org.telegram.ui.ActionBar.r6.V(textView2, i11, f6Var2);
                        textView2.setTextSize(1, 16.0f);
                        textView2.setGravity(17);
                        textView2.setText(starsTransaction2.description);
                        linearLayout.addView(textView2, c8.ha.t(-1, -2, 17, 36, 0, 36, 4));
                    }
                }
                tx0 tx0Var82 = new tx0(context2, f6Var2);
                starGift = starsTransaction2.stargift;
                int i202 = 4;
                if (starGift == null) {
                }
                starsTransactionPeer = starsTransaction3.peer;
                if (starsTransactionPeer instanceof TL_stars.TL_starsTransactionPeer) {
                    long o142 = org.telegram.messenger.m5.o(starsTransactionPeer.peer);
                    if (z9) {
                    }
                    M0 = qp.s1(i13).M0(Long.valueOf(-o142));
                    if (M0 != null) {
                    }
                }
                viewGroup2 = viewGroup;
                z14 = z13;
                if (!TextUtils.isEmpty(starsTransaction3.id)) {
                }
                if (starsTransaction3.floodskip) {
                }
                tx0Var.d(org.telegram.messenger.id.Z(2131742786, org.telegram.messenger.id.E0().s0().format(new Date(starsTransaction3.date * 1000)), org.telegram.messenger.id.E0().p0().format(new Date(starsTransaction3.date * 1000))), org.telegram.messenger.id.L0(2131744963));
                starGift2 = starsTransaction3.stargift;
                if (starGift2 != null) {
                }
                ViewGroup viewGroup322 = viewGroup2;
                viewGroup322.addView(tx0Var, c8.ha.k(16.0f, 17.0f, 16.0f, 0.0f, -1, -2));
                if ((starsTransaction3.flags & 32) != 0) {
                }
                if (z14) {
                }
                fi.d dVar22 = new fi.d(context4, f6Var3);
                dVar22.f();
                if ((starsTransaction3.flags & 32) == 0) {
                }
                viewGroup322.addView(dVar22, c8.ha.k(16.0f, 15.0f, 16.0f, 0.0f, -1, 48));
                org.telegram.ui.ActionBar.v2 v2Var322 = v2Var;
                v2Var322.N = viewGroup322;
                v2VarArr2[r13] = v2Var322;
                v2Var322.T0 = r13;
                if ((starsTransaction3.flags & 32) == 0) {
                }
                v2VarArr2[r13].N();
                T = LaunchActivity.T();
                if (!org.telegram.messenger.g0.Q1()) {
                }
                v2VarArr2[r13].show();
                return v2VarArr2[r13];
            }
            if (starGift4 instanceof TL_stars.TL_starGiftUnique) {
                l9Var2.setImageDrawable(new u6(l9Var2, starsTransaction.stargift, 94, 0.44f));
                f10.addView(l9Var2, c8.ha.t(94, 94, 17, 0, 2, 0, 10));
            } else {
                d1(l9Var2.getImageReceiver(), starsTransaction.stargift, qs.q2);
                f10.addView(l9Var2, c8.ha.t(qs.q2, qs.q2, 17, 0, -8, 0, 10));
            }
        }
        f6Var2 = f6Var;
        context2 = context;
        i10 = i7;
        starsTransaction2 = starsTransaction;
        linearLayout = f10;
        str = "";
        z11 = z18;
        z12 = z9;
        j10 = j3;
        z13 = z15;
        TextView textView3 = new TextView(context2);
        i11 = org.telegram.ui.ActionBar.k6.j5;
        org.telegram.messenger.k5.n(textView3, i11, f6Var2, 1, 20.0f);
        textView3.setGravity(17);
        textView3.setText(Q0(i10, z12, starsTransaction2));
        TextView f112 = org.telegram.messenger.camera.q.f(linearLayout, textView3, c8.ha.t(-1, -2, 17, 36, 0, 36, 4), context2);
        f112.setTextSize(1, 18.0f);
        f112.setTypeface(org.telegram.messenger.g0.o());
        f112.setGravity(17);
        org.telegram.ui.ActionBar.r6.V(f112, !positive ? org.telegram.ui.ActionBar.k6.ik : org.telegram.ui.ActionBar.k6.kk, f6Var2);
        TL_stars.StarsAmount starsAmount52 = starsTransaction2.amount;
        f112.setText(a1(starsAmount52 instanceof TL_stars.TL_starsTonAmount, TextUtils.concat(positive ? "+" : str, L0(starsAmount52), " ⭐️"), 0.8f, null));
        SpannableStringBuilder spannableStringBuilder42 = new SpannableStringBuilder(f112.getText());
        if (!starsTransaction2.refund) {
        }
        f112.setText(spannableStringBuilder42);
        linearLayout.addView(f112, c8.ha.t(-1, -2, 17, 36, 0, 36, 4));
        if (!starsTransaction2.paid_message) {
        }
        if (starsTransaction2.amount instanceof TL_stars.TL_starsTonAmount) {
        }
        v2VarArr = v2VarArr5;
        if (starsTransaction2.description != null) {
            TextView textView22 = new TextView(context2);
            org.telegram.ui.ActionBar.r6.V(textView22, i11, f6Var2);
            textView22.setTextSize(1, 16.0f);
            textView22.setGravity(17);
            textView22.setText(starsTransaction2.description);
            linearLayout.addView(textView22, c8.ha.t(-1, -2, 17, 36, 0, 36, 4));
        }
        tx0 tx0Var822 = new tx0(context2, f6Var2);
        starGift = starsTransaction2.stargift;
        int i2022 = 4;
        if (starGift == null) {
        }
        starsTransactionPeer = starsTransaction3.peer;
        if (starsTransactionPeer instanceof TL_stars.TL_starsTransactionPeer) {
        }
        viewGroup2 = viewGroup;
        z14 = z13;
        if (!TextUtils.isEmpty(starsTransaction3.id)) {
        }
        if (starsTransaction3.floodskip) {
        }
        tx0Var.d(org.telegram.messenger.id.Z(2131742786, org.telegram.messenger.id.E0().s0().format(new Date(starsTransaction3.date * 1000)), org.telegram.messenger.id.E0().p0().format(new Date(starsTransaction3.date * 1000))), org.telegram.messenger.id.L0(2131744963));
        starGift2 = starsTransaction3.stargift;
        if (starGift2 != null) {
        }
        ViewGroup viewGroup3222 = viewGroup2;
        viewGroup3222.addView(tx0Var, c8.ha.k(16.0f, 17.0f, 16.0f, 0.0f, -1, -2));
        if ((starsTransaction3.flags & 32) != 0) {
        }
        if (z14) {
        }
        fi.d dVar222 = new fi.d(context4, f6Var3);
        dVar222.f();
        if ((starsTransaction3.flags & 32) == 0) {
        }
        viewGroup3222.addView(dVar222, c8.ha.k(16.0f, 15.0f, 16.0f, 0.0f, -1, 48));
        org.telegram.ui.ActionBar.v2 v2Var3222 = v2Var;
        v2Var3222.N = viewGroup3222;
        v2VarArr2[r13] = v2Var3222;
        v2Var3222.T0 = r13;
        if ((starsTransaction3.flags & 32) == 0) {
        }
        v2VarArr2[r13].N();
        T = LaunchActivity.T();
        if (!org.telegram.messenger.g0.Q1()) {
        }
        v2VarArr2[r13].show();
        return v2VarArr2[r13];
    }

    public static void l1(Activity activity, int i7, int i10, TLRPC.TL_messageActionPaymentRefunded tL_messageActionPaymentRefunded, org.telegram.ui.ActionBar.f6 f6Var) {
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
        k1(activity, false, 0L, i7, starsTransaction, f6Var);
    }

    public static void m1(Context context, int i7, TLRPC.TL_payments_paymentReceiptStars tL_payments_paymentReceiptStars, org.telegram.ui.ActionBar.f6 f6Var) {
        TL_stars.StarsTransaction starsTransaction = new TL_stars.StarsTransaction();
        starsTransaction.title = tL_payments_paymentReceiptStars.title;
        starsTransaction.description = tL_payments_paymentReceiptStars.description;
        starsTransaction.photo = tL_payments_paymentReceiptStars.photo;
        TL_stars.TL_starsTransactionPeer tL_starsTransactionPeer = new TL_stars.TL_starsTransactionPeer();
        starsTransaction.peer = tL_starsTransactionPeer;
        tL_starsTransactionPeer.peer = qp.s1(i7).z1(tL_payments_paymentReceiptStars.bot_id);
        starsTransaction.date = tL_payments_paymentReceiptStars.date;
        starsTransaction.amount = TL_stars.StarsAmount.ofStars(-tL_payments_paymentReceiptStars.total_amount);
        starsTransaction.id = tL_payments_paymentReceiptStars.transaction_id;
        k1(context, false, 0L, i7, starsTransaction, f6Var);
    }

    public static CharSequence s1(SpannableStringBuilder spannableStringBuilder, boolean z9) {
        a5.q c10;
        if (z9 && com.google.android.recaptcha.internal.a.u(spannableStringBuilder)) {
            for (wp wpVar : (wp[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), wp.class)) {
                Drawable drawable = wpVar.c;
                if (drawable != null && !(drawable instanceof a5.q) && (c10 = a5.q.c(org.telegram.messenger.t0.b.getResources(), R.drawable.mini_gram_72_white, null)) != null) {
                    c10.setBounds(wpVar.c.getBounds());
                    wpVar.c = c10;
                    wpVar.d = false;
                }
            }
        }
        return spannableStringBuilder;
    }

    public final void J0() {
        q1();
        pj0 pj0Var = this.c;
        if (pj0Var == null || this.U == null || pj0Var.getLayoutParams() == null) {
            return;
        }
        int C = org.telegram.messenger.camera.q.C(48.0f, this.b0, -org.telegram.messenger.g0.L(8.0f));
        int C2 = org.telegram.messenger.camera.q.C(48.0f, this.c0, -org.telegram.messenger.g0.L(8.0f));
        org.telegram.messenger.g0.B3(this.c, 0, C, 0, C2);
        pj0 pj0Var2 = this.c;
        int i7 = -C;
        pj0Var2.setPadding(pj0Var2.getPaddingLeft(), i7, this.c.getPaddingRight(), this.c0 - C2);
        this.U.z(i7, -C2);
    }

    public final void K0(ArrayList arrayList, l41 l41Var) {
        pj0 pj0Var;
        n1("FILL_BEFORE");
        ht0 ht0Var = this.U;
        boolean z9 = ht0Var != null && ht0Var.e0;
        this.a0 = -1;
        if (getParentActivity() == null) {
            return;
        }
        ea y10 = ea.y(this.currentAccount, false);
        ArrayList arrayList2 = y10.v;
        l00 l00Var = (l00) super.o0(getParentActivity());
        x31 x31Var = new x31(-2);
        x31Var.c = l00Var;
        arrayList.add(x31Var);
        arrayList.add(x31.k(this.i0));
        fi.d dVar = this.r0;
        if (dVar != null) {
            dVar.setVisibility(getMessagesController().X5 ? 0 : 8);
        }
        arrayList.add(x31.C(null));
        if (getMessagesController().g6) {
            arrayList.add(hi.f.i(-4, getThemedColor(org.telegram.ui.ActionBar.k6.ik), pn.i0(org.telegram.messenger.id.M0(2131743769, null)), org.telegram.messenger.id.M0(2131743770, null)));
            arrayList.add(x31.C(null));
        }
        if (y10.e && !arrayList2.isEmpty()) {
            arrayList.add(x31.u(org.telegram.messenger.id.M0(2131745206, null)));
            for (int i7 = 0; i7 < arrayList2.size(); i7++) {
                TL_stars.StarsSubscription starsSubscription = (TL_stars.StarsSubscription) arrayList2.get(i7);
                int i10 = vc.b;
                x31 K = x31.K(vc.class);
                K.G = starsSubscription;
                arrayList.add(K);
            }
            if (y10.x) {
                arrayList.add(x31.q(arrayList.size(), 33));
            } else if (!y10.y) {
                x31 c10 = x31.c(-3, R.drawable.arrow_more, org.telegram.messenger.id.M0(2131745205, null));
                c10.q = true;
                arrayList.add(c10);
            }
            arrayList.add(x31.C(null));
        }
        boolean N = y10.N(0);
        this.s0 = N;
        if (N) {
            this.a0 = arrayList.size();
            arrayList.add(x31.n(this.V, -2));
            if (z9 && (pj0Var = this.c) != null) {
                a3.f fVar = this.f0;
                pj0Var.removeCallbacks(fVar);
                this.c.post(fVar);
            }
        } else {
            arrayList.add(x31.m(this.g0));
        }
        n1("FILL_AFTER");
    }

    @Override // org.telegram.ui.o00, org.telegram.ui.ActionBar.f2
    public final View createView(final Context context) {
        TLRPC.TL_starsRevenueStatus tL_starsRevenueStatus;
        final int i7 = 0;
        this.G = false;
        this.E = org.telegram.messenger.g0.L(238.0f);
        ht0 ht0Var = new ht0(context);
        this.U = ht0Var;
        char c10 = 1;
        char c11 = 1;
        char c12 = 1;
        char c13 = 1;
        char c14 = 1;
        char c15 = 1;
        char c16 = 1;
        ht0Var.setDebugLoggingEnabled(true);
        this.U.setCommonInsetsManagedExternally(true);
        if (!this.d0) {
            org.telegram.ui.ActionBar.q4 q4Var = this.parentLayout;
            this.b0 = (q4Var == null || !((ActionBarLayout) q4Var).S0) ? org.telegram.messenger.g0.m : 0;
            this.c0 = org.telegram.messenger.g0.n;
        }
        this.U.setGeometry(new d6.i(this, 11));
        this.U.z(-org.telegram.messenger.camera.q.C(48.0f, this.b0, -org.telegram.messenger.g0.L(8.0f)), -org.telegram.messenger.camera.q.C(48.0f, this.c0, -org.telegram.messenger.g0.L(8.0f)));
        ht0 ht0Var2 = this.U;
        ht0Var2.getClass();
        this.V = new ec(25, context, ht0Var2);
        this.T = new cd(context, this.currentAccount, false, 0L, getClassGuid(), getResourceProvider(), this.U);
        this.g0 = new ec(i7, context, this);
        super.createView(context);
        n00 n00Var = this.s;
        getBaseSimpleGlass().f(n00Var, this.c, this.simpleActionBar, this.resourceProvider);
        this.simpleActionBar.setBackground(null);
        this.D.bringToFront();
        this.simpleActionBar.bringToFront();
        getBaseSimpleGlass().n = this.U;
        this.c.setCaptureSectionsDecoratorAllowed(true);
        this.T.setGlassEngine(this.glassEngine);
        getBaseSimpleGlass().o = new g(c15 == true ? 1 : 0, this, new f(c16 == true ? 1 : 0, n00Var));
        View view = this.T.d;
        View view2 = new View(getParentActivity());
        this.W = view2;
        view2.setAlpha(0.0f);
        ht0 ht0Var3 = this.U;
        ht0Var3.addView(this.W, ht0Var3.indexOfChild(view), c8.ha.e(-1, 0, 48));
        this.W.setBackground(getBaseSimpleGlass().a(this.W));
        ka kaVar = new ka(this, i7);
        xq xqVar = xq.h;
        te.a aVar = new te.a(0, kaVar, xqVar, 380L, false);
        this.X = aVar;
        this.Y = new te.a(1, new ka(this, c14 == true ? 1 : 0), xqVar, 380L, false);
        this.Z = new te.a(2, new ka(this, 2), xqVar, 380L, false);
        aVar.a(this.c.canScrollVertically(-1) || this.simpleActionBar.s(), false);
        this.Y.a(this.U.e0, false);
        this.c.j(new ai.b(this, 5));
        q1();
        fh.g c17 = getBaseSimpleGlass().c.c(view, null, false);
        c17.p(c8.g0.m(this.resourceProvider));
        c17.q(org.telegram.messenger.g0.L(9.66f));
        c17.r(org.telegram.messenger.g0.L(18.0f));
        view.setBackground(c17);
        org.telegram.ui.ActionBar.q4 q4Var2 = this.parentLayout;
        if (q4Var2 != null && ((ActionBarLayout) q4Var2).T0) {
            this.simpleActionBar.setBackButtonImage(R.drawable.ic_ab_close);
        }
        FrameLayout frameLayout = new FrameLayout(context);
        this.R = frameLayout;
        frameLayout.setClickable(true);
        vg.m mVar = new vg.m(context, 1, 2);
        this.S = mVar;
        vg.f fVar = mVar.b;
        fVar.z = org.telegram.ui.ActionBar.k6.Tk;
        fVar.A = org.telegram.ui.ActionBar.k6.Uk;
        fVar.b();
        this.S.setStarParticlesView(this.e);
        this.R.addView(this.S, c8.ha.d(qs.U2, 190.0f, 17, 0.0f, 12.0f, 0.0f, 24.0f));
        j0(org.telegram.messenger.id.M0(2131744218, null), org.telegram.messenger.g0.H2(org.telegram.messenger.g0.U2(org.telegram.messenger.id.M0(2131744215, null), new pa(context, i7)), true), this.R, null);
        this.c.setOverScrollMode(2);
        v4.k kVar = new v4.k();
        kVar.m = false;
        kVar.C = false;
        kVar.o(xqVar);
        kVar.n(350L);
        this.c.setItemAnimator(kVar);
        this.c.setOnItemClickListener(new ai.k(this, c13 == true ? 1 : 0));
        kz kzVar = new kz(getParentActivity());
        this.h0 = kzVar;
        this.s.addView(kzVar, c8.ha.c(-1.0f, -1));
        ea y10 = ea.y(this.currentAccount, false);
        LinearLayout linearLayout = new LinearLayout(getParentActivity());
        this.i0 = linearLayout;
        linearLayout.setOrientation(1);
        this.i0.setPadding(0, org.telegram.messenger.g0.L(24.0f), 0, org.telegram.messenger.g0.L(10.0f));
        org.telegram.ui.Components.j6 j6Var = new org.telegram.ui.Components.j6(getParentActivity(), false, true, false);
        this.k0 = j6Var;
        j6Var.setTypeface(org.telegram.messenger.g0.o());
        this.k0.setTextSize(org.telegram.messenger.g0.L(32.0f));
        this.k0.setGravity(17);
        org.telegram.ui.ActionBar.r6.Z(this.k0, org.telegram.ui.ActionBar.k6.G6, this.resourceProvider);
        this.j0 = new SpannableStringBuilder("S");
        q50 q50Var = new q50(42.0f, this.currentAccount, this.k0);
        zg0 zg0Var = new zg0(R.raw.star_reaction, org.telegram.messenger.g0.L(42.0f), org.telegram.messenger.g0.L(42.0f));
        ImageReceiver imageReceiver = q50Var.b;
        imageReceiver.w0(zg0Var);
        imageReceiver.W(2);
        q50Var.f = false;
        q50Var.h = -org.telegram.messenger.g0.L(3.0f);
        this.j0.setSpan(q50Var, 0, 1, 33);
        this.i0.addView(this.k0, c8.ha.d(-1, 40.0f, 17, 24.0f, 0.0f, 24.0f, 0.0f));
        TextView textView = new TextView(getParentActivity());
        this.l0 = textView;
        textView.setTextSize(1, 14.0f);
        this.l0.setGravity(17);
        this.l0.setText(org.telegram.messenger.id.M0(2131742793, null));
        org.telegram.ui.ActionBar.r6.V(this.l0, org.telegram.ui.ActionBar.k6.z6, this.resourceProvider);
        this.i0.addView(this.l0, c8.ha.d(-1, -2.0f, 17, 24.0f, 0.0f, 24.0f, 0.0f));
        FrameLayout frameLayout2 = new FrameLayout(getParentActivity());
        e5 e5Var = new e5(c12 == true ? 1 : 0, getParentActivity(), this);
        this.n0 = e5Var;
        frameLayout2.addView(e5Var);
        fi.d dVar = new fi.d(getParentActivity(), this.resourceProvider, true);
        this.o0 = dVar;
        dVar.f();
        this.o0.i("", false, true);
        this.o0.setOnClickListener(new View.OnClickListener(this) { // from class: bi.wa
            public final /* synthetic */ dd b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view3) {
                switch (i7) {
                    case 0:
                        dd.A0(this.b, context);
                        break;
                    default:
                        new uc(context, this.b.resourceProvider).show();
                        break;
                }
            }
        });
        this.n0.addView(this.o0, c8.ha.e(-1, 48, qs.E1));
        c61 c61Var = new c61(3, getParentActivity(), this);
        this.p0 = c61Var;
        frameLayout2.addView(c61Var);
        fi.d dVar2 = new fi.d(getParentActivity(), this.resourceProvider, true);
        this.q0 = dVar2;
        dVar2.f();
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("x  ");
        spannableStringBuilder.setSpan(new wp(R.drawable.mini_topup, 2), 0, 1, 33);
        spannableStringBuilder.append((CharSequence) org.telegram.messenger.id.M0(2131744968, null));
        this.q0.i(spannableStringBuilder, false, true);
        fi.d dVar3 = this.q0;
        final char c18 = c11 == true ? 1 : 0;
        dVar3.setOnClickListener(new View.OnClickListener(this) { // from class: bi.wa
            public final /* synthetic */ dd b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view3) {
                switch (c18) {
                    case 0:
                        dd.A0(this.b, context);
                        break;
                    default:
                        new uc(context, this.b.resourceProvider).show();
                        break;
                }
            }
        });
        this.p0.addView(this.q0, c8.ha.q(-1, 48, 17.0f, 1, 0, 0, 8, 0));
        fi.d dVar4 = new fi.d(getParentActivity(), this.resourceProvider, true);
        this.m0 = dVar4;
        dVar4.f();
        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder("x  ");
        spannableStringBuilder2.setSpan(new wp(R.drawable.mini_stats, 2), 0, 1, 33);
        spannableStringBuilder2.append((CharSequence) org.telegram.messenger.id.M0(2131745025, null));
        this.m0.i(spannableStringBuilder2, false, true);
        this.m0.setOnClickListener(new View.OnClickListener(this) { // from class: bi.fb
            public final /* synthetic */ dd b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view3) {
                switch (i7) {
                    case 0:
                        dd ddVar = this.b;
                        ddVar.presentFragment(new z(0, ddVar.getUserConfig().e()));
                        break;
                    default:
                        dd.B0(this.b);
                        break;
                }
            }
        });
        this.p0.addView(this.m0, c8.ha.q(-1, 48, 17.0f, 1, 0, 0, 0, 0));
        this.i0.addView(frameLayout2, c8.ha.d(-1, 48.0f, 17, 20.0f, 17.0f, 20.0f, 0.0f));
        fi.d dVar5 = new fi.d(getParentActivity(), this.resourceProvider, false);
        this.r0 = dVar5;
        dVar5.f();
        SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder();
        spannableStringBuilder3.append((CharSequence) "G  ");
        spannableStringBuilder3.setSpan(new wp(R.drawable.menu_stars_gift, 0), 0, 1, 33);
        spannableStringBuilder3.append((CharSequence) org.telegram.messenger.id.M0(2131744216, null));
        this.r0.i(spannableStringBuilder3, false, true);
        fi.d dVar6 = this.r0;
        final char c19 = c10 == true ? 1 : 0;
        dVar6.setOnClickListener(new View.OnClickListener(this) { // from class: bi.fb
            public final /* synthetic */ dd b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view3) {
                switch (c19) {
                    case 0:
                        dd ddVar = this.b;
                        ddVar.presentFragment(new z(0, ddVar.getUserConfig().e()));
                        break;
                    default:
                        dd.B0(this.b);
                        break;
                }
            }
        });
        this.i0.addView(this.r0, c8.ha.d(-1, 48.0f, 17, 20.0f, 8.0f, 20.0f, 0.0f));
        o1();
        hc hcVar = this.u0;
        if (hcVar != null) {
            hcVar.O(false);
        }
        n0.g(this.currentAccount).r(getUserConfig().e());
        TLRPC.TL_payments_starsRevenueStats h = n0.g(this.currentAccount).h(getUserConfig().e(), false);
        p1(y10.p().amount > 0 && h != null && (tL_starsRevenueStatus = h.status) != null && tL_starsRevenueStatus.overall_revenue.positive(), false);
        return this.fragmentView;
    }

    @Override // org.telegram.messenger.ls
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        int i11 = qs.v3;
        int i12 = qs.A3;
        int i13 = qs.z3;
        if (i7 == i13 || i7 == i12 || i7 == i11) {
            n1("NOTIFICATION_" + i7);
        }
        if (i7 == i11) {
            u0();
            hc hcVar = this.u0;
            if (hcVar != null) {
                hcVar.O(true);
            }
            h0();
            return;
        }
        if (i7 == i13) {
            ea y10 = ea.y(this.currentAccount, false);
            if (this.s0 != y10.N(0)) {
                this.s0 = y10.N(0);
                u0();
                hc hcVar2 = this.u0;
                if (hcVar2 != null) {
                    hcVar2.O(false);
                }
                h0();
                return;
            }
            return;
        }
        if (i7 == i12) {
            hc hcVar3 = this.u0;
            if (hcVar3 != null) {
                hcVar3.O(true);
                return;
            }
            return;
        }
        if (i7 == qs.y3) {
            o1();
        } else if (i7 == qs.C3 && getUserConfig().e() == ((Long) objArr[0]).longValue()) {
            o1();
        }
    }

    @Override // org.telegram.ui.o00
    public final void h0() {
        ht0 ht0Var;
        n1("RESTORE_BEFORE");
        super.h0();
        if (this.e0 && (ht0Var = this.U) != null && this.a0 != -1) {
            ht0Var.a();
        }
        this.e0 = false;
        n1("RESTORE_AFTER");
    }

    @Override // org.telegram.ui.o00
    public final void i0() {
        this.s.addView(this.U, c8.ha.c(-1.0f, -1));
        this.U.u(this.c, new ka(this, 3));
        ht0 ht0Var = this.U;
        cd cdVar = this.T;
        ht0Var.x(cdVar, cdVar.b, new a3.l(26));
        this.U.y(this.T.d);
        this.T.d.setLayoutParams(c8.ha.d(-1, -2.0f, 48, -4.0f, 0.0f, -4.0f, 0.0f));
        J0();
    }

    @Override // org.telegram.ui.o00, org.telegram.ui.ActionBar.f2
    public final boolean isSwipeBackEnabled(MotionEvent motionEvent) {
        ht0 ht0Var = this.U;
        return ht0Var == null || motionEvent == null || ht0Var.j(motionEvent.getX(), motionEvent.getY()) || !this.U.c() || this.T.b.b == 0;
    }

    @Override // org.telegram.ui.o00
    public final v4.g0 k0() {
        hc hcVar = new hc(this, this.c, getParentActivity(), this.currentAccount, this.classGuid, new ai.e(this, 8), getResourceProvider(), 0);
        this.u0 = hcVar;
        hcVar.r = false;
        return hcVar;
    }

    @Override // org.telegram.ui.o00
    public final v4.b0 l0(Context context) {
        ht0 ht0Var = this.U;
        ht0Var.getClass();
        return new jg.i0(5, ht0Var, false);
    }

    @Override // org.telegram.ui.o00
    public final ug.q1 m0() {
        return new gc(getParentActivity(), 75, 1, 0);
    }

    public final void n1(String str) {
        if (this.U == null) {
            return;
        }
        StringBuilder u10 = a8.p0.u("Stars event=", str, " row=");
        u10.append(this.a0);
        u10.append(" hasTransactions=");
        u10.append(this.s0);
        u10.append(" savedPosition=");
        u10.append(this.P);
        u10.append(" savedOffset=");
        u10.append(this.Q);
        u10.append(" savedPinned=");
        u10.append(this.e0);
        u10.append(" boundaryAttached=");
        ec ecVar = this.V;
        u10.append((ecVar == null || ecVar.getParent() == null) ? false : true);
        u10.append(" boundaryTop=");
        ec ecVar2 = this.V;
        u10.append(ecVar2 == null ? 0 : ecVar2.getTop());
        u10.append(" boundaryHeight=");
        ec ecVar3 = this.V;
        u10.append(ecVar3 == null ? 0 : ecVar3.getHeight());
        Log.d("SiblingScroll", u10.toString());
        ht0 ht0Var = this.U;
        if (ht0Var.a) {
            ht0Var.b = Math.max(ht0Var.b, Math.min(60, Math.max(0, 30)));
            ht0Var.f(str, null, 0, 0, true);
        }
    }

    @Override // org.telegram.ui.o00
    public final View o0(Context context) {
        throw null;
    }

    public final void o1() {
        TLRPC.TL_starsRevenueStatus tL_starsRevenueStatus;
        boolean z9 = false;
        ea y10 = ea.y(this.currentAccount, false);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) this.j0);
        spannableStringBuilder.append((CharSequence) M0(y10.p(), 0.66f, ' '));
        this.k0.setText(spannableStringBuilder);
        this.o0.i(org.telegram.messenger.id.M0(y10.p().amount > 0 ? 2131745153 : 2131745154, null), true, true);
        TLRPC.TL_payments_starsRevenueStats h = n0.g(this.currentAccount).h(getUserConfig().e(), false);
        if (h != null && (tL_starsRevenueStatus = h.status) != null && tL_starsRevenueStatus.overall_revenue.positive()) {
            z9 = true;
        }
        p1(z9, true);
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final boolean onFragmentCreate() {
        qs.f(this.currentAccount).c(this, qs.v3);
        qs.f(this.currentAccount).c(this, qs.y3);
        qs.f(this.currentAccount).c(this, qs.z3);
        qs.f(this.currentAccount).c(this, qs.A3);
        qs.f(this.currentAccount).c(this, qs.C3);
        ea.y(this.currentAccount, false).S(true);
        ea.y(this.currentAccount, false).R();
        ea.y(this.currentAccount, false).z();
        return super.onFragmentCreate();
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final void onFragmentDestroy() {
        pj0 pj0Var = this.c;
        if (pj0Var != null) {
            pj0Var.removeCallbacks(this.f0);
        }
        super.onFragmentDestroy();
        qs.f(this.currentAccount).n(this, qs.v3);
        qs.f(this.currentAccount).n(this, qs.y3);
        qs.f(this.currentAccount).n(this, qs.z3);
        qs.f(this.currentAccount).n(this, qs.A3);
        qs.f(this.currentAccount).n(this, qs.C3);
    }

    @Override // org.telegram.ui.o00, org.telegram.ui.ActionBar.f2
    public final void onInsets(int i7, int i10, int i11, int i12) {
        this.d0 = true;
        this.b0 = i10;
        this.c0 = i12;
        J0();
    }

    @Override // org.telegram.ui.o00, org.telegram.ui.ActionBar.f2
    public final void onPause() {
        super.onPause();
        vg.m mVar = this.S;
        if (mVar != null) {
            mVar.setPaused(true);
            this.S.setDialogVisible(true);
        }
    }

    @Override // org.telegram.ui.o00, org.telegram.ui.ActionBar.f2
    public final void onResume() {
        super.onResume();
        vg.m mVar = this.S;
        if (mVar != null) {
            mVar.setPaused(false);
            this.S.setDialogVisible(false);
        }
    }

    public final void p1(final boolean z9, boolean z10) {
        this.t0 = z9;
        if (z10) {
            this.n0.setVisibility(0);
            this.p0.setVisibility(0);
            final int i7 = 0;
            this.n0.animate().alpha(z9 ? 0.0f : 1.0f).withEndAction(new Runnable(this) { // from class: bi.qb
                public final /* synthetic */ dd b;

                {
                    this.b = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    switch (i7) {
                        case 0:
                            if (z9) {
                                this.b.n0.setVisibility(8);
                                break;
                            }
                            break;
                        default:
                            if (!z9) {
                                this.b.p0.setVisibility(8);
                                break;
                            }
                            break;
                    }
                }
            }).start();
            final int i10 = 1;
            this.p0.animate().alpha(z9 ? 1.0f : 0.0f).withEndAction(new Runnable(this) { // from class: bi.qb
                public final /* synthetic */ dd b;

                {
                    this.b = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    switch (i10) {
                        case 0:
                            if (z9) {
                                this.b.n0.setVisibility(8);
                                break;
                            }
                            break;
                        default:
                            if (!z9) {
                                this.b.p0.setVisibility(8);
                                break;
                            }
                            break;
                    }
                }
            }).start();
            return;
        }
        this.n0.animate().cancel();
        this.p0.animate().cancel();
        this.p0.setAlpha(z9 ? 1.0f : 0.0f);
        this.n0.setAlpha(z9 ? 0.0f : 1.0f);
        this.p0.setVisibility(z9 ? 0 : 8);
        this.n0.setVisibility(z9 ? 8 : 0);
    }

    @Override // org.telegram.ui.o00
    public final float q0() {
        pj0 pj0Var = this.c;
        if (pj0Var == null) {
            return 0.0f;
        }
        return pj0Var.getY();
    }

    public final void q1() {
        if (this.W == null) {
            return;
        }
        int L = org.telegram.messenger.g0.L(44.0f) + org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + this.b0;
        ViewGroup.LayoutParams layoutParams = this.W.getLayoutParams();
        if (layoutParams.height != L) {
            layoutParams.height = L;
            this.W.setLayoutParams(layoutParams);
        }
        r1();
    }

    @Override // org.telegram.ui.o00
    public final View r0() {
        return this.U;
    }

    public final void r1() {
        View view = this.W;
        if (view == null) {
            return;
        }
        te.a aVar = this.X;
        float f10 = aVar == null ? 0.0f : aVar.e;
        te.a aVar2 = this.Y;
        view.setTranslationY(((-(1.0f - f10)) * org.telegram.ui.ActionBar.k.getCurrentActionBarHeight()) - ((1.0f - (aVar2 != null ? aVar2.e : 0.0f)) * org.telegram.messenger.g0.L(44.0f)));
    }

    @Override // org.telegram.ui.o00
    public final void s0(boolean z9) {
        te.a aVar = this.Z;
        if (aVar == null || aVar.f == z9) {
            return;
        }
        aVar.a(z9, true);
    }

    @Override // org.telegram.ui.o00
    public final void u0() {
        n1("SAVE_BEFORE");
        super.u0();
        ht0 ht0Var = this.U;
        this.e0 = ht0Var != null && ht0Var.e0;
        pj0 pj0Var = this.c;
        if (pj0Var != null && this.P >= 0) {
            this.Q -= pj0Var.getPaddingTop();
        }
        n1("SAVE_AFTER");
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final boolean useSimpleActionBar() {
        return true;
    }
}
