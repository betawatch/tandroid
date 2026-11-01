package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;
import android.view.WindowManager;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final class fb extends nj0 {
    public final /* synthetic */ int m1 = 0;
    public final /* synthetic */ Object n1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fb(org.telegram.ui.kt ktVar, Context context, int i10, org.telegram.ui.ActionBar.p6 p6Var) {
        super(4, i10, context, null, p6Var);
        this.n1 = ktVar;
    }

    @Override // org.telegram.ui.Components.nj0, android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        wb wbVar;
        switch (this.m1) {
            case 0:
                hb hbVar = (hb) this.n1;
                if (motionEvent.getAction() == 0) {
                    wb wbVar2 = hbVar.n;
                    if (wbVar2 != null) {
                        wbVar2.i(false);
                    }
                } else if (motionEvent.getAction() == 1 && (wbVar = hbVar.n) != null) {
                    wbVar.i(true);
                }
                break;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // org.telegram.ui.Components.nj0
    public void j() {
        switch (this.m1) {
            case 1:
                super.j();
                org.telegram.ui.kt ktVar = (org.telegram.ui.kt) this.n1;
                if (getReactionsWindow() != null) {
                    WindowManager.LayoutParams layoutParams = ktVar.x;
                    layoutParams.flags &= -131073;
                    layoutParams.softInputMode = 16;
                } else {
                    ktVar.x.flags |= 131072;
                }
                try {
                    ((WindowManager) ktVar.w.getSystemService("window")).updateViewLayout(ktVar.y, ktVar.x);
                    break;
                } catch (Exception e) {
                    org.telegram.messenger.f8.g(e, true);
                    return;
                }
            default:
                super.j();
                break;
        }
    }

    @Override // org.telegram.ui.Components.nj0
    public void m() {
        switch (this.m1) {
            case 0:
                wb wbVar = wb.w;
                if (wbVar != null) {
                    wbVar.i(false);
                }
                ((hb) this.n1).d.getReactionsWindow().c.setOnClickListener(new h0(this, 3));
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fb(hb hbVar, org.telegram.ui.ActionBar.k2 k2Var, Context context, int i10, org.telegram.ui.ActionBar.p6 p6Var) {
        super(3, i10, context, k2Var, p6Var);
        this.n1 = hbVar;
    }
}
