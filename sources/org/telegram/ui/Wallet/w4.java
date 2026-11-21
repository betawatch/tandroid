package org.telegram.ui.Wallet;

import android.view.View;
import java.util.Locale;
import org.telegram.messenger.x10;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.h51;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes4.dex */
public final /* synthetic */ class w4 implements x10 {
    public final /* synthetic */ int a;
    public final /* synthetic */ n6 b;

    public /* synthetic */ w4(n6 n6Var, int i7) {
        this.a = i7;
        this.b = n6Var;
    }

    @Override // org.telegram.messenger.x10
    public final void a(Object obj) {
        switch (this.a) {
            case 0:
                Boolean bool = (Boolean) obj;
                n6 n6Var = this.b;
                n6Var.E0.setClickable(!bool.booleanValue());
                n6Var.F0.setClickable(!bool.booleanValue());
                if (bool.booleanValue()) {
                    n6Var.f0 = 1;
                    n6Var.s0.setPosition(1);
                    n6Var.s0.post(new q4(n6Var, 3));
                    break;
                }
                break;
            case 1:
                String lowerCase = ((String) obj).trim().toLowerCase(Locale.ROOT);
                n6 n6Var2 = this.b;
                n6Var2.l0 = lowerCase;
                h51[] h51VarArr = n6Var2.u0;
                h51 h51Var = h51VarArr[1];
                if (h51Var != null) {
                    n6.d1(h51Var, true);
                    h51VarArr[1].v0(0);
                    h51VarArr[1].post(new q4(n6Var2, 3));
                    break;
                }
                break;
            case 2:
                float floatValue = ((Float) obj).floatValue();
                n6 n6Var3 = this.b;
                if (n6Var3.D0 != floatValue) {
                    n6Var3.D0 = floatValue;
                    float B = org.telegram.ui.Cells.c0.B(floatValue, 0.6f, 1.0f, 0.0f);
                    for (int i7 = 0; i7 < n6Var3.C0.getChildCount(); i7++) {
                        View childAt = n6Var3.C0.getChildAt(i7);
                        childAt.setAlpha(B);
                        childAt.setPivotY(0.0f);
                        childAt.setScaleY(1.0f - floatValue);
                    }
                    n6Var3.C0.setImportantForAccessibility(floatValue != 0.0f ? 4 : 0);
                    n6Var3.C0.requestLayout();
                    break;
                }
                break;
            case 3:
                n6.k0(this.b, (String) obj);
                break;
            default:
                TLRPC.User user = (TLRPC.User) obj;
                n6 n6Var4 = this.b;
                if (!n6Var4.isFinished) {
                    if (user == null) {
                        org.telegram.messenger.g0.g3(new q4(n6Var4, 9));
                        break;
                    } else {
                        n6Var4.presentFragment(new da(user));
                        break;
                    }
                }
                break;
        }
    }
}
