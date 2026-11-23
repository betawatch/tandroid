package hi;

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
import org.telegram.messenger.ls;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.Components.c20;
import org.telegram.ui.Components.g80;
import org.telegram.ui.Components.kr;
import org.telegram.ui.Components.nr;
import org.telegram.ui.Components.og;
import org.telegram.ui.Components.we0;
import org.telegram.ui.ad;
import org.telegram.ui.b20;
import org.telegram.ui.bb1;
import org.telegram.ui.bn;
import org.telegram.ui.dy;
import org.telegram.ui.f50;
import org.telegram.ui.iy;
import org.telegram.ui.pc0;
import org.telegram.ui.qr;
import org.telegram.ui.rn;
import org.telegram.ui.s11;
import org.telegram.ui.x71;
import org.telegram.ui.yc;
import org.telegram.ui.zm;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes4.dex */
public final class l5 extends View implements te.b {
    public final /* synthetic */ int a;
    public Object b;
    public final Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l5(Object obj, Context context, Object obj2, int i7) {
        super(context);
        this.a = i7;
        this.c = obj;
        this.b = obj2;
    }

    @Override // te.b
    public void H(int i7, float f10, float f11, te.c cVar) {
        setVisibility(f10 > 0.0f ? 0 : 8);
        setAlpha(f10);
    }

