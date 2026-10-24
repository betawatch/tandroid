package org.telegram.ui.Wallet;

import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes4.dex */
public final /* synthetic */ class x8 implements Utilities.Callback3 {
    public final /* synthetic */ int a;
    public final /* synthetic */ j9 b;
    public final /* synthetic */ l0 c;
    public final /* synthetic */ long d;

    public /* synthetic */ x8(j9 j9Var, l0 l0Var, long j10, int i10) {
        this.a = i10;
        this.b = j9Var;
        this.c = l0Var;
        this.d = j10;
    }

    @Override // org.telegram.messenger.Utilities.Callback3
    public final void run(Object obj, Object obj2, Object obj3) {
        switch (this.a) {
            case 0:
                String str = (String) obj;
                final Utilities.Callback callback = (Utilities.Callback) obj3;
                final j9 j9Var = this.b;
                final int i10 = 0;
                this.c.b0(j9Var.e, j9Var.f, this.d, str, ((Boolean) obj2).booleanValue() ? j9Var.m0() : null, null, j9Var.h, new Utilities.Callback() { // from class: org.telegram.ui.Wallet.a9
                    @Override // org.telegram.messenger.Utilities.Callback
                    public final void run(Object obj4) {
                        String str2 = (String) obj4;
                        switch (i10) {
                            case 0:
                                if (!"PASSCODE_FAILED".equalsIgnoreCase(str2)) {
                                    callback.run(str2);
                                    if (str2 == null) {
                                        j9 j9Var2 = j9Var;
                                        j9Var2.fragmentView.postDelayed(new s8(j9Var2, 4), 220L);
                                        break;
                                    }
                                }
                                break;
                            default:
                                if (!"PASSCODE_FAILED".equalsIgnoreCase(str2)) {
                                    callback.run(str2);
                                    if (str2 == null) {
                                        j9 j9Var3 = j9Var;
                                        j9Var3.fragmentView.postDelayed(new s8(j9Var3, 4), 220L);
                                        break;
                                    }
                                }
                                break;
                        }
                    }
                }, new w8(j9Var, 2), null);
                break;
            default:
                String str2 = (String) obj;
                final Utilities.Callback callback2 = (Utilities.Callback) obj3;
                final j9 j9Var2 = this.b;
                final int i11 = 1;
                this.c.b0(j9Var2.e, j9Var2.f, this.d, str2, ((Boolean) obj2).booleanValue() ? j9Var2.m0() : null, null, j9Var2.h, new Utilities.Callback() { // from class: org.telegram.ui.Wallet.a9
                    @Override // org.telegram.messenger.Utilities.Callback
                    public final void run(Object obj4) {
                        String str22 = (String) obj4;
                        switch (i11) {
                            case 0:
                                if (!"PASSCODE_FAILED".equalsIgnoreCase(str22)) {
                                    callback2.run(str22);
                                    if (str22 == null) {
                                        j9 j9Var22 = j9Var2;
                                        j9Var22.fragmentView.postDelayed(new s8(j9Var22, 4), 220L);
                                        break;
                                    }
                                }
                                break;
                            default:
                                if (!"PASSCODE_FAILED".equalsIgnoreCase(str22)) {
                                    callback2.run(str22);
                                    if (str22 == null) {
                                        j9 j9Var3 = j9Var2;
                                        j9Var3.fragmentView.postDelayed(new s8(j9Var3, 4), 220L);
                                        break;
                                    }
                                }
                                break;
                        }
                    }
                }, new w8(j9Var2, 3), null);
                break;
        }
    }
}
