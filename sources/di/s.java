package di;

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
import org.telegram.messenger.f8;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes4.dex */
public final class s implements AutoCloseable {
    public final d2.c b;
    public final d2.c c;
    public long r;
    public boolean s;
    public c w;
    public Throwable x;
    public volatile Set y;
    public final Object a = new Object();
    public final LinkedHashMap h = new LinkedHashMap(16, 0.75f, true);
    public final HashMap n = new HashMap();
    public final int e = 256;
    public final long f = 8388608;
    public final ExecutorService d = Executors.newSingleThreadExecutor(new n(0));

    public s(d2.c cVar, d2.c cVar2) {
        this.b = cVar;
        this.c = cVar2;
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
                            c a2 = d2.c.a();
                            try {
                                LinkedHashSet linkedHashSet = new LinkedHashSet();
                                Collections.addAll(linkedHashSet, a2.a.a());
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
                                this.w = a2;
                                return true;
                            } catch (Error e) {
                                e = e;
                                a2.close();
                                throw e;
                            } catch (RuntimeException e7) {
                                e = e7;
                                a2.close();
                                throw e;
                            }
                        } catch (Exception e10) {
                            e = e10;
                            this.x = e;
                            if (this.c != null) {
                                try {
                                    f8.g(e, true);
                                } catch (LinkageError | RuntimeException unused) {
                                }
                            }
                            return false;
                        }
                    } catch (LinkageError e11) {
                        e = e11;
                        this.x = e;
                        if (this.c != null) {
                        }
                        return false;
                    } catch (OutOfMemoryError e12) {
                        e = e12;
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

    public final void c(q qVar, n4.q qVar2) {
        o oVar = new o(qVar, qVar2);
        int i10 = this.e;
        if (i10 == 0) {
            return;
        }
        long j10 = oVar.b;
        long j11 = this.f;
        if (j10 > j11) {
            return;
        }
        LinkedHashMap linkedHashMap = this.h;
        linkedHashMap.put(qVar, oVar);
        this.r += j10;
        while (true) {
            if (linkedHashMap.size() <= i10 && this.r <= j11) {
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
                    int i10 = 0;
                    while (i10 < size) {
                        Object obj = arrayList.get(i10);
                        i10++;
                        ((r) obj).a = null;
                    }
                }
                this.n.clear();
                this.h.clear();
                this.r = 0L;
                this.d.execute(new m(this, 0));
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
                this.d.execute(new d1.e(3, this, qVar));
                return rVar;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
