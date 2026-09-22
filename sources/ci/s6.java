package ci;

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
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DispatchQueue;
import org.telegram.messenger.FileLog;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.Components.g90;
import org.telegram.ui.Components.og;
import org.telegram.ui.Components.qr;
import org.telegram.ui.Components.sg0;
import org.telegram.ui.Components.z20;
import org.telegram.ui.a00;
import org.telegram.ui.i91;
import org.telegram.ui.ih1;
import org.telegram.ui.j71;
import org.telegram.ui.jf0;
import org.telegram.ui.l70;
import org.telegram.ui.ss;
import org.telegram.ui.uo;
import org.telegram.ui.vz;
import org.telegram.ui.xd1;
import org.telegram.ui.xn;
import org.telegram.ui.zn;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes4.dex */
public final class s6 extends View implements le.d {
    public final /* synthetic */ int a;
    public final Object b;
    public final Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ s6(Object obj, Context context, Object obj2, int i10) {
        super(context);
        this.a = i10;
        this.c = obj;
        this.b = obj2;
    }

    @Override // le.d
    public void H(int i10, float f7, float f10, le.e eVar) {
        setVisibility(f7 > 0.0f ? 0 : 8);
        setAlpha(f7);
    }

    public boolean a() {
        org.telegram.ui.Components.ea eaVar = (org.telegram.ui.Components.ea) this.b;
        if (eaVar.t) {
            return (eaVar.m == 1.0f || !eaVar.p) && eaVar.n && eaVar.d.getAlpha() == 1.0f && getVisibility() == 0;
        }
        return false;
    }

    public void b(boolean z10, boolean z11) {
        ((le.b) this.c).a(z10, z11);
    }

    @Override // android.view.View
    public void dispatchDraw(Canvas canvas) {
        switch (this.a) {
            case 3:
                RectF rectF = (RectF) this.b;
                rectF.set(0.0f, 0.0f, getWidth(), getHeight());
                int measuredWidth = getMeasuredWidth();
                zn znVar = (zn) this.c;
                int backgroundSizeY = znVar.X0.getBackgroundSizeY();
                float x10 = getX();
                float P8 = znVar.P8(this);
                xn xnVar = znVar.ea;
                if (xnVar != null) {
                    xnVar.m(x10, P8, measuredWidth, backgroundSizeY);
                } else {
                    org.telegram.ui.ActionBar.j6.q(x10, P8, measuredWidth, backgroundSizeY);
                }
                canvas.drawRoundRect(rectF, AndroidUtilities.dp(18.0f), AndroidUtilities.dp(18.0f), znVar.getThemedPaint("paintChatActionBackground"));
                xn xnVar2 = znVar.ea;
                if (xnVar2 == null ? org.telegram.ui.ActionBar.j6.a1() : xnVar2.n0()) {
                    canvas.drawRoundRect(rectF, AndroidUtilities.dp(18.0f), AndroidUtilities.dp(18.0f), znVar.getThemedPaint("paintChatActionBackgroundDarken"));
                }
                super.dispatchDraw(canvas);
                break;
            case 11:
                super.dispatchDraw(canvas);
                ((ActionBarLayout) ((org.telegram.ui.ActionBar.d5) this.b)).q(canvas, 0);
                break;
            default:
                super.dispatchDraw(canvas);
                break;
        }
    }

