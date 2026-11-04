package org.telegram.ui;

import android.view.MotionEvent;
import android.view.View;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class oi0 implements View.OnTouchListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ yj0 b;

    public /* synthetic */ oi0(yj0 yj0Var, int i3) {
        this.a = i3;
        this.b = yj0Var;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        int i3 = this.a;
        int i10 = 2;
        int i11 = 3;
        yj0 yj0Var = this.b;
        switch (i3) {
            case 0:
                if (yj0Var.getParentActivity() != null) {
                    if (motionEvent.getAction() == 1) {
                        os osVar = new os(null, false);
                        osVar.r = new rb0(6, yj0Var, view);
                        yj0Var.presentFragment(osVar);
                    }
                    break;
                }
                break;
            case 1:
                if (yj0Var.getParentActivity() != null) {
                    if (motionEvent.getAction() == 1) {
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(yj0Var.getParentActivity());
                        String M0 = org.telegram.messenger.bd.M0(2131747474, null);
                        org.telegram.ui.ActionBar.s1 s1Var = alertDialog$Builder.a;
                        s1Var.S = M0;
                        alertDialog$Builder.f(new CharSequence[]{org.telegram.messenger.bd.M0(2131747516, null), org.telegram.messenger.bd.M0(2131747577, null)}, new m4(yj0Var, i11));
                        alertDialog$Builder.k(org.telegram.messenger.bd.M0(2131752589, null), null);
                        yj0Var.showDialog(s1Var);
                    }
                    break;
                }
                break;
            case 2:
                if (yj0Var.getParentActivity() != null) {
                    if (motionEvent.getAction() == 1) {
                        os osVar2 = new os(null, false);
                        osVar2.r = new pi0(yj0Var, i10);
                        yj0Var.presentFragment(osVar2);
                    }
                    break;
                }
                break;
            default:
                if (yj0Var.getParentActivity() != null) {
                    if (motionEvent.getAction() == 1) {
                        os osVar3 = new os(null, false);
                        osVar3.r = new pi0(yj0Var, i11);
                        yj0Var.presentFragment(osVar3);
                    }
                    break;
                }
                break;
        }
        return true;
    }
}
