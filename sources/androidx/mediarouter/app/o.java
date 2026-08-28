package androidx.mediarouter.app;

import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.Transformation;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class o extends Animation {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ View d;

    public /* synthetic */ o(View view, int i9, int i10, int i11) {
        this.a = i11;
        this.b = i9;
        this.c = i10;
        this.d = view;
    }

    @Override // android.view.animation.Animation
    public final void applyTransformation(float f10, Transformation transformation) {
        int i9 = this.a;
        View view = this.d;
        int i10 = this.c;
        int i11 = this.b;
        switch (i9) {
            case 0:
                v.o(i11 - ((int) ((i11 - i10) * f10)), view);
                break;
            default:
                int i12 = i10 + ((int) ((i11 - i10) * f10));
                int i13 = p0.f0;
                ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                layoutParams.height = i12;
                view.setLayoutParams(layoutParams);
                break;
        }
    }
}
