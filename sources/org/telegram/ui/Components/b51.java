package org.telegram.ui.Components;

import android.text.style.ClickableSpan;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes3.dex */
public final /* synthetic */ class b51 implements Utilities.Callback2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ k51 b;

    public /* synthetic */ b51(k51 k51Var, int i10) {
        this.a = i10;
        this.b = k51Var;
    }

    @Override // org.telegram.messenger.Utilities.Callback2
    public final void run(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                ArrayList arrayList = (ArrayList) obj;
                b71 b71Var = (b71) obj2;
                final k51 k51Var = this.b;
                String[] strArr = k51Var.i0;
                arrayList.add(m61.B(null));
                b71Var.F = 1;
                b71Var.U();
                String str = k51Var.e0;
                arrayList.add(e51.b(3, "", str != null ? y41.J(y41.N(str, null, null)) : LocaleController.getString(R.string.AIEditorOriginalText), null, null));
                arrayList.add(i51.a(4, k51Var.a0, k51Var.k0, new ca(29, k51Var, b71Var), new x90() { // from class: org.telegram.ui.Components.c51
                    @Override // org.telegram.ui.Components.x90
                    public final void a(ClickableSpan clickableSpan) {
                        k51.Q(k51.this, clickableSpan);
                    }
                }, null));
                StringBuilder sb2 = new StringBuilder();
                sb2.append(y41.N(k51Var.f0, null, null));
                sb2.append((k51Var.g0 == 1 || strArr == null) ? "" : a1.g.s(new StringBuilder(" ("), strArr[k51Var.g0], ")"));
                arrayList.add(e51.b(5, "", y41.J(sb2.toString()), null, new a51(k51Var, 4)));
                arrayList.add(i51.a(6, k51Var.c0, false, null, new x90() { // from class: org.telegram.ui.Components.c51
                    @Override // org.telegram.ui.Components.x90
                    public final void a(ClickableSpan clickableSpan) {
                        k51.Q(k51.this, clickableSpan);
                    }
                }, null));
                b71Var.T();
                arrayList.add(m61.B(null));
                b71Var.U();
                arrayList.add(m61.c(1, R.drawable.msg_copy, LocaleController.getString(R.string.TranslateCopy)));
                b71Var.T();
                break;
            default:
                k51.R(this.b, (TLRPC.TL_messages_translateResult) obj, (TLRPC.TL_error) obj2);
                break;
        }
    }
}
