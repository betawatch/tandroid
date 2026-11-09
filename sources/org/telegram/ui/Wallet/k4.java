package org.telegram.ui.Wallet;

import android.view.View;
import java.util.Locale;
import org.telegram.messenger.c20;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.r41;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes4.dex */
public final /* synthetic */ class k4 implements c20 {
    public final /* synthetic */ int a;
    public final /* synthetic */ w5 b;

    public /* synthetic */ k4(w5 w5Var, int i7) {
        this.a = i7;
        this.b = w5Var;
    }

    @Override // org.telegram.messenger.c20
    public final void a(Object obj) {
        switch (this.a) {
            case 0:
                Boolean bool = (Boolean) obj;
                w5 w5Var = this.b;
                w5Var.B0.setClickable(!bool.booleanValue());
                w5Var.C0.setClickable(!bool.booleanValue());
                if (bool.booleanValue()) {
                    w5Var.e0 = 1;
                    w5Var.p0.setPosition(1);
                    w5Var.p0.post(new d4(w5Var, 6));
                    break;
                }
                break;
            case 1:
                String lowerCase = ((String) obj).trim().toLowerCase(Locale.ROOT);
                w5 w5Var2 = this.b;
                w5Var2.k0 = lowerCase;
                r41[] r41VarArr = w5Var2.r0;
                r41 r41Var = r41VarArr[1];
                if (r41Var != null) {
                    w5.Y0(r41Var, true);
                    r41VarArr[1].v0(0);
                    r41VarArr[1].post(new d4(w5Var2, 6));
                    break;
                }
                break;
            case 2:
                float floatValue = ((Float) obj).floatValue();
                w5 w5Var3 = this.b;
                if (w5Var3.A0 != floatValue) {
                    w5Var3.A0 = floatValue;
                    float v = org.telegram.ui.Cells.f1.v(floatValue, 0.6f, 1.0f, 0.0f);
                    for (int i7 = 0; i7 < w5Var3.z0.getChildCount(); i7++) {
                        View childAt = w5Var3.z0.getChildAt(i7);
                        childAt.setAlpha(v);
                        childAt.setPivotY(0.0f);
                        childAt.setScaleY(1.0f - floatValue);
                    }
                    w5Var3.z0.setImportantForAccessibility(floatValue != 0.0f ? 4 : 0);
                    w5Var3.z0.requestLayout();
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
                        w5Var4.presentFragment(new l9(user));
                        break;
                    }
                }
                break;
        }
    }
}
