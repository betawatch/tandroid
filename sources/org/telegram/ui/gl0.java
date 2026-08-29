package org.telegram.ui;

import android.view.MotionEvent;
import android.view.View;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final /* synthetic */ class gl0 implements View.OnTouchListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ vm0 b;

    public /* synthetic */ gl0(vm0 vm0Var, int i10) {
        this.a = i10;
        this.b = vm0Var;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        int i10 = this.a;
        int i11 = 2;
        vm0 vm0Var = this.b;
        switch (i10) {
            case 0:
                if (vm0Var.getParentActivity() != null) {
                    if (motionEvent.getAction() == 1) {
                        rt rtVar = new rt(null, false);
                        rtVar.r = new kl0(i11, vm0Var, view);
                        vm0Var.presentFragment(rtVar);
                        break;
                    }
                }
                break;
            case 1:
                if (vm0Var.getParentActivity() != null) {
                    if (motionEvent.getAction() == 1) {
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(vm0Var.getParentActivity());
                        String string = LocaleController.getString(R.string.PassportSelectGender);
                        org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.a;
                        c2Var.N = string;
                        alertDialog$Builder.f(new CharSequence[]{LocaleController.getString(R.string.PassportMale), LocaleController.getString(R.string.PassportFemale)}, new iv(vm0Var, i11));
                        alertDialog$Builder.k(LocaleController.getString(R.string.Cancel), null);
                        vm0Var.showDialog(c2Var);
                        break;
                    }
                }
                break;
            case 2:
                if (vm0Var.getParentActivity() != null) {
                    if (motionEvent.getAction() == 1) {
                        rt rtVar2 = new rt(null, false);
                        rtVar2.r = new hl0(vm0Var, i11);
                        vm0Var.presentFragment(rtVar2);
                        break;
                    }
                }
                break;
            default:
                if (vm0Var.getParentActivity() != null) {
                    if (motionEvent.getAction() == 1) {
                        rt rtVar3 = new rt(null, false);
                        rtVar3.r = new hl0(vm0Var, 3);
                        vm0Var.presentFragment(rtVar3);
                        break;
                    }
                }
                break;
        }
        return false;
    }
}
