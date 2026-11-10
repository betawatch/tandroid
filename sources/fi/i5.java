package fi;

import android.content.Context;
import android.graphics.Bitmap;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class i5 extends sg.v0 {
    public final /* synthetic */ x9 E;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i5(x9 x9Var, Context context, sg.j0 j0Var, Bitmap bitmap, Bitmap bitmap2, org.telegram.ui.Components.x9 x9Var2) {
        super(context, j0Var, bitmap, bitmap2, x9Var2);
        this.E = x9Var;
    }

    @Override // sg.v0
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
