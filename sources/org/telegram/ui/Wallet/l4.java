package org.telegram.ui.Wallet;

import android.view.View;
import java.util.Locale;
import org.telegram.messenger.z10;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.u41;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes4.dex */
public final /* synthetic */ class l4 implements z10 {
    public final /* synthetic */ int a;
    public final /* synthetic */ y5 b;

    public /* synthetic */ l4(y5 y5Var, int i7) {
        this.a = i7;
        this.b = y5Var;
    }

    @Override // org.telegram.messenger.z10
    public final void a(Object obj) {
        switch (this.a) {
            case 0:
                Boolean bool = (Boolean) obj;
                y5 y5Var = this.b;
                y5Var.C0.setClickable(!bool.booleanValue());
                y5Var.D0.setClickable(!bool.booleanValue());
                if (bool.booleanValue()) {
                    y5Var.f0 = 1;
                    y5Var.q0.setPosition(1);
                    y5Var.q0.post(new e4(y5Var, 7));
                    break;
                }
                break;
            case 1:
                String lowerCase = ((String) obj).trim().toLowerCase(Locale.ROOT);
                y5 y5Var2 = this.b;
                y5Var2.l0 = lowerCase;
                u41[] u41VarArr = y5Var2.s0;
                u41 u41Var = u41VarArr[1];
                if (u41Var != null) {
                    y5.Z0(u41Var, true);
                    u41VarArr[1].v0(0);
                    u41VarArr[1].post(new e4(y5Var2, 7));
                    break;
                }
                break;
            case 2:
                float floatValue = ((Float) obj).floatValue();
                y5 y5Var3 = this.b;
                if (y5Var3.B0 != floatValue) {
                    y5Var3.B0 = floatValue;
                    float z10 = org.telegram.ui.Cells.y0.z(floatValue, 0.6f, 1.0f, 0.0f);
                    for (int i7 = 0; i7 < y5Var3.A0.getChildCount(); i7++) {
                        View childAt = y5Var3.A0.getChildAt(i7);
                        childAt.setAlpha(z10);
                        childAt.setPivotY(0.0f);
                        childAt.setScaleY(1.0f - floatValue);
                    }
                    y5Var3.A0.setImportantForAccessibility(floatValue != 0.0f ? 4 : 0);
                    y5Var3.A0.requestLayout();
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
                        org.telegram.messenger.g0.h3(new e4(y5Var4, 11));
                        break;
                    } else {
                        y5Var4.presentFragment(new p9(user));
                        break;
                    }
                }
                break;
        }
    }
}
