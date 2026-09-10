package bi;

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
import org.telegram.ui.Components.aw0;
import org.telegram.ui.Components.pk0;
import org.telegram.ui.Components.rz;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes4.dex */
public final class be extends aw0 {
    public boolean A0;
    public float B0;
    public float C0;
    public float D0;
    public final /* synthetic */ ce E0;
    public final l2.g w0;
    public final ScaleGestureDetector x0;
    public boolean y0;
    public boolean z0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public be(ce ceVar, Activity activity) {
        super(activity, null);
        this.E0 = ceVar;
        this.A0 = false;
        this.w0 = new l2.g(activity, new zd(this));
        this.x0 = new ScaleGestureDetector(activity, new ae(this));
    }

    public final void Z(Bitmap bitmap, float f7) {
        Canvas canvas = new Canvas(bitmap);
        canvas.drawColor(-16777216);
        float width = bitmap.getWidth();
        ce ceVar = this.E0;
        float width2 = width / ceVar.n.getWidth();
        canvas.scale(width2, width2);
        TextureView textureView = ceVar.X0.getTextureView();
        if (textureView == null) {
            textureView = ceVar.X0.r;
        }
        if (textureView != null) {
            canvas.save();
            canvas.translate(ceVar.h0.getX() + ceVar.r.getX(), ceVar.h0.getY() + ceVar.r.getY());
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
        canvas.translate(ceVar.r.getX(), ceVar.r.getY());
        for (int i10 = 0; i10 < ceVar.r.getChildCount(); i10++) {
            View childAt = ceVar.r.getChildAt(i10);
            canvas.save();
            canvas.translate(childAt.getX(), childAt.getY());
            if (childAt.getVisibility() == 0) {
                if (childAt == ceVar.h0) {
                    for (int i11 = 0; i11 < ceVar.h0.getChildCount(); i11++) {
                        View childAt2 = ceVar.h0.getChildAt(i11);
                        if (childAt2 != ceVar.X0 && childAt2 != ceVar.B0 && childAt2.getVisibility() == 0) {
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
    @Override // org.telegram.ui.Components.aw0, android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void dispatchDraw(Canvas canvas) {
        boolean z10;
        boolean z11;
        ?? r11;
        ad adVar;
        float f7;
        pg.a2 a2Var;
        ce ceVar = this.E0;
        RectF rectF = ceVar.H;
        Path path = ceVar.e0;
        RectF rectF2 = ceVar.d0;
        RectF rectF3 = ceVar.c0;
        Float f10 = ceVar.L;
        float floatValue = f10 != null ? f10.floatValue() : ceVar.K;
        if (ceVar.J == 0) {
            canvas.drawColor(i0.a.k(-16777216, (int) ((1.0f - floatValue) * ceVar.I * 255.0f)));
        }
        float lerp = AndroidUtilities.lerp(ceVar.G, 0.0f, ceVar.I);
        if (ceVar.I != 1.0f) {
            int i10 = ceVar.J;
            if (i10 == 0) {
                rectF2.set(0.0f, 0.0f, getWidth(), getHeight());
                rectF2.offset(ceVar.r.getTranslationX(), ceVar.r.getTranslationY());
                AndroidUtilities.lerp(rectF, rectF2, ceVar.I, rectF3);
                canvas.save();
                path.rewind();
                path.addRoundRect(rectF3, lerp, lerp, Path.Direction.CW);
                canvas.clipPath(path);
                r11 = 0;
                canvas.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), (int) (Utilities.clamp(ceVar.I * 3.0f, 1.0f, 0.0f) * 255.0f), 31);
                canvas.translate(rectF3.left, rectF3.top - (ceVar.r.getTranslationY() * ceVar.I));
                float max = Math.max(rectF3.width() / getWidth(), rectF3.height() / getHeight());
                canvas.scale(max, max);
                z11 = true;
                adVar = ceVar.v1;
                if (adVar != null) {
                    be beVar = adVar.M1;
                    float[] fArr = adVar.j2;
                    if (adVar.d2) {
                        adVar.d2 = r11;
                        if (adVar.Z1 != null && (a2Var = adVar.a2) != null) {
                            fArr[r11] = a2Var.getMeasuredWidth() / 2.0f;
                            fArr[1] = adVar.a2.getMeasuredHeight() / 2.0f;
                            adVar.a2.getMatrix().mapPoints(fArr);
                            f7 = 1.0f;
                            float scaleX = fArr[1] - (adVar.a2.getScaleX() * (adVar.a2.getMeasuredHeight() / 2.0f));
                            float scaleX2 = (adVar.a2.getScaleX() * (adVar.a2.getMeasuredHeight() / 2.0f)) + fArr[1];
                            if (scaleX < AndroidUtilities.dp(120.0f) && scaleX2 > beVar.getMeasuredHeight() - AndroidUtilities.dp(200.0f)) {
                                adVar.Z1.setTop((boolean) r11);
                                adVar.Z1.setTranslationY(AndroidUtilities.dp(16.0f) + (AndroidUtilities.dp(120.0f) - adVar.Z1.getMeasuredHeight()));
                            } else if (scaleX < AndroidUtilities.dp(120.0f)) {
                                adVar.Z1.setTop(true);
                                adVar.Z1.setTranslationY((adVar.a2.getScaleX() * (adVar.a2.getMeasuredHeight() / 2.0f)) + fArr[1]);
                            } else {
                                adVar.Z1.setTop((boolean) r11);
                                adVar.Z1.setTranslationY((scaleX - r7.getMeasuredHeight()) + AndroidUtilities.dp(16.0f));
                            }
                            if (fArr[r11] < adVar.getMeasuredWidth() / 2.0f) {
                                adVar.Z1.setMirrorX(true);
                                float measuredWidth = ((adVar.Z1.getMeasuredWidth() / 2.0f) + adVar.Z1.getX()) - (fArr[r11] - (adVar.a2.getMeasuredHeight() / 2.0f));
                                if (measuredWidth > 0.0f) {
                                    adVar.Z1.setBubbleOffset(((r4.getMeasuredWidth() / 2.0f) - measuredWidth) / 2.0f);
                                }
                            } else {
                                float measuredWidth2 = ((adVar.Z1.getMeasuredWidth() / 2.0f) + adVar.Z1.getX()) - ((adVar.a2.getMeasuredHeight() / 2.0f) + fArr[r11]);
                                if (measuredWidth2 < 0.0f) {
                                    adVar.Z1.setBubbleOffset((-((r4.getMeasuredWidth() / 2.0f) + measuredWidth2)) / 2.0f);
                                }
                                adVar.Z1.setMirrorX(r11);
                            }
                            adVar.Z1.setTranslationX((beVar.getMeasuredWidth() - adVar.Z1.getMeasuredWidth()) / 2.0f);
                            super.dispatchDraw(canvas);
                            if (z11) {
                                canvas.restore();
                                canvas.restore();
                                if (ceVar.F != null) {
                                    float clamp = Utilities.clamp(f7 - (ceVar.I * 1.5f), 1.0f, 0.0f);
                                    rectF3.centerX();
                                    rectF3.centerY();
                                    Math.min(rectF3.width(), rectF3.height());
                                    xd xdVar = ceVar.F;
                                    ImageReceiver imageReceiver = xdVar.e;
                                    if (imageReceiver != null) {
                                        imageReceiver.setImageCoords(rectF3);
                                        int i11 = ceVar.F.e.getRoundRadius()[r11];
                                        ceVar.F.e.setRoundRadius((int) lerp);
                                        ceVar.F.e.setAlpha(clamp);
                                        ceVar.F.e.draw(canvas);
                                        ceVar.F.e.setRoundRadius(i11);
                                    } else {
                                        org.telegram.ui.Cells.g7 g7Var = xdVar.d;
                                        if (g7Var != null) {
                                            g7Var.setBounds((int) rectF3.left, (int) rectF3.top, (int) rectF3.right, (int) rectF3.bottom);
                                            org.telegram.ui.Cells.g7 g7Var2 = ceVar.F.d;
                                            g7Var2.d = (int) com.google.android.gms.internal.vision.e2.C(clamp, 255.0f, clamp, clamp);
                                            g7Var2.draw(canvas);
                                        }
                                    }
                                    ceVar.F.getClass();
                                    canvas.save();
                                    canvas.translate(rectF.left, rectF.top);
                                    ceVar.F.a(canvas, clamp);
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
                    ceVar.k();
                }
            }
        } else {
            z10 = false;
        }
        z11 = false;
        r11 = z10;
        adVar = ceVar.v1;
        if (adVar != null) {
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
        ce ceVar = this.E0;
        c0 c0Var = ceVar.I0;
        if (c0Var != null && c0Var.e) {
            float y3 = ceVar.I0.getY() + ceVar.i0.getY() + ceVar.r.getY();
            if ((motionEvent.getY() >= y3 && motionEvent.getY() <= y3 + ceVar.I0.getHeight()) || this.z0) {
                if (motionEvent.getAction() != 1 && motionEvent.getAction() != 3) {
                    z10 = true;
                }
                this.z0 = z10;
                return super.dispatchTouchEvent(motionEvent);
            }
            ceVar.I0.a(false, true);
            ceVar.m0(true);
        }
        if (this.z0 && (motionEvent.getAction() == 1 || motionEvent.getAction() == 3)) {
            this.z0 = false;
        }
        this.x0.onTouchEvent(motionEvent);
        this.w0.B(motionEvent);
        if (motionEvent.getAction() == 1 && !this.y0) {
            if (ceVar.r.getTranslationY() <= 0.0f) {
                xc xcVar = ceVar.M0;
                if (xcVar != null && xcVar.getTranslationY() > 0.0f && !ceVar.L0) {
                    ceVar.f(!ceVar.Q1 && ceVar.M0.getTranslationY() < ((float) ceVar.M0.getPadding()));
                }
            } else if (ceVar.K > 0.4f) {
                ceVar.q(true);
            } else {
                ce.c(ceVar);
            }
            ceVar.L0 = false;
            ceVar.W = false;
            ceVar.X = false;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // org.telegram.ui.Components.aw0
    public int getBottomPadding() {
        int height = getHeight();
        ce ceVar = this.E0;
        return (height - ceVar.r.getBottom()) + ceVar.U;
    }

    public int getBottomPadding2() {
        return getHeight() - this.E0.r.getBottom();
    }

    @Override // org.telegram.ui.Components.aw0
    public /* bridge */ /* synthetic */ int[] getColorKeys() {
        return null;
    }

    public int getPaddingUnderContainer() {
        int height = getHeight();
        ce ceVar = this.E0;
        return (height - ceVar.b0) - ceVar.r.getBottom();
    }

    @Override // org.telegram.ui.Components.aw0, android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int i14;
        rz emojiView;
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        ce ceVar = this.E0;
        int i15 = ceVar.Z;
        int measuredHeight2 = ceVar.m0.getMeasuredHeight();
        if (ceVar.V) {
            i15 = 0;
        }
        int i16 = ceVar.S;
        int b10 = w7.q.b((measuredWidth - i16) / 2, ceVar.Y, (measuredWidth - ceVar.a0) - i16);
        int i17 = ceVar.S + b10;
        if (ceVar.V) {
            i14 = ceVar.T;
        } else {
            int i18 = ceVar.b0;
            int i19 = ceVar.T;
            int i20 = (((((measuredHeight - i15) - i18) - i19) - measuredHeight2) / 2) + i15;
            if (ceVar.J == 1) {
                float f7 = ceVar.H.top;
                if (i19 + f7 + measuredHeight2 < measuredHeight - i18) {
                    i15 = (int) f7;
                    i14 = ceVar.T;
                }
            }
            if (i20 - i15 >= AndroidUtilities.dp(40.0f)) {
                i15 = i20;
            }
            i14 = ceVar.T;
        }
        ceVar.r.layout(b10, i15, i17, i14 + i15 + measuredHeight2);
        ceVar.s.b.layout(0, 0, measuredWidth, measuredHeight);
        gd gdVar = ceVar.C2;
        if (gdVar != null) {
            gdVar.layout(0, 0, measuredWidth, measuredHeight);
        }
        xc xcVar = ceVar.M0;
        if (xcVar != null) {
            xcVar.layout((measuredWidth - xcVar.getMeasuredWidth()) / 2, 0, (ceVar.M0.getMeasuredWidth() + measuredWidth) / 2, measuredHeight);
        }
        qd qdVar = ceVar.c1;
        if (qdVar != null && (emojiView = qdVar.f.getEmojiView()) != null) {
            emojiView.layout(ceVar.Y, (measuredHeight - ceVar.b0) - emojiView.getMeasuredHeight(), measuredWidth - ceVar.a0, measuredHeight - ceVar.b0);
        }
        ad adVar = ceVar.v1;
        if (adVar != null) {
            rz rzVar = adVar.p2;
            if (rzVar != null) {
                rzVar.layout(ceVar.Y, (measuredHeight - ceVar.b0) - rzVar.getMeasuredHeight(), measuredWidth - ceVar.a0, measuredHeight - ceVar.b0);
            }
            pk0 pk0Var = ceVar.v1.Z1;
            if (pk0Var != null) {
                int i21 = ceVar.Y;
                pk0Var.layout(i21, ceVar.Z, pk0Var.getMeasuredWidth() + i21, ceVar.v1.Z1.getMeasuredHeight() + ceVar.Z);
                xh.t3 t3Var = ceVar.v1.Z1.getReactionsWindow() != null ? ceVar.v1.Z1.getReactionsWindow().c : null;
                if (t3Var != null) {
                    int i22 = ceVar.Y;
                    t3Var.layout(i22, ceVar.Z, t3Var.getMeasuredWidth() + i22, t3Var.getMeasuredHeight() + ceVar.Z);
                }
            }
        }
        id idVar = ceVar.r1;
        if (idVar != null) {
            idVar.e.setPadding(0, ceVar.Z, 0, ceVar.b0);
            ceVar.r1.layout(0, 0, measuredWidth, measuredHeight);
            ceVar.r1.d.layout(0, 0, measuredWidth, measuredHeight);
        }
        jd jdVar = ceVar.s1;
        if (jdVar != null) {
            jdVar.f.setPadding(0, ceVar.Z, 0, ceVar.b0);
            ceVar.s1.layout(0, 0, measuredWidth, measuredHeight);
            ceVar.s1.e.layout(0, 0, measuredWidth, measuredHeight);
        }
        for (int i23 = 0; i23 < getChildCount(); i23++) {
            View childAt = getChildAt(i23);
            if (childAt instanceof x0) {
                childAt.layout(0, 0, measuredWidth, measuredHeight);
            } else if (childAt instanceof org.telegram.ui.Components.hb) {
                childAt.layout(0, i15, childAt.getMeasuredWidth(), childAt.getMeasuredHeight() + i15);
            }
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        int size = View.MeasureSpec.getSize(i10);
        int size2 = View.MeasureSpec.getSize(i11);
        ce ceVar = this.E0;
        int i12 = (size - ceVar.Y) - ceVar.a0;
        int i13 = ceVar.Z;
        int i14 = ceVar.b0;
        int ceil = (int) Math.ceil((i12 / 9.0f) * 16.0f);
        int dp = AndroidUtilities.dp(48.0f);
        ceVar.U = dp;
        int i15 = ceil + dp;
        int i16 = size2 - i14;
        if (i15 <= i16) {
            ceVar.S = i12;
            ceVar.T = ceil;
            ceVar.V = i15 > i16 - i13;
        } else {
            ceVar.V = false;
            ceVar.T = ((size2 - dp) - i14) - i13;
            ceVar.S = (int) Math.ceil((r9 * 9.0f) / 16.0f);
        }
        ceVar.U = Utilities.clamp((size2 - ceVar.T) - (ceVar.V ? 0 : i13), AndroidUtilities.dp(68.0f), AndroidUtilities.dp(48.0f));
        int systemUiVisibility = getSystemUiVisibility();
        setSystemUiVisibility(ceVar.V ? systemUiVisibility | 4 : systemUiVisibility & (-5));
        ceVar.r.measure(View.MeasureSpec.makeMeasureSpec(ceVar.S, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(ceVar.T + ceVar.U, TLObject.FLAG_30));
        ceVar.s.b.measure(View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(size2, TLObject.FLAG_30));
        gd gdVar = ceVar.C2;
        if (gdVar != null) {
            gdVar.measure(View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(size2, TLObject.FLAG_30));
        }
        xc xcVar = ceVar.M0;
        if (xcVar != null) {
            xcVar.measure(View.MeasureSpec.makeMeasureSpec(ceVar.S, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(size2, TLObject.FLAG_30));
        }
        qd qdVar = ceVar.c1;
        if (qdVar != null) {
            rz emojiView = qdVar.f.getEmojiView();
            R();
            AndroidUtilities.dp(20.0f);
            if (emojiView != null) {
                emojiView.measure(View.MeasureSpec.makeMeasureSpec(i12, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(emojiView.getLayoutParams().height, TLObject.FLAG_30));
            }
        }
        ad adVar = ceVar.v1;
        if (adVar != null) {
            rz rzVar = adVar.p2;
            if (rzVar != null) {
                rzVar.measure(View.MeasureSpec.makeMeasureSpec(i12, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(ceVar.v1.p2.getLayoutParams().height, TLObject.FLAG_30));
            }
            pk0 pk0Var = ceVar.v1.Z1;
            if (pk0Var != null) {
                measureChild(pk0Var, i10, i11);
                if (ceVar.v1.Z1.getReactionsWindow() != null) {
                    measureChild(ceVar.v1.Z1.getReactionsWindow().c, i10, i11);
                }
            }
        }
        for (int i17 = 0; i17 < getChildCount(); i17++) {
            View childAt = getChildAt(i17);
            if (childAt instanceof x0) {
                childAt.measure(View.MeasureSpec.makeMeasureSpec(i12, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(size2, TLObject.FLAG_30));
            } else if (childAt instanceof org.telegram.ui.Components.hb) {
                childAt.measure(View.MeasureSpec.makeMeasureSpec(i12, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(Math.min(AndroidUtilities.dp(340.0f), size2 - (ceVar.V ? 0 : i13)), TLObject.FLAG_30));
            }
        }
        id idVar = ceVar.r1;
        if (idVar != null) {
            idVar.measure(View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(size2, TLObject.FLAG_30));
            ceVar.r1.d.measure(View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(size2, TLObject.FLAG_30));
        }
        jd jdVar = ceVar.s1;
        if (jdVar != null) {
            jdVar.measure(View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(size2, TLObject.FLAG_30));
            ceVar.s1.e.measure(View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(size2, TLObject.FLAG_30));
        }
        setMeasuredDimension(size, size2);
    }
}
