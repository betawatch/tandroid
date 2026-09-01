package org.telegram.ui.Components;

import android.app.Activity;
import android.graphics.Canvas;
import android.graphics.Paint;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MediaDataController;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final class de extends qg {
    public final /* synthetic */ ChatActivityEnterView x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public de(ChatActivityEnterView chatActivityEnterView, Activity activity) {
        super(activity);
        this.x = chatActivityEnterView;
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onDraw(Canvas canvas) {
        ChatActivityEnterView chatActivityEnterView = this.x;
        Paint paint = chatActivityEnterView.M1;
        super.onDraw(canvas);
        if (getTag() == null || chatActivityEnterView.l1 == null || chatActivityEnterView.T0 || MediaDataController.getInstance(chatActivityEnterView.N).getUnreadStickerSets().isEmpty() || paint == null) {
            return;
        }
        canvas.drawCircle(AndroidUtilities.dp(9.0f) + (getWidth() / 2), (getHeight() / 2) - AndroidUtilities.dp(8.0f), AndroidUtilities.dp(5.0f), paint);
    }
}
