package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.view.MotionEvent;
import android.view.View;
import org.telegram.messenger.ImageReceiver;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class i81 extends org.telegram.ui.Components.tk0 {
    public boolean e3;
    public float f3;
    public final /* synthetic */ m91 g3;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i81(Context context, m91 m91Var) {
        super(context, null);
        this.g3 = m91Var;
    }

    @Override // org.telegram.ui.Components.tk0
    public final boolean F0(View view) {
        i81 i81Var = this.g3.v0;
        View F = i81Var.F(view);
        s4.c1 T = F == null ? null : i81Var.T(F);
        return T == null || T.f != 2;
    }

    @Override // org.telegram.ui.Components.tk0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        s4.c1 T;
        boolean drawChild = super.drawChild(canvas, view, j10);
        if (view instanceof org.telegram.ui.Cells.q1) {
            org.telegram.ui.Cells.q1 q1Var = (org.telegram.ui.Cells.q1) view;
            q1Var.getMessageObject();
            ImageReceiver avatarImage = q1Var.getAvatarImage();
            if (avatarImage != null) {
                int top = view.getTop();
                boolean E2 = q1Var.E2();
                m91 m91Var = this.g3;
                if (E2 && (T = m91Var.v0.T(view)) != null) {
                    if (m91Var.v0.K(T.b() - 1) != null) {
                        avatarImage.L0 = -org.telegram.messenger.i0.L(1000.0f);
                        avatarImage.h(canvas, null);
                        return drawChild;
                    }
                }
                float translationX = q1Var.getTranslationX();
                int layoutHeight = q1Var.getLayoutHeight() + view.getTop();
                int measuredHeight = m91Var.v0.getMeasuredHeight() - m91Var.v0.getPaddingBottom();
                if (layoutHeight > measuredHeight) {
                    layoutHeight = measuredHeight;
                }
                if (q1Var.F2() && (r12 = m91Var.v0.T(view)) != null) {
                    int i10 = 0;
                    while (i10 < 20) {
                        i10++;
                        s4.c1 T2 = m91Var.v0.K(T2.b() + 1);
                        if (T2 == null) {
                            break;
                        }
                        View view2 = T2.a;
                        int top2 = view2.getTop();
                        if (layoutHeight - org.telegram.messenger.i0.L(48.0f) < view2.getBottom()) {
                            translationX = Math.min(view2.getTranslationX(), translationX);
                        }
                        if (!(view2 instanceof org.telegram.ui.Cells.q1) || !((org.telegram.ui.Cells.q1) view2).F2()) {
                            top = top2;
                            break;
                        }
                        top = top2;
                    }
                }
                if (layoutHeight - org.telegram.messenger.i0.L(48.0f) < top) {
                    layoutHeight = org.telegram.messenger.i0.L(48.0f) + top;
                }
                if (translationX != 0.0f) {
                    canvas.save();
                    canvas.translate(translationX, 0.0f);
                }
                avatarImage.L0 = layoutHeight - org.telegram.messenger.i0.L(44.0f);
                avatarImage.h(canvas, null);
                if (translationX != 0.0f) {
                    canvas.restore();
                }
            }
        }
        return drawChild;
    }

    @Override // org.telegram.ui.Components.tk0
    public final void j1(View view, float f7, float f10, boolean z10) {
        if (z10 && (view instanceof org.telegram.ui.Cells.q1) && !((org.telegram.ui.Cells.q1) view).y2(f7)) {
            return;
        }
        super.j1(view, f7, f10, z10);
    }

    @Override // org.telegram.ui.Components.tk0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        this.g3.Z0();
    }

    @Override // org.telegram.ui.Components.tk0, androidx.recyclerview.widget.RecyclerView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        m91 m91Var = this.g3;
        if (action == 1) {
            if (!m91Var.s0 && (m91Var.C1 instanceof me1) && m91Var.M0[0].getVisibility() == 0) {
                m91Var.j1(0, false, true);
            }
            m91Var.s0 = false;
        }
        if (m91Var.b2) {
            if (motionEvent.getAction() == 0) {
                this.f3 = motionEvent.getX();
                motionEvent.getY();
                if (getParent() != null) {
                    getParent().requestDisallowInterceptTouchEvent(true);
                }
                this.e3 = true;
            } else if (motionEvent.getAction() == 2) {
                if (!this.e3 && Math.abs(this.f3 - motionEvent.getX()) > org.telegram.messenger.i0.e) {
                    if (getParent() != null) {
                        getParent().requestDisallowInterceptTouchEvent(true);
                    }
                    this.e3 = true;
                }
            } else if (motionEvent.getAction() == 3 || motionEvent.getAction() == 1) {
                this.e3 = false;
                if (getParent() != null) {
                    getParent().requestDisallowInterceptTouchEvent(false);
                }
            }
            m91Var.T1.a(motionEvent);
        }
        return this.e3 || super.onTouchEvent(motionEvent);
    }

    @Override // org.telegram.ui.Components.tk0, android.view.View
    public final void setTranslationY(float f7) {
        super.setTranslationY(f7);
        m91 m91Var = this.g3;
        int i10 = 0;
        if (m91Var.K0 != null) {
            int i11 = 0;
            while (true) {
                org.telegram.ui.Components.x71[] x71VarArr = m91Var.K0;
                if (i11 >= x71VarArr.length) {
                    break;
                }
                x71VarArr[i11].invalidate();
                i11++;
            }
        }
        if (m91Var.L0 != null) {
            while (true) {
                org.telegram.ui.Components.x71[] x71VarArr2 = m91Var.L0;
                if (i10 >= x71VarArr2.length) {
                    break;
                }
                x71VarArr2[i10].invalidate();
                i10++;
            }
        }
        l81 l81Var = m91Var.E0;
        if (l81Var != null) {
            l81Var.invalidate();
        }
        l81 l81Var2 = m91Var.F0;
        if (l81Var2 != null) {
            l81Var2.invalidate();
        }
    }
}
