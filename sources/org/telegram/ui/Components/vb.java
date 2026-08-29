package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;
import android.view.WindowManager;
import org.telegram.messenger.FileLog;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class vb extends fk0 {
    public final /* synthetic */ int h1 = 0;
    public final /* synthetic */ Object i1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vb(org.telegram.ui.ht htVar, Context context, int i10, org.telegram.ui.ActionBar.c6 c6Var) {
        super(4, i10, context, null, c6Var);
        this.i1 = htVar;
    }

    @Override // org.telegram.ui.Components.fk0, android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        mc mcVar;
        switch (this.h1) {
            case 0:
                xb xbVar = (xb) this.i1;
                if (motionEvent.getAction() == 0) {
                    mc mcVar2 = xbVar.n;
                    if (mcVar2 != null) {
                        mcVar2.i(false);
                    }
                } else if (motionEvent.getAction() == 1 && (mcVar = xbVar.n) != null) {
                    mcVar.i(true);
                }
                break;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // org.telegram.ui.Components.fk0
    public void j() {
        switch (this.h1) {
            case 1:
                super.j();
                org.telegram.ui.ht htVar = (org.telegram.ui.ht) this.i1;
                if (getReactionsWindow() != null) {
                    WindowManager.LayoutParams layoutParams = htVar.x;
                    layoutParams.flags &= -131073;
                    layoutParams.softInputMode = 16;
                } else {
                    htVar.x.flags |= 131072;
                }
                try {
                    ((WindowManager) htVar.w.getSystemService("window")).updateViewLayout(htVar.y, htVar.x);
                    break;
                } catch (Exception e10) {
                    FileLog.e(e10);
                    return;
                }
            default:
                super.j();
                break;
        }
    }

    @Override // org.telegram.ui.Components.fk0
    public void m() {
        switch (this.h1) {
            case 0:
                mc mcVar = mc.w;
                if (mcVar != null) {
                    mcVar.i(false);
                }
                ((xb) this.i1).d.getReactionsWindow().c.setOnClickListener(new h0(this, 5));
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vb(xb xbVar, org.telegram.ui.ActionBar.o2 o2Var, Context context, int i10, org.telegram.ui.ActionBar.c6 c6Var) {
        super(3, i10, context, o2Var, c6Var);
        this.i1 = xbVar;
    }
}
