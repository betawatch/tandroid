package e0;

import android.app.PendingIntent;
import android.os.Bundle;
import androidx.core.graphics.drawable.IconCompat;
import java.util.ArrayList;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes.dex */
public final class h {
    public final IconCompat a;
    public final CharSequence b;
    public final PendingIntent c;
    public boolean d;
    public final Bundle e;
    public ArrayList f;
    public int g;
    public boolean h;

    public h(int i10, String str, PendingIntent pendingIntent) {
        IconCompat e7 = i10 == 0 ? null : IconCompat.e(null, "", i10);
        Bundle bundle = new Bundle();
        this.d = true;
        this.h = true;
        this.a = e7;
        this.b = r.d(str);
        this.c = pendingIntent;
        this.e = bundle;
        this.f = null;
        this.d = true;
        this.g = 0;
        this.h = true;
    }

    public final void a(p0 p0Var) {
        if (this.f == null) {
            this.f = new ArrayList();
        }
        this.f.add(p0Var);
    }

    public final i b() {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = this.f;
        if (arrayList3 != null) {
            int size = arrayList3.size();
            int i10 = 0;
            while (i10 < size) {
                Object obj = arrayList3.get(i10);
                i10++;
                p0 p0Var = (p0) obj;
                p0Var.getClass();
                arrayList2.add(p0Var);
            }
        }
        return new i(this.a, this.b, this.c, this.e, arrayList2.isEmpty() ? null : (p0[]) arrayList2.toArray(new p0[arrayList2.size()]), arrayList.isEmpty() ? null : (p0[]) arrayList.toArray(new p0[arrayList.size()]), this.d, this.g, this.h);
    }

    public final void c() {
        this.d = true;
    }
}
