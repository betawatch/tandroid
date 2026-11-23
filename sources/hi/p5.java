package hi;

import android.content.Context;
import android.graphics.Bitmap;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes4.dex */
public final class p5 extends sg.t0 {
    public final /* synthetic */ pa F;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p5(pa paVar, Context context, sg.h0 h0Var, Bitmap bitmap, Bitmap bitmap2, org.telegram.ui.Components.ba baVar) {
        super(context, h0Var, bitmap, bitmap2, baVar);
        this.F = paVar;
    }

    @Override // sg.t0
    public final void g(sg.h hVar) {
        int indexOf = sg.h.a.indexOf(hVar);
        int i7 = indexOf + 1;
        if (i7 <= 1) {
            indexOf = i7;
        }
        pa paVar = this.F;
        paVar.U0.b(indexOf);
        paVar.w(hVar);
    }
}
