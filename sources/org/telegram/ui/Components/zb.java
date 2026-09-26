package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;
import android.view.WindowManager;
import org.telegram.messenger.FileLog;

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
/* loaded from: classes3.dex */
public final class zb extends qk0 {
    public final /* synthetic */ int l1 = 0;
    public final /* synthetic */ Object m1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zb(org.telegram.ui.nt ntVar, Context context, int i10, org.telegram.ui.ActionBar.d6 d6Var) {
        super(4, i10, context, null, d6Var);
        this.m1 = ntVar;
    }

    @Override // org.telegram.ui.Components.qk0, android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        qc qcVar;
        switch (this.l1) {
            case 0:
                bc bcVar = (bc) this.m1;
                if (motionEvent.getAction() == 0) {
                    qc qcVar2 = bcVar.n;
                    if (qcVar2 != null) {
                        qcVar2.i(false);
                    }
                } else if (motionEvent.getAction() == 1 && (qcVar = bcVar.n) != null) {
                    qcVar.i(true);
                }
                break;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // org.telegram.ui.Components.qk0
    public void j() {
        switch (this.l1) {
            case 1:
                super.j();
                org.telegram.ui.nt ntVar = (org.telegram.ui.nt) this.m1;
                if (getReactionsWindow() != null) {
                    WindowManager.LayoutParams layoutParams = ntVar.x;
                    layoutParams.flags &= -131073;
                    layoutParams.softInputMode = 16;
                } else {
                    ntVar.x.flags |= 131072;
                }
                try {
                    ((WindowManager) ntVar.w.getSystemService("window")).updateViewLayout(ntVar.y, ntVar.x);
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

    @Override // org.telegram.ui.Components.qk0
    public void m() {
        switch (this.l1) {
            case 0:
                qc qcVar = qc.w;
                if (qcVar != null) {
                    qcVar.i(false);
                }
                ((bc) this.m1).d.getReactionsWindow().c.setOnClickListener(new f0(this, 5));
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zb(bc bcVar, org.telegram.ui.ActionBar.m2 m2Var, Context context, int i10, org.telegram.ui.ActionBar.d6 d6Var) {
        super(3, i10, context, m2Var, d6Var);
        this.m1 = bcVar;
    }
}
