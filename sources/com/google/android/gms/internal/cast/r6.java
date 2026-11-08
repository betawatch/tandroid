package com.google.android.gms.internal.cast;

import android.text.TextUtils;
import com.google.android.gms.cast.CastDevice;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes.dex */
public final class r6 {
    public static final j6.b n = new j6.b("SessionFlowSummary", null);
    public static final String o = "21.4.0";
    public static long p = System.currentTimeMillis();
    public final b0 a;
    public final List b;
    public final List c;
    public final List d;
    public final Map e;
    public final m0 f;
    public final String g;
    public final long h;
    public final long i;
    public g6.c j;
    public String k;
    public String l;
    public String m;

    public r6(m0 m0Var, String str) {
        b1 b1Var = b1.b;
        b0 b0Var = new b0(0);
        b0Var.c = b1Var;
        this.a = b0Var;
        this.b = DesugarCollections.synchronizedList(new ArrayList());
        this.c = DesugarCollections.synchronizedList(new ArrayList());
        this.d = DesugarCollections.synchronizedList(new ArrayList());
        this.e = DesugarCollections.synchronizedMap(new HashMap());
        this.f = m0Var;
        this.g = str;
        this.h = System.currentTimeMillis();
        long j3 = p;
        p = 1 + j3;
        this.i = j3;
    }

    public final void a(g6.c cVar) {
        if (cVar == null) {
            b(2);
            return;
        }
        q6.m.d("Must be called from the main thread.");
        CastDevice castDevice = cVar.k;
        if (castDevice == null) {
            b(3);
            return;
        }
        String str = castDevice.x;
        this.j = cVar;
        String str2 = this.l;
        if (str2 == null) {
            this.l = str;
            this.m = castDevice.e;
            cVar.e();
        } else {
            if (TextUtils.equals(str2, str)) {
                return;
            }
            b(5);
        }
    }

    public final void b(int i7) {
        Integer valueOf = Integer.valueOf(i7 - 1);
        Map map = this.e;
        b bVar = (b) map.get(valueOf);
        if (bVar != null) {
            bVar.d.incrementAndGet();
            bVar.b = System.currentTimeMillis();
        } else {
            b bVar2 = new b(new b7.l(i7));
            bVar2.c = this.h;
            map.put(valueOf, bVar2);
        }
    }
}
