package e0;

import android.app.Notification;
import java.util.ArrayList;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class l extends y {
    public final /* synthetic */ int e;
    public Object f;

    public /* synthetic */ l(boolean z10) {
        this.e = 0;
    }

    @Override // e0.y
    public final void b(e0 e0Var) {
        switch (this.e) {
            case 0:
                Notification.BigTextStyle bigText = new Notification.BigTextStyle((Notification.Builder) e0Var.d).setBigContentTitle(this.b).bigText((CharSequence) this.f);
                if (this.d) {
                    bigText.setSummaryText(this.c);
                    break;
                }
                break;
            default:
                Notification.InboxStyle bigContentTitle = new Notification.InboxStyle((Notification.Builder) e0Var.d).setBigContentTitle(this.b);
                if (this.d) {
                    bigContentTitle.setSummaryText(this.c);
                }
                ArrayList arrayList = (ArrayList) this.f;
                int size = arrayList.size();
                int i3 = 0;
                while (i3 < size) {
                    Object obj = arrayList.get(i3);
                    i3++;
                    bigContentTitle.addLine((CharSequence) obj);
                }
                break;
        }
    }

    @Override // e0.y
    public final String c() {
        switch (this.e) {
            case 0:
                return "androidx.core.app.NotificationCompat$BigTextStyle";
            default:
                return "androidx.core.app.NotificationCompat$InboxStyle";
        }
    }

    public void d(String str) {
        if (str != null) {
            ((ArrayList) this.f).add(q.d(str));
        }
    }

    public void e(String str) {
        this.f = q.d(str);
    }

    public void f(String str) {
        this.b = q.d(str);
    }

    public void g(String str) {
        this.c = q.d(str);
        this.d = true;
    }

    public l(int i3) {
        this.e = i3;
        switch (i3) {
            case 1:
                this.f = new ArrayList();
                break;
        }
    }
}
