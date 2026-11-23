package androidx.activity;

import androidx.fragment.app.a0;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes.dex */
public final class u implements c {
    public final a0 a;
    public final /* synthetic */ w b;

    public u(w wVar, a0 onBackPressedCallback) {
        kotlin.jvm.internal.j.e(onBackPressedCallback, "onBackPressedCallback");
        this.b = wVar;
        this.a = onBackPressedCallback;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [kotlin.jvm.internal.i, rd.a] */
    @Override // androidx.activity.c
    public final void cancel() {
        w wVar = this.b;
        hd.d dVar = wVar.b;
        a0 a0Var = this.a;
        dVar.remove(a0Var);
        if (kotlin.jvm.internal.j.a(wVar.c, a0Var)) {
            a0Var.a();
            wVar.c = null;
        }
        a0Var.b.remove(this);
        ?? r02 = a0Var.c;
        if (r02 != 0) {
            r02.invoke();
        }
        a0Var.c = null;
    }
}
