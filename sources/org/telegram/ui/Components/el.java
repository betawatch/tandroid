package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Point;
import android.view.View;
import android.widget.FrameLayout;
import java.util.HashMap;
import java.util.Map;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.IMapsProvider;

/* compiled from: r8-map-id-b07cfdfd75409cd6350aa76f4fec680e8237f25f7a223b1e5148659feab2c2d2 */
/* loaded from: classes3.dex */
public final class el extends FrameLayout {
    public final HashMap a;
    public final /* synthetic */ hl b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public el(hl hlVar, Context context) {
        super(context);
        this.b = hlVar;
        this.a = new HashMap();
    }

    public final void a() {
        IMapsProvider.IMap iMap = this.b.H;
        if (iMap == null) {
            return;
        }
        IMapsProvider.IProjection projection = iMap.getProjection();
        for (Map.Entry entry : this.a.entrySet()) {
            IMapsProvider.IMarker iMarker = (IMapsProvider.IMarker) entry.getKey();
            View view = (View) entry.getValue();
            Point screenLocation = projection.toScreenLocation(iMarker.getPosition());
            view.setTranslationX(screenLocation.x - (view.getMeasuredWidth() / 2));
            view.setTranslationY(AndroidUtilities.dp(22.0f) + (screenLocation.y - view.getMeasuredHeight()));
        }
    }
}
