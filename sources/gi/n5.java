package gi;

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
import org.telegram.messenger.hs;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.Components.je0;
import org.telegram.ui.Components.l10;
import org.telegram.ui.Components.m70;
import org.telegram.ui.Components.uq;
import org.telegram.ui.Components.vf;
import org.telegram.ui.Components.xq;
import org.telegram.ui.ad;
import org.telegram.ui.g11;
import org.telegram.ui.l71;
import org.telegram.ui.ln;
import org.telegram.ui.lr;
import org.telegram.ui.nc0;
import org.telegram.ui.ra1;
import org.telegram.ui.u10;
import org.telegram.ui.um;
import org.telegram.ui.ux;
import org.telegram.ui.wm;
import org.telegram.ui.y40;
import org.telegram.ui.yc;
import org.telegram.ui.zx;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class n5 extends View implements qe.b {
    public final /* synthetic */ int a;
    public Object b;
    public final Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ n5(Object obj, Context context, Object obj2, int i3) {
        super(context);
        this.a = i3;
        this.c = obj;
        this.b = obj2;
    }

    @Override // qe.b
    public void Y(int i3, float f10, float f11, qe.c cVar) {
        setVisibility(f10 > 0.0f ? 0 : 8);
        setAlpha(f10);
    }

    public boolean a() {
        org.telegram.ui.Components.v9 v9Var = (org.telegram.ui.Components.v9) this.b;
        if (v9Var.t) {
            return (v9Var.m == 1.0f || !v9Var.p) && v9Var.n && v9Var.d.getAlpha() == 1.0f && getVisibility() == 0;
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
                wm wmVar = (wm) this.c;
                int backgroundSizeY = wmVar.m1.getBackgroundSizeY();
                float x10 = getX();
                float j92 = wmVar.j9(this);
                um umVar = wmVar.ya;
                if (umVar != null) {
                    umVar.b(x10, j92, measuredWidth, backgroundSizeY);
                } else {
                    org.telegram.ui.ActionBar.k6.r(x10, j92, measuredWidth, backgroundSizeY);
                }
                canvas.drawRoundRect(rectF, org.telegram.messenger.g0.L(18.0f), org.telegram.messenger.g0.L(18.0f), wmVar.getThemedPaint("paintChatActionBackground"));
                um umVar2 = wmVar.ya;
                if (umVar2 == null ? org.telegram.ui.ActionBar.k6.d1() : umVar2.g()) {
                    canvas.drawRoundRect(rectF, org.telegram.messenger.g0.L(18.0f), org.telegram.messenger.g0.L(18.0f), wmVar.getThemedPaint("paintChatActionBackgroundDarken"));
                }
                super.dispatchDraw(canvas);
                break;
            case 9:
                u10 u10Var = (u10) this.c;
                float measuredWidth2 = u10Var.e0.getMeasuredWidth();
                uq uqVar = u10Var.d0;
                float measuredWidth3 = (u10Var.f0.getMeasuredWidth() * uqVar.g) + ((1.0f - uqVar.g) * measuredWidth2);
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
        boolean z10;
        ?? r15;
        org.telegram.ui.ActionBar.q4 q4Var;
        switch (this.a) {
            case 0:
                Paint paint = (Paint) this.b;
                paint.setStrokeWidth(org.telegram.messenger.g0.N(1.66f));
                canvas.drawCircle(getWidth() / 2.0f, getHeight() / 2.0f, org.telegram.messenger.g0.L(10.0f), paint);
                je0 je0Var = (je0) this.c;
                je0Var.setBounds(0, 0, org.telegram.messenger.g0.L(10.0f), org.telegram.messenger.g0.L(10.0f));
                canvas.save();
                canvas.translate((getWidth() - org.telegram.messenger.g0.L(10.0f)) / 2.0f, (getHeight() - org.telegram.messenger.g0.L(10.0f)) / 2.0f);
                je0Var.draw(canvas);
                canvas.restore();
                break;
            case 1:
                Paint paint2 = (Paint) this.b;
                ji.n nVar = (ji.n) this.c;
                org.telegram.ui.Components.k9 k9Var = nVar.x;
                if (k9Var != null && k9Var.getImageReceiver().L()) {
                    paint2.setColor(1426063360);
                    paint2.setAlpha((int) (nVar.x.getImageReceiver().i1 * 85.0f));
                    canvas.drawRoundRect(0.0f, 0.0f, getWidth(), getHeight(), org.telegram.messenger.g0.L(20.0f), org.telegram.messenger.g0.L(20.0f), paint2);
                    break;
                }
                break;
            case 2:
                super.onDraw(canvas);
                int paddingLeft = getPaddingLeft();
                float width = ((getWidth() - paddingLeft) - getPaddingRight()) / 7.0f;
                for (int i3 = 0; i3 < 7; i3++) {
                    canvas.drawText(((String[]) this.b)[i3], (width / 2.0f) + (i3 * width) + paddingLeft, ((getMeasuredHeight() - org.telegram.messenger.g0.L(2.0f)) / 2.0f) + org.telegram.messenger.g0.L(5.0f), ((org.telegram.ui.i8) this.c).f);
                }
                break;
            case 3:
                Paint paint3 = (Paint) this.b;
                ad adVar = (ad) this.c;
                ei.d4 d4Var = adVar.f;
                if (d4Var != null && d4Var.getImageReceiver().L()) {
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
                org.telegram.ui.Components.v9 v9Var = (org.telegram.ui.Components.v9) this.b;
                Paint paint4 = v9Var.x;
                org.telegram.ui.ActionBar.e6 e6Var = v9Var.y;
                Paint paint5 = v9Var.w;
                int i10 = v9Var.b;
                View view = v9Var.c;
                n5 n5Var = v9Var.d;
                if (n5Var != null) {
                    if (n5Var.getMeasuredHeight() != 0 || n5Var.getMeasuredWidth() != 0) {
                        if (i10 == 1 && !v9Var.t && !v9Var.p) {
                            v9Var.a();
                            v9Var.l = false;
                        }
                        Bitmap[] bitmapArr2 = v9Var.g;
                        if ((bitmapArr2 != null || v9Var.o) && v9Var.p) {
                            boolean z11 = v9Var.n;
                            if (z11) {
                                float f11 = v9Var.m;
                                if (f11 != 1.0f) {
                                    float f12 = f11 + 0.09f;
                                    v9Var.m = f12;
                                    if (f12 > 1.0f) {
                                        v9Var.m = 1.0f;
                                    }
                                    n5Var.invalidate();
                                }
                            }
                            if (!z11) {
                                float f13 = v9Var.m;
                                if (f13 != 0.0f) {
                                    float f14 = f13 - 0.09f;
                                    v9Var.m = f14;
                                    if (f14 < 0.0f) {
                                        v9Var.m = 0.0f;
                                    }
                                    n5Var.invalidate();
                                }
                            }
                        }
                        float f15 = v9Var.p ? v9Var.m : 1.0f;
                        if (bitmapArr2 == null && v9Var.o) {
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
                                canvas.saveLayerAlpha(0.0f, 0.0f, n5Var.getMeasuredWidth(), n5Var.getMeasuredHeight(), (int) (f15 * 255.0f), 31);
                            }
                            if (bitmapArr != null) {
                                paint5.setAlpha((int) (f15 * 255.0f));
                                if (i10 == r15) {
                                    canvas.translate(f10, v9Var.u);
                                }
                                canvas.save();
                                canvas.scale(n5Var.getMeasuredWidth() / bitmapArr[r15].getWidth(), n5Var.getMeasuredHeight() / bitmapArr[r15].getHeight());
                                canvas.drawBitmap(bitmapArr[r15], f10, f10, paint5);
                                canvas.restore();
                                canvas.save();
                                if (i10 == 0) {
                                    canvas.translate(f10, v9Var.u);
                                }
                                canvas.scale(n5Var.getMeasuredWidth() / bitmapArr[z10].getWidth(), v9Var.s / bitmapArr[z10].getHeight());
                                canvas.drawBitmap(bitmapArr[z10], f10, f10, paint5);
                                canvas.restore();
                                v9Var.t = r15;
                                canvas.drawColor(436207616);
                            }
                            canvas.restore();
                            if (v9Var.n && !v9Var.k) {
                                if (v9Var.g == null || v9Var.l) {
                                    v9Var.k = r15;
                                    v9Var.l = z10;
                                    if (v9Var.e == null) {
                                        v9Var.e = new Bitmap[2];
                                        v9Var.j = new Canvas[2];
                                    }
                                    for (int i11 = 0; i11 < 2; i11++) {
                                        if (v9Var.e[i11] != null && n5Var.getMeasuredWidth() == v9Var.r && n5Var.getMeasuredHeight() == v9Var.q) {
                                            v9Var.e[i11].eraseColor(0);
                                        } else {
                                            int measuredHeight = n5Var.getMeasuredHeight();
                                            int measuredWidth = n5Var.getMeasuredWidth();
                                            int L = org.telegram.messenger.g0.L(200.0f) + org.telegram.messenger.g0.m;
                                            v9Var.s = L;
                                            if (i11 == 0) {
                                                measuredHeight = L;
                                            }
                                            try {
                                                v9Var.e[i11] = Bitmap.createBitmap((int) (measuredWidth / 15.0f), (int) (measuredHeight / 15.0f), Bitmap.Config.ARGB_8888);
                                                v9Var.j[i11] = new Canvas(v9Var.e[i11]);
                                            } catch (Exception e10) {
                                                org.telegram.messenger.a8.g(e10, r15);
                                                org.telegram.messenger.g0.h3(new vf(v9Var, 11));
                                                return;
                                            }
                                        }
                                        if (i11 == r15) {
                                            v9Var.e[i11].eraseColor(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.d6, e6Var));
                                        }
                                        v9Var.j[i11].save();
                                        v9Var.j[i11].scale(0.06666667f, 0.06666667f, f10, f10);
                                        Drawable background = view.getBackground();
                                        if (background == null) {
                                            background = e6Var instanceof um ? ((um) e6Var).m() : org.telegram.ui.ActionBar.k6.t0();
                                        }
                                        view.setTag(67108867, Integer.valueOf(i11));
                                        if (i11 == 0) {
                                            v9Var.j[i11].translate(f10, -v9Var.u);
                                            view.draw(v9Var.j[i11]);
                                        }
                                        if (background != null && i11 == r15) {
                                            Rect bounds = background.getBounds();
                                            background.setBounds(0, 0, view.getMeasuredWidth(), view.getMeasuredHeight());
                                            background.draw(v9Var.j[i11]);
                                            background.setBounds(bounds);
                                            view.draw(v9Var.j[i11]);
                                        }
                                        view.setTag(67108867, null);
                                        v9Var.j[i11].restore();
                                    }
                                    v9Var.q = n5Var.getMeasuredHeight();
                                    v9Var.r = n5Var.getMeasuredWidth();
                                    v9Var.v.b = n5Var.getMeasuredWidth();
                                    v9Var.v.c = n5Var.getMeasuredHeight();
                                    org.telegram.ui.Components.u9 u9Var = v9Var.v;
                                    if (u9Var.b != 0 && u9Var.c != 0) {
                                        if (v9Var.a == null) {
                                            v9Var.a = new org.telegram.messenger.q5("blur_thread_" + v9Var, (boolean) r15);
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
                ln lnVar = (ln) this.c;
                ei.d4 d4Var2 = lnVar.e;
                if (d4Var2 != null && d4Var2.getImageReceiver().L()) {
                    paint6.setAlpha((int) (lnVar.e.getImageReceiver().i1 * 85.0f));
                    canvas.drawCircle(getMeasuredWidth() / 2.0f, getMeasuredHeight() / 2.0f, getMeasuredWidth() / 2.0f, paint6);
                    break;
                }
                break;
            case 7:
                Paint paint7 = (Paint) this.b;
                l10 l10Var = (l10) this.c;
                boolean z12 = l10Var.E;
                if (z12) {
                    float f16 = l10Var.F;
                    if (f16 != 1.0f) {
                        float f17 = f16 + 0.064f;
                        l10Var.F = f17;
                        if (f17 > 1.0f) {
                            l10Var.F = 1.0f;
                        }
                        invalidate();
                        paint7.setColor(i0.a.f(l10Var.F, 1711607061, 1714752530));
                        canvas.drawCircle(getMeasuredWidth() / 2.0f, (getMeasuredHeight() / 2.0f) - org.telegram.messenger.g0.L(25.0f), (org.telegram.messenger.g0.L(5.0f) * l10Var.F) + org.telegram.messenger.g0.L(35.0f), paint7);
                        break;
                    }
                }
                if (!z12) {
                    float f18 = l10Var.F;
                    if (f18 != 0.0f) {
                        float f19 = f18 - 0.064f;
                        l10Var.F = f19;
                        if (f19 < 0.0f) {
                            l10Var.F = 0.0f;
                        }
                        invalidate();
                    }
                }
                paint7.setColor(i0.a.f(l10Var.F, 1711607061, 1714752530));
                canvas.drawCircle(getMeasuredWidth() / 2.0f, (getMeasuredHeight() / 2.0f) - org.telegram.messenger.g0.L(25.0f), (org.telegram.messenger.g0.L(5.0f) * l10Var.F) + org.telegram.messenger.g0.L(35.0f), paint7);
            case 8:
                canvas.drawColor(855638016);
                m70 m70Var = (m70) this.c;
                FrameLayout frameLayout = m70Var.n;
                FrameLayout frameLayout2 = (FrameLayout) this.b;
                float[] fArr = m70Var.J;
                m70.a(frameLayout, frameLayout2, fArr);
                canvas.save();
                float y9 = frameLayout.getY() + ((View) frameLayout.getParent()).getY();
                if (y9 < 1.0f) {
                    canvas.clipRect(0.0f, (fArr[1] - y9) + 1.0f, getMeasuredWidth(), getMeasuredHeight());
                }
                canvas.translate(fArr[0], fArr[1]);
                frameLayout.draw(canvas);
                canvas.restore();
                break;
            case 10:
                Paint paint8 = (Paint) this.b;
                lr lrVar = (lr) this.c;
                org.telegram.ui.Components.k9 k9Var2 = lrVar.e;
                if (k9Var2 != null && k9Var2.getImageReceiver().L()) {
                    paint8.setAlpha((int) (lrVar.e.getImageReceiver().i1 * 85.0f));
                    canvas.drawCircle(getMeasuredWidth() / 2.0f, getMeasuredHeight() / 2.0f, getMeasuredWidth() / 2.0f, paint8);
                    break;
                }
                break;
            case 11:
                canvas.drawColor(855638016);
                zx zxVar = (zx) this.c;
                FrameLayout frameLayout3 = zxVar.a;
                FrameLayout frameLayout4 = (FrameLayout) this.b;
                float[] fArr2 = zxVar.E;
                ux.a(frameLayout3, frameLayout4, fArr2);
                canvas.save();
                float y10 = frameLayout3.getY() + ((View) frameLayout3.getParent()).getY();
                if (y10 < 1.0f) {
                    canvas.clipRect(0.0f, (fArr2[1] - y10) + 1.0f, getMeasuredWidth(), getMeasuredHeight());
                }
                canvas.translate(fArr2[0], fArr2[1]);
                frameLayout3.draw(canvas);
                canvas.restore();
                break;
            case 12:
                Paint paint9 = (Paint) this.b;
                y40 y40Var = (y40) this.c;
                if (y40Var.d != null && y40Var.n.getVisibility() == 0 && y40Var.d.getImageReceiver().L()) {
                    paint9.setAlpha((int) (y40Var.n.getAlpha() * y40Var.d.getImageReceiver().i1 * 85.0f));
                    canvas.drawCircle(getMeasuredWidth() / 2.0f, getMeasuredHeight() / 2.0f, getMeasuredWidth() / 2.0f, paint9);
                    break;
                }
                break;
            case 14:
                Paint paint10 = (Paint) this.b;
                nc0 nc0Var = (nc0) this.c;
                yc ycVar = nc0Var.r;
                ei.d4 d4Var3 = nc0Var.e;
                if (d4Var3 != null && ycVar.getVisibility() == 0) {
                    paint10.setAlpha((int) (ycVar.getAlpha() * d4Var3.getImageReceiver().i1 * 85.0f));
                    canvas.drawCircle(getMeasuredWidth() / 2.0f, getMeasuredHeight() / 2.0f, getMeasuredWidth() / 2.0f, paint10);
                    break;
                }
                break;
            case 15:
                if (((g11) this.c).R0) {
                    canvas.drawColor(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.G8, (org.telegram.ui.ActionBar.e6) this.b));
                    break;
                } else {
                    dispatchDraw(canvas);
                    break;
                }
            case 16:
                l71 l71Var = (l71) this.c;
                int currentItem = l71Var.l0.getCurrentItem();
                Paint paint11 = (Paint) this.b;
                int i12 = org.telegram.ui.ActionBar.k6.pf;
                paint11.setColor(l71Var.d ? org.telegram.ui.ActionBar.k6.F0(i12) : l71Var.getThemedColor(i12));
                int i13 = 0;
                while (i13 < 2) {
                    paint11.setAlpha(i13 == currentItem ? hs.e4 : hs.L1);
                    canvas.drawCircle(org.telegram.messenger.g0.L((i13 * 15) + 3), org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(3.0f), paint11);
                    i13++;
                }
                break;
            case 17:
                Paint paint12 = (Paint) this.b;
                paint12.setColor(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.d6, false));
                int measuredHeight2 = getMeasuredHeight() - org.telegram.messenger.g0.L(3.0f);
                canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), measuredHeight2, paint12);
                q4Var = ((org.telegram.ui.ActionBar.d2) ((ra1) this.c)).parentLayout;
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
                    canvas.drawColor(org.telegram.ui.Wallet.p7.a(-16216082, (float[]) this.b));
                }
                canvas.restoreToCount(save);
                break;
            case 19:
                float measuredWidth2 = getMeasuredWidth() / 2.0f;
                float measuredHeight3 = getMeasuredHeight() / 2.0f;
                canvas.drawCircle(measuredWidth2, measuredHeight3, getMeasuredWidth() / 2.0f, (Paint) this.b);
                ha.e.d().f(-org.telegram.messenger.g0.L(10.0f), 0.0f, getMeasuredWidth(), getMeasuredHeight());
                canvas.drawCircle(measuredWidth2, measuredHeight3, (getMeasuredWidth() / 2.0f) - org.telegram.messenger.g0.L(2.0f), ha.e.d().e());
                float L2 = org.telegram.messenger.g0.L(18.0f) / 2.0f;
                Drawable drawable = (Drawable) this.c;
                drawable.setBounds((int) (measuredWidth2 - L2), (int) (measuredHeight3 - L2), (int) (measuredWidth2 + L2), (int) (measuredHeight3 + L2));
                drawable.draw(canvas);
                break;
        }
    }

    @Override // android.view.View
    public void onMeasure(int i3, int i10) {
        switch (this.a) {
            case 0:
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(56.0f), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(56.0f), TLObject.FLAG_30));
                break;
            default:
                super.onMeasure(i3, i10);
                break;
        }
    }

    @Override // android.view.View
    public void onSizeChanged(int i3, int i10, int i11, int i12) {
        switch (this.a) {
            case 5:
                super.onSizeChanged(i3, i10, i11, i12);
                org.telegram.ui.Components.v9 v9Var = (org.telegram.ui.Components.v9) this.b;
                n5 n5Var = v9Var.d;
                if (v9Var.g != null && n5Var.getMeasuredHeight() != 0 && n5Var.getMeasuredWidth() != 0) {
                    v9Var.a();
                    v9Var.q = n5Var.getMeasuredHeight();
                    v9Var.r = n5Var.getMeasuredWidth();
                    break;
                }
                break;
            default:
                super.onSizeChanged(i3, i10, i11, i12);
                break;
        }
    }

    @Override // android.view.View
    public void setAlpha(float f10) {
        switch (this.a) {
            case 5:
                super.setAlpha(f10);
                View view = ((wm) this.c).fragmentView;
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
                ((l10) this.c).d.setAlpha(f10);
                break;
        }
    }

    @Override // android.view.View
    public void setScaleX(float f10) {
        switch (this.a) {
            case 7:
                super.setScaleX(f10);
                ((l10) this.c).d.setScaleX(f10);
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
                ((l10) this.c).d.setScaleY(f10);
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
                ((l10) this.c).d.setTranslationY(f10);
                break;
            default:
                super.setTranslationY(f10);
                break;
        }
    }

    @Override // android.view.View
    public void setVisibility(int i3) {
        switch (this.a) {
            case 5:
                super.setVisibility(i3);
                View view = ((wm) this.c).fragmentView;
                if (view != null) {
                    view.invalidate();
                    break;
                }
                break;
            default:
                super.setVisibility(i3);
                break;
        }
    }

    @Override // android.view.View
    public boolean verifyDrawable(Drawable drawable) {
        switch (this.a) {
            case 0:
                return drawable == ((je0) this.c) || super.verifyDrawable(drawable);
            case 9:
                return ((org.telegram.ui.Cells.y) this.b) == drawable || super.verifyDrawable(drawable);
            default:
                return super.verifyDrawable(drawable);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n5(Context context, org.telegram.ui.ActionBar.q4 q4Var) {
        super(context);
        this.a = 13;
        this.c = new qe.a(0, this, xq.h, 380L, true);
        this.b = q4Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n5(Activity activity) {
        super(activity);
        this.a = 0;
        Paint paint = new Paint(1);
        this.b = paint;
        je0 je0Var = new je0(10);
        this.c = je0Var;
        paint.setColor(-1);
        paint.setShadowLayer(1.0f, 0.0f, 0.0f, 419430400);
        paint.setStyle(Paint.Style.STROKE);
        je0Var.setCallback(this);
        je0Var.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n5(ji.n nVar, Context context) {
        super(context);
        this.a = 1;
        this.c = nVar;
        this.b = new Paint(1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n5(l10 l10Var, Context context) {
        super(context);
        this.a = 7;
        this.c = l10Var;
        this.b = new Paint(1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n5(Context context, Paint paint, Drawable drawable) {
        super(context);
        this.a = 19;
        this.b = paint;
        this.c = drawable;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n5(org.telegram.ui.Wallet.a6 a6Var, Context context) {
        super(context);
        this.a = 18;
        this.c = a6Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n5(ra1 ra1Var, Context context) {
        super(context);
        this.a = 17;
        this.c = ra1Var;
        this.b = new Paint();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n5(Context context, l71 l71Var) {
        super(context);
        this.a = 16;
        this.c = l71Var;
        this.b = new Paint(1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n5(wm wmVar, Context context) {
        super(context);
        this.a = 4;
        this.c = wmVar;
        this.b = new RectF();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n5(wm wmVar, Context context, View view, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context);
        this.a = 5;
        this.c = wmVar;
        org.telegram.ui.Components.v9 v9Var = new org.telegram.ui.Components.v9(view, this, e6Var);
        this.b = v9Var;
        v9Var.p = false;
        v9Var.n = true;
    }

    @Override // qe.b
    public /* synthetic */ void F(float f10, int i3) {
    }
}
