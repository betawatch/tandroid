package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.Region;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class e3 extends o9 {
    public final Path C;

    public e3(Context context) {
        super(context);
        this.C = new Path();
    }

    @Override // org.telegram.ui.Components.o9, android.view.View
    public final void onDraw(Canvas canvas) {
        canvas.save();
        Path path = this.C;
        path.rewind();
        path.addCircle(AndroidUtilities.dp(54.0f), AndroidUtilities.dp(53.0f), AndroidUtilities.dp(14.0f), Path.Direction.CW);
        canvas.clipPath(path, Region.Op.DIFFERENCE);
        super.onDraw(canvas);
        canvas.restore();
    }
}
