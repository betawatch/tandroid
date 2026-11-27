// default package

import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.a;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes.dex */
public final class ja4 {
    public final ca4 a;
    public boolean e;
    public boolean f;
    public boolean g;
    public boolean h;
    public int i;
    public int k;
    public ha4 l;
    public final ArrayList b = new ArrayList();
    public final HashMap c = new HashMap();
    public final lw3 d = new lw3((Object) this, (byte) 16);
    public int j = 100;

    public ja4(ca4 ca4Var) {
        this.a = ca4Var;
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
                    hashMap.remove(Long.valueOf(((ha4) obj).c));
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
                ha4 ha4Var = (ha4) arrayList2.remove(0);
                Integer num = (Integer) hashMap.remove(Long.valueOf(ha4Var.c));
                int intValue = num == null ? 1 : num.intValue() + 1;
                if (intValue < 3) {
                    arrayList2.add(ha4Var);
                    hashMap.put(Long.valueOf(ha4Var.c), Integer.valueOf(intValue));
                }
                c();
                this.j = 100;
                int size3 = arrayList2.size();
                int i4 = 0;
                while (i4 < size3) {
                    Object obj2 = arrayList2.get(i4);
                    i4++;
                    if (!hashMap.containsKey(Long.valueOf(((ha4) obj2).c))) {
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
        ca4 ca4Var = this.a;
        if (this.e) {
            return;
        }
        this.e = true;
        ArrayList arrayList = new ArrayList();
        String[] split = a.b.getSharedPreferences("feed_events", 0).getString("outbox" + ca4Var.a, "").split("\n");
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
                    arrayList.add(ha4.a(trim));
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
            sb.append(((ha4) obj).b());
            sb.append('\n');
        }
        if (this.l != null) {
            sb.append('~');
            sb.append(this.l.b());
            sb.append('\n');
        }
        ca4 ca4Var = this.a;
        String sb2 = sb.toString();
        a.b.getSharedPreferences("feed_events", 0).edit().putString("outbox" + ca4Var.a, sb2).apply();
    }

    public final void d(long j) {
        if (this.g || this.f) {
            return;
        }
        this.g = true;
        ea4.e.postRunnable(this.d, j);
    }
}
