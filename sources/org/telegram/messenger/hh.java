package org.telegram.messenger;

import android.graphics.Canvas;
import android.graphics.PostProcessor;

/* compiled from: r8-map-id-eaaffe05e5b4975c35db95ddc7f057e1a9a0a254a43fe066fa0ad675f8b3973e */
/* loaded from: classes.dex */
public final /* synthetic */ class hh implements PostProcessor {
    @Override // android.graphics.PostProcessor
    public final int onPostProcess(Canvas canvas) {
        int lambda$loadRoundAvatar$46;
        lambda$loadRoundAvatar$46 = NotificationsController.lambda$loadRoundAvatar$46(canvas);
        return lambda$loadRoundAvatar$46;
    }
}
