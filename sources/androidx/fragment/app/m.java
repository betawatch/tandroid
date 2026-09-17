package androidx.fragment.app;

import android.app.Dialog;
import android.content.DialogInterface;

/* compiled from: r8-map-id-e83daa4a3f4c5cc77b567d3f921056f729108399460aa18047e0e51e076a97b3 */
/* loaded from: classes.dex */
public final class m implements DialogInterface.OnDismissListener {
    public final /* synthetic */ o a;

    public m(o oVar) {
        this.a = oVar;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        o oVar = this.a;
        Dialog dialog = oVar.v0;
        if (dialog != null) {
            oVar.onDismiss(dialog);
        }
    }
}
