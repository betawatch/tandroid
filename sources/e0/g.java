package e0;

import android.app.PendingIntent;
import android.os.Bundle;
import androidx.core.graphics.drawable.IconCompat;
import java.util.ArrayList;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes.dex */
public final class g {
    public final IconCompat a;
    public final CharSequence b;
    public final PendingIntent c;
    public boolean d;
    public final Bundle e;
    public ArrayList f;
    public int g;
    public boolean h;

    public g(int i10, String str, PendingIntent pendingIntent) {
        IconCompat e = i10 == 0 ? null : IconCompat.e(null, "", i10);
        Bundle bundle = new Bundle();
        this.d = true;
        this.h = true;
        this.a = e;
        this.b = q.d(str);
        this.c = pendingIntent;
        this.e = bundle;
        this.f = null;
        this.d = true;
        this.g = 0;
        this.h = true;
    }

    public final void a(n0 n0Var) {
        if (this.f == null) {
            this.f = new ArrayList();
        }
        this.f.add(n0Var);
    }

    public final h b() {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = this.f;
        if (arrayList3 != null) {
            int size = arrayList3.size();
            int i10 = 0;
            while (i10 < size) {
                Object obj = arrayList3.get(i10);
                i10++;
                n0 n0Var = (n0) obj;
                n0Var.getClass();
                arrayList2.add(n0Var);
            }
        }
        return new h(this.a, this.b, this.c, this.e, arrayList2.isEmpty() ? null : (n0[]) arrayList2.toArray(new n0[arrayList2.size()]), arrayList.isEmpty() ? null : (n0[]) arrayList.toArray(new n0[arrayList.size()]), this.d, this.g, this.h);
    }

    public final void c() {
        this.d = true;
    }
}
