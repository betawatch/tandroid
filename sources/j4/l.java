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

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final class l implements b0 {
    public final af.h a;
    public final xe.b b;
    public final long c;
    public final long d;
    public final long e;
    public final float f;
    public final float g;

    public l(Context context, m3.i iVar) {
        xe.b bVar = new xe.b(context, 11);
        this.b = bVar;
        af.h hVar = new af.h();
        hVar.a = iVar;
        hVar.b = new HashMap();
        hVar.c = new HashSet();
        hVar.d = new HashMap();
        this.a = hVar;
        if (bVar != ((xe.b) hVar.e)) {
            hVar.e = bVar;
            ((HashMap) hVar.b).clear();
            ((HashMap) hVar.d).clear();
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
        } catch (Exception e9) {
            throw new IllegalStateException(e9);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x00b6  */
    @Override // j4.b0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final a a(h3.f1 f1Var) {
        o8.i iVar;
        o8.i iVar2;
        o8.i iVar3;
        h3.f1 f1Var2 = f1Var;
        h3.c1 c1Var = f1Var2.b;
        h3.b1 b1Var = f1Var2.c;
        c1Var.getClass();
        h3.c1 c1Var2 = f1Var2.b;
        String scheme = c1Var2.a.getScheme();
        if (scheme != null && scheme.equals("ssai")) {
            throw null;
        }
        int C = d5.g0.C(c1Var2.a);
        final af.h hVar = this.a;
        HashMap hashMap = (HashMap) hVar.d;
        b0 b0Var = (b0) hashMap.get(Integer.valueOf(C));
        final int i10 = 0;
        final int i11 = 1;
        if (b0Var == null) {
            HashMap hashMap2 = (HashMap) hVar.b;
            if (hashMap2.containsKey(Integer.valueOf(C))) {
                iVar2 = (o8.i) hashMap2.get(Integer.valueOf(C));
            } else {
                final xe.b bVar = (xe.b) hVar.e;
                bVar.getClass();
                if (C == 0) {
                    final Class asSubclass = DashMediaSource$Factory.class.asSubclass(b0.class);
                    iVar3 = new o8.i() { // from class: j4.k
                        @Override // o8.i
                        public final Object get() {
                            switch (i10) {
                                case 0:
                                    return l.b((Class) asSubclass, bVar);
                                case 1:
                                    return l.b((Class) asSubclass, bVar);
                                case 2:
                                    return l.b((Class) asSubclass, bVar);
                                default:
                                    return new s0(bVar, (m3.i) ((af.h) asSubclass).a);
                            }
                        }
                    };
                } else if (C != 1) {
                    final int i12 = 2;
                    if (C != 2) {
                        final int i13 = 3;
                        if (C != 3) {
                            if (C == 4) {
                                iVar = new o8.i() { // from class: j4.k
                                    @Override // o8.i
                                    public final Object get() {
                                        switch (i13) {
                                            case 0:
                                                return l.b((Class) hVar, bVar);
                                            case 1:
                                                return l.b((Class) hVar, bVar);
                                            case 2:
                                                return l.b((Class) hVar, bVar);
                                            default:
                                                return new s0(bVar, (m3.i) ((af.h) hVar).a);
                                        }
                                    }
                                };
                            }
                            iVar = null;
                        } else {
                            iVar = new h3.o(q4.a.class.asSubclass(b0.class), 4);
                        }
                    } else {
                        final Class asSubclass2 = HlsMediaSource$Factory.class.asSubclass(b0.class);
                        iVar = new o8.i() { // from class: j4.k
                            @Override // o8.i
                            public final Object get() {
                                switch (i12) {
                                    case 0:
                                        return l.b((Class) asSubclass2, bVar);
                                    case 1:
                                        return l.b((Class) asSubclass2, bVar);
                                    case 2:
                                        return l.b((Class) asSubclass2, bVar);
                                    default:
                                        return new s0(bVar, (m3.i) ((af.h) asSubclass2).a);
                                }
                            }
                        };
                    }
                    hashMap2.put(Integer.valueOf(C), iVar);
                    if (iVar != null) {
                        ((HashSet) hVar.c).add(Integer.valueOf(C));
                    }
                    iVar2 = iVar;
                } else {
                    final GenericDeclaration asSubclass3 = Class.forName("com.google.android.exoplayer2.source.smoothstreaming.SsMediaSource$Factory").asSubclass(b0.class);
                    iVar3 = new o8.i() { // from class: j4.k
                        @Override // o8.i
                        public final Object get() {
                            switch (i11) {
                                case 0:
                                    return l.b((Class) asSubclass3, bVar);
                                case 1:
                                    return l.b((Class) asSubclass3, bVar);
                                case 2:
                                    return l.b((Class) asSubclass3, bVar);
                                default:
                                    return new s0(bVar, (m3.i) ((af.h) asSubclass3).a);
                            }
                        }
                    };
                }
                iVar = iVar3;
                hashMap2.put(Integer.valueOf(C), iVar);
                if (iVar != null) {
                }
                iVar2 = iVar;
            }
            if (iVar2 == null) {
                b0Var = null;
            } else {
                b0Var = (b0) iVar2.get();
                hashMap.put(Integer.valueOf(C), b0Var);
            }
        }
        d5.a.k(b0Var, "No suitable media source factory found for content type: " + C);
        h3.a1 a2 = b1Var.a();
        if (b1Var.a == -9223372036854775807L) {
            a2.a = this.c;
        }
        if (b1Var.d == -3.4028235E38f) {
            a2.d = this.f;
        }
        if (b1Var.e == -3.4028235E38f) {
            a2.e = this.g;
        }
        if (b1Var.b == -9223372036854775807L) {
            a2.b = this.d;
        }
        if (b1Var.c == -9223372036854775807L) {
            a2.c = this.e;
        }
        h3.b1 a3 = a2.a();
        if (!a3.equals(b1Var)) {
            new e7.v();
            List list = Collections.EMPTY_LIST;
            p8.l0 l0Var = p8.l0.e;
            h3.d1 d1Var = h3.d1.c;
            h3.z0 z0Var = f1Var2.e;
            h3.x0 x0Var = new h3.x0();
            x0Var.a = z0Var.a;
            x0Var.b = z0Var.b;
            x0Var.c = z0Var.c;
            x0Var.d = z0Var.d;
            x0Var.e = z0Var.e;
            String str = f1Var2.a;
            h3.h1 h1Var = f1Var2.d;
            b1Var.a();
            h3.d1 d1Var2 = f1Var2.f;
            Uri uri = c1Var2.a;
            List list2 = c1Var2.b;
            p8.z zVar = c1Var2.c;
            new e7.v();
            h3.a1 a10 = a3.a();
            h3.c1 c1Var3 = uri != null ? new h3.c1(uri, null, list2, zVar) : null;
            if (str == null) {
                str = "";
            }
            String str2 = str;
            h3.z0 z0Var2 = new h3.z0(x0Var);
            h3.b1 a11 = a10.a();
            if (h1Var == null) {
                h1Var = h3.h1.U;
            }
            f1Var2 = new h3.f1(str2, z0Var2, c1Var3, a11, h1Var, d1Var2);
        }
        h3.c1 c1Var4 = f1Var2.b;
        a a12 = b0Var.a(f1Var2);
        p8.z zVar2 = c1Var4.c;
        if (!zVar2.isEmpty()) {
            a[] aVarArr = new a[zVar2.size() + 1];
            aVarArr[0] = a12;
            if (zVar2.size() > 0) {
                this.b.getClass();
                h3.e1 e1Var = (h3.e1) zVar2.get(0);
                new ArrayList(1);
                new HashSet(1);
                new CopyOnWriteArrayList();
                new CopyOnWriteArrayList();
                p8.x xVar = p8.z.b;
                p8.l0 l0Var2 = p8.l0.e;
                List list3 = Collections.EMPTY_LIST;
                p8.l0 l0Var3 = p8.l0.e;
                h3.d1 d1Var3 = h3.d1.c;
                Uri uri2 = Uri.EMPTY;
                e1Var.getClass();
                throw null;
            }
            a12 = new m0(aVarArr);
        }
        a aVar = a12;
        h3.z0 z0Var3 = f1Var2.e;
        long j10 = z0Var3.a;
        long j11 = z0Var3.b;
        return (j10 == 0 && j11 == Long.MIN_VALUE && !z0Var3.d) ? aVar : new g(aVar, d5.g0.H(j10), d5.g0.H(j11), !z0Var3.e, z0Var3.c, z0Var3.d);
    }
}
