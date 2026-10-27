package org.telegram.ui.Wallet;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import bi.qd;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MediaController;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.Components.rw0;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes4.dex */
public final class p5 extends FrameLayout {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ p5(Object obj, Context context, int i10) {
        super(context);
        this.a = i10;
        this.b = obj;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        Canvas canvas2;
        switch (this.a) {
            case 4:
                sg.u2 u2Var = (sg.u2) this.b;
                if (u2Var.y <= 0.0f || u2Var.s == null) {
                    canvas2 = canvas;
                } else {
                    u2Var.v.reset();
                    float width = getWidth() / u2Var.n.getWidth();
                    u2Var.v.postScale(width, width);
                    u2Var.r.setLocalMatrix(u2Var.v);
                    u2Var.s.setAlpha((int) (u2Var.y * 255.0f));
                    canvas2 = canvas;
                    canvas2.drawRect(0.0f, 0.0f, getWidth(), getHeight(), u2Var.s);
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
            case 4:
                if (keyEvent == null || keyEvent.getKeyCode() != 4 || keyEvent.getAction() != 1) {
                    return super.dispatchKeyEventPreIme(keyEvent);
                }
                ((sg.u2) this.b).onBackPressed();
                return true;
            default:
                return super.dispatchKeyEventPreIme(keyEvent);
        }
    }

    @Override // android.view.ViewGroup
    public boolean drawChild(Canvas canvas, View view, long j10) {
        switch (this.a) {
            case 0:
                if (!((r5) this.b).a || view.getTag() == r5.n0) {
                    return super.drawChild(canvas, view, j10);
                }
                return false;
            default:
                return super.drawChild(canvas, view, j10);
        }
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        switch (this.a) {
            case 2:
                sg.y1 y1Var = (sg.y1) this.b;
                Rect rect = y1Var.E0;
                Rect rect2 = y1Var.D0;
                Paint paint = y1Var.F0;
                rw0 rw0Var = y1Var.v0;
                Bitmap bitmap = y1Var.A0;
                if (y1Var.z0 != null) {
                    canvas.save();
                    float e = y1Var.u0.e(y1Var.t0);
                    canvas.scale(1.0f - (e * 2.0f), 1.0f, rw0Var.a / 2.0f, 0.0f);
                    canvas.skew(0.0f, org.telegram.messenger.t.A(1.0f, e, 4.0f * e, 0.25f));
                    float e10 = y1Var.y0.e(y1Var.x0);
                    if (!y1Var.x0) {
                        canvas.save();
                        paint.setAlpha((int) ((1.0f - e10) * 255.0f));
                        if (bitmap != null) {
                            canvas.translate(r6.getWidth() / 2.0f, r6.getHeight() / 2.0f);
                            canvas.rotate(y1Var.w0);
                            float max = Math.max(rw0Var.a / bitmap.getWidth(), rw0Var.b / bitmap.getHeight());
                            canvas.scale(max, max);
                            if (y1Var.G0 != null) {
                                canvas.rotate(-y1Var.getOrientation());
                                int contentWidth = y1Var.getContentWidth();
                                int contentHeight = y1Var.getContentHeight();
                                if (((y1Var.getOrientation() + y1Var.G0.transformRotation) / 90) % 2 == 1) {
                                    contentWidth = y1Var.getContentHeight();
                                    contentHeight = y1Var.getContentWidth();
                                }
                                MediaController.CropState cropState = y1Var.G0;
                                float f7 = cropState.cropPw;
                                float f10 = cropState.cropPh;
                                float f11 = contentWidth;
                                float f12 = contentHeight;
                                canvas.clipRect(((-contentWidth) * f7) / 2.0f, ((-contentHeight) * f10) / 2.0f, (f7 * f11) / 2.0f, (f10 * f12) / 2.0f);
                                float f13 = y1Var.G0.cropScale;
                                canvas.scale(f13, f13);
                                MediaController.CropState cropState2 = y1Var.G0;
                                canvas.translate(cropState2.cropPx * f11, cropState2.cropPy * f12);
                                canvas.rotate(y1Var.G0.cropRotate + r4.transformRotation);
                                if (y1Var.G0.mirrored) {
                                    canvas.scale(-1.0f, 1.0f);
                                }
                                canvas.rotate(y1Var.getOrientation());
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
            case 3:
                sg.p2 p2Var = (sg.p2) this.b;
                ImageReceiver imageReceiver = p2Var.x0;
                rw0 rw0Var2 = p2Var.v0;
                if (p2Var.w0 != null) {
                    canvas.save();
                    float e11 = p2Var.u0.e(p2Var.t0);
                    canvas.scale(1.0f - (e11 * 2.0f), 1.0f, rw0Var2.a / 2.0f, 0.0f);
                    canvas.skew(0.0f, org.telegram.messenger.t.A(1.0f, e11, 4.0f * e11, 0.25f));
                    imageReceiver.setImageCoords(0.0f, 0.0f, (int) rw0Var2.a, (int) rw0Var2.b);
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
        tg.o0 o0Var;
        tg.o0 o0Var2;
        switch (this.a) {
            case 5:
                super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
                accessibilityNodeInfo.setClassName("android.widget.Button");
                tg.p0 p0Var = (tg.p0) this.b;
                CharSequence text = (!p0Var.r || (o0Var2 = p0Var.h) == null) ? null : o0Var2.getText();
                if (text == null && (o0Var = p0Var.f) != null) {
                    text = o0Var.getText();
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

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        switch (this.a) {
            case 0:
                return ((r5) this.b).a || super.onInterceptTouchEvent(motionEvent);
            default:
                return super.onInterceptTouchEvent(motionEvent);
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i10, int i11) {
        boolean z10;
        float f7;
        float top;
        int measuredHeight;
        switch (this.a) {
            case 6:
                tg.y0 y0Var = (tg.y0) this.b;
                z10 = ((org.telegram.ui.ActionBar.k3) y0Var).isPortrait;
                if (z10) {
                    y0Var.s = View.MeasureSpec.getSize(i10);
                } else {
                    y0Var.s = (int) (Math.min(View.MeasureSpec.getSize(i10), View.MeasureSpec.getSize(i11)) * 0.8f);
                }
                super.onMeasure(i10, i11);
                break;
            case 7:
                super.onMeasure(i10, i11);
                tg.m1 m1Var = ((tg.l1) this.b).c;
                qd qdVar = m1Var.r0;
                if (qdVar == null) {
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
                    top = qdVar.getTop();
                    measuredHeight = m1Var.r0.getMeasuredHeight();
                }
                f7 = (measuredHeight / 2.0f) + top;
                m1Var.q0.setTranslationY(f7 - (r4.getMeasuredHeight() / 2.0f));
            case 8:
                super.onMeasure(i10, i11);
                ((zh.g1) this.b).K.measure(View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), TLObject.FLAG_30));
                break;
            default:
                super.onMeasure(i10, i11);
                break;
        }
    }

    @Override // android.view.View
    public void onWindowFocusChanged(boolean z10) {
        switch (this.a) {
            case 1:
                super.onWindowFocusChanged(z10);
                if (z10) {
                    ((r9) this.b).g0(true);
                    break;
                }
                break;
            default:
                super.onWindowFocusChanged(z10);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p5(sg.p2 p2Var, Context context) {
        super(context);
        this.a = 3;
        this.b = p2Var;
        setWillNotDraw(false);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p5(sg.y1 y1Var, Context context) {
        super(context);
        this.a = 2;
        this.b = y1Var;
        setWillNotDraw(false);
    }
}
