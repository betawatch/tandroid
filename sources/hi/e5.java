package hi;

import android.content.Context;
import android.graphics.Bitmap;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes4.dex */
public final class e5 extends sg.u0 {
    public final /* synthetic */ u9 F;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e5(u9 u9Var, Context context, sg.i0 i0Var, Bitmap bitmap, Bitmap bitmap2, org.telegram.ui.Components.ca caVar) {
        super(context, i0Var, bitmap, bitmap2, caVar);
        this.F = u9Var;
    }

    @Override // sg.u0
    public final void g(sg.h hVar) {
        int indexOf = sg.h.a.indexOf(hVar);
        int i7 = indexOf + 1;
        if (i7 <= 1) {
            indexOf = i7;
        }
        u9 u9Var = this.F;
        u9Var.U0.b(indexOf);
        u9Var.w(hVar);
    }
}
