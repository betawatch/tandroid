package org.telegram.ui.Components;

import android.text.style.ClickableSpan;
import java.util.ArrayList;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final /* synthetic */ class s21 implements org.telegram.messenger.s10 {
    public final /* synthetic */ int a;
    public final /* synthetic */ a31 b;

    public /* synthetic */ s21(a31 a31Var, int i7) {
        this.a = i7;
        this.b = a31Var;
    }

    @Override // org.telegram.messenger.s10
    public final void a(Object obj, Object obj2) {
        int i7 = this.a;
        final a31 a31Var = this.b;
        switch (i7) {
            case 0:
                ArrayList arrayList = (ArrayList) obj;
                p41 p41Var = (p41) obj2;
                String[] strArr = a31Var.e2;
                arrayList.add(b41.C(null));
                p41Var.G = 1;
                p41Var.V();
                String str = a31Var.a2;
                arrayList.add(u21.j(3, "", str != null ? p21.K0(p21.O0(str, null, null)) : org.telegram.messenger.hd.M0(2131754986, null), null, null));
                arrayList.add(y21.i(4, a31Var.W1, a31Var.g2, new vv0(4, a31Var, p41Var), new y70() { // from class: org.telegram.ui.Components.t21
                    @Override // org.telegram.ui.Components.y70
                    public final void a(ClickableSpan clickableSpan) {
                        if (clickableSpan == null) {
                            return;
                        }
                        clickableSpan.onClick(a31.this.b);
                    }
                }, null));
                StringBuilder sb2 = new StringBuilder();
                sb2.append(p21.O0(a31Var.b2, null, null));
                sb2.append((a31Var.c2 == 1 || strArr == null) ? "" : a8.p0.s(new StringBuilder(" ("), strArr[a31Var.c2], ")"));
                arrayList.add(u21.j(5, "", p21.K0(sb2.toString()), null, new r21(a31Var, 4)));
                arrayList.add(y21.i(6, a31Var.Y1, false, null, new y70() { // from class: org.telegram.ui.Components.t21
                    @Override // org.telegram.ui.Components.y70
                    public final void a(ClickableSpan clickableSpan) {
                        if (clickableSpan == null) {
                            return;
                        }
                        clickableSpan.onClick(a31.this.b);
                    }
                }, null));
                p41Var.U();
                arrayList.add(b41.C(null));
                p41Var.V();
                arrayList.add(b41.c(1, R.drawable.msg_copy, org.telegram.messenger.hd.M0(2131743958, null)));
                p41Var.U();
                break;
            default:
                TLRPC.TL_messages_translateResult tL_messages_translateResult = (TLRPC.TL_messages_translateResult) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                a31Var.h2 = -1;
                hi.d dVar = a31Var.V1;
                dVar.setLoading(false);
                if (tL_error == null) {
                    if (tL_messages_translateResult != null && !tL_messages_translateResult.result.isEmpty()) {
                        a31Var.Y1 = org.telegram.messenger.gj.h0(tL_messages_translateResult.result.get(0), false);
                        a31Var.X1 = false;
                        a31Var.f2.O(true);
                        break;
                    } else {
                        dVar.setText(org.telegram.messenger.hd.M0(2131747831, null));
                        dVar.setOnClickListener(new r21(a31Var, 1));
                        break;
                    }
                } else {
                    org.telegram.ui.Cells.y0.q(a31Var.F, a31Var.J0, tL_error, false);
                    dVar.setText(org.telegram.messenger.hd.M0(2131747831, null));
                    dVar.setOnClickListener(new r21(a31Var, 0));
                    break;
                }
                break;
        }
    }
}
