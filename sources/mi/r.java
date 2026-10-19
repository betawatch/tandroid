package mi;

import e2.l0;
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
import m4.v0;
import m4.z;
import org.telegram.messenger.FileLog;

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
/* loaded from: classes4.dex */
public final class r implements AutoCloseable {
    public final v0 b;
    public final v0 c;
    public long r;
    public boolean s;
    public b v;
    public Throwable w;
    public volatile Set x;
    public final Object a = new Object();
    public final LinkedHashMap h = new LinkedHashMap(16, 0.75f, true);
    public final HashMap n = new HashMap();
    public final int e = 256;
    public final long f = 8388608;
    public final ExecutorService d = Executors.newSingleThreadExecutor(new l0(1));

    public r(v0 v0Var, v0 v0Var2) {
        this.b = v0Var;
        this.c = v0Var2;
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
                if (this.v != null) {
                    return true;
                }
                if (this.w == null) {
                    try {
                        try {
                            this.b.getClass();
                            b a2 = v0.a();
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
                                this.x = DesugarCollections.unmodifiableSet(linkedHashSet);
                                this.v = a2;
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
                            this.w = e;
                            if (this.c != null) {
                                try {
                                    FileLog.e(e);
                                } catch (LinkageError | RuntimeException unused) {
                                }
                            }
                            return false;
                        }
                    } catch (LinkageError e11) {
                        e = e11;
                        this.w = e;
                        if (this.c != null) {
                        }
                        return false;
                    } catch (OutOfMemoryError e12) {
                        e = e12;
                        this.w = e;
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

    public final void c(o oVar, q qVar) {
        m mVar = new m(oVar, qVar);
        int i10 = this.e;
        if (i10 == 0) {
            return;
        }
        long j10 = mVar.b;
        long j11 = this.f;
        if (j10 > j11) {
            return;
        }
        LinkedHashMap linkedHashMap = this.h;
        linkedHashMap.put(oVar, mVar);
        this.r += j10;
        while (true) {
            if (linkedHashMap.size() <= i10 && this.r <= j11) {
                return;
            }
            Map.Entry entry = (Map.Entry) linkedHashMap.entrySet().iterator().next();
            this.r -= ((m) entry.getValue()).b;
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
                        ((p) obj).a = null;
                    }
                }
                this.n.clear();
                this.h.clear();
                this.r = 0L;
                this.d.execute(new l(this, 0));
                this.d.shutdown();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final p d(String str, String str2, n nVar) {
        if (str == null) {
            throw null;
        }
        o oVar = new o(str, b(str2));
        p pVar = new p();
        pVar.a = nVar;
        synchronized (this.a) {
            try {
                if (this.s) {
                    throw new IllegalStateException("Service is closed");
                }
                ArrayList arrayList = (ArrayList) this.n.get(oVar);
                if (arrayList != null) {
                    arrayList.add(pVar);
                    return pVar;
                }
                ArrayList arrayList2 = new ArrayList();
                arrayList2.add(pVar);
                this.n.put(oVar, arrayList2);
                this.d.execute(new z(5, this, oVar));
                return pVar;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
