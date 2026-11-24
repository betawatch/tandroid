// default package

import android.app.PendingIntent;
import android.os.Bundle;
import androidx.core.graphics.drawable.IconCompat;
import java.util.ArrayList;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class om7 {
    public final IconCompat a;
    public final CharSequence b;
    public final PendingIntent c;
    public boolean d;
    public final Bundle e;
    public ArrayList f;
    public byte g;
    public boolean h;

    public om7(int i, PendingIntent pendingIntent, String str) {
        IconCompat e = i == 0 ? null : IconCompat.e(null, "", i);
        Bundle bundle = new Bundle();
        this.d = true;
        this.h = true;
        this.a = e;
        this.b = an7.c(str);
        this.c = pendingIntent;
        this.e = bundle;
        this.f = null;
        this.d = true;
        this.g = (byte) 0;
        this.h = true;
    }

    public final void a(i89 i89Var) {
        ArrayList arrayList = this.f;
        if (arrayList == null) {
            arrayList = new ArrayList();
            this.f = arrayList;
        }
        arrayList.add(i89Var);
    }

    public final pm7 b() {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = this.f;
        if (arrayList3 != null) {
            int size = arrayList3.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList3.get(i);
                i++;
                i89 i89Var = (i89) obj;
                i89Var.getClass();
                arrayList2.add(i89Var);
            }
        }
        if (!arrayList.isEmpty()) {
        }
        return new pm7(this.a, this.b, this.c, this.e, arrayList2.isEmpty() ? null : (i89[]) arrayList2.toArray(new i89[arrayList2.size()]), this.d, this.g, this.h);
    }
}
