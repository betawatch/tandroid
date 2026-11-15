package bi;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.text.TextUtils;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import c8.ja;
import c8.na;
import di.ba;
import di.gb;
import di.lb;
import di.u8;
import java.util.HashSet;
import org.telegram.messenger.a8;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.gc;
import org.telegram.messenger.hd;
import org.telegram.messenger.i20;
import org.telegram.messenger.m10;
import org.telegram.messenger.np;
import org.telegram.messenger.ns;
import org.telegram.messenger.q10;
import org.telegram.messenger.w7;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.ch0;
import org.telegram.ui.Components.eq;
import org.telegram.ui.Components.er;
import org.telegram.ui.Components.fp;
import org.telegram.ui.Components.fq;
import org.telegram.ui.Components.i9;
import org.telegram.ui.Components.in0;
import org.telegram.ui.Components.k60;
import org.telegram.ui.Components.oy0;
import org.telegram.ui.Components.t8;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public class i2 extends FrameLayout implements org.telegram.ui.ActionBar.z5 {
    public static final int[] w0 = {-2781403, -3635939};
    public final i9 E;
    public FrameLayout.LayoutParams F;
    public final ug.a1 G;
    public final ug.a1 H;
    public final TextView I;
    public final TextView J;
    public final g2 K;
    public final o2 L;
    public final TextView M;
    public final TextView N;
    public ba O;
    public boolean P;
    public float Q;
    public oy0 R;
    public oy0 S;
    public final Rect T;
    public boolean U;
    public boolean V;
    public boolean W;
    public final int a;
    public final org.telegram.ui.Components.u5 a0;
    public final org.telegram.ui.ActionBar.e6 b;
    public ug.j b0;
    public final in0 c;
    public TL_stars.StarGift c0;
    public final FrameLayout d;
    public boolean d0;
    public final e2 e;
    public boolean e0;
    public final j2 f;
    public TL_stars.SavedStarGift f0;
    public boolean g0;
    public final t8 h;
    public boolean h0;
    public boolean i0;
    public boolean j0;
    public ug.j k0;
    public TLRPC.Document l0;
    public TL_stars.SavedStarGift m0;
    public final i9 n;
    public fp n0;
    public int o0;
    public boolean p0;
    public boolean q0;
    public final FrameLayout.LayoutParams r;
    public int r0;
    public final FrameLayout.LayoutParams s;
    public int[] s0;
    public int t0;
    public boolean u0;
    public boolean v0;
    public final FrameLayout w;
    public final ImageView x;
    public final TextView y;

    public i2(int i7, Context context, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context);
        this.Q = -1.0f;
        this.T = new Rect();
        this.a0 = new org.telegram.ui.Components.u5(this, 0L, 320L, er.h);
        this.o0 = -1;
        this.v0 = org.telegram.ui.ActionBar.j6.I.q();
        this.a = i7;
        this.b = e6Var;
        na.b(this, 0.04f, 1.5f);
        this.c = new in0(this);
        FrameLayout frameLayout = new FrameLayout(context);
        this.d = frameLayout;
        e2 e2Var = new e2(frameLayout, e6Var, true);
        this.e = e2Var;
        frameLayout.setBackground(e2Var);
        addView(frameLayout, ja.e(-1, -1, ns.E1));
        j2 j2Var = new j2(context);
        this.f = j2Var;
        addView(j2Var, ja.d(-2, -2.0f, 53, 0.0f, 2.0f, 1.0f, 0.0f));
        i9 i9Var = new i9(context);
        this.E = i9Var;
        int i10 = 0;
        i9Var.getImageReceiver().W(0);
        FrameLayout.LayoutParams d = ja.d(80, 80.0f, 17, 0.0f, 12.0f, 0.0f, 12.0f);
        this.F = d;
        frameLayout.addView(i9Var, d);
        ug.a1 a1Var = new ug.a1(3, context, e6Var);
        this.G = a1Var;
        a1Var.setImageReceiver(i9Var.getImageReceiver());
        frameLayout.addView(a1Var, ja.d(30, 30.0f, 49, 0.0f, 38.0f, 0.0f, 0.0f));
        ug.a1 a1Var2 = new ug.a1(4, context, e6Var);
        this.H = a1Var2;
        a1Var2.setImageReceiver(i9Var.getImageReceiver());
        frameLayout.addView(a1Var2, ja.e(44, 44, 17));
        a1Var2.setAlpha(0.0f);
        a1Var2.setScaleX(0.3f);
        a1Var2.setScaleY(0.3f);
        a1Var2.setVisibility(8);
        TextView textView = new TextView(context);
        this.I = textView;
        int i11 = org.telegram.ui.ActionBar.j6.G6;
        org.telegram.ui.ActionBar.q6.U(textView, i11, e6Var);
        textView.setGravity(17);
        textView.setTextSize(1, 14.0f);
        textView.setTypeface(org.telegram.messenger.g0.o());
        TextView k10 = org.telegram.ui.Cells.y0.k(frameLayout, textView, ja.d(-1, -2.0f, 48, 0.0f, 89.0f, 0.0f, 0.0f), context);
        this.J = k10;
        org.telegram.ui.ActionBar.q6.U(k10, i11, e6Var);
        k10.setGravity(17);
        k10.setTextSize(1, 12.0f);
        frameLayout.addView(k10, ja.d(-1, -2.0f, 48, 0.0f, 107.0f, 0.0f, 0.0f));
        g2 g2Var = new g2(i10, context, this);
        this.K = g2Var;
        TextView textView2 = new TextView(context);
        this.M = textView2;
        textView2.setTextSize(1, 12.0f);
        textView2.setTypeface(org.telegram.messenger.g0.o());
        textView2.setPadding(org.telegram.messenger.g0.L(10.0f), 0, org.telegram.messenger.g0.L(10.0f), 0);
        textView2.setGravity(17);
        textView2.setTextColor(-13397548);
        frameLayout.addView(g2Var, ja.d(-2, -2.0f, 81, 0.0f, 0.0f, 0.0f, 11.0f));
        o2 o2Var = new o2(context, i10);
        this.L = o2Var;
        o2Var.setBackgroundColor(-16776961);
        g2Var.addView(o2Var, ja.c(0.0f, 0));
        g2Var.addView(textView2, ja.e(-2, 26, 17));
        o2Var.setBackground(new n2(org.telegram.ui.ActionBar.j6.I.q() ? 518759725 : 1088989954));
        TextView textView3 = new TextView(context);
        this.N = textView3;
        textView3.setTextSize(1, 10.66f);
        textView3.setGravity(17);
        textView3.setTextColor(org.telegram.ui.ActionBar.j6.I.q() ? -1333971 : -2722014);
        textView3.setVisibility(8);
        frameLayout.addView(textView3, ja.d(-2, -2.0f, 49, 0.0f, 161.0f, 0.0f, 8.0f));
        this.h = new t8((org.telegram.ui.ActionBar.e6) null);
        i9 i9Var2 = new i9(context);
        this.n = i9Var2;
        i9Var2.setRoundRadius(org.telegram.messenger.g0.L(20.0f));
        i9Var2.setVisibility(8);
        FrameLayout.LayoutParams d2 = ja.d(20, 20.0f, 51, 2.0f, 2.0f, 2.0f, 2.0f);
        this.r = d2;
        frameLayout.addView(i9Var2, d2);
        this.s = ja.d(20, 20.0f, 51, 5.0f, 5.0f, 2.0f, 2.0f);
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.w = frameLayout2;
        frameLayout2.setAlpha(0.0f);
        frameLayout2.setScaleX(0.3f);
        frameLayout2.setScaleY(0.3f);
        frameLayout2.setVisibility(8);
        ImageView e10 = i20.e(context, R.drawable.msg_limit_pin);
        e10.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        e10.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
        frameLayout2.addView(e10, ja.a(12.66f, 12.66f, 17));
        frameLayout.addView(frameLayout2, ja.d(20, 20.0f, 51, 2.0f, 2.0f, 2.0f, 2.0f));
        ImageView imageView = new ImageView(context);
        this.x = imageView;
        imageView.setImageResource(R.drawable.mini_gram_14);
        imageView.setPadding(0, org.telegram.messenger.g0.L(2.0f), 0, 0);
        imageView.setVisibility(8);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        frameLayout.addView(imageView, ja.d(20, 20.0f, 51, 3.0f, 3.0f, 3.0f, 3.0f));
        TextView textView4 = new TextView(context);
        this.y = textView4;
        textView4.setTextSize(1, 10.0f);
        textView4.setTypeface(org.telegram.messenger.g0.o());
        textView4.setPadding(org.telegram.messenger.g0.L(5.0f), 0, org.telegram.messenger.g0.L(5.0f), 0);
        textView4.setGravity(17);
        textView4.setTextColor(-1);
        frameLayout.addView(textView4, ja.d(-2, 17.0f, 51, 4.0f, 4.0f, 0.0f, 0.0f));
        textView4.setVisibility(8);
        setImportantForAccessibility(1);
        frameLayout.setImportantForAccessibility(4);
        j2Var.setImportantForAccessibility(2);
    }

    private TL_stars.TL_starGiftUnique getUniqueStarGift() {
        TL_stars.SavedStarGift savedStarGift = this.f0;
        if (savedStarGift == null) {
            return null;
        }
        TL_stars.StarGift starGift = savedStarGift.gift;
        if (starGift instanceof TL_stars.TL_starGiftUnique) {
            return (TL_stars.TL_starGiftUnique) starGift;
        }
        return null;
    }

    private void setRibbonColorKey(int i7) {
        this.f.setColor(org.telegram.ui.ActionBar.j6.w0(i7, this.b));
        this.o0 = i7;
    }

    public final void a() {
        boolean q10 = org.telegram.ui.ActionBar.j6.I.q();
        this.v0 = q10;
        int i7 = this.u0 ? 1090519039 : q10 ? 518759725 : 1088989954;
        int i10 = q10 ? -1333971 : this.t0 == 2 ? -4229632 : -2722014;
        this.L.setBackground(new n2(i7));
        this.M.setTextColor(i10);
        ImageView imageView = this.x;
        imageView.setColorFilter(i10);
        imageView.setBackground(org.telegram.ui.ActionBar.j6.d0(org.telegram.messenger.g0.L(10.0f), i7));
    }

    @Override // org.telegram.ui.ActionBar.z5
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.Cj));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.Dj));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.lk));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.nk));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.d6));
    }

    public void b(k60 k60Var, Canvas canvas, float f10, float f11, float f12) {
        float f13;
        g2 g2Var;
        float f14;
        ImageView imageView;
        TL_stars.TL_starGiftUnique tL_starGiftUnique;
        float f15;
        Canvas canvas2 = canvas;
        i9 i9Var = this.n;
        i9 i9Var2 = this.E;
        e2 e2Var = this.e;
        j2 j2Var = this.f;
        Rect rect = this.T;
        FrameLayout frameLayout = this.w;
        ImageView imageView2 = this.x;
        g2 g2Var2 = this.K;
        ug.a1 a1Var = this.G;
        canvas2.save();
        canvas2.scale(getScaleX(), getScaleY(), f10 / 2.0f, f11 / 2.0f);
        TL_stars.TL_starGiftUnique uniqueStarGift = getUniqueStarGift();
        float L = uniqueStarGift != null ? org.telegram.messenger.g0.L(63.0f) * f12 : 0.0f;
        e2Var.setBounds(0, 0, (int) f10, (int) f11);
        e2Var.b(canvas2, f12);
        e2Var.getPadding(rect);
        float W1 = org.telegram.messenger.g0.W1(f12, org.telegram.messenger.g0.L(80.0f), org.telegram.messenger.g0.L(120.0f));
        float f16 = f11 - L;
        i9Var2.getImageReceiver().y0((f10 - W1) / 2.0f, (f16 - W1) / 2.0f, W1, W1);
        i9Var2.getImageReceiver().h(canvas2, null);
        ch0 B = i9Var2.getImageReceiver().B();
        if (B != null && B.l0) {
            k60Var.invalidate();
        }
        if (a1Var.getVisibility() != 0 || a1Var.getAlpha() <= 0.0f) {
            f13 = 1.0f;
            g2Var = g2Var2;
            f14 = 0.0f;
            imageView = imageView2;
            tL_starGiftUnique = uniqueStarGift;
        } else {
            canvas2.save();
            canvas2.translate((f10 - a1Var.getMeasuredWidth()) / 2.0f, org.telegram.messenger.g0.T1(a1Var.getY(), (f16 - a1Var.getMeasuredHeight()) / 2.0f, f12));
            f13 = 1.0f;
            g2Var = g2Var2;
            f14 = 0.0f;
            imageView = imageView2;
            tL_starGiftUnique = uniqueStarGift;
            canvas2.saveLayerAlpha(0.0f, 0.0f, a1Var.getWidth(), a1Var.getHeight(), (int) (a1Var.getAlpha() * (1.0f - f12) * 255.0f), 31);
            a1Var.draw(canvas2);
            canvas2.restore();
            canvas2.restore();
        }
        if (frameLayout.getVisibility() == 0 && frameLayout.getAlpha() > f14) {
            canvas2.save();
            canvas2.translate(org.telegram.messenger.g0.L(2.0f) + rect.left, org.telegram.messenger.g0.L(2.0f) + rect.top);
            canvas2.saveLayerAlpha(0.0f, 0.0f, frameLayout.getWidth(), frameLayout.getHeight(), (int) (frameLayout.getAlpha() * 255.0f), 31);
            frameLayout.draw(canvas2);
            canvas2.restore();
            canvas2.restore();
        }
        if (i9Var.getVisibility() == 0 && i9Var.getAlpha() > f14) {
            canvas2.save();
            canvas2.translate(org.telegram.messenger.g0.L(2.0f) + rect.left, org.telegram.messenger.g0.L(2.0f) + rect.top);
            i9Var.draw(canvas2);
            canvas2.restore();
        }
        if (j2Var.getVisibility() != 0 || j2Var.getAlpha() <= f14) {
            f15 = f13;
        } else {
            canvas2.save();
            canvas2.translate(f10 - org.telegram.messenger.g0.L(f13), org.telegram.messenger.g0.L(2.0f));
            f15 = f13;
            float T1 = org.telegram.messenger.g0.T1(f15, 1.25f, f12);
            canvas2.scale(T1, T1);
            canvas2.translate(-j2Var.getWidth(), f14);
            j2Var.draw(canvas2);
            canvas2.restore();
        }
        if (tL_starGiftUnique != null) {
            if (this.R == null) {
                this.R = new oy0(tL_starGiftUnique.title, 20.0f, org.telegram.messenger.g0.o());
            }
            if (this.S == null) {
                this.S = new oy0(hd.H(',', "Gift2CollectionNumber", tL_starGiftUnique.num), 13.0f, null);
            }
            oy0 oy0Var = this.R;
            oy0Var.p = f10 - org.telegram.messenger.g0.L(8.0f);
            float f17 = f15 - f12;
            oy0Var.c((f10 - this.R.k()) / 2.0f, ((f11 - org.telegram.messenger.g0.L(40.0f)) - (this.R.i() / 2.0f)) + (org.telegram.messenger.g0.L(50.0f) * f17), f12, -1, canvas);
            oy0 oy0Var2 = this.S;
            oy0Var2.p = f10 - org.telegram.messenger.g0.L(8.0f);
            oy0Var2.c((f10 - this.S.k()) / 2.0f, ((f11 - org.telegram.messenger.g0.L(19.0f)) - (this.S.i() / 2.0f)) + (org.telegram.messenger.g0.L(50.0f) * f17), 0.6f * f12, -1, canvas);
            canvas2 = canvas;
        }
        if (g2Var != null && g2Var.getVisibility() == 0) {
            canvas2.save();
            canvas2.translate(g2Var.getX(), g2Var.getY());
            canvas2.saveLayerAlpha(0.0f, 0.0f, g2Var.getWidth(), g2Var.getHeight(), (int) (g2Var.getAlpha() * (f15 - f12) * 255.0f), 31);
            g2Var.draw(canvas2);
            canvas2.restore();
            canvas2.restore();
        }
        if (imageView != null && imageView.getVisibility() == 0) {
            canvas2.save();
            canvas2.translate(imageView.getX(), imageView.getY());
            canvas2.saveLayerAlpha(0.0f, 0.0f, imageView.getWidth(), imageView.getHeight(), (int) (imageView.getAlpha() * (f15 - f12) * 255.0f), 31);
            imageView.draw(canvas2);
            canvas2.restore();
            canvas2.restore();
        }
        canvas2.restore();
    }

    public final void c(boolean z10, boolean z11) {
        if (this.n0 == null) {
            fp fpVar = new fp(21, getContext(), null);
            this.n0 = fpVar;
            fpVar.b(-1, org.telegram.ui.ActionBar.j6.d6, org.telegram.ui.ActionBar.j6.k7);
            this.n0.setDrawUnchecked(false);
            this.d.addView(this.n0, ja.d(24, 24.0f, 51, 4.0f, 4.0f, 4.0f, 4.0f));
        }
        this.n.setVisibility(8);
        this.n0.a(z10, z11);
    }

    public final void d(boolean z10, boolean z11) {
        TL_stars.SavedStarGift savedStarGift;
        if (this.U == z10) {
            return;
        }
        this.U = z10;
        boolean z12 = false;
        FrameLayout frameLayout = this.w;
        if (z11) {
            frameLayout.setVisibility(0);
            frameLayout.animate().alpha(z10 ? 1.0f : 0.0f).scaleX(z10 ? 1.0f : 0.3f).scaleY(z10 ? 1.0f : 0.3f).withEndAction(new f2(this, z10, 1)).start();
        } else {
            frameLayout.setVisibility(z10 ? 0 : 8);
            frameLayout.setAlpha(z10 ? 1.0f : 0.0f);
            frameLayout.setScaleX(z10 ? 1.0f : 0.3f);
            frameLayout.setScaleY(z10 ? 1.0f : 0.3f);
        }
        if (!this.U && this.W && !this.i0 && (savedStarGift = this.f0) != null && (savedStarGift.gift instanceof TL_stars.TL_starGiftUnique)) {
            z12 = true;
        }
        g(z12, z11);
        l();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        canvas.save();
        canvas.translate(getWidth() / 2.0f, getHeight() / 2.0f);
        float d = this.a0.d(this.W);
        if (d > 0.0f) {
            this.c.a(canvas, d);
        }
        canvas.translate((-getWidth()) / 2.0f, (-getHeight()) / 2.0f);
        super.dispatchDraw(canvas);
        canvas.restore();
    }

    public final void e(boolean z10, boolean z11) {
        TL_stars.SavedStarGift savedStarGift;
        if (this.W == z10) {
            return;
        }
        this.W = z10;
        if (!z11) {
            this.a0.a(z10);
        }
        invalidate();
        g((this.U || !z10 || this.i0 || (savedStarGift = this.f0) == null || !(savedStarGift.gift instanceof TL_stars.TL_starGiftUnique)) ? false : true, z11);
    }

    public final void f(boolean z10, boolean z11) {
        this.e.f(z10, z11);
        ImageView imageView = this.x;
        if (z11) {
            imageView.animate().translationX(z10 ? org.telegram.messenger.g0.L(6.0f) : 0.0f).translationY(z10 ? org.telegram.messenger.g0.L(6.0f) : 0.0f).setDuration(320L).setInterpolator(er.h).start();
            return;
        }
        imageView.animate().cancel();
        imageView.setTranslationX(z10 ? org.telegram.messenger.g0.L(6.0f) : 0.0f);
        imageView.setTranslationY(z10 ? org.telegram.messenger.g0.L(6.0f) : 0.0f);
    }

    public final void g(boolean z10, boolean z11) {
        if (this.V == z10) {
            return;
        }
        this.V = z10;
        ug.a1 a1Var = this.H;
        if (z11) {
            a1Var.setVisibility(0);
            a1Var.animate().alpha(z10 ? 1.0f : 0.0f).scaleX(z10 ? 1.0f : 0.3f).scaleY(z10 ? 1.0f : 0.3f).withEndAction(new f2(this, z10, 0)).start();
        } else {
            a1Var.setVisibility(z10 ? 0 : 8);
            a1Var.setAlpha(z10 ? 1.0f : 0.0f);
            a1Var.setScaleX(z10 ? 1.0f : 0.3f);
            a1Var.setScaleY(z10 ? 1.0f : 0.3f);
        }
    }

    public TL_stars.StarGift getGift() {
        return this.c0;
    }

    public long getGiftId() {
        TL_stars.StarGift starGift = this.c0;
        if (starGift != null) {
            return starGift.id;
        }
        return 0L;
    }

    public ug.j getPremiumTier() {
        return this.b0;
    }

    public TL_stars.SavedStarGift getSavedGift() {
        return this.f0;
    }

    /* JADX WARN: Removed duplicated region for block: B:49:0x0161  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x01ce  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0296  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x02e5  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x02f9  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x02c2  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x02c4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void h(TL_stars.StarGift starGift, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14) {
        long j3;
        long j10;
        long j11;
        boolean z15;
        long j12;
        boolean z16;
        ba baVar = this.O;
        ColorFilter colorFilter = null;
        if (baVar != null) {
            baVar.run();
            this.O = null;
        }
        j(starGift.getDocument(), starGift);
        TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop = (TL_stars.starGiftAttributeBackdrop) u8.l(starGift.attributes, TL_stars.starGiftAttributeBackdrop.class);
        e2 e2Var = this.e;
        e2Var.d(stargiftattributebackdrop);
        e2Var.e((TL_stars.starGiftAttributePattern) u8.l(starGift.attributes, TL_stars.starGiftAttributePattern.class));
        boolean z17 = starGift.auction;
        int[] iArr = w0;
        org.telegram.ui.ActionBar.e6 e6Var = this.b;
        if (!z17 || (((z16 = starGift.sold_out) && !this.d0) || (z12 && starGift.availability_resale > 0))) {
            if (!starGift.require_premium || (z12 && starGift.availability_resale > 0)) {
                iArr = null;
            }
            e2Var.g(iArr);
        } else if (z16) {
            int i7 = org.telegram.ui.ActionBar.j6.Dj;
            int[] iArr2 = {org.telegram.ui.ActionBar.j6.w0(i7, e6Var), org.telegram.ui.ActionBar.j6.w0(i7, e6Var)};
            this.s0 = iArr2;
            e2Var.g(iArr2);
        } else {
            e2Var.g(iArr);
        }
        this.I.setVisibility(8);
        this.J.setVisibility(8);
        i9 i9Var = this.E;
        i9Var.setTranslationY(0.0f);
        this.G.setVisibility(8);
        int i10 = starGift.resale_ton_only ? 0 : 8;
        ImageView imageView = this.x;
        imageView.setVisibility(i10);
        int i11 = z14 ? 0 : 8;
        TextView textView = this.y;
        textView.setVisibility(i11);
        textView.setTranslationX(starGift.resale_ton_only ? org.telegram.messenger.g0.L(23.0f) : 0.0f);
        textView.setTranslationY(starGift.resale_ton_only ? org.telegram.messenger.g0.L(1.0f) : 0.0f);
        if (z14) {
            StringBuilder sb2 = new StringBuilder("+");
            int i12 = starGift.craft_chance_permille;
            sb2.append((Object) (i12 <= 0 ? "<0.1%" : ki.k.J0(i12)));
            textView.setText(sb2.toString());
        }
        FrameLayout.LayoutParams layoutParams = this.F;
        layoutParams.gravity = 49;
        i9Var.setLayoutParams(layoutParams);
        int i13 = this.a;
        i9 i9Var2 = this.n;
        if (!z13) {
            if ((!z12 || starGift.availability_resale <= 0) && starGift.locked_until_date > ConnectionsManager.getInstance(i13).getCurrentTime()) {
                i9Var2.setVisibility(0);
                i9Var2.setLayoutParams(this.s);
                int w02 = org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.nk, e6Var);
                this.r0 = w02;
                i9Var2.setColorFilter(new PorterDuffColorFilter(w02, PorterDuff.Mode.SRC_IN));
                this.q0 = true;
                i9Var2.setImageResource(R.drawable.mini_gift_lock);
                int i14 = (z14 || z13) ? 0 : 8;
                TextView textView2 = this.M;
                textView2.setVisibility(i14);
                textView2.setTextSize(1, 12.0f);
                o2 o2Var = this.L;
                if (!z10) {
                    textView2.setPadding(org.telegram.messenger.g0.L(10.0f), 0, org.telegram.messenger.g0.L(10.0f), 0);
                    textView2.setText(hd.M0(2131749919, null));
                    int w10 = stargiftattributebackdrop != null ? org.telegram.ui.ActionBar.j6.w(stargiftattributebackdrop.center_color | (-16777216), org.telegram.ui.ActionBar.j6.r1(0.55f, stargiftattributebackdrop.pattern_color | (-16777216))) : 1090519039;
                    this.t0 = 0;
                    int L = org.telegram.messenger.g0.L(13.0f);
                    int w11 = org.telegram.ui.ActionBar.j6.w(w10, 822083583);
                    int i15 = w10;
                    o2Var.setBackground(org.telegram.ui.ActionBar.j6.k0(L, L, L, L, i15, w11, w11));
                    textView2.setTextColor(-1);
                    imageView.setColorFilter(-1);
                    int L2 = org.telegram.messenger.g0.L(10.0f);
                    int w12 = org.telegram.ui.ActionBar.j6.w(i15, 822083583);
                    imageView.setBackground(org.telegram.ui.ActionBar.j6.k0(L2, L2, L2, L2, i15, w12, w12));
                } else if (z13) {
                    textView2.setPadding(org.telegram.messenger.g0.L(8.0f), 0, org.telegram.messenger.g0.L(10.0f), 0);
                    long resellStars = starGift.getResellStars();
                    int w13 = org.telegram.ui.ActionBar.j6.w(stargiftattributebackdrop.center_color | (-16777216), org.telegram.ui.ActionBar.j6.r1(0.55f, stargiftattributebackdrop.pattern_color | (-16777216)));
                    textView2.setText(lb.T0("XTR " + hd.E(resellStars, ',')));
                    this.t0 = 0;
                    o2Var.setBackground(new n2(1895825407, w13));
                    textView2.setTextColor(-1);
                    imageView.setColorFilter(-1);
                    imageView.setBackground(org.telegram.ui.ActionBar.j6.d0(org.telegram.messenger.g0.L(10.0f), w13));
                    textView.setBackground(org.telegram.ui.ActionBar.j6.d0(org.telegram.messenger.g0.L(9.0f), w13));
                } else {
                    textView2.setPadding(org.telegram.messenger.g0.L(8.0f), 0, org.telegram.messenger.g0.L(10.0f), 0);
                    if (z12) {
                        long j13 = starGift.availability_resale;
                        if (j13 > 0) {
                            long j14 = starGift.resell_min_stars;
                            if (j13 > 1) {
                                j12 = j14;
                                if (j12 < ((org.telegram.messenger.j0) np.s1(i13).y7.q.b).c) {
                                    j11 = j12;
                                    z15 = true;
                                    if (starGift.auction || starGift.availability_resale != 0) {
                                        StringBuilder sb3 = new StringBuilder("XTR ");
                                        sb3.append(hd.E(j11, ','));
                                        sb3.append(z15 ? "+" : "");
                                        textView2.setText(lb.a1(false, sb3.toString(), 0.71f, null));
                                    } else {
                                        textView2.setText(hd.M0(starGift.sold_out ? 2131750336 : 2131750337, null));
                                    }
                                    this.t0 = 1;
                                    this.u0 = starGift instanceof TL_stars.TL_starGiftUnique;
                                    a();
                                    textView.setBackground(org.telegram.ui.ActionBar.j6.d0(org.telegram.messenger.g0.L(9.0f), stargiftattributebackdrop != null ? org.telegram.ui.ActionBar.j6.w(stargiftattributebackdrop.center_color | (-16777216), org.telegram.ui.ActionBar.j6.r1(0.55f, stargiftattributebackdrop.pattern_color | (-16777216))) : 0));
                                }
                            } else {
                                j12 = j14;
                            }
                            j11 = j12;
                            z15 = false;
                            if (starGift.auction) {
                            }
                            StringBuilder sb32 = new StringBuilder("XTR ");
                            sb32.append(hd.E(j11, ','));
                            sb32.append(z15 ? "+" : "");
                            textView2.setText(lb.a1(false, sb32.toString(), 0.71f, null));
                            this.t0 = 1;
                            this.u0 = starGift instanceof TL_stars.TL_starGiftUnique;
                            a();
                            textView.setBackground(org.telegram.ui.ActionBar.j6.d0(org.telegram.messenger.g0.L(9.0f), stargiftattributebackdrop != null ? org.telegram.ui.ActionBar.j6.w(stargiftattributebackdrop.center_color | (-16777216), org.telegram.ui.ActionBar.j6.r1(0.55f, stargiftattributebackdrop.pattern_color | (-16777216))) : 0));
                        }
                    }
                    long j15 = starGift.stars;
                    if (z11 && starGift.can_upgrade) {
                        j3 = j15;
                        j10 = starGift.upgrade_stars;
                    } else {
                        j3 = j15;
                        j10 = 0;
                    }
                    j11 = j3 + j10;
                    z15 = false;
                    if (starGift.auction) {
                    }
                    StringBuilder sb322 = new StringBuilder("XTR ");
                    sb322.append(hd.E(j11, ','));
                    sb322.append(z15 ? "+" : "");
                    textView2.setText(lb.a1(false, sb322.toString(), 0.71f, null));
                    this.t0 = 1;
                    this.u0 = starGift instanceof TL_stars.TL_starGiftUnique;
                    a();
                    textView.setBackground(org.telegram.ui.ActionBar.j6.d0(org.telegram.messenger.g0.L(9.0f), stargiftattributebackdrop != null ? org.telegram.ui.ActionBar.j6.w(stargiftattributebackdrop.center_color | (-16777216), org.telegram.ui.ActionBar.j6.r1(0.55f, stargiftattributebackdrop.pattern_color | (-16777216))) : 0));
                }
                g2 g2Var = this.K;
                ((ViewGroup.MarginLayoutParams) g2Var.getLayoutParams()).topMargin = org.telegram.messenger.g0.L(103.0f);
                ((FrameLayout.LayoutParams) g2Var.getLayoutParams()).gravity = 49;
                this.N.setVisibility(8);
                this.k0 = null;
                this.b0 = null;
                this.c0 = starGift;
                this.e0 = z10;
                this.f0 = null;
                this.g0 = z12;
                this.h0 = z13;
                this.i0 = false;
                this.j0 = z14;
                this.R = null;
                this.S = null;
                d(false, false);
                l();
            }
            colorFilter = null;
        }
        i9Var2.setColorFilter(colorFilter);
        this.q0 = false;
        i9Var2.setVisibility(8);
        if (z14) {
        }
        TextView textView22 = this.M;
        textView22.setVisibility(i14);
        textView22.setTextSize(1, 12.0f);
        o2 o2Var2 = this.L;
        if (!z10) {
        }
        g2 g2Var2 = this.K;
        ((ViewGroup.MarginLayoutParams) g2Var2.getLayoutParams()).topMargin = org.telegram.messenger.g0.L(103.0f);
        ((FrameLayout.LayoutParams) g2Var2.getLayoutParams()).gravity = 49;
        this.N.setVisibility(8);
        this.k0 = null;
        this.b0 = null;
        this.c0 = starGift;
        this.e0 = z10;
        this.f0 = null;
        this.g0 = z12;
        this.h0 = z13;
        this.i0 = false;
        this.j0 = z14;
        this.R = null;
        this.S = null;
        d(false, false);
        l();
    }

    public final boolean i(TL_stars.SavedStarGift savedStarGift, boolean z10, boolean z11) {
        long j3;
        boolean z12;
        o2 o2Var;
        boolean z13;
        ba baVar = this.O;
        if (baVar != null) {
            baVar.run();
            this.O = null;
        }
        j(savedStarGift.gift.getDocument(), savedStarGift);
        TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop = (TL_stars.starGiftAttributeBackdrop) u8.l(savedStarGift.gift.attributes, TL_stars.starGiftAttributeBackdrop.class);
        e2 e2Var = this.e;
        e2Var.d(stargiftattributebackdrop);
        e2Var.e((TL_stars.starGiftAttributePattern) u8.l(savedStarGift.gift.attributes, TL_stars.starGiftAttributePattern.class));
        e2Var.g(null);
        this.I.setVisibility(8);
        this.J.setVisibility(8);
        i9 i9Var = this.E;
        i9Var.setTranslationY(0.0f);
        ug.a1 a1Var = this.G;
        a1Var.I = true;
        a1Var.J = false;
        a1Var.invalidate();
        a1Var.setBlendWithColor(stargiftattributebackdrop != null ? Integer.valueOf(org.telegram.ui.ActionBar.j6.r1(0.75f, stargiftattributebackdrop.center_color | (-16777216))) : null);
        ug.a1 a1Var2 = this.H;
        a1Var2.I = true;
        a1Var2.J = false;
        a1Var2.invalidate();
        a1Var2.setBlendWithColor(stargiftattributebackdrop != null ? Integer.valueOf(org.telegram.ui.ActionBar.j6.r1(0.75f, stargiftattributebackdrop.center_color | (-16777216))) : null);
        int i7 = savedStarGift.gift.resale_ton_only ? 0 : 8;
        ImageView imageView = this.x;
        imageView.setVisibility(i7);
        FrameLayout frameLayout = this.w;
        if (stargiftattributebackdrop != null) {
            frameLayout.setBackground(org.telegram.ui.ActionBar.j6.L(org.telegram.messenger.g0.L(20.0f), org.telegram.ui.ActionBar.j6.b(0.1f, -0.2f, stargiftattributebackdrop.center_color | (-16777216))));
        } else {
            int L = org.telegram.messenger.g0.L(20.0f);
            int i10 = org.telegram.ui.ActionBar.j6.Fi;
            org.telegram.ui.ActionBar.e6 e6Var = this.b;
            org.telegram.ui.ActionBar.q6.B(frameLayout, org.telegram.ui.ActionBar.j6.L(L, org.telegram.ui.ActionBar.j6.w0(i10, e6Var)), org.telegram.ui.ActionBar.q6.M(i10), e6Var);
        }
        FrameLayout.LayoutParams layoutParams = this.F;
        layoutParams.gravity = 17;
        i9Var.setLayoutParams(layoutParams);
        if (this.m0 == savedStarGift) {
            a1Var.setVisibility(0);
            a1Var.animate().alpha(savedStarGift.unsaved ? 1.0f : 0.0f).scaleX(savedStarGift.unsaved ? 1.0f : 0.4f).scaleY(savedStarGift.unsaved ? 1.0f : 0.4f).setDuration(350L).setInterpolator(er.h).withEndAction(new a1.e(26, this, savedStarGift)).start();
        } else {
            a1Var.setAlpha(savedStarGift.unsaved ? 1.0f : 0.0f);
            a1Var.setScaleX(savedStarGift.unsaved ? 1.0f : 0.4f);
            a1Var.setScaleY(savedStarGift.unsaved ? 1.0f : 0.4f);
            a1Var.setVisibility(savedStarGift.unsaved ? 0 : 8);
        }
        boolean z14 = savedStarGift.gift instanceof TL_stars.TL_starGiftUnique;
        i9 i9Var2 = this.n;
        i9Var2.setColorFilter(null);
        this.q0 = false;
        i9Var2.setLayoutParams(this.r);
        int i11 = this.a;
        if (z14 && savedStarGift.name_hidden) {
            i9Var2.setVisibility(8);
            j3 = 0;
        } else if (savedStarGift.name_hidden) {
            i9Var2.setVisibility(0);
            fq a10 = gb.a(44, "anonymous");
            j3 = 0;
            int L2 = org.telegram.messenger.g0.L(16.0f);
            int L3 = org.telegram.messenger.g0.L(16.0f);
            a10.e = L2;
            a10.f = L3;
            i9Var2.setImageDrawable(a10);
        } else {
            j3 = 0;
            long o4 = org.telegram.messenger.m5.o(savedStarGift.from_id);
            t8 t8Var = this.h;
            if (o4 > 0) {
                TLRPC.User a22 = np.s1(i11).a2(Long.valueOf(o4));
                if (a22 != null) {
                    i9Var2.setVisibility(0);
                    t8Var.r(a22);
                    i9Var2.f(a22, t8Var);
                } else {
                    i9Var2.setVisibility(8);
                }
            } else {
                TLRPC.Chat M0 = np.s1(i11).M0(Long.valueOf(-o4));
                if (M0 != null) {
                    i9Var2.setVisibility(0);
                    t8Var.q(M0);
                    i9Var2.f(M0, t8Var);
                } else {
                    i9Var2.setVisibility(8);
                }
            }
        }
        o2 o2Var2 = this.L;
        g2 g2Var = this.K;
        TextView textView = this.M;
        if (stargiftattributebackdrop == null || savedStarGift.gift.resell_amount == null) {
            if (z10) {
                textView.setVisibility(8);
                this.F.topMargin = org.telegram.messenger.g0.L(12.0f);
                this.F.bottomMargin = org.telegram.messenger.g0.L(12.0f);
            } else {
                textView.setVisibility(0);
                FrameLayout.LayoutParams layoutParams2 = this.F;
                layoutParams2.topMargin = 0;
                layoutParams2.bottomMargin = 0;
            }
            if (z14) {
                textView.setPadding(org.telegram.messenger.g0.L(8.0f), 0, org.telegram.messenger.g0.L(8.0f), 0);
                i5.c.w(textView, 1, 12.0f, null, 2131750059);
                z12 = true;
                o2Var = o2Var2;
            } else {
                textView.setPadding(org.telegram.messenger.g0.L(8.0f), 0, org.telegram.messenger.g0.L(10.0f), 0);
                textView.setTextSize(1, 12.0f);
                StringBuilder sb2 = new StringBuilder("XTR ");
                TL_stars.StarGift starGift = savedStarGift.gift;
                long j10 = starGift.stars;
                z12 = true;
                o2Var = o2Var2;
                long j11 = savedStarGift.convert_stars;
                if (j11 <= j3) {
                    j11 = starGift.convert_stars;
                }
                textView.setText(lb.a1(false, i5.c.l(Math.max(j10, j11), ',', sb2), 0.66f, null));
            }
            if (z14) {
                this.t0 = 0;
                textView.setTextColor(-1);
                o2Var.setBackground(new n2(1090519039));
                imageView.setBackground(org.telegram.ui.ActionBar.j6.d0(org.telegram.messenger.g0.L(10.0f), 1090519039));
                imageView.setColorFilter(-1);
            } else {
                this.t0 = 2;
                this.u0 = false;
                a();
            }
            ((FrameLayout.LayoutParams) g2Var.getLayoutParams()).gravity = 49;
            ((ViewGroup.MarginLayoutParams) g2Var.getLayoutParams()).topMargin = org.telegram.messenger.g0.L(103.0f);
        } else {
            textView.setVisibility(0);
            FrameLayout.LayoutParams layoutParams3 = this.F;
            layoutParams3.topMargin = 0;
            layoutParams3.bottomMargin = 0;
            textView.setPadding(org.telegram.messenger.g0.L(8.0f), 0, org.telegram.messenger.g0.L(10.0f), 0);
            textView.setTextSize(1, 12.0f);
            eq[] eqVarArr = new eq[1];
            TL_stars.StarGift starGift2 = savedStarGift.gift;
            if (starGift2.resale_ton_only && org.telegram.messenger.m5.o(starGift2.owner_id) == m10.i(i11).e()) {
                z13 = true;
                textView.setText(lb.s1(lb.X0(true, "XTR " + ((Object) lb.M0(savedStarGift.gift.getResellAmount(cg.b.b).o(), 1.0f, ',')), 0.95f, eqVarArr, 0.0f, 1.0f), true));
            } else {
                z13 = true;
                textView.setText(lb.U0("XTR " + hd.E(savedStarGift.gift.getResellStars(), ','), 0.95f, eqVarArr));
            }
            eq eqVar = eqVarArr[0];
            if (eqVar != null) {
                float L4 = org.telegram.messenger.g0.L(0.5f);
                eqVar.r = 0.0f;
                eqVar.s = L4;
            }
            int w10 = org.telegram.ui.ActionBar.j6.w(stargiftattributebackdrop.center_color | (-16777216), org.telegram.ui.ActionBar.j6.r1(0.55f, stargiftattributebackdrop.pattern_color | (-16777216)));
            this.t0 = 0;
            o2Var2.setBackground(new n2(1895825407, w10));
            textView.setTextColor(-1);
            imageView.setBackground(org.telegram.ui.ActionBar.j6.d0(org.telegram.messenger.g0.L(10.0f), w10));
            imageView.setColorFilter(-1);
            ((FrameLayout.LayoutParams) g2Var.getLayoutParams()).gravity = 49;
            ((ViewGroup.MarginLayoutParams) g2Var.getLayoutParams()).topMargin = org.telegram.messenger.g0.L(79.0f);
            z12 = z13;
        }
        this.N.setVisibility(8);
        this.m0 = savedStarGift;
        this.k0 = null;
        TL_stars.SavedStarGift savedStarGift2 = this.f0;
        this.b0 = null;
        this.c0 = null;
        this.e0 = false;
        this.f0 = savedStarGift;
        this.g0 = false;
        this.h0 = false;
        this.i0 = z11;
        this.R = null;
        this.S = null;
        d((!savedStarGift.pinned_to_top || (z14 && !savedStarGift.name_hidden)) ? false : z12, savedStarGift2 == savedStarGift ? z12 : false);
        l();
        if (savedStarGift2 == savedStarGift) {
            return z12;
        }
        return false;
    }

    public final void j(TLRPC.Document document, TLObject tLObject) {
        i9 i9Var = this.E;
        if (document == null) {
            i9Var.b();
            this.l0 = null;
        } else {
            if (this.l0 == document) {
                return;
            }
            this.l0 = document;
            TLRPC.PhotoSize w10 = w7.w(document.thumbs, org.telegram.messenger.g0.L(100.0f), false, null, false);
            i9Var.m(gc.b(document), "80_80_nolimit_pcache", gc.c(w10, document), "80_80_nolimit_pcache", org.telegram.messenger.t5.f(document, org.telegram.ui.ActionBar.j6.a7, 0.3f, null), tLObject);
        }
    }

    public final void k(boolean z10, boolean z11, float f10) {
        if (this.Q != f10) {
            this.Q = f10;
            TL_stars.TL_starGiftUnique uniqueStarGift = getUniqueStarGift();
            TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop = uniqueStarGift == null ? null : (TL_stars.starGiftAttributeBackdrop) u8.l(uniqueStarGift.attributes, TL_stars.starGiftAttributeBackdrop.class);
            int i7 = stargiftattributebackdrop == null ? -11184811 : stargiftattributebackdrop.pattern_color | (-16777216);
            float f11 = 1.0f - f10;
            ColorMatrixColorFilter colorMatrixColorFilter = f10 <= 0.0f ? null : new ColorMatrixColorFilter(new float[]{f11, 0.0f, 0.0f, 0.0f, Color.red(i7) * f10, 0.0f, f11, 0.0f, 0.0f, Color.green(i7) * f10, 0.0f, 0.0f, f11, 0.0f, Color.blue(i7) * f10, 0.0f, 0.0f, 0.0f, 1.0f - (0.5686275f * f10), 0.0f});
            i9 i9Var = this.E;
            i9Var.setColorFilter(colorMatrixColorFilter);
            i9Var.getImageReceiver().v0 = f10 == 0.0f;
            if (f10 > 0.0f) {
                i9Var.getImageReceiver().Q0();
                ch0 B = i9Var.getImageReceiver().B();
                if (B != null) {
                    B.N(0, false, false);
                }
            }
            i9Var.invalidate();
        }
        if (this.P != z10) {
            this.P = z10;
            if (getUniqueStarGift() != null) {
                String M0 = z10 ? hd.M0(2131743104, null) : i5.c.l(r2.num, ',', new StringBuilder("#"));
                j2 j2Var = this.f;
                if (!z11) {
                    j2Var.b(M0, true);
                    return;
                }
                j2Var.getClass();
                j2Var.b = M0;
                j2Var.a.g(10, M0);
            }
        }
    }

    public final void l() {
        TL_stars.SavedStarGift savedStarGift = this.f0;
        j2 j2Var = this.f;
        if (savedStarGift != null) {
            TL_stars.StarGift starGift = savedStarGift.gift;
            if (!(starGift instanceof TL_stars.TL_starGiftUnique)) {
                if (!starGift.limited) {
                    j2Var.setBackdrop(null);
                    j2Var.setVisibility(8);
                    return;
                }
                j2Var.setVisibility(0);
                setRibbonColorKey(org.telegram.ui.ActionBar.j6.Cj);
                j2Var.setStrokeColor(0);
                this.p0 = false;
                j2Var.setBackdrop(null);
                j2Var.b(hd.a0(null, null, 2131750135, org.telegram.messenger.g0.o0(this.f0.gift.availability_total, 0)), true);
                return;
            }
            j2Var.setVisibility(0);
            if (this.f0.gift.resell_amount == null) {
                setRibbonColorKey(org.telegram.ui.ActionBar.j6.Cj);
                j2Var.setStrokeColor(0);
                this.p0 = false;
                j2Var.setBackdrop((TL_stars.starGiftAttributeBackdrop) u8.l(this.f0.gift.attributes, TL_stars.starGiftAttributeBackdrop.class));
                j2Var.b(i5.c.l(this.f0.gift.num, ',', new StringBuilder("#")), true);
                return;
            }
            int i7 = org.telegram.ui.ActionBar.j6.d6;
            org.telegram.ui.ActionBar.e6 e6Var = this.b;
            int w10 = org.telegram.ui.ActionBar.j6.w(org.telegram.ui.ActionBar.j6.w0(i7, e6Var), org.telegram.ui.ActionBar.j6.r1(0.04f, org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.G6, e6Var)));
            setRibbonColorKey(org.telegram.ui.ActionBar.j6.lk);
            j2Var.setStrokeColor(w10);
            this.p0 = true;
            j2Var.setBackdrop(null);
            j2Var.b(hd.M0(2131750089, null), false);
            return;
        }
        TL_stars.StarGift starGift2 = this.c0;
        if (starGift2 == null) {
            ug.j jVar = this.b0;
            if (jVar != null) {
                if (jVar.b() <= 0) {
                    j2Var.setVisibility(8);
                    j2Var.setBackdrop(null);
                    j2Var.setStrokeColor(0);
                    this.p0 = false;
                    return;
                }
                j2Var.setVisibility(0);
                j2Var.setBackdrop(null);
                this.o0 = -1;
                j2Var.a(-2535425, -8229377);
                j2Var.setStrokeColor(0);
                this.p0 = false;
                String a02 = hd.a0(null, null, 2131749664, Integer.valueOf(this.b0.b()));
                j2Var.b = a02;
                j2Var.a.f(12, a02, true);
                return;
            }
            return;
        }
        if (this.h0 || this.j0) {
            j2Var.setVisibility(0);
            setRibbonColorKey(org.telegram.ui.ActionBar.j6.Cj);
            j2Var.setBackdrop((TL_stars.starGiftAttributeBackdrop) u8.l(this.c0.attributes, TL_stars.starGiftAttributeBackdrop.class));
            j2Var.setStrokeColor(0);
            this.p0 = false;
            j2Var.b(i5.c.l(this.c0.num, ',', new StringBuilder("#")), true);
            return;
        }
        if (this.g0 && starGift2.availability_resale > 0) {
            j2Var.setVisibility(0);
            setRibbonColorKey(org.telegram.ui.ActionBar.j6.lk);
            j2Var.setStrokeColor(0);
            this.p0 = false;
            j2Var.setBackdrop(null);
            j2Var.b(hd.M0(2131750030, null), false);
            return;
        }
        if (this.e0) {
            j2Var.setVisibility(0);
            setRibbonColorKey(org.telegram.ui.ActionBar.j6.Cj);
            j2Var.setStrokeColor(0);
            this.p0 = false;
            j2Var.setBackdrop((TL_stars.starGiftAttributeBackdrop) u8.l(this.c0.attributes, TL_stars.starGiftAttributeBackdrop.class));
            j2Var.b(hd.a0(null, null, 2131750135, org.telegram.messenger.g0.o0(this.c0.availability_issued, 0)), true);
            return;
        }
        boolean z10 = starGift2.limited;
        if (z10 && starGift2.availability_remains <= 0) {
            j2Var.setVisibility(0);
            setRibbonColorKey(org.telegram.ui.ActionBar.j6.Dj);
            j2Var.setStrokeColor(0);
            this.p0 = false;
            j2Var.setBackdrop(null);
            j2Var.b(hd.M0(2131749976, null), true);
            return;
        }
        if (starGift2.auction) {
            j2Var.setVisibility(0);
            j2Var.setBackdrop(null);
            this.o0 = -1;
            j2Var.a(-2650077, -4227818);
            j2Var.setStrokeColor(0);
            this.p0 = false;
            if (this.c0.auction_start_date > ConnectionsManager.getInstance(this.a).getCurrentTime()) {
                j2Var.b(hd.M0(2131750133, null), true);
                return;
            } else {
                j2Var.b(hd.M0(2131750134, null), true);
                return;
            }
        }
        if (starGift2.require_premium) {
            j2Var.setVisibility(0);
            j2Var.setBackdrop(null);
            this.o0 = -1;
            j2Var.a(-2650077, -4227818);
            j2Var.setStrokeColor(0);
            this.p0 = false;
            j2Var.b(hd.M0(2131750132, null), true);
            return;
        }
        if (!z10) {
            j2Var.setBackdrop(null);
            j2Var.setStrokeColor(0);
            this.p0 = false;
            j2Var.setVisibility(8);
            return;
        }
        j2Var.setVisibility(0);
        setRibbonColorKey(org.telegram.ui.ActionBar.j6.Cj);
        j2Var.setStrokeColor(0);
        this.p0 = false;
        j2Var.setBackdrop(null);
        j2Var.b(hd.M0(2131750131, null), true);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0071 A[Catch: Exception -> 0x0163, TryCatch #0 {Exception -> 0x0163, blocks: (B:5:0x0017, B:10:0x0025, B:12:0x002b, B:14:0x0035, B:15:0x006b, B:17:0x0071, B:18:0x0078, B:21:0x0081, B:23:0x0087, B:25:0x0091, B:28:0x009f, B:30:0x00a5, B:32:0x00af, B:33:0x00b5, B:35:0x00b9, B:39:0x00c3, B:41:0x00c9, B:43:0x00d3, B:44:0x00dd, B:46:0x00e1, B:48:0x00e5, B:49:0x00f2, B:51:0x00f6, B:53:0x00fc, B:55:0x0100, B:57:0x0104, B:59:0x010a, B:64:0x011c, B:66:0x012a, B:67:0x0140, B:69:0x0146, B:70:0x012f, B:72:0x013e, B:73:0x014c, B:75:0x0150, B:77:0x0156, B:78:0x015c, B:83:0x003a, B:85:0x003e, B:87:0x0042, B:89:0x0046, B:91:0x004e, B:92:0x0055, B:94:0x0059, B:96:0x005d, B:98:0x0065), top: B:4:0x0017 }] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0081 A[Catch: Exception -> 0x0163, TRY_ENTER, TryCatch #0 {Exception -> 0x0163, blocks: (B:5:0x0017, B:10:0x0025, B:12:0x002b, B:14:0x0035, B:15:0x006b, B:17:0x0071, B:18:0x0078, B:21:0x0081, B:23:0x0087, B:25:0x0091, B:28:0x009f, B:30:0x00a5, B:32:0x00af, B:33:0x00b5, B:35:0x00b9, B:39:0x00c3, B:41:0x00c9, B:43:0x00d3, B:44:0x00dd, B:46:0x00e1, B:48:0x00e5, B:49:0x00f2, B:51:0x00f6, B:53:0x00fc, B:55:0x0100, B:57:0x0104, B:59:0x010a, B:64:0x011c, B:66:0x012a, B:67:0x0140, B:69:0x0146, B:70:0x012f, B:72:0x013e, B:73:0x014c, B:75:0x0150, B:77:0x0156, B:78:0x015c, B:83:0x003a, B:85:0x003e, B:87:0x0042, B:89:0x0046, B:91:0x004e, B:92:0x0055, B:94:0x0059, B:96:0x005d, B:98:0x0065), top: B:4:0x0017 }] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x009f A[Catch: Exception -> 0x0163, TRY_ENTER, TryCatch #0 {Exception -> 0x0163, blocks: (B:5:0x0017, B:10:0x0025, B:12:0x002b, B:14:0x0035, B:15:0x006b, B:17:0x0071, B:18:0x0078, B:21:0x0081, B:23:0x0087, B:25:0x0091, B:28:0x009f, B:30:0x00a5, B:32:0x00af, B:33:0x00b5, B:35:0x00b9, B:39:0x00c3, B:41:0x00c9, B:43:0x00d3, B:44:0x00dd, B:46:0x00e1, B:48:0x00e5, B:49:0x00f2, B:51:0x00f6, B:53:0x00fc, B:55:0x0100, B:57:0x0104, B:59:0x010a, B:64:0x011c, B:66:0x012a, B:67:0x0140, B:69:0x0146, B:70:0x012f, B:72:0x013e, B:73:0x014c, B:75:0x0150, B:77:0x0156, B:78:0x015c, B:83:0x003a, B:85:0x003e, B:87:0x0042, B:89:0x0046, B:91:0x004e, B:92:0x0055, B:94:0x0059, B:96:0x005d, B:98:0x0065), top: B:4:0x0017 }] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00af A[Catch: Exception -> 0x0163, TryCatch #0 {Exception -> 0x0163, blocks: (B:5:0x0017, B:10:0x0025, B:12:0x002b, B:14:0x0035, B:15:0x006b, B:17:0x0071, B:18:0x0078, B:21:0x0081, B:23:0x0087, B:25:0x0091, B:28:0x009f, B:30:0x00a5, B:32:0x00af, B:33:0x00b5, B:35:0x00b9, B:39:0x00c3, B:41:0x00c9, B:43:0x00d3, B:44:0x00dd, B:46:0x00e1, B:48:0x00e5, B:49:0x00f2, B:51:0x00f6, B:53:0x00fc, B:55:0x0100, B:57:0x0104, B:59:0x010a, B:64:0x011c, B:66:0x012a, B:67:0x0140, B:69:0x0146, B:70:0x012f, B:72:0x013e, B:73:0x014c, B:75:0x0150, B:77:0x0156, B:78:0x015c, B:83:0x003a, B:85:0x003e, B:87:0x0042, B:89:0x0046, B:91:0x004e, B:92:0x0055, B:94:0x0059, B:96:0x005d, B:98:0x0065), top: B:4:0x0017 }] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00b9 A[Catch: Exception -> 0x0163, TRY_LEAVE, TryCatch #0 {Exception -> 0x0163, blocks: (B:5:0x0017, B:10:0x0025, B:12:0x002b, B:14:0x0035, B:15:0x006b, B:17:0x0071, B:18:0x0078, B:21:0x0081, B:23:0x0087, B:25:0x0091, B:28:0x009f, B:30:0x00a5, B:32:0x00af, B:33:0x00b5, B:35:0x00b9, B:39:0x00c3, B:41:0x00c9, B:43:0x00d3, B:44:0x00dd, B:46:0x00e1, B:48:0x00e5, B:49:0x00f2, B:51:0x00f6, B:53:0x00fc, B:55:0x0100, B:57:0x0104, B:59:0x010a, B:64:0x011c, B:66:0x012a, B:67:0x0140, B:69:0x0146, B:70:0x012f, B:72:0x013e, B:73:0x014c, B:75:0x0150, B:77:0x0156, B:78:0x015c, B:83:0x003a, B:85:0x003e, B:87:0x0042, B:89:0x0046, B:91:0x004e, B:92:0x0055, B:94:0x0059, B:96:0x005d, B:98:0x0065), top: B:4:0x0017 }] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00e1 A[Catch: Exception -> 0x0163, TryCatch #0 {Exception -> 0x0163, blocks: (B:5:0x0017, B:10:0x0025, B:12:0x002b, B:14:0x0035, B:15:0x006b, B:17:0x0071, B:18:0x0078, B:21:0x0081, B:23:0x0087, B:25:0x0091, B:28:0x009f, B:30:0x00a5, B:32:0x00af, B:33:0x00b5, B:35:0x00b9, B:39:0x00c3, B:41:0x00c9, B:43:0x00d3, B:44:0x00dd, B:46:0x00e1, B:48:0x00e5, B:49:0x00f2, B:51:0x00f6, B:53:0x00fc, B:55:0x0100, B:57:0x0104, B:59:0x010a, B:64:0x011c, B:66:0x012a, B:67:0x0140, B:69:0x0146, B:70:0x012f, B:72:0x013e, B:73:0x014c, B:75:0x0150, B:77:0x0156, B:78:0x015c, B:83:0x003a, B:85:0x003e, B:87:0x0042, B:89:0x0046, B:91:0x004e, B:92:0x0055, B:94:0x0059, B:96:0x005d, B:98:0x0065), top: B:4:0x0017 }] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00f6 A[Catch: Exception -> 0x0163, TryCatch #0 {Exception -> 0x0163, blocks: (B:5:0x0017, B:10:0x0025, B:12:0x002b, B:14:0x0035, B:15:0x006b, B:17:0x0071, B:18:0x0078, B:21:0x0081, B:23:0x0087, B:25:0x0091, B:28:0x009f, B:30:0x00a5, B:32:0x00af, B:33:0x00b5, B:35:0x00b9, B:39:0x00c3, B:41:0x00c9, B:43:0x00d3, B:44:0x00dd, B:46:0x00e1, B:48:0x00e5, B:49:0x00f2, B:51:0x00f6, B:53:0x00fc, B:55:0x0100, B:57:0x0104, B:59:0x010a, B:64:0x011c, B:66:0x012a, B:67:0x0140, B:69:0x0146, B:70:0x012f, B:72:0x013e, B:73:0x014c, B:75:0x0150, B:77:0x0156, B:78:0x015c, B:83:0x003a, B:85:0x003e, B:87:0x0042, B:89:0x0046, B:91:0x004e, B:92:0x0055, B:94:0x0059, B:96:0x005d, B:98:0x0065), top: B:4:0x0017 }] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0150 A[Catch: Exception -> 0x0163, TryCatch #0 {Exception -> 0x0163, blocks: (B:5:0x0017, B:10:0x0025, B:12:0x002b, B:14:0x0035, B:15:0x006b, B:17:0x0071, B:18:0x0078, B:21:0x0081, B:23:0x0087, B:25:0x0091, B:28:0x009f, B:30:0x00a5, B:32:0x00af, B:33:0x00b5, B:35:0x00b9, B:39:0x00c3, B:41:0x00c9, B:43:0x00d3, B:44:0x00dd, B:46:0x00e1, B:48:0x00e5, B:49:0x00f2, B:51:0x00f6, B:53:0x00fc, B:55:0x0100, B:57:0x0104, B:59:0x010a, B:64:0x011c, B:66:0x012a, B:67:0x0140, B:69:0x0146, B:70:0x012f, B:72:0x013e, B:73:0x014c, B:75:0x0150, B:77:0x0156, B:78:0x015c, B:83:0x003a, B:85:0x003e, B:87:0x0042, B:89:0x0046, B:91:0x004e, B:92:0x0055, B:94:0x0059, B:96:0x005d, B:98:0x0065), top: B:4:0x0017 }] */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        CharSequence charSequence;
        TL_stars.StarGift starGift;
        TextView textView;
        j2 j2Var;
        g2 g2Var;
        TL_stars.SavedStarGift savedStarGift;
        TL_stars.SavedStarGift savedStarGift2;
        fp fpVar;
        i9 i9Var;
        long o4;
        TextView textView2;
        CharSequence text;
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("android.widget.Button");
        accessibilityNodeInfo.setClickable(true);
        if (isEnabled()) {
            accessibilityNodeInfo.addAction(16);
        }
        try {
            StringBuilder sb2 = new StringBuilder();
            String str = null;
            if (this.b0 == null) {
                TL_stars.SavedStarGift savedStarGift3 = this.f0;
                if (savedStarGift3 != null && (starGift = savedStarGift3.gift) != null) {
                    if ((starGift instanceof TL_stars.TL_starGiftUnique) && !TextUtils.isEmpty(starGift.title)) {
                        charSequence = this.f0.gift.title;
                        if (TextUtils.isEmpty(charSequence)) {
                        }
                        sb2.append(charSequence);
                        textView = this.J;
                        if (textView != null) {
                        }
                        j2Var = this.f;
                        if (j2Var != null) {
                        }
                        g2Var = this.K;
                        if (g2Var != null) {
                        }
                        savedStarGift = this.f0;
                        if (savedStarGift != null) {
                        }
                        savedStarGift2 = this.f0;
                        if (savedStarGift2 != null) {
                        }
                        fpVar = this.n0;
                        if (fpVar != null) {
                        }
                        accessibilityNodeInfo.setContentDescription(sb2.toString());
                    }
                    charSequence = null;
                    if (TextUtils.isEmpty(charSequence)) {
                    }
                    sb2.append(charSequence);
                    textView = this.J;
                    if (textView != null) {
                    }
                    j2Var = this.f;
                    if (j2Var != null) {
                    }
                    g2Var = this.K;
                    if (g2Var != null) {
                    }
                    savedStarGift = this.f0;
                    if (savedStarGift != null) {
                    }
                    savedStarGift2 = this.f0;
                    if (savedStarGift2 != null) {
                    }
                    fpVar = this.n0;
                    if (fpVar != null) {
                    }
                    accessibilityNodeInfo.setContentDescription(sb2.toString());
                }
                TL_stars.StarGift starGift2 = this.c0;
                if (starGift2 != null && (starGift2 instanceof TL_stars.TL_starGiftUnique) && !TextUtils.isEmpty(starGift2.title)) {
                    charSequence = this.c0.title;
                    if (TextUtils.isEmpty(charSequence)) {
                    }
                    sb2.append(charSequence);
                    textView = this.J;
                    if (textView != null) {
                    }
                    j2Var = this.f;
                    if (j2Var != null) {
                    }
                    g2Var = this.K;
                    if (g2Var != null) {
                    }
                    savedStarGift = this.f0;
                    if (savedStarGift != null) {
                    }
                    savedStarGift2 = this.f0;
                    if (savedStarGift2 != null) {
                    }
                    fpVar = this.n0;
                    if (fpVar != null) {
                    }
                    accessibilityNodeInfo.setContentDescription(sb2.toString());
                }
                charSequence = null;
                if (TextUtils.isEmpty(charSequence)) {
                }
                sb2.append(charSequence);
                textView = this.J;
                if (textView != null) {
                }
                j2Var = this.f;
                if (j2Var != null) {
                }
                g2Var = this.K;
                if (g2Var != null) {
                }
                savedStarGift = this.f0;
                if (savedStarGift != null) {
                }
                savedStarGift2 = this.f0;
                if (savedStarGift2 != null) {
                }
                fpVar = this.n0;
                if (fpVar != null) {
                }
                accessibilityNodeInfo.setContentDescription(sb2.toString());
            }
            TextView textView3 = this.I;
            if (textView3 != null && textView3.getVisibility() == 0 && !TextUtils.isEmpty(textView3.getText())) {
                charSequence = textView3.getText();
                if (TextUtils.isEmpty(charSequence)) {
                    charSequence = hd.M0(2131750192, null);
                }
                sb2.append(charSequence);
                textView = this.J;
                if (textView != null && textView.getVisibility() == 0 && !TextUtils.isEmpty(textView.getText())) {
                    sb2.append(", ");
                    sb2.append(textView.getText());
                }
                j2Var = this.f;
                if (j2Var != null && j2Var.getVisibility() == 0) {
                    text = j2Var.getText();
                    if (!TextUtils.isEmpty(text)) {
                        sb2.append(", ");
                        sb2.append(text);
                    }
                }
                g2Var = this.K;
                if (g2Var != null && g2Var.getVisibility() == 0 && (textView2 = this.M) != null && textView2.getVisibility() == 0 && !TextUtils.isEmpty(textView2.getText())) {
                    sb2.append(", ");
                    sb2.append(textView2.getText());
                }
                savedStarGift = this.f0;
                if (savedStarGift != null && savedStarGift.unsaved) {
                    sb2.append(", ");
                    sb2.append(hd.M0(2131750200, null));
                }
                savedStarGift2 = this.f0;
                if (savedStarGift2 != null && !(savedStarGift2.gift instanceof TL_stars.TL_starGiftUnique) && !savedStarGift2.name_hidden && (i9Var = this.n) != null && i9Var.getVisibility() == 0) {
                    o4 = org.telegram.messenger.m5.o(this.f0.from_id);
                    if (o4 != 0) {
                        int i7 = this.a;
                        if (o4 > 0) {
                            TLRPC.User a22 = np.s1(i7).a2(Long.valueOf(o4));
                            if (a22 != null) {
                                str = q10.p(a22);
                            }
                        } else {
                            TLRPC.Chat M0 = np.s1(i7).M0(Long.valueOf(-o4));
                            if (M0 != null) {
                                str = M0.title;
                            }
                        }
                        if (!TextUtils.isEmpty(str)) {
                            sb2.append(", ");
                            sb2.append((CharSequence) str);
                        }
                    }
                }
                fpVar = this.n0;
                if (fpVar != null && fpVar.a.q) {
                    accessibilityNodeInfo.setCheckable(true);
                    accessibilityNodeInfo.setChecked(true);
                }
                accessibilityNodeInfo.setContentDescription(sb2.toString());
            }
            charSequence = null;
            if (TextUtils.isEmpty(charSequence)) {
            }
            sb2.append(charSequence);
            textView = this.J;
            if (textView != null) {
                sb2.append(", ");
                sb2.append(textView.getText());
            }
            j2Var = this.f;
            if (j2Var != null) {
                text = j2Var.getText();
                if (!TextUtils.isEmpty(text)) {
                }
            }
            g2Var = this.K;
            if (g2Var != null) {
                sb2.append(", ");
                sb2.append(textView2.getText());
            }
            savedStarGift = this.f0;
            if (savedStarGift != null) {
                sb2.append(", ");
                sb2.append(hd.M0(2131750200, null));
            }
            savedStarGift2 = this.f0;
            if (savedStarGift2 != null) {
                o4 = org.telegram.messenger.m5.o(this.f0.from_id);
                if (o4 != 0) {
                }
            }
            fpVar = this.n0;
            if (fpVar != null) {
                accessibilityNodeInfo.setCheckable(true);
                accessibilityNodeInfo.setChecked(true);
            }
            accessibilityNodeInfo.setContentDescription(sb2.toString());
        } catch (Exception unused) {
        }
    }

    public void setImageLayer(int i7) {
        this.E.setLayerNum(i7);
    }

    public void setImageSize(int i7) {
        FrameLayout.LayoutParams layoutParams = this.F;
        layoutParams.width = i7;
        layoutParams.height = i7;
    }

    public void setRibbonColor(int i7) {
        this.o0 = -1;
        j2 j2Var = this.f;
        j2Var.setColor(i7);
        j2Var.invalidate();
    }

    public void setRibbonText(String str) {
        this.f.b(str, true);
    }

    public void setRibbonTextOneOf(int i7) {
        j2 j2Var = this.f;
        j2Var.setVisibility(0);
        setRibbonColorKey(org.telegram.ui.ActionBar.j6.Cj);
        j2Var.setStrokeColor(0);
        this.p0 = false;
        j2Var.setBackdrop((TL_stars.starGiftAttributeBackdrop) u8.l(this.c0.attributes, TL_stars.starGiftAttributeBackdrop.class));
        j2Var.b(hd.a0(null, null, 2131750135, org.telegram.messenger.g0.o0(i7, 0)), true);
    }

    @Override // org.telegram.ui.ActionBar.z5
    public final void updateColors() {
        int w02;
        i9 i9Var;
        int w03;
        try {
            boolean q10 = org.telegram.ui.ActionBar.j6.I.q();
            if (q10 != this.v0) {
                this.v0 = q10;
                if (this.t0 != 0 && this.L != null && this.M != null && this.x != null) {
                    a();
                }
                TextView textView = this.N;
                if (textView != null) {
                    textView.setTextColor(q10 ? -1333971 : -2722014);
                }
            }
            j2 j2Var = this.f;
            org.telegram.ui.ActionBar.e6 e6Var = this.b;
            if (j2Var != null) {
                int i7 = this.o0;
                if (i7 >= 0) {
                    l2 l2Var = j2Var.a;
                    ((Paint) l2Var.b).setColor(org.telegram.ui.ActionBar.j6.w0(i7, e6Var));
                    l2Var.invalidateSelf();
                }
                if (this.p0) {
                    j2Var.setStrokeColor(org.telegram.ui.ActionBar.j6.w(org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.d6, e6Var), org.telegram.ui.ActionBar.j6.r1(0.04f, org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.G6, e6Var))));
                }
                j2Var.invalidate();
            }
            if (this.q0 && (i9Var = this.n) != null && (w03 = org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.nk, e6Var)) != this.r0) {
                this.r0 = w03;
                i9Var.setColorFilter(new PorterDuffColorFilter(w03, PorterDuff.Mode.SRC_IN));
            }
            e2 e2Var = this.e;
            if (e2Var != null) {
                int[] iArr = this.s0;
                if (iArr != null && e2Var.m == iArr && (iArr[0] != (w02 = org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.Dj, e6Var)) || iArr[1] != w02)) {
                    iArr[1] = w02;
                    iArr[0] = w02;
                    e2Var.n = null;
                }
                e2Var.invalidateSelf();
            }
        } catch (Exception e10) {
            a8.g(e10, true);
        }
    }
}
