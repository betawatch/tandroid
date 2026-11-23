package fi;

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
import org.telegram.messenger.ks;
import org.telegram.messenger.mp;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.fc;
import org.telegram.ui.Components.kr;
import org.telegram.ui.fr0;
import org.telegram.ui.mx;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes4.dex */
public final class c3 extends v {
    public final org.telegram.ui.Components.c6 d;
    public final org.telegram.ui.Components.c6 e;
    public final org.telegram.ui.Components.voip.n f;
    public final org.telegram.ui.Components.c6 h;
    public final org.telegram.ui.Components.c6 n;
    public boolean r;
    public boolean s;
    public final /* synthetic */ w3 w;
    public final /* synthetic */ f9 x;
    public final /* synthetic */ z3 y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c3(z3 z3Var, Context context, w3 w3Var, f9 f9Var) {
        super(context);
        this.y = z3Var;
        this.w = w3Var;
        this.x = f9Var;
        kr krVar = kr.f;
        this.d = new org.telegram.ui.Components.c6(this, 150L, krVar);
        this.e = new org.telegram.ui.Components.c6(this, 150L, krVar);
        this.f = new org.telegram.ui.Components.voip.n(32, ks.n1, ks.P3);
        org.telegram.ui.Components.c6 c6Var = new org.telegram.ui.Components.c6(this);
        this.h = c6Var;
        org.telegram.ui.Components.c6 c6Var2 = new org.telegram.ui.Components.c6(this);
        this.n = c6Var2;
        c6Var.g = 500L;
        c6Var2.g = 100L;
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0157, code lost:
    
        if (r4 >= 0.0f) goto L95;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b(Canvas canvas) {
        TL_stories.StoryItem storyItem;
        h6 h6Var;
        TL_stories.StoryItem storyItem2;
        int i7;
        TLRPC.UserFull d2;
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
        e8 e8Var;
        float f17;
        int i11;
        int i12;
        float f18;
        float f19;
        Paint paint;
        int i13;
        e9 e9Var;
        e9 e9Var2;
        z3 z3Var = this.y;
        float f20 = z3Var.s1;
        y2 y2Var = z3Var.T0;
        y3 y3Var = z3Var.w2;
        x3 x3Var = z3Var.y1;
        s2 s2Var = z3Var.O0;
        if (s2Var.M() || ((x3Var.e && y3Var.a) || (x3Var.f && y3Var.a))) {
            z3 z3Var2 = x3Var.k;
            TL_stories.PeerStories peerStories = z3Var2.e1;
            f9 f9Var = z3Var2.t0;
            if (peerStories == null && (peerStories = z3Var2.C1.y(z3Var2.l1)) == null && (d2 = mp.u1(z3Var2.m2).d2(z3Var2.l1)) != null) {
                peerStories = d2.stories;
            }
            if (z3Var2.u1 && (storyItem2 = x3Var.a) != null && peerStories != null && ((!i7.v(storyItem2) && ((i7 = x3Var.a.id) > peerStories.max_read_id || i7 > z3Var2.C1.f.get(z3Var2.l1, 0))) || z3Var2.m1)) {
                TL_stories.PeerStories peerStories2 = f9Var.Q0;
                if (peerStories2 == null) {
                    p6 p6Var = z3Var2.C1;
                    long j3 = z3Var2.l1;
                    TL_stories.StoryItem storyItem3 = x3Var.a;
                    TL_stories.PeerStories y10 = p6Var.y(j3);
                    if (y10 == null) {
                        y10 = p6Var.z(j3);
                    }
                    if (p6Var.Y(y10, storyItem3, false)) {
                        f9Var.c1 = true;
                    }
                } else if (z3Var2.C1.Y(peerStories2, x3Var.a, true)) {
                    f9Var.c1 = true;
                }
            } else if (z3Var2.u1 && (storyItem = x3Var.a) != null && (h6Var = f9Var.O0) != null && h6Var.r(storyItem.id)) {
                f9Var.c1 = true;
            }
        }
        hideInterfaceAlpha = z3Var.getHideInterfaceAlpha();
        if (x3Var.e) {
            e9 e9Var3 = (e9) y3Var.c;
            if (e9Var3 != null) {
                i10 = Utilities.i(e9Var3.getPlaybackProgress(z3Var.B2), 1.0f, 0.0f);
                if (y3Var.a && y2Var != null) {
                    y2Var.e();
                }
            } else {
                i10 = 0.0f;
            }
            invalidate();
            f10 = hideInterfaceAlpha;
        } else if (z3Var.B1 || !z3Var.u1 || z3Var.D1 || z3Var.E1 || z3Var.F1 || !s2Var.M()) {
            f10 = hideInterfaceAlpha;
            i10 = Utilities.i(z3Var.G0 / 10000.0f, 1.0f, 0.0f);
        } else {
            long currentTimeMillis = System.currentTimeMillis();
            long j10 = z3Var.H0;
            if (j10 == 0 || z3Var.T2) {
                f10 = hideInterfaceAlpha;
            } else {
                f10 = hideInterfaceAlpha;
                if (z3Var.G0 <= 0 && currentTimeMillis - j10 > 0 && y2Var != null) {
                    y2Var.e();
                }
                z3Var.G0 += currentTimeMillis - z3Var.H0;
            }
            z3Var.H0 = currentTimeMillis;
            i10 = Utilities.i(z3Var.G0 / 10000.0f, 1.0f, 0.0f);
            invalidate();
        }
        if (y3Var != null && (e9Var2 = (e9) y3Var.c) != null) {
            f11 = e9Var2.currentSeek;
        }
        f11 = i10;
        if (!z3Var.I0 && i10 == 1.0f && ((!x3Var.e || !z3Var.T2) && !z3Var.v2)) {
            z3Var.I0 = true;
            post(new f2.a(this, 7));
        }
        f9 f9Var2 = this.x;
        h6 h6Var2 = f9Var2.O0;
        if (h6Var2 == null || h6Var2.e == 3) {
            f12 = 1.0f;
            f13 = 4.0f;
            f14 = 2.0f;
            f15 = 8.0f;
        } else {
            if (z3Var.a1 == null) {
                z3Var.a1 = new m6.n(5);
            }
            m6.n nVar = z3Var.a1;
            f13 = 4.0f;
            float f21 = (1.0f - z3Var.O3) * f10 * f20;
            int i14 = z3Var.v1;
            f12 = 1.0f;
            int g10 = f9Var2.O0.g();
            f14 = 2.0f;
            v3 v3Var = z3Var.Y0;
            f15 = 8.0f;
            org.telegram.ui.Components.m6 m6Var = (org.telegram.ui.Components.m6) nVar.d;
            int i15 = (g10 << 12) + i14;
            if (nVar.a != i15) {
                nVar.a = i15;
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                spannableStringBuilder.append((CharSequence) String.valueOf(i14 + 1)).append((CharSequence) nVar.b).append((CharSequence) "/").append((CharSequence) nVar.c).append((CharSequence) String.valueOf(g10));
                m6Var.t(spannableStringBuilder, false, true);
            }
            canvas.save();
            float y11 = v3Var.getY();
            u3 u3Var = v3Var.b;
            float top = ((m6Var.e / 2.0f) + (y11 + u3Var.getTop())) - 1.0f;
            u3Var.setRightPadding((int) m6Var.c());
            canvas.translate((u3Var.getRightDrawableWidth() + (u3Var.getTextWidth() + (u3Var.getLeft() + (v3Var.getLeft() + org.telegram.messenger.g0.L(4.0f))))) - Utilities.j(((u3Var.getRightDrawableWidth() + u3Var.getTextWidth()) + r0) - u3Var.getWidth(), r0, 0), top);
            float L = org.telegram.messenger.g0.L(8.0f);
            float L2 = org.telegram.messenger.g0.L(2.0f);
            org.telegram.messenger.g0.P.set(-L, -L2, m6Var.c() + L, m6Var.e + L2);
            m6Var.C = (int) (f21 * 160.0f);
            m6Var.draw(canvas);
            canvas.restore();
        }
        canvas.save();
        canvas.translate(0.0f, org.telegram.messenger.g0.L(f15) - (org.telegram.messenger.g0.L(f15) * z3Var.O3));
        boolean z11 = x3Var.e && (e9Var = (e9) y3Var.c) != null && e9Var.isBuffering();
        boolean z12 = z3Var.v2;
        boolean z13 = z12 && x3Var != null && x3Var.e && f9Var2.l0;
        float d = z3Var.z2.d(!z12 || z13);
        e8 e8Var2 = z3Var.Z0;
        int measuredWidth = getMeasuredWidth();
        int i16 = z3Var.w1;
        int i17 = z3Var.x1;
        float f22 = (f12 - z3Var.O3) * f20;
        TextPaint textPaint = e8Var2.c;
        if (i17 > 0) {
            boolean z14 = z11 && !z13;
            if (e8Var2.i != i16) {
                e8Var2.g = 0.0f;
                e8Var2.h = true;
            }
            e8Var2.i = i16;
            w3 w3Var = e8Var2.a;
            Paint paint2 = w3Var.a;
            Paint paint3 = w3Var.b;
            int L3 = i17 > 100 ? 1 : i17 >= 50 ? org.telegram.messenger.g0.L(f12) : org.telegram.messenger.g0.L(f14);
            float L4 = ((measuredWidth - org.telegram.messenger.g0.L(10.0f)) - ((i17 - 1) * L3)) / i17;
            org.telegram.messenger.g0.L(5.0f);
            float min = Math.min(L4 / f14, org.telegram.messenger.g0.L(f12));
            float d10 = e8Var2.b.d(z13);
            if (d10 > 0.0f) {
                float T1 = org.telegram.messenger.g0.T1(i10, f11, d10);
                canvas.save();
                textPaint.setAlpha((int) (d10 * 255.0f));
                z10 = z14;
                textPaint.setShadowLayer(org.telegram.messenger.g0.L(3.0f), 0.0f, org.telegram.messenger.g0.L(f12), org.telegram.ui.ActionBar.n6.r1(d10, 805306368));
                canvas.translate(((measuredWidth - e8Var2.f) / f14) - e8Var2.e, org.telegram.messenger.g0.W1(d10, org.telegram.messenger.g0.L(f13), org.telegram.messenger.g0.L(16.0f)));
                e8Var2.d.draw(canvas);
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
                        e8Var = e8Var2;
                        f17 = i10;
                        i11 = measuredWidth;
                        i12 = i17;
                        i18++;
                        min = f16;
                        i17 = i12;
                        i10 = f17;
                        measuredWidth = i11;
                        e8Var2 = e8Var;
                    } else if (f22 > 0.0f) {
                        float T12 = org.telegram.messenger.g0.T1(min, org.telegram.messenger.g0.N(f14), d10);
                        if (i18 > i16 || i18 != i16) {
                            f16 = min;
                            e8Var = e8Var2;
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
                                if (e8Var2.h) {
                                    float f24 = e8Var2.g + 0.026666667f;
                                    e8Var2.g = f24;
                                    if (f24 > 0.5f) {
                                        e8Var2.h = false;
                                    }
                                } else {
                                    float f25 = e8Var2.g - 0.026666667f;
                                    e8Var2.g = f25;
                                    if (f25 < -0.5f) {
                                        e8Var2.h = true;
                                    }
                                }
                                f18 = T12;
                                i13 = (int) (e8Var2.g * 51.0f * f22 * d);
                            } else {
                                f18 = T12;
                                i13 = 0;
                            }
                            paint2.setAlpha(((int) (85.0f * f22 * d)) + i13);
                            if (d10 > 0.0f) {
                                int i19 = i18 - i16;
                                e8Var = e8Var2;
                                rectF.left = Utilities.i(org.telegram.messenger.g0.T1(rectF.left, org.telegram.messenger.g0.L(5.0f) + (i19 * i11), d10), i11 - org.telegram.messenger.g0.L(5.0f), org.telegram.messenger.g0.L(5.0f));
                                rectF.right = Utilities.i(org.telegram.messenger.g0.T1(rectF.right, ((i19 + 1) * i11) - org.telegram.messenger.g0.L(5.0f), d10), i11 - org.telegram.messenger.g0.L(5.0f), org.telegram.messenger.g0.L(5.0f));
                            } else {
                                e8Var = e8Var2;
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
                        e8Var2 = e8Var;
                    }
                }
                f16 = min;
                e8Var = e8Var2;
                f17 = i10;
                i11 = measuredWidth;
                i12 = i17;
                i18++;
                min = f16;
                i17 = i12;
                i10 = f17;
                measuredWidth = i11;
                e8Var2 = e8Var;
            }
        }
        canvas.restore();
    }

