package f5;

import a8.ia;
import h9.g0;
import h9.i0;
import h9.t1;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes.dex */
public final class j implements z2.a {
    public final ArrayList a;

    public j(JSONArray jSONArray) {
        ArrayList arrayList = new ArrayList();
        if (jSONArray != null) {
            for (int i7 = 0; i7 < jSONArray.length(); i7++) {
                JSONObject optJSONObject = jSONArray.optJSONObject(i7);
                if (optJSONObject != null) {
                    arrayList.add(new i(optJSONObject));
                }
            }
        }
        this.a = arrayList;
    }

    @Override // z2.a
    public long a(long j3) {
        ArrayList arrayList = this.a;
        if (arrayList.isEmpty()) {
            return Long.MIN_VALUE;
        }
        if (j3 < ((c4.a) arrayList.get(0)).b) {
            return ((c4.a) arrayList.get(0)).b;
        }
        for (int i7 = 1; i7 < arrayList.size(); i7++) {
            c4.a aVar = (c4.a) arrayList.get(i7);
            long j10 = aVar.b;
            long j11 = aVar.b;
            if (j3 < j10) {
                long j12 = ((c4.a) arrayList.get(i7 - 1)).d;
                return (j12 == -9223372036854775807L || j12 <= j3 || j12 >= j11) ? j11 : j12;
            }
        }
        long j13 = ((c4.a) h9.o.n(arrayList)).d;
        if (j13 == -9223372036854775807L || j3 >= j13) {
            return Long.MIN_VALUE;
        }
        return j13;
    }

    @Override // z2.a
    public i0 b(long j3) {
        int f10 = f(j3);
        if (f10 == 0) {
            g0 g0Var = i0.b;
            return t1.e;
        }
        c4.a aVar = (c4.a) this.a.get(f10 - 1);
        long j10 = aVar.d;
        if (j10 == -9223372036854775807L || j3 < j10) {
            return aVar.a;
        }
        g0 g0Var2 = i0.b;
        return t1.e;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x002d  */
    @Override // z2.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean c(c4.a aVar, long j3) {
        boolean z9;
        int size;
        long j10 = aVar.b;
        ia.f(j10 != -9223372036854775807L);
        if (j10 <= j3) {
            long j11 = aVar.d;
            if (j11 == -9223372036854775807L || j3 < j11) {
                z9 = true;
                ArrayList arrayList = this.a;
                for (size = arrayList.size() - 1; size >= 0; size--) {
                    if (j10 >= ((c4.a) arrayList.get(size)).b) {
                        arrayList.add(size + 1, aVar);
                        return z9;
                    }
                    if (((c4.a) arrayList.get(size)).b <= j3) {
                        z9 = false;
                    }
                }
                arrayList.add(0, aVar);
                return z9;
            }
        }
        z9 = false;
        ArrayList arrayList2 = this.a;
        while (size >= 0) {
        }
        arrayList2.add(0, aVar);
        return z9;
    }

    @Override // z2.a
    public void clear() {
        this.a.clear();
    }

    @Override // z2.a
    public long d(long j3) {
        ArrayList arrayList = this.a;
        if (arrayList.isEmpty() || j3 < ((c4.a) arrayList.get(0)).b) {
            return -9223372036854775807L;
        }
        for (int i7 = 1; i7 < arrayList.size(); i7++) {
            long j10 = ((c4.a) arrayList.get(i7)).b;
            if (j3 == j10) {
                return j10;
            }
            if (j3 < j10) {
                c4.a aVar = (c4.a) arrayList.get(i7 - 1);
                long j11 = aVar.d;
                return (j11 == -9223372036854775807L || j11 > j3) ? aVar.b : j11;
            }
        }
        c4.a aVar2 = (c4.a) h9.o.n(arrayList);
        long j12 = aVar2.d;
        return (j12 == -9223372036854775807L || j3 < j12) ? aVar2.b : j12;
    }

    @Override // z2.a
    public void e(long j3) {
        int f10 = f(j3);
        if (f10 == 0) {
            return;
        }
        ArrayList arrayList = this.a;
        long j10 = ((c4.a) arrayList.get(f10 - 1)).d;
        if (j10 == -9223372036854775807L || j10 >= j3) {
            f10--;
        }
        arrayList.subList(0, f10).clear();
    }

    public int f(long j3) {
        int i7 = 0;
        while (true) {
            ArrayList arrayList = this.a;
            if (i7 >= arrayList.size()) {
                return arrayList.size();
            }
            if (j3 < ((c4.a) arrayList.get(i7)).b) {
                return i7;
            }
            i7++;
        }
    }

    public j() {
        this.a = new ArrayList();
    }
}
