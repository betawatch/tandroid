package cg;

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
import lh.y3;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DispatchQueue;
import org.telegram.messenger.FileLog;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.b5;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Components.ba;
import org.telegram.ui.Components.ca;
import org.telegram.ui.Components.cg0;
import org.telegram.ui.Components.ig;
import org.telegram.ui.Components.jr;
import org.telegram.ui.Components.r80;
import org.telegram.ui.Components.t9;
import org.telegram.ui.Components.w20;
import org.telegram.ui.b81;
import org.telegram.ui.cg1;
import org.telegram.ui.d61;
import org.telegram.ui.fd;
import org.telegram.ui.gz;
import org.telegram.ui.hd;
import org.telegram.ui.hs;
import org.telegram.ui.ko;
import org.telegram.ui.lz;
import org.telegram.ui.pe0;
import org.telegram.ui.qc1;
import org.telegram.ui.rn;
import org.telegram.ui.t60;
import org.telegram.ui.tn;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class i0 extends View implements vd.b {
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

    @Override // vd.b
    public void N(int i10, float f9, float f10, vd.c cVar) {
        setVisibility(f9 > 0.0f ? 0 : 8);
        setAlpha(f9);
    }

    public boolean a() {
        ca caVar = (ca) this.b;
        if (caVar.t) {
            return (caVar.m == 1.0f || !caVar.p) && caVar.n && caVar.d.getAlpha() == 1.0f && getVisibility() == 0;
        }
        return false;
    }

    public void b(boolean z10, boolean z11) {
        ((vd.a) this.c).a(z10, z11);
    }

    @Override // android.view.View
    public void dispatchDraw(Canvas canvas) {
        switch (this.a) {
            case 3:
                RectF rectF = (RectF) this.b;
                rectF.set(0.0f, 0.0f, getWidth(), getHeight());
                int measuredWidth = getMeasuredWidth();
                tn tnVar = (tn) this.c;
                int backgroundSizeY = tnVar.T0.getBackgroundSizeY();
                float x4 = getX();
                float P8 = tnVar.P8(this);
                rn rnVar = tnVar.aa;
                if (rnVar != null) {
                    rnVar.l(x4, P8, measuredWidth, backgroundSizeY);
                } else {
                    g6.q(x4, P8, measuredWidth, backgroundSizeY);
                }
                canvas.drawRoundRect(rectF, AndroidUtilities.dp(18.0f), AndroidUtilities.dp(18.0f), tnVar.getThemedPaint("paintChatActionBackground"));
                rn rnVar2 = tnVar.aa;
                if (rnVar2 == null ? g6.a1() : rnVar2.l0()) {
                    canvas.drawRoundRect(rectF, AndroidUtilities.dp(18.0f), AndroidUtilities.dp(18.0f), tnVar.getThemedPaint("paintChatActionBackgroundDarken"));
                }
                super.dispatchDraw(canvas);
                break;
            case 11:
                super.dispatchDraw(canvas);
                ((ActionBarLayout) ((b5) this.b)).q(canvas, 0);
                break;
            default:
                super.dispatchDraw(canvas);
                break;
        }
    }

    /* JADX WARN: Type inference failed for: r0v15 */
    /* JADX WARN: Type inference failed for: r0v16, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v28 */
    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        Bitmap[] bitmapArr;
        ?? r02;
        float f9;
        float f10;
        char c3;
        org.telegram.ui.ActionBar.l lVar;
        c6 c6Var;
        b5 b5Var;
        switch (this.a) {
            case 0:
                float measuredWidth = getMeasuredWidth() / 2.0f;
                float measuredHeight = getMeasuredHeight() / 2.0f;
                canvas.drawCircle(measuredWidth, measuredHeight, getMeasuredWidth() / 2.0f, (Paint) this.b);
                s1.d().f(-AndroidUtilities.dp(10.0f), 0.0f, getMeasuredWidth(), getMeasuredHeight());
                canvas.drawCircle(measuredWidth, measuredHeight, (getMeasuredWidth() / 2.0f) - AndroidUtilities.dp(2.0f), s1.d().e());
                float dp = AndroidUtilities.dp(18.0f) / 2.0f;
                Drawable drawable = (Drawable) this.c;
                drawable.setBounds((int) (measuredWidth - dp), (int) (measuredHeight - dp), (int) (measuredWidth + dp), (int) (measuredHeight + dp));
                drawable.draw(canvas);
                break;
            case 1:
                Paint paint = (Paint) this.b;
                paint.setStrokeWidth(AndroidUtilities.dpf2(1.66f));
                canvas.drawCircle(getWidth() / 2.0f, getHeight() / 2.0f, AndroidUtilities.dp(10.0f), paint);
                cg0 cg0Var = (cg0) this.c;
                cg0Var.setBounds(0, 0, AndroidUtilities.dp(10.0f), AndroidUtilities.dp(10.0f));
                canvas.save();
                canvas.translate((getWidth() - AndroidUtilities.dp(10.0f)) / 2.0f, (getHeight() - AndroidUtilities.dp(10.0f)) / 2.0f);
                cg0Var.draw(canvas);
                canvas.restore();
                break;
            case 2:
                Paint paint2 = (Paint) this.b;
                hd hdVar = (hd) this.c;
                y3 y3Var = hdVar.e;
                if (y3Var != null && y3Var.getImageReceiver().hasNotThumb()) {
                    paint2.setAlpha((int) (hdVar.r.getAlpha() * hdVar.e.getImageReceiver().getCurrentAlpha() * 85.0f));
                    canvas.drawCircle(getMeasuredWidth() / 2.0f, getMeasuredHeight() / 2.0f, getMeasuredWidth() / 2.0f, paint2);
                    break;
                }
                break;
            case 3:
            case 11:
            default:
                super.onDraw(canvas);
                break;
            case 4:
                ca caVar = (ca) this.b;
                Paint paint3 = caVar.x;
                c6 c6Var2 = caVar.y;
                Paint paint4 = caVar.w;
                int i10 = caVar.b;
                View view = caVar.c;
                i0 i0Var = caVar.d;
                if (i0Var != null) {
                    if (i0Var.getMeasuredHeight() != 0 || i0Var.getMeasuredWidth() != 0) {
                        if (i10 == 1 && !caVar.t && !caVar.p) {
                            caVar.a();
                            caVar.l = false;
                        }
                        Bitmap[] bitmapArr2 = caVar.g;
                        if ((bitmapArr2 != null || caVar.o) && caVar.p) {
                            boolean z10 = caVar.n;
                            if (z10) {
                                float f11 = caVar.m;
                                if (f11 != 1.0f) {
                                    float f12 = f11 + 0.09f;
                                    caVar.m = f12;
                                    if (f12 > 1.0f) {
                                        caVar.m = 1.0f;
                                    }
                                    i0Var.invalidate();
                                }
                            }
                            if (!z10) {
                                float f13 = caVar.m;
                                if (f13 != 0.0f) {
                                    float f14 = f13 - 0.09f;
                                    caVar.m = f14;
                                    if (f14 < 0.0f) {
                                        caVar.m = 0.0f;
                                    }
                                    i0Var.invalidate();
                                }
                            }
                        }
                        float f15 = caVar.p ? caVar.m : 1.0f;
                        if (bitmapArr2 == null && caVar.o) {
                            paint3.setAlpha((int) (50.0f * f15));
                            canvas.drawPaint(paint3);
                            break;
                        } else {
                            if (f15 == 1.0f) {
                                canvas.save();
                                bitmapArr = bitmapArr2;
                                r02 = 1;
                                f9 = 0.0f;
                                f10 = 255.0f;
                                c3 = 0;
                            } else {
                                bitmapArr = bitmapArr2;
                                r02 = 1;
                                f9 = 0.0f;
                                f10 = 255.0f;
                                c3 = 0;
                                canvas.saveLayerAlpha(0.0f, 0.0f, i0Var.getMeasuredWidth(), i0Var.getMeasuredHeight(), (int) (f15 * 255.0f), 31);
                            }
                            if (bitmapArr != null) {
                                paint4.setAlpha((int) (f15 * f10));
                                if (i10 == r02) {
                                    canvas.translate(f9, caVar.u);
                                }
                                canvas.save();
                                canvas.scale(i0Var.getMeasuredWidth() / bitmapArr[r02].getWidth(), i0Var.getMeasuredHeight() / bitmapArr[r02].getHeight());
                                canvas.drawBitmap(bitmapArr[r02], f9, f9, paint4);
                                canvas.restore();
                                canvas.save();
                                if (i10 == 0) {
                                    canvas.translate(f9, caVar.u);
                                }
                                canvas.scale(i0Var.getMeasuredWidth() / bitmapArr[c3].getWidth(), caVar.s / bitmapArr[c3].getHeight());
                                canvas.drawBitmap(bitmapArr[c3], f9, f9, paint4);
                                canvas.restore();
                                caVar.t = r02;
                                canvas.drawColor(436207616);
                            }
                            canvas.restore();
                            if (caVar.n && !caVar.k) {
                                if (caVar.g == null || caVar.l) {
                                    caVar.k = r02;
                                    caVar.l = false;
                                    if (caVar.e == null) {
                                        caVar.e = new Bitmap[2];
                                        caVar.j = new Canvas[2];
                                    }
                                    for (int i11 = 0; i11 < 2; i11++) {
                                        if (caVar.e[i11] != null && i0Var.getMeasuredWidth() == caVar.r && i0Var.getMeasuredHeight() == caVar.q) {
                                            caVar.e[i11].eraseColor(0);
                                        } else {
                                            int measuredHeight2 = i0Var.getMeasuredHeight();
                                            int measuredWidth2 = i0Var.getMeasuredWidth();
                                            int dp2 = AndroidUtilities.dp(200.0f) + AndroidUtilities.statusBarHeight;
                                            caVar.s = dp2;
                                            if (i11 == 0) {
                                                measuredHeight2 = dp2;
                                            }
                                            try {
                                                caVar.e[i11] = Bitmap.createBitmap((int) (measuredWidth2 / 15.0f), (int) (measuredHeight2 / 15.0f), Bitmap.Config.ARGB_8888);
                                                caVar.j[i11] = new Canvas(caVar.e[i11]);
                                            } catch (Exception e10) {
                                                FileLog.e(e10);
                                                AndroidUtilities.runOnUIThread(new ig(caVar, 11));
                                                return;
                                            }
                                        }
                                        if (i11 == r02) {
                                            caVar.e[i11].eraseColor(g6.v0(g6.d6, c6Var2));
                                        }
                                        caVar.j[i11].save();
                                        caVar.j[i11].scale(0.06666667f, 0.06666667f, f9, f9);
                                        Drawable background = view.getBackground();
                                        if (background == null) {
                                            background = c6Var2 instanceof rn ? ((rn) c6Var2).d() : g6.s0();
                                        }
                                        view.setTag(67108867, Integer.valueOf(i11));
                                        if (i11 == 0) {
                                            caVar.j[i11].translate(f9, -caVar.u);
                                            view.draw(caVar.j[i11]);
                                        }
                                        if (background != null && i11 == r02) {
                                            Rect bounds = background.getBounds();
                                            background.setBounds(0, 0, view.getMeasuredWidth(), view.getMeasuredHeight());
                                            background.draw(caVar.j[i11]);
                                            background.setBounds(bounds);
                                            view.draw(caVar.j[i11]);
                                        }
                                        view.setTag(67108867, null);
                                        caVar.j[i11].restore();
                                    }
                                    caVar.q = i0Var.getMeasuredHeight();
                                    caVar.r = i0Var.getMeasuredWidth();
                                    caVar.v.b = i0Var.getMeasuredWidth();
                                    caVar.v.c = i0Var.getMeasuredHeight();
                                    ba baVar = caVar.v;
                                    if (baVar.b != 0 && baVar.c != 0) {
                                        if (caVar.a == null) {
                                            caVar.a = new DispatchQueue("blur_thread_" + caVar);
                                        }
                                        caVar.a.postRunnable(caVar.v);
                                        break;
                                    } else {
                                        caVar.k = false;
                                        break;
                                    }
                                }
                            }
                        }
                    }
                }
                break;
            case 5:
                Paint paint5 = (Paint) this.b;
                ko koVar = (ko) this.c;
                y3 y3Var2 = koVar.e;
                if (y3Var2 != null && y3Var2.getImageReceiver().hasNotThumb()) {
                    paint5.setAlpha((int) (koVar.e.getImageReceiver().getCurrentAlpha() * 85.0f));
                    canvas.drawCircle(getMeasuredWidth() / 2.0f, getMeasuredHeight() / 2.0f, getMeasuredWidth() / 2.0f, paint5);
                    break;
                }
                break;
            case 6:
                Paint paint6 = (Paint) this.b;
                w20 w20Var = (w20) this.c;
                boolean z11 = w20Var.y;
                if (z11) {
                    float f16 = w20Var.A;
                    if (f16 != 1.0f) {
                        float f17 = f16 + 0.064f;
                        w20Var.A = f17;
                        if (f17 > 1.0f) {
                            w20Var.A = 1.0f;
                        }
                        invalidate();
                        paint6.setColor(i0.a.d(w20Var.A, 1711607061, 1714752530));
                        canvas.drawCircle(getMeasuredWidth() / 2.0f, (getMeasuredHeight() / 2.0f) - AndroidUtilities.dp(25.0f), (AndroidUtilities.dp(5.0f) * w20Var.A) + AndroidUtilities.dp(35.0f), paint6);
                        break;
                    }
                }
                if (!z11) {
                    float f18 = w20Var.A;
                    if (f18 != 0.0f) {
                        float f19 = f18 - 0.064f;
                        w20Var.A = f19;
                        if (f19 < 0.0f) {
                            w20Var.A = 0.0f;
                        }
                        invalidate();
                    }
                }
                paint6.setColor(i0.a.d(w20Var.A, 1711607061, 1714752530));
                canvas.drawCircle(getMeasuredWidth() / 2.0f, (getMeasuredHeight() / 2.0f) - AndroidUtilities.dp(25.0f), (AndroidUtilities.dp(5.0f) * w20Var.A) + AndroidUtilities.dp(35.0f), paint6);
            case 7:
                canvas.drawColor(855638016);
                r80 r80Var = (r80) this.c;
                FrameLayout frameLayout = r80Var.n;
                FrameLayout frameLayout2 = (FrameLayout) this.b;
                float[] fArr = r80Var.E;
                r80.a(frameLayout, frameLayout2, fArr);
                canvas.save();
                float y8 = frameLayout.getY() + ((View) frameLayout.getParent()).getY();
                if (y8 < 1.0f) {
                    canvas.clipRect(0.0f, (fArr[1] - y8) + 1.0f, getMeasuredWidth(), getMeasuredHeight());
                }
                canvas.translate(fArr[0], fArr[1]);
                frameLayout.draw(canvas);
                canvas.restore();
                break;
            case 8:
                Paint paint7 = (Paint) this.b;
                hs hsVar = (hs) this.c;
                t9 t9Var = hsVar.e;
                if (t9Var != null && t9Var.getImageReceiver().hasNotThumb()) {
                    paint7.setAlpha((int) (hsVar.e.getImageReceiver().getCurrentAlpha() * 85.0f));
                    canvas.drawCircle(getMeasuredWidth() / 2.0f, getMeasuredHeight() / 2.0f, getMeasuredWidth() / 2.0f, paint7);
                    break;
                }
                break;
            case 9:
                canvas.drawColor(855638016);
                lz lzVar = (lz) this.c;
                FrameLayout frameLayout3 = lzVar.a;
                FrameLayout frameLayout4 = (FrameLayout) this.b;
                float[] fArr2 = lzVar.y;
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
            case 10:
                Paint paint8 = (Paint) this.b;
                t60 t60Var = (t60) this.c;
                if (t60Var.d != null && t60Var.n.getVisibility() == 0 && t60Var.d.getImageReceiver().hasNotThumb()) {
                    paint8.setAlpha((int) (t60Var.n.getAlpha() * t60Var.d.getImageReceiver().getCurrentAlpha() * 85.0f));
                    canvas.drawCircle(getMeasuredWidth() / 2.0f, getMeasuredHeight() / 2.0f, getMeasuredWidth() / 2.0f, paint8);
                    break;
                }
                break;
            case 12:
                Paint paint9 = (Paint) this.b;
                pe0 pe0Var = (pe0) this.c;
                fd fdVar = pe0Var.r;
                y3 y3Var3 = pe0Var.e;
                if (y3Var3 != null && fdVar.getVisibility() == 0) {
                    paint9.setAlpha((int) (fdVar.getAlpha() * y3Var3.getImageReceiver().getCurrentAlpha() * 85.0f));
                    canvas.drawCircle(getMeasuredWidth() / 2.0f, getMeasuredHeight() / 2.0f, getMeasuredWidth() / 2.0f, paint9);
                    break;
                }
                break;
            case 13:
                if (((d61) this.c).M0) {
                    canvas.drawColor(g6.v0(g6.G8, (c6) this.b));
                    break;
                } else {
                    dispatchDraw(canvas);
                    break;
                }
            case 14:
                b81 b81Var = (b81) this.c;
                lVar = ((org.telegram.ui.ActionBar.o2) b81Var).actionBar;
                int height = lVar.getHeight();
                Rect rect = AndroidUtilities.rectTmp2;
                rect.set(0, 0, getMeasuredWidth(), height);
                Paint paint10 = (Paint) this.b;
                int i12 = g6.s8;
                c6Var = ((org.telegram.ui.ActionBar.o2) b81Var).resourceProvider;
                paint10.setColor(g6.v0(i12, c6Var));
                b81Var.b.J(canvas, 0.0f, rect, paint10, true);
                if (b81Var.getParentLayout() != null) {
                    ((ActionBarLayout) b81Var.getParentLayout()).q(canvas, height);
                    break;
                }
                break;
            case 15:
                qc1 qc1Var = (qc1) this.c;
                int currentItem = qc1Var.f0.getCurrentItem();
                Paint paint11 = (Paint) this.b;
                int i13 = g6.Ae;
                paint11.setColor(qc1Var.d ? g6.C0(i13) : qc1Var.getThemedColor(i13));
                int i14 = 0;
                while (i14 < 2) {
                    paint11.setAlpha(i14 == currentItem ? 255 : 127);
                    canvas.drawCircle(AndroidUtilities.dp((i14 * 15) + 3), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(3.0f), paint11);
                    i14++;
                }
                break;
            case 16:
                Paint paint12 = (Paint) this.b;
                paint12.setColor(g6.w0(null, g6.d6, false));
                int measuredHeight3 = getMeasuredHeight() - AndroidUtilities.dp(3.0f);
                canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), measuredHeight3, paint12);
                b5Var = ((org.telegram.ui.ActionBar.o2) ((cg1) this.c)).parentLayout;
                ((ActionBarLayout) b5Var).q(canvas, measuredHeight3);
                break;
            case 17:
                Paint paint13 = (Paint) this.b;
                qh.n nVar = (qh.n) this.c;
                t9 t9Var2 = nVar.v;
                if (t9Var2 != null && t9Var2.getImageReceiver().hasNotThumb()) {
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
            case 1:
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
                ca caVar = (ca) this.b;
                i0 i0Var = caVar.d;
                if (caVar.g != null && i0Var.getMeasuredHeight() != 0 && i0Var.getMeasuredWidth() != 0) {
                    caVar.a();
                    caVar.q = i0Var.getMeasuredHeight();
                    caVar.r = i0Var.getMeasuredWidth();
                    break;
                }
                break;
            default:
                super.onSizeChanged(i10, i11, i12, i13);
                break;
        }
    }

    @Override // android.view.View
    public void setAlpha(float f9) {
        switch (this.a) {
            case 4:
                super.setAlpha(f9);
                View view = ((tn) this.c).fragmentView;
                if (view != null) {
                    view.invalidate();
                    break;
                }
                break;
            case 5:
            default:
                super.setAlpha(f9);
                break;
            case 6:
                super.setAlpha(f9);
                ((w20) this.c).d.setAlpha(f9);
                break;
        }
    }

    @Override // android.view.View
    public void setScaleX(float f9) {
        switch (this.a) {
            case 6:
                super.setScaleX(f9);
                ((w20) this.c).d.setScaleX(f9);
                break;
            default:
                super.setScaleX(f9);
                break;
        }
    }

    @Override // android.view.View
    public void setScaleY(float f9) {
        switch (this.a) {
            case 6:
                super.setScaleY(f9);
                ((w20) this.c).d.setScaleY(f9);
                break;
            default:
                super.setScaleY(f9);
                break;
        }
    }

    @Override // android.view.View
    public void setTranslationY(float f9) {
        switch (this.a) {
            case 6:
                super.setTranslationY(f9);
                ((w20) this.c).d.setTranslationY(f9);
                break;
            default:
                super.setTranslationY(f9);
                break;
        }
    }

    @Override // android.view.View
    public void setVisibility(int i10) {
        switch (this.a) {
            case 4:
                super.setVisibility(i10);
                View view = ((tn) this.c).fragmentView;
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
            case 1:
                return drawable == ((cg0) this.c) || super.verifyDrawable(drawable);
            default:
                return super.verifyDrawable(drawable);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i0(Context context, b5 b5Var) {
        super(context);
        this.a = 11;
        this.c = new vd.a(0, this, jr.h, 380L, true);
        this.b = b5Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i0(Activity activity) {
        super(activity);
        this.a = 1;
        Paint paint = new Paint(1);
        this.b = paint;
        cg0 cg0Var = new cg0(10);
        this.c = cg0Var;
        paint.setColor(-1);
        paint.setShadowLayer(1.0f, 0.0f, 0.0f, 419430400);
        paint.setStyle(Paint.Style.STROKE);
        cg0Var.setCallback(this);
        cg0Var.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i0(qh.n nVar, Context context) {
        super(context);
        this.a = 17;
        this.c = nVar;
        this.b = new Paint(1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i0(w20 w20Var, Context context) {
        super(context);
        this.a = 6;
        this.c = w20Var;
        this.b = new Paint(1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i0(b81 b81Var, Context context) {
        super(context);
        this.a = 14;
        this.c = b81Var;
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
    public i0(cg1 cg1Var, Context context) {
        super(context);
        this.a = 16;
        this.c = cg1Var;
        this.b = new Paint();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i0(Context context, qc1 qc1Var) {
        super(context);
        this.a = 15;
        this.c = qc1Var;
        this.b = new Paint(1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i0(tn tnVar, Context context) {
        super(context);
        this.a = 3;
        this.c = tnVar;
        this.b = new RectF();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i0(tn tnVar, Context context, View view, c6 c6Var) {
        super(context);
        this.a = 4;
        this.c = tnVar;
        ca caVar = new ca(view, this, c6Var);
        this.b = caVar;
        caVar.p = false;
        caVar.n = true;
    }

    @Override // vd.b
    public /* synthetic */ void z(float f9, int i10) {
    }
}
