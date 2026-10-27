package fi;

import android.content.Context;
import android.graphics.Bitmap;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
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
