package di;

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
import org.telegram.ui.Components.es;
import org.telegram.ui.Components.gh0;
import org.telegram.ui.Components.m30;
import org.telegram.ui.Components.qg;
import org.telegram.ui.Components.w90;
import org.telegram.ui.a00;
import org.telegram.ui.ce1;
import org.telegram.ui.co;
import org.telegram.ui.f00;
import org.telegram.ui.fo;
import org.telegram.ui.mf0;
import org.telegram.ui.o91;
import org.telegram.ui.oh1;
import org.telegram.ui.p70;
import org.telegram.ui.qd;
import org.telegram.ui.r71;
import org.telegram.ui.sd;
import org.telegram.ui.ws;
import org.telegram.ui.zo;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes4.dex */
public final class p6 extends View implements ne.d {
    public final /* synthetic */ int a;
    public final Object b;
    public final Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ p6(Object obj, Context context, Object obj2, int i10) {
        super(context);
        this.a = i10;
        this.c = obj;
        this.b = obj2;
    }

    public boolean a() {
        org.telegram.ui.Components.ha haVar = (org.telegram.ui.Components.ha) this.b;
        if (haVar.t) {
            return (haVar.m == 1.0f || !haVar.p) && haVar.n && haVar.d.getAlpha() == 1.0f && getVisibility() == 0;
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
                fo foVar = (fo) this.c;
                int backgroundSizeY = foVar.X0.getBackgroundSizeY();
                float x10 = getX();
                float U8 = foVar.U8(this);
                co coVar = foVar.ea;
                if (coVar != null) {
                    coVar.l(x10, U8, measuredWidth, backgroundSizeY);
                } else {
                    org.telegram.ui.ActionBar.g6.q(x10, U8, measuredWidth, backgroundSizeY);
                }
                canvas.drawRoundRect(rectF, AndroidUtilities.dp(18.0f), AndroidUtilities.dp(18.0f), foVar.getThemedPaint("paintChatActionBackground"));
                co coVar2 = foVar.ea;
                if (coVar2 == null ? org.telegram.ui.ActionBar.g6.b1() : coVar2.m0()) {
                    canvas.drawRoundRect(rectF, AndroidUtilities.dp(18.0f), AndroidUtilities.dp(18.0f), foVar.getThemedPaint("paintChatActionBackgroundDarken"));
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
        org.telegram.ui.ActionBar.c6 c6Var;
        org.telegram.ui.ActionBar.b5 b5Var;
        switch (this.a) {
            case 0:
                Paint paint = (Paint) this.b;
                paint.setStrokeWidth(AndroidUtilities.dpf2(1.66f));
                canvas.drawCircle(getWidth() / 2.0f, getHeight() / 2.0f, AndroidUtilities.dp(10.0f), paint);
                gh0 gh0Var = (gh0) this.c;
                gh0Var.setBounds(0, 0, AndroidUtilities.dp(10.0f), AndroidUtilities.dp(10.0f));
                canvas.save();
                canvas.translate((getWidth() - AndroidUtilities.dp(10.0f)) / 2.0f, (getHeight() - AndroidUtilities.dp(10.0f)) / 2.0f);
                gh0Var.draw(canvas);
                canvas.restore();
                break;
            case 1:
                Paint paint2 = (Paint) this.b;
                gi.p pVar = (gi.p) this.c;
                org.telegram.ui.Components.z9 z9Var = pVar.v;
                if (z9Var != null && z9Var.getImageReceiver().hasNotThumb()) {
                    paint2.setColor(1426063360);
                    paint2.setAlpha((int) (pVar.v.getImageReceiver().getCurrentAlpha() * 85.0f));
                    canvas.drawRoundRect(0.0f, 0.0f, getWidth(), getHeight(), AndroidUtilities.dp(20.0f), AndroidUtilities.dp(20.0f), paint2);
                    break;
                }
                break;
            case 2:
                Paint paint3 = (Paint) this.b;
                sd sdVar = (sd) this.c;
                bi.k5 k5Var = sdVar.e;
                if (k5Var != null && k5Var.getImageReceiver().hasNotThumb()) {
                    paint3.setAlpha((int) (sdVar.r.getAlpha() * sdVar.e.getImageReceiver().getCurrentAlpha() * 85.0f));
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
                org.telegram.ui.Components.ha haVar = (org.telegram.ui.Components.ha) this.b;
                Paint paint4 = haVar.x;
                org.telegram.ui.ActionBar.c6 c6Var2 = haVar.y;
                Paint paint5 = haVar.w;
                int i10 = haVar.b;
                View view = haVar.c;
                p6 p6Var = haVar.d;
                if (p6Var != null) {
                    if (p6Var.getMeasuredHeight() != 0 || p6Var.getMeasuredWidth() != 0) {
                        if (i10 == 1 && !haVar.t && !haVar.p) {
                            haVar.a();
                            haVar.l = false;
                        }
                        Bitmap[] bitmapArr2 = haVar.g;
                        if ((bitmapArr2 != null || haVar.o) && haVar.p) {
                            boolean z11 = haVar.n;
                            if (z11) {
                                float f10 = haVar.m;
                                if (f10 != 1.0f) {
                                    float f11 = f10 + 0.09f;
                                    haVar.m = f11;
                                    if (f11 > 1.0f) {
                                        haVar.m = 1.0f;
                                    }
                                    p6Var.invalidate();
                                }
                            }
                            if (!z11) {
                                float f12 = haVar.m;
                                if (f12 != 0.0f) {
                                    float f13 = f12 - 0.09f;
                                    haVar.m = f13;
                                    if (f13 < 0.0f) {
                                        haVar.m = 0.0f;
                                    }
                                    p6Var.invalidate();
                                }
                            }
                        }
                        float f14 = haVar.p ? haVar.m : 1.0f;
                        if (bitmapArr2 == null && haVar.o) {
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
                                canvas.saveLayerAlpha(0.0f, 0.0f, p6Var.getMeasuredWidth(), p6Var.getMeasuredHeight(), (int) (f14 * 255.0f), 31);
                            }
                            if (bitmapArr != null) {
                                paint5.setAlpha((int) (f14 * 255.0f));
                                if (i10 == r02) {
                                    canvas.translate(f7, haVar.u);
                                }
                                canvas.save();
                                canvas.scale(p6Var.getMeasuredWidth() / bitmapArr[r02].getWidth(), p6Var.getMeasuredHeight() / bitmapArr[r02].getHeight());
                                canvas.drawBitmap(bitmapArr[r02], f7, f7, paint5);
                                canvas.restore();
                                canvas.save();
                                if (i10 == 0) {
                                    canvas.translate(f7, haVar.u);
                                }
                                canvas.scale(p6Var.getMeasuredWidth() / bitmapArr[z10].getWidth(), haVar.s / bitmapArr[z10].getHeight());
                                canvas.drawBitmap(bitmapArr[z10], f7, f7, paint5);
                                canvas.restore();
                                haVar.t = r02;
                                canvas.drawColor(436207616);
                            }
                            canvas.restore();
                            if (haVar.n && !haVar.k) {
                                if (haVar.g == null || haVar.l) {
                                    haVar.k = r02;
                                    haVar.l = z10;
                                    if (haVar.e == null) {
                                        haVar.e = new Bitmap[2];
                                        haVar.j = new Canvas[2];
                                    }
                                    for (int i11 = 0; i11 < 2; i11++) {
                                        if (haVar.e[i11] != null && p6Var.getMeasuredWidth() == haVar.r && p6Var.getMeasuredHeight() == haVar.q) {
                                            haVar.e[i11].eraseColor(0);
                                        } else {
                                            int measuredHeight = p6Var.getMeasuredHeight();
                                            int measuredWidth = p6Var.getMeasuredWidth();
                                            int dp = AndroidUtilities.dp(200.0f) + AndroidUtilities.statusBarHeight;
                                            haVar.s = dp;
                                            if (i11 == 0) {
                                                measuredHeight = dp;
                                            }
                                            try {
                                                haVar.e[i11] = Bitmap.createBitmap((int) (measuredWidth / 15.0f), (int) (measuredHeight / 15.0f), Bitmap.Config.ARGB_8888);
                                                haVar.j[i11] = new Canvas(haVar.e[i11]);
                                            } catch (Exception e) {
                                                FileLog.e(e);
                                                AndroidUtilities.runOnUIThread(new qg(haVar, 11));
                                                return;
                                            }
                                        }
                                        if (i11 == r02) {
                                            haVar.e[i11].eraseColor(org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.d6, c6Var2));
                                        }
                                        haVar.j[i11].save();
                                        haVar.j[i11].scale(0.06666667f, 0.06666667f, f7, f7);
                                        Drawable background = view.getBackground();
                                        if (background == null) {
                                            background = c6Var2 instanceof co ? ((co) c6Var2).d() : org.telegram.ui.ActionBar.g6.t0();
                                        }
                                        view.setTag(67108867, Integer.valueOf(i11));
                                        if (i11 == 0) {
                                            haVar.j[i11].translate(f7, -haVar.u);
                                            view.draw(haVar.j[i11]);
                                        }
                                        if (background != null && i11 == r02) {
                                            Rect bounds = background.getBounds();
                                            background.setBounds(0, 0, view.getMeasuredWidth(), view.getMeasuredHeight());
                                            background.draw(haVar.j[i11]);
                                            background.setBounds(bounds);
                                            view.draw(haVar.j[i11]);
                                        }
                                        view.setTag(67108867, null);
                                        haVar.j[i11].restore();
                                    }
                                    haVar.q = p6Var.getMeasuredHeight();
                                    haVar.r = p6Var.getMeasuredWidth();
                                    haVar.v.b = p6Var.getMeasuredWidth();
                                    haVar.v.c = p6Var.getMeasuredHeight();
                                    org.telegram.ui.Components.ga gaVar = haVar.v;
                                    if (gaVar.b != 0 && gaVar.c != 0) {
                                        if (haVar.a == null) {
                                            haVar.a = new DispatchQueue("blur_thread_" + haVar);
                                        }
                                        haVar.a.postRunnable(haVar.v);
                                        break;
                                    } else {
                                        haVar.k = false;
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
                zo zoVar = (zo) this.c;
                bi.k5 k5Var2 = zoVar.e;
                if (k5Var2 != null && k5Var2.getImageReceiver().hasNotThumb()) {
                    paint6.setAlpha((int) (zoVar.e.getImageReceiver().getCurrentAlpha() * 85.0f));
                    canvas.drawCircle(getMeasuredWidth() / 2.0f, getMeasuredHeight() / 2.0f, getMeasuredWidth() / 2.0f, paint6);
                    break;
                }
                break;
            case 6:
                Paint paint7 = (Paint) this.b;
                m30 m30Var = (m30) this.c;
                boolean z12 = m30Var.y;
                if (z12) {
                    float f15 = m30Var.E;
                    if (f15 != 1.0f) {
                        float f16 = f15 + 0.064f;
                        m30Var.E = f16;
                        if (f16 > 1.0f) {
                            m30Var.E = 1.0f;
                        }
                        invalidate();
                        paint7.setColor(i0.a.d(m30Var.E, 1711607061, 1714752530));
                        canvas.drawCircle(getMeasuredWidth() / 2.0f, (getMeasuredHeight() / 2.0f) - AndroidUtilities.dp(25.0f), (AndroidUtilities.dp(5.0f) * m30Var.E) + AndroidUtilities.dp(35.0f), paint7);
                        break;
                    }
                }
                if (!z12) {
                    float f17 = m30Var.E;
                    if (f17 != 0.0f) {
                        float f18 = f17 - 0.064f;
                        m30Var.E = f18;
                        if (f18 < 0.0f) {
                            m30Var.E = 0.0f;
                        }
                        invalidate();
                    }
                }
                paint7.setColor(i0.a.d(m30Var.E, 1711607061, 1714752530));
                canvas.drawCircle(getMeasuredWidth() / 2.0f, (getMeasuredHeight() / 2.0f) - AndroidUtilities.dp(25.0f), (AndroidUtilities.dp(5.0f) * m30Var.E) + AndroidUtilities.dp(35.0f), paint7);
            case 7:
                canvas.drawColor(855638016);
                w90 w90Var = (w90) this.c;
                FrameLayout frameLayout = w90Var.n;
                FrameLayout frameLayout2 = (FrameLayout) this.b;
                float[] fArr = w90Var.I;
                w90.a(frameLayout, frameLayout2, fArr);
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
                ws wsVar = (ws) this.c;
                org.telegram.ui.Components.z9 z9Var2 = wsVar.e;
                if (z9Var2 != null && z9Var2.getImageReceiver().hasNotThumb()) {
                    paint8.setAlpha((int) (wsVar.e.getImageReceiver().getCurrentAlpha() * 85.0f));
                    canvas.drawCircle(getMeasuredWidth() / 2.0f, getMeasuredHeight() / 2.0f, getMeasuredWidth() / 2.0f, paint8);
                    break;
                }
                break;
            case 9:
                canvas.drawColor(855638016);
                f00 f00Var = (f00) this.c;
                FrameLayout frameLayout3 = f00Var.a;
                FrameLayout frameLayout4 = (FrameLayout) this.b;
                float[] fArr2 = f00Var.y;
                a00.a(frameLayout3, frameLayout4, fArr2);
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
                p70 p70Var = (p70) this.c;
                if (p70Var.d != null && p70Var.n.getVisibility() == 0 && p70Var.d.getImageReceiver().hasNotThumb()) {
                    paint9.setAlpha((int) (p70Var.n.getAlpha() * p70Var.d.getImageReceiver().getCurrentAlpha() * 85.0f));
                    canvas.drawCircle(getMeasuredWidth() / 2.0f, getMeasuredHeight() / 2.0f, getMeasuredWidth() / 2.0f, paint9);
                    break;
                }
                break;
            case 12:
                Paint paint10 = (Paint) this.b;
                mf0 mf0Var = (mf0) this.c;
                qd qdVar = mf0Var.r;
                bi.k5 k5Var3 = mf0Var.e;
                if (k5Var3 != null && qdVar.getVisibility() == 0) {
                    paint10.setAlpha((int) (qdVar.getAlpha() * k5Var3.getImageReceiver().getCurrentAlpha() * 85.0f));
                    canvas.drawCircle(getMeasuredWidth() / 2.0f, getMeasuredHeight() / 2.0f, getMeasuredWidth() / 2.0f, paint10);
                    break;
                }
                break;
            case 13:
                if (((r71) this.c).Q0) {
                    canvas.drawColor(org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.G8, (org.telegram.ui.ActionBar.c6) this.b));
                    break;
                } else {
                    dispatchDraw(canvas);
                    break;
                }
            case 14:
                o91 o91Var = (o91) this.c;
                kVar = ((org.telegram.ui.ActionBar.m2) o91Var).actionBar;
                int height = kVar.getHeight();
                Rect rect = AndroidUtilities.rectTmp2;
                rect.set(0, 0, getMeasuredWidth(), height);
                Paint paint11 = (Paint) this.b;
                int i12 = org.telegram.ui.ActionBar.g6.s8;
                c6Var = ((org.telegram.ui.ActionBar.m2) o91Var).resourceProvider;
                paint11.setColor(org.telegram.ui.ActionBar.g6.w0(i12, c6Var));
                o91Var.b.J(canvas, 0.0f, rect, paint11, true);
                if (o91Var.getParentLayout() != null) {
                    ((ActionBarLayout) o91Var.getParentLayout()).q(canvas, height);
                    break;
                }
                break;
            case 15:
                ce1 ce1Var = (ce1) this.c;
                int currentItem = ce1Var.j0.getCurrentItem();
                Paint paint12 = (Paint) this.b;
                int i13 = org.telegram.ui.ActionBar.g6.Ae;
                paint12.setColor(ce1Var.d ? org.telegram.ui.ActionBar.g6.D0(i13) : ce1Var.getThemedColor(i13));
                int i14 = 0;
                while (i14 < 2) {
                    paint12.setAlpha(i14 == currentItem ? 255 : 127);
                    canvas.drawCircle(AndroidUtilities.dp((i14 * 15) + 3), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(3.0f), paint12);
                    i14++;
                }
                break;
            case 16:
                Paint paint13 = (Paint) this.b;
                paint13.setColor(org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.d6, false));
                int measuredHeight2 = getMeasuredHeight() - AndroidUtilities.dp(3.0f);
                canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), measuredHeight2, paint13);
                b5Var = ((org.telegram.ui.ActionBar.m2) ((oh1) this.c)).parentLayout;
                ((ActionBarLayout) b5Var).q(canvas, measuredHeight2);
                break;
            case 17:
                float measuredWidth2 = getMeasuredWidth() / 2.0f;
                float measuredHeight3 = getMeasuredHeight() / 2.0f;
                canvas.drawCircle(measuredWidth2, measuredHeight3, getMeasuredWidth() / 2.0f, (Paint) this.b);
                sg.b1.d().f(-AndroidUtilities.dp(10.0f), 0.0f, getMeasuredWidth(), getMeasuredHeight());
                canvas.drawCircle(measuredWidth2, measuredHeight3, (getMeasuredWidth() / 2.0f) - AndroidUtilities.dp(2.0f), sg.b1.d().e());
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
                org.telegram.ui.Components.ha haVar = (org.telegram.ui.Components.ha) this.b;
                p6 p6Var = haVar.d;
                if (haVar.g != null && p6Var.getMeasuredHeight() != 0 && p6Var.getMeasuredWidth() != 0) {
                    haVar.a();
                    haVar.q = p6Var.getMeasuredHeight();
                    haVar.r = p6Var.getMeasuredWidth();
                    break;
                }
                break;
            default:
                super.onSizeChanged(i10, i11, i12, i13);
                break;
        }
    }

    @Override // ne.d
    public void p(int i10, float f7, float f10, ne.e eVar) {
        setVisibility(f7 > 0.0f ? 0 : 8);
        setAlpha(f7);
    }

    @Override // android.view.View
    public void setAlpha(float f7) {
        switch (this.a) {
            case 4:
                super.setAlpha(f7);
                View view = ((fo) this.c).fragmentView;
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
                ((m30) this.c).d.setAlpha(f7);
                break;
        }
    }

    @Override // android.view.View
    public void setScaleX(float f7) {
        switch (this.a) {
            case 6:
                super.setScaleX(f7);
                ((m30) this.c).d.setScaleX(f7);
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
                ((m30) this.c).d.setScaleY(f7);
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
                ((m30) this.c).d.setTranslationY(f7);
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
                View view = ((fo) this.c).fragmentView;
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
                return drawable == ((gh0) this.c) || super.verifyDrawable(drawable);
            default:
                return super.verifyDrawable(drawable);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p6(Context context, org.telegram.ui.ActionBar.b5 b5Var) {
        super(context);
        this.a = 11;
        this.c = new ne.b(0, this, es.h, 380L, true);
        this.b = b5Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p6(Activity activity) {
        super(activity);
        this.a = 0;
        Paint paint = new Paint(1);
        this.b = paint;
        gh0 gh0Var = new gh0(10);
        this.c = gh0Var;
        paint.setColor(-1);
        paint.setShadowLayer(1.0f, 0.0f, 0.0f, 419430400);
        paint.setStyle(Paint.Style.STROKE);
        gh0Var.setCallback(this);
        gh0Var.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p6(gi.p pVar, Context context) {
        super(context);
        this.a = 1;
        this.c = pVar;
        this.b = new Paint(1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p6(m30 m30Var, Context context) {
        super(context);
        this.a = 6;
        this.c = m30Var;
        this.b = new Paint(1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p6(o91 o91Var, Context context) {
        super(context);
        this.a = 14;
        this.c = o91Var;
        this.b = new Paint(1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p6(Context context, Paint paint, Drawable drawable) {
        super(context);
        this.a = 17;
        this.b = paint;
        this.c = drawable;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p6(oh1 oh1Var, Context context) {
        super(context);
        this.a = 16;
        this.c = oh1Var;
        this.b = new Paint();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p6(Context context, ce1 ce1Var) {
        super(context);
        this.a = 15;
        this.c = ce1Var;
        this.b = new Paint(1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p6(fo foVar, Context context) {
        super(context);
        this.a = 3;
        this.c = foVar;
        this.b = new RectF();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p6(fo foVar, Context context, View view, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context);
        this.a = 4;
        this.c = foVar;
        org.telegram.ui.Components.ha haVar = new org.telegram.ui.Components.ha(view, this, c6Var);
        this.b = haVar;
        haVar.p = false;
        haVar.n = true;
    }

    @Override // ne.d
    public /* synthetic */ void C(float f7, int i10) {
    }
}
