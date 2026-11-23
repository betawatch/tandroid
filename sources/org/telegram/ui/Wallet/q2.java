package org.telegram.ui.Wallet;

import android.content.DialogInterface;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.jw0;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes4.dex */
public final /* synthetic */ class q2 implements DialogInterface.OnDismissListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ q2(Object obj, int i7) {
        this.a = i7;
        this.b = obj;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.a) {
            case 0:
                y2 y2Var = (y2) this.b;
                if (!y2Var.e) {
                    y2Var.e = true;
                    jw0 jw0Var = y2Var.h;
                    if (jw0Var != null) {
                        jw0Var.run();
                    }
                    if (!y2Var.f) {
                        y2Var.f = true;
                        y2Var.b.c();
                        break;
                    }
                }
                break;
            case 1:
                TLRPC.User user = (TLRPC.User) this.b;
                org.telegram.ui.ActionBar.g2 T = LaunchActivity.T();
                if (T != null) {
                    T.presentFragment(new da(user));
                    break;
                }
                break;
            default:
                da daVar = (da) this.b;
                EditTextBoldCursor editTextBoldCursor = daVar.I;
                if (editTextBoldCursor != null) {
                    editTextBoldCursor.requestFocus();
                    org.telegram.messenger.g0.I3(daVar.I);
                    break;
                }
                break;
        }
    }
}
