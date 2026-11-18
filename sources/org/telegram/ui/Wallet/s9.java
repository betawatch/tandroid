package org.telegram.ui.Wallet;

import org.telegram.messenger.s10;
import org.telegram.messenger.x10;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes4.dex */
public final /* synthetic */ class s9 implements s10 {
    public final /* synthetic */ int a;
    public final /* synthetic */ da b;
    public final /* synthetic */ u0 c;
    public final /* synthetic */ long d;

    public /* synthetic */ s9(da daVar, u0 u0Var, long j3, int i7) {
        this.a = i7;
        this.b = daVar;
        this.c = u0Var;
        this.d = j3;
    }

    @Override // org.telegram.messenger.s10
    public final void a(Object obj, Object obj2, Object obj3) {
        switch (this.a) {
            case 0:
                String str = (String) obj;
                final x10 x10Var = (x10) obj3;
                final da daVar = this.b;
                final int i7 = 0;
                this.c.m0(daVar.f, daVar.h, this.d, str, ((Boolean) obj2).booleanValue() ? daVar.r0() : null, null, daVar.n, new x10() { // from class: org.telegram.ui.Wallet.v9
                    @Override // org.telegram.messenger.x10
                    public final void a(Object obj4) {
                        String str2 = (String) obj4;
                        switch (i7) {
                            case 0:
                                x10Var.a(str2);
                                if (!u0.L(str2) && str2 == null) {
                                    da daVar2 = daVar;
                                    daVar2.fragmentView.postDelayed(new n9(daVar2, 4), 220L);
                                    break;
                                }
                                break;
                            default:
                                x10Var.a(str2);
                                if (!u0.L(str2) && str2 == null) {
                                    da daVar3 = daVar;
                                    daVar3.fragmentView.postDelayed(new n9(daVar3, 4), 220L);
                                    break;
                                }
                                break;
                        }
                    }
                }, new r9(daVar, 2));
                break;
            default:
                String str2 = (String) obj;
                final x10 x10Var2 = (x10) obj3;
                final da daVar2 = this.b;
                final int i10 = 1;
                this.c.m0(daVar2.f, daVar2.h, this.d, str2, ((Boolean) obj2).booleanValue() ? daVar2.r0() : null, null, daVar2.n, new x10() { // from class: org.telegram.ui.Wallet.v9
                    @Override // org.telegram.messenger.x10
                    public final void a(Object obj4) {
                        String str22 = (String) obj4;
                        switch (i10) {
                            case 0:
                                x10Var2.a(str22);
                                if (!u0.L(str22) && str22 == null) {
                                    da daVar22 = daVar2;
                                    daVar22.fragmentView.postDelayed(new n9(daVar22, 4), 220L);
                                    break;
                                }
                                break;
                            default:
                                x10Var2.a(str22);
                                if (!u0.L(str22) && str22 == null) {
                                    da daVar3 = daVar2;
                                    daVar3.fragmentView.postDelayed(new n9(daVar3, 4), 220L);
                                    break;
                                }
                                break;
                        }
                    }
                }, new r9(daVar2, 3));
                break;
        }
    }
}
