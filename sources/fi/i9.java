package fi;

import android.content.Context;
import android.view.View;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes4.dex */
public final class i9 extends tg.n0 {
    public final /* synthetic */ j9 R;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i9(j9 j9Var, Context context, float f10) {
        super(context, f10);
        this.R = j9Var;
    }

    @Override // android.view.View
    public final void invalidate() {
        View view = this.R.c;
        if (view != null) {
            view.invalidate();
        }
    }
}
