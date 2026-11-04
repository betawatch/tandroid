package e5;

import android.os.Bundle;
import b8.zb;
import g9.g0;
import g9.i0;
import g9.s1;
import java.io.File;
import java.util.ArrayList;
import java.util.logging.Level;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class j implements y2.a {
    public final /* synthetic */ int a;
    public ArrayList b;

    public j(int i3) {
        this.a = i3;
        switch (i3) {
            case 2:
                break;
            case 3:
                File file = new File(System.getProperty("java.io.tmpdir"));
                if (!file.exists()) {
                    file.mkdirs();
                }
                this.b = new ArrayList();
                break;
            case 4:
                this.b = new ArrayList();
                break;
            default:
                this.b = new ArrayList();
                new ArrayList();
                new ArrayList();
                break;
        }
    }

    @Override // y2.a
    public long a(long j10) {
        ArrayList arrayList = this.b;
        if (arrayList.isEmpty()) {
            return Long.MIN_VALUE;
        }
        if (j10 < ((b4.a) arrayList.get(0)).b) {
            return ((b4.a) arrayList.get(0)).b;
        }
        for (int i3 = 1; i3 < arrayList.size(); i3++) {
            b4.a aVar = (b4.a) arrayList.get(i3);
            long j11 = aVar.b;
            long j12 = aVar.b;
            if (j10 < j11) {
                long j13 = ((b4.a) arrayList.get(i3 - 1)).d;
                return (j13 == -9223372036854775807L || j13 <= j10 || j13 >= j12) ? j12 : j13;
            }
        }
        long j14 = ((b4.a) g9.o.n(arrayList)).d;
        if (j14 == -9223372036854775807L || j10 >= j14) {
            return Long.MIN_VALUE;
        }
        return j14;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x002d  */
    @Override // y2.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean b(b4.a aVar, long j10) {
        boolean z10;
        int size;
        ArrayList arrayList = this.b;
        long j11 = aVar.b;
        zb.f(j11 != -9223372036854775807L);
        if (j11 <= j10) {
            long j12 = aVar.d;
            if (j12 == -9223372036854775807L || j10 < j12) {
                z10 = true;
                for (size = arrayList.size() - 1; size >= 0; size--) {
                    if (j11 >= ((b4.a) arrayList.get(size)).b) {
                        arrayList.add(size + 1, aVar);
                        return z10;
                    }
                    if (((b4.a) arrayList.get(size)).b <= j10) {
                        z10 = false;
                    }
                }
                arrayList.add(0, aVar);
                return z10;
            }
        }
        z10 = false;
        while (size >= 0) {
        }
        arrayList.add(0, aVar);
        return z10;
    }

    @Override // y2.a
    public i0 c(long j10) {
        int g7 = g(j10);
        if (g7 == 0) {
            g0 g0Var = i0.b;
            return s1.e;
        }
        b4.a aVar = (b4.a) this.b.get(g7 - 1);
        long j11 = aVar.d;
        if (j11 == -9223372036854775807L || j10 < j11) {
            return aVar.a;
        }
        g0 g0Var2 = i0.b;
        return s1.e;
    }

    @Override // y2.a
    public void clear() {
        switch (this.a) {
            case 3:
                ArrayList arrayList = this.b;
                int size = arrayList.size();
                int i3 = 0;
                while (i3 < size) {
                    Object obj = arrayList.get(i3);
                    i3++;
                    if (obj != null) {
                        throw new ClassCastException();
                    }
                    try {
                        throw null;
                        break;
                    } catch (Exception e10) {
                        vc.i.d.log(Level.WARNING, "could not delete file ", (Throwable) e10);
                    }
                }
                arrayList.clear();
                return;
            default:
                this.b.clear();
                return;
        }
    }

    @Override // y2.a
    public long d(long j10) {
        ArrayList arrayList = this.b;
        if (arrayList.isEmpty() || j10 < ((b4.a) arrayList.get(0)).b) {
            return -9223372036854775807L;
        }
        for (int i3 = 1; i3 < arrayList.size(); i3++) {
            long j11 = ((b4.a) arrayList.get(i3)).b;
            if (j10 == j11) {
                return j11;
            }
            if (j10 < j11) {
                b4.a aVar = (b4.a) arrayList.get(i3 - 1);
                long j12 = aVar.d;
                return (j12 == -9223372036854775807L || j12 > j10) ? aVar.b : j12;
            }
        }
        b4.a aVar2 = (b4.a) g9.o.n(arrayList);
        long j13 = aVar2.d;
        return (j13 == -9223372036854775807L || j10 < j13) ? aVar2.b : j13;
    }

    @Override // y2.a
    public void e(long j10) {
        ArrayList arrayList = this.b;
        int g7 = g(j10);
        if (g7 == 0) {
            return;
        }
        long j11 = ((b4.a) arrayList.get(g7 - 1)).d;
        if (j11 == -9223372036854775807L || j11 >= j10) {
            g7--;
        }
        arrayList.subList(0, g7).clear();
    }

    public r4.r f() {
        if (this.b == null) {
            return r4.r.c;
        }
        Bundle bundle = new Bundle();
        bundle.putStringArrayList("controlCategories", this.b);
        return new r4.r(bundle, this.b);
    }

    public int g(long j10) {
        ArrayList arrayList = this.b;
        for (int i3 = 0; i3 < arrayList.size(); i3++) {
            if (j10 < ((b4.a) arrayList.get(i3)).b) {
                return i3;
            }
        }
        return arrayList.size();
    }

    public j(JSONArray jSONArray) {
        this.a = 0;
        ArrayList arrayList = new ArrayList();
        if (jSONArray != null) {
            for (int i3 = 0; i3 < jSONArray.length(); i3++) {
                JSONObject optJSONObject = jSONArray.optJSONObject(i3);
                if (optJSONObject != null) {
                    arrayList.add(new i(optJSONObject));
                }
            }
        }
        this.b = arrayList;
    }
}
