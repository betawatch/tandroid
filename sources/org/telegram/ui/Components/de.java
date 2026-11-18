package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public final class de extends FrameLayout {
    public final /* synthetic */ int a;
    public final /* synthetic */ ChatActivityEnterView b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ de(ChatActivityEnterView chatActivityEnterView, Context context, int i7) {
        super(context);
        this.a = i7;
        this.b = chatActivityEnterView;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        float f10;
        float f11;
        fh.g gVar;
        switch (this.a) {
            case 3:
                ChatActivityEnterView chatActivityEnterView = this.b;
                if (chatActivityEnterView.I1) {
                    float f12 = chatActivityEnterView.N1;
                    float f13 = 0.0f;
                    if (f12 > 0.0f) {
                        Paint paint = chatActivityEnterView.M1;
                        int[] iArr = chatActivityEnterView.Q1;
                        int[] iArr2 = chatActivityEnterView.P1;
                        float f14 = 1.0f;
                        float i7 = Utilities.i(f12 * 1.25f, 1.0f, 0.0f);
                        float i10 = Utilities.i((f12 - 0.18f) * 1.25f, 1.0f, 0.0f);
                        float height = getHeight();
                        float min = Math.min(height - org.telegram.messenger.g0.L(44.0f), chatActivityEnterView.W0(this));
                        float width = getWidth() - org.telegram.messenger.g0.L(2.5f);
                        re reVar = chatActivityEnterView.K0;
                        int i11 = 0;
                        if (reVar == null || reVar.getVisibility() != 0) {
                            f10 = 44.0f;
                        } else {
                            f10 = 44.0f;
                            RectF rectF = org.telegram.messenger.g0.P;
                            reVar.f(rectF);
                            reVar.getLocationInWindow(iArr2);
                            getLocationInWindow(iArr);
                            float f15 = (iArr2[0] - iArr[0]) + rectF.left;
                            if (f15 > org.telegram.messenger.g0.L(120.0f)) {
                                width = f15 - org.telegram.messenger.g0.L(6.0f);
                            }
                        }
                        float f16 = 22.0f;
                        if (chatActivityEnterView.K1 == null && chatActivityEnterView.J1 != null) {
                            jh.f z02 = chatActivityEnterView.z0();
                            gh.a aVar = (z02 == null || (gVar = z02.n) == null) ? null : gVar.w;
                            if (aVar != null) {
                                fh.g c10 = chatActivityEnterView.J1.c(this, aVar, false);
                                chatActivityEnterView.K1 = c10;
                                c10.r(org.telegram.messenger.g0.L(22.0f));
                                fh.g c11 = chatActivityEnterView.J1.c(this, aVar, false);
                                chatActivityEnterView.L1 = c11;
                                c11.r(org.telegram.messenger.g0.L(22.0f));
                            }
                        }
                        while (i11 < 2) {
                            float f17 = i11 == 0 ? i7 : i10;
                            if (f17 <= f13) {
                                f11 = f16;
                            } else {
                                if (i11 == 0) {
                                    f11 = f16;
                                    org.telegram.messenger.g0.P.set(f13, height - org.telegram.messenger.g0.L(f10), org.telegram.messenger.g0.L(f10), height);
                                } else {
                                    f11 = f16;
                                    org.telegram.messenger.g0.P.set(org.telegram.messenger.g0.L(48.0f), min, width, height);
                                }
                                float T1 = org.telegram.messenger.g0.T1(0.92f, f14, f17);
                                canvas.save();
                                RectF rectF2 = org.telegram.messenger.g0.P;
                                canvas.scale(T1, T1, rectF2.centerX(), height - (org.telegram.messenger.g0.L(f10) / 2.0f));
                                fh.g gVar2 = i11 == 0 ? chatActivityEnterView.K1 : chatActivityEnterView.L1;
                                if (gVar2 != null) {
                                    gVar2.setBounds((int) rectF2.left, (int) rectF2.top, (int) rectF2.right, (int) rectF2.bottom);
                                    gVar2.setAlpha((int) (f17 * 255.0f));
                                    gVar2.draw(canvas);
                                } else {
                                    paint.setColor(org.telegram.ui.ActionBar.n6.r1(f17, chatActivityEnterView.C0(org.telegram.ui.ActionBar.n6.Je)));
                                    canvas.drawRoundRect(rectF2, org.telegram.messenger.g0.L(f11), org.telegram.messenger.g0.L(f11), paint);
                                }
                                canvas.restore();
                            }
                            i11++;
                            f16 = f11;
                            f13 = 0.0f;
                            f14 = 1.0f;
                        }
                    }
                }
                super.dispatchDraw(canvas);
                break;
            default:
                super.dispatchDraw(canvas);
                break;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchHoverEvent(MotionEvent motionEvent) {
        switch (this.a) {
            case 2:
                if (motionEvent.getAction() != 10) {
                    float x10 = motionEvent.getX();
                    float y10 = motionEvent.getY();
                    for (int i7 = 0; i7 < getChildCount(); i7++) {
                        View childAt = getChildAt(i7);
                        if (childAt.getVisibility() == 0 && childAt.getAlpha() > 0.0f) {
                            float x11 = childAt.getX() + childAt.getWidth();
                            if (x10 >= (childAt == this.b.K0 ? x11 - r6.l() : childAt.getX()) && x10 < x11 && y10 >= childAt.getY() && y10 < childAt.getY() + childAt.getHeight()) {
                            }
                        }
                    }
                    return false;
                }
                return super.dispatchHoverEvent(motionEvent);
            default:
                return super.dispatchHoverEvent(motionEvent);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        switch (this.a) {
            case 0:
                ChatActivityEnterView chatActivityEnterView = this.b;
                ki.j3 j3Var = chatActivityEnterView.l0;
                return (j3Var == null || j3Var.getVisibility() != 0) ? super.dispatchTouchEvent(motionEvent) : chatActivityEnterView.l0.dispatchTouchEvent(motionEvent);
            case 1:
            default:
                return super.dispatchTouchEvent(motionEvent);
            case 2:
                ChatActivityEnterView chatActivityEnterView2 = this.b;
                if (!chatActivityEnterView2.K || chatActivityEnterView2.m7 == 2) {
                    return false;
                }
                return super.dispatchTouchEvent(motionEvent);
        }
    }

    @Override // android.view.ViewGroup
    public boolean drawChild(final Canvas canvas, final View view, final long j3) {
        switch (this.a) {
            case 1:
                ChatActivityEnterView chatActivityEnterView = this.b;
                if (view != null && view == chatActivityEnterView.F0) {
                    return chatActivityEnterView.s0(canvas, new org.telegram.messenger.p10() { // from class: org.telegram.ui.Components.ee
                        @Override // org.telegram.messenger.p10
                        public final Object run() {
                            Boolean valueOf;
                            valueOf = Boolean.valueOf(super/*android.widget.FrameLayout*/.drawChild(canvas, view, j3));
                            return valueOf;
                        }
                    });
                }
                if (chatActivityEnterView.X5 && view == chatActivityEnterView.f1) {
                    return true;
                }
                return super.drawChild(canvas, view, j3);
            case 2:
                ChatActivityEnterView chatActivityEnterView2 = this.b;
                if (view == chatActivityEnterView2.K0 && chatActivityEnterView2.i0) {
                    return true;
                }
                return super.drawChild(canvas, view, j3);
            default:
                return super.drawChild(canvas, view, j3);
        }
    }

    @Override // android.view.View
    public boolean hasOverlappingRendering() {
        switch (this.a) {
            case 3:
                return !this.b.I1 && super.hasOverlappingRendering();
            default:
                return super.hasOverlappingRendering();
        }
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z10, int i7, int i10, int i11, int i12) {
        switch (this.a) {
            case 1:
                super.onLayout(z10, i7, i10, i11, i12);
                ChatActivityEnterView chatActivityEnterView = this.b;
                if (!chatActivityEnterView.C0.isEmpty()) {
                    for (int i13 = 0; i13 < getChildCount(); i13++) {
                        View childAt = getChildAt(i13);
                        Float f10 = (Float) chatActivityEnterView.C0.get(childAt);
                        if (f10 != null) {
                            childAt.setTranslationX(f10.floatValue() - childAt.getLeft());
                            childAt.animate().translationX(0.0f).setDuration(150L).setInterpolator(lr.f).start();
                        }
                    }
                    chatActivityEnterView.C0.clear();
                    break;
                }
                break;
            default:
                super.onLayout(z10, i7, i10, i11, i12);
                break;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v8, types: [android.view.animation.Interpolator] */
    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i7, int i10) {
        ?? r12;
        switch (this.a) {
            case 1:
                super.onMeasure(i7, i10);
                int max = Math.max(org.telegram.messenger.g0.L(44.0f), getMeasuredHeight());
                ChatActivityEnterView chatActivityEnterView = this.b;
                te.c cVar = chatActivityEnterView.e7;
                float f10 = cVar.f;
                if (f10 > 0.0f) {
                    if (cVar.h) {
                        f10 = cVar.g;
                    }
                    float f11 = max;
                    if (f10 != f11) {
                        cVar.d = chatActivityEnterView.A0();
                        cVar.e = 0L;
                        lr lrVar = pi.k.V;
                        if (chatActivityEnterView.E1 > 0 && SystemClock.uptimeMillis() < chatActivityEnterView.E1 && (r12 = chatActivityEnterView.F1) != 0) {
                            lrVar = r12;
                        }
                        cVar.c = lrVar;
                    }
                    cVar.a(f11);
                } else {
                    cVar.c(max);
                }
                chatActivityEnterView.S();
                break;
            default:
                super.onMeasure(i7, i10);
                break;
        }
    }

    @Override // android.view.View
    public void onSizeChanged(int i7, int i10, int i11, int i12) {
        switch (this.a) {
            case 2:
                super.onSizeChanged(i7, i10, i11, i12);
                setPivotX(i7 - org.telegram.messenger.g0.L(22.0f));
                setPivotY(i10 - org.telegram.messenger.g0.L(22.0f));
                break;
            default:
                super.onSizeChanged(i7, i10, i11, i12);
                break;
        }
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        switch (this.a) {
            case 2:
                ChatActivityEnterView chatActivityEnterView = this.b;
                if (!chatActivityEnterView.K || chatActivityEnterView.m7 == 2) {
                    return false;
                }
                return super.onTouchEvent(motionEvent);
            default:
                return super.onTouchEvent(motionEvent);
        }
    }

    @Override // android.view.View
    public void setVisibility(int i7) {
        switch (this.a) {
            case 3:
                super.setVisibility(i7);
                this.b.t2(true);
                break;
            default:
                super.setVisibility(i7);
                break;
        }
    }
}
