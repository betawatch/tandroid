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
import org.telegram.ui.Components.d30;
import org.telegram.ui.Components.j90;
import org.telegram.ui.Components.qg;
import org.telegram.ui.Components.sg0;
import org.telegram.ui.Components.tr;
import org.telegram.ui.a00;
import org.telegram.ui.bh1;
import org.telegram.ui.c71;
import org.telegram.ui.ff0;
import org.telegram.ui.k70;
import org.telegram.ui.ld;
import org.telegram.ui.nd;
import org.telegram.ui.qs;
import org.telegram.ui.rd1;
import org.telegram.ui.to;
import org.telegram.ui.vz;
import org.telegram.ui.wn;
import org.telegram.ui.yn;

/* compiled from: r8-map-id-90c74b6d1af88fe423a82a48cb36c0781986d7c98a26085f38aeb2edc71128ad */
/* loaded from: classes4.dex */
public final class r6 extends View implements le.d {
    public final /* synthetic */ int a;
    public final Object b;
    public final Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ r6(Object obj, Context context, Object obj2, int i10) {
        super(context);
        this.a = i10;
        this.c = obj;
        this.b = obj2;
    }

    public boolean a() {
        org.telegram.ui.Components.ga gaVar = (org.telegram.ui.Components.ga) this.b;
        if (gaVar.t) {
            return (gaVar.m == 1.0f || !gaVar.p) && gaVar.n && gaVar.d.getAlpha() == 1.0f && getVisibility() == 0;
        }
        return false;
    }

    @Override // le.d
    public void a0(int i10, float f7, float f10, le.e eVar) {
        setVisibility(f7 > 0.0f ? 0 : 8);
        setAlpha(f7);
    }

    @Override // android.view.View
    public void dispatchDraw(Canvas canvas) {
        switch (this.a) {
            case 4:
                RectF rectF = (RectF) this.b;
                rectF.set(0.0f, 0.0f, getWidth(), getHeight());
                int measuredWidth = getMeasuredWidth();
                yn ynVar = (yn) this.c;
                int backgroundSizeY = ynVar.V0.getBackgroundSizeY();
                float x10 = getX();
                float Q8 = ynVar.Q8(this);
                wn wnVar = ynVar.ca;
                if (wnVar != null) {
                    wnVar.m(x10, Q8, measuredWidth, backgroundSizeY);
                } else {
                    org.telegram.ui.ActionBar.i6.q(x10, Q8, measuredWidth, backgroundSizeY);
                }
                canvas.drawRoundRect(rectF, AndroidUtilities.dp(18.0f), AndroidUtilities.dp(18.0f), ynVar.getThemedPaint("paintChatActionBackground"));
                wn wnVar2 = ynVar.ca;
                if (wnVar2 == null ? org.telegram.ui.ActionBar.i6.a1() : wnVar2.r0()) {
                    canvas.drawRoundRect(rectF, AndroidUtilities.dp(18.0f), AndroidUtilities.dp(18.0f), ynVar.getThemedPaint("paintChatActionBackgroundDarken"));
                }
                super.dispatchDraw(canvas);
                break;
            case 12:
                super.dispatchDraw(canvas);
                ((ActionBarLayout) ((org.telegram.ui.ActionBar.c5) this.b)).q(canvas, 0);
                break;
            default:
                super.dispatchDraw(canvas);
                break;
        }
    }

