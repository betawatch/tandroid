package l4;

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

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final class l implements b0 {
    public final a5.j a;
    public final ze.b b;
    public final long c;
    public final long d;
    public final long e;
    public final float f;
    public final float g;

    public l(Context context, o3.i iVar) {
        com.google.android.exoplayer2.upstream.w wVar = new com.google.android.exoplayer2.upstream.w();
        ze.b bVar = new ze.b();
        bVar.a = context.getApplicationContext();
        bVar.b = wVar;
        this.b = bVar;
        a5.j jVar = new a5.j();
        jVar.a = iVar;
        jVar.d = new HashMap();
        jVar.b = new HashSet();
        jVar.e = new HashMap();
        this.a = jVar;
        if (bVar != ((ze.b) jVar.c)) {
            jVar.c = bVar;
            ((HashMap) jVar.d).clear();
            ((HashMap) jVar.e).clear();
        }
        this.c = -9223372036854775807L;
        this.d = -9223372036854775807L;
        this.e = -9223372036854775807L;
        this.f = -3.4028235E38f;
        this.g = -3.4028235E38f;
    }

    public static b0 b(Class cls, com.google.android.exoplayer2.upstream.l lVar) {
        try {
            return (b0) cls.getConstructor(com.google.android.exoplayer2.upstream.l.class).newInstance(lVar);
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
    @Override // l4.b0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final a a(j3.f1 f1Var) {
        p8.i iVar;
        p8.i iVar2;
        b0 b0Var;
        j3.b1 a2;
        b0 b0Var2;
        Throwable th2;
        q8.z zVar;
        j3.x0 x0Var;
        j3.h1 h1Var;
        j3.c1 c1Var;
        j3.f1 f1Var2 = f1Var;
        j3.c1 c1Var2 = f1Var2.b;
        j3.b1 b1Var = f1Var2.c;
        c1Var2.getClass();
        j3.c1 c1Var3 = f1Var2.b;
        Uri uri = c1Var3.a;
        Uri uri2 = c1Var3.a;
        String scheme = uri.getScheme();
        if (scheme != null && scheme.equals("ssai")) {
            throw null;
        }
        int C = f5.d0.C(uri2, c1Var3.b);
        final a5.j jVar = this.a;
        HashMap hashMap = (HashMap) jVar.e;
        b0 b0Var3 = (b0) hashMap.get(Integer.valueOf(C));
        final int i10 = 0;
        final int i11 = 1;
        if (b0Var3 == null) {
            HashMap hashMap2 = (HashMap) jVar.d;
            if (hashMap2.containsKey(Integer.valueOf(C))) {
                iVar2 = (p8.i) hashMap2.get(Integer.valueOf(C));
            } else {
                final ze.b bVar = (ze.b) jVar.c;
                bVar.getClass();
                if (C == 0) {
                    final Class asSubclass = DashMediaSource$Factory.class.asSubclass(b0.class);
                    iVar = new p8.i() { // from class: l4.k
                        @Override // p8.i
                        public final Object get() {
                            switch (i10) {
                                case 0:
                                    return l.b((Class) asSubclass, bVar);
                                case 1:
                                    return l.b((Class) asSubclass, bVar);
                                case 2:
                                    return l.b((Class) asSubclass, bVar);
                                default:
                                    return new t0(bVar, (o3.i) ((a5.j) asSubclass).a);
                            }
                        }
                    };
                } else if (C != 1) {
                    final int i12 = 2;
                    if (C != 2) {
                        final int i13 = 3;
                        if (C != 3) {
                            if (C == 4) {
                                iVar = new p8.i() { // from class: l4.k
                                    @Override // p8.i
                                    public final Object get() {
                                        switch (i13) {
                                            case 0:
                                                return l.b((Class) jVar, bVar);
                                            case 1:
                                                return l.b((Class) jVar, bVar);
                                            case 2:
                                                return l.b((Class) jVar, bVar);
                                            default:
                                                return new t0(bVar, (o3.i) ((a5.j) jVar).a);
                                        }
                                    }
                                };
                            }
                            iVar = null;
                            hashMap2.put(Integer.valueOf(C), iVar);
                            if (iVar != null) {
                                ((HashSet) jVar.b).add(Integer.valueOf(C));
                            }
                            iVar2 = iVar;
                        } else {
                            iVar = new j3.o(s4.a.class.asSubclass(b0.class), 4);
                        }
                    } else {
                        final Class asSubclass2 = HlsMediaSource$Factory.class.asSubclass(b0.class);
                        iVar = new p8.i() { // from class: l4.k
                            @Override // p8.i
                            public final Object get() {
                                switch (i12) {
                                    case 0:
                                        return l.b((Class) asSubclass2, bVar);
                                    case 1:
                                        return l.b((Class) asSubclass2, bVar);
                                    case 2:
                                        return l.b((Class) asSubclass2, bVar);
                                    default:
                                        return new t0(bVar, (o3.i) ((a5.j) asSubclass2).a);
                                }
                            }
                        };
                    }
                } else {
                    final GenericDeclaration asSubclass3 = Class.forName("com.google.android.exoplayer2.source.smoothstreaming.SsMediaSource$Factory").asSubclass(b0.class);
                    iVar = new p8.i() { // from class: l4.k
                        @Override // p8.i
                        public final Object get() {
                            switch (i11) {
                                case 0:
                                    return l.b((Class) asSubclass3, bVar);
                                case 1:
                                    return l.b((Class) asSubclass3, bVar);
                                case 2:
                                    return l.b((Class) asSubclass3, bVar);
                                default:
                                    return new t0(bVar, (o3.i) ((a5.j) asSubclass3).a);
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
                b0Var = null;
                f5.a.k(b0Var, "No suitable media source factory found for content type: " + C);
                j3.a1 a10 = b1Var.a();
                if (b1Var.a == -9223372036854775807L) {
                    a10.a = this.c;
                }
                if (b1Var.d == -3.4028235E38f) {
                    a10.d = this.f;
                }
                if (b1Var.e == -3.4028235E38f) {
                    a10.e = this.g;
                }
                if (b1Var.b == -9223372036854775807L) {
                    a10.b = this.d;
                }
                if (b1Var.c == -9223372036854775807L) {
                    a10.c = this.e;
                }
                a2 = a10.a();
                if (a2.equals(b1Var)) {
                    q8.x xVar = q8.z.b;
                    q8.l0 l0Var = q8.l0.e;
                    List list = Collections.EMPTY_LIST;
                    q8.l0 l0Var2 = q8.l0.e;
                    j3.d1 d1Var = j3.d1.c;
                    j3.z0 z0Var = f1Var2.e;
                    j3.x0 x0Var2 = new j3.x0();
                    x0Var2.a = z0Var.a;
                    x0Var2.b = z0Var.b;
                    x0Var2.c = z0Var.c;
                    x0Var2.d = z0Var.d;
                    x0Var2.e = z0Var.e;
                    String str = f1Var2.a;
                    j3.h1 h1Var2 = f1Var2.d;
                    b1Var.a();
                    j3.d1 d1Var2 = f1Var2.f;
                    String str2 = c1Var3.d;
                    String str3 = c1Var3.b;
                    List list2 = c1Var3.c;
                    q8.z zVar2 = c1Var3.e;
                    Object obj = c1Var3.f;
                    q8.x xVar2 = q8.z.b;
                    q8.l0 l0Var3 = q8.l0.e;
                    j3.a1 a11 = a2.a();
                    if (uri2 != null) {
                        h1Var = h1Var2;
                        x0Var = x0Var2;
                        b0Var2 = b0Var;
                        th2 = null;
                        c1Var = new j3.c1(uri2, str3, null, list2, str2, zVar2, obj);
                    } else {
                        b0Var2 = b0Var;
                        x0Var = x0Var2;
                        h1Var = h1Var2;
                        th2 = null;
                        c1Var = null;
                    }
                    f1Var2 = new j3.f1(str != null ? str : "", new j3.z0(x0Var), c1Var, a11.a(), h1Var != null ? h1Var : j3.h1.U, d1Var2);
                } else {
                    b0Var2 = b0Var;
                    th2 = null;
                }
                j3.c1 c1Var4 = f1Var2.b;
                a a12 = b0Var2.a(f1Var2);
                zVar = c1Var4.e;
                if (!zVar.isEmpty()) {
                    a[] aVarArr = new a[zVar.size() + 1];
                    aVarArr[0] = a12;
                    if (zVar.size() > 0) {
                        this.b.getClass();
                        j3.e1 e1Var = (j3.e1) zVar.get(0);
                        new ArrayList(1);
                        new HashSet(1);
                        new CopyOnWriteArrayList();
                        new CopyOnWriteArrayList();
                        q8.x xVar3 = q8.z.b;
                        q8.l0 l0Var4 = q8.l0.e;
                        List list3 = Collections.EMPTY_LIST;
                        q8.l0 l0Var5 = q8.l0.e;
                        j3.d1 d1Var3 = j3.d1.c;
                        Uri uri3 = Uri.EMPTY;
                        e1Var.getClass();
                        throw th2;
                    }
                    a12 = new m0(aVarArr);
                }
                a aVar = a12;
                j3.z0 z0Var2 = f1Var2.e;
                long j10 = z0Var2.a;
                long j11 = z0Var2.b;
                return (j10 == 0 || j11 != Long.MIN_VALUE || z0Var2.d) ? new g(aVar, f5.d0.H(j10), f5.d0.H(j11), !z0Var2.e, z0Var2.c, z0Var2.d) : aVar;
            }
            b0Var3 = (b0) iVar2.get();
            hashMap.put(Integer.valueOf(C), b0Var3);
        }
        b0Var = b0Var3;
        f5.a.k(b0Var, "No suitable media source factory found for content type: " + C);
        j3.a1 a102 = b1Var.a();
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
        a2 = a102.a();
        if (a2.equals(b1Var)) {
        }
        j3.c1 c1Var42 = f1Var2.b;
        a a122 = b0Var2.a(f1Var2);
        zVar = c1Var42.e;
        if (!zVar.isEmpty()) {
        }
        a aVar2 = a122;
        j3.z0 z0Var22 = f1Var2.e;
        long j102 = z0Var22.a;
        long j112 = z0Var22.b;
        if (j102 == 0) {
        }
    }
}
