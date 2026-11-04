package org.telegram.ui;

import android.view.View;
import android.widget.TextView;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ni0 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ yj0 b;

    public /* synthetic */ ni0(yj0 yj0Var, int i3) {
        this.a = i3;
        this.b = yj0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i3 = this.a;
        yj0 yj0Var = this.b;
        switch (i3) {
            case 0:
                yj0Var.T0 = 2;
                yj0Var.H1();
                break;
            case 1:
                yj0Var.h1();
                break;
            case 2:
                yj0Var.T0 = 3;
                yj0Var.H1();
                break;
            case 3:
                yj0Var.T0 = 1;
                yj0Var.H1();
                break;
            case 4:
                yj0Var.T0 = 4;
                yj0Var.H1();
                break;
            case 5:
                if (yj0Var.getParentActivity().checkSelfPermission("android.permission.CAMERA") == 0) {
                    s9 s9Var = new s9(0);
                    s9Var.N = new yi0(yj0Var);
                    yj0Var.presentFragment(s9Var);
                    break;
                } else {
                    yj0Var.getParentActivity().requestPermissions(new String[]{"android.permission.CAMERA"}, 22);
                    break;
                }
            case 6:
                yj0Var.f = true;
                yj0Var.M.callOnClick();
                yj0Var.f = false;
                break;
            case 7:
                yj0Var.T0 = 0;
                yj0Var.H1();
                break;
            case 8:
                yj0Var.T0 = 4;
                yj0Var.H1();
                break;
            case 9:
                yj0Var.h1();
                break;
            case 10:
                yj0.g0(yj0Var);
                break;
            case 11:
                yj0.h0(yj0Var);
                break;
            case 12:
                yj0Var.G1();
                break;
            case 13:
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(yj0Var.getParentActivity());
                String M0 = org.telegram.messenger.bd.M0(2131744242, null);
                org.telegram.ui.ActionBar.s1 s1Var = alertDialog$Builder.a;
                s1Var.S = M0;
                s1Var.U = org.telegram.messenger.bd.M0(2131744243, null);
                alertDialog$Builder.k(org.telegram.messenger.bd.M0(2131751599, null), new pi0(yj0Var, 5));
                alertDialog$Builder.h(org.telegram.messenger.bd.M0(2131752589, null), null);
                yj0Var.showDialog(s1Var);
                TextView textView = (TextView) s1Var.d(-1);
                if (textView != null) {
                    org.telegram.ui.ActionBar.r6.V(textView, org.telegram.ui.ActionBar.k6.q7, null);
                    break;
                }
                break;
            case 14:
                yj0Var.G1();
                break;
            case 15:
                yj0.a0(yj0Var);
                break;
            default:
                yj0Var.f = true;
                yj0Var.M.callOnClick();
                yj0Var.f = false;
                break;
        }
    }
}
