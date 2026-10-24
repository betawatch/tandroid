package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;
import android.view.WindowManager;
import org.telegram.messenger.FileLog;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes3.dex */
public final class zb extends gl0 {
    public final /* synthetic */ int m1 = 0;
    public final /* synthetic */ Object n1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zb(org.telegram.ui.ht htVar, Context context, int i10, org.telegram.ui.ActionBar.g6 g6Var) {
        super(4, i10, context, null, g6Var);
        this.n1 = htVar;
    }

    @Override // org.telegram.ui.Components.gl0, android.view.ViewGroup, android.view.View
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

    @Override // org.telegram.ui.Components.gl0
    public void j() {
        switch (this.m1) {
            case 1:
                super.j();
                org.telegram.ui.ht htVar = (org.telegram.ui.ht) this.n1;
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
                } catch (Exception e) {
                    FileLog.e(e);
                    return;
                }
            default:
                super.j();
                break;
        }
    }

    @Override // org.telegram.ui.Components.gl0
    public void m() {
        switch (this.m1) {
            case 0:
                qc qcVar = qc.w;
                if (qcVar != null) {
                    qcVar.i(false);
                }
                ((bc) this.n1).d.getReactionsWindow().c.setOnClickListener(new f0(this, 4));
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zb(bc bcVar, org.telegram.ui.ActionBar.o2 o2Var, Context context, int i10, org.telegram.ui.ActionBar.g6 g6Var) {
        super(3, i10, context, o2Var, g6Var);
        this.n1 = bcVar;
    }
}
