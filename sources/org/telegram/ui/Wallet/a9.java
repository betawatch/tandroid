package org.telegram.ui.Wallet;

import org.telegram.messenger.c20;
import org.telegram.messenger.x10;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes4.dex */
public final /* synthetic */ class a9 implements x10 {
    public final /* synthetic */ int a;
    public final /* synthetic */ l9 b;
    public final /* synthetic */ l0 c;
    public final /* synthetic */ long d;

    public /* synthetic */ a9(l9 l9Var, l0 l0Var, long j3, int i7) {
        this.a = i7;
        this.b = l9Var;
        this.c = l0Var;
        this.d = j3;
    }

    @Override // org.telegram.messenger.x10
    public final void a(Object obj, Object obj2, Object obj3) {
        switch (this.a) {
            case 0:
                String str = (String) obj;
                final c20 c20Var = (c20) obj3;
                final l9 l9Var = this.b;
                final int i7 = 0;
                this.c.d0(l9Var.f, l9Var.h, this.d, str, ((Boolean) obj2).booleanValue() ? l9Var.r0() : null, null, l9Var.n, new c20() { // from class: org.telegram.ui.Wallet.d9
                    @Override // org.telegram.messenger.c20
                    public final void a(Object obj4) {
                        String str2 = (String) obj4;
                        switch (i7) {
                            case 0:
                                if (!"PASSCODE_FAILED".equalsIgnoreCase(str2)) {
                                    c20Var.a(str2);
                                    if (str2 == null) {
                                        l9 l9Var2 = l9Var;
                                        l9Var2.fragmentView.postDelayed(new v8(l9Var2, 4), 220L);
                                        break;
                                    }
                                }
                                break;
                            default:
                                if (!"PASSCODE_FAILED".equalsIgnoreCase(str2)) {
                                    c20Var.a(str2);
                                    if (str2 == null) {
                                        l9 l9Var3 = l9Var;
                                        l9Var3.fragmentView.postDelayed(new v8(l9Var3, 4), 220L);
                                        break;
                                    }
                                }
                                break;
                        }
                    }
                }, new z8(l9Var, 2), null);
                break;
            default:
                String str2 = (String) obj;
                final c20 c20Var2 = (c20) obj3;
                final l9 l9Var2 = this.b;
                final int i10 = 1;
                this.c.d0(l9Var2.f, l9Var2.h, this.d, str2, ((Boolean) obj2).booleanValue() ? l9Var2.r0() : null, null, l9Var2.n, new c20() { // from class: org.telegram.ui.Wallet.d9
                    @Override // org.telegram.messenger.c20
                    public final void a(Object obj4) {
                        String str22 = (String) obj4;
                        switch (i10) {
                            case 0:
                                if (!"PASSCODE_FAILED".equalsIgnoreCase(str22)) {
                                    c20Var2.a(str22);
                                    if (str22 == null) {
                                        l9 l9Var22 = l9Var2;
                                        l9Var22.fragmentView.postDelayed(new v8(l9Var22, 4), 220L);
                                        break;
                                    }
                                }
                                break;
                            default:
                                if (!"PASSCODE_FAILED".equalsIgnoreCase(str22)) {
                                    c20Var2.a(str22);
                                    if (str22 == null) {
                                        l9 l9Var3 = l9Var2;
                                        l9Var3.fragmentView.postDelayed(new v8(l9Var3, 4), 220L);
                                        break;
                                    }
                                }
                                break;
                        }
                    }
                }, new z8(l9Var2, 3), null);
                break;
        }
    }
}
