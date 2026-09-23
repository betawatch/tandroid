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
import org.telegram.ui.Components.rr;
import org.telegram.ui.dz;
import org.telegram.ui.iv0;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes4.dex */
public final class a5 extends i0 {
    public final org.telegram.ui.Components.e6 d;
    public final org.telegram.ui.Components.e6 e;
    public final org.telegram.ui.Components.voip.h f;
    public final org.telegram.ui.Components.e6 h;
    public final org.telegram.ui.Components.e6 n;
    public boolean r;
    public boolean s;
    public final /* synthetic */ b6 v;
    public final /* synthetic */ jc w;
    public final /* synthetic */ e6 x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a5(e6 e6Var, Context context, b6 b6Var, jc jcVar) {
        super(context);
        this.x = e6Var;
        this.v = b6Var;
        this.w = jcVar;
        rr rrVar = rr.f;
        this.d = new org.telegram.ui.Components.e6(this, 150L, rrVar);
        this.e = new org.telegram.ui.Components.e6(this, 150L, rrVar);
        this.f = new org.telegram.ui.Components.voip.h(32, 102, 240);
        org.telegram.ui.Components.e6 e6Var2 = new org.telegram.ui.Components.e6(this);
        this.h = e6Var2;
        org.telegram.ui.Components.e6 e6Var3 = new org.telegram.ui.Components.e6(this);
        this.n = e6Var3;
        e6Var2.g = 500L;
        e6Var3.g = 100L;
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
        e6 e6Var = this.x;
        float f19 = e6Var.I1;
        v4 v4Var = e6Var.j1;
        d6 d6Var = e6Var.M2;
        c6 c6Var = e6Var.O1;
        l4 l4Var = e6Var.e1;
        if (l4Var.hasNotThumb() || ((c6Var.e && d6Var.a) || (c6Var.f && d6Var.a))) {
            e6 e6Var2 = c6Var.k;
            TL_stories.PeerStories peerStories = e6Var2.u1;
            jc jcVar = e6Var2.J0;
            if (peerStories == null && (peerStories = e6Var2.S1.y(e6Var2.B1)) == null && (userFull = MessagesController.getInstance(e6Var2.C2).getUserFull(e6Var2.B1)) != null) {
                peerStories = userFull.stories;
            }
            if (e6Var2.K1 && (storyItem2 = c6Var.a) != null && peerStories != null && ((!ia.v(storyItem2) && ((i10 = c6Var.a.id) > peerStories.max_read_id || i10 > e6Var2.S1.f.get(e6Var2.B1, 0))) || e6Var2.C1)) {
                TL_stories.PeerStories peerStories2 = jcVar.Q0;
                if (peerStories2 == null) {
                    l9 l9Var = e6Var2.S1;
                    long j3 = e6Var2.B1;
                    TL_stories.StoryItem storyItem3 = c6Var.a;
                    TL_stories.PeerStories y3 = l9Var.y(j3);
                    if (y3 == null) {
                        y3 = l9Var.z(j3);
                    }
                    if (l9Var.V(y3, storyItem3, false)) {
                        jcVar.c1 = true;
                    }
                } else if (e6Var2.S1.V(peerStories2, c6Var.a, true)) {
                    jcVar.c1 = true;
                }
            } else if (e6Var2.K1 && (storyItem = c6Var.a) != null && (d9Var = jcVar.O0) != null && d9Var.r(storyItem.id)) {
                jcVar.c1 = true;
            }
        }
        hideInterfaceAlpha = e6Var.getHideInterfaceAlpha();
        if (c6Var.e) {
            ic icVar3 = (ic) d6Var.c;
            if (icVar3 != null) {
                clamp = Utilities.clamp(icVar3.getPlaybackProgress(e6Var.R2), 1.0f, 0.0f);
                if (d6Var.a && v4Var != null) {
                    v4Var.e();
                }
            } else {
                clamp = 0.0f;
            }
            invalidate();
            f7 = hideInterfaceAlpha;
        } else if (e6Var.R1 || !e6Var.K1 || e6Var.T1 || e6Var.U1 || e6Var.V1 || !l4Var.hasNotThumb()) {
            f7 = hideInterfaceAlpha;
            clamp = Utilities.clamp(e6Var.W0 / 10000.0f, 1.0f, 0.0f);
        } else {
            long currentTimeMillis = System.currentTimeMillis();
            long j10 = e6Var.X0;
            if (j10 == 0 || e6Var.j3) {
                f7 = hideInterfaceAlpha;
            } else {
                f7 = hideInterfaceAlpha;
                if (e6Var.W0 <= 0 && currentTimeMillis - j10 > 0 && v4Var != null) {
                    v4Var.e();
                }
                e6Var.W0 += currentTimeMillis - e6Var.X0;
            }
            e6Var.X0 = currentTimeMillis;
            clamp = Utilities.clamp(e6Var.W0 / 10000.0f, 1.0f, 0.0f);
            invalidate();
        }
        if (d6Var != null && (icVar2 = (ic) d6Var.c) != null) {
            f10 = icVar2.currentSeek;
        }
        f10 = clamp;
        if (!e6Var.Y0 && clamp == 1.0f && ((!c6Var.e || !e6Var.j3) && !e6Var.L2)) {
            e6Var.Y0 = true;
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
            if (e6Var.q1 == null) {
                e6Var.q1 = new j6.l(1);
            }
            j6.l lVar = e6Var.q1;
            f11 = 4.0f;
            float f20 = (1.0f - e6Var.d4) * f7 * f19;
            int i14 = e6Var.L1;
            f12 = 1.0f;
            int g10 = jcVar2.O0.g();
            f13 = 2.0f;
            a6 a6Var = e6Var.o1;
            f14 = 8.0f;
            org.telegram.ui.Components.o6 o6Var = (org.telegram.ui.Components.o6) lVar.d;
            int i15 = (g10 << 12) + i14;
            if (lVar.a != i15) {
                lVar.a = i15;
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                spannableStringBuilder.append((CharSequence) String.valueOf(i14 + 1)).append((CharSequence) lVar.b).append((CharSequence) "/").append((CharSequence) lVar.c).append((CharSequence) String.valueOf(g10));
                o6Var.q(spannableStringBuilder, false, true);
            }
            canvas.save();
            float y10 = a6Var.getY();
            z5 z5Var = a6Var.b;
            float top = ((o6Var.e / 2.0f) + (y10 + z5Var.getTop())) - 1.0f;
            z5Var.setRightPadding((int) o6Var.d());
            canvas.translate((z5Var.getRightDrawableWidth() + (z5Var.getTextWidth() + (z5Var.getLeft() + (a6Var.getLeft() + AndroidUtilities.dp(4.0f))))) - Utilities.clamp(((z5Var.getRightDrawableWidth() + z5Var.getTextWidth()) + r0) - z5Var.getWidth(), r0, 0), top);
            float dp = AndroidUtilities.dp(8.0f);
            float dp2 = AndroidUtilities.dp(2.0f);
            AndroidUtilities.rectTmp.set(-dp, -dp2, o6Var.d() + dp, o6Var.e + dp2);
            o6Var.w = (int) (f20 * 160.0f);
            o6Var.draw(canvas);
            canvas.restore();
        }
        canvas.save();
        canvas.translate(0.0f, AndroidUtilities.dp(f14) - (AndroidUtilities.dp(f14) * e6Var.d4));
        boolean z11 = c6Var.e && (icVar = (ic) d6Var.c) != null && icVar.isBuffering();
        boolean z12 = e6Var.L2;
        boolean z13 = z12 && c6Var != null && c6Var.e && jcVar2.k0;
        float e = e6Var.P2.e(!z12 || z13);
        hb hbVar2 = e6Var.p1;
        int measuredWidth = getMeasuredWidth();
        int i16 = e6Var.M1;
        int i17 = e6Var.N1;
        float f21 = (f12 - e6Var.d4) * f19;
        TextPaint textPaint = hbVar2.c;
        if (i17 > 0) {
            boolean z14 = z11 && !z13;
            if (hbVar2.i != i16) {
                hbVar2.g = 0.0f;
                hbVar2.h = true;
            }
            hbVar2.i = i16;
            b6 b6Var = hbVar2.a;
            Paint paint2 = b6Var.a;
            Paint paint3 = b6Var.b;
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
                textPaint.setShadowLayer(AndroidUtilities.dp(3.0f), 0.0f, AndroidUtilities.dp(f12), org.telegram.ui.ActionBar.h6.l1(e7, 805306368));
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
        b6 b6Var;
        ?? r15;
        float hideInterfaceAlpha;
        float f10;
        float f11;
        float f12;
        float f13;
        dz dzVar;
        l6 l6Var;
        boolean z10;
        float f14;
        boolean z11;
        org.telegram.ui.Components.e6 e6Var;
        boolean hasNotThumb;
        fh.d dVar;
        ic icVar;
        kb kbVar;
        Canvas canvas2 = canvas;
        e6 e6Var2 = this.x;
        a5 a5Var = e6Var2.c1;
        v4 v4Var = e6Var2.j1;
        c6 c6Var = e6Var2.O1;
        l4 l4Var = e6Var2.e1;
        d6 d6Var = e6Var2.M2;
        g5 g5Var = e6Var2.K0;
        if (!e6Var2.K1) {
            e6Var2.o1.a.getImageReceiver().setVisible(true, true);
        }
        boolean z12 = e6Var2.c3;
        b6 b6Var2 = this.v;
        if (z12) {
            f7 = 1.0f;
            canvas2.drawColor(i0.a.d(0.2f, -16777216, -1));
        } else {
            f7 = 1.0f;
            if (((org.telegram.ui.l4) d6Var.e) != null || (v4Var != null && (((kbVar = v4Var.b) != null && (kbVar.w || kbVar.s)) || v4Var.y.i))) {
                invalidate();
            }
            canvas2.save();
            iv0 iv0Var = e6Var2.X2;
            if (iv0Var.n) {
                canvas2.save();
                float f15 = iv0Var.O;
                float f16 = iv0Var.A;
                float f17 = ((f15 * f16) + 1.0f) - f16;
                canvas2.scale(f17, f17, iv0Var.o + iv0Var.s, iv0Var.p + iv0Var.t);
                float f18 = iv0Var.o;
                float f19 = iv0Var.J;
                float f20 = iv0Var.A;
                canvas2.translate((f19 * f20) + f18, (iv0Var.K * f20) + iv0Var.p);
            }
            org.telegram.ui.l4 l4Var2 = (org.telegram.ui.l4) d6Var.e;
            if (l4Var2 == null || (!d6Var.a && ((d2) d6Var.b) == null)) {
                if (l4Var2 != null) {
                    invalidate();
                }
                if (c6Var.d) {
                    canvas2.drawColor(i0.a.d(0.2f, -16777216, -1));
                } else {
                    if (!l4Var.hasBitmapImage()) {
                        b6Var2.f.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight() + 1);
                        b6Var2.f.draw(canvas2);
                    }
                    f14 = 0.0f;
                    l4Var.setImageCoords(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight() + 1);
                    l4Var.draw(canvas2);
                    canvas2.restore();
                    z11 = e6Var2.Y2;
                    org.telegram.ui.Components.e6 e6Var3 = this.h;
                    e6Var = this.n;
                    if (z11) {
                        e6Var3.d(f14, true);
                        e6Var.d(f14, true);
                    }
                    if (!c6Var.f) {
                        d2 d2Var = (d2) d6Var.b;
                        if (d2Var != null) {
                            if (!d6Var.a) {
                            }
                            hasNotThumb = true;
                        }
                        hasNotThumb = false;
                    } else if (c6Var.e) {
                        if (((org.telegram.ui.l4) d6Var.e) != null) {
                            ic icVar2 = (ic) d6Var.c;
                            if (icVar2 != null) {
                                if (d6Var.a) {
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
                    e6Var3.d((e6Var2.K1 || hasNotThumb || c6Var.b != null) ? 0.0f : 1.0f, false);
                    e6Var.d(e6Var3.c != 1.0f ? 1.0f : 0.0f, false);
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
                    e6Var2.Y2 = false;
                }
            } else {
                if (!l4Var.hasBitmapImage()) {
                    b6Var2.f.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight() + 1);
                    b6Var2.f.draw(canvas2);
                }
                l4Var.setImageCoords(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight() + 1);
                l4Var.draw(canvas2);
                if (e6Var2.K1) {
                    jc jcVar = this.w;
                    boolean z13 = jcVar.a;
                    if (z13 && (icVar = (ic) d6Var.c) != null && icVar.paused && icVar.playerStubBitmap != null && icVar.stubAvailable) {
                        canvas2.save();
                        canvas2.scale(getMeasuredWidth() / ((ic) d6Var.c).playerStubBitmap.getWidth(), getMeasuredHeight() / ((ic) d6Var.c).playerStubBitmap.getHeight());
                        ic icVar3 = (ic) d6Var.c;
                        canvas2.drawBitmap(icVar3.playerStubBitmap, 0.0f, 0.0f, icVar3.playerStubPaint);
                        canvas2.restore();
                    } else {
                        boolean z14 = Build.VERSION.SDK_INT >= 29 && (dVar = e6Var2.H3) != null && canvas2 == dVar.r;
                        if (!z13 || (e6Var2.b1 && !jcVar.H0 && !z14)) {
                            ((org.telegram.ui.l4) d6Var.e).draw(canvas2);
                        }
                    }
                }
            }
            f14 = 0.0f;
            canvas2.restore();
            z11 = e6Var2.Y2;
            org.telegram.ui.Components.e6 e6Var32 = this.h;
            e6Var = this.n;
            if (z11) {
            }
            if (!c6Var.f) {
            }
            e6Var32.d((e6Var2.K1 || hasNotThumb || c6Var.b != null) ? 0.0f : 1.0f, false);
            e6Var.d(e6Var32.c != 1.0f ? 1.0f : 0.0f, false);
            if (e6Var.c > 0.0f) {
            }
            e6Var2.Y2 = false;
        }
        if (g5Var.getAlpha() > 0.0f) {
            if (g5Var.getAlpha() == f7) {
                canvas2.save();
                b6Var = b6Var2;
                z10 = false;
            } else {
                b6Var = b6Var2;
                z10 = false;
                canvas2.saveLayerAlpha(0.0f, 0.0f, g5Var.getMeasuredWidth(), g5Var.getMeasuredHeight(), (int) (g5Var.getAlpha() * 255.0f), 31);
            }
            v4Var.draw(canvas2);
            canvas2.restore();
            r15 = z10;
        } else {
            b6Var = b6Var2;
            r15 = 0;
        }
        if (!e6Var2.Z0 && l4Var.hasNotThumb()) {
            e6Var2.Z0 = true;
            e6Var2.invalidate();
        }
        hideInterfaceAlpha = e6Var2.getHideInterfaceAlpha();
        Drawable drawable = b6Var.d;
        Paint paint = b6Var.c;
        Drawable drawable2 = b6Var.e;
        drawable.setAlpha(255);
        b6Var.d.draw(canvas2);
        if (e6Var2.C1 || !e6Var2.x2 || g5Var.getVisibility() == 0) {
            if (g5Var.getVisibility() == 0) {
                int dp = AndroidUtilities.dp(72.0f);
                int top = g5Var.getTop() + ((int) (g5Var.getTextTop() - AndroidUtilities.dp(24.0f)));
                int i11 = dp + top;
                float measuredHeight = getMeasuredHeight() * 0.65f;
                if ((measuredHeight - top) / AndroidUtilities.dp(60.0f) > 0.0f && g5Var.w0 && g5Var.r0.getBottom() - g5Var.getMeasuredHeight() > 0) {
                    if ((measuredHeight - (g5Var.getTop() + ((int) (g5Var.getMaxTop() - AndroidUtilities.dp(24.0f))))) / AndroidUtilities.dp(60.0f) > 0.0f) {
                        e6Var2.g3 = true;
                    }
                    f10 = 0.0f;
                } else if (e6Var2.h3) {
                    e6Var2.h3 = r15;
                    f10 = 0.0f;
                    if ((measuredHeight - (g5Var.getTop() + ((int) (g5Var.getMaxTop() - AndroidUtilities.dp(24.0f))))) / AndroidUtilities.dp(60.0f) > 0.0f) {
                        e6Var2.g3 = true;
                    }
                } else {
                    f10 = 0.0f;
                    if (g5Var.getProgressToBlackout() == 0.0f) {
                        e6Var2.g3 = r15;
                    }
                }
                float d = this.e.d(e6Var2.g3 ? 1.0f : 0.0f, r15);
                if (d > f10) {
                    this.r = true;
                    this.s = r15;
                    super.dispatchDraw(canvas);
                    this.r = r15;
                    b(canvas);
                    paint.setColor(i0.a.k(-16777216, (int) (153.0f * d * hideInterfaceAlpha)));
                    canvas2.drawPaint(paint);
                }
                if (d < f7 && !c6Var.f) {
                    canvas2.save();
                    float f21 = f7 - d;
                    paint.setColor(i0.a.k(-16777216, (int) (129.03f * f21 * hideInterfaceAlpha)));
                    drawable2.setAlpha((int) (f21 * 255.0f * hideInterfaceAlpha));
                    drawable2.setBounds(r15, top, getMeasuredWidth(), i11);
                    drawable2.draw(canvas2);
                    canvas2.drawRect(0.0f, i11, getMeasuredWidth(), getMeasuredHeight(), paint);
                    canvas.restore();
                }
                if (d <= f10 || g5Var.getAlpha() <= 0.0f) {
                    canvas2 = canvas;
                } else {
                    if (g5Var.t0) {
                        g5Var.t0 = r15;
                        g5Var.invalidate();
                    }
                    if (g5Var.getAlpha() != f7) {
                        canvas2 = canvas;
                        canvas2.saveLayerAlpha(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), (int) (g5Var.getAlpha() * 255.0f), 31);
                    } else {
                        canvas2 = canvas;
                        canvas2.save();
                    }
                    canvas2.translate(g5Var.getX(), g5Var.getY() - g5Var.getScrollY());
                    g5Var.draw(canvas2);
                    canvas2.restore();
                }
                boolean z15 = d > f10;
                if (g5Var.t0 != z15) {
                    g5Var.t0 = z15;
                    g5Var.invalidate();
                }
                if (d > f10) {
                    this.r = true;
                    this.s = true;
                    super.dispatchDraw(canvas);
                    this.r = r15;
                }
                f11 = d;
                f12 = e6Var2.m1;
                if (f12 != 0.0f || (l6Var = e6Var2.l1) == null) {
                    f13 = 1.0f;
                } else {
                    float f22 = e6Var2.A3;
                    int measuredWidth = getMeasuredWidth();
                    int measuredHeight2 = getMeasuredHeight() + 1;
                    m6 m6Var = l6Var.f;
                    ImageReceiver imageReceiver = l6Var.a;
                    float f23 = (float) r15;
                    imageReceiver.setImageCoords(f23, f23, measuredWidth, measuredHeight2);
                    imageReceiver.setAlpha(f12);
                    imageReceiver.draw(canvas2);
                    f13 = 1.0f;
                    imageReceiver.setAlpha(1.0f);
                    if (l6Var.c != null) {
                        int i12 = (int) (f12 * 255.0f);
                        l6Var.d.setAlpha(i12);
                        GradientDrawable gradientDrawable = m6Var.H;
                        gradientDrawable.setAlpha(i12);
                        gradientDrawable.setBounds((int) imageReceiver.getImageX(), (int) (imageReceiver.getImageY2() - (AndroidUtilities.dp(24.0f) * f22)), (int) imageReceiver.getImageX2(), ((int) imageReceiver.getImageY2()) + 2);
                        gradientDrawable.draw(canvas2);
                        canvas2.save();
                        canvas2.scale(f22, f22, imageReceiver.getCenterX(), imageReceiver.getImageY2() - (AndroidUtilities.dp(8.0f) * f22));
                        canvas2.translate(imageReceiver.getCenterX() - (m6Var.J / 2.0f), (imageReceiver.getImageY2() - (AndroidUtilities.dp(8.0f) * f22)) - l6Var.c.getHeight());
                        l6Var.c.draw(canvas2);
                        canvas2.restore();
                    }
                }
                if (!e6Var2.G2) {
                    f13 = 0.0f;
                }
                this.d.d(f13, r15);
                if (e6Var2.K1) {
                    boolean z16 = g5Var.getVisibility() == 0 && (e6Var2.g3 || g5Var.w0);
                    e6Var2.j3 = g5Var.getVisibility() == 0 && g5Var.getProgressToBlackout() > 0.0f;
                    jc jcVar2 = ((ac) e6Var2.Q1).d;
                    jcVar2.L0 = z16;
                    jcVar2.P();
                    ((ac) e6Var2.Q1).d.m1 = e6Var2.j3;
                }
                if (f11 <= 0.0f) {
                    super.dispatchDraw(canvas);
                    b(canvas);
                }
                dzVar = e6Var2.k1;
                if (dzVar == null) {
                    dzVar.e(canvas2);
                    return;
                }
                return;
            }
            if (!c6Var.f) {
                int dp2 = AndroidUtilities.dp(e6Var2.x2 ? 56.0f : 110.0f);
                if ((e6Var2.C1 || !e6Var2.x2) && g5Var.getVisibility() == 0) {
                    dp2 = (int) (dp2 * 2.5f);
                }
                drawable2.setBounds(r15, a5Var.getMeasuredHeight() - dp2, getMeasuredWidth(), a5Var.getMeasuredHeight());
                drawable2.setAlpha((int) (hideInterfaceAlpha * 255.0f));
                drawable2.draw(canvas2);
            }
        }
        f11 = 0.0f;
        f12 = e6Var2.m1;
        if (f12 != 0.0f) {
        }
        f13 = 1.0f;
        if (!e6Var2.G2) {
        }
        this.d.d(f13, r15);
        if (e6Var2.K1) {
        }
        if (f11 <= 0.0f) {
        }
        dzVar = e6Var2.k1;
        if (dzVar == null) {
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        d2 d2Var;
        e6 e6Var = this.x;
        d6 d6Var = e6Var.M2;
        if (!e6Var.K1 || e6Var.c3 || ((org.telegram.ui.l4) d6Var.e) == null || (d2Var = (d2) d6Var.b) == null || !d2Var.n() || !((org.telegram.ui.l4) d6Var.e).dispatchTouchEvent(motionEvent)) {
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
        org.telegram.ui.Components.qc qcVar = org.telegram.ui.Components.qc.w;
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
        org.telegram.ui.Components.qc.a(this, new w4(this, 0));
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        e6 e6Var = this.x;
        e6Var.k1.k();
        org.telegram.ui.Components.qc.h(this);
        x5 x5Var = e6Var.Q1;
        if (x5Var != null) {
            jc jcVar = ((ac) x5Var).d;
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
