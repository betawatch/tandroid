package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public final class fj1 extends View {
    public int a;
    public final /* synthetic */ WallpapersListActivity b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fj1(WallpapersListActivity wallpapersListActivity, Context context) {
        super(context);
        this.b = wallpapersListActivity;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        WallpapersListActivity wallpapersListActivity = this.b;
        wallpapersListActivity.w.setColor(this.a);
        canvas.drawCircle(AndroidUtilities.dp(25.0f), AndroidUtilities.dp(31.0f), AndroidUtilities.dp(18.0f), wallpapersListActivity.w);
        if (this.a == org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.d6, false)) {
            canvas.drawCircle(AndroidUtilities.dp(25.0f), AndroidUtilities.dp(31.0f), AndroidUtilities.dp(18.0f), wallpapersListActivity.x);
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i10, int i11) {
        setMeasuredDimension(AndroidUtilities.dp(50.0f), AndroidUtilities.dp(62.0f));
    }
}
