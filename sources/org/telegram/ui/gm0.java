package org.telegram.ui;

import android.view.MotionEvent;
import android.view.View;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public final /* synthetic */ class gm0 implements View.OnTouchListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ un0 b;

    public /* synthetic */ gm0(un0 un0Var, int i10) {
        this.a = i10;
        this.b = un0Var;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        int i10 = this.a;
        int i11 = 2;
        int i12 = 3;
        un0 un0Var = this.b;
        switch (i10) {
            case 0:
                if (un0Var.getParentActivity() != null) {
                    if (motionEvent.getAction() == 1) {
                        fu fuVar = new fu(null, false);
                        fuVar.r = new gw(27, un0Var, view);
                        un0Var.presentFragment(fuVar);
                    }
                    break;
                }
                break;
            case 1:
                if (un0Var.getParentActivity() != null) {
                    if (motionEvent.getAction() == 1) {
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(un0Var.getParentActivity());
                        String string = LocaleController.getString(R.string.PassportSelectGender);
                        org.telegram.ui.ActionBar.a2 a2Var = alertDialog$Builder.a;
                        a2Var.R = string;
                        alertDialog$Builder.f(new CharSequence[]{LocaleController.getString(R.string.PassportMale), LocaleController.getString(R.string.PassportFemale)}, new o4(un0Var, i12));
                        alertDialog$Builder.k(LocaleController.getString(R.string.Cancel), null);
                        un0Var.showDialog(a2Var);
                    }
                    break;
                }
                break;
            case 2:
                if (un0Var.getParentActivity() != null) {
                    if (motionEvent.getAction() == 1) {
                        fu fuVar2 = new fu(null, false);
                        fuVar2.r = new hm0(un0Var, i11);
                        un0Var.presentFragment(fuVar2);
                    }
                    break;
                }
                break;
            default:
                if (un0Var.getParentActivity() != null) {
                    if (motionEvent.getAction() == 1) {
                        fu fuVar3 = new fu(null, false);
                        fuVar3.r = new hm0(un0Var, i12);
                        un0Var.presentFragment(fuVar3);
                    }
                    break;
                }
                break;
        }
        return true;
    }
}
