package org.telegram.messenger;

import android.graphics.Canvas;
import android.graphics.PostProcessor;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes.dex */
public final /* synthetic */ class eh implements PostProcessor {
    @Override // android.graphics.PostProcessor
    public final int onPostProcess(Canvas canvas) {
        int lambda$loadRoundAvatar$47;
        lambda$loadRoundAvatar$47 = NotificationsController.lambda$loadRoundAvatar$47(canvas);
        return lambda$loadRoundAvatar$47;
    }
}
