package org.telegram.messenger;

import java.util.function.ToLongFunction;
import org.telegram.messenger.NotificationsController;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes.dex */
public final /* synthetic */ class ne implements ToLongFunction {
    public final /* synthetic */ int a;

    public /* synthetic */ ne(int i10) {
        this.a = i10;
    }

    @Override // java.util.function.ToLongFunction
    public final long applyAsLong(Object obj) {
        long j10;
        long j11;
        switch (this.a) {
            case 0:
                return Long.parseLong((String) obj);
            case 1:
                j10 = ((NotificationsController.StoryNotification) obj).date;
                return j10;
            default:
                j11 = ((NotificationsController.StoryNotification) obj).date;
                return j11;
        }
    }
}
