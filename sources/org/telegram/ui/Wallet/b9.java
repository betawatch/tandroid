package org.telegram.ui.Wallet;

import org.telegram.messenger.p10;
import org.telegram.messenger.u10;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final /* synthetic */ class b9 implements p10 {
    public final /* synthetic */ int a;
    public final /* synthetic */ m9 b;
    public final /* synthetic */ k0 c;
    public final /* synthetic */ long d;

    public /* synthetic */ b9(m9 m9Var, k0 k0Var, long j10, int i3) {
        this.a = i3;
        this.b = m9Var;
        this.c = k0Var;
        this.d = j10;
    }

    @Override // org.telegram.messenger.p10
    public final void a(Object obj, Object obj2, Object obj3) {
        switch (this.a) {
            case 0:
                String str = (String) obj;
                final u10 u10Var = (u10) obj3;
                final m9 m9Var = this.b;
                final int i3 = 0;
                this.c.d0(m9Var.f, m9Var.h, this.d, str, ((Boolean) obj2).booleanValue() ? m9Var.r0() : null, null, m9Var.n, new u10() { // from class: org.telegram.ui.Wallet.e9
                    @Override // org.telegram.messenger.u10
                    public final void a(Object obj4) {
                        String str2 = (String) obj4;
                        switch (i3) {
                            case 0:
                                if (!"PASSCODE_FAILED".equalsIgnoreCase(str2)) {
                                    u10Var.a(str2);
                                    if (str2 == null) {
                                        m9 m9Var2 = m9Var;
                                        m9Var2.fragmentView.postDelayed(new w8(m9Var2, 4), 220L);
                                        break;
                                    }
                                }
                                break;
                            default:
                                if (!"PASSCODE_FAILED".equalsIgnoreCase(str2)) {
                                    u10Var.a(str2);
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
                final u10 u10Var2 = (u10) obj3;
                final m9 m9Var2 = this.b;
                final int i10 = 1;
                this.c.d0(m9Var2.f, m9Var2.h, this.d, str2, ((Boolean) obj2).booleanValue() ? m9Var2.r0() : null, null, m9Var2.n, new u10() { // from class: org.telegram.ui.Wallet.e9
                    @Override // org.telegram.messenger.u10
                    public final void a(Object obj4) {
                        String str22 = (String) obj4;
                        switch (i10) {
                            case 0:
                                if (!"PASSCODE_FAILED".equalsIgnoreCase(str22)) {
                                    u10Var2.a(str22);
                                    if (str22 == null) {
                                        m9 m9Var22 = m9Var2;
                                        m9Var22.fragmentView.postDelayed(new w8(m9Var22, 4), 220L);
                                        break;
                                    }
                                }
                                break;
                            default:
                                if (!"PASSCODE_FAILED".equalsIgnoreCase(str22)) {
                                    u10Var2.a(str22);
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
