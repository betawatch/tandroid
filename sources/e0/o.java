package e0;

import android.app.Notification;
import java.util.ArrayList;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class o extends b0 {
    public final /* synthetic */ int e;
    public Object f;

    public /* synthetic */ o(boolean z10) {
        this.e = 0;
    }

    @Override // e0.b0
    public final void b(i0 i0Var) {
        switch (this.e) {
            case 0:
                Notification.BigTextStyle bigText = new Notification.BigTextStyle((Notification.Builder) i0Var.c).setBigContentTitle(this.b).bigText((CharSequence) this.f);
                if (this.d) {
                    bigText.setSummaryText(this.c);
                    break;
                }
                break;
            default:
                Notification.InboxStyle bigContentTitle = new Notification.InboxStyle((Notification.Builder) i0Var.c).setBigContentTitle(this.b);
                if (this.d) {
                    bigContentTitle.setSummaryText(this.c);
                }
                ArrayList arrayList = (ArrayList) this.f;
                int size = arrayList.size();
                int i9 = 0;
                while (i9 < size) {
                    Object obj = arrayList.get(i9);
                    i9++;
                    bigContentTitle.addLine((CharSequence) obj);
                }
                break;
        }
    }

    @Override // e0.b0
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
            ((ArrayList) this.f).add(t.d(str));
        }
    }

    public void e(String str) {
        this.f = t.d(str);
    }

    public void f(String str) {
        this.b = t.d(str);
    }

    public void g(String str) {
        this.c = t.d(str);
        this.d = true;
    }

    public o(int i9) {
        this.e = i9;
        switch (i9) {
            case 1:
                this.f = new ArrayList();
                break;
        }
    }
}
