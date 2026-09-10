package bi;

import android.content.Context;
import android.graphics.Bitmap;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes4.dex */
public final class f7 extends og.h1 {
    public final /* synthetic */ ad E;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f7(ad adVar, Context context, og.v0 v0Var, Bitmap bitmap, Bitmap bitmap2, org.telegram.ui.Components.ia iaVar) {
        super(context, v0Var, bitmap, bitmap2, iaVar);
        this.E = adVar;
    }

    @Override // og.h1
    public final void g(og.m mVar) {
        int indexOf = og.m.a.indexOf(mVar);
        int i10 = indexOf + 1;
        if (i10 <= 1) {
            indexOf = i10;
        }
        ad adVar = this.E;
        adVar.k1.b(indexOf);
        adVar.B(mVar);
    }
}
