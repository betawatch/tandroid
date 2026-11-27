// default package

import android.app.PendingIntent;
import android.os.Bundle;
import androidx.core.graphics.drawable.IconCompat;
import java.util.ArrayList;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
public final class kn7 {
    public final IconCompat a;
    public final CharSequence b;
    public final PendingIntent c;
    public boolean d;
    public final Bundle e;
    public ArrayList f;
    public byte g;
    public boolean h;

    public kn7(int i, PendingIntent pendingIntent, String str) {
        IconCompat e = i == 0 ? null : IconCompat.e(null, "", i);
        Bundle bundle = new Bundle();
        this.d = true;
        this.h = true;
        this.a = e;
        this.b = wn7.c(str);
        this.c = pendingIntent;
        this.e = bundle;
        this.f = null;
        this.d = true;
        this.g = (byte) 0;
        this.h = true;
    }

    public final void a(t99 t99Var) {
        ArrayList arrayList = this.f;
        if (arrayList == null) {
            arrayList = new ArrayList();
            this.f = arrayList;
        }
        arrayList.add(t99Var);
    }

    public final ln7 b() {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = this.f;
        if (arrayList3 != null) {
            int size = arrayList3.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList3.get(i);
                i++;
                t99 t99Var = (t99) obj;
                t99Var.getClass();
                arrayList2.add(t99Var);
            }
        }
        if (!arrayList.isEmpty()) {
        }
        return new ln7(this.a, this.b, this.c, this.e, arrayList2.isEmpty() ? null : (t99[]) arrayList2.toArray(new t99[arrayList2.size()]), this.d, this.g, this.h);
    }
}
