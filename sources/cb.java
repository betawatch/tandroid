// default package

import android.text.TextUtils;
import java.util.ArrayList;
import org.telegram.tgnet.ConnectionsManager;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class cb implements gk7 {
    public final int b;
    public final Runnable c;
    public final String d;
    public boolean f;
    public boolean h;
    public boolean n;
    public final ArrayList a = new ArrayList();
    public final int e = ConnectionsManager.generateClassGuid();

    public cb(String str, int i, Runnable runnable) {
        this.b = i;
        this.d = str;
        this.c = runnable;
    }

    public final void a() {
        if (this.h) {
            return;
        }
        this.h = true;
        int i = this.b;
        kk7.f(i).b(this, kk7.U);
        kk7.f(i).b(this, kk7.G1);
        if (TextUtils.isEmpty(this.d)) {
            d();
        }
    }

    public final void b(ArrayList arrayList) {
        int i = 0;
        while (true) {
            ArrayList arrayList2 = this.a;
            if (i >= arrayList2.size()) {
                return;
            }
            if (arrayList.contains(Integer.valueOf(((k27) arrayList2.get(i)).e1()))) {
                arrayList2.remove(i);
                i--;
            }
            i++;
        }
    }

    public final void c() {
        if (this.h) {
            this.h = false;
            int i = this.b;
            kk7.f(i).n(this, kk7.U);
            kk7.f(i).n(this, kk7.G1);
            ConnectionsManager.getInstance(i).cancelRequestsForGuid(this.e);
            this.n = false;
        }
    }

    public final void d() {
        ArrayList arrayList;
        if (this.n || this.f) {
            return;
        }
        this.n = true;
        int i = this.b;
        long e = y6c.h(i).e();
        int i2 = 0;
        int i3 = Integer.MAX_VALUE;
        while (true) {
            arrayList = this.a;
            if (i2 >= arrayList.size()) {
                break;
            }
            i3 = Math.min(i3, ((k27) arrayList.get(i2)).e1());
            i2++;
        }
        hq6 d0 = hq6.d0(i);
        int i4 = arrayList.isEmpty() ? 30 : 50;
        if (i3 == Integer.MAX_VALUE) {
            i3 = 0;
        }
        d0.P0(e, i4, i3, 0, 3, 0L, 1, this.e, 0, null, this.d);
    }

    @Override // gk7
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        int i3 = kk7.U;
        ArrayList arrayList = this.a;
        if (i != i3) {
            if (i == kk7.G1) {
                arrayList.add(0, (k27) objArr[0]);
            }
        } else if (((Integer) objArr[3]).intValue() == this.e) {
            this.n = false;
            ArrayList arrayList2 = (ArrayList) objArr[2];
            this.f = ((Boolean) objArr[5]).booleanValue();
            arrayList.addAll(arrayList2);
            this.c.run();
        }
    }
}
