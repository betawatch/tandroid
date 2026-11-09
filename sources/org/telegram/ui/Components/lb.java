package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;
import android.view.WindowManager;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final class lb extends ji0 {
    public final /* synthetic */ int m1 = 0;
    public final /* synthetic */ Object n1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lb(org.telegram.ui.ms msVar, Context context, int i7, org.telegram.ui.ActionBar.g6 g6Var) {
        super(4, i7, context, null, g6Var);
        this.n1 = msVar;
    }

    @Override // org.telegram.ui.Components.ji0, android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        cc ccVar;
        switch (this.m1) {
            case 0:
                nb nbVar = (nb) this.n1;
                if (motionEvent.getAction() == 0) {
                    cc ccVar2 = nbVar.n;
                    if (ccVar2 != null) {
                        ccVar2.i(false);
                    }
                } else if (motionEvent.getAction() == 1 && (ccVar = nbVar.n) != null) {
                    ccVar.i(true);
                }
                break;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // org.telegram.ui.Components.ji0
    public void j() {
        switch (this.m1) {
            case 1:
                super.j();
                org.telegram.ui.ms msVar = (org.telegram.ui.ms) this.n1;
                if (getReactionsWindow() != null) {
                    WindowManager.LayoutParams layoutParams = msVar.x;
                    layoutParams.flags &= -131073;
                    layoutParams.softInputMode = 16;
                } else {
                    msVar.x.flags |= 131072;
                }
                try {
                    ((WindowManager) msVar.w.getSystemService("window")).updateViewLayout(msVar.y, msVar.x);
                    break;
                } catch (Exception e10) {
                    org.telegram.messenger.a8.g(e10, true);
                    return;
                }
            default:
                super.j();
                break;
        }
    }

    @Override // org.telegram.ui.Components.ji0
    public void m() {
        switch (this.m1) {
            case 0:
                cc ccVar = cc.w;
                if (ccVar != null) {
                    ccVar.i(false);
                }
                ((nb) this.n1).d.getReactionsWindow().c.setOnClickListener(new h0(this, 3));
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lb(nb nbVar, org.telegram.ui.ActionBar.f2 f2Var, Context context, int i7, org.telegram.ui.ActionBar.g6 g6Var) {
        super(3, i7, context, f2Var, g6Var);
        this.n1 = nbVar;
    }
}
