package org.telegram.ui;

import android.view.MotionEvent;
import android.view.View;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final /* synthetic */ class jl0 implements View.OnTouchListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ xm0 b;

    public /* synthetic */ jl0(xm0 xm0Var, int i10) {
        this.a = i10;
        this.b = xm0Var;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        int i10 = this.a;
        int i11 = 2;
        xm0 xm0Var = this.b;
        switch (i10) {
            case 0:
                if (xm0Var.getParentActivity() != null) {
                    if (motionEvent.getAction() == 1) {
                        tt ttVar = new tt(null, false);
                        ttVar.r = new nl0(i11, xm0Var, view);
                        xm0Var.presentFragment(ttVar);
                        break;
                    }
                }
                break;
            case 1:
                if (xm0Var.getParentActivity() != null) {
                    if (motionEvent.getAction() == 1) {
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(xm0Var.getParentActivity());
                        String string = LocaleController.getString(R.string.PassportSelectGender);
                        org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.a;
                        b2Var.N = string;
                        alertDialog$Builder.f(new CharSequence[]{LocaleController.getString(R.string.PassportMale), LocaleController.getString(R.string.PassportFemale)}, new kv(xm0Var, i11));
                        alertDialog$Builder.k(LocaleController.getString(R.string.Cancel), null);
                        xm0Var.showDialog(b2Var);
                        break;
                    }
                }
                break;
            case 2:
                if (xm0Var.getParentActivity() != null) {
                    if (motionEvent.getAction() == 1) {
                        tt ttVar2 = new tt(null, false);
                        ttVar2.r = new kl0(xm0Var, i11);
                        xm0Var.presentFragment(ttVar2);
                        break;
                    }
                }
                break;
            default:
                if (xm0Var.getParentActivity() != null) {
                    if (motionEvent.getAction() == 1) {
                        tt ttVar3 = new tt(null, false);
                        ttVar3.r = new kl0(xm0Var, 3);
                        xm0Var.presentFragment(ttVar3);
                        break;
                    }
                }
                break;
        }
        return false;
    }
}
