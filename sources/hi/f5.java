package hi;

import android.content.Context;
import android.graphics.Bitmap;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes4.dex */
public final class f5 extends sg.u0 {
    public final /* synthetic */ v9 F;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f5(v9 v9Var, Context context, sg.i0 i0Var, Bitmap bitmap, Bitmap bitmap2, org.telegram.ui.Components.ca caVar) {
        super(context, i0Var, bitmap, bitmap2, caVar);
        this.F = v9Var;
    }

    @Override // sg.u0
    public final void g(sg.h hVar) {
        int indexOf = sg.h.a.indexOf(hVar);
        int i7 = indexOf + 1;
        if (i7 <= 1) {
            indexOf = i7;
        }
        v9 v9Var = this.F;
        v9Var.U0.b(indexOf);
        v9Var.w(hVar);
    }
}
