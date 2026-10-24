package e0;

import android.app.Notification;
import android.app.PendingIntent;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
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
