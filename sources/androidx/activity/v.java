package androidx.activity;

import androidx.fragment.app.a0;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes.dex */
public final class v implements c {
    public final a0 a;
    public final /* synthetic */ x b;

    public v(x xVar, a0 onBackPressedCallback) {
        kotlin.jvm.internal.i.e(onBackPressedCallback, "onBackPressedCallback");
        this.b = xVar;
        this.a = onBackPressedCallback;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [kotlin.jvm.internal.h, td.a] */
    @Override // androidx.activity.c
    public final void cancel() {
        x xVar = this.b;
        jd.e eVar = xVar.b;
        a0 a0Var = this.a;
        eVar.remove(a0Var);
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
