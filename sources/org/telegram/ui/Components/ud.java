package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes3.dex */
public final class ud extends FrameLayout {
    public final /* synthetic */ int a;
    public final /* synthetic */ ChatActivityEnterView b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ud(ChatActivityEnterView chatActivityEnterView, Context context, int i7) {
        super(context);
        this.a = i7;
        this.b = chatActivityEnterView;
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
                            if (x10 >= (childAt == this.b.J0 ? x11 - r6.l() : childAt.getX()) && x10 < x11 && y10 >= childAt.getY() && y10 < childAt.getY() + childAt.getHeight()) {
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
                hi.r3 r3Var = chatActivityEnterView.k0;
                return (r3Var == null || r3Var.getVisibility() != 0) ? super.dispatchTouchEvent(motionEvent) : chatActivityEnterView.k0.dispatchTouchEvent(motionEvent);
            case 1:
            default:
                return super.dispatchTouchEvent(motionEvent);
            case 2:
                ChatActivityEnterView chatActivityEnterView2 = this.b;
                if (!chatActivityEnterView2.J || chatActivityEnterView2.r5 == 2) {
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
                if (view != null && view == chatActivityEnterView.E0) {
                    return chatActivityEnterView.c0(canvas, new org.telegram.messenger.u10() { // from class: org.telegram.ui.Components.vd
                        @Override // org.telegram.messenger.u10
                        public final Object run() {
                            Boolean valueOf;
                            valueOf = Boolean.valueOf(super/*android.widget.FrameLayout*/.drawChild(canvas, view, j3));
                            return valueOf;
                        }
                    });
                }
                if (chatActivityEnterView.z4 && view == chatActivityEnterView.e1) {
                    return true;
                }
                return super.drawChild(canvas, view, j3);
            case 2:
                ChatActivityEnterView chatActivityEnterView2 = this.b;
                if (view == chatActivityEnterView2.J0 && chatActivityEnterView2.h0) {
                    return true;
                }
                return super.drawChild(canvas, view, j3);
            default:
                return super.drawChild(canvas, view, j3);
        }
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z9, int i7, int i10, int i11, int i12) {
        switch (this.a) {
            case 1:
                super.onLayout(z9, i7, i10, i11, i12);
                ChatActivityEnterView chatActivityEnterView = this.b;
                if (!chatActivityEnterView.B0.isEmpty()) {
                    for (int i13 = 0; i13 < getChildCount(); i13++) {
                        View childAt = getChildAt(i13);
                        Float f10 = (Float) chatActivityEnterView.B0.get(childAt);
                        if (f10 != null) {
                            childAt.setTranslationX(f10.floatValue() - childAt.getLeft());
                            childAt.animate().translationX(0.0f).setDuration(150L).setInterpolator(xq.f).start();
                        }
                    }
                    chatActivityEnterView.B0.clear();
                    break;
                }
                break;
            default:
                super.onLayout(z9, i7, i10, i11, i12);
                break;
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i7, int i10) {
        switch (this.a) {
            case 1:
                super.onMeasure(i7, i10);
                int max = Math.max(org.telegram.messenger.g0.L(44.0f), getMeasuredHeight());
                ChatActivityEnterView chatActivityEnterView = this.b;
                te.c cVar = chatActivityEnterView.j5;
                if (cVar.f > 0.0f) {
                    cVar.a(max);
                } else {
                    cVar.c(max);
                }
                chatActivityEnterView.I();
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
                if (!chatActivityEnterView.J || chatActivityEnterView.r5 == 2) {
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
                this.b.R1(true);
                break;
            default:
                super.setVisibility(i7);
                break;
        }
    }
}
