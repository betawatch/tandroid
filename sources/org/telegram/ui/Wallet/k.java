package org.telegram.ui.Wallet;

import org.telegram.messenger.c20;
import org.telegram.messenger.id;
import org.telegram.messenger.v10;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.x70;
import org.telegram.ui.v60;
import org.telegram.ui.wb1;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
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
                i0 i0Var = (i0) obj;
                ((v10) obj2).a(i0Var, i0Var == null ? "LOCAL_STORAGE_ERROR" : null);
                break;
            case 2:
                String str = (String) obj;
                d2.m("disconnect session", str);
                ((c20) obj2).a(str);
                break;
            case 3:
                String str2 = (String) obj;
                d2.m("approve session", str2);
                ((v60) obj2).a(str2);
                break;
            case 4:
                org.telegram.messenger.g0.h3(new wb1(20, (a8) obj2, (TLRPC.UserFull) obj));
                break;
            default:
                d8 d8Var = (d8) obj2;
                d8Var.getClass();
                int i10 = ((Integer) obj).intValue() == 0 ? 12 : 24;
                if (d8Var.a != i10) {
                    d8Var.a = i10;
                    d8Var.b0(d8Var.getParentActivity());
                    d8Var.d0();
                    x70 x70Var = d8Var.h;
                    byte[] bArr = d8Var.s;
                    Integer valueOf = Integer.valueOf(i10);
                    Object[] objArr = new Object[1];
                    if (bArr != null) {
                        objArr[0] = valueOf;
                        V = id.V(null, null, 2131743093, objArr);
                    } else {
                        objArr[0] = valueOf;
                        V = id.V(null, null, 2131743091, objArr);
                    }
                    x70Var.setText(V);
                    break;
                }
                break;
        }
    }
}
