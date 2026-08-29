package nh;

import android.app.Activity;
import android.content.Context;
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
import org.telegram.ui.Components.fk0;
import org.telegram.ui.Components.fz;
import org.telegram.ui.Components.h20;
import org.telegram.ui.Components.hv0;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes4.dex */
public final class fb extends hv0 {
    public final /* synthetic */ gb A0;
    public final o4.g s0;
    public final ScaleGestureDetector t0;
    public boolean u0;
    public boolean v0;
    public boolean w0;
    public float x0;
    public float y0;
    public float z0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fb(gb gbVar, Activity activity) {
        super(activity, null);
        this.A0 = gbVar;
        this.w0 = false;
        this.s0 = new o4.g((Context) activity, (h20) new db(this));
        this.t0 = new ScaleGestureDetector(activity, new eb(this));
    }

    public final void Z(Bitmap bitmap, float f9) {
        Canvas canvas = new Canvas(bitmap);
        canvas.drawColor(-16777216);
        float width = bitmap.getWidth();
        gb gbVar = this.A0;
        float width2 = width / gbVar.n.getWidth();
        canvas.scale(width2, width2);
        TextureView textureView = gbVar.T0.getTextureView();
        if (textureView == null) {
            textureView = gbVar.T0.r;
        }
        if (textureView != null) {
            canvas.save();
            canvas.translate(gbVar.d0.getX() + gbVar.r.getX(), gbVar.d0.getY() + gbVar.r.getY());
            try {
                Bitmap bitmap2 = textureView.getBitmap((int) (textureView.getWidth() / f9), (int) (textureView.getHeight() / f9));
                float f10 = 1.0f / width2;
                canvas.scale(f10, f10);
                canvas.drawBitmap(bitmap2, 0.0f, 0.0f, new Paint(2));
                bitmap2.recycle();
            } catch (Exception unused) {
            }
            canvas.restore();
        }
        canvas.save();
        canvas.translate(gbVar.r.getX(), gbVar.r.getY());
        for (int i10 = 0; i10 < gbVar.r.getChildCount(); i10++) {
            View childAt = gbVar.r.getChildAt(i10);
            canvas.save();
            canvas.translate(childAt.getX(), childAt.getY());
            if (childAt.getVisibility() == 0) {
                if (childAt == gbVar.d0) {
                    for (int i11 = 0; i11 < gbVar.d0.getChildCount(); i11++) {
                        View childAt2 = gbVar.d0.getChildAt(i11);
                        if (childAt2 != gbVar.T0 && childAt2 != gbVar.x0 && childAt2.getVisibility() == 0) {
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
    @Override // org.telegram.ui.Components.hv0, android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void dispatchDraw(Canvas canvas) {
        boolean z10;
        boolean z11;
        ?? r11;
        ja jaVar;
        float f9;
        bg.e3 e3Var;
        gb gbVar = this.A0;
        RectF rectF = gbVar.D;
        Path path = gbVar.a0;
        RectF rectF2 = gbVar.Z;
        RectF rectF3 = gbVar.Y;
        Float f10 = gbVar.H;
        float floatValue = f10 != null ? f10.floatValue() : gbVar.G;
        if (gbVar.F == 0) {
            canvas.drawColor(i0.a.k(-16777216, (int) ((1.0f - floatValue) * gbVar.E * 255.0f)));
        }
        float lerp = AndroidUtilities.lerp(gbVar.C, 0.0f, gbVar.E);
        if (gbVar.E != 1.0f) {
            int i10 = gbVar.F;
            if (i10 == 0) {
                rectF2.set(0.0f, 0.0f, getWidth(), getHeight());
                rectF2.offset(gbVar.r.getTranslationX(), gbVar.r.getTranslationY());
                AndroidUtilities.lerp(rectF, rectF2, gbVar.E, rectF3);
                canvas.save();
                path.rewind();
                path.addRoundRect(rectF3, lerp, lerp, Path.Direction.CW);
                canvas.clipPath(path);
                r11 = 0;
                canvas.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), (int) (Utilities.clamp(gbVar.E * 3.0f, 1.0f, 0.0f) * 255.0f), 31);
                canvas.translate(rectF3.left, rectF3.top - (gbVar.r.getTranslationY() * gbVar.E));
                float max = Math.max(rectF3.width() / getWidth(), rectF3.height() / getHeight());
                canvas.scale(max, max);
                z11 = true;
                jaVar = gbVar.r1;
                if (jaVar != null) {
                    fb fbVar = jaVar.I1;
                    float[] fArr = jaVar.f2;
                    if (jaVar.Z1) {
                        jaVar.Z1 = r11;
                        if (jaVar.V1 != null && (e3Var = jaVar.W1) != null) {
                            fArr[r11] = e3Var.getMeasuredWidth() / 2.0f;
                            fArr[1] = jaVar.W1.getMeasuredHeight() / 2.0f;
                            jaVar.W1.getMatrix().mapPoints(fArr);
                            f9 = 1.0f;
                            float scaleX = fArr[1] - (jaVar.W1.getScaleX() * (jaVar.W1.getMeasuredHeight() / 2.0f));
                            float scaleX2 = (jaVar.W1.getScaleX() * (jaVar.W1.getMeasuredHeight() / 2.0f)) + fArr[1];
                            if (scaleX < AndroidUtilities.dp(120.0f) && scaleX2 > fbVar.getMeasuredHeight() - AndroidUtilities.dp(200.0f)) {
                                jaVar.V1.setTop((boolean) r11);
                                jaVar.V1.setTranslationY(AndroidUtilities.dp(16.0f) + (AndroidUtilities.dp(120.0f) - jaVar.V1.getMeasuredHeight()));
                            } else if (scaleX < AndroidUtilities.dp(120.0f)) {
                                jaVar.V1.setTop(true);
                                jaVar.V1.setTranslationY((jaVar.W1.getScaleX() * (jaVar.W1.getMeasuredHeight() / 2.0f)) + fArr[1]);
                            } else {
                                jaVar.V1.setTop((boolean) r11);
                                jaVar.V1.setTranslationY((scaleX - r7.getMeasuredHeight()) + AndroidUtilities.dp(16.0f));
                            }
                            if (fArr[r11] < jaVar.getMeasuredWidth() / 2.0f) {
                                jaVar.V1.setMirrorX(true);
                                float measuredWidth = ((jaVar.V1.getMeasuredWidth() / 2.0f) + jaVar.V1.getX()) - (fArr[r11] - (jaVar.W1.getMeasuredHeight() / 2.0f));
                                if (measuredWidth > 0.0f) {
                                    jaVar.V1.setBubbleOffset(((r4.getMeasuredWidth() / 2.0f) - measuredWidth) / 2.0f);
                                }
                            } else {
                                float measuredWidth2 = ((jaVar.V1.getMeasuredWidth() / 2.0f) + jaVar.V1.getX()) - ((jaVar.W1.getMeasuredHeight() / 2.0f) + fArr[r11]);
                                if (measuredWidth2 < 0.0f) {
                                    jaVar.V1.setBubbleOffset((-((r4.getMeasuredWidth() / 2.0f) + measuredWidth2)) / 2.0f);
                                }
                                jaVar.V1.setMirrorX(r11);
                            }
                            jaVar.V1.setTranslationX((fbVar.getMeasuredWidth() - jaVar.V1.getMeasuredWidth()) / 2.0f);
                            super.dispatchDraw(canvas);
                            if (z11) {
                                canvas.restore();
                                canvas.restore();
                                if (gbVar.B != null) {
                                    float clamp = Utilities.clamp(f9 - (gbVar.E * 1.5f), 1.0f, 0.0f);
                                    rectF3.centerX();
                                    rectF3.centerY();
                                    Math.min(rectF3.width(), rectF3.height());
                                    bb bbVar = gbVar.B;
                                    ImageReceiver imageReceiver = bbVar.e;
                                    if (imageReceiver != null) {
                                        imageReceiver.setImageCoords(rectF3);
                                        int i11 = gbVar.B.e.getRoundRadius()[r11];
                                        gbVar.B.e.setRoundRadius((int) lerp);
                                        gbVar.B.e.setAlpha(clamp);
                                        gbVar.B.e.draw(canvas);
                                        gbVar.B.e.setRoundRadius(i11);
                                    } else {
                                        org.telegram.ui.Cells.b7 b7Var = bbVar.d;
                                        if (b7Var != null) {
                                            b7Var.setBounds((int) rectF3.left, (int) rectF3.top, (int) rectF3.right, (int) rectF3.bottom);
                                            org.telegram.ui.Cells.b7 b7Var2 = gbVar.B.d;
                                            b7Var2.d = (int) com.google.android.recaptcha.internal.a.C(clamp, 255.0f, clamp, clamp);
                                            b7Var2.draw(canvas);
                                        }
                                    }
                                    gbVar.B.getClass();
                                    canvas.save();
                                    canvas.translate(rectF.left, rectF.top);
                                    gbVar.B.a(canvas, clamp);
                                    canvas.restore();
                                    return;
                                }
                                return;
                            }
                            return;
                        }
                    }
                }
                f9 = 1.0f;
                super.dispatchDraw(canvas);
                if (z11) {
                }
            } else {
                z10 = false;
                z10 = false;
                if (i10 == 1) {
                    gbVar.k();
                }
            }
        } else {
            z10 = false;
        }
        z11 = false;
        r11 = z10;
        jaVar = gbVar.r1;
        if (jaVar != null) {
        }
        f9 = 1.0f;
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
        gb gbVar = this.A0;
        y yVar = gbVar.E0;
        if (yVar != null && yVar.e) {
            float y8 = gbVar.E0.getY() + gbVar.e0.getY() + gbVar.r.getY();
            if ((motionEvent.getY() >= y8 && motionEvent.getY() <= y8 + gbVar.E0.getHeight()) || this.v0) {
                if (motionEvent.getAction() != 1 && motionEvent.getAction() != 3) {
                    z10 = true;
                }
                this.v0 = z10;
                return super.dispatchTouchEvent(motionEvent);
            }
            gbVar.E0.a(false, true);
            gbVar.m0(true);
        }
        if (this.v0 && (motionEvent.getAction() == 1 || motionEvent.getAction() == 3)) {
            this.v0 = false;
        }
        this.t0.onTouchEvent(motionEvent);
        this.s0.r(motionEvent);
        if (motionEvent.getAction() == 1 && !this.u0) {
            if (gbVar.r.getTranslationY() <= 0.0f) {
                ga gaVar = gbVar.I0;
                if (gaVar != null && gaVar.getTranslationY() > 0.0f && !gbVar.H0) {
                    gbVar.f(!gbVar.M1 && gbVar.I0.getTranslationY() < ((float) gbVar.I0.getPadding()));
                }
            } else if (gbVar.G > 0.4f) {
                gbVar.q(true);
            } else {
                gb.c(gbVar);
            }
            gbVar.H0 = false;
            gbVar.S = false;
            gbVar.T = false;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // org.telegram.ui.Components.hv0
    public int getBottomPadding() {
        int height = getHeight();
        gb gbVar = this.A0;
        return (height - gbVar.r.getBottom()) + gbVar.Q;
    }

    public int getBottomPadding2() {
        return getHeight() - this.A0.r.getBottom();
    }

    @Override // org.telegram.ui.Components.hv0
    public /* bridge */ /* synthetic */ int[] getColorKeys() {
        return null;
    }

    public int getPaddingUnderContainer() {
        int height = getHeight();
        gb gbVar = this.A0;
        return (height - gbVar.X) - gbVar.r.getBottom();
    }

    @Override // org.telegram.ui.Components.hv0, android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int i14;
        fz emojiView;
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        gb gbVar = this.A0;
        int i15 = gbVar.V;
        int measuredHeight2 = gbVar.i0.getMeasuredHeight();
        if (gbVar.R) {
            i15 = 0;
        }
        int i16 = gbVar.O;
        int b10 = i7.w.b((measuredWidth - i16) / 2, gbVar.U, (measuredWidth - gbVar.W) - i16);
        int i17 = gbVar.O + b10;
        if (gbVar.R) {
            i14 = gbVar.P;
        } else {
            int i18 = gbVar.X;
            int i19 = gbVar.P;
            int i20 = (((((measuredHeight - i15) - i18) - i19) - measuredHeight2) / 2) + i15;
            if (gbVar.F == 1) {
                float f9 = gbVar.D.top;
                if (i19 + f9 + measuredHeight2 < measuredHeight - i18) {
                    i15 = (int) f9;
                    i14 = gbVar.P;
                }
            }
            if (i20 - i15 >= AndroidUtilities.dp(40.0f)) {
                i15 = i20;
            }
            i14 = gbVar.P;
        }
        gbVar.r.layout(b10, i15, i17, i14 + i15 + measuredHeight2);
        gbVar.s.b.layout(0, 0, measuredWidth, measuredHeight);
        pa paVar = gbVar.y2;
        if (paVar != null) {
            paVar.layout(0, 0, measuredWidth, measuredHeight);
        }
        ga gaVar = gbVar.I0;
        if (gaVar != null) {
            gaVar.layout((measuredWidth - gaVar.getMeasuredWidth()) / 2, 0, (gbVar.I0.getMeasuredWidth() + measuredWidth) / 2, measuredHeight);
        }
        wa waVar = gbVar.Y0;
        if (waVar != null && (emojiView = waVar.f.getEmojiView()) != null) {
            emojiView.layout(gbVar.U, (measuredHeight - gbVar.X) - emojiView.getMeasuredHeight(), measuredWidth - gbVar.W, measuredHeight - gbVar.X);
        }
        ja jaVar = gbVar.r1;
        if (jaVar != null) {
            fz fzVar = jaVar.l2;
            if (fzVar != null) {
                fzVar.layout(gbVar.U, (measuredHeight - gbVar.X) - fzVar.getMeasuredHeight(), measuredWidth - gbVar.W, measuredHeight - gbVar.X);
            }
            fk0 fk0Var = gbVar.r1.V1;
            if (fk0Var != null) {
                int i21 = gbVar.U;
                fk0Var.layout(i21, gbVar.V, fk0Var.getMeasuredWidth() + i21, gbVar.r1.V1.getMeasuredHeight() + gbVar.V);
                bg.d1 d1Var = gbVar.r1.V1.getReactionsWindow() != null ? gbVar.r1.V1.getReactionsWindow().c : null;
                if (d1Var != null) {
                    int i22 = gbVar.U;
                    d1Var.layout(i22, gbVar.V, d1Var.getMeasuredWidth() + i22, d1Var.getMeasuredHeight() + gbVar.V);
                }
            }
        }
        ra raVar = gbVar.n1;
        if (raVar != null) {
            raVar.e.setPadding(0, gbVar.V, 0, gbVar.X);
            gbVar.n1.layout(0, 0, measuredWidth, measuredHeight);
            gbVar.n1.d.layout(0, 0, measuredWidth, measuredHeight);
        }
        sa saVar = gbVar.o1;
        if (saVar != null) {
            saVar.f.setPadding(0, gbVar.V, 0, gbVar.X);
            gbVar.o1.layout(0, 0, measuredWidth, measuredHeight);
            gbVar.o1.e.layout(0, 0, measuredWidth, measuredHeight);
        }
        for (int i23 = 0; i23 < getChildCount(); i23++) {
            View childAt = getChildAt(i23);
            if (childAt instanceof t0) {
                childAt.layout(0, 0, measuredWidth, measuredHeight);
            } else if (childAt instanceof org.telegram.ui.Components.eb) {
                childAt.layout(0, i15, childAt.getMeasuredWidth(), childAt.getMeasuredHeight() + i15);
            }
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        int size = View.MeasureSpec.getSize(i10);
        int size2 = View.MeasureSpec.getSize(i11);
        gb gbVar = this.A0;
        int i12 = (size - gbVar.U) - gbVar.W;
        int i13 = gbVar.V;
        int i14 = gbVar.X;
        int ceil = (int) Math.ceil((i12 / 9.0f) * 16.0f);
        int dp = AndroidUtilities.dp(48.0f);
        gbVar.Q = dp;
        int i15 = ceil + dp;
        int i16 = size2 - i14;
        if (i15 <= i16) {
            gbVar.O = i12;
            gbVar.P = ceil;
            gbVar.R = i15 > i16 - i13;
        } else {
            gbVar.R = false;
            gbVar.P = ((size2 - dp) - i14) - i13;
            gbVar.O = (int) Math.ceil((r9 * 9.0f) / 16.0f);
        }
        gbVar.Q = Utilities.clamp((size2 - gbVar.P) - (gbVar.R ? 0 : i13), AndroidUtilities.dp(68.0f), AndroidUtilities.dp(48.0f));
        int systemUiVisibility = getSystemUiVisibility();
        setSystemUiVisibility(gbVar.R ? systemUiVisibility | 4 : systemUiVisibility & (-5));
        gbVar.r.measure(View.MeasureSpec.makeMeasureSpec(gbVar.O, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(gbVar.P + gbVar.Q, TLObject.FLAG_30));
        gbVar.s.b.measure(View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(size2, TLObject.FLAG_30));
        pa paVar = gbVar.y2;
        if (paVar != null) {
            paVar.measure(View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(size2, TLObject.FLAG_30));
        }
        ga gaVar = gbVar.I0;
        if (gaVar != null) {
            gaVar.measure(View.MeasureSpec.makeMeasureSpec(gbVar.O, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(size2, TLObject.FLAG_30));
        }
        wa waVar = gbVar.Y0;
        if (waVar != null) {
            fz emojiView = waVar.f.getEmojiView();
            R();
            AndroidUtilities.dp(20.0f);
            if (emojiView != null) {
                emojiView.measure(View.MeasureSpec.makeMeasureSpec(i12, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(emojiView.getLayoutParams().height, TLObject.FLAG_30));
            }
        }
        ja jaVar = gbVar.r1;
        if (jaVar != null) {
            fz fzVar = jaVar.l2;
            if (fzVar != null) {
                fzVar.measure(View.MeasureSpec.makeMeasureSpec(i12, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(gbVar.r1.l2.getLayoutParams().height, TLObject.FLAG_30));
            }
            fk0 fk0Var = gbVar.r1.V1;
            if (fk0Var != null) {
                measureChild(fk0Var, i10, i11);
                if (gbVar.r1.V1.getReactionsWindow() != null) {
                    measureChild(gbVar.r1.V1.getReactionsWindow().c, i10, i11);
                }
            }
        }
        for (int i17 = 0; i17 < getChildCount(); i17++) {
            View childAt = getChildAt(i17);
            if (childAt instanceof t0) {
                childAt.measure(View.MeasureSpec.makeMeasureSpec(i12, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(size2, TLObject.FLAG_30));
            } else if (childAt instanceof org.telegram.ui.Components.eb) {
                childAt.measure(View.MeasureSpec.makeMeasureSpec(i12, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(Math.min(AndroidUtilities.dp(340.0f), size2 - (gbVar.R ? 0 : i13)), TLObject.FLAG_30));
            }
        }
        ra raVar = gbVar.n1;
        if (raVar != null) {
            raVar.measure(View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(size2, TLObject.FLAG_30));
            gbVar.n1.d.measure(View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(size2, TLObject.FLAG_30));
        }
        sa saVar = gbVar.o1;
        if (saVar != null) {
            saVar.measure(View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(size2, TLObject.FLAG_30));
            gbVar.o1.e.measure(View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(size2, TLObject.FLAG_30));
        }
        setMeasuredDimension(size, size2);
    }
}
