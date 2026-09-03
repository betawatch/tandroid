package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ew0 implements org.telegram.ui.ActionBar.c2, Utilities.Callback5 {
    public final /* synthetic */ int a;
    public final /* synthetic */ fw0 b;

    public /* synthetic */ ew0(fw0 fw0Var, int i10) {
        this.a = i10;
        this.b = fw0Var;
    }

    @Override // org.telegram.ui.ActionBar.c2
    public void l(org.telegram.ui.ActionBar.d2 d2Var, int i10) {
        switch (this.a) {
            case 0:
                this.b.Y();
                break;
            default:
                this.b.finishFragment();
                break;
        }
    }

    @Override // org.telegram.messenger.Utilities.Callback5
    public void run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        View view = (View) obj2;
        ((Integer) obj3).intValue();
        ((Float) obj4).floatValue();
        ((Float) obj5).floatValue();
        fw0 fw0Var = this.b;
        fw0Var.getClass();
        if (((org.telegram.ui.Components.i51) obj).d == 1) {
            org.telegram.ui.Cells.r8 r8Var = (org.telegram.ui.Cells.r8) view;
            boolean z4 = !r8Var.e.h;
            fw0Var.r = z4;
            r8Var.setChecked(z4);
            fw0Var.d.V2.N(true);
            fw0Var.V(true);
        }
    }
}
