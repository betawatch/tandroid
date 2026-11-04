package ai;

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
import ci.wb;
import gi.la;
import gi.va;
import gi.x9;
import java.util.HashSet;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.hs;
import org.telegram.messenger.lc;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.Components.CheckBoxBase;
import org.telegram.ui.Components.an;
import org.telegram.ui.Components.bn;
import org.telegram.ui.Components.co0;
import org.telegram.ui.Components.gt0;
import org.telegram.ui.Components.gw0;
import org.telegram.ui.Components.jy;
import org.telegram.ui.Components.la0;
import org.telegram.ui.Components.lo0;
import org.telegram.ui.Components.ly0;
import org.telegram.ui.Components.ma;
import org.telegram.ui.Components.n50;
import org.telegram.ui.Components.oo0;
import org.telegram.ui.Components.oq;
import org.telegram.ui.Components.ou0;
import org.telegram.ui.Components.p50;
import org.telegram.ui.Components.qt0;
import org.telegram.ui.Components.sl;
import org.telegram.ui.Components.t50;
import org.telegram.ui.Components.xu0;
import org.telegram.ui.d8;
import org.telegram.ui.tp0;
import org.telegram.ui.y7;
import org.telegram.ui.zm;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class x2 extends View {
    public final /* synthetic */ int a;
    public Object b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ x2(int i3, Context context, Object obj) {
        super(context);
        this.a = i3;
        this.b = obj;
    }

    @Override // android.view.View
    public void dispatchDraw(Canvas canvas) {
        switch (this.a) {
            case 2:
                super.dispatchDraw(canvas);
                gi.g5 g5Var = ((x9) this.b).y0;
                if (g5Var != null) {
                    g5Var.d(canvas);
                    break;
                }
                break;
            case 3:
                canvas.save();
                va vaVar = (va) this.b;
                canvas.translate(vaVar.d1.getX() + vaVar.m0.getX(), vaVar.d1.getY() + vaVar.m0.getY());
                la laVar = vaVar.d1;
                laVar.k(canvas, laVar.getBounds(), vaVar.d1.getOver2Alpha());
                canvas.restore();
                break;
            case 8:
                eh.d dVar = ((kh.f) this.b).J;
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
            case 19:
                super.draw(canvas);
                ((ly0) this.b).e(canvas, (getMeasuredWidth() - ((ly0) this.b).k()) / 2.0f, getMeasuredHeight() / 2.0f);
                break;
            case 23:
                super.draw(canvas);
                oo0 oo0Var = (oo0) this.b;
                oo0Var.O2.setBounds(0, (getMeasuredHeight() - oo0Var.z2.d) - org.telegram.messenger.g0.L(72.0f), getMeasuredWidth(), getMeasuredHeight());
                oo0Var.O2.draw(canvas);
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
                ((qt0) this.b).S();
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
                w2 w2Var = (w2) this.b;
                if (w2Var != null && !w2Var.i) {
                    w2Var.i = true;
                    w2Var.a();
                    v2 v2Var = new v2(w2Var, 0);
                    w2Var.h = v2Var;
                    lc.a(v2Var);
                    break;
                }
                break;
            case 7:
                super.onAttachedToWindow();
                ((kg.k1) this.b).f = true;
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
                w2 w2Var = (w2) this.b;
                if (w2Var != null && w2Var.i) {
                    w2Var.i = false;
                    w2Var.a();
                    v2 v2Var = w2Var.h;
                    HashSet hashSet = lc.n;
                    if (hashSet != null) {
                        hashSet.remove(v2Var);
                        break;
                    }
                }
                break;
            case 7:
                super.onDetachedFromWindow();
                ((kg.k1) this.b).f = false;
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
            case 6:
                super.onDraw(canvas);
                ji.b0 b0Var = (ji.b0) this.b;
                cg.b0 b0Var2 = b0Var.C1;
                float max = Math.max(b0Var.j1.e, b0Var.k1.e);
                cg.b0 b0Var3 = b0Var.B1;
                b0Var3.c(org.telegram.messenger.g0.L(42.0f) + b0Var.M1.b, 0);
                b0Var3.setBounds(0, 0, getWidth(), org.telegram.messenger.g0.L(56.0f) + b0Var.M1.b);
                int i3 = org.telegram.ui.ActionBar.k6.a7;
                b0Var3.b(org.telegram.ui.ActionBar.k6.r1(org.telegram.messenger.g0.T1(1.0f, 0.8f, max), org.telegram.ui.ActionBar.k6.w0(i3, b0Var.J0)));
                b0Var3.draw(canvas);
                if (b0Var.F1) {
                    max = 1.0f;
                }
                int W1 = org.telegram.messenger.g0.W1(max, org.telegram.messenger.g0.L(48.0f) + b0Var.M1.d, 0);
                int W12 = org.telegram.messenger.g0.W1(max, org.telegram.messenger.g0.L(72.0f), 0) + b0Var.M1.d;
                float T1 = org.telegram.messenger.g0.T1(0.8f, org.telegram.messenger.g0.R0(b0Var.M1.d), max);
                b0Var2.c(0, W1);
                b0Var2.setBounds(0, getHeight() - W12, getWidth(), getHeight());
                b0Var2.b(org.telegram.ui.ActionBar.k6.r1(T1, org.telegram.ui.ActionBar.k6.w0(i3, b0Var.J0)));
                b0Var2.draw(canvas);
                break;
            case 9:
                canvas.save();
                canvas.translate(org.telegram.messenger.g0.N(22.6f), org.telegram.messenger.g0.N(21.66f));
                ((mi.s0) this.b).c.draw(canvas);
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
                if (((oq) this.b).S1) {
                    canvas.drawRect(r2.u0, 0.0f, getMeasuredWidth() - r2.u0, 1.0f, org.telegram.ui.ActionBar.k6.k0);
                    break;
                }
                break;
            case 22:
                super.onDraw(canvas);
                ((tp0) this.b).j(canvas, getMeasuredWidth(), getMeasuredHeight());
                break;
            case 25:
                super.onDraw(canvas);
                int S0 = org.telegram.messenger.g0.S0(getTranslationX() / getMeasuredWidth(), 1.0f, -9057429, -10513163);
                int S02 = org.telegram.messenger.g0.S0(getTranslationX() / getMeasuredWidth(), 1.0f, -11554882, -4629871);
                co0 co0Var = (co0) this.b;
                co0Var.getClass();
                if (S0 != 0) {
                    co0Var.h = new LinearGradient(0.0f, 0.0f, getMeasuredWidth(), 0.0f, new int[]{S0, S02}, (float[]) null, Shader.TileMode.CLAMP);
                    co0Var.n.setShader(co0Var.h);
                }
                co0Var.r.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                canvas.drawRoundRect(co0Var.r, org.telegram.messenger.g0.L(18.0f), org.telegram.messenger.g0.L(18.0f), co0Var.n);
                break;
            case 27:
                qt0 qt0Var = (qt0) this.b;
                if (qt0Var.b != null && !qt0Var.K) {
                    Drawable newDrawable = qt0Var.getNewDrawable();
                    boolean newDrawableMotion = qt0Var.getNewDrawableMotion();
                    float f15 = 0.0f;
                    if (newDrawable != qt0Var.b && newDrawable != null) {
                        if (org.telegram.ui.ActionBar.k6.h1()) {
                            qt0Var.d = qt0Var.b;
                            qt0Var.e = qt0Var.c;
                        }
                        if (newDrawable instanceof la0) {
                            ((la0) newDrawable).q(qt0Var.M);
                        }
                        qt0Var.b = newDrawable;
                        if (qt0Var.N && (newDrawable instanceof zm)) {
                            ((zm) newDrawable).f(this);
                        }
                        if (qt0Var.N) {
                            Drawable drawable2 = qt0Var.b;
                            if (drawable2 instanceof la0) {
                                ((la0) drawable2).k();
                            }
                        }
                        qt0Var.c = newDrawableMotion;
                        qt0Var.U = 0.0f;
                        qt0Var.T(qt0Var.b);
                        qt0Var.G();
                    } else if (qt0Var.c != newDrawableMotion) {
                        qt0Var.c = newDrawableMotion;
                        qt0Var.G();
                    }
                    float f16 = 1.0f;
                    qt0Var.U = Utilities.i((org.telegram.messenger.g0.t / 200.0f) + qt0Var.U, 1.0f, 0.0f);
                    int i10 = 0;
                    while (i10 < 2) {
                        Drawable drawable3 = i10 == 0 ? qt0Var.d : qt0Var.b;
                        if (drawable3 == null) {
                            f13 = f16;
                        } else {
                            if (i10 != 1 || qt0Var.d == null || qt0Var.H == null) {
                                drawable3.setAlpha(hs.e4);
                            } else {
                                drawable3.setAlpha((int) (qt0Var.U * 255.0f));
                            }
                            if (i10 == 0 ? qt0Var.e : qt0Var.c) {
                                f10 = qt0Var.E;
                                f11 = qt0Var.x;
                                f12 = qt0Var.y;
                            } else {
                                f10 = f16;
                                f11 = f15;
                                f12 = f11;
                            }
                            if (drawable3 instanceof la0) {
                                la0 la0Var = (la0) drawable3;
                                if (la0Var.u != null) {
                                    int currentActionBarHeight = (qt0Var.O() ? org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() : 0) + ((qt0Var.P() && qt0Var.s) ? org.telegram.messenger.g0.m : 0);
                                    int measuredHeight = qt0Var.W() ? getRootView().getMeasuredHeight() - currentActionBarHeight : getHeight();
                                    f13 = f16;
                                    float max2 = Math.max(getMeasuredWidth() / drawable3.getIntrinsicWidth(), measuredHeight / drawable3.getIntrinsicHeight());
                                    int ceil = (int) Math.ceil(drawable3.getIntrinsicWidth() * max2 * f10);
                                    int ceil2 = (int) Math.ceil(drawable3.getIntrinsicHeight() * max2 * f10);
                                    int measuredWidth = ((getMeasuredWidth() - ceil) / 2) + ((int) f11);
                                    int i11 = ((measuredHeight - ceil2) / 2) + qt0Var.F + currentActionBarHeight + ((int) f12);
                                    canvas.save();
                                    canvas.clipRect(0, currentActionBarHeight, ceil, getMeasuredHeight() - qt0Var.h);
                                    drawable3.setBounds(measuredWidth, i11, ceil + measuredWidth, ceil2 + i11);
                                    drawable3.draw(canvas);
                                    qt0.F(qt0Var, canvas);
                                    canvas.restore();
                                } else {
                                    f13 = f16;
                                    if (qt0Var.h != 0) {
                                        canvas.save();
                                        canvas.clipRect(0, 0, getMeasuredWidth(), getRootView().getMeasuredHeight() - qt0Var.h);
                                    }
                                    la0Var.f = qt0Var.F;
                                    drawable3.setBounds(0, 0, getMeasuredWidth(), (int) ((getRootView().getMeasuredHeight() - qt0Var.F) + f12));
                                    drawable3.draw(canvas);
                                    if (qt0Var.h != 0) {
                                        canvas.restore();
                                    }
                                }
                            } else {
                                f13 = f16;
                                if (drawable3 instanceof ColorDrawable) {
                                    if (qt0Var.h != 0) {
                                        canvas.save();
                                        canvas.clipRect(0, 0, getMeasuredWidth(), getMeasuredHeight() - qt0Var.h);
                                    }
                                    drawable3.setBounds(0, 0, getMeasuredWidth(), getRootView().getMeasuredHeight());
                                    drawable3.draw(canvas);
                                    qt0.F(qt0Var, canvas);
                                    if (qt0Var.h != 0) {
                                        canvas.restore();
                                    }
                                } else if (drawable3 instanceof GradientDrawable) {
                                    if (qt0Var.h != 0) {
                                        canvas.save();
                                        canvas.clipRect(0, 0, getMeasuredWidth(), getRootView().getMeasuredHeight() - qt0Var.h);
                                    }
                                    drawable3.setBounds(0, qt0Var.F, getMeasuredWidth(), getRootView().getMeasuredHeight() + qt0Var.F);
                                    drawable3.draw(canvas);
                                    qt0.F(qt0Var, canvas);
                                    if (qt0Var.h != 0) {
                                        canvas.restore();
                                    }
                                } else if (!(drawable3 instanceof BitmapDrawable)) {
                                    if (qt0Var.h != 0) {
                                        canvas.save();
                                        canvas.clipRect(0, 0, getMeasuredWidth(), getRootView().getMeasuredHeight() - qt0Var.h);
                                    }
                                    if (drawable3 instanceof zm) {
                                        zm zmVar = (zm) drawable3;
                                        zmVar.b = this;
                                        la0 la0Var2 = zmVar.f;
                                        if (la0Var2 != null) {
                                            la0Var2.q(this);
                                        }
                                    }
                                    float f17 = f10 - f13;
                                    float e10 = a1.g.e(-getMeasuredWidth(), f17, 2.0f, f11);
                                    float e11 = a1.g.e(-getRootView().getMeasuredHeight(), f17, 2.0f, f12);
                                    drawable3.setBounds((int) e10, (int) (qt0Var.F + e11), (int) ((getMeasuredWidth() * f10) + e10), (int) t4.c.c(getRootView().getMeasuredHeight(), f10, qt0Var.F, e11));
                                    drawable3.draw(canvas);
                                    qt0.F(qt0Var, canvas);
                                    if (qt0Var.h != 0) {
                                        canvas.restore();
                                    }
                                } else if (((BitmapDrawable) drawable3).getTileModeX() == Shader.TileMode.REPEAT) {
                                    canvas.save();
                                    float f18 = 2.0f / org.telegram.messenger.g0.p;
                                    canvas.scale(f18, f18);
                                    drawable3.setBounds(0, 0, (int) Math.ceil(getMeasuredWidth() / f18), (int) Math.ceil(getRootView().getMeasuredHeight() / f18));
                                    drawable3.draw(canvas);
                                    qt0.F(qt0Var, canvas);
                                    canvas.restore();
                                } else {
                                    int currentActionBarHeight2 = (qt0Var.O() ? org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() : 0) + ((qt0Var.P() && qt0Var.s) ? org.telegram.messenger.g0.m : 0);
                                    int measuredHeight2 = qt0Var.W() ? getRootView().getMeasuredHeight() - currentActionBarHeight2 : getHeight();
                                    float max3 = Math.max(getMeasuredWidth() / drawable3.getIntrinsicWidth(), measuredHeight2 / drawable3.getIntrinsicHeight());
                                    int ceil3 = (int) Math.ceil(drawable3.getIntrinsicWidth() * max3 * f10);
                                    int ceil4 = (int) Math.ceil(drawable3.getIntrinsicHeight() * max3 * f10);
                                    int measuredWidth2 = ((getMeasuredWidth() - ceil3) / 2) + ((int) f11);
                                    int i12 = ((measuredHeight2 - ceil4) / 2) + qt0Var.F + currentActionBarHeight2 + ((int) f12);
                                    canvas.save();
                                    canvas.clipRect(0, currentActionBarHeight2, ceil3, getMeasuredHeight() - qt0Var.h);
                                    drawable3.setBounds(measuredWidth2, i12, ceil3 + measuredWidth2, ceil4 + i12);
                                    drawable3.draw(canvas);
                                    qt0.F(qt0Var, canvas);
                                    canvas.restore();
                                }
                            }
                            if (i10 == 0 && (drawable = qt0Var.d) != null && qt0Var.U >= f13) {
                                if (qt0Var.N && (drawable instanceof zm)) {
                                    ((zm) drawable).g(qt0Var.M);
                                }
                                if (qt0Var.N) {
                                    Drawable drawable4 = qt0Var.d;
                                    if (drawable4 instanceof la0) {
                                        ((la0) drawable4).l();
                                    }
                                }
                                qt0Var.d = null;
                                qt0Var.e = false;
                                qt0Var.G();
                                qt0Var.M.invalidate();
                            }
                        }
                        i10++;
                        f16 = f13;
                        f15 = 0.0f;
                    }
                    if (qt0Var.U != f16) {
                        qt0Var.M.invalidate();
                        break;
                    }
                }
                break;
            case 29:
                super.onDraw(canvas);
                int x02 = org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.Jj, false);
                gw0 gw0Var = (gw0) this.b;
                org.telegram.ui.Components.voip.g gVar = gw0Var.M;
                Paint paint2 = gw0Var.a;
                paint2.setColor(x02);
                Paint paint3 = gw0Var.b;
                paint3.setColor(x02);
                Paint paint4 = gw0Var.c;
                paint4.setColor(x02);
                paint3.setAlpha(hs.e4);
                paint4.setAlpha(82);
                paint2.setAlpha(46);
                Paint paint5 = gw0Var.d;
                paint5.setColor(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.d6, false));
                canvas.drawLine(org.telegram.messenger.g0.L(24.0f), org.telegram.messenger.g0.L(20.0f), getMeasuredWidth() - org.telegram.messenger.g0.L(24.0f), org.telegram.messenger.g0.L(20.0f), paint2);
                boolean z10 = gw0Var.e;
                if (z10 || gw0Var.K != 0.0f) {
                    if (!z10) {
                        float f19 = gw0Var.K - 0.10666667f;
                        gw0Var.K = f19;
                        if (f19 < 0.0f) {
                            gw0Var.K = 0.0f;
                        }
                    } else if (gw0Var.L) {
                        float f20 = gw0Var.K + 0.024615385f;
                        gw0Var.K = f20;
                        if (f20 > 1.0f) {
                            gw0Var.K = 1.0f;
                            gw0Var.L = false;
                        }
                    } else {
                        float f21 = gw0Var.K - 0.024615385f;
                        gw0Var.K = f21;
                        if (f21 < 0.0f) {
                            gw0Var.K = 0.0f;
                            gw0Var.L = true;
                        }
                    }
                    invalidate();
                    RectF rectF = org.telegram.messenger.g0.P;
                    rectF.set(org.telegram.messenger.g0.L(24.0f), org.telegram.messenger.g0.L(17.0f), getMeasuredWidth() - org.telegram.messenger.g0.L(24.0f), org.telegram.messenger.g0.L(23.0f));
                    gVar.f = getMeasuredWidth();
                    gVar.a(org.telegram.messenger.g0.L(3.0f), canvas, rectF, null);
                }
                int L2 = org.telegram.messenger.g0.L(24.0f);
                if (gw0Var.e) {
                    f14 = 1.0f;
                    paint = paint5;
                } else {
                    int L3 = org.telegram.messenger.g0.L(24.0f) + ((int) (org.telegram.messenger.camera.q.A(24.0f, 2, getMeasuredWidth()) * gw0Var.G));
                    f14 = 1.0f;
                    canvas.drawLine(L2, org.telegram.messenger.g0.L(20.0f), org.telegram.messenger.g0.L(24.0f) + r2, org.telegram.messenger.g0.L(20.0f), paint4);
                    canvas.drawRect(L3, org.telegram.messenger.g0.L(20.0f) - org.telegram.messenger.g0.L(3.0f), org.telegram.messenger.g0.L(3.0f) + L3, org.telegram.messenger.g0.L(3.0f) + org.telegram.messenger.g0.L(20.0f), paint5);
                    paint = paint5;
                }
                if (!gw0Var.e) {
                    int A = (int) (org.telegram.messenger.camera.q.A(24.0f, 2, getMeasuredWidth()) * gw0Var.F);
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
    public void onMeasure(int i3, int i10) {
        int i11;
        int i12;
        int i13;
        org.telegram.ui.ActionBar.k kVar;
        int i14;
        switch (this.a) {
            case 1:
                wb wbVar = (wb) this.b;
                if (wbVar.I) {
                    i11 = (wbVar.p0().getMeasuredHeight() + wbVar.J) - org.telegram.messenger.g0.L(16.0f);
                } else {
                    int L = org.telegram.messenger.g0.L(140.0f) + wbVar.J;
                    if (org.telegram.messenger.g0.L(24.0f) + wbVar.E.getMeasuredHeight() > L) {
                        L = org.telegram.messenger.g0.L(24.0f) + wbVar.E.getMeasuredHeight();
                    }
                    i11 = L;
                }
                super.onMeasure(i3, View.MeasureSpec.makeMeasureSpec((int) (i11 - (0 * 2.5f)), TLObject.FLAG_30));
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
                super.onMeasure(i3, i10);
                break;
            case 4:
                hi.g gVar = (hi.g) this.b;
                if (gVar.I) {
                    i12 = (gVar.p0().getMeasuredHeight() + gVar.J) - org.telegram.messenger.g0.L(16.0f);
                } else {
                    int L2 = org.telegram.messenger.g0.L(140.0f) + gVar.J;
                    if (org.telegram.messenger.g0.L(24.0f) + gVar.E.getMeasuredHeight() > L2) {
                        L2 = org.telegram.messenger.g0.L(24.0f) + gVar.E.getMeasuredHeight();
                    }
                    i12 = L2;
                }
                super.onMeasure(i3, View.MeasureSpec.makeMeasureSpec((int) (i12 - (0 * 2.5f)), TLObject.FLAG_30));
                break;
            case 5:
                ii.k kVar2 = (ii.k) this.b;
                if (kVar2.I) {
                    int i15 = kVar2.J;
                    kVar = ((org.telegram.ui.ActionBar.d2) kVar2).actionBar;
                    i13 = (kVar.getMeasuredHeight() + i15) - org.telegram.messenger.g0.L(16.0f);
                } else {
                    int L3 = org.telegram.messenger.g0.L(140.0f) + kVar2.J;
                    if (org.telegram.messenger.g0.L(24.0f) + kVar2.E.getMeasuredHeight() > L3) {
                        L3 = org.telegram.messenger.g0.L(24.0f) + kVar2.E.getMeasuredHeight();
                    }
                    i13 = L3;
                }
                super.onMeasure(i3, View.MeasureSpec.makeMeasureSpec((int) (i13 - (0 * 2.5f)), TLObject.FLAG_30));
                break;
            case 7:
                ((View) getParent()).getMeasuredHeight();
                kg.k1 k1Var = (kg.k1) this.b;
                Integer num = k1Var.d;
                if (num != null) {
                    i14 = num.intValue();
                    k1Var.h = i14;
                } else {
                    i14 = 0;
                    k1Var.h = 0;
                }
                super.onMeasure(i3, View.MeasureSpec.makeMeasureSpec(i14, TLObject.FLAG_30));
                break;
            case 10:
                setMeasuredDimension(View.MeasureSpec.getSize(i3), org.telegram.messenger.g0.L(24.0f));
                break;
            case 11:
                u4.b0 b0Var = ((org.telegram.ui.p5) this.b).d.G;
                super.onMeasure(i3, View.MeasureSpec.makeMeasureSpec(Math.max(0, b0Var instanceof jy ? ((jy) b0Var).J : 0), TLObject.FLAG_30));
                break;
            case 14:
                ma maVar = (ma) this.b;
                int i16 = maVar.o1;
                int L4 = (i16 == 0 ? org.telegram.messenger.g0.L(300.0f) : (int) (i16 * maVar.s1)) - (((maVar.y1 - maVar.z1) - maVar.A1) - maVar.B1);
                if (L4 < 1) {
                    L4 = 1;
                }
                super.onMeasure(i3, View.MeasureSpec.makeMeasureSpec(L4, TLObject.FLAG_30));
                break;
            case 15:
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i3), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(((sl) this.b).w.K, TLObject.FLAG_30));
                break;
            case 16:
                setMeasuredDimension(View.MeasureSpec.getSize(i3), ((an) ((org.telegram.ui.n4) this.b).e).S0);
                break;
            case 17:
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i3), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(((bn) ((y7) this.b).d).x, TLObject.FLAG_30));
                break;
            case 19:
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(getPaddingRight() + getPaddingLeft() + Math.round(((ly0) this.b).k()), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(Math.max(getPaddingBottom() + getPaddingTop() + Math.round(((ly0) this.b).i()), org.telegram.messenger.g0.L(26.0f)), TLObject.FLAG_30));
                break;
            case 20:
                super.onMeasure(i3, View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(48.0f) + ((n50) this.b).c.g2, TLObject.FLAG_30));
                break;
            case 21:
                int L5 = org.telegram.messenger.g0.L(48.0f);
                t50 t50Var = ((p50) this.b).n;
                super.onMeasure(i3, View.MeasureSpec.makeMeasureSpec(L5 + t50Var.g2 + t50Var.m2, TLObject.FLAG_30));
                break;
            case 24:
                super.onMeasure(i3, View.MeasureSpec.makeMeasureSpec(((lo0) this.b).L.C1.R, TLObject.FLAG_30));
                break;
            case 26:
                setMeasuredDimension(View.MeasureSpec.getSize(i3), ((gt0) this.b).getMeasuredHeight());
                break;
            case 28:
                ou0 ou0Var = (ou0) this.b;
                int size = View.MeasureSpec.getSize(i3);
                if (size <= 0) {
                    size = ((View) getParent()).getMeasuredWidth();
                }
                int size2 = View.MeasureSpec.getSize(i10) - org.telegram.messenger.g0.L(4.0f);
                xu0 xu0Var = ou0Var.d;
                int i17 = xu0Var.o3;
                int max = Math.max(i17 > 0 ? org.telegram.messenger.g0.L(4.0f) + i17 : 0, (int) (size - Math.min(org.telegram.messenger.g0.L(4.0f) + ((ou0Var.b() - 1) * size2), ou0Var.d.f3 * size2)));
                xu0Var.n3 = max;
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(max, TLObject.FLAG_30), i10);
                break;
            case 29:
                super.onMeasure(i3, View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(40.0f), TLObject.FLAG_30));
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
                if (((w2) this.b) != null) {
                    if (isAttachedToWindow()) {
                        w2 w2Var = (w2) this.b;
                        if (w2Var.i) {
                            w2Var.i = false;
                            w2Var.a();
                            v2 v2Var = w2Var.h;
                            HashSet hashSet = lc.n;
                            if (hashSet != null) {
                                hashSet.remove(v2Var);
                            }
                        }
                    }
                    this.b = null;
                }
                super.setBackground(drawable);
                if (drawable instanceof w2) {
                    this.b = (w2) drawable;
                    if (isAttachedToWindow()) {
                        w2 w2Var2 = (w2) this.b;
                        if (!w2Var2.i) {
                            w2Var2.i = true;
                            w2Var2.a();
                            v2 v2Var2 = new v2(w2Var2, 0);
                            w2Var2.h = v2Var2;
                            lc.a(v2Var2);
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
                ma maVar = (ma) this.b;
                int i3 = ma.P1;
                maVar.b.invalidate();
                break;
            default:
                super.setTranslationY(f10);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ x2(Context context, int i3) {
        super(context);
        this.a = i3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x2(ma maVar, Context context) {
        super(context);
        this.a = 14;
        this.b = maVar;
        setTag(-33024);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x2(Context context, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context);
        this.a = 10;
        CheckBoxBase checkBoxBase = new CheckBoxBase(20, this, e6Var);
        this.b = checkBoxBase;
        checkBoxBase.h(org.telegram.ui.ActionBar.k6.Vl, org.telegram.ui.ActionBar.k6.z5, org.telegram.ui.ActionBar.k6.k7);
        checkBoxBase.d(10);
        checkBoxBase.k(true);
        checkBoxBase.i(org.telegram.messenger.g0.L(5.0f));
    }
}
