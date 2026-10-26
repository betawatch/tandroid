package androidx.activity;

import androidx.fragment.app.z;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
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
