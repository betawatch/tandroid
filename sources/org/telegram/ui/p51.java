package org.telegram.ui;

import android.os.Bundle;
import android.view.View;
import org.telegram.messenger.beta.R;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final /* synthetic */ class p51 implements org.telegram.ui.Components.jk0, fe.e {
    public final /* synthetic */ s61 a;

    public /* synthetic */ p51(s61 s61Var) {
        this.a = s61Var;
    }

    @Override // org.telegram.ui.Components.jk0
    public boolean f(int i10, View view) {
        final s61 s61Var = this.a;
        org.telegram.ui.ActionBar.x1[] x1VarArr = s61Var.g0;
        x51 x51Var = s61Var.W;
        int i11 = x51Var.I;
        final int i12 = 0;
        final int i13 = 1;
        if (i10 < i11 || i10 > x51Var.J) {
            int i14 = x51Var.U;
            if (i10 >= i14 && i10 <= x51Var.V) {
                ((l61) s61Var.Q.get(i10 - i14)).c(s61Var.a, s61Var, x1VarArr, true);
                return true;
            }
            int i15 = x51Var.R;
            if (i10 >= i15 && i10 <= x51Var.S) {
                ((l61) s61Var.O.get(i10 - i15)).c(s61Var.a, s61Var, x1VarArr, true);
                return true;
            }
            int i16 = x51Var.X;
            if (i10 >= i16 && i10 <= x51Var.Y) {
                ((l61) s61Var.P.get(i10 - i16)).c(s61Var.a, s61Var, x1VarArr, true);
                return true;
            }
        } else {
            final org.telegram.messenger.kj kjVar = ((p61) s61Var.y0.get(i10 - i11)).b;
            if (!kjVar.x4()) {
                org.telegram.ui.Components.z60 H = org.telegram.ui.Components.z60.H(s61Var, view);
                H.c(R.drawable.msg_stats, org.telegram.messenger.dd.L0(2131743575, null), new Runnable() { // from class: org.telegram.ui.o51
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i12) {
                            case 0:
                                s61 s61Var2 = s61Var;
                                s61Var2.getClass();
                                s61Var2.presentFragment(new qh0(kjVar));
                                break;
                            default:
                                s61 s61Var3 = s61Var;
                                s61Var3.getClass();
                                Bundle bundle = new Bundle();
                                bundle.putLong("chat_id", s61Var3.b);
                                bundle.putInt("message_id", kjVar.f1());
                                bundle.putBoolean("need_remove_previous_same_chat_activity", false);
                                s61Var3.presentFragment(new un(bundle), false);
                                break;
                        }
                    }
                }, false);
                H.c(R.drawable.msg_msgbubble3, org.telegram.messenger.dd.L0(2131743576, null), new Runnable() { // from class: org.telegram.ui.o51
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i13) {
                            case 0:
                                s61 s61Var2 = s61Var;
                                s61Var2.getClass();
                                s61Var2.presentFragment(new qh0(kjVar));
                                break;
                            default:
                                s61 s61Var3 = s61Var;
                                s61Var3.getClass();
                                Bundle bundle = new Bundle();
                                bundle.putLong("chat_id", s61Var3.b);
                                bundle.putInt("message_id", kjVar.f1());
                                bundle.putBoolean("need_remove_previous_same_chat_activity", false);
                                s61Var3.presentFragment(new un(bundle), false);
                                break;
                        }
                    }
                }, false);
                H.W(s61Var.S.U0(view, false));
                H.Z();
                return true;
            }
        }
        return false;
    }

    @Override // fe.e
    public void v(int i10, float f7, float f10, fe.f fVar) {
        this.a.t0();
    }

    @Override // fe.e
    public /* synthetic */ void E(float f7, int i10) {
    }
}
