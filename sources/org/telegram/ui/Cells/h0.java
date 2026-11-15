package org.telegram.ui.Cells;

import android.content.Context;
import android.view.MotionEvent;
import org.telegram.ui.Components.qm0;
import org.telegram.ui.s61;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class h0 extends qm0 {
    public final /* synthetic */ int n0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h0(int i7, Context context, org.telegram.ui.ActionBar.e6 e6Var, boolean z10) {
        super(context, e6Var, z10);
        this.n0 = i7;
    }

    @Override // org.telegram.ui.Components.qm0, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        switch (this.n0) {
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
        this.n0 = 1;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h0(Context context, s61 s61Var) {
        super(context, s61Var, false);
        this.n0 = 3;
    }
}
