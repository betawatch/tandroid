package org.telegram.ui;

import android.graphics.RectF;
import android.view.ViewTreeObserver;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final /* synthetic */ class hk implements ViewTreeObserver.OnPreDrawListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ hk(Object obj, int i7) {
        this.a = i7;
        this.b = obj;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        org.telegram.ui.ActionBar.l lVar;
        int i7 = this.a;
        Object obj = this.b;
        switch (i7) {
            case 0:
                lVar = ((org.telegram.ui.ActionBar.f2) ((ik) obj).d).actionBar;
                lVar.invalidate();
                break;
            case 1:
                ProfileActivity profileActivity = (ProfileActivity) obj;
                RectF rectF = ProfileActivity.V6;
                profileActivity.B5();
                profileActivity.C5();
                break;
            default:
                ((e51) obj).t0();
                break;
        }
        return true;
    }
}
