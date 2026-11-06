package org.telegram.ui.Wallet;

import android.content.DialogInterface;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes4.dex */
public final /* synthetic */ class m2 implements DialogInterface.OnDismissListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ m2(Object obj, int i7) {
        this.a = i7;
        this.b = obj;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.a) {
            case 0:
                u2 u2Var = (u2) this.b;
                if (!u2Var.e) {
                    u2Var.e = true;
                    h2 h2Var = u2Var.h;
                    if (h2Var != null) {
                        h2Var.run();
                    }
                    if (!u2Var.f) {
                        u2Var.f = true;
                        u2Var.b.c();
                        break;
                    }
                }
                break;
            case 1:
                TLRPC.User user = (TLRPC.User) this.b;
                org.telegram.ui.ActionBar.f2 T = LaunchActivity.T();
                if (T != null) {
                    T.presentFragment(new n9(user));
                    break;
                }
                break;
            default:
                n9 n9Var = (n9) this.b;
                EditTextBoldCursor editTextBoldCursor = n9Var.H;
                if (editTextBoldCursor != null) {
                    editTextBoldCursor.requestFocus();
                    org.telegram.messenger.g0.K3(n9Var.H);
                    break;
                }
                break;
        }
    }
}
