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
import org.telegram.messenger.rk;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.Components.CheckBoxBase;
import org.telegram.ui.Components.aw0;
import org.telegram.ui.Components.d70;
import org.telegram.ui.Components.f70;
import org.telegram.ui.Components.gq0;
import org.telegram.ui.Components.gr;
import org.telegram.ui.Components.hm;
import org.telegram.ui.Components.hx0;
import org.telegram.ui.Components.j70;
import org.telegram.ui.Components.kc0;
import org.telegram.ui.Components.pz;
import org.telegram.ui.Components.qq0;
import org.telegram.ui.Components.qy0;
import org.telegram.ui.Components.sn;
import org.telegram.ui.Components.u01;
import org.telegram.ui.Components.uq0;
import org.telegram.ui.Components.vn;
import org.telegram.ui.Components.yw0;
import org.telegram.ui.co;
import org.telegram.ui.iu0;
import org.telegram.ui.r20;
import org.telegram.ui.uy;

/* compiled from: r8-map-id-eaaffe05e5b4975c35db95ddc7f057e1a9a0a254a43fe066fa0ad675f8b3973e */
/* loaded from: classes4.dex */
public final class eb extends View {
    public final /* synthetic */ int a;
    public Object b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ eb(Context context) {
        super(context);
        this.a = 17;
    }

