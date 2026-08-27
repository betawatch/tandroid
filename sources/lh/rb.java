package lh;

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
import org.telegram.ui.Components.wj0;
import org.telegram.ui.Components.yy;
import org.telegram.ui.Components.zu0;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes4.dex */
public final class rb extends zu0 {
    public final /* synthetic */ sb A0;
    public final n1.d s0;
    public final ScaleGestureDetector t0;
    public boolean u0;
    public boolean v0;
    public boolean w0;
    public float x0;
    public float y0;
    public float z0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rb(sb sbVar, Activity activity) {
        super(activity, null);
        this.A0 = sbVar;
        this.w0 = false;
        this.s0 = new n1.d(activity, new pb(this));
        this.t0 = new ScaleGestureDetector(activity, new qb(this));
    }

    public final void Z(Bitmap bitmap, float f10) {
        Canvas canvas = new Canvas(bitmap);
        canvas.drawColor(-16777216);
        float width = bitmap.getWidth();
        sb sbVar = this.A0;
        float width2 = width / sbVar.n.getWidth();
        canvas.scale(width2, width2);
        TextureView textureView = sbVar.T0.getTextureView();
        if (textureView == null) {
            textureView = sbVar.T0.r;
        }
        if (textureView != null) {
            canvas.save();
            canvas.translate(sbVar.d0.getX() + sbVar.r.getX(), sbVar.d0.getY() + sbVar.r.getY());
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
        canvas.translate(sbVar.r.getX(), sbVar.r.getY());
        for (int i10 = 0; i10 < sbVar.r.getChildCount(); i10++) {
            View childAt = sbVar.r.getChildAt(i10);
            canvas.save();
            canvas.translate(childAt.getX(), childAt.getY());
            if (childAt.getVisibility() == 0) {
                if (childAt == sbVar.d0) {
                    for (int i11 = 0; i11 < sbVar.d0.getChildCount(); i11++) {
                        View childAt2 = sbVar.d0.getChildAt(i11);
                        if (childAt2 != sbVar.T0 && childAt2 != sbVar.x0 && childAt2.getVisibility() == 0) {
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
    /* JADX WARN: Removed duplicated region for block: B:14:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0240  */
    /* JADX WARN: Removed duplicated region for block: B:45:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r11v3, types: [boolean] */
    /* JADX WARN: Type inference failed for: r11v5 */
    /* JADX WARN: Type inference failed for: r11v7 */
    @Override // org.telegram.ui.Components.zu0, android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void dispatchDraw(Canvas canvas) {
        boolean z10;
        boolean z11;
        ?? r11;
        va vaVar;
        float f10;
        zf.b2 b2Var;
        sb sbVar = this.A0;
        RectF rectF = sbVar.D;
        Path path = sbVar.a0;
        RectF rectF2 = sbVar.Z;
        RectF rectF3 = sbVar.Y;
        Float f11 = sbVar.H;
        float floatValue = f11 != null ? f11.floatValue() : sbVar.G;
        if (sbVar.F == 0) {
            canvas.drawColor(i0.b.k(-16777216, (int) ((1.0f - floatValue) * sbVar.E * 255.0f)));
        }
        float lerp = AndroidUtilities.lerp(sbVar.C, 0.0f, sbVar.E);
        if (sbVar.E != 1.0f) {
            int i10 = sbVar.F;
            if (i10 == 0) {
                rectF2.set(0.0f, 0.0f, getWidth(), getHeight());
                rectF2.offset(sbVar.r.getTranslationX(), sbVar.r.getTranslationY());
                AndroidUtilities.lerp(rectF, rectF2, sbVar.E, rectF3);
                canvas.save();
                path.rewind();
                path.addRoundRect(rectF3, lerp, lerp, Path.Direction.CW);
                canvas.clipPath(path);
                r11 = 0;
                canvas.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), (int) (Utilities.clamp(sbVar.E * 3.0f, 1.0f, 0.0f) * 255.0f), 31);
                canvas.translate(rectF3.left, rectF3.top - (sbVar.r.getTranslationY() * sbVar.E));
                float max = Math.max(rectF3.width() / getWidth(), rectF3.height() / getHeight());
                canvas.scale(max, max);
                z11 = true;
                vaVar = sbVar.r1;
                if (vaVar != null) {
                    rb rbVar = vaVar.I1;
                    float[] fArr = vaVar.f2;
                    if (vaVar.Z1) {
                        vaVar.Z1 = r11;
                        if (vaVar.V1 != null && (b2Var = vaVar.W1) != null) {
                            fArr[r11] = b2Var.getMeasuredWidth() / 2.0f;
                            fArr[1] = vaVar.W1.getMeasuredHeight() / 2.0f;
                            vaVar.W1.getMatrix().mapPoints(fArr);
                            f10 = 1.0f;
                            float scaleX = fArr[1] - (vaVar.W1.getScaleX() * (vaVar.W1.getMeasuredHeight() / 2.0f));
                            float scaleX2 = (vaVar.W1.getScaleX() * (vaVar.W1.getMeasuredHeight() / 2.0f)) + fArr[1];
                            if (scaleX < AndroidUtilities.dp(120.0f) && scaleX2 > rbVar.getMeasuredHeight() - AndroidUtilities.dp(200.0f)) {
                                vaVar.V1.setTop((boolean) r11);
                                vaVar.V1.setTranslationY(AndroidUtilities.dp(16.0f) + (AndroidUtilities.dp(120.0f) - vaVar.V1.getMeasuredHeight()));
                            } else if (scaleX < AndroidUtilities.dp(120.0f)) {
                                vaVar.V1.setTop(true);
                                vaVar.V1.setTranslationY((vaVar.W1.getScaleX() * (vaVar.W1.getMeasuredHeight() / 2.0f)) + fArr[1]);
                            } else {
                                vaVar.V1.setTop((boolean) r11);
                                vaVar.V1.setTranslationY((scaleX - r7.getMeasuredHeight()) + AndroidUtilities.dp(16.0f));
                            }
                            if (fArr[r11] < vaVar.getMeasuredWidth() / 2.0f) {
                                vaVar.V1.setMirrorX(true);
                                float measuredWidth = ((vaVar.V1.getMeasuredWidth() / 2.0f) + vaVar.V1.getX()) - (fArr[r11] - (vaVar.W1.getMeasuredHeight() / 2.0f));
                                if (measuredWidth > 0.0f) {
                                    vaVar.V1.setBubbleOffset(((r4.getMeasuredWidth() / 2.0f) - measuredWidth) / 2.0f);
                                }
                            } else {
                                float measuredWidth2 = ((vaVar.V1.getMeasuredWidth() / 2.0f) + vaVar.V1.getX()) - ((vaVar.W1.getMeasuredHeight() / 2.0f) + fArr[r11]);
                                if (measuredWidth2 < 0.0f) {
                                    vaVar.V1.setBubbleOffset((-((r4.getMeasuredWidth() / 2.0f) + measuredWidth2)) / 2.0f);
                                }
                                vaVar.V1.setMirrorX(r11);
                            }
                            vaVar.V1.setTranslationX((rbVar.getMeasuredWidth() - vaVar.V1.getMeasuredWidth()) / 2.0f);
                            super.dispatchDraw(canvas);
                            if (z11) {
                                canvas.restore();
                                canvas.restore();
                                if (sbVar.B != null) {
                                    float clamp = Utilities.clamp(f10 - (sbVar.E * 1.5f), 1.0f, 0.0f);
                                    rectF3.centerX();
                                    rectF3.centerY();
                                    Math.min(rectF3.width(), rectF3.height());
                                    nb nbVar = sbVar.B;
                                    ImageReceiver imageReceiver = nbVar.e;
                                    if (imageReceiver != null) {
                                        imageReceiver.setImageCoords(rectF3);
                                        int i11 = sbVar.B.e.getRoundRadius()[r11];
                                        sbVar.B.e.setRoundRadius((int) lerp);
                                        sbVar.B.e.setAlpha(clamp);
                                        sbVar.B.e.draw(canvas);
                                        sbVar.B.e.setRoundRadius(i11);
                                    } else {
                                        org.telegram.ui.Cells.a7 a7Var = nbVar.d;
                                        if (a7Var != null) {
                                            a7Var.setBounds((int) rectF3.left, (int) rectF3.top, (int) rectF3.right, (int) rectF3.bottom);
                                            org.telegram.ui.Cells.a7 a7Var2 = sbVar.B.d;
                                            a7Var2.d = (int) com.google.android.recaptcha.internal.a.C(clamp, 255.0f, clamp, clamp);
                                            a7Var2.draw(canvas);
                                        }
                                    }
                                    sbVar.B.getClass();
                                    canvas.save();
                                    canvas.translate(rectF.left, rectF.top);
                                    sbVar.B.a(canvas, clamp);
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
                if (i10 == 1) {
                    sbVar.k();
                }
            }
        } else {
            z10 = false;
        }
        z11 = false;
        r11 = z10;
        vaVar = sbVar.r1;
        if (vaVar != null) {
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
        sb sbVar = this.A0;
        z zVar = sbVar.E0;
        if (zVar != null && zVar.e) {
            float y10 = sbVar.E0.getY() + sbVar.e0.getY() + sbVar.r.getY();
            if ((motionEvent.getY() >= y10 && motionEvent.getY() <= y10 + sbVar.E0.getHeight()) || this.v0) {
                if (motionEvent.getAction() != 1 && motionEvent.getAction() != 3) {
                    z10 = true;
                }
                this.v0 = z10;
                return super.dispatchTouchEvent(motionEvent);
            }
            sbVar.E0.a(false, true);
            sbVar.m0(true);
        }
        if (this.v0 && (motionEvent.getAction() == 1 || motionEvent.getAction() == 3)) {
            this.v0 = false;
        }
        this.t0.onTouchEvent(motionEvent);
        this.s0.P(motionEvent);
        if (motionEvent.getAction() == 1 && !this.u0) {
            if (sbVar.r.getTranslationY() <= 0.0f) {
                sa saVar = sbVar.I0;
                if (saVar != null && saVar.getTranslationY() > 0.0f && !sbVar.H0) {
                    sbVar.f(!sbVar.M1 && sbVar.I0.getTranslationY() < ((float) sbVar.I0.getPadding()));
                }
            } else if (sbVar.G > 0.4f) {
                sbVar.q(true);
            } else {
                sb.c(sbVar);
            }
            sbVar.H0 = false;
            sbVar.S = false;
            sbVar.T = false;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // org.telegram.ui.Components.zu0
    public int getBottomPadding() {
        int height = getHeight();
        sb sbVar = this.A0;
        return (height - sbVar.r.getBottom()) + sbVar.Q;
    }

    public int getBottomPadding2() {
        return getHeight() - this.A0.r.getBottom();
    }

    @Override // org.telegram.ui.Components.zu0
    public /* bridge */ /* synthetic */ int[] getColorKeys() {
        return null;
    }

    public int getPaddingUnderContainer() {
        int height = getHeight();
        sb sbVar = this.A0;
        return (height - sbVar.X) - sbVar.r.getBottom();
    }

    @Override // org.telegram.ui.Components.zu0, android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int i14;
        yy emojiView;
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        sb sbVar = this.A0;
        int i15 = sbVar.V;
        int measuredHeight2 = sbVar.i0.getMeasuredHeight();
        if (sbVar.R) {
            i15 = 0;
        }
        int i16 = sbVar.O;
        int b10 = h7.n.b((measuredWidth - i16) / 2, sbVar.U, (measuredWidth - sbVar.W) - i16);
        int i17 = sbVar.O + b10;
        if (sbVar.R) {
            i14 = sbVar.P;
        } else {
            int i18 = sbVar.X;
            int i19 = sbVar.P;
            int i20 = (((((measuredHeight - i15) - i18) - i19) - measuredHeight2) / 2) + i15;
            if (sbVar.F == 1) {
                float f10 = sbVar.D.top;
                if (i19 + f10 + measuredHeight2 < measuredHeight - i18) {
                    i15 = (int) f10;
                    i14 = sbVar.P;
                }
            }
            if (i20 - i15 >= AndroidUtilities.dp(40.0f)) {
                i15 = i20;
            }
            i14 = sbVar.P;
        }
        sbVar.r.layout(b10, i15, i17, i14 + i15 + measuredHeight2);
        sbVar.s.b.layout(0, 0, measuredWidth, measuredHeight);
        bb bbVar = sbVar.y2;
        if (bbVar != null) {
            bbVar.layout(0, 0, measuredWidth, measuredHeight);
        }
        sa saVar = sbVar.I0;
        if (saVar != null) {
            saVar.layout((measuredWidth - saVar.getMeasuredWidth()) / 2, 0, (sbVar.I0.getMeasuredWidth() + measuredWidth) / 2, measuredHeight);
        }
        ib ibVar = sbVar.Y0;
        if (ibVar != null && (emojiView = ibVar.f.getEmojiView()) != null) {
            emojiView.layout(sbVar.U, (measuredHeight - sbVar.X) - emojiView.getMeasuredHeight(), measuredWidth - sbVar.W, measuredHeight - sbVar.X);
        }
        va vaVar = sbVar.r1;
        if (vaVar != null) {
            yy yyVar = vaVar.l2;
            if (yyVar != null) {
                yyVar.layout(sbVar.U, (measuredHeight - sbVar.X) - yyVar.getMeasuredHeight(), measuredWidth - sbVar.W, measuredHeight - sbVar.X);
            }
            wj0 wj0Var = sbVar.r1.V1;
            if (wj0Var != null) {
                int i21 = sbVar.U;
                wj0Var.layout(i21, sbVar.V, wj0Var.getMeasuredWidth() + i21, sbVar.r1.V1.getMeasuredHeight() + sbVar.V);
                ag.y1 y1Var = sbVar.r1.V1.getReactionsWindow() != null ? sbVar.r1.V1.getReactionsWindow().c : null;
                if (y1Var != null) {
                    int i22 = sbVar.U;
                    y1Var.layout(i22, sbVar.V, y1Var.getMeasuredWidth() + i22, y1Var.getMeasuredHeight() + sbVar.V);
                }
            }
        }
        db dbVar = sbVar.n1;
        if (dbVar != null) {
            dbVar.e.setPadding(0, sbVar.V, 0, sbVar.X);
            sbVar.n1.layout(0, 0, measuredWidth, measuredHeight);
            sbVar.n1.d.layout(0, 0, measuredWidth, measuredHeight);
        }
        eb ebVar = sbVar.o1;
        if (ebVar != null) {
            ebVar.f.setPadding(0, sbVar.V, 0, sbVar.X);
            sbVar.o1.layout(0, 0, measuredWidth, measuredHeight);
            sbVar.o1.e.layout(0, 0, measuredWidth, measuredHeight);
        }
        for (int i23 = 0; i23 < getChildCount(); i23++) {
            View childAt = getChildAt(i23);
            if (childAt instanceof t0) {
                childAt.layout(0, 0, measuredWidth, measuredHeight);
            } else if (childAt instanceof org.telegram.ui.Components.xa) {
                childAt.layout(0, i15, childAt.getMeasuredWidth(), childAt.getMeasuredHeight() + i15);
            }
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        int size = View.MeasureSpec.getSize(i10);
        int size2 = View.MeasureSpec.getSize(i11);
        sb sbVar = this.A0;
        int i12 = (size - sbVar.U) - sbVar.W;
        int i13 = sbVar.V;
        int i14 = sbVar.X;
        int ceil = (int) Math.ceil((i12 / 9.0f) * 16.0f);
        int dp = AndroidUtilities.dp(48.0f);
        sbVar.Q = dp;
        int i15 = ceil + dp;
        int i16 = size2 - i14;
        if (i15 <= i16) {
            sbVar.O = i12;
            sbVar.P = ceil;
            sbVar.R = i15 > i16 - i13;
        } else {
            sbVar.R = false;
            sbVar.P = ((size2 - dp) - i14) - i13;
            sbVar.O = (int) Math.ceil((r9 * 9.0f) / 16.0f);
        }
        sbVar.Q = Utilities.clamp((size2 - sbVar.P) - (sbVar.R ? 0 : i13), AndroidUtilities.dp(68.0f), AndroidUtilities.dp(48.0f));
        int systemUiVisibility = getSystemUiVisibility();
        setSystemUiVisibility(sbVar.R ? systemUiVisibility | 4 : systemUiVisibility & (-5));
        sbVar.r.measure(View.MeasureSpec.makeMeasureSpec(sbVar.O, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(sbVar.P + sbVar.Q, TLObject.FLAG_30));
        sbVar.s.b.measure(View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(size2, TLObject.FLAG_30));
        bb bbVar = sbVar.y2;
        if (bbVar != null) {
            bbVar.measure(View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(size2, TLObject.FLAG_30));
        }
        sa saVar = sbVar.I0;
        if (saVar != null) {
            saVar.measure(View.MeasureSpec.makeMeasureSpec(sbVar.O, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(size2, TLObject.FLAG_30));
        }
        ib ibVar = sbVar.Y0;
        if (ibVar != null) {
            yy emojiView = ibVar.f.getEmojiView();
            R();
            AndroidUtilities.dp(20.0f);
            if (emojiView != null) {
                emojiView.measure(View.MeasureSpec.makeMeasureSpec(i12, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(emojiView.getLayoutParams().height, TLObject.FLAG_30));
            }
        }
        va vaVar = sbVar.r1;
        if (vaVar != null) {
            yy yyVar = vaVar.l2;
            if (yyVar != null) {
                yyVar.measure(View.MeasureSpec.makeMeasureSpec(i12, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(sbVar.r1.l2.getLayoutParams().height, TLObject.FLAG_30));
            }
            wj0 wj0Var = sbVar.r1.V1;
            if (wj0Var != null) {
                measureChild(wj0Var, i10, i11);
                if (sbVar.r1.V1.getReactionsWindow() != null) {
                    measureChild(sbVar.r1.V1.getReactionsWindow().c, i10, i11);
                }
            }
        }
        for (int i17 = 0; i17 < getChildCount(); i17++) {
            View childAt = getChildAt(i17);
            if (childAt instanceof t0) {
                childAt.measure(View.MeasureSpec.makeMeasureSpec(i12, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(size2, TLObject.FLAG_30));
            } else if (childAt instanceof org.telegram.ui.Components.xa) {
                childAt.measure(View.MeasureSpec.makeMeasureSpec(i12, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(Math.min(AndroidUtilities.dp(340.0f), size2 - (sbVar.R ? 0 : i13)), TLObject.FLAG_30));
            }
        }
        db dbVar = sbVar.n1;
        if (dbVar != null) {
            dbVar.measure(View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(size2, TLObject.FLAG_30));
            sbVar.n1.d.measure(View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(size2, TLObject.FLAG_30));
        }
        eb ebVar = sbVar.o1;
        if (ebVar != null) {
            ebVar.measure(View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(size2, TLObject.FLAG_30));
            sbVar.o1.e.measure(View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(size2, TLObject.FLAG_30));
        }
        setMeasuredDimension(size, size2);
    }
}
