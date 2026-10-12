package ah;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.FrameLayout;
import bi.b4;
import com.google.android.gms.internal.play_billing.k3;
import java.util.HashMap;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Components.dl0;
import org.telegram.ui.Components.el0;
import org.telegram.ui.Components.fl0;
import org.telegram.ui.Components.gl0;
import org.telegram.ui.Components.s5;
import org.telegram.ui.a71;
import org.telegram.ui.o61;
import org.telegram.ui.p71;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public final class s0 extends FrameLayout {
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
    public final /* synthetic */ t0 w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s0(t0 t0Var, Context context) {
        super(context);
        this.w = t0Var;
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
        int i10 = g6.Td;
        c6 c6Var = t0Var.s;
        mutate.setColorFilter(new PorterDuffColorFilter(g6.w0(i10, c6Var), PorterDuff.Mode.MULTIPLY));
        if (t0Var.y == 2) {
            paint.setColor(i0.a.d(0.13f, -16777216, -1));
        } else {
            paint.setColor(g6.w0(g6.G8, c6Var));
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
        b4 b4Var;
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
        b4 b4Var2;
        int[] iArr;
        b4 b4Var3;
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
        i1 i1Var;
        int i19;
        float f28;
        Canvas canvas2 = canvas;
        t0 t0Var = this.w;
        RectF rectF8 = t0Var.f;
        int i20 = t0Var.y;
        RectF rectF9 = t0Var.i;
        n0 n0Var = t0Var.m;
        gl0 gl0Var5 = t0Var.n;
        if (t0Var.l) {
            float clamp = Utilities.clamp(t0Var.j, 1.0f, 0.0f);
            RectF rectF10 = AndroidUtilities.rectTmp;
            rectF10.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
            if (i20 == 4) {
                rectF8.set(gl0Var5.w);
                rectF8.offset(t0Var.g, t0Var.h);
            }
            AndroidUtilities.lerp(rectF8, rectF10, t0Var.j, rectF9);
            float lerp = AndroidUtilities.lerp(t0Var.e, AndroidUtilities.dp(i20 == 5 ? 20.0f : 8.0f), t0Var.j);
            HashMap hashMap3 = this.e;
            hashMap3.clear();
            if (i20 == 1 || (gl0Var5.getDelegate() != null && gl0Var5.getDelegate().D())) {
                f7 = 1.0f;
                fl0 delegate = gl0Var5.getDelegate();
                float x10 = getX();
                s0 s0Var = t0Var.a;
                z10 = true;
                hashMap = hashMap3;
                i10 = 4;
                f10 = 255.0f;
                delegate.w(canvas, rectF9, lerp, x10, i20 == 1 ? s0Var.getY() - AndroidUtilities.statusBarHeight : s0Var.getY() + t0Var.c.getY(), 255, true);
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
                dh.d dVar = t0Var.z;
                Paint paint = this.c;
                if (dVar != null) {
                    rectF10.set(rectF9);
                    Rect rect2 = AndroidUtilities.rectTmp2;
                    rectF10.round(rect2);
                    rect2.inset(-AndroidUtilities.dp(8.0f), -AndroidUtilities.dp(8.0f));
                    t0Var.z.setBounds(rect2);
                    t0Var.z.setAlpha(paint.getAlpha());
                    t0Var.z.q(lerp);
                    t0Var.z.draw(canvas2);
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
                        canvas2.saveLayerAlpha(0.0f, 0.0f, gl0Var5.R0.getMeasuredWidth(), gl0Var5.R0.getMeasuredHeight(), (int) ((f7 - t0Var.j) * gl0Var5.R0.getAlpha() * f10), 31);
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
                canvas2.saveLayerAlpha(0.0f, 0.0f, gl0Var5.R0.getMeasuredWidth(), gl0Var5.R0.getMeasuredHeight(), (int) ((f7 - t0Var.j) * gl0Var5.R0.getAlpha() * f10), 31);
                gl0Var5.R0.draw(canvas2);
                canvas2.restore();
                canvas2.restore();
            } else {
                f11 = lerp;
                rectF2 = rectF8;
                i11 = 5;
            }
            float width = (rectF.width() - gl0Var5.w.width()) + (rectF.left - gl0Var5.w.left);
            if (t0Var.j > 0.05f || i20 == i11) {
                canvas2.save();
                canvas2.translate(width, (rectF.height() - gl0Var5.w.height()) + (rectF.top - gl0Var5.w.top));
                float max = (Math.max(0.25f, Math.min(gl0Var5.v, f7)) - 0.25f) / 0.75f;
                Canvas canvas3 = canvas2;
                gl0Var5.f(gl0Var5.E * max, max, gl0Var5.F * max, gl0Var5.M0 == i11 ? 255 : (int) org.telegram.messenger.q.B(1.0f, gl0Var5.w0, Utilities.clamp(gl0Var5.w0 / 0.2f, 1.0f, 0.0f), f10), canvas3);
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
                for (int childCount = n0Var.h0.getChildCount() - 1; childCount >= 0; childCount--) {
                    if (n0Var.h0.getChildAt(childCount) instanceof a71) {
                        a71 a71Var = (a71) n0Var.h0.getChildAt(childCount);
                        if (a71Var.y && (i1Var = a71Var.x) != null) {
                            hashMap.put(i1Var, a71Var);
                        }
                    }
                }
                int save = canvas2.save();
                canvas2.translate(rectF.left, k3.y(1.0f, t0Var.j, gl0Var.g() + gl0Var.getTopOffset(), rectF.top));
                float max2 = Math.max(1.0f - (n0Var.i0.getVisibility() == 0 ? n0Var.i0.getAlpha() : 0.0f), 1.0f - t0Var.j);
                if (max2 != 1.0f) {
                    canvas2.saveLayerAlpha(0.0f, 0.0f, rectF.width(), rectF.height(), (int) (max2 * 255.0f), 31);
                }
                int x11 = (int) (n0Var.h0.getX() + n0Var.getX());
                int y10 = (int) (n0Var.h0.getY() + n0Var.getY());
                boolean z11 = n0Var.d0.getParent() != null ? z10 : false;
                if (i20 != 5) {
                    float f30 = y10;
                    if (z11) {
                        f12 = 2.0f;
                        f27 = x11 + (AndroidUtilities.dp(36.0f) * t0Var.j);
                    } else {
                        f12 = 2.0f;
                        f27 = 0.0f;
                    }
                    canvas2.clipRect(f30, f27, n0Var.h0.getMeasuredWidth() + y10, n0Var.h0.getMeasuredHeight() + x11);
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
                            sg.c1 c1Var = el0Var.f;
                            if (c1Var != null) {
                                c1Var.setAlpha(1.0f - t0Var.j);
                            }
                            a71 a71Var2 = (a71) hashMap.get(el0Var.e);
                            if (a71Var2 != null) {
                                float x12 = childAt.getX();
                                float y11 = childAt.getY();
                                if (i23 == -1) {
                                    x12 -= gl0Var.b.getX();
                                    f18 = y11 - gl0Var.b.getY();
                                } else {
                                    f18 = y11;
                                }
                                i14 = i23;
                                float x13 = ((n0Var.h0.getX() + (n0Var.getX() + a71Var2.getX())) - dl0Var2.getX()) - AndroidUtilities.dp(1.0f);
                                float y12 = (n0Var.h0.getY() + (n0Var.g0.getY() + (n0Var.getY() + a71Var2.getY()))) - dl0Var2.getY();
                                float measuredWidth = a71Var2.getMeasuredWidth();
                                if (a71Var2.L) {
                                    i18 = 4;
                                } else {
                                    i18 = 4;
                                    if (i20 != 4) {
                                        f21 = x13;
                                        hashMap2 = hashMap;
                                        float f31 = y12;
                                        i15 = i20;
                                        float lerp2 = AndroidUtilities.lerp(x12, f21, t0Var.j);
                                        float f32 = x12;
                                        float lerp3 = AndroidUtilities.lerp(f18, f31, t0Var.j);
                                        float f33 = f18;
                                        float measuredWidth2 = measuredWidth / dl0Var2.getMeasuredWidth();
                                        i17 = save;
                                        rectF5 = rectF;
                                        f17 = AndroidUtilities.lerp(1.0f, measuredWidth2, t0Var.j);
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
                                                this.f = AndroidUtilities.lerp((rectF6.left + f32) - f21, 0.0f, t0Var.j);
                                                this.h = AndroidUtilities.lerp((rectF6.top + f33) - f31, 0.0f, t0Var.j);
                                                this.n = AndroidUtilities.lerp(1.0f / measuredWidth2, 1.0f, t0Var.j);
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
                                    f19 = x13 - AndroidUtilities.dp(0.33f);
                                    y12 -= AndroidUtilities.dp(1.33f);
                                    f20 = 0.87f * measuredWidth;
                                } else {
                                    f19 = x13;
                                    f20 = measuredWidth;
                                }
                                float f34 = a71Var2.L ? 0.95f * f20 : f20;
                                float f35 = (measuredWidth - f34) / f12;
                                measuredWidth = f34;
                                f21 = f19 + f35;
                                y12 += f35;
                                hashMap2 = hashMap;
                                float f312 = y12;
                                i15 = i20;
                                float lerp22 = AndroidUtilities.lerp(x12, f21, t0Var.j);
                                float f322 = x12;
                                float lerp32 = AndroidUtilities.lerp(f18, f312, t0Var.j);
                                float f332 = f18;
                                float measuredWidth22 = measuredWidth / dl0Var2.getMeasuredWidth();
                                i17 = save;
                                rectF5 = rectF;
                                f17 = AndroidUtilities.lerp(1.0f, measuredWidth22, t0Var.j);
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
                            if (a71Var2 != null) {
                                if (a71Var2.L) {
                                    float measuredWidth3 = el0Var.getMeasuredWidth() / f12;
                                    float measuredHeight = el0Var.getMeasuredHeight() / f12;
                                    float measuredWidth4 = el0Var.getMeasuredWidth() - AndroidUtilities.dp(f12);
                                    float lerp4 = AndroidUtilities.lerp(measuredWidth4, (a71Var2.getMeasuredWidth() - AndroidUtilities.dp(f12)) / f17, t0Var.j);
                                    RectF rectF11 = AndroidUtilities.rectTmp;
                                    float f36 = lerp4 / f12;
                                    rectF7 = rectF6;
                                    gl0Var4 = gl0Var;
                                    rectF11.set(measuredWidth3 - f36, measuredHeight - f36, measuredWidth3 + f36, measuredHeight + f36);
                                    float lerp5 = AndroidUtilities.lerp(measuredWidth4 / f12, AndroidUtilities.dp(4.0f), t0Var.j);
                                    canvas2.drawRoundRect(rectF11, lerp5, lerp5, n0Var.L);
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
                                    s5 s5Var = dl0Var2.e;
                                    if (s5Var != null && (b4Var3 = s5Var.k) != null) {
                                        imageReceiver = b4Var3;
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
                                    imageReceiver.setRoundRadius((int) AndroidUtilities.lerp(f14, 0.0f, t0Var.j), (int) AndroidUtilities.lerp(f15, 0.0f, t0Var.j), (int) AndroidUtilities.lerp(f16, 0.0f, t0Var.j), (int) AndroidUtilities.lerp(f13, 0.0f, t0Var.j));
                                    el0Var.draw(canvas2);
                                    imageReceiver.setRoundRadius(iArr);
                                }
                                boolean z12 = z10;
                                el0Var.x = z12;
                                if (!a71Var2.b) {
                                    a71Var2.b = z12;
                                    a71Var2.invalidate();
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
                                    s5 s5Var2 = dl0Var2.e;
                                    if (s5Var2 != null && (b4Var2 = s5Var2.k) != null) {
                                        imageReceiver2 = b4Var2;
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
                            float f37 = 1.0f - t0Var.j;
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
            int i25 = t0Var.F;
            if (i25 < 5) {
                if (i25 == 3) {
                    gl0Var2.setSkipDraw(true);
                }
                t0Var.F++;
            }
            Paint paint2 = n0Var.X1;
            o61 o61Var = n0Var.h0;
            ImageReceiver imageReceiver3 = n0Var.V0;
            if (n0Var.S0 != null) {
                imageReceiver3.setParentView(this);
                a71 a71Var3 = n0Var.S0;
                if (a71Var3 != null) {
                    float f38 = n0Var.U0;
                    if (f38 != 1.0f && !n0Var.T0 && n0Var.h1) {
                        float f39 = f38 + 0.010666667f;
                        n0Var.U0 = f39;
                        if (f39 >= 1.0f) {
                            n0Var.U0 = 1.0f;
                            p71 p71Var = n0Var.H;
                            if (p71Var != null) {
                                gl0 gl0Var6 = (gl0) ((ya.c) p71Var).b;
                                if (a71Var3.s) {
                                    gl0Var6.l(a71Var3, a71Var3.x, true);
                                } else {
                                    long j10 = a71Var3.e.documentId;
                                    i1 i1Var2 = new i1();
                                    i1Var2.g = j10;
                                    i1Var2.h = j10;
                                    gl0Var6.l(a71Var3, i1Var2, true);
                                }
                            }
                        }
                        n0Var.S0.G = n0Var.U0;
                    }
                    float f40 = (n0Var.U0 * f12) + 1.0f;
                    canvas2.save();
                    canvas2.translate(n0Var.S0.getX() + o61Var.getX(), n0Var.S0.getY() + o61Var.getY() + n0Var.g0.getY());
                    paint2.setColor(g6.w0(g6.G8, n0Var.Z0));
                    canvas2.drawRect(0.0f, 0.0f, n0Var.S0.getMeasuredWidth(), n0Var.S0.getMeasuredHeight(), paint2);
                    canvas2.scale(f40, f40, n0Var.S0.getMeasuredWidth() / f12, n0Var.S0.getMeasuredHeight());
                    a71 a71Var4 = n0Var.S0;
                    if (!a71Var4.s) {
                        imageReceiver3 = a71Var4.r;
                    }
                    s5 s5Var3 = n0Var.W0;
                    if (s5Var3 != null && (b4Var = s5Var3.k) != null && b4Var.hasBitmapImage()) {
                        imageReceiver3 = n0Var.W0.k;
                    }
                    if (imageReceiver3 != null) {
                        imageReceiver3.setImageCoords(0.0f, 0.0f, n0Var.S0.getMeasuredWidth(), n0Var.S0.getMeasuredHeight());
                        imageReceiver3.draw(canvas2);
                    }
                    canvas2.restore();
                    invalidate();
                }
            }
            if (i13 == 5) {
                canvas2.restore();
            }
            if (t0Var.x != null) {
                invalidate();
            }
            Runnable runnable = x0.c;
            if (runnable != null) {
                runnable.run();
                x0.c = null;
            }
        }
    }

    @Override // android.view.View
    public final void invalidate() {
        super.invalidate();
        t0 t0Var = this.w;
        gl0 gl0Var = t0Var.n;
        if (t0Var.y == 1 || !(gl0Var == null || gl0Var.getDelegate() == null || !gl0Var.getDelegate().D())) {
            t0Var.m.f0.invalidate();
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
        t0 t0Var = this.w;
        int i13 = t0Var.y;
        if (i13 == 1 || i13 == 2 || i13 == 4) {
            measuredWidth = t0Var.n.getMeasuredWidth();
        } else if (i13 == 5) {
            measuredWidth = AndroidUtilities.dp(12.0f) + (AndroidUtilities.dp(36.0f) * 8);
        } else {
            measuredWidth = Math.min(View.MeasureSpec.getSize(i10), View.MeasureSpec.getSize(i11));
            int dp3 = (AndroidUtilities.dp(36.0f) * 8) + AndroidUtilities.dp(12.0f);
            if (dp3 < measuredWidth) {
                measuredWidth = dp3;
            }
        }
        if (t0Var.y != 4) {
            if (t0Var.n.F0) {
                int ceil = (int) Math.ceil(t0Var.o.size() / 8.0f);
                if (ceil <= 8) {
                    i12 = AndroidUtilities.dp(8.0f) + (AndroidUtilities.dp(36.0f) * ceil);
                } else {
                    dp = AndroidUtilities.dp(36.0f) * 8;
                    dp2 = AndroidUtilities.dp(8.0f);
                }
            } else {
                i12 = measuredWidth;
            }
            if (t0Var.y == 5) {
                i12 = Math.min(AndroidUtilities.dp(254.0f), i12);
            }
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(measuredWidth, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(i12, TLObject.FLAG_30));
        }
        dp = AndroidUtilities.dp(36.0f) * 8;
        dp2 = AndroidUtilities.dp(8.0f);
        i12 = dp - dp2;
        if (t0Var.y == 5) {
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(measuredWidth, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(i12, TLObject.FLAG_30));
    }
}
