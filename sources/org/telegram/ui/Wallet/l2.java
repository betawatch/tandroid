package org.telegram.ui.Wallet;

import android.content.DialogInterface;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.qq;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class l2 implements DialogInterface.OnDismissListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ l2(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.a) {
            case 0:
                t2 t2Var = (t2) this.b;
                if (!t2Var.e) {
                    t2Var.e = true;
                    qq qqVar = t2Var.h;
                    if (qqVar != null) {
                        qqVar.run();
                    }
                    if (!t2Var.f) {
                        t2Var.f = true;
                        t2Var.b.c();
                        break;
                    }
                }
                break;
            case 1:
                TLRPC.User user = (TLRPC.User) this.b;
                org.telegram.ui.ActionBar.k2 T = LaunchActivity.T();
                if (T != null) {
                    T.presentFragment(new r9(user));
                    break;
                }
                break;
            default:
                r9 r9Var = (r9) this.b;
                EditTextBoldCursor editTextBoldCursor = r9Var.H;
                if (editTextBoldCursor != null) {
                    editTextBoldCursor.requestFocus();
                    org.telegram.messenger.i0.J3(r9Var.H);
                    break;
                }
                break;
        }
    }
}
