package e0;

import android.app.Notification;
import android.app.PendingIntent;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
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
