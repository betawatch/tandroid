package nh;

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
import org.telegram.ui.Components.mr;
import org.telegram.ui.cv0;
import org.telegram.ui.dz;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes4.dex */
public final class i3 extends u {
    public final org.telegram.ui.Components.z5 d;
    public final org.telegram.ui.Components.z5 e;
    public final org.telegram.ui.Components.voip.h f;
    public final org.telegram.ui.Components.z5 h;
    public final org.telegram.ui.Components.z5 n;
    public boolean r;
    public boolean s;
    public final /* synthetic */ a4 v;
    public final /* synthetic */ i9 w;
    public final /* synthetic */ d4 x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i3(d4 d4Var, Context context, a4 a4Var, i9 i9Var) {
        super(context);
        this.x = d4Var;
        this.v = a4Var;
        this.w = i9Var;
        mr mrVar = mr.f;
        this.d = new org.telegram.ui.Components.z5(this, 150L, mrVar);
        this.e = new org.telegram.ui.Components.z5(this, 150L, mrVar);
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
        d4 d4Var = this.x;
        float f20 = d4Var.F1;
        f3 f3Var = d4Var.g1;
        c4 c4Var = d4Var.J2;
        b4 b4Var = d4Var.L1;
        y2 y2Var = d4Var.b1;
        if (y2Var.hasNotThumb() || ((b4Var.e && c4Var.f) || (b4Var.f && c4Var.f))) {
            d4 d4Var2 = b4Var.k;
            TL_stories.PeerStories peerStories = d4Var2.r1;
            i9 i9Var = d4Var2.G0;
            if (peerStories == null && (peerStories = d4Var2.P1.y(d4Var2.y1)) == null && (userFull = MessagesController.getInstance(d4Var2.z2).getUserFull(d4Var2.y1)) != null) {
                peerStories = userFull.stories;
            }
            if (d4Var2.H1 && (storyItem2 = b4Var.a) != null && peerStories != null && ((!m7.v(storyItem2) && ((i10 = b4Var.a.id) > peerStories.max_read_id || i10 > d4Var2.P1.f.get(d4Var2.y1, 0))) || d4Var2.z1)) {
                TL_stories.PeerStories peerStories2 = i9Var.N0;
                if (peerStories2 == null) {
                    t6 t6Var = d4Var2.P1;
                    long j10 = d4Var2.y1;
                    TL_stories.StoryItem storyItem3 = b4Var.a;
                    TL_stories.PeerStories y10 = t6Var.y(j10);
                    if (y10 == null) {
                        y10 = t6Var.z(j10);
                    }
                    if (t6Var.V(y10, storyItem3, false)) {
                        i9Var.Z0 = true;
                    }
                } else if (d4Var2.P1.V(peerStories2, b4Var.a, true)) {
                    i9Var.Z0 = true;
                }
            } else if (d4Var2.H1 && (storyItem = b4Var.a) != null && (l6Var = i9Var.L0) != null && l6Var.r(storyItem.id)) {
                i9Var.Z0 = true;
            }
        }
        hideInterfaceAlpha = d4Var.getHideInterfaceAlpha();
        if (b4Var.e) {
            h9 h9Var3 = c4Var.b;
            if (h9Var3 != null) {
                clamp = Utilities.clamp(h9Var3.getPlaybackProgress(d4Var.O2), 1.0f, 0.0f);
                if (c4Var.f && f3Var != null) {
                    f3Var.e();
                }
            } else {
                clamp = 0.0f;
            }
            invalidate();
            f10 = hideInterfaceAlpha;
        } else if (d4Var.O1 || !d4Var.H1 || d4Var.Q1 || d4Var.R1 || d4Var.S1 || !y2Var.hasNotThumb()) {
            f10 = hideInterfaceAlpha;
            clamp = Utilities.clamp(d4Var.T0 / 10000.0f, 1.0f, 0.0f);
        } else {
            long currentTimeMillis = System.currentTimeMillis();
            long j11 = d4Var.U0;
            if (j11 == 0 || d4Var.g3) {
                f10 = hideInterfaceAlpha;
            } else {
                f10 = hideInterfaceAlpha;
                if (d4Var.T0 <= 0 && currentTimeMillis - j11 > 0 && f3Var != null) {
                    f3Var.e();
                }
                d4Var.T0 += currentTimeMillis - d4Var.U0;
            }
            d4Var.U0 = currentTimeMillis;
            clamp = Utilities.clamp(d4Var.T0 / 10000.0f, 1.0f, 0.0f);
            invalidate();
        }
        if (c4Var != null && (h9Var2 = c4Var.b) != null) {
            f11 = h9Var2.currentSeek;
        }
        f11 = clamp;
        if (!d4Var.V0 && clamp == 1.0f && ((!b4Var.e || !d4Var.g3) && !d4Var.I2)) {
            d4Var.V0 = true;
            post(new lh.b(this, 26));
        }
        i9 i9Var2 = this.w;
        l6 l6Var2 = i9Var2.L0;
        if (l6Var2 == null || l6Var2.e == 3) {
            f12 = 4.0f;
            f13 = 1.0f;
            f14 = 2.0f;
            f15 = 8.0f;
        } else {
            if (d4Var.n1 == null) {
                d4Var.n1 = new h5.u(3);
            }
            h5.u uVar = d4Var.n1;
            f12 = 4.0f;
            float f21 = (1.0f - d4Var.a4) * f10 * f20;
            int i14 = d4Var.I1;
            f13 = 1.0f;
            int g10 = i9Var2.L0.g();
            f14 = 2.0f;
            z3 z3Var = d4Var.l1;
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
            float y11 = z3Var.getY();
            ig.c cVar = z3Var.b;
            float top = ((j6Var.e / 2.0f) + (y11 + cVar.getTop())) - 1.0f;
            cVar.setRightPadding((int) j6Var.d());
            canvas.translate((cVar.getRightDrawableWidth() + (cVar.getTextWidth() + (cVar.getLeft() + (z3Var.getLeft() + AndroidUtilities.dp(4.0f))))) - Utilities.clamp(((cVar.getRightDrawableWidth() + cVar.getTextWidth()) + r0) - cVar.getWidth(), r0, 0), top);
            float dp = AndroidUtilities.dp(8.0f);
            float dp2 = AndroidUtilities.dp(2.0f);
            AndroidUtilities.rectTmp.set(-dp, -dp2, j6Var.d() + dp, j6Var.e + dp2);
            j6Var.w = (int) (f21 * 160.0f);
            j6Var.draw(canvas);
            canvas.restore();
        }
        canvas.save();
        canvas.translate(0.0f, AndroidUtilities.dp(f15) - (AndroidUtilities.dp(f15) * d4Var.a4));
        boolean z10 = b4Var.e && (h9Var = c4Var.b) != null && h9Var.isBuffering();
        boolean z11 = d4Var.I2;
        boolean z12 = z11 && b4Var != null && b4Var.e && i9Var2.h0;
        float e = d4Var.M2.e(!z11 || z12);
        h8 h8Var2 = d4Var.m1;
        int measuredWidth = getMeasuredWidth();
        int i16 = d4Var.J1;
        int i17 = d4Var.K1;
        float f22 = (f13 - d4Var.a4) * f20;
        TextPaint textPaint = h8Var2.c;
        if (i17 > 0) {
            boolean z13 = z10 && !z12;
            if (h8Var2.i != i16) {
                h8Var2.g = 0.0f;
                h8Var2.h = true;
            }
            h8Var2.i = i16;
            a4 a4Var = h8Var2.a;
            Paint paint2 = a4Var.a;
            Paint paint3 = a4Var.b;
            int dp3 = i17 > 100 ? 1 : i17 >= 50 ? AndroidUtilities.dp(f13) : AndroidUtilities.dp(f14);
            float dp4 = ((measuredWidth - AndroidUtilities.dp(10.0f)) - ((i17 - 1) * dp3)) / i17;
            AndroidUtilities.dp(5.0f);
            float min = Math.min(dp4 / f14, AndroidUtilities.dp(f13));
            float e6 = h8Var2.b.e(z12);
            if (e6 > 0.0f) {
                float lerp = AndroidUtilities.lerp(clamp, f11, e6);
                canvas.save();
                textPaint.setAlpha((int) (e6 * 255.0f));
                z4 = z13;
                textPaint.setShadowLayer(AndroidUtilities.dp(3.0f), 0.0f, AndroidUtilities.dp(f13), org.telegram.ui.ActionBar.j6.l1(e6, 805306368));
                canvas.translate(((measuredWidth - h8Var2.f) / f14) - h8Var2.e, AndroidUtilities.lerp(AndroidUtilities.dp(f12), AndroidUtilities.dp(16.0f), e6));
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
                        float lerp2 = AndroidUtilities.lerp(min, AndroidUtilities.dpf2(f14), e6);
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
                            rectF.set(dp5, 0.0f, f23, AndroidUtilities.lerp(AndroidUtilities.dpf2(f14), AndroidUtilities.dpf2(5.0f), (i16 == i18 ? 1 : 0) * e6));
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
                                i13 = (int) (h8Var2.g * 51.0f * f22 * e);
                            } else {
                                f18 = lerp2;
                                i13 = 0;
                            }
                            paint2.setAlpha(((int) (85.0f * f22 * e)) + i13);
                            if (e6 > 0.0f) {
                                int i19 = i18 - i16;
                                h8Var = h8Var2;
                                rectF.left = Utilities.clamp(AndroidUtilities.lerp(rectF.left, AndroidUtilities.dp(5.0f) + (i19 * i11), e6), i11 - AndroidUtilities.dp(5.0f), AndroidUtilities.dp(5.0f));
                                rectF.right = Utilities.clamp(AndroidUtilities.lerp(rectF.right, ((i19 + 1) * i11) - AndroidUtilities.dp(5.0f), e6), i11 - AndroidUtilities.dp(5.0f), AndroidUtilities.dp(5.0f));
                            } else {
                                h8Var = h8Var2;
                            }
                            canvas.drawRoundRect(rectF, f18, f18, paint2);
                            f19 = f17;
                        }
                        RectF rectF2 = AndroidUtilities.rectTmp;
                        i12 = i17;
                        rectF2.set(dp5, 0.0f, f23, AndroidUtilities.lerp(AndroidUtilities.dpf2(f14), AndroidUtilities.dpf2(5.0f), (i16 == i18 ? 1 : 0) * e6));
                        if (e6 > 0.0f) {
                            int i20 = i18 - i16;
                            rectF2.left = Utilities.clamp(AndroidUtilities.lerp(rectF2.left, AndroidUtilities.dp(5.0f) + (i20 * i11), e6), i11 - AndroidUtilities.dp(5.0f), AndroidUtilities.dp(5.0f));
                            rectF2.right = Utilities.clamp(AndroidUtilities.lerp(rectF2.right, ((i20 + 1) * i11) - AndroidUtilities.dp(5.0f), e6), i11 - AndroidUtilities.dp(5.0f), AndroidUtilities.dp(5.0f));
                        }
                        rectF2.right = AndroidUtilities.lerp(rectF2.left, rectF2.right, f19);
                        if (i18 <= i16) {
                            paint3.setAlpha((int) (f22 * 255.0f * e));
                            paint = paint3;
                        } else {
                            paint2.setAlpha((int) (85 * f22 * e));
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
        a4 a4Var;
        ?? r15;
        float hideInterfaceAlpha;
        float f11;
        float f12;
        float f13;
        float f14;
        dz dzVar;
        h4 h4Var;
        boolean z4;
        float f15;
        boolean z10;
        org.telegram.ui.Components.z5 z5Var;
        boolean hasNotThumb;
        sg.d dVar;
        h9 h9Var;
        k8 k8Var;
        Canvas canvas2 = canvas;
        d4 d4Var = this.x;
        i3 i3Var = d4Var.Z0;
        f3 f3Var = d4Var.g1;
        b4 b4Var = d4Var.L1;
        y2 y2Var = d4Var.b1;
        c4 c4Var = d4Var.J2;
        m3 m3Var = d4Var.H0;
        if (!d4Var.H1) {
            d4Var.l1.a.getImageReceiver().setVisible(true, true);
        }
        boolean z11 = d4Var.Z2;
        a4 a4Var2 = this.v;
        if (z11) {
            f10 = 1.0f;
            canvas2.drawColor(i0.a.d(0.2f, -16777216, -1));
        } else {
            f10 = 1.0f;
            if (c4Var.d != null || (f3Var != null && (((k8Var = f3Var.b) != null && (k8Var.w || k8Var.s)) || f3Var.y.i))) {
                invalidate();
            }
            canvas2.save();
            cv0 cv0Var = d4Var.U2;
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
            org.telegram.ui.q4 q4Var = c4Var.d;
            if (q4Var == null || (!c4Var.f && c4Var.a == null)) {
                if (q4Var != null) {
                    invalidate();
                }
                if (b4Var.d) {
                    canvas2.drawColor(i0.a.d(0.2f, -16777216, -1));
                } else {
                    if (!y2Var.hasBitmapImage()) {
                        a4Var2.f.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight() + 1);
                        a4Var2.f.draw(canvas2);
                    }
                    f15 = 0.0f;
                    y2Var.setImageCoords(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight() + 1);
                    y2Var.draw(canvas2);
                    canvas2.restore();
                    z10 = d4Var.V2;
                    org.telegram.ui.Components.z5 z5Var2 = this.h;
                    z5Var = this.n;
                    if (z10) {
                        z5Var2.d(f15, true);
                        z5Var.d(f15, true);
                    }
                    if (!b4Var.f) {
                        e1 e1Var = c4Var.a;
                        if (e1Var != null) {
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
                        hasNotThumb = y2Var.hasNotThumb();
                    }
                    z5Var2.d((d4Var.H1 || hasNotThumb || b4Var.b != null) ? 0.0f : 1.0f, false);
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
                    d4Var.V2 = false;
                }
            } else {
                if (!y2Var.hasBitmapImage()) {
                    a4Var2.f.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight() + 1);
                    a4Var2.f.draw(canvas2);
                }
                y2Var.setImageCoords(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight() + 1);
                y2Var.draw(canvas2);
                if (d4Var.H1) {
                    i9 i9Var = this.w;
                    boolean z12 = i9Var.a;
                    if (z12 && (h9Var = c4Var.b) != null && h9Var.paused && h9Var.playerStubBitmap != null && h9Var.stubAvailable) {
                        canvas2.save();
                        canvas2.scale(getMeasuredWidth() / c4Var.b.playerStubBitmap.getWidth(), getMeasuredHeight() / c4Var.b.playerStubBitmap.getHeight());
                        h9 h9Var3 = c4Var.b;
                        canvas2.drawBitmap(h9Var3.playerStubBitmap, 0.0f, 0.0f, h9Var3.playerStubPaint);
                        canvas2.restore();
                    } else {
                        boolean z13 = Build.VERSION.SDK_INT >= 29 && (dVar = d4Var.E3) != null && canvas2 == dVar.r;
                        if (!z12 || (d4Var.Y0 && !i9Var.E0 && !z13)) {
                            c4Var.d.draw(canvas2);
                        }
                    }
                }
            }
            f15 = 0.0f;
            canvas2.restore();
            z10 = d4Var.V2;
            org.telegram.ui.Components.z5 z5Var22 = this.h;
            z5Var = this.n;
            if (z10) {
            }
            if (!b4Var.f) {
            }
            z5Var22.d((d4Var.H1 || hasNotThumb || b4Var.b != null) ? 0.0f : 1.0f, false);
            z5Var.d(z5Var22.c != 1.0f ? 1.0f : 0.0f, false);
            if (z5Var.c > 0.0f) {
            }
            d4Var.V2 = false;
        }
        if (m3Var.getAlpha() > 0.0f) {
            if (m3Var.getAlpha() == f10) {
                canvas2.save();
                a4Var = a4Var2;
                z4 = false;
            } else {
                a4Var = a4Var2;
                z4 = false;
                canvas2.saveLayerAlpha(0.0f, 0.0f, m3Var.getMeasuredWidth(), m3Var.getMeasuredHeight(), (int) (m3Var.getAlpha() * 255.0f), 31);
            }
            f3Var.draw(canvas2);
            canvas2.restore();
            r15 = z4;
        } else {
            a4Var = a4Var2;
            r15 = 0;
        }
        if (!d4Var.W0 && y2Var.hasNotThumb()) {
            d4Var.W0 = true;
            d4Var.invalidate();
        }
        hideInterfaceAlpha = d4Var.getHideInterfaceAlpha();
        Drawable drawable = a4Var.d;
        Paint paint = a4Var.c;
        Drawable drawable2 = a4Var.e;
        drawable.setAlpha(255);
        a4Var.d.draw(canvas2);
        if (d4Var.z1 || !d4Var.u2 || m3Var.getVisibility() == 0) {
            if (m3Var.getVisibility() == 0) {
                int dp = AndroidUtilities.dp(72.0f);
                int top = m3Var.getTop() + ((int) (m3Var.getTextTop() - AndroidUtilities.dp(24.0f)));
                int i11 = dp + top;
                float measuredHeight = getMeasuredHeight() * 0.65f;
                if ((measuredHeight - top) / AndroidUtilities.dp(60.0f) > 0.0f && m3Var.t0 && m3Var.o0.getBottom() - m3Var.getMeasuredHeight() > 0) {
                    if ((measuredHeight - (m3Var.getTop() + ((int) (m3Var.getMaxTop() - AndroidUtilities.dp(24.0f))))) / AndroidUtilities.dp(60.0f) > 0.0f) {
                        d4Var.d3 = true;
                    }
                    f11 = 0.0f;
                } else if (d4Var.e3) {
                    d4Var.e3 = r15;
                    f11 = 0.0f;
                    if ((measuredHeight - (m3Var.getTop() + ((int) (m3Var.getMaxTop() - AndroidUtilities.dp(24.0f))))) / AndroidUtilities.dp(60.0f) > 0.0f) {
                        d4Var.d3 = true;
                    }
                } else {
                    f11 = 0.0f;
                    if (m3Var.getProgressToBlackout() == 0.0f) {
                        d4Var.d3 = r15;
                    }
                }
                float d = this.e.d(d4Var.d3 ? 1.0f : 0.0f, r15);
                if (d > f11) {
                    this.r = true;
                    this.s = r15;
                    super.dispatchDraw(canvas);
                    this.r = r15;
                    b(canvas);
                    paint.setColor(i0.a.k(-16777216, (int) (153.0f * d * hideInterfaceAlpha)));
                    canvas2.drawPaint(paint);
                }
                if (d < f10 && !b4Var.f) {
                    canvas2.save();
                    float f22 = f10 - d;
                    paint.setColor(i0.a.k(-16777216, (int) (129.03f * f22 * hideInterfaceAlpha)));
                    drawable2.setAlpha((int) (f22 * 255.0f * hideInterfaceAlpha));
                    drawable2.setBounds(r15, top, getMeasuredWidth(), i11);
                    drawable2.draw(canvas2);
                    canvas2.drawRect(0.0f, i11, getMeasuredWidth(), getMeasuredHeight(), paint);
                    canvas.restore();
                }
                if (d <= f11 || m3Var.getAlpha() <= 0.0f) {
                    canvas2 = canvas;
                } else {
                    if (m3Var.q0) {
                        m3Var.q0 = r15;
                        m3Var.invalidate();
                    }
                    if (m3Var.getAlpha() != f10) {
                        canvas2 = canvas;
                        canvas2.saveLayerAlpha(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), (int) (m3Var.getAlpha() * 255.0f), 31);
                    } else {
                        canvas2 = canvas;
                        canvas2.save();
                    }
                    canvas2.translate(m3Var.getX(), m3Var.getY() - m3Var.getScrollY());
                    m3Var.draw(canvas2);
                    canvas2.restore();
                }
                boolean z14 = d > f11;
                if (m3Var.q0 != z14) {
                    m3Var.q0 = z14;
                    m3Var.invalidate();
                }
                if (d > f11) {
                    this.r = true;
                    this.s = true;
                    super.dispatchDraw(canvas);
                    this.r = r15;
                }
                f12 = d;
                f13 = d4Var.j1;
                if (f13 != 0.0f || (h4Var = d4Var.i1) == null) {
                    f14 = 1.0f;
                } else {
                    float f23 = d4Var.x3;
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
                        GradientDrawable gradientDrawable = i4Var.E;
                        gradientDrawable.setAlpha(i12);
                        gradientDrawable.setBounds((int) imageReceiver.getImageX(), (int) (imageReceiver.getImageY2() - (AndroidUtilities.dp(24.0f) * f23)), (int) imageReceiver.getImageX2(), ((int) imageReceiver.getImageY2()) + 2);
                        gradientDrawable.draw(canvas2);
                        canvas2.save();
                        canvas2.scale(f23, f23, imageReceiver.getCenterX(), imageReceiver.getImageY2() - (AndroidUtilities.dp(8.0f) * f23));
                        canvas2.translate(imageReceiver.getCenterX() - (i4Var.G / 2.0f), (imageReceiver.getImageY2() - (AndroidUtilities.dp(8.0f) * f23)) - h4Var.c.getHeight());
                        h4Var.c.draw(canvas2);
                        canvas2.restore();
                    }
                }
                if (!d4Var.D2) {
                    f14 = 0.0f;
                }
                this.d.d(f14, r15);
                if (d4Var.H1) {
                    boolean z15 = m3Var.getVisibility() == 0 && (d4Var.d3 || m3Var.t0);
                    d4Var.g3 = m3Var.getVisibility() == 0 && m3Var.getProgressToBlackout() > 0.0f;
                    i9 i9Var2 = ((z8) d4Var.N1).d;
                    i9Var2.I0 = z15;
                    i9Var2.P();
                    ((z8) d4Var.N1).d.j1 = d4Var.g3;
                }
                if (f12 <= 0.0f) {
                    super.dispatchDraw(canvas);
                    b(canvas);
                }
                dzVar = d4Var.h1;
                if (dzVar == null) {
                    dzVar.e(canvas2);
                    return;
                }
                return;
            }
            if (!b4Var.f) {
                int dp2 = AndroidUtilities.dp(d4Var.u2 ? 56.0f : 110.0f);
                if ((d4Var.z1 || !d4Var.u2) && m3Var.getVisibility() == 0) {
                    dp2 = (int) (dp2 * 2.5f);
                }
                drawable2.setBounds(r15, i3Var.getMeasuredHeight() - dp2, getMeasuredWidth(), i3Var.getMeasuredHeight());
                drawable2.setAlpha((int) (hideInterfaceAlpha * 255.0f));
                drawable2.draw(canvas2);
            }
        }
        f12 = 0.0f;
        f13 = d4Var.j1;
        if (f13 != 0.0f) {
        }
        f14 = 1.0f;
        if (!d4Var.D2) {
        }
        this.d.d(f14, r15);
        if (d4Var.H1) {
        }
        if (f12 <= 0.0f) {
        }
        dzVar = d4Var.h1;
        if (dzVar == null) {
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        e1 e1Var;
        d4 d4Var = this.x;
        c4 c4Var = d4Var.J2;
        if (!d4Var.H1 || d4Var.Z2 || c4Var.d == null || (e1Var = c4Var.a) == null || !e1Var.n() || !c4Var.d.dispatchTouchEvent(motionEvent)) {
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
        ic.a(this, new kh.t0(this, 2));
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        d4 d4Var = this.x;
        d4Var.h1.k();
        ic.h(this);
        x3 x3Var = d4Var.N1;
        if (x3Var != null) {
            i9 i9Var = ((z8) x3Var).d;
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
