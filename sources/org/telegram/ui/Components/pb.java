package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;
import android.view.WindowManager;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes3.dex */
public final class pb extends xi0 {
    public final /* synthetic */ int n1 = 0;
    public final /* synthetic */ Object o1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pb(org.telegram.ui.ns nsVar, Context context, int i7, org.telegram.ui.ActionBar.h6 h6Var) {
        super(4, i7, context, null, h6Var);
        this.o1 = nsVar;
    }

    @Override // org.telegram.ui.Components.xi0, android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        gc gcVar;
        switch (this.n1) {
            case 0:
                rb rbVar = (rb) this.o1;
                if (motionEvent.getAction() == 0) {
                    gc gcVar2 = rbVar.n;
                    if (gcVar2 != null) {
                        gcVar2.i(false);
                    }
                } else if (motionEvent.getAction() == 1 && (gcVar = rbVar.n) != null) {
                    gcVar.i(true);
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
                gc gcVar = gc.w;
                if (gcVar != null) {
                    gcVar.i(false);
                }
                ((rb) this.o1).d.getReactionsWindow().c.setOnClickListener(new o0(this, 3));
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pb(rb rbVar, org.telegram.ui.ActionBar.g2 g2Var, Context context, int i7, org.telegram.ui.ActionBar.h6 h6Var) {
        super(3, i7, context, g2Var, h6Var);
        this.o1 = rbVar;
    }
}
