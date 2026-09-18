package org.telegram.ui;

import android.view.MotionEvent;
import android.view.View;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final /* synthetic */ class bm0 implements View.OnTouchListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ qn0 b;

    public /* synthetic */ bm0(qn0 qn0Var, int i10) {
        this.a = i10;
        this.b = qn0Var;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        int i10 = this.a;
        int i11 = 2;
        qn0 qn0Var = this.b;
        switch (i10) {
            case 0:
                if (qn0Var.getParentActivity() != null) {
                    if (motionEvent.getAction() == 1) {
                        cu cuVar = new cu(null, false);
                        cuVar.r = new f20(22, qn0Var, view);
                        qn0Var.presentFragment(cuVar);
                        break;
                    }
                }
                break;
            case 1:
                if (qn0Var.getParentActivity() != null) {
                    if (motionEvent.getAction() == 1) {
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(qn0Var.getParentActivity());
                        String string = LocaleController.getString(R.string.PassportSelectGender);
                        org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.a;
                        c2Var.R = string;
                        alertDialog$Builder.f(new CharSequence[]{LocaleController.getString(R.string.PassportMale), LocaleController.getString(R.string.PassportFemale)}, new wv(qn0Var, i11));
                        alertDialog$Builder.k(LocaleController.getString(R.string.Cancel), null);
                        qn0Var.showDialog(c2Var);
                        break;
                    }
                }
                break;
            case 2:
                if (qn0Var.getParentActivity() != null) {
                    if (motionEvent.getAction() == 1) {
                        cu cuVar2 = new cu(null, false);
                        cuVar2.r = new cm0(qn0Var, i11);
                        qn0Var.presentFragment(cuVar2);
                        break;
                    }
                }
                break;
            default:
                if (qn0Var.getParentActivity() != null) {
                    if (motionEvent.getAction() == 1) {
                        cu cuVar3 = new cu(null, false);
                        cuVar3.r = new cm0(qn0Var, 3);
                        qn0Var.presentFragment(cuVar3);
                        break;
                    }
                }
                break;
        }
        return false;
    }
}
