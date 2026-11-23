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
import di.pb;
import hi.ia;
import hi.sa;
import hi.u9;
import java.util.HashSet;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.ls;
import org.telegram.messenger.o10;
import org.telegram.messenger.qc;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.Components.CheckBoxBase;
import org.telegram.ui.Components.ap0;
import org.telegram.ui.Components.cb0;
import org.telegram.ui.Components.cv0;
import org.telegram.ui.Components.du0;
import org.telegram.ui.Components.e60;
import org.telegram.ui.Components.er;
import org.telegram.ui.Components.g60;
import org.telegram.ui.Components.jm;
import org.telegram.ui.Components.l60;
import org.telegram.ui.Components.lv0;
import org.telegram.ui.Components.oo0;
import org.telegram.ui.Components.tn;
import org.telegram.ui.Components.tt0;
import org.telegram.ui.Components.tw0;
import org.telegram.ui.Components.un;
import org.telegram.ui.Components.xo0;
import org.telegram.ui.Components.xy0;
import org.telegram.ui.Components.yy;
import org.telegram.ui.dq0;
import org.telegram.ui.en;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes3.dex */
public final class m3 extends View {
    public final /* synthetic */ int a;
    public Object b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ m3(int i7, Context context, Object obj) {
        super(context);
        this.a = i7;
        this.b = obj;
    }

