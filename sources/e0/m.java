package e0;

import android.app.Notification;
import java.util.ArrayList;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final class m extends z {
    public final /* synthetic */ int e;
    public Object f;

    public /* synthetic */ m(boolean z10) {
        this.e = 0;
    }

    @Override // e0.z
    public final void b(cc.f fVar) {
        switch (this.e) {
            case 0:
                Notification.BigTextStyle bigText = new Notification.BigTextStyle((Notification.Builder) fVar.d).setBigContentTitle(this.b).bigText((CharSequence) this.f);
                if (this.d) {
                    bigText.setSummaryText(this.c);
                    break;
                }
                break;
            default:
                Notification.InboxStyle bigContentTitle = new Notification.InboxStyle((Notification.Builder) fVar.d).setBigContentTitle(this.b);
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
