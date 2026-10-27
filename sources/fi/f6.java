package fi;

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
import org.telegram.ui.Components.ds;
import org.telegram.ui.Components.eh0;
import org.telegram.ui.Components.k30;
import org.telegram.ui.Components.pg;
import org.telegram.ui.Components.s90;
import org.telegram.ui.f61;
import org.telegram.ui.fg1;
import org.telegram.ui.gz;
import org.telegram.ui.ld;
import org.telegram.ui.ls;
import org.telegram.ui.mz;
import org.telegram.ui.nd;
import org.telegram.ui.oo;
import org.telegram.ui.te0;
import org.telegram.ui.un;
import org.telegram.ui.vc1;
import org.telegram.ui.wn;
import org.telegram.ui.z60;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes4.dex */
public final class f6 extends View implements oe.d {
    public final /* synthetic */ int a;
    public Object b;
    public final Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f6(Object obj, Context context, Object obj2, int i10) {
        super(context);
        this.a = i10;
        this.c = obj;
        this.b = obj2;
    }

    @Override // oe.d
    public void E(int i10, float f7, float f10, oe.e eVar) {
        setVisibility(f7 > 0.0f ? 0 : 8);
        setAlpha(f7);
    }

    public boolean a() {
        org.telegram.ui.Components.ja jaVar = (org.telegram.ui.Components.ja) this.b;
        if (jaVar.t) {
            return (jaVar.m == 1.0f || !jaVar.p) && jaVar.n && jaVar.d.getAlpha() == 1.0f && getVisibility() == 0;
        }
        return false;
    }

