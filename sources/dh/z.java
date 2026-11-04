package dh;

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
import ei.c3;
import java.util.HashMap;
import java.util.HashSet;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.a8;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.hs;
import org.telegram.messenger.k5;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.r6;
import org.telegram.ui.ActionBar.z5;
import org.telegram.ui.Components.g5;
import org.telegram.ui.Components.ii0;
import org.telegram.ui.Components.ji0;
import org.telegram.ui.Components.ki0;
import org.telegram.ui.Components.li0;
import org.telegram.ui.e01;
import org.telegram.ui.e11;
import org.telegram.ui.q01;
import vg.y0;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class z extends FrameLayout implements z5 {
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
    public final /* synthetic */ a0 x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(a0 a0Var, Context context) {
        super(context);
        this.x = a0Var;
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
        int i3 = k6.He;
        e6 e6Var = a0Var.s;
        r6.y(this, mutate, i3, e6Var, PorterDuff.Mode.MULTIPLY);
        if (a0Var.y == 2) {
            paint.setColor(i0.a.f(0.13f, -16777216, -1));
        } else {
            paint.setColor(k6.w0(k6.G8, e6Var));
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
        boolean z10;
        HashMap hashMap;
        int i3;
        float f11;
        RectF rectF;
        float f12;
        RectF rectF2;
        int i10;
        li0 li0Var;
        int i11;
        li0 li0Var2;
        int i12;
        float f13;
        c3 c3Var;
        int i13;
        int i14;
        int i15;
        int i16;
        HashMap hashMap2;
        RectF rectF3;
        RectF rectF4;
        li0 li0Var3;
        RectF rectF5;
        RectF rectF6;
        float f14;
        float f15;
        float f16;
        float f17;
        float f18;
        li0 li0Var4;
        RectF rectF7;
        c3 c3Var2;
        int[] iArr;
        c3 c3Var3;
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
        n0 n0Var;
        int i18;
        float f29;
        Canvas canvas2 = canvas;
        a0 a0Var = this.x;
        RectF rectF8 = a0Var.f;
        int i19 = a0Var.y;
        RectF rectF9 = a0Var.i;
        v vVar = a0Var.m;
        li0 li0Var5 = a0Var.n;
        if (a0Var.l) {
            float i20 = Utilities.i(a0Var.j, 1.0f, 0.0f);
            RectF rectF10 = org.telegram.messenger.g0.P;
            rectF10.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
            if (i19 == 4) {
                rectF8.set(li0Var5.x);
                rectF8.offset(a0Var.g, a0Var.h);
            }
            org.telegram.messenger.g0.Z1(rectF8, rectF10, a0Var.j, rectF9);
            float T1 = org.telegram.messenger.g0.T1(a0Var.e, org.telegram.messenger.g0.L(i19 == 5 ? 20.0f : 8.0f), a0Var.j);
            HashMap hashMap3 = this.e;
            hashMap3.clear();
            if (i19 == 1 || (li0Var5.getDelegate() != null && li0Var5.getDelegate().O())) {
                f10 = 1.0f;
                ki0 delegate = li0Var5.getDelegate();
                float x10 = getX();
                z zVar = a0Var.a;
                z10 = true;
                hashMap = hashMap3;
                i3 = 4;
                f11 = 255.0f;
                delegate.E(canvas, rectF9, T1, x10, i19 == 1 ? zVar.getY() - org.telegram.messenger.g0.m : zVar.getY() + a0Var.c.getY(), hs.e4, true);
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
                gh.g gVar = a0Var.z;
                Paint paint = this.c;
                if (gVar != null) {
                    rectF10.set(rectF9);
                    Rect rect2 = org.telegram.messenger.g0.Q;
                    rectF10.round(rect2);
                    rect2.inset(-org.telegram.messenger.g0.L(8.0f), -org.telegram.messenger.g0.L(8.0f));
                    a0Var.z.setBounds(rect2);
                    a0Var.z.setAlpha(paint.getAlpha());
                    a0Var.z.r(T1);
                    a0Var.z.draw(canvas2);
                } else {
                    drawable.draw(canvas2);
                    canvas2.drawRoundRect(rectF9, T1, T1, paint);
                }
                rectF = rectF9;
                hashMap = hashMap3;
                i3 = 4;
                f11 = 255.0f;
                z10 = true;
            }
            if (li0Var5.S0 != null) {
                canvas2.save();
                float f30 = rectF.left;
                float y9 = li0Var5.S0.getY() + rectF.top;
                if (i19 == 3 || i19 == i3) {
                    i18 = 5;
                } else {
                    i18 = 5;
                    if (i19 != 5) {
                        f29 = 0.0f;
                        canvas2.translate(f30, y9 - f29);
                        rectF2 = rectF8;
                        f12 = T1;
                        i10 = i18;
                        canvas2.saveLayerAlpha(0.0f, 0.0f, li0Var5.S0.getMeasuredWidth(), li0Var5.S0.getMeasuredHeight(), (int) ((f10 - a0Var.j) * li0Var5.S0.getAlpha() * f11), 31);
                        li0Var5.S0.draw(canvas2);
                        canvas2.restore();
                        canvas2.restore();
                    }
                }
                f29 = li0Var5.x.top;
                canvas2.translate(f30, y9 - f29);
                rectF2 = rectF8;
                f12 = T1;
                i10 = i18;
                canvas2.saveLayerAlpha(0.0f, 0.0f, li0Var5.S0.getMeasuredWidth(), li0Var5.S0.getMeasuredHeight(), (int) ((f10 - a0Var.j) * li0Var5.S0.getAlpha() * f11), 31);
                li0Var5.S0.draw(canvas2);
                canvas2.restore();
                canvas2.restore();
            } else {
                f12 = T1;
                rectF2 = rectF8;
                i10 = 5;
            }
            float width = (rectF.width() - li0Var5.x.width()) + (rectF.left - li0Var5.x.left);
            if (a0Var.j > 0.05f || i19 == i10) {
                canvas2.save();
                canvas2.translate(width, (rectF.height() - li0Var5.x.height()) + (rectF.top - li0Var5.x.top));
                float max = (Math.max(0.25f, Math.min(li0Var5.w, f10)) - 0.25f) / 0.75f;
                Canvas canvas3 = canvas2;
                li0Var5.f(li0Var5.F * max, max, li0Var5.G * max, li0Var5.N0 == i10 ? hs.e4 : (int) k5.A(1.0f, li0Var5.x0, Utilities.i(li0Var5.x0 / 0.2f, 1.0f, 0.0f), f11), canvas3);
                li0Var = li0Var5;
                canvas2 = canvas3;
                canvas2.restore();
                i11 = 5;
            } else {
                i11 = i10;
                li0Var = li0Var5;
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
            if (li0Var != null) {
                for (int childCount = vVar.i0.getChildCount() - 1; childCount >= 0; childCount--) {
                    if (vVar.i0.getChildAt(childCount) instanceof q01) {
                        q01 q01Var = (q01) vVar.i0.getChildAt(childCount);
                        if (q01Var.E && (n0Var = q01Var.y) != null) {
                            hashMap.put(n0Var, q01Var);
                        }
                    }
                }
                int save = canvas2.save();
                canvas2.translate(rectF.left, com.google.android.recaptcha.internal.a.y(1.0f, a0Var.j, li0Var.g() + li0Var.getTopOffset(), rectF.top));
                float max2 = Math.max(1.0f - (vVar.j0.getVisibility() == 0 ? vVar.j0.getAlpha() : 0.0f), 1.0f - a0Var.j);
                if (max2 != 1.0f) {
                    canvas2.saveLayerAlpha(0.0f, 0.0f, rectF.width(), rectF.height(), (int) (max2 * 255.0f), 31);
                }
                int x11 = (int) (vVar.i0.getX() + vVar.getX());
                int y10 = (int) (vVar.i0.getY() + vVar.getY());
                boolean z11 = vVar.e0.getParent() != null ? z10 : false;
                if (i19 != 5) {
                    float f31 = y10;
                    if (z11) {
                        f13 = 2.0f;
                        f28 = x11 + (org.telegram.messenger.g0.L(36.0f) * a0Var.j);
                    } else {
                        f13 = 2.0f;
                        f28 = 0.0f;
                    }
                    canvas2.clipRect(f31, f28, vVar.i0.getMeasuredWidth() + y10, vVar.i0.getMeasuredHeight() + x11);
                } else {
                    f13 = 2.0f;
                }
                int i23 = -1;
                int i24 = -1;
                while (i24 < li0Var.b.getChildCount()) {
                    View childAt = i24 == i23 ? li0Var.A0 : li0Var.b.getChildAt(i24);
                    if (childAt.getLeft() < 0 || childAt.getVisibility() == 8) {
                        i13 = i24;
                        i14 = i19;
                        i15 = i23;
                        i16 = save;
                        hashMap2 = hashMap;
                        rectF3 = rectF2;
                        rectF4 = rectF;
                        li0Var3 = li0Var;
                    } else {
                        canvas2.save();
                        if (childAt instanceof ji0) {
                            ji0 ji0Var = (ji0) childAt;
                            ii0 ii0Var = ji0Var.a;
                            ii0 ii0Var2 = ji0Var.b;
                            y0 y0Var = ji0Var.f;
                            if (y0Var != null) {
                                y0Var.setAlpha(1.0f - a0Var.j);
                            }
                            q01 q01Var2 = (q01) hashMap.get(ji0Var.e);
                            if (q01Var2 != null) {
                                float x12 = childAt.getX();
                                float y11 = childAt.getY();
                                if (i24 == -1) {
                                    x12 -= li0Var.b.getX();
                                    f19 = y11 - li0Var.b.getY();
                                } else {
                                    f19 = y11;
                                }
                                i13 = i24;
                                float x13 = ((vVar.i0.getX() + (vVar.getX() + q01Var2.getX())) - ii0Var2.getX()) - org.telegram.messenger.g0.L(1.0f);
                                float y12 = (vVar.i0.getY() + (vVar.h0.getY() + (vVar.getY() + q01Var2.getY()))) - ii0Var2.getY();
                                float measuredWidth = q01Var2.getMeasuredWidth();
                                if (q01Var2.M) {
                                    i17 = 4;
                                } else {
                                    i17 = 4;
                                    if (i19 != 4) {
                                        f22 = x13;
                                        hashMap2 = hashMap;
                                        float f32 = y12;
                                        i14 = i19;
                                        float T12 = org.telegram.messenger.g0.T1(x12, f22, a0Var.j);
                                        float f33 = x12;
                                        float T13 = org.telegram.messenger.g0.T1(f19, f32, a0Var.j);
                                        float f34 = f19;
                                        float measuredWidth2 = measuredWidth / ii0Var2.getMeasuredWidth();
                                        i16 = save;
                                        rectF5 = rectF;
                                        f18 = org.telegram.messenger.g0.T1(1.0f, measuredWidth2, a0Var.j);
                                        if (ji0Var.E != 0) {
                                            f23 = org.telegram.messenger.g0.L(6.0f);
                                            f25 = f23;
                                            f24 = 0.0f;
                                        } else if (ji0Var.x) {
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
                                                this.f = org.telegram.messenger.g0.T1((rectF6.left + f33) - f22, 0.0f, a0Var.j);
                                                this.h = org.telegram.messenger.g0.T1((rectF6.top + f34) - f32, 0.0f, a0Var.j);
                                                this.n = org.telegram.messenger.g0.T1(1.0f / measuredWidth2, 1.0f, a0Var.j);
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
                                    y12 -= org.telegram.messenger.g0.L(1.33f);
                                    f21 = 0.87f * measuredWidth;
                                } else {
                                    f20 = x13;
                                    f21 = measuredWidth;
                                }
                                float f35 = q01Var2.M ? 0.95f * f21 : f21;
                                float f36 = (measuredWidth - f35) / f13;
                                measuredWidth = f35;
                                f22 = f20 + f36;
                                y12 += f36;
                                hashMap2 = hashMap;
                                float f322 = y12;
                                i14 = i19;
                                float T122 = org.telegram.messenger.g0.T1(x12, f22, a0Var.j);
                                float f332 = x12;
                                float T132 = org.telegram.messenger.g0.T1(f19, f322, a0Var.j);
                                float f342 = f19;
                                float measuredWidth22 = measuredWidth / ii0Var2.getMeasuredWidth();
                                i16 = save;
                                rectF5 = rectF;
                                f18 = org.telegram.messenger.g0.T1(1.0f, measuredWidth22, a0Var.j);
                                if (ji0Var.E != 0) {
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
                                canvas2.translate(ii0Var2.getX() + childAt.getX(), ii0Var2.getY() + childAt.getY());
                                f14 = 0.0f;
                                f15 = 0.0f;
                                f16 = 0.0f;
                                f17 = 0.0f;
                                f18 = 1.0f;
                            }
                            if (q01Var2 != null) {
                                if (q01Var2.M) {
                                    float measuredWidth3 = ji0Var.getMeasuredWidth() / f13;
                                    float measuredHeight = ji0Var.getMeasuredHeight() / f13;
                                    float measuredWidth4 = ji0Var.getMeasuredWidth() - org.telegram.messenger.g0.L(f13);
                                    float T14 = org.telegram.messenger.g0.T1(measuredWidth4, (q01Var2.getMeasuredWidth() - org.telegram.messenger.g0.L(f13)) / f18, a0Var.j);
                                    RectF rectF11 = org.telegram.messenger.g0.P;
                                    float f37 = T14 / f13;
                                    rectF7 = rectF6;
                                    li0Var4 = li0Var;
                                    rectF11.set(measuredWidth3 - f37, measuredHeight - f37, measuredWidth3 + f37, measuredHeight + f37);
                                    float T15 = org.telegram.messenger.g0.T1(measuredWidth4 / f13, org.telegram.messenger.g0.L(4.0f), a0Var.j);
                                    canvas2.drawRoundRect(rectF11, T15, T15, vVar.M);
                                } else {
                                    li0Var4 = li0Var;
                                    rectF7 = rectF6;
                                }
                                ji0Var.y = false;
                                if (f14 == 0.0f) {
                                    ji0Var.draw(canvas2);
                                } else {
                                    ImageReceiver imageReceiver = ii0Var2.getImageReceiver();
                                    ji0Var.b();
                                    g5 g5Var = ii0Var2.e;
                                    if (g5Var != null && (c3Var3 = g5Var.k) != null) {
                                        imageReceiver = c3Var3;
                                    }
                                    int[] iArr2 = imageReceiver.X0;
                                    int i25 = 0;
                                    while (true) {
                                        iArr = this.d;
                                        if (i25 >= 4) {
                                            break;
                                        }
                                        iArr[i25] = iArr2[i25];
                                        i25++;
                                    }
                                    imageReceiver.K0((int) org.telegram.messenger.g0.T1(f15, 0.0f, a0Var.j), (int) org.telegram.messenger.g0.T1(f16, 0.0f, a0Var.j), (int) org.telegram.messenger.g0.T1(f17, 0.0f, a0Var.j), (int) org.telegram.messenger.g0.T1(f14, 0.0f, a0Var.j));
                                    ji0Var.draw(canvas2);
                                    imageReceiver.L0(iArr);
                                }
                                boolean z12 = z10;
                                ji0Var.y = z12;
                                if (!q01Var2.b) {
                                    q01Var2.b = z12;
                                    q01Var2.invalidate();
                                }
                            } else {
                                li0Var4 = li0Var;
                                rectF7 = rectF6;
                                if (ji0Var.r && ii0Var2.getImageReceiver().B() == null) {
                                    float alpha = ii0Var.getImageReceiver().getAlpha();
                                    ii0Var.getImageReceiver().setAlpha((1.0f - i20) * alpha);
                                    ii0Var.draw(canvas2);
                                    ii0Var.getImageReceiver().setAlpha(alpha);
                                } else {
                                    ji0Var.b();
                                    ImageReceiver imageReceiver2 = ii0Var2.getImageReceiver();
                                    g5 g5Var2 = ii0Var2.e;
                                    if (g5Var2 != null && (c3Var2 = g5Var2.k) != null) {
                                        imageReceiver2 = c3Var2;
                                    }
                                    float alpha2 = imageReceiver2.getAlpha();
                                    imageReceiver2.setAlpha((1.0f - i20) * alpha2);
                                    ii0Var2.draw(canvas2);
                                    imageReceiver2.setAlpha(alpha2);
                                }
                            }
                            if (ii0Var2.getVisibility() != 0) {
                                invalidate();
                            }
                            li0Var3 = li0Var4;
                            rectF4 = rectF5;
                            rectF3 = rectF7;
                            i15 = -1;
                        } else {
                            i13 = i24;
                            RectF rectF12 = rectF;
                            i14 = i19;
                            i16 = save;
                            hashMap2 = hashMap;
                            li0Var3 = li0Var;
                            rectF3 = rectF2;
                            rectF4 = rectF12;
                            canvas2.translate((rectF12.width() + childAt.getX()) - li0Var3.x.width(), (childAt.getY() + rectF3.top) - rectF4.top);
                            i15 = -1;
                            canvas2.saveLayerAlpha(0.0f, 0.0f, childAt.getMeasuredWidth(), childAt.getMeasuredHeight(), (int) ((1.0f - i20) * 255.0f), 31);
                            float f38 = 1.0f - a0Var.j;
                            canvas2.scale(f38, f38, r14.getMeasuredWidth() >> 1, r14.getMeasuredHeight() >> 1);
                            childAt.draw(canvas2);
                            canvas2.restore();
                        }
                        canvas2.restore();
                    }
                    i24 = i13 + 1;
                    li0Var = li0Var3;
                    rectF2 = rectF3;
                    rectF = rectF4;
                    i23 = i15;
                    hashMap = hashMap2;
                    i19 = i14;
                    save = i16;
                    z10 = true;
                }
                li0Var2 = li0Var;
                i12 = i19;
                canvas2.restoreToCount(save);
            } else {
                li0Var2 = li0Var;
                i12 = i19;
                f13 = 2.0f;
            }
            super.dispatchDraw(canvas);
            int i26 = a0Var.F;
            if (i26 < 5) {
                if (i26 == 3) {
                    li0Var2.setSkipDraw(true);
                }
                a0Var.F++;
            }
            Paint paint2 = vVar.Z1;
            e01 e01Var = vVar.i0;
            ImageReceiver imageReceiver3 = vVar.W0;
            if (vVar.T0 != null) {
                imageReceiver3.H0(this);
                q01 q01Var3 = vVar.T0;
                if (q01Var3 != null) {
                    float f39 = vVar.V0;
                    if (f39 != 1.0f && !vVar.U0 && vVar.i1) {
                        float f40 = f39 + 0.010666667f;
                        vVar.V0 = f40;
                        if (f40 >= 1.0f) {
                            vVar.V0 = 1.0f;
                            e11 e11Var = vVar.I;
                            if (e11Var != null) {
                                li0 li0Var6 = (li0) ((bb.c) e11Var).b;
                                if (q01Var3.s) {
                                    li0Var6.l(q01Var3, q01Var3.y, true);
                                } else {
                                    long j10 = q01Var3.e.documentId;
                                    n0 n0Var2 = new n0();
                                    n0Var2.g = j10;
                                    n0Var2.h = j10;
                                    li0Var6.l(q01Var3, n0Var2, true);
                                }
                            }
                        }
                        vVar.T0.H = vVar.V0;
                    }
                    float f41 = (vVar.V0 * f13) + 1.0f;
                    canvas2.save();
                    canvas2.translate(vVar.T0.getX() + e01Var.getX(), vVar.T0.getY() + e01Var.getY() + vVar.h0.getY());
                    paint2.setColor(k6.w0(k6.G8, vVar.a1));
                    canvas2.drawRect(0.0f, 0.0f, vVar.T0.getMeasuredWidth(), vVar.T0.getMeasuredHeight(), paint2);
                    canvas2.scale(f41, f41, vVar.T0.getMeasuredWidth() / f13, vVar.T0.getMeasuredHeight());
                    q01 q01Var4 = vVar.T0;
                    if (!q01Var4.s) {
                        imageReceiver3 = q01Var4.r;
                    }
                    g5 g5Var3 = vVar.X0;
                    if (g5Var3 != null && (c3Var = g5Var3.k) != null && c3Var.I()) {
                        imageReceiver3 = vVar.X0.k;
                    }
                    if (imageReceiver3 != null) {
                        imageReceiver3.y0(0.0f, 0.0f, vVar.T0.getMeasuredWidth(), vVar.T0.getMeasuredHeight());
                        imageReceiver3.h(canvas2, null);
                    }
                    canvas2.restore();
                    invalidate();
                }
            }
            if (i12 == 5) {
                canvas2.restore();
            }
            if (a0Var.x != null) {
                invalidate();
            }
            Runnable runnable = d0.c;
            if (runnable != null) {
                runnable.run();
                d0.c = null;
            }
        }
    }

    @Override // android.view.View
    public final void invalidate() {
        super.invalidate();
        a0 a0Var = this.x;
        li0 li0Var = a0Var.n;
        if (a0Var.y == 1 || !(li0Var == null || li0Var.getDelegate() == null || !li0Var.getDelegate().O())) {
            a0Var.m.g0.invalidate();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0083  */
    @Override // android.widget.FrameLayout, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onMeasure(int i3, int i10) {
        int measuredWidth;
        int i11;
        int L;
        int L2;
        a0 a0Var = this.x;
        int i12 = a0Var.y;
        if (i12 == 1 || i12 == 2 || i12 == 4) {
            measuredWidth = a0Var.n.getMeasuredWidth();
        } else if (i12 == 5) {
            measuredWidth = org.telegram.messenger.g0.L(12.0f) + (org.telegram.messenger.g0.L(36.0f) * 8);
        } else {
            measuredWidth = Math.min(View.MeasureSpec.getSize(i3), View.MeasureSpec.getSize(i10));
            int L3 = (org.telegram.messenger.g0.L(36.0f) * 8) + org.telegram.messenger.g0.L(12.0f);
            if (L3 < measuredWidth) {
                measuredWidth = L3;
            }
        }
        if (a0Var.y != 4) {
            if (a0Var.n.G0) {
                int ceil = (int) Math.ceil(a0Var.o.size() / 8.0f);
                if (ceil <= 8) {
                    i11 = org.telegram.messenger.g0.L(8.0f) + (org.telegram.messenger.g0.L(36.0f) * ceil);
                } else {
                    L = org.telegram.messenger.g0.L(36.0f) * 8;
                    L2 = org.telegram.messenger.g0.L(8.0f);
                }
            } else {
                i11 = measuredWidth;
            }
            if (a0Var.y == 5) {
                i11 = Math.min(org.telegram.messenger.g0.L(254.0f), i11);
            }
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(measuredWidth, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(i11, TLObject.FLAG_30));
        }
        L = org.telegram.messenger.g0.L(36.0f) * 8;
        L2 = org.telegram.messenger.g0.L(8.0f);
        i11 = L - L2;
        if (a0Var.y == 5) {
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(measuredWidth, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(i11, TLObject.FLAG_30));
    }

    @Override // org.telegram.ui.ActionBar.z5
    public final void updateColors() {
        Paint paint;
        try {
            a0 a0Var = this.x;
            if (a0Var.y == 2 || (paint = this.c) == null) {
                return;
            }
            paint.setColor(k6.w0(k6.G8, a0Var.s));
            invalidate();
        } catch (Exception e10) {
            a8.g(e10, true);
        }
    }

    @Override // org.telegram.ui.ActionBar.z5
    public final /* synthetic */ void addColorKeys(HashSet hashSet) {
    }
}
