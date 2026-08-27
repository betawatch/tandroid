package ag;

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
import hh.oa;
import lh.ib;
import lh.sb;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LiteMode;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.rl;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Components.dp0;
import org.telegram.ui.Components.dz;
import org.telegram.ui.Components.gn;
import org.telegram.ui.Components.gw0;
import org.telegram.ui.Components.j60;
import org.telegram.ui.Components.jn;
import org.telegram.ui.Components.l60;
import org.telegram.ui.Components.nb0;
import org.telegram.ui.Components.op0;
import org.telegram.ui.Components.ox0;
import org.telegram.ui.Components.p60;
import org.telegram.ui.Components.pz0;
import org.telegram.ui.Components.qa;
import org.telegram.ui.Components.sp0;
import org.telegram.ui.Components.ul;
import org.telegram.ui.Components.uq;
import org.telegram.ui.Components.xh0;
import org.telegram.ui.Components.xv0;
import org.telegram.ui.Components.zu0;
import org.telegram.ui.a20;
import org.telegram.ui.c50;
import org.telegram.ui.c8;
import org.telegram.ui.e50;
import org.telegram.ui.gy;
import org.telegram.ui.ht0;
import org.telegram.ui.p5;
import org.telegram.ui.un;
import org.telegram.ui.w7;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class s0 extends View {
    public final /* synthetic */ int a;
    public Object b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ s0(Context context, int i10) {
        super(context);
        this.a = i10;
    }

    @Override // android.view.View
    public void dispatchDraw(Canvas canvas) {
        switch (this.a) {
            case 3:
                canvas.save();
                sb sbVar = (sb) this.b;
                canvas.translate(sbVar.Y0.getX() + sbVar.h0.getX(), sbVar.Y0.getY() + sbVar.h0.getY());
                ib ibVar = sbVar.Y0;
                ibVar.k(canvas, ibVar.getBounds(), sbVar.Y0.getOver2Alpha());
                canvas.restore();
                break;
            case 7:
                canvas.drawRect(0.0f, 0.0f, getWidth(), getHeight(), ((org.telegram.ui.ActionBar.h3) this.b).d);
                break;
            case 29:
                super.dispatchDraw(canvas);
                c50 c50Var = (c50) this.b;
                if (c50Var != null && c50Var.a(canvas, getMeasuredWidth(), 0.0f)) {
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
                ((pz0) this.b).e(canvas, (getMeasuredWidth() - ((pz0) this.b).l()) / 2.0f, getMeasuredHeight() / 2.0f);
                break;
            case 20:
                super.draw(canvas);
                sp0 sp0Var = (sp0) this.b;
                sp0Var.S0.setBounds(0, (getMeasuredHeight() - sp0Var.C0.d) - AndroidUtilities.dp(72.0f), getMeasuredWidth(), getMeasuredHeight());
                sp0Var.S0.draw(canvas);
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
                ((zu0) this.b).T();
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
                gh.g2 g2Var = (gh.g2) this.b;
                if (g2Var != null && !g2Var.i) {
                    g2Var.i = true;
                    g2Var.a();
                    n0 n0Var = new n0(g2Var, 9);
                    g2Var.h = n0Var;
                    LiteMode.addOnPowerSaverAppliedListener(n0Var);
                    break;
                }
                break;
            case 29:
                super.onAttachedToWindow();
                c50 c50Var = (c50) this.b;
                if (c50Var != null) {
                    c50Var.g = this;
                    int i10 = 0;
                    while (true) {
                        e50[] e50VarArr = c50Var.c;
                        if (i10 >= e50VarArr.length) {
                            break;
                        } else {
                            e50 e50Var = e50VarArr[i10];
                            e50Var.i.add(this);
                            e50Var.a();
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
                gh.g2 g2Var = (gh.g2) this.b;
                if (g2Var != null && g2Var.i) {
                    g2Var.i = false;
                    g2Var.a();
                    LiteMode.removeOnPowerSaverAppliedListener(g2Var.h);
                    break;
                }
                break;
            case 29:
                super.onDetachedFromWindow();
                c50 c50Var = (c50) this.b;
                if (c50Var != null && c50Var.g != this) {
                    int i10 = 0;
                    while (true) {
                        e50[] e50VarArr = c50Var.c;
                        if (i10 >= e50VarArr.length) {
                            c50Var.g = null;
                            break;
                        } else {
                            e50 e50Var = e50VarArr[i10];
                            e50Var.i.remove(this);
                            e50Var.a();
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
        float f10;
        float f11;
        float f12;
        float f13;
        Drawable drawable;
        Paint paint;
        float f14;
        switch (this.a) {
            case 0:
                super.onDraw(canvas);
                i1 i1Var = (i1) this.b;
                if (i1Var.l0 - i1Var.k0 > 1) {
                    c6Var = ((org.telegram.ui.ActionBar.e3) i1Var).resourcesProvider;
                    Paint T0 = g6.T0("paintDivider", c6Var);
                    if (T0 == null) {
                        T0 = g6.k0;
                    }
                    canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), 1.0f, T0);
                    break;
                }
                break;
            case 6:
                super.onDraw(canvas);
                oh.j0 j0Var = (oh.j0) this.b;
                gf.c0 c0Var = j0Var.G;
                float max = Math.max(j0Var.b.e, j0Var.c.e);
                gf.c0 c0Var2 = j0Var.F;
                c0Var2.c(AndroidUtilities.dp(42.0f) + j0Var.Q.b, 0);
                c0Var2.setBounds(0, 0, getWidth(), AndroidUtilities.dp(56.0f) + j0Var.Q.b);
                int i12 = g6.a7;
                c0Var2.b(g6.l1(AndroidUtilities.lerp(1.0f, 0.8f, max), j0Var.getThemedColor(i12)));
                c0Var2.draw(canvas);
                if (j0Var.J) {
                    max = 1.0f;
                }
                int lerp = AndroidUtilities.lerp(AndroidUtilities.dp(48.0f) + j0Var.Q.d, 0, max);
                int lerp2 = AndroidUtilities.lerp(AndroidUtilities.dp(72.0f), 0, max) + j0Var.Q.d;
                float lerp3 = AndroidUtilities.lerp(0.8f, AndroidUtilities.getNavigationBarThirdButtonsFactor(j0Var.Q.d), max);
                c0Var.c(0, lerp);
                c0Var.setBounds(0, getHeight() - lerp2, getWidth(), getHeight());
                c0Var.b(g6.l1(lerp3, j0Var.getThemedColor(i12)));
                c0Var.draw(canvas);
                break;
            case 10:
                org.telegram.ui.Cells.p2 p2Var = (org.telegram.ui.Cells.p2) this.b;
                p2Var.f4.setBounds(0, 0, getWidth(), getHeight());
                p2Var.f4.draw(canvas);
                break;
            case 15:
                uq uqVar = (uq) this.b;
                if (uqVar.V) {
                    i10 = ((org.telegram.ui.ActionBar.e3) uqVar).backgroundPaddingLeft;
                    int measuredWidth = getMeasuredWidth();
                    i11 = ((org.telegram.ui.ActionBar.e3) uqVar).backgroundPaddingLeft;
                    canvas.drawRect(i10, 0.0f, measuredWidth - i11, 1.0f, g6.k0);
                    break;
                }
                break;
            case 19:
                super.onDraw(canvas);
                ((ht0) this.b).j(canvas, getMeasuredWidth(), getMeasuredHeight());
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
                zu0 zu0Var = (zu0) this.b;
                if (zu0Var.b != null && !zu0Var.F) {
                    Drawable newDrawable = zu0Var.getNewDrawable();
                    boolean newDrawableMotion = zu0Var.getNewDrawableMotion();
                    Drawable drawable2 = zu0Var.b;
                    if (newDrawable != drawable2 && newDrawable != null) {
                        if (g6.sl != null) {
                            zu0Var.d = drawable2;
                            zu0Var.e = zu0Var.c;
                        }
                        if (newDrawable instanceof nb0) {
                            ((nb0) newDrawable).r(zu0Var.H);
                        }
                        zu0Var.b = newDrawable;
                        if (zu0Var.I && (newDrawable instanceof un)) {
                            ((un) newDrawable).f(this);
                        }
                        if (zu0Var.I) {
                            Drawable drawable3 = zu0Var.b;
                            if (drawable3 instanceof nb0) {
                                ((nb0) drawable3).k();
                            }
                        }
                        zu0Var.c = newDrawableMotion;
                        zu0Var.h0 = 0.0f;
                        zu0Var.U(zu0Var.b);
                        zu0Var.I();
                    } else if (zu0Var.c != newDrawableMotion) {
                        zu0Var.c = newDrawableMotion;
                        zu0Var.I();
                    }
                    zu0Var.h0 = Utilities.clamp((AndroidUtilities.screenRefreshTime / 200.0f) + zu0Var.h0, 1.0f, 0.0f);
                    int i13 = 0;
                    while (i13 < 2) {
                        Drawable drawable4 = i13 == 0 ? zu0Var.d : zu0Var.b;
                        if (drawable4 != null) {
                            if (i13 != 1 || zu0Var.d == null || zu0Var.C == null) {
                                drawable4.setAlpha(255);
                            } else {
                                drawable4.setAlpha((int) (zu0Var.h0 * 255.0f));
                            }
                            if (i13 == 0 ? zu0Var.e : zu0Var.c) {
                                f10 = zu0Var.y;
                                f11 = zu0Var.w;
                                f12 = zu0Var.x;
                            } else {
                                f10 = 1.0f;
                                f11 = 0.0f;
                                f12 = 0.0f;
                            }
                            if (drawable4 instanceof nb0) {
                                nb0 nb0Var = (nb0) drawable4;
                                if (nb0Var.u != null) {
                                    int currentActionBarHeight = (zu0Var.P() ? org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() : 0) + ((zu0Var.Q() && zu0Var.s) ? AndroidUtilities.statusBarHeight : 0);
                                    int measuredHeight = zu0Var.Y() ? getRootView().getMeasuredHeight() - currentActionBarHeight : getHeight();
                                    f13 = 1.0f;
                                    float max2 = Math.max(getMeasuredWidth() / drawable4.getIntrinsicWidth(), measuredHeight / drawable4.getIntrinsicHeight());
                                    int ceil = (int) Math.ceil(drawable4.getIntrinsicWidth() * max2 * f10);
                                    int ceil2 = (int) Math.ceil(drawable4.getIntrinsicHeight() * max2 * f10);
                                    int measuredWidth2 = ((getMeasuredWidth() - ceil) / 2) + ((int) f11);
                                    int i14 = ((measuredHeight - ceil2) / 2) + zu0Var.A + currentActionBarHeight + ((int) f12);
                                    canvas.save();
                                    canvas.clipRect(0, currentActionBarHeight, ceil, getMeasuredHeight() - zu0Var.h);
                                    drawable4.setBounds(measuredWidth2, i14, ceil + measuredWidth2, ceil2 + i14);
                                    drawable4.draw(canvas);
                                    zu0.G(zu0Var, canvas);
                                    canvas.restore();
                                } else {
                                    f13 = 1.0f;
                                    if (zu0Var.h != 0) {
                                        canvas.save();
                                        canvas.clipRect(0, 0, getMeasuredWidth(), getRootView().getMeasuredHeight() - zu0Var.h);
                                    }
                                    nb0Var.f = zu0Var.A;
                                    drawable4.setBounds(0, 0, getMeasuredWidth(), (int) ((getRootView().getMeasuredHeight() - zu0Var.A) + f12));
                                    drawable4.draw(canvas);
                                    if (zu0Var.h != 0) {
                                        canvas.restore();
                                    }
                                }
                            } else {
                                f13 = 1.0f;
                                if (drawable4 instanceof ColorDrawable) {
                                    if (zu0Var.h != 0) {
                                        canvas.save();
                                        canvas.clipRect(0, 0, getMeasuredWidth(), getMeasuredHeight() - zu0Var.h);
                                    }
                                    drawable4.setBounds(0, 0, getMeasuredWidth(), getRootView().getMeasuredHeight());
                                    drawable4.draw(canvas);
                                    zu0.G(zu0Var, canvas);
                                    if (zu0Var.h != 0) {
                                        canvas.restore();
                                    }
                                } else if (drawable4 instanceof GradientDrawable) {
                                    if (zu0Var.h != 0) {
                                        canvas.save();
                                        canvas.clipRect(0, 0, getMeasuredWidth(), getRootView().getMeasuredHeight() - zu0Var.h);
                                    }
                                    drawable4.setBounds(0, zu0Var.A, getMeasuredWidth(), getRootView().getMeasuredHeight() + zu0Var.A);
                                    drawable4.draw(canvas);
                                    zu0.G(zu0Var, canvas);
                                    if (zu0Var.h != 0) {
                                        canvas.restore();
                                    }
                                } else if (!(drawable4 instanceof BitmapDrawable)) {
                                    if (zu0Var.h != 0) {
                                        canvas.save();
                                        canvas.clipRect(0, 0, getMeasuredWidth(), getRootView().getMeasuredHeight() - zu0Var.h);
                                    }
                                    if (drawable4 instanceof un) {
                                        un unVar = (un) drawable4;
                                        unVar.b = this;
                                        nb0 nb0Var2 = unVar.f;
                                        if (nb0Var2 != null) {
                                            nb0Var2.r(this);
                                        }
                                    }
                                    float f15 = f10 - 1.0f;
                                    float d = a9.p.d(-getMeasuredWidth(), f15, 2.0f, f11);
                                    float d10 = a9.p.d(-getRootView().getMeasuredHeight(), f15, 2.0f, f12);
                                    drawable4.setBounds((int) d, (int) (zu0Var.A + d10), (int) ((getMeasuredWidth() * f10) + d), (int) com.google.android.recaptcha.internal.a.d(getRootView().getMeasuredHeight(), f10, zu0Var.A, d10));
                                    drawable4.draw(canvas);
                                    zu0.G(zu0Var, canvas);
                                    if (zu0Var.h != 0) {
                                        canvas.restore();
                                    }
                                } else if (((BitmapDrawable) drawable4).getTileModeX() == Shader.TileMode.REPEAT) {
                                    canvas.save();
                                    float f16 = 2.0f / AndroidUtilities.density;
                                    canvas.scale(f16, f16);
                                    drawable4.setBounds(0, 0, (int) Math.ceil(getMeasuredWidth() / f16), (int) Math.ceil(getRootView().getMeasuredHeight() / f16));
                                    drawable4.draw(canvas);
                                    zu0.G(zu0Var, canvas);
                                    canvas.restore();
                                } else {
                                    int currentActionBarHeight2 = (zu0Var.P() ? org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() : 0) + ((zu0Var.Q() && zu0Var.s) ? AndroidUtilities.statusBarHeight : 0);
                                    int measuredHeight2 = zu0Var.Y() ? getRootView().getMeasuredHeight() - currentActionBarHeight2 : getHeight();
                                    float max3 = Math.max(getMeasuredWidth() / drawable4.getIntrinsicWidth(), measuredHeight2 / drawable4.getIntrinsicHeight());
                                    int ceil3 = (int) Math.ceil(drawable4.getIntrinsicWidth() * max3 * f10);
                                    int ceil4 = (int) Math.ceil(drawable4.getIntrinsicHeight() * max3 * f10);
                                    int measuredWidth3 = ((getMeasuredWidth() - ceil3) / 2) + ((int) f11);
                                    int i15 = ((measuredHeight2 - ceil4) / 2) + zu0Var.A + currentActionBarHeight2 + ((int) f12);
                                    canvas.save();
                                    canvas.clipRect(0, currentActionBarHeight2, ceil3, getMeasuredHeight() - zu0Var.h);
                                    drawable4.setBounds(measuredWidth3, i15, ceil3 + measuredWidth3, ceil4 + i15);
                                    drawable4.draw(canvas);
                                    zu0.G(zu0Var, canvas);
                                    canvas.restore();
                                }
                            }
                            if (i13 == 0 && (drawable = zu0Var.d) != null && zu0Var.h0 >= f13) {
                                if (zu0Var.I && (drawable instanceof un)) {
                                    ((un) drawable).g(zu0Var.H);
                                }
                                if (zu0Var.I) {
                                    Drawable drawable5 = zu0Var.d;
                                    if (drawable5 instanceof nb0) {
                                        ((nb0) drawable5).l();
                                    }
                                }
                                zu0Var.d = null;
                                zu0Var.e = false;
                                zu0Var.I();
                                zu0Var.H.invalidate();
                            }
                        }
                        i13++;
                    }
                    if (zu0Var.h0 != 1.0f) {
                        zu0Var.H.invalidate();
                        break;
                    }
                }
                break;
            case 25:
                super.onDraw(canvas);
                int w02 = g6.w0(null, g6.Vi, false);
                ox0 ox0Var = (ox0) this.b;
                org.telegram.ui.Components.voip.h hVar = ox0Var.H;
                Paint paint3 = ox0Var.a;
                paint3.setColor(w02);
                Paint paint4 = ox0Var.b;
                paint4.setColor(w02);
                Paint paint5 = ox0Var.c;
                paint5.setColor(w02);
                paint4.setAlpha(255);
                paint5.setAlpha(82);
                paint3.setAlpha(46);
                Paint paint6 = ox0Var.d;
                paint6.setColor(g6.w0(null, g6.d6, false));
                canvas.drawLine(AndroidUtilities.dp(24.0f), AndroidUtilities.dp(20.0f), getMeasuredWidth() - AndroidUtilities.dp(24.0f), AndroidUtilities.dp(20.0f), paint3);
                boolean z10 = ox0Var.e;
                if (z10 || ox0Var.F != 0.0f) {
                    if (!z10) {
                        float f17 = ox0Var.F - 0.10666667f;
                        ox0Var.F = f17;
                        if (f17 < 0.0f) {
                            ox0Var.F = 0.0f;
                        }
                    } else if (ox0Var.G) {
                        float f18 = ox0Var.F + 0.024615385f;
                        ox0Var.F = f18;
                        if (f18 > 1.0f) {
                            ox0Var.F = 1.0f;
                            ox0Var.G = false;
                        }
                    } else {
                        float f19 = ox0Var.F - 0.024615385f;
                        ox0Var.F = f19;
                        if (f19 < 0.0f) {
                            ox0Var.F = 0.0f;
                            ox0Var.G = true;
                        }
                    }
                    invalidate();
                    RectF rectF2 = AndroidUtilities.rectTmp;
                    rectF2.set(AndroidUtilities.dp(24.0f), AndroidUtilities.dp(17.0f), getMeasuredWidth() - AndroidUtilities.dp(24.0f), AndroidUtilities.dp(23.0f));
                    hVar.f = getMeasuredWidth();
                    hVar.a(AndroidUtilities.dp(3.0f), canvas, rectF2, null);
                }
                int dp = AndroidUtilities.dp(24.0f);
                if (ox0Var.e) {
                    paint = paint6;
                    f14 = 1.0f;
                } else {
                    int dp2 = AndroidUtilities.dp(24.0f) + ((int) (rl.z(24.0f, 2, getMeasuredWidth()) * ox0Var.B));
                    f14 = 1.0f;
                    canvas.drawLine(dp, AndroidUtilities.dp(20.0f), AndroidUtilities.dp(24.0f) + r2, AndroidUtilities.dp(20.0f), paint5);
                    canvas.drawRect(dp2, AndroidUtilities.dp(20.0f) - AndroidUtilities.dp(3.0f), AndroidUtilities.dp(3.0f) + dp2, AndroidUtilities.dp(3.0f) + AndroidUtilities.dp(20.0f), paint6);
                    paint = paint6;
                }
                if (!ox0Var.e) {
                    int z11 = (int) (rl.z(24.0f, 2, getMeasuredWidth()) * ox0Var.A);
                    if (z11 < AndroidUtilities.dp(f14)) {
                        z11 = AndroidUtilities.dp(f14);
                    }
                    int dp3 = AndroidUtilities.dp(24.0f) + z11;
                    canvas.drawLine(dp, AndroidUtilities.dp(20.0f), AndroidUtilities.dp(24.0f) + z11, AndroidUtilities.dp(20.0f), paint4);
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
    public void onMeasure(int i10, int i11) {
        int i12;
        org.telegram.ui.ActionBar.k kVar;
        int i13;
        org.telegram.ui.ActionBar.k kVar2;
        int i14;
        org.telegram.ui.ActionBar.k kVar3;
        org.telegram.ui.ActionBar.k kVar4;
        switch (this.a) {
            case 2:
                oa oaVar = (oa) this.b;
                if (oaVar.D) {
                    int i15 = oaVar.E;
                    kVar = ((org.telegram.ui.ActionBar.n2) oaVar).actionBar;
                    i12 = (kVar.getMeasuredHeight() + i15) - AndroidUtilities.dp(16.0f);
                } else {
                    int dp = AndroidUtilities.dp(140.0f) + oaVar.E;
                    if (AndroidUtilities.dp(24.0f) + oaVar.y.getMeasuredHeight() > dp) {
                        dp = AndroidUtilities.dp(24.0f) + oaVar.y.getMeasuredHeight();
                    }
                    i12 = dp;
                }
                super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec((int) (i12 - (0 * 2.5f)), TLObject.FLAG_30));
                break;
            case 3:
            case 6:
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
                super.onMeasure(i10, i11);
                break;
            case 4:
                mh.g gVar = (mh.g) this.b;
                if (gVar.D) {
                    int i16 = gVar.E;
                    kVar2 = ((org.telegram.ui.ActionBar.n2) gVar).actionBar;
                    i13 = (kVar2.getMeasuredHeight() + i16) - AndroidUtilities.dp(16.0f);
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
                nh.k kVar5 = (nh.k) this.b;
                if (kVar5.D) {
                    int i17 = kVar5.E;
                    kVar3 = ((org.telegram.ui.ActionBar.n2) kVar5).actionBar;
                    i14 = (kVar3.getMeasuredHeight() + i17) - AndroidUtilities.dp(16.0f);
                } else {
                    int dp3 = AndroidUtilities.dp(140.0f) + kVar5.E;
                    if (AndroidUtilities.dp(24.0f) + kVar5.y.getMeasuredHeight() > dp3) {
                        dp3 = AndroidUtilities.dp(24.0f) + kVar5.y.getMeasuredHeight();
                    }
                    i14 = dp3;
                }
                super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec((int) (i14 - (0 * 2.5f)), TLObject.FLAG_30));
                break;
            case 7:
                setMeasuredDimension(View.MeasureSpec.getSize(i10), AndroidUtilities.navigationBarHeight);
                setTranslationY(AndroidUtilities.navigationBarHeight);
                break;
            case 8:
                f2.k0 k0Var = ((p5) this.b).d.B;
                super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(Math.max(0, k0Var instanceof dz ? ((dz) k0Var).J : 0), TLObject.FLAG_30));
                break;
            case 11:
                qa qaVar = (qa) this.b;
                int i18 = qaVar.h;
                int dp4 = (i18 == 0 ? AndroidUtilities.dp(300.0f) : (int) (i18 * qaVar.v)) - (((qaVar.C - qaVar.D) - qaVar.E) - qaVar.F);
                if (dp4 < 1) {
                    dp4 = 1;
                }
                super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(dp4, TLObject.FLAG_30));
                break;
            case 12:
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(((ul) this.b).v.F, TLObject.FLAG_30));
                break;
            case 13:
                setMeasuredDimension(View.MeasureSpec.getSize(i10), ((gn) this.b).d.N0);
                break;
            case 14:
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(((jn) ((w7) this.b).d).w, TLObject.FLAG_30));
                break;
            case 16:
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(getPaddingRight() + getPaddingLeft() + Math.round(((pz0) this.b).l()), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(Math.max(getPaddingBottom() + getPaddingTop() + Math.round(((pz0) this.b).j()), AndroidUtilities.dp(26.0f)), TLObject.FLAG_30));
                break;
            case 17:
                super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(48.0f) + ((j60) this.b).c.k0, TLObject.FLAG_30));
                break;
            case 18:
                int dp5 = AndroidUtilities.dp(48.0f);
                p60 p60Var = ((l60) this.b).n;
                super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(dp5 + p60Var.k0 + p60Var.q0, TLObject.FLAG_30));
                break;
            case 21:
                super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(((op0) this.b).G.F.R, TLObject.FLAG_30));
                break;
            case 24:
                xv0 xv0Var = (xv0) this.b;
                int size = View.MeasureSpec.getSize(i10);
                if (size <= 0) {
                    size = ((View) getParent()).getMeasuredWidth();
                }
                int size2 = View.MeasureSpec.getSize(i11) - AndroidUtilities.dp(4.0f);
                gw0 gw0Var = xv0Var.d;
                int i19 = gw0Var.c3;
                int max = Math.max(i19 > 0 ? AndroidUtilities.dp(4.0f) + i19 : 0, (int) (size - Math.min(AndroidUtilities.dp(4.0f) + ((xv0Var.h() - 1) * size2), xv0Var.d.T2 * size2)));
                gw0Var.b3 = max;
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(max, TLObject.FLAG_30), i11);
                break;
            case 25:
                super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(40.0f), TLObject.FLAG_30));
                break;
            case 28:
                a20 a20Var = (a20) this.b;
                if (a20Var.D) {
                    int i20 = a20Var.E;
                    kVar4 = ((org.telegram.ui.ActionBar.n2) a20Var).actionBar;
                    a20Var.F = (kVar4.getMeasuredHeight() + i20) - AndroidUtilities.dp(16.0f);
                } else {
                    int dp6 = AndroidUtilities.dp(140.0f) + a20Var.E;
                    if (AndroidUtilities.dp(24.0f) + a20Var.y.getMeasuredHeight() > dp6) {
                        dp6 = Math.max(dp6, (AndroidUtilities.dp(24.0f) + a20Var.y.getMeasuredHeight()) - a20Var.H);
                    }
                    a20Var.F = dp6;
                }
                int i21 = (int) (a20Var.F - (0 * 2.5f));
                a20Var.F = i21;
                super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(i21, TLObject.FLAG_30));
                break;
            case 29:
                setMeasuredDimension(View.MeasureSpec.getSize(i10), AndroidUtilities.dp(38.0f));
                break;
        }
    }

    @Override // android.view.View
    public void onSizeChanged(int i10, int i11, int i12, int i13) {
        switch (this.a) {
            case 26:
                super.onSizeChanged(i10, i11, i12, i13);
                ((org.telegram.ui.Components.voip.g1) this.b).n.f = i10;
                break;
            default:
                super.onSizeChanged(i10, i11, i12, i13);
                break;
        }
    }

    @Override // android.view.View
    public void setAlpha(float f10) {
        switch (this.a) {
            case 9:
                super.setAlpha(f10);
                View view = ((c8) this.b).b.x.fragmentView;
                if (view != null) {
                    view.invalidate();
                    break;
                }
                break;
            case 27:
                super.setAlpha(f10);
                View view2 = ((gy) this.b).fragmentView;
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
            case 1:
                if (((gh.g2) this.b) != null) {
                    if (isAttachedToWindow()) {
                        gh.g2 g2Var = (gh.g2) this.b;
                        if (g2Var.i) {
                            g2Var.i = false;
                            g2Var.a();
                            LiteMode.removeOnPowerSaverAppliedListener(g2Var.h);
                        }
                    }
                    this.b = null;
                }
                super.setBackground(drawable);
                if (drawable instanceof gh.g2) {
                    this.b = (gh.g2) drawable;
                    if (isAttachedToWindow()) {
                        gh.g2 g2Var2 = (gh.g2) this.b;
                        if (!g2Var2.i) {
                            g2Var2.i = true;
                            g2Var2.a();
                            n0 n0Var = new n0(g2Var2, 9);
                            g2Var2.h = n0Var;
                            LiteMode.addOnPowerSaverAppliedListener(n0Var);
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
                viewGroup = ((org.telegram.ui.ActionBar.e3) ((qa) this.b)).containerView;
                viewGroup.invalidate();
                break;
            default:
                super.setTranslationY(f10);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ s0(Object obj, Context context, int i10) {
        super(context);
        this.a = i10;
        this.b = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s0(qa qaVar, Context context) {
        super(context);
        this.a = 11;
        this.b = qaVar;
        setTag(-33024);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s0(Context context, c50 c50Var) {
        super(context);
        this.a = 29;
        this.b = c50Var;
        NotificationCenter.listenEmojiLoading(this);
        setOnClickListener(new xh0(28, this, context));
    }
}
