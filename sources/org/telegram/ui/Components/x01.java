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
import org.telegram.ui.bc1;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes3.dex */
public final class x01 extends FrameLayout {
    public final /* synthetic */ int a;
    public final Object b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ x01(int i7, Context context, Object obj) {
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
                tg.l2 l2Var = (tg.l2) this.b;
                if (l2Var.E <= 0.0f || l2Var.s == null) {
                    canvas2 = canvas;
                } else {
                    l2Var.w.reset();
                    float width = getWidth() / l2Var.n.getWidth();
                    l2Var.w.postScale(width, width);
                    l2Var.r.setLocalMatrix(l2Var.w);
                    l2Var.s.setAlpha((int) (l2Var.E * 255.0f));
                    canvas2 = canvas;
                    canvas2.drawRect(0.0f, 0.0f, getWidth(), getHeight(), l2Var.s);
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
                ((tg.l2) this.b).onBackPressed();
                return true;
            default:
                return super.dispatchKeyEventPreIme(keyEvent);
        }
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        switch (this.a) {
            case 0:
                float a10 = ((mc) this.b).a(0.03f);
                canvas.save();
                canvas.scale(a10, a10, getWidth() / 2.0f, getHeight() / 2.0f);
                super.draw(canvas);
                canvas.restore();
                break;
            default:
                super.draw(canvas);
                break;
        }
    }

