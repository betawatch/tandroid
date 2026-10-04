package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.view.MotionEvent;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;

/* compiled from: r8-map-id-90c74b6d1af88fe423a82a48cb36c0781986d7c98a26085f38aeb2edc71128ad */
/* loaded from: classes3.dex */
public final class mc1 extends org.telegram.ui.Components.zl0 {
    public boolean e3;
    public float f3;
    public final /* synthetic */ rd1 g3;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mc1(Context context, rd1 rd1Var) {
        super(context, null);
        this.g3 = rd1Var;
    }

    @Override // org.telegram.ui.Components.zl0
    public final boolean G0(View view) {
        mc1 mc1Var = this.g3.u0;
        View F = mc1Var.F(view);
        s4.c1 T = F == null ? null : mc1Var.T(F);
        return T == null || T.f != 2;
    }

    @Override // org.telegram.ui.Components.zl0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        s4.c1 T;
        boolean drawChild = super.drawChild(canvas, view, j3);
        if (view instanceof org.telegram.ui.Cells.u1) {
            org.telegram.ui.Cells.u1 u1Var = (org.telegram.ui.Cells.u1) view;
            u1Var.getMessageObject();
            ImageReceiver avatarImage = u1Var.getAvatarImage();
            if (avatarImage != null) {
                int top = view.getTop();
                boolean m32 = u1Var.m3();
                rd1 rd1Var = this.g3;
                if (m32 && (T = rd1Var.u0.T(view)) != null) {
                    if (rd1Var.u0.K(T.b() - 1) != null) {
                        avatarImage.setImageY(-AndroidUtilities.dp(1000.0f));
                        avatarImage.draw(canvas);
                        return drawChild;
                    }
                }
                float translationX = u1Var.getTranslationX();
                int layoutHeight = u1Var.getLayoutHeight() + view.getTop();
                int measuredHeight = rd1Var.u0.getMeasuredHeight() - rd1Var.u0.getPaddingBottom();
                if (layoutHeight > measuredHeight) {
                    layoutHeight = measuredHeight;
                }
                if (u1Var.n3() && (r11 = rd1Var.u0.T(view)) != null) {
                    int i10 = 0;
                    while (i10 < 20) {
                        i10++;
                        s4.c1 T2 = rd1Var.u0.K(T2.b() + 1);
                        if (T2 == null) {
                            break;
                        }
                        View view2 = T2.a;
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

    @Override // org.telegram.ui.Components.zl0
    public final void k1(View view, float f7, float f10, boolean z10) {
        if (z10 && (view instanceof org.telegram.ui.Cells.u1) && !((org.telegram.ui.Cells.u1) view).i3(f7)) {
            return;
        }
        super.k1(view, f7, f10, z10);
    }

    @Override // org.telegram.ui.Components.zl0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        this.g3.V0();
    }

    @Override // org.telegram.ui.Components.zl0, androidx.recyclerview.widget.RecyclerView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        rd1 rd1Var = this.g3;
        if (action == 1) {
            if (!rd1Var.r0 && (rd1Var.B1 instanceof yi1) && rd1Var.L0[0].getVisibility() == 0) {
                rd1Var.f1(0, false, true);
            }
            rd1Var.r0 = false;
        }
        if (rd1Var.a2) {
            if (motionEvent.getAction() == 0) {
                this.f3 = motionEvent.getX();
                motionEvent.getY();
                if (getParent() != null) {
                    getParent().requestDisallowInterceptTouchEvent(true);
                }
                this.e3 = true;
            } else if (motionEvent.getAction() == 2) {
                if (!this.e3 && Math.abs(this.f3 - motionEvent.getX()) > AndroidUtilities.touchSlop) {
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
            rd1Var.S1.a(motionEvent);
        }
        return this.e3 || super.onTouchEvent(motionEvent);
    }

    @Override // org.telegram.ui.Components.zl0, android.view.View
    public final void setTranslationY(float f7) {
        super.setTranslationY(f7);
        rd1 rd1Var = this.g3;
        int i10 = 0;
        if (rd1Var.J0 != null) {
            int i11 = 0;
            while (true) {
                org.telegram.ui.Components.h91[] h91VarArr = rd1Var.J0;
                if (i11 >= h91VarArr.length) {
                    break;
                }
                h91VarArr[i11].invalidate();
                i11++;
            }
        }
        if (rd1Var.K0 != null) {
            while (true) {
                org.telegram.ui.Components.h91[] h91VarArr2 = rd1Var.K0;
                if (i10 >= h91VarArr2.length) {
                    break;
                }
                h91VarArr2[i10].invalidate();
                i10++;
            }
        }
        pc1 pc1Var = rd1Var.D0;
        if (pc1Var != null) {
            pc1Var.invalidate();
        }
        pc1 pc1Var2 = rd1Var.E0;
        if (pc1Var2 != null) {
            pc1Var2.invalidate();
        }
    }
}
