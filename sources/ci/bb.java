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
import org.telegram.ui.Components.cd0;
import org.telegram.ui.Components.d80;
import org.telegram.ui.Components.f00;
import org.telegram.ui.Components.gz0;
import org.telegram.ui.Components.ir0;
import org.telegram.ui.Components.jo;
import org.telegram.ui.Components.l11;
import org.telegram.ui.Components.mo;
import org.telegram.ui.Components.mr0;
import org.telegram.ui.Components.px0;
import org.telegram.ui.Components.sw0;
import org.telegram.ui.Components.wr;
import org.telegram.ui.Components.x70;
import org.telegram.ui.Components.ym;
import org.telegram.ui.Components.yq0;
import org.telegram.ui.Components.yx0;
import org.telegram.ui.Components.z70;
import org.telegram.ui.co;
import org.telegram.ui.ju0;
import org.telegram.ui.p20;
import org.telegram.ui.ty;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes4.dex */
public final class bb extends View {
    public final /* synthetic */ int a;
    public Object b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ bb(Context context) {
        super(context);
        this.a = 17;
    }

    @Override // android.view.View
    public void dispatchDraw(Canvas canvas) {
        switch (this.a) {
            case 0:
                canvas.save();
                lc lcVar = (lc) this.b;
                canvas.translate(lcVar.c1.getX() + lcVar.l0.getX(), lcVar.c1.getY() + lcVar.l0.getY());
                bc bcVar = lcVar.c1;
                bcVar.k(canvas, bcVar.getBounds(), lcVar.c1.getOver2Alpha());
                canvas.restore();
                break;
            case 5:
                ah.d dVar = ((hh.f) this.b).I;
                if (dVar != null) {
                    dVar.draw(canvas);
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
                ((l11) this.b).e(canvas, (getMeasuredWidth() - ((l11) this.b).l()) / 2.0f, getMeasuredHeight() / 2.0f);
                break;
            case 21:
                super.draw(canvas);
                mr0 mr0Var = (mr0) this.b;
                mr0Var.W0.setBounds(0, (getMeasuredHeight() - mr0Var.G0.d) - AndroidUtilities.dp(72.0f), getMeasuredWidth(), getMeasuredHeight());
                mr0Var.W0.draw(canvas);
                break;
            default:
                super.draw(canvas);
                break;
        }
    }

    @Override // android.view.View
    public void invalidate() {
        switch (this.a) {
            case 24:
                super.invalidate();
                ((sw0) this.b).T();
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
                ((gg.p1) this.b).f = true;
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
                ((gg.p1) this.b).f = false;
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
        float f13;
        Paint paint;
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
                yVar2.b(org.telegram.ui.ActionBar.i6.m1(AndroidUtilities.lerp(1.0f, 0.8f, max), k0Var.getThemedColor(i12)));
                yVar2.draw(canvas);
                if (k0Var.N) {
                    max = 1.0f;
                }
                int lerp = AndroidUtilities.lerp(AndroidUtilities.dp(48.0f) + k0Var.U.d, 0, max);
                int lerp2 = AndroidUtilities.lerp(AndroidUtilities.dp(72.0f), 0, max) + k0Var.U.d;
                float lerp3 = AndroidUtilities.lerp(0.8f, AndroidUtilities.getNavigationBarThirdButtonsFactor(k0Var.U.d), max);
                yVar.c(0, lerp);
                yVar.setBounds(0, getHeight() - lerp2, getWidth(), getHeight());
                yVar.b(org.telegram.ui.ActionBar.i6.m1(lerp3, k0Var.getThemedColor(i12)));
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
                s2Var.n4.setBounds(0, 0, getWidth(), getHeight());
                s2Var.n4.draw(canvas);
                break;
            case 16:
                wr wrVar = (wr) this.b;
                if (wrVar.Z) {
                    i10 = ((org.telegram.ui.ActionBar.f3) wrVar).backgroundPaddingLeft;
                    int measuredWidth = getMeasuredWidth();
                    i11 = ((org.telegram.ui.ActionBar.f3) wrVar).backgroundPaddingLeft;
                    canvas.drawRect(i10, 0.0f, measuredWidth - i11, 1.0f, org.telegram.ui.ActionBar.i6.k0);
                    break;
                }
                break;
            case 20:
                super.onDraw(canvas);
                ((ju0) this.b).j(canvas, getMeasuredWidth(), getMeasuredHeight());
                break;
            case 23:
                super.onDraw(canvas);
                int offsetColor = AndroidUtilities.getOffsetColor(-9057429, -10513163, getTranslationX() / getMeasuredWidth(), 1.0f);
                int offsetColor2 = AndroidUtilities.getOffsetColor(-11554882, -4629871, getTranslationX() / getMeasuredWidth(), 1.0f);
                yq0 yq0Var = (yq0) this.b;
                RectF rectF = yq0Var.n;
                Paint paint2 = yq0Var.h;
                if (offsetColor != 0) {
                    paint2.setShader(new LinearGradient(0.0f, 0.0f, getMeasuredWidth(), 0.0f, new int[]{offsetColor, offsetColor2}, (float[]) null, Shader.TileMode.CLAMP));
                }
                rectF.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                canvas.drawRoundRect(rectF, AndroidUtilities.dp(18.0f), AndroidUtilities.dp(18.0f), paint2);
                break;
            case 24:
                sw0 sw0Var = (sw0) this.b;
                if (sw0Var.b != null && !sw0Var.J) {
                    Drawable newDrawable = sw0Var.getNewDrawable();
                    boolean newDrawableMotion = sw0Var.getNewDrawableMotion();
                    Drawable drawable2 = sw0Var.b;
                    float f14 = 0.0f;
                    if (newDrawable != drawable2 && newDrawable != null) {
                        if (org.telegram.ui.ActionBar.i6.vl != null) {
                            sw0Var.d = drawable2;
                            sw0Var.e = sw0Var.c;
                        }
                        if (newDrawable instanceof cd0) {
                            ((cd0) newDrawable).r(sw0Var.L);
                        }
                        sw0Var.b = newDrawable;
                        if (sw0Var.M && (newDrawable instanceof co)) {
                            ((co) newDrawable).f(this);
                        }
                        if (sw0Var.M) {
                            Drawable drawable3 = sw0Var.b;
                            if (drawable3 instanceof cd0) {
                                ((cd0) drawable3).k();
                            }
                        }
                        sw0Var.c = newDrawableMotion;
                        sw0Var.l0 = 0.0f;
                        sw0Var.U(sw0Var.b);
                        sw0Var.I();
                    } else if (sw0Var.c != newDrawableMotion) {
                        sw0Var.c = newDrawableMotion;
                        sw0Var.I();
                    }
                    float f15 = 1.0f;
                    sw0Var.l0 = Utilities.clamp((AndroidUtilities.screenRefreshTime / 200.0f) + sw0Var.l0, 1.0f, 0.0f);
                    int i13 = 0;
                    while (i13 < 2) {
                        Drawable drawable4 = i13 == 0 ? sw0Var.d : sw0Var.b;
                        if (drawable4 == null) {
                            f12 = f15;
                        } else {
                            if (i13 != 1 || sw0Var.d == null || sw0Var.G == null) {
                                drawable4.setAlpha(255);
                            } else {
                                drawable4.setAlpha((int) (sw0Var.l0 * 255.0f));
                            }
                            if (i13 == 0 ? sw0Var.e : sw0Var.c) {
                                f7 = sw0Var.y;
                                f10 = sw0Var.w;
                                f11 = sw0Var.x;
                            } else {
                                f7 = f15;
                                f10 = f14;
                                f11 = f10;
                            }
                            if (drawable4 instanceof cd0) {
                                cd0 cd0Var = (cd0) drawable4;
                                if (cd0Var.u != null) {
                                    int currentActionBarHeight = (sw0Var.P() ? org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() : 0) + ((sw0Var.Q() && sw0Var.s) ? AndroidUtilities.statusBarHeight : 0);
                                    int measuredHeight = sw0Var.Y() ? getRootView().getMeasuredHeight() - currentActionBarHeight : getHeight();
                                    f12 = f15;
                                    float max2 = Math.max(getMeasuredWidth() / drawable4.getIntrinsicWidth(), measuredHeight / drawable4.getIntrinsicHeight());
                                    int ceil = (int) Math.ceil(drawable4.getIntrinsicWidth() * max2 * f7);
                                    int ceil2 = (int) Math.ceil(drawable4.getIntrinsicHeight() * max2 * f7);
                                    int measuredWidth2 = ((getMeasuredWidth() - ceil) / 2) + ((int) f10);
                                    int i14 = ((measuredHeight - ceil2) / 2) + sw0Var.E + currentActionBarHeight + ((int) f11);
                                    canvas.save();
                                    canvas.clipRect(0, currentActionBarHeight, ceil, getMeasuredHeight() - sw0Var.h);
                                    drawable4.setBounds(measuredWidth2, i14, ceil + measuredWidth2, ceil2 + i14);
                                    drawable4.draw(canvas);
                                    sw0.G(sw0Var, canvas);
                                    canvas.restore();
                                } else {
                                    f12 = f15;
                                    if (sw0Var.h != 0) {
                                        canvas.save();
                                        canvas.clipRect(0, 0, getMeasuredWidth(), getRootView().getMeasuredHeight() - sw0Var.h);
                                    }
                                    cd0Var.f = sw0Var.E;
                                    drawable4.setBounds(0, 0, getMeasuredWidth(), (int) ((getRootView().getMeasuredHeight() - sw0Var.E) + f11));
                                    drawable4.draw(canvas);
                                    if (sw0Var.h != 0) {
                                        canvas.restore();
                                    }
                                }
                            } else {
                                f12 = f15;
                                if (drawable4 instanceof ColorDrawable) {
                                    if (sw0Var.h != 0) {
                                        canvas.save();
                                        canvas.clipRect(0, 0, getMeasuredWidth(), getMeasuredHeight() - sw0Var.h);
                                    }
                                    drawable4.setBounds(0, 0, getMeasuredWidth(), getRootView().getMeasuredHeight());
                                    drawable4.draw(canvas);
                                    sw0.G(sw0Var, canvas);
                                    if (sw0Var.h != 0) {
                                        canvas.restore();
                                    }
                                } else if (drawable4 instanceof GradientDrawable) {
                                    if (sw0Var.h != 0) {
                                        canvas.save();
                                        canvas.clipRect(0, 0, getMeasuredWidth(), getRootView().getMeasuredHeight() - sw0Var.h);
                                    }
                                    drawable4.setBounds(0, sw0Var.E, getMeasuredWidth(), getRootView().getMeasuredHeight() + sw0Var.E);
                                    drawable4.draw(canvas);
                                    sw0.G(sw0Var, canvas);
                                    if (sw0Var.h != 0) {
                                        canvas.restore();
                                    }
                                } else if (!(drawable4 instanceof BitmapDrawable)) {
                                    if (sw0Var.h != 0) {
                                        canvas.save();
                                        canvas.clipRect(0, 0, getMeasuredWidth(), getRootView().getMeasuredHeight() - sw0Var.h);
                                    }
                                    if (drawable4 instanceof co) {
                                        co coVar = (co) drawable4;
                                        coVar.b = this;
                                        cd0 cd0Var2 = coVar.f;
                                        if (cd0Var2 != null) {
                                            cd0Var2.r(this);
                                        }
                                    }
                                    float f16 = f7 - f12;
                                    float B = a1.g.B(-getMeasuredWidth(), f16, 2.0f, f10);
                                    float B2 = a1.g.B(-getRootView().getMeasuredHeight(), f16, 2.0f, f11);
                                    drawable4.setBounds((int) B, (int) (sw0Var.E + B2), (int) ((getMeasuredWidth() * f7) + B), (int) sc.v.d(getRootView().getMeasuredHeight(), f7, sw0Var.E, B2));
                                    drawable4.draw(canvas);
                                    sw0.G(sw0Var, canvas);
                                    if (sw0Var.h != 0) {
                                        canvas.restore();
                                    }
                                } else if (((BitmapDrawable) drawable4).getTileModeX() == Shader.TileMode.REPEAT) {
                                    canvas.save();
                                    float f17 = 2.0f / AndroidUtilities.density;
                                    canvas.scale(f17, f17);
                                    drawable4.setBounds(0, 0, (int) Math.ceil(getMeasuredWidth() / f17), (int) Math.ceil(getRootView().getMeasuredHeight() / f17));
                                    drawable4.draw(canvas);
                                    sw0.G(sw0Var, canvas);
                                    canvas.restore();
                                } else {
                                    int currentActionBarHeight2 = (sw0Var.P() ? org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() : 0) + ((sw0Var.Q() && sw0Var.s) ? AndroidUtilities.statusBarHeight : 0);
                                    int measuredHeight2 = sw0Var.Y() ? getRootView().getMeasuredHeight() - currentActionBarHeight2 : getHeight();
                                    float max3 = Math.max(getMeasuredWidth() / drawable4.getIntrinsicWidth(), measuredHeight2 / drawable4.getIntrinsicHeight());
                                    int ceil3 = (int) Math.ceil(drawable4.getIntrinsicWidth() * max3 * f7);
                                    int ceil4 = (int) Math.ceil(drawable4.getIntrinsicHeight() * max3 * f7);
                                    int measuredWidth3 = ((getMeasuredWidth() - ceil3) / 2) + ((int) f10);
                                    int i15 = ((measuredHeight2 - ceil4) / 2) + sw0Var.E + currentActionBarHeight2 + ((int) f11);
                                    canvas.save();
                                    canvas.clipRect(0, currentActionBarHeight2, ceil3, getMeasuredHeight() - sw0Var.h);
                                    drawable4.setBounds(measuredWidth3, i15, ceil3 + measuredWidth3, ceil4 + i15);
                                    drawable4.draw(canvas);
                                    sw0.G(sw0Var, canvas);
                                    canvas.restore();
                                }
                            }
                            if (i13 == 0 && (drawable = sw0Var.d) != null && sw0Var.l0 >= f12) {
                                if (sw0Var.M && (drawable instanceof co)) {
                                    ((co) drawable).g(sw0Var.L);
                                }
                                if (sw0Var.M) {
                                    Drawable drawable5 = sw0Var.d;
                                    if (drawable5 instanceof cd0) {
                                        ((cd0) drawable5).l();
                                    }
                                }
                                sw0Var.d = null;
                                sw0Var.e = false;
                                sw0Var.I();
                                sw0Var.L.invalidate();
                            }
                        }
                        i13++;
                        f15 = f12;
                        f14 = 0.0f;
                    }
                    if (sw0Var.l0 != f15) {
                        sw0Var.L.invalidate();
                        break;
                    }
                }
                break;
            case 26:
                super.onDraw(canvas);
                int x02 = org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.Vi, false);
                gz0 gz0Var = (gz0) this.b;
                org.telegram.ui.Components.voip.h hVar = gz0Var.L;
                Paint paint3 = gz0Var.a;
                paint3.setColor(x02);
                Paint paint4 = gz0Var.b;
                paint4.setColor(x02);
                Paint paint5 = gz0Var.c;
                paint5.setColor(x02);
                paint4.setAlpha(255);
                paint5.setAlpha(82);
                paint3.setAlpha(46);
                Paint paint6 = gz0Var.d;
                paint6.setColor(org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.d6, false));
                canvas.drawLine(AndroidUtilities.dp(24.0f), AndroidUtilities.dp(20.0f), getMeasuredWidth() - AndroidUtilities.dp(24.0f), AndroidUtilities.dp(20.0f), paint3);
                boolean z10 = gz0Var.e;
                if (z10 || gz0Var.J != 0.0f) {
                    if (!z10) {
                        float f18 = gz0Var.J - 0.10666667f;
                        gz0Var.J = f18;
                        if (f18 < 0.0f) {
                            gz0Var.J = 0.0f;
                        }
                    } else if (gz0Var.K) {
                        float f19 = gz0Var.J + 0.024615385f;
                        gz0Var.J = f19;
                        if (f19 > 1.0f) {
                            gz0Var.J = 1.0f;
                            gz0Var.K = false;
                        }
                    } else {
                        float f20 = gz0Var.J - 0.024615385f;
                        gz0Var.J = f20;
                        if (f20 < 0.0f) {
                            gz0Var.J = 0.0f;
                            gz0Var.K = true;
                        }
                    }
                    invalidate();
                    RectF rectF2 = AndroidUtilities.rectTmp;
                    rectF2.set(AndroidUtilities.dp(24.0f), AndroidUtilities.dp(17.0f), getMeasuredWidth() - AndroidUtilities.dp(24.0f), AndroidUtilities.dp(23.0f));
                    hVar.f = getMeasuredWidth();
                    hVar.a(AndroidUtilities.dp(3.0f), canvas, rectF2, null);
                }
                int dp2 = AndroidUtilities.dp(24.0f);
                if (gz0Var.e) {
                    f13 = 1.0f;
                    paint = paint6;
                } else {
                    int dp3 = AndroidUtilities.dp(24.0f) + ((int) (bi.B(24.0f, 2, getMeasuredWidth()) * gz0Var.F));
                    f13 = 1.0f;
                    canvas.drawLine(dp2, AndroidUtilities.dp(20.0f), AndroidUtilities.dp(24.0f) + r2, AndroidUtilities.dp(20.0f), paint5);
                    canvas.drawRect(dp3, AndroidUtilities.dp(20.0f) - AndroidUtilities.dp(3.0f), AndroidUtilities.dp(3.0f) + dp3, AndroidUtilities.dp(3.0f) + AndroidUtilities.dp(20.0f), paint6);
                    paint = paint6;
                }
                if (!gz0Var.e) {
                    int B3 = (int) (bi.B(24.0f, 2, getMeasuredWidth()) * gz0Var.E);
                    if (B3 < AndroidUtilities.dp(f13)) {
                        B3 = AndroidUtilities.dp(f13);
                    }
                    int dp4 = AndroidUtilities.dp(24.0f) + B3;
                    canvas.drawLine(dp2, AndroidUtilities.dp(20.0f), AndroidUtilities.dp(24.0f) + B3, AndroidUtilities.dp(20.0f), paint4);
                    canvas.drawRect(dp4, AndroidUtilities.dp(20.0f) - AndroidUtilities.dp(3.0f), AndroidUtilities.dp(3.0f) + dp4, AndroidUtilities.dp(3.0f) + AndroidUtilities.dp(20.0f), paint);
                    break;
                }
                break;
            case 27:
                if (getAlpha() != 0.0f) {
                    RectF rectF3 = AndroidUtilities.rectTmp;
                    rectF3.set(0.0f, 0.0f, getWidth(), getHeight());
                    ((org.telegram.ui.Components.voip.j1) this.b).n.a(AndroidUtilities.dp(10.0f), canvas, rectF3, null);
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
        org.telegram.ui.ActionBar.k kVar3;
        switch (this.a) {
            case 1:
                di.i iVar = (di.i) this.b;
                if (iVar.H) {
                    int i15 = iVar.I;
                    kVar = ((org.telegram.ui.ActionBar.n2) iVar).actionBar;
                    i12 = (kVar.getMeasuredHeight() + i15) - AndroidUtilities.dp(16.0f);
                } else {
                    int dp = AndroidUtilities.dp(140.0f) + iVar.I;
                    if (AndroidUtilities.dp(24.0f) + iVar.y.getMeasuredHeight() > dp) {
                        dp = AndroidUtilities.dp(24.0f) + iVar.y.getMeasuredHeight();
                    }
                    i12 = dp;
                }
                super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec((int) (i12 - (0 * 2.5f)), TLObject.FLAG_30));
                break;
            case 2:
                ei.l lVar = (ei.l) this.b;
                if (lVar.H) {
                    int i16 = lVar.I;
                    kVar2 = ((org.telegram.ui.ActionBar.n2) lVar).actionBar;
                    i13 = (kVar2.getMeasuredHeight() + i16) - AndroidUtilities.dp(16.0f);
                } else {
                    int dp2 = AndroidUtilities.dp(140.0f) + lVar.I;
                    if (AndroidUtilities.dp(24.0f) + lVar.y.getMeasuredHeight() > dp2) {
                        dp2 = AndroidUtilities.dp(24.0f) + lVar.y.getMeasuredHeight();
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
            case 24:
            case 27:
            case 28:
            default:
                super.onMeasure(i10, i11);
                break;
            case 4:
                ((View) getParent()).getMeasuredHeight();
                gg.p1 p1Var = (gg.p1) this.b;
                Integer num = p1Var.d;
                if (num != null) {
                    i14 = num.intValue();
                    p1Var.h = i14;
                } else {
                    i14 = 0;
                    p1Var.h = 0;
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
                s4.d0 d0Var = ((org.telegram.ui.o5) this.b).d.F;
                super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(Math.max(0, d0Var instanceof f00 ? ((f00) d0Var).J : 0), TLObject.FLAG_30));
                break;
            case 12:
                org.telegram.ui.Components.eb ebVar = (org.telegram.ui.Components.eb) this.b;
                int i17 = ebVar.h;
                int dp3 = (i17 == 0 ? AndroidUtilities.dp(300.0f) : (int) (i17 * ebVar.v)) - (((ebVar.G - ebVar.H) - ebVar.I) - ebVar.J);
                if (dp3 < 1) {
                    dp3 = 1;
                }
                super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(dp3, TLObject.FLAG_30));
                break;
            case 13:
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(((ym) this.b).v.J, TLObject.FLAG_30));
                break;
            case 14:
                setMeasuredDimension(View.MeasureSpec.getSize(i10), ((jo) this.b).d.R0);
                break;
            case 15:
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(((mo) ((org.telegram.ui.v7) this.b).d).w, TLObject.FLAG_30));
                break;
            case 17:
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(getPaddingRight() + getPaddingLeft() + Math.round(((l11) this.b).l()), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(Math.max(getPaddingBottom() + getPaddingTop() + Math.round(((l11) this.b).j()), AndroidUtilities.dp(26.0f)), TLObject.FLAG_30));
                break;
            case 18:
                super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(48.0f) + ((x70) this.b).c.o0, TLObject.FLAG_30));
                break;
            case 19:
                int dp4 = AndroidUtilities.dp(48.0f);
                d80 d80Var = ((z70) this.b).n;
                super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(dp4 + d80Var.o0 + d80Var.u0, TLObject.FLAG_30));
                break;
            case 22:
                super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(((ir0) this.b).K.J.R, TLObject.FLAG_30));
                break;
            case 25:
                px0 px0Var = (px0) this.b;
                int size = View.MeasureSpec.getSize(i10);
                if (size <= 0) {
                    size = ((View) getParent()).getMeasuredWidth();
                }
                int size2 = View.MeasureSpec.getSize(i11) - AndroidUtilities.dp(4.0f);
                yx0 yx0Var = px0Var.d;
                int i18 = yx0Var.e3;
                int max = Math.max(i18 > 0 ? AndroidUtilities.dp(4.0f) + i18 : 0, (int) (size - Math.min(AndroidUtilities.dp(4.0f) + ((px0Var.h() - 1) * size2), px0Var.d.V2 * size2)));
                yx0Var.d3 = max;
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(max, TLObject.FLAG_30), i11);
                break;
            case 26:
                super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(40.0f), TLObject.FLAG_30));
                break;
            case 29:
                p20 p20Var = (p20) this.b;
                if (p20Var.H) {
                    int i19 = p20Var.I;
                    kVar3 = ((org.telegram.ui.ActionBar.n2) p20Var).actionBar;
                    p20Var.J = (kVar3.getMeasuredHeight() + i19) - AndroidUtilities.dp(16.0f);
                } else {
                    int dp5 = AndroidUtilities.dp(140.0f) + p20Var.I;
                    if (AndroidUtilities.dp(24.0f) + p20Var.y.getMeasuredHeight() > dp5) {
                        dp5 = Math.max(dp5, (AndroidUtilities.dp(24.0f) + p20Var.y.getMeasuredHeight()) - p20Var.L);
                    }
                    p20Var.J = dp5;
                }
                int i20 = (int) (p20Var.J - (0 * 2.5f));
                p20Var.J = i20;
                super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(i20, TLObject.FLAG_30));
                break;
        }
    }

    @Override // android.view.View
    public void onSizeChanged(int i10, int i11, int i12, int i13) {
        switch (this.a) {
            case 27:
                super.onSizeChanged(i10, i11, i12, i13);
                ((org.telegram.ui.Components.voip.j1) this.b).n.f = i10;
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
                View view = ((org.telegram.ui.b8) this.b).b.x.fragmentView;
                if (view != null) {
                    view.invalidate();
                    break;
                }
                break;
            case 28:
                super.setAlpha(f7);
                View view2 = ((ty) this.b).fragmentView;
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
                viewGroup = ((org.telegram.ui.ActionBar.f3) ((org.telegram.ui.Components.eb) this.b)).containerView;
                viewGroup.invalidate();
                break;
            default:
                super.setTranslationY(f7);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ bb(Object obj, Context context, int i10) {
        super(context);
        this.a = i10;
        this.b = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bb(org.telegram.ui.Components.eb ebVar, Context context) {
        super(context);
        this.a = 12;
        this.b = ebVar;
        setTag(-33024);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bb(Context context, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context);
        this.a = 7;
        CheckBoxBase checkBoxBase = new CheckBoxBase(20, this, e6Var);
        this.b = checkBoxBase;
        checkBoxBase.h(org.telegram.ui.ActionBar.i6.hl, org.telegram.ui.ActionBar.i6.z5, org.telegram.ui.ActionBar.i6.k7);
        checkBoxBase.d(10);
        checkBoxBase.k(true);
        checkBoxBase.i(AndroidUtilities.dp(5.0f));
    }
}
