// default package

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
import java.util.HashSet;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public class nv4 extends FrameLayout implements tjb {
    public static final int[] w0 = {-2781403, -3635939};
    public final be0 E;
    public FrameLayout.LayoutParams F;
    public final oh8 G;
    public final oh8 H;
    public final TextView I;
    public final TextView J;
    public final yc K;
    public final sb L;
    public final TextView M;
    public final TextView N;
    public cua O;
    public boolean P;
    public float Q;
    public tgb R;
    public tgb S;
    public final Rect T;
    public boolean U;
    public boolean V;
    public boolean W;
    public final int a;
    public final lm a0;
    public final wjb b;
    public mu4 b0;
    public final c9a c;
    public TL_stars.StarGift c0;
    public final FrameLayout d;
    public boolean d0;
    public final kv4 e;
    public boolean e0;
    public final ov4 f;
    public TL_stars.SavedStarGift f0;
    public boolean g0;
    public final pb0 h;
    public boolean h0;
    public boolean i0;
    public boolean j0;
    public mu4 k0;
    public TLRPC.Document l0;
    public TL_stars.SavedStarGift m0;
    public final be0 n;
    public wf2 n0;
    public int o0;
    public boolean p0;
    public boolean q0;
    public final FrameLayout.LayoutParams r;
    public int r0;
    public final FrameLayout.LayoutParams s;
    public int[] s0;
    public byte t0;
    public boolean u0;
    public boolean v0;
    public final FrameLayout w;
    public final ImageView x;
    public final TextView y;

    public nv4(int i, wjb wjbVar, Context context) {
        super(context);
        this.Q = -1.0f;
        this.T = new Rect();
        this.a0 = new lm(this, 0L, 320L, s33.h);
        this.o0 = -1;
        this.v0 = bkb.I.o();
        this.a = i;
        this.b = wjbVar;
        ote.b(this, 0.04f, 1.5f);
        this.c = new c9a(this);
        FrameLayout frameLayout = new FrameLayout(context);
        this.d = frameLayout;
        kv4 kv4Var = new kv4(frameLayout, wjbVar, true);
        this.e = kv4Var;
        frameLayout.setBackground(kv4Var);
        addView(frameLayout, nme.e(-1, -1, kk7.D1));
        ov4 ov4Var = new ov4(context);
        this.f = ov4Var;
        addView(ov4Var, nme.d(-2, -2.0f, 53, 0.0f, 2.0f, 1.0f, 0.0f));
        be0 be0Var = new be0(context);
        this.E = be0Var;
        be0Var.getImageReceiver().M(0);
        FrameLayout.LayoutParams d = nme.d(80, 80.0f, 17, 0.0f, 12.0f, 0.0f, 12.0f);
        this.F = d;
        frameLayout.addView(be0Var, d);
        oh8 oh8Var = new oh8(3, wjbVar, context);
        this.G = oh8Var;
        oh8Var.setImageReceiver(be0Var.getImageReceiver());
        frameLayout.addView(oh8Var, nme.d(30, 30.0f, 49, 0.0f, 38.0f, 0.0f, 0.0f));
        oh8 oh8Var2 = new oh8(4, wjbVar, context);
        this.H = oh8Var2;
        oh8Var2.setImageReceiver(be0Var.getImageReceiver());
        frameLayout.addView(oh8Var2, nme.e(44, 44, 17));
        oh8Var2.setAlpha(0.0f);
        oh8Var2.setScaleX(0.3f);
        oh8Var2.setScaleY(0.3f);
        oh8Var2.setVisibility(8);
        TextView textView = new TextView(context);
        this.I = textView;
        int i2 = bkb.F6;
        zkb.X(textView, i2, wjbVar);
        textView.setGravity(17);
        textView.setTextSize(1, 14.0f);
        textView.setTypeface(gl.o());
        TextView l = ug8.l(frameLayout, textView, nme.d(-1, -2.0f, 48, 0.0f, 89.0f, 0.0f, 0.0f), context);
        this.J = l;
        zkb.X(l, i2, wjbVar);
        l.setGravity(17);
        l.setTextSize(1, 12.0f);
        frameLayout.addView(l, nme.d(-1, -2.0f, 48, 0.0f, 107.0f, 0.0f, 0.0f));
        yc ycVar = new yc((byte) 22, context, (Object) this);
        this.K = ycVar;
        TextView textView2 = new TextView(context);
        this.M = textView2;
        textView2.setTextSize(1, 12.0f);
        textView2.setTypeface(gl.o());
        textView2.setPadding(gl.L(10.0f), 0, gl.L(10.0f), 0);
        textView2.setGravity(17);
        textView2.setTextColor(-13397548);
        frameLayout.addView(ycVar, nme.d(-2, -2.0f, 81, 0.0f, 0.0f, 0.0f, 11.0f));
        sb sbVar = new sb(context, (byte) 12);
        this.L = sbVar;
        sbVar.setBackgroundColor(-16776961);
        ycVar.addView(sbVar, nme.c(0.0f, 0));
        ycVar.addView(textView2, nme.e(-2, 26, 17));
        sbVar.setBackground(new sv4(bkb.I.o() ? 518759725 : 1088989954));
        TextView textView3 = new TextView(context);
        this.N = textView3;
        textView3.setTextSize(1, 10.66f);
        textView3.setGravity(17);
        textView3.setTextColor(bkb.I.o() ? -1333971 : -2722014);
        textView3.setVisibility(8);
        frameLayout.addView(textView3, nme.d(-2, -2.0f, 49, 0.0f, 161.0f, 0.0f, 8.0f));
        this.h = new pb0((wjb) null);
        be0 be0Var2 = new be0(context);
        this.n = be0Var2;
        be0Var2.setRoundRadius(gl.L(20.0f));
        be0Var2.setVisibility(8);
        FrameLayout.LayoutParams d2 = nme.d(20, 20.0f, 51, 2.0f, 2.0f, 2.0f, 2.0f);
        this.r = d2;
        frameLayout.addView(be0Var2, d2);
        this.s = nme.d(20, 20.0f, 51, 5.0f, 5.0f, 2.0f, 2.0f);
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.w = frameLayout2;
        frameLayout2.setAlpha(0.0f);
        frameLayout2.setScaleX(0.3f);
        frameLayout2.setScaleY(0.3f);
        frameLayout2.setVisibility(8);
        ImageView k = tb4.k(context, R.drawable.msg_limit_pin);
        k.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        k.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
        frameLayout2.addView(k, nme.a(12.66f, 12.66f, 17));
        frameLayout.addView(frameLayout2, nme.d(20, 20.0f, 51, 2.0f, 2.0f, 2.0f, 2.0f));
        ImageView imageView = new ImageView(context);
        this.x = imageView;
        imageView.setImageResource(R.drawable.mini_gram_14);
        imageView.setPadding(0, gl.L(2.0f), 0, 0);
        imageView.setVisibility(8);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        frameLayout.addView(imageView, nme.d(20, 20.0f, 51, 3.0f, 3.0f, 3.0f, 3.0f));
        TextView textView4 = new TextView(context);
        this.y = textView4;
        textView4.setTextSize(1, 10.0f);
        textView4.setTypeface(gl.o());
        textView4.setPadding(gl.L(5.0f), 0, gl.L(5.0f), 0);
        textView4.setGravity(17);
        textView4.setTextColor(-1);
        frameLayout.addView(textView4, nme.d(-2, 17.0f, 51, 4.0f, 4.0f, 0.0f, 0.0f));
        textView4.setVisibility(8);
        setImportantForAccessibility(1);
        frameLayout.setImportantForAccessibility(4);
        ov4Var.setImportantForAccessibility(2);
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

    private void setRibbonColorKey(int i) {
        this.f.setColor(bkb.v0(i, this.b));
        this.o0 = i;
    }

    public final void a() {
        boolean o = bkb.I.o();
        this.v0 = o;
        int i = this.u0 ? 1090519039 : o ? 518759725 : 1088989954;
        int i2 = o ? -1333971 : this.t0 == 2 ? -4229632 : -2722014;
        this.L.setBackground(new sv4(i));
        this.M.setTextColor(i2);
        ImageView imageView = this.x;
        imageView.setColorFilter(i2);
        imageView.setBackground(bkb.b0(gl.L(10.0f), i));
    }

    @Override // tjb
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(bkb.Bj));
        hashSet.add(Integer.valueOf(bkb.Cj));
        hashSet.add(Integer.valueOf(bkb.kk));
        hashSet.add(Integer.valueOf(bkb.mk));
        hashSet.add(Integer.valueOf(bkb.c6));
    }

    public void b(zr5 zr5Var, Canvas canvas, float f, float f2, float f3) {
        float f4;
        yc ycVar;
        float f5;
        ImageView imageView;
        TL_stars.TL_starGiftUnique tL_starGiftUnique;
        float f6;
        Canvas canvas2 = canvas;
        be0 be0Var = this.n;
        be0 be0Var2 = this.E;
        kv4 kv4Var = this.e;
        ov4 ov4Var = this.f;
        Rect rect = this.T;
        FrameLayout frameLayout = this.w;
        ImageView imageView2 = this.x;
        yc ycVar2 = this.K;
        oh8 oh8Var = this.G;
        canvas2.save();
        canvas2.scale(getScaleX(), getScaleY(), f / 2.0f, f2 / 2.0f);
        TL_stars.TL_starGiftUnique uniqueStarGift = getUniqueStarGift();
        float L = uniqueStarGift != null ? gl.L(63.0f) * f3 : 0.0f;
        kv4Var.setBounds(0, 0, (int) f, (int) f2);
        kv4Var.b(canvas2, f3);
        kv4Var.getPadding(rect);
        float U1 = gl.U1(f3, gl.L(80.0f), gl.L(120.0f));
        float f7 = f2 - L;
        be0Var2.getImageReceiver().i0((f - U1) / 2.0f, (f7 - U1) / 2.0f, U1, U1);
        be0Var2.getImageReceiver().h(canvas2, null);
        oy8 y = be0Var2.getImageReceiver().y();
        if (y != null && y.l0) {
            zr5Var.invalidate();
        }
        if (oh8Var.getVisibility() != 0 || oh8Var.getAlpha() <= 0.0f) {
            f4 = 1.0f;
            ycVar = ycVar2;
            f5 = 0.0f;
            imageView = imageView2;
            tL_starGiftUnique = uniqueStarGift;
        } else {
            canvas2.save();
            canvas2.translate((f - oh8Var.getMeasuredWidth()) / 2.0f, gl.R1(oh8Var.getY(), (f7 - oh8Var.getMeasuredHeight()) / 2.0f, f3));
            f4 = 1.0f;
            ycVar = ycVar2;
            f5 = 0.0f;
            imageView = imageView2;
            tL_starGiftUnique = uniqueStarGift;
            canvas2.saveLayerAlpha(0.0f, 0.0f, oh8Var.getWidth(), oh8Var.getHeight(), (int) (oh8Var.getAlpha() * (1.0f - f3) * 255.0f), 31);
            oh8Var.draw(canvas2);
            canvas2.restore();
            canvas2.restore();
        }
        if (frameLayout.getVisibility() == 0 && frameLayout.getAlpha() > f5) {
            canvas2.save();
            canvas2.translate(gl.L(2.0f) + rect.left, gl.L(2.0f) + rect.top);
            canvas2.saveLayerAlpha(0.0f, 0.0f, frameLayout.getWidth(), frameLayout.getHeight(), (int) (frameLayout.getAlpha() * 255.0f), 31);
            frameLayout.draw(canvas2);
            canvas2.restore();
            canvas2.restore();
        }
        if (be0Var.getVisibility() == 0 && be0Var.getAlpha() > f5) {
            canvas2.save();
            canvas2.translate(gl.L(2.0f) + rect.left, gl.L(2.0f) + rect.top);
            be0Var.draw(canvas2);
            canvas2.restore();
        }
        if (ov4Var.getVisibility() != 0 || ov4Var.getAlpha() <= f5) {
            f6 = f4;
        } else {
            canvas2.save();
            canvas2.translate(f - gl.L(f4), gl.L(2.0f));
            f6 = f4;
            float R1 = gl.R1(f6, 1.25f, f3);
            canvas2.scale(R1, R1);
            canvas2.translate(-ov4Var.getWidth(), f5);
            ov4Var.draw(canvas2);
            canvas2.restore();
        }
        if (tL_starGiftUnique != null) {
            if (this.R == null) {
                this.R = new tgb(tL_starGiftUnique.title, 20.0f, gl.o());
            }
            if (this.S == null) {
                this.S = new tgb(k96.H(',', "Gift2CollectionNumber", tL_starGiftUnique.num), 13.0f, null);
            }
            tgb tgbVar = this.R;
            tgbVar.p = f - gl.L(8.0f);
            float f8 = f6 - f3;
            tgbVar.c((f - this.R.j()) / 2.0f, ((f2 - gl.L(40.0f)) - (this.R.h() / 2.0f)) + (gl.L(50.0f) * f8), f3, -1, canvas);
            tgb tgbVar2 = this.S;
            tgbVar2.p = f - gl.L(8.0f);
            tgbVar2.c((f - this.S.j()) / 2.0f, (gl.L(50.0f) * f8) + ((f2 - gl.L(19.0f)) - (this.S.h() / 2.0f)), 0.6f * f3, -1, canvas);
            canvas2 = canvas;
        }
        if (ycVar != null && ycVar.getVisibility() == 0) {
            canvas2.save();
            canvas2.translate(ycVar.getX(), ycVar.getY());
            canvas.saveLayerAlpha(0.0f, 0.0f, ycVar.getWidth(), ycVar.getHeight(), (int) (ycVar.getAlpha() * (f6 - f3) * 255.0f), 31);
            canvas2 = canvas;
            ycVar.draw(canvas2);
            canvas2.restore();
            canvas2.restore();
        }
        if (imageView != null && imageView.getVisibility() == 0) {
            canvas2.save();
            canvas2.translate(imageView.getX(), imageView.getY());
            canvas.saveLayerAlpha(0.0f, 0.0f, imageView.getWidth(), imageView.getHeight(), (int) (imageView.getAlpha() * (f6 - f3) * 255.0f), 31);
            canvas2 = canvas;
            imageView.draw(canvas2);
            canvas2.restore();
            canvas2.restore();
        }
        canvas2.restore();
    }

    public final void c(boolean z, boolean z2) {
        if (this.n0 == null) {
            wf2 wf2Var = new wf2(21, null, getContext());
            this.n0 = wf2Var;
            wf2Var.b(-1, bkb.c6, bkb.j7);
            this.n0.setDrawUnchecked(false);
            this.d.addView(this.n0, nme.d(24, 24.0f, 51, 4.0f, 4.0f, 4.0f, 4.0f));
        }
        this.n.setVisibility(8);
        this.n0.a(z, z2);
    }

    public final void d(boolean z, boolean z2) {
        TL_stars.SavedStarGift savedStarGift;
        if (this.U == z) {
            return;
        }
        this.U = z;
        FrameLayout frameLayout = this.w;
        if (z2) {
            frameLayout.setVisibility(0);
            frameLayout.animate().alpha(z ? 1.0f : 0.0f).scaleX(z ? 1.0f : 0.3f).scaleY(z ? 1.0f : 0.3f).withEndAction(new lv4(this, z, (byte) 1)).start();
        } else {
            frameLayout.setVisibility(z ? 0 : 8);
            frameLayout.setAlpha(z ? 1.0f : 0.0f);
            frameLayout.setScaleX(z ? 1.0f : 0.3f);
            frameLayout.setScaleY(z ? 1.0f : 0.3f);
        }
        g((this.U || !this.W || this.i0 || (savedStarGift = this.f0) == null || !(savedStarGift.gift instanceof TL_stars.TL_starGiftUnique)) ? false : true, z2);
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

    public final void e(boolean z, boolean z2) {
        TL_stars.SavedStarGift savedStarGift;
        if (this.W == z) {
            return;
        }
        this.W = z;
        if (!z2) {
            this.a0.a(z);
        }
        invalidate();
        g((this.U || !z || this.i0 || (savedStarGift = this.f0) == null || !(savedStarGift.gift instanceof TL_stars.TL_starGiftUnique)) ? false : true, z2);
    }

    public final void f(boolean z, boolean z2) {
        this.e.f(z, z2);
        ImageView imageView = this.x;
        if (z2) {
            imageView.animate().translationX(z ? gl.L(6.0f) : 0.0f).translationY(z ? gl.L(6.0f) : 0.0f).setDuration(320L).setInterpolator(s33.h).start();
            return;
        }
        imageView.animate().cancel();
        imageView.setTranslationX(z ? gl.L(6.0f) : 0.0f);
        imageView.setTranslationY(z ? gl.L(6.0f) : 0.0f);
    }

    public final void g(boolean z, boolean z2) {
        if (this.V == z) {
            return;
        }
        this.V = z;
        oh8 oh8Var = this.H;
        if (z2) {
            oh8Var.setVisibility(0);
            oh8Var.animate().alpha(z ? 1.0f : 0.0f).scaleX(z ? 1.0f : 0.3f).scaleY(z ? 1.0f : 0.3f).withEndAction(new lv4(this, z, (byte) 0)).start();
        } else {
            oh8Var.setVisibility(z ? 0 : 8);
            oh8Var.setAlpha(z ? 1.0f : 0.0f);
            oh8Var.setScaleX(z ? 1.0f : 0.3f);
            oh8Var.setScaleY(z ? 1.0f : 0.3f);
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

    public mu4 getPremiumTier() {
        return this.b0;
    }

    public TL_stars.SavedStarGift getSavedGift() {
        return this.f0;
    }

    /* JADX WARN: Removed duplicated region for block: B:49:0x015a  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x01c7  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x02c2  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0311  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0325  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x02f0  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x02df  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void h(TL_stars.StarGift starGift, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        long j;
        boolean z6;
        TextView textView;
        byte b;
        boolean z7;
        cua cuaVar = this.O;
        ColorFilter colorFilter = null;
        if (cuaVar != null) {
            cuaVar.run();
            this.O = null;
        }
        j(starGift.getDocument(), starGift);
        TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop = (TL_stars.starGiftAttributeBackdrop) gta.i(starGift.attributes, TL_stars.starGiftAttributeBackdrop.class);
        kv4 kv4Var = this.e;
        kv4Var.d(stargiftattributebackdrop);
        kv4Var.e((TL_stars.starGiftAttributePattern) gta.i(starGift.attributes, TL_stars.starGiftAttributePattern.class));
        boolean z8 = starGift.auction;
        int[] iArr = w0;
        wjb wjbVar = this.b;
        if (!z8 || (((z7 = starGift.sold_out) && !this.d0) || (z3 && starGift.availability_resale > 0))) {
            if (!starGift.require_premium || (z3 && starGift.availability_resale > 0)) {
                iArr = null;
            }
            kv4Var.g(iArr);
        } else if (z7) {
            int i = bkb.Cj;
            int[] iArr2 = {bkb.v0(i, wjbVar), bkb.v0(i, wjbVar)};
            this.s0 = iArr2;
            kv4Var.g(iArr2);
        } else {
            kv4Var.g(iArr);
        }
        this.I.setVisibility(8);
        this.J.setVisibility(8);
        be0 be0Var = this.E;
        be0Var.setTranslationY(0.0f);
        this.G.setVisibility(8);
        int i2 = starGift.resale_ton_only ? 0 : 8;
        ImageView imageView = this.x;
        imageView.setVisibility(i2);
        int i3 = z5 ? 0 : 8;
        TextView textView2 = this.y;
        textView2.setVisibility(i3);
        textView2.setTranslationX(starGift.resale_ton_only ? gl.L(23.0f) : 0.0f);
        textView2.setTranslationY(starGift.resale_ton_only ? gl.L(1.0f) : 0.0f);
        if (z5) {
            StringBuilder sb = new StringBuilder("+");
            int i4 = starGift.craft_chance_permille;
            sb.append((Object) (i4 <= 0 ? "<0.1%" : bc.I0(i4)));
            textView2.setText(sb.toString());
        }
        FrameLayout.LayoutParams layoutParams = this.F;
        layoutParams.gravity = 49;
        be0Var.setLayoutParams(layoutParams);
        int i5 = this.a;
        be0 be0Var2 = this.n;
        if (!z4) {
            if ((!z3 || starGift.availability_resale <= 0) && starGift.locked_until_date > ConnectionsManager.getInstance(i5).getCurrentTime()) {
                be0Var2.setVisibility(0);
                be0Var2.setLayoutParams(this.s);
                int v0 = bkb.v0(bkb.mk, wjbVar);
                this.r0 = v0;
                be0Var2.setColorFilter(new PorterDuffColorFilter(v0, PorterDuff.Mode.SRC_IN));
                this.q0 = true;
                be0Var2.setImageResource(R.drawable.mini_gift_lock);
                int i6 = (z5 || z4) ? 0 : 8;
                TextView textView3 = this.M;
                textView3.setVisibility(i6);
                textView3.setTextSize(1, 12.0f);
                sb sbVar = this.L;
                if (!z) {
                    textView3.setPadding(gl.L(10.0f), 0, gl.L(10.0f), 0);
                    textView3.setText(k96.M0(2131749903, null));
                    int v = stargiftattributebackdrop != null ? bkb.v(stargiftattributebackdrop.center_color | (-16777216), bkb.p1(0.55f, stargiftattributebackdrop.pattern_color | (-16777216))) : 1090519039;
                    this.t0 = (byte) 0;
                    int L = gl.L(13.0f);
                    int v2 = bkb.v(v, 822083583);
                    int i7 = v;
                    sbVar.setBackground(bkb.i0(L, L, L, L, i7, v2, v2));
                    textView3.setTextColor(-1);
                    imageView.setColorFilter(-1);
                    int L2 = gl.L(10.0f);
                    int v3 = bkb.v(i7, 822083583);
                    imageView.setBackground(bkb.i0(L2, L2, L2, L2, i7, v3, v3));
                } else if (z4) {
                    textView3.setPadding(gl.L(8.0f), 0, gl.L(10.0f), 0);
                    int v4 = bkb.v(stargiftattributebackdrop.center_color | (-16777216), bkb.p1(0.55f, stargiftattributebackdrop.pattern_color | (-16777216)));
                    if (cq7.m(starGift)) {
                        oj ojVar = oj.b;
                        cm2[] cm2VarArr = new cm2[1];
                        b = 0;
                        textView3.setText(jva.s1(jva.W0(true, "XTR " + ((Object) jva.G0(nj.j(starGift.getResellAmount(ojVar).b, ojVar).q(), 1.0f, ',')), 1.2f, cm2VarArr), true));
                        cm2 cm2Var = cm2VarArr[0];
                        if (cm2Var != null) {
                            float L3 = gl.L(0.5f);
                            cm2Var.r = 0.0f;
                            cm2Var.s = L3;
                        }
                    } else {
                        b = 0;
                        textView3.setText(jva.S0("XTR ".concat(k96.E(starGift.getResellStars(), ','))));
                    }
                    this.t0 = b;
                    sbVar.setBackground(new sv4(1895825407, v4));
                    textView3.setTextColor(-1);
                    imageView.setColorFilter(-1);
                    imageView.setBackground(bkb.b0(gl.L(10.0f), v4));
                    textView2.setBackground(bkb.b0(gl.L(9.0f), v4));
                } else {
                    textView3.setPadding(gl.L(8.0f), 0, gl.L(10.0f), 0);
                    if (z3) {
                        long j2 = starGift.availability_resale;
                        if (j2 > 0) {
                            j = starGift.resell_min_stars;
                            if (j2 > 1 && j < na7.q1(i5).k4.p.f()) {
                                z6 = true;
                                if (starGift.auction) {
                                    textView = textView3;
                                    if (starGift.availability_resale == 0) {
                                        textView.setText(k96.M0(starGift.sold_out ? 2131750320 : 2131750321, null));
                                        this.t0 = (byte) 1;
                                        this.u0 = starGift instanceof TL_stars.TL_starGiftUnique;
                                        a();
                                        textView2.setBackground(bkb.b0(gl.L(9.0f), stargiftattributebackdrop == null ? bkb.v(stargiftattributebackdrop.center_color | (-16777216), bkb.p1(0.55f, stargiftattributebackdrop.pattern_color | (-16777216))) : 0));
                                    }
                                } else {
                                    textView = textView3;
                                }
                                StringBuilder sb2 = new StringBuilder("XTR ");
                                sb2.append(k96.E(j, ','));
                                sb2.append(z6 ? "+" : "");
                                textView.setText(jva.a1(false, sb2.toString(), 0.71f, null));
                                this.t0 = (byte) 1;
                                this.u0 = starGift instanceof TL_stars.TL_starGiftUnique;
                                a();
                                textView2.setBackground(bkb.b0(gl.L(9.0f), stargiftattributebackdrop == null ? bkb.v(stargiftattributebackdrop.center_color | (-16777216), bkb.p1(0.55f, stargiftattributebackdrop.pattern_color | (-16777216))) : 0));
                            }
                            z6 = false;
                            if (starGift.auction) {
                            }
                            StringBuilder sb22 = new StringBuilder("XTR ");
                            sb22.append(k96.E(j, ','));
                            sb22.append(z6 ? "+" : "");
                            textView.setText(jva.a1(false, sb22.toString(), 0.71f, null));
                            this.t0 = (byte) 1;
                            this.u0 = starGift instanceof TL_stars.TL_starGiftUnique;
                            a();
                            textView2.setBackground(bkb.b0(gl.L(9.0f), stargiftattributebackdrop == null ? bkb.v(stargiftattributebackdrop.center_color | (-16777216), bkb.p1(0.55f, stargiftattributebackdrop.pattern_color | (-16777216))) : 0));
                        }
                    }
                    j = ((z2 && starGift.can_upgrade) ? starGift.upgrade_stars : 0L) + starGift.stars;
                    z6 = false;
                    if (starGift.auction) {
                    }
                    StringBuilder sb222 = new StringBuilder("XTR ");
                    sb222.append(k96.E(j, ','));
                    sb222.append(z6 ? "+" : "");
                    textView.setText(jva.a1(false, sb222.toString(), 0.71f, null));
                    this.t0 = (byte) 1;
                    this.u0 = starGift instanceof TL_stars.TL_starGiftUnique;
                    a();
                    textView2.setBackground(bkb.b0(gl.L(9.0f), stargiftattributebackdrop == null ? bkb.v(stargiftattributebackdrop.center_color | (-16777216), bkb.p1(0.55f, stargiftattributebackdrop.pattern_color | (-16777216))) : 0));
                }
                yc ycVar = this.K;
                ((ViewGroup.MarginLayoutParams) ycVar.getLayoutParams()).topMargin = gl.L(103.0f);
                ((FrameLayout.LayoutParams) ycVar.getLayoutParams()).gravity = 49;
                this.N.setVisibility(8);
                this.k0 = null;
                this.b0 = null;
                this.c0 = starGift;
                this.e0 = z;
                this.f0 = null;
                this.g0 = z3;
                this.h0 = z4;
                this.i0 = false;
                this.j0 = z5;
                this.R = null;
                this.S = null;
                d(false, false);
                l();
            }
            colorFilter = null;
        }
        be0Var2.setColorFilter(colorFilter);
        this.q0 = false;
        be0Var2.setVisibility(8);
        if (z5) {
        }
        TextView textView32 = this.M;
        textView32.setVisibility(i6);
        textView32.setTextSize(1, 12.0f);
        sb sbVar2 = this.L;
        if (!z) {
        }
        yc ycVar2 = this.K;
        ((ViewGroup.MarginLayoutParams) ycVar2.getLayoutParams()).topMargin = gl.L(103.0f);
        ((FrameLayout.LayoutParams) ycVar2.getLayoutParams()).gravity = 49;
        this.N.setVisibility(8);
        this.k0 = null;
        this.b0 = null;
        this.c0 = starGift;
        this.e0 = z;
        this.f0 = null;
        this.g0 = z3;
        this.h0 = z4;
        this.i0 = false;
        this.j0 = z5;
        this.R = null;
        this.S = null;
        d(false, false);
        l();
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x01ec  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0408 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0413  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x041e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0421 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0415  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0331  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0354  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x039f  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x03c0  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0368  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0348  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0329  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean i(TL_stars.SavedStarGift savedStarGift, boolean z, boolean z2) {
        long j;
        yc ycVar;
        float f;
        float f2;
        byte b;
        yc ycVar2;
        long j2;
        oj ojVar = oj.b;
        be0 be0Var = this.E;
        kv4 kv4Var = this.e;
        yc ycVar3 = this.K;
        pb0 pb0Var = this.h;
        ImageView imageView = this.x;
        oh8 oh8Var = this.G;
        be0 be0Var2 = this.n;
        TextView textView = this.M;
        cua cuaVar = this.O;
        if (cuaVar != null) {
            cuaVar.run();
            this.O = null;
        }
        j(savedStarGift.gift.getDocument(), savedStarGift);
        TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop = (TL_stars.starGiftAttributeBackdrop) gta.i(savedStarGift.gift.attributes, TL_stars.starGiftAttributeBackdrop.class);
        kv4Var.d(stargiftattributebackdrop);
        kv4Var.e((TL_stars.starGiftAttributePattern) gta.i(savedStarGift.gift.attributes, TL_stars.starGiftAttributePattern.class));
        kv4Var.g(null);
        this.I.setVisibility(8);
        this.J.setVisibility(8);
        be0Var.setTranslationY(0.0f);
        oh8Var.I = true;
        oh8Var.J = false;
        oh8Var.invalidate();
        oh8Var.setBlendWithColor(stargiftattributebackdrop != null ? Integer.valueOf(bkb.p1(0.75f, stargiftattributebackdrop.center_color | (-16777216))) : null);
        oh8 oh8Var2 = this.H;
        oh8Var2.I = true;
        oh8Var2.J = false;
        oh8Var2.invalidate();
        this.H.setBlendWithColor(stargiftattributebackdrop != null ? Integer.valueOf(bkb.p1(0.75f, stargiftattributebackdrop.center_color | (-16777216))) : null);
        imageView.setVisibility(savedStarGift.gift.resale_ton_only ? 0 : 8);
        FrameLayout frameLayout = this.w;
        if (stargiftattributebackdrop != null) {
            frameLayout.setBackground(bkb.K(gl.L(20.0f), bkb.a(0.1f, -0.2f, stargiftattributebackdrop.center_color | (-16777216))));
        } else {
            int L = gl.L(20.0f);
            int i = bkb.Ei;
            zkb.B(frameLayout, bkb.K(L, bkb.v0(i, this.b)), zkb.M(i), this.b);
        }
        FrameLayout.LayoutParams layoutParams = this.F;
        layoutParams.gravity = 17;
        be0Var.setLayoutParams(layoutParams);
        if (this.m0 == savedStarGift) {
            oh8Var.setVisibility(0);
            oh8Var.animate().alpha(savedStarGift.unsaved ? 1.0f : 0.0f).scaleX(savedStarGift.unsaved ? 1.0f : 0.4f).scaleY(savedStarGift.unsaved ? 1.0f : 0.4f).setDuration(350L).setInterpolator(s33.h).withEndAction(new vc4(this, savedStarGift, (byte) 15)).start();
        } else {
            oh8Var.setAlpha(savedStarGift.unsaved ? 1.0f : 0.0f);
            oh8Var.setScaleX(savedStarGift.unsaved ? 1.0f : 0.4f);
            oh8Var.setScaleY(savedStarGift.unsaved ? 1.0f : 0.4f);
            oh8Var.setVisibility(savedStarGift.unsaved ? 0 : 8);
        }
        boolean z3 = savedStarGift.gift instanceof TL_stars.TL_starGiftUnique;
        be0Var2.setColorFilter(null);
        this.q0 = false;
        be0Var2.setLayoutParams(this.r);
        if (z3 && savedStarGift.name_hidden) {
            be0Var2.setVisibility(8);
        } else if (savedStarGift.name_hidden) {
            be0Var2.setVisibility(0);
            fm2 a = eva.a(44, "anonymous");
            int L2 = gl.L(16.0f);
            int L3 = gl.L(16.0f);
            a.e = L2;
            a.f = L3;
            be0Var2.setImageDrawable(a);
        } else {
            j = 0;
            long n = cf3.n(savedStarGift.from_id);
            int i2 = this.a;
            if (n > 0) {
                TLRPC.User V1 = na7.q1(i2).V1(Long.valueOf(n));
                if (V1 != null) {
                    be0Var2.setVisibility(0);
                    pb0Var.q(V1);
                    be0Var2.f(V1, pb0Var);
                } else {
                    be0Var2.setVisibility(8);
                }
            } else {
                TLRPC.Chat K0 = na7.q1(i2).K0(Long.valueOf(-n));
                if (K0 != null) {
                    be0Var2.setVisibility(0);
                    pb0Var.p(K0);
                    be0Var2.f(K0, pb0Var);
                } else {
                    be0Var2.setVisibility(8);
                }
            }
            if (stargiftattributebackdrop == null) {
                f = 10.0f;
                TL_stars.StarGift starGift = savedStarGift.gift;
                f2 = 8.0f;
                if (starGift.resell_amount != null && (!cq7.m(starGift) || na7.q1(this.a).k4.n0.f)) {
                    textView.setVisibility(0);
                    FrameLayout.LayoutParams layoutParams2 = this.F;
                    layoutParams2.topMargin = 0;
                    layoutParams2.bottomMargin = 0;
                    textView.setPadding(gl.L(8.0f), 0, gl.L(10.0f), 0);
                    textView.setTextSize(1, 12.0f);
                    cm2[] cm2VarArr = new cm2[1];
                    boolean m = cq7.m(savedStarGift.gift);
                    TL_stars.StarGift starGift2 = savedStarGift.gift;
                    if (m) {
                        if (starGift2 == null) {
                            ycVar2 = ycVar3;
                            j2 = j;
                        } else {
                            ycVar2 = ycVar3;
                            j2 = starGift2.getResellAmount(ojVar).b;
                        }
                        textView.setText(jva.s1(jva.W0(true, "XTR " + ((Object) jva.G0(nj.j(j2, ojVar).q(), 1.0f, ',')), 1.2f, cm2VarArr), true));
                    } else {
                        ycVar2 = ycVar3;
                        if (starGift2.resale_ton_only && cf3.n(starGift2.owner_id) == y6c.h(this.a).e()) {
                            textView.setText(jva.s1(jva.W0(true, "XTR " + ((Object) jva.G0(savedStarGift.gift.getResellAmount(ojVar).q(), 1.0f, ',')), 1.2f, cm2VarArr), true));
                        } else {
                            textView.setText(jva.T0("XTR ".concat(k96.E(savedStarGift.gift.getResellStars(), ',')), 0.95f, cm2VarArr));
                        }
                    }
                    cm2 cm2Var = cm2VarArr[0];
                    if (cm2Var != null) {
                        float L4 = gl.L(0.5f);
                        cm2Var.r = 0.0f;
                        cm2Var.s = L4;
                    }
                    int v = bkb.v(stargiftattributebackdrop.center_color | (-16777216), bkb.p1(0.55f, stargiftattributebackdrop.pattern_color | (-16777216)));
                    this.t0 = (byte) 0;
                    this.L.setBackground(new sv4(1895825407, v));
                    textView.setTextColor(-1);
                    imageView.setBackground(bkb.b0(gl.L(10.0f), v));
                    imageView.setColorFilter(-1);
                    ((FrameLayout.LayoutParams) ycVar2.getLayoutParams()).gravity = 49;
                    ((ViewGroup.MarginLayoutParams) ycVar2.getLayoutParams()).topMargin = gl.L(79.0f);
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
                    this.i0 = z2;
                    this.R = null;
                    this.S = null;
                    d(!savedStarGift.pinned_to_top && (!z3 || savedStarGift.name_hidden), savedStarGift2 == savedStarGift);
                    l();
                    return savedStarGift2 == savedStarGift;
                }
                ycVar = ycVar3;
            } else {
                ycVar = ycVar3;
                f = 10.0f;
                f2 = 8.0f;
            }
            if (z) {
                b = 0;
                textView.setVisibility(0);
                FrameLayout.LayoutParams layoutParams3 = this.F;
                layoutParams3.topMargin = 0;
                layoutParams3.bottomMargin = 0;
            } else {
                textView.setVisibility(8);
                this.F.topMargin = gl.L(12.0f);
                this.F.bottomMargin = gl.L(12.0f);
                b = 0;
            }
            if (z3) {
                textView.setPadding(gl.L(f2), b, gl.L(f), b);
                textView.setTextSize(1, 12.0f);
                TL_stars.StarGift starGift3 = savedStarGift.gift;
                long j3 = starGift3.stars;
                long j4 = savedStarGift.convert_stars;
                if (j4 <= j) {
                    j4 = starGift3.convert_stars;
                }
                b = 0;
                textView.setText(jva.a1(false, "XTR ".concat(k96.E(Math.max(j3, j4), ',')), 0.66f, null));
            } else {
                textView.setPadding(gl.L(f2), b, gl.L(f2), b);
                ir2.r(12.0f, 1, 2131750043, textView, null);
            }
            if (z3) {
                this.t0 = (byte) 2;
                this.u0 = false;
                a();
            } else {
                this.t0 = b;
                textView.setTextColor(-1);
                this.L.setBackground(new sv4(1090519039));
                imageView.setBackground(bkb.b0(gl.L(f), 1090519039));
                imageView.setColorFilter(-1);
            }
            ((FrameLayout.LayoutParams) ycVar.getLayoutParams()).gravity = 49;
            ((ViewGroup.MarginLayoutParams) ycVar.getLayoutParams()).topMargin = gl.L(103.0f);
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
            this.i0 = z2;
            this.R = null;
            this.S = null;
            d(!savedStarGift.pinned_to_top && (!z3 || savedStarGift.name_hidden), savedStarGift22 == savedStarGift);
            l();
            if (savedStarGift22 == savedStarGift) {
            }
        }
        j = 0;
        if (stargiftattributebackdrop == null) {
        }
        if (z) {
        }
        if (z3) {
        }
        if (z3) {
        }
        ((FrameLayout.LayoutParams) ycVar.getLayoutParams()).gravity = 49;
        ((ViewGroup.MarginLayoutParams) ycVar.getLayoutParams()).topMargin = gl.L(103.0f);
        this.N.setVisibility(8);
        this.m0 = savedStarGift;
        this.k0 = null;
        TL_stars.SavedStarGift savedStarGift222 = this.f0;
        this.b0 = null;
        this.c0 = null;
        this.e0 = false;
        this.f0 = savedStarGift;
        this.g0 = false;
        this.h0 = false;
        this.i0 = z2;
        this.R = null;
        this.S = null;
        d(!savedStarGift.pinned_to_top && (!z3 || savedStarGift.name_hidden), savedStarGift222 == savedStarGift);
        l();
        if (savedStarGift222 == savedStarGift) {
        }
    }

    public final void j(TLRPC.Document document, TLObject tLObject) {
        be0 be0Var = this.E;
        if (document == null) {
            be0Var.b();
            this.l0 = null;
        } else {
            if (this.l0 == document) {
                return;
            }
            this.l0 = document;
            TLRPC.PhotoSize w = ba4.w(document.thumbs, gl.L(100.0f), false, null, false);
            be0Var.j(gl5.b(document), "80_80_nolimit_pcache", gl5.c(w, document), "80_80_nolimit_pcache", uo3.f(document, bkb.Z6, 0.3f, null), tLObject);
        }
    }

    public final void k(boolean z, boolean z2, float f) {
        if (this.Q != f) {
            this.Q = f;
            TL_stars.TL_starGiftUnique uniqueStarGift = getUniqueStarGift();
            TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop = uniqueStarGift == null ? null : (TL_stars.starGiftAttributeBackdrop) gta.i(uniqueStarGift.attributes, TL_stars.starGiftAttributeBackdrop.class);
            int i = stargiftattributebackdrop == null ? -11184811 : stargiftattributebackdrop.pattern_color | (-16777216);
            float f2 = 1.0f - f;
            ColorMatrixColorFilter colorMatrixColorFilter = f <= 0.0f ? null : new ColorMatrixColorFilter(new float[]{f2, 0.0f, 0.0f, 0.0f, Color.red(i) * f, 0.0f, f2, 0.0f, 0.0f, Color.green(i) * f, 0.0f, 0.0f, f2, 0.0f, Color.blue(i) * f, 0.0f, 0.0f, 0.0f, 1.0f - (0.5686275f * f), 0.0f});
            be0 be0Var = this.E;
            be0Var.setColorFilter(colorMatrixColorFilter);
            be0Var.getImageReceiver().v0 = f == 0.0f;
            if (f > 0.0f) {
                be0Var.getImageReceiver().x0();
                oy8 y = be0Var.getImageReceiver().y();
                if (y != null) {
                    y.I(0, false, false);
                }
            }
            be0Var.invalidate();
        }
        if (this.P != z) {
            this.P = z;
            if (getUniqueStarGift() != null) {
                String M0 = z ? k96.M0(2131742860, null) : "#".concat(k96.E(r2.num, ','));
                ov4 ov4Var = this.f;
                if (!z2) {
                    ov4Var.b(M0, true);
                    return;
                }
                ov4Var.getClass();
                ov4Var.b = M0;
                ov4Var.a.h(10, M0);
            }
        }
    }

    public final void l() {
        wjb wjbVar = this.b;
        ov4 ov4Var = this.f;
        TL_stars.SavedStarGift savedStarGift = this.f0;
        if (savedStarGift != null) {
            TL_stars.StarGift starGift = savedStarGift.gift;
            if (!(starGift instanceof TL_stars.TL_starGiftUnique)) {
                if (!starGift.limited) {
                    ov4Var.setBackdrop(null);
                    ov4Var.setVisibility(8);
                    return;
                }
                ov4Var.setVisibility(0);
                setRibbonColorKey(bkb.Bj);
                ov4Var.setStrokeColor(0);
                this.p0 = false;
                ov4Var.setBackdrop(null);
                ov4Var.b(k96.a0(null, null, 2131750119, gl.o0(this.f0.gift.availability_total, 0)), true);
                return;
            }
            ov4Var.setVisibility(0);
            TL_stars.StarGift starGift2 = this.f0.gift;
            if (starGift2.resell_amount == null || (cq7.m(starGift2) && !na7.q1(this.a).k4.n0.f)) {
                setRibbonColorKey(bkb.Bj);
                ov4Var.setStrokeColor(0);
                this.p0 = false;
                ov4Var.setBackdrop((TL_stars.starGiftAttributeBackdrop) gta.i(this.f0.gift.attributes, TL_stars.starGiftAttributeBackdrop.class));
                ov4Var.b("#".concat(k96.E(this.f0.gift.num, ',')), true);
                return;
            }
            int v = bkb.v(bkb.v0(bkb.c6, wjbVar), bkb.p1(0.04f, bkb.v0(bkb.F6, wjbVar)));
            setRibbonColorKey(bkb.kk);
            ov4Var.setStrokeColor(v);
            this.p0 = true;
            ov4Var.setBackdrop(null);
            ov4Var.b(k96.M0(2131750073, null), false);
            return;
        }
        TL_stars.StarGift starGift3 = this.c0;
        if (starGift3 == null) {
            mu4 mu4Var = this.b0;
            if (mu4Var != null) {
                if (mu4Var.b() <= 0) {
                    ov4Var.setVisibility(8);
                    ov4Var.setBackdrop(null);
                    ov4Var.setStrokeColor(0);
                    this.p0 = false;
                    return;
                }
                ov4Var.setVisibility(0);
                ov4Var.setBackdrop(null);
                this.o0 = -1;
                ov4Var.a(-2535425, -8229377);
                ov4Var.setStrokeColor(0);
                this.p0 = false;
                String a0 = k96.a0(null, null, 2131749492, Integer.valueOf(this.b0.b()));
                ov4Var.b = a0;
                ov4Var.a.g(12, a0, true);
                return;
            }
            return;
        }
        if (this.h0 || this.j0) {
            ov4Var.setVisibility(0);
            setRibbonColorKey(bkb.Bj);
            ov4Var.setBackdrop((TL_stars.starGiftAttributeBackdrop) gta.i(this.c0.attributes, TL_stars.starGiftAttributeBackdrop.class));
            ov4Var.setStrokeColor(0);
            this.p0 = false;
            ov4Var.b("#".concat(k96.E(this.c0.num, ',')), true);
            return;
        }
        if (this.g0 && starGift3.availability_resale > 0) {
            ov4Var.setVisibility(0);
            setRibbonColorKey(bkb.kk);
            ov4Var.setStrokeColor(0);
            this.p0 = false;
            ov4Var.setBackdrop(null);
            ov4Var.b(k96.M0(2131750014, null), false);
            return;
        }
        if (this.e0) {
            ov4Var.setVisibility(0);
            setRibbonColorKey(bkb.Bj);
            ov4Var.setStrokeColor(0);
            this.p0 = false;
            ov4Var.setBackdrop((TL_stars.starGiftAttributeBackdrop) gta.i(this.c0.attributes, TL_stars.starGiftAttributeBackdrop.class));
            ov4Var.b(k96.a0(null, null, 2131750119, gl.o0(this.c0.availability_issued, 0)), true);
            return;
        }
        boolean z = starGift3.limited;
        if (z && starGift3.availability_remains <= 0) {
            ov4Var.setVisibility(0);
            setRibbonColorKey(bkb.Cj);
            ov4Var.setStrokeColor(0);
            this.p0 = false;
            ov4Var.setBackdrop(null);
            ov4Var.b(k96.M0(2131749960, null), true);
            return;
        }
        if (starGift3.auction) {
            ov4Var.setVisibility(0);
            ov4Var.setBackdrop(null);
            this.o0 = -1;
            ov4Var.a(-2650077, -4227818);
            ov4Var.setStrokeColor(0);
            this.p0 = false;
            if (this.c0.auction_start_date > ConnectionsManager.getInstance(this.a).getCurrentTime()) {
                ov4Var.b(k96.M0(2131750117, null), true);
                return;
            } else {
                ov4Var.b(k96.M0(2131750118, null), true);
                return;
            }
        }
        if (starGift3.require_premium) {
            ov4Var.setVisibility(0);
            ov4Var.setBackdrop(null);
            this.o0 = -1;
            ov4Var.a(-2650077, -4227818);
            ov4Var.setStrokeColor(0);
            this.p0 = false;
            ov4Var.b(k96.M0(2131750116, null), true);
            return;
        }
        if (!z) {
            ov4Var.setBackdrop(null);
            ov4Var.setStrokeColor(0);
            this.p0 = false;
            ov4Var.setVisibility(8);
            return;
        }
        ov4Var.setVisibility(0);
        setRibbonColorKey(bkb.Bj);
        ov4Var.setStrokeColor(0);
        this.p0 = false;
        ov4Var.setBackdrop(null);
        ov4Var.b(k96.M0(2131750115, null), true);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0071 A[Catch: Exception -> 0x0163, TryCatch #0 {Exception -> 0x0163, blocks: (B:5:0x0017, B:10:0x0025, B:12:0x002b, B:14:0x0035, B:15:0x006b, B:17:0x0071, B:18:0x0078, B:21:0x0081, B:23:0x0087, B:25:0x0091, B:28:0x009f, B:30:0x00a5, B:32:0x00af, B:33:0x00b5, B:35:0x00b9, B:39:0x00c3, B:41:0x00c9, B:43:0x00d3, B:44:0x00dd, B:46:0x00e1, B:48:0x00e5, B:49:0x00f2, B:51:0x00f6, B:53:0x00fc, B:55:0x0100, B:57:0x0104, B:59:0x010a, B:61:0x0118, B:63:0x011c, B:65:0x012a, B:66:0x0140, B:68:0x0146, B:69:0x012f, B:71:0x013e, B:72:0x014c, B:74:0x0150, B:76:0x0156, B:77:0x015c, B:82:0x003a, B:84:0x003e, B:86:0x0042, B:88:0x0046, B:90:0x004e, B:91:0x0055, B:93:0x0059, B:95:0x005d, B:97:0x0065), top: B:4:0x0017 }] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0081 A[Catch: Exception -> 0x0163, TRY_ENTER, TryCatch #0 {Exception -> 0x0163, blocks: (B:5:0x0017, B:10:0x0025, B:12:0x002b, B:14:0x0035, B:15:0x006b, B:17:0x0071, B:18:0x0078, B:21:0x0081, B:23:0x0087, B:25:0x0091, B:28:0x009f, B:30:0x00a5, B:32:0x00af, B:33:0x00b5, B:35:0x00b9, B:39:0x00c3, B:41:0x00c9, B:43:0x00d3, B:44:0x00dd, B:46:0x00e1, B:48:0x00e5, B:49:0x00f2, B:51:0x00f6, B:53:0x00fc, B:55:0x0100, B:57:0x0104, B:59:0x010a, B:61:0x0118, B:63:0x011c, B:65:0x012a, B:66:0x0140, B:68:0x0146, B:69:0x012f, B:71:0x013e, B:72:0x014c, B:74:0x0150, B:76:0x0156, B:77:0x015c, B:82:0x003a, B:84:0x003e, B:86:0x0042, B:88:0x0046, B:90:0x004e, B:91:0x0055, B:93:0x0059, B:95:0x005d, B:97:0x0065), top: B:4:0x0017 }] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x009f A[Catch: Exception -> 0x0163, TRY_ENTER, TryCatch #0 {Exception -> 0x0163, blocks: (B:5:0x0017, B:10:0x0025, B:12:0x002b, B:14:0x0035, B:15:0x006b, B:17:0x0071, B:18:0x0078, B:21:0x0081, B:23:0x0087, B:25:0x0091, B:28:0x009f, B:30:0x00a5, B:32:0x00af, B:33:0x00b5, B:35:0x00b9, B:39:0x00c3, B:41:0x00c9, B:43:0x00d3, B:44:0x00dd, B:46:0x00e1, B:48:0x00e5, B:49:0x00f2, B:51:0x00f6, B:53:0x00fc, B:55:0x0100, B:57:0x0104, B:59:0x010a, B:61:0x0118, B:63:0x011c, B:65:0x012a, B:66:0x0140, B:68:0x0146, B:69:0x012f, B:71:0x013e, B:72:0x014c, B:74:0x0150, B:76:0x0156, B:77:0x015c, B:82:0x003a, B:84:0x003e, B:86:0x0042, B:88:0x0046, B:90:0x004e, B:91:0x0055, B:93:0x0059, B:95:0x005d, B:97:0x0065), top: B:4:0x0017 }] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00af A[Catch: Exception -> 0x0163, TryCatch #0 {Exception -> 0x0163, blocks: (B:5:0x0017, B:10:0x0025, B:12:0x002b, B:14:0x0035, B:15:0x006b, B:17:0x0071, B:18:0x0078, B:21:0x0081, B:23:0x0087, B:25:0x0091, B:28:0x009f, B:30:0x00a5, B:32:0x00af, B:33:0x00b5, B:35:0x00b9, B:39:0x00c3, B:41:0x00c9, B:43:0x00d3, B:44:0x00dd, B:46:0x00e1, B:48:0x00e5, B:49:0x00f2, B:51:0x00f6, B:53:0x00fc, B:55:0x0100, B:57:0x0104, B:59:0x010a, B:61:0x0118, B:63:0x011c, B:65:0x012a, B:66:0x0140, B:68:0x0146, B:69:0x012f, B:71:0x013e, B:72:0x014c, B:74:0x0150, B:76:0x0156, B:77:0x015c, B:82:0x003a, B:84:0x003e, B:86:0x0042, B:88:0x0046, B:90:0x004e, B:91:0x0055, B:93:0x0059, B:95:0x005d, B:97:0x0065), top: B:4:0x0017 }] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00b9 A[Catch: Exception -> 0x0163, TRY_LEAVE, TryCatch #0 {Exception -> 0x0163, blocks: (B:5:0x0017, B:10:0x0025, B:12:0x002b, B:14:0x0035, B:15:0x006b, B:17:0x0071, B:18:0x0078, B:21:0x0081, B:23:0x0087, B:25:0x0091, B:28:0x009f, B:30:0x00a5, B:32:0x00af, B:33:0x00b5, B:35:0x00b9, B:39:0x00c3, B:41:0x00c9, B:43:0x00d3, B:44:0x00dd, B:46:0x00e1, B:48:0x00e5, B:49:0x00f2, B:51:0x00f6, B:53:0x00fc, B:55:0x0100, B:57:0x0104, B:59:0x010a, B:61:0x0118, B:63:0x011c, B:65:0x012a, B:66:0x0140, B:68:0x0146, B:69:0x012f, B:71:0x013e, B:72:0x014c, B:74:0x0150, B:76:0x0156, B:77:0x015c, B:82:0x003a, B:84:0x003e, B:86:0x0042, B:88:0x0046, B:90:0x004e, B:91:0x0055, B:93:0x0059, B:95:0x005d, B:97:0x0065), top: B:4:0x0017 }] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00e1 A[Catch: Exception -> 0x0163, TryCatch #0 {Exception -> 0x0163, blocks: (B:5:0x0017, B:10:0x0025, B:12:0x002b, B:14:0x0035, B:15:0x006b, B:17:0x0071, B:18:0x0078, B:21:0x0081, B:23:0x0087, B:25:0x0091, B:28:0x009f, B:30:0x00a5, B:32:0x00af, B:33:0x00b5, B:35:0x00b9, B:39:0x00c3, B:41:0x00c9, B:43:0x00d3, B:44:0x00dd, B:46:0x00e1, B:48:0x00e5, B:49:0x00f2, B:51:0x00f6, B:53:0x00fc, B:55:0x0100, B:57:0x0104, B:59:0x010a, B:61:0x0118, B:63:0x011c, B:65:0x012a, B:66:0x0140, B:68:0x0146, B:69:0x012f, B:71:0x013e, B:72:0x014c, B:74:0x0150, B:76:0x0156, B:77:0x015c, B:82:0x003a, B:84:0x003e, B:86:0x0042, B:88:0x0046, B:90:0x004e, B:91:0x0055, B:93:0x0059, B:95:0x005d, B:97:0x0065), top: B:4:0x0017 }] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00f6 A[Catch: Exception -> 0x0163, TryCatch #0 {Exception -> 0x0163, blocks: (B:5:0x0017, B:10:0x0025, B:12:0x002b, B:14:0x0035, B:15:0x006b, B:17:0x0071, B:18:0x0078, B:21:0x0081, B:23:0x0087, B:25:0x0091, B:28:0x009f, B:30:0x00a5, B:32:0x00af, B:33:0x00b5, B:35:0x00b9, B:39:0x00c3, B:41:0x00c9, B:43:0x00d3, B:44:0x00dd, B:46:0x00e1, B:48:0x00e5, B:49:0x00f2, B:51:0x00f6, B:53:0x00fc, B:55:0x0100, B:57:0x0104, B:59:0x010a, B:61:0x0118, B:63:0x011c, B:65:0x012a, B:66:0x0140, B:68:0x0146, B:69:0x012f, B:71:0x013e, B:72:0x014c, B:74:0x0150, B:76:0x0156, B:77:0x015c, B:82:0x003a, B:84:0x003e, B:86:0x0042, B:88:0x0046, B:90:0x004e, B:91:0x0055, B:93:0x0059, B:95:0x005d, B:97:0x0065), top: B:4:0x0017 }] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0118 A[Catch: Exception -> 0x0163, TryCatch #0 {Exception -> 0x0163, blocks: (B:5:0x0017, B:10:0x0025, B:12:0x002b, B:14:0x0035, B:15:0x006b, B:17:0x0071, B:18:0x0078, B:21:0x0081, B:23:0x0087, B:25:0x0091, B:28:0x009f, B:30:0x00a5, B:32:0x00af, B:33:0x00b5, B:35:0x00b9, B:39:0x00c3, B:41:0x00c9, B:43:0x00d3, B:44:0x00dd, B:46:0x00e1, B:48:0x00e5, B:49:0x00f2, B:51:0x00f6, B:53:0x00fc, B:55:0x0100, B:57:0x0104, B:59:0x010a, B:61:0x0118, B:63:0x011c, B:65:0x012a, B:66:0x0140, B:68:0x0146, B:69:0x012f, B:71:0x013e, B:72:0x014c, B:74:0x0150, B:76:0x0156, B:77:0x015c, B:82:0x003a, B:84:0x003e, B:86:0x0042, B:88:0x0046, B:90:0x004e, B:91:0x0055, B:93:0x0059, B:95:0x005d, B:97:0x0065), top: B:4:0x0017 }] */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0150 A[Catch: Exception -> 0x0163, TryCatch #0 {Exception -> 0x0163, blocks: (B:5:0x0017, B:10:0x0025, B:12:0x002b, B:14:0x0035, B:15:0x006b, B:17:0x0071, B:18:0x0078, B:21:0x0081, B:23:0x0087, B:25:0x0091, B:28:0x009f, B:30:0x00a5, B:32:0x00af, B:33:0x00b5, B:35:0x00b9, B:39:0x00c3, B:41:0x00c9, B:43:0x00d3, B:44:0x00dd, B:46:0x00e1, B:48:0x00e5, B:49:0x00f2, B:51:0x00f6, B:53:0x00fc, B:55:0x0100, B:57:0x0104, B:59:0x010a, B:61:0x0118, B:63:0x011c, B:65:0x012a, B:66:0x0140, B:68:0x0146, B:69:0x012f, B:71:0x013e, B:72:0x014c, B:74:0x0150, B:76:0x0156, B:77:0x015c, B:82:0x003a, B:84:0x003e, B:86:0x0042, B:88:0x0046, B:90:0x004e, B:91:0x0055, B:93:0x0059, B:95:0x005d, B:97:0x0065), top: B:4:0x0017 }] */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        CharSequence charSequence;
        TL_stars.StarGift starGift;
        TextView textView;
        ov4 ov4Var;
        yc ycVar;
        TL_stars.SavedStarGift savedStarGift;
        TL_stars.SavedStarGift savedStarGift2;
        wf2 wf2Var;
        be0 be0Var;
        long n;
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
            if (this.b0 == null) {
                TL_stars.SavedStarGift savedStarGift3 = this.f0;
                if (savedStarGift3 != null && (starGift = savedStarGift3.gift) != null) {
                    if ((starGift instanceof TL_stars.TL_starGiftUnique) && !TextUtils.isEmpty(starGift.title)) {
                        charSequence = this.f0.gift.title;
                        if (TextUtils.isEmpty(charSequence)) {
                        }
                        sb.append(charSequence);
                        textView = this.J;
                        if (textView != null) {
                        }
                        ov4Var = this.f;
                        if (ov4Var != null) {
                        }
                        ycVar = this.K;
                        if (ycVar != null) {
                        }
                        savedStarGift = this.f0;
                        if (savedStarGift != null) {
                        }
                        savedStarGift2 = this.f0;
                        if (savedStarGift2 != null) {
                        }
                        wf2Var = this.n0;
                        if (wf2Var != null) {
                        }
                        accessibilityNodeInfo.setContentDescription(sb.toString());
                    }
                    charSequence = null;
                    if (TextUtils.isEmpty(charSequence)) {
                    }
                    sb.append(charSequence);
                    textView = this.J;
                    if (textView != null) {
                    }
                    ov4Var = this.f;
                    if (ov4Var != null) {
                    }
                    ycVar = this.K;
                    if (ycVar != null) {
                    }
                    savedStarGift = this.f0;
                    if (savedStarGift != null) {
                    }
                    savedStarGift2 = this.f0;
                    if (savedStarGift2 != null) {
                    }
                    wf2Var = this.n0;
                    if (wf2Var != null) {
                    }
                    accessibilityNodeInfo.setContentDescription(sb.toString());
                }
                TL_stars.StarGift starGift2 = this.c0;
                if (starGift2 != null && (starGift2 instanceof TL_stars.TL_starGiftUnique) && !TextUtils.isEmpty(starGift2.title)) {
                    charSequence = this.c0.title;
                    if (TextUtils.isEmpty(charSequence)) {
                    }
                    sb.append(charSequence);
                    textView = this.J;
                    if (textView != null) {
                    }
                    ov4Var = this.f;
                    if (ov4Var != null) {
                    }
                    ycVar = this.K;
                    if (ycVar != null) {
                    }
                    savedStarGift = this.f0;
                    if (savedStarGift != null) {
                    }
                    savedStarGift2 = this.f0;
                    if (savedStarGift2 != null) {
                    }
                    wf2Var = this.n0;
                    if (wf2Var != null) {
                    }
                    accessibilityNodeInfo.setContentDescription(sb.toString());
                }
                charSequence = null;
                if (TextUtils.isEmpty(charSequence)) {
                }
                sb.append(charSequence);
                textView = this.J;
                if (textView != null) {
                }
                ov4Var = this.f;
                if (ov4Var != null) {
                }
                ycVar = this.K;
                if (ycVar != null) {
                }
                savedStarGift = this.f0;
                if (savedStarGift != null) {
                }
                savedStarGift2 = this.f0;
                if (savedStarGift2 != null) {
                }
                wf2Var = this.n0;
                if (wf2Var != null) {
                }
                accessibilityNodeInfo.setContentDescription(sb.toString());
            }
            TextView textView3 = this.I;
            if (textView3 != null && textView3.getVisibility() == 0 && !TextUtils.isEmpty(textView3.getText())) {
                charSequence = textView3.getText();
                if (TextUtils.isEmpty(charSequence)) {
                    charSequence = k96.M0(2131750176, null);
                }
                sb.append(charSequence);
                textView = this.J;
                if (textView != null && textView.getVisibility() == 0 && !TextUtils.isEmpty(textView.getText())) {
                    sb.append(", ");
                    sb.append(textView.getText());
                }
                ov4Var = this.f;
                if (ov4Var != null && ov4Var.getVisibility() == 0) {
                    text = ov4Var.getText();
                    if (!TextUtils.isEmpty(text)) {
                        sb.append(", ");
                        sb.append(text);
                    }
                }
                ycVar = this.K;
                if (ycVar != null && ycVar.getVisibility() == 0 && (textView2 = this.M) != null && textView2.getVisibility() == 0 && !TextUtils.isEmpty(textView2.getText())) {
                    sb.append(", ");
                    sb.append(textView2.getText());
                }
                savedStarGift = this.f0;
                if (savedStarGift != null && savedStarGift.unsaved) {
                    sb.append(", ");
                    sb.append(k96.M0(2131750184, null));
                }
                savedStarGift2 = this.f0;
                if (savedStarGift2 != null && !(savedStarGift2.gift instanceof TL_stars.TL_starGiftUnique) && !savedStarGift2.name_hidden && (be0Var = this.n) != null && be0Var.getVisibility() == 0) {
                    n = cf3.n(this.f0.from_id);
                    if (n != 0) {
                        int i = this.a;
                        if (n > 0) {
                            TLRPC.User V1 = na7.q1(i).V1(Long.valueOf(n));
                            if (V1 != null) {
                                str = l7c.r(V1);
                            }
                        } else {
                            TLRPC.Chat K0 = na7.q1(i).K0(Long.valueOf(-n));
                            if (K0 != null) {
                                str = K0.title;
                            }
                        }
                        if (!TextUtils.isEmpty(str)) {
                            sb.append(", ");
                            sb.append((CharSequence) str);
                        }
                    }
                }
                wf2Var = this.n0;
                if (wf2Var != null && wf2Var.a.q) {
                    accessibilityNodeInfo.setCheckable(true);
                    accessibilityNodeInfo.setChecked(true);
                }
                accessibilityNodeInfo.setContentDescription(sb.toString());
            }
            charSequence = null;
            if (TextUtils.isEmpty(charSequence)) {
            }
            sb.append(charSequence);
            textView = this.J;
            if (textView != null) {
                sb.append(", ");
                sb.append(textView.getText());
            }
            ov4Var = this.f;
            if (ov4Var != null) {
                text = ov4Var.getText();
                if (!TextUtils.isEmpty(text)) {
                }
            }
            ycVar = this.K;
            if (ycVar != null) {
                sb.append(", ");
                sb.append(textView2.getText());
            }
            savedStarGift = this.f0;
            if (savedStarGift != null) {
                sb.append(", ");
                sb.append(k96.M0(2131750184, null));
            }
            savedStarGift2 = this.f0;
            if (savedStarGift2 != null) {
                n = cf3.n(this.f0.from_id);
                if (n != 0) {
                }
            }
            wf2Var = this.n0;
            if (wf2Var != null) {
                accessibilityNodeInfo.setCheckable(true);
                accessibilityNodeInfo.setChecked(true);
            }
            accessibilityNodeInfo.setContentDescription(sb.toString());
        } catch (Exception unused) {
        }
    }

    public void setImageLayer(int i) {
        this.E.setLayerNum(i);
    }

    public void setImageSize(int i) {
        FrameLayout.LayoutParams layoutParams = this.F;
        layoutParams.width = i;
        layoutParams.height = i;
    }

    public void setRibbonColor(int i) {
        this.o0 = -1;
        ov4 ov4Var = this.f;
        ov4Var.setColor(i);
        ov4Var.invalidate();
    }

    public void setRibbonText(String str) {
        this.f.b(str, true);
    }

    public void setRibbonTextOneOf(int i) {
        ov4 ov4Var = this.f;
        ov4Var.setVisibility(0);
        setRibbonColorKey(bkb.Bj);
        ov4Var.setStrokeColor(0);
        this.p0 = false;
        ov4Var.setBackdrop((TL_stars.starGiftAttributeBackdrop) gta.i(this.c0.attributes, TL_stars.starGiftAttributeBackdrop.class));
        ov4Var.b(k96.a0(null, null, 2131750119, gl.o0(i, 0)), true);
    }

    @Override // tjb
    public final void updateColors() {
        int v0;
        be0 be0Var;
        int v02;
        try {
            boolean o = bkb.I.o();
            if (o != this.v0) {
                this.v0 = o;
                if (this.t0 != 0 && this.L != null && this.M != null && this.x != null) {
                    a();
                }
                TextView textView = this.N;
                if (textView != null) {
                    textView.setTextColor(o ? -1333971 : -2722014);
                }
            }
            ov4 ov4Var = this.f;
            wjb wjbVar = this.b;
            if (ov4Var != null) {
                int i = this.o0;
                if (i >= 0) {
                    qv4 qv4Var = ov4Var.a;
                    ((Paint) qv4Var.b).setColor(bkb.v0(i, wjbVar));
                    qv4Var.invalidateSelf();
                }
                if (this.p0) {
                    ov4Var.setStrokeColor(bkb.v(bkb.v0(bkb.c6, wjbVar), bkb.p1(0.04f, bkb.v0(bkb.F6, wjbVar))));
                }
                ov4Var.invalidate();
            }
            if (this.q0 && (be0Var = this.n) != null && (v02 = bkb.v0(bkb.mk, wjbVar)) != this.r0) {
                this.r0 = v02;
                be0Var.setColorFilter(new PorterDuffColorFilter(v02, PorterDuff.Mode.SRC_IN));
            }
            kv4 kv4Var = this.e;
            if (kv4Var != null) {
                int[] iArr = this.s0;
                if (iArr != null && kv4Var.m == iArr && (iArr[0] != (v0 = bkb.v0(bkb.Cj, wjbVar)) || iArr[1] != v0)) {
                    iArr[1] = v0;
                    iArr[0] = v0;
                    kv4Var.n = null;
                }
                kv4Var.invalidateSelf();
            }
        } catch (Exception e) {
            fa4.g(e, true);
        }
    }
}
