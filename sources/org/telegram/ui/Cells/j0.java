package org.telegram.ui.Cells;

import android.content.Context;
import android.view.MotionEvent;
import org.telegram.ui.Components.pn0;
import org.telegram.ui.ob1;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class j0 extends pn0 {
    public final /* synthetic */ int h0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j0(int i9, Context context, org.telegram.ui.ActionBar.b6 b6Var, boolean z10) {
        super(context, b6Var, z10);
        this.h0 = i9;
    }

    @Override // org.telegram.ui.Components.pn0, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        switch (this.h0) {
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
        this.h0 = 1;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j0(Context context, ob1 ob1Var) {
        super(context, ob1Var, false);
        this.h0 = 3;
    }
}
