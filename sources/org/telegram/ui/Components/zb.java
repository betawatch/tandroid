package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;
import android.view.WindowManager;
import org.telegram.messenger.FileLog;

/* compiled from: r8-map-id-bcc7d273da888d5c27994201329e5b838e55754b73312241608ee42846efd426 */
/* loaded from: classes3.dex */
public final class zb extends cl0 {
    public final /* synthetic */ int l1 = 0;
    public final /* synthetic */ Object m1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zb(org.telegram.ui.gt gtVar, Context context, int i10, org.telegram.ui.ActionBar.d6 d6Var) {
        super(4, i10, context, null, d6Var);
        this.m1 = gtVar;
    }

    @Override // org.telegram.ui.Components.cl0, android.view.ViewGroup, android.view.View
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

    @Override // org.telegram.ui.Components.cl0
    public void j() {
        switch (this.l1) {
            case 1:
                super.j();
                org.telegram.ui.gt gtVar = (org.telegram.ui.gt) this.m1;
                if (getReactionsWindow() != null) {
                    WindowManager.LayoutParams layoutParams = gtVar.x;
                    layoutParams.flags &= -131073;
                    layoutParams.softInputMode = 16;
                } else {
                    gtVar.x.flags |= 131072;
                }
                try {
                    ((WindowManager) gtVar.w.getSystemService("window")).updateViewLayout(gtVar.y, gtVar.x);
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

    @Override // org.telegram.ui.Components.cl0
    public void m() {
        switch (this.l1) {
            case 0:
                qc qcVar = qc.w;
                if (qcVar != null) {
                    qcVar.i(false);
                }
                ((bc) this.m1).d.getReactionsWindow().c.setOnClickListener(new f0(this, 4));
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zb(bc bcVar, org.telegram.ui.ActionBar.n2 n2Var, Context context, int i10, org.telegram.ui.ActionBar.d6 d6Var) {
        super(3, i10, context, n2Var, d6Var);
        this.m1 = bcVar;
    }
}
