package androidx.fragment.app;

import android.app.Dialog;
import android.content.DialogInterface;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
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