    /* JADX WARN: Type inference failed for: r0v22 */
    /* JADX WARN: Type inference failed for: r0v23, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v35 */
    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        Bitmap[] bitmapArr;
        ?? r02;
        float f7;
        float f10;
        char c10;
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.ActionBar.f6 f6Var;
        org.telegram.ui.ActionBar.d5 d5Var;
        switch (this.a) {
            case 0:
                Paint paint = (Paint) this.b;
                paint.setStrokeWidth(AndroidUtilities.dpf2(1.66f));
                canvas.drawCircle(getWidth() / 2.0f, getHeight() / 2.0f, AndroidUtilities.dp(10.0f), paint);
                sg0 sg0Var = (sg0) this.c;
                sg0Var.setBounds(0, 0, AndroidUtilities.dp(10.0f), AndroidUtilities.dp(10.0f));
                canvas.save();
                canvas.translate((getWidth() - AndroidUtilities.dp(10.0f)) / 2.0f, (getHeight() - AndroidUtilities.dp(10.0f)) / 2.0f);
                sg0Var.draw(canvas);
                canvas.restore();
                break;
            case 1:
                Paint paint2 = (Paint) this.b;
                fi.p pVar = (fi.p) this.c;
                org.telegram.ui.Components.v9 v9Var = pVar.v;
                if (v9Var != null && v9Var.getImageReceiver().hasNotThumb()) {
                    paint2.setColor(1426063360);
                    paint2.setAlpha((int) (pVar.v.getImageReceiver().getCurrentAlpha() * 85.0f));
                    canvas.drawRoundRect(0.0f, 0.0f, getWidth(), getHeight(), AndroidUtilities.dp(20.0f), AndroidUtilities.dp(20.0f), paint2);
                    break;
                }
                break;
            case 2:
                Paint paint3 = (Paint) this.b;
                org.telegram.ui.md mdVar = (org.telegram.ui.md) this.c;
                ai.z5 z5Var = mdVar.e;
                if (z5Var != null && z5Var.getImageReceiver().hasNotThumb()) {
                    paint3.setAlpha((int) (mdVar.r.getAlpha() * mdVar.e.getImageReceiver().getCurrentAlpha() * 85.0f));
                    canvas.drawCircle(getMeasuredWidth() / 2.0f, getMeasuredHeight() / 2.0f, getMeasuredWidth() / 2.0f, paint3);
                    break;
                }
                break;
            case 3:
            case 11:
            default:
                super.onDraw(canvas);
                break;
            case 4:
                org.telegram.ui.Components.ea eaVar = (org.telegram.ui.Components.ea) this.b;
                Paint paint4 = eaVar.x;
                org.telegram.ui.ActionBar.f6 f6Var2 = eaVar.y;
                Paint paint5 = eaVar.w;
                int i10 = eaVar.b;
                View view = eaVar.c;
                s6 s6Var = eaVar.d;
                if (s6Var != null) {
                    if (s6Var.getMeasuredHeight() != 0 || s6Var.getMeasuredWidth() != 0) {
                        if (i10 == 1 && !eaVar.t && !eaVar.p) {
                            eaVar.a();
                            eaVar.l = false;
                        }
                        Bitmap[] bitmapArr2 = eaVar.g;
                        if ((bitmapArr2 != null || eaVar.o) && eaVar.p) {
                            boolean z10 = eaVar.n;
                            if (z10) {
                                float f11 = eaVar.m;
                                if (f11 != 1.0f) {
                                    float f12 = f11 + 0.09f;
                                    eaVar.m = f12;
                                    if (f12 > 1.0f) {
                                        eaVar.m = 1.0f;
                                    }
                                    s6Var.invalidate();
                                }
                            }
                            if (!z10) {
                                float f13 = eaVar.m;
                                if (f13 != 0.0f) {
                                    float f14 = f13 - 0.09f;
                                    eaVar.m = f14;
                                    if (f14 < 0.0f) {
                                        eaVar.m = 0.0f;
                                    }
                                    s6Var.invalidate();
                                }
                            }
                        }
                        float f15 = eaVar.p ? eaVar.m : 1.0f;
                        if (bitmapArr2 == null && eaVar.o) {
                            paint4.setAlpha((int) (50.0f * f15));
                            canvas.drawPaint(paint4);
                            break;
                        } else {
                            if (f15 == 1.0f) {
                                canvas.save();
                                bitmapArr = bitmapArr2;
                                r02 = 1;
                                f7 = 0.0f;
                                f10 = 255.0f;
                                c10 = 0;
                            } else {
                                bitmapArr = bitmapArr2;
                                r02 = 1;
                                f7 = 0.0f;
                                f10 = 255.0f;
                                c10 = 0;
                                canvas.saveLayerAlpha(0.0f, 0.0f, s6Var.getMeasuredWidth(), s6Var.getMeasuredHeight(), (int) (f15 * 255.0f), 31);
                            }
                            if (bitmapArr != null) {
                                paint5.setAlpha((int) (f15 * f10));
                                if (i10 == r02) {
                                    canvas.translate(f7, eaVar.u);
                                }
                                canvas.save();
                                canvas.scale(s6Var.getMeasuredWidth() / bitmapArr[r02].getWidth(), s6Var.getMeasuredHeight() / bitmapArr[r02].getHeight());
                                canvas.drawBitmap(bitmapArr[r02], f7, f7, paint5);
                                canvas.restore();
                                canvas.save();
                                if (i10 == 0) {
                                    canvas.translate(f7, eaVar.u);
                                }
                                canvas.scale(s6Var.getMeasuredWidth() / bitmapArr[c10].getWidth(), eaVar.s / bitmapArr[c10].getHeight());
                                canvas.drawBitmap(bitmapArr[c10], f7, f7, paint5);
                                canvas.restore();
                                eaVar.t = r02;
                                canvas.drawColor(436207616);
                            }
                            canvas.restore();
                            if (eaVar.n && !eaVar.k) {
                                if (eaVar.g == null || eaVar.l) {
                                    eaVar.k = r02;
                                    eaVar.l = false;
                                    if (eaVar.e == null) {
                                        eaVar.e = new Bitmap[2];
                                        eaVar.j = new Canvas[2];
                                    }
                                    for (int i11 = 0; i11 < 2; i11++) {
                                        if (eaVar.e[i11] != null && s6Var.getMeasuredWidth() == eaVar.r && s6Var.getMeasuredHeight() == eaVar.q) {
                                            eaVar.e[i11].eraseColor(0);
                                        } else {
                                            int measuredHeight = s6Var.getMeasuredHeight();
                                            int measuredWidth = s6Var.getMeasuredWidth();
                                            int dp = AndroidUtilities.dp(200.0f) + AndroidUtilities.statusBarHeight;
                                            eaVar.s = dp;
                                            if (i11 == 0) {
                                                measuredHeight = dp;
                                            }
                                            try {
                                                eaVar.e[i11] = Bitmap.createBitmap((int) (measuredWidth / 15.0f), (int) (measuredHeight / 15.0f), Bitmap.Config.ARGB_8888);
                                                eaVar.j[i11] = new Canvas(eaVar.e[i11]);
                                            } catch (Exception e) {
                                                FileLog.e(e);
                                                AndroidUtilities.runOnUIThread(new og(eaVar, 11));
                                                return;
                                            }
                                        }
                                        if (i11 == r02) {
                                            eaVar.e[i11].eraseColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.d6, f6Var2));
                                        }
                                        eaVar.j[i11].save();
                                        eaVar.j[i11].scale(0.06666667f, 0.06666667f, f7, f7);
                                        Drawable background = view.getBackground();
                                        if (background == null) {
                                            background = f6Var2 instanceof xn ? ((xn) f6Var2).d() : org.telegram.ui.ActionBar.j6.s0();
                                        }
                                        view.setTag(67108867, Integer.valueOf(i11));
                                        if (i11 == 0) {
                                            eaVar.j[i11].translate(f7, -eaVar.u);
                                            view.draw(eaVar.j[i11]);
                                        }
                                        if (background != null && i11 == r02) {
                                            Rect bounds = background.getBounds();
                                            background.setBounds(0, 0, view.getMeasuredWidth(), view.getMeasuredHeight());
                                            background.draw(eaVar.j[i11]);
                                            background.setBounds(bounds);
                                            view.draw(eaVar.j[i11]);
                                        }
                                        view.setTag(67108867, null);
                                        eaVar.j[i11].restore();
                                    }
                                    eaVar.q = s6Var.getMeasuredHeight();
                                    eaVar.r = s6Var.getMeasuredWidth();
                                    eaVar.v.b = s6Var.getMeasuredWidth();
                                    eaVar.v.c = s6Var.getMeasuredHeight();
                                    org.telegram.ui.Components.da daVar = eaVar.v;
                                    if (daVar.b != 0 && daVar.c != 0) {
                                        if (eaVar.a == null) {
                                            eaVar.a = new DispatchQueue("blur_thread_" + eaVar);
                                        }
                                        eaVar.a.postRunnable(eaVar.v);
                                        break;
                                    } else {
                                        eaVar.k = false;
                                        break;
                                    }
                                }
                            }
                        }
                    }
                }
                break;
            case 5:
                Paint paint6 = (Paint) this.b;
                uo uoVar = (uo) this.c;
                ai.z5 z5Var2 = uoVar.e;
                if (z5Var2 != null && z5Var2.getImageReceiver().hasNotThumb()) {
                    paint6.setAlpha((int) (uoVar.e.getImageReceiver().getCurrentAlpha() * 85.0f));
                    canvas.drawCircle(getMeasuredWidth() / 2.0f, getMeasuredHeight() / 2.0f, getMeasuredWidth() / 2.0f, paint6);
                    break;
                }
                break;
            case 6:
                Paint paint7 = (Paint) this.b;
                z20 z20Var = (z20) this.c;
                boolean z11 = z20Var.y;
                if (z11) {
                    float f16 = z20Var.E;
                    if (f16 != 1.0f) {
                        float f17 = f16 + 0.064f;
                        z20Var.E = f17;
                        if (f17 > 1.0f) {
                            z20Var.E = 1.0f;
                        }
                        invalidate();
                        paint7.setColor(i0.a.d(z20Var.E, 1711607061, 1714752530));
                        canvas.drawCircle(getMeasuredWidth() / 2.0f, (getMeasuredHeight() / 2.0f) - AndroidUtilities.dp(25.0f), (AndroidUtilities.dp(5.0f) * z20Var.E) + AndroidUtilities.dp(35.0f), paint7);
                        break;
                    }
                }
                if (!z11) {
                    float f18 = z20Var.E;
                    if (f18 != 0.0f) {
                        float f19 = f18 - 0.064f;
                        z20Var.E = f19;
                        if (f19 < 0.0f) {
                            z20Var.E = 0.0f;
                        }
                        invalidate();
                    }
                }
                paint7.setColor(i0.a.d(z20Var.E, 1711607061, 1714752530));
                canvas.drawCircle(getMeasuredWidth() / 2.0f, (getMeasuredHeight() / 2.0f) - AndroidUtilities.dp(25.0f), (AndroidUtilities.dp(5.0f) * z20Var.E) + AndroidUtilities.dp(35.0f), paint7);
            case 7:
                canvas.drawColor(855638016);
                g90 g90Var = (g90) this.c;
                FrameLayout frameLayout = g90Var.n;
                FrameLayout frameLayout2 = (FrameLayout) this.b;
                float[] fArr = g90Var.I;
                g90.a(frameLayout, frameLayout2, fArr);
                canvas.save();
                float y3 = frameLayout.getY() + ((View) frameLayout.getParent()).getY();
                if (y3 < 1.0f) {
                    canvas.clipRect(0.0f, (fArr[1] - y3) + 1.0f, getMeasuredWidth(), getMeasuredHeight());
                }
                canvas.translate(fArr[0], fArr[1]);
                frameLayout.draw(canvas);
                canvas.restore();
                break;
            case 8:
                Paint paint8 = (Paint) this.b;
                ss ssVar = (ss) this.c;
                org.telegram.ui.Components.v9 v9Var2 = ssVar.e;
                if (v9Var2 != null && v9Var2.getImageReceiver().hasNotThumb()) {
                    paint8.setAlpha((int) (ssVar.e.getImageReceiver().getCurrentAlpha() * 85.0f));
                    canvas.drawCircle(getMeasuredWidth() / 2.0f, getMeasuredHeight() / 2.0f, getMeasuredWidth() / 2.0f, paint8);
                    break;
                }
                break;
            case 9:
                canvas.drawColor(855638016);
                a00 a00Var = (a00) this.c;
                FrameLayout frameLayout3 = a00Var.a;
                FrameLayout frameLayout4 = (FrameLayout) this.b;
                float[] fArr2 = a00Var.y;
                vz.a(frameLayout3, frameLayout4, fArr2);
                canvas.save();
                float y10 = frameLayout3.getY() + ((View) frameLayout3.getParent()).getY();
                if (y10 < 1.0f) {
                    canvas.clipRect(0.0f, (fArr2[1] - y10) + 1.0f, getMeasuredWidth(), getMeasuredHeight());
                }
                canvas.translate(fArr2[0], fArr2[1]);
                frameLayout3.draw(canvas);
                canvas.restore();
                break;
            case 10:
                Paint paint9 = (Paint) this.b;
                l70 l70Var = (l70) this.c;
                if (l70Var.d != null && l70Var.n.getVisibility() == 0 && l70Var.d.getImageReceiver().hasNotThumb()) {
                    paint9.setAlpha((int) (l70Var.n.getAlpha() * l70Var.d.getImageReceiver().getCurrentAlpha() * 85.0f));
                    canvas.drawCircle(getMeasuredWidth() / 2.0f, getMeasuredHeight() / 2.0f, getMeasuredWidth() / 2.0f, paint9);
                    break;
                }
                break;
            case 12:
                Paint paint10 = (Paint) this.b;
                jf0 jf0Var = (jf0) this.c;
                org.telegram.ui.kd kdVar = jf0Var.r;
                ai.z5 z5Var3 = jf0Var.e;
                if (z5Var3 != null && kdVar.getVisibility() == 0) {
                    paint10.setAlpha((int) (kdVar.getAlpha() * z5Var3.getImageReceiver().getCurrentAlpha() * 85.0f));
                    canvas.drawCircle(getMeasuredWidth() / 2.0f, getMeasuredHeight() / 2.0f, getMeasuredWidth() / 2.0f, paint10);
                    break;
                }
                break;
            case 13:
                if (((j71) this.c).Q0) {
                    canvas.drawColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.G8, (org.telegram.ui.ActionBar.f6) this.b));
                    break;
                } else {
                    dispatchDraw(canvas);
                    break;
                }
            case 14:
                i91 i91Var = (i91) this.c;
                kVar = ((org.telegram.ui.ActionBar.n2) i91Var).actionBar;
                int height = kVar.getHeight();
                Rect rect = AndroidUtilities.rectTmp2;
                rect.set(0, 0, getMeasuredWidth(), height);
                Paint paint11 = (Paint) this.b;
                int i12 = org.telegram.ui.ActionBar.j6.s8;
                f6Var = ((org.telegram.ui.ActionBar.n2) i91Var).resourceProvider;
                paint11.setColor(org.telegram.ui.ActionBar.j6.v0(i12, f6Var));
                i91Var.b.J(canvas, 0.0f, rect, paint11, true);
                if (i91Var.getParentLayout() != null) {
                    ((ActionBarLayout) i91Var.getParentLayout()).q(canvas, height);
                    break;
                }
                break;
            case 15:
                xd1 xd1Var = (xd1) this.c;
                int currentItem = xd1Var.j0.getCurrentItem();
                Paint paint12 = (Paint) this.b;
                int i13 = org.telegram.ui.ActionBar.j6.Ae;
                paint12.setColor(xd1Var.d ? org.telegram.ui.ActionBar.j6.C0(i13) : xd1Var.getThemedColor(i13));
                int i14 = 0;
                while (i14 < 2) {
                    paint12.setAlpha(i14 == currentItem ? 255 : 127);
                    canvas.drawCircle(AndroidUtilities.dp((i14 * 15) + 3), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(3.0f), paint12);
                    i14++;
                }
                break;
            case 16:
                Paint paint13 = (Paint) this.b;
                paint13.setColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.d6, false));
                int measuredHeight2 = getMeasuredHeight() - AndroidUtilities.dp(3.0f);
                canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), measuredHeight2, paint13);
                d5Var = ((org.telegram.ui.ActionBar.n2) ((ih1) this.c)).parentLayout;
                ((ActionBarLayout) d5Var).q(canvas, measuredHeight2);
                break;
            case 17:
                float measuredWidth2 = getMeasuredWidth() / 2.0f;
                float measuredHeight3 = getMeasuredHeight() / 2.0f;
                canvas.drawCircle(measuredWidth2, measuredHeight3, getMeasuredWidth() / 2.0f, (Paint) this.b);
                rg.a1.d().f(-AndroidUtilities.dp(10.0f), 0.0f, getMeasuredWidth(), getMeasuredHeight());
                canvas.drawCircle(measuredWidth2, measuredHeight3, (getMeasuredWidth() / 2.0f) - AndroidUtilities.dp(2.0f), rg.a1.d().e());
                float dp2 = AndroidUtilities.dp(18.0f) / 2.0f;
                Drawable drawable = (Drawable) this.c;
                drawable.setBounds((int) (measuredWidth2 - dp2), (int) (measuredHeight3 - dp2), (int) (measuredWidth2 + dp2), (int) (measuredHeight3 + dp2));
                drawable.draw(canvas);
                break;
        }
    }

    @Override // android.view.View
    public void onMeasure(int i10, int i11) {
        switch (this.a) {
            case 0:
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
            case 4:
                super.onSizeChanged(i10, i11, i12, i13);
                org.telegram.ui.Components.ea eaVar = (org.telegram.ui.Components.ea) this.b;
                s6 s6Var = eaVar.d;
                if (eaVar.g != null && s6Var.getMeasuredHeight() != 0 && s6Var.getMeasuredWidth() != 0) {
                    eaVar.a();
                    eaVar.q = s6Var.getMeasuredHeight();
                    eaVar.r = s6Var.getMeasuredWidth();
                    break;
                }
                break;
            default:
                super.onSizeChanged(i10, i11, i12, i13);
                break;
        }
    }

    @Override // android.view.View
    public void setAlpha(float f7) {
        switch (this.a) {
            case 4:
                super.setAlpha(f7);
                View view = ((zn) this.c).fragmentView;
                if (view != null) {
                    view.invalidate();
                    break;
                }
                break;
            case 5:
            default:
                super.setAlpha(f7);
                break;
            case 6:
                super.setAlpha(f7);
                ((z20) this.c).d.setAlpha(f7);
                break;
        }
    }

    @Override // android.view.View
    public void setScaleX(float f7) {
        switch (this.a) {
            case 6:
                super.setScaleX(f7);
                ((z20) this.c).d.setScaleX(f7);
                break;
            default:
                super.setScaleX(f7);
                break;
        }
    }

    @Override // android.view.View
    public void setScaleY(float f7) {
        switch (this.a) {
            case 6:
                super.setScaleY(f7);
                ((z20) this.c).d.setScaleY(f7);
                break;
            default:
                super.setScaleY(f7);
                break;
        }
    }

    @Override // android.view.View
    public void setTranslationY(float f7) {
        switch (this.a) {
            case 6:
                super.setTranslationY(f7);
                ((z20) this.c).d.setTranslationY(f7);
                break;
            default:
                super.setTranslationY(f7);
                break;
        }
    }

    @Override // android.view.View
    public void setVisibility(int i10) {
        switch (this.a) {
            case 4:
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
            case 0:
                return drawable == ((sg0) this.c) || super.verifyDrawable(drawable);
            default:
                return super.verifyDrawable(drawable);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s6(Context context, org.telegram.ui.ActionBar.d5 d5Var) {
        super(context);
        this.a = 11;
        this.c = new le.b(0, this, qr.h, 380L, true);
        this.b = d5Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s6(Activity activity) {
        super(activity);
        this.a = 0;
        Paint paint = new Paint(1);
        this.b = paint;
        sg0 sg0Var = new sg0(10);
        this.c = sg0Var;
        paint.setColor(-1);
        paint.setShadowLayer(1.0f, 0.0f, 0.0f, 419430400);
        paint.setStyle(Paint.Style.STROKE);
        sg0Var.setCallback(this);
        sg0Var.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s6(fi.p pVar, Context context) {
        super(context);
        this.a = 1;
        this.c = pVar;
        this.b = new Paint(1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s6(z20 z20Var, Context context) {
        super(context);
        this.a = 6;
        this.c = z20Var;
        this.b = new Paint(1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s6(i91 i91Var, Context context) {
        super(context);
        this.a = 14;
        this.c = i91Var;
        this.b = new Paint(1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s6(Context context, Paint paint, Drawable drawable) {
        super(context);
        this.a = 17;
        this.b = paint;
        this.c = drawable;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s6(ih1 ih1Var, Context context) {
        super(context);
        this.a = 16;
        this.c = ih1Var;
        this.b = new Paint();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s6(Context context, xd1 xd1Var) {
        super(context);
        this.a = 15;
        this.c = xd1Var;
        this.b = new Paint(1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s6(zn znVar, Context context) {
        super(context);
        this.a = 3;
        this.c = znVar;
        this.b = new RectF();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s6(zn znVar, Context context, View view, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context);
        this.a = 4;
        this.c = znVar;
        org.telegram.ui.Components.ea eaVar = new org.telegram.ui.Components.ea(view, this, f6Var);
        this.b = eaVar;
        eaVar.p = false;
        eaVar.n = true;
    }

    @Override // le.d
    public /* synthetic */ void C(float f7, int i10) {
    }
}
