package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;
import android.view.WindowManager;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class ob extends xi0 {
    public final /* synthetic */ int n1 = 0;
    public final /* synthetic */ Object o1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ob(org.telegram.ui.ns nsVar, Context context, int i7, org.telegram.ui.ActionBar.i6 i6Var) {
        super(4, i7, context, null, i6Var);
        this.o1 = nsVar;
    }

    @Override // org.telegram.ui.Components.xi0, android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        fc fcVar;
        switch (this.n1) {
            case 0:
                qb qbVar = (qb) this.o1;
                if (motionEvent.getAction() == 0) {
                    fc fcVar2 = qbVar.n;
                    if (fcVar2 != null) {
                        fcVar2.i(false);
                    }
                } else if (motionEvent.getAction() == 1 && (fcVar = qbVar.n) != null) {
                    fcVar.i(true);
                }
                break;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // org.telegram.ui.Components.xi0
    public void j() {
        switch (this.n1) {
            case 1:
                super.j();
                org.telegram.ui.ns nsVar = (org.telegram.ui.ns) this.o1;
                if (getReactionsWindow() != null) {
                    WindowManager.LayoutParams layoutParams = nsVar.x;
                    layoutParams.flags &= -131073;
                    layoutParams.softInputMode = 16;
                } else {
                    nsVar.x.flags |= 131072;
                }
                try {
                    ((WindowManager) nsVar.w.getSystemService("window")).updateViewLayout(nsVar.y, nsVar.x);
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

    @Override // org.telegram.ui.Components.xi0
    public void m() {
        switch (this.n1) {
            case 0:
                fc fcVar = fc.w;
                if (fcVar != null) {
                    fcVar.i(false);
                }
                ((qb) this.o1).d.getReactionsWindow().c.setOnClickListener(new n0(this, 3));
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ob(qb qbVar, org.telegram.ui.ActionBar.g2 g2Var, Context context, int i7, org.telegram.ui.ActionBar.i6 i6Var) {
        super(3, i7, context, g2Var, i6Var);
        this.o1 = qbVar;
    }
}
