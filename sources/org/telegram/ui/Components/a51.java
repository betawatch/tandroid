package org.telegram.ui.Components;

import android.text.style.ClickableSpan;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public final /* synthetic */ class a51 implements Utilities.Callback2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ i51 b;

    public /* synthetic */ a51(i51 i51Var, int i10) {
        this.a = i10;
        this.b = i51Var;
    }

    @Override // org.telegram.messenger.Utilities.Callback2
    public final void run(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                ArrayList arrayList = (ArrayList) obj;
                z61 z61Var = (z61) obj2;
                final i51 i51Var = this.b;
                String[] strArr = i51Var.i0;
                arrayList.add(l61.B(null));
                z61Var.E = 1;
                z61Var.U();
                String str = i51Var.e0;
                arrayList.add(c51.b(3, "", str != null ? x41.A(x41.F(str, null, null)) : LocaleController.getString(R.string.AIEditorOriginalText), null, null));
                arrayList.add(g51.a(4, i51Var.a0, i51Var.k0, new rt(18, i51Var, z61Var), new ca0() { // from class: org.telegram.ui.Components.b51
                    @Override // org.telegram.ui.Components.ca0
                    public final void a(ClickableSpan clickableSpan) {
                        i51.R(i51.this, clickableSpan);
                    }
                }, null));
                StringBuilder sb2 = new StringBuilder();
                sb2.append(x41.F(i51Var.f0, null, null));
                sb2.append((i51Var.g0 == 1 || strArr == null) ? "" : a1.g.s(new StringBuilder(" ("), strArr[i51Var.g0], ")"));
                arrayList.add(c51.b(5, "", x41.A(sb2.toString()), null, new z41(i51Var, 4)));
                arrayList.add(g51.a(6, i51Var.c0, false, null, new ca0() { // from class: org.telegram.ui.Components.b51
                    @Override // org.telegram.ui.Components.ca0
                    public final void a(ClickableSpan clickableSpan) {
                        i51.R(i51.this, clickableSpan);
                    }
                }, null));
                z61Var.T();
                arrayList.add(l61.B(null));
                z61Var.U();
                arrayList.add(l61.c(1, R.drawable.msg_copy, LocaleController.getString(R.string.TranslateCopy)));
                z61Var.T();
                break;
            default:
                i51.S(this.b, (TLRPC.TL_messages_translateResult) obj, (TLRPC.TL_error) obj2);
                break;
        }
    }
}
