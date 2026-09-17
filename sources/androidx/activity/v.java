package androidx.activity;

import androidx.fragment.app.z;

/* compiled from: r8-map-id-09da8b159cf36792e88674cebe3dc77c7407e16cea1bdebcb1e8ccd47061bd65 */
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
