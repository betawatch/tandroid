package org.telegram.ui.Components;

import android.content.Context;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes3.dex */
public final class hv extends q9 {
    public final /* synthetic */ kv H;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hv(kv kvVar, Context context) {
        super(context);
        this.H = kvVar;
    }

    @Override // android.view.View
    public final void invalidate() {
        if (ch.f0.b(this)) {
            return;
        }
        super.invalidate();
        this.H.f();
    }

    @Override // android.view.View
    public final void invalidate(int i7, int i10, int i11, int i12) {
        if (ch.f0.b(this)) {
            return;
        }
        super.invalidate(i7, i10, i11, i12);
    }
}
