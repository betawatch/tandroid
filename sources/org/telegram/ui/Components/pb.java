package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;
import android.view.WindowManager;
import org.telegram.messenger.FileLog;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class pb extends uj0 {
    public final /* synthetic */ int h1 = 0;
    public final /* synthetic */ Object i1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pb(org.telegram.ui.ht htVar, Context context, int i9, org.telegram.ui.ActionBar.b6 b6Var) {
        super(4, i9, context, null, b6Var);
        this.i1 = htVar;
    }

    @Override // org.telegram.ui.Components.uj0, android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        gc gcVar;
        switch (this.h1) {
            case 0:
                rb rbVar = (rb) this.i1;
                if (motionEvent.getAction() == 0) {
                    gc gcVar2 = rbVar.n;
                    if (gcVar2 != null) {
                        gcVar2.i(false);
                    }
                } else if (motionEvent.getAction() == 1 && (gcVar = rbVar.n) != null) {
                    gcVar.i(true);
                }
                break;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // org.telegram.ui.Components.uj0
    public void j() {
        switch (this.h1) {
            case 1:
                super.j();
                org.telegram.ui.ht htVar = (org.telegram.ui.ht) this.i1;
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
                } catch (Exception e10) {
                    FileLog.e(e10);
                    return;
                }
            default:
                super.j();
                break;
        }
    }

    @Override // org.telegram.ui.Components.uj0
    public void m() {
        switch (this.h1) {
            case 0:
                gc gcVar = gc.w;
                if (gcVar != null) {
                    gcVar.i(false);
                }
                ((rb) this.i1).d.getReactionsWindow().c.setOnClickListener(new f0(this, 5));
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pb(rb rbVar, org.telegram.ui.ActionBar.o2 o2Var, Context context, int i9, org.telegram.ui.ActionBar.b6 b6Var) {
        super(3, i9, context, o2Var, b6Var);
        this.i1 = rbVar;
    }
}
