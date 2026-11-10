package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;
import android.view.WindowManager;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class kb extends ii0 {
    public final /* synthetic */ int m1 = 0;
    public final /* synthetic */ Object n1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kb(org.telegram.ui.ns nsVar, Context context, int i7, org.telegram.ui.ActionBar.h6 h6Var) {
        super(4, i7, context, null, h6Var);
        this.n1 = nsVar;
    }

    @Override // org.telegram.ui.Components.ii0, android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        bc bcVar;
        switch (this.m1) {
            case 0:
                mb mbVar = (mb) this.n1;
                if (motionEvent.getAction() == 0) {
                    bc bcVar2 = mbVar.n;
                    if (bcVar2 != null) {
                        bcVar2.i(false);
                    }
                } else if (motionEvent.getAction() == 1 && (bcVar = mbVar.n) != null) {
                    bcVar.i(true);
                }
                break;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // org.telegram.ui.Components.ii0
    public void j() {
        switch (this.m1) {
            case 1:
                super.j();
                org.telegram.ui.ns nsVar = (org.telegram.ui.ns) this.n1;
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

    @Override // org.telegram.ui.Components.ii0
    public void m() {
        switch (this.m1) {
            case 0:
                bc bcVar = bc.w;
                if (bcVar != null) {
                    bcVar.i(false);
                }
                ((mb) this.n1).d.getReactionsWindow().c.setOnClickListener(new g0(this, 3));
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kb(mb mbVar, org.telegram.ui.ActionBar.f2 f2Var, Context context, int i7, org.telegram.ui.ActionBar.h6 h6Var) {
        super(3, i7, context, f2Var, h6Var);
        this.n1 = mbVar;
    }
}
