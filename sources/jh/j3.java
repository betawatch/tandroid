package jh;

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
import hh.y9;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.ec;
import org.telegram.ui.Components.er;
import org.telegram.ui.ou0;
import org.telegram.ui.sy;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes4.dex */
public final class j3 extends t {
    public final org.telegram.ui.Components.y5 d;
    public final org.telegram.ui.Components.y5 e;
    public final org.telegram.ui.Components.voip.h f;
    public final org.telegram.ui.Components.y5 h;
    public final org.telegram.ui.Components.y5 n;
    public boolean r;
    public boolean s;
    public final /* synthetic */ b4 v;
    public final /* synthetic */ i9 w;
    public final /* synthetic */ e4 x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j3(e4 e4Var, Context context, b4 b4Var, i9 i9Var) {
        super(context);
        this.x = e4Var;
        this.v = b4Var;
        this.w = i9Var;
        er erVar = er.f;
        this.d = new org.telegram.ui.Components.y5(this, 150L, erVar);
        this.e = new org.telegram.ui.Components.y5(this, 150L, erVar);
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
        j6 j6Var;
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
        e4 e4Var = this.x;
        float f20 = e4Var.E1;
        f3 f3Var = e4Var.f1;
        d4 d4Var = e4Var.I2;
        c4 c4Var = e4Var.K1;
        y2 y2Var = e4Var.a1;
        if (y2Var.hasNotThumb() || ((c4Var.e && d4Var.f) || (c4Var.f && d4Var.f))) {
            e4 e4Var2 = c4Var.k;
            TL_stories.PeerStories peerStories = e4Var2.q1;
            i9 i9Var = e4Var2.F0;
            if (peerStories == null && (peerStories = e4Var2.O1.y(e4Var2.x1)) == null && (userFull = MessagesController.getInstance(e4Var2.y2).getUserFull(e4Var2.x1)) != null) {
                peerStories = userFull.stories;
            }
            if (e4Var2.G1 && (storyItem2 = c4Var.a) != null && peerStories != null && ((!l7.v(storyItem2) && ((i10 = c4Var.a.id) > peerStories.max_read_id || i10 > e4Var2.O1.f.get(e4Var2.x1, 0))) || e4Var2.y1)) {
                TL_stories.PeerStories peerStories2 = i9Var.M0;
                if (peerStories2 == null) {
                    s6 s6Var = e4Var2.O1;
                    long j10 = e4Var2.x1;
                    TL_stories.StoryItem storyItem3 = c4Var.a;
                    TL_stories.PeerStories y10 = s6Var.y(j10);
                    if (y10 == null) {
                        y10 = s6Var.z(j10);
                    }
                    if (s6Var.V(y10, storyItem3, false)) {
                        i9Var.Y0 = true;
                    }
                } else if (e4Var2.O1.V(peerStories2, c4Var.a, true)) {
                    i9Var.Y0 = true;
                }
            } else if (e4Var2.G1 && (storyItem = c4Var.a) != null && (j6Var = i9Var.K0) != null && j6Var.r(storyItem.id)) {
                i9Var.Y0 = true;
            }
        }
        hideInterfaceAlpha = e4Var.getHideInterfaceAlpha();
        if (c4Var.e) {
            h9 h9Var3 = d4Var.b;
            if (h9Var3 != null) {
                clamp = Utilities.clamp(h9Var3.getPlaybackProgress(e4Var.N2), 1.0f, 0.0f);
                if (d4Var.f && f3Var != null) {
                    f3Var.e();
                }
            } else {
                clamp = 0.0f;
            }
            invalidate();
            f10 = hideInterfaceAlpha;
        } else if (e4Var.N1 || !e4Var.G1 || e4Var.P1 || e4Var.Q1 || e4Var.R1 || !y2Var.hasNotThumb()) {
            f10 = hideInterfaceAlpha;
            clamp = Utilities.clamp(e4Var.S0 / 10000.0f, 1.0f, 0.0f);
        } else {
            long currentTimeMillis = System.currentTimeMillis();
            long j11 = e4Var.T0;
            if (j11 == 0 || e4Var.f3) {
                f10 = hideInterfaceAlpha;
            } else {
                f10 = hideInterfaceAlpha;
                if (e4Var.S0 <= 0 && currentTimeMillis - j11 > 0 && f3Var != null) {
                    f3Var.e();
                }
                e4Var.S0 += currentTimeMillis - e4Var.T0;
            }
            e4Var.T0 = currentTimeMillis;
            clamp = Utilities.clamp(e4Var.S0 / 10000.0f, 1.0f, 0.0f);
            invalidate();
        }
        if (d4Var != null && (h9Var2 = d4Var.b) != null) {
            f11 = h9Var2.currentSeek;
        }
        f11 = clamp;
        if (!e4Var.U0 && clamp == 1.0f && ((!c4Var.e || !e4Var.f3) && !e4Var.H2)) {
            e4Var.U0 = true;
            post(new y9(this, 12));
        }
        i9 i9Var2 = this.w;
        j6 j6Var2 = i9Var2.K0;
        if (j6Var2 == null || j6Var2.e == 3) {
            f12 = 4.0f;
            f13 = 1.0f;
            f14 = 2.0f;
            f15 = 8.0f;
        } else {
            if (e4Var.m1 == null) {
                e4Var.m1 = new u5.k();
            }
            u5.k kVar = e4Var.m1;
            f12 = 4.0f;
            float f21 = (1.0f - e4Var.Z3) * f10 * f20;
            int i14 = e4Var.H1;
            f13 = 1.0f;
            int g10 = i9Var2.K0.g();
            f14 = 2.0f;
            a4 a4Var = e4Var.k1;
            f15 = 8.0f;
            org.telegram.ui.Components.i6 i6Var = (org.telegram.ui.Components.i6) kVar.d;
            int i15 = (g10 << 12) + i14;
            if (kVar.a != i15) {
                kVar.a = i15;
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                spannableStringBuilder.append((CharSequence) String.valueOf(i14 + 1)).append((CharSequence) kVar.b).append((CharSequence) "/").append((CharSequence) kVar.c).append((CharSequence) String.valueOf(g10));
                i6Var.q(spannableStringBuilder, false, true);
            }
            canvas.save();
            float y11 = a4Var.getY();
            eg.c cVar = a4Var.b;
            float top = ((i6Var.e / 2.0f) + (y11 + cVar.getTop())) - 1.0f;
            cVar.setRightPadding((int) i6Var.d());
            canvas.translate((cVar.getRightDrawableWidth() + (cVar.getTextWidth() + (cVar.getLeft() + (a4Var.getLeft() + AndroidUtilities.dp(4.0f))))) - Utilities.clamp(((cVar.getRightDrawableWidth() + cVar.getTextWidth()) + r0) - cVar.getWidth(), r0, 0), top);
            float dp = AndroidUtilities.dp(8.0f);
            float dp2 = AndroidUtilities.dp(2.0f);
            AndroidUtilities.rectTmp.set(-dp, -dp2, i6Var.d() + dp, i6Var.e + dp2);
            i6Var.w = (int) (f21 * 160.0f);
            i6Var.draw(canvas);
            canvas.restore();
        }
        canvas.save();
        canvas.translate(0.0f, AndroidUtilities.dp(f15) - (AndroidUtilities.dp(f15) * e4Var.Z3));
        boolean z11 = c4Var.e && (h9Var = d4Var.b) != null && h9Var.isBuffering();
        boolean z12 = e4Var.H2;
        boolean z13 = z12 && c4Var != null && c4Var.e && i9Var2.g0;
        float e9 = e4Var.L2.e(!z12 || z13);
        h8 h8Var2 = e4Var.l1;
        int measuredWidth = getMeasuredWidth();
        int i16 = e4Var.I1;
        int i17 = e4Var.J1;
        float f22 = (f13 - e4Var.Z3) * f20;
        TextPaint textPaint = h8Var2.c;
        if (i17 > 0) {
            boolean z14 = z11 && !z13;
            if (h8Var2.i != i16) {
                h8Var2.g = 0.0f;
                h8Var2.h = true;
            }
            h8Var2.i = i16;
            b4 b4Var = h8Var2.a;
            Paint paint2 = b4Var.a;
            Paint paint3 = b4Var.b;
            int dp3 = i17 > 100 ? 1 : i17 >= 50 ? AndroidUtilities.dp(f13) : AndroidUtilities.dp(f14);
            float dp4 = ((measuredWidth - AndroidUtilities.dp(10.0f)) - ((i17 - 1) * dp3)) / i17;
            AndroidUtilities.dp(5.0f);
            float min = Math.min(dp4 / f14, AndroidUtilities.dp(f13));
            float e10 = h8Var2.b.e(z13);
            if (e10 > 0.0f) {
                float lerp = AndroidUtilities.lerp(clamp, f11, e10);
                canvas.save();
                textPaint.setAlpha((int) (e10 * 255.0f));
                z10 = z14;
                textPaint.setShadowLayer(AndroidUtilities.dp(3.0f), 0.0f, AndroidUtilities.dp(f13), org.telegram.ui.ActionBar.g6.l1(e10, 805306368));
                canvas.translate(((measuredWidth - h8Var2.f) / f14) - h8Var2.e, AndroidUtilities.lerp(AndroidUtilities.dp(f12), AndroidUtilities.dp(16.0f), e10));
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
                                f18 = lerp2;
                                i13 = (int) (h8Var2.g * 51.0f * f22 * e9);
                            } else {
                                f18 = lerp2;
                                i13 = 0;
                            }
                            paint2.setAlpha(((int) (85.0f * f22 * e9)) + i13);
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
                            paint3.setAlpha((int) (f22 * 255.0f * e9));
                            paint = paint3;
                        } else {
                            paint2.setAlpha((int) (85 * f22 * e9));
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
        b4 b4Var;
        ?? r15;
        float hideInterfaceAlpha;
        float f11;
        float f12;
        float f13;
        float f14;
        sy syVar;
        h4 h4Var;
        boolean z10;
        float f15;
        boolean z11;
        org.telegram.ui.Components.y5 y5Var;
        boolean hasNotThumb;
        og.d dVar;
        h9 h9Var;
        k8 k8Var;
        Canvas canvas2 = canvas;
        e4 e4Var = this.x;
        j3 j3Var = e4Var.Y0;
        f3 f3Var = e4Var.f1;
        c4 c4Var = e4Var.K1;
        y2 y2Var = e4Var.a1;
        d4 d4Var = e4Var.I2;
        n3 n3Var = e4Var.G0;
        if (!e4Var.G1) {
            e4Var.k1.a.getImageReceiver().setVisible(true, true);
        }
        boolean z12 = e4Var.Y2;
        b4 b4Var2 = this.v;
        if (z12) {
            f10 = 1.0f;
            canvas2.drawColor(i0.b.d(0.2f, -16777216, -1));
        } else {
            f10 = 1.0f;
            if (d4Var.d != null || (f3Var != null && (((k8Var = f3Var.b) != null && (k8Var.w || k8Var.s)) || f3Var.y.i))) {
                invalidate();
            }
            canvas2.save();
            ou0 ou0Var = e4Var.T2;
            if (ou0Var.n) {
                canvas2.save();
                float f16 = ou0Var.O;
                float f17 = ou0Var.A;
                float f18 = ((f16 * f17) + 1.0f) - f17;
                canvas2.scale(f18, f18, ou0Var.o + ou0Var.s, ou0Var.p + ou0Var.t);
                float f19 = ou0Var.o;
                float f20 = ou0Var.J;
                float f21 = ou0Var.A;
                canvas2.translate((f20 * f21) + f19, (ou0Var.K * f21) + ou0Var.p);
            }
            c5.c cVar = d4Var.d;
            if (cVar == null || (!d4Var.f && d4Var.a == null)) {
                if (cVar != null) {
                    invalidate();
                }
                if (c4Var.d) {
                    canvas2.drawColor(i0.b.d(0.2f, -16777216, -1));
                } else {
                    if (!y2Var.hasBitmapImage()) {
                        b4Var2.f.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight() + 1);
                        b4Var2.f.draw(canvas2);
                    }
                    f15 = 0.0f;
                    y2Var.setImageCoords(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight() + 1);
                    y2Var.draw(canvas2);
                    canvas2.restore();
                    z11 = e4Var.U2;
                    org.telegram.ui.Components.y5 y5Var2 = this.h;
                    y5Var = this.n;
                    if (z11) {
                        y5Var2.d(f15, true);
                        y5Var.d(f15, true);
                    }
                    if (!c4Var.f) {
                        d1 d1Var = d4Var.a;
                        if (d1Var != null) {
                            if (!d4Var.f) {
                            }
                            hasNotThumb = true;
                        }
                        hasNotThumb = false;
                    } else if (c4Var.e) {
                        if (d4Var.d != null) {
                            h9 h9Var2 = d4Var.b;
                            if (h9Var2 != null) {
                                if (d4Var.f) {
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
                        hasNotThumb = y2Var.hasNotThumb();
                    }
                    y5Var2.d((e4Var.G1 || hasNotThumb || c4Var.b != null) ? 0.0f : 1.0f, false);
                    y5Var.d(y5Var2.c != 1.0f ? 1.0f : 0.0f, false);
                    if (y5Var.c > 0.0f) {
                        RectF rectF = AndroidUtilities.rectTmp;
                        rectF.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                        int i10 = (int) (y5Var.c * 255.0f);
                        org.telegram.ui.Components.voip.h hVar = this.f;
                        hVar.a.setAlpha(i10);
                        hVar.c.setAlpha(i10);
                        hVar.f = getMeasuredWidth() * 2;
                        hVar.n = 1.3f;
                        hVar.a(AndroidUtilities.dp(10.0f), canvas2, rectF, this);
                    }
                    e4Var.U2 = false;
                }
            } else {
                if (!y2Var.hasBitmapImage()) {
                    b4Var2.f.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight() + 1);
                    b4Var2.f.draw(canvas2);
                }
                y2Var.setImageCoords(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight() + 1);
                y2Var.draw(canvas2);
                if (e4Var.G1) {
                    i9 i9Var = this.w;
                    boolean z13 = i9Var.a;
                    if (z13 && (h9Var = d4Var.b) != null && h9Var.paused && h9Var.playerStubBitmap != null && h9Var.stubAvailable) {
                        canvas2.save();
                        canvas2.scale(getMeasuredWidth() / d4Var.b.playerStubBitmap.getWidth(), getMeasuredHeight() / d4Var.b.playerStubBitmap.getHeight());
                        h9 h9Var3 = d4Var.b;
                        canvas2.drawBitmap(h9Var3.playerStubBitmap, 0.0f, 0.0f, h9Var3.playerStubPaint);
                        canvas2.restore();
                    } else {
                        boolean z14 = Build.VERSION.SDK_INT >= 29 && (dVar = e4Var.D3) != null && canvas2 == dVar.r;
                        if (!z13 || (e4Var.X0 && !i9Var.D0 && !z14)) {
                            d4Var.d.draw(canvas2);
                        }
                    }
                }
            }
            f15 = 0.0f;
            canvas2.restore();
            z11 = e4Var.U2;
            org.telegram.ui.Components.y5 y5Var22 = this.h;
            y5Var = this.n;
            if (z11) {
            }
            if (!c4Var.f) {
            }
            y5Var22.d((e4Var.G1 || hasNotThumb || c4Var.b != null) ? 0.0f : 1.0f, false);
            y5Var.d(y5Var22.c != 1.0f ? 1.0f : 0.0f, false);
            if (y5Var.c > 0.0f) {
            }
            e4Var.U2 = false;
        }
        if (n3Var.getAlpha() > 0.0f) {
            if (n3Var.getAlpha() == f10) {
                canvas2.save();
                b4Var = b4Var2;
                z10 = false;
            } else {
                b4Var = b4Var2;
                z10 = false;
                canvas2.saveLayerAlpha(0.0f, 0.0f, n3Var.getMeasuredWidth(), n3Var.getMeasuredHeight(), (int) (n3Var.getAlpha() * 255.0f), 31);
            }
            f3Var.draw(canvas2);
            canvas2.restore();
            r15 = z10;
        } else {
            b4Var = b4Var2;
            r15 = 0;
        }
        if (!e4Var.V0 && y2Var.hasNotThumb()) {
            e4Var.V0 = true;
            e4Var.invalidate();
        }
        hideInterfaceAlpha = e4Var.getHideInterfaceAlpha();
        Drawable drawable = b4Var.d;
        Paint paint = b4Var.c;
        Drawable drawable2 = b4Var.e;
        drawable.setAlpha(255);
        b4Var.d.draw(canvas2);
        if (e4Var.y1 || !e4Var.t2 || n3Var.getVisibility() == 0) {
            if (n3Var.getVisibility() == 0) {
                int dp = AndroidUtilities.dp(72.0f);
                int top = n3Var.getTop() + ((int) (n3Var.getTextTop() - AndroidUtilities.dp(24.0f)));
                int i11 = dp + top;
                float measuredHeight = getMeasuredHeight() * 0.65f;
                if ((measuredHeight - top) / AndroidUtilities.dp(60.0f) > 0.0f && n3Var.s0 && n3Var.n0.getBottom() - n3Var.getMeasuredHeight() > 0) {
                    if ((measuredHeight - (n3Var.getTop() + ((int) (n3Var.getMaxTop() - AndroidUtilities.dp(24.0f))))) / AndroidUtilities.dp(60.0f) > 0.0f) {
                        e4Var.c3 = true;
                    }
                    f11 = 0.0f;
                } else if (e4Var.d3) {
                    e4Var.d3 = r15;
                    f11 = 0.0f;
                    if ((measuredHeight - (n3Var.getTop() + ((int) (n3Var.getMaxTop() - AndroidUtilities.dp(24.0f))))) / AndroidUtilities.dp(60.0f) > 0.0f) {
                        e4Var.c3 = true;
                    }
                } else {
                    f11 = 0.0f;
                    if (n3Var.getProgressToBlackout() == 0.0f) {
                        e4Var.c3 = r15;
                    }
                }
                float d = this.e.d(e4Var.c3 ? 1.0f : 0.0f, r15);
                if (d > f11) {
                    this.r = true;
                    this.s = r15;
                    super.dispatchDraw(canvas);
                    this.r = r15;
                    b(canvas);
                    paint.setColor(i0.b.k(-16777216, (int) (153.0f * d * hideInterfaceAlpha)));
                    canvas2.drawPaint(paint);
                }
                if (d < f10 && !c4Var.f) {
                    canvas2.save();
                    float f22 = f10 - d;
                    paint.setColor(i0.b.k(-16777216, (int) (129.03f * f22 * hideInterfaceAlpha)));
                    drawable2.setAlpha((int) (f22 * 255.0f * hideInterfaceAlpha));
                    drawable2.setBounds(r15, top, getMeasuredWidth(), i11);
                    drawable2.draw(canvas2);
                    canvas2.drawRect(0.0f, i11, getMeasuredWidth(), getMeasuredHeight(), paint);
                    canvas.restore();
                }
                if (d <= f11 || n3Var.getAlpha() <= 0.0f) {
                    canvas2 = canvas;
                } else {
                    if (n3Var.p0) {
                        n3Var.p0 = r15;
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
                boolean z15 = d > f11;
                if (n3Var.p0 != z15) {
                    n3Var.p0 = z15;
                    n3Var.invalidate();
                }
                if (d > f11) {
                    this.r = true;
                    this.s = true;
                    super.dispatchDraw(canvas);
                    this.r = r15;
                }
                f12 = d;
                f13 = e4Var.i1;
                if (f13 != 0.0f || (h4Var = e4Var.h1) == null) {
                    f14 = 1.0f;
                } else {
                    float f23 = e4Var.w3;
                    int measuredWidth = getMeasuredWidth();
                    int measuredHeight2 = getMeasuredHeight() + 1;
                    i4 i4Var = h4Var.f;
                    ImageReceiver imageReceiver = h4Var.a;
                    float f24 = (float) r15;
                    imageReceiver.setImageCoords(f24, f24, measuredWidth, measuredHeight2);
                    imageReceiver.setAlpha(f13);
                    imageReceiver.draw(canvas2);
                    f14 = 1.0f;
                    imageReceiver.setAlpha(1.0f);
                    if (h4Var.c != null) {
                        int i12 = (int) (f13 * 255.0f);
                        h4Var.d.setAlpha(i12);
                        GradientDrawable gradientDrawable = i4Var.D;
                        gradientDrawable.setAlpha(i12);
                        gradientDrawable.setBounds((int) imageReceiver.getImageX(), (int) (imageReceiver.getImageY2() - (AndroidUtilities.dp(24.0f) * f23)), (int) imageReceiver.getImageX2(), ((int) imageReceiver.getImageY2()) + 2);
                        gradientDrawable.draw(canvas2);
                        canvas2.save();
                        canvas2.scale(f23, f23, imageReceiver.getCenterX(), imageReceiver.getImageY2() - (AndroidUtilities.dp(8.0f) * f23));
                        canvas2.translate(imageReceiver.getCenterX() - (i4Var.F / 2.0f), (imageReceiver.getImageY2() - (AndroidUtilities.dp(8.0f) * f23)) - h4Var.c.getHeight());
                        h4Var.c.draw(canvas2);
                        canvas2.restore();
                    }
                }
                if (!e4Var.C2) {
                    f14 = 0.0f;
                }
                this.d.d(f14, r15);
                if (e4Var.G1) {
                    boolean z16 = n3Var.getVisibility() == 0 && (e4Var.c3 || n3Var.s0);
                    e4Var.f3 = n3Var.getVisibility() == 0 && n3Var.getProgressToBlackout() > 0.0f;
                    i9 i9Var2 = ((z8) e4Var.M1).d;
                    i9Var2.H0 = z16;
                    i9Var2.P();
                    ((z8) e4Var.M1).d.i1 = e4Var.f3;
                }
                if (f12 <= 0.0f) {
                    super.dispatchDraw(canvas);
                    b(canvas);
                }
                syVar = e4Var.g1;
                if (syVar == null) {
                    syVar.e(canvas2);
                    return;
                }
                return;
            }
            if (!c4Var.f) {
                int dp2 = AndroidUtilities.dp(e4Var.t2 ? 56.0f : 110.0f);
                if ((e4Var.y1 || !e4Var.t2) && n3Var.getVisibility() == 0) {
                    dp2 = (int) (dp2 * 2.5f);
                }
                drawable2.setBounds(r15, j3Var.getMeasuredHeight() - dp2, getMeasuredWidth(), j3Var.getMeasuredHeight());
                drawable2.setAlpha((int) (hideInterfaceAlpha * 255.0f));
                drawable2.draw(canvas2);
            }
        }
        f12 = 0.0f;
        f13 = e4Var.i1;
        if (f13 != 0.0f) {
        }
        f14 = 1.0f;
        if (!e4Var.C2) {
        }
        this.d.d(f14, r15);
        if (e4Var.G1) {
        }
        if (f12 <= 0.0f) {
        }
        syVar = e4Var.g1;
        if (syVar == null) {
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        d1 d1Var;
        e4 e4Var = this.x;
        d4 d4Var = e4Var.I2;
        if (!e4Var.G1 || e4Var.Y2 || d4Var.d == null || (d1Var = d4Var.a) == null || !d1Var.n() || !d4Var.d.dispatchTouchEvent(motionEvent)) {
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
        ec ecVar = ec.w;
        if (ecVar == null || view != ecVar.e) {
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
        ec.a(this, new gh.w0(this, 2));
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        e4 e4Var = this.x;
        e4Var.g1.k();
        ec.h(this);
        y3 y3Var = e4Var.M1;
        if (y3Var != null) {
            i9 i9Var = ((z8) y3Var).d;
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
