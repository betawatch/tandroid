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
import org.telegram.ui.zb1;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class w01 extends FrameLayout {
    public final /* synthetic */ int a;
    public final Object b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ w01(int i7, Context context, Object obj) {
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
                tg.o2 o2Var = (tg.o2) this.b;
                if (o2Var.E <= 0.0f || o2Var.s == null) {
                    canvas2 = canvas;
                } else {
                    o2Var.w.reset();
                    float width = getWidth() / o2Var.n.getWidth();
                    o2Var.w.postScale(width, width);
                    o2Var.r.setLocalMatrix(o2Var.w);
                    o2Var.s.setAlpha((int) (o2Var.E * 255.0f));
                    canvas2 = canvas;
                    canvas2.drawRect(0.0f, 0.0f, getWidth(), getHeight(), o2Var.s);
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
                ((tg.o2) this.b).onBackPressed();
                return true;
            default:
                return super.dispatchKeyEventPreIme(keyEvent);
        }
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        switch (this.a) {
            case 0:
                float a10 = ((lc) this.b).a(0.03f);
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
                if (!((org.telegram.ui.Wallet.t6) this.b).a || view.getTag() == org.telegram.ui.Wallet.t6.o0) {
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
                m51 m51Var = (m51) this.b;
                m51Var.m1.setBounds(0, (int) ((m51Var.r1 - m51Var.t0) - getTranslationY()), getMeasuredWidth(), getMeasuredHeight());
                m51Var.m1.draw(canvas);
                break;
            case 6:
                super.onDraw(canvas);
                org.telegram.ui.vp0 vp0Var = (org.telegram.ui.vp0) this.b;
                Paint paint = vp0Var.l1;
                tg.j1 j1Var = vp0Var.e1;
                paint.setAlpha((int) ((1.0f - vp0Var.n1) * j1Var.getAlpha() * 102.0f));
                RectF rectF = org.telegram.messenger.g0.P;
                j1Var.b(rectF);
                float translationY = j1Var.getTranslationY() + vp0Var.M0.getTranslationY() + j1Var.getTop() + r4.getTop();
                float f10 = rectF.left;
                tg.o1 o1Var = vp0Var.f1;
                rectF.set(org.telegram.messenger.g0.T1(f10, o1Var.getLeft(), vp0Var.n1), org.telegram.messenger.g0.T1(rectF.top + translationY, o1Var.getTop() - o1Var.getTranslationY(), vp0Var.n1), org.telegram.messenger.g0.T1(rectF.right, o1Var.getRight(), vp0Var.n1), org.telegram.messenger.g0.T1(translationY + rectF.bottom, o1Var.getBottom() - o1Var.getTranslationY(), vp0Var.n1));
                float L = org.telegram.messenger.g0.L(org.telegram.messenger.g0.W1(vp0Var.n1, 32, 16));
                Paint paint2 = vp0Var.m1;
                int alpha = paint2.getAlpha();
                paint2.setAlpha((int) (alpha * vp0Var.n1));
                canvas.drawRoundRect(rectF, L, L, paint2);
                paint2.setAlpha(alpha);
                canvas.drawRoundRect(rectF, L, L, paint);
                break;
            case 7:
                tg.s1 s1Var = (tg.s1) this.b;
                Rect rect = s1Var.G0;
                Rect rect2 = s1Var.F0;
                Paint paint3 = s1Var.H0;
                xt0 xt0Var = s1Var.x0;
                Bitmap bitmap = s1Var.C0;
                if (s1Var.B0 != null) {
                    canvas.save();
                    float d = s1Var.w0.d(s1Var.v0);
                    canvas.scale(1.0f - (d * 2.0f), 1.0f, xt0Var.a / 2.0f, 0.0f);
                    canvas.skew(0.0f, org.telegram.messenger.f3.A(1.0f, d, 4.0f * d, 0.25f));
                    float d2 = s1Var.A0.d(s1Var.z0);
                    if (!s1Var.z0) {
                        canvas.save();
                        paint3.setAlpha((int) ((1.0f - d2) * 255.0f));
                        if (bitmap != null) {
                            canvas.translate(r6.getWidth() / 2.0f, r6.getHeight() / 2.0f);
                            canvas.rotate(s1Var.y0);
                            float max = Math.max(xt0Var.a / bitmap.getWidth(), xt0Var.b / bitmap.getHeight());
                            canvas.scale(max, max);
                            if (s1Var.I0 != null) {
                                canvas.rotate(-s1Var.getOrientation());
                                int contentWidth = s1Var.getContentWidth();
                                int contentHeight = s1Var.getContentHeight();
                                if (((s1Var.getOrientation() + s1Var.I0.k) / 90) % 2 == 1) {
                                    contentWidth = s1Var.getContentHeight();
                                    contentHeight = s1Var.getContentWidth();
                                }
                                org.telegram.messenger.we weVar = s1Var.I0;
                                float f11 = weVar.e;
                                float f12 = weVar.f;
                                float f13 = contentWidth;
                                float f14 = contentHeight;
                                canvas.clipRect(((-contentWidth) * f11) / 2.0f, ((-contentHeight) * f12) / 2.0f, (f11 * f13) / 2.0f, (f12 * f14) / 2.0f);
                                float f15 = s1Var.I0.c;
                                canvas.scale(f15, f15);
                                org.telegram.messenger.we weVar2 = s1Var.I0;
                                canvas.translate(weVar2.a * f13, weVar2.b * f14);
                                canvas.rotate(s1Var.I0.d + r4.k);
                                if (s1Var.I0.l) {
                                    canvas.scale(-1.0f, 1.0f);
                                }
                                canvas.rotate(s1Var.getOrientation());
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
                tg.j2 j2Var = (tg.j2) this.b;
                ImageReceiver imageReceiver = j2Var.z0;
                xt0 xt0Var2 = j2Var.x0;
                if (j2Var.y0 != null) {
                    canvas.save();
                    float d10 = j2Var.w0.d(j2Var.v0);
                    canvas.scale(1.0f - (d10 * 2.0f), 1.0f, xt0Var2.a / 2.0f, 0.0f);
                    canvas.skew(0.0f, org.telegram.messenger.f3.A(1.0f, d10, 4.0f * d10, 0.25f));
                    imageReceiver.z0(0.0f, 0.0f, (int) xt0Var2.a, (int) xt0Var2.b);
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
                m51 m51Var = (m51) this.b;
                if (motionEvent.getAction() != 0 || m51Var.r1 == 0 || motionEvent.getY() >= m51Var.r1) {
                    return super.onInterceptTouchEvent(motionEvent);
                }
                m51Var.dismiss();
                return true;
            case 2:
            default:
                return super.onInterceptTouchEvent(motionEvent);
            case 3:
                return ((org.telegram.ui.Wallet.t6) this.b).a || super.onInterceptTouchEvent(motionEvent);
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
                return !((m51) this.b).J && super.onTouchEvent(motionEvent);
            case 2:
                ((zb1) this.b).U.onTouchEvent(motionEvent);
                return super.onTouchEvent(motionEvent);
            case 6:
                if (motionEvent.getActionMasked() == 0) {
                    org.telegram.ui.vp0 vp0Var = (org.telegram.ui.vp0) this.b;
                    if (vp0Var.o1) {
                        vp0Var.C0(false);
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
                    ((org.telegram.ui.Wallet.oa) this.b).k0(true);
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
                ((lc) this.b).c(z10);
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
                m51.J0((m51) this.b);
                break;
            default:
                super.setTranslationY(f10);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w01(tg.j2 j2Var, Context context) {
        super(context);
        this.a = 8;
        this.b = j2Var;
        setWillNotDraw(false);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w01(tg.s1 s1Var, Context context) {
        super(context);
        this.a = 7;
        this.b = s1Var;
        setWillNotDraw(false);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w01(Context context, int i7) {
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
                this.b = new lc(this);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w01(org.telegram.ui.vp0 vp0Var, Context context) {
        super(context);
        this.a = 6;
        this.b = vp0Var;
        setWillNotDraw(false);
    }
}
