package fh;

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
import gh.oa;
import kh.mb;
import kh.wb;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LiteMode;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.ll;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.Components.bz;
import org.telegram.ui.Components.dp0;
import org.telegram.ui.Components.e60;
import org.telegram.ui.Components.ew0;
import org.telegram.ui.Components.g60;
import org.telegram.ui.Components.hn;
import org.telegram.ui.Components.jb0;
import org.telegram.ui.Components.k60;
import org.telegram.ui.Components.ln;
import org.telegram.ui.Components.mx0;
import org.telegram.ui.Components.np0;
import org.telegram.ui.Components.nz0;
import org.telegram.ui.Components.rp0;
import org.telegram.ui.Components.sa;
import org.telegram.ui.Components.vh0;
import org.telegram.ui.Components.vv0;
import org.telegram.ui.Components.wq;
import org.telegram.ui.Components.xu0;
import org.telegram.ui.Components.yl;
import org.telegram.ui.b50;
import org.telegram.ui.b8;
import org.telegram.ui.dy;
import org.telegram.ui.gt0;
import org.telegram.ui.tn;
import org.telegram.ui.v7;
import org.telegram.ui.x10;
import org.telegram.ui.z40;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class l2 extends View {
    public final /* synthetic */ int a;
    public Object b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l2(Context context, int i9) {
        super(context);
        this.a = i9;
    }

    @Override // android.view.View
    public void dispatchDraw(Canvas canvas) {
        switch (this.a) {
            case 2:
                canvas.save();
                wb wbVar = (wb) this.b;
                canvas.translate(wbVar.Y0.getX() + wbVar.h0.getX(), wbVar.Y0.getY() + wbVar.h0.getY());
                mb mbVar = wbVar.Y0;
                mbVar.k(canvas, mbVar.getBounds(), wbVar.Y0.getOver2Alpha());
                canvas.restore();
                break;
            case 7:
                canvas.drawRect(0.0f, 0.0f, getWidth(), getHeight(), ((org.telegram.ui.ActionBar.i3) this.b).d);
                break;
            case 29:
                super.dispatchDraw(canvas);
                z40 z40Var = (z40) this.b;
                if (z40Var != null && z40Var.a(canvas, getMeasuredWidth(), 0.0f)) {
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
            case 16:
                super.draw(canvas);
                ((nz0) this.b).e(canvas, (getMeasuredWidth() - ((nz0) this.b).l()) / 2.0f, getMeasuredHeight() / 2.0f);
                break;
            case 20:
                super.draw(canvas);
                rp0 rp0Var = (rp0) this.b;
                rp0Var.S0.setBounds(0, (getMeasuredHeight() - rp0Var.C0.d) - AndroidUtilities.dp(72.0f), getMeasuredWidth(), getMeasuredHeight());
                rp0Var.S0.draw(canvas);
                break;
            default:
                super.draw(canvas);
                break;
        }
    }

    @Override // android.view.View
    public void invalidate() {
        switch (this.a) {
            case 23:
                super.invalidate();
                ((xu0) this.b).T();
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
                k2 k2Var = (k2) this.b;
                if (k2Var != null && !k2Var.i) {
                    k2Var.i = true;
                    k2Var.a();
                    bg.i iVar = new bg.i(k2Var, 7);
                    k2Var.h = iVar;
                    LiteMode.addOnPowerSaverAppliedListener(iVar);
                    break;
                }
                break;
            case 6:
                super.onAttachedToWindow();
                ((of.k1) this.b).f = true;
                break;
            case 29:
                super.onAttachedToWindow();
                z40 z40Var = (z40) this.b;
                if (z40Var != null) {
                    z40Var.g = this;
                    int i9 = 0;
                    while (true) {
                        b50[] b50VarArr = z40Var.c;
                        if (i9 >= b50VarArr.length) {
                            break;
                        } else {
                            b50 b50Var = b50VarArr[i9];
                            b50Var.i.add(this);
                            b50Var.a();
                            i9++;
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
            case 0:
                super.onDetachedFromWindow();
                k2 k2Var = (k2) this.b;
                if (k2Var != null && k2Var.i) {
                    k2Var.i = false;
                    k2Var.a();
                    LiteMode.removeOnPowerSaverAppliedListener(k2Var.h);
                    break;
                }
                break;
            case 6:
                super.onDetachedFromWindow();
                ((of.k1) this.b).f = false;
                break;
            case 29:
                super.onDetachedFromWindow();
                z40 z40Var = (z40) this.b;
                if (z40Var != null && z40Var.g != this) {
                    int i9 = 0;
                    while (true) {
                        b50[] b50VarArr = z40Var.c;
                        if (i9 >= b50VarArr.length) {
                            z40Var.g = null;
                            break;
                        } else {
                            b50 b50Var = b50VarArr[i9];
                            b50Var.i.remove(this);
                            b50Var.a();
                            i9++;
                        }
                    }
                }
                break;
            default:
                super.onDetachedFromWindow();
                break;
        }
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        int i9;
        int i10;
        float f10;
        float f11;
        float f12;
        float f13;
        Drawable drawable;
        Paint paint;
        float f14;
        switch (this.a) {
            case 5:
                super.onDraw(canvas);
                nh.j0 j0Var = (nh.j0) this.b;
                ff.c0 c0Var = j0Var.G;
                float max = Math.max(j0Var.b.e, j0Var.c.e);
                ff.c0 c0Var2 = j0Var.F;
                c0Var2.c(AndroidUtilities.dp(42.0f) + j0Var.Q.b, 0);
                c0Var2.setBounds(0, 0, getWidth(), AndroidUtilities.dp(56.0f) + j0Var.Q.b);
                int i11 = org.telegram.ui.ActionBar.f6.a7;
                c0Var2.b(org.telegram.ui.ActionBar.f6.l1(AndroidUtilities.lerp(1.0f, 0.8f, max), j0Var.getThemedColor(i11)));
                c0Var2.draw(canvas);
                if (j0Var.J) {
                    max = 1.0f;
                }
                int lerp = AndroidUtilities.lerp(AndroidUtilities.dp(48.0f) + j0Var.Q.d, 0, max);
                int lerp2 = AndroidUtilities.lerp(AndroidUtilities.dp(72.0f), 0, max) + j0Var.Q.d;
                float lerp3 = AndroidUtilities.lerp(0.8f, AndroidUtilities.getNavigationBarThirdButtonsFactor(j0Var.Q.d), max);
                c0Var.c(0, lerp);
                c0Var.setBounds(0, getHeight() - lerp2, getWidth(), getHeight());
                c0Var.b(org.telegram.ui.ActionBar.f6.l1(lerp3, j0Var.getThemedColor(i11)));
                c0Var.draw(canvas);
                break;
            case 10:
                org.telegram.ui.Cells.r2 r2Var = (org.telegram.ui.Cells.r2) this.b;
                r2Var.f4.setBounds(0, 0, getWidth(), getHeight());
                r2Var.f4.draw(canvas);
                break;
            case 15:
                wq wqVar = (wq) this.b;
                if (wqVar.V) {
                    i9 = ((org.telegram.ui.ActionBar.f3) wqVar).backgroundPaddingLeft;
                    int measuredWidth = getMeasuredWidth();
                    i10 = ((org.telegram.ui.ActionBar.f3) wqVar).backgroundPaddingLeft;
                    canvas.drawRect(i9, 0.0f, measuredWidth - i10, 1.0f, org.telegram.ui.ActionBar.f6.k0);
                    break;
                }
                break;
            case 19:
                super.onDraw(canvas);
                ((gt0) this.b).j(canvas, getMeasuredWidth(), getMeasuredHeight());
                break;
            case 22:
                super.onDraw(canvas);
                int offsetColor = AndroidUtilities.getOffsetColor(-9057429, -10513163, getTranslationX() / getMeasuredWidth(), 1.0f);
                int offsetColor2 = AndroidUtilities.getOffsetColor(-11554882, -4629871, getTranslationX() / getMeasuredWidth(), 1.0f);
                dp0 dp0Var = (dp0) this.b;
                RectF rectF = dp0Var.h;
                Paint paint2 = dp0Var.f;
                if (offsetColor != 0) {
                    paint2.setShader(new LinearGradient(0.0f, 0.0f, getMeasuredWidth(), 0.0f, new int[]{offsetColor, offsetColor2}, (float[]) null, Shader.TileMode.CLAMP));
                }
                rectF.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                canvas.drawRoundRect(rectF, AndroidUtilities.dp(18.0f), AndroidUtilities.dp(18.0f), paint2);
                break;
            case 23:
                xu0 xu0Var = (xu0) this.b;
                if (xu0Var.b != null && !xu0Var.F) {
                    Drawable newDrawable = xu0Var.getNewDrawable();
                    boolean newDrawableMotion = xu0Var.getNewDrawableMotion();
                    Drawable drawable2 = xu0Var.b;
                    if (newDrawable != drawable2 && newDrawable != null) {
                        if (org.telegram.ui.ActionBar.f6.sl != null) {
                            xu0Var.d = drawable2;
                            xu0Var.e = xu0Var.c;
                        }
                        if (newDrawable instanceof jb0) {
                            ((jb0) newDrawable).r(xu0Var.H);
                        }
                        xu0Var.b = newDrawable;
                        if (xu0Var.I && (newDrawable instanceof tn)) {
                            ((tn) newDrawable).f(this);
                        }
                        if (xu0Var.I) {
                            Drawable drawable3 = xu0Var.b;
                            if (drawable3 instanceof jb0) {
                                ((jb0) drawable3).k();
                            }
                        }
                        xu0Var.c = newDrawableMotion;
                        xu0Var.h0 = 0.0f;
                        xu0Var.U(xu0Var.b);
                        xu0Var.I();
                    } else if (xu0Var.c != newDrawableMotion) {
                        xu0Var.c = newDrawableMotion;
                        xu0Var.I();
                    }
                    xu0Var.h0 = Utilities.clamp((AndroidUtilities.screenRefreshTime / 200.0f) + xu0Var.h0, 1.0f, 0.0f);
                    int i12 = 0;
                    while (i12 < 2) {
                        Drawable drawable4 = i12 == 0 ? xu0Var.d : xu0Var.b;
                        if (drawable4 != null) {
                            if (i12 != 1 || xu0Var.d == null || xu0Var.C == null) {
                                drawable4.setAlpha(255);
                            } else {
                                drawable4.setAlpha((int) (xu0Var.h0 * 255.0f));
                            }
                            if (i12 == 0 ? xu0Var.e : xu0Var.c) {
                                f10 = xu0Var.y;
                                f11 = xu0Var.w;
                                f12 = xu0Var.x;
                            } else {
                                f10 = 1.0f;
                                f11 = 0.0f;
                                f12 = 0.0f;
                            }
                            if (drawable4 instanceof jb0) {
                                jb0 jb0Var = (jb0) drawable4;
                                if (jb0Var.u != null) {
                                    int currentActionBarHeight = (xu0Var.P() ? org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() : 0) + ((xu0Var.Q() && xu0Var.s) ? AndroidUtilities.statusBarHeight : 0);
                                    int measuredHeight = xu0Var.Y() ? getRootView().getMeasuredHeight() - currentActionBarHeight : getHeight();
                                    f13 = 1.0f;
                                    float max2 = Math.max(getMeasuredWidth() / drawable4.getIntrinsicWidth(), measuredHeight / drawable4.getIntrinsicHeight());
                                    int ceil = (int) Math.ceil(drawable4.getIntrinsicWidth() * max2 * f10);
                                    int ceil2 = (int) Math.ceil(drawable4.getIntrinsicHeight() * max2 * f10);
                                    int measuredWidth2 = ((getMeasuredWidth() - ceil) / 2) + ((int) f11);
                                    int i13 = ((measuredHeight - ceil2) / 2) + xu0Var.A + currentActionBarHeight + ((int) f12);
                                    canvas.save();
                                    canvas.clipRect(0, currentActionBarHeight, ceil, getMeasuredHeight() - xu0Var.h);
                                    drawable4.setBounds(measuredWidth2, i13, ceil + measuredWidth2, ceil2 + i13);
                                    drawable4.draw(canvas);
                                    xu0.H(xu0Var, canvas);
                                    canvas.restore();
                                } else {
                                    f13 = 1.0f;
                                    if (xu0Var.h != 0) {
                                        canvas.save();
                                        canvas.clipRect(0, 0, getMeasuredWidth(), getRootView().getMeasuredHeight() - xu0Var.h);
                                    }
                                    jb0Var.f = xu0Var.A;
                                    drawable4.setBounds(0, 0, getMeasuredWidth(), (int) ((getRootView().getMeasuredHeight() - xu0Var.A) + f12));
                                    drawable4.draw(canvas);
                                    if (xu0Var.h != 0) {
                                        canvas.restore();
                                    }
                                }
                            } else {
                                f13 = 1.0f;
                                if (drawable4 instanceof ColorDrawable) {
                                    if (xu0Var.h != 0) {
                                        canvas.save();
                                        canvas.clipRect(0, 0, getMeasuredWidth(), getMeasuredHeight() - xu0Var.h);
                                    }
                                    drawable4.setBounds(0, 0, getMeasuredWidth(), getRootView().getMeasuredHeight());
                                    drawable4.draw(canvas);
                                    xu0.H(xu0Var, canvas);
                                    if (xu0Var.h != 0) {
                                        canvas.restore();
                                    }
                                } else if (drawable4 instanceof GradientDrawable) {
                                    if (xu0Var.h != 0) {
                                        canvas.save();
                                        canvas.clipRect(0, 0, getMeasuredWidth(), getRootView().getMeasuredHeight() - xu0Var.h);
                                    }
                                    drawable4.setBounds(0, xu0Var.A, getMeasuredWidth(), getRootView().getMeasuredHeight() + xu0Var.A);
                                    drawable4.draw(canvas);
                                    xu0.H(xu0Var, canvas);
                                    if (xu0Var.h != 0) {
                                        canvas.restore();
                                    }
                                } else if (!(drawable4 instanceof BitmapDrawable)) {
                                    if (xu0Var.h != 0) {
                                        canvas.save();
                                        canvas.clipRect(0, 0, getMeasuredWidth(), getRootView().getMeasuredHeight() - xu0Var.h);
                                    }
                                    if (drawable4 instanceof tn) {
                                        tn tnVar = (tn) drawable4;
                                        tnVar.b = this;
                                        jb0 jb0Var2 = tnVar.f;
                                        if (jb0Var2 != null) {
                                            jb0Var2.r(this);
                                        }
                                    }
                                    float f15 = f10 - 1.0f;
                                    float d = aa.d.d(-getMeasuredWidth(), f15, 2.0f, f11);
                                    float d9 = aa.d.d(-getRootView().getMeasuredHeight(), f15, 2.0f, f12);
                                    drawable4.setBounds((int) d, (int) (xu0Var.A + d9), (int) ((getMeasuredWidth() * f10) + d), (int) aa.d.w(getRootView().getMeasuredHeight(), f10, xu0Var.A, d9));
                                    drawable4.draw(canvas);
                                    xu0.H(xu0Var, canvas);
                                    if (xu0Var.h != 0) {
                                        canvas.restore();
                                    }
                                } else if (((BitmapDrawable) drawable4).getTileModeX() == Shader.TileMode.REPEAT) {
                                    canvas.save();
                                    float f16 = 2.0f / AndroidUtilities.density;
                                    canvas.scale(f16, f16);
                                    drawable4.setBounds(0, 0, (int) Math.ceil(getMeasuredWidth() / f16), (int) Math.ceil(getRootView().getMeasuredHeight() / f16));
                                    drawable4.draw(canvas);
                                    xu0.H(xu0Var, canvas);
                                    canvas.restore();
                                } else {
                                    int currentActionBarHeight2 = (xu0Var.P() ? org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() : 0) + ((xu0Var.Q() && xu0Var.s) ? AndroidUtilities.statusBarHeight : 0);
                                    int measuredHeight2 = xu0Var.Y() ? getRootView().getMeasuredHeight() - currentActionBarHeight2 : getHeight();
                                    float max3 = Math.max(getMeasuredWidth() / drawable4.getIntrinsicWidth(), measuredHeight2 / drawable4.getIntrinsicHeight());
                                    int ceil3 = (int) Math.ceil(drawable4.getIntrinsicWidth() * max3 * f10);
                                    int ceil4 = (int) Math.ceil(drawable4.getIntrinsicHeight() * max3 * f10);
                                    int measuredWidth3 = ((getMeasuredWidth() - ceil3) / 2) + ((int) f11);
                                    int i14 = ((measuredHeight2 - ceil4) / 2) + xu0Var.A + currentActionBarHeight2 + ((int) f12);
                                    canvas.save();
                                    canvas.clipRect(0, currentActionBarHeight2, ceil3, getMeasuredHeight() - xu0Var.h);
                                    drawable4.setBounds(measuredWidth3, i14, ceil3 + measuredWidth3, ceil4 + i14);
                                    drawable4.draw(canvas);
                                    xu0.H(xu0Var, canvas);
                                    canvas.restore();
                                }
                            }
                            if (i12 == 0 && (drawable = xu0Var.d) != null && xu0Var.h0 >= f13) {
                                if (xu0Var.I && (drawable instanceof tn)) {
                                    ((tn) drawable).g(xu0Var.H);
                                }
                                if (xu0Var.I) {
                                    Drawable drawable5 = xu0Var.d;
                                    if (drawable5 instanceof jb0) {
                                        ((jb0) drawable5).l();
                                    }
                                }
                                xu0Var.d = null;
                                xu0Var.e = false;
                                xu0Var.I();
                                xu0Var.H.invalidate();
                            }
                        }
                        i12++;
                    }
                    if (xu0Var.h0 != 1.0f) {
                        xu0Var.H.invalidate();
                        break;
                    }
                }
                break;
            case 25:
                super.onDraw(canvas);
                int w02 = org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.Vi, false);
                mx0 mx0Var = (mx0) this.b;
                org.telegram.ui.Components.voip.h hVar = mx0Var.H;
                Paint paint3 = mx0Var.a;
                paint3.setColor(w02);
                Paint paint4 = mx0Var.b;
                paint4.setColor(w02);
                Paint paint5 = mx0Var.c;
                paint5.setColor(w02);
                paint4.setAlpha(255);
                paint5.setAlpha(82);
                paint3.setAlpha(46);
                Paint paint6 = mx0Var.d;
                paint6.setColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.d6, false));
                canvas.drawLine(AndroidUtilities.dp(24.0f), AndroidUtilities.dp(20.0f), getMeasuredWidth() - AndroidUtilities.dp(24.0f), AndroidUtilities.dp(20.0f), paint3);
                boolean z10 = mx0Var.e;
                if (z10 || mx0Var.F != 0.0f) {
                    if (!z10) {
                        float f17 = mx0Var.F - 0.10666667f;
                        mx0Var.F = f17;
                        if (f17 < 0.0f) {
                            mx0Var.F = 0.0f;
                        }
                    } else if (mx0Var.G) {
                        float f18 = mx0Var.F + 0.024615385f;
                        mx0Var.F = f18;
                        if (f18 > 1.0f) {
                            mx0Var.F = 1.0f;
                            mx0Var.G = false;
                        }
                    } else {
                        float f19 = mx0Var.F - 0.024615385f;
                        mx0Var.F = f19;
                        if (f19 < 0.0f) {
                            mx0Var.F = 0.0f;
                            mx0Var.G = true;
                        }
                    }
                    invalidate();
                    RectF rectF2 = AndroidUtilities.rectTmp;
                    rectF2.set(AndroidUtilities.dp(24.0f), AndroidUtilities.dp(17.0f), getMeasuredWidth() - AndroidUtilities.dp(24.0f), AndroidUtilities.dp(23.0f));
                    hVar.f = getMeasuredWidth();
                    hVar.a(AndroidUtilities.dp(3.0f), canvas, rectF2, null);
                }
                int dp = AndroidUtilities.dp(24.0f);
                if (mx0Var.e) {
                    paint = paint6;
                    f14 = 1.0f;
                } else {
                    int dp2 = AndroidUtilities.dp(24.0f) + ((int) (ll.A(24.0f, 2, getMeasuredWidth()) * mx0Var.B));
                    f14 = 1.0f;
                    canvas.drawLine(dp, AndroidUtilities.dp(20.0f), AndroidUtilities.dp(24.0f) + r2, AndroidUtilities.dp(20.0f), paint5);
                    canvas.drawRect(dp2, AndroidUtilities.dp(20.0f) - AndroidUtilities.dp(3.0f), AndroidUtilities.dp(3.0f) + dp2, AndroidUtilities.dp(3.0f) + AndroidUtilities.dp(20.0f), paint6);
                    paint = paint6;
                }
                if (!mx0Var.e) {
                    int A = (int) (ll.A(24.0f, 2, getMeasuredWidth()) * mx0Var.A);
                    if (A < AndroidUtilities.dp(f14)) {
                        A = AndroidUtilities.dp(f14);
                    }
                    int dp3 = AndroidUtilities.dp(24.0f) + A;
                    canvas.drawLine(dp, AndroidUtilities.dp(20.0f), AndroidUtilities.dp(24.0f) + A, AndroidUtilities.dp(20.0f), paint4);
                    canvas.drawRect(dp3, AndroidUtilities.dp(20.0f) - AndroidUtilities.dp(3.0f), AndroidUtilities.dp(3.0f) + dp3, AndroidUtilities.dp(3.0f) + AndroidUtilities.dp(20.0f), paint);
                    break;
                }
                break;
            case 26:
                if (getAlpha() != 0.0f) {
                    RectF rectF3 = AndroidUtilities.rectTmp;
                    rectF3.set(0.0f, 0.0f, getWidth(), getHeight());
                    ((org.telegram.ui.Components.voip.g1) this.b).n.a(AndroidUtilities.dp(10.0f), canvas, rectF3, null);
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
    public void onMeasure(int i9, int i10) {
        int i11;
        org.telegram.ui.ActionBar.k kVar;
        int i12;
        org.telegram.ui.ActionBar.k kVar2;
        int i13;
        org.telegram.ui.ActionBar.k kVar3;
        int i14;
        org.telegram.ui.ActionBar.k kVar4;
        switch (this.a) {
            case 1:
                oa oaVar = (oa) this.b;
                if (oaVar.D) {
                    int i15 = oaVar.E;
                    kVar = ((org.telegram.ui.ActionBar.o2) oaVar).actionBar;
                    i11 = (kVar.getMeasuredHeight() + i15) - AndroidUtilities.dp(16.0f);
                } else {
                    int dp = AndroidUtilities.dp(140.0f) + oaVar.E;
                    if (AndroidUtilities.dp(24.0f) + oaVar.y.getMeasuredHeight() > dp) {
                        dp = AndroidUtilities.dp(24.0f) + oaVar.y.getMeasuredHeight();
                    }
                    i11 = dp;
                }
                super.onMeasure(i9, View.MeasureSpec.makeMeasureSpec((int) (i11 - (0 * 2.5f)), TLObject.FLAG_30));
                break;
            case 2:
            case 5:
            case 9:
            case 10:
            case 15:
            case 19:
            case 20:
            case 22:
            case 23:
            case 26:
            case 27:
            default:
                super.onMeasure(i9, i10);
                break;
            case 3:
                lh.g gVar = (lh.g) this.b;
                if (gVar.D) {
                    int i16 = gVar.E;
                    kVar2 = ((org.telegram.ui.ActionBar.o2) gVar).actionBar;
                    i12 = (kVar2.getMeasuredHeight() + i16) - AndroidUtilities.dp(16.0f);
                } else {
                    int dp2 = AndroidUtilities.dp(140.0f) + gVar.E;
                    if (AndroidUtilities.dp(24.0f) + gVar.y.getMeasuredHeight() > dp2) {
                        dp2 = AndroidUtilities.dp(24.0f) + gVar.y.getMeasuredHeight();
                    }
                    i12 = dp2;
                }
                super.onMeasure(i9, View.MeasureSpec.makeMeasureSpec((int) (i12 - (0 * 2.5f)), TLObject.FLAG_30));
                break;
            case 4:
                mh.l lVar = (mh.l) this.b;
                if (lVar.D) {
                    int i17 = lVar.E;
                    kVar3 = ((org.telegram.ui.ActionBar.o2) lVar).actionBar;
                    i13 = (kVar3.getMeasuredHeight() + i17) - AndroidUtilities.dp(16.0f);
                } else {
                    int dp3 = AndroidUtilities.dp(140.0f) + lVar.E;
                    if (AndroidUtilities.dp(24.0f) + lVar.y.getMeasuredHeight() > dp3) {
                        dp3 = AndroidUtilities.dp(24.0f) + lVar.y.getMeasuredHeight();
                    }
                    i13 = dp3;
                }
                super.onMeasure(i9, View.MeasureSpec.makeMeasureSpec((int) (i13 - (0 * 2.5f)), TLObject.FLAG_30));
                break;
            case 6:
                ((View) getParent()).getMeasuredHeight();
                of.k1 k1Var = (of.k1) this.b;
                Integer num = k1Var.d;
                if (num != null) {
                    i14 = num.intValue();
                    k1Var.h = i14;
                } else {
                    i14 = 0;
                    k1Var.h = 0;
                }
                super.onMeasure(i9, View.MeasureSpec.makeMeasureSpec(i14, TLObject.FLAG_30));
                break;
            case 7:
                setMeasuredDimension(View.MeasureSpec.getSize(i9), AndroidUtilities.navigationBarHeight);
                setTranslationY(AndroidUtilities.navigationBarHeight);
                break;
            case 8:
                f2.m0 m0Var = ((org.telegram.ui.o5) this.b).d.B;
                super.onMeasure(i9, View.MeasureSpec.makeMeasureSpec(Math.max(0, m0Var instanceof bz ? ((bz) m0Var).J : 0), TLObject.FLAG_30));
                break;
            case 11:
                sa saVar = (sa) this.b;
                int i18 = saVar.h;
                int dp4 = (i18 == 0 ? AndroidUtilities.dp(300.0f) : (int) (i18 * saVar.v)) - (((saVar.C - saVar.D) - saVar.E) - saVar.F);
                if (dp4 < 1) {
                    dp4 = 1;
                }
                super.onMeasure(i9, View.MeasureSpec.makeMeasureSpec(dp4, TLObject.FLAG_30));
                break;
            case 12:
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i9), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(((yl) this.b).v.F, TLObject.FLAG_30));
                break;
            case 13:
                setMeasuredDimension(View.MeasureSpec.getSize(i9), ((hn) this.b).d.N0);
                break;
            case 14:
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i9), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(((ln) ((v7) this.b).d).w, TLObject.FLAG_30));
                break;
            case 16:
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(getPaddingRight() + getPaddingLeft() + Math.round(((nz0) this.b).l()), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(Math.max(getPaddingBottom() + getPaddingTop() + Math.round(((nz0) this.b).j()), AndroidUtilities.dp(26.0f)), TLObject.FLAG_30));
                break;
            case 17:
                super.onMeasure(i9, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(48.0f) + ((e60) this.b).c.k0, TLObject.FLAG_30));
                break;
            case 18:
                int dp5 = AndroidUtilities.dp(48.0f);
                k60 k60Var = ((g60) this.b).n;
                super.onMeasure(i9, View.MeasureSpec.makeMeasureSpec(dp5 + k60Var.k0 + k60Var.q0, TLObject.FLAG_30));
                break;
            case 21:
                super.onMeasure(i9, View.MeasureSpec.makeMeasureSpec(((np0) this.b).G.F.R, TLObject.FLAG_30));
                break;
            case 24:
                vv0 vv0Var = (vv0) this.b;
                int size = View.MeasureSpec.getSize(i9);
                if (size <= 0) {
                    size = ((View) getParent()).getMeasuredWidth();
                }
                int size2 = View.MeasureSpec.getSize(i10) - AndroidUtilities.dp(4.0f);
                ew0 ew0Var = vv0Var.d;
                int i19 = ew0Var.c3;
                int max = Math.max(i19 > 0 ? AndroidUtilities.dp(4.0f) + i19 : 0, (int) (size - Math.min(AndroidUtilities.dp(4.0f) + ((vv0Var.h() - 1) * size2), vv0Var.d.T2 * size2)));
                ew0Var.b3 = max;
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(max, TLObject.FLAG_30), i10);
                break;
            case 25:
                super.onMeasure(i9, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(40.0f), TLObject.FLAG_30));
                break;
            case 28:
                x10 x10Var = (x10) this.b;
                if (x10Var.D) {
                    int i20 = x10Var.E;
                    kVar4 = ((org.telegram.ui.ActionBar.o2) x10Var).actionBar;
                    x10Var.F = (kVar4.getMeasuredHeight() + i20) - AndroidUtilities.dp(16.0f);
                } else {
                    int dp6 = AndroidUtilities.dp(140.0f) + x10Var.E;
                    if (AndroidUtilities.dp(24.0f) + x10Var.y.getMeasuredHeight() > dp6) {
                        dp6 = Math.max(dp6, (AndroidUtilities.dp(24.0f) + x10Var.y.getMeasuredHeight()) - x10Var.H);
                    }
                    x10Var.F = dp6;
                }
                int i21 = (int) (x10Var.F - (0 * 2.5f));
                x10Var.F = i21;
                super.onMeasure(i9, View.MeasureSpec.makeMeasureSpec(i21, TLObject.FLAG_30));
                break;
            case 29:
                setMeasuredDimension(View.MeasureSpec.getSize(i9), AndroidUtilities.dp(38.0f));
                break;
        }
    }

    @Override // android.view.View
    public void onSizeChanged(int i9, int i10, int i11, int i12) {
        switch (this.a) {
            case 26:
                super.onSizeChanged(i9, i10, i11, i12);
                ((org.telegram.ui.Components.voip.g1) this.b).n.f = i9;
                break;
            default:
                super.onSizeChanged(i9, i10, i11, i12);
                break;
        }
    }

    @Override // android.view.View
    public void setAlpha(float f10) {
        switch (this.a) {
            case 9:
                super.setAlpha(f10);
                View view = ((b8) this.b).b.x.fragmentView;
                if (view != null) {
                    view.invalidate();
                    break;
                }
                break;
            case 27:
                super.setAlpha(f10);
                View view2 = ((dy) this.b).fragmentView;
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
    public void setBackground(Drawable drawable) {
        switch (this.a) {
            case 0:
                if (((k2) this.b) != null) {
                    if (isAttachedToWindow()) {
                        k2 k2Var = (k2) this.b;
                        if (k2Var.i) {
                            k2Var.i = false;
                            k2Var.a();
                            LiteMode.removeOnPowerSaverAppliedListener(k2Var.h);
                        }
                    }
                    this.b = null;
                }
                super.setBackground(drawable);
                if (drawable instanceof k2) {
                    this.b = (k2) drawable;
                    if (isAttachedToWindow()) {
                        k2 k2Var2 = (k2) this.b;
                        if (!k2Var2.i) {
                            k2Var2.i = true;
                            k2Var2.a();
                            bg.i iVar = new bg.i(k2Var2, 7);
                            k2Var2.h = iVar;
                            LiteMode.addOnPowerSaverAppliedListener(iVar);
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
            case 22:
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
        ViewGroup viewGroup;
        switch (this.a) {
            case 11:
                super.setTranslationY(f10);
                viewGroup = ((org.telegram.ui.ActionBar.f3) ((sa) this.b)).containerView;
                viewGroup.invalidate();
                break;
            default:
                super.setTranslationY(f10);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l2(Object obj, Context context, int i9) {
        super(context);
        this.a = i9;
        this.b = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l2(sa saVar, Context context) {
        super(context);
        this.a = 11;
        this.b = saVar;
        setTag(-33024);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l2(Context context, z40 z40Var) {
        super(context);
        this.a = 29;
        this.b = z40Var;
        NotificationCenter.listenEmojiLoading(this);
        setOnClickListener(new vh0(27, this, context));
    }
}
