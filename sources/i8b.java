// default package

import android.content.Context;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final class i8b extends h66 {
    public final /* synthetic */ k8b u0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i8b(k8b k8bVar, Context context, float f) {
        super(context, f);
        this.u0 = k8bVar;
    }

    @Override // android.view.View
    public final void invalidate() {
        this.u0.d.invalidate();
        super.invalidate();
    }
}
