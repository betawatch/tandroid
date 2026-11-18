package hi;

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
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.Components.au0;
import org.telegram.ui.Components.of;
import org.telegram.ui.Components.ry;
import org.telegram.ui.Components.vi0;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes4.dex */
public final class sa extends au0 {
    public final of g0;
    public final ScaleGestureDetector h0;
    public boolean i0;
    public boolean j0;
    public boolean k0;
    public float l0;
    public float m0;
    public float n0;
    public final /* synthetic */ ta o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sa(ta taVar, Activity activity) {
        super(activity, null);
        this.o0 = taVar;
        this.k0 = false;
        this.g0 = new of(activity, new qa(this));
        this.h0 = new ScaleGestureDetector(activity, new ra(this));
    }

    public final void X(float f10, Bitmap bitmap) {
        Canvas canvas = new Canvas(bitmap);
        canvas.drawColor(-16777216);
        float width = bitmap.getWidth();
        ta taVar = this.o0;
        float width2 = width / taVar.n.getWidth();
        canvas.scale(width2, width2);
        TextureView textureView = taVar.Y0.getTextureView();
        if (textureView == null) {
            textureView = taVar.Y0.r;
        }
        if (textureView != null) {
            canvas.save();
            canvas.translate(taVar.i0.getX() + taVar.r.getX(), taVar.i0.getY() + taVar.r.getY());
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
        canvas.translate(taVar.r.getX(), taVar.r.getY());
        for (int i7 = 0; i7 < taVar.r.getChildCount(); i7++) {
            View childAt = taVar.r.getChildAt(i7);
            canvas.save();
            canvas.translate(childAt.getX(), childAt.getY());
            if (childAt.getVisibility() == 0) {
                if (childAt == taVar.i0) {
                    for (int i10 = 0; i10 < taVar.i0.getChildCount(); i10++) {
                        View childAt2 = taVar.i0.getChildAt(i10);
                        if (childAt2 != taVar.Y0 && childAt2 != taVar.C0 && childAt2.getVisibility() == 0) {
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
    @Override // org.telegram.ui.Components.au0, android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void dispatchDraw(Canvas canvas) {
        boolean z10;
        boolean z11;
        ?? r11;
        v9 v9Var;
        float f10;
        float f11;
        tg.q1 q1Var;
        ta taVar = this.o0;
        RectF rectF = taVar.I;
        Path path = taVar.f0;
        RectF rectF2 = taVar.e0;
        RectF rectF3 = taVar.d0;
        Float f12 = taVar.M;
        float floatValue = f12 != null ? f12.floatValue() : taVar.L;
        if (taVar.K == 0) {
            canvas.drawColor(i0.a.o(-16777216, (int) ((1.0f - floatValue) * taVar.J * 255.0f)));
        }
        float T1 = org.telegram.messenger.g0.T1(taVar.H, 0.0f, taVar.J);
        if (taVar.J != 1.0f) {
            int i7 = taVar.K;
            if (i7 == 0) {
                rectF2.set(0.0f, 0.0f, getWidth(), getHeight());
                rectF2.offset(taVar.r.getTranslationX(), taVar.r.getTranslationY());
                org.telegram.messenger.g0.Z1(rectF, rectF2, taVar.J, rectF3);
                canvas.save();
                path.rewind();
                path.addRoundRect(rectF3, T1, T1, Path.Direction.CW);
                canvas.clipPath(path);
                r11 = 0;
                canvas.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), (int) (Utilities.i(taVar.J * 3.0f, 1.0f, 0.0f) * 255.0f), 31);
                canvas.translate(rectF3.left, rectF3.top - (taVar.r.getTranslationY() * taVar.J));
                float max = Math.max(rectF3.width() / getWidth(), rectF3.height() / getHeight());
                canvas.scale(max, max);
                z11 = true;
                v9Var = taVar.w1;
                if (v9Var != null) {
                    sa saVar = v9Var.w1;
                    float[] fArr = v9Var.T1;
                    if (v9Var.N1) {
                        v9Var.N1 = r11;
                        if (v9Var.J1 != null && (q1Var = v9Var.K1) != null) {
                            fArr[r11] = q1Var.getMeasuredWidth() / 2.0f;
                            fArr[1] = v9Var.K1.getMeasuredHeight() / 2.0f;
                            v9Var.K1.getMatrix().mapPoints(fArr);
                            f10 = 1.0f;
                            float scaleX = fArr[1] - (v9Var.K1.getScaleX() * (v9Var.K1.getMeasuredHeight() / 2.0f));
                            f11 = 0.0f;
                            float scaleX2 = (v9Var.K1.getScaleX() * (v9Var.K1.getMeasuredHeight() / 2.0f)) + fArr[1];
                            if (scaleX < org.telegram.messenger.g0.L(120.0f) && scaleX2 > saVar.getMeasuredHeight() - org.telegram.messenger.g0.L(200.0f)) {
                                v9Var.J1.setTop((boolean) r11);
                                v9Var.J1.setTranslationY(org.telegram.messenger.g0.L(16.0f) + (org.telegram.messenger.g0.L(120.0f) - v9Var.J1.getMeasuredHeight()));
                            } else if (scaleX < org.telegram.messenger.g0.L(120.0f)) {
                                v9Var.J1.setTop(true);
                                v9Var.J1.setTranslationY((v9Var.K1.getScaleX() * (v9Var.K1.getMeasuredHeight() / 2.0f)) + fArr[1]);
                            } else {
                                v9Var.J1.setTop((boolean) r11);
                                v9Var.J1.setTranslationY((scaleX - r7.getMeasuredHeight()) + org.telegram.messenger.g0.L(16.0f));
                            }
                            if (fArr[r11] < v9Var.getMeasuredWidth() / 2.0f) {
                                v9Var.J1.setMirrorX(true);
                                float measuredWidth = ((v9Var.J1.getMeasuredWidth() / 2.0f) + v9Var.J1.getX()) - (fArr[r11] - (v9Var.K1.getMeasuredHeight() / 2.0f));
                                if (measuredWidth > 0.0f) {
                                    v9Var.J1.setBubbleOffset(((r4.getMeasuredWidth() / 2.0f) - measuredWidth) / 2.0f);
                                }
                            } else {
                                float measuredWidth2 = ((v9Var.J1.getMeasuredWidth() / 2.0f) + v9Var.J1.getX()) - ((v9Var.K1.getMeasuredHeight() / 2.0f) + fArr[r11]);
                                if (measuredWidth2 < 0.0f) {
                                    v9Var.J1.setBubbleOffset((-((r4.getMeasuredWidth() / 2.0f) + measuredWidth2)) / 2.0f);
                                }
                                v9Var.J1.setMirrorX(r11);
                            }
                            v9Var.J1.setTranslationX((saVar.getMeasuredWidth() - v9Var.J1.getMeasuredWidth()) / 2.0f);
                            super.dispatchDraw(canvas);
                            if (z11) {
                                canvas.restore();
                                canvas.restore();
                                if (taVar.G != null) {
                                    float i10 = Utilities.i(f10 - (taVar.J * 1.5f), f10, f11);
                                    rectF3.centerX();
                                    rectF3.centerY();
                                    Math.min(rectF3.width(), rectF3.height());
                                    oa oaVar = taVar.G;
                                    ImageReceiver imageReceiver = oaVar.e;
                                    if (imageReceiver != null) {
                                        imageReceiver.A0(rectF3);
                                        ImageReceiver imageReceiver2 = taVar.G.e;
                                        int i11 = imageReceiver2.X0[r11];
                                        imageReceiver2.J0((int) T1);
                                        taVar.G.e.setAlpha(i10);
                                        taVar.G.e.h(canvas, null);
                                        taVar.G.e.J0(i11);
                                    } else {
                                        org.telegram.ui.Cells.d7 d7Var = oaVar.d;
                                        if (d7Var != null) {
                                            d7Var.setBounds((int) rectF3.left, (int) rectF3.top, (int) rectF3.right, (int) rectF3.bottom);
                                            org.telegram.ui.Cells.d7 d7Var2 = taVar.G.d;
                                            d7Var2.g = (int) com.google.android.gms.internal.vision.e2.D(i10, 255.0f, i10, i10);
                                            d7Var2.draw(canvas);
                                        }
                                    }
                                    taVar.G.getClass();
                                    canvas.save();
                                    canvas.translate(rectF.left, rectF.top);
                                    taVar.G.a(canvas, i10);
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
                f11 = 0.0f;
                super.dispatchDraw(canvas);
                if (z11) {
                }
            } else {
                boolean z12 = false;
                z10 = z12;
                if (i7 == 1) {
                    taVar.j();
                    z10 = z12;
                }
            }
        } else {
            z10 = false;
        }
        z11 = z10 ? 1 : 0;
        r11 = z10;
        v9Var = taVar.w1;
        if (v9Var != null) {
        }
        f10 = 1.0f;
        f11 = 0.0f;
        super.dispatchDraw(canvas);
        if (z11) {
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEventPreIme(KeyEvent keyEvent) {
        if (keyEvent == null || keyEvent.getKeyCode() != 4 || keyEvent.getAction() != 1) {
            return super.dispatchKeyEventPreIme(keyEvent);
        }
        this.o0.L();
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        boolean z10 = false;
        this.i0 = false;
        ta taVar = this.o0;
        z zVar = taVar.J0;
        if (zVar != null && zVar.e) {
            float y10 = taVar.J0.getY() + taVar.j0.getY() + taVar.r.getY();
            if ((motionEvent.getY() >= y10 && motionEvent.getY() <= y10 + taVar.J0.getHeight()) || this.j0) {
                if (motionEvent.getAction() != 1 && motionEvent.getAction() != 3) {
                    z10 = true;
                }
                this.j0 = z10;
                return super.dispatchTouchEvent(motionEvent);
            }
            taVar.J0.a(false, true);
            taVar.l0(true);
        }
        if (this.j0 && (motionEvent.getAction() == 1 || motionEvent.getAction() == 3)) {
            this.j0 = false;
        }
        this.h0.onTouchEvent(motionEvent);
        this.g0.w0(motionEvent);
        if (motionEvent.getAction() == 1 && !this.i0) {
            if (taVar.r.getTranslationY() <= 0.0f) {
                h3 h3Var = taVar.N0;
                if (h3Var != null && h3Var.getTranslationY() > 0.0f && !taVar.M0) {
                    taVar.e(!taVar.R1 && taVar.N0.getTranslationY() < ((float) taVar.N0.getPadding()));
                }
            } else if (taVar.L > 0.4f) {
                taVar.p(true);
            } else {
                ta.b(taVar);
            }
            taVar.M0 = false;
            taVar.X = false;
            taVar.Y = false;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // org.telegram.ui.Components.au0
    public int getBottomPadding() {
        int height = getHeight();
        ta taVar = this.o0;
        return (height - taVar.r.getBottom()) + taVar.V;
    }

    public int getBottomPadding2() {
        return getHeight() - this.o0.r.getBottom();
    }

    public int getPaddingUnderContainer() {
        int height = getHeight();
        ta taVar = this.o0;
        return (height - taVar.c0) - taVar.r.getBottom();
    }

    @Override // org.telegram.ui.Components.au0, android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i7, int i10, int i11, int i12) {
        int i13;
        ry emojiView;
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        ta taVar = this.o0;
        int i14 = taVar.a0;
        int measuredHeight2 = taVar.n0.getMeasuredHeight();
        if (taVar.W) {
            i14 = 0;
        }
        int i15 = taVar.T;
        int b10 = c8.l9.b((measuredWidth - i15) / 2, taVar.Z, (measuredWidth - taVar.b0) - i15);
        int i16 = taVar.T + b10;
        if (taVar.W) {
            i13 = taVar.U;
        } else {
            int i17 = taVar.c0;
            int i18 = taVar.U;
            int i19 = (((((measuredHeight - i14) - i17) - i18) - measuredHeight2) / 2) + i14;
            if (taVar.K == 1) {
                float f10 = taVar.I.top;
                if (i18 + f10 + measuredHeight2 < measuredHeight - i17) {
                    i14 = (int) f10;
                    i13 = taVar.U;
                }
            }
            if (i19 - i14 >= org.telegram.messenger.g0.L(40.0f)) {
                i14 = i19;
            }
            i13 = taVar.U;
        }
        taVar.r.layout(b10, i14, i16, i13 + i14 + measuredHeight2);
        taVar.s.b.layout(0, 0, measuredWidth, measuredHeight);
        ba baVar = taVar.D2;
        if (baVar != null) {
            baVar.layout(0, 0, measuredWidth, measuredHeight);
        }
        h3 h3Var = taVar.N0;
        if (h3Var != null) {
            h3Var.layout((measuredWidth - h3Var.getMeasuredWidth()) / 2, 0, (taVar.N0.getMeasuredWidth() + measuredWidth) / 2, measuredHeight);
        }
        ja jaVar = taVar.d1;
        if (jaVar != null && (emojiView = jaVar.f.getEmojiView()) != null) {
            emojiView.layout(taVar.Z, (measuredHeight - taVar.c0) - emojiView.getMeasuredHeight(), measuredWidth - taVar.b0, measuredHeight - taVar.c0);
        }
        v9 v9Var = taVar.w1;
        if (v9Var != null) {
            ry ryVar = v9Var.Z1;
            if (ryVar != null) {
                ryVar.layout(taVar.Z, (measuredHeight - taVar.c0) - ryVar.getMeasuredHeight(), measuredWidth - taVar.b0, measuredHeight - taVar.c0);
            }
            vi0 vi0Var = taVar.w1.J1;
            if (vi0Var != null) {
                int i20 = taVar.Z;
                vi0Var.layout(i20, taVar.a0, vi0Var.getMeasuredWidth() + i20, taVar.w1.J1.getMeasuredHeight() + taVar.a0);
                ai.k0 k0Var = taVar.w1.J1.getReactionsWindow() != null ? taVar.w1.J1.getReactionsWindow().c : null;
                if (k0Var != null) {
                    int i21 = taVar.Z;
                    k0Var.layout(i21, taVar.a0, k0Var.getMeasuredWidth() + i21, k0Var.getMeasuredHeight() + taVar.a0);
                }
            }
        }
        da daVar = taVar.s1;
        if (daVar != null) {
            daVar.e.setPadding(0, taVar.a0, 0, taVar.c0);
            taVar.s1.layout(0, 0, measuredWidth, measuredHeight);
            taVar.s1.d.layout(0, 0, measuredWidth, measuredHeight);
        }
        ea eaVar = taVar.t1;
        if (eaVar != null) {
            eaVar.f.setPadding(0, taVar.a0, 0, taVar.c0);
            taVar.t1.layout(0, 0, measuredWidth, measuredHeight);
            taVar.t1.e.layout(0, 0, measuredWidth, measuredHeight);
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
    public final void onMeasure(int i7, int i10) {
        int size = View.MeasureSpec.getSize(i7);
        int size2 = View.MeasureSpec.getSize(i10);
        ta taVar = this.o0;
        int i11 = (size - taVar.Z) - taVar.b0;
        int i12 = taVar.a0;
        int i13 = taVar.c0;
        int ceil = (int) Math.ceil((i11 / 9.0f) * 16.0f);
        int L = org.telegram.messenger.g0.L(48.0f);
        taVar.V = L;
        int i14 = ceil + L;
        int i15 = size2 - i13;
        if (i14 <= i15) {
            taVar.T = i11;
            taVar.U = ceil;
            taVar.W = i14 > i15 - i12;
        } else {
            taVar.W = false;
            taVar.U = ((size2 - L) - i13) - i12;
            taVar.T = (int) Math.ceil((r9 * 9.0f) / 16.0f);
        }
        taVar.V = Utilities.j((size2 - taVar.U) - (taVar.W ? 0 : i12), org.telegram.messenger.g0.L(68.0f), org.telegram.messenger.g0.L(48.0f));
        int systemUiVisibility = getSystemUiVisibility();
        setSystemUiVisibility(taVar.W ? systemUiVisibility | 4 : systemUiVisibility & (-5));
        taVar.r.measure(View.MeasureSpec.makeMeasureSpec(taVar.T, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(taVar.U + taVar.V, TLObject.FLAG_30));
        taVar.s.b.measure(View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(size2, TLObject.FLAG_30));
        ba baVar = taVar.D2;
        if (baVar != null) {
            baVar.measure(View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(size2, TLObject.FLAG_30));
        }
        h3 h3Var = taVar.N0;
        if (h3Var != null) {
            h3Var.measure(View.MeasureSpec.makeMeasureSpec(taVar.T, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(size2, TLObject.FLAG_30));
        }
        ja jaVar = taVar.d1;
        if (jaVar != null) {
            ry emojiView = jaVar.f.getEmojiView();
            Q();
            org.telegram.messenger.g0.L(20.0f);
            if (emojiView != null) {
                emojiView.measure(View.MeasureSpec.makeMeasureSpec(i11, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(emojiView.getLayoutParams().height, TLObject.FLAG_30));
            }
        }
        v9 v9Var = taVar.w1;
        if (v9Var != null) {
            ry ryVar = v9Var.Z1;
            if (ryVar != null) {
                ryVar.measure(View.MeasureSpec.makeMeasureSpec(i11, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(taVar.w1.Z1.getLayoutParams().height, TLObject.FLAG_30));
            }
            vi0 vi0Var = taVar.w1.J1;
            if (vi0Var != null) {
                measureChild(vi0Var, i7, i10);
                if (taVar.w1.J1.getReactionsWindow() != null) {
                    measureChild(taVar.w1.J1.getReactionsWindow().c, i7, i10);
                }
            }
        }
        for (int i16 = 0; i16 < getChildCount(); i16++) {
            View childAt = getChildAt(i16);
            if (childAt instanceof u0) {
                childAt.measure(View.MeasureSpec.makeMeasureSpec(i11, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(size2, TLObject.FLAG_30));
            } else if (childAt instanceof org.telegram.ui.Components.za) {
                childAt.measure(View.MeasureSpec.makeMeasureSpec(i11, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(Math.min(org.telegram.messenger.g0.L(340.0f), size2 - (taVar.W ? 0 : i12)), TLObject.FLAG_30));
            }
        }
        da daVar = taVar.s1;
        if (daVar != null) {
            daVar.measure(View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(size2, TLObject.FLAG_30));
            taVar.s1.d.measure(View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(size2, TLObject.FLAG_30));
        }
        ea eaVar = taVar.t1;
        if (eaVar != null) {
            eaVar.measure(View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(size2, TLObject.FLAG_30));
            taVar.t1.e.measure(View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(size2, TLObject.FLAG_30));
        }
        setMeasuredDimension(size, size2);
    }
}
