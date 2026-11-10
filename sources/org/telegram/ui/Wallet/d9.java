package org.telegram.ui.Wallet;

import org.telegram.messenger.c20;
import org.telegram.messenger.x10;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes4.dex */
public final /* synthetic */ class d9 implements x10 {
    public final /* synthetic */ int a;
    public final /* synthetic */ o9 b;
    public final /* synthetic */ l0 c;
    public final /* synthetic */ long d;

    public /* synthetic */ d9(o9 o9Var, l0 l0Var, long j3, int i7) {
        this.a = i7;
        this.b = o9Var;
        this.c = l0Var;
        this.d = j3;
    }

    @Override // org.telegram.messenger.x10
    public final void a(Object obj, Object obj2, Object obj3) {
        switch (this.a) {
            case 0:
                String str = (String) obj;
                final c20 c20Var = (c20) obj3;
                final o9 o9Var = this.b;
                final int i7 = 0;
                this.c.d0(o9Var.f, o9Var.h, this.d, str, ((Boolean) obj2).booleanValue() ? o9Var.r0() : null, null, o9Var.n, new c20() { // from class: org.telegram.ui.Wallet.g9
                    @Override // org.telegram.messenger.c20
                    public final void a(Object obj4) {
                        String str2 = (String) obj4;
                        switch (i7) {
                            case 0:
                                if (!"PASSCODE_FAILED".equalsIgnoreCase(str2)) {
                                    c20Var.a(str2);
                                    if (str2 == null) {
                                        o9 o9Var2 = o9Var;
                                        o9Var2.fragmentView.postDelayed(new y8(o9Var2, 4), 220L);
                                        break;
                                    }
                                }
                                break;
                            default:
                                if (!"PASSCODE_FAILED".equalsIgnoreCase(str2)) {
                                    c20Var.a(str2);
                                    if (str2 == null) {
                                        o9 o9Var3 = o9Var;
                                        o9Var3.fragmentView.postDelayed(new y8(o9Var3, 4), 220L);
                                        break;
                                    }
                                }
                                break;
                        }
                    }
                }, new c9(o9Var, 2), null);
                break;
            default:
                String str2 = (String) obj;
                final c20 c20Var2 = (c20) obj3;
                final o9 o9Var2 = this.b;
                final int i10 = 1;
                this.c.d0(o9Var2.f, o9Var2.h, this.d, str2, ((Boolean) obj2).booleanValue() ? o9Var2.r0() : null, null, o9Var2.n, new c20() { // from class: org.telegram.ui.Wallet.g9
                    @Override // org.telegram.messenger.c20
                    public final void a(Object obj4) {
                        String str22 = (String) obj4;
                        switch (i10) {
                            case 0:
                                if (!"PASSCODE_FAILED".equalsIgnoreCase(str22)) {
                                    c20Var2.a(str22);
                                    if (str22 == null) {
                                        o9 o9Var22 = o9Var2;
                                        o9Var22.fragmentView.postDelayed(new y8(o9Var22, 4), 220L);
                                        break;
                                    }
                                }
                                break;
                            default:
                                if (!"PASSCODE_FAILED".equalsIgnoreCase(str22)) {
                                    c20Var2.a(str22);
                                    if (str22 == null) {
                                        o9 o9Var3 = o9Var2;
                                        o9Var3.fragmentView.postDelayed(new y8(o9Var3, 4), 220L);
                                        break;
                                    }
                                }
                                break;
                        }
                    }
                }, new c9(o9Var2, 3), null);
                break;
        }
    }
}
