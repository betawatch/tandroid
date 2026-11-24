// default package

import android.content.Context;
import android.graphics.Canvas;
import android.view.MotionEvent;
import android.view.View;
import org.telegram.messenger.ImageReceiver;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class nlb extends o39 {
    public boolean f3;
    public float g3;
    public final /* synthetic */ qmb h3;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nlb(qmb qmbVar, Context context) {
        super(context, null);
        this.h3 = qmbVar;
    }

    @Override // o39
    public final boolean G0(View view) {
        nlb nlbVar = this.h3.w0;
        View F = nlbVar.F(view);
        s49 T = F == null ? null : nlbVar.T(F);
        return T == null || T.f != 2;
    }

    @Override // o39, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j) {
        s49 T;
        boolean drawChild = super.drawChild(canvas, view, j);
        if (view instanceof gb2) {
            gb2 gb2Var = (gb2) view;
            gb2Var.getMessageObject();
            ImageReceiver avatarImage = gb2Var.getAvatarImage();
            if (avatarImage != null) {
                int top = view.getTop();
                boolean K2 = gb2Var.K2();
                qmb qmbVar = this.h3;
                if (K2 && (T = qmbVar.w0.T(view)) != null) {
                    if (qmbVar.w0.K(T.b() - 1) != null) {
                        avatarImage.M0 = -gl.L(1000.0f);
                        avatarImage.h(canvas, null);
                        return drawChild;
                    }
                }
                float translationX = gb2Var.getTranslationX();
                int layoutHeight = gb2Var.getLayoutHeight() + view.getTop();
                int measuredHeight = qmbVar.w0.getMeasuredHeight() - qmbVar.w0.getPaddingBottom();
                if (layoutHeight > measuredHeight) {
                    layoutHeight = measuredHeight;
                }
                if (gb2Var.L2() && (r11 = qmbVar.w0.T(view)) != null) {
                    int i = 0;
                    while (i < 20) {
                        i++;
                        s49 T2 = qmbVar.w0.K(T2.b() + 1);
                        if (T2 == null) {
                            break;
                        }
                        View view2 = T2.a;
                        int top2 = view2.getTop();
                        if (layoutHeight - gl.L(48.0f) < view2.getBottom()) {
                            translationX = Math.min(view2.getTranslationX(), translationX);
                        }
                        if (!(view2 instanceof gb2) || !((gb2) view2).L2()) {
                            top = top2;
                            break;
                        }
                        top = top2;
                    }
                }
                if (layoutHeight - gl.L(48.0f) < top) {
                    layoutHeight = gl.L(48.0f) + top;
                }
                if (translationX != 0.0f) {
                    canvas.save();
                    canvas.translate(translationX, 0.0f);
                }
                avatarImage.M0 = layoutHeight - gl.L(44.0f);
                avatarImage.h(canvas, null);
                if (translationX != 0.0f) {
                    canvas.restore();
                }
            }
        }
        return drawChild;
    }

    @Override // o39
    public final void k1(View view, float f, float f2, boolean z) {
        if (z && (view instanceof gb2) && !((gb2) view).E2(f)) {
            return;
        }
        super.k1(view, f, f2, z);
    }

    @Override // o39, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        this.h3.W0();
    }

    @Override // o39, androidx.recyclerview.widget.RecyclerView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        qmb qmbVar = this.h3;
        if (action == 1) {
            if (!qmbVar.t0 && (qmbVar.D1 instanceof krc) && qmbVar.N0[0].getVisibility() == 0) {
                qmbVar.j1(0, false, true);
            }
            qmbVar.t0 = false;
        }
        if (qmbVar.c2) {
            if (motionEvent.getAction() == 0) {
                this.g3 = motionEvent.getX();
                motionEvent.getY();
                if (getParent() != null) {
                    getParent().requestDisallowInterceptTouchEvent(true);
                }
                this.f3 = true;
            } else if (motionEvent.getAction() == 2) {
                if (!this.f3 && Math.abs(this.g3 - motionEvent.getX()) > gl.e) {
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
            qmbVar.U1.a(motionEvent);
        }
        return this.f3 || super.onTouchEvent(motionEvent);
    }

    @Override // o39, android.view.View
    public final void setTranslationY(float f) {
        super.setTranslationY(f);
        qmb qmbVar = this.h3;
        int i = 0;
        if (qmbVar.L0 != null) {
            int i2 = 0;
            while (true) {
                rqc[] rqcVarArr = qmbVar.L0;
                if (i2 >= rqcVarArr.length) {
                    break;
                }
                rqcVarArr[i2].invalidate();
                i2++;
            }
        }
        if (qmbVar.M0 != null) {
            while (true) {
                rqc[] rqcVarArr2 = qmbVar.M0;
                if (i >= rqcVarArr2.length) {
                    break;
                }
                rqcVarArr2[i].invalidate();
                i++;
            }
        }
        qlb qlbVar = qmbVar.F0;
        if (qlbVar != null) {
            qlbVar.invalidate();
        }
        qlb qlbVar2 = qmbVar.G0;
        if (qlbVar2 != null) {
            qlbVar2.invalidate();
        }
    }
}
