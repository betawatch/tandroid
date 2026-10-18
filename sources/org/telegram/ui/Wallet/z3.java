package org.telegram.ui.Wallet;

import android.view.View;
import java.util.Locale;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.a71;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes4.dex */
public final /* synthetic */ class z3 implements Utilities.Callback {
    public final /* synthetic */ int a;
    public final /* synthetic */ m5 b;

    public /* synthetic */ z3(m5 m5Var, int i10) {
        this.a = i10;
        this.b = m5Var;
    }

    @Override // org.telegram.messenger.Utilities.Callback
    public final void run(Object obj) {
        switch (this.a) {
            case 0:
                Boolean bool = (Boolean) obj;
                m5 m5Var = this.b;
                m5Var.C0.setClickable(!bool.booleanValue());
                m5Var.D0.setClickable(!bool.booleanValue());
                if (bool.booleanValue()) {
                    m5Var.f0 = 1;
                    m5Var.q0.setPosition(1);
                    m5Var.q0.post(new n3(m5Var, 6));
                    break;
                }
                break;
            case 1:
                String lowerCase = ((String) obj).trim().toLowerCase(Locale.ROOT);
                m5 m5Var2 = this.b;
                m5Var2.l0 = lowerCase;
                a71[] a71VarArr = m5Var2.s0;
                a71 a71Var = a71VarArr[1];
                if (a71Var != null) {
                    m5.R0(a71Var, true);
                    a71VarArr[1].u0(0);
                    a71VarArr[1].post(new n3(m5Var2, 6));
                    break;
                }
                break;
            default:
                float floatValue = ((Float) obj).floatValue();
                m5 m5Var3 = this.b;
                if (m5Var3.B0 != floatValue) {
                    m5Var3.B0 = floatValue;
                    float v = org.telegram.ui.Cells.c1.v(floatValue, 0.6f, 1.0f, 0.0f);
                    for (int i10 = 0; i10 < m5Var3.A0.getChildCount(); i10++) {
                        View childAt = m5Var3.A0.getChildAt(i10);
                        childAt.setAlpha(v);
                        childAt.setPivotY(0.0f);
                        childAt.setScaleY(1.0f - floatValue);
                    }
                    m5Var3.A0.setImportantForAccessibility(floatValue != 0.0f ? 4 : 0);
                    m5Var3.A0.requestLayout();
                    break;
                }
                break;
        }
    }
}
