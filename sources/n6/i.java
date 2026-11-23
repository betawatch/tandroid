package n6;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import androidx.fragment.app.p;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
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
            Context n10 = n();
            q6.m.h(n10);
            this.D0 = new AlertDialog.Builder(n10).create();
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
