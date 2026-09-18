package org.telegram.ui.Components;

import android.text.style.ClickableSpan;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-33b1d79182603e8304c32e909c352797304d7e7816a08740f96af6cffe97caab */
/* loaded from: classes3.dex */
public final /* synthetic */ class n41 implements Utilities.Callback2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ v41 b;

    public /* synthetic */ n41(v41 v41Var, int i10) {
        this.a = i10;
        this.b = v41Var;
    }

    @Override // org.telegram.messenger.Utilities.Callback2
    public final void run(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                ArrayList arrayList = (ArrayList) obj;
                l61 l61Var = (l61) obj2;
                final v41 v41Var = this.b;
                String[] strArr = v41Var.i0;
                arrayList.add(x51.B(null));
                l61Var.E = 1;
                l61Var.U();
                String str = v41Var.e0;
                arrayList.add(p41.b(3, "", str != null ? k41.y(k41.E(str, null, null)) : LocaleController.getString(R.string.AIEditorOriginalText), null, null));
                arrayList.add(t41.a(4, v41Var.a0, v41Var.k0, new dt(18, v41Var, l61Var), new k90() { // from class: org.telegram.ui.Components.o41
                    @Override // org.telegram.ui.Components.k90
                    public final void a(ClickableSpan clickableSpan) {
                        v41.Q(v41.this, clickableSpan);
                    }
                }, null));
                StringBuilder sb2 = new StringBuilder();
                sb2.append(k41.E(v41Var.f0, null, null));
                sb2.append((v41Var.g0 == 1 || strArr == null) ? "" : a4.a.s(new StringBuilder(" ("), strArr[v41Var.g0], ")"));
                arrayList.add(p41.b(5, "", k41.y(sb2.toString()), null, new m41(v41Var, 4)));
                arrayList.add(t41.a(6, v41Var.c0, false, null, new k90() { // from class: org.telegram.ui.Components.o41
                    @Override // org.telegram.ui.Components.k90
                    public final void a(ClickableSpan clickableSpan) {
                        v41.Q(v41.this, clickableSpan);
                    }
                }, null));
                l61Var.T();
                arrayList.add(x51.B(null));
                l61Var.U();
                arrayList.add(x51.c(1, R.drawable.msg_copy, LocaleController.getString(R.string.TranslateCopy)));
                l61Var.T();
                break;
            default:
                v41.R(this.b, (TLRPC.TL_messages_translateResult) obj, (TLRPC.TL_error) obj2);
                break;
        }
    }
}
