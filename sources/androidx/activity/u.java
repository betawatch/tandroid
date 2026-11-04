package androidx.activity;

import androidx.fragment.app.a0;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class u implements c {
    public final a0 a;
    public final /* synthetic */ v b;

    public u(v vVar, a0 onBackPressedCallback) {
        kotlin.jvm.internal.j.e(onBackPressedCallback, "onBackPressedCallback");
        this.b = vVar;
        this.a = onBackPressedCallback;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [kotlin.jvm.internal.i, od.a] */
    @Override // androidx.activity.c
    public final void cancel() {
        v vVar = this.b;
        ed.e eVar = vVar.b;
        a0 a0Var = this.a;
        eVar.remove(a0Var);
        if (kotlin.jvm.internal.j.a(vVar.c, a0Var)) {
            a0Var.a();
            vVar.c = null;
        }
        a0Var.b.remove(this);
        ?? r02 = a0Var.c;
        if (r02 != 0) {
            r02.invoke();
        }
        a0Var.c = null;
    }
}
