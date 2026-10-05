package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;
import android.view.WindowManager;
import org.telegram.messenger.FileLog;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
/* loaded from: classes3.dex */
public final class ac extends sk0 {
    public final /* synthetic */ int l1 = 0;
    public final /* synthetic */ Object m1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ac(org.telegram.ui.rt rtVar, Context context, int i10, org.telegram.ui.ActionBar.d6 d6Var) {
        super(4, i10, context, null, d6Var);
        this.m1 = rtVar;
    }

    @Override // org.telegram.ui.Components.sk0, android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        rc rcVar;
        switch (this.l1) {
            case 0:
                cc ccVar = (cc) this.m1;
                if (motionEvent.getAction() == 0) {
                    rc rcVar2 = ccVar.n;
                    if (rcVar2 != null) {
                        rcVar2.i(false);
                    }
                } else if (motionEvent.getAction() == 1 && (rcVar = ccVar.n) != null) {
                    rcVar.i(true);
                }
                break;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // org.telegram.ui.Components.sk0
    public void j() {
        switch (this.l1) {
            case 1:
                super.j();
                org.telegram.ui.rt rtVar = (org.telegram.ui.rt) this.m1;
                if (getReactionsWindow() != null) {
                    WindowManager.LayoutParams layoutParams = rtVar.x;
                    layoutParams.flags &= -131073;
                    layoutParams.softInputMode = 16;
                } else {
                    rtVar.x.flags |= 131072;
                }
                try {
                    ((WindowManager) rtVar.w.getSystemService("window")).updateViewLayout(rtVar.y, rtVar.x);
                    break;
                } catch (Exception e7) {
                    FileLog.e(e7);
                    return;
                }
            default:
                super.j();
                break;
        }
    }

    @Override // org.telegram.ui.Components.sk0
    public void m() {
        switch (this.l1) {
            case 0:
                rc rcVar = rc.w;
                if (rcVar != null) {
                    rcVar.i(false);
                }
                ((cc) this.m1).d.getReactionsWindow().c.setOnClickListener(new f0(this, 5));
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ac(cc ccVar, org.telegram.ui.ActionBar.n2 n2Var, Context context, int i10, org.telegram.ui.ActionBar.d6 d6Var) {
        super(3, i10, context, n2Var, d6Var);
        this.m1 = ccVar;
    }
}
