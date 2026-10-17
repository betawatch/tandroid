package org.telegram.ui.Wallet;

import android.view.View;
import java.util.Locale;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.a71;

/* compiled from: r8-map-id-189a3a12219b7c214453a48fa9697387dfb8b2ca31ce3a2eba70ff5e2610a248 */
/* loaded from: classes4.dex */
public final /* synthetic */ class y3 implements Utilities.Callback {
    public final /* synthetic */ int a;
    public final /* synthetic */ l5 b;

    public /* synthetic */ y3(l5 l5Var, int i10) {
        this.a = i10;
        this.b = l5Var;
    }

    @Override // org.telegram.messenger.Utilities.Callback
    public final void run(Object obj) {
        switch (this.a) {
            case 0:
                Boolean bool = (Boolean) obj;
                l5 l5Var = this.b;
                l5Var.C0.setClickable(!bool.booleanValue());
                l5Var.D0.setClickable(!bool.booleanValue());
                if (bool.booleanValue()) {
                    l5Var.f0 = 1;
                    l5Var.q0.setPosition(1);
                    l5Var.q0.post(new m3(l5Var, 6));
                    break;
                }
                break;
            case 1:
                String lowerCase = ((String) obj).trim().toLowerCase(Locale.ROOT);
                l5 l5Var2 = this.b;
                l5Var2.l0 = lowerCase;
                a71[] a71VarArr = l5Var2.s0;
                a71 a71Var = a71VarArr[1];
                if (a71Var != null) {
                    l5.R0(a71Var, true);
                    a71VarArr[1].u0(0);
                    a71VarArr[1].post(new m3(l5Var2, 6));
                    break;
                }
                break;
            default:
                float floatValue = ((Float) obj).floatValue();
                l5 l5Var3 = this.b;
                if (l5Var3.B0 != floatValue) {
                    l5Var3.B0 = floatValue;
                    float v = org.telegram.ui.Cells.t0.v(floatValue, 0.6f, 1.0f, 0.0f);
                    for (int i10 = 0; i10 < l5Var3.A0.getChildCount(); i10++) {
                        View childAt = l5Var3.A0.getChildAt(i10);
                        childAt.setAlpha(v);
                        childAt.setPivotY(0.0f);
                        childAt.setScaleY(1.0f - floatValue);
                    }
                    l5Var3.A0.setImportantForAccessibility(floatValue != 0.0f ? 4 : 0);
                    l5Var3.A0.requestLayout();
                    break;
                }
                break;
        }
    }
}
