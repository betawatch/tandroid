package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class sd extends FrameLayout {
    public final /* synthetic */ int a;
    public final /* synthetic */ ChatActivityEnterView b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ sd(ChatActivityEnterView chatActivityEnterView, Context context, int i3) {
        super(context);
        this.a = i3;
        this.b = chatActivityEnterView;
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchHoverEvent(MotionEvent motionEvent) {
        switch (this.a) {
            case 2:
                if (motionEvent.getAction() != 10) {
                    float x10 = motionEvent.getX();
                    float y9 = motionEvent.getY();
                    for (int i3 = 0; i3 < getChildCount(); i3++) {
                        View childAt = getChildAt(i3);
                        if (childAt.getVisibility() == 0 && childAt.getAlpha() > 0.0f) {
                            float x11 = childAt.getX() + childAt.getWidth();
                            if (x10 >= (childAt == this.b.K0 ? x11 - r6.l() : childAt.getX()) && x10 < x11 && y9 >= childAt.getY() && y9 < childAt.getY() + childAt.getHeight()) {
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
                ii.r3 r3Var = chatActivityEnterView.l0;
                return (r3Var == null || r3Var.getVisibility() != 0) ? super.dispatchTouchEvent(motionEvent) : chatActivityEnterView.l0.dispatchTouchEvent(motionEvent);
            case 1:
            default:
                return super.dispatchTouchEvent(motionEvent);
            case 2:
                ChatActivityEnterView chatActivityEnterView2 = this.b;
                if (!chatActivityEnterView2.K || chatActivityEnterView2.s5 == 2) {
                    return false;
                }
                return super.dispatchTouchEvent(motionEvent);
        }
    }

    @Override // android.view.ViewGroup
    public boolean drawChild(final Canvas canvas, final View view, final long j10) {
        switch (this.a) {
            case 1:
                ChatActivityEnterView chatActivityEnterView = this.b;
                if (view != null && view == chatActivityEnterView.F0) {
                    return chatActivityEnterView.c0(canvas, new org.telegram.messenger.m10() { // from class: org.telegram.ui.Components.td
                        @Override // org.telegram.messenger.m10
                        public final Object run() {
                            Boolean valueOf;
                            valueOf = Boolean.valueOf(super/*android.widget.FrameLayout*/.drawChild(canvas, view, j10));
                            return valueOf;
                        }
                    });
                }
                if (chatActivityEnterView.A4 && view == chatActivityEnterView.f1) {
                    return true;
                }
                return super.drawChild(canvas, view, j10);
            case 2:
                ChatActivityEnterView chatActivityEnterView2 = this.b;
                if (view == chatActivityEnterView2.K0 && chatActivityEnterView2.i0) {
                    return true;
                }
                return super.drawChild(canvas, view, j10);
            default:
                return super.drawChild(canvas, view, j10);
        }
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z10, int i3, int i10, int i11, int i12) {
        switch (this.a) {
            case 1:
                super.onLayout(z10, i3, i10, i11, i12);
                ChatActivityEnterView chatActivityEnterView = this.b;
                if (!chatActivityEnterView.C0.isEmpty()) {
                    for (int i13 = 0; i13 < getChildCount(); i13++) {
                        View childAt = getChildAt(i13);
                        Float f10 = (Float) chatActivityEnterView.C0.get(childAt);
                        if (f10 != null) {
                            childAt.setTranslationX(f10.floatValue() - childAt.getLeft());
                            childAt.animate().translationX(0.0f).setDuration(150L).setInterpolator(xq.f).start();
                        }
                    }
                    chatActivityEnterView.C0.clear();
                    break;
                }
                break;
            default:
                super.onLayout(z10, i3, i10, i11, i12);
                break;
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i3, int i10) {
        switch (this.a) {
            case 1:
                super.onMeasure(i3, i10);
                int max = Math.max(org.telegram.messenger.g0.L(44.0f), getMeasuredHeight());
                ChatActivityEnterView chatActivityEnterView = this.b;
                qe.c cVar = chatActivityEnterView.k5;
                if (cVar.f > 0.0f) {
                    cVar.a(max);
                } else {
                    cVar.c(max);
                }
                chatActivityEnterView.I();
                break;
            default:
                super.onMeasure(i3, i10);
                break;
        }
    }

    @Override // android.view.View
    public void onSizeChanged(int i3, int i10, int i11, int i12) {
        switch (this.a) {
            case 2:
                super.onSizeChanged(i3, i10, i11, i12);
                setPivotX(i3 - org.telegram.messenger.g0.L(22.0f));
                setPivotY(i10 - org.telegram.messenger.g0.L(22.0f));
                break;
            default:
                super.onSizeChanged(i3, i10, i11, i12);
                break;
        }
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        switch (this.a) {
            case 2:
                ChatActivityEnterView chatActivityEnterView = this.b;
                if (!chatActivityEnterView.K || chatActivityEnterView.s5 == 2) {
                    return false;
                }
                return super.onTouchEvent(motionEvent);
            default:
                return super.onTouchEvent(motionEvent);
        }
    }

    @Override // android.view.View
    public void setVisibility(int i3) {
        switch (this.a) {
            case 3:
                super.setVisibility(i3);
                this.b.Q1(true);
                break;
            default:
                super.setVisibility(i3);
                break;
        }
    }
}
