package org.telegram.ui.Wallet;

import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes4.dex */
public final /* synthetic */ class w7 implements Utilities.Callback3 {
    public final /* synthetic */ int a;
    public final /* synthetic */ j8 b;
    public final /* synthetic */ k0 c;
    public final /* synthetic */ long d;

    public /* synthetic */ w7(j8 j8Var, k0 k0Var, long j3, int i10) {
        this.a = i10;
        this.b = j8Var;
        this.c = k0Var;
        this.d = j3;
    }

    @Override // org.telegram.messenger.Utilities.Callback3
    public final void run(Object obj, Object obj2, Object obj3) {
        switch (this.a) {
            case 0:
                String str = (String) obj;
                final Utilities.Callback callback = (Utilities.Callback) obj3;
                final j8 j8Var = this.b;
                final int i10 = 0;
                this.c.Z(j8Var.e, j8Var.f, this.d, str, ((Boolean) obj2).booleanValue() ? j8Var.l0() : null, null, j8Var.h, new Utilities.Callback() { // from class: org.telegram.ui.Wallet.z7
                    @Override // org.telegram.messenger.Utilities.Callback
                    public final void run(Object obj4) {
                        String str2 = (String) obj4;
                        switch (i10) {
                            case 0:
                                if (!"PASSCODE_FAILED".equalsIgnoreCase(str2)) {
                                    callback.run(str2);
                                    if (str2 == null) {
                                        j8 j8Var2 = j8Var;
                                        j8Var2.fragmentView.postDelayed(new t7(j8Var2, 3), 220L);
                                        break;
                                    }
                                }
                                break;
                            default:
                                if (!"PASSCODE_FAILED".equalsIgnoreCase(str2)) {
                                    callback.run(str2);
                                    if (str2 == null) {
                                        j8 j8Var3 = j8Var;
                                        j8Var3.fragmentView.postDelayed(new t7(j8Var3, 3), 220L);
                                        break;
                                    }
                                }
                                break;
                        }
                    }
                }, new v7(j8Var, 2));
                break;
            default:
                String str2 = (String) obj;
                final Utilities.Callback callback2 = (Utilities.Callback) obj3;
                final j8 j8Var2 = this.b;
                final int i11 = 1;
                this.c.Z(j8Var2.e, j8Var2.f, this.d, str2, ((Boolean) obj2).booleanValue() ? j8Var2.l0() : null, null, j8Var2.h, new Utilities.Callback() { // from class: org.telegram.ui.Wallet.z7
                    @Override // org.telegram.messenger.Utilities.Callback
                    public final void run(Object obj4) {
                        String str22 = (String) obj4;
                        switch (i11) {
                            case 0:
                                if (!"PASSCODE_FAILED".equalsIgnoreCase(str22)) {
                                    callback2.run(str22);
                                    if (str22 == null) {
                                        j8 j8Var22 = j8Var2;
                                        j8Var22.fragmentView.postDelayed(new t7(j8Var22, 3), 220L);
                                        break;
                                    }
                                }
                                break;
                            default:
                                if (!"PASSCODE_FAILED".equalsIgnoreCase(str22)) {
                                    callback2.run(str22);
                                    if (str22 == null) {
                                        j8 j8Var3 = j8Var2;
                                        j8Var3.fragmentView.postDelayed(new t7(j8Var3, 3), 220L);
                                        break;
                                    }
                                }
                                break;
                        }
                    }
                }, new v7(j8Var2, 3));
                break;
        }
    }
}
