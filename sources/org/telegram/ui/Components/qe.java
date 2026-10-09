package org.telegram.ui.Components;

import android.app.Activity;
import android.graphics.Canvas;
import android.graphics.Paint;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MediaDataController;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final class qe extends dh {
    public final /* synthetic */ ChatActivityEnterView x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qe(ChatActivityEnterView chatActivityEnterView, Activity activity) {
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