    @Override // android.view.View
    public void dispatchDraw(Canvas canvas) {
        switch (this.a) {
            case 0:
                canvas.save();
                oc ocVar = (oc) this.b;
                canvas.translate(ocVar.c1.getX() + ocVar.l0.getX(), ocVar.c1.getY() + ocVar.l0.getY());
                ec ecVar = ocVar.c1;
                ecVar.k(canvas, ecVar.getBounds(), ocVar.c1.getOver2Alpha());
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
                ((u01) this.b).e(canvas, (getMeasuredWidth() - ((u01) this.b).l()) / 2.0f, getMeasuredHeight() / 2.0f);
                break;
            case 21:
                super.draw(canvas);
                uq0 uq0Var = (uq0) this.b;
                uq0Var.W0.setBounds(0, (getMeasuredHeight() - uq0Var.G0.d) - AndroidUtilities.dp(72.0f), getMeasuredWidth(), getMeasuredHeight());
                uq0Var.W0.draw(canvas);
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
                int i12 = org.telegram.ui.ActionBar.j6.a7;
                yVar2.b(org.telegram.ui.ActionBar.j6.l1(AndroidUtilities.lerp(1.0f, 0.8f, max), k0Var.getThemedColor(i12)));
                yVar2.draw(canvas);
                if (k0Var.N) {
                    max = 1.0f;
                }
                int lerp = AndroidUtilities.lerp(AndroidUtilities.dp(48.0f) + k0Var.U.d, 0, max);
                int lerp2 = AndroidUtilities.lerp(AndroidUtilities.dp(72.0f), 0, max) + k0Var.U.d;
                float lerp3 = AndroidUtilities.lerp(0.8f, AndroidUtilities.getNavigationBarThirdButtonsFactor(k0Var.U.d), max);
                yVar.c(0, lerp);
                yVar.setBounds(0, getHeight() - lerp2, getWidth(), getHeight());
                yVar.b(org.telegram.ui.ActionBar.j6.l1(lerp3, k0Var.getThemedColor(i12)));
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
                gr grVar = (gr) this.b;
                if (grVar.Z) {
                    i10 = ((org.telegram.ui.ActionBar.f3) grVar).backgroundPaddingLeft;
                    int measuredWidth = getMeasuredWidth();
                    i11 = ((org.telegram.ui.ActionBar.f3) grVar).backgroundPaddingLeft;
                    canvas.drawRect(i10, 0.0f, measuredWidth - i11, 1.0f, org.telegram.ui.ActionBar.j6.k0);
                    break;
                }
                break;
            case 20:
                super.onDraw(canvas);
                ((iu0) this.b).j(canvas, getMeasuredWidth(), getMeasuredHeight());
                break;
            case 23:
                super.onDraw(canvas);
                int offsetColor = AndroidUtilities.getOffsetColor(-9057429, -10513163, getTranslationX() / getMeasuredWidth(), 1.0f);
                int offsetColor2 = AndroidUtilities.getOffsetColor(-11554882, -4629871, getTranslationX() / getMeasuredWidth(), 1.0f);
                gq0 gq0Var = (gq0) this.b;
                RectF rectF = gq0Var.h;
                Paint paint2 = gq0Var.f;
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
                        if (newDrawable instanceof kc0) {
                            ((kc0) newDrawable).r(aw0Var.L);
                        }
                        aw0Var.b = newDrawable;
                        if (aw0Var.M && (newDrawable instanceof co)) {
                            ((co) newDrawable).f(this);
                        }
                        if (aw0Var.M) {
                            Drawable drawable3 = aw0Var.b;
                            if (drawable3 instanceof kc0) {
                                ((kc0) drawable3).k();
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
                            if (drawable4 instanceof kc0) {
                                kc0 kc0Var = (kc0) drawable4;
                                if (kc0Var.u != null) {
                                    int currentActionBarHeight = (aw0Var.P() ? org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() : 0) + ((aw0Var.Q() && aw0Var.s) ? AndroidUtilities.statusBarHeight : 0);
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
                                    kc0Var.f = aw0Var.E;
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
                                    if (drawable4 instanceof co) {
                                        co coVar = (co) drawable4;
                                        coVar.b = this;
                                        kc0 kc0Var2 = coVar.f;
                                        if (kc0Var2 != null) {
                                            kc0Var2.r(this);
                                        }
                                    }
                                    float f14 = f7 - 1.0f;
                                    float A = a4.a.A(-getMeasuredWidth(), f14, 2.0f, f10);
                                    float A2 = a4.a.A(-getRootView().getMeasuredHeight(), f14, 2.0f, f11);
                                    drawable4.setBounds((int) A, (int) (aw0Var.E + A2), (int) ((getMeasuredWidth() * f7) + A), (int) org.telegram.ui.Cells.c1.b(getRootView().getMeasuredHeight(), f7, aw0Var.E, A2));
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
                                    int currentActionBarHeight2 = (aw0Var.P() ? org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() : 0) + ((aw0Var.Q() && aw0Var.s) ? AndroidUtilities.statusBarHeight : 0);
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
                                if (aw0Var.M && (drawable instanceof co)) {
                                    ((co) drawable).g(aw0Var.L);
                                }
                                if (aw0Var.M) {
                                    Drawable drawable5 = aw0Var.d;
                                    if (drawable5 instanceof kc0) {
                                        ((kc0) drawable5).l();
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
                qy0 qy0Var = (qy0) this.b;
                org.telegram.ui.Components.voip.h hVar = qy0Var.L;
                Paint paint3 = qy0Var.a;
                paint3.setColor(w02);
                Paint paint4 = qy0Var.b;
                paint4.setColor(w02);
                Paint paint5 = qy0Var.c;
                paint5.setColor(w02);
                paint4.setAlpha(255);
                paint5.setAlpha(82);
                paint3.setAlpha(46);
                Paint paint6 = qy0Var.d;
                paint6.setColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.d6, false));
                canvas.drawLine(AndroidUtilities.dp(24.0f), AndroidUtilities.dp(20.0f), getMeasuredWidth() - AndroidUtilities.dp(24.0f), AndroidUtilities.dp(20.0f), paint3);
                boolean z10 = qy0Var.e;
                if (z10 || qy0Var.J != 0.0f) {
                    if (!z10) {
                        float f16 = qy0Var.J - 0.10666667f;
                        qy0Var.J = f16;
                        if (f16 < 0.0f) {
                            qy0Var.J = 0.0f;
                        }
                    } else if (qy0Var.K) {
                        float f17 = qy0Var.J + 0.024615385f;
                        qy0Var.J = f17;
                        if (f17 > 1.0f) {
                            qy0Var.J = 1.0f;
                            qy0Var.K = false;
                        }
                    } else {
                        float f18 = qy0Var.J - 0.024615385f;
                        qy0Var.J = f18;
                        if (f18 < 0.0f) {
                            qy0Var.J = 0.0f;
                            qy0Var.K = true;
                        }
                    }
                    invalidate();
                    RectF rectF2 = AndroidUtilities.rectTmp;
                    rectF2.set(AndroidUtilities.dp(24.0f), AndroidUtilities.dp(17.0f), getMeasuredWidth() - AndroidUtilities.dp(24.0f), AndroidUtilities.dp(23.0f));
                    hVar.f = getMeasuredWidth();
                    hVar.a(AndroidUtilities.dp(3.0f), canvas, rectF2, null);
                }
                int dp2 = AndroidUtilities.dp(24.0f);
                if (qy0Var.e) {
                    paint = paint6;
                    f13 = 1.0f;
                } else {
                    int dp3 = AndroidUtilities.dp(24.0f) + ((int) (rk.B(24.0f, 2, getMeasuredWidth()) * qy0Var.F));
                    f13 = 1.0f;
                    canvas.drawLine(dp2, AndroidUtilities.dp(20.0f), AndroidUtilities.dp(24.0f) + r2, AndroidUtilities.dp(20.0f), paint5);
                    canvas.drawRect(dp3, AndroidUtilities.dp(20.0f) - AndroidUtilities.dp(3.0f), AndroidUtilities.dp(3.0f) + dp3, AndroidUtilities.dp(3.0f) + AndroidUtilities.dp(20.0f), paint6);
                    paint = paint6;
                }
                if (!qy0Var.e) {
                    int B = (int) (rk.B(24.0f, 2, getMeasuredWidth()) * qy0Var.E);
                    if (B < AndroidUtilities.dp(f13)) {
                        B = AndroidUtilities.dp(f13);
                    }
                    int dp4 = AndroidUtilities.dp(24.0f) + B;
                    canvas.drawLine(dp2, AndroidUtilities.dp(20.0f), AndroidUtilities.dp(24.0f) + B, AndroidUtilities.dp(20.0f), paint4);
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
                s4.c0 c0Var = ((org.telegram.ui.o5) this.b).d.F;
                super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(Math.max(0, c0Var instanceof pz ? ((pz) c0Var).J : 0), TLObject.FLAG_30));
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
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(((hm) this.b).v.J, TLObject.FLAG_30));
                break;
            case 14:
                setMeasuredDimension(View.MeasureSpec.getSize(i10), ((sn) this.b).d.R0);
                break;
            case 15:
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(((vn) ((org.telegram.ui.x7) this.b).d).w, TLObject.FLAG_30));
                break;
            case 17:
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(getPaddingRight() + getPaddingLeft() + Math.round(((u01) this.b).l()), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(Math.max(getPaddingBottom() + getPaddingTop() + Math.round(((u01) this.b).j()), AndroidUtilities.dp(26.0f)), TLObject.FLAG_30));
                break;
            case 18:
                super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(48.0f) + ((d70) this.b).c.o0, TLObject.FLAG_30));
                break;
            case 19:
                int dp4 = AndroidUtilities.dp(48.0f);
                j70 j70Var = ((f70) this.b).n;
                super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(dp4 + j70Var.o0 + j70Var.u0, TLObject.FLAG_30));
                break;
            case 22:
                super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(((qq0) this.b).K.J.R, TLObject.FLAG_30));
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
                r20 r20Var = (r20) this.b;
                if (r20Var.H) {
                    int i19 = r20Var.I;
                    kVar3 = ((org.telegram.ui.ActionBar.n2) r20Var).actionBar;
                    r20Var.J = (kVar3.getMeasuredHeight() + i19) - AndroidUtilities.dp(16.0f);
                } else {
                    int dp5 = AndroidUtilities.dp(140.0f) + r20Var.I;
                    if (AndroidUtilities.dp(24.0f) + r20Var.y.getMeasuredHeight() > dp5) {
                        dp5 = Math.max(dp5, (AndroidUtilities.dp(24.0f) + r20Var.y.getMeasuredHeight()) - r20Var.L);
                    }
                    r20Var.J = dp5;
                }
                int i20 = (int) (r20Var.J - (0 * 2.5f));
                r20Var.J = i20;
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
                View view = ((org.telegram.ui.d8) this.b).b.x.fragmentView;
                if (view != null) {
                    view.invalidate();
                    break;
                }
                break;
            case 28:
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
                viewGroup = ((org.telegram.ui.ActionBar.f3) ((org.telegram.ui.Components.ab) this.b)).containerView;
                viewGroup.invalidate();
                break;
            default:
                super.setTranslationY(f7);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ eb(Object obj, Context context, int i10) {
        super(context);
        this.a = i10;
        this.b = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public eb(org.telegram.ui.Components.ab abVar, Context context) {
        super(context);
        this.a = 12;
        this.b = abVar;
        setTag(-33024);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public eb(Context context, org.telegram.ui.ActionBar.f6 f6Var) {
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
