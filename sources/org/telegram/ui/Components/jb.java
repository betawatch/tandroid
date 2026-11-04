package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;
import android.view.WindowManager;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class jb extends li0 {
    public final /* synthetic */ int n1 = 0;
    public final /* synthetic */ Object o1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jb(org.telegram.ui.is isVar, Context context, int i3, org.telegram.ui.ActionBar.e6 e6Var) {
        super(4, i3, context, null, e6Var);
        this.o1 = isVar;
    }

    @Override // org.telegram.ui.Components.li0, android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        ac acVar;
        switch (this.n1) {
            case 0:
                lb lbVar = (lb) this.o1;
                if (motionEvent.getAction() == 0) {
                    ac acVar2 = lbVar.n;
                    if (acVar2 != null) {
                        acVar2.i(false);
                    }
                } else if (motionEvent.getAction() == 1 && (acVar = lbVar.n) != null) {
                    acVar.i(true);
                }
                break;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // org.telegram.ui.Components.li0
    public void j() {
        switch (this.n1) {
            case 1:
                super.j();
                org.telegram.ui.is isVar = (org.telegram.ui.is) this.o1;
                if (getReactionsWindow() != null) {
                    WindowManager.LayoutParams layoutParams = isVar.x;
                    layoutParams.flags &= -131073;
                    layoutParams.softInputMode = 16;
                } else {
                    isVar.x.flags |= 131072;
                }
                try {
                    ((WindowManager) isVar.w.getSystemService("window")).updateViewLayout(isVar.y, isVar.x);
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

    @Override // org.telegram.ui.Components.li0
    public void m() {
        switch (this.n1) {
            case 0:
                ac acVar = ac.w;
                if (acVar != null) {
                    acVar.i(false);
                }
                ((lb) this.o1).d.getReactionsWindow().c.setOnClickListener(new f0(this, 3));
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jb(lb lbVar, org.telegram.ui.ActionBar.d2 d2Var, Context context, int i3, org.telegram.ui.ActionBar.e6 e6Var) {
        super(3, i3, context, d2Var, e6Var);
        this.o1 = lbVar;
    }
}
