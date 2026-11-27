// default package

import android.content.Context;
import android.view.View;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
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
