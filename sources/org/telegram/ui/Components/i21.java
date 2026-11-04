package org.telegram.ui.Components;

import android.text.style.ClickableSpan;
import java.util.ArrayList;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class i21 implements org.telegram.messenger.n10 {
    public final /* synthetic */ int a;
    public final /* synthetic */ q21 b;

    public /* synthetic */ i21(q21 q21Var, int i3) {
        this.a = i3;
        this.b = q21Var;
    }

    @Override // org.telegram.messenger.n10
    public final void a(Object obj, Object obj2) {
        int i3 = this.a;
        final q21 q21Var = this.b;
        switch (i3) {
            case 0:
                ArrayList arrayList = (ArrayList) obj;
                f41 f41Var = (f41) obj2;
                String[] strArr = q21Var.b2;
                arrayList.add(r31.C(null));
                f41Var.G = 1;
                f41Var.V();
                String str = q21Var.X1;
                arrayList.add(k21.j(3, "", str != null ? f21.K0(f21.O0(str, null, null)) : org.telegram.messenger.bd.M0(2131754986, null), null, null));
                arrayList.add(o21.i(4, q21Var.T1, q21Var.d2, new ux0(2, (Object) q21Var, (Object) f41Var), new r70() { // from class: org.telegram.ui.Components.j21
                    @Override // org.telegram.ui.Components.r70
                    public final void a(ClickableSpan clickableSpan) {
                        if (clickableSpan == null) {
                            return;
                        }
                        clickableSpan.onClick(q21.this.b);
                    }
                }, null));
                StringBuilder sb2 = new StringBuilder();
                sb2.append(f21.O0(q21Var.Y1, null, null));
                sb2.append((q21Var.Z1 == 1 || strArr == null) ? "" : a1.g.s(new StringBuilder(" ("), strArr[q21Var.Z1], ")"));
                arrayList.add(k21.j(5, "", f21.K0(sb2.toString()), null, new h21(q21Var, 4)));
                arrayList.add(o21.i(6, q21Var.V1, false, null, new r70() { // from class: org.telegram.ui.Components.j21
                    @Override // org.telegram.ui.Components.r70
                    public final void a(ClickableSpan clickableSpan) {
                        if (clickableSpan == null) {
                            return;
                        }
                        clickableSpan.onClick(q21.this.b);
                    }
                }, null));
                f41Var.U();
                arrayList.add(r31.C(null));
                f41Var.V();
                arrayList.add(r31.c(1, R.drawable.msg_copy, org.telegram.messenger.bd.M0(2131743968, null)));
                f41Var.U();
                break;
            default:
                TLRPC.TL_messages_translateResult tL_messages_translateResult = (TLRPC.TL_messages_translateResult) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                q21Var.e2 = -1;
                gi.d dVar = q21Var.S1;
                dVar.setLoading(false);
                if (tL_error == null) {
                    if (tL_messages_translateResult != null && !tL_messages_translateResult.result.isEmpty()) {
                        q21Var.V1 = org.telegram.messenger.zi.h0(tL_messages_translateResult.result.get(0), false);
                        q21Var.U1 = false;
                        q21Var.c2.O(true);
                        break;
                    } else {
                        dVar.setText(org.telegram.messenger.bd.M0(2131747839, null));
                        dVar.setOnClickListener(new h21(q21Var, 1));
                        break;
                    }
                } else {
                    org.telegram.ui.Cells.f1.v(q21Var.F, q21Var.J0, tL_error, false);
                    dVar.setText(org.telegram.messenger.bd.M0(2131747839, null));
                    dVar.setOnClickListener(new h21(q21Var, 0));
                    break;
                }
                break;
        }
    }
}
