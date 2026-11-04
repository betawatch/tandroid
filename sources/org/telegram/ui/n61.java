package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.os.SystemClock;
import android.util.DisplayMetrics;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class n61 extends FrameLayout {
    public final /* synthetic */ int a;
    public final Object b;
    public final Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ n61(Object obj, Context context, Object obj2, int i3) {
        super(context);
        this.a = i3;
        this.b = obj;
        this.c = obj2;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        switch (this.a) {
            case 2:
                super.dispatchDraw(canvas);
                ((org.telegram.ui.Wallet.w5) this.b).getClass();
                break;
            case 3:
            case 5:
            default:
                super.dispatchDraw(canvas);
                break;
            case 4:
                cg.b0 b0Var = (cg.b0) this.b;
                b0Var.b(org.telegram.ui.ActionBar.k6.r1(0.65f, org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.d6, (org.telegram.ui.ActionBar.e6) this.c)));
                b0Var.draw(canvas);
                super.dispatchDraw(canvas);
                break;
            case 6:
                ((vg.x0) this.c).d(0, 0.0f, 0, getMeasuredWidth(), 0.0f, getMeasuredHeight());
                RectF rectF = org.telegram.messenger.g0.P;
                rectF.set(0.0f, org.telegram.messenger.g0.L(2.0f), getMeasuredWidth(), org.telegram.messenger.g0.L(18.0f) + getMeasuredHeight());
                canvas.save();
                canvas.clipRect(0, 0, getMeasuredWidth(), getMeasuredHeight());
                vg.x0 x0Var = (vg.x0) this.c;
                x0Var.f.setAlpha(((vg.v0) this.b).C1);
                canvas.drawRoundRect(rectF, org.telegram.messenger.g0.L(24.0f) - 1, org.telegram.messenger.g0.L(24.0f) - 1, x0Var.f);
                canvas.restore();
                super.dispatchDraw(canvas);
                break;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        switch (this.a) {
            case 4:
                super.dispatchTouchEvent(motionEvent);
                return true;
            default:
                return super.dispatchTouchEvent(motionEvent);
        }
    }

    @Override // android.view.ViewGroup
    public boolean drawChild(Canvas canvas, View view, long j10) {
        boolean z10;
        switch (this.a) {
            case 2:
                org.telegram.ui.Wallet.w5 w5Var = (org.telegram.ui.Wallet.w5) this.b;
                if (view != w5Var.t0 || !w5Var.G) {
                    return super.drawChild(canvas, view, j10);
                }
                int save = canvas.save();
                canvas.concat(w5Var.J);
                boolean drawChild = super.drawChild(canvas, view, j10);
                canvas.restoreToCount(save);
                return drawChild;
            case 5:
                Path path = (Path) this.c;
                ug.e0 e0Var = (ug.e0) this.b;
                if (e0Var.h == null || (!((z10 = e0Var.f) && view == e0Var.d) && (z10 || view != e0Var.c))) {
                    return super.drawChild(canvas, view, j10);
                }
                float measuredWidth = ((z10 ? e0Var.e : 1.0f - e0Var.e) * getMeasuredWidth()) / 2.0f;
                canvas.save();
                path.rewind();
                path.addCircle(getMeasuredWidth() / 2.0f, getMeasuredHeight() / 2.0f, measuredWidth, Path.Direction.CW);
                canvas.clipPath(path);
                boolean drawChild2 = super.drawChild(canvas, view, j10);
                canvas.restore();
                return drawChild2;
            default:
                return super.drawChild(canvas, view, j10);
        }
    }

    @Override // android.view.View
    public void invalidate() {
        switch (this.a) {
            case 1:
                super.invalidate();
                org.telegram.ui.ActionBar.k0 k0Var = ((l71) this.b).v0;
                if (k0Var != null) {
                    k0Var.invalidate();
                    break;
                }
                break;
            case 2:
            default:
                super.invalidate();
                break;
            case 3:
                super.invalidate();
                ((qg.h) this.b).invalidate();
                break;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        switch (this.a) {
            case 2:
                super.onAttachedToWindow();
                getViewTreeObserver().addOnPreDrawListener((org.telegram.ui.Wallet.j5) this.c);
                break;
            default:
                super.onAttachedToWindow();
                break;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        switch (this.a) {
            case 2:
                getViewTreeObserver().removeOnPreDrawListener((org.telegram.ui.Wallet.j5) this.c);
                super.onDetachedFromWindow();
                break;
            default:
                super.onDetachedFromWindow();
                break;
        }
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        switch (this.a) {
            case 0:
                int intrinsicHeight = org.telegram.ui.ActionBar.k6.i3.getIntrinsicHeight();
                org.telegram.ui.ActionBar.k6.i3.setBounds(0, 0, getMeasuredWidth(), intrinsicHeight);
                org.telegram.ui.ActionBar.k6.i3.draw(canvas);
                Paint paint = (Paint) this.c;
                paint.setColor(((l71) this.b).getThemedColor(org.telegram.ui.ActionBar.k6.Ge));
                canvas.drawRect(0.0f, intrinsicHeight, getMeasuredWidth(), getMeasuredHeight(), paint);
                break;
            case 1:
                int[] iArr = (int[]) this.c;
                l71 l71Var = (l71) this.b;
                if (!org.telegram.messenger.g0.D) {
                    getLocationInWindow(iArr);
                    if (l71Var.u0.getTranslationY() != iArr[1]) {
                        l71Var.u0.setTranslationY(-r9);
                        l71Var.v0.invalidate();
                    }
                    if (SystemClock.elapsedRealtime() < l71Var.R) {
                        invalidate();
                        break;
                    }
                }
                break;
            default:
                super.onDraw(canvas);
                break;
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i3, int i10) {
        switch (this.a) {
            case 6:
                super.onMeasure(i3, org.telegram.messenger.camera.q.B(2.0f, ((vg.v0) this.b).r1, TLObject.FLAG_30));
                break;
            default:
                super.onMeasure(i3, i10);
                break;
        }
    }

    @Override // android.view.View
    public void onSizeChanged(int i3, int i10, int i11, int i12) {
        switch (this.a) {
            case 4:
                super.onSizeChanged(i3, i10, i11, i12);
                cg.b0 b0Var = (cg.b0) this.b;
                b0Var.setBounds(0, 0, i3, i10);
                b0Var.c(0, org.telegram.messenger.g0.L(24.0f) + getPaddingBottom());
                break;
            default:
                super.onSizeChanged(i3, i10, i11, i12);
                break;
        }
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        DisplayMetrics displayMetrics;
        float f10;
        switch (this.a) {
            case 3:
                qg.h hVar = (qg.h) this.b;
                qg.c cVar = hVar.r;
                boolean onTouchEvent = ((GestureDetector) ((org.telegram.ui.Components.y00) this.c).a).onTouchEvent(motionEvent);
                if (motionEvent.getAction() == 0) {
                    org.telegram.messenger.g0.i3(cVar, 200L);
                } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                    org.telegram.messenger.g0.r(cVar);
                    if (!hVar.h) {
                        q1.h hVar2 = hVar.c.m;
                        if (((float) hVar2.i) >= getWidth() / 2.0f) {
                            displayMetrics = getResources().getDisplayMetrics();
                            f10 = 2.14748365E9f;
                        } else {
                            displayMetrics = getResources().getDisplayMetrics();
                            f10 = -2.14748365E9f;
                        }
                        hVar2.i = qg.h.a(displayMetrics, f10);
                        hVar.d.m.i = qg.h.b(getResources().getDisplayMetrics(), (float) hVar.d.m.i);
                        hVar.c.h();
                        hVar.d.h();
                    }
                    hVar.n = false;
                    hVar.f = false;
                    hVar.h = false;
                }
                return onTouchEvent;
            default:
                return super.onTouchEvent(motionEvent);
        }
    }

    @Override // android.view.View
    public void setTranslationX(float f10) {
        switch (this.a) {
            case 3:
                super.setTranslationX(f10);
                ((qg.h) this.b).invalidate();
                break;
            default:
                super.setTranslationX(f10);
                break;
        }
    }

    @Override // android.view.View
    public void setTranslationY(float f10) {
        switch (this.a) {
            case 3:
                super.setTranslationY(f10);
                ((qg.h) this.b).invalidate();
                break;
            default:
                super.setTranslationY(f10);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n61(Context context, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context);
        this.a = 4;
        this.b = new cg.b0(8);
        this.c = e6Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n61(org.telegram.ui.Wallet.w5 w5Var, Context context) {
        super(context);
        this.a = 2;
        this.b = w5Var;
        this.c = new org.telegram.ui.Wallet.j5(0, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n61(l71 l71Var, Context context, int i3) {
        super(context);
        this.a = i3;
        switch (i3) {
            case 1:
                this.b = l71Var;
                super(context);
                this.c = new int[2];
                break;
            default:
                this.b = l71Var;
                this.c = new Paint();
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n61(ug.e0 e0Var, Context context) {
        super(context);
        this.a = 5;
        this.b = e0Var;
        this.c = new Path();
    }
}
