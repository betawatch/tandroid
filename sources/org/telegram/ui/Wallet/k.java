package org.telegram.ui.Wallet;

import org.telegram.messenger.dd;
import org.telegram.messenger.k20;
import org.telegram.messenger.r20;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.p80;
import org.telegram.ui.nc;
import org.telegram.ui.q70;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final /* synthetic */ class k implements r20 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ k(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // org.telegram.messenger.r20
    public final void a(Object obj) {
        CharSequence V;
        int i10 = this.a;
        Object obj2 = this.b;
        switch (i10) {
            case 0:
                ((nc) obj2).a(Boolean.valueOf(((String) obj) == null));
                break;
            case 1:
                h0 h0Var = (h0) obj;
                ((k20) obj2).a(h0Var, h0Var == null ? "LOCAL_STORAGE_ERROR" : null);
                break;
            case 2:
                String str = (String) obj;
                e2.m("disconnect session", str);
                ((r20) obj2).a(str);
                break;
            case 3:
                String str2 = (String) obj;
                e2.m("approve session", str2);
                ((q70) obj2).a(str2);
                break;
            case 4:
                org.telegram.messenger.i0.g3(new m2(13, (h8) obj2, (TLRPC.UserFull) obj));
                break;
            default:
                k8 k8Var = (k8) obj2;
                k8Var.getClass();
                int i11 = ((Integer) obj).intValue() == 0 ? 12 : 24;
                if (k8Var.a != i11) {
                    k8Var.a = i11;
                    k8Var.b0(k8Var.getParentActivity());
                    k8Var.d0();
                    p80 p80Var = k8Var.h;
                    byte[] bArr = k8Var.s;
                    Integer valueOf = Integer.valueOf(i11);
                    Object[] objArr = new Object[1];
                    if (bArr != null) {
                        objArr[0] = valueOf;
                        V = dd.V(null, null, 2131743119, objArr);
                    } else {
                        objArr[0] = valueOf;
                        V = dd.V(null, null, 2131743117, objArr);
                    }
                    p80Var.setText(V);
                    break;
                }
                break;
        }
    }
}
