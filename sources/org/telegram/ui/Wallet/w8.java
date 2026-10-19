package org.telegram.ui.Wallet;

import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
/* loaded from: classes4.dex */
public final /* synthetic */ class w8 implements Utilities.Callback3 {
    public final /* synthetic */ int a;
    public final /* synthetic */ i9 b;
    public final /* synthetic */ m0 c;
    public final /* synthetic */ long d;

    public /* synthetic */ w8(i9 i9Var, m0 m0Var, long j10, int i10) {
        this.a = i10;
        this.b = i9Var;
        this.c = m0Var;
        this.d = j10;
    }

    @Override // org.telegram.messenger.Utilities.Callback3
    public final void run(Object obj, Object obj2, Object obj3) {
        switch (this.a) {
            case 0:
                String str = (String) obj;
                final Utilities.Callback callback = (Utilities.Callback) obj3;
                final i9 i9Var = this.b;
                final int i10 = 0;
                this.c.b0(i9Var.e, i9Var.f, this.d, str, ((Boolean) obj2).booleanValue() ? i9Var.l0() : null, null, i9Var.h, new Utilities.Callback() { // from class: org.telegram.ui.Wallet.z8
                    @Override // org.telegram.messenger.Utilities.Callback
                    public final void run(Object obj4) {
                        String str2 = (String) obj4;
                        switch (i10) {
                            case 0:
                                if (!"PASSCODE_FAILED".equalsIgnoreCase(str2)) {
                                    callback.run(str2);
                                    if (str2 == null) {
                                        i9 i9Var2 = i9Var;
                                        i9Var2.fragmentView.postDelayed(new r8(i9Var2, 4), 220L);
                                        break;
                                    }
                                }
                                break;
                            default:
                                if (!"PASSCODE_FAILED".equalsIgnoreCase(str2)) {
                                    callback.run(str2);
                                    if (str2 == null) {
                                        i9 i9Var3 = i9Var;
                                        i9Var3.fragmentView.postDelayed(new r8(i9Var3, 4), 220L);
                                        break;
                                    }
                                }
                                break;
                        }
                    }
                }, new v8(i9Var, 2), null);
                break;
            default:
                String str2 = (String) obj;
                final Utilities.Callback callback2 = (Utilities.Callback) obj3;
                final i9 i9Var2 = this.b;
                final int i11 = 1;
                this.c.b0(i9Var2.e, i9Var2.f, this.d, str2, ((Boolean) obj2).booleanValue() ? i9Var2.l0() : null, null, i9Var2.h, new Utilities.Callback() { // from class: org.telegram.ui.Wallet.z8
                    @Override // org.telegram.messenger.Utilities.Callback
                    public final void run(Object obj4) {
                        String str22 = (String) obj4;
                        switch (i11) {
                            case 0:
                                if (!"PASSCODE_FAILED".equalsIgnoreCase(str22)) {
                                    callback2.run(str22);
                                    if (str22 == null) {
                                        i9 i9Var22 = i9Var2;
                                        i9Var22.fragmentView.postDelayed(new r8(i9Var22, 4), 220L);
                                        break;
                                    }
                                }
                                break;
                            default:
                                if (!"PASSCODE_FAILED".equalsIgnoreCase(str22)) {
                                    callback2.run(str22);
                                    if (str22 == null) {
                                        i9 i9Var3 = i9Var2;
                                        i9Var3.fragmentView.postDelayed(new r8(i9Var3, 4), 220L);
                                        break;
                                    }
                                }
                                break;
                        }
                    }
                }, new v8(i9Var2, 3), null);
                break;
        }
    }
}
