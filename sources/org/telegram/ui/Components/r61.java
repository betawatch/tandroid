package org.telegram.ui.Components;

import android.content.Context;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class r61 extends j3.l {
    public final /* synthetic */ x61 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r61(Context context, x61 x61Var) {
        super(context);
        this.d = x61Var;
    }

    @Override // j3.l
    public final l3.k0 a(Context context) {
        androidx.biometric.e eVar = new androidx.biometric.e(29);
        l3.g a2 = l3.g.a(context);
        a2.getClass();
        eVar.b = a2;
        eVar.c = new l3.g0(new l3.j[]{new l3.u0(new w61(this.d))});
        return eVar.c();
    }
}
