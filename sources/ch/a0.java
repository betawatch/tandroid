package ch;

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
import di.z2;
import java.util.HashMap;
import java.util.HashSet;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.a8;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.k5;
import org.telegram.messenger.qs;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.ActionBar.b6;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.l6;
import org.telegram.ui.ActionBar.s6;
import org.telegram.ui.Components.gi0;
import org.telegram.ui.Components.hi0;
import org.telegram.ui.Components.i5;
import org.telegram.ui.Components.ii0;
import org.telegram.ui.Components.ji0;
import org.telegram.ui.c11;
import org.telegram.ui.q01;
import org.telegram.ui.q11;
import ug.z0;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final class a0 extends FrameLayout implements b6 {
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
    public final /* synthetic */ b0 x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a0(b0 b0Var, Context context) {
        super(context);
        this.x = b0Var;
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
        int L = org.telegram.messenger.g0.L(7.0f);
        rect.bottom = L;
        rect.right = L;
        rect.top = L;
        rect.left = L;
        int i7 = l6.He;
        g6 g6Var = b0Var.s;
        s6.x(this, mutate, i7, g6Var, PorterDuff.Mode.MULTIPLY);
        if (b0Var.y == 2) {
            paint.setColor(i0.a.f(0.13f, -16777216, -1));
        } else {
            paint.setColor(l6.w0(l6.G8, g6Var));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:144:0x0446  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x043a  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0469  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void dispatchDraw(Canvas canvas) {
        float f10;
        boolean z9;
        HashMap hashMap;
        int i7;
        float f11;
        RectF rectF;
        float f12;
        RectF rectF2;
        int i10;
        ji0 ji0Var;
        int i11;
        ji0 ji0Var2;
        int i12;
        float f13;
        z2 z2Var;
        int i13;
        int i14;
        int i15;
        int i16;
        HashMap hashMap2;
        RectF rectF3;
        RectF rectF4;
        ji0 ji0Var3;
        RectF rectF5;
        RectF rectF6;
        float f14;
        float f15;
        float f16;
        float f17;
        float f18;
        ji0 ji0Var4;
        RectF rectF7;
        z2 z2Var2;
        int[] iArr;
        z2 z2Var3;
        float f19;
        int i17;
        float f20;
        float f21;
        float f22;
        float f23;
        float f24;
        float f25;
        float f26;
        float f27;
        float f28;
        o0 o0Var;
        int i18;
        float f29;
        Canvas canvas2 = canvas;
        b0 b0Var = this.x;
        RectF rectF8 = b0Var.f;
        int i19 = b0Var.y;
        RectF rectF9 = b0Var.i;
        w wVar = b0Var.m;
        ji0 ji0Var5 = b0Var.n;
        if (b0Var.l) {
            float i20 = Utilities.i(b0Var.j, 1.0f, 0.0f);
            RectF rectF10 = org.telegram.messenger.g0.P;
            rectF10.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
            if (i19 == 4) {
                rectF8.set(ji0Var5.x);
                rectF8.offset(b0Var.g, b0Var.h);
            }
            org.telegram.messenger.g0.Z1(rectF8, rectF10, b0Var.j, rectF9);
            float T1 = org.telegram.messenger.g0.T1(b0Var.e, org.telegram.messenger.g0.L(i19 == 5 ? 20.0f : 8.0f), b0Var.j);
            HashMap hashMap3 = this.e;
            hashMap3.clear();
            if (i19 == 1 || (ji0Var5.getDelegate() != null && ji0Var5.getDelegate().U())) {
                f10 = 1.0f;
                ii0 delegate = ji0Var5.getDelegate();
                float x10 = getX();
                a0 a0Var = b0Var.a;
                z9 = true;
                hashMap = hashMap3;
                i7 = 4;
                f11 = 255.0f;
                delegate.L(canvas, rectF9, T1, x10, i19 == 1 ? a0Var.getY() - org.telegram.messenger.g0.m : a0Var.getY() + b0Var.c.getY(), qs.e4, true);
                canvas2 = canvas;
                rectF = rectF9;
            } else {
                int i21 = (int) (Utilities.i(i20 / 0.05f, 1.0f, 0.0f) * 255.0f);
                Drawable drawable = this.a;
                drawable.setAlpha(i21);
                int i22 = (int) rectF9.left;
                Rect rect = this.b;
                f10 = 1.0f;
                drawable.setBounds(i22 - rect.left, ((int) rectF9.top) - rect.top, ((int) rectF9.right) + rect.right, ((int) rectF9.bottom) + rect.bottom);
                fh.g gVar = b0Var.z;
                Paint paint = this.c;
                if (gVar != null) {
                    rectF10.set(rectF9);
                    Rect rect2 = org.telegram.messenger.g0.Q;
                    rectF10.round(rect2);
                    rect2.inset(-org.telegram.messenger.g0.L(8.0f), -org.telegram.messenger.g0.L(8.0f));
                    b0Var.z.setBounds(rect2);
                    b0Var.z.setAlpha(paint.getAlpha());
                    b0Var.z.r(T1);
                    b0Var.z.draw(canvas2);
                } else {
                    drawable.draw(canvas2);
                    canvas2.drawRoundRect(rectF9, T1, T1, paint);
                }
                rectF = rectF9;
                hashMap = hashMap3;
                i7 = 4;
                f11 = 255.0f;
                z9 = true;
            }
            if (ji0Var5.R0 != null) {
                canvas2.save();
                float f30 = rectF.left;
                float y10 = ji0Var5.R0.getY() + rectF.top;
                if (i19 == 3 || i19 == i7) {
                    i18 = 5;
                } else {
                    i18 = 5;
                    if (i19 != 5) {
                        f29 = 0.0f;
                        canvas2.translate(f30, y10 - f29);
                        rectF2 = rectF8;
                        f12 = T1;
                        i10 = i18;
                        canvas2.saveLayerAlpha(0.0f, 0.0f, ji0Var5.R0.getMeasuredWidth(), ji0Var5.R0.getMeasuredHeight(), (int) ((f10 - b0Var.j) * ji0Var5.R0.getAlpha() * f11), 31);
                        ji0Var5.R0.draw(canvas2);
                        canvas2.restore();
                        canvas2.restore();
                    }
                }
                f29 = ji0Var5.x.top;
                canvas2.translate(f30, y10 - f29);
                rectF2 = rectF8;
                f12 = T1;
                i10 = i18;
                canvas2.saveLayerAlpha(0.0f, 0.0f, ji0Var5.R0.getMeasuredWidth(), ji0Var5.R0.getMeasuredHeight(), (int) ((f10 - b0Var.j) * ji0Var5.R0.getAlpha() * f11), 31);
                ji0Var5.R0.draw(canvas2);
                canvas2.restore();
                canvas2.restore();
            } else {
                f12 = T1;
                rectF2 = rectF8;
                i10 = 5;
            }
            float width = (rectF.width() - ji0Var5.x.width()) + (rectF.left - ji0Var5.x.left);
            if (b0Var.j > 0.05f || i19 == i10) {
                canvas2.save();
                canvas2.translate(width, (rectF.height() - ji0Var5.x.height()) + (rectF.top - ji0Var5.x.top));
                float max = (Math.max(0.25f, Math.min(ji0Var5.w, f10)) - 0.25f) / 0.75f;
                Canvas canvas3 = canvas2;
                ji0Var5.f(ji0Var5.E * max, max, ji0Var5.F * max, ji0Var5.M0 == i10 ? qs.e4 : (int) k5.A(1.0f, ji0Var5.w0, Utilities.i(ji0Var5.w0 / 0.2f, 1.0f, 0.0f), f11), canvas3);
                ji0Var = ji0Var5;
                canvas2 = canvas3;
                canvas2.restore();
                i11 = 5;
            } else {
                i11 = i10;
                ji0Var = ji0Var5;
            }
            if (i19 == i11) {
                Path path = this.w;
                path.rewind();
                path.addRoundRect(rectF, f12, f12, Path.Direction.CW);
                canvas2.save();
                canvas2.clipPath(path);
            }
            this.f = 0.0f;
            this.h = 0.0f;
            this.n = 1.0f;
            this.r = 0.0f;
            this.s = 0.0f;
            if (ji0Var != null) {
                for (int childCount = wVar.h0.getChildCount() - 1; childCount >= 0; childCount--) {
                    if (wVar.h0.getChildAt(childCount) instanceof c11) {
                        c11 c11Var = (c11) wVar.h0.getChildAt(childCount);
                        if (c11Var.D && (o0Var = c11Var.y) != null) {
                            hashMap.put(o0Var, c11Var);
                        }
                    }
                }
                int save = canvas2.save();
                canvas2.translate(rectF.left, com.google.android.recaptcha.internal.a.z(1.0f, b0Var.j, ji0Var.g() + ji0Var.getTopOffset(), rectF.top));
                float max2 = Math.max(1.0f - (wVar.i0.getVisibility() == 0 ? wVar.i0.getAlpha() : 0.0f), 1.0f - b0Var.j);
                if (max2 != 1.0f) {
                    canvas2.saveLayerAlpha(0.0f, 0.0f, rectF.width(), rectF.height(), (int) (max2 * 255.0f), 31);
                }
                int x11 = (int) (wVar.h0.getX() + wVar.getX());
                int y11 = (int) (wVar.h0.getY() + wVar.getY());
                boolean z10 = wVar.d0.getParent() != null ? z9 : false;
                if (i19 != 5) {
                    float f31 = y11;
                    if (z10) {
                        f13 = 2.0f;
                        f28 = x11 + (org.telegram.messenger.g0.L(36.0f) * b0Var.j);
                    } else {
                        f13 = 2.0f;
                        f28 = 0.0f;
                    }
                    canvas2.clipRect(f31, f28, wVar.h0.getMeasuredWidth() + y11, wVar.h0.getMeasuredHeight() + x11);
                } else {
                    f13 = 2.0f;
                }
                int i23 = -1;
                int i24 = -1;
                while (i24 < ji0Var.b.getChildCount()) {
                    View childAt = i24 == i23 ? ji0Var.z0 : ji0Var.b.getChildAt(i24);
                    if (childAt.getLeft() < 0 || childAt.getVisibility() == 8) {
                        i13 = i24;
                        i14 = i19;
                        i15 = i23;
                        i16 = save;
                        hashMap2 = hashMap;
                        rectF3 = rectF2;
                        rectF4 = rectF;
                        ji0Var3 = ji0Var;
                    } else {
                        canvas2.save();
                        if (childAt instanceof hi0) {
                            hi0 hi0Var = (hi0) childAt;
                            gi0 gi0Var = hi0Var.a;
                            gi0 gi0Var2 = hi0Var.b;
                            z0 z0Var = hi0Var.f;
                            if (z0Var != null) {
                                z0Var.setAlpha(1.0f - b0Var.j);
                            }
                            c11 c11Var2 = (c11) hashMap.get(hi0Var.e);
                            if (c11Var2 != null) {
                                float x12 = childAt.getX();
                                float y12 = childAt.getY();
                                if (i24 == -1) {
                                    x12 -= ji0Var.b.getX();
                                    f19 = y12 - ji0Var.b.getY();
                                } else {
                                    f19 = y12;
                                }
                                i13 = i24;
                                float x13 = ((wVar.h0.getX() + (wVar.getX() + c11Var2.getX())) - gi0Var2.getX()) - org.telegram.messenger.g0.L(1.0f);
                                float y13 = (wVar.h0.getY() + (wVar.g0.getY() + (wVar.getY() + c11Var2.getY()))) - gi0Var2.getY();
                                float measuredWidth = c11Var2.getMeasuredWidth();
                                if (c11Var2.L) {
                                    i17 = 4;
                                } else {
                                    i17 = 4;
                                    if (i19 != 4) {
                                        f22 = x13;
                                        hashMap2 = hashMap;
                                        float f32 = y13;
                                        i14 = i19;
                                        float T12 = org.telegram.messenger.g0.T1(x12, f22, b0Var.j);
                                        float f33 = x12;
                                        float T13 = org.telegram.messenger.g0.T1(f19, f32, b0Var.j);
                                        float f34 = f19;
                                        float measuredWidth2 = measuredWidth / gi0Var2.getMeasuredWidth();
                                        i16 = save;
                                        rectF5 = rectF;
                                        f18 = org.telegram.messenger.g0.T1(1.0f, measuredWidth2, b0Var.j);
                                        if (hi0Var.D != 0) {
                                            f23 = org.telegram.messenger.g0.L(6.0f);
                                            f25 = f23;
                                            f24 = 0.0f;
                                        } else if (hi0Var.x) {
                                            f23 = org.telegram.messenger.g0.L(6.0f);
                                            f24 = f23;
                                            f25 = f24;
                                            f26 = f25;
                                            canvas2.translate(T12, T13);
                                            canvas2.scale(f18, f18);
                                            if (this.f == 0.0f || this.h != 0.0f) {
                                                f27 = f23;
                                                rectF6 = rectF2;
                                            } else {
                                                rectF6 = rectF2;
                                                f27 = f23;
                                                this.f = org.telegram.messenger.g0.T1((rectF6.left + f33) - f22, 0.0f, b0Var.j);
                                                this.h = org.telegram.messenger.g0.T1((rectF6.top + f34) - f32, 0.0f, b0Var.j);
                                                this.n = org.telegram.messenger.g0.T1(1.0f / measuredWidth2, 1.0f, b0Var.j);
                                                this.r = f22;
                                                this.s = f32;
                                            }
                                            f15 = f27;
                                            f16 = f24;
                                            f14 = f25;
                                            f17 = f26;
                                        } else {
                                            f23 = 0.0f;
                                            f24 = 0.0f;
                                            f25 = 0.0f;
                                        }
                                        f26 = 0.0f;
                                        canvas2.translate(T12, T13);
                                        canvas2.scale(f18, f18);
                                        if (this.f == 0.0f) {
                                        }
                                        f27 = f23;
                                        rectF6 = rectF2;
                                        f15 = f27;
                                        f16 = f24;
                                        f14 = f25;
                                        f17 = f26;
                                    }
                                }
                                if (i19 == i17) {
                                    f20 = x13 - org.telegram.messenger.g0.L(0.33f);
                                    y13 -= org.telegram.messenger.g0.L(1.33f);
                                    f21 = 0.87f * measuredWidth;
                                } else {
                                    f20 = x13;
                                    f21 = measuredWidth;
                                }
                                float f35 = c11Var2.L ? 0.95f * f21 : f21;
                                float f36 = (measuredWidth - f35) / f13;
                                measuredWidth = f35;
                                f22 = f20 + f36;
                                y13 += f36;
                                hashMap2 = hashMap;
                                float f322 = y13;
                                i14 = i19;
                                float T122 = org.telegram.messenger.g0.T1(x12, f22, b0Var.j);
                                float f332 = x12;
                                float T132 = org.telegram.messenger.g0.T1(f19, f322, b0Var.j);
                                float f342 = f19;
                                float measuredWidth22 = measuredWidth / gi0Var2.getMeasuredWidth();
                                i16 = save;
                                rectF5 = rectF;
                                f18 = org.telegram.messenger.g0.T1(1.0f, measuredWidth22, b0Var.j);
                                if (hi0Var.D != 0) {
                                }
                                f26 = 0.0f;
                                canvas2.translate(T122, T132);
                                canvas2.scale(f18, f18);
                                if (this.f == 0.0f) {
                                }
                                f27 = f23;
                                rectF6 = rectF2;
                                f15 = f27;
                                f16 = f24;
                                f14 = f25;
                                f17 = f26;
                            } else {
                                i13 = i24;
                                rectF5 = rectF;
                                i14 = i19;
                                i16 = save;
                                hashMap2 = hashMap;
                                rectF6 = rectF2;
                                canvas2.translate(gi0Var2.getX() + childAt.getX(), gi0Var2.getY() + childAt.getY());
                                f14 = 0.0f;
                                f15 = 0.0f;
                                f16 = 0.0f;
                                f17 = 0.0f;
                                f18 = 1.0f;
                            }
                            if (c11Var2 != null) {
                                if (c11Var2.L) {
                                    float measuredWidth3 = hi0Var.getMeasuredWidth() / f13;
                                    float measuredHeight = hi0Var.getMeasuredHeight() / f13;
                                    float measuredWidth4 = hi0Var.getMeasuredWidth() - org.telegram.messenger.g0.L(f13);
                                    float T14 = org.telegram.messenger.g0.T1(measuredWidth4, (c11Var2.getMeasuredWidth() - org.telegram.messenger.g0.L(f13)) / f18, b0Var.j);
                                    RectF rectF11 = org.telegram.messenger.g0.P;
                                    float f37 = T14 / f13;
                                    rectF7 = rectF6;
                                    ji0Var4 = ji0Var;
                                    rectF11.set(measuredWidth3 - f37, measuredHeight - f37, measuredWidth3 + f37, measuredHeight + f37);
                                    float T15 = org.telegram.messenger.g0.T1(measuredWidth4 / f13, org.telegram.messenger.g0.L(4.0f), b0Var.j);
                                    canvas2.drawRoundRect(rectF11, T15, T15, wVar.L);
                                } else {
                                    ji0Var4 = ji0Var;
                                    rectF7 = rectF6;
                                }
                                hi0Var.y = false;
                                if (f14 == 0.0f) {
                                    hi0Var.draw(canvas2);
                                } else {
                                    ImageReceiver imageReceiver = gi0Var2.getImageReceiver();
                                    hi0Var.b();
                                    i5 i5Var = gi0Var2.e;
                                    if (i5Var != null && (z2Var3 = i5Var.k) != null) {
                                        imageReceiver = z2Var3;
                                    }
                                    int[] iArr2 = imageReceiver.W0;
                                    int i25 = 0;
                                    while (true) {
                                        iArr = this.d;
                                        if (i25 >= 4) {
                                            break;
                                        }
                                        iArr[i25] = iArr2[i25];
                                        i25++;
                                    }
                                    imageReceiver.K0((int) org.telegram.messenger.g0.T1(f15, 0.0f, b0Var.j), (int) org.telegram.messenger.g0.T1(f16, 0.0f, b0Var.j), (int) org.telegram.messenger.g0.T1(f17, 0.0f, b0Var.j), (int) org.telegram.messenger.g0.T1(f14, 0.0f, b0Var.j));
                                    hi0Var.draw(canvas2);
                                    imageReceiver.L0(iArr);
                                }
                                boolean z11 = z9;
                                hi0Var.y = z11;
                                if (!c11Var2.b) {
                                    c11Var2.b = z11;
                                    c11Var2.invalidate();
                                }
                            } else {
                                ji0Var4 = ji0Var;
                                rectF7 = rectF6;
                                if (hi0Var.r && gi0Var2.getImageReceiver().B() == null) {
                                    float alpha = gi0Var.getImageReceiver().getAlpha();
                                    gi0Var.getImageReceiver().setAlpha((1.0f - i20) * alpha);
                                    gi0Var.draw(canvas2);
                                    gi0Var.getImageReceiver().setAlpha(alpha);
                                } else {
                                    hi0Var.b();
                                    ImageReceiver imageReceiver2 = gi0Var2.getImageReceiver();
                                    i5 i5Var2 = gi0Var2.e;
                                    if (i5Var2 != null && (z2Var2 = i5Var2.k) != null) {
                                        imageReceiver2 = z2Var2;
                                    }
                                    float alpha2 = imageReceiver2.getAlpha();
                                    imageReceiver2.setAlpha((1.0f - i20) * alpha2);
                                    gi0Var2.draw(canvas2);
                                    imageReceiver2.setAlpha(alpha2);
                                }
                            }
                            if (gi0Var2.getVisibility() != 0) {
                                invalidate();
                            }
                            ji0Var3 = ji0Var4;
                            rectF4 = rectF5;
                            rectF3 = rectF7;
                            i15 = -1;
                        } else {
                            i13 = i24;
                            RectF rectF12 = rectF;
                            i14 = i19;
                            i16 = save;
                            hashMap2 = hashMap;
                            ji0Var3 = ji0Var;
                            rectF3 = rectF2;
                            rectF4 = rectF12;
                            canvas2.translate((rectF12.width() + childAt.getX()) - ji0Var3.x.width(), (childAt.getY() + rectF3.top) - rectF4.top);
                            i15 = -1;
                            canvas2.saveLayerAlpha(0.0f, 0.0f, childAt.getMeasuredWidth(), childAt.getMeasuredHeight(), (int) ((1.0f - i20) * 255.0f), 31);
                            float f38 = 1.0f - b0Var.j;
                            canvas2.scale(f38, f38, r14.getMeasuredWidth() >> 1, r14.getMeasuredHeight() >> 1);
                            childAt.draw(canvas2);
                            canvas2.restore();
                        }
                        canvas2.restore();
                    }
                    i24 = i13 + 1;
                    ji0Var = ji0Var3;
                    rectF2 = rectF3;
                    rectF = rectF4;
                    i23 = i15;
                    hashMap = hashMap2;
                    i19 = i14;
                    save = i16;
                    z9 = true;
                }
                ji0Var2 = ji0Var;
                i12 = i19;
                canvas2.restoreToCount(save);
            } else {
                ji0Var2 = ji0Var;
                i12 = i19;
                f13 = 2.0f;
            }
            super.dispatchDraw(canvas);
            int i26 = b0Var.F;
            if (i26 < 5) {
                if (i26 == 3) {
                    ji0Var2.setSkipDraw(true);
                }
                b0Var.F++;
            }
            Paint paint2 = wVar.Y1;
            q01 q01Var = wVar.h0;
            ImageReceiver imageReceiver3 = wVar.V0;
            if (wVar.S0 != null) {
                imageReceiver3.H0(this);
                c11 c11Var3 = wVar.S0;
                if (c11Var3 != null) {
                    float f39 = wVar.U0;
                    if (f39 != 1.0f && !wVar.T0 && wVar.h1) {
                        float f40 = f39 + 0.010666667f;
                        wVar.U0 = f40;
                        if (f40 >= 1.0f) {
                            wVar.U0 = 1.0f;
                            q11 q11Var = wVar.H;
                            if (q11Var != null) {
                                ji0 ji0Var6 = (ji0) ((aa.n) q11Var).b;
                                if (c11Var3.s) {
                                    ji0Var6.l(c11Var3, c11Var3.y, true);
                                } else {
                                    long j3 = c11Var3.e.documentId;
                                    o0 o0Var2 = new o0();
                                    o0Var2.g = j3;
                                    o0Var2.h = j3;
                                    ji0Var6.l(c11Var3, o0Var2, true);
                                }
                            }
                        }
                        wVar.S0.G = wVar.U0;
                    }
                    float f41 = (wVar.U0 * f13) + 1.0f;
                    canvas2.save();
                    canvas2.translate(wVar.S0.getX() + q01Var.getX(), wVar.S0.getY() + q01Var.getY() + wVar.g0.getY());
                    paint2.setColor(l6.w0(l6.G8, wVar.Z0));
                    canvas2.drawRect(0.0f, 0.0f, wVar.S0.getMeasuredWidth(), wVar.S0.getMeasuredHeight(), paint2);
                    canvas2.scale(f41, f41, wVar.S0.getMeasuredWidth() / f13, wVar.S0.getMeasuredHeight());
                    c11 c11Var4 = wVar.S0;
                    if (!c11Var4.s) {
                        imageReceiver3 = c11Var4.r;
                    }
                    i5 i5Var3 = wVar.W0;
                    if (i5Var3 != null && (z2Var = i5Var3.k) != null && z2Var.I()) {
                        imageReceiver3 = wVar.W0.k;
                    }
                    if (imageReceiver3 != null) {
                        imageReceiver3.y0(0.0f, 0.0f, wVar.S0.getMeasuredWidth(), wVar.S0.getMeasuredHeight());
                        imageReceiver3.h(canvas2, null);
                    }
                    canvas2.restore();
                    invalidate();
                }
            }
            if (i12 == 5) {
                canvas2.restore();
            }
            if (b0Var.x != null) {
                invalidate();
            }
            Runnable runnable = e0.c;
            if (runnable != null) {
                runnable.run();
                e0.c = null;
            }
        }
    }

    @Override // android.view.View
    public final void invalidate() {
        super.invalidate();
        b0 b0Var = this.x;
        ji0 ji0Var = b0Var.n;
        if (b0Var.y == 1 || !(ji0Var == null || ji0Var.getDelegate() == null || !ji0Var.getDelegate().U())) {
            b0Var.m.f0.invalidate();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0083  */
    @Override // android.widget.FrameLayout, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onMeasure(int i7, int i10) {
        int measuredWidth;
        int i11;
        int L;
        int L2;
        b0 b0Var = this.x;
        int i12 = b0Var.y;
        if (i12 == 1 || i12 == 2 || i12 == 4) {
            measuredWidth = b0Var.n.getMeasuredWidth();
        } else if (i12 == 5) {
            measuredWidth = org.telegram.messenger.g0.L(12.0f) + (org.telegram.messenger.g0.L(36.0f) * 8);
        } else {
            measuredWidth = Math.min(View.MeasureSpec.getSize(i7), View.MeasureSpec.getSize(i10));
            int L3 = (org.telegram.messenger.g0.L(36.0f) * 8) + org.telegram.messenger.g0.L(12.0f);
            if (L3 < measuredWidth) {
                measuredWidth = L3;
            }
        }
        if (b0Var.y != 4) {
            if (b0Var.n.F0) {
                int ceil = (int) Math.ceil(b0Var.o.size() / 8.0f);
                if (ceil <= 8) {
                    i11 = org.telegram.messenger.g0.L(8.0f) + (org.telegram.messenger.g0.L(36.0f) * ceil);
                } else {
                    L = org.telegram.messenger.g0.L(36.0f) * 8;
                    L2 = org.telegram.messenger.g0.L(8.0f);
                }
            } else {
                i11 = measuredWidth;
            }
            if (b0Var.y == 5) {
                i11 = Math.min(org.telegram.messenger.g0.L(254.0f), i11);
            }
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(measuredWidth, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(i11, TLObject.FLAG_30));
        }
        L = org.telegram.messenger.g0.L(36.0f) * 8;
        L2 = org.telegram.messenger.g0.L(8.0f);
        i11 = L - L2;
        if (b0Var.y == 5) {
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(measuredWidth, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(i11, TLObject.FLAG_30));
    }

    @Override // org.telegram.ui.ActionBar.b6
    public final void updateColors() {
        Paint paint;
        try {
            b0 b0Var = this.x;
            if (b0Var.y == 2 || (paint = this.c) == null) {
                return;
            }
            paint.setColor(l6.w0(l6.G8, b0Var.s));
            invalidate();
        } catch (Exception e10) {
            a8.g(e10, true);
        }
    }

    @Override // org.telegram.ui.ActionBar.b6
    public final /* synthetic */ void addColorKeys(HashSet hashSet) {
    }
}
