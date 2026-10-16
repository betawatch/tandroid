package org.telegram.ui;

import android.view.MotionEvent;
import android.view.View;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes3.dex */
public final /* synthetic */ class em0 implements View.OnTouchListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ sn0 b;

    public /* synthetic */ em0(sn0 sn0Var, int i10) {
        this.a = i10;
        this.b = sn0Var;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        int i10 = this.a;
        int i11 = 2;
        int i12 = 3;
        sn0 sn0Var = this.b;
        switch (i10) {
            case 0:
                if (sn0Var.getParentActivity() != null) {
                    if (motionEvent.getAction() == 1) {
                        fu fuVar = new fu(null, false);
                        fuVar.r = new qw(26, sn0Var, view);
                        sn0Var.presentFragment(fuVar);
                    }
                    break;
                }
                break;
            case 1:
                if (sn0Var.getParentActivity() != null) {
                    if (motionEvent.getAction() == 1) {
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(sn0Var.getParentActivity());
                        String string = LocaleController.getString(R.string.PassportSelectGender);
                        org.telegram.ui.ActionBar.a2 a2Var = alertDialog$Builder.a;
                        a2Var.R = string;
                        alertDialog$Builder.f(new CharSequence[]{LocaleController.getString(R.string.PassportMale), LocaleController.getString(R.string.PassportFemale)}, new o4(sn0Var, i12));
                        alertDialog$Builder.k(LocaleController.getString(R.string.Cancel), null);
                        sn0Var.showDialog(a2Var);
                    }
                    break;
                }
                break;
            case 2:
                if (sn0Var.getParentActivity() != null) {
                    if (motionEvent.getAction() == 1) {
                        fu fuVar2 = new fu(null, false);
                        fuVar2.r = new fm0(sn0Var, i11);
                        sn0Var.presentFragment(fuVar2);
                    }
                    break;
                }
                break;
            default:
                if (sn0Var.getParentActivity() != null) {
                    if (motionEvent.getAction() == 1) {
                        fu fuVar3 = new fu(null, false);
                        fuVar3.r = new fm0(sn0Var, i12);
                        sn0Var.presentFragment(fuVar3);
                    }
                    break;
                }
                break;
        }
        return true;
    }
}
