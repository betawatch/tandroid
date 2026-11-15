package org.telegram.ui.Wallet;

import android.content.DialogInterface;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.nb1;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes4.dex */
public final /* synthetic */ class j2 implements DialogInterface.OnDismissListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ j2(Object obj, int i7) {
        this.a = i7;
        this.b = obj;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.a) {
            case 0:
                r2 r2Var = (r2) this.b;
                if (!r2Var.e) {
                    r2Var.e = true;
                    nb1 nb1Var = r2Var.h;
                    if (nb1Var != null) {
                        nb1Var.run();
                    }
                    if (!r2Var.f) {
                        r2Var.f = true;
                        r2Var.b.c();
                        break;
                    }
                }
                break;
            case 1:
                TLRPC.User user = (TLRPC.User) this.b;
                org.telegram.ui.ActionBar.e2 T = LaunchActivity.T();
                if (T != null) {
                    T.presentFragment(new p9(user));
                    break;
                }
                break;
            default:
                p9 p9Var = (p9) this.b;
                EditTextBoldCursor editTextBoldCursor = p9Var.I;
                if (editTextBoldCursor != null) {
                    editTextBoldCursor.requestFocus();
                    org.telegram.messenger.g0.J3(p9Var.I);
                    break;
                }
                break;
        }
    }
}
