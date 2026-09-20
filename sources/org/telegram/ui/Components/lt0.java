package org.telegram.ui.Components;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-eaaffe05e5b4975c35db95ddc7f057e1a9a0a254a43fe066fa0ad675f8b3973e */
/* loaded from: classes3.dex */
public final class lt0 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ org.telegram.ui.ActionBar.f1 b;
    public final /* synthetic */ org.telegram.ui.ActionBar.f1 c;
    public final /* synthetic */ nt0 d;

    public /* synthetic */ lt0(nt0 nt0Var, org.telegram.ui.ActionBar.f1 f1Var, org.telegram.ui.ActionBar.f1 f1Var2, int i10) {
        this.a = i10;
        this.d = nt0Var;
        this.b = f1Var;
        this.c = f1Var2;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                jv0 jv0Var = this.d.d;
                if (!jv0Var.H1) {
                    org.telegram.ui.ActionBar.f1 f1Var = this.b;
                    boolean z10 = f1Var.getCheckView().a.q;
                    org.telegram.ui.ActionBar.f1 f1Var2 = this.c;
                    if (!z10 && f1Var2.getCheckView().a.q) {
                        float f7 = -jv0Var.s1;
                        jv0Var.s1 = f7;
                        AndroidUtilities.shakeViewSpring(f1Var2, f7);
                        break;
                    } else {
                        f1Var2.setChecked(!f1Var2.getCheckView().a.q);
                        if (f1Var2.getCheckView().a.q && f1Var.getCheckView().a.q) {
                            jv0Var.t1[0].q = 0;
                        } else {
                            jv0Var.t1[0].q = 2;
                        }
                        jv0.s(jv0Var);
                        break;
                    }
                }
                break;
            default:
                jv0 jv0Var2 = this.d.d;
                if (!jv0Var2.H1) {
                    org.telegram.ui.ActionBar.f1 f1Var3 = this.b;
                    boolean z11 = f1Var3.getCheckView().a.q;
                    org.telegram.ui.ActionBar.f1 f1Var4 = this.c;
                    if (!z11 && f1Var4.getCheckView().a.q) {
                        float f10 = -jv0Var2.s1;
                        jv0Var2.s1 = f10;
                        AndroidUtilities.shakeViewSpring(f1Var4, f10);
                        break;
                    } else {
                        f1Var4.setChecked(!f1Var4.getCheckView().a.q);
                        if (f1Var3.getCheckView().a.q && f1Var4.getCheckView().a.q) {
                            jv0Var2.t1[0].q = 0;
                        } else {
                            jv0Var2.t1[0].q = 1;
                        }
                        jv0.s(jv0Var2);
                        break;
                    }
                }
                break;
        }
    }
}
