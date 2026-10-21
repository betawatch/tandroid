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
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.mk;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.Components.CheckBoxBase;
import org.telegram.ui.Components.br0;
import org.telegram.ui.Components.co;
import org.telegram.ui.Components.f11;
import org.telegram.ui.Components.fr0;
import org.telegram.ui.Components.go;
import org.telegram.ui.Components.ix0;
import org.telegram.ui.Components.lw0;
import org.telegram.ui.Components.p70;
import org.telegram.ui.Components.r70;
import org.telegram.ui.Components.rq0;
import org.telegram.ui.Components.rr;
import org.telegram.ui.Components.rx0;
import org.telegram.ui.Components.sm;
import org.telegram.ui.Components.v70;
import org.telegram.ui.Components.wc0;
import org.telegram.ui.Components.yz;
import org.telegram.ui.Components.zy0;
import org.telegram.ui.cy;
import org.telegram.ui.ot0;
import org.telegram.ui.tn;

/* compiled from: r8-map-id-54f46d3192cfcf06f3cb7093cda92e459a80ef6ed91a766593a44d0f1cb126c7 */
/* loaded from: classes4.dex */
public final class ic extends View {
    public final /* synthetic */ int a;
    public Object b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ic(Context context) {
        super(context);
        this.a = 18;
    }

