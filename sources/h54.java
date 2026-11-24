// default package

import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.app.DialogFragment;
import android.content.DialogInterface;
import android.os.Bundle;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public class h54 extends DialogFragment {
    public AlertDialog a;
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
        AlertDialog alertDialog = this.a;
        if (alertDialog != null) {
            return alertDialog;
        }
        setShowsDialog(false);
        AlertDialog alertDialog2 = this.c;
        if (alertDialog2 != null) {
            return alertDialog2;
        }
        Activity activity = getActivity();
        ite.h(activity);
        AlertDialog create = new AlertDialog.Builder(activity).create();
        this.c = create;
        return create;
    }
}
