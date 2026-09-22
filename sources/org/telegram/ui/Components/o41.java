package org.telegram.ui.Components;

import android.text.style.ClickableSpan;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes3.dex */
public final /* synthetic */ class o41 implements Utilities.Callback2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ w41 b;

    public /* synthetic */ o41(w41 w41Var, int i10) {
        this.a = i10;
        this.b = w41Var;
    }

    @Override // org.telegram.messenger.Utilities.Callback2
    public final void run(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                ArrayList arrayList = (ArrayList) obj;
                m61 m61Var = (m61) obj2;
                final w41 w41Var = this.b;
                String[] strArr = w41Var.i0;
                arrayList.add(y51.B(null));
                m61Var.E = 1;
                m61Var.U();
                String str = w41Var.e0;
                arrayList.add(q41.b(3, "", str != null ? l41.y(l41.D(str, null, null)) : LocaleController.getString(R.string.AIEditorOriginalText), null, null));
                arrayList.add(u41.a(4, w41Var.a0, w41Var.k0, new dt(18, w41Var, m61Var), new m90() { // from class: org.telegram.ui.Components.p41
                    @Override // org.telegram.ui.Components.m90
                    public final void a(ClickableSpan clickableSpan) {
                        w41.Q(w41.this, clickableSpan);
                    }
                }, null));
                StringBuilder sb2 = new StringBuilder();
                sb2.append(l41.D(w41Var.f0, null, null));
                sb2.append((w41Var.g0 == 1 || strArr == null) ? "" : a4.a.s(new StringBuilder(" ("), strArr[w41Var.g0], ")"));
                arrayList.add(q41.b(5, "", l41.y(sb2.toString()), null, new n41(w41Var, 4)));
                arrayList.add(u41.a(6, w41Var.c0, false, null, new m90() { // from class: org.telegram.ui.Components.p41
                    @Override // org.telegram.ui.Components.m90
                    public final void a(ClickableSpan clickableSpan) {
                        w41.Q(w41.this, clickableSpan);
                    }
                }, null));
                m61Var.T();
                arrayList.add(y51.B(null));
                m61Var.U();
                arrayList.add(y51.c(1, R.drawable.msg_copy, LocaleController.getString(R.string.TranslateCopy)));
                m61Var.T();
                break;
            default:
                w41.R(this.b, (TLRPC.TL_messages_translateResult) obj, (TLRPC.TL_error) obj2);
                break;
        }
    }
}
