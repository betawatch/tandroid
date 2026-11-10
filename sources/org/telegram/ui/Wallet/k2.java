package org.telegram.ui.Wallet;

import android.content.DialogInterface;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes4.dex */
public final /* synthetic */ class k2 implements DialogInterface.OnDismissListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ k2(Object obj, int i7) {
        this.a = i7;
        this.b = obj;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.a) {
            case 0:
                s2 s2Var = (s2) this.b;
                if (!s2Var.e) {
                    s2Var.e = true;
                    f2 f2Var = s2Var.h;
                    if (f2Var != null) {
                        f2Var.run();
                    }
                    if (!s2Var.f) {
                        s2Var.f = true;
                        s2Var.b.c();
                        break;
                    }
                }
                break;
            case 1:
                TLRPC.User user = (TLRPC.User) this.b;
                org.telegram.ui.ActionBar.f2 T = LaunchActivity.T();
                if (T != null) {
                    T.presentFragment(new o9(user));
                    break;
                }
                break;
            default:
                o9 o9Var = (o9) this.b;
                EditTextBoldCursor editTextBoldCursor = o9Var.H;
                if (editTextBoldCursor != null) {
                    editTextBoldCursor.requestFocus();
                    org.telegram.messenger.g0.K3(o9Var.H);
                    break;
                }
                break;
        }
    }
}
