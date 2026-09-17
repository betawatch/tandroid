package androidx.activity;

import androidx.fragment.app.z;

/* compiled from: r8-map-id-e83daa4a3f4c5cc77b567d3f921056f729108399460aa18047e0e51e076a97b3 */
/* loaded from: classes.dex */
public final class v implements c {
    public final z a;
    public final /* synthetic */ x b;

    public v(x xVar, z onBackPressedCallback) {
        kotlin.jvm.internal.i.e(onBackPressedCallback, "onBackPressedCallback");
        this.b = xVar;
        this.a = onBackPressedCallback;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [kotlin.jvm.internal.h, rd.a] */
    @Override // androidx.activity.c
    public final void cancel() {
        x xVar = this.b;
        hd.e eVar = xVar.b;
        z zVar = this.a;
        eVar.remove(zVar);
        if (kotlin.jvm.internal.i.a(xVar.c, zVar)) {
            zVar.a();
            xVar.c = null;
        }
        zVar.b.remove(this);
        ?? r02 = zVar.c;
        if (r02 != 0) {
            r02.invoke();
        }
        zVar.c = null;
    }
}
