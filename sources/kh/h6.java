package kh;

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
import org.telegram.ui.Components.e80;
import org.telegram.ui.Components.fg;
import org.telegram.ui.Components.gr;
import org.telegram.ui.Components.j20;
import org.telegram.ui.Components.qf0;
import org.telegram.ui.ag1;
import org.telegram.ui.b61;
import org.telegram.ui.ez;
import org.telegram.ui.gd;
import org.telegram.ui.ho;
import org.telegram.ui.id;
import org.telegram.ui.is;
import org.telegram.ui.jz;
import org.telegram.ui.oc1;
import org.telegram.ui.on;
import org.telegram.ui.qe0;
import org.telegram.ui.qn;
import org.telegram.ui.r60;
import org.telegram.ui.z71;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes4.dex */
public final class h6 extends View implements td.b {
    public final /* synthetic */ int a;
    public final Object b;
    public final Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h6(Object obj, Context context, Object obj2, int i9) {
        super(context);
        this.a = i9;
        this.c = obj;
        this.b = obj2;
    }

    @Override // td.b
    public void J0(int i9, float f10, float f11, td.c cVar) {
        setVisibility(f10 > 0.0f ? 0 : 8);
        setAlpha(f10);
    }

    public boolean a() {
        org.telegram.ui.Components.x9 x9Var = (org.telegram.ui.Components.x9) this.b;
        if (x9Var.t) {
            return (x9Var.m == 1.0f || !x9Var.p) && x9Var.n && x9Var.d.getAlpha() == 1.0f && getVisibility() == 0;
        }
        return false;
    }

    public void b(boolean z10, boolean z11) {
        ((td.a) this.c).a(z10, z11);
    }

