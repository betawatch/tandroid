package org.telegram.ui;

import android.view.MotionEvent;
import android.view.View;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
/* loaded from: classes3.dex */
public final /* synthetic */ class jl0 implements View.OnTouchListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ vm0 b;

    public /* synthetic */ jl0(vm0 vm0Var, int i10) {
        this.a = i10;
        this.b = vm0Var;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        int i10 = this.a;
        int i11 = 2;
        int i12 = 3;
        vm0 vm0Var = this.b;
        switch (i10) {
            case 0:
                if (vm0Var.getParentActivity() != null) {
                    if (motionEvent.getAction() == 1) {
                        ot otVar = new ot(null, false);
                        otVar.r = new xu(28, vm0Var, view);
                        vm0Var.presentFragment(otVar);
                    }
                    break;
                }
                break;
            case 1:
                if (vm0Var.getParentActivity() != null) {
                    if (motionEvent.getAction() == 1) {
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(vm0Var.getParentActivity());
                        String string = LocaleController.getString(R.string.PassportSelectGender);
                        org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.a;
                        b2Var.R = string;
                        alertDialog$Builder.f(new CharSequence[]{LocaleController.getString(R.string.PassportMale), LocaleController.getString(R.string.PassportFemale)}, new p4(vm0Var, i12));
                        alertDialog$Builder.k(LocaleController.getString(R.string.Cancel), null);
                        vm0Var.showDialog(b2Var);
                    }
                    break;
                }
                break;
            case 2:
                if (vm0Var.getParentActivity() != null) {
                    if (motionEvent.getAction() == 1) {
                        ot otVar2 = new ot(null, false);
                        otVar2.r = new kl0(vm0Var, i11);
                        vm0Var.presentFragment(otVar2);
                    }
                    break;
                }
                break;
            default:
                if (vm0Var.getParentActivity() != null) {
                    if (motionEvent.getAction() == 1) {
                        ot otVar3 = new ot(null, false);
                        otVar3.r = new kl0(vm0Var, i12);
                        vm0Var.presentFragment(otVar3);
                    }
                    break;
                }
                break;
        }
        return true;
    }
}
