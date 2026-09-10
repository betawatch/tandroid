package androidx.mediarouter.app;

import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.Transformation;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes.dex */
public final class n extends Animation {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ View d;

    public /* synthetic */ n(View view, int i10, int i11, int i12) {
        this.a = i12;
        this.b = i10;
        this.c = i11;
        this.d = view;
    }

    @Override // android.view.animation.Animation
    public final void applyTransformation(float f7, Transformation transformation) {
        int i10 = this.a;
        View view = this.d;
        int i11 = this.c;
        int i12 = this.b;
        switch (i10) {
            case 0:
                u.o(i12 - ((int) ((i12 - i11) * f7)), view);
                break;
            default:
                int i13 = i11 + ((int) ((i12 - i11) * f7));
                int i14 = o0.j0;
                ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                layoutParams.height = i13;
                view.setLayoutParams(layoutParams);
                break;
        }
    }
}
