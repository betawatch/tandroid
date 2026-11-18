package androidx.fragment.app;

import android.app.Dialog;
import android.content.DialogInterface;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes.dex */
public final class n implements DialogInterface.OnDismissListener {
    public final /* synthetic */ p a;

    public n(p pVar) {
        this.a = pVar;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        p pVar = this.a;
        Dialog dialog = pVar.w0;
        if (dialog != null) {
            pVar.onDismiss(dialog);
        }
    }
}
