package org.telegram.ui.Wallet;

import android.content.DialogInterface;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes4.dex */
public final /* synthetic */ class l2 implements DialogInterface.OnDismissListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ l2(Object obj, int i7) {
        this.a = i7;
        this.b = obj;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.a) {
            case 0:
                t2 t2Var = (t2) this.b;
                if (!t2Var.e) {
                    t2Var.e = true;
                    g2 g2Var = t2Var.h;
                    if (g2Var != null) {
                        g2Var.run();
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
                org.telegram.ui.ActionBar.f2 T = LaunchActivity.T();
                if (T != null) {
                    T.presentFragment(new m9(user));
                    break;
                }
                break;
            default:
                m9 m9Var = (m9) this.b;
                EditTextBoldCursor editTextBoldCursor = m9Var.H;
                if (editTextBoldCursor != null) {
                    editTextBoldCursor.requestFocus();
                    org.telegram.messenger.g0.K3(m9Var.H);
                    break;
                }
                break;
        }
    }
}
