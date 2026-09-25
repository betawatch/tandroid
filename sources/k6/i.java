package k6;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import androidx.fragment.app.p;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
/* loaded from: classes.dex */
public class i extends p {
    public Dialog A0;
    public DialogInterface.OnCancelListener B0;
    public AlertDialog C0;

    @Override // androidx.fragment.app.p
    public final Dialog O() {
        Dialog dialog = this.A0;
        if (dialog != null) {
            return dialog;
        }
        this.r0 = false;
        if (this.C0 == null) {
            Context n10 = n();
            n6.l.h(n10);
            this.C0 = new AlertDialog.Builder(n10).create();
        }
        return this.C0;
    }

    @Override // androidx.fragment.app.p, android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        DialogInterface.OnCancelListener onCancelListener = this.B0;
        if (onCancelListener != null) {
            onCancelListener.onCancel(dialogInterface);
        }
    }
}
