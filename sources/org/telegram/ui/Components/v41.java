package org.telegram.ui.Components;

import android.text.style.ClickableSpan;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
/* loaded from: classes3.dex */
public final /* synthetic */ class v41 implements Utilities.Callback2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ d51 b;

    public /* synthetic */ v41(d51 d51Var, int i10) {
        this.a = i10;
        this.b = d51Var;
    }

    @Override // org.telegram.messenger.Utilities.Callback2
    public final void run(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                ArrayList arrayList = (ArrayList) obj;
                t61 t61Var = (t61) obj2;
                final d51 d51Var = this.b;
                String[] strArr = d51Var.i0;
                arrayList.add(g61.B(null));
                t61Var.E = 1;
                t61Var.U();
                String str = d51Var.e0;
                arrayList.add(x41.b(3, "", str != null ? s41.A(s41.E(str, null, null)) : LocaleController.getString(R.string.AIEditorOriginalText), null, null));
                arrayList.add(b51.a(4, d51Var.a0, d51Var.k0, new ca(28, d51Var, t61Var), new w90() { // from class: org.telegram.ui.Components.w41
                    @Override // org.telegram.ui.Components.w90
                    public final void a(ClickableSpan clickableSpan) {
                        d51.R(d51.this, clickableSpan);
                    }
                }, null));
                StringBuilder sb2 = new StringBuilder();
                sb2.append(s41.E(d51Var.f0, null, null));
                sb2.append((d51Var.g0 == 1 || strArr == null) ? "" : a1.g.s(new StringBuilder(" ("), strArr[d51Var.g0], ")"));
                arrayList.add(x41.b(5, "", s41.A(sb2.toString()), null, new u41(d51Var, 4)));
                arrayList.add(b51.a(6, d51Var.c0, false, null, new w90() { // from class: org.telegram.ui.Components.w41
                    @Override // org.telegram.ui.Components.w90
                    public final void a(ClickableSpan clickableSpan) {
                        d51.R(d51.this, clickableSpan);
                    }
                }, null));
                t61Var.T();
                arrayList.add(g61.B(null));
                t61Var.U();
                arrayList.add(g61.c(1, R.drawable.msg_copy, LocaleController.getString(R.string.TranslateCopy)));
                t61Var.T();
                break;
            default:
                d51.S(this.b, (TLRPC.TL_messages_translateResult) obj, (TLRPC.TL_error) obj2);
                break;
        }
    }
}