    @Override // android.view.View
    public void dispatchDraw(Canvas canvas) {
        switch (this.a) {
            case 3:
                RectF rectF = (RectF) this.b;
                rectF.set(0.0f, 0.0f, getWidth(), getHeight());
                int measuredWidth = getMeasuredWidth();
                qn qnVar = (qn) this.c;
                int backgroundSizeY = qnVar.T0.getBackgroundSizeY();
                float x10 = getX();
                float P8 = qnVar.P8(this);
                on onVar = qnVar.aa;
                if (onVar != null) {
                    onVar.o(x10, P8, measuredWidth, backgroundSizeY);
                } else {
                    org.telegram.ui.ActionBar.f6.q(x10, P8, measuredWidth, backgroundSizeY);
                }
                canvas.drawRoundRect(rectF, AndroidUtilities.dp(18.0f), AndroidUtilities.dp(18.0f), qnVar.getThemedPaint("paintChatActionBackground"));
                on onVar2 = qnVar.aa;
                if (onVar2 == null ? org.telegram.ui.ActionBar.f6.a1() : onVar2.t0()) {
                    canvas.drawRoundRect(rectF, AndroidUtilities.dp(18.0f), AndroidUtilities.dp(18.0f), qnVar.getThemedPaint("paintChatActionBackgroundDarken"));
                }
                super.dispatchDraw(canvas);
                break;
            case 11:
                super.dispatchDraw(canvas);
                ((ActionBarLayout) ((org.telegram.ui.ActionBar.b5) this.b)).q(canvas, 0);
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
        float f10;
        float f11;
        char c10;
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.ActionBar.b6 b6Var;
        org.telegram.ui.ActionBar.b5 b5Var;
        switch (this.a) {
            case 0:
                Paint paint = (Paint) this.b;
                paint.setStrokeWidth(AndroidUtilities.dpf2(1.66f));
                canvas.drawCircle(getWidth() / 2.0f, getHeight() / 2.0f, AndroidUtilities.dp(10.0f), paint);
                qf0 qf0Var = (qf0) this.c;
                qf0Var.setBounds(0, 0, AndroidUtilities.dp(10.0f), AndroidUtilities.dp(10.0f));
                canvas.save();
                canvas.translate((getWidth() - AndroidUtilities.dp(10.0f)) / 2.0f, (getHeight() - AndroidUtilities.dp(10.0f)) / 2.0f);
                qf0Var.draw(canvas);
                canvas.restore();
                break;
            case 1:
                Paint paint2 = (Paint) this.b;
                nh.o oVar = (nh.o) this.c;
                org.telegram.ui.Components.o9 o9Var = oVar.v;
                if (o9Var != null && o9Var.getImageReceiver().hasNotThumb()) {
                    paint2.setColor(1426063360);
                    paint2.setAlpha((int) (oVar.v.getImageReceiver().getCurrentAlpha() * 85.0f));
                    canvas.drawRoundRect(0.0f, 0.0f, getWidth(), getHeight(), AndroidUtilities.dp(20.0f), AndroidUtilities.dp(20.0f), paint2);
                    break;
                }
                break;
            case 2:
                Paint paint3 = (Paint) this.b;
                id idVar = (id) this.c;
                ih.d4 d4Var = idVar.e;
                if (d4Var != null && d4Var.getImageReceiver().hasNotThumb()) {
                    paint3.setAlpha((int) (idVar.r.getAlpha() * idVar.e.getImageReceiver().getCurrentAlpha() * 85.0f));
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
                org.telegram.ui.Components.x9 x9Var = (org.telegram.ui.Components.x9) this.b;
                Paint paint4 = x9Var.x;
                org.telegram.ui.ActionBar.b6 b6Var2 = x9Var.y;
                Paint paint5 = x9Var.w;
                int i9 = x9Var.b;
                View view = x9Var.c;
                h6 h6Var = x9Var.d;
                if (h6Var != null) {
                    if (h6Var.getMeasuredHeight() != 0 || h6Var.getMeasuredWidth() != 0) {
                        if (i9 == 1 && !x9Var.t && !x9Var.p) {
                            x9Var.a();
                            x9Var.l = false;
                        }
                        Bitmap[] bitmapArr2 = x9Var.g;
                        if ((bitmapArr2 != null || x9Var.o) && x9Var.p) {
                            boolean z10 = x9Var.n;
                            if (z10) {
                                float f12 = x9Var.m;
                                if (f12 != 1.0f) {
                                    float f13 = f12 + 0.09f;
                                    x9Var.m = f13;
                                    if (f13 > 1.0f) {
                                        x9Var.m = 1.0f;
                                    }
                                    h6Var.invalidate();
                                }
                            }
                            if (!z10) {
                                float f14 = x9Var.m;
                                if (f14 != 0.0f) {
                                    float f15 = f14 - 0.09f;
                                    x9Var.m = f15;
                                    if (f15 < 0.0f) {
                                        x9Var.m = 0.0f;
                                    }
                                    h6Var.invalidate();
                                }
                            }
                        }
                        float f16 = x9Var.p ? x9Var.m : 1.0f;
                        if (bitmapArr2 == null && x9Var.o) {
                            paint4.setAlpha((int) (50.0f * f16));
                            canvas.drawPaint(paint4);
                            break;
                        } else {
                            if (f16 == 1.0f) {
                                canvas.save();
                                bitmapArr = bitmapArr2;
                                r02 = 1;
                                f10 = 0.0f;
                                f11 = 255.0f;
                                c10 = 0;
                            } else {
                                bitmapArr = bitmapArr2;
                                r02 = 1;
                                f10 = 0.0f;
                                f11 = 255.0f;
                                c10 = 0;
                                canvas.saveLayerAlpha(0.0f, 0.0f, h6Var.getMeasuredWidth(), h6Var.getMeasuredHeight(), (int) (f16 * 255.0f), 31);
                            }
                            if (bitmapArr != null) {
                                paint5.setAlpha((int) (f16 * f11));
                                if (i9 == r02) {
                                    canvas.translate(f10, x9Var.u);
                                }
                                canvas.save();
                                canvas.scale(h6Var.getMeasuredWidth() / bitmapArr[r02].getWidth(), h6Var.getMeasuredHeight() / bitmapArr[r02].getHeight());
                                canvas.drawBitmap(bitmapArr[r02], f10, f10, paint5);
                                canvas.restore();
                                canvas.save();
                                if (i9 == 0) {
                                    canvas.translate(f10, x9Var.u);
                                }
                                canvas.scale(h6Var.getMeasuredWidth() / bitmapArr[c10].getWidth(), x9Var.s / bitmapArr[c10].getHeight());
                                canvas.drawBitmap(bitmapArr[c10], f10, f10, paint5);
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
                                    for (int i10 = 0; i10 < 2; i10++) {
                                        if (x9Var.e[i10] != null && h6Var.getMeasuredWidth() == x9Var.r && h6Var.getMeasuredHeight() == x9Var.q) {
                                            x9Var.e[i10].eraseColor(0);
                                        } else {
                                            int measuredHeight = h6Var.getMeasuredHeight();
                                            int measuredWidth = h6Var.getMeasuredWidth();
                                            int dp = AndroidUtilities.dp(200.0f) + AndroidUtilities.statusBarHeight;
                                            x9Var.s = dp;
                                            if (i10 == 0) {
                                                measuredHeight = dp;
                                            }
                                            try {
                                                x9Var.e[i10] = Bitmap.createBitmap((int) (measuredWidth / 15.0f), (int) (measuredHeight / 15.0f), Bitmap.Config.ARGB_8888);
                                                x9Var.j[i10] = new Canvas(x9Var.e[i10]);
                                            } catch (Exception e10) {
                                                FileLog.e(e10);
                                                AndroidUtilities.runOnUIThread(new fg(x9Var, 11));
                                                return;
                                            }
                                        }
                                        if (i10 == r02) {
                                            x9Var.e[i10].eraseColor(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.d6, b6Var2));
                                        }
                                        x9Var.j[i10].save();
                                        x9Var.j[i10].scale(0.06666667f, 0.06666667f, f10, f10);
                                        Drawable background = view.getBackground();
                                        if (background == null) {
                                            background = b6Var2 instanceof on ? ((on) b6Var2).d() : org.telegram.ui.ActionBar.f6.s0();
                                        }
                                        view.setTag(67108867, Integer.valueOf(i10));
                                        if (i10 == 0) {
                                            x9Var.j[i10].translate(f10, -x9Var.u);
                                            view.draw(x9Var.j[i10]);
                                        }
                                        if (background != null && i10 == r02) {
                                            Rect bounds = background.getBounds();
                                            background.setBounds(0, 0, view.getMeasuredWidth(), view.getMeasuredHeight());
                                            background.draw(x9Var.j[i10]);
                                            background.setBounds(bounds);
                                            view.draw(x9Var.j[i10]);
                                        }
                                        view.setTag(67108867, null);
                                        x9Var.j[i10].restore();
                                    }
                                    x9Var.q = h6Var.getMeasuredHeight();
                                    x9Var.r = h6Var.getMeasuredWidth();
                                    x9Var.v.b = h6Var.getMeasuredWidth();
                                    x9Var.v.c = h6Var.getMeasuredHeight();
                                    org.telegram.ui.Components.w9 w9Var = x9Var.v;
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
            case 5:
                Paint paint6 = (Paint) this.b;
                ho hoVar = (ho) this.c;
                ih.d4 d4Var2 = hoVar.e;
                if (d4Var2 != null && d4Var2.getImageReceiver().hasNotThumb()) {
                    paint6.setAlpha((int) (hoVar.e.getImageReceiver().getCurrentAlpha() * 85.0f));
                    canvas.drawCircle(getMeasuredWidth() / 2.0f, getMeasuredHeight() / 2.0f, getMeasuredWidth() / 2.0f, paint6);
                    break;
                }
                break;
            case 6:
                Paint paint7 = (Paint) this.b;
                j20 j20Var = (j20) this.c;
                boolean z11 = j20Var.y;
                if (z11) {
                    float f17 = j20Var.A;
                    if (f17 != 1.0f) {
                        float f18 = f17 + 0.064f;
                        j20Var.A = f18;
                        if (f18 > 1.0f) {
                            j20Var.A = 1.0f;
                        }
                        invalidate();
                        paint7.setColor(i0.a.d(j20Var.A, 1711607061, 1714752530));
                        canvas.drawCircle(getMeasuredWidth() / 2.0f, (getMeasuredHeight() / 2.0f) - AndroidUtilities.dp(25.0f), (AndroidUtilities.dp(5.0f) * j20Var.A) + AndroidUtilities.dp(35.0f), paint7);
                        break;
                    }
                }
                if (!z11) {
                    float f19 = j20Var.A;
                    if (f19 != 0.0f) {
                        float f20 = f19 - 0.064f;
                        j20Var.A = f20;
                        if (f20 < 0.0f) {
                            j20Var.A = 0.0f;
                        }
                        invalidate();
                    }
                }
                paint7.setColor(i0.a.d(j20Var.A, 1711607061, 1714752530));
                canvas.drawCircle(getMeasuredWidth() / 2.0f, (getMeasuredHeight() / 2.0f) - AndroidUtilities.dp(25.0f), (AndroidUtilities.dp(5.0f) * j20Var.A) + AndroidUtilities.dp(35.0f), paint7);
            case 7:
                canvas.drawColor(855638016);
                e80 e80Var = (e80) this.c;
                FrameLayout frameLayout = e80Var.n;
                FrameLayout frameLayout2 = (FrameLayout) this.b;
                float[] fArr = e80Var.E;
                e80.a(frameLayout, frameLayout2, fArr);
                canvas.save();
                float y10 = frameLayout.getY() + ((View) frameLayout.getParent()).getY();
                if (y10 < 1.0f) {
                    canvas.clipRect(0.0f, (fArr[1] - y10) + 1.0f, getMeasuredWidth(), getMeasuredHeight());
                }
                canvas.translate(fArr[0], fArr[1]);
                frameLayout.draw(canvas);
                canvas.restore();
                break;
            case 8:
                Paint paint8 = (Paint) this.b;
                is isVar = (is) this.c;
                org.telegram.ui.Components.o9 o9Var2 = isVar.e;
                if (o9Var2 != null && o9Var2.getImageReceiver().hasNotThumb()) {
                    paint8.setAlpha((int) (isVar.e.getImageReceiver().getCurrentAlpha() * 85.0f));
                    canvas.drawCircle(getMeasuredWidth() / 2.0f, getMeasuredHeight() / 2.0f, getMeasuredWidth() / 2.0f, paint8);
                    break;
                }
                break;
            case 9:
                canvas.drawColor(855638016);
                jz jzVar = (jz) this.c;
                FrameLayout frameLayout3 = jzVar.a;
                FrameLayout frameLayout4 = (FrameLayout) this.b;
                float[] fArr2 = jzVar.y;
                ez.a(frameLayout3, frameLayout4, fArr2);
                canvas.save();
                float y11 = frameLayout3.getY() + ((View) frameLayout3.getParent()).getY();
                if (y11 < 1.0f) {
                    canvas.clipRect(0.0f, (fArr2[1] - y11) + 1.0f, getMeasuredWidth(), getMeasuredHeight());
                }
                canvas.translate(fArr2[0], fArr2[1]);
                frameLayout3.draw(canvas);
                canvas.restore();
                break;
            case 10:
                Paint paint9 = (Paint) this.b;
                r60 r60Var = (r60) this.c;
                if (r60Var.d != null && r60Var.n.getVisibility() == 0 && r60Var.d.getImageReceiver().hasNotThumb()) {
                    paint9.setAlpha((int) (r60Var.n.getAlpha() * r60Var.d.getImageReceiver().getCurrentAlpha() * 85.0f));
                    canvas.drawCircle(getMeasuredWidth() / 2.0f, getMeasuredHeight() / 2.0f, getMeasuredWidth() / 2.0f, paint9);
                    break;
                }
                break;
            case 12:
                Paint paint10 = (Paint) this.b;
                qe0 qe0Var = (qe0) this.c;
                gd gdVar = qe0Var.r;
                ih.d4 d4Var3 = qe0Var.e;
                if (d4Var3 != null && gdVar.getVisibility() == 0) {
                    paint10.setAlpha((int) (gdVar.getAlpha() * d4Var3.getImageReceiver().getCurrentAlpha() * 85.0f));
                    canvas.drawCircle(getMeasuredWidth() / 2.0f, getMeasuredHeight() / 2.0f, getMeasuredWidth() / 2.0f, paint10);
                    break;
                }
                break;
            case 13:
                if (((b61) this.c).M0) {
                    canvas.drawColor(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.G8, (org.telegram.ui.ActionBar.b6) this.b));
                    break;
                } else {
                    dispatchDraw(canvas);
                    break;
                }
            case 14:
                z71 z71Var = (z71) this.c;
                kVar = ((org.telegram.ui.ActionBar.o2) z71Var).actionBar;
                int height = kVar.getHeight();
                Rect rect = AndroidUtilities.rectTmp2;
                rect.set(0, 0, getMeasuredWidth(), height);
                Paint paint11 = (Paint) this.b;
                int i11 = org.telegram.ui.ActionBar.f6.s8;
                b6Var = ((org.telegram.ui.ActionBar.o2) z71Var).resourceProvider;
                paint11.setColor(org.telegram.ui.ActionBar.f6.v0(i11, b6Var));
                z71Var.b.J(canvas, 0.0f, rect, paint11, true);
                if (z71Var.getParentLayout() != null) {
                    ((ActionBarLayout) z71Var.getParentLayout()).q(canvas, height);
                    break;
                }
                break;
            case 15:
                oc1 oc1Var = (oc1) this.c;
                int currentItem = oc1Var.f0.getCurrentItem();
                Paint paint12 = (Paint) this.b;
                int i12 = org.telegram.ui.ActionBar.f6.Ae;
                paint12.setColor(oc1Var.d ? org.telegram.ui.ActionBar.f6.C0(i12) : oc1Var.getThemedColor(i12));
                int i13 = 0;
                while (i13 < 2) {
                    paint12.setAlpha(i13 == currentItem ? 255 : 127);
                    canvas.drawCircle(AndroidUtilities.dp((i13 * 15) + 3), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(3.0f), paint12);
                    i13++;
                }
                break;
            case 16:
                Paint paint13 = (Paint) this.b;
                paint13.setColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.d6, false));
                int measuredHeight2 = getMeasuredHeight() - AndroidUtilities.dp(3.0f);
                canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), measuredHeight2, paint13);
                b5Var = ((org.telegram.ui.ActionBar.o2) ((ag1) this.c)).parentLayout;
                ((ActionBarLayout) b5Var).q(canvas, measuredHeight2);
                break;
            case 17:
                float measuredWidth2 = getMeasuredWidth() / 2.0f;
                float measuredHeight3 = getMeasuredHeight() / 2.0f;
                canvas.drawCircle(measuredWidth2, measuredHeight3, getMeasuredWidth() / 2.0f, (Paint) this.b);
                zf.a1.d().f(-AndroidUtilities.dp(10.0f), 0.0f, getMeasuredWidth(), getMeasuredHeight());
                canvas.drawCircle(measuredWidth2, measuredHeight3, (getMeasuredWidth() / 2.0f) - AndroidUtilities.dp(2.0f), zf.a1.d().e());
                float dp2 = AndroidUtilities.dp(18.0f) / 2.0f;
                Drawable drawable = (Drawable) this.c;
                drawable.setBounds((int) (measuredWidth2 - dp2), (int) (measuredHeight3 - dp2), (int) (measuredWidth2 + dp2), (int) (measuredHeight3 + dp2));
                drawable.draw(canvas);
                break;
        }
    }

