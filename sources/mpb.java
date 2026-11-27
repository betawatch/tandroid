// default package

import android.content.Context;
import android.graphics.Canvas;
import android.view.MotionEvent;
import android.view.View;
import org.telegram.messenger.ImageReceiver;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final class mpb extends d79 {
    public boolean f3;
    public float g3;
    public final /* synthetic */ pqb h3;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mpb(pqb pqbVar, Context context) {
        super(context, null);
        this.h3 = pqbVar;
    }

    @Override // d79
    public final boolean H0(View view) {
        mpb mpbVar = this.h3.w0;
        View G = mpbVar.G(view);
        f89 U = G == null ? null : mpbVar.U(G);
        return U == null || U.f != 2;
    }

    @Override // d79, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j) {
        f89 U;
        boolean drawChild = super.drawChild(canvas, view, j);
        if (view instanceof wb2) {
            wb2 wb2Var = (wb2) view;
            wb2Var.getMessageObject();
            ImageReceiver avatarImage = wb2Var.getAvatarImage();
            if (avatarImage != null) {
                int top = view.getTop();
                boolean K2 = wb2Var.K2();
                pqb pqbVar = this.h3;
                if (K2 && (U = pqbVar.w0.U(view)) != null) {
                    if (pqbVar.w0.L(U.b() - 1) != null) {
                        avatarImage.M0 = -hl.L(1000.0f);
                        avatarImage.h(canvas, null);
                        return drawChild;
                    }
                }
                float translationX = wb2Var.getTranslationX();
                int layoutHeight = wb2Var.getLayoutHeight() + view.getTop();
                int measuredHeight = pqbVar.w0.getMeasuredHeight() - pqbVar.w0.getPaddingBottom();
                if (layoutHeight > measuredHeight) {
                    layoutHeight = measuredHeight;
                }
                if (wb2Var.L2() && (r11 = pqbVar.w0.U(view)) != null) {
                    int i = 0;
                    while (i < 20) {
                        i++;
                        f89 U2 = pqbVar.w0.L(U2.b() + 1);
                        if (U2 == null) {
                            break;
                        }
                        View view2 = U2.a;
                        int top2 = view2.getTop();
                        if (layoutHeight - hl.L(48.0f) < view2.getBottom()) {
                            translationX = Math.min(view2.getTranslationX(), translationX);
                        }
                        if (!(view2 instanceof wb2) || !((wb2) view2).L2()) {
                            top = top2;
                            break;
                        }
                        top = top2;
                    }
                }
                if (layoutHeight - hl.L(48.0f) < top) {
                    layoutHeight = hl.L(48.0f) + top;
                }
                if (translationX != 0.0f) {
                    canvas.save();
                    canvas.translate(translationX, 0.0f);
                }
                avatarImage.M0 = layoutHeight - hl.L(44.0f);
                avatarImage.h(canvas, null);
                if (translationX != 0.0f) {
                    canvas.restore();
                }
            }
        }
        return drawChild;
    }

    @Override // d79
    public final void l1(View view, float f, float f2, boolean z) {
        if (z && (view instanceof wb2) && !((wb2) view).E2(f)) {
            return;
        }
        super.l1(view, f, f2, z);
    }

    @Override // d79, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        this.h3.X0();
    }

    @Override // d79, androidx.recyclerview.widget.RecyclerView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        pqb pqbVar = this.h3;
        if (action == 1) {
            if (!pqbVar.t0 && (pqbVar.D1 instanceof yvc) && pqbVar.N0[0].getVisibility() == 0) {
                pqbVar.k1(0, false, true);
            }
            pqbVar.t0 = false;
        }
        if (pqbVar.c2) {
            if (motionEvent.getAction() == 0) {
                this.g3 = motionEvent.getX();
                motionEvent.getY();
                if (getParent() != null) {
                    getParent().requestDisallowInterceptTouchEvent(true);
                }
                this.f3 = true;
            } else if (motionEvent.getAction() == 2) {
                if (!this.f3 && Math.abs(this.g3 - motionEvent.getX()) > hl.e) {
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
            pqbVar.U1.a(motionEvent);
        }
        return this.f3 || super.onTouchEvent(motionEvent);
    }

    @Override // d79, android.view.View
    public final void setTranslationY(float f) {
        super.setTranslationY(f);
        pqb pqbVar = this.h3;
        int i = 0;
        if (pqbVar.L0 != null) {
            int i2 = 0;
            while (true) {
                fvc[] fvcVarArr = pqbVar.L0;
                if (i2 >= fvcVarArr.length) {
                    break;
                }
                fvcVarArr[i2].invalidate();
                i2++;
            }
        }
        if (pqbVar.M0 != null) {
            while (true) {
                fvc[] fvcVarArr2 = pqbVar.M0;
                if (i >= fvcVarArr2.length) {
                    break;
                }
                fvcVarArr2[i].invalidate();
                i++;
            }
        }
        ppb ppbVar = pqbVar.F0;
        if (ppbVar != null) {
            ppbVar.invalidate();
        }
        ppb ppbVar2 = pqbVar.G0;
        if (ppbVar2 != null) {
            ppbVar2.invalidate();
        }
    }
}
