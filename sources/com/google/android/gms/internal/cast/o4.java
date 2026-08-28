package com.google.android.gms.internal.cast;

import android.text.TextUtils;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class o4 implements n5.h {
    public final /* synthetic */ b3.b a;

    public /* synthetic */ o4(b3.b bVar) {
        this.a = bVar;
    }

    @Override // n5.h
    public /* bridge */ /* synthetic */ void a(n5.f fVar) {
    }

    @Override // n5.h
    public void b(n5.f fVar, int i9) {
        a6.a aVar = new a6.a(8, 3);
        aVar.b = Integer.valueOf(i9);
        w6 w6Var = new w6(aVar);
        b3.b bVar = this.a;
        b3.b.D(bVar, w6Var);
        bVar.F();
    }

    @Override // n5.h
    public void c(n5.f fVar, int i9) {
        a6.a aVar = new a6.a(9, 3);
        aVar.b = Integer.valueOf(i9);
        b3.b bVar = this.a;
        aVar.d = Boolean.valueOf(((d) bVar.b).d == 2);
        b3.b.D(bVar, new w6(aVar));
        bVar.F();
    }

    @Override // n5.h
    public void d(n5.f fVar) {
        n5.c cVar = (n5.c) fVar;
        a6.a aVar = new a6.a(2, 3);
        b3.b bVar = this.a;
        aVar.d = Boolean.valueOf(((d) bVar.b).d == 2);
        b3.b.D(bVar, new w6(aVar));
        v6 v6Var = (v6) bVar.d;
        x5.l.h(v6Var);
        v6Var.a(cVar);
        cVar.l = (o4) bVar.e;
    }

    @Override // n5.h
    public /* bridge */ /* synthetic */ void e(n5.f fVar, boolean z10) {
        w6 w6Var = new w6(new a6.a(4, 3));
        b3.b bVar = this.a;
        b3.b.D(bVar, w6Var);
        v6 v6Var = (v6) bVar.d;
        x5.l.h(v6Var);
        v6Var.a((n5.c) fVar);
    }

    @Override // n5.h
    public void f(n5.f fVar, int i9) {
        a6.a aVar = new a6.a(6, 3);
        aVar.b = Integer.valueOf(i9);
        w6 w6Var = new w6(aVar);
        b3.b bVar = this.a;
        b3.b.D(bVar, w6Var);
        v6 v6Var = (v6) bVar.d;
        x5.l.h(v6Var);
        v6Var.a((n5.c) fVar);
    }

    @Override // n5.h
    public void g(n5.f fVar, int i9) {
        a6.a aVar = new a6.a(5, 3);
        aVar.b = Integer.valueOf(i9);
        w6 w6Var = new w6(aVar);
        b3.b bVar = this.a;
        b3.b.D(bVar, w6Var);
        bVar.F();
    }

    @Override // n5.h
    public void h(n5.f fVar, String str) {
        w6 w6Var = new w6(new a6.a(4, 3));
        b3.b bVar = this.a;
        b3.b.D(bVar, w6Var);
        v6 v6Var = (v6) bVar.d;
        x5.l.h(v6Var);
        v6Var.a((n5.c) fVar);
        v6 v6Var2 = (v6) bVar.d;
        x5.l.h(v6Var2);
        String str2 = v6Var2.k;
        if (str2 == null) {
            v6Var2.k = str;
        } else {
            if (TextUtils.equals(str, str2)) {
                return;
            }
            v6Var2.b(4);
        }
    }

    @Override // n5.h
    public void i(n5.f fVar, String str) {
        w6 w6Var = new w6(new a6.a(7, 3));
        b3.b bVar = this.a;
        b3.b.D(bVar, w6Var);
        v6 v6Var = (v6) bVar.d;
        x5.l.h(v6Var);
        v6Var.a((n5.c) fVar);
        v6 v6Var2 = (v6) bVar.d;
        x5.l.h(v6Var2);
        String str2 = v6Var2.k;
        if (str2 == null) {
            v6Var2.k = str;
        } else {
            if (TextUtils.equals(str, str2)) {
                return;
            }
            v6Var2.b(4);
        }
    }
}
