package org.telegram.messenger;

import java.util.function.ToLongFunction;
import org.telegram.messenger.NotificationsController;

/* compiled from: r8-map-id-eaaffe05e5b4975c35db95ddc7f057e1a9a0a254a43fe066fa0ad675f8b3973e */
/* loaded from: classes.dex */
public final /* synthetic */ class je implements ToLongFunction {
    public final /* synthetic */ int a;

    public /* synthetic */ je(int i10) {
        this.a = i10;
    }

    @Override // java.util.function.ToLongFunction
    public final long applyAsLong(Object obj) {
        long j3;
        long j10;
        switch (this.a) {
            case 0:
                return Long.parseLong((String) obj);
            case 1:
                j3 = ((NotificationsController.StoryNotification) obj).date;
                return j3;
            default:
                j10 = ((NotificationsController.StoryNotification) obj).date;
                return j10;
        }
    }
}
