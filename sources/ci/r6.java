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
import org.telegram.ui.Components.hh0;
import org.telegram.ui.Components.hs;
import org.telegram.ui.Components.q30;
import org.telegram.ui.Components.rg;
import org.telegram.ui.Components.x90;
import org.telegram.ui.a00;
import org.telegram.ui.gf0;
import org.telegram.ui.i91;
import org.telegram.ui.ih1;
import org.telegram.ui.j70;
import org.telegram.ui.k71;
import org.telegram.ui.md;
import org.telegram.ui.qs;
import org.telegram.ui.uo;
import org.telegram.ui.vz;
import org.telegram.ui.xd1;
import org.telegram.ui.xn;
import org.telegram.ui.zn;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes4.dex */
public final class r6 extends View implements me.d {
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
        org.telegram.ui.Components.ia iaVar = (org.telegram.ui.Components.ia) this.b;
        if (iaVar.t) {
            return (iaVar.m == 1.0f || !iaVar.p) && iaVar.n && iaVar.d.getAlpha() == 1.0f && getVisibility() == 0;
        }
        return false;
    }

    public void b(boolean z10, boolean z11) {
        ((me.b) this.c).a(z10, z11);
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
                float U8 = znVar.U8(this);
                xn xnVar = znVar.ea;
                if (xnVar != null) {
                    xnVar.m(x10, U8, measuredWidth, backgroundSizeY);
                } else {
                    org.telegram.ui.ActionBar.i6.q(x10, U8, measuredWidth, backgroundSizeY);
                }
                canvas.drawRoundRect(rectF, AndroidUtilities.dp(18.0f), AndroidUtilities.dp(18.0f), znVar.getThemedPaint("paintChatActionBackground"));
                xn xnVar2 = znVar.ea;
                if (xnVar2 == null ? org.telegram.ui.ActionBar.i6.b1() : xnVar2.k0()) {
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

    @Override // me.d
    public void n(int i10, float f7, float f10, me.e eVar) {
        setVisibility(f7 > 0.0f ? 0 : 8);
        setAlpha(f7);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v25 */
    /* JADX WARN: Type inference failed for: r0v26, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v38 */
    /* JADX WARN: Type inference failed for: r16v0 */
    /* JADX WARN: Type inference failed for: r16v1 */
    /* JADX WARN: Type inference failed for: r16v2 */
    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        Bitmap[] bitmapArr;
        boolean z10;
        float f7;
        ?? r02;
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.ActionBar.e6 e6Var;
        org.telegram.ui.ActionBar.d5 d5Var;
        switch (this.a) {
            case 0:
                Paint paint = (Paint) this.b;
                paint.setStrokeWidth(AndroidUtilities.dpf2(1.66f));
                canvas.drawCircle(getWidth() / 2.0f, getHeight() / 2.0f, AndroidUtilities.dp(10.0f), paint);
                hh0 hh0Var = (hh0) this.c;
                hh0Var.setBounds(0, 0, AndroidUtilities.dp(10.0f), AndroidUtilities.dp(10.0f));
                canvas.save();
                canvas.translate((getWidth() - AndroidUtilities.dp(10.0f)) / 2.0f, (getHeight() - AndroidUtilities.dp(10.0f)) / 2.0f);
                hh0Var.draw(canvas);
                canvas.restore();
                break;
            case 1:
                Paint paint2 = (Paint) this.b;
                fi.p pVar = (fi.p) this.c;
                org.telegram.ui.Components.y9 y9Var = pVar.v;
                if (y9Var != null && y9Var.getImageReceiver().hasNotThumb()) {
                    paint2.setColor(1426063360);
                    paint2.setAlpha((int) (pVar.v.getImageReceiver().getCurrentAlpha() * 85.0f));
                    canvas.drawRoundRect(0.0f, 0.0f, getWidth(), getHeight(), AndroidUtilities.dp(20.0f), AndroidUtilities.dp(20.0f), paint2);
                    break;
                }
                break;
            case 2:
                Paint paint3 = (Paint) this.b;
                md mdVar = (md) this.c;
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
                org.telegram.ui.Components.ia iaVar = (org.telegram.ui.Components.ia) this.b;
                Paint paint4 = iaVar.x;
                org.telegram.ui.ActionBar.e6 e6Var2 = iaVar.y;
                Paint paint5 = iaVar.w;
                int i10 = iaVar.b;
                View view = iaVar.c;
                r6 r6Var = iaVar.d;
                if (r6Var != null) {
                    if (r6Var.getMeasuredHeight() != 0 || r6Var.getMeasuredWidth() != 0) {
                        if (i10 == 1 && !iaVar.t && !iaVar.p) {
                            iaVar.a();
                            iaVar.l = false;
                        }
                        Bitmap[] bitmapArr2 = iaVar.g;
                        if ((bitmapArr2 != null || iaVar.o) && iaVar.p) {
                            boolean z11 = iaVar.n;
                            if (z11) {
                                float f10 = iaVar.m;
                                if (f10 != 1.0f) {
                                    float f11 = f10 + 0.09f;
                                    iaVar.m = f11;
                                    if (f11 > 1.0f) {
                                        iaVar.m = 1.0f;
                                    }
                                    r6Var.invalidate();
                                }
                            }
                            if (!z11) {
                                float f12 = iaVar.m;
                                if (f12 != 0.0f) {
                                    float f13 = f12 - 0.09f;
                                    iaVar.m = f13;
                                    if (f13 < 0.0f) {
                                        iaVar.m = 0.0f;
                                    }
                                    r6Var.invalidate();
                                }
                            }
                        }
                        float f14 = iaVar.p ? iaVar.m : 1.0f;
                        if (bitmapArr2 == null && iaVar.o) {
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
                                canvas.saveLayerAlpha(0.0f, 0.0f, r6Var.getMeasuredWidth(), r6Var.getMeasuredHeight(), (int) (f14 * 255.0f), 31);
                            }
                            if (bitmapArr != null) {
                                paint5.setAlpha((int) (f14 * 255.0f));
                                if (i10 == r02) {
                                    canvas.translate(f7, iaVar.u);
                                }
                                canvas.save();
                                canvas.scale(r6Var.getMeasuredWidth() / bitmapArr[r02].getWidth(), r6Var.getMeasuredHeight() / bitmapArr[r02].getHeight());
                                canvas.drawBitmap(bitmapArr[r02], f7, f7, paint5);
                                canvas.restore();
                                canvas.save();
                                if (i10 == 0) {
                                    canvas.translate(f7, iaVar.u);
                                }
                                canvas.scale(r6Var.getMeasuredWidth() / bitmapArr[z10].getWidth(), iaVar.s / bitmapArr[z10].getHeight());
                                canvas.drawBitmap(bitmapArr[z10], f7, f7, paint5);
                                canvas.restore();
                                iaVar.t = r02;
                                canvas.drawColor(436207616);
                            }
                            canvas.restore();
                            if (iaVar.n && !iaVar.k) {
                                if (iaVar.g == null || iaVar.l) {
                                    iaVar.k = r02;
                                    iaVar.l = z10;
                                    if (iaVar.e == null) {
                                        iaVar.e = new Bitmap[2];
                                        iaVar.j = new Canvas[2];
                                    }
                                    for (int i11 = 0; i11 < 2; i11++) {
                                        if (iaVar.e[i11] != null && r6Var.getMeasuredWidth() == iaVar.r && r6Var.getMeasuredHeight() == iaVar.q) {
                                            iaVar.e[i11].eraseColor(0);
                                        } else {
                                            int measuredHeight = r6Var.getMeasuredHeight();
                                            int measuredWidth = r6Var.getMeasuredWidth();
                                            int dp = AndroidUtilities.dp(200.0f) + AndroidUtilities.statusBarHeight;
                                            iaVar.s = dp;
                                            if (i11 == 0) {
                                                measuredHeight = dp;
                                            }
                                            try {
                                                iaVar.e[i11] = Bitmap.createBitmap((int) (measuredWidth / 15.0f), (int) (measuredHeight / 15.0f), Bitmap.Config.ARGB_8888);
                                                iaVar.j[i11] = new Canvas(iaVar.e[i11]);
                                            } catch (Exception e7) {
                                                FileLog.e(e7);
                                                AndroidUtilities.runOnUIThread(new rg(iaVar, 11));
                                                return;
                                            }
                                        }
                                        if (i11 == r02) {
                                            iaVar.e[i11].eraseColor(org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.d6, e6Var2));
                                        }
                                        iaVar.j[i11].save();
                                        iaVar.j[i11].scale(0.06666667f, 0.06666667f, f7, f7);
                                        Drawable background = view.getBackground();
                                        if (background == null) {
                                            background = e6Var2 instanceof xn ? ((xn) e6Var2).d() : org.telegram.ui.ActionBar.i6.t0();
                                        }
                                        view.setTag(67108867, Integer.valueOf(i11));
                                        if (i11 == 0) {
                                            iaVar.j[i11].translate(f7, -iaVar.u);
                                            view.draw(iaVar.j[i11]);
                                        }
                                        if (background != null && i11 == r02) {
                                            Rect bounds = background.getBounds();
                                            background.setBounds(0, 0, view.getMeasuredWidth(), view.getMeasuredHeight());
                                            background.draw(iaVar.j[i11]);
                                            background.setBounds(bounds);
                                            view.draw(iaVar.j[i11]);
                                        }
                                        view.setTag(67108867, null);
                                        iaVar.j[i11].restore();
                                    }
                                    iaVar.q = r6Var.getMeasuredHeight();
                                    iaVar.r = r6Var.getMeasuredWidth();
                                    iaVar.v.b = r6Var.getMeasuredWidth();
                                    iaVar.v.c = r6Var.getMeasuredHeight();
                                    org.telegram.ui.Components.ha haVar = iaVar.v;
                                    if (haVar.b != 0 && haVar.c != 0) {
                                        if (iaVar.a == null) {
                                            iaVar.a = new DispatchQueue("blur_thread_" + iaVar);
                                        }
                                        iaVar.a.postRunnable(iaVar.v);
                                        break;
                                    } else {
                                        iaVar.k = false;
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
                q30 q30Var = (q30) this.c;
                boolean z12 = q30Var.y;
                if (z12) {
                    float f15 = q30Var.E;
                    if (f15 != 1.0f) {
                        float f16 = f15 + 0.064f;
                        q30Var.E = f16;
                        if (f16 > 1.0f) {
                            q30Var.E = 1.0f;
                        }
                        invalidate();
                        paint7.setColor(i0.a.d(q30Var.E, 1711607061, 1714752530));
                        canvas.drawCircle(getMeasuredWidth() / 2.0f, (getMeasuredHeight() / 2.0f) - AndroidUtilities.dp(25.0f), (AndroidUtilities.dp(5.0f) * q30Var.E) + AndroidUtilities.dp(35.0f), paint7);
                        break;
                    }
                }
                if (!z12) {
                    float f17 = q30Var.E;
                    if (f17 != 0.0f) {
                        float f18 = f17 - 0.064f;
                        q30Var.E = f18;
                        if (f18 < 0.0f) {
                            q30Var.E = 0.0f;
                        }
                        invalidate();
                    }
                }
                paint7.setColor(i0.a.d(q30Var.E, 1711607061, 1714752530));
                canvas.drawCircle(getMeasuredWidth() / 2.0f, (getMeasuredHeight() / 2.0f) - AndroidUtilities.dp(25.0f), (AndroidUtilities.dp(5.0f) * q30Var.E) + AndroidUtilities.dp(35.0f), paint7);
            case 7:
                canvas.drawColor(855638016);
                x90 x90Var = (x90) this.c;
                FrameLayout frameLayout = x90Var.n;
                FrameLayout frameLayout2 = (FrameLayout) this.b;
                float[] fArr = x90Var.I;
                x90.a(frameLayout, frameLayout2, fArr);
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
                qs qsVar = (qs) this.c;
                org.telegram.ui.Components.y9 y9Var2 = qsVar.e;
                if (y9Var2 != null && y9Var2.getImageReceiver().hasNotThumb()) {
                    paint8.setAlpha((int) (qsVar.e.getImageReceiver().getCurrentAlpha() * 85.0f));
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
                j70 j70Var = (j70) this.c;
                if (j70Var.d != null && j70Var.n.getVisibility() == 0 && j70Var.d.getImageReceiver().hasNotThumb()) {
                    paint9.setAlpha((int) (j70Var.n.getAlpha() * j70Var.d.getImageReceiver().getCurrentAlpha() * 85.0f));
                    canvas.drawCircle(getMeasuredWidth() / 2.0f, getMeasuredHeight() / 2.0f, getMeasuredWidth() / 2.0f, paint9);
                    break;
                }
                break;
            case 12:
                Paint paint10 = (Paint) this.b;
                gf0 gf0Var = (gf0) this.c;
                org.telegram.ui.kd kdVar = gf0Var.r;
                ai.z5 z5Var3 = gf0Var.e;
                if (z5Var3 != null && kdVar.getVisibility() == 0) {
                    paint10.setAlpha((int) (kdVar.getAlpha() * z5Var3.getImageReceiver().getCurrentAlpha() * 85.0f));
                    canvas.drawCircle(getMeasuredWidth() / 2.0f, getMeasuredHeight() / 2.0f, getMeasuredWidth() / 2.0f, paint10);
                    break;
                }
                break;
            case 13:
                if (((k71) this.c).Q0) {
                    canvas.drawColor(org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.G8, (org.telegram.ui.ActionBar.e6) this.b));
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
                int i12 = org.telegram.ui.ActionBar.i6.s8;
                e6Var = ((org.telegram.ui.ActionBar.n2) i91Var).resourceProvider;
                paint11.setColor(org.telegram.ui.ActionBar.i6.w0(i12, e6Var));
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
                int i13 = org.telegram.ui.ActionBar.i6.Ae;
                paint12.setColor(xd1Var.d ? org.telegram.ui.ActionBar.i6.D0(i13) : xd1Var.getThemedColor(i13));
                int i14 = 0;
                while (i14 < 2) {
                    paint12.setAlpha(i14 == currentItem ? 255 : 127);
                    canvas.drawCircle(AndroidUtilities.dp((i14 * 15) + 3), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(3.0f), paint12);
                    i14++;
                }
                break;
            case 16:
                Paint paint13 = (Paint) this.b;
                paint13.setColor(org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.d6, false));
                int measuredHeight2 = getMeasuredHeight() - AndroidUtilities.dp(3.0f);
                canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), measuredHeight2, paint13);
                d5Var = ((org.telegram.ui.ActionBar.n2) ((ih1) this.c)).parentLayout;
                ((ActionBarLayout) d5Var).q(canvas, measuredHeight2);
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
            case 4:
                super.onSizeChanged(i10, i11, i12, i13);
                org.telegram.ui.Components.ia iaVar = (org.telegram.ui.Components.ia) this.b;
                r6 r6Var = iaVar.d;
                if (iaVar.g != null && r6Var.getMeasuredHeight() != 0 && r6Var.getMeasuredWidth() != 0) {
                    iaVar.a();
                    iaVar.q = r6Var.getMeasuredHeight();
                    iaVar.r = r6Var.getMeasuredWidth();
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
                ((q30) this.c).d.setAlpha(f7);
                break;
        }
    }

    @Override // android.view.View
    public void setScaleX(float f7) {
        switch (this.a) {
            case 6:
                super.setScaleX(f7);
                ((q30) this.c).d.setScaleX(f7);
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
                ((q30) this.c).d.setScaleY(f7);
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
                ((q30) this.c).d.setTranslationY(f7);
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
                return drawable == ((hh0) this.c) || super.verifyDrawable(drawable);
            default:
                return super.verifyDrawable(drawable);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r6(Context context, org.telegram.ui.ActionBar.d5 d5Var) {
        super(context);
        this.a = 11;
        this.c = new me.b(0, this, hs.h, 380L, true);
        this.b = d5Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r6(Activity activity) {
        super(activity);
        this.a = 0;
        Paint paint = new Paint(1);
        this.b = paint;
        hh0 hh0Var = new hh0(10);
        this.c = hh0Var;
        paint.setColor(-1);
        paint.setShadowLayer(1.0f, 0.0f, 0.0f, 419430400);
        paint.setStyle(Paint.Style.STROKE);
        hh0Var.setCallback(this);
        hh0Var.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r6(fi.p pVar, Context context) {
        super(context);
        this.a = 1;
        this.c = pVar;
        this.b = new Paint(1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r6(q30 q30Var, Context context) {
        super(context);
        this.a = 6;
        this.c = q30Var;
        this.b = new Paint(1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r6(i91 i91Var, Context context) {
        super(context);
        this.a = 14;
        this.c = i91Var;
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
    public r6(ih1 ih1Var, Context context) {
        super(context);
        this.a = 16;
        this.c = ih1Var;
        this.b = new Paint();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r6(Context context, xd1 xd1Var) {
        super(context);
        this.a = 15;
        this.c = xd1Var;
        this.b = new Paint(1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r6(zn znVar, Context context) {
        super(context);
        this.a = 3;
        this.c = znVar;
        this.b = new RectF();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r6(zn znVar, Context context, View view, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context);
        this.a = 4;
        this.c = znVar;
        org.telegram.ui.Components.ia iaVar = new org.telegram.ui.Components.ia(view, this, e6Var);
        this.b = iaVar;
        iaVar.p = false;
        iaVar.n = true;
    }

    @Override // me.d
    public /* synthetic */ void A(float f7, int i10) {
    }
}
