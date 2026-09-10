package org.telegram.ui.Components;

import android.text.style.ClickableSpan;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final /* synthetic */ class l41 implements Utilities.Callback2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ t41 b;

    public /* synthetic */ l41(t41 t41Var, int i10) {
        this.a = i10;
        this.b = t41Var;
    }

    @Override // org.telegram.messenger.Utilities.Callback2
    public final void run(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                ArrayList arrayList = (ArrayList) obj;
                j61 j61Var = (j61) obj2;
                final t41 t41Var = this.b;
                String[] strArr = t41Var.i0;
                arrayList.add(v51.B(null));
                j61Var.E = 1;
                j61Var.U();
                String str = t41Var.e0;
                arrayList.add(n41.b(3, "", str != null ? i41.y(i41.D(str, null, null)) : LocaleController.getString(R.string.AIEditorOriginalText), null, null));
                arrayList.add(r41.a(4, t41Var.a0, t41Var.k0, new u10(15, t41Var, j61Var), new l90() { // from class: org.telegram.ui.Components.m41
                    @Override // org.telegram.ui.Components.l90
                    public final void a(ClickableSpan clickableSpan) {
                        t41.Q(t41.this, clickableSpan);
                    }
                }, null));
                StringBuilder sb2 = new StringBuilder();
                sb2.append(i41.D(t41Var.f0, null, null));
                sb2.append((t41Var.g0 == 1 || strArr == null) ? "" : a4.a.s(new StringBuilder(" ("), strArr[t41Var.g0], ")"));
                arrayList.add(n41.b(5, "", i41.y(sb2.toString()), null, new k41(t41Var, 4)));
                arrayList.add(r41.a(6, t41Var.c0, false, null, new l90() { // from class: org.telegram.ui.Components.m41
                    @Override // org.telegram.ui.Components.l90
                    public final void a(ClickableSpan clickableSpan) {
                        t41.Q(t41.this, clickableSpan);
                    }
                }, null));
                j61Var.T();
                arrayList.add(v51.B(null));
                j61Var.U();
                arrayList.add(v51.c(1, R.drawable.msg_copy, LocaleController.getString(R.string.TranslateCopy)));
                j61Var.T();
                break;
            default:
                t41.R(this.b, (TLRPC.TL_messages_translateResult) obj, (TLRPC.TL_error) obj2);
                break;
        }
    }
}
