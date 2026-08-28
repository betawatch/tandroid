package hg;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.View;
import gh.bb;
import java.util.ArrayList;
import java.util.Collections;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.DocumentObject;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LiteMode;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.b6;
import org.telegram.ui.ActionBar.d5;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.Cells.t1;
import org.telegram.ui.Cells.w0;
import org.telegram.ui.Components.b9;
import org.telegram.ui.Components.gr;
import org.telegram.ui.Components.i6;
import org.telegram.ui.Components.k5;
import org.telegram.ui.Components.lq;
import org.telegram.ui.Components.mi0;
import org.telegram.ui.Components.pc;
import org.telegram.ui.Components.qm0;
import org.telegram.ui.Components.x5;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public abstract class p0 {
    public int A;
    public int B;
    public final ImageReceiver C;
    public final k5 D;
    public int E;
    public final lq F;
    public final i6 G;
    public final i6 H;
    public boolean I;
    public int J;
    public int K;
    public int L;
    public int M;
    public int N;
    public int O;
    public int P;
    public boolean Q;
    public boolean R;
    public boolean S;
    public b9 T;
    public ArrayList U;
    public final int V;
    public final View W;
    public final b6 X;
    public final pc Y;
    public final bb Z;
    public final TLRPC.ReactionCount a;
    public final mi0 a0;
    public final boolean b;
    public int c;
    public int d;
    public int e;
    public boolean e0;
    public int f;
    public ImageReceiver f0;
    public int g;
    public k5 g0;
    public int h;
    public int i;
    public int j;
    public final int k;
    public final boolean m;
    public boolean n;
    public String o;
    public boolean p;
    public boolean q;
    public final TLRPC.Reaction r;
    public final r0 s;
    public boolean u;
    public final String v;
    public int w;
    public int x;
    public int y;
    public int z;
    public boolean l = true;
    public final Rect t = new Rect();
    public final RectF b0 = new RectF();
    public final RectF c0 = new RectF();
    public final Path d0 = new Path();

    public p0(p0 p0Var, int i9, View view, TLRPC.ReactionCount reactionCount, boolean z10, boolean z11, b6 b6Var) {
        bb bbVar;
        mi0 mi0Var;
        eg.a aVar = new eg.a(this, 3);
        this.V = i9;
        this.W = view;
        this.Y = new pc(view);
        this.X = b6Var;
        this.S = z11;
        if (p0Var != null) {
            this.F = p0Var.F;
        }
        if (this.C == null) {
            this.C = new ImageReceiver();
        }
        if (this.F == null) {
            this.F = new lq(view, false, null);
        }
        if (this.G == null) {
            i6 i6Var = new i6(true, true, true, false);
            this.G = i6Var;
            i6Var.E = true;
            i6Var.k(0.4f, 320L, gr.h);
            i6Var.t(AndroidUtilities.dp(13.0f));
            i6Var.setCallback(aVar);
            i6Var.u(AndroidUtilities.bold());
            i6Var.G = AndroidUtilities.displaySize.x;
        }
        if (this.H == null) {
            i6 i6Var2 = new i6(false, false, false, true);
            this.H = i6Var2;
            i6Var2.t(AndroidUtilities.dp(12.0f));
            i6Var2.setCallback(aVar);
            i6Var2.u(AndroidUtilities.bold());
            i6Var2.G = AndroidUtilities.displaySize.x;
            i6Var2.v = 0.35f;
        }
        this.a = reactionCount;
        TLRPC.Reaction reaction = reactionCount.reaction;
        this.r = reaction;
        r0 d = r0.d(reaction);
        this.s = d;
        int i10 = reactionCount.count;
        this.w = i10;
        this.p = reactionCount.chosen;
        this.j = i10;
        this.k = reactionCount.chosen_order;
        this.b = z10;
        if (reaction instanceof TLRPC.TL_reactionPaid) {
            this.o = "stars";
        } else if (reaction instanceof TLRPC.TL_reactionEmoji) {
            this.o = ((TLRPC.TL_reactionEmoji) reaction).emoticon;
        } else {
            if (!(reaction instanceof TLRPC.TL_reactionCustomEmoji)) {
                throw new RuntimeException("unsupported");
            }
            this.o = Long.toString(((TLRPC.TL_reactionCustomEmoji) reaction).document_id);
        }
        this.C.setParentView(view);
        this.Q = reactionCount.chosen;
        lq lqVar = this.F;
        lqVar.G = false;
        lqVar.a = true;
        if (reaction != null) {
            if (d.a) {
                this.m = true;
                if (LiteMode.isEnabled(LiteMode.FLAG_ANIMATED_EMOJI_REACTIONS)) {
                    if (p0Var == null || (mi0Var = p0Var.a0) == null) {
                        this.a0 = new mi0(R.raw.star_reaction_click, AndroidUtilities.dp(40.0f), "star_reaction_click", AndroidUtilities.dp(40.0f));
                    } else {
                        this.a0 = mi0Var;
                    }
                    this.C.setImageBitmap(this.a0);
                } else {
                    this.C.setImageBitmap(ApplicationLoader.applicationContext.getResources().getDrawable(R.drawable.star_reaction).mutate());
                }
                if (p0Var == null || (bbVar = p0Var.Z) == null) {
                    bbVar = new bb(1, SharedConfig.getDevicePerformanceClass() == 2 ? 18 : 8);
                }
                this.Z = bbVar;
            } else if (d.f != null) {
                TLRPC.TL_availableReaction tL_availableReaction = MediaDataController.getInstance(i9).getReactionsMap().get(d.f);
                if (tL_availableReaction != null) {
                    this.C.setImage(ImageLocation.getForDocument(tL_availableReaction.center_icon), "40_40_lastreactframe", DocumentObject.getSvgThumb(tL_availableReaction.static_icon, f6.a7, 1.0f), "webp", tL_availableReaction, 1);
                }
            } else if (d.g != 0) {
                this.D = new k5(j(), i9, d.g);
            }
        }
        this.F.d(AndroidUtilities.dp(26.0f), AndroidUtilities.dp(100.0f));
        this.F.e = s0.Y;
        if (z11) {
            this.v = MessagesController.getInstance(i9).getSavedTagName(reaction);
            this.u = !TextUtils.isEmpty(r1);
        }
        if (this.u) {
            i6 i6Var3 = this.G;
            i6Var3.q(Emoji.replaceEmoji(this.v, i6Var3.a.getFontMetricsInt(), false), !LocaleController.isRTL, true);
            if (this instanceof qm0) {
                Integer.toString(reactionCount.count);
                this.F.c(this.w, false);
            } else {
                this.F.c(0, false);
            }
        } else {
            i6 i6Var4 = this.G;
            if (i6Var4 != null) {
                i6Var4.q("", false, true);
            }
            Integer.toString(reactionCount.count);
            this.F.c(this.w, false);
        }
        lq lqVar2 = this.F;
        lqVar2.I = 2;
        lqVar2.z = 3;
    }

    public final void a() {
        this.e0 = true;
        ImageReceiver imageReceiver = this.C;
        if (imageReceiver != null) {
            imageReceiver.onAttachedToWindow();
        }
        b9 b9Var = this.T;
        if (b9Var != null) {
            b9Var.g();
        }
        k5 k5Var = this.D;
        if (k5Var != null) {
            k5Var.a(this.W);
        }
    }

    public final void b() {
        this.e0 = false;
        ImageReceiver imageReceiver = this.C;
        if (imageReceiver != null) {
            imageReceiver.onDetachedFromWindow();
        }
        b9 b9Var = this.T;
        if (b9Var != null) {
            b9Var.h();
        }
        k5 k5Var = this.D;
        if (k5Var != null) {
            k5Var.o(this.W);
        }
        c();
    }

    public final void c() {
        ImageReceiver imageReceiver = this.f0;
        if (imageReceiver == null && this.g0 == null) {
            return;
        }
        if (imageReceiver != null) {
            imageReceiver.onDetachedFromWindow();
            this.f0 = null;
        } else if (this.g0 != null) {
            View view = this.W;
            if (view != null && (view.getParent() instanceof View)) {
                view = (View) view.getParent();
            }
            this.g0.o(view);
            this.g0 = null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:136:0x04e9  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x04f9  */
    /* JADX WARN: Removed duplicated region for block: B:141:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:157:0x0494  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x049f  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x04a7  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x0482  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x025d  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x024d  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x02e7  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0306  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x031c  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x031f  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x034d  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0352  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void d(Canvas canvas, float f10, float f11, float f12, float f13, boolean z10, boolean z11, float f14) {
        int i9;
        float f15;
        ImageReceiver imageReceiver;
        i6 i6Var;
        Paint paint;
        boolean z12;
        float f16;
        float f17;
        RectF rectF;
        boolean z13;
        float f18;
        Paint paint2;
        float f19;
        float f20;
        lq lqVar;
        float f21;
        b9 b9Var;
        float f22;
        float f23;
        int dp;
        int dp2;
        Paint paint3;
        d5 y22;
        k5 k5Var = this.D;
        ImageReceiver imageReceiver2 = k5Var != null ? k5Var.k : this.C;
        boolean z14 = this.b;
        Rect rect = this.t;
        if (z14 && imageReceiver2 != null) {
            imageReceiver2.setAlpha(f13);
            rect.set((int) f10, (int) f11, AndroidUtilities.dp(14.0f), AndroidUtilities.dp(14.0f));
            imageReceiver2.setImageCoords(rect);
            imageReceiver2.setRoundRadius(0);
            f(canvas, rect, f13);
            return;
        }
        boolean z15 = this.p;
        View view = this.W;
        boolean z16 = this.m;
        b6 b6Var = this.X;
        if (z15) {
            if (z16) {
                this.J = -1529086;
                this.K = -1;
                this.M = -1;
                this.L = -1529086;
            } else {
                this.J = f6.v0(m() ? f6.Sb : f6.Cj, b6Var);
                this.K = f6.v0(m() ? f6.Gj : f6.Fj, b6Var);
                if (view instanceof w0) {
                    this.M = f6.v0(f6.Ij, b6Var);
                    this.L = f6.v0(f6.Hj, b6Var);
                } else {
                    this.M = f6.v0(m() ? f6.Sb : f6.Cj, b6Var);
                    this.L = f6.v0(m() ? f6.Aa : f6.ra, b6Var);
                }
            }
            i9 = 0;
        } else if (z16) {
            this.K = -1529086;
            this.J = 1088989954;
            this.M = -1;
            i9 = 0;
            this.L = 0;
        } else {
            this.K = f6.v0(m() ? f6.Dj : f6.Ej, b6Var);
            int v02 = f6.v0(m() ? f6.Sb : f6.Cj, b6Var);
            this.J = v02;
            this.J = i0.a.k(v02, (int) (Color.alpha(v02) * 0.156f));
            this.M = f6.v0(f6.ic, b6Var);
            i9 = 0;
            this.L = 0;
        }
        if (this.q) {
            this.J = i9;
            this.L = i9;
        }
        s(f12);
        TextPaint textPaint = s0.Y;
        textPaint.setColor(this.N);
        i6 i6Var2 = this.G;
        if (i6Var2 != null) {
            i6Var2.r(this.N);
        }
        Paint paint4 = s0.V;
        paint4.setColor(this.O);
        boolean z17 = this.S && i() && Color.alpha(this.P) == 0;
        if (f13 != 1.0f) {
            f15 = 1.0f;
            textPaint.setAlpha((int) (textPaint.getAlpha() * f13));
            paint4.setAlpha((int) (paint4.getAlpha() * f13));
        } else {
            f15 = 1.0f;
        }
        if (imageReceiver2 != null) {
            imageReceiver2.setAlpha(f13);
        }
        i6 i6Var3 = this.H;
        if (f14 > 0.0f) {
            f16 = 0.0f;
            if (this.I != z11) {
                if (z11) {
                    z12 = z16;
                    gr grVar = gr.k;
                    i6Var3.u = 0.6f;
                    imageReceiver = imageReceiver2;
                    i6Var3.r = 650L;
                    i6Var3.t = 1.6f;
                    i6Var3.s = grVar;
                    i6Var3.q(AndroidUtilities.formatWholeNumber(this.w, 0), false, true);
                    i6Var = i6Var2;
                    i6Var3.q(LocaleController.formatNumber(this.w, ','), true, true);
                    paint = paint4;
                } else {
                    imageReceiver = imageReceiver2;
                    i6Var = i6Var2;
                    z12 = z16;
                    gr grVar2 = gr.h;
                    i6Var3.u = 0.6f;
                    paint = paint4;
                    i6Var3.r = 320L;
                    i6Var3.t = 1.6f;
                    i6Var3.s = grVar2;
                    i6Var3.q(AndroidUtilities.formatWholeNumber(this.w, 0), true, true);
                }
                this.I = z11;
            } else {
                imageReceiver = imageReceiver2;
                i6Var = i6Var2;
                paint = paint4;
                z12 = z16;
            }
        } else {
            imageReceiver = imageReceiver2;
            i6Var = i6Var2;
            paint = paint4;
            z12 = z16;
            f16 = 0.0f;
        }
        float a2 = this.Y.a(0.1f);
        int i10 = this.A;
        if (f14 > 0.0f && !this.S && i6Var3 != null && this.T == null) {
            i10 = (int) (i6Var3.d() + AndroidUtilities.dp(k5Var != null ? 6.0f : 4.0f) + AndroidUtilities.dp(20.0f) + AndroidUtilities.dp(8.0f) + AndroidUtilities.dp(8.0f));
            i6Var3.r(this.N);
        } else if (f12 != f15) {
            f17 = 8.0f;
            if (this.c == 3) {
                i10 = (int) e2.c.z(1.0f, f12, this.f, i10 * f12);
            }
            rectF = AndroidUtilities.rectTmp;
            float f24 = i10;
            rectF.set(f10, f11, f10 + f24, this.B + f11);
            if (a2 == 1.0f) {
                canvas.save();
                canvas.scale(a2, a2, (f24 / 2.0f) + f10, (this.B / 2.0f) + f11);
                z13 = true;
            } else {
                z13 = false;
            }
            f18 = this.B / 2.0f;
            if (k() > f16 || this.q) {
                paint2 = paint;
                f19 = 2.0f;
            } else {
                Paint T0 = f6.T0("paintChatActionBackground", b6Var);
                Paint T02 = f6.T0("paintChatActionBackgroundDarken", b6Var);
                f19 = 2.0f;
                int alpha = T0.getAlpha();
                paint2 = paint;
                int alpha2 = T02.getAlpha();
                T0.setAlpha((int) (alpha * f13 * k()));
                T02.setAlpha((int) (alpha2 * f13 * k()));
                h(canvas, rectF, f18, T0);
                if (b6Var == null ? f6.a1() : b6Var.t0()) {
                    h(canvas, rectF, f18, T02);
                }
                T0.setAlpha(alpha);
                T02.setAlpha(alpha2);
            }
            if (z10 && k() < 1.0f && (view instanceof t1) && (y22 = ((t1) view).y2(false)) != null && !this.S) {
                canvas.drawRoundRect(rectF, f18, f18, y22.c);
            }
            if (z17) {
                rectF.right += AndroidUtilities.dp(4.0f);
                canvas.saveLayerAlpha(rectF, 255, 31);
                rectF.right -= AndroidUtilities.dp(4.0f);
            }
            if (this.Z != null) {
                LiteMode.isEnabled(LiteMode.FLAG_ANIMATED_EMOJI_REACTIONS);
            }
            h(canvas, rectF, f18, paint2);
            if (this.S && i()) {
                if (z17) {
                    paint3 = s0.W;
                    paint3.setColor(this.P);
                    paint3.setAlpha((int) (paint3.getAlpha() * f13));
                } else {
                    paint3 = s0.X;
                }
                canvas.drawCircle(rectF.right - AndroidUtilities.dp(8.4f), rectF.centerY(), AndroidUtilities.dp(2.66f), paint3);
            }
            if (z17) {
                canvas.restore();
            }
            if (imageReceiver != null) {
                if (z12) {
                    dp = AndroidUtilities.dp(22.0f);
                    dp2 = AndroidUtilities.dp(4.0f);
                } else if (k5Var != null) {
                    dp = AndroidUtilities.dp(24.0f);
                    dp2 = AndroidUtilities.dp(6.0f);
                    imageReceiver.setRoundRadius(AndroidUtilities.dp(6.0f));
                } else {
                    dp = AndroidUtilities.dp(20.0f);
                    dp2 = AndroidUtilities.dp(f17);
                    imageReceiver.setRoundRadius(0);
                }
                int i11 = (int) ((this.B - dp) / f19);
                if (this.S) {
                    dp2 -= AndroidUtilities.dp(f19);
                }
                int i12 = ((int) f10) + dp2;
                int i13 = ((int) f11) + i11;
                rect.set(i12, i13, i12 + dp, dp + i13);
                f(canvas, rect, f13);
            }
            if (i6Var != null || i6Var.g() <= f16) {
                f20 = 0.0f;
            } else {
                canvas.save();
                if (!this.u || i()) {
                    f23 = this.u ? 9 : 8;
                } else {
                    f23 = 10.0f;
                }
                canvas.translate(AndroidUtilities.dp(f23) + f10 + AndroidUtilities.dp(20.0f) + AndroidUtilities.dp(f19), f11);
                i6 i6Var4 = i6Var;
                i6Var4.setBounds(0, 0, this.A, this.B);
                i6Var4.draw(canvas);
                i6Var4.w = (int) (f13 * 255.0f);
                canvas.restore();
                f20 = i6Var4.d() + (i6Var4.g() * AndroidUtilities.dp(4.0f));
            }
            if (f14 > 0.0f || this.S || i6Var3 == null || this.T != null) {
                lqVar = this.F;
                if (lqVar != null && e()) {
                    canvas.save();
                    if (this.u || i()) {
                        f21 = this.u ? 9 : 8;
                    } else {
                        f21 = 10.0f;
                    }
                    canvas.translate(AndroidUtilities.dp(f21) + f10 + AndroidUtilities.dp(20.0f) + AndroidUtilities.dp(k5Var == null ? 2.0f : 5.0f) + f20 + (!z12 ? -AndroidUtilities.dp(1.0f) : 0), f11);
                    lqVar.a(canvas);
                    canvas.restore();
                }
            } else {
                canvas.save();
                if (!this.u || i()) {
                    f22 = this.u ? 9 : 8;
                } else {
                    f22 = 10.0f;
                }
                canvas.translate(AndroidUtilities.dp(f22) + f10 + AndroidUtilities.dp(20.0f) + AndroidUtilities.dp(k5Var == null ? 2.0f : 5.0f), f11 - AndroidUtilities.dp(1.0f));
                i6Var3.setBounds(0, 0, this.A, this.B);
                i6Var3.draw(canvas);
                i6Var3.w = (int) (255.0f * f13);
                canvas.restore();
            }
            if (!this.S && this.T != null) {
                canvas.save();
                canvas.translate(f10 + AndroidUtilities.dp(10.0f) + AndroidUtilities.dp(20.0f) + AndroidUtilities.dp(f19), f11);
                b9Var = this.T;
                b9Var.u = f13;
                if (b9Var.w && b9Var.e != f12) {
                    b9Var.e = f12;
                    if (f12 == 1.0f) {
                        b9Var.n();
                        b9Var.w = false;
                    }
                }
                this.T.i(canvas);
                canvas.restore();
            }
            if (z13) {
                return;
            }
            canvas.restore();
            return;
        }
        f17 = 8.0f;
        rectF = AndroidUtilities.rectTmp;
        float f242 = i10;
        rectF.set(f10, f11, f10 + f242, this.B + f11);
        if (a2 == 1.0f) {
        }
        f18 = this.B / 2.0f;
        if (k() > f16) {
        }
        paint2 = paint;
        f19 = 2.0f;
        if (z10) {
            canvas.drawRoundRect(rectF, f18, f18, y22.c);
        }
        if (z17) {
        }
        if (this.Z != null) {
        }
        h(canvas, rectF, f18, paint2);
        if (this.S) {
            if (z17) {
            }
            canvas.drawCircle(rectF.right - AndroidUtilities.dp(8.4f), rectF.centerY(), AndroidUtilities.dp(2.66f), paint3);
        }
        if (z17) {
        }
        if (imageReceiver != null) {
        }
        if (i6Var != null) {
        }
        f20 = 0.0f;
        if (f14 > 0.0f) {
        }
        lqVar = this.F;
        if (lqVar != null) {
            canvas.save();
            if (this.u) {
            }
            f21 = this.u ? 9 : 8;
            canvas.translate(AndroidUtilities.dp(f21) + f10 + AndroidUtilities.dp(20.0f) + AndroidUtilities.dp(k5Var == null ? 2.0f : 5.0f) + f20 + (!z12 ? -AndroidUtilities.dp(1.0f) : 0), f11);
            lqVar.a(canvas);
            canvas.restore();
        }
        if (!this.S) {
            canvas.save();
            canvas.translate(f10 + AndroidUtilities.dp(10.0f) + AndroidUtilities.dp(20.0f) + AndroidUtilities.dp(f19), f11);
            b9Var = this.T;
            b9Var.u = f13;
            if (b9Var.w) {
                b9Var.e = f12;
                if (f12 == 1.0f) {
                }
            }
            this.T.i(canvas);
            canvas.restore();
        }
        if (z13) {
        }
    }

    public boolean e() {
        int i9 = this.w;
        return ((i9 == 0 || (this.S && !this.u && i9 == 1)) && this.F.l == 1.0f) ? false : true;
    }

    public final void f(Canvas canvas, Rect rect, float f10) {
        ImageReceiver imageReceiver;
        boolean z10;
        k5 k5Var = this.D;
        if (k5Var == null || (imageReceiver = k5Var.k) == null) {
            imageReceiver = this.C;
        }
        if (imageReceiver != null && rect != null) {
            imageReceiver.setImageCoords(rect);
        }
        k5 k5Var2 = this.D;
        if (k5Var2 != null && this.E != this.N) {
            int i9 = this.N;
            this.E = i9;
            k5Var2.setColorFilter(new PorterDuffColorFilter(i9, PorterDuff.Mode.SRC_IN));
        }
        if (!this.l || (!this.m && this.j <= 1 && n() && this.Q)) {
            imageReceiver.setAlpha(0.0f);
            imageReceiver.draw(canvas);
            this.n = false;
            return;
        }
        ImageReceiver l10 = l();
        if (l10 != null) {
            z10 = l10.getLottieAnimation() == null || !l10.getLottieAnimation().s();
            if (f10 != 1.0f) {
                l10.setAlpha(f10);
                if (f10 <= 0.0f) {
                    l10.onDetachedFromWindow();
                    o();
                }
            } else if (l10.getLottieAnimation() != null && !l10.getLottieAnimation().h0) {
                float alpha = l10.getAlpha() - 0.08f;
                if (alpha <= 0.0f) {
                    l10.onDetachedFromWindow();
                    o();
                } else {
                    l10.setAlpha(alpha);
                }
                this.W.invalidate();
                z10 = true;
            }
            l10.setImageCoords(imageReceiver.getImageX() - (imageReceiver.getImageWidth() / 2.0f), imageReceiver.getImageY() - (imageReceiver.getImageWidth() / 2.0f), imageReceiver.getImageWidth() * 2.0f, imageReceiver.getImageHeight() * 2.0f);
            l10.draw(canvas);
        } else {
            z10 = true;
        }
        if (z10) {
            imageReceiver.draw(canvas);
        }
        this.n = true;
    }

    public final boolean g(Canvas canvas, float f10, float f11) {
        bb bbVar = this.Z;
        if (bbVar == null) {
            return false;
        }
        RectF rectF = bbVar.c;
        if (!LiteMode.isEnabled(LiteMode.FLAG_ANIMATED_EMOJI_REACTIONS) || !LiteMode.isEnabled(131072)) {
            return false;
        }
        RectF rectF2 = AndroidUtilities.rectTmp;
        rectF2.set(f10, f11, this.A + f10, this.B + f11);
        float f12 = this.B / 2.0f;
        rectF.set(rectF2);
        rectF.inset(-AndroidUtilities.dp(4.0f), -AndroidUtilities.dp(4.0f));
        bbVar.g(rectF);
        boolean d = bbVar.d();
        bbVar.a(canvas, i0.a.d(k(), i0.a.k(this.J, 255), i0.a.d(0.4f, this.M, i0.a.k(this.J, 255))));
        if (this.Q) {
            Path path = this.d0;
            path.rewind();
            path.addRoundRect(rectF2, f12, f12, Path.Direction.CW);
            canvas.save();
            canvas.clipPath(path);
            bbVar.a(canvas, this.K);
            canvas.restore();
        }
        return d;
    }

    public final void h(Canvas canvas, RectF rectF, float f10, Paint paint) {
        if (!this.S) {
            canvas.drawRoundRect(rectF, f10, f10, paint);
            return;
        }
        RectF rectF2 = this.b0;
        float f11 = rectF2.left;
        float f12 = rectF.left;
        Path path = this.d0;
        if (f11 != f12 || rectF2.top != rectF.top || rectF2.right != rectF.right || rectF2.bottom != rectF.bottom) {
            rectF2.set(rectF);
            s0.h(rectF2, this.c0, path);
        }
        canvas.drawPath(path, paint);
    }

    public boolean i() {
        return true;
    }

    public int j() {
        return this.S ? 18 : 3;
    }

    public float k() {
        return 0.0f;
    }

    public ImageReceiver l() {
        return null;
    }

    public boolean m() {
        return false;
    }

    public boolean n() {
        return false;
    }

    public final void p(ArrayList arrayList) {
        this.U = arrayList;
        if (arrayList != null) {
            Collections.sort(arrayList, s0.c0);
            if (this.T == null) {
                b9 b9Var = new b9(this.W, false);
                this.T = b9Var;
                b9Var.v = 250L;
                gr grVar = rh.m.V;
                b9Var.s = AndroidUtilities.dp(20.0f);
                this.T.p = AndroidUtilities.dp(100.0f);
                b9 b9Var2 = this.T;
                b9Var2.o = this.B;
                b9Var2.j(AndroidUtilities.dp(22.0f));
            }
            if (this.e0) {
                this.T.g();
            }
            for (int i9 = 0; i9 < arrayList.size() && i9 != 3; i9++) {
                this.T.l(i9, (TLObject) arrayList.get(i9), this.V);
            }
            this.T.b(false, true);
        }
    }

    public final void q() {
        ImageReceiver imageReceiver;
        k5 k5Var = this.D;
        if (k5Var == null || (imageReceiver = k5Var.k) == null) {
            imageReceiver = this.C;
        }
        if (imageReceiver != null) {
            mi0 lottieAnimation = imageReceiver.getLottieAnimation();
            if (lottieAnimation != null) {
                lottieAnimation.F(true);
                return;
            }
            x5 animation = imageReceiver.getAnimation();
            if (animation != null) {
                animation.start();
            }
        }
    }

    public final void r() {
        ImageReceiver imageReceiver;
        k5 k5Var = this.D;
        if (k5Var == null || (imageReceiver = k5Var.k) == null) {
            imageReceiver = this.C;
        }
        if (imageReceiver != null) {
            mi0 lottieAnimation = imageReceiver.getLottieAnimation();
            if (lottieAnimation != null) {
                lottieAnimation.stop();
                return;
            }
            x5 animation = imageReceiver.getAnimation();
            if (animation != null) {
                animation.stop();
            }
        }
    }

    public void s(float f10) {
        this.N = i0.a.d(f10, this.i, i0.a.d(k(), this.K, this.M));
        int d = i0.a.d(f10, this.g, i0.a.d(k(), this.J, this.L));
        this.O = d;
        this.P = i0.a.d(f10, this.h, AndroidUtilities.computePerceivedBrightness(d) > 0.8f ? 0 : 1526726655);
    }

    public void o() {
    }
}
