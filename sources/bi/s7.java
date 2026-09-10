package bi;

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
import org.telegram.ui.Components.f90;
import org.telegram.ui.Components.j30;
import org.telegram.ui.Components.pg0;
import org.telegram.ui.Components.rg;
import org.telegram.ui.Components.wr;
import org.telegram.ui.ae1;
import org.telegram.ui.bo;
import org.telegram.ui.c00;
import org.telegram.ui.eo;
import org.telegram.ui.hf0;
import org.telegram.ui.k70;
import org.telegram.ui.k91;
import org.telegram.ui.l71;
import org.telegram.ui.mh1;
import org.telegram.ui.ts;
import org.telegram.ui.xz;
import org.telegram.ui.yo;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes4.dex */
public final class s7 extends View implements le.d {
    public final /* synthetic */ int a;
    public final Object b;
    public final Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ s7(Object obj, Context context, Object obj2, int i10) {
        super(context);
        this.a = i10;
        this.c = obj;
        this.b = obj2;
    }

    @Override // le.d
    public void G(int i10, float f7, float f10, le.e eVar) {
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
                eo eoVar = (eo) this.c;
                int backgroundSizeY = eoVar.X0.getBackgroundSizeY();
                float x10 = getX();
                float P8 = eoVar.P8(this);
                bo boVar = eoVar.ea;
                if (boVar != null) {
                    boVar.l(x10, P8, measuredWidth, backgroundSizeY);
                } else {
                    org.telegram.ui.ActionBar.j6.q(x10, P8, measuredWidth, backgroundSizeY);
                }
                canvas.drawRoundRect(rectF, AndroidUtilities.dp(18.0f), AndroidUtilities.dp(18.0f), eoVar.getThemedPaint("paintChatActionBackground"));
                bo boVar2 = eoVar.ea;
                if (boVar2 == null ? org.telegram.ui.ActionBar.j6.a1() : boVar2.m0()) {
                    canvas.drawRoundRect(rectF, AndroidUtilities.dp(18.0f), AndroidUtilities.dp(18.0f), eoVar.getThemedPaint("paintChatActionBackgroundDarken"));
                }
                super.dispatchDraw(canvas);
                break;
            case 11:
                super.dispatchDraw(canvas);
                ((ActionBarLayout) ((org.telegram.ui.ActionBar.f5) this.b)).q(canvas, 0);
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
        org.telegram.ui.ActionBar.l lVar;
        org.telegram.ui.ActionBar.f6 f6Var;
        org.telegram.ui.ActionBar.f5 f5Var;
        switch (this.a) {
            case 0:
                Paint paint = (Paint) this.b;
                paint.setStrokeWidth(AndroidUtilities.dpf2(1.66f));
                canvas.drawCircle(getWidth() / 2.0f, getHeight() / 2.0f, AndroidUtilities.dp(10.0f), paint);
                pg0 pg0Var = (pg0) this.c;
                pg0Var.setBounds(0, 0, AndroidUtilities.dp(10.0f), AndroidUtilities.dp(10.0f));
                canvas.save();
                canvas.translate((getWidth() - AndroidUtilities.dp(10.0f)) / 2.0f, (getHeight() - AndroidUtilities.dp(10.0f)) / 2.0f);
                pg0Var.draw(canvas);
                canvas.restore();
                break;
            case 1:
                Paint paint2 = (Paint) this.b;
                ei.p pVar = (ei.p) this.c;
                org.telegram.ui.Components.w9 w9Var = pVar.v;
                if (w9Var != null && w9Var.getImageReceiver().hasNotThumb()) {
                    paint2.setColor(1426063360);
                    paint2.setAlpha((int) (pVar.v.getImageReceiver().getCurrentAlpha() * 85.0f));
                    canvas.drawRoundRect(0.0f, 0.0f, getWidth(), getHeight(), AndroidUtilities.dp(20.0f), AndroidUtilities.dp(20.0f), paint2);
                    break;
                }
                break;
            case 2:
                Paint paint3 = (Paint) this.b;
                org.telegram.ui.nd ndVar = (org.telegram.ui.nd) this.c;
                gg.i1 i1Var = ndVar.e;
                if (i1Var != null && i1Var.getImageReceiver().hasNotThumb()) {
                    paint3.setAlpha((int) (ndVar.r.getAlpha() * ndVar.e.getImageReceiver().getCurrentAlpha() * 85.0f));
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
                s7 s7Var = eaVar.d;
                if (s7Var != null) {
                    if (s7Var.getMeasuredHeight() != 0 || s7Var.getMeasuredWidth() != 0) {
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
                                    s7Var.invalidate();
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
                                    s7Var.invalidate();
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
                                canvas.saveLayerAlpha(0.0f, 0.0f, s7Var.getMeasuredWidth(), s7Var.getMeasuredHeight(), (int) (f15 * 255.0f), 31);
                            }
                            if (bitmapArr != null) {
                                paint5.setAlpha((int) (f15 * f10));
                                if (i10 == r02) {
                                    canvas.translate(f7, eaVar.u);
                                }
                                canvas.save();
                                canvas.scale(s7Var.getMeasuredWidth() / bitmapArr[r02].getWidth(), s7Var.getMeasuredHeight() / bitmapArr[r02].getHeight());
                                canvas.drawBitmap(bitmapArr[r02], f7, f7, paint5);
                                canvas.restore();
                                canvas.save();
                                if (i10 == 0) {
                                    canvas.translate(f7, eaVar.u);
                                }
                                canvas.scale(s7Var.getMeasuredWidth() / bitmapArr[c10].getWidth(), eaVar.s / bitmapArr[c10].getHeight());
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
                                        if (eaVar.e[i11] != null && s7Var.getMeasuredWidth() == eaVar.r && s7Var.getMeasuredHeight() == eaVar.q) {
                                            eaVar.e[i11].eraseColor(0);
                                        } else {
                                            int measuredHeight = s7Var.getMeasuredHeight();
                                            int measuredWidth = s7Var.getMeasuredWidth();
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
                                                AndroidUtilities.runOnUIThread(new rg(eaVar, 11));
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
                                            background = f6Var2 instanceof bo ? ((bo) f6Var2).d() : org.telegram.ui.ActionBar.j6.s0();
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
                                    eaVar.q = s7Var.getMeasuredHeight();
                                    eaVar.r = s7Var.getMeasuredWidth();
                                    eaVar.v.b = s7Var.getMeasuredWidth();
                                    eaVar.v.c = s7Var.getMeasuredHeight();
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
                yo yoVar = (yo) this.c;
                gg.i1 i1Var2 = yoVar.e;
                if (i1Var2 != null && i1Var2.getImageReceiver().hasNotThumb()) {
                    paint6.setAlpha((int) (yoVar.e.getImageReceiver().getCurrentAlpha() * 85.0f));
                    canvas.drawCircle(getMeasuredWidth() / 2.0f, getMeasuredHeight() / 2.0f, getMeasuredWidth() / 2.0f, paint6);
                    break;
                }
                break;
            case 6:
                Paint paint7 = (Paint) this.b;
                j30 j30Var = (j30) this.c;
                boolean z11 = j30Var.y;
                if (z11) {
                    float f16 = j30Var.E;
                    if (f16 != 1.0f) {
                        float f17 = f16 + 0.064f;
                        j30Var.E = f17;
                        if (f17 > 1.0f) {
                            j30Var.E = 1.0f;
                        }
                        invalidate();
                        paint7.setColor(i0.a.d(j30Var.E, 1711607061, 1714752530));
                        canvas.drawCircle(getMeasuredWidth() / 2.0f, (getMeasuredHeight() / 2.0f) - AndroidUtilities.dp(25.0f), (AndroidUtilities.dp(5.0f) * j30Var.E) + AndroidUtilities.dp(35.0f), paint7);
                        break;
                    }
                }
                if (!z11) {
                    float f18 = j30Var.E;
                    if (f18 != 0.0f) {
                        float f19 = f18 - 0.064f;
                        j30Var.E = f19;
                        if (f19 < 0.0f) {
                            j30Var.E = 0.0f;
                        }
                        invalidate();
                    }
                }
                paint7.setColor(i0.a.d(j30Var.E, 1711607061, 1714752530));
                canvas.drawCircle(getMeasuredWidth() / 2.0f, (getMeasuredHeight() / 2.0f) - AndroidUtilities.dp(25.0f), (AndroidUtilities.dp(5.0f) * j30Var.E) + AndroidUtilities.dp(35.0f), paint7);
            case 7:
                canvas.drawColor(855638016);
                f90 f90Var = (f90) this.c;
                FrameLayout frameLayout = f90Var.n;
                FrameLayout frameLayout2 = (FrameLayout) this.b;
                float[] fArr = f90Var.I;
                f90.a(frameLayout, frameLayout2, fArr);
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
                ts tsVar = (ts) this.c;
                org.telegram.ui.Components.w9 w9Var2 = tsVar.e;
                if (w9Var2 != null && w9Var2.getImageReceiver().hasNotThumb()) {
                    paint8.setAlpha((int) (tsVar.e.getImageReceiver().getCurrentAlpha() * 85.0f));
                    canvas.drawCircle(getMeasuredWidth() / 2.0f, getMeasuredHeight() / 2.0f, getMeasuredWidth() / 2.0f, paint8);
                    break;
                }
                break;
            case 9:
                canvas.drawColor(855638016);
                c00 c00Var = (c00) this.c;
                FrameLayout frameLayout3 = c00Var.a;
                FrameLayout frameLayout4 = (FrameLayout) this.b;
                float[] fArr2 = c00Var.y;
                xz.a(frameLayout3, frameLayout4, fArr2);
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
                k70 k70Var = (k70) this.c;
                if (k70Var.d != null && k70Var.n.getVisibility() == 0 && k70Var.d.getImageReceiver().hasNotThumb()) {
                    paint9.setAlpha((int) (k70Var.n.getAlpha() * k70Var.d.getImageReceiver().getCurrentAlpha() * 85.0f));
                    canvas.drawCircle(getMeasuredWidth() / 2.0f, getMeasuredHeight() / 2.0f, getMeasuredWidth() / 2.0f, paint9);
                    break;
                }
                break;
            case 12:
                Paint paint10 = (Paint) this.b;
                hf0 hf0Var = (hf0) this.c;
                org.telegram.ui.ld ldVar = hf0Var.r;
                gg.i1 i1Var3 = hf0Var.e;
                if (i1Var3 != null && ldVar.getVisibility() == 0) {
                    paint10.setAlpha((int) (ldVar.getAlpha() * i1Var3.getImageReceiver().getCurrentAlpha() * 85.0f));
                    canvas.drawCircle(getMeasuredWidth() / 2.0f, getMeasuredHeight() / 2.0f, getMeasuredWidth() / 2.0f, paint10);
                    break;
                }
                break;
            case 13:
                if (((l71) this.c).Q0) {
                    canvas.drawColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.G8, (org.telegram.ui.ActionBar.f6) this.b));
                    break;
                } else {
                    dispatchDraw(canvas);
                    break;
                }
            case 14:
                k91 k91Var = (k91) this.c;
                lVar = ((org.telegram.ui.ActionBar.p2) k91Var).actionBar;
                int height = lVar.getHeight();
                Rect rect = AndroidUtilities.rectTmp2;
                rect.set(0, 0, getMeasuredWidth(), height);
                Paint paint11 = (Paint) this.b;
                int i12 = org.telegram.ui.ActionBar.j6.s8;
                f6Var = ((org.telegram.ui.ActionBar.p2) k91Var).resourceProvider;
                paint11.setColor(org.telegram.ui.ActionBar.j6.v0(i12, f6Var));
                k91Var.b.J(canvas, 0.0f, rect, paint11, true);
                if (k91Var.getParentLayout() != null) {
                    ((ActionBarLayout) k91Var.getParentLayout()).q(canvas, height);
                    break;
                }
                break;
            case 15:
                ae1 ae1Var = (ae1) this.c;
                int currentItem = ae1Var.j0.getCurrentItem();
                Paint paint12 = (Paint) this.b;
                int i13 = org.telegram.ui.ActionBar.j6.Ae;
                paint12.setColor(ae1Var.d ? org.telegram.ui.ActionBar.j6.C0(i13) : ae1Var.getThemedColor(i13));
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
                f5Var = ((org.telegram.ui.ActionBar.p2) ((mh1) this.c)).parentLayout;
                ((ActionBarLayout) f5Var).q(canvas, measuredHeight2);
                break;
            case 17:
                float measuredWidth2 = getMeasuredWidth() / 2.0f;
                float measuredHeight3 = getMeasuredHeight() / 2.0f;
                canvas.drawCircle(measuredWidth2, measuredHeight3, getMeasuredWidth() / 2.0f, (Paint) this.b);
                qg.d1.d().f(-AndroidUtilities.dp(10.0f), 0.0f, getMeasuredWidth(), getMeasuredHeight());
                canvas.drawCircle(measuredWidth2, measuredHeight3, (getMeasuredWidth() / 2.0f) - AndroidUtilities.dp(2.0f), qg.d1.d().e());
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
                s7 s7Var = eaVar.d;
                if (eaVar.g != null && s7Var.getMeasuredHeight() != 0 && s7Var.getMeasuredWidth() != 0) {
                    eaVar.a();
                    eaVar.q = s7Var.getMeasuredHeight();
                    eaVar.r = s7Var.getMeasuredWidth();
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
                View view = ((eo) this.c).fragmentView;
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
                ((j30) this.c).d.setAlpha(f7);
                break;
        }
    }

    @Override // android.view.View
    public void setScaleX(float f7) {
        switch (this.a) {
            case 6:
                super.setScaleX(f7);
                ((j30) this.c).d.setScaleX(f7);
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
                ((j30) this.c).d.setScaleY(f7);
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
                ((j30) this.c).d.setTranslationY(f7);
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
                View view = ((eo) this.c).fragmentView;
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
                return drawable == ((pg0) this.c) || super.verifyDrawable(drawable);
            default:
                return super.verifyDrawable(drawable);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s7(Context context, org.telegram.ui.ActionBar.f5 f5Var) {
        super(context);
        this.a = 11;
        this.c = new le.b(0, this, wr.h, 380L, true);
        this.b = f5Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s7(Activity activity) {
        super(activity);
        this.a = 0;
        Paint paint = new Paint(1);
        this.b = paint;
        pg0 pg0Var = new pg0(10);
        this.c = pg0Var;
        paint.setColor(-1);
        paint.setShadowLayer(1.0f, 0.0f, 0.0f, 419430400);
        paint.setStyle(Paint.Style.STROKE);
        pg0Var.setCallback(this);
        pg0Var.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s7(ei.p pVar, Context context) {
        super(context);
        this.a = 1;
        this.c = pVar;
        this.b = new Paint(1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s7(j30 j30Var, Context context) {
        super(context);
        this.a = 6;
        this.c = j30Var;
        this.b = new Paint(1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s7(k91 k91Var, Context context) {
        super(context);
        this.a = 14;
        this.c = k91Var;
        this.b = new Paint(1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s7(Context context, Paint paint, Drawable drawable) {
        super(context);
        this.a = 17;
        this.b = paint;
        this.c = drawable;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s7(mh1 mh1Var, Context context) {
        super(context);
        this.a = 16;
        this.c = mh1Var;
        this.b = new Paint();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s7(Context context, ae1 ae1Var) {
        super(context);
        this.a = 15;
        this.c = ae1Var;
        this.b = new Paint(1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s7(eo eoVar, Context context) {
        super(context);
        this.a = 3;
        this.c = eoVar;
        this.b = new RectF();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s7(eo eoVar, Context context, View view, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context);
        this.a = 4;
        this.c = eoVar;
        org.telegram.ui.Components.ea eaVar = new org.telegram.ui.Components.ea(view, this, f6Var);
        this.b = eaVar;
        eaVar.p = false;
        eaVar.n = true;
    }

    @Override // le.d
    public /* synthetic */ void B(float f7, int i10) {
    }
}
