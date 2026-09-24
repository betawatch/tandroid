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
import org.telegram.ui.Components.a30;
import org.telegram.ui.Components.g90;
import org.telegram.ui.Components.pg;
import org.telegram.ui.Components.pg0;
import org.telegram.ui.Components.rr;
import org.telegram.ui.a71;
import org.telegram.ui.bf0;
import org.telegram.ui.g70;
import org.telegram.ui.ms;
import org.telegram.ui.od1;
import org.telegram.ui.ro;
import org.telegram.ui.rz;
import org.telegram.ui.un;
import org.telegram.ui.wn;
import org.telegram.ui.wz;
import org.telegram.ui.z81;
import org.telegram.ui.zg1;

/* compiled from: r8-map-id-b07cfdfd75409cd6350aa76f4fec680e8237f25f7a223b1e5148659feab2c2d2 */
/* loaded from: classes4.dex */
public final class r6 extends View implements le.e {
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

    @Override // le.e
    public void D(int i10, float f7, float f10, le.f fVar) {
        setVisibility(f7 > 0.0f ? 0 : 8);
        setAlpha(f7);
    }

    public boolean a() {
        org.telegram.ui.Components.fa faVar = (org.telegram.ui.Components.fa) this.b;
        if (faVar.t) {
            return (faVar.m == 1.0f || !faVar.p) && faVar.n && faVar.d.getAlpha() == 1.0f && getVisibility() == 0;
        }
        return false;
    }

    public void b(boolean z10, boolean z11) {
        ((le.c) this.c).a(z10, z11);
    }

