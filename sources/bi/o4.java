package bi;

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
import org.telegram.ui.Components.es;
import org.telegram.ui.Components.sc;
import org.telegram.ui.kz;
import org.telegram.ui.wv0;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes4.dex */
public final class o4 extends b0 {
    public final org.telegram.ui.Components.g6 d;
    public final org.telegram.ui.Components.g6 e;
    public final org.telegram.ui.Components.voip.h f;
    public final org.telegram.ui.Components.g6 h;
    public final org.telegram.ui.Components.g6 n;
    public boolean r;
    public boolean s;
    public final /* synthetic */ n5 v;
    public final /* synthetic */ sb w;
    public final /* synthetic */ q5 x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o4(q5 q5Var, Context context, n5 n5Var, sb sbVar) {
        super(context);
        this.x = q5Var;
        this.v = n5Var;
        this.w = sbVar;
        es esVar = es.f;
        this.d = new org.telegram.ui.Components.g6(this, 150L, esVar);
        this.e = new org.telegram.ui.Components.g6(this, 150L, esVar);
        this.f = new org.telegram.ui.Components.voip.h(32, 102, 240);
        org.telegram.ui.Components.g6 g6Var = new org.telegram.ui.Components.g6(this);
        this.h = g6Var;
        org.telegram.ui.Components.g6 g6Var2 = new org.telegram.ui.Components.g6(this);
        this.n = g6Var2;
        g6Var.g = 500L;
        g6Var2.g = 100L;
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0157, code lost:
    
        if (r4 >= 0.0f) goto L95;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b(Canvas canvas) {
        TL_stories.StoryItem storyItem;
        o8 o8Var;
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
        ra raVar;
        float f16;
        int i11;
        int i12;
        float f17;
        float f18;
        Paint paint;
        int i13;
        rb rbVar;
        rb rbVar2;
        q5 q5Var = this.x;
        float f19 = q5Var.I1;
        k4 k4Var = q5Var.j1;
        p5 p5Var = q5Var.M2;
        o5 o5Var = q5Var.O1;
        b4 b4Var = q5Var.e1;
        if (b4Var.hasNotThumb() || ((o5Var.e && p5Var.a) || (o5Var.f && p5Var.a))) {
            q5 q5Var2 = o5Var.k;
            TL_stories.PeerStories peerStories = q5Var2.u1;
            sb sbVar = q5Var2.J0;
            if (peerStories == null && (peerStories = q5Var2.S1.y(q5Var2.B1)) == null && (userFull = MessagesController.getInstance(q5Var2.C2).getUserFull(q5Var2.B1)) != null) {
                peerStories = userFull.stories;
            }
            if (q5Var2.K1 && (storyItem2 = o5Var.a) != null && peerStories != null && ((!s9.v(storyItem2) && ((i10 = o5Var.a.id) > peerStories.max_read_id || i10 > q5Var2.S1.f.get(q5Var2.B1, 0))) || q5Var2.C1)) {
                TL_stories.PeerStories peerStories2 = sbVar.Q0;
                if (peerStories2 == null) {
                    x8 x8Var = q5Var2.S1;
                    long j10 = q5Var2.B1;
                    TL_stories.StoryItem storyItem3 = o5Var.a;
                    TL_stories.PeerStories y3 = x8Var.y(j10);
                    if (y3 == null) {
                        y3 = x8Var.z(j10);
                    }
                    if (x8Var.V(y3, storyItem3, false)) {
                        sbVar.c1 = true;
                    }
                } else if (q5Var2.S1.V(peerStories2, o5Var.a, true)) {
                    sbVar.c1 = true;
                }
            } else if (q5Var2.K1 && (storyItem = o5Var.a) != null && (o8Var = sbVar.O0) != null && o8Var.r(storyItem.id)) {
                sbVar.c1 = true;
            }
        }
        hideInterfaceAlpha = q5Var.getHideInterfaceAlpha();
        if (o5Var.e) {
            rb rbVar3 = (rb) p5Var.c;
            if (rbVar3 != null) {
                clamp = Utilities.clamp(rbVar3.getPlaybackProgress(q5Var.R2), 1.0f, 0.0f);
                if (p5Var.a && k4Var != null) {
                    k4Var.e();
                }
            } else {
                clamp = 0.0f;
            }
            invalidate();
            f7 = hideInterfaceAlpha;
        } else if (q5Var.R1 || !q5Var.K1 || q5Var.T1 || q5Var.U1 || q5Var.V1 || !b4Var.hasNotThumb()) {
            f7 = hideInterfaceAlpha;
            clamp = Utilities.clamp(q5Var.W0 / 10000.0f, 1.0f, 0.0f);
        } else {
            long currentTimeMillis = System.currentTimeMillis();
            long j11 = q5Var.X0;
            if (j11 == 0 || q5Var.j3) {
                f7 = hideInterfaceAlpha;
            } else {
                f7 = hideInterfaceAlpha;
                if (q5Var.W0 <= 0 && currentTimeMillis - j11 > 0 && k4Var != null) {
                    k4Var.e();
                }
                q5Var.W0 += currentTimeMillis - q5Var.X0;
            }
            q5Var.X0 = currentTimeMillis;
            clamp = Utilities.clamp(q5Var.W0 / 10000.0f, 1.0f, 0.0f);
            invalidate();
        }
        if (p5Var != null && (rbVar2 = (rb) p5Var.c) != null) {
            f10 = rbVar2.currentSeek;
        }
        f10 = clamp;
        if (!q5Var.Y0 && clamp == 1.0f && ((!o5Var.e || !q5Var.j3) && !q5Var.L2)) {
            q5Var.Y0 = true;
            post(new a3.d(this, 18));
        }
        sb sbVar2 = this.w;
        o8 o8Var2 = sbVar2.O0;
        if (o8Var2 == null || o8Var2.e == 3) {
            f11 = 1.0f;
            f12 = 4.0f;
            f13 = 2.0f;
            f14 = 8.0f;
        } else {
            if (q5Var.q1 == null) {
                q5Var.q1 = new j6.l(3);
            }
            j6.l lVar = q5Var.q1;
            f12 = 4.0f;
            float f20 = (1.0f - q5Var.d4) * f7 * f19;
            int i14 = q5Var.L1;
            f11 = 1.0f;
            int g10 = sbVar2.O0.g();
            f13 = 2.0f;
            m5 m5Var = q5Var.o1;
            f14 = 8.0f;
            org.telegram.ui.Components.r6 r6Var = (org.telegram.ui.Components.r6) lVar.d;
            int i15 = (g10 << 12) + i14;
            if (lVar.a != i15) {
                lVar.a = i15;
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                spannableStringBuilder.append((CharSequence) String.valueOf(i14 + 1)).append((CharSequence) lVar.b).append((CharSequence) "/").append((CharSequence) lVar.c).append((CharSequence) String.valueOf(g10));
                r6Var.t(spannableStringBuilder, false, true);
            }
            canvas.save();
            float y10 = m5Var.getY();
            l5 l5Var = m5Var.b;
            float top = ((r6Var.e / 2.0f) + (y10 + l5Var.getTop())) - 1.0f;
            l5Var.setRightPadding((int) r6Var.c());
            canvas.translate((l5Var.getRightDrawableWidth() + (l5Var.getTextWidth() + (l5Var.getLeft() + (m5Var.getLeft() + AndroidUtilities.dp(4.0f))))) - Utilities.clamp(((l5Var.getRightDrawableWidth() + l5Var.getTextWidth()) + r0) - l5Var.getWidth(), r0, 0), top);
            float dp = AndroidUtilities.dp(8.0f);
            float dp2 = AndroidUtilities.dp(2.0f);
            AndroidUtilities.rectTmp.set(-dp, -dp2, r6Var.c() + dp, r6Var.e + dp2);
            r6Var.B = (int) (f20 * 160.0f);
            r6Var.draw(canvas);
            canvas.restore();
        }
        canvas.save();
        canvas.translate(0.0f, AndroidUtilities.dp(f14) - (AndroidUtilities.dp(f14) * q5Var.d4));
        boolean z11 = o5Var.e && (rbVar = (rb) p5Var.c) != null && rbVar.isBuffering();
        boolean z12 = q5Var.L2;
        boolean z13 = z12 && o5Var != null && o5Var.e && sbVar2.k0;
        float e = q5Var.P2.e(!z12 || z13);
        ra raVar2 = q5Var.p1;
        int measuredWidth = getMeasuredWidth();
        int i16 = q5Var.M1;
        int i17 = q5Var.N1;
        float f21 = (f11 - q5Var.d4) * f19;
        TextPaint textPaint = raVar2.c;
        if (i17 > 0) {
            boolean z14 = z11 && !z13;
            if (raVar2.i != i16) {
                raVar2.g = 0.0f;
                raVar2.h = true;
            }
            raVar2.i = i16;
            n5 n5Var = raVar2.a;
            Paint paint2 = n5Var.a;
            Paint paint3 = n5Var.b;
            int dp3 = i17 > 100 ? 1 : i17 >= 50 ? AndroidUtilities.dp(f11) : AndroidUtilities.dp(f13);
            float dp4 = ((measuredWidth - AndroidUtilities.dp(10.0f)) - ((i17 - 1) * dp3)) / i17;
            AndroidUtilities.dp(5.0f);
            float min = Math.min(dp4 / f13, AndroidUtilities.dp(f11));
            float e7 = raVar2.b.e(z13);
            if (e7 > 0.0f) {
                float lerp = AndroidUtilities.lerp(clamp, f10, e7);
                canvas.save();
                textPaint.setAlpha((int) (e7 * 255.0f));
                z10 = z14;
                textPaint.setShadowLayer(AndroidUtilities.dp(3.0f), 0.0f, AndroidUtilities.dp(f11), org.telegram.ui.ActionBar.g6.m1(e7, 805306368));
                canvas.translate(((measuredWidth - raVar2.f) / f13) - raVar2.e, AndroidUtilities.lerp(AndroidUtilities.dp(f12), AndroidUtilities.dp(16.0f), e7));
                raVar2.d.draw(canvas);
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
                        raVar = raVar2;
                        f16 = clamp;
                        i11 = measuredWidth;
                        i12 = i17;
                        i18++;
                        min = f15;
                        i17 = i12;
                        clamp = f16;
                        measuredWidth = i11;
                        raVar2 = raVar;
                    } else if (f21 > 0.0f) {
                        float lerp2 = AndroidUtilities.lerp(min, AndroidUtilities.dpf2(f13), e7);
                        if (i18 > i16 || i18 != i16) {
                            f15 = min;
                            raVar = raVar2;
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
                                if (raVar2.h) {
                                    float f23 = raVar2.g + 0.026666667f;
                                    raVar2.g = f23;
                                    if (f23 > 0.5f) {
                                        raVar2.h = false;
                                    }
                                } else {
                                    float f24 = raVar2.g - 0.026666667f;
                                    raVar2.g = f24;
                                    if (f24 < -0.5f) {
                                        raVar2.h = true;
                                    }
                                }
                                f17 = lerp2;
                                i13 = (int) (raVar2.g * 51.0f * f21 * e);
                            } else {
                                f17 = lerp2;
                                i13 = 0;
                            }
                            paint2.setAlpha(((int) (85.0f * f21 * e)) + i13);
                            if (e7 > 0.0f) {
                                int i19 = i18 - i16;
                                raVar = raVar2;
                                rectF.left = Utilities.clamp(AndroidUtilities.lerp(rectF.left, AndroidUtilities.dp(5.0f) + (i19 * i11), e7), i11 - AndroidUtilities.dp(5.0f), AndroidUtilities.dp(5.0f));
                                rectF.right = Utilities.clamp(AndroidUtilities.lerp(rectF.right, ((i19 + 1) * i11) - AndroidUtilities.dp(5.0f), e7), i11 - AndroidUtilities.dp(5.0f), AndroidUtilities.dp(5.0f));
                            } else {
                                raVar = raVar2;
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
                        raVar2 = raVar;
                    }
                }
                f15 = min;
                raVar = raVar2;
                f16 = clamp;
                i11 = measuredWidth;
                i12 = i17;
                i18++;
                min = f15;
                i17 = i12;
                clamp = f16;
                measuredWidth = i11;
                raVar2 = raVar;
            }
        }
        canvas.restore();
    }

