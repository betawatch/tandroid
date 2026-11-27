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

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final class a12 extends wma {
    public int g0;
    public final RectF h0;
    public boolean i0;
    public float j0;
    public final z02 k0;
    public final /* synthetic */ n12 l0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a12(n12 n12Var, Context context) {
        super(context, null);
        this.l0 = n12Var;
        this.h0 = new RectF();
        this.k0 = new z02(this, this);
    }

    @Override // wma, android.view.ViewGroup, android.view.View
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
        f12 f12Var;
        canvas.save();
        n12 n12Var = this.l0;
        f12 f12Var2 = n12Var.v2;
        c62 c62Var = n12Var.k2;
        if ((f12Var2 == c62Var || (f12Var = n12Var.w2) == c62Var || (f12Var2 == n12Var.d2 && f12Var == null)) && f12Var2 != null) {
            canvas.save();
            float f6 = n12Var.i4;
            boolean z = n12Var.a2;
            tt ttVar = n12Var.L2;
            m02 m02Var = n12Var.f3;
            canvas.translate(0.0f, f6);
            int alpha2 = (int) (f12Var2.getAlpha() * 255.0f);
            int j = f12Var2.j();
            int L3 = hl.L(13.0f) + ((int) ((m02Var != null ? m02Var.getAlpha() : 0.0f) * hl.L(26.0f))) + ((int) (ttVar != null ? ttVar.getAlpha() * ttVar.getMeasuredHeight() : 0.0f));
            int Y0 = (n12Var.Y0(0) - n12Var.t0) - L3;
            if (n12Var.B0 == 1 || n12Var.q3 != null) {
                Y0 = (int) (f12Var2.getTranslationY() + Y0);
            }
            int L4 = hl.L(20.0f) + Y0;
            getMeasuredHeight();
            int i = n12Var.t0;
            if (j != 0) {
                i = a.getCurrentActionBarHeight();
            }
            if (j != 2) {
                float f7 = L3;
                f = 1.0f;
                if (f12Var2 == n12Var.i2) {
                    L = hl.L(11.0f);
                } else {
                    if (f12Var2 == n12Var.g2) {
                        L2 = hl.L(3.0f);
                    } else if (f12Var2 == n12Var.h2) {
                        L2 = hl.L(3.0f);
                    } else {
                        L = hl.L(4.0f);
                    }
                    f2 = f7 - L2;
                    float alpha3 = n12Var.U2.getAlpha();
                    int i2 = (int) (((i - f2) + hl.m) * alpha3);
                    Y0 -= i2;
                    L4 -= i2;
                    f3 = 1.0f - alpha3;
                }
                f2 = f7 + L;
                float alpha32 = n12Var.U2.getAlpha();
                int i22 = (int) (((i - f2) + hl.m) * alpha32);
                Y0 -= i22;
                L4 -= i22;
                f3 = 1.0f - alpha32;
            } else if (Y0 < i) {
                f3 = bp1.x(i - Y0, n12Var.t0, 1.0f, 0.0f);
                f = 1.0f;
            } else {
                f3 = 1.0f;
                f = 1.0f;
            }
            if (!z) {
                int i3 = hl.m;
                Y0 += i3;
                L4 += i3;
            }
            int customBackground = n12Var.v2.h() ? n12Var.v2.getCustomBackground() : n12Var.Z0(true);
            n12Var.s0.setAlpha(alpha2);
            n12Var.s0.setBounds(0, Y0, getMeasuredWidth(), hl.L(45.0f) + getMeasuredHeight() + n12Var.t0);
            n12Var.s0.draw(canvas);
            RectF rectF = this.h0;
            if (j == 2) {
                aob.s0.setColor(customBackground);
                aob.s0.setAlpha(alpha2);
                f4 = 24.0f;
                rectF.set(n12Var.u0, n12Var.t0 + Y0, getMeasuredWidth() - n12Var.u0, hl.L(24.0f) + n12Var.t0 + Y0);
            } else {
                f4 = 24.0f;
            }
            if ((f3 != f && j != 2) || n12Var.v2.g()) {
                Paint paint = aob.s0;
                if (n12Var.v2.g()) {
                    customBackground = n12Var.v2.getCustomActionBarBackground();
                }
                paint.setColor(customBackground);
                aob.s0.setAlpha(alpha2);
                rectF.set(n12Var.u0, n12Var.t0 + Y0, getMeasuredWidth() - n12Var.u0, hl.L(f4) + n12Var.t0 + Y0);
            }
            if (n12Var.v2.g()) {
                aob.s0.setColor(n12Var.v2.getCustomActionBarBackground());
                aob.s0.setAlpha(alpha2);
                int Y02 = n12Var.Y0(0);
                if (!z) {
                    Y02 += hl.m;
                }
                rectF.set(n12Var.u0, (hl.L(12.0f) + n12Var.t0 + Y0) * f3, getMeasuredWidth() - n12Var.u0, hl.L(12.0f) + Y02);
                canvas.save();
                canvas.drawRect(rectF, aob.s0);
                canvas.restore();
            }
            if ((m02Var == null || m02Var.getAlpha() != f) && f3 != 0.0f) {
                int L5 = hl.L(36.0f);
                rectF.set((getMeasuredWidth() - L5) / 2, L4, (getMeasuredWidth() + L5) / 2, hl.L(4.0f) + L4);
                if (j == 2) {
                    v0 = TLObject.FLAG_29;
                    f5 = f3;
                } else if (n12Var.v2.g()) {
                    int customActionBarBackground = n12Var.v2.getCustomActionBarBackground();
                    v0 = vm2.f(0.5f, customActionBarBackground, vm2.h(customActionBarBackground) < 0.5d ? -1 : -16777216);
                    if (m02Var != null) {
                        alpha = m02Var.getAlpha();
                        f5 = f - alpha;
                    }
                    f5 = f;
                } else {
                    v0 = aob.v0(aob.zj, n12Var.J0);
                    if (m02Var != null) {
                        alpha = m02Var.getAlpha();
                        f5 = f - alpha;
                    }
                    f5 = f;
                }
                int alpha4 = Color.alpha(v0);
                aob.s0.setColor(v0);
                aob.s0.setAlpha((int) (f12Var2.getAlpha() * alpha4 * f5 * f3));
                canvas.drawRoundRect(rectF, hl.L(2.0f), hl.L(2.0f), aob.s0);
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
        f12 f12Var;
        n12 n12Var = this.l0;
        boolean z = n12Var.a2;
        tt ttVar = n12Var.L2;
        jl0 jl0Var = n12Var.x2;
        m02 m02Var = n12Var.f3;
        y10 y10Var = n12Var.U2;
        if (!(view instanceof f12) || view.getAlpha() <= 0.0f) {
            if (view != y10Var) {
                if (!(view instanceof o24) || jl0Var == null) {
                    return super.drawChild(canvas, view, j);
                }
                canvas.save();
                jl0Var.setBounds(0, view.getTop(), getMeasuredWidth(), getMeasuredHeight());
                canvas.clipPath(jl0Var.S.k);
                jl0Var.draw(canvas);
                boolean drawChild2 = super.drawChild(canvas, view, j);
                canvas.restore();
                return drawChild2;
            }
            float alpha2 = y10Var.getAlpha();
            if (alpha2 <= 0.0f) {
                return false;
            }
            if (alpha2 >= 1.0f) {
                return super.drawChild(canvas, view, j);
            }
            canvas.save();
            float x = y10Var.getX();
            f12 f12Var2 = n12Var.v2;
            if (f12Var2 != null) {
                int j2 = f12Var2.j();
                int L5 = hl.L(13.0f) + ((int) ((m02Var != null ? m02Var.getAlpha() : 0.0f) * hl.L(26.0f))) + ((int) (ttVar != null ? ttVar.getAlpha() * ttVar.getMeasuredHeight() : 0.0f));
                int Y0 = (n12Var.Y0(0) - n12Var.t0) - L5;
                if (n12Var.B0 == 1 || n12Var.q3 != null) {
                    Y0 = (int) (f12Var2.getTranslationY() + Y0);
                }
                int L6 = hl.L(20.0f) + Y0;
                int currentActionBarHeight = j2 != 0 ? a.getCurrentActionBarHeight() : n12Var.t0;
                if (j2 != 2 && Y0 + n12Var.t0 < currentActionBarHeight) {
                    float f7 = L5;
                    if (f12Var2 == n12Var.i2) {
                        L = hl.L(11.0f);
                    } else {
                        if (f12Var2 == n12Var.g2) {
                            L2 = hl.L(3.0f);
                        } else if (f12Var2 == n12Var.h2) {
                            L2 = hl.L(3.0f);
                        } else {
                            L = hl.L(4.0f);
                        }
                        f2 = f7 - L2;
                        L6 -= (int) (y10Var.getAlpha() * ((currentActionBarHeight - f2) + hl.m));
                    }
                    f2 = f7 + L;
                    L6 -= (int) (y10Var.getAlpha() * ((currentActionBarHeight - f2) + hl.m));
                }
                if (!z) {
                    L6 += hl.m;
                }
                f = L6;
            } else {
                f = 0.0f;
            }
            canvas.clipRect(x, f, y10Var.getX() + y10Var.getWidth(), y10Var.getY() + y10Var.getHeight());
            boolean drawChild3 = super.drawChild(canvas, view, j);
            canvas.restore();
            return drawChild3;
        }
        canvas.save();
        canvas.translate(0.0f, n12Var.i4);
        int alpha3 = (int) (view.getAlpha() * 255.0f);
        f12 f12Var3 = (f12) view;
        int j3 = f12Var3.j();
        int L7 = hl.L(13.0f) + (m02Var != null ? hl.L(m02Var.getAlpha() * 26.0f) : 0) + ((int) (ttVar != null ? ttVar.getAlpha() * ttVar.getMeasuredHeight() : 0.0f));
        int Y02 = (n12Var.Y0(f12Var3 == n12Var.v2 ? 0 : 1) - n12Var.t0) - L7;
        if (n12Var.B0 == 1 || n12Var.q3 != null) {
            Y02 = (int) (view.getTranslationY() + Y02);
        }
        int L8 = hl.L(20.0f) + Y02;
        int L9 = hl.L(45.0f) + getMeasuredHeight();
        int i = n12Var.t0;
        int i2 = L9 + i;
        if (j3 != 0) {
            i = a.getCurrentActionBarHeight();
        }
        if (j3 != 2) {
            f3 = 0.0f;
            if (n12Var.t0 + Y02 < i) {
                float f8 = L7;
                if (f12Var3 == n12Var.i2) {
                    L3 = hl.L(11.0f);
                } else {
                    if (f12Var3 == n12Var.g2) {
                        L4 = hl.L(3.0f);
                    } else if (f12Var3 == n12Var.h2) {
                        L4 = hl.L(3.0f);
                    } else {
                        L3 = hl.L(4.0f);
                    }
                    f4 = f8 - L4;
                    float min = Math.min(1.0f, ((i - Y02) - n12Var.t0) / f4);
                    int i3 = (int) ((i - f4) * min);
                    Y02 -= i3;
                    L8 -= i3;
                    i2 += i3;
                    f5 = 1.0f - min;
                }
                f4 = f8 + L3;
                float min2 = Math.min(1.0f, ((i - Y02) - n12Var.t0) / f4);
                int i32 = (int) ((i - f4) * min2);
                Y02 -= i32;
                L8 -= i32;
                i2 += i32;
                f5 = 1.0f - min2;
            }
            f5 = 1.0f;
        } else if (Y02 < i) {
            f5 = bp1.x(i - Y02, n12Var.t0, 1.0f, 0.0f);
            f3 = 0.0f;
        } else {
            f3 = 0.0f;
            f5 = 1.0f;
        }
        if (!z) {
            int i4 = hl.m;
            Y02 += i4;
            L8 += i4;
            i2 -= i4;
        }
        int i5 = i2;
        int customBackground = n12Var.v2.h() ? n12Var.v2.getCustomBackground() : n12Var.Z0(true);
        f12 f12Var4 = n12Var.v2;
        c62 c62Var = n12Var.k2;
        boolean z2 = (f12Var4 == c62Var || (f12Var = n12Var.w2) == c62Var || (f12Var4 == n12Var.d2 && f12Var == null)) ? false : true;
        RectF rectF = this.h0;
        if (z2) {
            n12Var.s0.setAlpha(alpha3);
            f6 = 24.0f;
            n12Var.s0.setBounds(0, Y02, getMeasuredWidth(), i5);
            n12Var.s0.draw(canvas);
            if (j3 == 2) {
                aob.s0.setColor(customBackground);
                aob.s0.setAlpha(alpha3);
                rectF.set(n12Var.u0, n12Var.t0 + Y02, getMeasuredWidth() - n12Var.u0, hl.L(24.0f) + n12Var.t0 + Y02);
            }
        } else {
            f6 = 24.0f;
        }
        f12Var3.F(((n12Var.t0 + Y02) - view.getTop()) - view.getTranslationY(), f5);
        if (view == n12Var.e2 || view == n12Var.m2 || view == n12Var.f2) {
            drawChild = super.drawChild(canvas, view, j);
        } else {
            canvas.save();
            drawChild = super.drawChild(canvas, view, j);
            canvas.restore();
        }
        if (z2) {
            if (f5 != 1.0f && j3 != 2) {
                aob.s0.setColor(customBackground);
                aob.s0.setAlpha(alpha3);
                rectF.set(n12Var.u0, n12Var.t0 + Y02, getMeasuredWidth() - n12Var.u0, hl.L(f6) + n12Var.t0 + Y02);
            }
            if ((m02Var == null || m02Var.getAlpha() != 1.0f) && f5 != f3) {
                int L10 = hl.L(36.0f);
                rectF.set((getMeasuredWidth() - L10) / 2, L8, (getMeasuredWidth() + L10) / 2, hl.L(4.0f) + L8);
                if (j3 == 2) {
                    v0 = TLObject.FLAG_29;
                    alpha = f5;
                } else {
                    v0 = aob.v0(aob.zj, n12Var.J0);
                    alpha = m02Var == null ? 1.0f : 1.0f - m02Var.getAlpha();
                }
                int alpha4 = Color.alpha(v0);
                aob.s0.setColor(v0);
                aob.s0.setAlpha((int) (view.getAlpha() * alpha4 * alpha * f5));
                canvas.drawRoundRect(rectF, hl.L(2.0f), hl.L(2.0f), aob.s0);
            }
        }
        canvas.restore();
        return drawChild;
    }

    @Override // wma, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        z02 z02Var = this.k0;
        z02Var.b = this;
        z02Var.c();
        n12 n12Var = this.l0;
        n12Var.B2.setAdjustPanLayoutHelper(z02Var);
        n12Var.M2.setAdjustPanLayoutHelper(z02Var);
    }

    @Override // wma, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.k0.d();
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        n12 n12Var = this.l0;
        int[] iArr = n12Var.Y3;
        if (n12Var.v2.o(motionEvent)) {
            return true;
        }
        if (motionEvent.getAction() == 0) {
            if (iArr[0] != 0) {
                float y = motionEvent.getY();
                tt ttVar = n12Var.L2;
                int i = iArr[0] - (n12Var.t0 << 1);
                int L = hl.L(13.0f);
                m02 m02Var = n12Var.f3;
                int L2 = hl.L(20.0f) + ((i - (L + (m02Var != null ? hl.L(m02Var.getAlpha() * 26.0f) : 0))) - ((int) (ttVar != null ? ttVar.getAlpha() * ttVar.getMeasuredHeight() : 0.0f)));
                if (!n12Var.a2) {
                    L2 += hl.m;
                }
                if (y < L2 && n12Var.U2.getAlpha() == 0.0f) {
                    n12Var.l0();
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
    @Override // wma, android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        i52 i52Var;
        tt ttVar;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        p02 p02Var;
        r02 r02Var;
        a72 a72Var;
        a72 a72Var2;
        int i13;
        int max;
        int measuredHeight;
        int measuredHeight2;
        int emojiPadding;
        a12 a12Var = this;
        n12 n12Var = a12Var.l0;
        tt ttVar2 = n12Var.L2;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = n12Var.d2;
        int i14 = i3 - i;
        if (a12Var.g0 != i14) {
            a12Var.g0 = i14;
            ox1 ox1Var = n12Var.b2;
            if (ox1Var != null && !ox1Var.u0) {
                ox1Var.dismiss();
            }
        }
        int childCount = a12Var.getChildCount();
        if (Build.VERSION.SDK_INT >= 29) {
            n12Var.h4.set(i, i2, i3, i4);
            a12Var.setSystemGestureExclusionRects(n12Var.g4);
        }
        WeakHashMap weakHashMap = ihc.a;
        l2d a = bhc.a(a12Var);
        int i15 = 8;
        int i16 = a != null ? a.a.f(8).d : 0;
        int paddingBottom = a12Var.getPaddingBottom();
        if (!n12Var.d) {
            a72 a72Var3 = n12Var.g2;
            if (a72Var3 == null || n12Var.v2 != a72Var3 || a72Var3.F == null) {
                a72 a72Var4 = n12Var.h2;
                if (a72Var4 == null || n12Var.v2 != a72Var4 || a72Var4.F == null) {
                    if (i16 <= hl.L(20.0f) && !hl.E && !hl.O1()) {
                        emojiPadding = n12Var.V0().getEmojiPadding();
                        if (emojiPadding > 0) {
                            paddingBottom += emojiPadding;
                        }
                    }
                    emojiPadding = 0;
                    if (emojiPadding > 0) {
                    }
                } else {
                    if (i16 <= hl.L(20.0f) && !hl.E && !hl.O1()) {
                        emojiPadding = n12Var.h2.getEmojiPadding();
                        if (emojiPadding > 0) {
                        }
                    }
                    emojiPadding = 0;
                    if (emojiPadding > 0) {
                    }
                }
            } else {
                if (i16 <= hl.L(20.0f) && !hl.E && !hl.O1()) {
                    emojiPadding = n12Var.g2.getEmojiPadding();
                    if (emojiPadding > 0) {
                    }
                }
                emojiPadding = 0;
                if (emojiPadding > 0) {
                }
            }
        }
        a12Var.setBottomClip(paddingBottom);
        int i17 = 0;
        while (i17 < childCount) {
            View childAt = a12Var.getChildAt(i17);
            if (childAt.getVisibility() == i15) {
                ttVar = ttVar2;
                i5 = childCount;
                i6 = i14;
            } else {
                int i18 = hl.m;
                int max2 = i16 == 0 ? Math.max(hl.n, paddingBottom) : 0;
                if (childAt instanceof f12) {
                    f12 f12Var = (f12) childAt;
                    if (f12Var.h) {
                        i18 = 0;
                    }
                    if (f12Var.f) {
                        max2 = 0;
                    }
                }
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
                int measuredWidth = childAt.getMeasuredWidth();
                int measuredHeight3 = childAt.getMeasuredHeight();
                ttVar = ttVar2;
                int i19 = layoutParams.gravity;
                i5 = childCount;
                if (i19 == -1) {
                    i19 = 51;
                }
                int i20 = i19 & jn7.w1;
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
                            i10 = qd4.f(i4, max2, i2, measuredHeight3);
                            i11 = layoutParams.bottomMargin;
                        }
                        if (childAt != n12Var.U2 || childAt == n12Var.s3) {
                            i12 = 0;
                        }
                        p02Var = n12Var.B2;
                        if ((p02Var == null && p02Var.l(childAt)) || (((r02Var = n12Var.M2) != null && r02Var.l(childAt)) || (((a72Var = n12Var.g2) != null && childAt == a72Var.F) || ((a72Var2 = n12Var.h2) != null && childAt == a72Var2.F)))) {
                            if (hl.O1()) {
                                measuredHeight = getMeasuredHeight();
                                measuredHeight2 = childAt.getMeasuredHeight();
                            } else {
                                measuredHeight = getMeasuredHeight() + i16;
                                measuredHeight2 = childAt.getMeasuredHeight();
                            }
                            i12 = measuredHeight - measuredHeight2;
                        } else if (childAt == n12Var.B4) {
                            if (n12Var.W1) {
                                i13 = hl.m;
                                max = a.getCurrentActionBarHeight();
                                i12 = i13 + max;
                            }
                        } else if (childAt == n12Var.t3) {
                            i13 = i12 + hl.n;
                            max = Math.max(i16, n12Var.X0());
                            i12 = i13 + max;
                        }
                        childAt.layout(i9, i12, measuredWidth + i9, measuredHeight3 + i12);
                    } else {
                        i10 = ((((i4 - max2) - i2) - measuredHeight3) / 2) + layoutParams.topMargin;
                        i11 = layoutParams.bottomMargin;
                    }
                    i12 = i10 - i11;
                    if (childAt != n12Var.U2) {
                    }
                    i12 = 0;
                    p02Var = n12Var.B2;
                    if (p02Var == null) {
                    }
                    if (childAt == n12Var.B4) {
                    }
                } else {
                    i7 = ((i6 - measuredWidth) - layoutParams.rightMargin) - getPaddingRight();
                    i8 = n12Var.u0;
                }
                i9 = i7 - i8;
                if (i20 == 16) {
                }
                i12 = i10 - i11;
                if (childAt != n12Var.U2) {
                }
                i12 = 0;
                p02Var = n12Var.B2;
                if (p02Var == null) {
                }
                if (childAt == n12Var.B4) {
                }
            }
            i17++;
            a12Var = this;
            ttVar2 = ttVar;
            childCount = i5;
            i14 = i6;
            i15 = 8;
        }
        tt ttVar3 = ttVar2;
        R();
        n12Var.I1(n12Var.v2, 0);
        n12Var.I1(n12Var.w2, 0);
        if (n12Var.W1) {
            n12Var.F1();
        }
        if (chatAttachAlertPhotoLayout == null || (i52Var = chatAttachAlertPhotoLayout.F) == null || i52Var.getFastScroll() == null) {
            return;
        }
        chatAttachAlertPhotoLayout.F.getFastScroll().i0 = a.getCurrentActionBarHeight() + chatAttachAlertPhotoLayout.q1 + (n12Var.W1 ? (int) (ttVar3.getAlpha() * ttVar3.getMeasuredHeight()) : 0);
        chatAttachAlertPhotoLayout.F.getFastScroll().invalidate();
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        int i3;
        a72 a72Var;
        a72 a72Var2;
        int X0;
        a12 a12Var = this;
        n12 n12Var = a12Var.l0;
        s7 s7Var = n12Var.X2;
        boolean z = n12Var.a2;
        int size = a12Var.getLayoutParams().height > 0 ? a12Var.getLayoutParams().height : View.MeasureSpec.getSize(i2);
        if (!z) {
            a12Var.i0 = true;
            int i4 = n12Var.u0;
            a12Var.setPadding(i4, 0, i4, 0);
            a12Var.i0 = false;
        }
        int size2 = View.MeasureSpec.getSize(i) - (n12Var.u0 << 1);
        if (hl.O1()) {
            s7Var.setAdditionalYOffset(-hl.L(3.0f));
        } else {
            Point point = hl.q;
            if (point.x > point.y) {
                s7Var.setAdditionalYOffset(0);
            } else {
                s7Var.setAdditionalYOffset(-hl.L(3.0f));
            }
        }
        ((FrameLayout.LayoutParams) n12Var.c3.getLayoutParams()).height = a.getCurrentActionBarHeight();
        a12Var.i0 = true;
        int min = (int) (size2 / Math.min(4.5f, n12Var.x3.b()));
        if (n12Var.V3 != min) {
            n12Var.V3 = min;
            hl.c3(new go1(a12Var, (byte) 19));
        }
        a12Var.i0 = false;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30);
        int size3 = View.MeasureSpec.getSize(i);
        int size4 = View.MeasureSpec.getSize(makeMeasureSpec);
        a12Var.setMeasuredDimension(size3, size4);
        int i5 = n12Var.u0;
        r02 r02Var = n12Var.M2;
        p02 p02Var = n12Var.B2;
        int i6 = size3 - (i5 << 1);
        if (!p02Var.O && hl.L(20.0f) >= 0 && !p02Var.e && !p02Var.P) {
            a12Var.i0 = true;
            p02Var.j();
            a12Var.i0 = false;
        }
        if (!r02Var.O && hl.L(20.0f) >= 0 && !r02Var.e && !r02Var.P) {
            a12Var.i0 = true;
            r02Var.j();
            a12Var.i0 = false;
        }
        if (n12Var.g2 != null && hl.L(20.0f) >= 0) {
            a72 a72Var3 = n12Var.g2;
            if (!a72Var3.H && !a72Var3.b1 && !a72Var3.g1 && !a72Var3.i1) {
                a12Var.i0 = true;
                a72Var3.Z();
                a12Var.i0 = false;
            }
        }
        if (n12Var.h2 != null && hl.L(20.0f) >= 0) {
            a72 a72Var4 = n12Var.h2;
            if (!a72Var4.H && !a72Var4.b1 && !a72Var4.g1 && !a72Var4.i1) {
                a12Var.i0 = true;
                a72Var4.Z();
                a12Var.i0 = false;
            }
        }
        if (hl.L(20.0f) >= 0) {
            if (n12Var.d) {
                f12 f12Var = n12Var.v2;
                a72 a72Var5 = n12Var.g2;
                if (f12Var == a72Var5 && a72Var5.F != null && a72Var5.i1) {
                    X0 = hl.L(120.0f);
                } else {
                    a72 a72Var6 = n12Var.h2;
                    X0 = (f12Var == a72Var6 && a72Var6.F != null && a72Var6.i1) ? hl.L(120.0f) : 0;
                }
            } else {
                X0 = n12Var.X0();
            }
            WeakHashMap weakHashMap = ihc.a;
            l2d a = bhc.a(a12Var);
            int i7 = a != null ? a.a.f(8).d : 0;
            l2d a2 = bhc.a(a12Var);
            if (a2 != null) {
                int i8 = a2.a.f(527).d;
            }
            int max = Math.max(i7 > 0 ? 0 : hl.n, X0);
            a12Var.i0 = true;
            f12 f12Var2 = n12Var.v2;
            if (f12Var2.f) {
                f12Var2.e = hl.L(62.0f) + max;
                n12Var.v2.C(i6, size4);
            } else {
                f12Var2.e = hl.n;
                f12Var2.C(i6, size4 - X0);
            }
            f12 f12Var3 = n12Var.w2;
            if (f12Var3 != null) {
                if (f12Var3.f) {
                    f12Var3.e = hl.L(62.0f) + max;
                    n12Var.w2.C(i6, size4);
                } else {
                    f12Var3.e = hl.n;
                    f12Var3.C(i6, size4 - X0);
                }
            }
            a12Var.i0 = false;
        }
        int childCount = a12Var.getChildCount();
        int i9 = 0;
        while (i9 < childCount) {
            int i10 = i9;
            View childAt = a12Var.getChildAt(i10);
            if (childAt == null || childAt.getVisibility() == 8) {
                i3 = i10;
            } else if (childAt == n12Var.s3) {
                i3 = i10;
                a12Var.measureChildWithMargins(childAt, i, 0, makeMeasureSpec, 0);
            } else {
                i3 = i10;
                int i11 = hl.m;
                int i12 = hl.n;
                if (childAt instanceof f12) {
                    f12 f12Var4 = (f12) childAt;
                    if (f12Var4.h) {
                        i11 = 0;
                    }
                    if (f12Var4.f) {
                        i12 = 0;
                    }
                }
                if (!p02Var.l(childAt) && !r02Var.l(childAt) && (((a72Var = n12Var.g2) == null || childAt != a72Var.F) && ((a72Var2 = n12Var.h2) == null || childAt != a72Var2.F))) {
                    measureChildWithMargins(childAt, i, 0, makeMeasureSpec, i11 + i12);
                } else if (z) {
                    childAt.measure(View.MeasureSpec.makeMeasureSpec(i6, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(getPaddingTop() + size4, TLObject.FLAG_30));
                } else if (!hl.E && !hl.O1()) {
                    childAt.measure(View.MeasureSpec.makeMeasureSpec(i6, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(childAt.getLayoutParams().height, TLObject.FLAG_30));
                } else if (hl.O1()) {
                    childAt.measure(View.MeasureSpec.makeMeasureSpec(i6, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(Math.min(hl.L(hl.O1() ? 200.0f : 320.0f), getPaddingTop() + (size4 - hl.m)), TLObject.FLAG_30));
                } else {
                    childAt.measure(View.MeasureSpec.makeMeasureSpec(i6, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(getPaddingTop() + (size4 - hl.m), TLObject.FLAG_30));
                }
            }
            i9 = i3 + 1;
            a12Var = this;
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
        jl0 jl0Var = this.l0.x2;
        if (jl0Var != null) {
            jl0Var.t(hl.L(29.0f), hl.L(29.0f), i6, i5, true);
        }
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        n12 n12Var = this.l0;
        if (n12Var.v2.o(motionEvent)) {
            return true;
        }
        return !n12Var.J && super.onTouchEvent(motionEvent);
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        if (this.i0) {
            return;
        }
        super.requestLayout();
    }

    @Override // android.view.View
    public final void setTranslationY(float f) {
        n12 n12Var = this.l0;
        m02 m02Var = n12Var.u3;
        float f2 = f + n12Var.i4;
        byte b = n12Var.B0;
        if (b == 0) {
            this.j0 = f2;
        }
        if (b == 1) {
            f12 f12Var = n12Var.v2;
            if (f2 < 0.0f) {
                f12Var.setTranslationY(f2);
                if (n12Var.N2 != 0 || n12Var.Q2) {
                    n12Var.f3.setTranslationY((n12Var.m3 + f2) - n12Var.i4);
                }
                m02Var.setTranslationY(0.0f);
                f2 = 0.0f;
            } else {
                f12Var.setTranslationY(0.0f);
                m02Var.setTranslationY(((f2 / this.j0) * m02Var.getMeasuredHeight()) + (-f2));
            }
            n12Var.b.invalidate();
        }
        super.setTranslationY((f2 - n12Var.i4) + n12Var.s2);
        if (n12Var.B0 != 1) {
            n12Var.v2.m(n12Var.i4);
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
    }

    @Override // wma
    public final void H(Canvas canvas, float f, Rect rect, Paint paint, boolean z) {
    }
}
