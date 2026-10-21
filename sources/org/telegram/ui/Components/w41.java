package org.telegram.ui.Components;

import android.text.style.ClickableSpan;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-54f46d3192cfcf06f3cb7093cda92e459a80ef6ed91a766593a44d0f1cb126c7 */
/* loaded from: classes3.dex */
public final /* synthetic */ class w41 implements Utilities.Callback2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ e51 b;

    public /* synthetic */ w41(e51 e51Var, int i10) {
        this.a = i10;
        this.b = e51Var;
    }

    @Override // org.telegram.messenger.Utilities.Callback2
    public final void run(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                ArrayList arrayList = (ArrayList) obj;
                u61 u61Var = (u61) obj2;
                final e51 e51Var = this.b;
                String[] strArr = e51Var.i0;
                arrayList.add(h61.B(null));
                u61Var.E = 1;
                u61Var.U();
                String str = e51Var.e0;
                arrayList.add(y41.b(3, "", str != null ? t41.A(t41.E(str, null, null)) : LocaleController.getString(R.string.AIEditorOriginalText), null, null));
                arrayList.add(c51.a(4, e51Var.a0, e51Var.k0, new ca(28, e51Var, u61Var), new w90() { // from class: org.telegram.ui.Components.x41
                    @Override // org.telegram.ui.Components.w90
                    public final void a(ClickableSpan clickableSpan) {
                        e51.R(e51.this, clickableSpan);
                    }
                }, null));
                StringBuilder sb2 = new StringBuilder();
                sb2.append(t41.E(e51Var.f0, null, null));
                sb2.append((e51Var.g0 == 1 || strArr == null) ? "" : a1.g.s(new StringBuilder(" ("), strArr[e51Var.g0], ")"));
                arrayList.add(y41.b(5, "", t41.A(sb2.toString()), null, new v41(e51Var, 4)));
                arrayList.add(c51.a(6, e51Var.c0, false, null, new w90() { // from class: org.telegram.ui.Components.x41
                    @Override // org.telegram.ui.Components.w90
                    public final void a(ClickableSpan clickableSpan) {
                        e51.R(e51.this, clickableSpan);
                    }
                }, null));
                u61Var.T();
                arrayList.add(h61.B(null));
                u61Var.U();
                arrayList.add(h61.c(1, R.drawable.msg_copy, LocaleController.getString(R.string.TranslateCopy)));
                u61Var.T();
                break;
            default:
                e51.S(this.b, (TLRPC.TL_messages_translateResult) obj, (TLRPC.TL_error) obj2);
                break;
        }
    }
}
