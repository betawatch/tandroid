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
import org.telegram.ui.Components.qr;
import org.telegram.ui.gz;
import org.telegram.ui.pv0;

/* compiled from: r8-map-id-eaaffe05e5b4975c35db95ddc7f057e1a9a0a254a43fe066fa0ad675f8b3973e */
/* loaded from: classes4.dex */
public final class a5 extends i0 {
    public final org.telegram.ui.Components.d6 d;
    public final org.telegram.ui.Components.d6 e;
    public final org.telegram.ui.Components.voip.h f;
    public final org.telegram.ui.Components.d6 h;
    public final org.telegram.ui.Components.d6 n;
    public boolean r;
    public boolean s;
    public final /* synthetic */ c6 v;
    public final /* synthetic */ jc w;
    public final /* synthetic */ f6 x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a5(f6 f6Var, Context context, c6 c6Var, jc jcVar) {
        super(context);
        this.x = f6Var;
        this.v = c6Var;
        this.w = jcVar;
        qr qrVar = qr.f;
        this.d = new org.telegram.ui.Components.d6(this, 150L, qrVar);
        this.e = new org.telegram.ui.Components.d6(this, 150L, qrVar);
        this.f = new org.telegram.ui.Components.voip.h(32, 102, 240);
        org.telegram.ui.Components.d6 d6Var = new org.telegram.ui.Components.d6(this);
        this.h = d6Var;
        org.telegram.ui.Components.d6 d6Var2 = new org.telegram.ui.Components.d6(this);
        this.n = d6Var2;
        d6Var.g = 500L;
        d6Var2.g = 100L;
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0158, code lost:
    
        if (r4 >= 0.0f) goto L95;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b(Canvas canvas) {
        TL_stories.StoryItem storyItem;
        d9 d9Var;
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
        hb hbVar;
        float f16;
        int i11;
        int i12;
        float f17;
        float f18;
        Paint paint;
        int i13;
        ic icVar;
        ic icVar2;
        f6 f6Var = this.x;
        float f19 = f6Var.I1;
        v4 v4Var = f6Var.j1;
        e6 e6Var = f6Var.M2;
        d6 d6Var = f6Var.O1;
        l4 l4Var = f6Var.e1;
        if (l4Var.hasNotThumb() || ((d6Var.e && e6Var.a) || (d6Var.f && e6Var.a))) {
            f6 f6Var2 = d6Var.k;
            TL_stories.PeerStories peerStories = f6Var2.u1;
            jc jcVar = f6Var2.J0;
            if (peerStories == null && (peerStories = f6Var2.S1.y(f6Var2.B1)) == null && (userFull = MessagesController.getInstance(f6Var2.C2).getUserFull(f6Var2.B1)) != null) {
                peerStories = userFull.stories;
            }
            if (f6Var2.K1 && (storyItem2 = d6Var.a) != null && peerStories != null && ((!ia.v(storyItem2) && ((i10 = d6Var.a.id) > peerStories.max_read_id || i10 > f6Var2.S1.f.get(f6Var2.B1, 0))) || f6Var2.C1)) {
                TL_stories.PeerStories peerStories2 = jcVar.Q0;
                if (peerStories2 == null) {
                    l9 l9Var = f6Var2.S1;
                    long j3 = f6Var2.B1;
                    TL_stories.StoryItem storyItem3 = d6Var.a;
                    TL_stories.PeerStories y3 = l9Var.y(j3);
                    if (y3 == null) {
                        y3 = l9Var.z(j3);
                    }
                    if (l9Var.V(y3, storyItem3, false)) {
                        jcVar.c1 = true;
                    }
                } else if (f6Var2.S1.V(peerStories2, d6Var.a, true)) {
                    jcVar.c1 = true;
                }
            } else if (f6Var2.K1 && (storyItem = d6Var.a) != null && (d9Var = jcVar.O0) != null && d9Var.r(storyItem.id)) {
                jcVar.c1 = true;
            }
        }
        hideInterfaceAlpha = f6Var.getHideInterfaceAlpha();
        if (d6Var.e) {
            ic icVar3 = (ic) e6Var.c;
            if (icVar3 != null) {
                clamp = Utilities.clamp(icVar3.getPlaybackProgress(f6Var.R2), 1.0f, 0.0f);
                if (e6Var.a && v4Var != null) {
                    v4Var.e();
                }
            } else {
                clamp = 0.0f;
            }
            invalidate();
            f7 = hideInterfaceAlpha;
        } else if (f6Var.R1 || !f6Var.K1 || f6Var.T1 || f6Var.U1 || f6Var.V1 || !l4Var.hasNotThumb()) {
            f7 = hideInterfaceAlpha;
            clamp = Utilities.clamp(f6Var.W0 / 10000.0f, 1.0f, 0.0f);
        } else {
            long currentTimeMillis = System.currentTimeMillis();
            long j10 = f6Var.X0;
            if (j10 == 0 || f6Var.j3) {
                f7 = hideInterfaceAlpha;
            } else {
                f7 = hideInterfaceAlpha;
                if (f6Var.W0 <= 0 && currentTimeMillis - j10 > 0 && v4Var != null) {
                    v4Var.e();
                }
                f6Var.W0 += currentTimeMillis - f6Var.X0;
            }
            f6Var.X0 = currentTimeMillis;
            clamp = Utilities.clamp(f6Var.W0 / 10000.0f, 1.0f, 0.0f);
            invalidate();
        }
        if (e6Var != null && (icVar2 = (ic) e6Var.c) != null) {
            f10 = icVar2.currentSeek;
        }
        f10 = clamp;
        if (!f6Var.Y0 && clamp == 1.0f && ((!d6Var.e || !f6Var.j3) && !f6Var.L2)) {
            f6Var.Y0 = true;
            post(new a3.d(this, 7));
        }
        jc jcVar2 = this.w;
        d9 d9Var2 = jcVar2.O0;
        if (d9Var2 == null || d9Var2.e == 3) {
            f11 = 4.0f;
            f12 = 1.0f;
            f13 = 2.0f;
            f14 = 8.0f;
        } else {
            if (f6Var.q1 == null) {
                f6Var.q1 = new j6.l(1);
            }
            j6.l lVar = f6Var.q1;
            f11 = 4.0f;
            float f20 = (1.0f - f6Var.d4) * f7 * f19;
            int i14 = f6Var.L1;
            f12 = 1.0f;
            int g10 = jcVar2.O0.g();
            f13 = 2.0f;
            b6 b6Var = f6Var.o1;
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
            float y10 = b6Var.getY();
            a6 a6Var = b6Var.b;
            float top = ((n6Var.e / 2.0f) + (y10 + a6Var.getTop())) - 1.0f;
            a6Var.setRightPadding((int) n6Var.d());
            canvas.translate((a6Var.getRightDrawableWidth() + (a6Var.getTextWidth() + (a6Var.getLeft() + (b6Var.getLeft() + AndroidUtilities.dp(4.0f))))) - Utilities.clamp(((a6Var.getRightDrawableWidth() + a6Var.getTextWidth()) + r0) - a6Var.getWidth(), r0, 0), top);
            float dp = AndroidUtilities.dp(8.0f);
            float dp2 = AndroidUtilities.dp(2.0f);
            AndroidUtilities.rectTmp.set(-dp, -dp2, n6Var.d() + dp, n6Var.e + dp2);
            n6Var.w = (int) (f20 * 160.0f);
            n6Var.draw(canvas);
            canvas.restore();
        }
        canvas.save();
        canvas.translate(0.0f, AndroidUtilities.dp(f14) - (AndroidUtilities.dp(f14) * f6Var.d4));
        boolean z11 = d6Var.e && (icVar = (ic) e6Var.c) != null && icVar.isBuffering();
        boolean z12 = f6Var.L2;
        boolean z13 = z12 && d6Var != null && d6Var.e && jcVar2.k0;
        float e = f6Var.P2.e(!z12 || z13);
        hb hbVar2 = f6Var.p1;
        int measuredWidth = getMeasuredWidth();
        int i16 = f6Var.M1;
        int i17 = f6Var.N1;
        float f21 = (f12 - f6Var.d4) * f19;
        TextPaint textPaint = hbVar2.c;
        if (i17 > 0) {
            boolean z14 = z11 && !z13;
            if (hbVar2.i != i16) {
                hbVar2.g = 0.0f;
                hbVar2.h = true;
            }
            hbVar2.i = i16;
            c6 c6Var = hbVar2.a;
            Paint paint2 = c6Var.a;
            Paint paint3 = c6Var.b;
            int dp3 = i17 > 100 ? 1 : i17 >= 50 ? AndroidUtilities.dp(f12) : AndroidUtilities.dp(f13);
            float dp4 = ((measuredWidth - AndroidUtilities.dp(10.0f)) - ((i17 - 1) * dp3)) / i17;
            AndroidUtilities.dp(5.0f);
            float min = Math.min(dp4 / f13, AndroidUtilities.dp(f12));
            float e7 = hbVar2.b.e(z13);
            if (e7 > 0.0f) {
                float lerp = AndroidUtilities.lerp(clamp, f10, e7);
                canvas.save();
                textPaint.setAlpha((int) (e7 * 255.0f));
                z10 = z14;
                textPaint.setShadowLayer(AndroidUtilities.dp(3.0f), 0.0f, AndroidUtilities.dp(f12), org.telegram.ui.ActionBar.j6.l1(e7, 805306368));
                canvas.translate(((measuredWidth - hbVar2.f) / f13) - hbVar2.e, AndroidUtilities.lerp(AndroidUtilities.dp(f11), AndroidUtilities.dp(16.0f), e7));
                hbVar2.d.draw(canvas);
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
                        float lerp2 = AndroidUtilities.lerp(min, AndroidUtilities.dpf2(f13), e7);
                        if (i18 > i16 || i18 != i16) {
                            f15 = min;
                            hbVar = hbVar2;
                            f16 = clamp;
                            i11 = measuredWidth;
                            f17 = lerp2;
                            f18 = 1.0f;
                        } else {
                            f15 = min;
                            RectF rectF = AndroidUtilities.rectTmp;
                            f16 = clamp;
                            i11 = measuredWidth;
                            rectF.set(dp5, 0.0f, f22, AndroidUtilities.lerp(AndroidUtilities.dpf2(f13), AndroidUtilities.dpf2(5.0f), (i16 == i18 ? 1 : 0) * e7));
                            if (z10) {
                                if (hbVar2.h) {
                                    float f23 = hbVar2.g + 0.026666667f;
                                    hbVar2.g = f23;
                                    if (f23 > 0.5f) {
                                        hbVar2.h = false;
                                    }
                                } else {
                                    float f24 = hbVar2.g - 0.026666667f;
                                    hbVar2.g = f24;
                                    if (f24 < -0.5f) {
                                        hbVar2.h = true;
                                    }
                                }
                                f17 = lerp2;
                                i13 = (int) (hbVar2.g * 51.0f * f21 * e);
                            } else {
                                f17 = lerp2;
                                i13 = 0;
                            }
                            paint2.setAlpha(((int) (85.0f * f21 * e)) + i13);
                            if (e7 > 0.0f) {
                                int i19 = i18 - i16;
                                hbVar = hbVar2;
                                rectF.left = Utilities.clamp(AndroidUtilities.lerp(rectF.left, AndroidUtilities.dp(5.0f) + (i19 * i11), e7), i11 - AndroidUtilities.dp(5.0f), AndroidUtilities.dp(5.0f));
                                rectF.right = Utilities.clamp(AndroidUtilities.lerp(rectF.right, ((i19 + 1) * i11) - AndroidUtilities.dp(5.0f), e7), i11 - AndroidUtilities.dp(5.0f), AndroidUtilities.dp(5.0f));
                            } else {
                                hbVar = hbVar2;
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
                        hbVar2 = hbVar;
                    }
                }
                f15 = min;
                hbVar = hbVar2;
                f16 = clamp;
                i11 = measuredWidth;
                i12 = i17;
                i18++;
                min = f15;
                i17 = i12;
                clamp = f16;
                measuredWidth = i11;
                hbVar2 = hbVar;
            }
        }
        canvas.restore();
    }

    /* JADX WARN: Code restructure failed: missing block: B:225:0x01d3, code lost:
    
        if (((ai.ic) r2.c).paused != false) goto L81;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x01a3, code lost:
    
        if (r4.n() != false) goto L81;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:110:0x052f  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0539  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x057a  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0584  */
    /* JADX WARN: Removed duplicated region for block: B:136:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:208:0x01f4  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x01a9  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x018a  */
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
        c6 c6Var;
        ?? r15;
        float hideInterfaceAlpha;
        float f10;
        float f11;
        float f12;
        float f13;
        gz gzVar;
        m6 m6Var;
        boolean z10;
        float f14;
        boolean z11;
        org.telegram.ui.Components.d6 d6Var;
        boolean hasNotThumb;
        fh.d dVar;
        ic icVar;
        kb kbVar;
        Canvas canvas2 = canvas;
        f6 f6Var = this.x;
        a5 a5Var = f6Var.c1;
        v4 v4Var = f6Var.j1;
        d6 d6Var2 = f6Var.O1;
        l4 l4Var = f6Var.e1;
        e6 e6Var = f6Var.M2;
        h5 h5Var = f6Var.K0;
        if (!f6Var.K1) {
            f6Var.o1.a.getImageReceiver().setVisible(true, true);
        }
        boolean z12 = f6Var.c3;
        c6 c6Var2 = this.v;
        if (z12) {
            f7 = 1.0f;
            canvas2.drawColor(i0.a.d(0.2f, -16777216, -1));
        } else {
            f7 = 1.0f;
            if (((org.telegram.ui.k4) e6Var.e) != null || (v4Var != null && (((kbVar = v4Var.b) != null && (kbVar.w || kbVar.s)) || v4Var.y.i))) {
                invalidate();
            }
            canvas2.save();
            pv0 pv0Var = f6Var.X2;
            if (pv0Var.n) {
                canvas2.save();
                float f15 = pv0Var.O;
                float f16 = pv0Var.A;
                float f17 = ((f15 * f16) + 1.0f) - f16;
                canvas2.scale(f17, f17, pv0Var.o + pv0Var.s, pv0Var.p + pv0Var.t);
                float f18 = pv0Var.o;
                float f19 = pv0Var.J;
                float f20 = pv0Var.A;
                canvas2.translate((f19 * f20) + f18, (pv0Var.K * f20) + pv0Var.p);
            }
            org.telegram.ui.k4 k4Var = (org.telegram.ui.k4) e6Var.e;
            if (k4Var == null || (!e6Var.a && ((d2) e6Var.b) == null)) {
                if (k4Var != null) {
                    invalidate();
                }
                if (d6Var2.d) {
                    canvas2.drawColor(i0.a.d(0.2f, -16777216, -1));
                } else {
                    if (!l4Var.hasBitmapImage()) {
                        c6Var2.f.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight() + 1);
                        c6Var2.f.draw(canvas2);
                    }
                    f14 = 0.0f;
                    l4Var.setImageCoords(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight() + 1);
                    l4Var.draw(canvas2);
                    canvas2.restore();
                    z11 = f6Var.Y2;
                    org.telegram.ui.Components.d6 d6Var3 = this.h;
                    d6Var = this.n;
                    if (z11) {
                        d6Var3.d(f14, true);
                        d6Var.d(f14, true);
                    }
                    if (!d6Var2.f) {
                        d2 d2Var = (d2) e6Var.b;
                        if (d2Var != null) {
                            if (!e6Var.a) {
                            }
                            hasNotThumb = true;
                        }
                        hasNotThumb = false;
                    } else if (d6Var2.e) {
                        if (((org.telegram.ui.k4) e6Var.e) != null) {
                            ic icVar2 = (ic) e6Var.c;
                            if (icVar2 != null) {
                                if (e6Var.a) {
                                    if (icVar2.progress == 0.0f) {
                                        if (icVar2 != null) {
                                            if (icVar2.isBuffering()) {
                                            }
                                        }
                                    }
                                    hasNotThumb = true;
                                }
                            }
                        }
                        hasNotThumb = false;
                    } else {
                        hasNotThumb = l4Var.hasNotThumb();
                    }
                    d6Var3.d((f6Var.K1 || hasNotThumb || d6Var2.b != null) ? 0.0f : 1.0f, false);
                    d6Var.d(d6Var3.c != 1.0f ? 1.0f : 0.0f, false);
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
                    f6Var.Y2 = false;
                }
            } else {
                if (!l4Var.hasBitmapImage()) {
                    c6Var2.f.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight() + 1);
                    c6Var2.f.draw(canvas2);
                }
                l4Var.setImageCoords(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight() + 1);
                l4Var.draw(canvas2);
                if (f6Var.K1) {
                    jc jcVar = this.w;
                    boolean z13 = jcVar.a;
                    if (z13 && (icVar = (ic) e6Var.c) != null && icVar.paused && icVar.playerStubBitmap != null && icVar.stubAvailable) {
                        canvas2.save();
                        canvas2.scale(getMeasuredWidth() / ((ic) e6Var.c).playerStubBitmap.getWidth(), getMeasuredHeight() / ((ic) e6Var.c).playerStubBitmap.getHeight());
                        ic icVar3 = (ic) e6Var.c;
                        canvas2.drawBitmap(icVar3.playerStubBitmap, 0.0f, 0.0f, icVar3.playerStubPaint);
                        canvas2.restore();
                    } else {
                        boolean z14 = Build.VERSION.SDK_INT >= 29 && (dVar = f6Var.H3) != null && canvas2 == dVar.r;
                        if (!z13 || (f6Var.b1 && !jcVar.H0 && !z14)) {
                            ((org.telegram.ui.k4) e6Var.e).draw(canvas2);
                        }
                    }
                }
            }
            f14 = 0.0f;
            canvas2.restore();
            z11 = f6Var.Y2;
            org.telegram.ui.Components.d6 d6Var32 = this.h;
            d6Var = this.n;
            if (z11) {
            }
            if (!d6Var2.f) {
            }
            d6Var32.d((f6Var.K1 || hasNotThumb || d6Var2.b != null) ? 0.0f : 1.0f, false);
            d6Var.d(d6Var32.c != 1.0f ? 1.0f : 0.0f, false);
            if (d6Var.c > 0.0f) {
            }
            f6Var.Y2 = false;
        }
        if (h5Var.getAlpha() > 0.0f) {
            if (h5Var.getAlpha() == f7) {
                canvas2.save();
                c6Var = c6Var2;
                z10 = false;
            } else {
                c6Var = c6Var2;
                z10 = false;
                canvas2.saveLayerAlpha(0.0f, 0.0f, h5Var.getMeasuredWidth(), h5Var.getMeasuredHeight(), (int) (h5Var.getAlpha() * 255.0f), 31);
            }
            v4Var.draw(canvas2);
            canvas2.restore();
            r15 = z10;
        } else {
            c6Var = c6Var2;
            r15 = 0;
        }
        if (!f6Var.Z0 && l4Var.hasNotThumb()) {
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
                float d = this.e.d(f6Var.g3 ? 1.0f : 0.0f, r15);
                if (d > f10) {
                    this.r = true;
                    this.s = r15;
                    super.dispatchDraw(canvas);
                    this.r = r15;
                    b(canvas);
                    paint.setColor(i0.a.k(-16777216, (int) (153.0f * d * hideInterfaceAlpha)));
                    canvas2.drawPaint(paint);
                }
                if (d < f7 && !d6Var2.f) {
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
                boolean z15 = d > f10;
                if (h5Var.t0 != z15) {
                    h5Var.t0 = z15;
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
                    f13 = 1.0f;
                } else {
                    float f22 = f6Var.A3;
                    int measuredWidth = getMeasuredWidth();
                    int measuredHeight2 = getMeasuredHeight() + 1;
                    n6 n6Var = m6Var.f;
                    ImageReceiver imageReceiver = m6Var.a;
                    float f23 = (float) r15;
                    imageReceiver.setImageCoords(f23, f23, measuredWidth, measuredHeight2);
                    imageReceiver.setAlpha(f12);
                    imageReceiver.draw(canvas2);
                    f13 = 1.0f;
                    imageReceiver.setAlpha(1.0f);
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
                    boolean z16 = h5Var.getVisibility() == 0 && (f6Var.g3 || h5Var.w0);
                    f6Var.j3 = h5Var.getVisibility() == 0 && h5Var.getProgressToBlackout() > 0.0f;
                    jc jcVar2 = ((ac) f6Var.Q1).d;
                    jcVar2.L0 = z16;
                    jcVar2.P();
                    ((ac) f6Var.Q1).d.m1 = f6Var.j3;
                }
                if (f11 <= 0.0f) {
                    super.dispatchDraw(canvas);
                    b(canvas);
                }
                gzVar = f6Var.k1;
                if (gzVar == null) {
                    gzVar.e(canvas2);
                    return;
                }
                return;
            }
            if (!d6Var2.f) {
                int dp2 = AndroidUtilities.dp(f6Var.x2 ? 56.0f : 110.0f);
                if ((f6Var.C1 || !f6Var.x2) && h5Var.getVisibility() == 0) {
                    dp2 = (int) (dp2 * 2.5f);
                }
                drawable2.setBounds(r15, a5Var.getMeasuredHeight() - dp2, getMeasuredWidth(), a5Var.getMeasuredHeight());
                drawable2.setAlpha((int) (hideInterfaceAlpha * 255.0f));
                drawable2.draw(canvas2);
            }
        }
        f11 = 0.0f;
        f12 = f6Var.m1;
        if (f12 != 0.0f) {
        }
        f13 = 1.0f;
        if (!f6Var.G2) {
        }
        this.d.d(f13, r15);
        if (f6Var.K1) {
        }
        if (f11 <= 0.0f) {
        }
        gzVar = f6Var.k1;
        if (gzVar == null) {
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        d2 d2Var;
        f6 f6Var = this.x;
        e6 e6Var = f6Var.M2;
        if (!f6Var.K1 || f6Var.c3 || ((org.telegram.ui.k4) e6Var.e) == null || (d2Var = (d2) e6Var.b) == null || !d2Var.n() || !((org.telegram.ui.k4) e6Var.e).dispatchTouchEvent(motionEvent)) {
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
        org.telegram.ui.Components.pc pcVar = org.telegram.ui.Components.pc.w;
        if (pcVar == null || view != pcVar.e) {
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
        this.x.k1.j();
        org.telegram.ui.Components.pc.a(this, new w4(this, 0));
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        f6 f6Var = this.x;
        f6Var.k1.k();
        org.telegram.ui.Components.pc.h(this);
        y5 y5Var = f6Var.Q1;
        if (y5Var != null) {
            jc jcVar = ((ac) y5Var).d;
            jcVar.Y0 = false;
            jcVar.P();
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
