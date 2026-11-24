// default package

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.FrameLayout;
import java.util.HashMap;
import java.util.HashSet;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class l43 extends FrameLayout implements tjb {
    public final Drawable a;
    public final Rect b;
    public final Paint c;
    public final int[] d;
    public final HashMap e;
    public float f;
    public float h;
    public float n;
    public float r;
    public float s;
    public final Path w;
    public final /* synthetic */ m43 x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l43(m43 m43Var, Context context) {
        super(context);
        this.x = m43Var;
        Rect rect = new Rect();
        this.b = rect;
        Paint paint = new Paint(1);
        this.c = paint;
        this.d = new int[4];
        this.e = new HashMap();
        this.f = 0.0f;
        this.h = 0.0f;
        this.n = 1.0f;
        this.r = 0.0f;
        this.s = 0.0f;
        this.w = new Path();
        Drawable mutate = context.getDrawable(R.drawable.reactions_bubble_shadow).mutate();
        this.a = mutate;
        int L = gl.L(7.0f);
        rect.bottom = L;
        rect.right = L;
        rect.top = L;
        rect.left = L;
        int i = bkb.Je;
        wjb wjbVar = m43Var.s;
        zkb.x(this, mutate, i, wjbVar, PorterDuff.Mode.MULTIPLY);
        if (m43Var.y == 2) {
            paint.setColor(bm2.f(0.13f, -16777216, -1));
        } else {
            paint.setColor(bkb.v0(bkb.F8, wjbVar));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:144:0x042a  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x041e  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x044d  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void dispatchDraw(Canvas canvas) {
        float f;
        boolean z;
        HashMap hashMap;
        byte b;
        float f2;
        RectF rectF;
        float f3;
        RectF rectF2;
        byte b2;
        t09 t09Var;
        byte b3;
        t09 t09Var2;
        byte b4;
        float f4;
        ml mlVar;
        int i;
        byte b5;
        int i2;
        int i3;
        HashMap hashMap2;
        RectF rectF3;
        RectF rectF4;
        t09 t09Var3;
        RectF rectF5;
        RectF rectF6;
        float f5;
        float f6;
        float f7;
        float f8;
        float f9;
        t09 t09Var4;
        RectF rectF7;
        ml mlVar2;
        int[] iArr;
        ml mlVar3;
        float f10;
        byte b6;
        float f11;
        float f12;
        float f13;
        float f14;
        float f15;
        float f16;
        float f17;
        float f18;
        float f19;
        h19 h19Var;
        byte b7;
        float f20;
        Canvas canvas2 = canvas;
        m43 m43Var = this.x;
        RectF rectF8 = m43Var.f;
        byte b8 = m43Var.y;
        RectF rectF9 = m43Var.i;
        i43 i43Var = m43Var.m;
        t09 t09Var5 = m43Var.n;
        if (m43Var.l) {
            float i4 = Utilities.i(m43Var.j, 1.0f, 0.0f);
            RectF rectF10 = gl.P;
            rectF10.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
            if (b8 == 4) {
                rectF8.set(t09Var5.x);
                rectF8.offset(m43Var.g, m43Var.h);
            }
            gl.X1(rectF8, rectF10, m43Var.j, rectF9);
            float R1 = gl.R1(m43Var.e, gl.L(b8 == 5 ? 20.0f : 8.0f), m43Var.j);
            HashMap hashMap3 = this.e;
            hashMap3.clear();
            if (b8 == 1 || (t09Var5.getDelegate() != null && t09Var5.getDelegate().C())) {
                f = 1.0f;
                s09 delegate = t09Var5.getDelegate();
                float x = getX();
                l43 l43Var = m43Var.a;
                z = true;
                hashMap = hashMap3;
                b = 4;
                f2 = 255.0f;
                delegate.x(canvas, rectF9, R1, x, b8 == 1 ? l43Var.getY() - gl.m : l43Var.getY() + m43Var.c.getY(), kk7.d4, true);
                canvas2 = canvas;
                rectF = rectF9;
            } else {
                int i5 = (int) (Utilities.i(i4 / 0.05f, 1.0f, 0.0f) * 255.0f);
                Drawable drawable = this.a;
                drawable.setAlpha(i5);
                int i6 = (int) rectF9.left;
                Rect rect = this.b;
                f = 1.0f;
                drawable.setBounds(i6 - rect.left, ((int) rectF9.top) - rect.top, ((int) rectF9.right) + rect.right, ((int) rectF9.bottom) + rect.bottom);
                il0 il0Var = m43Var.z;
                Paint paint = this.c;
                if (il0Var != null) {
                    rectF10.set(rectF9);
                    Rect rect2 = gl.Q;
                    rectF10.round(rect2);
                    rect2.inset(-gl.L(8.0f), -gl.L(8.0f));
                    m43Var.z.setBounds(rect2);
                    m43Var.z.setAlpha(paint.getAlpha());
                    m43Var.z.r(R1);
                    m43Var.z.draw(canvas2);
                } else {
                    drawable.draw(canvas2);
                    canvas2.drawRoundRect(rectF9, R1, R1, paint);
                }
                rectF = rectF9;
                hashMap = hashMap3;
                b = 4;
                f2 = 255.0f;
                z = true;
            }
            if (t09Var5.S0 != null) {
                canvas2.save();
                float f21 = rectF.left;
                float y = t09Var5.S0.getY() + rectF.top;
                if (b8 == 3 || b8 == b) {
                    b7 = 5;
                } else {
                    b7 = 5;
                    if (b8 != 5) {
                        f20 = 0.0f;
                        canvas2.translate(f21, y - f20);
                        rectF2 = rectF8;
                        f3 = R1;
                        b2 = b7;
                        canvas2.saveLayerAlpha(0.0f, 0.0f, t09Var5.S0.getMeasuredWidth(), t09Var5.S0.getMeasuredHeight(), (int) ((f - m43Var.j) * t09Var5.S0.getAlpha() * f2), 31);
                        t09Var5.S0.draw(canvas2);
                        canvas2.restore();
                        canvas2.restore();
                    }
                }
                f20 = t09Var5.x.top;
                canvas2.translate(f21, y - f20);
                rectF2 = rectF8;
                f3 = R1;
                b2 = b7;
                canvas2.saveLayerAlpha(0.0f, 0.0f, t09Var5.S0.getMeasuredWidth(), t09Var5.S0.getMeasuredHeight(), (int) ((f - m43Var.j) * t09Var5.S0.getAlpha() * f2), 31);
                t09Var5.S0.draw(canvas2);
                canvas2.restore();
                canvas2.restore();
            } else {
                f3 = R1;
                rectF2 = rectF8;
                b2 = 5;
            }
            float width = (rectF.width() - t09Var5.x.width()) + (rectF.left - t09Var5.x.left);
            if (m43Var.j > 0.05f || b8 == b2) {
                canvas2.save();
                canvas2.translate(width, (rectF.height() - t09Var5.x.height()) + (rectF.top - t09Var5.x.top));
                float max = (Math.max(0.25f, Math.min(t09Var5.w, f)) - 0.25f) / 0.75f;
                Canvas canvas3 = canvas2;
                t09Var5.c(t09Var5.F * max, max, t09Var5.G * max, t09Var5.N0 == b2 ? kk7.d4 : (int) tb4.z(1.0f, t09Var5.x0, Utilities.i(t09Var5.x0 / 0.2f, 1.0f, 0.0f), f2), canvas3);
                t09Var = t09Var5;
                canvas2 = canvas3;
                canvas2.restore();
                b3 = 5;
            } else {
                b3 = b2;
                t09Var = t09Var5;
            }
            if (b8 == b3) {
                Path path = this.w;
                path.rewind();
                path.addRoundRect(rectF, f3, f3, Path.Direction.CW);
                canvas2.save();
                canvas2.clipPath(path);
            }
            this.f = 0.0f;
            this.h = 0.0f;
            this.n = 1.0f;
            this.r = 0.0f;
            this.s = 0.0f;
            if (t09Var != null) {
                for (int childCount = i43Var.i0.getChildCount() - 1; childCount >= 0; childCount--) {
                    if (i43Var.i0.getChildAt(childCount) instanceof dx9) {
                        dx9 dx9Var = (dx9) i43Var.i0.getChildAt(childCount);
                        if (dx9Var.E && (h19Var = dx9Var.y) != null) {
                            hashMap.put(h19Var, dx9Var);
                        }
                    }
                }
                int save = canvas2.save();
                canvas2.translate(rectF.left, tb4.A(1.0f, m43Var.j, t09Var.d() + t09Var.getTopOffset(), rectF.top));
                float max2 = Math.max(1.0f - (i43Var.j0.getVisibility() == 0 ? i43Var.j0.getAlpha() : 0.0f), 1.0f - m43Var.j);
                if (max2 != 1.0f) {
                    canvas2.saveLayerAlpha(0.0f, 0.0f, rectF.width(), rectF.height(), (int) (max2 * 255.0f), 31);
                }
                int x2 = (int) (i43Var.i0.getX() + i43Var.getX());
                int y2 = (int) (i43Var.i0.getY() + i43Var.getY());
                boolean z2 = i43Var.e0.getParent() != null ? z : false;
                if (b8 != 5) {
                    float f22 = y2;
                    if (z2) {
                        f4 = 2.0f;
                        f19 = x2 + (gl.L(36.0f) * m43Var.j);
                    } else {
                        f4 = 2.0f;
                        f19 = 0.0f;
                    }
                    canvas2.clipRect(f22, f19, i43Var.i0.getMeasuredWidth() + y2, i43Var.i0.getMeasuredHeight() + x2);
                } else {
                    f4 = 2.0f;
                }
                int i7 = -1;
                int i8 = -1;
                while (i8 < t09Var.b.getChildCount()) {
                    View childAt = i8 == i7 ? t09Var.A0 : t09Var.b.getChildAt(i8);
                    if (childAt.getLeft() < 0 || childAt.getVisibility() == 8) {
                        i = i8;
                        b5 = b8;
                        i2 = i7;
                        i3 = save;
                        hashMap2 = hashMap;
                        rectF3 = rectF2;
                        rectF4 = rectF;
                        t09Var3 = t09Var;
                    } else {
                        canvas2.save();
                        if (childAt instanceof r09) {
                            r09 r09Var = (r09) childAt;
                            q09 q09Var = r09Var.a;
                            q09 q09Var2 = r09Var.b;
                            oh8 oh8Var = r09Var.f;
                            if (oh8Var != null) {
                                oh8Var.setAlpha(1.0f - m43Var.j);
                            }
                            dx9 dx9Var2 = (dx9) hashMap.get(r09Var.e);
                            if (dx9Var2 != null) {
                                float x3 = childAt.getX();
                                float y3 = childAt.getY();
                                if (i8 == -1) {
                                    x3 -= t09Var.b.getX();
                                    f10 = y3 - t09Var.b.getY();
                                } else {
                                    f10 = y3;
                                }
                                i = i8;
                                float x4 = ((i43Var.i0.getX() + (i43Var.getX() + dx9Var2.getX())) - q09Var2.getX()) - gl.L(1.0f);
                                float y4 = (i43Var.i0.getY() + (i43Var.h0.getY() + (i43Var.getY() + dx9Var2.getY()))) - q09Var2.getY();
                                float measuredWidth = dx9Var2.getMeasuredWidth();
                                if (dx9Var2.M) {
                                    b6 = 4;
                                } else {
                                    b6 = 4;
                                    if (b8 != 4) {
                                        f13 = x4;
                                        hashMap2 = hashMap;
                                        float f23 = y4;
                                        b5 = b8;
                                        float R12 = gl.R1(x3, f13, m43Var.j);
                                        float f24 = x3;
                                        float R13 = gl.R1(f10, f23, m43Var.j);
                                        float f25 = f10;
                                        float measuredWidth2 = measuredWidth / q09Var2.getMeasuredWidth();
                                        i3 = save;
                                        rectF5 = rectF;
                                        f9 = gl.R1(1.0f, measuredWidth2, m43Var.j);
                                        if (r09Var.E != 0) {
                                            f14 = gl.L(6.0f);
                                            f16 = f14;
                                            f15 = 0.0f;
                                        } else if (r09Var.x) {
                                            f14 = gl.L(6.0f);
                                            f15 = f14;
                                            f16 = f15;
                                            f17 = f16;
                                            canvas2.translate(R12, R13);
                                            canvas2.scale(f9, f9);
                                            if (this.f == 0.0f || this.h != 0.0f) {
                                                f18 = f14;
                                                rectF6 = rectF2;
                                            } else {
                                                rectF6 = rectF2;
                                                f18 = f14;
                                                this.f = gl.R1((rectF6.left + f24) - f13, 0.0f, m43Var.j);
                                                this.h = gl.R1((rectF6.top + f25) - f23, 0.0f, m43Var.j);
                                                this.n = gl.R1(1.0f / measuredWidth2, 1.0f, m43Var.j);
                                                this.r = f13;
                                                this.s = f23;
                                            }
                                            f6 = f18;
                                            f7 = f15;
                                            f5 = f16;
                                            f8 = f17;
                                        } else {
                                            f14 = 0.0f;
                                            f15 = 0.0f;
                                            f16 = 0.0f;
                                        }
                                        f17 = 0.0f;
                                        canvas2.translate(R12, R13);
                                        canvas2.scale(f9, f9);
                                        if (this.f == 0.0f) {
                                        }
                                        f18 = f14;
                                        rectF6 = rectF2;
                                        f6 = f18;
                                        f7 = f15;
                                        f5 = f16;
                                        f8 = f17;
                                    }
                                }
                                if (b8 == b6) {
                                    f11 = x4 - gl.L(0.33f);
                                    y4 -= gl.L(1.33f);
                                    f12 = 0.87f * measuredWidth;
                                } else {
                                    f11 = x4;
                                    f12 = measuredWidth;
                                }
                                float f26 = dx9Var2.M ? 0.95f * f12 : f12;
                                float f27 = (measuredWidth - f26) / f4;
                                measuredWidth = f26;
                                f13 = f11 + f27;
                                y4 += f27;
                                hashMap2 = hashMap;
                                float f232 = y4;
                                b5 = b8;
                                float R122 = gl.R1(x3, f13, m43Var.j);
                                float f242 = x3;
                                float R132 = gl.R1(f10, f232, m43Var.j);
                                float f252 = f10;
                                float measuredWidth22 = measuredWidth / q09Var2.getMeasuredWidth();
                                i3 = save;
                                rectF5 = rectF;
                                f9 = gl.R1(1.0f, measuredWidth22, m43Var.j);
                                if (r09Var.E != 0) {
                                }
                                f17 = 0.0f;
                                canvas2.translate(R122, R132);
                                canvas2.scale(f9, f9);
                                if (this.f == 0.0f) {
                                }
                                f18 = f14;
                                rectF6 = rectF2;
                                f6 = f18;
                                f7 = f15;
                                f5 = f16;
                                f8 = f17;
                            } else {
                                i = i8;
                                rectF5 = rectF;
                                b5 = b8;
                                i3 = save;
                                hashMap2 = hashMap;
                                rectF6 = rectF2;
                                canvas2.translate(q09Var2.getX() + childAt.getX(), q09Var2.getY() + childAt.getY());
                                f5 = 0.0f;
                                f6 = 0.0f;
                                f7 = 0.0f;
                                f8 = 0.0f;
                                f9 = 1.0f;
                            }
                            if (dx9Var2 != null) {
                                if (dx9Var2.M) {
                                    float measuredWidth3 = r09Var.getMeasuredWidth() / f4;
                                    float measuredHeight = r09Var.getMeasuredHeight() / f4;
                                    float measuredWidth4 = r09Var.getMeasuredWidth() - gl.L(f4);
                                    float R14 = gl.R1(measuredWidth4, (dx9Var2.getMeasuredWidth() - gl.L(f4)) / f9, m43Var.j);
                                    RectF rectF11 = gl.P;
                                    float f28 = R14 / f4;
                                    rectF7 = rectF6;
                                    t09Var4 = t09Var;
                                    rectF11.set(measuredWidth3 - f28, measuredHeight - f28, measuredWidth3 + f28, measuredHeight + f28);
                                    float R15 = gl.R1(measuredWidth4 / f4, gl.L(4.0f), m43Var.j);
                                    canvas2.drawRoundRect(rectF11, R15, R15, i43Var.M);
                                } else {
                                    t09Var4 = t09Var;
                                    rectF7 = rectF6;
                                }
                                r09Var.y = false;
                                if (f5 == 0.0f) {
                                    r09Var.draw(canvas2);
                                } else {
                                    ImageReceiver imageReceiver = q09Var2.getImageReceiver();
                                    r09Var.a();
                                    vl vlVar = q09Var2.e;
                                    if (vlVar != null && (mlVar3 = vlVar.k) != null) {
                                        imageReceiver = mlVar3;
                                    }
                                    int[] iArr2 = imageReceiver.X0;
                                    int i9 = 0;
                                    while (true) {
                                        iArr = this.d;
                                        if (i9 >= 4) {
                                            break;
                                        }
                                        iArr[i9] = iArr2[i9];
                                        i9++;
                                    }
                                    imageReceiver.r0((int) gl.R1(f6, 0.0f, m43Var.j), (int) gl.R1(f7, 0.0f, m43Var.j), (int) gl.R1(f8, 0.0f, m43Var.j), (int) gl.R1(f5, 0.0f, m43Var.j));
                                    r09Var.draw(canvas2);
                                    imageReceiver.s0(iArr);
                                }
                                boolean z3 = z;
                                r09Var.y = z3;
                                if (!dx9Var2.b) {
                                    dx9Var2.b = z3;
                                    dx9Var2.invalidate();
                                }
                            } else {
                                t09Var4 = t09Var;
                                rectF7 = rectF6;
                                if (r09Var.r && q09Var2.getImageReceiver().y() == null) {
                                    float alpha = q09Var.getImageReceiver().getAlpha();
                                    q09Var.getImageReceiver().setAlpha((1.0f - i4) * alpha);
                                    q09Var.draw(canvas2);
                                    q09Var.getImageReceiver().setAlpha(alpha);
                                } else {
                                    r09Var.a();
                                    ImageReceiver imageReceiver2 = q09Var2.getImageReceiver();
                                    vl vlVar2 = q09Var2.e;
                                    if (vlVar2 != null && (mlVar2 = vlVar2.k) != null) {
                                        imageReceiver2 = mlVar2;
                                    }
                                    float alpha2 = imageReceiver2.getAlpha();
                                    imageReceiver2.setAlpha((1.0f - i4) * alpha2);
                                    q09Var2.draw(canvas2);
                                    imageReceiver2.setAlpha(alpha2);
                                }
                            }
                            if (q09Var2.getVisibility() != 0) {
                                invalidate();
                            }
                            t09Var3 = t09Var4;
                            rectF4 = rectF5;
                            rectF3 = rectF7;
                            i2 = -1;
                        } else {
                            i = i8;
                            RectF rectF12 = rectF;
                            b5 = b8;
                            i3 = save;
                            hashMap2 = hashMap;
                            t09Var3 = t09Var;
                            rectF3 = rectF2;
                            rectF4 = rectF12;
                            canvas2.translate((rectF12.width() + childAt.getX()) - t09Var3.x.width(), (childAt.getY() + rectF3.top) - rectF4.top);
                            i2 = -1;
                            canvas2.saveLayerAlpha(0.0f, 0.0f, childAt.getMeasuredWidth(), childAt.getMeasuredHeight(), (int) ((1.0f - i4) * 255.0f), 31);
                            float f29 = 1.0f - m43Var.j;
                            canvas2.scale(f29, f29, r14.getMeasuredWidth() >> 1, r14.getMeasuredHeight() >> 1);
                            childAt.draw(canvas2);
                            canvas2.restore();
                        }
                        canvas2.restore();
                    }
                    i8 = i + 1;
                    t09Var = t09Var3;
                    rectF2 = rectF3;
                    rectF = rectF4;
                    i7 = i2;
                    hashMap = hashMap2;
                    b8 = b5;
                    save = i3;
                    z = true;
                }
                t09Var2 = t09Var;
                b4 = b8;
                canvas2.restoreToCount(save);
            } else {
                t09Var2 = t09Var;
                b4 = b8;
                f4 = 2.0f;
            }
            super.dispatchDraw(canvas);
            int i10 = m43Var.F;
            if (i10 < 5) {
                if (i10 == 3) {
                    t09Var2.setSkipDraw(true);
                }
                m43Var.F++;
            }
            Paint paint2 = i43Var.Z1;
            rw9 rw9Var = i43Var.i0;
            ImageReceiver imageReceiver3 = i43Var.W0;
            if (i43Var.T0 != null) {
                imageReceiver3.p0(this);
                dx9 dx9Var3 = i43Var.T0;
                if (dx9Var3 != null) {
                    float f30 = i43Var.V0;
                    if (f30 != 1.0f && !i43Var.U0 && i43Var.i1) {
                        float f31 = f30 + 0.010666667f;
                        i43Var.V0 = f31;
                        if (f31 >= 1.0f) {
                            i43Var.V0 = 1.0f;
                            rx9 rx9Var = i43Var.I;
                            if (rx9Var != null) {
                                boolean z4 = dx9Var3.s;
                                t09 t09Var6 = (t09) ((qx4) rx9Var).a;
                                if (z4) {
                                    t09Var6.i(dx9Var3, dx9Var3.y, true);
                                } else {
                                    long j = dx9Var3.e.documentId;
                                    h19 h19Var2 = new h19();
                                    h19Var2.g = j;
                                    h19Var2.h = j;
                                    t09Var6.i(dx9Var3, h19Var2, true);
                                }
                            }
                        }
                        dx9 dx9Var4 = i43Var.T0;
                        f30 = i43Var.V0;
                        dx9Var4.H = f30;
                    }
                    float f32 = (f30 * f4) + 1.0f;
                    canvas2.save();
                    canvas2.translate(i43Var.T0.getX() + rw9Var.getX(), i43Var.T0.getY() + rw9Var.getY() + i43Var.h0.getY());
                    paint2.setColor(bkb.v0(bkb.F8, i43Var.a1));
                    canvas2.drawRect(0.0f, 0.0f, i43Var.T0.getMeasuredWidth(), i43Var.T0.getMeasuredHeight(), paint2);
                    canvas2.scale(f32, f32, i43Var.T0.getMeasuredWidth() / f4, i43Var.T0.getMeasuredHeight());
                    dx9 dx9Var5 = i43Var.T0;
                    if (!dx9Var5.s) {
                        imageReceiver3 = dx9Var5.r;
                    }
                    vl vlVar3 = i43Var.X0;
                    if (vlVar3 != null && (mlVar = vlVar3.k) != null && mlVar.B()) {
                        imageReceiver3 = i43Var.X0.k;
                    }
                    if (imageReceiver3 != null) {
                        imageReceiver3.i0(0.0f, 0.0f, i43Var.T0.getMeasuredWidth(), i43Var.T0.getMeasuredHeight());
                        imageReceiver3.h(canvas2, null);
                    }
                    canvas2.restore();
                    invalidate();
                }
            }
            if (b4 == 5) {
                canvas2.restore();
            }
            if (m43Var.x != null) {
                invalidate();
            }
            Runnable runnable = pg5.c;
            if (runnable != null) {
                runnable.run();
                pg5.c = null;
            }
        }
    }

    @Override // android.view.View
    public final void invalidate() {
        super.invalidate();
        m43 m43Var = this.x;
        t09 t09Var = m43Var.n;
        if (m43Var.y == 1 || !(t09Var == null || t09Var.getDelegate() == null || !t09Var.getDelegate().C())) {
            m43Var.m.g0.invalidate();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0081  */
    @Override // android.widget.FrameLayout, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onMeasure(int i, int i2) {
        int measuredWidth;
        int i3;
        int L;
        int L2;
        m43 m43Var = this.x;
        t09 t09Var = m43Var.n;
        byte b = m43Var.y;
        if (b == 1 || b == 2 || b == 4) {
            measuredWidth = t09Var.getMeasuredWidth();
        } else if (b == 5) {
            measuredWidth = gl.L(12.0f) + (gl.L(36.0f) << 3);
        } else {
            measuredWidth = Math.min(View.MeasureSpec.getSize(i), View.MeasureSpec.getSize(i2));
            int L3 = (gl.L(36.0f) << 3) + gl.L(12.0f);
            if (L3 < measuredWidth) {
                measuredWidth = L3;
            }
        }
        if (b != 4) {
            if (t09Var.G0) {
                int ceil = (int) Math.ceil(m43Var.o.size() / 8.0f);
                if (ceil <= 8) {
                    i3 = gl.L(8.0f) + (gl.L(36.0f) * ceil);
                } else {
                    L = gl.L(36.0f) << 3;
                    L2 = gl.L(8.0f);
                }
            } else {
                i3 = measuredWidth;
            }
            if (b == 5) {
                i3 = Math.min(gl.L(254.0f), i3);
            }
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(measuredWidth, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(i3, TLObject.FLAG_30));
        }
        L = gl.L(36.0f) << 3;
        L2 = gl.L(8.0f);
        i3 = L - L2;
        if (b == 5) {
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(measuredWidth, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(i3, TLObject.FLAG_30));
    }

    @Override // tjb
    public final void updateColors() {
        Paint paint;
        try {
            m43 m43Var = this.x;
            if (m43Var.y == 2 || (paint = this.c) == null) {
                return;
            }
            paint.setColor(bkb.v0(bkb.F8, m43Var.s));
            invalidate();
        } catch (Exception e) {
            fa4.g(e, true);
        }
    }

    @Override // tjb
    public final void addColorKeys(HashSet hashSet) {
    }
}
