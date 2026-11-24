// default package

import android.content.Context;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
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
