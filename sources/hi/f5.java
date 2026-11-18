package hi;

import android.content.Context;
import android.graphics.Bitmap;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
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
