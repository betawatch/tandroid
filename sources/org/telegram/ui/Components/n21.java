package org.telegram.ui.Components;

import android.text.style.ClickableSpan;
import java.util.ArrayList;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final /* synthetic */ class n21 implements org.telegram.messenger.v10 {
    public final /* synthetic */ int a;
    public final /* synthetic */ v21 b;

    public /* synthetic */ n21(v21 v21Var, int i7) {
        this.a = i7;
        this.b = v21Var;
    }

    @Override // org.telegram.messenger.v10
    public final void a(Object obj, Object obj2) {
        int i7 = this.a;
        final v21 v21Var = this.b;
        switch (i7) {
            case 0:
                ArrayList arrayList = (ArrayList) obj;
                m41 m41Var = (m41) obj2;
                String[] strArr = v21Var.d2;
                arrayList.add(x31.C(null));
                m41Var.F = 1;
                m41Var.V();
                String str = v21Var.Z1;
                arrayList.add(p21.j(3, "", str != null ? k21.K0(k21.O0(str, null, null)) : org.telegram.messenger.id.M0(2131754986, null), null, null));
                arrayList.add(t21.i(4, v21Var.V1, v21Var.f2, new kk(26, v21Var, m41Var), new v70() { // from class: org.telegram.ui.Components.o21
                    @Override // org.telegram.ui.Components.v70
                    public final void a(ClickableSpan clickableSpan) {
                        if (clickableSpan == null) {
                            return;
                        }
                        clickableSpan.onClick(v21.this.b);
                    }
                }, null));
                StringBuilder sb2 = new StringBuilder();
                sb2.append(k21.O0(v21Var.a2, null, null));
                sb2.append((v21Var.b2 == 1 || strArr == null) ? "" : a8.p0.s(new StringBuilder(" ("), strArr[v21Var.b2], ")"));
                arrayList.add(p21.j(5, "", k21.K0(sb2.toString()), null, new m21(v21Var, 4)));
                arrayList.add(t21.i(6, v21Var.X1, false, null, new v70() { // from class: org.telegram.ui.Components.o21
                    @Override // org.telegram.ui.Components.v70
                    public final void a(ClickableSpan clickableSpan) {
                        if (clickableSpan == null) {
                            return;
                        }
                        clickableSpan.onClick(v21.this.b);
                    }
                }, null));
                m41Var.U();
                arrayList.add(x31.C(null));
                m41Var.V();
                arrayList.add(x31.c(1, R.drawable.msg_copy, org.telegram.messenger.id.M0(2131743958, null)));
                m41Var.U();
                break;
            default:
                TLRPC.TL_messages_translateResult tL_messages_translateResult = (TLRPC.TL_messages_translateResult) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                v21Var.g2 = -1;
                fi.d dVar = v21Var.U1;
                dVar.setLoading(false);
                if (tL_error == null) {
                    if (tL_messages_translateResult != null && !tL_messages_translateResult.result.isEmpty()) {
                        v21Var.X1 = org.telegram.messenger.ij.h0(tL_messages_translateResult.result.get(0), false);
                        v21Var.W1 = false;
                        v21Var.e2.O(true);
                        break;
                    } else {
                        dVar.setText(org.telegram.messenger.id.M0(2131747831, null));
                        dVar.setOnClickListener(new m21(v21Var, 1));
                        break;
                    }
                } else {
                    org.telegram.ui.Cells.f1.r(v21Var.E, v21Var.I0, tL_error, false);
                    dVar.setText(org.telegram.messenger.id.M0(2131747831, null));
                    dVar.setOnClickListener(new m21(v21Var, 0));
                    break;
                }
                break;
        }
    }
}
