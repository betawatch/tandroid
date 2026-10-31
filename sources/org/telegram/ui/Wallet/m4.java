package org.telegram.ui.Wallet;

import android.view.View;
import java.util.Locale;
import org.telegram.messenger.q20;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.u51;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class m4 implements q20 {
    public final /* synthetic */ int a;
    public final /* synthetic */ b6 b;

    public /* synthetic */ m4(b6 b6Var, int i10) {
        this.a = i10;
        this.b = b6Var;
    }

    @Override // org.telegram.messenger.q20
    public final void a(Object obj) {
        switch (this.a) {
            case 0:
                Boolean bool = (Boolean) obj;
                b6 b6Var = this.b;
                b6Var.B0.setClickable(!bool.booleanValue());
                b6Var.C0.setClickable(!bool.booleanValue());
                if (bool.booleanValue()) {
                    b6Var.e0 = 1;
                    b6Var.p0.setPosition(1);
                    b6Var.p0.post(new f4(b6Var, 6));
                    break;
                }
                break;
            case 1:
                String lowerCase = ((String) obj).trim().toLowerCase(Locale.ROOT);
                b6 b6Var2 = this.b;
                b6Var2.k0 = lowerCase;
                u51[] u51VarArr = b6Var2.r0;
                u51 u51Var = u51VarArr[1];
                if (u51Var != null) {
                    b6.X0(u51Var, true);
                    u51VarArr[1].v0(0);
                    u51VarArr[1].post(new f4(b6Var2, 6));
                    break;
                }
                break;
            case 2:
                float floatValue = ((Float) obj).floatValue();
                b6 b6Var3 = this.b;
                if (b6Var3.A0 != floatValue) {
                    b6Var3.A0 = floatValue;
                    float v = org.telegram.ui.Cells.f1.v(floatValue, 0.6f, 1.0f, 0.0f);
                    for (int i10 = 0; i10 < b6Var3.z0.getChildCount(); i10++) {
                        View childAt = b6Var3.z0.getChildAt(i10);
                        childAt.setAlpha(v);
                        childAt.setPivotY(0.0f);
                        childAt.setScaleY(1.0f - floatValue);
                    }
                    b6Var3.z0.setImportantForAccessibility(floatValue != 0.0f ? 4 : 0);
                    b6Var3.z0.requestLayout();
                    break;
                }
                break;
            case 3:
                b6.i0(this.b, (String) obj);
                break;
            default:
                TLRPC.User user = (TLRPC.User) obj;
                b6 b6Var4 = this.b;
                if (!b6Var4.isFinished) {
                    if (user == null) {
                        org.telegram.messenger.i0.g3(new f4(b6Var4, 11));
                        break;
                    } else {
                        b6Var4.presentFragment(new r9(user));
                        break;
                    }
                }
                break;
        }
    }
}
