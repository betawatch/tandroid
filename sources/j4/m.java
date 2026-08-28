package j4;

import android.content.Context;
import android.net.Uri;
import com.google.android.exoplayer2.source.dash.DashMediaSource$Factory;
import com.google.android.exoplayer2.source.hls.HlsMediaSource$Factory;
import java.lang.reflect.GenericDeclaration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class m implements c0 {
    public final b3.b a;
    public final we.b b;
    public final long c;
    public final long d;
    public final long e;
    public final float f;
    public final float g;

    public m(Context context, m3.i iVar) {
        we.b bVar = new we.b(context, 12);
        this.b = bVar;
        b3.b bVar2 = new b3.b();
        bVar2.a = iVar;
        bVar2.b = new HashMap();
        bVar2.c = new HashSet();
        bVar2.d = new HashMap();
        this.a = bVar2;
        if (bVar != ((we.b) bVar2.e)) {
            bVar2.e = bVar;
            ((HashMap) bVar2.b).clear();
            ((HashMap) bVar2.d).clear();
        }
        this.c = -9223372036854775807L;
        this.d = -9223372036854775807L;
        this.e = -9223372036854775807L;
        this.f = -3.4028235E38f;
        this.g = -3.4028235E38f;
    }

    public static c0 b(Class cls, com.google.android.exoplayer2.upstream.l lVar) {
        try {
            return (c0) cls.getConstructor(com.google.android.exoplayer2.upstream.l.class).newInstance(lVar);
        } catch (Exception e10) {
            throw new IllegalStateException(e10);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x01cf  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x01bc  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00b7  */
    @Override // j4.c0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final a a(h3.f1 f1Var) {
        n8.i iVar;
        n8.i iVar2;
        c0 c0Var;
        h3.b1 a2;
        c0 c0Var2;
        Throwable th;
        o8.z zVar;
        h3.x0 x0Var;
        h3.h1 h1Var;
        h3.c1 c1Var;
        h3.f1 f1Var2 = f1Var;
        h3.c1 c1Var2 = f1Var2.b;
        h3.b1 b1Var = f1Var2.c;
        c1Var2.getClass();
        h3.c1 c1Var3 = f1Var2.b;
        Uri uri = c1Var3.a;
        Uri uri2 = c1Var3.a;
        String scheme = uri.getScheme();
        if (scheme != null && scheme.equals("ssai")) {
            throw null;
        }
        int C = d5.f0.C(uri2, c1Var3.b);
        final b3.b bVar = this.a;
        HashMap hashMap = (HashMap) bVar.d;
        c0 c0Var3 = (c0) hashMap.get(Integer.valueOf(C));
        final int i9 = 0;
        final int i10 = 1;
        if (c0Var3 == null) {
            HashMap hashMap2 = (HashMap) bVar.b;
            if (hashMap2.containsKey(Integer.valueOf(C))) {
                iVar2 = (n8.i) hashMap2.get(Integer.valueOf(C));
            } else {
                final we.b bVar2 = (we.b) bVar.e;
                bVar2.getClass();
                if (C == 0) {
                    final Class asSubclass = DashMediaSource$Factory.class.asSubclass(c0.class);
                    iVar = new n8.i() { // from class: j4.l
                        @Override // n8.i
                        public final Object get() {
                            switch (i9) {
                                case 0:
                                    return m.b((Class) asSubclass, bVar2);
                                case 1:
                                    return m.b((Class) asSubclass, bVar2);
                                case 2:
                                    return m.b((Class) asSubclass, bVar2);
                                default:
                                    return new t0(bVar2, (m3.i) ((b3.b) asSubclass).a);
                            }
                        }
                    };
                } else if (C != 1) {
                    final int i11 = 2;
                    if (C != 2) {
                        final int i12 = 3;
                        if (C != 3) {
                            if (C == 4) {
                                iVar = new n8.i() { // from class: j4.l
                                    @Override // n8.i
                                    public final Object get() {
                                        switch (i12) {
                                            case 0:
                                                return m.b((Class) bVar, bVar2);
                                            case 1:
                                                return m.b((Class) bVar, bVar2);
                                            case 2:
                                                return m.b((Class) bVar, bVar2);
                                            default:
                                                return new t0(bVar2, (m3.i) ((b3.b) bVar).a);
                                        }
                                    }
                                };
                            }
                            iVar = null;
                            hashMap2.put(Integer.valueOf(C), iVar);
                            if (iVar != null) {
                                ((HashSet) bVar.c).add(Integer.valueOf(C));
                            }
                            iVar2 = iVar;
                        } else {
                            iVar = new h3.o(q4.a.class.asSubclass(c0.class), 4);
                        }
                    } else {
                        final Class asSubclass2 = HlsMediaSource$Factory.class.asSubclass(c0.class);
                        iVar = new n8.i() { // from class: j4.l
                            @Override // n8.i
                            public final Object get() {
                                switch (i11) {
                                    case 0:
                                        return m.b((Class) asSubclass2, bVar2);
                                    case 1:
                                        return m.b((Class) asSubclass2, bVar2);
                                    case 2:
                                        return m.b((Class) asSubclass2, bVar2);
                                    default:
                                        return new t0(bVar2, (m3.i) ((b3.b) asSubclass2).a);
                                }
                            }
                        };
                    }
                } else {
                    final GenericDeclaration asSubclass3 = Class.forName("com.google.android.exoplayer2.source.smoothstreaming.SsMediaSource$Factory").asSubclass(c0.class);
                    iVar = new n8.i() { // from class: j4.l
                        @Override // n8.i
                        public final Object get() {
                            switch (i10) {
                                case 0:
                                    return m.b((Class) asSubclass3, bVar2);
                                case 1:
                                    return m.b((Class) asSubclass3, bVar2);
                                case 2:
                                    return m.b((Class) asSubclass3, bVar2);
                                default:
                                    return new t0(bVar2, (m3.i) ((b3.b) asSubclass3).a);
                            }
                        }
                    };
                }
                hashMap2.put(Integer.valueOf(C), iVar);
                if (iVar != null) {
                }
                iVar2 = iVar;
            }
            if (iVar2 == null) {
                c0Var = null;
                d5.a.k(c0Var, "No suitable media source factory found for content type: " + C);
                h3.a1 a3 = b1Var.a();
                if (b1Var.a == -9223372036854775807L) {
                    a3.a = this.c;
                }
                if (b1Var.d == -3.4028235E38f) {
                    a3.d = this.f;
                }
                if (b1Var.e == -3.4028235E38f) {
                    a3.e = this.g;
                }
                if (b1Var.b == -9223372036854775807L) {
                    a3.b = this.d;
                }
                if (b1Var.c == -9223372036854775807L) {
                    a3.c = this.e;
                }
                a2 = a3.a();
                if (a2.equals(b1Var)) {
                    o8.x xVar = o8.z.b;
                    o8.l0 l0Var = o8.l0.e;
                    List list = Collections.EMPTY_LIST;
                    o8.l0 l0Var2 = o8.l0.e;
                    h3.d1 d1Var = h3.d1.c;
                    h3.z0 z0Var = f1Var2.e;
                    h3.x0 x0Var2 = new h3.x0();
                    x0Var2.a = z0Var.a;
                    x0Var2.b = z0Var.b;
                    x0Var2.c = z0Var.c;
                    x0Var2.d = z0Var.d;
                    x0Var2.e = z0Var.e;
                    String str = f1Var2.a;
                    h3.h1 h1Var2 = f1Var2.d;
                    b1Var.a();
                    h3.d1 d1Var2 = f1Var2.f;
                    String str2 = c1Var3.d;
                    String str3 = c1Var3.b;
                    List list2 = c1Var3.c;
                    o8.z zVar2 = c1Var3.e;
                    Object obj = c1Var3.f;
                    o8.x xVar2 = o8.z.b;
                    o8.l0 l0Var3 = o8.l0.e;
                    h3.a1 a10 = a2.a();
                    if (uri2 != null) {
                        h1Var = h1Var2;
                        x0Var = x0Var2;
                        c0Var2 = c0Var;
                        th = null;
                        c1Var = new h3.c1(uri2, str3, null, list2, str2, zVar2, obj);
                    } else {
                        c0Var2 = c0Var;
                        x0Var = x0Var2;
                        h1Var = h1Var2;
                        th = null;
                        c1Var = null;
                    }
                    f1Var2 = new h3.f1(str != null ? str : "", new h3.z0(x0Var), c1Var, a10.a(), h1Var != null ? h1Var : h3.h1.U, d1Var2);
                } else {
                    c0Var2 = c0Var;
                    th = null;
                }
                h3.c1 c1Var4 = f1Var2.b;
                a a11 = c0Var2.a(f1Var2);
                zVar = c1Var4.e;
                if (!zVar.isEmpty()) {
                    a[] aVarArr = new a[zVar.size() + 1];
                    aVarArr[0] = a11;
                    if (zVar.size() > 0) {
                        this.b.getClass();
                        h3.e1 e1Var = (h3.e1) zVar.get(0);
                        new ArrayList(1);
                        new HashSet(1);
                        new CopyOnWriteArrayList();
                        new CopyOnWriteArrayList();
                        o8.x xVar3 = o8.z.b;
                        o8.l0 l0Var4 = o8.l0.e;
                        List list3 = Collections.EMPTY_LIST;
                        o8.l0 l0Var5 = o8.l0.e;
                        h3.d1 d1Var3 = h3.d1.c;
                        Uri uri3 = Uri.EMPTY;
                        e1Var.getClass();
                        throw th;
                    }
                    a11 = new n0(aVarArr);
                }
                a aVar = a11;
                h3.z0 z0Var2 = f1Var2.e;
                long j10 = z0Var2.a;
                long j11 = z0Var2.b;
                return (j10 == 0 || j11 != Long.MIN_VALUE || z0Var2.d) ? new h(aVar, d5.f0.H(j10), d5.f0.H(j11), !z0Var2.e, z0Var2.c, z0Var2.d) : aVar;
            }
            c0Var3 = (c0) iVar2.get();
            hashMap.put(Integer.valueOf(C), c0Var3);
        }
        c0Var = c0Var3;
        d5.a.k(c0Var, "No suitable media source factory found for content type: " + C);
        h3.a1 a32 = b1Var.a();
        if (b1Var.a == -9223372036854775807L) {
        }
        if (b1Var.d == -3.4028235E38f) {
        }
        if (b1Var.e == -3.4028235E38f) {
        }
        if (b1Var.b == -9223372036854775807L) {
        }
        if (b1Var.c == -9223372036854775807L) {
        }
        a2 = a32.a();
        if (a2.equals(b1Var)) {
        }
        h3.c1 c1Var42 = f1Var2.b;
        a a112 = c0Var2.a(f1Var2);
        zVar = c1Var42.e;
        if (!zVar.isEmpty()) {
        }
        a aVar2 = a112;
        h3.z0 z0Var22 = f1Var2.e;
        long j102 = z0Var22.a;
        long j112 = z0Var22.b;
        if (j102 == 0) {
        }
    }
}
