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
import org.telegram.ui.Components.cu0;
import org.telegram.ui.Components.qy;
import org.telegram.ui.Components.xi0;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes4.dex */
public final class mb extends cu0 {
    public final org.telegram.ui.Cells.aa g0;
    public final ScaleGestureDetector h0;
    public boolean i0;
    public boolean j0;
    public boolean k0;
    public float l0;
    public float m0;
    public float n0;
    public final /* synthetic */ nb o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mb(nb nbVar, Activity activity) {
        super(activity, null);
        this.o0 = nbVar;
        this.k0 = false;
        this.g0 = new org.telegram.ui.Cells.aa(activity, new kb(this));
        this.h0 = new ScaleGestureDetector(activity, new lb(this));
    }

    public final void X(float f10, Bitmap bitmap) {
        Canvas canvas = new Canvas(bitmap);
        canvas.drawColor(-16777216);
        float width = bitmap.getWidth();
        nb nbVar = this.o0;
        float width2 = width / nbVar.n.getWidth();
        canvas.scale(width2, width2);
        TextureView textureView = nbVar.Y0.getTextureView();
        if (textureView == null) {
            textureView = nbVar.Y0.r;
        }
        if (textureView != null) {
            canvas.save();
            canvas.translate(nbVar.i0.getX() + nbVar.r.getX(), nbVar.i0.getY() + nbVar.r.getY());
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
        canvas.translate(nbVar.r.getX(), nbVar.r.getY());
        for (int i7 = 0; i7 < nbVar.r.getChildCount(); i7++) {
            View childAt = nbVar.r.getChildAt(i7);
            canvas.save();
            canvas.translate(childAt.getX(), childAt.getY());
            if (childAt.getVisibility() == 0) {
                if (childAt == nbVar.i0) {
                    for (int i10 = 0; i10 < nbVar.i0.getChildCount(); i10++) {
                        View childAt2 = nbVar.i0.getChildAt(i10);
                        if (childAt2 != nbVar.Y0 && childAt2 != nbVar.C0 && childAt2.getVisibility() == 0) {
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
    @Override // org.telegram.ui.Components.cu0, android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void dispatchDraw(Canvas canvas) {
        boolean z10;
        boolean z11;
        ?? r11;
        pa paVar;
        float f10;
        float f11;
        tg.v1 v1Var;
        nb nbVar = this.o0;
        RectF rectF = nbVar.I;
        Path path = nbVar.f0;
        RectF rectF2 = nbVar.e0;
        RectF rectF3 = nbVar.d0;
        Float f12 = nbVar.M;
        float floatValue = f12 != null ? f12.floatValue() : nbVar.L;
        if (nbVar.K == 0) {
            canvas.drawColor(i0.a.o(-16777216, (int) ((1.0f - floatValue) * nbVar.J * 255.0f)));
        }
        float T1 = org.telegram.messenger.g0.T1(nbVar.H, 0.0f, nbVar.J);
        if (nbVar.J != 1.0f) {
            int i7 = nbVar.K;
            if (i7 == 0) {
                rectF2.set(0.0f, 0.0f, getWidth(), getHeight());
                rectF2.offset(nbVar.r.getTranslationX(), nbVar.r.getTranslationY());
                org.telegram.messenger.g0.Z1(rectF, rectF2, nbVar.J, rectF3);
                canvas.save();
                path.rewind();
                path.addRoundRect(rectF3, T1, T1, Path.Direction.CW);
                canvas.clipPath(path);
                r11 = 0;
                canvas.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), (int) (Utilities.i(nbVar.J * 3.0f, 1.0f, 0.0f) * 255.0f), 31);
                canvas.translate(rectF3.left, rectF3.top - (nbVar.r.getTranslationY() * nbVar.J));
                float max = Math.max(rectF3.width() / getWidth(), rectF3.height() / getHeight());
                canvas.scale(max, max);
                z11 = true;
                paVar = nbVar.w1;
                if (paVar != null) {
                    mb mbVar = paVar.w1;
                    float[] fArr = paVar.X1;
                    if (paVar.N1) {
                        paVar.N1 = r11;
                        if (paVar.J1 != null && (v1Var = paVar.K1) != null) {
                            fArr[r11] = v1Var.getMeasuredWidth() / 2.0f;
                            fArr[1] = paVar.K1.getMeasuredHeight() / 2.0f;
                            paVar.K1.getMatrix().mapPoints(fArr);
                            f10 = 1.0f;
                            float scaleX = fArr[1] - (paVar.K1.getScaleX() * (paVar.K1.getMeasuredHeight() / 2.0f));
                            f11 = 0.0f;
                            float scaleX2 = (paVar.K1.getScaleX() * (paVar.K1.getMeasuredHeight() / 2.0f)) + fArr[1];
                            if (scaleX < org.telegram.messenger.g0.L(120.0f) && scaleX2 > mbVar.getMeasuredHeight() - org.telegram.messenger.g0.L(200.0f)) {
                                paVar.J1.setTop((boolean) r11);
                                paVar.J1.setTranslationY(org.telegram.messenger.g0.L(16.0f) + (org.telegram.messenger.g0.L(120.0f) - paVar.J1.getMeasuredHeight()));
                            } else if (scaleX < org.telegram.messenger.g0.L(120.0f)) {
                                paVar.J1.setTop(true);
                                paVar.J1.setTranslationY((paVar.K1.getScaleX() * (paVar.K1.getMeasuredHeight() / 2.0f)) + fArr[1]);
                            } else {
                                paVar.J1.setTop((boolean) r11);
                                paVar.J1.setTranslationY((scaleX - r7.getMeasuredHeight()) + org.telegram.messenger.g0.L(16.0f));
                            }
                            if (fArr[r11] < paVar.getMeasuredWidth() / 2.0f) {
                                paVar.J1.setMirrorX(true);
                                float measuredWidth = ((paVar.J1.getMeasuredWidth() / 2.0f) + paVar.J1.getX()) - (fArr[r11] - (paVar.K1.getMeasuredHeight() / 2.0f));
                                if (measuredWidth > 0.0f) {
                                    paVar.J1.setBubbleOffset(((r4.getMeasuredWidth() / 2.0f) - measuredWidth) / 2.0f);
                                }
                            } else {
                                float measuredWidth2 = ((paVar.J1.getMeasuredWidth() / 2.0f) + paVar.J1.getX()) - ((paVar.K1.getMeasuredHeight() / 2.0f) + fArr[r11]);
                                if (measuredWidth2 < 0.0f) {
                                    paVar.J1.setBubbleOffset((-((r4.getMeasuredWidth() / 2.0f) + measuredWidth2)) / 2.0f);
                                }
                                paVar.J1.setMirrorX(r11);
                            }
                            paVar.J1.setTranslationX((mbVar.getMeasuredWidth() - paVar.J1.getMeasuredWidth()) / 2.0f);
                            super.dispatchDraw(canvas);
                            if (z11) {
                                canvas.restore();
                                canvas.restore();
                                if (nbVar.G != null) {
                                    float i10 = Utilities.i(f10 - (nbVar.J * 1.5f), f10, f11);
                                    rectF3.centerX();
                                    rectF3.centerY();
                                    Math.min(rectF3.width(), rectF3.height());
                                    ib ibVar = nbVar.G;
                                    ImageReceiver imageReceiver = ibVar.e;
                                    if (imageReceiver != null) {
                                        imageReceiver.B0(rectF3);
                                        ImageReceiver imageReceiver2 = nbVar.G.e;
                                        int i11 = imageReceiver2.X0[r11];
                                        imageReceiver2.K0((int) T1);
                                        nbVar.G.e.setAlpha(i10);
                                        nbVar.G.e.h(canvas, null);
                                        nbVar.G.e.K0(i11);
                                    } else {
                                        org.telegram.ui.Cells.c7 c7Var = ibVar.d;
                                        if (c7Var != null) {
                                            c7Var.setBounds((int) rectF3.left, (int) rectF3.top, (int) rectF3.right, (int) rectF3.bottom);
                                            org.telegram.ui.Cells.c7 c7Var2 = nbVar.G.d;
                                            c7Var2.g = (int) com.google.android.gms.internal.vision.e2.D(i10, 255.0f, i10, i10);
                                            c7Var2.draw(canvas);
                                        }
                                    }
                                    nbVar.G.getClass();
                                    canvas.save();
                                    canvas.translate(rectF.left, rectF.top);
                                    nbVar.G.a(canvas, i10);
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
                    nbVar.j();
                    z10 = z12;
                }
            }
        } else {
            z10 = false;
        }
        z11 = z10 ? 1 : 0;
        r11 = z10;
        paVar = nbVar.w1;
        if (paVar != null) {
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
        nb nbVar = this.o0;
        h0 h0Var = nbVar.J0;
        if (h0Var != null && h0Var.e) {
            float y10 = nbVar.J0.getY() + nbVar.j0.getY() + nbVar.r.getY();
            if ((motionEvent.getY() >= y10 && motionEvent.getY() <= y10 + nbVar.J0.getHeight()) || this.j0) {
                if (motionEvent.getAction() != 1 && motionEvent.getAction() != 3) {
                    z10 = true;
                }
                this.j0 = z10;
                return super.dispatchTouchEvent(motionEvent);
            }
            nbVar.J0.a(false, true);
            nbVar.l0(true);
        }
        if (this.j0 && (motionEvent.getAction() == 1 || motionEvent.getAction() == 3)) {
            this.j0 = false;
        }
        this.h0.onTouchEvent(motionEvent);
        this.g0.I2(motionEvent);
        if (motionEvent.getAction() == 1 && !this.i0) {
            if (nbVar.r.getTranslationY() <= 0.0f) {
                p3 p3Var = nbVar.N0;
                if (p3Var != null && p3Var.getTranslationY() > 0.0f && !nbVar.M0) {
                    nbVar.e(!nbVar.R1 && nbVar.N0.getTranslationY() < ((float) nbVar.N0.getPadding()));
                }
            } else if (nbVar.L > 0.4f) {
                nbVar.p(true);
            } else {
                nb.b(nbVar);
            }
            nbVar.M0 = false;
            nbVar.X = false;
            nbVar.Y = false;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // org.telegram.ui.Components.cu0
    public int getBottomPadding() {
        int height = getHeight();
        nb nbVar = this.o0;
        return (height - nbVar.r.getBottom()) + nbVar.V;
    }

    public int getBottomPadding2() {
        return getHeight() - this.o0.r.getBottom();
    }

    public int getPaddingUnderContainer() {
        int height = getHeight();
        nb nbVar = this.o0;
        return (height - nbVar.c0) - nbVar.r.getBottom();
    }

    @Override // org.telegram.ui.Components.cu0, android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i7, int i10, int i11, int i12) {
        int i13;
        qy emojiView;
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        nb nbVar = this.o0;
        int i14 = nbVar.a0;
        int measuredHeight2 = nbVar.n0.getMeasuredHeight();
        if (nbVar.W) {
            i14 = 0;
        }
        int i15 = nbVar.T;
        int b10 = c8.m9.b((measuredWidth - i15) / 2, nbVar.Z, (measuredWidth - nbVar.b0) - i15);
        int i16 = nbVar.T + b10;
        if (nbVar.W) {
            i13 = nbVar.U;
        } else {
            int i17 = nbVar.c0;
            int i18 = nbVar.U;
            int i19 = (((((measuredHeight - i14) - i17) - i18) - measuredHeight2) / 2) + i14;
            if (nbVar.K == 1) {
                float f10 = nbVar.I.top;
                if (i18 + f10 + measuredHeight2 < measuredHeight - i17) {
                    i14 = (int) f10;
                    i13 = nbVar.U;
                }
            }
            if (i19 - i14 >= org.telegram.messenger.g0.L(40.0f)) {
                i14 = i19;
            }
            i13 = nbVar.U;
        }
        nbVar.r.layout(b10, i14, i16, i13 + i14 + measuredHeight2);
        nbVar.s.b.layout(0, 0, measuredWidth, measuredHeight);
        va vaVar = nbVar.D2;
        if (vaVar != null) {
            vaVar.layout(0, 0, measuredWidth, measuredHeight);
        }
        p3 p3Var = nbVar.N0;
        if (p3Var != null) {
            p3Var.layout((measuredWidth - p3Var.getMeasuredWidth()) / 2, 0, (nbVar.N0.getMeasuredWidth() + measuredWidth) / 2, measuredHeight);
        }
        db dbVar = nbVar.d1;
        if (dbVar != null && (emojiView = dbVar.f.getEmojiView()) != null) {
            emojiView.layout(nbVar.Z, (measuredHeight - nbVar.c0) - emojiView.getMeasuredHeight(), measuredWidth - nbVar.b0, measuredHeight - nbVar.c0);
        }
        pa paVar = nbVar.w1;
        if (paVar != null) {
            qy qyVar = paVar.d2;
            if (qyVar != null) {
                qyVar.layout(nbVar.Z, (measuredHeight - nbVar.c0) - qyVar.getMeasuredHeight(), measuredWidth - nbVar.b0, measuredHeight - nbVar.c0);
            }
            xi0 xi0Var = nbVar.w1.J1;
            if (xi0Var != null) {
                int i20 = nbVar.Z;
                xi0Var.layout(i20, nbVar.a0, xi0Var.getMeasuredWidth() + i20, nbVar.w1.J1.getMeasuredHeight() + nbVar.a0);
                ai.h0 h0Var = nbVar.w1.J1.getReactionsWindow() != null ? nbVar.w1.J1.getReactionsWindow().c : null;
                if (h0Var != null) {
                    int i21 = nbVar.Z;
                    h0Var.layout(i21, nbVar.a0, h0Var.getMeasuredWidth() + i21, h0Var.getMeasuredHeight() + nbVar.a0);
                }
            }
        }
        xa xaVar = nbVar.s1;
        if (xaVar != null) {
            xaVar.e.setPadding(0, nbVar.a0, 0, nbVar.c0);
            nbVar.s1.layout(0, 0, measuredWidth, measuredHeight);
            nbVar.s1.d.layout(0, 0, measuredWidth, measuredHeight);
        }
        ya yaVar = nbVar.t1;
        if (yaVar != null) {
            yaVar.f.setPadding(0, nbVar.a0, 0, nbVar.c0);
            nbVar.t1.layout(0, 0, measuredWidth, measuredHeight);
            nbVar.t1.e.layout(0, 0, measuredWidth, measuredHeight);
        }
        for (int i22 = 0; i22 < getChildCount(); i22++) {
            View childAt = getChildAt(i22);
            if (childAt instanceof c1) {
                childAt.layout(0, 0, measuredWidth, measuredHeight);
            } else if (childAt instanceof org.telegram.ui.Components.ya) {
                childAt.layout(0, i14, childAt.getMeasuredWidth(), childAt.getMeasuredHeight() + i14);
            }
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i7, int i10) {
        int size = View.MeasureSpec.getSize(i7);
        int size2 = View.MeasureSpec.getSize(i10);
        nb nbVar = this.o0;
        int i11 = (size - nbVar.Z) - nbVar.b0;
        int i12 = nbVar.a0;
        int i13 = nbVar.c0;
        int ceil = (int) Math.ceil((i11 / 9.0f) * 16.0f);
        int L = org.telegram.messenger.g0.L(48.0f);
        nbVar.V = L;
        int i14 = ceil + L;
        int i15 = size2 - i13;
        if (i14 <= i15) {
            nbVar.T = i11;
            nbVar.U = ceil;
            nbVar.W = i14 > i15 - i12;
        } else {
            nbVar.W = false;
            nbVar.U = ((size2 - L) - i13) - i12;
            nbVar.T = (int) Math.ceil((r9 * 9.0f) / 16.0f);
        }
        nbVar.V = Utilities.j((size2 - nbVar.U) - (nbVar.W ? 0 : i12), org.telegram.messenger.g0.L(68.0f), org.telegram.messenger.g0.L(48.0f));
        int systemUiVisibility = getSystemUiVisibility();
        setSystemUiVisibility(nbVar.W ? systemUiVisibility | 4 : systemUiVisibility & (-5));
        nbVar.r.measure(View.MeasureSpec.makeMeasureSpec(nbVar.T, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(nbVar.U + nbVar.V, TLObject.FLAG_30));
        nbVar.s.b.measure(View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(size2, TLObject.FLAG_30));
        va vaVar = nbVar.D2;
        if (vaVar != null) {
            vaVar.measure(View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(size2, TLObject.FLAG_30));
        }
        p3 p3Var = nbVar.N0;
        if (p3Var != null) {
            p3Var.measure(View.MeasureSpec.makeMeasureSpec(nbVar.T, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(size2, TLObject.FLAG_30));
        }
        db dbVar = nbVar.d1;
        if (dbVar != null) {
            qy emojiView = dbVar.f.getEmojiView();
            Q();
            org.telegram.messenger.g0.L(20.0f);
            if (emojiView != null) {
                emojiView.measure(View.MeasureSpec.makeMeasureSpec(i11, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(emojiView.getLayoutParams().height, TLObject.FLAG_30));
            }
        }
        pa paVar = nbVar.w1;
        if (paVar != null) {
            qy qyVar = paVar.d2;
            if (qyVar != null) {
                qyVar.measure(View.MeasureSpec.makeMeasureSpec(i11, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(nbVar.w1.d2.getLayoutParams().height, TLObject.FLAG_30));
            }
            xi0 xi0Var = nbVar.w1.J1;
            if (xi0Var != null) {
                measureChild(xi0Var, i7, i10);
                if (nbVar.w1.J1.getReactionsWindow() != null) {
                    measureChild(nbVar.w1.J1.getReactionsWindow().c, i7, i10);
                }
            }
        }
        for (int i16 = 0; i16 < getChildCount(); i16++) {
            View childAt = getChildAt(i16);
            if (childAt instanceof c1) {
                childAt.measure(View.MeasureSpec.makeMeasureSpec(i11, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(size2, TLObject.FLAG_30));
            } else if (childAt instanceof org.telegram.ui.Components.ya) {
                childAt.measure(View.MeasureSpec.makeMeasureSpec(i11, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(Math.min(org.telegram.messenger.g0.L(340.0f), size2 - (nbVar.W ? 0 : i12)), TLObject.FLAG_30));
            }
        }
        xa xaVar = nbVar.s1;
        if (xaVar != null) {
            xaVar.measure(View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(size2, TLObject.FLAG_30));
            nbVar.s1.d.measure(View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(size2, TLObject.FLAG_30));
        }
        ya yaVar = nbVar.t1;
        if (yaVar != null) {
            yaVar.measure(View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(size2, TLObject.FLAG_30));
            nbVar.t1.e.measure(View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(size2, TLObject.FLAG_30));
        }
        setMeasuredDimension(size, size2);
    }
}
