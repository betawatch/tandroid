package eg;

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
import lh.ja;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LiteMode;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.g3;
import org.telegram.ui.ActionBar.j3;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Components.d70;
import org.telegram.ui.Components.dm;
import org.telegram.ui.Components.dr;
import org.telegram.ui.Components.ec0;
import org.telegram.ui.Components.hq0;
import org.telegram.ui.Components.hy0;
import org.telegram.ui.Components.k01;
import org.telegram.ui.Components.lq0;
import org.telegram.ui.Components.nn;
import org.telegram.ui.Components.ow0;
import org.telegram.ui.Components.pz;
import org.telegram.ui.Components.qn;
import org.telegram.ui.Components.qv0;
import org.telegram.ui.Components.rx0;
import org.telegram.ui.Components.sa;
import org.telegram.ui.Components.x60;
import org.telegram.ui.Components.xp0;
import org.telegram.ui.Components.xw0;
import org.telegram.ui.Components.z60;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.a8;
import org.telegram.ui.co;
import org.telegram.ui.g8;
import org.telegram.ui.jj0;
import org.telegram.ui.mq0;
import org.telegram.ui.n20;
import org.telegram.ui.p50;
import org.telegram.ui.qy;
import org.telegram.ui.r50;
import org.telegram.ui.t5;
import org.telegram.ui.ut0;
import org.telegram.ui.wp0;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
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
                canvas.drawRect(0.0f, 0.0f, getWidth(), getHeight(), ((j3) this.b).d);
                break;
            case 25:
                super.dispatchDraw(canvas);
                p50 p50Var = (p50) this.b;
                if (p50Var != null && p50Var.a(canvas, getMeasuredWidth(), 0.0f)) {
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
            case 12:
                super.draw(canvas);
                ((k01) this.b).e(canvas, (getMeasuredWidth() - ((k01) this.b).l()) / 2.0f, getMeasuredHeight() / 2.0f);
                break;
            case 16:
                super.draw(canvas);
                lq0 lq0Var = (lq0) this.b;
                lq0Var.T0.setBounds(0, (getMeasuredHeight() - lq0Var.D0.d) - AndroidUtilities.dp(72.0f), getMeasuredWidth(), getMeasuredHeight());
                lq0Var.T0.draw(canvas);
                break;
            default:
                super.draw(canvas);
                break;
        }
    }

    @Override // android.view.View
    public void invalidate() {
        switch (this.a) {
            case 19:
                super.invalidate();
                ((qv0) this.b).T();
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
                kh.c2 c2Var = (kh.c2) this.b;
                if (c2Var != null && !c2Var.i) {
                    c2Var.i = true;
                    c2Var.a();
                    cg.h0 h0Var = new cg.h0(c2Var, 14);
                    c2Var.h = h0Var;
                    LiteMode.addOnPowerSaverAppliedListener(h0Var);
                    break;
                }
                break;
            case 25:
                super.onAttachedToWindow();
                p50 p50Var = (p50) this.b;
                if (p50Var != null) {
                    p50Var.g = this;
                    int i10 = 0;
                    while (true) {
                        r50[] r50VarArr = p50Var.c;
                        if (i10 >= r50VarArr.length) {
                            break;
                        } else {
                            r50 r50Var = r50VarArr[i10];
                            r50Var.i.add(this);
                            r50Var.a();
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
                kh.c2 c2Var = (kh.c2) this.b;
                if (c2Var != null && c2Var.i) {
                    c2Var.i = false;
                    c2Var.a();
                    LiteMode.removeOnPowerSaverAppliedListener(c2Var.h);
                    break;
                }
                break;
            case 25:
                super.onDetachedFromWindow();
                p50 p50Var = (p50) this.b;
                if (p50Var != null && p50Var.g != this) {
                    int i10 = 0;
                    while (true) {
                        r50[] r50VarArr = p50Var.c;
                        if (i10 >= r50VarArr.length) {
                            p50Var.g = null;
                            break;
                        } else {
                            r50 r50Var = r50VarArr[i10];
                            r50Var.i.remove(this);
                            r50Var.a();
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
        f6 f6Var;
        int i10;
        int i11;
        float f10;
        float f11;
        float f12;
        float f13;
        Drawable drawable;
        int i12 = 255;
        int i13 = 1;
        switch (this.a) {
            case 0:
                super.onDraw(canvas);
                v0 v0Var = (v0) this.b;
                if (v0Var.m0 - v0Var.l0 > 1) {
                    f6Var = ((g3) v0Var).resourcesProvider;
                    Paint T0 = j6.T0("paintDivider", f6Var);
                    if (T0 == null) {
                        T0 = j6.k0;
                    }
                    canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), 1.0f, T0);
                    break;
                }
                break;
            case 6:
                org.telegram.ui.Cells.q2 q2Var = (org.telegram.ui.Cells.q2) this.b;
                q2Var.g4.setBounds(0, 0, getWidth(), getHeight());
                q2Var.g4.draw(canvas);
                break;
            case 11:
                dr drVar = (dr) this.b;
                if (drVar.W) {
                    i10 = ((g3) drVar).backgroundPaddingLeft;
                    int measuredWidth = getMeasuredWidth();
                    i11 = ((g3) drVar).backgroundPaddingLeft;
                    canvas.drawRect(i10, 0.0f, measuredWidth - i11, 1.0f, j6.k0);
                    break;
                }
                break;
            case 15:
                super.onDraw(canvas);
                ((ut0) this.b).j(canvas, getMeasuredWidth(), getMeasuredHeight());
                break;
            case 18:
                super.onDraw(canvas);
                int offsetColor = AndroidUtilities.getOffsetColor(-9057429, -10513163, getTranslationX() / getMeasuredWidth(), 1.0f);
                int offsetColor2 = AndroidUtilities.getOffsetColor(-11554882, -4629871, getTranslationX() / getMeasuredWidth(), 1.0f);
                xp0 xp0Var = (xp0) this.b;
                RectF rectF = xp0Var.h;
                Paint paint = xp0Var.f;
                if (offsetColor != 0) {
                    paint.setShader(new LinearGradient(0.0f, 0.0f, getMeasuredWidth(), 0.0f, new int[]{offsetColor, offsetColor2}, (float[]) null, Shader.TileMode.CLAMP));
                }
                rectF.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                canvas.drawRoundRect(rectF, AndroidUtilities.dp(18.0f), AndroidUtilities.dp(18.0f), paint);
                break;
            case 19:
                float f14 = 2.0f;
                qv0 qv0Var = (qv0) this.b;
                if (qv0Var.b != null && !qv0Var.G) {
                    Drawable newDrawable = qv0Var.getNewDrawable();
                    boolean newDrawableMotion = qv0Var.getNewDrawableMotion();
                    Drawable drawable2 = qv0Var.b;
                    if (newDrawable != drawable2 && newDrawable != null) {
                        if (j6.sl != null) {
                            qv0Var.d = drawable2;
                            qv0Var.e = qv0Var.c;
                        }
                        if (newDrawable instanceof ec0) {
                            ((ec0) newDrawable).r(qv0Var.I);
                        }
                        qv0Var.b = newDrawable;
                        if (qv0Var.J && (newDrawable instanceof co)) {
                            ((co) newDrawable).f(this);
                        }
                        if (qv0Var.J) {
                            Drawable drawable3 = qv0Var.b;
                            if (drawable3 instanceof ec0) {
                                ((ec0) drawable3).k();
                            }
                        }
                        qv0Var.c = newDrawableMotion;
                        qv0Var.i0 = 0.0f;
                        qv0Var.U(qv0Var.b);
                        qv0Var.I();
                    } else if (qv0Var.c != newDrawableMotion) {
                        qv0Var.c = newDrawableMotion;
                        qv0Var.I();
                    }
                    qv0Var.i0 = Utilities.clamp((AndroidUtilities.screenRefreshTime / 200.0f) + qv0Var.i0, 1.0f, 0.0f);
                    int i14 = 0;
                    while (i14 < 2) {
                        Drawable drawable4 = i14 == 0 ? qv0Var.d : qv0Var.b;
                        if (drawable4 != null) {
                            if (i14 != i13 || qv0Var.d == null || qv0Var.D == null) {
                                drawable4.setAlpha(i12);
                            } else {
                                drawable4.setAlpha((int) (qv0Var.i0 * 255.0f));
                            }
                            if (i14 == 0 ? qv0Var.e : qv0Var.c) {
                                f10 = qv0Var.y;
                                f11 = qv0Var.w;
                                f12 = qv0Var.x;
                            } else {
                                f10 = 1.0f;
                                f11 = 0.0f;
                                f12 = 0.0f;
                            }
                            if (drawable4 instanceof ec0) {
                                ec0 ec0Var = (ec0) drawable4;
                                if (ec0Var.u != null) {
                                    int currentActionBarHeight = (qv0Var.P() ? org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() : 0) + ((qv0Var.Q() && qv0Var.s) ? AndroidUtilities.statusBarHeight : 0);
                                    int measuredHeight = qv0Var.Y() ? getRootView().getMeasuredHeight() - currentActionBarHeight : getHeight();
                                    float max = Math.max(getMeasuredWidth() / drawable4.getIntrinsicWidth(), measuredHeight / drawable4.getIntrinsicHeight());
                                    int ceil = (int) Math.ceil(drawable4.getIntrinsicWidth() * max * f10);
                                    f13 = 1.0f;
                                    int ceil2 = (int) Math.ceil(drawable4.getIntrinsicHeight() * max * f10);
                                    int measuredWidth2 = ((getMeasuredWidth() - ceil) / 2) + ((int) f11);
                                    int i15 = ((measuredHeight - ceil2) / 2) + qv0Var.B + currentActionBarHeight + ((int) f12);
                                    canvas.save();
                                    canvas.clipRect(0, currentActionBarHeight, ceil, getMeasuredHeight() - qv0Var.h);
                                    drawable4.setBounds(measuredWidth2, i15, ceil + measuredWidth2, ceil2 + i15);
                                    drawable4.draw(canvas);
                                    qv0.H(qv0Var, canvas);
                                    canvas.restore();
                                } else {
                                    f13 = 1.0f;
                                    if (qv0Var.h != 0) {
                                        canvas.save();
                                        canvas.clipRect(0, 0, getMeasuredWidth(), getRootView().getMeasuredHeight() - qv0Var.h);
                                    }
                                    ec0Var.f = qv0Var.B;
                                    drawable4.setBounds(0, 0, getMeasuredWidth(), (int) ((getRootView().getMeasuredHeight() - qv0Var.B) + f12));
                                    drawable4.draw(canvas);
                                    if (qv0Var.h != 0) {
                                        canvas.restore();
                                    }
                                }
                            } else {
                                f13 = 1.0f;
                                if (drawable4 instanceof ColorDrawable) {
                                    if (qv0Var.h != 0) {
                                        canvas.save();
                                        canvas.clipRect(0, 0, getMeasuredWidth(), getMeasuredHeight() - qv0Var.h);
                                    }
                                    drawable4.setBounds(0, 0, getMeasuredWidth(), getRootView().getMeasuredHeight());
                                    drawable4.draw(canvas);
                                    qv0.H(qv0Var, canvas);
                                    if (qv0Var.h != 0) {
                                        canvas.restore();
                                    }
                                } else if (drawable4 instanceof GradientDrawable) {
                                    if (qv0Var.h != 0) {
                                        canvas.save();
                                        canvas.clipRect(0, 0, getMeasuredWidth(), getRootView().getMeasuredHeight() - qv0Var.h);
                                    }
                                    drawable4.setBounds(0, qv0Var.B, getMeasuredWidth(), getRootView().getMeasuredHeight() + qv0Var.B);
                                    drawable4.draw(canvas);
                                    qv0.H(qv0Var, canvas);
                                    if (qv0Var.h != 0) {
                                        canvas.restore();
                                    }
                                } else {
                                    if (!(drawable4 instanceof BitmapDrawable)) {
                                        if (qv0Var.h != 0) {
                                            canvas.save();
                                            canvas.clipRect(0, 0, getMeasuredWidth(), getRootView().getMeasuredHeight() - qv0Var.h);
                                        }
                                        if (drawable4 instanceof co) {
                                            co coVar = (co) drawable4;
                                            coVar.b = this;
                                            ec0 ec0Var2 = coVar.f;
                                            if (ec0Var2 != null) {
                                                ec0Var2.r(this);
                                            }
                                        }
                                        float f15 = f10 - 1.0f;
                                        float d = android.support.v4.media.a.d(-getMeasuredWidth(), f15, 2.0f, f11);
                                        float d10 = android.support.v4.media.a.d(-getRootView().getMeasuredHeight(), f15, 2.0f, f12);
                                        drawable4.setBounds((int) d, (int) (qv0Var.B + d10), (int) ((getMeasuredWidth() * f10) + d), (int) e2.c.A(getRootView().getMeasuredHeight(), f10, qv0Var.B, d10));
                                        drawable4.draw(canvas);
                                        qv0.H(qv0Var, canvas);
                                        if (qv0Var.h != 0) {
                                            canvas.restore();
                                        }
                                    } else if (((BitmapDrawable) drawable4).getTileModeX() == Shader.TileMode.REPEAT) {
                                        canvas.save();
                                        float f16 = f14 / AndroidUtilities.density;
                                        canvas.scale(f16, f16);
                                        drawable4.setBounds(0, 0, (int) Math.ceil(getMeasuredWidth() / f16), (int) Math.ceil(getRootView().getMeasuredHeight() / f16));
                                        drawable4.draw(canvas);
                                        qv0.H(qv0Var, canvas);
                                        canvas.restore();
                                    } else {
                                        int currentActionBarHeight2 = (qv0Var.P() ? org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() : 0) + ((qv0Var.Q() && qv0Var.s) ? AndroidUtilities.statusBarHeight : 0);
                                        int measuredHeight2 = qv0Var.Y() ? getRootView().getMeasuredHeight() - currentActionBarHeight2 : getHeight();
                                        float max2 = Math.max(getMeasuredWidth() / drawable4.getIntrinsicWidth(), measuredHeight2 / drawable4.getIntrinsicHeight());
                                        int ceil3 = (int) Math.ceil(drawable4.getIntrinsicWidth() * max2 * f10);
                                        int ceil4 = (int) Math.ceil(drawable4.getIntrinsicHeight() * max2 * f10);
                                        int measuredWidth3 = ((getMeasuredWidth() - ceil3) / 2) + ((int) f11);
                                        int i16 = ((measuredHeight2 - ceil4) / 2) + qv0Var.B + currentActionBarHeight2 + ((int) f12);
                                        canvas.save();
                                        canvas.clipRect(0, currentActionBarHeight2, ceil3, getMeasuredHeight() - qv0Var.h);
                                        drawable4.setBounds(measuredWidth3, i16, ceil3 + measuredWidth3, ceil4 + i16);
                                        drawable4.draw(canvas);
                                        qv0.H(qv0Var, canvas);
                                        canvas.restore();
                                    }
                                    if (i14 != 0 && (drawable = qv0Var.d) != null && qv0Var.i0 >= f13) {
                                        if (qv0Var.J && (drawable instanceof co)) {
                                            ((co) drawable).g(qv0Var.I);
                                        }
                                        if (qv0Var.J) {
                                            Drawable drawable5 = qv0Var.d;
                                            if (drawable5 instanceof ec0) {
                                                ((ec0) drawable5).l();
                                            }
                                        }
                                        qv0Var.d = null;
                                        qv0Var.e = false;
                                        qv0Var.I();
                                        qv0Var.I.invalidate();
                                    }
                                }
                            }
                            if (i14 != 0) {
                            }
                        }
                        i14++;
                        i12 = 255;
                        i13 = 1;
                        f14 = 2.0f;
                    }
                    if (qv0Var.i0 != 1.0f) {
                        qv0Var.I.invalidate();
                        break;
                    }
                }
                break;
            case 21:
                super.onDraw(canvas);
                int w02 = j6.w0(null, j6.Vi, false);
                hy0 hy0Var = (hy0) this.b;
                org.telegram.ui.Components.voip.h hVar = hy0Var.I;
                Paint paint2 = hy0Var.a;
                paint2.setColor(w02);
                Paint paint3 = hy0Var.b;
                paint3.setColor(w02);
                Paint paint4 = hy0Var.c;
                paint4.setColor(w02);
                paint3.setAlpha(255);
                paint4.setAlpha(82);
                paint2.setAlpha(46);
                Paint paint5 = hy0Var.d;
                paint5.setColor(j6.w0(null, j6.d6, false));
                canvas.drawLine(AndroidUtilities.dp(24.0f), AndroidUtilities.dp(20.0f), getMeasuredWidth() - AndroidUtilities.dp(24.0f), AndroidUtilities.dp(20.0f), paint2);
                boolean z4 = hy0Var.e;
                if (z4 || hy0Var.G != 0.0f) {
                    if (!z4) {
                        float f17 = hy0Var.G - 0.10666667f;
                        hy0Var.G = f17;
                        if (f17 < 0.0f) {
                            hy0Var.G = 0.0f;
                        }
                    } else if (hy0Var.H) {
                        float f18 = hy0Var.G + 0.024615385f;
                        hy0Var.G = f18;
                        if (f18 > 1.0f) {
                            hy0Var.G = 1.0f;
                            hy0Var.H = false;
                        }
                    } else {
                        float f19 = hy0Var.G - 0.024615385f;
                        hy0Var.G = f19;
                        if (f19 < 0.0f) {
                            hy0Var.G = 0.0f;
                            hy0Var.H = true;
                        }
                    }
                    invalidate();
                    RectF rectF2 = AndroidUtilities.rectTmp;
                    rectF2.set(AndroidUtilities.dp(24.0f), AndroidUtilities.dp(17.0f), getMeasuredWidth() - AndroidUtilities.dp(24.0f), AndroidUtilities.dp(23.0f));
                    hVar.f = getMeasuredWidth();
                    hVar.a(AndroidUtilities.dp(3.0f), canvas, rectF2, null);
                }
                int dp = AndroidUtilities.dp(24.0f);
                if (!hy0Var.e) {
                    int dp2 = AndroidUtilities.dp(24.0f) + ((int) (org.telegram.ui.b.z(24.0f, 2, getMeasuredWidth()) * hy0Var.C));
                    canvas.drawLine(dp, AndroidUtilities.dp(20.0f), AndroidUtilities.dp(24.0f) + r2, AndroidUtilities.dp(20.0f), paint4);
                    canvas.drawRect(dp2, AndroidUtilities.dp(20.0f) - AndroidUtilities.dp(3.0f), AndroidUtilities.dp(3.0f) + dp2, AndroidUtilities.dp(3.0f) + AndroidUtilities.dp(20.0f), paint5);
                }
                if (!hy0Var.e) {
                    int z10 = (int) (org.telegram.ui.b.z(24.0f, 2, getMeasuredWidth()) * hy0Var.B);
                    if (z10 < AndroidUtilities.dp(1.0f)) {
                        z10 = AndroidUtilities.dp(1.0f);
                    }
                    int dp3 = AndroidUtilities.dp(24.0f) + z10;
                    canvas.drawLine(dp, AndroidUtilities.dp(20.0f), AndroidUtilities.dp(24.0f) + z10, AndroidUtilities.dp(20.0f), paint3);
                    canvas.drawRect(dp3, AndroidUtilities.dp(20.0f) - AndroidUtilities.dp(3.0f), AndroidUtilities.dp(3.0f) + dp3, AndroidUtilities.dp(3.0f) + AndroidUtilities.dp(20.0f), paint5);
                    break;
                }
                break;
            case 22:
                if (getAlpha() != 0.0f) {
                    RectF rectF3 = AndroidUtilities.rectTmp;
                    rectF3.set(0.0f, 0.0f, getWidth(), getHeight());
                    ((org.telegram.ui.Components.voip.g1) this.b).n.a(AndroidUtilities.dp(10.0f), canvas, rectF3, null);
                    invalidate();
                    break;
                }
                break;
            case 26:
                canvas.drawColor(((jj0) this.b).getThemedColor(j6.e7));
                break;
            case 27:
                wp0 wp0Var = (wp0) this.b;
                String format = String.format("%d", Integer.valueOf(Math.max(1, wp0Var.c.size())));
                int max3 = Math.max(AndroidUtilities.dp(16.0f) + ((int) Math.ceil(wp0Var.P.measureText(format))), AndroidUtilities.dp(24.0f));
                int measuredWidth4 = getMeasuredWidth() / 2;
                getMeasuredHeight();
                wp0Var.P.setColor(j6.w0(null, j6.C5, false));
                wp0Var.R.setColor(j6.w0(null, j6.h5, false));
                int i17 = max3 / 2;
                wp0Var.Q.set(measuredWidth4 - i17, 0.0f, i17 + measuredWidth4, getMeasuredHeight());
                canvas.drawRoundRect(wp0Var.Q, AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f), wp0Var.R);
                wp0Var.R.setColor(j6.w0(null, j6.B5, false));
                wp0Var.Q.set(AndroidUtilities.dp(2.0f) + r8, AndroidUtilities.dp(2.0f), r5 - AndroidUtilities.dp(2.0f), getMeasuredHeight() - AndroidUtilities.dp(2.0f));
                canvas.drawRoundRect(wp0Var.Q, AndroidUtilities.dp(10.0f), AndroidUtilities.dp(10.0f), wp0Var.R);
                canvas.drawText(format, measuredWidth4 - (r4 / 2), AndroidUtilities.dp(16.2f), wp0Var.P);
                break;
            case 28:
                mq0 mq0Var = (mq0) this.b;
                String format2 = String.format("%d", Integer.valueOf(Math.max(1, mq0Var.c.size())));
                int max4 = Math.max(AndroidUtilities.dp(16.0f) + ((int) Math.ceil(mq0Var.e0.measureText(format2))), AndroidUtilities.dp(24.0f));
                int measuredWidth5 = getMeasuredWidth() / 2;
                getMeasuredHeight();
                mq0Var.e0.setColor(j6.w0(null, j6.C5, false));
                mq0Var.g0.setColor(j6.w0(null, mq0Var.r0, false));
                int i18 = max4 / 2;
                mq0Var.f0.set(measuredWidth5 - i18, 0.0f, i18 + measuredWidth5, getMeasuredHeight());
                canvas.drawRoundRect(mq0Var.f0, AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f), mq0Var.g0);
                mq0Var.g0.setColor(j6.w0(null, j6.B5, false));
                mq0Var.f0.set(AndroidUtilities.dp(2.0f) + r11, AndroidUtilities.dp(2.0f), r6 - AndroidUtilities.dp(2.0f), getMeasuredHeight() - AndroidUtilities.dp(2.0f));
                canvas.drawRoundRect(mq0Var.f0, AndroidUtilities.dp(10.0f), AndroidUtilities.dp(10.0f), mq0Var.g0);
                canvas.drawText(format2, measuredWidth5 - (r7 / 2), AndroidUtilities.dp(16.2f), mq0Var.e0);
                break;
            case 29:
                ((PhotoViewer) this.b).n3.a(canvas, this);
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
        org.telegram.ui.ActionBar.k kVar2;
        switch (this.a) {
            case 2:
                ja jaVar = (ja) this.b;
                if (jaVar.E) {
                    int i13 = jaVar.F;
                    kVar = ((org.telegram.ui.ActionBar.p2) jaVar).actionBar;
                    i12 = (kVar.getMeasuredHeight() + i13) - AndroidUtilities.dp(16.0f);
                } else {
                    int dp = AndroidUtilities.dp(140.0f) + jaVar.F;
                    if (AndroidUtilities.dp(24.0f) + jaVar.y.getMeasuredHeight() > dp) {
                        dp = AndroidUtilities.dp(24.0f) + jaVar.y.getMeasuredHeight();
                    }
                    i12 = dp;
                }
                super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec((int) (i12 - (0 * 2.5f)), TLObject.FLAG_30));
                break;
            case 3:
                setMeasuredDimension(View.MeasureSpec.getSize(i10), AndroidUtilities.navigationBarHeight);
                setTranslationY(AndroidUtilities.navigationBarHeight);
                break;
            case 4:
                f2.i0 i0Var = ((t5) this.b).d.C;
                super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(Math.max(0, i0Var instanceof pz ? ((pz) i0Var).J : 0), TLObject.FLAG_30));
                break;
            case 5:
            case 6:
            case 11:
            case 15:
            case 16:
            case 18:
            case 19:
            case 22:
            case 23:
            default:
                super.onMeasure(i10, i11);
                break;
            case 7:
                sa saVar = (sa) this.b;
                int i14 = saVar.h;
                int dp2 = (i14 == 0 ? AndroidUtilities.dp(300.0f) : (int) (i14 * saVar.v)) - (((saVar.D - saVar.E) - saVar.F) - saVar.G);
                if (dp2 < 1) {
                    dp2 = 1;
                }
                super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(dp2, TLObject.FLAG_30));
                break;
            case 8:
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(((dm) this.b).v.G, TLObject.FLAG_30));
                break;
            case 9:
                setMeasuredDimension(View.MeasureSpec.getSize(i10), ((nn) this.b).d.O0);
                break;
            case 10:
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(((qn) ((a8) this.b).d).w, TLObject.FLAG_30));
                break;
            case 12:
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(getPaddingRight() + getPaddingLeft() + Math.round(((k01) this.b).l()), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(Math.max(getPaddingBottom() + getPaddingTop() + Math.round(((k01) this.b).j()), AndroidUtilities.dp(26.0f)), TLObject.FLAG_30));
                break;
            case 13:
                super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(48.0f) + ((x60) this.b).c.l0, TLObject.FLAG_30));
                break;
            case 14:
                int dp3 = AndroidUtilities.dp(48.0f);
                d70 d70Var = ((z60) this.b).n;
                super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(dp3 + d70Var.l0 + d70Var.r0, TLObject.FLAG_30));
                break;
            case 17:
                super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(((hq0) this.b).H.G.R, TLObject.FLAG_30));
                break;
            case 20:
                ow0 ow0Var = (ow0) this.b;
                int size = View.MeasureSpec.getSize(i10);
                if (size <= 0) {
                    size = ((View) getParent()).getMeasuredWidth();
                }
                int size2 = View.MeasureSpec.getSize(i11) - AndroidUtilities.dp(4.0f);
                xw0 xw0Var = ow0Var.d;
                int i15 = xw0Var.d3;
                int max = Math.max(i15 > 0 ? AndroidUtilities.dp(4.0f) + i15 : 0, (int) (size - Math.min(AndroidUtilities.dp(4.0f) + ((ow0Var.h() - 1) * size2), ow0Var.d.U2 * size2)));
                xw0Var.c3 = max;
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(max, TLObject.FLAG_30), i11);
                break;
            case 21:
                super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(40.0f), TLObject.FLAG_30));
                break;
            case 24:
                n20 n20Var = (n20) this.b;
                if (n20Var.E) {
                    int i16 = n20Var.F;
                    kVar2 = ((org.telegram.ui.ActionBar.p2) n20Var).actionBar;
                    n20Var.G = (kVar2.getMeasuredHeight() + i16) - AndroidUtilities.dp(16.0f);
                } else {
                    int dp4 = AndroidUtilities.dp(140.0f) + n20Var.F;
                    if (AndroidUtilities.dp(24.0f) + n20Var.y.getMeasuredHeight() > dp4) {
                        dp4 = Math.max(dp4, (AndroidUtilities.dp(24.0f) + n20Var.y.getMeasuredHeight()) - n20Var.I);
                    }
                    n20Var.G = dp4;
                }
                int i17 = (int) (n20Var.G - (0 * 2.5f));
                n20Var.G = i17;
                super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(i17, TLObject.FLAG_30));
                break;
            case 25:
                setMeasuredDimension(View.MeasureSpec.getSize(i10), AndroidUtilities.dp(38.0f));
                break;
        }
    }

    @Override // android.view.View
    public void onSizeChanged(int i10, int i11, int i12, int i13) {
        switch (this.a) {
            case 22:
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
            case 5:
                super.setAlpha(f10);
                View view = ((g8) this.b).b.x.fragmentView;
                if (view != null) {
                    view.invalidate();
                    break;
                }
                break;
            case 23:
                super.setAlpha(f10);
                View view2 = ((qy) this.b).fragmentView;
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
                if (((kh.c2) this.b) != null) {
                    if (isAttachedToWindow()) {
                        kh.c2 c2Var = (kh.c2) this.b;
                        if (c2Var.i) {
                            c2Var.i = false;
                            c2Var.a();
                            LiteMode.removeOnPowerSaverAppliedListener(c2Var.h);
                        }
                    }
                    this.b = null;
                }
                super.setBackground(drawable);
                if (drawable instanceof kh.c2) {
                    this.b = (kh.c2) drawable;
                    if (isAttachedToWindow()) {
                        kh.c2 c2Var2 = (kh.c2) this.b;
                        if (!c2Var2.i) {
                            c2Var2.i = true;
                            c2Var2.a();
                            cg.h0 h0Var = new cg.h0(c2Var2, 14);
                            c2Var2.h = h0Var;
                            LiteMode.addOnPowerSaverAppliedListener(h0Var);
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
            case 18:
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
            case 7:
                super.setTranslationY(f10);
                viewGroup = ((g3) ((sa) this.b)).containerView;
                viewGroup.invalidate();
                break;
            default:
                super.setTranslationY(f10);
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
    public h0(sa saVar, Context context) {
        super(context);
        this.a = 7;
        this.b = saVar;
        setTag(-33024);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h0(Context context, p50 p50Var) {
        super(context);
        this.a = 25;
        this.b = p50Var;
        NotificationCenter.listenEmojiLoading(this);
        setOnClickListener(new rx0(25, this, context));
    }
}
