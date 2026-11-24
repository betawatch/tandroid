// default package

import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.a;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class na4 {
    public final ga4 a;
    public boolean e;
    public boolean f;
    public boolean g;
    public boolean h;
    public int i;
    public int k;
    public la4 l;
    public final ArrayList b = new ArrayList();
    public final HashMap c = new HashMap();
    public final a14 d = new a14((Object) this, (byte) 10);
    public int j = 100;

    public na4(ga4 ga4Var) {
        this.a = ga4Var;
    }

    public final void a(int i, int i2, ArrayList arrayList) {
        if (i == this.k && this.f) {
            this.f = false;
            int size = arrayList.size();
            HashMap hashMap = this.c;
            ArrayList arrayList2 = this.b;
            if (i2 == -1 || i2 == -2) {
                arrayList2.subList(0, size).clear();
                int size2 = arrayList.size();
                int i3 = 0;
                while (i3 < size2) {
                    Object obj = arrayList.get(i3);
                    i3++;
                    hashMap.remove(Long.valueOf(((la4) obj).c));
                }
                c();
                this.j = 100;
                this.i = 0;
                if (arrayList2.isEmpty()) {
                    return;
                }
                d(0L);
                return;
            }
            if (i2 >= 0) {
                d(Math.max(i2 * 1000, 2000L));
                return;
            }
            if (i2 == -3) {
                if (size > 1) {
                    this.j = size / 2;
                    d(0L);
                    return;
                }
                la4 la4Var = (la4) arrayList2.remove(0);
                Integer num = (Integer) hashMap.remove(Long.valueOf(la4Var.c));
                int intValue = num == null ? 1 : num.intValue() + 1;
                if (intValue < 3) {
                    arrayList2.add(la4Var);
                    hashMap.put(Long.valueOf(la4Var.c), Integer.valueOf(intValue));
                }
                c();
                this.j = 100;
                int size3 = arrayList2.size();
                int i4 = 0;
                while (i4 < size3) {
                    Object obj2 = arrayList2.get(i4);
                    i4++;
                    if (!hashMap.containsKey(Long.valueOf(((la4) obj2).c))) {
                        d(0L);
                        return;
                    }
                }
            }
            if (i2 != -5) {
                this.i = Math.min(this.i + 1, 8);
            }
            this.h = i2 == -3;
            d(i2 != -5 ? 2000 << (this.i - 1) : 2000L);
        }
    }

    public final void b() {
        ga4 ga4Var = this.a;
        if (this.e) {
            return;
        }
        this.e = true;
        ArrayList arrayList = new ArrayList();
        String[] split = a.b.getSharedPreferences("feed_events", 0).getString("outbox" + ga4Var.a, "").split("\n");
        int length = split.length;
        boolean z = false;
        for (int i = 0; i < length; i++) {
            String trim = split[i].trim();
            if (!trim.isEmpty()) {
                try {
                    boolean startsWith = trim.startsWith("~");
                    if (startsWith) {
                        trim = trim.substring(1);
                    }
                    arrayList.add(la4.a(trim));
                    z |= startsWith;
                } catch (RuntimeException unused) {
                    z = true;
                }
            }
        }
        this.b.addAll(0, arrayList);
        if (z) {
            c();
        }
    }

    public final void c() {
        StringBuilder sb = new StringBuilder();
        ArrayList arrayList = this.b;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            sb.append(((la4) obj).b());
            sb.append('\n');
        }
        if (this.l != null) {
            sb.append('~');
            sb.append(this.l.b());
            sb.append('\n');
        }
        ga4 ga4Var = this.a;
        String sb2 = sb.toString();
        a.b.getSharedPreferences("feed_events", 0).edit().putString("outbox" + ga4Var.a, sb2).apply();
    }

    public final void d(long j) {
        if (this.g || this.f) {
            return;
        }
        this.g = true;
        ia4.d.postRunnable(this.d, j);
    }
}
