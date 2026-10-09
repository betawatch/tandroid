package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;
import android.view.WindowManager;
import org.telegram.messenger.FileLog;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final class cc extends kl0 {
    public final /* synthetic */ int l1 = 0;
    public final /* synthetic */ Object m1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cc(org.telegram.ui.rt rtVar, Context context, int i10, org.telegram.ui.ActionBar.e6 e6Var) {
        super(4, i10, context, null, e6Var);
        this.m1 = rtVar;
    }

    @Override // org.telegram.ui.Components.kl0, android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        tc tcVar;
        switch (this.l1) {
            case 0:
                ec ecVar = (ec) this.m1;
                if (motionEvent.getAction() == 0) {
                    tc tcVar2 = ecVar.n;
                    if (tcVar2 != null) {
                        tcVar2.i(false);
                    }
                } else if (motionEvent.getAction() == 1 && (tcVar = ecVar.n) != null) {
                    tcVar.i(true);
                }
                break;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // org.telegram.ui.Components.kl0
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

    @Override // org.telegram.ui.Components.kl0
    public void m() {
        switch (this.l1) {
            case 0:
                tc tcVar = tc.w;
                if (tcVar != null) {
                    tcVar.i(false);
                }
                ((ec) this.m1).d.getReactionsWindow().c.setOnClickListener(new f0(this, 4));
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cc(ec ecVar, org.telegram.ui.ActionBar.n2 n2Var, Context context, int i10, org.telegram.ui.ActionBar.e6 e6Var) {
        super(3, i10, context, n2Var, e6Var);
        this.m1 = ecVar;
    }
}
