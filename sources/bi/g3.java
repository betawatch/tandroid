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
import c8.ma;
import c8.ra;
import di.fa;
import di.kb;
import di.pb;
import java.util.HashSet;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.gc;
import org.telegram.messenger.hd;
import org.telegram.messenger.k10;
import org.telegram.messenger.ls;
import org.telegram.messenger.np;
import org.telegram.messenger.o10;
import org.telegram.messenger.p10;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.nq;
import org.telegram.ui.Components.nr;
import org.telegram.ui.Components.oh0;
import org.telegram.ui.Components.op;
import org.telegram.ui.Components.oq;
import org.telegram.ui.Components.q9;
import org.telegram.ui.Components.tn0;
import org.telegram.ui.Components.w60;
import org.telegram.ui.Components.xy0;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes3.dex */
public class g3 extends FrameLayout implements org.telegram.ui.ActionBar.b6 {
    public static final int[] w0 = {-2781403, -3635939};
    public final q9 E;
    public FrameLayout.LayoutParams F;
    public final ug.b1 G;
    public final ug.b1 H;
    public final TextView I;
    public final TextView J;
    public final e3 K;
    public final m3 L;
    public final TextView M;
    public final TextView N;
    public fa O;
    public boolean P;
    public float Q;
    public xy0 R;
    public xy0 S;
    public final Rect T;
    public boolean U;
    public boolean V;
    public boolean W;
    public final int a;
    public final org.telegram.ui.Components.d6 a0;
    public final org.telegram.ui.ActionBar.h6 b;
    public ug.j b0;
    public final tn0 c;
    public TL_stars.StarGift c0;
    public final FrameLayout d;
    public boolean d0;
    public final c3 e;
    public boolean e0;
    public final h3 f;
    public TL_stars.SavedStarGift f0;
    public boolean g0;
    public final org.telegram.ui.Components.b9 h;
    public boolean h0;
    public boolean i0;
    public boolean j0;
    public ug.j k0;
    public TLRPC.Document l0;
    public TL_stars.SavedStarGift m0;
    public final q9 n;
    public op n0;
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

    public g3(int i7, Context context, org.telegram.ui.ActionBar.h6 h6Var) {
        super(context);
        this.Q = -1.0f;
        this.T = new Rect();
        this.a0 = new org.telegram.ui.Components.d6(this, 0L, 320L, nr.h);
        this.o0 = -1;
        this.v0 = org.telegram.ui.ActionBar.m6.I.q();
        this.a = i7;
        this.b = h6Var;
        ra.b(this, 0.04f, 1.5f);
        this.c = new tn0(this);
        FrameLayout frameLayout = new FrameLayout(context);
        this.d = frameLayout;
        c3 c3Var = new c3(frameLayout, h6Var, true);
        this.e = c3Var;
        frameLayout.setBackground(c3Var);
        addView(frameLayout, ma.e(-1, -1, ls.E1));
        h3 h3Var = new h3(context);
        this.f = h3Var;
        addView(h3Var, ma.d(-2, -2.0f, 53, 0.0f, 2.0f, 1.0f, 0.0f));
        q9 q9Var = new q9(context);
        this.E = q9Var;
        int i10 = 0;
        q9Var.getImageReceiver().W(0);
        FrameLayout.LayoutParams d = ma.d(80, 80.0f, 17, 0.0f, 12.0f, 0.0f, 12.0f);
        this.F = d;
        frameLayout.addView(q9Var, d);
        ug.b1 b1Var = new ug.b1(3, context, h6Var);
        this.G = b1Var;
        b1Var.setImageReceiver(q9Var.getImageReceiver());
        frameLayout.addView(b1Var, ma.d(30, 30.0f, 49, 0.0f, 38.0f, 0.0f, 0.0f));
        ug.b1 b1Var2 = new ug.b1(4, context, h6Var);
        this.H = b1Var2;
        b1Var2.setImageReceiver(q9Var.getImageReceiver());
        frameLayout.addView(b1Var2, ma.e(44, 44, 17));
        b1Var2.setAlpha(0.0f);
        b1Var2.setScaleX(0.3f);
        b1Var2.setScaleY(0.3f);
        b1Var2.setVisibility(8);
        TextView textView = new TextView(context);
        this.I = textView;
        int i11 = org.telegram.ui.ActionBar.m6.G6;
        org.telegram.ui.ActionBar.t6.U(textView, i11, h6Var);
        textView.setGravity(17);
        textView.setTextSize(1, 14.0f);
        textView.setTypeface(org.telegram.messenger.g0.o());
        TextView m10 = org.telegram.ui.Cells.c0.m(frameLayout, textView, ma.d(-1, -2.0f, 48, 0.0f, 89.0f, 0.0f, 0.0f), context);
        this.J = m10;
        org.telegram.ui.ActionBar.t6.U(m10, i11, h6Var);
        m10.setGravity(17);
        m10.setTextSize(1, 12.0f);
        frameLayout.addView(m10, ma.d(-1, -2.0f, 48, 0.0f, 107.0f, 0.0f, 0.0f));
        e3 e3Var = new e3(i10, context, this);
        this.K = e3Var;
        TextView textView2 = new TextView(context);
        this.M = textView2;
        textView2.setTextSize(1, 12.0f);
        textView2.setTypeface(org.telegram.messenger.g0.o());
        textView2.setPadding(org.telegram.messenger.g0.L(10.0f), 0, org.telegram.messenger.g0.L(10.0f), 0);
        textView2.setGravity(17);
        textView2.setTextColor(-13397548);
        frameLayout.addView(e3Var, ma.d(-2, -2.0f, 81, 0.0f, 0.0f, 0.0f, 11.0f));
        m3 m3Var = new m3(context, i10);
        this.L = m3Var;
        m3Var.setBackgroundColor(-16776961);
        e3Var.addView(m3Var, ma.c(0.0f, 0));
        e3Var.addView(textView2, ma.e(-2, 26, 17));
        m3Var.setBackground(new l3(org.telegram.ui.ActionBar.m6.I.q() ? 518759725 : 1088989954));
        TextView textView3 = new TextView(context);
        this.N = textView3;
        textView3.setTextSize(1, 10.66f);
        textView3.setGravity(17);
        textView3.setTextColor(org.telegram.ui.ActionBar.m6.I.q() ? -1333971 : -2722014);
        textView3.setVisibility(8);
        frameLayout.addView(textView3, ma.d(-2, -2.0f, 49, 0.0f, 161.0f, 0.0f, 8.0f));
        this.h = new org.telegram.ui.Components.b9((org.telegram.ui.ActionBar.h6) null);
        q9 q9Var2 = new q9(context);
        this.n = q9Var2;
        q9Var2.setRoundRadius(org.telegram.messenger.g0.L(20.0f));
        q9Var2.setVisibility(8);
        FrameLayout.LayoutParams d2 = ma.d(20, 20.0f, 51, 2.0f, 2.0f, 2.0f, 2.0f);
        this.r = d2;
        frameLayout.addView(q9Var2, d2);
        this.s = ma.d(20, 20.0f, 51, 5.0f, 5.0f, 2.0f, 2.0f);
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.w = frameLayout2;
        frameLayout2.setAlpha(0.0f);
        frameLayout2.setScaleX(0.3f);
        frameLayout2.setScaleY(0.3f);
        frameLayout2.setVisibility(8);
        ImageView e10 = o10.e(context, R.drawable.msg_limit_pin);
        e10.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        e10.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
        frameLayout2.addView(e10, ma.a(12.66f, 12.66f, 17));
        frameLayout.addView(frameLayout2, ma.d(20, 20.0f, 51, 2.0f, 2.0f, 2.0f, 2.0f));
        ImageView imageView = new ImageView(context);
        this.x = imageView;
        imageView.setImageResource(R.drawable.mini_gram_14);
        imageView.setPadding(0, org.telegram.messenger.g0.L(2.0f), 0, 0);
        imageView.setVisibility(8);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        frameLayout.addView(imageView, ma.d(20, 20.0f, 51, 3.0f, 3.0f, 3.0f, 3.0f));
        TextView textView4 = new TextView(context);
        this.y = textView4;
        textView4.setTextSize(1, 10.0f);
        textView4.setTypeface(org.telegram.messenger.g0.o());
        textView4.setPadding(org.telegram.messenger.g0.L(5.0f), 0, org.telegram.messenger.g0.L(5.0f), 0);
        textView4.setGravity(17);
        textView4.setTextColor(-1);
        frameLayout.addView(textView4, ma.d(-2, 17.0f, 51, 4.0f, 4.0f, 0.0f, 0.0f));
        textView4.setVisibility(8);
        setImportantForAccessibility(1);
        frameLayout.setImportantForAccessibility(4);
        h3Var.setImportantForAccessibility(2);
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
        this.f.setColor(org.telegram.ui.ActionBar.m6.w0(i7, this.b));
        this.o0 = i7;
    }

