package ni;

import h2.l0;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import li.j3;
import org.telegram.messenger.a8;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes4.dex */
public final class s implements AutoCloseable {
    public final a b;
    public final a c;
    public long r;
    public boolean s;
    public d w;
    public Throwable x;
    public volatile Set y;
    public final Object a = new Object();
    public final LinkedHashMap h = new LinkedHashMap(16, 0.75f, true);
    public final HashMap n = new HashMap();
    public final int e = 256;
    public final long f = 8388608;
    public final ExecutorService d = Executors.newSingleThreadExecutor(new l0(1));

    public s(a aVar, a aVar2) {
        this.b = aVar;
        this.c = aVar2;
    }

    public static String b(String str) {
        String lowerCase;
        if (str == null) {
            return "";
        }
        lowerCase = str.trim().toLowerCase(Locale.ROOT);
        lowerCase.getClass();
        switch (lowerCase) {
            case "c#":
                return "csharp";
            case "fc":
                return "func";
            case "c++":
                return "cpp";
            case "fif":
                return "fift";
            case "tl-b":
                return "tlb";
            default:
                return lowerCase;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x0075 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean a() {
        synchronized (this.a) {
            try {
                if (this.s) {
                    return false;
                }
                if (this.w != null) {
                    return true;
                }
                if (this.x == null) {
                    try {
                        try {
                            this.b.getClass();
                            d a10 = a.a();
                            try {
                                LinkedHashSet linkedHashSet = new LinkedHashSet();
                                Collections.addAll(linkedHashSet, a10.a.a());
                                if (linkedHashSet.contains("func")) {
                                    linkedHashSet.add("fc");
                                }
                                if (linkedHashSet.contains("fift")) {
                                    linkedHashSet.add("fif");
                                }
                                if (linkedHashSet.contains("tlb")) {
                                    linkedHashSet.add("tl-b");
                                }
                                this.y = DesugarCollections.unmodifiableSet(linkedHashSet);
                                this.w = a10;
                                return true;
                            } catch (Error e10) {
                                e = e10;
                                a10.close();
                                throw e;
                            } catch (RuntimeException e11) {
                                e = e11;
                                a10.close();
                                throw e;
                            }
                        } catch (Exception e12) {
                            e = e12;
                            this.x = e;
                            if (this.c != null) {
                                try {
                                    a8.g(e, true);
                                } catch (LinkageError | RuntimeException unused) {
                                }
                            }
                            return false;
                        }
                    } catch (LinkageError e13) {
                        e = e13;
                        this.x = e;
                        if (this.c != null) {
                        }
                        return false;
                    } catch (OutOfMemoryError e14) {
                        e = e14;
                        this.x = e;
                        if (this.c != null) {
                        }
                        return false;
                    }
                }
                return false;
            } finally {
            }
        }
    }

    public final void c(q qVar, j2.n nVar) {
        o oVar = new o(qVar, nVar);
        int i7 = this.e;
        if (i7 == 0) {
            return;
        }
        long j3 = oVar.b;
        long j10 = this.f;
        if (j3 > j10) {
            return;
        }
        LinkedHashMap linkedHashMap = this.h;
        linkedHashMap.put(qVar, oVar);
        this.r += j3;
        while (true) {
            if (linkedHashMap.size() <= i7 && this.r <= j10) {
                return;
            }
            Map.Entry entry = (Map.Entry) linkedHashMap.entrySet().iterator().next();
            this.r -= ((o) entry.getValue()).b;
            linkedHashMap.remove(entry.getKey());
        }
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        synchronized (this.a) {
            try {
                if (this.s) {
                    return;
                }
                this.s = true;
                for (ArrayList arrayList : this.n.values()) {
                    int size = arrayList.size();
                    int i7 = 0;
                    while (i7 < size) {
                        Object obj = arrayList.get(i7);
                        i7++;
                        ((r) obj).a = null;
                    }
                }
                this.n.clear();
                this.h.clear();
                this.r = 0L;
                this.d.execute(new n(this, 0));
                this.d.shutdown();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final r d(String str, String str2, p pVar) {
        if (str == null) {
            throw null;
        }
        q qVar = new q(str, b(str2));
        r rVar = new r();
        rVar.a = pVar;
        synchronized (this.a) {
            try {
                if (this.s) {
                    throw new IllegalStateException("Service is closed");
                }
                ArrayList arrayList = (ArrayList) this.n.get(qVar);
                if (arrayList != null) {
                    arrayList.add(rVar);
                    return rVar;
                }
                ArrayList arrayList2 = new ArrayList();
                arrayList2.add(rVar);
                this.n.put(qVar, arrayList2);
                this.d.execute(new j3(14, this, qVar));
                return rVar;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
