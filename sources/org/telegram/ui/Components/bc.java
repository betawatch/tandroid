package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;
import android.view.WindowManager;
import org.telegram.messenger.FileLog;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes3.dex */
public final class bc extends gl0 {
    public final /* synthetic */ int l1 = 0;
    public final /* synthetic */ Object m1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bc(org.telegram.ui.xt xtVar, Context context, int i10, org.telegram.ui.ActionBar.c6 c6Var) {
        super(4, i10, context, null, c6Var);
        this.m1 = xtVar;
    }

    @Override // org.telegram.ui.Components.gl0, android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        sc scVar;
        switch (this.l1) {
            case 0:
                dc dcVar = (dc) this.m1;
                if (motionEvent.getAction() == 0) {
                    sc scVar2 = dcVar.n;
                    if (scVar2 != null) {
                        scVar2.i(false);
                    }
                } else if (motionEvent.getAction() == 1 && (scVar = dcVar.n) != null) {
                    scVar.i(true);
                }
                break;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // org.telegram.ui.Components.gl0
    public void j() {
        switch (this.l1) {
            case 1:
                super.j();
                org.telegram.ui.xt xtVar = (org.telegram.ui.xt) this.m1;
                if (getReactionsWindow() != null) {
                    WindowManager.LayoutParams layoutParams = xtVar.x;
                    layoutParams.flags &= -131073;
                    layoutParams.softInputMode = 16;
                } else {
                    xtVar.x.flags |= 131072;
                }
                try {
                    ((WindowManager) xtVar.w.getSystemService("window")).updateViewLayout(xtVar.y, xtVar.x);
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
        switch (this.l1) {
            case 0:
                sc scVar = sc.w;
                if (scVar != null) {
                    scVar.i(false);
                }
                ((dc) this.m1).d.getReactionsWindow().c.setOnClickListener(new f0(this, 4));
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bc(dc dcVar, org.telegram.ui.ActionBar.m2 m2Var, Context context, int i10, org.telegram.ui.ActionBar.c6 c6Var) {
        super(3, i10, context, m2Var, c6Var);
        this.m1 = dcVar;
    }
}