    /* JADX WARN: Code restructure failed: missing block: B:226:0x01d5, code lost:
    
        if (((fi.e9) r2.c).paused != false) goto L81;
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
        w3 w3Var;
        ?? r15;
        float hideInterfaceAlpha;
        float f10;
        float f11;
        float f12;
        float f13;
        boolean z10;
        mx mxVar;
        e4 e4Var;
        boolean z11;
        float f14;
        boolean z12;
        org.telegram.ui.Components.c6 c6Var;
        boolean M;
        ui.f fVar;
        e9 e9Var;
        h8 h8Var;
        Canvas canvas2 = canvas;
        z3 z3Var = this.y;
        c3 c3Var = z3Var.M0;
        y2 y2Var = z3Var.T0;
        x3 x3Var = z3Var.y1;
        s2 s2Var = z3Var.O0;
        y3 y3Var = z3Var.w2;
        g3 g3Var = z3Var.u0;
        if (!z3Var.u1) {
            z3Var.Y0.a.getImageReceiver().P0(true, true);
        }
        boolean z13 = z3Var.M2;
        w3 w3Var2 = this.w;
        if (z13) {
            c10 = 0;
            canvas2.drawColor(i0.a.f(0.2f, -16777216, -1));
        } else {
            if (((org.telegram.ui.j4) y3Var.e) != null || (y2Var != null && (((h8Var = y2Var.b) != null && (h8Var.x || h8Var.s)) || y2Var.E.i))) {
                invalidate();
            }
            canvas2.save();
            fr0 fr0Var = z3Var.H2;
            if (fr0Var.n) {
                canvas2.save();
                float f15 = fr0Var.O;
                float f16 = fr0Var.A;
                float f17 = ((f15 * f16) + 1.0f) - f16;
                canvas2.scale(f17, f17, fr0Var.o + fr0Var.s, fr0Var.p + fr0Var.t);
                float f18 = fr0Var.o;
                float f19 = fr0Var.J;
                float f20 = fr0Var.A;
                canvas2.translate((f19 * f20) + f18, (fr0Var.K * f20) + fr0Var.p);
            }
            org.telegram.ui.j4 j4Var = (org.telegram.ui.j4) y3Var.e;
            if (j4Var == null || (!y3Var.a && ((c1) y3Var.b) == null)) {
                if (j4Var != null) {
                    invalidate();
                }
                if (x3Var.d) {
                    canvas2.drawColor(i0.a.f(0.2f, -16777216, -1));
                } else {
                    if (!s2Var.J()) {
                        w3Var2.f.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight() + 1);
                        w3Var2.f.draw(canvas2);
                    }
                    f14 = 0.0f;
                    s2Var.z0(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight() + 1);
                    s2Var.h(canvas2, null);
                    canvas2.restore();
                    z12 = z3Var.I2;
                    org.telegram.ui.Components.c6 c6Var2 = this.h;
                    c6Var = this.n;
                    if (z12) {
                        c6Var2.e(true, f14);
                        c6Var.e(true, f14);
                    }
                    if (!x3Var.f) {
                        c1 c1Var = (c1) y3Var.b;
                        if (c1Var != null) {
                            if (!y3Var.a) {
                            }
                            M = true;
                        }
                        M = false;
                    } else if (x3Var.e) {
                        if (((org.telegram.ui.j4) y3Var.e) != null) {
                            e9 e9Var2 = (e9) y3Var.c;
                            if (e9Var2 != null) {
                                if (y3Var.a) {
                                    if (e9Var2.progress == 0.0f) {
                                        if (e9Var2 != null) {
                                            if (e9Var2.isBuffering()) {
                                            }
                                        }
                                    }
                                    M = true;
                                }
                            }
                        }
                        M = false;
                    } else {
                        M = s2Var.M();
                    }
                    c6Var2.e(false, (z3Var.u1 || M || x3Var.b != null) ? 0.0f : 1.0f);
                    c6Var.e(false, c6Var2.c != 1.0f ? 1.0f : 0.0f);
                    if (c6Var.c > 0.0f) {
                        RectF rectF = org.telegram.messenger.g0.P;
                        rectF.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                        int i7 = (int) (c6Var.c * 255.0f);
                        org.telegram.ui.Components.voip.n nVar = this.f;
                        nVar.a.setAlpha(i7);
                        nVar.c.setAlpha(i7);
                        nVar.f = getMeasuredWidth() * 2;
                        nVar.n = 1.3f;
                        nVar.a(org.telegram.messenger.g0.L(10.0f), canvas2, rectF, this);
                    }
                    z3Var.I2 = false;
                    c10 = 0;
                }
            } else {
                if (!s2Var.J()) {
                    w3Var2.f.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight() + 1);
                    w3Var2.f.draw(canvas2);
                }
                s2Var.z0(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight() + 1);
                s2Var.h(canvas2, null);
                if (z3Var.u1) {
                    f9 f9Var = this.x;
                    boolean z14 = f9Var.a;
                    if (z14 && (e9Var = (e9) y3Var.c) != null && e9Var.paused && e9Var.playerStubBitmap != null && e9Var.stubAvailable) {
                        canvas2.save();
                        canvas2.scale(getMeasuredWidth() / ((e9) y3Var.c).playerStubBitmap.getWidth(), getMeasuredHeight() / ((e9) y3Var.c).playerStubBitmap.getHeight());
                        e9 e9Var3 = (e9) y3Var.c;
                        canvas2.drawBitmap(e9Var3.playerStubBitmap, 0.0f, 0.0f, e9Var3.playerStubPaint);
                        canvas2.restore();
                    } else {
                        boolean z15 = Build.VERSION.SDK_INT >= 29 && (fVar = z3Var.r3) != null && canvas2 == fVar.s;
                        if (!z14 || (z3Var.L0 && !f9Var.H0 && !z15)) {
                            ((org.telegram.ui.j4) y3Var.e).draw(canvas2);
                        }
                    }
                }
            }
            f14 = 0.0f;
            canvas2.restore();
            z12 = z3Var.I2;
            org.telegram.ui.Components.c6 c6Var22 = this.h;
            c6Var = this.n;
            if (z12) {
            }
            if (!x3Var.f) {
            }
            c6Var22.e(false, (z3Var.u1 || M || x3Var.b != null) ? 0.0f : 1.0f);
            c6Var.e(false, c6Var22.c != 1.0f ? 1.0f : 0.0f);
            if (c6Var.c > 0.0f) {
            }
            z3Var.I2 = false;
            c10 = 0;
        }
        if (g3Var.getAlpha() > 0.0f) {
            if (g3Var.getAlpha() == 1.0f) {
                canvas2.save();
                w3Var = w3Var2;
                z11 = false;
            } else {
                z11 = false;
                w3Var = w3Var2;
                canvas2.saveLayerAlpha(0.0f, 0.0f, g3Var.getMeasuredWidth(), g3Var.getMeasuredHeight(), (int) (g3Var.getAlpha() * 255.0f), 31);
            }
            y2Var.draw(canvas2);
            canvas2.restore();
            r15 = z11;
        } else {
            w3Var = w3Var2;
            r15 = 0;
        }
        if (!z3Var.J0 && s2Var.M()) {
            z3Var.J0 = true;
            z3Var.invalidate();
        }
        hideInterfaceAlpha = z3Var.getHideInterfaceAlpha();
        Drawable drawable = w3Var.d;
        Paint paint = w3Var.c;
        Drawable drawable2 = w3Var.e;
        drawable.setAlpha(ks.e4);
        w3Var.d.draw(canvas2);
        if (z3Var.m1 || !z3Var.h2 || g3Var.getVisibility() == 0) {
            if (g3Var.getVisibility() == 0) {
                int L = org.telegram.messenger.g0.L(72.0f);
                int top = g3Var.getTop() + ((int) (g3Var.getTextTop() - org.telegram.messenger.g0.L(24.0f)));
                int i10 = L + top;
                float measuredHeight = getMeasuredHeight() * 0.65f;
                if ((measuredHeight - top) / org.telegram.messenger.g0.L(60.0f) > 0.0f && g3Var.x0 && g3Var.s0.getBottom() - g3Var.getMeasuredHeight() > 0) {
                    if ((measuredHeight - (g3Var.getTop() + ((int) (g3Var.getMaxTop() - org.telegram.messenger.g0.L(24.0f))))) / org.telegram.messenger.g0.L(60.0f) > 0.0f) {
                        z3Var.Q2 = true;
                    }
                    f10 = 0.0f;
                } else if (z3Var.R2) {
                    z3Var.R2 = r15;
                    f10 = 0.0f;
                    if ((measuredHeight - (g3Var.getTop() + ((int) (g3Var.getMaxTop() - org.telegram.messenger.g0.L(24.0f))))) / org.telegram.messenger.g0.L(60.0f) > 0.0f) {
                        z3Var.Q2 = true;
                    }
                } else {
                    f10 = 0.0f;
                    if (g3Var.getProgressToBlackout() == 0.0f) {
                        z3Var.Q2 = r15;
                    }
                }
                float e10 = this.e.e(r15, z3Var.Q2 ? 1.0f : f10);
                if (e10 > f10) {
                    this.r = true;
                    this.s = r15;
                    super.dispatchDraw(canvas);
                    this.r = r15;
                    b(canvas);
                    paint.setColor(i0.a.o(-16777216, (int) (153.0f * e10 * hideInterfaceAlpha)));
                    canvas2.drawPaint(paint);
                }
                if (e10 < 1.0f && !x3Var.f) {
                    canvas2.save();
                    float f21 = 1.0f - e10;
                    paint.setColor(i0.a.o(-16777216, (int) (129.03f * f21 * hideInterfaceAlpha)));
                    drawable2.setAlpha((int) (f21 * 255.0f * hideInterfaceAlpha));
                    drawable2.setBounds(r15, top, getMeasuredWidth(), i10);
                    drawable2.draw(canvas2);
                    canvas2.drawRect(0.0f, i10, getMeasuredWidth(), getMeasuredHeight(), paint);
                    canvas.restore();
                }
                if (e10 <= f10 || g3Var.getAlpha() <= 0.0f) {
                    canvas2 = canvas;
                } else {
                    if (g3Var.u0) {
                        g3Var.u0 = r15;
                        g3Var.invalidate();
                    }
                    if (g3Var.getAlpha() != 1.0f) {
                        canvas2 = canvas;
                        canvas2.saveLayerAlpha(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), (int) (g3Var.getAlpha() * 255.0f), 31);
                    } else {
                        canvas2 = canvas;
                        canvas2.save();
                    }
                    canvas2.translate(g3Var.getX(), g3Var.getY() - g3Var.getScrollY());
                    g3Var.draw(canvas2);
                    canvas2.restore();
                }
                boolean z16 = e10 > f10 ? true : r15;
                if (g3Var.u0 != z16) {
                    g3Var.u0 = z16;
                    g3Var.invalidate();
                }
                if (e10 > f10) {
                    this.r = true;
                    this.s = true;
                    super.dispatchDraw(canvas);
                    this.r = r15;
                }
                f11 = e10;
                f12 = z3Var.W0;
                if (f12 != 0.0f || (e4Var = z3Var.V0) == null) {
                    f13 = 1.0f;
                    z10 = true;
                } else {
                    float f22 = z3Var.k3;
                    int measuredWidth = getMeasuredWidth();
                    z10 = true;
                    int measuredHeight2 = getMeasuredHeight() + 1;
                    f4 f4Var = e4Var.f;
                    ImageReceiver imageReceiver = e4Var.a;
                    float f23 = (float) r15;
                    imageReceiver.z0(f23, f23, measuredWidth, measuredHeight2);
                    imageReceiver.setAlpha(f12);
                    imageReceiver.h(canvas2, null);
                    f13 = 1.0f;
                    imageReceiver.setAlpha(1.0f);
                    if (e4Var.c != null) {
                        int i11 = (int) (f12 * 255.0f);
                        e4Var.d.setAlpha(i11);
                        GradientDrawable gradientDrawable = f4Var.I;
                        gradientDrawable.setAlpha(i11);
                        gradientDrawable.setBounds((int) imageReceiver.L0, (int) (imageReceiver.B() - (org.telegram.messenger.g0.L(24.0f) * f22)), (int) imageReceiver.z(), ((int) imageReceiver.B()) + 2);
                        gradientDrawable.draw(canvas2);
                        canvas2.save();
                        canvas2.scale(f22, f22, imageReceiver.r(), imageReceiver.B() - (org.telegram.messenger.g0.L(8.0f) * f22));
                        canvas2.translate(imageReceiver.r() - (f4Var.K / 2.0f), (imageReceiver.B() - (org.telegram.messenger.g0.L(8.0f) * f22)) - e4Var.c.getHeight());
                        e4Var.c.draw(canvas2);
                        canvas2.restore();
                    }
                }
                this.d.e(r15, !z3Var.q2 ? f13 : 0.0f);
                if (z3Var.u1) {
                    boolean z17 = (g3Var.getVisibility() == 0 && (z3Var.Q2 || g3Var.x0)) ? z10 : r15;
                    z3Var.T2 = (g3Var.getVisibility() != 0 || g3Var.getProgressToBlackout() <= 0.0f) ? r15 : z10;
                    f9 f9Var2 = ((w8) z3Var.A1).d;
                    f9Var2.L0 = z17;
                    f9Var2.V();
                    ((w8) z3Var.A1).d.m1 = z3Var.T2;
                }
                if (f11 <= 0.0f) {
                    super.dispatchDraw(canvas);
                    b(canvas);
                }
                mxVar = z3Var.U0;
                if (mxVar == null) {
                    mxVar.e(canvas2);
                    return;
                }
                return;
            }
            if (!x3Var.f) {
                int L2 = org.telegram.messenger.g0.L(z3Var.h2 ? 56.0f : 110.0f);
                if ((z3Var.m1 || !z3Var.h2) && g3Var.getVisibility() == 0) {
                    L2 = (int) (L2 * 2.5f);
                }
                drawable2.setBounds(r15, c3Var.getMeasuredHeight() - L2, getMeasuredWidth(), c3Var.getMeasuredHeight());
                drawable2.setAlpha((int) (hideInterfaceAlpha * 255.0f));
                drawable2.draw(canvas2);
            }
        }
        f11 = 0.0f;
        f12 = z3Var.W0;
        if (f12 != 0.0f) {
        }
        f13 = 1.0f;
        z10 = true;
        this.d.e(r15, !z3Var.q2 ? f13 : 0.0f);
        if (z3Var.u1) {
        }
        if (f11 <= 0.0f) {
        }
        mxVar = z3Var.U0;
        if (mxVar == null) {
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        c1 c1Var;
        z3 z3Var = this.y;
        y3 y3Var = z3Var.w2;
        if (!z3Var.u1 || z3Var.M2 || ((org.telegram.ui.j4) y3Var.e) == null || (c1Var = (c1) y3Var.b) == null || !c1Var.n() || !((org.telegram.ui.j4) y3Var.e).dispatchTouchEvent(motionEvent)) {
            return super.dispatchTouchEvent(motionEvent);
        }
        return true;
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        if (view == this.y.T0) {
            return true;
        }
        if (!this.r) {
            return super.drawChild(canvas, view, j3);
        }
        fc fcVar = fc.w;
        if (fcVar == null || view != fcVar.e) {
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
        this.y.U0.i();
        setTag(R.id.bulletin_delegate_tag, new bi.i1(this, 2));
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        z3 z3Var = this.y;
        z3Var.U0.j();
        setTag(R.id.bulletin_delegate_tag, null);
        s3 s3Var = z3Var.A1;
        if (s3Var != null) {
            f9 f9Var = ((w8) s3Var).d;
            f9Var.Y0 = false;
            f9Var.V();
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i7, int i10) {
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.y.i0.getLayoutParams();
        layoutParams.rightMargin = org.telegram.messenger.g0.L(42.0f);
        layoutParams.topMargin = org.telegram.messenger.g0.L(15.0f);
        super.onMeasure(i7, i10);
    }
}
