package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.view.MotionEvent;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class jb1 extends org.telegram.ui.Components.jl0 {
    public boolean T2;
    public float U2;
    public final /* synthetic */ qc1 V2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jb1(Context context, qc1 qc1Var) {
        super(context, null);
        this.V2 = qc1Var;
    }

    @Override // org.telegram.ui.Components.jl0
    public final boolean F0(View view) {
        jb1 jb1Var = this.V2.q0;
        View F = jb1Var.F(view);
        f2.n1 T = F == null ? null : jb1Var.T(F);
        return T == null || T.f != 2;
    }

    @Override // org.telegram.ui.Components.jl0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        f2.n1 T;
        boolean drawChild = super.drawChild(canvas, view, j10);
        if (view instanceof org.telegram.ui.Cells.s1) {
            org.telegram.ui.Cells.s1 s1Var = (org.telegram.ui.Cells.s1) view;
            s1Var.getMessageObject();
            ImageReceiver avatarImage = s1Var.getAvatarImage();
            if (avatarImage != null) {
                int top = view.getTop();
                boolean m32 = s1Var.m3();
                qc1 qc1Var = this.V2;
                if (m32 && (T = qc1Var.q0.T(view)) != null) {
                    if (qc1Var.q0.K(T.b() - 1) != null) {
                        avatarImage.setImageY(-AndroidUtilities.dp(1000.0f));
                        avatarImage.draw(canvas);
                        return drawChild;
                    }
                }
                float translationX = s1Var.getTranslationX();
                int layoutHeight = s1Var.getLayoutHeight() + view.getTop();
                int measuredHeight = qc1Var.q0.getMeasuredHeight() - qc1Var.q0.getPaddingBottom();
                if (layoutHeight > measuredHeight) {
                    layoutHeight = measuredHeight;
                }
                if (s1Var.n3() && (r11 = qc1Var.q0.T(view)) != null) {
                    int i10 = 0;
                    while (i10 < 20) {
                        i10++;
                        f2.n1 T2 = qc1Var.q0.K(T2.b() + 1);
                        if (T2 == null) {
                            break;
                        }
                        View view2 = T2.a;
                        int top2 = view2.getTop();
                        if (layoutHeight - AndroidUtilities.dp(48.0f) < view2.getBottom()) {
                            translationX = Math.min(view2.getTranslationX(), translationX);
                        }
                        if (!(view2 instanceof org.telegram.ui.Cells.s1) || !((org.telegram.ui.Cells.s1) view2).n3()) {
                            top = top2;
                            break;
                        }
                        top = top2;
                    }
                }
                if (layoutHeight - AndroidUtilities.dp(48.0f) < top) {
                    layoutHeight = AndroidUtilities.dp(48.0f) + top;
                }
                if (translationX != 0.0f) {
                    canvas.save();
                    canvas.translate(translationX, 0.0f);
                }
                avatarImage.setImageY(layoutHeight - AndroidUtilities.dp(44.0f));
                avatarImage.draw(canvas);
                if (translationX != 0.0f) {
                    canvas.restore();
                }
            }
        }
        return drawChild;
    }

    @Override // org.telegram.ui.Components.jl0
    public final void h1(View view, float f9, float f10, boolean z10) {
        if (z10 && (view instanceof org.telegram.ui.Cells.s1) && !((org.telegram.ui.Cells.s1) view).i3(f9)) {
            return;
        }
        super.h1(view, f9, f10, z10);
    }

    @Override // org.telegram.ui.Components.jl0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        this.V2.V0();
    }

    @Override // org.telegram.ui.Components.jl0, androidx.recyclerview.widget.RecyclerView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        qc1 qc1Var = this.V2;
        if (action == 1) {
            if (!qc1Var.n0 && (qc1Var.x1 instanceof zh1) && qc1Var.H0[0].getVisibility() == 0) {
                qc1Var.f1(0, false, true);
            }
            qc1Var.n0 = false;
        }
        if (qc1Var.W1) {
            if (motionEvent.getAction() == 0) {
                this.U2 = motionEvent.getX();
                motionEvent.getY();
                if (getParent() != null) {
                    getParent().requestDisallowInterceptTouchEvent(true);
                }
                this.T2 = true;
            } else if (motionEvent.getAction() == 2) {
                if (!this.T2 && Math.abs(this.U2 - motionEvent.getX()) > AndroidUtilities.touchSlop) {
                    if (getParent() != null) {
                        getParent().requestDisallowInterceptTouchEvent(true);
                    }
                    this.T2 = true;
                }
            } else if (motionEvent.getAction() == 3 || motionEvent.getAction() == 1) {
                this.T2 = false;
                if (getParent() != null) {
                    getParent().requestDisallowInterceptTouchEvent(false);
                }
            }
            qc1Var.O1.a(motionEvent);
        }
        return this.T2 || super.onTouchEvent(motionEvent);
    }

    @Override // org.telegram.ui.Components.jl0, android.view.View
    public final void setTranslationY(float f9) {
        super.setTranslationY(f9);
        qc1 qc1Var = this.V2;
        int i10 = 0;
        if (qc1Var.F0 != null) {
            int i11 = 0;
            while (true) {
                org.telegram.ui.Components.a81[] a81VarArr = qc1Var.F0;
                if (i11 >= a81VarArr.length) {
                    break;
                }
                a81VarArr[i11].invalidate();
                i11++;
            }
        }
        if (qc1Var.G0 != null) {
            while (true) {
                org.telegram.ui.Components.a81[] a81VarArr2 = qc1Var.G0;
                if (i10 >= a81VarArr2.length) {
                    break;
                }
                a81VarArr2[i10].invalidate();
                i10++;
            }
        }
        nb1 nb1Var = qc1Var.z0;
        if (nb1Var != null) {
            nb1Var.invalidate();
        }
        nb1 nb1Var2 = qc1Var.A0;
        if (nb1Var2 != null) {
            nb1Var2.invalidate();
        }
    }
}
