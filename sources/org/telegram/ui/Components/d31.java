package org.telegram.ui.Components;

import android.text.style.ClickableSpan;
import java.util.ArrayList;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final /* synthetic */ class d31 implements org.telegram.messenger.p10 {
    public final /* synthetic */ int a;
    public final /* synthetic */ l31 b;

    public /* synthetic */ d31(l31 l31Var, int i7) {
        this.a = i7;
        this.b = l31Var;
    }

    @Override // org.telegram.messenger.p10
    public final void a(Object obj, Object obj2) {
        int i7 = this.a;
        final l31 l31Var = this.b;
        switch (i7) {
            case 0:
                ArrayList arrayList = (ArrayList) obj;
                b51 b51Var = (b51) obj2;
                String[] strArr = l31Var.e2;
                arrayList.add(n41.C(null));
                b51Var.G = 1;
                b51Var.V();
                String str = l31Var.a2;
                arrayList.add(f31.j(3, "", str != null ? a31.L0(a31.P0(str, null, null)) : org.telegram.messenger.gd.N0(2131754986, null), null, null));
                arrayList.add(j31.i(4, l31Var.W1, l31Var.g2, new l8(28, l31Var, b51Var), new i80() { // from class: org.telegram.ui.Components.e31
                    @Override // org.telegram.ui.Components.i80
                    public final void a(ClickableSpan clickableSpan) {
                        if (clickableSpan == null) {
                            return;
                        }
                        clickableSpan.onClick(l31.this.b);
                    }
                }, null));
                StringBuilder sb2 = new StringBuilder();
                sb2.append(a31.P0(l31Var.b2, null, null));
                sb2.append((l31Var.c2 == 1 || strArr == null) ? "" : a8.p0.s(new StringBuilder(" ("), strArr[l31Var.c2], ")"));
                arrayList.add(f31.j(5, "", a31.L0(sb2.toString()), null, new c31(l31Var, 4)));
                arrayList.add(j31.i(6, l31Var.Y1, false, null, new i80() { // from class: org.telegram.ui.Components.e31
                    @Override // org.telegram.ui.Components.i80
                    public final void a(ClickableSpan clickableSpan) {
                        if (clickableSpan == null) {
                            return;
                        }
                        clickableSpan.onClick(l31.this.b);
                    }
                }, null));
                b51Var.U();
                arrayList.add(n41.C(null));
                b51Var.V();
                arrayList.add(n41.c(1, R.drawable.msg_copy, org.telegram.messenger.gd.N0(2131743711, null)));
                b51Var.U();
                break;
            default:
                TLRPC.TL_messages_translateResult tL_messages_translateResult = (TLRPC.TL_messages_translateResult) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                l31Var.h2 = -1;
                hi.e eVar = l31Var.V1;
                eVar.setLoading(false);
                if (tL_error == null) {
                    if (tL_messages_translateResult != null && !tL_messages_translateResult.result.isEmpty()) {
                        l31Var.Y1 = org.telegram.messenger.fj.h0(tL_messages_translateResult.result.get(0), false);
                        l31Var.X1 = false;
                        l31Var.f2.O(true);
                        break;
                    } else {
                        eVar.setText(org.telegram.messenger.gd.N0(2131747637, null));
                        eVar.setOnClickListener(new c31(l31Var, 1));
                        break;
                    }
                } else {
                    org.telegram.ui.Cells.c0.t(l31Var.F, l31Var.J0, tL_error, false);
                    eVar.setText(org.telegram.messenger.gd.N0(2131747637, null));
                    eVar.setOnClickListener(new c31(l31Var, 0));
                    break;
                }
                break;
        }
    }
}
