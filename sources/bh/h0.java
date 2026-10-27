package bh;

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
import di.f3;
import java.util.HashMap;
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.ActionBar.f7;
import org.telegram.ui.ActionBar.p6;
import org.telegram.ui.ActionBar.u6;
import org.telegram.ui.ActionBar.y6;
import org.telegram.ui.Components.dl0;
import org.telegram.ui.Components.el0;
import org.telegram.ui.Components.fl0;
import org.telegram.ui.Components.gl0;
import org.telegram.ui.Components.t5;
import org.telegram.ui.c51;
import org.telegram.ui.d61;
import org.telegram.ui.o51;
import tg.c1;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes4.dex */
public final class h0 extends FrameLayout implements p6 {
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
    public final Path v;
    public final /* synthetic */ i0 w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h0(i0 i0Var, Context context) {
        super(context);
        this.w = i0Var;
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
        this.v = new Path();
        Drawable mutate = context.getDrawable(R.drawable.reactions_bubble_shadow).mutate();
        this.a = mutate;
        int dp = AndroidUtilities.dp(7.0f);
        rect.bottom = dp;
        rect.right = dp;
        rect.top = dp;
        rect.left = dp;
        int i10 = y6.Td;
        u6 u6Var = i0Var.s;
        f7.y(this, mutate, i10, u6Var, PorterDuff.Mode.MULTIPLY);
        if (i0Var.y == 2) {
            paint.setColor(i0.a.f(0.13f, -16777216, -1));
        } else {
            paint.setColor(y6.w0(y6.G8, u6Var));
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
        float f7;
        boolean z10;
        HashMap hashMap;
        int i10;
        float f10;
        RectF rectF;
        float f11;
        RectF rectF2;
        int i11;
        gl0 gl0Var;
        int i12;
        gl0 gl0Var2;
        int i13;
        float f12;
        f3 f3Var;
        int i14;
        int i15;
        int i16;
        int i17;
        HashMap hashMap2;
        RectF rectF3;
        RectF rectF4;
        gl0 gl0Var3;
        RectF rectF5;
        RectF rectF6;
        float f13;
        float f14;
        float f15;
        float f16;
        float f17;
        gl0 gl0Var4;
        RectF rectF7;
        f3 f3Var2;
        int[] iArr;
        f3 f3Var3;
        float f18;
        int i18;
        float f19;
        float f20;
        float f21;
        float f22;
        float f23;
        float f24;
        float f25;
        float f26;
        float f27;
        x0 x0Var;
        int i19;
        float f28;
        Canvas canvas2 = canvas;
        i0 i0Var = this.w;
        RectF rectF8 = i0Var.f;
        int i20 = i0Var.y;
        RectF rectF9 = i0Var.i;
        d0 d0Var = i0Var.m;
        gl0 gl0Var5 = i0Var.n;
        if (i0Var.l) {
            float clamp = Utilities.clamp(i0Var.j, 1.0f, 0.0f);
            RectF rectF10 = AndroidUtilities.rectTmp;
            rectF10.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
            if (i20 == 4) {
                rectF8.set(gl0Var5.w);
                rectF8.offset(i0Var.g, i0Var.h);
            }
            AndroidUtilities.lerp(rectF8, rectF10, i0Var.j, rectF9);
            float lerp = AndroidUtilities.lerp(i0Var.e, AndroidUtilities.dp(i20 == 5 ? 20.0f : 8.0f), i0Var.j);
            HashMap hashMap3 = this.e;
            hashMap3.clear();
            if (i20 == 1 || (gl0Var5.getDelegate() != null && gl0Var5.getDelegate().o())) {
                f7 = 1.0f;
                fl0 delegate = gl0Var5.getDelegate();
                float x9 = getX();
                h0 h0Var = i0Var.a;
                z10 = true;
                hashMap = hashMap3;
                i10 = 4;
                f10 = 255.0f;
                delegate.l(canvas, rectF9, lerp, x9, i20 == 1 ? h0Var.getY() - AndroidUtilities.statusBarHeight : h0Var.getY() + i0Var.c.getY(), 255, true);
                canvas2 = canvas;
                rectF = rectF9;
            } else {
                int clamp2 = (int) (Utilities.clamp(clamp / 0.05f, 1.0f, 0.0f) * 255.0f);
                Drawable drawable = this.a;
                drawable.setAlpha(clamp2);
                int i21 = (int) rectF9.left;
                Rect rect = this.b;
                f7 = 1.0f;
                drawable.setBounds(i21 - rect.left, ((int) rectF9.top) - rect.top, ((int) rectF9.right) + rect.right, ((int) rectF9.bottom) + rect.bottom);
                eh.d dVar = i0Var.z;
                Paint paint = this.c;
                if (dVar != null) {
                    rectF10.set(rectF9);
                    Rect rect2 = AndroidUtilities.rectTmp2;
                    rectF10.round(rect2);
                    rect2.inset(-AndroidUtilities.dp(8.0f), -AndroidUtilities.dp(8.0f));
                    i0Var.z.setBounds(rect2);
                    i0Var.z.setAlpha(paint.getAlpha());
                    i0Var.z.x(lerp);
                    i0Var.z.draw(canvas2);
                } else {
                    drawable.draw(canvas2);
                    canvas2.drawRoundRect(rectF9, lerp, lerp, paint);
                }
                rectF = rectF9;
                hashMap = hashMap3;
                i10 = 4;
                f10 = 255.0f;
                z10 = true;
            }
            if (gl0Var5.R0 != null) {
                canvas2.save();
                float f29 = rectF.left;
                float y3 = gl0Var5.R0.getY() + rectF.top;
                if (i20 == 3 || i20 == i10) {
                    i19 = 5;
                } else {
                    i19 = 5;
                    if (i20 != 5) {
                        f28 = 0.0f;
                        canvas2.translate(f29, y3 - f28);
                        rectF2 = rectF8;
                        f11 = lerp;
                        i11 = i19;
                        canvas2.saveLayerAlpha(0.0f, 0.0f, gl0Var5.R0.getMeasuredWidth(), gl0Var5.R0.getMeasuredHeight(), (int) ((f7 - i0Var.j) * gl0Var5.R0.getAlpha() * f10), 31);
                        gl0Var5.R0.draw(canvas2);
                        canvas2.restore();
                        canvas2.restore();
                    }
                }
                f28 = gl0Var5.w.top;
                canvas2.translate(f29, y3 - f28);
                rectF2 = rectF8;
                f11 = lerp;
                i11 = i19;
                canvas2.saveLayerAlpha(0.0f, 0.0f, gl0Var5.R0.getMeasuredWidth(), gl0Var5.R0.getMeasuredHeight(), (int) ((f7 - i0Var.j) * gl0Var5.R0.getAlpha() * f10), 31);
                gl0Var5.R0.draw(canvas2);
                canvas2.restore();
                canvas2.restore();
            } else {
                f11 = lerp;
                rectF2 = rectF8;
                i11 = 5;
            }
            float width = (rectF.width() - gl0Var5.w.width()) + (rectF.left - gl0Var5.w.left);
            if (i0Var.j > 0.05f || i20 == i11) {
                canvas2.save();
                canvas2.translate(width, (rectF.height() - gl0Var5.w.height()) + (rectF.top - gl0Var5.w.top));
                float max = (Math.max(0.25f, Math.min(gl0Var5.v, f7)) - 0.25f) / 0.75f;
                Canvas canvas3 = canvas2;
                gl0Var5.f(gl0Var5.E * max, max, gl0Var5.F * max, gl0Var5.M0 == i11 ? 255 : (int) org.telegram.messenger.t.A(1.0f, gl0Var5.w0, Utilities.clamp(gl0Var5.w0 / 0.2f, 1.0f, 0.0f), f10), canvas3);
                gl0Var = gl0Var5;
                canvas2 = canvas3;
                canvas2.restore();
                i12 = 5;
            } else {
                i12 = i11;
                gl0Var = gl0Var5;
            }
            if (i20 == i12) {
                Path path = this.v;
                path.rewind();
                path.addRoundRect(rectF, f11, f11, Path.Direction.CW);
                canvas2.save();
                canvas2.clipPath(path);
            }
            this.f = 0.0f;
            this.h = 0.0f;
            this.n = 1.0f;
            this.r = 0.0f;
            this.s = 0.0f;
            if (gl0Var != null) {
                for (int childCount = d0Var.h0.getChildCount() - 1; childCount >= 0; childCount--) {
                    if (d0Var.h0.getChildAt(childCount) instanceof o51) {
                        o51 o51Var = (o51) d0Var.h0.getChildAt(childCount);
                        if (o51Var.y && (x0Var = o51Var.x) != null) {
                            hashMap.put(x0Var, o51Var);
                        }
                    }
                }
                int save = canvas2.save();
                canvas2.translate(rectF.left, c3.h0.z(1.0f, i0Var.j, gl0Var.g() + gl0Var.getTopOffset(), rectF.top));
                float max2 = Math.max(1.0f - (d0Var.i0.getVisibility() == 0 ? d0Var.i0.getAlpha() : 0.0f), 1.0f - i0Var.j);
                if (max2 != 1.0f) {
                    canvas2.saveLayerAlpha(0.0f, 0.0f, rectF.width(), rectF.height(), (int) (max2 * 255.0f), 31);
                }
                int x10 = (int) (d0Var.h0.getX() + d0Var.getX());
                int y10 = (int) (d0Var.h0.getY() + d0Var.getY());
                boolean z11 = d0Var.d0.getParent() != null ? z10 : false;
                if (i20 != 5) {
                    float f30 = y10;
                    if (z11) {
                        f12 = 2.0f;
                        f27 = x10 + (AndroidUtilities.dp(36.0f) * i0Var.j);
                    } else {
                        f12 = 2.0f;
                        f27 = 0.0f;
                    }
                    canvas2.clipRect(f30, f27, d0Var.h0.getMeasuredWidth() + y10, d0Var.h0.getMeasuredHeight() + x10);
                } else {
                    f12 = 2.0f;
                }
                int i22 = -1;
                int i23 = -1;
                while (i23 < gl0Var.b.getChildCount()) {
                    View childAt = i23 == i22 ? gl0Var.z0 : gl0Var.b.getChildAt(i23);
                    if (childAt.getLeft() < 0 || childAt.getVisibility() == 8) {
                        i14 = i23;
                        i15 = i20;
                        i16 = i22;
                        i17 = save;
                        hashMap2 = hashMap;
                        rectF3 = rectF2;
                        rectF4 = rectF;
                        gl0Var3 = gl0Var;
                    } else {
                        canvas2.save();
                        if (childAt instanceof el0) {
                            el0 el0Var = (el0) childAt;
                            dl0 dl0Var = el0Var.a;
                            dl0 dl0Var2 = el0Var.b;
                            c1 c1Var = el0Var.f;
                            if (c1Var != null) {
                                c1Var.setAlpha(1.0f - i0Var.j);
                            }
                            o51 o51Var2 = (o51) hashMap.get(el0Var.e);
                            if (o51Var2 != null) {
                                float x11 = childAt.getX();
                                float y11 = childAt.getY();
                                if (i23 == -1) {
                                    x11 -= gl0Var.b.getX();
                                    f18 = y11 - gl0Var.b.getY();
                                } else {
                                    f18 = y11;
                                }
                                i14 = i23;
                                float x12 = ((d0Var.h0.getX() + (d0Var.getX() + o51Var2.getX())) - dl0Var2.getX()) - AndroidUtilities.dp(1.0f);
                                float y12 = (d0Var.h0.getY() + (d0Var.g0.getY() + (d0Var.getY() + o51Var2.getY()))) - dl0Var2.getY();
                                float measuredWidth = o51Var2.getMeasuredWidth();
                                if (o51Var2.L) {
                                    i18 = 4;
                                } else {
                                    i18 = 4;
                                    if (i20 != 4) {
                                        f21 = x12;
                                        hashMap2 = hashMap;
                                        float f31 = y12;
                                        i15 = i20;
                                        float lerp2 = AndroidUtilities.lerp(x11, f21, i0Var.j);
                                        float f32 = x11;
                                        float lerp3 = AndroidUtilities.lerp(f18, f31, i0Var.j);
                                        float f33 = f18;
                                        float measuredWidth2 = measuredWidth / dl0Var2.getMeasuredWidth();
                                        i17 = save;
                                        rectF5 = rectF;
                                        f17 = AndroidUtilities.lerp(1.0f, measuredWidth2, i0Var.j);
                                        if (el0Var.y != 0) {
                                            f22 = AndroidUtilities.dp(6.0f);
                                            f24 = f22;
                                            f23 = 0.0f;
                                        } else if (el0Var.w) {
                                            f22 = AndroidUtilities.dp(6.0f);
                                            f23 = f22;
                                            f24 = f23;
                                            f25 = f24;
                                            canvas2.translate(lerp2, lerp3);
                                            canvas2.scale(f17, f17);
                                            if (this.f == 0.0f || this.h != 0.0f) {
                                                f26 = f22;
                                                rectF6 = rectF2;
                                            } else {
                                                rectF6 = rectF2;
                                                f26 = f22;
                                                this.f = AndroidUtilities.lerp((rectF6.left + f32) - f21, 0.0f, i0Var.j);
                                                this.h = AndroidUtilities.lerp((rectF6.top + f33) - f31, 0.0f, i0Var.j);
                                                this.n = AndroidUtilities.lerp(1.0f / measuredWidth2, 1.0f, i0Var.j);
                                                this.r = f21;
                                                this.s = f31;
                                            }
                                            f14 = f26;
                                            f15 = f23;
                                            f13 = f24;
                                            f16 = f25;
                                        } else {
                                            f22 = 0.0f;
                                            f23 = 0.0f;
                                            f24 = 0.0f;
                                        }
                                        f25 = 0.0f;
                                        canvas2.translate(lerp2, lerp3);
                                        canvas2.scale(f17, f17);
                                        if (this.f == 0.0f) {
                                        }
                                        f26 = f22;
                                        rectF6 = rectF2;
                                        f14 = f26;
                                        f15 = f23;
                                        f13 = f24;
                                        f16 = f25;
                                    }
                                }
                                if (i20 == i18) {
                                    f19 = x12 - AndroidUtilities.dp(0.33f);
                                    y12 -= AndroidUtilities.dp(1.33f);
                                    f20 = 0.87f * measuredWidth;
                                } else {
                                    f19 = x12;
                                    f20 = measuredWidth;
                                }
                                float f34 = o51Var2.L ? 0.95f * f20 : f20;
                                float f35 = (measuredWidth - f34) / f12;
                                measuredWidth = f34;
                                f21 = f19 + f35;
                                y12 += f35;
                                hashMap2 = hashMap;
                                float f312 = y12;
                                i15 = i20;
                                float lerp22 = AndroidUtilities.lerp(x11, f21, i0Var.j);
                                float f322 = x11;
                                float lerp32 = AndroidUtilities.lerp(f18, f312, i0Var.j);
                                float f332 = f18;
                                float measuredWidth22 = measuredWidth / dl0Var2.getMeasuredWidth();
                                i17 = save;
                                rectF5 = rectF;
                                f17 = AndroidUtilities.lerp(1.0f, measuredWidth22, i0Var.j);
                                if (el0Var.y != 0) {
                                }
                                f25 = 0.0f;
                                canvas2.translate(lerp22, lerp32);
                                canvas2.scale(f17, f17);
                                if (this.f == 0.0f) {
                                }
                                f26 = f22;
                                rectF6 = rectF2;
                                f14 = f26;
                                f15 = f23;
                                f13 = f24;
                                f16 = f25;
                            } else {
                                i14 = i23;
                                rectF5 = rectF;
                                i15 = i20;
                                i17 = save;
                                hashMap2 = hashMap;
                                rectF6 = rectF2;
                                canvas2.translate(dl0Var2.getX() + childAt.getX(), dl0Var2.getY() + childAt.getY());
                                f13 = 0.0f;
                                f14 = 0.0f;
                                f15 = 0.0f;
                                f16 = 0.0f;
                                f17 = 1.0f;
                            }
                            if (o51Var2 != null) {
                                if (o51Var2.L) {
                                    float measuredWidth3 = el0Var.getMeasuredWidth() / f12;
                                    float measuredHeight = el0Var.getMeasuredHeight() / f12;
                                    float measuredWidth4 = el0Var.getMeasuredWidth() - AndroidUtilities.dp(f12);
                                    float lerp4 = AndroidUtilities.lerp(measuredWidth4, (o51Var2.getMeasuredWidth() - AndroidUtilities.dp(f12)) / f17, i0Var.j);
                                    RectF rectF11 = AndroidUtilities.rectTmp;
                                    float f36 = lerp4 / f12;
                                    rectF7 = rectF6;
                                    gl0Var4 = gl0Var;
                                    rectF11.set(measuredWidth3 - f36, measuredHeight - f36, measuredWidth3 + f36, measuredHeight + f36);
                                    float lerp5 = AndroidUtilities.lerp(measuredWidth4 / f12, AndroidUtilities.dp(4.0f), i0Var.j);
                                    canvas2.drawRoundRect(rectF11, lerp5, lerp5, d0Var.L);
                                } else {
                                    gl0Var4 = gl0Var;
                                    rectF7 = rectF6;
                                }
                                el0Var.x = false;
                                if (f13 == 0.0f) {
                                    el0Var.draw(canvas2);
                                } else {
                                    ImageReceiver imageReceiver = dl0Var2.getImageReceiver();
                                    el0Var.b();
                                    t5 t5Var = dl0Var2.e;
                                    if (t5Var != null && (f3Var3 = t5Var.k) != null) {
                                        imageReceiver = f3Var3;
                                    }
                                    int[] roundRadius = imageReceiver.getRoundRadius();
                                    int i24 = 0;
                                    while (true) {
                                        iArr = this.d;
                                        if (i24 >= 4) {
                                            break;
                                        }
                                        iArr[i24] = roundRadius[i24];
                                        i24++;
                                    }
                                    imageReceiver.setRoundRadius((int) AndroidUtilities.lerp(f14, 0.0f, i0Var.j), (int) AndroidUtilities.lerp(f15, 0.0f, i0Var.j), (int) AndroidUtilities.lerp(f16, 0.0f, i0Var.j), (int) AndroidUtilities.lerp(f13, 0.0f, i0Var.j));
                                    el0Var.draw(canvas2);
                                    imageReceiver.setRoundRadius(iArr);
                                }
                                boolean z12 = z10;
                                el0Var.x = z12;
                                if (!o51Var2.b) {
                                    o51Var2.b = z12;
                                    o51Var2.invalidate();
                                }
                            } else {
                                gl0Var4 = gl0Var;
                                rectF7 = rectF6;
                                if (el0Var.r && dl0Var2.getImageReceiver().getLottieAnimation() == null) {
                                    float alpha = dl0Var.getImageReceiver().getAlpha();
                                    dl0Var.getImageReceiver().setAlpha((1.0f - clamp) * alpha);
                                    dl0Var.draw(canvas2);
                                    dl0Var.getImageReceiver().setAlpha(alpha);
                                } else {
                                    el0Var.b();
                                    ImageReceiver imageReceiver2 = dl0Var2.getImageReceiver();
                                    t5 t5Var2 = dl0Var2.e;
                                    if (t5Var2 != null && (f3Var2 = t5Var2.k) != null) {
                                        imageReceiver2 = f3Var2;
                                    }
                                    float alpha2 = imageReceiver2.getAlpha();
                                    imageReceiver2.setAlpha((1.0f - clamp) * alpha2);
                                    dl0Var2.draw(canvas2);
                                    imageReceiver2.setAlpha(alpha2);
                                }
                            }
                            if (dl0Var2.getVisibility() != 0) {
                                invalidate();
                            }
                            gl0Var3 = gl0Var4;
                            rectF4 = rectF5;
                            rectF3 = rectF7;
                            i16 = -1;
                        } else {
                            i14 = i23;
                            RectF rectF12 = rectF;
                            i15 = i20;
                            i17 = save;
                            hashMap2 = hashMap;
                            gl0Var3 = gl0Var;
                            rectF3 = rectF2;
                            rectF4 = rectF12;
                            canvas2.translate((rectF12.width() + childAt.getX()) - gl0Var3.w.width(), (childAt.getY() + rectF3.top) - rectF4.top);
                            i16 = -1;
                            canvas2.saveLayerAlpha(0.0f, 0.0f, childAt.getMeasuredWidth(), childAt.getMeasuredHeight(), (int) ((1.0f - clamp) * 255.0f), 31);
                            float f37 = 1.0f - i0Var.j;
                            canvas2.scale(f37, f37, r14.getMeasuredWidth() >> 1, r14.getMeasuredHeight() >> 1);
                            childAt.draw(canvas2);
                            canvas2.restore();
                        }
                        canvas2.restore();
                    }
                    i23 = i14 + 1;
                    gl0Var = gl0Var3;
                    rectF2 = rectF3;
                    rectF = rectF4;
                    i22 = i16;
                    hashMap = hashMap2;
                    i20 = i15;
                    save = i17;
                    z10 = true;
                }
                gl0Var2 = gl0Var;
                i13 = i20;
                canvas2.restoreToCount(save);
            } else {
                gl0Var2 = gl0Var;
                i13 = i20;
                f12 = 2.0f;
            }
            super.dispatchDraw(canvas);
            int i25 = i0Var.F;
            if (i25 < 5) {
                if (i25 == 3) {
                    gl0Var2.setSkipDraw(true);
                }
                i0Var.F++;
            }
            Paint paint2 = d0Var.Y1;
            c51 c51Var = d0Var.h0;
            ImageReceiver imageReceiver3 = d0Var.V0;
            if (d0Var.S0 != null) {
                imageReceiver3.setParentView(this);
                o51 o51Var3 = d0Var.S0;
                if (o51Var3 != null) {
                    float f38 = d0Var.U0;
                    if (f38 != 1.0f && !d0Var.T0 && d0Var.h1) {
                        float f39 = f38 + 0.010666667f;
                        d0Var.U0 = f39;
                        if (f39 >= 1.0f) {
                            d0Var.U0 = 1.0f;
                            d61 d61Var = d0Var.H;
                            if (d61Var != null) {
                                gl0 gl0Var6 = (gl0) ((za.c) d61Var).b;
                                if (o51Var3.s) {
                                    gl0Var6.l(o51Var3, o51Var3.x, true);
                                } else {
                                    long j10 = o51Var3.e.documentId;
                                    x0 x0Var2 = new x0();
                                    x0Var2.g = j10;
                                    x0Var2.h = j10;
                                    gl0Var6.l(o51Var3, x0Var2, true);
                                }
                            }
                        }
                        d0Var.S0.G = d0Var.U0;
                    }
                    float f40 = (d0Var.U0 * f12) + 1.0f;
                    canvas2.save();
                    canvas2.translate(d0Var.S0.getX() + c51Var.getX(), d0Var.S0.getY() + c51Var.getY() + d0Var.g0.getY());
                    paint2.setColor(y6.w0(y6.G8, d0Var.Z0));
                    canvas2.drawRect(0.0f, 0.0f, d0Var.S0.getMeasuredWidth(), d0Var.S0.getMeasuredHeight(), paint2);
                    canvas2.scale(f40, f40, d0Var.S0.getMeasuredWidth() / f12, d0Var.S0.getMeasuredHeight());
                    o51 o51Var4 = d0Var.S0;
                    if (!o51Var4.s) {
                        imageReceiver3 = o51Var4.r;
                    }
                    t5 t5Var3 = d0Var.W0;
                    if (t5Var3 != null && (f3Var = t5Var3.k) != null && f3Var.hasBitmapImage()) {
                        imageReceiver3 = d0Var.W0.k;
                    }
                    if (imageReceiver3 != null) {
                        imageReceiver3.setImageCoords(0.0f, 0.0f, d0Var.S0.getMeasuredWidth(), d0Var.S0.getMeasuredHeight());
                        imageReceiver3.draw(canvas2);
                    }
                    canvas2.restore();
                    invalidate();
                }
            }
            if (i13 == 5) {
                canvas2.restore();
            }
            if (i0Var.x != null) {
                invalidate();
            }
            Runnable runnable = m0.c;
            if (runnable != null) {
                runnable.run();
                m0.c = null;
            }
        }
    }

    @Override // android.view.View
    public final void invalidate() {
        super.invalidate();
        i0 i0Var = this.w;
        gl0 gl0Var = i0Var.n;
        if (i0Var.y == 1 || !(gl0Var == null || gl0Var.getDelegate() == null || !gl0Var.getDelegate().o())) {
            i0Var.m.f0.invalidate();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0083  */
    @Override // android.widget.FrameLayout, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onMeasure(int i10, int i11) {
        int measuredWidth;
        int i12;
        int dp;
        int dp2;
        i0 i0Var = this.w;
        int i13 = i0Var.y;
        if (i13 == 1 || i13 == 2 || i13 == 4) {
            measuredWidth = i0Var.n.getMeasuredWidth();
        } else if (i13 == 5) {
            measuredWidth = AndroidUtilities.dp(12.0f) + (AndroidUtilities.dp(36.0f) * 8);
        } else {
            measuredWidth = Math.min(View.MeasureSpec.getSize(i10), View.MeasureSpec.getSize(i11));
            int dp3 = (AndroidUtilities.dp(36.0f) * 8) + AndroidUtilities.dp(12.0f);
            if (dp3 < measuredWidth) {
                measuredWidth = dp3;
            }
        }
        if (i0Var.y != 4) {
            if (i0Var.n.F0) {
                int ceil = (int) Math.ceil(i0Var.o.size() / 8.0f);
                if (ceil <= 8) {
                    i12 = AndroidUtilities.dp(8.0f) + (AndroidUtilities.dp(36.0f) * ceil);
                } else {
                    dp = AndroidUtilities.dp(36.0f) * 8;
                    dp2 = AndroidUtilities.dp(8.0f);
                }
            } else {
                i12 = measuredWidth;
            }
            if (i0Var.y == 5) {
                i12 = Math.min(AndroidUtilities.dp(254.0f), i12);
            }
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(measuredWidth, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(i12, TLObject.FLAG_30));
        }
        dp = AndroidUtilities.dp(36.0f) * 8;
        dp2 = AndroidUtilities.dp(8.0f);
        i12 = dp - dp2;
        if (i0Var.y == 5) {
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(measuredWidth, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(i12, TLObject.FLAG_30));
    }

    @Override // org.telegram.ui.ActionBar.p6
    public final void updateColors() {
        Paint paint;
        try {
            i0 i0Var = this.w;
            if (i0Var.y == 2 || (paint = this.c) == null) {
                return;
            }
            paint.setColor(y6.w0(y6.G8, i0Var.s));
            invalidate();
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    @Override // org.telegram.ui.ActionBar.p6
    public final /* synthetic */ void addColorKeys(HashSet hashSet) {
    }
}
