package e0;

import android.app.Notification;
import java.util.ArrayList;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes.dex */
public final class m extends z {
    public final /* synthetic */ int e;
    public Object f;

    public /* synthetic */ m(boolean z10) {
        this.e = 0;
    }

    @Override // e0.z
    public final void b(g0 g0Var) {
        switch (this.e) {
            case 0:
                Notification.BigTextStyle bigText = new Notification.BigTextStyle((Notification.Builder) g0Var.c).setBigContentTitle(this.b).bigText((CharSequence) this.f);
                if (this.d) {
                    bigText.setSummaryText(this.c);
                    break;
                }
                break;
            default:
                Notification.InboxStyle bigContentTitle = new Notification.InboxStyle((Notification.Builder) g0Var.c).setBigContentTitle(this.b);
                if (this.d) {
                    bigContentTitle.setSummaryText(this.c);
                }
                ArrayList arrayList = (ArrayList) this.f;
                int size = arrayList.size();
                int i10 = 0;
                while (i10 < size) {
                    Object obj = arrayList.get(i10);
                    i10++;
                    bigContentTitle.addLine((CharSequence) obj);
                }
                break;
        }
    }

    @Override // e0.z
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
            ((ArrayList) this.f).add(r.d(str));
        }
    }

    public void e(String str) {
        this.f = r.d(str);
    }

    public void f(String str) {
        this.b = r.d(str);
    }

    public void g(String str) {
        this.c = r.d(str);
        this.d = true;
    }

    public m(int i10) {
        this.e = i10;
        switch (i10) {
            case 1:
                this.f = new ArrayList();
                break;
        }
    }
}
