package org.telegram.ui.Wallet;

import android.view.View;
import java.util.Locale;
import org.telegram.messenger.c20;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.r41;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes4.dex */
public final /* synthetic */ class m4 implements c20 {
    public final /* synthetic */ int a;
    public final /* synthetic */ z5 b;

    public /* synthetic */ m4(z5 z5Var, int i7) {
        this.a = i7;
        this.b = z5Var;
    }

    @Override // org.telegram.messenger.c20
    public final void a(Object obj) {
        switch (this.a) {
            case 0:
                Boolean bool = (Boolean) obj;
                z5 z5Var = this.b;
                z5Var.B0.setClickable(!bool.booleanValue());
                z5Var.C0.setClickable(!bool.booleanValue());
                if (bool.booleanValue()) {
                    z5Var.e0 = 1;
                    z5Var.p0.setPosition(1);
                    z5Var.p0.post(new f4(z5Var, 7));
                    break;
                }
                break;
            case 1:
                String lowerCase = ((String) obj).trim().toLowerCase(Locale.ROOT);
                z5 z5Var2 = this.b;
                z5Var2.k0 = lowerCase;
                r41[] r41VarArr = z5Var2.r0;
                r41 r41Var = r41VarArr[1];
                if (r41Var != null) {
                    z5.Z0(r41Var, true);
                    r41VarArr[1].v0(0);
                    r41VarArr[1].post(new f4(z5Var2, 7));
                    break;
                }
                break;
            case 2:
                float floatValue = ((Float) obj).floatValue();
                z5 z5Var3 = this.b;
                if (z5Var3.A0 != floatValue) {
                    z5Var3.A0 = floatValue;
                    float v = org.telegram.ui.Cells.f1.v(floatValue, 0.6f, 1.0f, 0.0f);
                    for (int i7 = 0; i7 < z5Var3.z0.getChildCount(); i7++) {
                        View childAt = z5Var3.z0.getChildAt(i7);
                        childAt.setAlpha(v);
                        childAt.setPivotY(0.0f);
                        childAt.setScaleY(1.0f - floatValue);
                    }
                    z5Var3.z0.setImportantForAccessibility(floatValue != 0.0f ? 4 : 0);
                    z5Var3.z0.requestLayout();
                    break;
                }
                break;
            case 3:
                z5.j0(this.b, (String) obj);
                break;
            default:
                TLRPC.User user = (TLRPC.User) obj;
                z5 z5Var4 = this.b;
                if (!z5Var4.isFinished) {
                    if (user == null) {
                        org.telegram.messenger.g0.h3(new f4(z5Var4, 11));
                        break;
                    } else {
                        z5Var4.presentFragment(new o9(user));
                        break;
                    }
                }
                break;
        }
    }
}
