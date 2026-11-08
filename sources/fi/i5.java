package fi;

import android.content.Context;
import android.graphics.Bitmap;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes3.dex */
public final class i5 extends sg.w0 {
    public final /* synthetic */ x9 E;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i5(x9 x9Var, Context context, sg.j0 j0Var, Bitmap bitmap, Bitmap bitmap2, org.telegram.ui.Components.y9 y9Var) {
        super(context, j0Var, bitmap, bitmap2, y9Var);
        this.E = x9Var;
    }

    @Override // sg.w0
    public final void g(sg.h hVar) {
        int indexOf = sg.h.a.indexOf(hVar);
        int i7 = indexOf + 1;
        if (i7 <= 1) {
            indexOf = i7;
        }
        x9 x9Var = this.E;
        x9Var.T0.b(indexOf);
        x9Var.w(hVar);
    }
}
