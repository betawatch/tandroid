package org.telegram.ui.Wallet;

import org.telegram.messenger.hd;
import org.telegram.messenger.s10;
import org.telegram.messenger.z10;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.z70;
import org.telegram.ui.r60;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes4.dex */
public final /* synthetic */ class k implements z10 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ k(Object obj, int i7) {
        this.a = i7;
        this.b = obj;
    }

    @Override // org.telegram.messenger.z10
    public final void a(Object obj) {
        CharSequence V;
        int i7 = this.a;
        Object obj2 = this.b;
        switch (i7) {
            case 0:
                ((ai.u2) obj2).a(Boolean.valueOf(((String) obj) == null));
                break;
            case 1:
                i0 i0Var = (i0) obj;
                ((s10) obj2).a(i0Var, i0Var == null ? "LOCAL_STORAGE_ERROR" : null);
                break;
            case 2:
                String str = (String) obj;
                d2.m("disconnect session", str);
                ((z10) obj2).a(str);
                break;
            case 3:
                String str2 = (String) obj;
                d2.m("approve session", str2);
                ((r60) obj2).a(str2);
                break;
            case 4:
                org.telegram.messenger.g0.h3(new r(15, (c8) obj2, (TLRPC.UserFull) obj));
                break;
            default:
                f8 f8Var = (f8) obj2;
                f8Var.getClass();
                int i10 = ((Integer) obj).intValue() == 0 ? 12 : 24;
                if (f8Var.a != i10) {
                    f8Var.a = i10;
                    f8Var.b0(f8Var.getParentActivity());
                    f8Var.d0();
                    z70 z70Var = f8Var.h;
                    byte[] bArr = f8Var.s;
                    Integer valueOf = Integer.valueOf(i10);
                    Object[] objArr = new Object[1];
                    if (bArr != null) {
                        objArr[0] = valueOf;
                        V = hd.V(null, null, 2131743093, objArr);
                    } else {
                        objArr[0] = valueOf;
                        V = hd.V(null, null, 2131743091, objArr);
                    }
                    z70Var.setText(V);
                    break;
                }
                break;
        }
    }
}
