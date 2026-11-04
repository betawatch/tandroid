package org.telegram.ui;

import android.os.Bundle;
import android.view.View;
import org.telegram.messenger.beta.R;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class o31 implements org.telegram.ui.Components.hj0, qe.b {
    public final /* synthetic */ r41 a;

    public /* synthetic */ o31(r41 r41Var) {
        this.a = r41Var;
    }

    @Override // qe.b
    public void Y(int i3, float f10, float f11, qe.c cVar) {
        this.a.t0();
    }

    @Override // org.telegram.ui.Components.hj0
    public boolean f(int i3, View view) {
        final r41 r41Var = this.a;
        org.telegram.ui.ActionBar.s1[] s1VarArr = r41Var.h0;
        w31 w31Var = r41Var.X;
        int i10 = w31Var.J;
        final int i11 = 0;
        final int i12 = 1;
        if (i3 < i10 || i3 > w31Var.K) {
            int i13 = w31Var.V;
            if (i3 >= i13 && i3 <= w31Var.W) {
                ((k41) r41Var.R.get(i3 - i13)).c(r41Var.a, r41Var, s1VarArr, true);
                return true;
            }
            int i14 = w31Var.S;
            if (i3 >= i14 && i3 <= w31Var.T) {
                ((k41) r41Var.P.get(i3 - i14)).c(r41Var.a, r41Var, s1VarArr, true);
                return true;
            }
            int i15 = w31Var.Y;
            if (i3 >= i15 && i3 <= w31Var.Z) {
                ((k41) r41Var.Q.get(i3 - i15)).c(r41Var.a, r41Var, s1VarArr, true);
                return true;
            }
        } else {
            final org.telegram.messenger.zi ziVar = ((o41) r41Var.z0.get(i3 - i10)).b;
            if (!ziVar.y4()) {
                org.telegram.ui.Components.f60 H = org.telegram.ui.Components.f60.H(r41Var, view);
                H.c(R.drawable.msg_stats, org.telegram.messenger.bd.M0(2131743559, null), new Runnable() { // from class: org.telegram.ui.n31
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i11) {
                            case 0:
                                r41 r41Var2 = r41Var;
                                r41Var2.getClass();
                                r41Var2.presentFragment(new dg0(ziVar));
                                break;
                            default:
                                r41 r41Var3 = r41Var;
                                r41Var3.getClass();
                                Bundle bundle = new Bundle();
                                bundle.putLong("chat_id", r41Var3.b);
                                bundle.putInt("message_id", ziVar.f1());
                                bundle.putBoolean("need_remove_previous_same_chat_activity", false);
                                r41Var3.presentFragment(new wm(bundle), false);
                                break;
                        }
                    }
                }, false);
                H.c(R.drawable.msg_msgbubble3, org.telegram.messenger.bd.M0(2131743560, null), new Runnable() { // from class: org.telegram.ui.n31
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i12) {
                            case 0:
                                r41 r41Var2 = r41Var;
                                r41Var2.getClass();
                                r41Var2.presentFragment(new dg0(ziVar));
                                break;
                            default:
                                r41 r41Var3 = r41Var;
                                r41Var3.getClass();
                                Bundle bundle = new Bundle();
                                bundle.putLong("chat_id", r41Var3.b);
                                bundle.putInt("message_id", ziVar.f1());
                                bundle.putBoolean("need_remove_previous_same_chat_activity", false);
                                r41Var3.presentFragment(new wm(bundle), false);
                                break;
                        }
                    }
                }, false);
                H.W(r41Var.T.U0(view, false));
                H.Z();
                return true;
            }
        }
        return false;
    }

    @Override // qe.b
    public /* synthetic */ void F(float f10, int i3) {
    }
}
