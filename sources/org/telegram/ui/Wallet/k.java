package org.telegram.ui.Wallet;

import org.telegram.messenger.bd;
import org.telegram.messenger.n10;
import org.telegram.messenger.u10;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ma1;
import org.telegram.ui.n60;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final /* synthetic */ class k implements u10 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ k(Object obj, int i3) {
        this.a = i3;
        this.b = obj;
    }

    @Override // org.telegram.messenger.u10
    public final void a(Object obj) {
        int i3 = this.a;
        Object obj2 = this.b;
        switch (i3) {
            case 0:
                ((ci.b8) obj2).a(Boolean.valueOf(((String) obj) == null));
                break;
            case 1:
                h0 h0Var = (h0) obj;
                ((n10) obj2).a(h0Var, h0Var == null ? "LOCAL_STORAGE_ERROR" : null);
                break;
            case 2:
                String str = (String) obj;
                c2.m("disconnect session", str);
                ((u10) obj2).a(str);
                break;
            case 3:
                String str2 = (String) obj;
                c2.m("approve session", str2);
                ((n60) obj2).a(str2);
                break;
            case 4:
                org.telegram.messenger.g0.h3(new ma1(r2, (b8) obj2, (TLRPC.UserFull) obj));
                break;
            default:
                e8 e8Var = (e8) obj2;
                e8Var.getClass();
                r2 = ((Integer) obj).intValue() == 0 ? 12 : 24;
                if (e8Var.a != r2) {
                    e8Var.a = r2;
                    e8Var.b0(e8Var.getParentActivity());
                    e8Var.d0();
                    e8Var.h.setText(e8Var.s != null ? bd.V(null, null, 2131743103, Integer.valueOf(r2)) : bd.V(null, null, 2131743101, Integer.valueOf(r2)));
                    break;
                }
                break;
        }
    }
}
