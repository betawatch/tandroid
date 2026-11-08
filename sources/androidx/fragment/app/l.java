package androidx.fragment.app;

import android.app.Dialog;
import android.content.DialogInterface;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes.dex */
public final class l implements DialogInterface.OnCancelListener {
    public final /* synthetic */ o a;

    public l(o oVar) {
        this.a = oVar;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        o oVar = this.a;
        Dialog dialog = oVar.v0;
        if (dialog != null) {
            oVar.onCancel(dialog);
        }
    }
}
