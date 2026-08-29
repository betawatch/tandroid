package cg;

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
import jh.ia;
import nh.gb;
import nh.wa;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LiteMode;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.f3;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.i3;
import org.telegram.ui.Components.ar;
import org.telegram.ui.Components.cm;
import org.telegram.ui.Components.dq0;
import org.telegram.ui.Components.fi0;
import org.telegram.ui.Components.fw0;
import org.telegram.ui.Components.hv0;
import org.telegram.ui.Components.kz;
import org.telegram.ui.Components.mn;
import org.telegram.ui.Components.op0;
import org.telegram.ui.Components.ow0;
import org.telegram.ui.Components.pn;
import org.telegram.ui.Components.r60;
import org.telegram.ui.Components.t60;
import org.telegram.ui.Components.x60;
import org.telegram.ui.Components.xa;
import org.telegram.ui.Components.xx0;
import org.telegram.ui.Components.yb0;
import org.telegram.ui.Components.zp0;
import org.telegram.ui.Components.zz0;
import org.telegram.ui.a8;
import org.telegram.ui.b50;
import org.telegram.ui.d50;
import org.telegram.ui.et0;
import org.telegram.ui.fy;
import org.telegram.ui.hp0;
import org.telegram.ui.p5;
import org.telegram.ui.u7;
import org.telegram.ui.wn;
import org.telegram.ui.z10;
import org.telegram.ui.zi0;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class h0 extends View {
    public final /* synthetic */ int a;
    public Object b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h0(Context context, int i10) {
        super(context);
        this.a = i10;
    }

    @Override // android.view.View
    public void dispatchDraw(Canvas canvas) {
        switch (this.a) {
            case 3:
                canvas.save();
                gb gbVar = (gb) this.b;
                canvas.translate(gbVar.Y0.getX() + gbVar.h0.getX(), gbVar.Y0.getY() + gbVar.h0.getY());
                wa waVar = gbVar.Y0;
                waVar.k(canvas, waVar.getBounds(), gbVar.Y0.getOver2Alpha());
                canvas.restore();
                break;
            case 5:
                canvas.drawRect(0.0f, 0.0f, getWidth(), getHeight(), ((i3) this.b).d);
                break;
            case 27:
                super.dispatchDraw(canvas);
                b50 b50Var = (b50) this.b;
                if (b50Var != null && b50Var.a(canvas, getMeasuredWidth(), 0.0f)) {
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
            case 14:
                super.draw(canvas);
                ((zz0) this.b).e(canvas, (getMeasuredWidth() - ((zz0) this.b).l()) / 2.0f, getMeasuredHeight() / 2.0f);
                break;
            case 18:
                super.draw(canvas);
                dq0 dq0Var = (dq0) this.b;
                dq0Var.S0.setBounds(0, (getMeasuredHeight() - dq0Var.C0.d) - AndroidUtilities.dp(72.0f), getMeasuredWidth(), getMeasuredHeight());
                dq0Var.S0.draw(canvas);
                break;
            default:
                super.draw(canvas);
                break;
        }
    }

    @Override // android.view.View
    public void invalidate() {
        switch (this.a) {
            case 21:
                super.invalidate();
                ((hv0) this.b).T();
                break;
            default:
                super.invalidate();
                break;
        }
    }

    @Override // android.view.View
    public void onAttachedToWindow() {
        switch (this.a) {
            case 1:
                super.onAttachedToWindow();
                ih.d2 d2Var = (ih.d2) this.b;
                if (d2Var != null && !d2Var.i) {
                    d2Var.i = true;
                    d2Var.a();
                    ag.i0 i0Var = new ag.i0(d2Var, 14);
                    d2Var.h = i0Var;
                    LiteMode.addOnPowerSaverAppliedListener(i0Var);
                    break;
                }
                break;
            case 27:
                super.onAttachedToWindow();
                b50 b50Var = (b50) this.b;
                if (b50Var != null) {
                    b50Var.g = this;
                    int i10 = 0;
                    while (true) {
                        d50[] d50VarArr = b50Var.c;
                        if (i10 >= d50VarArr.length) {
                            break;
                        } else {
                            d50 d50Var = d50VarArr[i10];
                            d50Var.i.add(this);
                            d50Var.a();
                            i10++;
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
            case 1:
                super.onDetachedFromWindow();
                ih.d2 d2Var = (ih.d2) this.b;
                if (d2Var != null && d2Var.i) {
                    d2Var.i = false;
                    d2Var.a();
                    LiteMode.removeOnPowerSaverAppliedListener(d2Var.h);
                    break;
                }
                break;
            case 27:
                super.onDetachedFromWindow();
                b50 b50Var = (b50) this.b;
                if (b50Var != null && b50Var.g != this) {
                    int i10 = 0;
                    while (true) {
                        d50[] d50VarArr = b50Var.c;
                        if (i10 >= d50VarArr.length) {
                            b50Var.g = null;
                            break;
                        } else {
                            d50 d50Var = d50VarArr[i10];
                            d50Var.i.remove(this);
                            d50Var.a();
                            i10++;
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
        c6 c6Var;
        int i10;
        int i11;
        float f9;
        float f10;
        float f11;
        int i12;
        int i13;
        Drawable drawable;
        int i14 = 255;
        int i15 = 1;
        switch (this.a) {
            case 0:
                super.onDraw(canvas);
                v0 v0Var = (v0) this.b;
                if (v0Var.l0 - v0Var.k0 > 1) {
                    c6Var = ((f3) v0Var).resourcesProvider;
                    Paint T0 = g6.T0("paintDivider", c6Var);
                    if (T0 == null) {
                        T0 = g6.k0;
                    }
                    canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), 1.0f, T0);
                    break;
                }
                break;
            case 8:
                org.telegram.ui.Cells.p2 p2Var = (org.telegram.ui.Cells.p2) this.b;
                p2Var.f4.setBounds(0, 0, getWidth(), getHeight());
                p2Var.f4.draw(canvas);
                break;
            case 13:
                ar arVar = (ar) this.b;
                if (arVar.V) {
                    i10 = ((f3) arVar).backgroundPaddingLeft;
                    int measuredWidth = getMeasuredWidth();
                    i11 = ((f3) arVar).backgroundPaddingLeft;
                    canvas.drawRect(i10, 0.0f, measuredWidth - i11, 1.0f, g6.k0);
                    break;
                }
                break;
            case 17:
                super.onDraw(canvas);
                ((et0) this.b).j(canvas, getMeasuredWidth(), getMeasuredHeight());
                break;
            case 20:
                super.onDraw(canvas);
                int offsetColor = AndroidUtilities.getOffsetColor(-9057429, -10513163, getTranslationX() / getMeasuredWidth(), 1.0f);
                int offsetColor2 = AndroidUtilities.getOffsetColor(-11554882, -4629871, getTranslationX() / getMeasuredWidth(), 1.0f);
                op0 op0Var = (op0) this.b;
                RectF rectF = op0Var.h;
                Paint paint = op0Var.f;
                if (offsetColor != 0) {
                    paint.setShader(new LinearGradient(0.0f, 0.0f, getMeasuredWidth(), 0.0f, new int[]{offsetColor, offsetColor2}, (float[]) null, Shader.TileMode.CLAMP));
                }
                rectF.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                canvas.drawRoundRect(rectF, AndroidUtilities.dp(18.0f), AndroidUtilities.dp(18.0f), paint);
                break;
            case 21:
                float f12 = 2.0f;
                hv0 hv0Var = (hv0) this.b;
                if (hv0Var.b != null && !hv0Var.F) {
                    Drawable newDrawable = hv0Var.getNewDrawable();
                    boolean newDrawableMotion = hv0Var.getNewDrawableMotion();
                    Drawable drawable2 = hv0Var.b;
                    if (newDrawable != drawable2 && newDrawable != null) {
                        if (g6.sl != null) {
                            hv0Var.d = drawable2;
                            hv0Var.e = hv0Var.c;
                        }
                        if (newDrawable instanceof yb0) {
                            ((yb0) newDrawable).r(hv0Var.H);
                        }
                        hv0Var.b = newDrawable;
                        if (hv0Var.I && (newDrawable instanceof wn)) {
                            ((wn) newDrawable).f(this);
                        }
                        if (hv0Var.I) {
                            Drawable drawable3 = hv0Var.b;
                            if (drawable3 instanceof yb0) {
                                ((yb0) drawable3).k();
                            }
                        }
                        hv0Var.c = newDrawableMotion;
                        hv0Var.h0 = 0.0f;
                        hv0Var.U(hv0Var.b);
                        hv0Var.I();
                    } else if (hv0Var.c != newDrawableMotion) {
                        hv0Var.c = newDrawableMotion;
                        hv0Var.I();
                    }
                    hv0Var.h0 = Utilities.clamp((AndroidUtilities.screenRefreshTime / 200.0f) + hv0Var.h0, 1.0f, 0.0f);
                    int i16 = 0;
                    while (i16 < 2) {
                        Drawable drawable4 = i16 == 0 ? hv0Var.d : hv0Var.b;
                        if (drawable4 != null) {
                            if (i16 != i15 || hv0Var.d == null || hv0Var.C == null) {
                                drawable4.setAlpha(i14);
                            } else {
                                drawable4.setAlpha((int) (hv0Var.h0 * 255.0f));
                            }
                            if (i16 == 0 ? hv0Var.e : hv0Var.c) {
                                f9 = hv0Var.y;
                                f10 = hv0Var.w;
                                f11 = hv0Var.x;
                            } else {
                                f9 = 1.0f;
                                f10 = 0.0f;
                                f11 = 0.0f;
                            }
                            if (drawable4 instanceof yb0) {
                                yb0 yb0Var = (yb0) drawable4;
                                if (yb0Var.u != null) {
                                    int currentActionBarHeight = (hv0Var.P() ? org.telegram.ui.ActionBar.l.getCurrentActionBarHeight() : 0) + ((hv0Var.Q() && hv0Var.s) ? AndroidUtilities.statusBarHeight : 0);
                                    int measuredHeight = hv0Var.Y() ? getRootView().getMeasuredHeight() - currentActionBarHeight : getHeight();
                                    float max = Math.max(getMeasuredWidth() / drawable4.getIntrinsicWidth(), measuredHeight / drawable4.getIntrinsicHeight());
                                    int ceil = (int) Math.ceil(drawable4.getIntrinsicWidth() * max * f9);
                                    int ceil2 = (int) Math.ceil(drawable4.getIntrinsicHeight() * max * f9);
                                    int measuredWidth2 = ((getMeasuredWidth() - ceil) / 2) + ((int) f10);
                                    int i17 = ((measuredHeight - ceil2) / 2) + hv0Var.A + currentActionBarHeight + ((int) f11);
                                    canvas.save();
                                    canvas.clipRect(0, currentActionBarHeight, ceil, getMeasuredHeight() - hv0Var.h);
                                    drawable4.setBounds(measuredWidth2, i17, ceil + measuredWidth2, ceil2 + i17);
                                    drawable4.draw(canvas);
                                    hv0.H(hv0Var, canvas);
                                    canvas.restore();
                                } else {
                                    if (hv0Var.h != 0) {
                                        canvas.save();
                                        canvas.clipRect(0, 0, getMeasuredWidth(), getRootView().getMeasuredHeight() - hv0Var.h);
                                    }
                                    yb0Var.f = hv0Var.A;
                                    drawable4.setBounds(0, 0, getMeasuredWidth(), (int) ((getRootView().getMeasuredHeight() - hv0Var.A) + f11));
                                    drawable4.draw(canvas);
                                    if (hv0Var.h != 0) {
                                        canvas.restore();
                                    }
                                }
                            } else if (drawable4 instanceof ColorDrawable) {
                                if (hv0Var.h != 0) {
                                    canvas.save();
                                    i13 = 0;
                                    canvas.clipRect(0, 0, getMeasuredWidth(), getMeasuredHeight() - hv0Var.h);
                                } else {
                                    i13 = 0;
                                }
                                drawable4.setBounds(i13, i13, getMeasuredWidth(), getRootView().getMeasuredHeight());
                                drawable4.draw(canvas);
                                hv0.H(hv0Var, canvas);
                                if (hv0Var.h != 0) {
                                    canvas.restore();
                                }
                            } else if (drawable4 instanceof GradientDrawable) {
                                if (hv0Var.h != 0) {
                                    canvas.save();
                                    i12 = 0;
                                    canvas.clipRect(0, 0, getMeasuredWidth(), getRootView().getMeasuredHeight() - hv0Var.h);
                                } else {
                                    i12 = 0;
                                }
                                drawable4.setBounds(i12, hv0Var.A, getMeasuredWidth(), getRootView().getMeasuredHeight() + hv0Var.A);
                                drawable4.draw(canvas);
                                hv0.H(hv0Var, canvas);
                                if (hv0Var.h != 0) {
                                    canvas.restore();
                                }
                            } else {
                                if (!(drawable4 instanceof BitmapDrawable)) {
                                    if (hv0Var.h != 0) {
                                        canvas.save();
                                        canvas.clipRect(0, 0, getMeasuredWidth(), getRootView().getMeasuredHeight() - hv0Var.h);
                                    }
                                    if (drawable4 instanceof wn) {
                                        wn wnVar = (wn) drawable4;
                                        wnVar.b = this;
                                        yb0 yb0Var2 = wnVar.f;
                                        if (yb0Var2 != null) {
                                            yb0Var2.r(this);
                                        }
                                    }
                                    float f13 = f9 - 1.0f;
                                    float d = a4.w.d(-getMeasuredWidth(), f13, 2.0f, f10);
                                    float d10 = a4.w.d(-getRootView().getMeasuredHeight(), f13, 2.0f, f11);
                                    drawable4.setBounds((int) d, (int) (hv0Var.A + d10), (int) ((getMeasuredWidth() * f9) + d), (int) com.google.android.recaptcha.internal.a.d(getRootView().getMeasuredHeight(), f9, hv0Var.A, d10));
                                    drawable4.draw(canvas);
                                    hv0.H(hv0Var, canvas);
                                    if (hv0Var.h != 0) {
                                        canvas.restore();
                                    }
                                } else if (((BitmapDrawable) drawable4).getTileModeX() == Shader.TileMode.REPEAT) {
                                    canvas.save();
                                    float f14 = f12 / AndroidUtilities.density;
                                    canvas.scale(f14, f14);
                                    drawable4.setBounds(0, 0, (int) Math.ceil(getMeasuredWidth() / f14), (int) Math.ceil(getRootView().getMeasuredHeight() / f14));
                                    drawable4.draw(canvas);
                                    hv0.H(hv0Var, canvas);
                                    canvas.restore();
                                } else {
                                    int currentActionBarHeight2 = (hv0Var.P() ? org.telegram.ui.ActionBar.l.getCurrentActionBarHeight() : 0) + ((hv0Var.Q() && hv0Var.s) ? AndroidUtilities.statusBarHeight : 0);
                                    int measuredHeight2 = hv0Var.Y() ? getRootView().getMeasuredHeight() - currentActionBarHeight2 : getHeight();
                                    float max2 = Math.max(getMeasuredWidth() / drawable4.getIntrinsicWidth(), measuredHeight2 / drawable4.getIntrinsicHeight());
                                    int ceil3 = (int) Math.ceil(drawable4.getIntrinsicWidth() * max2 * f9);
                                    int ceil4 = (int) Math.ceil(drawable4.getIntrinsicHeight() * max2 * f9);
                                    int measuredWidth3 = ((getMeasuredWidth() - ceil3) / 2) + ((int) f10);
                                    int i18 = ((measuredHeight2 - ceil4) / 2) + hv0Var.A + currentActionBarHeight2 + ((int) f11);
                                    canvas.save();
                                    canvas.clipRect(0, currentActionBarHeight2, ceil3, getMeasuredHeight() - hv0Var.h);
                                    drawable4.setBounds(measuredWidth3, i18, ceil3 + measuredWidth3, ceil4 + i18);
                                    drawable4.draw(canvas);
                                    hv0.H(hv0Var, canvas);
                                    canvas.restore();
                                }
                                if (i16 != 0 && (drawable = hv0Var.d) != null && hv0Var.h0 >= 1.0f) {
                                    if (hv0Var.I && (drawable instanceof wn)) {
                                        ((wn) drawable).g(hv0Var.H);
                                    }
                                    if (hv0Var.I) {
                                        Drawable drawable5 = hv0Var.d;
                                        if (drawable5 instanceof yb0) {
                                            ((yb0) drawable5).l();
                                        }
                                    }
                                    hv0Var.d = null;
                                    hv0Var.e = false;
                                    hv0Var.I();
                                    hv0Var.H.invalidate();
                                }
                            }
                            if (i16 != 0) {
                            }
                        }
                        i16++;
                        i14 = 255;
                        i15 = 1;
                        f12 = 2.0f;
                    }
                    if (hv0Var.h0 != 1.0f) {
                        hv0Var.H.invalidate();
                        break;
                    }
                }
                break;
            case 23:
                super.onDraw(canvas);
                int w02 = g6.w0(null, g6.Vi, false);
                xx0 xx0Var = (xx0) this.b;
                org.telegram.ui.Components.voip.h hVar = xx0Var.H;
                Paint paint2 = xx0Var.a;
                paint2.setColor(w02);
                Paint paint3 = xx0Var.b;
                paint3.setColor(w02);
                Paint paint4 = xx0Var.c;
                paint4.setColor(w02);
                paint3.setAlpha(255);
                paint4.setAlpha(82);
                paint2.setAlpha(46);
                Paint paint5 = xx0Var.d;
                paint5.setColor(g6.w0(null, g6.d6, false));
                canvas.drawLine(AndroidUtilities.dp(24.0f), AndroidUtilities.dp(20.0f), getMeasuredWidth() - AndroidUtilities.dp(24.0f), AndroidUtilities.dp(20.0f), paint2);
                boolean z10 = xx0Var.e;
                if (z10 || xx0Var.F != 0.0f) {
                    if (!z10) {
                        float f15 = xx0Var.F - 0.10666667f;
                        xx0Var.F = f15;
                        if (f15 < 0.0f) {
                            xx0Var.F = 0.0f;
                        }
                    } else if (xx0Var.G) {
                        float f16 = xx0Var.F + 0.024615385f;
                        xx0Var.F = f16;
                        if (f16 > 1.0f) {
                            xx0Var.F = 1.0f;
                            xx0Var.G = false;
                        }
                    } else {
                        float f17 = xx0Var.F - 0.024615385f;
                        xx0Var.F = f17;
                        if (f17 < 0.0f) {
                            xx0Var.F = 0.0f;
                            xx0Var.G = true;
                        }
                    }
                    invalidate();
                    RectF rectF2 = AndroidUtilities.rectTmp;
                    rectF2.set(AndroidUtilities.dp(24.0f), AndroidUtilities.dp(17.0f), getMeasuredWidth() - AndroidUtilities.dp(24.0f), AndroidUtilities.dp(23.0f));
                    hVar.f = getMeasuredWidth();
                    hVar.a(AndroidUtilities.dp(3.0f), canvas, rectF2, null);
                }
                int dp = AndroidUtilities.dp(24.0f);
                if (!xx0Var.e) {
                    int dp2 = AndroidUtilities.dp(24.0f) + ((int) (org.telegram.ui.b.z(24.0f, 2, getMeasuredWidth()) * xx0Var.B));
                    canvas.drawLine(dp, AndroidUtilities.dp(20.0f), AndroidUtilities.dp(24.0f) + r2, AndroidUtilities.dp(20.0f), paint4);
                    canvas.drawRect(dp2, AndroidUtilities.dp(20.0f) - AndroidUtilities.dp(3.0f), AndroidUtilities.dp(3.0f) + dp2, AndroidUtilities.dp(3.0f) + AndroidUtilities.dp(20.0f), paint5);
                }
                if (!xx0Var.e) {
                    int z11 = (int) (org.telegram.ui.b.z(24.0f, 2, getMeasuredWidth()) * xx0Var.A);
                    if (z11 < AndroidUtilities.dp(1.0f)) {
                        z11 = AndroidUtilities.dp(1.0f);
                    }
                    int dp3 = AndroidUtilities.dp(24.0f) + z11;
                    canvas.drawLine(dp, AndroidUtilities.dp(20.0f), AndroidUtilities.dp(24.0f) + z11, AndroidUtilities.dp(20.0f), paint3);
                    canvas.drawRect(dp3, AndroidUtilities.dp(20.0f) - AndroidUtilities.dp(3.0f), AndroidUtilities.dp(3.0f) + dp3, AndroidUtilities.dp(3.0f) + AndroidUtilities.dp(20.0f), paint5);
                    break;
                }
                break;
            case 24:
                if (getAlpha() != 0.0f) {
                    RectF rectF3 = AndroidUtilities.rectTmp;
                    rectF3.set(0.0f, 0.0f, getWidth(), getHeight());
                    ((org.telegram.ui.Components.voip.h1) this.b).n.a(AndroidUtilities.dp(10.0f), canvas, rectF3, null);
                    invalidate();
                    break;
                }
                break;
            case 28:
                canvas.drawColor(((zi0) this.b).getThemedColor(g6.e7));
                break;
            case 29:
                hp0 hp0Var = (hp0) this.b;
                String format = String.format("%d", Integer.valueOf(Math.max(1, hp0Var.c.size())));
                int max3 = Math.max(AndroidUtilities.dp(16.0f) + ((int) Math.ceil(hp0Var.O.measureText(format))), AndroidUtilities.dp(24.0f));
                int measuredWidth4 = getMeasuredWidth() / 2;
                getMeasuredHeight();
                hp0Var.O.setColor(g6.w0(null, g6.C5, false));
                hp0Var.Q.setColor(g6.w0(null, g6.h5, false));
                int i19 = max3 / 2;
                hp0Var.P.set(measuredWidth4 - i19, 0.0f, i19 + measuredWidth4, getMeasuredHeight());
                canvas.drawRoundRect(hp0Var.P, AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f), hp0Var.Q);
                hp0Var.Q.setColor(g6.w0(null, g6.B5, false));
                hp0Var.P.set(AndroidUtilities.dp(2.0f) + r14, AndroidUtilities.dp(2.0f), r7 - AndroidUtilities.dp(2.0f), getMeasuredHeight() - AndroidUtilities.dp(2.0f));
                canvas.drawRoundRect(hp0Var.P, AndroidUtilities.dp(10.0f), AndroidUtilities.dp(10.0f), hp0Var.Q);
                canvas.drawText(format, measuredWidth4 - (r6 / 2), AndroidUtilities.dp(16.2f), hp0Var.O);
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
        org.telegram.ui.ActionBar.l lVar3;
        switch (this.a) {
            case 2:
                ia iaVar = (ia) this.b;
                if (iaVar.D) {
                    int i14 = iaVar.E;
                    lVar = ((org.telegram.ui.ActionBar.o2) iaVar).actionBar;
                    i12 = (lVar.getMeasuredHeight() + i14) - AndroidUtilities.dp(16.0f);
                } else {
                    int dp = AndroidUtilities.dp(140.0f) + iaVar.E;
                    if (AndroidUtilities.dp(24.0f) + iaVar.y.getMeasuredHeight() > dp) {
                        dp = AndroidUtilities.dp(24.0f) + iaVar.y.getMeasuredHeight();
                    }
                    i12 = dp;
                }
                super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec((int) (i12 - (0 * 2.5f)), TLObject.FLAG_30));
                break;
            case 3:
            case 7:
            case 8:
            case 13:
            case 17:
            case 18:
            case 20:
            case 21:
            case 24:
            case 25:
            default:
                super.onMeasure(i10, i11);
                break;
            case 4:
                oh.g gVar = (oh.g) this.b;
                if (gVar.D) {
                    int i15 = gVar.E;
                    lVar2 = ((org.telegram.ui.ActionBar.o2) gVar).actionBar;
                    i13 = (lVar2.getMeasuredHeight() + i15) - AndroidUtilities.dp(16.0f);
                } else {
                    int dp2 = AndroidUtilities.dp(140.0f) + gVar.E;
                    if (AndroidUtilities.dp(24.0f) + gVar.y.getMeasuredHeight() > dp2) {
                        dp2 = AndroidUtilities.dp(24.0f) + gVar.y.getMeasuredHeight();
                    }
                    i13 = dp2;
                }
                super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec((int) (i13 - (0 * 2.5f)), TLObject.FLAG_30));
                break;
            case 5:
                setMeasuredDimension(View.MeasureSpec.getSize(i10), AndroidUtilities.navigationBarHeight);
                setTranslationY(AndroidUtilities.navigationBarHeight);
                break;
            case 6:
                f2.j0 j0Var = ((p5) this.b).d.B;
                super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(Math.max(0, j0Var instanceof kz ? ((kz) j0Var).J : 0), TLObject.FLAG_30));
                break;
            case 9:
                xa xaVar = (xa) this.b;
                int i16 = xaVar.h;
                int dp3 = (i16 == 0 ? AndroidUtilities.dp(300.0f) : (int) (i16 * xaVar.v)) - (((xaVar.C - xaVar.D) - xaVar.E) - xaVar.F);
                if (dp3 < 1) {
                    dp3 = 1;
                }
                super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(dp3, TLObject.FLAG_30));
                break;
            case 10:
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(((cm) this.b).v.F, TLObject.FLAG_30));
                break;
            case 11:
                setMeasuredDimension(View.MeasureSpec.getSize(i10), ((mn) this.b).d.N0);
                break;
            case 12:
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(((pn) ((u7) this.b).d).w, TLObject.FLAG_30));
                break;
            case 14:
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(getPaddingRight() + getPaddingLeft() + Math.round(((zz0) this.b).l()), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(Math.max(getPaddingBottom() + getPaddingTop() + Math.round(((zz0) this.b).j()), AndroidUtilities.dp(26.0f)), TLObject.FLAG_30));
                break;
            case 15:
                super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(48.0f) + ((r60) this.b).c.k0, TLObject.FLAG_30));
                break;
            case 16:
                int dp4 = AndroidUtilities.dp(48.0f);
                x60 x60Var = ((t60) this.b).n;
                super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(dp4 + x60Var.k0 + x60Var.q0, TLObject.FLAG_30));
                break;
            case 19:
                super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(((zp0) this.b).G.F.R, TLObject.FLAG_30));
                break;
            case 22:
                fw0 fw0Var = (fw0) this.b;
                int size = View.MeasureSpec.getSize(i10);
                if (size <= 0) {
                    size = ((View) getParent()).getMeasuredWidth();
                }
                int size2 = View.MeasureSpec.getSize(i11) - AndroidUtilities.dp(4.0f);
                ow0 ow0Var = fw0Var.d;
                int i17 = ow0Var.c3;
                int max = Math.max(i17 > 0 ? AndroidUtilities.dp(4.0f) + i17 : 0, (int) (size - Math.min(AndroidUtilities.dp(4.0f) + ((fw0Var.h() - 1) * size2), fw0Var.d.T2 * size2)));
                ow0Var.b3 = max;
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(max, TLObject.FLAG_30), i11);
                break;
            case 23:
                super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(40.0f), TLObject.FLAG_30));
                break;
            case 26:
                z10 z10Var = (z10) this.b;
                if (z10Var.D) {
                    int i18 = z10Var.E;
                    lVar3 = ((org.telegram.ui.ActionBar.o2) z10Var).actionBar;
                    z10Var.F = (lVar3.getMeasuredHeight() + i18) - AndroidUtilities.dp(16.0f);
                } else {
                    int dp5 = AndroidUtilities.dp(140.0f) + z10Var.E;
                    if (AndroidUtilities.dp(24.0f) + z10Var.y.getMeasuredHeight() > dp5) {
                        dp5 = Math.max(dp5, (AndroidUtilities.dp(24.0f) + z10Var.y.getMeasuredHeight()) - z10Var.H);
                    }
                    z10Var.F = dp5;
                }
                int i19 = (int) (z10Var.F - (0 * 2.5f));
                z10Var.F = i19;
                super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(i19, TLObject.FLAG_30));
                break;
            case 27:
                setMeasuredDimension(View.MeasureSpec.getSize(i10), AndroidUtilities.dp(38.0f));
                break;
        }
    }

    @Override // android.view.View
    public void onSizeChanged(int i10, int i11, int i12, int i13) {
        switch (this.a) {
            case 24:
                super.onSizeChanged(i10, i11, i12, i13);
                ((org.telegram.ui.Components.voip.h1) this.b).n.f = i10;
                break;
            default:
                super.onSizeChanged(i10, i11, i12, i13);
                break;
        }
    }

    @Override // android.view.View
    public void setAlpha(float f9) {
        switch (this.a) {
            case 7:
                super.setAlpha(f9);
                View view = ((a8) this.b).b.x.fragmentView;
                if (view != null) {
                    view.invalidate();
                    break;
                }
                break;
            case 25:
                super.setAlpha(f9);
                View view2 = ((fy) this.b).fragmentView;
                if (view2 != null) {
                    view2.invalidate();
                    break;
                }
                break;
            default:
                super.setAlpha(f9);
                break;
        }
    }

    @Override // android.view.View
    public void setBackground(Drawable drawable) {
        switch (this.a) {
            case 1:
                if (((ih.d2) this.b) != null) {
                    if (isAttachedToWindow()) {
                        ih.d2 d2Var = (ih.d2) this.b;
                        if (d2Var.i) {
                            d2Var.i = false;
                            d2Var.a();
                            LiteMode.removeOnPowerSaverAppliedListener(d2Var.h);
                        }
                    }
                    this.b = null;
                }
                super.setBackground(drawable);
                if (drawable instanceof ih.d2) {
                    this.b = (ih.d2) drawable;
                    if (isAttachedToWindow()) {
                        ih.d2 d2Var2 = (ih.d2) this.b;
                        if (!d2Var2.i) {
                            d2Var2.i = true;
                            d2Var2.a();
                            ag.i0 i0Var = new ag.i0(d2Var2, 14);
                            d2Var2.h = i0Var;
                            LiteMode.addOnPowerSaverAppliedListener(i0Var);
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
    public void setTranslationX(float f9) {
        switch (this.a) {
            case 20:
                super.setTranslationX(f9);
                invalidate();
                break;
            default:
                super.setTranslationX(f9);
                break;
        }
    }

    @Override // android.view.View
    public void setTranslationY(float f9) {
        ViewGroup viewGroup;
        switch (this.a) {
            case 9:
                super.setTranslationY(f9);
                viewGroup = ((f3) ((xa) this.b)).containerView;
                viewGroup.invalidate();
                break;
            default:
                super.setTranslationY(f9);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h0(Object obj, Context context, int i10) {
        super(context);
        this.a = i10;
        this.b = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h0(xa xaVar, Context context) {
        super(context);
        this.a = 9;
        this.b = xaVar;
        setTag(-33024);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h0(Context context, b50 b50Var) {
        super(context);
        this.a = 27;
        this.b = b50Var;
        NotificationCenter.listenEmojiLoading(this);
        setOnClickListener(new fi0(28, this, context));
    }
}