    /* JADX WARN: Code restructure failed: missing block: B:225:0x01d3, code lost:
    
        if (((bi.rb) r2.c).paused != false) goto L81;
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
        n5 n5Var;
        float hideInterfaceAlpha;
        float f10;
        float f11;
        float f12;
        float f13;
        boolean z10;
        kz kzVar;
        x5 x5Var;
        boolean z11;
        float f14;
        boolean z12;
        org.telegram.ui.Components.g6 g6Var;
        boolean hasNotThumb;
        gh.d dVar;
        rb rbVar;
        ua uaVar;
        Canvas canvas2 = canvas;
        q5 q5Var = this.x;
        o4 o4Var = q5Var.c1;
        k4 k4Var = q5Var.j1;
        o5 o5Var = q5Var.O1;
        b4 b4Var = q5Var.e1;
        p5 p5Var = q5Var.M2;
        u4 u4Var = q5Var.K0;
        if (!q5Var.K1) {
            q5Var.o1.a.getImageReceiver().setVisible(true, true);
        }
        boolean z13 = q5Var.c3;
        n5 n5Var2 = this.v;
        if (z13) {
            f7 = 1.0f;
            canvas2.drawColor(i0.a.d(0.2f, -16777216, -1));
        } else {
            f7 = 1.0f;
            if (((org.telegram.ui.n4) p5Var.e) != null || (k4Var != null && (((uaVar = k4Var.b) != null && (uaVar.w || uaVar.s)) || k4Var.y.i))) {
                invalidate();
            }
            canvas2.save();
            wv0 wv0Var = q5Var.X2;
            if (wv0Var.n) {
                canvas2.save();
                float f15 = wv0Var.O;
                float f16 = wv0Var.A;
                float f17 = ((f15 * f16) + 1.0f) - f16;
                canvas2.scale(f17, f17, wv0Var.o + wv0Var.s, wv0Var.p + wv0Var.t);
                float f18 = wv0Var.o;
                float f19 = wv0Var.J;
                float f20 = wv0Var.A;
                canvas2.translate((f19 * f20) + f18, (wv0Var.K * f20) + wv0Var.p);
            }
            org.telegram.ui.n4 n4Var = (org.telegram.ui.n4) p5Var.e;
            if (n4Var == null || (!p5Var.a && ((t1) p5Var.b) == null)) {
                if (n4Var != null) {
                    invalidate();
                }
                if (o5Var.d) {
                    canvas2.drawColor(i0.a.d(0.2f, -16777216, -1));
                } else {
                    if (!b4Var.hasBitmapImage()) {
                        n5Var2.f.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight() + 1);
                        n5Var2.f.draw(canvas2);
                    }
                    f14 = 0.0f;
                    b4Var.setImageCoords(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight() + 1);
                    b4Var.draw(canvas2);
                    canvas2.restore();
                    z12 = q5Var.Y2;
                    org.telegram.ui.Components.g6 g6Var2 = this.h;
                    g6Var = this.n;
                    if (z12) {
                        g6Var2.d(f14, true);
                        g6Var.d(f14, true);
                    }
                    if (!o5Var.f) {
                        t1 t1Var = (t1) p5Var.b;
                        if (t1Var != null) {
                            if (!p5Var.a) {
                            }
                            hasNotThumb = true;
                        }
                        hasNotThumb = false;
                    } else if (o5Var.e) {
                        if (((org.telegram.ui.n4) p5Var.e) != null) {
                            rb rbVar2 = (rb) p5Var.c;
                            if (rbVar2 != null) {
                                if (p5Var.a) {
                                    if (rbVar2.progress == 0.0f) {
                                        if (rbVar2 != null) {
                                            if (rbVar2.isBuffering()) {
                                            }
                                        }
                                    }
                                    hasNotThumb = true;
                                }
                            }
                        }
                        hasNotThumb = false;
                    } else {
                        hasNotThumb = b4Var.hasNotThumb();
                    }
                    g6Var2.d((q5Var.K1 || hasNotThumb || o5Var.b != null) ? 0.0f : 1.0f, false);
                    g6Var.d(g6Var2.c != 1.0f ? 1.0f : 0.0f, false);
                    if (g6Var.c > 0.0f) {
                        RectF rectF = AndroidUtilities.rectTmp;
                        rectF.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                        int i10 = (int) (g6Var.c * 255.0f);
                        org.telegram.ui.Components.voip.h hVar = this.f;
                        hVar.a.setAlpha(i10);
                        hVar.c.setAlpha(i10);
                        hVar.f = getMeasuredWidth() * 2;
                        hVar.n = 1.3f;
                        hVar.a(AndroidUtilities.dp(10.0f), canvas2, rectF, this);
                    }
                    q5Var.Y2 = false;
                }
            } else {
                if (!b4Var.hasBitmapImage()) {
                    n5Var2.f.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight() + 1);
                    n5Var2.f.draw(canvas2);
                }
                b4Var.setImageCoords(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight() + 1);
                b4Var.draw(canvas2);
                if (q5Var.K1) {
                    sb sbVar = this.w;
                    boolean z14 = sbVar.a;
                    if (z14 && (rbVar = (rb) p5Var.c) != null && rbVar.paused && rbVar.playerStubBitmap != null && rbVar.stubAvailable) {
                        canvas2.save();
                        canvas2.scale(getMeasuredWidth() / ((rb) p5Var.c).playerStubBitmap.getWidth(), getMeasuredHeight() / ((rb) p5Var.c).playerStubBitmap.getHeight());
                        rb rbVar3 = (rb) p5Var.c;
                        canvas2.drawBitmap(rbVar3.playerStubBitmap, 0.0f, 0.0f, rbVar3.playerStubPaint);
                        canvas2.restore();
                    } else {
                        boolean z15 = Build.VERSION.SDK_INT >= 29 && (dVar = q5Var.H3) != null && canvas2 == dVar.r;
                        if (!z14 || (q5Var.b1 && !sbVar.H0 && !z15)) {
                            ((org.telegram.ui.n4) p5Var.e).draw(canvas2);
                        }
                    }
                }
            }
            f14 = 0.0f;
            canvas2.restore();
            z12 = q5Var.Y2;
            org.telegram.ui.Components.g6 g6Var22 = this.h;
            g6Var = this.n;
            if (z12) {
            }
            if (!o5Var.f) {
            }
            g6Var22.d((q5Var.K1 || hasNotThumb || o5Var.b != null) ? 0.0f : 1.0f, false);
            g6Var.d(g6Var22.c != 1.0f ? 1.0f : 0.0f, false);
            if (g6Var.c > 0.0f) {
            }
            q5Var.Y2 = false;
        }
        if (u4Var.getAlpha() > 0.0f) {
            if (u4Var.getAlpha() == f7) {
                canvas2.save();
                z11 = false;
                n5Var = n5Var2;
            } else {
                n5Var = n5Var2;
                z11 = false;
                canvas2.saveLayerAlpha(0.0f, 0.0f, u4Var.getMeasuredWidth(), u4Var.getMeasuredHeight(), (int) (u4Var.getAlpha() * 255.0f), 31);
            }
            k4Var.draw(canvas2);
            canvas2.restore();
            r15 = z11;
        } else {
            r15 = 0;
            n5Var = n5Var2;
        }
        if (!q5Var.Z0 && b4Var.hasNotThumb()) {
            q5Var.Z0 = true;
            q5Var.invalidate();
        }
        hideInterfaceAlpha = q5Var.getHideInterfaceAlpha();
        Drawable drawable = n5Var.d;
        Paint paint = n5Var.c;
        Drawable drawable2 = n5Var.e;
        drawable.setAlpha(255);
        n5Var.d.draw(canvas2);
        if (q5Var.C1 || !q5Var.x2 || u4Var.getVisibility() == 0) {
            if (u4Var.getVisibility() == 0) {
                int dp = AndroidUtilities.dp(72.0f);
                int top = u4Var.getTop() + ((int) (u4Var.getTextTop() - AndroidUtilities.dp(24.0f)));
                int i11 = dp + top;
                float measuredHeight = getMeasuredHeight() * 0.65f;
                if ((measuredHeight - top) / AndroidUtilities.dp(60.0f) > 0.0f && u4Var.w0 && u4Var.r0.getBottom() - u4Var.getMeasuredHeight() > 0) {
                    if ((measuredHeight - (u4Var.getTop() + ((int) (u4Var.getMaxTop() - AndroidUtilities.dp(24.0f))))) / AndroidUtilities.dp(60.0f) > 0.0f) {
                        q5Var.g3 = true;
                    }
                    f10 = 0.0f;
                } else if (q5Var.h3) {
                    q5Var.h3 = r15;
                    f10 = 0.0f;
                    if ((measuredHeight - (u4Var.getTop() + ((int) (u4Var.getMaxTop() - AndroidUtilities.dp(24.0f))))) / AndroidUtilities.dp(60.0f) > 0.0f) {
                        q5Var.g3 = true;
                    }
                } else {
                    f10 = 0.0f;
                    if (u4Var.getProgressToBlackout() == 0.0f) {
                        q5Var.g3 = r15;
                    }
                }
                float d = this.e.d(q5Var.g3 ? f7 : f10, r15);
                if (d > f10) {
                    this.r = true;
                    this.s = r15;
                    super.dispatchDraw(canvas);
                    this.r = r15;
                    b(canvas);
                    paint.setColor(i0.a.k(-16777216, (int) (153.0f * d * hideInterfaceAlpha)));
                    canvas2.drawPaint(paint);
                }
                if (d < f7 && !o5Var.f) {
                    canvas2.save();
                    float f21 = f7 - d;
                    paint.setColor(i0.a.k(-16777216, (int) (129.03f * f21 * hideInterfaceAlpha)));
                    drawable2.setAlpha((int) (f21 * 255.0f * hideInterfaceAlpha));
                    drawable2.setBounds(r15, top, getMeasuredWidth(), i11);
                    drawable2.draw(canvas2);
                    canvas2.drawRect(0.0f, i11, getMeasuredWidth(), getMeasuredHeight(), paint);
                    canvas.restore();
                }
                if (d <= f10 || u4Var.getAlpha() <= 0.0f) {
                    canvas2 = canvas;
                } else {
                    if (u4Var.t0) {
                        u4Var.t0 = r15;
                        u4Var.invalidate();
                    }
                    if (u4Var.getAlpha() != f7) {
                        canvas2 = canvas;
                        canvas2.saveLayerAlpha(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), (int) (u4Var.getAlpha() * 255.0f), 31);
                    } else {
                        canvas2 = canvas;
                        canvas2.save();
                    }
                    canvas2.translate(u4Var.getX(), u4Var.getY() - u4Var.getScrollY());
                    u4Var.draw(canvas2);
                    canvas2.restore();
                }
                boolean z16 = d > f10 ? true : r15;
                if (u4Var.t0 != z16) {
                    u4Var.t0 = z16;
                    u4Var.invalidate();
                }
                if (d > f10) {
                    this.r = true;
                    this.s = true;
                    super.dispatchDraw(canvas);
                    this.r = r15;
                }
                f11 = d;
                f12 = q5Var.m1;
                if (f12 != 0.0f || (x5Var = q5Var.l1) == null) {
                    f13 = f7;
                    z10 = true;
                } else {
                    float f22 = q5Var.A3;
                    int measuredWidth = getMeasuredWidth();
                    z10 = true;
                    int measuredHeight2 = getMeasuredHeight() + 1;
                    y5 y5Var = x5Var.f;
                    ImageReceiver imageReceiver = x5Var.a;
                    float f23 = (float) r15;
                    imageReceiver.setImageCoords(f23, f23, measuredWidth, measuredHeight2);
                    imageReceiver.setAlpha(f12);
                    imageReceiver.draw(canvas2);
                    f13 = f7;
                    imageReceiver.setAlpha(f13);
                    if (x5Var.c != null) {
                        int i12 = (int) (f12 * 255.0f);
                        x5Var.d.setAlpha(i12);
                        GradientDrawable gradientDrawable = y5Var.H;
                        gradientDrawable.setAlpha(i12);
                        gradientDrawable.setBounds((int) imageReceiver.getImageX(), (int) (imageReceiver.getImageY2() - (AndroidUtilities.dp(24.0f) * f22)), (int) imageReceiver.getImageX2(), ((int) imageReceiver.getImageY2()) + 2);
                        gradientDrawable.draw(canvas2);
                        canvas2.save();
                        canvas2.scale(f22, f22, imageReceiver.getCenterX(), imageReceiver.getImageY2() - (AndroidUtilities.dp(8.0f) * f22));
                        canvas2.translate(imageReceiver.getCenterX() - (y5Var.J / 2.0f), (imageReceiver.getImageY2() - (AndroidUtilities.dp(8.0f) * f22)) - x5Var.c.getHeight());
                        x5Var.c.draw(canvas2);
                        canvas2.restore();
                    }
                }
                if (!q5Var.G2) {
                    f13 = 0.0f;
                }
                this.d.d(f13, r15);
                if (q5Var.K1) {
                    boolean z17 = (u4Var.getVisibility() == 0 && (q5Var.g3 || u4Var.w0)) ? z10 : r15;
                    q5Var.j3 = (u4Var.getVisibility() != 0 || u4Var.getProgressToBlackout() <= 0.0f) ? r15 : z10;
                    sb sbVar2 = ((jb) q5Var.Q1).d;
                    sbVar2.L0 = z17;
                    sbVar2.P();
                    ((jb) q5Var.Q1).d.m1 = q5Var.j3;
                }
                if (f11 <= 0.0f) {
                    super.dispatchDraw(canvas);
                    b(canvas);
                }
                kzVar = q5Var.k1;
                if (kzVar == null) {
                    kzVar.e(canvas2);
                    return;
                }
                return;
            }
            if (!o5Var.f) {
                int dp2 = AndroidUtilities.dp(q5Var.x2 ? 56.0f : 110.0f);
                if ((q5Var.C1 || !q5Var.x2) && u4Var.getVisibility() == 0) {
                    dp2 = (int) (dp2 * 2.5f);
                }
                drawable2.setBounds(r15, o4Var.getMeasuredHeight() - dp2, getMeasuredWidth(), o4Var.getMeasuredHeight());
                drawable2.setAlpha((int) (hideInterfaceAlpha * 255.0f));
                drawable2.draw(canvas2);
            }
        }
        f11 = 0.0f;
        f12 = q5Var.m1;
        if (f12 != 0.0f) {
        }
        f13 = f7;
        z10 = true;
        if (!q5Var.G2) {
        }
        this.d.d(f13, r15);
        if (q5Var.K1) {
        }
        if (f11 <= 0.0f) {
        }
        kzVar = q5Var.k1;
        if (kzVar == null) {
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        t1 t1Var;
        q5 q5Var = this.x;
        p5 p5Var = q5Var.M2;
        if (!q5Var.K1 || q5Var.c3 || ((org.telegram.ui.n4) p5Var.e) == null || (t1Var = (t1) p5Var.b) == null || !t1Var.n() || !((org.telegram.ui.n4) p5Var.e).dispatchTouchEvent(motionEvent)) {
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
        sc scVar = sc.w;
        if (scVar == null || view != scVar.e) {
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
        sc.a(this, new ah.m0(this, 1));
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        q5 q5Var = this.x;
        q5Var.k1.j();
        sc.h(this);
        j5 j5Var = q5Var.Q1;
        if (j5Var != null) {
            sb sbVar = ((jb) j5Var).d;
            sbVar.Y0 = false;
            sbVar.P();
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
