package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.view.MotionEvent;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class dc1 extends org.telegram.ui.Components.sl0 {
    public boolean U2;
    public float V2;
    public final /* synthetic */ jd1 W2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dc1(Context context, jd1 jd1Var) {
        super(context, null);
        this.W2 = jd1Var;
    }

    @Override // org.telegram.ui.Components.sl0
    public final boolean F0(View view) {
        dc1 dc1Var = this.W2.r0;
        View F = dc1Var.F(view);
        f2.m1 T = F == null ? null : dc1Var.T(F);
        return T == null || T.f != 2;
    }

    @Override // org.telegram.ui.Components.sl0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        f2.m1 T;
        boolean drawChild = super.drawChild(canvas, view, j10);
        if (view instanceof org.telegram.ui.Cells.t1) {
            org.telegram.ui.Cells.t1 t1Var = (org.telegram.ui.Cells.t1) view;
            t1Var.getMessageObject();
            ImageReceiver avatarImage = t1Var.getAvatarImage();
            if (avatarImage != null) {
                int top = view.getTop();
                boolean m32 = t1Var.m3();
                jd1 jd1Var = this.W2;
                if (m32 && (T = jd1Var.r0.T(view)) != null) {
                    if (jd1Var.r0.K(T.b() - 1) != null) {
                        avatarImage.setImageY(-AndroidUtilities.dp(1000.0f));
                        avatarImage.draw(canvas);
                        return drawChild;
                    }
                }
                float translationX = t1Var.getTranslationX();
                int layoutHeight = t1Var.getLayoutHeight() + view.getTop();
                int measuredHeight = jd1Var.r0.getMeasuredHeight() - jd1Var.r0.getPaddingBottom();
                if (layoutHeight > measuredHeight) {
                    layoutHeight = measuredHeight;
                }
                if (t1Var.n3() && (r11 = jd1Var.r0.T(view)) != null) {
                    int i10 = 0;
                    while (i10 < 20) {
                        i10++;
                        f2.m1 T2 = jd1Var.r0.K(T2.b() + 1);
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

    @Override // org.telegram.ui.Components.sl0
    public final void g1(View view, float f10, float f11, boolean z4) {
        if (z4 && (view instanceof org.telegram.ui.Cells.t1) && !((org.telegram.ui.Cells.t1) view).i3(f10)) {
            return;
        }
        super.g1(view, f10, f11, z4);
    }

    @Override // org.telegram.ui.Components.sl0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z4, int i10, int i11, int i12, int i13) {
        super.onLayout(z4, i10, i11, i12, i13);
        this.W2.V0();
    }

    @Override // org.telegram.ui.Components.sl0, androidx.recyclerview.widget.RecyclerView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        jd1 jd1Var = this.W2;
        if (action == 1) {
            if (!jd1Var.o0 && (jd1Var.y1 instanceof vi1) && jd1Var.I0[0].getVisibility() == 0) {
                jd1Var.f1(0, false, true);
            }
            jd1Var.o0 = false;
        }
        if (jd1Var.X1) {
            if (motionEvent.getAction() == 0) {
                this.V2 = motionEvent.getX();
                motionEvent.getY();
                if (getParent() != null) {
                    getParent().requestDisallowInterceptTouchEvent(true);
                }
                this.U2 = true;
            } else if (motionEvent.getAction() == 2) {
                if (!this.U2 && Math.abs(this.V2 - motionEvent.getX()) > AndroidUtilities.touchSlop) {
                    if (getParent() != null) {
                        getParent().requestDisallowInterceptTouchEvent(true);
                    }
                    this.U2 = true;
                }
            } else if (motionEvent.getAction() == 3 || motionEvent.getAction() == 1) {
                this.U2 = false;
                if (getParent() != null) {
                    getParent().requestDisallowInterceptTouchEvent(false);
                }
            }
            jd1Var.P1.a(motionEvent);
        }
        return this.U2 || super.onTouchEvent(motionEvent);
    }

    @Override // org.telegram.ui.Components.sl0, android.view.View
    public final void setTranslationY(float f10) {
        super.setTranslationY(f10);
        jd1 jd1Var = this.W2;
        int i10 = 0;
        if (jd1Var.G0 != null) {
            int i11 = 0;
            while (true) {
                org.telegram.ui.Components.m81[] m81VarArr = jd1Var.G0;
                if (i11 >= m81VarArr.length) {
                    break;
                }
                m81VarArr[i11].invalidate();
                i11++;
            }
        }
        if (jd1Var.H0 != null) {
            while (true) {
                org.telegram.ui.Components.m81[] m81VarArr2 = jd1Var.H0;
                if (i10 >= m81VarArr2.length) {
                    break;
                }
                m81VarArr2[i10].invalidate();
                i10++;
            }
        }
        gc1 gc1Var = jd1Var.A0;
        if (gc1Var != null) {
            gc1Var.invalidate();
        }
        gc1 gc1Var2 = jd1Var.B0;
        if (gc1Var2 != null) {
            gc1Var2.invalidate();
        }
    }
}
