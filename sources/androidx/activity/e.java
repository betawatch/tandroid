package androidx.activity;

import android.os.Bundle;
import androidx.fragment.app.j0;
import androidx.lifecycle.i0;
import java.util.ArrayList;
import java.util.HashMap;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes.dex */
public final /* synthetic */ class e implements w4.d {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ e(Object obj, int i7) {
        this.a = i7;
        this.b = obj;
    }

    @Override // w4.d
    public final Bundle c() {
        switch (this.a) {
            case 0:
                l lVar = (l) this.b;
                Bundle bundle = new Bundle();
                h hVar = lVar.x;
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
                vVar.L.e(androidx.lifecycle.m.ON_STOP);
                return new Bundle();
            case 2:
                return ((j0) this.b).Y();
            default:
                return i0.a((i0) this.b);
        }
    }
}
