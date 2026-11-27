// default package

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.ActionBar.a;
import org.telegram.ui.Components.CheckBoxBase;
import org.telegram.ui.SecretMediaViewer;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final class nf9 extends View {
    public final /* synthetic */ byte a;
    public final Object b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nf9(Context context, vnb vnbVar) {
        super(context);
        this.a = (byte) 1;
        CheckBoxBase checkBoxBase = new CheckBoxBase(20, vnbVar, this);
        this.b = checkBoxBase;
        checkBoxBase.h(aob.Yl, aob.z5, aob.k7);
        checkBoxBase.d(10);
        checkBoxBase.k(true);
        checkBoxBase.i(hl.L(5.0f));
    }

    @Override // android.view.View
    public final void dispatchDraw(Canvas canvas) {
        switch (this.a) {
            case 12:
                canvas.save();
                sbb sbbVar = (sbb) this.b;
                canvas.translate(sbbVar.d1.getX() + sbbVar.m0.getX(), sbbVar.d1.getY() + sbbVar.m0.getY());
                ibb ibbVar = sbbVar.d1;
                ibbVar.k(canvas, ibbVar.getBounds(), sbbVar.d1.getOver2Alpha());
                canvas.restore();
                break;
            default:
                super.dispatchDraw(canvas);
                break;
        }
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        switch (this.a) {
            case 4:
                super.draw(canvas);
                kea keaVar = (kea) this.b;
                rl0 rl0Var = keaVar.Q2;
                rl0Var.setBounds(0, (getMeasuredHeight() - keaVar.B2.d) - hl.L(72.0f), getMeasuredWidth(), getMeasuredHeight());
                rl0Var.draw(canvas);
                break;
            default:
                super.draw(canvas);
                break;
        }
    }

    @Override // android.view.View
    public final void invalidate() {
        switch (this.a) {
            case 8:
                super.invalidate();
                ((wma) this.b).S();
                break;
            default:
                super.invalidate();
                break;
        }
    }

    @Override // android.view.View
    public final void onAttachedToWindow() {
        switch (this.a) {
            case 1:
                super.onAttachedToWindow();
                ((CheckBoxBase) this.b).l = true;
                break;
            default:
                super.onAttachedToWindow();
                break;
        }
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        switch (this.a) {
            case 1:
                super.onDetachedFromWindow();
                ((CheckBoxBase) this.b).l = false;
                break;
            default:
                super.onDetachedFromWindow();
                break;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0169  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0164  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onDraw(Canvas canvas) {
        float f;
        float f2;
        float f3;
        int i;
        float f4;
        Drawable drawable;
        Paint paint;
        byte b = this.a;
        int i2 = 2;
        int i3 = jn7.d4;
        int i4 = 1;
        float f5 = 0.0f;
        float f6 = 1.0f;
        Object obj = this.b;
        switch (b) {
            case 0:
                canvas.save();
                canvas.translate(hl.N(22.6f), hl.N(21.66f));
                ((rf9) obj).c.draw(canvas);
                canvas.restore();
                break;
            case 1:
                int L = hl.L(20.0f);
                CheckBoxBase checkBoxBase = (CheckBoxBase) obj;
                checkBoxBase.e((getWidth() - L) / 2, (getHeight() - L) / 2, L, L);
                checkBoxBase.a(canvas);
                break;
            case 2:
                ((SecretMediaViewer) obj).P.a(canvas, this);
                break;
            case 6:
                super.onDraw(canvas);
                int R0 = hl.R0(getTranslationX() / getMeasuredWidth(), 1.0f, -9057429, -10513163);
                int R02 = hl.R0(getTranslationX() / getMeasuredWidth(), 1.0f, -11554882, -4629871);
                yda ydaVar = (yda) obj;
                RectF rectF = ydaVar.n;
                Paint paint2 = ydaVar.h;
                if (R0 != 0) {
                    paint2.setShader(new LinearGradient(0.0f, 0.0f, getMeasuredWidth(), 0.0f, new int[]{R0, R02}, (float[]) null, Shader.TileMode.CLAMP));
                }
                rectF.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                canvas.drawRoundRect(rectF, hl.L(18.0f), hl.L(18.0f), paint2);
                break;
            case 8:
                wma wmaVar = (wma) obj;
                if (wmaVar.b != null && !wmaVar.K) {
                    Drawable newDrawable = wmaVar.getNewDrawable();
                    boolean newDrawableMotion = wmaVar.getNewDrawableMotion();
                    if (newDrawable != wmaVar.b && newDrawable != null) {
                        if (aob.f1()) {
                            wmaVar.d = wmaVar.b;
                            wmaVar.e = wmaVar.c;
                        }
                        if (newDrawable instanceof ih7) {
                            ((ih7) newDrawable).p(wmaVar.M);
                        }
                        wmaVar.b = newDrawable;
                        if (wmaVar.N && (newDrawable instanceof g82)) {
                            ((g82) newDrawable).f(this);
                        }
                        if (wmaVar.N) {
                            Drawable drawable2 = wmaVar.b;
                            if (drawable2 instanceof ih7) {
                                ((ih7) drawable2).k();
                            }
                        }
                        wmaVar.c = newDrawableMotion;
                        wmaVar.U = 0.0f;
                        wmaVar.T(wmaVar.b);
                        wmaVar.F();
                    } else if (wmaVar.c != newDrawableMotion) {
                        wmaVar.c = newDrawableMotion;
                        wmaVar.F();
                    }
                    wmaVar.U = Utilities.i((hl.t / 200.0f) + wmaVar.U, 1.0f, 0.0f);
                    int i5 = 0;
                    while (i5 < i2) {
                        Drawable drawable3 = i5 == 0 ? wmaVar.d : wmaVar.b;
                        if (drawable3 == null) {
                            i = i2;
                            f4 = f6;
                        } else {
                            if (i5 != i4 || wmaVar.d == null || wmaVar.H == null) {
                                drawable3.setAlpha(i3);
                            } else {
                                drawable3.setAlpha((int) (wmaVar.U * 255.0f));
                            }
                            if (i5 == 0 ? wmaVar.e : wmaVar.c) {
                                f3 = wmaVar.E;
                                f = wmaVar.x;
                                f2 = wmaVar.y;
                            } else {
                                f = f5;
                                f2 = f;
                                f3 = f6;
                            }
                            if (drawable3 instanceof ih7) {
                                ih7 ih7Var = (ih7) drawable3;
                                if (ih7Var.u != null) {
                                    int currentActionBarHeight = (wmaVar.O() ? a.getCurrentActionBarHeight() : 0) + ((wmaVar.P() && wmaVar.s) ? hl.m : 0);
                                    int measuredHeight = wmaVar.W() ? getRootView().getMeasuredHeight() - currentActionBarHeight : getHeight();
                                    i = i2;
                                    float max = Math.max(getMeasuredWidth() / drawable3.getIntrinsicWidth(), measuredHeight / drawable3.getIntrinsicHeight());
                                    f4 = f6;
                                    int ceil = (int) Math.ceil(drawable3.getIntrinsicWidth() * max * f3);
                                    int ceil2 = (int) Math.ceil(drawable3.getIntrinsicHeight() * max * f3);
                                    int measuredWidth = ((getMeasuredWidth() - ceil) / 2) + ((int) f);
                                    int i6 = ((measuredHeight - ceil2) / 2) + wmaVar.F + currentActionBarHeight + ((int) f2);
                                    canvas.save();
                                    canvas.clipRect(0, currentActionBarHeight, ceil, getMeasuredHeight() - wmaVar.h);
                                    drawable3.setBounds(measuredWidth, i6, ceil + measuredWidth, ceil2 + i6);
                                    drawable3.draw(canvas);
                                    wmaVar.G(canvas);
                                    canvas.restore();
                                } else {
                                    i = i2;
                                    f4 = f6;
                                    if (wmaVar.h != 0) {
                                        canvas.save();
                                        canvas.clipRect(0, 0, getMeasuredWidth(), getRootView().getMeasuredHeight() - wmaVar.h);
                                    }
                                    ih7Var.f = wmaVar.F;
                                    drawable3.setBounds(0, 0, getMeasuredWidth(), (int) ((getRootView().getMeasuredHeight() - wmaVar.F) + f2));
                                    drawable3.draw(canvas);
                                    if (wmaVar.h != 0) {
                                        canvas.restore();
                                    }
                                }
                            } else {
                                i = i2;
                                f4 = f6;
                                if (drawable3 instanceof ColorDrawable) {
                                    if (wmaVar.h != 0) {
                                        canvas.save();
                                        canvas.clipRect(0, 0, getMeasuredWidth(), getMeasuredHeight() - wmaVar.h);
                                    }
                                    drawable3.setBounds(0, 0, getMeasuredWidth(), getRootView().getMeasuredHeight());
                                    drawable3.draw(canvas);
                                    wmaVar.G(canvas);
                                    if (wmaVar.h != 0) {
                                        canvas.restore();
                                    }
                                } else if (drawable3 instanceof GradientDrawable) {
                                    if (wmaVar.h != 0) {
                                        canvas.save();
                                        canvas.clipRect(0, 0, getMeasuredWidth(), getRootView().getMeasuredHeight() - wmaVar.h);
                                    }
                                    drawable3.setBounds(0, wmaVar.F, getMeasuredWidth(), getRootView().getMeasuredHeight() + wmaVar.F);
                                    drawable3.draw(canvas);
                                    wmaVar.G(canvas);
                                    if (wmaVar.h != 0) {
                                        canvas.restore();
                                    }
                                } else if (!(drawable3 instanceof BitmapDrawable)) {
                                    if (wmaVar.h != 0) {
                                        canvas.save();
                                        canvas.clipRect(0, 0, getMeasuredWidth(), getRootView().getMeasuredHeight() - wmaVar.h);
                                    }
                                    if (drawable3 instanceof g82) {
                                        g82 g82Var = (g82) drawable3;
                                        g82Var.b = this;
                                        ih7 ih7Var2 = g82Var.f;
                                        if (ih7Var2 != null) {
                                            ih7Var2.p(this);
                                        }
                                    }
                                    float f7 = f3 - f4;
                                    float d = qu6.d(-getMeasuredWidth(), f7, 2.0f, f);
                                    float d2 = qu6.d(-getRootView().getMeasuredHeight(), f7, 2.0f, f2);
                                    drawable3.setBounds((int) d, (int) (wmaVar.F + d2), (int) ((getMeasuredWidth() * f3) + d), (int) bs2.i(getRootView().getMeasuredHeight(), f3, wmaVar.F, d2));
                                    drawable3.draw(canvas);
                                    wmaVar.G(canvas);
                                    if (wmaVar.h != 0) {
                                        canvas.restore();
                                    }
                                } else if (((BitmapDrawable) drawable3).getTileModeX() == Shader.TileMode.REPEAT) {
                                    canvas.save();
                                    float f8 = 2.0f / hl.p;
                                    canvas.scale(f8, f8);
                                    drawable3.setBounds(0, 0, (int) Math.ceil(getMeasuredWidth() / f8), (int) Math.ceil(getRootView().getMeasuredHeight() / f8));
                                    drawable3.draw(canvas);
                                    wmaVar.G(canvas);
                                    canvas.restore();
                                } else {
                                    int currentActionBarHeight2 = (wmaVar.O() ? a.getCurrentActionBarHeight() : 0) + ((wmaVar.P() && wmaVar.s) ? hl.m : 0);
                                    int measuredHeight2 = wmaVar.W() ? getRootView().getMeasuredHeight() - currentActionBarHeight2 : getHeight();
                                    float max2 = Math.max(getMeasuredWidth() / drawable3.getIntrinsicWidth(), measuredHeight2 / drawable3.getIntrinsicHeight());
                                    int ceil3 = (int) Math.ceil(drawable3.getIntrinsicWidth() * max2 * f3);
                                    int ceil4 = (int) Math.ceil(drawable3.getIntrinsicHeight() * max2 * f3);
                                    int measuredWidth2 = ((getMeasuredWidth() - ceil3) / 2) + ((int) f);
                                    int i7 = ((measuredHeight2 - ceil4) / 2) + wmaVar.F + currentActionBarHeight2 + ((int) f2);
                                    canvas.save();
                                    canvas.clipRect(0, currentActionBarHeight2, ceil3, getMeasuredHeight() - wmaVar.h);
                                    drawable3.setBounds(measuredWidth2, i7, ceil3 + measuredWidth2, ceil4 + i7);
                                    drawable3.draw(canvas);
                                    wmaVar.G(canvas);
                                    canvas.restore();
                                }
                            }
                            if (i5 == 0 && (drawable = wmaVar.d) != null && wmaVar.U >= f4) {
                                if (wmaVar.N && (drawable instanceof g82)) {
                                    ((g82) drawable).g(wmaVar.M);
                                }
                                if (wmaVar.N) {
                                    Drawable drawable4 = wmaVar.d;
                                    if (drawable4 instanceof ih7) {
                                        ((ih7) drawable4).l();
                                    }
                                }
                                wmaVar.d = null;
                                wmaVar.e = false;
                                wmaVar.F();
                                wmaVar.M.invalidate();
                            }
                        }
                        i5++;
                        i2 = i;
                        f6 = f4;
                        i3 = jn7.d4;
                        i4 = 1;
                        f5 = 0.0f;
                    }
                    if (wmaVar.U != f6) {
                        wmaVar.M.invalidate();
                        break;
                    }
                }
                break;
            case 11:
                super.onDraw(canvas);
                int w0 = aob.w0(null, aob.Mj, false);
                e5b e5bVar = (e5b) obj;
                fe1 fe1Var = e5bVar.M;
                Paint paint3 = e5bVar.a;
                paint3.setColor(w0);
                Paint paint4 = e5bVar.b;
                paint4.setColor(w0);
                Paint paint5 = e5bVar.c;
                paint5.setColor(w0);
                paint4.setAlpha(jn7.d4);
                paint5.setAlpha(82);
                paint3.setAlpha(46);
                Paint paint6 = e5bVar.d;
                paint6.setColor(aob.w0(null, aob.d6, false));
                canvas.drawLine(hl.L(24.0f), hl.L(20.0f), getMeasuredWidth() - hl.L(24.0f), hl.L(20.0f), paint3);
                if (!e5bVar.e) {
                    float f9 = e5bVar.K;
                    if (f9 != 0.0f) {
                        float f10 = f9 - 0.10666667f;
                        e5bVar.K = f10;
                        if (f10 < 0.0f) {
                            e5bVar.K = 0.0f;
                        }
                    }
                    int L2 = hl.L(24.0f);
                    if (e5bVar.e) {
                        int L3 = hl.L(24.0f) + ((int) ((getMeasuredWidth() - (hl.L(24.0f) << 1)) * e5bVar.G));
                        canvas.drawLine(L2, hl.L(20.0f), hl.L(24.0f) + r2, hl.L(20.0f), paint5);
                        paint = paint6;
                        canvas.drawRect(L3, hl.L(20.0f) - hl.L(3.0f), hl.L(3.0f) + L3, hl.L(3.0f) + hl.L(20.0f), paint);
                    } else {
                        paint = paint6;
                    }
                    if (e5bVar.e) {
                        int measuredWidth3 = (int) ((getMeasuredWidth() - (hl.L(24.0f) << 1)) * e5bVar.F);
                        if (measuredWidth3 < hl.L(1.0f)) {
                            measuredWidth3 = hl.L(1.0f);
                        }
                        int L4 = hl.L(24.0f) + measuredWidth3;
                        canvas.drawLine(L2, hl.L(20.0f), hl.L(24.0f) + measuredWidth3, hl.L(20.0f), paint4);
                        canvas.drawRect(L4, hl.L(20.0f) - hl.L(3.0f), hl.L(3.0f) + L4, hl.L(3.0f) + hl.L(20.0f), paint);
                        break;
                    }
                } else {
                    boolean z = e5bVar.L;
                    float f11 = e5bVar.K;
                    if (z) {
                        float f12 = f11 + 0.024615385f;
                        e5bVar.K = f12;
                        if (f12 > 1.0f) {
                            e5bVar.K = 1.0f;
                            e5bVar.L = false;
                        }
                    } else {
                        float f13 = f11 - 0.024615385f;
                        e5bVar.K = f13;
                        if (f13 < 0.0f) {
                            e5bVar.K = 0.0f;
                            e5bVar.L = true;
                        }
                    }
                }
                invalidate();
                RectF rectF2 = hl.P;
                rectF2.set(hl.L(24.0f), hl.L(17.0f), getMeasuredWidth() - hl.L(24.0f), hl.L(23.0f));
                fe1Var.f = getMeasuredWidth();
                fe1Var.a(hl.L(3.0f), canvas, rectF2, null);
                int L22 = hl.L(24.0f);
                if (e5bVar.e) {
                }
                if (e5bVar.e) {
                }
                break;
            case 15:
                canvas.drawColor(aob.v0(aob.e7, ((sbc) obj).J0));
                break;
            case 16:
                frc frcVar = (frc) obj;
                float e = frcVar.L.e(false, frcVar.K);
                if (frcVar.R != null && getWidth() > 0) {
                    frcVar.b(canvas, e);
                    break;
                }
                break;
            default:
                super.onDraw(canvas);
                break;
        }
    }

    @Override // android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        switch (this.a) {
            case 3:
                super.onLayout(z, i, i2, i3, i4);
                c0a c0aVar = (c0a) this.b;
                int[] iArr = c0aVar.H;
                getLocationOnScreen(iArr);
                Rect rect = c0aVar.d;
                int i5 = iArr[0];
                rect.set(i5, iArr[1], getWidth() + i5, getHeight() + iArr[1]);
                hl.V1(c0aVar.c, rect, c0aVar.J, c0aVar.e);
                break;
            default:
                super.onLayout(z, i, i2, i3, i4);
                break;
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        int L;
        int L2;
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 1:
                setMeasuredDimension(View.MeasureSpec.getSize(i), hl.L(24.0f));
                break;
            case 2:
            case 3:
            case 4:
            case 6:
            case 8:
            case 12:
            default:
                super.onMeasure(i, i2);
                break;
            case 5:
                super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(((hea) obj).L.E1.R, TLObject.FLAG_30));
                break;
            case 7:
                setMeasuredDimension(View.MeasureSpec.getSize(i), ((wka) obj).getMeasuredHeight());
                break;
            case 9:
                nza nzaVar = (nza) obj;
                if (nzaVar.I) {
                    L = (nzaVar.o0().getMeasuredHeight() + nzaVar.J) - hl.L(16.0f);
                } else {
                    int L3 = hl.L(140.0f) + nzaVar.J;
                    L = hl.L(24.0f) + nzaVar.E.getMeasuredHeight() > L3 ? hl.L(24.0f) + nzaVar.E.getMeasuredHeight() : L3;
                }
                super.onMeasure(i, View.MeasureSpec.makeMeasureSpec((int) (L - 0.0f), TLObject.FLAG_30));
                break;
            case 10:
                t2b t2bVar = ((l2b) obj).d;
                int size = View.MeasureSpec.getSize(i);
                if (size <= 0) {
                    size = ((View) getParent()).getMeasuredWidth();
                }
                int size2 = View.MeasureSpec.getSize(i2) - hl.L(4.0f);
                int i3 = t2bVar.o3;
                int max = Math.max(i3 > 0 ? hl.L(4.0f) + i3 : 0, (int) (size - Math.min(hl.L(4.0f) + ((r6.b() - 1) * size2), t2bVar.f3 * size2)));
                t2bVar.n3 = max;
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(max, TLObject.FLAG_30), i2);
                break;
            case 11:
                super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(hl.L(40.0f), TLObject.FLAG_30));
                break;
            case 13:
                thb thbVar = (thb) obj;
                if (thbVar.I) {
                    L2 = (thbVar.o0().getMeasuredHeight() + thbVar.J) - hl.L(16.0f);
                } else {
                    int L4 = hl.L(140.0f) + thbVar.J;
                    L2 = hl.L(24.0f) + thbVar.E.getMeasuredHeight() > L4 ? hl.L(24.0f) + thbVar.E.getMeasuredHeight() : L4;
                }
                super.onMeasure(i, View.MeasureSpec.makeMeasureSpec((int) (L2 - 0.0f), TLObject.FLAG_30));
                break;
        }
    }

    @Override // android.view.View
    public final void setAlpha(float f) {
        switch (this.a) {
            case 14:
                super.setAlpha(f);
                View view = ((tzb) this.b).fragmentView;
                if (view != null) {
                    view.invalidate();
                    break;
                }
                break;
            default:
                super.setAlpha(f);
                break;
        }
    }

    @Override // android.view.View
    public final void setTranslationX(float f) {
        switch (this.a) {
            case 6:
                super.setTranslationX(f);
                invalidate();
                break;
            default:
                super.setTranslationX(f);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ nf9(byte b, Context context, Object obj) {
        super(context);
        this.a = b;
        this.b = obj;
    }
}
