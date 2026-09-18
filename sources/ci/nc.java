package ci;

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
import org.telegram.ui.Components.gk0;
import org.telegram.ui.Components.kz;
import org.telegram.ui.Components.qv0;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes4.dex */
public final class nc extends qv0 {
    public boolean A0;
    public float B0;
    public float C0;
    public float D0;
    public final /* synthetic */ oc E0;
    public final org.telegram.ui.Cells.ia w0;
    public final ScaleGestureDetector x0;
    public boolean y0;
    public boolean z0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nc(oc ocVar, Activity activity) {
        super(activity, null);
        this.E0 = ocVar;
        this.A0 = false;
        this.w0 = new org.telegram.ui.Cells.ia(activity, new lc(this));
        this.x0 = new ScaleGestureDetector(activity, new mc(this));
    }

    public final void Z(Bitmap bitmap, float f7) {
        Canvas canvas = new Canvas(bitmap);
        canvas.drawColor(-16777216);
        float width = bitmap.getWidth();
        oc ocVar = this.E0;
        float width2 = width / ocVar.n.getWidth();
        canvas.scale(width2, width2);
        TextureView textureView = ocVar.X0.getTextureView();
        if (textureView == null) {
            textureView = ocVar.X0.r;
        }
        if (textureView != null) {
            canvas.save();
            canvas.translate(ocVar.h0.getX() + ocVar.r.getX(), ocVar.h0.getY() + ocVar.r.getY());
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
        canvas.translate(ocVar.r.getX(), ocVar.r.getY());
        for (int i10 = 0; i10 < ocVar.r.getChildCount(); i10++) {
            View childAt = ocVar.r.getChildAt(i10);
            canvas.save();
            canvas.translate(childAt.getX(), childAt.getY());
            if (childAt.getVisibility() == 0) {
                if (childAt == ocVar.h0) {
                    for (int i11 = 0; i11 < ocVar.h0.getChildCount(); i11++) {
                        View childAt2 = ocVar.h0.getChildAt(i11);
                        if (childAt2 != ocVar.X0 && childAt2 != ocVar.B0 && childAt2.getVisibility() == 0) {
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
    @Override // org.telegram.ui.Components.qv0, android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void dispatchDraw(Canvas canvas) {
        boolean z10;
        boolean z11;
        ?? r11;
        qb qbVar;
        float f7;
        qg.d2 d2Var;
        oc ocVar = this.E0;
        RectF rectF = ocVar.H;
        Path path = ocVar.e0;
        RectF rectF2 = ocVar.d0;
        RectF rectF3 = ocVar.c0;
        Float f10 = ocVar.L;
        float floatValue = f10 != null ? f10.floatValue() : ocVar.K;
        if (ocVar.J == 0) {
            canvas.drawColor(i0.a.k(-16777216, (int) ((1.0f - floatValue) * ocVar.I * 255.0f)));
        }
        float lerp = AndroidUtilities.lerp(ocVar.G, 0.0f, ocVar.I);
        if (ocVar.I != 1.0f) {
            int i10 = ocVar.J;
            if (i10 == 0) {
                rectF2.set(0.0f, 0.0f, getWidth(), getHeight());
                rectF2.offset(ocVar.r.getTranslationX(), ocVar.r.getTranslationY());
                AndroidUtilities.lerp(rectF, rectF2, ocVar.I, rectF3);
                canvas.save();
                path.rewind();
                path.addRoundRect(rectF3, lerp, lerp, Path.Direction.CW);
                canvas.clipPath(path);
                r11 = 0;
                canvas.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), (int) (Utilities.clamp(ocVar.I * 3.0f, 1.0f, 0.0f) * 255.0f), 31);
                canvas.translate(rectF3.left, rectF3.top - (ocVar.r.getTranslationY() * ocVar.I));
                float max = Math.max(rectF3.width() / getWidth(), rectF3.height() / getHeight());
                canvas.scale(max, max);
                z11 = true;
                qbVar = ocVar.v1;
                if (qbVar != null) {
                    nc ncVar = qbVar.M1;
                    float[] fArr = qbVar.j2;
                    if (qbVar.d2) {
                        qbVar.d2 = r11;
                        if (qbVar.Z1 != null && (d2Var = qbVar.a2) != null) {
                            fArr[r11] = d2Var.getMeasuredWidth() / 2.0f;
                            fArr[1] = qbVar.a2.getMeasuredHeight() / 2.0f;
                            qbVar.a2.getMatrix().mapPoints(fArr);
                            f7 = 1.0f;
                            float scaleX = fArr[1] - (qbVar.a2.getScaleX() * (qbVar.a2.getMeasuredHeight() / 2.0f));
                            float scaleX2 = (qbVar.a2.getScaleX() * (qbVar.a2.getMeasuredHeight() / 2.0f)) + fArr[1];
                            if (scaleX < AndroidUtilities.dp(120.0f) && scaleX2 > ncVar.getMeasuredHeight() - AndroidUtilities.dp(200.0f)) {
                                qbVar.Z1.setTop((boolean) r11);
                                qbVar.Z1.setTranslationY(AndroidUtilities.dp(16.0f) + (AndroidUtilities.dp(120.0f) - qbVar.Z1.getMeasuredHeight()));
                            } else if (scaleX < AndroidUtilities.dp(120.0f)) {
                                qbVar.Z1.setTop(true);
                                qbVar.Z1.setTranslationY((qbVar.a2.getScaleX() * (qbVar.a2.getMeasuredHeight() / 2.0f)) + fArr[1]);
                            } else {
                                qbVar.Z1.setTop((boolean) r11);
                                qbVar.Z1.setTranslationY((scaleX - r7.getMeasuredHeight()) + AndroidUtilities.dp(16.0f));
                            }
                            if (fArr[r11] < qbVar.getMeasuredWidth() / 2.0f) {
                                qbVar.Z1.setMirrorX(true);
                                float measuredWidth = ((qbVar.Z1.getMeasuredWidth() / 2.0f) + qbVar.Z1.getX()) - (fArr[r11] - (qbVar.a2.getMeasuredHeight() / 2.0f));
                                if (measuredWidth > 0.0f) {
                                    qbVar.Z1.setBubbleOffset(((r4.getMeasuredWidth() / 2.0f) - measuredWidth) / 2.0f);
                                }
                            } else {
                                float measuredWidth2 = ((qbVar.Z1.getMeasuredWidth() / 2.0f) + qbVar.Z1.getX()) - ((qbVar.a2.getMeasuredHeight() / 2.0f) + fArr[r11]);
                                if (measuredWidth2 < 0.0f) {
                                    qbVar.Z1.setBubbleOffset((-((r4.getMeasuredWidth() / 2.0f) + measuredWidth2)) / 2.0f);
                                }
                                qbVar.Z1.setMirrorX(r11);
                            }
                            qbVar.Z1.setTranslationX((ncVar.getMeasuredWidth() - qbVar.Z1.getMeasuredWidth()) / 2.0f);
                            super.dispatchDraw(canvas);
                            if (z11) {
                                canvas.restore();
                                canvas.restore();
                                if (ocVar.F != null) {
                                    float clamp = Utilities.clamp(f7 - (ocVar.I * 1.5f), 1.0f, 0.0f);
                                    rectF3.centerX();
                                    rectF3.centerY();
                                    Math.min(rectF3.width(), rectF3.height());
                                    jc jcVar = ocVar.F;
                                    ImageReceiver imageReceiver = jcVar.e;
                                    if (imageReceiver != null) {
                                        imageReceiver.setImageCoords(rectF3);
                                        int i11 = ocVar.F.e.getRoundRadius()[r11];
                                        ocVar.F.e.setRoundRadius((int) lerp);
                                        ocVar.F.e.setAlpha(clamp);
                                        ocVar.F.e.draw(canvas);
                                        ocVar.F.e.setRoundRadius(i11);
                                    } else {
                                        org.telegram.ui.Cells.e7 e7Var = jcVar.d;
                                        if (e7Var != null) {
                                            e7Var.setBounds((int) rectF3.left, (int) rectF3.top, (int) rectF3.right, (int) rectF3.bottom);
                                            org.telegram.ui.Cells.e7 e7Var2 = ocVar.F.d;
                                            e7Var2.d = (int) com.google.android.gms.internal.vision.e2.C(clamp, 255.0f, clamp, clamp);
                                            e7Var2.draw(canvas);
                                        }
                                    }
                                    ocVar.F.getClass();
                                    canvas.save();
                                    canvas.translate(rectF.left, rectF.top);
                                    ocVar.F.a(canvas, clamp);
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
                super.dispatchDraw(canvas);
                if (z11) {
                }
            } else {
                z10 = false;
                z10 = false;
                if (i10 == 1) {
                    ocVar.k();
                }
            }
        } else {
            z10 = false;
        }
        z11 = false;
        r11 = z10;
        qbVar = ocVar.v1;
        if (qbVar != null) {
        }
        f7 = 1.0f;
        super.dispatchDraw(canvas);
        if (z11) {
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEventPreIme(KeyEvent keyEvent) {
        if (keyEvent == null || keyEvent.getKeyCode() != 4 || keyEvent.getAction() != 1) {
            return super.dispatchKeyEventPreIme(keyEvent);
        }
        this.E0.M();
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        boolean z10 = false;
        this.y0 = false;
        oc ocVar = this.E0;
        y yVar = ocVar.I0;
        if (yVar != null && yVar.e) {
            float y3 = ocVar.I0.getY() + ocVar.i0.getY() + ocVar.r.getY();
            if ((motionEvent.getY() >= y3 && motionEvent.getY() <= y3 + ocVar.I0.getHeight()) || this.z0) {
                if (motionEvent.getAction() != 1 && motionEvent.getAction() != 3) {
                    z10 = true;
                }
                this.z0 = z10;
                return super.dispatchTouchEvent(motionEvent);
            }
            ocVar.I0.a(false, true);
            ocVar.m0(true);
        }
        if (this.z0 && (motionEvent.getAction() == 1 || motionEvent.getAction() == 3)) {
            this.z0 = false;
        }
        this.x0.onTouchEvent(motionEvent);
        this.w0.y(motionEvent);
        if (motionEvent.getAction() == 1 && !this.y0) {
            if (ocVar.r.getTranslationY() <= 0.0f) {
                nb nbVar = ocVar.M0;
                if (nbVar != null && nbVar.getTranslationY() > 0.0f && !ocVar.L0) {
                    ocVar.f(!ocVar.Q1 && ocVar.M0.getTranslationY() < ((float) ocVar.M0.getPadding()));
                }
            } else if (ocVar.K > 0.4f) {
                ocVar.q(true);
            } else {
                oc.c(ocVar);
            }
            ocVar.L0 = false;
            ocVar.W = false;
            ocVar.X = false;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // org.telegram.ui.Components.qv0
    public int getBottomPadding() {
        int height = getHeight();
        oc ocVar = this.E0;
        return (height - ocVar.r.getBottom()) + ocVar.U;
    }

    public int getBottomPadding2() {
        return getHeight() - this.E0.r.getBottom();
    }

    @Override // org.telegram.ui.Components.qv0
    public /* bridge */ /* synthetic */ int[] getColorKeys() {
        return null;
    }

    public int getPaddingUnderContainer() {
        int height = getHeight();
        oc ocVar = this.E0;
        return (height - ocVar.b0) - ocVar.r.getBottom();
    }

    @Override // org.telegram.ui.Components.qv0, android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int i14;
        kz emojiView;
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        oc ocVar = this.E0;
        int i15 = ocVar.Z;
        int measuredHeight2 = ocVar.m0.getMeasuredHeight();
        if (ocVar.V) {
            i15 = 0;
        }
        int i16 = ocVar.S;
        int b10 = w7.p.b((measuredWidth - i16) / 2, ocVar.Y, (measuredWidth - ocVar.a0) - i16);
        int i17 = ocVar.S + b10;
        if (ocVar.V) {
            i14 = ocVar.T;
        } else {
            int i18 = ocVar.b0;
            int i19 = ocVar.T;
            int i20 = (((((measuredHeight - i15) - i18) - i19) - measuredHeight2) / 2) + i15;
            if (ocVar.J == 1) {
                float f7 = ocVar.H.top;
                if (i19 + f7 + measuredHeight2 < measuredHeight - i18) {
                    i15 = (int) f7;
                    i14 = ocVar.T;
                }
            }
            if (i20 - i15 >= AndroidUtilities.dp(40.0f)) {
                i15 = i20;
            }
            i14 = ocVar.T;
        }
        ocVar.r.layout(b10, i15, i17, i14 + i15 + measuredHeight2);
        ocVar.s.b.layout(0, 0, measuredWidth, measuredHeight);
        wb wbVar = ocVar.C2;
        if (wbVar != null) {
            wbVar.layout(0, 0, measuredWidth, measuredHeight);
        }
        nb nbVar = ocVar.M0;
        if (nbVar != null) {
            nbVar.layout((measuredWidth - nbVar.getMeasuredWidth()) / 2, 0, (ocVar.M0.getMeasuredWidth() + measuredWidth) / 2, measuredHeight);
        }
        ec ecVar = ocVar.c1;
        if (ecVar != null && (emojiView = ecVar.f.getEmojiView()) != null) {
            emojiView.layout(ocVar.Y, (measuredHeight - ocVar.b0) - emojiView.getMeasuredHeight(), measuredWidth - ocVar.a0, measuredHeight - ocVar.b0);
        }
        qb qbVar = ocVar.v1;
        if (qbVar != null) {
            kz kzVar = qbVar.p2;
            if (kzVar != null) {
                kzVar.layout(ocVar.Y, (measuredHeight - ocVar.b0) - kzVar.getMeasuredHeight(), measuredWidth - ocVar.a0, measuredHeight - ocVar.b0);
            }
            gk0 gk0Var = ocVar.v1.Z1;
            if (gk0Var != null) {
                int i21 = ocVar.Y;
                gk0Var.layout(i21, ocVar.Z, gk0Var.getMeasuredWidth() + i21, ocVar.v1.Z1.getMeasuredHeight() + ocVar.Z);
                yh.w3 w3Var = ocVar.v1.Z1.getReactionsWindow() != null ? ocVar.v1.Z1.getReactionsWindow().c : null;
                if (w3Var != null) {
                    int i22 = ocVar.Y;
                    w3Var.layout(i22, ocVar.Z, w3Var.getMeasuredWidth() + i22, w3Var.getMeasuredHeight() + ocVar.Z);
                }
            }
        }
        yb ybVar = ocVar.r1;
        if (ybVar != null) {
            ybVar.e.setPadding(0, ocVar.Z, 0, ocVar.b0);
            ocVar.r1.layout(0, 0, measuredWidth, measuredHeight);
            ocVar.r1.d.layout(0, 0, measuredWidth, measuredHeight);
        }
        zb zbVar = ocVar.s1;
        if (zbVar != null) {
            zbVar.f.setPadding(0, ocVar.Z, 0, ocVar.b0);
            ocVar.s1.layout(0, 0, measuredWidth, measuredHeight);
            ocVar.s1.e.layout(0, 0, measuredWidth, measuredHeight);
        }
        for (int i23 = 0; i23 < getChildCount(); i23++) {
            View childAt = getChildAt(i23);
            if (childAt instanceof t0) {
                childAt.layout(0, 0, measuredWidth, measuredHeight);
            } else if (childAt instanceof org.telegram.ui.Components.gb) {
                childAt.layout(0, i15, childAt.getMeasuredWidth(), childAt.getMeasuredHeight() + i15);
            }
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        int size = View.MeasureSpec.getSize(i10);
        int size2 = View.MeasureSpec.getSize(i11);
        oc ocVar = this.E0;
        int i12 = (size - ocVar.Y) - ocVar.a0;
        int i13 = ocVar.Z;
        int i14 = ocVar.b0;
        int ceil = (int) Math.ceil((i12 / 9.0f) * 16.0f);
        int dp = AndroidUtilities.dp(48.0f);
        ocVar.U = dp;
        int i15 = ceil + dp;
        int i16 = size2 - i14;
        if (i15 <= i16) {
            ocVar.S = i12;
            ocVar.T = ceil;
            ocVar.V = i15 > i16 - i13;
        } else {
            ocVar.V = false;
            ocVar.T = ((size2 - dp) - i14) - i13;
            ocVar.S = (int) Math.ceil((r9 * 9.0f) / 16.0f);
        }
        ocVar.U = Utilities.clamp((size2 - ocVar.T) - (ocVar.V ? 0 : i13), AndroidUtilities.dp(68.0f), AndroidUtilities.dp(48.0f));
        int systemUiVisibility = getSystemUiVisibility();
        setSystemUiVisibility(ocVar.V ? systemUiVisibility | 4 : systemUiVisibility & (-5));
        ocVar.r.measure(View.MeasureSpec.makeMeasureSpec(ocVar.S, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(ocVar.T + ocVar.U, TLObject.FLAG_30));
        ocVar.s.b.measure(View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(size2, TLObject.FLAG_30));
        wb wbVar = ocVar.C2;
        if (wbVar != null) {
            wbVar.measure(View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(size2, TLObject.FLAG_30));
        }
        nb nbVar = ocVar.M0;
        if (nbVar != null) {
            nbVar.measure(View.MeasureSpec.makeMeasureSpec(ocVar.S, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(size2, TLObject.FLAG_30));
        }
        ec ecVar = ocVar.c1;
        if (ecVar != null) {
            kz emojiView = ecVar.f.getEmojiView();
            R();
            AndroidUtilities.dp(20.0f);
            if (emojiView != null) {
                emojiView.measure(View.MeasureSpec.makeMeasureSpec(i12, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(emojiView.getLayoutParams().height, TLObject.FLAG_30));
            }
        }
        qb qbVar = ocVar.v1;
        if (qbVar != null) {
            kz kzVar = qbVar.p2;
            if (kzVar != null) {
                kzVar.measure(View.MeasureSpec.makeMeasureSpec(i12, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(ocVar.v1.p2.getLayoutParams().height, TLObject.FLAG_30));
            }
            gk0 gk0Var = ocVar.v1.Z1;
            if (gk0Var != null) {
                measureChild(gk0Var, i10, i11);
                if (ocVar.v1.Z1.getReactionsWindow() != null) {
                    measureChild(ocVar.v1.Z1.getReactionsWindow().c, i10, i11);
                }
            }
        }
        for (int i17 = 0; i17 < getChildCount(); i17++) {
            View childAt = getChildAt(i17);
            if (childAt instanceof t0) {
                childAt.measure(View.MeasureSpec.makeMeasureSpec(i12, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(size2, TLObject.FLAG_30));
            } else if (childAt instanceof org.telegram.ui.Components.gb) {
                childAt.measure(View.MeasureSpec.makeMeasureSpec(i12, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(Math.min(AndroidUtilities.dp(340.0f), size2 - (ocVar.V ? 0 : i13)), TLObject.FLAG_30));
            }
        }
        yb ybVar = ocVar.r1;
        if (ybVar != null) {
            ybVar.measure(View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(size2, TLObject.FLAG_30));
            ocVar.r1.d.measure(View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(size2, TLObject.FLAG_30));
        }
        zb zbVar = ocVar.s1;
        if (zbVar != null) {
            zbVar.measure(View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(size2, TLObject.FLAG_30));
            ocVar.s1.e.measure(View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(size2, TLObject.FLAG_30));
        }
        setMeasuredDimension(size, size2);
    }
}
