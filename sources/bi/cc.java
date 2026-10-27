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
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.wh;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.Components.CheckBoxBase;
import org.telegram.ui.Components.b10;
import org.telegram.ui.Components.cy0;
import org.telegram.ui.Components.eo;
import org.telegram.ui.Components.ho;
import org.telegram.ui.Components.jr0;
import org.telegram.ui.Components.mw0;
import org.telegram.ui.Components.mz0;
import org.telegram.ui.Components.nr0;
import org.telegram.ui.Components.r11;
import org.telegram.ui.Components.t70;
import org.telegram.ui.Components.tm;
import org.telegram.ui.Components.tr;
import org.telegram.ui.Components.tx0;
import org.telegram.ui.Components.v70;
import org.telegram.ui.Components.vc0;
import org.telegram.ui.Components.ww0;
import org.telegram.ui.Components.yz;
import org.telegram.ui.Components.z70;
import org.telegram.ui.Components.zq0;
import org.telegram.ui.ey;
import org.telegram.ui.xt0;
import org.telegram.ui.zn;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes4.dex */
public final class cc extends View {
    public final /* synthetic */ int a;
    public Object b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ cc(Context context) {
        super(context);
        this.a = 17;
    }

    @Override // android.view.View
    public void dispatchDraw(Canvas canvas) {
        switch (this.a) {
            case 1:
                canvas.save();
                fi.sb sbVar = (fi.sb) this.b;
                canvas.translate(sbVar.c1.getX() + sbVar.l0.getX(), sbVar.c1.getY() + sbVar.l0.getY());
                fi.ib ibVar = sbVar.c1;
                ibVar.k(canvas, ibVar.getBounds(), sbVar.c1.getOver2Alpha());
                canvas.restore();
                break;
            case 6:
                ch.c cVar = ((jh.f) this.b).I;
                if (cVar != null) {
                    cVar.draw(canvas);
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
            case 17:
                super.draw(canvas);
                ((r11) this.b).e(canvas, (getMeasuredWidth() - ((r11) this.b).l()) / 2.0f, getMeasuredHeight() / 2.0f);
                break;
            case 21:
                super.draw(canvas);
                nr0 nr0Var = (nr0) this.b;
                nr0Var.W0.setBounds(0, (getMeasuredHeight() - nr0Var.H0.d) - AndroidUtilities.dp(72.0f), getMeasuredWidth(), getMeasuredHeight());
                nr0Var.W0.draw(canvas);
                break;
            default:
                super.draw(canvas);
                break;
        }
    }

    @Override // android.view.View
    public void invalidate() {
        switch (this.a) {
            case 25:
                super.invalidate();
                ((ww0) this.b).S();
                break;
            default:
                super.invalidate();
                break;
        }
    }

    @Override // android.view.View
    public void onAttachedToWindow() {
        switch (this.a) {
            case 4:
                super.onAttachedToWindow();
                ((ig.p1) this.b).f = true;
                break;
            case 8:
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
            case 4:
                super.onDetachedFromWindow();
                ((ig.p1) this.b).f = false;
                break;
            case 8:
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
        int i10;
        int i11;
        float f7;
        float f10;
        float f11;
        float f12;
        Drawable drawable;
        float f13;
        Paint paint;
        switch (this.a) {
            case 5:
                super.onDraw(canvas);
                ii.j0 j0Var = (ii.j0) this.b;
                ag.h0 h0Var = j0Var.K;
                float max = Math.max(j0Var.b.e, j0Var.c.e);
                ag.h0 h0Var2 = j0Var.J;
                h0Var2.c(AndroidUtilities.dp(42.0f) + j0Var.U.b, 0);
                h0Var2.setBounds(0, 0, getWidth(), AndroidUtilities.dp(56.0f) + j0Var.U.b);
                int i12 = org.telegram.ui.ActionBar.y6.a7;
                h0Var2.b(org.telegram.ui.ActionBar.y6.o1(AndroidUtilities.lerp(1.0f, 0.8f, max), j0Var.getThemedColor(i12)));
                h0Var2.draw(canvas);
                if (j0Var.N) {
                    max = 1.0f;
                }
                int lerp = AndroidUtilities.lerp(AndroidUtilities.dp(48.0f) + j0Var.U.d, 0, max);
                int lerp2 = AndroidUtilities.lerp(AndroidUtilities.dp(72.0f), 0, max) + j0Var.U.d;
                float lerp3 = AndroidUtilities.lerp(0.8f, AndroidUtilities.getNavigationBarThirdButtonsFactor(j0Var.U.d), max);
                h0Var.c(0, lerp);
                h0Var.setBounds(0, getHeight() - lerp2, getWidth(), getHeight());
                h0Var.b(org.telegram.ui.ActionBar.y6.o1(lerp3, j0Var.getThemedColor(i12)));
                h0Var.draw(canvas);
                break;
            case 7:
                canvas.save();
                canvas.translate(AndroidUtilities.dpf2(22.6f), AndroidUtilities.dpf2(21.66f));
                ((li.s0) this.b).c.draw(canvas);
                canvas.restore();
                break;
            case 8:
                int dp = AndroidUtilities.dp(20.0f);
                int width = (getWidth() - dp) / 2;
                int height = (getHeight() - dp) / 2;
                CheckBoxBase checkBoxBase = (CheckBoxBase) this.b;
                checkBoxBase.e(width, height, dp, dp);
                checkBoxBase.a(canvas);
                break;
            case 11:
                org.telegram.ui.Cells.p2 p2Var = (org.telegram.ui.Cells.p2) this.b;
                p2Var.n4.setBounds(0, 0, getWidth(), getHeight());
                p2Var.n4.draw(canvas);
                break;
            case 16:
                tr trVar = (tr) this.b;
                if (trVar.Z) {
                    i10 = ((org.telegram.ui.ActionBar.k3) trVar).backgroundPaddingLeft;
                    int measuredWidth = getMeasuredWidth();
                    i11 = ((org.telegram.ui.ActionBar.k3) trVar).backgroundPaddingLeft;
                    canvas.drawRect(i10, 0.0f, measuredWidth - i11, 1.0f, org.telegram.ui.ActionBar.y6.k0);
                    break;
                }
                break;
            case 20:
                super.onDraw(canvas);
                ((xt0) this.b).j(canvas, getMeasuredWidth(), getMeasuredHeight());
                break;
            case 23:
                super.onDraw(canvas);
                int offsetColor = AndroidUtilities.getOffsetColor(-9057429, -10513163, getTranslationX() / getMeasuredWidth(), 1.0f);
                int offsetColor2 = AndroidUtilities.getOffsetColor(-11554882, -4629871, getTranslationX() / getMeasuredWidth(), 1.0f);
                zq0 zq0Var = (zq0) this.b;
                RectF rectF = zq0Var.n;
                Paint paint2 = zq0Var.h;
                if (offsetColor != 0) {
                    paint2.setShader(new LinearGradient(0.0f, 0.0f, getMeasuredWidth(), 0.0f, new int[]{offsetColor, offsetColor2}, (float[]) null, Shader.TileMode.CLAMP));
                }
                rectF.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                canvas.drawRoundRect(rectF, AndroidUtilities.dp(18.0f), AndroidUtilities.dp(18.0f), paint2);
                break;
            case 25:
                ww0 ww0Var = (ww0) this.b;
                if (ww0Var.b != null && !ww0Var.J) {
                    Drawable newDrawable = ww0Var.getNewDrawable();
                    boolean newDrawableMotion = ww0Var.getNewDrawableMotion();
                    float f14 = 0.0f;
                    if (newDrawable != ww0Var.b && newDrawable != null) {
                        if (org.telegram.ui.ActionBar.y6.g1()) {
                            ww0Var.d = ww0Var.b;
                            ww0Var.e = ww0Var.c;
                        }
                        if (newDrawable instanceof vc0) {
                            ((vc0) newDrawable).q(ww0Var.L);
                        }
                        ww0Var.b = newDrawable;
                        if (ww0Var.M && (newDrawable instanceof zn)) {
                            ((zn) newDrawable).f(this);
                        }
                        if (ww0Var.M) {
                            Drawable drawable2 = ww0Var.b;
                            if (drawable2 instanceof vc0) {
                                ((vc0) drawable2).k();
                            }
                        }
                        ww0Var.c = newDrawableMotion;
                        ww0Var.c0 = 0.0f;
                        ww0Var.T(ww0Var.b);
                        ww0Var.G();
                    } else if (ww0Var.c != newDrawableMotion) {
                        ww0Var.c = newDrawableMotion;
                        ww0Var.G();
                    }
                    float f15 = 1.0f;
                    ww0Var.c0 = Utilities.clamp((AndroidUtilities.screenRefreshTime / 200.0f) + ww0Var.c0, 1.0f, 0.0f);
                    int i13 = 0;
                    while (i13 < 2) {
                        Drawable drawable3 = i13 == 0 ? ww0Var.d : ww0Var.b;
                        if (drawable3 == null) {
                            f12 = f15;
                        } else {
                            if (i13 != 1 || ww0Var.d == null || ww0Var.G == null) {
                                drawable3.setAlpha(255);
                            } else {
                                drawable3.setAlpha((int) (ww0Var.c0 * 255.0f));
                            }
                            if (i13 == 0 ? ww0Var.e : ww0Var.c) {
                                f7 = ww0Var.y;
                                f10 = ww0Var.w;
                                f11 = ww0Var.x;
                            } else {
                                f7 = f15;
                                f10 = f14;
                                f11 = f10;
                            }
                            if (drawable3 instanceof vc0) {
                                vc0 vc0Var = (vc0) drawable3;
                                if (vc0Var.u != null) {
                                    int currentActionBarHeight = (ww0Var.O() ? org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() : 0) + ((ww0Var.P() && ww0Var.s) ? AndroidUtilities.statusBarHeight : 0);
                                    int measuredHeight = ww0Var.W() ? getRootView().getMeasuredHeight() - currentActionBarHeight : getHeight();
                                    f12 = f15;
                                    float max2 = Math.max(getMeasuredWidth() / drawable3.getIntrinsicWidth(), measuredHeight / drawable3.getIntrinsicHeight());
                                    int ceil = (int) Math.ceil(drawable3.getIntrinsicWidth() * max2 * f7);
                                    int ceil2 = (int) Math.ceil(drawable3.getIntrinsicHeight() * max2 * f7);
                                    int measuredWidth2 = ((getMeasuredWidth() - ceil) / 2) + ((int) f10);
                                    int i14 = ((measuredHeight - ceil2) / 2) + ww0Var.E + currentActionBarHeight + ((int) f11);
                                    canvas.save();
                                    canvas.clipRect(0, currentActionBarHeight, ceil, getMeasuredHeight() - ww0Var.h);
                                    drawable3.setBounds(measuredWidth2, i14, ceil + measuredWidth2, ceil2 + i14);
                                    drawable3.draw(canvas);
                                    ww0.F(ww0Var, canvas);
                                    canvas.restore();
                                } else {
                                    f12 = f15;
                                    if (ww0Var.h != 0) {
                                        canvas.save();
                                        canvas.clipRect(0, 0, getMeasuredWidth(), getRootView().getMeasuredHeight() - ww0Var.h);
                                    }
                                    vc0Var.f = ww0Var.E;
                                    drawable3.setBounds(0, 0, getMeasuredWidth(), (int) ((getRootView().getMeasuredHeight() - ww0Var.E) + f11));
                                    drawable3.draw(canvas);
                                    if (ww0Var.h != 0) {
                                        canvas.restore();
                                    }
                                }
                            } else {
                                f12 = f15;
                                if (drawable3 instanceof ColorDrawable) {
                                    if (ww0Var.h != 0) {
                                        canvas.save();
                                        canvas.clipRect(0, 0, getMeasuredWidth(), getMeasuredHeight() - ww0Var.h);
                                    }
                                    drawable3.setBounds(0, 0, getMeasuredWidth(), getRootView().getMeasuredHeight());
                                    drawable3.draw(canvas);
                                    ww0.F(ww0Var, canvas);
                                    if (ww0Var.h != 0) {
                                        canvas.restore();
                                    }
                                } else if (drawable3 instanceof GradientDrawable) {
                                    if (ww0Var.h != 0) {
                                        canvas.save();
                                        canvas.clipRect(0, 0, getMeasuredWidth(), getRootView().getMeasuredHeight() - ww0Var.h);
                                    }
                                    drawable3.setBounds(0, ww0Var.E, getMeasuredWidth(), getRootView().getMeasuredHeight() + ww0Var.E);
                                    drawable3.draw(canvas);
                                    ww0.F(ww0Var, canvas);
                                    if (ww0Var.h != 0) {
                                        canvas.restore();
                                    }
                                } else if (!(drawable3 instanceof BitmapDrawable)) {
                                    if (ww0Var.h != 0) {
                                        canvas.save();
                                        canvas.clipRect(0, 0, getMeasuredWidth(), getRootView().getMeasuredHeight() - ww0Var.h);
                                    }
                                    if (drawable3 instanceof zn) {
                                        zn znVar = (zn) drawable3;
                                        znVar.b = this;
                                        vc0 vc0Var2 = znVar.f;
                                        if (vc0Var2 != null) {
                                            vc0Var2.q(this);
                                        }
                                    }
                                    float f16 = f7 - f12;
                                    float C = a1.g.C(-getMeasuredWidth(), f16, 2.0f, f10);
                                    float C2 = a1.g.C(-getRootView().getMeasuredHeight(), f16, 2.0f, f11);
                                    drawable3.setBounds((int) C, (int) (ww0Var.E + C2), (int) ((getMeasuredWidth() * f7) + C), (int) b10.e(getRootView().getMeasuredHeight(), f7, ww0Var.E, C2));
                                    drawable3.draw(canvas);
                                    ww0.F(ww0Var, canvas);
                                    if (ww0Var.h != 0) {
                                        canvas.restore();
                                    }
                                } else if (((BitmapDrawable) drawable3).getTileModeX() == Shader.TileMode.REPEAT) {
                                    canvas.save();
                                    float f17 = 2.0f / AndroidUtilities.density;
                                    canvas.scale(f17, f17);
                                    drawable3.setBounds(0, 0, (int) Math.ceil(getMeasuredWidth() / f17), (int) Math.ceil(getRootView().getMeasuredHeight() / f17));
                                    drawable3.draw(canvas);
                                    ww0.F(ww0Var, canvas);
                                    canvas.restore();
                                } else {
                                    int currentActionBarHeight2 = (ww0Var.O() ? org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() : 0) + ((ww0Var.P() && ww0Var.s) ? AndroidUtilities.statusBarHeight : 0);
                                    int measuredHeight2 = ww0Var.W() ? getRootView().getMeasuredHeight() - currentActionBarHeight2 : getHeight();
                                    float max3 = Math.max(getMeasuredWidth() / drawable3.getIntrinsicWidth(), measuredHeight2 / drawable3.getIntrinsicHeight());
                                    int ceil3 = (int) Math.ceil(drawable3.getIntrinsicWidth() * max3 * f7);
                                    int ceil4 = (int) Math.ceil(drawable3.getIntrinsicHeight() * max3 * f7);
                                    int measuredWidth3 = ((getMeasuredWidth() - ceil3) / 2) + ((int) f10);
                                    int i15 = ((measuredHeight2 - ceil4) / 2) + ww0Var.E + currentActionBarHeight2 + ((int) f11);
                                    canvas.save();
                                    canvas.clipRect(0, currentActionBarHeight2, ceil3, getMeasuredHeight() - ww0Var.h);
                                    drawable3.setBounds(measuredWidth3, i15, ceil3 + measuredWidth3, ceil4 + i15);
                                    drawable3.draw(canvas);
                                    ww0.F(ww0Var, canvas);
                                    canvas.restore();
                                }
                            }
                            if (i13 == 0 && (drawable = ww0Var.d) != null && ww0Var.c0 >= f12) {
                                if (ww0Var.M && (drawable instanceof zn)) {
                                    ((zn) drawable).g(ww0Var.L);
                                }
                                if (ww0Var.M) {
                                    Drawable drawable4 = ww0Var.d;
                                    if (drawable4 instanceof vc0) {
                                        ((vc0) drawable4).l();
                                    }
                                }
                                ww0Var.d = null;
                                ww0Var.e = false;
                                ww0Var.G();
                                ww0Var.L.invalidate();
                            }
                        }
                        i13++;
                        f15 = f12;
                        f14 = 0.0f;
                    }
                    if (ww0Var.c0 != f15) {
                        ww0Var.L.invalidate();
                        break;
                    }
                }
                break;
            case 27:
                super.onDraw(canvas);
                int x02 = org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.Vi, false);
                mz0 mz0Var = (mz0) this.b;
                org.telegram.ui.Components.voip.h hVar = mz0Var.L;
                Paint paint3 = mz0Var.a;
                paint3.setColor(x02);
                Paint paint4 = mz0Var.b;
                paint4.setColor(x02);
                Paint paint5 = mz0Var.c;
                paint5.setColor(x02);
                paint4.setAlpha(255);
                paint5.setAlpha(82);
                paint3.setAlpha(46);
                Paint paint6 = mz0Var.d;
                paint6.setColor(org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.d6, false));
                canvas.drawLine(AndroidUtilities.dp(24.0f), AndroidUtilities.dp(20.0f), getMeasuredWidth() - AndroidUtilities.dp(24.0f), AndroidUtilities.dp(20.0f), paint3);
                boolean z10 = mz0Var.e;
                if (z10 || mz0Var.J != 0.0f) {
                    if (!z10) {
                        float f18 = mz0Var.J - 0.10666667f;
                        mz0Var.J = f18;
                        if (f18 < 0.0f) {
                            mz0Var.J = 0.0f;
                        }
                    } else if (mz0Var.K) {
                        float f19 = mz0Var.J + 0.024615385f;
                        mz0Var.J = f19;
                        if (f19 > 1.0f) {
                            mz0Var.J = 1.0f;
                            mz0Var.K = false;
                        }
                    } else {
                        float f20 = mz0Var.J - 0.024615385f;
                        mz0Var.J = f20;
                        if (f20 < 0.0f) {
                            mz0Var.J = 0.0f;
                            mz0Var.K = true;
                        }
                    }
                    invalidate();
                    RectF rectF2 = AndroidUtilities.rectTmp;
                    rectF2.set(AndroidUtilities.dp(24.0f), AndroidUtilities.dp(17.0f), getMeasuredWidth() - AndroidUtilities.dp(24.0f), AndroidUtilities.dp(23.0f));
                    hVar.f = getMeasuredWidth();
                    hVar.a(AndroidUtilities.dp(3.0f), canvas, rectF2, null);
                }
                int dp2 = AndroidUtilities.dp(24.0f);
                if (mz0Var.e) {
                    f13 = 1.0f;
                    paint = paint6;
                } else {
                    int dp3 = AndroidUtilities.dp(24.0f) + ((int) (wh.C(24.0f, 2, getMeasuredWidth()) * mz0Var.F));
                    f13 = 1.0f;
                    canvas.drawLine(dp2, AndroidUtilities.dp(20.0f), AndroidUtilities.dp(24.0f) + r2, AndroidUtilities.dp(20.0f), paint5);
                    canvas.drawRect(dp3, AndroidUtilities.dp(20.0f) - AndroidUtilities.dp(3.0f), AndroidUtilities.dp(3.0f) + dp3, AndroidUtilities.dp(3.0f) + AndroidUtilities.dp(20.0f), paint6);
                    paint = paint6;
                }
                if (!mz0Var.e) {
                    int C3 = (int) (wh.C(24.0f, 2, getMeasuredWidth()) * mz0Var.E);
                    if (C3 < AndroidUtilities.dp(f13)) {
                        C3 = AndroidUtilities.dp(f13);
                    }
                    int dp4 = AndroidUtilities.dp(24.0f) + C3;
                    canvas.drawLine(dp2, AndroidUtilities.dp(20.0f), AndroidUtilities.dp(24.0f) + C3, AndroidUtilities.dp(20.0f), paint4);
                    canvas.drawRect(dp4, AndroidUtilities.dp(20.0f) - AndroidUtilities.dp(3.0f), AndroidUtilities.dp(3.0f) + dp4, AndroidUtilities.dp(3.0f) + AndroidUtilities.dp(20.0f), paint);
                    break;
                }
                break;
            case 28:
                if (getAlpha() != 0.0f) {
                    RectF rectF3 = AndroidUtilities.rectTmp;
                    rectF3.set(0.0f, 0.0f, getWidth(), getHeight());
                    ((org.telegram.ui.Components.voip.i1) this.b).n.a(AndroidUtilities.dp(10.0f), canvas, rectF3, null);
                    invalidate();
                    break;
                }
                break;
            default:
                super.onDraw(canvas);
                break;
        }
    }

