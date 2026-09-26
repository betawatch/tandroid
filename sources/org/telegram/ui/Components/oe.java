package org.telegram.ui.Components;

import android.app.Activity;
import android.graphics.Canvas;
import android.graphics.Paint;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MediaDataController;

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
/* loaded from: classes3.dex */
public final class oe extends bh {
    public final /* synthetic */ ChatActivityEnterView x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oe(ChatActivityEnterView chatActivityEnterView, Activity activity) {
        super(activity);
        this.x = chatActivityEnterView;
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onDraw(Canvas canvas) {
        ChatActivityEnterView chatActivityEnterView = this.x;
        Paint paint = chatActivityEnterView.Q1;
        super.onDraw(canvas);
        if (getTag() == null || chatActivityEnterView.p1 == null || chatActivityEnterView.W0 || MediaDataController.getInstance(chatActivityEnterView.Q).getUnreadStickerSets().isEmpty() || paint == null) {
            return;
        }
        canvas.drawCircle(AndroidUtilities.dp(9.0f) + (getWidth() / 2), (getHeight() / 2) - AndroidUtilities.dp(8.0f), AndroidUtilities.dp(5.0f), paint);
    }
}
