package fi;

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
import org.telegram.ui.Components.gy;
import org.telegram.ui.Components.ii0;
import org.telegram.ui.Components.qt;
import org.telegram.ui.Components.rt0;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes3.dex */
public final class ua extends rt0 {
    public final qt f0;
    public final ScaleGestureDetector g0;
    public boolean h0;
    public boolean i0;
    public boolean j0;
    public float k0;
    public float l0;
    public float m0;
    public final /* synthetic */ va n0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ua(va vaVar, Activity activity) {
        super(activity, null);
        this.n0 = vaVar;
        this.j0 = false;
        this.f0 = new qt(activity, new sa(this));
        this.g0 = new ScaleGestureDetector(activity, new ta(this));
    }

    public final void X(float f10, Bitmap bitmap) {
        Canvas canvas = new Canvas(bitmap);
        canvas.drawColor(-16777216);
        float width = bitmap.getWidth();
        va vaVar = this.n0;
        float width2 = width / vaVar.n.getWidth();
        canvas.scale(width2, width2);
        TextureView textureView = vaVar.X0.getTextureView();
        if (textureView == null) {
            textureView = vaVar.X0.r;
        }
        if (textureView != null) {
            canvas.save();
            canvas.translate(vaVar.h0.getX() + vaVar.r.getX(), vaVar.h0.getY() + vaVar.r.getY());
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
        for (int i7 = 0; i7 < vaVar.r.getChildCount(); i7++) {
            View childAt = vaVar.r.getChildAt(i7);
            canvas.save();
            canvas.translate(childAt.getX(), childAt.getY());
            if (childAt.getVisibility() == 0) {
                if (childAt == vaVar.h0) {
                    for (int i10 = 0; i10 < vaVar.h0.getChildCount(); i10++) {
                        View childAt2 = vaVar.h0.getChildAt(i10);
                        if (childAt2 != vaVar.X0 && childAt2 != vaVar.B0 && childAt2.getVisibility() == 0) {
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
    @Override // org.telegram.ui.Components.rt0, android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void dispatchDraw(Canvas canvas) {
        boolean z9;
        boolean z10;
        ?? r11;
        x9 x9Var;
        float f10;
        float f11;
        tg.q1 q1Var;
        va vaVar = this.n0;
        RectF rectF = vaVar.H;
        Path path = vaVar.e0;
        RectF rectF2 = vaVar.d0;
        RectF rectF3 = vaVar.c0;
        Float f12 = vaVar.L;
        float floatValue = f12 != null ? f12.floatValue() : vaVar.K;
        if (vaVar.J == 0) {
            canvas.drawColor(i0.a.o(-16777216, (int) ((1.0f - floatValue) * vaVar.I * 255.0f)));
        }
        float T1 = org.telegram.messenger.g0.T1(vaVar.G, 0.0f, vaVar.I);
        if (vaVar.I != 1.0f) {
            int i7 = vaVar.J;
            if (i7 == 0) {
                rectF2.set(0.0f, 0.0f, getWidth(), getHeight());
                rectF2.offset(vaVar.r.getTranslationX(), vaVar.r.getTranslationY());
                org.telegram.messenger.g0.Z1(rectF, rectF2, vaVar.I, rectF3);
                canvas.save();
                path.rewind();
                path.addRoundRect(rectF3, T1, T1, Path.Direction.CW);
                canvas.clipPath(path);
                r11 = 0;
                canvas.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), (int) (Utilities.i(vaVar.I * 3.0f, 1.0f, 0.0f) * 255.0f), 31);
                canvas.translate(rectF3.left, rectF3.top - (vaVar.r.getTranslationY() * vaVar.I));
                float max = Math.max(rectF3.width() / getWidth(), rectF3.height() / getHeight());
                canvas.scale(max, max);
                z10 = true;
                x9Var = vaVar.v1;
                if (x9Var != null) {
                    ua uaVar = x9Var.v1;
                    float[] fArr = x9Var.S1;
                    if (x9Var.M1) {
                        x9Var.M1 = r11;
                        if (x9Var.I1 != null && (q1Var = x9Var.J1) != null) {
                            fArr[r11] = q1Var.getMeasuredWidth() / 2.0f;
                            fArr[1] = x9Var.J1.getMeasuredHeight() / 2.0f;
                            x9Var.J1.getMatrix().mapPoints(fArr);
                            f10 = 1.0f;
                            float scaleX = fArr[1] - (x9Var.J1.getScaleX() * (x9Var.J1.getMeasuredHeight() / 2.0f));
                            f11 = 0.0f;
                            float scaleX2 = (x9Var.J1.getScaleX() * (x9Var.J1.getMeasuredHeight() / 2.0f)) + fArr[1];
                            if (scaleX < org.telegram.messenger.g0.L(120.0f) && scaleX2 > uaVar.getMeasuredHeight() - org.telegram.messenger.g0.L(200.0f)) {
                                x9Var.I1.setTop((boolean) r11);
                                x9Var.I1.setTranslationY(org.telegram.messenger.g0.L(16.0f) + (org.telegram.messenger.g0.L(120.0f) - x9Var.I1.getMeasuredHeight()));
                            } else if (scaleX < org.telegram.messenger.g0.L(120.0f)) {
                                x9Var.I1.setTop(true);
                                x9Var.I1.setTranslationY((x9Var.J1.getScaleX() * (x9Var.J1.getMeasuredHeight() / 2.0f)) + fArr[1]);
                            } else {
                                x9Var.I1.setTop((boolean) r11);
                                x9Var.I1.setTranslationY((scaleX - r7.getMeasuredHeight()) + org.telegram.messenger.g0.L(16.0f));
                            }
                            if (fArr[r11] < x9Var.getMeasuredWidth() / 2.0f) {
                                x9Var.I1.setMirrorX(true);
                                float measuredWidth = ((x9Var.I1.getMeasuredWidth() / 2.0f) + x9Var.I1.getX()) - (fArr[r11] - (x9Var.J1.getMeasuredHeight() / 2.0f));
                                if (measuredWidth > 0.0f) {
                                    x9Var.I1.setBubbleOffset(((r4.getMeasuredWidth() / 2.0f) - measuredWidth) / 2.0f);
                                }
                            } else {
                                float measuredWidth2 = ((x9Var.I1.getMeasuredWidth() / 2.0f) + x9Var.I1.getX()) - ((x9Var.J1.getMeasuredHeight() / 2.0f) + fArr[r11]);
                                if (measuredWidth2 < 0.0f) {
                                    x9Var.I1.setBubbleOffset((-((r4.getMeasuredWidth() / 2.0f) + measuredWidth2)) / 2.0f);
                                }
                                x9Var.I1.setMirrorX(r11);
                            }
                            x9Var.I1.setTranslationX((uaVar.getMeasuredWidth() - x9Var.I1.getMeasuredWidth()) / 2.0f);
                            super.dispatchDraw(canvas);
                            if (z10) {
                                canvas.restore();
                                canvas.restore();
                                if (vaVar.F != null) {
                                    float i10 = Utilities.i(f10 - (vaVar.I * 1.5f), f10, f11);
                                    rectF3.centerX();
                                    rectF3.centerY();
                                    Math.min(rectF3.width(), rectF3.height());
                                    qa qaVar = vaVar.F;
                                    ImageReceiver imageReceiver = qaVar.e;
                                    if (imageReceiver != null) {
                                        imageReceiver.A0(rectF3);
                                        ImageReceiver imageReceiver2 = vaVar.F.e;
                                        int i11 = imageReceiver2.W0[r11];
                                        imageReceiver2.J0((int) T1);
                                        vaVar.F.e.setAlpha(i10);
                                        vaVar.F.e.h(canvas, null);
                                        vaVar.F.e.J0(i11);
                                    } else {
                                        org.telegram.ui.Cells.c7 c7Var = qaVar.d;
                                        if (c7Var != null) {
                                            c7Var.setBounds((int) rectF3.left, (int) rectF3.top, (int) rectF3.right, (int) rectF3.bottom);
                                            org.telegram.ui.Cells.c7 c7Var2 = vaVar.F.d;
                                            c7Var2.g = (int) com.google.android.recaptcha.internal.a.D(i10, 255.0f, i10, i10);
                                            c7Var2.draw(canvas);
                                        }
                                    }
                                    vaVar.F.getClass();
                                    canvas.save();
                                    canvas.translate(rectF.left, rectF.top);
                                    vaVar.F.a(canvas, i10);
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
                if (z10) {
                }
            } else {
                boolean z11 = false;
                z9 = z11;
                if (i7 == 1) {
                    vaVar.j();
                    z9 = z11;
                }
            }
        } else {
            z9 = false;
        }
        z10 = z9 ? 1 : 0;
        r11 = z9;
        x9Var = vaVar.v1;
        if (x9Var != null) {
        }
        f10 = 1.0f;
        f11 = 0.0f;
        super.dispatchDraw(canvas);
        if (z10) {
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEventPreIme(KeyEvent keyEvent) {
        if (keyEvent == null || keyEvent.getKeyCode() != 4 || keyEvent.getAction() != 1) {
            return super.dispatchKeyEventPreIme(keyEvent);
        }
        this.n0.L();
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        boolean z9 = false;
        this.h0 = false;
        va vaVar = this.n0;
        y yVar = vaVar.I0;
        if (yVar != null && yVar.e) {
            float y10 = vaVar.I0.getY() + vaVar.i0.getY() + vaVar.r.getY();
            if ((motionEvent.getY() >= y10 && motionEvent.getY() <= y10 + vaVar.I0.getHeight()) || this.i0) {
                if (motionEvent.getAction() != 1 && motionEvent.getAction() != 3) {
                    z9 = true;
                }
                this.i0 = z9;
                return super.dispatchTouchEvent(motionEvent);
            }
            vaVar.I0.a(false, true);
            vaVar.l0(true);
        }
        if (this.i0 && (motionEvent.getAction() == 1 || motionEvent.getAction() == 3)) {
            this.i0 = false;
        }
        this.g0.onTouchEvent(motionEvent);
        this.f0.n0(motionEvent);
        if (motionEvent.getAction() == 1 && !this.h0) {
            if (vaVar.r.getTranslationY() <= 0.0f) {
                i3 i3Var = vaVar.M0;
                if (i3Var != null && i3Var.getTranslationY() > 0.0f && !vaVar.L0) {
                    vaVar.e(!vaVar.Q1 && vaVar.M0.getTranslationY() < ((float) vaVar.M0.getPadding()));
                }
            } else if (vaVar.K > 0.4f) {
                vaVar.p(true);
            } else {
                va.b(vaVar);
            }
            vaVar.L0 = false;
            vaVar.W = false;
            vaVar.X = false;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // org.telegram.ui.Components.rt0
    public int getBottomPadding() {
        int height = getHeight();
        va vaVar = this.n0;
        return (height - vaVar.r.getBottom()) + vaVar.U;
    }

    public int getBottomPadding2() {
        return getHeight() - this.n0.r.getBottom();
    }

    public int getPaddingUnderContainer() {
        int height = getHeight();
        va vaVar = this.n0;
        return (height - vaVar.b0) - vaVar.r.getBottom();
    }

    @Override // org.telegram.ui.Components.rt0, android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z9, int i7, int i10, int i11, int i12) {
        int i13;
        gy emojiView;
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        va vaVar = this.n0;
        int i14 = vaVar.Z;
        int measuredHeight2 = vaVar.m0.getMeasuredHeight();
        if (vaVar.V) {
            i14 = 0;
        }
        int i15 = vaVar.S;
        int b10 = c8.j9.b((measuredWidth - i15) / 2, vaVar.Y, (measuredWidth - vaVar.a0) - i15);
        int i16 = vaVar.S + b10;
        if (vaVar.V) {
            i13 = vaVar.T;
        } else {
            int i17 = vaVar.b0;
            int i18 = vaVar.T;
            int i19 = (((((measuredHeight - i14) - i17) - i18) - measuredHeight2) / 2) + i14;
            if (vaVar.J == 1) {
                float f10 = vaVar.H.top;
                if (i18 + f10 + measuredHeight2 < measuredHeight - i17) {
                    i14 = (int) f10;
                    i13 = vaVar.T;
                }
            }
            if (i19 - i14 >= org.telegram.messenger.g0.L(40.0f)) {
                i14 = i19;
            }
            i13 = vaVar.T;
        }
        vaVar.r.layout(b10, i14, i16, i13 + i14 + measuredHeight2);
        vaVar.s.b.layout(0, 0, measuredWidth, measuredHeight);
        da daVar = vaVar.C2;
        if (daVar != null) {
            daVar.layout(0, 0, measuredWidth, measuredHeight);
        }
        i3 i3Var = vaVar.M0;
        if (i3Var != null) {
            i3Var.layout((measuredWidth - i3Var.getMeasuredWidth()) / 2, 0, (vaVar.M0.getMeasuredWidth() + measuredWidth) / 2, measuredHeight);
        }
        la laVar = vaVar.c1;
        if (laVar != null && (emojiView = laVar.f.getEmojiView()) != null) {
            emojiView.layout(vaVar.Y, (measuredHeight - vaVar.b0) - emojiView.getMeasuredHeight(), measuredWidth - vaVar.a0, measuredHeight - vaVar.b0);
        }
        x9 x9Var = vaVar.v1;
        if (x9Var != null) {
            gy gyVar = x9Var.Y1;
            if (gyVar != null) {
                gyVar.layout(vaVar.Y, (measuredHeight - vaVar.b0) - gyVar.getMeasuredHeight(), measuredWidth - vaVar.a0, measuredHeight - vaVar.b0);
            }
            ii0 ii0Var = vaVar.v1.I1;
            if (ii0Var != null) {
                int i20 = vaVar.Y;
                ii0Var.layout(i20, vaVar.Z, ii0Var.getMeasuredWidth() + i20, vaVar.v1.I1.getMeasuredHeight() + vaVar.Z);
                bi.x5 x5Var = vaVar.v1.I1.getReactionsWindow() != null ? vaVar.v1.I1.getReactionsWindow().c : null;
                if (x5Var != null) {
                    int i21 = vaVar.Y;
                    x5Var.layout(i21, vaVar.Z, x5Var.getMeasuredWidth() + i21, x5Var.getMeasuredHeight() + vaVar.Z);
                }
            }
        }
        fa faVar = vaVar.r1;
        if (faVar != null) {
            faVar.e.setPadding(0, vaVar.Z, 0, vaVar.b0);
            vaVar.r1.layout(0, 0, measuredWidth, measuredHeight);
            vaVar.r1.d.layout(0, 0, measuredWidth, measuredHeight);
        }
        ga gaVar = vaVar.s1;
        if (gaVar != null) {
            gaVar.f.setPadding(0, vaVar.Z, 0, vaVar.b0);
            vaVar.s1.layout(0, 0, measuredWidth, measuredHeight);
            vaVar.s1.e.layout(0, 0, measuredWidth, measuredHeight);
        }
        for (int i22 = 0; i22 < getChildCount(); i22++) {
            View childAt = getChildAt(i22);
            if (childAt instanceof s0) {
                childAt.layout(0, 0, measuredWidth, measuredHeight);
            } else if (childAt instanceof org.telegram.ui.Components.ua) {
                childAt.layout(0, i14, childAt.getMeasuredWidth(), childAt.getMeasuredHeight() + i14);
            }
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i7, int i10) {
        int size = View.MeasureSpec.getSize(i7);
        int size2 = View.MeasureSpec.getSize(i10);
        va vaVar = this.n0;
        int i11 = (size - vaVar.Y) - vaVar.a0;
        int i12 = vaVar.Z;
        int i13 = vaVar.b0;
        int ceil = (int) Math.ceil((i11 / 9.0f) * 16.0f);
        int L = org.telegram.messenger.g0.L(48.0f);
        vaVar.U = L;
        int i14 = ceil + L;
        int i15 = size2 - i13;
        if (i14 <= i15) {
            vaVar.S = i11;
            vaVar.T = ceil;
            vaVar.V = i14 > i15 - i12;
        } else {
            vaVar.V = false;
            vaVar.T = ((size2 - L) - i13) - i12;
            vaVar.S = (int) Math.ceil((r9 * 9.0f) / 16.0f);
        }
        vaVar.U = Utilities.j((size2 - vaVar.T) - (vaVar.V ? 0 : i12), org.telegram.messenger.g0.L(68.0f), org.telegram.messenger.g0.L(48.0f));
        int systemUiVisibility = getSystemUiVisibility();
        setSystemUiVisibility(vaVar.V ? systemUiVisibility | 4 : systemUiVisibility & (-5));
        vaVar.r.measure(View.MeasureSpec.makeMeasureSpec(vaVar.S, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(vaVar.T + vaVar.U, TLObject.FLAG_30));
        vaVar.s.b.measure(View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(size2, TLObject.FLAG_30));
        da daVar = vaVar.C2;
        if (daVar != null) {
            daVar.measure(View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(size2, TLObject.FLAG_30));
        }
        i3 i3Var = vaVar.M0;
        if (i3Var != null) {
            i3Var.measure(View.MeasureSpec.makeMeasureSpec(vaVar.S, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(size2, TLObject.FLAG_30));
        }
        la laVar = vaVar.c1;
        if (laVar != null) {
            gy emojiView = laVar.f.getEmojiView();
            Q();
            org.telegram.messenger.g0.L(20.0f);
            if (emojiView != null) {
                emojiView.measure(View.MeasureSpec.makeMeasureSpec(i11, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(emojiView.getLayoutParams().height, TLObject.FLAG_30));
            }
        }
        x9 x9Var = vaVar.v1;
        if (x9Var != null) {
            gy gyVar = x9Var.Y1;
            if (gyVar != null) {
                gyVar.measure(View.MeasureSpec.makeMeasureSpec(i11, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(vaVar.v1.Y1.getLayoutParams().height, TLObject.FLAG_30));
            }
            ii0 ii0Var = vaVar.v1.I1;
            if (ii0Var != null) {
                measureChild(ii0Var, i7, i10);
                if (vaVar.v1.I1.getReactionsWindow() != null) {
                    measureChild(vaVar.v1.I1.getReactionsWindow().c, i7, i10);
                }
            }
        }
        for (int i16 = 0; i16 < getChildCount(); i16++) {
            View childAt = getChildAt(i16);
            if (childAt instanceof s0) {
                childAt.measure(View.MeasureSpec.makeMeasureSpec(i11, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(size2, TLObject.FLAG_30));
            } else if (childAt instanceof org.telegram.ui.Components.ua) {
                childAt.measure(View.MeasureSpec.makeMeasureSpec(i11, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(Math.min(org.telegram.messenger.g0.L(340.0f), size2 - (vaVar.V ? 0 : i12)), TLObject.FLAG_30));
            }
        }
        fa faVar = vaVar.r1;
        if (faVar != null) {
            faVar.measure(View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(size2, TLObject.FLAG_30));
            vaVar.r1.d.measure(View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(size2, TLObject.FLAG_30));
        }
        ga gaVar = vaVar.s1;
        if (gaVar != null) {
            gaVar.measure(View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(size2, TLObject.FLAG_30));
            vaVar.s1.e.measure(View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(size2, TLObject.FLAG_30));
        }
        setMeasuredDimension(size, size2);
    }
}
