package kh;

import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.view.TextureView;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.Components.uj0;
import org.telegram.ui.Components.wy;
import org.telegram.ui.Components.xu0;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes4.dex */
public final class vb extends xu0 {
    public final /* synthetic */ wb A0;
    public final n5.e0 s0;
    public final ScaleGestureDetector t0;
    public boolean u0;
    public boolean v0;
    public boolean w0;
    public float x0;
    public float y0;
    public float z0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vb(wb wbVar, Activity activity) {
        super(activity, null);
        this.A0 = wbVar;
        this.w0 = false;
        this.s0 = new n5.e0(activity, new tb(this));
        this.t0 = new ScaleGestureDetector(activity, new ub(this));
    }

    public final void Z(Bitmap bitmap, float f10) {
        Canvas canvas = new Canvas(bitmap);
        canvas.drawColor(-16777216);
        float width = bitmap.getWidth();
        wb wbVar = this.A0;
        float width2 = width / wbVar.n.getWidth();
        canvas.scale(width2, width2);
        TextureView textureView = wbVar.T0.getTextureView();
        if (textureView == null) {
            textureView = wbVar.T0.r;
        }
        if (textureView != null) {
            canvas.save();
            canvas.translate(wbVar.d0.getX() + wbVar.r.getX(), wbVar.d0.getY() + wbVar.r.getY());
            try {
                Bitmap bitmap2 = textureView.getBitmap((int) (textureView.getWidth() / f10), (int) (textureView.getHeight() / f10));
                float f11 = 1.0f / width2;
                canvas.scale(f11, f11);
                canvas.drawBitmap(bitmap2, 0.0f, 0.0f, new Paint(2));
                bitmap2.recycle();
            } catch (Exception unused) {
            }
            canvas.restore();
        }
        canvas.save();
        canvas.translate(wbVar.r.getX(), wbVar.r.getY());
        for (int i9 = 0; i9 < wbVar.r.getChildCount(); i9++) {
            View childAt = wbVar.r.getChildAt(i9);
            canvas.save();
            canvas.translate(childAt.getX(), childAt.getY());
            if (childAt.getVisibility() == 0) {
                if (childAt == wbVar.d0) {
                    for (int i10 = 0; i10 < wbVar.d0.getChildCount(); i10++) {
                        View childAt2 = wbVar.d0.getChildAt(i10);
                        if (childAt2 != wbVar.T0 && childAt2 != wbVar.x0 && childAt2.getVisibility() == 0) {
                            canvas.save();
                            canvas.translate(childAt2.getX(), childAt2.getY());
                            childAt2.draw(canvas);
                            canvas.restore();
                        }
                    }
                } else {
                    childAt.draw(canvas);
                }
                canvas.restore();
            }
        }
        canvas.restore();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:14:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0241  */
    /* JADX WARN: Removed duplicated region for block: B:45:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r11v3, types: [boolean] */
    /* JADX WARN: Type inference failed for: r11v5 */
    /* JADX WARN: Type inference failed for: r11v7 */
    @Override // org.telegram.ui.Components.xu0, android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void dispatchDraw(Canvas canvas) {
        boolean z10;
        boolean z11;
        ?? r11;
        ya yaVar;
        float f10;
        yf.a2 a2Var;
        wb wbVar = this.A0;
        RectF rectF = wbVar.D;
        Path path = wbVar.a0;
        RectF rectF2 = wbVar.Z;
        RectF rectF3 = wbVar.Y;
        Float f11 = wbVar.H;
        float floatValue = f11 != null ? f11.floatValue() : wbVar.G;
        if (wbVar.F == 0) {
            canvas.drawColor(i0.a.k(-16777216, (int) ((1.0f - floatValue) * wbVar.E * 255.0f)));
        }
        float lerp = AndroidUtilities.lerp(wbVar.C, 0.0f, wbVar.E);
        if (wbVar.E != 1.0f) {
            int i9 = wbVar.F;
            if (i9 == 0) {
                rectF2.set(0.0f, 0.0f, getWidth(), getHeight());
                rectF2.offset(wbVar.r.getTranslationX(), wbVar.r.getTranslationY());
                AndroidUtilities.lerp(rectF, rectF2, wbVar.E, rectF3);
                canvas.save();
                path.rewind();
                path.addRoundRect(rectF3, lerp, lerp, Path.Direction.CW);
                canvas.clipPath(path);
                r11 = 0;
                canvas.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), (int) (Utilities.clamp(wbVar.E * 3.0f, 1.0f, 0.0f) * 255.0f), 31);
                canvas.translate(rectF3.left, rectF3.top - (wbVar.r.getTranslationY() * wbVar.E));
                float max = Math.max(rectF3.width() / getWidth(), rectF3.height() / getHeight());
                canvas.scale(max, max);
                z11 = true;
                yaVar = wbVar.r1;
                if (yaVar != null) {
                    vb vbVar = yaVar.I1;
                    float[] fArr = yaVar.f2;
                    if (yaVar.Z1) {
                        yaVar.Z1 = r11;
                        if (yaVar.V1 != null && (a2Var = yaVar.W1) != null) {
                            fArr[r11] = a2Var.getMeasuredWidth() / 2.0f;
                            fArr[1] = yaVar.W1.getMeasuredHeight() / 2.0f;
                            yaVar.W1.getMatrix().mapPoints(fArr);
                            f10 = 1.0f;
                            float scaleX = fArr[1] - (yaVar.W1.getScaleX() * (yaVar.W1.getMeasuredHeight() / 2.0f));
                            float scaleX2 = (yaVar.W1.getScaleX() * (yaVar.W1.getMeasuredHeight() / 2.0f)) + fArr[1];
                            if (scaleX < AndroidUtilities.dp(120.0f) && scaleX2 > vbVar.getMeasuredHeight() - AndroidUtilities.dp(200.0f)) {
                                yaVar.V1.setTop((boolean) r11);
                                yaVar.V1.setTranslationY(AndroidUtilities.dp(16.0f) + (AndroidUtilities.dp(120.0f) - yaVar.V1.getMeasuredHeight()));
                            } else if (scaleX < AndroidUtilities.dp(120.0f)) {
                                yaVar.V1.setTop(true);
                                yaVar.V1.setTranslationY((yaVar.W1.getScaleX() * (yaVar.W1.getMeasuredHeight() / 2.0f)) + fArr[1]);
                            } else {
                                yaVar.V1.setTop((boolean) r11);
                                yaVar.V1.setTranslationY((scaleX - r7.getMeasuredHeight()) + AndroidUtilities.dp(16.0f));
                            }
                            if (fArr[r11] < yaVar.getMeasuredWidth() / 2.0f) {
                                yaVar.V1.setMirrorX(true);
                                float measuredWidth = ((yaVar.V1.getMeasuredWidth() / 2.0f) + yaVar.V1.getX()) - (fArr[r11] - (yaVar.W1.getMeasuredHeight() / 2.0f));
                                if (measuredWidth > 0.0f) {
                                    yaVar.V1.setBubbleOffset(((r4.getMeasuredWidth() / 2.0f) - measuredWidth) / 2.0f);
                                }
                            } else {
                                float measuredWidth2 = ((yaVar.V1.getMeasuredWidth() / 2.0f) + yaVar.V1.getX()) - ((yaVar.W1.getMeasuredHeight() / 2.0f) + fArr[r11]);
                                if (measuredWidth2 < 0.0f) {
                                    yaVar.V1.setBubbleOffset((-((r4.getMeasuredWidth() / 2.0f) + measuredWidth2)) / 2.0f);
                                }
                                yaVar.V1.setMirrorX(r11);
                            }
                            yaVar.V1.setTranslationX((vbVar.getMeasuredWidth() - yaVar.V1.getMeasuredWidth()) / 2.0f);
                            super.dispatchDraw(canvas);
                            if (z11) {
                                canvas.restore();
                                canvas.restore();
                                if (wbVar.B != null) {
                                    float clamp = Utilities.clamp(f10 - (wbVar.E * 1.5f), 1.0f, 0.0f);
                                    rectF3.centerX();
                                    rectF3.centerY();
                                    Math.min(rectF3.width(), rectF3.height());
                                    rb rbVar = wbVar.B;
                                    ImageReceiver imageReceiver = rbVar.e;
                                    if (imageReceiver != null) {
                                        imageReceiver.setImageCoords(rectF3);
                                        int i10 = wbVar.B.e.getRoundRadius()[r11];
                                        wbVar.B.e.setRoundRadius((int) lerp);
                                        wbVar.B.e.setAlpha(clamp);
                                        wbVar.B.e.draw(canvas);
                                        wbVar.B.e.setRoundRadius(i10);
                                    } else {
                                        org.telegram.ui.Cells.d7 d7Var = rbVar.d;
                                        if (d7Var != null) {
                                            d7Var.setBounds((int) rectF3.left, (int) rectF3.top, (int) rectF3.right, (int) rectF3.bottom);
                                            org.telegram.ui.Cells.d7 d7Var2 = wbVar.B.d;
                                            d7Var2.d = (int) e2.c.C(clamp, 255.0f, clamp, clamp);
                                            d7Var2.draw(canvas);
                                        }
                                    }
                                    wbVar.B.getClass();
                                    canvas.save();
                                    canvas.translate(rectF.left, rectF.top);
                                    wbVar.B.a(canvas, clamp);
                                    canvas.restore();
                                    return;
                                }
                                return;
                            }
                            return;
                        }
                    }
                }
                f10 = 1.0f;
                super.dispatchDraw(canvas);
                if (z11) {
                }
            } else {
                z10 = false;
                z10 = false;
                if (i9 == 1) {
                    wbVar.k();
                }
            }
        } else {
            z10 = false;
        }
        z11 = false;
        r11 = z10;
        yaVar = wbVar.r1;
        if (yaVar != null) {
        }
        f10 = 1.0f;
        super.dispatchDraw(canvas);
        if (z11) {
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEventPreIme(KeyEvent keyEvent) {
        if (keyEvent == null || keyEvent.getKeyCode() != 4 || keyEvent.getAction() != 1) {
            return super.dispatchKeyEventPreIme(keyEvent);
        }
        this.A0.M();
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        boolean z10 = false;
        this.u0 = false;
        wb wbVar = this.A0;
        z zVar = wbVar.E0;
        if (zVar != null && zVar.e) {
            float y10 = wbVar.E0.getY() + wbVar.e0.getY() + wbVar.r.getY();
            if ((motionEvent.getY() >= y10 && motionEvent.getY() <= y10 + wbVar.E0.getHeight()) || this.v0) {
                if (motionEvent.getAction() != 1 && motionEvent.getAction() != 3) {
                    z10 = true;
                }
                this.v0 = z10;
                return super.dispatchTouchEvent(motionEvent);
            }
            wbVar.E0.a(false, true);
            wbVar.m0(true);
        }
        if (this.v0 && (motionEvent.getAction() == 1 || motionEvent.getAction() == 3)) {
            this.v0 = false;
        }
        this.t0.onTouchEvent(motionEvent);
        this.s0.a1(motionEvent);
        if (motionEvent.getAction() == 1 && !this.u0) {
            if (wbVar.r.getTranslationY() <= 0.0f) {
                va vaVar = wbVar.I0;
                if (vaVar != null && vaVar.getTranslationY() > 0.0f && !wbVar.H0) {
                    wbVar.f(!wbVar.M1 && wbVar.I0.getTranslationY() < ((float) wbVar.I0.getPadding()));
                }
            } else if (wbVar.G > 0.4f) {
                wbVar.q(true);
            } else {
                wb.c(wbVar);
            }
            wbVar.H0 = false;
            wbVar.S = false;
            wbVar.T = false;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // org.telegram.ui.Components.xu0
    public int getBottomPadding() {
        int height = getHeight();
        wb wbVar = this.A0;
        return (height - wbVar.r.getBottom()) + wbVar.Q;
    }

    public int getBottomPadding2() {
        return getHeight() - this.A0.r.getBottom();
    }

    @Override // org.telegram.ui.Components.xu0
    public /* bridge */ /* synthetic */ int[] getColorKeys() {
        return null;
    }

    public int getPaddingUnderContainer() {
        int height = getHeight();
        wb wbVar = this.A0;
        return (height - wbVar.X) - wbVar.r.getBottom();
    }

    @Override // org.telegram.ui.Components.xu0, android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i9, int i10, int i11, int i12) {
        int i13;
        wy emojiView;
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        wb wbVar = this.A0;
        int i14 = wbVar.V;
        int measuredHeight2 = wbVar.i0.getMeasuredHeight();
        if (wbVar.R) {
            i14 = 0;
        }
        int i15 = wbVar.O;
        int b10 = g7.n.b((measuredWidth - i15) / 2, wbVar.U, (measuredWidth - wbVar.W) - i15);
        int i16 = wbVar.O + b10;
        if (wbVar.R) {
            i13 = wbVar.P;
        } else {
            int i17 = wbVar.X;
            int i18 = wbVar.P;
            int i19 = (((((measuredHeight - i14) - i17) - i18) - measuredHeight2) / 2) + i14;
            if (wbVar.F == 1) {
                float f10 = wbVar.D.top;
                if (i18 + f10 + measuredHeight2 < measuredHeight - i17) {
                    i14 = (int) f10;
                    i13 = wbVar.P;
                }
            }
            if (i19 - i14 >= AndroidUtilities.dp(40.0f)) {
                i14 = i19;
            }
            i13 = wbVar.P;
        }
        wbVar.r.layout(b10, i14, i16, i13 + i14 + measuredHeight2);
        wbVar.s.b.layout(0, 0, measuredWidth, measuredHeight);
        eb ebVar = wbVar.y2;
        if (ebVar != null) {
            ebVar.layout(0, 0, measuredWidth, measuredHeight);
        }
        va vaVar = wbVar.I0;
        if (vaVar != null) {
            vaVar.layout((measuredWidth - vaVar.getMeasuredWidth()) / 2, 0, (wbVar.I0.getMeasuredWidth() + measuredWidth) / 2, measuredHeight);
        }
        mb mbVar = wbVar.Y0;
        if (mbVar != null && (emojiView = mbVar.f.getEmojiView()) != null) {
            emojiView.layout(wbVar.U, (measuredHeight - wbVar.X) - emojiView.getMeasuredHeight(), measuredWidth - wbVar.W, measuredHeight - wbVar.X);
        }
        ya yaVar = wbVar.r1;
        if (yaVar != null) {
            wy wyVar = yaVar.l2;
            if (wyVar != null) {
                wyVar.layout(wbVar.U, (measuredHeight - wbVar.X) - wyVar.getMeasuredHeight(), measuredWidth - wbVar.W, measuredHeight - wbVar.X);
            }
            uj0 uj0Var = wbVar.r1.V1;
            if (uj0Var != null) {
                int i20 = wbVar.U;
                uj0Var.layout(i20, wbVar.V, uj0Var.getMeasuredWidth() + i20, wbVar.r1.V1.getMeasuredHeight() + wbVar.V);
                fh.v vVar = wbVar.r1.V1.getReactionsWindow() != null ? wbVar.r1.V1.getReactionsWindow().c : null;
                if (vVar != null) {
                    int i21 = wbVar.U;
                    vVar.layout(i21, wbVar.V, vVar.getMeasuredWidth() + i21, vVar.getMeasuredHeight() + wbVar.V);
                }
            }
        }
        gb gbVar = wbVar.n1;
        if (gbVar != null) {
            gbVar.e.setPadding(0, wbVar.V, 0, wbVar.X);
            wbVar.n1.layout(0, 0, measuredWidth, measuredHeight);
            wbVar.n1.d.layout(0, 0, measuredWidth, measuredHeight);
        }
        hb hbVar = wbVar.o1;
        if (hbVar != null) {
            hbVar.f.setPadding(0, wbVar.V, 0, wbVar.X);
            wbVar.o1.layout(0, 0, measuredWidth, measuredHeight);
            wbVar.o1.e.layout(0, 0, measuredWidth, measuredHeight);
        }
        for (int i22 = 0; i22 < getChildCount(); i22++) {
            View childAt = getChildAt(i22);
            if (childAt instanceof u0) {
                childAt.layout(0, 0, measuredWidth, measuredHeight);
            } else if (childAt instanceof org.telegram.ui.Components.za) {
                childAt.layout(0, i14, childAt.getMeasuredWidth(), childAt.getMeasuredHeight() + i14);
            }
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i9, int i10) {
        int size = View.MeasureSpec.getSize(i9);
        int size2 = View.MeasureSpec.getSize(i10);
        wb wbVar = this.A0;
        int i11 = (size - wbVar.U) - wbVar.W;
        int i12 = wbVar.V;
        int i13 = wbVar.X;
        int ceil = (int) Math.ceil((i11 / 9.0f) * 16.0f);
        int dp = AndroidUtilities.dp(48.0f);
        wbVar.Q = dp;
        int i14 = ceil + dp;
        int i15 = size2 - i13;
        if (i14 <= i15) {
            wbVar.O = i11;
            wbVar.P = ceil;
            wbVar.R = i14 > i15 - i12;
        } else {
            wbVar.R = false;
            wbVar.P = ((size2 - dp) - i13) - i12;
            wbVar.O = (int) Math.ceil((r9 * 9.0f) / 16.0f);
        }
        wbVar.Q = Utilities.clamp((size2 - wbVar.P) - (wbVar.R ? 0 : i12), AndroidUtilities.dp(68.0f), AndroidUtilities.dp(48.0f));
        int systemUiVisibility = getSystemUiVisibility();
        setSystemUiVisibility(wbVar.R ? systemUiVisibility | 4 : systemUiVisibility & (-5));
        wbVar.r.measure(View.MeasureSpec.makeMeasureSpec(wbVar.O, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(wbVar.P + wbVar.Q, TLObject.FLAG_30));
        wbVar.s.b.measure(View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(size2, TLObject.FLAG_30));
        eb ebVar = wbVar.y2;
        if (ebVar != null) {
            ebVar.measure(View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(size2, TLObject.FLAG_30));
        }
        va vaVar = wbVar.I0;
        if (vaVar != null) {
            vaVar.measure(View.MeasureSpec.makeMeasureSpec(wbVar.O, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(size2, TLObject.FLAG_30));
        }
        mb mbVar = wbVar.Y0;
        if (mbVar != null) {
            wy emojiView = mbVar.f.getEmojiView();
            R();
            AndroidUtilities.dp(20.0f);
            if (emojiView != null) {
                emojiView.measure(View.MeasureSpec.makeMeasureSpec(i11, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(emojiView.getLayoutParams().height, TLObject.FLAG_30));
            }
        }
        ya yaVar = wbVar.r1;
        if (yaVar != null) {
            wy wyVar = yaVar.l2;
            if (wyVar != null) {
                wyVar.measure(View.MeasureSpec.makeMeasureSpec(i11, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(wbVar.r1.l2.getLayoutParams().height, TLObject.FLAG_30));
            }
            uj0 uj0Var = wbVar.r1.V1;
            if (uj0Var != null) {
                measureChild(uj0Var, i9, i10);
                if (wbVar.r1.V1.getReactionsWindow() != null) {
                    measureChild(wbVar.r1.V1.getReactionsWindow().c, i9, i10);
                }
            }
        }
        for (int i16 = 0; i16 < getChildCount(); i16++) {
            View childAt = getChildAt(i16);
            if (childAt instanceof u0) {
                childAt.measure(View.MeasureSpec.makeMeasureSpec(i11, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(size2, TLObject.FLAG_30));
            } else if (childAt instanceof org.telegram.ui.Components.za) {
                childAt.measure(View.MeasureSpec.makeMeasureSpec(i11, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(Math.min(AndroidUtilities.dp(340.0f), size2 - (wbVar.R ? 0 : i12)), TLObject.FLAG_30));
            }
        }
        gb gbVar = wbVar.n1;
        if (gbVar != null) {
            gbVar.measure(View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(size2, TLObject.FLAG_30));
            wbVar.n1.d.measure(View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(size2, TLObject.FLAG_30));
        }
        hb hbVar = wbVar.o1;
        if (hbVar != null) {
            hbVar.measure(View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(size2, TLObject.FLAG_30));
            wbVar.o1.e.measure(View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(size2, TLObject.FLAG_30));
        }
        setMeasuredDimension(size, size2);
    }
}
