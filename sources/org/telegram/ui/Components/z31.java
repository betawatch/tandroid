package org.telegram.ui.Components;

import android.text.style.ClickableSpan;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final /* synthetic */ class z31 implements Utilities.Callback2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ h41 b;

    public /* synthetic */ z31(h41 h41Var, int i10) {
        this.a = i10;
        this.b = h41Var;
    }

    @Override // org.telegram.messenger.Utilities.Callback2
    public final void run(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                ArrayList arrayList = (ArrayList) obj;
                x51 x51Var = (x51) obj2;
                final h41 h41Var = this.b;
                String[] strArr = h41Var.i0;
                arrayList.add(j51.B(null));
                x51Var.E = 1;
                x51Var.U();
                String str = h41Var.e0;
                arrayList.add(b41.b(3, "", str != null ? w31.y(w31.E(str, null, null)) : LocaleController.getString(R.string.AIEditorOriginalText), null, null));
                arrayList.add(f41.a(4, h41Var.a0, h41Var.k0, new dt(18, h41Var, x51Var), new b90() { // from class: org.telegram.ui.Components.a41
                    @Override // org.telegram.ui.Components.b90
                    public final void a(ClickableSpan clickableSpan) {
                        h41.Q(h41.this, clickableSpan);
                    }
                }, null));
                StringBuilder sb2 = new StringBuilder();
                sb2.append(w31.E(h41Var.f0, null, null));
                sb2.append((h41Var.g0 == 1 || strArr == null) ? "" : a4.a.s(new StringBuilder(" ("), strArr[h41Var.g0], ")"));
                arrayList.add(b41.b(5, "", w31.y(sb2.toString()), null, new y31(h41Var, 4)));
                arrayList.add(f41.a(6, h41Var.c0, false, null, new b90() { // from class: org.telegram.ui.Components.a41
                    @Override // org.telegram.ui.Components.b90
                    public final void a(ClickableSpan clickableSpan) {
                        h41.Q(h41.this, clickableSpan);
                    }
                }, null));
                x51Var.T();
                arrayList.add(j51.B(null));
                x51Var.U();
                arrayList.add(j51.c(1, R.drawable.msg_copy, LocaleController.getString(R.string.TranslateCopy)));
                x51Var.T();
                break;
            default:
                h41.R(this.b, (TLRPC.TL_messages_translateResult) obj, (TLRPC.TL_error) obj2);
                break;
        }
    }
}
