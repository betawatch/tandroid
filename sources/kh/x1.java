package kh;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.text.TextUtils;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import lh.ea;
import lh.ja;
import lh.l8;
import lh.t7;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.DocumentObject;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.UserObject;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Components.cp0;
import org.telegram.ui.Components.k01;
import org.telegram.ui.Components.lp;
import org.telegram.ui.Components.m70;
import org.telegram.ui.Components.mq;
import org.telegram.ui.Components.nq;
import org.telegram.ui.Components.nr;
import org.telegram.ui.Components.p9;
import org.telegram.ui.Components.z8;
import org.telegram.ui.yh;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes.dex */
public class x1 extends FrameLayout {
    public static final int[] i0 = {-2781403, -3635939};
    public FrameLayout.LayoutParams B;
    public final eg.s1 C;
    public final eg.s1 D;
    public final TextView E;
    public final TextView F;
    public final dg.u2 G;
    public final eg.h0 H;
    public final TextView I;
    public final TextView J;
    public l8 K;
    public k01 L;
    public k01 M;
    public final Rect N;
    public boolean O;
    public boolean P;
    public boolean Q;
    public final org.telegram.ui.Components.z5 R;
    public eg.n S;
    public TL_stars.StarGift T;
    public boolean U;
    public boolean V;
    public TL_stars.SavedStarGift W;
    public final int a;
    public boolean a0;
    public final org.telegram.ui.ActionBar.f6 b;
    public boolean b0;
    public final cp0 c;
    public boolean c0;
    public final FrameLayout d;
    public boolean d0;
    public final u1 e;
    public eg.n e0;
    public final y1 f;
    public TLRPC.Document f0;
    public TL_stars.SavedStarGift g0;
    public final z8 h;
    public lp h0;
    public final p9 n;
    public final FrameLayout.LayoutParams r;
    public final FrameLayout.LayoutParams s;
    public final FrameLayout v;
    public final ImageView w;
    public final TextView x;
    public final p9 y;

