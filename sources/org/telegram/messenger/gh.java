package org.telegram.messenger;

import android.graphics.Canvas;
import android.graphics.PostProcessor;

/* compiled from: r8-map-id-e83daa4a3f4c5cc77b567d3f921056f729108399460aa18047e0e51e076a97b3 */
/* loaded from: classes.dex */
public final /* synthetic */ class gh implements PostProcessor {
    @Override // android.graphics.PostProcessor
    public final int onPostProcess(Canvas canvas) {
        int lambda$loadRoundAvatar$46;
        lambda$loadRoundAvatar$46 = NotificationsController.lambda$loadRoundAvatar$46(canvas);
        return lambda$loadRoundAvatar$46;
    }
}
