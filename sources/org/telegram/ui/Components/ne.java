package org.telegram.ui.Components;

import android.app.Activity;
import android.graphics.Canvas;
import android.graphics.Paint;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MediaDataController;

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
/* loaded from: classes3.dex */
public final class ne extends bh {
    public final /* synthetic */ ChatActivityEnterView x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ne(ChatActivityEnterView chatActivityEnterView, Activity activity) {
        super(activity);
        this.x = chatActivityEnterView;
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onDraw(Canvas canvas) {
        ChatActivityEnterView chatActivityEnterView = this.x;
        Paint paint = chatActivityEnterView.P1;
        super.onDraw(canvas);
        if (getTag() == null || chatActivityEnterView.o1 == null || chatActivityEnterView.W0 || MediaDataController.getInstance(chatActivityEnterView.Q).getUnreadStickerSets().isEmpty() || paint == null) {
            return;
        }
        canvas.drawCircle(AndroidUtilities.dp(9.0f) + (getWidth() / 2), (getHeight() / 2) - AndroidUtilities.dp(8.0f), AndroidUtilities.dp(5.0f), paint);
    }
}
