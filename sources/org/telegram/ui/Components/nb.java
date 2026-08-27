package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;
import android.view.WindowManager;
import org.telegram.messenger.FileLog;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class nb extends wj0 {
    public final /* synthetic */ int h1 = 0;
    public final /* synthetic */ Object i1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nb(org.telegram.ui.kt ktVar, Context context, int i10, org.telegram.ui.ActionBar.c6 c6Var) {
        super(4, i10, context, null, c6Var);
        this.i1 = ktVar;
    }

    @Override // org.telegram.ui.Components.wj0, android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        ec ecVar;
        switch (this.h1) {
            case 0:
                pb pbVar = (pb) this.i1;
                if (motionEvent.getAction() == 0) {
                    ec ecVar2 = pbVar.n;
                    if (ecVar2 != null) {
                        ecVar2.i(false);
                    }
                } else if (motionEvent.getAction() == 1 && (ecVar = pbVar.n) != null) {
                    ecVar.i(true);
                }
                break;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // org.telegram.ui.Components.wj0
    public void j() {
        switch (this.h1) {
            case 1:
                super.j();
                org.telegram.ui.kt ktVar = (org.telegram.ui.kt) this.i1;
                if (getReactionsWindow() != null) {
                    WindowManager.LayoutParams layoutParams = ktVar.x;
                    layoutParams.flags &= -131073;
                    layoutParams.softInputMode = 16;
                } else {
                    ktVar.x.flags |= 131072;
                }
                try {
                    ((WindowManager) ktVar.w.getSystemService("window")).updateViewLayout(ktVar.y, ktVar.x);
                    break;
                } catch (Exception e9) {
                    FileLog.e(e9);
                    return;
                }
            default:
                super.j();
                break;
        }
    }

    @Override // org.telegram.ui.Components.wj0
    public void m() {
        switch (this.h1) {
            case 0:
                ec ecVar = ec.w;
                if (ecVar != null) {
                    ecVar.i(false);
                }
                ((pb) this.i1).d.getReactionsWindow().c.setOnClickListener(new f0(this, 5));
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nb(pb pbVar, org.telegram.ui.ActionBar.n2 n2Var, Context context, int i10, org.telegram.ui.ActionBar.c6 c6Var) {
        super(3, i10, context, n2Var, c6Var);
        this.i1 = pbVar;
    }
}
