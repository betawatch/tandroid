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
import di.mb;
import hi.ia;
import hi.sa;
import hi.u9;
import java.util.HashSet;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.i20;
import org.telegram.messenger.ns;
import org.telegram.messenger.qc;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.Components.CheckBoxBase;
import org.telegram.ui.Components.a60;
import org.telegram.ui.Components.am;
import org.telegram.ui.Components.av0;
import org.telegram.ui.Components.do0;
import org.telegram.ui.Components.it0;
import org.telegram.ui.Components.ja;
import org.telegram.ui.Components.jn;
import org.telegram.ui.Components.kn;
import org.telegram.ui.Components.kw0;
import org.telegram.ui.Components.mo0;
import org.telegram.ui.Components.oy0;
import org.telegram.ui.Components.po0;
import org.telegram.ui.Components.qy;
import org.telegram.ui.Components.ra0;
import org.telegram.ui.Components.ru0;
import org.telegram.ui.Components.st0;
import org.telegram.ui.Components.t50;
import org.telegram.ui.Components.v50;
import org.telegram.ui.Components.vq;
import org.telegram.ui.bq0;
import org.telegram.ui.d8;
import org.telegram.ui.dn;
import org.telegram.ui.y7;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final class o2 extends View {
    public final /* synthetic */ int a;
    public Object b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ o2(int i7, Context context, Object obj) {
        super(context);
        this.a = i7;
        this.b = obj;
    }

    @Override // android.view.View
    public void dispatchDraw(Canvas canvas) {
        switch (this.a) {
            case 2:
                super.dispatchDraw(canvas);
                hi.g5 g5Var = ((u9) this.b).y0;
                if (g5Var != null) {
                    g5Var.d(canvas);
                    break;
                }
                break;
            case 3:
                canvas.save();
                sa saVar = (sa) this.b;
                canvas.translate(saVar.d1.getX() + saVar.m0.getX(), saVar.d1.getY() + saVar.m0.getY());
                ia iaVar = saVar.d1;
                iaVar.k(canvas, iaVar.getBounds(), saVar.d1.getOver2Alpha());
                canvas.restore();
                break;
            case 4:
            case 5:
            default:
                super.dispatchDraw(canvas);
                break;
            case 6:
                dh.d dVar = ((jh.f) this.b).K;
                if (dVar != null) {
                    dVar.draw(canvas);
                }
                super.dispatchDraw(canvas);
                break;
        }
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        switch (this.a) {
            case 19:
                super.draw(canvas);
                ((oy0) this.b).e(canvas, (getMeasuredWidth() - ((oy0) this.b).k()) / 2.0f, getMeasuredHeight() / 2.0f);
                break;
            case 23:
                super.draw(canvas);
                po0 po0Var = (po0) this.b;
                po0Var.R2.setBounds(0, (getMeasuredHeight() - po0Var.C2.d) - org.telegram.messenger.g0.L(72.0f), getMeasuredWidth(), getMeasuredHeight());
                po0Var.R2.draw(canvas);
                break;
            default:
                super.draw(canvas);
                break;
        }
    }

    @Override // android.view.View
    public void invalidate() {
        switch (this.a) {
            case 27:
                super.invalidate();
                ((st0) this.b).S();
                break;
            default:
                super.invalidate();
                break;
        }
    }

    @Override // android.view.View
    public void onAttachedToWindow() {
        switch (this.a) {
            case 0:
                super.onAttachedToWindow();
                n2 n2Var = (n2) this.b;
                if (n2Var != null && !n2Var.i) {
                    n2Var.i = true;
                    n2Var.a();
                    ai.f0 f0Var = new ai.f0(n2Var, 1);
                    n2Var.h = f0Var;
                    qc.a(f0Var);
                    break;
                }
                break;
            case 5:
                super.onAttachedToWindow();
                ((jg.n1) this.b).f = true;
                break;
            case 10:
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
            case 0:
                super.onDetachedFromWindow();
                n2 n2Var = (n2) this.b;
                if (n2Var != null && n2Var.i) {
                    n2Var.i = false;
                    n2Var.a();
                    ai.f0 f0Var = n2Var.h;
                    HashSet hashSet = qc.n;
                    if (hashSet != null) {
                        hashSet.remove(f0Var);
                        break;
                    }
                }
                break;
            case 5:
                super.onDetachedFromWindow();
                ((jg.n1) this.b).f = false;
                break;
            case 10:
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
            case 8:
                super.onDraw(canvas);
                li.d0 d0Var = (li.d0) this.b;
                bg.c0 c0Var = d0Var.F1;
                float max = Math.max(d0Var.m1.e, d0Var.n1.e);
                bg.c0 c0Var2 = d0Var.E1;
                c0Var2.c(org.telegram.messenger.g0.L(42.0f) + d0Var.P1.b, 0);
                c0Var2.setBounds(0, 0, getWidth(), org.telegram.messenger.g0.L(56.0f) + d0Var.P1.b);
                int i7 = org.telegram.ui.ActionBar.j6.a7;
                c0Var2.b(org.telegram.ui.ActionBar.j6.r1(org.telegram.messenger.g0.T1(1.0f, 0.8f, max), org.telegram.ui.ActionBar.j6.w0(i7, d0Var.J0)));
                c0Var2.draw(canvas);
                if (d0Var.I1) {
                    max = 1.0f;
                }
                int W1 = org.telegram.messenger.g0.W1(max, org.telegram.messenger.g0.L(48.0f) + d0Var.P1.d, 0);
                int W12 = org.telegram.messenger.g0.W1(max, org.telegram.messenger.g0.L(72.0f), 0) + d0Var.P1.d;
                float T1 = org.telegram.messenger.g0.T1(0.8f, org.telegram.messenger.g0.R0(d0Var.P1.d), max);
                c0Var.c(0, W1);
                c0Var.setBounds(0, getHeight() - W12, getWidth(), getHeight());
                c0Var.b(org.telegram.ui.ActionBar.j6.r1(T1, org.telegram.ui.ActionBar.j6.w0(i7, d0Var.J0)));
                c0Var.draw(canvas);
                break;
            case 9:
                canvas.save();
                canvas.translate(org.telegram.messenger.g0.N(22.6f), org.telegram.messenger.g0.N(21.66f));
                ((oi.p0) this.b).c.draw(canvas);
                canvas.restore();
                break;
            case 10:
                int L = org.telegram.messenger.g0.L(20.0f);
                int width = (getWidth() - L) / 2;
                int height = (getHeight() - L) / 2;
                CheckBoxBase checkBoxBase = (CheckBoxBase) this.b;
                checkBoxBase.e(width, height, L, L);
                checkBoxBase.a(canvas);
                break;
            case 13:
                org.telegram.ui.Cells.t2 t2Var = (org.telegram.ui.Cells.t2) this.b;
                t2Var.o4.setBounds(0, 0, getWidth(), getHeight());
                t2Var.o4.draw(canvas);
                break;
            case 18:
                if (((vq) this.b).V1) {
                    canvas.drawRect(r2.u0, 0.0f, getMeasuredWidth() - r2.u0, 1.0f, org.telegram.ui.ActionBar.j6.k0);
                    break;
                }
                break;
            case 22:
                super.onDraw(canvas);
                ((bq0) this.b).j(canvas, getMeasuredWidth(), getMeasuredHeight());
                break;
            case 25:
                super.onDraw(canvas);
                int S0 = org.telegram.messenger.g0.S0(getTranslationX() / getMeasuredWidth(), 1.0f, -9057429, -10513163);
                int S02 = org.telegram.messenger.g0.S0(getTranslationX() / getMeasuredWidth(), 1.0f, -11554882, -4629871);
                do0 do0Var = (do0) this.b;
                do0Var.getClass();
                if (S0 != 0) {
                    do0Var.h = new LinearGradient(0.0f, 0.0f, getMeasuredWidth(), 0.0f, new int[]{S0, S02}, (float[]) null, Shader.TileMode.CLAMP);
                    do0Var.n.setShader(do0Var.h);
                }
                do0Var.r.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                canvas.drawRoundRect(do0Var.r, org.telegram.messenger.g0.L(18.0f), org.telegram.messenger.g0.L(18.0f), do0Var.n);
                break;
            case 27:
                st0 st0Var = (st0) this.b;
                if (st0Var.b != null && !st0Var.K) {
                    Drawable newDrawable = st0Var.getNewDrawable();
                    boolean newDrawableMotion = st0Var.getNewDrawableMotion();
                    float f15 = 0.0f;
                    if (newDrawable != st0Var.b && newDrawable != null) {
                        if (org.telegram.ui.ActionBar.j6.h1()) {
                            st0Var.d = st0Var.b;
                            st0Var.e = st0Var.c;
                        }
                        if (newDrawable instanceof ra0) {
                            ((ra0) newDrawable).q(st0Var.M);
                        }
                        st0Var.b = newDrawable;
                        if (st0Var.N && (newDrawable instanceof dn)) {
                            ((dn) newDrawable).f(this);
                        }
                        if (st0Var.N) {
                            Drawable drawable2 = st0Var.b;
                            if (drawable2 instanceof ra0) {
                                ((ra0) drawable2).k();
                            }
                        }
                        st0Var.c = newDrawableMotion;
                        st0Var.U = 0.0f;
                        st0Var.T(st0Var.b);
                        st0Var.G();
                    } else if (st0Var.c != newDrawableMotion) {
                        st0Var.c = newDrawableMotion;
                        st0Var.G();
                    }
                    float f16 = 1.0f;
                    st0Var.U = Utilities.i((org.telegram.messenger.g0.t / 200.0f) + st0Var.U, 1.0f, 0.0f);
                    int i10 = 0;
                    while (i10 < 2) {
                        Drawable drawable3 = i10 == 0 ? st0Var.d : st0Var.b;
                        if (drawable3 == null) {
                            f13 = f16;
                        } else {
                            if (i10 != 1 || st0Var.d == null || st0Var.H == null) {
                                drawable3.setAlpha(ns.e4);
                            } else {
                                drawable3.setAlpha((int) (st0Var.U * 255.0f));
                            }
                            if (i10 == 0 ? st0Var.e : st0Var.c) {
                                f10 = st0Var.E;
                                f11 = st0Var.x;
                                f12 = st0Var.y;
                            } else {
                                f10 = f16;
                                f11 = f15;
                                f12 = f11;
                            }
                            if (drawable3 instanceof ra0) {
                                ra0 ra0Var = (ra0) drawable3;
                                if (ra0Var.u != null) {
                                    int currentActionBarHeight = (st0Var.O() ? org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() : 0) + ((st0Var.P() && st0Var.s) ? org.telegram.messenger.g0.m : 0);
                                    int measuredHeight = st0Var.W() ? getRootView().getMeasuredHeight() - currentActionBarHeight : getHeight();
                                    f13 = f16;
                                    float max2 = Math.max(getMeasuredWidth() / drawable3.getIntrinsicWidth(), measuredHeight / drawable3.getIntrinsicHeight());
                                    int ceil = (int) Math.ceil(drawable3.getIntrinsicWidth() * max2 * f10);
                                    int ceil2 = (int) Math.ceil(drawable3.getIntrinsicHeight() * max2 * f10);
                                    int measuredWidth = ((getMeasuredWidth() - ceil) / 2) + ((int) f11);
                                    int i11 = ((measuredHeight - ceil2) / 2) + st0Var.F + currentActionBarHeight + ((int) f12);
                                    canvas.save();
                                    canvas.clipRect(0, currentActionBarHeight, ceil, getMeasuredHeight() - st0Var.h);
                                    drawable3.setBounds(measuredWidth, i11, ceil + measuredWidth, ceil2 + i11);
                                    drawable3.draw(canvas);
                                    st0.F(st0Var, canvas);
                                    canvas.restore();
                                } else {
                                    f13 = f16;
                                    if (st0Var.h != 0) {
                                        canvas.save();
                                        canvas.clipRect(0, 0, getMeasuredWidth(), getRootView().getMeasuredHeight() - st0Var.h);
                                    }
                                    ra0Var.f = st0Var.F;
                                    drawable3.setBounds(0, 0, getMeasuredWidth(), (int) ((getRootView().getMeasuredHeight() - st0Var.F) + f12));
                                    drawable3.draw(canvas);
                                    if (st0Var.h != 0) {
                                        canvas.restore();
                                    }
                                }
                            } else {
                                f13 = f16;
                                if (drawable3 instanceof ColorDrawable) {
                                    if (st0Var.h != 0) {
                                        canvas.save();
                                        canvas.clipRect(0, 0, getMeasuredWidth(), getMeasuredHeight() - st0Var.h);
                                    }
                                    drawable3.setBounds(0, 0, getMeasuredWidth(), getRootView().getMeasuredHeight());
                                    drawable3.draw(canvas);
                                    st0.F(st0Var, canvas);
                                    if (st0Var.h != 0) {
                                        canvas.restore();
                                    }
                                } else if (drawable3 instanceof GradientDrawable) {
                                    if (st0Var.h != 0) {
                                        canvas.save();
                                        canvas.clipRect(0, 0, getMeasuredWidth(), getRootView().getMeasuredHeight() - st0Var.h);
                                    }
                                    drawable3.setBounds(0, st0Var.F, getMeasuredWidth(), getRootView().getMeasuredHeight() + st0Var.F);
                                    drawable3.draw(canvas);
                                    st0.F(st0Var, canvas);
                                    if (st0Var.h != 0) {
                                        canvas.restore();
                                    }
                                } else if (!(drawable3 instanceof BitmapDrawable)) {
                                    if (st0Var.h != 0) {
                                        canvas.save();
                                        canvas.clipRect(0, 0, getMeasuredWidth(), getRootView().getMeasuredHeight() - st0Var.h);
                                    }
                                    if (drawable3 instanceof dn) {
                                        dn dnVar = (dn) drawable3;
                                        dnVar.b = this;
                                        ra0 ra0Var2 = dnVar.f;
                                        if (ra0Var2 != null) {
                                            ra0Var2.q(this);
                                        }
                                    }
                                    float f17 = f10 - f13;
                                    float f18 = a8.p0.f(-getMeasuredWidth(), f17, 2.0f, f11);
                                    float f19 = a8.p0.f(-getRootView().getMeasuredHeight(), f17, 2.0f, f12);
                                    drawable3.setBounds((int) f18, (int) (st0Var.F + f19), (int) ((getMeasuredWidth() * f10) + f18), (int) r.b.e(getRootView().getMeasuredHeight(), f10, st0Var.F, f19));
                                    drawable3.draw(canvas);
                                    st0.F(st0Var, canvas);
                                    if (st0Var.h != 0) {
                                        canvas.restore();
                                    }
                                } else if (((BitmapDrawable) drawable3).getTileModeX() == Shader.TileMode.REPEAT) {
                                    canvas.save();
                                    float f20 = 2.0f / org.telegram.messenger.g0.p;
                                    canvas.scale(f20, f20);
                                    drawable3.setBounds(0, 0, (int) Math.ceil(getMeasuredWidth() / f20), (int) Math.ceil(getRootView().getMeasuredHeight() / f20));
                                    drawable3.draw(canvas);
                                    st0.F(st0Var, canvas);
                                    canvas.restore();
                                } else {
                                    int currentActionBarHeight2 = (st0Var.O() ? org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() : 0) + ((st0Var.P() && st0Var.s) ? org.telegram.messenger.g0.m : 0);
                                    int measuredHeight2 = st0Var.W() ? getRootView().getMeasuredHeight() - currentActionBarHeight2 : getHeight();
                                    float max3 = Math.max(getMeasuredWidth() / drawable3.getIntrinsicWidth(), measuredHeight2 / drawable3.getIntrinsicHeight());
                                    int ceil3 = (int) Math.ceil(drawable3.getIntrinsicWidth() * max3 * f10);
                                    int ceil4 = (int) Math.ceil(drawable3.getIntrinsicHeight() * max3 * f10);
                                    int measuredWidth2 = ((getMeasuredWidth() - ceil3) / 2) + ((int) f11);
                                    int i12 = ((measuredHeight2 - ceil4) / 2) + st0Var.F + currentActionBarHeight2 + ((int) f12);
                                    canvas.save();
                                    canvas.clipRect(0, currentActionBarHeight2, ceil3, getMeasuredHeight() - st0Var.h);
                                    drawable3.setBounds(measuredWidth2, i12, ceil3 + measuredWidth2, ceil4 + i12);
                                    drawable3.draw(canvas);
                                    st0.F(st0Var, canvas);
                                    canvas.restore();
                                }
                            }
                            if (i10 == 0 && (drawable = st0Var.d) != null && st0Var.U >= f13) {
                                if (st0Var.N && (drawable instanceof dn)) {
                                    ((dn) drawable).g(st0Var.M);
                                }
                                if (st0Var.N) {
                                    Drawable drawable4 = st0Var.d;
                                    if (drawable4 instanceof ra0) {
                                        ((ra0) drawable4).l();
                                    }
                                }
                                st0Var.d = null;
                                st0Var.e = false;
                                st0Var.G();
                                st0Var.M.invalidate();
                            }
                        }
                        i10++;
                        f16 = f13;
                        f15 = 0.0f;
                    }
                    if (st0Var.U != f16) {
                        st0Var.M.invalidate();
                        break;
                    }
                }
                break;
            case 29:
                super.onDraw(canvas);
                int x02 = org.telegram.ui.ActionBar.j6.x0(null, org.telegram.ui.ActionBar.j6.Mj, false);
                kw0 kw0Var = (kw0) this.b;
                org.telegram.ui.Components.voip.n nVar = kw0Var.M;
                Paint paint2 = kw0Var.a;
                paint2.setColor(x02);
                Paint paint3 = kw0Var.b;
                paint3.setColor(x02);
                Paint paint4 = kw0Var.c;
                paint4.setColor(x02);
                paint3.setAlpha(ns.e4);
                paint4.setAlpha(82);
                paint2.setAlpha(46);
                Paint paint5 = kw0Var.d;
                paint5.setColor(org.telegram.ui.ActionBar.j6.x0(null, org.telegram.ui.ActionBar.j6.d6, false));
                canvas.drawLine(org.telegram.messenger.g0.L(24.0f), org.telegram.messenger.g0.L(20.0f), getMeasuredWidth() - org.telegram.messenger.g0.L(24.0f), org.telegram.messenger.g0.L(20.0f), paint2);
                boolean z10 = kw0Var.e;
                if (z10 || kw0Var.K != 0.0f) {
                    if (!z10) {
                        float f21 = kw0Var.K - 0.10666667f;
                        kw0Var.K = f21;
                        if (f21 < 0.0f) {
                            kw0Var.K = 0.0f;
                        }
                    } else if (kw0Var.L) {
                        float f22 = kw0Var.K + 0.024615385f;
                        kw0Var.K = f22;
                        if (f22 > 1.0f) {
                            kw0Var.K = 1.0f;
                            kw0Var.L = false;
                        }
                    } else {
                        float f23 = kw0Var.K - 0.024615385f;
                        kw0Var.K = f23;
                        if (f23 < 0.0f) {
                            kw0Var.K = 0.0f;
                            kw0Var.L = true;
                        }
                    }
                    invalidate();
                    RectF rectF = org.telegram.messenger.g0.P;
                    rectF.set(org.telegram.messenger.g0.L(24.0f), org.telegram.messenger.g0.L(17.0f), getMeasuredWidth() - org.telegram.messenger.g0.L(24.0f), org.telegram.messenger.g0.L(23.0f));
                    nVar.f = getMeasuredWidth();
                    nVar.a(org.telegram.messenger.g0.L(3.0f), canvas, rectF, null);
                }
                int L2 = org.telegram.messenger.g0.L(24.0f);
                if (kw0Var.e) {
                    f14 = 1.0f;
                    paint = paint5;
                } else {
                    int L3 = org.telegram.messenger.g0.L(24.0f) + ((int) (i20.A(24.0f, 2, getMeasuredWidth()) * kw0Var.G));
                    f14 = 1.0f;
                    canvas.drawLine(L2, org.telegram.messenger.g0.L(20.0f), org.telegram.messenger.g0.L(24.0f) + r2, org.telegram.messenger.g0.L(20.0f), paint4);
                    canvas.drawRect(L3, org.telegram.messenger.g0.L(20.0f) - org.telegram.messenger.g0.L(3.0f), org.telegram.messenger.g0.L(3.0f) + L3, org.telegram.messenger.g0.L(3.0f) + org.telegram.messenger.g0.L(20.0f), paint5);
                    paint = paint5;
                }
                if (!kw0Var.e) {
                    int A = (int) (i20.A(24.0f, 2, getMeasuredWidth()) * kw0Var.F);
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
        int i14;
        org.telegram.ui.ActionBar.k kVar;
        switch (this.a) {
            case 1:
                mb mbVar = (mb) this.b;
                if (mbVar.I) {
                    i11 = (mbVar.p0().getMeasuredHeight() + mbVar.J) - org.telegram.messenger.g0.L(16.0f);
                } else {
                    int L = org.telegram.messenger.g0.L(140.0f) + mbVar.J;
                    if (org.telegram.messenger.g0.L(24.0f) + mbVar.E.getMeasuredHeight() > L) {
                        L = org.telegram.messenger.g0.L(24.0f) + mbVar.E.getMeasuredHeight();
                    }
                    i11 = L;
                }
                super.onMeasure(i7, View.MeasureSpec.makeMeasureSpec((int) (i11 - (0 * 2.5f)), TLObject.FLAG_30));
                break;
            case 2:
            case 3:
            case 6:
            case 8:
            case 9:
            case 12:
            case 13:
            case 18:
            case 22:
            case 23:
            case 25:
            case 27:
            default:
                super.onMeasure(i7, i10);
                break;
            case 4:
                ii.f fVar = (ii.f) this.b;
                if (fVar.I) {
                    i12 = (fVar.p0().getMeasuredHeight() + fVar.J) - org.telegram.messenger.g0.L(16.0f);
                } else {
                    int L2 = org.telegram.messenger.g0.L(140.0f) + fVar.J;
                    if (org.telegram.messenger.g0.L(24.0f) + fVar.E.getMeasuredHeight() > L2) {
                        L2 = org.telegram.messenger.g0.L(24.0f) + fVar.E.getMeasuredHeight();
                    }
                    i12 = L2;
                }
                super.onMeasure(i7, View.MeasureSpec.makeMeasureSpec((int) (i12 - (0 * 2.5f)), TLObject.FLAG_30));
                break;
            case 5:
                ((View) getParent()).getMeasuredHeight();
                jg.n1 n1Var = (jg.n1) this.b;
                Integer num = n1Var.d;
                if (num != null) {
                    i13 = num.intValue();
                    n1Var.h = i13;
                } else {
                    i13 = 0;
                    n1Var.h = 0;
                }
                super.onMeasure(i7, View.MeasureSpec.makeMeasureSpec(i13, TLObject.FLAG_30));
                break;
            case 7:
                ki.k kVar2 = (ki.k) this.b;
                if (kVar2.I) {
                    int i15 = kVar2.J;
                    kVar = ((org.telegram.ui.ActionBar.e2) kVar2).actionBar;
                    i14 = (kVar.getMeasuredHeight() + i15) - org.telegram.messenger.g0.L(16.0f);
                } else {
                    int L3 = org.telegram.messenger.g0.L(140.0f) + kVar2.J;
                    if (org.telegram.messenger.g0.L(24.0f) + kVar2.E.getMeasuredHeight() > L3) {
                        L3 = org.telegram.messenger.g0.L(24.0f) + kVar2.E.getMeasuredHeight();
                    }
                    i14 = L3;
                }
                super.onMeasure(i7, View.MeasureSpec.makeMeasureSpec((int) (i14 - (0 * 2.5f)), TLObject.FLAG_30));
                break;
            case 10:
                setMeasuredDimension(View.MeasureSpec.getSize(i7), org.telegram.messenger.g0.L(24.0f));
                break;
            case 11:
                v4.b0 b0Var = ((org.telegram.ui.n5) this.b).d.G;
                super.onMeasure(i7, View.MeasureSpec.makeMeasureSpec(Math.max(0, b0Var instanceof qy ? ((qy) b0Var).J : 0), TLObject.FLAG_30));
                break;
            case 14:
                ja jaVar = (ja) this.b;
                int i16 = jaVar.r1;
                int L4 = (i16 == 0 ? org.telegram.messenger.g0.L(300.0f) : (int) (i16 * jaVar.v1)) - (((jaVar.B1 - jaVar.C1) - jaVar.D1) - jaVar.E1);
                if (L4 < 1) {
                    L4 = 1;
                }
                super.onMeasure(i7, View.MeasureSpec.makeMeasureSpec(L4, TLObject.FLAG_30));
                break;
            case 15:
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i7), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(((am) this.b).w.K, TLObject.FLAG_30));
                break;
            case 16:
                setMeasuredDimension(View.MeasureSpec.getSize(i7), ((jn) ((org.telegram.ui.l4) this.b).e).S0);
                break;
            case 17:
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i7), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(((kn) ((y7) this.b).d).x, TLObject.FLAG_30));
                break;
            case 19:
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(getPaddingRight() + getPaddingLeft() + Math.round(((oy0) this.b).k()), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(Math.max(getPaddingBottom() + getPaddingTop() + Math.round(((oy0) this.b).i()), org.telegram.messenger.g0.L(26.0f)), TLObject.FLAG_30));
                break;
            case 20:
                super.onMeasure(i7, View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(48.0f) + ((t50) this.b).c.j2, TLObject.FLAG_30));
                break;
            case 21:
                int L5 = org.telegram.messenger.g0.L(48.0f);
                a60 a60Var = ((v50) this.b).n;
                super.onMeasure(i7, View.MeasureSpec.makeMeasureSpec(L5 + a60Var.j2 + a60Var.p2, TLObject.FLAG_30));
                break;
            case 24:
                super.onMeasure(i7, View.MeasureSpec.makeMeasureSpec(((mo0) this.b).L.F1.R, TLObject.FLAG_30));
                break;
            case 26:
                setMeasuredDimension(View.MeasureSpec.getSize(i7), ((it0) this.b).getMeasuredHeight());
                break;
            case 28:
                ru0 ru0Var = (ru0) this.b;
                int size = View.MeasureSpec.getSize(i7);
                if (size <= 0) {
                    size = ((View) getParent()).getMeasuredWidth();
                }
                int size2 = View.MeasureSpec.getSize(i10) - org.telegram.messenger.g0.L(4.0f);
                av0 av0Var = ru0Var.d;
                int i17 = av0Var.o3;
                int max = Math.max(i17 > 0 ? org.telegram.messenger.g0.L(4.0f) + i17 : 0, (int) (size - Math.min(org.telegram.messenger.g0.L(4.0f) + ((ru0Var.b() - 1) * size2), ru0Var.d.f3 * size2)));
                av0Var.n3 = max;
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(max, TLObject.FLAG_30), i10);
                break;
            case 29:
                super.onMeasure(i7, View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(40.0f), TLObject.FLAG_30));
                break;
        }
    }

    @Override // android.view.View
    public void setAlpha(float f10) {
        switch (this.a) {
            case 12:
                super.setAlpha(f10);
                View view = ((d8) this.b).b.y.fragmentView;
                if (view != null) {
                    view.invalidate();
                    break;
                }
                break;
            default:
                super.setAlpha(f10);
                break;
        }
    }

    @Override // android.view.View
    public void setBackground(Drawable drawable) {
        switch (this.a) {
            case 0:
                if (((n2) this.b) != null) {
                    if (isAttachedToWindow()) {
                        n2 n2Var = (n2) this.b;
                        if (n2Var.i) {
                            n2Var.i = false;
                            n2Var.a();
                            ai.f0 f0Var = n2Var.h;
                            HashSet hashSet = qc.n;
                            if (hashSet != null) {
                                hashSet.remove(f0Var);
                            }
                        }
                    }
                    this.b = null;
                }
                super.setBackground(drawable);
                if (drawable instanceof n2) {
                    this.b = (n2) drawable;
                    if (isAttachedToWindow()) {
                        n2 n2Var2 = (n2) this.b;
                        if (!n2Var2.i) {
                            n2Var2.i = true;
                            n2Var2.a();
                            ai.f0 f0Var2 = new ai.f0(n2Var2, 1);
                            n2Var2.h = f0Var2;
                            qc.a(f0Var2);
                            break;
                        }
                    }
                }
                break;
            default:
                super.setBackground(drawable);
                break;
        }
    }

    @Override // android.view.View
    public void setTranslationX(float f10) {
        switch (this.a) {
            case 25:
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
            case 14:
                super.setTranslationY(f10);
                ja jaVar = (ja) this.b;
                int i7 = ja.S1;
                jaVar.b.invalidate();
                break;
            default:
                super.setTranslationY(f10);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ o2(Context context, int i7) {
        super(context);
        this.a = i7;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o2(ja jaVar, Context context) {
        super(context);
        this.a = 14;
        this.b = jaVar;
        setTag(-33024);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o2(Context context, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context);
        this.a = 10;
        CheckBoxBase checkBoxBase = new CheckBoxBase(20, this, e6Var);
        this.b = checkBoxBase;
        checkBoxBase.h(org.telegram.ui.ActionBar.j6.Yl, org.telegram.ui.ActionBar.j6.z5, org.telegram.ui.ActionBar.j6.k7);
        checkBoxBase.d(10);
        checkBoxBase.k(true);
        checkBoxBase.i(org.telegram.messenger.g0.L(5.0f));
    }
}
