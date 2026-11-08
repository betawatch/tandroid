package org.telegram.ui.Wallet;

import android.view.View;
import java.util.Locale;
import org.telegram.messenger.c20;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.q41;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes4.dex */
public final /* synthetic */ class l4 implements c20 {
    public final /* synthetic */ int a;
    public final /* synthetic */ x5 b;

    public /* synthetic */ l4(x5 x5Var, int i7) {
        this.a = i7;
        this.b = x5Var;
    }

    @Override // org.telegram.messenger.c20
    public final void a(Object obj) {
        switch (this.a) {
            case 0:
                Boolean bool = (Boolean) obj;
                x5 x5Var = this.b;
                x5Var.B0.setClickable(!bool.booleanValue());
                x5Var.C0.setClickable(!bool.booleanValue());
                if (bool.booleanValue()) {
                    x5Var.e0 = 1;
                    x5Var.p0.setPosition(1);
                    x5Var.p0.post(new e4(x5Var, 6));
                    break;
                }
                break;
            case 1:
                String lowerCase = ((String) obj).trim().toLowerCase(Locale.ROOT);
                x5 x5Var2 = this.b;
                x5Var2.k0 = lowerCase;
                q41[] q41VarArr = x5Var2.r0;
                q41 q41Var = q41VarArr[1];
                if (q41Var != null) {
                    x5.Y0(q41Var, true);
                    q41VarArr[1].v0(0);
                    q41VarArr[1].post(new e4(x5Var2, 6));
                    break;
                }
                break;
            case 2:
                float floatValue = ((Float) obj).floatValue();
                x5 x5Var3 = this.b;
                if (x5Var3.A0 != floatValue) {
                    x5Var3.A0 = floatValue;
                    float v = org.telegram.ui.Cells.f1.v(floatValue, 0.6f, 1.0f, 0.0f);
                    for (int i7 = 0; i7 < x5Var3.z0.getChildCount(); i7++) {
                        View childAt = x5Var3.z0.getChildAt(i7);
                        childAt.setAlpha(v);
                        childAt.setPivotY(0.0f);
                        childAt.setScaleY(1.0f - floatValue);
                    }
                    x5Var3.z0.setImportantForAccessibility(floatValue != 0.0f ? 4 : 0);
                    x5Var3.z0.requestLayout();
                    break;
                }
                break;
            case 3:
                x5.j0(this.b, (String) obj);
                break;
            default:
                TLRPC.User user = (TLRPC.User) obj;
                x5 x5Var4 = this.b;
                if (!x5Var4.isFinished) {
                    if (user == null) {
                        org.telegram.messenger.g0.h3(new e4(x5Var4, 11));
                        break;
                    } else {
                        x5Var4.presentFragment(new m9(user));
                        break;
                    }
                }
                break;
        }
    }
}
