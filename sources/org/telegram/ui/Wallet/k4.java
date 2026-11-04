package org.telegram.ui.Wallet;

import android.view.View;
import java.util.Locale;
import org.telegram.messenger.u10;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.l41;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final /* synthetic */ class k4 implements u10 {
    public final /* synthetic */ int a;
    public final /* synthetic */ w5 b;

    public /* synthetic */ k4(w5 w5Var, int i3) {
        this.a = i3;
        this.b = w5Var;
    }

    @Override // org.telegram.messenger.u10
    public final void a(Object obj) {
        switch (this.a) {
            case 0:
                Boolean bool = (Boolean) obj;
                w5 w5Var = this.b;
                w5Var.C0.setClickable(!bool.booleanValue());
                w5Var.D0.setClickable(!bool.booleanValue());
                if (bool.booleanValue()) {
                    w5Var.f0 = 1;
                    w5Var.q0.setPosition(1);
                    w5Var.q0.post(new d4(w5Var, 6));
                    break;
                }
                break;
            case 1:
                String lowerCase = ((String) obj).trim().toLowerCase(Locale.ROOT);
                w5 w5Var2 = this.b;
                w5Var2.l0 = lowerCase;
                l41[] l41VarArr = w5Var2.s0;
                l41 l41Var = l41VarArr[1];
                if (l41Var != null) {
                    w5.Y0(l41Var, true);
                    l41VarArr[1].v0(0);
                    l41VarArr[1].post(new d4(w5Var2, 6));
                    break;
                }
                break;
            case 2:
                float floatValue = ((Float) obj).floatValue();
                w5 w5Var3 = this.b;
                if (w5Var3.B0 != floatValue) {
                    w5Var3.B0 = floatValue;
                    float y9 = org.telegram.ui.Cells.f1.y(floatValue, 0.6f, 1.0f, 0.0f);
                    for (int i3 = 0; i3 < w5Var3.A0.getChildCount(); i3++) {
                        View childAt = w5Var3.A0.getChildAt(i3);
                        childAt.setAlpha(y9);
                        childAt.setPivotY(0.0f);
                        childAt.setScaleY(1.0f - floatValue);
                    }
                    w5Var3.A0.setImportantForAccessibility(floatValue != 0.0f ? 4 : 0);
                    w5Var3.A0.requestLayout();
                    break;
                }
                break;
            case 3:
                w5.j0(this.b, (String) obj);
                break;
            default:
                TLRPC.User user = (TLRPC.User) obj;
                w5 w5Var4 = this.b;
                if (!w5Var4.isFinished) {
                    if (user == null) {
                        org.telegram.messenger.g0.h3(new d4(w5Var4, 11));
                        break;
                    } else {
                        w5Var4.presentFragment(new m9(user));
                        break;
                    }
                }
                break;
        }
    }
}
