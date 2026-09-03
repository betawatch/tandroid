package eg;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.FrameLayout;
import nh.y3;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DispatchQueue;
import org.telegram.messenger.FileLog;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.e5;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Components.b30;
import org.telegram.ui.Components.fg;
import org.telegram.ui.Components.mr;
import org.telegram.ui.Components.ng0;
import org.telegram.ui.Components.p9;
import org.telegram.ui.Components.w9;
import org.telegram.ui.Components.x80;
import org.telegram.ui.Components.x9;
import org.telegram.ui.bf0;
import org.telegram.ui.g70;
import org.telegram.ui.jd1;
import org.telegram.ui.nd;
import org.telegram.ui.pd;
import org.telegram.ui.ps;
import org.telegram.ui.ro;
import org.telegram.ui.tz;
import org.telegram.ui.w81;
import org.telegram.ui.wg1;
import org.telegram.ui.x61;
import org.telegram.ui.xn;
import org.telegram.ui.yz;
import org.telegram.ui.zn;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class i0 extends View implements xd.b {
    public final /* synthetic */ int a;
    public final Object b;
    public final Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i0(Object obj, Context context, Object obj2, int i10) {
        super(context);
        this.a = i10;
        this.c = obj;
        this.b = obj2;
    }

    @Override // xd.b
    public void L(int i10, float f10, float f11, xd.c cVar) {
        setVisibility(f10 > 0.0f ? 0 : 8);
        setAlpha(f10);
    }

    public boolean a() {
        x9 x9Var = (x9) this.b;
        if (x9Var.t) {
            return (x9Var.m == 1.0f || !x9Var.p) && x9Var.n && x9Var.d.getAlpha() == 1.0f && getVisibility() == 0;
        }
        return false;
    }

    public void b(boolean z4, boolean z10) {
        ((xd.a) this.c).a(z4, z10);
    }

    @Override // android.view.View
    public void dispatchDraw(Canvas canvas) {
        switch (this.a) {
            case 2:
                RectF rectF = (RectF) this.b;
                rectF.set(0.0f, 0.0f, getWidth(), getHeight());
                int measuredWidth = getMeasuredWidth();
                zn znVar = (zn) this.c;
                int backgroundSizeY = znVar.U0.getBackgroundSizeY();
                float x10 = getX();
                float P8 = znVar.P8(this);
                xn xnVar = znVar.ba;
                if (xnVar != null) {
                    xnVar.l(x10, P8, measuredWidth, backgroundSizeY);
                } else {
                    j6.q(x10, P8, measuredWidth, backgroundSizeY);
                }
                canvas.drawRoundRect(rectF, AndroidUtilities.dp(18.0f), AndroidUtilities.dp(18.0f), znVar.getThemedPaint("paintChatActionBackground"));
                xn xnVar2 = znVar.ba;
                if (xnVar2 == null ? j6.a1() : xnVar2.m0()) {
                    canvas.drawRoundRect(rectF, AndroidUtilities.dp(18.0f), AndroidUtilities.dp(18.0f), znVar.getThemedPaint("paintChatActionBackgroundDarken"));
                }
                super.dispatchDraw(canvas);
                break;
            case 10:
                super.dispatchDraw(canvas);
                ((ActionBarLayout) ((e5) this.b)).q(canvas, 0);
                break;
            default:
                super.dispatchDraw(canvas);
                break;
        }
    }

    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v12, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v24 */
    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        Bitmap[] bitmapArr;
        ?? r02;
        float f10;
        float f11;
        char c3;
        org.telegram.ui.ActionBar.k kVar;
        f6 f6Var;
        e5 e5Var;
        switch (this.a) {
            case 0:
                float measuredWidth = getMeasuredWidth() / 2.0f;
                float measuredHeight = getMeasuredHeight() / 2.0f;
                canvas.drawCircle(measuredWidth, measuredHeight, getMeasuredWidth() / 2.0f, (Paint) this.b);
                r1.d().f(-AndroidUtilities.dp(10.0f), 0.0f, getMeasuredWidth(), getMeasuredHeight());
                canvas.drawCircle(measuredWidth, measuredHeight, (getMeasuredWidth() / 2.0f) - AndroidUtilities.dp(2.0f), r1.d().e());
                float dp = AndroidUtilities.dp(18.0f) / 2.0f;
                Drawable drawable = (Drawable) this.c;
                drawable.setBounds((int) (measuredWidth - dp), (int) (measuredHeight - dp), (int) (measuredWidth + dp), (int) (measuredHeight + dp));
                drawable.draw(canvas);
                break;
            case 1:
                Paint paint = (Paint) this.b;
                pd pdVar = (pd) this.c;
                y3 y3Var = pdVar.e;
                if (y3Var != null && y3Var.getImageReceiver().hasNotThumb()) {
                    paint.setAlpha((int) (pdVar.r.getAlpha() * pdVar.e.getImageReceiver().getCurrentAlpha() * 85.0f));
                    canvas.drawCircle(getMeasuredWidth() / 2.0f, getMeasuredHeight() / 2.0f, getMeasuredWidth() / 2.0f, paint);
                    break;
                }
                break;
            case 2:
            case 10:
            default:
                super.onDraw(canvas);
                break;
            case 3:
                x9 x9Var = (x9) this.b;
                Paint paint2 = x9Var.x;
                f6 f6Var2 = x9Var.y;
                Paint paint3 = x9Var.w;
                int i10 = x9Var.b;
                View view = x9Var.c;
                i0 i0Var = x9Var.d;
                if (i0Var != null) {
                    if (i0Var.getMeasuredHeight() != 0 || i0Var.getMeasuredWidth() != 0) {
                        if (i10 == 1 && !x9Var.t && !x9Var.p) {
                            x9Var.a();
                            x9Var.l = false;
                        }
                        Bitmap[] bitmapArr2 = x9Var.g;
                        if ((bitmapArr2 != null || x9Var.o) && x9Var.p) {
                            boolean z4 = x9Var.n;
                            if (z4) {
                                float f12 = x9Var.m;
                                if (f12 != 1.0f) {
                                    float f13 = f12 + 0.09f;
                                    x9Var.m = f13;
                                    if (f13 > 1.0f) {
                                        x9Var.m = 1.0f;
                                    }
                                    i0Var.invalidate();
                                }
                            }
                            if (!z4) {
                                float f14 = x9Var.m;
                                if (f14 != 0.0f) {
                                    float f15 = f14 - 0.09f;
                                    x9Var.m = f15;
                                    if (f15 < 0.0f) {
                                        x9Var.m = 0.0f;
                                    }
                                    i0Var.invalidate();
                                }
                            }
                        }
                        float f16 = x9Var.p ? x9Var.m : 1.0f;
                        if (bitmapArr2 == null && x9Var.o) {
                            paint2.setAlpha((int) (50.0f * f16));
                            canvas.drawPaint(paint2);
                            break;
                        } else {
                            if (f16 == 1.0f) {
                                canvas.save();
                                bitmapArr = bitmapArr2;
                                r02 = 1;
                                f10 = 0.0f;
                                f11 = 255.0f;
                                c3 = 0;
                            } else {
                                bitmapArr = bitmapArr2;
                                r02 = 1;
                                f10 = 0.0f;
                                f11 = 255.0f;
                                c3 = 0;
                                canvas.saveLayerAlpha(0.0f, 0.0f, i0Var.getMeasuredWidth(), i0Var.getMeasuredHeight(), (int) (f16 * 255.0f), 31);
                            }
                            if (bitmapArr != null) {
                                paint3.setAlpha((int) (f16 * f11));
                                if (i10 == r02) {
                                    canvas.translate(f10, x9Var.u);
                                }
                                canvas.save();
                                canvas.scale(i0Var.getMeasuredWidth() / bitmapArr[r02].getWidth(), i0Var.getMeasuredHeight() / bitmapArr[r02].getHeight());
                                canvas.drawBitmap(bitmapArr[r02], f10, f10, paint3);
                                canvas.restore();
                                canvas.save();
                                if (i10 == 0) {
                                    canvas.translate(f10, x9Var.u);
                                }
                                canvas.scale(i0Var.getMeasuredWidth() / bitmapArr[c3].getWidth(), x9Var.s / bitmapArr[c3].getHeight());
                                canvas.drawBitmap(bitmapArr[c3], f10, f10, paint3);
                                canvas.restore();
                                x9Var.t = r02;
                                canvas.drawColor(436207616);
                            }
                            canvas.restore();
                            if (x9Var.n && !x9Var.k) {
                                if (x9Var.g == null || x9Var.l) {
                                    x9Var.k = r02;
                                    x9Var.l = false;
                                    if (x9Var.e == null) {
                                        x9Var.e = new Bitmap[2];
                                        x9Var.j = new Canvas[2];
                                    }
                                    for (int i11 = 0; i11 < 2; i11++) {
                                        if (x9Var.e[i11] != null && i0Var.getMeasuredWidth() == x9Var.r && i0Var.getMeasuredHeight() == x9Var.q) {
                                            x9Var.e[i11].eraseColor(0);
                                        } else {
                                            int measuredHeight2 = i0Var.getMeasuredHeight();
                                            int measuredWidth2 = i0Var.getMeasuredWidth();
                                            int dp2 = AndroidUtilities.dp(200.0f) + AndroidUtilities.statusBarHeight;
                                            x9Var.s = dp2;
                                            if (i11 == 0) {
                                                measuredHeight2 = dp2;
                                            }
                                            try {
                                                x9Var.e[i11] = Bitmap.createBitmap((int) (measuredWidth2 / 15.0f), (int) (measuredHeight2 / 15.0f), Bitmap.Config.ARGB_8888);
                                                x9Var.j[i11] = new Canvas(x9Var.e[i11]);
                                            } catch (Exception e) {
                                                FileLog.e(e);
                                                AndroidUtilities.runOnUIThread(new fg(x9Var, 11));
                                                return;
                                            }
                                        }
                                        if (i11 == r02) {
                                            x9Var.e[i11].eraseColor(j6.v0(j6.d6, f6Var2));
                                        }
                                        x9Var.j[i11].save();
                                        x9Var.j[i11].scale(0.06666667f, 0.06666667f, f10, f10);
                                        Drawable background = view.getBackground();
                                        if (background == null) {
                                            background = f6Var2 instanceof xn ? ((xn) f6Var2).d() : j6.s0();
                                        }
                                        view.setTag(67108867, Integer.valueOf(i11));
                                        if (i11 == 0) {
                                            x9Var.j[i11].translate(f10, -x9Var.u);
                                            view.draw(x9Var.j[i11]);
                                        }
                                        if (background != null && i11 == r02) {
                                            Rect bounds = background.getBounds();
                                            background.setBounds(0, 0, view.getMeasuredWidth(), view.getMeasuredHeight());
                                            background.draw(x9Var.j[i11]);
                                            background.setBounds(bounds);
                                            view.draw(x9Var.j[i11]);
                                        }
                                        view.setTag(67108867, null);
                                        x9Var.j[i11].restore();
                                    }
                                    x9Var.q = i0Var.getMeasuredHeight();
                                    x9Var.r = i0Var.getMeasuredWidth();
                                    x9Var.v.b = i0Var.getMeasuredWidth();
                                    x9Var.v.c = i0Var.getMeasuredHeight();
                                    w9 w9Var = x9Var.v;
                                    if (w9Var.b != 0 && w9Var.c != 0) {
                                        if (x9Var.a == null) {
                                            x9Var.a = new DispatchQueue("blur_thread_" + x9Var);
                                        }
                                        x9Var.a.postRunnable(x9Var.v);
                                        break;
                                    } else {
                                        x9Var.k = false;
                                        break;
                                    }
                                }
                            }
                        }
                    }
                }
                break;
            case 4:
                Paint paint4 = (Paint) this.b;
                ro roVar = (ro) this.c;
                y3 y3Var2 = roVar.e;
                if (y3Var2 != null && y3Var2.getImageReceiver().hasNotThumb()) {
                    paint4.setAlpha((int) (roVar.e.getImageReceiver().getCurrentAlpha() * 85.0f));
                    canvas.drawCircle(getMeasuredWidth() / 2.0f, getMeasuredHeight() / 2.0f, getMeasuredWidth() / 2.0f, paint4);
                    break;
                }
                break;
            case 5:
                Paint paint5 = (Paint) this.b;
                b30 b30Var = (b30) this.c;
                boolean z10 = b30Var.y;
                if (z10) {
                    float f17 = b30Var.B;
                    if (f17 != 1.0f) {
                        float f18 = f17 + 0.064f;
                        b30Var.B = f18;
                        if (f18 > 1.0f) {
                            b30Var.B = 1.0f;
                        }
                        invalidate();
                        paint5.setColor(i0.a.d(b30Var.B, 1711607061, 1714752530));
                        canvas.drawCircle(getMeasuredWidth() / 2.0f, (getMeasuredHeight() / 2.0f) - AndroidUtilities.dp(25.0f), (AndroidUtilities.dp(5.0f) * b30Var.B) + AndroidUtilities.dp(35.0f), paint5);
                        break;
                    }
                }
                if (!z10) {
                    float f19 = b30Var.B;
                    if (f19 != 0.0f) {
                        float f20 = f19 - 0.064f;
                        b30Var.B = f20;
                        if (f20 < 0.0f) {
                            b30Var.B = 0.0f;
                        }
                        invalidate();
                    }
                }
                paint5.setColor(i0.a.d(b30Var.B, 1711607061, 1714752530));
                canvas.drawCircle(getMeasuredWidth() / 2.0f, (getMeasuredHeight() / 2.0f) - AndroidUtilities.dp(25.0f), (AndroidUtilities.dp(5.0f) * b30Var.B) + AndroidUtilities.dp(35.0f), paint5);
            case 6:
                canvas.drawColor(855638016);
                x80 x80Var = (x80) this.c;
                FrameLayout frameLayout = x80Var.n;
                FrameLayout frameLayout2 = (FrameLayout) this.b;
                float[] fArr = x80Var.F;
                x80.a(frameLayout, frameLayout2, fArr);
                canvas.save();
                float y10 = frameLayout.getY() + ((View) frameLayout.getParent()).getY();
                if (y10 < 1.0f) {
                    canvas.clipRect(0.0f, (fArr[1] - y10) + 1.0f, getMeasuredWidth(), getMeasuredHeight());
                }
                canvas.translate(fArr[0], fArr[1]);
                frameLayout.draw(canvas);
                canvas.restore();
                break;
            case 7:
                Paint paint6 = (Paint) this.b;
                ps psVar = (ps) this.c;
                p9 p9Var = psVar.e;
                if (p9Var != null && p9Var.getImageReceiver().hasNotThumb()) {
                    paint6.setAlpha((int) (psVar.e.getImageReceiver().getCurrentAlpha() * 85.0f));
                    canvas.drawCircle(getMeasuredWidth() / 2.0f, getMeasuredHeight() / 2.0f, getMeasuredWidth() / 2.0f, paint6);
                    break;
                }
                break;
            case 8:
                canvas.drawColor(855638016);
                yz yzVar = (yz) this.c;
                FrameLayout frameLayout3 = yzVar.a;
                FrameLayout frameLayout4 = (FrameLayout) this.b;
                float[] fArr2 = yzVar.y;
                tz.a(frameLayout3, frameLayout4, fArr2);
                canvas.save();
                float y11 = frameLayout3.getY() + ((View) frameLayout3.getParent()).getY();
                if (y11 < 1.0f) {
                    canvas.clipRect(0.0f, (fArr2[1] - y11) + 1.0f, getMeasuredWidth(), getMeasuredHeight());
                }
                canvas.translate(fArr2[0], fArr2[1]);
                frameLayout3.draw(canvas);
                canvas.restore();
                break;
            case 9:
                Paint paint7 = (Paint) this.b;
                g70 g70Var = (g70) this.c;
                if (g70Var.d != null && g70Var.n.getVisibility() == 0 && g70Var.d.getImageReceiver().hasNotThumb()) {
                    paint7.setAlpha((int) (g70Var.n.getAlpha() * g70Var.d.getImageReceiver().getCurrentAlpha() * 85.0f));
                    canvas.drawCircle(getMeasuredWidth() / 2.0f, getMeasuredHeight() / 2.0f, getMeasuredWidth() / 2.0f, paint7);
                    break;
                }
                break;
            case 11:
                Paint paint8 = (Paint) this.b;
                bf0 bf0Var = (bf0) this.c;
                nd ndVar = bf0Var.r;
                y3 y3Var3 = bf0Var.e;
                if (y3Var3 != null && ndVar.getVisibility() == 0) {
                    paint8.setAlpha((int) (ndVar.getAlpha() * y3Var3.getImageReceiver().getCurrentAlpha() * 85.0f));
                    canvas.drawCircle(getMeasuredWidth() / 2.0f, getMeasuredHeight() / 2.0f, getMeasuredWidth() / 2.0f, paint8);
                    break;
                }
                break;
            case 12:
                if (((x61) this.c).N0) {
                    canvas.drawColor(j6.v0(j6.G8, (f6) this.b));
                    break;
                } else {
                    dispatchDraw(canvas);
                    break;
                }
            case 13:
                w81 w81Var = (w81) this.c;
                kVar = ((org.telegram.ui.ActionBar.p2) w81Var).actionBar;
                int height = kVar.getHeight();
                Rect rect = AndroidUtilities.rectTmp2;
                rect.set(0, 0, getMeasuredWidth(), height);
                Paint paint9 = (Paint) this.b;
                int i12 = j6.s8;
                f6Var = ((org.telegram.ui.ActionBar.p2) w81Var).resourceProvider;
                paint9.setColor(j6.v0(i12, f6Var));
                w81Var.b.J(canvas, 0.0f, rect, paint9, true);
                if (w81Var.getParentLayout() != null) {
                    ((ActionBarLayout) w81Var.getParentLayout()).q(canvas, height);
                    break;
                }
                break;
            case 14:
                jd1 jd1Var = (jd1) this.c;
                int currentItem = jd1Var.g0.getCurrentItem();
                Paint paint10 = (Paint) this.b;
                int i13 = j6.Ae;
                paint10.setColor(jd1Var.d ? j6.C0(i13) : jd1Var.getThemedColor(i13));
                int i14 = 0;
                while (i14 < 2) {
                    paint10.setAlpha(i14 == currentItem ? 255 : 127);
                    canvas.drawCircle(AndroidUtilities.dp((i14 * 15) + 3), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(3.0f), paint10);
                    i14++;
                }
                break;
            case 15:
                Paint paint11 = (Paint) this.b;
                paint11.setColor(j6.w0(null, j6.d6, false));
                int measuredHeight3 = getMeasuredHeight() - AndroidUtilities.dp(3.0f);
                canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), measuredHeight3, paint11);
                e5Var = ((org.telegram.ui.ActionBar.p2) ((wg1) this.c)).parentLayout;
                ((ActionBarLayout) e5Var).q(canvas, measuredHeight3);
                break;
            case 16:
                Paint paint12 = (Paint) this.b;
                paint12.setStrokeWidth(AndroidUtilities.dpf2(1.66f));
                canvas.drawCircle(getWidth() / 2.0f, getHeight() / 2.0f, AndroidUtilities.dp(10.0f), paint12);
                ng0 ng0Var = (ng0) this.c;
                ng0Var.setBounds(0, 0, AndroidUtilities.dp(10.0f), AndroidUtilities.dp(10.0f));
                canvas.save();
                canvas.translate((getWidth() - AndroidUtilities.dp(10.0f)) / 2.0f, (getHeight() - AndroidUtilities.dp(10.0f)) / 2.0f);
                ng0Var.draw(canvas);
                canvas.restore();
                break;
            case 17:
                Paint paint13 = (Paint) this.b;
                sh.n nVar = (sh.n) this.c;
                p9 p9Var2 = nVar.v;
                if (p9Var2 != null && p9Var2.getImageReceiver().hasNotThumb()) {
                    paint13.setColor(1426063360);
                    paint13.setAlpha((int) (nVar.v.getImageReceiver().getCurrentAlpha() * 85.0f));
                    canvas.drawRoundRect(0.0f, 0.0f, getWidth(), getHeight(), AndroidUtilities.dp(20.0f), AndroidUtilities.dp(20.0f), paint13);
                    break;
                }
                break;
        }
    }

    @Override // android.view.View
    public void onMeasure(int i10, int i11) {
        switch (this.a) {
            case 16:
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(56.0f), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(56.0f), TLObject.FLAG_30));
                break;
            default:
                super.onMeasure(i10, i11);
                break;
        }
    }

    @Override // android.view.View
    public void onSizeChanged(int i10, int i11, int i12, int i13) {
        switch (this.a) {
            case 3:
                super.onSizeChanged(i10, i11, i12, i13);
                x9 x9Var = (x9) this.b;
                i0 i0Var = x9Var.d;
                if (x9Var.g != null && i0Var.getMeasuredHeight() != 0 && i0Var.getMeasuredWidth() != 0) {
                    x9Var.a();
                    x9Var.q = i0Var.getMeasuredHeight();
                    x9Var.r = i0Var.getMeasuredWidth();
                    break;
                }
                break;
            default:
                super.onSizeChanged(i10, i11, i12, i13);
                break;
        }
    }

    @Override // android.view.View
    public void setAlpha(float f10) {
        switch (this.a) {
            case 3:
                super.setAlpha(f10);
                View view = ((zn) this.c).fragmentView;
                if (view != null) {
                    view.invalidate();
                    break;
                }
                break;
            case 4:
            default:
                super.setAlpha(f10);
                break;
            case 5:
                super.setAlpha(f10);
                ((b30) this.c).d.setAlpha(f10);
                break;
        }
    }

    @Override // android.view.View
    public void setScaleX(float f10) {
        switch (this.a) {
            case 5:
                super.setScaleX(f10);
                ((b30) this.c).d.setScaleX(f10);
                break;
            default:
                super.setScaleX(f10);
                break;
        }
    }

    @Override // android.view.View
    public void setScaleY(float f10) {
        switch (this.a) {
            case 5:
                super.setScaleY(f10);
                ((b30) this.c).d.setScaleY(f10);
                break;
            default:
                super.setScaleY(f10);
                break;
        }
    }

    @Override // android.view.View
    public void setTranslationY(float f10) {
        switch (this.a) {
            case 5:
                super.setTranslationY(f10);
                ((b30) this.c).d.setTranslationY(f10);
                break;
            default:
                super.setTranslationY(f10);
                break;
        }
    }

    @Override // android.view.View
    public void setVisibility(int i10) {
        switch (this.a) {
            case 3:
                super.setVisibility(i10);
                View view = ((zn) this.c).fragmentView;
                if (view != null) {
                    view.invalidate();
                    break;
                }
                break;
            default:
                super.setVisibility(i10);
                break;
        }
    }

    @Override // android.view.View
    public boolean verifyDrawable(Drawable drawable) {
        switch (this.a) {
            case 16:
                return drawable == ((ng0) this.c) || super.verifyDrawable(drawable);
            default:
                return super.verifyDrawable(drawable);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i0(Context context, e5 e5Var) {
        super(context);
        this.a = 10;
        this.c = new xd.a(0, this, mr.h, 380L, true);
        this.b = e5Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i0(Activity activity) {
        super(activity);
        this.a = 16;
        Paint paint = new Paint(1);
        this.b = paint;
        ng0 ng0Var = new ng0(10);
        this.c = ng0Var;
        paint.setColor(-1);
        paint.setShadowLayer(1.0f, 0.0f, 0.0f, 419430400);
        paint.setStyle(Paint.Style.STROKE);
        ng0Var.setCallback(this);
        ng0Var.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i0(sh.n nVar, Context context) {
        super(context);
        this.a = 17;
        this.c = nVar;
        this.b = new Paint(1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i0(b30 b30Var, Context context) {
        super(context);
        this.a = 5;
        this.c = b30Var;
        this.b = new Paint(1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i0(w81 w81Var, Context context) {
        super(context);
        this.a = 13;
        this.c = w81Var;
        this.b = new Paint(1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i0(Context context, Paint paint, Drawable drawable) {
        super(context);
        this.a = 0;
        this.b = paint;
        this.c = drawable;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i0(wg1 wg1Var, Context context) {
        super(context);
        this.a = 15;
        this.c = wg1Var;
        this.b = new Paint();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i0(Context context, jd1 jd1Var) {
        super(context);
        this.a = 14;
        this.c = jd1Var;
        this.b = new Paint(1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i0(zn znVar, Context context) {
        super(context);
        this.a = 2;
        this.c = znVar;
        this.b = new RectF();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i0(zn znVar, Context context, View view, f6 f6Var) {
        super(context);
        this.a = 3;
        this.c = znVar;
        x9 x9Var = new x9(view, this, f6Var);
        this.b = x9Var;
        x9Var.p = false;
        x9Var.n = true;
    }

    @Override // xd.b
    public /* synthetic */ void z(float f10, int i10) {
    }
}
