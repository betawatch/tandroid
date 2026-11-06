package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.yb1;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes3.dex */
public final class v41 extends FrameLayout {
    public final /* synthetic */ int a;
    public final Object b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ v41(int i7, Context context, Object obj) {
        super(context);
        this.a = i7;
        this.b = obj;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        Canvas canvas2;
        switch (this.a) {
            case 4:
                int save = canvas.save();
                canvas.clipPath((Path) this.b);
                super.dispatchDraw(canvas);
                canvas.restoreToCount(save);
                break;
            case 9:
                tg.i2 i2Var = (tg.i2) this.b;
                if (i2Var.D <= 0.0f || i2Var.s == null) {
                    canvas2 = canvas;
                } else {
                    i2Var.w.reset();
                    float width = getWidth() / i2Var.n.getWidth();
                    i2Var.w.postScale(width, width);
                    i2Var.r.setLocalMatrix(i2Var.w);
                    i2Var.s.setAlpha((int) (i2Var.D * 255.0f));
                    canvas2 = canvas;
                    canvas2.drawRect(0.0f, 0.0f, getWidth(), getHeight(), i2Var.s);
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
            case 9:
                if (keyEvent == null || keyEvent.getKeyCode() != 4 || keyEvent.getAction() != 1) {
                    return super.dispatchKeyEventPreIme(keyEvent);
                }
                ((tg.i2) this.b).onBackPressed();
                return true;
            default:
                return super.dispatchKeyEventPreIme(keyEvent);
        }
    }

    @Override // android.view.ViewGroup
    public boolean drawChild(Canvas canvas, View view, long j3) {
        switch (this.a) {
            case 3:
                if (!((org.telegram.ui.Wallet.c6) this.b).a || view.getTag() == org.telegram.ui.Wallet.c6.n0) {
                    return super.drawChild(canvas, view, j3);
                }
                return false;
            default:
                return super.drawChild(canvas, view, j3);
        }
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        switch (this.a) {
            case 0:
                x41 x41Var = (x41) this.b;
                x41Var.i1.setBounds(0, (int) ((x41Var.n1 - x41Var.s0) - getTranslationY()), getMeasuredWidth(), getMeasuredHeight());
                x41Var.i1.draw(canvas);
                break;
            case 6:
                super.onDraw(canvas);
                org.telegram.ui.up0 up0Var = (org.telegram.ui.up0) this.b;
                Paint paint = up0Var.k1;
                tg.e1 e1Var = up0Var.d1;
                paint.setAlpha((int) ((1.0f - up0Var.m1) * e1Var.getAlpha() * 102.0f));
                RectF rectF = org.telegram.messenger.g0.P;
                e1Var.b(rectF);
                float translationY = e1Var.getTranslationY() + up0Var.L0.getTranslationY() + e1Var.getTop() + r4.getTop();
                float f10 = rectF.left;
                tg.j1 j1Var = up0Var.e1;
                rectF.set(org.telegram.messenger.g0.T1(f10, j1Var.getLeft(), up0Var.m1), org.telegram.messenger.g0.T1(rectF.top + translationY, j1Var.getTop() - j1Var.getTranslationY(), up0Var.m1), org.telegram.messenger.g0.T1(rectF.right, j1Var.getRight(), up0Var.m1), org.telegram.messenger.g0.T1(translationY + rectF.bottom, j1Var.getBottom() - j1Var.getTranslationY(), up0Var.m1));
                float L = org.telegram.messenger.g0.L(org.telegram.messenger.g0.W1(up0Var.m1, 32, 16));
                Paint paint2 = up0Var.l1;
                int alpha = paint2.getAlpha();
                paint2.setAlpha((int) (alpha * up0Var.m1));
                canvas.drawRoundRect(rectF, L, L, paint2);
                paint2.setAlpha(alpha);
                canvas.drawRoundRect(rectF, L, L, paint);
                break;
            case 7:
                tg.n1 n1Var = (tg.n1) this.b;
                Rect rect = n1Var.E0;
                Rect rect2 = n1Var.D0;
                Paint paint3 = n1Var.F0;
                mt0 mt0Var = n1Var.v0;
                Bitmap bitmap = n1Var.A0;
                if (n1Var.z0 != null) {
                    canvas.save();
                    float d = n1Var.u0.d(n1Var.t0);
                    canvas.scale(1.0f - (d * 2.0f), 1.0f, mt0Var.a / 2.0f, 0.0f);
                    canvas.skew(0.0f, org.telegram.messenger.k5.A(1.0f, d, 4.0f * d, 0.25f));
                    float d2 = n1Var.y0.d(n1Var.x0);
                    if (!n1Var.x0) {
                        canvas.save();
                        paint3.setAlpha((int) ((1.0f - d2) * 255.0f));
                        if (bitmap != null) {
                            canvas.translate(r6.getWidth() / 2.0f, r6.getHeight() / 2.0f);
                            canvas.rotate(n1Var.w0);
                            float max = Math.max(mt0Var.a / bitmap.getWidth(), mt0Var.b / bitmap.getHeight());
                            canvas.scale(max, max);
                            if (n1Var.G0 != null) {
                                canvas.rotate(-n1Var.getOrientation());
                                int contentWidth = n1Var.getContentWidth();
                                int contentHeight = n1Var.getContentHeight();
                                if (((n1Var.getOrientation() + n1Var.G0.k) / 90) % 2 == 1) {
                                    contentWidth = n1Var.getContentHeight();
                                    contentHeight = n1Var.getContentWidth();
                                }
                                org.telegram.messenger.ye yeVar = n1Var.G0;
                                float f11 = yeVar.e;
                                float f12 = yeVar.f;
                                float f13 = contentWidth;
                                float f14 = contentHeight;
                                canvas.clipRect(((-contentWidth) * f11) / 2.0f, ((-contentHeight) * f12) / 2.0f, (f11 * f13) / 2.0f, (f12 * f14) / 2.0f);
                                float f15 = n1Var.G0.c;
                                canvas.scale(f15, f15);
                                org.telegram.messenger.ye yeVar2 = n1Var.G0;
                                canvas.translate(yeVar2.a * f13, yeVar2.b * f14);
                                canvas.rotate(n1Var.G0.d + r4.k);
                                if (n1Var.G0.l) {
                                    canvas.scale(-1.0f, 1.0f);
                                }
                                canvas.rotate(n1Var.getOrientation());
                            }
                            canvas.translate((-bitmap.getWidth()) / 2.0f, (-bitmap.getHeight()) / 2.0f);
                            rect2.set(0, 0, bitmap.getWidth(), bitmap.getHeight());
                            rect.set(0, 0, bitmap.getWidth(), bitmap.getHeight());
                            canvas.drawBitmap(bitmap, rect2, rect, paint3);
                        }
                        canvas.restore();
                    }
                    canvas.restore();
                    break;
                }
                break;
            case 8:
                tg.d2 d2Var = (tg.d2) this.b;
                ImageReceiver imageReceiver = d2Var.x0;
                mt0 mt0Var2 = d2Var.v0;
                if (d2Var.w0 != null) {
                    canvas.save();
                    float d10 = d2Var.u0.d(d2Var.t0);
                    canvas.scale(1.0f - (d10 * 2.0f), 1.0f, mt0Var2.a / 2.0f, 0.0f);
                    canvas.skew(0.0f, org.telegram.messenger.k5.A(1.0f, d10, 4.0f * d10, 0.25f));
                    imageReceiver.y0(0.0f, 0.0f, (int) mt0Var2.a, (int) mt0Var2.b);
                    imageReceiver.h(canvas, null);
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
        ug.o0 o0Var;
        ug.o0 o0Var2;
        switch (this.a) {
            case 10:
                super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
                accessibilityNodeInfo.setClassName("android.widget.Button");
                ug.p0 p0Var = (ug.p0) this.b;
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
                x41 x41Var = (x41) this.b;
                if (motionEvent.getAction() != 0 || x41Var.n1 == 0 || motionEvent.getY() >= x41Var.n1) {
                    return super.onInterceptTouchEvent(motionEvent);
                }
                x41Var.dismiss();
                return true;
            case 3:
                return ((org.telegram.ui.Wallet.c6) this.b).a || super.onInterceptTouchEvent(motionEvent);
            default:
                return super.onInterceptTouchEvent(motionEvent);
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i7, int i10) {
        float f10;
        float top;
        int measuredHeight;
        switch (this.a) {
            case 2:
                super.onMeasure(i7, i10);
                setMeasuredDimension(getMeasuredWidth(), (int) Math.ceil(((org.telegram.ui.Wallet.y5) this.b).S.c(org.telegram.messenger.g0.L(4.0f))));
                break;
            case 11:
                ug.w0 w0Var = (ug.w0) this.b;
                if (w0Var.J0) {
                    w0Var.q1 = View.MeasureSpec.getSize(i7);
                } else {
                    w0Var.q1 = (int) (Math.min(View.MeasureSpec.getSize(i7), View.MeasureSpec.getSize(i10)) * 0.8f);
                }
                super.onMeasure(i7, i10);
                break;
            case 12:
                super.onMeasure(i7, i10);
                ug.f1 f1Var = (ug.f1) ((bi.k5) this.b).d;
                bi.qd qdVar = f1Var.j2;
                if (qdVar == null) {
                    View view = f1Var.t2;
                    if (view == null) {
                        f10 = 0.0f;
                        f1Var.i2.setTranslationY(f10 - (r4.getMeasuredHeight() / 2.0f));
                        break;
                    } else {
                        top = view.getTop();
                        measuredHeight = f1Var.t2.getMeasuredHeight();
                    }
                } else {
                    top = qdVar.getTop();
                    measuredHeight = f1Var.j2.getMeasuredHeight();
                }
                f10 = (measuredHeight / 2.0f) + top;
                f1Var.i2.setTranslationY(f10 - (r4.getMeasuredHeight() / 2.0f));
            case 13:
                super.onMeasure(i7, i10);
                ((zh.z0) this.b).K.measure(View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), TLObject.FLAG_30));
                break;
            default:
                super.onMeasure(i7, i10);
                break;
        }
    }

    @Override // android.view.View
    public void onSizeChanged(int i7, int i10, int i11, int i12) {
        switch (this.a) {
            case 4:
                super.onSizeChanged(i7, i10, i11, i12);
                Path path = (Path) this.b;
                float paddingLeft = (i7 - getPaddingLeft()) - getPaddingRight();
                float paddingTop = (i10 - getPaddingTop()) - getPaddingBottom();
                path.rewind();
                path.addRoundRect(0.0f, 0.0f, paddingLeft, paddingTop, (paddingLeft * 0.15f) / 2.0f, (0.15f * paddingTop) / 1.212122f, Path.Direction.CW);
                path.offset(getPaddingLeft(), getPaddingTop());
                break;
            default:
                super.onSizeChanged(i7, i10, i11, i12);
                break;
        }
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        switch (this.a) {
            case 0:
                return !((x41) this.b).I && super.onTouchEvent(motionEvent);
            case 1:
                ((yb1) this.b).T.onTouchEvent(motionEvent);
                return super.onTouchEvent(motionEvent);
            case 6:
                if (motionEvent.getActionMasked() == 0) {
                    org.telegram.ui.up0 up0Var = (org.telegram.ui.up0) this.b;
                    if (up0Var.n1) {
                        up0Var.z0(false);
                        return true;
                    }
                }
                return super.onTouchEvent(motionEvent);
            default:
                return super.onTouchEvent(motionEvent);
        }
    }

    @Override // android.view.View
    public void onWindowFocusChanged(boolean z9) {
        switch (this.a) {
            case 5:
                super.onWindowFocusChanged(z9);
                if (z9) {
                    ((org.telegram.ui.Wallet.x9) this.b).k0(true);
                    break;
                }
                break;
            default:
                super.onWindowFocusChanged(z9);
                break;
        }
    }

    @Override // android.view.View
    public void setTranslationY(float f10) {
        switch (this.a) {
            case 0:
                super.setTranslationY(f10);
                x41.I0((x41) this.b);
                break;
            default:
                super.setTranslationY(f10);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v41(tg.d2 d2Var, Context context) {
        super(context);
        this.a = 8;
        this.b = d2Var;
        setWillNotDraw(false);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v41(tg.n1 n1Var, Context context) {
        super(context);
        this.a = 7;
        this.b = n1Var;
        setWillNotDraw(false);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v41(org.telegram.ui.up0 up0Var, Context context) {
        super(context);
        this.a = 6;
        this.b = up0Var;
        setWillNotDraw(false);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v41(Context context) {
        super(context);
        this.a = 4;
        this.b = new Path();
        setClipChildren(false);
        setClipToPadding(false);
    }
}
