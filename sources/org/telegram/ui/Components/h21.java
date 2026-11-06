package org.telegram.ui.Components;

import android.text.style.ClickableSpan;
import java.util.ArrayList;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes3.dex */
public final /* synthetic */ class h21 implements org.telegram.messenger.v10 {
    public final /* synthetic */ int a;
    public final /* synthetic */ p21 b;

    public /* synthetic */ h21(p21 p21Var, int i7) {
        this.a = i7;
        this.b = p21Var;
    }

    @Override // org.telegram.messenger.v10
    public final void a(Object obj, Object obj2) {
        int i7 = this.a;
        final p21 p21Var = this.b;
        switch (i7) {
            case 0:
                ArrayList arrayList = (ArrayList) obj;
                f41 f41Var = (f41) obj2;
                String[] strArr = p21Var.a2;
                arrayList.add(r31.C(null));
                f41Var.F = 1;
                f41Var.V();
                String str = p21Var.W1;
                arrayList.add(j21.j(3, "", str != null ? e21.K0(e21.O0(str, null, null)) : org.telegram.messenger.hd.M0(2131754986, null), null, null));
                arrayList.add(n21.i(4, p21Var.S1, p21Var.c2, new lk(26, p21Var, f41Var), new v70() { // from class: org.telegram.ui.Components.i21
                    @Override // org.telegram.ui.Components.v70
                    public final void a(ClickableSpan clickableSpan) {
                        if (clickableSpan == null) {
                            return;
                        }
                        clickableSpan.onClick(p21.this.b);
                    }
                }, null));
                StringBuilder sb2 = new StringBuilder();
                sb2.append(e21.O0(p21Var.X1, null, null));
                sb2.append((p21Var.Y1 == 1 || strArr == null) ? "" : a8.p0.s(new StringBuilder(" ("), strArr[p21Var.Y1], ")"));
                arrayList.add(j21.j(5, "", e21.K0(sb2.toString()), null, new g21(p21Var, 4)));
                arrayList.add(n21.i(6, p21Var.U1, false, null, new v70() { // from class: org.telegram.ui.Components.i21
                    @Override // org.telegram.ui.Components.v70
                    public final void a(ClickableSpan clickableSpan) {
                        if (clickableSpan == null) {
                            return;
                        }
                        clickableSpan.onClick(p21.this.b);
                    }
                }, null));
                f41Var.U();
                arrayList.add(r31.C(null));
                f41Var.V();
                arrayList.add(r31.c(1, R.drawable.msg_copy, org.telegram.messenger.hd.M0(2131743959, null)));
                f41Var.U();
                break;
            default:
                TLRPC.TL_messages_translateResult tL_messages_translateResult = (TLRPC.TL_messages_translateResult) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                p21Var.d2 = -1;
                fi.d dVar = p21Var.R1;
                dVar.setLoading(false);
                if (tL_error == null) {
                    if (tL_messages_translateResult != null && !tL_messages_translateResult.result.isEmpty()) {
                        p21Var.U1 = org.telegram.messenger.ij.h0(tL_messages_translateResult.result.get(0), false);
                        p21Var.T1 = false;
                        p21Var.b2.O(true);
                        break;
                    } else {
                        dVar.setText(org.telegram.messenger.hd.M0(2131747830, null));
                        dVar.setOnClickListener(new g21(p21Var, 1));
                        break;
                    }
                } else {
                    org.telegram.ui.Cells.f1.r(p21Var.E, p21Var.I0, tL_error, false);
                    dVar.setText(org.telegram.messenger.hd.M0(2131747830, null));
                    dVar.setOnClickListener(new g21(p21Var, 0));
                    break;
                }
                break;
        }
    }
}
