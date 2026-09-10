package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;
import android.view.WindowManager;
import org.telegram.messenger.FileLog;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class yb extends pk0 {
    public final /* synthetic */ int l1 = 0;
    public final /* synthetic */ Object m1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yb(org.telegram.ui.tt ttVar, Context context, int i10, org.telegram.ui.ActionBar.f6 f6Var) {
        super(4, i10, context, null, f6Var);
        this.m1 = ttVar;
    }

    @Override // org.telegram.ui.Components.pk0, android.view.ViewGroup, android.view.View
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

    @Override // org.telegram.ui.Components.pk0
    public void j() {
        switch (this.l1) {
            case 1:
                super.j();
                org.telegram.ui.tt ttVar = (org.telegram.ui.tt) this.m1;
                if (getReactionsWindow() != null) {
                    WindowManager.LayoutParams layoutParams = ttVar.x;
                    layoutParams.flags &= -131073;
                    layoutParams.softInputMode = 16;
                } else {
                    ttVar.x.flags |= 131072;
                }
                try {
                    ((WindowManager) ttVar.w.getSystemService("window")).updateViewLayout(ttVar.y, ttVar.x);
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

    @Override // org.telegram.ui.Components.pk0
    public void m() {
        switch (this.l1) {
            case 0:
                pc pcVar = pc.w;
                if (pcVar != null) {
                    pcVar.i(false);
                }
                ((ac) this.m1).d.getReactionsWindow().c.setOnClickListener(new h0(this, 5));
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yb(ac acVar, org.telegram.ui.ActionBar.p2 p2Var, Context context, int i10, org.telegram.ui.ActionBar.f6 f6Var) {
        super(3, i10, context, p2Var, f6Var);
        this.m1 = acVar;
    }
}
