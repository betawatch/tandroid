package org.telegram.ui.Components;

import android.text.style.ClickableSpan;
import java.util.ArrayList;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final /* synthetic */ class b31 implements org.telegram.messenger.q10 {
    public final /* synthetic */ int a;
    public final /* synthetic */ k31 b;

    public /* synthetic */ b31(k31 k31Var, int i7) {
        this.a = i7;
        this.b = k31Var;
    }

    @Override // org.telegram.messenger.q10
    public final void a(Object obj, Object obj2) {
        int i7 = this.a;
        final k31 k31Var = this.b;
        switch (i7) {
            case 0:
                ArrayList arrayList = (ArrayList) obj;
                z41 z41Var = (z41) obj2;
                String[] strArr = k31Var.e2;
                arrayList.add(l41.C(null));
                z41Var.G = 1;
                z41Var.V();
                String str = k31Var.a2;
                arrayList.add(e31.j(3, "", str != null ? y21.L0(y21.P0(str, null, null)) : org.telegram.messenger.gd.M0(2131754986, null), null, null));
                arrayList.add(i31.i(4, k31Var.W1, k31Var.g2, new c31(0, k31Var, z41Var), new j80() { // from class: org.telegram.ui.Components.d31
                    @Override // org.telegram.ui.Components.j80
                    public final void a(ClickableSpan clickableSpan) {
                        if (clickableSpan == null) {
                            return;
                        }
                        clickableSpan.onClick(k31.this.b);
                    }
                }, null));
                StringBuilder sb2 = new StringBuilder();
                sb2.append(y21.P0(k31Var.b2, null, null));
                sb2.append((k31Var.c2 == 1 || strArr == null) ? "" : a8.p0.s(new StringBuilder(" ("), strArr[k31Var.c2], ")"));
                arrayList.add(e31.j(5, "", y21.L0(sb2.toString()), null, new a31(k31Var, 4)));
                arrayList.add(i31.i(6, k31Var.Y1, false, null, new j80() { // from class: org.telegram.ui.Components.d31
                    @Override // org.telegram.ui.Components.j80
                    public final void a(ClickableSpan clickableSpan) {
                        if (clickableSpan == null) {
                            return;
                        }
                        clickableSpan.onClick(k31.this.b);
                    }
                }, null));
                z41Var.U();
                arrayList.add(l41.C(null));
                z41Var.V();
                arrayList.add(l41.c(1, R.drawable.msg_copy, org.telegram.messenger.gd.M0(2131743721, null)));
                z41Var.U();
                break;
            default:
                TLRPC.TL_messages_translateResult tL_messages_translateResult = (TLRPC.TL_messages_translateResult) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                k31Var.h2 = -1;
                hi.d dVar = k31Var.V1;
                dVar.setLoading(false);
                if (tL_error == null) {
                    if (tL_messages_translateResult != null && !tL_messages_translateResult.result.isEmpty()) {
                        k31Var.Y1 = org.telegram.messenger.fj.h0(tL_messages_translateResult.result.get(0), false);
                        k31Var.X1 = false;
                        k31Var.f2.O(true);
                        break;
                    } else {
                        dVar.setText(org.telegram.messenger.gd.M0(2131747638, null));
                        dVar.setOnClickListener(new a31(k31Var, 1));
                        break;
                    }
                } else {
                    org.telegram.ui.Cells.c0.t(k31Var.F, k31Var.J0, tL_error, false);
                    dVar.setText(org.telegram.messenger.gd.M0(2131747638, null));
                    dVar.setOnClickListener(new a31(k31Var, 0));
                    break;
                }
                break;
        }
    }
}
