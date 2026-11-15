package org.telegram.ui;

import android.graphics.RectF;
import android.view.ViewTreeObserver;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
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
                kVar = ((org.telegram.ui.ActionBar.e2) ((gk) obj).d).actionBar;
                kVar.invalidate();
                break;
            case 1:
                ProfileActivity profileActivity = (ProfileActivity) obj;
                RectF rectF = ProfileActivity.X6;
                profileActivity.B5();
                profileActivity.C5();
                break;
            default:
                ((z41) obj).t0();
                break;
        }
        return true;
    }
}
