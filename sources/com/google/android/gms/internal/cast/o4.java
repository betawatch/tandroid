package com.google.android.gms.internal.cast;

import android.text.TextUtils;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final class o4 implements p5.h {
    public final /* synthetic */ a5.j a;

    public /* synthetic */ o4(a5.j jVar) {
        this.a = jVar;
    }

    @Override // p5.h
    public void a(p5.f fVar, String str) {
        w6 w6Var = new w6(new ag.j2(7, 4));
        a5.j jVar = this.a;
        a5.j.y(jVar, w6Var);
        v6 v6Var = (v6) jVar.d;
        z5.l.h(v6Var);
        v6Var.a((p5.c) fVar);
        v6 v6Var2 = (v6) jVar.d;
        z5.l.h(v6Var2);
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

    @Override // p5.h
    public void b(p5.f fVar) {
        p5.c cVar = (p5.c) fVar;
        ag.j2 j2Var = new ag.j2(2, 4);
        a5.j jVar = this.a;
        j2Var.d = Boolean.valueOf(((d) jVar.b).d == 2);
        a5.j.y(jVar, new w6(j2Var));
        v6 v6Var = (v6) jVar.d;
        z5.l.h(v6Var);
        v6Var.a(cVar);
        cVar.l = (o4) jVar.e;
    }

    @Override // p5.h
    public void c(p5.f fVar, int i10) {
        ag.j2 j2Var = new ag.j2(6, 4);
        j2Var.c = Integer.valueOf(i10);
        w6 w6Var = new w6(j2Var);
        a5.j jVar = this.a;
        a5.j.y(jVar, w6Var);
        v6 v6Var = (v6) jVar.d;
        z5.l.h(v6Var);
        v6Var.a((p5.c) fVar);
    }

    @Override // p5.h
    public /* bridge */ /* synthetic */ void d(p5.f fVar) {
    }

    @Override // p5.h
    public void e(p5.f fVar, int i10) {
        ag.j2 j2Var = new ag.j2(8, 4);
        j2Var.c = Integer.valueOf(i10);
        w6 w6Var = new w6(j2Var);
        a5.j jVar = this.a;
        a5.j.y(jVar, w6Var);
        jVar.B();
    }

    @Override // p5.h
    public void f(p5.f fVar, String str) {
        w6 w6Var = new w6(new ag.j2(4, 4));
        a5.j jVar = this.a;
        a5.j.y(jVar, w6Var);
        v6 v6Var = (v6) jVar.d;
        z5.l.h(v6Var);
        v6Var.a((p5.c) fVar);
        v6 v6Var2 = (v6) jVar.d;
        z5.l.h(v6Var2);
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

    @Override // p5.h
    public void g(p5.f fVar, int i10) {
        ag.j2 j2Var = new ag.j2(9, 4);
        j2Var.c = Integer.valueOf(i10);
        a5.j jVar = this.a;
        j2Var.d = Boolean.valueOf(((d) jVar.b).d == 2);
        a5.j.y(jVar, new w6(j2Var));
        jVar.B();
    }

    @Override // p5.h
    public /* bridge */ /* synthetic */ void h(p5.f fVar, boolean z10) {
        w6 w6Var = new w6(new ag.j2(4, 4));
        a5.j jVar = this.a;
        a5.j.y(jVar, w6Var);
        v6 v6Var = (v6) jVar.d;
        z5.l.h(v6Var);
        v6Var.a((p5.c) fVar);
    }

    @Override // p5.h
    public void j(p5.f fVar, int i10) {
        ag.j2 j2Var = new ag.j2(5, 4);
        j2Var.c = Integer.valueOf(i10);
        w6 w6Var = new w6(j2Var);
        a5.j jVar = this.a;
        a5.j.y(jVar, w6Var);
        jVar.B();
    }
}
