package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final class qc1 extends View {
    public int a;
    public final /* synthetic */ WallpapersListActivity b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qc1(WallpapersListActivity wallpapersListActivity, Context context) {
        super(context);
        this.b = wallpapersListActivity;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        WallpapersListActivity wallpapersListActivity = this.b;
        wallpapersListActivity.s.setColor(this.a);
        canvas.drawCircle(org.telegram.messenger.g0.L(25.0f), org.telegram.messenger.g0.L(31.0f), org.telegram.messenger.g0.L(18.0f), wallpapersListActivity.s);
        if (this.a == org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.d6, false)) {
            canvas.drawCircle(org.telegram.messenger.g0.L(25.0f), org.telegram.messenger.g0.L(31.0f), org.telegram.messenger.g0.L(18.0f), wallpapersListActivity.w);
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i7, int i10) {
        setMeasuredDimension(org.telegram.messenger.g0.L(50.0f), org.telegram.messenger.g0.L(62.0f));
    }
}
