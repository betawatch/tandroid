package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;
import android.view.WindowManager;
import org.telegram.messenger.FileLog;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes3.dex */
public final class yb extends sk0 {
    public final /* synthetic */ int l1 = 0;
    public final /* synthetic */ Object m1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yb(org.telegram.ui.st stVar, Context context, int i10, org.telegram.ui.ActionBar.f6 f6Var) {
        super(4, i10, context, null, f6Var);
        this.m1 = stVar;
    }

    @Override // org.telegram.ui.Components.sk0, android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        pc pcVar;
        switch (this.l1) {
            case 0:
                ac acVar = (ac) this.m1;
                if (motionEvent.getAction() == 0) {
                    pc pcVar2 = acVar.n;
                    if (pcVar2 != null) {
                        pcVar2.i(false);
                    }
                } else if (motionEvent.getAction() == 1 && (pcVar = acVar.n) != null) {
                    pcVar.i(true);
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

    @Override // org.telegram.ui.Components.sk0
    public void m() {
        switch (this.l1) {
            case 0:
                pc pcVar = pc.w;
                if (pcVar != null) {
                    pcVar.i(false);
                }
                ((ac) this.m1).d.getReactionsWindow().c.setOnClickListener(new f0(this, 5));
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yb(ac acVar, org.telegram.ui.ActionBar.n2 n2Var, Context context, int i10, org.telegram.ui.ActionBar.f6 f6Var) {
        super(3, i10, context, n2Var, f6Var);
        this.m1 = acVar;
    }
}
