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
import hi.ja;
import hi.ta;
import hi.v9;
import java.util.HashSet;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.ks;
import org.telegram.messenger.n10;
import org.telegram.messenger.pc;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.Components.CheckBoxBase;
import org.telegram.ui.Components.au0;
import org.telegram.ui.Components.b60;
import org.telegram.ui.Components.bb0;
import org.telegram.ui.Components.cr;
import org.telegram.ui.Components.d60;
import org.telegram.ui.Components.hm;
import org.telegram.ui.Components.iv0;
import org.telegram.ui.Components.j60;
import org.telegram.ui.Components.mo0;
import org.telegram.ui.Components.qt0;
import org.telegram.ui.Components.rn;
import org.telegram.ui.Components.rw0;
import org.telegram.ui.Components.sa;
import org.telegram.ui.Components.sn;
import org.telegram.ui.Components.vo0;
import org.telegram.ui.Components.vy0;
import org.telegram.ui.Components.wy;
import org.telegram.ui.Components.yo0;
import org.telegram.ui.Components.zu0;
import org.telegram.ui.dq0;
import org.telegram.ui.en;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public final class i3 extends View {
    public final /* synthetic */ int a;
    public Object b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i3(int i7, Context context, Object obj) {
        super(context);
        this.a = i7;
        this.b = obj;
    }

    @Override // android.view.View
    public void dispatchDraw(Canvas canvas) {
        switch (this.a) {
            case 2:
                super.dispatchDraw(canvas);
                hi.f5 f5Var = ((v9) this.b).y0;
                if (f5Var != null) {
                    f5Var.d(canvas);
                    break;
                }
                break;
            case 3:
                canvas.save();
                ta taVar = (ta) this.b;
                canvas.translate(taVar.d1.getX() + taVar.m0.getX(), taVar.d1.getY() + taVar.m0.getY());
                ja jaVar = taVar.d1;
                jaVar.k(canvas, jaVar.getBounds(), taVar.d1.getOver2Alpha());
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
                ((vy0) this.b).e(canvas, (getMeasuredWidth() - ((vy0) this.b).k()) / 2.0f, getMeasuredHeight() / 2.0f);
                break;
            case 23:
                super.draw(canvas);
                yo0 yo0Var = (yo0) this.b;
                yo0Var.R2.setBounds(0, (getMeasuredHeight() - yo0Var.C2.d) - org.telegram.messenger.g0.L(72.0f), getMeasuredWidth(), getMeasuredHeight());
                yo0Var.R2.draw(canvas);
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
                ((au0) this.b).S();
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
                h3 h3Var = (h3) this.b;
                if (h3Var != null && !h3Var.i) {
                    h3Var.i = true;
                    h3Var.a();
                    ai.g0 g0Var = new ai.g0(h3Var, 1);
                    h3Var.h = g0Var;
                    pc.a(g0Var);
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
                h3 h3Var = (h3) this.b;
                if (h3Var != null && h3Var.i) {
                    h3Var.i = false;
                    h3Var.a();
                    ai.g0 g0Var = h3Var.h;
                    HashSet hashSet = pc.n;
                    if (hashSet != null) {
                        hashSet.remove(g0Var);
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
                int i7 = org.telegram.ui.ActionBar.n6.a7;
                d0Var3.b(org.telegram.ui.ActionBar.n6.r1(org.telegram.messenger.g0.T1(1.0f, 0.8f, max), org.telegram.ui.ActionBar.n6.w0(i7, d0Var.J0)));
                d0Var3.draw(canvas);
                if (d0Var.I1) {
                    max = 1.0f;
                }
                int W1 = org.telegram.messenger.g0.W1(max, org.telegram.messenger.g0.L(48.0f) + d0Var.P1.d, 0);
                int W12 = org.telegram.messenger.g0.W1(max, org.telegram.messenger.g0.L(72.0f), 0) + d0Var.P1.d;
                float T1 = org.telegram.messenger.g0.T1(0.8f, org.telegram.messenger.g0.R0(d0Var.P1.d), max);
                d0Var2.c(0, W1);
                d0Var2.setBounds(0, getHeight() - W12, getWidth(), getHeight());
                d0Var2.b(org.telegram.ui.ActionBar.n6.r1(T1, org.telegram.ui.ActionBar.n6.w0(i7, d0Var.J0)));
                d0Var2.draw(canvas);
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
                org.telegram.ui.Cells.u2 u2Var = (org.telegram.ui.Cells.u2) this.b;
                u2Var.o4.setBounds(0, 0, getWidth(), getHeight());
                u2Var.o4.draw(canvas);
                break;
            case 18:
                if (((cr) this.b).V1) {
                    canvas.drawRect(r2.u0, 0.0f, getMeasuredWidth() - r2.u0, 1.0f, org.telegram.ui.ActionBar.n6.k0);
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
                mo0 mo0Var = (mo0) this.b;
                mo0Var.getClass();
                if (S0 != 0) {
                    mo0Var.h = new LinearGradient(0.0f, 0.0f, getMeasuredWidth(), 0.0f, new int[]{S0, S02}, (float[]) null, Shader.TileMode.CLAMP);
                    mo0Var.n.setShader(mo0Var.h);
                }
                mo0Var.r.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                canvas.drawRoundRect(mo0Var.r, org.telegram.messenger.g0.L(18.0f), org.telegram.messenger.g0.L(18.0f), mo0Var.n);
                break;
            case 27:
                au0 au0Var = (au0) this.b;
                if (au0Var.b != null && !au0Var.K) {
                    Drawable newDrawable = au0Var.getNewDrawable();
                    boolean newDrawableMotion = au0Var.getNewDrawableMotion();
                    float f15 = 0.0f;
                    if (newDrawable != au0Var.b && newDrawable != null) {
                        if (org.telegram.ui.ActionBar.n6.h1()) {
                            au0Var.d = au0Var.b;
                            au0Var.e = au0Var.c;
                        }
                        if (newDrawable instanceof bb0) {
                            ((bb0) newDrawable).q(au0Var.M);
                        }
                        au0Var.b = newDrawable;
                        if (au0Var.N && (newDrawable instanceof en)) {
                            ((en) newDrawable).f(this);
                        }
                        if (au0Var.N) {
                            Drawable drawable2 = au0Var.b;
                            if (drawable2 instanceof bb0) {
                                ((bb0) drawable2).k();
                            }
                        }
                        au0Var.c = newDrawableMotion;
                        au0Var.U = 0.0f;
                        au0Var.T(au0Var.b);
                        au0Var.G();
                    } else if (au0Var.c != newDrawableMotion) {
                        au0Var.c = newDrawableMotion;
                        au0Var.G();
                    }
                    float f16 = 1.0f;
                    au0Var.U = Utilities.i((org.telegram.messenger.g0.t / 200.0f) + au0Var.U, 1.0f, 0.0f);
                    int i10 = 0;
                    while (i10 < 2) {
                        Drawable drawable3 = i10 == 0 ? au0Var.d : au0Var.b;
                        if (drawable3 == null) {
                            f13 = f16;
                        } else {
                            if (i10 != 1 || au0Var.d == null || au0Var.H == null) {
                                drawable3.setAlpha(ks.e4);
                            } else {
                                drawable3.setAlpha((int) (au0Var.U * 255.0f));
                            }
                            if (i10 == 0 ? au0Var.e : au0Var.c) {
                                f10 = au0Var.E;
                                f11 = au0Var.x;
                                f12 = au0Var.y;
                            } else {
                                f10 = f16;
                                f11 = f15;
                                f12 = f11;
                            }
                            if (drawable3 instanceof bb0) {
                                bb0 bb0Var = (bb0) drawable3;
                                if (bb0Var.u != null) {
                                    int currentActionBarHeight = (au0Var.O() ? org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() : 0) + ((au0Var.P() && au0Var.s) ? org.telegram.messenger.g0.m : 0);
                                    int measuredHeight = au0Var.W() ? getRootView().getMeasuredHeight() - currentActionBarHeight : getHeight();
                                    f13 = f16;
                                    float max2 = Math.max(getMeasuredWidth() / drawable3.getIntrinsicWidth(), measuredHeight / drawable3.getIntrinsicHeight());
                                    int ceil = (int) Math.ceil(drawable3.getIntrinsicWidth() * max2 * f10);
                                    int ceil2 = (int) Math.ceil(drawable3.getIntrinsicHeight() * max2 * f10);
                                    int measuredWidth = ((getMeasuredWidth() - ceil) / 2) + ((int) f11);
                                    int i11 = ((measuredHeight - ceil2) / 2) + au0Var.F + currentActionBarHeight + ((int) f12);
                                    canvas.save();
                                    canvas.clipRect(0, currentActionBarHeight, ceil, getMeasuredHeight() - au0Var.h);
                                    drawable3.setBounds(measuredWidth, i11, ceil + measuredWidth, ceil2 + i11);
                                    drawable3.draw(canvas);
                                    au0.F(au0Var, canvas);
                                    canvas.restore();
                                } else {
                                    f13 = f16;
                                    if (au0Var.h != 0) {
                                        canvas.save();
                                        canvas.clipRect(0, 0, getMeasuredWidth(), getRootView().getMeasuredHeight() - au0Var.h);
                                    }
                                    bb0Var.f = au0Var.F;
                                    drawable3.setBounds(0, 0, getMeasuredWidth(), (int) ((getRootView().getMeasuredHeight() - au0Var.F) + f12));
                                    drawable3.draw(canvas);
                                    if (au0Var.h != 0) {
                                        canvas.restore();
                                    }
                                }
                            } else {
                                f13 = f16;
                                if (drawable3 instanceof ColorDrawable) {
                                    if (au0Var.h != 0) {
                                        canvas.save();
                                        canvas.clipRect(0, 0, getMeasuredWidth(), getMeasuredHeight() - au0Var.h);
                                    }
                                    drawable3.setBounds(0, 0, getMeasuredWidth(), getRootView().getMeasuredHeight());
                                    drawable3.draw(canvas);
                                    au0.F(au0Var, canvas);
                                    if (au0Var.h != 0) {
                                        canvas.restore();
                                    }
                                } else if (drawable3 instanceof GradientDrawable) {
                                    if (au0Var.h != 0) {
                                        canvas.save();
                                        canvas.clipRect(0, 0, getMeasuredWidth(), getRootView().getMeasuredHeight() - au0Var.h);
                                    }
                                    drawable3.setBounds(0, au0Var.F, getMeasuredWidth(), getRootView().getMeasuredHeight() + au0Var.F);
                                    drawable3.draw(canvas);
                                    au0.F(au0Var, canvas);
                                    if (au0Var.h != 0) {
                                        canvas.restore();
                                    }
                                } else if (!(drawable3 instanceof BitmapDrawable)) {
                                    if (au0Var.h != 0) {
                                        canvas.save();
                                        canvas.clipRect(0, 0, getMeasuredWidth(), getRootView().getMeasuredHeight() - au0Var.h);
                                    }
                                    if (drawable3 instanceof en) {
                                        en enVar = (en) drawable3;
                                        enVar.b = this;
                                        bb0 bb0Var2 = enVar.f;
                                        if (bb0Var2 != null) {
                                            bb0Var2.q(this);
                                        }
                                    }
                                    float f17 = f10 - f13;
                                    float f18 = a8.p0.f(-getMeasuredWidth(), f17, 2.0f, f11);
                                    float f19 = a8.p0.f(-getRootView().getMeasuredHeight(), f17, 2.0f, f12);
                                    drawable3.setBounds((int) f18, (int) (au0Var.F + f19), (int) ((getMeasuredWidth() * f10) + f18), (int) p5.c.e(getRootView().getMeasuredHeight(), f10, au0Var.F, f19));
                                    drawable3.draw(canvas);
                                    au0.F(au0Var, canvas);
                                    if (au0Var.h != 0) {
                                        canvas.restore();
                                    }
                                } else if (((BitmapDrawable) drawable3).getTileModeX() == Shader.TileMode.REPEAT) {
                                    canvas.save();
                                    float f20 = 2.0f / org.telegram.messenger.g0.p;
                                    canvas.scale(f20, f20);
                                    drawable3.setBounds(0, 0, (int) Math.ceil(getMeasuredWidth() / f20), (int) Math.ceil(getRootView().getMeasuredHeight() / f20));
                                    drawable3.draw(canvas);
                                    au0.F(au0Var, canvas);
                                    canvas.restore();
                                } else {
                                    int currentActionBarHeight2 = (au0Var.O() ? org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() : 0) + ((au0Var.P() && au0Var.s) ? org.telegram.messenger.g0.m : 0);
                                    int measuredHeight2 = au0Var.W() ? getRootView().getMeasuredHeight() - currentActionBarHeight2 : getHeight();
                                    float max3 = Math.max(getMeasuredWidth() / drawable3.getIntrinsicWidth(), measuredHeight2 / drawable3.getIntrinsicHeight());
                                    int ceil3 = (int) Math.ceil(drawable3.getIntrinsicWidth() * max3 * f10);
                                    int ceil4 = (int) Math.ceil(drawable3.getIntrinsicHeight() * max3 * f10);
                                    int measuredWidth2 = ((getMeasuredWidth() - ceil3) / 2) + ((int) f11);
                                    int i12 = ((measuredHeight2 - ceil4) / 2) + au0Var.F + currentActionBarHeight2 + ((int) f12);
                                    canvas.save();
                                    canvas.clipRect(0, currentActionBarHeight2, ceil3, getMeasuredHeight() - au0Var.h);
                                    drawable3.setBounds(measuredWidth2, i12, ceil3 + measuredWidth2, ceil4 + i12);
                                    drawable3.draw(canvas);
                                    au0.F(au0Var, canvas);
                                    canvas.restore();
                                }
                            }
                            if (i10 == 0 && (drawable = au0Var.d) != null && au0Var.U >= f13) {
                                if (au0Var.N && (drawable instanceof en)) {
                                    ((en) drawable).g(au0Var.M);
                                }
                                if (au0Var.N) {
                                    Drawable drawable4 = au0Var.d;
                                    if (drawable4 instanceof bb0) {
                                        ((bb0) drawable4).l();
                                    }
                                }
                                au0Var.d = null;
                                au0Var.e = false;
                                au0Var.G();
                                au0Var.M.invalidate();
                            }
                        }
                        i10++;
                        f16 = f13;
                        f15 = 0.0f;
                    }
                    if (au0Var.U != f16) {
                        au0Var.M.invalidate();
                        break;
                    }
                }
                break;
            case 29:
                super.onDraw(canvas);
                int x02 = org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.Mj, false);
                rw0 rw0Var = (rw0) this.b;
                org.telegram.ui.Components.voip.n nVar = rw0Var.M;
                Paint paint2 = rw0Var.a;
                paint2.setColor(x02);
                Paint paint3 = rw0Var.b;
                paint3.setColor(x02);
                Paint paint4 = rw0Var.c;
                paint4.setColor(x02);
                paint3.setAlpha(ks.e4);
                paint4.setAlpha(82);
                paint2.setAlpha(46);
                Paint paint5 = rw0Var.d;
                paint5.setColor(org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.d6, false));
                canvas.drawLine(org.telegram.messenger.g0.L(24.0f), org.telegram.messenger.g0.L(20.0f), getMeasuredWidth() - org.telegram.messenger.g0.L(24.0f), org.telegram.messenger.g0.L(20.0f), paint2);
                boolean z10 = rw0Var.e;
                if (z10 || rw0Var.K != 0.0f) {
                    if (!z10) {
                        float f21 = rw0Var.K - 0.10666667f;
                        rw0Var.K = f21;
                        if (f21 < 0.0f) {
                            rw0Var.K = 0.0f;
                        }
                    } else if (rw0Var.L) {
                        float f22 = rw0Var.K + 0.024615385f;
                        rw0Var.K = f22;
                        if (f22 > 1.0f) {
                            rw0Var.K = 1.0f;
                            rw0Var.L = false;
                        }
                    } else {
                        float f23 = rw0Var.K - 0.024615385f;
                        rw0Var.K = f23;
                        if (f23 < 0.0f) {
                            rw0Var.K = 0.0f;
                            rw0Var.L = true;
                        }
                    }
                    invalidate();
                    RectF rectF = org.telegram.messenger.g0.P;
                    rectF.set(org.telegram.messenger.g0.L(24.0f), org.telegram.messenger.g0.L(17.0f), getMeasuredWidth() - org.telegram.messenger.g0.L(24.0f), org.telegram.messenger.g0.L(23.0f));
                    nVar.f = getMeasuredWidth();
                    nVar.a(org.telegram.messenger.g0.L(3.0f), canvas, rectF, null);
                }
                int L2 = org.telegram.messenger.g0.L(24.0f);
                if (rw0Var.e) {
                    f14 = 1.0f;
                    paint = paint5;
                } else {
                    int L3 = org.telegram.messenger.g0.L(24.0f) + ((int) (n10.B(24.0f, 2, getMeasuredWidth()) * rw0Var.G));
                    f14 = 1.0f;
                    canvas.drawLine(L2, org.telegram.messenger.g0.L(20.0f), org.telegram.messenger.g0.L(24.0f) + r2, org.telegram.messenger.g0.L(20.0f), paint4);
                    canvas.drawRect(L3, org.telegram.messenger.g0.L(20.0f) - org.telegram.messenger.g0.L(3.0f), org.telegram.messenger.g0.L(3.0f) + L3, org.telegram.messenger.g0.L(3.0f) + org.telegram.messenger.g0.L(20.0f), paint5);
                    paint = paint5;
                }
                if (!rw0Var.e) {
                    int B = (int) (n10.B(24.0f, 2, getMeasuredWidth()) * rw0Var.F);
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
                ki.k kVar2 = (ki.k) this.b;
                if (kVar2.I) {
                    int i15 = kVar2.J;
                    kVar = ((org.telegram.ui.ActionBar.h2) kVar2).actionBar;
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
                v4.c0 c0Var = ((org.telegram.ui.n5) this.b).d.G;
                super.onMeasure(i7, View.MeasureSpec.makeMeasureSpec(Math.max(0, c0Var instanceof wy ? ((wy) c0Var).J : 0), TLObject.FLAG_30));
                break;
            case 14:
                sa saVar = (sa) this.b;
                int i16 = saVar.r1;
                int L4 = (i16 == 0 ? org.telegram.messenger.g0.L(300.0f) : (int) (i16 * saVar.v1)) - (((saVar.B1 - saVar.C1) - saVar.D1) - saVar.E1);
                if (L4 < 1) {
                    L4 = 1;
                }
                super.onMeasure(i7, View.MeasureSpec.makeMeasureSpec(L4, TLObject.FLAG_30));
                break;
            case 15:
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i7), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(((hm) this.b).w.K, TLObject.FLAG_30));
                break;
            case 16:
                setMeasuredDimension(View.MeasureSpec.getSize(i7), ((rn) ((org.telegram.ui.l4) this.b).e).S0);
                break;
            case 17:
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i7), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(((sn) ((org.telegram.ui.y7) this.b).d).x, TLObject.FLAG_30));
                break;
            case 19:
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(getPaddingRight() + getPaddingLeft() + Math.round(((vy0) this.b).k()), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(Math.max(getPaddingBottom() + getPaddingTop() + Math.round(((vy0) this.b).i()), org.telegram.messenger.g0.L(26.0f)), TLObject.FLAG_30));
                break;
            case 20:
                super.onMeasure(i7, View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(48.0f) + ((b60) this.b).c.j2, TLObject.FLAG_30));
                break;
            case 21:
                int L5 = org.telegram.messenger.g0.L(48.0f);
                j60 j60Var = ((d60) this.b).n;
                super.onMeasure(i7, View.MeasureSpec.makeMeasureSpec(L5 + j60Var.j2 + j60Var.p2, TLObject.FLAG_30));
                break;
            case 24:
                super.onMeasure(i7, View.MeasureSpec.makeMeasureSpec(((vo0) this.b).L.F1.R, TLObject.FLAG_30));
                break;
            case 26:
                setMeasuredDimension(View.MeasureSpec.getSize(i7), ((qt0) this.b).getMeasuredHeight());
                break;
            case 28:
                zu0 zu0Var = (zu0) this.b;
                int size = View.MeasureSpec.getSize(i7);
                if (size <= 0) {
                    size = ((View) getParent()).getMeasuredWidth();
                }
                int size2 = View.MeasureSpec.getSize(i10) - org.telegram.messenger.g0.L(4.0f);
                iv0 iv0Var = zu0Var.d;
                int i17 = iv0Var.o3;
                int max = Math.max(i17 > 0 ? org.telegram.messenger.g0.L(4.0f) + i17 : 0, (int) (size - Math.min(org.telegram.messenger.g0.L(4.0f) + ((zu0Var.b() - 1) * size2), zu0Var.d.f3 * size2)));
                iv0Var.n3 = max;
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
                if (((h3) this.b) != null) {
                    if (isAttachedToWindow()) {
                        h3 h3Var = (h3) this.b;
                        if (h3Var.i) {
                            h3Var.i = false;
                            h3Var.a();
                            ai.g0 g0Var = h3Var.h;
                            HashSet hashSet = pc.n;
                            if (hashSet != null) {
                                hashSet.remove(g0Var);
                            }
                        }
                    }
                    this.b = null;
                }
                super.setBackground(drawable);
                if (drawable instanceof h3) {
                    this.b = (h3) drawable;
                    if (isAttachedToWindow()) {
                        h3 h3Var2 = (h3) this.b;
                        if (!h3Var2.i) {
                            h3Var2.i = true;
                            h3Var2.a();
                            ai.g0 g0Var2 = new ai.g0(h3Var2, 1);
                            h3Var2.h = g0Var2;
                            pc.a(g0Var2);
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
                sa saVar = (sa) this.b;
                int i7 = sa.S1;
                saVar.b.invalidate();
                break;
            default:
                super.setTranslationY(f10);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i3(Context context, int i7) {
        super(context);
        this.a = i7;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i3(sa saVar, Context context) {
        super(context);
        this.a = 14;
        this.b = saVar;
        setTag(-33024);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i3(Context context, org.telegram.ui.ActionBar.i6 i6Var) {
        super(context);
        this.a = 10;
        CheckBoxBase checkBoxBase = new CheckBoxBase(20, this, i6Var);
        this.b = checkBoxBase;
        checkBoxBase.h(org.telegram.ui.ActionBar.n6.Yl, org.telegram.ui.ActionBar.n6.z5, org.telegram.ui.ActionBar.n6.k7);
        checkBoxBase.d(10);
        checkBoxBase.k(true);
        checkBoxBase.i(org.telegram.messenger.g0.L(5.0f));
    }
}
