package ih;

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
import org.telegram.ui.Components.gc;
import org.telegram.ui.Components.gr;
import org.telegram.ui.nu0;
import org.telegram.ui.py;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes4.dex */
public final class l3 extends v {
    public final org.telegram.ui.Components.y5 d;
    public final org.telegram.ui.Components.y5 e;
    public final org.telegram.ui.Components.voip.h f;
    public final org.telegram.ui.Components.y5 h;
    public final org.telegram.ui.Components.y5 n;
    public boolean r;
    public boolean s;
    public final /* synthetic */ f4 v;
    public final /* synthetic */ m9 w;
    public final /* synthetic */ i4 x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l3(i4 i4Var, Context context, f4 f4Var, m9 m9Var) {
        super(context);
        this.x = i4Var;
        this.v = f4Var;
        this.w = m9Var;
        gr grVar = gr.f;
        this.d = new org.telegram.ui.Components.y5(this, 150L, grVar);
        this.e = new org.telegram.ui.Components.y5(this, 150L, grVar);
        this.f = new org.telegram.ui.Components.voip.h(32, 102, 240);
        org.telegram.ui.Components.y5 y5Var = new org.telegram.ui.Components.y5(this);
        this.h = y5Var;
        org.telegram.ui.Components.y5 y5Var2 = new org.telegram.ui.Components.y5(this);
        this.n = y5Var2;
        y5Var.g = 500L;
        y5Var2.g = 100L;
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0154, code lost:
    
        if (r4 >= 0.0f) goto L95;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b(Canvas canvas) {
        TL_stories.StoryItem storyItem;
        n6 n6Var;
        TL_stories.StoryItem storyItem2;
        int i9;
        TLRPC.UserFull userFull;
        float hideInterfaceAlpha;
        float f10;
        float clamp;
        float f11;
        float f12;
        float f13;
        float f14;
        float f15;
        boolean z10;
        float f16;
        l8 l8Var;
        float f17;
        int i10;
        int i11;
        float f18;
        float f19;
        Paint paint;
        int i12;
        l9 l9Var;
        l9 l9Var2;
        i4 i4Var = this.x;
        float f20 = i4Var.E1;
        g3 g3Var = i4Var.f1;
        h4 h4Var = i4Var.I2;
        g4 g4Var = i4Var.K1;
        z2 z2Var = i4Var.a1;
        if (z2Var.hasNotThumb() || ((g4Var.e && h4Var.f) || (g4Var.f && h4Var.f))) {
            i4 i4Var2 = g4Var.k;
            TL_stories.PeerStories peerStories = i4Var2.q1;
            m9 m9Var = i4Var2.F0;
            if (peerStories == null && (peerStories = i4Var2.O1.y(i4Var2.x1)) == null && (userFull = MessagesController.getInstance(i4Var2.y2).getUserFull(i4Var2.x1)) != null) {
                peerStories = userFull.stories;
            }
            if (i4Var2.G1 && (storyItem2 = g4Var.a) != null && peerStories != null && ((!p7.v(storyItem2) && ((i9 = g4Var.a.id) > peerStories.max_read_id || i9 > i4Var2.O1.f.get(i4Var2.x1, 0))) || i4Var2.y1)) {
                TL_stories.PeerStories peerStories2 = m9Var.M0;
                if (peerStories2 == null) {
                    v6 v6Var = i4Var2.O1;
                    long j10 = i4Var2.x1;
                    TL_stories.StoryItem storyItem3 = g4Var.a;
                    TL_stories.PeerStories y10 = v6Var.y(j10);
                    if (y10 == null) {
                        y10 = v6Var.z(j10);
                    }
                    if (v6Var.V(y10, storyItem3, false)) {
                        m9Var.Y0 = true;
                    }
                } else if (i4Var2.O1.V(peerStories2, g4Var.a, true)) {
                    m9Var.Y0 = true;
                }
            } else if (i4Var2.G1 && (storyItem = g4Var.a) != null && (n6Var = m9Var.K0) != null && n6Var.r(storyItem.id)) {
                m9Var.Y0 = true;
            }
        }
        hideInterfaceAlpha = i4Var.getHideInterfaceAlpha();
        if (g4Var.e) {
            l9 l9Var3 = h4Var.b;
            if (l9Var3 != null) {
                clamp = Utilities.clamp(l9Var3.getPlaybackProgress(i4Var.N2), 1.0f, 0.0f);
                if (h4Var.f && g3Var != null) {
                    g3Var.e();
                }
            } else {
                clamp = 0.0f;
            }
            invalidate();
            f10 = hideInterfaceAlpha;
        } else if (i4Var.N1 || !i4Var.G1 || i4Var.P1 || i4Var.Q1 || i4Var.R1 || !z2Var.hasNotThumb()) {
            f10 = hideInterfaceAlpha;
            clamp = Utilities.clamp(i4Var.S0 / 10000.0f, 1.0f, 0.0f);
        } else {
            long currentTimeMillis = System.currentTimeMillis();
            long j11 = i4Var.T0;
            if (j11 == 0 || i4Var.f3) {
                f10 = hideInterfaceAlpha;
            } else {
                f10 = hideInterfaceAlpha;
                if (i4Var.S0 <= 0 && currentTimeMillis - j11 > 0 && g3Var != null) {
                    g3Var.e();
                }
                i4Var.S0 += currentTimeMillis - i4Var.T0;
            }
            i4Var.T0 = currentTimeMillis;
            clamp = Utilities.clamp(i4Var.S0 / 10000.0f, 1.0f, 0.0f);
            invalidate();
        }
        if (h4Var != null && (l9Var2 = h4Var.b) != null) {
            f11 = l9Var2.currentSeek;
        }
        f11 = clamp;
        if (!i4Var.U0 && clamp == 1.0f && ((!g4Var.e || !i4Var.f3) && !i4Var.H2)) {
            i4Var.U0 = true;
            post(new g(this, 5));
        }
        m9 m9Var2 = this.w;
        n6 n6Var2 = m9Var2.K0;
        if (n6Var2 == null || n6Var2.e == 3) {
            f12 = 4.0f;
            f13 = 1.0f;
            f14 = 2.0f;
            f15 = 8.0f;
        } else {
            if (i4Var.m1 == null) {
                i4Var.m1 = new t5.l();
            }
            t5.l lVar = i4Var.m1;
            f12 = 4.0f;
            float f21 = (1.0f - i4Var.Z3) * f10 * f20;
            int i13 = i4Var.H1;
            f13 = 1.0f;
            int g10 = m9Var2.K0.g();
            f14 = 2.0f;
            e4 e4Var = i4Var.k1;
            f15 = 8.0f;
            org.telegram.ui.Components.i6 i6Var = (org.telegram.ui.Components.i6) lVar.d;
            int i14 = (g10 << 12) + i13;
            if (lVar.a != i14) {
                lVar.a = i14;
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                spannableStringBuilder.append((CharSequence) String.valueOf(i13 + 1)).append((CharSequence) lVar.b).append((CharSequence) "/").append((CharSequence) lVar.c).append((CharSequence) String.valueOf(g10));
                i6Var.q(spannableStringBuilder, false, true);
            }
            canvas.save();
            float y11 = e4Var.getY();
            dg.c cVar = e4Var.b;
            float top = ((i6Var.e / 2.0f) + (y11 + cVar.getTop())) - 1.0f;
            cVar.setRightPadding((int) i6Var.d());
            canvas.translate((cVar.getRightDrawableWidth() + (cVar.getTextWidth() + (cVar.getLeft() + (e4Var.getLeft() + AndroidUtilities.dp(4.0f))))) - Utilities.clamp(((cVar.getRightDrawableWidth() + cVar.getTextWidth()) + r0) - cVar.getWidth(), r0, 0), top);
            float dp = AndroidUtilities.dp(8.0f);
            float dp2 = AndroidUtilities.dp(2.0f);
            AndroidUtilities.rectTmp.set(-dp, -dp2, i6Var.d() + dp, i6Var.e + dp2);
            i6Var.w = (int) (f21 * 160.0f);
            i6Var.draw(canvas);
            canvas.restore();
        }
        canvas.save();
        canvas.translate(0.0f, AndroidUtilities.dp(f15) - (AndroidUtilities.dp(f15) * i4Var.Z3));
        boolean z11 = g4Var.e && (l9Var = h4Var.b) != null && l9Var.isBuffering();
        boolean z12 = i4Var.H2;
        boolean z13 = z12 && g4Var != null && g4Var.e && m9Var2.g0;
        float e10 = i4Var.L2.e(!z12 || z13);
        l8 l8Var2 = i4Var.l1;
        int measuredWidth = getMeasuredWidth();
        int i15 = i4Var.I1;
        int i16 = i4Var.J1;
        float f22 = (f13 - i4Var.Z3) * f20;
        TextPaint textPaint = l8Var2.c;
        if (i16 > 0) {
            boolean z14 = z11 && !z13;
            if (l8Var2.i != i15) {
                l8Var2.g = 0.0f;
                l8Var2.h = true;
            }
            l8Var2.i = i15;
            f4 f4Var = l8Var2.a;
            Paint paint2 = f4Var.a;
            Paint paint3 = f4Var.b;
            int dp3 = i16 > 100 ? 1 : i16 >= 50 ? AndroidUtilities.dp(f13) : AndroidUtilities.dp(f14);
            float dp4 = ((measuredWidth - AndroidUtilities.dp(10.0f)) - ((i16 - 1) * dp3)) / i16;
            AndroidUtilities.dp(5.0f);
            float min = Math.min(dp4 / f14, AndroidUtilities.dp(f13));
            float e11 = l8Var2.b.e(z13);
            if (e11 > 0.0f) {
                float lerp = AndroidUtilities.lerp(clamp, f11, e11);
                canvas.save();
                textPaint.setAlpha((int) (e11 * 255.0f));
                z10 = z14;
                textPaint.setShadowLayer(AndroidUtilities.dp(3.0f), 0.0f, AndroidUtilities.dp(f13), org.telegram.ui.ActionBar.f6.l1(e11, 805306368));
                canvas.translate(((measuredWidth - l8Var2.f) / f14) - l8Var2.e, AndroidUtilities.lerp(AndroidUtilities.dp(f12), AndroidUtilities.dp(16.0f), e11));
                l8Var2.d.draw(canvas);
                canvas.restore();
                clamp = lerp;
            } else {
                z10 = z14;
            }
            int i17 = 0;
            while (i17 < i16) {
                float dp5 = (i17 * dp4) + AndroidUtilities.dp(5.0f) + (-0.0f) + (dp3 * i17);
                if (dp5 <= measuredWidth) {
                    float f23 = dp5 + dp4;
                    if (f23 >= 0.0f && f22 > 0.0f) {
                        float lerp2 = AndroidUtilities.lerp(min, AndroidUtilities.dpf2(f14), e11);
                        if (i17 > i15 || i17 != i15) {
                            f16 = min;
                            l8Var = l8Var2;
                            f17 = clamp;
                            i10 = measuredWidth;
                            f18 = lerp2;
                            f19 = 1.0f;
                        } else {
                            f16 = min;
                            RectF rectF = AndroidUtilities.rectTmp;
                            f17 = clamp;
                            i10 = measuredWidth;
                            rectF.set(dp5, 0.0f, f23, AndroidUtilities.lerp(AndroidUtilities.dpf2(f14), AndroidUtilities.dpf2(5.0f), (i15 == i17 ? 1 : 0) * e11));
                            if (z10) {
                                if (l8Var2.h) {
                                    float f24 = l8Var2.g + 0.026666667f;
                                    l8Var2.g = f24;
                                    if (f24 > 0.5f) {
                                        l8Var2.h = false;
                                    }
                                } else {
                                    float f25 = l8Var2.g - 0.026666667f;
                                    l8Var2.g = f25;
                                    if (f25 < -0.5f) {
                                        l8Var2.h = true;
                                    }
                                }
                                f18 = lerp2;
                                i12 = (int) (l8Var2.g * 51.0f * f22 * e10);
                            } else {
                                f18 = lerp2;
                                i12 = 0;
                            }
                            paint2.setAlpha(((int) (85.0f * f22 * e10)) + i12);
                            if (e11 > 0.0f) {
                                int i18 = i17 - i15;
                                l8Var = l8Var2;
                                rectF.left = Utilities.clamp(AndroidUtilities.lerp(rectF.left, AndroidUtilities.dp(5.0f) + (i18 * i10), e11), i10 - AndroidUtilities.dp(5.0f), AndroidUtilities.dp(5.0f));
                                rectF.right = Utilities.clamp(AndroidUtilities.lerp(rectF.right, ((i18 + 1) * i10) - AndroidUtilities.dp(5.0f), e11), i10 - AndroidUtilities.dp(5.0f), AndroidUtilities.dp(5.0f));
                            } else {
                                l8Var = l8Var2;
                            }
                            canvas.drawRoundRect(rectF, f18, f18, paint2);
                            f19 = f17;
                        }
                        RectF rectF2 = AndroidUtilities.rectTmp;
                        i11 = i16;
                        rectF2.set(dp5, 0.0f, f23, AndroidUtilities.lerp(AndroidUtilities.dpf2(f14), AndroidUtilities.dpf2(5.0f), (i15 == i17 ? 1 : 0) * e11));
                        if (e11 > 0.0f) {
                            int i19 = i17 - i15;
                            rectF2.left = Utilities.clamp(AndroidUtilities.lerp(rectF2.left, AndroidUtilities.dp(5.0f) + (i19 * i10), e11), i10 - AndroidUtilities.dp(5.0f), AndroidUtilities.dp(5.0f));
                            rectF2.right = Utilities.clamp(AndroidUtilities.lerp(rectF2.right, ((i19 + 1) * i10) - AndroidUtilities.dp(5.0f), e11), i10 - AndroidUtilities.dp(5.0f), AndroidUtilities.dp(5.0f));
                        }
                        rectF2.right = AndroidUtilities.lerp(rectF2.left, rectF2.right, f19);
                        if (i17 <= i15) {
                            paint3.setAlpha((int) (f22 * 255.0f * e10));
                            paint = paint3;
                        } else {
                            paint2.setAlpha((int) (85 * f22 * e10));
                            paint = paint2;
                        }
                        canvas.drawRoundRect(rectF2, f18, f18, paint);
                        i17++;
                        min = f16;
                        i16 = i11;
                        clamp = f17;
                        measuredWidth = i10;
                        l8Var2 = l8Var;
                    }
                }
                f16 = min;
                l8Var = l8Var2;
                f17 = clamp;
                i10 = measuredWidth;
                i11 = i16;
                i17++;
                min = f16;
                i16 = i11;
                clamp = f17;
                measuredWidth = i10;
                l8Var2 = l8Var;
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
        float f10;
        f4 f4Var;
        ?? r15;
        float hideInterfaceAlpha;
        float f11;
        float f12;
        float f13;
        float f14;
        py pyVar;
        l4 l4Var;
        boolean z10;
        float f15;
        boolean z11;
        org.telegram.ui.Components.y5 y5Var;
        boolean hasNotThumb;
        ng.d dVar;
        l9 l9Var;
        o8 o8Var;
        Canvas canvas2 = canvas;
        i4 i4Var = this.x;
        l3 l3Var = i4Var.Y0;
        g3 g3Var = i4Var.f1;
        g4 g4Var = i4Var.K1;
        z2 z2Var = i4Var.a1;
        h4 h4Var = i4Var.I2;
        p3 p3Var = i4Var.G0;
        if (!i4Var.G1) {
            i4Var.k1.a.getImageReceiver().setVisible(true, true);
        }
        boolean z12 = i4Var.Y2;
        f4 f4Var2 = this.v;
        if (z12) {
            f10 = 1.0f;
            canvas2.drawColor(i0.a.d(0.2f, -16777216, -1));
        } else {
            f10 = 1.0f;
            if (h4Var.d != null || (g3Var != null && (((o8Var = g3Var.b) != null && (o8Var.w || o8Var.s)) || g3Var.y.i))) {
                invalidate();
            }
            canvas2.save();
            nu0 nu0Var = i4Var.T2;
            if (nu0Var.n) {
                canvas2.save();
                float f16 = nu0Var.O;
                float f17 = nu0Var.A;
                float f18 = ((f16 * f17) + 1.0f) - f17;
                canvas2.scale(f18, f18, nu0Var.o + nu0Var.s, nu0Var.p + nu0Var.t);
                float f19 = nu0Var.o;
                float f20 = nu0Var.J;
                float f21 = nu0Var.A;
                canvas2.translate((f20 * f21) + f19, (nu0Var.K * f21) + nu0Var.p);
            }
            c5.c cVar = h4Var.d;
            if (cVar == null || (!h4Var.f && h4Var.a == null)) {
                if (cVar != null) {
                    invalidate();
                }
                if (g4Var.d) {
                    canvas2.drawColor(i0.a.d(0.2f, -16777216, -1));
                } else {
                    if (!z2Var.hasBitmapImage()) {
                        f4Var2.f.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight() + 1);
                        f4Var2.f.draw(canvas2);
                    }
                    f15 = 0.0f;
                    z2Var.setImageCoords(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight() + 1);
                    z2Var.draw(canvas2);
                    canvas2.restore();
                    z11 = i4Var.U2;
                    org.telegram.ui.Components.y5 y5Var2 = this.h;
                    y5Var = this.n;
                    if (z11) {
                        y5Var2.d(f15, true);
                        y5Var.d(f15, true);
                    }
                    if (!g4Var.f) {
                        f1 f1Var = h4Var.a;
                        if (f1Var != null) {
                            if (!h4Var.f) {
                            }
                            hasNotThumb = true;
                        }
                        hasNotThumb = false;
                    } else if (g4Var.e) {
                        if (h4Var.d != null) {
                            l9 l9Var2 = h4Var.b;
                            if (l9Var2 != null) {
                                if (h4Var.f) {
                                    if (l9Var2.progress == 0.0f) {
                                        if (l9Var2 != null) {
                                            if (l9Var2.isBuffering()) {
                                            }
                                        }
                                    }
                                    hasNotThumb = true;
                                }
                            }
                        }
                        hasNotThumb = false;
                    } else {
                        hasNotThumb = z2Var.hasNotThumb();
                    }
                    y5Var2.d((i4Var.G1 || hasNotThumb || g4Var.b != null) ? 0.0f : 1.0f, false);
                    y5Var.d(y5Var2.c != 1.0f ? 1.0f : 0.0f, false);
                    if (y5Var.c > 0.0f) {
                        RectF rectF = AndroidUtilities.rectTmp;
                        rectF.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                        int i9 = (int) (y5Var.c * 255.0f);
                        org.telegram.ui.Components.voip.h hVar = this.f;
                        hVar.a.setAlpha(i9);
                        hVar.c.setAlpha(i9);
                        hVar.f = getMeasuredWidth() * 2;
                        hVar.n = 1.3f;
                        hVar.a(AndroidUtilities.dp(10.0f), canvas2, rectF, this);
                    }
                    i4Var.U2 = false;
                }
            } else {
                if (!z2Var.hasBitmapImage()) {
                    f4Var2.f.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight() + 1);
                    f4Var2.f.draw(canvas2);
                }
                z2Var.setImageCoords(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight() + 1);
                z2Var.draw(canvas2);
                if (i4Var.G1) {
                    m9 m9Var = this.w;
                    boolean z13 = m9Var.a;
                    if (z13 && (l9Var = h4Var.b) != null && l9Var.paused && l9Var.playerStubBitmap != null && l9Var.stubAvailable) {
                        canvas2.save();
                        canvas2.scale(getMeasuredWidth() / h4Var.b.playerStubBitmap.getWidth(), getMeasuredHeight() / h4Var.b.playerStubBitmap.getHeight());
                        l9 l9Var3 = h4Var.b;
                        canvas2.drawBitmap(l9Var3.playerStubBitmap, 0.0f, 0.0f, l9Var3.playerStubPaint);
                        canvas2.restore();
                    } else {
                        boolean z14 = Build.VERSION.SDK_INT >= 29 && (dVar = i4Var.D3) != null && canvas2 == dVar.r;
                        if (!z13 || (i4Var.X0 && !m9Var.D0 && !z14)) {
                            h4Var.d.draw(canvas2);
                        }
                    }
                }
            }
            f15 = 0.0f;
            canvas2.restore();
            z11 = i4Var.U2;
            org.telegram.ui.Components.y5 y5Var22 = this.h;
            y5Var = this.n;
            if (z11) {
            }
            if (!g4Var.f) {
            }
            y5Var22.d((i4Var.G1 || hasNotThumb || g4Var.b != null) ? 0.0f : 1.0f, false);
            y5Var.d(y5Var22.c != 1.0f ? 1.0f : 0.0f, false);
            if (y5Var.c > 0.0f) {
            }
            i4Var.U2 = false;
        }
        if (p3Var.getAlpha() > 0.0f) {
            if (p3Var.getAlpha() == f10) {
                canvas2.save();
                f4Var = f4Var2;
                z10 = false;
            } else {
                f4Var = f4Var2;
                z10 = false;
                canvas2.saveLayerAlpha(0.0f, 0.0f, p3Var.getMeasuredWidth(), p3Var.getMeasuredHeight(), (int) (p3Var.getAlpha() * 255.0f), 31);
            }
            g3Var.draw(canvas2);
            canvas2.restore();
            r15 = z10;
        } else {
            f4Var = f4Var2;
            r15 = 0;
        }
        if (!i4Var.V0 && z2Var.hasNotThumb()) {
            i4Var.V0 = true;
            i4Var.invalidate();
        }
        hideInterfaceAlpha = i4Var.getHideInterfaceAlpha();
        Drawable drawable = f4Var.d;
        Paint paint = f4Var.c;
        Drawable drawable2 = f4Var.e;
        drawable.setAlpha(255);
        f4Var.d.draw(canvas2);
        if (i4Var.y1 || !i4Var.t2 || p3Var.getVisibility() == 0) {
            if (p3Var.getVisibility() == 0) {
                int dp = AndroidUtilities.dp(72.0f);
                int top = p3Var.getTop() + ((int) (p3Var.getTextTop() - AndroidUtilities.dp(24.0f)));
                int i10 = dp + top;
                float measuredHeight = getMeasuredHeight() * 0.65f;
                if ((measuredHeight - top) / AndroidUtilities.dp(60.0f) > 0.0f && p3Var.s0 && p3Var.n0.getBottom() - p3Var.getMeasuredHeight() > 0) {
                    if ((measuredHeight - (p3Var.getTop() + ((int) (p3Var.getMaxTop() - AndroidUtilities.dp(24.0f))))) / AndroidUtilities.dp(60.0f) > 0.0f) {
                        i4Var.c3 = true;
                    }
                    f11 = 0.0f;
                } else if (i4Var.d3) {
                    i4Var.d3 = r15;
                    f11 = 0.0f;
                    if ((measuredHeight - (p3Var.getTop() + ((int) (p3Var.getMaxTop() - AndroidUtilities.dp(24.0f))))) / AndroidUtilities.dp(60.0f) > 0.0f) {
                        i4Var.c3 = true;
                    }
                } else {
                    f11 = 0.0f;
                    if (p3Var.getProgressToBlackout() == 0.0f) {
                        i4Var.c3 = r15;
                    }
                }
                float d = this.e.d(i4Var.c3 ? 1.0f : 0.0f, r15);
                if (d > f11) {
                    this.r = true;
                    this.s = r15;
                    super.dispatchDraw(canvas);
                    this.r = r15;
                    b(canvas);
                    paint.setColor(i0.a.k(-16777216, (int) (153.0f * d * hideInterfaceAlpha)));
                    canvas2.drawPaint(paint);
                }
                if (d < f10 && !g4Var.f) {
                    canvas2.save();
                    float f22 = f10 - d;
                    paint.setColor(i0.a.k(-16777216, (int) (129.03f * f22 * hideInterfaceAlpha)));
                    drawable2.setAlpha((int) (f22 * 255.0f * hideInterfaceAlpha));
                    drawable2.setBounds(r15, top, getMeasuredWidth(), i10);
                    drawable2.draw(canvas2);
                    canvas2.drawRect(0.0f, i10, getMeasuredWidth(), getMeasuredHeight(), paint);
                    canvas.restore();
                }
                if (d <= f11 || p3Var.getAlpha() <= 0.0f) {
                    canvas2 = canvas;
                } else {
                    if (p3Var.p0) {
                        p3Var.p0 = r15;
                        p3Var.invalidate();
                    }
                    if (p3Var.getAlpha() != f10) {
                        canvas2 = canvas;
                        canvas2.saveLayerAlpha(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), (int) (p3Var.getAlpha() * 255.0f), 31);
                    } else {
                        canvas2 = canvas;
                        canvas2.save();
                    }
                    canvas2.translate(p3Var.getX(), p3Var.getY() - p3Var.getScrollY());
                    p3Var.draw(canvas2);
                    canvas2.restore();
                }
                boolean z15 = d > f11;
                if (p3Var.p0 != z15) {
                    p3Var.p0 = z15;
                    p3Var.invalidate();
                }
                if (d > f11) {
                    this.r = true;
                    this.s = true;
                    super.dispatchDraw(canvas);
                    this.r = r15;
                }
                f12 = d;
                f13 = i4Var.i1;
                if (f13 != 0.0f || (l4Var = i4Var.h1) == null) {
                    f14 = 1.0f;
                } else {
                    float f23 = i4Var.w3;
                    int measuredWidth = getMeasuredWidth();
                    int measuredHeight2 = getMeasuredHeight() + 1;
                    m4 m4Var = l4Var.f;
                    ImageReceiver imageReceiver = l4Var.a;
                    float f24 = (float) r15;
                    imageReceiver.setImageCoords(f24, f24, measuredWidth, measuredHeight2);
                    imageReceiver.setAlpha(f13);
                    imageReceiver.draw(canvas2);
                    f14 = 1.0f;
                    imageReceiver.setAlpha(1.0f);
                    if (l4Var.c != null) {
                        int i11 = (int) (f13 * 255.0f);
                        l4Var.d.setAlpha(i11);
                        GradientDrawable gradientDrawable = m4Var.D;
                        gradientDrawable.setAlpha(i11);
                        gradientDrawable.setBounds((int) imageReceiver.getImageX(), (int) (imageReceiver.getImageY2() - (AndroidUtilities.dp(24.0f) * f23)), (int) imageReceiver.getImageX2(), ((int) imageReceiver.getImageY2()) + 2);
                        gradientDrawable.draw(canvas2);
                        canvas2.save();
                        canvas2.scale(f23, f23, imageReceiver.getCenterX(), imageReceiver.getImageY2() - (AndroidUtilities.dp(8.0f) * f23));
                        canvas2.translate(imageReceiver.getCenterX() - (m4Var.F / 2.0f), (imageReceiver.getImageY2() - (AndroidUtilities.dp(8.0f) * f23)) - l4Var.c.getHeight());
                        l4Var.c.draw(canvas2);
                        canvas2.restore();
                    }
                }
                if (!i4Var.C2) {
                    f14 = 0.0f;
                }
                this.d.d(f14, r15);
                if (i4Var.G1) {
                    boolean z16 = p3Var.getVisibility() == 0 && (i4Var.c3 || p3Var.s0);
                    i4Var.f3 = p3Var.getVisibility() == 0 && p3Var.getProgressToBlackout() > 0.0f;
                    m9 m9Var2 = ((d9) i4Var.M1).d;
                    m9Var2.H0 = z16;
                    m9Var2.P();
                    ((d9) i4Var.M1).d.i1 = i4Var.f3;
                }
                if (f12 <= 0.0f) {
                    super.dispatchDraw(canvas);
                    b(canvas);
                }
                pyVar = i4Var.g1;
                if (pyVar == null) {
                    pyVar.e(canvas2);
                    return;
                }
                return;
            }
            if (!g4Var.f) {
                int dp2 = AndroidUtilities.dp(i4Var.t2 ? 56.0f : 110.0f);
                if ((i4Var.y1 || !i4Var.t2) && p3Var.getVisibility() == 0) {
                    dp2 = (int) (dp2 * 2.5f);
                }
                drawable2.setBounds(r15, l3Var.getMeasuredHeight() - dp2, getMeasuredWidth(), l3Var.getMeasuredHeight());
                drawable2.setAlpha((int) (hideInterfaceAlpha * 255.0f));
                drawable2.draw(canvas2);
            }
        }
        f12 = 0.0f;
        f13 = i4Var.i1;
        if (f13 != 0.0f) {
        }
        f14 = 1.0f;
        if (!i4Var.C2) {
        }
        this.d.d(f14, r15);
        if (i4Var.G1) {
        }
        if (f12 <= 0.0f) {
        }
        pyVar = i4Var.g1;
        if (pyVar == null) {
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        f1 f1Var;
        i4 i4Var = this.x;
        h4 h4Var = i4Var.I2;
        if (!i4Var.G1 || i4Var.Y2 || h4Var.d == null || (f1Var = h4Var.a) == null || !f1Var.n() || !h4Var.d.dispatchTouchEvent(motionEvent)) {
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
        gc gcVar = gc.w;
        if (gcVar == null || view != gcVar.e) {
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
        gc.a(this, new fh.y0(this, 2));
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        i4 i4Var = this.x;
        i4Var.g1.k();
        gc.h(this);
        c4 c4Var = i4Var.M1;
        if (c4Var != null) {
            m9 m9Var = ((d9) c4Var).d;
            m9Var.U0 = false;
            m9Var.P();
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i9, int i10) {
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.x.u0.getLayoutParams();
        layoutParams.rightMargin = AndroidUtilities.dp(42.0f);
        layoutParams.topMargin = AndroidUtilities.dp(15.0f);
        super.onMeasure(i9, i10);
    }
}
