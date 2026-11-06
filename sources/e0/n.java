package e0;

import android.app.Notification;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
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
