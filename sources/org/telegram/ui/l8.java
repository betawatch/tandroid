package org.telegram.ui;

import android.view.View;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class l8 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ j9 b;

    public /* synthetic */ l8(j9 j9Var, int i7) {
        this.a = i7;
        this.b = j9Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                Long l10 = (Long) view.getTag();
                j9 j9Var = this.b;
                org.telegram.messenger.t3 i12 = j9Var.getMessagesController().i1(l10.longValue(), false, null);
                TLRPC.Chat O0 = j9Var.getMessagesController().O0(l10);
                j9Var.M = O0;
                if (i12 == null) {
                    j9Var.N = l10;
                    j9Var.getMessagesController().b3(0, l10.longValue(), true);
                    break;
                } else {
                    org.telegram.ui.Components.voip.b2.l(O0, null, false, null, j9Var.getParentActivity(), j9Var, j9Var.getAccountInstance());
                    break;
                }
            default:
                j9 j9Var2 = this.b;
                j9Var2.getClass();
                j9.l0(j9Var2);
                break;
        }
    }
}
