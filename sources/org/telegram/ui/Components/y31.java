package org.telegram.ui.Components;

import android.text.style.ClickableSpan;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public final /* synthetic */ class y31 implements Utilities.Callback2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ g41 b;

    public /* synthetic */ y31(g41 g41Var, int i10) {
        this.a = i10;
        this.b = g41Var;
    }

    @Override // org.telegram.messenger.Utilities.Callback2
    public final void run(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                ArrayList arrayList = (ArrayList) obj;
                w51 w51Var = (w51) obj2;
                final g41 g41Var = this.b;
                String[] strArr = g41Var.i0;
                arrayList.add(i51.B(null));
                w51Var.E = 1;
                w51Var.U();
                String str = g41Var.e0;
                arrayList.add(a41.b(3, "", str != null ? v31.y(v31.E(str, null, null)) : LocaleController.getString(R.string.AIEditorOriginalText), null, null));
                arrayList.add(e41.a(4, g41Var.a0, g41Var.k0, new dt(18, g41Var, w51Var), new b90() { // from class: org.telegram.ui.Components.z31
                    @Override // org.telegram.ui.Components.b90
                    public final void a(ClickableSpan clickableSpan) {
                        g41.Q(g41.this, clickableSpan);
                    }
                }, null));
                StringBuilder sb2 = new StringBuilder();
                sb2.append(v31.E(g41Var.f0, null, null));
                sb2.append((g41Var.g0 == 1 || strArr == null) ? "" : a4.a.t(new StringBuilder(" ("), strArr[g41Var.g0], ")"));
                arrayList.add(a41.b(5, "", v31.y(sb2.toString()), null, new x31(g41Var, 4)));
                arrayList.add(e41.a(6, g41Var.c0, false, null, new b90() { // from class: org.telegram.ui.Components.z31
                    @Override // org.telegram.ui.Components.b90
                    public final void a(ClickableSpan clickableSpan) {
                        g41.Q(g41.this, clickableSpan);
                    }
                }, null));
                w51Var.T();
                arrayList.add(i51.B(null));
                w51Var.U();
                arrayList.add(i51.c(1, R.drawable.msg_copy, LocaleController.getString(R.string.TranslateCopy)));
                w51Var.T();
                break;
            default:
                g41.R(this.b, (TLRPC.TL_messages_translateResult) obj, (TLRPC.TL_error) obj2);
                break;
        }
    }
}
