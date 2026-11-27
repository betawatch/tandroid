// default package

import android.content.Context;
import android.view.View;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
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
