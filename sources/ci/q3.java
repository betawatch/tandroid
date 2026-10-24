package ci;

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
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.bs;
import org.telegram.ui.Components.qc;
import org.telegram.ui.qy;
import org.telegram.ui.yu0;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes4.dex */
public final class q3 extends w {
    public final org.telegram.ui.Components.f6 d;
    public final org.telegram.ui.Components.f6 e;
    public final org.telegram.ui.Components.voip.h f;
    public final org.telegram.ui.Components.f6 h;
    public final org.telegram.ui.Components.f6 n;
    public boolean r;
    public boolean s;
    public final /* synthetic */ m4 v;
    public final /* synthetic */ z9 w;
    public final /* synthetic */ p4 x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q3(p4 p4Var, Context context, m4 m4Var, z9 z9Var) {
        super(context);
        this.x = p4Var;
        this.v = m4Var;
        this.w = z9Var;
        bs bsVar = bs.f;
        this.d = new org.telegram.ui.Components.f6(this, 150L, bsVar);
        this.e = new org.telegram.ui.Components.f6(this, 150L, bsVar);
        this.f = new org.telegram.ui.Components.voip.h(32, 102, 240);
        org.telegram.ui.Components.f6 f6Var = new org.telegram.ui.Components.f6(this);
        this.h = f6Var;
        org.telegram.ui.Components.f6 f6Var2 = new org.telegram.ui.Components.f6(this);
        this.n = f6Var2;
        f6Var.g = 500L;
        f6Var2.g = 100L;
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0157, code lost:
    
        if (r4 >= 0.0f) goto L95;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b(Canvas canvas) {
        TL_stories.StoryItem storyItem;
        z6 z6Var;
        TL_stories.StoryItem storyItem2;
        int i10;
        TLRPC.UserFull userFull;
        float hideInterfaceAlpha;
        float f7;
        float clamp;
        float f10;
        float f11;
        float f12;
        float f13;
        float f14;
        boolean z10;
        float f15;
        y8 y8Var;
        float f16;
        int i11;
        int i12;
        float f17;
        float f18;
        Paint paint;
        int i13;
        y9 y9Var;
        y9 y9Var2;
        p4 p4Var = this.x;
        float f19 = p4Var.I1;
        m3 m3Var = p4Var.j1;
        o4 o4Var = p4Var.M2;
        n4 n4Var = p4Var.O1;
        f3 f3Var = p4Var.e1;
        if (f3Var.hasNotThumb() || ((n4Var.e && o4Var.a) || (n4Var.f && o4Var.a))) {
            p4 p4Var2 = n4Var.k;
            TL_stories.PeerStories peerStories = p4Var2.u1;
            z9 z9Var = p4Var2.J0;
            if (peerStories == null && (peerStories = p4Var2.S1.y(p4Var2.B1)) == null && (userFull = MessagesController.getInstance(p4Var2.C2).getUserFull(p4Var2.B1)) != null) {
                peerStories = userFull.stories;
            }
            if (p4Var2.K1 && (storyItem2 = n4Var.a) != null && peerStories != null && ((!c8.v(storyItem2) && ((i10 = n4Var.a.id) > peerStories.max_read_id || i10 > p4Var2.S1.f.get(p4Var2.B1, 0))) || p4Var2.C1)) {
                TL_stories.PeerStories peerStories2 = z9Var.Q0;
                if (peerStories2 == null) {
                    h7 h7Var = p4Var2.S1;
                    long j10 = p4Var2.B1;
                    TL_stories.StoryItem storyItem3 = n4Var.a;
                    TL_stories.PeerStories y3 = h7Var.y(j10);
                    if (y3 == null) {
                        y3 = h7Var.z(j10);
                    }
                    if (h7Var.V(y3, storyItem3, false)) {
                        z9Var.c1 = true;
                    }
                } else if (p4Var2.S1.V(peerStories2, n4Var.a, true)) {
                    z9Var.c1 = true;
                }
            } else if (p4Var2.K1 && (storyItem = n4Var.a) != null && (z6Var = z9Var.O0) != null && z6Var.r(storyItem.id)) {
                z9Var.c1 = true;
            }
        }
        hideInterfaceAlpha = p4Var.getHideInterfaceAlpha();
        if (n4Var.e) {
            y9 y9Var3 = (y9) o4Var.c;
            if (y9Var3 != null) {
                clamp = Utilities.clamp(y9Var3.getPlaybackProgress(p4Var.R2), 1.0f, 0.0f);
                if (o4Var.a && m3Var != null) {
                    m3Var.e();
                }
            } else {
                clamp = 0.0f;
            }
            invalidate();
            f7 = hideInterfaceAlpha;
        } else if (p4Var.R1 || !p4Var.K1 || p4Var.T1 || p4Var.U1 || p4Var.V1 || !f3Var.hasNotThumb()) {
            f7 = hideInterfaceAlpha;
            clamp = Utilities.clamp(p4Var.W0 / 10000.0f, 1.0f, 0.0f);
        } else {
            long currentTimeMillis = System.currentTimeMillis();
            long j11 = p4Var.X0;
            if (j11 == 0 || p4Var.j3) {
                f7 = hideInterfaceAlpha;
            } else {
                f7 = hideInterfaceAlpha;
                if (p4Var.W0 <= 0 && currentTimeMillis - j11 > 0 && m3Var != null) {
                    m3Var.e();
                }
                p4Var.W0 += currentTimeMillis - p4Var.X0;
            }
            p4Var.X0 = currentTimeMillis;
            clamp = Utilities.clamp(p4Var.W0 / 10000.0f, 1.0f, 0.0f);
            invalidate();
        }
        if (o4Var != null && (y9Var2 = (y9) o4Var.c) != null) {
            f10 = y9Var2.currentSeek;
        }
        f10 = clamp;
        if (!p4Var.Y0 && clamp == 1.0f && ((!n4Var.e || !p4Var.j3) && !p4Var.L2)) {
            p4Var.Y0 = true;
            post(new androidx.fragment.app.d(this, 11));
        }
        z9 z9Var2 = this.w;
        z6 z6Var2 = z9Var2.O0;
        if (z6Var2 == null || z6Var2.e == 3) {
            f11 = 1.0f;
            f12 = 4.0f;
            f13 = 2.0f;
            f14 = 8.0f;
        } else {
            if (p4Var.q1 == null) {
                p4Var.q1 = new j6.l(5);
            }
            j6.l lVar = p4Var.q1;
            f12 = 4.0f;
            float f20 = (1.0f - p4Var.d4) * f7 * f19;
            int i14 = p4Var.L1;
            f11 = 1.0f;
            int g10 = z9Var2.O0.g();
            f13 = 2.0f;
            l4 l4Var = p4Var.o1;
            f14 = 8.0f;
            org.telegram.ui.Components.p6 p6Var = (org.telegram.ui.Components.p6) lVar.d;
            int i15 = (g10 << 12) + i14;
            if (lVar.a != i15) {
                lVar.a = i15;
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                spannableStringBuilder.append((CharSequence) String.valueOf(i14 + 1)).append((CharSequence) lVar.b).append((CharSequence) "/").append((CharSequence) lVar.c).append((CharSequence) String.valueOf(g10));
                p6Var.t(spannableStringBuilder, false, true);
            }
            canvas.save();
            float y10 = l4Var.getY();
            k4 k4Var = l4Var.b;
            float top = ((p6Var.e / 2.0f) + (y10 + k4Var.getTop())) - 1.0f;
            k4Var.setRightPadding((int) p6Var.c());
            canvas.translate((k4Var.getRightDrawableWidth() + (k4Var.getTextWidth() + (k4Var.getLeft() + (l4Var.getLeft() + AndroidUtilities.dp(4.0f))))) - Utilities.clamp(((k4Var.getRightDrawableWidth() + k4Var.getTextWidth()) + r0) - k4Var.getWidth(), r0, 0), top);
            float dp = AndroidUtilities.dp(8.0f);
            float dp2 = AndroidUtilities.dp(2.0f);
            AndroidUtilities.rectTmp.set(-dp, -dp2, p6Var.c() + dp, p6Var.e + dp2);
            p6Var.B = (int) (f20 * 160.0f);
            p6Var.draw(canvas);
            canvas.restore();
        }
        canvas.save();
        canvas.translate(0.0f, AndroidUtilities.dp(f14) - (AndroidUtilities.dp(f14) * p4Var.d4));
        boolean z11 = n4Var.e && (y9Var = (y9) o4Var.c) != null && y9Var.isBuffering();
        boolean z12 = p4Var.L2;
        boolean z13 = z12 && n4Var != null && n4Var.e && z9Var2.k0;
        float e = p4Var.P2.e(!z12 || z13);
        y8 y8Var2 = p4Var.p1;
        int measuredWidth = getMeasuredWidth();
        int i16 = p4Var.M1;
        int i17 = p4Var.N1;
        float f21 = (f11 - p4Var.d4) * f19;
        TextPaint textPaint = y8Var2.c;
        if (i17 > 0) {
            boolean z14 = z11 && !z13;
            if (y8Var2.i != i16) {
                y8Var2.g = 0.0f;
                y8Var2.h = true;
            }
            y8Var2.i = i16;
            m4 m4Var = y8Var2.a;
            Paint paint2 = m4Var.a;
            Paint paint3 = m4Var.b;
            int dp3 = i17 > 100 ? 1 : i17 >= 50 ? AndroidUtilities.dp(f11) : AndroidUtilities.dp(f13);
            float dp4 = ((measuredWidth - AndroidUtilities.dp(10.0f)) - ((i17 - 1) * dp3)) / i17;
            AndroidUtilities.dp(5.0f);
            float min = Math.min(dp4 / f13, AndroidUtilities.dp(f11));
            float e7 = y8Var2.b.e(z13);
            if (e7 > 0.0f) {
                float lerp = AndroidUtilities.lerp(clamp, f10, e7);
                canvas.save();
                textPaint.setAlpha((int) (e7 * 255.0f));
                z10 = z14;
                textPaint.setShadowLayer(AndroidUtilities.dp(3.0f), 0.0f, AndroidUtilities.dp(f11), org.telegram.ui.ActionBar.k6.o1(e7, 805306368));
                canvas.translate(((measuredWidth - y8Var2.f) / f13) - y8Var2.e, AndroidUtilities.lerp(AndroidUtilities.dp(f12), AndroidUtilities.dp(16.0f), e7));
                y8Var2.d.draw(canvas);
                canvas.restore();
                clamp = lerp;
            } else {
                z10 = z14;
            }
            int i18 = 0;
            while (i18 < i17) {
                float dp5 = (i18 * dp4) + AndroidUtilities.dp(5.0f) + (-0.0f) + (dp3 * i18);
                if (dp5 <= measuredWidth) {
                    float f22 = dp5 + dp4;
                    if (f22 < 0.0f) {
                        f15 = min;
                        y8Var = y8Var2;
                        f16 = clamp;
                        i11 = measuredWidth;
                        i12 = i17;
                        i18++;
                        min = f15;
                        i17 = i12;
                        clamp = f16;
                        measuredWidth = i11;
                        y8Var2 = y8Var;
                    } else if (f21 > 0.0f) {
                        float lerp2 = AndroidUtilities.lerp(min, AndroidUtilities.dpf2(f13), e7);
                        if (i18 > i16 || i18 != i16) {
                            f15 = min;
                            y8Var = y8Var2;
                            f16 = clamp;
                            i11 = measuredWidth;
                            f17 = lerp2;
                            f18 = f11;
                        } else {
                            f15 = min;
                            RectF rectF = AndroidUtilities.rectTmp;
                            f16 = clamp;
                            i11 = measuredWidth;
                            rectF.set(dp5, 0.0f, f22, AndroidUtilities.lerp(AndroidUtilities.dpf2(f13), AndroidUtilities.dpf2(5.0f), (i16 == i18 ? 1 : 0) * e7));
                            if (z10) {
                                if (y8Var2.h) {
                                    float f23 = y8Var2.g + 0.026666667f;
                                    y8Var2.g = f23;
                                    if (f23 > 0.5f) {
                                        y8Var2.h = false;
                                    }
                                } else {
                                    float f24 = y8Var2.g - 0.026666667f;
                                    y8Var2.g = f24;
                                    if (f24 < -0.5f) {
                                        y8Var2.h = true;
                                    }
                                }
                                f17 = lerp2;
                                i13 = (int) (y8Var2.g * 51.0f * f21 * e);
                            } else {
                                f17 = lerp2;
                                i13 = 0;
                            }
                            paint2.setAlpha(((int) (85.0f * f21 * e)) + i13);
                            if (e7 > 0.0f) {
                                int i19 = i18 - i16;
                                y8Var = y8Var2;
                                rectF.left = Utilities.clamp(AndroidUtilities.lerp(rectF.left, AndroidUtilities.dp(5.0f) + (i19 * i11), e7), i11 - AndroidUtilities.dp(5.0f), AndroidUtilities.dp(5.0f));
                                rectF.right = Utilities.clamp(AndroidUtilities.lerp(rectF.right, ((i19 + 1) * i11) - AndroidUtilities.dp(5.0f), e7), i11 - AndroidUtilities.dp(5.0f), AndroidUtilities.dp(5.0f));
                            } else {
                                y8Var = y8Var2;
                            }
                            canvas.drawRoundRect(rectF, f17, f17, paint2);
                            f18 = f16;
                        }
                        RectF rectF2 = AndroidUtilities.rectTmp;
                        i12 = i17;
                        rectF2.set(dp5, 0.0f, f22, AndroidUtilities.lerp(AndroidUtilities.dpf2(f13), AndroidUtilities.dpf2(5.0f), (i16 == i18 ? 1 : 0) * e7));
                        if (e7 > 0.0f) {
                            int i20 = i18 - i16;
                            rectF2.left = Utilities.clamp(AndroidUtilities.lerp(rectF2.left, AndroidUtilities.dp(5.0f) + (i20 * i11), e7), i11 - AndroidUtilities.dp(5.0f), AndroidUtilities.dp(5.0f));
                            rectF2.right = Utilities.clamp(AndroidUtilities.lerp(rectF2.right, ((i20 + 1) * i11) - AndroidUtilities.dp(5.0f), e7), i11 - AndroidUtilities.dp(5.0f), AndroidUtilities.dp(5.0f));
                        }
                        rectF2.right = AndroidUtilities.lerp(rectF2.left, rectF2.right, f18);
                        if (i18 <= i16) {
                            paint3.setAlpha((int) (f21 * 255.0f * e));
                            paint = paint3;
                        } else {
                            paint2.setAlpha((int) (85 * f21 * e));
                            paint = paint2;
                        }
                        canvas.drawRoundRect(rectF2, f17, f17, paint);
                        i18++;
                        min = f15;
                        i17 = i12;
                        clamp = f16;
                        measuredWidth = i11;
                        y8Var2 = y8Var;
                    }
                }
                f15 = min;
                y8Var = y8Var2;
                f16 = clamp;
                i11 = measuredWidth;
                i12 = i17;
                i18++;
                min = f15;
                i17 = i12;
                clamp = f16;
                measuredWidth = i11;
                y8Var2 = y8Var;
            }
        }
        canvas.restore();
    }

    /* JADX WARN: Code restructure failed: missing block: B:225:0x01d3, code lost:
    
        if (((ci.y9) r2.c).paused != false) goto L81;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x01a3, code lost:
    
        if (r4.n() != false) goto L81;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0526  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0530  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0573  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x057d  */
    /* JADX WARN: Removed duplicated region for block: B:136:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:208:0x01f4  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x01a9  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0189  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0195  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x01f1  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x01ff  */
    /* JADX WARN: Type inference failed for: r15v0 */
    /* JADX WARN: Type inference failed for: r15v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r15v8 */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void dispatchDraw(Canvas canvas) {
        float f7;
        ?? r15;
        m4 m4Var;
        float hideInterfaceAlpha;
        float f10;
        float f11;
        float f12;
        float f13;
        boolean z10;
        qy qyVar;
        v4 v4Var;
        boolean z11;
        float f14;
        boolean z12;
        org.telegram.ui.Components.f6 f6Var;
        boolean hasNotThumb;
        gh.d dVar;
        y9 y9Var;
        b9 b9Var;
        Canvas canvas2 = canvas;
        p4 p4Var = this.x;
        q3 q3Var = p4Var.c1;
        m3 m3Var = p4Var.j1;
        n4 n4Var = p4Var.O1;
        f3 f3Var = p4Var.e1;
        o4 o4Var = p4Var.M2;
        u3 u3Var = p4Var.K0;
        if (!p4Var.K1) {
            p4Var.o1.a.getImageReceiver().setVisible(true, true);
        }
        boolean z13 = p4Var.c3;
        m4 m4Var2 = this.v;
        if (z13) {
            f7 = 1.0f;
            canvas2.drawColor(i0.a.f(0.2f, -16777216, -1));
        } else {
            f7 = 1.0f;
            if (((org.telegram.ui.n4) o4Var.e) != null || (m3Var != null && (((b9Var = m3Var.b) != null && (b9Var.w || b9Var.s)) || m3Var.y.i))) {
                invalidate();
            }
            canvas2.save();
            yu0 yu0Var = p4Var.X2;
            if (yu0Var.n) {
                canvas2.save();
                float f15 = yu0Var.O;
                float f16 = yu0Var.A;
                float f17 = ((f15 * f16) + 1.0f) - f16;
                canvas2.scale(f17, f17, yu0Var.o + yu0Var.s, yu0Var.p + yu0Var.t);
                float f18 = yu0Var.o;
                float f19 = yu0Var.J;
                float f20 = yu0Var.A;
                canvas2.translate((f19 * f20) + f18, (yu0Var.K * f20) + yu0Var.p);
            }
            org.telegram.ui.n4 n4Var2 = (org.telegram.ui.n4) o4Var.e;
            if (n4Var2 == null || (!o4Var.a && ((h1) o4Var.b) == null)) {
                if (n4Var2 != null) {
                    invalidate();
                }
                if (n4Var.d) {
                    canvas2.drawColor(i0.a.f(0.2f, -16777216, -1));
                } else {
                    if (!f3Var.hasBitmapImage()) {
                        m4Var2.f.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight() + 1);
                        m4Var2.f.draw(canvas2);
                    }
                    f14 = 0.0f;
                    f3Var.setImageCoords(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight() + 1);
                    f3Var.draw(canvas2);
                    canvas2.restore();
                    z12 = p4Var.Y2;
                    org.telegram.ui.Components.f6 f6Var2 = this.h;
                    f6Var = this.n;
                    if (z12) {
                        f6Var2.d(f14, true);
                        f6Var.d(f14, true);
                    }
                    if (!n4Var.f) {
                        h1 h1Var = (h1) o4Var.b;
                        if (h1Var != null) {
                            if (!o4Var.a) {
                            }
                            hasNotThumb = true;
                        }
                        hasNotThumb = false;
                    } else if (n4Var.e) {
                        if (((org.telegram.ui.n4) o4Var.e) != null) {
                            y9 y9Var2 = (y9) o4Var.c;
                            if (y9Var2 != null) {
                                if (o4Var.a) {
                                    if (y9Var2.progress == 0.0f) {
                                        if (y9Var2 != null) {
                                            if (y9Var2.isBuffering()) {
                                            }
                                        }
                                    }
                                    hasNotThumb = true;
                                }
                            }
                        }
                        hasNotThumb = false;
                    } else {
                        hasNotThumb = f3Var.hasNotThumb();
                    }
                    f6Var2.d((p4Var.K1 || hasNotThumb || n4Var.b != null) ? 0.0f : 1.0f, false);
                    f6Var.d(f6Var2.c != 1.0f ? 1.0f : 0.0f, false);
                    if (f6Var.c > 0.0f) {
                        RectF rectF = AndroidUtilities.rectTmp;
                        rectF.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                        int i10 = (int) (f6Var.c * 255.0f);
                        org.telegram.ui.Components.voip.h hVar = this.f;
                        hVar.a.setAlpha(i10);
                        hVar.c.setAlpha(i10);
                        hVar.f = getMeasuredWidth() * 2;
                        hVar.n = 1.3f;
                        hVar.a(AndroidUtilities.dp(10.0f), canvas2, rectF, this);
                    }
                    p4Var.Y2 = false;
                }
            } else {
                if (!f3Var.hasBitmapImage()) {
                    m4Var2.f.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight() + 1);
                    m4Var2.f.draw(canvas2);
                }
                f3Var.setImageCoords(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight() + 1);
                f3Var.draw(canvas2);
                if (p4Var.K1) {
                    z9 z9Var = this.w;
                    boolean z14 = z9Var.a;
                    if (z14 && (y9Var = (y9) o4Var.c) != null && y9Var.paused && y9Var.playerStubBitmap != null && y9Var.stubAvailable) {
                        canvas2.save();
                        canvas2.scale(getMeasuredWidth() / ((y9) o4Var.c).playerStubBitmap.getWidth(), getMeasuredHeight() / ((y9) o4Var.c).playerStubBitmap.getHeight());
                        y9 y9Var3 = (y9) o4Var.c;
                        canvas2.drawBitmap(y9Var3.playerStubBitmap, 0.0f, 0.0f, y9Var3.playerStubPaint);
                        canvas2.restore();
                    } else {
                        boolean z15 = Build.VERSION.SDK_INT >= 29 && (dVar = p4Var.H3) != null && canvas2 == dVar.r;
                        if (!z14 || (p4Var.b1 && !z9Var.H0 && !z15)) {
                            ((org.telegram.ui.n4) o4Var.e).draw(canvas2);
                        }
                    }
                }
            }
            f14 = 0.0f;
            canvas2.restore();
            z12 = p4Var.Y2;
            org.telegram.ui.Components.f6 f6Var22 = this.h;
            f6Var = this.n;
            if (z12) {
            }
            if (!n4Var.f) {
            }
            f6Var22.d((p4Var.K1 || hasNotThumb || n4Var.b != null) ? 0.0f : 1.0f, false);
            f6Var.d(f6Var22.c != 1.0f ? 1.0f : 0.0f, false);
            if (f6Var.c > 0.0f) {
            }
            p4Var.Y2 = false;
        }
        if (u3Var.getAlpha() > 0.0f) {
            if (u3Var.getAlpha() == f7) {
                canvas2.save();
                z11 = false;
                m4Var = m4Var2;
            } else {
                m4Var = m4Var2;
                z11 = false;
                canvas2.saveLayerAlpha(0.0f, 0.0f, u3Var.getMeasuredWidth(), u3Var.getMeasuredHeight(), (int) (u3Var.getAlpha() * 255.0f), 31);
            }
            m3Var.draw(canvas2);
            canvas2.restore();
            r15 = z11;
        } else {
            r15 = 0;
            m4Var = m4Var2;
        }
        if (!p4Var.Z0 && f3Var.hasNotThumb()) {
            p4Var.Z0 = true;
            p4Var.invalidate();
        }
        hideInterfaceAlpha = p4Var.getHideInterfaceAlpha();
        Drawable drawable = m4Var.d;
        Paint paint = m4Var.c;
        Drawable drawable2 = m4Var.e;
        drawable.setAlpha(255);
        m4Var.d.draw(canvas2);
        if (p4Var.C1 || !p4Var.x2 || u3Var.getVisibility() == 0) {
            if (u3Var.getVisibility() == 0) {
                int dp = AndroidUtilities.dp(72.0f);
                int top = u3Var.getTop() + ((int) (u3Var.getTextTop() - AndroidUtilities.dp(24.0f)));
                int i11 = dp + top;
                float measuredHeight = getMeasuredHeight() * 0.65f;
                if ((measuredHeight - top) / AndroidUtilities.dp(60.0f) > 0.0f && u3Var.w0 && u3Var.r0.getBottom() - u3Var.getMeasuredHeight() > 0) {
                    if ((measuredHeight - (u3Var.getTop() + ((int) (u3Var.getMaxTop() - AndroidUtilities.dp(24.0f))))) / AndroidUtilities.dp(60.0f) > 0.0f) {
                        p4Var.g3 = true;
                    }
                    f10 = 0.0f;
                } else if (p4Var.h3) {
                    p4Var.h3 = r15;
                    f10 = 0.0f;
                    if ((measuredHeight - (u3Var.getTop() + ((int) (u3Var.getMaxTop() - AndroidUtilities.dp(24.0f))))) / AndroidUtilities.dp(60.0f) > 0.0f) {
                        p4Var.g3 = true;
                    }
                } else {
                    f10 = 0.0f;
                    if (u3Var.getProgressToBlackout() == 0.0f) {
                        p4Var.g3 = r15;
                    }
                }
                float d = this.e.d(p4Var.g3 ? f7 : f10, r15);
                if (d > f10) {
                    this.r = true;
                    this.s = r15;
                    super.dispatchDraw(canvas);
                    this.r = r15;
                    b(canvas);
                    paint.setColor(i0.a.o(-16777216, (int) (153.0f * d * hideInterfaceAlpha)));
                    canvas2.drawPaint(paint);
                }
                if (d < f7 && !n4Var.f) {
                    canvas2.save();
                    float f21 = f7 - d;
                    paint.setColor(i0.a.o(-16777216, (int) (129.03f * f21 * hideInterfaceAlpha)));
                    drawable2.setAlpha((int) (f21 * 255.0f * hideInterfaceAlpha));
                    drawable2.setBounds(r15, top, getMeasuredWidth(), i11);
                    drawable2.draw(canvas2);
                    canvas2.drawRect(0.0f, i11, getMeasuredWidth(), getMeasuredHeight(), paint);
                    canvas.restore();
                }
                if (d <= f10 || u3Var.getAlpha() <= 0.0f) {
                    canvas2 = canvas;
                } else {
                    if (u3Var.t0) {
                        u3Var.t0 = r15;
                        u3Var.invalidate();
                    }
                    if (u3Var.getAlpha() != f7) {
                        canvas2 = canvas;
                        canvas2.saveLayerAlpha(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), (int) (u3Var.getAlpha() * 255.0f), 31);
                    } else {
                        canvas2 = canvas;
                        canvas2.save();
                    }
                    canvas2.translate(u3Var.getX(), u3Var.getY() - u3Var.getScrollY());
                    u3Var.draw(canvas2);
                    canvas2.restore();
                }
                boolean z16 = d > f10 ? true : r15;
                if (u3Var.t0 != z16) {
                    u3Var.t0 = z16;
                    u3Var.invalidate();
                }
                if (d > f10) {
                    this.r = true;
                    this.s = true;
                    super.dispatchDraw(canvas);
                    this.r = r15;
                }
                f11 = d;
                f12 = p4Var.m1;
                if (f12 != 0.0f || (v4Var = p4Var.l1) == null) {
                    f13 = f7;
                    z10 = true;
                } else {
                    float f22 = p4Var.A3;
                    int measuredWidth = getMeasuredWidth();
                    z10 = true;
                    int measuredHeight2 = getMeasuredHeight() + 1;
                    w4 w4Var = v4Var.f;
                    ImageReceiver imageReceiver = v4Var.a;
                    float f23 = (float) r15;
                    imageReceiver.setImageCoords(f23, f23, measuredWidth, measuredHeight2);
                    imageReceiver.setAlpha(f12);
                    imageReceiver.draw(canvas2);
                    f13 = f7;
                    imageReceiver.setAlpha(f13);
                    if (v4Var.c != null) {
                        int i12 = (int) (f12 * 255.0f);
                        v4Var.d.setAlpha(i12);
                        GradientDrawable gradientDrawable = w4Var.H;
                        gradientDrawable.setAlpha(i12);
                        gradientDrawable.setBounds((int) imageReceiver.getImageX(), (int) (imageReceiver.getImageY2() - (AndroidUtilities.dp(24.0f) * f22)), (int) imageReceiver.getImageX2(), ((int) imageReceiver.getImageY2()) + 2);
                        gradientDrawable.draw(canvas2);
                        canvas2.save();
                        canvas2.scale(f22, f22, imageReceiver.getCenterX(), imageReceiver.getImageY2() - (AndroidUtilities.dp(8.0f) * f22));
                        canvas2.translate(imageReceiver.getCenterX() - (w4Var.J / 2.0f), (imageReceiver.getImageY2() - (AndroidUtilities.dp(8.0f) * f22)) - v4Var.c.getHeight());
                        v4Var.c.draw(canvas2);
                        canvas2.restore();
                    }
                }
                if (!p4Var.G2) {
                    f13 = 0.0f;
                }
                this.d.d(f13, r15);
                if (p4Var.K1) {
                    boolean z17 = (u3Var.getVisibility() == 0 && (p4Var.g3 || u3Var.w0)) ? z10 : r15;
                    p4Var.j3 = (u3Var.getVisibility() != 0 || u3Var.getProgressToBlackout() <= 0.0f) ? r15 : z10;
                    z9 z9Var2 = ((q9) p4Var.Q1).d;
                    z9Var2.L0 = z17;
                    z9Var2.P();
                    ((q9) p4Var.Q1).d.m1 = p4Var.j3;
                }
                if (f11 <= 0.0f) {
                    super.dispatchDraw(canvas);
                    b(canvas);
                }
                qyVar = p4Var.k1;
                if (qyVar == null) {
                    qyVar.e(canvas2);
                    return;
                }
                return;
            }
            if (!n4Var.f) {
                int dp2 = AndroidUtilities.dp(p4Var.x2 ? 56.0f : 110.0f);
                if ((p4Var.C1 || !p4Var.x2) && u3Var.getVisibility() == 0) {
                    dp2 = (int) (dp2 * 2.5f);
                }
                drawable2.setBounds(r15, q3Var.getMeasuredHeight() - dp2, getMeasuredWidth(), q3Var.getMeasuredHeight());
                drawable2.setAlpha((int) (hideInterfaceAlpha * 255.0f));
                drawable2.draw(canvas2);
            }
        }
        f11 = 0.0f;
        f12 = p4Var.m1;
        if (f12 != 0.0f) {
        }
        f13 = f7;
        z10 = true;
        if (!p4Var.G2) {
        }
        this.d.d(f13, r15);
        if (p4Var.K1) {
        }
        if (f11 <= 0.0f) {
        }
        qyVar = p4Var.k1;
        if (qyVar == null) {
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        h1 h1Var;
        p4 p4Var = this.x;
        o4 o4Var = p4Var.M2;
        if (!p4Var.K1 || p4Var.c3 || ((org.telegram.ui.n4) o4Var.e) == null || (h1Var = (h1) o4Var.b) == null || !h1Var.n() || !((org.telegram.ui.n4) o4Var.e).dispatchTouchEvent(motionEvent)) {
            return super.dispatchTouchEvent(motionEvent);
        }
        return true;
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        if (view == this.x.j1) {
            return true;
        }
        if (!this.r) {
            return super.drawChild(canvas, view, j10);
        }
        qc qcVar = qc.w;
        if (qcVar == null || view != qcVar.e) {
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
        this.x.k1.i();
        qc.a(this, new ah.m0(this, 1));
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        p4 p4Var = this.x;
        p4Var.k1.j();
        qc.h(this);
        i4 i4Var = p4Var.Q1;
        if (i4Var != null) {
            z9 z9Var = ((q9) i4Var).d;
            z9Var.Y0 = false;
            z9Var.P();
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.x.y0.getLayoutParams();
        layoutParams.rightMargin = AndroidUtilities.dp(42.0f);
        layoutParams.topMargin = AndroidUtilities.dp(15.0f);
        super.onMeasure(i10, i11);
    }
}
