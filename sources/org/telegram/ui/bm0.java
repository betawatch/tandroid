package org.telegram.ui;

import android.view.MotionEvent;
import android.view.View;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-33b1d79182603e8304c32e909c352797304d7e7816a08740f96af6cffe97caab */
/* loaded from: classes3.dex */
public final /* synthetic */ class bm0 implements View.OnTouchListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ pn0 b;

    public /* synthetic */ bm0(pn0 pn0Var, int i10) {
        this.a = i10;
        this.b = pn0Var;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        int i10 = this.a;
        int i11 = 2;
        pn0 pn0Var = this.b;
        switch (i10) {
            case 0:
                if (pn0Var.getParentActivity() != null) {
                    if (motionEvent.getAction() == 1) {
                        au auVar = new au(null, false);
                        auVar.r = new z10(23, pn0Var, view);
                        pn0Var.presentFragment(auVar);
                        break;
                    }
                }
                break;
            case 1:
                if (pn0Var.getParentActivity() != null) {
                    if (motionEvent.getAction() == 1) {
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(pn0Var.getParentActivity());
                        String string = LocaleController.getString(R.string.PassportSelectGender);
                        org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.a;
                        b2Var.R = string;
                        alertDialog$Builder.f(new CharSequence[]{LocaleController.getString(R.string.PassportMale), LocaleController.getString(R.string.PassportFemale)}, new vv(pn0Var, i11));
                        alertDialog$Builder.k(LocaleController.getString(R.string.Cancel), null);
                        pn0Var.showDialog(b2Var);
                        break;
                    }
                }
                break;
            case 2:
                if (pn0Var.getParentActivity() != null) {
                    if (motionEvent.getAction() == 1) {
                        au auVar2 = new au(null, false);
                        auVar2.r = new cm0(pn0Var, i11);
                        pn0Var.presentFragment(auVar2);
                        break;
                    }
                }
                break;
            default:
                if (pn0Var.getParentActivity() != null) {
                    if (motionEvent.getAction() == 1) {
                        au auVar3 = new au(null, false);
                        auVar3.r = new cm0(pn0Var, 3);
                        pn0Var.presentFragment(auVar3);
                        break;
                    }
                }
                break;
        }
        return false;
    }
}
