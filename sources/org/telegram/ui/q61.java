package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.view.MotionEvent;
import android.view.View;
import org.telegram.messenger.ImageReceiver;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes3.dex */
public final class q61 extends org.telegram.ui.Components.pj0 {
    public boolean e3;
    public float f3;
    public final /* synthetic */ u71 g3;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q61(Context context, u71 u71Var) {
        super(context, null);
        this.g3 = u71Var;
    }

    @Override // org.telegram.ui.Components.pj0
    public final boolean F0(View view) {
        q61 q61Var = this.g3.v0;
        View F = q61Var.F(view);
        v4.d1 T = F == null ? null : q61Var.T(F);
        return T == null || T.f != 2;
    }

    @Override // org.telegram.ui.Components.pj0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        v4.d1 T;
        boolean drawChild = super.drawChild(canvas, view, j3);
        if (view instanceof org.telegram.ui.Cells.q1) {
            org.telegram.ui.Cells.q1 q1Var = (org.telegram.ui.Cells.q1) view;
            q1Var.getMessageObject();
            ImageReceiver avatarImage = q1Var.getAvatarImage();
            if (avatarImage != null) {
                int top = view.getTop();
                boolean H2 = q1Var.H2();
                u71 u71Var = this.g3;
                if (H2 && (T = u71Var.v0.T(view)) != null) {
                    if (u71Var.v0.K(T.b() - 1) != null) {
                        avatarImage.L0 = -org.telegram.messenger.g0.L(1000.0f);
                        avatarImage.h(canvas, null);
                        return drawChild;
                    }
                }
                float translationX = q1Var.getTranslationX();
                int layoutHeight = q1Var.getLayoutHeight() + view.getTop();
                int measuredHeight = u71Var.v0.getMeasuredHeight() - u71Var.v0.getPaddingBottom();
                if (layoutHeight > measuredHeight) {
                    layoutHeight = measuredHeight;
                }
                if (q1Var.I2() && (r12 = u71Var.v0.T(view)) != null) {
                    int i7 = 0;
                    while (i7 < 20) {
                        i7++;
                        v4.d1 T2 = u71Var.v0.K(T2.b() + 1);
                        if (T2 == null) {
                            break;
                        }
                        View view2 = T2.a;
                        int top2 = view2.getTop();
                        if (layoutHeight - org.telegram.messenger.g0.L(48.0f) < view2.getBottom()) {
                            translationX = Math.min(view2.getTranslationX(), translationX);
                        }
                        if (!(view2 instanceof org.telegram.ui.Cells.q1) || !((org.telegram.ui.Cells.q1) view2).I2()) {
                            top = top2;
                            break;
                        }
                        top = top2;
                    }
                }
                if (layoutHeight - org.telegram.messenger.g0.L(48.0f) < top) {
                    layoutHeight = org.telegram.messenger.g0.L(48.0f) + top;
                }
                if (translationX != 0.0f) {
                    canvas.save();
                    canvas.translate(translationX, 0.0f);
                }
                avatarImage.L0 = layoutHeight - org.telegram.messenger.g0.L(44.0f);
                avatarImage.h(canvas, null);
                if (translationX != 0.0f) {
                    canvas.restore();
                }
            }
        }
        return drawChild;
    }

    @Override // org.telegram.ui.Components.pj0
    public final void j1(View view, float f10, float f11, boolean z9) {
        if (z9 && (view instanceof org.telegram.ui.Cells.q1) && !((org.telegram.ui.Cells.q1) view).B2(f10)) {
            return;
        }
        super.j1(view, f10, f11, z9);
    }

    @Override // org.telegram.ui.Components.pj0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z9, int i7, int i10, int i11, int i12) {
        super.onLayout(z9, i7, i10, i11, i12);
        this.g3.a1();
    }

    @Override // org.telegram.ui.Components.pj0, androidx.recyclerview.widget.RecyclerView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        u71 u71Var = this.g3;
        if (action == 1) {
            if (!u71Var.s0 && (u71Var.C1 instanceof oc1) && u71Var.M0[0].getVisibility() == 0) {
                u71Var.k1(0, false, true);
            }
            u71Var.s0 = false;
        }
        if (u71Var.b2) {
            if (motionEvent.getAction() == 0) {
                this.f3 = motionEvent.getX();
                motionEvent.getY();
                if (getParent() != null) {
                    getParent().requestDisallowInterceptTouchEvent(true);
                }
                this.e3 = true;
            } else if (motionEvent.getAction() == 2) {
                if (!this.e3 && Math.abs(this.f3 - motionEvent.getX()) > org.telegram.messenger.g0.e) {
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
            u71Var.T1.a(motionEvent);
        }
        return this.e3 || super.onTouchEvent(motionEvent);
    }

    @Override // org.telegram.ui.Components.pj0, android.view.View
    public final void setTranslationY(float f10) {
        super.setTranslationY(f10);
        u71 u71Var = this.g3;
        int i7 = 0;
        if (u71Var.K0 != null) {
            int i10 = 0;
            while (true) {
                org.telegram.ui.Components.w61[] w61VarArr = u71Var.K0;
                if (i10 >= w61VarArr.length) {
                    break;
                }
                w61VarArr[i10].invalidate();
                i10++;
            }
        }
        if (u71Var.L0 != null) {
            while (true) {
                org.telegram.ui.Components.w61[] w61VarArr2 = u71Var.L0;
                if (i7 >= w61VarArr2.length) {
                    break;
                }
                w61VarArr2[i7].invalidate();
                i7++;
            }
        }
        t61 t61Var = u71Var.E0;
        if (t61Var != null) {
            t61Var.invalidate();
        }
        t61 t61Var2 = u71Var.F0;
        if (t61Var2 != null) {
            t61Var2.invalidate();
        }
    }
}
