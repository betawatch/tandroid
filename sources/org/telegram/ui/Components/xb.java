package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;
import android.view.WindowManager;
import org.telegram.messenger.FileLog;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public final class xb extends fk0 {
    public final /* synthetic */ int l1 = 0;
    public final /* synthetic */ Object m1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xb(org.telegram.ui.st stVar, Context context, int i10, org.telegram.ui.ActionBar.e6 e6Var) {
        super(4, i10, context, null, e6Var);
        this.m1 = stVar;
    }

    @Override // org.telegram.ui.Components.fk0, android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        oc ocVar;
        switch (this.l1) {
            case 0:
                zb zbVar = (zb) this.m1;
                if (motionEvent.getAction() == 0) {
                    oc ocVar2 = zbVar.n;
                    if (ocVar2 != null) {
                        ocVar2.i(false);
                    }
                } else if (motionEvent.getAction() == 1 && (ocVar = zbVar.n) != null) {
                    ocVar.i(true);
                }
                break;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // org.telegram.ui.Components.fk0
    public void j() {
        switch (this.l1) {
            case 1:
                super.j();
                org.telegram.ui.st stVar = (org.telegram.ui.st) this.m1;
                if (getReactionsWindow() != null) {
                    WindowManager.LayoutParams layoutParams = stVar.x;
                    layoutParams.flags &= -131073;
                    layoutParams.softInputMode = 16;
                } else {
                    stVar.x.flags |= 131072;
                }
                try {
                    ((WindowManager) stVar.w.getSystemService("window")).updateViewLayout(stVar.y, stVar.x);
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

    @Override // org.telegram.ui.Components.fk0
    public void m() {
        switch (this.l1) {
            case 0:
                oc ocVar = oc.w;
                if (ocVar != null) {
                    ocVar.i(false);
                }
                ((zb) this.m1).d.getReactionsWindow().c.setOnClickListener(new f0(this, 5));
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xb(zb zbVar, org.telegram.ui.ActionBar.n2 n2Var, Context context, int i10, org.telegram.ui.ActionBar.e6 e6Var) {
        super(3, i10, context, n2Var, e6Var);
        this.m1 = zbVar;
    }
}
