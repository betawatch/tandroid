package ag;

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
import jh.z3;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DispatchQueue;
import org.telegram.messenger.FileLog;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.b5;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Components.bg;
import org.telegram.ui.Components.er;
import org.telegram.ui.Components.i80;
import org.telegram.ui.Components.n20;
import org.telegram.ui.Components.n9;
import org.telegram.ui.Components.tf0;
import org.telegram.ui.Components.u9;
import org.telegram.ui.Components.v9;
import org.telegram.ui.a61;
import org.telegram.ui.gd;
import org.telegram.ui.hz;
import org.telegram.ui.id;
import org.telegram.ui.jo;
import org.telegram.ui.js;
import org.telegram.ui.mz;
import org.telegram.ui.nc1;
import org.telegram.ui.pn;
import org.telegram.ui.rn;
import org.telegram.ui.te0;
import org.telegram.ui.u60;
import org.telegram.ui.x71;
import org.telegram.ui.zf1;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class t0 extends View implements ud.b {
    public final /* synthetic */ int a;
    public final Object b;
    public final Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ t0(Object obj, Context context, Object obj2, int i10) {
        super(context);
        this.a = i10;
        this.c = obj;
        this.b = obj2;
    }

    public boolean a() {
        v9 v9Var = (v9) this.b;
        if (v9Var.t) {
            return (v9Var.m == 1.0f || !v9Var.p) && v9Var.n && v9Var.d.getAlpha() == 1.0f && getVisibility() == 0;
        }
        return false;
    }

    public void b(boolean z10, boolean z11) {
        ((ud.a) this.c).a(z10, z11);
    }

    @Override // android.view.View
    public void dispatchDraw(Canvas canvas) {
        switch (this.a) {
            case 4:
                RectF rectF = (RectF) this.b;
                rectF.set(0.0f, 0.0f, getWidth(), getHeight());
                int measuredWidth = getMeasuredWidth();
                rn rnVar = (rn) this.c;
                int backgroundSizeY = rnVar.T0.getBackgroundSizeY();
                float x8 = getX();
                float P8 = rnVar.P8(this);
                pn pnVar = rnVar.aa;
                if (pnVar != null) {
                    pnVar.m(x8, P8, measuredWidth, backgroundSizeY);
                } else {
                    g6.q(x8, P8, measuredWidth, backgroundSizeY);
                }
                canvas.drawRoundRect(rectF, AndroidUtilities.dp(18.0f), AndroidUtilities.dp(18.0f), rnVar.getThemedPaint("paintChatActionBackground"));
                pn pnVar2 = rnVar.aa;
                if (pnVar2 == null ? g6.a1() : pnVar2.u0()) {
                    canvas.drawRoundRect(rectF, AndroidUtilities.dp(18.0f), AndroidUtilities.dp(18.0f), rnVar.getThemedPaint("paintChatActionBackgroundDarken"));
                }
                super.dispatchDraw(canvas);
                break;
            case 12:
                super.dispatchDraw(canvas);
                ((ActionBarLayout) ((b5) this.b)).q(canvas, 0);
                break;
            default:
                super.dispatchDraw(canvas);
                break;
        }
    }

    @Override // ud.b
    public void o(int i10, float f10, float f11, ud.c cVar) {
        setVisibility(f10 > 0.0f ? 0 : 8);
        setAlpha(f10);
    }

    /* JADX WARN: Type inference failed for: r0v27 */
    /* JADX WARN: Type inference failed for: r0v28, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v40 */
    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        Bitmap[] bitmapArr;
        ?? r02;
        float f10;
        float f11;
        char c10;
        org.telegram.ui.ActionBar.k kVar;
        c6 c6Var;
        b5 b5Var;
        switch (this.a) {
            case 0:
                float measuredWidth = getMeasuredWidth() / 2.0f;
                float measuredHeight = getMeasuredHeight() / 2.0f;
                canvas.drawCircle(measuredWidth, measuredHeight, getMeasuredWidth() / 2.0f, (Paint) this.b);
                j2.d().f(-AndroidUtilities.dp(10.0f), 0.0f, getMeasuredWidth(), getMeasuredHeight());
                canvas.drawCircle(measuredWidth, measuredHeight, (getMeasuredWidth() / 2.0f) - AndroidUtilities.dp(2.0f), j2.d().e());
                float dp = AndroidUtilities.dp(18.0f) / 2.0f;
                Drawable drawable = (Drawable) this.c;
                drawable.setBounds((int) (measuredWidth - dp), (int) (measuredHeight - dp), (int) (measuredWidth + dp), (int) (measuredHeight + dp));
                drawable.draw(canvas);
                break;
            case 1:
                Paint paint = (Paint) this.b;
                paint.setStrokeWidth(AndroidUtilities.dpf2(1.66f));
                canvas.drawCircle(getWidth() / 2.0f, getHeight() / 2.0f, AndroidUtilities.dp(10.0f), paint);
                tf0 tf0Var = (tf0) this.c;
                tf0Var.setBounds(0, 0, AndroidUtilities.dp(10.0f), AndroidUtilities.dp(10.0f));
                canvas.save();
                canvas.translate((getWidth() - AndroidUtilities.dp(10.0f)) / 2.0f, (getHeight() - AndroidUtilities.dp(10.0f)) / 2.0f);
                tf0Var.draw(canvas);
                canvas.restore();
                break;
            case 2:
                Paint paint2 = (Paint) this.b;
                oh.o oVar = (oh.o) this.c;
                n9 n9Var = oVar.v;
                if (n9Var != null && n9Var.getImageReceiver().hasNotThumb()) {
                    paint2.setColor(1426063360);
                    paint2.setAlpha((int) (oVar.v.getImageReceiver().getCurrentAlpha() * 85.0f));
                    canvas.drawRoundRect(0.0f, 0.0f, getWidth(), getHeight(), AndroidUtilities.dp(20.0f), AndroidUtilities.dp(20.0f), paint2);
                    break;
                }
                break;
            case 3:
                Paint paint3 = (Paint) this.b;
                id idVar = (id) this.c;
                z3 z3Var = idVar.e;
                if (z3Var != null && z3Var.getImageReceiver().hasNotThumb()) {
                    paint3.setAlpha((int) (idVar.r.getAlpha() * idVar.e.getImageReceiver().getCurrentAlpha() * 85.0f));
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
                v9 v9Var = (v9) this.b;
                Paint paint4 = v9Var.x;
                c6 c6Var2 = v9Var.y;
                Paint paint5 = v9Var.w;
                int i10 = v9Var.b;
                View view = v9Var.c;
                t0 t0Var = v9Var.d;
                if (t0Var != null) {
                    if (t0Var.getMeasuredHeight() != 0 || t0Var.getMeasuredWidth() != 0) {
                        if (i10 == 1 && !v9Var.t && !v9Var.p) {
                            v9Var.a();
                            v9Var.l = false;
                        }
                        Bitmap[] bitmapArr2 = v9Var.g;
                        if ((bitmapArr2 != null || v9Var.o) && v9Var.p) {
                            boolean z10 = v9Var.n;
                            if (z10) {
                                float f12 = v9Var.m;
                                if (f12 != 1.0f) {
                                    float f13 = f12 + 0.09f;
                                    v9Var.m = f13;
                                    if (f13 > 1.0f) {
                                        v9Var.m = 1.0f;
                                    }
                                    t0Var.invalidate();
                                }
                            }
                            if (!z10) {
                                float f14 = v9Var.m;
                                if (f14 != 0.0f) {
                                    float f15 = f14 - 0.09f;
                                    v9Var.m = f15;
                                    if (f15 < 0.0f) {
                                        v9Var.m = 0.0f;
                                    }
                                    t0Var.invalidate();
                                }
                            }
                        }
                        float f16 = v9Var.p ? v9Var.m : 1.0f;
                        if (bitmapArr2 == null && v9Var.o) {
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
                                canvas.saveLayerAlpha(0.0f, 0.0f, t0Var.getMeasuredWidth(), t0Var.getMeasuredHeight(), (int) (f16 * 255.0f), 31);
                            }
                            if (bitmapArr != null) {
                                paint5.setAlpha((int) (f16 * f11));
                                if (i10 == r02) {
                                    canvas.translate(f10, v9Var.u);
                                }
                                canvas.save();
                                canvas.scale(t0Var.getMeasuredWidth() / bitmapArr[r02].getWidth(), t0Var.getMeasuredHeight() / bitmapArr[r02].getHeight());
                                canvas.drawBitmap(bitmapArr[r02], f10, f10, paint5);
                                canvas.restore();
                                canvas.save();
                                if (i10 == 0) {
                                    canvas.translate(f10, v9Var.u);
                                }
                                canvas.scale(t0Var.getMeasuredWidth() / bitmapArr[c10].getWidth(), v9Var.s / bitmapArr[c10].getHeight());
                                canvas.drawBitmap(bitmapArr[c10], f10, f10, paint5);
                                canvas.restore();
                                v9Var.t = r02;
                                canvas.drawColor(436207616);
                            }
                            canvas.restore();
                            if (v9Var.n && !v9Var.k) {
                                if (v9Var.g == null || v9Var.l) {
                                    v9Var.k = r02;
                                    v9Var.l = false;
                                    if (v9Var.e == null) {
                                        v9Var.e = new Bitmap[2];
                                        v9Var.j = new Canvas[2];
                                    }
                                    for (int i11 = 0; i11 < 2; i11++) {
                                        if (v9Var.e[i11] != null && t0Var.getMeasuredWidth() == v9Var.r && t0Var.getMeasuredHeight() == v9Var.q) {
                                            v9Var.e[i11].eraseColor(0);
                                        } else {
                                            int measuredHeight2 = t0Var.getMeasuredHeight();
                                            int measuredWidth2 = t0Var.getMeasuredWidth();
                                            int dp2 = AndroidUtilities.dp(200.0f) + AndroidUtilities.statusBarHeight;
                                            v9Var.s = dp2;
                                            if (i11 == 0) {
                                                measuredHeight2 = dp2;
                                            }
                                            try {
                                                v9Var.e[i11] = Bitmap.createBitmap((int) (measuredWidth2 / 15.0f), (int) (measuredHeight2 / 15.0f), Bitmap.Config.ARGB_8888);
                                                v9Var.j[i11] = new Canvas(v9Var.e[i11]);
                                            } catch (Exception e9) {
                                                FileLog.e(e9);
                                                AndroidUtilities.runOnUIThread(new bg(v9Var, 11));
                                                return;
                                            }
                                        }
                                        if (i11 == r02) {
                                            v9Var.e[i11].eraseColor(g6.v0(g6.d6, c6Var2));
                                        }
                                        v9Var.j[i11].save();
                                        v9Var.j[i11].scale(0.06666667f, 0.06666667f, f10, f10);
                                        Drawable background = view.getBackground();
                                        if (background == null) {
                                            background = c6Var2 instanceof pn ? ((pn) c6Var2).d() : g6.s0();
                                        }
                                        view.setTag(67108867, Integer.valueOf(i11));
                                        if (i11 == 0) {
                                            v9Var.j[i11].translate(f10, -v9Var.u);
                                            view.draw(v9Var.j[i11]);
                                        }
                                        if (background != null && i11 == r02) {
                                            Rect bounds = background.getBounds();
                                            background.setBounds(0, 0, view.getMeasuredWidth(), view.getMeasuredHeight());
                                            background.draw(v9Var.j[i11]);
                                            background.setBounds(bounds);
                                            view.draw(v9Var.j[i11]);
                                        }
                                        view.setTag(67108867, null);
                                        v9Var.j[i11].restore();
                                    }
                                    v9Var.q = t0Var.getMeasuredHeight();
                                    v9Var.r = t0Var.getMeasuredWidth();
                                    v9Var.v.b = t0Var.getMeasuredWidth();
                                    v9Var.v.c = t0Var.getMeasuredHeight();
                                    u9 u9Var = v9Var.v;
                                    if (u9Var.b != 0 && u9Var.c != 0) {
                                        if (v9Var.a == null) {
                                            v9Var.a = new DispatchQueue("blur_thread_" + v9Var);
                                        }
                                        v9Var.a.postRunnable(v9Var.v);
                                        break;
                                    } else {
                                        v9Var.k = false;
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
                jo joVar = (jo) this.c;
                z3 z3Var2 = joVar.e;
                if (z3Var2 != null && z3Var2.getImageReceiver().hasNotThumb()) {
                    paint6.setAlpha((int) (joVar.e.getImageReceiver().getCurrentAlpha() * 85.0f));
                    canvas.drawCircle(getMeasuredWidth() / 2.0f, getMeasuredHeight() / 2.0f, getMeasuredWidth() / 2.0f, paint6);
                    break;
                }
                break;
            case 7:
                Paint paint7 = (Paint) this.b;
                n20 n20Var = (n20) this.c;
                boolean z11 = n20Var.y;
                if (z11) {
                    float f17 = n20Var.A;
                    if (f17 != 1.0f) {
                        float f18 = f17 + 0.064f;
                        n20Var.A = f18;
                        if (f18 > 1.0f) {
                            n20Var.A = 1.0f;
                        }
                        invalidate();
                        paint7.setColor(i0.b.d(n20Var.A, 1711607061, 1714752530));
                        canvas.drawCircle(getMeasuredWidth() / 2.0f, (getMeasuredHeight() / 2.0f) - AndroidUtilities.dp(25.0f), (AndroidUtilities.dp(5.0f) * n20Var.A) + AndroidUtilities.dp(35.0f), paint7);
                        break;
                    }
                }
                if (!z11) {
                    float f19 = n20Var.A;
                    if (f19 != 0.0f) {
                        float f20 = f19 - 0.064f;
                        n20Var.A = f20;
                        if (f20 < 0.0f) {
                            n20Var.A = 0.0f;
                        }
                        invalidate();
                    }
                }
                paint7.setColor(i0.b.d(n20Var.A, 1711607061, 1714752530));
                canvas.drawCircle(getMeasuredWidth() / 2.0f, (getMeasuredHeight() / 2.0f) - AndroidUtilities.dp(25.0f), (AndroidUtilities.dp(5.0f) * n20Var.A) + AndroidUtilities.dp(35.0f), paint7);
            case 8:
                canvas.drawColor(855638016);
                i80 i80Var = (i80) this.c;
                FrameLayout frameLayout = i80Var.n;
                FrameLayout frameLayout2 = (FrameLayout) this.b;
                float[] fArr = i80Var.E;
                i80.a(frameLayout, frameLayout2, fArr);
                canvas.save();
                float y10 = frameLayout.getY() + ((View) frameLayout.getParent()).getY();
                if (y10 < 1.0f) {
                    canvas.clipRect(0.0f, (fArr[1] - y10) + 1.0f, getMeasuredWidth(), getMeasuredHeight());
                }
                canvas.translate(fArr[0], fArr[1]);
                frameLayout.draw(canvas);
                canvas.restore();
                break;
            case 9:
                Paint paint8 = (Paint) this.b;
                js jsVar = (js) this.c;
                n9 n9Var2 = jsVar.e;
                if (n9Var2 != null && n9Var2.getImageReceiver().hasNotThumb()) {
                    paint8.setAlpha((int) (jsVar.e.getImageReceiver().getCurrentAlpha() * 85.0f));
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
                hz.a(frameLayout3, frameLayout4, fArr2);
                canvas.save();
                float y11 = frameLayout3.getY() + ((View) frameLayout3.getParent()).getY();
                if (y11 < 1.0f) {
                    canvas.clipRect(0.0f, (fArr2[1] - y11) + 1.0f, getMeasuredWidth(), getMeasuredHeight());
                }
                canvas.translate(fArr2[0], fArr2[1]);
                frameLayout3.draw(canvas);
                canvas.restore();
                break;
            case 11:
                Paint paint9 = (Paint) this.b;
                u60 u60Var = (u60) this.c;
                if (u60Var.d != null && u60Var.n.getVisibility() == 0 && u60Var.d.getImageReceiver().hasNotThumb()) {
                    paint9.setAlpha((int) (u60Var.n.getAlpha() * u60Var.d.getImageReceiver().getCurrentAlpha() * 85.0f));
                    canvas.drawCircle(getMeasuredWidth() / 2.0f, getMeasuredHeight() / 2.0f, getMeasuredWidth() / 2.0f, paint9);
                    break;
                }
                break;
            case 13:
                Paint paint10 = (Paint) this.b;
                te0 te0Var = (te0) this.c;
                gd gdVar = te0Var.r;
                z3 z3Var3 = te0Var.e;
                if (z3Var3 != null && gdVar.getVisibility() == 0) {
                    paint10.setAlpha((int) (gdVar.getAlpha() * z3Var3.getImageReceiver().getCurrentAlpha() * 85.0f));
                    canvas.drawCircle(getMeasuredWidth() / 2.0f, getMeasuredHeight() / 2.0f, getMeasuredWidth() / 2.0f, paint10);
                    break;
                }
                break;
            case 14:
                if (((a61) this.c).M0) {
                    canvas.drawColor(g6.v0(g6.G8, (c6) this.b));
                    break;
                } else {
                    dispatchDraw(canvas);
                    break;
                }
            case 15:
                x71 x71Var = (x71) this.c;
                kVar = ((org.telegram.ui.ActionBar.n2) x71Var).actionBar;
                int height = kVar.getHeight();
                Rect rect = AndroidUtilities.rectTmp2;
                rect.set(0, 0, getMeasuredWidth(), height);
                Paint paint11 = (Paint) this.b;
                int i12 = g6.s8;
                c6Var = ((org.telegram.ui.ActionBar.n2) x71Var).resourceProvider;
                paint11.setColor(g6.v0(i12, c6Var));
                x71Var.b.J(canvas, 0.0f, rect, paint11, true);
                if (x71Var.getParentLayout() != null) {
                    ((ActionBarLayout) x71Var.getParentLayout()).q(canvas, height);
                    break;
                }
                break;
            case 16:
                nc1 nc1Var = (nc1) this.c;
                int currentItem = nc1Var.f0.getCurrentItem();
                Paint paint12 = (Paint) this.b;
                int i13 = g6.Ae;
                paint12.setColor(nc1Var.d ? g6.C0(i13) : nc1Var.getThemedColor(i13));
                int i14 = 0;
                while (i14 < 2) {
                    paint12.setAlpha(i14 == currentItem ? 255 : 127);
                    canvas.drawCircle(AndroidUtilities.dp((i14 * 15) + 3), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(3.0f), paint12);
                    i14++;
                }
                break;
            case 17:
                Paint paint13 = (Paint) this.b;
                paint13.setColor(g6.w0(null, g6.d6, false));
                int measuredHeight3 = getMeasuredHeight() - AndroidUtilities.dp(3.0f);
                canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), measuredHeight3, paint13);
                b5Var = ((org.telegram.ui.ActionBar.n2) ((zf1) this.c)).parentLayout;
                ((ActionBarLayout) b5Var).q(canvas, measuredHeight3);
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
            case 5:
                super.onSizeChanged(i10, i11, i12, i13);
                v9 v9Var = (v9) this.b;
                t0 t0Var = v9Var.d;
                if (v9Var.g != null && t0Var.getMeasuredHeight() != 0 && t0Var.getMeasuredWidth() != 0) {
                    v9Var.a();
                    v9Var.q = t0Var.getMeasuredHeight();
                    v9Var.r = t0Var.getMeasuredWidth();
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
            case 5:
                super.setAlpha(f10);
                View view = ((rn) this.c).fragmentView;
                if (view != null) {
                    view.invalidate();
                    break;
                }
                break;
            case 6:
            default:
                super.setAlpha(f10);
                break;
            case 7:
                super.setAlpha(f10);
                ((n20) this.c).d.setAlpha(f10);
                break;
        }
    }

    @Override // android.view.View
    public void setScaleX(float f10) {
        switch (this.a) {
            case 7:
                super.setScaleX(f10);
                ((n20) this.c).d.setScaleX(f10);
                break;
            default:
                super.setScaleX(f10);
                break;
        }
    }

    @Override // android.view.View
    public void setScaleY(float f10) {
        switch (this.a) {
            case 7:
                super.setScaleY(f10);
                ((n20) this.c).d.setScaleY(f10);
                break;
            default:
                super.setScaleY(f10);
                break;
        }
    }

    @Override // android.view.View
    public void setTranslationY(float f10) {
        switch (this.a) {
            case 7:
                super.setTranslationY(f10);
                ((n20) this.c).d.setTranslationY(f10);
                break;
            default:
                super.setTranslationY(f10);
                break;
        }
    }

    @Override // android.view.View
    public void setVisibility(int i10) {
        switch (this.a) {
            case 5:
                super.setVisibility(i10);
                View view = ((rn) this.c).fragmentView;
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
                return drawable == ((tf0) this.c) || super.verifyDrawable(drawable);
            default:
                return super.verifyDrawable(drawable);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t0(Context context, b5 b5Var) {
        super(context);
        this.a = 12;
        this.c = new ud.a(0, this, er.h, 380L, true);
        this.b = b5Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t0(Activity activity) {
        super(activity);
        this.a = 1;
        Paint paint = new Paint(1);
        this.b = paint;
        tf0 tf0Var = new tf0(10);
        this.c = tf0Var;
        paint.setColor(-1);
        paint.setShadowLayer(1.0f, 0.0f, 0.0f, 419430400);
        paint.setStyle(Paint.Style.STROKE);
        tf0Var.setCallback(this);
        tf0Var.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t0(oh.o oVar, Context context) {
        super(context);
        this.a = 2;
        this.c = oVar;
        this.b = new Paint(1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t0(n20 n20Var, Context context) {
        super(context);
        this.a = 7;
        this.c = n20Var;
        this.b = new Paint(1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t0(x71 x71Var, Context context) {
        super(context);
        this.a = 15;
        this.c = x71Var;
        this.b = new Paint(1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t0(Context context, Paint paint, Drawable drawable) {
        super(context);
        this.a = 0;
        this.b = paint;
        this.c = drawable;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t0(zf1 zf1Var, Context context) {
        super(context);
        this.a = 17;
        this.c = zf1Var;
        this.b = new Paint();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t0(Context context, nc1 nc1Var) {
        super(context);
        this.a = 16;
        this.c = nc1Var;
        this.b = new Paint(1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t0(rn rnVar, Context context) {
        super(context);
        this.a = 4;
        this.c = rnVar;
        this.b = new RectF();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t0(rn rnVar, Context context, View view, c6 c6Var) {
        super(context);
        this.a = 5;
        this.c = rnVar;
        v9 v9Var = new v9(view, this, c6Var);
        this.b = v9Var;
        v9Var.p = false;
        v9Var.n = true;
    }

    @Override // ud.b
    public /* synthetic */ void A(float f10, int i10) {
    }
}
