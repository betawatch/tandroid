package fi;

import a8.ee;
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
import org.telegram.ui.Components.gl0;
import org.telegram.ui.Components.sz;
import org.telegram.ui.Components.ww0;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes4.dex */
public final class rb extends ww0 {
    public final jg.i l0;
    public final ScaleGestureDetector m0;
    public boolean n0;
    public boolean o0;
    public boolean p0;
    public float q0;
    public float r0;
    public float s0;
    public final /* synthetic */ sb t0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rb(sb sbVar, Activity activity) {
        super(activity, null);
        this.t0 = sbVar;
        this.p0 = false;
        this.l0 = new jg.i(activity, new pb(this));
        this.m0 = new ScaleGestureDetector(activity, new qb(this));
    }

    public final void X(Bitmap bitmap, float f7) {
        Canvas canvas = new Canvas(bitmap);
        canvas.drawColor(-16777216);
        float width = bitmap.getWidth();
        sb sbVar = this.t0;
        float width2 = width / sbVar.n.getWidth();
        canvas.scale(width2, width2);
        TextureView textureView = sbVar.X0.getTextureView();
        if (textureView == null) {
            textureView = sbVar.X0.r;
        }
        if (textureView != null) {
            canvas.save();
            canvas.translate(sbVar.h0.getX() + sbVar.r.getX(), sbVar.h0.getY() + sbVar.r.getY());
            try {
                Bitmap bitmap2 = textureView.getBitmap((int) (textureView.getWidth() / f7), (int) (textureView.getHeight() / f7));
                float f10 = 1.0f / width2;
                canvas.scale(f10, f10);
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
                if (childAt == sbVar.h0) {
                    for (int i11 = 0; i11 < sbVar.h0.getChildCount(); i11++) {
                        View childAt2 = sbVar.h0.getChildAt(i11);
                        if (childAt2 != sbVar.X0 && childAt2 != sbVar.B0 && childAt2.getVisibility() == 0) {
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
    /* JADX WARN: Removed duplicated region for block: B:14:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x023a  */
    /* JADX WARN: Removed duplicated region for block: B:45:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r11v3, types: [boolean] */
    /* JADX WARN: Type inference failed for: r11v5 */
    /* JADX WARN: Type inference failed for: r11v7 */
    @Override // org.telegram.ui.Components.ww0, android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void dispatchDraw(Canvas canvas) {
        boolean z10;
        boolean z11;
        ?? r11;
        ta taVar;
        float f7;
        float f10;
        sg.b2 b2Var;
        sb sbVar = this.t0;
        RectF rectF = sbVar.H;
        Path path = sbVar.e0;
        RectF rectF2 = sbVar.d0;
        RectF rectF3 = sbVar.c0;
        Float f11 = sbVar.L;
        float floatValue = f11 != null ? f11.floatValue() : sbVar.K;
        if (sbVar.J == 0) {
            canvas.drawColor(i0.a.o(-16777216, (int) ((1.0f - floatValue) * sbVar.I * 255.0f)));
        }
        float lerp = AndroidUtilities.lerp(sbVar.G, 0.0f, sbVar.I);
        if (sbVar.I != 1.0f) {
            int i10 = sbVar.J;
            if (i10 == 0) {
                rectF2.set(0.0f, 0.0f, getWidth(), getHeight());
                rectF2.offset(sbVar.r.getTranslationX(), sbVar.r.getTranslationY());
                AndroidUtilities.lerp(rectF, rectF2, sbVar.I, rectF3);
                canvas.save();
                path.rewind();
                path.addRoundRect(rectF3, lerp, lerp, Path.Direction.CW);
                canvas.clipPath(path);
                r11 = 0;
                canvas.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), (int) (Utilities.clamp(sbVar.I * 3.0f, 1.0f, 0.0f) * 255.0f), 31);
                canvas.translate(rectF3.left, rectF3.top - (sbVar.r.getTranslationY() * sbVar.I));
                float max = Math.max(rectF3.width() / getWidth(), rectF3.height() / getHeight());
                canvas.scale(max, max);
                z11 = true;
                taVar = sbVar.v1;
                if (taVar != null) {
                    rb rbVar = taVar.B1;
                    float[] fArr = taVar.Y1;
                    if (taVar.S1) {
                        taVar.S1 = r11;
                        if (taVar.O1 != null && (b2Var = taVar.P1) != null) {
                            fArr[r11] = b2Var.getMeasuredWidth() / 2.0f;
                            fArr[1] = taVar.P1.getMeasuredHeight() / 2.0f;
                            taVar.P1.getMatrix().mapPoints(fArr);
                            f7 = 1.0f;
                            float scaleX = fArr[1] - (taVar.P1.getScaleX() * (taVar.P1.getMeasuredHeight() / 2.0f));
                            f10 = 0.0f;
                            float scaleX2 = (taVar.P1.getScaleX() * (taVar.P1.getMeasuredHeight() / 2.0f)) + fArr[1];
                            if (scaleX < AndroidUtilities.dp(120.0f) && scaleX2 > rbVar.getMeasuredHeight() - AndroidUtilities.dp(200.0f)) {
                                taVar.O1.setTop((boolean) r11);
                                taVar.O1.setTranslationY(AndroidUtilities.dp(16.0f) + (AndroidUtilities.dp(120.0f) - taVar.O1.getMeasuredHeight()));
                            } else if (scaleX < AndroidUtilities.dp(120.0f)) {
                                taVar.O1.setTop(true);
                                taVar.O1.setTranslationY((taVar.P1.getScaleX() * (taVar.P1.getMeasuredHeight() / 2.0f)) + fArr[1]);
                            } else {
                                taVar.O1.setTop((boolean) r11);
                                taVar.O1.setTranslationY((scaleX - r7.getMeasuredHeight()) + AndroidUtilities.dp(16.0f));
                            }
                            if (fArr[r11] < taVar.getMeasuredWidth() / 2.0f) {
                                taVar.O1.setMirrorX(true);
                                float measuredWidth = ((taVar.O1.getMeasuredWidth() / 2.0f) + taVar.O1.getX()) - (fArr[r11] - (taVar.P1.getMeasuredHeight() / 2.0f));
                                if (measuredWidth > 0.0f) {
                                    taVar.O1.setBubbleOffset(((r4.getMeasuredWidth() / 2.0f) - measuredWidth) / 2.0f);
                                }
                            } else {
                                float measuredWidth2 = ((taVar.O1.getMeasuredWidth() / 2.0f) + taVar.O1.getX()) - ((taVar.P1.getMeasuredHeight() / 2.0f) + fArr[r11]);
                                if (measuredWidth2 < 0.0f) {
                                    taVar.O1.setBubbleOffset((-((r4.getMeasuredWidth() / 2.0f) + measuredWidth2)) / 2.0f);
                                }
                                taVar.O1.setMirrorX(r11);
                            }
                            taVar.O1.setTranslationX((rbVar.getMeasuredWidth() - taVar.O1.getMeasuredWidth()) / 2.0f);
                            super.dispatchDraw(canvas);
                            if (z11) {
                                canvas.restore();
                                canvas.restore();
                                if (sbVar.F != null) {
                                    float clamp = Utilities.clamp(f7 - (sbVar.I * 1.5f), f7, f10);
                                    rectF3.centerX();
                                    rectF3.centerY();
                                    Math.min(rectF3.width(), rectF3.height());
                                    nb nbVar = sbVar.F;
                                    ImageReceiver imageReceiver = nbVar.e;
                                    if (imageReceiver != null) {
                                        imageReceiver.setImageCoords(rectF3);
                                        int i11 = sbVar.F.e.getRoundRadius()[r11];
                                        sbVar.F.e.setRoundRadius((int) lerp);
                                        sbVar.F.e.setAlpha(clamp);
                                        sbVar.F.e.draw(canvas);
                                        sbVar.F.e.setRoundRadius(i11);
                                    } else {
                                        org.telegram.ui.Cells.j7 j7Var = nbVar.d;
                                        if (j7Var != null) {
                                            j7Var.setBounds((int) rectF3.left, (int) rectF3.top, (int) rectF3.right, (int) rectF3.bottom);
                                            org.telegram.ui.Cells.j7 j7Var2 = sbVar.F.d;
                                            j7Var2.g = (int) c3.h0.E(clamp, 255.0f, clamp, clamp);
                                            j7Var2.draw(canvas);
                                        }
                                    }
                                    sbVar.F.getClass();
                                    canvas.save();
                                    canvas.translate(rectF.left, rectF.top);
                                    sbVar.F.a(canvas, clamp);
                                    canvas.restore();
                                    return;
                                }
                                return;
                            }
                            return;
                        }
                    }
                }
                f7 = 1.0f;
                f10 = 0.0f;
                super.dispatchDraw(canvas);
                if (z11) {
                }
            } else {
                boolean z12 = false;
                z10 = z12;
                if (i10 == 1) {
                    sbVar.j();
                    z10 = z12;
                }
            }
        } else {
            z10 = false;
        }
        z11 = z10 ? 1 : 0;
        r11 = z10;
        taVar = sbVar.v1;
        if (taVar != null) {
        }
        f7 = 1.0f;
        f10 = 0.0f;
        super.dispatchDraw(canvas);
        if (z11) {
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEventPreIme(KeyEvent keyEvent) {
        if (keyEvent == null || keyEvent.getKeyCode() != 4 || keyEvent.getAction() != 1) {
            return super.dispatchKeyEventPreIme(keyEvent);
        }
        this.t0.L();
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        boolean z10 = false;
        this.n0 = false;
        sb sbVar = this.t0;
        y yVar = sbVar.I0;
        if (yVar != null && yVar.e) {
            float y3 = sbVar.I0.getY() + sbVar.i0.getY() + sbVar.r.getY();
            if ((motionEvent.getY() >= y3 && motionEvent.getY() <= y3 + sbVar.I0.getHeight()) || this.o0) {
                if (motionEvent.getAction() != 1 && motionEvent.getAction() != 3) {
                    z10 = true;
                }
                this.o0 = z10;
                return super.dispatchTouchEvent(motionEvent);
            }
            sbVar.I0.a(false, true);
            sbVar.l0(true);
        }
        if (this.o0 && (motionEvent.getAction() == 1 || motionEvent.getAction() == 3)) {
            this.o0 = false;
        }
        this.m0.onTouchEvent(motionEvent);
        this.l0.g0(motionEvent);
        if (motionEvent.getAction() == 1 && !this.n0) {
            if (sbVar.r.getTranslationY() <= 0.0f) {
                qa qaVar = sbVar.M0;
                if (qaVar != null && qaVar.getTranslationY() > 0.0f && !sbVar.L0) {
                    sbVar.e(!sbVar.Q1 && sbVar.M0.getTranslationY() < ((float) sbVar.M0.getPadding()));
                }
            } else if (sbVar.K > 0.4f) {
                sbVar.p(true);
            } else {
                sb.b(sbVar);
            }
            sbVar.L0 = false;
            sbVar.W = false;
            sbVar.X = false;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // org.telegram.ui.Components.ww0
    public int getBottomPadding() {
        int height = getHeight();
        sb sbVar = this.t0;
        return (height - sbVar.r.getBottom()) + sbVar.U;
    }

    public int getBottomPadding2() {
        return getHeight() - this.t0.r.getBottom();
    }

    public int getPaddingUnderContainer() {
        int height = getHeight();
        sb sbVar = this.t0;
        return (height - sbVar.b0) - sbVar.r.getBottom();
    }

    @Override // org.telegram.ui.Components.ww0, android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int i14;
        sz emojiView;
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        sb sbVar = this.t0;
        int i15 = sbVar.Z;
        int measuredHeight2 = sbVar.m0.getMeasuredHeight();
        if (sbVar.V) {
            i15 = 0;
        }
        int i16 = sbVar.S;
        int b10 = ee.b((measuredWidth - i16) / 2, sbVar.Y, (measuredWidth - sbVar.a0) - i16);
        int i17 = sbVar.S + b10;
        if (sbVar.V) {
            i14 = sbVar.T;
        } else {
            int i18 = sbVar.b0;
            int i19 = sbVar.T;
            int i20 = (((((measuredHeight - i15) - i18) - i19) - measuredHeight2) / 2) + i15;
            if (sbVar.J == 1) {
                float f7 = sbVar.H.top;
                if (i19 + f7 + measuredHeight2 < measuredHeight - i18) {
                    i15 = (int) f7;
                    i14 = sbVar.T;
                }
            }
            if (i20 - i15 >= AndroidUtilities.dp(40.0f)) {
                i15 = i20;
            }
            i14 = sbVar.T;
        }
        sbVar.r.layout(b10, i15, i17, i14 + i15 + measuredHeight2);
        sbVar.s.b.layout(0, 0, measuredWidth, measuredHeight);
        ab abVar = sbVar.C2;
        if (abVar != null) {
            abVar.layout(0, 0, measuredWidth, measuredHeight);
        }
        qa qaVar = sbVar.M0;
        if (qaVar != null) {
            qaVar.layout((measuredWidth - qaVar.getMeasuredWidth()) / 2, 0, (sbVar.M0.getMeasuredWidth() + measuredWidth) / 2, measuredHeight);
        }
        ib ibVar = sbVar.c1;
        if (ibVar != null && (emojiView = ibVar.f.getEmojiView()) != null) {
            emojiView.layout(sbVar.Y, (measuredHeight - sbVar.b0) - emojiView.getMeasuredHeight(), measuredWidth - sbVar.a0, measuredHeight - sbVar.b0);
        }
        ta taVar = sbVar.v1;
        if (taVar != null) {
            sz szVar = taVar.e2;
            if (szVar != null) {
                szVar.layout(sbVar.Y, (measuredHeight - sbVar.b0) - szVar.getMeasuredHeight(), measuredWidth - sbVar.a0, measuredHeight - sbVar.b0);
            }
            gl0 gl0Var = sbVar.v1.O1;
            if (gl0Var != null) {
                int i21 = sbVar.Y;
                gl0Var.layout(i21, sbVar.Z, gl0Var.getMeasuredWidth() + i21, sbVar.v1.O1.getMeasuredHeight() + sbVar.Z);
                bh.p pVar = sbVar.v1.O1.getReactionsWindow() != null ? sbVar.v1.O1.getReactionsWindow().c : null;
                if (pVar != null) {
                    int i22 = sbVar.Y;
                    pVar.layout(i22, sbVar.Z, pVar.getMeasuredWidth() + i22, pVar.getMeasuredHeight() + sbVar.Z);
                }
            }
        }
        cb cbVar = sbVar.r1;
        if (cbVar != null) {
            cbVar.e.setPadding(0, sbVar.Z, 0, sbVar.b0);
            sbVar.r1.layout(0, 0, measuredWidth, measuredHeight);
            sbVar.r1.d.layout(0, 0, measuredWidth, measuredHeight);
        }
        db dbVar = sbVar.s1;
        if (dbVar != null) {
            dbVar.f.setPadding(0, sbVar.Z, 0, sbVar.b0);
            sbVar.s1.layout(0, 0, measuredWidth, measuredHeight);
            sbVar.s1.e.layout(0, 0, measuredWidth, measuredHeight);
        }
        for (int i23 = 0; i23 < getChildCount(); i23++) {
            View childAt = getChildAt(i23);
            if (childAt instanceof t0) {
                childAt.layout(0, 0, measuredWidth, measuredHeight);
            } else if (childAt instanceof org.telegram.ui.Components.ib) {
                childAt.layout(0, i15, childAt.getMeasuredWidth(), childAt.getMeasuredHeight() + i15);
            }
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        int size = View.MeasureSpec.getSize(i10);
        int size2 = View.MeasureSpec.getSize(i11);
        sb sbVar = this.t0;
        int i12 = (size - sbVar.Y) - sbVar.a0;
        int i13 = sbVar.Z;
        int i14 = sbVar.b0;
        int ceil = (int) Math.ceil((i12 / 9.0f) * 16.0f);
        int dp = AndroidUtilities.dp(48.0f);
        sbVar.U = dp;
        int i15 = ceil + dp;
        int i16 = size2 - i14;
        if (i15 <= i16) {
            sbVar.S = i12;
            sbVar.T = ceil;
            sbVar.V = i15 > i16 - i13;
        } else {
            sbVar.V = false;
            sbVar.T = ((size2 - dp) - i14) - i13;
            sbVar.S = (int) Math.ceil((r9 * 9.0f) / 16.0f);
        }
        sbVar.U = Utilities.clamp((size2 - sbVar.T) - (sbVar.V ? 0 : i13), AndroidUtilities.dp(68.0f), AndroidUtilities.dp(48.0f));
        int systemUiVisibility = getSystemUiVisibility();
        setSystemUiVisibility(sbVar.V ? systemUiVisibility | 4 : systemUiVisibility & (-5));
        sbVar.r.measure(View.MeasureSpec.makeMeasureSpec(sbVar.S, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(sbVar.T + sbVar.U, TLObject.FLAG_30));
        sbVar.s.b.measure(View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(size2, TLObject.FLAG_30));
        ab abVar = sbVar.C2;
        if (abVar != null) {
            abVar.measure(View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(size2, TLObject.FLAG_30));
        }
        qa qaVar = sbVar.M0;
        if (qaVar != null) {
            qaVar.measure(View.MeasureSpec.makeMeasureSpec(sbVar.S, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(size2, TLObject.FLAG_30));
        }
        ib ibVar = sbVar.c1;
        if (ibVar != null) {
            sz emojiView = ibVar.f.getEmojiView();
            Q();
            AndroidUtilities.dp(20.0f);
            if (emojiView != null) {
                emojiView.measure(View.MeasureSpec.makeMeasureSpec(i12, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(emojiView.getLayoutParams().height, TLObject.FLAG_30));
            }
        }
        ta taVar = sbVar.v1;
        if (taVar != null) {
            sz szVar = taVar.e2;
            if (szVar != null) {
                szVar.measure(View.MeasureSpec.makeMeasureSpec(i12, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(sbVar.v1.e2.getLayoutParams().height, TLObject.FLAG_30));
            }
            gl0 gl0Var = sbVar.v1.O1;
            if (gl0Var != null) {
                measureChild(gl0Var, i10, i11);
                if (sbVar.v1.O1.getReactionsWindow() != null) {
                    measureChild(sbVar.v1.O1.getReactionsWindow().c, i10, i11);
                }
            }
        }
        for (int i17 = 0; i17 < getChildCount(); i17++) {
            View childAt = getChildAt(i17);
            if (childAt instanceof t0) {
                childAt.measure(View.MeasureSpec.makeMeasureSpec(i12, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(size2, TLObject.FLAG_30));
            } else if (childAt instanceof org.telegram.ui.Components.ib) {
                childAt.measure(View.MeasureSpec.makeMeasureSpec(i12, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(Math.min(AndroidUtilities.dp(340.0f), size2 - (sbVar.V ? 0 : i13)), TLObject.FLAG_30));
            }
        }
        cb cbVar = sbVar.r1;
        if (cbVar != null) {
            cbVar.measure(View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(size2, TLObject.FLAG_30));
            sbVar.r1.d.measure(View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(size2, TLObject.FLAG_30));
        }
        db dbVar = sbVar.s1;
        if (dbVar != null) {
            dbVar.measure(View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(size2, TLObject.FLAG_30));
            sbVar.s1.e.measure(View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(size2, TLObject.FLAG_30));
        }
        setMeasuredDimension(size, size2);
    }
}
