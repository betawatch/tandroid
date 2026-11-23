package org.telegram.ui.Wallet;

import org.telegram.messenger.hd;
import org.telegram.messenger.y10;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.m80;
import org.telegram.ui.u60;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes4.dex */
public final /* synthetic */ class k implements y10 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ k(Object obj, int i7) {
        this.a = i7;
        this.b = obj;
    }

    @Override // org.telegram.messenger.y10
    public final void a(Object obj) {
        CharSequence V;
        int i7 = this.a;
        Object obj2 = this.b;
        switch (i7) {
            case 0:
                ((ai.x2) obj2).a(Boolean.valueOf(((String) obj) == null));
                break;
            case 1:
                String str = (String) obj;
                l2.m("disconnect session", str);
                ((y10) obj2).a(str);
                break;
            case 2:
                String str2 = (String) obj;
                l2.m("approve session", str2);
                ((u60) obj2).a(str2);
                break;
            case 3:
                org.telegram.messenger.g0.g3(new u4(9, (r8) obj2, (TLRPC.UserFull) obj));
                break;
            default:
                u8 u8Var = (u8) obj2;
                u8Var.getClass();
                int i10 = ((Integer) obj).intValue() == 0 ? 12 : 24;
                if (u8Var.a != i10) {
                    u8Var.a = i10;
                    u8Var.b0(u8Var.getParentActivity());
                    u8Var.d0();
                    m80 m80Var = u8Var.h;
                    byte[] bArr = u8Var.s;
                    Integer valueOf = Integer.valueOf(i10);
                    Object[] objArr = new Object[1];
                    if (bArr != null) {
                        objArr[0] = valueOf;
                        V = hd.V(null, null, 2131742846, objArr);
                    } else {
                        objArr[0] = valueOf;
                        V = hd.V(null, null, 2131742844, objArr);
                    }
                    m80Var.setText(V);
                    break;
                }
                break;
        }
    }
}
