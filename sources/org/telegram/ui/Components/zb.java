package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;
import android.view.WindowManager;
import org.telegram.messenger.FileLog;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class zb extends fl0 {
    public final /* synthetic */ int m1 = 0;
    public final /* synthetic */ Object n1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zb(org.telegram.ui.ft ftVar, Context context, int i10, org.telegram.ui.ActionBar.u6 u6Var) {
        super(4, i10, context, null, u6Var);
        this.n1 = ftVar;
    }

    @Override // org.telegram.ui.Components.fl0, android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        qc qcVar;
        switch (this.m1) {
            case 0:
                bc bcVar = (bc) this.n1;
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

    @Override // org.telegram.ui.Components.fl0
    public void j() {
        switch (this.m1) {
            case 1:
                super.j();
                org.telegram.ui.ft ftVar = (org.telegram.ui.ft) this.n1;
                if (getReactionsWindow() != null) {
                    WindowManager.LayoutParams layoutParams = ftVar.x;
                    layoutParams.flags &= -131073;
                    layoutParams.softInputMode = 16;
                } else {
                    ftVar.x.flags |= 131072;
                }
                try {
                    ((WindowManager) ftVar.w.getSystemService("window")).updateViewLayout(ftVar.y, ftVar.x);
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

    @Override // org.telegram.ui.Components.fl0
    public void m() {
        switch (this.m1) {
            case 0:
                qc qcVar = qc.x;
                if (qcVar != null) {
                    qcVar.i(false);
                }
                ((bc) this.n1).d.getReactionsWindow().c.setOnClickListener(new f0(this, 4));
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zb(bc bcVar, org.telegram.ui.ActionBar.r2 r2Var, Context context, int i10, org.telegram.ui.ActionBar.u6 u6Var) {
        super(3, i10, context, r2Var, u6Var);
        this.n1 = bcVar;
    }
}
