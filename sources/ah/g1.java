package ah;

import ai.ee;
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
import com.google.android.gms.internal.play_billing.k3;
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
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.j5;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.Cells.t1;
import org.telegram.ui.Components.bs;
import org.telegram.ui.Components.e6;
import org.telegram.ui.Components.er;
import org.telegram.ui.Components.ho0;
import org.telegram.ui.Components.j9;
import org.telegram.ui.Components.p6;
import org.telegram.ui.Components.r5;
import org.telegram.ui.Components.yc;
import org.telegram.ui.Components.yj0;

/* compiled from: r8-map-id-6bb23a39fe2d1bb2dc6cc69f606436ba751c240cf93e0ff97ff041cb9f09a305 */
/* loaded from: classes3.dex */
public abstract class g1 {
    public int A;
    public int B;
    public final ImageReceiver C;
    public final r5 D;
    public int E;
    public final er F;
    public final p6 G;
    public final p6 H;
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
    public j9 T;
    public ArrayList U;
    public final int V;
    public final View W;
    public final g6 X;
    public final yc Y;
    public final ee Z;
    public final TLRPC.ReactionCount a;
    public final yj0 a0;
    public final boolean b;
    public int c;
    public int d;
    public int e;
    public boolean e0;
    public int f;
    public ImageReceiver f0;
    public int g;
    public r5 g0;
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
    public final i1 s;
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

    public g1(g1 g1Var, int i10, View view, TLRPC.ReactionCount reactionCount, boolean z10, boolean z11, g6 g6Var) {
        ee eeVar;
        yj0 yj0Var;
        f1 f1Var = new f1(this, 0);
        this.V = i10;
        this.W = view;
        this.Y = new yc(view);
        this.X = g6Var;
        this.S = z11;
        if (g1Var != null) {
            this.F = g1Var.F;
        }
        if (this.C == null) {
            this.C = new ImageReceiver();
        }
        if (this.F == null) {
            this.F = new er(view, false, null);
        }
        if (this.G == null) {
            p6 p6Var = new p6(true, true, true);
            this.G = p6Var;
            p6Var.K = true;
            p6Var.n(0.4f, 320L, bs.h);
            p6Var.w(AndroidUtilities.dp(13.0f));
            p6Var.setCallback(f1Var);
            p6Var.x(AndroidUtilities.bold());
            p6Var.M = AndroidUtilities.displaySize.x;
        }
        if (this.H == null) {
            p6 p6Var2 = new p6(false, false, false, true, false);
            this.H = p6Var2;
            p6Var2.w(AndroidUtilities.dp(12.0f));
            p6Var2.setCallback(f1Var);
            p6Var2.x(AndroidUtilities.bold());
            p6Var2.M = AndroidUtilities.displaySize.x;
            p6Var2.A = 0.35f;
        }
        this.a = reactionCount;
        TLRPC.Reaction reaction = reactionCount.reaction;
        this.r = reaction;
        i1 d = i1.d(reaction);
        this.s = d;
        int i11 = reactionCount.count;
        this.w = i11;
        this.p = reactionCount.chosen;
        this.j = i11;
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
        er erVar = this.F;
        erVar.G = false;
        erVar.a = true;
        if (reaction != null) {
            if (d.a) {
                this.m = true;
                if (LiteMode.isEnabled(LiteMode.FLAG_ANIMATED_EMOJI_REACTIONS)) {
                    if (g1Var == null || (yj0Var = g1Var.a0) == null) {
                        this.a0 = new yj0(R.raw.star_reaction_click, AndroidUtilities.dp(40.0f), AndroidUtilities.dp(40.0f));
                    } else {
                        this.a0 = yj0Var;
                    }
                    this.C.setImageBitmap(this.a0);
                } else {
                    this.C.setImageBitmap(ApplicationLoader.applicationContext.getResources().getDrawable(R.drawable.star_reaction).mutate());
                }
                if (g1Var == null || (eeVar = g1Var.Z) == null) {
                    eeVar = new ee(1, SharedConfig.getDevicePerformanceClass() == 2 ? 18 : 8);
                }
                this.Z = eeVar;
            } else if (d.f != null) {
                TLRPC.TL_availableReaction tL_availableReaction = MediaDataController.getInstance(i10).getReactionsMap().get(d.f);
                if (tL_availableReaction != null) {
                    this.C.setImage(ImageLocation.getForDocument(tL_availableReaction.center_icon), "40_40_lastreactframe", DocumentObject.getSvgThumb(tL_availableReaction.static_icon, k6.a7, 1.0f), "webp", tL_availableReaction, 1);
                }
            } else if (d.g != 0) {
                this.D = new r5(j(), i10, d.g);
            }
        }
        this.F.d(AndroidUtilities.dp(26.0f), AndroidUtilities.dp(100.0f));
        this.F.e = j1.Y;
        if (z11) {
            this.v = MessagesController.getInstance(i10).getSavedTagName(reaction);
            this.u = !TextUtils.isEmpty(r1);
        }
        if (this.u) {
            p6 p6Var3 = this.G;
            p6Var3.t(Emoji.replaceEmoji(this.v, p6Var3.a.getFontMetricsInt(), false), !LocaleController.isRTL, true);
            if (this instanceof ho0) {
                Integer.toString(reactionCount.count);
                this.F.c(this.w, false);
            } else {
                this.F.c(0, false);
            }
        } else {
            p6 p6Var4 = this.G;
            if (p6Var4 != null) {
                p6Var4.t("", false, true);
            }
            Integer.toString(reactionCount.count);
            this.F.c(this.w, false);
        }
        er erVar2 = this.F;
        erVar2.I = 2;
        erVar2.z = 3;
    }

