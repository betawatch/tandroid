package org.telegram.ui;

import android.view.MotionEvent;
import android.view.View;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final /* synthetic */ class pl0 implements View.OnTouchListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ dn0 b;

    public /* synthetic */ pl0(dn0 dn0Var, int i10) {
        this.a = i10;
        this.b = dn0Var;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        int i10 = this.a;
        int i11 = 2;
        dn0 dn0Var = this.b;
        int i12 = 1;
        switch (i10) {
            case 0:
                if (dn0Var.getParentActivity() != null) {
                    if (motionEvent.getAction() == 1) {
                        yt ytVar = new yt(null, false);
                        ytVar.r = new tl0(i12, dn0Var, view);
                        dn0Var.presentFragment(ytVar);
                        break;
                    }
                }
                break;
            case 1:
                if (dn0Var.getParentActivity() != null) {
                    if (motionEvent.getAction() == 1) {
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(dn0Var.getParentActivity());
                        String string = LocaleController.getString(R.string.PassportSelectGender);
                        org.telegram.ui.ActionBar.d2 d2Var = alertDialog$Builder.a;
                        d2Var.O = string;
                        alertDialog$Builder.f(new CharSequence[]{LocaleController.getString(R.string.PassportMale), LocaleController.getString(R.string.PassportFemale)}, new qv(dn0Var, i11));
                        alertDialog$Builder.k(LocaleController.getString(R.string.Cancel), null);
                        dn0Var.showDialog(d2Var);
                        break;
                    }
                }
                break;
            case 2:
                if (dn0Var.getParentActivity() != null) {
                    if (motionEvent.getAction() == 1) {
                        yt ytVar2 = new yt(null, false);
                        ytVar2.r = new ql0(dn0Var, i11);
                        dn0Var.presentFragment(ytVar2);
                        break;
                    }
                }
                break;
            default:
                if (dn0Var.getParentActivity() != null) {
                    if (motionEvent.getAction() == 1) {
                        yt ytVar3 = new yt(null, false);
                        ytVar3.r = new ql0(dn0Var, 3);
                        dn0Var.presentFragment(ytVar3);
                        break;
                    }
                }
                break;
        }
        return false;
    }
}
