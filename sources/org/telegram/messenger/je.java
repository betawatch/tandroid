package org.telegram.messenger;

import java.util.function.ToLongFunction;
import org.telegram.messenger.NotificationsController;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
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
