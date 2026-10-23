package org.telegram.ui;

import android.view.MotionEvent;
import android.view.View;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-6bb23a39fe2d1bb2dc6cc69f606436ba751c240cf93e0ff97ff041cb9f09a305 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ml0 implements View.OnTouchListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ an0 b;

    public /* synthetic */ ml0(an0 an0Var, int i10) {
        this.a = i10;
        this.b = an0Var;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        int i10 = this.a;
        int i11 = 2;
        int i12 = 3;
        an0 an0Var = this.b;
        int i13 = 0;
        switch (i10) {
            case 0:
                if (an0Var.getParentActivity() != null) {
                    if (motionEvent.getAction() == 1) {
                        rt rtVar = new rt(null, false);
                        rtVar.r = new ql0(i13, an0Var, view);
                        an0Var.presentFragment(rtVar);
                        break;
                    }
                } else {
                    break;
                }
                break;
            case 1:
                if (an0Var.getParentActivity() != null) {
                    if (motionEvent.getAction() == 1) {
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(an0Var.getParentActivity());
                        String string = LocaleController.getString(R.string.PassportSelectGender);
                        org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.a;
                        c2Var.R = string;
                        alertDialog$Builder.f(new CharSequence[]{LocaleController.getString(R.string.PassportMale), LocaleController.getString(R.string.PassportFemale)}, new o4(an0Var, i12));
                        alertDialog$Builder.k(LocaleController.getString(R.string.Cancel), null);
                        an0Var.showDialog(c2Var);
                        break;
                    }
                } else {
                    break;
                }
                break;
            case 2:
                if (an0Var.getParentActivity() != null) {
                    if (motionEvent.getAction() == 1) {
                        rt rtVar2 = new rt(null, false);
                        rtVar2.r = new nl0(an0Var, i11);
                        an0Var.presentFragment(rtVar2);
                        break;
                    }
                } else {
                    break;
                }
                break;
            default:
                if (an0Var.getParentActivity() != null) {
                    if (motionEvent.getAction() == 1) {
                        rt rtVar3 = new rt(null, false);
                        rtVar3.r = new nl0(an0Var, i12);
                        an0Var.presentFragment(rtVar3);
                        break;
                    }
                } else {
                    break;
                }
                break;
        }
        return true;
    }
}
