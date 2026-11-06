package org.telegram.ui.Wallet;

import org.telegram.messenger.c20;
import org.telegram.messenger.hd;
import org.telegram.messenger.v10;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.w70;
import org.telegram.ui.t60;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes4.dex */
public final /* synthetic */ class k implements c20 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ k(Object obj, int i7) {
        this.a = i7;
        this.b = obj;
    }

    @Override // org.telegram.messenger.c20
    public final void a(Object obj) {
        CharSequence V;
        int i7 = this.a;
        Object obj2 = this.b;
        switch (i7) {
            case 0:
                ((bi.b9) obj2).a(Boolean.valueOf(((String) obj) == null));
                break;
            case 1:
                k0 k0Var = (k0) obj;
                ((v10) obj2).a(k0Var, k0Var == null ? "LOCAL_STORAGE_ERROR" : null);
                break;
            case 2:
                String str = (String) obj;
                f2.m("disconnect session", str);
                ((c20) obj2).a(str);
                break;
            case 3:
                String str2 = (String) obj;
                f2.m("approve session", str2);
                ((t60) obj2).a(str2);
                break;
            case 4:
                org.telegram.messenger.g0.h3(new n(19, (c8) obj2, (TLRPC.UserFull) obj));
                break;
            default:
                f8 f8Var = (f8) obj2;
                f8Var.getClass();
                int i10 = ((Integer) obj).intValue() == 0 ? 12 : 24;
                if (f8Var.a != i10) {
                    f8Var.a = i10;
                    f8Var.b0(f8Var.getParentActivity());
                    f8Var.d0();
                    w70 w70Var = f8Var.h;
                    byte[] bArr = f8Var.s;
                    Integer valueOf = Integer.valueOf(i10);
                    Object[] objArr = new Object[1];
                    if (bArr != null) {
                        objArr[0] = valueOf;
                        V = hd.V(null, null, 2131743094, objArr);
                    } else {
                        objArr[0] = valueOf;
                        V = hd.V(null, null, 2131743092, objArr);
                    }
                    w70Var.setText(V);
                    break;
                }
                break;
        }
    }
}
