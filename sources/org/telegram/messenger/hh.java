package org.telegram.messenger;

import android.graphics.Canvas;
import android.graphics.PostProcessor;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes.dex */
public final /* synthetic */ class hh implements PostProcessor {
    @Override // android.graphics.PostProcessor
    public final int onPostProcess(Canvas canvas) {
        int lambda$loadRoundAvatar$46;
        lambda$loadRoundAvatar$46 = NotificationsController.lambda$loadRoundAvatar$46(canvas);
        return lambda$loadRoundAvatar$46;
    }
}
