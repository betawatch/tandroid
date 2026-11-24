// default package

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Build;
import android.view.MotionEvent;
import android.view.RoundedCorner;
import android.view.View;
import android.view.WindowInsets;
import android.widget.FrameLayout;
import java.util.WeakHashMap;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.ActionBar.a;
import org.telegram.ui.Components.ChatAttachAlertPhotoLayout;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class k02 extends cja {
    public int m0;
    public final RectF n0;
    public boolean o0;
    public float p0;
    public final j02 q0;
    public final /* synthetic */ x02 r0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k02(x02 x02Var, Context context) {
        super(context, null);
        this.r0 = x02Var;
        this.n0 = new RectF();
        this.q0 = new j02(this, this);
    }

    @Override // cja, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        float f;
        int L;
        int L2;
        float f2;
        float f3;
        float f4;
        int v0;
        float alpha;
        float f5;
        p02 p02Var;
        canvas.save();
        x02 x02Var = this.r0;
        p02 p02Var2 = x02Var.v2;
        m52 m52Var = x02Var.k2;
        if ((p02Var2 == m52Var || (p02Var = x02Var.w2) == m52Var || (p02Var2 == x02Var.d2 && p02Var == null)) && p02Var2 != null) {
            canvas.save();
            float f6 = x02Var.i4;
            boolean z = x02Var.a2;
            st stVar = x02Var.L2;
            wz1 wz1Var = x02Var.f3;
            canvas.translate(0.0f, f6);
            int alpha2 = (int) (p02Var2.getAlpha() * 255.0f);
            int j = p02Var2.j();
            int L3 = gl.L(13.0f) + ((int) ((wz1Var != null ? wz1Var.getAlpha() : 0.0f) * gl.L(26.0f))) + ((int) (stVar != null ? stVar.getAlpha() * stVar.getMeasuredHeight() : 0.0f));
            int X0 = (x02Var.X0(0) - x02Var.t0) - L3;
            if (x02Var.B0 == 1 || x02Var.q3 != null) {
                X0 = (int) (p02Var2.getTranslationY() + X0);
            }
            int L4 = gl.L(20.0f) + X0;
            getMeasuredHeight();
            int i = x02Var.t0;
            if (j != 0) {
                i = a.getCurrentActionBarHeight();
            }
            if (j != 2) {
                float f7 = L3;
                f = 1.0f;
                if (p02Var2 == x02Var.i2) {
                    L = gl.L(11.0f);
                } else {
                    if (p02Var2 == x02Var.g2) {
                        L2 = gl.L(3.0f);
                    } else if (p02Var2 == x02Var.h2) {
                        L2 = gl.L(3.0f);
                    } else {
                        L = gl.L(4.0f);
                    }
                    f2 = f7 - L2;
                    float alpha3 = x02Var.U2.getAlpha();
                    int i2 = (int) (((i - f2) + gl.m) * alpha3);
                    X0 -= i2;
                    L4 -= i2;
                    f3 = 1.0f - alpha3;
                }
                f2 = f7 + L;
                float alpha32 = x02Var.U2.getAlpha();
                int i22 = (int) (((i - f2) + gl.m) * alpha32);
                X0 -= i22;
                L4 -= i22;
                f3 = 1.0f - alpha32;
            } else if (X0 < i) {
                f3 = oo1.x(i - X0, x02Var.t0, 1.0f, 0.0f);
                f = 1.0f;
            } else {
                f3 = 1.0f;
                f = 1.0f;
            }
            if (!z) {
                int i3 = gl.m;
                X0 += i3;
                L4 += i3;
            }
            int customBackground = x02Var.v2.h() ? x02Var.v2.getCustomBackground() : x02Var.Y0(true);
            x02Var.s0.setAlpha(alpha2);
            x02Var.s0.setBounds(0, X0, getMeasuredWidth(), gl.L(45.0f) + getMeasuredHeight() + x02Var.t0);
            x02Var.s0.draw(canvas);
            RectF rectF = this.n0;
            if (j == 2) {
                bkb.s0.setColor(customBackground);
                bkb.s0.setAlpha(alpha2);
                f4 = 24.0f;
                rectF.set(x02Var.u0, x02Var.t0 + X0, getMeasuredWidth() - x02Var.u0, gl.L(24.0f) + x02Var.t0 + X0);
            } else {
                f4 = 24.0f;
            }
            if ((f3 != f && j != 2) || x02Var.v2.g()) {
                Paint paint = bkb.s0;
                if (x02Var.v2.g()) {
                    customBackground = x02Var.v2.getCustomActionBarBackground();
                }
                paint.setColor(customBackground);
                bkb.s0.setAlpha(alpha2);
                rectF.set(x02Var.u0, x02Var.t0 + X0, getMeasuredWidth() - x02Var.u0, gl.L(f4) + x02Var.t0 + X0);
            }
            if (x02Var.v2.g()) {
                bkb.s0.setColor(x02Var.v2.getCustomActionBarBackground());
                bkb.s0.setAlpha(alpha2);
                int X02 = x02Var.X0(0);
                if (!z) {
                    X02 += gl.m;
                }
                rectF.set(x02Var.u0, (gl.L(12.0f) + x02Var.t0 + X0) * f3, getMeasuredWidth() - x02Var.u0, gl.L(12.0f) + X02);
                canvas.save();
                canvas.drawRect(rectF, bkb.s0);
                canvas.restore();
            }
            if ((wz1Var == null || wz1Var.getAlpha() != f) && f3 != 0.0f) {
                int L5 = gl.L(36.0f);
                rectF.set((getMeasuredWidth() - L5) / 2, L4, (getMeasuredWidth() + L5) / 2, gl.L(4.0f) + L4);
                if (j == 2) {
                    v0 = TLObject.FLAG_29;
                    f5 = f3;
                } else if (x02Var.v2.g()) {
                    int customActionBarBackground = x02Var.v2.getCustomActionBarBackground();
                    v0 = bm2.f(0.5f, customActionBarBackground, bm2.h(customActionBarBackground) < 0.5d ? -1 : -16777216);
                    if (wz1Var != null) {
                        alpha = wz1Var.getAlpha();
                        f5 = f - alpha;
                    }
                    f5 = f;
                } else {
                    v0 = bkb.v0(bkb.yj, x02Var.J0);
                    if (wz1Var != null) {
                        alpha = wz1Var.getAlpha();
                        f5 = f - alpha;
                    }
                    f5 = f;
                }
                int alpha4 = Color.alpha(v0);
                bkb.s0.setColor(v0);
                bkb.s0.setAlpha((int) (p02Var2.getAlpha() * alpha4 * f5 * f3));
                canvas.drawRoundRect(rectF, gl.L(2.0f), gl.L(2.0f), bkb.s0);
            }
            canvas.restore();
        }
        super.dispatchDraw(canvas);
        canvas.restore();
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j) {
        float f;
        int L;
        int L2;
        float f2;
        float f3;
        int L3;
        int L4;
        float f4;
        float f5;
        float f6;
        boolean drawChild;
        int v0;
        float alpha;
        p02 p02Var;
        x02 x02Var = this.r0;
        boolean z = x02Var.a2;
        st stVar = x02Var.L2;
        il0 il0Var = x02Var.x2;
        wz1 wz1Var = x02Var.f3;
        x10 x10Var = x02Var.U2;
        if (!(view instanceof p02) || view.getAlpha() <= 0.0f) {
            if (view != x10Var) {
                if (!(view instanceof t14) || il0Var == null) {
                    return super.drawChild(canvas, view, j);
                }
                canvas.save();
                il0Var.setBounds(0, view.getTop(), getMeasuredWidth(), getMeasuredHeight());
                canvas.clipPath(il0Var.S.k);
                il0Var.draw(canvas);
                boolean drawChild2 = super.drawChild(canvas, view, j);
                canvas.restore();
                return drawChild2;
            }
            float alpha2 = x10Var.getAlpha();
            if (alpha2 <= 0.0f) {
                return false;
            }
            if (alpha2 >= 1.0f) {
                return super.drawChild(canvas, view, j);
            }
            canvas.save();
            float x = x10Var.getX();
            p02 p02Var2 = x02Var.v2;
            if (p02Var2 != null) {
                int j2 = p02Var2.j();
                int L5 = gl.L(13.0f) + ((int) ((wz1Var != null ? wz1Var.getAlpha() : 0.0f) * gl.L(26.0f))) + ((int) (stVar != null ? stVar.getAlpha() * stVar.getMeasuredHeight() : 0.0f));
                int X0 = (x02Var.X0(0) - x02Var.t0) - L5;
                if (x02Var.B0 == 1 || x02Var.q3 != null) {
                    X0 = (int) (p02Var2.getTranslationY() + X0);
                }
                int L6 = gl.L(20.0f) + X0;
                int currentActionBarHeight = j2 != 0 ? a.getCurrentActionBarHeight() : x02Var.t0;
                if (j2 != 2 && X0 + x02Var.t0 < currentActionBarHeight) {
                    float f7 = L5;
                    if (p02Var2 == x02Var.i2) {
                        L = gl.L(11.0f);
                    } else {
                        if (p02Var2 == x02Var.g2) {
                            L2 = gl.L(3.0f);
                        } else if (p02Var2 == x02Var.h2) {
                            L2 = gl.L(3.0f);
                        } else {
                            L = gl.L(4.0f);
                        }
                        f2 = f7 - L2;
                        L6 -= (int) (x10Var.getAlpha() * ((currentActionBarHeight - f2) + gl.m));
                    }
                    f2 = f7 + L;
                    L6 -= (int) (x10Var.getAlpha() * ((currentActionBarHeight - f2) + gl.m));
                }
                if (!z) {
                    L6 += gl.m;
                }
                f = L6;
            } else {
                f = 0.0f;
            }
            canvas.clipRect(x, f, x10Var.getX() + x10Var.getWidth(), x10Var.getY() + x10Var.getHeight());
            boolean drawChild3 = super.drawChild(canvas, view, j);
            canvas.restore();
            return drawChild3;
        }
        canvas.save();
        canvas.translate(0.0f, x02Var.i4);
        int alpha3 = (int) (view.getAlpha() * 255.0f);
        p02 p02Var3 = (p02) view;
        int j3 = p02Var3.j();
        int L7 = gl.L(13.0f) + (wz1Var != null ? gl.L(wz1Var.getAlpha() * 26.0f) : 0) + ((int) (stVar != null ? stVar.getAlpha() * stVar.getMeasuredHeight() : 0.0f));
        int X02 = (x02Var.X0(p02Var3 == x02Var.v2 ? 0 : 1) - x02Var.t0) - L7;
        if (x02Var.B0 == 1 || x02Var.q3 != null) {
            X02 = (int) (view.getTranslationY() + X02);
        }
        int L8 = gl.L(20.0f) + X02;
        int L9 = gl.L(45.0f) + getMeasuredHeight();
        int i = x02Var.t0;
        int i2 = L9 + i;
        if (j3 != 0) {
            i = a.getCurrentActionBarHeight();
        }
        if (j3 != 2) {
            f3 = 0.0f;
            if (x02Var.t0 + X02 < i) {
                float f8 = L7;
                if (p02Var3 == x02Var.i2) {
                    L3 = gl.L(11.0f);
                } else {
                    if (p02Var3 == x02Var.g2) {
                        L4 = gl.L(3.0f);
                    } else if (p02Var3 == x02Var.h2) {
                        L4 = gl.L(3.0f);
                    } else {
                        L3 = gl.L(4.0f);
                    }
                    f4 = f8 - L4;
                    float min = Math.min(1.0f, ((i - X02) - x02Var.t0) / f4);
                    int i3 = (int) ((i - f4) * min);
                    X02 -= i3;
                    L8 -= i3;
                    i2 += i3;
                    f5 = 1.0f - min;
                }
                f4 = f8 + L3;
                float min2 = Math.min(1.0f, ((i - X02) - x02Var.t0) / f4);
                int i32 = (int) ((i - f4) * min2);
                X02 -= i32;
                L8 -= i32;
                i2 += i32;
                f5 = 1.0f - min2;
            }
            f5 = 1.0f;
        } else if (X02 < i) {
            f5 = oo1.x(i - X02, x02Var.t0, 1.0f, 0.0f);
            f3 = 0.0f;
        } else {
            f3 = 0.0f;
            f5 = 1.0f;
        }
        if (!z) {
            int i4 = gl.m;
            X02 += i4;
            L8 += i4;
            i2 -= i4;
        }
        int i5 = i2;
        int customBackground = x02Var.v2.h() ? x02Var.v2.getCustomBackground() : x02Var.Y0(true);
        p02 p02Var4 = x02Var.v2;
        m52 m52Var = x02Var.k2;
        boolean z2 = (p02Var4 == m52Var || (p02Var = x02Var.w2) == m52Var || (p02Var4 == x02Var.d2 && p02Var == null)) ? false : true;
        RectF rectF = this.n0;
        if (z2) {
            x02Var.s0.setAlpha(alpha3);
            f6 = 24.0f;
            x02Var.s0.setBounds(0, X02, getMeasuredWidth(), i5);
            x02Var.s0.draw(canvas);
            if (j3 == 2) {
                bkb.s0.setColor(customBackground);
                bkb.s0.setAlpha(alpha3);
                rectF.set(x02Var.u0, x02Var.t0 + X02, getMeasuredWidth() - x02Var.u0, gl.L(24.0f) + x02Var.t0 + X02);
            }
        } else {
            f6 = 24.0f;
        }
        p02Var3.G(((x02Var.t0 + X02) - view.getTop()) - view.getTranslationY(), f5);
        if (view == x02Var.e2 || view == x02Var.m2 || view == x02Var.f2) {
            drawChild = super.drawChild(canvas, view, j);
        } else {
            canvas.save();
            drawChild = super.drawChild(canvas, view, j);
            canvas.restore();
        }
        if (z2) {
            if (f5 != 1.0f && j3 != 2) {
                bkb.s0.setColor(customBackground);
                bkb.s0.setAlpha(alpha3);
                rectF.set(x02Var.u0, x02Var.t0 + X02, getMeasuredWidth() - x02Var.u0, gl.L(f6) + x02Var.t0 + X02);
            }
            if ((wz1Var == null || wz1Var.getAlpha() != 1.0f) && f5 != f3) {
                int L10 = gl.L(36.0f);
                rectF.set((getMeasuredWidth() - L10) / 2, L8, (getMeasuredWidth() + L10) / 2, gl.L(4.0f) + L8);
                if (j3 == 2) {
                    v0 = TLObject.FLAG_29;
                    alpha = f5;
                } else {
                    v0 = bkb.v0(bkb.yj, x02Var.J0);
                    alpha = wz1Var == null ? 1.0f : 1.0f - wz1Var.getAlpha();
                }
                int alpha4 = Color.alpha(v0);
                bkb.s0.setColor(v0);
                bkb.s0.setAlpha((int) (view.getAlpha() * alpha4 * alpha * f5));
                canvas.drawRoundRect(rectF, gl.L(2.0f), gl.L(2.0f), bkb.s0);
            }
        }
        canvas.restore();
        return drawChild;
    }

    @Override // cja, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        j02 j02Var = this.q0;
        j02Var.b = this;
        j02Var.c();
        x02 x02Var = this.r0;
        x02Var.B2.setAdjustPanLayoutHelper(j02Var);
        x02Var.M2.setAdjustPanLayoutHelper(j02Var);
    }

    @Override // cja, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.q0.d();
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        x02 x02Var = this.r0;
        int[] iArr = x02Var.Y3;
        if (x02Var.v2.o(motionEvent)) {
            return true;
        }
        if (motionEvent.getAction() == 0) {
            if (iArr[0] != 0) {
                float y = motionEvent.getY();
                st stVar = x02Var.L2;
                int i = iArr[0] - (x02Var.t0 << 1);
                int L = gl.L(13.0f);
                wz1 wz1Var = x02Var.f3;
                int L2 = gl.L(20.0f) + ((i - (L + (wz1Var != null ? gl.L(wz1Var.getAlpha() * 26.0f) : 0))) - ((int) (stVar != null ? stVar.getAlpha() * stVar.getMeasuredHeight() : 0.0f)));
                if (!x02Var.a2) {
                    L2 += gl.m;
                }
                if (y < L2 && x02Var.U2.getAlpha() == 0.0f) {
                    x02Var.l0();
                    return true;
                }
            }
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    /* JADX WARN: Removed duplicated region for block: B:114:0x01a5  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x01b1  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x014e  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0167  */
    @Override // cja, android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        s42 s42Var;
        st stVar;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        zz1 zz1Var;
        b02 b02Var;
        k62 k62Var;
        k62 k62Var2;
        int i13;
        int max;
        int measuredHeight;
        int measuredHeight2;
        int emojiPadding;
        k02 k02Var = this;
        x02 x02Var = k02Var.r0;
        st stVar2 = x02Var.L2;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = x02Var.d2;
        int i14 = i3 - i;
        if (k02Var.m0 != i14) {
            k02Var.m0 = i14;
            bx1 bx1Var = x02Var.b2;
            if (bx1Var != null && !bx1Var.u0) {
                bx1Var.dismiss();
            }
        }
        int childCount = k02Var.getChildCount();
        if (Build.VERSION.SDK_INT >= 29) {
            x02Var.h4.set(i, i2, i3, i4);
            k02Var.setSystemGestureExclusionRects(x02Var.g4);
        }
        WeakHashMap weakHashMap = jdc.a;
        vxc a = cdc.a(k02Var);
        int i15 = 8;
        int i16 = a != null ? a.a.f(8).d : 0;
        int paddingBottom = k02Var.getPaddingBottom();
        if (!x02Var.d) {
            k62 k62Var3 = x02Var.g2;
            if (k62Var3 == null || x02Var.v2 != k62Var3 || k62Var3.F == null) {
                k62 k62Var4 = x02Var.h2;
                if (k62Var4 == null || x02Var.v2 != k62Var4 || k62Var4.F == null) {
                    if (i16 <= gl.L(20.0f) && !gl.E && !gl.O1()) {
                        emojiPadding = x02Var.U0().getEmojiPadding();
                        if (emojiPadding > 0) {
                            paddingBottom += emojiPadding;
                        }
                    }
                    emojiPadding = 0;
                    if (emojiPadding > 0) {
                    }
                } else {
                    if (i16 <= gl.L(20.0f) && !gl.E && !gl.O1()) {
                        emojiPadding = x02Var.h2.getEmojiPadding();
                        if (emojiPadding > 0) {
                        }
                    }
                    emojiPadding = 0;
                    if (emojiPadding > 0) {
                    }
                }
            } else {
                if (i16 <= gl.L(20.0f) && !gl.E && !gl.O1()) {
                    emojiPadding = x02Var.g2.getEmojiPadding();
                    if (emojiPadding > 0) {
                    }
                }
                emojiPadding = 0;
                if (emojiPadding > 0) {
                }
            }
        }
        k02Var.setBottomClip(paddingBottom);
        int i17 = 0;
        while (i17 < childCount) {
            View childAt = k02Var.getChildAt(i17);
            if (childAt.getVisibility() == i15) {
                stVar = stVar2;
                i5 = childCount;
                i6 = i14;
            } else {
                int i18 = gl.m;
                int max2 = i16 == 0 ? Math.max(gl.n, paddingBottom) : 0;
                if (childAt instanceof p02) {
                    p02 p02Var = (p02) childAt;
                    if (p02Var.h) {
                        i18 = 0;
                    }
                    if (p02Var.f) {
                        max2 = 0;
                    }
                }
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
                int measuredWidth = childAt.getMeasuredWidth();
                int measuredHeight3 = childAt.getMeasuredHeight();
                stVar = stVar2;
                int i19 = layoutParams.gravity;
                i5 = childCount;
                if (i19 == -1) {
                    i19 = 51;
                }
                int i20 = i19 & kk7.w1;
                int i21 = i19 & 7;
                i6 = i14;
                if (i21 == 1) {
                    i7 = ((i6 - measuredWidth) / 2) + layoutParams.leftMargin;
                    i8 = layoutParams.rightMargin;
                } else if (i21 != 5) {
                    i9 = getPaddingLeft() + layoutParams.leftMargin;
                    if (i20 == 16) {
                        if (i20 == 48) {
                            i12 = layoutParams.topMargin + i18;
                        } else if (i20 != 80) {
                            i12 = layoutParams.topMargin;
                        } else {
                            i10 = tb4.f(i4, max2, i2, measuredHeight3);
                            i11 = layoutParams.bottomMargin;
                        }
                        if (childAt != x02Var.U2 || childAt == x02Var.s3) {
                            i12 = 0;
                        }
                        zz1Var = x02Var.B2;
                        if ((zz1Var == null && zz1Var.l(childAt)) || (((b02Var = x02Var.M2) != null && b02Var.l(childAt)) || (((k62Var = x02Var.g2) != null && childAt == k62Var.F) || ((k62Var2 = x02Var.h2) != null && childAt == k62Var2.F)))) {
                            if (gl.O1()) {
                                measuredHeight = getMeasuredHeight();
                                measuredHeight2 = childAt.getMeasuredHeight();
                            } else {
                                measuredHeight = getMeasuredHeight() + i16;
                                measuredHeight2 = childAt.getMeasuredHeight();
                            }
                            i12 = measuredHeight - measuredHeight2;
                        } else if (childAt == x02Var.B4) {
                            if (x02Var.W1) {
                                i13 = gl.m;
                                max = a.getCurrentActionBarHeight();
                                i12 = i13 + max;
                            }
                        } else if (childAt == x02Var.t3) {
                            i13 = i12 + gl.n;
                            max = Math.max(i16, x02Var.W0());
                            i12 = i13 + max;
                        }
                        childAt.layout(i9, i12, measuredWidth + i9, measuredHeight3 + i12);
                    } else {
                        i10 = ((((i4 - max2) - i2) - measuredHeight3) / 2) + layoutParams.topMargin;
                        i11 = layoutParams.bottomMargin;
                    }
                    i12 = i10 - i11;
                    if (childAt != x02Var.U2) {
                    }
                    i12 = 0;
                    zz1Var = x02Var.B2;
                    if (zz1Var == null) {
                    }
                    if (childAt == x02Var.B4) {
                    }
                } else {
                    i7 = ((i6 - measuredWidth) - layoutParams.rightMargin) - getPaddingRight();
                    i8 = x02Var.u0;
                }
                i9 = i7 - i8;
                if (i20 == 16) {
                }
                i12 = i10 - i11;
                if (childAt != x02Var.U2) {
                }
                i12 = 0;
                zz1Var = x02Var.B2;
                if (zz1Var == null) {
                }
                if (childAt == x02Var.B4) {
                }
            }
            i17++;
            k02Var = this;
            stVar2 = stVar;
            childCount = i5;
            i14 = i6;
            i15 = 8;
        }
        st stVar3 = stVar2;
        R();
        x02Var.H1(x02Var.v2, 0);
        x02Var.H1(x02Var.w2, 0);
        if (x02Var.W1) {
            x02Var.E1();
        }
        if (chatAttachAlertPhotoLayout == null || (s42Var = chatAttachAlertPhotoLayout.F) == null || s42Var.getFastScroll() == null) {
            return;
        }
        chatAttachAlertPhotoLayout.F.getFastScroll().i0 = a.getCurrentActionBarHeight() + chatAttachAlertPhotoLayout.q1 + (x02Var.W1 ? (int) (stVar3.getAlpha() * stVar3.getMeasuredHeight()) : 0);
        chatAttachAlertPhotoLayout.F.getFastScroll().invalidate();
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        int i3;
        k62 k62Var;
        k62 k62Var2;
        int W0;
        k02 k02Var = this;
        x02 x02Var = k02Var.r0;
        r7 r7Var = x02Var.X2;
        boolean z = x02Var.a2;
        int size = k02Var.getLayoutParams().height > 0 ? k02Var.getLayoutParams().height : View.MeasureSpec.getSize(i2);
        if (!z) {
            k02Var.o0 = true;
            int i4 = x02Var.u0;
            k02Var.setPadding(i4, 0, i4, 0);
            k02Var.o0 = false;
        }
        int size2 = View.MeasureSpec.getSize(i) - (x02Var.u0 << 1);
        if (gl.O1()) {
            r7Var.setAdditionalYOffset(-gl.L(3.0f));
        } else {
            Point point = gl.q;
            if (point.x > point.y) {
                r7Var.setAdditionalYOffset(0);
            } else {
                r7Var.setAdditionalYOffset(-gl.L(3.0f));
            }
        }
        ((FrameLayout.LayoutParams) x02Var.c3.getLayoutParams()).height = a.getCurrentActionBarHeight();
        k02Var.o0 = true;
        int min = (int) (size2 / Math.min(4.5f, x02Var.x3.b()));
        if (x02Var.V3 != min) {
            x02Var.V3 = min;
            gl.d3(new hq1(k02Var, (byte) 13));
        }
        k02Var.o0 = false;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30);
        int size3 = View.MeasureSpec.getSize(i);
        int size4 = View.MeasureSpec.getSize(makeMeasureSpec);
        k02Var.setMeasuredDimension(size3, size4);
        int i5 = x02Var.u0;
        b02 b02Var = x02Var.M2;
        zz1 zz1Var = x02Var.B2;
        int i6 = size3 - (i5 << 1);
        if (!zz1Var.O && gl.L(20.0f) >= 0 && !zz1Var.e && !zz1Var.P) {
            k02Var.o0 = true;
            zz1Var.j();
            k02Var.o0 = false;
        }
        if (!b02Var.O && gl.L(20.0f) >= 0 && !b02Var.e && !b02Var.P) {
            k02Var.o0 = true;
            b02Var.j();
            k02Var.o0 = false;
        }
        if (x02Var.g2 != null && gl.L(20.0f) >= 0) {
            k62 k62Var3 = x02Var.g2;
            if (!k62Var3.H && !k62Var3.b1 && !k62Var3.g1 && !k62Var3.i1) {
                k02Var.o0 = true;
                k62Var3.a0();
                k02Var.o0 = false;
            }
        }
        if (x02Var.h2 != null && gl.L(20.0f) >= 0) {
            k62 k62Var4 = x02Var.h2;
            if (!k62Var4.H && !k62Var4.b1 && !k62Var4.g1 && !k62Var4.i1) {
                k02Var.o0 = true;
                k62Var4.a0();
                k02Var.o0 = false;
            }
        }
        if (gl.L(20.0f) >= 0) {
            if (x02Var.d) {
                p02 p02Var = x02Var.v2;
                k62 k62Var5 = x02Var.g2;
                if (p02Var == k62Var5 && k62Var5.F != null && k62Var5.i1) {
                    W0 = gl.L(120.0f);
                } else {
                    k62 k62Var6 = x02Var.h2;
                    W0 = (p02Var == k62Var6 && k62Var6.F != null && k62Var6.i1) ? gl.L(120.0f) : 0;
                }
            } else {
                W0 = x02Var.W0();
            }
            WeakHashMap weakHashMap = jdc.a;
            vxc a = cdc.a(k02Var);
            int i7 = a != null ? a.a.f(8).d : 0;
            vxc a2 = cdc.a(k02Var);
            if (a2 != null) {
                int i8 = a2.a.f(527).d;
            }
            int max = Math.max(i7 > 0 ? 0 : gl.n, W0);
            k02Var.o0 = true;
            p02 p02Var2 = x02Var.v2;
            if (p02Var2.f) {
                p02Var2.e = gl.L(62.0f) + max;
                x02Var.v2.C(i6, size4);
            } else {
                p02Var2.e = gl.n;
                p02Var2.C(i6, size4 - W0);
            }
            p02 p02Var3 = x02Var.w2;
            if (p02Var3 != null) {
                if (p02Var3.f) {
                    p02Var3.e = gl.L(62.0f) + max;
                    x02Var.w2.C(i6, size4);
                } else {
                    p02Var3.e = gl.n;
                    p02Var3.C(i6, size4 - W0);
                }
            }
            k02Var.o0 = false;
        }
        int childCount = k02Var.getChildCount();
        int i9 = 0;
        while (i9 < childCount) {
            int i10 = i9;
            View childAt = k02Var.getChildAt(i10);
            if (childAt == null || childAt.getVisibility() == 8) {
                i3 = i10;
            } else if (childAt == x02Var.s3) {
                i3 = i10;
                k02Var.measureChildWithMargins(childAt, i, 0, makeMeasureSpec, 0);
            } else {
                i3 = i10;
                int i11 = gl.m;
                int i12 = gl.n;
                if (childAt instanceof p02) {
                    p02 p02Var4 = (p02) childAt;
                    if (p02Var4.h) {
                        i11 = 0;
                    }
                    if (p02Var4.f) {
                        i12 = 0;
                    }
                }
                if (!zz1Var.l(childAt) && !b02Var.l(childAt) && (((k62Var = x02Var.g2) == null || childAt != k62Var.F) && ((k62Var2 = x02Var.h2) == null || childAt != k62Var2.F))) {
                    measureChildWithMargins(childAt, i, 0, makeMeasureSpec, i11 + i12);
                } else if (z) {
                    childAt.measure(View.MeasureSpec.makeMeasureSpec(i6, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(getPaddingTop() + size4, TLObject.FLAG_30));
                } else if (!gl.E && !gl.O1()) {
                    childAt.measure(View.MeasureSpec.makeMeasureSpec(i6, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(childAt.getLayoutParams().height, TLObject.FLAG_30));
                } else if (gl.O1()) {
                    childAt.measure(View.MeasureSpec.makeMeasureSpec(i6, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(Math.min(gl.L(gl.O1() ? 200.0f : 320.0f), getPaddingTop() + (size4 - gl.m)), TLObject.FLAG_30));
                } else {
                    childAt.measure(View.MeasureSpec.makeMeasureSpec(i6, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(getPaddingTop() + (size4 - gl.m), TLObject.FLAG_30));
                }
            }
            i9 = i3 + 1;
            k02Var = this;
        }
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        int i5;
        WindowInsets rootWindowInsets;
        super.onSizeChanged(i, i2, i3, i4);
        int i6 = 0;
        if (Build.VERSION.SDK_INT < 31 || (rootWindowInsets = getRootWindowInsets()) == null) {
            i5 = 0;
        } else {
            RoundedCorner roundedCorner = rootWindowInsets.getRoundedCorner(3);
            RoundedCorner roundedCorner2 = rootWindowInsets.getRoundedCorner(2);
            i5 = roundedCorner == null ? 0 : roundedCorner.getRadius();
            if (roundedCorner2 != null) {
                i6 = roundedCorner2.getRadius();
            }
        }
        il0 il0Var = this.r0.x2;
        if (il0Var != null) {
            il0Var.t(gl.L(29.0f), gl.L(29.0f), i6, i5, true);
        }
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        x02 x02Var = this.r0;
        if (x02Var.v2.o(motionEvent)) {
            return true;
        }
        return !x02Var.J && super.onTouchEvent(motionEvent);
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        if (this.o0) {
            return;
        }
        super.requestLayout();
    }

    @Override // android.view.View
    public final void setTranslationY(float f) {
        x02 x02Var = this.r0;
        wz1 wz1Var = x02Var.u3;
        float f2 = f + x02Var.i4;
        byte b = x02Var.B0;
        if (b == 0) {
            this.p0 = f2;
        }
        if (b == 1) {
            p02 p02Var = x02Var.v2;
            if (f2 < 0.0f) {
                p02Var.setTranslationY(f2);
                if (x02Var.N2 != 0 || x02Var.Q2) {
                    x02Var.f3.setTranslationY((x02Var.m3 + f2) - x02Var.i4);
                }
                wz1Var.setTranslationY(0.0f);
                f2 = 0.0f;
            } else {
                p02Var.setTranslationY(0.0f);
                wz1Var.setTranslationY(((f2 / this.p0) * wz1Var.getMeasuredHeight()) + (-f2));
            }
            x02Var.b.invalidate();
        }
        super.setTranslationY((f2 - x02Var.i4) + x02Var.s2);
        if (x02Var.B0 != 1) {
            x02Var.v2.m(x02Var.i4);
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
    }

    @Override // cja
    public final void H(Canvas canvas, float f, Rect rect, Paint paint, boolean z) {
    }
}
