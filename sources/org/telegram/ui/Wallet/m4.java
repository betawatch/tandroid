package org.telegram.ui.Wallet;

import android.view.View;
import java.util.Locale;
import org.telegram.messenger.c20;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.k41;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes4.dex */
public final /* synthetic */ class m4 implements c20 {
    public final /* synthetic */ int a;
    public final /* synthetic */ y5 b;

    public /* synthetic */ m4(y5 y5Var, int i7) {
        this.a = i7;
        this.b = y5Var;
    }

    @Override // org.telegram.messenger.c20
    public final void a(Object obj) {
        switch (this.a) {
            case 0:
                Boolean bool = (Boolean) obj;
                y5 y5Var = this.b;
                y5Var.B0.setClickable(!bool.booleanValue());
                y5Var.C0.setClickable(!bool.booleanValue());
                if (bool.booleanValue()) {
                    y5Var.e0 = 1;
                    y5Var.p0.setPosition(1);
                    y5Var.p0.post(new f4(y5Var, 6));
                    break;
                }
                break;
            case 1:
                String lowerCase = ((String) obj).trim().toLowerCase(Locale.ROOT);
                y5 y5Var2 = this.b;
                y5Var2.k0 = lowerCase;
                k41[] k41VarArr = y5Var2.r0;
                k41 k41Var = k41VarArr[1];
                if (k41Var != null) {
                    y5.Y0(k41Var, true);
                    k41VarArr[1].v0(0);
                    k41VarArr[1].post(new f4(y5Var2, 6));
                    break;
                }
                break;
            case 2:
                float floatValue = ((Float) obj).floatValue();
                y5 y5Var3 = this.b;
                if (y5Var3.A0 != floatValue) {
                    y5Var3.A0 = floatValue;
                    float v = org.telegram.ui.Cells.f1.v(floatValue, 0.6f, 1.0f, 0.0f);
                    for (int i7 = 0; i7 < y5Var3.z0.getChildCount(); i7++) {
                        View childAt = y5Var3.z0.getChildAt(i7);
                        childAt.setAlpha(v);
                        childAt.setPivotY(0.0f);
                        childAt.setScaleY(1.0f - floatValue);
                    }
                    y5Var3.z0.setImportantForAccessibility(floatValue != 0.0f ? 4 : 0);
                    y5Var3.z0.requestLayout();
                    break;
                }
                break;
            case 3:
                y5.j0(this.b, (String) obj);
                break;
            default:
                TLRPC.User user = (TLRPC.User) obj;
                y5 y5Var4 = this.b;
                if (!y5Var4.isFinished) {
                    if (user == null) {
                        org.telegram.messenger.g0.h3(new f4(y5Var4, 11));
                        break;
                    } else {
                        y5Var4.presentFragment(new n9(user));
                        break;
                    }
                }
                break;
        }
    }
}
