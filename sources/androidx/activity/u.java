package androidx.activity;

import androidx.fragment.app.z;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes.dex */
public final class u implements c {
    public final z a;
    public final /* synthetic */ w b;

    public u(w wVar, z onBackPressedCallback) {
        kotlin.jvm.internal.i.e(onBackPressedCallback, "onBackPressedCallback");
        this.b = wVar;
        this.a = onBackPressedCallback;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [kotlin.jvm.internal.h, ud.a] */
    @Override // androidx.activity.c
    public final void cancel() {
        w wVar = this.b;
        kd.e eVar = wVar.b;
        z zVar = this.a;
        eVar.remove(zVar);
        if (kotlin.jvm.internal.i.a(wVar.c, zVar)) {
            zVar.a();
            wVar.c = null;
        }
        zVar.b.remove(this);
        ?? r02 = zVar.c;
        if (r02 != 0) {
            r02.invoke();
        }
        zVar.c = null;
    }
}
