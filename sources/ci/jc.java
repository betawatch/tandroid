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
import org.telegram.ui.Components.mw0;
import org.telegram.ui.Components.nz;
import org.telegram.ui.Components.sk0;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
/* loaded from: classes4.dex */
public final class jc extends mw0 {
    public boolean A0;
    public float B0;
    public float C0;
    public float D0;
    public final /* synthetic */ kc E0;
    public final ii.n4 w0;
    public final ScaleGestureDetector x0;
    public boolean y0;
    public boolean z0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jc(kc kcVar, Activity activity) {
        super(activity, null);
        this.E0 = kcVar;
        this.A0 = false;
        this.w0 = new ii.n4(activity, new hc(this));
        this.x0 = new ScaleGestureDetector(activity, new ic(this));
    }

    public final void Z(Bitmap bitmap, float f7) {
        Canvas canvas = new Canvas(bitmap);
        canvas.drawColor(-16777216);
        float width = bitmap.getWidth();
        kc kcVar = this.E0;
        float width2 = width / kcVar.n.getWidth();
        canvas.scale(width2, width2);
        TextureView textureView = kcVar.X0.getTextureView();
        if (textureView == null) {
            textureView = kcVar.X0.r;
        }
        if (textureView != null) {
            canvas.save();
            canvas.translate(kcVar.h0.getX() + kcVar.r.getX(), kcVar.h0.getY() + kcVar.r.getY());
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
        canvas.translate(kcVar.r.getX(), kcVar.r.getY());
        for (int i10 = 0; i10 < kcVar.r.getChildCount(); i10++) {
            View childAt = kcVar.r.getChildAt(i10);
            canvas.save();
            canvas.translate(childAt.getX(), childAt.getY());
            if (childAt.getVisibility() == 0) {
                if (childAt == kcVar.h0) {
                    for (int i11 = 0; i11 < kcVar.h0.getChildCount(); i11++) {
                        View childAt2 = kcVar.h0.getChildAt(i11);
                        if (childAt2 != kcVar.X0 && childAt2 != kcVar.B0 && childAt2.getVisibility() == 0) {
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
    @Override // org.telegram.ui.Components.mw0, android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void dispatchDraw(Canvas canvas) {
        boolean z10;
        boolean z11;
        ?? r11;
        mb mbVar;
        float f7;
        qg.a2 a2Var;
        kc kcVar = this.E0;
        RectF rectF = kcVar.H;
        Path path = kcVar.e0;
        RectF rectF2 = kcVar.d0;
        RectF rectF3 = kcVar.c0;
        Float f10 = kcVar.L;
        float floatValue = f10 != null ? f10.floatValue() : kcVar.K;
        if (kcVar.J == 0) {
            canvas.drawColor(i0.a.k(-16777216, (int) ((1.0f - floatValue) * kcVar.I * 255.0f)));
        }
        float lerp = AndroidUtilities.lerp(kcVar.G, 0.0f, kcVar.I);
        if (kcVar.I != 1.0f) {
            int i10 = kcVar.J;
            if (i10 == 0) {
                rectF2.set(0.0f, 0.0f, getWidth(), getHeight());
                rectF2.offset(kcVar.r.getTranslationX(), kcVar.r.getTranslationY());
                AndroidUtilities.lerp(rectF, rectF2, kcVar.I, rectF3);
                canvas.save();
                path.rewind();
                path.addRoundRect(rectF3, lerp, lerp, Path.Direction.CW);
                canvas.clipPath(path);
                r11 = 0;
                canvas.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), (int) (Utilities.clamp(kcVar.I * 3.0f, 1.0f, 0.0f) * 255.0f), 31);
                canvas.translate(rectF3.left, rectF3.top - (kcVar.r.getTranslationY() * kcVar.I));
                float max = Math.max(rectF3.width() / getWidth(), rectF3.height() / getHeight());
                canvas.scale(max, max);
                z11 = true;
                mbVar = kcVar.v1;
                if (mbVar != null) {
                    jc jcVar = mbVar.M1;
                    float[] fArr = mbVar.j2;
                    if (mbVar.d2) {
                        mbVar.d2 = r11;
                        if (mbVar.Z1 != null && (a2Var = mbVar.a2) != null) {
                            fArr[r11] = a2Var.getMeasuredWidth() / 2.0f;
                            fArr[1] = mbVar.a2.getMeasuredHeight() / 2.0f;
                            mbVar.a2.getMatrix().mapPoints(fArr);
                            f7 = 1.0f;
                            float scaleX = fArr[1] - (mbVar.a2.getScaleX() * (mbVar.a2.getMeasuredHeight() / 2.0f));
                            float scaleX2 = (mbVar.a2.getScaleX() * (mbVar.a2.getMeasuredHeight() / 2.0f)) + fArr[1];
                            if (scaleX < AndroidUtilities.dp(120.0f) && scaleX2 > jcVar.getMeasuredHeight() - AndroidUtilities.dp(200.0f)) {
                                mbVar.Z1.setTop((boolean) r11);
                                mbVar.Z1.setTranslationY(AndroidUtilities.dp(16.0f) + (AndroidUtilities.dp(120.0f) - mbVar.Z1.getMeasuredHeight()));
                            } else if (scaleX < AndroidUtilities.dp(120.0f)) {
                                mbVar.Z1.setTop(true);
                                mbVar.Z1.setTranslationY((mbVar.a2.getScaleX() * (mbVar.a2.getMeasuredHeight() / 2.0f)) + fArr[1]);
                            } else {
                                mbVar.Z1.setTop((boolean) r11);
                                mbVar.Z1.setTranslationY((scaleX - r7.getMeasuredHeight()) + AndroidUtilities.dp(16.0f));
                            }
                            if (fArr[r11] < mbVar.getMeasuredWidth() / 2.0f) {
                                mbVar.Z1.setMirrorX(true);
                                float measuredWidth = ((mbVar.Z1.getMeasuredWidth() / 2.0f) + mbVar.Z1.getX()) - (fArr[r11] - (mbVar.a2.getMeasuredHeight() / 2.0f));
                                if (measuredWidth > 0.0f) {
                                    mbVar.Z1.setBubbleOffset(((r4.getMeasuredWidth() / 2.0f) - measuredWidth) / 2.0f);
                                }
                            } else {
                                float measuredWidth2 = ((mbVar.Z1.getMeasuredWidth() / 2.0f) + mbVar.Z1.getX()) - ((mbVar.a2.getMeasuredHeight() / 2.0f) + fArr[r11]);
                                if (measuredWidth2 < 0.0f) {
                                    mbVar.Z1.setBubbleOffset((-((r4.getMeasuredWidth() / 2.0f) + measuredWidth2)) / 2.0f);
                                }
                                mbVar.Z1.setMirrorX(r11);
                            }
                            mbVar.Z1.setTranslationX((jcVar.getMeasuredWidth() - mbVar.Z1.getMeasuredWidth()) / 2.0f);
                            super.dispatchDraw(canvas);
                            if (z11) {
                                canvas.restore();
                                canvas.restore();
                                if (kcVar.F != null) {
                                    float clamp = Utilities.clamp(f7 - (kcVar.I * 1.5f), 1.0f, 0.0f);
                                    rectF3.centerX();
                                    rectF3.centerY();
                                    Math.min(rectF3.width(), rectF3.height());
                                    fc fcVar = kcVar.F;
                                    ImageReceiver imageReceiver = fcVar.e;
                                    if (imageReceiver != null) {
                                        imageReceiver.setImageCoords(rectF3);
                                        int i11 = kcVar.F.e.getRoundRadius()[r11];
                                        kcVar.F.e.setRoundRadius((int) lerp);
                                        kcVar.F.e.setAlpha(clamp);
                                        kcVar.F.e.draw(canvas);
                                        kcVar.F.e.setRoundRadius(i11);
                                    } else {
                                        org.telegram.ui.Cells.f7 f7Var = fcVar.d;
                                        if (f7Var != null) {
                                            f7Var.setBounds((int) rectF3.left, (int) rectF3.top, (int) rectF3.right, (int) rectF3.bottom);
                                            org.telegram.ui.Cells.f7 f7Var2 = kcVar.F.d;
                                            f7Var2.d = (int) com.google.android.gms.internal.vision.e2.C(clamp, 255.0f, clamp, clamp);
                                            f7Var2.draw(canvas);
                                        }
                                    }
                                    kcVar.F.getClass();
                                    canvas.save();
                                    canvas.translate(rectF.left, rectF.top);
                                    kcVar.F.a(canvas, clamp);
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
                    kcVar.k();
                }
            }
        } else {
            z10 = false;
        }
        z11 = false;
        r11 = z10;
        mbVar = kcVar.v1;
        if (mbVar != null) {
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
        kc kcVar = this.E0;
        y yVar = kcVar.I0;
        if (yVar != null && yVar.e) {
            float y3 = kcVar.I0.getY() + kcVar.i0.getY() + kcVar.r.getY();
            if ((motionEvent.getY() >= y3 && motionEvent.getY() <= y3 + kcVar.I0.getHeight()) || this.z0) {
                if (motionEvent.getAction() != 1 && motionEvent.getAction() != 3) {
                    z10 = true;
                }
                this.z0 = z10;
                return super.dispatchTouchEvent(motionEvent);
            }
            kcVar.I0.a(false, true);
            kcVar.m0(true);
        }
        if (this.z0 && (motionEvent.getAction() == 1 || motionEvent.getAction() == 3)) {
            this.z0 = false;
        }
        this.x0.onTouchEvent(motionEvent);
        this.w0.G(motionEvent);
        if (motionEvent.getAction() == 1 && !this.y0) {
            if (kcVar.r.getTranslationY() <= 0.0f) {
                jb jbVar = kcVar.M0;
                if (jbVar != null && jbVar.getTranslationY() > 0.0f && !kcVar.L0) {
                    kcVar.f(!kcVar.Q1 && kcVar.M0.getTranslationY() < ((float) kcVar.M0.getPadding()));
                }
            } else if (kcVar.K > 0.4f) {
                kcVar.q(true);
            } else {
                kc.c(kcVar);
            }
            kcVar.L0 = false;
            kcVar.W = false;
            kcVar.X = false;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // org.telegram.ui.Components.mw0
    public int getBottomPadding() {
        int height = getHeight();
        kc kcVar = this.E0;
        return (height - kcVar.r.getBottom()) + kcVar.U;
    }

    public int getBottomPadding2() {
        return getHeight() - this.E0.r.getBottom();
    }

    @Override // org.telegram.ui.Components.mw0
    public /* bridge */ /* synthetic */ int[] getColorKeys() {
        return null;
    }

    public int getPaddingUnderContainer() {
        int height = getHeight();
        kc kcVar = this.E0;
        return (height - kcVar.b0) - kcVar.r.getBottom();
    }

    @Override // org.telegram.ui.Components.mw0, android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int i14;
        nz emojiView;
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        kc kcVar = this.E0;
        int i15 = kcVar.Z;
        int measuredHeight2 = kcVar.m0.getMeasuredHeight();
        if (kcVar.V) {
            i15 = 0;
        }
        int i16 = kcVar.S;
        int b10 = w7.q.b((measuredWidth - i16) / 2, kcVar.Y, (measuredWidth - kcVar.a0) - i16);
        int i17 = kcVar.S + b10;
        if (kcVar.V) {
            i14 = kcVar.T;
        } else {
            int i18 = kcVar.b0;
            int i19 = kcVar.T;
            int i20 = (((((measuredHeight - i15) - i18) - i19) - measuredHeight2) / 2) + i15;
            if (kcVar.J == 1) {
                float f7 = kcVar.H.top;
                if (i19 + f7 + measuredHeight2 < measuredHeight - i18) {
                    i15 = (int) f7;
                    i14 = kcVar.T;
                }
            }
            if (i20 - i15 >= AndroidUtilities.dp(40.0f)) {
                i15 = i20;
            }
            i14 = kcVar.T;
        }
        kcVar.r.layout(b10, i15, i17, i14 + i15 + measuredHeight2);
        kcVar.s.b.layout(0, 0, measuredWidth, measuredHeight);
        sb sbVar = kcVar.C2;
        if (sbVar != null) {
            sbVar.layout(0, 0, measuredWidth, measuredHeight);
        }
        jb jbVar = kcVar.M0;
        if (jbVar != null) {
            jbVar.layout((measuredWidth - jbVar.getMeasuredWidth()) / 2, 0, (kcVar.M0.getMeasuredWidth() + measuredWidth) / 2, measuredHeight);
        }
        ac acVar = kcVar.c1;
        if (acVar != null && (emojiView = acVar.f.getEmojiView()) != null) {
            emojiView.layout(kcVar.Y, (measuredHeight - kcVar.b0) - emojiView.getMeasuredHeight(), measuredWidth - kcVar.a0, measuredHeight - kcVar.b0);
        }
        mb mbVar = kcVar.v1;
        if (mbVar != null) {
            nz nzVar = mbVar.p2;
            if (nzVar != null) {
                nzVar.layout(kcVar.Y, (measuredHeight - kcVar.b0) - nzVar.getMeasuredHeight(), measuredWidth - kcVar.a0, measuredHeight - kcVar.b0);
            }
            sk0 sk0Var = kcVar.v1.Z1;
            if (sk0Var != null) {
                int i21 = kcVar.Y;
                sk0Var.layout(i21, kcVar.Z, sk0Var.getMeasuredWidth() + i21, kcVar.v1.Z1.getMeasuredHeight() + kcVar.Z);
                yh.u3 u3Var = kcVar.v1.Z1.getReactionsWindow() != null ? kcVar.v1.Z1.getReactionsWindow().c : null;
                if (u3Var != null) {
                    int i22 = kcVar.Y;
                    u3Var.layout(i22, kcVar.Z, u3Var.getMeasuredWidth() + i22, u3Var.getMeasuredHeight() + kcVar.Z);
                }
            }
        }
        ub ubVar = kcVar.r1;
        if (ubVar != null) {
            ubVar.e.setPadding(0, kcVar.Z, 0, kcVar.b0);
            kcVar.r1.layout(0, 0, measuredWidth, measuredHeight);
            kcVar.r1.d.layout(0, 0, measuredWidth, measuredHeight);
        }
        vb vbVar = kcVar.s1;
        if (vbVar != null) {
            vbVar.f.setPadding(0, kcVar.Z, 0, kcVar.b0);
            kcVar.s1.layout(0, 0, measuredWidth, measuredHeight);
            kcVar.s1.e.layout(0, 0, measuredWidth, measuredHeight);
        }
        for (int i23 = 0; i23 < getChildCount(); i23++) {
            View childAt = getChildAt(i23);
            if (childAt instanceof t0) {
                childAt.layout(0, 0, measuredWidth, measuredHeight);
            } else if (childAt instanceof org.telegram.ui.Components.jb) {
                childAt.layout(0, i15, childAt.getMeasuredWidth(), childAt.getMeasuredHeight() + i15);
            }
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        int size = View.MeasureSpec.getSize(i10);
        int size2 = View.MeasureSpec.getSize(i11);
        kc kcVar = this.E0;
        int i12 = (size - kcVar.Y) - kcVar.a0;
        int i13 = kcVar.Z;
        int i14 = kcVar.b0;
        int ceil = (int) Math.ceil((i12 / 9.0f) * 16.0f);
        int dp = AndroidUtilities.dp(48.0f);
        kcVar.U = dp;
        int i15 = ceil + dp;
        int i16 = size2 - i14;
        if (i15 <= i16) {
            kcVar.S = i12;
            kcVar.T = ceil;
            kcVar.V = i15 > i16 - i13;
        } else {
            kcVar.V = false;
            kcVar.T = ((size2 - dp) - i14) - i13;
            kcVar.S = (int) Math.ceil((r9 * 9.0f) / 16.0f);
        }
        kcVar.U = Utilities.clamp((size2 - kcVar.T) - (kcVar.V ? 0 : i13), AndroidUtilities.dp(68.0f), AndroidUtilities.dp(48.0f));
        int systemUiVisibility = getSystemUiVisibility();
        setSystemUiVisibility(kcVar.V ? systemUiVisibility | 4 : systemUiVisibility & (-5));
        kcVar.r.measure(View.MeasureSpec.makeMeasureSpec(kcVar.S, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(kcVar.T + kcVar.U, TLObject.FLAG_30));
        kcVar.s.b.measure(View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(size2, TLObject.FLAG_30));
        sb sbVar = kcVar.C2;
        if (sbVar != null) {
            sbVar.measure(View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(size2, TLObject.FLAG_30));
        }
        jb jbVar = kcVar.M0;
        if (jbVar != null) {
            jbVar.measure(View.MeasureSpec.makeMeasureSpec(kcVar.S, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(size2, TLObject.FLAG_30));
        }
        ac acVar = kcVar.c1;
        if (acVar != null) {
            nz emojiView = acVar.f.getEmojiView();
            R();
            AndroidUtilities.dp(20.0f);
            if (emojiView != null) {
                emojiView.measure(View.MeasureSpec.makeMeasureSpec(i12, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(emojiView.getLayoutParams().height, TLObject.FLAG_30));
            }
        }
        mb mbVar = kcVar.v1;
        if (mbVar != null) {
            nz nzVar = mbVar.p2;
            if (nzVar != null) {
                nzVar.measure(View.MeasureSpec.makeMeasureSpec(i12, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(kcVar.v1.p2.getLayoutParams().height, TLObject.FLAG_30));
            }
            sk0 sk0Var = kcVar.v1.Z1;
            if (sk0Var != null) {
                measureChild(sk0Var, i10, i11);
                if (kcVar.v1.Z1.getReactionsWindow() != null) {
                    measureChild(kcVar.v1.Z1.getReactionsWindow().c, i10, i11);
                }
            }
        }
        for (int i17 = 0; i17 < getChildCount(); i17++) {
            View childAt = getChildAt(i17);
            if (childAt instanceof t0) {
                childAt.measure(View.MeasureSpec.makeMeasureSpec(i12, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(size2, TLObject.FLAG_30));
            } else if (childAt instanceof org.telegram.ui.Components.jb) {
                childAt.measure(View.MeasureSpec.makeMeasureSpec(i12, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(Math.min(AndroidUtilities.dp(340.0f), size2 - (kcVar.V ? 0 : i13)), TLObject.FLAG_30));
            }
        }
        ub ubVar = kcVar.r1;
        if (ubVar != null) {
            ubVar.measure(View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(size2, TLObject.FLAG_30));
            kcVar.r1.d.measure(View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(size2, TLObject.FLAG_30));
        }
        vb vbVar = kcVar.s1;
        if (vbVar != null) {
            vbVar.measure(View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(size2, TLObject.FLAG_30));
            kcVar.s1.e.measure(View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(size2, TLObject.FLAG_30));
        }
        setMeasuredDimension(size, size2);
    }
}
