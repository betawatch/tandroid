package bi;

import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.ConnectionsManager;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes4.dex */
public final class f1 {
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
        int i10 = currentTime;
        int i11 = 0;
        int i12 = 0;
        while (i12 < size) {
            Object obj = arrayList.get(i12);
            i12++;
            e1 e1Var = (e1) obj;
            if (e1Var.g > 0) {
                i10 = Math.min(i10, e1Var.d);
                i11 = Math.max(i11, z.b(this.a, (int) e1Var.g, 0) + e1Var.d);
            }
        }
        return AndroidUtilities.ilerp(currentTime, i11, i10);
    }

    public final int b() {
        int currentTime = ConnectionsManager.getInstance(this.a).getCurrentTime();
        ArrayList arrayList = this.f;
        int size = arrayList.size();
        int i10 = 0;
        int i11 = 0;
        while (i11 < size) {
            Object obj = arrayList.get(i11);
            i11++;
            e1 e1Var = (e1) obj;
            long j3 = e1Var.g;
            if (j3 > 0 && currentTime - e1Var.d <= z.b(this.a, (int) j3, 0)) {
                i10 += (int) e1Var.g;
            }
        }
        this.d = Math.max(this.d, i10);
        return i10;
    }

    public final void c() {
        int currentTime = ConnectionsManager.getInstance(this.a).getCurrentTime();
        ArrayList arrayList = this.f;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            e1 e1Var = (e1) obj;
            if (e1Var.g > 0) {
                currentTime = Math.min(currentTime, e1Var.d);
            }
        }
        this.c = currentTime;
    }
}
