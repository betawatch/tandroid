// default package

import android.animation.ValueAnimator;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final /* synthetic */ class hm7 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ byte a = 0;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ FrameLayout c;
    public final /* synthetic */ Object d;

    public /* synthetic */ hm7(v94 v94Var, r47 r47Var, boolean z) {
        this.c = v94Var;
        this.d = r47Var;
        this.b = z;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        byte b = this.a;
        Object obj = this.d;
        boolean z = this.b;
        FrameLayout frameLayout = this.c;
        switch (b) {
            case 0:
                v94 v94Var = (v94) frameLayout;
                if (v94Var.getMessage() == ((r47) obj)) {
                    v94Var.o(z, ((Float) valueAnimator.getAnimatedValue()).floatValue());
                    break;
                }
                break;
            default:
                ((xd8) frameLayout).i(z, (pt2) obj, valueAnimator);
                break;
        }
    }

    public /* synthetic */ hm7(xd8 xd8Var, boolean z, pt2 pt2Var) {
        this.c = xd8Var;
        this.b = z;
        this.d = pt2Var;
    }
}