    /* JADX WARN: Type inference failed for: r0v23 */
    /* JADX WARN: Type inference failed for: r0v24, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v36 */
    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        Bitmap[] bitmapArr;
        ?? r02;
        float f7;
        float f10;
        char c10;
        org.telegram.ui.ActionBar.c5 c5Var;
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
                org.telegram.ui.Components.w9 w9Var = pVar.v;
                if (w9Var != null && w9Var.getImageReceiver().hasNotThumb()) {
                    paint2.setColor(1426063360);
                    paint2.setAlpha((int) (pVar.v.getImageReceiver().getCurrentAlpha() * 85.0f));
                    canvas.drawRoundRect(0.0f, 0.0f, getWidth(), getHeight(), AndroidUtilities.dp(20.0f), AndroidUtilities.dp(20.0f), paint2);
                    break;
                }
                break;
            case 2:
                super.onDraw(canvas);
                int paddingLeft = getPaddingLeft();
                float width = ((getWidth() - paddingLeft) - getPaddingRight()) / 7.0f;
                for (int i10 = 0; i10 < 7; i10++) {
                    canvas.drawText(((String[]) this.b)[i10], (width / 2.0f) + (i10 * width) + paddingLeft, ((getMeasuredHeight() - AndroidUtilities.dp(2.0f)) / 2.0f) + AndroidUtilities.dp(5.0f), ((org.telegram.ui.k8) this.c).f);
                }
                break;
            case 3:
                Paint paint3 = (Paint) this.b;
                nd ndVar = (nd) this.c;
                ai.y5 y5Var = ndVar.e;
                if (y5Var != null && y5Var.getImageReceiver().hasNotThumb()) {
                    paint3.setAlpha((int) (ndVar.r.getAlpha() * ndVar.e.getImageReceiver().getCurrentAlpha() * 85.0f));
                    canvas.drawCircle(getMeasuredWidth() / 2.0f, getMeasuredHeight() / 2.0f, getMeasuredWidth() / 2.0f, paint3);
                    break;
                }
                break;
            case 4:
            case 12:
            default:
                super.onDraw(canvas);
                break;
            case 5:
                org.telegram.ui.Components.ga gaVar = (org.telegram.ui.Components.ga) this.b;
                Paint paint4 = gaVar.x;
                org.telegram.ui.ActionBar.d6 d6Var = gaVar.y;
                Paint paint5 = gaVar.w;
                int i11 = gaVar.b;
                View view = gaVar.c;
                r6 r6Var = gaVar.d;
                if (r6Var != null) {
                    if (r6Var.getMeasuredHeight() != 0 || r6Var.getMeasuredWidth() != 0) {
                        if (i11 == 1 && !gaVar.t && !gaVar.p) {
                            gaVar.a();
                            gaVar.l = false;
                        }
                        Bitmap[] bitmapArr2 = gaVar.g;
                        if ((bitmapArr2 != null || gaVar.o) && gaVar.p) {
                            boolean z10 = gaVar.n;
                            if (z10) {
                                float f11 = gaVar.m;
                                if (f11 != 1.0f) {
                                    float f12 = f11 + 0.09f;
                                    gaVar.m = f12;
                                    if (f12 > 1.0f) {
                                        gaVar.m = 1.0f;
                                    }
                                    r6Var.invalidate();
                                }
                            }
                            if (!z10) {
                                float f13 = gaVar.m;
                                if (f13 != 0.0f) {
                                    float f14 = f13 - 0.09f;
                                    gaVar.m = f14;
                                    if (f14 < 0.0f) {
                                        gaVar.m = 0.0f;
                                    }
                                    r6Var.invalidate();
                                }
                            }
                        }
                        float f15 = gaVar.p ? gaVar.m : 1.0f;
                        if (bitmapArr2 == null && gaVar.o) {
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
                                canvas.saveLayerAlpha(0.0f, 0.0f, r6Var.getMeasuredWidth(), r6Var.getMeasuredHeight(), (int) (f15 * 255.0f), 31);
                            }
                            if (bitmapArr != null) {
                                paint5.setAlpha((int) (f15 * f10));
                                if (i11 == r02) {
                                    canvas.translate(f7, gaVar.u);
                                }
                                canvas.save();
                                canvas.scale(r6Var.getMeasuredWidth() / bitmapArr[r02].getWidth(), r6Var.getMeasuredHeight() / bitmapArr[r02].getHeight());
                                canvas.drawBitmap(bitmapArr[r02], f7, f7, paint5);
                                canvas.restore();
                                canvas.save();
                                if (i11 == 0) {
                                    canvas.translate(f7, gaVar.u);
                                }
                                canvas.scale(r6Var.getMeasuredWidth() / bitmapArr[c10].getWidth(), gaVar.s / bitmapArr[c10].getHeight());
                                canvas.drawBitmap(bitmapArr[c10], f7, f7, paint5);
                                canvas.restore();
                                gaVar.t = r02;
                                canvas.drawColor(436207616);
                            }
                            canvas.restore();
                            if (gaVar.n && !gaVar.k) {
                                if (gaVar.g == null || gaVar.l) {
                                    gaVar.k = r02;
                                    gaVar.l = false;
                                    if (gaVar.e == null) {
                                        gaVar.e = new Bitmap[2];
                                        gaVar.j = new Canvas[2];
                                    }
                                    for (int i12 = 0; i12 < 2; i12++) {
                                        if (gaVar.e[i12] != null && r6Var.getMeasuredWidth() == gaVar.r && r6Var.getMeasuredHeight() == gaVar.q) {
                                            gaVar.e[i12].eraseColor(0);
                                        } else {
                                            int measuredHeight = r6Var.getMeasuredHeight();
                                            int measuredWidth = r6Var.getMeasuredWidth();
                                            int dp = AndroidUtilities.dp(200.0f) + AndroidUtilities.statusBarHeight;
                                            gaVar.s = dp;
                                            if (i12 == 0) {
                                                measuredHeight = dp;
                                            }
                                            try {
                                                gaVar.e[i12] = Bitmap.createBitmap((int) (measuredWidth / 15.0f), (int) (measuredHeight / 15.0f), Bitmap.Config.ARGB_8888);
                                                gaVar.j[i12] = new Canvas(gaVar.e[i12]);
                                            } catch (Exception e7) {
                                                FileLog.e(e7);
                                                AndroidUtilities.runOnUIThread(new qg(gaVar, 11));
                                                return;
                                            }
                                        }
                                        if (i12 == r02) {
                                            gaVar.e[i12].eraseColor(org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.d6, d6Var));
                                        }
                                        gaVar.j[i12].save();
                                        gaVar.j[i12].scale(0.06666667f, 0.06666667f, f7, f7);
                                        Drawable background = view.getBackground();
                                        if (background == null) {
                                            background = d6Var instanceof wn ? ((wn) d6Var).d() : org.telegram.ui.ActionBar.i6.s0();
                                        }
                                        view.setTag(67108867, Integer.valueOf(i12));
                                        if (i12 == 0) {
                                            gaVar.j[i12].translate(f7, -gaVar.u);
                                            view.draw(gaVar.j[i12]);
                                        }
                                        if (background != null && i12 == r02) {
                                            Rect bounds = background.getBounds();
                                            background.setBounds(0, 0, view.getMeasuredWidth(), view.getMeasuredHeight());
                                            background.draw(gaVar.j[i12]);
                                            background.setBounds(bounds);
                                            view.draw(gaVar.j[i12]);
                                        }
                                        view.setTag(67108867, null);
                                        gaVar.j[i12].restore();
                                    }
                                    gaVar.q = r6Var.getMeasuredHeight();
                                    gaVar.r = r6Var.getMeasuredWidth();
                                    gaVar.v.b = r6Var.getMeasuredWidth();
                                    gaVar.v.c = r6Var.getMeasuredHeight();
                                    org.telegram.ui.Components.fa faVar = gaVar.v;
                                    if (faVar.b != 0 && faVar.c != 0) {
                                        if (gaVar.a == null) {
                                            gaVar.a = new DispatchQueue("blur_thread_" + gaVar);
                                        }
                                        gaVar.a.postRunnable(gaVar.v);
                                        break;
                                    } else {
                                        gaVar.k = false;
                                        break;
                                    }
                                }
                            }
                        }
                    }
                }
                break;
            case 6:
                Paint paint6 = (Paint) this.b;
                to toVar = (to) this.c;
                ai.y5 y5Var2 = toVar.e;
                if (y5Var2 != null && y5Var2.getImageReceiver().hasNotThumb()) {
                    paint6.setAlpha((int) (toVar.e.getImageReceiver().getCurrentAlpha() * 85.0f));
                    canvas.drawCircle(getMeasuredWidth() / 2.0f, getMeasuredHeight() / 2.0f, getMeasuredWidth() / 2.0f, paint6);
                    break;
                }
                break;
            case 7:
                Paint paint7 = (Paint) this.b;
                d30 d30Var = (d30) this.c;
                boolean z11 = d30Var.y;
                if (z11) {
                    float f16 = d30Var.E;
                    if (f16 != 1.0f) {
                        float f17 = f16 + 0.064f;
                        d30Var.E = f17;
                        if (f17 > 1.0f) {
                            d30Var.E = 1.0f;
                        }
                        invalidate();
                        paint7.setColor(i0.a.d(d30Var.E, 1711607061, 1714752530));
                        canvas.drawCircle(getMeasuredWidth() / 2.0f, (getMeasuredHeight() / 2.0f) - AndroidUtilities.dp(25.0f), (AndroidUtilities.dp(5.0f) * d30Var.E) + AndroidUtilities.dp(35.0f), paint7);
                        break;
                    }
                }
                if (!z11) {
                    float f18 = d30Var.E;
                    if (f18 != 0.0f) {
                        float f19 = f18 - 0.064f;
                        d30Var.E = f19;
                        if (f19 < 0.0f) {
                            d30Var.E = 0.0f;
                        }
                        invalidate();
                    }
                }
                paint7.setColor(i0.a.d(d30Var.E, 1711607061, 1714752530));
                canvas.drawCircle(getMeasuredWidth() / 2.0f, (getMeasuredHeight() / 2.0f) - AndroidUtilities.dp(25.0f), (AndroidUtilities.dp(5.0f) * d30Var.E) + AndroidUtilities.dp(35.0f), paint7);
            case 8:
                canvas.drawColor(855638016);
                j90 j90Var = (j90) this.c;
                FrameLayout frameLayout = j90Var.n;
                FrameLayout frameLayout2 = (FrameLayout) this.b;
                float[] fArr = j90Var.I;
                j90.a(frameLayout, frameLayout2, fArr);
                canvas.save();
                float y3 = frameLayout.getY() + ((View) frameLayout.getParent()).getY();
                if (y3 < 1.0f) {
                    canvas.clipRect(0.0f, (fArr[1] - y3) + 1.0f, getMeasuredWidth(), getMeasuredHeight());
                }
                canvas.translate(fArr[0], fArr[1]);
                frameLayout.draw(canvas);
                canvas.restore();
                break;
            case 9:
                Paint paint8 = (Paint) this.b;
                qs qsVar = (qs) this.c;
                org.telegram.ui.Components.w9 w9Var2 = qsVar.e;
                if (w9Var2 != null && w9Var2.getImageReceiver().hasNotThumb()) {
                    paint8.setAlpha((int) (qsVar.e.getImageReceiver().getCurrentAlpha() * 85.0f));
                    canvas.drawCircle(getMeasuredWidth() / 2.0f, getMeasuredHeight() / 2.0f, getMeasuredWidth() / 2.0f, paint8);
                    break;
                }
                break;
            case 10:
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
            case 11:
                Paint paint9 = (Paint) this.b;
                k70 k70Var = (k70) this.c;
                if (k70Var.d != null && k70Var.n.getVisibility() == 0 && k70Var.d.getImageReceiver().hasNotThumb()) {
                    paint9.setAlpha((int) (k70Var.n.getAlpha() * k70Var.d.getImageReceiver().getCurrentAlpha() * 85.0f));
                    canvas.drawCircle(getMeasuredWidth() / 2.0f, getMeasuredHeight() / 2.0f, getMeasuredWidth() / 2.0f, paint9);
                    break;
                }
                break;
            case 13:
                Paint paint10 = (Paint) this.b;
                ff0 ff0Var = (ff0) this.c;
                ld ldVar = ff0Var.r;
                ai.y5 y5Var3 = ff0Var.e;
                if (y5Var3 != null && ldVar.getVisibility() == 0) {
                    paint10.setAlpha((int) (ldVar.getAlpha() * y5Var3.getImageReceiver().getCurrentAlpha() * 85.0f));
                    canvas.drawCircle(getMeasuredWidth() / 2.0f, getMeasuredHeight() / 2.0f, getMeasuredWidth() / 2.0f, paint10);
                    break;
                }
                break;
            case 14:
                if (((c71) this.c).Q0) {
                    canvas.drawColor(org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.G8, (org.telegram.ui.ActionBar.d6) this.b));
                    break;
                } else {
                    dispatchDraw(canvas);
                    break;
                }
            case 15:
                rd1 rd1Var = (rd1) this.c;
                int currentItem = rd1Var.j0.getCurrentItem();
                Paint paint11 = (Paint) this.b;
                int i13 = org.telegram.ui.ActionBar.i6.Ae;
                paint11.setColor(rd1Var.d ? org.telegram.ui.ActionBar.i6.C0(i13) : rd1Var.getThemedColor(i13));
                int i14 = 0;
                while (i14 < 2) {
                    paint11.setAlpha(i14 == currentItem ? 255 : 127);
                    canvas.drawCircle(AndroidUtilities.dp((i14 * 15) + 3), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(3.0f), paint11);
                    i14++;
                }
                break;
            case 16:
                Paint paint12 = (Paint) this.b;
                paint12.setColor(org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.d6, false));
                int measuredHeight2 = getMeasuredHeight() - AndroidUtilities.dp(3.0f);
                canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), measuredHeight2, paint12);
                c5Var = ((org.telegram.ui.ActionBar.n2) ((bh1) this.c)).parentLayout;
                ((ActionBarLayout) c5Var).q(canvas, measuredHeight2);
                break;
            case 17:
                float measuredWidth2 = getMeasuredWidth() / 2.0f;
                float measuredHeight3 = getMeasuredHeight() / 2.0f;
                canvas.drawCircle(measuredWidth2, measuredHeight3, getMeasuredWidth() / 2.0f, (Paint) this.b);
                rg.b1.d().f(-AndroidUtilities.dp(10.0f), 0.0f, getMeasuredWidth(), getMeasuredHeight());
                canvas.drawCircle(measuredWidth2, measuredHeight3, (getMeasuredWidth() / 2.0f) - AndroidUtilities.dp(2.0f), rg.b1.d().e());
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
            case 5:
                super.onSizeChanged(i10, i11, i12, i13);
                org.telegram.ui.Components.ga gaVar = (org.telegram.ui.Components.ga) this.b;
                r6 r6Var = gaVar.d;
                if (gaVar.g != null && r6Var.getMeasuredHeight() != 0 && r6Var.getMeasuredWidth() != 0) {
                    gaVar.a();
                    gaVar.q = r6Var.getMeasuredHeight();
                    gaVar.r = r6Var.getMeasuredWidth();
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
            case 5:
                super.setAlpha(f7);
                View view = ((yn) this.c).fragmentView;
                if (view != null) {
                    view.invalidate();
                    break;
                }
                break;
            case 6:
            default:
                super.setAlpha(f7);
                break;
            case 7:
                super.setAlpha(f7);
                ((d30) this.c).d.setAlpha(f7);
                break;
        }
    }

    @Override // android.view.View
    public void setScaleX(float f7) {
        switch (this.a) {
            case 7:
                super.setScaleX(f7);
                ((d30) this.c).d.setScaleX(f7);
                break;
            default:
                super.setScaleX(f7);
                break;
        }
    }

    @Override // android.view.View
    public void setScaleY(float f7) {
        switch (this.a) {
            case 7:
                super.setScaleY(f7);
                ((d30) this.c).d.setScaleY(f7);
                break;
            default:
                super.setScaleY(f7);
                break;
        }
    }

    @Override // android.view.View
    public void setTranslationY(float f7) {
        switch (this.a) {
            case 7:
                super.setTranslationY(f7);
                ((d30) this.c).d.setTranslationY(f7);
                break;
            default:
                super.setTranslationY(f7);
                break;
        }
    }

    @Override // android.view.View
    public void setVisibility(int i10) {
        switch (this.a) {
            case 5:
                super.setVisibility(i10);
                View view = ((yn) this.c).fragmentView;
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
    public r6(Context context, org.telegram.ui.ActionBar.c5 c5Var) {
        super(context);
        this.a = 12;
        this.c = new le.b(0, this, tr.h, 380L, true);
        this.b = c5Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r6(Activity activity) {
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
    public r6(fi.p pVar, Context context) {
        super(context);
        this.a = 1;
        this.c = pVar;
        this.b = new Paint(1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r6(d30 d30Var, Context context) {
        super(context);
        this.a = 7;
        this.c = d30Var;
        this.b = new Paint(1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r6(Context context, Paint paint, Drawable drawable) {
        super(context);
        this.a = 17;
        this.b = paint;
        this.c = drawable;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r6(bh1 bh1Var, Context context) {
        super(context);
        this.a = 16;
        this.c = bh1Var;
        this.b = new Paint();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r6(Context context, rd1 rd1Var) {
        super(context);
        this.a = 15;
        this.c = rd1Var;
        this.b = new Paint(1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r6(yn ynVar, Context context) {
        super(context);
        this.a = 4;
        this.c = ynVar;
        this.b = new RectF();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r6(yn ynVar, Context context, View view, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context);
        this.a = 5;
        this.c = ynVar;
        org.telegram.ui.Components.ga gaVar = new org.telegram.ui.Components.ga(view, this, d6Var);
        this.b = gaVar;
        gaVar.p = false;
        gaVar.n = true;
    }

    @Override // le.d
    public /* synthetic */ void V(float f7, int i10) {
    }
}
