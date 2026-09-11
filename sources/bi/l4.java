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
import org.telegram.ui.Components.pr;
import org.telegram.ui.Components.qc;
import org.telegram.ui.gz;
import org.telegram.ui.ov0;

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
/* loaded from: classes4.dex */
public final class l4 extends b0 {
    public final org.telegram.ui.Components.e6 d;
    public final org.telegram.ui.Components.e6 e;
    public final org.telegram.ui.Components.voip.h f;
    public final org.telegram.ui.Components.e6 h;
    public final org.telegram.ui.Components.e6 n;
    public boolean r;
    public boolean s;
    public final /* synthetic */ l5 v;
    public final /* synthetic */ pb w;
    public final /* synthetic */ o5 x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l4(o5 o5Var, Context context, l5 l5Var, pb pbVar) {
        super(context);
        this.x = o5Var;
        this.v = l5Var;
        this.w = pbVar;
        pr prVar = pr.f;
        this.d = new org.telegram.ui.Components.e6(this, 150L, prVar);
        this.e = new org.telegram.ui.Components.e6(this, 150L, prVar);
        this.f = new org.telegram.ui.Components.voip.h(32, 102, 240);
        org.telegram.ui.Components.e6 e6Var = new org.telegram.ui.Components.e6(this);
        this.h = e6Var;
        org.telegram.ui.Components.e6 e6Var2 = new org.telegram.ui.Components.e6(this);
        this.n = e6Var2;
        e6Var.g = 500L;
        e6Var2.g = 100L;
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0158, code lost:
    
        if (r4 >= 0.0f) goto L95;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b(Canvas canvas) {
        TL_stories.StoryItem storyItem;
        l8 l8Var;
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
        na naVar;
        float f16;
        int i11;
        int i12;
        float f17;
        float f18;
        Paint paint;
        int i13;
        ob obVar;
        ob obVar2;
        o5 o5Var = this.x;
        float f19 = o5Var.I1;
        h4 h4Var = o5Var.j1;
        n5 n5Var = o5Var.M2;
        m5 m5Var = o5Var.O1;
        y3 y3Var = o5Var.e1;
        if (y3Var.hasNotThumb() || ((m5Var.e && n5Var.a) || (m5Var.f && n5Var.a))) {
            o5 o5Var2 = m5Var.k;
            TL_stories.PeerStories peerStories = o5Var2.u1;
            pb pbVar = o5Var2.J0;
            if (peerStories == null && (peerStories = o5Var2.S1.y(o5Var2.B1)) == null && (userFull = MessagesController.getInstance(o5Var2.C2).getUserFull(o5Var2.B1)) != null) {
                peerStories = userFull.stories;
            }
            if (o5Var2.K1 && (storyItem2 = m5Var.a) != null && peerStories != null && ((!p9.v(storyItem2) && ((i10 = m5Var.a.id) > peerStories.max_read_id || i10 > o5Var2.S1.f.get(o5Var2.B1, 0))) || o5Var2.C1)) {
                TL_stories.PeerStories peerStories2 = pbVar.Q0;
                if (peerStories2 == null) {
                    u8 u8Var = o5Var2.S1;
                    long j3 = o5Var2.B1;
                    TL_stories.StoryItem storyItem3 = m5Var.a;
                    TL_stories.PeerStories y3 = u8Var.y(j3);
                    if (y3 == null) {
                        y3 = u8Var.z(j3);
                    }
                    if (u8Var.V(y3, storyItem3, false)) {
                        pbVar.c1 = true;
                    }
                } else if (o5Var2.S1.V(peerStories2, m5Var.a, true)) {
                    pbVar.c1 = true;
                }
            } else if (o5Var2.K1 && (storyItem = m5Var.a) != null && (l8Var = pbVar.O0) != null && l8Var.r(storyItem.id)) {
                pbVar.c1 = true;
            }
        }
        hideInterfaceAlpha = o5Var.getHideInterfaceAlpha();
        if (m5Var.e) {
            ob obVar3 = (ob) n5Var.c;
            if (obVar3 != null) {
                clamp = Utilities.clamp(obVar3.getPlaybackProgress(o5Var.R2), 1.0f, 0.0f);
                if (n5Var.a && h4Var != null) {
                    h4Var.e();
                }
            } else {
                clamp = 0.0f;
            }
            invalidate();
            f7 = hideInterfaceAlpha;
        } else if (o5Var.R1 || !o5Var.K1 || o5Var.T1 || o5Var.U1 || o5Var.V1 || !y3Var.hasNotThumb()) {
            f7 = hideInterfaceAlpha;
            clamp = Utilities.clamp(o5Var.W0 / 10000.0f, 1.0f, 0.0f);
        } else {
            long currentTimeMillis = System.currentTimeMillis();
            long j10 = o5Var.X0;
            if (j10 == 0 || o5Var.j3) {
                f7 = hideInterfaceAlpha;
            } else {
                f7 = hideInterfaceAlpha;
                if (o5Var.W0 <= 0 && currentTimeMillis - j10 > 0 && h4Var != null) {
                    h4Var.e();
                }
                o5Var.W0 += currentTimeMillis - o5Var.X0;
            }
            o5Var.X0 = currentTimeMillis;
            clamp = Utilities.clamp(o5Var.W0 / 10000.0f, 1.0f, 0.0f);
            invalidate();
        }
        if (n5Var != null && (obVar2 = (ob) n5Var.c) != null) {
            f10 = obVar2.currentSeek;
        }
        f10 = clamp;
        if (!o5Var.Y0 && clamp == 1.0f && ((!m5Var.e || !o5Var.j3) && !o5Var.L2)) {
            o5Var.Y0 = true;
            post(new a3.c(this, 17));
        }
        pb pbVar2 = this.w;
        l8 l8Var2 = pbVar2.O0;
        if (l8Var2 == null || l8Var2.e == 3) {
            f11 = 4.0f;
            f12 = 1.0f;
            f13 = 2.0f;
            f14 = 8.0f;
        } else {
            if (o5Var.q1 == null) {
                o5Var.q1 = new j6.l(3);
            }
            j6.l lVar = o5Var.q1;
            f11 = 4.0f;
            float f20 = (1.0f - o5Var.d4) * f7 * f19;
            int i14 = o5Var.L1;
            f12 = 1.0f;
            int g10 = pbVar2.O0.g();
            f13 = 2.0f;
            k5 k5Var = o5Var.o1;
            f14 = 8.0f;
            org.telegram.ui.Components.p6 p6Var = (org.telegram.ui.Components.p6) lVar.d;
            int i15 = (g10 << 12) + i14;
            if (lVar.a != i15) {
                lVar.a = i15;
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                spannableStringBuilder.append((CharSequence) String.valueOf(i14 + 1)).append((CharSequence) lVar.b).append((CharSequence) "/").append((CharSequence) lVar.c).append((CharSequence) String.valueOf(g10));
                p6Var.q(spannableStringBuilder, false, true);
            }
            canvas.save();
            float y10 = k5Var.getY();
            j5 j5Var = k5Var.b;
            float top = ((p6Var.e / 2.0f) + (y10 + j5Var.getTop())) - 1.0f;
            j5Var.setRightPadding((int) p6Var.d());
            canvas.translate((j5Var.getRightDrawableWidth() + (j5Var.getTextWidth() + (j5Var.getLeft() + (k5Var.getLeft() + AndroidUtilities.dp(4.0f))))) - Utilities.clamp(((j5Var.getRightDrawableWidth() + j5Var.getTextWidth()) + r0) - j5Var.getWidth(), r0, 0), top);
            float dp = AndroidUtilities.dp(8.0f);
            float dp2 = AndroidUtilities.dp(2.0f);
            AndroidUtilities.rectTmp.set(-dp, -dp2, p6Var.d() + dp, p6Var.e + dp2);
            p6Var.w = (int) (f20 * 160.0f);
            p6Var.draw(canvas);
            canvas.restore();
        }
        canvas.save();
        canvas.translate(0.0f, AndroidUtilities.dp(f14) - (AndroidUtilities.dp(f14) * o5Var.d4));
        boolean z11 = m5Var.e && (obVar = (ob) n5Var.c) != null && obVar.isBuffering();
        boolean z12 = o5Var.L2;
        boolean z13 = z12 && m5Var != null && m5Var.e && pbVar2.k0;
        float e7 = o5Var.P2.e(!z12 || z13);
        na naVar2 = o5Var.p1;
        int measuredWidth = getMeasuredWidth();
        int i16 = o5Var.M1;
        int i17 = o5Var.N1;
        float f21 = (f12 - o5Var.d4) * f19;
        TextPaint textPaint = naVar2.c;
        if (i17 > 0) {
            boolean z14 = z11 && !z13;
            if (naVar2.i != i16) {
                naVar2.g = 0.0f;
                naVar2.h = true;
            }
            naVar2.i = i16;
            l5 l5Var = naVar2.a;
            Paint paint2 = l5Var.a;
            Paint paint3 = l5Var.b;
            int dp3 = i17 > 100 ? 1 : i17 >= 50 ? AndroidUtilities.dp(f12) : AndroidUtilities.dp(f13);
            float dp4 = ((measuredWidth - AndroidUtilities.dp(10.0f)) - ((i17 - 1) * dp3)) / i17;
            AndroidUtilities.dp(5.0f);
            float min = Math.min(dp4 / f13, AndroidUtilities.dp(f12));
            float e10 = naVar2.b.e(z13);
            if (e10 > 0.0f) {
                float lerp = AndroidUtilities.lerp(clamp, f10, e10);
                canvas.save();
                textPaint.setAlpha((int) (e10 * 255.0f));
                z10 = z14;
                textPaint.setShadowLayer(AndroidUtilities.dp(3.0f), 0.0f, AndroidUtilities.dp(f12), org.telegram.ui.ActionBar.j6.l1(e10, 805306368));
                canvas.translate(((measuredWidth - naVar2.f) / f13) - naVar2.e, AndroidUtilities.lerp(AndroidUtilities.dp(f11), AndroidUtilities.dp(16.0f), e10));
                naVar2.d.draw(canvas);
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
                        float lerp2 = AndroidUtilities.lerp(min, AndroidUtilities.dpf2(f13), e10);
                        if (i18 > i16 || i18 != i16) {
                            f15 = min;
                            naVar = naVar2;
                            f16 = clamp;
                            i11 = measuredWidth;
                            f17 = lerp2;
                            f18 = 1.0f;
                        } else {
                            f15 = min;
                            RectF rectF = AndroidUtilities.rectTmp;
                            f16 = clamp;
                            i11 = measuredWidth;
                            rectF.set(dp5, 0.0f, f22, AndroidUtilities.lerp(AndroidUtilities.dpf2(f13), AndroidUtilities.dpf2(5.0f), (i16 == i18 ? 1 : 0) * e10));
                            if (z10) {
                                if (naVar2.h) {
                                    float f23 = naVar2.g + 0.026666667f;
                                    naVar2.g = f23;
                                    if (f23 > 0.5f) {
                                        naVar2.h = false;
                                    }
                                } else {
                                    float f24 = naVar2.g - 0.026666667f;
                                    naVar2.g = f24;
                                    if (f24 < -0.5f) {
                                        naVar2.h = true;
                                    }
                                }
                                f17 = lerp2;
                                i13 = (int) (naVar2.g * 51.0f * f21 * e7);
                            } else {
                                f17 = lerp2;
                                i13 = 0;
                            }
                            paint2.setAlpha(((int) (85.0f * f21 * e7)) + i13);
                            if (e10 > 0.0f) {
                                int i19 = i18 - i16;
                                naVar = naVar2;
                                rectF.left = Utilities.clamp(AndroidUtilities.lerp(rectF.left, AndroidUtilities.dp(5.0f) + (i19 * i11), e10), i11 - AndroidUtilities.dp(5.0f), AndroidUtilities.dp(5.0f));
                                rectF.right = Utilities.clamp(AndroidUtilities.lerp(rectF.right, ((i19 + 1) * i11) - AndroidUtilities.dp(5.0f), e10), i11 - AndroidUtilities.dp(5.0f), AndroidUtilities.dp(5.0f));
                            } else {
                                naVar = naVar2;
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
                        naVar2 = naVar;
                    }
                }
                f15 = min;
                naVar = naVar2;
                f16 = clamp;
                i11 = measuredWidth;
                i12 = i17;
                i18++;
                min = f15;
                i17 = i12;
                clamp = f16;
                measuredWidth = i11;
                naVar2 = naVar;
            }
        }
        canvas.restore();
    }

    /* JADX WARN: Code restructure failed: missing block: B:225:0x01d3, code lost:
    
        if (((bi.ob) r2.c).paused != false) goto L81;
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
        l5 l5Var;
        ?? r15;
        float hideInterfaceAlpha;
        float f10;
        float f11;
        float f12;
        float f13;
        gz gzVar;
        v5 v5Var;
        boolean z10;
        float f14;
        boolean z11;
        org.telegram.ui.Components.e6 e6Var;
        boolean hasNotThumb;
        gh.d dVar;
        ob obVar;
        ra raVar;
        Canvas canvas2 = canvas;
        o5 o5Var = this.x;
        l4 l4Var = o5Var.c1;
        h4 h4Var = o5Var.j1;
        m5 m5Var = o5Var.O1;
        y3 y3Var = o5Var.e1;
        n5 n5Var = o5Var.M2;
        s4 s4Var = o5Var.K0;
        if (!o5Var.K1) {
            o5Var.o1.a.getImageReceiver().setVisible(true, true);
        }
        boolean z12 = o5Var.c3;
        l5 l5Var2 = this.v;
        if (z12) {
            f7 = 1.0f;
            canvas2.drawColor(i0.a.d(0.2f, -16777216, -1));
        } else {
            f7 = 1.0f;
            if (((org.telegram.ui.l4) n5Var.e) != null || (h4Var != null && (((raVar = h4Var.b) != null && (raVar.w || raVar.s)) || h4Var.y.i))) {
                invalidate();
            }
            canvas2.save();
            ov0 ov0Var = o5Var.X2;
            if (ov0Var.n) {
                canvas2.save();
                float f15 = ov0Var.O;
                float f16 = ov0Var.A;
                float f17 = ((f15 * f16) + 1.0f) - f16;
                canvas2.scale(f17, f17, ov0Var.o + ov0Var.s, ov0Var.p + ov0Var.t);
                float f18 = ov0Var.o;
                float f19 = ov0Var.J;
                float f20 = ov0Var.A;
                canvas2.translate((f19 * f20) + f18, (ov0Var.K * f20) + ov0Var.p);
            }
            org.telegram.ui.l4 l4Var2 = (org.telegram.ui.l4) n5Var.e;
            if (l4Var2 == null || (!n5Var.a && ((t1) n5Var.b) == null)) {
                if (l4Var2 != null) {
                    invalidate();
                }
                if (m5Var.d) {
                    canvas2.drawColor(i0.a.d(0.2f, -16777216, -1));
                } else {
                    if (!y3Var.hasBitmapImage()) {
                        l5Var2.f.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight() + 1);
                        l5Var2.f.draw(canvas2);
                    }
                    f14 = 0.0f;
                    y3Var.setImageCoords(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight() + 1);
                    y3Var.draw(canvas2);
                    canvas2.restore();
                    z11 = o5Var.Y2;
                    org.telegram.ui.Components.e6 e6Var2 = this.h;
                    e6Var = this.n;
                    if (z11) {
                        e6Var2.d(f14, true);
                        e6Var.d(f14, true);
                    }
                    if (!m5Var.f) {
                        t1 t1Var = (t1) n5Var.b;
                        if (t1Var != null) {
                            if (!n5Var.a) {
                            }
                            hasNotThumb = true;
                        }
                        hasNotThumb = false;
                    } else if (m5Var.e) {
                        if (((org.telegram.ui.l4) n5Var.e) != null) {
                            ob obVar2 = (ob) n5Var.c;
                            if (obVar2 != null) {
                                if (n5Var.a) {
                                    if (obVar2.progress == 0.0f) {
                                        if (obVar2 != null) {
                                            if (obVar2.isBuffering()) {
                                            }
                                        }
                                    }
                                    hasNotThumb = true;
                                }
                            }
                        }
                        hasNotThumb = false;
                    } else {
                        hasNotThumb = y3Var.hasNotThumb();
                    }
                    e6Var2.d((o5Var.K1 || hasNotThumb || m5Var.b != null) ? 0.0f : 1.0f, false);
                    e6Var.d(e6Var2.c != 1.0f ? 1.0f : 0.0f, false);
                    if (e6Var.c > 0.0f) {
                        RectF rectF = AndroidUtilities.rectTmp;
                        rectF.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                        int i10 = (int) (e6Var.c * 255.0f);
                        org.telegram.ui.Components.voip.h hVar = this.f;
                        hVar.a.setAlpha(i10);
                        hVar.c.setAlpha(i10);
                        hVar.f = getMeasuredWidth() * 2;
                        hVar.n = 1.3f;
                        hVar.a(AndroidUtilities.dp(10.0f), canvas2, rectF, this);
                    }
                    o5Var.Y2 = false;
                }
            } else {
                if (!y3Var.hasBitmapImage()) {
                    l5Var2.f.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight() + 1);
                    l5Var2.f.draw(canvas2);
                }
                y3Var.setImageCoords(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight() + 1);
                y3Var.draw(canvas2);
                if (o5Var.K1) {
                    pb pbVar = this.w;
                    boolean z13 = pbVar.a;
                    if (z13 && (obVar = (ob) n5Var.c) != null && obVar.paused && obVar.playerStubBitmap != null && obVar.stubAvailable) {
                        canvas2.save();
                        canvas2.scale(getMeasuredWidth() / ((ob) n5Var.c).playerStubBitmap.getWidth(), getMeasuredHeight() / ((ob) n5Var.c).playerStubBitmap.getHeight());
                        ob obVar3 = (ob) n5Var.c;
                        canvas2.drawBitmap(obVar3.playerStubBitmap, 0.0f, 0.0f, obVar3.playerStubPaint);
                        canvas2.restore();
                    } else {
                        boolean z14 = Build.VERSION.SDK_INT >= 29 && (dVar = o5Var.H3) != null && canvas2 == dVar.r;
                        if (!z13 || (o5Var.b1 && !pbVar.H0 && !z14)) {
                            ((org.telegram.ui.l4) n5Var.e).draw(canvas2);
                        }
                    }
                }
            }
            f14 = 0.0f;
            canvas2.restore();
            z11 = o5Var.Y2;
            org.telegram.ui.Components.e6 e6Var22 = this.h;
            e6Var = this.n;
            if (z11) {
            }
            if (!m5Var.f) {
            }
            e6Var22.d((o5Var.K1 || hasNotThumb || m5Var.b != null) ? 0.0f : 1.0f, false);
            e6Var.d(e6Var22.c != 1.0f ? 1.0f : 0.0f, false);
            if (e6Var.c > 0.0f) {
            }
            o5Var.Y2 = false;
        }
        if (s4Var.getAlpha() > 0.0f) {
            if (s4Var.getAlpha() == f7) {
                canvas2.save();
                l5Var = l5Var2;
                z10 = false;
            } else {
                l5Var = l5Var2;
                z10 = false;
                canvas2.saveLayerAlpha(0.0f, 0.0f, s4Var.getMeasuredWidth(), s4Var.getMeasuredHeight(), (int) (s4Var.getAlpha() * 255.0f), 31);
            }
            h4Var.draw(canvas2);
            canvas2.restore();
            r15 = z10;
        } else {
            l5Var = l5Var2;
            r15 = 0;
        }
        if (!o5Var.Z0 && y3Var.hasNotThumb()) {
            o5Var.Z0 = true;
            o5Var.invalidate();
        }
        hideInterfaceAlpha = o5Var.getHideInterfaceAlpha();
        Drawable drawable = l5Var.d;
        Paint paint = l5Var.c;
        Drawable drawable2 = l5Var.e;
        drawable.setAlpha(255);
        l5Var.d.draw(canvas2);
        if (o5Var.C1 || !o5Var.x2 || s4Var.getVisibility() == 0) {
            if (s4Var.getVisibility() == 0) {
                int dp = AndroidUtilities.dp(72.0f);
                int top = s4Var.getTop() + ((int) (s4Var.getTextTop() - AndroidUtilities.dp(24.0f)));
                int i11 = dp + top;
                float measuredHeight = getMeasuredHeight() * 0.65f;
                if ((measuredHeight - top) / AndroidUtilities.dp(60.0f) > 0.0f && s4Var.w0 && s4Var.r0.getBottom() - s4Var.getMeasuredHeight() > 0) {
                    if ((measuredHeight - (s4Var.getTop() + ((int) (s4Var.getMaxTop() - AndroidUtilities.dp(24.0f))))) / AndroidUtilities.dp(60.0f) > 0.0f) {
                        o5Var.g3 = true;
                    }
                    f10 = 0.0f;
                } else if (o5Var.h3) {
                    o5Var.h3 = r15;
                    f10 = 0.0f;
                    if ((measuredHeight - (s4Var.getTop() + ((int) (s4Var.getMaxTop() - AndroidUtilities.dp(24.0f))))) / AndroidUtilities.dp(60.0f) > 0.0f) {
                        o5Var.g3 = true;
                    }
                } else {
                    f10 = 0.0f;
                    if (s4Var.getProgressToBlackout() == 0.0f) {
                        o5Var.g3 = r15;
                    }
                }
                float d = this.e.d(o5Var.g3 ? 1.0f : 0.0f, r15);
                if (d > f10) {
                    this.r = true;
                    this.s = r15;
                    super.dispatchDraw(canvas);
                    this.r = r15;
                    b(canvas);
                    paint.setColor(i0.a.k(-16777216, (int) (153.0f * d * hideInterfaceAlpha)));
                    canvas2.drawPaint(paint);
                }
                if (d < f7 && !m5Var.f) {
                    canvas2.save();
                    float f21 = f7 - d;
                    paint.setColor(i0.a.k(-16777216, (int) (129.03f * f21 * hideInterfaceAlpha)));
                    drawable2.setAlpha((int) (f21 * 255.0f * hideInterfaceAlpha));
                    drawable2.setBounds(r15, top, getMeasuredWidth(), i11);
                    drawable2.draw(canvas2);
                    canvas2.drawRect(0.0f, i11, getMeasuredWidth(), getMeasuredHeight(), paint);
                    canvas.restore();
                }
                if (d <= f10 || s4Var.getAlpha() <= 0.0f) {
                    canvas2 = canvas;
                } else {
                    if (s4Var.t0) {
                        s4Var.t0 = r15;
                        s4Var.invalidate();
                    }
                    if (s4Var.getAlpha() != f7) {
                        canvas2 = canvas;
                        canvas2.saveLayerAlpha(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), (int) (s4Var.getAlpha() * 255.0f), 31);
                    } else {
                        canvas2 = canvas;
                        canvas2.save();
                    }
                    canvas2.translate(s4Var.getX(), s4Var.getY() - s4Var.getScrollY());
                    s4Var.draw(canvas2);
                    canvas2.restore();
                }
                boolean z15 = d > f10;
                if (s4Var.t0 != z15) {
                    s4Var.t0 = z15;
                    s4Var.invalidate();
                }
                if (d > f10) {
                    this.r = true;
                    this.s = true;
                    super.dispatchDraw(canvas);
                    this.r = r15;
                }
                f11 = d;
                f12 = o5Var.m1;
                if (f12 != 0.0f || (v5Var = o5Var.l1) == null) {
                    f13 = 1.0f;
                } else {
                    float f22 = o5Var.A3;
                    int measuredWidth = getMeasuredWidth();
                    int measuredHeight2 = getMeasuredHeight() + 1;
                    w5 w5Var = v5Var.f;
                    ImageReceiver imageReceiver = v5Var.a;
                    float f23 = (float) r15;
                    imageReceiver.setImageCoords(f23, f23, measuredWidth, measuredHeight2);
                    imageReceiver.setAlpha(f12);
                    imageReceiver.draw(canvas2);
                    f13 = 1.0f;
                    imageReceiver.setAlpha(1.0f);
                    if (v5Var.c != null) {
                        int i12 = (int) (f12 * 255.0f);
                        v5Var.d.setAlpha(i12);
                        GradientDrawable gradientDrawable = w5Var.H;
                        gradientDrawable.setAlpha(i12);
                        gradientDrawable.setBounds((int) imageReceiver.getImageX(), (int) (imageReceiver.getImageY2() - (AndroidUtilities.dp(24.0f) * f22)), (int) imageReceiver.getImageX2(), ((int) imageReceiver.getImageY2()) + 2);
                        gradientDrawable.draw(canvas2);
                        canvas2.save();
                        canvas2.scale(f22, f22, imageReceiver.getCenterX(), imageReceiver.getImageY2() - (AndroidUtilities.dp(8.0f) * f22));
                        canvas2.translate(imageReceiver.getCenterX() - (w5Var.J / 2.0f), (imageReceiver.getImageY2() - (AndroidUtilities.dp(8.0f) * f22)) - v5Var.c.getHeight());
                        v5Var.c.draw(canvas2);
                        canvas2.restore();
                    }
                }
                if (!o5Var.G2) {
                    f13 = 0.0f;
                }
                this.d.d(f13, r15);
                if (o5Var.K1) {
                    boolean z16 = s4Var.getVisibility() == 0 && (o5Var.g3 || s4Var.w0);
                    o5Var.j3 = s4Var.getVisibility() == 0 && s4Var.getProgressToBlackout() > 0.0f;
                    pb pbVar2 = ((gb) o5Var.Q1).d;
                    pbVar2.L0 = z16;
                    pbVar2.P();
                    ((gb) o5Var.Q1).d.m1 = o5Var.j3;
                }
                if (f11 <= 0.0f) {
                    super.dispatchDraw(canvas);
                    b(canvas);
                }
                gzVar = o5Var.k1;
                if (gzVar == null) {
                    gzVar.e(canvas2);
                    return;
                }
                return;
            }
            if (!m5Var.f) {
                int dp2 = AndroidUtilities.dp(o5Var.x2 ? 56.0f : 110.0f);
                if ((o5Var.C1 || !o5Var.x2) && s4Var.getVisibility() == 0) {
                    dp2 = (int) (dp2 * 2.5f);
                }
                drawable2.setBounds(r15, l4Var.getMeasuredHeight() - dp2, getMeasuredWidth(), l4Var.getMeasuredHeight());
                drawable2.setAlpha((int) (hideInterfaceAlpha * 255.0f));
                drawable2.draw(canvas2);
            }
        }
        f11 = 0.0f;
        f12 = o5Var.m1;
        if (f12 != 0.0f) {
        }
        f13 = 1.0f;
        if (!o5Var.G2) {
        }
        this.d.d(f13, r15);
        if (o5Var.K1) {
        }
        if (f11 <= 0.0f) {
        }
        gzVar = o5Var.k1;
        if (gzVar == null) {
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        t1 t1Var;
        o5 o5Var = this.x;
        n5 n5Var = o5Var.M2;
        if (!o5Var.K1 || o5Var.c3 || ((org.telegram.ui.l4) n5Var.e) == null || (t1Var = (t1) n5Var.b) == null || !t1Var.n() || !((org.telegram.ui.l4) n5Var.e).dispatchTouchEvent(motionEvent)) {
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
        qc qcVar = qc.w;
        if (qcVar == null || view != qcVar.e) {
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
        qc.a(this, new ah.n0(this, 1));
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        o5 o5Var = this.x;
        o5Var.k1.k();
        qc.h(this);
        h5 h5Var = o5Var.Q1;
        if (h5Var != null) {
            pb pbVar = ((gb) h5Var).d;
            pbVar.Y0 = false;
            pbVar.P();
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
