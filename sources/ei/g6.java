package ei;

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
import org.telegram.ui.Components.ah0;
import org.telegram.ui.Components.bs;
import org.telegram.ui.Components.i30;
import org.telegram.ui.Components.pg;
import org.telegram.ui.Components.q90;
import org.telegram.ui.gz;
import org.telegram.ui.hs;
import org.telegram.ui.ko;
import org.telegram.ui.lz;
import org.telegram.ui.mc1;
import org.telegram.ui.md;
import org.telegram.ui.od;
import org.telegram.ui.pe0;
import org.telegram.ui.qn;
import org.telegram.ui.sn;
import org.telegram.ui.u60;
import org.telegram.ui.xf1;
import org.telegram.ui.z51;
import org.telegram.ui.z71;

/* compiled from: r8-map-id-189a3a12219b7c214453a48fa9697387dfb8b2ca31ce3a2eba70ff5e2610a248 */
/* loaded from: classes4.dex */
public final class g6 extends View implements ne.d {
    public final /* synthetic */ int a;
    public final Object b;
    public final Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g6(Object obj, Context context, Object obj2, int i10) {
        super(context);
        this.a = i10;
        this.c = obj;
        this.b = obj2;
    }

    public boolean a() {
        org.telegram.ui.Components.fa faVar = (org.telegram.ui.Components.fa) this.b;
        if (faVar.t) {
            return (faVar.m == 1.0f || !faVar.p) && faVar.n && faVar.d.getAlpha() == 1.0f && getVisibility() == 0;
        }
        return false;
    }

    public void b(boolean z10, boolean z11) {
        ((ne.b) this.c).a(z10, z11);
    }

