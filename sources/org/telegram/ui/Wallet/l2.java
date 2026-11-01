package org.telegram.ui.Wallet;

import android.content.DialogInterface;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.qq;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
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
                u2 u2Var = (u2) this.b;
                if (!u2Var.e) {
                    u2Var.e = true;
                    qq qqVar = u2Var.h;
                    if (qqVar != null) {
                        qqVar.run();
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
