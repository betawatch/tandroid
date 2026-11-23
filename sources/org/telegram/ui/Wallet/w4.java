package org.telegram.ui.Wallet;

import android.view.View;
import java.util.Locale;
import org.telegram.messenger.w10;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.g51;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes4.dex */
public final /* synthetic */ class w4 implements w10 {
    public final /* synthetic */ int a;
    public final /* synthetic */ o6 b;

    public /* synthetic */ w4(o6 o6Var, int i7) {
        this.a = i7;
        this.b = o6Var;
    }

    @Override // org.telegram.messenger.w10
    public final void a(Object obj) {
        switch (this.a) {
            case 0:
                Boolean bool = (Boolean) obj;
                o6 o6Var = this.b;
                o6Var.E0.setClickable(!bool.booleanValue());
                o6Var.F0.setClickable(!bool.booleanValue());
                if (bool.booleanValue()) {
                    o6Var.f0 = 1;
                    o6Var.s0.setPosition(1);
                    o6Var.s0.post(new r4(o6Var, 3));
                    break;
                }
                break;
            case 1:
                String lowerCase = ((String) obj).trim().toLowerCase(Locale.ROOT);
                o6 o6Var2 = this.b;
                o6Var2.l0 = lowerCase;
                g51[] g51VarArr = o6Var2.u0;
                g51 g51Var = g51VarArr[1];
                if (g51Var != null) {
                    o6.d1(g51Var, true);
                    g51VarArr[1].v0(0);
                    g51VarArr[1].post(new r4(o6Var2, 3));
                    break;
                }
                break;
            case 2:
                float floatValue = ((Float) obj).floatValue();
                o6 o6Var3 = this.b;
                if (o6Var3.D0 != floatValue) {
                    o6Var3.D0 = floatValue;
                    float B = org.telegram.ui.Cells.c0.B(floatValue, 0.6f, 1.0f, 0.0f);
                    for (int i7 = 0; i7 < o6Var3.C0.getChildCount(); i7++) {
                        View childAt = o6Var3.C0.getChildAt(i7);
                        childAt.setAlpha(B);
                        childAt.setPivotY(0.0f);
                        childAt.setScaleY(1.0f - floatValue);
                    }
                    o6Var3.C0.setImportantForAccessibility(floatValue != 0.0f ? 4 : 0);
                    o6Var3.C0.requestLayout();
                    break;
                }
                break;
            case 3:
                o6.k0(this.b, (String) obj);
                break;
            default:
                TLRPC.User user = (TLRPC.User) obj;
                o6 o6Var4 = this.b;
                if (!o6Var4.isFinished) {
                    if (user == null) {
                        org.telegram.messenger.g0.g3(new r4(o6Var4, 9));
                        break;
                    } else {
                        o6Var4.presentFragment(new ea(user));
                        break;
                    }
                }
                break;
        }
    }
}
