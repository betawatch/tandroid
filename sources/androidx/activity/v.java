package androidx.activity;

import androidx.fragment.app.a0;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final class v implements c {
    public final a0 a;
    public final /* synthetic */ x b;

    public v(x xVar, a0 onBackPressedCallback) {
        kotlin.jvm.internal.i.e(onBackPressedCallback, "onBackPressedCallback");
        this.b = xVar;
        this.a = onBackPressedCallback;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [kotlin.jvm.internal.h, ld.a] */
    @Override // androidx.activity.c
    public final void cancel() {
        x xVar = this.b;
        bd.g gVar = xVar.b;
        a0 a0Var = this.a;
        gVar.remove(a0Var);
        if (kotlin.jvm.internal.i.a(xVar.c, a0Var)) {
            a0Var.a();
            xVar.c = null;
        }
        a0Var.b.remove(this);
        ?? r02 = a0Var.c;
        if (r02 != 0) {
            r02.invoke();
        }
        a0Var.c = null;
    }
}
