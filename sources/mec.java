// default package

import android.content.Context;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class mec extends vec {
    public final /* synthetic */ wec u0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mec(wec wecVar, Context context, boolean z, int i, wjb wjbVar) {
        super(i, wjbVar, context, z);
        this.u0 = wecVar;
    }

    @Override // vec
    public final void f(float f, int i, int i2) {
        super.f(f, i, i2);
        this.u0.z(f <= 0.5f ? i : i2, i < i2);
    }
}
