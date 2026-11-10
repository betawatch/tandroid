package org.telegram.ui.Wallet;

import org.telegram.messenger.c20;
import org.telegram.messenger.id;
import org.telegram.messenger.v10;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.w70;
import org.telegram.ui.sb1;
import org.telegram.ui.w60;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
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
                ((w60) obj2).a(str2);
                break;
            case 4:
                org.telegram.messenger.g0.h3(new sb1(20, (d8) obj2, (TLRPC.UserFull) obj));
                break;
            default:
                g8 g8Var = (g8) obj2;
                g8Var.getClass();
                int i10 = ((Integer) obj).intValue() == 0 ? 12 : 24;
                if (g8Var.a != i10) {
                    g8Var.a = i10;
                    g8Var.b0(g8Var.getParentActivity());
                    g8Var.d0();
                    w70 w70Var = g8Var.h;
                    byte[] bArr = g8Var.s;
                    Integer valueOf = Integer.valueOf(i10);
                    Object[] objArr = new Object[1];
                    if (bArr != null) {
                        objArr[0] = valueOf;
                        V = id.V(null, null, 2131743093, objArr);
                    } else {
                        objArr[0] = valueOf;
                        V = id.V(null, null, 2131743091, objArr);
                    }
                    w70Var.setText(V);
                    break;
                }
                break;
        }
    }
}