    @Override // android.view.View
    public void dispatchDraw(Canvas canvas) {
        switch (this.a) {
            case 2:
                super.dispatchDraw(canvas);
                hi.e5 e5Var = ((u9) this.b).y0;
                if (e5Var != null) {
                    e5Var.d(canvas);
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
                dh.d dVar = ((jh.f) this.b).L;
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
                ((xy0) this.b).e(canvas, (getMeasuredWidth() - ((xy0) this.b).k()) / 2.0f, getMeasuredHeight() / 2.0f);
                break;
            case 23:
                super.draw(canvas);
                ap0 ap0Var = (ap0) this.b;
                ap0Var.R2.setBounds(0, (getMeasuredHeight() - ap0Var.C2.d) - org.telegram.messenger.g0.L(72.0f), getMeasuredWidth(), getMeasuredHeight());
                ap0Var.R2.draw(canvas);
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
                ((du0) this.b).S();
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
                l3 l3Var = (l3) this.b;
                if (l3Var != null && !l3Var.i) {
                    l3Var.i = true;
                    l3Var.a();
                    ai.h0 h0Var = new ai.h0(l3Var, 1);
                    l3Var.h = h0Var;
                    qc.a(h0Var);
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
                l3 l3Var = (l3) this.b;
                if (l3Var != null && l3Var.i) {
                    l3Var.i = false;
                    l3Var.a();
                    ai.h0 h0Var = l3Var.h;
                    HashSet hashSet = qc.n;
                    if (hashSet != null) {
                        hashSet.remove(h0Var);
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
                bg.d0 d0Var2 = d0Var.F1;
                float max = Math.max(d0Var.m1.e, d0Var.n1.e);
                bg.d0 d0Var3 = d0Var.E1;
                d0Var3.c(org.telegram.messenger.g0.L(42.0f) + d0Var.P1.b, 0);
                d0Var3.setBounds(0, 0, getWidth(), org.telegram.messenger.g0.L(56.0f) + d0Var.P1.b);
                int i7 = org.telegram.ui.ActionBar.m6.a7;
                d0Var3.b(org.telegram.ui.ActionBar.m6.r1(org.telegram.messenger.g0.T1(1.0f, 0.8f, max), org.telegram.ui.ActionBar.m6.w0(i7, d0Var.J0)));
                d0Var3.draw(canvas);
                if (d0Var.I1) {
                    max = 1.0f;
                }
                int W1 = org.telegram.messenger.g0.W1(max, org.telegram.messenger.g0.L(48.0f) + d0Var.P1.d, 0);
                int W12 = org.telegram.messenger.g0.W1(max, org.telegram.messenger.g0.L(72.0f), 0) + d0Var.P1.d;
                float T1 = org.telegram.messenger.g0.T1(0.8f, org.telegram.messenger.g0.R0(d0Var.P1.d), max);
                d0Var2.c(0, W1);
                d0Var2.setBounds(0, getHeight() - W12, getWidth(), getHeight());
                d0Var2.b(org.telegram.ui.ActionBar.m6.r1(T1, org.telegram.ui.ActionBar.m6.w0(i7, d0Var.J0)));
                d0Var2.draw(canvas);
                break;
            case 9:
                canvas.save();
                canvas.translate(org.telegram.messenger.g0.N(22.6f), org.telegram.messenger.g0.N(21.66f));
                ((oi.q0) this.b).c.draw(canvas);
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
                org.telegram.ui.Cells.u2 u2Var = (org.telegram.ui.Cells.u2) this.b;
                u2Var.o4.setBounds(0, 0, getWidth(), getHeight());
                u2Var.o4.draw(canvas);
                break;
            case 18:
                if (((er) this.b).V1) {
                    canvas.drawRect(r2.u0, 0.0f, getMeasuredWidth() - r2.u0, 1.0f, org.telegram.ui.ActionBar.m6.k0);
                    break;
                }
                break;
            case 22:
                super.onDraw(canvas);
                ((dq0) this.b).j(canvas, getMeasuredWidth(), getMeasuredHeight());
                break;
            case 25:
                super.onDraw(canvas);
                int S0 = org.telegram.messenger.g0.S0(getTranslationX() / getMeasuredWidth(), 1.0f, -9057429, -10513163);
                int S02 = org.telegram.messenger.g0.S0(getTranslationX() / getMeasuredWidth(), 1.0f, -11554882, -4629871);
                oo0 oo0Var = (oo0) this.b;
                oo0Var.getClass();
                if (S0 != 0) {
                    oo0Var.h = new LinearGradient(0.0f, 0.0f, getMeasuredWidth(), 0.0f, new int[]{S0, S02}, (float[]) null, Shader.TileMode.CLAMP);
                    oo0Var.n.setShader(oo0Var.h);
                }
                oo0Var.r.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                canvas.drawRoundRect(oo0Var.r, org.telegram.messenger.g0.L(18.0f), org.telegram.messenger.g0.L(18.0f), oo0Var.n);
                break;
            case 27:
                du0 du0Var = (du0) this.b;
                if (du0Var.b != null && !du0Var.K) {
                    Drawable newDrawable = du0Var.getNewDrawable();
                    boolean newDrawableMotion = du0Var.getNewDrawableMotion();
                    float f15 = 0.0f;
                    if (newDrawable != du0Var.b && newDrawable != null) {
                        if (org.telegram.ui.ActionBar.m6.h1()) {
                            du0Var.d = du0Var.b;
                            du0Var.e = du0Var.c;
                        }
                        if (newDrawable instanceof cb0) {
                            ((cb0) newDrawable).q(du0Var.M);
                        }
                        du0Var.b = newDrawable;
                        if (du0Var.N && (newDrawable instanceof en)) {
                            ((en) newDrawable).f(this);
                        }
                        if (du0Var.N) {
                            Drawable drawable2 = du0Var.b;
                            if (drawable2 instanceof cb0) {
                                ((cb0) drawable2).k();
                            }
                        }
                        du0Var.c = newDrawableMotion;
                        du0Var.U = 0.0f;
                        du0Var.T(du0Var.b);
                        du0Var.G();
                    } else if (du0Var.c != newDrawableMotion) {
                        du0Var.c = newDrawableMotion;
                        du0Var.G();
                    }
                    float f16 = 1.0f;
                    du0Var.U = Utilities.i((org.telegram.messenger.g0.t / 200.0f) + du0Var.U, 1.0f, 0.0f);
                    int i10 = 0;
                    while (i10 < 2) {
                        Drawable drawable3 = i10 == 0 ? du0Var.d : du0Var.b;
                        if (drawable3 == null) {
                            f13 = f16;
                        } else {
                            if (i10 != 1 || du0Var.d == null || du0Var.H == null) {
                                drawable3.setAlpha(ls.e4);
                            } else {
                                drawable3.setAlpha((int) (du0Var.U * 255.0f));
                            }
                            if (i10 == 0 ? du0Var.e : du0Var.c) {
                                f10 = du0Var.E;
                                f11 = du0Var.x;
                                f12 = du0Var.y;
                            } else {
                                f10 = f16;
                                f11 = f15;
                                f12 = f11;
                            }
                            if (drawable3 instanceof cb0) {
                                cb0 cb0Var = (cb0) drawable3;
                                if (cb0Var.u != null) {
                                    int currentActionBarHeight = (du0Var.O() ? org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() : 0) + ((du0Var.P() && du0Var.s) ? org.telegram.messenger.g0.m : 0);
                                    int measuredHeight = du0Var.W() ? getRootView().getMeasuredHeight() - currentActionBarHeight : getHeight();
                                    f13 = f16;
                                    float max2 = Math.max(getMeasuredWidth() / drawable3.getIntrinsicWidth(), measuredHeight / drawable3.getIntrinsicHeight());
                                    int ceil = (int) Math.ceil(drawable3.getIntrinsicWidth() * max2 * f10);
                                    int ceil2 = (int) Math.ceil(drawable3.getIntrinsicHeight() * max2 * f10);
                                    int measuredWidth = ((getMeasuredWidth() - ceil) / 2) + ((int) f11);
                                    int i11 = ((measuredHeight - ceil2) / 2) + du0Var.F + currentActionBarHeight + ((int) f12);
                                    canvas.save();
                                    canvas.clipRect(0, currentActionBarHeight, ceil, getMeasuredHeight() - du0Var.h);
                                    drawable3.setBounds(measuredWidth, i11, ceil + measuredWidth, ceil2 + i11);
                                    drawable3.draw(canvas);
                                    du0.F(du0Var, canvas);
                                    canvas.restore();
                                } else {
                                    f13 = f16;
                                    if (du0Var.h != 0) {
                                        canvas.save();
                                        canvas.clipRect(0, 0, getMeasuredWidth(), getRootView().getMeasuredHeight() - du0Var.h);
                                    }
                                    cb0Var.f = du0Var.F;
                                    drawable3.setBounds(0, 0, getMeasuredWidth(), (int) ((getRootView().getMeasuredHeight() - du0Var.F) + f12));
                                    drawable3.draw(canvas);
                                    if (du0Var.h != 0) {
                                        canvas.restore();
                                    }
                                }
                            } else {
                                f13 = f16;
                                if (drawable3 instanceof ColorDrawable) {
                                    if (du0Var.h != 0) {
                                        canvas.save();
                                        canvas.clipRect(0, 0, getMeasuredWidth(), getMeasuredHeight() - du0Var.h);
                                    }
                                    drawable3.setBounds(0, 0, getMeasuredWidth(), getRootView().getMeasuredHeight());
                                    drawable3.draw(canvas);
                                    du0.F(du0Var, canvas);
                                    if (du0Var.h != 0) {
                                        canvas.restore();
                                    }
                                } else if (drawable3 instanceof GradientDrawable) {
                                    if (du0Var.h != 0) {
                                        canvas.save();
                                        canvas.clipRect(0, 0, getMeasuredWidth(), getRootView().getMeasuredHeight() - du0Var.h);
                                    }
                                    drawable3.setBounds(0, du0Var.F, getMeasuredWidth(), getRootView().getMeasuredHeight() + du0Var.F);
                                    drawable3.draw(canvas);
                                    du0.F(du0Var, canvas);
                                    if (du0Var.h != 0) {
                                        canvas.restore();
                                    }
                                } else if (!(drawable3 instanceof BitmapDrawable)) {
                                    if (du0Var.h != 0) {
                                        canvas.save();
                                        canvas.clipRect(0, 0, getMeasuredWidth(), getRootView().getMeasuredHeight() - du0Var.h);
                                    }
                                    if (drawable3 instanceof en) {
                                        en enVar = (en) drawable3;
                                        enVar.b = this;
                                        cb0 cb0Var2 = enVar.f;
                                        if (cb0Var2 != null) {
                                            cb0Var2.q(this);
                                        }
                                    }
                                    float f17 = f10 - f13;
                                    float f18 = a8.p0.f(-getMeasuredWidth(), f17, 2.0f, f11);
                                    float f19 = a8.p0.f(-getRootView().getMeasuredHeight(), f17, 2.0f, f12);
                                    drawable3.setBounds((int) f18, (int) (du0Var.F + f19), (int) ((getMeasuredWidth() * f10) + f18), (int) p5.c.e(getRootView().getMeasuredHeight(), f10, du0Var.F, f19));
                                    drawable3.draw(canvas);
                                    du0.F(du0Var, canvas);
                                    if (du0Var.h != 0) {
                                        canvas.restore();
                                    }
                                } else if (((BitmapDrawable) drawable3).getTileModeX() == Shader.TileMode.REPEAT) {
                                    canvas.save();
                                    float f20 = 2.0f / org.telegram.messenger.g0.p;
                                    canvas.scale(f20, f20);
                                    drawable3.setBounds(0, 0, (int) Math.ceil(getMeasuredWidth() / f20), (int) Math.ceil(getRootView().getMeasuredHeight() / f20));
                                    drawable3.draw(canvas);
                                    du0.F(du0Var, canvas);
                                    canvas.restore();
                                } else {
                                    int currentActionBarHeight2 = (du0Var.O() ? org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() : 0) + ((du0Var.P() && du0Var.s) ? org.telegram.messenger.g0.m : 0);
                                    int measuredHeight2 = du0Var.W() ? getRootView().getMeasuredHeight() - currentActionBarHeight2 : getHeight();
                                    float max3 = Math.max(getMeasuredWidth() / drawable3.getIntrinsicWidth(), measuredHeight2 / drawable3.getIntrinsicHeight());
                                    int ceil3 = (int) Math.ceil(drawable3.getIntrinsicWidth() * max3 * f10);
                                    int ceil4 = (int) Math.ceil(drawable3.getIntrinsicHeight() * max3 * f10);
                                    int measuredWidth2 = ((getMeasuredWidth() - ceil3) / 2) + ((int) f11);
                                    int i12 = ((measuredHeight2 - ceil4) / 2) + du0Var.F + currentActionBarHeight2 + ((int) f12);
                                    canvas.save();
                                    canvas.clipRect(0, currentActionBarHeight2, ceil3, getMeasuredHeight() - du0Var.h);
                                    drawable3.setBounds(measuredWidth2, i12, ceil3 + measuredWidth2, ceil4 + i12);
                                    drawable3.draw(canvas);
                                    du0.F(du0Var, canvas);
                                    canvas.restore();
                                }
                            }
                            if (i10 == 0 && (drawable = du0Var.d) != null && du0Var.U >= f13) {
                                if (du0Var.N && (drawable instanceof en)) {
                                    ((en) drawable).g(du0Var.M);
                                }
                                if (du0Var.N) {
                                    Drawable drawable4 = du0Var.d;
                                    if (drawable4 instanceof cb0) {
                                        ((cb0) drawable4).l();
                                    }
                                }
                                du0Var.d = null;
                                du0Var.e = false;
                                du0Var.G();
                                du0Var.M.invalidate();
                            }
                        }
                        i10++;
                        f16 = f13;
                        f15 = 0.0f;
                    }
                    if (du0Var.U != f16) {
                        du0Var.M.invalidate();
                        break;
                    }
                }
                break;
            case 29:
                super.onDraw(canvas);
                int x02 = org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.Mj, false);
                tw0 tw0Var = (tw0) this.b;
                org.telegram.ui.Components.voip.n nVar = tw0Var.M;
                Paint paint2 = tw0Var.a;
                paint2.setColor(x02);
                Paint paint3 = tw0Var.b;
                paint3.setColor(x02);
                Paint paint4 = tw0Var.c;
                paint4.setColor(x02);
                paint3.setAlpha(ls.e4);
                paint4.setAlpha(82);
                paint2.setAlpha(46);
                Paint paint5 = tw0Var.d;
                paint5.setColor(org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.d6, false));
                canvas.drawLine(org.telegram.messenger.g0.L(24.0f), org.telegram.messenger.g0.L(20.0f), getMeasuredWidth() - org.telegram.messenger.g0.L(24.0f), org.telegram.messenger.g0.L(20.0f), paint2);
                boolean z10 = tw0Var.e;
                if (z10 || tw0Var.K != 0.0f) {
                    if (!z10) {
                        float f21 = tw0Var.K - 0.10666667f;
                        tw0Var.K = f21;
                        if (f21 < 0.0f) {
                            tw0Var.K = 0.0f;
                        }
                    } else if (tw0Var.L) {
                        float f22 = tw0Var.K + 0.024615385f;
                        tw0Var.K = f22;
                        if (f22 > 1.0f) {
                            tw0Var.K = 1.0f;
                            tw0Var.L = false;
                        }
                    } else {
                        float f23 = tw0Var.K - 0.024615385f;
                        tw0Var.K = f23;
                        if (f23 < 0.0f) {
                            tw0Var.K = 0.0f;
                            tw0Var.L = true;
                        }
                    }
                    invalidate();
                    RectF rectF = org.telegram.messenger.g0.P;
                    rectF.set(org.telegram.messenger.g0.L(24.0f), org.telegram.messenger.g0.L(17.0f), getMeasuredWidth() - org.telegram.messenger.g0.L(24.0f), org.telegram.messenger.g0.L(23.0f));
                    nVar.f = getMeasuredWidth();
                    nVar.a(org.telegram.messenger.g0.L(3.0f), canvas, rectF, null);
                }
                int L2 = org.telegram.messenger.g0.L(24.0f);
                if (tw0Var.e) {
                    f14 = 1.0f;
                    paint = paint5;
                } else {
                    int L3 = org.telegram.messenger.g0.L(24.0f) + ((int) (o10.B(24.0f, 2, getMeasuredWidth()) * tw0Var.G));
                    f14 = 1.0f;
                    canvas.drawLine(L2, org.telegram.messenger.g0.L(20.0f), org.telegram.messenger.g0.L(24.0f) + r2, org.telegram.messenger.g0.L(20.0f), paint4);
                    canvas.drawRect(L3, org.telegram.messenger.g0.L(20.0f) - org.telegram.messenger.g0.L(3.0f), org.telegram.messenger.g0.L(3.0f) + L3, org.telegram.messenger.g0.L(3.0f) + org.telegram.messenger.g0.L(20.0f), paint5);
                    paint = paint5;
                }
                if (!tw0Var.e) {
                    int B = (int) (o10.B(24.0f, 2, getMeasuredWidth()) * tw0Var.F);
                    if (B < org.telegram.messenger.g0.L(f14)) {
                        B = org.telegram.messenger.g0.L(f14);
                    }
                    int L4 = org.telegram.messenger.g0.L(24.0f) + B;
                    canvas.drawLine(L2, org.telegram.messenger.g0.L(20.0f), org.telegram.messenger.g0.L(24.0f) + B, org.telegram.messenger.g0.L(20.0f), paint3);
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
                pb pbVar = (pb) this.b;
                if (pbVar.I) {
                    i11 = (pbVar.p0().getMeasuredHeight() + pbVar.J) - org.telegram.messenger.g0.L(16.0f);
                } else {
                    int L = org.telegram.messenger.g0.L(140.0f) + pbVar.J;
                    if (org.telegram.messenger.g0.L(24.0f) + pbVar.E.getMeasuredHeight() > L) {
                        L = org.telegram.messenger.g0.L(24.0f) + pbVar.E.getMeasuredHeight();
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
                ii.t tVar = (ii.t) this.b;
                if (tVar.I) {
                    i12 = (tVar.p0().getMeasuredHeight() + tVar.J) - org.telegram.messenger.g0.L(16.0f);
                } else {
                    int L2 = org.telegram.messenger.g0.L(140.0f) + tVar.J;
                    if (org.telegram.messenger.g0.L(24.0f) + tVar.E.getMeasuredHeight() > L2) {
                        L2 = org.telegram.messenger.g0.L(24.0f) + tVar.E.getMeasuredHeight();
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
                ki.j jVar = (ki.j) this.b;
                if (jVar.I) {
                    int i15 = jVar.J;
                    kVar = ((org.telegram.ui.ActionBar.g2) jVar).actionBar;
                    i14 = (kVar.getMeasuredHeight() + i15) - org.telegram.messenger.g0.L(16.0f);
                } else {
                    int L3 = org.telegram.messenger.g0.L(140.0f) + jVar.J;
                    if (org.telegram.messenger.g0.L(24.0f) + jVar.E.getMeasuredHeight() > L3) {
                        L3 = org.telegram.messenger.g0.L(24.0f) + jVar.E.getMeasuredHeight();
                    }
                    i14 = L3;
                }
                super.onMeasure(i7, View.MeasureSpec.makeMeasureSpec((int) (i14 - (0 * 2.5f)), TLObject.FLAG_30));
                break;
            case 10:
                setMeasuredDimension(View.MeasureSpec.getSize(i7), org.telegram.messenger.g0.L(24.0f));
                break;
            case 11:
                v4.c0 c0Var = ((org.telegram.ui.n5) this.b).d.G;
                super.onMeasure(i7, View.MeasureSpec.makeMeasureSpec(Math.max(0, c0Var instanceof yy ? ((yy) c0Var).J : 0), TLObject.FLAG_30));
                break;
            case 14:
                org.telegram.ui.Components.sa saVar = (org.telegram.ui.Components.sa) this.b;
                int i16 = saVar.r1;
                int L4 = (i16 == 0 ? org.telegram.messenger.g0.L(300.0f) : (int) (i16 * saVar.v1)) - (((saVar.B1 - saVar.C1) - saVar.D1) - saVar.E1);
                if (L4 < 1) {
                    L4 = 1;
                }
                super.onMeasure(i7, View.MeasureSpec.makeMeasureSpec(L4, TLObject.FLAG_30));
                break;
            case 15:
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i7), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(((jm) this.b).w.K, TLObject.FLAG_30));
                break;
            case 16:
                setMeasuredDimension(View.MeasureSpec.getSize(i7), ((tn) ((org.telegram.ui.l4) this.b).e).S0);
                break;
            case 17:
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i7), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(((un) ((org.telegram.ui.y7) this.b).d).x, TLObject.FLAG_30));
                break;
            case 19:
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(getPaddingRight() + getPaddingLeft() + Math.round(((xy0) this.b).k()), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(Math.max(getPaddingBottom() + getPaddingTop() + Math.round(((xy0) this.b).i()), org.telegram.messenger.g0.L(26.0f)), TLObject.FLAG_30));
                break;
            case 20:
                super.onMeasure(i7, View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(48.0f) + ((e60) this.b).c.j2, TLObject.FLAG_30));
                break;
            case 21:
                int L5 = org.telegram.messenger.g0.L(48.0f);
                l60 l60Var = ((g60) this.b).n;
                super.onMeasure(i7, View.MeasureSpec.makeMeasureSpec(L5 + l60Var.j2 + l60Var.p2, TLObject.FLAG_30));
                break;
            case 24:
                super.onMeasure(i7, View.MeasureSpec.makeMeasureSpec(((xo0) this.b).L.F1.R, TLObject.FLAG_30));
                break;
            case 26:
                setMeasuredDimension(View.MeasureSpec.getSize(i7), ((tt0) this.b).getMeasuredHeight());
                break;
            case 28:
                cv0 cv0Var = (cv0) this.b;
                int size = View.MeasureSpec.getSize(i7);
                if (size <= 0) {
                    size = ((View) getParent()).getMeasuredWidth();
                }
                int size2 = View.MeasureSpec.getSize(i10) - org.telegram.messenger.g0.L(4.0f);
                lv0 lv0Var = cv0Var.d;
                int i17 = lv0Var.o3;
                int max = Math.max(i17 > 0 ? org.telegram.messenger.g0.L(4.0f) + i17 : 0, (int) (size - Math.min(org.telegram.messenger.g0.L(4.0f) + ((cv0Var.b() - 1) * size2), cv0Var.d.f3 * size2)));
                lv0Var.n3 = max;
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
                View view = ((org.telegram.ui.d8) this.b).b.y.fragmentView;
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
                if (((l3) this.b) != null) {
                    if (isAttachedToWindow()) {
                        l3 l3Var = (l3) this.b;
                        if (l3Var.i) {
                            l3Var.i = false;
                            l3Var.a();
                            ai.h0 h0Var = l3Var.h;
                            HashSet hashSet = qc.n;
                            if (hashSet != null) {
                                hashSet.remove(h0Var);
                            }
                        }
                    }
                    this.b = null;
                }
                super.setBackground(drawable);
                if (drawable instanceof l3) {
                    this.b = (l3) drawable;
                    if (isAttachedToWindow()) {
                        l3 l3Var2 = (l3) this.b;
                        if (!l3Var2.i) {
                            l3Var2.i = true;
                            l3Var2.a();
                            ai.h0 h0Var2 = new ai.h0(l3Var2, 1);
                            l3Var2.h = h0Var2;
                            qc.a(h0Var2);
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
                org.telegram.ui.Components.sa saVar = (org.telegram.ui.Components.sa) this.b;
                int i7 = org.telegram.ui.Components.sa.S1;
                saVar.b.invalidate();
                break;
            default:
                super.setTranslationY(f10);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ m3(Context context, int i7) {
        super(context);
        this.a = i7;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m3(org.telegram.ui.Components.sa saVar, Context context) {
        super(context);
        this.a = 14;
        this.b = saVar;
        setTag(-33024);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m3(Context context, org.telegram.ui.ActionBar.h6 h6Var) {
        super(context);
        this.a = 10;
        CheckBoxBase checkBoxBase = new CheckBoxBase(20, this, h6Var);
        this.b = checkBoxBase;
        checkBoxBase.h(org.telegram.ui.ActionBar.m6.Yl, org.telegram.ui.ActionBar.m6.z5, org.telegram.ui.ActionBar.m6.k7);
        checkBoxBase.d(10);
        checkBoxBase.k(true);
        checkBoxBase.i(org.telegram.messenger.g0.L(5.0f));
    }
}
