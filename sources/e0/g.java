package e0;

import android.app.PendingIntent;
import android.os.Bundle;
import androidx.core.graphics.drawable.IconCompat;
import java.util.ArrayList;

/* compiled from: r8-map-id-189a3a12219b7c214453a48fa9697387dfb8b2ca31ce3a2eba70ff5e2610a248 */
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

    public final void a(o0 o0Var) {
        if (this.f == null) {
            this.f = new ArrayList();
        }
        this.f.add(o0Var);
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
                o0 o0Var = (o0) obj;
                o0Var.getClass();
                arrayList2.add(o0Var);
            }
        }
        return new h(this.a, this.b, this.c, this.e, arrayList2.isEmpty() ? null : (o0[]) arrayList2.toArray(new o0[arrayList2.size()]), arrayList.isEmpty() ? null : (o0[]) arrayList.toArray(new o0[arrayList.size()]), this.d, this.g, this.h);
    }

    public final void c() {
        this.d = true;
    }
}
