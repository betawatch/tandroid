package lh;

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
import org.telegram.ui.Components.jr;
import org.telegram.ui.Components.mc;
import org.telegram.ui.lu0;
import org.telegram.ui.ry;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes4.dex */
public final class h3 extends t {
    public final org.telegram.ui.Components.d6 d;
    public final org.telegram.ui.Components.d6 e;
    public final org.telegram.ui.Components.voip.h f;
    public final org.telegram.ui.Components.d6 h;
    public final org.telegram.ui.Components.d6 n;
    public boolean r;
    public boolean s;
    public final /* synthetic */ a4 v;
    public final /* synthetic */ i9 w;
    public final /* synthetic */ d4 x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h3(d4 d4Var, Context context, a4 a4Var, i9 i9Var) {
        super(context);
        this.x = d4Var;
        this.v = a4Var;
        this.w = i9Var;
        jr jrVar = jr.f;
        this.d = new org.telegram.ui.Components.d6(this, 150L, jrVar);
        this.e = new org.telegram.ui.Components.d6(this, 150L, jrVar);
        this.f = new org.telegram.ui.Components.voip.h(32, 102, 240);
        org.telegram.ui.Components.d6 d6Var = new org.telegram.ui.Components.d6(this);
        this.h = d6Var;
        org.telegram.ui.Components.d6 d6Var2 = new org.telegram.ui.Components.d6(this);
        this.n = d6Var2;
        d6Var.g = 500L;
        d6Var2.g = 100L;
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0154, code lost:
    
        if (r4 >= 0.0f) goto L95;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b(Canvas canvas) {
        TL_stories.StoryItem storyItem;
        k6 k6Var;
        TL_stories.StoryItem storyItem2;
        int i10;
        TLRPC.UserFull userFull;
        float hideInterfaceAlpha;
        float f9;
        float clamp;
        float f10;
        float f11;
        float f12;
        float f13;
        float f14;
        boolean z10;
        float f15;
        h8 h8Var;
        float f16;
        int i11;
        int i12;
        float f17;
        float f18;
        Paint paint;
        int i13;
        h9 h9Var;
        h9 h9Var2;
        d4 d4Var = this.x;
        float f19 = d4Var.E1;
        e3 e3Var = d4Var.f1;
        c4 c4Var = d4Var.I2;
        b4 b4Var = d4Var.K1;
        x2 x2Var = d4Var.a1;
        if (x2Var.hasNotThumb() || ((b4Var.e && c4Var.f) || (b4Var.f && c4Var.f))) {
            d4 d4Var2 = b4Var.k;
            TL_stories.PeerStories peerStories = d4Var2.q1;
            i9 i9Var = d4Var2.F0;
            if (peerStories == null && (peerStories = d4Var2.O1.y(d4Var2.x1)) == null && (userFull = MessagesController.getInstance(d4Var2.y2).getUserFull(d4Var2.x1)) != null) {
                peerStories = userFull.stories;
            }
            if (d4Var2.G1 && (storyItem2 = b4Var.a) != null && peerStories != null && ((!l7.v(storyItem2) && ((i10 = b4Var.a.id) > peerStories.max_read_id || i10 > d4Var2.O1.f.get(d4Var2.x1, 0))) || d4Var2.y1)) {
                TL_stories.PeerStories peerStories2 = i9Var.M0;
                if (peerStories2 == null) {
                    s6 s6Var = d4Var2.O1;
                    long j10 = d4Var2.x1;
                    TL_stories.StoryItem storyItem3 = b4Var.a;
                    TL_stories.PeerStories y8 = s6Var.y(j10);
                    if (y8 == null) {
                        y8 = s6Var.z(j10);
                    }
                    if (s6Var.V(y8, storyItem3, false)) {
                        i9Var.Y0 = true;
                    }
                } else if (d4Var2.O1.V(peerStories2, b4Var.a, true)) {
                    i9Var.Y0 = true;
                }
            } else if (d4Var2.G1 && (storyItem = b4Var.a) != null && (k6Var = i9Var.K0) != null && k6Var.r(storyItem.id)) {
                i9Var.Y0 = true;
            }
        }
        hideInterfaceAlpha = d4Var.getHideInterfaceAlpha();
        if (b4Var.e) {
            h9 h9Var3 = c4Var.b;
            if (h9Var3 != null) {
                clamp = Utilities.clamp(h9Var3.getPlaybackProgress(d4Var.N2), 1.0f, 0.0f);
                if (c4Var.f && e3Var != null) {
                    e3Var.e();
                }
            } else {
                clamp = 0.0f;
            }
            invalidate();
            f9 = hideInterfaceAlpha;
        } else if (d4Var.N1 || !d4Var.G1 || d4Var.P1 || d4Var.Q1 || d4Var.R1 || !x2Var.hasNotThumb()) {
            f9 = hideInterfaceAlpha;
            clamp = Utilities.clamp(d4Var.S0 / 10000.0f, 1.0f, 0.0f);
        } else {
            long currentTimeMillis = System.currentTimeMillis();
            long j11 = d4Var.T0;
            if (j11 == 0 || d4Var.f3) {
                f9 = hideInterfaceAlpha;
            } else {
                f9 = hideInterfaceAlpha;
                if (d4Var.S0 <= 0 && currentTimeMillis - j11 > 0 && e3Var != null) {
                    e3Var.e();
                }
                d4Var.S0 += currentTimeMillis - d4Var.T0;
            }
            d4Var.T0 = currentTimeMillis;
            clamp = Utilities.clamp(d4Var.S0 / 10000.0f, 1.0f, 0.0f);
            invalidate();
        }
        if (c4Var != null && (h9Var2 = c4Var.b) != null) {
            f10 = h9Var2.currentSeek;
        }
        f10 = clamp;
        if (!d4Var.U0 && clamp == 1.0f && ((!b4Var.e || !d4Var.f3) && !d4Var.H2)) {
            d4Var.U0 = true;
            post(new jh.o(this, 26));
        }
        i9 i9Var2 = this.w;
        k6 k6Var2 = i9Var2.K0;
        if (k6Var2 == null || k6Var2.e == 3) {
            f11 = 4.0f;
            f12 = 1.0f;
            f13 = 2.0f;
            f14 = 8.0f;
        } else {
            if (d4Var.m1 == null) {
                d4Var.m1 = new v5.l();
            }
            v5.l lVar = d4Var.m1;
            f11 = 4.0f;
            float f20 = (1.0f - d4Var.Z3) * f9 * f19;
            int i14 = d4Var.H1;
            f12 = 1.0f;
            int g10 = i9Var2.K0.g();
            f13 = 2.0f;
            z3 z3Var = d4Var.k1;
            f14 = 8.0f;
            org.telegram.ui.Components.n6 n6Var = (org.telegram.ui.Components.n6) lVar.d;
            int i15 = (g10 << 12) + i14;
            if (lVar.a != i15) {
                lVar.a = i15;
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                spannableStringBuilder.append((CharSequence) String.valueOf(i14 + 1)).append((CharSequence) lVar.b).append((CharSequence) "/").append((CharSequence) lVar.c).append((CharSequence) String.valueOf(g10));
                n6Var.q(spannableStringBuilder, false, true);
            }
            canvas.save();
            float y10 = z3Var.getY();
            gg.c cVar = z3Var.b;
            float top = ((n6Var.e / 2.0f) + (y10 + cVar.getTop())) - 1.0f;
            cVar.setRightPadding((int) n6Var.d());
            canvas.translate((cVar.getRightDrawableWidth() + (cVar.getTextWidth() + (cVar.getLeft() + (z3Var.getLeft() + AndroidUtilities.dp(4.0f))))) - Utilities.clamp(((cVar.getRightDrawableWidth() + cVar.getTextWidth()) + r0) - cVar.getWidth(), r0, 0), top);
            float dp = AndroidUtilities.dp(8.0f);
            float dp2 = AndroidUtilities.dp(2.0f);
            AndroidUtilities.rectTmp.set(-dp, -dp2, n6Var.d() + dp, n6Var.e + dp2);
            n6Var.w = (int) (f20 * 160.0f);
            n6Var.draw(canvas);
            canvas.restore();
        }
        canvas.save();
        canvas.translate(0.0f, AndroidUtilities.dp(f14) - (AndroidUtilities.dp(f14) * d4Var.Z3));
        boolean z11 = b4Var.e && (h9Var = c4Var.b) != null && h9Var.isBuffering();
        boolean z12 = d4Var.H2;
        boolean z13 = z12 && b4Var != null && b4Var.e && i9Var2.g0;
        float e10 = d4Var.L2.e(!z12 || z13);
        h8 h8Var2 = d4Var.l1;
        int measuredWidth = getMeasuredWidth();
        int i16 = d4Var.I1;
        int i17 = d4Var.J1;
        float f21 = (f12 - d4Var.Z3) * f19;
        TextPaint textPaint = h8Var2.c;
        if (i17 > 0) {
            boolean z14 = z11 && !z13;
            if (h8Var2.i != i16) {
                h8Var2.g = 0.0f;
                h8Var2.h = true;
            }
            h8Var2.i = i16;
            a4 a4Var = h8Var2.a;
            Paint paint2 = a4Var.a;
            Paint paint3 = a4Var.b;
            int dp3 = i17 > 100 ? 1 : i17 >= 50 ? AndroidUtilities.dp(f12) : AndroidUtilities.dp(f13);
            float dp4 = ((measuredWidth - AndroidUtilities.dp(10.0f)) - ((i17 - 1) * dp3)) / i17;
            AndroidUtilities.dp(5.0f);
            float min = Math.min(dp4 / f13, AndroidUtilities.dp(f12));
            float e11 = h8Var2.b.e(z13);
            if (e11 > 0.0f) {
                float lerp = AndroidUtilities.lerp(clamp, f10, e11);
                canvas.save();
                textPaint.setAlpha((int) (e11 * 255.0f));
                z10 = z14;
                textPaint.setShadowLayer(AndroidUtilities.dp(3.0f), 0.0f, AndroidUtilities.dp(f12), org.telegram.ui.ActionBar.g6.l1(e11, 805306368));
                canvas.translate(((measuredWidth - h8Var2.f) / f13) - h8Var2.e, AndroidUtilities.lerp(AndroidUtilities.dp(f11), AndroidUtilities.dp(16.0f), e11));
                h8Var2.d.draw(canvas);
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
                    if (f22 >= 0.0f && f21 > 0.0f) {
                        float lerp2 = AndroidUtilities.lerp(min, AndroidUtilities.dpf2(f13), e11);
                        if (i18 > i16 || i18 != i16) {
                            f15 = min;
                            h8Var = h8Var2;
                            f16 = clamp;
                            i11 = measuredWidth;
                            f17 = lerp2;
                            f18 = 1.0f;
                        } else {
                            f15 = min;
                            RectF rectF = AndroidUtilities.rectTmp;
                            f16 = clamp;
                            i11 = measuredWidth;
                            rectF.set(dp5, 0.0f, f22, AndroidUtilities.lerp(AndroidUtilities.dpf2(f13), AndroidUtilities.dpf2(5.0f), (i16 == i18 ? 1 : 0) * e11));
                            if (z10) {
                                if (h8Var2.h) {
                                    float f23 = h8Var2.g + 0.026666667f;
                                    h8Var2.g = f23;
                                    if (f23 > 0.5f) {
                                        h8Var2.h = false;
                                    }
                                } else {
                                    float f24 = h8Var2.g - 0.026666667f;
                                    h8Var2.g = f24;
                                    if (f24 < -0.5f) {
                                        h8Var2.h = true;
                                    }
                                }
                                f17 = lerp2;
                                i13 = (int) (h8Var2.g * 51.0f * f21 * e10);
                            } else {
                                f17 = lerp2;
                                i13 = 0;
                            }
                            paint2.setAlpha(((int) (85.0f * f21 * e10)) + i13);
                            if (e11 > 0.0f) {
                                int i19 = i18 - i16;
                                h8Var = h8Var2;
                                rectF.left = Utilities.clamp(AndroidUtilities.lerp(rectF.left, AndroidUtilities.dp(5.0f) + (i19 * i11), e11), i11 - AndroidUtilities.dp(5.0f), AndroidUtilities.dp(5.0f));
                                rectF.right = Utilities.clamp(AndroidUtilities.lerp(rectF.right, ((i19 + 1) * i11) - AndroidUtilities.dp(5.0f), e11), i11 - AndroidUtilities.dp(5.0f), AndroidUtilities.dp(5.0f));
                            } else {
                                h8Var = h8Var2;
                            }
                            canvas.drawRoundRect(rectF, f17, f17, paint2);
                            f18 = f16;
                        }
                        RectF rectF2 = AndroidUtilities.rectTmp;
                        i12 = i17;
                        rectF2.set(dp5, 0.0f, f22, AndroidUtilities.lerp(AndroidUtilities.dpf2(f13), AndroidUtilities.dpf2(5.0f), (i16 == i18 ? 1 : 0) * e11));
                        if (e11 > 0.0f) {
                            int i20 = i18 - i16;
                            rectF2.left = Utilities.clamp(AndroidUtilities.lerp(rectF2.left, AndroidUtilities.dp(5.0f) + (i20 * i11), e11), i11 - AndroidUtilities.dp(5.0f), AndroidUtilities.dp(5.0f));
                            rectF2.right = Utilities.clamp(AndroidUtilities.lerp(rectF2.right, ((i20 + 1) * i11) - AndroidUtilities.dp(5.0f), e11), i11 - AndroidUtilities.dp(5.0f), AndroidUtilities.dp(5.0f));
                        }
                        rectF2.right = AndroidUtilities.lerp(rectF2.left, rectF2.right, f18);
                        if (i18 <= i16) {
                            paint3.setAlpha((int) (f21 * 255.0f * e10));
                            paint = paint3;
                        } else {
                            paint2.setAlpha((int) (85 * f21 * e10));
                            paint = paint2;
                        }
                        canvas.drawRoundRect(rectF2, f17, f17, paint);
                        i18++;
                        min = f15;
                        i17 = i12;
                        clamp = f16;
                        measuredWidth = i11;
                        h8Var2 = h8Var;
                    }
                }
                f15 = min;
                h8Var = h8Var2;
                f16 = clamp;
                i11 = measuredWidth;
                i12 = i17;
                i18++;
                min = f15;
                i17 = i12;
                clamp = f16;
                measuredWidth = i11;
                h8Var2 = h8Var;
            }
        }
        canvas.restore();
    }

