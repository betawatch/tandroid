package org.telegram.ui.Components;

import android.text.style.ClickableSpan;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final /* synthetic */ class i51 implements Utilities.Callback2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ r51 b;

    public /* synthetic */ i51(r51 r51Var, int i10) {
        this.a = i10;
        this.b = r51Var;
    }

    @Override // org.telegram.messenger.Utilities.Callback2
    public final void run(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                ArrayList arrayList = (ArrayList) obj;
                j71 j71Var = (j71) obj2;
                final r51 r51Var = this.b;
                String[] strArr = r51Var.i0;
                arrayList.add(t61.C(null));
                j71Var.F = 1;
                j71Var.V();
                String str = r51Var.e0;
                arrayList.add(l51.b(3, "", str != null ? f51.J(f51.N(str, null, null)) : LocaleController.getString(R.string.AIEditorOriginalText), null, null));
                arrayList.add(p51.a(4, r51Var.a0, r51Var.k0, new ga(29, r51Var, j71Var), new y90() { // from class: org.telegram.ui.Components.j51
                    @Override // org.telegram.ui.Components.y90
                    public final void a(ClickableSpan clickableSpan) {
                        r51.Q(r51.this, clickableSpan);
                    }
                }, null));
                StringBuilder sb2 = new StringBuilder();
                sb2.append(f51.N(r51Var.f0, null, null));
                sb2.append((r51Var.g0 == 1 || strArr == null) ? "" : a1.g.s(new StringBuilder(" ("), strArr[r51Var.g0], ")"));
                arrayList.add(l51.b(5, "", f51.J(sb2.toString()), null, new h51(r51Var, 4)));
                arrayList.add(p51.a(6, r51Var.c0, false, null, new y90() { // from class: org.telegram.ui.Components.j51
                    @Override // org.telegram.ui.Components.y90
                    public final void a(ClickableSpan clickableSpan) {
                        r51.Q(r51.this, clickableSpan);
                    }
                }, null));
                j71Var.U();
                arrayList.add(t61.C(null));
                j71Var.V();
                arrayList.add(t61.c(1, R.drawable.msg_copy, LocaleController.getString(R.string.TranslateCopy)));
                j71Var.U();
                break;
            default:
                r51.R(this.b, (TLRPC.TL_messages_translateResult) obj, (TLRPC.TL_error) obj2);
                break;
        }
    }
}
