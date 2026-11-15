package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;
import android.view.WindowManager;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final class gb extends mi0 {
    public final /* synthetic */ int n1 = 0;
    public final /* synthetic */ Object o1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gb(org.telegram.ui.ns nsVar, Context context, int i7, org.telegram.ui.ActionBar.e6 e6Var) {
        super(4, i7, context, null, e6Var);
        this.o1 = nsVar;
    }

    @Override // org.telegram.ui.Components.mi0, android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        xb xbVar;
        switch (this.n1) {
            case 0:
                ib ibVar = (ib) this.o1;
                if (motionEvent.getAction() == 0) {
                    xb xbVar2 = ibVar.n;
                    if (xbVar2 != null) {
                        xbVar2.i(false);
                    }
                } else if (motionEvent.getAction() == 1 && (xbVar = ibVar.n) != null) {
                    xbVar.i(true);
                }
                break;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // org.telegram.ui.Components.mi0
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

    @Override // org.telegram.ui.Components.mi0
    public void m() {
        switch (this.n1) {
            case 0:
                xb xbVar = xb.w;
                if (xbVar != null) {
                    xbVar.i(false);
                }
                ((ib) this.o1).d.getReactionsWindow().c.setOnClickListener(new e0(this, 3));
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gb(ib ibVar, org.telegram.ui.ActionBar.e2 e2Var, Context context, int i7, org.telegram.ui.ActionBar.e6 e6Var) {
        super(3, i7, context, e2Var, e6Var);
        this.o1 = ibVar;
    }
}
