package org.telegram.ui.ActionBar;

import android.app.Dialog;
import android.content.DialogInterface;
import org.telegram.messenger.x10;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class z1 implements DialogInterface.OnDismissListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ z1(int i7, Object obj, Object obj2) {
        this.a = i7;
        this.b = obj;
        this.c = obj2;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        Runnable runnable;
        switch (this.a) {
            case 0:
                h2 h2Var = (h2) this.b;
                DialogInterface.OnDismissListener onDismissListener = (DialogInterface.OnDismissListener) this.c;
                h2Var.getClass();
                if (onDismissListener != null) {
                    onDismissListener.onDismiss(dialogInterface);
                }
                h2Var.onDialogDismiss((Dialog) dialogInterface);
                if (dialogInterface == h2Var.visibleDialog) {
                    h2Var.visibleDialog = null;
                    break;
                }
                break;
            case 1:
                h2 h2Var2 = (h2) this.b;
                f2 f2Var = (f2) this.c;
                h2Var2.onPause();
                h2Var2.onFragmentDestroy();
                if (f2Var != null && (runnable = f2Var.b) != null) {
                    runnable.run();
                    break;
                }
                break;
            default:
                boolean[] zArr = (boolean[]) this.b;
                x10 x10Var = (x10) this.c;
                if (!zArr[0]) {
                    x10Var.a(Boolean.FALSE);
                    zArr[0] = true;
                    break;
                }
                break;
        }
    }
}