    @Override // android.view.View
    public void onMeasure(int i9, int i10) {
        switch (this.a) {
            case 0:
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(56.0f), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(56.0f), TLObject.FLAG_30));
                break;
            default:
                super.onMeasure(i9, i10);
                break;
        }
    }

    @Override // android.view.View
    public void onSizeChanged(int i9, int i10, int i11, int i12) {
        switch (this.a) {
            case 4:
                super.onSizeChanged(i9, i10, i11, i12);
                org.telegram.ui.Components.x9 x9Var = (org.telegram.ui.Components.x9) this.b;
                h6 h6Var = x9Var.d;
                if (x9Var.g != null && h6Var.getMeasuredHeight() != 0 && h6Var.getMeasuredWidth() != 0) {
                    x9Var.a();
                    x9Var.q = h6Var.getMeasuredHeight();
                    x9Var.r = h6Var.getMeasuredWidth();
                    break;
                }
                break;
            default:
                super.onSizeChanged(i9, i10, i11, i12);
                break;
        }
    }

    @Override // android.view.View
    public void setAlpha(float f10) {
        switch (this.a) {
            case 4:
                super.setAlpha(f10);
                View view = ((qn) this.c).fragmentView;
                if (view != null) {
                    view.invalidate();
                    break;
                }
                break;
            case 5:
            default:
                super.setAlpha(f10);
                break;
            case 6:
                super.setAlpha(f10);
                ((j20) this.c).d.setAlpha(f10);
                break;
        }
    }

    @Override // android.view.View
    public void setScaleX(float f10) {
        switch (this.a) {
            case 6:
                super.setScaleX(f10);
                ((j20) this.c).d.setScaleX(f10);
                break;
            default:
                super.setScaleX(f10);
                break;
        }
    }

    @Override // android.view.View
    public void setScaleY(float f10) {
        switch (this.a) {
            case 6:
                super.setScaleY(f10);
                ((j20) this.c).d.setScaleY(f10);
                break;
            default:
                super.setScaleY(f10);
                break;
        }
    }

    @Override // android.view.View
    public void setTranslationY(float f10) {
        switch (this.a) {
            case 6:
                super.setTranslationY(f10);
                ((j20) this.c).d.setTranslationY(f10);
                break;
            default:
                super.setTranslationY(f10);
                break;
        }
    }

    @Override // android.view.View
    public void setVisibility(int i9) {
        switch (this.a) {
            case 4:
                super.setVisibility(i9);
                View view = ((qn) this.c).fragmentView;
                if (view != null) {
                    view.invalidate();
                    break;
                }
                break;
            default:
                super.setVisibility(i9);
                break;
        }
    }

    @Override // android.view.View
    public boolean verifyDrawable(Drawable drawable) {
        switch (this.a) {
            case 0:
                return drawable == ((qf0) this.c) || super.verifyDrawable(drawable);
            default:
                return super.verifyDrawable(drawable);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h6(Context context, org.telegram.ui.ActionBar.b5 b5Var) {
        super(context);
        this.a = 11;
        this.c = new td.a(0, this, gr.h, 380L, true);
        this.b = b5Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h6(Activity activity) {
        super(activity);
        this.a = 0;
        Paint paint = new Paint(1);
        this.b = paint;
        qf0 qf0Var = new qf0(10);
        this.c = qf0Var;
        paint.setColor(-1);
        paint.setShadowLayer(1.0f, 0.0f, 0.0f, 419430400);
        paint.setStyle(Paint.Style.STROKE);
        qf0Var.setCallback(this);
        qf0Var.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h6(nh.o oVar, Context context) {
        super(context);
        this.a = 1;
        this.c = oVar;
        this.b = new Paint(1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h6(j20 j20Var, Context context) {
        super(context);
        this.a = 6;
        this.c = j20Var;
        this.b = new Paint(1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h6(z71 z71Var, Context context) {
        super(context);
        this.a = 14;
        this.c = z71Var;
        this.b = new Paint(1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h6(Context context, Paint paint, Drawable drawable) {
        super(context);
        this.a = 17;
        this.b = paint;
        this.c = drawable;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h6(ag1 ag1Var, Context context) {
        super(context);
        this.a = 16;
        this.c = ag1Var;
        this.b = new Paint();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h6(Context context, oc1 oc1Var) {
        super(context);
        this.a = 15;
        this.c = oc1Var;
        this.b = new Paint(1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h6(qn qnVar, Context context) {
        super(context);
        this.a = 3;
        this.c = qnVar;
        this.b = new RectF();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h6(qn qnVar, Context context, View view, org.telegram.ui.ActionBar.b6 b6Var) {
        super(context);
        this.a = 4;
        this.c = qnVar;
        org.telegram.ui.Components.x9 x9Var = new org.telegram.ui.Components.x9(view, this, b6Var);
        this.b = x9Var;
        x9Var.p = false;
        x9Var.n = true;
    }

    @Override // td.b
    public /* synthetic */ void B(float f10, int i9) {
    }
}
