package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class le1 extends View {
    public int a;
    public final /* synthetic */ WallpapersListActivity b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public le1(WallpapersListActivity wallpapersListActivity, Context context) {
        super(context);
        this.b = wallpapersListActivity;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        WallpapersListActivity wallpapersListActivity = this.b;
        wallpapersListActivity.s.setColor(this.a);
        canvas.drawCircle(org.telegram.messenger.i0.L(25.0f), org.telegram.messenger.i0.L(31.0f), org.telegram.messenger.i0.L(18.0f), wallpapersListActivity.s);
        if (this.a == org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.d6, false)) {
            canvas.drawCircle(org.telegram.messenger.i0.L(25.0f), org.telegram.messenger.i0.L(31.0f), org.telegram.messenger.i0.L(18.0f), wallpapersListActivity.w);
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i10, int i11) {
        setMeasuredDimension(org.telegram.messenger.i0.L(50.0f), org.telegram.messenger.i0.L(62.0f));
    }
}
