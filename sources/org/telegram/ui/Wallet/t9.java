package org.telegram.ui.Wallet;

import org.telegram.messenger.r10;
import org.telegram.messenger.w10;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes4.dex */
public final /* synthetic */ class t9 implements r10 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ea b;
    public final /* synthetic */ v0 c;
    public final /* synthetic */ long d;

    public /* synthetic */ t9(ea eaVar, v0 v0Var, long j3, int i7) {
        this.a = i7;
        this.b = eaVar;
        this.c = v0Var;
        this.d = j3;
    }

    @Override // org.telegram.messenger.r10
    public final void a(Object obj, Object obj2, Object obj3) {
        switch (this.a) {
            case 0:
                String str = (String) obj;
                final w10 w10Var = (w10) obj3;
                final ea eaVar = this.b;
                final int i7 = 0;
                this.c.m0(eaVar.f, eaVar.h, this.d, str, ((Boolean) obj2).booleanValue() ? eaVar.r0() : null, null, eaVar.n, new w10() { // from class: org.telegram.ui.Wallet.w9
                    @Override // org.telegram.messenger.w10
                    public final void a(Object obj4) {
                        String str2 = (String) obj4;
                        switch (i7) {
                            case 0:
                                w10Var.a(str2);
                                if (!v0.L(str2) && str2 == null) {
                                    ea eaVar2 = eaVar;
                                    eaVar2.fragmentView.postDelayed(new o9(eaVar2, 4), 220L);
                                    break;
                                }
                                break;
                            default:
                                w10Var.a(str2);
                                if (!v0.L(str2) && str2 == null) {
                                    ea eaVar3 = eaVar;
                                    eaVar3.fragmentView.postDelayed(new o9(eaVar3, 4), 220L);
                                    break;
                                }
                                break;
                        }
                    }
                }, new s9(eaVar, 2));
                break;
            default:
                String str2 = (String) obj;
                final w10 w10Var2 = (w10) obj3;
                final ea eaVar2 = this.b;
                final int i10 = 1;
                this.c.m0(eaVar2.f, eaVar2.h, this.d, str2, ((Boolean) obj2).booleanValue() ? eaVar2.r0() : null, null, eaVar2.n, new w10() { // from class: org.telegram.ui.Wallet.w9
                    @Override // org.telegram.messenger.w10
                    public final void a(Object obj4) {
                        String str22 = (String) obj4;
                        switch (i10) {
                            case 0:
                                w10Var2.a(str22);
                                if (!v0.L(str22) && str22 == null) {
                                    ea eaVar22 = eaVar2;
                                    eaVar22.fragmentView.postDelayed(new o9(eaVar22, 4), 220L);
                                    break;
                                }
                                break;
                            default:
                                w10Var2.a(str22);
                                if (!v0.L(str22) && str22 == null) {
                                    ea eaVar3 = eaVar2;
                                    eaVar3.fragmentView.postDelayed(new o9(eaVar3, 4), 220L);
                                    break;
                                }
                                break;
                        }
                    }
                }, new s9(eaVar2, 3));
                break;
        }
    }
}
