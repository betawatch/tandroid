package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.view.MotionEvent;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class ib1 extends org.telegram.ui.Components.wk0 {
    public boolean T2;
    public float U2;
    public final /* synthetic */ oc1 V2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ib1(Context context, oc1 oc1Var) {
        super(context, null);
        this.V2 = oc1Var;
    }

    @Override // org.telegram.ui.Components.wk0
    public final boolean F0(View view) {
        ib1 ib1Var = this.V2.q0;
        View F = ib1Var.F(view);
        f2.q1 T = F == null ? null : ib1Var.T(F);
        return T == null || T.f != 2;
    }

    @Override // org.telegram.ui.Components.wk0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        f2.q1 T;
        boolean drawChild = super.drawChild(canvas, view, j10);
        if (view instanceof org.telegram.ui.Cells.t1) {
            org.telegram.ui.Cells.t1 t1Var = (org.telegram.ui.Cells.t1) view;
            t1Var.getMessageObject();
            ImageReceiver avatarImage = t1Var.getAvatarImage();
            if (avatarImage != null) {
                int top = view.getTop();
                boolean m32 = t1Var.m3();
                oc1 oc1Var = this.V2;
                if (m32 && (T = oc1Var.q0.T(view)) != null) {
                    if (oc1Var.q0.K(T.b() - 1) != null) {
                        avatarImage.setImageY(-AndroidUtilities.dp(1000.0f));
                        avatarImage.draw(canvas);
                        return drawChild;
                    }
                }
                float translationX = t1Var.getTranslationX();
                int layoutHeight = t1Var.getLayoutHeight() + view.getTop();
                int measuredHeight = oc1Var.q0.getMeasuredHeight() - oc1Var.q0.getPaddingBottom();
                if (layoutHeight > measuredHeight) {
                    layoutHeight = measuredHeight;
                }
                if (t1Var.n3() && (r11 = oc1Var.q0.T(view)) != null) {
                    int i9 = 0;
                    while (i9 < 20) {
                        i9++;
                        f2.q1 T2 = oc1Var.q0.K(T2.b() + 1);
                        if (T2 == null) {
                            break;
                        }
                        View view2 = T2.a;
                        int top2 = view2.getTop();
                        if (layoutHeight - AndroidUtilities.dp(48.0f) < view2.getBottom()) {
                            translationX = Math.min(view2.getTranslationX(), translationX);
                        }
                        if (!(view2 instanceof org.telegram.ui.Cells.t1) || !((org.telegram.ui.Cells.t1) view2).n3()) {
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

    @Override // org.telegram.ui.Components.wk0
    public final void h1(View view, float f10, float f11, boolean z10) {
        if (z10 && (view instanceof org.telegram.ui.Cells.t1) && !((org.telegram.ui.Cells.t1) view).i3(f10)) {
            return;
        }
        super.h1(view, f10, f11, z10);
    }

    @Override // org.telegram.ui.Components.wk0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i9, int i10, int i11, int i12) {
        super.onLayout(z10, i9, i10, i11, i12);
        this.V2.V0();
    }

    @Override // org.telegram.ui.Components.wk0, androidx.recyclerview.widget.RecyclerView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        oc1 oc1Var = this.V2;
        if (action == 1) {
            if (!oc1Var.n0 && (oc1Var.x1 instanceof xh1) && oc1Var.H0[0].getVisibility() == 0) {
                oc1Var.f1(0, false, true);
            }
            oc1Var.n0 = false;
        }
        if (oc1Var.W1) {
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
            oc1Var.O1.a(motionEvent);
        }
        return this.T2 || super.onTouchEvent(motionEvent);
    }

    @Override // org.telegram.ui.Components.wk0, android.view.View
    public final void setTranslationY(float f10) {
        super.setTranslationY(f10);
        oc1 oc1Var = this.V2;
        int i9 = 0;
        if (oc1Var.F0 != null) {
            int i10 = 0;
            while (true) {
                org.telegram.ui.Components.o71[] o71VarArr = oc1Var.F0;
                if (i10 >= o71VarArr.length) {
                    break;
                }
                o71VarArr[i10].invalidate();
                i10++;
            }
        }
        if (oc1Var.G0 != null) {
            while (true) {
                org.telegram.ui.Components.o71[] o71VarArr2 = oc1Var.G0;
                if (i9 >= o71VarArr2.length) {
                    break;
                }
                o71VarArr2[i9].invalidate();
                i9++;
            }
        }
        mb1 mb1Var = oc1Var.z0;
        if (mb1Var != null) {
            mb1Var.invalidate();
        }
        mb1 mb1Var2 = oc1Var.A0;
        if (mb1Var2 != null) {
            mb1Var2.invalidate();
        }
    }
}
