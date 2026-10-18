package org.telegram.ui.Wallet;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.CornerPathEffect;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.SweepGradient;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.hardware.Sensor;
import android.os.Handler;
import android.os.SystemClock;
import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.CharacterStyle;
import android.text.style.RelativeSizeSpan;
import android.view.View;
import java.util.ArrayList;
import java.util.Locale;
import java.util.Stack;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.Components.bs;
import org.telegram.ui.Components.d11;
import org.telegram.ui.Components.l11;
import org.telegram.ui.Components.m11;
import org.telegram.ui.Components.uj0;
import org.telegram.ui.Components.yc;
import org.telegram.ui.mg;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes4.dex */
public final class l3 {
    public float A;
    public TL_stars.starGiftAttributeBackdrop A0;
    public float B;
    public final Paint B0;
    public final Paint C0;
    public boolean D;
    public final org.telegram.ui.Components.f6 D0;
    public boolean E;
    public final g3 E0;
    public o1.k F;
    public ValueAnimator G;
    public boolean H;
    public final i3 I;
    public final org.telegram.ui.Components.f6 J;
    public final org.telegram.ui.Components.f6 K;
    public final Paint L;
    public boolean M;
    public long N;
    public final Paint O;
    public long P;
    public final org.telegram.ui.Components.f6 Q;
    public float R;
    public long S;
    public int T;
    public int U;
    public int V;
    public final Path W;
    public final Paint X;
    public final yc Y;
    public o1.k Z;
    public final org.telegram.ui.Cells.w0 a;
    public float a0;
    public final org.telegram.ui.ActionBar.d6 b;
    public o1.k b0;
    public float c0;
    public j3 d0;
    public boolean e;
    public long e0;
    public boolean f0;
    public boolean g0;
    public boolean h0;
    public final Drawable i;
    public boolean i0;
    public ValueAnimator j0;
    public final c6 k;
    public mg k0;
    public final uj0 l;
    public TLRPC.TL_messageActionGramTransfer l0;
    public k3 m;
    public boolean m0;
    public boolean n;
    public d11 n0;
    public boolean o;
    public d11 o0;
    public float p;
    public d11 p0;
    public float q;
    public d11 q0;
    public float r;
    public boolean r0;
    public float s;
    public org.telegram.ui.Cells.p0 s0;
    public float t;
    public final Matrix t0;
    public int u0;
    public long v;
    public final ki.y5 v0;
    public int w0;
    public long x0;
    public float y;
    public int y0;
    public float z;
    public TL_stars.starGiftAttributeBackdrop z0;
    public final ArrayList c = new ArrayList();
    public final Stack d = new Stack();
    public final RectF f = new RectF();
    public final RectF g = new RectF();
    public final Path h = new Path();
    public final Path j = new Path();
    public final q9 u = new q9();
    public final Rect w = new Rect();
    public int x = -1;
    public float C = 1.0f;

    public l3(org.telegram.ui.Cells.w0 w0Var, org.telegram.ui.ActionBar.d6 d6Var) {
        Paint paint = new Paint(1);
        this.L = paint;
        Paint paint2 = new Paint(1);
        this.O = paint2;
        Path path = new Path();
        this.W = path;
        Paint paint3 = new Paint(1);
        this.X = paint3;
        this.a0 = 1.0f;
        this.t0 = new Matrix();
        this.u0 = -10624001;
        this.v0 = new ki.y5(this, 3);
        this.w0 = -1;
        this.y0 = -1;
        this.B0 = new Paint(1);
        this.C0 = new Paint(1);
        this.E0 = new g3(this, 0);
        this.a = w0Var;
        this.b = d6Var;
        this.i = w0Var.getResources().getDrawable(R.drawable.wallet_action_card_gradient).mutate();
        Context context = w0Var.getContext();
        if (c6.G == null) {
            c6.G = new c6(context.getApplicationContext());
        }
        this.k = c6.G;
        uj0 uj0Var = new uj0(R.raw.wallet_diamond_white, AndroidUtilities.dp(42.0f), AndroidUtilities.dp(42.0f), false, null);
        this.l = uj0Var;
        uj0Var.R(w0Var);
        uj0Var.K(0);
        w0Var.addOnAttachStateChangeListener(new org.telegram.ui.Components.la(2, this, w0Var));
        paint2.setColor(-10033409);
        Paint.Style style = Paint.Style.STROKE;
        paint2.setStyle(style);
        paint2.setStrokeWidth(AndroidUtilities.dpf2(1.0f));
        int i10 = 7;
        n nVar = new n(w0Var, i10);
        bs bsVar = bs.h;
        this.Q = new org.telegram.ui.Components.f6(1.0f, nVar, 0L, 180L, bsVar);
        this.K = new org.telegram.ui.Components.f6(new n(w0Var, i10), 320L, bsVar, 0);
        this.J = new org.telegram.ui.Components.f6(new n(w0Var, i10), 320L, bsVar, 0);
        i3 i3Var = new i3(w0Var, w0Var);
        this.I = i3Var;
        i3Var.x = -1;
        yh.k1.d(path, 1.0f, false);
        paint3.setStyle(style);
        paint3.setStrokeWidth(AndroidUtilities.dpf2(4.0f));
        paint3.setPathEffect(new CornerPathEffect(AndroidUtilities.dp(2.33f)));
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        paint3.setShader(new LinearGradient(0.0f, 0.0f, AndroidUtilities.dp(48.0f), AndroidUtilities.dp(48.0f), new int[]{16777215, org.telegram.ui.ActionBar.h6.m1(0.35f, 16777215), 16777215}, new float[]{0.0f, 0.5f, 1.0f}, tileMode));
        paint.setShader(new LinearGradient(-AndroidUtilities.dp(10.0f), 0.0f, AndroidUtilities.dp(10.0f), 0.0f, new int[]{16777215, -2130706433, 16777215}, new float[]{0.0f, 0.5f, 1.0f}, tileMode));
        yc ycVar = new yc(w0Var);
        this.Y = ycVar;
        ycVar.f = new h3(this, 0);
        this.D0 = new org.telegram.ui.Components.f6(1.0f, new n(w0Var, i10), 0L, 400L, bsVar);
    }

