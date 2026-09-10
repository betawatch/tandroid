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
import org.telegram.messenger.em;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.Components.CheckBoxBase;
import org.telegram.ui.Components.ao;
import org.telegram.ui.Components.aw0;
import org.telegram.ui.Components.e70;
import org.telegram.ui.Components.eq0;
import org.telegram.ui.Components.g70;
import org.telegram.ui.Components.hx0;
import org.telegram.ui.Components.k70;
import org.telegram.ui.Components.lc0;
import org.telegram.ui.Components.mr;
import org.telegram.ui.Components.nm;
import org.telegram.ui.Components.oq0;
import org.telegram.ui.Components.ry0;
import org.telegram.ui.Components.sq0;
import org.telegram.ui.Components.t01;
import org.telegram.ui.Components.wz;
import org.telegram.ui.Components.xn;
import org.telegram.ui.Components.yw0;
import org.telegram.ui.ho;
import org.telegram.ui.hu0;
import org.telegram.ui.s20;
import org.telegram.ui.wy;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes4.dex */
public final class nc extends View {
    public final /* synthetic */ int a;
    public Object b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ nc(Context context) {
        super(context);
        this.a = 17;
    }

    @Override // android.view.View
    public void dispatchDraw(Canvas canvas) {
        switch (this.a) {
            case 0:
                canvas.save();
                ce ceVar = (ce) this.b;
                canvas.translate(ceVar.c1.getX() + ceVar.l0.getX(), ceVar.c1.getY() + ceVar.l0.getY());
                qd qdVar = ceVar.c1;
                qdVar.k(canvas, qdVar.getBounds(), ceVar.c1.getOver2Alpha());
                canvas.restore();
                break;
            case 5:
                zg.b bVar = ((gh.g) this.b).I;
                if (bVar != null) {
                    bVar.draw(canvas);
                }
                super.dispatchDraw(canvas);
                break;
            case 8:
                canvas.drawRect(0.0f, 0.0f, getWidth(), getHeight(), ((org.telegram.ui.ActionBar.k3) this.b).d);
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
                ((t01) this.b).e(canvas, (getMeasuredWidth() - ((t01) this.b).l()) / 2.0f, getMeasuredHeight() / 2.0f);
                break;
            case 21:
                super.draw(canvas);
                sq0 sq0Var = (sq0) this.b;
                sq0Var.W0.setBounds(0, (getMeasuredHeight() - sq0Var.G0.d) - AndroidUtilities.dp(72.0f), getMeasuredWidth(), getMeasuredHeight());
                sq0Var.W0.draw(canvas);
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
                ((aw0) this.b).T();
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
                ((fg.r1) this.b).f = true;
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
                ((fg.r1) this.b).f = false;
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
                ei.k0 k0Var = (ei.k0) this.b;
                xf.z zVar = k0Var.K;
                float max = Math.max(k0Var.b.e, k0Var.c.e);
                xf.z zVar2 = k0Var.J;
                zVar2.c(AndroidUtilities.dp(42.0f) + k0Var.U.b, 0);
                zVar2.setBounds(0, 0, getWidth(), AndroidUtilities.dp(56.0f) + k0Var.U.b);
                int i12 = org.telegram.ui.ActionBar.j6.a7;
                zVar2.b(org.telegram.ui.ActionBar.j6.l1(AndroidUtilities.lerp(1.0f, 0.8f, max), k0Var.getThemedColor(i12)));
                zVar2.draw(canvas);
                if (k0Var.N) {
                    max = 1.0f;
                }
                int lerp = AndroidUtilities.lerp(AndroidUtilities.dp(48.0f) + k0Var.U.d, 0, max);
                int lerp2 = AndroidUtilities.lerp(AndroidUtilities.dp(72.0f), 0, max) + k0Var.U.d;
                float lerp3 = AndroidUtilities.lerp(0.8f, AndroidUtilities.getNavigationBarThirdButtonsFactor(k0Var.U.d), max);
                zVar.c(0, lerp);
                zVar.setBounds(0, getHeight() - lerp2, getWidth(), getHeight());
                zVar.b(org.telegram.ui.ActionBar.j6.l1(lerp3, k0Var.getThemedColor(i12)));
                zVar.draw(canvas);
                break;
            case 6:
                canvas.save();
                canvas.translate(AndroidUtilities.dpf2(22.6f), AndroidUtilities.dpf2(21.66f));
                ((hi.w0) this.b).c.draw(canvas);
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
                org.telegram.ui.Cells.r2 r2Var = (org.telegram.ui.Cells.r2) this.b;
                r2Var.j4.setBounds(0, 0, getWidth(), getHeight());
                r2Var.j4.draw(canvas);
                break;
            case 16:
                mr mrVar = (mr) this.b;
                if (mrVar.Z) {
                    i10 = ((org.telegram.ui.ActionBar.h3) mrVar).backgroundPaddingLeft;
                    int measuredWidth = getMeasuredWidth();
                    i11 = ((org.telegram.ui.ActionBar.h3) mrVar).backgroundPaddingLeft;
                    canvas.drawRect(i10, 0.0f, measuredWidth - i11, 1.0f, org.telegram.ui.ActionBar.j6.k0);
                    break;
                }
                break;
            case 20:
                super.onDraw(canvas);
                ((hu0) this.b).j(canvas, getMeasuredWidth(), getMeasuredHeight());
                break;
            case 23:
                super.onDraw(canvas);
                int offsetColor = AndroidUtilities.getOffsetColor(-9057429, -10513163, getTranslationX() / getMeasuredWidth(), 1.0f);
                int offsetColor2 = AndroidUtilities.getOffsetColor(-11554882, -4629871, getTranslationX() / getMeasuredWidth(), 1.0f);
                eq0 eq0Var = (eq0) this.b;
                RectF rectF = eq0Var.h;
                Paint paint2 = eq0Var.f;
                if (offsetColor != 0) {
                    paint2.setShader(new LinearGradient(0.0f, 0.0f, getMeasuredWidth(), 0.0f, new int[]{offsetColor, offsetColor2}, (float[]) null, Shader.TileMode.CLAMP));
                }
                rectF.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                canvas.drawRoundRect(rectF, AndroidUtilities.dp(18.0f), AndroidUtilities.dp(18.0f), paint2);
                break;
            case 24:
                aw0 aw0Var = (aw0) this.b;
                if (aw0Var.b != null && !aw0Var.J) {
                    Drawable newDrawable = aw0Var.getNewDrawable();
                    boolean newDrawableMotion = aw0Var.getNewDrawableMotion();
                    Drawable drawable2 = aw0Var.b;
                    if (newDrawable != drawable2 && newDrawable != null) {
                        if (org.telegram.ui.ActionBar.j6.sl != null) {
                            aw0Var.d = drawable2;
                            aw0Var.e = aw0Var.c;
                        }
                        if (newDrawable instanceof lc0) {
                            ((lc0) newDrawable).r(aw0Var.L);
                        }
                        aw0Var.b = newDrawable;
                        if (aw0Var.M && (newDrawable instanceof ho)) {
                            ((ho) newDrawable).f(this);
                        }
                        if (aw0Var.M) {
                            Drawable drawable3 = aw0Var.b;
                            if (drawable3 instanceof lc0) {
                                ((lc0) drawable3).k();
                            }
                        }
                        aw0Var.c = newDrawableMotion;
                        aw0Var.l0 = 0.0f;
                        aw0Var.U(aw0Var.b);
                        aw0Var.I();
                    } else if (aw0Var.c != newDrawableMotion) {
                        aw0Var.c = newDrawableMotion;
                        aw0Var.I();
                    }
                    aw0Var.l0 = Utilities.clamp((AndroidUtilities.screenRefreshTime / 200.0f) + aw0Var.l0, 1.0f, 0.0f);
                    int i13 = 0;
                    while (i13 < 2) {
                        Drawable drawable4 = i13 == 0 ? aw0Var.d : aw0Var.b;
                        if (drawable4 != null) {
                            if (i13 != 1 || aw0Var.d == null || aw0Var.G == null) {
                                drawable4.setAlpha(255);
                            } else {
                                drawable4.setAlpha((int) (aw0Var.l0 * 255.0f));
                            }
                            if (i13 == 0 ? aw0Var.e : aw0Var.c) {
                                f7 = aw0Var.y;
                                f10 = aw0Var.w;
                                f11 = aw0Var.x;
                            } else {
                                f7 = 1.0f;
                                f10 = 0.0f;
                                f11 = 0.0f;
                            }
                            if (drawable4 instanceof lc0) {
                                lc0 lc0Var = (lc0) drawable4;
                                if (lc0Var.u != null) {
                                    int currentActionBarHeight = (aw0Var.P() ? org.telegram.ui.ActionBar.l.getCurrentActionBarHeight() : 0) + ((aw0Var.Q() && aw0Var.s) ? AndroidUtilities.statusBarHeight : 0);
                                    int measuredHeight = aw0Var.Y() ? getRootView().getMeasuredHeight() - currentActionBarHeight : getHeight();
                                    f12 = 1.0f;
                                    float max2 = Math.max(getMeasuredWidth() / drawable4.getIntrinsicWidth(), measuredHeight / drawable4.getIntrinsicHeight());
                                    int ceil = (int) Math.ceil(drawable4.getIntrinsicWidth() * max2 * f7);
                                    int ceil2 = (int) Math.ceil(drawable4.getIntrinsicHeight() * max2 * f7);
                                    int measuredWidth2 = ((getMeasuredWidth() - ceil) / 2) + ((int) f10);
                                    int i14 = ((measuredHeight - ceil2) / 2) + aw0Var.E + currentActionBarHeight + ((int) f11);
                                    canvas.save();
                                    canvas.clipRect(0, currentActionBarHeight, ceil, getMeasuredHeight() - aw0Var.h);
                                    drawable4.setBounds(measuredWidth2, i14, ceil + measuredWidth2, ceil2 + i14);
                                    drawable4.draw(canvas);
                                    aw0.G(aw0Var, canvas);
                                    canvas.restore();
                                } else {
                                    f12 = 1.0f;
                                    if (aw0Var.h != 0) {
                                        canvas.save();
                                        canvas.clipRect(0, 0, getMeasuredWidth(), getRootView().getMeasuredHeight() - aw0Var.h);
                                    }
                                    lc0Var.f = aw0Var.E;
                                    drawable4.setBounds(0, 0, getMeasuredWidth(), (int) ((getRootView().getMeasuredHeight() - aw0Var.E) + f11));
                                    drawable4.draw(canvas);
                                    if (aw0Var.h != 0) {
                                        canvas.restore();
                                    }
                                }
                            } else {
                                f12 = 1.0f;
                                if (drawable4 instanceof ColorDrawable) {
                                    if (aw0Var.h != 0) {
                                        canvas.save();
                                        canvas.clipRect(0, 0, getMeasuredWidth(), getMeasuredHeight() - aw0Var.h);
                                    }
                                    drawable4.setBounds(0, 0, getMeasuredWidth(), getRootView().getMeasuredHeight());
                                    drawable4.draw(canvas);
                                    aw0.G(aw0Var, canvas);
                                    if (aw0Var.h != 0) {
                                        canvas.restore();
                                    }
                                } else if (drawable4 instanceof GradientDrawable) {
                                    if (aw0Var.h != 0) {
                                        canvas.save();
                                        canvas.clipRect(0, 0, getMeasuredWidth(), getRootView().getMeasuredHeight() - aw0Var.h);
                                    }
                                    drawable4.setBounds(0, aw0Var.E, getMeasuredWidth(), getRootView().getMeasuredHeight() + aw0Var.E);
                                    drawable4.draw(canvas);
                                    aw0.G(aw0Var, canvas);
                                    if (aw0Var.h != 0) {
                                        canvas.restore();
                                    }
                                } else if (!(drawable4 instanceof BitmapDrawable)) {
                                    if (aw0Var.h != 0) {
                                        canvas.save();
                                        canvas.clipRect(0, 0, getMeasuredWidth(), getRootView().getMeasuredHeight() - aw0Var.h);
                                    }
                                    if (drawable4 instanceof ho) {
                                        ho hoVar = (ho) drawable4;
                                        hoVar.b = this;
                                        lc0 lc0Var2 = hoVar.f;
                                        if (lc0Var2 != null) {
                                            lc0Var2.r(this);
                                        }
                                    }
                                    float f14 = f7 - 1.0f;
                                    float A = a4.a.A(-getMeasuredWidth(), f14, 2.0f, f10);
                                    float A2 = a4.a.A(-getRootView().getMeasuredHeight(), f14, 2.0f, f11);
                                    drawable4.setBounds((int) A, (int) (aw0Var.E + A2), (int) ((getMeasuredWidth() * f7) + A), (int) org.telegram.ui.Cells.r6.a(getRootView().getMeasuredHeight(), f7, aw0Var.E, A2));
                                    drawable4.draw(canvas);
                                    aw0.G(aw0Var, canvas);
                                    if (aw0Var.h != 0) {
                                        canvas.restore();
                                    }
                                } else if (((BitmapDrawable) drawable4).getTileModeX() == Shader.TileMode.REPEAT) {
                                    canvas.save();
                                    float f15 = 2.0f / AndroidUtilities.density;
                                    canvas.scale(f15, f15);
                                    drawable4.setBounds(0, 0, (int) Math.ceil(getMeasuredWidth() / f15), (int) Math.ceil(getRootView().getMeasuredHeight() / f15));
                                    drawable4.draw(canvas);
                                    aw0.G(aw0Var, canvas);
                                    canvas.restore();
                                } else {
                                    int currentActionBarHeight2 = (aw0Var.P() ? org.telegram.ui.ActionBar.l.getCurrentActionBarHeight() : 0) + ((aw0Var.Q() && aw0Var.s) ? AndroidUtilities.statusBarHeight : 0);
                                    int measuredHeight2 = aw0Var.Y() ? getRootView().getMeasuredHeight() - currentActionBarHeight2 : getHeight();
                                    float max3 = Math.max(getMeasuredWidth() / drawable4.getIntrinsicWidth(), measuredHeight2 / drawable4.getIntrinsicHeight());
                                    int ceil3 = (int) Math.ceil(drawable4.getIntrinsicWidth() * max3 * f7);
                                    int ceil4 = (int) Math.ceil(drawable4.getIntrinsicHeight() * max3 * f7);
                                    int measuredWidth3 = ((getMeasuredWidth() - ceil3) / 2) + ((int) f10);
                                    int i15 = ((measuredHeight2 - ceil4) / 2) + aw0Var.E + currentActionBarHeight2 + ((int) f11);
                                    canvas.save();
                                    canvas.clipRect(0, currentActionBarHeight2, ceil3, getMeasuredHeight() - aw0Var.h);
                                    drawable4.setBounds(measuredWidth3, i15, ceil3 + measuredWidth3, ceil4 + i15);
                                    drawable4.draw(canvas);
                                    aw0.G(aw0Var, canvas);
                                    canvas.restore();
                                }
                            }
                            if (i13 == 0 && (drawable = aw0Var.d) != null && aw0Var.l0 >= f12) {
                                if (aw0Var.M && (drawable instanceof ho)) {
                                    ((ho) drawable).g(aw0Var.L);
                                }
                                if (aw0Var.M) {
                                    Drawable drawable5 = aw0Var.d;
                                    if (drawable5 instanceof lc0) {
                                        ((lc0) drawable5).l();
                                    }
                                }
                                aw0Var.d = null;
                                aw0Var.e = false;
                                aw0Var.I();
                                aw0Var.L.invalidate();
                            }
                        }
                        i13++;
                    }
                    if (aw0Var.l0 != 1.0f) {
                        aw0Var.L.invalidate();
                        break;
                    }
                }
                break;
            case 26:
                super.onDraw(canvas);
                int w02 = org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.Vi, false);
                ry0 ry0Var = (ry0) this.b;
                org.telegram.ui.Components.voip.h hVar = ry0Var.L;
                Paint paint3 = ry0Var.a;
                paint3.setColor(w02);
                Paint paint4 = ry0Var.b;
                paint4.setColor(w02);
                Paint paint5 = ry0Var.c;
                paint5.setColor(w02);
                paint4.setAlpha(255);
                paint5.setAlpha(82);
                paint3.setAlpha(46);
                Paint paint6 = ry0Var.d;
                paint6.setColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.d6, false));
                canvas.drawLine(AndroidUtilities.dp(24.0f), AndroidUtilities.dp(20.0f), getMeasuredWidth() - AndroidUtilities.dp(24.0f), AndroidUtilities.dp(20.0f), paint3);
                boolean z10 = ry0Var.e;
                if (z10 || ry0Var.J != 0.0f) {
                    if (!z10) {
                        float f16 = ry0Var.J - 0.10666667f;
                        ry0Var.J = f16;
                        if (f16 < 0.0f) {
                            ry0Var.J = 0.0f;
                        }
                    } else if (ry0Var.K) {
                        float f17 = ry0Var.J + 0.024615385f;
                        ry0Var.J = f17;
                        if (f17 > 1.0f) {
                            ry0Var.J = 1.0f;
                            ry0Var.K = false;
                        }
                    } else {
                        float f18 = ry0Var.J - 0.024615385f;
                        ry0Var.J = f18;
                        if (f18 < 0.0f) {
                            ry0Var.J = 0.0f;
                            ry0Var.K = true;
                        }
                    }
                    invalidate();
                    RectF rectF2 = AndroidUtilities.rectTmp;
                    rectF2.set(AndroidUtilities.dp(24.0f), AndroidUtilities.dp(17.0f), getMeasuredWidth() - AndroidUtilities.dp(24.0f), AndroidUtilities.dp(23.0f));
                    hVar.f = getMeasuredWidth();
                    hVar.a(AndroidUtilities.dp(3.0f), canvas, rectF2, null);
                }
                int dp2 = AndroidUtilities.dp(24.0f);
                if (ry0Var.e) {
                    paint = paint6;
                    f13 = 1.0f;
                } else {
                    int dp3 = AndroidUtilities.dp(24.0f) + ((int) (em.A(24.0f, 2, getMeasuredWidth()) * ry0Var.F));
                    f13 = 1.0f;
                    canvas.drawLine(dp2, AndroidUtilities.dp(20.0f), AndroidUtilities.dp(24.0f) + r2, AndroidUtilities.dp(20.0f), paint5);
                    canvas.drawRect(dp3, AndroidUtilities.dp(20.0f) - AndroidUtilities.dp(3.0f), AndroidUtilities.dp(3.0f) + dp3, AndroidUtilities.dp(3.0f) + AndroidUtilities.dp(20.0f), paint6);
                    paint = paint6;
                }
                if (!ry0Var.e) {
                    int A3 = (int) (em.A(24.0f, 2, getMeasuredWidth()) * ry0Var.E);
                    if (A3 < AndroidUtilities.dp(f13)) {
                        A3 = AndroidUtilities.dp(f13);
                    }
                    int dp4 = AndroidUtilities.dp(24.0f) + A3;
                    canvas.drawLine(dp2, AndroidUtilities.dp(20.0f), AndroidUtilities.dp(24.0f) + A3, AndroidUtilities.dp(20.0f), paint4);
                    canvas.drawRect(dp4, AndroidUtilities.dp(20.0f) - AndroidUtilities.dp(3.0f), AndroidUtilities.dp(3.0f) + dp4, AndroidUtilities.dp(3.0f) + AndroidUtilities.dp(20.0f), paint);
                    break;
                }
                break;
            case 27:
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
        org.telegram.ui.ActionBar.l lVar;
        int i13;
        org.telegram.ui.ActionBar.l lVar2;
        int i14;
        org.telegram.ui.ActionBar.l lVar3;
        switch (this.a) {
            case 1:
                ci.j jVar = (ci.j) this.b;
                if (jVar.H) {
                    int i15 = jVar.I;
                    lVar = ((org.telegram.ui.ActionBar.p2) jVar).actionBar;
                    i12 = (lVar.getMeasuredHeight() + i15) - AndroidUtilities.dp(16.0f);
                } else {
                    int dp = AndroidUtilities.dp(140.0f) + jVar.I;
                    if (AndroidUtilities.dp(24.0f) + jVar.y.getMeasuredHeight() > dp) {
                        dp = AndroidUtilities.dp(24.0f) + jVar.y.getMeasuredHeight();
                    }
                    i12 = dp;
                }
                super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec((int) (i12 - (0 * 2.5f)), TLObject.FLAG_30));
                break;
            case 2:
                di.m mVar = (di.m) this.b;
                if (mVar.H) {
                    int i16 = mVar.I;
                    lVar2 = ((org.telegram.ui.ActionBar.p2) mVar).actionBar;
                    i13 = (lVar2.getMeasuredHeight() + i16) - AndroidUtilities.dp(16.0f);
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
            case 24:
            case 27:
            case 28:
            default:
                super.onMeasure(i10, i11);
                break;
            case 4:
                ((View) getParent()).getMeasuredHeight();
                fg.r1 r1Var = (fg.r1) this.b;
                Integer num = r1Var.d;
                if (num != null) {
                    i14 = num.intValue();
                    r1Var.h = i14;
                } else {
                    i14 = 0;
                    r1Var.h = 0;
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
                s4.c0 c0Var = ((org.telegram.ui.o5) this.b).d.F;
                super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(Math.max(0, c0Var instanceof wz ? ((wz) c0Var).J : 0), TLObject.FLAG_30));
                break;
            case 12:
                org.telegram.ui.Components.ab abVar = (org.telegram.ui.Components.ab) this.b;
                int i17 = abVar.h;
                int dp3 = (i17 == 0 ? AndroidUtilities.dp(300.0f) : (int) (i17 * abVar.v)) - (((abVar.G - abVar.H) - abVar.I) - abVar.J);
                if (dp3 < 1) {
                    dp3 = 1;
                }
                super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(dp3, TLObject.FLAG_30));
                break;
            case 13:
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(((nm) this.b).v.J, TLObject.FLAG_30));
                break;
            case 14:
                setMeasuredDimension(View.MeasureSpec.getSize(i10), ((xn) this.b).d.R0);
                break;
            case 15:
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(((ao) ((org.telegram.ui.w7) this.b).d).w, TLObject.FLAG_30));
                break;
            case 17:
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(getPaddingRight() + getPaddingLeft() + Math.round(((t01) this.b).l()), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(Math.max(getPaddingBottom() + getPaddingTop() + Math.round(((t01) this.b).j()), AndroidUtilities.dp(26.0f)), TLObject.FLAG_30));
                break;
            case 18:
                super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(48.0f) + ((e70) this.b).c.o0, TLObject.FLAG_30));
                break;
            case 19:
                int dp4 = AndroidUtilities.dp(48.0f);
                k70 k70Var = ((g70) this.b).n;
                super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(dp4 + k70Var.o0 + k70Var.u0, TLObject.FLAG_30));
                break;
            case 22:
                super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(((oq0) this.b).K.J.R, TLObject.FLAG_30));
                break;
            case 25:
                yw0 yw0Var = (yw0) this.b;
                int size = View.MeasureSpec.getSize(i10);
                if (size <= 0) {
                    size = ((View) getParent()).getMeasuredWidth();
                }
                int size2 = View.MeasureSpec.getSize(i11) - AndroidUtilities.dp(4.0f);
                hx0 hx0Var = yw0Var.d;
                int i18 = hx0Var.g3;
                int max = Math.max(i18 > 0 ? AndroidUtilities.dp(4.0f) + i18 : 0, (int) (size - Math.min(AndroidUtilities.dp(4.0f) + ((yw0Var.h() - 1) * size2), yw0Var.d.X2 * size2)));
                hx0Var.f3 = max;
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(max, TLObject.FLAG_30), i11);
                break;
            case 26:
                super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(40.0f), TLObject.FLAG_30));
                break;
            case 29:
                s20 s20Var = (s20) this.b;
                if (s20Var.H) {
                    int i19 = s20Var.I;
                    lVar3 = ((org.telegram.ui.ActionBar.p2) s20Var).actionBar;
                    s20Var.J = (lVar3.getMeasuredHeight() + i19) - AndroidUtilities.dp(16.0f);
                } else {
                    int dp5 = AndroidUtilities.dp(140.0f) + s20Var.I;
                    if (AndroidUtilities.dp(24.0f) + s20Var.y.getMeasuredHeight() > dp5) {
                        dp5 = Math.max(dp5, (AndroidUtilities.dp(24.0f) + s20Var.y.getMeasuredHeight()) - s20Var.L);
                    }
                    s20Var.J = dp5;
                }
                int i20 = (int) (s20Var.J - (0 * 2.5f));
                s20Var.J = i20;
                super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(i20, TLObject.FLAG_30));
                break;
        }
    }

    @Override // android.view.View
    public void onSizeChanged(int i10, int i11, int i12, int i13) {
        switch (this.a) {
            case 27:
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
                View view = ((org.telegram.ui.c8) this.b).b.x.fragmentView;
                if (view != null) {
                    view.invalidate();
                    break;
                }
                break;
            case 28:
                super.setAlpha(f7);
                View view2 = ((wy) this.b).fragmentView;
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
                viewGroup = ((org.telegram.ui.ActionBar.h3) ((org.telegram.ui.Components.ab) this.b)).containerView;
                viewGroup.invalidate();
                break;
            default:
                super.setTranslationY(f7);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ nc(Object obj, Context context, int i10) {
        super(context);
        this.a = i10;
        this.b = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nc(org.telegram.ui.Components.ab abVar, Context context) {
        super(context);
        this.a = 12;
        this.b = abVar;
        setTag(-33024);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nc(Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context);
        this.a = 7;
        CheckBoxBase checkBoxBase = new CheckBoxBase(20, this, f6Var);
        this.b = checkBoxBase;
        checkBoxBase.h(org.telegram.ui.ActionBar.j6.hl, org.telegram.ui.ActionBar.j6.z5, org.telegram.ui.ActionBar.j6.k7);
        checkBoxBase.d(10);
        checkBoxBase.k(true);
        checkBoxBase.i(AndroidUtilities.dp(5.0f));
    }
}
