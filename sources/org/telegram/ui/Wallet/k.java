package org.telegram.ui.Wallet;

import org.telegram.messenger.gd;
import org.telegram.messenger.w10;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.j80;
import org.telegram.ui.t60;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes4.dex */
public final /* synthetic */ class k implements w10 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ k(Object obj, int i7) {
        this.a = i7;
        this.b = obj;
    }

    @Override // org.telegram.messenger.w10
    public final void a(Object obj) {
        CharSequence V;
        int i7 = this.a;
        Object obj2 = this.b;
        switch (i7) {
            case 0:
                ((ai.o2) obj2).a(Boolean.valueOf(((String) obj) == null));
                break;
            case 1:
                String str = (String) obj;
                m2.m("disconnect session", str);
                ((w10) obj2).a(str);
                break;
            case 2:
                String str2 = (String) obj;
                m2.m("approve session", str2);
                ((t60) obj2).a(str2);
                break;
            case 3:
                org.telegram.messenger.g0.g3(new r(13, (s8) obj2, (TLRPC.UserFull) obj));
                break;
            default:
                v8 v8Var = (v8) obj2;
                v8Var.getClass();
                int i10 = ((Integer) obj).intValue() == 0 ? 12 : 24;
                if (v8Var.a != i10) {
                    v8Var.a = i10;
                    v8Var.b0(v8Var.getParentActivity());
                    v8Var.d0();
                    j80 j80Var = v8Var.h;
                    byte[] bArr = v8Var.s;
                    Integer valueOf = Integer.valueOf(i10);
                    Object[] objArr = new Object[1];
                    if (bArr != null) {
                        objArr[0] = valueOf;
                        V = gd.V(null, null, 2131742841, objArr);
                    } else {
                        objArr[0] = valueOf;
                        V = gd.V(null, null, 2131742839, objArr);
                    }
                    j80Var.setText(V);
                    break;
                }
                break;
        }
    }
}
