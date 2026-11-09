package org.telegram.ui.Components;

import android.text.style.ClickableSpan;
import java.util.ArrayList;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final /* synthetic */ class o21 implements org.telegram.messenger.v10 {
    public final /* synthetic */ int a;
    public final /* synthetic */ w21 b;

    public /* synthetic */ o21(w21 w21Var, int i7) {
        this.a = i7;
        this.b = w21Var;
    }

    @Override // org.telegram.messenger.v10
    public final void a(Object obj, Object obj2) {
        int i7 = this.a;
        final w21 w21Var = this.b;
        switch (i7) {
            case 0:
                ArrayList arrayList = (ArrayList) obj;
                m41 m41Var = (m41) obj2;
                String[] strArr = w21Var.a2;
                arrayList.add(y31.C(null));
                m41Var.F = 1;
                m41Var.V();
                String str = w21Var.W1;
                arrayList.add(q21.j(3, "", str != null ? l21.K0(l21.O0(str, null, null)) : org.telegram.messenger.id.M0(2131754986, null), null, null));
                arrayList.add(u21.i(4, w21Var.S1, w21Var.c2, new lk(26, w21Var, m41Var), new w70() { // from class: org.telegram.ui.Components.p21
                    @Override // org.telegram.ui.Components.w70
                    public final void a(ClickableSpan clickableSpan) {
                        if (clickableSpan == null) {
                            return;
                        }
                        clickableSpan.onClick(w21.this.b);
                    }
                }, null));
                StringBuilder sb2 = new StringBuilder();
                sb2.append(l21.O0(w21Var.X1, null, null));
                sb2.append((w21Var.Y1 == 1 || strArr == null) ? "" : a8.p0.s(new StringBuilder(" ("), strArr[w21Var.Y1], ")"));
                arrayList.add(q21.j(5, "", l21.K0(sb2.toString()), null, new n21(w21Var, 4)));
                arrayList.add(u21.i(6, w21Var.U1, false, null, new w70() { // from class: org.telegram.ui.Components.p21
                    @Override // org.telegram.ui.Components.w70
                    public final void a(ClickableSpan clickableSpan) {
                        if (clickableSpan == null) {
                            return;
                        }
                        clickableSpan.onClick(w21.this.b);
                    }
                }, null));
                m41Var.U();
                arrayList.add(y31.C(null));
                m41Var.V();
                arrayList.add(y31.c(1, R.drawable.msg_copy, org.telegram.messenger.id.M0(2131743958, null)));
                m41Var.U();
                break;
            default:
                TLRPC.TL_messages_translateResult tL_messages_translateResult = (TLRPC.TL_messages_translateResult) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                w21Var.d2 = -1;
                fi.d dVar = w21Var.R1;
                dVar.setLoading(false);
                if (tL_error == null) {
                    if (tL_messages_translateResult != null && !tL_messages_translateResult.result.isEmpty()) {
                        w21Var.U1 = org.telegram.messenger.ij.h0(tL_messages_translateResult.result.get(0), false);
                        w21Var.T1 = false;
                        w21Var.b2.O(true);
                        break;
                    } else {
                        dVar.setText(org.telegram.messenger.id.M0(2131747831, null));
                        dVar.setOnClickListener(new n21(w21Var, 1));
                        break;
                    }
                } else {
                    org.telegram.ui.Cells.f1.r(w21Var.E, w21Var.I0, tL_error, false);
                    dVar.setText(org.telegram.messenger.id.M0(2131747831, null));
                    dVar.setOnClickListener(new n21(w21Var, 0));
                    break;
                }
                break;
        }
    }
}
