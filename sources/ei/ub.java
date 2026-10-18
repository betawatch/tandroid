package ei;

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
import org.telegram.ui.Components.cl0;
import org.telegram.ui.Components.jw0;
import org.telegram.ui.Components.tz;

/* compiled from: r8-map-id-bcc7d273da888d5c27994201329e5b838e55754b73312241608ee42846efd426 */
/* loaded from: classes4.dex */
public final class ub extends jw0 {
    public boolean A0;
    public float B0;
    public float C0;
    public float D0;
    public final /* synthetic */ vb E0;
    public final le.b w0;
    public final ScaleGestureDetector x0;
    public boolean y0;
    public boolean z0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ub(vb vbVar, Activity activity) {
        super(activity, null);
        this.E0 = vbVar;
        this.A0 = false;
        this.w0 = new le.b(activity, new sb(this));
        this.x0 = new ScaleGestureDetector(activity, new tb(this));
    }

    public final void Z(Bitmap bitmap, float f7) {
        Canvas canvas = new Canvas(bitmap);
        canvas.drawColor(-16777216);
        float width = bitmap.getWidth();
        vb vbVar = this.E0;
        float width2 = width / vbVar.n.getWidth();
        canvas.scale(width2, width2);
        TextureView textureView = vbVar.X0.getTextureView();
        if (textureView == null) {
            textureView = vbVar.X0.r;
        }
        if (textureView != null) {
            canvas.save();
            canvas.translate(vbVar.h0.getX() + vbVar.r.getX(), vbVar.h0.getY() + vbVar.r.getY());
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
        canvas.translate(vbVar.r.getX(), vbVar.r.getY());
        for (int i10 = 0; i10 < vbVar.r.getChildCount(); i10++) {
            View childAt = vbVar.r.getChildAt(i10);
            canvas.save();
            canvas.translate(childAt.getX(), childAt.getY());
            if (childAt.getVisibility() == 0) {
                if (childAt == vbVar.h0) {
                    for (int i11 = 0; i11 < vbVar.h0.getChildCount(); i11++) {
                        View childAt2 = vbVar.h0.getChildAt(i11);
                        if (childAt2 != vbVar.X0 && childAt2 != vbVar.B0 && childAt2.getVisibility() == 0) {
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
    @Override // org.telegram.ui.Components.jw0, android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void dispatchDraw(Canvas canvas) {
        boolean z10;
        boolean z11;
        ?? r11;
        xa xaVar;
        float f7;
        float f10;
        rg.a2 a2Var;
        vb vbVar = this.E0;
        RectF rectF = vbVar.H;
        Path path = vbVar.e0;
        RectF rectF2 = vbVar.d0;
        RectF rectF3 = vbVar.c0;
        Float f11 = vbVar.L;
        float floatValue = f11 != null ? f11.floatValue() : vbVar.K;
        if (vbVar.J == 0) {
            canvas.drawColor(i0.a.o(-16777216, (int) ((1.0f - floatValue) * vbVar.I * 255.0f)));
        }
        float lerp = AndroidUtilities.lerp(vbVar.G, 0.0f, vbVar.I);
        if (vbVar.I != 1.0f) {
            int i10 = vbVar.J;
            if (i10 == 0) {
                rectF2.set(0.0f, 0.0f, getWidth(), getHeight());
                rectF2.offset(vbVar.r.getTranslationX(), vbVar.r.getTranslationY());
                AndroidUtilities.lerp(rectF, rectF2, vbVar.I, rectF3);
                canvas.save();
                path.rewind();
                path.addRoundRect(rectF3, lerp, lerp, Path.Direction.CW);
                canvas.clipPath(path);
                r11 = 0;
                canvas.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), (int) (Utilities.clamp(vbVar.I * 3.0f, 1.0f, 0.0f) * 255.0f), 31);
                canvas.translate(rectF3.left, rectF3.top - (vbVar.r.getTranslationY() * vbVar.I));
                float max = Math.max(rectF3.width() / getWidth(), rectF3.height() / getHeight());
                canvas.scale(max, max);
                z11 = true;
                xaVar = vbVar.v1;
                if (xaVar != null) {
                    ub ubVar = xaVar.M1;
                    float[] fArr = xaVar.j2;
                    if (xaVar.d2) {
                        xaVar.d2 = r11;
                        if (xaVar.Z1 != null && (a2Var = xaVar.a2) != null) {
                            fArr[r11] = a2Var.getMeasuredWidth() / 2.0f;
                            fArr[1] = xaVar.a2.getMeasuredHeight() / 2.0f;
                            xaVar.a2.getMatrix().mapPoints(fArr);
                            f7 = 1.0f;
                            float scaleX = fArr[1] - (xaVar.a2.getScaleX() * (xaVar.a2.getMeasuredHeight() / 2.0f));
                            f10 = 0.0f;
                            float scaleX2 = (xaVar.a2.getScaleX() * (xaVar.a2.getMeasuredHeight() / 2.0f)) + fArr[1];
                            if (scaleX < AndroidUtilities.dp(120.0f) && scaleX2 > ubVar.getMeasuredHeight() - AndroidUtilities.dp(200.0f)) {
                                xaVar.Z1.setTop((boolean) r11);
                                xaVar.Z1.setTranslationY(AndroidUtilities.dp(16.0f) + (AndroidUtilities.dp(120.0f) - xaVar.Z1.getMeasuredHeight()));
                            } else if (scaleX < AndroidUtilities.dp(120.0f)) {
                                xaVar.Z1.setTop(true);
                                xaVar.Z1.setTranslationY((xaVar.a2.getScaleX() * (xaVar.a2.getMeasuredHeight() / 2.0f)) + fArr[1]);
                            } else {
                                xaVar.Z1.setTop((boolean) r11);
                                xaVar.Z1.setTranslationY((scaleX - r7.getMeasuredHeight()) + AndroidUtilities.dp(16.0f));
                            }
                            if (fArr[r11] < xaVar.getMeasuredWidth() / 2.0f) {
                                xaVar.Z1.setMirrorX(true);
                                float measuredWidth = ((xaVar.Z1.getMeasuredWidth() / 2.0f) + xaVar.Z1.getX()) - (fArr[r11] - (xaVar.a2.getMeasuredHeight() / 2.0f));
                                if (measuredWidth > 0.0f) {
                                    xaVar.Z1.setBubbleOffset(((r4.getMeasuredWidth() / 2.0f) - measuredWidth) / 2.0f);
                                }
                            } else {
                                float measuredWidth2 = ((xaVar.Z1.getMeasuredWidth() / 2.0f) + xaVar.Z1.getX()) - ((xaVar.a2.getMeasuredHeight() / 2.0f) + fArr[r11]);
                                if (measuredWidth2 < 0.0f) {
                                    xaVar.Z1.setBubbleOffset((-((r4.getMeasuredWidth() / 2.0f) + measuredWidth2)) / 2.0f);
                                }
                                xaVar.Z1.setMirrorX(r11);
                            }
                            xaVar.Z1.setTranslationX((ubVar.getMeasuredWidth() - xaVar.Z1.getMeasuredWidth()) / 2.0f);
                            super.dispatchDraw(canvas);
                            if (z11) {
                                canvas.restore();
                                canvas.restore();
                                if (vbVar.F != null) {
                                    float clamp = Utilities.clamp(f7 - (vbVar.I * 1.5f), f7, f10);
                                    rectF3.centerX();
                                    rectF3.centerY();
                                    Math.min(rectF3.width(), rectF3.height());
                                    qb qbVar = vbVar.F;
                                    ImageReceiver imageReceiver = qbVar.e;
                                    if (imageReceiver != null) {
                                        imageReceiver.setImageCoords(rectF3);
                                        int i11 = vbVar.F.e.getRoundRadius()[r11];
                                        vbVar.F.e.setRoundRadius((int) lerp);
                                        vbVar.F.e.setAlpha(clamp);
                                        vbVar.F.e.draw(canvas);
                                        vbVar.F.e.setRoundRadius(i11);
                                    } else {
                                        org.telegram.ui.Cells.d7 d7Var = qbVar.d;
                                        if (d7Var != null) {
                                            d7Var.setBounds((int) rectF3.left, (int) rectF3.top, (int) rectF3.right, (int) rectF3.bottom);
                                            org.telegram.ui.Cells.d7 d7Var2 = vbVar.F.d;
                                            d7Var2.d = (int) com.google.android.gms.internal.play_billing.k3.C(clamp, 255.0f, clamp, clamp);
                                            d7Var2.draw(canvas);
                                        }
                                    }
                                    vbVar.F.getClass();
                                    canvas.save();
                                    canvas.translate(rectF.left, rectF.top);
                                    vbVar.F.a(canvas, clamp);
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
                    vbVar.j();
                    z10 = z12;
                }
            }
        } else {
            z10 = false;
        }
        z11 = z10 ? 1 : 0;
        r11 = z10;
        xaVar = vbVar.v1;
        if (xaVar != null) {
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
        this.E0.L();
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        boolean z10 = false;
        this.y0 = false;
        vb vbVar = this.E0;
        y yVar = vbVar.I0;
        if (yVar != null && yVar.e) {
            float y3 = vbVar.I0.getY() + vbVar.i0.getY() + vbVar.r.getY();
            if ((motionEvent.getY() >= y3 && motionEvent.getY() <= y3 + vbVar.I0.getHeight()) || this.z0) {
                if (motionEvent.getAction() != 1 && motionEvent.getAction() != 3) {
                    z10 = true;
                }
                this.z0 = z10;
                return super.dispatchTouchEvent(motionEvent);
            }
            vbVar.I0.a(false, true);
            vbVar.l0(true);
        }
        if (this.z0 && (motionEvent.getAction() == 1 || motionEvent.getAction() == 3)) {
            this.z0 = false;
        }
        this.x0.onTouchEvent(motionEvent);
        this.w0.j0(motionEvent);
        if (motionEvent.getAction() == 1 && !this.y0) {
            if (vbVar.r.getTranslationY() <= 0.0f) {
                ua uaVar = vbVar.M0;
                if (uaVar != null && uaVar.getTranslationY() > 0.0f && !vbVar.L0) {
                    vbVar.e(!vbVar.Q1 && vbVar.M0.getTranslationY() < ((float) vbVar.M0.getPadding()));
                }
            } else if (vbVar.K > 0.4f) {
                vbVar.p(true);
            } else {
                vb.b(vbVar);
            }
            vbVar.L0 = false;
            vbVar.W = false;
            vbVar.X = false;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // org.telegram.ui.Components.jw0
    public int getBottomPadding() {
        int height = getHeight();
        vb vbVar = this.E0;
        return (height - vbVar.r.getBottom()) + vbVar.U;
    }

    public int getBottomPadding2() {
        return getHeight() - this.E0.r.getBottom();
    }

    @Override // org.telegram.ui.Components.jw0
    public /* bridge */ /* synthetic */ int[] getColorKeys() {
        return null;
    }

    public int getPaddingUnderContainer() {
        int height = getHeight();
        vb vbVar = this.E0;
        return (height - vbVar.b0) - vbVar.r.getBottom();
    }

    @Override // org.telegram.ui.Components.jw0, android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int i14;
        tz emojiView;
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        vb vbVar = this.E0;
        int i15 = vbVar.Z;
        int measuredHeight2 = vbVar.m0.getMeasuredHeight();
        if (vbVar.V) {
            i15 = 0;
        }
        int i16 = vbVar.S;
        int b10 = w7.r.b((measuredWidth - i16) / 2, vbVar.Y, (measuredWidth - vbVar.a0) - i16);
        int i17 = vbVar.S + b10;
        if (vbVar.V) {
            i14 = vbVar.T;
        } else {
            int i18 = vbVar.b0;
            int i19 = vbVar.T;
            int i20 = (((((measuredHeight - i15) - i18) - i19) - measuredHeight2) / 2) + i15;
            if (vbVar.J == 1) {
                float f7 = vbVar.H.top;
                if (i19 + f7 + measuredHeight2 < measuredHeight - i18) {
                    i15 = (int) f7;
                    i14 = vbVar.T;
                }
            }
            if (i20 - i15 >= AndroidUtilities.dp(40.0f)) {
                i15 = i20;
            }
            i14 = vbVar.T;
        }
        vbVar.r.layout(b10, i15, i17, i14 + i15 + measuredHeight2);
        vbVar.s.b.layout(0, 0, measuredWidth, measuredHeight);
        db dbVar = vbVar.C2;
        if (dbVar != null) {
            dbVar.layout(0, 0, measuredWidth, measuredHeight);
        }
        ua uaVar = vbVar.M0;
        if (uaVar != null) {
            uaVar.layout((measuredWidth - uaVar.getMeasuredWidth()) / 2, 0, (vbVar.M0.getMeasuredWidth() + measuredWidth) / 2, measuredHeight);
        }
        lb lbVar = vbVar.c1;
        if (lbVar != null && (emojiView = lbVar.f.getEmojiView()) != null) {
            emojiView.layout(vbVar.Y, (measuredHeight - vbVar.b0) - emojiView.getMeasuredHeight(), measuredWidth - vbVar.a0, measuredHeight - vbVar.b0);
        }
        xa xaVar = vbVar.v1;
        if (xaVar != null) {
            tz tzVar = xaVar.p2;
            if (tzVar != null) {
                tzVar.layout(vbVar.Y, (measuredHeight - vbVar.b0) - tzVar.getMeasuredHeight(), measuredWidth - vbVar.a0, measuredHeight - vbVar.b0);
            }
            cl0 cl0Var = vbVar.v1.Z1;
            if (cl0Var != null) {
                int i21 = vbVar.Y;
                cl0Var.layout(i21, vbVar.Z, cl0Var.getMeasuredWidth() + i21, vbVar.v1.Z1.getMeasuredHeight() + vbVar.Z);
                ah.v vVar = vbVar.v1.Z1.getReactionsWindow() != null ? vbVar.v1.Z1.getReactionsWindow().c : null;
                if (vVar != null) {
                    int i22 = vbVar.Y;
                    vVar.layout(i22, vbVar.Z, vVar.getMeasuredWidth() + i22, vVar.getMeasuredHeight() + vbVar.Z);
                }
            }
        }
        fb fbVar = vbVar.r1;
        if (fbVar != null) {
            fbVar.e.setPadding(0, vbVar.Z, 0, vbVar.b0);
            vbVar.r1.layout(0, 0, measuredWidth, measuredHeight);
            vbVar.r1.d.layout(0, 0, measuredWidth, measuredHeight);
        }
        gb gbVar = vbVar.s1;
        if (gbVar != null) {
            gbVar.f.setPadding(0, vbVar.Z, 0, vbVar.b0);
            vbVar.s1.layout(0, 0, measuredWidth, measuredHeight);
            vbVar.s1.e.layout(0, 0, measuredWidth, measuredHeight);
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
        vb vbVar = this.E0;
        int i12 = (size - vbVar.Y) - vbVar.a0;
        int i13 = vbVar.Z;
        int i14 = vbVar.b0;
        int ceil = (int) Math.ceil((i12 / 9.0f) * 16.0f);
        int dp = AndroidUtilities.dp(48.0f);
        vbVar.U = dp;
        int i15 = ceil + dp;
        int i16 = size2 - i14;
        if (i15 <= i16) {
            vbVar.S = i12;
            vbVar.T = ceil;
            vbVar.V = i15 > i16 - i13;
        } else {
            vbVar.V = false;
            vbVar.T = ((size2 - dp) - i14) - i13;
            vbVar.S = (int) Math.ceil((r9 * 9.0f) / 16.0f);
        }
        vbVar.U = Utilities.clamp((size2 - vbVar.T) - (vbVar.V ? 0 : i13), AndroidUtilities.dp(68.0f), AndroidUtilities.dp(48.0f));
        int systemUiVisibility = getSystemUiVisibility();
        setSystemUiVisibility(vbVar.V ? systemUiVisibility | 4 : systemUiVisibility & (-5));
        vbVar.r.measure(View.MeasureSpec.makeMeasureSpec(vbVar.S, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(vbVar.T + vbVar.U, TLObject.FLAG_30));
        vbVar.s.b.measure(View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(size2, TLObject.FLAG_30));
        db dbVar = vbVar.C2;
        if (dbVar != null) {
            dbVar.measure(View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(size2, TLObject.FLAG_30));
        }
        ua uaVar = vbVar.M0;
        if (uaVar != null) {
            uaVar.measure(View.MeasureSpec.makeMeasureSpec(vbVar.S, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(size2, TLObject.FLAG_30));
        }
        lb lbVar = vbVar.c1;
        if (lbVar != null) {
            tz emojiView = lbVar.f.getEmojiView();
            R();
            AndroidUtilities.dp(20.0f);
            if (emojiView != null) {
                emojiView.measure(View.MeasureSpec.makeMeasureSpec(i12, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(emojiView.getLayoutParams().height, TLObject.FLAG_30));
            }
        }
        xa xaVar = vbVar.v1;
        if (xaVar != null) {
            tz tzVar = xaVar.p2;
            if (tzVar != null) {
                tzVar.measure(View.MeasureSpec.makeMeasureSpec(i12, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(vbVar.v1.p2.getLayoutParams().height, TLObject.FLAG_30));
            }
            cl0 cl0Var = vbVar.v1.Z1;
            if (cl0Var != null) {
                measureChild(cl0Var, i10, i11);
                if (vbVar.v1.Z1.getReactionsWindow() != null) {
                    measureChild(vbVar.v1.Z1.getReactionsWindow().c, i10, i11);
                }
            }
        }
        for (int i17 = 0; i17 < getChildCount(); i17++) {
            View childAt = getChildAt(i17);
            if (childAt instanceof t0) {
                childAt.measure(View.MeasureSpec.makeMeasureSpec(i12, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(size2, TLObject.FLAG_30));
            } else if (childAt instanceof org.telegram.ui.Components.ib) {
                childAt.measure(View.MeasureSpec.makeMeasureSpec(i12, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(Math.min(AndroidUtilities.dp(340.0f), size2 - (vbVar.V ? 0 : i13)), TLObject.FLAG_30));
            }
        }
        fb fbVar = vbVar.r1;
        if (fbVar != null) {
            fbVar.measure(View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(size2, TLObject.FLAG_30));
            vbVar.r1.d.measure(View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(size2, TLObject.FLAG_30));
        }
        gb gbVar = vbVar.s1;
        if (gbVar != null) {
            gbVar.measure(View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(size2, TLObject.FLAG_30));
            vbVar.s1.e.measure(View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(size2, TLObject.FLAG_30));
        }
        setMeasuredDimension(size, size2);
    }
}
