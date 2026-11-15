package fi;

import android.view.View;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.hd;
import org.telegram.ui.Components.m60;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final /* synthetic */ class s1 implements View.OnLongClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ b4 b;

    public /* synthetic */ s1(b4 b4Var, int i7) {
        this.a = i7;
        this.b = b4Var;
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(View view) {
        int i7 = this.a;
        b4 b4Var = this.b;
        switch (i7) {
            case 0:
                if (!b4Var.B0(true)) {
                    m60 F = m60.F(b4Var.t0.w, b4Var.l0, view);
                    F.c(R.drawable.msg_edit, hd.M0(2131748810, null), new t1(b4Var, 6), false);
                    F.l(R.drawable.menu_delete_paid, hd.M0(2131748809, null), new t1(b4Var, 7), b4Var.v3 > 0);
                    F.V(5);
                    F.U = true;
                    F.Z();
                    break;
                } else {
                    break;
                }
            default:
                b4Var.v0.k(b4Var.B0(false));
                break;
        }
        return true;
    }
}
