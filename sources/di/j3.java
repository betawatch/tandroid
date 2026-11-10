package di;

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
import bi.ab;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.qp;
import org.telegram.messenger.qs;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.bc;
import org.telegram.ui.Components.wq;
import org.telegram.ui.ir0;
import org.telegram.ui.lx;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class j3 extends v {
    public final org.telegram.ui.Components.v5 d;
    public final org.telegram.ui.Components.v5 e;
    public final org.telegram.ui.Components.voip.n f;
    public final org.telegram.ui.Components.v5 h;
    public final org.telegram.ui.Components.v5 n;
    public boolean r;
    public boolean s;
    public final /* synthetic */ g4 w;
    public final /* synthetic */ q9 x;
    public final /* synthetic */ j4 y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j3(j4 j4Var, Context context, g4 g4Var, q9 q9Var) {
        super(context);
        this.y = j4Var;
        this.w = g4Var;
        this.x = q9Var;
        wq wqVar = wq.f;
        this.d = new org.telegram.ui.Components.v5(this, 150L, wqVar);
        this.e = new org.telegram.ui.Components.v5(this, 150L, wqVar);
        this.f = new org.telegram.ui.Components.voip.n(32, qs.n1, qs.P3);
        org.telegram.ui.Components.v5 v5Var = new org.telegram.ui.Components.v5(this);
        this.h = v5Var;
        org.telegram.ui.Components.v5 v5Var2 = new org.telegram.ui.Components.v5(this);
        this.n = v5Var2;
        v5Var.g = 500L;
        v5Var2.g = 100L;
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
        int i7;
        TLRPC.UserFull b22;
        float hideInterfaceAlpha;
        float f10;
        float i10;
        float f11;
        float f12;
        float f13;
        float f14;
        float f15;
        boolean z9;
        float f16;
        p8 p8Var;
        float f17;
        int i11;
        int i12;
        float f18;
        float f19;
        Paint paint;
        int i13;
        p9 p9Var;
        p9 p9Var2;
        j4 j4Var = this.y;
        float f20 = j4Var.r1;
        f3 f3Var = j4Var.S0;
        i4 i4Var = j4Var.v2;
        h4 h4Var = j4Var.x1;
        z2 z2Var = j4Var.N0;
        if (z2Var.L() || ((h4Var.e && i4Var.a) || (h4Var.f && i4Var.a))) {
            j4 j4Var2 = h4Var.k;
            TL_stories.PeerStories peerStories = j4Var2.d1;
            q9 q9Var = j4Var2.s0;
            if (peerStories == null && (peerStories = j4Var2.B1.y(j4Var2.k1)) == null && (b22 = qp.s1(j4Var2.l2).b2(j4Var2.k1)) != null) {
                peerStories = b22.stories;
            }
            if (j4Var2.t1 && (storyItem2 = h4Var.a) != null && peerStories != null && ((!s7.v(storyItem2) && ((i7 = h4Var.a.id) > peerStories.max_read_id || i7 > j4Var2.B1.f.get(j4Var2.k1, 0))) || j4Var2.l1)) {
                TL_stories.PeerStories peerStories2 = q9Var.P0;
                if (peerStories2 == null) {
                    z6 z6Var = j4Var2.B1;
                    long j3 = j4Var2.k1;
                    TL_stories.StoryItem storyItem3 = h4Var.a;
                    TL_stories.PeerStories y10 = z6Var.y(j3);
                    if (y10 == null) {
                        y10 = z6Var.z(j3);
                    }
                    if (z6Var.Y(y10, storyItem3, false)) {
                        q9Var.b1 = true;
                    }
                } else if (j4Var2.B1.Y(peerStories2, h4Var.a, true)) {
                    q9Var.b1 = true;
                }
            } else if (j4Var2.t1 && (storyItem = h4Var.a) != null && (r6Var = q9Var.N0) != null && r6Var.r(storyItem.id)) {
                q9Var.b1 = true;
            }
        }
        hideInterfaceAlpha = j4Var.getHideInterfaceAlpha();
        if (h4Var.e) {
            p9 p9Var3 = (p9) i4Var.c;
            if (p9Var3 != null) {
                i10 = Utilities.i(p9Var3.getPlaybackProgress(j4Var.A2), 1.0f, 0.0f);
                if (i4Var.a && f3Var != null) {
                    f3Var.e();
                }
            } else {
                i10 = 0.0f;
            }
            invalidate();
            f10 = hideInterfaceAlpha;
        } else if (j4Var.A1 || !j4Var.t1 || j4Var.C1 || j4Var.D1 || j4Var.E1 || !z2Var.L()) {
            f10 = hideInterfaceAlpha;
            i10 = Utilities.i(j4Var.F0 / 10000.0f, 1.0f, 0.0f);
        } else {
            long currentTimeMillis = System.currentTimeMillis();
            long j10 = j4Var.G0;
            if (j10 == 0 || j4Var.S2) {
                f10 = hideInterfaceAlpha;
            } else {
                f10 = hideInterfaceAlpha;
                if (j4Var.F0 <= 0 && currentTimeMillis - j10 > 0 && f3Var != null) {
                    f3Var.e();
                }
                j4Var.F0 += currentTimeMillis - j4Var.G0;
            }
            j4Var.G0 = currentTimeMillis;
            i10 = Utilities.i(j4Var.F0 / 10000.0f, 1.0f, 0.0f);
            invalidate();
        }
        if (i4Var != null && (p9Var2 = (p9) i4Var.c) != null) {
            f11 = p9Var2.currentSeek;
        }
        f11 = i10;
        if (!j4Var.H0 && i10 == 1.0f && ((!h4Var.e || !j4Var.S2) && !j4Var.u2)) {
            j4Var.H0 = true;
            post(new ab(this, 20));
        }
        q9 q9Var2 = this.x;
        r6 r6Var2 = q9Var2.N0;
        if (r6Var2 == null || r6Var2.e == 3) {
            f12 = 1.0f;
            f13 = 4.0f;
            f14 = 2.0f;
            f15 = 8.0f;
        } else {
            if (j4Var.Z0 == null) {
                j4Var.Z0 = new m6.n(4);
            }
            m6.n nVar = j4Var.Z0;
            f13 = 4.0f;
            float f21 = (1.0f - j4Var.N3) * f10 * f20;
            int i14 = j4Var.u1;
            f12 = 1.0f;
            int g10 = q9Var2.N0.g();
            f14 = 2.0f;
            f4 f4Var = j4Var.X0;
            f15 = 8.0f;
            org.telegram.ui.Components.h6 h6Var = (org.telegram.ui.Components.h6) nVar.d;
            int i15 = (g10 << 12) + i14;
            if (nVar.a != i15) {
                nVar.a = i15;
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                spannableStringBuilder.append((CharSequence) String.valueOf(i14 + 1)).append((CharSequence) nVar.b).append((CharSequence) "/").append((CharSequence) nVar.c).append((CharSequence) String.valueOf(g10));
                h6Var.t(spannableStringBuilder, false, true);
            }
            canvas.save();
            float y11 = f4Var.getY();
            e4 e4Var = f4Var.b;
            float top = ((h6Var.e / 2.0f) + (y11 + e4Var.getTop())) - 1.0f;
            e4Var.setRightPadding((int) h6Var.c());
            canvas.translate((e4Var.getRightDrawableWidth() + (e4Var.getTextWidth() + (e4Var.getLeft() + (f4Var.getLeft() + org.telegram.messenger.g0.L(4.0f))))) - Utilities.j(((e4Var.getRightDrawableWidth() + e4Var.getTextWidth()) + r0) - e4Var.getWidth(), r0, 0), top);
            float L = org.telegram.messenger.g0.L(8.0f);
            float L2 = org.telegram.messenger.g0.L(2.0f);
            org.telegram.messenger.g0.P.set(-L, -L2, h6Var.c() + L, h6Var.e + L2);
            h6Var.B = (int) (f21 * 160.0f);
            h6Var.draw(canvas);
            canvas.restore();
        }
        canvas.save();
        canvas.translate(0.0f, org.telegram.messenger.g0.L(f15) - (org.telegram.messenger.g0.L(f15) * j4Var.N3));
        boolean z10 = h4Var.e && (p9Var = (p9) i4Var.c) != null && p9Var.isBuffering();
        boolean z11 = j4Var.u2;
        boolean z12 = z11 && h4Var != null && h4Var.e && q9Var2.k0;
        float d = j4Var.y2.d(!z11 || z12);
        p8 p8Var2 = j4Var.Y0;
        int measuredWidth = getMeasuredWidth();
        int i16 = j4Var.v1;
        int i17 = j4Var.w1;
        float f22 = (f12 - j4Var.N3) * f20;
        TextPaint textPaint = p8Var2.c;
        if (i17 > 0) {
            boolean z13 = z10 && !z12;
            if (p8Var2.i != i16) {
                p8Var2.g = 0.0f;
                p8Var2.h = true;
            }
            p8Var2.i = i16;
            g4 g4Var = p8Var2.a;
            Paint paint2 = g4Var.a;
            Paint paint3 = g4Var.b;
            int L3 = i17 > 100 ? 1 : i17 >= 50 ? org.telegram.messenger.g0.L(f12) : org.telegram.messenger.g0.L(f14);
            float L4 = ((measuredWidth - org.telegram.messenger.g0.L(10.0f)) - ((i17 - 1) * L3)) / i17;
            org.telegram.messenger.g0.L(5.0f);
            float min = Math.min(L4 / f14, org.telegram.messenger.g0.L(f12));
            float d2 = p8Var2.b.d(z12);
            if (d2 > 0.0f) {
                float T1 = org.telegram.messenger.g0.T1(i10, f11, d2);
                canvas.save();
                textPaint.setAlpha((int) (d2 * 255.0f));
                z9 = z13;
                textPaint.setShadowLayer(org.telegram.messenger.g0.L(3.0f), 0.0f, org.telegram.messenger.g0.L(f12), org.telegram.ui.ActionBar.m6.r1(d2, 805306368));
                canvas.translate(((measuredWidth - p8Var2.f) / f14) - p8Var2.e, org.telegram.messenger.g0.W1(d2, org.telegram.messenger.g0.L(f13), org.telegram.messenger.g0.L(16.0f)));
                p8Var2.d.draw(canvas);
                canvas.restore();
                i10 = T1;
            } else {
                z9 = z13;
            }
            int i18 = 0;
            while (i18 < i17) {
                float L5 = (i18 * L4) + org.telegram.messenger.g0.L(5.0f) + (-0.0f) + (L3 * i18);
                if (L5 <= measuredWidth) {
                    float f23 = L5 + L4;
                    if (f23 < 0.0f) {
                        f16 = min;
                        p8Var = p8Var2;
                        f17 = i10;
                        i11 = measuredWidth;
                        i12 = i17;
                        i18++;
                        min = f16;
                        i17 = i12;
                        i10 = f17;
                        measuredWidth = i11;
                        p8Var2 = p8Var;
                    } else if (f22 > 0.0f) {
                        float T12 = org.telegram.messenger.g0.T1(min, org.telegram.messenger.g0.N(f14), d2);
                        if (i18 > i16 || i18 != i16) {
                            f16 = min;
                            p8Var = p8Var2;
                            f17 = i10;
                            i11 = measuredWidth;
                            f18 = T12;
                            f19 = f12;
                        } else {
                            f16 = min;
                            RectF rectF = org.telegram.messenger.g0.P;
                            f17 = i10;
                            i11 = measuredWidth;
                            rectF.set(L5, 0.0f, f23, org.telegram.messenger.g0.T1(org.telegram.messenger.g0.N(f14), org.telegram.messenger.g0.N(5.0f), (i16 == i18 ? 1 : 0) * d2));
                            if (z9) {
                                if (p8Var2.h) {
                                    float f24 = p8Var2.g + 0.026666667f;
                                    p8Var2.g = f24;
                                    if (f24 > 0.5f) {
                                        p8Var2.h = false;
                                    }
                                } else {
                                    float f25 = p8Var2.g - 0.026666667f;
                                    p8Var2.g = f25;
                                    if (f25 < -0.5f) {
                                        p8Var2.h = true;
                                    }
                                }
                                f18 = T12;
                                i13 = (int) (p8Var2.g * 51.0f * f22 * d);
                            } else {
                                f18 = T12;
                                i13 = 0;
                            }
                            paint2.setAlpha(((int) (85.0f * f22 * d)) + i13);
                            if (d2 > 0.0f) {
                                int i19 = i18 - i16;
                                p8Var = p8Var2;
                                rectF.left = Utilities.i(org.telegram.messenger.g0.T1(rectF.left, org.telegram.messenger.g0.L(5.0f) + (i19 * i11), d2), i11 - org.telegram.messenger.g0.L(5.0f), org.telegram.messenger.g0.L(5.0f));
                                rectF.right = Utilities.i(org.telegram.messenger.g0.T1(rectF.right, ((i19 + 1) * i11) - org.telegram.messenger.g0.L(5.0f), d2), i11 - org.telegram.messenger.g0.L(5.0f), org.telegram.messenger.g0.L(5.0f));
                            } else {
                                p8Var = p8Var2;
                            }
                            canvas.drawRoundRect(rectF, f18, f18, paint2);
                            f19 = f17;
                        }
                        RectF rectF2 = org.telegram.messenger.g0.P;
                        i12 = i17;
                        rectF2.set(L5, 0.0f, f23, org.telegram.messenger.g0.T1(org.telegram.messenger.g0.N(f14), org.telegram.messenger.g0.N(5.0f), (i16 == i18 ? 1 : 0) * d2));
                        if (d2 > 0.0f) {
                            int i20 = i18 - i16;
                            rectF2.left = Utilities.i(org.telegram.messenger.g0.T1(rectF2.left, org.telegram.messenger.g0.L(5.0f) + (i20 * i11), d2), i11 - org.telegram.messenger.g0.L(5.0f), org.telegram.messenger.g0.L(5.0f));
                            rectF2.right = Utilities.i(org.telegram.messenger.g0.T1(rectF2.right, ((i20 + 1) * i11) - org.telegram.messenger.g0.L(5.0f), d2), i11 - org.telegram.messenger.g0.L(5.0f), org.telegram.messenger.g0.L(5.0f));
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
                        p8Var2 = p8Var;
                    }
                }
                f16 = min;
                p8Var = p8Var2;
                f17 = i10;
                i11 = measuredWidth;
                i12 = i17;
                i18++;
                min = f16;
                i17 = i12;
                i10 = f17;
                measuredWidth = i11;
                p8Var2 = p8Var;
            }
        }
        canvas.restore();
    }

    /* JADX WARN: Code restructure failed: missing block: B:226:0x01d5, code lost:
    
        if (((di.p9) r2.c).paused != false) goto L81;
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
        char c10;
        g4 g4Var;
        ?? r15;
        float hideInterfaceAlpha;
        float f10;
        float f11;
        float f12;
        float f13;
        boolean z9;
        lx lxVar;
        o4 o4Var;
        boolean z10;
        float f14;
        boolean z11;
        org.telegram.ui.Components.v5 v5Var;
        boolean L;
        ri.f fVar;
        p9 p9Var;
        s8 s8Var;
        Canvas canvas2 = canvas;
        j4 j4Var = this.y;
        j3 j3Var = j4Var.L0;
        f3 f3Var = j4Var.S0;
        h4 h4Var = j4Var.x1;
        z2 z2Var = j4Var.N0;
        i4 i4Var = j4Var.v2;
        n3 n3Var = j4Var.t0;
        if (!j4Var.t1) {
            j4Var.X0.a.getImageReceiver().O0(true, true);
        }
        boolean z12 = j4Var.L2;
        g4 g4Var2 = this.w;
        if (z12) {
            c10 = 0;
            canvas2.drawColor(i0.a.f(0.2f, -16777216, -1));
        } else {
            if (((org.telegram.ui.j4) i4Var.e) != null || (f3Var != null && (((s8Var = f3Var.b) != null && (s8Var.x || s8Var.s)) || f3Var.D.i))) {
                invalidate();
            }
            canvas2.save();
            ir0 ir0Var = j4Var.G2;
            if (ir0Var.n) {
                canvas2.save();
                float f15 = ir0Var.O;
                float f16 = ir0Var.A;
                float f17 = ((f15 * f16) + 1.0f) - f16;
                canvas2.scale(f17, f17, ir0Var.o + ir0Var.s, ir0Var.p + ir0Var.t);
                float f18 = ir0Var.o;
                float f19 = ir0Var.J;
                float f20 = ir0Var.A;
                canvas2.translate((f19 * f20) + f18, (ir0Var.K * f20) + ir0Var.p);
            }
            org.telegram.ui.j4 j4Var2 = (org.telegram.ui.j4) i4Var.e;
            if (j4Var2 == null || (!i4Var.a && ((g1) i4Var.b) == null)) {
                if (j4Var2 != null) {
                    invalidate();
                }
                if (h4Var.d) {
                    canvas2.drawColor(i0.a.f(0.2f, -16777216, -1));
                } else {
                    if (!z2Var.I()) {
                        g4Var2.f.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight() + 1);
                        g4Var2.f.draw(canvas2);
                    }
                    f14 = 0.0f;
                    z2Var.y0(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight() + 1);
                    z2Var.h(canvas2, null);
                    canvas2.restore();
                    z11 = j4Var.H2;
                    org.telegram.ui.Components.v5 v5Var2 = this.h;
                    v5Var = this.n;
                    if (z11) {
                        v5Var2.e(true, f14);
                        v5Var.e(true, f14);
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
                        if (((org.telegram.ui.j4) i4Var.e) != null) {
                            p9 p9Var2 = (p9) i4Var.c;
                            if (p9Var2 != null) {
                                if (i4Var.a) {
                                    if (p9Var2.progress == 0.0f) {
                                        if (p9Var2 != null) {
                                            if (p9Var2.isBuffering()) {
                                            }
                                        }
                                    }
                                    L = true;
                                }
                            }
                        }
                        L = false;
                    } else {
                        L = z2Var.L();
                    }
                    v5Var2.e(false, (j4Var.t1 || L || h4Var.b != null) ? 0.0f : 1.0f);
                    v5Var.e(false, v5Var2.c != 1.0f ? 1.0f : 0.0f);
                    if (v5Var.c > 0.0f) {
                        RectF rectF = org.telegram.messenger.g0.P;
                        rectF.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                        int i7 = (int) (v5Var.c * 255.0f);
                        org.telegram.ui.Components.voip.n nVar = this.f;
                        nVar.a.setAlpha(i7);
                        nVar.c.setAlpha(i7);
                        nVar.f = getMeasuredWidth() * 2;
                        nVar.n = 1.3f;
                        nVar.a(org.telegram.messenger.g0.L(10.0f), canvas2, rectF, this);
                    }
                    j4Var.H2 = false;
                    c10 = 0;
                }
            } else {
                if (!z2Var.I()) {
                    g4Var2.f.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight() + 1);
                    g4Var2.f.draw(canvas2);
                }
                z2Var.y0(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight() + 1);
                z2Var.h(canvas2, null);
                if (j4Var.t1) {
                    q9 q9Var = this.x;
                    boolean z13 = q9Var.a;
                    if (z13 && (p9Var = (p9) i4Var.c) != null && p9Var.paused && p9Var.playerStubBitmap != null && p9Var.stubAvailable) {
                        canvas2.save();
                        canvas2.scale(getMeasuredWidth() / ((p9) i4Var.c).playerStubBitmap.getWidth(), getMeasuredHeight() / ((p9) i4Var.c).playerStubBitmap.getHeight());
                        p9 p9Var3 = (p9) i4Var.c;
                        canvas2.drawBitmap(p9Var3.playerStubBitmap, 0.0f, 0.0f, p9Var3.playerStubPaint);
                        canvas2.restore();
                    } else {
                        boolean z14 = Build.VERSION.SDK_INT >= 29 && (fVar = j4Var.q3) != null && canvas2 == fVar.s;
                        if (!z13 || (j4Var.K0 && !q9Var.G0 && !z14)) {
                            ((org.telegram.ui.j4) i4Var.e).draw(canvas2);
                        }
                    }
                }
            }
            f14 = 0.0f;
            canvas2.restore();
            z11 = j4Var.H2;
            org.telegram.ui.Components.v5 v5Var22 = this.h;
            v5Var = this.n;
            if (z11) {
            }
            if (!h4Var.f) {
            }
            v5Var22.e(false, (j4Var.t1 || L || h4Var.b != null) ? 0.0f : 1.0f);
            v5Var.e(false, v5Var22.c != 1.0f ? 1.0f : 0.0f);
            if (v5Var.c > 0.0f) {
            }
            j4Var.H2 = false;
            c10 = 0;
        }
        if (n3Var.getAlpha() > 0.0f) {
            if (n3Var.getAlpha() == 1.0f) {
                canvas2.save();
                g4Var = g4Var2;
                z10 = false;
            } else {
                z10 = false;
                g4Var = g4Var2;
                canvas2.saveLayerAlpha(0.0f, 0.0f, n3Var.getMeasuredWidth(), n3Var.getMeasuredHeight(), (int) (n3Var.getAlpha() * 255.0f), 31);
            }
            f3Var.draw(canvas2);
            canvas2.restore();
            r15 = z10;
        } else {
            g4Var = g4Var2;
            r15 = 0;
        }
        if (!j4Var.I0 && z2Var.L()) {
            j4Var.I0 = true;
            j4Var.invalidate();
        }
        hideInterfaceAlpha = j4Var.getHideInterfaceAlpha();
        Drawable drawable = g4Var.d;
        Paint paint = g4Var.c;
        Drawable drawable2 = g4Var.e;
        drawable.setAlpha(qs.e4);
        g4Var.d.draw(canvas2);
        if (j4Var.l1 || !j4Var.g2 || n3Var.getVisibility() == 0) {
            if (n3Var.getVisibility() == 0) {
                int L2 = org.telegram.messenger.g0.L(72.0f);
                int top = n3Var.getTop() + ((int) (n3Var.getTextTop() - org.telegram.messenger.g0.L(24.0f)));
                int i10 = L2 + top;
                float measuredHeight = getMeasuredHeight() * 0.65f;
                if ((measuredHeight - top) / org.telegram.messenger.g0.L(60.0f) > 0.0f && n3Var.w0 && n3Var.r0.getBottom() - n3Var.getMeasuredHeight() > 0) {
                    if ((measuredHeight - (n3Var.getTop() + ((int) (n3Var.getMaxTop() - org.telegram.messenger.g0.L(24.0f))))) / org.telegram.messenger.g0.L(60.0f) > 0.0f) {
                        j4Var.P2 = true;
                    }
                    f10 = 0.0f;
                } else if (j4Var.Q2) {
                    j4Var.Q2 = r15;
                    f10 = 0.0f;
                    if ((measuredHeight - (n3Var.getTop() + ((int) (n3Var.getMaxTop() - org.telegram.messenger.g0.L(24.0f))))) / org.telegram.messenger.g0.L(60.0f) > 0.0f) {
                        j4Var.P2 = true;
                    }
                } else {
                    f10 = 0.0f;
                    if (n3Var.getProgressToBlackout() == 0.0f) {
                        j4Var.P2 = r15;
                    }
                }
                float e10 = this.e.e(r15, j4Var.P2 ? 1.0f : f10);
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
                if (e10 <= f10 || n3Var.getAlpha() <= 0.0f) {
                    canvas2 = canvas;
                } else {
                    if (n3Var.t0) {
                        n3Var.t0 = r15;
                        n3Var.invalidate();
                    }
                    if (n3Var.getAlpha() != 1.0f) {
                        canvas2 = canvas;
                        canvas2.saveLayerAlpha(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), (int) (n3Var.getAlpha() * 255.0f), 31);
                    } else {
                        canvas2 = canvas;
                        canvas2.save();
                    }
                    canvas2.translate(n3Var.getX(), n3Var.getY() - n3Var.getScrollY());
                    n3Var.draw(canvas2);
                    canvas2.restore();
                }
                boolean z15 = e10 > f10 ? true : r15;
                if (n3Var.t0 != z15) {
                    n3Var.t0 = z15;
                    n3Var.invalidate();
                }
                if (e10 > f10) {
                    this.r = true;
                    this.s = true;
                    super.dispatchDraw(canvas);
                    this.r = r15;
                }
                f11 = e10;
                f12 = j4Var.V0;
                if (f12 != 0.0f || (o4Var = j4Var.U0) == null) {
                    f13 = 1.0f;
                    z9 = true;
                } else {
                    float f22 = j4Var.j3;
                    int measuredWidth = getMeasuredWidth();
                    z9 = true;
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
                        GradientDrawable gradientDrawable = p4Var.H;
                        gradientDrawable.setAlpha(i11);
                        gradientDrawable.setBounds((int) imageReceiver.K0, (int) (imageReceiver.A() - (org.telegram.messenger.g0.L(24.0f) * f22)), (int) imageReceiver.y(), ((int) imageReceiver.A()) + 2);
                        gradientDrawable.draw(canvas2);
                        canvas2.save();
                        canvas2.scale(f22, f22, imageReceiver.r(), imageReceiver.A() - (org.telegram.messenger.g0.L(8.0f) * f22));
                        canvas2.translate(imageReceiver.r() - (p4Var.J / 2.0f), (imageReceiver.A() - (org.telegram.messenger.g0.L(8.0f) * f22)) - o4Var.c.getHeight());
                        o4Var.c.draw(canvas2);
                        canvas2.restore();
                    }
                }
                this.d.e(r15, !j4Var.p2 ? f13 : 0.0f);
                if (j4Var.t1) {
                    boolean z16 = (n3Var.getVisibility() == 0 && (j4Var.P2 || n3Var.w0)) ? z9 : r15;
                    j4Var.S2 = (n3Var.getVisibility() != 0 || n3Var.getProgressToBlackout() <= 0.0f) ? r15 : z9;
                    q9 q9Var2 = ((h9) j4Var.z1).d;
                    q9Var2.K0 = z16;
                    q9Var2.V();
                    ((h9) j4Var.z1).d.l1 = j4Var.S2;
                }
                if (f11 <= 0.0f) {
                    super.dispatchDraw(canvas);
                    b(canvas);
                }
                lxVar = j4Var.T0;
                if (lxVar == null) {
                    lxVar.e(canvas2);
                    return;
                }
                return;
            }
            if (!h4Var.f) {
                int L3 = org.telegram.messenger.g0.L(j4Var.g2 ? 56.0f : 110.0f);
                if ((j4Var.l1 || !j4Var.g2) && n3Var.getVisibility() == 0) {
                    L3 = (int) (L3 * 2.5f);
                }
                drawable2.setBounds(r15, j3Var.getMeasuredHeight() - L3, getMeasuredWidth(), j3Var.getMeasuredHeight());
                drawable2.setAlpha((int) (hideInterfaceAlpha * 255.0f));
                drawable2.draw(canvas2);
            }
        }
        f11 = 0.0f;
        f12 = j4Var.V0;
        if (f12 != 0.0f) {
        }
        f13 = 1.0f;
        z9 = true;
        this.d.e(r15, !j4Var.p2 ? f13 : 0.0f);
        if (j4Var.t1) {
        }
        if (f11 <= 0.0f) {
        }
        lxVar = j4Var.T0;
        if (lxVar == null) {
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        g1 g1Var;
        j4 j4Var = this.y;
        i4 i4Var = j4Var.v2;
        if (!j4Var.t1 || j4Var.L2 || ((org.telegram.ui.j4) i4Var.e) == null || (g1Var = (g1) i4Var.b) == null || !g1Var.n() || !((org.telegram.ui.j4) i4Var.e).dispatchTouchEvent(motionEvent)) {
            return super.dispatchTouchEvent(motionEvent);
        }
        return true;
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        if (view == this.y.S0) {
            return true;
        }
        if (!this.r) {
            return super.drawChild(canvas, view, j3);
        }
        bc bcVar = bc.w;
        if (bcVar == null || view != bcVar.e) {
            return super.drawChild(canvas, view, j3);
        }
        if (this.s) {
            return super.drawChild(canvas, view, j3);
        }
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.y.T0.i();
        setTag(R.id.bulletin_delegate_tag, new ch.v(this, 1));
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        j4 j4Var = this.y;
        j4Var.T0.j();
        setTag(R.id.bulletin_delegate_tag, null);
        c4 c4Var = j4Var.z1;
        if (c4Var != null) {
            q9 q9Var = ((h9) c4Var).d;
            q9Var.X0 = false;
            q9Var.V();
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i7, int i10) {
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.y.h0.getLayoutParams();
        layoutParams.rightMargin = org.telegram.messenger.g0.L(42.0f);
        layoutParams.topMargin = org.telegram.messenger.g0.L(15.0f);
        super.onMeasure(i7, i10);
    }
}
