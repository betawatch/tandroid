package ei;

import android.content.Context;
import android.view.View;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class u9 extends ug.l0 {
    public final /* synthetic */ v9 R;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u9(v9 v9Var, Context context, float f10) {
        super(context, f10);
        this.R = v9Var;
    }

    @Override // android.view.View
    public final void invalidate() {
        View view = this.R.c;
        if (view != null) {
            view.invalidate();
        }
    }
}
