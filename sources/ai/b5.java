package ai;

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
import org.telegram.ui.Components.hs;
import org.telegram.ui.fz;
import org.telegram.ui.qv0;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes4.dex */
public final class b5 extends i0 {
    public final org.telegram.ui.Components.g6 d;
    public final org.telegram.ui.Components.g6 e;
    public final org.telegram.ui.Components.voip.h f;
    public final org.telegram.ui.Components.g6 h;
    public final org.telegram.ui.Components.g6 n;
    public boolean r;
    public boolean s;
    public final /* synthetic */ c6 v;
    public final /* synthetic */ kc w;
    public final /* synthetic */ f6 x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b5(f6 f6Var, Context context, c6 c6Var, kc kcVar) {
        super(context);
        this.x = f6Var;
        this.v = c6Var;
        this.w = kcVar;
        hs hsVar = hs.f;
        this.d = new org.telegram.ui.Components.g6(this, 150L, hsVar);
        this.e = new org.telegram.ui.Components.g6(this, 150L, hsVar);
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
        e9 e9Var;
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
        ib ibVar;
        float f16;
        int i11;
        int i12;
        float f17;
        float f18;
        Paint paint;
        int i13;
        jc jcVar;
        jc jcVar2;
        f6 f6Var = this.x;
        float f19 = f6Var.I1;
        w4 w4Var = f6Var.j1;
        e6 e6Var = f6Var.M2;
        d6 d6Var = f6Var.O1;
        m4 m4Var = f6Var.e1;
        if (m4Var.hasNotThumb() || ((d6Var.e && e6Var.a) || (d6Var.f && e6Var.a))) {
            f6 f6Var2 = d6Var.k;
            TL_stories.PeerStories peerStories = f6Var2.u1;
            kc kcVar = f6Var2.J0;
            if (peerStories == null && (peerStories = f6Var2.S1.y(f6Var2.B1)) == null && (userFull = MessagesController.getInstance(f6Var2.C2).getUserFull(f6Var2.B1)) != null) {
                peerStories = userFull.stories;
            }
            if (f6Var2.K1 && (storyItem2 = d6Var.a) != null && peerStories != null && ((!ja.v(storyItem2) && ((i10 = d6Var.a.id) > peerStories.max_read_id || i10 > f6Var2.S1.f.get(f6Var2.B1, 0))) || f6Var2.C1)) {
                TL_stories.PeerStories peerStories2 = kcVar.Q0;
                if (peerStories2 == null) {
                    m9 m9Var = f6Var2.S1;
                    long j3 = f6Var2.B1;
                    TL_stories.StoryItem storyItem3 = d6Var.a;
                    TL_stories.PeerStories y3 = m9Var.y(j3);
                    if (y3 == null) {
                        y3 = m9Var.z(j3);
                    }
                    if (m9Var.V(y3, storyItem3, false)) {
                        kcVar.c1 = true;
                    }
                } else if (f6Var2.S1.V(peerStories2, d6Var.a, true)) {
                    kcVar.c1 = true;
                }
            } else if (f6Var2.K1 && (storyItem = d6Var.a) != null && (e9Var = kcVar.O0) != null && e9Var.r(storyItem.id)) {
                kcVar.c1 = true;
            }
        }
        hideInterfaceAlpha = f6Var.getHideInterfaceAlpha();
        if (d6Var.e) {
            jc jcVar3 = (jc) e6Var.c;
            if (jcVar3 != null) {
                clamp = Utilities.clamp(jcVar3.getPlaybackProgress(f6Var.R2), 1.0f, 0.0f);
                if (e6Var.a && w4Var != null) {
                    w4Var.e();
                }
            } else {
                clamp = 0.0f;
            }
            invalidate();
            f7 = hideInterfaceAlpha;
        } else if (f6Var.R1 || !f6Var.K1 || f6Var.T1 || f6Var.U1 || f6Var.V1 || !m4Var.hasNotThumb()) {
            f7 = hideInterfaceAlpha;
            clamp = Utilities.clamp(f6Var.W0 / 10000.0f, 1.0f, 0.0f);
        } else {
            long currentTimeMillis = System.currentTimeMillis();
            long j10 = f6Var.X0;
            if (j10 == 0 || f6Var.j3) {
                f7 = hideInterfaceAlpha;
            } else {
                f7 = hideInterfaceAlpha;
                if (f6Var.W0 <= 0 && currentTimeMillis - j10 > 0 && w4Var != null) {
                    w4Var.e();
                }
                f6Var.W0 += currentTimeMillis - f6Var.X0;
            }
            f6Var.X0 = currentTimeMillis;
            clamp = Utilities.clamp(f6Var.W0 / 10000.0f, 1.0f, 0.0f);
            invalidate();
        }
        if (e6Var != null && (jcVar2 = (jc) e6Var.c) != null) {
            f10 = jcVar2.currentSeek;
        }
        f10 = clamp;
        if (!f6Var.Y0 && clamp == 1.0f && ((!d6Var.e || !f6Var.j3) && !f6Var.L2)) {
            f6Var.Y0 = true;
            post(new a3.d(this, 7));
        }
        kc kcVar2 = this.w;
        e9 e9Var2 = kcVar2.O0;
        if (e9Var2 == null || e9Var2.e == 3) {
            f11 = 1.0f;
            f12 = 4.0f;
            f13 = 2.0f;
            f14 = 8.0f;
        } else {
            if (f6Var.q1 == null) {
                f6Var.q1 = new j6.l(1);
            }
            j6.l lVar = f6Var.q1;
            f12 = 4.0f;
            float f20 = (1.0f - f6Var.d4) * f7 * f19;
            int i14 = f6Var.L1;
            f11 = 1.0f;
            int g10 = kcVar2.O0.g();
            f13 = 2.0f;
            b6 b6Var = f6Var.o1;
            f14 = 8.0f;
            org.telegram.ui.Components.q6 q6Var = (org.telegram.ui.Components.q6) lVar.d;
            int i15 = (g10 << 12) + i14;
            if (lVar.a != i15) {
                lVar.a = i15;
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                spannableStringBuilder.append((CharSequence) String.valueOf(i14 + 1)).append((CharSequence) lVar.b).append((CharSequence) "/").append((CharSequence) lVar.c).append((CharSequence) String.valueOf(g10));
                q6Var.t(spannableStringBuilder, false, true);
            }
            canvas.save();
            float y10 = b6Var.getY();
            a6 a6Var = b6Var.b;
            float top = ((q6Var.e / 2.0f) + (y10 + a6Var.getTop())) - 1.0f;
            a6Var.setRightPadding((int) q6Var.c());
            canvas.translate((a6Var.getRightDrawableWidth() + (a6Var.getTextWidth() + (a6Var.getLeft() + (b6Var.getLeft() + AndroidUtilities.dp(4.0f))))) - Utilities.clamp(((a6Var.getRightDrawableWidth() + a6Var.getTextWidth()) + r0) - a6Var.getWidth(), r0, 0), top);
            float dp = AndroidUtilities.dp(8.0f);
            float dp2 = AndroidUtilities.dp(2.0f);
            AndroidUtilities.rectTmp.set(-dp, -dp2, q6Var.c() + dp, q6Var.e + dp2);
            q6Var.B = (int) (f20 * 160.0f);
            q6Var.draw(canvas);
            canvas.restore();
        }
        canvas.save();
        canvas.translate(0.0f, AndroidUtilities.dp(f14) - (AndroidUtilities.dp(f14) * f6Var.d4));
        boolean z11 = d6Var.e && (jcVar = (jc) e6Var.c) != null && jcVar.isBuffering();
        boolean z12 = f6Var.L2;
        boolean z13 = z12 && d6Var != null && d6Var.e && kcVar2.k0;
        float e7 = f6Var.P2.e(!z12 || z13);
        ib ibVar2 = f6Var.p1;
        int measuredWidth = getMeasuredWidth();
        int i16 = f6Var.M1;
        int i17 = f6Var.N1;
        float f21 = (f11 - f6Var.d4) * f19;
        TextPaint textPaint = ibVar2.c;
        if (i17 > 0) {
            boolean z14 = z11 && !z13;
            if (ibVar2.i != i16) {
                ibVar2.g = 0.0f;
                ibVar2.h = true;
            }
            ibVar2.i = i16;
            c6 c6Var = ibVar2.a;
            Paint paint2 = c6Var.a;
            Paint paint3 = c6Var.b;
            int dp3 = i17 > 100 ? 1 : i17 >= 50 ? AndroidUtilities.dp(f11) : AndroidUtilities.dp(f13);
            float dp4 = ((measuredWidth - AndroidUtilities.dp(10.0f)) - ((i17 - 1) * dp3)) / i17;
            AndroidUtilities.dp(5.0f);
            float min = Math.min(dp4 / f13, AndroidUtilities.dp(f11));
            float e10 = ibVar2.b.e(z13);
            if (e10 > 0.0f) {
                float lerp = AndroidUtilities.lerp(clamp, f10, e10);
                canvas.save();
                textPaint.setAlpha((int) (e10 * 255.0f));
                z10 = z14;
                textPaint.setShadowLayer(AndroidUtilities.dp(3.0f), 0.0f, AndroidUtilities.dp(f11), org.telegram.ui.ActionBar.i6.m1(e10, 805306368));
                canvas.translate(((measuredWidth - ibVar2.f) / f13) - ibVar2.e, AndroidUtilities.lerp(AndroidUtilities.dp(f12), AndroidUtilities.dp(16.0f), e10));
                ibVar2.d.draw(canvas);
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
                        ibVar = ibVar2;
                        f16 = clamp;
                        i11 = measuredWidth;
                        i12 = i17;
                        i18++;
                        min = f15;
                        i17 = i12;
                        clamp = f16;
                        measuredWidth = i11;
                        ibVar2 = ibVar;
                    } else if (f21 > 0.0f) {
                        float lerp2 = AndroidUtilities.lerp(min, AndroidUtilities.dpf2(f13), e10);
                        if (i18 > i16 || i18 != i16) {
                            f15 = min;
                            ibVar = ibVar2;
                            f16 = clamp;
                            i11 = measuredWidth;
                            f17 = lerp2;
                            f18 = f11;
                        } else {
                            f15 = min;
                            RectF rectF = AndroidUtilities.rectTmp;
                            f16 = clamp;
                            i11 = measuredWidth;
                            rectF.set(dp5, 0.0f, f22, AndroidUtilities.lerp(AndroidUtilities.dpf2(f13), AndroidUtilities.dpf2(5.0f), (i16 == i18 ? 1 : 0) * e10));
                            if (z10) {
                                if (ibVar2.h) {
                                    float f23 = ibVar2.g + 0.026666667f;
                                    ibVar2.g = f23;
                                    if (f23 > 0.5f) {
                                        ibVar2.h = false;
                                    }
                                } else {
                                    float f24 = ibVar2.g - 0.026666667f;
                                    ibVar2.g = f24;
                                    if (f24 < -0.5f) {
                                        ibVar2.h = true;
                                    }
                                }
                                f17 = lerp2;
                                i13 = (int) (ibVar2.g * 51.0f * f21 * e7);
                            } else {
                                f17 = lerp2;
                                i13 = 0;
                            }
                            paint2.setAlpha(((int) (85.0f * f21 * e7)) + i13);
                            if (e10 > 0.0f) {
                                int i19 = i18 - i16;
                                ibVar = ibVar2;
                                rectF.left = Utilities.clamp(AndroidUtilities.lerp(rectF.left, AndroidUtilities.dp(5.0f) + (i19 * i11), e10), i11 - AndroidUtilities.dp(5.0f), AndroidUtilities.dp(5.0f));
                                rectF.right = Utilities.clamp(AndroidUtilities.lerp(rectF.right, ((i19 + 1) * i11) - AndroidUtilities.dp(5.0f), e10), i11 - AndroidUtilities.dp(5.0f), AndroidUtilities.dp(5.0f));
                            } else {
                                ibVar = ibVar2;
                            }
                            canvas.drawRoundRect(rectF, f17, f17, paint2);
                            f18 = f16;
                        }
                        RectF rectF2 = AndroidUtilities.rectTmp;
                        i12 = i17;
                        rectF2.set(dp5, 0.0f, f22, AndroidUtilities.lerp(AndroidUtilities.dpf2(f13), AndroidUtilities.dpf2(5.0f), (i16 == i18 ? 1 : 0) * e10));
                        if (e10 > 0.0f) {
                            int i20 = i18 - i16;
                            rectF2.left = Utilities.clamp(AndroidUtilities.lerp(rectF2.left, AndroidUtilities.dp(5.0f) + (i20 * i11), e10), i11 - AndroidUtilities.dp(5.0f), AndroidUtilities.dp(5.0f));
                            rectF2.right = Utilities.clamp(AndroidUtilities.lerp(rectF2.right, ((i20 + 1) * i11) - AndroidUtilities.dp(5.0f), e10), i11 - AndroidUtilities.dp(5.0f), AndroidUtilities.dp(5.0f));
                        }
                        rectF2.right = AndroidUtilities.lerp(rectF2.left, rectF2.right, f18);
                        if (i18 <= i16) {
                            paint3.setAlpha((int) (f21 * 255.0f * e7));
                            paint = paint3;
                        } else {
                            paint2.setAlpha((int) (85 * f21 * e7));
                            paint = paint2;
                        }
                        canvas.drawRoundRect(rectF2, f17, f17, paint);
                        i18++;
                        min = f15;
                        i17 = i12;
                        clamp = f16;
                        measuredWidth = i11;
                        ibVar2 = ibVar;
                    }
                }
                f15 = min;
                ibVar = ibVar2;
                f16 = clamp;
                i11 = measuredWidth;
                i12 = i17;
                i18++;
                min = f15;
                i17 = i12;
                clamp = f16;
                measuredWidth = i11;
                ibVar2 = ibVar;
            }
        }
        canvas.restore();
    }

    /* JADX WARN: Code restructure failed: missing block: B:225:0x01d3, code lost:
    
        if (((ai.jc) r2.c).paused != false) goto L81;
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
        c6 c6Var;
        float hideInterfaceAlpha;
        float f10;
        float f11;
        float f12;
        float f13;
        boolean z10;
        fz fzVar;
        m6 m6Var;
        boolean z11;
        float f14;
        boolean z12;
        org.telegram.ui.Components.g6 g6Var;
        boolean hasNotThumb;
        fh.d dVar;
        jc jcVar;
        lb lbVar;
        Canvas canvas2 = canvas;
        f6 f6Var = this.x;
        b5 b5Var = f6Var.c1;
        w4 w4Var = f6Var.j1;
        d6 d6Var = f6Var.O1;
        m4 m4Var = f6Var.e1;
        e6 e6Var = f6Var.M2;
        h5 h5Var = f6Var.K0;
        if (!f6Var.K1) {
            f6Var.o1.a.getImageReceiver().setVisible(true, true);
        }
        boolean z13 = f6Var.c3;
        c6 c6Var2 = this.v;
        if (z13) {
            f7 = 1.0f;
            canvas2.drawColor(i0.a.d(0.2f, -16777216, -1));
        } else {
            f7 = 1.0f;
            if (((org.telegram.ui.l4) e6Var.e) != null || (w4Var != null && (((lbVar = w4Var.b) != null && (lbVar.w || lbVar.s)) || w4Var.y.i))) {
                invalidate();
            }
            canvas2.save();
            qv0 qv0Var = f6Var.X2;
            if (qv0Var.n) {
                canvas2.save();
                float f15 = qv0Var.O;
                float f16 = qv0Var.A;
                float f17 = ((f15 * f16) + 1.0f) - f16;
                canvas2.scale(f17, f17, qv0Var.o + qv0Var.s, qv0Var.p + qv0Var.t);
                float f18 = qv0Var.o;
                float f19 = qv0Var.J;
                float f20 = qv0Var.A;
                canvas2.translate((f19 * f20) + f18, (qv0Var.K * f20) + qv0Var.p);
            }
            org.telegram.ui.l4 l4Var = (org.telegram.ui.l4) e6Var.e;
            if (l4Var == null || (!e6Var.a && ((d2) e6Var.b) == null)) {
                if (l4Var != null) {
                    invalidate();
                }
                if (d6Var.d) {
                    canvas2.drawColor(i0.a.d(0.2f, -16777216, -1));
                } else {
                    if (!m4Var.hasBitmapImage()) {
                        c6Var2.f.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight() + 1);
                        c6Var2.f.draw(canvas2);
                    }
                    f14 = 0.0f;
                    m4Var.setImageCoords(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight() + 1);
                    m4Var.draw(canvas2);
                    canvas2.restore();
                    z12 = f6Var.Y2;
                    org.telegram.ui.Components.g6 g6Var2 = this.h;
                    g6Var = this.n;
                    if (z12) {
                        g6Var2.d(f14, true);
                        g6Var.d(f14, true);
                    }
                    if (!d6Var.f) {
                        d2 d2Var = (d2) e6Var.b;
                        if (d2Var != null) {
                            if (!e6Var.a) {
                            }
                            hasNotThumb = true;
                        }
                        hasNotThumb = false;
                    } else if (d6Var.e) {
                        if (((org.telegram.ui.l4) e6Var.e) != null) {
                            jc jcVar2 = (jc) e6Var.c;
                            if (jcVar2 != null) {
                                if (e6Var.a) {
                                    if (jcVar2.progress == 0.0f) {
                                        if (jcVar2 != null) {
                                            if (jcVar2.isBuffering()) {
                                            }
                                        }
                                    }
                                    hasNotThumb = true;
                                }
                            }
                        }
                        hasNotThumb = false;
                    } else {
                        hasNotThumb = m4Var.hasNotThumb();
                    }
                    g6Var2.d((f6Var.K1 || hasNotThumb || d6Var.b != null) ? 0.0f : 1.0f, false);
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
                    f6Var.Y2 = false;
                }
            } else {
                if (!m4Var.hasBitmapImage()) {
                    c6Var2.f.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight() + 1);
                    c6Var2.f.draw(canvas2);
                }
                m4Var.setImageCoords(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight() + 1);
                m4Var.draw(canvas2);
                if (f6Var.K1) {
                    kc kcVar = this.w;
                    boolean z14 = kcVar.a;
                    if (z14 && (jcVar = (jc) e6Var.c) != null && jcVar.paused && jcVar.playerStubBitmap != null && jcVar.stubAvailable) {
                        canvas2.save();
                        canvas2.scale(getMeasuredWidth() / ((jc) e6Var.c).playerStubBitmap.getWidth(), getMeasuredHeight() / ((jc) e6Var.c).playerStubBitmap.getHeight());
                        jc jcVar3 = (jc) e6Var.c;
                        canvas2.drawBitmap(jcVar3.playerStubBitmap, 0.0f, 0.0f, jcVar3.playerStubPaint);
                        canvas2.restore();
                    } else {
                        boolean z15 = Build.VERSION.SDK_INT >= 29 && (dVar = f6Var.H3) != null && canvas2 == dVar.r;
                        if (!z14 || (f6Var.b1 && !kcVar.H0 && !z15)) {
                            ((org.telegram.ui.l4) e6Var.e).draw(canvas2);
                        }
                    }
                }
            }
            f14 = 0.0f;
            canvas2.restore();
            z12 = f6Var.Y2;
            org.telegram.ui.Components.g6 g6Var22 = this.h;
            g6Var = this.n;
            if (z12) {
            }
            if (!d6Var.f) {
            }
            g6Var22.d((f6Var.K1 || hasNotThumb || d6Var.b != null) ? 0.0f : 1.0f, false);
            g6Var.d(g6Var22.c != 1.0f ? 1.0f : 0.0f, false);
            if (g6Var.c > 0.0f) {
            }
            f6Var.Y2 = false;
        }
        if (h5Var.getAlpha() > 0.0f) {
            if (h5Var.getAlpha() == f7) {
                canvas2.save();
                z11 = false;
                c6Var = c6Var2;
            } else {
                c6Var = c6Var2;
                z11 = false;
                canvas2.saveLayerAlpha(0.0f, 0.0f, h5Var.getMeasuredWidth(), h5Var.getMeasuredHeight(), (int) (h5Var.getAlpha() * 255.0f), 31);
            }
            w4Var.draw(canvas2);
            canvas2.restore();
            r15 = z11;
        } else {
            r15 = 0;
            c6Var = c6Var2;
        }
        if (!f6Var.Z0 && m4Var.hasNotThumb()) {
            f6Var.Z0 = true;
            f6Var.invalidate();
        }
        hideInterfaceAlpha = f6Var.getHideInterfaceAlpha();
        Drawable drawable = c6Var.d;
        Paint paint = c6Var.c;
        Drawable drawable2 = c6Var.e;
        drawable.setAlpha(255);
        c6Var.d.draw(canvas2);
        if (f6Var.C1 || !f6Var.x2 || h5Var.getVisibility() == 0) {
            if (h5Var.getVisibility() == 0) {
                int dp = AndroidUtilities.dp(72.0f);
                int top = h5Var.getTop() + ((int) (h5Var.getTextTop() - AndroidUtilities.dp(24.0f)));
                int i11 = dp + top;
                float measuredHeight = getMeasuredHeight() * 0.65f;
                if ((measuredHeight - top) / AndroidUtilities.dp(60.0f) > 0.0f && h5Var.w0 && h5Var.r0.getBottom() - h5Var.getMeasuredHeight() > 0) {
                    if ((measuredHeight - (h5Var.getTop() + ((int) (h5Var.getMaxTop() - AndroidUtilities.dp(24.0f))))) / AndroidUtilities.dp(60.0f) > 0.0f) {
                        f6Var.g3 = true;
                    }
                    f10 = 0.0f;
                } else if (f6Var.h3) {
                    f6Var.h3 = r15;
                    f10 = 0.0f;
                    if ((measuredHeight - (h5Var.getTop() + ((int) (h5Var.getMaxTop() - AndroidUtilities.dp(24.0f))))) / AndroidUtilities.dp(60.0f) > 0.0f) {
                        f6Var.g3 = true;
                    }
                } else {
                    f10 = 0.0f;
                    if (h5Var.getProgressToBlackout() == 0.0f) {
                        f6Var.g3 = r15;
                    }
                }
                float d = this.e.d(f6Var.g3 ? f7 : f10, r15);
                if (d > f10) {
                    this.r = true;
                    this.s = r15;
                    super.dispatchDraw(canvas);
                    this.r = r15;
                    b(canvas);
                    paint.setColor(i0.a.k(-16777216, (int) (153.0f * d * hideInterfaceAlpha)));
                    canvas2.drawPaint(paint);
                }
                if (d < f7 && !d6Var.f) {
                    canvas2.save();
                    float f21 = f7 - d;
                    paint.setColor(i0.a.k(-16777216, (int) (129.03f * f21 * hideInterfaceAlpha)));
                    drawable2.setAlpha((int) (f21 * 255.0f * hideInterfaceAlpha));
                    drawable2.setBounds(r15, top, getMeasuredWidth(), i11);
                    drawable2.draw(canvas2);
                    canvas2.drawRect(0.0f, i11, getMeasuredWidth(), getMeasuredHeight(), paint);
                    canvas.restore();
                }
                if (d <= f10 || h5Var.getAlpha() <= 0.0f) {
                    canvas2 = canvas;
                } else {
                    if (h5Var.t0) {
                        h5Var.t0 = r15;
                        h5Var.invalidate();
                    }
                    if (h5Var.getAlpha() != f7) {
                        canvas2 = canvas;
                        canvas2.saveLayerAlpha(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), (int) (h5Var.getAlpha() * 255.0f), 31);
                    } else {
                        canvas2 = canvas;
                        canvas2.save();
                    }
                    canvas2.translate(h5Var.getX(), h5Var.getY() - h5Var.getScrollY());
                    h5Var.draw(canvas2);
                    canvas2.restore();
                }
                boolean z16 = d > f10 ? true : r15;
                if (h5Var.t0 != z16) {
                    h5Var.t0 = z16;
                    h5Var.invalidate();
                }
                if (d > f10) {
                    this.r = true;
                    this.s = true;
                    super.dispatchDraw(canvas);
                    this.r = r15;
                }
                f11 = d;
                f12 = f6Var.m1;
                if (f12 != 0.0f || (m6Var = f6Var.l1) == null) {
                    f13 = f7;
                    z10 = true;
                } else {
                    float f22 = f6Var.A3;
                    int measuredWidth = getMeasuredWidth();
                    z10 = true;
                    int measuredHeight2 = getMeasuredHeight() + 1;
                    n6 n6Var = m6Var.f;
                    ImageReceiver imageReceiver = m6Var.a;
                    float f23 = (float) r15;
                    imageReceiver.setImageCoords(f23, f23, measuredWidth, measuredHeight2);
                    imageReceiver.setAlpha(f12);
                    imageReceiver.draw(canvas2);
                    f13 = f7;
                    imageReceiver.setAlpha(f13);
                    if (m6Var.c != null) {
                        int i12 = (int) (f12 * 255.0f);
                        m6Var.d.setAlpha(i12);
                        GradientDrawable gradientDrawable = n6Var.H;
                        gradientDrawable.setAlpha(i12);
                        gradientDrawable.setBounds((int) imageReceiver.getImageX(), (int) (imageReceiver.getImageY2() - (AndroidUtilities.dp(24.0f) * f22)), (int) imageReceiver.getImageX2(), ((int) imageReceiver.getImageY2()) + 2);
                        gradientDrawable.draw(canvas2);
                        canvas2.save();
                        canvas2.scale(f22, f22, imageReceiver.getCenterX(), imageReceiver.getImageY2() - (AndroidUtilities.dp(8.0f) * f22));
                        canvas2.translate(imageReceiver.getCenterX() - (n6Var.J / 2.0f), (imageReceiver.getImageY2() - (AndroidUtilities.dp(8.0f) * f22)) - m6Var.c.getHeight());
                        m6Var.c.draw(canvas2);
                        canvas2.restore();
                    }
                }
                if (!f6Var.G2) {
                    f13 = 0.0f;
                }
                this.d.d(f13, r15);
                if (f6Var.K1) {
                    boolean z17 = (h5Var.getVisibility() == 0 && (f6Var.g3 || h5Var.w0)) ? z10 : r15;
                    f6Var.j3 = (h5Var.getVisibility() != 0 || h5Var.getProgressToBlackout() <= 0.0f) ? r15 : z10;
                    kc kcVar2 = ((bc) f6Var.Q1).d;
                    kcVar2.L0 = z17;
                    kcVar2.P();
                    ((bc) f6Var.Q1).d.m1 = f6Var.j3;
                }
                if (f11 <= 0.0f) {
                    super.dispatchDraw(canvas);
                    b(canvas);
                }
                fzVar = f6Var.k1;
                if (fzVar == null) {
                    fzVar.e(canvas2);
                    return;
                }
                return;
            }
            if (!d6Var.f) {
                int dp2 = AndroidUtilities.dp(f6Var.x2 ? 56.0f : 110.0f);
                if ((f6Var.C1 || !f6Var.x2) && h5Var.getVisibility() == 0) {
                    dp2 = (int) (dp2 * 2.5f);
                }
                drawable2.setBounds(r15, b5Var.getMeasuredHeight() - dp2, getMeasuredWidth(), b5Var.getMeasuredHeight());
                drawable2.setAlpha((int) (hideInterfaceAlpha * 255.0f));
                drawable2.draw(canvas2);
            }
        }
        f11 = 0.0f;
        f12 = f6Var.m1;
        if (f12 != 0.0f) {
        }
        f13 = f7;
        z10 = true;
        if (!f6Var.G2) {
        }
        this.d.d(f13, r15);
        if (f6Var.K1) {
        }
        if (f11 <= 0.0f) {
        }
        fzVar = f6Var.k1;
        if (fzVar == null) {
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        d2 d2Var;
        f6 f6Var = this.x;
        e6 e6Var = f6Var.M2;
        if (!f6Var.K1 || f6Var.c3 || ((org.telegram.ui.l4) e6Var.e) == null || (d2Var = (d2) e6Var.b) == null || !d2Var.n() || !((org.telegram.ui.l4) e6Var.e).dispatchTouchEvent(motionEvent)) {
            return super.dispatchTouchEvent(motionEvent);
        }
        return true;
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        if (view == this.x.j1) {
            return true;
        }
        if (!this.r) {
            return super.drawChild(canvas, view, j3);
        }
        org.telegram.ui.Components.tc tcVar = org.telegram.ui.Components.tc.w;
        if (tcVar == null || view != tcVar.e) {
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
        this.x.k1.i();
        org.telegram.ui.Components.tc.a(this, new x4(this, 0));
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        f6 f6Var = this.x;
        f6Var.k1.j();
        org.telegram.ui.Components.tc.h(this);
        y5 y5Var = f6Var.Q1;
        if (y5Var != null) {
            kc kcVar = ((bc) y5Var).d;
            kcVar.Y0 = false;
            kcVar.P();
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
