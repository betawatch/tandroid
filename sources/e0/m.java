package e0;

import android.app.Notification;
import android.app.PendingIntent;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes.dex */
public abstract class m {
    public static Notification.BubbleMetadata a(o oVar) {
        PendingIntent pendingIntent;
        if (oVar == null || (pendingIntent = oVar.a) == null) {
            return null;
        }
        Notification.BubbleMetadata.Builder suppressNotification = new Notification.BubbleMetadata.Builder().setIcon(oVar.b.m(null)).setIntent(pendingIntent).setDeleteIntent(null).setAutoExpandBubble((oVar.d & 1) != 0).setSuppressNotification((oVar.d & 2) != 0);
        int i10 = oVar.c;
        if (i10 != 0) {
            suppressNotification.setDesiredHeight(i10);
        }
        return suppressNotification.build();
    }
}
