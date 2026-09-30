package e0;

import android.app.Notification;

/* compiled from: r8-map-id-518d3e50826c848a68038d28135b875c492a3e734bb6bb5b9a39b192f8b0e064 */
/* loaded from: classes.dex */
public abstract class q {
    public static Notification.BubbleMetadata a(r rVar) {
        if (rVar == null) {
            return null;
        }
        Notification.BubbleMetadata.Builder builder = new Notification.BubbleMetadata.Builder(rVar.a, rVar.b.m(null));
        builder.setDeleteIntent(null).setAutoExpandBubble((rVar.d & 1) != 0).setSuppressNotification((rVar.d & 2) != 0);
        int i10 = rVar.c;
        if (i10 != 0) {
            builder.setDesiredHeight(i10);
        }
        return builder.build();
    }
}
