package org.telegram.ui;

import android.view.View;
import android.widget.Toast;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes3.dex */
public final /* synthetic */ class b31 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ m31 b;

    public /* synthetic */ b31(m31 m31Var, int i7) {
        this.a = i7;
        this.b = m31Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i7 = this.a;
        m31 m31Var = this.b;
        switch (i7) {
            case 0:
                vf.c.t(m31Var.getParentActivity(), m31Var.getMessagesController().L5);
                m31Var.getMessagesController().k4(0L, "PREMIUM_GRACE");
                break;
            case 1:
                m31Var.getClass();
                m31Var.presentFragment(new g(3));
                break;
            case 2:
                m31Var.getMessagesController().k4(0L, "VALIDATE_PHONE_NUMBER");
                break;
            case 3:
                m31Var.getClass();
                m31Var.presentFragment(new ya1(8, null));
                break;
            case 4:
                m31Var.getMessagesController().k4(0L, "VALIDATE_PASSWORD");
                break;
            case 5:
                m31.a0(m31Var);
                break;
            default:
                int i10 = m31Var.Q + 1;
                m31Var.Q = i10;
                if (i10 >= 2) {
                    m31Var.presentFragment(new qt());
                    break;
                } else {
                    boolean z9 = org.telegram.messenger.r2.a;
                    try {
                        Toast.makeText(m31Var.getParentActivity(), org.telegram.messenger.hd.M0(2131751626, null), 0).show();
                        break;
                    } catch (Exception e10) {
                        org.telegram.messenger.a8.g(e10, true);
                        return;
                    }
                }
        }
    }
}
