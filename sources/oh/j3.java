package oh;

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
import org.telegram.ui.Components.ic;
import org.telegram.ui.Components.pr;
import org.telegram.ui.cv0;
import org.telegram.ui.cz;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes4.dex */
public final class j3 extends t {
    public final org.telegram.ui.Components.z5 d;
    public final org.telegram.ui.Components.z5 e;
    public final org.telegram.ui.Components.voip.h f;
    public final org.telegram.ui.Components.z5 h;
    public final org.telegram.ui.Components.z5 n;
    public boolean r;
    public boolean s;
    public final /* synthetic */ c4 v;
    public final /* synthetic */ i9 w;
    public final /* synthetic */ f4 x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j3(f4 f4Var, Context context, c4 c4Var, i9 i9Var) {
        super(context);
        this.x = f4Var;
        this.v = c4Var;
        this.w = i9Var;
        pr prVar = pr.f;
        this.d = new org.telegram.ui.Components.z5(this, 150L, prVar);
        this.e = new org.telegram.ui.Components.z5(this, 150L, prVar);
        this.f = new org.telegram.ui.Components.voip.h(32, 102, 240);
        org.telegram.ui.Components.z5 z5Var = new org.telegram.ui.Components.z5(this);
        this.h = z5Var;
        org.telegram.ui.Components.z5 z5Var2 = new org.telegram.ui.Components.z5(this);
        this.n = z5Var2;
        z5Var.g = 500L;
        z5Var2.g = 100L;
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0154, code lost:
    
        if (r4 >= 0.0f) goto L95;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b(Canvas canvas) {
        TL_stories.StoryItem storyItem;
        l6 l6Var;
        TL_stories.StoryItem storyItem2;
        int i10;
        TLRPC.UserFull userFull;
        float hideInterfaceAlpha;
        float f10;
        float clamp;
        float f11;
        float f12;
        float f13;
        float f14;
        float f15;
        boolean z4;
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
        f4 f4Var = this.x;
        float f20 = f4Var.F1;
        g3 g3Var = f4Var.g1;
        e4 e4Var = f4Var.J2;
        d4 d4Var = f4Var.L1;
        z2 z2Var = f4Var.b1;
        if (z2Var.hasNotThumb() || ((d4Var.e && e4Var.f) || (d4Var.f && e4Var.f))) {
            f4 f4Var2 = d4Var.k;
            TL_stories.PeerStories peerStories = f4Var2.r1;
            i9 i9Var = f4Var2.G0;
            if (peerStories == null && (peerStories = f4Var2.P1.y(f4Var2.y1)) == null && (userFull = MessagesController.getInstance(f4Var2.z2).getUserFull(f4Var2.y1)) != null) {
                peerStories = userFull.stories;
            }
            if (f4Var2.H1 && (storyItem2 = d4Var.a) != null && peerStories != null && ((!m7.v(storyItem2) && ((i10 = d4Var.a.id) > peerStories.max_read_id || i10 > f4Var2.P1.f.get(f4Var2.y1, 0))) || f4Var2.z1)) {
                TL_stories.PeerStories peerStories2 = i9Var.N0;
                if (peerStories2 == null) {
                    t6 t6Var = f4Var2.P1;
                    long j10 = f4Var2.y1;
                    TL_stories.StoryItem storyItem3 = d4Var.a;
                    TL_stories.PeerStories y10 = t6Var.y(j10);
                    if (y10 == null) {
                        y10 = t6Var.z(j10);
                    }
                    if (t6Var.V(y10, storyItem3, false)) {
                        i9Var.Z0 = true;
                    }
                } else if (f4Var2.P1.V(peerStories2, d4Var.a, true)) {
                    i9Var.Z0 = true;
                }
            } else if (f4Var2.H1 && (storyItem = d4Var.a) != null && (l6Var = i9Var.L0) != null && l6Var.r(storyItem.id)) {
                i9Var.Z0 = true;
            }
        }
        hideInterfaceAlpha = f4Var.getHideInterfaceAlpha();
        if (d4Var.e) {
            h9 h9Var3 = e4Var.b;
            if (h9Var3 != null) {
                clamp = Utilities.clamp(h9Var3.getPlaybackProgress(f4Var.O2), 1.0f, 0.0f);
                if (e4Var.f && g3Var != null) {
                    g3Var.e();
                }
            } else {
                clamp = 0.0f;
            }
            invalidate();
            f10 = hideInterfaceAlpha;
        } else if (f4Var.O1 || !f4Var.H1 || f4Var.Q1 || f4Var.R1 || f4Var.S1 || !z2Var.hasNotThumb()) {
            f10 = hideInterfaceAlpha;
            clamp = Utilities.clamp(f4Var.T0 / 10000.0f, 1.0f, 0.0f);
        } else {
            long currentTimeMillis = System.currentTimeMillis();
            long j11 = f4Var.U0;
            if (j11 == 0 || f4Var.g3) {
                f10 = hideInterfaceAlpha;
            } else {
                f10 = hideInterfaceAlpha;
                if (f4Var.T0 <= 0 && currentTimeMillis - j11 > 0 && g3Var != null) {
                    g3Var.e();
                }
                f4Var.T0 += currentTimeMillis - f4Var.U0;
            }
            f4Var.U0 = currentTimeMillis;
            clamp = Utilities.clamp(f4Var.T0 / 10000.0f, 1.0f, 0.0f);
            invalidate();
        }
        if (e4Var != null && (h9Var2 = e4Var.b) != null) {
            f11 = h9Var2.currentSeek;
        }
        f11 = clamp;
        if (!f4Var.V0 && clamp == 1.0f && ((!d4Var.e || !f4Var.g3) && !f4Var.I2)) {
            f4Var.V0 = true;
            post(new lh.c3(this, 29));
        }
        i9 i9Var2 = this.w;
        l6 l6Var2 = i9Var2.L0;
        if (l6Var2 == null || l6Var2.e == 3) {
            f12 = 4.0f;
            f13 = 1.0f;
            f14 = 2.0f;
            f15 = 8.0f;
        } else {
            if (f4Var.n1 == null) {
                f4Var.n1 = new h5.u(3);
            }
            h5.u uVar = f4Var.n1;
            f12 = 4.0f;
            float f21 = (1.0f - f4Var.a4) * f10 * f20;
            int i14 = f4Var.I1;
            f13 = 1.0f;
            int g10 = i9Var2.L0.g();
            f14 = 2.0f;
            b4 b4Var = f4Var.l1;
            f15 = 8.0f;
            org.telegram.ui.Components.j6 j6Var = (org.telegram.ui.Components.j6) uVar.d;
            int i15 = (g10 << 12) + i14;
            if (uVar.a != i15) {
                uVar.a = i15;
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                spannableStringBuilder.append((CharSequence) String.valueOf(i14 + 1)).append((CharSequence) uVar.b).append((CharSequence) "/").append((CharSequence) uVar.c).append((CharSequence) String.valueOf(g10));
                j6Var.q(spannableStringBuilder, false, true);
            }
            canvas.save();
            float y11 = b4Var.getY();
            jg.c cVar = b4Var.b;
            float top = ((j6Var.e / 2.0f) + (y11 + cVar.getTop())) - 1.0f;
            cVar.setRightPadding((int) j6Var.d());
            canvas.translate((cVar.getRightDrawableWidth() + (cVar.getTextWidth() + (cVar.getLeft() + (b4Var.getLeft() + AndroidUtilities.dp(4.0f))))) - Utilities.clamp(((cVar.getRightDrawableWidth() + cVar.getTextWidth()) + r0) - cVar.getWidth(), r0, 0), top);
            float dp = AndroidUtilities.dp(8.0f);
            float dp2 = AndroidUtilities.dp(2.0f);
            AndroidUtilities.rectTmp.set(-dp, -dp2, j6Var.d() + dp, j6Var.e + dp2);
            j6Var.w = (int) (f21 * 160.0f);
            j6Var.draw(canvas);
            canvas.restore();
        }
        canvas.save();
        canvas.translate(0.0f, AndroidUtilities.dp(f15) - (AndroidUtilities.dp(f15) * f4Var.a4));
        boolean z10 = d4Var.e && (h9Var = e4Var.b) != null && h9Var.isBuffering();
        boolean z11 = f4Var.I2;
        boolean z12 = z11 && d4Var != null && d4Var.e && i9Var2.h0;
        float e6 = f4Var.M2.e(!z11 || z12);
        h8 h8Var2 = f4Var.m1;
        int measuredWidth = getMeasuredWidth();
        int i16 = f4Var.J1;
        int i17 = f4Var.K1;
        float f22 = (f13 - f4Var.a4) * f20;
        TextPaint textPaint = h8Var2.c;
        if (i17 > 0) {
            boolean z13 = z10 && !z12;
            if (h8Var2.i != i16) {
                h8Var2.g = 0.0f;
                h8Var2.h = true;
            }
            h8Var2.i = i16;
            c4 c4Var = h8Var2.a;
            Paint paint2 = c4Var.a;
            Paint paint3 = c4Var.b;
            int dp3 = i17 > 100 ? 1 : i17 >= 50 ? AndroidUtilities.dp(f13) : AndroidUtilities.dp(f14);
            float dp4 = ((measuredWidth - AndroidUtilities.dp(10.0f)) - ((i17 - 1) * dp3)) / i17;
            AndroidUtilities.dp(5.0f);
            float min = Math.min(dp4 / f14, AndroidUtilities.dp(f13));
            float e10 = h8Var2.b.e(z12);
            if (e10 > 0.0f) {
                float lerp = AndroidUtilities.lerp(clamp, f11, e10);
                canvas.save();
                textPaint.setAlpha((int) (e10 * 255.0f));
                z4 = z13;
                textPaint.setShadowLayer(AndroidUtilities.dp(3.0f), 0.0f, AndroidUtilities.dp(f13), org.telegram.ui.ActionBar.k6.l1(e10, 805306368));
                canvas.translate(((measuredWidth - h8Var2.f) / f14) - h8Var2.e, AndroidUtilities.lerp(AndroidUtilities.dp(f12), AndroidUtilities.dp(16.0f), e10));
                h8Var2.d.draw(canvas);
                canvas.restore();
                clamp = lerp;
            } else {
                z4 = z13;
            }
            int i18 = 0;
            while (i18 < i17) {
                float dp5 = (i18 * dp4) + AndroidUtilities.dp(5.0f) + (-0.0f) + (dp3 * i18);
                if (dp5 <= measuredWidth) {
                    float f23 = dp5 + dp4;
                    if (f23 >= 0.0f && f22 > 0.0f) {
                        float lerp2 = AndroidUtilities.lerp(min, AndroidUtilities.dpf2(f14), e10);
                        if (i18 > i16 || i18 != i16) {
                            f16 = min;
                            h8Var = h8Var2;
                            f17 = clamp;
                            i11 = measuredWidth;
                            f18 = lerp2;
                            f19 = 1.0f;
                        } else {
                            f16 = min;
                            RectF rectF = AndroidUtilities.rectTmp;
                            f17 = clamp;
                            i11 = measuredWidth;
                            rectF.set(dp5, 0.0f, f23, AndroidUtilities.lerp(AndroidUtilities.dpf2(f14), AndroidUtilities.dpf2(5.0f), (i16 == i18 ? 1 : 0) * e10));
                            if (z4) {
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
                                f18 = lerp2;
                                i13 = (int) (h8Var2.g * 51.0f * f22 * e6);
                            } else {
                                f18 = lerp2;
                                i13 = 0;
                            }
                            paint2.setAlpha(((int) (85.0f * f22 * e6)) + i13);
                            if (e10 > 0.0f) {
                                int i19 = i18 - i16;
                                h8Var = h8Var2;
                                rectF.left = Utilities.clamp(AndroidUtilities.lerp(rectF.left, AndroidUtilities.dp(5.0f) + (i19 * i11), e10), i11 - AndroidUtilities.dp(5.0f), AndroidUtilities.dp(5.0f));
                                rectF.right = Utilities.clamp(AndroidUtilities.lerp(rectF.right, ((i19 + 1) * i11) - AndroidUtilities.dp(5.0f), e10), i11 - AndroidUtilities.dp(5.0f), AndroidUtilities.dp(5.0f));
                            } else {
                                h8Var = h8Var2;
                            }
                            canvas.drawRoundRect(rectF, f18, f18, paint2);
                            f19 = f17;
                        }
                        RectF rectF2 = AndroidUtilities.rectTmp;
                        i12 = i17;
                        rectF2.set(dp5, 0.0f, f23, AndroidUtilities.lerp(AndroidUtilities.dpf2(f14), AndroidUtilities.dpf2(5.0f), (i16 == i18 ? 1 : 0) * e10));
                        if (e10 > 0.0f) {
                            int i20 = i18 - i16;
                            rectF2.left = Utilities.clamp(AndroidUtilities.lerp(rectF2.left, AndroidUtilities.dp(5.0f) + (i20 * i11), e10), i11 - AndroidUtilities.dp(5.0f), AndroidUtilities.dp(5.0f));
                            rectF2.right = Utilities.clamp(AndroidUtilities.lerp(rectF2.right, ((i20 + 1) * i11) - AndroidUtilities.dp(5.0f), e10), i11 - AndroidUtilities.dp(5.0f), AndroidUtilities.dp(5.0f));
                        }
                        rectF2.right = AndroidUtilities.lerp(rectF2.left, rectF2.right, f19);
                        if (i18 <= i16) {
                            paint3.setAlpha((int) (f22 * 255.0f * e6));
                            paint = paint3;
                        } else {
                            paint2.setAlpha((int) (85 * f22 * e6));
                            paint = paint2;
                        }
                        canvas.drawRoundRect(rectF2, f18, f18, paint);
                        i18++;
                        min = f16;
                        i17 = i12;
                        clamp = f17;
                        measuredWidth = i11;
                        h8Var2 = h8Var;
                    }
                }
                f16 = min;
                h8Var = h8Var2;
                f17 = clamp;
                i11 = measuredWidth;
                i12 = i17;
                i18++;
                min = f16;
                i17 = i12;
                clamp = f17;
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
        float f10;
        c4 c4Var;
        ?? r15;
        float hideInterfaceAlpha;
        float f11;
        float f12;
        float f13;
        float f14;
        cz czVar;
        j4 j4Var;
        boolean z4;
        float f15;
        boolean z10;
        org.telegram.ui.Components.z5 z5Var;
        boolean hasNotThumb;
        tg.d dVar;
        h9 h9Var;
        k8 k8Var;
        Canvas canvas2 = canvas;
        f4 f4Var = this.x;
        j3 j3Var = f4Var.Z0;
        g3 g3Var = f4Var.g1;
        d4 d4Var = f4Var.L1;
        z2 z2Var = f4Var.b1;
        e4 e4Var = f4Var.J2;
        n3 n3Var = f4Var.H0;
        if (!f4Var.H1) {
            f4Var.l1.a.getImageReceiver().setVisible(true, true);
        }
        boolean z11 = f4Var.Z2;
        c4 c4Var2 = this.v;
        if (z11) {
            f10 = 1.0f;
            canvas2.drawColor(i0.a.d(0.2f, -16777216, -1));
        } else {
            f10 = 1.0f;
            if (e4Var.d != null || (g3Var != null && (((k8Var = g3Var.b) != null && (k8Var.w || k8Var.s)) || g3Var.y.i))) {
                invalidate();
            }
            canvas2.save();
            cv0 cv0Var = f4Var.U2;
            if (cv0Var.n) {
                canvas2.save();
                float f16 = cv0Var.O;
                float f17 = cv0Var.A;
                float f18 = ((f16 * f17) + 1.0f) - f17;
                canvas2.scale(f18, f18, cv0Var.o + cv0Var.s, cv0Var.p + cv0Var.t);
                float f19 = cv0Var.o;
                float f20 = cv0Var.J;
                float f21 = cv0Var.A;
                canvas2.translate((f20 * f21) + f19, (cv0Var.K * f21) + cv0Var.p);
            }
            org.telegram.ui.o4 o4Var = e4Var.d;
            if (o4Var == null || (!e4Var.f && e4Var.a == null)) {
                if (o4Var != null) {
                    invalidate();
                }
                if (d4Var.d) {
                    canvas2.drawColor(i0.a.d(0.2f, -16777216, -1));
                } else {
                    if (!z2Var.hasBitmapImage()) {
                        c4Var2.f.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight() + 1);
                        c4Var2.f.draw(canvas2);
                    }
                    f15 = 0.0f;
                    z2Var.setImageCoords(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight() + 1);
                    z2Var.draw(canvas2);
                    canvas2.restore();
                    z10 = f4Var.V2;
                    org.telegram.ui.Components.z5 z5Var2 = this.h;
                    z5Var = this.n;
                    if (z10) {
                        z5Var2.d(f15, true);
                        z5Var.d(f15, true);
                    }
                    if (!d4Var.f) {
                        e1 e1Var = e4Var.a;
                        if (e1Var != null) {
                            if (!e4Var.f) {
                            }
                            hasNotThumb = true;
                        }
                        hasNotThumb = false;
                    } else if (d4Var.e) {
                        if (e4Var.d != null) {
                            h9 h9Var2 = e4Var.b;
                            if (h9Var2 != null) {
                                if (e4Var.f) {
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
                        hasNotThumb = z2Var.hasNotThumb();
                    }
                    z5Var2.d((f4Var.H1 || hasNotThumb || d4Var.b != null) ? 0.0f : 1.0f, false);
                    z5Var.d(z5Var2.c != 1.0f ? 1.0f : 0.0f, false);
                    if (z5Var.c > 0.0f) {
                        RectF rectF = AndroidUtilities.rectTmp;
                        rectF.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                        int i10 = (int) (z5Var.c * 255.0f);
                        org.telegram.ui.Components.voip.h hVar = this.f;
                        hVar.a.setAlpha(i10);
                        hVar.c.setAlpha(i10);
                        hVar.f = getMeasuredWidth() * 2;
                        hVar.n = 1.3f;
                        hVar.a(AndroidUtilities.dp(10.0f), canvas2, rectF, this);
                    }
                    f4Var.V2 = false;
                }
            } else {
                if (!z2Var.hasBitmapImage()) {
                    c4Var2.f.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight() + 1);
                    c4Var2.f.draw(canvas2);
                }
                z2Var.setImageCoords(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight() + 1);
                z2Var.draw(canvas2);
                if (f4Var.H1) {
                    i9 i9Var = this.w;
                    boolean z12 = i9Var.a;
                    if (z12 && (h9Var = e4Var.b) != null && h9Var.paused && h9Var.playerStubBitmap != null && h9Var.stubAvailable) {
                        canvas2.save();
                        canvas2.scale(getMeasuredWidth() / e4Var.b.playerStubBitmap.getWidth(), getMeasuredHeight() / e4Var.b.playerStubBitmap.getHeight());
                        h9 h9Var3 = e4Var.b;
                        canvas2.drawBitmap(h9Var3.playerStubBitmap, 0.0f, 0.0f, h9Var3.playerStubPaint);
                        canvas2.restore();
                    } else {
                        boolean z13 = Build.VERSION.SDK_INT >= 29 && (dVar = f4Var.E3) != null && canvas2 == dVar.r;
                        if (!z12 || (f4Var.Y0 && !i9Var.E0 && !z13)) {
                            e4Var.d.draw(canvas2);
                        }
                    }
                }
            }
            f15 = 0.0f;
            canvas2.restore();
            z10 = f4Var.V2;
            org.telegram.ui.Components.z5 z5Var22 = this.h;
            z5Var = this.n;
            if (z10) {
            }
            if (!d4Var.f) {
            }
            z5Var22.d((f4Var.H1 || hasNotThumb || d4Var.b != null) ? 0.0f : 1.0f, false);
            z5Var.d(z5Var22.c != 1.0f ? 1.0f : 0.0f, false);
            if (z5Var.c > 0.0f) {
            }
            f4Var.V2 = false;
        }
        if (n3Var.getAlpha() > 0.0f) {
            if (n3Var.getAlpha() == f10) {
                canvas2.save();
                c4Var = c4Var2;
                z4 = false;
            } else {
                c4Var = c4Var2;
                z4 = false;
                canvas2.saveLayerAlpha(0.0f, 0.0f, n3Var.getMeasuredWidth(), n3Var.getMeasuredHeight(), (int) (n3Var.getAlpha() * 255.0f), 31);
            }
            g3Var.draw(canvas2);
            canvas2.restore();
            r15 = z4;
        } else {
            c4Var = c4Var2;
            r15 = 0;
        }
        if (!f4Var.W0 && z2Var.hasNotThumb()) {
            f4Var.W0 = true;
            f4Var.invalidate();
        }
        hideInterfaceAlpha = f4Var.getHideInterfaceAlpha();
        Drawable drawable = c4Var.d;
        Paint paint = c4Var.c;
        Drawable drawable2 = c4Var.e;
        drawable.setAlpha(255);
        c4Var.d.draw(canvas2);
        if (f4Var.z1 || !f4Var.u2 || n3Var.getVisibility() == 0) {
            if (n3Var.getVisibility() == 0) {
                int dp = AndroidUtilities.dp(72.0f);
                int top = n3Var.getTop() + ((int) (n3Var.getTextTop() - AndroidUtilities.dp(24.0f)));
                int i11 = dp + top;
                float measuredHeight = getMeasuredHeight() * 0.65f;
                if ((measuredHeight - top) / AndroidUtilities.dp(60.0f) > 0.0f && n3Var.t0 && n3Var.o0.getBottom() - n3Var.getMeasuredHeight() > 0) {
                    if ((measuredHeight - (n3Var.getTop() + ((int) (n3Var.getMaxTop() - AndroidUtilities.dp(24.0f))))) / AndroidUtilities.dp(60.0f) > 0.0f) {
                        f4Var.d3 = true;
                    }
                    f11 = 0.0f;
                } else if (f4Var.e3) {
                    f4Var.e3 = r15;
                    f11 = 0.0f;
                    if ((measuredHeight - (n3Var.getTop() + ((int) (n3Var.getMaxTop() - AndroidUtilities.dp(24.0f))))) / AndroidUtilities.dp(60.0f) > 0.0f) {
                        f4Var.d3 = true;
                    }
                } else {
                    f11 = 0.0f;
                    if (n3Var.getProgressToBlackout() == 0.0f) {
                        f4Var.d3 = r15;
                    }
                }
                float d = this.e.d(f4Var.d3 ? 1.0f : 0.0f, r15);
                if (d > f11) {
                    this.r = true;
                    this.s = r15;
                    super.dispatchDraw(canvas);
                    this.r = r15;
                    b(canvas);
                    paint.setColor(i0.a.k(-16777216, (int) (153.0f * d * hideInterfaceAlpha)));
                    canvas2.drawPaint(paint);
                }
                if (d < f10 && !d4Var.f) {
                    canvas2.save();
                    float f22 = f10 - d;
                    paint.setColor(i0.a.k(-16777216, (int) (129.03f * f22 * hideInterfaceAlpha)));
                    drawable2.setAlpha((int) (f22 * 255.0f * hideInterfaceAlpha));
                    drawable2.setBounds(r15, top, getMeasuredWidth(), i11);
                    drawable2.draw(canvas2);
                    canvas2.drawRect(0.0f, i11, getMeasuredWidth(), getMeasuredHeight(), paint);
                    canvas.restore();
                }
                if (d <= f11 || n3Var.getAlpha() <= 0.0f) {
                    canvas2 = canvas;
                } else {
                    if (n3Var.q0) {
                        n3Var.q0 = r15;
                        n3Var.invalidate();
                    }
                    if (n3Var.getAlpha() != f10) {
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
                boolean z14 = d > f11;
                if (n3Var.q0 != z14) {
                    n3Var.q0 = z14;
                    n3Var.invalidate();
                }
                if (d > f11) {
                    this.r = true;
                    this.s = true;
                    super.dispatchDraw(canvas);
                    this.r = r15;
                }
                f12 = d;
                f13 = f4Var.j1;
                if (f13 != 0.0f || (j4Var = f4Var.i1) == null) {
                    f14 = 1.0f;
                } else {
                    float f23 = f4Var.x3;
                    int measuredWidth = getMeasuredWidth();
                    int measuredHeight2 = getMeasuredHeight() + 1;
                    k4 k4Var = j4Var.f;
                    ImageReceiver imageReceiver = j4Var.a;
                    float f24 = (float) r15;
                    imageReceiver.setImageCoords(f24, f24, measuredWidth, measuredHeight2);
                    imageReceiver.setAlpha(f13);
                    imageReceiver.draw(canvas2);
                    f14 = 1.0f;
                    imageReceiver.setAlpha(1.0f);
                    if (j4Var.c != null) {
                        int i12 = (int) (f13 * 255.0f);
                        j4Var.d.setAlpha(i12);
                        GradientDrawable gradientDrawable = k4Var.E;
                        gradientDrawable.setAlpha(i12);
                        gradientDrawable.setBounds((int) imageReceiver.getImageX(), (int) (imageReceiver.getImageY2() - (AndroidUtilities.dp(24.0f) * f23)), (int) imageReceiver.getImageX2(), ((int) imageReceiver.getImageY2()) + 2);
                        gradientDrawable.draw(canvas2);
                        canvas2.save();
                        canvas2.scale(f23, f23, imageReceiver.getCenterX(), imageReceiver.getImageY2() - (AndroidUtilities.dp(8.0f) * f23));
                        canvas2.translate(imageReceiver.getCenterX() - (k4Var.G / 2.0f), (imageReceiver.getImageY2() - (AndroidUtilities.dp(8.0f) * f23)) - j4Var.c.getHeight());
                        j4Var.c.draw(canvas2);
                        canvas2.restore();
                    }
                }
                if (!f4Var.D2) {
                    f14 = 0.0f;
                }
                this.d.d(f14, r15);
                if (f4Var.H1) {
                    boolean z15 = n3Var.getVisibility() == 0 && (f4Var.d3 || n3Var.t0);
                    f4Var.g3 = n3Var.getVisibility() == 0 && n3Var.getProgressToBlackout() > 0.0f;
                    i9 i9Var2 = ((z8) f4Var.N1).d;
                    i9Var2.I0 = z15;
                    i9Var2.P();
                    ((z8) f4Var.N1).d.j1 = f4Var.g3;
                }
                if (f12 <= 0.0f) {
                    super.dispatchDraw(canvas);
                    b(canvas);
                }
                czVar = f4Var.h1;
                if (czVar == null) {
                    czVar.e(canvas2);
                    return;
                }
                return;
            }
            if (!d4Var.f) {
                int dp2 = AndroidUtilities.dp(f4Var.u2 ? 56.0f : 110.0f);
                if ((f4Var.z1 || !f4Var.u2) && n3Var.getVisibility() == 0) {
                    dp2 = (int) (dp2 * 2.5f);
                }
                drawable2.setBounds(r15, j3Var.getMeasuredHeight() - dp2, getMeasuredWidth(), j3Var.getMeasuredHeight());
                drawable2.setAlpha((int) (hideInterfaceAlpha * 255.0f));
                drawable2.draw(canvas2);
            }
        }
        f12 = 0.0f;
        f13 = f4Var.j1;
        if (f13 != 0.0f) {
        }
        f14 = 1.0f;
        if (!f4Var.D2) {
        }
        this.d.d(f14, r15);
        if (f4Var.H1) {
        }
        if (f12 <= 0.0f) {
        }
        czVar = f4Var.h1;
        if (czVar == null) {
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        e1 e1Var;
        f4 f4Var = this.x;
        e4 e4Var = f4Var.J2;
        if (!f4Var.H1 || f4Var.Z2 || e4Var.d == null || (e1Var = e4Var.a) == null || !e1Var.n() || !e4Var.d.dispatchTouchEvent(motionEvent)) {
            return super.dispatchTouchEvent(motionEvent);
        }
        return true;
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        if (view == this.x.g1) {
            return true;
        }
        if (!this.r) {
            return super.drawChild(canvas, view, j10);
        }
        ic icVar = ic.w;
        if (icVar == null || view != icVar.e) {
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
        this.x.h1.j();
        ic.a(this, new lh.t0(this, 2));
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        f4 f4Var = this.x;
        f4Var.h1.k();
        ic.h(this);
        z3 z3Var = f4Var.N1;
        if (z3Var != null) {
            i9 i9Var = ((z8) z3Var).d;
            i9Var.V0 = false;
            i9Var.P();
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.x.v0.getLayoutParams();
        layoutParams.rightMargin = AndroidUtilities.dp(42.0f);
        layoutParams.topMargin = AndroidUtilities.dp(15.0f);
        super.onMeasure(i10, i11);
    }
}
