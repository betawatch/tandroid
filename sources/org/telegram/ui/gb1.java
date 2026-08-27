package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.view.MotionEvent;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class gb1 extends org.telegram.ui.Components.zk0 {
    public boolean T2;
    public float U2;
    public final /* synthetic */ nc1 V2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gb1(Context context, nc1 nc1Var) {
        super(context, null);
        this.V2 = nc1Var;
    }

    @Override // org.telegram.ui.Components.zk0
    public final boolean F0(View view) {
        gb1 gb1Var = this.V2.q0;
        View F = gb1Var.F(view);
        f2.o1 T = F == null ? null : gb1Var.T(F);
        return T == null || T.f != 2;
    }

    @Override // org.telegram.ui.Components.zk0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        f2.o1 T;
        boolean drawChild = super.drawChild(canvas, view, j10);
        if (view instanceof org.telegram.ui.Cells.s1) {
            org.telegram.ui.Cells.s1 s1Var = (org.telegram.ui.Cells.s1) view;
            s1Var.getMessageObject();
            ImageReceiver avatarImage = s1Var.getAvatarImage();
            if (avatarImage != null) {
                int top = view.getTop();
                boolean l32 = s1Var.l3();
                nc1 nc1Var = this.V2;
                if (l32 && (T = nc1Var.q0.T(view)) != null) {
                    if (nc1Var.q0.K(T.b() - 1) != null) {
                        avatarImage.setImageY(-AndroidUtilities.dp(1000.0f));
                        avatarImage.draw(canvas);
                        return drawChild;
                    }
                }
                float translationX = s1Var.getTranslationX();
                int layoutHeight = s1Var.getLayoutHeight() + view.getTop();
                int measuredHeight = nc1Var.q0.getMeasuredHeight() - nc1Var.q0.getPaddingBottom();
                if (layoutHeight > measuredHeight) {
                    layoutHeight = measuredHeight;
                }
                if (s1Var.m3() && (r11 = nc1Var.q0.T(view)) != null) {
                    int i10 = 0;
                    while (i10 < 20) {
                        i10++;
                        f2.o1 T2 = nc1Var.q0.K(T2.b() + 1);
                        if (T2 == null) {
                            break;
                        }
                        View view2 = T2.a;
                        int top2 = view2.getTop();
                        if (layoutHeight - AndroidUtilities.dp(48.0f) < view2.getBottom()) {
                            translationX = Math.min(view2.getTranslationX(), translationX);
                        }
                        if (!(view2 instanceof org.telegram.ui.Cells.s1) || !((org.telegram.ui.Cells.s1) view2).m3()) {
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

    @Override // org.telegram.ui.Components.zk0
    public final void h1(View view, float f10, float f11, boolean z10) {
        if (z10 && (view instanceof org.telegram.ui.Cells.s1) && !((org.telegram.ui.Cells.s1) view).h3(f10)) {
            return;
        }
        super.h1(view, f10, f11, z10);
    }

    @Override // org.telegram.ui.Components.zk0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        this.V2.V0();
    }

    @Override // org.telegram.ui.Components.zk0, androidx.recyclerview.widget.RecyclerView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        nc1 nc1Var = this.V2;
        if (action == 1) {
            if (!nc1Var.n0 && (nc1Var.x1 instanceof wh1) && nc1Var.H0[0].getVisibility() == 0) {
                nc1Var.f1(0, false, true);
            }
            nc1Var.n0 = false;
        }
        if (nc1Var.W1) {
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
            nc1Var.O1.a(motionEvent);
        }
        return this.T2 || super.onTouchEvent(motionEvent);
    }

    @Override // org.telegram.ui.Components.zk0, android.view.View
    public final void setTranslationY(float f10) {
        super.setTranslationY(f10);
        nc1 nc1Var = this.V2;
        int i10 = 0;
        if (nc1Var.F0 != null) {
            int i11 = 0;
            while (true) {
                org.telegram.ui.Components.q71[] q71VarArr = nc1Var.F0;
                if (i11 >= q71VarArr.length) {
                    break;
                }
                q71VarArr[i11].invalidate();
                i11++;
            }
        }
        if (nc1Var.G0 != null) {
            while (true) {
                org.telegram.ui.Components.q71[] q71VarArr2 = nc1Var.G0;
                if (i10 >= q71VarArr2.length) {
                    break;
                }
                q71VarArr2[i10].invalidate();
                i10++;
            }
        }
        kb1 kb1Var = nc1Var.z0;
        if (kb1Var != null) {
            kb1Var.invalidate();
        }
        kb1 kb1Var2 = nc1Var.A0;
        if (kb1Var2 != null) {
            kb1Var2.invalidate();
        }
    }
}
