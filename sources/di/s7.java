package di;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.view.View;
import android.widget.TextView;
import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.gc;
import org.telegram.messenger.ic;
import org.telegram.messenger.id;
import org.telegram.messenger.p10;
import org.telegram.messenger.qp;
import org.telegram.messenger.qs;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.e10;
import org.telegram.ui.Components.hc;
import org.telegram.ui.Components.my0;
import org.telegram.ui.Components.wp;
import org.telegram.ui.Components.wq;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public abstract class s7 {
    public static e10 b;
    public static e10 c;
    public static e10 d;
    public static Paint e;
    public static RectF f;
    public static Paint g;
    public static Paint h;
    public static my0 i;
    public static int j;
    public static BitmapDrawable m;
    public static final e10[] a = new e10[2];
    public static final Paint[] k = new Paint[2];
    public static final int[] l = new int[2];
    public static final RectF n = new RectF();
    public static final androidx.emoji2.text.n o = new androidx.emoji2.text.n(2);
    public static final RectF p = new RectF();
    public static final Path q = new Path();
    public static final Matrix r = new Matrix();
    public static final PathMeasure s = new PathMeasure();
    public static final Path t = new Path();

    public static void a(org.telegram.ui.ActionBar.m5 m5Var) {
        String M0 = id.M0(2131743800, null);
        if (M0.indexOf("…") <= 0) {
            m5Var.l(M0, false);
            return;
        }
        SpannableStringBuilder valueOf = SpannableStringBuilder.valueOf(M0);
        w9 w9Var = new w9();
        valueOf.setSpan(w9Var, valueOf.length() - 1, valueOf.length(), 0);
        w9Var.a = m5Var;
        w9Var.n = true;
        m5Var.l(valueOf, false);
    }

    public static void b(TL_stories.StoryItem storyItem, TLRPC.User user) {
        if (user == null || storyItem.dialogId != p10.i(p10.s0).n || v(storyItem)) {
            return;
        }
        if (storyItem.views == null) {
            storyItem.views = new TL_stories.TL_storyViews();
        }
        TL_stories.StoryViews storyViews = storyItem.views;
        if (storyViews.views_count == 0) {
            storyViews.views_count = 1;
            storyViews.recent_viewers.add(Long.valueOf(user.id));
        }
    }

    public static void c(org.telegram.ui.ActionBar.h6 h6Var) {
        if (e == null) {
            Paint paint = new Paint(1);
            e = paint;
            paint.setStyle(Paint.Style.STROKE);
            e.setStrokeWidth(org.telegram.messenger.g0.N(1.3f));
            e.setStrokeCap(Paint.Cap.ROUND);
        }
        int w02 = org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.d6, h6Var);
        if (j != w02) {
            j = w02;
            float B = org.telegram.messenger.g0.B(w02);
            if (B >= 0.721f) {
                e.setColor(i0.a.f(0.2f, w02, -16777216));
            } else if (B < 0.25f) {
                e.setColor(i0.a.f(0.2f, w02, -1));
            } else {
                e.setColor(i0.a.f(0.44f, w02, -1));
            }
        }
    }

    public static void d(org.telegram.ui.ActionBar.h6 h6Var, boolean z9) {
        Paint[] paintArr = k;
        if (paintArr[z9 ? 1 : 0] == null) {
            Paint paint = new Paint(1);
            paintArr[z9 ? 1 : 0] = paint;
            paint.setStyle(Paint.Style.STROKE);
            paintArr[z9 ? 1 : 0].setStrokeWidth(org.telegram.messenger.g0.N(1.3f));
            paintArr[z9 ? 1 : 0].setStrokeCap(Paint.Cap.ROUND);
        }
        int w02 = org.telegram.ui.ActionBar.m6.w0(!z9 ? org.telegram.ui.ActionBar.m6.s8 : org.telegram.ui.ActionBar.m6.M8, h6Var);
        int[] iArr = l;
        if (iArr[z9 ? 1 : 0] != w02) {
            iArr[z9 ? 1 : 0] = w02;
            float B = org.telegram.messenger.g0.B(w02);
            if (B >= 0.721f) {
                paintArr[z9 ? 1 : 0].setColor(i0.a.f(0.2f, w02, -16777216));
            } else if (B < 0.25f) {
                paintArr[z9 ? 1 : 0].setColor(i0.a.f(0.2f, w02, -1));
            } else {
                paintArr[z9 ? 1 : 0].setColor(i0.a.f(0.44f, w02, -1));
            }
        }
    }

    public static SpannableStringBuilder e(Object[] objArr, int i7, boolean z9) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) "d ").append((CharSequence) id.a0(null, null, i7, objArr));
        wp wpVar = new wp(R.drawable.msg_mini_bomb, 0);
        if (z9) {
            wpVar.H = 0.8f;
            wpVar.I = 0.8f;
        } else {
            wpVar.n = -1;
        }
        spannableStringBuilder.setSpan(wpVar, 0, 1, 0);
        return spannableStringBuilder;
    }

    public static SpannableStringBuilder f() {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) "d ").append((CharSequence) id.M0(2131744735, null));
        spannableStringBuilder.setSpan(new wp(R.drawable.msg_mini_replystory2, 0), 0, 1, 0);
        return spannableStringBuilder;
    }

    public static void g(Canvas canvas, RectF rectF, Paint paint, float f10, float f11, float f12, float f13) {
        float f14;
        boolean z9;
        float f15 = f11 - f10;
        if (f10 >= f12 || f11 >= f12 + f15) {
            f14 = f10;
            z9 = false;
        } else {
            f14 = f10;
            canvas.drawArc(rectF, f14, Math.min(f11, f12) - f10, false, paint);
            z9 = true;
        }
        float max = Math.max(f14, f13);
        float min = Math.min(f11, f12 + 360.0f);
        if (min >= max) {
            canvas.drawArc(rectF, max, min - max, false, paint);
        } else {
            if (z9) {
                return;
            }
            if (f14 <= f12 || f11 >= f13) {
                canvas.drawArc(rectF, f14, f15, false, paint);
            }
        }
    }

    public static void h(long j3, Canvas canvas, ImageReceiver imageReceiver, o7 o7Var) {
        i(j3, canvas, imageReceiver, p10.i(p10.s0).e() != j3 && qp.s1(p10.s0).P1().K(j3), o7Var);
    }

    /* JADX WARN: Code restructure failed: missing block: B:198:0x0454, code lost:
    
        if (r1 == 1) goto L236;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x0269, code lost:
    
        if (r35.B == 1.0f) goto L143;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:152:0x04e8  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x04ef  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x0509  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x0525  */
    /* JADX WARN: Removed duplicated region for block: B:167:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:168:0x04ea  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x0461  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x0497  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x04be A[LOOP:0: B:184:0x04ba->B:186:0x04be, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:190:0x04a5  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x0475  */
    /* JADX WARN: Type inference failed for: r9v3 */
    /* JADX WARN: Type inference failed for: r9v4, types: [int] */
    /* JADX WARN: Type inference failed for: r9v7 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void i(long j3, Canvas canvas, ImageReceiver imageReceiver, boolean z9, o7 o7Var) {
        int r10;
        int i7;
        float W1;
        float f10;
        Canvas canvas2;
        int i10;
        z6 z6Var;
        float f11;
        float f12;
        float f13;
        int i11;
        RectF rectF;
        int i12;
        float f14;
        ImageReceiver imageReceiver2;
        o7 o7Var2;
        boolean z10;
        z6 z6Var2;
        ImageReceiver imageReceiver3;
        o7 o7Var3;
        RectF rectF2;
        boolean z11;
        boolean z12;
        ic icVar;
        float f15;
        Paint paint;
        Paint paint2;
        Paint paint3;
        Paint paint4;
        float N;
        float f16;
        float f17;
        float z13;
        ?? r92;
        Paint paint5;
        Paint paint6;
        Paint paint7;
        Paint paint8;
        float N2;
        float f18;
        float z14;
        e10 e10Var;
        float z15;
        z6 P1 = qp.s1(p10.s0).P1();
        boolean z16 = o7Var.b;
        RectF rectF3 = o7Var.F;
        boolean z17 = o7Var.E;
        if (o7Var.x != j3) {
            o7Var.x = j3;
            o7Var.g();
            z16 = false;
        }
        boolean z18 = P1.j.get(j3, 0) == 1;
        boolean z19 = org.telegram.messenger.t3.b0(p10.s0, j3) && !o7Var.D;
        boolean z20 = o7Var.r ? !P1.h.isEmpty() : z9;
        if (o7Var.d != null) {
            P1.E(o7Var.c, j3);
            z18 = false;
        }
        if (z18) {
            if (P1.K(j3)) {
                r10 = 3;
                z16 = false;
                i7 = 2;
            } else {
                i7 = r(P1, j3);
                r10 = 3;
                z16 = false;
            }
        } else if (!z20) {
            r10 = r(P1, j3);
            i7 = r10;
        } else if (o7Var.a) {
            r10 = 2;
            i7 = 2;
        } else {
            int E = P1.E(o7Var.c, j3);
            i7 = E;
            r10 = E == 0 ? 2 : 1;
        }
        int i13 = o7Var.z;
        if (i13 != 0) {
            r10 = i13;
            i7 = r10;
        }
        int i14 = o7Var.y;
        if (i14 != r10) {
            if (i14 == 3) {
                z16 = true;
            }
            if (r10 == 3) {
                o7Var.q = i7;
                o7Var.t = 0.0f;
            }
            if (z16) {
                o7Var.A = i14;
                o7Var.y = r10;
                o7Var.B = 0.0f;
            } else {
                o7Var.y = r10;
                o7Var.B = 1.0f;
            }
        }
        hc hcVar = o7Var.H;
        float a10 = hcVar != null ? hcVar.a(0.08f) : 1.0f;
        if (o7Var.C != z18 && z18) {
            o7Var.K = 1.0f;
            o7Var.L = false;
        }
        o7Var.C = z18;
        if (o7Var.y == 0 && o7Var.B == 1.0f) {
            imageReceiver.A0(rectF3);
            canvas.save();
            canvas.scale(a10, a10, rectF3.centerX(), rectF3.centerY());
            imageReceiver.h(canvas, null);
            canvas.restore();
            return;
        }
        int save = canvas.save();
        if (a10 != 1.0f) {
            canvas.scale(a10, a10, rectF3.centerX(), rectF3.centerY());
        }
        float f19 = P1.H(o7Var.x) ? o7Var.e : 0.0f;
        float f20 = o7Var.B;
        if (f20 != 1.0f) {
            f20 = wq.f.getInterpolation(f20);
        }
        float f21 = f20;
        if (!z17 || o7Var.v) {
            int i15 = o7Var.A;
            int i16 = o7Var.q;
            if (i15 == 3) {
                i15 = i16;
            }
            int L = i15 == 2 ? org.telegram.messenger.g0.L(3.0f) : i15 == 1 ? org.telegram.messenger.g0.L(4.0f) : 0;
            int i17 = o7Var.y;
            int i18 = o7Var.q;
            if (i17 == 3) {
                i17 = i18;
            }
            W1 = org.telegram.messenger.g0.W1(o7Var.B, L, i17 == 2 ? org.telegram.messenger.g0.L(3.0f) : i17 == 1 ? org.telegram.messenger.g0.L(4.0f) : 0);
        } else {
            W1 = 0.0f;
        }
        RectF rectF4 = n;
        if (W1 == 0.0f) {
            imageReceiver.A0(rectF3);
        } else {
            rectF4.set(rectF3);
            rectF4.inset(W1, W1);
            imageReceiver.A0(rectF4);
        }
        if (f19 > 0.0f) {
            f12 = 1.0f;
            f10 = W1;
            i11 = i7;
            z6Var = P1;
            rectF = rectF4;
            i10 = save;
            f11 = f19;
            i12 = 3;
            f13 = 0.08f;
            canvas2 = canvas;
            canvas2.saveLayerAlpha(rectF4.left - org.telegram.messenger.g0.L(15.0f), rectF4.top - org.telegram.messenger.g0.L(15.0f), rectF4.right + org.telegram.messenger.g0.L(15.0f), rectF4.bottom + org.telegram.messenger.g0.L(15.0f), qs.e4, 31);
        } else {
            f10 = W1;
            canvas2 = canvas;
            i10 = save;
            z6Var = P1;
            f11 = f19;
            f12 = 1.0f;
            f13 = 0.08f;
            i11 = i7;
            rectF = rectF4;
            i12 = 3;
        }
        int i19 = o7Var.A;
        e10[] e10VarArr = a;
        if ((i19 == 1 && o7Var.B != f12) || o7Var.y == 1) {
            if (i11 == 2) {
                o(imageReceiver);
                e10Var = b;
            } else if (i11 == i12) {
                q(imageReceiver);
                e10Var = c;
            } else {
                t(imageReceiver, z17);
                e10Var = e10VarArr[z17 ? 1 : 0];
            }
            boolean z21 = o7Var.A == 1 && o7Var.B != f12;
            float f22 = (!z17 || o7Var.v) ? 0.0f : -org.telegram.messenger.g0.L(4.0f);
            if (z21) {
                z15 = (org.telegram.messenger.g0.L(5.0f) * f21) + f22;
                e10Var.c.setAlpha((int) ((f12 - f21) * o7Var.u * 255.0f));
            } else {
                e10Var.c.setAlpha((int) (o7Var.u * 255.0f * f21));
                z15 = com.google.android.recaptcha.internal.a.z(f12, f21, org.telegram.messenger.g0.L(5.0f), f22);
            }
            float f23 = z15 + o7Var.G;
            rectF.set(rectF3);
            rectF.inset(f23, f23);
            View view = imageReceiver.e;
            j(canvas2, o7Var, e10Var.c, z19);
        }
        int i20 = o7Var.A;
        Paint[] paintArr = k;
        if (i20 == 2) {
            f14 = 1.0f;
        } else {
            f14 = 1.0f;
        }
        if (o7Var.y != 2) {
            imageReceiver2 = imageReceiver;
            o7Var2 = o7Var;
            z10 = z19;
            z6Var2 = z6Var;
            if ((o7Var2.A == i12 || o7Var2.B == 1.0f) && o7Var2.y != i12) {
                imageReceiver3 = imageReceiver2;
                o7Var3 = o7Var2;
                rectF2 = rectF;
                z11 = true;
                z12 = false;
            } else {
                if (o7Var2.q == 1) {
                    t(imageReceiver2, z17);
                    paint = e10VarArr[z17 ? 1 : 0].c;
                } else if (z17) {
                    d(o7Var2.J, o7Var2.o);
                    paint = paintArr[o7Var2.o ? 1 : 0];
                } else {
                    c(o7Var2.J);
                    paint = e;
                }
                paint.setAlpha((int) (f21 * 255.0f));
                if (o7Var2.a) {
                    paint2 = t(imageReceiver2, z17);
                    paint2.setAlpha((int) (o7Var2.u * 255.0f));
                    Paint o4 = o(imageReceiver2);
                    o4.setAlpha((int) (o7Var2.u * 255.0f));
                    Paint q10 = q(imageReceiver2);
                    q10.setAlpha((int) (o7Var2.u * 255.0f));
                    c(o7Var2.J);
                    paint4 = o4;
                    paint3 = q10;
                } else {
                    paint2 = null;
                    paint3 = null;
                    paint4 = null;
                }
                if (o7Var2.a) {
                    if (z17 && !o7Var2.v) {
                        N = org.telegram.messenger.g0.N(3.5f);
                        f16 = -N;
                    }
                    f16 = 0.0f;
                } else {
                    if (z17 && !o7Var2.v) {
                        N = org.telegram.messenger.g0.N(2.7f);
                        f16 = -N;
                    }
                    f16 = 0.0f;
                }
                if (o7Var2.A != i12 || o7Var2.B == 1.0f) {
                    paint.setAlpha((int) (o7Var2.u * 255.0f * f21));
                    f17 = 1.0f;
                    z13 = com.google.android.recaptcha.internal.a.z(1.0f, f21, org.telegram.messenger.g0.L(5.0f), f16);
                } else {
                    z13 = (org.telegram.messenger.g0.L(7.0f) * f21) + f16;
                    paint.setAlpha((int) ((1.0f - f21) * o7Var2.u * 255.0f));
                    f17 = 1.0f;
                }
                float f24 = z13 + o7Var2.G;
                rectF.set(rectF3);
                rectF.inset(f24, f24);
                boolean z22 = o7Var2.a;
                if (z22 && o7Var2.y == i12) {
                    float f25 = o7Var2.t;
                    if (f25 != f17) {
                        float f26 = f25 + f13;
                        o7Var2.t = f26;
                        if (f26 > f17) {
                            o7Var2.t = f17;
                        }
                        float f27 = o7Var2.e;
                        o7Var2.e = f17 - o7Var2.t;
                        m(canvas2, z6Var2, imageReceiver2, o7Var2, paint, paint2, paint3, paint4, z10);
                        imageReceiver3 = imageReceiver2;
                        o7Var3 = o7Var2;
                        o7Var3.e = f27;
                        if (imageReceiver3.e != null) {
                            imageReceiver3.invalidate();
                            imageReceiver3.e.invalidate();
                        }
                        canvas2 = canvas;
                        rectF2 = rectF;
                        icVar = null;
                        z11 = true;
                        z12 = false;
                        imageReceiver3.h(canvas2, icVar);
                        o7Var3.w = f11 > 0.5f ? z11 : z12;
                        if (f19 > 0.0f) {
                            float f28 = f10 + o7Var3.G;
                            rectF2.set(rectF3);
                            rectF2.inset(f28, f28);
                            k(f11, 0.0f, canvas2, rectF2, imageReceiver3.Q0);
                        }
                        f15 = o7Var3.B;
                        if (f15 != 1.0f) {
                            float f29 = (org.telegram.messenger.g0.t / 250.0f) + f15;
                            o7Var3.B = f29;
                            if (f29 > 1.0f) {
                                o7Var3.B = 1.0f;
                            }
                            if (imageReceiver3.e != null) {
                                imageReceiver3.invalidate();
                                imageReceiver3.e.invalidate();
                            }
                        }
                        if (i10 != 0) {
                            canvas2.restoreToCount(i10);
                            return;
                        }
                        return;
                    }
                }
                o7Var3 = o7Var2;
                Paint paint9 = paint3;
                Paint paint10 = paint4;
                imageReceiver3 = imageReceiver2;
                if (z22) {
                    int E2 = z6Var2.E(0, o7Var3.x);
                    if (E2 == 2) {
                        paint2 = paint10;
                    } else if (E2 == i12) {
                        paint2 = paint9;
                    }
                    View view2 = imageReceiver3.e;
                    if (o7Var3.L) {
                        z12 = false;
                        float f30 = o7Var3.K - 0.016f;
                        o7Var3.K = f30;
                        if (f30 < 0.0f) {
                            o7Var3.K = 0.0f;
                            z11 = true;
                            o7Var3.L = true;
                            o7Var3.M += 1.152f;
                            view2.invalidate();
                            if (o7Var3.L) {
                                rectF2 = rectF;
                                canvas.drawArc(rectF2, o7Var3.M, o7Var3.K * 360.0f, false, paint2);
                            } else {
                                rectF2 = rectF;
                                canvas.drawArc(rectF2, o7Var3.M + 360.0f, o7Var3.K * (-360.0f), false, paint2);
                            }
                            for (r92 = z12; r92 < 16; r92++) {
                                float f31 = (((float) r92) * 22.5f) + 10.0f;
                                canvas.drawArc(rectF2, o7Var3.M + f31, ((22.5f + f31) - 10.0f) - f31, false, paint2);
                            }
                            canvas2 = canvas;
                        }
                    } else {
                        float f32 = o7Var3.K + 0.016f;
                        o7Var3.K = f32;
                        if (f32 >= 1.0f) {
                            o7Var3.K = 1.0f;
                            z12 = false;
                            o7Var3.L = false;
                        } else {
                            z12 = false;
                        }
                    }
                    z11 = true;
                    o7Var3.M += 1.152f;
                    view2.invalidate();
                    if (o7Var3.L) {
                    }
                    while (r92 < 16) {
                    }
                    canvas2 = canvas;
                }
                paint2 = paint;
                View view22 = imageReceiver3.e;
                if (o7Var3.L) {
                }
                z11 = true;
                o7Var3.M += 1.152f;
                view22.invalidate();
                if (o7Var3.L) {
                }
                while (r92 < 16) {
                }
                canvas2 = canvas;
            }
            icVar = null;
            imageReceiver3.h(canvas2, icVar);
            o7Var3.w = f11 > 0.5f ? z11 : z12;
            if (f19 > 0.0f) {
            }
            f15 = o7Var3.B;
            if (f15 != 1.0f) {
            }
            if (i10 != 0) {
            }
        }
        boolean z23 = i20 == 2 && o7Var.B != f14;
        if (z17) {
            d(o7Var.J, o7Var.o);
            paint5 = paintArr[o7Var.o ? 1 : 0];
        } else {
            c(o7Var.J);
            paint5 = e;
        }
        Paint paint11 = paint5;
        if (o7Var.a) {
            paint6 = t(imageReceiver, z17);
            paint6.setAlpha((int) (o7Var.u * 255.0f));
            Paint o10 = o(imageReceiver);
            o10.setAlpha((int) (o7Var.u * 255.0f));
            Paint q11 = q(imageReceiver);
            q11.setAlpha((int) (o7Var.u * 255.0f));
            c(o7Var.J);
            paint8 = o10;
            paint7 = q11;
        } else {
            paint6 = null;
            paint7 = null;
            paint8 = null;
        }
        if (o7Var.a) {
            if (z17 && !o7Var.v) {
                N2 = org.telegram.messenger.g0.N(3.5f);
                f18 = -N2;
            }
            f18 = 0.0f;
        } else {
            if (z17 && !o7Var.v) {
                N2 = org.telegram.messenger.g0.N(2.7f);
                f18 = -N2;
            }
            f18 = 0.0f;
        }
        if (z23) {
            z14 = (org.telegram.messenger.g0.L(5.0f) * f21) + f18;
            paint11.setAlpha((int) ((1.0f - f21) * o7Var.u * 255.0f));
        } else {
            paint11.setAlpha((int) (o7Var.u * 255.0f * f21));
            z14 = com.google.android.recaptcha.internal.a.z(1.0f, f21, org.telegram.messenger.g0.L(5.0f), f18);
        }
        float f33 = z14 + o7Var.G;
        rectF.set(rectF3);
        rectF.inset(f33, f33);
        if (o7Var.a) {
            imageReceiver2 = imageReceiver;
            o7Var2 = o7Var;
            z10 = z19;
            z6Var2 = z6Var;
            m(canvas2, z6Var2, imageReceiver2, o7Var2, paint11, paint6, paint7, paint8, z10);
        } else {
            imageReceiver2 = imageReceiver;
            o7Var2 = o7Var;
            z10 = z19;
            z6Var2 = z6Var;
            View view3 = imageReceiver2.e;
            j(canvas2, o7Var2, paint11, z10);
        }
        if (o7Var2.A == i12) {
        }
        imageReceiver3 = imageReceiver2;
        o7Var3 = o7Var2;
        rectF2 = rectF;
        z11 = true;
        z12 = false;
        icVar = null;
        imageReceiver3.h(canvas2, icVar);
        o7Var3.w = f11 > 0.5f ? z11 : z12;
        if (f19 > 0.0f) {
        }
        f15 = o7Var3.B;
        if (f15 != 1.0f) {
        }
        if (i10 != 0) {
        }
    }

    public static void j(Canvas canvas, o7 o7Var, Paint paint, boolean z9) {
        RectF rectF = n;
        if (z9) {
            RectF rectF2 = p;
            rectF2.set(rectF);
            rectF2.inset(org.telegram.messenger.g0.L(0.5f), org.telegram.messenger.g0.L(0.5f));
            canvas.drawRoundRect(rectF2, org.telegram.messenger.g0.L(18.0f), org.telegram.messenger.g0.L(18.0f), paint);
            return;
        }
        float f10 = o7Var.f;
        if (f10 == 0.0f) {
            canvas.drawCircle(rectF.centerX(), rectF.centerY(), rectF.width() / 2.0f, paint);
        } else {
            canvas.drawArc(rectF, (f10 / 2.0f) + 360.0f, 360.0f - f10, false, paint);
        }
    }

    public static void k(float f10, float f11, Canvas canvas, RectF rectF, boolean z9) {
        Canvas canvas2;
        if (i == null) {
            i = new my0(id.M0(2131748825, null), 9.66f, org.telegram.messenger.g0.o());
        }
        if (g == null) {
            Paint paint = new Paint(1);
            g = paint;
            paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
        }
        if (h == null) {
            h = new Paint(1);
        }
        if (f == null) {
            f = new RectF();
        }
        h.setColor(org.telegram.ui.ActionBar.m6.r1(f10, org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.cl, false)));
        float W1 = org.telegram.messenger.g0.W1(f11, org.telegram.messenger.g0.L(4.66f), org.telegram.messenger.g0.L(7.0f));
        float k10 = i.k() + W1 + W1;
        float W12 = org.telegram.messenger.g0.W1(f11, org.telegram.messenger.g0.L(15.0f), org.telegram.messenger.g0.L(18.0f));
        float L = org.telegram.messenger.g0.L(2.0f);
        canvas.save();
        float f12 = k10 / 2.0f;
        float f13 = 0.8f * W12;
        float f14 = W12 * 0.2f;
        f.set((rectF.centerX() - f12) - L, (rectF.bottom - f13) - L, rectF.centerX() + f12 + L, rectF.bottom + f14 + L);
        float T1 = org.telegram.messenger.g0.T1(0.7f, 1.0f, f10);
        canvas.scale(T1, T1, f.centerX(), f.centerY());
        RectF rectF2 = f;
        org.telegram.messenger.g0.j3(rectF2, f10, rectF2.centerX(), rectF2.centerY());
        RectF rectF3 = f;
        canvas.drawRoundRect(rectF3, rectF3.height() / 2.0f, f.height() / 2.0f, g);
        if (z9) {
            f.set(rectF.centerX() - f12, rectF.bottom - f13, rectF.centerX() + f12, rectF.bottom + f14);
            RectF rectF4 = f;
            canvas.drawRoundRect(rectF4, rectF4.height() / 2.0f, f.height() / 2.0f, h);
            my0 my0Var = i;
            RectF rectF5 = f;
            canvas2 = canvas;
            my0Var.c(rectF5.left + W1, rectF5.centerY(), f10, -1, canvas2);
        } else {
            canvas2 = canvas;
        }
        canvas2.restore();
    }

    public static void l(Canvas canvas, RectF rectF, Paint paint, float f10, float f11, o7 o7Var, boolean z9) {
        if (z9) {
            float height = rectF.height() * 0.32f;
            float f12 = ((((int) f10) / 90) * 90) + 90;
            float f13 = (-199.0f) + f12;
            Path path = q;
            path.rewind();
            path.addRoundRect(rectF, height, height, Path.Direction.CW);
            Matrix matrix = r;
            matrix.reset();
            matrix.postRotate(f12, rectF.centerX(), rectF.centerY());
            path.transform(matrix);
            PathMeasure pathMeasure = s;
            pathMeasure.setPath(path, false);
            float length = pathMeasure.getLength();
            Path path2 = t;
            path2.reset();
            pathMeasure.getSegment(((f10 - f13) / 360.0f) * length, length * ((f11 - f13) / 360.0f), path2, true);
            path2.rLineTo(0.0f, 0.0f);
            canvas.drawPath(path2, paint);
            return;
        }
        if (!o7Var.k) {
            if (o7Var.l) {
                float f14 = o7Var.f;
                g(canvas, rectF, paint, f10, f11, ((-f14) / 2.0f) + 180.0f, (f14 / 2.0f) + 180.0f);
                return;
            } else if (f10 < 90.0f) {
                g(canvas, rectF, paint, f10, f11, o7Var.g, o7Var.h);
                return;
            } else {
                g(canvas, rectF, paint, f10, f11, -o7Var.i, o7Var.j);
                return;
            }
        }
        boolean z10 = o7Var.m;
        if (!z10 && !o7Var.l) {
            if (f10 < 90.0f) {
                float f15 = o7Var.f;
                g(canvas, rectF, paint, f10, f11, (-f15) / 2.0f, f15 / 2.0f);
                return;
            } else {
                float f16 = o7Var.f;
                g(canvas, rectF, paint, f10, f11, ((-f16) / 2.0f) + 180.0f, (f16 / 2.0f) + 180.0f);
                return;
            }
        }
        if (o7Var.l) {
            float f17 = o7Var.f;
            g(canvas, rectF, paint, f10, f11, ((-f17) / 2.0f) + 180.0f, (f17 / 2.0f) + 180.0f);
        } else if (!z10) {
            canvas.drawArc(rectF, f10, f11 - f10, false, paint);
        } else {
            float f18 = o7Var.f;
            g(canvas, rectF, paint, f10, f11, (-f18) / 2.0f, f18 / 2.0f);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:90:0x01a4, code lost:
    
        if (r4 == 1) goto L112;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void m(Canvas canvas, z6 z6Var, ImageReceiver imageReceiver, o7 o7Var, Paint paint, Paint paint2, Paint paint3, Paint paint4, boolean z9) {
        Paint paint5;
        RectF rectF;
        int max;
        char c10;
        Paint paint6;
        o7 o7Var2 = o7Var;
        org.telegram.ui.ActionBar.h6 h6Var = o7Var2.J;
        boolean z10 = o7Var2.E;
        c(h6Var);
        d(o7Var2.J, o7Var2.o);
        long j3 = o7Var2.s;
        int i7 = 0;
        int E = j3 != 0 ? z6Var.E(0, j3) : z6Var.E(0, o7Var2.x);
        int i10 = 2;
        o7Var2.n = E == 0 ? 2 : 1;
        TL_stories.PeerStories y10 = z6Var.y(o7Var2.x);
        ArrayList arrayList = z6Var.h;
        if (y10 == null) {
            y10 = z6Var.z(o7Var2.x);
        }
        TL_stories.PeerStories peerStories = y10;
        int size = o7Var2.r ? arrayList.size() : (peerStories == null || peerStories.stories.size() == 1) ? 1 : peerStories.stories.size();
        Paint[] paintArr = k;
        if (E == 2) {
            o(imageReceiver);
            paint5 = b.c;
        } else if (E == 3) {
            q(imageReceiver);
            paint5 = c.c;
        } else if (E == 1) {
            t(imageReceiver, z10);
            paint5 = a[z10 ? 1 : 0].c;
        } else {
            paint5 = z10 ? paintArr[o7Var2.o ? 1 : 0] : e;
        }
        Paint paint7 = paint5;
        RectF rectF2 = n;
        if (size <= 1) {
            long j10 = o7Var2.x;
            TL_stories.PeerStories peerStories2 = (TL_stories.PeerStories) z6Var.i.f(j10);
            if (peerStories2 == null) {
                peerStories2 = z6Var.z(j10);
            }
            if (peerStories2 != null) {
                if (j10 != p10.i(z6Var.a).e() || Utilities.x((Collection) z6Var.b.f(j10))) {
                    int i11 = 0;
                    while (true) {
                        if (i11 >= peerStories2.stories.size()) {
                            break;
                        }
                        TL_stories.StoryItem storyItem = peerStories2.stories.get(i11);
                        if (storyItem != null) {
                            if (storyItem.media instanceof TLRPC.TL_messageMediaVideoStream) {
                                i7 = 2;
                                break;
                            } else if (storyItem.id > peerStories2.max_read_id) {
                                break;
                            }
                        }
                        i11++;
                    }
                }
                i7 = 1;
            }
            Paint paint8 = i7 == 2 ? paint3 : paint7 == b.c ? paint4 : i7 == 1 ? paint2 : paint;
            l(canvas, rectF2, paint8, -90.0f, 90.0f, o7Var2, z9);
            l(canvas, rectF2, paint8, 90.0f, 270.0f, o7Var, z9);
            float f10 = o7Var.e;
            if (f10 == 1.0f || paint8 == paint7) {
                return;
            }
            paint7.setAlpha((int) ((1.0f - f10) * 255.0f));
            l(canvas, rectF2, paint7, -90.0f, 90.0f, o7Var, z9);
            l(canvas, rectF2, paint7, 90.0f, 270.0f, o7Var, z9);
            paint7.setAlpha(qs.e4);
            return;
        }
        Paint paint9 = paint7;
        float f11 = 360.0f / size;
        float f12 = (size > 20 ? 3 : 5) * o7Var2.e;
        if (f12 > f11) {
            f12 = 0.0f;
        }
        float f13 = f12;
        if (o7Var2.r) {
            rectF = rectF2;
            max = 0;
        } else {
            rectF = rectF2;
            max = Math.max(peerStories.max_read_id, z6Var.f.get(o7Var2.x, 0));
        }
        int i12 = 0;
        while (i12 < size) {
            Paint paint10 = z10 ? paintArr[o7Var2.o ? 1 : 0] : e;
            if (o7Var2.r) {
                int E2 = z6Var.E(i7, org.telegram.messenger.m5.o(((TL_stories.PeerStories) arrayList.get((size - 1) - i12)).peer));
                if (E2 == i10) {
                    paint10 = paint4;
                    c10 = 3;
                } else {
                    c10 = 3;
                    if (E2 != 3) {
                    }
                    paint10 = paint3;
                }
            } else {
                c10 = 3;
                if (i12 < peerStories.stories.size()) {
                    if (peerStories.stories.get(i12).justUploaded || peerStories.stories.get(i12).id > max) {
                        if (!(peerStories.stories.get(i12).media instanceof TLRPC.TL_messageMediaVideoStream)) {
                            if (peerStories.stories.get(i12).close_friends) {
                                paint10 = paint4;
                            }
                        }
                        paint10 = paint3;
                    }
                }
                paint10 = paint2;
            }
            float f14 = (i12 * f11) - 90.0f;
            float f15 = f14 + f11;
            float f16 = f14 + f13;
            float f17 = f15 - f13;
            Paint paint11 = paint9;
            int i13 = max;
            int i14 = i12;
            Paint paint12 = paint10;
            RectF rectF3 = rectF;
            l(canvas, rectF3, paint12, f16, f17, o7Var, z9);
            RectF rectF4 = rectF3;
            if (o7Var.e == 1.0f || paint12 == paint11) {
                paint6 = paint11;
            } else {
                paint11.getStrokeWidth();
                paint11.setAlpha((int) ((1.0f - o7Var.e) * 255.0f));
                l(canvas, rectF4, paint11, f16, f17, o7Var, z9);
                rectF4 = rectF4;
                paint6 = paint11;
                paint6.setAlpha(qs.e4);
            }
            i12 = i14 + 1;
            o7Var2 = o7Var;
            rectF = rectF4;
            paint9 = paint6;
            max = i13;
            i7 = 0;
            i10 = 2;
        }
    }

    public static p7 n(TL_stories.PeerStories peerStories, Runnable runnable) {
        TL_stories.StoryItem storyItem;
        ArrayList<TLRPC.PhotoSize> arrayList;
        ArrayList<TLRPC.PhotoSize> arrayList2;
        TLRPC.Document document;
        if (peerStories == null || peerStories.stories.isEmpty() || org.telegram.messenger.m5.o(peerStories.peer) == p10.i(p10.s0).n) {
            runnable.run();
            return null;
        }
        z6 z6Var = qp.s1(p10.s0).h0;
        int i7 = z6Var.f.get(org.telegram.messenger.m5.o(peerStories.peer));
        int i10 = 0;
        while (true) {
            if (i10 >= peerStories.stories.size()) {
                storyItem = null;
                break;
            }
            if (peerStories.stories.get(i10).id > i7) {
                storyItem = peerStories.stories.get(i10);
                break;
            }
            i10++;
        }
        if (storyItem == null) {
            storyItem = peerStories.stories.get(0);
        }
        TL_stories.StoryItem storyItem2 = storyItem;
        TLRPC.MessageMedia messageMedia = storyItem2.media;
        if (messageMedia == null || messageMedia.document == null) {
            TLRPC.Photo photo = messageMedia != null ? messageMedia.photo : null;
            if (photo == null || (arrayList = photo.sizes) == null) {
                runnable.run();
                return null;
            }
            TLRPC.PhotoSize w10 = org.telegram.messenger.w7.w(arrayList, ConnectionsManager.DEFAULT_DATACENTER_ID, false, null, false);
            org.telegram.messenger.w7.G(p10.s0);
            File J = org.telegram.messenger.w7.J(w10, "", false, true);
            if (J != null && J.exists()) {
                runnable.run();
                return null;
            }
        } else {
            org.telegram.messenger.w7.G(p10.s0);
            File J2 = org.telegram.messenger.w7.J(storyItem2.media.document, "", false, true);
            if (J2 != null && J2.exists()) {
                runnable.run();
                return null;
            }
            org.telegram.messenger.w7.G(p10.s0);
            File J3 = org.telegram.messenger.w7.J(storyItem2.media.document, "", true, true);
            if (J3 != null) {
                try {
                    int lastIndexOf = J3.getName().lastIndexOf(".");
                    if (lastIndexOf > 0) {
                        File file = new File(J3.getParentFile(), J3.getName().substring(0, lastIndexOf) + ".temp");
                        if (file.exists() && file.length() > 0) {
                            runnable.run();
                            return null;
                        }
                    }
                } catch (Exception unused) {
                }
            }
        }
        long o4 = org.telegram.messenger.m5.o(peerStories.peer);
        p7 p7Var = new p7();
        p7Var.b = false;
        p7Var.a = o4;
        p7Var.c = z6Var;
        p7Var.d = new z0(20, p7Var, runnable);
        Runnable[] runnableArr = {r2};
        z0 z0Var = new z0(21, runnableArr, p7Var);
        org.telegram.messenger.g0.i3(z0Var, 3000L);
        n7 n7Var = new n7(runnableArr, p7Var);
        p7Var.e = n7Var;
        n7Var.z1 = true;
        n7Var.P();
        String s5 = s();
        TLRPC.MessageMedia messageMedia2 = storyItem2.media;
        if (messageMedia2 == null || (document = messageMedia2.document) == null) {
            TLRPC.Photo photo2 = messageMedia2 != null ? messageMedia2.photo : null;
            if (photo2 == null || (arrayList2 = photo2.sizes) == null) {
                ((z0) p7Var.d).run();
                return null;
            }
            ((n7) p7Var.e).u0(null, null, org.telegram.messenger.hc.i(org.telegram.messenger.w7.w(arrayList2, ConnectionsManager.DEFAULT_DATACENTER_ID, false, null, false), photo2), s5, null, null, null, 0L, null, storyItem2, 0);
        } else {
            ((n7) p7Var.e).r0(org.telegram.messenger.hc.b(document), rf.b.r(s5, "_pframe"), null, null, null, 0L, null, storyItem2, 0);
        }
        return p7Var;
    }

    public static Paint o(ImageReceiver imageReceiver) {
        if (b == null) {
            e10 e10Var = new e10();
            b = e10Var;
            e10Var.a = true;
            e10Var.b = true;
            e10Var.d(org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.Zk, false), org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.al, false), 0, 0);
            b.c.setStrokeWidth(org.telegram.messenger.g0.N(2.0f));
            b.c.setStyle(Paint.Style.STROKE);
            b.c.setStrokeCap(Paint.Cap.ROUND);
        }
        b.b(imageReceiver.K0, imageReceiver.L0, imageReceiver.y(), imageReceiver.A());
        return b.c;
    }

    public static Drawable p() {
        if (m == null) {
            Bitmap createBitmap = Bitmap.createBitmap(360, qs.K2, Bitmap.Config.ARGB_8888);
            createBitmap.eraseColor(-7829368);
            Canvas canvas = new Canvas(createBitmap);
            TextPaint textPaint = new TextPaint(1);
            textPaint.setTextSize(15.0f);
            textPaint.setTextAlign(Paint.Align.CENTER);
            textPaint.setColor(i0.a.o(-16777216, 100));
            canvas.drawText("expired", 180.0f, 86.0f, textPaint);
            canvas.drawText("story", 180.0f, 106.0f, textPaint);
            m = new BitmapDrawable(createBitmap);
        }
        return m;
    }

    public static Paint q(ImageReceiver imageReceiver) {
        if (c == null) {
            e10 e10Var = new e10();
            c = e10Var;
            e10Var.a = true;
            e10Var.b = true;
            e10Var.d(org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.bl, false), org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.cl, false), 0, 0);
            c.c.setStrokeWidth(org.telegram.messenger.g0.N(2.0f));
            c.c.setStyle(Paint.Style.STROKE);
            c.c.setStrokeCap(Paint.Cap.ROUND);
        }
        c.b(imageReceiver.K0, imageReceiver.L0, imageReceiver.y(), imageReceiver.A());
        return c.c;
    }

    public static int r(z6 z6Var, long j3) {
        TLRPC.TL_recentStory tL_recentStory;
        TLRPC.TL_recentStory tL_recentStory2;
        if (j3 == 0) {
            return 0;
        }
        if (j3 <= 0) {
            TLRPC.Chat M0 = qp.s1(p10.s0).M0(Long.valueOf(-j3));
            if (M0 == null || (tL_recentStory = M0.stories_max_id) == null || tL_recentStory.max_id <= 0 || M0.stories_unavailable) {
                return 0;
            }
            int i7 = z6Var.f.get(j3, 0);
            TLRPC.TL_recentStory tL_recentStory3 = M0.stories_max_id;
            if (tL_recentStory3.live) {
                return 3;
            }
            return tL_recentStory3.max_id > i7 ? 1 : 2;
        }
        TLRPC.User a22 = qp.s1(p10.s0).a2(Long.valueOf(j3));
        if (j3 == p10.i(p10.s0).n || a22 == null || (tL_recentStory2 = a22.stories_max_id) == null || tL_recentStory2.max_id <= 0 || a22.stories_unavailable) {
            return 0;
        }
        int i10 = z6Var.f.get(j3, 0);
        TLRPC.TL_recentStory tL_recentStory4 = a22.stories_max_id;
        if (tL_recentStory4.live) {
            return 3;
        }
        return tL_recentStory4.max_id > i10 ? 1 : 2;
    }

    public static String s() {
        int max = (int) (Math.max(org.telegram.messenger.g0.c1().x, org.telegram.messenger.g0.c1().y) / org.telegram.messenger.g0.p);
        return com.google.android.recaptcha.internal.a.j(max, "_", max);
    }

    public static Paint t(ImageReceiver imageReceiver, boolean z9) {
        e10[] e10VarArr = a;
        if (e10VarArr[z9 ? 1 : 0] == null) {
            e10 e10Var = new e10();
            e10VarArr[z9 ? 1 : 0] = e10Var;
            e10Var.a = true;
            e10Var.b = true;
            if (z9) {
                e10Var.d(org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.Xk, false), org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.Yk, false), 0, 0);
            } else {
                e10Var.d(org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.Vk, false), org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.Wk, false), 0, 0);
            }
            e10VarArr[z9 ? 1 : 0].c.setStrokeWidth(org.telegram.messenger.g0.N(2.0f));
            e10VarArr[z9 ? 1 : 0].c.setStyle(Paint.Style.STROKE);
            e10VarArr[z9 ? 1 : 0].c.setStrokeCap(Paint.Cap.ROUND);
        }
        e10VarArr[z9 ? 1 : 0].b(imageReceiver.K0, imageReceiver.L0, imageReceiver.y(), imageReceiver.A());
        return e10VarArr[z9 ? 1 : 0].c;
    }

    public static CharSequence u(TextView textView, boolean z9) {
        String M0 = z9 ? id.M0(2131744672, null) : id.M0(2131743800, null);
        if (M0.indexOf("…") <= 0) {
            return M0;
        }
        SpannableStringBuilder valueOf = SpannableStringBuilder.valueOf(M0);
        w9 w9Var = new w9();
        valueOf.setSpan(w9Var, valueOf.length() - 1, valueOf.length(), 0);
        w9Var.a = textView;
        w9Var.n = false;
        return valueOf;
    }

    public static boolean v(TL_stories.StoryItem storyItem) {
        return storyItem != null && ConnectionsManager.getInstance(p10.s0).getCurrentTime() > storyItem.expire_date + 86400;
    }

    public static boolean w(int i7, TL_stories.StoryItem storyItem) {
        return ConnectionsManager.getInstance(i7).getCurrentTime() > storyItem.expire_date;
    }

    public static void x(ImageReceiver imageReceiver, TL_stories.StoryItem storyItem) {
        ArrayList<TLRPC.PhotoSize> arrayList;
        TLRPC.Document document;
        if (storyItem == null) {
            return;
        }
        TLRPC.MessageMedia messageMedia = storyItem.media;
        if (messageMedia != null && (document = messageMedia.document) != null) {
            imageReceiver.r0(org.telegram.messenger.hc.c(org.telegram.messenger.w7.w(document.thumbs, ConnectionsManager.DEFAULT_DATACENTER_ID, false, null, false), storyItem.media.document), "320_320", null, null, gc.m(storyItem.media.document.thumbs), 0L, null, storyItem, 0);
            imageReceiver.a(new v9(storyItem));
            return;
        }
        TLRPC.Photo photo = messageMedia != null ? messageMedia.photo : null;
        if (messageMedia instanceof TLRPC.TL_messageMediaUnsupported) {
            Bitmap createBitmap = Bitmap.createBitmap(10, 10, Bitmap.Config.ARGB_8888);
            createBitmap.eraseColor(i0.a.f(0.2f, -16777216, -1));
            imageReceiver.v0(createBitmap);
            imageReceiver.a(new v9(storyItem));
            return;
        }
        if (photo == null || (arrayList = photo.sizes) == null) {
            imageReceiver.f();
        } else {
            imageReceiver.u0(null, null, org.telegram.messenger.hc.i(org.telegram.messenger.w7.w(arrayList, ConnectionsManager.DEFAULT_DATACENTER_ID, false, null, false), photo), "320_320", null, null, gc.m(photo.sizes), 0L, null, storyItem, 0);
            imageReceiver.a(new v9(storyItem));
        }
    }

    public static void y(ImageReceiver imageReceiver, TL_stories.StoryItem storyItem) {
        ArrayList<TLRPC.PhotoSize> arrayList;
        if (storyItem == null) {
            return;
        }
        TLRPC.MessageMedia messageMedia = storyItem.media;
        TLRPC.Document document = messageMedia.document;
        if (document != null) {
            imageReceiver.r0(org.telegram.messenger.hc.c(org.telegram.messenger.w7.w(document.thumbs, 1000, false, null, false), storyItem.media.document), "100_100", null, null, gc.m(storyItem.media.document.thumbs), 0L, null, storyItem, 0);
            return;
        }
        TLRPC.Photo photo = messageMedia.photo;
        if (photo == null || (arrayList = photo.sizes) == null) {
            imageReceiver.f();
        } else {
            imageReceiver.u0(null, null, org.telegram.messenger.hc.i(org.telegram.messenger.w7.w(arrayList, 1000, false, null, false), photo), "100_100", null, null, gc.m(photo.sizes), 0L, null, storyItem, 0);
        }
    }
}
