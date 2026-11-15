package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.view.MotionEvent;
import android.view.View;
import org.telegram.messenger.ImageReceiver;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class n61 extends org.telegram.ui.Components.uj0 {
    public boolean f3;
    public float g3;
    public final /* synthetic */ t71 h3;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n61(Context context, t71 t71Var) {
        super(context, null);
        this.h3 = t71Var;
    }

    @Override // org.telegram.ui.Components.uj0
    public final boolean F0(View view) {
        n61 n61Var = this.h3.w0;
        View F = n61Var.F(view);
        v4.e1 T = F == null ? null : n61Var.T(F);
        return T == null || T.f != 2;
    }

    @Override // org.telegram.ui.Components.uj0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        v4.e1 T;
        boolean drawChild = super.drawChild(canvas, view, j3);
        if (view instanceof org.telegram.ui.Cells.q1) {
            org.telegram.ui.Cells.q1 q1Var = (org.telegram.ui.Cells.q1) view;
            q1Var.getMessageObject();
            ImageReceiver avatarImage = q1Var.getAvatarImage();
            if (avatarImage != null) {
                int top = view.getTop();
                boolean I2 = q1Var.I2();
                t71 t71Var = this.h3;
                if (I2 && (T = t71Var.w0.T(view)) != null) {
                    if (t71Var.w0.K(T.b() - 1) != null) {
                        avatarImage.M0 = -org.telegram.messenger.g0.L(1000.0f);
                        avatarImage.h(canvas, null);
                        return drawChild;
                    }
                }
                float translationX = q1Var.getTranslationX();
                int layoutHeight = q1Var.getLayoutHeight() + view.getTop();
                int measuredHeight = t71Var.w0.getMeasuredHeight() - t71Var.w0.getPaddingBottom();
                if (layoutHeight > measuredHeight) {
                    layoutHeight = measuredHeight;
                }
                if (q1Var.J2() && (r12 = t71Var.w0.T(view)) != null) {
                    int i7 = 0;
                    while (i7 < 20) {
                        i7++;
                        v4.e1 T2 = t71Var.w0.K(T2.b() + 1);
                        if (T2 == null) {
                            break;
                        }
                        View view2 = T2.a;
                        int top2 = view2.getTop();
                        if (layoutHeight - org.telegram.messenger.g0.L(48.0f) < view2.getBottom()) {
                            translationX = Math.min(view2.getTranslationX(), translationX);
                        }
                        if (!(view2 instanceof org.telegram.ui.Cells.q1) || !((org.telegram.ui.Cells.q1) view2).J2()) {
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
                avatarImage.M0 = layoutHeight - org.telegram.messenger.g0.L(44.0f);
                avatarImage.h(canvas, null);
                if (translationX != 0.0f) {
                    canvas.restore();
                }
            }
        }
        return drawChild;
    }

    @Override // org.telegram.ui.Components.uj0
    public final void j1(View view, float f10, float f11, boolean z10) {
        if (z10 && (view instanceof org.telegram.ui.Cells.q1) && !((org.telegram.ui.Cells.q1) view).C2(f10)) {
            return;
        }
        super.j1(view, f10, f11, z10);
    }

    @Override // org.telegram.ui.Components.uj0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i7, int i10, int i11, int i12) {
        super.onLayout(z10, i7, i10, i11, i12);
        this.h3.a1();
    }

    @Override // org.telegram.ui.Components.uj0, androidx.recyclerview.widget.RecyclerView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        t71 t71Var = this.h3;
        if (action == 1) {
            if (!t71Var.t0 && (t71Var.D1 instanceof oc1) && t71Var.N0[0].getVisibility() == 0) {
                t71Var.k1(0, false, true);
            }
            t71Var.t0 = false;
        }
        if (t71Var.c2) {
            if (motionEvent.getAction() == 0) {
                this.g3 = motionEvent.getX();
                motionEvent.getY();
                if (getParent() != null) {
                    getParent().requestDisallowInterceptTouchEvent(true);
                }
                this.f3 = true;
            } else if (motionEvent.getAction() == 2) {
                if (!this.f3 && Math.abs(this.g3 - motionEvent.getX()) > org.telegram.messenger.g0.e) {
                    if (getParent() != null) {
                        getParent().requestDisallowInterceptTouchEvent(true);
                    }
                    this.f3 = true;
                }
            } else if (motionEvent.getAction() == 3 || motionEvent.getAction() == 1) {
                this.f3 = false;
                if (getParent() != null) {
                    getParent().requestDisallowInterceptTouchEvent(false);
                }
            }
            t71Var.U1.a(motionEvent);
        }
        return this.f3 || super.onTouchEvent(motionEvent);
    }

    @Override // org.telegram.ui.Components.uj0, android.view.View
    public final void setTranslationY(float f10) {
        super.setTranslationY(f10);
        t71 t71Var = this.h3;
        int i7 = 0;
        if (t71Var.L0 != null) {
            int i10 = 0;
            while (true) {
                org.telegram.ui.Components.x61[] x61VarArr = t71Var.L0;
                if (i10 >= x61VarArr.length) {
                    break;
                }
                x61VarArr[i10].invalidate();
                i10++;
            }
        }
        if (t71Var.M0 != null) {
            while (true) {
                org.telegram.ui.Components.x61[] x61VarArr2 = t71Var.M0;
                if (i7 >= x61VarArr2.length) {
                    break;
                }
                x61VarArr2[i7].invalidate();
                i7++;
            }
        }
        q61 q61Var = t71Var.F0;
        if (q61Var != null) {
            q61Var.invalidate();
        }
        q61 q61Var2 = t71Var.G0;
        if (q61Var2 != null) {
            q61Var2.invalidate();
        }
    }
}
