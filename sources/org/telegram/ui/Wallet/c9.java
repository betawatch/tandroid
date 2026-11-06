package org.telegram.ui.Wallet;

import org.telegram.messenger.c20;
import org.telegram.messenger.x10;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes4.dex */
public final /* synthetic */ class c9 implements x10 {
    public final /* synthetic */ int a;
    public final /* synthetic */ n9 b;
    public final /* synthetic */ n0 c;
    public final /* synthetic */ long d;

    public /* synthetic */ c9(n9 n9Var, n0 n0Var, long j3, int i7) {
        this.a = i7;
        this.b = n9Var;
        this.c = n0Var;
        this.d = j3;
    }

    @Override // org.telegram.messenger.x10
    public final void a(Object obj, Object obj2, Object obj3) {
        switch (this.a) {
            case 0:
                String str = (String) obj;
                final c20 c20Var = (c20) obj3;
                final n9 n9Var = this.b;
                final int i7 = 0;
                this.c.d0(n9Var.f, n9Var.h, this.d, str, ((Boolean) obj2).booleanValue() ? n9Var.r0() : null, null, n9Var.n, new c20() { // from class: org.telegram.ui.Wallet.f9
                    @Override // org.telegram.messenger.c20
                    public final void a(Object obj4) {
                        String str2 = (String) obj4;
                        switch (i7) {
                            case 0:
                                if (!"PASSCODE_FAILED".equalsIgnoreCase(str2)) {
                                    c20Var.a(str2);
                                    if (str2 == null) {
                                        n9 n9Var2 = n9Var;
                                        n9Var2.fragmentView.postDelayed(new x8(n9Var2, 4), 220L);
                                        break;
                                    }
                                }
                                break;
                            default:
                                if (!"PASSCODE_FAILED".equalsIgnoreCase(str2)) {
                                    c20Var.a(str2);
                                    if (str2 == null) {
                                        n9 n9Var3 = n9Var;
                                        n9Var3.fragmentView.postDelayed(new x8(n9Var3, 4), 220L);
                                        break;
                                    }
                                }
                                break;
                        }
                    }
                }, new b9(n9Var, 2), null);
                break;
            default:
                String str2 = (String) obj;
                final c20 c20Var2 = (c20) obj3;
                final n9 n9Var2 = this.b;
                final int i10 = 1;
                this.c.d0(n9Var2.f, n9Var2.h, this.d, str2, ((Boolean) obj2).booleanValue() ? n9Var2.r0() : null, null, n9Var2.n, new c20() { // from class: org.telegram.ui.Wallet.f9
                    @Override // org.telegram.messenger.c20
                    public final void a(Object obj4) {
                        String str22 = (String) obj4;
                        switch (i10) {
                            case 0:
                                if (!"PASSCODE_FAILED".equalsIgnoreCase(str22)) {
                                    c20Var2.a(str22);
                                    if (str22 == null) {
                                        n9 n9Var22 = n9Var2;
                                        n9Var22.fragmentView.postDelayed(new x8(n9Var22, 4), 220L);
                                        break;
                                    }
                                }
                                break;
                            default:
                                if (!"PASSCODE_FAILED".equalsIgnoreCase(str22)) {
                                    c20Var2.a(str22);
                                    if (str22 == null) {
                                        n9 n9Var3 = n9Var2;
                                        n9Var3.fragmentView.postDelayed(new x8(n9Var3, 4), 220L);
                                        break;
                                    }
                                }
                                break;
                        }
                    }
                }, new b9(n9Var2, 3), null);
                break;
        }
    }
}