    public boolean a() {
        org.telegram.ui.Components.aa aaVar = (org.telegram.ui.Components.aa) this.b;
        if (aaVar.t) {
            return (aaVar.m == 1.0f || !aaVar.p) && aaVar.n && aaVar.d.getAlpha() == 1.0f && getVisibility() == 0;
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
                bn bnVar = (bn) this.c;
                int backgroundSizeY = bnVar.m1.getBackgroundSizeY();
                float x10 = getX();
                float l92 = bnVar.l9(this);
                zm zmVar = bnVar.Ba;
                if (zmVar != null) {
                    zmVar.e(x10, l92, measuredWidth, backgroundSizeY);
                } else {
                    org.telegram.ui.ActionBar.m6.r(x10, l92, measuredWidth, backgroundSizeY);
                }
                canvas.drawRoundRect(rectF, org.telegram.messenger.g0.L(18.0f), org.telegram.messenger.g0.L(18.0f), bnVar.getThemedPaint("paintChatActionBackground"));
                zm zmVar2 = bnVar.Ba;
                if (zmVar2 == null ? org.telegram.ui.ActionBar.m6.d1() : zmVar2.j()) {
                    canvas.drawRoundRect(rectF, org.telegram.messenger.g0.L(18.0f), org.telegram.messenger.g0.L(18.0f), bnVar.getThemedPaint("paintChatActionBackgroundDarken"));
                }
                super.dispatchDraw(canvas);
                break;
            case 9:
                b20 b20Var = (b20) this.c;
                float measuredWidth2 = b20Var.e0.getMeasuredWidth();
                kr krVar = b20Var.d0;
                float measuredWidth3 = (b20Var.f0.getMeasuredWidth() * krVar.g) + ((1.0f - krVar.g) * measuredWidth2);
                canvas.save();
                org.telegram.ui.Cells.y yVar = (org.telegram.ui.Cells.y) this.b;
                yVar.setBounds(0, 0, org.telegram.messenger.g0.L(50.0f) + ((int) measuredWidth3), getMeasuredHeight());
                yVar.draw(canvas);
                super.dispatchDraw(canvas);
                break;
            case 13:
                super.dispatchDraw(canvas);
                ((ActionBarLayout) ((org.telegram.ui.ActionBar.r4) this.b)).q(canvas, 0);
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
        boolean z10;
        ?? r15;
        org.telegram.ui.ActionBar.r4 r4Var;
        switch (this.a) {
            case 0:
                Paint paint = (Paint) this.b;
                paint.setStrokeWidth(org.telegram.messenger.g0.N(1.66f));
                canvas.drawCircle(getWidth() / 2.0f, getHeight() / 2.0f, org.telegram.messenger.g0.L(10.0f), paint);
                we0 we0Var = (we0) this.c;
                we0Var.setBounds(0, 0, org.telegram.messenger.g0.L(10.0f), org.telegram.messenger.g0.L(10.0f));
                canvas.save();
                canvas.translate((getWidth() - org.telegram.messenger.g0.L(10.0f)) / 2.0f, (getHeight() - org.telegram.messenger.g0.L(10.0f)) / 2.0f);
                we0Var.draw(canvas);
                canvas.restore();
                break;
            case 1:
                Paint paint2 = (Paint) this.b;
                li.p pVar = (li.p) this.c;
                org.telegram.ui.Components.q9 q9Var = pVar.x;
                if (q9Var != null && q9Var.getImageReceiver().L()) {
                    paint2.setColor(1426063360);
                    paint2.setAlpha((int) (pVar.x.getImageReceiver().i1 * 85.0f));
                    canvas.drawRoundRect(0.0f, 0.0f, getWidth(), getHeight(), org.telegram.messenger.g0.L(20.0f), org.telegram.messenger.g0.L(20.0f), paint2);
                    break;
                }
                break;
            case 2:
                super.onDraw(canvas);
                int paddingLeft = getPaddingLeft();
                float width = ((getWidth() - paddingLeft) - getPaddingRight()) / 7.0f;
                for (int i7 = 0; i7 < 7; i7++) {
                    canvas.drawText(((String[]) this.b)[i7], (width / 2.0f) + (i7 * width) + paddingLeft, ((getMeasuredHeight() - org.telegram.messenger.g0.L(2.0f)) / 2.0f) + org.telegram.messenger.g0.L(5.0f), ((org.telegram.ui.i8) this.c).f);
                }
                break;
            case 3:
                Paint paint3 = (Paint) this.b;
                ad adVar = (ad) this.c;
                fi.t3 t3Var = adVar.f;
                if (t3Var != null && t3Var.getImageReceiver().L()) {
                    paint3.setAlpha((int) (adVar.s.getAlpha() * adVar.f.getImageReceiver().i1 * 85.0f));
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
                org.telegram.ui.Components.aa aaVar = (org.telegram.ui.Components.aa) this.b;
                Paint paint4 = aaVar.x;
                org.telegram.ui.ActionBar.h6 h6Var = aaVar.y;
                Paint paint5 = aaVar.w;
                int i10 = aaVar.b;
                View view = aaVar.c;
                l5 l5Var = aaVar.d;
                if (l5Var != null) {
                    if (l5Var.getMeasuredHeight() != 0 || l5Var.getMeasuredWidth() != 0) {
                        if (i10 == 1 && !aaVar.t && !aaVar.p) {
                            aaVar.a();
                            aaVar.l = false;
                        }
                        Bitmap[] bitmapArr2 = aaVar.g;
                        if ((bitmapArr2 != null || aaVar.o) && aaVar.p) {
                            boolean z11 = aaVar.n;
                            if (z11) {
                                float f11 = aaVar.m;
                                if (f11 != 1.0f) {
                                    float f12 = f11 + 0.09f;
                                    aaVar.m = f12;
                                    if (f12 > 1.0f) {
                                        aaVar.m = 1.0f;
                                    }
                                    l5Var.invalidate();
                                }
                            }
                            if (!z11) {
                                float f13 = aaVar.m;
                                if (f13 != 0.0f) {
                                    float f14 = f13 - 0.09f;
                                    aaVar.m = f14;
                                    if (f14 < 0.0f) {
                                        aaVar.m = 0.0f;
                                    }
                                    l5Var.invalidate();
                                }
                            }
                        }
                        float f15 = aaVar.p ? aaVar.m : 1.0f;
                        if (bitmapArr2 == null && aaVar.o) {
                            paint4.setAlpha((int) (50.0f * f15));
                            canvas.drawPaint(paint4);
                            break;
                        } else {
                            if (f15 == 1.0f) {
                                canvas.save();
                                bitmapArr = bitmapArr2;
                                f10 = 0.0f;
                                z10 = 0;
                                r15 = 1;
                            } else {
                                bitmapArr = bitmapArr2;
                                f10 = 0.0f;
                                z10 = 0;
                                r15 = 1;
                                canvas.saveLayerAlpha(0.0f, 0.0f, l5Var.getMeasuredWidth(), l5Var.getMeasuredHeight(), (int) (f15 * 255.0f), 31);
                            }
                            if (bitmapArr != null) {
                                paint5.setAlpha((int) (f15 * 255.0f));
                                if (i10 == r15) {
                                    canvas.translate(f10, aaVar.u);
                                }
                                canvas.save();
                                canvas.scale(l5Var.getMeasuredWidth() / bitmapArr[r15].getWidth(), l5Var.getMeasuredHeight() / bitmapArr[r15].getHeight());
                                canvas.drawBitmap(bitmapArr[r15], f10, f10, paint5);
                                canvas.restore();
                                canvas.save();
                                if (i10 == 0) {
                                    canvas.translate(f10, aaVar.u);
                                }
                                canvas.scale(l5Var.getMeasuredWidth() / bitmapArr[z10].getWidth(), aaVar.s / bitmapArr[z10].getHeight());
                                canvas.drawBitmap(bitmapArr[z10], f10, f10, paint5);
                                canvas.restore();
                                aaVar.t = r15;
                                canvas.drawColor(436207616);
                            }
                            canvas.restore();
                            if (aaVar.n && !aaVar.k) {
                                if (aaVar.g == null || aaVar.l) {
                                    aaVar.k = r15;
                                    aaVar.l = z10;
                                    if (aaVar.e == null) {
                                        aaVar.e = new Bitmap[2];
                                        aaVar.j = new Canvas[2];
                                    }
                                    for (int i11 = 0; i11 < 2; i11++) {
                                        if (aaVar.e[i11] != null && l5Var.getMeasuredWidth() == aaVar.r && l5Var.getMeasuredHeight() == aaVar.q) {
                                            aaVar.e[i11].eraseColor(0);
                                        } else {
                                            int measuredHeight = l5Var.getMeasuredHeight();
                                            int measuredWidth = l5Var.getMeasuredWidth();
                                            int L = org.telegram.messenger.g0.L(200.0f) + org.telegram.messenger.g0.m;
                                            aaVar.s = L;
                                            if (i11 == 0) {
                                                measuredHeight = L;
                                            }
                                            try {
                                                aaVar.e[i11] = Bitmap.createBitmap((int) (measuredWidth / 15.0f), (int) (measuredHeight / 15.0f), Bitmap.Config.ARGB_8888);
                                                aaVar.j[i11] = new Canvas(aaVar.e[i11]);
                                            } catch (Exception e10) {
                                                org.telegram.messenger.a8.g(e10, r15);
                                                org.telegram.messenger.g0.g3(new og(aaVar, 11));
                                                return;
                                            }
                                        }
                                        if (i11 == r15) {
                                            aaVar.e[i11].eraseColor(org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.d6, h6Var));
                                        }
                                        aaVar.j[i11].save();
                                        aaVar.j[i11].scale(0.06666667f, 0.06666667f, f10, f10);
                                        Drawable background = view.getBackground();
                                        if (background == null) {
                                            background = h6Var instanceof zm ? ((zm) h6Var).c() : org.telegram.ui.ActionBar.m6.t0();
                                        }
                                        view.setTag(67108867, Integer.valueOf(i11));
                                        if (i11 == 0) {
                                            aaVar.j[i11].translate(f10, -aaVar.u);
                                            view.draw(aaVar.j[i11]);
                                        }
                                        if (background != null && i11 == r15) {
                                            Rect bounds = background.getBounds();
                                            background.setBounds(0, 0, view.getMeasuredWidth(), view.getMeasuredHeight());
                                            background.draw(aaVar.j[i11]);
                                            background.setBounds(bounds);
                                            view.draw(aaVar.j[i11]);
                                        }
                                        view.setTag(67108867, null);
                                        aaVar.j[i11].restore();
                                    }
                                    aaVar.q = l5Var.getMeasuredHeight();
                                    aaVar.r = l5Var.getMeasuredWidth();
                                    aaVar.v.b = l5Var.getMeasuredWidth();
                                    aaVar.v.c = l5Var.getMeasuredHeight();
                                    org.telegram.ui.Components.z9 z9Var = aaVar.v;
                                    if (z9Var.b != 0 && z9Var.c != 0) {
                                        if (aaVar.a == null) {
                                            aaVar.a = new org.telegram.messenger.r5("blur_thread_" + aaVar, (boolean) r15);
                                        }
                                        aaVar.a.postRunnable(aaVar.v);
                                        break;
                                    } else {
                                        aaVar.k = false;
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
                fi.t3 t3Var2 = rnVar.e;
                if (t3Var2 != null && t3Var2.getImageReceiver().L()) {
                    paint6.setAlpha((int) (rnVar.e.getImageReceiver().i1 * 85.0f));
                    canvas.drawCircle(getMeasuredWidth() / 2.0f, getMeasuredHeight() / 2.0f, getMeasuredWidth() / 2.0f, paint6);
                    break;
                }
                break;
            case 7:
                Paint paint7 = (Paint) this.b;
                c20 c20Var = (c20) this.c;
                boolean z12 = c20Var.F;
                if (z12) {
                    float f16 = c20Var.G;
                    if (f16 != 1.0f) {
                        float f17 = f16 + 0.064f;
                        c20Var.G = f17;
                        if (f17 > 1.0f) {
                            c20Var.G = 1.0f;
                        }
                        invalidate();
                        paint7.setColor(i0.a.f(c20Var.G, 1711607061, 1714752530));
                        canvas.drawCircle(getMeasuredWidth() / 2.0f, (getMeasuredHeight() / 2.0f) - org.telegram.messenger.g0.L(25.0f), (org.telegram.messenger.g0.L(5.0f) * c20Var.G) + org.telegram.messenger.g0.L(35.0f), paint7);
                        break;
                    }
                }
                if (!z12) {
                    float f18 = c20Var.G;
                    if (f18 != 0.0f) {
                        float f19 = f18 - 0.064f;
                        c20Var.G = f19;
                        if (f19 < 0.0f) {
                            c20Var.G = 0.0f;
                        }
                        invalidate();
                    }
                }
                paint7.setColor(i0.a.f(c20Var.G, 1711607061, 1714752530));
                canvas.drawCircle(getMeasuredWidth() / 2.0f, (getMeasuredHeight() / 2.0f) - org.telegram.messenger.g0.L(25.0f), (org.telegram.messenger.g0.L(5.0f) * c20Var.G) + org.telegram.messenger.g0.L(35.0f), paint7);
            case 8:
                canvas.drawColor(855638016);
                g80 g80Var = (g80) this.c;
                FrameLayout frameLayout = g80Var.n;
                FrameLayout frameLayout2 = (FrameLayout) this.b;
                float[] fArr = g80Var.J;
                g80.a(frameLayout, frameLayout2, fArr);
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
                qr qrVar = (qr) this.c;
                org.telegram.ui.Components.q9 q9Var2 = qrVar.e;
                if (q9Var2 != null && q9Var2.getImageReceiver().L()) {
                    paint8.setAlpha((int) (qrVar.e.getImageReceiver().i1 * 85.0f));
                    canvas.drawCircle(getMeasuredWidth() / 2.0f, getMeasuredHeight() / 2.0f, getMeasuredWidth() / 2.0f, paint8);
                    break;
                }
                break;
            case 11:
                canvas.drawColor(855638016);
                iy iyVar = (iy) this.c;
                FrameLayout frameLayout3 = iyVar.a;
                FrameLayout frameLayout4 = (FrameLayout) this.b;
                float[] fArr2 = iyVar.E;
                dy.a(frameLayout3, frameLayout4, fArr2);
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
                    paint9.setAlpha((int) (f50Var.n.getAlpha() * f50Var.d.getImageReceiver().i1 * 85.0f));
                    canvas.drawCircle(getMeasuredWidth() / 2.0f, getMeasuredHeight() / 2.0f, getMeasuredWidth() / 2.0f, paint9);
                    break;
                }
                break;
            case 14:
                Paint paint10 = (Paint) this.b;
                pc0 pc0Var = (pc0) this.c;
                yc ycVar = pc0Var.r;
                fi.t3 t3Var3 = pc0Var.e;
                if (t3Var3 != null && ycVar.getVisibility() == 0) {
                    paint10.setAlpha((int) (ycVar.getAlpha() * t3Var3.getImageReceiver().i1 * 85.0f));
                    canvas.drawCircle(getMeasuredWidth() / 2.0f, getMeasuredHeight() / 2.0f, getMeasuredWidth() / 2.0f, paint10);
                    break;
                }
                break;
            case 15:
                if (((s11) this.c).R0) {
                    canvas.drawColor(org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.G8, (org.telegram.ui.ActionBar.h6) this.b));
                    break;
                } else {
                    dispatchDraw(canvas);
                    break;
                }
            case 16:
                x71 x71Var = (x71) this.c;
                int currentItem = x71Var.l0.getCurrentItem();
                Paint paint11 = (Paint) this.b;
                int i12 = org.telegram.ui.ActionBar.m6.sf;
                paint11.setColor(x71Var.d ? org.telegram.ui.ActionBar.m6.F0(i12) : x71Var.getThemedColor(i12));
                int i13 = 0;
                while (i13 < 2) {
                    paint11.setAlpha(i13 == currentItem ? ls.e4 : ls.L1);
                    canvas.drawCircle(org.telegram.messenger.g0.L((i13 * 15) + 3), org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(3.0f), paint11);
                    i13++;
                }
                break;
            case 17:
                Paint paint12 = (Paint) this.b;
                paint12.setColor(org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.d6, false));
                int measuredHeight2 = getMeasuredHeight() - org.telegram.messenger.g0.L(3.0f);
                canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), measuredHeight2, paint12);
                r4Var = ((org.telegram.ui.ActionBar.g2) ((bb1) this.c)).parentLayout;
                ((ActionBarLayout) r4Var).q(canvas, measuredHeight2);
                break;
            case 18:
                super.onDraw(canvas);
                int save = canvas.save();
                canvas.scale(getWidth() / 336.0f, getHeight() / 205.0f);
                org.telegram.ui.Wallet.p6 p6Var = ((org.telegram.ui.Wallet.s6) this.c).b;
                if (p6Var != null) {
                    p6Var.e(canvas, (float[]) this.b);
                } else {
                    canvas.drawColor(org.telegram.ui.Wallet.f8.a(-16216082, (float[]) this.b));
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
                org.telegram.ui.Components.aa aaVar = (org.telegram.ui.Components.aa) this.b;
                l5 l5Var = aaVar.d;
                if (aaVar.g != null && l5Var.getMeasuredHeight() != 0 && l5Var.getMeasuredWidth() != 0) {
                    aaVar.a();
                    aaVar.q = l5Var.getMeasuredHeight();
                    aaVar.r = l5Var.getMeasuredWidth();
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
                View view = ((bn) this.c).fragmentView;
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
                ((c20) this.c).d.setAlpha(f10);
                break;
        }
    }

    @Override // android.view.View
    public void setScaleX(float f10) {
        switch (this.a) {
            case 7:
                super.setScaleX(f10);
                ((c20) this.c).d.setScaleX(f10);
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
                ((c20) this.c).d.setScaleY(f10);
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
                ((c20) this.c).d.setTranslationY(f10);
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
                View view = ((bn) this.c).fragmentView;
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
                return drawable == ((we0) this.c) || super.verifyDrawable(drawable);
            case 9:
                return ((org.telegram.ui.Cells.y) this.b) == drawable || super.verifyDrawable(drawable);
            default:
                return super.verifyDrawable(drawable);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l5(Context context, org.telegram.ui.ActionBar.r4 r4Var) {
        super(context);
        this.a = 13;
        this.c = new te.a(0, this, nr.h, 380L, true);
        this.b = r4Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l5(Activity activity) {
        super(activity);
        this.a = 0;
        Paint paint = new Paint(1);
        this.b = paint;
        we0 we0Var = new we0(10);
        this.c = we0Var;
        paint.setColor(-1);
        paint.setShadowLayer(1.0f, 0.0f, 0.0f, 419430400);
        paint.setStyle(Paint.Style.STROKE);
        we0Var.setCallback(this);
        we0Var.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l5(li.p pVar, Context context) {
        super(context);
        this.a = 1;
        this.c = pVar;
        this.b = new Paint(1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l5(c20 c20Var, Context context) {
        super(context);
        this.a = 7;
        this.c = c20Var;
        this.b = new Paint(1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l5(Context context, Paint paint, Drawable drawable) {
        super(context);
        this.a = 19;
        this.b = paint;
        this.c = drawable;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l5(org.telegram.ui.Wallet.s6 s6Var, Context context) {
        super(context);
        this.a = 18;
        this.c = s6Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l5(bb1 bb1Var, Context context) {
        super(context);
        this.a = 17;
        this.c = bb1Var;
        this.b = new Paint();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l5(Context context, x71 x71Var) {
        super(context);
        this.a = 16;
        this.c = x71Var;
        this.b = new Paint(1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l5(bn bnVar, Context context) {
        super(context);
        this.a = 4;
        this.c = bnVar;
        this.b = new RectF();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l5(bn bnVar, Context context, View view, org.telegram.ui.ActionBar.h6 h6Var) {
        super(context);
        this.a = 5;
        this.c = bnVar;
        org.telegram.ui.Components.aa aaVar = new org.telegram.ui.Components.aa(view, this, h6Var);
        this.b = aaVar;
        aaVar.p = false;
        aaVar.n = true;
    }

    @Override // te.b
    public /* synthetic */ void D(float f10, int i7) {
    }
}
