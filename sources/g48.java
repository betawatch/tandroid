// default package

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
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes3.dex */
public final class g48 extends pi5 {
    public final ln d;
    public final ln e;
    public final ef1 f;
    public final ln h;
    public final ln n;
    public boolean r;
    public boolean s;
    public final /* synthetic */ y48 w;
    public final /* synthetic */ oab x;
    public final /* synthetic */ a58 y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g48(a58 a58Var, Context context, y48 y48Var, oab oabVar) {
        super(context);
        this.y = a58Var;
        this.w = y48Var;
        this.x = oabVar;
        d53 d53Var = d53.f;
        this.d = new ln(150L, this, d53Var);
        this.e = new ln(150L, this, d53Var);
        this.f = new ef1(32, nm7.m1, nm7.O3);
        ln lnVar = new ln(this);
        this.h = lnVar;
        ln lnVar2 = new ln(this);
        this.n = lnVar2;
        lnVar.g = 500L;
        lnVar2.g = 100L;
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0155, code lost:
    
        if (r4 < 0.0f) goto L93;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b(Canvas canvas) {
        TL_stories.StoryItem storyItem;
        z3b z3bVar;
        TL_stories.StoryItem storyItem2;
        int i;
        TLRPC.UserFull X1;
        float hideInterfaceAlpha;
        float f;
        float i2;
        float f2;
        float f3;
        float f4;
        float f5;
        float f6;
        int i3;
        float f7;
        float f8;
        float f9;
        int i4;
        int i5;
        float f10;
        float f11;
        Paint paint;
        int i6;
        float f12;
        nab nabVar;
        nab nabVar2;
        a58 a58Var = this.y;
        float f13 = a58Var.y1;
        e48 e48Var = a58Var.Z0;
        c40 c40Var = a58Var.C2;
        z48 z48Var = a58Var.E1;
        mm mmVar = a58Var.U0;
        if (mmVar.E() || ((z48Var.e && c40Var.a) || (z48Var.f && c40Var.a))) {
            a58 a58Var2 = z48Var.k;
            TL_stories.PeerStories peerStories = a58Var2.k1;
            oab oabVar = a58Var2.z0;
            if (peerStories == null && (peerStories = a58Var2.I1.x(a58Var2.r1)) == null && (X1 = oc7.r1(a58Var2.s2).X1(a58Var2.r1)) != null) {
                peerStories = X1.stories;
            }
            if (a58Var2.A1 && (storyItem2 = z48Var.a) != null && peerStories != null && ((!y4b.v(storyItem2) && ((i = z48Var.a.id) > peerStories.max_read_id || i > a58Var2.I1.f.get(a58Var2.r1, 0))) || a58Var2.s1)) {
                TL_stories.PeerStories peerStories2 = oabVar.Q0;
                h4b h4bVar = a58Var2.I1;
                if (peerStories2 == null) {
                    long j = a58Var2.r1;
                    TL_stories.StoryItem storyItem3 = z48Var.a;
                    TL_stories.PeerStories x = h4bVar.x(j);
                    if (x == null) {
                        x = h4bVar.y(j);
                    }
                    if (h4bVar.X(x, storyItem3, false)) {
                        oabVar.c1 = true;
                    }
                } else if (h4bVar.X(peerStories2, z48Var.a, true)) {
                    oabVar.c1 = true;
                }
            } else if (a58Var2.A1 && (storyItem = z48Var.a) != null && (z3bVar = oabVar.O0) != null && z3bVar.r(storyItem.id)) {
                oabVar.c1 = true;
            }
        }
        hideInterfaceAlpha = a58Var.getHideInterfaceAlpha();
        if (z48Var.e) {
            nab nabVar3 = (nab) c40Var.c;
            if (nabVar3 != null) {
                i2 = Utilities.i(nabVar3.getPlaybackProgress(a58Var.H2), 1.0f, 0.0f);
                if (c40Var.a && e48Var != null) {
                    e48Var.e();
                }
            } else {
                i2 = 0.0f;
            }
            invalidate();
            f = hideInterfaceAlpha;
        } else if (a58Var.H1 || !a58Var.A1 || a58Var.J1 || a58Var.K1 || a58Var.L1 || !mmVar.E()) {
            f = hideInterfaceAlpha;
            i2 = Utilities.i(a58Var.M0 / 10000.0f, 1.0f, 0.0f);
        } else {
            long currentTimeMillis = System.currentTimeMillis();
            long j2 = a58Var.N0;
            if (j2 == 0 || a58Var.Z2) {
                f = hideInterfaceAlpha;
            } else {
                f = hideInterfaceAlpha;
                if (a58Var.M0 <= 0 && currentTimeMillis - j2 > 0 && e48Var != null) {
                    e48Var.e();
                }
                a58Var.M0 += currentTimeMillis - a58Var.N0;
            }
            a58Var.N0 = currentTimeMillis;
            i2 = Utilities.i(a58Var.M0 / 10000.0f, 1.0f, 0.0f);
            invalidate();
        }
        if (c40Var != null && (nabVar2 = (nab) c40Var.c) != null) {
            f2 = nabVar2.currentSeek;
        }
        f2 = i2;
        if (!a58Var.O0 && i2 == 1.0f && ((!z48Var.e || !a58Var.Z2) && !a58Var.B2)) {
            a58Var.O0 = true;
            post(new kl7(this, (byte) 24));
        }
        oab oabVar2 = this.x;
        z3b z3bVar2 = oabVar2.O0;
        if (z3bVar2 == null || z3bVar2.e == 3) {
            f3 = 1.0f;
            f4 = 4.0f;
            f5 = 2.0f;
            f6 = 8.0f;
        } else {
            jif jifVar = a58Var.g1;
            if (jifVar == null) {
                jifVar = new jif((byte) 3);
                a58Var.g1 = jifVar;
            }
            f4 = 4.0f;
            float f14 = (1.0f - a58Var.T3) * f * f13;
            int i7 = a58Var.B1;
            f3 = 1.0f;
            int g = oabVar2.O0.g();
            f5 = 2.0f;
            x48 x48Var = a58Var.e1;
            f6 = 8.0f;
            ho hoVar = (ho) jifVar.d;
            int i8 = (g << 12) + i7;
            if (jifVar.a != i8) {
                jifVar.a = i8;
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                spannableStringBuilder.append((CharSequence) String.valueOf(i7 + 1)).append((CharSequence) jifVar.b).append((CharSequence) "/").append((CharSequence) jifVar.c).append((CharSequence) String.valueOf(g));
                hoVar.t(spannableStringBuilder, false, true);
            }
            canvas.save();
            float y = x48Var.getY();
            dg0 dg0Var = x48Var.b;
            float top = ((hoVar.e / 2.0f) + (y + dg0Var.getTop())) - 1.0f;
            dg0Var.setRightPadding((int) hoVar.c());
            canvas.translate((dg0Var.getRightDrawableWidth() + (dg0Var.getTextWidth() + (dg0Var.getLeft() + (x48Var.getLeft() + gm.L(4.0f))))) - Utilities.j(((dg0Var.getRightDrawableWidth() + dg0Var.getTextWidth()) + r0) - dg0Var.getWidth(), r0, 0), top);
            float L = gm.L(8.0f);
            float L2 = gm.L(2.0f);
            gm.P.set(-L, -L2, hoVar.c() + L, hoVar.e + L2);
            hoVar.C = (int) (f14 * 160.0f);
            hoVar.draw(canvas);
            canvas.restore();
        }
        canvas.save();
        canvas.translate(0.0f, gm.L(f6) - (gm.L(f6) * a58Var.T3));
        boolean z = z48Var.e && (nabVar = (nab) c40Var.c) != null && nabVar.isBuffering();
        boolean z2 = a58Var.B2;
        boolean z3 = z2 && z48Var != null && z48Var.e && oabVar2.l0;
        float d = a58Var.F2.d(!z2 || z3);
        i6b i6bVar = a58Var.f1;
        int measuredWidth = getMeasuredWidth();
        int i9 = a58Var.C1;
        int i10 = a58Var.D1;
        float f15 = (f3 - a58Var.T3) * f13;
        TextPaint textPaint = i6bVar.c;
        if (i10 > 0) {
            boolean z4 = z && !z3;
            if (i6bVar.i != i9) {
                i6bVar.g = 0.0f;
                i6bVar.h = true;
            }
            i6bVar.i = i9;
            y48 y48Var = i6bVar.a;
            Paint paint2 = y48Var.a;
            Paint paint3 = y48Var.b;
            int L3 = i10 > 100 ? 1 : i10 >= 50 ? gm.L(f3) : gm.L(f5);
            boolean z5 = z4;
            float L4 = ((measuredWidth - gm.L(10.0f)) - ((i10 - 1) * L3)) / i10;
            float min = Math.min(L4 / f5, gm.L(f3));
            float d2 = i6bVar.b.d(z3);
            if (d2 > 0.0f) {
                float R1 = gm.R1(i2, f2, d2);
                canvas.save();
                textPaint.setAlpha((int) (d2 * 255.0f));
                i3 = L3;
                textPaint.setShadowLayer(gm.L(3.0f), 0.0f, gm.L(f3), cmb.p1(d2, 805306368));
                canvas.translate(((measuredWidth - i6bVar.f) / f5) - i6bVar.e, gm.U1(d2, gm.L(f4), gm.L(16.0f)));
                i6bVar.d.draw(canvas);
                canvas.restore();
                i2 = R1;
            } else {
                i3 = L3;
            }
            int i11 = 0;
            while (i11 < i10) {
                float L5 = (i11 * L4) + gm.L(5.0f) + (-0.0f) + (i3 * i11);
                if (L5 <= measuredWidth) {
                    float f16 = L5 + L4;
                    if (f16 >= 0.0f && f15 > 0.0f) {
                        float R12 = gm.R1(min, gm.N(f5), d2);
                        if (i11 > i9 || i11 != i9) {
                            f7 = d;
                            f8 = min;
                            f9 = i2;
                            i4 = measuredWidth;
                            i5 = i10;
                            f10 = f16;
                            f11 = f3;
                        } else {
                            f8 = min;
                            RectF rectF = gm.P;
                            f9 = i2;
                            i4 = measuredWidth;
                            i5 = i10;
                            rectF.set(L5, 0.0f, f16, gm.R1(gm.N(f5), gm.N(5.0f), (i9 == i11 ? 1 : 0) * d2));
                            if (z5) {
                                boolean z6 = i6bVar.h;
                                float f17 = i6bVar.g;
                                if (z6) {
                                    f12 = f17 + 0.026666667f;
                                    i6bVar.g = f12;
                                    if (f12 > 0.5f) {
                                        i6bVar.h = false;
                                    }
                                } else {
                                    f12 = f17 - 0.026666667f;
                                    i6bVar.g = f12;
                                    if (f12 < -0.5f) {
                                        i6bVar.h = true;
                                    }
                                }
                                f10 = f16;
                                i6 = (int) mlb.C(f15, 51.0f, d, f12);
                            } else {
                                f10 = f16;
                                i6 = 0;
                            }
                            paint2.setAlpha(((int) (f15 * 85.0f * d)) + i6);
                            if (d2 > 0.0f) {
                                int i12 = i11 - i9;
                                f7 = d;
                                rectF.left = Utilities.i(gm.R1(rectF.left, gm.L(5.0f) + (i12 * i4), d2), i4 - gm.L(5.0f), gm.L(5.0f));
                                rectF.right = Utilities.i(gm.R1(rectF.right, ((i12 + 1) * i4) - gm.L(5.0f), d2), i4 - gm.L(5.0f), gm.L(5.0f));
                            } else {
                                f7 = d;
                            }
                            canvas.drawRoundRect(rectF, R12, R12, paint2);
                            f11 = f9;
                        }
                        RectF rectF2 = gm.P;
                        rectF2.set(L5, 0.0f, f10, gm.R1(gm.N(f5), gm.N(5.0f), (i9 == i11 ? 1 : 0) * d2));
                        if (d2 > 0.0f) {
                            int i13 = i11 - i9;
                            rectF2.left = Utilities.i(gm.R1(rectF2.left, gm.L(5.0f) + (i13 * i4), d2), i4 - gm.L(5.0f), gm.L(5.0f));
                            rectF2.right = Utilities.i(gm.R1(rectF2.right, ((i13 + 1) * i4) - gm.L(5.0f), d2), i4 - gm.L(5.0f), gm.L(5.0f));
                        }
                        rectF2.right = gm.R1(rectF2.left, rectF2.right, f11);
                        if (i11 <= i9) {
                            paint3.setAlpha((int) (f15 * 255.0f * f7));
                            paint = paint3;
                        } else {
                            paint2.setAlpha((int) (85.0f * f15 * f7));
                            paint = paint2;
                        }
                        canvas.drawRoundRect(rectF2, R12, R12, paint);
                        i11++;
                        min = f8;
                        i2 = f9;
                        measuredWidth = i4;
                        i10 = i5;
                        d = f7;
                    }
                }
                f7 = d;
                f8 = min;
                f9 = i2;
                i4 = measuredWidth;
                i5 = i10;
                i11++;
                min = f8;
                i2 = f9;
                measuredWidth = i4;
                i10 = i5;
                d = f7;
            }
        }
        canvas.restore();
    }

    /* JADX WARN: Code restructure failed: missing block: B:227:0x01d0, code lost:
    
        if (((nab) r2.c).paused != false) goto L95;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x01a3, code lost:
    
        if (r4.p() != false) goto L95;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0529  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0535  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0578  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0582  */
    /* JADX WARN: Removed duplicated region for block: B:137:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:138:0x052b  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x01f4  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x01a6  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0189  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0195  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x01de A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:79:0x01f1  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x01ff  */
    /* JADX WARN: Type inference failed for: r15v0 */
    /* JADX WARN: Type inference failed for: r15v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r15v9 */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void dispatchDraw(Canvas canvas) {
        y48 y48Var;
        ?? r15;
        float hideInterfaceAlpha;
        float f;
        float f2;
        float f3;
        float f4;
        boolean z;
        kw3 kw3Var;
        o1a o1aVar;
        boolean z2;
        float f5;
        boolean z3;
        ln lnVar;
        boolean E;
        nz4 nz4Var;
        nab nabVar;
        v6b v6bVar;
        Canvas canvas2 = canvas;
        a58 a58Var = this.y;
        g48 g48Var = a58Var.S0;
        e48 e48Var = a58Var.Z0;
        z48 z48Var = a58Var.E1;
        mm mmVar = a58Var.U0;
        c40 c40Var = a58Var.C2;
        l48 l48Var = a58Var.A0;
        if (!a58Var.A1) {
            a58Var.e1.a.getImageReceiver().v0(true, true);
        }
        boolean z4 = a58Var.S2;
        y48 y48Var2 = this.w;
        if (z4) {
            canvas2.drawColor(on2.f(0.2f, -16777216, -1));
        } else {
            if (((jy) c40Var.e) != null || (e48Var != null && (((v6bVar = e48Var.b) != null && (v6bVar.x || v6bVar.s)) || e48Var.E.i))) {
                invalidate();
            }
            canvas2.save();
            pc8 pc8Var = a58Var.N2;
            if (pc8Var.n) {
                canvas2.save();
                float f6 = pc8Var.O;
                float f7 = pc8Var.A;
                float f8 = ((f6 * f7) + 1.0f) - f7;
                canvas2.scale(f8, f8, pc8Var.o + pc8Var.s, pc8Var.p + pc8Var.t);
                float f9 = pc8Var.o;
                float f10 = pc8Var.J;
                float f11 = pc8Var.A;
                canvas2.translate((f10 * f11) + f9, (pc8Var.K * f11) + pc8Var.p);
            }
            if (((jy) c40Var.e) != null) {
                if (c40Var.a || ((s96) c40Var.b) != null) {
                    if (!mmVar.B()) {
                        y48Var2.f.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight() + 1);
                        y48Var2.f.draw(canvas2);
                    }
                    mmVar.i0(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight() + 1);
                    mmVar.h(canvas2, null);
                    if (a58Var.A1) {
                        oab oabVar = this.x;
                        boolean z5 = oabVar.a;
                        if (z5 && (nabVar = (nab) c40Var.c) != null && nabVar.paused && nabVar.playerStubBitmap != null && nabVar.stubAvailable) {
                            canvas2.save();
                            canvas2.scale(getMeasuredWidth() / ((nab) c40Var.c).playerStubBitmap.getWidth(), getMeasuredHeight() / ((nab) c40Var.c).playerStubBitmap.getHeight());
                            nab nabVar2 = (nab) c40Var.c;
                            canvas2.drawBitmap(nabVar2.playerStubBitmap, 0.0f, 0.0f, nabVar2.playerStubPaint);
                            canvas2.restore();
                        } else {
                            boolean z6 = Build.VERSION.SDK_INT >= 29 && (nz4Var = a58Var.w3) != null && canvas2 == nz4Var.s;
                            if (!z5 || (a58Var.R0 && !oabVar.H0 && !z6)) {
                                ((jy) c40Var.e).draw(canvas2);
                            }
                        }
                    }
                    f5 = 0.0f;
                    canvas2.restore();
                    z3 = a58Var.O2;
                    ln lnVar2 = this.h;
                    lnVar = this.n;
                    if (z3) {
                        lnVar2.e(true, f5);
                        lnVar.e(true, f5);
                    }
                    if (z48Var.f) {
                        s96 s96Var = (s96) c40Var.b;
                        if (s96Var != null) {
                            if (!c40Var.a) {
                            }
                            E = true;
                        }
                        E = false;
                    } else if (z48Var.e) {
                        if (((jy) c40Var.e) != null) {
                            nab nabVar3 = (nab) c40Var.c;
                            if (nabVar3 != null) {
                                if (c40Var.a) {
                                    if (nabVar3.progress == 0.0f) {
                                        if (nabVar3 != null) {
                                            if (nabVar3.isBuffering()) {
                                            }
                                        }
                                    }
                                    E = true;
                                }
                            }
                        }
                        E = false;
                    } else {
                        E = mmVar.E();
                    }
                    lnVar2.e(false, (a58Var.A1 || E || z48Var.b != null) ? 0.0f : 1.0f);
                    lnVar.e(false, lnVar2.c == 1.0f ? 1.0f : 0.0f);
                    if (lnVar.c > 0.0f) {
                        RectF rectF = gm.P;
                        rectF.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                        int i = (int) (lnVar.c * 255.0f);
                        ef1 ef1Var = this.f;
                        ef1Var.a.setAlpha(i);
                        ef1Var.c.setAlpha(i);
                        ef1Var.f = getMeasuredWidth() << 1;
                        ef1Var.n = 1.3f;
                        ef1Var.a(gm.L(10.0f), canvas2, rectF, this);
                    }
                    a58Var.O2 = false;
                } else {
                    invalidate();
                }
            }
            if (z48Var.d) {
                canvas2.drawColor(on2.f(0.2f, -16777216, -1));
                f5 = 0.0f;
                canvas2.restore();
                z3 = a58Var.O2;
                ln lnVar22 = this.h;
                lnVar = this.n;
                if (z3) {
                }
                if (z48Var.f) {
                }
                lnVar22.e(false, (a58Var.A1 || E || z48Var.b != null) ? 0.0f : 1.0f);
                lnVar.e(false, lnVar22.c == 1.0f ? 1.0f : 0.0f);
                if (lnVar.c > 0.0f) {
                }
                a58Var.O2 = false;
            } else {
                if (!mmVar.B()) {
                    y48Var2.f.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight() + 1);
                    y48Var2.f.draw(canvas2);
                }
                f5 = 0.0f;
                mmVar.i0(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight() + 1);
                mmVar.h(canvas2, null);
                canvas2.restore();
                z3 = a58Var.O2;
                ln lnVar222 = this.h;
                lnVar = this.n;
                if (z3) {
                }
                if (z48Var.f) {
                }
                lnVar222.e(false, (a58Var.A1 || E || z48Var.b != null) ? 0.0f : 1.0f);
                lnVar.e(false, lnVar222.c == 1.0f ? 1.0f : 0.0f);
                if (lnVar.c > 0.0f) {
                }
                a58Var.O2 = false;
            }
        }
        if (l48Var.getAlpha() > 0.0f) {
            if (l48Var.getAlpha() == 1.0f) {
                canvas2.save();
                y48Var = y48Var2;
                z2 = false;
            } else {
                z2 = false;
                y48Var = y48Var2;
                canvas2.saveLayerAlpha(0.0f, 0.0f, l48Var.getMeasuredWidth(), l48Var.getMeasuredHeight(), (int) (l48Var.getAlpha() * 255.0f), 31);
            }
            e48Var.draw(canvas2);
            canvas2.restore();
            r15 = z2;
        } else {
            y48Var = y48Var2;
            r15 = 0;
        }
        if (!a58Var.P0 && mmVar.E()) {
            a58Var.P0 = true;
            a58Var.invalidate();
        }
        hideInterfaceAlpha = a58Var.getHideInterfaceAlpha();
        Drawable drawable = y48Var.d;
        Paint paint = y48Var.c;
        Drawable drawable2 = y48Var.e;
        drawable.setAlpha(nm7.d4);
        y48Var.d.draw(canvas2);
        if (a58Var.s1 || !a58Var.n2 || l48Var.getVisibility() == 0) {
            if (l48Var.getVisibility() == 0) {
                int L = gm.L(72.0f);
                int top = l48Var.getTop() + ((int) (l48Var.getTextTop() - gm.L(24.0f)));
                int i2 = L + top;
                float measuredHeight = getMeasuredHeight() * 0.65f;
                if ((measuredHeight - top) / gm.L(60.0f) > 0.0f && l48Var.w0 && l48Var.r0.getBottom() - l48Var.getMeasuredHeight() > 0) {
                    if ((measuredHeight - (l48Var.getTop() + ((int) (l48Var.getMaxTop() - gm.L(24.0f))))) / gm.L(60.0f) > 0.0f) {
                        a58Var.W2 = true;
                    }
                    f = 0.0f;
                } else if (a58Var.X2) {
                    a58Var.X2 = r15;
                    f = 0.0f;
                    if ((measuredHeight - (l48Var.getTop() + ((int) (l48Var.getMaxTop() - gm.L(24.0f))))) / gm.L(60.0f) > 0.0f) {
                        a58Var.W2 = true;
                    }
                } else {
                    f = 0.0f;
                    if (l48Var.getProgressToBlackout() == 0.0f) {
                        a58Var.W2 = r15;
                    }
                }
                float e = this.e.e(r15, a58Var.W2 ? 1.0f : f);
                if (e > f) {
                    this.r = true;
                    this.s = r15;
                    super.dispatchDraw(canvas);
                    this.r = r15;
                    b(canvas);
                    paint.setColor(on2.p(-16777216, (int) (153.0f * e * hideInterfaceAlpha)));
                    canvas2.drawPaint(paint);
                }
                if (e < 1.0f && !z48Var.f) {
                    canvas2.save();
                    float f12 = 1.0f - e;
                    paint.setColor(on2.p(-16777216, (int) (129.03f * f12 * hideInterfaceAlpha)));
                    drawable2.setAlpha((int) (f12 * 255.0f * hideInterfaceAlpha));
                    drawable2.setBounds(r15, top, getMeasuredWidth(), i2);
                    drawable2.draw(canvas2);
                    canvas2.drawRect(0.0f, i2, getMeasuredWidth(), getMeasuredHeight(), paint);
                    canvas.restore();
                }
                if (e <= f || l48Var.getAlpha() <= 0.0f) {
                    canvas2 = canvas;
                } else {
                    if (l48Var.t0) {
                        l48Var.t0 = r15;
                        l48Var.invalidate();
                    }
                    if (l48Var.getAlpha() != 1.0f) {
                        canvas2 = canvas;
                        canvas2.saveLayerAlpha(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), (int) (l48Var.getAlpha() * 255.0f), 31);
                    } else {
                        canvas2 = canvas;
                        canvas2.save();
                    }
                    canvas2.translate(l48Var.getX(), l48Var.getY() - l48Var.getScrollY());
                    l48Var.draw(canvas2);
                    canvas2.restore();
                }
                boolean z7 = e > f ? true : r15;
                if (l48Var.t0 != z7) {
                    l48Var.t0 = z7;
                    l48Var.invalidate();
                }
                if (e > f) {
                    this.r = true;
                    this.s = true;
                    super.dispatchDraw(canvas);
                    this.r = r15;
                }
                f2 = e;
                f3 = a58Var.c1;
                if (f3 != 0.0f || (o1aVar = a58Var.b1) == null) {
                    f4 = 1.0f;
                    z = true;
                } else {
                    float f13 = a58Var.q3;
                    int measuredWidth = getMeasuredWidth();
                    z = true;
                    int measuredHeight2 = getMeasuredHeight() + 1;
                    p1a p1aVar = o1aVar.f;
                    ImageReceiver imageReceiver = o1aVar.a;
                    imageReceiver.i0(0.0f, 0.0f, measuredWidth, measuredHeight2);
                    imageReceiver.setAlpha(f3);
                    imageReceiver.h(canvas2, null);
                    f4 = 1.0f;
                    imageReceiver.setAlpha(1.0f);
                    if (o1aVar.c != null) {
                        int i3 = (int) (f3 * 255.0f);
                        o1aVar.d.setAlpha(i3);
                        GradientDrawable gradientDrawable = p1aVar.I;
                        gradientDrawable.setAlpha(i3);
                        gradientDrawable.setBounds((int) imageReceiver.L0, (int) (imageReceiver.x() - (gm.L(24.0f) * f13)), (int) imageReceiver.w(), ((int) imageReceiver.x()) + 2);
                        gradientDrawable.draw(canvas2);
                        canvas2.save();
                        canvas2.scale(f13, f13, imageReceiver.r(), imageReceiver.x() - (gm.L(8.0f) * f13));
                        canvas2.translate(imageReceiver.r() - (p1aVar.K / 2.0f), (imageReceiver.x() - (gm.L(8.0f) * f13)) - o1aVar.c.getHeight());
                        o1aVar.c.draw(canvas2);
                        canvas2.restore();
                    }
                }
                this.d.e(r15, !a58Var.w2 ? f4 : 0.0f);
                if (a58Var.A1) {
                    boolean z8 = (l48Var.getVisibility() == 0 && (a58Var.W2 || l48Var.w0)) ? z : r15;
                    a58Var.Z2 = (l48Var.getVisibility() != 0 || l48Var.getProgressToBlackout() <= 0.0f) ? r15 : z;
                    oab oabVar2 = ((fab) a58Var.G1).d;
                    oabVar2.L0 = z8;
                    oabVar2.U();
                    ((fab) a58Var.G1).d.m1 = a58Var.Z2;
                }
                if (f2 <= 0.0f) {
                    super.dispatchDraw(canvas);
                    b(canvas);
                }
                kw3Var = a58Var.a1;
                if (kw3Var == null) {
                    kw3Var.e(canvas2);
                    return;
                }
                return;
            }
            if (!z48Var.f) {
                int L2 = gm.L(a58Var.n2 ? 56.0f : 110.0f);
                if ((a58Var.s1 || !a58Var.n2) && l48Var.getVisibility() == 0) {
                    L2 = (int) (L2 * 2.5f);
                }
                drawable2.setBounds(r15, g48Var.getMeasuredHeight() - L2, getMeasuredWidth(), g48Var.getMeasuredHeight());
                drawable2.setAlpha((int) (hideInterfaceAlpha * 255.0f));
                drawable2.draw(canvas2);
            }
        }
        f2 = 0.0f;
        f3 = a58Var.c1;
        if (f3 != 0.0f) {
        }
        f4 = 1.0f;
        z = true;
        this.d.e(r15, !a58Var.w2 ? f4 : 0.0f);
        if (a58Var.A1) {
        }
        if (f2 <= 0.0f) {
        }
        kw3Var = a58Var.a1;
        if (kw3Var == null) {
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        s96 s96Var;
        a58 a58Var = this.y;
        c40 c40Var = a58Var.C2;
        if (!a58Var.A1 || a58Var.S2 || ((jy) c40Var.e) == null || (s96Var = (s96) c40Var.b) == null || !s96Var.p() || !((jy) c40Var.e).dispatchTouchEvent(motionEvent)) {
            return super.dispatchTouchEvent(motionEvent);
        }
        return true;
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j) {
        if (view == this.y.Z0) {
            return true;
        }
        if (!this.r) {
            return super.drawChild(canvas, view, j);
        }
        u31 u31Var = u31.x;
        if (u31Var == null || view != u31Var.e) {
            return super.drawChild(canvas, view, j);
        }
        if (this.s) {
            return super.drawChild(canvas, view, j);
        }
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.y.a1.i();
        setTag(R.id.bulletin_delegate_tag, new s20(this, (byte) 13));
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        a58 a58Var = this.y;
        a58Var.a1.j();
        setTag(R.id.bulletin_delegate_tag, null);
        w48 w48Var = a58Var.G1;
        if (w48Var != null) {
            oab oabVar = ((fab) w48Var).d;
            oabVar.Y0 = false;
            oabVar.U();
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.y.o0.getLayoutParams();
        layoutParams.rightMargin = gm.L(42.0f);
        layoutParams.topMargin = gm.L(15.0f);
        super.onMeasure(i, i2);
    }
}
