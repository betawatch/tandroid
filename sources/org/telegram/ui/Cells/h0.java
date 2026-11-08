package org.telegram.ui.Cells;

import android.content.Context;
import android.view.MotionEvent;
import org.telegram.ui.Components.mm0;
import org.telegram.ui.w61;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes3.dex */
public final class h0 extends mm0 {
    public final /* synthetic */ int m0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h0(int i7, Context context, org.telegram.ui.ActionBar.f6 f6Var, boolean z9) {
        super(context, f6Var, z9);
        this.m0 = i7;
    }

    @Override // org.telegram.ui.Components.mm0, android.view.View
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
    public h0(Context context, w61 w61Var) {
        super(context, w61Var, false);
        this.m0 = 3;
    }
}
