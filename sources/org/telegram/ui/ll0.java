package org.telegram.ui;

import android.view.MotionEvent;
import android.view.View;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-bcc7d273da888d5c27994201329e5b838e55754b73312241608ee42846efd426 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ll0 implements View.OnTouchListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ xm0 b;

    public /* synthetic */ ll0(xm0 xm0Var, int i10) {
        this.a = i10;
        this.b = xm0Var;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        int i10 = this.a;
        int i11 = 2;
        int i12 = 3;
        xm0 xm0Var = this.b;
        switch (i10) {
            case 0:
                if (xm0Var.getParentActivity() != null) {
                    if (motionEvent.getAction() == 1) {
                        qt qtVar = new qt(null, false);
                        qtVar.r = new zu(28, xm0Var, view);
                        xm0Var.presentFragment(qtVar);
                    }
                    break;
                }
                break;
            case 1:
                if (xm0Var.getParentActivity() != null) {
                    if (motionEvent.getAction() == 1) {
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(xm0Var.getParentActivity());
                        String string = LocaleController.getString(R.string.PassportSelectGender);
                        org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.a;
                        b2Var.R = string;
                        alertDialog$Builder.f(new CharSequence[]{LocaleController.getString(R.string.PassportMale), LocaleController.getString(R.string.PassportFemale)}, new p4(xm0Var, i12));
                        alertDialog$Builder.k(LocaleController.getString(R.string.Cancel), null);
                        xm0Var.showDialog(b2Var);
                    }
                    break;
                }
                break;
            case 2:
                if (xm0Var.getParentActivity() != null) {
                    if (motionEvent.getAction() == 1) {
                        qt qtVar2 = new qt(null, false);
                        qtVar2.r = new ml0(xm0Var, i11);
                        xm0Var.presentFragment(qtVar2);
                    }
                    break;
                }
                break;
            default:
                if (xm0Var.getParentActivity() != null) {
                    if (motionEvent.getAction() == 1) {
                        qt qtVar3 = new qt(null, false);
                        qtVar3.r = new ml0(xm0Var, i12);
                        xm0Var.presentFragment(qtVar3);
                    }
                    break;
                }
                break;
        }
        return true;
    }
}
