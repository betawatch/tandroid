package org.telegram.ui.Components;

import android.text.style.ClickableSpan;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-bcc7d273da888d5c27994201329e5b838e55754b73312241608ee42846efd426 */
/* loaded from: classes3.dex */
public final /* synthetic */ class u41 implements Utilities.Callback2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ c51 b;

    public /* synthetic */ u41(c51 c51Var, int i10) {
        this.a = i10;
        this.b = c51Var;
    }

    @Override // org.telegram.messenger.Utilities.Callback2
    public final void run(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                ArrayList arrayList = (ArrayList) obj;
                s61 s61Var = (s61) obj2;
                final c51 c51Var = this.b;
                String[] strArr = c51Var.i0;
                arrayList.add(f61.B(null));
                s61Var.E = 1;
                s61Var.U();
                String str = c51Var.e0;
                arrayList.add(w41.b(3, "", str != null ? r41.A(r41.F(str, null, null)) : LocaleController.getString(R.string.AIEditorOriginalText), null, null));
                arrayList.add(a51.a(4, c51Var.a0, c51Var.k0, new ca(28, c51Var, s61Var), new w90() { // from class: org.telegram.ui.Components.v41
                    @Override // org.telegram.ui.Components.w90
                    public final void a(ClickableSpan clickableSpan) {
                        c51.R(c51.this, clickableSpan);
                    }
                }, null));
                StringBuilder sb2 = new StringBuilder();
                sb2.append(r41.F(c51Var.f0, null, null));
                sb2.append((c51Var.g0 == 1 || strArr == null) ? "" : a1.g.s(new StringBuilder(" ("), strArr[c51Var.g0], ")"));
                arrayList.add(w41.b(5, "", r41.A(sb2.toString()), null, new t41(c51Var, 4)));
                arrayList.add(a51.a(6, c51Var.c0, false, null, new w90() { // from class: org.telegram.ui.Components.v41
                    @Override // org.telegram.ui.Components.w90
                    public final void a(ClickableSpan clickableSpan) {
                        c51.R(c51.this, clickableSpan);
                    }
                }, null));
                s61Var.T();
                arrayList.add(f61.B(null));
                s61Var.U();
                arrayList.add(f61.c(1, R.drawable.msg_copy, LocaleController.getString(R.string.TranslateCopy)));
                s61Var.T();
                break;
            default:
                c51.S(this.b, (TLRPC.TL_messages_translateResult) obj, (TLRPC.TL_error) obj2);
                break;
        }
    }
}