    public final void a() {
        boolean q10 = org.telegram.ui.ActionBar.m6.I.q();
        this.v0 = q10;
        int i7 = this.u0 ? 1090519039 : q10 ? 518759725 : 1088989954;
        int i10 = q10 ? -1333971 : this.t0 == 2 ? -4229632 : -2722014;
        this.L.setBackground(new l3(i7));
        this.M.setTextColor(i10);
        ImageView imageView = this.x;
        imageView.setColorFilter(i10);
        imageView.setBackground(org.telegram.ui.ActionBar.m6.d0(org.telegram.messenger.g0.L(10.0f), i7));
    }

    @Override // org.telegram.ui.ActionBar.b6
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.Cj));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.Dj));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.lk));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.nk));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.d6));
    }

    public void b(w60 w60Var, Canvas canvas, float f10, float f11, float f12) {
        float f13;
        e3 e3Var;
        float f14;
        ImageView imageView;
        TL_stars.TL_starGiftUnique tL_starGiftUnique;
        float f15;
        Canvas canvas2 = canvas;
        q9 q9Var = this.n;
        q9 q9Var2 = this.E;
        c3 c3Var = this.e;
        h3 h3Var = this.f;
        Rect rect = this.T;
        FrameLayout frameLayout = this.w;
        ImageView imageView2 = this.x;
        e3 e3Var2 = this.K;
        ug.b1 b1Var = this.G;
        canvas2.save();
        canvas2.scale(getScaleX(), getScaleY(), f10 / 2.0f, f11 / 2.0f);
        TL_stars.TL_starGiftUnique uniqueStarGift = getUniqueStarGift();
        float L = uniqueStarGift != null ? org.telegram.messenger.g0.L(63.0f) * f12 : 0.0f;
        c3Var.setBounds(0, 0, (int) f10, (int) f11);
        c3Var.b(canvas2, f12);
        c3Var.getPadding(rect);
        float W1 = org.telegram.messenger.g0.W1(f12, org.telegram.messenger.g0.L(80.0f), org.telegram.messenger.g0.L(120.0f));
        float f16 = f11 - L;
        q9Var2.getImageReceiver().y0((f10 - W1) / 2.0f, (f16 - W1) / 2.0f, W1, W1);
        q9Var2.getImageReceiver().h(canvas2, null);
        oh0 B = q9Var2.getImageReceiver().B();
        if (B != null && B.l0) {
            w60Var.invalidate();
        }
        if (b1Var.getVisibility() != 0 || b1Var.getAlpha() <= 0.0f) {
            f13 = 1.0f;
            e3Var = e3Var2;
            f14 = 0.0f;
            imageView = imageView2;
            tL_starGiftUnique = uniqueStarGift;
        } else {
            canvas2.save();
            canvas2.translate((f10 - b1Var.getMeasuredWidth()) / 2.0f, org.telegram.messenger.g0.T1(b1Var.getY(), (f16 - b1Var.getMeasuredHeight()) / 2.0f, f12));
            f13 = 1.0f;
            e3Var = e3Var2;
            f14 = 0.0f;
            imageView = imageView2;
            tL_starGiftUnique = uniqueStarGift;
            canvas2.saveLayerAlpha(0.0f, 0.0f, b1Var.getWidth(), b1Var.getHeight(), (int) (b1Var.getAlpha() * (1.0f - f12) * 255.0f), 31);
            b1Var.draw(canvas2);
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
        if (q9Var.getVisibility() == 0 && q9Var.getAlpha() > f14) {
            canvas2.save();
            canvas2.translate(org.telegram.messenger.g0.L(2.0f) + rect.left, org.telegram.messenger.g0.L(2.0f) + rect.top);
            q9Var.draw(canvas2);
            canvas2.restore();
        }
        if (h3Var.getVisibility() != 0 || h3Var.getAlpha() <= f14) {
            f15 = f13;
        } else {
            canvas2.save();
            canvas2.translate(f10 - org.telegram.messenger.g0.L(f13), org.telegram.messenger.g0.L(2.0f));
            f15 = f13;
            float T1 = org.telegram.messenger.g0.T1(f15, 1.25f, f12);
            canvas2.scale(T1, T1);
            canvas2.translate(-h3Var.getWidth(), f14);
            h3Var.draw(canvas2);
            canvas2.restore();
        }
        if (tL_starGiftUnique != null) {
            if (this.R == null) {
                this.R = new xy0(tL_starGiftUnique.title, 20.0f, org.telegram.messenger.g0.o());
            }
            if (this.S == null) {
                this.S = new xy0(hd.H(',', "Gift2CollectionNumber", tL_starGiftUnique.num), 13.0f, null);
            }
            xy0 xy0Var = this.R;
            xy0Var.p = f10 - org.telegram.messenger.g0.L(8.0f);
            float f17 = f15 - f12;
            xy0Var.c((f10 - this.R.k()) / 2.0f, ((f11 - org.telegram.messenger.g0.L(40.0f)) - (this.R.i() / 2.0f)) + (org.telegram.messenger.g0.L(50.0f) * f17), f12, -1, canvas);
            xy0 xy0Var2 = this.S;
            xy0Var2.p = f10 - org.telegram.messenger.g0.L(8.0f);
            xy0Var2.c((f10 - this.S.k()) / 2.0f, ((f11 - org.telegram.messenger.g0.L(19.0f)) - (this.S.i() / 2.0f)) + (org.telegram.messenger.g0.L(50.0f) * f17), 0.6f * f12, -1, canvas);
            canvas2 = canvas;
        }
        if (e3Var != null && e3Var.getVisibility() == 0) {
            canvas2.save();
            canvas2.translate(e3Var.getX(), e3Var.getY());
            canvas2.saveLayerAlpha(0.0f, 0.0f, e3Var.getWidth(), e3Var.getHeight(), (int) (e3Var.getAlpha() * (f15 - f12) * 255.0f), 31);
            e3Var.draw(canvas2);
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
            op opVar = new op(21, getContext(), null);
            this.n0 = opVar;
            opVar.b(-1, org.telegram.ui.ActionBar.m6.d6, org.telegram.ui.ActionBar.m6.k7);
            this.n0.setDrawUnchecked(false);
            this.d.addView(this.n0, ma.d(24, 24.0f, 51, 4.0f, 4.0f, 4.0f, 4.0f));
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
            frameLayout.animate().alpha(z10 ? 1.0f : 0.0f).scaleX(z10 ? 1.0f : 0.3f).scaleY(z10 ? 1.0f : 0.3f).withEndAction(new d3(this, z10, 1)).start();
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
            imageView.animate().translationX(z10 ? org.telegram.messenger.g0.L(6.0f) : 0.0f).translationY(z10 ? org.telegram.messenger.g0.L(6.0f) : 0.0f).setDuration(320L).setInterpolator(nr.h).start();
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
        ug.b1 b1Var = this.H;
        if (z11) {
            b1Var.setVisibility(0);
            b1Var.animate().alpha(z10 ? 1.0f : 0.0f).scaleX(z10 ? 1.0f : 0.3f).scaleY(z10 ? 1.0f : 0.3f).withEndAction(new d3(this, z10, 0)).start();
        } else {
            b1Var.setVisibility(z10 ? 0 : 8);
            b1Var.setAlpha(z10 ? 1.0f : 0.0f);
            b1Var.setScaleX(z10 ? 1.0f : 0.3f);
            b1Var.setScaleY(z10 ? 1.0f : 0.3f);
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

    /* JADX WARN: Removed duplicated region for block: B:49:0x015d  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x01ca  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x02cf  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x031f  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0333  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x02fe  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x02ec  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void h(TL_stars.StarGift starGift, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14) {
        long j3;
        boolean z15;
        TextView textView;
        int i7;
        boolean z16;
        fa faVar = this.O;
        ColorFilter colorFilter = null;
        if (faVar != null) {
            faVar.run();
            this.O = null;
        }
        j(starGift.getDocument(), starGift);
        TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop = (TL_stars.starGiftAttributeBackdrop) di.y8.l(starGift.attributes, TL_stars.starGiftAttributeBackdrop.class);
        c3 c3Var = this.e;
        c3Var.d(stargiftattributebackdrop);
        c3Var.e((TL_stars.starGiftAttributePattern) di.y8.l(starGift.attributes, TL_stars.starGiftAttributePattern.class));
        boolean z17 = starGift.auction;
        int[] iArr = w0;
        org.telegram.ui.ActionBar.h6 h6Var = this.b;
        if (!z17 || (((z16 = starGift.sold_out) && !this.d0) || (z12 && starGift.availability_resale > 0))) {
            if (!starGift.require_premium || (z12 && starGift.availability_resale > 0)) {
                iArr = null;
            }
            c3Var.g(iArr);
        } else if (z16) {
            int i10 = org.telegram.ui.ActionBar.m6.Dj;
            int[] iArr2 = {org.telegram.ui.ActionBar.m6.w0(i10, h6Var), org.telegram.ui.ActionBar.m6.w0(i10, h6Var)};
            this.s0 = iArr2;
            c3Var.g(iArr2);
        } else {
            c3Var.g(iArr);
        }
        this.I.setVisibility(8);
        this.J.setVisibility(8);
        q9 q9Var = this.E;
        q9Var.setTranslationY(0.0f);
        this.G.setVisibility(8);
        int i11 = starGift.resale_ton_only ? 0 : 8;
        ImageView imageView = this.x;
        imageView.setVisibility(i11);
        int i12 = z14 ? 0 : 8;
        TextView textView2 = this.y;
        textView2.setVisibility(i12);
        textView2.setTranslationX(starGift.resale_ton_only ? org.telegram.messenger.g0.L(23.0f) : 0.0f);
        textView2.setTranslationY(starGift.resale_ton_only ? org.telegram.messenger.g0.L(1.0f) : 0.0f);
        if (z14) {
            StringBuilder sb2 = new StringBuilder("+");
            int i13 = starGift.craft_chance_permille;
            sb2.append((Object) (i13 <= 0 ? "<0.1%" : ki.j.J0(i13)));
            textView2.setText(sb2.toString());
        }
        FrameLayout.LayoutParams layoutParams = this.F;
        layoutParams.gravity = 49;
        q9Var.setLayoutParams(layoutParams);
        int i14 = this.a;
        q9 q9Var2 = this.n;
        if (!z13) {
            if ((!z12 || starGift.availability_resale <= 0) && starGift.locked_until_date > ConnectionsManager.getInstance(i14).getCurrentTime()) {
                q9Var2.setVisibility(0);
                q9Var2.setLayoutParams(this.s);
                int w02 = org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.nk, h6Var);
                this.r0 = w02;
                q9Var2.setColorFilter(new PorterDuffColorFilter(w02, PorterDuff.Mode.SRC_IN));
                this.q0 = true;
                q9Var2.setImageResource(R.drawable.mini_gift_lock);
                int i15 = (z14 || z13) ? 0 : 8;
                TextView textView3 = this.M;
                textView3.setVisibility(i15);
                textView3.setTextSize(1, 12.0f);
                m3 m3Var = this.L;
                if (!z10) {
                    textView3.setPadding(org.telegram.messenger.g0.L(10.0f), 0, org.telegram.messenger.g0.L(10.0f), 0);
                    textView3.setText(hd.N0(2131749902, null));
                    int w10 = stargiftattributebackdrop != null ? org.telegram.ui.ActionBar.m6.w(stargiftattributebackdrop.center_color | (-16777216), org.telegram.ui.ActionBar.m6.r1(0.55f, stargiftattributebackdrop.pattern_color | (-16777216))) : 1090519039;
                    this.t0 = 0;
                    int L = org.telegram.messenger.g0.L(13.0f);
                    int w11 = org.telegram.ui.ActionBar.m6.w(w10, 822083583);
                    int i16 = w10;
                    m3Var.setBackground(org.telegram.ui.ActionBar.m6.k0(L, L, L, L, i16, w11, w11));
                    textView3.setTextColor(-1);
                    imageView.setColorFilter(-1);
                    int L2 = org.telegram.messenger.g0.L(10.0f);
                    int w12 = org.telegram.ui.ActionBar.m6.w(i16, 822083583);
                    imageView.setBackground(org.telegram.ui.ActionBar.m6.k0(L2, L2, L2, L2, i16, w12, w12));
                } else if (z13) {
                    textView3.setPadding(org.telegram.messenger.g0.L(8.0f), 0, org.telegram.messenger.g0.L(10.0f), 0);
                    int w13 = org.telegram.ui.ActionBar.m6.w(stargiftattributebackdrop.center_color | (-16777216), org.telegram.ui.ActionBar.m6.r1(0.55f, stargiftattributebackdrop.pattern_color | (-16777216)));
                    if (x4.m(starGift)) {
                        cg.b bVar = cg.b.b;
                        nq[] nqVarArr = new nq[1];
                        i7 = 0;
                        textView3.setText(pb.t1(pb.X0(true, "XTR " + ((Object) pb.M0(cg.a.j(starGift.getResellAmount(bVar).b, bVar).q(), 1.0f, ',')), 1.2f, nqVarArr), true));
                        nq nqVar = nqVarArr[0];
                        if (nqVar != null) {
                            float L3 = org.telegram.messenger.g0.L(0.5f);
                            nqVar.r = 0.0f;
                            nqVar.s = L3;
                        }
                    } else {
                        i7 = 0;
                        textView3.setText(pb.T0("XTR " + hd.E(starGift.getResellStars(), ',')));
                    }
                    this.t0 = i7;
                    m3Var.setBackground(new l3(1895825407, w13));
                    textView3.setTextColor(-1);
                    imageView.setColorFilter(-1);
                    imageView.setBackground(org.telegram.ui.ActionBar.m6.d0(org.telegram.messenger.g0.L(10.0f), w13));
                    textView2.setBackground(org.telegram.ui.ActionBar.m6.d0(org.telegram.messenger.g0.L(9.0f), w13));
                } else {
                    textView3.setPadding(org.telegram.messenger.g0.L(8.0f), 0, org.telegram.messenger.g0.L(10.0f), 0);
                    if (z12) {
                        long j10 = starGift.availability_resale;
                        if (j10 > 0) {
                            j3 = starGift.resell_min_stars;
                            if (j10 > 1 && j3 < ((org.telegram.messenger.j0) np.u1(i14).A7.q.b).c) {
                                z15 = true;
                                if (starGift.auction) {
                                    textView = textView3;
                                    if (starGift.availability_resale == 0) {
                                        textView.setText(hd.N0(starGift.sold_out ? 2131750319 : 2131750320, null));
                                        this.t0 = 1;
                                        this.u0 = starGift instanceof TL_stars.TL_starGiftUnique;
                                        a();
                                        textView2.setBackground(org.telegram.ui.ActionBar.m6.d0(org.telegram.messenger.g0.L(9.0f), stargiftattributebackdrop == null ? org.telegram.ui.ActionBar.m6.w(stargiftattributebackdrop.center_color | (-16777216), org.telegram.ui.ActionBar.m6.r1(0.55f, stargiftattributebackdrop.pattern_color | (-16777216))) : 0));
                                    }
                                } else {
                                    textView = textView3;
                                }
                                StringBuilder sb3 = new StringBuilder("XTR ");
                                sb3.append(hd.E(j3, ','));
                                sb3.append(z15 ? "+" : "");
                                textView.setText(pb.b1(false, sb3.toString(), 0.71f, null));
                                this.t0 = 1;
                                this.u0 = starGift instanceof TL_stars.TL_starGiftUnique;
                                a();
                                textView2.setBackground(org.telegram.ui.ActionBar.m6.d0(org.telegram.messenger.g0.L(9.0f), stargiftattributebackdrop == null ? org.telegram.ui.ActionBar.m6.w(stargiftattributebackdrop.center_color | (-16777216), org.telegram.ui.ActionBar.m6.r1(0.55f, stargiftattributebackdrop.pattern_color | (-16777216))) : 0));
                            }
                            z15 = false;
                            if (starGift.auction) {
                            }
                            StringBuilder sb32 = new StringBuilder("XTR ");
                            sb32.append(hd.E(j3, ','));
                            sb32.append(z15 ? "+" : "");
                            textView.setText(pb.b1(false, sb32.toString(), 0.71f, null));
                            this.t0 = 1;
                            this.u0 = starGift instanceof TL_stars.TL_starGiftUnique;
                            a();
                            textView2.setBackground(org.telegram.ui.ActionBar.m6.d0(org.telegram.messenger.g0.L(9.0f), stargiftattributebackdrop == null ? org.telegram.ui.ActionBar.m6.w(stargiftattributebackdrop.center_color | (-16777216), org.telegram.ui.ActionBar.m6.r1(0.55f, stargiftattributebackdrop.pattern_color | (-16777216))) : 0));
                        }
                    }
                    j3 = ((z11 && starGift.can_upgrade) ? starGift.upgrade_stars : 0L) + starGift.stars;
                    z15 = false;
                    if (starGift.auction) {
                    }
                    StringBuilder sb322 = new StringBuilder("XTR ");
                    sb322.append(hd.E(j3, ','));
                    sb322.append(z15 ? "+" : "");
                    textView.setText(pb.b1(false, sb322.toString(), 0.71f, null));
                    this.t0 = 1;
                    this.u0 = starGift instanceof TL_stars.TL_starGiftUnique;
                    a();
                    textView2.setBackground(org.telegram.ui.ActionBar.m6.d0(org.telegram.messenger.g0.L(9.0f), stargiftattributebackdrop == null ? org.telegram.ui.ActionBar.m6.w(stargiftattributebackdrop.center_color | (-16777216), org.telegram.ui.ActionBar.m6.r1(0.55f, stargiftattributebackdrop.pattern_color | (-16777216))) : 0));
                }
                e3 e3Var = this.K;
                ((ViewGroup.MarginLayoutParams) e3Var.getLayoutParams()).topMargin = org.telegram.messenger.g0.L(103.0f);
                ((FrameLayout.LayoutParams) e3Var.getLayoutParams()).gravity = 49;
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
        q9Var2.setColorFilter(colorFilter);
        this.q0 = false;
        q9Var2.setVisibility(8);
        if (z14) {
        }
        TextView textView32 = this.M;
        textView32.setVisibility(i15);
        textView32.setTextSize(1, 12.0f);
        m3 m3Var2 = this.L;
        if (!z10) {
        }
        e3 e3Var2 = this.K;
        ((ViewGroup.MarginLayoutParams) e3Var2.getLayoutParams()).topMargin = org.telegram.messenger.g0.L(103.0f);
        ((FrameLayout.LayoutParams) e3Var2.getLayoutParams()).gravity = 49;
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

    /* JADX WARN: Removed duplicated region for block: B:58:0x03fd  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0408 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x040b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x03ff  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean i(TL_stars.SavedStarGift savedStarGift, boolean z10, boolean z11) {
        int i7;
        int i10;
        int i11;
        fa faVar = this.O;
        if (faVar != null) {
            faVar.run();
            this.O = null;
        }
        j(savedStarGift.gift.getDocument(), savedStarGift);
        TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop = (TL_stars.starGiftAttributeBackdrop) di.y8.l(savedStarGift.gift.attributes, TL_stars.starGiftAttributeBackdrop.class);
        c3 c3Var = this.e;
        c3Var.d(stargiftattributebackdrop);
        c3Var.e((TL_stars.starGiftAttributePattern) di.y8.l(savedStarGift.gift.attributes, TL_stars.starGiftAttributePattern.class));
        c3Var.g(null);
        this.I.setVisibility(8);
        this.J.setVisibility(8);
        q9 q9Var = this.E;
        q9Var.setTranslationY(0.0f);
        ug.b1 b1Var = this.G;
        b1Var.I = true;
        b1Var.J = false;
        b1Var.invalidate();
        b1Var.setBlendWithColor(stargiftattributebackdrop != null ? Integer.valueOf(org.telegram.ui.ActionBar.m6.r1(0.75f, stargiftattributebackdrop.center_color | (-16777216))) : null);
        ug.b1 b1Var2 = this.H;
        b1Var2.I = true;
        b1Var2.J = false;
        b1Var2.invalidate();
        b1Var2.setBlendWithColor(stargiftattributebackdrop != null ? Integer.valueOf(org.telegram.ui.ActionBar.m6.r1(0.75f, stargiftattributebackdrop.center_color | (-16777216))) : null);
        int i12 = savedStarGift.gift.resale_ton_only ? 0 : 8;
        ImageView imageView = this.x;
        imageView.setVisibility(i12);
        FrameLayout frameLayout = this.w;
        if (stargiftattributebackdrop != null) {
            i7 = -16777216;
            frameLayout.setBackground(org.telegram.ui.ActionBar.m6.L(org.telegram.messenger.g0.L(20.0f), org.telegram.ui.ActionBar.m6.b(0.1f, -0.2f, stargiftattributebackdrop.center_color | (-16777216))));
        } else {
            i7 = -16777216;
            int L = org.telegram.messenger.g0.L(20.0f);
            int i13 = org.telegram.ui.ActionBar.m6.Fi;
            org.telegram.ui.ActionBar.h6 h6Var = this.b;
            org.telegram.ui.ActionBar.t6.B(frameLayout, org.telegram.ui.ActionBar.m6.L(L, org.telegram.ui.ActionBar.m6.w0(i13, h6Var)), org.telegram.ui.ActionBar.t6.M(i13), h6Var);
        }
        FrameLayout.LayoutParams layoutParams = this.F;
        layoutParams.gravity = 17;
        q9Var.setLayoutParams(layoutParams);
        if (this.m0 == savedStarGift) {
            b1Var.setVisibility(0);
            b1Var.animate().alpha(savedStarGift.unsaved ? 1.0f : 0.0f).scaleX(savedStarGift.unsaved ? 1.0f : 0.4f).scaleY(savedStarGift.unsaved ? 1.0f : 0.4f).setDuration(350L).setInterpolator(nr.h).withEndAction(new a1.e(26, this, savedStarGift)).start();
        } else {
            b1Var.setAlpha(savedStarGift.unsaved ? 1.0f : 0.0f);
            b1Var.setScaleX(savedStarGift.unsaved ? 1.0f : 0.4f);
            b1Var.setScaleY(savedStarGift.unsaved ? 1.0f : 0.4f);
            b1Var.setVisibility(savedStarGift.unsaved ? 0 : 8);
        }
        boolean z12 = savedStarGift.gift instanceof TL_stars.TL_starGiftUnique;
        q9 q9Var2 = this.n;
        q9Var2.setColorFilter(null);
        this.q0 = false;
        q9Var2.setLayoutParams(this.r);
        int i14 = this.a;
        if (z12 && savedStarGift.name_hidden) {
            q9Var2.setVisibility(8);
        } else if (savedStarGift.name_hidden) {
            q9Var2.setVisibility(0);
            oq a10 = kb.a(44, "anonymous");
            int L2 = org.telegram.messenger.g0.L(16.0f);
            int L3 = org.telegram.messenger.g0.L(16.0f);
            a10.e = L2;
            a10.f = L3;
            q9Var2.setImageDrawable(a10);
        } else {
            long o4 = org.telegram.messenger.n5.o(savedStarGift.from_id);
            org.telegram.ui.Components.b9 b9Var = this.h;
            if (o4 > 0) {
                TLRPC.User c22 = np.u1(i14).c2(Long.valueOf(o4));
                if (c22 != null) {
                    q9Var2.setVisibility(0);
                    b9Var.r(c22);
                    q9Var2.f(c22, b9Var);
                } else {
                    q9Var2.setVisibility(8);
                }
            } else {
                TLRPC.Chat O0 = np.u1(i14).O0(Long.valueOf(-o4));
                if (O0 != null) {
                    q9Var2.setVisibility(0);
                    b9Var.q(O0);
                    q9Var2.f(O0, b9Var);
                } else {
                    q9Var2.setVisibility(8);
                }
            }
        }
        m3 m3Var = this.L;
        e3 e3Var = this.K;
        TextView textView = this.M;
        if (stargiftattributebackdrop != null) {
            TL_stars.StarGift starGift = savedStarGift.gift;
            if (starGift.resell_amount != null && (!x4.m(starGift) || ((org.telegram.messenger.h0) np.u1(i14).A7.p0.b).c)) {
                textView.setVisibility(0);
                FrameLayout.LayoutParams layoutParams2 = this.F;
                layoutParams2.topMargin = 0;
                layoutParams2.bottomMargin = 0;
                textView.setPadding(org.telegram.messenger.g0.L(8.0f), 0, org.telegram.messenger.g0.L(10.0f), 0);
                textView.setTextSize(1, 12.0f);
                nq[] nqVarArr = new nq[1];
                boolean m10 = x4.m(savedStarGift.gift);
                cg.b bVar = cg.b.b;
                if (m10) {
                    TL_stars.StarGift starGift2 = savedStarGift.gift;
                    textView.setText(pb.t1(pb.X0(true, "XTR " + ((Object) pb.M0(cg.a.j(starGift2 == null ? 0L : starGift2.getResellAmount(bVar).b, bVar).q(), 1.0f, ',')), 1.2f, nqVarArr), true));
                } else {
                    TL_stars.StarGift starGift3 = savedStarGift.gift;
                    if (starGift3.resale_ton_only && org.telegram.messenger.n5.o(starGift3.owner_id) == k10.i(i14).e()) {
                        textView.setText(pb.t1(pb.X0(true, "XTR " + ((Object) pb.M0(savedStarGift.gift.getResellAmount(bVar).q(), 1.0f, ',')), 1.2f, nqVarArr), true));
                    } else {
                        textView.setText(pb.U0("XTR " + hd.E(savedStarGift.gift.getResellStars(), ','), 0.95f, nqVarArr));
                    }
                }
                nq nqVar = nqVarArr[0];
                if (nqVar != null) {
                    float L4 = org.telegram.messenger.g0.L(0.5f);
                    nqVar.r = 0.0f;
                    nqVar.s = L4;
                }
                int w10 = org.telegram.ui.ActionBar.m6.w(stargiftattributebackdrop.center_color | i7, org.telegram.ui.ActionBar.m6.r1(0.55f, stargiftattributebackdrop.pattern_color | i7));
                this.t0 = 0;
                m3Var.setBackground(new l3(1895825407, w10));
                textView.setTextColor(-1);
                imageView.setBackground(org.telegram.ui.ActionBar.m6.d0(org.telegram.messenger.g0.L(10.0f), w10));
                imageView.setColorFilter(-1);
                ((FrameLayout.LayoutParams) e3Var.getLayoutParams()).gravity = 49;
                ((ViewGroup.MarginLayoutParams) e3Var.getLayoutParams()).topMargin = org.telegram.messenger.g0.L(79.0f);
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
                d(!savedStarGift.pinned_to_top && (!z12 || savedStarGift.name_hidden), savedStarGift2 != savedStarGift);
                l();
                return savedStarGift2 != savedStarGift;
            }
        }
        if (z10) {
            textView.setVisibility(8);
            this.F.topMargin = org.telegram.messenger.g0.L(12.0f);
            this.F.bottomMargin = org.telegram.messenger.g0.L(12.0f);
            i10 = 0;
        } else {
            i10 = 0;
            textView.setVisibility(0);
            FrameLayout.LayoutParams layoutParams3 = this.F;
            layoutParams3.topMargin = 0;
            layoutParams3.bottomMargin = 0;
        }
        if (z12) {
            textView.setPadding(org.telegram.messenger.g0.L(8.0f), i10, org.telegram.messenger.g0.L(8.0f), i10);
            i5.c.r(12.0f, 1, 2131750042, textView, null);
            i11 = i10;
        } else {
            textView.setPadding(org.telegram.messenger.g0.L(8.0f), i10, org.telegram.messenger.g0.L(10.0f), i10);
            textView.setTextSize(1, 12.0f);
            StringBuilder sb2 = new StringBuilder("XTR ");
            TL_stars.StarGift starGift4 = savedStarGift.gift;
            long j3 = starGift4.stars;
            long j10 = savedStarGift.convert_stars;
            if (j10 <= 0) {
                j10 = starGift4.convert_stars;
            }
            String l10 = i5.c.l(Math.max(j3, j10), ',', sb2);
            i11 = 0;
            textView.setText(pb.b1(false, l10, 0.66f, null));
        }
        if (z12) {
            this.t0 = i11;
            textView.setTextColor(-1);
            m3Var.setBackground(new l3(1090519039));
            imageView.setBackground(org.telegram.ui.ActionBar.m6.d0(org.telegram.messenger.g0.L(10.0f), 1090519039));
            imageView.setColorFilter(-1);
        } else {
            this.t0 = 2;
            this.u0 = false;
            a();
        }
        ((FrameLayout.LayoutParams) e3Var.getLayoutParams()).gravity = 49;
        ((ViewGroup.MarginLayoutParams) e3Var.getLayoutParams()).topMargin = org.telegram.messenger.g0.L(103.0f);
        this.N.setVisibility(8);
        this.m0 = savedStarGift;
        this.k0 = null;
        TL_stars.SavedStarGift savedStarGift22 = this.f0;
        this.b0 = null;
        this.c0 = null;
        this.e0 = false;
        this.f0 = savedStarGift;
        this.g0 = false;
        this.h0 = false;
        this.i0 = z11;
        this.R = null;
        this.S = null;
        d(!savedStarGift.pinned_to_top && (!z12 || savedStarGift.name_hidden), savedStarGift22 != savedStarGift);
        l();
        if (savedStarGift22 != savedStarGift) {
        }
    }

    public final void j(TLRPC.Document document, TLObject tLObject) {
        q9 q9Var = this.E;
        if (document == null) {
            q9Var.b();
            this.l0 = null;
        } else {
            if (this.l0 == document) {
                return;
            }
            this.l0 = document;
            TLRPC.PhotoSize w10 = org.telegram.messenger.w7.w(document.thumbs, org.telegram.messenger.g0.L(100.0f), false, null, false);
            q9Var.m(gc.b(document), "80_80_nolimit_pcache", gc.c(w10, document), "80_80_nolimit_pcache", org.telegram.messenger.u5.f(document, org.telegram.ui.ActionBar.m6.a7, 0.3f, null), tLObject);
        }
    }

    public final void k(boolean z10, boolean z11, float f10) {
        if (this.Q != f10) {
            this.Q = f10;
            TL_stars.TL_starGiftUnique uniqueStarGift = getUniqueStarGift();
            TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop = uniqueStarGift == null ? null : (TL_stars.starGiftAttributeBackdrop) di.y8.l(uniqueStarGift.attributes, TL_stars.starGiftAttributeBackdrop.class);
            int i7 = stargiftattributebackdrop == null ? -11184811 : stargiftattributebackdrop.pattern_color | (-16777216);
            float f11 = 1.0f - f10;
            ColorMatrixColorFilter colorMatrixColorFilter = f10 <= 0.0f ? null : new ColorMatrixColorFilter(new float[]{f11, 0.0f, 0.0f, 0.0f, Color.red(i7) * f10, 0.0f, f11, 0.0f, 0.0f, Color.green(i7) * f10, 0.0f, 0.0f, f11, 0.0f, Color.blue(i7) * f10, 0.0f, 0.0f, 0.0f, 1.0f - (0.5686275f * f10), 0.0f});
            q9 q9Var = this.E;
            q9Var.setColorFilter(colorMatrixColorFilter);
            q9Var.getImageReceiver().v0 = f10 == 0.0f;
            if (f10 > 0.0f) {
                q9Var.getImageReceiver().Q0();
                oh0 B = q9Var.getImageReceiver().B();
                if (B != null) {
                    B.N(0, false, false);
                }
            }
            q9Var.invalidate();
        }
        if (this.P != z10) {
            this.P = z10;
            if (getUniqueStarGift() != null) {
                String N0 = z10 ? hd.N0(2131742857, null) : i5.c.l(r2.num, ',', new StringBuilder("#"));
                h3 h3Var = this.f;
                if (!z11) {
                    h3Var.b(N0, true);
                    return;
                }
                h3Var.getClass();
                h3Var.b = N0;
                h3Var.a.h(10, N0);
            }
        }
    }

    public final void l() {
        TL_stars.SavedStarGift savedStarGift = this.f0;
        int i7 = this.a;
        h3 h3Var = this.f;
        if (savedStarGift != null) {
            TL_stars.StarGift starGift = savedStarGift.gift;
            if (!(starGift instanceof TL_stars.TL_starGiftUnique)) {
                if (!starGift.limited) {
                    h3Var.setBackdrop(null);
                    h3Var.setVisibility(8);
                    return;
                }
                h3Var.setVisibility(0);
                setRibbonColorKey(org.telegram.ui.ActionBar.m6.Cj);
                h3Var.setStrokeColor(0);
                this.p0 = false;
                h3Var.setBackdrop(null);
                h3Var.b(hd.a0(null, null, 2131750118, org.telegram.messenger.g0.o0(this.f0.gift.availability_total, 0)), true);
                return;
            }
            h3Var.setVisibility(0);
            TL_stars.StarGift starGift2 = this.f0.gift;
            if (starGift2.resell_amount == null || (x4.m(starGift2) && !((org.telegram.messenger.h0) np.u1(i7).A7.p0.b).c)) {
                setRibbonColorKey(org.telegram.ui.ActionBar.m6.Cj);
                h3Var.setStrokeColor(0);
                this.p0 = false;
                h3Var.setBackdrop((TL_stars.starGiftAttributeBackdrop) di.y8.l(this.f0.gift.attributes, TL_stars.starGiftAttributeBackdrop.class));
                h3Var.b(i5.c.l(this.f0.gift.num, ',', new StringBuilder("#")), true);
                return;
            }
            int i10 = org.telegram.ui.ActionBar.m6.d6;
            org.telegram.ui.ActionBar.h6 h6Var = this.b;
            int w10 = org.telegram.ui.ActionBar.m6.w(org.telegram.ui.ActionBar.m6.w0(i10, h6Var), org.telegram.ui.ActionBar.m6.r1(0.04f, org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.G6, h6Var)));
            setRibbonColorKey(org.telegram.ui.ActionBar.m6.lk);
            h3Var.setStrokeColor(w10);
            this.p0 = true;
            h3Var.setBackdrop(null);
            h3Var.b(hd.N0(2131750072, null), false);
            return;
        }
        TL_stars.StarGift starGift3 = this.c0;
        if (starGift3 == null) {
            ug.j jVar = this.b0;
            if (jVar != null) {
                if (jVar.b() <= 0) {
                    h3Var.setVisibility(8);
                    h3Var.setBackdrop(null);
                    h3Var.setStrokeColor(0);
                    this.p0 = false;
                    return;
                }
                h3Var.setVisibility(0);
                h3Var.setBackdrop(null);
                this.o0 = -1;
                h3Var.a(-2535425, -8229377);
                h3Var.setStrokeColor(0);
                this.p0 = false;
                String a02 = hd.a0(null, null, 2131749491, Integer.valueOf(this.b0.b()));
                h3Var.b = a02;
                h3Var.a.g(12, a02, true);
                return;
            }
            return;
        }
        if (this.h0 || this.j0) {
            h3Var.setVisibility(0);
            setRibbonColorKey(org.telegram.ui.ActionBar.m6.Cj);
            h3Var.setBackdrop((TL_stars.starGiftAttributeBackdrop) di.y8.l(this.c0.attributes, TL_stars.starGiftAttributeBackdrop.class));
            h3Var.setStrokeColor(0);
            this.p0 = false;
            h3Var.b(i5.c.l(this.c0.num, ',', new StringBuilder("#")), true);
            return;
        }
        if (this.g0 && starGift3.availability_resale > 0) {
            h3Var.setVisibility(0);
            setRibbonColorKey(org.telegram.ui.ActionBar.m6.lk);
            h3Var.setStrokeColor(0);
            this.p0 = false;
            h3Var.setBackdrop(null);
            h3Var.b(hd.N0(2131750013, null), false);
            return;
        }
        if (this.e0) {
            h3Var.setVisibility(0);
            setRibbonColorKey(org.telegram.ui.ActionBar.m6.Cj);
            h3Var.setStrokeColor(0);
            this.p0 = false;
            h3Var.setBackdrop((TL_stars.starGiftAttributeBackdrop) di.y8.l(this.c0.attributes, TL_stars.starGiftAttributeBackdrop.class));
            h3Var.b(hd.a0(null, null, 2131750118, org.telegram.messenger.g0.o0(this.c0.availability_issued, 0)), true);
            return;
        }
        boolean z10 = starGift3.limited;
        if (z10 && starGift3.availability_remains <= 0) {
            h3Var.setVisibility(0);
            setRibbonColorKey(org.telegram.ui.ActionBar.m6.Dj);
            h3Var.setStrokeColor(0);
            this.p0 = false;
            h3Var.setBackdrop(null);
            h3Var.b(hd.N0(2131749959, null), true);
            return;
        }
        if (starGift3.auction) {
            h3Var.setVisibility(0);
            h3Var.setBackdrop(null);
            this.o0 = -1;
            h3Var.a(-2650077, -4227818);
            h3Var.setStrokeColor(0);
            this.p0 = false;
            if (this.c0.auction_start_date > ConnectionsManager.getInstance(i7).getCurrentTime()) {
                h3Var.b(hd.N0(2131750116, null), true);
                return;
            } else {
                h3Var.b(hd.N0(2131750117, null), true);
                return;
            }
        }
        if (starGift3.require_premium) {
            h3Var.setVisibility(0);
            h3Var.setBackdrop(null);
            this.o0 = -1;
            h3Var.a(-2650077, -4227818);
            h3Var.setStrokeColor(0);
            this.p0 = false;
            h3Var.b(hd.N0(2131750115, null), true);
            return;
        }
        if (!z10) {
            h3Var.setBackdrop(null);
            h3Var.setStrokeColor(0);
            this.p0 = false;
            h3Var.setVisibility(8);
            return;
        }
        h3Var.setVisibility(0);
        setRibbonColorKey(org.telegram.ui.ActionBar.m6.Cj);
        h3Var.setStrokeColor(0);
        this.p0 = false;
        h3Var.setBackdrop(null);
        h3Var.b(hd.N0(2131750114, null), true);
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
        h3 h3Var;
        e3 e3Var;
        TL_stars.SavedStarGift savedStarGift;
        TL_stars.SavedStarGift savedStarGift2;
        op opVar;
        q9 q9Var;
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
                        h3Var = this.f;
                        if (h3Var != null) {
                        }
                        e3Var = this.K;
                        if (e3Var != null) {
                        }
                        savedStarGift = this.f0;
                        if (savedStarGift != null) {
                        }
                        savedStarGift2 = this.f0;
                        if (savedStarGift2 != null) {
                        }
                        opVar = this.n0;
                        if (opVar != null) {
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
                    h3Var = this.f;
                    if (h3Var != null) {
                    }
                    e3Var = this.K;
                    if (e3Var != null) {
                    }
                    savedStarGift = this.f0;
                    if (savedStarGift != null) {
                    }
                    savedStarGift2 = this.f0;
                    if (savedStarGift2 != null) {
                    }
                    opVar = this.n0;
                    if (opVar != null) {
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
                    h3Var = this.f;
                    if (h3Var != null) {
                    }
                    e3Var = this.K;
                    if (e3Var != null) {
                    }
                    savedStarGift = this.f0;
                    if (savedStarGift != null) {
                    }
                    savedStarGift2 = this.f0;
                    if (savedStarGift2 != null) {
                    }
                    opVar = this.n0;
                    if (opVar != null) {
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
                h3Var = this.f;
                if (h3Var != null) {
                }
                e3Var = this.K;
                if (e3Var != null) {
                }
                savedStarGift = this.f0;
                if (savedStarGift != null) {
                }
                savedStarGift2 = this.f0;
                if (savedStarGift2 != null) {
                }
                opVar = this.n0;
                if (opVar != null) {
                }
                accessibilityNodeInfo.setContentDescription(sb2.toString());
            }
            TextView textView3 = this.I;
            if (textView3 != null && textView3.getVisibility() == 0 && !TextUtils.isEmpty(textView3.getText())) {
                charSequence = textView3.getText();
                if (TextUtils.isEmpty(charSequence)) {
                    charSequence = hd.N0(2131750175, null);
                }
                sb2.append(charSequence);
                textView = this.J;
                if (textView != null && textView.getVisibility() == 0 && !TextUtils.isEmpty(textView.getText())) {
                    sb2.append(", ");
                    sb2.append(textView.getText());
                }
                h3Var = this.f;
                if (h3Var != null && h3Var.getVisibility() == 0) {
                    text = h3Var.getText();
                    if (!TextUtils.isEmpty(text)) {
                        sb2.append(", ");
                        sb2.append(text);
                    }
                }
                e3Var = this.K;
                if (e3Var != null && e3Var.getVisibility() == 0 && (textView2 = this.M) != null && textView2.getVisibility() == 0 && !TextUtils.isEmpty(textView2.getText())) {
                    sb2.append(", ");
                    sb2.append(textView2.getText());
                }
                savedStarGift = this.f0;
                if (savedStarGift != null && savedStarGift.unsaved) {
                    sb2.append(", ");
                    sb2.append(hd.N0(2131750183, null));
                }
                savedStarGift2 = this.f0;
                if (savedStarGift2 != null && !(savedStarGift2.gift instanceof TL_stars.TL_starGiftUnique) && !savedStarGift2.name_hidden && (q9Var = this.n) != null && q9Var.getVisibility() == 0) {
                    o4 = org.telegram.messenger.n5.o(this.f0.from_id);
                    if (o4 != 0) {
                        int i7 = this.a;
                        if (o4 > 0) {
                            TLRPC.User c22 = np.u1(i7).c2(Long.valueOf(o4));
                            if (c22 != null) {
                                str = p10.q(c22);
                            }
                        } else {
                            TLRPC.Chat O0 = np.u1(i7).O0(Long.valueOf(-o4));
                            if (O0 != null) {
                                str = O0.title;
                            }
                        }
                        if (!TextUtils.isEmpty(str)) {
                            sb2.append(", ");
                            sb2.append((CharSequence) str);
                        }
                    }
                }
                opVar = this.n0;
                if (opVar != null && opVar.a.q) {
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
            h3Var = this.f;
            if (h3Var != null) {
                text = h3Var.getText();
                if (!TextUtils.isEmpty(text)) {
                }
            }
            e3Var = this.K;
            if (e3Var != null) {
                sb2.append(", ");
                sb2.append(textView2.getText());
            }
            savedStarGift = this.f0;
            if (savedStarGift != null) {
                sb2.append(", ");
                sb2.append(hd.N0(2131750183, null));
            }
            savedStarGift2 = this.f0;
            if (savedStarGift2 != null) {
                o4 = org.telegram.messenger.n5.o(this.f0.from_id);
                if (o4 != 0) {
                }
            }
            opVar = this.n0;
            if (opVar != null) {
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
        h3 h3Var = this.f;
        h3Var.setColor(i7);
        h3Var.invalidate();
    }

    public void setRibbonText(String str) {
        this.f.b(str, true);
    }

    public void setRibbonTextOneOf(int i7) {
        h3 h3Var = this.f;
        h3Var.setVisibility(0);
        setRibbonColorKey(org.telegram.ui.ActionBar.m6.Cj);
        h3Var.setStrokeColor(0);
        this.p0 = false;
        h3Var.setBackdrop((TL_stars.starGiftAttributeBackdrop) di.y8.l(this.c0.attributes, TL_stars.starGiftAttributeBackdrop.class));
        h3Var.b(hd.a0(null, null, 2131750118, org.telegram.messenger.g0.o0(i7, 0)), true);
    }

    @Override // org.telegram.ui.ActionBar.b6
    public final void updateColors() {
        int w02;
        q9 q9Var;
        int w03;
        try {
            boolean q10 = org.telegram.ui.ActionBar.m6.I.q();
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
            h3 h3Var = this.f;
            org.telegram.ui.ActionBar.h6 h6Var = this.b;
            if (h3Var != null) {
                int i7 = this.o0;
                if (i7 >= 0) {
                    j3 j3Var = h3Var.a;
                    ((Paint) j3Var.b).setColor(org.telegram.ui.ActionBar.m6.w0(i7, h6Var));
                    j3Var.invalidateSelf();
                }
                if (this.p0) {
                    h3Var.setStrokeColor(org.telegram.ui.ActionBar.m6.w(org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.d6, h6Var), org.telegram.ui.ActionBar.m6.r1(0.04f, org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.G6, h6Var))));
                }
                h3Var.invalidate();
            }
            if (this.q0 && (q9Var = this.n) != null && (w03 = org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.nk, h6Var)) != this.r0) {
                this.r0 = w03;
                q9Var.setColorFilter(new PorterDuffColorFilter(w03, PorterDuff.Mode.SRC_IN));
            }
            c3 c3Var = this.e;
            if (c3Var != null) {
                int[] iArr = this.s0;
                if (iArr != null && c3Var.m == iArr && (iArr[0] != (w02 = org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.Dj, h6Var)) || iArr[1] != w02)) {
                    iArr[1] = w02;
                    iArr[0] = w02;
                    c3Var.n = null;
                }
                c3Var.invalidateSelf();
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }
}
