package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Point;
import android.view.View;
import android.widget.FrameLayout;
import java.util.HashMap;
import java.util.Map;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.IMapsProvider;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final class zk extends FrameLayout {
    public final HashMap a;
    public final /* synthetic */ cl b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zk(cl clVar, Context context) {
        super(context);
        this.b = clVar;
        this.a = new HashMap();
    }

    public final void a() {
        IMapsProvider.IMap iMap = this.b.E;
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
