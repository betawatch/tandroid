package kg;

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
import org.telegram.messenger.f8;
import org.telegram.messenger.s5;
import org.telegram.messenger.zs;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.p6;
import org.telegram.ui.ActionBar.t6;
import org.telegram.ui.ActionBar.z4;
import org.telegram.ui.Components.dr;
import org.telegram.ui.Components.g20;
import org.telegram.ui.Components.g9;
import org.telegram.ui.Components.gr;
import org.telegram.ui.Components.j80;
import org.telegram.ui.Components.kf0;
import org.telegram.ui.Components.p9;
import org.telegram.ui.Components.q9;
import org.telegram.ui.Components.tf;
import org.telegram.ui.Wallet.c6;
import org.telegram.ui.Wallet.g6;
import org.telegram.ui.Wallet.v7;
import org.telegram.ui.bz;
import org.telegram.ui.c60;
import org.telegram.ui.gz;
import org.telegram.ui.h8;
import org.telegram.ui.i31;
import org.telegram.ui.id;
import org.telegram.ui.kd;
import org.telegram.ui.m91;
import org.telegram.ui.ns;
import org.telegram.ui.oo;
import org.telegram.ui.sn;
import org.telegram.ui.tc1;
import org.telegram.ui.un;
import org.telegram.ui.wd0;
import org.telegram.ui.y20;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class f0 extends View implements fe.e {
    public final /* synthetic */ int a;
    public Object b;
    public final Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f0(Object obj, Context context, Object obj2, int i10) {
        super(context);
        this.a = i10;
        this.c = obj;
        this.b = obj2;
    }

    public boolean a() {
        q9 q9Var = (q9) this.b;
        if (q9Var.t) {
            return (q9Var.m == 1.0f || !q9Var.p) && q9Var.n && q9Var.d.getAlpha() == 1.0f && getVisibility() == 0;
        }
        return false;
    }

    @Override // android.view.View
    public void dispatchDraw(Canvas canvas) {
        switch (this.a) {
            case 3:
                RectF rectF = (RectF) this.b;
                rectF.set(0.0f, 0.0f, getWidth(), getHeight());
                int measuredWidth = getMeasuredWidth();
                un unVar = (un) this.c;
                int backgroundSizeY = unVar.l1.getBackgroundSizeY();
                float x10 = getX();
                float c92 = unVar.c9(this);
                sn snVar = unVar.xa;
                if (snVar != null) {
                    snVar.b(x10, c92, measuredWidth, backgroundSizeY);
                } else {
                    t6.r(x10, c92, measuredWidth, backgroundSizeY);
                }
                canvas.drawRoundRect(rectF, org.telegram.messenger.i0.L(18.0f), org.telegram.messenger.i0.L(18.0f), unVar.getThemedPaint("paintChatActionBackground"));
                sn snVar2 = unVar.xa;
                if (snVar2 == null ? t6.d1() : snVar2.g()) {
                    canvas.drawRoundRect(rectF, org.telegram.messenger.i0.L(18.0f), org.telegram.messenger.i0.L(18.0f), unVar.getThemedPaint("paintChatActionBackgroundDarken"));
                }
                super.dispatchDraw(canvas);
                break;
            case 8:
                y20 y20Var = (y20) this.c;
                float measuredWidth2 = y20Var.d0.getMeasuredWidth();
                dr drVar = y20Var.c0;
                float measuredWidth3 = (y20Var.e0.getMeasuredWidth() * drVar.g) + ((1.0f - drVar.g) * measuredWidth2);
                canvas.save();
                org.telegram.ui.Cells.y yVar = (org.telegram.ui.Cells.y) this.b;
                yVar.setBounds(0, 0, org.telegram.messenger.i0.L(50.0f) + ((int) measuredWidth3), getMeasuredHeight());
                yVar.draw(canvas);
                super.dispatchDraw(canvas);
                break;
            case 12:
                super.dispatchDraw(canvas);
                ((ActionBarLayout) ((z4) this.b)).q(canvas, 0);
                break;
            default:
                super.dispatchDraw(canvas);
                break;
        }
    }

    @Override // android.view.View
    public void drawableStateChanged() {
        switch (this.a) {
            case 8:
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
            case 8:
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
        float f7;
        boolean z10;
        ?? r15;
        z4 z4Var;
        switch (this.a) {
            case 0:
                float measuredWidth = getMeasuredWidth() / 2.0f;
                float measuredHeight = getMeasuredHeight() / 2.0f;
                canvas.drawCircle(measuredWidth, measuredHeight, getMeasuredWidth() / 2.0f, (Paint) this.b);
                ea.f.d().f(-org.telegram.messenger.i0.L(10.0f), 0.0f, getMeasuredWidth(), getMeasuredHeight());
                canvas.drawCircle(measuredWidth, measuredHeight, (getMeasuredWidth() / 2.0f) - org.telegram.messenger.i0.L(2.0f), ea.f.d().e());
                float L = org.telegram.messenger.i0.L(18.0f) / 2.0f;
                Drawable drawable = (Drawable) this.c;
                drawable.setBounds((int) (measuredWidth - L), (int) (measuredHeight - L), (int) (measuredWidth + L), (int) (measuredHeight + L));
                drawable.draw(canvas);
                break;
            case 1:
                super.onDraw(canvas);
                int paddingLeft = getPaddingLeft();
                float width = ((getWidth() - paddingLeft) - getPaddingRight()) / 7.0f;
                for (int i10 = 0; i10 < 7; i10++) {
                    canvas.drawText(((String[]) this.b)[i10], (width / 2.0f) + (i10 * width) + paddingLeft, ((getMeasuredHeight() - org.telegram.messenger.i0.L(2.0f)) / 2.0f) + org.telegram.messenger.i0.L(5.0f), ((h8) this.c).f);
                }
                break;
            case 2:
                Paint paint = (Paint) this.b;
                kd kdVar = (kd) this.c;
                ag.d2 d2Var = kdVar.f;
                if (d2Var != null && d2Var.getImageReceiver().L()) {
                    paint.setAlpha((int) (kdVar.s.getAlpha() * kdVar.f.getImageReceiver().h1 * 85.0f));
                    canvas.drawCircle(getMeasuredWidth() / 2.0f, getMeasuredHeight() / 2.0f, getMeasuredWidth() / 2.0f, paint);
                    break;
                }
                break;
            case 3:
            case 8:
            case 12:
            default:
                super.onDraw(canvas);
                break;
            case 4:
                q9 q9Var = (q9) this.b;
                Paint paint2 = q9Var.x;
                p6 p6Var = q9Var.y;
                Paint paint3 = q9Var.w;
                int i11 = q9Var.b;
                View view = q9Var.c;
                f0 f0Var = q9Var.d;
                if (f0Var != null) {
                    if (f0Var.getMeasuredHeight() != 0 || f0Var.getMeasuredWidth() != 0) {
                        if (i11 == 1 && !q9Var.t && !q9Var.p) {
                            q9Var.a();
                            q9Var.l = false;
                        }
                        Bitmap[] bitmapArr2 = q9Var.g;
                        if ((bitmapArr2 != null || q9Var.o) && q9Var.p) {
                            boolean z11 = q9Var.n;
                            if (z11) {
                                float f10 = q9Var.m;
                                if (f10 != 1.0f) {
                                    float f11 = f10 + 0.09f;
                                    q9Var.m = f11;
                                    if (f11 > 1.0f) {
                                        q9Var.m = 1.0f;
                                    }
                                    f0Var.invalidate();
                                }
                            }
                            if (!z11) {
                                float f12 = q9Var.m;
                                if (f12 != 0.0f) {
                                    float f13 = f12 - 0.09f;
                                    q9Var.m = f13;
                                    if (f13 < 0.0f) {
                                        q9Var.m = 0.0f;
                                    }
                                    f0Var.invalidate();
                                }
                            }
                        }
                        float f14 = q9Var.p ? q9Var.m : 1.0f;
                        if (bitmapArr2 == null && q9Var.o) {
                            paint2.setAlpha((int) (50.0f * f14));
                            canvas.drawPaint(paint2);
                            break;
                        } else {
                            if (f14 == 1.0f) {
                                canvas.save();
                                bitmapArr = bitmapArr2;
                                f7 = 0.0f;
                                z10 = 0;
                                r15 = 1;
                            } else {
                                bitmapArr = bitmapArr2;
                                f7 = 0.0f;
                                z10 = 0;
                                r15 = 1;
                                canvas.saveLayerAlpha(0.0f, 0.0f, f0Var.getMeasuredWidth(), f0Var.getMeasuredHeight(), (int) (f14 * 255.0f), 31);
                            }
                            if (bitmapArr != null) {
                                paint3.setAlpha((int) (f14 * 255.0f));
                                if (i11 == r15) {
                                    canvas.translate(f7, q9Var.u);
                                }
                                canvas.save();
                                canvas.scale(f0Var.getMeasuredWidth() / bitmapArr[r15].getWidth(), f0Var.getMeasuredHeight() / bitmapArr[r15].getHeight());
                                canvas.drawBitmap(bitmapArr[r15], f7, f7, paint3);
                                canvas.restore();
                                canvas.save();
                                if (i11 == 0) {
                                    canvas.translate(f7, q9Var.u);
                                }
                                canvas.scale(f0Var.getMeasuredWidth() / bitmapArr[z10].getWidth(), q9Var.s / bitmapArr[z10].getHeight());
                                canvas.drawBitmap(bitmapArr[z10], f7, f7, paint3);
                                canvas.restore();
                                q9Var.t = r15;
                                canvas.drawColor(436207616);
                            }
                            canvas.restore();
                            if (q9Var.n && !q9Var.k) {
                                if (q9Var.g == null || q9Var.l) {
                                    q9Var.k = r15;
                                    q9Var.l = z10;
                                    if (q9Var.e == null) {
                                        q9Var.e = new Bitmap[2];
                                        q9Var.j = new Canvas[2];
                                    }
                                    for (int i12 = 0; i12 < 2; i12++) {
                                        if (q9Var.e[i12] != null && f0Var.getMeasuredWidth() == q9Var.r && f0Var.getMeasuredHeight() == q9Var.q) {
                                            q9Var.e[i12].eraseColor(0);
                                        } else {
                                            int measuredHeight2 = f0Var.getMeasuredHeight();
                                            int measuredWidth2 = f0Var.getMeasuredWidth();
                                            int L2 = org.telegram.messenger.i0.L(200.0f) + org.telegram.messenger.i0.m;
                                            q9Var.s = L2;
                                            if (i12 == 0) {
                                                measuredHeight2 = L2;
                                            }
                                            try {
                                                q9Var.e[i12] = Bitmap.createBitmap((int) (measuredWidth2 / 15.0f), (int) (measuredHeight2 / 15.0f), Bitmap.Config.ARGB_8888);
                                                q9Var.j[i12] = new Canvas(q9Var.e[i12]);
                                            } catch (Exception e) {
                                                f8.g(e, r15);
                                                org.telegram.messenger.i0.g3(new tf(q9Var, 12));
                                                return;
                                            }
                                        }
                                        if (i12 == r15) {
                                            q9Var.e[i12].eraseColor(t6.w0(t6.d6, p6Var));
                                        }
                                        q9Var.j[i12].save();
                                        q9Var.j[i12].scale(0.06666667f, 0.06666667f, f7, f7);
                                        Drawable background = view.getBackground();
                                        if (background == null) {
                                            background = p6Var instanceof sn ? ((sn) p6Var).m() : t6.t0();
                                        }
                                        view.setTag(67108867, Integer.valueOf(i12));
                                        if (i12 == 0) {
                                            q9Var.j[i12].translate(f7, -q9Var.u);
                                            view.draw(q9Var.j[i12]);
                                        }
                                        if (background != null && i12 == r15) {
                                            Rect bounds = background.getBounds();
                                            background.setBounds(0, 0, view.getMeasuredWidth(), view.getMeasuredHeight());
                                            background.draw(q9Var.j[i12]);
                                            background.setBounds(bounds);
                                            view.draw(q9Var.j[i12]);
                                        }
                                        view.setTag(67108867, null);
                                        q9Var.j[i12].restore();
                                    }
                                    q9Var.q = f0Var.getMeasuredHeight();
                                    q9Var.r = f0Var.getMeasuredWidth();
                                    q9Var.v.b = f0Var.getMeasuredWidth();
                                    q9Var.v.c = f0Var.getMeasuredHeight();
                                    p9 p9Var = q9Var.v;
                                    if (p9Var.b != 0 && p9Var.c != 0) {
                                        if (q9Var.a == null) {
                                            q9Var.a = new s5("blur_thread_" + q9Var, (boolean) r15);
                                        }
                                        q9Var.a.postRunnable(q9Var.v);
                                        break;
                                    } else {
                                        q9Var.k = false;
                                        break;
                                    }
                                }
                            }
                        }
                    }
                }
                break;
            case 5:
                Paint paint4 = (Paint) this.b;
                oo ooVar = (oo) this.c;
                ag.d2 d2Var2 = ooVar.e;
                if (d2Var2 != null && d2Var2.getImageReceiver().L()) {
                    paint4.setAlpha((int) (ooVar.e.getImageReceiver().h1 * 85.0f));
                    canvas.drawCircle(getMeasuredWidth() / 2.0f, getMeasuredHeight() / 2.0f, getMeasuredWidth() / 2.0f, paint4);
                    break;
                }
                break;
            case 6:
                Paint paint5 = (Paint) this.b;
                g20 g20Var = (g20) this.c;
                boolean z12 = g20Var.D;
                if (z12) {
                    float f15 = g20Var.E;
                    if (f15 != 1.0f) {
                        float f16 = f15 + 0.064f;
                        g20Var.E = f16;
                        if (f16 > 1.0f) {
                            g20Var.E = 1.0f;
                        }
                        invalidate();
                        paint5.setColor(i0.b.f(g20Var.E, 1711607061, 1714752530));
                        canvas.drawCircle(getMeasuredWidth() / 2.0f, (getMeasuredHeight() / 2.0f) - org.telegram.messenger.i0.L(25.0f), (org.telegram.messenger.i0.L(5.0f) * g20Var.E) + org.telegram.messenger.i0.L(35.0f), paint5);
                        break;
                    }
                }
                if (!z12) {
                    float f17 = g20Var.E;
                    if (f17 != 0.0f) {
                        float f18 = f17 - 0.064f;
                        g20Var.E = f18;
                        if (f18 < 0.0f) {
                            g20Var.E = 0.0f;
                        }
                        invalidate();
                    }
                }
                paint5.setColor(i0.b.f(g20Var.E, 1711607061, 1714752530));
                canvas.drawCircle(getMeasuredWidth() / 2.0f, (getMeasuredHeight() / 2.0f) - org.telegram.messenger.i0.L(25.0f), (org.telegram.messenger.i0.L(5.0f) * g20Var.E) + org.telegram.messenger.i0.L(35.0f), paint5);
            case 7:
                canvas.drawColor(855638016);
                j80 j80Var = (j80) this.c;
                FrameLayout frameLayout = j80Var.n;
                FrameLayout frameLayout2 = (FrameLayout) this.b;
                float[] fArr = j80Var.I;
                j80.a(frameLayout, frameLayout2, fArr);
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
                Paint paint6 = (Paint) this.b;
                ns nsVar = (ns) this.c;
                g9 g9Var = nsVar.e;
                if (g9Var != null && g9Var.getImageReceiver().L()) {
                    paint6.setAlpha((int) (nsVar.e.getImageReceiver().h1 * 85.0f));
                    canvas.drawCircle(getMeasuredWidth() / 2.0f, getMeasuredHeight() / 2.0f, getMeasuredWidth() / 2.0f, paint6);
                    break;
                }
                break;
            case 10:
                canvas.drawColor(855638016);
                gz gzVar = (gz) this.c;
                FrameLayout frameLayout3 = gzVar.a;
                FrameLayout frameLayout4 = (FrameLayout) this.b;
                float[] fArr2 = gzVar.D;
                bz.a(frameLayout3, frameLayout4, fArr2);
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
                Paint paint7 = (Paint) this.b;
                c60 c60Var = (c60) this.c;
                if (c60Var.d != null && c60Var.n.getVisibility() == 0 && c60Var.d.getImageReceiver().L()) {
                    paint7.setAlpha((int) (c60Var.n.getAlpha() * c60Var.d.getImageReceiver().h1 * 85.0f));
                    canvas.drawCircle(getMeasuredWidth() / 2.0f, getMeasuredHeight() / 2.0f, getMeasuredWidth() / 2.0f, paint7);
                    break;
                }
                break;
            case 13:
                Paint paint8 = (Paint) this.b;
                wd0 wd0Var = (wd0) this.c;
                id idVar = wd0Var.r;
                ag.d2 d2Var3 = wd0Var.e;
                if (d2Var3 != null && idVar.getVisibility() == 0) {
                    paint8.setAlpha((int) (idVar.getAlpha() * d2Var3.getImageReceiver().h1 * 85.0f));
                    canvas.drawCircle(getMeasuredWidth() / 2.0f, getMeasuredHeight() / 2.0f, getMeasuredWidth() / 2.0f, paint8);
                    break;
                }
                break;
            case 14:
                if (((i31) this.c).Q0) {
                    canvas.drawColor(t6.w0(t6.G8, (p6) this.b));
                    break;
                } else {
                    dispatchDraw(canvas);
                    break;
                }
            case 15:
                m91 m91Var = (m91) this.c;
                int currentItem = m91Var.k0.getCurrentItem();
                Paint paint9 = (Paint) this.b;
                int i13 = t6.pf;
                paint9.setColor(m91Var.d ? t6.F0(i13) : m91Var.getThemedColor(i13));
                int i14 = 0;
                while (i14 < 2) {
                    paint9.setAlpha(i14 == currentItem ? zs.e4 : zs.L1);
                    canvas.drawCircle(org.telegram.messenger.i0.L((i14 * 15) + 3), org.telegram.messenger.i0.L(4.0f), org.telegram.messenger.i0.L(3.0f), paint9);
                    i14++;
                }
                break;
            case 16:
                Paint paint10 = (Paint) this.b;
                paint10.setColor(t6.x0(null, t6.d6, false));
                int measuredHeight3 = getMeasuredHeight() - org.telegram.messenger.i0.L(3.0f);
                canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), measuredHeight3, paint10);
                z4Var = ((org.telegram.ui.ActionBar.k2) ((tc1) this.c)).parentLayout;
                ((ActionBarLayout) z4Var).q(canvas, measuredHeight3);
                break;
            case 17:
                super.onDraw(canvas);
                int save = canvas.save();
                canvas.scale(getWidth() / 336.0f, getHeight() / 205.0f);
                c6 c6Var = ((g6) this.c).b;
                if (c6Var != null) {
                    c6Var.e(canvas, (float[]) this.b);
                } else {
                    canvas.drawColor(v7.a(-16216082, (float[]) this.b));
                }
                canvas.restoreToCount(save);
                break;
            case 18:
                Paint paint11 = (Paint) this.b;
                paint11.setStrokeWidth(org.telegram.messenger.i0.N(1.66f));
                canvas.drawCircle(getWidth() / 2.0f, getHeight() / 2.0f, org.telegram.messenger.i0.L(10.0f), paint11);
                kf0 kf0Var = (kf0) this.c;
                kf0Var.setBounds(0, 0, org.telegram.messenger.i0.L(10.0f), org.telegram.messenger.i0.L(10.0f));
                canvas.save();
                canvas.translate((getWidth() - org.telegram.messenger.i0.L(10.0f)) / 2.0f, (getHeight() - org.telegram.messenger.i0.L(10.0f)) / 2.0f);
                kf0Var.draw(canvas);
                canvas.restore();
                break;
            case 19:
                Paint paint12 = (Paint) this.b;
                yh.l lVar = (yh.l) this.c;
                g9 g9Var2 = lVar.x;
                if (g9Var2 != null && g9Var2.getImageReceiver().L()) {
                    paint12.setColor(1426063360);
                    paint12.setAlpha((int) (lVar.x.getImageReceiver().h1 * 85.0f));
                    canvas.drawRoundRect(0.0f, 0.0f, getWidth(), getHeight(), org.telegram.messenger.i0.L(20.0f), org.telegram.messenger.i0.L(20.0f), paint12);
                    break;
                }
                break;
        }
    }

    @Override // android.view.View
    public void onMeasure(int i10, int i11) {
        switch (this.a) {
            case 18:
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.i0.L(56.0f), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.i0.L(56.0f), TLObject.FLAG_30));
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
                q9 q9Var = (q9) this.b;
                f0 f0Var = q9Var.d;
                if (q9Var.g != null && f0Var.getMeasuredHeight() != 0 && f0Var.getMeasuredWidth() != 0) {
                    q9Var.a();
                    q9Var.q = f0Var.getMeasuredHeight();
                    q9Var.r = f0Var.getMeasuredWidth();
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
                View view = ((un) this.c).fragmentView;
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
                ((g20) this.c).d.setAlpha(f7);
                break;
        }
    }

    @Override // android.view.View
    public void setScaleX(float f7) {
        switch (this.a) {
            case 6:
                super.setScaleX(f7);
                ((g20) this.c).d.setScaleX(f7);
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
                ((g20) this.c).d.setScaleY(f7);
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
                ((g20) this.c).d.setTranslationY(f7);
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
                View view = ((un) this.c).fragmentView;
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

    @Override // fe.e
    public void v(int i10, float f7, float f10, fe.f fVar) {
        setVisibility(f7 > 0.0f ? 0 : 8);
        setAlpha(f7);
    }

    @Override // android.view.View
    public boolean verifyDrawable(Drawable drawable) {
        switch (this.a) {
            case 8:
                return ((org.telegram.ui.Cells.y) this.b) == drawable || super.verifyDrawable(drawable);
            case 18:
                return drawable == ((kf0) this.c) || super.verifyDrawable(drawable);
            default:
                return super.verifyDrawable(drawable);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f0(Context context, z4 z4Var) {
        super(context);
        this.a = 12;
        this.c = new fe.b(0, this, gr.h, 380L, true);
        this.b = z4Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f0(Activity activity) {
        super(activity);
        this.a = 18;
        Paint paint = new Paint(1);
        this.b = paint;
        kf0 kf0Var = new kf0(10);
        this.c = kf0Var;
        paint.setColor(-1);
        paint.setShadowLayer(1.0f, 0.0f, 0.0f, 419430400);
        paint.setStyle(Paint.Style.STROKE);
        kf0Var.setCallback(this);
        kf0Var.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f0(yh.l lVar, Context context) {
        super(context);
        this.a = 19;
        this.c = lVar;
        this.b = new Paint(1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f0(g20 g20Var, Context context) {
        super(context);
        this.a = 6;
        this.c = g20Var;
        this.b = new Paint(1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f0(Context context, Paint paint, Drawable drawable) {
        super(context);
        this.a = 0;
        this.b = paint;
        this.c = drawable;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f0(g6 g6Var, Context context) {
        super(context);
        this.a = 17;
        this.c = g6Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f0(tc1 tc1Var, Context context) {
        super(context);
        this.a = 16;
        this.c = tc1Var;
        this.b = new Paint();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f0(Context context, m91 m91Var) {
        super(context);
        this.a = 15;
        this.c = m91Var;
        this.b = new Paint(1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f0(un unVar, Context context) {
        super(context);
        this.a = 3;
        this.c = unVar;
        this.b = new RectF();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f0(un unVar, Context context, View view, p6 p6Var) {
        super(context);
        this.a = 4;
        this.c = unVar;
        q9 q9Var = new q9(view, this, p6Var);
        this.b = q9Var;
        q9Var.p = false;
        q9Var.n = true;
    }

    @Override // fe.e
    public /* synthetic */ void E(float f7, int i10) {
    }
}
