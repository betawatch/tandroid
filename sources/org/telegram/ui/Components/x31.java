package org.telegram.ui.Components;

import android.text.style.ClickableSpan;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
/* loaded from: classes3.dex */
public final /* synthetic */ class x31 implements Utilities.Callback2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ f41 b;

    public /* synthetic */ x31(f41 f41Var, int i10) {
        this.a = i10;
        this.b = f41Var;
    }

    @Override // org.telegram.messenger.Utilities.Callback2
    public final void run(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                ArrayList arrayList = (ArrayList) obj;
                v51 v51Var = (v51) obj2;
                final f41 f41Var = this.b;
                String[] strArr = f41Var.i0;
                arrayList.add(h51.B(null));
                v51Var.E = 1;
                v51Var.U();
                String str = f41Var.e0;
                arrayList.add(z31.b(3, "", str != null ? u31.y(u31.D(str, null, null)) : LocaleController.getString(R.string.AIEditorOriginalText), null, null));
                arrayList.add(d41.a(4, f41Var.a0, f41Var.k0, new ct(18, f41Var, v51Var), new c90() { // from class: org.telegram.ui.Components.y31
                    @Override // org.telegram.ui.Components.c90
                    public final void a(ClickableSpan clickableSpan) {
                        f41.Q(f41.this, clickableSpan);
                    }
                }, null));
                StringBuilder sb2 = new StringBuilder();
                sb2.append(u31.D(f41Var.f0, null, null));
                sb2.append((f41Var.g0 == 1 || strArr == null) ? "" : a4.a.s(new StringBuilder(" ("), strArr[f41Var.g0], ")"));
                arrayList.add(z31.b(5, "", u31.y(sb2.toString()), null, new w31(f41Var, 4)));
                arrayList.add(d41.a(6, f41Var.c0, false, null, new c90() { // from class: org.telegram.ui.Components.y31
                    @Override // org.telegram.ui.Components.c90
                    public final void a(ClickableSpan clickableSpan) {
                        f41.Q(f41.this, clickableSpan);
                    }
                }, null));
                v51Var.T();
                arrayList.add(h51.B(null));
                v51Var.U();
                arrayList.add(h51.c(1, R.drawable.msg_copy, LocaleController.getString(R.string.TranslateCopy)));
                v51Var.T();
                break;
            default:
                f41.R(this.b, (TLRPC.TL_messages_translateResult) obj, (TLRPC.TL_error) obj2);
                break;
        }
    }
}
