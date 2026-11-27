// default package

import android.content.Context;
import android.view.View;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes3.dex */
public final class ocb extends ld6 {
    public final /* synthetic */ pcb R;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ocb(pcb pcbVar, Context context, float f) {
        super(context, f);
        this.R = pcbVar;
    }

    @Override // android.view.View
    public final void invalidate() {
        View view = this.R.c;
        if (view != null) {
            view.invalidate();
        }
    }
}