    @Override // android.view.ViewGroup
    public boolean drawChild(Canvas canvas, View view, long j3) {
        switch (this.a) {
            case 3:
                if (!((org.telegram.ui.Wallet.s6) this.b).a || view.getTag() == org.telegram.ui.Wallet.s6.o0) {
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
            case 1:
                n51 n51Var = (n51) this.b;
                n51Var.m1.setBounds(0, (int) ((n51Var.r1 - n51Var.t0) - getTranslationY()), getMeasuredWidth(), getMeasuredHeight());
                n51Var.m1.draw(canvas);
                break;
            case 6:
                super.onDraw(canvas);
                org.telegram.ui.vp0 vp0Var = (org.telegram.ui.vp0) this.b;
                Paint paint = vp0Var.l1;
                tg.f1 f1Var = vp0Var.e1;
                paint.setAlpha((int) ((1.0f - vp0Var.n1) * f1Var.getAlpha() * 102.0f));
                RectF rectF = org.telegram.messenger.g0.P;
                f1Var.b(rectF);
                float translationY = f1Var.getTranslationY() + vp0Var.M0.getTranslationY() + f1Var.getTop() + r4.getTop();
                float f10 = rectF.left;
                tg.k1 k1Var = vp0Var.f1;
                rectF.set(org.telegram.messenger.g0.T1(f10, k1Var.getLeft(), vp0Var.n1), org.telegram.messenger.g0.T1(rectF.top + translationY, k1Var.getTop() - k1Var.getTranslationY(), vp0Var.n1), org.telegram.messenger.g0.T1(rectF.right, k1Var.getRight(), vp0Var.n1), org.telegram.messenger.g0.T1(translationY + rectF.bottom, k1Var.getBottom() - k1Var.getTranslationY(), vp0Var.n1));
                float L = org.telegram.messenger.g0.L(org.telegram.messenger.g0.W1(vp0Var.n1, 32, 16));
                Paint paint2 = vp0Var.m1;
                int alpha = paint2.getAlpha();
                paint2.setAlpha((int) (alpha * vp0Var.n1));
                canvas.drawRoundRect(rectF, L, L, paint2);
                paint2.setAlpha(alpha);
                canvas.drawRoundRect(rectF, L, L, paint);
                break;
            case 7:
                tg.p1 p1Var = (tg.p1) this.b;
                Rect rect = p1Var.F0;
                Rect rect2 = p1Var.E0;
                Paint paint3 = p1Var.G0;
                yt0 yt0Var = p1Var.w0;
                Bitmap bitmap = p1Var.B0;
                if (p1Var.A0 != null) {
                    canvas.save();
                    float d = p1Var.v0.d(p1Var.u0);
                    canvas.scale(1.0f - (d * 2.0f), 1.0f, yt0Var.a / 2.0f, 0.0f);
                    canvas.skew(0.0f, org.telegram.messenger.f3.A(1.0f, d, 4.0f * d, 0.25f));
                    float d2 = p1Var.z0.d(p1Var.y0);
                    if (!p1Var.y0) {
                        canvas.save();
                        paint3.setAlpha((int) ((1.0f - d2) * 255.0f));
                        if (bitmap != null) {
                            canvas.translate(r6.getWidth() / 2.0f, r6.getHeight() / 2.0f);
                            canvas.rotate(p1Var.x0);
                            float max = Math.max(yt0Var.a / bitmap.getWidth(), yt0Var.b / bitmap.getHeight());
                            canvas.scale(max, max);
                            if (p1Var.H0 != null) {
                                canvas.rotate(-p1Var.getOrientation());
                                int contentWidth = p1Var.getContentWidth();
                                int contentHeight = p1Var.getContentHeight();
                                if (((p1Var.getOrientation() + p1Var.H0.k) / 90) % 2 == 1) {
                                    contentWidth = p1Var.getContentHeight();
                                    contentHeight = p1Var.getContentWidth();
                                }
                                org.telegram.messenger.xe xeVar = p1Var.H0;
                                float f11 = xeVar.e;
                                float f12 = xeVar.f;
                                float f13 = contentWidth;
                                float f14 = contentHeight;
                                canvas.clipRect(((-contentWidth) * f11) / 2.0f, ((-contentHeight) * f12) / 2.0f, (f11 * f13) / 2.0f, (f12 * f14) / 2.0f);
                                float f15 = p1Var.H0.c;
                                canvas.scale(f15, f15);
                                org.telegram.messenger.xe xeVar2 = p1Var.H0;
                                canvas.translate(xeVar2.a * f13, xeVar2.b * f14);
                                canvas.rotate(p1Var.H0.d + r4.k);
                                if (p1Var.H0.l) {
                                    canvas.scale(-1.0f, 1.0f);
                                }
                                canvas.rotate(p1Var.getOrientation());
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
                tg.g2 g2Var = (tg.g2) this.b;
                ImageReceiver imageReceiver = g2Var.y0;
                yt0 yt0Var2 = g2Var.w0;
                if (g2Var.x0 != null) {
                    canvas.save();
                    float d10 = g2Var.v0.d(g2Var.u0);
                    canvas.scale(1.0f - (d10 * 2.0f), 1.0f, yt0Var2.a / 2.0f, 0.0f);
                    canvas.skew(0.0f, org.telegram.messenger.f3.A(1.0f, d10, 4.0f * d10, 0.25f));
                    imageReceiver.y0(0.0f, 0.0f, (int) yt0Var2.a, (int) yt0Var2.b);
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
        ug.q0 q0Var;
        ug.q0 q0Var2;
        switch (this.a) {
            case 10:
                super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
                accessibilityNodeInfo.setClassName("android.widget.Button");
                ug.r0 r0Var = (ug.r0) this.b;
                CharSequence text = (!r0Var.r || (q0Var2 = r0Var.h) == null) ? null : q0Var2.getText();
                if (text == null && (q0Var = r0Var.f) != null) {
                    text = q0Var.getText();
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
            case 1:
                n51 n51Var = (n51) this.b;
                if (motionEvent.getAction() != 0 || n51Var.r1 == 0 || motionEvent.getY() >= n51Var.r1) {
                    return super.onInterceptTouchEvent(motionEvent);
                }
                n51Var.dismiss();
                return true;
            case 2:
            default:
                return super.onInterceptTouchEvent(motionEvent);
            case 3:
                return ((org.telegram.ui.Wallet.s6) this.b).a || super.onInterceptTouchEvent(motionEvent);
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i7, int i10) {
        float f10;
        float top;
        int measuredHeight;
        switch (this.a) {
            case 11:
                ug.y0 y0Var = (ug.y0) this.b;
                if (y0Var.K0) {
                    y0Var.u1 = View.MeasureSpec.getSize(i7);
                } else {
                    y0Var.u1 = (int) (Math.min(View.MeasureSpec.getSize(i7), View.MeasureSpec.getSize(i10)) * 0.8f);
                }
                super.onMeasure(i7, i10);
                break;
            case 12:
                super.onMeasure(i7, i10);
                ug.h1 h1Var = (ug.h1) ((di.l4) this.b).d;
                di.bc bcVar = h1Var.n2;
                if (bcVar == null) {
                    View view = h1Var.x2;
                    if (view == null) {
                        f10 = 0.0f;
                        h1Var.m2.setTranslationY(f10 - (r4.getMeasuredHeight() / 2.0f));
                        break;
                    } else {
                        top = view.getTop();
                        measuredHeight = h1Var.x2.getMeasuredHeight();
                    }
                } else {
                    top = bcVar.getTop();
                    measuredHeight = h1Var.n2.getMeasuredHeight();
                }
                f10 = (measuredHeight / 2.0f) + top;
                h1Var.m2.setTranslationY(f10 - (r4.getMeasuredHeight() / 2.0f));
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
            case 1:
                return !((n51) this.b).J && super.onTouchEvent(motionEvent);
            case 2:
                ((bc1) this.b).U.onTouchEvent(motionEvent);
                return super.onTouchEvent(motionEvent);
            case 6:
                if (motionEvent.getActionMasked() == 0) {
                    org.telegram.ui.vp0 vp0Var = (org.telegram.ui.vp0) this.b;
                    if (vp0Var.o1) {
                        vp0Var.z0(false);
                        return true;
                    }
                }
                return super.onTouchEvent(motionEvent);
            default:
                return super.onTouchEvent(motionEvent);
        }
    }

    @Override // android.view.View
    public void onWindowFocusChanged(boolean z10) {
        switch (this.a) {
            case 5:
                super.onWindowFocusChanged(z10);
                if (z10) {
                    ((org.telegram.ui.Wallet.na) this.b).k0(true);
                    break;
                }
                break;
            default:
                super.onWindowFocusChanged(z10);
                break;
        }
    }

    @Override // android.view.View
    public void setPressed(boolean z10) {
        switch (this.a) {
            case 0:
                super.setPressed(z10);
                ((mc) this.b).c(z10);
                break;
            default:
                super.setPressed(z10);
                break;
        }
    }

    @Override // android.view.View
    public void setTranslationY(float f10) {
        switch (this.a) {
            case 1:
                super.setTranslationY(f10);
                n51.J0((n51) this.b);
                break;
            default:
                super.setTranslationY(f10);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x01(tg.g2 g2Var, Context context) {
        super(context);
        this.a = 8;
        this.b = g2Var;
        setWillNotDraw(false);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x01(tg.p1 p1Var, Context context) {
        super(context);
        this.a = 7;
        this.b = p1Var;
        setWillNotDraw(false);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x01(Context context, int i7) {
        super(context);
        this.a = i7;
        switch (i7) {
            case 4:
                super(context);
                this.b = new Path();
                setClipChildren(false);
                setClipToPadding(false);
                break;
            default:
                this.b = new mc(this);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x01(org.telegram.ui.vp0 vp0Var, Context context) {
        super(context);
        this.a = 6;
        this.b = vp0Var;
        setWillNotDraw(false);
    }
}
