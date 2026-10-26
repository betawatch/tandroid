package org.telegram.ui.Wallet;

import android.view.View;
import java.util.Locale;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.r71;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes4.dex */
public final /* synthetic */ class v3 implements Utilities.Callback {
    public final /* synthetic */ int a;
    public final /* synthetic */ m5 b;

    public /* synthetic */ v3(m5 m5Var, int i10) {
        this.a = i10;
        this.b = m5Var;
    }

    @Override // org.telegram.messenger.Utilities.Callback
    public final void run(Object obj) {
        switch (this.a) {
            case 0:
                Boolean bool = (Boolean) obj;
                m5 m5Var = this.b;
                m5Var.B0.setClickable(!bool.booleanValue());
                m5Var.C0.setClickable(!bool.booleanValue());
                if (bool.booleanValue()) {
                    m5Var.e0 = 1;
                    m5Var.p0.setPosition(1);
                    m5Var.p0.post(new o3(m5Var, 6));
                    break;
                }
                break;
            case 1:
                String lowerCase = ((String) obj).trim().toLowerCase(Locale.ROOT);
                m5 m5Var2 = this.b;
                m5Var2.k0 = lowerCase;
                r71[] r71VarArr = m5Var2.r0;
                r71 r71Var = r71VarArr[1];
                if (r71Var != null) {
                    m5.U0(r71Var, true);
                    r71VarArr[1].v0(0);
                    r71VarArr[1].post(new o3(m5Var2, 6));
                    break;
                }
                break;
            case 2:
                float floatValue = ((Float) obj).floatValue();
                m5 m5Var3 = this.b;
                if (m5Var3.A0 != floatValue) {
                    m5Var3.A0 = floatValue;
                    float v = org.telegram.ui.d3.v(floatValue, 0.6f, 1.0f, 0.0f);
                    for (int i10 = 0; i10 < m5Var3.z0.getChildCount(); i10++) {
                        View childAt = m5Var3.z0.getChildAt(i10);
                        childAt.setAlpha(v);
                        childAt.setPivotY(0.0f);
                        childAt.setScaleY(1.0f - floatValue);
                    }
                    m5Var3.z0.setImportantForAccessibility(floatValue != 0.0f ? 4 : 0);
                    m5Var3.z0.requestLayout();
                    break;
                }
                break;
            case 3:
                m5.f0(this.b, (String) obj);
                break;
            default:
                TLRPC.User user = (TLRPC.User) obj;
                m5 m5Var4 = this.b;
                if (!m5Var4.isFinished) {
                    if (user == null) {
                        AndroidUtilities.runOnUIThread(new o3(m5Var4, 11));
                        break;
                    } else {
                        m5Var4.presentFragment(new i9(user));
                        break;
                    }
                }
                break;
        }
    }
}
