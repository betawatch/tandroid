package ei;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.os.Build;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.hp;
import org.telegram.messenger.hs;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.ac;
import org.telegram.ui.Components.xq;
import org.telegram.ui.fx;
import org.telegram.ui.vq0;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class m3 extends w {
    public final org.telegram.ui.Components.u5 d;
    public final org.telegram.ui.Components.u5 e;
    public final org.telegram.ui.Components.voip.g f;
    public final org.telegram.ui.Components.u5 h;
    public final org.telegram.ui.Components.u5 n;
    public boolean r;
    public boolean s;
    public final /* synthetic */ g4 w;
    public final /* synthetic */ r9 x;
    public final /* synthetic */ j4 y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m3(j4 j4Var, Context context, g4 g4Var, r9 r9Var) {
        super(context);
        this.y = j4Var;
        this.w = g4Var;
        this.x = r9Var;
        xq xqVar = xq.f;
        this.d = new org.telegram.ui.Components.u5(this, 150L, xqVar);
        this.e = new org.telegram.ui.Components.u5(this, 150L, xqVar);
        this.f = new org.telegram.ui.Components.voip.g(32, hs.n1, hs.P3);
        org.telegram.ui.Components.u5 u5Var = new org.telegram.ui.Components.u5(this);
        this.h = u5Var;
        org.telegram.ui.Components.u5 u5Var2 = new org.telegram.ui.Components.u5(this);
        this.n = u5Var2;
        u5Var.g = 500L;
        u5Var2.g = 100L;
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0157, code lost:
    
        if (r4 >= 0.0f) goto L95;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b(Canvas canvas) {
        TL_stories.StoryItem storyItem;
        r6 r6Var;
        TL_stories.StoryItem storyItem2;
        int i3;
        TLRPC.UserFull b22;
        float hideInterfaceAlpha;
        float f10;
        float i10;
        float f11;
        float f12;
        float f13;
        float f14;
        float f15;
        boolean z10;
        float f16;
        o8 o8Var;
        float f17;
        int i11;
        int i12;
        float f18;
        float f19;
        Paint paint;
        int i13;
        q9 q9Var;
        q9 q9Var2;
        j4 j4Var = this.y;
        float f20 = j4Var.s1;
        i3 i3Var = j4Var.T0;
        i4 i4Var = j4Var.w2;
        h4 h4Var = j4Var.y1;
        c3 c3Var = j4Var.O0;
        if (c3Var.L() || ((h4Var.e && i4Var.a) || (h4Var.f && i4Var.a))) {
            j4 j4Var2 = h4Var.k;
            TL_stories.PeerStories peerStories = j4Var2.e1;
            r9 r9Var = j4Var2.t0;
            if (peerStories == null && (peerStories = j4Var2.C1.y(j4Var2.l1)) == null && (b22 = hp.s1(j4Var2.m2).b2(j4Var2.l1)) != null) {
                peerStories = b22.stories;
            }
            if (j4Var2.u1 && (storyItem2 = h4Var.a) != null && peerStories != null && ((!s7.v(storyItem2) && ((i3 = h4Var.a.id) > peerStories.max_read_id || i3 > j4Var2.C1.f.get(j4Var2.l1, 0))) || j4Var2.m1)) {
                TL_stories.PeerStories peerStories2 = r9Var.R0;
                if (peerStories2 == null) {
                    z6 z6Var = j4Var2.C1;
                    long j10 = j4Var2.l1;
                    TL_stories.StoryItem storyItem3 = h4Var.a;
                    TL_stories.PeerStories y9 = z6Var.y(j10);
                    if (y9 == null) {
                        y9 = z6Var.z(j10);
                    }
                    if (z6Var.Y(y9, storyItem3, false)) {
                        r9Var.d1 = true;
                    }
                } else if (j4Var2.C1.Y(peerStories2, h4Var.a, true)) {
                    r9Var.d1 = true;
                }
            } else if (j4Var2.u1 && (storyItem = h4Var.a) != null && (r6Var = r9Var.P0) != null && r6Var.r(storyItem.id)) {
                r9Var.d1 = true;
            }
        }
        hideInterfaceAlpha = j4Var.getHideInterfaceAlpha();
        if (h4Var.e) {
            q9 q9Var3 = (q9) i4Var.c;
            if (q9Var3 != null) {
                i10 = Utilities.i(q9Var3.getPlaybackProgress(j4Var.B2), 1.0f, 0.0f);
                if (i4Var.a && i3Var != null) {
                    i3Var.e();
                }
            } else {
                i10 = 0.0f;
            }
            invalidate();
            f10 = hideInterfaceAlpha;
        } else if (j4Var.B1 || !j4Var.u1 || j4Var.D1 || j4Var.E1 || j4Var.F1 || !c3Var.L()) {
            f10 = hideInterfaceAlpha;
            i10 = Utilities.i(j4Var.G0 / 10000.0f, 1.0f, 0.0f);
        } else {
            long currentTimeMillis = System.currentTimeMillis();
            long j11 = j4Var.H0;
            if (j11 == 0 || j4Var.T2) {
                f10 = hideInterfaceAlpha;
            } else {
                f10 = hideInterfaceAlpha;
                if (j4Var.G0 <= 0 && currentTimeMillis - j11 > 0 && i3Var != null) {
                    i3Var.e();
                }
                j4Var.G0 += currentTimeMillis - j4Var.H0;
            }
            j4Var.H0 = currentTimeMillis;
            i10 = Utilities.i(j4Var.G0 / 10000.0f, 1.0f, 0.0f);
            invalidate();
        }
        if (i4Var != null && (q9Var2 = (q9) i4Var.c) != null) {
            f11 = q9Var2.currentSeek;
        }
        f11 = i10;
        if (!j4Var.I0 && i10 == 1.0f && ((!h4Var.e || !j4Var.T2) && !j4Var.v2)) {
            j4Var.I0 = true;
            post(new ci.d1(this, 25));
        }
        r9 r9Var2 = this.x;
        r6 r6Var2 = r9Var2.P0;
        if (r6Var2 == null || r6Var2.e == 3) {
            f12 = 1.0f;
            f13 = 4.0f;
            f14 = 2.0f;
            f15 = 8.0f;
        } else {
            if (j4Var.a1 == null) {
                j4Var.a1 = new l6.n(5);
            }
            l6.n nVar = j4Var.a1;
            f13 = 4.0f;
            float f21 = (1.0f - j4Var.O3) * f10 * f20;
            int i14 = j4Var.v1;
            f12 = 1.0f;
            int g7 = r9Var2.P0.g();
            f14 = 2.0f;
            f4 f4Var = j4Var.Y0;
            f15 = 8.0f;
            org.telegram.ui.Components.g6 g6Var = (org.telegram.ui.Components.g6) nVar.d;
            int i15 = (g7 << 12) + i14;
            if (nVar.a != i15) {
                nVar.a = i15;
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                spannableStringBuilder.append((CharSequence) String.valueOf(i14 + 1)).append((CharSequence) nVar.b).append((CharSequence) "/").append((CharSequence) nVar.c).append((CharSequence) String.valueOf(g7));
                g6Var.t(spannableStringBuilder, false, true);
            }
            canvas.save();
            float y10 = f4Var.getY();
            e4 e4Var = f4Var.b;
            float top = ((g6Var.e / 2.0f) + (y10 + e4Var.getTop())) - 1.0f;
            e4Var.setRightPadding((int) g6Var.c());
            canvas.translate((e4Var.getRightDrawableWidth() + (e4Var.getTextWidth() + (e4Var.getLeft() + (f4Var.getLeft() + org.telegram.messenger.g0.L(4.0f))))) - Utilities.j(((e4Var.getRightDrawableWidth() + e4Var.getTextWidth()) + r0) - e4Var.getWidth(), r0, 0), top);
            float L = org.telegram.messenger.g0.L(8.0f);
            float L2 = org.telegram.messenger.g0.L(2.0f);
            org.telegram.messenger.g0.P.set(-L, -L2, g6Var.c() + L, g6Var.e + L2);
            g6Var.B = (int) (f21 * 160.0f);
            g6Var.draw(canvas);
            canvas.restore();
        }
        canvas.save();
        canvas.translate(0.0f, org.telegram.messenger.g0.L(f15) - (org.telegram.messenger.g0.L(f15) * j4Var.O3));
        boolean z11 = h4Var.e && (q9Var = (q9) i4Var.c) != null && q9Var.isBuffering();
        boolean z12 = j4Var.v2;
        boolean z13 = z12 && h4Var != null && h4Var.e && r9Var2.l0;
        float d = j4Var.z2.d(!z12 || z13);
        o8 o8Var2 = j4Var.Z0;
        int measuredWidth = getMeasuredWidth();
        int i16 = j4Var.w1;
        int i17 = j4Var.x1;
        float f22 = (f12 - j4Var.O3) * f20;
        TextPaint textPaint = o8Var2.c;
        if (i17 > 0) {
            boolean z14 = z11 && !z13;
            if (o8Var2.i != i16) {
                o8Var2.g = 0.0f;
                o8Var2.h = true;
            }
            o8Var2.i = i16;
            g4 g4Var = o8Var2.a;
            Paint paint2 = g4Var.a;
            Paint paint3 = g4Var.b;
            int L3 = i17 > 100 ? 1 : i17 >= 50 ? org.telegram.messenger.g0.L(f12) : org.telegram.messenger.g0.L(f14);
            float L4 = ((measuredWidth - org.telegram.messenger.g0.L(10.0f)) - ((i17 - 1) * L3)) / i17;
            org.telegram.messenger.g0.L(5.0f);
            float min = Math.min(L4 / f14, org.telegram.messenger.g0.L(f12));
            float d10 = o8Var2.b.d(z13);
            if (d10 > 0.0f) {
                float T1 = org.telegram.messenger.g0.T1(i10, f11, d10);
                canvas.save();
                textPaint.setAlpha((int) (d10 * 255.0f));
                z10 = z14;
                textPaint.setShadowLayer(org.telegram.messenger.g0.L(3.0f), 0.0f, org.telegram.messenger.g0.L(f12), org.telegram.ui.ActionBar.k6.r1(d10, 805306368));
                canvas.translate(((measuredWidth - o8Var2.f) / f14) - o8Var2.e, org.telegram.messenger.g0.W1(d10, org.telegram.messenger.g0.L(f13), org.telegram.messenger.g0.L(16.0f)));
                o8Var2.d.draw(canvas);
                canvas.restore();
                i10 = T1;
            } else {
                z10 = z14;
            }
            int i18 = 0;
            while (i18 < i17) {
                float L5 = (i18 * L4) + org.telegram.messenger.g0.L(5.0f) + (-0.0f) + (L3 * i18);
                if (L5 <= measuredWidth) {
                    float f23 = L5 + L4;
                    if (f23 < 0.0f) {
                        f16 = min;
                        o8Var = o8Var2;
                        f17 = i10;
                        i11 = measuredWidth;
                        i12 = i17;
                        i18++;
                        min = f16;
                        i17 = i12;
                        i10 = f17;
                        measuredWidth = i11;
                        o8Var2 = o8Var;
                    } else if (f22 > 0.0f) {
                        float T12 = org.telegram.messenger.g0.T1(min, org.telegram.messenger.g0.N(f14), d10);
                        if (i18 > i16 || i18 != i16) {
                            f16 = min;
                            o8Var = o8Var2;
                            f17 = i10;
                            i11 = measuredWidth;
                            f18 = T12;
                            f19 = f12;
                        } else {
                            f16 = min;
                            RectF rectF = org.telegram.messenger.g0.P;
                            f17 = i10;
                            i11 = measuredWidth;
                            rectF.set(L5, 0.0f, f23, org.telegram.messenger.g0.T1(org.telegram.messenger.g0.N(f14), org.telegram.messenger.g0.N(5.0f), (i16 == i18 ? 1 : 0) * d10));
                            if (z10) {
                                if (o8Var2.h) {
                                    float f24 = o8Var2.g + 0.026666667f;
                                    o8Var2.g = f24;
                                    if (f24 > 0.5f) {
                                        o8Var2.h = false;
                                    }
                                } else {
                                    float f25 = o8Var2.g - 0.026666667f;
                                    o8Var2.g = f25;
                                    if (f25 < -0.5f) {
                                        o8Var2.h = true;
                                    }
                                }
                                f18 = T12;
                                i13 = (int) (o8Var2.g * 51.0f * f22 * d);
                            } else {
                                f18 = T12;
                                i13 = 0;
                            }
                            paint2.setAlpha(((int) (85.0f * f22 * d)) + i13);
                            if (d10 > 0.0f) {
                                int i19 = i18 - i16;
                                o8Var = o8Var2;
                                rectF.left = Utilities.i(org.telegram.messenger.g0.T1(rectF.left, org.telegram.messenger.g0.L(5.0f) + (i19 * i11), d10), i11 - org.telegram.messenger.g0.L(5.0f), org.telegram.messenger.g0.L(5.0f));
                                rectF.right = Utilities.i(org.telegram.messenger.g0.T1(rectF.right, ((i19 + 1) * i11) - org.telegram.messenger.g0.L(5.0f), d10), i11 - org.telegram.messenger.g0.L(5.0f), org.telegram.messenger.g0.L(5.0f));
                            } else {
                                o8Var = o8Var2;
                            }
                            canvas.drawRoundRect(rectF, f18, f18, paint2);
                            f19 = f17;
                        }
                        RectF rectF2 = org.telegram.messenger.g0.P;
                        i12 = i17;
                        rectF2.set(L5, 0.0f, f23, org.telegram.messenger.g0.T1(org.telegram.messenger.g0.N(f14), org.telegram.messenger.g0.N(5.0f), (i16 == i18 ? 1 : 0) * d10));
                        if (d10 > 0.0f) {
                            int i20 = i18 - i16;
                            rectF2.left = Utilities.i(org.telegram.messenger.g0.T1(rectF2.left, org.telegram.messenger.g0.L(5.0f) + (i20 * i11), d10), i11 - org.telegram.messenger.g0.L(5.0f), org.telegram.messenger.g0.L(5.0f));
                            rectF2.right = Utilities.i(org.telegram.messenger.g0.T1(rectF2.right, ((i20 + 1) * i11) - org.telegram.messenger.g0.L(5.0f), d10), i11 - org.telegram.messenger.g0.L(5.0f), org.telegram.messenger.g0.L(5.0f));
                        }
                        rectF2.right = org.telegram.messenger.g0.T1(rectF2.left, rectF2.right, f19);
                        if (i18 <= i16) {
                            paint3.setAlpha((int) (f22 * 255.0f * d));
                            paint = paint3;
                        } else {
                            paint2.setAlpha((int) (85 * f22 * d));
                            paint = paint2;
                        }
                        canvas.drawRoundRect(rectF2, f18, f18, paint);
                        i18++;
                        min = f16;
                        i17 = i12;
                        i10 = f17;
                        measuredWidth = i11;
                        o8Var2 = o8Var;
                    }
                }
                f16 = min;
                o8Var = o8Var2;
                f17 = i10;
                i11 = measuredWidth;
                i12 = i17;
                i18++;
                min = f16;
                i17 = i12;
                i10 = f17;
                measuredWidth = i11;
                o8Var2 = o8Var;
            }
        }
        canvas.restore();
    }

    /* JADX WARN: Code restructure failed: missing block: B:226:0x01d5, code lost:
    
        if (((ei.q9) r2.c).paused != false) goto L81;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x01a5, code lost:
    
        if (r4.n() != false) goto L81;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:110:0x052d  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0539  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x057c  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0586  */
    /* JADX WARN: Removed duplicated region for block: B:136:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:137:0x052f  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x01f6  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x01ab  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x018b  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0197  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x01f3  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0201  */
    /* JADX WARN: Type inference failed for: r15v0 */
    /* JADX WARN: Type inference failed for: r15v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r15v9 */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void dispatchDraw(Canvas canvas) {
        char c2;
        g4 g4Var;
        ?? r15;
        float hideInterfaceAlpha;
        float f10;
        float f11;
        float f12;
        float f13;
        boolean z10;
        fx fxVar;
        o4 o4Var;
        boolean z11;
        float f14;
        boolean z12;
        org.telegram.ui.Components.u5 u5Var;
        boolean L;
        si.f fVar;
        q9 q9Var;
        r8 r8Var;
        Canvas canvas2 = canvas;
        j4 j4Var = this.y;
        m3 m3Var = j4Var.M0;
        i3 i3Var = j4Var.T0;
        h4 h4Var = j4Var.y1;
        c3 c3Var = j4Var.O0;
        i4 i4Var = j4Var.w2;
        q3 q3Var = j4Var.u0;
        if (!j4Var.u1) {
            j4Var.Y0.a.getImageReceiver().O0(true, true);
        }
        boolean z13 = j4Var.M2;
        g4 g4Var2 = this.w;
        if (z13) {
            c2 = 0;
            canvas2.drawColor(i0.a.f(0.2f, -16777216, -1));
        } else {
            if (((org.telegram.ui.l4) i4Var.e) != null || (i3Var != null && (((r8Var = i3Var.b) != null && (r8Var.x || r8Var.s)) || i3Var.E.i))) {
                invalidate();
            }
            canvas2.save();
            vq0 vq0Var = j4Var.H2;
            if (vq0Var.n) {
                canvas2.save();
                float f15 = vq0Var.O;
                float f16 = vq0Var.A;
                float f17 = ((f15 * f16) + 1.0f) - f16;
                canvas2.scale(f17, f17, vq0Var.o + vq0Var.s, vq0Var.p + vq0Var.t);
                float f18 = vq0Var.o;
                float f19 = vq0Var.J;
                float f20 = vq0Var.A;
                canvas2.translate((f19 * f20) + f18, (vq0Var.K * f20) + vq0Var.p);
            }
            org.telegram.ui.l4 l4Var = (org.telegram.ui.l4) i4Var.e;
            if (l4Var == null || (!i4Var.a && ((g1) i4Var.b) == null)) {
                if (l4Var != null) {
                    invalidate();
                }
                if (h4Var.d) {
                    canvas2.drawColor(i0.a.f(0.2f, -16777216, -1));
                } else {
                    if (!c3Var.I()) {
                        g4Var2.f.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight() + 1);
                        g4Var2.f.draw(canvas2);
                    }
                    f14 = 0.0f;
                    c3Var.y0(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight() + 1);
                    c3Var.h(canvas2, null);
                    canvas2.restore();
                    z12 = j4Var.I2;
                    org.telegram.ui.Components.u5 u5Var2 = this.h;
                    u5Var = this.n;
                    if (z12) {
                        u5Var2.e(true, f14);
                        u5Var.e(true, f14);
                    }
                    if (!h4Var.f) {
                        g1 g1Var = (g1) i4Var.b;
                        if (g1Var != null) {
                            if (!i4Var.a) {
                            }
                            L = true;
                        }
                        L = false;
                    } else if (h4Var.e) {
                        if (((org.telegram.ui.l4) i4Var.e) != null) {
                            q9 q9Var2 = (q9) i4Var.c;
                            if (q9Var2 != null) {
                                if (i4Var.a) {
                                    if (q9Var2.progress == 0.0f) {
                                        if (q9Var2 != null) {
                                            if (q9Var2.isBuffering()) {
                                            }
                                        }
                                    }
                                    L = true;
                                }
                            }
                        }
                        L = false;
                    } else {
                        L = c3Var.L();
                    }
                    u5Var2.e(false, (j4Var.u1 || L || h4Var.b != null) ? 0.0f : 1.0f);
                    u5Var.e(false, u5Var2.c != 1.0f ? 1.0f : 0.0f);
                    if (u5Var.c > 0.0f) {
                        RectF rectF = org.telegram.messenger.g0.P;
                        rectF.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                        int i3 = (int) (u5Var.c * 255.0f);
                        org.telegram.ui.Components.voip.g gVar = this.f;
                        gVar.a.setAlpha(i3);
                        gVar.c.setAlpha(i3);
                        gVar.f = getMeasuredWidth() * 2;
                        gVar.n = 1.3f;
                        gVar.a(org.telegram.messenger.g0.L(10.0f), canvas2, rectF, this);
                    }
                    j4Var.I2 = false;
                    c2 = 0;
                }
            } else {
                if (!c3Var.I()) {
                    g4Var2.f.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight() + 1);
                    g4Var2.f.draw(canvas2);
                }
                c3Var.y0(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight() + 1);
                c3Var.h(canvas2, null);
                if (j4Var.u1) {
                    r9 r9Var = this.x;
                    boolean z14 = r9Var.a;
                    if (z14 && (q9Var = (q9) i4Var.c) != null && q9Var.paused && q9Var.playerStubBitmap != null && q9Var.stubAvailable) {
                        canvas2.save();
                        canvas2.scale(getMeasuredWidth() / ((q9) i4Var.c).playerStubBitmap.getWidth(), getMeasuredHeight() / ((q9) i4Var.c).playerStubBitmap.getHeight());
                        q9 q9Var3 = (q9) i4Var.c;
                        canvas2.drawBitmap(q9Var3.playerStubBitmap, 0.0f, 0.0f, q9Var3.playerStubPaint);
                        canvas2.restore();
                    } else {
                        boolean z15 = Build.VERSION.SDK_INT >= 29 && (fVar = j4Var.r3) != null && canvas2 == fVar.s;
                        if (!z14 || (j4Var.L0 && !r9Var.I0 && !z15)) {
                            ((org.telegram.ui.l4) i4Var.e).draw(canvas2);
                        }
                    }
                }
            }
            f14 = 0.0f;
            canvas2.restore();
            z12 = j4Var.I2;
            org.telegram.ui.Components.u5 u5Var22 = this.h;
            u5Var = this.n;
            if (z12) {
            }
            if (!h4Var.f) {
            }
            u5Var22.e(false, (j4Var.u1 || L || h4Var.b != null) ? 0.0f : 1.0f);
            u5Var.e(false, u5Var22.c != 1.0f ? 1.0f : 0.0f);
            if (u5Var.c > 0.0f) {
            }
            j4Var.I2 = false;
            c2 = 0;
        }
        if (q3Var.getAlpha() > 0.0f) {
            if (q3Var.getAlpha() == 1.0f) {
                canvas2.save();
                g4Var = g4Var2;
                z11 = false;
            } else {
                z11 = false;
                g4Var = g4Var2;
                canvas2.saveLayerAlpha(0.0f, 0.0f, q3Var.getMeasuredWidth(), q3Var.getMeasuredHeight(), (int) (q3Var.getAlpha() * 255.0f), 31);
            }
            i3Var.draw(canvas2);
            canvas2.restore();
            r15 = z11;
        } else {
            g4Var = g4Var2;
            r15 = 0;
        }
        if (!j4Var.J0 && c3Var.L()) {
            j4Var.J0 = true;
            j4Var.invalidate();
        }
        hideInterfaceAlpha = j4Var.getHideInterfaceAlpha();
        Drawable drawable = g4Var.d;
        Paint paint = g4Var.c;
        Drawable drawable2 = g4Var.e;
        drawable.setAlpha(hs.e4);
        g4Var.d.draw(canvas2);
        if (j4Var.m1 || !j4Var.h2 || q3Var.getVisibility() == 0) {
            if (q3Var.getVisibility() == 0) {
                int L2 = org.telegram.messenger.g0.L(72.0f);
                int top = q3Var.getTop() + ((int) (q3Var.getTextTop() - org.telegram.messenger.g0.L(24.0f)));
                int i10 = L2 + top;
                float measuredHeight = getMeasuredHeight() * 0.65f;
                if ((measuredHeight - top) / org.telegram.messenger.g0.L(60.0f) > 0.0f && q3Var.x0 && q3Var.s0.getBottom() - q3Var.getMeasuredHeight() > 0) {
                    if ((measuredHeight - (q3Var.getTop() + ((int) (q3Var.getMaxTop() - org.telegram.messenger.g0.L(24.0f))))) / org.telegram.messenger.g0.L(60.0f) > 0.0f) {
                        j4Var.Q2 = true;
                    }
                    f10 = 0.0f;
                } else if (j4Var.R2) {
                    j4Var.R2 = r15;
                    f10 = 0.0f;
                    if ((measuredHeight - (q3Var.getTop() + ((int) (q3Var.getMaxTop() - org.telegram.messenger.g0.L(24.0f))))) / org.telegram.messenger.g0.L(60.0f) > 0.0f) {
                        j4Var.Q2 = true;
                    }
                } else {
                    f10 = 0.0f;
                    if (q3Var.getProgressToBlackout() == 0.0f) {
                        j4Var.Q2 = r15;
                    }
                }
                float e10 = this.e.e(r15, j4Var.Q2 ? 1.0f : f10);
                if (e10 > f10) {
                    this.r = true;
                    this.s = r15;
                    super.dispatchDraw(canvas);
                    this.r = r15;
                    b(canvas);
                    paint.setColor(i0.a.o(-16777216, (int) (153.0f * e10 * hideInterfaceAlpha)));
                    canvas2.drawPaint(paint);
                }
                if (e10 < 1.0f && !h4Var.f) {
                    canvas2.save();
                    float f21 = 1.0f - e10;
                    paint.setColor(i0.a.o(-16777216, (int) (129.03f * f21 * hideInterfaceAlpha)));
                    drawable2.setAlpha((int) (f21 * 255.0f * hideInterfaceAlpha));
                    drawable2.setBounds(r15, top, getMeasuredWidth(), i10);
                    drawable2.draw(canvas2);
                    canvas2.drawRect(0.0f, i10, getMeasuredWidth(), getMeasuredHeight(), paint);
                    canvas.restore();
                }
                if (e10 <= f10 || q3Var.getAlpha() <= 0.0f) {
                    canvas2 = canvas;
                } else {
                    if (q3Var.u0) {
                        q3Var.u0 = r15;
                        q3Var.invalidate();
                    }
                    if (q3Var.getAlpha() != 1.0f) {
                        canvas2 = canvas;
                        canvas2.saveLayerAlpha(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), (int) (q3Var.getAlpha() * 255.0f), 31);
                    } else {
                        canvas2 = canvas;
                        canvas2.save();
                    }
                    canvas2.translate(q3Var.getX(), q3Var.getY() - q3Var.getScrollY());
                    q3Var.draw(canvas2);
                    canvas2.restore();
                }
                boolean z16 = e10 > f10 ? true : r15;
                if (q3Var.u0 != z16) {
                    q3Var.u0 = z16;
                    q3Var.invalidate();
                }
                if (e10 > f10) {
                    this.r = true;
                    this.s = true;
                    super.dispatchDraw(canvas);
                    this.r = r15;
                }
                f11 = e10;
                f12 = j4Var.W0;
                if (f12 != 0.0f || (o4Var = j4Var.V0) == null) {
                    f13 = 1.0f;
                    z10 = true;
                } else {
                    float f22 = j4Var.k3;
                    int measuredWidth = getMeasuredWidth();
                    z10 = true;
                    int measuredHeight2 = getMeasuredHeight() + 1;
                    p4 p4Var = o4Var.f;
                    ImageReceiver imageReceiver = o4Var.a;
                    float f23 = (float) r15;
                    imageReceiver.y0(f23, f23, measuredWidth, measuredHeight2);
                    imageReceiver.setAlpha(f12);
                    imageReceiver.h(canvas2, null);
                    f13 = 1.0f;
                    imageReceiver.setAlpha(1.0f);
                    if (o4Var.c != null) {
                        int i11 = (int) (f12 * 255.0f);
                        o4Var.d.setAlpha(i11);
                        GradientDrawable gradientDrawable = p4Var.I;
                        gradientDrawable.setAlpha(i11);
                        gradientDrawable.setBounds((int) imageReceiver.L0, (int) (imageReceiver.A() - (org.telegram.messenger.g0.L(24.0f) * f22)), (int) imageReceiver.y(), ((int) imageReceiver.A()) + 2);
                        gradientDrawable.draw(canvas2);
                        canvas2.save();
                        canvas2.scale(f22, f22, imageReceiver.r(), imageReceiver.A() - (org.telegram.messenger.g0.L(8.0f) * f22));
                        canvas2.translate(imageReceiver.r() - (p4Var.K / 2.0f), (imageReceiver.A() - (org.telegram.messenger.g0.L(8.0f) * f22)) - o4Var.c.getHeight());
                        o4Var.c.draw(canvas2);
                        canvas2.restore();
                    }
                }
                this.d.e(r15, !j4Var.q2 ? f13 : 0.0f);
                if (j4Var.u1) {
                    boolean z17 = (q3Var.getVisibility() == 0 && (j4Var.Q2 || q3Var.x0)) ? z10 : r15;
                    j4Var.T2 = (q3Var.getVisibility() != 0 || q3Var.getProgressToBlackout() <= 0.0f) ? r15 : z10;
                    r9 r9Var2 = ((i9) j4Var.A1).d;
                    r9Var2.M0 = z17;
                    r9Var2.d0();
                    ((i9) j4Var.A1).d.n1 = j4Var.T2;
                }
                if (f11 <= 0.0f) {
                    super.dispatchDraw(canvas);
                    b(canvas);
                }
                fxVar = j4Var.U0;
                if (fxVar == null) {
                    fxVar.e(canvas2);
                    return;
                }
                return;
            }
            if (!h4Var.f) {
                int L3 = org.telegram.messenger.g0.L(j4Var.h2 ? 56.0f : 110.0f);
                if ((j4Var.m1 || !j4Var.h2) && q3Var.getVisibility() == 0) {
                    L3 = (int) (L3 * 2.5f);
                }
                drawable2.setBounds(r15, m3Var.getMeasuredHeight() - L3, getMeasuredWidth(), m3Var.getMeasuredHeight());
                drawable2.setAlpha((int) (hideInterfaceAlpha * 255.0f));
                drawable2.draw(canvas2);
            }
        }
        f11 = 0.0f;
        f12 = j4Var.W0;
        if (f12 != 0.0f) {
        }
        f13 = 1.0f;
        z10 = true;
        this.d.e(r15, !j4Var.q2 ? f13 : 0.0f);
        if (j4Var.u1) {
        }
        if (f11 <= 0.0f) {
        }
        fxVar = j4Var.U0;
        if (fxVar == null) {
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        g1 g1Var;
        j4 j4Var = this.y;
        i4 i4Var = j4Var.w2;
        if (!j4Var.u1 || j4Var.M2 || ((org.telegram.ui.l4) i4Var.e) == null || (g1Var = (g1) i4Var.b) == null || !g1Var.n() || !((org.telegram.ui.l4) i4Var.e).dispatchTouchEvent(motionEvent)) {
            return super.dispatchTouchEvent(motionEvent);
        }
        return true;
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        if (view == this.y.T0) {
            return true;
        }
        if (!this.r) {
            return super.drawChild(canvas, view, j10);
        }
        ac acVar = ac.w;
        if (acVar == null || view != acVar.e) {
            return super.drawChild(canvas, view, j10);
        }
        if (this.s) {
            return super.drawChild(canvas, view, j10);
        }
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.y.U0.i();
        setTag(R.id.bulletin_delegate_tag, new ai.h1(this, 2));
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        j4 j4Var = this.y;
        j4Var.U0.j();
        setTag(R.id.bulletin_delegate_tag, null);
        c4 c4Var = j4Var.A1;
        if (c4Var != null) {
            r9 r9Var = ((i9) c4Var).d;
            r9Var.Z0 = false;
            r9Var.d0();
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i3, int i10) {
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.y.i0.getLayoutParams();
        layoutParams.rightMargin = org.telegram.messenger.g0.L(42.0f);
        layoutParams.topMargin = org.telegram.messenger.g0.L(15.0f);
        super.onMeasure(i3, i10);
    }
}
