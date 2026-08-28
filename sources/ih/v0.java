package ih;

import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.ConnectionsManager;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes4.dex */
public final class v0 {
    public int a;
    public long b;
    public int c;
    public long d;
    public int e;
    public ArrayList f;

    public final float a() {
        int currentTime = ConnectionsManager.getInstance(this.a).getCurrentTime();
        ArrayList arrayList = this.f;
        int size = arrayList.size();
        int i9 = currentTime;
        int i10 = 0;
        int i11 = 0;
        while (i11 < size) {
            Object obj = arrayList.get(i11);
            i11++;
            u0 u0Var = (u0) obj;
            if (u0Var.g > 0) {
                i9 = Math.min(i9, u0Var.d);
                i10 = Math.max(i10, u.b(this.a, (int) u0Var.g, 0) + u0Var.d);
            }
        }
        return AndroidUtilities.ilerp(currentTime, i10, i9);
    }

    public final int b() {
        int currentTime = ConnectionsManager.getInstance(this.a).getCurrentTime();
        ArrayList arrayList = this.f;
        int size = arrayList.size();
        int i9 = 0;
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            u0 u0Var = (u0) obj;
            long j10 = u0Var.g;
            if (j10 > 0 && currentTime - u0Var.d <= u.b(this.a, (int) j10, 0)) {
                i9 += (int) u0Var.g;
            }
        }
        this.d = Math.max(this.d, i9);
        return i9;
    }

    public final void c() {
        int currentTime = ConnectionsManager.getInstance(this.a).getCurrentTime();
        ArrayList arrayList = this.f;
        int size = arrayList.size();
        int i9 = 0;
        while (i9 < size) {
            Object obj = arrayList.get(i9);
            i9++;
            u0 u0Var = (u0) obj;
            if (u0Var.g > 0) {
                currentTime = Math.min(currentTime, u0Var.d);
            }
        }
        this.c = currentTime;
    }
}
