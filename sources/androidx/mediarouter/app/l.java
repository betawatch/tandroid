package androidx.mediarouter.app;

import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.Transformation;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final class l extends Animation {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ View d;

    public /* synthetic */ l(View view, int i10, int i11, int i12) {
        this.a = i12;
        this.b = i10;
        this.c = i11;
        this.d = view;
    }

    @Override // android.view.animation.Animation
    public final void applyTransformation(float f9, Transformation transformation) {
        int i10 = this.a;
        View view = this.d;
        int i11 = this.c;
        int i12 = this.b;
        switch (i10) {
            case 0:
                s.o(i12 - ((int) ((i12 - i11) * f9)), view);
                break;
            default:
                int i13 = i11 + ((int) ((i12 - i11) * f9));
                int i14 = m0.f0;
                ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                layoutParams.height = i13;
                view.setLayoutParams(layoutParams);
                break;
        }
    }
}
