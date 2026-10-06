package ci;

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
import org.telegram.messenger.bi;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.Components.CheckBoxBase;
import org.telegram.ui.Components.br0;
import org.telegram.ui.Components.bw0;
import org.telegram.ui.Components.bz0;
import org.telegram.ui.Components.f11;
import org.telegram.ui.Components.j70;
import org.telegram.ui.Components.jr;
import org.telegram.ui.Components.jx0;
import org.telegram.ui.Components.km;
import org.telegram.ui.Components.l70;
import org.telegram.ui.Components.mw0;
import org.telegram.ui.Components.nq0;
import org.telegram.ui.Components.p70;
import org.telegram.ui.Components.pc0;
import org.telegram.ui.Components.sx0;
import org.telegram.ui.Components.sz;
import org.telegram.ui.Components.vn;
import org.telegram.ui.Components.xq0;
import org.telegram.ui.Components.yn;
import org.telegram.ui.bo;
import org.telegram.ui.du0;
import org.telegram.ui.uy;

/* compiled from: r8-map-id-995671d6bce0aaeb91824b65f2f1988c5410eae59f1d5d7c368a0027313cc0ad */
/* loaded from: classes4.dex */
public final class ab extends View {
    public final /* synthetic */ int a;
    public Object b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ab(Context context) {
        super(context);
        this.a = 17;
    }

