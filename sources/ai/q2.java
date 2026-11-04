package ai;

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
import b8.mf;
import b8.pf;
import ci.e9;
import ci.ma;
import ci.rb;
import ci.wb;
import java.util.HashSet;
import org.telegram.messenger.a8;
import org.telegram.messenger.ac;
import org.telegram.messenger.bd;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.h10;
import org.telegram.messenger.hp;
import org.telegram.messenger.hs;
import org.telegram.messenger.l10;
import org.telegram.messenger.w7;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.ch0;
import org.telegram.ui.Components.d60;
import org.telegram.ui.Components.hn0;
import org.telegram.ui.Components.k9;
import org.telegram.ui.Components.ly0;
import org.telegram.ui.Components.u8;
import org.telegram.ui.Components.wo;
import org.telegram.ui.Components.wp;
import org.telegram.ui.Components.xp;
import org.telegram.ui.Components.xq;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public class q2 extends FrameLayout implements org.telegram.ui.ActionBar.z5 {
    public static final int[] w0 = {-2781403, -3635939};
    public final k9 E;
    public FrameLayout.LayoutParams F;
    public final vg.y0 G;
    public final vg.y0 H;
    public final TextView I;
    public final TextView J;
    public final o2 K;
    public final x2 L;
    public final TextView M;
    public final TextView N;
    public ma O;
    public boolean P;
    public float Q;
    public ly0 R;
    public ly0 S;
    public final Rect T;
    public boolean U;
    public boolean V;
    public boolean W;
    public final int a;
    public final org.telegram.ui.Components.u5 a0;
    public final org.telegram.ui.ActionBar.e6 b;
    public vg.j b0;
    public final hn0 c;
    public TL_stars.StarGift c0;
    public final FrameLayout d;
    public boolean d0;
    public final m2 e;
    public boolean e0;
    public final r2 f;
    public TL_stars.SavedStarGift f0;
    public boolean g0;
    public final u8 h;
    public boolean h0;
    public boolean i0;
    public boolean j0;
    public vg.j k0;
    public TLRPC.Document l0;
    public TL_stars.SavedStarGift m0;
    public final k9 n;
    public wo n0;
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

    public q2(int i3, Context context, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context);
        this.Q = -1.0f;
        this.T = new Rect();
        this.a0 = new org.telegram.ui.Components.u5(this, 0L, 320L, xq.h);
        this.o0 = -1;
        this.v0 = org.telegram.ui.ActionBar.k6.I.q();
        this.a = i3;
        this.b = e6Var;
        pf.b(this, 0.04f, 1.5f);
        this.c = new hn0(this);
        FrameLayout frameLayout = new FrameLayout(context);
        this.d = frameLayout;
        m2 m2Var = new m2(frameLayout, e6Var, true);
        this.e = m2Var;
        frameLayout.setBackground(m2Var);
        addView(frameLayout, mf.e(-1, -1, hs.E1));
        r2 r2Var = new r2(context);
        this.f = r2Var;
        addView(r2Var, mf.d(-2, -2.0f, 53, 0.0f, 2.0f, 1.0f, 0.0f));
        k9 k9Var = new k9(context);
        this.E = k9Var;
        int i10 = 0;
        k9Var.getImageReceiver().W(0);
        FrameLayout.LayoutParams d = mf.d(80, 80.0f, 17, 0.0f, 12.0f, 0.0f, 12.0f);
        this.F = d;
        frameLayout.addView(k9Var, d);
        vg.y0 y0Var = new vg.y0(3, context, e6Var);
        this.G = y0Var;
        y0Var.setImageReceiver(k9Var.getImageReceiver());
        frameLayout.addView(y0Var, mf.d(30, 30.0f, 49, 0.0f, 38.0f, 0.0f, 0.0f));
        vg.y0 y0Var2 = new vg.y0(4, context, e6Var);
        this.H = y0Var2;
        y0Var2.setImageReceiver(k9Var.getImageReceiver());
        frameLayout.addView(y0Var2, mf.e(44, 44, 17));
        y0Var2.setAlpha(0.0f);
        y0Var2.setScaleX(0.3f);
        y0Var2.setScaleY(0.3f);
        y0Var2.setVisibility(8);
        TextView textView = new TextView(context);
        this.I = textView;
        int i11 = org.telegram.ui.ActionBar.k6.G6;
        org.telegram.ui.ActionBar.r6.V(textView, i11, e6Var);
        textView.setGravity(17);
        textView.setTextSize(1, 14.0f);
        textView.setTypeface(org.telegram.messenger.g0.o());
        TextView m10 = org.telegram.ui.Cells.f1.m(frameLayout, textView, mf.d(-1, -2.0f, 48, 0.0f, 89.0f, 0.0f, 0.0f), context);
        this.J = m10;
        org.telegram.ui.ActionBar.r6.V(m10, i11, e6Var);
        m10.setGravity(17);
        m10.setTextSize(1, 12.0f);
        frameLayout.addView(m10, mf.d(-1, -2.0f, 48, 0.0f, 107.0f, 0.0f, 0.0f));
        o2 o2Var = new o2(i10, context, this);
        this.K = o2Var;
        TextView textView2 = new TextView(context);
        this.M = textView2;
        textView2.setTextSize(1, 12.0f);
        textView2.setTypeface(org.telegram.messenger.g0.o());
        textView2.setPadding(org.telegram.messenger.g0.L(10.0f), 0, org.telegram.messenger.g0.L(10.0f), 0);
        textView2.setGravity(17);
        textView2.setTextColor(-13397548);
        frameLayout.addView(o2Var, mf.d(-2, -2.0f, 81, 0.0f, 0.0f, 0.0f, 11.0f));
        x2 x2Var = new x2(context, i10);
        this.L = x2Var;
        x2Var.setBackgroundColor(-16776961);
        o2Var.addView(x2Var, mf.c(0.0f, 0));
        o2Var.addView(textView2, mf.e(-2, 26, 17));
        x2Var.setBackground(new w2(org.telegram.ui.ActionBar.k6.I.q() ? 518759725 : 1088989954));
        TextView textView3 = new TextView(context);
        this.N = textView3;
        textView3.setTextSize(1, 10.66f);
        textView3.setGravity(17);
        textView3.setTextColor(org.telegram.ui.ActionBar.k6.I.q() ? -1333971 : -2722014);
        textView3.setVisibility(8);
        frameLayout.addView(textView3, mf.d(-2, -2.0f, 49, 0.0f, 161.0f, 0.0f, 8.0f));
        this.h = new u8((org.telegram.ui.ActionBar.e6) null);
        k9 k9Var2 = new k9(context);
        this.n = k9Var2;
        k9Var2.setRoundRadius(org.telegram.messenger.g0.L(20.0f));
        k9Var2.setVisibility(8);
        FrameLayout.LayoutParams d10 = mf.d(20, 20.0f, 51, 2.0f, 2.0f, 2.0f, 2.0f);
        this.r = d10;
        frameLayout.addView(k9Var2, d10);
        this.s = mf.d(20, 20.0f, 51, 5.0f, 5.0f, 2.0f, 2.0f);
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.w = frameLayout2;
        frameLayout2.setAlpha(0.0f);
        frameLayout2.setScaleX(0.3f);
        frameLayout2.setScaleY(0.3f);
        frameLayout2.setVisibility(8);
        ImageView e10 = org.telegram.messenger.camera.q.e(context, R.drawable.msg_limit_pin);
        e10.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        e10.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
        frameLayout2.addView(e10, mf.a(12.66f, 12.66f, 17));
        frameLayout.addView(frameLayout2, mf.d(20, 20.0f, 51, 2.0f, 2.0f, 2.0f, 2.0f));
        ImageView imageView = new ImageView(context);
        this.x = imageView;
        imageView.setImageResource(R.drawable.mini_gram_14);
        imageView.setPadding(0, org.telegram.messenger.g0.L(2.0f), 0, 0);
        imageView.setVisibility(8);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        frameLayout.addView(imageView, mf.d(20, 20.0f, 51, 3.0f, 3.0f, 3.0f, 3.0f));
        TextView textView4 = new TextView(context);
        this.y = textView4;
        textView4.setTextSize(1, 10.0f);
        textView4.setTypeface(org.telegram.messenger.g0.o());
        textView4.setPadding(org.telegram.messenger.g0.L(5.0f), 0, org.telegram.messenger.g0.L(5.0f), 0);
        textView4.setGravity(17);
        textView4.setTextColor(-1);
        frameLayout.addView(textView4, mf.d(-2, 17.0f, 51, 4.0f, 4.0f, 0.0f, 0.0f));
        textView4.setVisibility(8);
        setImportantForAccessibility(1);
        frameLayout.setImportantForAccessibility(4);
        r2Var.setImportantForAccessibility(2);
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

    private void setRibbonColorKey(int i3) {
        this.f.setColor(org.telegram.ui.ActionBar.k6.w0(i3, this.b));
        this.o0 = i3;
    }

    public final void a() {
        boolean q10 = org.telegram.ui.ActionBar.k6.I.q();
        this.v0 = q10;
        int i3 = this.u0 ? 1090519039 : q10 ? 518759725 : 1088989954;
        int i10 = q10 ? -1333971 : this.t0 == 2 ? -4229632 : -2722014;
        this.L.setBackground(new w2(i3));
        this.M.setTextColor(i10);
        ImageView imageView = this.x;
        imageView.setColorFilter(i10);
        imageView.setBackground(org.telegram.ui.ActionBar.k6.d0(org.telegram.messenger.g0.L(10.0f), i3));
    }

    @Override // org.telegram.ui.ActionBar.z5
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.zj));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Aj));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.ik));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.kk));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.d6));
    }

    public void b(d60 d60Var, Canvas canvas, float f10, float f11, float f12) {
        float f13;
        o2 o2Var;
        float f14;
        ImageView imageView;
        TL_stars.TL_starGiftUnique tL_starGiftUnique;
        float f15;
        Canvas canvas2 = canvas;
        k9 k9Var = this.n;
        k9 k9Var2 = this.E;
        m2 m2Var = this.e;
        r2 r2Var = this.f;
        Rect rect = this.T;
        FrameLayout frameLayout = this.w;
        ImageView imageView2 = this.x;
        o2 o2Var2 = this.K;
        vg.y0 y0Var = this.G;
        canvas2.save();
        canvas2.scale(getScaleX(), getScaleY(), f10 / 2.0f, f11 / 2.0f);
        TL_stars.TL_starGiftUnique uniqueStarGift = getUniqueStarGift();
        float L = uniqueStarGift != null ? org.telegram.messenger.g0.L(63.0f) * f12 : 0.0f;
        m2Var.setBounds(0, 0, (int) f10, (int) f11);
        m2Var.b(canvas2, f12);
        m2Var.getPadding(rect);
        float W1 = org.telegram.messenger.g0.W1(f12, org.telegram.messenger.g0.L(80.0f), org.telegram.messenger.g0.L(120.0f));
        float f16 = f11 - L;
        k9Var2.getImageReceiver().y0((f10 - W1) / 2.0f, (f16 - W1) / 2.0f, W1, W1);
        k9Var2.getImageReceiver().h(canvas2, null);
        ch0 B = k9Var2.getImageReceiver().B();
        if (B != null && B.l0) {
            d60Var.invalidate();
        }
        if (y0Var.getVisibility() != 0 || y0Var.getAlpha() <= 0.0f) {
            f13 = 1.0f;
            o2Var = o2Var2;
            f14 = 0.0f;
            imageView = imageView2;
            tL_starGiftUnique = uniqueStarGift;
        } else {
            canvas2.save();
            canvas2.translate((f10 - y0Var.getMeasuredWidth()) / 2.0f, org.telegram.messenger.g0.T1(y0Var.getY(), (f16 - y0Var.getMeasuredHeight()) / 2.0f, f12));
            f13 = 1.0f;
            o2Var = o2Var2;
            f14 = 0.0f;
            imageView = imageView2;
            tL_starGiftUnique = uniqueStarGift;
            canvas2.saveLayerAlpha(0.0f, 0.0f, y0Var.getWidth(), y0Var.getHeight(), (int) (y0Var.getAlpha() * (1.0f - f12) * 255.0f), 31);
            y0Var.draw(canvas2);
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
        if (k9Var.getVisibility() == 0 && k9Var.getAlpha() > f14) {
            canvas2.save();
            canvas2.translate(org.telegram.messenger.g0.L(2.0f) + rect.left, org.telegram.messenger.g0.L(2.0f) + rect.top);
            k9Var.draw(canvas2);
            canvas2.restore();
        }
        if (r2Var.getVisibility() != 0 || r2Var.getAlpha() <= f14) {
            f15 = f13;
        } else {
            canvas2.save();
            canvas2.translate(f10 - org.telegram.messenger.g0.L(f13), org.telegram.messenger.g0.L(2.0f));
            f15 = f13;
            float T1 = org.telegram.messenger.g0.T1(f15, 1.25f, f12);
            canvas2.scale(T1, T1);
            canvas2.translate(-r2Var.getWidth(), f14);
            r2Var.draw(canvas2);
            canvas2.restore();
        }
        if (tL_starGiftUnique != null) {
            if (this.R == null) {
                this.R = new ly0(tL_starGiftUnique.title, 20.0f, org.telegram.messenger.g0.o());
            }
            if (this.S == null) {
                this.S = new ly0(bd.H(',', "Gift2CollectionNumber", tL_starGiftUnique.num), 13.0f, null);
            }
            ly0 ly0Var = this.R;
            ly0Var.p = f10 - org.telegram.messenger.g0.L(8.0f);
            float f17 = f15 - f12;
            ly0Var.c((f10 - this.R.k()) / 2.0f, ((f11 - org.telegram.messenger.g0.L(40.0f)) - (this.R.i() / 2.0f)) + (org.telegram.messenger.g0.L(50.0f) * f17), f12, -1, canvas);
            ly0 ly0Var2 = this.S;
            ly0Var2.p = f10 - org.telegram.messenger.g0.L(8.0f);
            ly0Var2.c((f10 - this.S.k()) / 2.0f, ((f11 - org.telegram.messenger.g0.L(19.0f)) - (this.S.i() / 2.0f)) + (org.telegram.messenger.g0.L(50.0f) * f17), 0.6f * f12, -1, canvas);
            canvas2 = canvas;
        }
        if (o2Var != null && o2Var.getVisibility() == 0) {
            canvas2.save();
            canvas2.translate(o2Var.getX(), o2Var.getY());
            canvas2.saveLayerAlpha(0.0f, 0.0f, o2Var.getWidth(), o2Var.getHeight(), (int) (o2Var.getAlpha() * (f15 - f12) * 255.0f), 31);
            o2Var.draw(canvas2);
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
            wo woVar = new wo(21, getContext(), null);
            this.n0 = woVar;
            woVar.b(-1, org.telegram.ui.ActionBar.k6.d6, org.telegram.ui.ActionBar.k6.k7);
            this.n0.setDrawUnchecked(false);
            this.d.addView(this.n0, mf.d(24, 24.0f, 51, 4.0f, 4.0f, 4.0f, 4.0f));
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
            frameLayout.animate().alpha(z10 ? 1.0f : 0.0f).scaleX(z10 ? 1.0f : 0.3f).scaleY(z10 ? 1.0f : 0.3f).withEndAction(new n2(this, z10, 1)).start();
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
            imageView.animate().translationX(z10 ? org.telegram.messenger.g0.L(6.0f) : 0.0f).translationY(z10 ? org.telegram.messenger.g0.L(6.0f) : 0.0f).setDuration(320L).setInterpolator(xq.h).start();
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
        vg.y0 y0Var = this.H;
        if (z11) {
            y0Var.setVisibility(0);
            y0Var.animate().alpha(z10 ? 1.0f : 0.0f).scaleX(z10 ? 1.0f : 0.3f).scaleY(z10 ? 1.0f : 0.3f).withEndAction(new n2(this, z10, 0)).start();
        } else {
            y0Var.setVisibility(z10 ? 0 : 8);
            y0Var.setAlpha(z10 ? 1.0f : 0.0f);
            y0Var.setScaleX(z10 ? 1.0f : 0.3f);
            y0Var.setScaleY(z10 ? 1.0f : 0.3f);
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

    public vg.j getPremiumTier() {
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
        long j10;
        long j11;
        long j12;
        boolean z15;
        long j13;
        boolean z16;
        ma maVar = this.O;
        ColorFilter colorFilter = null;
        if (maVar != null) {
            maVar.run();
            this.O = null;
        }
        j(starGift.getDocument(), starGift);
        TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop = (TL_stars.starGiftAttributeBackdrop) e9.l(starGift.attributes, TL_stars.starGiftAttributeBackdrop.class);
        m2 m2Var = this.e;
        m2Var.d(stargiftattributebackdrop);
        m2Var.e((TL_stars.starGiftAttributePattern) e9.l(starGift.attributes, TL_stars.starGiftAttributePattern.class));
        boolean z17 = starGift.auction;
        int[] iArr = w0;
        org.telegram.ui.ActionBar.e6 e6Var = this.b;
        if (!z17 || (((z16 = starGift.sold_out) && !this.d0) || (z12 && starGift.availability_resale > 0))) {
            if (!starGift.require_premium || (z12 && starGift.availability_resale > 0)) {
                iArr = null;
            }
            m2Var.g(iArr);
        } else if (z16) {
            int i3 = org.telegram.ui.ActionBar.k6.Aj;
            int[] iArr2 = {org.telegram.ui.ActionBar.k6.w0(i3, e6Var), org.telegram.ui.ActionBar.k6.w0(i3, e6Var)};
            this.s0 = iArr2;
            m2Var.g(iArr2);
        } else {
            m2Var.g(iArr);
        }
        this.I.setVisibility(8);
        this.J.setVisibility(8);
        k9 k9Var = this.E;
        k9Var.setTranslationY(0.0f);
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
            sb2.append((Object) (i12 <= 0 ? "<0.1%" : ii.k.J0(i12)));
            textView.setText(sb2.toString());
        }
        FrameLayout.LayoutParams layoutParams = this.F;
        layoutParams.gravity = 49;
        k9Var.setLayoutParams(layoutParams);
        int i13 = this.a;
        k9 k9Var2 = this.n;
        if (!z13) {
            if ((!z12 || starGift.availability_resale <= 0) && starGift.locked_until_date > ConnectionsManager.getInstance(i13).getCurrentTime()) {
                k9Var2.setVisibility(0);
                k9Var2.setLayoutParams(this.s);
                int w02 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.kk, e6Var);
                this.r0 = w02;
                k9Var2.setColorFilter(new PorterDuffColorFilter(w02, PorterDuff.Mode.SRC_IN));
                this.q0 = true;
                k9Var2.setImageResource(R.drawable.mini_gift_lock);
                int i14 = (z14 || z13) ? 0 : 8;
                TextView textView2 = this.M;
                textView2.setVisibility(i14);
                textView2.setTextSize(1, 12.0f);
                x2 x2Var = this.L;
                if (!z10) {
                    textView2.setPadding(org.telegram.messenger.g0.L(10.0f), 0, org.telegram.messenger.g0.L(10.0f), 0);
                    textView2.setText(bd.M0(2131749927, null));
                    int w10 = stargiftattributebackdrop != null ? org.telegram.ui.ActionBar.k6.w(stargiftattributebackdrop.center_color | (-16777216), org.telegram.ui.ActionBar.k6.r1(0.55f, stargiftattributebackdrop.pattern_color | (-16777216))) : 1090519039;
                    this.t0 = 0;
                    int L = org.telegram.messenger.g0.L(13.0f);
                    int w11 = org.telegram.ui.ActionBar.k6.w(w10, 822083583);
                    int i15 = w10;
                    x2Var.setBackground(org.telegram.ui.ActionBar.k6.k0(L, L, L, L, i15, w11, w11));
                    textView2.setTextColor(-1);
                    imageView.setColorFilter(-1);
                    int L2 = org.telegram.messenger.g0.L(10.0f);
                    int w12 = org.telegram.ui.ActionBar.k6.w(i15, 822083583);
                    imageView.setBackground(org.telegram.ui.ActionBar.k6.k0(L2, L2, L2, L2, i15, w12, w12));
                } else if (z13) {
                    textView2.setPadding(org.telegram.messenger.g0.L(8.0f), 0, org.telegram.messenger.g0.L(10.0f), 0);
                    long resellStars = starGift.getResellStars();
                    int w13 = org.telegram.ui.ActionBar.k6.w(stargiftattributebackdrop.center_color | (-16777216), org.telegram.ui.ActionBar.k6.r1(0.55f, stargiftattributebackdrop.pattern_color | (-16777216)));
                    textView2.setText(wb.T0("XTR " + bd.E(resellStars, ',')));
                    this.t0 = 0;
                    x2Var.setBackground(new w2(1895825407, w13));
                    textView2.setTextColor(-1);
                    imageView.setColorFilter(-1);
                    imageView.setBackground(org.telegram.ui.ActionBar.k6.d0(org.telegram.messenger.g0.L(10.0f), w13));
                    textView.setBackground(org.telegram.ui.ActionBar.k6.d0(org.telegram.messenger.g0.L(9.0f), w13));
                } else {
                    textView2.setPadding(org.telegram.messenger.g0.L(8.0f), 0, org.telegram.messenger.g0.L(10.0f), 0);
                    if (z12) {
                        long j14 = starGift.availability_resale;
                        if (j14 > 0) {
                            long j15 = starGift.resell_min_stars;
                            if (j14 > 1) {
                                j13 = j15;
                                if (j13 < ((org.telegram.messenger.j0) hp.s1(i13).x7.q.b).c) {
                                    j12 = j13;
                                    z15 = true;
                                    if (starGift.auction || starGift.availability_resale != 0) {
                                        StringBuilder sb3 = new StringBuilder("XTR ");
                                        sb3.append(bd.E(j12, ','));
                                        sb3.append(z15 ? "+" : "");
                                        textView2.setText(wb.a1(false, sb3.toString(), 0.71f, null));
                                    } else {
                                        textView2.setText(bd.M0(starGift.sold_out ? 2131750344 : 2131750345, null));
                                    }
                                    this.t0 = 1;
                                    this.u0 = starGift instanceof TL_stars.TL_starGiftUnique;
                                    a();
                                    textView.setBackground(org.telegram.ui.ActionBar.k6.d0(org.telegram.messenger.g0.L(9.0f), stargiftattributebackdrop != null ? org.telegram.ui.ActionBar.k6.w(stargiftattributebackdrop.center_color | (-16777216), org.telegram.ui.ActionBar.k6.r1(0.55f, stargiftattributebackdrop.pattern_color | (-16777216))) : 0));
                                }
                            } else {
                                j13 = j15;
                            }
                            j12 = j13;
                            z15 = false;
                            if (starGift.auction) {
                            }
                            StringBuilder sb32 = new StringBuilder("XTR ");
                            sb32.append(bd.E(j12, ','));
                            sb32.append(z15 ? "+" : "");
                            textView2.setText(wb.a1(false, sb32.toString(), 0.71f, null));
                            this.t0 = 1;
                            this.u0 = starGift instanceof TL_stars.TL_starGiftUnique;
                            a();
                            textView.setBackground(org.telegram.ui.ActionBar.k6.d0(org.telegram.messenger.g0.L(9.0f), stargiftattributebackdrop != null ? org.telegram.ui.ActionBar.k6.w(stargiftattributebackdrop.center_color | (-16777216), org.telegram.ui.ActionBar.k6.r1(0.55f, stargiftattributebackdrop.pattern_color | (-16777216))) : 0));
                        }
                    }
                    long j16 = starGift.stars;
                    if (z11 && starGift.can_upgrade) {
                        j10 = j16;
                        j11 = starGift.upgrade_stars;
                    } else {
                        j10 = j16;
                        j11 = 0;
                    }
                    j12 = j10 + j11;
                    z15 = false;
                    if (starGift.auction) {
                    }
                    StringBuilder sb322 = new StringBuilder("XTR ");
                    sb322.append(bd.E(j12, ','));
                    sb322.append(z15 ? "+" : "");
                    textView2.setText(wb.a1(false, sb322.toString(), 0.71f, null));
                    this.t0 = 1;
                    this.u0 = starGift instanceof TL_stars.TL_starGiftUnique;
                    a();
                    textView.setBackground(org.telegram.ui.ActionBar.k6.d0(org.telegram.messenger.g0.L(9.0f), stargiftattributebackdrop != null ? org.telegram.ui.ActionBar.k6.w(stargiftattributebackdrop.center_color | (-16777216), org.telegram.ui.ActionBar.k6.r1(0.55f, stargiftattributebackdrop.pattern_color | (-16777216))) : 0));
                }
                o2 o2Var = this.K;
                ((ViewGroup.MarginLayoutParams) o2Var.getLayoutParams()).topMargin = org.telegram.messenger.g0.L(103.0f);
                ((FrameLayout.LayoutParams) o2Var.getLayoutParams()).gravity = 49;
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
        k9Var2.setColorFilter(colorFilter);
        this.q0 = false;
        k9Var2.setVisibility(8);
        if (z14) {
        }
        TextView textView22 = this.M;
        textView22.setVisibility(i14);
        textView22.setTextSize(1, 12.0f);
        x2 x2Var2 = this.L;
        if (!z10) {
        }
        o2 o2Var2 = this.K;
        ((ViewGroup.MarginLayoutParams) o2Var2.getLayoutParams()).topMargin = org.telegram.messenger.g0.L(103.0f);
        ((FrameLayout.LayoutParams) o2Var2.getLayoutParams()).gravity = 49;
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
        long j10;
        boolean z12;
        x2 x2Var;
        boolean z13;
        ma maVar = this.O;
        if (maVar != null) {
            maVar.run();
            this.O = null;
        }
        j(savedStarGift.gift.getDocument(), savedStarGift);
        TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop = (TL_stars.starGiftAttributeBackdrop) e9.l(savedStarGift.gift.attributes, TL_stars.starGiftAttributeBackdrop.class);
        m2 m2Var = this.e;
        m2Var.d(stargiftattributebackdrop);
        m2Var.e((TL_stars.starGiftAttributePattern) e9.l(savedStarGift.gift.attributes, TL_stars.starGiftAttributePattern.class));
        m2Var.g(null);
        this.I.setVisibility(8);
        this.J.setVisibility(8);
        k9 k9Var = this.E;
        k9Var.setTranslationY(0.0f);
        vg.y0 y0Var = this.G;
        y0Var.I = true;
        y0Var.J = false;
        y0Var.invalidate();
        y0Var.setBlendWithColor(stargiftattributebackdrop != null ? Integer.valueOf(org.telegram.ui.ActionBar.k6.r1(0.75f, stargiftattributebackdrop.center_color | (-16777216))) : null);
        vg.y0 y0Var2 = this.H;
        y0Var2.I = true;
        y0Var2.J = false;
        y0Var2.invalidate();
        y0Var2.setBlendWithColor(stargiftattributebackdrop != null ? Integer.valueOf(org.telegram.ui.ActionBar.k6.r1(0.75f, stargiftattributebackdrop.center_color | (-16777216))) : null);
        int i3 = savedStarGift.gift.resale_ton_only ? 0 : 8;
        ImageView imageView = this.x;
        imageView.setVisibility(i3);
        FrameLayout frameLayout = this.w;
        if (stargiftattributebackdrop != null) {
            frameLayout.setBackground(org.telegram.ui.ActionBar.k6.L(org.telegram.messenger.g0.L(20.0f), org.telegram.ui.ActionBar.k6.b(0.1f, -0.2f, stargiftattributebackdrop.center_color | (-16777216))));
        } else {
            int L = org.telegram.messenger.g0.L(20.0f);
            int i10 = org.telegram.ui.ActionBar.k6.Ci;
            org.telegram.ui.ActionBar.e6 e6Var = this.b;
            org.telegram.ui.ActionBar.r6.C(frameLayout, org.telegram.ui.ActionBar.k6.L(L, org.telegram.ui.ActionBar.k6.w0(i10, e6Var)), org.telegram.ui.ActionBar.r6.N(i10), e6Var);
        }
        FrameLayout.LayoutParams layoutParams = this.F;
        layoutParams.gravity = 17;
        k9Var.setLayoutParams(layoutParams);
        if (this.m0 == savedStarGift) {
            y0Var.setVisibility(0);
            y0Var.animate().alpha(savedStarGift.unsaved ? 1.0f : 0.0f).scaleX(savedStarGift.unsaved ? 1.0f : 0.4f).scaleY(savedStarGift.unsaved ? 1.0f : 0.4f).setDuration(350L).setInterpolator(xq.h).withEndAction(new a1.f(4, this, savedStarGift)).start();
        } else {
            y0Var.setAlpha(savedStarGift.unsaved ? 1.0f : 0.0f);
            y0Var.setScaleX(savedStarGift.unsaved ? 1.0f : 0.4f);
            y0Var.setScaleY(savedStarGift.unsaved ? 1.0f : 0.4f);
            y0Var.setVisibility(savedStarGift.unsaved ? 0 : 8);
        }
        boolean z14 = savedStarGift.gift instanceof TL_stars.TL_starGiftUnique;
        k9 k9Var2 = this.n;
        k9Var2.setColorFilter(null);
        this.q0 = false;
        k9Var2.setLayoutParams(this.r);
        int i11 = this.a;
        if (z14 && savedStarGift.name_hidden) {
            k9Var2.setVisibility(8);
            j10 = 0;
        } else if (savedStarGift.name_hidden) {
            k9Var2.setVisibility(0);
            xp a10 = rb.a(44, "anonymous");
            j10 = 0;
            int L2 = org.telegram.messenger.g0.L(16.0f);
            int L3 = org.telegram.messenger.g0.L(16.0f);
            a10.e = L2;
            a10.f = L3;
            k9Var2.setImageDrawable(a10);
        } else {
            j10 = 0;
            long o10 = org.telegram.messenger.m5.o(savedStarGift.from_id);
            u8 u8Var = this.h;
            if (o10 > 0) {
                TLRPC.User a22 = hp.s1(i11).a2(Long.valueOf(o10));
                if (a22 != null) {
                    k9Var2.setVisibility(0);
                    u8Var.r(a22);
                    k9Var2.e(a22, u8Var);
                } else {
                    k9Var2.setVisibility(8);
                }
            } else {
                TLRPC.Chat M0 = hp.s1(i11).M0(Long.valueOf(-o10));
                if (M0 != null) {
                    k9Var2.setVisibility(0);
                    u8Var.q(M0);
                    k9Var2.e(M0, u8Var);
                } else {
                    k9Var2.setVisibility(8);
                }
            }
        }
        x2 x2Var2 = this.L;
        o2 o2Var = this.K;
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
                k2.p1.u(textView, 1, 12.0f, null, 2131750067);
                z12 = true;
                x2Var = x2Var2;
            } else {
                textView.setPadding(org.telegram.messenger.g0.L(8.0f), 0, org.telegram.messenger.g0.L(10.0f), 0);
                textView.setTextSize(1, 12.0f);
                StringBuilder sb2 = new StringBuilder("XTR ");
                TL_stars.StarGift starGift = savedStarGift.gift;
                long j11 = starGift.stars;
                z12 = true;
                x2Var = x2Var2;
                long j12 = savedStarGift.convert_stars;
                if (j12 <= j10) {
                    j12 = starGift.convert_stars;
                }
                textView.setText(wb.a1(false, k2.p1.l(Math.max(j11, j12), ',', sb2), 0.66f, null));
            }
            if (z14) {
                this.t0 = 0;
                textView.setTextColor(-1);
                x2Var.setBackground(new w2(1090519039));
                imageView.setBackground(org.telegram.ui.ActionBar.k6.d0(org.telegram.messenger.g0.L(10.0f), 1090519039));
                imageView.setColorFilter(-1);
            } else {
                this.t0 = 2;
                this.u0 = false;
                a();
            }
            ((FrameLayout.LayoutParams) o2Var.getLayoutParams()).gravity = 49;
            ((ViewGroup.MarginLayoutParams) o2Var.getLayoutParams()).topMargin = org.telegram.messenger.g0.L(103.0f);
        } else {
            textView.setVisibility(0);
            FrameLayout.LayoutParams layoutParams3 = this.F;
            layoutParams3.topMargin = 0;
            layoutParams3.bottomMargin = 0;
            textView.setPadding(org.telegram.messenger.g0.L(8.0f), 0, org.telegram.messenger.g0.L(10.0f), 0);
            textView.setTextSize(1, 12.0f);
            wp[] wpVarArr = new wp[1];
            TL_stars.StarGift starGift2 = savedStarGift.gift;
            if (starGift2.resale_ton_only && org.telegram.messenger.m5.o(starGift2.owner_id) == h10.i(i11).e()) {
                z13 = true;
                textView.setText(wb.s1(wb.X0(true, "XTR " + ((Object) wb.M0(savedStarGift.gift.getResellAmount(dg.b.b).o(), 1.0f, ',')), 0.95f, wpVarArr, 0.0f, 1.0f), true));
            } else {
                z13 = true;
                textView.setText(wb.U0("XTR " + bd.E(savedStarGift.gift.getResellStars(), ','), 0.95f, wpVarArr));
            }
            wp wpVar = wpVarArr[0];
            if (wpVar != null) {
                float L4 = org.telegram.messenger.g0.L(0.5f);
                wpVar.r = 0.0f;
                wpVar.s = L4;
            }
            int w10 = org.telegram.ui.ActionBar.k6.w(stargiftattributebackdrop.center_color | (-16777216), org.telegram.ui.ActionBar.k6.r1(0.55f, stargiftattributebackdrop.pattern_color | (-16777216)));
            this.t0 = 0;
            x2Var2.setBackground(new w2(1895825407, w10));
            textView.setTextColor(-1);
            imageView.setBackground(org.telegram.ui.ActionBar.k6.d0(org.telegram.messenger.g0.L(10.0f), w10));
            imageView.setColorFilter(-1);
            ((FrameLayout.LayoutParams) o2Var.getLayoutParams()).gravity = 49;
            ((ViewGroup.MarginLayoutParams) o2Var.getLayoutParams()).topMargin = org.telegram.messenger.g0.L(79.0f);
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
        k9 k9Var = this.E;
        if (document == null) {
            k9Var.b();
            this.l0 = null;
        } else {
            if (this.l0 == document) {
                return;
            }
            this.l0 = document;
            TLRPC.PhotoSize w10 = w7.w(document.thumbs, org.telegram.messenger.g0.L(100.0f), false, null, false);
            k9Var.m(ac.b(document), "80_80_nolimit_pcache", ac.c(w10, document), "80_80_nolimit_pcache", org.telegram.messenger.t5.f(document, org.telegram.ui.ActionBar.k6.a7, 0.3f, null), tLObject);
        }
    }

    public final void k(boolean z10, boolean z11, float f10) {
        if (this.Q != f10) {
            this.Q = f10;
            TL_stars.TL_starGiftUnique uniqueStarGift = getUniqueStarGift();
            TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop = uniqueStarGift == null ? null : (TL_stars.starGiftAttributeBackdrop) e9.l(uniqueStarGift.attributes, TL_stars.starGiftAttributeBackdrop.class);
            int i3 = stargiftattributebackdrop == null ? -11184811 : stargiftattributebackdrop.pattern_color | (-16777216);
            float f11 = 1.0f - f10;
            ColorMatrixColorFilter colorMatrixColorFilter = f10 <= 0.0f ? null : new ColorMatrixColorFilter(new float[]{f11, 0.0f, 0.0f, 0.0f, Color.red(i3) * f10, 0.0f, f11, 0.0f, 0.0f, Color.green(i3) * f10, 0.0f, 0.0f, f11, 0.0f, Color.blue(i3) * f10, 0.0f, 0.0f, 0.0f, 1.0f - (0.5686275f * f10), 0.0f});
            k9 k9Var = this.E;
            k9Var.setColorFilter(colorMatrixColorFilter);
            k9Var.getImageReceiver().v0 = f10 == 0.0f;
            if (f10 > 0.0f) {
                k9Var.getImageReceiver().Q0();
                ch0 B = k9Var.getImageReceiver().B();
                if (B != null) {
                    B.N(0, false, false);
                }
            }
            k9Var.invalidate();
        }
        if (this.P != z10) {
            this.P = z10;
            if (getUniqueStarGift() != null) {
                String M0 = z10 ? bd.M0(2131743114, null) : k2.p1.l(r2.num, ',', new StringBuilder("#"));
                r2 r2Var = this.f;
                if (!z11) {
                    r2Var.b(M0, true);
                    return;
                }
                r2Var.getClass();
                r2Var.b = M0;
                r2Var.a.g(10, M0);
            }
        }
    }

    public final void l() {
        TL_stars.SavedStarGift savedStarGift = this.f0;
        r2 r2Var = this.f;
        if (savedStarGift != null) {
            TL_stars.StarGift starGift = savedStarGift.gift;
            if (!(starGift instanceof TL_stars.TL_starGiftUnique)) {
                if (!starGift.limited) {
                    r2Var.setBackdrop(null);
                    r2Var.setVisibility(8);
                    return;
                }
                r2Var.setVisibility(0);
                setRibbonColorKey(org.telegram.ui.ActionBar.k6.zj);
                r2Var.setStrokeColor(0);
                this.p0 = false;
                r2Var.setBackdrop(null);
                r2Var.b(bd.a0(null, null, 2131750143, org.telegram.messenger.g0.o0(this.f0.gift.availability_total, 0)), true);
                return;
            }
            r2Var.setVisibility(0);
            if (this.f0.gift.resell_amount == null) {
                setRibbonColorKey(org.telegram.ui.ActionBar.k6.zj);
                r2Var.setStrokeColor(0);
                this.p0 = false;
                r2Var.setBackdrop((TL_stars.starGiftAttributeBackdrop) e9.l(this.f0.gift.attributes, TL_stars.starGiftAttributeBackdrop.class));
                r2Var.b(k2.p1.l(this.f0.gift.num, ',', new StringBuilder("#")), true);
                return;
            }
            int i3 = org.telegram.ui.ActionBar.k6.d6;
            org.telegram.ui.ActionBar.e6 e6Var = this.b;
            int w10 = org.telegram.ui.ActionBar.k6.w(org.telegram.ui.ActionBar.k6.w0(i3, e6Var), org.telegram.ui.ActionBar.k6.r1(0.04f, org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.G6, e6Var)));
            setRibbonColorKey(org.telegram.ui.ActionBar.k6.ik);
            r2Var.setStrokeColor(w10);
            this.p0 = true;
            r2Var.setBackdrop(null);
            r2Var.b(bd.M0(2131750097, null), false);
            return;
        }
        TL_stars.StarGift starGift2 = this.c0;
        if (starGift2 == null) {
            vg.j jVar = this.b0;
            if (jVar != null) {
                if (jVar.b() <= 0) {
                    r2Var.setVisibility(8);
                    r2Var.setBackdrop(null);
                    r2Var.setStrokeColor(0);
                    this.p0 = false;
                    return;
                }
                r2Var.setVisibility(0);
                r2Var.setBackdrop(null);
                this.o0 = -1;
                r2Var.a(-2535425, -8229377);
                r2Var.setStrokeColor(0);
                this.p0 = false;
                String a02 = bd.a0(null, null, 2131749672, Integer.valueOf(this.b0.b()));
                r2Var.b = a02;
                r2Var.a.f(12, a02, true);
                return;
            }
            return;
        }
        if (this.h0 || this.j0) {
            r2Var.setVisibility(0);
            setRibbonColorKey(org.telegram.ui.ActionBar.k6.zj);
            r2Var.setBackdrop((TL_stars.starGiftAttributeBackdrop) e9.l(this.c0.attributes, TL_stars.starGiftAttributeBackdrop.class));
            r2Var.setStrokeColor(0);
            this.p0 = false;
            r2Var.b(k2.p1.l(this.c0.num, ',', new StringBuilder("#")), true);
            return;
        }
        if (this.g0 && starGift2.availability_resale > 0) {
            r2Var.setVisibility(0);
            setRibbonColorKey(org.telegram.ui.ActionBar.k6.ik);
            r2Var.setStrokeColor(0);
            this.p0 = false;
            r2Var.setBackdrop(null);
            r2Var.b(bd.M0(2131750038, null), false);
            return;
        }
        if (this.e0) {
            r2Var.setVisibility(0);
            setRibbonColorKey(org.telegram.ui.ActionBar.k6.zj);
            r2Var.setStrokeColor(0);
            this.p0 = false;
            r2Var.setBackdrop((TL_stars.starGiftAttributeBackdrop) e9.l(this.c0.attributes, TL_stars.starGiftAttributeBackdrop.class));
            r2Var.b(bd.a0(null, null, 2131750143, org.telegram.messenger.g0.o0(this.c0.availability_issued, 0)), true);
            return;
        }
        boolean z10 = starGift2.limited;
        if (z10 && starGift2.availability_remains <= 0) {
            r2Var.setVisibility(0);
            setRibbonColorKey(org.telegram.ui.ActionBar.k6.Aj);
            r2Var.setStrokeColor(0);
            this.p0 = false;
            r2Var.setBackdrop(null);
            r2Var.b(bd.M0(2131749984, null), true);
            return;
        }
        if (starGift2.auction) {
            r2Var.setVisibility(0);
            r2Var.setBackdrop(null);
            this.o0 = -1;
            r2Var.a(-2650077, -4227818);
            r2Var.setStrokeColor(0);
            this.p0 = false;
            if (this.c0.auction_start_date > ConnectionsManager.getInstance(this.a).getCurrentTime()) {
                r2Var.b(bd.M0(2131750141, null), true);
                return;
            } else {
                r2Var.b(bd.M0(2131750142, null), true);
                return;
            }
        }
        if (starGift2.require_premium) {
            r2Var.setVisibility(0);
            r2Var.setBackdrop(null);
            this.o0 = -1;
            r2Var.a(-2650077, -4227818);
            r2Var.setStrokeColor(0);
            this.p0 = false;
            r2Var.b(bd.M0(2131750140, null), true);
            return;
        }
        if (!z10) {
            r2Var.setBackdrop(null);
            r2Var.setStrokeColor(0);
            this.p0 = false;
            r2Var.setVisibility(8);
            return;
        }
        r2Var.setVisibility(0);
        setRibbonColorKey(org.telegram.ui.ActionBar.k6.zj);
        r2Var.setStrokeColor(0);
        this.p0 = false;
        r2Var.setBackdrop(null);
        r2Var.b(bd.M0(2131750139, null), true);
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
        r2 r2Var;
        o2 o2Var;
        TL_stars.SavedStarGift savedStarGift;
        TL_stars.SavedStarGift savedStarGift2;
        wo woVar;
        k9 k9Var;
        long o10;
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
                        r2Var = this.f;
                        if (r2Var != null) {
                        }
                        o2Var = this.K;
                        if (o2Var != null) {
                        }
                        savedStarGift = this.f0;
                        if (savedStarGift != null) {
                        }
                        savedStarGift2 = this.f0;
                        if (savedStarGift2 != null) {
                        }
                        woVar = this.n0;
                        if (woVar != null) {
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
                    r2Var = this.f;
                    if (r2Var != null) {
                    }
                    o2Var = this.K;
                    if (o2Var != null) {
                    }
                    savedStarGift = this.f0;
                    if (savedStarGift != null) {
                    }
                    savedStarGift2 = this.f0;
                    if (savedStarGift2 != null) {
                    }
                    woVar = this.n0;
                    if (woVar != null) {
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
                    r2Var = this.f;
                    if (r2Var != null) {
                    }
                    o2Var = this.K;
                    if (o2Var != null) {
                    }
                    savedStarGift = this.f0;
                    if (savedStarGift != null) {
                    }
                    savedStarGift2 = this.f0;
                    if (savedStarGift2 != null) {
                    }
                    woVar = this.n0;
                    if (woVar != null) {
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
                r2Var = this.f;
                if (r2Var != null) {
                }
                o2Var = this.K;
                if (o2Var != null) {
                }
                savedStarGift = this.f0;
                if (savedStarGift != null) {
                }
                savedStarGift2 = this.f0;
                if (savedStarGift2 != null) {
                }
                woVar = this.n0;
                if (woVar != null) {
                }
                accessibilityNodeInfo.setContentDescription(sb2.toString());
            }
            TextView textView3 = this.I;
            if (textView3 != null && textView3.getVisibility() == 0 && !TextUtils.isEmpty(textView3.getText())) {
                charSequence = textView3.getText();
                if (TextUtils.isEmpty(charSequence)) {
                    charSequence = bd.M0(2131750200, null);
                }
                sb2.append(charSequence);
                textView = this.J;
                if (textView != null && textView.getVisibility() == 0 && !TextUtils.isEmpty(textView.getText())) {
                    sb2.append(", ");
                    sb2.append(textView.getText());
                }
                r2Var = this.f;
                if (r2Var != null && r2Var.getVisibility() == 0) {
                    text = r2Var.getText();
                    if (!TextUtils.isEmpty(text)) {
                        sb2.append(", ");
                        sb2.append(text);
                    }
                }
                o2Var = this.K;
                if (o2Var != null && o2Var.getVisibility() == 0 && (textView2 = this.M) != null && textView2.getVisibility() == 0 && !TextUtils.isEmpty(textView2.getText())) {
                    sb2.append(", ");
                    sb2.append(textView2.getText());
                }
                savedStarGift = this.f0;
                if (savedStarGift != null && savedStarGift.unsaved) {
                    sb2.append(", ");
                    sb2.append(bd.M0(2131750208, null));
                }
                savedStarGift2 = this.f0;
                if (savedStarGift2 != null && !(savedStarGift2.gift instanceof TL_stars.TL_starGiftUnique) && !savedStarGift2.name_hidden && (k9Var = this.n) != null && k9Var.getVisibility() == 0) {
                    o10 = org.telegram.messenger.m5.o(this.f0.from_id);
                    if (o10 != 0) {
                        int i3 = this.a;
                        if (o10 > 0) {
                            TLRPC.User a22 = hp.s1(i3).a2(Long.valueOf(o10));
                            if (a22 != null) {
                                str = l10.p(a22);
                            }
                        } else {
                            TLRPC.Chat M0 = hp.s1(i3).M0(Long.valueOf(-o10));
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
                woVar = this.n0;
                if (woVar != null && woVar.a.q) {
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
            r2Var = this.f;
            if (r2Var != null) {
                text = r2Var.getText();
                if (!TextUtils.isEmpty(text)) {
                }
            }
            o2Var = this.K;
            if (o2Var != null) {
                sb2.append(", ");
                sb2.append(textView2.getText());
            }
            savedStarGift = this.f0;
            if (savedStarGift != null) {
                sb2.append(", ");
                sb2.append(bd.M0(2131750208, null));
            }
            savedStarGift2 = this.f0;
            if (savedStarGift2 != null) {
                o10 = org.telegram.messenger.m5.o(this.f0.from_id);
                if (o10 != 0) {
                }
            }
            woVar = this.n0;
            if (woVar != null) {
                accessibilityNodeInfo.setCheckable(true);
                accessibilityNodeInfo.setChecked(true);
            }
            accessibilityNodeInfo.setContentDescription(sb2.toString());
        } catch (Exception unused) {
        }
    }

    public void setImageLayer(int i3) {
        this.E.setLayerNum(i3);
    }

    public void setImageSize(int i3) {
        FrameLayout.LayoutParams layoutParams = this.F;
        layoutParams.width = i3;
        layoutParams.height = i3;
    }

    public void setRibbonColor(int i3) {
        this.o0 = -1;
        r2 r2Var = this.f;
        r2Var.setColor(i3);
        r2Var.invalidate();
    }

    public void setRibbonText(String str) {
        this.f.b(str, true);
    }

    public void setRibbonTextOneOf(int i3) {
        r2 r2Var = this.f;
        r2Var.setVisibility(0);
        setRibbonColorKey(org.telegram.ui.ActionBar.k6.zj);
        r2Var.setStrokeColor(0);
        this.p0 = false;
        r2Var.setBackdrop((TL_stars.starGiftAttributeBackdrop) e9.l(this.c0.attributes, TL_stars.starGiftAttributeBackdrop.class));
        r2Var.b(bd.a0(null, null, 2131750143, org.telegram.messenger.g0.o0(i3, 0)), true);
    }

    @Override // org.telegram.ui.ActionBar.z5
    public final void updateColors() {
        int w02;
        k9 k9Var;
        int w03;
        try {
            boolean q10 = org.telegram.ui.ActionBar.k6.I.q();
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
            r2 r2Var = this.f;
            org.telegram.ui.ActionBar.e6 e6Var = this.b;
            if (r2Var != null) {
                int i3 = this.o0;
                if (i3 >= 0) {
                    t2 t2Var = r2Var.a;
                    ((Paint) t2Var.b).setColor(org.telegram.ui.ActionBar.k6.w0(i3, e6Var));
                    t2Var.invalidateSelf();
                }
                if (this.p0) {
                    r2Var.setStrokeColor(org.telegram.ui.ActionBar.k6.w(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.d6, e6Var), org.telegram.ui.ActionBar.k6.r1(0.04f, org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.G6, e6Var))));
                }
                r2Var.invalidate();
            }
            if (this.q0 && (k9Var = this.n) != null && (w03 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.kk, e6Var)) != this.r0) {
                this.r0 = w03;
                k9Var.setColorFilter(new PorterDuffColorFilter(w03, PorterDuff.Mode.SRC_IN));
            }
            m2 m2Var = this.e;
            if (m2Var != null) {
                int[] iArr = this.s0;
                if (iArr != null && m2Var.m == iArr && (iArr[0] != (w02 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.Aj, e6Var)) || iArr[1] != w02)) {
                    iArr[1] = w02;
                    iArr[0] = w02;
                    m2Var.n = null;
                }
                m2Var.invalidateSelf();
            }
        } catch (Exception e10) {
            a8.g(e10, true);
        }
    }
}
