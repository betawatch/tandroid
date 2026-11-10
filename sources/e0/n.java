package e0;

import android.app.Notification;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes.dex */
public abstract class n {
    public static Notification.BubbleMetadata a(o oVar) {
        if (oVar == null) {
            return null;
        }
        Notification.BubbleMetadata.Builder builder = new Notification.BubbleMetadata.Builder(oVar.a, oVar.b.m(null));
        builder.setDeleteIntent(null).setAutoExpandBubble((oVar.d & 1) != 0).setSuppressNotification((oVar.d & 2) != 0);
        int i7 = oVar.c;
        if (i7 != 0) {
            builder.setDesiredHeight(i7);
        }
        return builder.build();
    }
}
