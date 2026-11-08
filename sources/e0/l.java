package e0;

import android.app.Notification;
import java.util.ArrayList;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes.dex */
public final class l extends y {
    public final /* synthetic */ int e;
    public Object f;

    public /* synthetic */ l(boolean z9) {
        this.e = 0;
    }

    @Override // e0.y
    public final void b(a4.k kVar) {
        switch (this.e) {
            case 0:
                Notification.BigTextStyle bigText = new Notification.BigTextStyle((Notification.Builder) kVar.d).setBigContentTitle(this.b).bigText((CharSequence) this.f);
                if (this.d) {
                    bigText.setSummaryText(this.c);
                    break;
                }
                break;
            default:
                Notification.InboxStyle bigContentTitle = new Notification.InboxStyle((Notification.Builder) kVar.d).setBigContentTitle(this.b);
                if (this.d) {
                    bigContentTitle.setSummaryText(this.c);
                }
                ArrayList arrayList = (ArrayList) this.f;
                int size = arrayList.size();
                int i7 = 0;
                while (i7 < size) {
                    Object obj = arrayList.get(i7);
                    i7++;
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

    public l(int i7) {
        this.e = i7;
        switch (i7) {
            case 1:
                this.f = new ArrayList();
                break;
        }
    }
}
