package androidx.activity;

import androidx.fragment.app.b0;

/* compiled from: r8-map-id-eaaffe05e5b4975c35db95ddc7f057e1a9a0a254a43fe066fa0ad675f8b3973e */
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
