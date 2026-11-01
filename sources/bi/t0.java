package bi;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.a30;
import org.telegram.messenger.at;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.Components.CheckBoxBase;
import org.telegram.ui.Components.az;
import org.telegram.ui.Components.bm;
import org.telegram.ui.Components.cw0;
import org.telegram.ui.Components.dp0;
import org.telegram.ui.Components.g60;
import org.telegram.ui.Components.ha;
import org.telegram.ui.Components.i60;
import org.telegram.ui.Components.jb0;
import org.telegram.ui.Components.jn;
import org.telegram.ui.Components.kn;
import org.telegram.ui.Components.lu0;
import org.telegram.ui.Components.m60;
import org.telegram.ui.Components.mp0;
import org.telegram.ui.Components.mx0;
import org.telegram.ui.Components.pp0;
import org.telegram.ui.Components.rz0;
import org.telegram.ui.Components.tv0;
import org.telegram.ui.Components.vu0;
import org.telegram.ui.Components.yq;
import org.telegram.ui.c8;
import org.telegram.ui.cr0;
import org.telegram.ui.lr0;
import org.telegram.ui.n40;
import org.telegram.ui.o10;
import org.telegram.ui.uh0;
import org.telegram.ui.vu;
import org.telegram.ui.wn0;
import org.telegram.ui.x7;
import org.telegram.ui.xn;
import org.telegram.ui.zx;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes4.dex */
public final class t0 extends View {
    public final /* synthetic */ int a;
    public Object b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ t0(Context context) {
        super(context);
        this.a = 13;
    }

    @Override // android.view.View
    public void dispatchDraw(Canvas canvas) {
        switch (this.a) {
            case 2:
                super.dispatchDraw(canvas);
                jg.j0 j0Var = ((cr0) this.b).F0;
                if (j0Var != null) {
                    j0Var.d(canvas);
                    break;
                }
                break;
            case 27:
                super.dispatchDraw(canvas);
                g.b bVar = (g.b) this.b;
                if (bVar != null && bVar.a(canvas, getMeasuredWidth(), 0.0f)) {
                    invalidate();
                    break;
                }
                break;
            default:
                super.dispatchDraw(canvas);
                break;
        }
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        switch (this.a) {
            case 13:
                super.draw(canvas);
                ((rz0) this.b).e(canvas, (getMeasuredWidth() - ((rz0) this.b).k()) / 2.0f, getMeasuredHeight() / 2.0f);
                break;
            case 17:
                super.draw(canvas);
                pp0 pp0Var = (pp0) this.b;
                pp0Var.N2.setBounds(0, (getMeasuredHeight() - pp0Var.y2.d) - org.telegram.messenger.i0.L(72.0f), getMeasuredWidth(), getMeasuredHeight());
                pp0Var.N2.draw(canvas);
                break;
            default:
                super.draw(canvas);
                break;
        }
    }

    @Override // android.view.View
    public void invalidate() {
        switch (this.a) {
            case 21:
                super.invalidate();
                ((vu0) this.b).S();
                break;
            default:
                super.invalidate();
                break;
        }
    }

    @Override // android.view.View
    public void onAttachedToWindow() {
        switch (this.a) {
            case 1:
                super.onAttachedToWindow();
                ((CheckBoxBase) this.b).l = true;
                break;
            case 27:
                super.onAttachedToWindow();
                g.b bVar = (g.b) this.b;
                if (bVar != null) {
                    bVar.i = this;
                    int i10 = 0;
                    while (true) {
                        n40[] n40VarArr = (n40[]) bVar.e;
                        if (i10 >= n40VarArr.length) {
                            break;
                        } else {
                            n40 n40Var = n40VarArr[i10];
                            n40Var.i.add(this);
                            n40Var.a();
                            i10++;
                        }
                    }
                }
                break;
            default:
                super.onAttachedToWindow();
                break;
        }
    }

