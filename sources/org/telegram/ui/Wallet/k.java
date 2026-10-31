package org.telegram.ui.Wallet;

import org.telegram.messenger.cd;
import org.telegram.messenger.j20;
import org.telegram.messenger.q20;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.nc;
import org.telegram.ui.r70;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class k implements q20 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ k(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // org.telegram.messenger.q20
    public final void a(Object obj) {
        int i10 = this.a;
        Object obj2 = this.b;
        switch (i10) {
            case 0:
                ((nc) obj2).a(Boolean.valueOf(((String) obj) == null));
                break;
            case 1:
                h0 h0Var = (h0) obj;
                ((j20) obj2).a(h0Var, h0Var == null ? "LOCAL_STORAGE_ERROR" : null);
                break;
            case 2:
                String str = (String) obj;
                e2.m("disconnect session", str);
                ((q20) obj2).a(str);
                break;
            case 3:
                String str2 = (String) obj;
                e2.m("approve session", str2);
                ((r70) obj2).a(str2);
                break;
            case 4:
                org.telegram.messenger.i0.g3(new k3(r2, (h8) obj2, (TLRPC.UserFull) obj));
                break;
            default:
                k8 k8Var = (k8) obj2;
                k8Var.getClass();
                r2 = ((Integer) obj).intValue() != 0 ? 24 : 12;
                if (k8Var.a != r2) {
                    k8Var.a = r2;
                    k8Var.a0(k8Var.getParentActivity());
                    k8Var.c0();
                    k8Var.h.setText(k8Var.s != null ? cd.V(null, null, 2131743119, Integer.valueOf(r2)) : cd.V(null, null, 2131743117, Integer.valueOf(r2)));
                    break;
                }
                break;
        }
    }
}
