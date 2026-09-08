package di;

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
import org.telegram.ui.Components.fk0;
import org.telegram.ui.Components.kz;
import org.telegram.ui.Components.ov0;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes4.dex */
public final class oc extends ov0 {
    public boolean A0;
    public float B0;
    public float C0;
    public float D0;
    public final /* synthetic */ pc E0;
    public final mg.n w0;
    public final ScaleGestureDetector x0;
    public boolean y0;
    public boolean z0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oc(pc pcVar, Activity activity) {
        super(activity, null);
        this.E0 = pcVar;
        this.A0 = false;
        this.w0 = new mg.n(activity, new mc(this));
        this.x0 = new ScaleGestureDetector(activity, new nc(this));
    }

    public final void Z(Bitmap bitmap, float f7) {
        Canvas canvas = new Canvas(bitmap);
        canvas.drawColor(-16777216);
        float width = bitmap.getWidth();
        pc pcVar = this.E0;
        float width2 = width / pcVar.n.getWidth();
        canvas.scale(width2, width2);
        TextureView textureView = pcVar.X0.getTextureView();
        if (textureView == null) {
            textureView = pcVar.X0.r;
        }
        if (textureView != null) {
            canvas.save();
            canvas.translate(pcVar.h0.getX() + pcVar.r.getX(), pcVar.h0.getY() + pcVar.r.getY());
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
        canvas.translate(pcVar.r.getX(), pcVar.r.getY());
        for (int i10 = 0; i10 < pcVar.r.getChildCount(); i10++) {
            View childAt = pcVar.r.getChildAt(i10);
            canvas.save();
            canvas.translate(childAt.getX(), childAt.getY());
            if (childAt.getVisibility() == 0) {
                if (childAt == pcVar.h0) {
                    for (int i11 = 0; i11 < pcVar.h0.getChildCount(); i11++) {
                        View childAt2 = pcVar.h0.getChildAt(i11);
                        if (childAt2 != pcVar.X0 && childAt2 != pcVar.B0 && childAt2.getVisibility() == 0) {
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
    @Override // org.telegram.ui.Components.ov0, android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void dispatchDraw(Canvas canvas) {
        boolean z10;
        boolean z11;
        ?? r11;
        rb rbVar;
        float f7;
        rg.c2 c2Var;
        pc pcVar = this.E0;
        RectF rectF = pcVar.H;
        Path path = pcVar.e0;
        RectF rectF2 = pcVar.d0;
        RectF rectF3 = pcVar.c0;
        Float f10 = pcVar.L;
        float floatValue = f10 != null ? f10.floatValue() : pcVar.K;
        if (pcVar.J == 0) {
            canvas.drawColor(i0.a.k(-16777216, (int) ((1.0f - floatValue) * pcVar.I * 255.0f)));
        }
        float lerp = AndroidUtilities.lerp(pcVar.G, 0.0f, pcVar.I);
        if (pcVar.I != 1.0f) {
            int i10 = pcVar.J;
            if (i10 == 0) {
                rectF2.set(0.0f, 0.0f, getWidth(), getHeight());
                rectF2.offset(pcVar.r.getTranslationX(), pcVar.r.getTranslationY());
                AndroidUtilities.lerp(rectF, rectF2, pcVar.I, rectF3);
                canvas.save();
                path.rewind();
                path.addRoundRect(rectF3, lerp, lerp, Path.Direction.CW);
                canvas.clipPath(path);
                r11 = 0;
                canvas.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), (int) (Utilities.clamp(pcVar.I * 3.0f, 1.0f, 0.0f) * 255.0f), 31);
                canvas.translate(rectF3.left, rectF3.top - (pcVar.r.getTranslationY() * pcVar.I));
                float max = Math.max(rectF3.width() / getWidth(), rectF3.height() / getHeight());
                canvas.scale(max, max);
                z11 = true;
                rbVar = pcVar.v1;
                if (rbVar != null) {
                    oc ocVar = rbVar.M1;
                    float[] fArr = rbVar.j2;
                    if (rbVar.d2) {
                        rbVar.d2 = r11;
                        if (rbVar.Z1 != null && (c2Var = rbVar.a2) != null) {
                            fArr[r11] = c2Var.getMeasuredWidth() / 2.0f;
                            fArr[1] = rbVar.a2.getMeasuredHeight() / 2.0f;
                            rbVar.a2.getMatrix().mapPoints(fArr);
                            f7 = 1.0f;
                            float scaleX = fArr[1] - (rbVar.a2.getScaleX() * (rbVar.a2.getMeasuredHeight() / 2.0f));
                            float scaleX2 = (rbVar.a2.getScaleX() * (rbVar.a2.getMeasuredHeight() / 2.0f)) + fArr[1];
                            if (scaleX < AndroidUtilities.dp(120.0f) && scaleX2 > ocVar.getMeasuredHeight() - AndroidUtilities.dp(200.0f)) {
                                rbVar.Z1.setTop((boolean) r11);
                                rbVar.Z1.setTranslationY(AndroidUtilities.dp(16.0f) + (AndroidUtilities.dp(120.0f) - rbVar.Z1.getMeasuredHeight()));
                            } else if (scaleX < AndroidUtilities.dp(120.0f)) {
                                rbVar.Z1.setTop(true);
                                rbVar.Z1.setTranslationY((rbVar.a2.getScaleX() * (rbVar.a2.getMeasuredHeight() / 2.0f)) + fArr[1]);
                            } else {
                                rbVar.Z1.setTop((boolean) r11);
                                rbVar.Z1.setTranslationY((scaleX - r7.getMeasuredHeight()) + AndroidUtilities.dp(16.0f));
                            }
                            if (fArr[r11] < rbVar.getMeasuredWidth() / 2.0f) {
                                rbVar.Z1.setMirrorX(true);
                                float measuredWidth = ((rbVar.Z1.getMeasuredWidth() / 2.0f) + rbVar.Z1.getX()) - (fArr[r11] - (rbVar.a2.getMeasuredHeight() / 2.0f));
                                if (measuredWidth > 0.0f) {
                                    rbVar.Z1.setBubbleOffset(((r4.getMeasuredWidth() / 2.0f) - measuredWidth) / 2.0f);
                                }
                            } else {
                                float measuredWidth2 = ((rbVar.Z1.getMeasuredWidth() / 2.0f) + rbVar.Z1.getX()) - ((rbVar.a2.getMeasuredHeight() / 2.0f) + fArr[r11]);
                                if (measuredWidth2 < 0.0f) {
                                    rbVar.Z1.setBubbleOffset((-((r4.getMeasuredWidth() / 2.0f) + measuredWidth2)) / 2.0f);
                                }
                                rbVar.Z1.setMirrorX(r11);
                            }
                            rbVar.Z1.setTranslationX((ocVar.getMeasuredWidth() - rbVar.Z1.getMeasuredWidth()) / 2.0f);
                            super.dispatchDraw(canvas);
                            if (z11) {
                                canvas.restore();
                                canvas.restore();
                                if (pcVar.F != null) {
                                    float clamp = Utilities.clamp(f7 - (pcVar.I * 1.5f), 1.0f, 0.0f);
                                    rectF3.centerX();
                                    rectF3.centerY();
                                    Math.min(rectF3.width(), rectF3.height());
                                    kc kcVar = pcVar.F;
                                    ImageReceiver imageReceiver = kcVar.e;
                                    if (imageReceiver != null) {
                                        imageReceiver.setImageCoords(rectF3);
                                        int i11 = pcVar.F.e.getRoundRadius()[r11];
                                        pcVar.F.e.setRoundRadius((int) lerp);
                                        pcVar.F.e.setAlpha(clamp);
                                        pcVar.F.e.draw(canvas);
                                        pcVar.F.e.setRoundRadius(i11);
                                    } else {
                                        org.telegram.ui.Cells.e7 e7Var = kcVar.d;
                                        if (e7Var != null) {
                                            e7Var.setBounds((int) rectF3.left, (int) rectF3.top, (int) rectF3.right, (int) rectF3.bottom);
                                            org.telegram.ui.Cells.e7 e7Var2 = pcVar.F.d;
                                            e7Var2.d = (int) com.google.android.gms.internal.vision.e2.C(clamp, 255.0f, clamp, clamp);
                                            e7Var2.draw(canvas);
                                        }
                                    }
                                    pcVar.F.getClass();
                                    canvas.save();
                                    canvas.translate(rectF.left, rectF.top);
                                    pcVar.F.a(canvas, clamp);
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
                    pcVar.k();
                }
            }
        } else {
            z10 = false;
        }
        z11 = false;
        r11 = z10;
        rbVar = pcVar.v1;
        if (rbVar != null) {
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
        pc pcVar = this.E0;
        y yVar = pcVar.I0;
        if (yVar != null && yVar.e) {
            float y3 = pcVar.I0.getY() + pcVar.i0.getY() + pcVar.r.getY();
            if ((motionEvent.getY() >= y3 && motionEvent.getY() <= y3 + pcVar.I0.getHeight()) || this.z0) {
                if (motionEvent.getAction() != 1 && motionEvent.getAction() != 3) {
                    z10 = true;
                }
                this.z0 = z10;
                return super.dispatchTouchEvent(motionEvent);
            }
            pcVar.I0.a(false, true);
            pcVar.m0(true);
        }
        if (this.z0 && (motionEvent.getAction() == 1 || motionEvent.getAction() == 3)) {
            this.z0 = false;
        }
        this.x0.onTouchEvent(motionEvent);
        this.w0.h(motionEvent);
        if (motionEvent.getAction() == 1 && !this.y0) {
            if (pcVar.r.getTranslationY() <= 0.0f) {
                ob obVar = pcVar.M0;
                if (obVar != null && obVar.getTranslationY() > 0.0f && !pcVar.L0) {
                    pcVar.f(!pcVar.Q1 && pcVar.M0.getTranslationY() < ((float) pcVar.M0.getPadding()));
                }
            } else if (pcVar.K > 0.4f) {
                pcVar.q(true);
            } else {
                pc.c(pcVar);
            }
            pcVar.L0 = false;
            pcVar.W = false;
            pcVar.X = false;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // org.telegram.ui.Components.ov0
    public int getBottomPadding() {
        int height = getHeight();
        pc pcVar = this.E0;
        return (height - pcVar.r.getBottom()) + pcVar.U;
    }

    public int getBottomPadding2() {
        return getHeight() - this.E0.r.getBottom();
    }

    @Override // org.telegram.ui.Components.ov0
    public /* bridge */ /* synthetic */ int[] getColorKeys() {
        return null;
    }

    public int getPaddingUnderContainer() {
        int height = getHeight();
        pc pcVar = this.E0;
        return (height - pcVar.b0) - pcVar.r.getBottom();
    }

    @Override // org.telegram.ui.Components.ov0, android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int i14;
        kz emojiView;
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        pc pcVar = this.E0;
        int i15 = pcVar.Z;
        int measuredHeight2 = pcVar.m0.getMeasuredHeight();
        if (pcVar.V) {
            i15 = 0;
        }
        int i16 = pcVar.S;
        int b10 = w7.p.b((measuredWidth - i16) / 2, pcVar.Y, (measuredWidth - pcVar.a0) - i16);
        int i17 = pcVar.S + b10;
        if (pcVar.V) {
            i14 = pcVar.T;
        } else {
            int i18 = pcVar.b0;
            int i19 = pcVar.T;
            int i20 = (((((measuredHeight - i15) - i18) - i19) - measuredHeight2) / 2) + i15;
            if (pcVar.J == 1) {
                float f7 = pcVar.H.top;
                if (i19 + f7 + measuredHeight2 < measuredHeight - i18) {
                    i15 = (int) f7;
                    i14 = pcVar.T;
                }
            }
            if (i20 - i15 >= AndroidUtilities.dp(40.0f)) {
                i15 = i20;
            }
            i14 = pcVar.T;
        }
        pcVar.r.layout(b10, i15, i17, i14 + i15 + measuredHeight2);
        pcVar.s.b.layout(0, 0, measuredWidth, measuredHeight);
        xb xbVar = pcVar.C2;
        if (xbVar != null) {
            xbVar.layout(0, 0, measuredWidth, measuredHeight);
        }
        ob obVar = pcVar.M0;
        if (obVar != null) {
            obVar.layout((measuredWidth - obVar.getMeasuredWidth()) / 2, 0, (pcVar.M0.getMeasuredWidth() + measuredWidth) / 2, measuredHeight);
        }
        fc fcVar = pcVar.c1;
        if (fcVar != null && (emojiView = fcVar.f.getEmojiView()) != null) {
            emojiView.layout(pcVar.Y, (measuredHeight - pcVar.b0) - emojiView.getMeasuredHeight(), measuredWidth - pcVar.a0, measuredHeight - pcVar.b0);
        }
        rb rbVar = pcVar.v1;
        if (rbVar != null) {
            kz kzVar = rbVar.p2;
            if (kzVar != null) {
                kzVar.layout(pcVar.Y, (measuredHeight - pcVar.b0) - kzVar.getMeasuredHeight(), measuredWidth - pcVar.a0, measuredHeight - pcVar.b0);
            }
            fk0 fk0Var = pcVar.v1.Z1;
            if (fk0Var != null) {
                int i21 = pcVar.Y;
                fk0Var.layout(i21, pcVar.Z, fk0Var.getMeasuredWidth() + i21, pcVar.v1.Z1.getMeasuredHeight() + pcVar.Z);
                ah.w wVar = pcVar.v1.Z1.getReactionsWindow() != null ? pcVar.v1.Z1.getReactionsWindow().c : null;
                if (wVar != null) {
                    int i22 = pcVar.Y;
                    wVar.layout(i22, pcVar.Z, wVar.getMeasuredWidth() + i22, wVar.getMeasuredHeight() + pcVar.Z);
                }
            }
        }
        zb zbVar = pcVar.r1;
        if (zbVar != null) {
            zbVar.e.setPadding(0, pcVar.Z, 0, pcVar.b0);
            pcVar.r1.layout(0, 0, measuredWidth, measuredHeight);
            pcVar.r1.d.layout(0, 0, measuredWidth, measuredHeight);
        }
        ac acVar = pcVar.s1;
        if (acVar != null) {
            acVar.f.setPadding(0, pcVar.Z, 0, pcVar.b0);
            pcVar.s1.layout(0, 0, measuredWidth, measuredHeight);
            pcVar.s1.e.layout(0, 0, measuredWidth, measuredHeight);
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
        pc pcVar = this.E0;
        int i12 = (size - pcVar.Y) - pcVar.a0;
        int i13 = pcVar.Z;
        int i14 = pcVar.b0;
        int ceil = (int) Math.ceil((i12 / 9.0f) * 16.0f);
        int dp = AndroidUtilities.dp(48.0f);
        pcVar.U = dp;
        int i15 = ceil + dp;
        int i16 = size2 - i14;
        if (i15 <= i16) {
            pcVar.S = i12;
            pcVar.T = ceil;
            pcVar.V = i15 > i16 - i13;
        } else {
            pcVar.V = false;
            pcVar.T = ((size2 - dp) - i14) - i13;
            pcVar.S = (int) Math.ceil((r9 * 9.0f) / 16.0f);
        }
        pcVar.U = Utilities.clamp((size2 - pcVar.T) - (pcVar.V ? 0 : i13), AndroidUtilities.dp(68.0f), AndroidUtilities.dp(48.0f));
        int systemUiVisibility = getSystemUiVisibility();
        setSystemUiVisibility(pcVar.V ? systemUiVisibility | 4 : systemUiVisibility & (-5));
        pcVar.r.measure(View.MeasureSpec.makeMeasureSpec(pcVar.S, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(pcVar.T + pcVar.U, TLObject.FLAG_30));
        pcVar.s.b.measure(View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(size2, TLObject.FLAG_30));
        xb xbVar = pcVar.C2;
        if (xbVar != null) {
            xbVar.measure(View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(size2, TLObject.FLAG_30));
        }
        ob obVar = pcVar.M0;
        if (obVar != null) {
            obVar.measure(View.MeasureSpec.makeMeasureSpec(pcVar.S, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(size2, TLObject.FLAG_30));
        }
        fc fcVar = pcVar.c1;
        if (fcVar != null) {
            kz emojiView = fcVar.f.getEmojiView();
            R();
            AndroidUtilities.dp(20.0f);
            if (emojiView != null) {
                emojiView.measure(View.MeasureSpec.makeMeasureSpec(i12, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(emojiView.getLayoutParams().height, TLObject.FLAG_30));
            }
        }
        rb rbVar = pcVar.v1;
        if (rbVar != null) {
            kz kzVar = rbVar.p2;
            if (kzVar != null) {
                kzVar.measure(View.MeasureSpec.makeMeasureSpec(i12, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(pcVar.v1.p2.getLayoutParams().height, TLObject.FLAG_30));
            }
            fk0 fk0Var = pcVar.v1.Z1;
            if (fk0Var != null) {
                measureChild(fk0Var, i10, i11);
                if (pcVar.v1.Z1.getReactionsWindow() != null) {
                    measureChild(pcVar.v1.Z1.getReactionsWindow().c, i10, i11);
                }
            }
        }
        for (int i17 = 0; i17 < getChildCount(); i17++) {
            View childAt = getChildAt(i17);
            if (childAt instanceof t0) {
                childAt.measure(View.MeasureSpec.makeMeasureSpec(i12, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(size2, TLObject.FLAG_30));
            } else if (childAt instanceof org.telegram.ui.Components.ib) {
                childAt.measure(View.MeasureSpec.makeMeasureSpec(i12, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(Math.min(AndroidUtilities.dp(340.0f), size2 - (pcVar.V ? 0 : i13)), TLObject.FLAG_30));
            }
        }
        zb zbVar = pcVar.r1;
        if (zbVar != null) {
            zbVar.measure(View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(size2, TLObject.FLAG_30));
            pcVar.r1.d.measure(View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(size2, TLObject.FLAG_30));
        }
        ac acVar = pcVar.s1;
        if (acVar != null) {
            acVar.measure(View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(size2, TLObject.FLAG_30));
            pcVar.s1.e.measure(View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(size2, TLObject.FLAG_30));
        }
        setMeasuredDimension(size, size2);
    }
}
