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
import org.telegram.ui.Components.du0;
import org.telegram.ui.Components.qf;
import org.telegram.ui.Components.ty;
import org.telegram.ui.Components.xi0;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes4.dex */
public final class ra extends du0 {
    public final qf g0;
    public final ScaleGestureDetector h0;
    public boolean i0;
    public boolean j0;
    public boolean k0;
    public float l0;
    public float m0;
    public float n0;
    public final /* synthetic */ sa o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ra(sa saVar, Activity activity) {
        super(activity, null);
        this.o0 = saVar;
        this.k0 = false;
        this.g0 = new qf(activity, new pa(this));
        this.h0 = new ScaleGestureDetector(activity, new qa(this));
    }

    public final void X(float f10, Bitmap bitmap) {
        Canvas canvas = new Canvas(bitmap);
        canvas.drawColor(-16777216);
        float width = bitmap.getWidth();
        sa saVar = this.o0;
        float width2 = width / saVar.n.getWidth();
        canvas.scale(width2, width2);
        TextureView textureView = saVar.Y0.getTextureView();
        if (textureView == null) {
            textureView = saVar.Y0.r;
        }
        if (textureView != null) {
            canvas.save();
            canvas.translate(saVar.i0.getX() + saVar.r.getX(), saVar.i0.getY() + saVar.r.getY());
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
        canvas.translate(saVar.r.getX(), saVar.r.getY());
        for (int i7 = 0; i7 < saVar.r.getChildCount(); i7++) {
            View childAt = saVar.r.getChildAt(i7);
            canvas.save();
            canvas.translate(childAt.getX(), childAt.getY());
            if (childAt.getVisibility() == 0) {
                if (childAt == saVar.i0) {
                    for (int i10 = 0; i10 < saVar.i0.getChildCount(); i10++) {
                        View childAt2 = saVar.i0.getChildAt(i10);
                        if (childAt2 != saVar.Y0 && childAt2 != saVar.C0 && childAt2.getVisibility() == 0) {
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
    @Override // org.telegram.ui.Components.du0, android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void dispatchDraw(Canvas canvas) {
        boolean z10;
        boolean z11;
        ?? r11;
        u9 u9Var;
        float f10;
        float f11;
        tg.s1 s1Var;
        sa saVar = this.o0;
        RectF rectF = saVar.I;
        Path path = saVar.f0;
        RectF rectF2 = saVar.e0;
        RectF rectF3 = saVar.d0;
        Float f12 = saVar.M;
        float floatValue = f12 != null ? f12.floatValue() : saVar.L;
        if (saVar.K == 0) {
            canvas.drawColor(i0.a.o(-16777216, (int) ((1.0f - floatValue) * saVar.J * 255.0f)));
        }
        float T1 = org.telegram.messenger.g0.T1(saVar.H, 0.0f, saVar.J);
        if (saVar.J != 1.0f) {
            int i7 = saVar.K;
            if (i7 == 0) {
                rectF2.set(0.0f, 0.0f, getWidth(), getHeight());
                rectF2.offset(saVar.r.getTranslationX(), saVar.r.getTranslationY());
                org.telegram.messenger.g0.Z1(rectF, rectF2, saVar.J, rectF3);
                canvas.save();
                path.rewind();
                path.addRoundRect(rectF3, T1, T1, Path.Direction.CW);
                canvas.clipPath(path);
                r11 = 0;
                canvas.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), (int) (Utilities.i(saVar.J * 3.0f, 1.0f, 0.0f) * 255.0f), 31);
                canvas.translate(rectF3.left, rectF3.top - (saVar.r.getTranslationY() * saVar.J));
                float max = Math.max(rectF3.width() / getWidth(), rectF3.height() / getHeight());
                canvas.scale(max, max);
                z11 = true;
                u9Var = saVar.w1;
                if (u9Var != null) {
                    ra raVar = u9Var.w1;
                    float[] fArr = u9Var.T1;
                    if (u9Var.N1) {
                        u9Var.N1 = r11;
                        if (u9Var.J1 != null && (s1Var = u9Var.K1) != null) {
                            fArr[r11] = s1Var.getMeasuredWidth() / 2.0f;
                            fArr[1] = u9Var.K1.getMeasuredHeight() / 2.0f;
                            u9Var.K1.getMatrix().mapPoints(fArr);
                            f10 = 1.0f;
                            float scaleX = fArr[1] - (u9Var.K1.getScaleX() * (u9Var.K1.getMeasuredHeight() / 2.0f));
                            f11 = 0.0f;
                            float scaleX2 = (u9Var.K1.getScaleX() * (u9Var.K1.getMeasuredHeight() / 2.0f)) + fArr[1];
                            if (scaleX < org.telegram.messenger.g0.L(120.0f) && scaleX2 > raVar.getMeasuredHeight() - org.telegram.messenger.g0.L(200.0f)) {
                                u9Var.J1.setTop((boolean) r11);
                                u9Var.J1.setTranslationY(org.telegram.messenger.g0.L(16.0f) + (org.telegram.messenger.g0.L(120.0f) - u9Var.J1.getMeasuredHeight()));
                            } else if (scaleX < org.telegram.messenger.g0.L(120.0f)) {
                                u9Var.J1.setTop(true);
                                u9Var.J1.setTranslationY((u9Var.K1.getScaleX() * (u9Var.K1.getMeasuredHeight() / 2.0f)) + fArr[1]);
                            } else {
                                u9Var.J1.setTop((boolean) r11);
                                u9Var.J1.setTranslationY((scaleX - r7.getMeasuredHeight()) + org.telegram.messenger.g0.L(16.0f));
                            }
                            if (fArr[r11] < u9Var.getMeasuredWidth() / 2.0f) {
                                u9Var.J1.setMirrorX(true);
                                float measuredWidth = ((u9Var.J1.getMeasuredWidth() / 2.0f) + u9Var.J1.getX()) - (fArr[r11] - (u9Var.K1.getMeasuredHeight() / 2.0f));
                                if (measuredWidth > 0.0f) {
                                    u9Var.J1.setBubbleOffset(((r4.getMeasuredWidth() / 2.0f) - measuredWidth) / 2.0f);
                                }
                            } else {
                                float measuredWidth2 = ((u9Var.J1.getMeasuredWidth() / 2.0f) + u9Var.J1.getX()) - ((u9Var.K1.getMeasuredHeight() / 2.0f) + fArr[r11]);
                                if (measuredWidth2 < 0.0f) {
                                    u9Var.J1.setBubbleOffset((-((r4.getMeasuredWidth() / 2.0f) + measuredWidth2)) / 2.0f);
                                }
                                u9Var.J1.setMirrorX(r11);
                            }
                            u9Var.J1.setTranslationX((raVar.getMeasuredWidth() - u9Var.J1.getMeasuredWidth()) / 2.0f);
                            super.dispatchDraw(canvas);
                            if (z11) {
                                canvas.restore();
                                canvas.restore();
                                if (saVar.G != null) {
                                    float i10 = Utilities.i(f10 - (saVar.J * 1.5f), f10, f11);
                                    rectF3.centerX();
                                    rectF3.centerY();
                                    Math.min(rectF3.width(), rectF3.height());
                                    na naVar = saVar.G;
                                    ImageReceiver imageReceiver = naVar.e;
                                    if (imageReceiver != null) {
                                        imageReceiver.A0(rectF3);
                                        ImageReceiver imageReceiver2 = saVar.G.e;
                                        int i11 = imageReceiver2.X0[r11];
                                        imageReceiver2.J0((int) T1);
                                        saVar.G.e.setAlpha(i10);
                                        saVar.G.e.h(canvas, null);
                                        saVar.G.e.J0(i11);
                                    } else {
                                        org.telegram.ui.Cells.d7 d7Var = naVar.d;
                                        if (d7Var != null) {
                                            d7Var.setBounds((int) rectF3.left, (int) rectF3.top, (int) rectF3.right, (int) rectF3.bottom);
                                            org.telegram.ui.Cells.d7 d7Var2 = saVar.G.d;
                                            d7Var2.g = (int) com.google.android.gms.internal.vision.e2.D(i10, 255.0f, i10, i10);
                                            d7Var2.draw(canvas);
                                        }
                                    }
                                    saVar.G.getClass();
                                    canvas.save();
                                    canvas.translate(rectF.left, rectF.top);
                                    saVar.G.a(canvas, i10);
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
                    saVar.j();
                    z10 = z12;
                }
            }
        } else {
            z10 = false;
        }
        z11 = z10 ? 1 : 0;
        r11 = z10;
        u9Var = saVar.w1;
        if (u9Var != null) {
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
        sa saVar = this.o0;
        a0 a0Var = saVar.J0;
        if (a0Var != null && a0Var.e) {
            float y10 = saVar.J0.getY() + saVar.j0.getY() + saVar.r.getY();
            if ((motionEvent.getY() >= y10 && motionEvent.getY() <= y10 + saVar.J0.getHeight()) || this.j0) {
                if (motionEvent.getAction() != 1 && motionEvent.getAction() != 3) {
                    z10 = true;
                }
                this.j0 = z10;
                return super.dispatchTouchEvent(motionEvent);
            }
            saVar.J0.a(false, true);
            saVar.l0(true);
        }
        if (this.j0 && (motionEvent.getAction() == 1 || motionEvent.getAction() == 3)) {
            this.j0 = false;
        }
        this.h0.onTouchEvent(motionEvent);
        this.g0.w0(motionEvent);
        if (motionEvent.getAction() == 1 && !this.i0) {
            if (saVar.r.getTranslationY() <= 0.0f) {
                g3 g3Var = saVar.N0;
                if (g3Var != null && g3Var.getTranslationY() > 0.0f && !saVar.M0) {
                    saVar.e(!saVar.R1 && saVar.N0.getTranslationY() < ((float) saVar.N0.getPadding()));
                }
            } else if (saVar.L > 0.4f) {
                saVar.p(true);
            } else {
                sa.b(saVar);
            }
            saVar.M0 = false;
            saVar.X = false;
            saVar.Y = false;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // org.telegram.ui.Components.du0
    public int getBottomPadding() {
        int height = getHeight();
        sa saVar = this.o0;
        return (height - saVar.r.getBottom()) + saVar.V;
    }

    public int getBottomPadding2() {
        return getHeight() - this.o0.r.getBottom();
    }

    public int getPaddingUnderContainer() {
        int height = getHeight();
        sa saVar = this.o0;
        return (height - saVar.c0) - saVar.r.getBottom();
    }

    @Override // org.telegram.ui.Components.du0, android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i7, int i10, int i11, int i12) {
        int i13;
        ty emojiView;
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        sa saVar = this.o0;
        int i14 = saVar.a0;
        int measuredHeight2 = saVar.n0.getMeasuredHeight();
        if (saVar.W) {
            i14 = 0;
        }
        int i15 = saVar.T;
        int b10 = c8.l9.b((measuredWidth - i15) / 2, saVar.Z, (measuredWidth - saVar.b0) - i15);
        int i16 = saVar.T + b10;
        if (saVar.W) {
            i13 = saVar.U;
        } else {
            int i17 = saVar.c0;
            int i18 = saVar.U;
            int i19 = (((((measuredHeight - i14) - i17) - i18) - measuredHeight2) / 2) + i14;
            if (saVar.K == 1) {
                float f10 = saVar.I.top;
                if (i18 + f10 + measuredHeight2 < measuredHeight - i17) {
                    i14 = (int) f10;
                    i13 = saVar.U;
                }
            }
            if (i19 - i14 >= org.telegram.messenger.g0.L(40.0f)) {
                i14 = i19;
            }
            i13 = saVar.U;
        }
        saVar.r.layout(b10, i14, i16, i13 + i14 + measuredHeight2);
        saVar.s.b.layout(0, 0, measuredWidth, measuredHeight);
        aa aaVar = saVar.D2;
        if (aaVar != null) {
            aaVar.layout(0, 0, measuredWidth, measuredHeight);
        }
        g3 g3Var = saVar.N0;
        if (g3Var != null) {
            g3Var.layout((measuredWidth - g3Var.getMeasuredWidth()) / 2, 0, (saVar.N0.getMeasuredWidth() + measuredWidth) / 2, measuredHeight);
        }
        ia iaVar = saVar.d1;
        if (iaVar != null && (emojiView = iaVar.f.getEmojiView()) != null) {
            emojiView.layout(saVar.Z, (measuredHeight - saVar.c0) - emojiView.getMeasuredHeight(), measuredWidth - saVar.b0, measuredHeight - saVar.c0);
        }
        u9 u9Var = saVar.w1;
        if (u9Var != null) {
            ty tyVar = u9Var.Z1;
            if (tyVar != null) {
                tyVar.layout(saVar.Z, (measuredHeight - saVar.c0) - tyVar.getMeasuredHeight(), measuredWidth - saVar.b0, measuredHeight - saVar.c0);
            }
            xi0 xi0Var = saVar.w1.J1;
            if (xi0Var != null) {
                int i20 = saVar.Z;
                xi0Var.layout(i20, saVar.a0, xi0Var.getMeasuredWidth() + i20, saVar.w1.J1.getMeasuredHeight() + saVar.a0);
                ai.l0 l0Var = saVar.w1.J1.getReactionsWindow() != null ? saVar.w1.J1.getReactionsWindow().c : null;
                if (l0Var != null) {
                    int i21 = saVar.Z;
                    l0Var.layout(i21, saVar.a0, l0Var.getMeasuredWidth() + i21, l0Var.getMeasuredHeight() + saVar.a0);
                }
            }
        }
        ca caVar = saVar.s1;
        if (caVar != null) {
            caVar.e.setPadding(0, saVar.a0, 0, saVar.c0);
            saVar.s1.layout(0, 0, measuredWidth, measuredHeight);
            saVar.s1.d.layout(0, 0, measuredWidth, measuredHeight);
        }
        da daVar = saVar.t1;
        if (daVar != null) {
            daVar.f.setPadding(0, saVar.a0, 0, saVar.c0);
            saVar.t1.layout(0, 0, measuredWidth, measuredHeight);
            saVar.t1.e.layout(0, 0, measuredWidth, measuredHeight);
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
        sa saVar = this.o0;
        int i11 = (size - saVar.Z) - saVar.b0;
        int i12 = saVar.a0;
        int i13 = saVar.c0;
        int ceil = (int) Math.ceil((i11 / 9.0f) * 16.0f);
        int L = org.telegram.messenger.g0.L(48.0f);
        saVar.V = L;
        int i14 = ceil + L;
        int i15 = size2 - i13;
        if (i14 <= i15) {
            saVar.T = i11;
            saVar.U = ceil;
            saVar.W = i14 > i15 - i12;
        } else {
            saVar.W = false;
            saVar.U = ((size2 - L) - i13) - i12;
            saVar.T = (int) Math.ceil((r9 * 9.0f) / 16.0f);
        }
        saVar.V = Utilities.j((size2 - saVar.U) - (saVar.W ? 0 : i12), org.telegram.messenger.g0.L(68.0f), org.telegram.messenger.g0.L(48.0f));
        int systemUiVisibility = getSystemUiVisibility();
        setSystemUiVisibility(saVar.W ? systemUiVisibility | 4 : systemUiVisibility & (-5));
        saVar.r.measure(View.MeasureSpec.makeMeasureSpec(saVar.T, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(saVar.U + saVar.V, TLObject.FLAG_30));
        saVar.s.b.measure(View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(size2, TLObject.FLAG_30));
        aa aaVar = saVar.D2;
        if (aaVar != null) {
            aaVar.measure(View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(size2, TLObject.FLAG_30));
        }
        g3 g3Var = saVar.N0;
        if (g3Var != null) {
            g3Var.measure(View.MeasureSpec.makeMeasureSpec(saVar.T, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(size2, TLObject.FLAG_30));
        }
        ia iaVar = saVar.d1;
        if (iaVar != null) {
            ty emojiView = iaVar.f.getEmojiView();
            Q();
            org.telegram.messenger.g0.L(20.0f);
            if (emojiView != null) {
                emojiView.measure(View.MeasureSpec.makeMeasureSpec(i11, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(emojiView.getLayoutParams().height, TLObject.FLAG_30));
            }
        }
        u9 u9Var = saVar.w1;
        if (u9Var != null) {
            ty tyVar = u9Var.Z1;
            if (tyVar != null) {
                tyVar.measure(View.MeasureSpec.makeMeasureSpec(i11, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(saVar.w1.Z1.getLayoutParams().height, TLObject.FLAG_30));
            }
            xi0 xi0Var = saVar.w1.J1;
            if (xi0Var != null) {
                measureChild(xi0Var, i7, i10);
                if (saVar.w1.J1.getReactionsWindow() != null) {
                    measureChild(saVar.w1.J1.getReactionsWindow().c, i7, i10);
                }
            }
        }
        for (int i16 = 0; i16 < getChildCount(); i16++) {
            View childAt = getChildAt(i16);
            if (childAt instanceof u0) {
                childAt.measure(View.MeasureSpec.makeMeasureSpec(i11, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(size2, TLObject.FLAG_30));
            } else if (childAt instanceof org.telegram.ui.Components.za) {
                childAt.measure(View.MeasureSpec.makeMeasureSpec(i11, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(Math.min(org.telegram.messenger.g0.L(340.0f), size2 - (saVar.W ? 0 : i12)), TLObject.FLAG_30));
            }
        }
        ca caVar = saVar.s1;
        if (caVar != null) {
            caVar.measure(View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(size2, TLObject.FLAG_30));
            saVar.s1.d.measure(View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(size2, TLObject.FLAG_30));
        }
        da daVar = saVar.t1;
        if (daVar != null) {
            daVar.measure(View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(size2, TLObject.FLAG_30));
            saVar.t1.e.measure(View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(size2, TLObject.FLAG_30));
        }
        setMeasuredDimension(size, size2);
    }
}
