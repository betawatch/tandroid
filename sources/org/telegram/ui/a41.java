package org.telegram.ui;

import android.os.Bundle;
import android.view.View;
import org.telegram.messenger.beta.R;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final /* synthetic */ class a41 implements org.telegram.ui.Components.dj0, te.b {
    public final /* synthetic */ e51 a;

    public /* synthetic */ a41(e51 e51Var) {
        this.a = e51Var;
    }

    @Override // te.b
    public void Y(int i7, float f10, float f11, te.c cVar) {
        this.a.t0();
    }

    @Override // org.telegram.ui.Components.dj0
    public boolean c(int i7, View view) {
        final e51 e51Var = this.a;
        org.telegram.ui.ActionBar.u1[] u1VarArr = e51Var.g0;
        i41 i41Var = e51Var.W;
        int i10 = i41Var.I;
        final int i11 = 0;
        final int i12 = 1;
        if (i7 < i10 || i7 > i41Var.J) {
            int i13 = i41Var.U;
            if (i7 >= i13 && i7 <= i41Var.V) {
                ((x41) e51Var.Q.get(i7 - i13)).c(e51Var.a, e51Var, u1VarArr, true);
                return true;
            }
            int i14 = i41Var.R;
            if (i7 >= i14 && i7 <= i41Var.S) {
                ((x41) e51Var.O.get(i7 - i14)).c(e51Var.a, e51Var, u1VarArr, true);
                return true;
            }
            int i15 = i41Var.X;
            if (i7 >= i15 && i7 <= i41Var.Y) {
                ((x41) e51Var.P.get(i7 - i15)).c(e51Var.a, e51Var, u1VarArr, true);
                return true;
            }
        } else {
            final org.telegram.messenger.ij ijVar = ((b51) e51Var.y0.get(i7 - i10)).b;
            if (!ijVar.x4()) {
                org.telegram.ui.Components.k60 H = org.telegram.ui.Components.k60.H(e51Var, view);
                H.c(R.drawable.msg_stats, org.telegram.messenger.id.M0(2131743549, null), new Runnable() { // from class: org.telegram.ui.z31
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i11) {
                            case 0:
                                e51 e51Var2 = e51Var;
                                e51Var2.getClass();
                                e51Var2.presentFragment(new mg0(ijVar));
                                break;
                            default:
                                e51 e51Var3 = e51Var;
                                e51Var3.getClass();
                                Bundle bundle = new Bundle();
                                bundle.putLong("chat_id", e51Var3.b);
                                bundle.putInt("message_id", ijVar.e1());
                                bundle.putBoolean("need_remove_previous_same_chat_activity", false);
                                e51Var3.presentFragment(new cn(bundle), false);
                                break;
                        }
                    }
                }, false);
                H.c(R.drawable.msg_msgbubble3, org.telegram.messenger.id.M0(2131743550, null), new Runnable() { // from class: org.telegram.ui.z31
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i12) {
                            case 0:
                                e51 e51Var2 = e51Var;
                                e51Var2.getClass();
                                e51Var2.presentFragment(new mg0(ijVar));
                                break;
                            default:
                                e51 e51Var3 = e51Var;
                                e51Var3.getClass();
                                Bundle bundle = new Bundle();
                                bundle.putLong("chat_id", e51Var3.b);
                                bundle.putInt("message_id", ijVar.e1());
                                bundle.putBoolean("need_remove_previous_same_chat_activity", false);
                                e51Var3.presentFragment(new cn(bundle), false);
                                break;
                        }
                    }
                }, false);
                H.W(e51Var.S.U0(view, false));
                H.Z();
                return true;
            }
        }
        return false;
    }

    @Override // te.b
    public /* synthetic */ void F(float f10, int i7) {
    }
}
