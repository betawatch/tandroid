package org.telegram.ui.Wallet;

import android.view.View;
import java.util.Locale;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.a71;

/* compiled from: r8-map-id-bcc7d273da888d5c27994201329e5b838e55754b73312241608ee42846efd426 */
/* loaded from: classes4.dex */
public final /* synthetic */ class a4 implements Utilities.Callback {
    public final /* synthetic */ int a;
    public final /* synthetic */ n5 b;

    public /* synthetic */ a4(n5 n5Var, int i10) {
        this.a = i10;
        this.b = n5Var;
    }

    @Override // org.telegram.messenger.Utilities.Callback
    public final void run(Object obj) {
        switch (this.a) {
            case 0:
                Boolean bool = (Boolean) obj;
                n5 n5Var = this.b;
                n5Var.A0.setClickable(!bool.booleanValue());
                n5Var.B0.setClickable(!bool.booleanValue());
                if (bool.booleanValue()) {
                    n5Var.d0 = 1;
                    n5Var.o0.setPosition(1);
                    n5Var.o0.post(new o3(n5Var, 6));
                    break;
                }
                break;
            case 1:
                String lowerCase = ((String) obj).trim().toLowerCase(Locale.ROOT);
                n5 n5Var2 = this.b;
                n5Var2.j0 = lowerCase;
                a71[] a71VarArr = n5Var2.q0;
                a71 a71Var = a71VarArr[1];
                if (a71Var != null) {
                    n5.R0(a71Var, true);
                    a71VarArr[1].u0(0);
                    a71VarArr[1].post(new o3(n5Var2, 6));
                    break;
                }
                break;
            default:
                float floatValue = ((Float) obj).floatValue();
                n5 n5Var3 = this.b;
                if (n5Var3.z0 != floatValue) {
                    n5Var3.z0 = floatValue;
                    float v = org.telegram.ui.Cells.c1.v(floatValue, 0.6f, 1.0f, 0.0f);
                    for (int i10 = 0; i10 < n5Var3.y0.getChildCount(); i10++) {
                        View childAt = n5Var3.y0.getChildAt(i10);
                        childAt.setAlpha(v);
                        childAt.setPivotY(0.0f);
                        childAt.setScaleY(1.0f - floatValue);
                    }
                    n5Var3.y0.setImportantForAccessibility(floatValue != 0.0f ? 4 : 0);
                    n5Var3.y0.requestLayout();
                    break;
                }
                break;
        }
    }
}
