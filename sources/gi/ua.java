package gi;

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
import b8.be;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.Components.ey;
import org.telegram.ui.Components.li0;
import org.telegram.ui.Components.qt0;
import org.telegram.ui.Components.x00;
import org.telegram.ui.Components.y00;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class ua extends qt0 {
    public final y00 g0;
    public final ScaleGestureDetector h0;
    public boolean i0;
    public boolean j0;
    public boolean k0;
    public float l0;
    public float m0;
    public float n0;
    public final /* synthetic */ va o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ua(va vaVar, Activity activity) {
        super(activity, null);
        this.o0 = vaVar;
        this.k0 = false;
        this.g0 = new y00((Context) activity, (x00) new sa(this));
        this.h0 = new ScaleGestureDetector(activity, new ta(this));
    }

    public final void X(float f10, Bitmap bitmap) {
        Canvas canvas = new Canvas(bitmap);
        canvas.drawColor(-16777216);
        float width = bitmap.getWidth();
        va vaVar = this.o0;
        float width2 = width / vaVar.n.getWidth();
        canvas.scale(width2, width2);
        TextureView textureView = vaVar.Y0.getTextureView();
        if (textureView == null) {
            textureView = vaVar.Y0.r;
        }
        if (textureView != null) {
            canvas.save();
            canvas.translate(vaVar.i0.getX() + vaVar.r.getX(), vaVar.i0.getY() + vaVar.r.getY());
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
        canvas.translate(vaVar.r.getX(), vaVar.r.getY());
        for (int i3 = 0; i3 < vaVar.r.getChildCount(); i3++) {
            View childAt = vaVar.r.getChildAt(i3);
            canvas.save();
            canvas.translate(childAt.getX(), childAt.getY());
            if (childAt.getVisibility() == 0) {
                if (childAt == vaVar.i0) {
                    for (int i10 = 0; i10 < vaVar.i0.getChildCount(); i10++) {
                        View childAt2 = vaVar.i0.getChildAt(i10);
                        if (childAt2 != vaVar.Y0 && childAt2 != vaVar.C0 && childAt2.getVisibility() == 0) {
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
    @Override // org.telegram.ui.Components.qt0, android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void dispatchDraw(Canvas canvas) {
        boolean z10;
        boolean z11;
        ?? r11;
        x9 x9Var;
        float f10;
        float f11;
        ug.q1 q1Var;
        va vaVar = this.o0;
        RectF rectF = vaVar.I;
        Path path = vaVar.f0;
        RectF rectF2 = vaVar.e0;
        RectF rectF3 = vaVar.d0;
        Float f12 = vaVar.M;
        float floatValue = f12 != null ? f12.floatValue() : vaVar.L;
        if (vaVar.K == 0) {
            canvas.drawColor(i0.a.o(-16777216, (int) ((1.0f - floatValue) * vaVar.J * 255.0f)));
        }
        float T1 = org.telegram.messenger.g0.T1(vaVar.H, 0.0f, vaVar.J);
        if (vaVar.J != 1.0f) {
            int i3 = vaVar.K;
            if (i3 == 0) {
                rectF2.set(0.0f, 0.0f, getWidth(), getHeight());
                rectF2.offset(vaVar.r.getTranslationX(), vaVar.r.getTranslationY());
                org.telegram.messenger.g0.Z1(rectF, rectF2, vaVar.J, rectF3);
                canvas.save();
                path.rewind();
                path.addRoundRect(rectF3, T1, T1, Path.Direction.CW);
                canvas.clipPath(path);
                r11 = 0;
                canvas.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), (int) (Utilities.i(vaVar.J * 3.0f, 1.0f, 0.0f) * 255.0f), 31);
                canvas.translate(rectF3.left, rectF3.top - (vaVar.r.getTranslationY() * vaVar.J));
                float max = Math.max(rectF3.width() / getWidth(), rectF3.height() / getHeight());
                canvas.scale(max, max);
                z11 = true;
                x9Var = vaVar.w1;
                if (x9Var != null) {
                    ua uaVar = x9Var.w1;
                    float[] fArr = x9Var.T1;
                    if (x9Var.N1) {
                        x9Var.N1 = r11;
                        if (x9Var.J1 != null && (q1Var = x9Var.K1) != null) {
                            fArr[r11] = q1Var.getMeasuredWidth() / 2.0f;
                            fArr[1] = x9Var.K1.getMeasuredHeight() / 2.0f;
                            x9Var.K1.getMatrix().mapPoints(fArr);
                            f10 = 1.0f;
                            float scaleX = fArr[1] - (x9Var.K1.getScaleX() * (x9Var.K1.getMeasuredHeight() / 2.0f));
                            f11 = 0.0f;
                            float scaleX2 = (x9Var.K1.getScaleX() * (x9Var.K1.getMeasuredHeight() / 2.0f)) + fArr[1];
                            if (scaleX < org.telegram.messenger.g0.L(120.0f) && scaleX2 > uaVar.getMeasuredHeight() - org.telegram.messenger.g0.L(200.0f)) {
                                x9Var.J1.setTop((boolean) r11);
                                x9Var.J1.setTranslationY(org.telegram.messenger.g0.L(16.0f) + (org.telegram.messenger.g0.L(120.0f) - x9Var.J1.getMeasuredHeight()));
                            } else if (scaleX < org.telegram.messenger.g0.L(120.0f)) {
                                x9Var.J1.setTop(true);
                                x9Var.J1.setTranslationY((x9Var.K1.getScaleX() * (x9Var.K1.getMeasuredHeight() / 2.0f)) + fArr[1]);
                            } else {
                                x9Var.J1.setTop((boolean) r11);
                                x9Var.J1.setTranslationY((scaleX - r7.getMeasuredHeight()) + org.telegram.messenger.g0.L(16.0f));
                            }
                            if (fArr[r11] < x9Var.getMeasuredWidth() / 2.0f) {
                                x9Var.J1.setMirrorX(true);
                                float measuredWidth = ((x9Var.J1.getMeasuredWidth() / 2.0f) + x9Var.J1.getX()) - (fArr[r11] - (x9Var.K1.getMeasuredHeight() / 2.0f));
                                if (measuredWidth > 0.0f) {
                                    x9Var.J1.setBubbleOffset(((r4.getMeasuredWidth() / 2.0f) - measuredWidth) / 2.0f);
                                }
                            } else {
                                float measuredWidth2 = ((x9Var.J1.getMeasuredWidth() / 2.0f) + x9Var.J1.getX()) - ((x9Var.K1.getMeasuredHeight() / 2.0f) + fArr[r11]);
                                if (measuredWidth2 < 0.0f) {
                                    x9Var.J1.setBubbleOffset((-((r4.getMeasuredWidth() / 2.0f) + measuredWidth2)) / 2.0f);
                                }
                                x9Var.J1.setMirrorX(r11);
                            }
                            x9Var.J1.setTranslationX((uaVar.getMeasuredWidth() - x9Var.J1.getMeasuredWidth()) / 2.0f);
                            super.dispatchDraw(canvas);
                            if (z11) {
                                canvas.restore();
                                canvas.restore();
                                if (vaVar.G != null) {
                                    float i10 = Utilities.i(f10 - (vaVar.J * 1.5f), f10, f11);
                                    rectF3.centerX();
                                    rectF3.centerY();
                                    Math.min(rectF3.width(), rectF3.height());
                                    qa qaVar = vaVar.G;
                                    ImageReceiver imageReceiver = qaVar.e;
                                    if (imageReceiver != null) {
                                        imageReceiver.A0(rectF3);
                                        ImageReceiver imageReceiver2 = vaVar.G.e;
                                        int i11 = imageReceiver2.X0[r11];
                                        imageReceiver2.J0((int) T1);
                                        vaVar.G.e.setAlpha(i10);
                                        vaVar.G.e.h(canvas, null);
                                        vaVar.G.e.J0(i11);
                                    } else {
                                        org.telegram.ui.Cells.b7 b7Var = qaVar.d;
                                        if (b7Var != null) {
                                            b7Var.setBounds((int) rectF3.left, (int) rectF3.top, (int) rectF3.right, (int) rectF3.bottom);
                                            org.telegram.ui.Cells.b7 b7Var2 = vaVar.G.d;
                                            b7Var2.g = (int) com.google.android.recaptcha.internal.a.C(i10, 255.0f, i10, i10);
                                            b7Var2.draw(canvas);
                                        }
                                    }
                                    vaVar.G.getClass();
                                    canvas.save();
                                    canvas.translate(rectF.left, rectF.top);
                                    vaVar.G.a(canvas, i10);
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
                if (i3 == 1) {
                    vaVar.j();
                    z10 = z12;
                }
            }
        } else {
            z10 = false;
        }
        z11 = z10 ? 1 : 0;
        r11 = z10;
        x9Var = vaVar.w1;
        if (x9Var != null) {
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
        va vaVar = this.o0;
        y yVar = vaVar.J0;
        if (yVar != null && yVar.e) {
            float y9 = vaVar.J0.getY() + vaVar.j0.getY() + vaVar.r.getY();
            if ((motionEvent.getY() >= y9 && motionEvent.getY() <= y9 + vaVar.J0.getHeight()) || this.j0) {
                if (motionEvent.getAction() != 1 && motionEvent.getAction() != 3) {
                    z10 = true;
                }
                this.j0 = z10;
                return super.dispatchTouchEvent(motionEvent);
            }
            vaVar.J0.a(false, true);
            vaVar.l0(true);
        }
        if (this.j0 && (motionEvent.getAction() == 1 || motionEvent.getAction() == 3)) {
            this.j0 = false;
        }
        this.h0.onTouchEvent(motionEvent);
        this.g0.y(motionEvent);
        if (motionEvent.getAction() == 1 && !this.i0) {
            if (vaVar.r.getTranslationY() <= 0.0f) {
                g3 g3Var = vaVar.N0;
                if (g3Var != null && g3Var.getTranslationY() > 0.0f && !vaVar.M0) {
                    vaVar.e(!vaVar.R1 && vaVar.N0.getTranslationY() < ((float) vaVar.N0.getPadding()));
                }
            } else if (vaVar.L > 0.4f) {
                vaVar.p(true);
            } else {
                va.b(vaVar);
            }
            vaVar.M0 = false;
            vaVar.X = false;
            vaVar.Y = false;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // org.telegram.ui.Components.qt0
    public int getBottomPadding() {
        int height = getHeight();
        va vaVar = this.o0;
        return (height - vaVar.r.getBottom()) + vaVar.V;
    }

    public int getBottomPadding2() {
        return getHeight() - this.o0.r.getBottom();
    }

    public int getPaddingUnderContainer() {
        int height = getHeight();
        va vaVar = this.o0;
        return (height - vaVar.c0) - vaVar.r.getBottom();
    }

    @Override // org.telegram.ui.Components.qt0, android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i3, int i10, int i11, int i12) {
        int i13;
        ey emojiView;
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        va vaVar = this.o0;
        int i14 = vaVar.a0;
        int measuredHeight2 = vaVar.n0.getMeasuredHeight();
        if (vaVar.W) {
            i14 = 0;
        }
        int i15 = vaVar.T;
        int b10 = be.b((measuredWidth - i15) / 2, vaVar.Z, (measuredWidth - vaVar.b0) - i15);
        int i16 = vaVar.T + b10;
        if (vaVar.W) {
            i13 = vaVar.U;
        } else {
            int i17 = vaVar.c0;
            int i18 = vaVar.U;
            int i19 = (((((measuredHeight - i14) - i17) - i18) - measuredHeight2) / 2) + i14;
            if (vaVar.K == 1) {
                float f10 = vaVar.I.top;
                if (i18 + f10 + measuredHeight2 < measuredHeight - i17) {
                    i14 = (int) f10;
                    i13 = vaVar.U;
                }
            }
            if (i19 - i14 >= org.telegram.messenger.g0.L(40.0f)) {
                i14 = i19;
            }
            i13 = vaVar.U;
        }
        vaVar.r.layout(b10, i14, i16, i13 + i14 + measuredHeight2);
        vaVar.s.b.layout(0, 0, measuredWidth, measuredHeight);
        da daVar = vaVar.D2;
        if (daVar != null) {
            daVar.layout(0, 0, measuredWidth, measuredHeight);
        }
        g3 g3Var = vaVar.N0;
        if (g3Var != null) {
            g3Var.layout((measuredWidth - g3Var.getMeasuredWidth()) / 2, 0, (vaVar.N0.getMeasuredWidth() + measuredWidth) / 2, measuredHeight);
        }
        la laVar = vaVar.d1;
        if (laVar != null && (emojiView = laVar.f.getEmojiView()) != null) {
            emojiView.layout(vaVar.Z, (measuredHeight - vaVar.c0) - emojiView.getMeasuredHeight(), measuredWidth - vaVar.b0, measuredHeight - vaVar.c0);
        }
        x9 x9Var = vaVar.w1;
        if (x9Var != null) {
            ey eyVar = x9Var.Z1;
            if (eyVar != null) {
                eyVar.layout(vaVar.Z, (measuredHeight - vaVar.c0) - eyVar.getMeasuredHeight(), measuredWidth - vaVar.b0, measuredHeight - vaVar.c0);
            }
            li0 li0Var = vaVar.w1.J1;
            if (li0Var != null) {
                int i20 = vaVar.Z;
                li0Var.layout(i20, vaVar.a0, li0Var.getMeasuredWidth() + i20, vaVar.w1.J1.getMeasuredHeight() + vaVar.a0);
                ai.c0 c0Var = vaVar.w1.J1.getReactionsWindow() != null ? vaVar.w1.J1.getReactionsWindow().c : null;
                if (c0Var != null) {
                    int i21 = vaVar.Z;
                    c0Var.layout(i21, vaVar.a0, c0Var.getMeasuredWidth() + i21, c0Var.getMeasuredHeight() + vaVar.a0);
                }
            }
        }
        fa faVar = vaVar.s1;
        if (faVar != null) {
            faVar.e.setPadding(0, vaVar.a0, 0, vaVar.c0);
            vaVar.s1.layout(0, 0, measuredWidth, measuredHeight);
            vaVar.s1.d.layout(0, 0, measuredWidth, measuredHeight);
        }
        ga gaVar = vaVar.t1;
        if (gaVar != null) {
            gaVar.f.setPadding(0, vaVar.a0, 0, vaVar.c0);
            vaVar.t1.layout(0, 0, measuredWidth, measuredHeight);
            vaVar.t1.e.layout(0, 0, measuredWidth, measuredHeight);
        }
        for (int i22 = 0; i22 < getChildCount(); i22++) {
            View childAt = getChildAt(i22);
            if (childAt instanceof s0) {
                childAt.layout(0, 0, measuredWidth, measuredHeight);
            } else if (childAt instanceof org.telegram.ui.Components.ta) {
                childAt.layout(0, i14, childAt.getMeasuredWidth(), childAt.getMeasuredHeight() + i14);
            }
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i3, int i10) {
        int size = View.MeasureSpec.getSize(i3);
        int size2 = View.MeasureSpec.getSize(i10);
        va vaVar = this.o0;
        int i11 = (size - vaVar.Z) - vaVar.b0;
        int i12 = vaVar.a0;
        int i13 = vaVar.c0;
        int ceil = (int) Math.ceil((i11 / 9.0f) * 16.0f);
        int L = org.telegram.messenger.g0.L(48.0f);
        vaVar.V = L;
        int i14 = ceil + L;
        int i15 = size2 - i13;
        if (i14 <= i15) {
            vaVar.T = i11;
            vaVar.U = ceil;
            vaVar.W = i14 > i15 - i12;
        } else {
            vaVar.W = false;
            vaVar.U = ((size2 - L) - i13) - i12;
            vaVar.T = (int) Math.ceil((r9 * 9.0f) / 16.0f);
        }
        vaVar.V = Utilities.j((size2 - vaVar.U) - (vaVar.W ? 0 : i12), org.telegram.messenger.g0.L(68.0f), org.telegram.messenger.g0.L(48.0f));
        int systemUiVisibility = getSystemUiVisibility();
        setSystemUiVisibility(vaVar.W ? systemUiVisibility | 4 : systemUiVisibility & (-5));
        vaVar.r.measure(View.MeasureSpec.makeMeasureSpec(vaVar.T, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(vaVar.U + vaVar.V, TLObject.FLAG_30));
        vaVar.s.b.measure(View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(size2, TLObject.FLAG_30));
        da daVar = vaVar.D2;
        if (daVar != null) {
            daVar.measure(View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(size2, TLObject.FLAG_30));
        }
        g3 g3Var = vaVar.N0;
        if (g3Var != null) {
            g3Var.measure(View.MeasureSpec.makeMeasureSpec(vaVar.T, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(size2, TLObject.FLAG_30));
        }
        la laVar = vaVar.d1;
        if (laVar != null) {
            ey emojiView = laVar.f.getEmojiView();
            Q();
            org.telegram.messenger.g0.L(20.0f);
            if (emojiView != null) {
                emojiView.measure(View.MeasureSpec.makeMeasureSpec(i11, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(emojiView.getLayoutParams().height, TLObject.FLAG_30));
            }
        }
        x9 x9Var = vaVar.w1;
        if (x9Var != null) {
            ey eyVar = x9Var.Z1;
            if (eyVar != null) {
                eyVar.measure(View.MeasureSpec.makeMeasureSpec(i11, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(vaVar.w1.Z1.getLayoutParams().height, TLObject.FLAG_30));
            }
            li0 li0Var = vaVar.w1.J1;
            if (li0Var != null) {
                measureChild(li0Var, i3, i10);
                if (vaVar.w1.J1.getReactionsWindow() != null) {
                    measureChild(vaVar.w1.J1.getReactionsWindow().c, i3, i10);
                }
            }
        }
        for (int i16 = 0; i16 < getChildCount(); i16++) {
            View childAt = getChildAt(i16);
            if (childAt instanceof s0) {
                childAt.measure(View.MeasureSpec.makeMeasureSpec(i11, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(size2, TLObject.FLAG_30));
            } else if (childAt instanceof org.telegram.ui.Components.ta) {
                childAt.measure(View.MeasureSpec.makeMeasureSpec(i11, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(Math.min(org.telegram.messenger.g0.L(340.0f), size2 - (vaVar.W ? 0 : i12)), TLObject.FLAG_30));
            }
        }
        fa faVar = vaVar.s1;
        if (faVar != null) {
            faVar.measure(View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(size2, TLObject.FLAG_30));
            vaVar.s1.d.measure(View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(size2, TLObject.FLAG_30));
        }
        ga gaVar = vaVar.t1;
        if (gaVar != null) {
            gaVar.measure(View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(size2, TLObject.FLAG_30));
            vaVar.t1.e.measure(View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(size2, TLObject.FLAG_30));
        }
        setMeasuredDimension(size, size2);
    }
}
