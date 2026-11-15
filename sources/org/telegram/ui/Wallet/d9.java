package org.telegram.ui.Wallet;

import org.telegram.messenger.u10;
import org.telegram.messenger.z10;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes4.dex */
public final /* synthetic */ class d9 implements u10 {
    public final /* synthetic */ int a;
    public final /* synthetic */ p9 b;
    public final /* synthetic */ l0 c;
    public final /* synthetic */ long d;

    public /* synthetic */ d9(p9 p9Var, l0 l0Var, long j3, int i7) {
        this.a = i7;
        this.b = p9Var;
        this.c = l0Var;
        this.d = j3;
    }

    @Override // org.telegram.messenger.u10
    public final void a(Object obj, Object obj2, Object obj3) {
        switch (this.a) {
            case 0:
                String str = (String) obj;
                final z10 z10Var = (z10) obj3;
                final p9 p9Var = this.b;
                final int i7 = 0;
                this.c.d0(p9Var.f, p9Var.h, this.d, str, ((Boolean) obj2).booleanValue() ? p9Var.r0() : null, null, p9Var.n, new z10() { // from class: org.telegram.ui.Wallet.g9
                    @Override // org.telegram.messenger.z10
                    public final void a(Object obj4) {
                        String str2 = (String) obj4;
                        switch (i7) {
                            case 0:
                                if (!"PASSCODE_FAILED".equalsIgnoreCase(str2)) {
                                    z10Var.a(str2);
                                    if (str2 == null) {
                                        p9 p9Var2 = p9Var;
                                        p9Var2.fragmentView.postDelayed(new y8(p9Var2, 4), 220L);
                                        break;
                                    }
                                }
                                break;
                            default:
                                if (!"PASSCODE_FAILED".equalsIgnoreCase(str2)) {
                                    z10Var.a(str2);
                                    if (str2 == null) {
                                        p9 p9Var3 = p9Var;
                                        p9Var3.fragmentView.postDelayed(new y8(p9Var3, 4), 220L);
                                        break;
                                    }
                                }
                                break;
                        }
                    }
                }, new c9(p9Var, 2), null);
                break;
            default:
                String str2 = (String) obj;
                final z10 z10Var2 = (z10) obj3;
                final p9 p9Var2 = this.b;
                final int i10 = 1;
                this.c.d0(p9Var2.f, p9Var2.h, this.d, str2, ((Boolean) obj2).booleanValue() ? p9Var2.r0() : null, null, p9Var2.n, new z10() { // from class: org.telegram.ui.Wallet.g9
                    @Override // org.telegram.messenger.z10
                    public final void a(Object obj4) {
                        String str22 = (String) obj4;
                        switch (i10) {
                            case 0:
                                if (!"PASSCODE_FAILED".equalsIgnoreCase(str22)) {
                                    z10Var2.a(str22);
                                    if (str22 == null) {
                                        p9 p9Var22 = p9Var2;
                                        p9Var22.fragmentView.postDelayed(new y8(p9Var22, 4), 220L);
                                        break;
                                    }
                                }
                                break;
                            default:
                                if (!"PASSCODE_FAILED".equalsIgnoreCase(str22)) {
                                    z10Var2.a(str22);
                                    if (str22 == null) {
                                        p9 p9Var3 = p9Var2;
                                        p9Var3.fragmentView.postDelayed(new y8(p9Var3, 4), 220L);
                                        break;
                                    }
                                }
                                break;
                        }
                    }
                }, new c9(p9Var2, 3), null);
                break;
        }
    }
}
