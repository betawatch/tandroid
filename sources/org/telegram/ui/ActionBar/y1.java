package org.telegram.ui.ActionBar;

import android.app.Dialog;
import android.content.DialogInterface;
import org.telegram.messenger.x10;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes3.dex */
public final /* synthetic */ class y1 implements DialogInterface.OnDismissListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ y1(int i7, Object obj, Object obj2) {
        this.a = i7;
        this.b = obj;
        this.c = obj2;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        Runnable runnable;
        switch (this.a) {
            case 0:
                g2 g2Var = (g2) this.b;
                DialogInterface.OnDismissListener onDismissListener = (DialogInterface.OnDismissListener) this.c;
                g2Var.getClass();
                if (onDismissListener != null) {
                    onDismissListener.onDismiss(dialogInterface);
                }
                g2Var.onDialogDismiss((Dialog) dialogInterface);
                if (dialogInterface == g2Var.visibleDialog) {
                    g2Var.visibleDialog = null;
                    break;
                }
                break;
            case 1:
                g2 g2Var2 = (g2) this.b;
                e2 e2Var = (e2) this.c;
                g2Var2.onPause();
                g2Var2.onFragmentDestroy();
                if (e2Var != null && (runnable = e2Var.b) != null) {
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