    public x1(Context context, int i10, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context);
        this.N = new Rect();
        this.R = new org.telegram.ui.Components.z5(this, 0L, 320L, nr.h);
        this.a = i10;
        this.b = f6Var;
        k7.d6.b(this, 0.04f, 1.5f);
        this.c = new cp0(this);
        FrameLayout frameLayout = new FrameLayout(context);
        this.d = frameLayout;
        u1 u1Var = new u1(frameLayout, f6Var, true);
        this.e = u1Var;
        frameLayout.setBackground(u1Var);
        addView(frameLayout, k7.b6.e(-1, -1, 119));
        y1 y1Var = new y1(context);
        this.f = y1Var;
        addView(y1Var, k7.b6.d(-2, -2.0f, 53, 0.0f, 2.0f, 1.0f, 0.0f));
        p9 p9Var = new p9(context);
        this.y = p9Var;
        p9Var.getImageReceiver().setAutoRepeat(0);
        FrameLayout.LayoutParams d = k7.b6.d(80, 80.0f, 17, 0.0f, 12.0f, 0.0f, 12.0f);
        this.B = d;
        frameLayout.addView(p9Var, d);
        eg.s1 s1Var = new eg.s1(context, 3, f6Var);
        this.C = s1Var;
        s1Var.setImageReceiver(p9Var.getImageReceiver());
        frameLayout.addView(s1Var, k7.b6.d(30, 30.0f, 49, 0.0f, 38.0f, 0.0f, 0.0f));
        eg.s1 s1Var2 = new eg.s1(context, 4, f6Var);
        this.D = s1Var2;
        s1Var2.setImageReceiver(p9Var.getImageReceiver());
        frameLayout.addView(s1Var2, k7.b6.e(44, 44, 17));
        s1Var2.setAlpha(0.0f);
        s1Var2.setScaleX(0.3f);
        s1Var2.setScaleY(0.3f);
        s1Var2.setVisibility(8);
        TextView textView = new TextView(context);
        this.E = textView;
        int i11 = j6.G6;
        textView.setTextColor(j6.v0(i11, f6Var));
        textView.setGravity(17);
        yh.p(14.0f, 1, textView);
        TextView i12 = yh.i(frameLayout, textView, k7.b6.d(-1, -2.0f, 48, 0.0f, 89.0f, 0.0f, 0.0f), context);
        this.F = i12;
        i12.setTextColor(j6.v0(i11, f6Var));
        i12.setGravity(17);
        i12.setTextSize(1, 12.0f);
        frameLayout.addView(i12, k7.b6.d(-1, -2.0f, 48, 0.0f, 107.0f, 0.0f, 0.0f));
        dg.u2 u2Var = new dg.u2(this, context, 6);
        this.G = u2Var;
        TextView textView2 = new TextView(context);
        this.I = textView2;
        textView2.setTextSize(1, 12.0f);
        textView2.setTypeface(AndroidUtilities.bold());
        textView2.setPadding(AndroidUtilities.dp(10.0f), 0, AndroidUtilities.dp(10.0f), 0);
        textView2.setGravity(17);
        textView2.setTextColor(-13397548);
        frameLayout.addView(u2Var, k7.b6.d(-2, -2.0f, 81, 0.0f, 0.0f, 0.0f, 11.0f));
        eg.h0 h0Var = new eg.h0(context, 1);
        this.H = h0Var;
        h0Var.setBackgroundColor(-16776961);
        u2Var.addView(h0Var, k7.b6.c(0.0f, 0));
        u2Var.addView(textView2, k7.b6.e(-2, 26, 17));
        h0Var.setBackground(new d2(j6.I.q() ? 518759725 : 1088989954));
        TextView textView3 = new TextView(context);
        this.J = textView3;
        textView3.setTextSize(1, 10.66f);
        textView3.setGravity(17);
        textView3.setTextColor(j6.I.q() ? -1333971 : -2722014);
        textView3.setVisibility(8);
        frameLayout.addView(textView3, k7.b6.d(-2, -2.0f, 49, 0.0f, 161.0f, 0.0f, 8.0f));
        this.h = new z8((org.telegram.ui.ActionBar.f6) null);
        p9 p9Var2 = new p9(context);
        this.n = p9Var2;
        p9Var2.setRoundRadius(AndroidUtilities.dp(20.0f));
        p9Var2.setVisibility(8);
        FrameLayout.LayoutParams d10 = k7.b6.d(20, 20.0f, 51, 2.0f, 2.0f, 2.0f, 2.0f);
        this.r = d10;
        frameLayout.addView(p9Var2, d10);
        this.s = k7.b6.d(20, 20.0f, 51, 5.0f, 5.0f, 2.0f, 2.0f);
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.v = frameLayout2;
        frameLayout2.setAlpha(0.0f);
        frameLayout2.setScaleX(0.3f);
        frameLayout2.setScaleY(0.3f);
        frameLayout2.setVisibility(8);
        ImageView imageView = new ImageView(context);
        imageView.setImageResource(R.drawable.msg_limit_pin);
        imageView.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        imageView.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
        frameLayout2.addView(imageView, k7.b6.a(12.66f, 12.66f, 17));
        frameLayout.addView(frameLayout2, k7.b6.d(20, 20.0f, 51, 2.0f, 2.0f, 2.0f, 2.0f));
        ImageView imageView2 = new ImageView(context);
        this.w = imageView2;
        imageView2.setImageResource(R.drawable.mini_gram_14);
        imageView2.setPadding(0, AndroidUtilities.dp(2.0f), 0, 0);
        imageView2.setVisibility(8);
        imageView2.setScaleType(ImageView.ScaleType.CENTER);
        frameLayout.addView(imageView2, k7.b6.d(20, 20.0f, 51, 3.0f, 3.0f, 3.0f, 3.0f));
        TextView textView4 = new TextView(context);
        this.x = textView4;
        textView4.setTextSize(1, 10.0f);
        textView4.setTypeface(AndroidUtilities.bold());
        textView4.setPadding(AndroidUtilities.dp(5.0f), 0, AndroidUtilities.dp(5.0f), 0);
        textView4.setGravity(17);
        textView4.setTextColor(-1);
        frameLayout.addView(textView4, k7.b6.d(-2, 17.0f, 51, 4.0f, 4.0f, 0.0f, 0.0f));
        textView4.setVisibility(8);
        setImportantForAccessibility(1);
        frameLayout.setImportantForAccessibility(4);
        y1Var.setImportantForAccessibility(2);
    }

    private TL_stars.TL_starGiftUnique getUniqueStarGift() {
        TL_stars.SavedStarGift savedStarGift = this.W;
        if (savedStarGift == null) {
            return null;
        }
        TL_stars.StarGift starGift = savedStarGift.gift;
        if (starGift instanceof TL_stars.TL_starGiftUnique) {
            return (TL_stars.TL_starGiftUnique) starGift;
        }
        return null;
    }

    public final void a(m70 m70Var, Canvas canvas, float f10, float f11, float f12) {
        float f13;
        float f14;
        Canvas canvas2 = canvas;
        canvas2.save();
        canvas2.scale(getScaleX(), getScaleY(), f10 / 2.0f, f11 / 2.0f);
        TL_stars.TL_starGiftUnique uniqueStarGift = getUniqueStarGift();
        float dp = uniqueStarGift != null ? AndroidUtilities.dp(63.0f) * f12 : 0.0f;
        u1 u1Var = this.e;
        u1Var.setBounds(0, 0, (int) f10, (int) f11);
        u1Var.b(canvas2, f12);
        u1Var.getPadding(this.N);
        float lerp = AndroidUtilities.lerp(AndroidUtilities.dp(80.0f), AndroidUtilities.dp(120.0f), f12);
        p9 p9Var = this.y;
        float f15 = f11 - dp;
        p9Var.getImageReceiver().setImageCoords((f10 - lerp) / 2.0f, (f15 - lerp) / 2.0f, lerp, lerp);
        p9Var.getImageReceiver().draw(canvas2);
        if (p9Var.getImageReceiver().isLottieRunning()) {
            m70Var.invalidate();
        }
        eg.s1 s1Var = this.C;
        if (s1Var.getVisibility() != 0 || s1Var.getAlpha() <= 0.0f) {
            f13 = 1.0f;
        } else {
            canvas2.save();
            canvas2.translate((f10 - s1Var.getMeasuredWidth()) / 2.0f, AndroidUtilities.lerp(s1Var.getY(), (f15 - s1Var.getMeasuredHeight()) / 2.0f, f12));
            f13 = 1.0f;
            canvas2.saveLayerAlpha(0.0f, 0.0f, s1Var.getWidth(), s1Var.getHeight(), (int) (s1Var.getAlpha() * (1.0f - f12) * 255.0f), 31);
            s1Var.draw(canvas2);
            canvas2.restore();
            canvas2.restore();
        }
        FrameLayout frameLayout = this.v;
        if (frameLayout.getVisibility() == 0 && frameLayout.getAlpha() > 0.0f) {
            canvas2.save();
            canvas2.translate(AndroidUtilities.dp(2.0f) + r14.left, AndroidUtilities.dp(2.0f) + r14.top);
            canvas2.saveLayerAlpha(0.0f, 0.0f, frameLayout.getWidth(), frameLayout.getHeight(), (int) (frameLayout.getAlpha() * 255.0f), 31);
            frameLayout.draw(canvas2);
            canvas2.restore();
            canvas2.restore();
        }
        p9 p9Var2 = this.n;
        if (p9Var2.getVisibility() == 0 && p9Var2.getAlpha() > 0.0f) {
            canvas2.save();
            canvas2.translate(AndroidUtilities.dp(2.0f) + r14.left, AndroidUtilities.dp(2.0f) + r14.top);
            p9Var2.draw(canvas2);
            canvas2.restore();
        }
        y1 y1Var = this.f;
        if (y1Var.getVisibility() != 0 || y1Var.getAlpha() <= 0.0f) {
            f14 = 1.0f;
        } else {
            canvas2.save();
            canvas2.translate(f10 - AndroidUtilities.dp(f13), AndroidUtilities.dp(2.0f));
            f14 = 1.0f;
            float lerp2 = AndroidUtilities.lerp(1.0f, 1.25f, f12);
            canvas2.scale(lerp2, lerp2);
            canvas2.translate(-y1Var.getWidth(), 0.0f);
            y1Var.draw(canvas2);
            canvas2.restore();
        }
        if (uniqueStarGift != null) {
            if (this.L == null) {
                this.L = new k01(uniqueStarGift.title, 20.0f, AndroidUtilities.bold());
            }
            if (this.M == null) {
                this.M = new k01(LocaleController.formatPluralStringComma("Gift2CollectionNumber", uniqueStarGift.num), 13.0f, null);
            }
            k01 k01Var = this.L;
            k01Var.p = f10 - AndroidUtilities.dp(8.0f);
            float f16 = f14 - f12;
            k01Var.c((f10 - this.L.l()) / 2.0f, ((f11 - AndroidUtilities.dp(40.0f)) - (this.L.j() / 2.0f)) + (AndroidUtilities.dp(50.0f) * f16), f12, -1, canvas);
            k01 k01Var2 = this.M;
            k01Var2.p = f10 - AndroidUtilities.dp(8.0f);
            k01Var2.c((f10 - this.M.l()) / 2.0f, ((f11 - AndroidUtilities.dp(19.0f)) - (this.M.j() / 2.0f)) + (AndroidUtilities.dp(50.0f) * f16), 0.6f * f12, -1, canvas);
            canvas2 = canvas;
        }
        dg.u2 u2Var = this.G;
        if (u2Var != null && u2Var.getVisibility() == 0) {
            canvas2.save();
            canvas2.translate(u2Var.getX(), u2Var.getY());
            canvas2.saveLayerAlpha(0.0f, 0.0f, u2Var.getWidth(), u2Var.getHeight(), (int) (u2Var.getAlpha() * (f14 - f12) * 255.0f), 31);
            u2Var.draw(canvas2);
            canvas2.restore();
            canvas2.restore();
        }
        ImageView imageView = this.w;
        if (imageView != null && imageView.getVisibility() == 0) {
            canvas2.save();
            canvas2.translate(imageView.getX(), imageView.getY());
            canvas2.saveLayerAlpha(0.0f, 0.0f, imageView.getWidth(), imageView.getHeight(), (int) (imageView.getAlpha() * (f14 - f12) * 255.0f), 31);
            imageView.draw(canvas2);
            canvas2.restore();
            canvas2.restore();
        }
        canvas2.restore();
    }

    public final void b(boolean z4, boolean z10) {
        if (this.h0 == null) {
            lp lpVar = new lp(getContext(), 21, null);
            this.h0 = lpVar;
            lpVar.b(-1, j6.d6, j6.k7);
            this.h0.setDrawUnchecked(false);
            this.d.addView(this.h0, k7.b6.d(24, 24.0f, 51, 4.0f, 4.0f, 4.0f, 4.0f));
        }
        this.n.setVisibility(8);
        this.h0.a(z4, z10);
    }

    public final void c(boolean z4, boolean z10) {
        TL_stars.SavedStarGift savedStarGift;
        if (this.O == z4) {
            return;
        }
        this.O = z4;
        boolean z11 = false;
        FrameLayout frameLayout = this.v;
        if (z10) {
            frameLayout.setVisibility(0);
            frameLayout.animate().alpha(z4 ? 1.0f : 0.0f).scaleX(z4 ? 1.0f : 0.3f).scaleY(z4 ? 1.0f : 0.3f).withEndAction(new v1(this, z4, 1)).start();
        } else {
            frameLayout.setVisibility(z4 ? 0 : 8);
            frameLayout.setAlpha(z4 ? 1.0f : 0.0f);
            frameLayout.setScaleX(z4 ? 1.0f : 0.3f);
            frameLayout.setScaleY(z4 ? 1.0f : 0.3f);
        }
        if (!this.O && this.Q && !this.c0 && (savedStarGift = this.W) != null && (savedStarGift.gift instanceof TL_stars.TL_starGiftUnique)) {
            z11 = true;
        }
        f(z11, z10);
        j();
    }

    public final void d(boolean z4, boolean z10) {
        TL_stars.SavedStarGift savedStarGift;
        if (this.Q == z4) {
            return;
        }
        this.Q = z4;
        if (!z10) {
            this.R.a(z4);
        }
        invalidate();
        f((this.O || !z4 || this.c0 || (savedStarGift = this.W) == null || !(savedStarGift.gift instanceof TL_stars.TL_starGiftUnique)) ? false : true, z10);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        canvas.save();
        canvas.translate(getWidth() / 2.0f, getHeight() / 2.0f);
        float e = this.R.e(this.Q);
        if (e > 0.0f) {
            this.c.a(canvas, e);
        }
        canvas.translate((-getWidth()) / 2.0f, (-getHeight()) / 2.0f);
        super.dispatchDraw(canvas);
        canvas.restore();
    }

    public final void e(boolean z4, boolean z10) {
        this.e.f(z4, z10);
        ImageView imageView = this.w;
        if (z10) {
            imageView.animate().translationX(z4 ? AndroidUtilities.dp(6.0f) : 0.0f).translationY(z4 ? AndroidUtilities.dp(6.0f) : 0.0f).setDuration(320L).setInterpolator(nr.h).start();
            return;
        }
        imageView.animate().cancel();
        imageView.setTranslationX(z4 ? AndroidUtilities.dp(6.0f) : 0.0f);
        imageView.setTranslationY(z4 ? AndroidUtilities.dp(6.0f) : 0.0f);
    }

    public final void f(boolean z4, boolean z10) {
        if (this.P == z4) {
            return;
        }
        this.P = z4;
        eg.s1 s1Var = this.D;
        if (z10) {
            s1Var.setVisibility(0);
            s1Var.animate().alpha(z4 ? 1.0f : 0.0f).scaleX(z4 ? 1.0f : 0.3f).scaleY(z4 ? 1.0f : 0.3f).withEndAction(new v1(this, z4, 0)).start();
        } else {
            s1Var.setVisibility(z4 ? 0 : 8);
            s1Var.setAlpha(z4 ? 1.0f : 0.0f);
            s1Var.setScaleX(z4 ? 1.0f : 0.3f);
            s1Var.setScaleY(z4 ? 1.0f : 0.3f);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:105:0x02a7  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x02a9  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x01bf  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0280  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x02ca  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x02f1  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0303  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x030f  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0328  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x033c  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0313  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x02f5  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x02ce  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void g(TL_stars.StarGift starGift, boolean z4, boolean z10, boolean z11, boolean z12, boolean z13) {
        String str;
        long j10;
        long j11;
        long j12;
        boolean z14;
        boolean z15;
        long j13;
        boolean z16;
        l8 l8Var = this.K;
        ColorFilter colorFilter = null;
        if (l8Var != null) {
            l8Var.run();
            this.K = null;
        }
        i(starGift, starGift.getDocument());
        TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop = (TL_stars.starGiftAttributeBackdrop) t7.l(starGift.attributes, TL_stars.starGiftAttributeBackdrop.class);
        u1 u1Var = this.e;
        u1Var.d(stargiftattributebackdrop);
        u1Var.e((TL_stars.starGiftAttributePattern) t7.l(starGift.attributes, TL_stars.starGiftAttributePattern.class));
        boolean z17 = starGift.auction;
        int[] iArr = i0;
        org.telegram.ui.ActionBar.f6 f6Var = this.b;
        if (!z17 || (((z16 = starGift.sold_out) && !this.U) || (z11 && starGift.availability_resale > 0))) {
            if (!starGift.require_premium || (z11 && starGift.availability_resale > 0)) {
                iArr = null;
            }
            u1Var.g(iArr);
        } else if (z16) {
            int i10 = j6.Mi;
            u1Var.g(new int[]{j6.v0(i10, f6Var), j6.v0(i10, f6Var)});
        } else {
            u1Var.g(iArr);
        }
        this.E.setVisibility(8);
        this.F.setVisibility(8);
        p9 p9Var = this.y;
        p9Var.setTranslationY(0.0f);
        this.C.setVisibility(8);
        int i11 = starGift.resale_ton_only ? 0 : 8;
        ImageView imageView = this.w;
        imageView.setVisibility(i11);
        int i12 = z13 ? 0 : 8;
        TextView textView = this.x;
        textView.setVisibility(i12);
        textView.setTranslationX(starGift.resale_ton_only ? AndroidUtilities.dp(23.0f) : 0.0f);
        textView.setTranslationY(starGift.resale_ton_only ? AndroidUtilities.dp(1.0f) : 0.0f);
        if (z13) {
            StringBuilder sb = new StringBuilder("+");
            int i13 = starGift.craft_chance_permille;
            sb.append((Object) (i13 <= 0 ? "<0.1%" : rh.k.G0(i13)));
            textView.setText(sb.toString());
        }
        FrameLayout.LayoutParams layoutParams = this.B;
        layoutParams.gravity = 49;
        p9Var.setLayoutParams(layoutParams);
        int i14 = this.a;
        p9 p9Var2 = this.n;
        if (!z12) {
            if ((!z11 || starGift.availability_resale <= 0) && starGift.locked_until_date > ConnectionsManager.getInstance(i14).getCurrentTime()) {
                p9Var2.setVisibility(0);
                p9Var2.setLayoutParams(this.s);
                p9Var2.setColorFilter(new PorterDuffColorFilter(j6.v0(j6.wj, f6Var), PorterDuff.Mode.SRC_IN));
                p9Var2.setImageResource(R.drawable.mini_gift_lock);
                int i15 = (z13 || z12) ? 0 : 8;
                TextView textView2 = this.I;
                textView2.setVisibility(i15);
                textView2.setTextSize(1, 12.0f);
                eg.h0 h0Var = this.H;
                if (!z4) {
                    textView2.setPadding(AndroidUtilities.dp(10.0f), 0, AndroidUtilities.dp(10.0f), 0);
                    textView2.setText(LocaleController.getString(R.string.Gift2TransferMine));
                    int v = stargiftattributebackdrop != null ? j6.v(stargiftattributebackdrop.center_color | (-16777216), j6.l1(0.55f, stargiftattributebackdrop.pattern_color | (-16777216))) : 1090519039;
                    int dp = AndroidUtilities.dp(13.0f);
                    int v10 = j6.v(v, 822083583);
                    int i16 = v;
                    h0Var.setBackground(j6.i0(dp, dp, dp, dp, i16, v10, v10));
                    textView2.setTextColor(-1);
                    imageView.setColorFilter(-1);
                    int dp2 = AndroidUtilities.dp(10.0f);
                    int v11 = j6.v(i16, 822083583);
                    imageView.setBackground(j6.i0(dp2, dp2, dp2, dp2, i16, v11, v11));
                } else if (z12) {
                    textView2.setPadding(AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(10.0f), 0);
                    long resellStars = starGift.getResellStars();
                    int v12 = j6.v(stargiftattributebackdrop.center_color | (-16777216), j6.l1(0.55f, stargiftattributebackdrop.pattern_color | (-16777216)));
                    textView2.setText(ja.Q0("XTR " + LocaleController.formatNumber(resellStars, ',')));
                    h0Var.setBackground(new d2(1895825407, v12));
                    textView2.setTextColor(-1);
                    imageView.setColorFilter(-1);
                    imageView.setBackground(j6.b0(AndroidUtilities.dp(10.0f), v12));
                    textView.setBackground(j6.b0(AndroidUtilities.dp(9.0f), v12));
                } else {
                    textView2.setPadding(AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(10.0f), 0);
                    if (z11) {
                        long j14 = starGift.availability_resale;
                        if (j14 > 0) {
                            str = "+";
                            long j15 = starGift.resell_min_stars;
                            if (j14 > 1) {
                                j13 = j15;
                                if (j13 < MessagesController.getInstance(i14).config.starsStarGiftResaleAmountMax.get()) {
                                    j12 = j13;
                                    z14 = true;
                                    if (starGift.auction || starGift.availability_resale != 0) {
                                        StringBuilder sb2 = new StringBuilder("XTR ");
                                        sb2.append(LocaleController.formatNumber(j12, ','));
                                        sb2.append(z14 ? str : "");
                                        textView2.setText(ja.X0(false, sb2.toString(), 0.71f, null));
                                    } else {
                                        textView2.setText(LocaleController.getString(starGift.sold_out ? R.string.Gift2AuctionPriceView : R.string.Gift2AuctionPriceJoin));
                                    }
                                    z15 = starGift instanceof TL_stars.TL_starGiftUnique;
                                    int i17 = 518759725;
                                    h0Var.setBackground(new d2(z15 ? 1090519039 : j6.I.q() ? 518759725 : 1088989954));
                                    textView2.setTextColor(j6.I.q() ? -1333971 : -2722014);
                                    imageView.setColorFilter(j6.I.q() ? -1333971 : -2722014);
                                    int dp3 = AndroidUtilities.dp(10.0f);
                                    if (z15) {
                                        i17 = 1090519039;
                                    } else if (!j6.I.q()) {
                                        i17 = 1088989954;
                                    }
                                    imageView.setBackground(j6.b0(dp3, i17));
                                    textView.setBackground(j6.b0(AndroidUtilities.dp(9.0f), stargiftattributebackdrop != null ? j6.v(stargiftattributebackdrop.center_color | (-16777216), j6.l1(0.55f, stargiftattributebackdrop.pattern_color | (-16777216))) : 0));
                                }
                            } else {
                                j13 = j15;
                            }
                            j12 = j13;
                            z14 = false;
                            if (starGift.auction) {
                            }
                            StringBuilder sb22 = new StringBuilder("XTR ");
                            sb22.append(LocaleController.formatNumber(j12, ','));
                            sb22.append(z14 ? str : "");
                            textView2.setText(ja.X0(false, sb22.toString(), 0.71f, null));
                            z15 = starGift instanceof TL_stars.TL_starGiftUnique;
                            int i172 = 518759725;
                            h0Var.setBackground(new d2(z15 ? 1090519039 : j6.I.q() ? 518759725 : 1088989954));
                            textView2.setTextColor(j6.I.q() ? -1333971 : -2722014);
                            imageView.setColorFilter(j6.I.q() ? -1333971 : -2722014);
                            int dp32 = AndroidUtilities.dp(10.0f);
                            if (z15) {
                            }
                            imageView.setBackground(j6.b0(dp32, i172));
                            textView.setBackground(j6.b0(AndroidUtilities.dp(9.0f), stargiftattributebackdrop != null ? j6.v(stargiftattributebackdrop.center_color | (-16777216), j6.l1(0.55f, stargiftattributebackdrop.pattern_color | (-16777216))) : 0));
                        }
                    }
                    str = "+";
                    long j16 = starGift.stars;
                    if (z10 && starGift.can_upgrade) {
                        j10 = j16;
                        j11 = starGift.upgrade_stars;
                    } else {
                        j10 = j16;
                        j11 = 0;
                    }
                    j12 = j10 + j11;
                    z14 = false;
                    if (starGift.auction) {
                    }
                    StringBuilder sb222 = new StringBuilder("XTR ");
                    sb222.append(LocaleController.formatNumber(j12, ','));
                    sb222.append(z14 ? str : "");
                    textView2.setText(ja.X0(false, sb222.toString(), 0.71f, null));
                    z15 = starGift instanceof TL_stars.TL_starGiftUnique;
                    int i1722 = 518759725;
                    h0Var.setBackground(new d2(z15 ? 1090519039 : j6.I.q() ? 518759725 : 1088989954));
                    textView2.setTextColor(j6.I.q() ? -1333971 : -2722014);
                    imageView.setColorFilter(j6.I.q() ? -1333971 : -2722014);
                    int dp322 = AndroidUtilities.dp(10.0f);
                    if (z15) {
                    }
                    imageView.setBackground(j6.b0(dp322, i1722));
                    textView.setBackground(j6.b0(AndroidUtilities.dp(9.0f), stargiftattributebackdrop != null ? j6.v(stargiftattributebackdrop.center_color | (-16777216), j6.l1(0.55f, stargiftattributebackdrop.pattern_color | (-16777216))) : 0));
                }
                dg.u2 u2Var = this.G;
                ((ViewGroup.MarginLayoutParams) u2Var.getLayoutParams()).topMargin = AndroidUtilities.dp(103.0f);
                ((FrameLayout.LayoutParams) u2Var.getLayoutParams()).gravity = 49;
                this.J.setVisibility(8);
                this.e0 = null;
                this.S = null;
                this.T = starGift;
                this.V = z4;
                this.W = null;
                this.a0 = z11;
                this.b0 = z12;
                this.c0 = false;
                this.d0 = z13;
                this.L = null;
                this.M = null;
                c(false, false);
                j();
            }
            colorFilter = null;
        }
        p9Var2.setColorFilter(colorFilter);
        p9Var2.setVisibility(8);
        if (z13) {
        }
        TextView textView22 = this.I;
        textView22.setVisibility(i15);
        textView22.setTextSize(1, 12.0f);
        eg.h0 h0Var2 = this.H;
        if (!z4) {
        }
        dg.u2 u2Var2 = this.G;
        ((ViewGroup.MarginLayoutParams) u2Var2.getLayoutParams()).topMargin = AndroidUtilities.dp(103.0f);
        ((FrameLayout.LayoutParams) u2Var2.getLayoutParams()).gravity = 49;
        this.J.setVisibility(8);
        this.e0 = null;
        this.S = null;
        this.T = starGift;
        this.V = z4;
        this.W = null;
        this.a0 = z11;
        this.b0 = z12;
        this.c0 = false;
        this.d0 = z13;
        this.L = null;
        this.M = null;
        c(false, false);
        j();
    }

    public TL_stars.StarGift getGift() {
        return this.T;
    }

    public long getGiftId() {
        TL_stars.StarGift starGift = this.T;
        if (starGift != null) {
            return starGift.id;
        }
        return 0L;
    }

    public eg.n getPremiumTier() {
        return this.S;
    }

    public TL_stars.SavedStarGift getSavedGift() {
        return this.W;
    }

    public final boolean h(TL_stars.SavedStarGift savedStarGift, boolean z4, boolean z10) {
        long j10;
        boolean z11;
        boolean z12;
        l8 l8Var = this.K;
        if (l8Var != null) {
            l8Var.run();
            this.K = null;
        }
        i(savedStarGift, savedStarGift.gift.getDocument());
        TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop = (TL_stars.starGiftAttributeBackdrop) t7.l(savedStarGift.gift.attributes, TL_stars.starGiftAttributeBackdrop.class);
        u1 u1Var = this.e;
        u1Var.d(stargiftattributebackdrop);
        u1Var.e((TL_stars.starGiftAttributePattern) t7.l(savedStarGift.gift.attributes, TL_stars.starGiftAttributePattern.class));
        u1Var.g(null);
        this.E.setVisibility(8);
        this.F.setVisibility(8);
        p9 p9Var = this.y;
        p9Var.setTranslationY(0.0f);
        eg.s1 s1Var = this.C;
        s1Var.E = true;
        s1Var.F = false;
        s1Var.invalidate();
        s1Var.setBlendWithColor(stargiftattributebackdrop != null ? Integer.valueOf(j6.l1(0.75f, stargiftattributebackdrop.center_color | (-16777216))) : null);
        eg.s1 s1Var2 = this.D;
        s1Var2.E = true;
        s1Var2.F = false;
        s1Var2.invalidate();
        s1Var2.setBlendWithColor(stargiftattributebackdrop != null ? Integer.valueOf(j6.l1(0.75f, stargiftattributebackdrop.center_color | (-16777216))) : null);
        int i10 = savedStarGift.gift.resale_ton_only ? 0 : 8;
        ImageView imageView = this.w;
        imageView.setVisibility(i10);
        FrameLayout frameLayout = this.v;
        if (stargiftattributebackdrop != null) {
            frameLayout.setBackground(j6.K(AndroidUtilities.dp(20.0f), j6.b(0.1f, -0.2f, stargiftattributebackdrop.center_color | (-16777216))));
        } else {
            frameLayout.setBackground(j6.K(AndroidUtilities.dp(20.0f), j6.v0(j6.Oh, this.b)));
        }
        FrameLayout.LayoutParams layoutParams = this.B;
        layoutParams.gravity = 17;
        p9Var.setLayoutParams(layoutParams);
        if (this.g0 == savedStarGift) {
            s1Var.setVisibility(0);
            s1Var.animate().alpha(savedStarGift.unsaved ? 1.0f : 0.0f).scaleX(savedStarGift.unsaved ? 1.0f : 0.4f).scaleY(savedStarGift.unsaved ? 1.0f : 0.4f).setDuration(350L).setInterpolator(nr.h).withEndAction(new gf.c(22, this, savedStarGift)).start();
        } else {
            s1Var.setAlpha(savedStarGift.unsaved ? 1.0f : 0.0f);
            s1Var.setScaleX(savedStarGift.unsaved ? 1.0f : 0.4f);
            s1Var.setScaleY(savedStarGift.unsaved ? 1.0f : 0.4f);
            s1Var.setVisibility(savedStarGift.unsaved ? 0 : 8);
        }
        boolean z13 = savedStarGift.gift instanceof TL_stars.TL_starGiftUnique;
        p9 p9Var2 = this.n;
        p9Var2.setColorFilter(null);
        p9Var2.setLayoutParams(this.r);
        int i11 = this.a;
        if (z13 && savedStarGift.name_hidden) {
            p9Var2.setVisibility(8);
            j10 = 0;
        } else if (savedStarGift.name_hidden) {
            p9Var2.setVisibility(0);
            nq a2 = ea.a(44, "anonymous");
            j10 = 0;
            int dp = AndroidUtilities.dp(16.0f);
            int dp2 = AndroidUtilities.dp(16.0f);
            a2.e = dp;
            a2.f = dp2;
            p9Var2.setImageDrawable(a2);
        } else {
            j10 = 0;
            long peerDialogId = DialogObject.getPeerDialogId(savedStarGift.from_id);
            z8 z8Var = this.h;
            if (peerDialogId > 0) {
                TLRPC.User user = MessagesController.getInstance(i11).getUser(Long.valueOf(peerDialogId));
                if (user != null) {
                    p9Var2.setVisibility(0);
                    z8Var.r(user);
                    p9Var2.e(user, z8Var);
                } else {
                    p9Var2.setVisibility(8);
                }
            } else {
                TLRPC.Chat chat = MessagesController.getInstance(i11).getChat(Long.valueOf(-peerDialogId));
                if (chat != null) {
                    p9Var2.setVisibility(0);
                    z8Var.q(chat);
                    p9Var2.e(chat, z8Var);
                } else {
                    p9Var2.setVisibility(8);
                }
            }
        }
        eg.h0 h0Var = this.H;
        dg.u2 u2Var = this.G;
        TextView textView = this.I;
        if (stargiftattributebackdrop == null || savedStarGift.gift.resell_amount == null) {
            z11 = true;
            if (z4) {
                textView.setVisibility(8);
                this.B.topMargin = AndroidUtilities.dp(12.0f);
                this.B.bottomMargin = AndroidUtilities.dp(12.0f);
            } else {
                textView.setVisibility(0);
                FrameLayout.LayoutParams layoutParams2 = this.B;
                layoutParams2.topMargin = 0;
                layoutParams2.bottomMargin = 0;
            }
            if (z13) {
                textView.setPadding(AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f), 0);
                textView.setTextSize(1, 12.0f);
                textView.setText(LocaleController.getString(R.string.Gift2PriceUnique));
                z12 = z13;
            } else {
                textView.setPadding(AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(10.0f), 0);
                textView.setTextSize(1, 12.0f);
                StringBuilder sb = new StringBuilder("XTR ");
                TL_stars.StarGift starGift = savedStarGift.gift;
                long j11 = starGift.stars;
                z12 = z13;
                long j12 = savedStarGift.convert_stars;
                if (j12 <= j10) {
                    j12 = starGift.convert_stars;
                }
                textView.setText(ja.X0(false, a2.l(Math.max(j11, j12), ',', sb), 0.66f, null));
            }
            textView.setTextColor(z12 ? -1 : j6.I.q() ? -1333971 : -4229632);
            int i12 = 1088989954;
            h0Var.setBackground(new d2(z12 ? 1090519039 : j6.I.q() ? 518759725 : 1088989954));
            int dp3 = AndroidUtilities.dp(10.0f);
            if (z12) {
                i12 = 1090519039;
            } else if (j6.I.q()) {
                i12 = 518759725;
            }
            imageView.setBackground(j6.b0(dp3, i12));
            imageView.setColorFilter(z12 ? -1 : j6.I.q() ? -1333971 : -4229632);
            ((FrameLayout.LayoutParams) u2Var.getLayoutParams()).gravity = 49;
            ((ViewGroup.MarginLayoutParams) u2Var.getLayoutParams()).topMargin = AndroidUtilities.dp(103.0f);
        } else {
            textView.setVisibility(0);
            FrameLayout.LayoutParams layoutParams3 = this.B;
            layoutParams3.topMargin = 0;
            layoutParams3.bottomMargin = 0;
            textView.setPadding(AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(10.0f), 0);
            textView.setTextSize(1, 12.0f);
            mq[] mqVarArr = new mq[1];
            TL_stars.StarGift starGift2 = savedStarGift.gift;
            if (starGift2.resale_ton_only && DialogObject.getPeerDialogId(starGift2.owner_id) == UserConfig.getInstance(i11).getClientUserId()) {
                z11 = true;
                textView.setText(ja.U0(true, "XTR " + ((Object) ja.J0(savedStarGift.gift.getResellAmount(mf.b.b).o(), 1.0f, ',')), 0.95f, mqVarArr, 0.0f, 1.0f));
            } else {
                z11 = true;
                textView.setText(ja.R0("XTR " + LocaleController.formatNumber(savedStarGift.gift.getResellStars(), ','), 0.95f, mqVarArr));
            }
            mq mqVar = mqVarArr[0];
            if (mqVar != null) {
                mqVar.translate(0.0f, AndroidUtilities.dp(0.5f));
            }
            int v = j6.v(stargiftattributebackdrop.center_color | (-16777216), j6.l1(0.55f, stargiftattributebackdrop.pattern_color | (-16777216)));
            h0Var.setBackground(new d2(1895825407, v));
            textView.setTextColor(-1);
            imageView.setBackground(j6.b0(AndroidUtilities.dp(10.0f), v));
            imageView.setColorFilter(-1);
            ((FrameLayout.LayoutParams) u2Var.getLayoutParams()).gravity = 49;
            ((ViewGroup.MarginLayoutParams) u2Var.getLayoutParams()).topMargin = AndroidUtilities.dp(79.0f);
            z12 = z13;
        }
        this.J.setVisibility(8);
        this.g0 = savedStarGift;
        this.e0 = null;
        TL_stars.SavedStarGift savedStarGift2 = this.W;
        this.S = null;
        this.T = null;
        this.V = false;
        this.W = savedStarGift;
        this.a0 = false;
        this.b0 = false;
        this.c0 = z10;
        this.L = null;
        this.M = null;
        c(savedStarGift.pinned_to_top && (!z12 || savedStarGift.name_hidden), savedStarGift2 == savedStarGift);
        j();
        if (savedStarGift2 == savedStarGift) {
            return z11;
        }
        return false;
    }

    public final void i(TLObject tLObject, TLRPC.Document document) {
        p9 p9Var = this.y;
        if (document == null) {
            p9Var.b();
            this.f0 = null;
        } else {
            if (this.f0 == document) {
                return;
            }
            this.f0 = document;
            TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(document.thumbs, AndroidUtilities.dp(100.0f));
            p9Var.l(ImageLocation.getForDocument(document), "80_80_nolimit_pcache", ImageLocation.getForDocument(closestPhotoSizeWithSize, document), "80_80_nolimit_pcache", DocumentObject.getSvgThumb(document, j6.a7, 0.3f), tLObject);
        }
    }

    public final void j() {
        TL_stars.SavedStarGift savedStarGift = this.W;
        org.telegram.ui.ActionBar.f6 f6Var = this.b;
        y1 y1Var = this.f;
        if (savedStarGift != null) {
            TL_stars.StarGift starGift = savedStarGift.gift;
            if (!(starGift instanceof TL_stars.TL_starGiftUnique)) {
                if (!starGift.limited) {
                    y1Var.setBackdrop(null);
                    y1Var.setVisibility(8);
                    return;
                }
                y1Var.setVisibility(0);
                y1Var.setColor(j6.v0(j6.Li, f6Var));
                y1Var.setStrokeColor(0);
                y1Var.setBackdrop(null);
                y1Var.b(LocaleController.formatString(R.string.Gift2Limited1OfRibbon, AndroidUtilities.formatWholeNumber(this.W.gift.availability_total, 0)), true);
                return;
            }
            y1Var.setVisibility(0);
            if (this.W.gift.resell_amount == null) {
                y1Var.setColor(j6.v0(j6.Li, f6Var));
                y1Var.setStrokeColor(0);
                y1Var.setBackdrop((TL_stars.starGiftAttributeBackdrop) t7.l(this.W.gift.attributes, TL_stars.starGiftAttributeBackdrop.class));
                y1Var.b(a2.l(this.W.gift.num, ',', new StringBuilder("#")), true);
                return;
            }
            int v = j6.v(j6.v0(j6.d6, f6Var), j6.l1(0.04f, j6.v0(j6.G6, f6Var)));
            y1Var.setColor(j6.v0(j6.uj, f6Var));
            y1Var.setStrokeColor(v);
            y1Var.setBackdrop(null);
            y1Var.b(LocaleController.getString(R.string.Gift2OnSale), false);
            return;
        }
        TL_stars.StarGift starGift2 = this.T;
        if (starGift2 == null) {
            eg.n nVar = this.S;
            if (nVar != null) {
                if (nVar.b() <= 0) {
                    y1Var.setVisibility(8);
                    y1Var.setBackdrop(null);
                    y1Var.setStrokeColor(0);
                    return;
                }
                y1Var.setVisibility(0);
                y1Var.setBackdrop(null);
                y1Var.a(-2535425, -8229377);
                y1Var.setStrokeColor(0);
                String formatString = LocaleController.formatString(R.string.GiftPremiumOptionDiscount, Integer.valueOf(this.S.b()));
                y1Var.b = formatString;
                y1Var.a.e(12, formatString, true);
                return;
            }
            return;
        }
        if (this.b0 || this.d0) {
            y1Var.setVisibility(0);
            y1Var.setColor(j6.v0(j6.Li, f6Var));
            y1Var.setBackdrop((TL_stars.starGiftAttributeBackdrop) t7.l(this.T.attributes, TL_stars.starGiftAttributeBackdrop.class));
            y1Var.setStrokeColor(0);
            y1Var.b(a2.l(this.T.num, ',', new StringBuilder("#")), true);
            return;
        }
        if (this.a0 && starGift2.availability_resale > 0) {
            y1Var.setVisibility(0);
            y1Var.setColor(j6.v0(j6.uj, f6Var));
            y1Var.setStrokeColor(0);
            y1Var.setBackdrop(null);
            y1Var.b(LocaleController.getString(R.string.Gift2Resale), false);
            return;
        }
        if (this.V) {
            y1Var.setVisibility(0);
            y1Var.setColor(j6.v0(j6.Li, f6Var));
            y1Var.setStrokeColor(0);
            y1Var.setBackdrop((TL_stars.starGiftAttributeBackdrop) t7.l(this.T.attributes, TL_stars.starGiftAttributeBackdrop.class));
            y1Var.b(LocaleController.formatString(R.string.Gift2Limited1OfRibbon, AndroidUtilities.formatWholeNumber(this.T.availability_issued, 0)), true);
            return;
        }
        boolean z4 = starGift2.limited;
        if (z4 && starGift2.availability_remains <= 0) {
            y1Var.setVisibility(0);
            y1Var.setColor(j6.v0(j6.Mi, f6Var));
            y1Var.setStrokeColor(0);
            y1Var.setBackdrop(null);
            y1Var.b(LocaleController.getString(R.string.Gift2SoldOut), true);
            return;
        }
        if (starGift2.auction) {
            y1Var.setVisibility(0);
            y1Var.setBackdrop(null);
            y1Var.a(-2650077, -4227818);
            y1Var.setStrokeColor(0);
            if (this.T.auction_start_date > ConnectionsManager.getInstance(this.a).getCurrentTime()) {
                y1Var.b(LocaleController.getString(R.string.Gift2LimitedAuctionSoon), true);
                return;
            } else {
                y1Var.b(LocaleController.getString(R.string.Gift2LimitedAuction), true);
                return;
            }
        }
        if (starGift2.require_premium) {
            y1Var.setVisibility(0);
            y1Var.setBackdrop(null);
            y1Var.a(-2650077, -4227818);
            y1Var.setStrokeColor(0);
            y1Var.b(LocaleController.getString(R.string.Gift2LimitedPremium), true);
            return;
        }
        if (!z4) {
            y1Var.setBackdrop(null);
            y1Var.setStrokeColor(0);
            y1Var.setVisibility(8);
        } else {
            y1Var.setVisibility(0);
            y1Var.setColor(j6.v0(j6.Li, f6Var));
            y1Var.setStrokeColor(0);
            y1Var.setBackdrop(null);
            y1Var.b(LocaleController.getString(R.string.Gift2LimitedRibbon), true);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0071 A[Catch: Exception -> 0x0161, TryCatch #0 {Exception -> 0x0161, blocks: (B:5:0x0017, B:10:0x0025, B:12:0x002b, B:14:0x0035, B:15:0x006b, B:17:0x0071, B:18:0x0077, B:21:0x0080, B:23:0x0086, B:25:0x0090, B:28:0x009e, B:30:0x00a4, B:32:0x00ae, B:33:0x00b4, B:35:0x00b8, B:39:0x00c2, B:41:0x00c8, B:43:0x00d2, B:44:0x00dc, B:46:0x00e0, B:48:0x00e4, B:49:0x00f0, B:51:0x00f4, B:53:0x00fa, B:55:0x00fe, B:57:0x0102, B:59:0x0108, B:64:0x011a, B:66:0x0128, B:67:0x013e, B:69:0x0144, B:70:0x012d, B:72:0x013c, B:73:0x014a, B:75:0x014e, B:77:0x0154, B:78:0x015a, B:83:0x003a, B:85:0x003e, B:87:0x0042, B:89:0x0046, B:91:0x004e, B:92:0x0055, B:94:0x0059, B:96:0x005d, B:98:0x0065), top: B:4:0x0017 }] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0080 A[Catch: Exception -> 0x0161, TRY_ENTER, TryCatch #0 {Exception -> 0x0161, blocks: (B:5:0x0017, B:10:0x0025, B:12:0x002b, B:14:0x0035, B:15:0x006b, B:17:0x0071, B:18:0x0077, B:21:0x0080, B:23:0x0086, B:25:0x0090, B:28:0x009e, B:30:0x00a4, B:32:0x00ae, B:33:0x00b4, B:35:0x00b8, B:39:0x00c2, B:41:0x00c8, B:43:0x00d2, B:44:0x00dc, B:46:0x00e0, B:48:0x00e4, B:49:0x00f0, B:51:0x00f4, B:53:0x00fa, B:55:0x00fe, B:57:0x0102, B:59:0x0108, B:64:0x011a, B:66:0x0128, B:67:0x013e, B:69:0x0144, B:70:0x012d, B:72:0x013c, B:73:0x014a, B:75:0x014e, B:77:0x0154, B:78:0x015a, B:83:0x003a, B:85:0x003e, B:87:0x0042, B:89:0x0046, B:91:0x004e, B:92:0x0055, B:94:0x0059, B:96:0x005d, B:98:0x0065), top: B:4:0x0017 }] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x009e A[Catch: Exception -> 0x0161, TRY_ENTER, TryCatch #0 {Exception -> 0x0161, blocks: (B:5:0x0017, B:10:0x0025, B:12:0x002b, B:14:0x0035, B:15:0x006b, B:17:0x0071, B:18:0x0077, B:21:0x0080, B:23:0x0086, B:25:0x0090, B:28:0x009e, B:30:0x00a4, B:32:0x00ae, B:33:0x00b4, B:35:0x00b8, B:39:0x00c2, B:41:0x00c8, B:43:0x00d2, B:44:0x00dc, B:46:0x00e0, B:48:0x00e4, B:49:0x00f0, B:51:0x00f4, B:53:0x00fa, B:55:0x00fe, B:57:0x0102, B:59:0x0108, B:64:0x011a, B:66:0x0128, B:67:0x013e, B:69:0x0144, B:70:0x012d, B:72:0x013c, B:73:0x014a, B:75:0x014e, B:77:0x0154, B:78:0x015a, B:83:0x003a, B:85:0x003e, B:87:0x0042, B:89:0x0046, B:91:0x004e, B:92:0x0055, B:94:0x0059, B:96:0x005d, B:98:0x0065), top: B:4:0x0017 }] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00ae A[Catch: Exception -> 0x0161, TryCatch #0 {Exception -> 0x0161, blocks: (B:5:0x0017, B:10:0x0025, B:12:0x002b, B:14:0x0035, B:15:0x006b, B:17:0x0071, B:18:0x0077, B:21:0x0080, B:23:0x0086, B:25:0x0090, B:28:0x009e, B:30:0x00a4, B:32:0x00ae, B:33:0x00b4, B:35:0x00b8, B:39:0x00c2, B:41:0x00c8, B:43:0x00d2, B:44:0x00dc, B:46:0x00e0, B:48:0x00e4, B:49:0x00f0, B:51:0x00f4, B:53:0x00fa, B:55:0x00fe, B:57:0x0102, B:59:0x0108, B:64:0x011a, B:66:0x0128, B:67:0x013e, B:69:0x0144, B:70:0x012d, B:72:0x013c, B:73:0x014a, B:75:0x014e, B:77:0x0154, B:78:0x015a, B:83:0x003a, B:85:0x003e, B:87:0x0042, B:89:0x0046, B:91:0x004e, B:92:0x0055, B:94:0x0059, B:96:0x005d, B:98:0x0065), top: B:4:0x0017 }] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00b8 A[Catch: Exception -> 0x0161, TRY_LEAVE, TryCatch #0 {Exception -> 0x0161, blocks: (B:5:0x0017, B:10:0x0025, B:12:0x002b, B:14:0x0035, B:15:0x006b, B:17:0x0071, B:18:0x0077, B:21:0x0080, B:23:0x0086, B:25:0x0090, B:28:0x009e, B:30:0x00a4, B:32:0x00ae, B:33:0x00b4, B:35:0x00b8, B:39:0x00c2, B:41:0x00c8, B:43:0x00d2, B:44:0x00dc, B:46:0x00e0, B:48:0x00e4, B:49:0x00f0, B:51:0x00f4, B:53:0x00fa, B:55:0x00fe, B:57:0x0102, B:59:0x0108, B:64:0x011a, B:66:0x0128, B:67:0x013e, B:69:0x0144, B:70:0x012d, B:72:0x013c, B:73:0x014a, B:75:0x014e, B:77:0x0154, B:78:0x015a, B:83:0x003a, B:85:0x003e, B:87:0x0042, B:89:0x0046, B:91:0x004e, B:92:0x0055, B:94:0x0059, B:96:0x005d, B:98:0x0065), top: B:4:0x0017 }] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00e0 A[Catch: Exception -> 0x0161, TryCatch #0 {Exception -> 0x0161, blocks: (B:5:0x0017, B:10:0x0025, B:12:0x002b, B:14:0x0035, B:15:0x006b, B:17:0x0071, B:18:0x0077, B:21:0x0080, B:23:0x0086, B:25:0x0090, B:28:0x009e, B:30:0x00a4, B:32:0x00ae, B:33:0x00b4, B:35:0x00b8, B:39:0x00c2, B:41:0x00c8, B:43:0x00d2, B:44:0x00dc, B:46:0x00e0, B:48:0x00e4, B:49:0x00f0, B:51:0x00f4, B:53:0x00fa, B:55:0x00fe, B:57:0x0102, B:59:0x0108, B:64:0x011a, B:66:0x0128, B:67:0x013e, B:69:0x0144, B:70:0x012d, B:72:0x013c, B:73:0x014a, B:75:0x014e, B:77:0x0154, B:78:0x015a, B:83:0x003a, B:85:0x003e, B:87:0x0042, B:89:0x0046, B:91:0x004e, B:92:0x0055, B:94:0x0059, B:96:0x005d, B:98:0x0065), top: B:4:0x0017 }] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00f4 A[Catch: Exception -> 0x0161, TryCatch #0 {Exception -> 0x0161, blocks: (B:5:0x0017, B:10:0x0025, B:12:0x002b, B:14:0x0035, B:15:0x006b, B:17:0x0071, B:18:0x0077, B:21:0x0080, B:23:0x0086, B:25:0x0090, B:28:0x009e, B:30:0x00a4, B:32:0x00ae, B:33:0x00b4, B:35:0x00b8, B:39:0x00c2, B:41:0x00c8, B:43:0x00d2, B:44:0x00dc, B:46:0x00e0, B:48:0x00e4, B:49:0x00f0, B:51:0x00f4, B:53:0x00fa, B:55:0x00fe, B:57:0x0102, B:59:0x0108, B:64:0x011a, B:66:0x0128, B:67:0x013e, B:69:0x0144, B:70:0x012d, B:72:0x013c, B:73:0x014a, B:75:0x014e, B:77:0x0154, B:78:0x015a, B:83:0x003a, B:85:0x003e, B:87:0x0042, B:89:0x0046, B:91:0x004e, B:92:0x0055, B:94:0x0059, B:96:0x005d, B:98:0x0065), top: B:4:0x0017 }] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x014e A[Catch: Exception -> 0x0161, TryCatch #0 {Exception -> 0x0161, blocks: (B:5:0x0017, B:10:0x0025, B:12:0x002b, B:14:0x0035, B:15:0x006b, B:17:0x0071, B:18:0x0077, B:21:0x0080, B:23:0x0086, B:25:0x0090, B:28:0x009e, B:30:0x00a4, B:32:0x00ae, B:33:0x00b4, B:35:0x00b8, B:39:0x00c2, B:41:0x00c8, B:43:0x00d2, B:44:0x00dc, B:46:0x00e0, B:48:0x00e4, B:49:0x00f0, B:51:0x00f4, B:53:0x00fa, B:55:0x00fe, B:57:0x0102, B:59:0x0108, B:64:0x011a, B:66:0x0128, B:67:0x013e, B:69:0x0144, B:70:0x012d, B:72:0x013c, B:73:0x014a, B:75:0x014e, B:77:0x0154, B:78:0x015a, B:83:0x003a, B:85:0x003e, B:87:0x0042, B:89:0x0046, B:91:0x004e, B:92:0x0055, B:94:0x0059, B:96:0x005d, B:98:0x0065), top: B:4:0x0017 }] */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        CharSequence charSequence;
        TL_stars.StarGift starGift;
        TextView textView;
        y1 y1Var;
        dg.u2 u2Var;
        TL_stars.SavedStarGift savedStarGift;
        TL_stars.SavedStarGift savedStarGift2;
        lp lpVar;
        p9 p9Var;
        long peerDialogId;
        TextView textView2;
        CharSequence text;
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("android.widget.Button");
        accessibilityNodeInfo.setClickable(true);
        if (isEnabled()) {
            accessibilityNodeInfo.addAction(16);
        }
        try {
            StringBuilder sb = new StringBuilder();
            String str = null;
            if (this.S == null) {
                TL_stars.SavedStarGift savedStarGift3 = this.W;
                if (savedStarGift3 != null && (starGift = savedStarGift3.gift) != null) {
                    if ((starGift instanceof TL_stars.TL_starGiftUnique) && !TextUtils.isEmpty(starGift.title)) {
                        charSequence = this.W.gift.title;
                        if (TextUtils.isEmpty(charSequence)) {
                        }
                        sb.append(charSequence);
                        textView = this.F;
                        if (textView != null) {
                        }
                        y1Var = this.f;
                        if (y1Var != null) {
                        }
                        u2Var = this.G;
                        if (u2Var != null) {
                        }
                        savedStarGift = this.W;
                        if (savedStarGift != null) {
                        }
                        savedStarGift2 = this.W;
                        if (savedStarGift2 != null) {
                        }
                        lpVar = this.h0;
                        if (lpVar != null) {
                        }
                        accessibilityNodeInfo.setContentDescription(sb.toString());
                    }
                    charSequence = null;
                    if (TextUtils.isEmpty(charSequence)) {
                    }
                    sb.append(charSequence);
                    textView = this.F;
                    if (textView != null) {
                    }
                    y1Var = this.f;
                    if (y1Var != null) {
                    }
                    u2Var = this.G;
                    if (u2Var != null) {
                    }
                    savedStarGift = this.W;
                    if (savedStarGift != null) {
                    }
                    savedStarGift2 = this.W;
                    if (savedStarGift2 != null) {
                    }
                    lpVar = this.h0;
                    if (lpVar != null) {
                    }
                    accessibilityNodeInfo.setContentDescription(sb.toString());
                }
                TL_stars.StarGift starGift2 = this.T;
                if (starGift2 != null && (starGift2 instanceof TL_stars.TL_starGiftUnique) && !TextUtils.isEmpty(starGift2.title)) {
                    charSequence = this.T.title;
                    if (TextUtils.isEmpty(charSequence)) {
                    }
                    sb.append(charSequence);
                    textView = this.F;
                    if (textView != null) {
                    }
                    y1Var = this.f;
                    if (y1Var != null) {
                    }
                    u2Var = this.G;
                    if (u2Var != null) {
                    }
                    savedStarGift = this.W;
                    if (savedStarGift != null) {
                    }
                    savedStarGift2 = this.W;
                    if (savedStarGift2 != null) {
                    }
                    lpVar = this.h0;
                    if (lpVar != null) {
                    }
                    accessibilityNodeInfo.setContentDescription(sb.toString());
                }
                charSequence = null;
                if (TextUtils.isEmpty(charSequence)) {
                }
                sb.append(charSequence);
                textView = this.F;
                if (textView != null) {
                }
                y1Var = this.f;
                if (y1Var != null) {
                }
                u2Var = this.G;
                if (u2Var != null) {
                }
                savedStarGift = this.W;
                if (savedStarGift != null) {
                }
                savedStarGift2 = this.W;
                if (savedStarGift2 != null) {
                }
                lpVar = this.h0;
                if (lpVar != null) {
                }
                accessibilityNodeInfo.setContentDescription(sb.toString());
            }
            TextView textView3 = this.E;
            if (textView3 != null && textView3.getVisibility() == 0 && !TextUtils.isEmpty(textView3.getText())) {
                charSequence = textView3.getText();
                if (TextUtils.isEmpty(charSequence)) {
                    charSequence = LocaleController.getString(R.string.Gift2Gift);
                }
                sb.append(charSequence);
                textView = this.F;
                if (textView != null && textView.getVisibility() == 0 && !TextUtils.isEmpty(textView.getText())) {
                    sb.append(", ");
                    sb.append(textView.getText());
                }
                y1Var = this.f;
                if (y1Var != null && y1Var.getVisibility() == 0) {
                    text = y1Var.getText();
                    if (!TextUtils.isEmpty(text)) {
                        sb.append(", ");
                        sb.append(text);
                    }
                }
                u2Var = this.G;
                if (u2Var != null && u2Var.getVisibility() == 0 && (textView2 = this.I) != null && textView2.getVisibility() == 0 && !TextUtils.isEmpty(textView2.getText())) {
                    sb.append(", ");
                    sb.append(textView2.getText());
                }
                savedStarGift = this.W;
                if (savedStarGift != null && savedStarGift.unsaved) {
                    sb.append(", ");
                    sb.append(LocaleController.getString(R.string.Gift2FilterHidden));
                }
                savedStarGift2 = this.W;
                if (savedStarGift2 != null && !(savedStarGift2.gift instanceof TL_stars.TL_starGiftUnique) && !savedStarGift2.name_hidden && (p9Var = this.n) != null && p9Var.getVisibility() == 0) {
                    peerDialogId = DialogObject.getPeerDialogId(this.W.from_id);
                    if (peerDialogId != 0) {
                        int i10 = this.a;
                        if (peerDialogId > 0) {
                            TLRPC.User user = MessagesController.getInstance(i10).getUser(Long.valueOf(peerDialogId));
                            if (user != null) {
                                str = UserObject.getUserName(user);
                            }
                        } else {
                            TLRPC.Chat chat = MessagesController.getInstance(i10).getChat(Long.valueOf(-peerDialogId));
                            if (chat != null) {
                                str = chat.title;
                            }
                        }
                        if (!TextUtils.isEmpty(str)) {
                            sb.append(", ");
                            sb.append((CharSequence) str);
                        }
                    }
                }
                lpVar = this.h0;
                if (lpVar != null && lpVar.a.q) {
                    accessibilityNodeInfo.setCheckable(true);
                    accessibilityNodeInfo.setChecked(true);
                }
                accessibilityNodeInfo.setContentDescription(sb.toString());
            }
            charSequence = null;
            if (TextUtils.isEmpty(charSequence)) {
            }
            sb.append(charSequence);
            textView = this.F;
            if (textView != null) {
                sb.append(", ");
                sb.append(textView.getText());
            }
            y1Var = this.f;
            if (y1Var != null) {
                text = y1Var.getText();
                if (!TextUtils.isEmpty(text)) {
                }
            }
            u2Var = this.G;
            if (u2Var != null) {
                sb.append(", ");
                sb.append(textView2.getText());
            }
            savedStarGift = this.W;
            if (savedStarGift != null) {
                sb.append(", ");
                sb.append(LocaleController.getString(R.string.Gift2FilterHidden));
            }
            savedStarGift2 = this.W;
            if (savedStarGift2 != null) {
                peerDialogId = DialogObject.getPeerDialogId(this.W.from_id);
                if (peerDialogId != 0) {
                }
            }
            lpVar = this.h0;
            if (lpVar != null) {
                accessibilityNodeInfo.setCheckable(true);
                accessibilityNodeInfo.setChecked(true);
            }
            accessibilityNodeInfo.setContentDescription(sb.toString());
        } catch (Exception unused) {
        }
    }

    public void setImageLayer(int i10) {
        this.y.setLayerNum(i10);
    }

    public void setImageSize(int i10) {
        FrameLayout.LayoutParams layoutParams = this.B;
        layoutParams.width = i10;
        layoutParams.height = i10;
    }

    public void setRibbonColor(int i10) {
        y1 y1Var = this.f;
        y1Var.setColor(i10);
        y1Var.invalidate();
    }

    public void setRibbonText(String str) {
        this.f.b(str, true);
    }

    public void setRibbonTextOneOf(int i10) {
        y1 y1Var = this.f;
        y1Var.setVisibility(0);
        y1Var.setColor(j6.v0(j6.Li, this.b));
        y1Var.setStrokeColor(0);
        y1Var.setBackdrop((TL_stars.starGiftAttributeBackdrop) t7.l(this.T.attributes, TL_stars.starGiftAttributeBackdrop.class));
        y1Var.b(LocaleController.formatString(R.string.Gift2Limited1OfRibbon, AndroidUtilities.formatWholeNumber(i10, 0)), true);
    }
}
