package org.telegram.ui.Components;

import android.text.style.ClickableSpan;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-512d310aee599d224f4c0b0a2d01feec484432ddc9f55a7433fffe3405d6493d */
/* loaded from: classes3.dex */
public final /* synthetic */ class x41 implements Utilities.Callback2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ f51 b;

    public /* synthetic */ x41(f51 f51Var, int i10) {
        this.a = i10;
        this.b = f51Var;
    }

    @Override // org.telegram.messenger.Utilities.Callback2
    public final void run(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                ArrayList arrayList = (ArrayList) obj;
                w61 w61Var = (w61) obj2;
                final f51 f51Var = this.b;
                String[] strArr = f51Var.i0;
                arrayList.add(h61.C(null));
                w61Var.E = 1;
                w61Var.U();
                String str = f51Var.e0;
                arrayList.add(z41.b(3, "", str != null ? u41.y(u41.C(str, null, null)) : LocaleController.getString(R.string.AIEditorOriginalText), null, null));
                arrayList.add(d51.a(4, f51Var.a0, f51Var.k0, new gt(18, f51Var, w61Var), new p90() { // from class: org.telegram.ui.Components.y41
                    @Override // org.telegram.ui.Components.p90
                    public final void a(ClickableSpan clickableSpan) {
                        f51.O(f51.this, clickableSpan);
                    }
                }, null));
                StringBuilder sb2 = new StringBuilder();
                sb2.append(u41.C(f51Var.f0, null, null));
                sb2.append((f51Var.g0 == 1 || strArr == null) ? "" : a4.a.t(new StringBuilder(" ("), strArr[f51Var.g0], ")"));
                arrayList.add(z41.b(5, "", u41.y(sb2.toString()), null, new w41(f51Var, 4)));
                arrayList.add(d51.a(6, f51Var.c0, false, null, new p90() { // from class: org.telegram.ui.Components.y41
                    @Override // org.telegram.ui.Components.p90
                    public final void a(ClickableSpan clickableSpan) {
                        f51.O(f51.this, clickableSpan);
                    }
                }, null));
                w61Var.T();
                arrayList.add(h61.C(null));
                w61Var.U();
                arrayList.add(h61.c(1, R.drawable.msg_copy, LocaleController.getString(R.string.TranslateCopy)));
                w61Var.T();
                break;
            default:
                f51.P(this.b, (TLRPC.TL_messages_translateResult) obj, (TLRPC.TL_error) obj2);
                break;
        }
    }
}
