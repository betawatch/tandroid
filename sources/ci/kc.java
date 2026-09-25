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
import org.telegram.ui.Components.aw0;
import org.telegram.ui.Components.lz;
import org.telegram.ui.Components.qk0;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
/* loaded from: classes4.dex */
public final class kc extends aw0 {
    public boolean A0;
    public float B0;
    public float C0;
    public float D0;
    public final /* synthetic */ lc E0;
    public final ka.c w0;
    public final ScaleGestureDetector x0;
    public boolean y0;
    public boolean z0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kc(lc lcVar, Activity activity) {
        super(activity, null);
        this.E0 = lcVar;
        this.A0 = false;
        this.w0 = new ka.c(activity, new ic(this));
        this.x0 = new ScaleGestureDetector(activity, new jc(this));
    }

    public final void Z(Bitmap bitmap, float f7) {
        Canvas canvas = new Canvas(bitmap);
        canvas.drawColor(-16777216);
        float width = bitmap.getWidth();
        lc lcVar = this.E0;
        float width2 = width / lcVar.n.getWidth();
        canvas.scale(width2, width2);
        TextureView textureView = lcVar.X0.getTextureView();
        if (textureView == null) {
            textureView = lcVar.X0.r;
        }
        if (textureView != null) {
            canvas.save();
            canvas.translate(lcVar.h0.getX() + lcVar.r.getX(), lcVar.h0.getY() + lcVar.r.getY());
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
        canvas.translate(lcVar.r.getX(), lcVar.r.getY());
        for (int i10 = 0; i10 < lcVar.r.getChildCount(); i10++) {
            View childAt = lcVar.r.getChildAt(i10);
            canvas.save();
            canvas.translate(childAt.getX(), childAt.getY());
            if (childAt.getVisibility() == 0) {
                if (childAt == lcVar.h0) {
                    for (int i11 = 0; i11 < lcVar.h0.getChildCount(); i11++) {
                        View childAt2 = lcVar.h0.getChildAt(i11);
                        if (childAt2 != lcVar.X0 && childAt2 != lcVar.B0 && childAt2.getVisibility() == 0) {
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
        nb nbVar;
        float f7;
        qg.b2 b2Var;
        lc lcVar = this.E0;
        RectF rectF = lcVar.H;
        Path path = lcVar.e0;
        RectF rectF2 = lcVar.d0;
        RectF rectF3 = lcVar.c0;
        Float f10 = lcVar.L;
        float floatValue = f10 != null ? f10.floatValue() : lcVar.K;
        if (lcVar.J == 0) {
            canvas.drawColor(i0.a.k(-16777216, (int) ((1.0f - floatValue) * lcVar.I * 255.0f)));
        }
        float lerp = AndroidUtilities.lerp(lcVar.G, 0.0f, lcVar.I);
        if (lcVar.I != 1.0f) {
            int i10 = lcVar.J;
            if (i10 == 0) {
                rectF2.set(0.0f, 0.0f, getWidth(), getHeight());
                rectF2.offset(lcVar.r.getTranslationX(), lcVar.r.getTranslationY());
                AndroidUtilities.lerp(rectF, rectF2, lcVar.I, rectF3);
                canvas.save();
                path.rewind();
                path.addRoundRect(rectF3, lerp, lerp, Path.Direction.CW);
                canvas.clipPath(path);
                r11 = 0;
                canvas.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), (int) (Utilities.clamp(lcVar.I * 3.0f, 1.0f, 0.0f) * 255.0f), 31);
                canvas.translate(rectF3.left, rectF3.top - (lcVar.r.getTranslationY() * lcVar.I));
                float max = Math.max(rectF3.width() / getWidth(), rectF3.height() / getHeight());
                canvas.scale(max, max);
                z11 = true;
                nbVar = lcVar.v1;
                if (nbVar != null) {
                    kc kcVar = nbVar.M1;
                    float[] fArr = nbVar.j2;
                    if (nbVar.d2) {
                        nbVar.d2 = r11;
                        if (nbVar.Z1 != null && (b2Var = nbVar.a2) != null) {
                            fArr[r11] = b2Var.getMeasuredWidth() / 2.0f;
                            fArr[1] = nbVar.a2.getMeasuredHeight() / 2.0f;
                            nbVar.a2.getMatrix().mapPoints(fArr);
                            f7 = 1.0f;
                            float scaleX = fArr[1] - (nbVar.a2.getScaleX() * (nbVar.a2.getMeasuredHeight() / 2.0f));
                            float scaleX2 = (nbVar.a2.getScaleX() * (nbVar.a2.getMeasuredHeight() / 2.0f)) + fArr[1];
                            if (scaleX < AndroidUtilities.dp(120.0f) && scaleX2 > kcVar.getMeasuredHeight() - AndroidUtilities.dp(200.0f)) {
                                nbVar.Z1.setTop((boolean) r11);
                                nbVar.Z1.setTranslationY(AndroidUtilities.dp(16.0f) + (AndroidUtilities.dp(120.0f) - nbVar.Z1.getMeasuredHeight()));
                            } else if (scaleX < AndroidUtilities.dp(120.0f)) {
                                nbVar.Z1.setTop(true);
                                nbVar.Z1.setTranslationY((nbVar.a2.getScaleX() * (nbVar.a2.getMeasuredHeight() / 2.0f)) + fArr[1]);
                            } else {
                                nbVar.Z1.setTop((boolean) r11);
                                nbVar.Z1.setTranslationY((scaleX - r7.getMeasuredHeight()) + AndroidUtilities.dp(16.0f));
                            }
                            if (fArr[r11] < nbVar.getMeasuredWidth() / 2.0f) {
                                nbVar.Z1.setMirrorX(true);
                                float measuredWidth = ((nbVar.Z1.getMeasuredWidth() / 2.0f) + nbVar.Z1.getX()) - (fArr[r11] - (nbVar.a2.getMeasuredHeight() / 2.0f));
                                if (measuredWidth > 0.0f) {
                                    nbVar.Z1.setBubbleOffset(((r4.getMeasuredWidth() / 2.0f) - measuredWidth) / 2.0f);
                                }
                            } else {
                                float measuredWidth2 = ((nbVar.Z1.getMeasuredWidth() / 2.0f) + nbVar.Z1.getX()) - ((nbVar.a2.getMeasuredHeight() / 2.0f) + fArr[r11]);
                                if (measuredWidth2 < 0.0f) {
                                    nbVar.Z1.setBubbleOffset((-((r4.getMeasuredWidth() / 2.0f) + measuredWidth2)) / 2.0f);
                                }
                                nbVar.Z1.setMirrorX(r11);
                            }
                            nbVar.Z1.setTranslationX((kcVar.getMeasuredWidth() - nbVar.Z1.getMeasuredWidth()) / 2.0f);
                            super.dispatchDraw(canvas);
                            if (z11) {
                                canvas.restore();
                                canvas.restore();
                                if (lcVar.F != null) {
                                    float clamp = Utilities.clamp(f7 - (lcVar.I * 1.5f), 1.0f, 0.0f);
                                    rectF3.centerX();
                                    rectF3.centerY();
                                    Math.min(rectF3.width(), rectF3.height());
                                    gc gcVar = lcVar.F;
                                    ImageReceiver imageReceiver = gcVar.e;
                                    if (imageReceiver != null) {
                                        imageReceiver.setImageCoords(rectF3);
                                        int i11 = lcVar.F.e.getRoundRadius()[r11];
                                        lcVar.F.e.setRoundRadius((int) lerp);
                                        lcVar.F.e.setAlpha(clamp);
                                        lcVar.F.e.draw(canvas);
                                        lcVar.F.e.setRoundRadius(i11);
                                    } else {
                                        org.telegram.ui.Cells.f7 f7Var = gcVar.d;
                                        if (f7Var != null) {
                                            f7Var.setBounds((int) rectF3.left, (int) rectF3.top, (int) rectF3.right, (int) rectF3.bottom);
                                            org.telegram.ui.Cells.f7 f7Var2 = lcVar.F.d;
                                            f7Var2.d = (int) com.google.android.gms.internal.vision.e2.C(clamp, 255.0f, clamp, clamp);
                                            f7Var2.draw(canvas);
                                        }
                                    }
                                    lcVar.F.getClass();
                                    canvas.save();
                                    canvas.translate(rectF.left, rectF.top);
                                    lcVar.F.a(canvas, clamp);
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
                    lcVar.k();
                }
            }
        } else {
            z10 = false;
        }
        z11 = false;
        r11 = z10;
        nbVar = lcVar.v1;
        if (nbVar != null) {
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
        lc lcVar = this.E0;
        y yVar = lcVar.I0;
        if (yVar != null && yVar.e) {
            float y3 = lcVar.I0.getY() + lcVar.i0.getY() + lcVar.r.getY();
            if ((motionEvent.getY() >= y3 && motionEvent.getY() <= y3 + lcVar.I0.getHeight()) || this.z0) {
                if (motionEvent.getAction() != 1 && motionEvent.getAction() != 3) {
                    z10 = true;
                }
                this.z0 = z10;
                return super.dispatchTouchEvent(motionEvent);
            }
            lcVar.I0.a(false, true);
            lcVar.m0(true);
        }
        if (this.z0 && (motionEvent.getAction() == 1 || motionEvent.getAction() == 3)) {
            this.z0 = false;
        }
        this.x0.onTouchEvent(motionEvent);
        this.w0.g0(motionEvent);
        if (motionEvent.getAction() == 1 && !this.y0) {
            if (lcVar.r.getTranslationY() <= 0.0f) {
                kb kbVar = lcVar.M0;
                if (kbVar != null && kbVar.getTranslationY() > 0.0f && !lcVar.L0) {
                    lcVar.f(!lcVar.Q1 && lcVar.M0.getTranslationY() < ((float) lcVar.M0.getPadding()));
                }
            } else if (lcVar.K > 0.4f) {
                lcVar.q(true);
            } else {
                lc.c(lcVar);
            }
            lcVar.L0 = false;
            lcVar.W = false;
            lcVar.X = false;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // org.telegram.ui.Components.aw0
    public int getBottomPadding() {
        int height = getHeight();
        lc lcVar = this.E0;
        return (height - lcVar.r.getBottom()) + lcVar.U;
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
        lc lcVar = this.E0;
        return (height - lcVar.b0) - lcVar.r.getBottom();
    }

    @Override // org.telegram.ui.Components.aw0, android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int i14;
        lz emojiView;
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        lc lcVar = this.E0;
        int i15 = lcVar.Z;
        int measuredHeight2 = lcVar.m0.getMeasuredHeight();
        if (lcVar.V) {
            i15 = 0;
        }
        int i16 = lcVar.S;
        int b10 = w7.q.b((measuredWidth - i16) / 2, lcVar.Y, (measuredWidth - lcVar.a0) - i16);
        int i17 = lcVar.S + b10;
        if (lcVar.V) {
            i14 = lcVar.T;
        } else {
            int i18 = lcVar.b0;
            int i19 = lcVar.T;
            int i20 = (((((measuredHeight - i15) - i18) - i19) - measuredHeight2) / 2) + i15;
            if (lcVar.J == 1) {
                float f7 = lcVar.H.top;
                if (i19 + f7 + measuredHeight2 < measuredHeight - i18) {
                    i15 = (int) f7;
                    i14 = lcVar.T;
                }
            }
            if (i20 - i15 >= AndroidUtilities.dp(40.0f)) {
                i15 = i20;
            }
            i14 = lcVar.T;
        }
        lcVar.r.layout(b10, i15, i17, i14 + i15 + measuredHeight2);
        lcVar.s.b.layout(0, 0, measuredWidth, measuredHeight);
        tb tbVar = lcVar.C2;
        if (tbVar != null) {
            tbVar.layout(0, 0, measuredWidth, measuredHeight);
        }
        kb kbVar = lcVar.M0;
        if (kbVar != null) {
            kbVar.layout((measuredWidth - kbVar.getMeasuredWidth()) / 2, 0, (lcVar.M0.getMeasuredWidth() + measuredWidth) / 2, measuredHeight);
        }
        bc bcVar = lcVar.c1;
        if (bcVar != null && (emojiView = bcVar.f.getEmojiView()) != null) {
            emojiView.layout(lcVar.Y, (measuredHeight - lcVar.b0) - emojiView.getMeasuredHeight(), measuredWidth - lcVar.a0, measuredHeight - lcVar.b0);
        }
        nb nbVar = lcVar.v1;
        if (nbVar != null) {
            lz lzVar = nbVar.p2;
            if (lzVar != null) {
                lzVar.layout(lcVar.Y, (measuredHeight - lcVar.b0) - lzVar.getMeasuredHeight(), measuredWidth - lcVar.a0, measuredHeight - lcVar.b0);
            }
            qk0 qk0Var = lcVar.v1.Z1;
            if (qk0Var != null) {
                int i21 = lcVar.Y;
                qk0Var.layout(i21, lcVar.Z, qk0Var.getMeasuredWidth() + i21, lcVar.v1.Z1.getMeasuredHeight() + lcVar.Z);
                yh.t3 t3Var = lcVar.v1.Z1.getReactionsWindow() != null ? lcVar.v1.Z1.getReactionsWindow().c : null;
                if (t3Var != null) {
                    int i22 = lcVar.Y;
                    t3Var.layout(i22, lcVar.Z, t3Var.getMeasuredWidth() + i22, t3Var.getMeasuredHeight() + lcVar.Z);
                }
            }
        }
        vb vbVar = lcVar.r1;
        if (vbVar != null) {
            vbVar.e.setPadding(0, lcVar.Z, 0, lcVar.b0);
            lcVar.r1.layout(0, 0, measuredWidth, measuredHeight);
            lcVar.r1.d.layout(0, 0, measuredWidth, measuredHeight);
        }
        wb wbVar = lcVar.s1;
        if (wbVar != null) {
            wbVar.f.setPadding(0, lcVar.Z, 0, lcVar.b0);
            lcVar.s1.layout(0, 0, measuredWidth, measuredHeight);
            lcVar.s1.e.layout(0, 0, measuredWidth, measuredHeight);
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
        lc lcVar = this.E0;
        int i12 = (size - lcVar.Y) - lcVar.a0;
        int i13 = lcVar.Z;
        int i14 = lcVar.b0;
        int ceil = (int) Math.ceil((i12 / 9.0f) * 16.0f);
        int dp = AndroidUtilities.dp(48.0f);
        lcVar.U = dp;
        int i15 = ceil + dp;
        int i16 = size2 - i14;
        if (i15 <= i16) {
            lcVar.S = i12;
            lcVar.T = ceil;
            lcVar.V = i15 > i16 - i13;
        } else {
            lcVar.V = false;
            lcVar.T = ((size2 - dp) - i14) - i13;
            lcVar.S = (int) Math.ceil((r9 * 9.0f) / 16.0f);
        }
        lcVar.U = Utilities.clamp((size2 - lcVar.T) - (lcVar.V ? 0 : i13), AndroidUtilities.dp(68.0f), AndroidUtilities.dp(48.0f));
        int systemUiVisibility = getSystemUiVisibility();
        setSystemUiVisibility(lcVar.V ? systemUiVisibility | 4 : systemUiVisibility & (-5));
        lcVar.r.measure(View.MeasureSpec.makeMeasureSpec(lcVar.S, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(lcVar.T + lcVar.U, TLObject.FLAG_30));
        lcVar.s.b.measure(View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(size2, TLObject.FLAG_30));
        tb tbVar = lcVar.C2;
        if (tbVar != null) {
            tbVar.measure(View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(size2, TLObject.FLAG_30));
        }
        kb kbVar = lcVar.M0;
        if (kbVar != null) {
            kbVar.measure(View.MeasureSpec.makeMeasureSpec(lcVar.S, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(size2, TLObject.FLAG_30));
        }
        bc bcVar = lcVar.c1;
        if (bcVar != null) {
            lz emojiView = bcVar.f.getEmojiView();
            R();
            AndroidUtilities.dp(20.0f);
            if (emojiView != null) {
                emojiView.measure(View.MeasureSpec.makeMeasureSpec(i12, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(emojiView.getLayoutParams().height, TLObject.FLAG_30));
            }
        }
        nb nbVar = lcVar.v1;
        if (nbVar != null) {
            lz lzVar = nbVar.p2;
            if (lzVar != null) {
                lzVar.measure(View.MeasureSpec.makeMeasureSpec(i12, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(lcVar.v1.p2.getLayoutParams().height, TLObject.FLAG_30));
            }
            qk0 qk0Var = lcVar.v1.Z1;
            if (qk0Var != null) {
                measureChild(qk0Var, i10, i11);
                if (lcVar.v1.Z1.getReactionsWindow() != null) {
                    measureChild(lcVar.v1.Z1.getReactionsWindow().c, i10, i11);
                }
            }
        }
        for (int i17 = 0; i17 < getChildCount(); i17++) {
            View childAt = getChildAt(i17);
            if (childAt instanceof t0) {
                childAt.measure(View.MeasureSpec.makeMeasureSpec(i12, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(size2, TLObject.FLAG_30));
            } else if (childAt instanceof org.telegram.ui.Components.ib) {
                childAt.measure(View.MeasureSpec.makeMeasureSpec(i12, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(Math.min(AndroidUtilities.dp(340.0f), size2 - (lcVar.V ? 0 : i13)), TLObject.FLAG_30));
            }
        }
        vb vbVar = lcVar.r1;
        if (vbVar != null) {
            vbVar.measure(View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(size2, TLObject.FLAG_30));
            lcVar.r1.d.measure(View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(size2, TLObject.FLAG_30));
        }
        wb wbVar = lcVar.s1;
        if (wbVar != null) {
            wbVar.measure(View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(size2, TLObject.FLAG_30));
            lcVar.s1.e.measure(View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(size2, TLObject.FLAG_30));
        }
        setMeasuredDimension(size, size2);
    }
}
