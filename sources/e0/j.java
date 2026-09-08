package e0;

import android.app.PendingIntent;
import android.os.Bundle;
import androidx.core.graphics.drawable.IconCompat;
import java.util.ArrayList;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes.dex */
public final class j {
    public final IconCompat a;
    public final CharSequence b;
    public final PendingIntent c;
    public boolean d;
    public final Bundle e;
    public ArrayList f;
    public int g;
    public boolean h;

    public j(int i10, String str, PendingIntent pendingIntent) {
        IconCompat e7 = i10 == 0 ? null : IconCompat.e(null, "", i10);
        Bundle bundle = new Bundle();
        this.d = true;
        this.h = true;
        this.a = e7;
        this.b = t.d(str);
        this.c = pendingIntent;
        this.e = bundle;
        this.f = null;
        this.d = true;
        this.g = 0;
        this.h = true;
    }

    public final void a(r0 r0Var) {
        if (this.f == null) {
            this.f = new ArrayList();
        }
        this.f.add(r0Var);
    }

    public final k b() {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = this.f;
        if (arrayList3 != null) {
            int size = arrayList3.size();
            int i10 = 0;
            while (i10 < size) {
                Object obj = arrayList3.get(i10);
                i10++;
                r0 r0Var = (r0) obj;
                r0Var.getClass();
                arrayList2.add(r0Var);
            }
        }
        return new k(this.a, this.b, this.c, this.e, arrayList2.isEmpty() ? null : (r0[]) arrayList2.toArray(new r0[arrayList2.size()]), arrayList.isEmpty() ? null : (r0[]) arrayList.toArray(new r0[arrayList.size()]), this.d, this.g, this.h);
    }

    public final void c() {
        this.d = true;
    }
}
