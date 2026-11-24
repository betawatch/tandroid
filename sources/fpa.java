// default package

import android.content.Context;
import android.graphics.Canvas;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class fpa extends wec {
    public final /* synthetic */ vqa W;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fpa(vqa vqaVar, Context context) {
        super(context, null);
        this.W = vqaVar;
    }

    @Override // wec
    public final void F(View view, float f) {
        View view2;
        hv4 hv4Var;
        hv4 hv4Var2;
        hpa hpaVar;
        hpa hpaVar2;
        hpa hpaVar3;
        if (getMeasuredWidth() <= 0) {
            view.setTranslationX(f);
            return;
        }
        float i = Utilities.i(f / getMeasuredWidth(), 1.0f, -1.0f);
        vqa vqaVar = this.W;
        view.setTranslationX(((-i) * 2.0f * vqaVar.u0) + f);
        view.setPivotX(i <= 0.0f ? view.getMeasuredWidth() : 0.0f);
        view.setCameraDistance(view.getMeasuredHeight() * 3.4f);
        view.setScaleX(1.0f - Math.abs(0.25f * i));
        view.setRotationY(i * 10.0f);
        if (view instanceof FrameLayout) {
            FrameLayout frameLayout = (FrameLayout) view;
            if (frameLayout.getChildCount() > 0) {
                view2 = frameLayout.getChildAt(0);
                hv4Var = vqaVar.X1;
                if (hv4Var != null && view2 == hv4Var.T1 && (hpaVar3 = hv4Var.Z1) != null) {
                    hpaVar3.invalidate();
                }
                if (view2 == vqaVar.T1 && (hpaVar2 = vqaVar.Z1) != null) {
                    hpaVar2.invalidate();
                }
                hv4Var2 = vqaVar.Y1;
                if (hv4Var2 == null && view2 == hv4Var2.T1 && (hpaVar = hv4Var2.Z1) != null) {
                    hpaVar.invalidate();
                    return;
                }
                return;
            }
        }
        view2 = null;
        hv4Var = vqaVar.X1;
        if (hv4Var != null) {
            hpaVar3.invalidate();
        }
        if (view2 == vqaVar.T1) {
            hpaVar2.invalidate();
        }
        hv4Var2 = vqaVar.Y1;
        if (hv4Var2 == null) {
        }
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [boolean] */
    @Override // wec
    public final void G() {
        super.G();
        int i = this.b;
        vqa vqaVar = this.W;
        if (i != vqaVar.B1(false)) {
            gl.d3(new k08((byte) 19, (Object) this, this.b > vqaVar.B1(false)));
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        canvas.save();
        vqa vqaVar = this.W;
        canvas.clipRect(vqaVar.u0, -getHeight(), getWidth() - vqaVar.u0, getHeight() << 1);
        super.dispatchDraw(canvas);
        canvas.restore();
    }

    @Override // wec
    public final boolean g(MotionEvent motionEvent) {
        xpa xpaVar = this.W.W2;
        return xpaVar == null || xpaVar.c(0);
    }

    @Override // wec
    public final float getAvailableTranslationX() {
        return Math.max(1, getMeasuredWidth() - (this.W.u0 << 1));
    }
}