    @Override // android.view.View
    public void dispatchDraw(Canvas canvas) {
        switch (this.a) {
            case 0:
                canvas.save();
                kc kcVar = (kc) this.b;
                canvas.translate(kcVar.c1.getX() + kcVar.l0.getX(), kcVar.c1.getY() + kcVar.l0.getY());
                ac acVar = kcVar.c1;
                acVar.k(canvas, acVar.getBounds(), kcVar.c1.getOver2Alpha());
                canvas.restore();
                break;
            case 5:
                ah.e eVar = ((hh.g) this.b).I;
                if (eVar != null) {
                    eVar.draw(canvas);
                }
                super.dispatchDraw(canvas);
                break;
            case 8:
                canvas.drawRect(0.0f, 0.0f, getWidth(), getHeight(), ((org.telegram.ui.ActionBar.i3) this.b).d);
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
                ((f11) this.b).e(canvas, (getMeasuredWidth() - ((f11) this.b).l()) / 2.0f, getMeasuredHeight() / 2.0f);
                break;
            case 21:
                super.draw(canvas);
                br0 br0Var = (br0) this.b;
                br0Var.U0.setBounds(0, (getMeasuredHeight() - br0Var.G0.d) - AndroidUtilities.dp(72.0f), getMeasuredWidth(), getMeasuredHeight());
                br0Var.U0.draw(canvas);
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
                ((mw0) this.b).T();
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
                ((gg.q1) this.b).f = true;
                break;
            case 7:
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
                ((gg.q1) this.b).f = false;
                break;
            case 7:
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
        Paint paint;
        float f13;
        switch (this.a) {
            case 3:
                super.onDraw(canvas);
                fi.k0 k0Var = (fi.k0) this.b;
                yf.y yVar = k0Var.K;
                float max = Math.max(k0Var.b.e, k0Var.c.e);
                yf.y yVar2 = k0Var.J;
                yVar2.c(AndroidUtilities.dp(42.0f) + k0Var.U.b, 0);
                yVar2.setBounds(0, 0, getWidth(), AndroidUtilities.dp(56.0f) + k0Var.U.b);
                int i12 = org.telegram.ui.ActionBar.i6.a7;
                yVar2.b(org.telegram.ui.ActionBar.i6.l1(AndroidUtilities.lerp(1.0f, 0.8f, max), k0Var.getThemedColor(i12)));
                yVar2.draw(canvas);
                if (k0Var.N) {
                    max = 1.0f;
                }
                int lerp = AndroidUtilities.lerp(AndroidUtilities.dp(48.0f) + k0Var.U.d, 0, max);
                int lerp2 = AndroidUtilities.lerp(AndroidUtilities.dp(72.0f), 0, max) + k0Var.U.d;
                float lerp3 = AndroidUtilities.lerp(0.8f, AndroidUtilities.getNavigationBarThirdButtonsFactor(k0Var.U.d), max);
                yVar.c(0, lerp);
                yVar.setBounds(0, getHeight() - lerp2, getWidth(), getHeight());
                yVar.b(org.telegram.ui.ActionBar.i6.l1(lerp3, k0Var.getThemedColor(i12)));
                yVar.draw(canvas);
                break;
            case 6:
                canvas.save();
                canvas.translate(AndroidUtilities.dpf2(22.6f), AndroidUtilities.dpf2(21.66f));
                ((ii.u0) this.b).c.draw(canvas);
                canvas.restore();
                break;
            case 7:
                int dp = AndroidUtilities.dp(20.0f);
                int width = (getWidth() - dp) / 2;
                int height = (getHeight() - dp) / 2;
                CheckBoxBase checkBoxBase = (CheckBoxBase) this.b;
                checkBoxBase.e(width, height, dp, dp);
                checkBoxBase.a(canvas);
                break;
            case 11:
                org.telegram.ui.Cells.s2 s2Var = (org.telegram.ui.Cells.s2) this.b;
                s2Var.j4.setBounds(0, 0, getWidth(), getHeight());
                s2Var.j4.draw(canvas);
                break;
            case 16:
                jr jrVar = (jr) this.b;
                if (jrVar.Z) {
                    i10 = ((org.telegram.ui.ActionBar.f3) jrVar).backgroundPaddingLeft;
                    int measuredWidth = getMeasuredWidth();
                    i11 = ((org.telegram.ui.ActionBar.f3) jrVar).backgroundPaddingLeft;
                    canvas.drawRect(i10, 0.0f, measuredWidth - i11, 1.0f, org.telegram.ui.ActionBar.i6.k0);
                    break;
                }
                break;
            case 20:
                super.onDraw(canvas);
                ((du0) this.b).j(canvas, getMeasuredWidth(), getMeasuredHeight());
                break;
            case 23:
                super.onDraw(canvas);
                int offsetColor = AndroidUtilities.getOffsetColor(-9057429, -10513163, getTranslationX() / getMeasuredWidth(), 1.0f);
                int offsetColor2 = AndroidUtilities.getOffsetColor(-11554882, -4629871, getTranslationX() / getMeasuredWidth(), 1.0f);
                nq0 nq0Var = (nq0) this.b;
                RectF rectF = nq0Var.h;
                Paint paint2 = nq0Var.f;
                if (offsetColor != 0) {
                    paint2.setShader(new LinearGradient(0.0f, 0.0f, getMeasuredWidth(), 0.0f, new int[]{offsetColor, offsetColor2}, (float[]) null, Shader.TileMode.CLAMP));
                }
                rectF.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                canvas.drawRoundRect(rectF, AndroidUtilities.dp(18.0f), AndroidUtilities.dp(18.0f), paint2);
                break;
            case 25:
                mw0 mw0Var = (mw0) this.b;
                if (mw0Var.b != null && !mw0Var.J) {
                    Drawable newDrawable = mw0Var.getNewDrawable();
                    boolean newDrawableMotion = mw0Var.getNewDrawableMotion();
                    Drawable drawable2 = mw0Var.b;
                    if (newDrawable != drawable2 && newDrawable != null) {
                        if (org.telegram.ui.ActionBar.i6.sl != null) {
                            mw0Var.d = drawable2;
                            mw0Var.e = mw0Var.c;
                        }
                        if (newDrawable instanceof pc0) {
                            ((pc0) newDrawable).r(mw0Var.L);
                        }
                        mw0Var.b = newDrawable;
                        if (mw0Var.M && (newDrawable instanceof bo)) {
                            ((bo) newDrawable).f(this);
                        }
                        if (mw0Var.M) {
                            Drawable drawable3 = mw0Var.b;
                            if (drawable3 instanceof pc0) {
                                ((pc0) drawable3).k();
                            }
                        }
                        mw0Var.c = newDrawableMotion;
                        mw0Var.l0 = 0.0f;
                        mw0Var.U(mw0Var.b);
                        mw0Var.I();
                    } else if (mw0Var.c != newDrawableMotion) {
                        mw0Var.c = newDrawableMotion;
                        mw0Var.I();
                    }
                    mw0Var.l0 = Utilities.clamp((AndroidUtilities.screenRefreshTime / 200.0f) + mw0Var.l0, 1.0f, 0.0f);
                    int i13 = 0;
                    while (i13 < 2) {
                        Drawable drawable4 = i13 == 0 ? mw0Var.d : mw0Var.b;
                        if (drawable4 != null) {
                            if (i13 != 1 || mw0Var.d == null || mw0Var.G == null) {
                                drawable4.setAlpha(255);
                            } else {
                                drawable4.setAlpha((int) (mw0Var.l0 * 255.0f));
                            }
                            if (i13 == 0 ? mw0Var.e : mw0Var.c) {
                                f7 = mw0Var.y;
                                f10 = mw0Var.w;
                                f11 = mw0Var.x;
                            } else {
                                f7 = 1.0f;
                                f10 = 0.0f;
                                f11 = 0.0f;
                            }
                            if (drawable4 instanceof pc0) {
                                pc0 pc0Var = (pc0) drawable4;
                                if (pc0Var.u != null) {
                                    int currentActionBarHeight = (mw0Var.P() ? org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() : 0) + ((mw0Var.Q() && mw0Var.s) ? AndroidUtilities.statusBarHeight : 0);
                                    int measuredHeight = mw0Var.Y() ? getRootView().getMeasuredHeight() - currentActionBarHeight : getHeight();
                                    f12 = 1.0f;
                                    float max2 = Math.max(getMeasuredWidth() / drawable4.getIntrinsicWidth(), measuredHeight / drawable4.getIntrinsicHeight());
                                    int ceil = (int) Math.ceil(drawable4.getIntrinsicWidth() * max2 * f7);
                                    int ceil2 = (int) Math.ceil(drawable4.getIntrinsicHeight() * max2 * f7);
                                    int measuredWidth2 = ((getMeasuredWidth() - ceil) / 2) + ((int) f10);
                                    int i14 = ((measuredHeight - ceil2) / 2) + mw0Var.E + currentActionBarHeight + ((int) f11);
                                    canvas.save();
                                    canvas.clipRect(0, currentActionBarHeight, ceil, getMeasuredHeight() - mw0Var.h);
                                    drawable4.setBounds(measuredWidth2, i14, ceil + measuredWidth2, ceil2 + i14);
                                    drawable4.draw(canvas);
                                    mw0.H(mw0Var, canvas);
                                    canvas.restore();
                                } else {
                                    f12 = 1.0f;
                                    if (mw0Var.h != 0) {
                                        canvas.save();
                                        canvas.clipRect(0, 0, getMeasuredWidth(), getRootView().getMeasuredHeight() - mw0Var.h);
                                    }
                                    pc0Var.f = mw0Var.E;
                                    drawable4.setBounds(0, 0, getMeasuredWidth(), (int) ((getRootView().getMeasuredHeight() - mw0Var.E) + f11));
                                    drawable4.draw(canvas);
                                    if (mw0Var.h != 0) {
                                        canvas.restore();
                                    }
                                }
                            } else {
                                f12 = 1.0f;
                                if (drawable4 instanceof ColorDrawable) {
                                    if (mw0Var.h != 0) {
                                        canvas.save();
                                        canvas.clipRect(0, 0, getMeasuredWidth(), getMeasuredHeight() - mw0Var.h);
                                    }
                                    drawable4.setBounds(0, 0, getMeasuredWidth(), getRootView().getMeasuredHeight());
                                    drawable4.draw(canvas);
                                    mw0.H(mw0Var, canvas);
                                    if (mw0Var.h != 0) {
                                        canvas.restore();
                                    }
                                } else if (drawable4 instanceof GradientDrawable) {
                                    if (mw0Var.h != 0) {
                                        canvas.save();
                                        canvas.clipRect(0, 0, getMeasuredWidth(), getRootView().getMeasuredHeight() - mw0Var.h);
                                    }
                                    drawable4.setBounds(0, mw0Var.E, getMeasuredWidth(), getRootView().getMeasuredHeight() + mw0Var.E);
                                    drawable4.draw(canvas);
                                    mw0.H(mw0Var, canvas);
                                    if (mw0Var.h != 0) {
                                        canvas.restore();
                                    }
                                } else if (!(drawable4 instanceof BitmapDrawable)) {
                                    if (mw0Var.h != 0) {
                                        canvas.save();
                                        canvas.clipRect(0, 0, getMeasuredWidth(), getRootView().getMeasuredHeight() - mw0Var.h);
                                    }
                                    if (drawable4 instanceof bo) {
                                        bo boVar = (bo) drawable4;
                                        boVar.b = this;
                                        pc0 pc0Var2 = boVar.f;
                                        if (pc0Var2 != null) {
                                            pc0Var2.r(this);
                                        }
                                    }
                                    float f14 = f7 - 1.0f;
                                    float B = a4.a.B(-getMeasuredWidth(), f14, 2.0f, f10);
                                    float B2 = a4.a.B(-getRootView().getMeasuredHeight(), f14, 2.0f, f11);
                                    drawable4.setBounds((int) B, (int) (mw0Var.E + B2), (int) ((getMeasuredWidth() * f7) + B), (int) sa.e.d(getRootView().getMeasuredHeight(), f7, mw0Var.E, B2));
                                    drawable4.draw(canvas);
                                    mw0.H(mw0Var, canvas);
                                    if (mw0Var.h != 0) {
                                        canvas.restore();
                                    }
                                } else if (((BitmapDrawable) drawable4).getTileModeX() == Shader.TileMode.REPEAT) {
                                    canvas.save();
                                    float f15 = 2.0f / AndroidUtilities.density;
                                    canvas.scale(f15, f15);
                                    drawable4.setBounds(0, 0, (int) Math.ceil(getMeasuredWidth() / f15), (int) Math.ceil(getRootView().getMeasuredHeight() / f15));
                                    drawable4.draw(canvas);
                                    mw0.H(mw0Var, canvas);
                                    canvas.restore();
                                } else {
                                    int currentActionBarHeight2 = (mw0Var.P() ? org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() : 0) + ((mw0Var.Q() && mw0Var.s) ? AndroidUtilities.statusBarHeight : 0);
                                    int measuredHeight2 = mw0Var.Y() ? getRootView().getMeasuredHeight() - currentActionBarHeight2 : getHeight();
                                    float max3 = Math.max(getMeasuredWidth() / drawable4.getIntrinsicWidth(), measuredHeight2 / drawable4.getIntrinsicHeight());
                                    int ceil3 = (int) Math.ceil(drawable4.getIntrinsicWidth() * max3 * f7);
                                    int ceil4 = (int) Math.ceil(drawable4.getIntrinsicHeight() * max3 * f7);
                                    int measuredWidth3 = ((getMeasuredWidth() - ceil3) / 2) + ((int) f10);
                                    int i15 = ((measuredHeight2 - ceil4) / 2) + mw0Var.E + currentActionBarHeight2 + ((int) f11);
                                    canvas.save();
                                    canvas.clipRect(0, currentActionBarHeight2, ceil3, getMeasuredHeight() - mw0Var.h);
                                    drawable4.setBounds(measuredWidth3, i15, ceil3 + measuredWidth3, ceil4 + i15);
                                    drawable4.draw(canvas);
                                    mw0.H(mw0Var, canvas);
                                    canvas.restore();
                                }
                            }
                            if (i13 == 0 && (drawable = mw0Var.d) != null && mw0Var.l0 >= f12) {
                                if (mw0Var.M && (drawable instanceof bo)) {
                                    ((bo) drawable).g(mw0Var.L);
                                }
                                if (mw0Var.M) {
                                    Drawable drawable5 = mw0Var.d;
                                    if (drawable5 instanceof pc0) {
                                        ((pc0) drawable5).l();
                                    }
                                }
                                mw0Var.d = null;
                                mw0Var.e = false;
                                mw0Var.I();
                                mw0Var.L.invalidate();
                            }
                        }
                        i13++;
                    }
                    if (mw0Var.l0 != 1.0f) {
                        mw0Var.L.invalidate();
                        break;
                    }
                }
                break;
            case 27:
                super.onDraw(canvas);
                int w02 = org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.Vi, false);
                bz0 bz0Var = (bz0) this.b;
                org.telegram.ui.Components.voip.h hVar = bz0Var.L;
                Paint paint3 = bz0Var.a;
                paint3.setColor(w02);
                Paint paint4 = bz0Var.b;
                paint4.setColor(w02);
                Paint paint5 = bz0Var.c;
                paint5.setColor(w02);
                paint4.setAlpha(255);
                paint5.setAlpha(82);
                paint3.setAlpha(46);
                Paint paint6 = bz0Var.d;
                paint6.setColor(org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.d6, false));
                canvas.drawLine(AndroidUtilities.dp(24.0f), AndroidUtilities.dp(20.0f), getMeasuredWidth() - AndroidUtilities.dp(24.0f), AndroidUtilities.dp(20.0f), paint3);
                boolean z10 = bz0Var.e;
                if (z10 || bz0Var.J != 0.0f) {
                    if (!z10) {
                        float f16 = bz0Var.J - 0.10666667f;
                        bz0Var.J = f16;
                        if (f16 < 0.0f) {
                            bz0Var.J = 0.0f;
                        }
                    } else if (bz0Var.K) {
                        float f17 = bz0Var.J + 0.024615385f;
                        bz0Var.J = f17;
                        if (f17 > 1.0f) {
                            bz0Var.J = 1.0f;
                            bz0Var.K = false;
                        }
                    } else {
                        float f18 = bz0Var.J - 0.024615385f;
                        bz0Var.J = f18;
                        if (f18 < 0.0f) {
                            bz0Var.J = 0.0f;
                            bz0Var.K = true;
                        }
                    }
                    invalidate();
                    RectF rectF2 = AndroidUtilities.rectTmp;
                    rectF2.set(AndroidUtilities.dp(24.0f), AndroidUtilities.dp(17.0f), getMeasuredWidth() - AndroidUtilities.dp(24.0f), AndroidUtilities.dp(23.0f));
                    hVar.f = getMeasuredWidth();
                    hVar.a(AndroidUtilities.dp(3.0f), canvas, rectF2, null);
                }
                int dp2 = AndroidUtilities.dp(24.0f);
                if (bz0Var.e) {
                    paint = paint6;
                    f13 = 1.0f;
                } else {
                    int dp3 = AndroidUtilities.dp(24.0f) + ((int) (bi.A(24.0f, 2, getMeasuredWidth()) * bz0Var.F));
                    f13 = 1.0f;
                    canvas.drawLine(dp2, AndroidUtilities.dp(20.0f), AndroidUtilities.dp(24.0f) + r2, AndroidUtilities.dp(20.0f), paint5);
                    canvas.drawRect(dp3, AndroidUtilities.dp(20.0f) - AndroidUtilities.dp(3.0f), AndroidUtilities.dp(3.0f) + dp3, AndroidUtilities.dp(3.0f) + AndroidUtilities.dp(20.0f), paint6);
                    paint = paint6;
                }
                if (!bz0Var.e) {
                    int A = (int) (bi.A(24.0f, 2, getMeasuredWidth()) * bz0Var.E);
                    if (A < AndroidUtilities.dp(f13)) {
                        A = AndroidUtilities.dp(f13);
                    }
                    int dp4 = AndroidUtilities.dp(24.0f) + A;
                    canvas.drawLine(dp2, AndroidUtilities.dp(20.0f), AndroidUtilities.dp(24.0f) + A, AndroidUtilities.dp(20.0f), paint4);
                    canvas.drawRect(dp4, AndroidUtilities.dp(20.0f) - AndroidUtilities.dp(3.0f), AndroidUtilities.dp(3.0f) + dp4, AndroidUtilities.dp(3.0f) + AndroidUtilities.dp(20.0f), paint);
                    break;
                }
                break;
            case 28:
                if (getAlpha() != 0.0f) {
                    RectF rectF3 = AndroidUtilities.rectTmp;
                    rectF3.set(0.0f, 0.0f, getWidth(), getHeight());
                    ((org.telegram.ui.Components.voip.k1) this.b).n.a(AndroidUtilities.dp(10.0f), canvas, rectF3, null);
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
        org.telegram.ui.ActionBar.k kVar;
        int i13;
        org.telegram.ui.ActionBar.k kVar2;
        int i14;
        switch (this.a) {
            case 1:
                di.k kVar3 = (di.k) this.b;
                if (kVar3.H) {
                    int i15 = kVar3.I;
                    kVar = ((org.telegram.ui.ActionBar.n2) kVar3).actionBar;
                    i12 = (kVar.getMeasuredHeight() + i15) - AndroidUtilities.dp(16.0f);
                } else {
                    int dp = AndroidUtilities.dp(140.0f) + kVar3.I;
                    if (AndroidUtilities.dp(24.0f) + kVar3.y.getMeasuredHeight() > dp) {
                        dp = AndroidUtilities.dp(24.0f) + kVar3.y.getMeasuredHeight();
                    }
                    i12 = dp;
                }
                super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec((int) (i12 - (0 * 2.5f)), TLObject.FLAG_30));
                break;
            case 2:
                ei.m mVar = (ei.m) this.b;
                if (mVar.H) {
                    int i16 = mVar.I;
                    kVar2 = ((org.telegram.ui.ActionBar.n2) mVar).actionBar;
                    i13 = (kVar2.getMeasuredHeight() + i16) - AndroidUtilities.dp(16.0f);
                } else {
                    int dp2 = AndroidUtilities.dp(140.0f) + mVar.I;
                    if (AndroidUtilities.dp(24.0f) + mVar.y.getMeasuredHeight() > dp2) {
                        dp2 = AndroidUtilities.dp(24.0f) + mVar.y.getMeasuredHeight();
                    }
                    i13 = dp2;
                }
                super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec((int) (i13 - (0 * 2.5f)), TLObject.FLAG_30));
                break;
            case 3:
            case 5:
            case 6:
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
            case 4:
                ((View) getParent()).getMeasuredHeight();
                gg.q1 q1Var = (gg.q1) this.b;
                Integer num = q1Var.d;
                if (num != null) {
                    i14 = num.intValue();
                    q1Var.h = i14;
                } else {
                    i14 = 0;
                    q1Var.h = 0;
                }
                super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(i14, TLObject.FLAG_30));
                break;
            case 7:
                setMeasuredDimension(View.MeasureSpec.getSize(i10), AndroidUtilities.dp(24.0f));
                break;
            case 8:
                setMeasuredDimension(View.MeasureSpec.getSize(i10), AndroidUtilities.navigationBarHeight);
                setTranslationY(AndroidUtilities.navigationBarHeight);
                break;
            case 9:
                s4.c0 c0Var = ((org.telegram.ui.p5) this.b).d.F;
                super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(Math.max(0, c0Var instanceof sz ? ((sz) c0Var).J : 0), TLObject.FLAG_30));
                break;
            case 12:
                org.telegram.ui.Components.cb cbVar = (org.telegram.ui.Components.cb) this.b;
                int i17 = cbVar.h;
                int dp3 = (i17 == 0 ? AndroidUtilities.dp(300.0f) : (int) (i17 * cbVar.v)) - (((cbVar.G - cbVar.H) - cbVar.I) - cbVar.J);
                if (dp3 < 1) {
                    dp3 = 1;
                }
                super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(dp3, TLObject.FLAG_30));
                break;
            case 13:
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(((km) this.b).v.J, TLObject.FLAG_30));
                break;
            case 14:
                setMeasuredDimension(View.MeasureSpec.getSize(i10), ((vn) this.b).d.R0);
                break;
            case 15:
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(((yn) ((org.telegram.ui.z7) this.b).d).w, TLObject.FLAG_30));
                break;
            case 17:
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(getPaddingRight() + getPaddingLeft() + Math.round(((f11) this.b).l()), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(Math.max(getPaddingBottom() + getPaddingTop() + Math.round(((f11) this.b).j()), AndroidUtilities.dp(26.0f)), TLObject.FLAG_30));
                break;
            case 18:
                super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(48.0f) + ((j70) this.b).c.o0, TLObject.FLAG_30));
                break;
            case 19:
                int dp4 = AndroidUtilities.dp(48.0f);
                p70 p70Var = ((l70) this.b).n;
                super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(dp4 + p70Var.o0 + p70Var.u0, TLObject.FLAG_30));
                break;
            case 22:
                super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(((xq0) this.b).K.J.R, TLObject.FLAG_30));
                break;
            case 24:
                setMeasuredDimension(View.MeasureSpec.getSize(i10), ((bw0) this.b).getMeasuredHeight());
                break;
            case 26:
                jx0 jx0Var = (jx0) this.b;
                int size = View.MeasureSpec.getSize(i10);
                if (size <= 0) {
                    size = ((View) getParent()).getMeasuredWidth();
                }
                int size2 = View.MeasureSpec.getSize(i11) - AndroidUtilities.dp(4.0f);
                sx0 sx0Var = jx0Var.d;
                int i18 = sx0Var.n3;
                int max = Math.max(i18 > 0 ? AndroidUtilities.dp(4.0f) + i18 : 0, (int) (size - Math.min(AndroidUtilities.dp(4.0f) + ((jx0Var.h() - 1) * size2), jx0Var.d.e3 * size2)));
                sx0Var.m3 = max;
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
                ((org.telegram.ui.Components.voip.k1) this.b).n.f = i10;
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
                View view = ((org.telegram.ui.f8) this.b).b.x.fragmentView;
                if (view != null) {
                    view.invalidate();
                    break;
                }
                break;
            case 29:
                super.setAlpha(f7);
                View view2 = ((uy) this.b).fragmentView;
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
                viewGroup = ((org.telegram.ui.ActionBar.f3) ((org.telegram.ui.Components.cb) this.b)).containerView;
                viewGroup.invalidate();
                break;
            default:
                super.setTranslationY(f7);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ab(Object obj, Context context, int i10) {
        super(context);
        this.a = i10;
        this.b = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ab(org.telegram.ui.Components.cb cbVar, Context context) {
        super(context);
        this.a = 12;
        this.b = cbVar;
        setTag(-33024);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ab(Context context, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context);
        this.a = 7;
        CheckBoxBase checkBoxBase = new CheckBoxBase(20, this, d6Var);
        this.b = checkBoxBase;
        checkBoxBase.h(org.telegram.ui.ActionBar.i6.hl, org.telegram.ui.ActionBar.i6.z5, org.telegram.ui.ActionBar.i6.k7);
        checkBoxBase.d(10);
        checkBoxBase.k(true);
        checkBoxBase.i(AndroidUtilities.dp(5.0f));
    }
}