    @Override // android.view.View
    public void dispatchDraw(Canvas canvas) {
        switch (this.a) {
            case 3:
                RectF rectF = (RectF) this.b;
                rectF.set(0.0f, 0.0f, getWidth(), getHeight());
                int measuredWidth = getMeasuredWidth();
                sn snVar = (sn) this.c;
                int backgroundSizeY = snVar.X0.getBackgroundSizeY();
                float x10 = getX();
                float U8 = snVar.U8(this);
                qn qnVar = snVar.ea;
                if (qnVar != null) {
                    qnVar.d(x10, U8, measuredWidth, backgroundSizeY);
                } else {
                    org.telegram.ui.ActionBar.h6.q(x10, U8, measuredWidth, backgroundSizeY);
                }
                canvas.drawRoundRect(rectF, AndroidUtilities.dp(18.0f), AndroidUtilities.dp(18.0f), snVar.getThemedPaint("paintChatActionBackground"));
                qn qnVar2 = snVar.ea;
                if (qnVar2 == null ? org.telegram.ui.ActionBar.h6.b1() : qnVar2.s()) {
                    canvas.drawRoundRect(rectF, AndroidUtilities.dp(18.0f), AndroidUtilities.dp(18.0f), snVar.getThemedPaint("paintChatActionBackgroundDarken"));
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
        org.telegram.ui.ActionBar.d6 d6Var;
        org.telegram.ui.ActionBar.d5 d5Var;
        switch (this.a) {
            case 0:
                Paint paint = (Paint) this.b;
                paint.setStrokeWidth(AndroidUtilities.dpf2(1.66f));
                canvas.drawCircle(getWidth() / 2.0f, getHeight() / 2.0f, AndroidUtilities.dp(10.0f), paint);
                ah0 ah0Var = (ah0) this.c;
                ah0Var.setBounds(0, 0, AndroidUtilities.dp(10.0f), AndroidUtilities.dp(10.0f));
                canvas.save();
                canvas.translate((getWidth() - AndroidUtilities.dp(10.0f)) / 2.0f, (getHeight() - AndroidUtilities.dp(10.0f)) / 2.0f);
                ah0Var.draw(canvas);
                canvas.restore();
                break;
            case 1:
                Paint paint2 = (Paint) this.b;
                hi.o oVar = (hi.o) this.c;
                org.telegram.ui.Components.w9 w9Var = oVar.v;
                if (w9Var != null && w9Var.getImageReceiver().hasNotThumb()) {
                    paint2.setColor(1426063360);
                    paint2.setAlpha((int) (oVar.v.getImageReceiver().getCurrentAlpha() * 85.0f));
                    canvas.drawRoundRect(0.0f, 0.0f, getWidth(), getHeight(), AndroidUtilities.dp(20.0f), AndroidUtilities.dp(20.0f), paint2);
                    break;
                }
                break;
            case 2:
                Paint paint3 = (Paint) this.b;
                od odVar = (od) this.c;
                ci.k4 k4Var = odVar.e;
                if (k4Var != null && k4Var.getImageReceiver().hasNotThumb()) {
                    paint3.setAlpha((int) (odVar.r.getAlpha() * odVar.e.getImageReceiver().getCurrentAlpha() * 85.0f));
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
                g6 g6Var = faVar.d;
                if (g6Var != null) {
                    if (g6Var.getMeasuredHeight() != 0 || g6Var.getMeasuredWidth() != 0) {
                        if (i10 == 1 && !faVar.t && !faVar.p) {
                            faVar.a();
                            faVar.l = false;
                        }
                        Bitmap[] bitmapArr2 = faVar.g;
                        if ((bitmapArr2 != null || faVar.o) && faVar.p) {
                            boolean z11 = faVar.n;
                            if (z11) {
                                float f10 = faVar.m;
                                if (f10 != 1.0f) {
                                    float f11 = f10 + 0.09f;
                                    faVar.m = f11;
                                    if (f11 > 1.0f) {
                                        faVar.m = 1.0f;
                                    }
                                    g6Var.invalidate();
                                }
                            }
                            if (!z11) {
                                float f12 = faVar.m;
                                if (f12 != 0.0f) {
                                    float f13 = f12 - 0.09f;
                                    faVar.m = f13;
                                    if (f13 < 0.0f) {
                                        faVar.m = 0.0f;
                                    }
                                    g6Var.invalidate();
                                }
                            }
                        }
                        float f14 = faVar.p ? faVar.m : 1.0f;
                        if (bitmapArr2 == null && faVar.o) {
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
                                canvas.saveLayerAlpha(0.0f, 0.0f, g6Var.getMeasuredWidth(), g6Var.getMeasuredHeight(), (int) (f14 * 255.0f), 31);
                            }
                            if (bitmapArr != null) {
                                paint5.setAlpha((int) (f14 * 255.0f));
                                if (i10 == r02) {
                                    canvas.translate(f7, faVar.u);
                                }
                                canvas.save();
                                canvas.scale(g6Var.getMeasuredWidth() / bitmapArr[r02].getWidth(), g6Var.getMeasuredHeight() / bitmapArr[r02].getHeight());
                                canvas.drawBitmap(bitmapArr[r02], f7, f7, paint5);
                                canvas.restore();
                                canvas.save();
                                if (i10 == 0) {
                                    canvas.translate(f7, faVar.u);
                                }
                                canvas.scale(g6Var.getMeasuredWidth() / bitmapArr[z10].getWidth(), faVar.s / bitmapArr[z10].getHeight());
                                canvas.drawBitmap(bitmapArr[z10], f7, f7, paint5);
                                canvas.restore();
                                faVar.t = r02;
                                canvas.drawColor(436207616);
                            }
                            canvas.restore();
                            if (faVar.n && !faVar.k) {
                                if (faVar.g == null || faVar.l) {
                                    faVar.k = r02;
                                    faVar.l = z10;
                                    if (faVar.e == null) {
                                        faVar.e = new Bitmap[2];
                                        faVar.j = new Canvas[2];
                                    }
                                    for (int i11 = 0; i11 < 2; i11++) {
                                        if (faVar.e[i11] != null && g6Var.getMeasuredWidth() == faVar.r && g6Var.getMeasuredHeight() == faVar.q) {
                                            faVar.e[i11].eraseColor(0);
                                        } else {
                                            int measuredHeight = g6Var.getMeasuredHeight();
                                            int measuredWidth = g6Var.getMeasuredWidth();
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
                                            faVar.e[i11].eraseColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.d6, d6Var2));
                                        }
                                        faVar.j[i11].save();
                                        faVar.j[i11].scale(0.06666667f, 0.06666667f, f7, f7);
                                        Drawable background = view.getBackground();
                                        if (background == null) {
                                            background = d6Var2 instanceof qn ? ((qn) d6Var2).e() : org.telegram.ui.ActionBar.h6.t0();
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
                                    faVar.q = g6Var.getMeasuredHeight();
                                    faVar.r = g6Var.getMeasuredWidth();
                                    faVar.v.b = g6Var.getMeasuredWidth();
                                    faVar.v.c = g6Var.getMeasuredHeight();
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
                ko koVar = (ko) this.c;
                ci.k4 k4Var2 = koVar.e;
                if (k4Var2 != null && k4Var2.getImageReceiver().hasNotThumb()) {
                    paint6.setAlpha((int) (koVar.e.getImageReceiver().getCurrentAlpha() * 85.0f));
                    canvas.drawCircle(getMeasuredWidth() / 2.0f, getMeasuredHeight() / 2.0f, getMeasuredWidth() / 2.0f, paint6);
                    break;
                }
                break;
            case 6:
                Paint paint7 = (Paint) this.b;
                i30 i30Var = (i30) this.c;
                boolean z12 = i30Var.y;
                if (z12) {
                    float f15 = i30Var.E;
                    if (f15 != 1.0f) {
                        float f16 = f15 + 0.064f;
                        i30Var.E = f16;
                        if (f16 > 1.0f) {
                            i30Var.E = 1.0f;
                        }
                        invalidate();
                        paint7.setColor(i0.b.f(i30Var.E, 1711607061, 1714752530));
                        canvas.drawCircle(getMeasuredWidth() / 2.0f, (getMeasuredHeight() / 2.0f) - AndroidUtilities.dp(25.0f), (AndroidUtilities.dp(5.0f) * i30Var.E) + AndroidUtilities.dp(35.0f), paint7);
                        break;
                    }
                }
                if (!z12) {
                    float f17 = i30Var.E;
                    if (f17 != 0.0f) {
                        float f18 = f17 - 0.064f;
                        i30Var.E = f18;
                        if (f18 < 0.0f) {
                            i30Var.E = 0.0f;
                        }
                        invalidate();
                    }
                }
                paint7.setColor(i0.b.f(i30Var.E, 1711607061, 1714752530));
                canvas.drawCircle(getMeasuredWidth() / 2.0f, (getMeasuredHeight() / 2.0f) - AndroidUtilities.dp(25.0f), (AndroidUtilities.dp(5.0f) * i30Var.E) + AndroidUtilities.dp(35.0f), paint7);
            case 7:
                canvas.drawColor(855638016);
                q90 q90Var = (q90) this.c;
                FrameLayout frameLayout = q90Var.n;
                FrameLayout frameLayout2 = (FrameLayout) this.b;
                float[] fArr = q90Var.I;
                q90.a(frameLayout, frameLayout2, fArr);
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
                hs hsVar = (hs) this.c;
                org.telegram.ui.Components.w9 w9Var2 = hsVar.e;
                if (w9Var2 != null && w9Var2.getImageReceiver().hasNotThumb()) {
                    paint8.setAlpha((int) (hsVar.e.getImageReceiver().getCurrentAlpha() * 85.0f));
                    canvas.drawCircle(getMeasuredWidth() / 2.0f, getMeasuredHeight() / 2.0f, getMeasuredWidth() / 2.0f, paint8);
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
                Paint paint9 = (Paint) this.b;
                u60 u60Var = (u60) this.c;
                if (u60Var.d != null && u60Var.n.getVisibility() == 0 && u60Var.d.getImageReceiver().hasNotThumb()) {
                    paint9.setAlpha((int) (u60Var.n.getAlpha() * u60Var.d.getImageReceiver().getCurrentAlpha() * 85.0f));
                    canvas.drawCircle(getMeasuredWidth() / 2.0f, getMeasuredHeight() / 2.0f, getMeasuredWidth() / 2.0f, paint9);
                    break;
                }
                break;
            case 12:
                Paint paint10 = (Paint) this.b;
                pe0 pe0Var = (pe0) this.c;
                md mdVar = pe0Var.r;
                ci.k4 k4Var3 = pe0Var.e;
                if (k4Var3 != null && mdVar.getVisibility() == 0) {
                    paint10.setAlpha((int) (mdVar.getAlpha() * k4Var3.getImageReceiver().getCurrentAlpha() * 85.0f));
                    canvas.drawCircle(getMeasuredWidth() / 2.0f, getMeasuredHeight() / 2.0f, getMeasuredWidth() / 2.0f, paint10);
                    break;
                }
                break;
            case 13:
                if (((z51) this.c).Q0) {
                    canvas.drawColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.G8, (org.telegram.ui.ActionBar.d6) this.b));
                    break;
                } else {
                    dispatchDraw(canvas);
                    break;
                }
            case 14:
                z71 z71Var = (z71) this.c;
                kVar = ((org.telegram.ui.ActionBar.n2) z71Var).actionBar;
                int height = kVar.getHeight();
                Rect rect = AndroidUtilities.rectTmp2;
                rect.set(0, 0, getMeasuredWidth(), height);
                Paint paint11 = (Paint) this.b;
                int i12 = org.telegram.ui.ActionBar.h6.s8;
                d6Var = ((org.telegram.ui.ActionBar.n2) z71Var).resourceProvider;
                paint11.setColor(org.telegram.ui.ActionBar.h6.w0(i12, d6Var));
                z71Var.b.J(canvas, 0.0f, rect, paint11, true);
                if (z71Var.getParentLayout() != null) {
                    ((ActionBarLayout) z71Var.getParentLayout()).q(canvas, height);
                    break;
                }
                break;
            case 15:
                mc1 mc1Var = (mc1) this.c;
                int currentItem = mc1Var.j0.getCurrentItem();
                Paint paint12 = (Paint) this.b;
                int i13 = org.telegram.ui.ActionBar.h6.Ae;
                paint12.setColor(mc1Var.d ? org.telegram.ui.ActionBar.h6.D0(i13) : mc1Var.getThemedColor(i13));
                int i14 = 0;
                while (i14 < 2) {
                    paint12.setAlpha(i14 == currentItem ? 255 : 127);
                    canvas.drawCircle(AndroidUtilities.dp((i14 * 15) + 3), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(3.0f), paint12);
                    i14++;
                }
                break;
            case 16:
                Paint paint13 = (Paint) this.b;
                paint13.setColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.d6, false));
                int measuredHeight2 = getMeasuredHeight() - AndroidUtilities.dp(3.0f);
                canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), measuredHeight2, paint13);
                d5Var = ((org.telegram.ui.ActionBar.n2) ((xf1) this.c)).parentLayout;
                ((ActionBarLayout) d5Var).q(canvas, measuredHeight2);
                break;
            case 17:
                float measuredWidth2 = getMeasuredWidth() / 2.0f;
                float measuredHeight3 = getMeasuredHeight() / 2.0f;
                canvas.drawCircle(measuredWidth2, measuredHeight3, getMeasuredWidth() / 2.0f, (Paint) this.b);
                sg.a1.d().f(-AndroidUtilities.dp(10.0f), 0.0f, getMeasuredWidth(), getMeasuredHeight());
                canvas.drawCircle(measuredWidth2, measuredHeight3, (getMeasuredWidth() / 2.0f) - AndroidUtilities.dp(2.0f), sg.a1.d().e());
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
                g6 g6Var = faVar.d;
                if (faVar.g != null && g6Var.getMeasuredHeight() != 0 && g6Var.getMeasuredWidth() != 0) {
                    faVar.a();
                    faVar.q = g6Var.getMeasuredHeight();
                    faVar.r = g6Var.getMeasuredWidth();
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
                View view = ((sn) this.c).fragmentView;
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
                ((i30) this.c).d.setAlpha(f7);
                break;
        }
    }

    @Override // android.view.View
    public void setScaleX(float f7) {
        switch (this.a) {
            case 6:
                super.setScaleX(f7);
                ((i30) this.c).d.setScaleX(f7);
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
                ((i30) this.c).d.setScaleY(f7);
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
                ((i30) this.c).d.setTranslationY(f7);
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
                View view = ((sn) this.c).fragmentView;
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

    @Override // ne.d
    public void u(int i10, float f7, float f10, ne.e eVar) {
        setVisibility(f7 > 0.0f ? 0 : 8);
        setAlpha(f7);
    }

    @Override // android.view.View
    public boolean verifyDrawable(Drawable drawable) {
        switch (this.a) {
            case 0:
                return drawable == ((ah0) this.c) || super.verifyDrawable(drawable);
            default:
                return super.verifyDrawable(drawable);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g6(Context context, org.telegram.ui.ActionBar.d5 d5Var) {
        super(context);
        this.a = 11;
        this.c = new ne.b(0, this, bs.h, 380L, true);
        this.b = d5Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g6(Activity activity) {
        super(activity);
        this.a = 0;
        Paint paint = new Paint(1);
        this.b = paint;
        ah0 ah0Var = new ah0(10);
        this.c = ah0Var;
        paint.setColor(-1);
        paint.setShadowLayer(1.0f, 0.0f, 0.0f, 419430400);
        paint.setStyle(Paint.Style.STROKE);
        ah0Var.setCallback(this);
        ah0Var.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g6(hi.o oVar, Context context) {
        super(context);
        this.a = 1;
        this.c = oVar;
        this.b = new Paint(1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g6(i30 i30Var, Context context) {
        super(context);
        this.a = 6;
        this.c = i30Var;
        this.b = new Paint(1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g6(z71 z71Var, Context context) {
        super(context);
        this.a = 14;
        this.c = z71Var;
        this.b = new Paint(1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g6(Context context, Paint paint, Drawable drawable) {
        super(context);
        this.a = 17;
        this.b = paint;
        this.c = drawable;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g6(xf1 xf1Var, Context context) {
        super(context);
        this.a = 16;
        this.c = xf1Var;
        this.b = new Paint();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g6(Context context, mc1 mc1Var) {
        super(context);
        this.a = 15;
        this.c = mc1Var;
        this.b = new Paint(1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g6(sn snVar, Context context) {
        super(context);
        this.a = 3;
        this.c = snVar;
        this.b = new RectF();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g6(sn snVar, Context context, View view, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context);
        this.a = 4;
        this.c = snVar;
        org.telegram.ui.Components.fa faVar = new org.telegram.ui.Components.fa(view, this, d6Var);
        this.b = faVar;
        faVar.p = false;
        faVar.n = true;
    }

    @Override // ne.d
    public /* synthetic */ void E(float f7, int i10) {
    }
}