    /* JADX WARN: Code restructure failed: missing block: B:225:0x01bb, code lost:
    
        if (r2.b.paused != false) goto L81;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0191, code lost:
    
        if (r4.n() != false) goto L81;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0517  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0521  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0562  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x056c  */
    /* JADX WARN: Removed duplicated region for block: B:136:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:208:0x01dc  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x0197  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x017a  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0185  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x01d9  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x01e7  */
    /* JADX WARN: Type inference failed for: r15v0 */
    /* JADX WARN: Type inference failed for: r15v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r15v8 */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void dispatchDraw(Canvas canvas) {
        float f9;
        a4 a4Var;
        ?? r15;
        float hideInterfaceAlpha;
        float f10;
        float f11;
        float f12;
        float f13;
        ry ryVar;
        h4 h4Var;
        boolean z10;
        float f14;
        boolean z11;
        org.telegram.ui.Components.d6 d6Var;
        boolean hasNotThumb;
        qg.d dVar;
        h9 h9Var;
        k8 k8Var;
        Canvas canvas2 = canvas;
        d4 d4Var = this.x;
        h3 h3Var = d4Var.Y0;
        e3 e3Var = d4Var.f1;
        b4 b4Var = d4Var.K1;
        x2 x2Var = d4Var.a1;
        c4 c4Var = d4Var.I2;
        l3 l3Var = d4Var.G0;
        if (!d4Var.G1) {
            d4Var.k1.a.getImageReceiver().setVisible(true, true);
        }
        boolean z12 = d4Var.Y2;
        a4 a4Var2 = this.v;
        if (z12) {
            f9 = 1.0f;
            canvas2.drawColor(i0.a.d(0.2f, -16777216, -1));
        } else {
            f9 = 1.0f;
            if (c4Var.d != null || (e3Var != null && (((k8Var = e3Var.b) != null && (k8Var.w || k8Var.s)) || e3Var.y.i))) {
                invalidate();
            }
            canvas2.save();
            lu0 lu0Var = d4Var.T2;
            if (lu0Var.n) {
                canvas2.save();
                float f15 = lu0Var.O;
                float f16 = lu0Var.A;
                float f17 = ((f15 * f16) + 1.0f) - f16;
                canvas2.scale(f17, f17, lu0Var.o + lu0Var.s, lu0Var.p + lu0Var.t);
                float f18 = lu0Var.o;
                float f19 = lu0Var.J;
                float f20 = lu0Var.A;
                canvas2.translate((f19 * f20) + f18, (lu0Var.K * f20) + lu0Var.p);
            }
            e5.c cVar = c4Var.d;
            if (cVar == null || (!c4Var.f && c4Var.a == null)) {
                if (cVar != null) {
                    invalidate();
                }
                if (b4Var.d) {
                    canvas2.drawColor(i0.a.d(0.2f, -16777216, -1));
                } else {
                    if (!x2Var.hasBitmapImage()) {
                        a4Var2.f.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight() + 1);
                        a4Var2.f.draw(canvas2);
                    }
                    f14 = 0.0f;
                    x2Var.setImageCoords(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight() + 1);
                    x2Var.draw(canvas2);
                    canvas2.restore();
                    z11 = d4Var.U2;
                    org.telegram.ui.Components.d6 d6Var2 = this.h;
                    d6Var = this.n;
                    if (z11) {
                        d6Var2.d(f14, true);
                        d6Var.d(f14, true);
                    }
                    if (!b4Var.f) {
                        d1 d1Var = c4Var.a;
                        if (d1Var != null) {
                            if (!c4Var.f) {
                            }
                            hasNotThumb = true;
                        }
                        hasNotThumb = false;
                    } else if (b4Var.e) {
                        if (c4Var.d != null) {
                            h9 h9Var2 = c4Var.b;
                            if (h9Var2 != null) {
                                if (c4Var.f) {
                                    if (h9Var2.progress == 0.0f) {
                                        if (h9Var2 != null) {
                                            if (h9Var2.isBuffering()) {
                                            }
                                        }
                                    }
                                    hasNotThumb = true;
                                }
                            }
                        }
                        hasNotThumb = false;
                    } else {
                        hasNotThumb = x2Var.hasNotThumb();
                    }
                    d6Var2.d((d4Var.G1 || hasNotThumb || b4Var.b != null) ? 0.0f : 1.0f, false);
                    d6Var.d(d6Var2.c != 1.0f ? 1.0f : 0.0f, false);
                    if (d6Var.c > 0.0f) {
                        RectF rectF = AndroidUtilities.rectTmp;
                        rectF.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                        int i10 = (int) (d6Var.c * 255.0f);
                        org.telegram.ui.Components.voip.h hVar = this.f;
                        hVar.a.setAlpha(i10);
                        hVar.c.setAlpha(i10);
                        hVar.f = getMeasuredWidth() * 2;
                        hVar.n = 1.3f;
                        hVar.a(AndroidUtilities.dp(10.0f), canvas2, rectF, this);
                    }
                    d4Var.U2 = false;
                }
            } else {
                if (!x2Var.hasBitmapImage()) {
                    a4Var2.f.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight() + 1);
                    a4Var2.f.draw(canvas2);
                }
                x2Var.setImageCoords(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight() + 1);
                x2Var.draw(canvas2);
                if (d4Var.G1) {
                    i9 i9Var = this.w;
                    boolean z13 = i9Var.a;
                    if (z13 && (h9Var = c4Var.b) != null && h9Var.paused && h9Var.playerStubBitmap != null && h9Var.stubAvailable) {
                        canvas2.save();
                        canvas2.scale(getMeasuredWidth() / c4Var.b.playerStubBitmap.getWidth(), getMeasuredHeight() / c4Var.b.playerStubBitmap.getHeight());
                        h9 h9Var3 = c4Var.b;
                        canvas2.drawBitmap(h9Var3.playerStubBitmap, 0.0f, 0.0f, h9Var3.playerStubPaint);
                        canvas2.restore();
                    } else {
                        boolean z14 = Build.VERSION.SDK_INT >= 29 && (dVar = d4Var.D3) != null && canvas2 == dVar.r;
                        if (!z13 || (d4Var.X0 && !i9Var.D0 && !z14)) {
                            c4Var.d.draw(canvas2);
                        }
                    }
                }
            }
            f14 = 0.0f;
            canvas2.restore();
            z11 = d4Var.U2;
            org.telegram.ui.Components.d6 d6Var22 = this.h;
            d6Var = this.n;
            if (z11) {
            }
            if (!b4Var.f) {
            }
            d6Var22.d((d4Var.G1 || hasNotThumb || b4Var.b != null) ? 0.0f : 1.0f, false);
            d6Var.d(d6Var22.c != 1.0f ? 1.0f : 0.0f, false);
            if (d6Var.c > 0.0f) {
            }
            d4Var.U2 = false;
        }
        if (l3Var.getAlpha() > 0.0f) {
            if (l3Var.getAlpha() == f9) {
                canvas2.save();
                a4Var = a4Var2;
                z10 = false;
            } else {
                a4Var = a4Var2;
                z10 = false;
                canvas2.saveLayerAlpha(0.0f, 0.0f, l3Var.getMeasuredWidth(), l3Var.getMeasuredHeight(), (int) (l3Var.getAlpha() * 255.0f), 31);
            }
            e3Var.draw(canvas2);
            canvas2.restore();
            r15 = z10;
        } else {
            a4Var = a4Var2;
            r15 = 0;
        }
        if (!d4Var.V0 && x2Var.hasNotThumb()) {
            d4Var.V0 = true;
            d4Var.invalidate();
        }
        hideInterfaceAlpha = d4Var.getHideInterfaceAlpha();
        Drawable drawable = a4Var.d;
        Paint paint = a4Var.c;
        Drawable drawable2 = a4Var.e;
        drawable.setAlpha(255);
        a4Var.d.draw(canvas2);
        if (d4Var.y1 || !d4Var.t2 || l3Var.getVisibility() == 0) {
            if (l3Var.getVisibility() == 0) {
                int dp = AndroidUtilities.dp(72.0f);
                int top = l3Var.getTop() + ((int) (l3Var.getTextTop() - AndroidUtilities.dp(24.0f)));
                int i11 = dp + top;
                float measuredHeight = getMeasuredHeight() * 0.65f;
                if ((measuredHeight - top) / AndroidUtilities.dp(60.0f) > 0.0f && l3Var.s0 && l3Var.n0.getBottom() - l3Var.getMeasuredHeight() > 0) {
                    if ((measuredHeight - (l3Var.getTop() + ((int) (l3Var.getMaxTop() - AndroidUtilities.dp(24.0f))))) / AndroidUtilities.dp(60.0f) > 0.0f) {
                        d4Var.c3 = true;
                    }
                    f10 = 0.0f;
                } else if (d4Var.d3) {
                    d4Var.d3 = r15;
                    f10 = 0.0f;
                    if ((measuredHeight - (l3Var.getTop() + ((int) (l3Var.getMaxTop() - AndroidUtilities.dp(24.0f))))) / AndroidUtilities.dp(60.0f) > 0.0f) {
                        d4Var.c3 = true;
                    }
                } else {
                    f10 = 0.0f;
                    if (l3Var.getProgressToBlackout() == 0.0f) {
                        d4Var.c3 = r15;
                    }
                }
                float d = this.e.d(d4Var.c3 ? 1.0f : 0.0f, r15);
                if (d > f10) {
                    this.r = true;
                    this.s = r15;
                    super.dispatchDraw(canvas);
                    this.r = r15;
                    b(canvas);
                    paint.setColor(i0.a.k(-16777216, (int) (153.0f * d * hideInterfaceAlpha)));
                    canvas2.drawPaint(paint);
                }
                if (d < f9 && !b4Var.f) {
                    canvas2.save();
                    float f21 = f9 - d;
                    paint.setColor(i0.a.k(-16777216, (int) (129.03f * f21 * hideInterfaceAlpha)));
                    drawable2.setAlpha((int) (f21 * 255.0f * hideInterfaceAlpha));
                    drawable2.setBounds(r15, top, getMeasuredWidth(), i11);
                    drawable2.draw(canvas2);
                    canvas2.drawRect(0.0f, i11, getMeasuredWidth(), getMeasuredHeight(), paint);
                    canvas.restore();
                }
                if (d <= f10 || l3Var.getAlpha() <= 0.0f) {
                    canvas2 = canvas;
                } else {
                    if (l3Var.p0) {
                        l3Var.p0 = r15;
                        l3Var.invalidate();
                    }
                    if (l3Var.getAlpha() != f9) {
                        canvas2 = canvas;
                        canvas2.saveLayerAlpha(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), (int) (l3Var.getAlpha() * 255.0f), 31);
                    } else {
                        canvas2 = canvas;
                        canvas2.save();
                    }
                    canvas2.translate(l3Var.getX(), l3Var.getY() - l3Var.getScrollY());
                    l3Var.draw(canvas2);
                    canvas2.restore();
                }
                boolean z15 = d > f10;
                if (l3Var.p0 != z15) {
                    l3Var.p0 = z15;
                    l3Var.invalidate();
                }
                if (d > f10) {
                    this.r = true;
                    this.s = true;
                    super.dispatchDraw(canvas);
                    this.r = r15;
                }
                f11 = d;
                f12 = d4Var.i1;
                if (f12 != 0.0f || (h4Var = d4Var.h1) == null) {
                    f13 = 1.0f;
                } else {
                    float f22 = d4Var.w3;
                    int measuredWidth = getMeasuredWidth();
                    int measuredHeight2 = getMeasuredHeight() + 1;
                    i4 i4Var = h4Var.f;
                    ImageReceiver imageReceiver = h4Var.a;
                    float f23 = (float) r15;
                    imageReceiver.setImageCoords(f23, f23, measuredWidth, measuredHeight2);
                    imageReceiver.setAlpha(f12);
                    imageReceiver.draw(canvas2);
                    f13 = 1.0f;
                    imageReceiver.setAlpha(1.0f);
                    if (h4Var.c != null) {
                        int i12 = (int) (f12 * 255.0f);
                        h4Var.d.setAlpha(i12);
                        GradientDrawable gradientDrawable = i4Var.D;
                        gradientDrawable.setAlpha(i12);
                        gradientDrawable.setBounds((int) imageReceiver.getImageX(), (int) (imageReceiver.getImageY2() - (AndroidUtilities.dp(24.0f) * f22)), (int) imageReceiver.getImageX2(), ((int) imageReceiver.getImageY2()) + 2);
                        gradientDrawable.draw(canvas2);
                        canvas2.save();
                        canvas2.scale(f22, f22, imageReceiver.getCenterX(), imageReceiver.getImageY2() - (AndroidUtilities.dp(8.0f) * f22));
                        canvas2.translate(imageReceiver.getCenterX() - (i4Var.F / 2.0f), (imageReceiver.getImageY2() - (AndroidUtilities.dp(8.0f) * f22)) - h4Var.c.getHeight());
                        h4Var.c.draw(canvas2);
                        canvas2.restore();
                    }
                }
                if (!d4Var.C2) {
                    f13 = 0.0f;
                }
                this.d.d(f13, r15);
                if (d4Var.G1) {
                    boolean z16 = l3Var.getVisibility() == 0 && (d4Var.c3 || l3Var.s0);
                    d4Var.f3 = l3Var.getVisibility() == 0 && l3Var.getProgressToBlackout() > 0.0f;
                    i9 i9Var2 = ((z8) d4Var.M1).d;
                    i9Var2.H0 = z16;
                    i9Var2.P();
                    ((z8) d4Var.M1).d.i1 = d4Var.f3;
                }
                if (f11 <= 0.0f) {
                    super.dispatchDraw(canvas);
                    b(canvas);
                }
                ryVar = d4Var.g1;
                if (ryVar == null) {
                    ryVar.e(canvas2);
                    return;
                }
                return;
            }
            if (!b4Var.f) {
                int dp2 = AndroidUtilities.dp(d4Var.t2 ? 56.0f : 110.0f);
                if ((d4Var.y1 || !d4Var.t2) && l3Var.getVisibility() == 0) {
                    dp2 = (int) (dp2 * 2.5f);
                }
                drawable2.setBounds(r15, h3Var.getMeasuredHeight() - dp2, getMeasuredWidth(), h3Var.getMeasuredHeight());
                drawable2.setAlpha((int) (hideInterfaceAlpha * 255.0f));
                drawable2.draw(canvas2);
            }
        }
        f11 = 0.0f;
        f12 = d4Var.i1;
        if (f12 != 0.0f) {
        }
        f13 = 1.0f;
        if (!d4Var.C2) {
        }
        this.d.d(f13, r15);
        if (d4Var.G1) {
        }
        if (f11 <= 0.0f) {
        }
        ryVar = d4Var.g1;
        if (ryVar == null) {
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        d1 d1Var;
        d4 d4Var = this.x;
        c4 c4Var = d4Var.I2;
        if (!d4Var.G1 || d4Var.Y2 || c4Var.d == null || (d1Var = c4Var.a) == null || !d1Var.n() || !c4Var.d.dispatchTouchEvent(motionEvent)) {
            return super.dispatchTouchEvent(motionEvent);
        }
        return true;
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        if (view == this.x.f1) {
            return true;
        }
        if (!this.r) {
            return super.drawChild(canvas, view, j10);
        }
        mc mcVar = mc.w;
        if (mcVar == null || view != mcVar.e) {
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
        this.x.g1.j();
        mc.a(this, new ih.u0(this, 2));
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        d4 d4Var = this.x;
        d4Var.g1.k();
        mc.h(this);
        x3 x3Var = d4Var.M1;
        if (x3Var != null) {
            i9 i9Var = ((z8) x3Var).d;
            i9Var.U0 = false;
            i9Var.P();
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.x.u0.getLayoutParams();
        layoutParams.rightMargin = AndroidUtilities.dp(42.0f);
        layoutParams.topMargin = AndroidUtilities.dp(15.0f);
        super.onMeasure(i10, i11);
    }
}
