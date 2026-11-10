package androidx.activity;

import androidx.fragment.app.z;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes.dex */
public final class u implements c {
    public final z a;
    public final /* synthetic */ w b;

    public u(w wVar, z onBackPressedCallback) {
        kotlin.jvm.internal.j.e(onBackPressedCallback, "onBackPressedCallback");
        this.b = wVar;
        this.a = onBackPressedCallback;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [kotlin.jvm.internal.i, rd.a] */
    @Override // androidx.activity.c
    public final void cancel() {
        w wVar = this.b;
        hd.d dVar = wVar.b;
        z zVar = this.a;
        dVar.remove(zVar);
        if (kotlin.jvm.internal.j.a(wVar.c, zVar)) {
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
