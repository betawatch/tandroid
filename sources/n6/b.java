package n6;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.app.DialogFragment;
import android.content.DialogInterface;
import android.os.Bundle;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes.dex */
public class b extends DialogFragment {
    public Dialog a;
    public DialogInterface.OnCancelListener b;
    public AlertDialog c;

    @Override // android.app.DialogFragment, android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        DialogInterface.OnCancelListener onCancelListener = this.b;
        if (onCancelListener != null) {
            onCancelListener.onCancel(dialogInterface);
        }
    }

    @Override // android.app.DialogFragment
    public final Dialog onCreateDialog(Bundle bundle) {
        Dialog dialog = this.a;
        if (dialog != null) {
            return dialog;
        }
        setShowsDialog(false);
        if (this.c == null) {
            Activity activity = getActivity();
            q6.m.g(activity);
            this.c = new AlertDialog.Builder(activity).create();
        }
        return this.c;
    }
}
