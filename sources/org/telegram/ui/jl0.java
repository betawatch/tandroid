package org.telegram.ui;

import android.view.MotionEvent;
import android.view.View;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class jl0 implements View.OnTouchListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ wm0 b;

    public /* synthetic */ jl0(wm0 wm0Var, int i9) {
        this.a = i9;
        this.b = wm0Var;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        int i9 = this.a;
        int i10 = 2;
        wm0 wm0Var = this.b;
        switch (i9) {
            case 0:
                if (wm0Var.getParentActivity() != null) {
                    if (motionEvent.getAction() == 1) {
                        qt qtVar = new qt(null, false);
                        qtVar.r = new nl0(i10, wm0Var, view);
                        wm0Var.presentFragment(qtVar);
                        break;
                    }
                }
                break;
            case 1:
                if (wm0Var.getParentActivity() != null) {
                    if (motionEvent.getAction() == 1) {
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(wm0Var.getParentActivity());
                        String string = LocaleController.getString(R.string.PassportSelectGender);
                        org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.a;
                        c2Var.N = string;
                        alertDialog$Builder.f(new CharSequence[]{LocaleController.getString(R.string.PassportMale), LocaleController.getString(R.string.PassportFemale)}, new hv(wm0Var, i10));
                        alertDialog$Builder.k(LocaleController.getString(R.string.Cancel), null);
                        wm0Var.showDialog(c2Var);
                        break;
                    }
                }
                break;
            case 2:
                if (wm0Var.getParentActivity() != null) {
                    if (motionEvent.getAction() == 1) {
                        qt qtVar2 = new qt(null, false);
                        qtVar2.r = new kl0(wm0Var, i10);
                        wm0Var.presentFragment(qtVar2);
                        break;
                    }
                }
                break;
            default:
                if (wm0Var.getParentActivity() != null) {
                    if (motionEvent.getAction() == 1) {
                        qt qtVar3 = new qt(null, false);
                        qtVar3.r = new kl0(wm0Var, 3);
                        wm0Var.presentFragment(qtVar3);
                        break;
                    }
                }
                break;
        }
        return false;
    }
}