    @Override // android.view.View
    public void onDetachedFromWindow() {
        switch (this.a) {
            case 1:
                super.onDetachedFromWindow();
                ((CheckBoxBase) this.b).l = false;
                break;
            case 27:
                super.onDetachedFromWindow();
                g.b bVar = (g.b) this.b;
                if (bVar != null && ((t0) bVar.i) != this) {
                    int i10 = 0;
                    while (true) {
                        n40[] n40VarArr = (n40[]) bVar.e;
                        if (i10 >= n40VarArr.length) {
                            bVar.i = null;
                            break;
                        } else {
                            n40 n40Var = n40VarArr[i10];
                            n40Var.i.remove(this);
                            n40Var.a();
                            i10++;
                        }
                    }
                }
                break;
            default:
                super.onDetachedFromWindow();
                break;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:108:0x0613  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0630  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void onDraw(Canvas canvas) {
        float f7;
        float f10;
        float f11;
        float f12;
        float f13;
        int i10;
        float f14;
        Drawable drawable;
        int i11 = this.a;
        int i12 = at.e4;
        float f15 = 1.0f;
        int i13 = 1;
        switch (i11) {
            case 0:
                canvas.save();
                canvas.translate(org.telegram.messenger.i0.N(22.6f), org.telegram.messenger.i0.N(21.66f));
                ((y0) this.b).c.draw(canvas);
                canvas.restore();
                break;
            case 1:
                int L = org.telegram.messenger.i0.L(20.0f);
                int width = (getWidth() - L) / 2;
                int height = (getHeight() - L) / 2;
                CheckBoxBase checkBoxBase = (CheckBoxBase) this.b;
                checkBoxBase.e(width, height, L, L);
                checkBoxBase.a(canvas);
                break;
            case 3:
                super.onDraw(canvas);
                kg.q0 q0Var = (kg.q0) this.b;
                if (q0Var.h2 - q0Var.g2 > 1) {
                    Paint W0 = org.telegram.ui.ActionBar.t6.W0("paintDivider", q0Var.I0);
                    if (W0 == null) {
                        W0 = org.telegram.ui.ActionBar.t6.k0;
                    }
                    canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), 1.0f, W0);
                    break;
                }
                break;
            case 4:
                canvas.drawColor(org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.e7, ((mg.i2) this.b).I0));
                break;
            case 7:
                org.telegram.ui.Cells.v2 v2Var = (org.telegram.ui.Cells.v2) this.b;
                v2Var.n4.setBounds(0, 0, getWidth(), getHeight());
                v2Var.n4.draw(canvas);
                break;
            case 12:
                if (((yq) this.b).R1) {
                    canvas.drawRect(r2.t0, 0.0f, getMeasuredWidth() - r2.t0, 1.0f, org.telegram.ui.ActionBar.t6.k0);
                    break;
                }
                break;
            case 16:
                super.onDraw(canvas);
                ((lr0) this.b).j(canvas, getMeasuredWidth(), getMeasuredHeight());
                break;
            case 19:
                super.onDraw(canvas);
                int S0 = org.telegram.messenger.i0.S0(getTranslationX() / getMeasuredWidth(), 1.0f, -9057429, -10513163);
                int S02 = org.telegram.messenger.i0.S0(getTranslationX() / getMeasuredWidth(), 1.0f, -11554882, -4629871);
                dp0 dp0Var = (dp0) this.b;
                dp0Var.getClass();
                if (S0 != 0) {
                    dp0Var.h = new LinearGradient(0.0f, 0.0f, getMeasuredWidth(), 0.0f, new int[]{S0, S02}, (float[]) null, Shader.TileMode.CLAMP);
                    dp0Var.n.setShader(dp0Var.h);
                }
                dp0Var.r.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                canvas.drawRoundRect(dp0Var.r, org.telegram.messenger.i0.L(18.0f), org.telegram.messenger.i0.L(18.0f), dp0Var.n);
                break;
            case 21:
                float f16 = 2.0f;
                vu0 vu0Var = (vu0) this.b;
                if (vu0Var.b != null && !vu0Var.J) {
                    Drawable newDrawable = vu0Var.getNewDrawable();
                    boolean newDrawableMotion = vu0Var.getNewDrawableMotion();
                    if (newDrawable != vu0Var.b && newDrawable != null) {
                        if (org.telegram.ui.ActionBar.t6.h1()) {
                            vu0Var.d = vu0Var.b;
                            vu0Var.e = vu0Var.c;
                        }
                        if (newDrawable instanceof jb0) {
                            ((jb0) newDrawable).q(vu0Var.L);
                        }
                        vu0Var.b = newDrawable;
                        if (vu0Var.M && (newDrawable instanceof xn)) {
                            ((xn) newDrawable).f(this);
                        }
                        if (vu0Var.M) {
                            Drawable drawable2 = vu0Var.b;
                            if (drawable2 instanceof jb0) {
                                ((jb0) drawable2).k();
                            }
                        }
                        vu0Var.c = newDrawableMotion;
                        vu0Var.T = 0.0f;
                        vu0Var.T(vu0Var.b);
                        vu0Var.G();
                    } else if (vu0Var.c != newDrawableMotion) {
                        vu0Var.c = newDrawableMotion;
                        vu0Var.G();
                    }
                    vu0Var.T = Utilities.i((org.telegram.messenger.i0.t / 200.0f) + vu0Var.T, 1.0f, 0.0f);
                    int i14 = 0;
                    while (i14 < 2) {
                        Drawable drawable3 = i14 == 0 ? vu0Var.d : vu0Var.b;
                        if (drawable3 == null) {
                            i10 = i14;
                            f13 = f15;
                            f14 = f16;
                        } else {
                            if (i14 != i13 || vu0Var.d == null || vu0Var.G == null) {
                                drawable3.setAlpha(i12);
                            } else {
                                drawable3.setAlpha((int) (vu0Var.T * 255.0f));
                            }
                            if (i14 == 0 ? vu0Var.e : vu0Var.c) {
                                f7 = vu0Var.D;
                                f10 = vu0Var.x;
                                f11 = vu0Var.y;
                            } else {
                                f7 = f15;
                                f10 = 0.0f;
                                f11 = 0.0f;
                            }
                            if (drawable3 instanceof jb0) {
                                jb0 jb0Var = (jb0) drawable3;
                                if ((jb0Var.u != null ? i13 : 0) != 0) {
                                    int currentActionBarHeight = (vu0Var.O() ? org.telegram.ui.ActionBar.l.getCurrentActionBarHeight() : 0) + ((vu0Var.P() && vu0Var.s) ? org.telegram.messenger.i0.m : 0);
                                    int measuredHeight = vu0Var.W() ? getRootView().getMeasuredHeight() - currentActionBarHeight : getHeight();
                                    float max = Math.max(getMeasuredWidth() / drawable3.getIntrinsicWidth(), measuredHeight / drawable3.getIntrinsicHeight());
                                    int ceil = (int) Math.ceil(drawable3.getIntrinsicWidth() * max * f7);
                                    float intrinsicHeight = drawable3.getIntrinsicHeight() * max * f7;
                                    f12 = f15;
                                    int ceil2 = (int) Math.ceil(intrinsicHeight);
                                    int measuredWidth = ((getMeasuredWidth() - ceil) / 2) + ((int) f10);
                                    int i15 = ((measuredHeight - ceil2) / 2) + vu0Var.E + currentActionBarHeight + ((int) f11);
                                    canvas.save();
                                    canvas.clipRect(0, currentActionBarHeight, ceil, getMeasuredHeight() - vu0Var.h);
                                    drawable3.setBounds(measuredWidth, i15, ceil + measuredWidth, ceil2 + i15);
                                    drawable3.draw(canvas);
                                    vu0.F(vu0Var, canvas);
                                    canvas.restore();
                                } else {
                                    f12 = f15;
                                    if (vu0Var.h != 0) {
                                        canvas.save();
                                        canvas.clipRect(0, 0, getMeasuredWidth(), getRootView().getMeasuredHeight() - vu0Var.h);
                                    }
                                    jb0Var.f = vu0Var.E;
                                    drawable3.setBounds(0, 0, getMeasuredWidth(), (int) ((getRootView().getMeasuredHeight() - vu0Var.E) + f11));
                                    drawable3.draw(canvas);
                                    if (vu0Var.h != 0) {
                                        canvas.restore();
                                    }
                                }
                            } else {
                                f12 = f15;
                                if (drawable3 instanceof ColorDrawable) {
                                    if (vu0Var.h != 0) {
                                        canvas.save();
                                        canvas.clipRect(0, 0, getMeasuredWidth(), getMeasuredHeight() - vu0Var.h);
                                    }
                                    drawable3.setBounds(0, 0, getMeasuredWidth(), getRootView().getMeasuredHeight());
                                    drawable3.draw(canvas);
                                    vu0.F(vu0Var, canvas);
                                    if (vu0Var.h != 0) {
                                        canvas.restore();
                                    }
                                } else if (drawable3 instanceof GradientDrawable) {
                                    if (vu0Var.h != 0) {
                                        canvas.save();
                                        canvas.clipRect(0, 0, getMeasuredWidth(), getRootView().getMeasuredHeight() - vu0Var.h);
                                    }
                                    drawable3.setBounds(0, vu0Var.E, getMeasuredWidth(), getRootView().getMeasuredHeight() + vu0Var.E);
                                    drawable3.draw(canvas);
                                    vu0.F(vu0Var, canvas);
                                    if (vu0Var.h != 0) {
                                        canvas.restore();
                                    }
                                } else if (!(drawable3 instanceof BitmapDrawable)) {
                                    f13 = f12;
                                    i10 = i14;
                                    if (vu0Var.h != 0) {
                                        canvas.save();
                                        canvas.clipRect(0, 0, getMeasuredWidth(), getRootView().getMeasuredHeight() - vu0Var.h);
                                    }
                                    if (drawable3 instanceof xn) {
                                        xn xnVar = (xn) drawable3;
                                        xnVar.b = this;
                                        jb0 jb0Var2 = xnVar.f;
                                        if (jb0Var2 != null) {
                                            jb0Var2.q(this);
                                        }
                                    }
                                    float f17 = f7 - f13;
                                    f14 = f16;
                                    float A = a1.g.A(-getMeasuredWidth(), f17, f14, f10);
                                    float A2 = a1.g.A(-getRootView().getMeasuredHeight(), f17, f14, f11);
                                    drawable3.setBounds((int) A, (int) (vu0Var.E + A2), (int) ((getMeasuredWidth() * f7) + A), (int) sc.e.d(getRootView().getMeasuredHeight(), f7, vu0Var.E, A2));
                                    drawable3.draw(canvas);
                                    vu0.F(vu0Var, canvas);
                                    if (vu0Var.h != 0) {
                                        canvas.restore();
                                    }
                                    if (i10 == 0) {
                                        if (vu0Var.M) {
                                            ((xn) drawable).g(vu0Var.L);
                                        }
                                        if (vu0Var.M) {
                                        }
                                        vu0Var.d = null;
                                        vu0Var.e = false;
                                        vu0Var.G();
                                        vu0Var.L.invalidate();
                                        i14 = i10 + 1;
                                        f16 = f14;
                                        f15 = f13;
                                        i12 = at.e4;
                                        i13 = 1;
                                    }
                                } else if (((BitmapDrawable) drawable3).getTileModeX() == Shader.TileMode.REPEAT) {
                                    canvas.save();
                                    float f18 = f16 / org.telegram.messenger.i0.p;
                                    canvas.scale(f18, f18);
                                    drawable3.setBounds(0, 0, (int) Math.ceil(getMeasuredWidth() / f18), (int) Math.ceil(getRootView().getMeasuredHeight() / f18));
                                    drawable3.draw(canvas);
                                    vu0.F(vu0Var, canvas);
                                    canvas.restore();
                                } else {
                                    int currentActionBarHeight2 = (vu0Var.O() ? org.telegram.ui.ActionBar.l.getCurrentActionBarHeight() : 0) + ((vu0Var.P() && vu0Var.s) ? org.telegram.messenger.i0.m : 0);
                                    int measuredHeight2 = vu0Var.W() ? getRootView().getMeasuredHeight() - currentActionBarHeight2 : getHeight();
                                    float max2 = Math.max(getMeasuredWidth() / drawable3.getIntrinsicWidth(), measuredHeight2 / drawable3.getIntrinsicHeight());
                                    int ceil3 = (int) Math.ceil(drawable3.getIntrinsicWidth() * max2 * f7);
                                    float intrinsicHeight2 = drawable3.getIntrinsicHeight() * max2 * f7;
                                    f13 = f12;
                                    i10 = i14;
                                    int ceil4 = (int) Math.ceil(intrinsicHeight2);
                                    int measuredWidth2 = ((getMeasuredWidth() - ceil3) / 2) + ((int) f10);
                                    int i16 = ((measuredHeight2 - ceil4) / 2) + vu0Var.E + currentActionBarHeight2 + ((int) f11);
                                    canvas.save();
                                    canvas.clipRect(0, currentActionBarHeight2, ceil3, getMeasuredHeight() - vu0Var.h);
                                    drawable3.setBounds(measuredWidth2, i16, ceil3 + measuredWidth2, ceil4 + i16);
                                    drawable3.draw(canvas);
                                    vu0.F(vu0Var, canvas);
                                    canvas.restore();
                                    f14 = f16;
                                    if (i10 == 0 && (drawable = vu0Var.d) != null && vu0Var.T >= f13) {
                                        if (vu0Var.M && (drawable instanceof xn)) {
                                            ((xn) drawable).g(vu0Var.L);
                                        }
                                        if (vu0Var.M) {
                                            Drawable drawable4 = vu0Var.d;
                                            if (drawable4 instanceof jb0) {
                                                ((jb0) drawable4).l();
                                            }
                                        }
                                        vu0Var.d = null;
                                        vu0Var.e = false;
                                        vu0Var.G();
                                        vu0Var.L.invalidate();
                                        i14 = i10 + 1;
                                        f16 = f14;
                                        f15 = f13;
                                        i12 = at.e4;
                                        i13 = 1;
                                    }
                                }
                            }
                            f13 = f12;
                            i10 = i14;
                            f14 = f16;
                            if (i10 == 0) {
                            }
                        }
                        i14 = i10 + 1;
                        f16 = f14;
                        f15 = f13;
                        i12 = at.e4;
                        i13 = 1;
                    }
                    if (vu0Var.T != f15) {
                        vu0Var.L.invalidate();
                        break;
                    }
                }
                break;
            case 23:
                super.onDraw(canvas);
                int x02 = org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.Jj, false);
                mx0 mx0Var = (mx0) this.b;
                org.telegram.ui.Components.voip.g gVar = mx0Var.L;
                Paint paint = mx0Var.a;
                paint.setColor(x02);
                Paint paint2 = mx0Var.b;
                paint2.setColor(x02);
                Paint paint3 = mx0Var.c;
                paint3.setColor(x02);
                paint2.setAlpha(at.e4);
                paint3.setAlpha(82);
                paint.setAlpha(46);
                Paint paint4 = mx0Var.d;
                paint4.setColor(org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.d6, false));
                canvas.drawLine(org.telegram.messenger.i0.L(24.0f), org.telegram.messenger.i0.L(20.0f), getMeasuredWidth() - org.telegram.messenger.i0.L(24.0f), org.telegram.messenger.i0.L(20.0f), paint);
                boolean z10 = mx0Var.e;
                if (z10 || mx0Var.J != 0.0f) {
                    if (!z10) {
                        float f19 = mx0Var.J - 0.10666667f;
                        mx0Var.J = f19;
                        if (f19 < 0.0f) {
                            mx0Var.J = 0.0f;
                        }
                    } else if (mx0Var.K) {
                        float f20 = mx0Var.J + 0.024615385f;
                        mx0Var.J = f20;
                        if (f20 > 1.0f) {
                            mx0Var.J = 1.0f;
                            mx0Var.K = false;
                        }
                    } else {
                        float f21 = mx0Var.J - 0.024615385f;
                        mx0Var.J = f21;
                        if (f21 < 0.0f) {
                            mx0Var.J = 0.0f;
                            mx0Var.K = true;
                        }
                    }
                    invalidate();
                    RectF rectF = org.telegram.messenger.i0.P;
                    rectF.set(org.telegram.messenger.i0.L(24.0f), org.telegram.messenger.i0.L(17.0f), getMeasuredWidth() - org.telegram.messenger.i0.L(24.0f), org.telegram.messenger.i0.L(23.0f));
                    gVar.f = getMeasuredWidth();
                    gVar.a(org.telegram.messenger.i0.L(3.0f), canvas, rectF, null);
                }
                int L2 = org.telegram.messenger.i0.L(24.0f);
                if (!mx0Var.e) {
                    int L3 = org.telegram.messenger.i0.L(24.0f) + ((int) (a30.A(24.0f, 2, getMeasuredWidth()) * mx0Var.F));
                    canvas.drawLine(L2, org.telegram.messenger.i0.L(20.0f), org.telegram.messenger.i0.L(24.0f) + r2, org.telegram.messenger.i0.L(20.0f), paint3);
                    canvas.drawRect(L3, org.telegram.messenger.i0.L(20.0f) - org.telegram.messenger.i0.L(3.0f), org.telegram.messenger.i0.L(3.0f) + L3, org.telegram.messenger.i0.L(3.0f) + org.telegram.messenger.i0.L(20.0f), paint4);
                }
                if (!mx0Var.e) {
                    int A3 = (int) (a30.A(24.0f, 2, getMeasuredWidth()) * mx0Var.E);
                    if (A3 < org.telegram.messenger.i0.L(1.0f)) {
                        A3 = org.telegram.messenger.i0.L(1.0f);
                    }
                    int L4 = org.telegram.messenger.i0.L(24.0f) + A3;
                    canvas.drawLine(L2, org.telegram.messenger.i0.L(20.0f), org.telegram.messenger.i0.L(24.0f) + A3, org.telegram.messenger.i0.L(20.0f), paint2);
                    canvas.drawRect(L4, org.telegram.messenger.i0.L(20.0f) - org.telegram.messenger.i0.L(3.0f), org.telegram.messenger.i0.L(3.0f) + L4, org.telegram.messenger.i0.L(3.0f) + org.telegram.messenger.i0.L(20.0f), paint4);
                    break;
                }
                break;
            case 24:
                if (getAlpha() != 0.0f) {
                    RectF rectF2 = org.telegram.messenger.i0.P;
                    rectF2.set(0.0f, 0.0f, getWidth(), getHeight());
                    ((org.telegram.ui.Components.voip.t0) this.b).n.a(org.telegram.messenger.i0.L(10.0f), canvas, rectF2, null);
                    invalidate();
                    break;
                }
                break;
            case 28:
                canvas.drawColor(org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.e7, ((uh0) this.b).I0));
                break;
            case 29:
                wn0 wn0Var = (wn0) this.b;
                String format = String.format("%d", Integer.valueOf(Math.max(1, wn0Var.c.size())));
                int max3 = Math.max(org.telegram.messenger.i0.L(16.0f) + ((int) Math.ceil(wn0Var.S.measureText(format))), org.telegram.messenger.i0.L(24.0f));
                int measuredWidth3 = getMeasuredWidth() / 2;
                getMeasuredHeight();
                wn0Var.S.setColor(org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.C5, false));
                wn0Var.U.setColor(org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.h5, false));
                int i17 = max3 / 2;
                wn0Var.T.set(measuredWidth3 - i17, 0.0f, i17 + measuredWidth3, getMeasuredHeight());
                canvas.drawRoundRect(wn0Var.T, org.telegram.messenger.i0.L(12.0f), org.telegram.messenger.i0.L(12.0f), wn0Var.U);
                wn0Var.U.setColor(org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.B5, false));
                wn0Var.T.set(org.telegram.messenger.i0.L(2.0f) + r14, org.telegram.messenger.i0.L(2.0f), r7 - org.telegram.messenger.i0.L(2.0f), getMeasuredHeight() - org.telegram.messenger.i0.L(2.0f));
                canvas.drawRoundRect(wn0Var.T, org.telegram.messenger.i0.L(10.0f), org.telegram.messenger.i0.L(10.0f), wn0Var.U);
                canvas.drawText(format, measuredWidth3 - (r6 / 2), org.telegram.messenger.i0.L(16.2f), wn0Var.S);
                break;
            default:
                super.onDraw(canvas);
                break;
        }
    }

    @Override // android.view.View
    public void onMeasure(int i10, int i11) {
        switch (this.a) {
            case 1:
                setMeasuredDimension(View.MeasureSpec.getSize(i10), org.telegram.messenger.i0.L(24.0f));
                break;
            case 2:
            case 3:
            case 4:
            case 6:
            case 7:
            case 12:
            case 16:
            case 17:
            case 19:
            case 21:
            case 24:
            case 25:
            default:
                super.onMeasure(i10, i11);
                break;
            case 5:
                s4.a0 a0Var = ((org.telegram.ui.m5) this.b).d.F;
                super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(Math.max(0, a0Var instanceof az ? ((az) a0Var).J : 0), TLObject.FLAG_30));
                break;
            case 8:
                ha haVar = (ha) this.b;
                int i12 = haVar.n1;
                int L = (i12 == 0 ? org.telegram.messenger.i0.L(300.0f) : (int) (i12 * haVar.r1)) - (((haVar.x1 - haVar.y1) - haVar.z1) - haVar.A1);
                if (L < 1) {
                    L = 1;
                }
                super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(L, TLObject.FLAG_30));
                break;
            case 9:
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(((bm) this.b).w.J, TLObject.FLAG_30));
                break;
            case 10:
                setMeasuredDimension(View.MeasureSpec.getSize(i10), ((jn) ((fg.j) this.b).e).R0);
                break;
            case 11:
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(((kn) ((x7) this.b).d).x, TLObject.FLAG_30));
                break;
            case 13:
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(getPaddingRight() + getPaddingLeft() + Math.round(((rz0) this.b).k()), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(Math.max(getPaddingBottom() + getPaddingTop() + Math.round(((rz0) this.b).i()), org.telegram.messenger.i0.L(26.0f)), TLObject.FLAG_30));
                break;
            case 14:
                super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.i0.L(48.0f) + ((g60) this.b).c.f2, TLObject.FLAG_30));
                break;
            case 15:
                int L2 = org.telegram.messenger.i0.L(48.0f);
                m60 m60Var = ((i60) this.b).n;
                super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(L2 + m60Var.f2 + m60Var.l2, TLObject.FLAG_30));
                break;
            case 18:
                super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(((mp0) this.b).K.B1.R, TLObject.FLAG_30));
                break;
            case 20:
                setMeasuredDimension(View.MeasureSpec.getSize(i10), ((lu0) this.b).getMeasuredHeight());
                break;
            case 22:
                tv0 tv0Var = (tv0) this.b;
                int size = View.MeasureSpec.getSize(i10);
                if (size <= 0) {
                    size = ((View) getParent()).getMeasuredWidth();
                }
                int size2 = View.MeasureSpec.getSize(i11) - org.telegram.messenger.i0.L(4.0f);
                cw0 cw0Var = tv0Var.d;
                int i13 = cw0Var.n3;
                int max = Math.max(i13 > 0 ? org.telegram.messenger.i0.L(4.0f) + i13 : 0, (int) (size - Math.min(org.telegram.messenger.i0.L(4.0f) + ((tv0Var.b() - 1) * size2), tv0Var.d.e3 * size2)));
                cw0Var.m3 = max;
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(max, TLObject.FLAG_30), i11);
                break;
            case 23:
                super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.i0.L(40.0f), TLObject.FLAG_30));
                break;
            case 26:
                o10 o10Var = (o10) this.b;
                if (o10Var.H) {
                    o10Var.J = (o10Var.p0().getMeasuredHeight() + o10Var.I) - org.telegram.messenger.i0.L(16.0f);
                } else {
                    int L3 = org.telegram.messenger.i0.L(140.0f) + o10Var.I;
                    if (org.telegram.messenger.i0.L(24.0f) + o10Var.D.getMeasuredHeight() > L3) {
                        L3 = Math.max(L3, (org.telegram.messenger.i0.L(24.0f) + o10Var.D.getMeasuredHeight()) - o10Var.L);
                    }
                    o10Var.J = L3;
                }
                int i14 = (int) (o10Var.J - (0 * 2.5f));
                o10Var.J = i14;
                super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(i14, TLObject.FLAG_30));
                break;
            case 27:
                setMeasuredDimension(View.MeasureSpec.getSize(i10), org.telegram.messenger.i0.L(38.0f));
                break;
        }
    }

    @Override // android.view.View
    public void onSizeChanged(int i10, int i11, int i12, int i13) {
        switch (this.a) {
            case 24:
                super.onSizeChanged(i10, i11, i12, i13);
                ((org.telegram.ui.Components.voip.t0) this.b).n.f = i10;
                break;
            default:
                super.onSizeChanged(i10, i11, i12, i13);
                break;
        }
    }

    @Override // android.view.View
    public void setAlpha(float f7) {
        switch (this.a) {
            case 6:
                super.setAlpha(f7);
                View view = ((c8) this.b).b.y.fragmentView;
                if (view != null) {
                    view.invalidate();
                    break;
                }
                break;
            case 25:
                super.setAlpha(f7);
                View view2 = ((zx) this.b).fragmentView;
                if (view2 != null) {
                    view2.invalidate();
                    break;
                }
                break;
            default:
                super.setAlpha(f7);
                break;
        }
    }

    @Override // android.view.View
    public void setTranslationX(float f7) {
        switch (this.a) {
            case 19:
                super.setTranslationX(f7);
                invalidate();
                break;
            default:
                super.setTranslationX(f7);
                break;
        }
    }

    @Override // android.view.View
    public void setTranslationY(float f7) {
        switch (this.a) {
            case 8:
                super.setTranslationY(f7);
                ha haVar = (ha) this.b;
                int i10 = ha.O1;
                haVar.b.invalidate();
                break;
            default:
                super.setTranslationY(f7);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ t0(Object obj, Context context, int i10) {
        super(context);
        this.a = i10;
        this.b = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t0(ha haVar, Context context) {
        super(context);
        this.a = 8;
        this.b = haVar;
        setTag(-33024);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t0(Context context, org.telegram.ui.ActionBar.p6 p6Var) {
        super(context);
        this.a = 1;
        CheckBoxBase checkBoxBase = new CheckBoxBase(20, this, p6Var);
        this.b = checkBoxBase;
        checkBoxBase.h(org.telegram.ui.ActionBar.t6.Vl, org.telegram.ui.ActionBar.t6.z5, org.telegram.ui.ActionBar.t6.k7);
        checkBoxBase.d(10);
        checkBoxBase.k(true);
        checkBoxBase.i(org.telegram.messenger.i0.L(5.0f));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t0(Context context, g.b bVar) {
        super(context);
        this.a = 27;
        this.b = bVar;
        at.i(this);
        setOnClickListener(new vu(10, this, context));
    }
}