    @Override // android.view.View
    public void dispatchDraw(Canvas canvas) {
        switch (this.a) {
            case 3:
                RectF rectF = (RectF) this.b;
                rectF.set(0.0f, 0.0f, getWidth(), getHeight());
                int measuredWidth = getMeasuredWidth();
                wn wnVar = (wn) this.c;
                int backgroundSizeY = wnVar.X0.getBackgroundSizeY();
                float x10 = getX();
                float P8 = wnVar.P8(this);
                un unVar = wnVar.ea;
                if (unVar != null) {
                    unVar.m(x10, P8, measuredWidth, backgroundSizeY);
                } else {
                    org.telegram.ui.ActionBar.h6.q(x10, P8, measuredWidth, backgroundSizeY);
                }
                canvas.drawRoundRect(rectF, AndroidUtilities.dp(18.0f), AndroidUtilities.dp(18.0f), wnVar.getThemedPaint("paintChatActionBackground"));
                un unVar2 = wnVar.ea;
                if (unVar2 == null ? org.telegram.ui.ActionBar.h6.a1() : unVar2.p0()) {
                    canvas.drawRoundRect(rectF, AndroidUtilities.dp(18.0f), AndroidUtilities.dp(18.0f), wnVar.getThemedPaint("paintChatActionBackgroundDarken"));
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
        float f7;
        float f10;
        char c10;
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.ActionBar.d6 d6Var;
        org.telegram.ui.ActionBar.b5 b5Var;
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
                Paint paint3 = (Paint) this.b;
                org.telegram.ui.ld ldVar = (org.telegram.ui.ld) this.c;
                ai.y5 y5Var = ldVar.e;
                if (y5Var != null && y5Var.getImageReceiver().hasNotThumb()) {
                    paint3.setAlpha((int) (ldVar.r.getAlpha() * ldVar.e.getImageReceiver().getCurrentAlpha() * 85.0f));
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
                org.telegram.ui.Components.fa faVar = (org.telegram.ui.Components.fa) this.b;
                Paint paint4 = faVar.x;
                org.telegram.ui.ActionBar.d6 d6Var2 = faVar.y;
                Paint paint5 = faVar.w;
                int i10 = faVar.b;
                View view = faVar.c;
                r6 r6Var = faVar.d;
                if (r6Var != null) {
                    if (r6Var.getMeasuredHeight() != 0 || r6Var.getMeasuredWidth() != 0) {
                        if (i10 == 1 && !faVar.t && !faVar.p) {
                            faVar.a();
                            faVar.l = false;
                        }
                        Bitmap[] bitmapArr2 = faVar.g;
                        if ((bitmapArr2 != null || faVar.o) && faVar.p) {
                            boolean z10 = faVar.n;
                            if (z10) {
                                float f11 = faVar.m;
                                if (f11 != 1.0f) {
                                    float f12 = f11 + 0.09f;
                                    faVar.m = f12;
                                    if (f12 > 1.0f) {
                                        faVar.m = 1.0f;
                                    }
                                    r6Var.invalidate();
                                }
                            }
                            if (!z10) {
                                float f13 = faVar.m;
                                if (f13 != 0.0f) {
                                    float f14 = f13 - 0.09f;
                                    faVar.m = f14;
                                    if (f14 < 0.0f) {
                                        faVar.m = 0.0f;
                                    }
                                    r6Var.invalidate();
                                }
                            }
                        }
                        float f15 = faVar.p ? faVar.m : 1.0f;
                        if (bitmapArr2 == null && faVar.o) {
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
                                if (i10 == r02) {
                                    canvas.translate(f7, faVar.u);
                                }
                                canvas.save();
                                canvas.scale(r6Var.getMeasuredWidth() / bitmapArr[r02].getWidth(), r6Var.getMeasuredHeight() / bitmapArr[r02].getHeight());
                                canvas.drawBitmap(bitmapArr[r02], f7, f7, paint5);
                                canvas.restore();
                                canvas.save();
                                if (i10 == 0) {
                                    canvas.translate(f7, faVar.u);
                                }
                                canvas.scale(r6Var.getMeasuredWidth() / bitmapArr[c10].getWidth(), faVar.s / bitmapArr[c10].getHeight());
                                canvas.drawBitmap(bitmapArr[c10], f7, f7, paint5);
                                canvas.restore();
                                faVar.t = r02;
                                canvas.drawColor(436207616);
                            }
                            canvas.restore();
                            if (faVar.n && !faVar.k) {
                                if (faVar.g == null || faVar.l) {
                                    faVar.k = r02;
                                    faVar.l = false;
                                    if (faVar.e == null) {
                                        faVar.e = new Bitmap[2];
                                        faVar.j = new Canvas[2];
                                    }
                                    for (int i11 = 0; i11 < 2; i11++) {
                                        if (faVar.e[i11] != null && r6Var.getMeasuredWidth() == faVar.r && r6Var.getMeasuredHeight() == faVar.q) {
                                            faVar.e[i11].eraseColor(0);
                                        } else {
                                            int measuredHeight = r6Var.getMeasuredHeight();
                                            int measuredWidth = r6Var.getMeasuredWidth();
                                            int dp = AndroidUtilities.dp(200.0f) + AndroidUtilities.statusBarHeight;
                                            faVar.s = dp;
                                            if (i11 == 0) {
                                                measuredHeight = dp;
                                            }
                                            try {
                                                faVar.e[i11] = Bitmap.createBitmap((int) (measuredWidth / 15.0f), (int) (measuredHeight / 15.0f), Bitmap.Config.ARGB_8888);
                                                faVar.j[i11] = new Canvas(faVar.e[i11]);
                                            } catch (Exception e) {
                                                FileLog.e(e);
                                                AndroidUtilities.runOnUIThread(new pg(faVar, 11));
                                                return;
                                            }
                                        }
                                        if (i11 == r02) {
                                            faVar.e[i11].eraseColor(org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.d6, d6Var2));
                                        }
                                        faVar.j[i11].save();
                                        faVar.j[i11].scale(0.06666667f, 0.06666667f, f7, f7);
                                        Drawable background = view.getBackground();
                                        if (background == null) {
                                            background = d6Var2 instanceof un ? ((un) d6Var2).d() : org.telegram.ui.ActionBar.h6.s0();
                                        }
                                        view.setTag(67108867, Integer.valueOf(i11));
                                        if (i11 == 0) {
                                            faVar.j[i11].translate(f7, -faVar.u);
                                            view.draw(faVar.j[i11]);
                                        }
                                        if (background != null && i11 == r02) {
                                            Rect bounds = background.getBounds();
                                            background.setBounds(0, 0, view.getMeasuredWidth(), view.getMeasuredHeight());
                                            background.draw(faVar.j[i11]);
                                            background.setBounds(bounds);
                                            view.draw(faVar.j[i11]);
                                        }
                                        view.setTag(67108867, null);
                                        faVar.j[i11].restore();
                                    }
                                    faVar.q = r6Var.getMeasuredHeight();
                                    faVar.r = r6Var.getMeasuredWidth();
                                    faVar.v.b = r6Var.getMeasuredWidth();
                                    faVar.v.c = r6Var.getMeasuredHeight();
                                    org.telegram.ui.Components.ea eaVar = faVar.v;
                                    if (eaVar.b != 0 && eaVar.c != 0) {
                                        if (faVar.a == null) {
                                            faVar.a = new DispatchQueue("blur_thread_" + faVar);
                                        }
                                        faVar.a.postRunnable(faVar.v);
                                        break;
                                    } else {
                                        faVar.k = false;
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
                ro roVar = (ro) this.c;
                ai.y5 y5Var2 = roVar.e;
                if (y5Var2 != null && y5Var2.getImageReceiver().hasNotThumb()) {
                    paint6.setAlpha((int) (roVar.e.getImageReceiver().getCurrentAlpha() * 85.0f));
                    canvas.drawCircle(getMeasuredWidth() / 2.0f, getMeasuredHeight() / 2.0f, getMeasuredWidth() / 2.0f, paint6);
                    break;
                }
                break;
            case 6:
                Paint paint7 = (Paint) this.b;
                a30 a30Var = (a30) this.c;
                boolean z11 = a30Var.y;
                if (z11) {
                    float f16 = a30Var.E;
                    if (f16 != 1.0f) {
                        float f17 = f16 + 0.064f;
                        a30Var.E = f17;
                        if (f17 > 1.0f) {
                            a30Var.E = 1.0f;
                        }
                        invalidate();
                        paint7.setColor(i0.a.d(a30Var.E, 1711607061, 1714752530));
                        canvas.drawCircle(getMeasuredWidth() / 2.0f, (getMeasuredHeight() / 2.0f) - AndroidUtilities.dp(25.0f), (AndroidUtilities.dp(5.0f) * a30Var.E) + AndroidUtilities.dp(35.0f), paint7);
                        break;
                    }
                }
                if (!z11) {
                    float f18 = a30Var.E;
                    if (f18 != 0.0f) {
                        float f19 = f18 - 0.064f;
                        a30Var.E = f19;
                        if (f19 < 0.0f) {
                            a30Var.E = 0.0f;
                        }
                        invalidate();
                    }
                }
                paint7.setColor(i0.a.d(a30Var.E, 1711607061, 1714752530));
                canvas.drawCircle(getMeasuredWidth() / 2.0f, (getMeasuredHeight() / 2.0f) - AndroidUtilities.dp(25.0f), (AndroidUtilities.dp(5.0f) * a30Var.E) + AndroidUtilities.dp(35.0f), paint7);
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
                ms msVar = (ms) this.c;
                org.telegram.ui.Components.w9 w9Var2 = msVar.e;
                if (w9Var2 != null && w9Var2.getImageReceiver().hasNotThumb()) {
                    paint8.setAlpha((int) (msVar.e.getImageReceiver().getCurrentAlpha() * 85.0f));
                    canvas.drawCircle(getMeasuredWidth() / 2.0f, getMeasuredHeight() / 2.0f, getMeasuredWidth() / 2.0f, paint8);
                    break;
                }
                break;
            case 9:
                canvas.drawColor(855638016);
                wz wzVar = (wz) this.c;
                FrameLayout frameLayout3 = wzVar.a;
                FrameLayout frameLayout4 = (FrameLayout) this.b;
                float[] fArr2 = wzVar.y;
                rz.a(frameLayout3, frameLayout4, fArr2);
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
                g70 g70Var = (g70) this.c;
                if (g70Var.d != null && g70Var.n.getVisibility() == 0 && g70Var.d.getImageReceiver().hasNotThumb()) {
                    paint9.setAlpha((int) (g70Var.n.getAlpha() * g70Var.d.getImageReceiver().getCurrentAlpha() * 85.0f));
                    canvas.drawCircle(getMeasuredWidth() / 2.0f, getMeasuredHeight() / 2.0f, getMeasuredWidth() / 2.0f, paint9);
                    break;
                }
                break;
            case 12:
                Paint paint10 = (Paint) this.b;
                bf0 bf0Var = (bf0) this.c;
                org.telegram.ui.jd jdVar = bf0Var.r;
                ai.y5 y5Var3 = bf0Var.e;
                if (y5Var3 != null && jdVar.getVisibility() == 0) {
                    paint10.setAlpha((int) (jdVar.getAlpha() * y5Var3.getImageReceiver().getCurrentAlpha() * 85.0f));
                    canvas.drawCircle(getMeasuredWidth() / 2.0f, getMeasuredHeight() / 2.0f, getMeasuredWidth() / 2.0f, paint10);
                    break;
                }
                break;
            case 13:
                if (((a71) this.c).Q0) {
                    canvas.drawColor(org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.G8, (org.telegram.ui.ActionBar.d6) this.b));
                    break;
                } else {
                    dispatchDraw(canvas);
                    break;
                }
            case 14:
                z81 z81Var = (z81) this.c;
                kVar = ((org.telegram.ui.ActionBar.m2) z81Var).actionBar;
                int height = kVar.getHeight();
                Rect rect = AndroidUtilities.rectTmp2;
                rect.set(0, 0, getMeasuredWidth(), height);
                Paint paint11 = (Paint) this.b;
                int i12 = org.telegram.ui.ActionBar.h6.s8;
                d6Var = ((org.telegram.ui.ActionBar.m2) z81Var).resourceProvider;
                paint11.setColor(org.telegram.ui.ActionBar.h6.v0(i12, d6Var));
                z81Var.b.J(canvas, 0.0f, rect, paint11, true);
                if (z81Var.getParentLayout() != null) {
                    ((ActionBarLayout) z81Var.getParentLayout()).q(canvas, height);
                    break;
                }
                break;
            case 15:
                od1 od1Var = (od1) this.c;
                int currentItem = od1Var.j0.getCurrentItem();
                Paint paint12 = (Paint) this.b;
                int i13 = org.telegram.ui.ActionBar.h6.Ae;
                paint12.setColor(od1Var.d ? org.telegram.ui.ActionBar.h6.C0(i13) : od1Var.getThemedColor(i13));
                int i14 = 0;
                while (i14 < 2) {
                    paint12.setAlpha(i14 == currentItem ? 255 : 127);
                    canvas.drawCircle(AndroidUtilities.dp((i14 * 15) + 3), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(3.0f), paint12);
                    i14++;
                }
                break;
            case 16:
                Paint paint13 = (Paint) this.b;
                paint13.setColor(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.d6, false));
                int measuredHeight2 = getMeasuredHeight() - AndroidUtilities.dp(3.0f);
                canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), measuredHeight2, paint13);
                b5Var = ((org.telegram.ui.ActionBar.m2) ((zg1) this.c)).parentLayout;
                ((ActionBarLayout) b5Var).q(canvas, measuredHeight2);
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
                org.telegram.ui.Components.fa faVar = (org.telegram.ui.Components.fa) this.b;
                r6 r6Var = faVar.d;
                if (faVar.g != null && r6Var.getMeasuredHeight() != 0 && r6Var.getMeasuredWidth() != 0) {
                    faVar.a();
                    faVar.q = r6Var.getMeasuredHeight();
                    faVar.r = r6Var.getMeasuredWidth();
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
                View view = ((wn) this.c).fragmentView;
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
                ((a30) this.c).d.setAlpha(f7);
                break;
        }
    }

    @Override // android.view.View
    public void setScaleX(float f7) {
        switch (this.a) {
            case 6:
                super.setScaleX(f7);
                ((a30) this.c).d.setScaleX(f7);
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
                ((a30) this.c).d.setScaleY(f7);
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
                ((a30) this.c).d.setTranslationY(f7);
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
                return drawable == ((pg0) this.c) || super.verifyDrawable(drawable);
            default:
                return super.verifyDrawable(drawable);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r6(Context context, org.telegram.ui.ActionBar.b5 b5Var) {
        super(context);
        this.a = 11;
        this.c = new le.c(0, this, rr.h, 380L, true);
        this.b = b5Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r6(Activity activity) {
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
    public r6(fi.p pVar, Context context) {
        super(context);
        this.a = 1;
        this.c = pVar;
        this.b = new Paint(1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r6(a30 a30Var, Context context) {
        super(context);
        this.a = 6;
        this.c = a30Var;
        this.b = new Paint(1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r6(z81 z81Var, Context context) {
        super(context);
        this.a = 14;
        this.c = z81Var;
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
    public r6(zg1 zg1Var, Context context) {
        super(context);
        this.a = 16;
        this.c = zg1Var;
        this.b = new Paint();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r6(Context context, od1 od1Var) {
        super(context);
        this.a = 15;
        this.c = od1Var;
        this.b = new Paint(1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r6(wn wnVar, Context context) {
        super(context);
        this.a = 3;
        this.c = wnVar;
        this.b = new RectF();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r6(wn wnVar, Context context, View view, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context);
        this.a = 4;
        this.c = wnVar;
        org.telegram.ui.Components.fa faVar = new org.telegram.ui.Components.fa(view, this, d6Var);
        this.b = faVar;
        faVar.p = false;
        faVar.n = true;
    }

    @Override // le.e
    public /* synthetic */ void C(float f7, int i10) {
    }
}