    public static TL_stars.starGiftAttributeBackdrop h(TLRPC.UserFull userFull) {
        TL_wallet.card cardVar;
        TL_wallet.nftItem nftitem;
        TL_stars.StarGift starGift;
        ArrayList<TL_stars.StarGiftAttribute> arrayList;
        if (userFull != null && (cardVar = userFull.wallet_card) != null && (nftitem = cardVar.bg_nft_item) != null && (starGift = nftitem.gift) != null && (arrayList = starGift.attributes) != null) {
            int size = arrayList.size();
            int i10 = 0;
            while (i10 < size) {
                TL_stars.StarGiftAttribute starGiftAttribute = arrayList.get(i10);
                i10++;
                TL_stars.StarGiftAttribute starGiftAttribute2 = starGiftAttribute;
                if (starGiftAttribute2 instanceof TL_stars.starGiftAttributeBackdrop) {
                    return (TL_stars.starGiftAttributeBackdrop) starGiftAttribute2;
                }
            }
        }
        return null;
    }

    public static int j() {
        return AndroidUtilities.dp(206.0f);
    }

    public final void a(float f7) {
        if (this.F == null) {
            o1.k kVar = new o1.k(new o1.j(this.C));
            this.F = kVar;
            o1.l lVar = new o1.l(f7);
            lVar.a(0.55f);
            lVar.b(280.0f);
            kVar.u = lVar;
            this.F.e(0.001f);
            this.F.b(new f3(this, 0));
        }
        this.F.g(f7);
    }

    public final void b() {
        org.telegram.ui.Cells.w0 w0Var = this.a;
        if (w0Var.isShown()) {
            AndroidUtilities.vibrateCursor(w0Var);
        }
        o1.k kVar = this.Z;
        if (kVar != null) {
            kVar.c();
        }
        o1.k kVar2 = new o1.k(new o1.j(this.a0));
        this.Z = kVar2;
        o1.l lVar = new o1.l(1.0f);
        lVar.a(0.55f);
        lVar.b(280.0f);
        kVar2.u = lVar;
        this.Z.e(0.001f);
        o1.k kVar3 = this.Z;
        kVar3.a = -3.0f;
        kVar3.b(new f3(this, 2));
        this.Z.h();
    }

