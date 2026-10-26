package androidx.activity;

import android.os.Bundle;
import androidx.fragment.app.i0;
import java.util.ArrayList;
import java.util.HashMap;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes.dex */
public final /* synthetic */ class e implements t4.d {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ e(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // t4.d
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
                androidx.fragment.app.u uVar = (androidx.fragment.app.u) this.b;
                while (androidx.fragment.app.u.t(uVar.s())) {
                }
                uVar.K.e(androidx.lifecycle.m.ON_STOP);
                return new Bundle();
            case 2:
                return ((i0) this.b).Y();
            default:
                return androidx.lifecycle.i0.a((androidx.lifecycle.i0) this.b);
        }
    }
}
