package org.telegram.ui.Cells;

import android.content.Context;
import android.view.MotionEvent;
import org.telegram.ui.Components.go0;
import org.telegram.ui.xc1;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final class j0 extends go0 {
    public final /* synthetic */ int l0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j0(int i10, Context context, org.telegram.ui.ActionBar.f6 f6Var, boolean z10) {
        super(context, f6Var, z10);
        this.l0 = i10;
    }

    @Override // org.telegram.ui.Components.go0, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        switch (this.l0) {
            case 0:
                if (motionEvent.getAction() == 0) {
                    getParent().requestDisallowInterceptTouchEvent(true);
                }
                break;
            case 1:
                if (motionEvent.getAction() == 0) {
                    getParent().requestDisallowInterceptTouchEvent(true);
                }
                break;
            case 2:
                if (motionEvent.getAction() == 0) {
                    getParent().requestDisallowInterceptTouchEvent(true);
                }
                break;
            default:
                if (motionEvent.getAction() == 0) {
                    getParent().requestDisallowInterceptTouchEvent(true);
                }
                break;
        }
        return d(motionEvent);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j0(Context context) {
        super(context);
        this.l0 = 1;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j0(Context context, xc1 xc1Var) {
        super(context, xc1Var, false);
        this.l0 = 3;
    }
}
