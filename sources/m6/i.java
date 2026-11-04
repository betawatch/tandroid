package m6;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import androidx.fragment.app.p;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public class i extends p {
    public Dialog B0;
    public DialogInterface.OnCancelListener C0;
    public AlertDialog D0;

    @Override // androidx.fragment.app.p
    public final Dialog O() {
        Dialog dialog = this.B0;
        if (dialog != null) {
            return dialog;
        }
        this.s0 = false;
        if (this.D0 == null) {
            Context n4 = n();
            p6.m.g(n4);
            this.D0 = new AlertDialog.Builder(n4).create();
        }
        return this.D0;
    }

    @Override // androidx.fragment.app.p, android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        DialogInterface.OnCancelListener onCancelListener = this.C0;
        if (onCancelListener != null) {
            onCancelListener.onCancel(dialogInterface);
        }
    }
}
