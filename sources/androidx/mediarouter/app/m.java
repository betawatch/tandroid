package androidx.mediarouter.app;

import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.Transformation;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes.dex */
public final class m extends Animation {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ View d;

    public /* synthetic */ m(View view, int i7, int i10, int i11) {
        this.a = i11;
        this.b = i7;
        this.c = i10;
        this.d = view;
    }

    @Override // android.view.animation.Animation
    public final void applyTransformation(float f10, Transformation transformation) {
        int i7 = this.a;
        View view = this.d;
        int i10 = this.c;
        int i11 = this.b;
        switch (i7) {
            case 0:
                t.o(i11 - ((int) ((i11 - i10) * f10)), view);
                break;
            default:
                int i12 = i10 + ((int) ((i11 - i10) * f10));
                int i13 = n0.j0;
                ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                layoutParams.height = i12;
                view.setLayoutParams(layoutParams);
                break;
        }
    }
}