    @Override // android.view.View
    public void onMeasure(int i10, int i11) {
        int i12;
        int i13;
        int i14;
        org.telegram.ui.ActionBar.k kVar;
        int i15;
        switch (this.a) {
            case 0:
                dd ddVar = (dd) this.b;
                if (ddVar.H) {
                    i12 = (ddVar.l0().getMeasuredHeight() + ddVar.I) - AndroidUtilities.dp(16.0f);
                } else {
                    int dp = AndroidUtilities.dp(140.0f) + ddVar.I;
                    if (AndroidUtilities.dp(24.0f) + ddVar.y.getMeasuredHeight() > dp) {
                        dp = AndroidUtilities.dp(24.0f) + ddVar.y.getMeasuredHeight();
                    }
                    i12 = dp;
                }
                super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec((int) (i12 - (0 * 2.5f)), TLObject.FLAG_30));
                break;
            case 1:
            case 5:
            case 6:
            case 7:
            case 10:
            case 11:
            case 16:
            case 20:
            case 21:
            case 23:
            case 25:
            default:
                super.onMeasure(i10, i11);
                break;
            case 2:
                gi.h hVar = (gi.h) this.b;
                if (hVar.H) {
                    i13 = (hVar.l0().getMeasuredHeight() + hVar.I) - AndroidUtilities.dp(16.0f);
                } else {
                    int dp2 = AndroidUtilities.dp(140.0f) + hVar.I;
                    if (AndroidUtilities.dp(24.0f) + hVar.y.getMeasuredHeight() > dp2) {
                        dp2 = AndroidUtilities.dp(24.0f) + hVar.y.getMeasuredHeight();
                    }
                    i13 = dp2;
                }
                super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec((int) (i13 - (0 * 2.5f)), TLObject.FLAG_30));
                break;
            case 3:
                hi.k kVar2 = (hi.k) this.b;
                if (kVar2.H) {
                    int i16 = kVar2.I;
                    kVar = ((org.telegram.ui.ActionBar.r2) kVar2).actionBar;
                    i14 = (kVar.getMeasuredHeight() + i16) - AndroidUtilities.dp(16.0f);
                } else {
                    int dp3 = AndroidUtilities.dp(140.0f) + kVar2.I;
                    if (AndroidUtilities.dp(24.0f) + kVar2.y.getMeasuredHeight() > dp3) {
                        dp3 = AndroidUtilities.dp(24.0f) + kVar2.y.getMeasuredHeight();
                    }
                    i14 = dp3;
                }
                super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec((int) (i14 - (0 * 2.5f)), TLObject.FLAG_30));
                break;
            case 4:
                ((View) getParent()).getMeasuredHeight();
                ig.p1 p1Var = (ig.p1) this.b;
                Integer num = p1Var.d;
                if (num != null) {
                    i15 = num.intValue();
                    p1Var.h = i15;
                } else {
                    i15 = 0;
                    p1Var.h = 0;
                }
                super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(i15, TLObject.FLAG_30));
                break;
            case 8:
                setMeasuredDimension(View.MeasureSpec.getSize(i10), AndroidUtilities.dp(24.0f));
                break;
            case 9:
                s4.c0 c0Var = ((org.telegram.ui.r5) this.b).d.F;
                super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(Math.max(0, c0Var instanceof yz ? ((yz) c0Var).J : 0), TLObject.FLAG_30));
                break;
            case 12:
                org.telegram.ui.Components.bb bbVar = (org.telegram.ui.Components.bb) this.b;
                int i17 = bbVar.h;
                int dp4 = (i17 == 0 ? AndroidUtilities.dp(300.0f) : (int) (i17 * bbVar.v)) - (((bbVar.G - bbVar.H) - bbVar.I) - bbVar.J);
                if (dp4 < 1) {
                    dp4 = 1;
                }
                super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(dp4, TLObject.FLAG_30));
                break;
            case 13:
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(((tm) this.b).v.J, TLObject.FLAG_30));
                break;
            case 14:
                setMeasuredDimension(View.MeasureSpec.getSize(i10), ((eo) this.b).d.R0);
                break;
            case 15:
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(((ho) ((org.telegram.ui.c8) this.b).d).w, TLObject.FLAG_30));
                break;
            case 17:
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(getPaddingRight() + getPaddingLeft() + Math.round(((r11) this.b).l()), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(Math.max(getPaddingBottom() + getPaddingTop() + Math.round(((r11) this.b).j()), AndroidUtilities.dp(26.0f)), TLObject.FLAG_30));
                break;
            case 18:
                super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(48.0f) + ((t70) this.b).c.o0, TLObject.FLAG_30));
                break;
            case 19:
                int dp5 = AndroidUtilities.dp(48.0f);
                z70 z70Var = ((v70) this.b).n;
                super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(dp5 + z70Var.o0 + z70Var.u0, TLObject.FLAG_30));
                break;
            case 22:
                super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(((jr0) this.b).K.K.R, TLObject.FLAG_30));
                break;
            case 24:
                setMeasuredDimension(View.MeasureSpec.getSize(i10), ((mw0) this.b).getMeasuredHeight());
                break;
            case 26:
                tx0 tx0Var = (tx0) this.b;
                int size = View.MeasureSpec.getSize(i10);
                if (size <= 0) {
                    size = ((View) getParent()).getMeasuredWidth();
                }
                int size2 = View.MeasureSpec.getSize(i11) - AndroidUtilities.dp(4.0f);
                cy0 cy0Var = tx0Var.d;
                int i18 = cy0Var.o3;
                int max = Math.max(i18 > 0 ? AndroidUtilities.dp(4.0f) + i18 : 0, (int) (size - Math.min(AndroidUtilities.dp(4.0f) + ((tx0Var.h() - 1) * size2), tx0Var.d.f3 * size2)));
                cy0Var.n3 = max;
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(max, TLObject.FLAG_30), i11);
                break;
            case 27:
                super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(40.0f), TLObject.FLAG_30));
                break;
        }
    }

    @Override // android.view.View
    public void onSizeChanged(int i10, int i11, int i12, int i13) {
        switch (this.a) {
            case 28:
                super.onSizeChanged(i10, i11, i12, i13);
                ((org.telegram.ui.Components.voip.i1) this.b).n.f = i10;
                break;
            default:
                super.onSizeChanged(i10, i11, i12, i13);
                break;
        }
    }

    @Override // android.view.View
    public void setAlpha(float f7) {
        switch (this.a) {
            case 10:
                super.setAlpha(f7);
                View view = ((org.telegram.ui.i8) this.b).b.x.fragmentView;
                if (view != null) {
                    view.invalidate();
                    break;
                }
                break;
            case 29:
                super.setAlpha(f7);
                View view2 = ((ey) this.b).fragmentView;
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
            case 23:
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
        ViewGroup viewGroup;
        switch (this.a) {
            case 12:
                super.setTranslationY(f7);
                viewGroup = ((org.telegram.ui.ActionBar.k3) ((org.telegram.ui.Components.bb) this.b)).containerView;
                viewGroup.invalidate();
                break;
            default:
                super.setTranslationY(f7);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ cc(Object obj, Context context, int i10) {
        super(context);
        this.a = i10;
        this.b = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cc(org.telegram.ui.Components.bb bbVar, Context context) {
        super(context);
        this.a = 12;
        this.b = bbVar;
        setTag(-33024);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cc(Context context, org.telegram.ui.ActionBar.u6 u6Var) {
        super(context);
        this.a = 8;
        CheckBoxBase checkBoxBase = new CheckBoxBase(20, this, u6Var);
        this.b = checkBoxBase;
        checkBoxBase.h(org.telegram.ui.ActionBar.y6.hl, org.telegram.ui.ActionBar.y6.z5, org.telegram.ui.ActionBar.y6.k7);
        checkBoxBase.d(10);
        checkBoxBase.k(true);
        checkBoxBase.i(AndroidUtilities.dp(5.0f));
    }
}
