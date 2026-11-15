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
import org.telegram.messenger.np;
import org.telegram.messenger.ns;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.er;
import org.telegram.ui.Components.xb;
import org.telegram.ui.dr0;
import org.telegram.ui.jx;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class e3 extends v {
    public final org.telegram.ui.Components.u5 d;
    public final org.telegram.ui.Components.u5 e;
    public final org.telegram.ui.Components.voip.n f;
    public final org.telegram.ui.Components.u5 h;
    public final org.telegram.ui.Components.u5 n;
    public boolean r;
    public boolean s;
    public final /* synthetic */ y3 w;
    public final /* synthetic */ i9 x;
    public final /* synthetic */ b4 y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e3(b4 b4Var, Context context, y3 y3Var, i9 i9Var) {
        super(context);
        this.y = b4Var;
        this.w = y3Var;
        this.x = i9Var;
        er erVar = er.f;
        this.d = new org.telegram.ui.Components.u5(this, 150L, erVar);
        this.e = new org.telegram.ui.Components.u5(this, 150L, erVar);
        this.f = new org.telegram.ui.Components.voip.n(32, ns.n1, ns.P3);
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
        k6 k6Var;
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
        boolean z10;
        float f16;
        h8 h8Var;
        float f17;
        int i11;
        int i12;
        float f18;
        float f19;
        Paint paint;
        int i13;
        h9 h9Var;
        h9 h9Var2;
        b4 b4Var = this.y;
        float f20 = b4Var.s1;
        a3 a3Var = b4Var.T0;
        a4 a4Var = b4Var.w2;
        z3 z3Var = b4Var.y1;
        u2 u2Var = b4Var.O0;
        if (u2Var.L() || ((z3Var.e && a4Var.a) || (z3Var.f && a4Var.a))) {
            b4 b4Var2 = z3Var.k;
            TL_stories.PeerStories peerStories = b4Var2.e1;
            i9 i9Var = b4Var2.t0;
            if (peerStories == null && (peerStories = b4Var2.C1.y(b4Var2.l1)) == null && (b22 = np.s1(b4Var2.m2).b2(b4Var2.l1)) != null) {
                peerStories = b22.stories;
            }
            if (b4Var2.u1 && (storyItem2 = z3Var.a) != null && peerStories != null && ((!l7.v(storyItem2) && ((i7 = z3Var.a.id) > peerStories.max_read_id || i7 > b4Var2.C1.f.get(b4Var2.l1, 0))) || b4Var2.m1)) {
                TL_stories.PeerStories peerStories2 = i9Var.Q0;
                if (peerStories2 == null) {
                    s6 s6Var = b4Var2.C1;
                    long j3 = b4Var2.l1;
                    TL_stories.StoryItem storyItem3 = z3Var.a;
                    TL_stories.PeerStories y10 = s6Var.y(j3);
                    if (y10 == null) {
                        y10 = s6Var.z(j3);
                    }
                    if (s6Var.Y(y10, storyItem3, false)) {
                        i9Var.c1 = true;
                    }
                } else if (b4Var2.C1.Y(peerStories2, z3Var.a, true)) {
                    i9Var.c1 = true;
                }
            } else if (b4Var2.u1 && (storyItem = z3Var.a) != null && (k6Var = i9Var.O0) != null && k6Var.r(storyItem.id)) {
                i9Var.c1 = true;
            }
        }
        hideInterfaceAlpha = b4Var.getHideInterfaceAlpha();
        if (z3Var.e) {
            h9 h9Var3 = (h9) a4Var.c;
            if (h9Var3 != null) {
                i10 = Utilities.i(h9Var3.getPlaybackProgress(b4Var.B2), 1.0f, 0.0f);
                if (a4Var.a && a3Var != null) {
                    a3Var.e();
                }
            } else {
                i10 = 0.0f;
            }
            invalidate();
            f10 = hideInterfaceAlpha;
        } else if (b4Var.B1 || !b4Var.u1 || b4Var.D1 || b4Var.E1 || b4Var.F1 || !u2Var.L()) {
            f10 = hideInterfaceAlpha;
            i10 = Utilities.i(b4Var.G0 / 10000.0f, 1.0f, 0.0f);
        } else {
            long currentTimeMillis = System.currentTimeMillis();
            long j10 = b4Var.H0;
            if (j10 == 0 || b4Var.T2) {
                f10 = hideInterfaceAlpha;
            } else {
                f10 = hideInterfaceAlpha;
                if (b4Var.G0 <= 0 && currentTimeMillis - j10 > 0 && a3Var != null) {
                    a3Var.e();
                }
                b4Var.G0 += currentTimeMillis - b4Var.H0;
            }
            b4Var.H0 = currentTimeMillis;
            i10 = Utilities.i(b4Var.G0 / 10000.0f, 1.0f, 0.0f);
            invalidate();
        }
        if (a4Var != null && (h9Var2 = (h9) a4Var.c) != null) {
            f11 = h9Var2.currentSeek;
        }
        f11 = i10;
        if (!b4Var.I0 && i10 == 1.0f && ((!z3Var.e || !b4Var.T2) && !b4Var.v2)) {
            b4Var.I0 = true;
            post(new c1(this, 4));
        }
        i9 i9Var2 = this.x;
        k6 k6Var2 = i9Var2.O0;
        if (k6Var2 == null || k6Var2.e == 3) {
            f12 = 1.0f;
            f13 = 4.0f;
            f14 = 2.0f;
            f15 = 8.0f;
        } else {
            if (b4Var.a1 == null) {
                b4Var.a1 = new m6.n(5);
            }
            m6.n nVar = b4Var.a1;
            f13 = 4.0f;
            float f21 = (1.0f - b4Var.O3) * f10 * f20;
            int i14 = b4Var.v1;
            f12 = 1.0f;
            int g10 = i9Var2.O0.g();
            f14 = 2.0f;
            x3 x3Var = b4Var.Y0;
            f15 = 8.0f;
            org.telegram.ui.Components.g6 g6Var = (org.telegram.ui.Components.g6) nVar.d;
            int i15 = (g10 << 12) + i14;
            if (nVar.a != i15) {
                nVar.a = i15;
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                spannableStringBuilder.append((CharSequence) String.valueOf(i14 + 1)).append((CharSequence) nVar.b).append((CharSequence) "/").append((CharSequence) nVar.c).append((CharSequence) String.valueOf(g10));
                g6Var.t(spannableStringBuilder, false, true);
            }
            canvas.save();
            float y11 = x3Var.getY();
            w3 w3Var = x3Var.b;
            float top = ((g6Var.e / 2.0f) + (y11 + w3Var.getTop())) - 1.0f;
            w3Var.setRightPadding((int) g6Var.c());
            canvas.translate((w3Var.getRightDrawableWidth() + (w3Var.getTextWidth() + (w3Var.getLeft() + (x3Var.getLeft() + org.telegram.messenger.g0.L(4.0f))))) - Utilities.j(((w3Var.getRightDrawableWidth() + w3Var.getTextWidth()) + r0) - w3Var.getWidth(), r0, 0), top);
            float L = org.telegram.messenger.g0.L(8.0f);
            float L2 = org.telegram.messenger.g0.L(2.0f);
            org.telegram.messenger.g0.P.set(-L, -L2, g6Var.c() + L, g6Var.e + L2);
            g6Var.C = (int) (f21 * 160.0f);
            g6Var.draw(canvas);
            canvas.restore();
        }
        canvas.save();
        canvas.translate(0.0f, org.telegram.messenger.g0.L(f15) - (org.telegram.messenger.g0.L(f15) * b4Var.O3));
        boolean z11 = z3Var.e && (h9Var = (h9) a4Var.c) != null && h9Var.isBuffering();
        boolean z12 = b4Var.v2;
        boolean z13 = z12 && z3Var != null && z3Var.e && i9Var2.l0;
        float d = b4Var.z2.d(!z12 || z13);
        h8 h8Var2 = b4Var.Z0;
        int measuredWidth = getMeasuredWidth();
        int i16 = b4Var.w1;
        int i17 = b4Var.x1;
        float f22 = (f12 - b4Var.O3) * f20;
        TextPaint textPaint = h8Var2.c;
        if (i17 > 0) {
            boolean z14 = z11 && !z13;
            if (h8Var2.i != i16) {
                h8Var2.g = 0.0f;
                h8Var2.h = true;
            }
            h8Var2.i = i16;
            y3 y3Var = h8Var2.a;
            Paint paint2 = y3Var.a;
            Paint paint3 = y3Var.b;
            int L3 = i17 > 100 ? 1 : i17 >= 50 ? org.telegram.messenger.g0.L(f12) : org.telegram.messenger.g0.L(f14);
            float L4 = ((measuredWidth - org.telegram.messenger.g0.L(10.0f)) - ((i17 - 1) * L3)) / i17;
            org.telegram.messenger.g0.L(5.0f);
            float min = Math.min(L4 / f14, org.telegram.messenger.g0.L(f12));
            float d2 = h8Var2.b.d(z13);
            if (d2 > 0.0f) {
                float T1 = org.telegram.messenger.g0.T1(i10, f11, d2);
                canvas.save();
                textPaint.setAlpha((int) (d2 * 255.0f));
                z10 = z14;
                textPaint.setShadowLayer(org.telegram.messenger.g0.L(3.0f), 0.0f, org.telegram.messenger.g0.L(f12), org.telegram.ui.ActionBar.j6.r1(d2, 805306368));
                canvas.translate(((measuredWidth - h8Var2.f) / f14) - h8Var2.e, org.telegram.messenger.g0.W1(d2, org.telegram.messenger.g0.L(f13), org.telegram.messenger.g0.L(16.0f)));
                h8Var2.d.draw(canvas);
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
                        h8Var = h8Var2;
                        f17 = i10;
                        i11 = measuredWidth;
                        i12 = i17;
                        i18++;
                        min = f16;
                        i17 = i12;
                        i10 = f17;
                        measuredWidth = i11;
                        h8Var2 = h8Var;
                    } else if (f22 > 0.0f) {
                        float T12 = org.telegram.messenger.g0.T1(min, org.telegram.messenger.g0.N(f14), d2);
                        if (i18 > i16 || i18 != i16) {
                            f16 = min;
                            h8Var = h8Var2;
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
                            if (z10) {
                                if (h8Var2.h) {
                                    float f24 = h8Var2.g + 0.026666667f;
                                    h8Var2.g = f24;
                                    if (f24 > 0.5f) {
                                        h8Var2.h = false;
                                    }
                                } else {
                                    float f25 = h8Var2.g - 0.026666667f;
                                    h8Var2.g = f25;
                                    if (f25 < -0.5f) {
                                        h8Var2.h = true;
                                    }
                                }
                                f18 = T12;
                                i13 = (int) (h8Var2.g * 51.0f * f22 * d);
                            } else {
                                f18 = T12;
                                i13 = 0;
                            }
                            paint2.setAlpha(((int) (85.0f * f22 * d)) + i13);
                            if (d2 > 0.0f) {
                                int i19 = i18 - i16;
                                h8Var = h8Var2;
                                rectF.left = Utilities.i(org.telegram.messenger.g0.T1(rectF.left, org.telegram.messenger.g0.L(5.0f) + (i19 * i11), d2), i11 - org.telegram.messenger.g0.L(5.0f), org.telegram.messenger.g0.L(5.0f));
                                rectF.right = Utilities.i(org.telegram.messenger.g0.T1(rectF.right, ((i19 + 1) * i11) - org.telegram.messenger.g0.L(5.0f), d2), i11 - org.telegram.messenger.g0.L(5.0f), org.telegram.messenger.g0.L(5.0f));
                            } else {
                                h8Var = h8Var2;
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
                        h8Var2 = h8Var;
                    }
                }
                f16 = min;
                h8Var = h8Var2;
                f17 = i10;
                i11 = measuredWidth;
                i12 = i17;
                i18++;
                min = f16;
                i17 = i12;
                i10 = f17;
                measuredWidth = i11;
                h8Var2 = h8Var;
            }
        }
        canvas.restore();
    }

    /* JADX WARN: Code restructure failed: missing block: B:226:0x01d5, code lost:
    
        if (((fi.h9) r2.c).paused != false) goto L81;
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
        y3 y3Var;
        ?? r15;
        float hideInterfaceAlpha;
        float f10;
        float f11;
        float f12;
        float f13;
        boolean z10;
        jx jxVar;
        g4 g4Var;
        boolean z11;
        float f14;
        boolean z12;
        org.telegram.ui.Components.u5 u5Var;
        boolean L;
        ui.f fVar;
        h9 h9Var;
        k8 k8Var;
        Canvas canvas2 = canvas;
        b4 b4Var = this.y;
        e3 e3Var = b4Var.M0;
        a3 a3Var = b4Var.T0;
        z3 z3Var = b4Var.y1;
        u2 u2Var = b4Var.O0;
        a4 a4Var = b4Var.w2;
        i3 i3Var = b4Var.u0;
        if (!b4Var.u1) {
            b4Var.Y0.a.getImageReceiver().O0(true, true);
        }
        boolean z13 = b4Var.M2;
        y3 y3Var2 = this.w;
        if (z13) {
            c10 = 0;
            canvas2.drawColor(i0.a.f(0.2f, -16777216, -1));
        } else {
            if (((org.telegram.ui.j4) a4Var.e) != null || (a3Var != null && (((k8Var = a3Var.b) != null && (k8Var.x || k8Var.s)) || a3Var.E.i))) {
                invalidate();
            }
            canvas2.save();
            dr0 dr0Var = b4Var.H2;
            if (dr0Var.n) {
                canvas2.save();
                float f15 = dr0Var.O;
                float f16 = dr0Var.A;
                float f17 = ((f15 * f16) + 1.0f) - f16;
                canvas2.scale(f17, f17, dr0Var.o + dr0Var.s, dr0Var.p + dr0Var.t);
                float f18 = dr0Var.o;
                float f19 = dr0Var.J;
                float f20 = dr0Var.A;
                canvas2.translate((f19 * f20) + f18, (dr0Var.K * f20) + dr0Var.p);
            }
            org.telegram.ui.j4 j4Var = (org.telegram.ui.j4) a4Var.e;
            if (j4Var == null || (!a4Var.a && ((e1) a4Var.b) == null)) {
                if (j4Var != null) {
                    invalidate();
                }
                if (z3Var.d) {
                    canvas2.drawColor(i0.a.f(0.2f, -16777216, -1));
                } else {
                    if (!u2Var.I()) {
                        y3Var2.f.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight() + 1);
                        y3Var2.f.draw(canvas2);
                    }
                    f14 = 0.0f;
                    u2Var.y0(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight() + 1);
                    u2Var.h(canvas2, null);
                    canvas2.restore();
                    z12 = b4Var.I2;
                    org.telegram.ui.Components.u5 u5Var2 = this.h;
                    u5Var = this.n;
                    if (z12) {
                        u5Var2.e(true, f14);
                        u5Var.e(true, f14);
                    }
                    if (!z3Var.f) {
                        e1 e1Var = (e1) a4Var.b;
                        if (e1Var != null) {
                            if (!a4Var.a) {
                            }
                            L = true;
                        }
                        L = false;
                    } else if (z3Var.e) {
                        if (((org.telegram.ui.j4) a4Var.e) != null) {
                            h9 h9Var2 = (h9) a4Var.c;
                            if (h9Var2 != null) {
                                if (a4Var.a) {
                                    if (h9Var2.progress == 0.0f) {
                                        if (h9Var2 != null) {
                                            if (h9Var2.isBuffering()) {
                                            }
                                        }
                                    }
                                    L = true;
                                }
                            }
                        }
                        L = false;
                    } else {
                        L = u2Var.L();
                    }
                    u5Var2.e(false, (b4Var.u1 || L || z3Var.b != null) ? 0.0f : 1.0f);
                    u5Var.e(false, u5Var2.c != 1.0f ? 1.0f : 0.0f);
                    if (u5Var.c > 0.0f) {
                        RectF rectF = org.telegram.messenger.g0.P;
                        rectF.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                        int i7 = (int) (u5Var.c * 255.0f);
                        org.telegram.ui.Components.voip.n nVar = this.f;
                        nVar.a.setAlpha(i7);
                        nVar.c.setAlpha(i7);
                        nVar.f = getMeasuredWidth() * 2;
                        nVar.n = 1.3f;
                        nVar.a(org.telegram.messenger.g0.L(10.0f), canvas2, rectF, this);
                    }
                    b4Var.I2 = false;
                    c10 = 0;
                }
            } else {
                if (!u2Var.I()) {
                    y3Var2.f.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight() + 1);
                    y3Var2.f.draw(canvas2);
                }
                u2Var.y0(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight() + 1);
                u2Var.h(canvas2, null);
                if (b4Var.u1) {
                    i9 i9Var = this.x;
                    boolean z14 = i9Var.a;
                    if (z14 && (h9Var = (h9) a4Var.c) != null && h9Var.paused && h9Var.playerStubBitmap != null && h9Var.stubAvailable) {
                        canvas2.save();
                        canvas2.scale(getMeasuredWidth() / ((h9) a4Var.c).playerStubBitmap.getWidth(), getMeasuredHeight() / ((h9) a4Var.c).playerStubBitmap.getHeight());
                        h9 h9Var3 = (h9) a4Var.c;
                        canvas2.drawBitmap(h9Var3.playerStubBitmap, 0.0f, 0.0f, h9Var3.playerStubPaint);
                        canvas2.restore();
                    } else {
                        boolean z15 = Build.VERSION.SDK_INT >= 29 && (fVar = b4Var.r3) != null && canvas2 == fVar.s;
                        if (!z14 || (b4Var.L0 && !i9Var.H0 && !z15)) {
                            ((org.telegram.ui.j4) a4Var.e).draw(canvas2);
                        }
                    }
                }
            }
            f14 = 0.0f;
            canvas2.restore();
            z12 = b4Var.I2;
            org.telegram.ui.Components.u5 u5Var22 = this.h;
            u5Var = this.n;
            if (z12) {
            }
            if (!z3Var.f) {
            }
            u5Var22.e(false, (b4Var.u1 || L || z3Var.b != null) ? 0.0f : 1.0f);
            u5Var.e(false, u5Var22.c != 1.0f ? 1.0f : 0.0f);
            if (u5Var.c > 0.0f) {
            }
            b4Var.I2 = false;
            c10 = 0;
        }
        if (i3Var.getAlpha() > 0.0f) {
            if (i3Var.getAlpha() == 1.0f) {
                canvas2.save();
                y3Var = y3Var2;
                z11 = false;
            } else {
                z11 = false;
                y3Var = y3Var2;
                canvas2.saveLayerAlpha(0.0f, 0.0f, i3Var.getMeasuredWidth(), i3Var.getMeasuredHeight(), (int) (i3Var.getAlpha() * 255.0f), 31);
            }
            a3Var.draw(canvas2);
            canvas2.restore();
            r15 = z11;
        } else {
            y3Var = y3Var2;
            r15 = 0;
        }
        if (!b4Var.J0 && u2Var.L()) {
            b4Var.J0 = true;
            b4Var.invalidate();
        }
        hideInterfaceAlpha = b4Var.getHideInterfaceAlpha();
        Drawable drawable = y3Var.d;
        Paint paint = y3Var.c;
        Drawable drawable2 = y3Var.e;
        drawable.setAlpha(ns.e4);
        y3Var.d.draw(canvas2);
        if (b4Var.m1 || !b4Var.h2 || i3Var.getVisibility() == 0) {
            if (i3Var.getVisibility() == 0) {
                int L2 = org.telegram.messenger.g0.L(72.0f);
                int top = i3Var.getTop() + ((int) (i3Var.getTextTop() - org.telegram.messenger.g0.L(24.0f)));
                int i10 = L2 + top;
                float measuredHeight = getMeasuredHeight() * 0.65f;
                if ((measuredHeight - top) / org.telegram.messenger.g0.L(60.0f) > 0.0f && i3Var.x0 && i3Var.s0.getBottom() - i3Var.getMeasuredHeight() > 0) {
                    if ((measuredHeight - (i3Var.getTop() + ((int) (i3Var.getMaxTop() - org.telegram.messenger.g0.L(24.0f))))) / org.telegram.messenger.g0.L(60.0f) > 0.0f) {
                        b4Var.Q2 = true;
                    }
                    f10 = 0.0f;
                } else if (b4Var.R2) {
                    b4Var.R2 = r15;
                    f10 = 0.0f;
                    if ((measuredHeight - (i3Var.getTop() + ((int) (i3Var.getMaxTop() - org.telegram.messenger.g0.L(24.0f))))) / org.telegram.messenger.g0.L(60.0f) > 0.0f) {
                        b4Var.Q2 = true;
                    }
                } else {
                    f10 = 0.0f;
                    if (i3Var.getProgressToBlackout() == 0.0f) {
                        b4Var.Q2 = r15;
                    }
                }
                float e10 = this.e.e(r15, b4Var.Q2 ? 1.0f : f10);
                if (e10 > f10) {
                    this.r = true;
                    this.s = r15;
                    super.dispatchDraw(canvas);
                    this.r = r15;
                    b(canvas);
                    paint.setColor(i0.a.o(-16777216, (int) (153.0f * e10 * hideInterfaceAlpha)));
                    canvas2.drawPaint(paint);
                }
                if (e10 < 1.0f && !z3Var.f) {
                    canvas2.save();
                    float f21 = 1.0f - e10;
                    paint.setColor(i0.a.o(-16777216, (int) (129.03f * f21 * hideInterfaceAlpha)));
                    drawable2.setAlpha((int) (f21 * 255.0f * hideInterfaceAlpha));
                    drawable2.setBounds(r15, top, getMeasuredWidth(), i10);
                    drawable2.draw(canvas2);
                    canvas2.drawRect(0.0f, i10, getMeasuredWidth(), getMeasuredHeight(), paint);
                    canvas.restore();
                }
                if (e10 <= f10 || i3Var.getAlpha() <= 0.0f) {
                    canvas2 = canvas;
                } else {
                    if (i3Var.u0) {
                        i3Var.u0 = r15;
                        i3Var.invalidate();
                    }
                    if (i3Var.getAlpha() != 1.0f) {
                        canvas2 = canvas;
                        canvas2.saveLayerAlpha(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), (int) (i3Var.getAlpha() * 255.0f), 31);
                    } else {
                        canvas2 = canvas;
                        canvas2.save();
                    }
                    canvas2.translate(i3Var.getX(), i3Var.getY() - i3Var.getScrollY());
                    i3Var.draw(canvas2);
                    canvas2.restore();
                }
                boolean z16 = e10 > f10 ? true : r15;
                if (i3Var.u0 != z16) {
                    i3Var.u0 = z16;
                    i3Var.invalidate();
                }
                if (e10 > f10) {
                    this.r = true;
                    this.s = true;
                    super.dispatchDraw(canvas);
                    this.r = r15;
                }
                f11 = e10;
                f12 = b4Var.W0;
                if (f12 != 0.0f || (g4Var = b4Var.V0) == null) {
                    f13 = 1.0f;
                    z10 = true;
                } else {
                    float f22 = b4Var.k3;
                    int measuredWidth = getMeasuredWidth();
                    z10 = true;
                    int measuredHeight2 = getMeasuredHeight() + 1;
                    h4 h4Var = g4Var.f;
                    ImageReceiver imageReceiver = g4Var.a;
                    float f23 = (float) r15;
                    imageReceiver.y0(f23, f23, measuredWidth, measuredHeight2);
                    imageReceiver.setAlpha(f12);
                    imageReceiver.h(canvas2, null);
                    f13 = 1.0f;
                    imageReceiver.setAlpha(1.0f);
                    if (g4Var.c != null) {
                        int i11 = (int) (f12 * 255.0f);
                        g4Var.d.setAlpha(i11);
                        GradientDrawable gradientDrawable = h4Var.I;
                        gradientDrawable.setAlpha(i11);
                        gradientDrawable.setBounds((int) imageReceiver.L0, (int) (imageReceiver.A() - (org.telegram.messenger.g0.L(24.0f) * f22)), (int) imageReceiver.y(), ((int) imageReceiver.A()) + 2);
                        gradientDrawable.draw(canvas2);
                        canvas2.save();
                        canvas2.scale(f22, f22, imageReceiver.r(), imageReceiver.A() - (org.telegram.messenger.g0.L(8.0f) * f22));
                        canvas2.translate(imageReceiver.r() - (h4Var.K / 2.0f), (imageReceiver.A() - (org.telegram.messenger.g0.L(8.0f) * f22)) - g4Var.c.getHeight());
                        g4Var.c.draw(canvas2);
                        canvas2.restore();
                    }
                }
                this.d.e(r15, !b4Var.q2 ? f13 : 0.0f);
                if (b4Var.u1) {
                    boolean z17 = (i3Var.getVisibility() == 0 && (b4Var.Q2 || i3Var.x0)) ? z10 : r15;
                    b4Var.T2 = (i3Var.getVisibility() != 0 || i3Var.getProgressToBlackout() <= 0.0f) ? r15 : z10;
                    i9 i9Var2 = ((z8) b4Var.A1).d;
                    i9Var2.L0 = z17;
                    i9Var2.V();
                    ((z8) b4Var.A1).d.m1 = b4Var.T2;
                }
                if (f11 <= 0.0f) {
                    super.dispatchDraw(canvas);
                    b(canvas);
                }
                jxVar = b4Var.U0;
                if (jxVar == null) {
                    jxVar.e(canvas2);
                    return;
                }
                return;
            }
            if (!z3Var.f) {
                int L3 = org.telegram.messenger.g0.L(b4Var.h2 ? 56.0f : 110.0f);
                if ((b4Var.m1 || !b4Var.h2) && i3Var.getVisibility() == 0) {
                    L3 = (int) (L3 * 2.5f);
                }
                drawable2.setBounds(r15, e3Var.getMeasuredHeight() - L3, getMeasuredWidth(), e3Var.getMeasuredHeight());
                drawable2.setAlpha((int) (hideInterfaceAlpha * 255.0f));
                drawable2.draw(canvas2);
            }
        }
        f11 = 0.0f;
        f12 = b4Var.W0;
        if (f12 != 0.0f) {
        }
        f13 = 1.0f;
        z10 = true;
        this.d.e(r15, !b4Var.q2 ? f13 : 0.0f);
        if (b4Var.u1) {
        }
        if (f11 <= 0.0f) {
        }
        jxVar = b4Var.U0;
        if (jxVar == null) {
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        e1 e1Var;
        b4 b4Var = this.y;
        a4 a4Var = b4Var.w2;
        if (!b4Var.u1 || b4Var.M2 || ((org.telegram.ui.j4) a4Var.e) == null || (e1Var = (e1) a4Var.b) == null || !e1Var.n() || !((org.telegram.ui.j4) a4Var.e).dispatchTouchEvent(motionEvent)) {
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
        xb xbVar = xb.w;
        if (xbVar == null || view != xbVar.e) {
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
        setTag(R.id.bulletin_delegate_tag, new bi.e1(this, 2));
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        b4 b4Var = this.y;
        b4Var.U0.j();
        setTag(R.id.bulletin_delegate_tag, null);
        u3 u3Var = b4Var.A1;
        if (u3Var != null) {
            i9 i9Var = ((z8) u3Var).d;
            i9Var.Y0 = false;
            i9Var.V();
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
