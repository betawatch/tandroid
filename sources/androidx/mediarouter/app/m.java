package androidx.mediarouter.app;

import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.Transformation;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class m extends Animation {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ View d;

    public /* synthetic */ m(View view, int i3, int i10, int i11) {
        this.a = i11;
        this.b = i3;
        this.c = i10;
        this.d = view;
    }

    @Override // android.view.animation.Animation
    public final void applyTransformation(float f10, Transformation transformation) {
        int i3 = this.a;
        View view = this.d;
        int i10 = this.c;
        int i11 = this.b;
        switch (i3) {
            case 0:
                t.o(i11 - ((int) ((i11 - i10) * f10)), view);
                break;
            default:
                int i12 = i10 + ((int) ((i11 - i10) * f10));
                int i13 = o0.k0;
                ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                layoutParams.height = i12;
                view.setLayoutParams(layoutParams);
                break;
        }
    }
}
