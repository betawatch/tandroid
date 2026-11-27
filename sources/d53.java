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

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final class d53 extends FrameLayout implements snb {
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
    public final /* synthetic */ e53 x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d53(e53 e53Var, Context context) {
        super(context);
        this.x = e53Var;
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
        int L = hl.L(7.0f);
        rect.bottom = L;
        rect.right = L;
        rect.top = L;
        rect.left = L;
        int i = aob.Ke;
        vnb vnbVar = e53Var.s;
        yob.x(this, mutate, i, vnbVar, PorterDuff.Mode.MULTIPLY);
        if (e53Var.y == 2) {
            paint.setColor(vm2.f(0.13f, -16777216, -1));
        } else {
            paint.setColor(aob.v0(aob.G8, vnbVar));
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
        i49 i49Var;
        byte b3;
        i49 i49Var2;
        byte b4;
        float f4;
        nl nlVar;
        int i;
        byte b5;
        int i2;
        int i3;
        HashMap hashMap2;
        RectF rectF3;
        RectF rectF4;
        i49 i49Var3;
        RectF rectF5;
        RectF rectF6;
        float f5;
        float f6;
        float f7;
        float f8;
        float f9;
        i49 i49Var4;
        RectF rectF7;
        nl nlVar2;
        int[] iArr;
        nl nlVar3;
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
        w49 w49Var;
        byte b7;
        float f20;
        Canvas canvas2 = canvas;
        e53 e53Var = this.x;
        RectF rectF8 = e53Var.f;
        byte b8 = e53Var.y;
        RectF rectF9 = e53Var.i;
        a53 a53Var = e53Var.m;
        i49 i49Var5 = e53Var.n;
        if (e53Var.l) {
            float i4 = Utilities.i(e53Var.j, 1.0f, 0.0f);
            RectF rectF10 = hl.P;
            rectF10.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
            if (b8 == 4) {
                rectF8.set(i49Var5.x);
                rectF8.offset(e53Var.g, e53Var.h);
            }
            hl.X1(rectF8, rectF10, e53Var.j, rectF9);
            float R1 = hl.R1(e53Var.e, hl.L(b8 == 5 ? 20.0f : 8.0f), e53Var.j);
            HashMap hashMap3 = this.e;
            hashMap3.clear();
            if (b8 == 1 || (i49Var5.getDelegate() != null && i49Var5.getDelegate().p())) {
                f = 1.0f;
                h49 delegate = i49Var5.getDelegate();
                float x = getX();
                d53 d53Var = e53Var.a;
                z = true;
                hashMap = hashMap3;
                b = 4;
                f2 = 255.0f;
                delegate.m(canvas, rectF9, R1, x, b8 == 1 ? d53Var.getY() - hl.m : d53Var.getY() + e53Var.c.getY(), jn7.d4, true);
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
                jl0 jl0Var = e53Var.z;
                Paint paint = this.c;
                if (jl0Var != null) {
                    rectF10.set(rectF9);
                    Rect rect2 = hl.Q;
                    rectF10.round(rect2);
                    rect2.inset(-hl.L(8.0f), -hl.L(8.0f));
                    e53Var.z.setBounds(rect2);
                    e53Var.z.setAlpha(paint.getAlpha());
                    e53Var.z.r(R1);
                    e53Var.z.draw(canvas2);
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
            if (i49Var5.S0 != null) {
                canvas2.save();
                float f21 = rectF.left;
                float y = i49Var5.S0.getY() + rectF.top;
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
                        canvas2.saveLayerAlpha(0.0f, 0.0f, i49Var5.S0.getMeasuredWidth(), i49Var5.S0.getMeasuredHeight(), (int) ((f - e53Var.j) * i49Var5.S0.getAlpha() * f2), 31);
                        i49Var5.S0.draw(canvas2);
                        canvas2.restore();
                        canvas2.restore();
                    }
                }
                f20 = i49Var5.x.top;
                canvas2.translate(f21, y - f20);
                rectF2 = rectF8;
                f3 = R1;
                b2 = b7;
                canvas2.saveLayerAlpha(0.0f, 0.0f, i49Var5.S0.getMeasuredWidth(), i49Var5.S0.getMeasuredHeight(), (int) ((f - e53Var.j) * i49Var5.S0.getAlpha() * f2), 31);
                i49Var5.S0.draw(canvas2);
                canvas2.restore();
                canvas2.restore();
            } else {
                f3 = R1;
                rectF2 = rectF8;
                b2 = 5;
            }
            float width = (rectF.width() - i49Var5.x.width()) + (rectF.left - i49Var5.x.left);
            if (e53Var.j > 0.05f || b8 == b2) {
                canvas2.save();
                canvas2.translate(width, (rectF.height() - i49Var5.x.height()) + (rectF.top - i49Var5.x.top));
                float max = (Math.max(0.25f, Math.min(i49Var5.w, f)) - 0.25f) / 0.75f;
                Canvas canvas3 = canvas2;
                i49Var5.c(i49Var5.F * max, max, i49Var5.G * max, i49Var5.N0 == b2 ? jn7.d4 : (int) qd4.z(1.0f, i49Var5.x0, Utilities.i(i49Var5.x0 / 0.2f, 1.0f, 0.0f), f2), canvas3);
                i49Var = i49Var5;
                canvas2 = canvas3;
                canvas2.restore();
                b3 = 5;
            } else {
                b3 = b2;
                i49Var = i49Var5;
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
            if (i49Var != null) {
                for (int childCount = a53Var.i0.getChildCount() - 1; childCount >= 0; childCount--) {
                    if (a53Var.i0.getChildAt(childCount) instanceof w0a) {
                        w0a w0aVar = (w0a) a53Var.i0.getChildAt(childCount);
                        if (w0aVar.E && (w49Var = w0aVar.y) != null) {
                            hashMap.put(w49Var, w0aVar);
                        }
                    }
                }
                int save = canvas2.save();
                canvas2.translate(rectF.left, qd4.A(1.0f, e53Var.j, i49Var.d() + i49Var.getTopOffset(), rectF.top));
                float max2 = Math.max(1.0f - (a53Var.j0.getVisibility() == 0 ? a53Var.j0.getAlpha() : 0.0f), 1.0f - e53Var.j);
                if (max2 != 1.0f) {
                    canvas2.saveLayerAlpha(0.0f, 0.0f, rectF.width(), rectF.height(), (int) (max2 * 255.0f), 31);
                }
                int x2 = (int) (a53Var.i0.getX() + a53Var.getX());
                int y2 = (int) (a53Var.i0.getY() + a53Var.getY());
                boolean z2 = a53Var.e0.getParent() != null ? z : false;
                if (b8 != 5) {
                    float f22 = y2;
                    if (z2) {
                        f4 = 2.0f;
                        f19 = x2 + (hl.L(36.0f) * e53Var.j);
                    } else {
                        f4 = 2.0f;
                        f19 = 0.0f;
                    }
                    canvas2.clipRect(f22, f19, a53Var.i0.getMeasuredWidth() + y2, a53Var.i0.getMeasuredHeight() + x2);
                } else {
                    f4 = 2.0f;
                }
                int i7 = -1;
                int i8 = -1;
                while (i8 < i49Var.b.getChildCount()) {
                    View childAt = i8 == i7 ? i49Var.A0 : i49Var.b.getChildAt(i8);
                    if (childAt.getLeft() < 0 || childAt.getVisibility() == 8) {
                        i = i8;
                        b5 = b8;
                        i2 = i7;
                        i3 = save;
                        hashMap2 = hashMap;
                        rectF3 = rectF2;
                        rectF4 = rectF;
                        i49Var3 = i49Var;
                    } else {
                        canvas2.save();
                        if (childAt instanceof g49) {
                            g49 g49Var = (g49) childAt;
                            f49 f49Var = g49Var.a;
                            f49 f49Var2 = g49Var.b;
                            cl8 cl8Var = g49Var.f;
                            if (cl8Var != null) {
                                cl8Var.setAlpha(1.0f - e53Var.j);
                            }
                            w0a w0aVar2 = (w0a) hashMap.get(g49Var.e);
                            if (w0aVar2 != null) {
                                float x3 = childAt.getX();
                                float y3 = childAt.getY();
                                if (i8 == -1) {
                                    x3 -= i49Var.b.getX();
                                    f10 = y3 - i49Var.b.getY();
                                } else {
                                    f10 = y3;
                                }
                                i = i8;
                                float x4 = ((a53Var.i0.getX() + (a53Var.getX() + w0aVar2.getX())) - f49Var2.getX()) - hl.L(1.0f);
                                float y4 = (a53Var.i0.getY() + (a53Var.h0.getY() + (a53Var.getY() + w0aVar2.getY()))) - f49Var2.getY();
                                float measuredWidth = w0aVar2.getMeasuredWidth();
                                if (w0aVar2.M) {
                                    b6 = 4;
                                } else {
                                    b6 = 4;
                                    if (b8 != 4) {
                                        f13 = x4;
                                        hashMap2 = hashMap;
                                        float f23 = y4;
                                        b5 = b8;
                                        float R12 = hl.R1(x3, f13, e53Var.j);
                                        float f24 = x3;
                                        float R13 = hl.R1(f10, f23, e53Var.j);
                                        float f25 = f10;
                                        float measuredWidth2 = measuredWidth / f49Var2.getMeasuredWidth();
                                        i3 = save;
                                        rectF5 = rectF;
                                        f9 = hl.R1(1.0f, measuredWidth2, e53Var.j);
                                        if (g49Var.E != 0) {
                                            f14 = hl.L(6.0f);
                                            f16 = f14;
                                            f15 = 0.0f;
                                        } else if (g49Var.x) {
                                            f14 = hl.L(6.0f);
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
                                                this.f = hl.R1((rectF6.left + f24) - f13, 0.0f, e53Var.j);
                                                this.h = hl.R1((rectF6.top + f25) - f23, 0.0f, e53Var.j);
                                                this.n = hl.R1(1.0f / measuredWidth2, 1.0f, e53Var.j);
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
                                    f11 = x4 - hl.L(0.33f);
                                    y4 -= hl.L(1.33f);
                                    f12 = 0.87f * measuredWidth;
                                } else {
                                    f11 = x4;
                                    f12 = measuredWidth;
                                }
                                float f26 = w0aVar2.M ? 0.95f * f12 : f12;
                                float f27 = (measuredWidth - f26) / f4;
                                measuredWidth = f26;
                                f13 = f11 + f27;
                                y4 += f27;
                                hashMap2 = hashMap;
                                float f232 = y4;
                                b5 = b8;
                                float R122 = hl.R1(x3, f13, e53Var.j);
                                float f242 = x3;
                                float R132 = hl.R1(f10, f232, e53Var.j);
                                float f252 = f10;
                                float measuredWidth22 = measuredWidth / f49Var2.getMeasuredWidth();
                                i3 = save;
                                rectF5 = rectF;
                                f9 = hl.R1(1.0f, measuredWidth22, e53Var.j);
                                if (g49Var.E != 0) {
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
                                canvas2.translate(f49Var2.getX() + childAt.getX(), f49Var2.getY() + childAt.getY());
                                f5 = 0.0f;
                                f6 = 0.0f;
                                f7 = 0.0f;
                                f8 = 0.0f;
                                f9 = 1.0f;
                            }
                            if (w0aVar2 != null) {
                                if (w0aVar2.M) {
                                    float measuredWidth3 = g49Var.getMeasuredWidth() / f4;
                                    float measuredHeight = g49Var.getMeasuredHeight() / f4;
                                    float measuredWidth4 = g49Var.getMeasuredWidth() - hl.L(f4);
                                    float R14 = hl.R1(measuredWidth4, (w0aVar2.getMeasuredWidth() - hl.L(f4)) / f9, e53Var.j);
                                    RectF rectF11 = hl.P;
                                    float f28 = R14 / f4;
                                    rectF7 = rectF6;
                                    i49Var4 = i49Var;
                                    rectF11.set(measuredWidth3 - f28, measuredHeight - f28, measuredWidth3 + f28, measuredHeight + f28);
                                    float R15 = hl.R1(measuredWidth4 / f4, hl.L(4.0f), e53Var.j);
                                    canvas2.drawRoundRect(rectF11, R15, R15, a53Var.M);
                                } else {
                                    i49Var4 = i49Var;
                                    rectF7 = rectF6;
                                }
                                g49Var.y = false;
                                if (f5 == 0.0f) {
                                    g49Var.draw(canvas2);
                                } else {
                                    ImageReceiver imageReceiver = f49Var2.getImageReceiver();
                                    g49Var.a();
                                    wl wlVar = f49Var2.e;
                                    if (wlVar != null && (nlVar3 = wlVar.k) != null) {
                                        imageReceiver = nlVar3;
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
                                    imageReceiver.r0((int) hl.R1(f6, 0.0f, e53Var.j), (int) hl.R1(f7, 0.0f, e53Var.j), (int) hl.R1(f8, 0.0f, e53Var.j), (int) hl.R1(f5, 0.0f, e53Var.j));
                                    g49Var.draw(canvas2);
                                    imageReceiver.s0(iArr);
                                }
                                boolean z3 = z;
                                g49Var.y = z3;
                                if (!w0aVar2.b) {
                                    w0aVar2.b = z3;
                                    w0aVar2.invalidate();
                                }
                            } else {
                                i49Var4 = i49Var;
                                rectF7 = rectF6;
                                if (g49Var.r && f49Var2.getImageReceiver().y() == null) {
                                    float alpha = f49Var.getImageReceiver().getAlpha();
                                    f49Var.getImageReceiver().setAlpha((1.0f - i4) * alpha);
                                    f49Var.draw(canvas2);
                                    f49Var.getImageReceiver().setAlpha(alpha);
                                } else {
                                    g49Var.a();
                                    ImageReceiver imageReceiver2 = f49Var2.getImageReceiver();
                                    wl wlVar2 = f49Var2.e;
                                    if (wlVar2 != null && (nlVar2 = wlVar2.k) != null) {
                                        imageReceiver2 = nlVar2;
                                    }
                                    float alpha2 = imageReceiver2.getAlpha();
                                    imageReceiver2.setAlpha((1.0f - i4) * alpha2);
                                    f49Var2.draw(canvas2);
                                    imageReceiver2.setAlpha(alpha2);
                                }
                            }
                            if (f49Var2.getVisibility() != 0) {
                                invalidate();
                            }
                            i49Var3 = i49Var4;
                            rectF4 = rectF5;
                            rectF3 = rectF7;
                            i2 = -1;
                        } else {
                            i = i8;
                            RectF rectF12 = rectF;
                            b5 = b8;
                            i3 = save;
                            hashMap2 = hashMap;
                            i49Var3 = i49Var;
                            rectF3 = rectF2;
                            rectF4 = rectF12;
                            canvas2.translate((rectF12.width() + childAt.getX()) - i49Var3.x.width(), (childAt.getY() + rectF3.top) - rectF4.top);
                            i2 = -1;
                            canvas2.saveLayerAlpha(0.0f, 0.0f, childAt.getMeasuredWidth(), childAt.getMeasuredHeight(), (int) ((1.0f - i4) * 255.0f), 31);
                            float f29 = 1.0f - e53Var.j;
                            canvas2.scale(f29, f29, r14.getMeasuredWidth() >> 1, r14.getMeasuredHeight() >> 1);
                            childAt.draw(canvas2);
                            canvas2.restore();
                        }
                        canvas2.restore();
                    }
                    i8 = i + 1;
                    i49Var = i49Var3;
                    rectF2 = rectF3;
                    rectF = rectF4;
                    i7 = i2;
                    hashMap = hashMap2;
                    b8 = b5;
                    save = i3;
                    z = true;
                }
                i49Var2 = i49Var;
                b4 = b8;
                canvas2.restoreToCount(save);
            } else {
                i49Var2 = i49Var;
                b4 = b8;
                f4 = 2.0f;
            }
            super.dispatchDraw(canvas);
            int i10 = e53Var.F;
            if (i10 < 5) {
                if (i10 == 3) {
                    i49Var2.setSkipDraw(true);
                }
                e53Var.F++;
            }
            Paint paint2 = a53Var.Z1;
            k0a k0aVar = a53Var.i0;
            ImageReceiver imageReceiver3 = a53Var.W0;
            if (a53Var.T0 != null) {
                imageReceiver3.p0(this);
                w0a w0aVar3 = a53Var.T0;
                if (w0aVar3 != null) {
                    float f30 = a53Var.V0;
                    if (f30 != 1.0f && !a53Var.U0 && a53Var.i1) {
                        float f31 = f30 + 0.010666667f;
                        a53Var.V0 = f31;
                        if (f31 >= 1.0f) {
                            a53Var.V0 = 1.0f;
                            l1a l1aVar = a53Var.I;
                            if (l1aVar != null) {
                                boolean z4 = w0aVar3.s;
                                i49 i49Var6 = (i49) ((ri6) l1aVar).b;
                                if (z4) {
                                    i49Var6.i(w0aVar3, w0aVar3.y, true);
                                } else {
                                    long j = w0aVar3.e.documentId;
                                    w49 w49Var2 = new w49();
                                    w49Var2.g = j;
                                    w49Var2.h = j;
                                    i49Var6.i(w0aVar3, w49Var2, true);
                                }
                            }
                        }
                        w0a w0aVar4 = a53Var.T0;
                        f30 = a53Var.V0;
                        w0aVar4.H = f30;
                    }
                    float f32 = (f30 * f4) + 1.0f;
                    canvas2.save();
                    canvas2.translate(a53Var.T0.getX() + k0aVar.getX(), a53Var.T0.getY() + k0aVar.getY() + a53Var.h0.getY());
                    paint2.setColor(aob.v0(aob.G8, a53Var.a1));
                    canvas2.drawRect(0.0f, 0.0f, a53Var.T0.getMeasuredWidth(), a53Var.T0.getMeasuredHeight(), paint2);
                    canvas2.scale(f32, f32, a53Var.T0.getMeasuredWidth() / f4, a53Var.T0.getMeasuredHeight());
                    w0a w0aVar5 = a53Var.T0;
                    if (!w0aVar5.s) {
                        imageReceiver3 = w0aVar5.r;
                    }
                    wl wlVar3 = a53Var.X0;
                    if (wlVar3 != null && (nlVar = wlVar3.k) != null && nlVar.B()) {
                        imageReceiver3 = a53Var.X0.k;
                    }
                    if (imageReceiver3 != null) {
                        imageReceiver3.i0(0.0f, 0.0f, a53Var.T0.getMeasuredWidth(), a53Var.T0.getMeasuredHeight());
                        imageReceiver3.h(canvas2, null);
                    }
                    canvas2.restore();
                    invalidate();
                }
            }
            if (b4 == 5) {
                canvas2.restore();
            }
            if (e53Var.x != null) {
                invalidate();
            }
            Runnable runnable = ri5.c;
            if (runnable != null) {
                runnable.run();
                ri5.c = null;
            }
        }
    }

    @Override // android.view.View
    public final void invalidate() {
        super.invalidate();
        e53 e53Var = this.x;
        i49 i49Var = e53Var.n;
        if (e53Var.y == 1 || !(i49Var == null || i49Var.getDelegate() == null || !i49Var.getDelegate().p())) {
            e53Var.m.g0.invalidate();
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
        e53 e53Var = this.x;
        i49 i49Var = e53Var.n;
        byte b = e53Var.y;
        if (b == 1 || b == 2 || b == 4) {
            measuredWidth = i49Var.getMeasuredWidth();
        } else if (b == 5) {
            measuredWidth = hl.L(12.0f) + (hl.L(36.0f) << 3);
        } else {
            measuredWidth = Math.min(View.MeasureSpec.getSize(i), View.MeasureSpec.getSize(i2));
            int L3 = (hl.L(36.0f) << 3) + hl.L(12.0f);
            if (L3 < measuredWidth) {
                measuredWidth = L3;
            }
        }
        if (b != 4) {
            if (i49Var.G0) {
                int ceil = (int) Math.ceil(e53Var.o.size() / 8.0f);
                if (ceil <= 8) {
                    i3 = hl.L(8.0f) + (hl.L(36.0f) * ceil);
                } else {
                    L = hl.L(36.0f) << 3;
                    L2 = hl.L(8.0f);
                }
            } else {
                i3 = measuredWidth;
            }
            if (b == 5) {
                i3 = Math.min(hl.L(254.0f), i3);
            }
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(measuredWidth, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(i3, TLObject.FLAG_30));
        }
        L = hl.L(36.0f) << 3;
        L2 = hl.L(8.0f);
        i3 = L - L2;
        if (b == 5) {
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(measuredWidth, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(i3, TLObject.FLAG_30));
    }

    @Override // snb
    public final void updateColors() {
        Paint paint;
        try {
            e53 e53Var = this.x;
            if (e53Var.y == 2 || (paint = this.c) == null) {
                return;
            }
            paint.setColor(aob.v0(aob.G8, e53Var.s));
            invalidate();
        } catch (Exception e) {
            cc4.g(e, true);
        }
    }

    @Override // snb
    public final void addColorKeys(HashSet hashSet) {
    }
}
