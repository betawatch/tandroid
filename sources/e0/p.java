package e0;

import android.app.Notification;
import android.app.PendingIntent;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
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
