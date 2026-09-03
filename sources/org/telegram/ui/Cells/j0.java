package org.telegram.ui.Cells;

import android.content.Context;
import android.view.MotionEvent;
import org.telegram.ui.Components.ko0;
import org.telegram.ui.ic1;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class j0 extends ko0 {
    public final /* synthetic */ int i0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j0(int i10, Context context, org.telegram.ui.ActionBar.g6 g6Var, boolean z4) {
        super(context, g6Var, z4);
        this.i0 = i10;
    }

    @Override // org.telegram.ui.Components.ko0, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        switch (this.i0) {
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
        this.i0 = 1;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j0(Context context, ic1 ic1Var) {
        super(context, ic1Var, false);
        this.i0 = 3;
    }
}