    public final void c(Canvas canvas, float f7, float f10) {
        canvas.translate(0.0f, AndroidUtilities.dp(4.0f) * this.c0);
        yc ycVar = this.Y;
        canvas.scale(com.google.android.gms.internal.play_billing.k3.A(this.c0, 0.012f, 1.0f, ycVar.a(0.025f) * this.a0), com.google.android.gms.internal.play_billing.k3.B(this.c0, 0.04f, 1.0f, ycVar.a(0.025f) * this.a0), (AndroidUtilities.dp(206.0f) / 2.0f) + f7, f10 + AndroidUtilities.dp(70.0f));
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x044e  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x045f  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0474  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0486  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x04d4  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0534  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x0523  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x0512  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x0489  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x05f2  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x0600  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x068a  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x05f4  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x03db  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x02c1  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x01b6  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0178  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0194  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x01ad  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x023a  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x025b  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x02ba  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x02d3  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x02de  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0329  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x03e3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void d(Canvas canvas) {
        float f7;
        float f10;
        float d;
        boolean z10;
        float f11;
        Canvas canvas2;
        q9 q9Var;
        boolean z11;
        boolean z12;
        d11 d11Var;
        Canvas canvas3;
        j3 j3Var;
        float d10;
        float d11;
        d11 d11Var2;
        float d12;
        long j10;
        float f12;
        k3 k3Var;
        canvas.save();
        yc ycVar = this.Y;
        float A = com.google.android.gms.internal.play_billing.k3.A(this.c0, 0.012f, 1.0f, ycVar.a(0.025f) * this.a0);
        float B = com.google.android.gms.internal.play_billing.k3.B(this.c0, 0.04f, 1.0f, ycVar.a(0.025f) * this.a0);
        float dp = AndroidUtilities.dp(4.0f) * this.c0;
        c(canvas, 0.0f, 0.0f);
        float dp2 = AndroidUtilities.dp(4.0f);
        RectF rectF = this.f;
        rectF.set(dp2, dp2, AndroidUtilities.dp(206.0f) - dp2, AndroidUtilities.dp(140.0f) - dp2);
        Canvas.EdgeType edgeType = Canvas.EdgeType.AA;
        boolean quickReject = canvas.quickReject(rectF, edgeType);
        org.telegram.ui.Cells.w0 w0Var = this.a;
        c6 c6Var = this.k;
        if (quickReject) {
            f7 = 4.0f;
        } else {
            Handler handler = c6Var.d;
            f7 = 4.0f;
            Sensor sensor = c6Var.b;
            if (sensor != null && w0Var.isAttachedToWindow() && w0Var.isShown() && w0Var.getWindowVisibility() == 0) {
                f10 = 206.0f;
                c6Var.e.put(w0Var, Long.valueOf(SystemClock.uptimeMillis()));
                if (!c6Var.r) {
                    c6Var.s = false;
                    boolean registerListener = c6Var.a.registerListener(c6Var, sensor, 1, handler);
                    c6Var.r = registerListener;
                    if (registerListener) {
                        handler.postDelayed(c6Var.F, 250L);
                    }
                }
                Path path = this.j;
                path.rewind();
                float dp3 = AndroidUtilities.dp(16.0f);
                float dp4 = AndroidUtilities.dp(16.0f);
                Path.Direction direction = Path.Direction.CW;
                path.addRoundRect(rectF, dp3, dp4, direction);
                canvas.save();
                canvas.clipPath(path);
                canvas.translate((AndroidUtilities.dp(10.0f) * c6Var.y) + rectF.centerX(), (AndroidUtilities.dp(8.0f) * c6Var.E) + rectF.centerY());
                t();
                canvas.rotate((c6Var.E * 6.0f) + (c6Var.y * 14.0f) + this.R);
                float hypot = (((float) Math.hypot(rectF.width(), rectF.height())) / 2.0f) + AndroidUtilities.dp(16.0f);
                Drawable drawable = this.i;
                int max = Math.max(1, drawable.getIntrinsicWidth());
                int max2 = Math.max(1, drawable.getIntrinsicHeight());
                float min = hypot / Math.min(max, max2);
                int ceil = (int) Math.ceil(max * min);
                int ceil2 = (int) Math.ceil(max2 * min);
                d = this.D0.d(1.0f, false);
                z10 = this.A0 == null && d < 1.0f;
                if (this.z0 != null || (d < 1.0f && !z10)) {
                    f11 = 2.0f;
                    drawable.setBounds(-ceil, -ceil2, ceil, ceil2);
                    canvas2 = canvas;
                    drawable.draw(canvas2);
                } else {
                    canvas2 = canvas;
                    f11 = 2.0f;
                }
                if (z10) {
                    int round = this.z0 == null ? Math.round((1.0f - d) * 255.0f) : 255;
                    Paint paint = this.C0;
                    paint.setAlpha(round);
                    e(hypot, canvas2, paint);
                }
                if (this.z0 != null) {
                    int round2 = Math.round(d * 255.0f);
                    Paint paint2 = this.B0;
                    paint2.setAlpha(round2);
                    e(hypot, canvas2, paint2);
                }
                if (d < 1.0f) {
                    TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop = this.z0;
                    if (stargiftattributebackdrop != null) {
                        r2 = stargiftattributebackdrop.text_color | (-16777216);
                    }
                } else {
                    TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop2 = this.A0;
                    int i10 = stargiftattributebackdrop2 == null ? -10624001 : stargiftattributebackdrop2.text_color | (-16777216);
                    TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop3 = this.z0;
                    r2 = i0.a.f(d, i10, stargiftattributebackdrop3 != null ? stargiftattributebackdrop3.text_color | (-16777216) : -10624001);
                }
                this.u0 = r2;
                canvas2.restore();
                int dp5 = AndroidUtilities.dp(42.0f);
                float f13 = dp5 / f11;
                int round3 = Math.round(rectF.centerX() - f13);
                float max3 = Math.max(0.0f, Math.min(1.0f, (this.C - 1.0f) / f11));
                float dp6 = rectF.top + AndroidUtilities.dp(8.0f);
                int round4 = Math.round((((rectF.centerY() - f13) - dp6) * max3) + dp6);
                int i11 = round3 + dp5;
                int i12 = dp5 + round4;
                uj0 uj0Var = this.l;
                uj0Var.setBounds(round3, round4, i11, i12);
                Canvas canvas4 = canvas2;
                boolean quickReject2 = canvas4.quickReject(round3, round4, i11, i12, edgeType);
                Rect bounds = uj0Var.getBounds();
                Rect rect = this.w;
                rect.set(bounds);
                q9Var = this.u;
                if (q9Var.d()) {
                    canvas4.save();
                    canvas4.clipPath(path);
                    canvas4.translate(rect.exactCenterX(), rect.exactCenterY());
                    q9Var.c(canvas4);
                    canvas4.restore();
                    w0Var.postInvalidateOnAnimation();
                }
                s();
                if (this.m != null) {
                    float exactCenterX = ((rect.exactCenterX() - (AndroidUtilities.dp(f10) / f11)) * A) + (AndroidUtilities.dp(f10) / f11);
                    float y3 = com.google.android.gms.internal.play_billing.k3.y(rect.exactCenterY(), AndroidUtilities.dp(70.0f), B, dp + AndroidUtilities.dp(70.0f));
                    this.m.setTranslationX((this.p + exactCenterX) - f13);
                    this.m.setTranslationY((this.q + y3) - f13);
                    this.m.setScaleX(this.C * A);
                    this.m.setScaleY(B * this.C);
                }
                z11 = quickReject2 && (k3Var = this.m) != null && k3Var.n;
                if (!z11) {
                    uj0Var.stop();
                    this.H = false;
                } else if (!this.H && !quickReject2) {
                    z12 = true;
                    this.H = true;
                    uj0Var.T(0.0f, true);
                    uj0Var.start();
                    if (!z11 && !this.E) {
                        uj0Var.draw(canvas4);
                    }
                    d11Var = this.n0;
                    if (d11Var != null) {
                        float l4 = d11Var.l();
                        float width = rectF.width() - AndroidUtilities.dp(16.0f);
                        float f14 = l4 > width ? width / l4 : 1.0f;
                        float dp7 = rectF.top + AndroidUtilities.dp(55.0f) + (this.n0.j() / f11);
                        canvas4.save();
                        canvas4.scale(f14, f14, rectF.centerX(), dp7);
                        this.n0.c(rectF.centerX() - (l4 / f11), dp7, 1.0f, -1, canvas4);
                        canvas.restore();
                    }
                    if (this.o0 != null) {
                        float dp8 = (AndroidUtilities.dp(f10) - this.o0.l()) / f11;
                        float dp9 = (rectF.bottom - AndroidUtilities.dp(7.0f)) - this.o0.j();
                        d11 d11Var3 = this.p0;
                        if (d11Var3 != null) {
                            d11Var3.c((AndroidUtilities.dp(f10) - this.p0.l()) / f11, (dp9 - AndroidUtilities.dp(f7)) - (this.p0.j() / f11), 1.0f, this.u0, canvas);
                        }
                        this.o0.c(dp8, dp9 + AndroidUtilities.dp(1.0f), 1.0f, 268435455, canvas);
                        if (d >= 1.0f) {
                            TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop4 = this.z0;
                            if (stargiftattributebackdrop4 != null) {
                                r3 = i0.a.f(0.2f, stargiftattributebackdrop4.pattern_color | (-16777216), stargiftattributebackdrop4.edge_color | (-16777216));
                            }
                        } else {
                            TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop5 = this.A0;
                            int f15 = stargiftattributebackdrop5 == null ? -16693808 : i0.a.f(0.2f, stargiftattributebackdrop5.pattern_color | (-16777216), stargiftattributebackdrop5.edge_color | (-16777216));
                            TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop6 = this.z0;
                            r3 = i0.a.f(d, f15, stargiftattributebackdrop6 != null ? i0.a.f(0.2f, stargiftattributebackdrop6.pattern_color | (-16777216), stargiftattributebackdrop6.edge_color | (-16777216)) : -16693808);
                        }
                        canvas3 = canvas;
                        this.o0.c(dp8, dp9, 1.0f, r3, canvas3);
                    } else {
                        canvas3 = canvas;
                    }
                    j3Var = this.d0;
                    if (j3Var != null && !j3Var.c()) {
                        if (this.e0 != 0 && !this.h0 && !this.f0 && SystemClock.elapsedRealtime() - this.e0 >= 600) {
                            this.d0.a();
                            this.f0 = z12;
                        }
                        float strokeWidth = this.d0.x.getStrokeWidth() / f11;
                        RectF rectF2 = this.g;
                        rectF2.set(rectF);
                        rectF2.inset(strokeWidth, strokeWidth);
                        float max4 = Math.max(0.0f, AndroidUtilities.dp(16.0f) - strokeWidth);
                        Path path2 = this.h;
                        path2.rewind();
                        path2.addRoundRect(rectF2, max4, max4, direction);
                        this.d0.e(rectF);
                        this.d0.draw(canvas3);
                        if (this.e0 != 0 && this.d0.c()) {
                            this.e0 = 0L;
                        }
                    }
                    ValueAnimator valueAnimator = this.j0;
                    boolean z13 = (valueAnimator != null || valueAnimator.getCurrentPlayTime() >= 1000) ? false : z12;
                    float f16 = (!this.h0 || this.i0 || z13) ? 0.0f : 1.0f;
                    org.telegram.ui.Components.f6 f6Var = this.K;
                    d10 = f6Var.d(f16, false);
                    if (!this.h0 && !this.i0 && !z13) {
                        d12 = this.J.d(1.0f, false);
                        int f17 = d12 < 1.0f ? this.U : i0.a.f(d12, this.T, this.U);
                        this.V = f17;
                        i3 i3Var = this.I;
                        Paint paint3 = (Paint) i3Var.b;
                        paint3.setShader(null);
                        paint3.setColor(f17);
                        i3Var.setBounds(((int) rectF.right) - AndroidUtilities.dp(46.0f), ((int) rectF.top) - AndroidUtilities.dp(f11), AndroidUtilities.dp(f11) + ((int) rectF.right), AndroidUtilities.dp(46.0f) + ((int) rectF.top));
                        canvas3.save();
                        if (d10 >= 1.0f) {
                            float exactCenterX2 = i3Var.getBounds().exactCenterX();
                            f12 = 48.0f;
                            float exactCenterY = i3Var.getBounds().exactCenterY();
                            j10 = 0;
                            float dp10 = AndroidUtilities.dp(48.0f) * ((float) Math.sqrt(0.5d)) * d10;
                            canvas3.rotate(45.0f, exactCenterX2, exactCenterY);
                            canvas3.clipRect(exactCenterX2 - dp10, exactCenterY - AndroidUtilities.dp(48.0f), dp10 + exactCenterX2, AndroidUtilities.dp(48.0f) + exactCenterY);
                            canvas3.rotate(-45.0f, exactCenterX2, exactCenterY);
                        } else {
                            j10 = 0;
                            f12 = 48.0f;
                        }
                        i3Var.draw(canvas3);
                        if (this.U != -15352320) {
                            d12 = this.T == -15352320 ? 1.0f - d12 : 0.0f;
                        }
                        Path path3 = this.W;
                        if (d12 > 0.0f) {
                            Rect bounds2 = i3Var.getBounds();
                            canvas3.save();
                            canvas3.translate(bounds2.right - AndroidUtilities.dp(f12), bounds2.top);
                            canvas3.clipPath(path3);
                            Paint paint4 = this.X;
                            paint4.setAlpha((int) (d12 * 255.0f));
                            canvas3.drawPath(path3, paint4);
                            canvas3.restore();
                        }
                        if (d10 >= 1.0f || f6Var.i) {
                            this.M = true;
                            this.N = 0L;
                        } else {
                            long elapsedRealtime = SystemClock.elapsedRealtime();
                            if (this.M) {
                                this.M = false;
                                this.N = elapsedRealtime + 500;
                                w0Var.postInvalidateDelayed(500L);
                            }
                            long j11 = this.N;
                            if (j11 != j10 && elapsedRealtime >= j11) {
                                float f18 = (elapsedRealtime - j11) / 600.0f;
                                if (f18 >= 1.0f) {
                                    this.N = j10;
                                } else {
                                    Rect bounds3 = i3Var.getBounds();
                                    canvas3.save();
                                    canvas3.translate(bounds3.right - AndroidUtilities.dp(f12), bounds3.top);
                                    canvas3.clipPath(path3);
                                    canvas3.rotate(45.0f);
                                    float dp11 = AndroidUtilities.dp(10.0f);
                                    float f19 = -dp11;
                                    canvas3.translate((((dp11 * f11) + (AndroidUtilities.dp(f12) * ((float) Math.sqrt(2.0d)))) * f18) + f19, 0.0f);
                                    canvas.drawRect(f19, -AndroidUtilities.dp(f12), dp11, AndroidUtilities.dp(f12), this.L);
                                    canvas3 = canvas;
                                    canvas3.restore();
                                    w0Var.postInvalidateOnAnimation();
                                }
                            }
                        }
                        canvas3.restore();
                    }
                    d11 = this.Q.d(this.E ? 0.0f : 1.0f, false);
                    if (this.g0 && !this.E && d10 < 1.0f && d11 > 0.0f) {
                        int round5 = Math.round((1.0f - d10) * d11 * 255.0f);
                        Paint paint5 = this.O;
                        paint5.setAlpha(round5);
                        float dpf2 = rectF.right - AndroidUtilities.dpf2(15.5f);
                        float dpf22 = AndroidUtilities.dpf2(15.5f) + rectF.top;
                        canvas3.drawCircle(dpf2, dpf22, AndroidUtilities.dpf2(5.0f), paint5);
                        long elapsedRealtime2 = SystemClock.elapsedRealtime() - this.P;
                        float f20 = ((elapsedRealtime2 % 2000) / 2000.0f) * 360.0f;
                        canvas3.save();
                        canvas3.rotate(f20, dpf2, dpf22);
                        Canvas canvas5 = canvas3;
                        canvas5.drawLine(dpf2, dpf22, dpf2, dpf22 - AndroidUtilities.dpf2(f7), paint5);
                        canvas5.rotate((360.0f * ((elapsedRealtime2 % 24000) / 24000.0f)) - f20, dpf2, dpf22);
                        canvas5.drawLine(dpf2, dpf22, AndroidUtilities.dpf2(2.5f) + dpf2, dpf22, paint5);
                        canvas3 = canvas5;
                        canvas3.restore();
                        w0Var.postInvalidateOnAnimation();
                    }
                    d11Var2 = this.q0;
                    if (d11Var2 != null) {
                        TLRPC.TL_messageActionGramTransfer tL_messageActionGramTransfer = this.l0;
                        if ((tL_messageActionGramTransfer.comment_encrypted || tL_messageActionGramTransfer.comment_encrypted_preparing) && !this.m0) {
                            canvas3.save();
                            canvas3.translate((AndroidUtilities.dp(f10) - this.q0.l()) / f11, AndroidUtilities.dp(143.0f));
                            ArrayList arrayList = this.c;
                            int size = arrayList.size();
                            int i13 = 0;
                            while (i13 < size) {
                                Object obj = arrayList.get(i13);
                                i13++;
                                wh.g gVar = (wh.g) obj;
                                gVar.h(-1);
                                gVar.draw(canvas3);
                            }
                            canvas3.restore();
                        } else {
                            d11Var2.c((AndroidUtilities.dp(f10) - this.q0.l()) / f11, AndroidUtilities.dp(143.0f), 1.0f, -1, canvas3);
                        }
                    }
                    canvas.restore();
                }
                z12 = true;
                if (!z11) {
                    uj0Var.draw(canvas4);
                }
                d11Var = this.n0;
                if (d11Var != null) {
                }
                if (this.o0 != null) {
                }
                j3Var = this.d0;
                if (j3Var != null) {
                    if (this.e0 != 0) {
                        this.d0.a();
                        this.f0 = z12;
                    }
                    float strokeWidth2 = this.d0.x.getStrokeWidth() / f11;
                    RectF rectF22 = this.g;
                    rectF22.set(rectF);
                    rectF22.inset(strokeWidth2, strokeWidth2);
                    float max42 = Math.max(0.0f, AndroidUtilities.dp(16.0f) - strokeWidth2);
                    Path path22 = this.h;
                    path22.rewind();
                    path22.addRoundRect(rectF22, max42, max42, direction);
                    this.d0.e(rectF);
                    this.d0.draw(canvas3);
                    if (this.e0 != 0) {
                        this.e0 = 0L;
                    }
                }
                ValueAnimator valueAnimator2 = this.j0;
                if (valueAnimator2 != null) {
                }
                if (this.h0) {
                }
                org.telegram.ui.Components.f6 f6Var2 = this.K;
                d10 = f6Var2.d(f16, false);
                if (!this.h0) {
                    d12 = this.J.d(1.0f, false);
                    if (d12 < 1.0f) {
                    }
                    this.V = f17;
                    i3 i3Var2 = this.I;
                    Paint paint32 = (Paint) i3Var2.b;
                    paint32.setShader(null);
                    paint32.setColor(f17);
                    i3Var2.setBounds(((int) rectF.right) - AndroidUtilities.dp(46.0f), ((int) rectF.top) - AndroidUtilities.dp(f11), AndroidUtilities.dp(f11) + ((int) rectF.right), AndroidUtilities.dp(46.0f) + ((int) rectF.top));
                    canvas3.save();
                    if (d10 >= 1.0f) {
                    }
                    i3Var2.draw(canvas3);
                    if (this.U != -15352320) {
                    }
                    Path path32 = this.W;
                    if (d12 > 0.0f) {
                    }
                    if (d10 >= 1.0f) {
                    }
                    this.M = true;
                    this.N = 0L;
                    canvas3.restore();
                }
                d11 = this.Q.d(this.E ? 0.0f : 1.0f, false);
                if (this.g0) {
                    int round52 = Math.round((1.0f - d10) * d11 * 255.0f);
                    Paint paint52 = this.O;
                    paint52.setAlpha(round52);
                    float dpf23 = rectF.right - AndroidUtilities.dpf2(15.5f);
                    float dpf222 = AndroidUtilities.dpf2(15.5f) + rectF.top;
                    canvas3.drawCircle(dpf23, dpf222, AndroidUtilities.dpf2(5.0f), paint52);
                    long elapsedRealtime22 = SystemClock.elapsedRealtime() - this.P;
                    float f202 = ((elapsedRealtime22 % 2000) / 2000.0f) * 360.0f;
                    canvas3.save();
                    canvas3.rotate(f202, dpf23, dpf222);
                    Canvas canvas52 = canvas3;
                    canvas52.drawLine(dpf23, dpf222, dpf23, dpf222 - AndroidUtilities.dpf2(f7), paint52);
                    canvas52.rotate((360.0f * ((elapsedRealtime22 % 24000) / 24000.0f)) - f202, dpf23, dpf222);
                    canvas52.drawLine(dpf23, dpf222, AndroidUtilities.dpf2(2.5f) + dpf23, dpf222, paint52);
                    canvas3 = canvas52;
                    canvas3.restore();
                    w0Var.postInvalidateOnAnimation();
                }
                d11Var2 = this.q0;
                if (d11Var2 != null) {
                }
                canvas.restore();
            }
        }
        f10 = 206.0f;
        Path path4 = this.j;
        path4.rewind();
        float dp32 = AndroidUtilities.dp(16.0f);
        float dp42 = AndroidUtilities.dp(16.0f);
        Path.Direction direction2 = Path.Direction.CW;
        path4.addRoundRect(rectF, dp32, dp42, direction2);
        canvas.save();
        canvas.clipPath(path4);
        canvas.translate((AndroidUtilities.dp(10.0f) * c6Var.y) + rectF.centerX(), (AndroidUtilities.dp(8.0f) * c6Var.E) + rectF.centerY());
        t();
        canvas.rotate((c6Var.E * 6.0f) + (c6Var.y * 14.0f) + this.R);
        float hypot2 = (((float) Math.hypot(rectF.width(), rectF.height())) / 2.0f) + AndroidUtilities.dp(16.0f);
        Drawable drawable2 = this.i;
        int max5 = Math.max(1, drawable2.getIntrinsicWidth());
        int max22 = Math.max(1, drawable2.getIntrinsicHeight());
        float min2 = hypot2 / Math.min(max5, max22);
        int ceil3 = (int) Math.ceil(max5 * min2);
        int ceil22 = (int) Math.ceil(max22 * min2);
        d = this.D0.d(1.0f, false);
        if (this.A0 == null) {
        }
        if (this.z0 != null) {
        }
        f11 = 2.0f;
        drawable2.setBounds(-ceil3, -ceil22, ceil3, ceil22);
        canvas2 = canvas;
        drawable2.draw(canvas2);
        if (z10) {
        }
        if (this.z0 != null) {
        }
        if (d < 1.0f) {
        }
        this.u0 = r2;
        canvas2.restore();
        int dp52 = AndroidUtilities.dp(42.0f);
        float f132 = dp52 / f11;
        int round32 = Math.round(rectF.centerX() - f132);
        float max32 = Math.max(0.0f, Math.min(1.0f, (this.C - 1.0f) / f11));
        float dp62 = rectF.top + AndroidUtilities.dp(8.0f);
        int round42 = Math.round((((rectF.centerY() - f132) - dp62) * max32) + dp62);
        int i112 = round32 + dp52;
        int i122 = dp52 + round42;
        uj0 uj0Var2 = this.l;
        uj0Var2.setBounds(round32, round42, i112, i122);
        Canvas canvas42 = canvas2;
        boolean quickReject22 = canvas42.quickReject(round32, round42, i112, i122, edgeType);
        Rect bounds4 = uj0Var2.getBounds();
        Rect rect2 = this.w;
        rect2.set(bounds4);
        q9Var = this.u;
        if (q9Var.d()) {
        }
        s();
        if (this.m != null) {
        }
        if (quickReject22) {
        }
        if (!z11) {
        }
        z12 = true;
        if (!z11) {
        }
        d11Var = this.n0;
        if (d11Var != null) {
        }
        if (this.o0 != null) {
        }
        j3Var = this.d0;
        if (j3Var != null) {
        }
        ValueAnimator valueAnimator22 = this.j0;
        if (valueAnimator22 != null) {
        }
        if (this.h0) {
        }
        org.telegram.ui.Components.f6 f6Var22 = this.K;
        d10 = f6Var22.d(f16, false);
        if (!this.h0) {
        }
        d11 = this.Q.d(this.E ? 0.0f : 1.0f, false);
        if (this.g0) {
        }
        d11Var2 = this.q0;
        if (d11Var2 != null) {
        }
        canvas.restore();
    }

    public final void e(float f7, Canvas canvas, Paint paint) {
        Shader shader = paint.getShader();
        if (shader instanceof BitmapShader) {
            Matrix matrix = this.t0;
            matrix.setTranslate(-48.0f, -48.0f);
            float f10 = (2.0f * f7) / 96.0f;
            matrix.postScale(f10, f10);
            shader.setLocalMatrix(matrix);
        }
        float f11 = -f7;
        canvas.drawRect(f11, f11, f7, f7, paint);
    }

    public final void f() {
        if (this.d0 != null) {
            return;
        }
        j3 j3Var = new j3(this, this.b);
        this.d0 = j3Var;
        j3Var.g(4969977, org.telegram.ui.ActionBar.h6.m1(0.125f, -11807239), 4969977, org.telegram.ui.ActionBar.h6.m1(0.75f, -11807239));
        this.d0.x.setStrokeWidth(AndroidUtilities.dpf2(2.0f));
        j3 j3Var2 = this.d0;
        j3Var2.t = 2.0f;
        j3Var2.y = this.h;
        j3Var2.D = true;
    }

    public final void g() {
        ValueAnimator valueAnimator = this.j0;
        if (valueAnimator == null) {
            return;
        }
        this.j0 = null;
        valueAnimator.removeAllListeners();
        valueAnimator.cancel();
        org.telegram.ui.Components.f6 f6Var = this.K;
        if (f6Var.i) {
            this.M = false;
            this.N = 0L;
        }
        f6Var.d(1.0f, true);
        this.t = 0.0f;
        this.u.a.clear();
        mg mgVar = this.k0;
        this.k0 = null;
        this.a.invalidate();
        if (mgVar != null) {
            AndroidUtilities.runOnUIThread(mgVar, 1L);
        }
    }

    public final float i() {
        long uptimeMillis = SystemClock.uptimeMillis();
        if (this.v != 0) {
            float min = Math.min(0.1f, (uptimeMillis - r2) / 1000.0f);
            float f7 = this.h0 ? 1.7883515f : 0.0f;
            float f10 = -min;
            float exp = (float) Math.exp(f10 / 0.2f);
            float f11 = (min * f7) + this.r;
            float f12 = this.s;
            this.r = (((1.0f - exp) * ((f12 - f7) * 0.2f)) + f11) % 6.2831855f;
            this.s = com.google.android.gms.internal.play_billing.k3.y(f12, f7, exp, f7);
            float exp2 = (float) Math.exp(f10 / 0.75f);
            float f13 = this.r;
            float f14 = this.t;
            this.r = (((1.0f - exp2) * (0.75f * f14)) + f13) % 6.2831855f;
            float f15 = f14 * exp2;
            this.t = f15;
            if (f15 < 0.001f) {
                this.t = 0.0f;
            }
        }
        this.v = uptimeMillis;
        return (this.k.y * 0.14f) + ((float) (((uptimeMillis / 1000.0d) * 0.5961171984672546d) % 6.283185307179586d)) + this.r;
    }

    public final void k(boolean z10) {
        if (z10) {
            this.Q.d(0.0f, true);
        } else if (this.E && this.h0) {
            this.P = SystemClock.elapsedRealtime();
        }
        this.E = z10;
        k3 k3Var = this.m;
        if (k3Var != null) {
            k3Var.setAlpha(z10 ? 0.0f : 1.0f);
        }
        this.a.invalidate();
    }

    public final void l() {
        this.x = -1;
        org.telegram.ui.Cells.w0 w0Var = this.a;
        if (w0Var.getParent() != null) {
            w0Var.getParent().requestDisallowInterceptTouchEvent(false);
        }
        float IEEEremainder = (float) Math.IEEEremainder(this.A - i(), 6.283185307179586d);
        float IEEEremainder2 = (float) Math.IEEEremainder(this.B - (this.k.E * 0.14f), 6.283185307179586d);
        this.D = true;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.G = ofFloat;
        ofFloat.setDuration(350L);
        this.G.setInterpolator(bs.h);
        this.G.addUpdateListener(new ei.ja(this, IEEEremainder, IEEEremainder2, 5));
        this.G.start();
        a(1.0f);
    }

    public final void m() {
        k(false);
        this.Q.d(1.0f, true);
        if (this.x != -1) {
            org.telegram.ui.Cells.w0 w0Var = this.a;
            if (w0Var.getParent() != null) {
                w0Var.getParent().requestDisallowInterceptTouchEvent(false);
            }
        }
        this.x = -1;
        ValueAnimator valueAnimator = this.G;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.G = null;
        }
        o1.k kVar = this.F;
        if (kVar != null) {
            kVar.c();
            this.F = null;
        }
        this.D = false;
        this.C = 1.0f;
        this.B = 0.0f;
        this.v = 0L;
        this.t = 0.0f;
        this.s = 0.0f;
        this.r = 0.0f;
        this.u.a.clear();
        k3 k3Var = this.m;
        if (k3Var != null) {
            k3Var.setScaleX(1.0f);
            this.m.setScaleY(1.0f);
        }
    }

