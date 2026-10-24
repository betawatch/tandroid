package androidx.mediarouter.app;

import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.Transformation;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes.dex */
public final class m extends Animation {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ View d;

    public /* synthetic */ m(View view, int i10, int i11, int i12) {
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
                t.o(i12 - ((int) ((i12 - i11) * f7)), view);
                break;
            default:
                int i13 = i11 + ((int) ((i12 - i11) * f7));
                int i14 = n0.j0;
                ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                layoutParams.height = i13;
                view.setLayoutParams(layoutParams);
                break;
        }
    }
}
