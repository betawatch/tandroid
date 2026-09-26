package e0;

import android.app.Notification;
import android.app.PendingIntent;

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
/* loaded from: classes.dex */
public abstract class p {
    public static Notification.BubbleMetadata a(r rVar) {
        PendingIntent pendingIntent;
        if (rVar == null || (pendingIntent = rVar.a) == null) {
            return null;
        }
        Notification.BubbleMetadata.Builder suppressNotification = new Notification.BubbleMetadata.Builder().setIcon(rVar.b.m(null)).setIntent(pendingIntent).setDeleteIntent(null).setAutoExpandBubble((rVar.d & 1) != 0).setSuppressNotification((rVar.d & 2) != 0);
        int i10 = rVar.c;
        if (i10 != 0) {
            suppressNotification.setDesiredHeight(i10);
        }
        return suppressNotification.build();
    }
}
