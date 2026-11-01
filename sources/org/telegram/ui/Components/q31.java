package org.telegram.ui.Components;

import android.text.style.ClickableSpan;
import java.util.ArrayList;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final /* synthetic */ class q31 implements org.telegram.messenger.k20 {
    public final /* synthetic */ int a;
    public final /* synthetic */ y31 b;

    public /* synthetic */ q31(y31 y31Var, int i10) {
        this.a = i10;
        this.b = y31Var;
    }

    @Override // org.telegram.messenger.k20
    public final void a(Object obj, Object obj2) {
        int i10 = this.a;
        final y31 y31Var = this.b;
        switch (i10) {
            case 0:
                ArrayList arrayList = (ArrayList) obj;
                q51 q51Var = (q51) obj2;
                String[] strArr = y31Var.a2;
                arrayList.add(b51.C(null));
                q51Var.F = 1;
                q51Var.V();
                String str = y31Var.W1;
                arrayList.add(s31.j(3, "", str != null ? n31.K0(n31.O0(str, null, null)) : org.telegram.messenger.dd.L0(2131754986, null), null, null));
                arrayList.add(w31.i(4, y31Var.S1, y31Var.c2, new sr(19, y31Var, q51Var), new o80() { // from class: org.telegram.ui.Components.r31
                    @Override // org.telegram.ui.Components.o80
                    public final void a(ClickableSpan clickableSpan) {
                        if (clickableSpan == null) {
                            return;
                        }
                        clickableSpan.onClick(y31.this.b);
                    }
                }, null));
                StringBuilder sb2 = new StringBuilder();
                sb2.append(n31.O0(y31Var.X1, null, null));
                sb2.append((y31Var.Y1 == 1 || strArr == null) ? "" : a1.g.r(new StringBuilder(" ("), strArr[y31Var.Y1], ")"));
                arrayList.add(s31.j(5, "", n31.K0(sb2.toString()), null, new p31(y31Var, 4)));
                arrayList.add(w31.i(6, y31Var.U1, false, null, new o80() { // from class: org.telegram.ui.Components.r31
                    @Override // org.telegram.ui.Components.o80
                    public final void a(ClickableSpan clickableSpan) {
                        if (clickableSpan == null) {
                            return;
                        }
                        clickableSpan.onClick(y31.this.b);
                    }
                }, null));
                q51Var.U();
                arrayList.add(b51.C(null));
                q51Var.V();
                arrayList.add(b51.c(1, R.drawable.msg_copy, org.telegram.messenger.dd.L0(2131743983, null)));
                q51Var.U();
                break;
            default:
                TLRPC.TL_messages_translateResult tL_messages_translateResult = (TLRPC.TL_messages_translateResult) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                y31Var.d2 = -1;
                vh.d dVar = y31Var.R1;
                dVar.setLoading(false);
                if (tL_error == null) {
                    if (tL_messages_translateResult != null && !tL_messages_translateResult.result.isEmpty()) {
                        y31Var.U1 = org.telegram.messenger.kj.h0(tL_messages_translateResult.result.get(0), false);
                        y31Var.T1 = false;
                        y31Var.b2.O(true);
                        break;
                    } else {
                        dVar.setText(org.telegram.messenger.dd.L0(2131747847, null));
                        dVar.setOnClickListener(new p31(y31Var, 1));
                        break;
                    }
                } else {
                    org.telegram.ui.Cells.f1.s(y31Var.E, y31Var.I0, tL_error, false);
                    dVar.setText(org.telegram.messenger.dd.L0(2131747847, null));
                    dVar.setOnClickListener(new p31(y31Var, 0));
                    break;
                }
                break;
        }
    }
}
