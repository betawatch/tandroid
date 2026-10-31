package org.telegram.ui;

import android.graphics.RectF;
import android.view.ViewTreeObserver;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class bl implements ViewTreeObserver.OnPreDrawListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ bl(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        org.telegram.ui.ActionBar.l lVar;
        int i10 = this.a;
        Object obj = this.b;
        switch (i10) {
            case 0:
                lVar = ((org.telegram.ui.ActionBar.k2) ((cl) obj).d).actionBar;
                lVar.invalidate();
                break;
            case 1:
                ProfileActivity profileActivity = (ProfileActivity) obj;
                RectF rectF = ProfileActivity.R6;
                profileActivity.x5();
                profileActivity.y5();
                break;
            default:
                ((u61) obj).s0();
                break;
        }
        return true;
    }
}
