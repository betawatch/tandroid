package org.telegram.ui;

import android.graphics.RectF;
import android.view.ViewTreeObserver;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
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
                RectF rectF = ProfileActivity.S6;
                profileActivity.y5();
                profileActivity.z5();
                break;
            default:
                ((s61) obj).t0();
                break;
        }
        return true;
    }
}
