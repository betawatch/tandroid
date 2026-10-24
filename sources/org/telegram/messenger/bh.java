package org.telegram.messenger;

import android.graphics.Canvas;
import android.graphics.PostProcessor;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes.dex */
public final /* synthetic */ class bh implements PostProcessor {
    @Override // android.graphics.PostProcessor
    public final int onPostProcess(Canvas canvas) {
        int lambda$loadRoundAvatar$47;
        lambda$loadRoundAvatar$47 = NotificationsController.lambda$loadRoundAvatar$47(canvas);
        return lambda$loadRoundAvatar$47;
    }
}
