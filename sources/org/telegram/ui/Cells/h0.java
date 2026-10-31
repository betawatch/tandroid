package org.telegram.ui.Cells;

import android.content.Context;
import android.view.MotionEvent;
import org.telegram.ui.Components.nn0;
import org.telegram.ui.n81;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class h0 extends nn0 {
    public final /* synthetic */ int m0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h0(int i10, Context context, org.telegram.ui.ActionBar.p6 p6Var, boolean z10) {
        super(context, p6Var, z10);
        this.m0 = i10;
    }

    @Override // org.telegram.ui.Components.nn0, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        switch (this.m0) {
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
    public /* synthetic */ h0(Context context) {
        super(context);
        this.m0 = 1;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h0(Context context, n81 n81Var) {
        super(context, n81Var, false);
        this.m0 = 3;
    }
}
