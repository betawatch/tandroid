package org.telegram.ui.Wallet;

import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes4.dex */
public final /* synthetic */ class v7 implements Utilities.Callback3 {
    public final /* synthetic */ int a;
    public final /* synthetic */ i8 b;
    public final /* synthetic */ j0 c;
    public final /* synthetic */ long d;

    public /* synthetic */ v7(i8 i8Var, j0 j0Var, long j10, int i10) {
        this.a = i10;
        this.b = i8Var;
        this.c = j0Var;
        this.d = j10;
    }

    @Override // org.telegram.messenger.Utilities.Callback3
    public final void run(Object obj, Object obj2, Object obj3) {
        switch (this.a) {
            case 0:
                String str = (String) obj;
                final Utilities.Callback callback = (Utilities.Callback) obj3;
                final i8 i8Var = this.b;
                final int i10 = 0;
                this.c.Z(i8Var.e, i8Var.f, this.d, str, ((Boolean) obj2).booleanValue() ? i8Var.l0() : null, null, i8Var.h, new Utilities.Callback() { // from class: org.telegram.ui.Wallet.y7
                    @Override // org.telegram.messenger.Utilities.Callback
                    public final void run(Object obj4) {
                        String str2 = (String) obj4;
                        switch (i10) {
                            case 0:
                                if (!"PASSCODE_FAILED".equalsIgnoreCase(str2)) {
                                    callback.run(str2);
                                    if (str2 == null) {
                                        i8 i8Var2 = i8Var;
                                        i8Var2.fragmentView.postDelayed(new s7(i8Var2, 3), 220L);
                                        break;
                                    }
                                }
                                break;
                            default:
                                if (!"PASSCODE_FAILED".equalsIgnoreCase(str2)) {
                                    callback.run(str2);
                                    if (str2 == null) {
                                        i8 i8Var3 = i8Var;
                                        i8Var3.fragmentView.postDelayed(new s7(i8Var3, 3), 220L);
                                        break;
                                    }
                                }
                                break;
                        }
                    }
                }, new u7(i8Var, 2));
                break;
            default:
                String str2 = (String) obj;
                final Utilities.Callback callback2 = (Utilities.Callback) obj3;
                final i8 i8Var2 = this.b;
                final int i11 = 1;
                this.c.Z(i8Var2.e, i8Var2.f, this.d, str2, ((Boolean) obj2).booleanValue() ? i8Var2.l0() : null, null, i8Var2.h, new Utilities.Callback() { // from class: org.telegram.ui.Wallet.y7
                    @Override // org.telegram.messenger.Utilities.Callback
                    public final void run(Object obj4) {
                        String str22 = (String) obj4;
                        switch (i11) {
                            case 0:
                                if (!"PASSCODE_FAILED".equalsIgnoreCase(str22)) {
                                    callback2.run(str22);
                                    if (str22 == null) {
                                        i8 i8Var22 = i8Var2;
                                        i8Var22.fragmentView.postDelayed(new s7(i8Var22, 3), 220L);
                                        break;
                                    }
                                }
                                break;
                            default:
                                if (!"PASSCODE_FAILED".equalsIgnoreCase(str22)) {
                                    callback2.run(str22);
                                    if (str22 == null) {
                                        i8 i8Var3 = i8Var2;
                                        i8Var3.fragmentView.postDelayed(new s7(i8Var3, 3), 220L);
                                        break;
                                    }
                                }
                                break;
                        }
                    }
                }, new u7(i8Var2, 3));
                break;
        }
    }
}
