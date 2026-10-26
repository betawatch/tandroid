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
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.ds;
import org.telegram.ui.Components.qc;
import org.telegram.ui.cv0;
import org.telegram.ui.oy;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes4.dex */
public final class q3 extends w {
    public final org.telegram.ui.Components.h6 d;
    public final org.telegram.ui.Components.h6 e;
    public final org.telegram.ui.Components.voip.h f;
    public final org.telegram.ui.Components.h6 h;
    public final org.telegram.ui.Components.h6 n;
    public boolean r;
    public boolean s;
    public final /* synthetic */ n4 v;
    public final /* synthetic */ y9 w;
    public final /* synthetic */ q4 x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q3(q4 q4Var, Context context, n4 n4Var, y9 y9Var) {
        super(context);
        this.x = q4Var;
        this.v = n4Var;
        this.w = y9Var;
        ds dsVar = ds.f;
        this.d = new org.telegram.ui.Components.h6(this, 150L, dsVar);
        this.e = new org.telegram.ui.Components.h6(this, 150L, dsVar);
        this.f = new org.telegram.ui.Components.voip.h(32, 102, 240);
        org.telegram.ui.Components.h6 h6Var = new org.telegram.ui.Components.h6(this);
        this.h = h6Var;
        org.telegram.ui.Components.h6 h6Var2 = new org.telegram.ui.Components.h6(this);
        this.n = h6Var2;
        h6Var.g = 500L;
        h6Var2.g = 100L;
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
        x8 x8Var;
        float f16;
        int i11;
        int i12;
        float f17;
        float f18;
        Paint paint;
        int i13;
        x9 x9Var;
        x9 x9Var2;
        q4 q4Var = this.x;
        float f19 = q4Var.x1;
        m3 m3Var = q4Var.Y0;
        p4 p4Var = q4Var.B2;
        o4 o4Var = q4Var.D1;
        f3 f3Var = q4Var.T0;
        if (f3Var.hasNotThumb() || ((o4Var.e && p4Var.a) || (o4Var.f && p4Var.a))) {
            q4 q4Var2 = o4Var.k;
            TL_stories.PeerStories peerStories = q4Var2.j1;
            y9 y9Var = q4Var2.y0;
            if (peerStories == null && (peerStories = q4Var2.H1.y(q4Var2.q1)) == null && (userFull = MessagesController.getInstance(q4Var2.r2).getUserFull(q4Var2.q1)) != null) {
                peerStories = userFull.stories;
            }
            if (q4Var2.z1 && (storyItem2 = o4Var.a) != null && peerStories != null && ((!a8.v(storyItem2) && ((i10 = o4Var.a.id) > peerStories.max_read_id || i10 > q4Var2.H1.f.get(q4Var2.q1, 0))) || q4Var2.r1)) {
                TL_stories.PeerStories peerStories2 = y9Var.Q0;
                if (peerStories2 == null) {
                    h7 h7Var = q4Var2.H1;
                    long j10 = q4Var2.q1;
                    TL_stories.StoryItem storyItem3 = o4Var.a;
                    TL_stories.PeerStories y3 = h7Var.y(j10);
                    if (y3 == null) {
                        y3 = h7Var.z(j10);
                    }
                    if (h7Var.V(y3, storyItem3, false)) {
                        y9Var.c1 = true;
                    }
                } else if (q4Var2.H1.V(peerStories2, o4Var.a, true)) {
                    y9Var.c1 = true;
                }
            } else if (q4Var2.z1 && (storyItem = o4Var.a) != null && (z6Var = y9Var.O0) != null && z6Var.r(storyItem.id)) {
                y9Var.c1 = true;
            }
        }
        hideInterfaceAlpha = q4Var.getHideInterfaceAlpha();
        if (o4Var.e) {
            x9 x9Var3 = (x9) p4Var.c;
            if (x9Var3 != null) {
                clamp = Utilities.clamp(x9Var3.getPlaybackProgress(q4Var.G2), 1.0f, 0.0f);
                if (p4Var.a && m3Var != null) {
                    m3Var.e();
                }
            } else {
                clamp = 0.0f;
            }
            invalidate();
            f7 = hideInterfaceAlpha;
        } else if (q4Var.G1 || !q4Var.z1 || q4Var.I1 || q4Var.J1 || q4Var.K1 || !f3Var.hasNotThumb()) {
            f7 = hideInterfaceAlpha;
            clamp = Utilities.clamp(q4Var.L0 / 10000.0f, 1.0f, 0.0f);
        } else {
            long currentTimeMillis = System.currentTimeMillis();
            long j11 = q4Var.M0;
            if (j11 == 0 || q4Var.Y2) {
                f7 = hideInterfaceAlpha;
            } else {
                f7 = hideInterfaceAlpha;
                if (q4Var.L0 <= 0 && currentTimeMillis - j11 > 0 && m3Var != null) {
                    m3Var.e();
                }
                q4Var.L0 += currentTimeMillis - q4Var.M0;
            }
            q4Var.M0 = currentTimeMillis;
            clamp = Utilities.clamp(q4Var.L0 / 10000.0f, 1.0f, 0.0f);
            invalidate();
        }
        if (p4Var != null && (x9Var2 = (x9) p4Var.c) != null) {
            f10 = x9Var2.currentSeek;
        }
        f10 = clamp;
        if (!q4Var.N0 && clamp == 1.0f && ((!o4Var.e || !q4Var.Y2) && !q4Var.A2)) {
            q4Var.N0 = true;
            post(new bi.u6(this, 18));
        }
        y9 y9Var2 = this.w;
        z6 z6Var2 = y9Var2.O0;
        if (z6Var2 == null || z6Var2.e == 3) {
            f11 = 1.0f;
            f12 = 4.0f;
            f13 = 2.0f;
            f14 = 8.0f;
        } else {
            if (q4Var.f1 == null) {
                q4Var.f1 = new k6.m(6);
            }
            k6.m mVar = q4Var.f1;
            f12 = 4.0f;
            float f20 = (1.0f - q4Var.S3) * f7 * f19;
            int i14 = q4Var.A1;
            f11 = 1.0f;
            int g7 = y9Var2.O0.g();
            f13 = 2.0f;
            m4 m4Var = q4Var.d1;
            f14 = 8.0f;
            org.telegram.ui.Components.r6 r6Var = (org.telegram.ui.Components.r6) mVar.d;
            int i15 = (g7 << 12) + i14;
            if (mVar.a != i15) {
                mVar.a = i15;
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                spannableStringBuilder.append((CharSequence) String.valueOf(i14 + 1)).append((CharSequence) mVar.b).append((CharSequence) "/").append((CharSequence) mVar.c).append((CharSequence) String.valueOf(g7));
                r6Var.t(spannableStringBuilder, false, true);
            }
            canvas.save();
            float y10 = m4Var.getY();
            l4 l4Var = m4Var.b;
            float top = ((r6Var.e / 2.0f) + (y10 + l4Var.getTop())) - 1.0f;
            l4Var.setRightPadding((int) r6Var.c());
            canvas.translate((l4Var.getRightDrawableWidth() + (l4Var.getTextWidth() + (l4Var.getLeft() + (m4Var.getLeft() + AndroidUtilities.dp(4.0f))))) - Utilities.clamp(((l4Var.getRightDrawableWidth() + l4Var.getTextWidth()) + r0) - l4Var.getWidth(), r0, 0), top);
            float dp = AndroidUtilities.dp(8.0f);
            float dp2 = AndroidUtilities.dp(2.0f);
            AndroidUtilities.rectTmp.set(-dp, -dp2, r6Var.c() + dp, r6Var.e + dp2);
            r6Var.B = (int) (f20 * 160.0f);
            r6Var.draw(canvas);
            canvas.restore();
        }
        canvas.save();
        canvas.translate(0.0f, AndroidUtilities.dp(f14) - (AndroidUtilities.dp(f14) * q4Var.S3));
        boolean z11 = o4Var.e && (x9Var = (x9) p4Var.c) != null && x9Var.isBuffering();
        boolean z12 = q4Var.A2;
        boolean z13 = z12 && o4Var != null && o4Var.e && y9Var2.k0;
        float e = q4Var.E2.e(!z12 || z13);
        x8 x8Var2 = q4Var.e1;
        int measuredWidth = getMeasuredWidth();
        int i16 = q4Var.B1;
        int i17 = q4Var.C1;
        float f21 = (f11 - q4Var.S3) * f19;
        TextPaint textPaint = x8Var2.c;
        if (i17 > 0) {
            boolean z14 = z11 && !z13;
            if (x8Var2.i != i16) {
                x8Var2.g = 0.0f;
                x8Var2.h = true;
            }
            x8Var2.i = i16;
            n4 n4Var = x8Var2.a;
            Paint paint2 = n4Var.a;
            Paint paint3 = n4Var.b;
            int dp3 = i17 > 100 ? 1 : i17 >= 50 ? AndroidUtilities.dp(f11) : AndroidUtilities.dp(f13);
            float dp4 = ((measuredWidth - AndroidUtilities.dp(10.0f)) - ((i17 - 1) * dp3)) / i17;
            AndroidUtilities.dp(5.0f);
            float min = Math.min(dp4 / f13, AndroidUtilities.dp(f11));
            float e10 = x8Var2.b.e(z13);
            if (e10 > 0.0f) {
                float lerp = AndroidUtilities.lerp(clamp, f10, e10);
                canvas.save();
                textPaint.setAlpha((int) (e10 * 255.0f));
                z10 = z14;
                textPaint.setShadowLayer(AndroidUtilities.dp(3.0f), 0.0f, AndroidUtilities.dp(f11), org.telegram.ui.ActionBar.y6.o1(e10, 805306368));
                canvas.translate(((measuredWidth - x8Var2.f) / f13) - x8Var2.e, AndroidUtilities.lerp(AndroidUtilities.dp(f12), AndroidUtilities.dp(16.0f), e10));
                x8Var2.d.draw(canvas);
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
                        x8Var = x8Var2;
                        f16 = clamp;
                        i11 = measuredWidth;
                        i12 = i17;
                        i18++;
                        min = f15;
                        i17 = i12;
                        clamp = f16;
                        measuredWidth = i11;
                        x8Var2 = x8Var;
                    } else if (f21 > 0.0f) {
                        float lerp2 = AndroidUtilities.lerp(min, AndroidUtilities.dpf2(f13), e10);
                        if (i18 > i16 || i18 != i16) {
                            f15 = min;
                            x8Var = x8Var2;
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
                                if (x8Var2.h) {
                                    float f23 = x8Var2.g + 0.026666667f;
                                    x8Var2.g = f23;
                                    if (f23 > 0.5f) {
                                        x8Var2.h = false;
                                    }
                                } else {
                                    float f24 = x8Var2.g - 0.026666667f;
                                    x8Var2.g = f24;
                                    if (f24 < -0.5f) {
                                        x8Var2.h = true;
                                    }
                                }
                                f17 = lerp2;
                                i13 = (int) (x8Var2.g * 51.0f * f21 * e);
                            } else {
                                f17 = lerp2;
                                i13 = 0;
                            }
                            paint2.setAlpha(((int) (85.0f * f21 * e)) + i13);
                            if (e10 > 0.0f) {
                                int i19 = i18 - i16;
                                x8Var = x8Var2;
                                rectF.left = Utilities.clamp(AndroidUtilities.lerp(rectF.left, AndroidUtilities.dp(5.0f) + (i19 * i11), e10), i11 - AndroidUtilities.dp(5.0f), AndroidUtilities.dp(5.0f));
                                rectF.right = Utilities.clamp(AndroidUtilities.lerp(rectF.right, ((i19 + 1) * i11) - AndroidUtilities.dp(5.0f), e10), i11 - AndroidUtilities.dp(5.0f), AndroidUtilities.dp(5.0f));
                            } else {
                                x8Var = x8Var2;
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
                        x8Var2 = x8Var;
                    }
                }
                f15 = min;
                x8Var = x8Var2;
                f16 = clamp;
                i11 = measuredWidth;
                i12 = i17;
                i18++;
                min = f15;
                i17 = i12;
                clamp = f16;
                measuredWidth = i11;
                x8Var2 = x8Var;
            }
        }
        canvas.restore();
    }

    /* JADX WARN: Code restructure failed: missing block: B:225:0x01d3, code lost:
    
        if (((di.x9) r2.c).paused != false) goto L81;
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
        n4 n4Var;
        float hideInterfaceAlpha;
        float f10;
        float f11;
        float f12;
        float f13;
        boolean z10;
        oy oyVar;
        v4 v4Var;
        boolean z11;
        float f14;
        boolean z12;
        org.telegram.ui.Components.h6 h6Var;
        boolean hasNotThumb;
        hh.d dVar;
        x9 x9Var;
        a9 a9Var;
        Canvas canvas2 = canvas;
        q4 q4Var = this.x;
        q3 q3Var = q4Var.R0;
        m3 m3Var = q4Var.Y0;
        o4 o4Var = q4Var.D1;
        f3 f3Var = q4Var.T0;
        p4 p4Var = q4Var.B2;
        u3 u3Var = q4Var.z0;
        if (!q4Var.z1) {
            q4Var.d1.a.getImageReceiver().setVisible(true, true);
        }
        boolean z13 = q4Var.R2;
        n4 n4Var2 = this.v;
        if (z13) {
            f7 = 1.0f;
            canvas2.drawColor(i0.a.f(0.2f, -16777216, -1));
        } else {
            f7 = 1.0f;
            if (((org.telegram.ui.m4) p4Var.e) != null || (m3Var != null && (((a9Var = m3Var.b) != null && (a9Var.w || a9Var.s)) || m3Var.y.i))) {
                invalidate();
            }
            canvas2.save();
            cv0 cv0Var = q4Var.M2;
            if (cv0Var.n) {
                canvas2.save();
                float f15 = cv0Var.O;
                float f16 = cv0Var.A;
                float f17 = ((f15 * f16) + 1.0f) - f16;
                canvas2.scale(f17, f17, cv0Var.o + cv0Var.s, cv0Var.p + cv0Var.t);
                float f18 = cv0Var.o;
                float f19 = cv0Var.J;
                float f20 = cv0Var.A;
                canvas2.translate((f19 * f20) + f18, (cv0Var.K * f20) + cv0Var.p);
            }
            org.telegram.ui.m4 m4Var = (org.telegram.ui.m4) p4Var.e;
            if (m4Var == null || (!p4Var.a && ((h1) p4Var.b) == null)) {
                if (m4Var != null) {
                    invalidate();
                }
                if (o4Var.d) {
                    canvas2.drawColor(i0.a.f(0.2f, -16777216, -1));
                } else {
                    if (!f3Var.hasBitmapImage()) {
                        n4Var2.f.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight() + 1);
                        n4Var2.f.draw(canvas2);
                    }
                    f14 = 0.0f;
                    f3Var.setImageCoords(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight() + 1);
                    f3Var.draw(canvas2);
                    canvas2.restore();
                    z12 = q4Var.N2;
                    org.telegram.ui.Components.h6 h6Var2 = this.h;
                    h6Var = this.n;
                    if (z12) {
                        h6Var2.d(f14, true);
                        h6Var.d(f14, true);
                    }
                    if (!o4Var.f) {
                        h1 h1Var = (h1) p4Var.b;
                        if (h1Var != null) {
                            if (!p4Var.a) {
                            }
                            hasNotThumb = true;
                        }
                        hasNotThumb = false;
                    } else if (o4Var.e) {
                        if (((org.telegram.ui.m4) p4Var.e) != null) {
                            x9 x9Var2 = (x9) p4Var.c;
                            if (x9Var2 != null) {
                                if (p4Var.a) {
                                    if (x9Var2.progress == 0.0f) {
                                        if (x9Var2 != null) {
                                            if (x9Var2.isBuffering()) {
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
                    h6Var2.d((q4Var.z1 || hasNotThumb || o4Var.b != null) ? 0.0f : 1.0f, false);
                    h6Var.d(h6Var2.c != 1.0f ? 1.0f : 0.0f, false);
                    if (h6Var.c > 0.0f) {
                        RectF rectF = AndroidUtilities.rectTmp;
                        rectF.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                        int i10 = (int) (h6Var.c * 255.0f);
                        org.telegram.ui.Components.voip.h hVar = this.f;
                        hVar.a.setAlpha(i10);
                        hVar.c.setAlpha(i10);
                        hVar.f = getMeasuredWidth() * 2;
                        hVar.n = 1.3f;
                        hVar.a(AndroidUtilities.dp(10.0f), canvas2, rectF, this);
                    }
                    q4Var.N2 = false;
                }
            } else {
                if (!f3Var.hasBitmapImage()) {
                    n4Var2.f.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight() + 1);
                    n4Var2.f.draw(canvas2);
                }
                f3Var.setImageCoords(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight() + 1);
                f3Var.draw(canvas2);
                if (q4Var.z1) {
                    y9 y9Var = this.w;
                    boolean z14 = y9Var.a;
                    if (z14 && (x9Var = (x9) p4Var.c) != null && x9Var.paused && x9Var.playerStubBitmap != null && x9Var.stubAvailable) {
                        canvas2.save();
                        canvas2.scale(getMeasuredWidth() / ((x9) p4Var.c).playerStubBitmap.getWidth(), getMeasuredHeight() / ((x9) p4Var.c).playerStubBitmap.getHeight());
                        x9 x9Var3 = (x9) p4Var.c;
                        canvas2.drawBitmap(x9Var3.playerStubBitmap, 0.0f, 0.0f, x9Var3.playerStubPaint);
                        canvas2.restore();
                    } else {
                        boolean z15 = Build.VERSION.SDK_INT >= 29 && (dVar = q4Var.w3) != null && canvas2 == dVar.s;
                        if (!z14 || (q4Var.Q0 && !y9Var.H0 && !z15)) {
                            ((org.telegram.ui.m4) p4Var.e).draw(canvas2);
                        }
                    }
                }
            }
            f14 = 0.0f;
            canvas2.restore();
            z12 = q4Var.N2;
            org.telegram.ui.Components.h6 h6Var22 = this.h;
            h6Var = this.n;
            if (z12) {
            }
            if (!o4Var.f) {
            }
            h6Var22.d((q4Var.z1 || hasNotThumb || o4Var.b != null) ? 0.0f : 1.0f, false);
            h6Var.d(h6Var22.c != 1.0f ? 1.0f : 0.0f, false);
            if (h6Var.c > 0.0f) {
            }
            q4Var.N2 = false;
        }
        if (u3Var.getAlpha() > 0.0f) {
            if (u3Var.getAlpha() == f7) {
                canvas2.save();
                z11 = false;
                n4Var = n4Var2;
            } else {
                n4Var = n4Var2;
                z11 = false;
                canvas2.saveLayerAlpha(0.0f, 0.0f, u3Var.getMeasuredWidth(), u3Var.getMeasuredHeight(), (int) (u3Var.getAlpha() * 255.0f), 31);
            }
            m3Var.draw(canvas2);
            canvas2.restore();
            r15 = z11;
        } else {
            r15 = 0;
            n4Var = n4Var2;
        }
        if (!q4Var.O0 && f3Var.hasNotThumb()) {
            q4Var.O0 = true;
            q4Var.invalidate();
        }
        hideInterfaceAlpha = q4Var.getHideInterfaceAlpha();
        Drawable drawable = n4Var.d;
        Paint paint = n4Var.c;
        Drawable drawable2 = n4Var.e;
        drawable.setAlpha(255);
        n4Var.d.draw(canvas2);
        if (q4Var.r1 || !q4Var.m2 || u3Var.getVisibility() == 0) {
            if (u3Var.getVisibility() == 0) {
                int dp = AndroidUtilities.dp(72.0f);
                int top = u3Var.getTop() + ((int) (u3Var.getTextTop() - AndroidUtilities.dp(24.0f)));
                int i11 = dp + top;
                float measuredHeight = getMeasuredHeight() * 0.65f;
                if ((measuredHeight - top) / AndroidUtilities.dp(60.0f) > 0.0f && u3Var.w0 && u3Var.r0.getBottom() - u3Var.getMeasuredHeight() > 0) {
                    if ((measuredHeight - (u3Var.getTop() + ((int) (u3Var.getMaxTop() - AndroidUtilities.dp(24.0f))))) / AndroidUtilities.dp(60.0f) > 0.0f) {
                        q4Var.V2 = true;
                    }
                    f10 = 0.0f;
                } else if (q4Var.W2) {
                    q4Var.W2 = r15;
                    f10 = 0.0f;
                    if ((measuredHeight - (u3Var.getTop() + ((int) (u3Var.getMaxTop() - AndroidUtilities.dp(24.0f))))) / AndroidUtilities.dp(60.0f) > 0.0f) {
                        q4Var.V2 = true;
                    }
                } else {
                    f10 = 0.0f;
                    if (u3Var.getProgressToBlackout() == 0.0f) {
                        q4Var.V2 = r15;
                    }
                }
                float d = this.e.d(q4Var.V2 ? f7 : f10, r15);
                if (d > f10) {
                    this.r = true;
                    this.s = r15;
                    super.dispatchDraw(canvas);
                    this.r = r15;
                    b(canvas);
                    paint.setColor(i0.a.o(-16777216, (int) (153.0f * d * hideInterfaceAlpha)));
                    canvas2.drawPaint(paint);
                }
                if (d < f7 && !o4Var.f) {
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
                f12 = q4Var.b1;
                if (f12 != 0.0f || (v4Var = q4Var.a1) == null) {
                    f13 = f7;
                    z10 = true;
                } else {
                    float f22 = q4Var.p3;
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
                if (!q4Var.v2) {
                    f13 = 0.0f;
                }
                this.d.d(f13, r15);
                if (q4Var.z1) {
                    boolean z17 = (u3Var.getVisibility() == 0 && (q4Var.V2 || u3Var.w0)) ? z10 : r15;
                    q4Var.Y2 = (u3Var.getVisibility() != 0 || u3Var.getProgressToBlackout() <= 0.0f) ? r15 : z10;
                    y9 y9Var2 = ((p9) q4Var.F1).d;
                    y9Var2.L0 = z17;
                    y9Var2.P();
                    ((p9) q4Var.F1).d.m1 = q4Var.Y2;
                }
                if (f11 <= 0.0f) {
                    super.dispatchDraw(canvas);
                    b(canvas);
                }
                oyVar = q4Var.Z0;
                if (oyVar == null) {
                    oyVar.e(canvas2);
                    return;
                }
                return;
            }
            if (!o4Var.f) {
                int dp2 = AndroidUtilities.dp(q4Var.m2 ? 56.0f : 110.0f);
                if ((q4Var.r1 || !q4Var.m2) && u3Var.getVisibility() == 0) {
                    dp2 = (int) (dp2 * 2.5f);
                }
                drawable2.setBounds(r15, q3Var.getMeasuredHeight() - dp2, getMeasuredWidth(), q3Var.getMeasuredHeight());
                drawable2.setAlpha((int) (hideInterfaceAlpha * 255.0f));
                drawable2.draw(canvas2);
            }
        }
        f11 = 0.0f;
        f12 = q4Var.b1;
        if (f12 != 0.0f) {
        }
        f13 = f7;
        z10 = true;
        if (!q4Var.v2) {
        }
        this.d.d(f13, r15);
        if (q4Var.z1) {
        }
        if (f11 <= 0.0f) {
        }
        oyVar = q4Var.Z0;
        if (oyVar == null) {
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        h1 h1Var;
        q4 q4Var = this.x;
        p4 p4Var = q4Var.B2;
        if (!q4Var.z1 || q4Var.R2 || ((org.telegram.ui.m4) p4Var.e) == null || (h1Var = (h1) p4Var.b) == null || !h1Var.n() || !((org.telegram.ui.m4) p4Var.e).dispatchTouchEvent(motionEvent)) {
            return super.dispatchTouchEvent(motionEvent);
        }
        return true;
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        if (view == this.x.Y0) {
            return true;
        }
        if (!this.r) {
            return super.drawChild(canvas, view, j10);
        }
        qc qcVar = qc.x;
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
        this.x.Z0.i();
        qc.a(this, new bh.c0(this, 1));
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        q4 q4Var = this.x;
        q4Var.Z0.j();
        qc.h(this);
        j4 j4Var = q4Var.F1;
        if (j4Var != null) {
            y9 y9Var = ((p9) j4Var).d;
            y9Var.Y0 = false;
            y9Var.P();
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.x.n0.getLayoutParams();
        layoutParams.rightMargin = AndroidUtilities.dp(42.0f);
        layoutParams.topMargin = AndroidUtilities.dp(15.0f);
        super.onMeasure(i10, i11);
    }
}
