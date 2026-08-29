package androidx.activity;

import android.os.Bundle;
import androidx.fragment.app.j0;
import androidx.lifecycle.i0;
import java.util.ArrayList;
import java.util.HashMap;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final /* synthetic */ class e implements g2.d {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ e(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // g2.d
    public final Bundle a() {
        switch (this.a) {
            case 0:
                l lVar = (l) this.b;
                Bundle bundle = new Bundle();
                h hVar = lVar.w;
                hVar.getClass();
                HashMap hashMap = hVar.b;
                bundle.putIntegerArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_RCS", new ArrayList<>(hashMap.values()));
                bundle.putStringArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS", new ArrayList<>(hashMap.keySet()));
                bundle.putStringArrayList("KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS", new ArrayList<>(hVar.d));
                bundle.putBundle("KEY_COMPONENT_ACTIVITY_PENDING_RESULT", (Bundle) hVar.g.clone());
                return bundle;
            case 1:
                androidx.fragment.app.v vVar = (androidx.fragment.app.v) this.b;
                while (androidx.fragment.app.v.t(vVar.s())) {
                }
                vVar.G.e(androidx.lifecycle.m.ON_STOP);
                return new Bundle();
            case 2:
                return ((j0) this.b).Y();
            default:
                return i0.a((i0) this.b);
        }
    }
}