    public final void n() {
        o1.k kVar = this.b0;
        if (kVar != null) {
            kVar.c();
            this.b0 = null;
        }
        this.c0 = 0.0f;
        org.telegram.ui.Cells.w0 w0Var = this.a;
        w0Var.invalidate();
        if (w0Var.getParent() instanceof View) {
            ((View) w0Var.getParent()).invalidate();
        }
    }

    public final void o(boolean z10, TLRPC.TL_messageActionGramTransfer tL_messageActionGramTransfer, String str, int i10, boolean z11, boolean z12) {
        org.telegram.ui.Cells.w0 w0Var = this.a;
        if (z11) {
            g();
            this.M = false;
            this.N = 0L;
            this.h0 = false;
            m();
            o1.k kVar = this.Z;
            if (kVar != null) {
                kVar.c();
                this.Z = null;
            }
            this.a0 = 1.0f;
            w0Var.invalidate();
            if (w0Var.getParent() instanceof View) {
                ((View) w0Var.getParent()).invalidate();
            }
            n();
            this.R = 0.0f;
            this.S = 0L;
            this.l.stop();
            this.H = false;
        }
        this.g0 = z10;
        this.l0 = tL_messageActionGramTransfer;
        boolean z13 = !z10 && z12;
        this.i0 = z13;
        org.telegram.ui.Components.f6 f6Var = this.K;
        if (z13) {
            f6Var.d(0.0f, true);
            this.M = false;
            this.N = 0L;
        } else if (z11) {
            f6Var.d(1.0f, true);
            this.M = false;
            this.N = 0L;
        }
        this.m0 = false;
        boolean z14 = z10 && i10 == 2;
        boolean z15 = z10 && i10 == 1;
        if (this.h0 && z10 && i10 == 0) {
            b();
            i();
            this.t = 18.0f;
            this.u.f();
            w0Var.invalidate();
        }
        if (z15) {
            if (!this.h0) {
                this.P = SystemClock.elapsedRealtime();
            }
            f6Var.d(0.0f, true);
            this.M = false;
            this.N = 0L;
        } else if (z14) {
            f6Var.d(1.0f, true);
            this.M = false;
            this.N = 0L;
        }
        t();
        this.h0 = z15;
        this.S = z15 ? SystemClock.elapsedRealtime() : 0L;
        if (z15) {
            f();
            j3 j3Var = this.d0;
            j3Var.getClass();
            j3Var.v = Math.max(0L, 0L);
            if (this.d0.d() || this.d0.c()) {
                j3 j3Var2 = this.d0;
                j3Var2.b = -1L;
                j3Var2.c = -1L;
            }
            w0Var.invalidate();
        } else {
            j3 j3Var3 = this.d0;
            if (j3Var3 != null && this.e0 == 0 && !j3Var3.d() && !this.d0.c()) {
                this.d0.a();
                w0Var.invalidate();
            }
        }
        int w02 = z14 ? org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.q7, this.b) : z10 ? -15352320 : -11814402;
        int i11 = this.U;
        if (i11 == 0) {
            this.V = w02;
            this.U = w02;
            this.T = w02;
        } else if (w02 != i11) {
            this.T = this.V;
            this.U = w02;
            this.J.d(0.0f, true);
            w0Var.invalidate();
        }
        String string = z14 ? LocaleController.getString(R.string.WalletTransferStatusFailed) : z10 ? LocaleController.getString(R.string.WalletTransferStatusSent) : LocaleController.getString(R.string.WalletTransferStatusReceived);
        i3 i3Var = this.I;
        if (z15) {
            i3Var.f(10, string, true);
        } else {
            i3Var.g(10, string);
        }
        SpannableStringBuilder p5 = m0.p(m0.n(Math.abs(tL_messageActionGramTransfer.amount), false), 0.75f);
        for (RelativeSizeSpan relativeSizeSpan : (RelativeSizeSpan[]) p5.getSpans(0, p5.length(), RelativeSizeSpan.class)) {
            p5.removeSpan(relativeSizeSpan);
        }
        p5.insert(0, (CharSequence) (z10 ? "–" : "+"));
        int indexOf = p5.toString().indexOf(46);
        if (indexOf >= 0) {
            p5.setSpan(new RelativeSizeSpan(0.75f), indexOf, p5.length(), 33);
        }
        Object obj = new Object();
        p5.setSpan(obj, 0, p5.length(), 33);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(m0.k("Grams", p5, R.string.Grams_other));
        int spanStart = spannableStringBuilder.getSpanStart(obj);
        int spanEnd = spannableStringBuilder.getSpanEnd(obj);
        spannableStringBuilder.removeSpan(obj);
        ki.y5 y5Var = this.v0;
        if (spanStart > 0) {
            spannableStringBuilder.setSpan(CharacterStyle.wrap(y5Var), 0, spanStart, 33);
        }
        if (spanEnd >= 0 && spanEnd < spannableStringBuilder.length()) {
            spannableStringBuilder.setSpan(CharacterStyle.wrap(y5Var), spanEnd, spannableStringBuilder.length(), 33);
        }
        this.n0 = new d11(spannableStringBuilder, 16.0f, AndroidUtilities.bold());
        String str2 = tL_messageActionGramTransfer.peer_address;
        Locale locale = Locale.US;
        String g10 = x5.g(x5.e(str2.toUpperCase(locale)));
        d11 d11Var = new d11("", 9.3f, AndroidUtilities.getTypeface(AndroidUtilities.TYPEFACE_ROBOTO_MONO));
        d11Var.n(2);
        this.o0 = d11Var;
        d11Var.r(g10);
        if (TextUtils.isEmpty(str)) {
            this.p0 = null;
        } else {
            d11 d11Var2 = new d11("", 10.0f, Typeface.create(AndroidUtilities.getTypeface(AndroidUtilities.TYPEFACE_ROBOTO_MONO), 1));
            this.p0 = d11Var2;
            d11Var2.r(TextUtils.ellipsize(AndroidUtilities.replaceNewLines(str.toUpperCase(locale)), this.p0.a, AndroidUtilities.dp(206.0f) - AndroidUtilities.dp(24.0f), TextUtils.TruncateAt.END));
        }
        Stack stack = this.d;
        ArrayList arrayList = this.c;
        stack.addAll(arrayList);
        arrayList.clear();
        if (TextUtils.isEmpty(tL_messageActionGramTransfer.comment)) {
            this.q0 = null;
            return;
        }
        d11 d11Var3 = new d11("", 12.0f, null);
        d11Var3.n(ConnectionsManager.DEFAULT_DATACENTER_ID);
        Layout.Alignment alignment = Layout.Alignment.ALIGN_CENTER;
        d11Var3.a();
        d11Var3.q(AndroidUtilities.dp(184.0f));
        this.q0 = d11Var3;
        if ((!tL_messageActionGramTransfer.comment_encrypted && !tL_messageActionGramTransfer.comment_encrypted_preparing) || this.m0) {
            d11Var3.r(Emoji.replaceEmoji(tL_messageActionGramTransfer.comment, d11Var3.a.getFontMetricsInt(), false));
            return;
        }
        StringBuilder sb2 = new StringBuilder(25);
        for (int i12 = 0; i12 < 25; i12++) {
            sb2.append("a");
        }
        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(sb2.toString());
        l11 l11Var = new l11();
        l11Var.a |= 256;
        spannableStringBuilder2.setSpan(new m11(l11Var, 0), 0, spannableStringBuilder2.length(), 33);
        this.q0.r(spannableStringBuilder2);
        wh.g.c(w0Var, this.q0.b, stack, arrayList);
        q(this.e);
    }

    public final void p(TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop, boolean z10) {
        TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop2 = this.z0;
        Paint paint = this.C0;
        org.telegram.ui.Components.f6 f6Var = this.D0;
        Shader shader = null;
        if (stargiftattributebackdrop2 == null || stargiftattributebackdrop == null ? stargiftattributebackdrop2 == stargiftattributebackdrop : stargiftattributebackdrop2.center_color == stargiftattributebackdrop.center_color && stargiftattributebackdrop2.edge_color == stargiftattributebackdrop.edge_color && stargiftattributebackdrop2.pattern_color == stargiftattributebackdrop.pattern_color && stargiftattributebackdrop2.text_color == stargiftattributebackdrop.text_color) {
            if (z10 || f6Var.c >= 1.0f) {
                return;
            }
            this.A0 = null;
            paint.setShader(null);
            f6Var.d(1.0f, true);
            return;
        }
        Paint paint2 = this.B0;
        if (z10) {
            this.A0 = stargiftattributebackdrop2;
            paint.setShader(paint2.getShader());
            f6Var.d(0.0f, true);
        } else {
            this.A0 = null;
            paint.setShader(null);
            f6Var.d(1.0f, true);
        }
        this.z0 = stargiftattributebackdrop;
        if (stargiftattributebackdrop != null) {
            int l4 = n7.l(-16216082, stargiftattributebackdrop.center_color, stargiftattributebackdrop.edge_color);
            int l10 = n7.l(-15291399, stargiftattributebackdrop.center_color, stargiftattributebackdrop.edge_color);
            SweepGradient sweepGradient = new SweepGradient(0.0f, 0.0f, new int[]{l4, l10, l4, l10, l4}, new float[]{0.0f, 0.25f, 0.5f, 0.75f, 1.0f});
            if (SharedConfig.getDevicePerformanceClass() == 0) {
                shader = sweepGradient;
            } else {
                Bitmap createBitmap = Bitmap.createBitmap(96, 96, Bitmap.Config.ARGB_8888);
                Canvas canvas = new Canvas(createBitmap);
                Paint paint3 = new Paint();
                paint3.setShader(sweepGradient);
                canvas.translate(48.0f, 48.0f);
                canvas.drawPaint(paint3);
                Utilities.stackBlurBitmap(createBitmap, 16);
                Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                shader = new BitmapShader(createBitmap, tileMode, tileMode);
            }
        }
        paint2.setShader(shader);
        org.telegram.ui.Cells.w0 w0Var = this.a;
        w0Var.invalidate();
        if (w0Var.getParent() instanceof View) {
            ((View) w0Var.getParent()).invalidate();
        }
    }

    public final void q(boolean z10) {
        this.e = z10;
        ArrayList arrayList = this.c;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            ((wh.g) obj).invalidateSelf();
        }
    }

    public final void r(float f7, float f10) {
        this.p = f7;
        this.q = f10;
    }

    public final void s() {
        if (this.m == null) {
            return;
        }
        if (this.x == -1 && !this.D) {
            this.A = i();
            this.B = this.k.E * 0.14f;
        }
        boolean z10 = true;
        boolean z11 = this.x != -1 || this.D || this.C > 1.001f;
        k3 k3Var = this.m;
        float f7 = this.A;
        float f10 = this.B;
        if (!z11 && !this.h0 && this.r == 0.0f && this.s == 0.0f && this.t == 0.0f) {
            z10 = false;
        }
        k3Var.r = f7;
        k3Var.s = f10;
        k3Var.v = z10;
        k3Var.w = z11;
    }

    public final void t() {
        if (!this.h0 || this.S == 0) {
            return;
        }
        long elapsedRealtime = SystemClock.elapsedRealtime();
        this.R = ((((elapsedRealtime - this.S) * 360.0f) / 4000.0f) + this.R) % 360.0f;
        this.S = elapsedRealtime;
    }

    public final void u() {
        int i10 = (!this.a.isAttachedToWindow() || this.x0 == 0) ? -1 : this.w0;
        int i11 = this.y0;
        if (i10 == i11) {
            return;
        }
        g3 g3Var = this.E0;
        if (i11 >= 0) {
            NotificationCenter.getInstance(i11).removeObserver(g3Var, NotificationCenter.userInfoDidLoad);
        }
        this.y0 = i10;
        if (i10 >= 0) {
            NotificationCenter.getInstance(i10).addObserver(g3Var, NotificationCenter.userInfoDidLoad);
        }
    }
}