    public final void a() {
        this.e0 = true;
        ImageReceiver imageReceiver = this.C;
        if (imageReceiver != null) {
            imageReceiver.onAttachedToWindow();
        }
        j9 j9Var = this.T;
        if (j9Var != null) {
            j9Var.g();
        }
        r5 r5Var = this.D;
        if (r5Var != null) {
            r5Var.a(this.W);
        }
    }

    public final void b() {
        this.e0 = false;
        ImageReceiver imageReceiver = this.C;
        if (imageReceiver != null) {
            imageReceiver.onDetachedFromWindow();
        }
        j9 j9Var = this.T;
        if (j9Var != null) {
            j9Var.h();
        }
        r5 r5Var = this.D;
        if (r5Var != null) {
            r5Var.o(this.W);
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

    /* JADX WARN: Removed duplicated region for block: B:101:0x03a3  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0402  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x04a8  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x04dc  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x04ec  */
    /* JADX WARN: Removed duplicated region for block: B:140:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:147:0x045b  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x0485  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x0490  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x0498  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x0474  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x025b  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x021f  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0248  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x026b  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x02c3  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x02e5  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0304  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0312  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x031a  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x031d  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x034a  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x034f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void d(Canvas canvas, float f7, float f10, float f11, float f12, boolean z10, boolean z11, float f13) {
        int i10;
        float f14;
        int i11;
        p6 p6Var;
        boolean z12;
        Paint paint;
        float a2;
        float f15;
        RectF rectF;
        float f16;
        boolean z13;
        float f17;
        boolean z14;
        Paint paint2;
        float f18;
        er erVar;
        float f19;
        j9 j9Var;
        float f20;
        float f21;
        int dp;
        int dp2;
        Paint paint3;
        j5 x22;
        r5 r5Var = this.D;
        ImageReceiver imageReceiver = r5Var != null ? r5Var.k : this.C;
        boolean z15 = this.b;
        Rect rect = this.t;
        if (z15 && imageReceiver != null) {
            imageReceiver.setAlpha(f12);
            rect.set((int) f7, (int) f10, AndroidUtilities.dp(14.0f), AndroidUtilities.dp(14.0f));
            imageReceiver.setImageCoords(rect);
            imageReceiver.setRoundRadius(0);
            f(canvas, rect, f12);
            return;
        }
        boolean z16 = this.p;
        View view = this.W;
        boolean z17 = this.m;
        g6 g6Var = this.X;
        if (z16) {
            if (z17) {
                this.J = -1529086;
                this.K = -1;
                this.M = -1;
                this.L = -1529086;
            } else {
                this.J = k6.w0(m() ? k6.Sb : k6.Cj, g6Var);
                this.K = k6.w0(m() ? k6.Gj : k6.Fj, g6Var);
                if (view instanceof org.telegram.ui.Cells.v0) {
                    this.M = k6.w0(k6.Ij, g6Var);
                    this.L = k6.w0(k6.Hj, g6Var);
                } else {
                    this.M = k6.w0(m() ? k6.Sb : k6.Cj, g6Var);
                    this.L = k6.w0(m() ? k6.Aa : k6.ra, g6Var);
                }
            }
            i10 = 0;
        } else if (z17) {
            this.K = -1529086;
            this.J = 1088989954;
            this.M = -1;
            i10 = 0;
            this.L = 0;
        } else {
            this.K = k6.w0(m() ? k6.Dj : k6.Ej, g6Var);
            int w02 = k6.w0(m() ? k6.Sb : k6.Cj, g6Var);
            this.J = w02;
            this.J = i0.a.o(w02, (int) (Color.alpha(w02) * 0.156f));
            this.M = k6.w0(k6.ic, g6Var);
            i10 = 0;
            this.L = 0;
        }
        if (this.q) {
            this.J = i10;
            this.L = i10;
        }
        s(f11);
        TextPaint textPaint = j1.Y;
        textPaint.setColor(this.N);
        p6 p6Var2 = this.G;
        if (p6Var2 != null) {
            p6Var2.u(this.N);
        }
        Paint paint4 = j1.V;
        paint4.setColor(this.O);
        boolean z18 = this.S && i() && Color.alpha(this.P) == 0;
        if (f12 != 1.0f) {
            f14 = 1.0f;
            textPaint.setAlpha((int) (textPaint.getAlpha() * f12));
            paint4.setAlpha((int) (paint4.getAlpha() * f12));
        } else {
            f14 = 1.0f;
        }
        if (imageReceiver != null) {
            imageReceiver.setAlpha(f12);
        }
        int i12 = (f13 > 0.0f ? 1 : (f13 == 0.0f ? 0 : -1));
        p6 p6Var3 = this.H;
        if (i12 <= 0) {
            i11 = i12;
            p6Var = p6Var2;
            z12 = z17;
        } else if (this.I != z11) {
            if (z11) {
                p6Var3.m(0.6f, 650L, 1.6f, bs.k);
                i11 = i12;
                p6Var3 = p6Var3;
                z12 = z17;
                p6Var = p6Var2;
                p6Var3.t(AndroidUtilities.formatWholeNumber(this.w, 0), false, true);
                paint = paint4;
                p6Var3.t(LocaleController.formatNumber(this.w, ','), true, true);
            } else {
                i11 = i12;
                p6Var = p6Var2;
                z12 = z17;
                p6Var3 = p6Var3;
                paint = paint4;
                p6Var3.m(0.6f, 320L, 1.6f, bs.h);
                p6Var3.t(AndroidUtilities.formatWholeNumber(this.w, 0), true, true);
            }
            this.I = z11;
            a2 = this.Y.a(0.1f);
            int i13 = this.A;
            if (i11 <= 0 && !this.S && p6Var3 != null && this.T == null) {
                i13 = (int) (p6Var3.c() + AndroidUtilities.dp(r5Var != null ? 6.0f : 4.0f) + AndroidUtilities.dp(20.0f) + AndroidUtilities.dp(8.0f) + AndroidUtilities.dp(8.0f));
                p6Var3.u(this.N);
            } else if (f11 != f14) {
                f15 = 6.0f;
                if (this.c == 3) {
                    i13 = (int) k3.y(f14, f11, this.f, i13 * f11);
                }
                rectF = AndroidUtilities.rectTmp;
                float f22 = i13;
                rectF.set(f7, f10, f7 + f22, this.B + f10);
                if (a2 != 1.0f) {
                    canvas.save();
                    f16 = 2.0f;
                    canvas.scale(a2, a2, (f22 / 2.0f) + f7, (this.B / 2.0f) + f10);
                    z13 = true;
                } else {
                    f16 = 2.0f;
                    z13 = false;
                }
                f17 = this.B / f16;
                if (k() > 0.0f || this.q) {
                    z14 = z13;
                    paint2 = paint;
                } else {
                    Paint V0 = k6.V0("paintChatActionBackground", g6Var);
                    z14 = z13;
                    Paint V02 = k6.V0("paintChatActionBackgroundDarken", g6Var);
                    int alpha = V0.getAlpha();
                    paint2 = paint;
                    int alpha2 = V02.getAlpha();
                    V0.setAlpha((int) (alpha * f12 * k()));
                    V02.setAlpha((int) (alpha2 * f12 * k()));
                    h(canvas, rectF, f17, V0);
                    if (g6Var == null ? k6.c1() : g6Var.f()) {
                        h(canvas, rectF, f17, V02);
                    }
                    V0.setAlpha(alpha);
                    V02.setAlpha(alpha2);
                }
                if (z10 && k() < 1.0f && (view instanceof t1) && (x22 = ((t1) view).x2(false)) != null && !this.S) {
                    canvas.drawRoundRect(rectF, f17, f17, x22.c);
                }
                if (z18) {
                    rectF.right += AndroidUtilities.dp(4.0f);
                    canvas.saveLayerAlpha(rectF, 255, 31);
                    rectF.right -= AndroidUtilities.dp(4.0f);
                }
                if (this.Z != null) {
                    LiteMode.isEnabled(LiteMode.FLAG_ANIMATED_EMOJI_REACTIONS);
                }
                h(canvas, rectF, f17, paint2);
                if (this.S && i()) {
                    if (z18) {
                        paint3 = j1.W;
                        paint3.setColor(this.P);
                        paint3.setAlpha((int) (paint3.getAlpha() * f12));
                    } else {
                        paint3 = j1.X;
                    }
                    canvas.drawCircle(rectF.right - AndroidUtilities.dp(8.4f), rectF.centerY(), AndroidUtilities.dp(2.66f), paint3);
                }
                if (z18) {
                    canvas.restore();
                }
                if (imageReceiver != null) {
                    if (z12) {
                        dp = AndroidUtilities.dp(22.0f);
                        dp2 = AndroidUtilities.dp(4.0f);
                    } else if (r5Var != null) {
                        dp = AndroidUtilities.dp(24.0f);
                        dp2 = AndroidUtilities.dp(f15);
                        imageReceiver.setRoundRadius(AndroidUtilities.dp(f15));
                    } else {
                        dp = AndroidUtilities.dp(20.0f);
                        dp2 = AndroidUtilities.dp(8.0f);
                        imageReceiver.setRoundRadius(0);
                    }
                    int i14 = (int) ((this.B - dp) / f16);
                    if (this.S) {
                        dp2 -= AndroidUtilities.dp(f16);
                    }
                    int i15 = ((int) f7) + dp2;
                    int i16 = ((int) f10) + i14;
                    rect.set(i15, i16, i15 + dp, dp + i16);
                    f(canvas, rect, f12);
                }
                if (p6Var != null || p6Var.i() <= 0.0f) {
                    f18 = 0.0f;
                } else {
                    canvas.save();
                    if (!this.u || i()) {
                        f21 = this.u ? 9 : 8;
                    } else {
                        f21 = 10.0f;
                    }
                    canvas.translate(AndroidUtilities.dp(f21) + f7 + AndroidUtilities.dp(20.0f) + AndroidUtilities.dp(f16), f10);
                    p6 p6Var4 = p6Var;
                    p6Var4.setBounds(0, 0, this.A, this.B);
                    p6Var4.draw(canvas);
                    p6Var4.B = (int) (f12 * 255.0f);
                    canvas.restore();
                    f18 = p6Var4.c() + (p6Var4.i() * AndroidUtilities.dp(4.0f));
                }
                if (i11 > 0 || this.S || p6Var3 == null || this.T != null) {
                    erVar = this.F;
                    if (erVar != null && e()) {
                        canvas.save();
                        if (this.u || i()) {
                            f19 = this.u ? 9 : 8;
                        } else {
                            f19 = 10.0f;
                        }
                        canvas.translate(AndroidUtilities.dp(f19) + f7 + AndroidUtilities.dp(20.0f) + AndroidUtilities.dp(r5Var == null ? f16 : 5.0f) + f18 + (!z12 ? -AndroidUtilities.dp(1.0f) : 0), f10);
                        erVar.a(canvas);
                        canvas.restore();
                    }
                } else {
                    canvas.save();
                    if (!this.u || i()) {
                        f20 = this.u ? 9 : 8;
                    } else {
                        f20 = 10.0f;
                    }
                    canvas.translate(AndroidUtilities.dp(f20) + f7 + AndroidUtilities.dp(20.0f) + AndroidUtilities.dp(r5Var == null ? f16 : 5.0f), f10 - AndroidUtilities.dp(1.0f));
                    p6Var3.setBounds(0, 0, this.A, this.B);
                    p6Var3.draw(canvas);
                    p6Var3.B = (int) (255.0f * f12);
                    canvas.restore();
                }
                if (!this.S && this.T != null) {
                    canvas.save();
                    canvas.translate(f7 + AndroidUtilities.dp(10.0f) + AndroidUtilities.dp(20.0f) + AndroidUtilities.dp(f16), f10);
                    j9Var = this.T;
                    j9Var.u = f12;
                    if (j9Var.w && j9Var.e != f11) {
                        j9Var.e = f11;
                        if (f11 == 1.0f) {
                            j9Var.n();
                            j9Var.w = false;
                        }
                    }
                    this.T.i(canvas);
                    canvas.restore();
                }
                if (z14) {
                    canvas.restore();
                    return;
                }
                return;
            }
            f15 = 6.0f;
            rectF = AndroidUtilities.rectTmp;
            float f222 = i13;
            rectF.set(f7, f10, f7 + f222, this.B + f10);
            if (a2 != 1.0f) {
            }
            f17 = this.B / f16;
            if (k() > 0.0f) {
            }
            z14 = z13;
            paint2 = paint;
            if (z10) {
                canvas.drawRoundRect(rectF, f17, f17, x22.c);
            }
            if (z18) {
            }
            if (this.Z != null) {
            }
            h(canvas, rectF, f17, paint2);
            if (this.S) {
                if (z18) {
                }
                canvas.drawCircle(rectF.right - AndroidUtilities.dp(8.4f), rectF.centerY(), AndroidUtilities.dp(2.66f), paint3);
            }
            if (z18) {
            }
            if (imageReceiver != null) {
            }
            if (p6Var != null) {
            }
            f18 = 0.0f;
            if (i11 > 0) {
            }
            erVar = this.F;
            if (erVar != null) {
                canvas.save();
                if (this.u) {
                }
                f19 = this.u ? 9 : 8;
                canvas.translate(AndroidUtilities.dp(f19) + f7 + AndroidUtilities.dp(20.0f) + AndroidUtilities.dp(r5Var == null ? f16 : 5.0f) + f18 + (!z12 ? -AndroidUtilities.dp(1.0f) : 0), f10);
                erVar.a(canvas);
                canvas.restore();
            }
            if (!this.S) {
                canvas.save();
                canvas.translate(f7 + AndroidUtilities.dp(10.0f) + AndroidUtilities.dp(20.0f) + AndroidUtilities.dp(f16), f10);
                j9Var = this.T;
                j9Var.u = f12;
                if (j9Var.w) {
                    j9Var.e = f11;
                    if (f11 == 1.0f) {
                    }
                }
                this.T.i(canvas);
                canvas.restore();
            }
            if (z14) {
            }
        } else {
            i11 = i12;
            p6Var = p6Var2;
            z12 = z17;
            p6Var3 = p6Var3;
        }
        paint = paint4;
        a2 = this.Y.a(0.1f);
        int i132 = this.A;
        if (i11 <= 0) {
        }
        if (f11 != f14) {
        }
        f15 = 6.0f;
        rectF = AndroidUtilities.rectTmp;
        float f2222 = i132;
        rectF.set(f7, f10, f7 + f2222, this.B + f10);
        if (a2 != 1.0f) {
        }
        f17 = this.B / f16;
        if (k() > 0.0f) {
        }
        z14 = z13;
        paint2 = paint;
        if (z10) {
        }
        if (z18) {
        }
        if (this.Z != null) {
        }
        h(canvas, rectF, f17, paint2);
        if (this.S) {
        }
        if (z18) {
        }
        if (imageReceiver != null) {
        }
        if (p6Var != null) {
        }
        f18 = 0.0f;
        if (i11 > 0) {
        }
        erVar = this.F;
        if (erVar != null) {
        }
        if (!this.S) {
        }
        if (z14) {
        }
    }

    public boolean e() {
        int i10 = this.w;
        return ((i10 == 0 || (this.S && !this.u && i10 == 1)) && this.F.l == 1.0f) ? false : true;
    }

    public final void f(Canvas canvas, Rect rect, float f7) {
        ImageReceiver imageReceiver;
        boolean z10;
        r5 r5Var = this.D;
        if (r5Var == null || (imageReceiver = r5Var.k) == null) {
            imageReceiver = this.C;
        }
        if (imageReceiver != null && rect != null) {
            imageReceiver.setImageCoords(rect);
        }
        r5 r5Var2 = this.D;
        if (r5Var2 != null && this.E != this.N) {
            int i10 = this.N;
            this.E = i10;
            r5Var2.setColorFilter(new PorterDuffColorFilter(i10, PorterDuff.Mode.SRC_IN));
        }
        if (!this.l || (!this.m && this.j <= 1 && n() && this.Q)) {
            imageReceiver.setAlpha(0.0f);
            imageReceiver.draw(canvas);
            this.n = false;
            return;
        }
        ImageReceiver l4 = l();
        if (l4 != null) {
            z10 = l4.getLottieAnimation() == null || !l4.getLottieAnimation().u();
            if (f7 != 1.0f) {
                l4.setAlpha(f7);
                if (f7 <= 0.0f) {
                    l4.onDetachedFromWindow();
                    o();
                }
            } else if (l4.getLottieAnimation() != null && !l4.getLottieAnimation().k0) {
                float alpha = l4.getAlpha() - 0.08f;
                if (alpha <= 0.0f) {
                    l4.onDetachedFromWindow();
                    o();
                } else {
                    l4.setAlpha(alpha);
                }
                this.W.invalidate();
                z10 = true;
            }
            l4.setImageCoords(imageReceiver.getImageX() - (imageReceiver.getImageWidth() / 2.0f), imageReceiver.getImageY() - (imageReceiver.getImageWidth() / 2.0f), imageReceiver.getImageWidth() * 2.0f, imageReceiver.getImageHeight() * 2.0f);
            l4.draw(canvas);
        } else {
            z10 = true;
        }
        if (z10) {
            imageReceiver.draw(canvas);
        }
        this.n = true;
    }

    public final boolean g(Canvas canvas, float f7, float f10) {
        ee eeVar = this.Z;
        if (eeVar == null) {
            return false;
        }
        RectF rectF = eeVar.c;
        if (!LiteMode.isEnabled(LiteMode.FLAG_ANIMATED_EMOJI_REACTIONS) || !LiteMode.isEnabled(131072)) {
            return false;
        }
        RectF rectF2 = AndroidUtilities.rectTmp;
        rectF2.set(f7, f10, this.A + f7, this.B + f10);
        float f11 = this.B / 2.0f;
        rectF.set(rectF2);
        rectF.inset(-AndroidUtilities.dp(4.0f), -AndroidUtilities.dp(4.0f));
        eeVar.g(rectF);
        boolean d = eeVar.d();
        eeVar.a(canvas, i0.a.f(k(), i0.a.o(this.J, 255), i0.a.f(0.4f, this.M, i0.a.o(this.J, 255))));
        if (this.Q) {
            Path path = this.d0;
            path.rewind();
            path.addRoundRect(rectF2, f11, f11, Path.Direction.CW);
            canvas.save();
            canvas.clipPath(path);
            eeVar.a(canvas, this.K);
            canvas.restore();
        }
        return d;
    }

    public final void h(Canvas canvas, RectF rectF, float f7, Paint paint) {
        if (!this.S) {
            canvas.drawRoundRect(rectF, f7, f7, paint);
            return;
        }
        RectF rectF2 = this.b0;
        float f10 = rectF2.left;
        float f11 = rectF.left;
        Path path = this.d0;
        if (f10 != f11 || rectF2.top != rectF.top || rectF2.right != rectF.right || rectF2.bottom != rectF.bottom) {
            rectF2.set(rectF);
            j1.h(rectF2, this.c0, path);
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
            Collections.sort(arrayList, j1.c0);
            if (this.T == null) {
                j9 j9Var = new j9(this.W, false);
                this.T = j9Var;
                j9Var.v = 250L;
                bs bsVar = li.m.V;
                j9Var.s = AndroidUtilities.dp(20.0f);
                this.T.p = AndroidUtilities.dp(100.0f);
                j9 j9Var2 = this.T;
                j9Var2.o = this.B;
                j9Var2.j(AndroidUtilities.dp(22.0f));
            }
            if (this.e0) {
                this.T.g();
            }
            for (int i10 = 0; i10 < arrayList.size() && i10 != 3; i10++) {
                this.T.l(i10, (TLObject) arrayList.get(i10), this.V);
            }
            this.T.b(false, true);
        }
    }

    public final void q() {
        ImageReceiver imageReceiver;
        r5 r5Var = this.D;
        if (r5Var == null || (imageReceiver = r5Var.k) == null) {
            imageReceiver = this.C;
        }
        if (imageReceiver != null) {
            yj0 lottieAnimation = imageReceiver.getLottieAnimation();
            if (lottieAnimation != null) {
                lottieAnimation.H(true);
                return;
            }
            e6 animation = imageReceiver.getAnimation();
            if (animation != null) {
                animation.start();
            }
        }
    }

    public final void r() {
        ImageReceiver imageReceiver;
        r5 r5Var = this.D;
        if (r5Var == null || (imageReceiver = r5Var.k) == null) {
            imageReceiver = this.C;
        }
        if (imageReceiver != null) {
            yj0 lottieAnimation = imageReceiver.getLottieAnimation();
            if (lottieAnimation != null) {
                lottieAnimation.stop();
                return;
            }
            e6 animation = imageReceiver.getAnimation();
            if (animation != null) {
                animation.stop();
            }
        }
    }

    public void s(float f7) {
        this.N = i0.a.f(f7, this.i, i0.a.f(k(), this.K, this.M));
        int f10 = i0.a.f(f7, this.g, i0.a.f(k(), this.J, this.L));
        this.O = f10;
        this.P = i0.a.f(f7, this.h, AndroidUtilities.computePerceivedBrightness(f10) > 0.8f ? 0 : 1526726655);
    }

    public void o() {
    }
}
