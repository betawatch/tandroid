package androidx.activity;

import androidx.fragment.app.b0;

/* compiled from: r8-map-id-c0e607070f32dbde65005355ff6c489b77f9395a3e0f8720848e2402860dea84 */
/* loaded from: classes.dex */
public final class t implements c {
    public final b0 a;
    public final /* synthetic */ v b;

    public t(v vVar, b0 onBackPressedCallback) {
        kotlin.jvm.internal.i.e(onBackPressedCallback, "onBackPressedCallback");
        this.b = vVar;
        this.a = onBackPressedCallback;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [kotlin.jvm.internal.h, rd.a] */
    @Override // androidx.activity.c
    public final void cancel() {
        v vVar = this.b;
        hd.e eVar = vVar.b;
        b0 b0Var = this.a;
        eVar.remove(b0Var);
        if (kotlin.jvm.internal.i.a(vVar.c, b0Var)) {
            b0Var.a();
            vVar.c = null;
        }
        b0Var.b.remove(this);
        ?? r02 = b0Var.c;
        if (r02 != 0) {
            r02.invoke();
        }
        b0Var.c = null;
    }
}
