package org.telegram.ui.Wallet;

import ai.zd;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.view.KeyEvent;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MediaController;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.Components.dw0;

/* compiled from: r8-map-id-bcc7d273da888d5c27994201329e5b838e55754b73312241608ee42846efd426 */
/* loaded from: classes4.dex */
public final class p9 extends FrameLayout {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ p9(Object obj, Context context, int i10) {
        super(context);
        this.a = i10;
        this.b = obj;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        Canvas canvas2;
        switch (this.a) {
            case 3:
                rg.s2 s2Var = (rg.s2) this.b;
                if (s2Var.y <= 0.0f || s2Var.s == null) {
                    canvas2 = canvas;
                } else {
                    s2Var.v.reset();
                    float width = getWidth() / s2Var.n.getWidth();
                    s2Var.v.postScale(width, width);
                    s2Var.r.setLocalMatrix(s2Var.v);
                    s2Var.s.setAlpha((int) (s2Var.y * 255.0f));
                    canvas2 = canvas;
                    canvas2.drawRect(0.0f, 0.0f, getWidth(), getHeight(), s2Var.s);
                }
                super.dispatchDraw(canvas2);
                break;
            default:
                super.dispatchDraw(canvas);
                break;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchKeyEventPreIme(KeyEvent keyEvent) {
        switch (this.a) {
            case 3:
                if (keyEvent == null || keyEvent.getKeyCode() != 4 || keyEvent.getAction() != 1) {
                    return super.dispatchKeyEventPreIme(keyEvent);
                }
                ((rg.s2) this.b).onBackPressed();
                return true;
            default:
                return super.dispatchKeyEventPreIme(keyEvent);
        }
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        switch (this.a) {
            case 1:
                rg.x1 x1Var = (rg.x1) this.b;
                Rect rect = x1Var.E0;
                Rect rect2 = x1Var.D0;
                Paint paint = x1Var.F0;
                dw0 dw0Var = x1Var.v0;
                Bitmap bitmap = x1Var.A0;
                if (x1Var.z0 != null) {
                    canvas.save();
                    float e = x1Var.u0.e(x1Var.t0);
                    canvas.scale(1.0f - (e * 2.0f), 1.0f, dw0Var.a / 2.0f, 0.0f);
                    canvas.skew(0.0f, org.telegram.messenger.g0.z(1.0f, e, 4.0f * e, 0.25f));
                    float e7 = x1Var.y0.e(x1Var.x0);
                    if (!x1Var.x0) {
                        canvas.save();
                        paint.setAlpha((int) ((1.0f - e7) * 255.0f));
                        if (bitmap != null) {
                            canvas.translate(r6.getWidth() / 2.0f, r6.getHeight() / 2.0f);
                            canvas.rotate(x1Var.w0);
                            float max = Math.max(dw0Var.a / bitmap.getWidth(), dw0Var.b / bitmap.getHeight());
                            canvas.scale(max, max);
                            if (x1Var.G0 != null) {
                                canvas.rotate(-x1Var.getOrientation());
                                int contentWidth = x1Var.getContentWidth();
                                int contentHeight = x1Var.getContentHeight();
                                if (((x1Var.getOrientation() + x1Var.G0.transformRotation) / 90) % 2 == 1) {
                                    contentWidth = x1Var.getContentHeight();
                                    contentHeight = x1Var.getContentWidth();
                                }
                                MediaController.CropState cropState = x1Var.G0;
                                float f7 = cropState.cropPw;
                                float f10 = cropState.cropPh;
                                float f11 = contentWidth;
                                float f12 = contentHeight;
                                canvas.clipRect(((-contentWidth) * f7) / 2.0f, ((-contentHeight) * f10) / 2.0f, (f7 * f11) / 2.0f, (f10 * f12) / 2.0f);
                                float f13 = x1Var.G0.cropScale;
                                canvas.scale(f13, f13);
                                MediaController.CropState cropState2 = x1Var.G0;
                                canvas.translate(cropState2.cropPx * f11, cropState2.cropPy * f12);
                                canvas.rotate(x1Var.G0.cropRotate + r4.transformRotation);
                                if (x1Var.G0.mirrored) {
                                    canvas.scale(-1.0f, 1.0f);
                                }
                                canvas.rotate(x1Var.getOrientation());
                            }
                            canvas.translate((-bitmap.getWidth()) / 2.0f, (-bitmap.getHeight()) / 2.0f);
                            rect2.set(0, 0, bitmap.getWidth(), bitmap.getHeight());
                            rect.set(0, 0, bitmap.getWidth(), bitmap.getHeight());
                            canvas.drawBitmap(bitmap, rect2, rect, paint);
                        }
                        canvas.restore();
                    }
                    canvas.restore();
                    break;
                }
                break;
            case 2:
                rg.n2 n2Var = (rg.n2) this.b;
                ImageReceiver imageReceiver = n2Var.x0;
                dw0 dw0Var2 = n2Var.v0;
                if (n2Var.w0 != null) {
                    canvas.save();
                    float e10 = n2Var.u0.e(n2Var.t0);
                    canvas.scale(1.0f - (e10 * 2.0f), 1.0f, dw0Var2.a / 2.0f, 0.0f);
                    canvas.skew(0.0f, org.telegram.messenger.g0.z(1.0f, e10, 4.0f * e10, 0.25f));
                    imageReceiver.setImageCoords(0.0f, 0.0f, (int) dw0Var2.a, (int) dw0Var2.b);
                    imageReceiver.draw(canvas);
                    canvas.restore();
                    break;
                }
                break;
            default:
                super.onDraw(canvas);
                break;
        }
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        sg.p0 p0Var;
        sg.p0 p0Var2;
        switch (this.a) {
            case 4:
                super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
                accessibilityNodeInfo.setClassName("android.widget.Button");
                sg.q0 q0Var = (sg.q0) this.b;
                CharSequence text = (!q0Var.h || (p0Var2 = q0Var.e) == null) ? null : p0Var2.getText();
                if (text == null && (p0Var = q0Var.d) != null) {
                    text = p0Var.getText();
                }
                if (text != null) {
                    accessibilityNodeInfo.setText(text);
                    if (getContentDescription() == null) {
                        accessibilityNodeInfo.setContentDescription(text);
                        break;
                    }
                }
                break;
            default:
                super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
                break;
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i10, int i11) {
        boolean z10;
        float f7;
        float top;
        int measuredHeight;
        switch (this.a) {
            case 5:
                sg.y0 y0Var = (sg.y0) this.b;
                z10 = ((org.telegram.ui.ActionBar.f3) y0Var).isPortrait;
                if (z10) {
                    y0Var.s = View.MeasureSpec.getSize(i10);
                } else {
                    y0Var.s = (int) (Math.min(View.MeasureSpec.getSize(i10), View.MeasureSpec.getSize(i11)) * 0.8f);
                }
                super.onMeasure(i10, i11);
                break;
            case 6:
                super.onMeasure(i10, i11);
                sg.m1 m1Var = ((sg.l1) this.b).c;
                zd zdVar = m1Var.r0;
                if (zdVar == null) {
                    View view = m1Var.B0;
                    if (view == null) {
                        f7 = 0.0f;
                        m1Var.q0.setTranslationY(f7 - (r4.getMeasuredHeight() / 2.0f));
                        break;
                    } else {
                        top = view.getTop();
                        measuredHeight = m1Var.B0.getMeasuredHeight();
                    }
                } else {
                    top = zdVar.getTop();
                    measuredHeight = m1Var.r0.getMeasuredHeight();
                }
                f7 = (measuredHeight / 2.0f) + top;
                m1Var.q0.setTranslationY(f7 - (r4.getMeasuredHeight() / 2.0f));
            case 7:
                super.onMeasure(i10, i11);
                ((yh.g1) this.b).K.measure(View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), TLObject.FLAG_30));
                break;
            default:
                super.onMeasure(i10, i11);
                break;
        }
    }

    @Override // android.view.View
    public void onWindowFocusChanged(boolean z10) {
        switch (this.a) {
            case 0:
                super.onWindowFocusChanged(z10);
                if (z10) {
                    ((r9) this.b).e0(true);
                    break;
                }
                break;
            default:
                super.onWindowFocusChanged(z10);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p9(rg.n2 n2Var, Context context) {
        super(context);
        this.a = 2;
        this.b = n2Var;
        setWillNotDraw(false);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p9(rg.x1 x1Var, Context context) {
        super(context);
        this.a = 1;
        this.b = x1Var;
        setWillNotDraw(false);
    }
}
