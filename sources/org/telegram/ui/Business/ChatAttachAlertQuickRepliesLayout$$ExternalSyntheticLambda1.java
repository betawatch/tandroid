package org.telegram.ui.Business;

import android.graphics.Canvas;
import android.view.View;
import org.telegram.ui.Components.RecyclerListView;
import org.telegram.ui.Components.blur3.ViewGroupPartRenderer;

/* loaded from: classes4.dex */
public final /* synthetic */ class ChatAttachAlertQuickRepliesLayout$$ExternalSyntheticLambda1 implements ViewGroupPartRenderer.DrawChildMethod {
    public final /* synthetic */ RecyclerListView f$0;

    public /* synthetic */ ChatAttachAlertQuickRepliesLayout$$ExternalSyntheticLambda1(RecyclerListView recyclerListView) {
        this.f$0 = recyclerListView;
    }

    @Override // org.telegram.ui.Components.blur3.ViewGroupPartRenderer.DrawChildMethod
    public final boolean drawChild(Canvas canvas, View view, long j) {
        return this.f$0.drawChild(canvas, view, j);
    }
}
