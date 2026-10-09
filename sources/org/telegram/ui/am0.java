package org.telegram.ui;

import android.view.MotionEvent;
import android.view.View;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final /* synthetic */ class am0 implements View.OnTouchListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ nn0 b;

    public /* synthetic */ am0(nn0 nn0Var, int i10) {
        this.a = i10;
        this.b = nn0Var;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        int i10 = this.a;
        int i11 = 2;
        nn0 nn0Var = this.b;
        switch (i10) {
            case 0:
                if (nn0Var.getParentActivity() != null) {
                    if (motionEvent.getAction() == 1) {
                        zt ztVar = new zt(null, false);
                        ztVar.r = new rw(24, nn0Var, view);
                        nn0Var.presentFragment(ztVar);
                    }
                    break;
                }
                break;
            case 1:
                if (nn0Var.getParentActivity() != null) {
                    if (motionEvent.getAction() == 1) {
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(nn0Var.getParentActivity());
                        String string = LocaleController.getString(R.string.PassportSelectGender);
                        org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.a;
                        b2Var.R = string;
                        alertDialog$Builder.f(new CharSequence[]{LocaleController.getString(R.string.PassportMale), LocaleController.getString(R.string.PassportFemale)}, new tv(nn0Var, i11));
                        alertDialog$Builder.k(LocaleController.getString(R.string.Cancel), null);
                        nn0Var.showDialog(b2Var);
                    }
                    break;
                }
                break;
            case 2:
                if (nn0Var.getParentActivity() != null) {
                    if (motionEvent.getAction() == 1) {
                        zt ztVar2 = new zt(null, false);
                        ztVar2.r = new bm0(nn0Var, i11);
                        nn0Var.presentFragment(ztVar2);
                    }
                    break;
                }
                break;
            default:
                if (nn0Var.getParentActivity() != null) {
                    if (motionEvent.getAction() == 1) {
                        zt ztVar3 = new zt(null, false);
                        ztVar3.r = new bm0(nn0Var, 3);
                        nn0Var.presentFragment(ztVar3);
                    }
                    break;
                }
                break;
        }
        return true;
    }
}
