package n6;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes.dex */
public class i extends androidx.fragment.app.o {
    public Dialog A0;
    public DialogInterface.OnCancelListener B0;
    public AlertDialog C0;

    @Override // androidx.fragment.app.o
    public final Dialog O() {
        Dialog dialog = this.A0;
        if (dialog != null) {
            return dialog;
        }
        this.r0 = false;
        if (this.C0 == null) {
            Context n10 = n();
            q6.m.g(n10);
            this.C0 = new AlertDialog.Builder(n10).create();
        }
        return this.C0;
    }

    @Override // androidx.fragment.app.o, android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        DialogInterface.OnCancelListener onCancelListener = this.B0;
        if (onCancelListener != null) {
            onCancelListener.onCancel(dialogInterface);
        }
    }
}
