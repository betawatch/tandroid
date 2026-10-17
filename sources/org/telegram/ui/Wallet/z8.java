package org.telegram.ui.Wallet;

import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-189a3a12219b7c214453a48fa9697387dfb8b2ca31ce3a2eba70ff5e2610a248 */
/* loaded from: classes4.dex */
public final /* synthetic */ class z8 implements Utilities.Callback3 {
    public final /* synthetic */ int a;
    public final /* synthetic */ l9 b;
    public final /* synthetic */ m0 c;
    public final /* synthetic */ long d;

    public /* synthetic */ z8(l9 l9Var, m0 m0Var, long j10, int i10) {
        this.a = i10;
        this.b = l9Var;
        this.c = m0Var;
        this.d = j10;
    }

    @Override // org.telegram.messenger.Utilities.Callback3
    public final void run(Object obj, Object obj2, Object obj3) {
        switch (this.a) {
            case 0:
                String str = (String) obj;
                final Utilities.Callback callback = (Utilities.Callback) obj3;
                final l9 l9Var = this.b;
                final int i10 = 0;
                this.c.b0(l9Var.e, l9Var.f, this.d, str, ((Boolean) obj2).booleanValue() ? l9Var.l0() : null, null, l9Var.h, new Utilities.Callback() { // from class: org.telegram.ui.Wallet.c9
                    @Override // org.telegram.messenger.Utilities.Callback
                    public final void run(Object obj4) {
                        String str2 = (String) obj4;
                        switch (i10) {
                            case 0:
                                if (!"PASSCODE_FAILED".equalsIgnoreCase(str2)) {
                                    callback.run(str2);
                                    if (str2 == null) {
                                        l9 l9Var2 = l9Var;
                                        l9Var2.fragmentView.postDelayed(new u8(l9Var2, 4), 220L);
                                        break;
                                    }
                                }
                                break;
                            default:
                                if (!"PASSCODE_FAILED".equalsIgnoreCase(str2)) {
                                    callback.run(str2);
                                    if (str2 == null) {
                                        l9 l9Var3 = l9Var;
                                        l9Var3.fragmentView.postDelayed(new u8(l9Var3, 4), 220L);
                                        break;
                                    }
                                }
                                break;
                        }
                    }
                }, new y8(l9Var, 2), null);
                break;
            default:
                String str2 = (String) obj;
                final Utilities.Callback callback2 = (Utilities.Callback) obj3;
                final l9 l9Var2 = this.b;
                final int i11 = 1;
                this.c.b0(l9Var2.e, l9Var2.f, this.d, str2, ((Boolean) obj2).booleanValue() ? l9Var2.l0() : null, null, l9Var2.h, new Utilities.Callback() { // from class: org.telegram.ui.Wallet.c9
                    @Override // org.telegram.messenger.Utilities.Callback
                    public final void run(Object obj4) {
                        String str22 = (String) obj4;
                        switch (i11) {
                            case 0:
                                if (!"PASSCODE_FAILED".equalsIgnoreCase(str22)) {
                                    callback2.run(str22);
                                    if (str22 == null) {
                                        l9 l9Var22 = l9Var2;
                                        l9Var22.fragmentView.postDelayed(new u8(l9Var22, 4), 220L);
                                        break;
                                    }
                                }
                                break;
                            default:
                                if (!"PASSCODE_FAILED".equalsIgnoreCase(str22)) {
                                    callback2.run(str22);
                                    if (str22 == null) {
                                        l9 l9Var3 = l9Var2;
                                        l9Var3.fragmentView.postDelayed(new u8(l9Var3, 4), 220L);
                                        break;
                                    }
                                }
                                break;
                        }
                    }
                }, new y8(l9Var2, 3), null);
                break;
        }
    }
}
