package hh;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.p71;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final class p3 extends p71 {
    public final /* synthetic */ i5 P;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p3(i5 i5Var, Context context) {
        super(context, null);
        this.P = i5Var;
    }

    @Override // org.telegram.ui.Components.p71
    public final void E(View view, float f10) {
        int i10;
        View view2;
        gh.s3 s3Var;
        gh.s3 s3Var2;
        r3 r3Var;
        r3 r3Var2;
        r3 r3Var3;
        if (getMeasuredWidth() <= 0) {
            view.setTranslationX(f10);
            return;
        }
        float clamp = Utilities.clamp(f10 / getMeasuredWidth(), 1.0f, -1.0f);
        i5 i5Var = this.P;
        i10 = ((org.telegram.ui.ActionBar.e3) i5Var).backgroundPaddingLeft;
        view.setTranslationX(((-clamp) * 2.0f * i10) + f10);
        view.setPivotX(clamp <= 0.0f ? view.getMeasuredWidth() : 0.0f);
        view.setCameraDistance(view.getMeasuredHeight() * 3.4f);
        view.setScaleX(1.0f - Math.abs(0.25f * clamp));
        view.setRotationY(clamp * 10.0f);
        if (view instanceof FrameLayout) {
            FrameLayout frameLayout = (FrameLayout) view;
            if (frameLayout.getChildCount() > 0) {
                view2 = frameLayout.getChildAt(0);
                s3Var = i5Var.X;
                if (s3Var != null && view2 == s3Var.U && (r3Var3 = s3Var.Z) != null) {
                    r3Var3.invalidate();
                }
                if (view2 == i5Var.U && (r3Var2 = i5Var.Z) != null) {
                    r3Var2.invalidate();
                }
                s3Var2 = i5Var.Y;
                if (s3Var2 == null && view2 == s3Var2.U && (r3Var = s3Var2.Z) != null) {
                    r3Var.invalidate();
                    return;
                }
                return;
            }
        }
        view2 = null;
        s3Var = i5Var.X;
        if (s3Var != null) {
            r3Var3.invalidate();
        }
        if (view2 == i5Var.U) {
            r3Var2.invalidate();
        }
        s3Var2 = i5Var.Y;
        if (s3Var2 == null) {
        }
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [boolean] */
    @Override // org.telegram.ui.Components.p71
    public final void F() {
        super.F();
        int i10 = this.b;
        i5 i5Var = this.P;
        if (i10 != i5Var.L1(false)) {
            AndroidUtilities.runOnUIThread(new fh.f(3, this, this.b > i5Var.L1(false)));
        }
    }

    @Override // org.telegram.ui.Components.p71
    public final boolean i(MotionEvent motionEvent) {
        j4 j4Var = this.P.U0;
        return j4Var == null || j4Var.c(0);
    }
}
