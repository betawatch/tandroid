package androidx.activity;

import androidx.fragment.app.a0;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
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
