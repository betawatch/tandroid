package fi;

import android.content.Context;
import android.graphics.Bitmap;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes4.dex */
public final class u5 extends rg.c1 {
    public final /* synthetic */ ta E;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u5(ta taVar, Context context, rg.q0 q0Var, Bitmap bitmap, Bitmap bitmap2, org.telegram.ui.Components.la laVar) {
        super(context, q0Var, bitmap, bitmap2, laVar);
        this.E = taVar;
    }

    @Override // rg.c1
    public final void g(rg.m mVar) {
        int indexOf = rg.m.a.indexOf(mVar);
        int i10 = indexOf + 1;
        if (i10 <= 1) {
            indexOf = i10;
        }
        ta taVar = this.E;
        taVar.Z0.b(indexOf);
        taVar.i(mVar);
    }
}
