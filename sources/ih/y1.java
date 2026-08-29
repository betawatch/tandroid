package ih;

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
import i7.h6;
import jh.da;
import jh.ia;
import jh.k8;
import jh.s7;
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
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Components.e9;
import org.telegram.ui.Components.h70;
import org.telegram.ui.Components.hp;
import org.telegram.ui.Components.iq;
import org.telegram.ui.Components.jq;
import org.telegram.ui.Components.jr;
import org.telegram.ui.Components.so0;
import org.telegram.ui.Components.t9;
import org.telegram.ui.Components.zz0;
import org.telegram.ui.th;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public class y1 extends FrameLayout {
    public static final int[] h0 = {-2781403, -3635939};
    public FrameLayout.LayoutParams A;
    public final cg.t1 B;
    public final cg.t1 C;
    public final TextView D;
    public final TextView E;
    public final bg.x2 F;
    public final cg.h0 G;
    public final TextView H;
    public final TextView I;
    public k8 J;
    public zz0 K;
    public zz0 L;
    public final Rect M;
    public boolean N;
    public boolean O;
    public boolean P;
    public final org.telegram.ui.Components.d6 Q;
    public cg.n R;
    public TL_stars.StarGift S;
    public boolean T;
    public boolean U;
    public TL_stars.SavedStarGift V;
    public boolean W;
    public final int a;
    public boolean a0;
    public final org.telegram.ui.ActionBar.c6 b;
    public boolean b0;
    public final so0 c;
    public boolean c0;
    public final FrameLayout d;
    public cg.n d0;
    public final v1 e;
    public TLRPC.Document e0;
    public final z1 f;
    public TL_stars.SavedStarGift f0;
    public hp g0;
    public final e9 h;
    public final t9 n;
    public final FrameLayout.LayoutParams r;
    public final FrameLayout.LayoutParams s;
    public final FrameLayout v;
    public final ImageView w;
    public final TextView x;
    public final t9 y;

    public y1(Context context, int i10, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context);
        this.M = new Rect();
        this.Q = new org.telegram.ui.Components.d6(this, 0L, 320L, jr.h);
        this.a = i10;
        this.b = c6Var;
        h6.b(this, 0.04f, 1.5f);
        this.c = new so0(this);
        FrameLayout frameLayout = new FrameLayout(context);
        this.d = frameLayout;
        v1 v1Var = new v1(frameLayout, c6Var, true);
        this.e = v1Var;
        frameLayout.setBackground(v1Var);
        addView(frameLayout, i7.f6.e(-1, -1, 119));
        z1 z1Var = new z1(context);
        this.f = z1Var;
        addView(z1Var, i7.f6.d(-2, -2.0f, 53, 0.0f, 2.0f, 1.0f, 0.0f));
        t9 t9Var = new t9(context);
        this.y = t9Var;
        t9Var.getImageReceiver().setAutoRepeat(0);
        FrameLayout.LayoutParams d = i7.f6.d(80, 80.0f, 17, 0.0f, 12.0f, 0.0f, 12.0f);
        this.A = d;
        frameLayout.addView(t9Var, d);
        cg.t1 t1Var = new cg.t1(context, 3, c6Var);
        this.B = t1Var;
        t1Var.setImageReceiver(t9Var.getImageReceiver());
        frameLayout.addView(t1Var, i7.f6.d(30, 30.0f, 49, 0.0f, 38.0f, 0.0f, 0.0f));
        cg.t1 t1Var2 = new cg.t1(context, 4, c6Var);
        this.C = t1Var2;
        t1Var2.setImageReceiver(t9Var.getImageReceiver());
        frameLayout.addView(t1Var2, i7.f6.e(44, 44, 17));
        t1Var2.setAlpha(0.0f);
        t1Var2.setScaleX(0.3f);
        t1Var2.setScaleY(0.3f);
        t1Var2.setVisibility(8);
        TextView textView = new TextView(context);
        this.D = textView;
        int i11 = g6.G6;
        textView.setTextColor(g6.v0(i11, c6Var));
        textView.setGravity(17);
        th.n(14.0f, 1, textView);
        TextView h = th.h(frameLayout, textView, i7.f6.d(-1, -2.0f, 48, 0.0f, 89.0f, 0.0f, 0.0f), context);
        this.E = h;
        h.setTextColor(g6.v0(i11, c6Var));
        h.setGravity(17);
        h.setTextSize(1, 12.0f);
        frameLayout.addView(h, i7.f6.d(-1, -2.0f, 48, 0.0f, 107.0f, 0.0f, 0.0f));
        bg.x2 x2Var = new bg.x2(this, context, 6);
        this.F = x2Var;
        TextView textView2 = new TextView(context);
        this.H = textView2;
        textView2.setTextSize(1, 12.0f);
        textView2.setTypeface(AndroidUtilities.bold());
        textView2.setPadding(AndroidUtilities.dp(10.0f), 0, AndroidUtilities.dp(10.0f), 0);
        textView2.setGravity(17);
        textView2.setTextColor(-13397548);
        frameLayout.addView(x2Var, i7.f6.d(-2, -2.0f, 81, 0.0f, 0.0f, 0.0f, 11.0f));
        cg.h0 h0Var = new cg.h0(context, 1);
        this.G = h0Var;
        h0Var.setBackgroundColor(-16776961);
        x2Var.addView(h0Var, i7.f6.c(0.0f, 0));
        x2Var.addView(textView2, i7.f6.e(-2, 26, 17));
        h0Var.setBackground(new d2(g6.I.q() ? 518759725 : 1088989954));
        TextView textView3 = new TextView(context);
        this.I = textView3;
        textView3.setTextSize(1, 10.66f);
        textView3.setGravity(17);
        textView3.setTextColor(g6.I.q() ? -1333971 : -2722014);
        textView3.setVisibility(8);
        frameLayout.addView(textView3, i7.f6.d(-2, -2.0f, 49, 0.0f, 161.0f, 0.0f, 8.0f));
        this.h = new e9((org.telegram.ui.ActionBar.c6) null);
        t9 t9Var2 = new t9(context);
        this.n = t9Var2;
        t9Var2.setRoundRadius(AndroidUtilities.dp(20.0f));
        t9Var2.setVisibility(8);
        FrameLayout.LayoutParams d10 = i7.f6.d(20, 20.0f, 51, 2.0f, 2.0f, 2.0f, 2.0f);
        this.r = d10;
        frameLayout.addView(t9Var2, d10);
        this.s = i7.f6.d(20, 20.0f, 51, 5.0f, 5.0f, 2.0f, 2.0f);
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
        frameLayout2.addView(imageView, i7.f6.a(12.66f, 12.66f, 17));
        frameLayout.addView(frameLayout2, i7.f6.d(20, 20.0f, 51, 2.0f, 2.0f, 2.0f, 2.0f));
        ImageView imageView2 = new ImageView(context);
        this.w = imageView2;
        imageView2.setImageResource(R.drawable.mini_gram_14);
        imageView2.setPadding(0, AndroidUtilities.dp(2.0f), 0, 0);
        imageView2.setVisibility(8);
        imageView2.setScaleType(ImageView.ScaleType.CENTER);
        frameLayout.addView(imageView2, i7.f6.d(20, 20.0f, 51, 3.0f, 3.0f, 3.0f, 3.0f));
        TextView textView4 = new TextView(context);
        this.x = textView4;
        textView4.setTextSize(1, 10.0f);
        textView4.setTypeface(AndroidUtilities.bold());
        textView4.setPadding(AndroidUtilities.dp(5.0f), 0, AndroidUtilities.dp(5.0f), 0);
        textView4.setGravity(17);
        textView4.setTextColor(-1);
        frameLayout.addView(textView4, i7.f6.d(-2, 17.0f, 51, 4.0f, 4.0f, 0.0f, 0.0f));
        textView4.setVisibility(8);
        setImportantForAccessibility(1);
        frameLayout.setImportantForAccessibility(4);
        z1Var.setImportantForAccessibility(2);
    }

    private TL_stars.TL_starGiftUnique getUniqueStarGift() {
        TL_stars.SavedStarGift savedStarGift = this.V;
        if (savedStarGift == null) {
            return null;
        }
        TL_stars.StarGift starGift = savedStarGift.gift;
        if (starGift instanceof TL_stars.TL_starGiftUnique) {
            return (TL_stars.TL_starGiftUnique) starGift;
        }
        return null;
    }

    public final void a(h70 h70Var, Canvas canvas, float f9, float f10, float f11) {
        float f12;
        float f13;
        Canvas canvas2 = canvas;
        canvas2.save();
        canvas2.scale(getScaleX(), getScaleY(), f9 / 2.0f, f10 / 2.0f);
        TL_stars.TL_starGiftUnique uniqueStarGift = getUniqueStarGift();
        float dp = uniqueStarGift != null ? AndroidUtilities.dp(63.0f) * f11 : 0.0f;
        v1 v1Var = this.e;
        v1Var.setBounds(0, 0, (int) f9, (int) f10);
        v1Var.b(canvas2, f11);
        v1Var.getPadding(this.M);
        float lerp = AndroidUtilities.lerp(AndroidUtilities.dp(80.0f), AndroidUtilities.dp(120.0f), f11);
        t9 t9Var = this.y;
        float f14 = f10 - dp;
        t9Var.getImageReceiver().setImageCoords((f9 - lerp) / 2.0f, (f14 - lerp) / 2.0f, lerp, lerp);
        t9Var.getImageReceiver().draw(canvas2);
        if (t9Var.getImageReceiver().isLottieRunning()) {
            h70Var.invalidate();
        }
        cg.t1 t1Var = this.B;
        if (t1Var.getVisibility() != 0 || t1Var.getAlpha() <= 0.0f) {
            f12 = 1.0f;
        } else {
            canvas2.save();
            canvas2.translate((f9 - t1Var.getMeasuredWidth()) / 2.0f, AndroidUtilities.lerp(t1Var.getY(), (f14 - t1Var.getMeasuredHeight()) / 2.0f, f11));
            f12 = 1.0f;
            canvas2.saveLayerAlpha(0.0f, 0.0f, t1Var.getWidth(), t1Var.getHeight(), (int) (t1Var.getAlpha() * (1.0f - f11) * 255.0f), 31);
            t1Var.draw(canvas2);
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
        t9 t9Var2 = this.n;
        if (t9Var2.getVisibility() == 0 && t9Var2.getAlpha() > 0.0f) {
            canvas2.save();
            canvas2.translate(AndroidUtilities.dp(2.0f) + r14.left, AndroidUtilities.dp(2.0f) + r14.top);
            t9Var2.draw(canvas2);
            canvas2.restore();
        }
        z1 z1Var = this.f;
        if (z1Var.getVisibility() != 0 || z1Var.getAlpha() <= 0.0f) {
            f13 = 1.0f;
        } else {
            canvas2.save();
            canvas2.translate(f9 - AndroidUtilities.dp(f12), AndroidUtilities.dp(2.0f));
            f13 = 1.0f;
            float lerp2 = AndroidUtilities.lerp(1.0f, 1.25f, f11);
            canvas2.scale(lerp2, lerp2);
            canvas2.translate(-z1Var.getWidth(), 0.0f);
            z1Var.draw(canvas2);
            canvas2.restore();
        }
        if (uniqueStarGift != null) {
            if (this.K == null) {
                this.K = new zz0(uniqueStarGift.title, 20.0f, AndroidUtilities.bold());
            }
            if (this.L == null) {
                this.L = new zz0(LocaleController.formatPluralStringComma("Gift2CollectionNumber", uniqueStarGift.num), 13.0f, null);
            }
            zz0 zz0Var = this.K;
            zz0Var.p = f9 - AndroidUtilities.dp(8.0f);
            float f15 = f13 - f11;
            zz0Var.c((f9 - this.K.l()) / 2.0f, ((f10 - AndroidUtilities.dp(40.0f)) - (this.K.j() / 2.0f)) + (AndroidUtilities.dp(50.0f) * f15), f11, -1, canvas);
            zz0 zz0Var2 = this.L;
            zz0Var2.p = f9 - AndroidUtilities.dp(8.0f);
            zz0Var2.c((f9 - this.L.l()) / 2.0f, ((f10 - AndroidUtilities.dp(19.0f)) - (this.L.j() / 2.0f)) + (AndroidUtilities.dp(50.0f) * f15), 0.6f * f11, -1, canvas);
            canvas2 = canvas;
        }
        bg.x2 x2Var = this.F;
        if (x2Var != null && x2Var.getVisibility() == 0) {
            canvas2.save();
            canvas2.translate(x2Var.getX(), x2Var.getY());
            canvas2.saveLayerAlpha(0.0f, 0.0f, x2Var.getWidth(), x2Var.getHeight(), (int) (x2Var.getAlpha() * (f13 - f11) * 255.0f), 31);
            x2Var.draw(canvas2);
            canvas2.restore();
            canvas2.restore();
        }
        ImageView imageView = this.w;
        if (imageView != null && imageView.getVisibility() == 0) {
            canvas2.save();
            canvas2.translate(imageView.getX(), imageView.getY());
            canvas2.saveLayerAlpha(0.0f, 0.0f, imageView.getWidth(), imageView.getHeight(), (int) (imageView.getAlpha() * (f13 - f11) * 255.0f), 31);
            imageView.draw(canvas2);
            canvas2.restore();
            canvas2.restore();
        }
        canvas2.restore();
    }

    public final void b(boolean z10, boolean z11) {
        if (this.g0 == null) {
            hp hpVar = new hp(getContext(), 21, null);
            this.g0 = hpVar;
            hpVar.b(-1, g6.d6, g6.k7);
            this.g0.setDrawUnchecked(false);
            this.d.addView(this.g0, i7.f6.d(24, 24.0f, 51, 4.0f, 4.0f, 4.0f, 4.0f));
        }
        this.n.setVisibility(8);
        this.g0.a(z10, z11);
    }

    public final void c(boolean z10, boolean z11) {
        TL_stars.SavedStarGift savedStarGift;
        if (this.N == z10) {
            return;
        }
        this.N = z10;
        boolean z12 = false;
        FrameLayout frameLayout = this.v;
        if (z11) {
            frameLayout.setVisibility(0);
            frameLayout.animate().alpha(z10 ? 1.0f : 0.0f).scaleX(z10 ? 1.0f : 0.3f).scaleY(z10 ? 1.0f : 0.3f).withEndAction(new w1(this, z10, 1)).start();
        } else {
            frameLayout.setVisibility(z10 ? 0 : 8);
            frameLayout.setAlpha(z10 ? 1.0f : 0.0f);
            frameLayout.setScaleX(z10 ? 1.0f : 0.3f);
            frameLayout.setScaleY(z10 ? 1.0f : 0.3f);
        }
        if (!this.N && this.P && !this.b0 && (savedStarGift = this.V) != null && (savedStarGift.gift instanceof TL_stars.TL_starGiftUnique)) {
            z12 = true;
        }
        f(z12, z11);
        j();
    }

    public final void d(boolean z10, boolean z11) {
        TL_stars.SavedStarGift savedStarGift;
        if (this.P == z10) {
            return;
        }
        this.P = z10;
        if (!z11) {
            this.Q.a(z10);
        }
        invalidate();
        f((this.N || !z10 || this.b0 || (savedStarGift = this.V) == null || !(savedStarGift.gift instanceof TL_stars.TL_starGiftUnique)) ? false : true, z11);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        canvas.save();
        canvas.translate(getWidth() / 2.0f, getHeight() / 2.0f);
        float e10 = this.Q.e(this.P);
        if (e10 > 0.0f) {
            this.c.a(canvas, e10);
        }
        canvas.translate((-getWidth()) / 2.0f, (-getHeight()) / 2.0f);
        super.dispatchDraw(canvas);
        canvas.restore();
    }

    public final void e(boolean z10, boolean z11) {
        this.e.f(z10, z11);
        ImageView imageView = this.w;
        if (z11) {
            imageView.animate().translationX(z10 ? AndroidUtilities.dp(6.0f) : 0.0f).translationY(z10 ? AndroidUtilities.dp(6.0f) : 0.0f).setDuration(320L).setInterpolator(jr.h).start();
            return;
        }
        imageView.animate().cancel();
        imageView.setTranslationX(z10 ? AndroidUtilities.dp(6.0f) : 0.0f);
        imageView.setTranslationY(z10 ? AndroidUtilities.dp(6.0f) : 0.0f);
    }

    public final void f(boolean z10, boolean z11) {
        if (this.O == z10) {
            return;
        }
        this.O = z10;
        cg.t1 t1Var = this.C;
        if (z11) {
            t1Var.setVisibility(0);
            t1Var.animate().alpha(z10 ? 1.0f : 0.0f).scaleX(z10 ? 1.0f : 0.3f).scaleY(z10 ? 1.0f : 0.3f).withEndAction(new w1(this, z10, 0)).start();
        } else {
            t1Var.setVisibility(z10 ? 0 : 8);
            t1Var.setAlpha(z10 ? 1.0f : 0.0f);
            t1Var.setScaleX(z10 ? 1.0f : 0.3f);
            t1Var.setScaleY(z10 ? 1.0f : 0.3f);
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
    public final void g(TL_stars.StarGift starGift, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14) {
        String str;
        long j10;
        long j11;
        long j12;
        boolean z15;
        boolean z16;
        long j13;
        boolean z17;
        k8 k8Var = this.J;
        ColorFilter colorFilter = null;
        if (k8Var != null) {
            k8Var.run();
            this.J = null;
        }
        i(starGift, starGift.getDocument());
        TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop = (TL_stars.starGiftAttributeBackdrop) s7.l(starGift.attributes, TL_stars.starGiftAttributeBackdrop.class);
        v1 v1Var = this.e;
        v1Var.d(stargiftattributebackdrop);
        v1Var.e((TL_stars.starGiftAttributePattern) s7.l(starGift.attributes, TL_stars.starGiftAttributePattern.class));
        boolean z18 = starGift.auction;
        int[] iArr = h0;
        org.telegram.ui.ActionBar.c6 c6Var = this.b;
        if (!z18 || (((z17 = starGift.sold_out) && !this.T) || (z12 && starGift.availability_resale > 0))) {
            if (!starGift.require_premium || (z12 && starGift.availability_resale > 0)) {
                iArr = null;
            }
            v1Var.g(iArr);
        } else if (z17) {
            int i10 = g6.Mi;
            v1Var.g(new int[]{g6.v0(i10, c6Var), g6.v0(i10, c6Var)});
        } else {
            v1Var.g(iArr);
        }
        this.D.setVisibility(8);
        this.E.setVisibility(8);
        t9 t9Var = this.y;
        t9Var.setTranslationY(0.0f);
        this.B.setVisibility(8);
        int i11 = starGift.resale_ton_only ? 0 : 8;
        ImageView imageView = this.w;
        imageView.setVisibility(i11);
        int i12 = z14 ? 0 : 8;
        TextView textView = this.x;
        textView.setVisibility(i12);
        textView.setTranslationX(starGift.resale_ton_only ? AndroidUtilities.dp(23.0f) : 0.0f);
        textView.setTranslationY(starGift.resale_ton_only ? AndroidUtilities.dp(1.0f) : 0.0f);
        if (z14) {
            StringBuilder sb2 = new StringBuilder("+");
            int i13 = starGift.craft_chance_permille;
            sb2.append((Object) (i13 <= 0 ? "<0.1%" : ph.j.G0(i13)));
            textView.setText(sb2.toString());
        }
        FrameLayout.LayoutParams layoutParams = this.A;
        layoutParams.gravity = 49;
        t9Var.setLayoutParams(layoutParams);
        int i14 = this.a;
        t9 t9Var2 = this.n;
        if (!z13) {
            if ((!z12 || starGift.availability_resale <= 0) && starGift.locked_until_date > ConnectionsManager.getInstance(i14).getCurrentTime()) {
                t9Var2.setVisibility(0);
                t9Var2.setLayoutParams(this.s);
                t9Var2.setColorFilter(new PorterDuffColorFilter(g6.v0(g6.wj, c6Var), PorterDuff.Mode.SRC_IN));
                t9Var2.setImageResource(R.drawable.mini_gift_lock);
                int i15 = (z14 || z13) ? 0 : 8;
                TextView textView2 = this.H;
                textView2.setVisibility(i15);
                textView2.setTextSize(1, 12.0f);
                cg.h0 h0Var = this.G;
                if (!z10) {
                    textView2.setPadding(AndroidUtilities.dp(10.0f), 0, AndroidUtilities.dp(10.0f), 0);
                    textView2.setText(LocaleController.getString(R.string.Gift2TransferMine));
                    int v = stargiftattributebackdrop != null ? g6.v(stargiftattributebackdrop.center_color | (-16777216), g6.l1(0.55f, stargiftattributebackdrop.pattern_color | (-16777216))) : 1090519039;
                    int dp = AndroidUtilities.dp(13.0f);
                    int v10 = g6.v(v, 822083583);
                    int i16 = v;
                    h0Var.setBackground(g6.i0(dp, dp, dp, dp, i16, v10, v10));
                    textView2.setTextColor(-1);
                    imageView.setColorFilter(-1);
                    int dp2 = AndroidUtilities.dp(10.0f);
                    int v11 = g6.v(i16, 822083583);
                    imageView.setBackground(g6.i0(dp2, dp2, dp2, dp2, i16, v11, v11));
                } else if (z13) {
                    textView2.setPadding(AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(10.0f), 0);
                    long resellStars = starGift.getResellStars();
                    int v12 = g6.v(stargiftattributebackdrop.center_color | (-16777216), g6.l1(0.55f, stargiftattributebackdrop.pattern_color | (-16777216)));
                    textView2.setText(ia.Q0("XTR " + LocaleController.formatNumber(resellStars, ',')));
                    h0Var.setBackground(new d2(1895825407, v12));
                    textView2.setTextColor(-1);
                    imageView.setColorFilter(-1);
                    imageView.setBackground(g6.b0(AndroidUtilities.dp(10.0f), v12));
                    textView.setBackground(g6.b0(AndroidUtilities.dp(9.0f), v12));
                } else {
                    textView2.setPadding(AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(10.0f), 0);
                    if (z12) {
                        long j14 = starGift.availability_resale;
                        if (j14 > 0) {
                            str = "+";
                            long j15 = starGift.resell_min_stars;
                            if (j14 > 1) {
                                j13 = j15;
                                if (j13 < MessagesController.getInstance(i14).config.starsStarGiftResaleAmountMax.get()) {
                                    j12 = j13;
                                    z15 = true;
                                    if (starGift.auction || starGift.availability_resale != 0) {
                                        StringBuilder sb3 = new StringBuilder("XTR ");
                                        sb3.append(LocaleController.formatNumber(j12, ','));
                                        sb3.append(z15 ? str : "");
                                        textView2.setText(ia.X0(false, sb3.toString(), 0.71f, null));
                                    } else {
                                        textView2.setText(LocaleController.getString(starGift.sold_out ? R.string.Gift2AuctionPriceView : R.string.Gift2AuctionPriceJoin));
                                    }
                                    z16 = starGift instanceof TL_stars.TL_starGiftUnique;
                                    int i17 = 518759725;
                                    h0Var.setBackground(new d2(z16 ? 1090519039 : g6.I.q() ? 518759725 : 1088989954));
                                    textView2.setTextColor(g6.I.q() ? -1333971 : -2722014);
                                    imageView.setColorFilter(g6.I.q() ? -1333971 : -2722014);
                                    int dp3 = AndroidUtilities.dp(10.0f);
                                    if (z16) {
                                        i17 = 1090519039;
                                    } else if (!g6.I.q()) {
                                        i17 = 1088989954;
                                    }
                                    imageView.setBackground(g6.b0(dp3, i17));
                                    textView.setBackground(g6.b0(AndroidUtilities.dp(9.0f), stargiftattributebackdrop != null ? g6.v(stargiftattributebackdrop.center_color | (-16777216), g6.l1(0.55f, stargiftattributebackdrop.pattern_color | (-16777216))) : 0));
                                }
                            } else {
                                j13 = j15;
                            }
                            j12 = j13;
                            z15 = false;
                            if (starGift.auction) {
                            }
                            StringBuilder sb32 = new StringBuilder("XTR ");
                            sb32.append(LocaleController.formatNumber(j12, ','));
                            sb32.append(z15 ? str : "");
                            textView2.setText(ia.X0(false, sb32.toString(), 0.71f, null));
                            z16 = starGift instanceof TL_stars.TL_starGiftUnique;
                            int i172 = 518759725;
                            h0Var.setBackground(new d2(z16 ? 1090519039 : g6.I.q() ? 518759725 : 1088989954));
                            textView2.setTextColor(g6.I.q() ? -1333971 : -2722014);
                            imageView.setColorFilter(g6.I.q() ? -1333971 : -2722014);
                            int dp32 = AndroidUtilities.dp(10.0f);
                            if (z16) {
                            }
                            imageView.setBackground(g6.b0(dp32, i172));
                            textView.setBackground(g6.b0(AndroidUtilities.dp(9.0f), stargiftattributebackdrop != null ? g6.v(stargiftattributebackdrop.center_color | (-16777216), g6.l1(0.55f, stargiftattributebackdrop.pattern_color | (-16777216))) : 0));
                        }
                    }
                    str = "+";
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
                    sb322.append(LocaleController.formatNumber(j12, ','));
                    sb322.append(z15 ? str : "");
                    textView2.setText(ia.X0(false, sb322.toString(), 0.71f, null));
                    z16 = starGift instanceof TL_stars.TL_starGiftUnique;
                    int i1722 = 518759725;
                    h0Var.setBackground(new d2(z16 ? 1090519039 : g6.I.q() ? 518759725 : 1088989954));
                    textView2.setTextColor(g6.I.q() ? -1333971 : -2722014);
                    imageView.setColorFilter(g6.I.q() ? -1333971 : -2722014);
                    int dp322 = AndroidUtilities.dp(10.0f);
                    if (z16) {
                    }
                    imageView.setBackground(g6.b0(dp322, i1722));
                    textView.setBackground(g6.b0(AndroidUtilities.dp(9.0f), stargiftattributebackdrop != null ? g6.v(stargiftattributebackdrop.center_color | (-16777216), g6.l1(0.55f, stargiftattributebackdrop.pattern_color | (-16777216))) : 0));
                }
                bg.x2 x2Var = this.F;
                ((ViewGroup.MarginLayoutParams) x2Var.getLayoutParams()).topMargin = AndroidUtilities.dp(103.0f);
                ((FrameLayout.LayoutParams) x2Var.getLayoutParams()).gravity = 49;
                this.I.setVisibility(8);
                this.d0 = null;
                this.R = null;
                this.S = starGift;
                this.U = z10;
                this.V = null;
                this.W = z12;
                this.a0 = z13;
                this.b0 = false;
                this.c0 = z14;
                this.K = null;
                this.L = null;
                c(false, false);
                j();
            }
            colorFilter = null;
        }
        t9Var2.setColorFilter(colorFilter);
        t9Var2.setVisibility(8);
        if (z14) {
        }
        TextView textView22 = this.H;
        textView22.setVisibility(i15);
        textView22.setTextSize(1, 12.0f);
        cg.h0 h0Var2 = this.G;
        if (!z10) {
        }
        bg.x2 x2Var2 = this.F;
        ((ViewGroup.MarginLayoutParams) x2Var2.getLayoutParams()).topMargin = AndroidUtilities.dp(103.0f);
        ((FrameLayout.LayoutParams) x2Var2.getLayoutParams()).gravity = 49;
        this.I.setVisibility(8);
        this.d0 = null;
        this.R = null;
        this.S = starGift;
        this.U = z10;
        this.V = null;
        this.W = z12;
        this.a0 = z13;
        this.b0 = false;
        this.c0 = z14;
        this.K = null;
        this.L = null;
        c(false, false);
        j();
    }

    public TL_stars.StarGift getGift() {
        return this.S;
    }

    public long getGiftId() {
        TL_stars.StarGift starGift = this.S;
        if (starGift != null) {
            return starGift.id;
        }
        return 0L;
    }

    public cg.n getPremiumTier() {
        return this.R;
    }

    public TL_stars.SavedStarGift getSavedGift() {
        return this.V;
    }

    public final boolean h(TL_stars.SavedStarGift savedStarGift, boolean z10, boolean z11) {
        long j10;
        boolean z12;
        boolean z13;
        k8 k8Var = this.J;
        if (k8Var != null) {
            k8Var.run();
            this.J = null;
        }
        i(savedStarGift, savedStarGift.gift.getDocument());
        TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop = (TL_stars.starGiftAttributeBackdrop) s7.l(savedStarGift.gift.attributes, TL_stars.starGiftAttributeBackdrop.class);
        v1 v1Var = this.e;
        v1Var.d(stargiftattributebackdrop);
        v1Var.e((TL_stars.starGiftAttributePattern) s7.l(savedStarGift.gift.attributes, TL_stars.starGiftAttributePattern.class));
        v1Var.g(null);
        this.D.setVisibility(8);
        this.E.setVisibility(8);
        t9 t9Var = this.y;
        t9Var.setTranslationY(0.0f);
        cg.t1 t1Var = this.B;
        t1Var.D = true;
        t1Var.E = false;
        t1Var.invalidate();
        t1Var.setBlendWithColor(stargiftattributebackdrop != null ? Integer.valueOf(g6.l1(0.75f, stargiftattributebackdrop.center_color | (-16777216))) : null);
        cg.t1 t1Var2 = this.C;
        t1Var2.D = true;
        t1Var2.E = false;
        t1Var2.invalidate();
        t1Var2.setBlendWithColor(stargiftattributebackdrop != null ? Integer.valueOf(g6.l1(0.75f, stargiftattributebackdrop.center_color | (-16777216))) : null);
        int i10 = savedStarGift.gift.resale_ton_only ? 0 : 8;
        ImageView imageView = this.w;
        imageView.setVisibility(i10);
        FrameLayout frameLayout = this.v;
        if (stargiftattributebackdrop != null) {
            frameLayout.setBackground(g6.K(AndroidUtilities.dp(20.0f), g6.b(0.1f, -0.2f, stargiftattributebackdrop.center_color | (-16777216))));
        } else {
            frameLayout.setBackground(g6.K(AndroidUtilities.dp(20.0f), g6.v0(g6.Oh, this.b)));
        }
        FrameLayout.LayoutParams layoutParams = this.A;
        layoutParams.gravity = 17;
        t9Var.setLayoutParams(layoutParams);
        if (this.f0 == savedStarGift) {
            t1Var.setVisibility(0);
            t1Var.animate().alpha(savedStarGift.unsaved ? 1.0f : 0.0f).scaleX(savedStarGift.unsaved ? 1.0f : 0.4f).scaleY(savedStarGift.unsaved ? 1.0f : 0.4f).setDuration(350L).setInterpolator(jr.h).withEndAction(new ef.c(20, this, savedStarGift)).start();
        } else {
            t1Var.setAlpha(savedStarGift.unsaved ? 1.0f : 0.0f);
            t1Var.setScaleX(savedStarGift.unsaved ? 1.0f : 0.4f);
            t1Var.setScaleY(savedStarGift.unsaved ? 1.0f : 0.4f);
            t1Var.setVisibility(savedStarGift.unsaved ? 0 : 8);
        }
        boolean z14 = savedStarGift.gift instanceof TL_stars.TL_starGiftUnique;
        t9 t9Var2 = this.n;
        t9Var2.setColorFilter(null);
        t9Var2.setLayoutParams(this.r);
        int i11 = this.a;
        if (z14 && savedStarGift.name_hidden) {
            t9Var2.setVisibility(8);
            j10 = 0;
        } else if (savedStarGift.name_hidden) {
            t9Var2.setVisibility(0);
            jq a2 = da.a(44, "anonymous");
            j10 = 0;
            int dp = AndroidUtilities.dp(16.0f);
            int dp2 = AndroidUtilities.dp(16.0f);
            a2.e = dp;
            a2.f = dp2;
            t9Var2.setImageDrawable(a2);
        } else {
            j10 = 0;
            long peerDialogId = DialogObject.getPeerDialogId(savedStarGift.from_id);
            e9 e9Var = this.h;
            if (peerDialogId > 0) {
                TLRPC.User user = MessagesController.getInstance(i11).getUser(Long.valueOf(peerDialogId));
                if (user != null) {
                    t9Var2.setVisibility(0);
                    e9Var.r(user);
                    t9Var2.e(user, e9Var);
                } else {
                    t9Var2.setVisibility(8);
                }
            } else {
                TLRPC.Chat chat = MessagesController.getInstance(i11).getChat(Long.valueOf(-peerDialogId));
                if (chat != null) {
                    t9Var2.setVisibility(0);
                    e9Var.q(chat);
                    t9Var2.e(chat, e9Var);
                } else {
                    t9Var2.setVisibility(8);
                }
            }
        }
        cg.h0 h0Var = this.G;
        bg.x2 x2Var = this.F;
        TextView textView = this.H;
        if (stargiftattributebackdrop == null || savedStarGift.gift.resell_amount == null) {
            z12 = true;
            if (z10) {
                textView.setVisibility(8);
                this.A.topMargin = AndroidUtilities.dp(12.0f);
                this.A.bottomMargin = AndroidUtilities.dp(12.0f);
            } else {
                textView.setVisibility(0);
                FrameLayout.LayoutParams layoutParams2 = this.A;
                layoutParams2.topMargin = 0;
                layoutParams2.bottomMargin = 0;
            }
            if (z14) {
                textView.setPadding(AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f), 0);
                textView.setTextSize(1, 12.0f);
                textView.setText(LocaleController.getString(R.string.Gift2PriceUnique));
                z13 = z14;
            } else {
                textView.setPadding(AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(10.0f), 0);
                textView.setTextSize(1, 12.0f);
                StringBuilder sb2 = new StringBuilder("XTR ");
                TL_stars.StarGift starGift = savedStarGift.gift;
                long j11 = starGift.stars;
                z13 = z14;
                long j12 = savedStarGift.convert_stars;
                if (j12 <= j10) {
                    j12 = starGift.convert_stars;
                }
                textView.setText(ia.X0(false, j7.l1.m(Math.max(j11, j12), ',', sb2), 0.66f, null));
            }
            textView.setTextColor(z13 ? -1 : g6.I.q() ? -1333971 : -4229632);
            int i12 = 1088989954;
            h0Var.setBackground(new d2(z13 ? 1090519039 : g6.I.q() ? 518759725 : 1088989954));
            int dp3 = AndroidUtilities.dp(10.0f);
            if (z13) {
                i12 = 1090519039;
            } else if (g6.I.q()) {
                i12 = 518759725;
            }
            imageView.setBackground(g6.b0(dp3, i12));
            imageView.setColorFilter(z13 ? -1 : g6.I.q() ? -1333971 : -4229632);
            ((FrameLayout.LayoutParams) x2Var.getLayoutParams()).gravity = 49;
            ((ViewGroup.MarginLayoutParams) x2Var.getLayoutParams()).topMargin = AndroidUtilities.dp(103.0f);
        } else {
            textView.setVisibility(0);
            FrameLayout.LayoutParams layoutParams3 = this.A;
            layoutParams3.topMargin = 0;
            layoutParams3.bottomMargin = 0;
            textView.setPadding(AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(10.0f), 0);
            textView.setTextSize(1, 12.0f);
            iq[] iqVarArr = new iq[1];
            TL_stars.StarGift starGift2 = savedStarGift.gift;
            if (starGift2.resale_ton_only && DialogObject.getPeerDialogId(starGift2.owner_id) == UserConfig.getInstance(i11).getClientUserId()) {
                z12 = true;
                textView.setText(ia.U0(true, "XTR " + ((Object) ia.J0(savedStarGift.gift.getResellAmount(kf.b.b).o(), 1.0f, ',')), 0.95f, iqVarArr, 0.0f, 1.0f));
            } else {
                z12 = true;
                textView.setText(ia.R0("XTR " + LocaleController.formatNumber(savedStarGift.gift.getResellStars(), ','), 0.95f, iqVarArr));
            }
            iq iqVar = iqVarArr[0];
            if (iqVar != null) {
                iqVar.translate(0.0f, AndroidUtilities.dp(0.5f));
            }
            int v = g6.v(stargiftattributebackdrop.center_color | (-16777216), g6.l1(0.55f, stargiftattributebackdrop.pattern_color | (-16777216)));
            h0Var.setBackground(new d2(1895825407, v));
            textView.setTextColor(-1);
            imageView.setBackground(g6.b0(AndroidUtilities.dp(10.0f), v));
            imageView.setColorFilter(-1);
            ((FrameLayout.LayoutParams) x2Var.getLayoutParams()).gravity = 49;
            ((ViewGroup.MarginLayoutParams) x2Var.getLayoutParams()).topMargin = AndroidUtilities.dp(79.0f);
            z13 = z14;
        }
        this.I.setVisibility(8);
        this.f0 = savedStarGift;
        this.d0 = null;
        TL_stars.SavedStarGift savedStarGift2 = this.V;
        this.R = null;
        this.S = null;
        this.U = false;
        this.V = savedStarGift;
        this.W = false;
        this.a0 = false;
        this.b0 = z11;
        this.K = null;
        this.L = null;
        c(savedStarGift.pinned_to_top && (!z13 || savedStarGift.name_hidden), savedStarGift2 == savedStarGift);
        j();
        if (savedStarGift2 == savedStarGift) {
            return z12;
        }
        return false;
    }

    public final void i(TLObject tLObject, TLRPC.Document document) {
        t9 t9Var = this.y;
        if (document == null) {
            t9Var.b();
            this.e0 = null;
        } else {
            if (this.e0 == document) {
                return;
            }
            this.e0 = document;
            TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(document.thumbs, AndroidUtilities.dp(100.0f));
            t9Var.l(ImageLocation.getForDocument(document), "80_80_nolimit_pcache", ImageLocation.getForDocument(closestPhotoSizeWithSize, document), "80_80_nolimit_pcache", DocumentObject.getSvgThumb(document, g6.a7, 0.3f), tLObject);
        }
    }

    public final void j() {
        TL_stars.SavedStarGift savedStarGift = this.V;
        org.telegram.ui.ActionBar.c6 c6Var = this.b;
        z1 z1Var = this.f;
        if (savedStarGift != null) {
            TL_stars.StarGift starGift = savedStarGift.gift;
            if (!(starGift instanceof TL_stars.TL_starGiftUnique)) {
                if (!starGift.limited) {
                    z1Var.setBackdrop(null);
                    z1Var.setVisibility(8);
                    return;
                }
                z1Var.setVisibility(0);
                z1Var.setColor(g6.v0(g6.Li, c6Var));
                z1Var.setStrokeColor(0);
                z1Var.setBackdrop(null);
                z1Var.b(LocaleController.formatString(R.string.Gift2Limited1OfRibbon, AndroidUtilities.formatWholeNumber(this.V.gift.availability_total, 0)), true);
                return;
            }
            z1Var.setVisibility(0);
            if (this.V.gift.resell_amount == null) {
                z1Var.setColor(g6.v0(g6.Li, c6Var));
                z1Var.setStrokeColor(0);
                z1Var.setBackdrop((TL_stars.starGiftAttributeBackdrop) s7.l(this.V.gift.attributes, TL_stars.starGiftAttributeBackdrop.class));
                z1Var.b(j7.l1.m(this.V.gift.num, ',', new StringBuilder("#")), true);
                return;
            }
            int v = g6.v(g6.v0(g6.d6, c6Var), g6.l1(0.04f, g6.v0(g6.G6, c6Var)));
            z1Var.setColor(g6.v0(g6.uj, c6Var));
            z1Var.setStrokeColor(v);
            z1Var.setBackdrop(null);
            z1Var.b(LocaleController.getString(R.string.Gift2OnSale), false);
            return;
        }
        TL_stars.StarGift starGift2 = this.S;
        if (starGift2 == null) {
            cg.n nVar = this.R;
            if (nVar != null) {
                if (nVar.b() <= 0) {
                    z1Var.setVisibility(8);
                    z1Var.setBackdrop(null);
                    z1Var.setStrokeColor(0);
                    return;
                }
                z1Var.setVisibility(0);
                z1Var.setBackdrop(null);
                z1Var.a(-2535425, -8229377);
                z1Var.setStrokeColor(0);
                String formatString = LocaleController.formatString(R.string.GiftPremiumOptionDiscount, Integer.valueOf(this.R.b()));
                z1Var.b = formatString;
                z1Var.a.e(12, formatString, true);
                return;
            }
            return;
        }
        if (this.a0 || this.c0) {
            z1Var.setVisibility(0);
            z1Var.setColor(g6.v0(g6.Li, c6Var));
            z1Var.setBackdrop((TL_stars.starGiftAttributeBackdrop) s7.l(this.S.attributes, TL_stars.starGiftAttributeBackdrop.class));
            z1Var.setStrokeColor(0);
            z1Var.b(j7.l1.m(this.S.num, ',', new StringBuilder("#")), true);
            return;
        }
        if (this.W && starGift2.availability_resale > 0) {
            z1Var.setVisibility(0);
            z1Var.setColor(g6.v0(g6.uj, c6Var));
            z1Var.setStrokeColor(0);
            z1Var.setBackdrop(null);
            z1Var.b(LocaleController.getString(R.string.Gift2Resale), false);
            return;
        }
        if (this.U) {
            z1Var.setVisibility(0);
            z1Var.setColor(g6.v0(g6.Li, c6Var));
            z1Var.setStrokeColor(0);
            z1Var.setBackdrop((TL_stars.starGiftAttributeBackdrop) s7.l(this.S.attributes, TL_stars.starGiftAttributeBackdrop.class));
            z1Var.b(LocaleController.formatString(R.string.Gift2Limited1OfRibbon, AndroidUtilities.formatWholeNumber(this.S.availability_issued, 0)), true);
            return;
        }
        boolean z10 = starGift2.limited;
        if (z10 && starGift2.availability_remains <= 0) {
            z1Var.setVisibility(0);
            z1Var.setColor(g6.v0(g6.Mi, c6Var));
            z1Var.setStrokeColor(0);
            z1Var.setBackdrop(null);
            z1Var.b(LocaleController.getString(R.string.Gift2SoldOut), true);
            return;
        }
        if (starGift2.auction) {
            z1Var.setVisibility(0);
            z1Var.setBackdrop(null);
            z1Var.a(-2650077, -4227818);
            z1Var.setStrokeColor(0);
            if (this.S.auction_start_date > ConnectionsManager.getInstance(this.a).getCurrentTime()) {
                z1Var.b(LocaleController.getString(R.string.Gift2LimitedAuctionSoon), true);
                return;
            } else {
                z1Var.b(LocaleController.getString(R.string.Gift2LimitedAuction), true);
                return;
            }
        }
        if (starGift2.require_premium) {
            z1Var.setVisibility(0);
            z1Var.setBackdrop(null);
            z1Var.a(-2650077, -4227818);
            z1Var.setStrokeColor(0);
            z1Var.b(LocaleController.getString(R.string.Gift2LimitedPremium), true);
            return;
        }
        if (!z10) {
            z1Var.setBackdrop(null);
            z1Var.setStrokeColor(0);
            z1Var.setVisibility(8);
        } else {
            z1Var.setVisibility(0);
            z1Var.setColor(g6.v0(g6.Li, c6Var));
            z1Var.setStrokeColor(0);
            z1Var.setBackdrop(null);
            z1Var.b(LocaleController.getString(R.string.Gift2LimitedRibbon), true);
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
        z1 z1Var;
        bg.x2 x2Var;
        TL_stars.SavedStarGift savedStarGift;
        TL_stars.SavedStarGift savedStarGift2;
        hp hpVar;
        t9 t9Var;
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
            StringBuilder sb2 = new StringBuilder();
            String str = null;
            if (this.R == null) {
                TL_stars.SavedStarGift savedStarGift3 = this.V;
                if (savedStarGift3 != null && (starGift = savedStarGift3.gift) != null) {
                    if ((starGift instanceof TL_stars.TL_starGiftUnique) && !TextUtils.isEmpty(starGift.title)) {
                        charSequence = this.V.gift.title;
                        if (TextUtils.isEmpty(charSequence)) {
                        }
                        sb2.append(charSequence);
                        textView = this.E;
                        if (textView != null) {
                        }
                        z1Var = this.f;
                        if (z1Var != null) {
                        }
                        x2Var = this.F;
                        if (x2Var != null) {
                        }
                        savedStarGift = this.V;
                        if (savedStarGift != null) {
                        }
                        savedStarGift2 = this.V;
                        if (savedStarGift2 != null) {
                        }
                        hpVar = this.g0;
                        if (hpVar != null) {
                        }
                        accessibilityNodeInfo.setContentDescription(sb2.toString());
                    }
                    charSequence = null;
                    if (TextUtils.isEmpty(charSequence)) {
                    }
                    sb2.append(charSequence);
                    textView = this.E;
                    if (textView != null) {
                    }
                    z1Var = this.f;
                    if (z1Var != null) {
                    }
                    x2Var = this.F;
                    if (x2Var != null) {
                    }
                    savedStarGift = this.V;
                    if (savedStarGift != null) {
                    }
                    savedStarGift2 = this.V;
                    if (savedStarGift2 != null) {
                    }
                    hpVar = this.g0;
                    if (hpVar != null) {
                    }
                    accessibilityNodeInfo.setContentDescription(sb2.toString());
                }
                TL_stars.StarGift starGift2 = this.S;
                if (starGift2 != null && (starGift2 instanceof TL_stars.TL_starGiftUnique) && !TextUtils.isEmpty(starGift2.title)) {
                    charSequence = this.S.title;
                    if (TextUtils.isEmpty(charSequence)) {
                    }
                    sb2.append(charSequence);
                    textView = this.E;
                    if (textView != null) {
                    }
                    z1Var = this.f;
                    if (z1Var != null) {
                    }
                    x2Var = this.F;
                    if (x2Var != null) {
                    }
                    savedStarGift = this.V;
                    if (savedStarGift != null) {
                    }
                    savedStarGift2 = this.V;
                    if (savedStarGift2 != null) {
                    }
                    hpVar = this.g0;
                    if (hpVar != null) {
                    }
                    accessibilityNodeInfo.setContentDescription(sb2.toString());
                }
                charSequence = null;
                if (TextUtils.isEmpty(charSequence)) {
                }
                sb2.append(charSequence);
                textView = this.E;
                if (textView != null) {
                }
                z1Var = this.f;
                if (z1Var != null) {
                }
                x2Var = this.F;
                if (x2Var != null) {
                }
                savedStarGift = this.V;
                if (savedStarGift != null) {
                }
                savedStarGift2 = this.V;
                if (savedStarGift2 != null) {
                }
                hpVar = this.g0;
                if (hpVar != null) {
                }
                accessibilityNodeInfo.setContentDescription(sb2.toString());
            }
            TextView textView3 = this.D;
            if (textView3 != null && textView3.getVisibility() == 0 && !TextUtils.isEmpty(textView3.getText())) {
                charSequence = textView3.getText();
                if (TextUtils.isEmpty(charSequence)) {
                    charSequence = LocaleController.getString(R.string.Gift2Gift);
                }
                sb2.append(charSequence);
                textView = this.E;
                if (textView != null && textView.getVisibility() == 0 && !TextUtils.isEmpty(textView.getText())) {
                    sb2.append(", ");
                    sb2.append(textView.getText());
                }
                z1Var = this.f;
                if (z1Var != null && z1Var.getVisibility() == 0) {
                    text = z1Var.getText();
                    if (!TextUtils.isEmpty(text)) {
                        sb2.append(", ");
                        sb2.append(text);
                    }
                }
                x2Var = this.F;
                if (x2Var != null && x2Var.getVisibility() == 0 && (textView2 = this.H) != null && textView2.getVisibility() == 0 && !TextUtils.isEmpty(textView2.getText())) {
                    sb2.append(", ");
                    sb2.append(textView2.getText());
                }
                savedStarGift = this.V;
                if (savedStarGift != null && savedStarGift.unsaved) {
                    sb2.append(", ");
                    sb2.append(LocaleController.getString(R.string.Gift2FilterHidden));
                }
                savedStarGift2 = this.V;
                if (savedStarGift2 != null && !(savedStarGift2.gift instanceof TL_stars.TL_starGiftUnique) && !savedStarGift2.name_hidden && (t9Var = this.n) != null && t9Var.getVisibility() == 0) {
                    peerDialogId = DialogObject.getPeerDialogId(this.V.from_id);
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
                            sb2.append(", ");
                            sb2.append((CharSequence) str);
                        }
                    }
                }
                hpVar = this.g0;
                if (hpVar != null && hpVar.a.q) {
                    accessibilityNodeInfo.setCheckable(true);
                    accessibilityNodeInfo.setChecked(true);
                }
                accessibilityNodeInfo.setContentDescription(sb2.toString());
            }
            charSequence = null;
            if (TextUtils.isEmpty(charSequence)) {
            }
            sb2.append(charSequence);
            textView = this.E;
            if (textView != null) {
                sb2.append(", ");
                sb2.append(textView.getText());
            }
            z1Var = this.f;
            if (z1Var != null) {
                text = z1Var.getText();
                if (!TextUtils.isEmpty(text)) {
                }
            }
            x2Var = this.F;
            if (x2Var != null) {
                sb2.append(", ");
                sb2.append(textView2.getText());
            }
            savedStarGift = this.V;
            if (savedStarGift != null) {
                sb2.append(", ");
                sb2.append(LocaleController.getString(R.string.Gift2FilterHidden));
            }
            savedStarGift2 = this.V;
            if (savedStarGift2 != null) {
                peerDialogId = DialogObject.getPeerDialogId(this.V.from_id);
                if (peerDialogId != 0) {
                }
            }
            hpVar = this.g0;
            if (hpVar != null) {
                accessibilityNodeInfo.setCheckable(true);
                accessibilityNodeInfo.setChecked(true);
            }
            accessibilityNodeInfo.setContentDescription(sb2.toString());
        } catch (Exception unused) {
        }
    }

    public void setImageLayer(int i10) {
        this.y.setLayerNum(i10);
    }

    public void setImageSize(int i10) {
        FrameLayout.LayoutParams layoutParams = this.A;
        layoutParams.width = i10;
        layoutParams.height = i10;
    }

    public void setRibbonColor(int i10) {
        z1 z1Var = this.f;
        z1Var.setColor(i10);
        z1Var.invalidate();
    }

    public void setRibbonText(String str) {
        this.f.b(str, true);
    }

    public void setRibbonTextOneOf(int i10) {
        z1 z1Var = this.f;
        z1Var.setVisibility(0);
        z1Var.setColor(g6.v0(g6.Li, this.b));
        z1Var.setStrokeColor(0);
        z1Var.setBackdrop((TL_stars.starGiftAttributeBackdrop) s7.l(this.S.attributes, TL_stars.starGiftAttributeBackdrop.class));
        z1Var.b(LocaleController.formatString(R.string.Gift2Limited1OfRibbon, AndroidUtilities.formatWholeNumber(i10, 0)), true);
    }
}
