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
import org.telegram.messenger.qs;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.Components.CheckBoxBase;
import org.telegram.ui.Components.av0;
import org.telegram.ui.Components.bn;
import org.telegram.ui.Components.bo0;
import org.telegram.ui.Components.cn;
import org.telegram.ui.Components.iw0;
import org.telegram.ui.Components.jt0;
import org.telegram.ui.Components.ko0;
import org.telegram.ui.Components.my;
import org.telegram.ui.Components.no0;
import org.telegram.ui.Components.ny0;
import org.telegram.ui.Components.oq;
import org.telegram.ui.Components.r50;
import org.telegram.ui.Components.ra0;
import org.telegram.ui.Components.ru0;
import org.telegram.ui.Components.t50;
import org.telegram.ui.Components.tl;
import org.telegram.ui.Components.tt0;
import org.telegram.ui.Components.y50;
import org.telegram.ui.eq0;
import org.telegram.ui.fn;
import org.telegram.ui.yw;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final class ec extends View {
    public final /* synthetic */ int a;
    public Object b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ec(int i7, Context context, Object obj) {
        super(context);
        this.a = i7;
        this.b = obj;
    }

    @Override // android.view.View
    public void dispatchDraw(Canvas canvas) {
        switch (this.a) {
            case 1:
                super.dispatchDraw(canvas);
                fi.i5 i5Var = ((fi.x9) this.b).x0;
                if (i5Var != null) {
                    i5Var.d(canvas);
                    break;
                }
                break;
            case 2:
                canvas.save();
                fi.va vaVar = (fi.va) this.b;
                canvas.translate(vaVar.c1.getX() + vaVar.l0.getX(), vaVar.c1.getY() + vaVar.l0.getY());
                fi.la laVar = vaVar.c1;
                laVar.k(canvas, laVar.getBounds(), vaVar.c1.getOver2Alpha());
                canvas.restore();
                break;
            case 7:
                dh.d dVar = ((jh.f) this.b).I;
                if (dVar != null) {
                    dVar.draw(canvas);
                }
                super.dispatchDraw(canvas);
                break;
            default:
                super.dispatchDraw(canvas);
                break;
        }
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        switch (this.a) {
            case 18:
                super.draw(canvas);
                ((ny0) this.b).e(canvas, (getMeasuredWidth() - ((ny0) this.b).k()) / 2.0f, getMeasuredHeight() / 2.0f);
                break;
            case 22:
                super.draw(canvas);
                no0 no0Var = (no0) this.b;
                no0Var.N2.setBounds(0, (getMeasuredHeight() - no0Var.y2.d) - org.telegram.messenger.g0.L(72.0f), getMeasuredWidth(), getMeasuredHeight());
                no0Var.N2.draw(canvas);
                break;
            default:
                super.draw(canvas);
                break;
        }
    }

    @Override // android.view.View
    public void invalidate() {
        switch (this.a) {
            case 26:
                super.invalidate();
                ((tt0) this.b).S();
                break;
            default:
                super.invalidate();
                break;
        }
    }

    @Override // android.view.View
    public void onAttachedToWindow() {
        switch (this.a) {
            case 6:
                super.onAttachedToWindow();
                ((jg.o1) this.b).f = true;
                break;
            case 9:
                super.onAttachedToWindow();
                ((CheckBoxBase) this.b).l = true;
                break;
            default:
                super.onAttachedToWindow();
                break;
        }
    }

    @Override // android.view.View
    public void onDetachedFromWindow() {
        switch (this.a) {
            case 6:
                super.onDetachedFromWindow();
                ((jg.o1) this.b).f = false;
                break;
            case 9:
                super.onDetachedFromWindow();
                ((CheckBoxBase) this.b).l = false;
                break;
            default:
                super.onDetachedFromWindow();
                break;
        }
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        float f10;
        float f11;
        float f12;
        float f13;
        Drawable drawable;
        float f14;
        Paint paint;
        switch (this.a) {
            case 5:
                super.onDraw(canvas);
                ii.d0 d0Var = (ii.d0) this.b;
                bg.c0 c0Var = d0Var.B1;
                float max = Math.max(d0Var.i1.e, d0Var.j1.e);
                bg.c0 c0Var2 = d0Var.A1;
                c0Var2.c(org.telegram.messenger.g0.L(42.0f) + d0Var.L1.b, 0);
                c0Var2.setBounds(0, 0, getWidth(), org.telegram.messenger.g0.L(56.0f) + d0Var.L1.b);
                int i7 = org.telegram.ui.ActionBar.l6.a7;
                c0Var2.b(org.telegram.ui.ActionBar.l6.r1(org.telegram.messenger.g0.T1(1.0f, 0.8f, max), org.telegram.ui.ActionBar.l6.w0(i7, d0Var.I0)));
                c0Var2.draw(canvas);
                if (d0Var.E1) {
                    max = 1.0f;
                }
                int W1 = org.telegram.messenger.g0.W1(max, org.telegram.messenger.g0.L(48.0f) + d0Var.L1.d, 0);
                int W12 = org.telegram.messenger.g0.W1(max, org.telegram.messenger.g0.L(72.0f), 0) + d0Var.L1.d;
                float T1 = org.telegram.messenger.g0.T1(0.8f, org.telegram.messenger.g0.R0(d0Var.L1.d), max);
                c0Var.c(0, W1);
                c0Var.setBounds(0, getHeight() - W12, getWidth(), getHeight());
                c0Var.b(org.telegram.ui.ActionBar.l6.r1(T1, org.telegram.ui.ActionBar.l6.w0(i7, d0Var.I0)));
                c0Var.draw(canvas);
                break;
            case 8:
                canvas.save();
                canvas.translate(org.telegram.messenger.g0.N(22.6f), org.telegram.messenger.g0.N(21.66f));
                ((li.r0) this.b).c.draw(canvas);
                canvas.restore();
                break;
            case 9:
                int L = org.telegram.messenger.g0.L(20.0f);
                int width = (getWidth() - L) / 2;
                int height = (getHeight() - L) / 2;
                CheckBoxBase checkBoxBase = (CheckBoxBase) this.b;
                checkBoxBase.e(width, height, L, L);
                checkBoxBase.a(canvas);
                break;
            case 12:
                org.telegram.ui.Cells.t2 t2Var = (org.telegram.ui.Cells.t2) this.b;
                t2Var.n4.setBounds(0, 0, getWidth(), getHeight());
                t2Var.n4.draw(canvas);
                break;
            case 17:
                if (((oq) this.b).R1) {
                    canvas.drawRect(r2.t0, 0.0f, getMeasuredWidth() - r2.t0, 1.0f, org.telegram.ui.ActionBar.l6.k0);
                    break;
                }
                break;
            case 21:
                super.onDraw(canvas);
                ((eq0) this.b).j(canvas, getMeasuredWidth(), getMeasuredHeight());
                break;
            case 24:
                super.onDraw(canvas);
                int S0 = org.telegram.messenger.g0.S0(getTranslationX() / getMeasuredWidth(), 1.0f, -9057429, -10513163);
                int S02 = org.telegram.messenger.g0.S0(getTranslationX() / getMeasuredWidth(), 1.0f, -11554882, -4629871);
                bo0 bo0Var = (bo0) this.b;
                bo0Var.getClass();
                if (S0 != 0) {
                    bo0Var.h = new LinearGradient(0.0f, 0.0f, getMeasuredWidth(), 0.0f, new int[]{S0, S02}, (float[]) null, Shader.TileMode.CLAMP);
                    bo0Var.n.setShader(bo0Var.h);
                }
                bo0Var.r.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                canvas.drawRoundRect(bo0Var.r, org.telegram.messenger.g0.L(18.0f), org.telegram.messenger.g0.L(18.0f), bo0Var.n);
                break;
            case 26:
                tt0 tt0Var = (tt0) this.b;
                if (tt0Var.b != null && !tt0Var.J) {
                    Drawable newDrawable = tt0Var.getNewDrawable();
                    boolean newDrawableMotion = tt0Var.getNewDrawableMotion();
                    float f15 = 0.0f;
                    if (newDrawable != tt0Var.b && newDrawable != null) {
                        if (org.telegram.ui.ActionBar.l6.h1()) {
                            tt0Var.d = tt0Var.b;
                            tt0Var.e = tt0Var.c;
                        }
                        if (newDrawable instanceof ra0) {
                            ((ra0) newDrawable).q(tt0Var.L);
                        }
                        tt0Var.b = newDrawable;
                        if (tt0Var.M && (newDrawable instanceof fn)) {
                            ((fn) newDrawable).f(this);
                        }
                        if (tt0Var.M) {
                            Drawable drawable2 = tt0Var.b;
                            if (drawable2 instanceof ra0) {
                                ((ra0) drawable2).k();
                            }
                        }
                        tt0Var.c = newDrawableMotion;
                        tt0Var.T = 0.0f;
                        tt0Var.T(tt0Var.b);
                        tt0Var.G();
                    } else if (tt0Var.c != newDrawableMotion) {
                        tt0Var.c = newDrawableMotion;
                        tt0Var.G();
                    }
                    float f16 = 1.0f;
                    tt0Var.T = Utilities.i((org.telegram.messenger.g0.t / 200.0f) + tt0Var.T, 1.0f, 0.0f);
                    int i10 = 0;
                    while (i10 < 2) {
                        Drawable drawable3 = i10 == 0 ? tt0Var.d : tt0Var.b;
                        if (drawable3 == null) {
                            f13 = f16;
                        } else {
                            if (i10 != 1 || tt0Var.d == null || tt0Var.G == null) {
                                drawable3.setAlpha(qs.e4);
                            } else {
                                drawable3.setAlpha((int) (tt0Var.T * 255.0f));
                            }
                            if (i10 == 0 ? tt0Var.e : tt0Var.c) {
                                f10 = tt0Var.D;
                                f11 = tt0Var.x;
                                f12 = tt0Var.y;
                            } else {
                                f10 = f16;
                                f11 = f15;
                                f12 = f11;
                            }
                            if (drawable3 instanceof ra0) {
                                ra0 ra0Var = (ra0) drawable3;
                                if (ra0Var.u != null) {
                                    int currentActionBarHeight = (tt0Var.O() ? org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() : 0) + ((tt0Var.P() && tt0Var.s) ? org.telegram.messenger.g0.m : 0);
                                    int measuredHeight = tt0Var.W() ? getRootView().getMeasuredHeight() - currentActionBarHeight : getHeight();
                                    f13 = f16;
                                    float max2 = Math.max(getMeasuredWidth() / drawable3.getIntrinsicWidth(), measuredHeight / drawable3.getIntrinsicHeight());
                                    int ceil = (int) Math.ceil(drawable3.getIntrinsicWidth() * max2 * f10);
                                    int ceil2 = (int) Math.ceil(drawable3.getIntrinsicHeight() * max2 * f10);
                                    int measuredWidth = ((getMeasuredWidth() - ceil) / 2) + ((int) f11);
                                    int i11 = ((measuredHeight - ceil2) / 2) + tt0Var.E + currentActionBarHeight + ((int) f12);
                                    canvas.save();
                                    canvas.clipRect(0, currentActionBarHeight, ceil, getMeasuredHeight() - tt0Var.h);
                                    drawable3.setBounds(measuredWidth, i11, ceil + measuredWidth, ceil2 + i11);
                                    drawable3.draw(canvas);
                                    tt0.F(tt0Var, canvas);
                                    canvas.restore();
                                } else {
                                    f13 = f16;
                                    if (tt0Var.h != 0) {
                                        canvas.save();
                                        canvas.clipRect(0, 0, getMeasuredWidth(), getRootView().getMeasuredHeight() - tt0Var.h);
                                    }
                                    ra0Var.f = tt0Var.E;
                                    drawable3.setBounds(0, 0, getMeasuredWidth(), (int) ((getRootView().getMeasuredHeight() - tt0Var.E) + f12));
                                    drawable3.draw(canvas);
                                    if (tt0Var.h != 0) {
                                        canvas.restore();
                                    }
                                }
                            } else {
                                f13 = f16;
                                if (drawable3 instanceof ColorDrawable) {
                                    if (tt0Var.h != 0) {
                                        canvas.save();
                                        canvas.clipRect(0, 0, getMeasuredWidth(), getMeasuredHeight() - tt0Var.h);
                                    }
                                    drawable3.setBounds(0, 0, getMeasuredWidth(), getRootView().getMeasuredHeight());
                                    drawable3.draw(canvas);
                                    tt0.F(tt0Var, canvas);
                                    if (tt0Var.h != 0) {
                                        canvas.restore();
                                    }
                                } else if (drawable3 instanceof GradientDrawable) {
                                    if (tt0Var.h != 0) {
                                        canvas.save();
                                        canvas.clipRect(0, 0, getMeasuredWidth(), getRootView().getMeasuredHeight() - tt0Var.h);
                                    }
                                    drawable3.setBounds(0, tt0Var.E, getMeasuredWidth(), getRootView().getMeasuredHeight() + tt0Var.E);
                                    drawable3.draw(canvas);
                                    tt0.F(tt0Var, canvas);
                                    if (tt0Var.h != 0) {
                                        canvas.restore();
                                    }
                                } else if (!(drawable3 instanceof BitmapDrawable)) {
                                    if (tt0Var.h != 0) {
                                        canvas.save();
                                        canvas.clipRect(0, 0, getMeasuredWidth(), getRootView().getMeasuredHeight() - tt0Var.h);
                                    }
                                    if (drawable3 instanceof fn) {
                                        fn fnVar = (fn) drawable3;
                                        fnVar.b = this;
                                        ra0 ra0Var2 = fnVar.f;
                                        if (ra0Var2 != null) {
                                            ra0Var2.q(this);
                                        }
                                    }
                                    float f17 = f10 - f13;
                                    float f18 = a8.p0.f(-getMeasuredWidth(), f17, 2.0f, f11);
                                    float f19 = a8.p0.f(-getRootView().getMeasuredHeight(), f17, 2.0f, f12);
                                    drawable3.setBounds((int) f18, (int) (tt0Var.E + f19), (int) ((getMeasuredWidth() * f10) + f18), (int) rf.b.d(getRootView().getMeasuredHeight(), f10, tt0Var.E, f19));
                                    drawable3.draw(canvas);
                                    tt0.F(tt0Var, canvas);
                                    if (tt0Var.h != 0) {
                                        canvas.restore();
                                    }
                                } else if (((BitmapDrawable) drawable3).getTileModeX() == Shader.TileMode.REPEAT) {
                                    canvas.save();
                                    float f20 = 2.0f / org.telegram.messenger.g0.p;
                                    canvas.scale(f20, f20);
                                    drawable3.setBounds(0, 0, (int) Math.ceil(getMeasuredWidth() / f20), (int) Math.ceil(getRootView().getMeasuredHeight() / f20));
                                    drawable3.draw(canvas);
                                    tt0.F(tt0Var, canvas);
                                    canvas.restore();
                                } else {
                                    int currentActionBarHeight2 = (tt0Var.O() ? org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() : 0) + ((tt0Var.P() && tt0Var.s) ? org.telegram.messenger.g0.m : 0);
                                    int measuredHeight2 = tt0Var.W() ? getRootView().getMeasuredHeight() - currentActionBarHeight2 : getHeight();
                                    float max3 = Math.max(getMeasuredWidth() / drawable3.getIntrinsicWidth(), measuredHeight2 / drawable3.getIntrinsicHeight());
                                    int ceil3 = (int) Math.ceil(drawable3.getIntrinsicWidth() * max3 * f10);
                                    int ceil4 = (int) Math.ceil(drawable3.getIntrinsicHeight() * max3 * f10);
                                    int measuredWidth2 = ((getMeasuredWidth() - ceil3) / 2) + ((int) f11);
                                    int i12 = ((measuredHeight2 - ceil4) / 2) + tt0Var.E + currentActionBarHeight2 + ((int) f12);
                                    canvas.save();
                                    canvas.clipRect(0, currentActionBarHeight2, ceil3, getMeasuredHeight() - tt0Var.h);
                                    drawable3.setBounds(measuredWidth2, i12, ceil3 + measuredWidth2, ceil4 + i12);
                                    drawable3.draw(canvas);
                                    tt0.F(tt0Var, canvas);
                                    canvas.restore();
                                }
                            }
                            if (i10 == 0 && (drawable = tt0Var.d) != null && tt0Var.T >= f13) {
                                if (tt0Var.M && (drawable instanceof fn)) {
                                    ((fn) drawable).g(tt0Var.L);
                                }
                                if (tt0Var.M) {
                                    Drawable drawable4 = tt0Var.d;
                                    if (drawable4 instanceof ra0) {
                                        ((ra0) drawable4).l();
                                    }
                                }
                                tt0Var.d = null;
                                tt0Var.e = false;
                                tt0Var.G();
                                tt0Var.L.invalidate();
                            }
                        }
                        i10++;
                        f16 = f13;
                        f15 = 0.0f;
                    }
                    if (tt0Var.T != f16) {
                        tt0Var.L.invalidate();
                        break;
                    }
                }
                break;
            case 28:
                super.onDraw(canvas);
                int x02 = org.telegram.ui.ActionBar.l6.x0(null, org.telegram.ui.ActionBar.l6.Jj, false);
                iw0 iw0Var = (iw0) this.b;
                org.telegram.ui.Components.voip.n nVar = iw0Var.L;
                Paint paint2 = iw0Var.a;
                paint2.setColor(x02);
                Paint paint3 = iw0Var.b;
                paint3.setColor(x02);
                Paint paint4 = iw0Var.c;
                paint4.setColor(x02);
                paint3.setAlpha(qs.e4);
                paint4.setAlpha(82);
                paint2.setAlpha(46);
                Paint paint5 = iw0Var.d;
                paint5.setColor(org.telegram.ui.ActionBar.l6.x0(null, org.telegram.ui.ActionBar.l6.d6, false));
                canvas.drawLine(org.telegram.messenger.g0.L(24.0f), org.telegram.messenger.g0.L(20.0f), getMeasuredWidth() - org.telegram.messenger.g0.L(24.0f), org.telegram.messenger.g0.L(20.0f), paint2);
                boolean z9 = iw0Var.e;
                if (z9 || iw0Var.J != 0.0f) {
                    if (!z9) {
                        float f21 = iw0Var.J - 0.10666667f;
                        iw0Var.J = f21;
                        if (f21 < 0.0f) {
                            iw0Var.J = 0.0f;
                        }
                    } else if (iw0Var.K) {
                        float f22 = iw0Var.J + 0.024615385f;
                        iw0Var.J = f22;
                        if (f22 > 1.0f) {
                            iw0Var.J = 1.0f;
                            iw0Var.K = false;
                        }
                    } else {
                        float f23 = iw0Var.J - 0.024615385f;
                        iw0Var.J = f23;
                        if (f23 < 0.0f) {
                            iw0Var.J = 0.0f;
                            iw0Var.K = true;
                        }
                    }
                    invalidate();
                    RectF rectF = org.telegram.messenger.g0.P;
                    rectF.set(org.telegram.messenger.g0.L(24.0f), org.telegram.messenger.g0.L(17.0f), getMeasuredWidth() - org.telegram.messenger.g0.L(24.0f), org.telegram.messenger.g0.L(23.0f));
                    nVar.f = getMeasuredWidth();
                    nVar.a(org.telegram.messenger.g0.L(3.0f), canvas, rectF, null);
                }
                int L2 = org.telegram.messenger.g0.L(24.0f);
                if (iw0Var.e) {
                    f14 = 1.0f;
                    paint = paint5;
                } else {
                    int L3 = org.telegram.messenger.g0.L(24.0f) + ((int) (org.telegram.messenger.camera.q.A(24.0f, 2, getMeasuredWidth()) * iw0Var.F));
                    f14 = 1.0f;
                    canvas.drawLine(L2, org.telegram.messenger.g0.L(20.0f), org.telegram.messenger.g0.L(24.0f) + r2, org.telegram.messenger.g0.L(20.0f), paint4);
                    canvas.drawRect(L3, org.telegram.messenger.g0.L(20.0f) - org.telegram.messenger.g0.L(3.0f), org.telegram.messenger.g0.L(3.0f) + L3, org.telegram.messenger.g0.L(3.0f) + org.telegram.messenger.g0.L(20.0f), paint5);
                    paint = paint5;
                }
                if (!iw0Var.e) {
                    int A = (int) (org.telegram.messenger.camera.q.A(24.0f, 2, getMeasuredWidth()) * iw0Var.E);
                    if (A < org.telegram.messenger.g0.L(f14)) {
                        A = org.telegram.messenger.g0.L(f14);
                    }
                    int L4 = org.telegram.messenger.g0.L(24.0f) + A;
                    canvas.drawLine(L2, org.telegram.messenger.g0.L(20.0f), org.telegram.messenger.g0.L(24.0f) + A, org.telegram.messenger.g0.L(20.0f), paint3);
                    canvas.drawRect(L4, org.telegram.messenger.g0.L(20.0f) - org.telegram.messenger.g0.L(3.0f), org.telegram.messenger.g0.L(3.0f) + L4, org.telegram.messenger.g0.L(3.0f) + org.telegram.messenger.g0.L(20.0f), paint);
                    break;
                }
                break;
            default:
                super.onDraw(canvas);
                break;
        }
    }

    @Override // android.view.View
    public void onMeasure(int i7, int i10) {
        int i11;
        int i12;
        int i13;
        org.telegram.ui.ActionBar.k kVar;
        int i14;
        switch (this.a) {
            case 0:
                dd ddVar = (dd) this.b;
                if (ddVar.H) {
                    i11 = (ddVar.p0().getMeasuredHeight() + ddVar.I) - org.telegram.messenger.g0.L(16.0f);
                } else {
                    int L = org.telegram.messenger.g0.L(140.0f) + ddVar.I;
                    if (org.telegram.messenger.g0.L(24.0f) + ddVar.D.getMeasuredHeight() > L) {
                        L = org.telegram.messenger.g0.L(24.0f) + ddVar.D.getMeasuredHeight();
                    }
                    i11 = L;
                }
                super.onMeasure(i7, View.MeasureSpec.makeMeasureSpec((int) (i11 - (0 * 2.5f)), TLObject.FLAG_30));
                break;
            case 1:
            case 2:
            case 5:
            case 7:
            case 8:
            case 11:
            case 12:
            case 17:
            case 21:
            case 22:
            case 24:
            case 26:
            default:
                super.onMeasure(i7, i10);
                break;
            case 3:
                gi.f fVar = (gi.f) this.b;
                if (fVar.H) {
                    i12 = (fVar.p0().getMeasuredHeight() + fVar.I) - org.telegram.messenger.g0.L(16.0f);
                } else {
                    int L2 = org.telegram.messenger.g0.L(140.0f) + fVar.I;
                    if (org.telegram.messenger.g0.L(24.0f) + fVar.D.getMeasuredHeight() > L2) {
                        L2 = org.telegram.messenger.g0.L(24.0f) + fVar.D.getMeasuredHeight();
                    }
                    i12 = L2;
                }
                super.onMeasure(i7, View.MeasureSpec.makeMeasureSpec((int) (i12 - (0 * 2.5f)), TLObject.FLAG_30));
                break;
            case 4:
                hi.j jVar = (hi.j) this.b;
                if (jVar.H) {
                    int i15 = jVar.I;
                    kVar = ((org.telegram.ui.ActionBar.f2) jVar).actionBar;
                    i13 = (kVar.getMeasuredHeight() + i15) - org.telegram.messenger.g0.L(16.0f);
                } else {
                    int L3 = org.telegram.messenger.g0.L(140.0f) + jVar.I;
                    if (org.telegram.messenger.g0.L(24.0f) + jVar.D.getMeasuredHeight() > L3) {
                        L3 = org.telegram.messenger.g0.L(24.0f) + jVar.D.getMeasuredHeight();
                    }
                    i13 = L3;
                }
                super.onMeasure(i7, View.MeasureSpec.makeMeasureSpec((int) (i13 - (0 * 2.5f)), TLObject.FLAG_30));
                break;
            case 6:
                ((View) getParent()).getMeasuredHeight();
                jg.o1 o1Var = (jg.o1) this.b;
                Integer num = o1Var.d;
                if (num != null) {
                    i14 = num.intValue();
                    o1Var.h = i14;
                } else {
                    i14 = 0;
                    o1Var.h = 0;
                }
                super.onMeasure(i7, View.MeasureSpec.makeMeasureSpec(i14, TLObject.FLAG_30));
                break;
            case 9:
                setMeasuredDimension(View.MeasureSpec.getSize(i7), org.telegram.messenger.g0.L(24.0f));
                break;
            case 10:
                v4.b0 b0Var = ((org.telegram.ui.n5) this.b).d.F;
                super.onMeasure(i7, View.MeasureSpec.makeMeasureSpec(Math.max(0, b0Var instanceof my ? ((my) b0Var).J : 0), TLObject.FLAG_30));
                break;
            case 13:
                org.telegram.ui.Components.na naVar = (org.telegram.ui.Components.na) this.b;
                int i16 = naVar.n1;
                int L4 = (i16 == 0 ? org.telegram.messenger.g0.L(300.0f) : (int) (i16 * naVar.r1)) - (((naVar.x1 - naVar.y1) - naVar.z1) - naVar.A1);
                if (L4 < 1) {
                    L4 = 1;
                }
                super.onMeasure(i7, View.MeasureSpec.makeMeasureSpec(L4, TLObject.FLAG_30));
                break;
            case 14:
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i7), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(((tl) this.b).w.J, TLObject.FLAG_30));
                break;
            case 15:
                setMeasuredDimension(View.MeasureSpec.getSize(i7), ((bn) ((org.telegram.ui.l4) this.b).e).R0);
                break;
            case 16:
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i7), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(((cn) ((org.telegram.ui.x7) this.b).d).x, TLObject.FLAG_30));
                break;
            case 18:
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(getPaddingRight() + getPaddingLeft() + Math.round(((ny0) this.b).k()), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(Math.max(getPaddingBottom() + getPaddingTop() + Math.round(((ny0) this.b).i()), org.telegram.messenger.g0.L(26.0f)), TLObject.FLAG_30));
                break;
            case 19:
                super.onMeasure(i7, View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(48.0f) + ((r50) this.b).c.f2, TLObject.FLAG_30));
                break;
            case 20:
                int L5 = org.telegram.messenger.g0.L(48.0f);
                y50 y50Var = ((t50) this.b).n;
                super.onMeasure(i7, View.MeasureSpec.makeMeasureSpec(L5 + y50Var.f2 + y50Var.l2, TLObject.FLAG_30));
                break;
            case 23:
                super.onMeasure(i7, View.MeasureSpec.makeMeasureSpec(((ko0) this.b).K.B1.R, TLObject.FLAG_30));
                break;
            case 25:
                setMeasuredDimension(View.MeasureSpec.getSize(i7), ((jt0) this.b).getMeasuredHeight());
                break;
            case 27:
                ru0 ru0Var = (ru0) this.b;
                int size = View.MeasureSpec.getSize(i7);
                if (size <= 0) {
                    size = ((View) getParent()).getMeasuredWidth();
                }
                int size2 = View.MeasureSpec.getSize(i10) - org.telegram.messenger.g0.L(4.0f);
                av0 av0Var = ru0Var.d;
                int i17 = av0Var.n3;
                int max = Math.max(i17 > 0 ? org.telegram.messenger.g0.L(4.0f) + i17 : 0, (int) (size - Math.min(org.telegram.messenger.g0.L(4.0f) + ((ru0Var.b() - 1) * size2), ru0Var.d.e3 * size2)));
                av0Var.m3 = max;
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(max, TLObject.FLAG_30), i10);
                break;
            case 28:
                super.onMeasure(i7, View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(40.0f), TLObject.FLAG_30));
                break;
        }
    }

    @Override // android.view.View
    public void setAlpha(float f10) {
        switch (this.a) {
            case 11:
                super.setAlpha(f10);
                View view = ((org.telegram.ui.c8) this.b).b.y.fragmentView;
                if (view != null) {
                    view.invalidate();
                    break;
                }
                break;
            case 29:
                super.setAlpha(f10);
                View view2 = ((yw) this.b).fragmentView;
                if (view2 != null) {
                    view2.invalidate();
                    break;
                }
                break;
            default:
                super.setAlpha(f10);
                break;
        }
    }

    @Override // android.view.View
    public void setTranslationX(float f10) {
        switch (this.a) {
            case 24:
                super.setTranslationX(f10);
                invalidate();
                break;
            default:
                super.setTranslationX(f10);
                break;
        }
    }

    @Override // android.view.View
    public void setTranslationY(float f10) {
        switch (this.a) {
            case 13:
                super.setTranslationY(f10);
                org.telegram.ui.Components.na naVar = (org.telegram.ui.Components.na) this.b;
                int i7 = org.telegram.ui.Components.na.O1;
                naVar.b.invalidate();
                break;
            default:
                super.setTranslationY(f10);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ec(Context context) {
        super(context);
        this.a = 18;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ec(org.telegram.ui.Components.na naVar, Context context) {
        super(context);
        this.a = 13;
        this.b = naVar;
        setTag(-33024);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ec(Context context, org.telegram.ui.ActionBar.g6 g6Var) {
        super(context);
        this.a = 9;
        CheckBoxBase checkBoxBase = new CheckBoxBase(20, this, g6Var);
        this.b = checkBoxBase;
        checkBoxBase.h(org.telegram.ui.ActionBar.l6.Vl, org.telegram.ui.ActionBar.l6.z5, org.telegram.ui.ActionBar.l6.k7);
        checkBoxBase.d(10);
        checkBoxBase.k(true);
        checkBoxBase.i(org.telegram.messenger.g0.L(5.0f));
    }
}
