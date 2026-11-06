package org.telegram.ui;

import android.graphics.RectF;
import android.view.ViewTreeObserver;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes3.dex */
public final /* synthetic */ class fk implements ViewTreeObserver.OnPreDrawListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ fk(Object obj, int i7) {
        this.a = i7;
        this.b = obj;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        org.telegram.ui.ActionBar.k kVar;
        int i7 = this.a;
        Object obj = this.b;
        switch (i7) {
            case 0:
                kVar = ((org.telegram.ui.ActionBar.f2) ((gk) obj).d).actionBar;
                kVar.invalidate();
                break;
            case 1:
                ProfileActivity profileActivity = (ProfileActivity) obj;
                RectF rectF = ProfileActivity.S6;
                profileActivity.y5();
                profileActivity.z5();
                break;
            default:
                ((c51) obj).t0();
                break;
        }
        return true;
    }
}
