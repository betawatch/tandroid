package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class pd extends FrameLayout {
    public final /* synthetic */ int a;
    public final /* synthetic */ ChatActivityEnterView b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ pd(ChatActivityEnterView chatActivityEnterView, Context context, int i10) {
        super(context);
        this.a = i10;
        this.b = chatActivityEnterView;
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        switch (this.a) {
            case 0:
                ChatActivityEnterView chatActivityEnterView = this.b;
                xh.a3 a3Var = chatActivityEnterView.k0;
                return (a3Var == null || a3Var.getVisibility() != 0) ? super.dispatchTouchEvent(motionEvent) : chatActivityEnterView.k0.dispatchTouchEvent(motionEvent);
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
    public boolean drawChild(final Canvas canvas, final View view, final long j10) {
        switch (this.a) {
            case 1:
                ChatActivityEnterView chatActivityEnterView = this.b;
                if (view != null && view == chatActivityEnterView.E0) {
                    return chatActivityEnterView.b0(canvas, new org.telegram.messenger.i20() { // from class: org.telegram.ui.Components.qd
                        @Override // org.telegram.messenger.i20
                        public final Object run() {
                            Boolean valueOf;
                            valueOf = Boolean.valueOf(super/*android.widget.FrameLayout*/.drawChild(canvas, view, j10));
                            return valueOf;
                        }
                    });
                }
                if (chatActivityEnterView.z4 && view == chatActivityEnterView.e1) {
                    return true;
                }
                return super.drawChild(canvas, view, j10);
            case 2:
                ChatActivityEnterView chatActivityEnterView2 = this.b;
                if (view == chatActivityEnterView2.J0 && chatActivityEnterView2.h0) {
                    return true;
                }
                return super.drawChild(canvas, view, j10);
            default:
                return super.drawChild(canvas, view, j10);
        }
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        switch (this.a) {
            case 1:
                super.onLayout(z10, i10, i11, i12, i13);
                ChatActivityEnterView chatActivityEnterView = this.b;
                if (!chatActivityEnterView.B0.isEmpty()) {
                    for (int i14 = 0; i14 < getChildCount(); i14++) {
                        View childAt = getChildAt(i14);
                        Float f7 = (Float) chatActivityEnterView.B0.get(childAt);
                        if (f7 != null) {
                            childAt.setTranslationX(f7.floatValue() - childAt.getLeft());
                            childAt.animate().translationX(0.0f).setDuration(150L).setInterpolator(gr.f).start();
                        }
                    }
                    chatActivityEnterView.B0.clear();
                    break;
                }
                break;
            default:
                super.onLayout(z10, i10, i11, i12, i13);
                break;
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i10, int i11) {
        switch (this.a) {
            case 1:
                super.onMeasure(i10, i11);
                int max = Math.max(org.telegram.messenger.i0.L(44.0f), getMeasuredHeight());
                ChatActivityEnterView chatActivityEnterView = this.b;
                fe.f fVar = chatActivityEnterView.j5;
                if (fVar.f > 0.0f) {
                    fVar.a(max);
                } else {
                    fVar.c(max);
                }
                chatActivityEnterView.I();
                break;
            default:
                super.onMeasure(i10, i11);
                break;
        }
    }

    @Override // android.view.View
    public void onSizeChanged(int i10, int i11, int i12, int i13) {
        switch (this.a) {
            case 2:
                super.onSizeChanged(i10, i11, i12, i13);
                setPivotX(i10 - org.telegram.messenger.i0.L(22.0f));
                setPivotY(i11 - org.telegram.messenger.i0.L(22.0f));
                break;
            default:
                super.onSizeChanged(i10, i11, i12, i13);
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
    public void setVisibility(int i10) {
        switch (this.a) {
            case 3:
                super.setVisibility(i10);
                this.b.O1(true);
                break;
            default:
                super.setVisibility(i10);
                break;
        }
    }
}
