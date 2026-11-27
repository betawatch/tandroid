// default package

import android.content.Context;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
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
