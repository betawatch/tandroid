package org.telegram.ui.Wallet;

import android.view.View;
import java.util.Locale;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.j71;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes4.dex */
public final /* synthetic */ class v3 implements Utilities.Callback {
    public final /* synthetic */ int a;
    public final /* synthetic */ o5 b;

    public /* synthetic */ v3(o5 o5Var, int i10) {
        this.a = i10;
        this.b = o5Var;
    }

    @Override // org.telegram.messenger.Utilities.Callback
    public final void run(Object obj) {
        switch (this.a) {
            case 0:
                Boolean bool = (Boolean) obj;
                o5 o5Var = this.b;
                o5Var.A0.setClickable(!bool.booleanValue());
                o5Var.B0.setClickable(!bool.booleanValue());
                if (bool.booleanValue()) {
                    o5Var.d0 = 1;
                    o5Var.o0.setPosition(1);
                    o5Var.o0.post(new o3(o5Var, 6));
                    break;
                }
                break;
            case 1:
                String lowerCase = ((String) obj).trim().toLowerCase(Locale.ROOT);
                o5 o5Var2 = this.b;
                o5Var2.j0 = lowerCase;
                j71[] j71VarArr = o5Var2.q0;
                j71 j71Var = j71VarArr[1];
                if (j71Var != null) {
                    o5.T0(j71Var, true);
                    j71VarArr[1].u0(0);
                    j71VarArr[1].post(new o3(o5Var2, 6));
                    break;
                }
                break;
            case 2:
                float floatValue = ((Float) obj).floatValue();
                o5 o5Var3 = this.b;
                if (o5Var3.z0 != floatValue) {
                    o5Var3.z0 = floatValue;
                    float t10 = org.telegram.ui.Cells.b1.t(floatValue, 0.6f, 1.0f, 0.0f);
                    for (int i10 = 0; i10 < o5Var3.y0.getChildCount(); i10++) {
                        View childAt = o5Var3.y0.getChildAt(i10);
                        childAt.setAlpha(t10);
                        childAt.setPivotY(0.0f);
                        childAt.setScaleY(1.0f - floatValue);
                    }
                    o5Var3.y0.setImportantForAccessibility(floatValue != 0.0f ? 4 : 0);
                    o5Var3.y0.requestLayout();
                    break;
                }
                break;
            case 3:
                o5.e0(this.b, (String) obj);
                break;
            default:
                TLRPC.User user = (TLRPC.User) obj;
                o5 o5Var4 = this.b;
                if (!o5Var4.isFinished) {
                    if (user == null) {
                        AndroidUtilities.runOnUIThread(new o3(o5Var4, 11));
                        break;
                    } else {
                        o5Var4.presentFragment(new j9(user));
                        break;
                    }
                }
                break;
        }
    }
}
