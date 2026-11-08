package org.telegram.ui.Wallet;

import org.telegram.messenger.c20;
import org.telegram.messenger.x10;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes4.dex */
public final /* synthetic */ class b9 implements x10 {
    public final /* synthetic */ int a;
    public final /* synthetic */ m9 b;
    public final /* synthetic */ m0 c;
    public final /* synthetic */ long d;

    public /* synthetic */ b9(m9 m9Var, m0 m0Var, long j3, int i7) {
        this.a = i7;
        this.b = m9Var;
        this.c = m0Var;
        this.d = j3;
    }

    @Override // org.telegram.messenger.x10
    public final void a(Object obj, Object obj2, Object obj3) {
        switch (this.a) {
            case 0:
                String str = (String) obj;
                final c20 c20Var = (c20) obj3;
                final m9 m9Var = this.b;
                final int i7 = 0;
                this.c.d0(m9Var.f, m9Var.h, this.d, str, ((Boolean) obj2).booleanValue() ? m9Var.r0() : null, null, m9Var.n, new c20() { // from class: org.telegram.ui.Wallet.e9
                    @Override // org.telegram.messenger.c20
                    public final void a(Object obj4) {
                        String str2 = (String) obj4;
                        switch (i7) {
                            case 0:
                                if (!"PASSCODE_FAILED".equalsIgnoreCase(str2)) {
                                    c20Var.a(str2);
                                    if (str2 == null) {
                                        m9 m9Var2 = m9Var;
                                        m9Var2.fragmentView.postDelayed(new w8(m9Var2, 4), 220L);
                                        break;
                                    }
                                }
                                break;
                            default:
                                if (!"PASSCODE_FAILED".equalsIgnoreCase(str2)) {
                                    c20Var.a(str2);
                                    if (str2 == null) {
                                        m9 m9Var3 = m9Var;
                                        m9Var3.fragmentView.postDelayed(new w8(m9Var3, 4), 220L);
                                        break;
                                    }
                                }
                                break;
                        }
                    }
                }, new a9(m9Var, 2), null);
                break;
            default:
                String str2 = (String) obj;
                final c20 c20Var2 = (c20) obj3;
                final m9 m9Var2 = this.b;
                final int i10 = 1;
                this.c.d0(m9Var2.f, m9Var2.h, this.d, str2, ((Boolean) obj2).booleanValue() ? m9Var2.r0() : null, null, m9Var2.n, new c20() { // from class: org.telegram.ui.Wallet.e9
                    @Override // org.telegram.messenger.c20
                    public final void a(Object obj4) {
                        String str22 = (String) obj4;
                        switch (i10) {
                            case 0:
                                if (!"PASSCODE_FAILED".equalsIgnoreCase(str22)) {
                                    c20Var2.a(str22);
                                    if (str22 == null) {
                                        m9 m9Var22 = m9Var2;
                                        m9Var22.fragmentView.postDelayed(new w8(m9Var22, 4), 220L);
                                        break;
                                    }
                                }
                                break;
                            default:
                                if (!"PASSCODE_FAILED".equalsIgnoreCase(str22)) {
                                    c20Var2.a(str22);
                                    if (str22 == null) {
                                        m9 m9Var3 = m9Var2;
                                        m9Var3.fragmentView.postDelayed(new w8(m9Var3, 4), 220L);
                                        break;
                                    }
                                }
                                break;
                        }
                    }
                }, new a9(m9Var2, 3), null);
                break;
        }
    }
}
