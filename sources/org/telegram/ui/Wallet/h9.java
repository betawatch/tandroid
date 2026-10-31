package org.telegram.ui.Wallet;

import org.telegram.messenger.l20;
import org.telegram.messenger.q20;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class h9 implements l20 {
    public final /* synthetic */ int a;
    public final /* synthetic */ r9 b;
    public final /* synthetic */ k0 c;
    public final /* synthetic */ long d;

    public /* synthetic */ h9(r9 r9Var, k0 k0Var, long j10, int i10) {
        this.a = i10;
        this.b = r9Var;
        this.c = k0Var;
        this.d = j10;
    }

    @Override // org.telegram.messenger.l20
    public final void a(Object obj, Object obj2, Object obj3) {
        switch (this.a) {
            case 0:
                String str = (String) obj;
                final q20 q20Var = (q20) obj3;
                final r9 r9Var = this.b;
                final int i10 = 0;
                this.c.d0(r9Var.f, r9Var.h, this.d, str, ((Boolean) obj2).booleanValue() ? r9Var.q0() : null, null, r9Var.n, new q20() { // from class: org.telegram.ui.Wallet.k9
                    @Override // org.telegram.messenger.q20
                    public final void a(Object obj4) {
                        String str2 = (String) obj4;
                        switch (i10) {
                            case 0:
                                if (!"PASSCODE_FAILED".equalsIgnoreCase(str2)) {
                                    q20Var.a(str2);
                                    if (str2 == null) {
                                        r9 r9Var2 = r9Var;
                                        r9Var2.fragmentView.postDelayed(new c9(r9Var2, 4), 220L);
                                        break;
                                    }
                                }
                                break;
                            default:
                                if (!"PASSCODE_FAILED".equalsIgnoreCase(str2)) {
                                    q20Var.a(str2);
                                    if (str2 == null) {
                                        r9 r9Var3 = r9Var;
                                        r9Var3.fragmentView.postDelayed(new c9(r9Var3, 4), 220L);
                                        break;
                                    }
                                }
                                break;
                        }
                    }
                }, new g9(r9Var, 2), null);
                break;
            default:
                String str2 = (String) obj;
                final q20 q20Var2 = (q20) obj3;
                final r9 r9Var2 = this.b;
                final int i11 = 1;
                this.c.d0(r9Var2.f, r9Var2.h, this.d, str2, ((Boolean) obj2).booleanValue() ? r9Var2.q0() : null, null, r9Var2.n, new q20() { // from class: org.telegram.ui.Wallet.k9
                    @Override // org.telegram.messenger.q20
                    public final void a(Object obj4) {
                        String str22 = (String) obj4;
                        switch (i11) {
                            case 0:
                                if (!"PASSCODE_FAILED".equalsIgnoreCase(str22)) {
                                    q20Var2.a(str22);
                                    if (str22 == null) {
                                        r9 r9Var22 = r9Var2;
                                        r9Var22.fragmentView.postDelayed(new c9(r9Var22, 4), 220L);
                                        break;
                                    }
                                }
                                break;
                            default:
                                if (!"PASSCODE_FAILED".equalsIgnoreCase(str22)) {
                                    q20Var2.a(str22);
                                    if (str22 == null) {
                                        r9 r9Var3 = r9Var2;
                                        r9Var3.fragmentView.postDelayed(new c9(r9Var3, 4), 220L);
                                        break;
                                    }
                                }
                                break;
                        }
                    }
                }, new g9(r9Var2, 3), null);
                break;
        }
    }
}
