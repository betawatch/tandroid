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
import org.telegram.messenger.ns;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.Components.br;
import org.telegram.ui.Components.dg;
import org.telegram.ui.Components.er;
import org.telegram.ui.Components.ke0;
import org.telegram.ui.Components.s10;
import org.telegram.ui.Components.t70;
import org.telegram.ui.ad;
import org.telegram.ui.an;
import org.telegram.ui.c50;
import org.telegram.ui.fy;
import org.telegram.ui.n11;
import org.telegram.ui.oc0;
import org.telegram.ui.pr;
import org.telegram.ui.qn;
import org.telegram.ui.t71;
import org.telegram.ui.xa1;
import org.telegram.ui.y10;
import org.telegram.ui.yc;
import org.telegram.ui.ym;
import org.telegram.ui.zx;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final class n5 extends View implements te.b {
    public final /* synthetic */ int a;
    public Object b;
    public final Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ n5(Object obj, Context context, Object obj2, int i7) {
        super(context);
        this.a = i7;
        this.c = obj;
        this.b = obj2;
    }

    @Override // te.b
    public void G(int i7, float f10, float f11, te.c cVar) {
        setVisibility(f10 > 0.0f ? 0 : 8);
        setAlpha(f10);
    }

    public boolean a() {
        org.telegram.ui.Components.s9 s9Var = (org.telegram.ui.Components.s9) this.b;
        if (s9Var.t) {
            return (s9Var.m == 1.0f || !s9Var.p) && s9Var.n && s9Var.d.getAlpha() == 1.0f && getVisibility() == 0;
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
                an anVar = (an) this.c;
                int backgroundSizeY = anVar.m1.getBackgroundSizeY();
                float x10 = getX();
                float l92 = anVar.l9(this);
                ym ymVar = anVar.Aa;
                if (ymVar != null) {
                    ymVar.b(x10, l92, measuredWidth, backgroundSizeY);
                } else {
                    org.telegram.ui.ActionBar.j6.r(x10, l92, measuredWidth, backgroundSizeY);
                }
                canvas.drawRoundRect(rectF, org.telegram.messenger.g0.L(18.0f), org.telegram.messenger.g0.L(18.0f), anVar.getThemedPaint("paintChatActionBackground"));
                ym ymVar2 = anVar.Aa;
                if (ymVar2 == null ? org.telegram.ui.ActionBar.j6.d1() : ymVar2.g()) {
                    canvas.drawRoundRect(rectF, org.telegram.messenger.g0.L(18.0f), org.telegram.messenger.g0.L(18.0f), anVar.getThemedPaint("paintChatActionBackgroundDarken"));
                }
                super.dispatchDraw(canvas);
                break;
            case 9:
                y10 y10Var = (y10) this.c;
                float measuredWidth2 = y10Var.e0.getMeasuredWidth();
                br brVar = y10Var.d0;
                float measuredWidth3 = (y10Var.f0.getMeasuredWidth() * brVar.g) + ((1.0f - brVar.g) * measuredWidth2);
                canvas.save();
                org.telegram.ui.Cells.y yVar = (org.telegram.ui.Cells.y) this.b;
                yVar.setBounds(0, 0, org.telegram.messenger.g0.L(50.0f) + ((int) measuredWidth3), getMeasuredHeight());
                yVar.draw(canvas);
                super.dispatchDraw(canvas);
                break;
            case 13:
                super.dispatchDraw(canvas);
                ((ActionBarLayout) ((org.telegram.ui.ActionBar.o4) this.b)).q(canvas, 0);
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
        org.telegram.ui.ActionBar.o4 o4Var;
        switch (this.a) {
            case 0:
                Paint paint = (Paint) this.b;
                paint.setStrokeWidth(org.telegram.messenger.g0.N(1.66f));
                canvas.drawCircle(getWidth() / 2.0f, getHeight() / 2.0f, org.telegram.messenger.g0.L(10.0f), paint);
                ke0 ke0Var = (ke0) this.c;
                ke0Var.setBounds(0, 0, org.telegram.messenger.g0.L(10.0f), org.telegram.messenger.g0.L(10.0f));
                canvas.save();
                canvas.translate((getWidth() - org.telegram.messenger.g0.L(10.0f)) / 2.0f, (getHeight() - org.telegram.messenger.g0.L(10.0f)) / 2.0f);
                ke0Var.draw(canvas);
                canvas.restore();
                break;
            case 1:
                Paint paint2 = (Paint) this.b;
                li.n nVar = (li.n) this.c;
                org.telegram.ui.Components.i9 i9Var = nVar.x;
                if (i9Var != null && i9Var.getImageReceiver().L()) {
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
                for (int i7 = 0; i7 < 7; i7++) {
                    canvas.drawText(((String[]) this.b)[i7], (width / 2.0f) + (i7 * width) + paddingLeft, ((getMeasuredHeight() - org.telegram.messenger.g0.L(2.0f)) / 2.0f) + org.telegram.messenger.g0.L(5.0f), ((org.telegram.ui.i8) this.c).f);
                }
                break;
            case 3:
                Paint paint3 = (Paint) this.b;
                ad adVar = (ad) this.c;
                fi.v3 v3Var = adVar.f;
                if (v3Var != null && v3Var.getImageReceiver().L()) {
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
                org.telegram.ui.Components.s9 s9Var = (org.telegram.ui.Components.s9) this.b;
                Paint paint4 = s9Var.x;
                org.telegram.ui.ActionBar.e6 e6Var = s9Var.y;
                Paint paint5 = s9Var.w;
                int i10 = s9Var.b;
                View view = s9Var.c;
                n5 n5Var = s9Var.d;
                if (n5Var != null) {
                    if (n5Var.getMeasuredHeight() != 0 || n5Var.getMeasuredWidth() != 0) {
                        if (i10 == 1 && !s9Var.t && !s9Var.p) {
                            s9Var.a();
                            s9Var.l = false;
                        }
                        Bitmap[] bitmapArr2 = s9Var.g;
                        if ((bitmapArr2 != null || s9Var.o) && s9Var.p) {
                            boolean z11 = s9Var.n;
                            if (z11) {
                                float f11 = s9Var.m;
                                if (f11 != 1.0f) {
                                    float f12 = f11 + 0.09f;
                                    s9Var.m = f12;
                                    if (f12 > 1.0f) {
                                        s9Var.m = 1.0f;
                                    }
                                    n5Var.invalidate();
                                }
                            }
                            if (!z11) {
                                float f13 = s9Var.m;
                                if (f13 != 0.0f) {
                                    float f14 = f13 - 0.09f;
                                    s9Var.m = f14;
                                    if (f14 < 0.0f) {
                                        s9Var.m = 0.0f;
                                    }
                                    n5Var.invalidate();
                                }
                            }
                        }
                        float f15 = s9Var.p ? s9Var.m : 1.0f;
                        if (bitmapArr2 == null && s9Var.o) {
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
                                    canvas.translate(f10, s9Var.u);
                                }
                                canvas.save();
                                canvas.scale(n5Var.getMeasuredWidth() / bitmapArr[r15].getWidth(), n5Var.getMeasuredHeight() / bitmapArr[r15].getHeight());
                                canvas.drawBitmap(bitmapArr[r15], f10, f10, paint5);
                                canvas.restore();
                                canvas.save();
                                if (i10 == 0) {
                                    canvas.translate(f10, s9Var.u);
                                }
                                canvas.scale(n5Var.getMeasuredWidth() / bitmapArr[z10].getWidth(), s9Var.s / bitmapArr[z10].getHeight());
                                canvas.drawBitmap(bitmapArr[z10], f10, f10, paint5);
                                canvas.restore();
                                s9Var.t = r15;
                                canvas.drawColor(436207616);
                            }
                            canvas.restore();
                            if (s9Var.n && !s9Var.k) {
                                if (s9Var.g == null || s9Var.l) {
                                    s9Var.k = r15;
                                    s9Var.l = z10;
                                    if (s9Var.e == null) {
                                        s9Var.e = new Bitmap[2];
                                        s9Var.j = new Canvas[2];
                                    }
                                    for (int i11 = 0; i11 < 2; i11++) {
                                        if (s9Var.e[i11] != null && n5Var.getMeasuredWidth() == s9Var.r && n5Var.getMeasuredHeight() == s9Var.q) {
                                            s9Var.e[i11].eraseColor(0);
                                        } else {
                                            int measuredHeight = n5Var.getMeasuredHeight();
                                            int measuredWidth = n5Var.getMeasuredWidth();
                                            int L = org.telegram.messenger.g0.L(200.0f) + org.telegram.messenger.g0.m;
                                            s9Var.s = L;
                                            if (i11 == 0) {
                                                measuredHeight = L;
                                            }
                                            try {
                                                s9Var.e[i11] = Bitmap.createBitmap((int) (measuredWidth / 15.0f), (int) (measuredHeight / 15.0f), Bitmap.Config.ARGB_8888);
                                                s9Var.j[i11] = new Canvas(s9Var.e[i11]);
                                            } catch (Exception e10) {
                                                org.telegram.messenger.a8.g(e10, r15);
                                                org.telegram.messenger.g0.h3(new dg(s9Var, 11));
                                                return;
                                            }
                                        }
                                        if (i11 == r15) {
                                            s9Var.e[i11].eraseColor(org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.d6, e6Var));
                                        }
                                        s9Var.j[i11].save();
                                        s9Var.j[i11].scale(0.06666667f, 0.06666667f, f10, f10);
                                        Drawable background = view.getBackground();
                                        if (background == null) {
                                            background = e6Var instanceof ym ? ((ym) e6Var).m() : org.telegram.ui.ActionBar.j6.t0();
                                        }
                                        view.setTag(67108867, Integer.valueOf(i11));
                                        if (i11 == 0) {
                                            s9Var.j[i11].translate(f10, -s9Var.u);
                                            view.draw(s9Var.j[i11]);
                                        }
                                        if (background != null && i11 == r15) {
                                            Rect bounds = background.getBounds();
                                            background.setBounds(0, 0, view.getMeasuredWidth(), view.getMeasuredHeight());
                                            background.draw(s9Var.j[i11]);
                                            background.setBounds(bounds);
                                            view.draw(s9Var.j[i11]);
                                        }
                                        view.setTag(67108867, null);
                                        s9Var.j[i11].restore();
                                    }
                                    s9Var.q = n5Var.getMeasuredHeight();
                                    s9Var.r = n5Var.getMeasuredWidth();
                                    s9Var.v.b = n5Var.getMeasuredWidth();
                                    s9Var.v.c = n5Var.getMeasuredHeight();
                                    org.telegram.ui.Components.r9 r9Var = s9Var.v;
                                    if (r9Var.b != 0 && r9Var.c != 0) {
                                        if (s9Var.a == null) {
                                            s9Var.a = new org.telegram.messenger.q5("blur_thread_" + s9Var, (boolean) r15);
                                        }
                                        s9Var.a.postRunnable(s9Var.v);
                                        break;
                                    } else {
                                        s9Var.k = false;
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
                qn qnVar = (qn) this.c;
                fi.v3 v3Var2 = qnVar.e;
                if (v3Var2 != null && v3Var2.getImageReceiver().L()) {
                    paint6.setAlpha((int) (qnVar.e.getImageReceiver().i1 * 85.0f));
                    canvas.drawCircle(getMeasuredWidth() / 2.0f, getMeasuredHeight() / 2.0f, getMeasuredWidth() / 2.0f, paint6);
                    break;
                }
                break;
            case 7:
                Paint paint7 = (Paint) this.b;
                s10 s10Var = (s10) this.c;
                boolean z12 = s10Var.F;
                if (z12) {
                    float f16 = s10Var.G;
                    if (f16 != 1.0f) {
                        float f17 = f16 + 0.064f;
                        s10Var.G = f17;
                        if (f17 > 1.0f) {
                            s10Var.G = 1.0f;
                        }
                        invalidate();
                        paint7.setColor(i0.a.f(s10Var.G, 1711607061, 1714752530));
                        canvas.drawCircle(getMeasuredWidth() / 2.0f, (getMeasuredHeight() / 2.0f) - org.telegram.messenger.g0.L(25.0f), (org.telegram.messenger.g0.L(5.0f) * s10Var.G) + org.telegram.messenger.g0.L(35.0f), paint7);
                        break;
                    }
                }
                if (!z12) {
                    float f18 = s10Var.G;
                    if (f18 != 0.0f) {
                        float f19 = f18 - 0.064f;
                        s10Var.G = f19;
                        if (f19 < 0.0f) {
                            s10Var.G = 0.0f;
                        }
                        invalidate();
                    }
                }
                paint7.setColor(i0.a.f(s10Var.G, 1711607061, 1714752530));
                canvas.drawCircle(getMeasuredWidth() / 2.0f, (getMeasuredHeight() / 2.0f) - org.telegram.messenger.g0.L(25.0f), (org.telegram.messenger.g0.L(5.0f) * s10Var.G) + org.telegram.messenger.g0.L(35.0f), paint7);
            case 8:
                canvas.drawColor(855638016);
                t70 t70Var = (t70) this.c;
                FrameLayout frameLayout = t70Var.n;
                FrameLayout frameLayout2 = (FrameLayout) this.b;
                float[] fArr = t70Var.J;
                t70.a(frameLayout, frameLayout2, fArr);
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
                org.telegram.ui.Components.i9 i9Var2 = prVar.e;
                if (i9Var2 != null && i9Var2.getImageReceiver().L()) {
                    paint8.setAlpha((int) (prVar.e.getImageReceiver().i1 * 85.0f));
                    canvas.drawCircle(getMeasuredWidth() / 2.0f, getMeasuredHeight() / 2.0f, getMeasuredWidth() / 2.0f, paint8);
                    break;
                }
                break;
            case 11:
                canvas.drawColor(855638016);
                fy fyVar = (fy) this.c;
                FrameLayout frameLayout3 = fyVar.a;
                FrameLayout frameLayout4 = (FrameLayout) this.b;
                float[] fArr2 = fyVar.E;
                zx.a(frameLayout3, frameLayout4, fArr2);
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
                c50 c50Var = (c50) this.c;
                if (c50Var.d != null && c50Var.n.getVisibility() == 0 && c50Var.d.getImageReceiver().L()) {
                    paint9.setAlpha((int) (c50Var.n.getAlpha() * c50Var.d.getImageReceiver().i1 * 85.0f));
                    canvas.drawCircle(getMeasuredWidth() / 2.0f, getMeasuredHeight() / 2.0f, getMeasuredWidth() / 2.0f, paint9);
                    break;
                }
                break;
            case 14:
                Paint paint10 = (Paint) this.b;
                oc0 oc0Var = (oc0) this.c;
                yc ycVar = oc0Var.r;
                fi.v3 v3Var3 = oc0Var.e;
                if (v3Var3 != null && ycVar.getVisibility() == 0) {
                    paint10.setAlpha((int) (ycVar.getAlpha() * v3Var3.getImageReceiver().i1 * 85.0f));
                    canvas.drawCircle(getMeasuredWidth() / 2.0f, getMeasuredHeight() / 2.0f, getMeasuredWidth() / 2.0f, paint10);
                    break;
                }
                break;
            case 15:
                if (((n11) this.c).R0) {
                    canvas.drawColor(org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.G8, (org.telegram.ui.ActionBar.e6) this.b));
                    break;
                } else {
                    dispatchDraw(canvas);
                    break;
                }
            case 16:
                t71 t71Var = (t71) this.c;
                int currentItem = t71Var.l0.getCurrentItem();
                Paint paint11 = (Paint) this.b;
                int i12 = org.telegram.ui.ActionBar.j6.sf;
                paint11.setColor(t71Var.d ? org.telegram.ui.ActionBar.j6.F0(i12) : t71Var.getThemedColor(i12));
                int i13 = 0;
                while (i13 < 2) {
                    paint11.setAlpha(i13 == currentItem ? ns.e4 : ns.L1);
                    canvas.drawCircle(org.telegram.messenger.g0.L((i13 * 15) + 3), org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(3.0f), paint11);
                    i13++;
                }
                break;
            case 17:
                Paint paint12 = (Paint) this.b;
                paint12.setColor(org.telegram.ui.ActionBar.j6.x0(null, org.telegram.ui.ActionBar.j6.d6, false));
                int measuredHeight2 = getMeasuredHeight() - org.telegram.messenger.g0.L(3.0f);
                canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), measuredHeight2, paint12);
                o4Var = ((org.telegram.ui.ActionBar.e2) ((xa1) this.c)).parentLayout;
                ((ActionBarLayout) o4Var).q(canvas, measuredHeight2);
                break;
            case 18:
                super.onDraw(canvas);
                int save = canvas.save();
                canvas.scale(getWidth() / 336.0f, getHeight() / 205.0f);
                org.telegram.ui.Wallet.z5 z5Var = ((org.telegram.ui.Wallet.c6) this.c).b;
                if (z5Var != null) {
                    z5Var.e(canvas, (float[]) this.b);
                } else {
                    canvas.drawColor(org.telegram.ui.Wallet.q7.a(-16216082, (float[]) this.b));
                }
                canvas.restoreToCount(save);
                break;
            case 19:
                float measuredWidth2 = getMeasuredWidth() / 2.0f;
                float measuredHeight3 = getMeasuredHeight() / 2.0f;
                canvas.drawCircle(measuredWidth2, measuredHeight3, getMeasuredWidth() / 2.0f, (Paint) this.b);
                ia.f.d().f(-org.telegram.messenger.g0.L(10.0f), 0.0f, getMeasuredWidth(), getMeasuredHeight());
                canvas.drawCircle(measuredWidth2, measuredHeight3, (getMeasuredWidth() / 2.0f) - org.telegram.messenger.g0.L(2.0f), ia.f.d().e());
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
                org.telegram.ui.Components.s9 s9Var = (org.telegram.ui.Components.s9) this.b;
                n5 n5Var = s9Var.d;
                if (s9Var.g != null && n5Var.getMeasuredHeight() != 0 && n5Var.getMeasuredWidth() != 0) {
                    s9Var.a();
                    s9Var.q = n5Var.getMeasuredHeight();
                    s9Var.r = n5Var.getMeasuredWidth();
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
                View view = ((an) this.c).fragmentView;
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
                ((s10) this.c).d.setAlpha(f10);
                break;
        }
    }

    @Override // android.view.View
    public void setScaleX(float f10) {
        switch (this.a) {
            case 7:
                super.setScaleX(f10);
                ((s10) this.c).d.setScaleX(f10);
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
                ((s10) this.c).d.setScaleY(f10);
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
                ((s10) this.c).d.setTranslationY(f10);
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
                View view = ((an) this.c).fragmentView;
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
                return drawable == ((ke0) this.c) || super.verifyDrawable(drawable);
            case 9:
                return ((org.telegram.ui.Cells.y) this.b) == drawable || super.verifyDrawable(drawable);
            default:
                return super.verifyDrawable(drawable);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n5(Context context, org.telegram.ui.ActionBar.o4 o4Var) {
        super(context);
        this.a = 13;
        this.c = new te.a(0, this, er.h, 380L, true);
        this.b = o4Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n5(Activity activity) {
        super(activity);
        this.a = 0;
        Paint paint = new Paint(1);
        this.b = paint;
        ke0 ke0Var = new ke0(10);
        this.c = ke0Var;
        paint.setColor(-1);
        paint.setShadowLayer(1.0f, 0.0f, 0.0f, 419430400);
        paint.setStyle(Paint.Style.STROKE);
        ke0Var.setCallback(this);
        ke0Var.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n5(li.n nVar, Context context) {
        super(context);
        this.a = 1;
        this.c = nVar;
        this.b = new Paint(1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n5(s10 s10Var, Context context) {
        super(context);
        this.a = 7;
        this.c = s10Var;
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
    public n5(org.telegram.ui.Wallet.c6 c6Var, Context context) {
        super(context);
        this.a = 18;
        this.c = c6Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n5(xa1 xa1Var, Context context) {
        super(context);
        this.a = 17;
        this.c = xa1Var;
        this.b = new Paint();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n5(Context context, t71 t71Var) {
        super(context);
        this.a = 16;
        this.c = t71Var;
        this.b = new Paint(1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n5(an anVar, Context context) {
        super(context);
        this.a = 4;
        this.c = anVar;
        this.b = new RectF();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n5(an anVar, Context context, View view, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context);
        this.a = 5;
        this.c = anVar;
        org.telegram.ui.Components.s9 s9Var = new org.telegram.ui.Components.s9(view, this, e6Var);
        this.b = s9Var;
        s9Var.p = false;
        s9Var.n = true;
    }

    @Override // te.b
    public /* synthetic */ void E(float f10, int i7) {
    }
}
