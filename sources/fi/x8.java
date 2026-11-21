package fi;

import android.content.Context;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes4.dex */
public final class x8 extends x {
    public final /* synthetic */ f9 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x8(Context context, f9 f9Var) {
        super(context);
        this.a = f9Var;
    }

    @Override // fi.x, android.view.View
    public final void invalidate() {
        super.invalidate();
        y3 y3Var = this.a.G0;
        if (y3Var != null) {
            y3Var.b();
        }
    }
}
