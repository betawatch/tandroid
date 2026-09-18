package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.view.MotionEvent;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;

/* compiled from: r8-map-id-33b1d79182603e8304c32e909c352797304d7e7816a08740f96af6cffe97caab */
/* loaded from: classes3.dex */
public final class qc1 extends org.telegram.ui.Components.wl0 {
    public boolean X2;
    public float Y2;
    public final /* synthetic */ vd1 Z2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qc1(Context context, vd1 vd1Var) {
        super(context, null);
        this.Z2 = vd1Var;
    }

    @Override // org.telegram.ui.Components.wl0
    public final boolean G0(View view) {
        qc1 qc1Var = this.Z2.u0;
        View G = qc1Var.G(view);
        s4.c1 U = G == null ? null : qc1Var.U(G);
        return U == null || U.f != 2;
    }

    @Override // org.telegram.ui.Components.wl0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        s4.c1 U;
        boolean drawChild = super.drawChild(canvas, view, j3);
        if (view instanceof org.telegram.ui.Cells.u1) {
            org.telegram.ui.Cells.u1 u1Var = (org.telegram.ui.Cells.u1) view;
            u1Var.getMessageObject();
            ImageReceiver avatarImage = u1Var.getAvatarImage();
            if (avatarImage != null) {
                int top = view.getTop();
                boolean m32 = u1Var.m3();
                vd1 vd1Var = this.Z2;
                if (m32 && (U = vd1Var.u0.U(view)) != null) {
                    if (vd1Var.u0.L(U.b() - 1) != null) {
                        avatarImage.setImageY(-AndroidUtilities.dp(1000.0f));
                        avatarImage.draw(canvas);
                        return drawChild;
                    }
                }
                float translationX = u1Var.getTranslationX();
                int layoutHeight = u1Var.getLayoutHeight() + view.getTop();
                int measuredHeight = vd1Var.u0.getMeasuredHeight() - vd1Var.u0.getPaddingBottom();
                if (layoutHeight > measuredHeight) {
                    layoutHeight = measuredHeight;
                }
                if (u1Var.n3() && (r11 = vd1Var.u0.U(view)) != null) {
                    int i10 = 0;
                    while (i10 < 20) {
                        i10++;
                        s4.c1 U2 = vd1Var.u0.L(U2.b() + 1);
                        if (U2 == null) {
                            break;
                        }
                        View view2 = U2.a;
                        int top2 = view2.getTop();
                        if (layoutHeight - AndroidUtilities.dp(48.0f) < view2.getBottom()) {
                            translationX = Math.min(view2.getTranslationX(), translationX);
                        }
                        if (!(view2 instanceof org.telegram.ui.Cells.u1) || !((org.telegram.ui.Cells.u1) view2).n3()) {
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

    @Override // org.telegram.ui.Components.wl0
    public final void i1(View view, float f7, float f10, boolean z10) {
        if (z10 && (view instanceof org.telegram.ui.Cells.u1) && !((org.telegram.ui.Cells.u1) view).i3(f7)) {
            return;
        }
        super.i1(view, f7, f10, z10);
    }

    @Override // org.telegram.ui.Components.wl0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        this.Z2.V0();
    }

    @Override // org.telegram.ui.Components.wl0, androidx.recyclerview.widget.RecyclerView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        vd1 vd1Var = this.Z2;
        if (action == 1) {
            if (!vd1Var.r0 && (vd1Var.B1 instanceof ej1) && vd1Var.L0[0].getVisibility() == 0) {
                vd1Var.f1(0, false, true);
            }
            vd1Var.r0 = false;
        }
        if (vd1Var.a2) {
            if (motionEvent.getAction() == 0) {
                this.Y2 = motionEvent.getX();
                motionEvent.getY();
                if (getParent() != null) {
                    getParent().requestDisallowInterceptTouchEvent(true);
                }
                this.X2 = true;
            } else if (motionEvent.getAction() == 2) {
                if (!this.X2 && Math.abs(this.Y2 - motionEvent.getX()) > AndroidUtilities.touchSlop) {
                    if (getParent() != null) {
                        getParent().requestDisallowInterceptTouchEvent(true);
                    }
                    this.X2 = true;
                }
            } else if (motionEvent.getAction() == 3 || motionEvent.getAction() == 1) {
                this.X2 = false;
                if (getParent() != null) {
                    getParent().requestDisallowInterceptTouchEvent(false);
                }
            }
            vd1Var.S1.a(motionEvent);
        }
        return this.X2 || super.onTouchEvent(motionEvent);
    }

    @Override // org.telegram.ui.Components.wl0, android.view.View
    public final void setTranslationY(float f7) {
        super.setTranslationY(f7);
        vd1 vd1Var = this.Z2;
        int i10 = 0;
        if (vd1Var.J0 != null) {
            int i11 = 0;
            while (true) {
                org.telegram.ui.Components.y81[] y81VarArr = vd1Var.J0;
                if (i11 >= y81VarArr.length) {
                    break;
                }
                y81VarArr[i11].invalidate();
                i11++;
            }
        }
        if (vd1Var.K0 != null) {
            while (true) {
                org.telegram.ui.Components.y81[] y81VarArr2 = vd1Var.K0;
                if (i10 >= y81VarArr2.length) {
                    break;
                }
                y81VarArr2[i10].invalidate();
                i10++;
            }
        }
        tc1 tc1Var = vd1Var.D0;
        if (tc1Var != null) {
            tc1Var.invalidate();
        }
        tc1 tc1Var2 = vd1Var.E0;
        if (tc1Var2 != null) {
            tc1Var2.invalidate();
        }
    }
}
