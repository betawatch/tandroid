package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.view.MotionEvent;
import android.view.View;
import org.telegram.messenger.ImageReceiver;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class g61 extends org.telegram.ui.Components.tj0 {
    public boolean f3;
    public float g3;
    public final /* synthetic */ l71 h3;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g61(Context context, l71 l71Var) {
        super(context, null);
        this.h3 = l71Var;
    }

    @Override // org.telegram.ui.Components.tj0
    public final boolean F0(View view) {
        g61 g61Var = this.h3.w0;
        View F = g61Var.F(view);
        u4.d1 T = F == null ? null : g61Var.T(F);
        return T == null || T.f != 2;
    }

    @Override // org.telegram.ui.Components.tj0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        u4.d1 T;
        boolean drawChild = super.drawChild(canvas, view, j10);
        if (view instanceof org.telegram.ui.Cells.q1) {
            org.telegram.ui.Cells.q1 q1Var = (org.telegram.ui.Cells.q1) view;
            q1Var.getMessageObject();
            ImageReceiver avatarImage = q1Var.getAvatarImage();
            if (avatarImage != null) {
                int top = view.getTop();
                boolean G2 = q1Var.G2();
                l71 l71Var = this.h3;
                if (G2 && (T = l71Var.w0.T(view)) != null) {
                    if (l71Var.w0.K(T.b() - 1) != null) {
                        avatarImage.M0 = -org.telegram.messenger.g0.L(1000.0f);
                        avatarImage.h(canvas, null);
                        return drawChild;
                    }
                }
                float translationX = q1Var.getTranslationX();
                int layoutHeight = q1Var.getLayoutHeight() + view.getTop();
                int measuredHeight = l71Var.w0.getMeasuredHeight() - l71Var.w0.getPaddingBottom();
                if (layoutHeight > measuredHeight) {
                    layoutHeight = measuredHeight;
                }
                if (q1Var.H2() && (r12 = l71Var.w0.T(view)) != null) {
                    int i3 = 0;
                    while (i3 < 20) {
                        i3++;
                        u4.d1 T2 = l71Var.w0.K(T2.b() + 1);
                        if (T2 == null) {
                            break;
                        }
                        View view2 = T2.a;
                        int top2 = view2.getTop();
                        if (layoutHeight - org.telegram.messenger.g0.L(48.0f) < view2.getBottom()) {
                            translationX = Math.min(view2.getTranslationX(), translationX);
                        }
                        if (!(view2 instanceof org.telegram.ui.Cells.q1) || !((org.telegram.ui.Cells.q1) view2).H2()) {
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

    @Override // org.telegram.ui.Components.tj0
    public final void j1(View view, float f10, float f11, boolean z10) {
        if (z10 && (view instanceof org.telegram.ui.Cells.q1) && !((org.telegram.ui.Cells.q1) view).A2(f10)) {
            return;
        }
        super.j1(view, f10, f11, z10);
    }

    @Override // org.telegram.ui.Components.tj0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i3, int i10, int i11, int i12) {
        super.onLayout(z10, i3, i10, i11, i12);
        this.h3.a1();
    }

    @Override // org.telegram.ui.Components.tj0, androidx.recyclerview.widget.RecyclerView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        l71 l71Var = this.h3;
        if (action == 1) {
            if (!l71Var.t0 && (l71Var.D1 instanceof kc1) && l71Var.N0[0].getVisibility() == 0) {
                l71Var.k1(0, false, true);
            }
            l71Var.t0 = false;
        }
        if (l71Var.c2) {
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
            l71Var.U1.a(motionEvent);
        }
        return this.f3 || super.onTouchEvent(motionEvent);
    }

    @Override // org.telegram.ui.Components.tj0, android.view.View
    public final void setTranslationY(float f10) {
        super.setTranslationY(f10);
        l71 l71Var = this.h3;
        int i3 = 0;
        if (l71Var.L0 != null) {
            int i10 = 0;
            while (true) {
                org.telegram.ui.Components.o61[] o61VarArr = l71Var.L0;
                if (i10 >= o61VarArr.length) {
                    break;
                }
                o61VarArr[i10].invalidate();
                i10++;
            }
        }
        if (l71Var.M0 != null) {
            while (true) {
                org.telegram.ui.Components.o61[] o61VarArr2 = l71Var.M0;
                if (i3 >= o61VarArr2.length) {
                    break;
                }
                o61VarArr2[i3].invalidate();
                i3++;
            }
        }
        j61 j61Var = l71Var.F0;
        if (j61Var != null) {
            j61Var.invalidate();
        }
        j61 j61Var2 = l71Var.G0;
        if (j61Var2 != null) {
            j61Var2.invalidate();
        }
    }
}
