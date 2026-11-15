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
import org.telegram.ui.yb1;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class m01 extends FrameLayout {
    public final /* synthetic */ int a;
    public final Object b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ m01(int i7, Context context, Object obj) {
        super(context);
        this.a = i7;
        this.b = obj;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        Canvas canvas2;
        switch (this.a) {
            case 5:
                int save = canvas.save();
                canvas.clipPath((Path) this.b);
                super.dispatchDraw(canvas);
                canvas.restoreToCount(save);
                break;
            case 10:
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
            case 10:
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
                float a10 = ((dc) this.b).a(0.03f);
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
            case 4:
                if (!((org.telegram.ui.Wallet.c6) this.b).a || view.getTag() == org.telegram.ui.Wallet.c6.o0) {
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
                a51 a51Var = (a51) this.b;
                a51Var.m1.setBounds(0, (int) ((a51Var.r1 - a51Var.t0) - getTranslationY()), getMeasuredWidth(), getMeasuredHeight());
                a51Var.m1.draw(canvas);
                break;
            case 7:
                super.onDraw(canvas);
                org.telegram.ui.tp0 tp0Var = (org.telegram.ui.tp0) this.b;
                Paint paint = tp0Var.l1;
                tg.e1 e1Var = tp0Var.e1;
                paint.setAlpha((int) ((1.0f - tp0Var.n1) * e1Var.getAlpha() * 102.0f));
                RectF rectF = org.telegram.messenger.g0.P;
                e1Var.b(rectF);
                float translationY = e1Var.getTranslationY() + tp0Var.M0.getTranslationY() + e1Var.getTop() + r4.getTop();
                float f10 = rectF.left;
                tg.j1 j1Var = tp0Var.f1;
                rectF.set(org.telegram.messenger.g0.T1(f10, j1Var.getLeft(), tp0Var.n1), org.telegram.messenger.g0.T1(rectF.top + translationY, j1Var.getTop() - j1Var.getTranslationY(), tp0Var.n1), org.telegram.messenger.g0.T1(rectF.right, j1Var.getRight(), tp0Var.n1), org.telegram.messenger.g0.T1(translationY + rectF.bottom, j1Var.getBottom() - j1Var.getTranslationY(), tp0Var.n1));
                float L = org.telegram.messenger.g0.L(org.telegram.messenger.g0.W1(tp0Var.n1, 32, 16));
                Paint paint2 = tp0Var.m1;
                int alpha = paint2.getAlpha();
                paint2.setAlpha((int) (alpha * tp0Var.n1));
                canvas.drawRoundRect(rectF, L, L, paint2);
                paint2.setAlpha(alpha);
                canvas.drawRoundRect(rectF, L, L, paint);
                break;
            case 8:
                tg.n1 n1Var = (tg.n1) this.b;
                Rect rect = n1Var.F0;
                Rect rect2 = n1Var.E0;
                Paint paint3 = n1Var.G0;
                nt0 nt0Var = n1Var.w0;
                Bitmap bitmap = n1Var.B0;
                if (n1Var.A0 != null) {
                    canvas.save();
                    float d = n1Var.v0.d(n1Var.u0);
                    canvas.scale(1.0f - (d * 2.0f), 1.0f, nt0Var.a / 2.0f, 0.0f);
                    canvas.skew(0.0f, org.telegram.messenger.k5.A(1.0f, d, 4.0f * d, 0.25f));
                    float d2 = n1Var.z0.d(n1Var.y0);
                    if (!n1Var.y0) {
                        canvas.save();
                        paint3.setAlpha((int) ((1.0f - d2) * 255.0f));
                        if (bitmap != null) {
                            canvas.translate(r6.getWidth() / 2.0f, r6.getHeight() / 2.0f);
                            canvas.rotate(n1Var.x0);
                            float max = Math.max(nt0Var.a / bitmap.getWidth(), nt0Var.b / bitmap.getHeight());
                            canvas.scale(max, max);
                            if (n1Var.H0 != null) {
                                canvas.rotate(-n1Var.getOrientation());
                                int contentWidth = n1Var.getContentWidth();
                                int contentHeight = n1Var.getContentHeight();
                                if (((n1Var.getOrientation() + n1Var.H0.k) / 90) % 2 == 1) {
                                    contentWidth = n1Var.getContentHeight();
                                    contentHeight = n1Var.getContentWidth();
                                }
                                org.telegram.messenger.xe xeVar = n1Var.H0;
                                float f11 = xeVar.e;
                                float f12 = xeVar.f;
                                float f13 = contentWidth;
                                float f14 = contentHeight;
                                canvas.clipRect(((-contentWidth) * f11) / 2.0f, ((-contentHeight) * f12) / 2.0f, (f11 * f13) / 2.0f, (f12 * f14) / 2.0f);
                                float f15 = n1Var.H0.c;
                                canvas.scale(f15, f15);
                                org.telegram.messenger.xe xeVar2 = n1Var.H0;
                                canvas.translate(xeVar2.a * f13, xeVar2.b * f14);
                                canvas.rotate(n1Var.H0.d + r4.k);
                                if (n1Var.H0.l) {
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
            case 9:
                tg.f2 f2Var = (tg.f2) this.b;
                ImageReceiver imageReceiver = f2Var.y0;
                nt0 nt0Var2 = f2Var.w0;
                if (f2Var.x0 != null) {
                    canvas.save();
                    float d10 = f2Var.v0.d(f2Var.u0);
                    canvas.scale(1.0f - (d10 * 2.0f), 1.0f, nt0Var2.a / 2.0f, 0.0f);
                    canvas.skew(0.0f, org.telegram.messenger.k5.A(1.0f, d10, 4.0f * d10, 0.25f));
                    imageReceiver.y0(0.0f, 0.0f, (int) nt0Var2.a, (int) nt0Var2.b);
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
        ug.p0 p0Var;
        ug.p0 p0Var2;
        switch (this.a) {
            case 11:
                super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
                accessibilityNodeInfo.setClassName("android.widget.Button");
                ug.q0 q0Var = (ug.q0) this.b;
                CharSequence text = (!q0Var.r || (p0Var2 = q0Var.h) == null) ? null : p0Var2.getText();
                if (text == null && (p0Var = q0Var.f) != null) {
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

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        switch (this.a) {
            case 1:
                a51 a51Var = (a51) this.b;
                if (motionEvent.getAction() != 0 || a51Var.r1 == 0 || motionEvent.getY() >= a51Var.r1) {
                    return super.onInterceptTouchEvent(motionEvent);
                }
                a51Var.dismiss();
                return true;
            case 4:
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
            case 3:
                super.onMeasure(i7, i10);
                setMeasuredDimension(getMeasuredWidth(), (int) Math.ceil(((org.telegram.ui.Wallet.y5) this.b).T.c(org.telegram.messenger.g0.L(4.0f))));
                break;
            case 12:
                ug.x0 x0Var = (ug.x0) this.b;
                if (x0Var.K0) {
                    x0Var.u1 = View.MeasureSpec.getSize(i7);
                } else {
                    x0Var.u1 = (int) (Math.min(View.MeasureSpec.getSize(i7), View.MeasureSpec.getSize(i10)) * 0.8f);
                }
                super.onMeasure(i7, i10);
                break;
            case 13:
                super.onMeasure(i7, i10);
                ug.g1 g1Var = (ug.g1) ((di.i4) this.b).d;
                di.xb xbVar = g1Var.n2;
                if (xbVar == null) {
                    View view = g1Var.x2;
                    if (view == null) {
                        f10 = 0.0f;
                        g1Var.m2.setTranslationY(f10 - (r4.getMeasuredHeight() / 2.0f));
                        break;
                    } else {
                        top = view.getTop();
                        measuredHeight = g1Var.x2.getMeasuredHeight();
                    }
                } else {
                    top = xbVar.getTop();
                    measuredHeight = g1Var.n2.getMeasuredHeight();
                }
                f10 = (measuredHeight / 2.0f) + top;
                g1Var.m2.setTranslationY(f10 - (r4.getMeasuredHeight() / 2.0f));
            default:
                super.onMeasure(i7, i10);
                break;
        }
    }

    @Override // android.view.View
    public void onSizeChanged(int i7, int i10, int i11, int i12) {
        switch (this.a) {
            case 5:
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
                return !((a51) this.b).J && super.onTouchEvent(motionEvent);
            case 2:
                ((yb1) this.b).U.onTouchEvent(motionEvent);
                return super.onTouchEvent(motionEvent);
            case 7:
                if (motionEvent.getActionMasked() == 0) {
                    org.telegram.ui.tp0 tp0Var = (org.telegram.ui.tp0) this.b;
                    if (tp0Var.o1) {
                        tp0Var.z0(false);
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
            case 6:
                super.onWindowFocusChanged(z10);
                if (z10) {
                    ((org.telegram.ui.Wallet.z9) this.b).k0(true);
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
                ((dc) this.b).c(z10);
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
                a51.I0((a51) this.b);
                break;
            default:
                super.setTranslationY(f10);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m01(tg.f2 f2Var, Context context) {
        super(context);
        this.a = 9;
        this.b = f2Var;
        setWillNotDraw(false);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m01(tg.n1 n1Var, Context context) {
        super(context);
        this.a = 8;
        this.b = n1Var;
        setWillNotDraw(false);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m01(Context context, int i7) {
        super(context);
        this.a = i7;
        switch (i7) {
            case 5:
                super(context);
                this.b = new Path();
                setClipChildren(false);
                setClipToPadding(false);
                break;
            default:
                this.b = new dc(this);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m01(org.telegram.ui.tp0 tp0Var, Context context) {
        super(context);
        this.a = 7;
        this.b = tp0Var;
        setWillNotDraw(false);
    }
}
