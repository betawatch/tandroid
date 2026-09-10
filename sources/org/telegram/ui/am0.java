package org.telegram.ui;

import android.view.MotionEvent;
import android.view.View;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final /* synthetic */ class am0 implements View.OnTouchListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ on0 b;

    public /* synthetic */ am0(on0 on0Var, int i10) {
        this.a = i10;
        this.b = on0Var;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        int i10 = this.a;
        int i11 = 2;
        on0 on0Var = this.b;
        switch (i10) {
            case 0:
                if (on0Var.getParentActivity() != null) {
                    if (motionEvent.getAction() == 1) {
                        bu buVar = new bu(null, false);
                        buVar.r = new l80(18, on0Var, view);
                        on0Var.presentFragment(buVar);
                        break;
                    }
                }
                break;
            case 1:
                if (on0Var.getParentActivity() != null) {
                    if (motionEvent.getAction() == 1) {
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(on0Var.getParentActivity());
                        String string = LocaleController.getString(R.string.PassportSelectGender);
                        org.telegram.ui.ActionBar.d2 d2Var = alertDialog$Builder.a;
                        d2Var.R = string;
                        alertDialog$Builder.f(new CharSequence[]{LocaleController.getString(R.string.PassportMale), LocaleController.getString(R.string.PassportFemale)}, new wv(on0Var, i11));
                        alertDialog$Builder.k(LocaleController.getString(R.string.Cancel), null);
                        on0Var.showDialog(d2Var);
                        break;
                    }
                }
                break;
            case 2:
                if (on0Var.getParentActivity() != null) {
                    if (motionEvent.getAction() == 1) {
                        bu buVar2 = new bu(null, false);
                        buVar2.r = new bm0(on0Var, i11);
                        on0Var.presentFragment(buVar2);
                        break;
                    }
                }
                break;
            default:
                if (on0Var.getParentActivity() != null) {
                    if (motionEvent.getAction() == 1) {
                        bu buVar3 = new bu(null, false);
                        buVar3.r = new bm0(on0Var, 3);
                        on0Var.presentFragment(buVar3);
                        break;
                    }
                }
                break;
        }
        return false;
    }
}