    @Override // android.view.View
    public void dispatchDraw(Canvas canvas) {
        switch (this.a) {
            case 1:
                canvas.save();
                ei.vb vbVar = (ei.vb) this.b;
                canvas.translate(vbVar.c1.getX() + vbVar.l0.getX(), vbVar.c1.getY() + vbVar.l0.getY());
                ei.lb lbVar = vbVar.c1;
                lbVar.k(canvas, lbVar.getBounds(), vbVar.c1.getOver2Alpha());
                canvas.restore();
                break;
            case 6:
                bh.c cVar = ((ih.f) this.b).I;
                if (cVar != null) {
                    cVar.draw(canvas);
                }
                super.dispatchDraw(canvas);
                break;
            case 9:
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
            case 18:
                super.draw(canvas);
                ((f11) this.b).e(canvas, (getMeasuredWidth() - ((f11) this.b).l()) / 2.0f, getMeasuredHeight() / 2.0f);
                break;
            case 22:
                super.draw(canvas);
                fr0 fr0Var = (fr0) this.b;
                fr0Var.X0.setBounds(0, (getMeasuredHeight() - fr0Var.H0.d) - AndroidUtilities.dp(72.0f), getMeasuredWidth(), getMeasuredHeight());
                fr0Var.X0.draw(canvas);
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
                ((lw0) this.b).T();
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
                ((hg.p1) this.b).f = true;
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
                ((hg.p1) this.b).f = false;
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
                hi.k0 k0Var = (hi.k0) this.b;
                zf.y yVar = k0Var.K;
                float max = Math.max(k0Var.b.e, k0Var.c.e);
                zf.y yVar2 = k0Var.J;
                yVar2.c(AndroidUtilities.dp(42.0f) + k0Var.U.b, 0);
                yVar2.setBounds(0, 0, getWidth(), AndroidUtilities.dp(56.0f) + k0Var.U.b);
                int i12 = org.telegram.ui.ActionBar.h6.a7;
                yVar2.b(org.telegram.ui.ActionBar.h6.m1(AndroidUtilities.lerp(1.0f, 0.8f, max), k0Var.getThemedColor(i12)));
                yVar2.draw(canvas);
                if (k0Var.N) {
                    max = 1.0f;
                }
                int lerp = AndroidUtilities.lerp(AndroidUtilities.dp(48.0f) + k0Var.U.d, 0, max);
                int lerp2 = AndroidUtilities.lerp(AndroidUtilities.dp(72.0f), 0, max) + k0Var.U.d;
                float lerp3 = AndroidUtilities.lerp(0.8f, AndroidUtilities.getNavigationBarThirdButtonsFactor(k0Var.U.d), max);
                yVar.c(0, lerp);
                yVar.setBounds(0, getHeight() - lerp2, getWidth(), getHeight());
                yVar.b(org.telegram.ui.ActionBar.h6.m1(lerp3, k0Var.getThemedColor(i12)));
                yVar.draw(canvas);
                break;
            case 7:
                canvas.save();
                canvas.translate(AndroidUtilities.dpf2(22.6f), AndroidUtilities.dpf2(21.66f));
                ((ki.t0) this.b).c.draw(canvas);
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
            case 12:
                org.telegram.ui.Cells.r2 r2Var = (org.telegram.ui.Cells.r2) this.b;
                r2Var.n4.setBounds(0, 0, getWidth(), getHeight());
                r2Var.n4.draw(canvas);
                break;
            case 17:
                rr rrVar = (rr) this.b;
                if (rrVar.Z) {
                    i10 = ((org.telegram.ui.ActionBar.f3) rrVar).backgroundPaddingLeft;
                    int measuredWidth = getMeasuredWidth();
                    i11 = ((org.telegram.ui.ActionBar.f3) rrVar).backgroundPaddingLeft;
                    canvas.drawRect(i10, 0.0f, measuredWidth - i11, 1.0f, org.telegram.ui.ActionBar.h6.k0);
                    break;
                }
                break;
            case 21:
                super.onDraw(canvas);
                ((ot0) this.b).j(canvas, getMeasuredWidth(), getMeasuredHeight());
                break;
            case 24:
                super.onDraw(canvas);
                int offsetColor = AndroidUtilities.getOffsetColor(-9057429, -10513163, getTranslationX() / getMeasuredWidth(), 1.0f);
                int offsetColor2 = AndroidUtilities.getOffsetColor(-11554882, -4629871, getTranslationX() / getMeasuredWidth(), 1.0f);
                rq0 rq0Var = (rq0) this.b;
                RectF rectF = rq0Var.n;
                Paint paint2 = rq0Var.h;
                if (offsetColor != 0) {
                    paint2.setShader(new LinearGradient(0.0f, 0.0f, getMeasuredWidth(), 0.0f, new int[]{offsetColor, offsetColor2}, (float[]) null, Shader.TileMode.CLAMP));
                }
                rectF.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                canvas.drawRoundRect(rectF, AndroidUtilities.dp(18.0f), AndroidUtilities.dp(18.0f), paint2);
                break;
            case 25:
                lw0 lw0Var = (lw0) this.b;
                if (lw0Var.b != null && !lw0Var.J) {
                    Drawable newDrawable = lw0Var.getNewDrawable();
                    boolean newDrawableMotion = lw0Var.getNewDrawableMotion();
                    Drawable drawable2 = lw0Var.b;
                    float f14 = 0.0f;
                    if (newDrawable != drawable2 && newDrawable != null) {
                        if (org.telegram.ui.ActionBar.h6.vl != null) {
                            lw0Var.d = drawable2;
                            lw0Var.e = lw0Var.c;
                        }
                        if (newDrawable instanceof wc0) {
                            ((wc0) newDrawable).q(lw0Var.L);
                        }
                        lw0Var.b = newDrawable;
                        if (lw0Var.M && (newDrawable instanceof tn)) {
                            ((tn) newDrawable).f(this);
                        }
                        if (lw0Var.M) {
                            Drawable drawable3 = lw0Var.b;
                            if (drawable3 instanceof wc0) {
                                ((wc0) drawable3).k();
                            }
                        }
                        lw0Var.c = newDrawableMotion;
                        lw0Var.l0 = 0.0f;
                        lw0Var.U(lw0Var.b);
                        lw0Var.I();
                    } else if (lw0Var.c != newDrawableMotion) {
                        lw0Var.c = newDrawableMotion;
                        lw0Var.I();
                    }
                    float f15 = 1.0f;
                    lw0Var.l0 = Utilities.clamp((AndroidUtilities.screenRefreshTime / 200.0f) + lw0Var.l0, 1.0f, 0.0f);
                    int i13 = 0;
                    while (i13 < 2) {
                        Drawable drawable4 = i13 == 0 ? lw0Var.d : lw0Var.b;
                        if (drawable4 == null) {
                            f12 = f15;
                        } else {
                            if (i13 != 1 || lw0Var.d == null || lw0Var.G == null) {
                                drawable4.setAlpha(255);
                            } else {
                                drawable4.setAlpha((int) (lw0Var.l0 * 255.0f));
                            }
                            if (i13 == 0 ? lw0Var.e : lw0Var.c) {
                                f7 = lw0Var.y;
                                f10 = lw0Var.w;
                                f11 = lw0Var.x;
                            } else {
                                f7 = f15;
                                f10 = f14;
                                f11 = f10;
                            }
                            if (drawable4 instanceof wc0) {
                                wc0 wc0Var = (wc0) drawable4;
                                if (wc0Var.u != null) {
                                    int currentActionBarHeight = (lw0Var.P() ? org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() : 0) + ((lw0Var.Q() && lw0Var.s) ? AndroidUtilities.statusBarHeight : 0);
                                    int measuredHeight = lw0Var.Y() ? getRootView().getMeasuredHeight() - currentActionBarHeight : getHeight();
                                    f12 = f15;
                                    float max2 = Math.max(getMeasuredWidth() / drawable4.getIntrinsicWidth(), measuredHeight / drawable4.getIntrinsicHeight());
                                    int ceil = (int) Math.ceil(drawable4.getIntrinsicWidth() * max2 * f7);
                                    int ceil2 = (int) Math.ceil(drawable4.getIntrinsicHeight() * max2 * f7);
                                    int measuredWidth2 = ((getMeasuredWidth() - ceil) / 2) + ((int) f10);
                                    int i14 = ((measuredHeight - ceil2) / 2) + lw0Var.E + currentActionBarHeight + ((int) f11);
                                    canvas.save();
                                    canvas.clipRect(0, currentActionBarHeight, ceil, getMeasuredHeight() - lw0Var.h);
                                    drawable4.setBounds(measuredWidth2, i14, ceil + measuredWidth2, ceil2 + i14);
                                    drawable4.draw(canvas);
                                    lw0.H(lw0Var, canvas);
                                    canvas.restore();
                                } else {
                                    f12 = f15;
                                    if (lw0Var.h != 0) {
                                        canvas.save();
                                        canvas.clipRect(0, 0, getMeasuredWidth(), getRootView().getMeasuredHeight() - lw0Var.h);
                                    }
                                    wc0Var.f = lw0Var.E;
                                    drawable4.setBounds(0, 0, getMeasuredWidth(), (int) ((getRootView().getMeasuredHeight() - lw0Var.E) + f11));
                                    drawable4.draw(canvas);
                                    if (lw0Var.h != 0) {
                                        canvas.restore();
                                    }
                                }
                            } else {
                                f12 = f15;
                                if (drawable4 instanceof ColorDrawable) {
                                    if (lw0Var.h != 0) {
                                        canvas.save();
                                        canvas.clipRect(0, 0, getMeasuredWidth(), getMeasuredHeight() - lw0Var.h);
                                    }
                                    drawable4.setBounds(0, 0, getMeasuredWidth(), getRootView().getMeasuredHeight());
                                    drawable4.draw(canvas);
                                    lw0.H(lw0Var, canvas);
                                    if (lw0Var.h != 0) {
                                        canvas.restore();
                                    }
                                } else if (drawable4 instanceof GradientDrawable) {
                                    if (lw0Var.h != 0) {
                                        canvas.save();
                                        canvas.clipRect(0, 0, getMeasuredWidth(), getRootView().getMeasuredHeight() - lw0Var.h);
                                    }
                                    drawable4.setBounds(0, lw0Var.E, getMeasuredWidth(), getRootView().getMeasuredHeight() + lw0Var.E);
                                    drawable4.draw(canvas);
                                    lw0.H(lw0Var, canvas);
                                    if (lw0Var.h != 0) {
                                        canvas.restore();
                                    }
                                } else if (!(drawable4 instanceof BitmapDrawable)) {
                                    if (lw0Var.h != 0) {
                                        canvas.save();
                                        canvas.clipRect(0, 0, getMeasuredWidth(), getRootView().getMeasuredHeight() - lw0Var.h);
                                    }
                                    if (drawable4 instanceof tn) {
                                        tn tnVar = (tn) drawable4;
                                        tnVar.b = this;
                                        wc0 wc0Var2 = tnVar.f;
                                        if (wc0Var2 != null) {
                                            wc0Var2.q(this);
                                        }
                                    }
                                    float f16 = f7 - f12;
                                    float B = a1.g.B(-getMeasuredWidth(), f16, 2.0f, f10);
                                    float B2 = a1.g.B(-getRootView().getMeasuredHeight(), f16, 2.0f, f11);
                                    drawable4.setBounds((int) B, (int) (lw0Var.E + B2), (int) ((getMeasuredWidth() * f7) + B), (int) r4.c.c(getRootView().getMeasuredHeight(), f7, lw0Var.E, B2));
                                    drawable4.draw(canvas);
                                    lw0.H(lw0Var, canvas);
                                    if (lw0Var.h != 0) {
                                        canvas.restore();
                                    }
                                } else if (((BitmapDrawable) drawable4).getTileModeX() == Shader.TileMode.REPEAT) {
                                    canvas.save();
                                    float f17 = 2.0f / AndroidUtilities.density;
                                    canvas.scale(f17, f17);
                                    drawable4.setBounds(0, 0, (int) Math.ceil(getMeasuredWidth() / f17), (int) Math.ceil(getRootView().getMeasuredHeight() / f17));
                                    drawable4.draw(canvas);
                                    lw0.H(lw0Var, canvas);
                                    canvas.restore();
                                } else {
                                    int currentActionBarHeight2 = (lw0Var.P() ? org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() : 0) + ((lw0Var.Q() && lw0Var.s) ? AndroidUtilities.statusBarHeight : 0);
                                    int measuredHeight2 = lw0Var.Y() ? getRootView().getMeasuredHeight() - currentActionBarHeight2 : getHeight();
                                    float max3 = Math.max(getMeasuredWidth() / drawable4.getIntrinsicWidth(), measuredHeight2 / drawable4.getIntrinsicHeight());
                                    int ceil3 = (int) Math.ceil(drawable4.getIntrinsicWidth() * max3 * f7);
                                    int ceil4 = (int) Math.ceil(drawable4.getIntrinsicHeight() * max3 * f7);
                                    int measuredWidth3 = ((getMeasuredWidth() - ceil3) / 2) + ((int) f10);
                                    int i15 = ((measuredHeight2 - ceil4) / 2) + lw0Var.E + currentActionBarHeight2 + ((int) f11);
                                    canvas.save();
                                    canvas.clipRect(0, currentActionBarHeight2, ceil3, getMeasuredHeight() - lw0Var.h);
                                    drawable4.setBounds(measuredWidth3, i15, ceil3 + measuredWidth3, ceil4 + i15);
                                    drawable4.draw(canvas);
                                    lw0.H(lw0Var, canvas);
                                    canvas.restore();
                                }
                            }
                            if (i13 == 0 && (drawable = lw0Var.d) != null && lw0Var.l0 >= f12) {
                                if (lw0Var.M && (drawable instanceof tn)) {
                                    ((tn) drawable).g(lw0Var.L);
                                }
                                if (lw0Var.M) {
                                    Drawable drawable5 = lw0Var.d;
                                    if (drawable5 instanceof wc0) {
                                        ((wc0) drawable5).l();
                                    }
                                }
                                lw0Var.d = null;
                                lw0Var.e = false;
                                lw0Var.I();
                                lw0Var.L.invalidate();
                            }
                        }
                        i13++;
                        f15 = f12;
                        f14 = 0.0f;
                    }
                    if (lw0Var.l0 != f15) {
                        lw0Var.L.invalidate();
                        break;
                    }
                }
                break;
            case 27:
                super.onDraw(canvas);
                int x02 = org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.Vi, false);
                zy0 zy0Var = (zy0) this.b;
                org.telegram.ui.Components.voip.h hVar = zy0Var.L;
                Paint paint3 = zy0Var.a;
                paint3.setColor(x02);
                Paint paint4 = zy0Var.b;
                paint4.setColor(x02);
                Paint paint5 = zy0Var.c;
                paint5.setColor(x02);
                paint4.setAlpha(255);
                paint5.setAlpha(82);
                paint3.setAlpha(46);
                Paint paint6 = zy0Var.d;
                paint6.setColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.d6, false));
                canvas.drawLine(AndroidUtilities.dp(24.0f), AndroidUtilities.dp(20.0f), getMeasuredWidth() - AndroidUtilities.dp(24.0f), AndroidUtilities.dp(20.0f), paint3);
                boolean z10 = zy0Var.e;
                if (z10 || zy0Var.J != 0.0f) {
                    if (!z10) {
                        float f18 = zy0Var.J - 0.10666667f;
                        zy0Var.J = f18;
                        if (f18 < 0.0f) {
                            zy0Var.J = 0.0f;
                        }
                    } else if (zy0Var.K) {
                        float f19 = zy0Var.J + 0.024615385f;
                        zy0Var.J = f19;
                        if (f19 > 1.0f) {
                            zy0Var.J = 1.0f;
                            zy0Var.K = false;
                        }
                    } else {
                        float f20 = zy0Var.J - 0.024615385f;
                        zy0Var.J = f20;
                        if (f20 < 0.0f) {
                            zy0Var.J = 0.0f;
                            zy0Var.K = true;
                        }
                    }
                    invalidate();
                    RectF rectF2 = AndroidUtilities.rectTmp;
                    rectF2.set(AndroidUtilities.dp(24.0f), AndroidUtilities.dp(17.0f), getMeasuredWidth() - AndroidUtilities.dp(24.0f), AndroidUtilities.dp(23.0f));
                    hVar.f = getMeasuredWidth();
                    hVar.a(AndroidUtilities.dp(3.0f), canvas, rectF2, null);
                }
                int dp2 = AndroidUtilities.dp(24.0f);
                if (zy0Var.e) {
                    f13 = 1.0f;
                    paint = paint6;
                } else {
                    int dp3 = AndroidUtilities.dp(24.0f) + ((int) (mk.B(24.0f, 2, getMeasuredWidth()) * zy0Var.F));
                    f13 = 1.0f;
                    canvas.drawLine(dp2, AndroidUtilities.dp(20.0f), AndroidUtilities.dp(24.0f) + r2, AndroidUtilities.dp(20.0f), paint5);
                    canvas.drawRect(dp3, AndroidUtilities.dp(20.0f) - AndroidUtilities.dp(3.0f), AndroidUtilities.dp(3.0f) + dp3, AndroidUtilities.dp(3.0f) + AndroidUtilities.dp(20.0f), paint6);
                    paint = paint6;
                }
                if (!zy0Var.e) {
                    int B3 = (int) (mk.B(24.0f, 2, getMeasuredWidth()) * zy0Var.E);
                    if (B3 < AndroidUtilities.dp(f13)) {
                        B3 = AndroidUtilities.dp(f13);
                    }
                    int dp4 = AndroidUtilities.dp(24.0f) + B3;
                    canvas.drawLine(dp2, AndroidUtilities.dp(20.0f), AndroidUtilities.dp(24.0f) + B3, AndroidUtilities.dp(20.0f), paint4);
                    canvas.drawRect(dp4, AndroidUtilities.dp(20.0f) - AndroidUtilities.dp(3.0f), AndroidUtilities.dp(3.0f) + dp4, AndroidUtilities.dp(3.0f) + AndroidUtilities.dp(20.0f), paint);
                    break;
                }
                break;
            case 28:
                if (getAlpha() != 0.0f) {
                    RectF rectF3 = AndroidUtilities.rectTmp;
                    rectF3.set(0.0f, 0.0f, getWidth(), getHeight());
                    ((org.telegram.ui.Components.voip.h1) this.b).n.a(AndroidUtilities.dp(10.0f), canvas, rectF3, null);
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
        int i15;
        switch (this.a) {
            case 0:
                md mdVar = (md) this.b;
                if (mdVar.H) {
                    int i16 = mdVar.I;
                    kVar = ((org.telegram.ui.ActionBar.n2) mdVar).actionBar;
                    i12 = (kVar.getMeasuredHeight() + i16) - AndroidUtilities.dp(16.0f);
                } else {
                    int dp = AndroidUtilities.dp(140.0f) + mdVar.I;
                    if (AndroidUtilities.dp(24.0f) + mdVar.y.getMeasuredHeight() > dp) {
                        dp = AndroidUtilities.dp(24.0f) + mdVar.y.getMeasuredHeight();
                    }
                    i12 = dp;
                }
                super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec((int) (i12 - (0 * 2.5f)), TLObject.FLAG_30));
                break;
            case 1:
            case 5:
            case 6:
            case 7:
            case 11:
            case 12:
            case 17:
            case 21:
            case 22:
            case 24:
            case 25:
            default:
                super.onMeasure(i10, i11);
                break;
            case 2:
                fi.g gVar = (fi.g) this.b;
                if (gVar.H) {
                    int i17 = gVar.I;
                    kVar2 = ((org.telegram.ui.ActionBar.n2) gVar).actionBar;
                    i13 = (kVar2.getMeasuredHeight() + i17) - AndroidUtilities.dp(16.0f);
                } else {
                    int dp2 = AndroidUtilities.dp(140.0f) + gVar.I;
                    if (AndroidUtilities.dp(24.0f) + gVar.y.getMeasuredHeight() > dp2) {
                        dp2 = AndroidUtilities.dp(24.0f) + gVar.y.getMeasuredHeight();
                    }
                    i13 = dp2;
                }
                super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec((int) (i13 - (0 * 2.5f)), TLObject.FLAG_30));
                break;
            case 3:
                gi.l lVar = (gi.l) this.b;
                if (lVar.H) {
                    int i18 = lVar.I;
                    kVar3 = ((org.telegram.ui.ActionBar.n2) lVar).actionBar;
                    i14 = (kVar3.getMeasuredHeight() + i18) - AndroidUtilities.dp(16.0f);
                } else {
                    int dp3 = AndroidUtilities.dp(140.0f) + lVar.I;
                    if (AndroidUtilities.dp(24.0f) + lVar.y.getMeasuredHeight() > dp3) {
                        dp3 = AndroidUtilities.dp(24.0f) + lVar.y.getMeasuredHeight();
                    }
                    i14 = dp3;
                }
                super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec((int) (i14 - (0 * 2.5f)), TLObject.FLAG_30));
                break;
            case 4:
                ((View) getParent()).getMeasuredHeight();
                hg.p1 p1Var = (hg.p1) this.b;
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
                setMeasuredDimension(View.MeasureSpec.getSize(i10), AndroidUtilities.navigationBarHeight);
                setTranslationY(AndroidUtilities.navigationBarHeight);
                break;
            case 10:
                s4.b0 b0Var = ((org.telegram.ui.t5) this.b).d.F;
                super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(Math.max(0, b0Var instanceof yz ? ((yz) b0Var).J : 0), TLObject.FLAG_30));
                break;
            case 13:
                org.telegram.ui.Components.bb bbVar = (org.telegram.ui.Components.bb) this.b;
                int i19 = bbVar.h;
                int dp4 = (i19 == 0 ? AndroidUtilities.dp(300.0f) : (int) (i19 * bbVar.v)) - (((bbVar.G - bbVar.H) - bbVar.I) - bbVar.J);
                if (dp4 < 1) {
                    dp4 = 1;
                }
                super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(dp4, TLObject.FLAG_30));
                break;
            case 14:
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(((sm) this.b).v.J, TLObject.FLAG_30));
                break;
            case 15:
                setMeasuredDimension(View.MeasureSpec.getSize(i10), ((co) this.b).d.R0);
                break;
            case 16:
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(((go) ((org.telegram.ui.z7) this.b).d).w, TLObject.FLAG_30));
                break;
            case 18:
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(getPaddingRight() + getPaddingLeft() + Math.round(((f11) this.b).l()), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(Math.max(getPaddingBottom() + getPaddingTop() + Math.round(((f11) this.b).j()), AndroidUtilities.dp(26.0f)), TLObject.FLAG_30));
                break;
            case 19:
                super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(48.0f) + ((p70) this.b).c.o0, TLObject.FLAG_30));
                break;
            case 20:
                int dp5 = AndroidUtilities.dp(48.0f);
                v70 v70Var = ((r70) this.b).n;
                super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(dp5 + v70Var.o0 + v70Var.u0, TLObject.FLAG_30));
                break;
            case 23:
                super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(((br0) this.b).K.K.R, TLObject.FLAG_30));
                break;
            case 26:
                ix0 ix0Var = (ix0) this.b;
                int size = View.MeasureSpec.getSize(i10);
                if (size <= 0) {
                    size = ((View) getParent()).getMeasuredWidth();
                }
                int size2 = View.MeasureSpec.getSize(i11) - AndroidUtilities.dp(4.0f);
                rx0 rx0Var = ix0Var.d;
                int i20 = rx0Var.e3;
                int max = Math.max(i20 > 0 ? AndroidUtilities.dp(4.0f) + i20 : 0, (int) (size - Math.min(AndroidUtilities.dp(4.0f) + ((ix0Var.h() - 1) * size2), ix0Var.d.V2 * size2)));
                rx0Var.d3 = max;
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
                ((org.telegram.ui.Components.voip.h1) this.b).n.f = i10;
                break;
            default:
                super.onSizeChanged(i10, i11, i12, i13);
                break;
        }
    }

    @Override // android.view.View
    public void setAlpha(float f7) {
        switch (this.a) {
            case 11:
                super.setAlpha(f7);
                View view = ((org.telegram.ui.f8) this.b).b.x.fragmentView;
                if (view != null) {
                    view.invalidate();
                    break;
                }
                break;
            case 29:
                super.setAlpha(f7);
                View view2 = ((cy) this.b).fragmentView;
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
            case 24:
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
            case 13:
                super.setTranslationY(f7);
                viewGroup = ((org.telegram.ui.ActionBar.f3) ((org.telegram.ui.Components.bb) this.b)).containerView;
                viewGroup.invalidate();
                break;
            default:
                super.setTranslationY(f7);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ic(Object obj, Context context, int i10) {
        super(context);
        this.a = i10;
        this.b = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ic(org.telegram.ui.Components.bb bbVar, Context context) {
        super(context);
        this.a = 13;
        this.b = bbVar;
        setTag(-33024);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ic(Context context, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context);
        this.a = 8;
        CheckBoxBase checkBoxBase = new CheckBoxBase(20, this, d6Var);
        this.b = checkBoxBase;
        checkBoxBase.h(org.telegram.ui.ActionBar.h6.hl, org.telegram.ui.ActionBar.h6.z5, org.telegram.ui.ActionBar.h6.k7);
        checkBoxBase.d(10);
        checkBoxBase.k(true);
        checkBoxBase.i(AndroidUtilities.dp(5.0f));
    }
}
