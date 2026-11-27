// default package

import android.content.Context;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final class lic extends uic {
    public final /* synthetic */ vic u0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lic(vic vicVar, Context context, boolean z, int i, vnb vnbVar) {
        super(i, vnbVar, context, z);
        this.u0 = vicVar;
    }

    @Override // uic
    public final void f(float f, int i, int i2) {
        super.f(f, i, i2);
        this.u0.A(f <= 0.5f ? i : i2, i < i2);
    }
}
