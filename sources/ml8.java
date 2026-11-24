// default package

import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes3.dex */
public final class ml8 implements AutoCloseable {
    public long e;
    public boolean f;
    public vk2 h;
    public Throwable n;
    public volatile Set r;
    public final Object a = new Object();
    public final LinkedHashMap c = new LinkedHashMap(16, 0.75f, true);
    public final HashMap d = new HashMap();
    public final ExecutorService b = Executors.newSingleThreadExecutor(new y30((byte) 4));

    public ml8(a32 a32Var, a32 a32Var2) {
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

    public final boolean a() {
        synchronized (this.a) {
            if (this.f) {
                return false;
            }
            if (this.h != null) {
                return true;
            }
            if (this.n == null) {
                try {
                    try {
                        vk2 c = a32.c();
                        try {
                            LinkedHashSet linkedHashSet = new LinkedHashSet();
                            Collections.addAll(linkedHashSet, c.a.a());
                            if (linkedHashSet.contains("func")) {
                                linkedHashSet.add("fc");
                            }
                            if (linkedHashSet.contains("fift")) {
                                linkedHashSet.add("fif");
                            }
                            if (linkedHashSet.contains("tlb")) {
                                linkedHashSet.add("tl-b");
                            }
                            this.r = DesugarCollections.unmodifiableSet(linkedHashSet);
                            this.h = c;
                            return true;
                        } catch (Error | RuntimeException e) {
                            c.close();
                            throw e;
                        }
                    } catch (Exception e2) {
                        e = e2;
                        this.n = e;
                        try {
                            fc4.g(e, true);
                        } catch (LinkageError | RuntimeException unused) {
                        }
                        return false;
                    }
                } catch (LinkageError e3) {
                    e = e3;
                    this.n = e;
                    fc4.g(e, true);
                    return false;
                } catch (OutOfMemoryError e4) {
                    e = e4;
                    this.n = e;
                    fc4.g(e, true);
                    return false;
                }
            }
            return false;
        }
    }

    public final void c(kl8 kl8Var, wm4 wm4Var) {
        il8 il8Var = new il8(kl8Var, wm4Var);
        long j = il8Var.b;
        if (j > 8388608) {
            return;
        }
        LinkedHashMap linkedHashMap = this.c;
        linkedHashMap.put(kl8Var, il8Var);
        this.e += j;
        while (true) {
            if (linkedHashMap.size() <= 256 && this.e <= 8388608) {
                return;
            }
            Map.Entry entry = (Map.Entry) linkedHashMap.entrySet().iterator().next();
            this.e -= ((il8) entry.getValue()).b;
            linkedHashMap.remove(entry.getKey());
        }
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        synchronized (this.a) {
            if (this.f) {
                return;
            }
            this.f = true;
            Iterator it = this.d.values().iterator();
            while (true) {
                int i = 0;
                if (!it.hasNext()) {
                    this.d.clear();
                    this.c.clear();
                    this.e = 0L;
                    this.b.execute(new hl8(this, (byte) 0));
                    this.b.shutdown();
                    return;
                }
                ArrayList arrayList = (ArrayList) it.next();
                int size = arrayList.size();
                while (i < size) {
                    Object obj = arrayList.get(i);
                    i++;
                    ((ll8) obj).a = null;
                }
            }
        }
    }

    public final ll8 d(String str, String str2, jl8 jl8Var) {
        if (str == null) {
            throw null;
        }
        kl8 kl8Var = new kl8(str, b(str2));
        ll8 ll8Var = new ll8();
        ll8Var.a = jl8Var;
        synchronized (this.a) {
            if (this.f) {
                throw new IllegalStateException("Service is closed");
            }
            ArrayList arrayList = (ArrayList) this.d.get(kl8Var);
            if (arrayList != null) {
                arrayList.add(ll8Var);
                return ll8Var;
            }
            ArrayList arrayList2 = new ArrayList();
            arrayList2.add(ll8Var);
            this.d.put(kl8Var, arrayList2);
            this.b.execute(new a18(this, kl8Var, (byte) 24));
            return ll8Var;
        }
    }
}
