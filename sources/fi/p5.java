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
import org.telegram.messenger.qs;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.Components.ie0;
import org.telegram.ui.Components.q10;
import org.telegram.ui.Components.r70;
import org.telegram.ui.Components.uq;
import org.telegram.ui.Components.xf;
import org.telegram.ui.Components.xq;
import org.telegram.ui.an;
import org.telegram.ui.ay;
import org.telegram.ui.b20;
import org.telegram.ui.bb1;
import org.telegram.ui.bd;
import org.telegram.ui.cn;
import org.telegram.ui.f50;
import org.telegram.ui.gy;
import org.telegram.ui.pr;
import org.telegram.ui.rc0;
import org.telegram.ui.rn;
import org.telegram.ui.s11;
import org.telegram.ui.w71;
import org.telegram.ui.zc;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final class p5 extends View implements te.b {
    public final /* synthetic */ int a;
    public Object b;
    public final Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ p5(Object obj, Context context, Object obj2, int i7) {
        super(context);
        this.a = i7;
        this.c = obj;
        this.b = obj2;
    }

    @Override // te.b
    public void Y(int i7, float f10, float f11, te.c cVar) {
        setVisibility(f10 > 0.0f ? 0 : 8);
        setAlpha(f10);
    }

    public boolean a() {
        org.telegram.ui.Components.w9 w9Var = (org.telegram.ui.Components.w9) this.b;
        if (w9Var.t) {
            return (w9Var.m == 1.0f || !w9Var.p) && w9Var.n && w9Var.d.getAlpha() == 1.0f && getVisibility() == 0;
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
                cn cnVar = (cn) this.c;
                int backgroundSizeY = cnVar.l1.getBackgroundSizeY();
                float x10 = getX();
                float k92 = cnVar.k9(this);
                an anVar = cnVar.za;
                if (anVar != null) {
                    anVar.b(x10, k92, measuredWidth, backgroundSizeY);
                } else {
                    org.telegram.ui.ActionBar.l6.r(x10, k92, measuredWidth, backgroundSizeY);
                }
                canvas.drawRoundRect(rectF, org.telegram.messenger.g0.L(18.0f), org.telegram.messenger.g0.L(18.0f), cnVar.getThemedPaint("paintChatActionBackground"));
                an anVar2 = cnVar.za;
                if (anVar2 == null ? org.telegram.ui.ActionBar.l6.d1() : anVar2.g()) {
                    canvas.drawRoundRect(rectF, org.telegram.messenger.g0.L(18.0f), org.telegram.messenger.g0.L(18.0f), cnVar.getThemedPaint("paintChatActionBackgroundDarken"));
                }
                super.dispatchDraw(canvas);
                break;
            case 9:
                b20 b20Var = (b20) this.c;
                float measuredWidth2 = b20Var.d0.getMeasuredWidth();
                uq uqVar = b20Var.c0;
                float measuredWidth3 = (b20Var.e0.getMeasuredWidth() * uqVar.g) + ((1.0f - uqVar.g) * measuredWidth2);
                canvas.save();
                org.telegram.ui.Cells.y yVar = (org.telegram.ui.Cells.y) this.b;
                yVar.setBounds(0, 0, org.telegram.messenger.g0.L(50.0f) + ((int) measuredWidth3), getMeasuredHeight());
                yVar.draw(canvas);
                super.dispatchDraw(canvas);
                break;
            case 13:
                super.dispatchDraw(canvas);
                ((ActionBarLayout) ((org.telegram.ui.ActionBar.q4) this.b)).q(canvas, 0);
                break;
            default:
                super.dispatchDraw(canvas);
                break;
        }
    }

    @Override // android.view.View
    public void drawableStateChanged() {
        switch (this.a) {
            case 9:
                super.drawableStateChanged();
                ((org.telegram.ui.Cells.y) this.b).setState(getDrawableState());
                break;
            default:
                super.drawableStateChanged();
                break;
        }
    }

    @Override // android.view.View
    public void jumpDrawablesToCurrentState() {
        switch (this.a) {
            case 9:
                super.jumpDrawablesToCurrentState();
                ((org.telegram.ui.Cells.y) this.b).jumpToCurrentState();
                break;
            default:
                super.jumpDrawablesToCurrentState();
                break;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r15v1 */
    /* JADX WARN: Type inference failed for: r15v2, types: [boolean] */
    /* JADX WARN: Type inference failed for: r15v3 */
    /* JADX WARN: Type inference failed for: r16v1 */
    /* JADX WARN: Type inference failed for: r16v2 */
    /* JADX WARN: Type inference failed for: r16v3 */
    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        Bitmap[] bitmapArr;
        float f10;
        boolean z9;
        ?? r15;
        org.telegram.ui.ActionBar.q4 q4Var;
        switch (this.a) {
            case 0:
                Paint paint = (Paint) this.b;
                paint.setStrokeWidth(org.telegram.messenger.g0.N(1.66f));
                canvas.drawCircle(getWidth() / 2.0f, getHeight() / 2.0f, org.telegram.messenger.g0.L(10.0f), paint);
                ie0 ie0Var = (ie0) this.c;
                ie0Var.setBounds(0, 0, org.telegram.messenger.g0.L(10.0f), org.telegram.messenger.g0.L(10.0f));
                canvas.save();
                canvas.translate((getWidth() - org.telegram.messenger.g0.L(10.0f)) / 2.0f, (getHeight() - org.telegram.messenger.g0.L(10.0f)) / 2.0f);
                ie0Var.draw(canvas);
                canvas.restore();
                break;
            case 1:
                Paint paint2 = (Paint) this.b;
                ii.p pVar = (ii.p) this.c;
                org.telegram.ui.Components.l9 l9Var = pVar.x;
                if (l9Var != null && l9Var.getImageReceiver().L()) {
                    paint2.setColor(1426063360);
                    paint2.setAlpha((int) (pVar.x.getImageReceiver().h1 * 85.0f));
                    canvas.drawRoundRect(0.0f, 0.0f, getWidth(), getHeight(), org.telegram.messenger.g0.L(20.0f), org.telegram.messenger.g0.L(20.0f), paint2);
                    break;
                }
                break;
            case 2:
                super.onDraw(canvas);
                int paddingLeft = getPaddingLeft();
                float width = ((getWidth() - paddingLeft) - getPaddingRight()) / 7.0f;
                for (int i7 = 0; i7 < 7; i7++) {
                    canvas.drawText(((String[]) this.b)[i7], (width / 2.0f) + (i7 * width) + paddingLeft, ((getMeasuredHeight() - org.telegram.messenger.g0.L(2.0f)) / 2.0f) + org.telegram.messenger.g0.L(5.0f), ((org.telegram.ui.h8) this.c).f);
                }
                break;
            case 3:
                Paint paint3 = (Paint) this.b;
                bd bdVar = (bd) this.c;
                di.d4 d4Var = bdVar.f;
                if (d4Var != null && d4Var.getImageReceiver().L()) {
                    paint3.setAlpha((int) (bdVar.s.getAlpha() * bdVar.f.getImageReceiver().h1 * 85.0f));
                    canvas.drawCircle(getMeasuredWidth() / 2.0f, getMeasuredHeight() / 2.0f, getMeasuredWidth() / 2.0f, paint3);
                    break;
                }
                break;
            case 4:
            case 9:
            case 13:
            default:
                super.onDraw(canvas);
                break;
            case 5:
                org.telegram.ui.Components.w9 w9Var = (org.telegram.ui.Components.w9) this.b;
                Paint paint4 = w9Var.x;
                org.telegram.ui.ActionBar.g6 g6Var = w9Var.y;
                Paint paint5 = w9Var.w;
                int i10 = w9Var.b;
                View view = w9Var.c;
                p5 p5Var = w9Var.d;
                if (p5Var != null) {
                    if (p5Var.getMeasuredHeight() != 0 || p5Var.getMeasuredWidth() != 0) {
                        if (i10 == 1 && !w9Var.t && !w9Var.p) {
                            w9Var.a();
                            w9Var.l = false;
                        }
                        Bitmap[] bitmapArr2 = w9Var.g;
                        if ((bitmapArr2 != null || w9Var.o) && w9Var.p) {
                            boolean z10 = w9Var.n;
                            if (z10) {
                                float f11 = w9Var.m;
                                if (f11 != 1.0f) {
                                    float f12 = f11 + 0.09f;
                                    w9Var.m = f12;
                                    if (f12 > 1.0f) {
                                        w9Var.m = 1.0f;
                                    }
                                    p5Var.invalidate();
                                }
                            }
                            if (!z10) {
                                float f13 = w9Var.m;
                                if (f13 != 0.0f) {
                                    float f14 = f13 - 0.09f;
                                    w9Var.m = f14;
                                    if (f14 < 0.0f) {
                                        w9Var.m = 0.0f;
                                    }
                                    p5Var.invalidate();
                                }
                            }
                        }
                        float f15 = w9Var.p ? w9Var.m : 1.0f;
                        if (bitmapArr2 == null && w9Var.o) {
                            paint4.setAlpha((int) (50.0f * f15));
                            canvas.drawPaint(paint4);
                            break;
                        } else {
                            if (f15 == 1.0f) {
                                canvas.save();
                                bitmapArr = bitmapArr2;
                                f10 = 0.0f;
                                z9 = 0;
                                r15 = 1;
                            } else {
                                bitmapArr = bitmapArr2;
                                f10 = 0.0f;
                                z9 = 0;
                                r15 = 1;
                                canvas.saveLayerAlpha(0.0f, 0.0f, p5Var.getMeasuredWidth(), p5Var.getMeasuredHeight(), (int) (f15 * 255.0f), 31);
                            }
                            if (bitmapArr != null) {
                                paint5.setAlpha((int) (f15 * 255.0f));
                                if (i10 == r15) {
                                    canvas.translate(f10, w9Var.u);
                                }
                                canvas.save();
                                canvas.scale(p5Var.getMeasuredWidth() / bitmapArr[r15].getWidth(), p5Var.getMeasuredHeight() / bitmapArr[r15].getHeight());
                                canvas.drawBitmap(bitmapArr[r15], f10, f10, paint5);
                                canvas.restore();
                                canvas.save();
                                if (i10 == 0) {
                                    canvas.translate(f10, w9Var.u);
                                }
                                canvas.scale(p5Var.getMeasuredWidth() / bitmapArr[z9].getWidth(), w9Var.s / bitmapArr[z9].getHeight());
                                canvas.drawBitmap(bitmapArr[z9], f10, f10, paint5);
                                canvas.restore();
                                w9Var.t = r15;
                                canvas.drawColor(436207616);
                            }
                            canvas.restore();
                            if (w9Var.n && !w9Var.k) {
                                if (w9Var.g == null || w9Var.l) {
                                    w9Var.k = r15;
                                    w9Var.l = z9;
                                    if (w9Var.e == null) {
                                        w9Var.e = new Bitmap[2];
                                        w9Var.j = new Canvas[2];
                                    }
                                    for (int i11 = 0; i11 < 2; i11++) {
                                        if (w9Var.e[i11] != null && p5Var.getMeasuredWidth() == w9Var.r && p5Var.getMeasuredHeight() == w9Var.q) {
                                            w9Var.e[i11].eraseColor(0);
                                        } else {
                                            int measuredHeight = p5Var.getMeasuredHeight();
                                            int measuredWidth = p5Var.getMeasuredWidth();
                                            int L = org.telegram.messenger.g0.L(200.0f) + org.telegram.messenger.g0.m;
                                            w9Var.s = L;
                                            if (i11 == 0) {
                                                measuredHeight = L;
                                            }
                                            try {
                                                w9Var.e[i11] = Bitmap.createBitmap((int) (measuredWidth / 15.0f), (int) (measuredHeight / 15.0f), Bitmap.Config.ARGB_8888);
                                                w9Var.j[i11] = new Canvas(w9Var.e[i11]);
                                            } catch (Exception e10) {
                                                org.telegram.messenger.a8.g(e10, r15);
                                                org.telegram.messenger.g0.h3(new xf(w9Var, 11));
                                                return;
                                            }
                                        }
                                        if (i11 == r15) {
                                            w9Var.e[i11].eraseColor(org.telegram.ui.ActionBar.l6.w0(org.telegram.ui.ActionBar.l6.d6, g6Var));
                                        }
                                        w9Var.j[i11].save();
                                        w9Var.j[i11].scale(0.06666667f, 0.06666667f, f10, f10);
                                        Drawable background = view.getBackground();
                                        if (background == null) {
                                            background = g6Var instanceof an ? ((an) g6Var).m() : org.telegram.ui.ActionBar.l6.t0();
                                        }
                                        view.setTag(67108867, Integer.valueOf(i11));
                                        if (i11 == 0) {
                                            w9Var.j[i11].translate(f10, -w9Var.u);
                                            view.draw(w9Var.j[i11]);
                                        }
                                        if (background != null && i11 == r15) {
                                            Rect bounds = background.getBounds();
                                            background.setBounds(0, 0, view.getMeasuredWidth(), view.getMeasuredHeight());
                                            background.draw(w9Var.j[i11]);
                                            background.setBounds(bounds);
                                            view.draw(w9Var.j[i11]);
                                        }
                                        view.setTag(67108867, null);
                                        w9Var.j[i11].restore();
                                    }
                                    w9Var.q = p5Var.getMeasuredHeight();
                                    w9Var.r = p5Var.getMeasuredWidth();
                                    w9Var.v.b = p5Var.getMeasuredWidth();
                                    w9Var.v.c = p5Var.getMeasuredHeight();
                                    org.telegram.ui.Components.v9 v9Var = w9Var.v;
                                    if (v9Var.b != 0 && v9Var.c != 0) {
                                        if (w9Var.a == null) {
                                            w9Var.a = new org.telegram.messenger.q5("blur_thread_" + w9Var, (boolean) r15);
                                        }
                                        w9Var.a.postRunnable(w9Var.v);
                                        break;
                                    } else {
                                        w9Var.k = false;
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
                rn rnVar = (rn) this.c;
                di.d4 d4Var2 = rnVar.e;
                if (d4Var2 != null && d4Var2.getImageReceiver().L()) {
                    paint6.setAlpha((int) (rnVar.e.getImageReceiver().h1 * 85.0f));
                    canvas.drawCircle(getMeasuredWidth() / 2.0f, getMeasuredHeight() / 2.0f, getMeasuredWidth() / 2.0f, paint6);
                    break;
                }
                break;
            case 7:
                Paint paint7 = (Paint) this.b;
                q10 q10Var = (q10) this.c;
                boolean z11 = q10Var.E;
                if (z11) {
                    float f16 = q10Var.F;
                    if (f16 != 1.0f) {
                        float f17 = f16 + 0.064f;
                        q10Var.F = f17;
                        if (f17 > 1.0f) {
                            q10Var.F = 1.0f;
                        }
                        invalidate();
                        paint7.setColor(i0.a.f(q10Var.F, 1711607061, 1714752530));
                        canvas.drawCircle(getMeasuredWidth() / 2.0f, (getMeasuredHeight() / 2.0f) - org.telegram.messenger.g0.L(25.0f), (org.telegram.messenger.g0.L(5.0f) * q10Var.F) + org.telegram.messenger.g0.L(35.0f), paint7);
                        break;
                    }
                }
                if (!z11) {
                    float f18 = q10Var.F;
                    if (f18 != 0.0f) {
                        float f19 = f18 - 0.064f;
                        q10Var.F = f19;
                        if (f19 < 0.0f) {
                            q10Var.F = 0.0f;
                        }
                        invalidate();
                    }
                }
                paint7.setColor(i0.a.f(q10Var.F, 1711607061, 1714752530));
                canvas.drawCircle(getMeasuredWidth() / 2.0f, (getMeasuredHeight() / 2.0f) - org.telegram.messenger.g0.L(25.0f), (org.telegram.messenger.g0.L(5.0f) * q10Var.F) + org.telegram.messenger.g0.L(35.0f), paint7);
            case 8:
                canvas.drawColor(855638016);
                r70 r70Var = (r70) this.c;
                FrameLayout frameLayout = r70Var.n;
                FrameLayout frameLayout2 = (FrameLayout) this.b;
                float[] fArr = r70Var.I;
                r70.a(frameLayout, frameLayout2, fArr);
                canvas.save();
                float y10 = frameLayout.getY() + ((View) frameLayout.getParent()).getY();
                if (y10 < 1.0f) {
                    canvas.clipRect(0.0f, (fArr[1] - y10) + 1.0f, getMeasuredWidth(), getMeasuredHeight());
                }
                canvas.translate(fArr[0], fArr[1]);
                frameLayout.draw(canvas);
                canvas.restore();
                break;
            case 10:
                Paint paint8 = (Paint) this.b;
                pr prVar = (pr) this.c;
                org.telegram.ui.Components.l9 l9Var2 = prVar.e;
                if (l9Var2 != null && l9Var2.getImageReceiver().L()) {
                    paint8.setAlpha((int) (prVar.e.getImageReceiver().h1 * 85.0f));
                    canvas.drawCircle(getMeasuredWidth() / 2.0f, getMeasuredHeight() / 2.0f, getMeasuredWidth() / 2.0f, paint8);
                    break;
                }
                break;
            case 11:
                canvas.drawColor(855638016);
                gy gyVar = (gy) this.c;
                FrameLayout frameLayout3 = gyVar.a;
                FrameLayout frameLayout4 = (FrameLayout) this.b;
                float[] fArr2 = gyVar.D;
                ay.a(frameLayout3, frameLayout4, fArr2);
                canvas.save();
                float y11 = frameLayout3.getY() + ((View) frameLayout3.getParent()).getY();
                if (y11 < 1.0f) {
                    canvas.clipRect(0.0f, (fArr2[1] - y11) + 1.0f, getMeasuredWidth(), getMeasuredHeight());
                }
                canvas.translate(fArr2[0], fArr2[1]);
                frameLayout3.draw(canvas);
                canvas.restore();
                break;
            case 12:
                Paint paint9 = (Paint) this.b;
                f50 f50Var = (f50) this.c;
                if (f50Var.d != null && f50Var.n.getVisibility() == 0 && f50Var.d.getImageReceiver().L()) {
                    paint9.setAlpha((int) (f50Var.n.getAlpha() * f50Var.d.getImageReceiver().h1 * 85.0f));
                    canvas.drawCircle(getMeasuredWidth() / 2.0f, getMeasuredHeight() / 2.0f, getMeasuredWidth() / 2.0f, paint9);
                    break;
                }
                break;
            case 14:
                Paint paint10 = (Paint) this.b;
                rc0 rc0Var = (rc0) this.c;
                zc zcVar = rc0Var.r;
                di.d4 d4Var3 = rc0Var.e;
                if (d4Var3 != null && zcVar.getVisibility() == 0) {
                    paint10.setAlpha((int) (zcVar.getAlpha() * d4Var3.getImageReceiver().h1 * 85.0f));
                    canvas.drawCircle(getMeasuredWidth() / 2.0f, getMeasuredHeight() / 2.0f, getMeasuredWidth() / 2.0f, paint10);
                    break;
                }
                break;
            case 15:
                if (((s11) this.c).Q0) {
                    canvas.drawColor(org.telegram.ui.ActionBar.l6.w0(org.telegram.ui.ActionBar.l6.G8, (org.telegram.ui.ActionBar.g6) this.b));
                    break;
                } else {
                    dispatchDraw(canvas);
                    break;
                }
            case 16:
                w71 w71Var = (w71) this.c;
                int currentItem = w71Var.k0.getCurrentItem();
                Paint paint11 = (Paint) this.b;
                int i12 = org.telegram.ui.ActionBar.l6.pf;
                paint11.setColor(w71Var.d ? org.telegram.ui.ActionBar.l6.F0(i12) : w71Var.getThemedColor(i12));
                int i13 = 0;
                while (i13 < 2) {
                    paint11.setAlpha(i13 == currentItem ? qs.e4 : qs.L1);
                    canvas.drawCircle(org.telegram.messenger.g0.L((i13 * 15) + 3), org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(3.0f), paint11);
                    i13++;
                }
                break;
            case 17:
                Paint paint12 = (Paint) this.b;
                paint12.setColor(org.telegram.ui.ActionBar.l6.x0(null, org.telegram.ui.ActionBar.l6.d6, false));
                int measuredHeight2 = getMeasuredHeight() - org.telegram.messenger.g0.L(3.0f);
                canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), measuredHeight2, paint12);
                q4Var = ((org.telegram.ui.ActionBar.f2) ((bb1) this.c)).parentLayout;
                ((ActionBarLayout) q4Var).q(canvas, measuredHeight2);
                break;
            case 18:
                super.onDraw(canvas);
                int save = canvas.save();
                canvas.scale(getWidth() / 336.0f, getHeight() / 205.0f);
                org.telegram.ui.Wallet.x5 x5Var = ((org.telegram.ui.Wallet.a6) this.c).b;
                if (x5Var != null) {
                    x5Var.e(canvas, (float[]) this.b);
                } else {
                    canvas.drawColor(org.telegram.ui.Wallet.o7.a(-16216082, (float[]) this.b));
                }
                canvas.restoreToCount(save);
                break;
            case 19:
                float measuredWidth2 = getMeasuredWidth() / 2.0f;
                float measuredHeight3 = getMeasuredHeight() / 2.0f;
                canvas.drawCircle(measuredWidth2, measuredHeight3, getMeasuredWidth() / 2.0f, (Paint) this.b);
                ia.e.d().f(-org.telegram.messenger.g0.L(10.0f), 0.0f, getMeasuredWidth(), getMeasuredHeight());
                canvas.drawCircle(measuredWidth2, measuredHeight3, (getMeasuredWidth() / 2.0f) - org.telegram.messenger.g0.L(2.0f), ia.e.d().e());
                float L2 = org.telegram.messenger.g0.L(18.0f) / 2.0f;
                Drawable drawable = (Drawable) this.c;
                drawable.setBounds((int) (measuredWidth2 - L2), (int) (measuredHeight3 - L2), (int) (measuredWidth2 + L2), (int) (measuredHeight3 + L2));
                drawable.draw(canvas);
                break;
        }
    }

    @Override // android.view.View
    public void onMeasure(int i7, int i10) {
        switch (this.a) {
            case 0:
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(56.0f), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(56.0f), TLObject.FLAG_30));
                break;
            default:
                super.onMeasure(i7, i10);
                break;
        }
    }

    @Override // android.view.View
    public void onSizeChanged(int i7, int i10, int i11, int i12) {
        switch (this.a) {
            case 5:
                super.onSizeChanged(i7, i10, i11, i12);
                org.telegram.ui.Components.w9 w9Var = (org.telegram.ui.Components.w9) this.b;
                p5 p5Var = w9Var.d;
                if (w9Var.g != null && p5Var.getMeasuredHeight() != 0 && p5Var.getMeasuredWidth() != 0) {
                    w9Var.a();
                    w9Var.q = p5Var.getMeasuredHeight();
                    w9Var.r = p5Var.getMeasuredWidth();
                    break;
                }
                break;
            default:
                super.onSizeChanged(i7, i10, i11, i12);
                break;
        }
    }

    @Override // android.view.View
    public void setAlpha(float f10) {
        switch (this.a) {
            case 5:
                super.setAlpha(f10);
                View view = ((cn) this.c).fragmentView;
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
                ((q10) this.c).d.setAlpha(f10);
                break;
        }
    }

    @Override // android.view.View
    public void setScaleX(float f10) {
        switch (this.a) {
            case 7:
                super.setScaleX(f10);
                ((q10) this.c).d.setScaleX(f10);
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
                ((q10) this.c).d.setScaleY(f10);
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
                ((q10) this.c).d.setTranslationY(f10);
                break;
            default:
                super.setTranslationY(f10);
                break;
        }
    }

    @Override // android.view.View
    public void setVisibility(int i7) {
        switch (this.a) {
            case 5:
                super.setVisibility(i7);
                View view = ((cn) this.c).fragmentView;
                if (view != null) {
                    view.invalidate();
                    break;
                }
                break;
            default:
                super.setVisibility(i7);
                break;
        }
    }

    @Override // android.view.View
    public boolean verifyDrawable(Drawable drawable) {
        switch (this.a) {
            case 0:
                return drawable == ((ie0) this.c) || super.verifyDrawable(drawable);
            case 9:
                return ((org.telegram.ui.Cells.y) this.b) == drawable || super.verifyDrawable(drawable);
            default:
                return super.verifyDrawable(drawable);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p5(Context context, org.telegram.ui.ActionBar.q4 q4Var) {
        super(context);
        this.a = 13;
        this.c = new te.a(0, this, xq.h, 380L, true);
        this.b = q4Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p5(Activity activity) {
        super(activity);
        this.a = 0;
        Paint paint = new Paint(1);
        this.b = paint;
        ie0 ie0Var = new ie0(10);
        this.c = ie0Var;
        paint.setColor(-1);
        paint.setShadowLayer(1.0f, 0.0f, 0.0f, 419430400);
        paint.setStyle(Paint.Style.STROKE);
        ie0Var.setCallback(this);
        ie0Var.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p5(ii.p pVar, Context context) {
        super(context);
        this.a = 1;
        this.c = pVar;
        this.b = new Paint(1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p5(q10 q10Var, Context context) {
        super(context);
        this.a = 7;
        this.c = q10Var;
        this.b = new Paint(1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p5(Context context, Paint paint, Drawable drawable) {
        super(context);
        this.a = 19;
        this.b = paint;
        this.c = drawable;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p5(org.telegram.ui.Wallet.a6 a6Var, Context context) {
        super(context);
        this.a = 18;
        this.c = a6Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p5(bb1 bb1Var, Context context) {
        super(context);
        this.a = 17;
        this.c = bb1Var;
        this.b = new Paint();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p5(Context context, w71 w71Var) {
        super(context);
        this.a = 16;
        this.c = w71Var;
        this.b = new Paint(1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p5(cn cnVar, Context context) {
        super(context);
        this.a = 4;
        this.c = cnVar;
        this.b = new RectF();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p5(cn cnVar, Context context, View view, org.telegram.ui.ActionBar.g6 g6Var) {
        super(context);
        this.a = 5;
        this.c = cnVar;
        org.telegram.ui.Components.w9 w9Var = new org.telegram.ui.Components.w9(view, this, g6Var);
        this.b = w9Var;
        w9Var.p = false;
        w9Var.n = true;
    }

    @Override // te.b
    public /* synthetic */ void F(float f10, int i7) {
    }
}
