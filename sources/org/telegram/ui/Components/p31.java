package org.telegram.ui.Components;

import android.text.style.ClickableSpan;
import java.util.ArrayList;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class p31 implements org.telegram.messenger.j20 {
    public final /* synthetic */ int a;
    public final /* synthetic */ x31 b;

    public /* synthetic */ p31(x31 x31Var, int i10) {
        this.a = i10;
        this.b = x31Var;
    }

    @Override // org.telegram.messenger.j20
    public final void a(Object obj, Object obj2) {
        int i10 = this.a;
        final x31 x31Var = this.b;
        switch (i10) {
            case 0:
                ArrayList arrayList = (ArrayList) obj;
                p51 p51Var = (p51) obj2;
                String[] strArr = x31Var.a2;
                arrayList.add(a51.C(null));
                p51Var.F = 1;
                p51Var.V();
                String str = x31Var.W1;
                arrayList.add(r31.j(3, "", str != null ? m31.K0(m31.O0(str, null, null)) : org.telegram.messenger.cd.L0(2131754986, null), null, null));
                arrayList.add(v31.i(4, x31Var.S1, x31Var.c2, new sr(19, x31Var, p51Var), new o80() { // from class: org.telegram.ui.Components.q31
                    @Override // org.telegram.ui.Components.o80
                    public final void a(ClickableSpan clickableSpan) {
                        if (clickableSpan == null) {
                            return;
                        }
                        clickableSpan.onClick(x31.this.b);
                    }
                }, null));
                StringBuilder sb2 = new StringBuilder();
                sb2.append(m31.O0(x31Var.X1, null, null));
                sb2.append((x31Var.Y1 == 1 || strArr == null) ? "" : a1.g.r(new StringBuilder(" ("), strArr[x31Var.Y1], ")"));
                arrayList.add(r31.j(5, "", m31.K0(sb2.toString()), null, new o31(x31Var, 4)));
                arrayList.add(v31.i(6, x31Var.U1, false, null, new o80() { // from class: org.telegram.ui.Components.q31
                    @Override // org.telegram.ui.Components.o80
                    public final void a(ClickableSpan clickableSpan) {
                        if (clickableSpan == null) {
                            return;
                        }
                        clickableSpan.onClick(x31.this.b);
                    }
                }, null));
                p51Var.U();
                arrayList.add(a51.C(null));
                p51Var.V();
                arrayList.add(a51.c(1, R.drawable.msg_copy, org.telegram.messenger.cd.L0(2131743983, null)));
                p51Var.U();
                break;
            default:
                TLRPC.TL_messages_translateResult tL_messages_translateResult = (TLRPC.TL_messages_translateResult) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                x31Var.d2 = -1;
                vh.d dVar = x31Var.R1;
                dVar.setLoading(false);
                if (tL_error == null) {
                    if (tL_messages_translateResult != null && !tL_messages_translateResult.result.isEmpty()) {
                        x31Var.U1 = org.telegram.messenger.jj.h0(tL_messages_translateResult.result.get(0), false);
                        x31Var.T1 = false;
                        x31Var.b2.O(true);
                        break;
                    } else {
                        dVar.setText(org.telegram.messenger.cd.L0(2131747847, null));
                        dVar.setOnClickListener(new o31(x31Var, 1));
                        break;
                    }
                } else {
                    org.telegram.ui.Cells.f1.s(x31Var.E, x31Var.I0, tL_error, false);
                    dVar.setText(org.telegram.messenger.cd.L0(2131747847, null));
                    dVar.setOnClickListener(new o31(x31Var, 0));
                    break;
                }
                break;
        }
    }
}