    @Override // android.view.View
    public void dispatchDraw(Canvas canvas) {
        switch (this.a) {
            case 4:
                RectF rectF = (RectF) this.b;
                rectF.set(0.0f, 0.0f, getWidth(), getHeight());
                int measuredWidth = getMeasuredWidth();
                wn wnVar = (wn) this.c;
                int backgroundSizeY = wnVar.j1.getBackgroundSizeY();
                float x9 = getX();
                float c92 = wnVar.c9(this);
                un unVar = wnVar.ua;
                if (unVar != null) {
                    unVar.b(x9, c92, measuredWidth, backgroundSizeY);
                } else {
                    org.telegram.ui.ActionBar.y6.q(x9, c92, measuredWidth, backgroundSizeY);
                }
                canvas.drawRoundRect(rectF, AndroidUtilities.dp(18.0f), AndroidUtilities.dp(18.0f), wnVar.getThemedPaint("paintChatActionBackground"));
                un unVar2 = wnVar.ua;
                if (unVar2 == null ? org.telegram.ui.ActionBar.y6.c1() : unVar2.f()) {
                    canvas.drawRoundRect(rectF, AndroidUtilities.dp(18.0f), AndroidUtilities.dp(18.0f), wnVar.getThemedPaint("paintChatActionBackgroundDarken"));
                }
                super.dispatchDraw(canvas);
                break;
            case 12:
                super.dispatchDraw(canvas);
                ((ActionBarLayout) ((org.telegram.ui.ActionBar.j5) this.b)).q(canvas, 0);
                break;
            default:
                super.dispatchDraw(canvas);
                break;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v26 */
    /* JADX WARN: Type inference failed for: r0v27, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v39 */
    /* JADX WARN: Type inference failed for: r16v0 */
    /* JADX WARN: Type inference failed for: r16v1 */
    /* JADX WARN: Type inference failed for: r16v2 */
    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        Bitmap[] bitmapArr;
        boolean z10;
        float f7;
        ?? r02;
        org.telegram.ui.ActionBar.j5 j5Var;
        switch (this.a) {
            case 0:
                Paint paint = (Paint) this.b;
                paint.setStrokeWidth(AndroidUtilities.dpf2(1.66f));
                canvas.drawCircle(getWidth() / 2.0f, getHeight() / 2.0f, AndroidUtilities.dp(10.0f), paint);
                eh0 eh0Var = (eh0) this.c;
                eh0Var.setBounds(0, 0, AndroidUtilities.dp(10.0f), AndroidUtilities.dp(10.0f));
                canvas.save();
                canvas.translate((getWidth() - AndroidUtilities.dp(10.0f)) / 2.0f, (getHeight() - AndroidUtilities.dp(10.0f)) / 2.0f);
                eh0Var.draw(canvas);
                canvas.restore();
                break;
            case 1:
                Paint paint2 = (Paint) this.b;
                ii.o oVar = (ii.o) this.c;
                org.telegram.ui.Components.y9 y9Var = oVar.w;
                if (y9Var != null && y9Var.getImageReceiver().hasNotThumb()) {
                    paint2.setColor(1426063360);
                    paint2.setAlpha((int) (oVar.w.getImageReceiver().getCurrentAlpha() * 85.0f));
                    canvas.drawRoundRect(0.0f, 0.0f, getWidth(), getHeight(), AndroidUtilities.dp(20.0f), AndroidUtilities.dp(20.0f), paint2);
                    break;
                }
                break;
            case 2:
                super.onDraw(canvas);
                int paddingLeft = getPaddingLeft();
                float width = ((getWidth() - paddingLeft) - getPaddingRight()) / 7.0f;
                for (int i10 = 0; i10 < 7; i10++) {
                    canvas.drawText(((String[]) this.b)[i10], (width / 2.0f) + (i10 * width) + paddingLeft, ((getMeasuredHeight() - AndroidUtilities.dp(2.0f)) / 2.0f) + AndroidUtilities.dp(5.0f), ((org.telegram.ui.n8) this.c).f);
                }
                break;
            case 3:
                Paint paint3 = (Paint) this.b;
                nd ndVar = (nd) this.c;
                di.k4 k4Var = ndVar.f;
                if (k4Var != null && k4Var.getImageReceiver().hasNotThumb()) {
                    paint3.setAlpha((int) (ndVar.s.getAlpha() * ndVar.f.getImageReceiver().getCurrentAlpha() * 85.0f));
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
                org.telegram.ui.Components.ja jaVar = (org.telegram.ui.Components.ja) this.b;
                Paint paint4 = jaVar.x;
                org.telegram.ui.ActionBar.u6 u6Var = jaVar.y;
                Paint paint5 = jaVar.w;
                int i11 = jaVar.b;
                View view = jaVar.c;
                f6 f6Var = jaVar.d;
                if (f6Var != null) {
                    if (f6Var.getMeasuredHeight() != 0 || f6Var.getMeasuredWidth() != 0) {
                        if (i11 == 1 && !jaVar.t && !jaVar.p) {
                            jaVar.a();
                            jaVar.l = false;
                        }
                        Bitmap[] bitmapArr2 = jaVar.g;
                        if ((bitmapArr2 != null || jaVar.o) && jaVar.p) {
                            boolean z11 = jaVar.n;
                            if (z11) {
                                float f10 = jaVar.m;
                                if (f10 != 1.0f) {
                                    float f11 = f10 + 0.09f;
                                    jaVar.m = f11;
                                    if (f11 > 1.0f) {
                                        jaVar.m = 1.0f;
                                    }
                                    f6Var.invalidate();
                                }
                            }
                            if (!z11) {
                                float f12 = jaVar.m;
                                if (f12 != 0.0f) {
                                    float f13 = f12 - 0.09f;
                                    jaVar.m = f13;
                                    if (f13 < 0.0f) {
                                        jaVar.m = 0.0f;
                                    }
                                    f6Var.invalidate();
                                }
                            }
                        }
                        float f14 = jaVar.p ? jaVar.m : 1.0f;
                        if (bitmapArr2 == null && jaVar.o) {
                            paint4.setAlpha((int) (50.0f * f14));
                            canvas.drawPaint(paint4);
                            break;
                        } else {
                            if (f14 == 1.0f) {
                                canvas.save();
                                bitmapArr = bitmapArr2;
                                z10 = 0;
                                r02 = 1;
                                f7 = 0.0f;
                            } else {
                                bitmapArr = bitmapArr2;
                                z10 = 0;
                                f7 = 0.0f;
                                r02 = 1;
                                canvas.saveLayerAlpha(0.0f, 0.0f, f6Var.getMeasuredWidth(), f6Var.getMeasuredHeight(), (int) (f14 * 255.0f), 31);
                            }
                            if (bitmapArr != null) {
                                paint5.setAlpha((int) (f14 * 255.0f));
                                if (i11 == r02) {
                                    canvas.translate(f7, jaVar.u);
                                }
                                canvas.save();
                                canvas.scale(f6Var.getMeasuredWidth() / bitmapArr[r02].getWidth(), f6Var.getMeasuredHeight() / bitmapArr[r02].getHeight());
                                canvas.drawBitmap(bitmapArr[r02], f7, f7, paint5);
                                canvas.restore();
                                canvas.save();
                                if (i11 == 0) {
                                    canvas.translate(f7, jaVar.u);
                                }
                                canvas.scale(f6Var.getMeasuredWidth() / bitmapArr[z10].getWidth(), jaVar.s / bitmapArr[z10].getHeight());
                                canvas.drawBitmap(bitmapArr[z10], f7, f7, paint5);
                                canvas.restore();
                                jaVar.t = r02;
                                canvas.drawColor(436207616);
                            }
                            canvas.restore();
                            if (jaVar.n && !jaVar.k) {
                                if (jaVar.g == null || jaVar.l) {
                                    jaVar.k = r02;
                                    jaVar.l = z10;
                                    if (jaVar.e == null) {
                                        jaVar.e = new Bitmap[2];
                                        jaVar.j = new Canvas[2];
                                    }
                                    for (int i12 = 0; i12 < 2; i12++) {
                                        if (jaVar.e[i12] != null && f6Var.getMeasuredWidth() == jaVar.r && f6Var.getMeasuredHeight() == jaVar.q) {
                                            jaVar.e[i12].eraseColor(0);
                                        } else {
                                            int measuredHeight = f6Var.getMeasuredHeight();
                                            int measuredWidth = f6Var.getMeasuredWidth();
                                            int dp = AndroidUtilities.dp(200.0f) + AndroidUtilities.statusBarHeight;
                                            jaVar.s = dp;
                                            if (i12 == 0) {
                                                measuredHeight = dp;
                                            }
                                            try {
                                                jaVar.e[i12] = Bitmap.createBitmap((int) (measuredWidth / 15.0f), (int) (measuredHeight / 15.0f), Bitmap.Config.ARGB_8888);
                                                jaVar.j[i12] = new Canvas(jaVar.e[i12]);
                                            } catch (Exception e) {
                                                FileLog.e(e);
                                                AndroidUtilities.runOnUIThread(new pg(jaVar, 12));
                                                return;
                                            }
                                        }
                                        if (i12 == r02) {
                                            jaVar.e[i12].eraseColor(org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.d6, u6Var));
                                        }
                                        jaVar.j[i12].save();
                                        jaVar.j[i12].scale(0.06666667f, 0.06666667f, f7, f7);
                                        Drawable background = view.getBackground();
                                        if (background == null) {
                                            background = u6Var instanceof un ? ((un) u6Var).l() : org.telegram.ui.ActionBar.y6.t0();
                                        }
                                        view.setTag(67108867, Integer.valueOf(i12));
                                        if (i12 == 0) {
                                            jaVar.j[i12].translate(f7, -jaVar.u);
                                            view.draw(jaVar.j[i12]);
                                        }
                                        if (background != null && i12 == r02) {
                                            Rect bounds = background.getBounds();
                                            background.setBounds(0, 0, view.getMeasuredWidth(), view.getMeasuredHeight());
                                            background.draw(jaVar.j[i12]);
                                            background.setBounds(bounds);
                                            view.draw(jaVar.j[i12]);
                                        }
                                        view.setTag(67108867, null);
                                        jaVar.j[i12].restore();
                                    }
                                    jaVar.q = f6Var.getMeasuredHeight();
                                    jaVar.r = f6Var.getMeasuredWidth();
                                    jaVar.v.b = f6Var.getMeasuredWidth();
                                    jaVar.v.c = f6Var.getMeasuredHeight();
                                    org.telegram.ui.Components.ia iaVar = jaVar.v;
                                    if (iaVar.b != 0 && iaVar.c != 0) {
                                        if (jaVar.a == null) {
                                            jaVar.a = new DispatchQueue("blur_thread_" + jaVar);
                                        }
                                        jaVar.a.postRunnable(jaVar.v);
                                        break;
                                    } else {
                                        jaVar.k = false;
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
                oo ooVar = (oo) this.c;
                di.k4 k4Var2 = ooVar.e;
                if (k4Var2 != null && k4Var2.getImageReceiver().hasNotThumb()) {
                    paint6.setAlpha((int) (ooVar.e.getImageReceiver().getCurrentAlpha() * 85.0f));
                    canvas.drawCircle(getMeasuredWidth() / 2.0f, getMeasuredHeight() / 2.0f, getMeasuredWidth() / 2.0f, paint6);
                    break;
                }
                break;
            case 7:
                Paint paint7 = (Paint) this.b;
                k30 k30Var = (k30) this.c;
                boolean z12 = k30Var.y;
                if (z12) {
                    float f15 = k30Var.E;
                    if (f15 != 1.0f) {
                        float f16 = f15 + 0.064f;
                        k30Var.E = f16;
                        if (f16 > 1.0f) {
                            k30Var.E = 1.0f;
                        }
                        invalidate();
                        paint7.setColor(i0.a.f(k30Var.E, 1711607061, 1714752530));
                        canvas.drawCircle(getMeasuredWidth() / 2.0f, (getMeasuredHeight() / 2.0f) - AndroidUtilities.dp(25.0f), (AndroidUtilities.dp(5.0f) * k30Var.E) + AndroidUtilities.dp(35.0f), paint7);
                        break;
                    }
                }
                if (!z12) {
                    float f17 = k30Var.E;
                    if (f17 != 0.0f) {
                        float f18 = f17 - 0.064f;
                        k30Var.E = f18;
                        if (f18 < 0.0f) {
                            k30Var.E = 0.0f;
                        }
                        invalidate();
                    }
                }
                paint7.setColor(i0.a.f(k30Var.E, 1711607061, 1714752530));
                canvas.drawCircle(getMeasuredWidth() / 2.0f, (getMeasuredHeight() / 2.0f) - AndroidUtilities.dp(25.0f), (AndroidUtilities.dp(5.0f) * k30Var.E) + AndroidUtilities.dp(35.0f), paint7);
            case 8:
                canvas.drawColor(855638016);
                s90 s90Var = (s90) this.c;
                FrameLayout frameLayout = s90Var.n;
                FrameLayout frameLayout2 = (FrameLayout) this.b;
                float[] fArr = s90Var.I;
                s90.a(frameLayout, frameLayout2, fArr);
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
                ls lsVar = (ls) this.c;
                org.telegram.ui.Components.y9 y9Var2 = lsVar.e;
                if (y9Var2 != null && y9Var2.getImageReceiver().hasNotThumb()) {
                    paint8.setAlpha((int) (lsVar.e.getImageReceiver().getCurrentAlpha() * 85.0f));
                    canvas.drawCircle(getMeasuredWidth() / 2.0f, getMeasuredHeight() / 2.0f, getMeasuredWidth() / 2.0f, paint8);
                    break;
                }
                break;
            case 10:
                canvas.drawColor(855638016);
                mz mzVar = (mz) this.c;
                FrameLayout frameLayout3 = mzVar.a;
                FrameLayout frameLayout4 = (FrameLayout) this.b;
                float[] fArr2 = mzVar.y;
                gz.a(frameLayout3, frameLayout4, fArr2);
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
                z60 z60Var = (z60) this.c;
                if (z60Var.d != null && z60Var.n.getVisibility() == 0 && z60Var.d.getImageReceiver().hasNotThumb()) {
                    paint9.setAlpha((int) (z60Var.n.getAlpha() * z60Var.d.getImageReceiver().getCurrentAlpha() * 85.0f));
                    canvas.drawCircle(getMeasuredWidth() / 2.0f, getMeasuredHeight() / 2.0f, getMeasuredWidth() / 2.0f, paint9);
                    break;
                }
                break;
            case 13:
                Paint paint10 = (Paint) this.b;
                te0 te0Var = (te0) this.c;
                ld ldVar = te0Var.r;
                di.k4 k4Var3 = te0Var.e;
                if (k4Var3 != null && ldVar.getVisibility() == 0) {
                    paint10.setAlpha((int) (ldVar.getAlpha() * k4Var3.getImageReceiver().getCurrentAlpha() * 85.0f));
                    canvas.drawCircle(getMeasuredWidth() / 2.0f, getMeasuredHeight() / 2.0f, getMeasuredWidth() / 2.0f, paint10);
                    break;
                }
                break;
            case 14:
                if (((f61) this.c).Q0) {
                    canvas.drawColor(org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.G8, (org.telegram.ui.ActionBar.u6) this.b));
                    break;
                } else {
                    dispatchDraw(canvas);
                    break;
                }
            case 15:
                vc1 vc1Var = (vc1) this.c;
                int currentItem = vc1Var.k0.getCurrentItem();
                Paint paint11 = (Paint) this.b;
                int i13 = org.telegram.ui.ActionBar.y6.Ae;
                paint11.setColor(vc1Var.d ? org.telegram.ui.ActionBar.y6.E0(i13) : vc1Var.getThemedColor(i13));
                int i14 = 0;
                while (i14 < 2) {
                    paint11.setAlpha(i14 == currentItem ? 255 : 127);
                    canvas.drawCircle(AndroidUtilities.dp((i14 * 15) + 3), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(3.0f), paint11);
                    i14++;
                }
                break;
            case 16:
                Paint paint12 = (Paint) this.b;
                paint12.setColor(org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.d6, false));
                int measuredHeight2 = getMeasuredHeight() - AndroidUtilities.dp(3.0f);
                canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), measuredHeight2, paint12);
                j5Var = ((org.telegram.ui.ActionBar.r2) ((fg1) this.c)).parentLayout;
                ((ActionBarLayout) j5Var).q(canvas, measuredHeight2);
                break;
            case 17:
                super.onDraw(canvas);
                int save = canvas.save();
                canvas.scale(getWidth() / 336.0f, getHeight() / 205.0f);
                org.telegram.ui.Wallet.n5 n5Var = ((org.telegram.ui.Wallet.r5) this.c).b;
                if (n5Var != null) {
                    n5Var.e(canvas, (float[]) this.b);
                } else {
                    canvas.drawColor(org.telegram.ui.Wallet.h7.a((float[]) this.b, -16216082));
                }
                canvas.restoreToCount(save);
                break;
            case 18:
                float measuredWidth2 = getMeasuredWidth() / 2.0f;
                float measuredHeight3 = getMeasuredHeight() / 2.0f;
                canvas.drawCircle(measuredWidth2, measuredHeight3, getMeasuredWidth() / 2.0f, (Paint) this.b);
                tg.b1.d().f(-AndroidUtilities.dp(10.0f), 0.0f, getMeasuredWidth(), getMeasuredHeight());
                canvas.drawCircle(measuredWidth2, measuredHeight3, (getMeasuredWidth() / 2.0f) - AndroidUtilities.dp(2.0f), tg.b1.d().e());
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
                org.telegram.ui.Components.ja jaVar = (org.telegram.ui.Components.ja) this.b;
                f6 f6Var = jaVar.d;
                if (jaVar.g != null && f6Var.getMeasuredHeight() != 0 && f6Var.getMeasuredWidth() != 0) {
                    jaVar.a();
                    jaVar.q = f6Var.getMeasuredHeight();
                    jaVar.r = f6Var.getMeasuredWidth();
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
                View view = ((wn) this.c).fragmentView;
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
                ((k30) this.c).d.setAlpha(f7);
                break;
        }
    }

    @Override // android.view.View
    public void setScaleX(float f7) {
        switch (this.a) {
            case 7:
                super.setScaleX(f7);
                ((k30) this.c).d.setScaleX(f7);
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
                ((k30) this.c).d.setScaleY(f7);
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
                ((k30) this.c).d.setTranslationY(f7);
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
                View view = ((wn) this.c).fragmentView;
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
                return drawable == ((eh0) this.c) || super.verifyDrawable(drawable);
            default:
                return super.verifyDrawable(drawable);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f6(Context context, org.telegram.ui.ActionBar.j5 j5Var) {
        super(context);
        this.a = 12;
        this.c = new oe.b(0, this, ds.h, 380L, true);
        this.b = j5Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f6(Activity activity) {
        super(activity);
        this.a = 0;
        Paint paint = new Paint(1);
        this.b = paint;
        eh0 eh0Var = new eh0(10);
        this.c = eh0Var;
        paint.setColor(-1);
        paint.setShadowLayer(1.0f, 0.0f, 0.0f, 419430400);
        paint.setStyle(Paint.Style.STROKE);
        eh0Var.setCallback(this);
        eh0Var.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f6(ii.o oVar, Context context) {
        super(context);
        this.a = 1;
        this.c = oVar;
        this.b = new Paint(1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f6(k30 k30Var, Context context) {
        super(context);
        this.a = 7;
        this.c = k30Var;
        this.b = new Paint(1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f6(Context context, Paint paint, Drawable drawable) {
        super(context);
        this.a = 18;
        this.b = paint;
        this.c = drawable;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f6(org.telegram.ui.Wallet.r5 r5Var, Context context) {
        super(context);
        this.a = 17;
        this.c = r5Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f6(fg1 fg1Var, Context context) {
        super(context);
        this.a = 16;
        this.c = fg1Var;
        this.b = new Paint();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f6(Context context, vc1 vc1Var) {
        super(context);
        this.a = 15;
        this.c = vc1Var;
        this.b = new Paint(1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f6(wn wnVar, Context context) {
        super(context);
        this.a = 4;
        this.c = wnVar;
        this.b = new RectF();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f6(wn wnVar, Context context, View view, org.telegram.ui.ActionBar.u6 u6Var) {
        super(context);
        this.a = 5;
        this.c = wnVar;
        org.telegram.ui.Components.ja jaVar = new org.telegram.ui.Components.ja(view, this, u6Var);
        this.b = jaVar;
        jaVar.p = false;
        jaVar.n = true;
    }

    @Override // oe.d
    public /* synthetic */ void z(float f7, int i10) {
    }
}
