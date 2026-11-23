package org.telegram.ui.Components;

import android.text.style.ClickableSpan;
import java.util.ArrayList;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes3.dex */
public final /* synthetic */ class e31 implements org.telegram.messenger.r10 {
    public final /* synthetic */ int a;
    public final /* synthetic */ m31 b;

    public /* synthetic */ e31(m31 m31Var, int i7) {
        this.a = i7;
        this.b = m31Var;
    }

    @Override // org.telegram.messenger.r10
    public final void a(Object obj, Object obj2) {
        int i7 = this.a;
        final m31 m31Var = this.b;
        switch (i7) {
            case 0:
                ArrayList arrayList = (ArrayList) obj;
                c51 c51Var = (c51) obj2;
                String[] strArr = m31Var.e2;
                arrayList.add(o41.C(null));
                c51Var.G = 1;
                c51Var.V();
                String str = m31Var.a2;
                arrayList.add(g31.j(3, "", str != null ? b31.L0(b31.P0(str, null, null)) : org.telegram.messenger.hd.N0(2131754986, null), null, null));
                arrayList.add(k31.i(4, m31Var.W1, m31Var.g2, new m8(28, m31Var, c51Var), new l80() { // from class: org.telegram.ui.Components.f31
                    @Override // org.telegram.ui.Components.l80
                    public final void a(ClickableSpan clickableSpan) {
                        if (clickableSpan == null) {
                            return;
                        }
                        clickableSpan.onClick(m31.this.b);
                    }
                }, null));
                StringBuilder sb2 = new StringBuilder();
                sb2.append(b31.P0(m31Var.b2, null, null));
                sb2.append((m31Var.c2 == 1 || strArr == null) ? "" : a8.p0.s(new StringBuilder(" ("), strArr[m31Var.c2], ")"));
                arrayList.add(g31.j(5, "", b31.L0(sb2.toString()), null, new d31(m31Var, 4)));
                arrayList.add(k31.i(6, m31Var.Y1, false, null, new l80() { // from class: org.telegram.ui.Components.f31
                    @Override // org.telegram.ui.Components.l80
                    public final void a(ClickableSpan clickableSpan) {
                        if (clickableSpan == null) {
                            return;
                        }
                        clickableSpan.onClick(m31.this.b);
                    }
                }, null));
                c51Var.U();
                arrayList.add(o41.C(null));
                c51Var.V();
                arrayList.add(o41.c(1, R.drawable.msg_copy, org.telegram.messenger.hd.N0(2131743713, null)));
                c51Var.U();
                break;
            default:
                TLRPC.TL_messages_translateResult tL_messages_translateResult = (TLRPC.TL_messages_translateResult) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                m31Var.h2 = -1;
                hi.e eVar = m31Var.V1;
                eVar.setLoading(false);
                if (tL_error == null) {
                    if (tL_messages_translateResult != null && !tL_messages_translateResult.result.isEmpty()) {
                        m31Var.Y1 = org.telegram.messenger.gj.h0(tL_messages_translateResult.result.get(0), false);
                        m31Var.X1 = false;
                        m31Var.f2.O(true);
                        break;
                    } else {
                        eVar.setText(org.telegram.messenger.hd.N0(2131747637, null));
                        eVar.setOnClickListener(new d31(m31Var, 1));
                        break;
                    }
                } else {
                    org.telegram.ui.Cells.c0.t(m31Var.F, m31Var.J0, tL_error, false);
                    eVar.setText(org.telegram.messenger.hd.N0(2131747637, null));
                    eVar.setOnClickListener(new d31(m31Var, 0));
                    break;
                }
                break;
        }
    }
}
