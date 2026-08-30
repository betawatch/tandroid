package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;
import android.view.WindowManager;
import org.telegram.messenger.FileLog;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class rb extends pk0 {
    public final /* synthetic */ int i1 = 0;
    public final /* synthetic */ Object j1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rb(org.telegram.ui.pt ptVar, Context context, int i10, org.telegram.ui.ActionBar.f6 f6Var) {
        super(4, i10, context, null, f6Var);
        this.j1 = ptVar;
    }

    @Override // org.telegram.ui.Components.pk0, android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        ic icVar;
        switch (this.i1) {
            case 0:
                tb tbVar = (tb) this.j1;
                if (motionEvent.getAction() == 0) {
                    ic icVar2 = tbVar.n;
                    if (icVar2 != null) {
                        icVar2.i(false);
                    }
                } else if (motionEvent.getAction() == 1 && (icVar = tbVar.n) != null) {
                    icVar.i(true);
                }
                break;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // org.telegram.ui.Components.pk0
    public void j() {
        switch (this.i1) {
            case 1:
                super.j();
                org.telegram.ui.pt ptVar = (org.telegram.ui.pt) this.j1;
                if (getReactionsWindow() != null) {
                    WindowManager.LayoutParams layoutParams = ptVar.x;
                    layoutParams.flags &= -131073;
                    layoutParams.softInputMode = 16;
                } else {
                    ptVar.x.flags |= 131072;
                }
                try {
                    ((WindowManager) ptVar.w.getSystemService("window")).updateViewLayout(ptVar.y, ptVar.x);
                    break;
                } catch (Exception e) {
                    FileLog.e(e);
                    return;
                }
            default:
                super.j();
                break;
        }
    }

    @Override // org.telegram.ui.Components.pk0
    public void m() {
        switch (this.i1) {
            case 0:
                ic icVar = ic.w;
                if (icVar != null) {
                    icVar.i(false);
                }
                ((tb) this.j1).d.getReactionsWindow().c.setOnClickListener(new g0(this, 5));
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rb(tb tbVar, org.telegram.ui.ActionBar.p2 p2Var, Context context, int i10, org.telegram.ui.ActionBar.f6 f6Var) {
        super(3, i10, context, p2Var, f6Var);
        this.j1 = tbVar;
    }
}
